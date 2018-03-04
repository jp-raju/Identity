

Description: A micro-service which allows A user to specify a path and get a list of metadata about each file in that directory. 
Automation is also implemented to check licence plate of a vehicle.

Instructions:

clone from: https://github.com/jp-raju/Idenity

run as maven project: mvn test (This will run Junit tests created for testing the API sevice and automation script.)

IDE : Import as existing maven project

1. 
API Request Example:

Method: GET

Url: http://localhost:8080/api/scan (configured by default to 8080)

NOTE:

User can specify using query parameter with the name path.

EXAMPLE:

http://localhost:8080/api/scan?path=src//main//resources

(Please escape backslashes in the specificed path like the example above)

Example REQUEST:

http://localhost:8080/api/scan?path=D:\\Data\\gitrepos\\qa\\automated_testing\\target\\allure-results

method: GET

(Response type: JSON)

Example RESPONSE:

[ { "filename": "5c92ca54-8b96-435e-bd59-0e29938a143c-attachment.png", "mimeType": "image/png", "fileSize": 38341, "fileExtention": "png" }, { "filename": "26c986de-83ec-4ade-8e88-1d097c24b1bb-attachment.png", "mimeType": "image/png", "fileSize": 85480, "fileExtention": "png" }, { "filename": "4745cc25-57ae-41e0-8d67-2c9d1245ab04-testsuite.xml", "mimeType": "text/xml", "fileSize": 4407, "fileExtention": "xml" } ]


2. To Update vehicle details for selenium scripts add/update data in feature file located in 'src/main/resources/features/Check_Vehicle_Details.feature'