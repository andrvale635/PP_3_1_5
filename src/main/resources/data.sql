INSERT INTO users (id, username, age, name, password) VALUES
(1,'admin',22,'alex','$2a$12$4iGTkYqgZahGjAZLW5GZLe3wJ0mAHSV/7am4MwuY.jskakoSLrRX2'),
(2,'user',23,'katy','$2a$12$4iGTkYqgZahGjAZLW5GZLe3wJ0mAHSV/7am4MwuY.jskakoSLrRX2');
INSERT INTO roles (id, role_name) VALUES (1, 'ROLE_USER'),(2, 'ROLE_ADMIN');
INSERT INTO users_roles (user_id, role_id) VALUES (1,1),(1,2),(2,1);