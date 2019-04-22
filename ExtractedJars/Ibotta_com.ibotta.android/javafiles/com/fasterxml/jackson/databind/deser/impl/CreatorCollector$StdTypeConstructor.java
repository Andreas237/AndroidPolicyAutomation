// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.*;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			CreatorCollector

protected static final class CreatorCollector$StdTypeConstructor extends AnnotatedWithParams
	implements Serializable
{

	public static AnnotatedWithParams tryToOptimize(AnnotatedWithParams annotatedwithparams)
	{
		if(annotatedwithparams != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          66
		{
			Class class1 = annotatedwithparams.getDeclaringClass();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #33  <Method Class AnnotatedWithParams.getDeclaringClass()>
	//    4    8:astore_1        
			if(class1 != java/util/List && class1 != java/util/ArrayList)
	//*   5    9:aload_1         
	//*   6   10:ldc1            #35  <Class List>
	//*   7   12:if_acmpeq       56
	//*   8   15:aload_1         
	//*   9   16:ldc1            #37  <Class ArrayList>
	//*  10   18:if_acmpne       24
	//*  11   21:goto            56
			{
				if(class1 == java/util/LinkedHashMap)
	//*  12   24:aload_1         
	//*  13   25:ldc1            #39  <Class LinkedHashMap>
	//*  14   27:if_acmpne       40
					return ((AnnotatedWithParams) (new CreatorCollector$StdTypeConstructor(annotatedwithparams, 3)));
	//   15   30:new             #2   <Class CreatorCollector$StdTypeConstructor>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:iconst_3        
	//   19   36:invokespecial   #41  <Method void CreatorCollector$StdTypeConstructor(AnnotatedWithParams, int)>
	//   20   39:areturn         
				if(class1 == java/util/HashMap)
	//*  21   40:aload_1         
	//*  22   41:ldc1            #43  <Class HashMap>
	//*  23   43:if_acmpne       66
					return ((AnnotatedWithParams) (new CreatorCollector$StdTypeConstructor(annotatedwithparams, 2)));
	//   24   46:new             #2   <Class CreatorCollector$StdTypeConstructor>
	//   25   49:dup             
	//   26   50:aload_0         
	//   27   51:iconst_2        
	//   28   52:invokespecial   #41  <Method void CreatorCollector$StdTypeConstructor(AnnotatedWithParams, int)>
	//   29   55:areturn         
			} else
			{
				return ((AnnotatedWithParams) (new CreatorCollector$StdTypeConstructor(annotatedwithparams, 1)));
	//   30   56:new             #2   <Class CreatorCollector$StdTypeConstructor>
	//   31   59:dup             
	//   32   60:aload_0         
	//   33   61:iconst_1        
	//   34   62:invokespecial   #41  <Method void CreatorCollector$StdTypeConstructor(AnnotatedWithParams, int)>
	//   35   65:areturn         
			}
		}
		return annotatedwithparams;
	//   36   66:aload_0         
	//   37   67:areturn         
	}

	protected final Object _construct()
	{
		switch(_type)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field int _type>
		{
	//*   2    4:tableswitch     1 3: default 32
	//	               1 84
	//	               2 76
	//	               3 68
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    3   32:new             #47  <Class StringBuilder>
	//    4   35:dup             
	//    5   36:invokespecial   #50  <Method void StringBuilder()>
	//    6   39:astore_1        
			stringbuilder.append("Unknown type ");
	//    7   40:aload_1         
	//    8   41:ldc1            #52  <String "Unknown type ">
	//    9   43:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   10   46:pop             
			stringbuilder.append(_type);
	//   11   47:aload_1         
	//   12   48:aload_0         
	//   13   49:getfield        #26  <Field int _type>
	//   14   52:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   15   55:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   16   56:new             #61  <Class IllegalStateException>
	//   17   59:dup             
	//   18   60:aload_1         
	//   19   61:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   20   64:invokespecial   #68  <Method void IllegalStateException(String)>
	//   21   67:athrow          

		case 3: // '\003'
			return ((Object) (new LinkedHashMap()));
	//   22   68:new             #39  <Class LinkedHashMap>
	//   23   71:dup             
	//   24   72:invokespecial   #69  <Method void LinkedHashMap()>
	//   25   75:areturn         

		case 2: // '\002'
			return ((Object) (new HashMap()));
	//   26   76:new             #43  <Class HashMap>
	//   27   79:dup             
	//   28   80:invokespecial   #70  <Method void HashMap()>
	//   29   83:areturn         

		case 1: // '\001'
			return ((Object) (new ArrayList()));
	//   30   84:new             #37  <Class ArrayList>
	//   31   87:dup             
	//   32   88:invokespecial   #71  <Method void ArrayList()>
	//   33   91:areturn         
		}
	}

	public Object call()
		throws Exception
	{
		return _construct();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #76  <Method Object _construct()>
	//    2    4:areturn         
	}

	public Object call(Object aobj[])
		throws Exception
	{
		return _construct();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #76  <Method Object _construct()>
	//    2    4:areturn         
	}

	public Object call1(Object obj)
		throws Exception
	{
		return _construct();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #76  <Method Object _construct()>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		return obj == this;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpne       7
	//    3    5:iconst_1        
	//    4    6:ireturn         
	//    5    7:iconst_0        
	//    6    8:ireturn         
	}

	public AnnotatedElement getAnnotated()
	{
		return _base.getAnnotated();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
	//    2    4:invokevirtual   #86  <Method AnnotatedElement AnnotatedWithParams.getAnnotated()>
	//    3    7:areturn         
	}

	public Class getDeclaringClass()
	{
		return _base.getDeclaringClass();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
	//    2    4:invokevirtual   #33  <Method Class AnnotatedWithParams.getDeclaringClass()>
	//    3    7:areturn         
	}

	public Member getMember()
	{
		return _base.getMember();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
	//    2    4:invokevirtual   #92  <Method Member AnnotatedWithParams.getMember()>
	//    3    7:areturn         
	}

	public String getName()
	{
		return _base.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
	//    2    4:invokevirtual   #95  <Method String AnnotatedWithParams.getName()>
	//    3    7:areturn         
	}

	public int getParameterCount()
	{
		return _base.getParameterCount();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
	//    2    4:invokevirtual   #99  <Method int AnnotatedWithParams.getParameterCount()>
	//    3    7:ireturn         
	}

	public JavaType getParameterType(int i)
	{
		return _base.getParameterType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #103 <Method JavaType AnnotatedWithParams.getParameterType(int)>
	//    4    8:areturn         
	}

	public Class getRawParameterType(int i)
	{
		return _base.getRawParameterType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #107 <Method Class AnnotatedWithParams.getRawParameterType(int)>
	//    4    8:areturn         
	}

	public Class getRawType()
	{
		return _base.getRawType();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
	//    2    4:invokevirtual   #111 <Method Class AnnotatedWithParams.getRawType()>
	//    3    7:areturn         
	}

	public JavaType getType()
	{
		return _base.getType();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
	//    2    4:invokevirtual   #115 <Method JavaType AnnotatedWithParams.getType()>
	//    3    7:areturn         
	}

	public Object getValue(Object obj)
		throws UnsupportedOperationException, IllegalArgumentException
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #118 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #121 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public int hashCode()
	{
		return _base.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
	//    2    4:invokevirtual   #124 <Method int AnnotatedWithParams.hashCode()>
	//    3    7:ireturn         
	}

	public void setValue(Object obj, Object obj1)
		throws UnsupportedOperationException, IllegalArgumentException
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #118 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #121 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public String toString()
	{
		return _base.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AnnotatedWithParams _base>
	//    2    4:invokevirtual   #127 <Method String AnnotatedWithParams.toString()>
	//    3    7:areturn         
	}

	public Annotated withAnnotations(AnnotationMap annotationmap)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #118 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #121 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private static final long serialVersionUID = 1L;
	private final AnnotatedWithParams _base;
	private final int _type;

	public CreatorCollector$StdTypeConstructor(AnnotatedWithParams annotatedwithparams, int i)
	{
		super(annotatedwithparams, ((AnnotationMap []) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #22  <Method void AnnotatedWithParams(AnnotatedWithParams, AnnotationMap[])>
		_base = annotatedwithparams;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #24  <Field AnnotatedWithParams _base>
		_type = i;
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:putfield        #26  <Field int _type>
	//   10   16:return          
	}
}
