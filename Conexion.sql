ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password by 'root';
GRANT ALL PRIVILEGES ON * . * TO 'root'@'localhost';
FLUSH PRIVILEGES;