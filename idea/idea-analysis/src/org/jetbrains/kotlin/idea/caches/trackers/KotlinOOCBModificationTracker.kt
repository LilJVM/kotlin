/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.caches.trackers

import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ModuleRootManager
import com.intellij.openapi.roots.ProjectRootModificationTracker
import com.intellij.openapi.util.ModificationTracker
import com.intellij.psi.util.CachedValueProvider
import com.intellij.psi.util.PsiModificationTracker
import com.intellij.util.CommonProcessors
import org.jetbrains.kotlin.idea.caches.project.cached

class KotlinOOCBModificationTracker(val project: Project) : ModificationTracker {
    override fun getModificationCount(): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}