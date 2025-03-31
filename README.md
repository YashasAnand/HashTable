# HashTable
A simple hash table implementation in Java using chaining with generics and Maven.

# Overview
This project implements a hash table (or hashmap) using the chaining technique to resolve collisions. Each bucket in the underlying array holds a linked list of key-value pairs. The implementation leverages Java generics to support any data types for keys and values.

# Features
1) Chaining for Collision Resolution:
When two keys hash to the same bucket, a linked list is maintained for that bucket.

2) Generic Implementation:
The hash table is implemented with Java generics, allowing you to use any type for keys and values.

3) Maven-Based:
The project is set up as a Maven project, making dependency management and build processes straightforward.

# Project Structure
1) hashtable-impl project has main implementaation of hashmap
2) hashtable-app is the application layer which uses the CustomHashMap implementation'

# How to use

since hashtable-app will need the dependency of hashtable-impl project run the below command :-

mvn clean install

and we are good to go 🎉🎉

