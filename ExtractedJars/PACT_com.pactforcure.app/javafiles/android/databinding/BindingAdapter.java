// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import java.lang.annotation.Annotation;

public interface BindingAdapter
	extends Annotation
{

	public abstract boolean requireAll();

	public abstract String[] value();
}
