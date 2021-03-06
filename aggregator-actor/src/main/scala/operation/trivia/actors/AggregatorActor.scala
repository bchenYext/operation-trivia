package operation.trivia.actors

import akka.actor.Actor
import operation.trivia.entities.Player

import scala.collection.mutable.ArrayBuffer

class AggregatorActor extends Actor {
  private var currentCandidates:ArrayBuffer[(Player, Int, Long)] = ArrayBuffer.empty

  override def receive: Receive = {
    case s:String => println(s)
  }
}
