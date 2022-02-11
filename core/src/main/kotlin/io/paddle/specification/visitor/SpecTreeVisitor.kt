package io.paddle.specification.visitor

import io.paddle.specification.tree.*

interface SpecTreeVisitor<R, D> {
    fun visit(integerNode: IntegerSpecTreeNode, ctx: D): R

    fun visit(booleanNode: BooleanSpecTreeNode, ctx: D): R

    fun visit(stringNode: StringSpecTreeNode, ctx: D): R

    fun visit(arrayNode: ArraySpecTreeNode, ctx: D): R

    fun visit(compositeNode: CompositeSpecTreeNode, ctx: D): R
}