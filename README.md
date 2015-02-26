# cs56-github-jcapi-demo
TBD | pconrad | | Demo of http://github.jcabi.com/


You will need to manually create a subdirectory of the main repo
directory called "tokens", and in that file, create a text file
containing an OAuth token.  The next section describes how:

# Creating OAuth tokens

OAuth tokens are strings in hex that can be used in place of a
username/password to authenticate to Github.  They look like this
(this isn't a real one):

 8cb9d3cc3dd33f457f06f94835bc9c11a748c06d


For instructions on how to create an OAuth token, go to:

https://help.github.com/articles/creating-an-access-token-for-command-line-use/

This explains how to generate the token.

You want to create a token with the privilege level needed.

I suggest the following names, which are assumed in the example code:

* PublicOnly.txt  only read privileges on public repositories and resources
* ReadOnly.txt  only read privileges, but includes private repos, team memberships, etc.  It has all the privileges to "see" everything, but cannot make changes to anything.
* MostPrivleges.txt  all privileges EXCEPT the most dangerous ones: keys, hooks and deleting repos.


