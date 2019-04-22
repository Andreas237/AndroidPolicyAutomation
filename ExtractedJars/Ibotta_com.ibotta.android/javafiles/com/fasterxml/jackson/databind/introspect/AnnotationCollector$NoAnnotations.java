// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.io.Serializable;
import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotationCollector

public static class AnnotationCollector$NoAnnotations
	implements Annotations, Serializable
{

	public Annotation get(Class class1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean has(Class class1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean hasOneOf(Class aclass[])
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int size()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static final long serialVersionUID = 1L;

	AnnotationCollector$NoAnnotations()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
