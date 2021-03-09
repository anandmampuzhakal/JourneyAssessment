# Westpac NZ Technical Assessment.

Instructions: Using the endpoints available at https://jsonplaceholder.typicode.com/, display a list of posts along with the comments associated with each post. Feel free to use iOS or Android as well as any other libraries and frameworks of your choice. We don’t expect you to spend too long on this and aren’t expecting production ready code. What we are looking to understand is how you break down a problem, your thought process and how you structure your code amongst other things. If you would like to proceed, please complete the technical test and share the link with us by Monday, 15th March.


- User Story 1. As a user I would like to have a welcome screen. 
- User Story 2. As a user, I would like to have a provision to select different characters for the posts from this API (https://jsonplaceholder.typicode.com/users).
- User Story 3. As a user, I would like to see the individual posts with comments.
-      Task 3.1  individual posts must have a feature to get corresponding comments from the backend.
-      Task 3.2 Show the corresponding post`s comments in horizontal list view.


# Project designing

MVVM pattern can adopt for feature module posts and comments, also giving the provision to developers to opt for any type of patterns, like MVVM, MVP, Viper, MVC, etc.

It shows how to split an app in logical vertical slices, how to handle in-feature and across feature navigation (using navigation components), how each module can be tested and how to organize dependencies and build.gradle files. 

![Modularized architecture](https://github.com/anandmampuzhakal/CucumberTest/blob/main/readme/modularized_architecture.png)

Note that all code runs and executes, but the screens only contain data in xml preview. This means running the app provides a very "empty experience", but it also keeps the example simple and focused.

# Features 
This Module is intent to provide a template with basic MVVM architecture framework with task 
![MVVM pattern](https://github.com/anandmampuzhakal/CucumberTest/blob/main/readme/mvvmpattern.png)

Advantages:

- Simple, easy to read
- Use few libs, save time for gradle syncing
- No dagger or any other DI lib

## MVVM
Usually, a viwemodel can only aware the destroy of its owner in onClear() method. But after making it implements LifecycleObserver and observing owner's lifecycle in ViewModelProvider.Factory. It can use onCreate() or other lifecycle event now.
Check these codes in MVVMViewModelFactory.kt

## Login Welcome (Add-on)
![Welcome](https://github.com/anandmampuzhakal/WestpacAssessment/blob/master/readme/welcomescreen.png)

## Listing the different post writers
![List of registered users writers](https://github.com/anandmampuzhakal/WestpacAssessment/blob/master/readme/list_of_users.png)

## Empty posts
![Empty posts](https://github.com/anandmampuzhakal/WestpacAssessment/blob/master/readme/empty_post.png)

## Posts
![Posts list](https://github.com/anandmampuzhakal/WestpacAssessment/blob/master/readme/post_list.png)

## Posts with comments
![Posts list](https://github.com/anandmampuzhakal/WestpacAssessment/blob/master/readme/show_comments.png)

## Unit test get users screen. 
![Welcome unit test](https://github.com/anandmampuzhakal/WestpacAssessment/blob/master/readme/unittest.png)

## Flow test for capture a person’s detail. 
How to run the flow test for capture a person’s detail module.
![FlowTest test](https://github.com/anandmampuzhakal/WestpacAssessment/blob/master/readme/howtorun.png)

## Navigation feature. 
![Navigation config](https://github.com/anandmampuzhakal/WestpacAssessment/blob/master/readme/navigation.png)

## Project Scalability and features 
This project design giving the provision to developers to opt for any type of patterns, like MVVM, MVP, Viper, MVC, etc.

