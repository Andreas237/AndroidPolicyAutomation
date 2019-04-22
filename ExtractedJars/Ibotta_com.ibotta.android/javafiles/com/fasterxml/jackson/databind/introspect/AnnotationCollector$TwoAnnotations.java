// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.io.Serializable;
import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotationCollector

public static class AnnotationCollector$TwoAnnotations
	implements Annotations, Serializable
{

	public Annotation get(Class class1)
	{
		if(_type1 == class1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field Class _type1>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       13
			return _value1;
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field Annotation _value1>
	//    6   12:areturn         
		if(_type2 == class1)
	//*   7   13:aload_0         
	//*   8   14:getfield        #33  <Field Class _type2>
	//*   9   17:aload_1         
	//*  10   18:if_acmpne       26
			return _value2;
	//   11   21:aload_0         
	//   12   22:getfield        #35  <Field Annotation _value2>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	public boolean has(Class class1)
	{
		return _type1 == class1 || _type2 == class1;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _type1>
	//    2    4:aload_1         
	//    3    5:if_acmpeq       21
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field Class _type2>
	//    6   12:aload_1         
	//    7   13:if_acmpne       19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	public boolean hasOneOf(Class aclass[])
	{
		int j = aclass.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j;)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          45
		{
			Class class1 = aclass[i];
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:astore          4
			if(class1 != _type1 && class1 != _type2)
	//*  12   15:aload           4
	//*  13   17:aload_0         
	//*  14   18:getfield        #29  <Field Class _type1>
	//*  15   21:if_acmpeq       43
	//*  16   24:aload           4
	//*  17   26:aload_0         
	//*  18   27:getfield        #33  <Field Class _type2>
	//*  19   30:if_acmpne       36
	//*  20   33:goto            43
				i++;
	//   21   36:iload_2         
	//   22   37:iconst_1        
	//   23   38:iadd            
	//   24   39:istore_2        
			else
	//*  25   40:goto            5
				return true;
	//   26   43:iconst_1        
	//   27   44:ireturn         
		}

		return false;
	//   28   45:iconst_0        
	//   29   46:ireturn         
	}

	public int size()
	{
		return 2;
	//    0    0:iconst_2        
	//    1    1:ireturn         
	}

	private static final long serialVersionUID = 1L;
	private final Class _type1;
	private final Class _type2;
	private final Annotation _value1;
	private final Annotation _value2;

	public AnnotationCollector$TwoAnnotations(Class class1, Annotation annotation, Class class2, Annotation annotation1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		_type1 = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field Class _type1>
		_value1 = annotation;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field Annotation _value1>
		_type2 = class2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field Class _type2>
		_value2 = annotation1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field Annotation _value2>
	//   14   25:return          
	}
}
