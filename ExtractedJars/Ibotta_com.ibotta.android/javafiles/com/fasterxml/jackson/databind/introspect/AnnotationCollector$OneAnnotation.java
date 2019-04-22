// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.io.Serializable;
import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotationCollector

public static class AnnotationCollector$OneAnnotation
	implements Annotations, Serializable
{

	public Annotation get(Class class1)
	{
		if(_type == class1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Class _type>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       13
			return _value;
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field Annotation _value>
	//    6   12:areturn         
		else
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
	}

	public boolean has(Class class1)
	{
		return _type == class1;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Class _type>
	//    2    4:aload_1         
	//    3    5:if_acmpne       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean hasOneOf(Class aclass[])
	{
		int j = aclass.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          29
			if(aclass[i] == _type)
	//*   8   10:aload_1         
	//*   9   11:iload_2         
	//*  10   12:aaload          
	//*  11   13:aload_0         
	//*  12   14:getfield        #27  <Field Class _type>
	//*  13   17:if_acmpne       22
				return true;
	//   14   20:iconst_1        
	//   15   21:ireturn         

	//   16   22:iload_2         
	//   17   23:iconst_1        
	//   18   24:iadd            
	//   19   25:istore_2        
	//*  20   26:goto            5
		return false;
	//   21   29:iconst_0        
	//   22   30:ireturn         
	}

	public int size()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final long serialVersionUID = 1L;
	private final Class _type;
	private final Annotation _value;

	public AnnotationCollector$OneAnnotation(Class class1, Annotation annotation)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		_type = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Class _type>
		_value = annotation;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field Annotation _value>
	//    8   14:return          
	}
}
