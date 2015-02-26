package edu.ucsb.cs56.projects.github.jcapi_demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.jcabi.github.RtGithub;
import com.jcabi.github.Issues;
import com.jcabi.github.Issue;
import com.jcabi.github.Github;
import com.jcabi.github.Repos;
import com.jcabi.github.Repo;
import com.jcabi.github.User;
import com.jcabi.github.Coordinates;

public class Demo1 {

    public static String readAllBytes(String filename) throws Exception {
	return new String(Files.readAllBytes(Paths.get(filename))).trim();
    }
    
    public static void main(String[] args) throws Exception {
	String oauthToken = Demo1.readAllBytes("tokens/MostPrivileges.txt");
	Github github = new RtGithub(oauthToken);
	System.out.println("Github=" + github);
	Repos repos = github.repos();
	System.out.println("repos=" + repos);
	Repo repo = repos.get(new Coordinates.Simple("jcabi/jcabi-github"));
	Issues issues = repo.issues();
	Issue issue = issues.get(123);
	User author = new Issue.Smart(issue).author();
	System.out.println("author="+author);

    }
}


