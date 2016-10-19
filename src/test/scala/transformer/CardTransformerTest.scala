package transformer

import model._
import org.scalatest.{FlatSpec, Matchers}

class CardTransformerTest extends FlatSpec with Matchers {

  "card transformer" should "return card NO_CARD when input proposal does not contains travel advantage" in {

    //Given
    val proposal: InputProposal = InputProposal(Seq(InputSegment(Seq(InputQuote(Seq.empty)))))

    //When
    val result: Proposal = CardTransformer.apply(proposal)

    //Then
    result shouldEqual Proposal(Passenger("NO_CARD"))

  }


}
