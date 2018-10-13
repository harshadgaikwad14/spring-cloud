# spring-cloud config server

Create the Git repository.
  - Next very important step is to create a local git repository. It can easily be converted to a remote repository later by configuring it’s URL in the properties file. We will place the external property file [configuration], which will be used by the Config server Microservice to provide the external configuration of properties. We need to follow the below steps to create a local git repository and check in sample properties files.

  - Make sure you have git shell installed in your machine and you can run git bash from command prompt. To verify it open command prompt and type git, if it recognize the command then you probably have the git prompt installed, if not please follow git website, download and install as per the instruction.
  - Now Create a directory config-server-repo in your Desktop.
  - Then create a file config-server-client.properties file in the config-server-repo directory and add the message there msg = Hello world - this is from config server.
  - Then create another file project1configserver1-client-development.properties file in the config-server-repo directory and add the message there msg = Hello world - this is from config server – Development environment.
  - Then create another file project1configserver1-client-production.properties file in the config-server-repo directory and add the message there msg = Hello world - this is from config server – Production environment.
  - Here we are maintaining same property name for different environment, as we generally maintain properties for different environments like urls, credentials, database details etc. Here the most important point is that we need to append hyphen (-) with the environment name in each property so that config server understands it. Also, we need to name the properties file with the config client service name that we will create after this.
  - Now open command prompt from config-server-repo directory and run command git init to make that directory as git repository.
  - Now run git add . to add everything to this repo.
  - Then finally we need to commit the properties file by running command git commit –m "initial checkin". This should check in all the files in the git repository. Here is the command prompt screen shot for the same.

Bootstrap.properties
  - server.port defines the port on which the embedded server will start.
  - spring.cloud.config.server.git.uri will bind the git location to look for the configuration. Here we are using local git repo but can be switched to remote got location by just changing this location.
  - management.security.enabled=false will disable the spring security on the management enpoints like /env, /refresh etc. This is for development settings, in production security should be enabled.

To Check Config Server
  - http://localhost:8888/project1configserver1-client/development
  - http://localhost:8888/project1configserver1-client/production