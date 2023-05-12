```bash
#!/bin/bash 
mysql -u root -p -e "CREATE DATABASE <your-schema-name>;"
mysql -u root -p -e "CREATE USER 'springroot'@'localhost' IDENTIFIED BY 'spring_mysql_123';" 
mysql -u root -p -e "GRANT ALL PRIVILEGES ON * . * TO 'springroot'@'localhost';"
```

This script uses the `mysql` command to execute SQL statements that create the `job_search` database, create the `springroot` user with the specified password, and grant all privileges to that user on all databases.

To use this script, follow these steps:

1.  Open a text editor and copy the script into a new file.
2.  Save the file with a `.sh` extension (e.g. `job_search_setup.sh`).
3.  Open a terminal window and navigate to the directory where you saved the script file.
4.  Run the command `chmod +x job_search_setup.sh` to make the script executable.
5.  Run the script by typing `./job_search_setup.sh` in the terminal and pressing Enter.
6.  Enter the MySQL root password when prompted.

After running the script, you should see output indicating that the database and user were created and the privileges were granted. You can now use the `springroot` user to connect to the `job_search` database from your Spring Boot application.

Be sure to secure the `springroot` user's password and use environment variables or a configuration file to store the database credentials in your application.