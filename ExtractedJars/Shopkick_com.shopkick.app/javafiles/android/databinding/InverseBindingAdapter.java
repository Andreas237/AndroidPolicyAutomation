// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import java.lang.annotation.Annotation;

public interface InverseBindingAdapter
	extends Annotation
{

	public abstract String attribute();

	public abstract String event();
}
