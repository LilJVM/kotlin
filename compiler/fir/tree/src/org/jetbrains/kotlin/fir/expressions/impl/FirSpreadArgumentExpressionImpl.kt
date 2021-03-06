/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.expressions.impl

import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.fir.FirElement
import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.expressions.FirExpression
import org.jetbrains.kotlin.fir.expressions.FirSpreadArgumentExpression
import org.jetbrains.kotlin.fir.transformSingle
import org.jetbrains.kotlin.fir.types.FirTypeRef
import org.jetbrains.kotlin.fir.visitors.FirTransformer

class FirSpreadArgumentExpressionImpl(
    session: FirSession,
    psi: PsiElement?,
    override var expression: FirExpression
) : FirSpreadArgumentExpression, FirAbstractExpression(session, psi) {
    override var typeRef: FirTypeRef
        get() = super<FirSpreadArgumentExpression>.typeRef
        set(_) {}

    override fun <D> transformChildren(transformer: FirTransformer<D>, data: D): FirElement {
        expression = expression.transformSingle(transformer, data)
        return super<FirAbstractExpression>.transformChildren(transformer, data)
    }
}