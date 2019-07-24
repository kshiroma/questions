package kshiroma0622.janken

object Main {

  val RESULT = Array("あいこ", "あなたの勝ち", "あなたの負け")
  private val DRAW = 0
  private val YOU_WIN = 1
  private val YOU_LOSE = 2

  private val KIND = Array("グー  ", "チョキ", "パー  ")
  private val ROCK = 0
  private val SCISSORS = 1
  private val PAPER = 2

  def main(args: Array[String]): Unit = {
    val format = "あなた %s , CPU %s ; %s"
    for (you: Int <- 0 until KIND.length; cpu <- 0 until KIND.length) {
      val result = judge(you, cpu)
      val m = format.format(KIND(you), KIND(cpu), RESULT(result))
      println(m)
    }
  }


  /**
    * あなた(you)が勝ちとなる結果を返す
    * あいこ(0)
    * 勝ち(1)
    * 負け(2)
    *
    * @param you あなたの手{グー(0),チョキ(1),パー(2)}
    * @param cup CPUの手{グー(0),チョキ(1),パー(2)}
    */
  def judge(you: Int, cpu: Int): Int = {
    //xに適切な値を入れてください。
    val x = -1
    return ((x - you) + cpu) % x;
  }

}
