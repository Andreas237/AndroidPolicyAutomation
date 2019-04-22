// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.annotation;

import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.databind.annotation:
//			JsonAppend

public static interface JsonAppend$Attr
	extends Annotation
{

	public abstract com.fasterxml.jackson.annotation.ude include();

	public abstract String propName();

	public abstract String propNamespace();

	public abstract boolean required();

	public abstract String value();
}
