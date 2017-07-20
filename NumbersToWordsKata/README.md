# NumbersToWordsKata

A code kata that converts numbers to words using TDD implemented during a coding dojo.

http://codingdojo.org/kata/NumbersInWords/

[![Build Status](https://travis-ci.org/AdvancedProgrammingWithJavaSummer2017/NumbersToWordsKata.svg?branch=master)](https://travis-ci.org/AdvancedProgrammingWithJavaSummer2017/NumbersToWordsKata)

## When we start the coding dojo

Find a partner to pair program with.  Make sure that at least one of you has a GitHub account.  @DavidWhitlock will tell you how to join the organization.

Make a clone (not a fork) of this repository

```
$ git clone git@github.com:AdvancedProgrammingWithJavaSummer2017/NumbersToWordsKata.git
```

Make sure that you can build the project:

```
$ cd NumbersToWordsKata/number2words
$ mvn clean verify
```

As other pairs commit and push to the repository, make sure that you can pull their changes.

```
$ git pull
```

(You can also pull through IntelliJ.)

## When you're "on deck" for the coding dojo

Join the Google Hangout so that we can all see your screen.

Get one of the USB keyboards, if you'd like.

Pull from GitHub to get the latest changes.

Add your name to the list of "developers" in the [pom.xml](https://github.com/AdvancedProgrammingWithJavaSummer2017/NumbersToWordsKata/blob/master/number2words/pom.xml).

```
    <developer>
      <id>YOU</id>
      <name>Your name here</name>
      <email>you@youremail.com</email>
      <url>http://www.cs.pdx.edu/~YOU</url>
      <organization>PSU Department of Computer Science</organization>
      <organizationUrl>http://www.cs.pdx.edu</organizationUrl>
      <roles>
        <role>Student</role>
      </roles>
      <timezone>-7</timezone>
    </developer>
```

Commit and push this change to pom.xml to the repository.  You will need to be a member of the group to do this.

## When its your turn to be in front of the dojo

Pull from GitHub to get the latest changes and make sure all of the code builds.

```
$ git pull  # Or pull through IntelliJ
$ mvn clean verify
```

With your partner, talk about the next test case that you'll implement.  Feel free to engage the rest of the class in a discussion of the appropriateness of the test case.

Do Test-Driven Development do implement a small step in the kata.

(Meanwhile, we will identify the next pair and put them "on deck".)
