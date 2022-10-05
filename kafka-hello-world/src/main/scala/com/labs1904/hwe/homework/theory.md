# Overview

Kafka has many moving pieces, but also has a ton of helpful resources to learn available online. In this homework, your
challenge is to write answers that make sense to you, and most importantly, **in your own words!**
Two of the best skills you can get from this class are to find answers to your questions using any means possible, and to
reword confusing descriptions in a way that makes sense to you. 

### Tips
* You don't need to write novels, just write enough that you feel like you've fully answered the question
* Use the helpful resources that we post next to the questions as a starting point, but carve your own path by searching on Google, YouTube, books in a library, etc to get answers!
* We're here if you need us. Reach out anytime if you want to ask deeper questions about a topic 
* This file is a markdown file. We don't expect you to do any fancy markdown, but you're welcome to format however you like

### Your Challenge
1. Create a new branch for your answers 
2. Complete all of the questions below by writing your answers under each question
3. Commit your changes and push to your forked repository

## Questions
#### What problem does Kafka help solve? Use a specific use case in your answer 
* Helpful resource: [Confluent Motivations and Use Cases](https://youtu.be/BsojaA1XnpM)

Kafka helps streaming data systems to be fast and accurate. The most common example is banking and the improvements with mobile and internet banking processes. Another good example are cellphone notifications, from connected devices for event-driven apps like a code sent to a phone for 2 factor authentication.

#### What is Kafka?
* Helpful resource: [Kafka in 6 minutes](https://youtu.be/Ch5VhJzaoaI) 

It is a message queue system that transmits messages containing data from a system A (producer) that creates the data on to a consumer B which ingests said data. This can be used across industries and use cases such as banking transactions and "real-time" event messages ie: weather or medical data.


#### Describe each of the following with an example of how they all fit together: 
 * Topic - A group of several partitions sending similar data ex: 2 partitions are sending flight data to air traffic controllers are a topic. A third  partition sending airline fuel reserve updates to a logistics team would not be part of the same topic.
 * Producer - Application or system generating messages, these are often a data streaming system transmitting a message containing data or the need for action.
 * Consumer - Application or system reading message (often ingesting data) and taking some action.
 * Broker - A server with several partitions. Generally a Kafka instance has about 3 brokers.
 * Partition - An individual message queue, which applications can explictly assign to a record to ensure a certain order is followed, if needed.

#### Describe Kafka Producers and Consumers

A producer creates the message to be delivered by Kafka to a consumer who reads that message in order to take an action. An example is an IOT device sending physical activity information to a health app consumer, that will then use that data to update their dashboards and user health summaries or exercise recommendations.

#### How are consumers and consumer groups different in Kafka? 

A consumer receives a messages from a partition, consumer groups are a collection of consumers that read the same topic but from unique partitions.

* Helpful resource: [Consumers](https://youtu.be/lAdG16KaHLs)
* Helpful resource: [Confluent Consumer Overview](https://youtu.be/Z9g4jMQwog0)

#### How are Kafka offsets different than partitions? 

An offset is an individual message that is assigned to a specific partition.
The offset stays within the partition until it is sent off, an example I can think of is like a car inside a tunnel.

#### How is data assigned to a specific partition in Kafka? 

An application can establish that using a partition key if message ordering is important (ex online bank transfer - reduction from account A should happen prior to debit into account B in case of lack of funds). Otherwise Kafka assigns partitions to a message at random.

#### Describe immutability - Is data on a Kafka topic immutable? 

Yes, a topic is immutable because a message cannot be edited or removed from the queue once partitioned.
There may be a failure in the delivery or reading of a message, but it's content itself cannot be changed or ammended.


#### How is data replicated across brokers in kafka? If you have a replication factor of 3 and 3 brokers, explain how data is spread across brokers
* Helpful resource [Brokers and Replication factors](https://youtu.be/ZOU7PJWZU9w)

Data (topics) are replicated to other brokers as a precaution. 
Replication of 3 across 3 brokers means each topic will have a copy within each broker, with only 1 of those being the leader. The additional 2 replicas will never deploy unless there is a failure or outage.

#### What was the most fascinating aspect of Kafka to you while learning? 

Its compute power - it can write/transmit an insane amount of messages
