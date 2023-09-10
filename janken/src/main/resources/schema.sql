CREATE TABLE IF NOT EXISTS jankenhouses (
     id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
     janken_myself VARCHAR(50),  
     janken_pc VARCHAR(50),
     result VARCHAR(50),
     memo VARCHAR(255)     
  
 );