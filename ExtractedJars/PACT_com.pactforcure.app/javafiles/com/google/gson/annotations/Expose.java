// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.annotations;

import java.lang.annotation.Annotation;

public interface Expose
	extends Annotation
{

	public abstract boolean deserialize();

	public abstract boolean serialize();
}
