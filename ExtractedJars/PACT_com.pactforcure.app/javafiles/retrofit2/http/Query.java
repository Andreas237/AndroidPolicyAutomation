// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package retrofit2.http;

import java.lang.annotation.Annotation;

public interface Query
	extends Annotation
{

	public abstract boolean encoded();

	public abstract String value();
}
