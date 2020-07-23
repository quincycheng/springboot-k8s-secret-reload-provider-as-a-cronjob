#!/bin/bash

# Generate random secret (done by CyberArk CPM in production)
secretVal=$(openssl rand -hex 12 | tr -d '\r\n')

# update DAP secret
conjur variable values add \
   pas_dev/app/cityapp-safe/Database-Oracle-10.0.0.20-cityapp/password \
   ${secretVal}

# update Oracle DB secret

sqlplus system/Cyberark1@10.0.0.20 << EOF

alter user cityapp identified by ${secretVal};

exit

EOF
