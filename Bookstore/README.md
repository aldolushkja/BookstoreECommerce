# Bookstore ECommerce

Bookstore application created with SpringBoot and HTML5

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

```
1. Java 8+
2. Maven 3.5+
3. Docker 18.+
4. MySQL
```

### Installing

```
mvn clean install 
```
## Running the tests

```
mvn test
```

## Deployment

1. Create a docker image
```
mvn compile jib:build
```
2. Run MySQL daemon
```
docker run -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=task -d mysql:5.7.25
```
3. Create a bash inside MySQL Docker container 
```
docker exec -it mysql bash -l
```
4. Open mysql session
```
mysql -u root -ppassword
```
5. Execute image
```
docker run -p 8080:8080 --name ecommerce -d bookstore
```


## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Aldo Lushkja**

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
