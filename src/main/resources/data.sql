INSERT INTO USERS (ID, USERNAME, NAME) VALUES (01, 'jesse', 'Jesse');
INSERT INTO USERS (ID, USERNAME, NAME) values (02, 'abc', 'ABC');
INSERT INTO USERS (ID, USERNAME, NAME) values (03, 'cbs', 'CBS');
INSERT INTO USERS (ID, USERNAME, NAME) values (04, 'nbc', 'NBC');

INSERT INTO SUBSCRIPTIONS (USER_ID, PUBLISHER_ID) VALUES (01, 02);
INSERT INTO SUBSCRIPTIONS (USER_ID, PUBLISHER_ID) VALUES (01, 03);
INSERT INTO SUBSCRIPTIONS (USER_ID, PUBLISHER_ID) VALUES (01, 04);

INSERT INTO ITEMS (TITLE, SUMMARY, CONTENT, PUBLISH_DATE_TIME, PUBLISHER_ID) VALUES ('ABC Story 1', 'Summary for ABC story 1', '<html><head><title>Story 1 from ABC</title></head><body>Loorem ipsum...</body></html>', '2017-11-01 10:00:00', 02);
INSERT INTO ITEMS (TITLE, SUMMARY, CONTENT, PUBLISH_DATE_TIME, PUBLISHER_ID) VALUES ('ABC Story 2', 'Summary for ABC story 2', '<html><head><title>Story 2 from ABC</title></head><body>Loorem ipsum...</body></html>', '2017-11-01 22:00:00', 02);
INSERT INTO ITEMS (TITLE, SUMMARY, CONTENT, PUBLISH_DATE_TIME, PUBLISHER_ID) VALUES ('CBS Story 1', 'Summary for CBS story 1', '<html><head><title>Story 1 from CBS</title></head><body>Loorem ipsum...</body></html>', '2017-11-01 11:00:00', 03);
INSERT INTO ITEMS (TITLE, SUMMARY, CONTENT, PUBLISH_DATE_TIME, PUBLISHER_ID) VALUES ('CBS Story 2', 'Summary for CBS story 2', '<html><head><title>Story 2 from CBS</title></head><body>Loorem ipsum...</body></html>', '2017-11-01 21:00:00', 03);
INSERT INTO ITEMS (TITLE, SUMMARY, CONTENT, PUBLISH_DATE_TIME, PUBLISHER_ID) VALUES ('NBC Story 1', 'Summary for NBC story 1', '<html><head><title>Story 1 from NBC</title></head><body>Loorem ipsum...</body></html>', '2017-11-01 12:00:00', 04);
INSERT INTO ITEMS (TITLE, SUMMARY, CONTENT, PUBLISH_DATE_TIME, PUBLISHER_ID) VALUES ('NBC Story 2', 'Summary for NBC story 2', '<html><head><title>Story 2 from NBC</title></head><body>Loorem ipsum...</body></html>', '2017-11-01 20:00:00', 04);

