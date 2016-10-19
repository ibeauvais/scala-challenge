package model

case class InputProposal(segments:Seq[InputSegment])

case class InputSegment(quote:Seq[InputQuote])

case class InputQuote(travelAdvantage: Seq[String])




