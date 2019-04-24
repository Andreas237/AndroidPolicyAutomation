// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.annotation:
//			JsonSubTypes

public static interface JsonSubTypes$Type
	extends Annotation
{

	public abstract String name();

	public abstract Class value();
}
