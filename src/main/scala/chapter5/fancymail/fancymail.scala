// package fancymail.spam {
//   object MoreSpamWords {
//     val Casino = "Casino"
//     val Rolex = "Rolex"
//     val Poker = "Poker"
//   }
// }

// package fancymail.malware {
//     object MalwareDetector
// }

// package fancymail {
//   package spam {
//     object MoreSpamWords {
//       val Casino = "Casino"
//       val Rolex = "Rolex"
//       val Poker = "Poker"
//       Logger.info("MoreSpamWords initialised")
//     }
//   }
// } if you have multiple nested package like above you can simplify it like bellow


package fancymail
package spam 

object MoreSpamWords {
  val Casino = "Casino"
  val Rolex = "Rolex"
  val Poker = "Poker"
  fancymail.Logger.info("MoreSpamWords initialised")
}
