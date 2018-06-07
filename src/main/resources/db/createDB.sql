DROP TABLE IF EXISTS CAR;
CREATE  TABLE CAR (
   ID  INT  NOT NULL AUTO_INCREMENT
   ,LICENSE_PLATE VARCHAR(20) NOT NULL
   ,MANUFACTURER VARCHAR(20) NOT NULL
   ,MANUFACTURE_DATE DATE NOT NULL
   ,AGE INT NOT NULL DEFAULT 0
   ,VERSION INT NOT NULL DEFAULT 0
   ,UNIQUE (LICENSE_PLATE)
   ,PRIMARY KEY (ID)
);

INSERT INTO CAR (LICENSE_PLATE, MANUFACTURER, MANUFACTURE_DATE) VALUES ('1_plate', '1_man', '1980-07-30');
INSERT INTO CAR (LICENSE_PLATE, MANUFACTURER, MANUFACTURE_DATE) VALUES ('2_plate', '2_man', '1990-07-30');
INSERT INTO CAR (LICENSE_PLATE, MANUFACTURER, MANUFACTURE_DATE) VALUES ('3_plate', '3_man', '1999-07-30');

