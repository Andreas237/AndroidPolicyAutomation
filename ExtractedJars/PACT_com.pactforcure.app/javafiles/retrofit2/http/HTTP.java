// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package retrofit2.http;

import java.lang.annotation.Annotation;

public interface HTTP
	extends Annotation
{

	public abstract boolean hasBody();

	public abstract String method();

	public abstract String path();
}