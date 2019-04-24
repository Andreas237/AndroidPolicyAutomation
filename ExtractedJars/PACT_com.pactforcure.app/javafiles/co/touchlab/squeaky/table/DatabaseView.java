// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.table;

import java.lang.annotation.Annotation;

public interface DatabaseView
	extends Annotation
{

	public abstract String viewName();
}
