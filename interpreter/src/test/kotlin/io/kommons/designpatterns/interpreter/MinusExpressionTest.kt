package io.kommons.designpatterns.interpreter

import org.junit.jupiter.params.provider.Arguments
import java.util.stream.Stream

class MinusExpressionTest: ExpressionTest<MinusExpression>("-", ::MinusExpression) {

    override fun expressionProvider(): Stream<Arguments> =
        prepareParameters { left, right -> left - right }

}