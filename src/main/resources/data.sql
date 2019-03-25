INSERT INTO USER (USERNAME,EMAIL,PHONE_NUMBER) VALUES ('Jackson Harris', 'jharris@live.com.au','0490134244');
INSERT INTO USER (USERNAME,EMAIL,PHONE_NUMBER) VALUES ('Lucy Denda', 'ldenda@live.com.au','0550134244');
INSERT INTO USER (USERNAME,EMAIL,PHONE_NUMBER) VALUES ('Kenji Walter', 'kwalter@live.com.au','0490244224');

INSERT INTO BOOK (TITLE,AUTHOR,ISBN) VALUES ('Harry potter and the Philosphers stone', 'J.K. Rowling','3525234124');
INSERT INTO BOOK (TITLE,AUTHOR,ISBN) VALUES ('The horse and his boy', 'C.S Lewis','6323424632');
INSERT INTO BOOK (TITLE,AUTHOR,ISBN) VALUES ('The Two Towers', 'J.R.R Tolkien','849274928');

INSERT INTO LOAN (USER_ID,BOOK_ID) VALUES((SELECT USER_ID FROM USER u WHERE u.EMAIL = 'jharris@live.com.au'),(SELECT BOOK_ID FROM BOOK b WHERE b.ISBN = '849274928'));