0. generate google account
    socialmcdev01@gmail.com
    - sign up github
    - create project repository [admin-sample]
    - import as project

1. install jdk
- scoop in windows
<pre><code>echo %JAVA_HOME%
java -version</code></pre>

2. gradle
    - maven
<pre><code>echo %GRADLE_HOME%
gradle -version
cd admin-sample
gradle init --type java-library</code></pre>

3. spring boot
<pre><code># setup build.gradle.
gradle eclipse
notepad .gitignore # > add .gradle, /build/ 
open project with STS
</code></pre>

4. web mvc, rest controller
 - create index.html
 - access localhost:8080
 - rest controller

5. data jpa with h2
    - mysql
<pre><code>h2 db</code></pre>


# TODO

6. spring security
7. thymeleaf
    - jsp
    - velocity
    - freemarker
    - react
8. layout template
9. git

10. web
    - jquery
    - bootstrap
    - ajax sample

11. jenkins
12. redmine