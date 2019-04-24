// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.annotation.compiler;

import java.lang.annotation.Annotation;

interface Index
	extends Annotation
{

	public abstract String[] extensions();

	public abstract String[] modules();
}
