// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedWithParams, TypeResolutionContext, AnnotationMap, Annotated

public final class AnnotatedMethod extends AnnotatedWithParams
	implements Serializable
{
	private static final class Serialization
		implements Serializable
	{

		private static final long serialVersionUID = 1L;
		protected Class args[];
		protected Class clazz;
		protected String name;

		public Serialization(Method method)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			clazz = method.getDeclaringClass();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #32  <Method Class Method.getDeclaringClass()>
		//    5    9:putfield        #34  <Field Class clazz>
			name = method.getName();
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #38  <Method String Method.getName()>
		//    9   17:putfield        #40  <Field String name>
			args = method.getParameterTypes();
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokevirtual   #44  <Method Class[] Method.getParameterTypes()>
		//   13   25:putfield        #46  <Field Class[] args>
		//   14   28:return          
		}
	}


	protected AnnotatedMethod(Serialization serialization)
	{
		super(((TypeResolutionContext) (null)), ((AnnotationMap) (null)), ((AnnotationMap []) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #25  <Method void AnnotatedWithParams(TypeResolutionContext, AnnotationMap, AnnotationMap[])>
		_method = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #27  <Field Method _method>
		_serialization = serialization;
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:putfield        #29  <Field AnnotatedMethod$Serialization _serialization>
	//   11   17:return          
	}

	public AnnotatedMethod(TypeResolutionContext typeresolutioncontext, Method method, AnnotationMap annotationmap, AnnotationMap aannotationmap[])
	{
		super(typeresolutioncontext, annotationmap, aannotationmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokespecial   #25  <Method void AnnotatedWithParams(TypeResolutionContext, AnnotationMap, AnnotationMap[])>
		if(method == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       22
		{
			throw new IllegalArgumentException("Can not construct AnnotatedMethod with null Method");
	//    7   12:new             #33  <Class IllegalArgumentException>
	//    8   15:dup             
	//    9   16:ldc1            #35  <String "Can not construct AnnotatedMethod with null Method">
	//   10   18:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//   11   21:athrow          
		} else
		{
			_method = method;
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:putfield        #27  <Field Method _method>
			return;
	//   15   27:return          
		}
	}

	public final Object call()
		throws Exception
	{
		return _method.invoke(((Object) (null)), new Object[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:aconst_null     
	//    3    5:iconst_0        
	//    4    6:anewarray       Object[]
	//    5    9:invokevirtual   #50  <Method Object Method.invoke(Object, Object[])>
	//    6   12:areturn         
	}

	public final Object call(Object aobj[])
		throws Exception
	{
		return _method.invoke(((Object) (null)), aobj);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:aconst_null     
	//    3    5:aload_1         
	//    4    6:invokevirtual   #50  <Method Object Method.invoke(Object, Object[])>
	//    5    9:areturn         
	}

	public final Object call1(Object obj)
		throws Exception
	{
		return _method.invoke(((Object) (null)), new Object[] {
			obj
		});
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:aconst_null     
	//    3    5:iconst_1        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:aastore         
	//    9   13:invokevirtual   #50  <Method Object Method.invoke(Object, Object[])>
	//   10   16:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(obj == null || obj.getClass() != ((Object)this).getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #60  <Method Class Object.getClass()>
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #60  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			if(((AnnotatedMethod)obj)._method != _method)
	//*  14   24:aload_1         
	//*  15   25:checkcast       #2   <Class AnnotatedMethod>
	//*  16   28:getfield        #27  <Field Method _method>
	//*  17   31:aload_0         
	//*  18   32:getfield        #27  <Field Method _method>
	//*  19   35:if_acmpeq       5
				return false;
	//   20   38:iconst_0        
	//   21   39:ireturn         
		}
		return true;
	}

	public volatile AnnotatedElement getAnnotated()
	{
		return ((AnnotatedElement) (getAnnotated()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method Method getAnnotated()>
	//    2    4:areturn         
	}

	public Method getAnnotated()
	{
		return _method;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:areturn         
	}

	public Class getDeclaringClass()
	{
		return _method.getDeclaringClass();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:invokevirtual   #68  <Method Class Method.getDeclaringClass()>
	//    3    7:areturn         
	}

	public String getFullName()
	{
		return (new StringBuilder()).append(getDeclaringClass().getName()).append("#").append(getName()).append("(").append(getParameterCount()).append(" params)").toString();
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #78  <Method Class getDeclaringClass()>
	//    5   11:invokevirtual   #83  <Method String Class.getName()>
	//    6   14:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #89  <String "#">
	//    8   19:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_0         
	//   10   23:invokevirtual   #90  <Method String getName()>
	//   11   26:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   12   29:ldc1            #92  <String "(">
	//   13   31:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   14   34:aload_0         
	//   15   35:invokevirtual   #96  <Method int getParameterCount()>
	//   16   38:invokevirtual   #99  <Method StringBuilder StringBuilder.append(int)>
	//   17   41:ldc1            #101 <String " params)">
	//   18   43:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   19   46:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   20   49:areturn         
	}

	public Type[] getGenericParameterTypes()
	{
		return _method.getGenericParameterTypes();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:invokevirtual   #108 <Method Type[] Method.getGenericParameterTypes()>
	//    3    7:areturn         
	}

	public volatile Member getMember()
	{
		return ((Member) (getMember()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method Method getMember()>
	//    2    4:areturn         
	}

	public Method getMember()
	{
		return _method;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:areturn         
	}

	public int getModifiers()
	{
		return _method.getModifiers();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:invokevirtual   #115 <Method int Method.getModifiers()>
	//    3    7:ireturn         
	}

	public String getName()
	{
		return _method.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:invokevirtual   #116 <Method String Method.getName()>
	//    3    7:areturn         
	}

	public int getParameterCount()
	{
		return getRawParameterTypes().length;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #120 <Method Class[] getRawParameterTypes()>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public JavaType getParameterType(int i)
	{
		Type atype[] = _method.getGenericParameterTypes();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:invokevirtual   #108 <Method Type[] Method.getGenericParameterTypes()>
	//    3    7:astore_2        
		if(i >= atype.length)
	//*   4    8:iload_1         
	//*   5    9:aload_2         
	//*   6   10:arraylength     
	//*   7   11:icmplt          16
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		else
			return _typeContext.resolveType(atype[i]);
	//   10   16:aload_0         
	//   11   17:getfield        #126 <Field TypeResolutionContext _typeContext>
	//   12   20:aload_2         
	//   13   21:iload_1         
	//   14   22:aaload          
	//   15   23:invokeinterface #132 <Method JavaType TypeResolutionContext.resolveType(Type)>
	//   16   28:areturn         
	}

	public Class getRawParameterType(int i)
	{
		Class aclass[] = getRawParameterTypes();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #120 <Method Class[] getRawParameterTypes()>
	//    2    4:astore_2        
		if(i >= aclass.length)
	//*   3    5:iload_1         
	//*   4    6:aload_2         
	//*   5    7:arraylength     
	//*   6    8:icmplt          13
			return null;
	//    7   11:aconst_null     
	//    8   12:areturn         
		else
			return aclass[i];
	//    9   13:aload_2         
	//   10   14:iload_1         
	//   11   15:aaload          
	//   12   16:areturn         
	}

	public Class[] getRawParameterTypes()
	{
		if(_paramClasses == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field Class[] _paramClasses>
	//*   2    4:ifnonnull       18
			_paramClasses = _method.getParameterTypes();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field Method _method>
	//    6   12:invokevirtual   #140 <Method Class[] Method.getParameterTypes()>
	//    7   15:putfield        #137 <Field Class[] _paramClasses>
		return _paramClasses;
	//    8   18:aload_0         
	//    9   19:getfield        #137 <Field Class[] _paramClasses>
	//   10   22:areturn         
	}

	public Class getRawReturnType()
	{
		return _method.getReturnType();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:invokevirtual   #145 <Method Class Method.getReturnType()>
	//    3    7:areturn         
	}

	public Class getRawType()
	{
		return _method.getReturnType();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:invokevirtual   #145 <Method Class Method.getReturnType()>
	//    3    7:areturn         
	}

	public JavaType getType()
	{
		return _typeContext.resolveType(_method.getGenericReturnType());
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field TypeResolutionContext _typeContext>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field Method _method>
	//    4    8:invokevirtual   #152 <Method Type Method.getGenericReturnType()>
	//    5   11:invokeinterface #132 <Method JavaType TypeResolutionContext.resolveType(Type)>
	//    6   16:areturn         
	}

	public Object getValue(Object obj)
		throws IllegalArgumentException
	{
		try
		{
			obj = _method.invoke(obj, new Object[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:anewarray       Object[]
	//    5    9:invokevirtual   #50  <Method Object Method.invoke(Object, Object[])>
	//    6   12:astore_1        
		}
	//*   7   13:aload_1         
	//*   8   14:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   9   15:astore_1        
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Failed to getValue() with method ").append(getFullName()).append(": ").append(((IllegalAccessException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
	//   10   16:new             #33  <Class IllegalArgumentException>
	//   11   19:dup             
	//   12   20:new             #74  <Class StringBuilder>
	//   13   23:dup             
	//   14   24:invokespecial   #77  <Method void StringBuilder()>
	//   15   27:ldc1            #159 <String "Failed to getValue() with method ">
	//   16   29:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:aload_0         
	//   18   33:invokevirtual   #161 <Method String getFullName()>
	//   19   36:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:ldc1            #163 <String ": ">
	//   21   41:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #166 <Method String IllegalAccessException.getMessage()>
	//   24   48:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   26   54:aload_1         
	//   27   55:invokespecial   #169 <Method void IllegalArgumentException(String, Throwable)>
	//   28   58:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  29   59:astore_1        
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Failed to getValue() with method ").append(getFullName()).append(": ").append(((InvocationTargetException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
	//   30   60:new             #33  <Class IllegalArgumentException>
	//   31   63:dup             
	//   32   64:new             #74  <Class StringBuilder>
	//   33   67:dup             
	//   34   68:invokespecial   #77  <Method void StringBuilder()>
	//   35   71:ldc1            #159 <String "Failed to getValue() with method ">
	//   36   73:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   37   76:aload_0         
	//   38   77:invokevirtual   #161 <Method String getFullName()>
	//   39   80:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   40   83:ldc1            #163 <String ": ">
	//   41   85:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   42   88:aload_1         
	//   43   89:invokevirtual   #170 <Method String InvocationTargetException.getMessage()>
	//   44   92:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   45   95:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   46   98:aload_1         
	//   47   99:invokespecial   #169 <Method void IllegalArgumentException(String, Throwable)>
	//   48  102:athrow          
		}
		return obj;
	}

	public boolean hasReturnType()
	{
		Class class1 = getRawReturnType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #174 <Method Class getRawReturnType()>
	//    2    4:astore_1        
		return class1 != Void.TYPE && class1 != java/lang/Void;
	//    3    5:aload_1         
	//    4    6:getstatic       #180 <Field Class Void.TYPE>
	//    5    9:if_acmpeq       20
	//    6   12:aload_1         
	//    7   13:ldc1            #176 <Class Void>
	//    8   15:if_acmpeq       20
	//    9   18:iconst_1        
	//   10   19:ireturn         
	//   11   20:iconst_0        
	//   12   21:ireturn         
	}

	public int hashCode()
	{
		return _method.getName().hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:invokevirtual   #116 <Method String Method.getName()>
	//    3    7:invokevirtual   #185 <Method int String.hashCode()>
	//    4   10:ireturn         
	}

	Object readResolve()
	{
		Class class1 = _serialization.clazz;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field AnnotatedMethod$Serialization _serialization>
	//    2    4:getfield        #189 <Field Class AnnotatedMethod$Serialization.clazz>
	//    3    7:astore_1        
		Object obj;
		try
		{
			obj = ((Object) (class1.getDeclaredMethod(_serialization.name, _serialization.args)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field AnnotatedMethod$Serialization _serialization>
	//    7   13:getfield        #193 <Field String AnnotatedMethod$Serialization.name>
	//    8   16:aload_0         
	//    9   17:getfield        #29  <Field AnnotatedMethod$Serialization _serialization>
	//   10   20:getfield        #196 <Field Class[] AnnotatedMethod$Serialization.args>
	//   11   23:invokevirtual   #200 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   12   26:astore_2        
			if(!((Method) (obj)).isAccessible())
	//*  13   27:aload_2         
	//*  14   28:invokevirtual   #203 <Method boolean Method.isAccessible()>
	//*  15   31:ifne            39
				ClassUtil.checkAndFixAccess(((Member) (obj)), false);
	//   16   34:aload_2         
	//   17   35:iconst_0        
	//   18   36:invokestatic    #209 <Method void ClassUtil.checkAndFixAccess(Member, boolean)>
			obj = ((Object) (new AnnotatedMethod(((TypeResolutionContext) (null)), ((Method) (obj)), ((AnnotationMap) (null)), ((AnnotationMap []) (null)))));
	//   19   39:new             #2   <Class AnnotatedMethod>
	//   20   42:dup             
	//   21   43:aconst_null     
	//   22   44:aload_2         
	//   23   45:aconst_null     
	//   24   46:aconst_null     
	//   25   47:invokespecial   #211 <Method void AnnotatedMethod(TypeResolutionContext, Method, AnnotationMap, AnnotationMap[])>
	//   26   50:astore_2        
		}
	//*  27   51:aload_2         
	//*  28   52:areturn         
		catch(Exception exception)
	//*  29   53:astore_2        
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Could not find method '").append(_serialization.name).append("' from Class '").append(class1.getName()).toString());
	//   30   54:new             #33  <Class IllegalArgumentException>
	//   31   57:dup             
	//   32   58:new             #74  <Class StringBuilder>
	//   33   61:dup             
	//   34   62:invokespecial   #77  <Method void StringBuilder()>
	//   35   65:ldc1            #213 <String "Could not find method '">
	//   36   67:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   37   70:aload_0         
	//   38   71:getfield        #29  <Field AnnotatedMethod$Serialization _serialization>
	//   39   74:getfield        #193 <Field String AnnotatedMethod$Serialization.name>
	//   40   77:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   41   80:ldc1            #215 <String "' from Class '">
	//   42   82:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   43   85:aload_1         
	//   44   86:invokevirtual   #83  <Method String Class.getName()>
	//   45   89:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   46   92:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   47   95:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//   48   98:athrow          
		}
		return obj;
	}

	public void setValue(Object obj, Object obj1)
		throws IllegalArgumentException
	{
		try
		{
			_method.invoke(obj, new Object[] {
				obj1
			});
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_2         
	//    8   12:aastore         
	//    9   13:invokevirtual   #50  <Method Object Method.invoke(Object, Object[])>
	//   10   16:pop             
			return;
	//   11   17:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  12   18:astore_1        
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Failed to setValue() with method ").append(getFullName()).append(": ").append(((IllegalAccessException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
	//   13   19:new             #33  <Class IllegalArgumentException>
	//   14   22:dup             
	//   15   23:new             #74  <Class StringBuilder>
	//   16   26:dup             
	//   17   27:invokespecial   #77  <Method void StringBuilder()>
	//   18   30:ldc1            #219 <String "Failed to setValue() with method ">
	//   19   32:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   20   35:aload_0         
	//   21   36:invokevirtual   #161 <Method String getFullName()>
	//   22   39:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   23   42:ldc1            #163 <String ": ">
	//   24   44:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #166 <Method String IllegalAccessException.getMessage()>
	//   27   51:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   28   54:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   29   57:aload_1         
	//   30   58:invokespecial   #169 <Method void IllegalArgumentException(String, Throwable)>
	//   31   61:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  32   62:astore_1        
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Failed to setValue() with method ").append(getFullName()).append(": ").append(((InvocationTargetException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
	//   33   63:new             #33  <Class IllegalArgumentException>
	//   34   66:dup             
	//   35   67:new             #74  <Class StringBuilder>
	//   36   70:dup             
	//   37   71:invokespecial   #77  <Method void StringBuilder()>
	//   38   74:ldc1            #219 <String "Failed to setValue() with method ">
	//   39   76:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   40   79:aload_0         
	//   41   80:invokevirtual   #161 <Method String getFullName()>
	//   42   83:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   43   86:ldc1            #163 <String ": ">
	//   44   88:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   45   91:aload_1         
	//   46   92:invokevirtual   #170 <Method String InvocationTargetException.getMessage()>
	//   47   95:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   48   98:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   49  101:aload_1         
	//   50  102:invokespecial   #169 <Method void IllegalArgumentException(String, Throwable)>
	//   51  105:athrow          
		}
	}

	public String toString()
	{
		return (new StringBuilder()).append("[method ").append(getFullName()).append("]").toString();
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void StringBuilder()>
	//    3    7:ldc1            #221 <String "[method ">
	//    4    9:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #161 <Method String getFullName()>
	//    7   16:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #223 <String "]">
	//    9   21:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	public volatile Annotated withAnnotations(AnnotationMap annotationmap)
	{
		return ((Annotated) (withAnnotations(annotationmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #228 <Method AnnotatedMethod withAnnotations(AnnotationMap)>
	//    3    5:areturn         
	}

	public AnnotatedMethod withAnnotations(AnnotationMap annotationmap)
	{
		return new AnnotatedMethod(_typeContext, _method, annotationmap, _paramAnnotations);
	//    0    0:new             #2   <Class AnnotatedMethod>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #126 <Field TypeResolutionContext _typeContext>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field Method _method>
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #232 <Field AnnotationMap[] _paramAnnotations>
	//    9   17:invokespecial   #211 <Method void AnnotatedMethod(TypeResolutionContext, Method, AnnotationMap, AnnotationMap[])>
	//   10   20:areturn         
	}

	public AnnotatedMethod withMethod(Method method)
	{
		return new AnnotatedMethod(_typeContext, method, _annotations, _paramAnnotations);
	//    0    0:new             #2   <Class AnnotatedMethod>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #126 <Field TypeResolutionContext _typeContext>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #238 <Field AnnotationMap _annotations>
	//    7   13:aload_0         
	//    8   14:getfield        #232 <Field AnnotationMap[] _paramAnnotations>
	//    9   17:invokespecial   #211 <Method void AnnotatedMethod(TypeResolutionContext, Method, AnnotationMap, AnnotationMap[])>
	//   10   20:areturn         
	}

	Object writeReplace()
	{
		return ((Object) (new AnnotatedMethod(new Serialization(_method))));
	//    0    0:new             #2   <Class AnnotatedMethod>
	//    1    3:dup             
	//    2    4:new             #8   <Class AnnotatedMethod$Serialization>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field Method _method>
	//    6   12:invokespecial   #242 <Method void AnnotatedMethod$Serialization(Method)>
	//    7   15:invokespecial   #244 <Method void AnnotatedMethod(AnnotatedMethod$Serialization)>
	//    8   18:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final transient Method _method;
	protected Class _paramClasses[];
	protected Serialization _serialization;
}
