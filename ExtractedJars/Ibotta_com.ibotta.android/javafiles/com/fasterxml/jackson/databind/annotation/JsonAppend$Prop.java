// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.annotation;

import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.databind.annotation:
//			JsonAppend

public static interface JsonAppend$Prop
	extends Annotation
{

	public abstract com.fasterxml.jackson.annotation.ude include();

	public abstract String name();

	public abstract String namespace();

	public abstract boolean required();

	public abstract Class type();

	public abstract Class value();
}
