# monitoring-system

** Build & Run

(1) Execute and run monitoring-system.sql in mysql database </br>
(2) Build project via maven, mvn clean install </br>
(3) Run generated jar file, java -jar monitoring-system.jar </br>
(4) Refer available endpoints, Ex :- http://localhost:8080/swagger-ui/ </br>
(5) Refer wiki, https://github.com/sashikab85/monitoring-system/wiki </br>


** how to use endpoint(s)

(1) Try out signup endpoint for create user(s) </br>
(2) Use login end point generate jwt token , https://github.com/sashikab85/monitoring-system/wiki </br>
(3) Use header values for each endpoint request, https://github.com/sashikab85/monitoring-system/wiki </br>
(4) Change role table manually in database, if need ROLE_ADMIN or ROLE_COACH ---- > [default role is ROLE_PLAYER] </br>


Requirements:

(1) All 3 types of users can login to the site and logout. Upon login they will view the scoreboard, which will display all games and final scores, and will reflect how the   competition progressed and who won </br>

(2) A coach may select his team in order to view a list of the players on it, and the average score of the team. When one of the players in the list is selected, his personal details will be presented, including - player’s name, height, average score, and the number of games he participated in </br>

(3) A coach can filter players to see only the ones whose average score is in the 90 percentile across the team </br>

(4) The league admin may view all teams details - their average scores, their list of players, and players details </br>

(5) The admin can also view the statistics of the site’s usage - number of times each user logged into the system, the total amount of time each user spent on the site, and who is currently online. (i.e. logged into the site) </br>


TODO(S) :

(1) Add globale exception handling </br>
(2) Add password encription </br>
(3) Add unit testing </br>
