

Description: A microservie which allows A user to specify a path and get a list of metadata about each file in that directory.

Instructions:

clone from: https://github.com/jp-raju/Idenity

run as maven spring project: mvn spring-boot:run

IDE : Import as existing maven project

Request Example:

Method: GET

Url: http://localhost:8080/api/scan (configured by default to 8080)

NOTE:

User can specifcy using query paramater with the name path.

EXAMPLE:

http://localhost:8080/api/scan?path=http://localhost:8080/api/scan?path=D:\\Data\\gitrepos\\qa\\automated_testing\\target\\allure-results

(Please escape backslashes in the specificed path like the example above)

Example REQUEST:

http://localhost:8080/api/scan?path=http://localhost:8080/api/scan?path=D:\\Data\\gitrepos\\qa\\automated_testing\\target\\allure-results

method: GET

(Response type: JSON)

Example RESPONSE:

[ { "filename": "5c92ca54-8b96-435e-bd59-0e29938a143c-attachment.png", "mimeType": "image/png", "fileSize": 38341, "fileExtention": "png" }, { "filename": "26c986de-83ec-4ade-8e88-1d097c24b1bb-attachment.png", "mimeType": "image/png", "fileSize": 85480, "fileExtention": "png" }, { "filename": "4745cc25-57ae-41e0-8d67-2c9d1245ab04-testsuite.xml", "mimeType": "text/xml", "fileSize": 4407, "fileExtention": "xml" } ]