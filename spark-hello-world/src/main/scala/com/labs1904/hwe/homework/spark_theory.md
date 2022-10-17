# Overview

Similar to the work you did for Kafka, this is your crash course into Spark through different questions. In this homework, your
challenge is to write answers that make sense to you, and most importantly, **in your own words!**
Two of the best skills you can get from this class are to find answers to your questions using any means possible, and to
reword confusing descriptions in a way that makes sense to you. 

### Tips
* You don't need to write novels, just write enough that you feel like you've fully answered the question
* Use the helpful resources that we post next to the questions as a starting point, but carve your own path by searching on Google, YouTube, books in a library, etc to get answers!
* We're here if you need us. Reach out anytime if you want to ask deeper questions about a topic 
* This file is a markdown file. We don't expect you to do any fancy markdown, but you're welcome to format however you like
* Spark By Examples is a great resources to start with - [Spark By Examples](https://sparkbyexamples.com/)

### Your Challenge
1. Create a new branch for your answers 
2. Complete all of the questions below by writing your answers under each question
3. Commit your changes and push to your forked repository

## Questions
#### What problem does Spark help solve? Use a specific use case in your answer 
* Helpful resource: [Apache Spark Use Cases](https://www.toptal.com/spark/introduction-to-apache-spark)
* [Overivew of Apache Spark](https://www.youtube.com/watch?v=znBa13Earms&t=42s)

  * Spark is a platform for large-scale data processing and transformations, it is specially performant in data streaming cases

#### What is Apache Spark?
* Helpful resource: [Spark Overview](https://www.youtube.com/watch?v=ymtq8yjmD9I)
  * Spark is a data processing platform created to overcome processing limitations of mapreduce.

#### What is distributed data processing? How does it relate to Apache Spark?  
[Apache Spark for Beginners](https://medium.com/@aristo_alex/apache-spark-for-beginners-d3b3791e259e)

Distributed processing is the way Spark processes and later transforms data. It allows different nodes to work on portions of data processing, making Spark faster than previous options.

#### On the physical side of a spark cluster, you have a driver and executors. Define each and give an example of how they work together to process data
Driver - Creates action plan of required tasks, calls on cluster manager (DAG) to distribute tasks across executors
Executor - Worker nodes that carry out assigned tasks

#### Define each and explain how they are different from each other 
* RDD (Resilient Distributed Dataset) - Read-only objects spread across clusters, occurs in-memory, basis of parallel processing
* DataFrame - A way to present data in rows/columns, desired format for analysing data in OTP systems
* DataSet - The collection of data used to create a dataframe

#### What is a spark transformation?
[Spark By Examples-Transformations](https://sparkbyexamples.com/apache-spark-rdd/spark-rdd-transformations/)
Transformations create a copy of a dataframe with an edit (transformation) but does not return anything unless actions are called

#### What is a spark action? How do actions differ from transformations? 
An action (count, filter, groupby, etc) returns a value or values 

#### What is a partition in spark? Why would you ever need to repartition? 
[Spark Partitioning](https://sparkbyexamples.com/spark/spark-repartition-vs-coalesce/)
A Spark partition is a way to section off parts of the work to specific clusters to minimize required time and compute. 
It allows Spark to perform more efficiently and can reduce costs.

#### What was the most fascinating aspect of Spark to you while learning? 
How long it has been around & the fact it is still considered top of the line.
