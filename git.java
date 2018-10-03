HELLO GIT

GIT Commands:-
git init					- Initializes the repository

git add <filename>				- tracks the file

git add .					- track all the files in the folder

git status					- gives the status of the git

git config					- for configuration

git config --local user.name "<name here>"	- set the user.name
git config --local user.name			- displays the user.name

git config --local user.email "<email here>"	- sets the user.name
git config --local user.email			- displays the user.email

The use of local/global/system options :-
    --global              use global config file
    --system              use system config file
    --local               use repository config file

git commit -m "<Enter the message>"		- to do a commit

git remote add origin "https://...........git"	- to link the *.git to the repository

git push -u origin master			- to push the changes to the repository

git remote show origin				- displays the origin/git URL