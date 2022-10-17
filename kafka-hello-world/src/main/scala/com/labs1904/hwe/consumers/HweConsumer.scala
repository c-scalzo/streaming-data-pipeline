package com.labs1904.hwe.consumers

import com.labs1904.hwe.producers.SimpleProducer
import com.labs1904.hwe.util.Util
import com.labs1904.hwe.util.Util.{getScramAuthString, mapNumberToWord}
import net.liftweb.json.DefaultFormats
import org.apache.kafka.clients.consumer.{ConsumerConfig, ConsumerRecord, ConsumerRecords, KafkaConsumer}
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}
import org.apache.kafka.common.serialization.StringDeserializer

import java.time.Duration
import java.util.{Arrays, Properties, UUID}
case class RawUser(id: Int, username : String, name: String, gender: String, email: String, birthday: String)
case class EnrichedUser(rawuser: RawUser, numberAsWord: String  , hweDeveloper: String)
object HweConsumer {
  val BootstrapServer : String = "b-3-public.hwekafkacluster.6d7yau.c16.kafka.us-east-1.amazonaws.com:9196,b-2-public.hwekafkacluster.6d7yau.c16.kafka.us-east-1.amazonaws.com:9196,b-1-public.hwekafkacluster.6d7yau.c16.kafka.us-east-1.amazonaws.com:9196"
  val consumerTopic: String = "question-1-updated"
  val producerTopic: String = "question-1-output"
  val username: String = "1904labs"
  val password: String = "1904labs"
  //Use this for Windows
//  val trustStore: String = "/Users/carol/Desktop/DE-HourswE/Kafka_Week3/kafka-hello-world/src/main/resources/kafka.client.truststore.jks"
  //Use this for Mac
  val trustStore: String = "/Users/carol/Desktop/DE-HourswE/Kafka_Week3/kafka-hello-world/src/main/resources/kafka.client.truststore.jks"

  implicit val formats: DefaultFormats.type = DefaultFormats

  def main(args: Array[String]): Unit = {

    // Create the KafkaConsumer
    val consumerProperties = SimpleConsumer.getProperties(BootstrapServer)
    val consumer: KafkaConsumer[String, String] = new KafkaConsumer[String, String](consumerProperties)

    // Create the KafkaProducer
    val producerProperties = SimpleProducer.getProperties(BootstrapServer)
    val producer = new KafkaProducer[String, String](producerProperties)

    // Subscribe to the topic
    consumer.subscribe(Arrays.asList(consumerTopic))

    while ( {
      true
    }) {
      // poll for new data
      val duration: Duration = Duration.ofMillis(100)
      val records: ConsumerRecords[String, String] = consumer.poll(duration)

      records.forEach((record: ConsumerRecord[String, String]) => {
        // Retrieve the message from each record
        val message = record.value()
        val userValues = message.split("\t")
        val userDetails = RawUser(userValues(0).toInt, userValues(1), userValues(2), userValues(3), userValues(4), userValues(5))
        val enrichedDetails = EnrichedUser(userDetails, mapNumberToWord(userDetails.id), "Carolina and Joe")
        println(s"Message Received: $enrichedDetails")

        val enrichedCsv =

      })
    }
  }
}