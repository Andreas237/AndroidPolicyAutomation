// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package javax.annotation.meta;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;

public interface TypeQualifierDefault
	extends Annotation
{

	public abstract ElementType[] value();
}
