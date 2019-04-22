// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			ClassUtil

public static final class ClassUtil$Ctor
{

	public Constructor getConstructor()
	{
		return _ctor;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _ctor>
	//    2    4:areturn         
	}

	public Class getDeclaringClass()
	{
		return _ctor.getDeclaringClass();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _ctor>
	//    2    4:invokevirtual   #35  <Method Class Constructor.getDeclaringClass()>
	//    3    7:areturn         
	}

	public int getParamCount()
	{
		int j = _paramCount;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int _paramCount>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j < 0)
	//*   5    7:iload_2         
	//*   6    8:ifge            25
		{
			i = _ctor.getParameterTypes().length;
	//    7   11:aload_0         
	//    8   12:getfield        #23  <Field Constructor _ctor>
	//    9   15:invokevirtual   #42  <Method Class[] Constructor.getParameterTypes()>
	//   10   18:arraylength     
	//   11   19:istore_1        
			_paramCount = i;
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:putfield        #21  <Field int _paramCount>
		}
		return i;
	//   15   25:iload_1         
	//   16   26:ireturn         
	}

	public Annotation[][] getParameterAnnotations()
	{
		Annotation aannotation1[][] = _paramAnnotations;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Annotation[][] _paramAnnotations>
	//    2    4:astore_2        
		Annotation aannotation[][] = aannotation1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(aannotation1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       24
		{
			aannotation = _ctor.getParameterAnnotations();
	//    7   11:aload_0         
	//    8   12:getfield        #23  <Field Constructor _ctor>
	//    9   15:invokevirtual   #48  <Method Annotation[][] Constructor.getParameterAnnotations()>
	//   10   18:astore_1        
			_paramAnnotations = aannotation;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #46  <Field Annotation[][] _paramAnnotations>
		}
		return aannotation;
	//   14   24:aload_1         
	//   15   25:areturn         
	}

	public final Constructor _ctor;
	private Annotation _paramAnnotations[][];
	private int _paramCount;

	public ClassUtil$Ctor(Constructor constructor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		_paramCount = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #21  <Field int _paramCount>
		_ctor = constructor;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #23  <Field Constructor _ctor>
	//    8   14:return          
	}
}
