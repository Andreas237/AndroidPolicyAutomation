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
		if(method != null)
	//*   5    8:aload_2         
	//*   6    9:ifnull          18
		{
			_method = method;
	//    7   12:aload_0         
	//    8   13:aload_2         
	//    9   14:putfield        #27  <Field Method _method>
			return;
	//   10   17:return          
		} else
		{
			throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
	//   11   18:new             #33  <Class IllegalArgumentException>
	//   12   21:dup             
	//   13   22:ldc1            #35  <String "Cannot construct AnnotatedMethod with null Method">
	//   14   24:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//   15   27:athrow          
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

	public final transient Object callOnWith(Object obj, Object aobj[])
		throws Exception
	{
		return _method.invoke(obj, aobj);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #50  <Method Object Method.invoke(Object, Object[])>
	//    5    9:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		return ClassUtil.hasClass(obj, ((Object)this).getClass()) && ((AnnotatedMethod)obj)._method == _method;
	//    5    7:aload_1         
	//    6    8:aload_0         
	//    7    9:invokevirtual   #61  <Method Class Object.getClass()>
	//    8   12:invokestatic    #67  <Method boolean ClassUtil.hasClass(Object, Class)>
	//    9   15:ifeq            34
	//   10   18:aload_1         
	//   11   19:checkcast       #2   <Class AnnotatedMethod>
	//   12   22:getfield        #27  <Field Method _method>
	//   13   25:aload_0         
	//   14   26:getfield        #27  <Field Method _method>
	//   15   29:if_acmpne       34
	//   16   32:iconst_1        
	//   17   33:ireturn         
	//   18   34:iconst_0        
	//   19   35:ireturn         
	}

	public volatile AnnotatedElement getAnnotated()
	{
		return ((AnnotatedElement) (getAnnotated()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method Method getAnnotated()>
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
	//    2    4:invokevirtual   #75  <Method Class Method.getDeclaringClass()>
	//    3    7:areturn         
	}

	public String getFullName()
	{
		return String.format("%s(%d params)", new Object[] {
			super.getFullName(), Integer.valueOf(getParameterCount())
		});
	//    0    0:ldc1            #81  <String "%s(%d params)">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:invokespecial   #83  <Method String AnnotatedWithParams.getFullName()>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_0         
	//   11   16:invokevirtual   #87  <Method int getParameterCount()>
	//   12   19:invokestatic    #93  <Method Integer Integer.valueOf(int)>
	//   13   22:aastore         
	//   14   23:invokestatic    #99  <Method String String.format(String, Object[])>
	//   15   26:areturn         
	}

	public volatile Member getMember()
	{
		return ((Member) (getMember()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #103 <Method Method getMember()>
	//    2    4:areturn         
	}

	public Method getMember()
	{
		return _method;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:areturn         
	}

	public String getName()
	{
		return _method.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:invokevirtual   #106 <Method String Method.getName()>
	//    3    7:areturn         
	}

	public int getParameterCount()
	{
		return getRawParameterTypes().length;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #110 <Method Class[] getRawParameterTypes()>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public JavaType getParameterType(int i)
	{
		java.lang.reflect.Type atype[] = _method.getGenericParameterTypes();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:invokevirtual   #116 <Method java.lang.reflect.Type[] Method.getGenericParameterTypes()>
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
	//   11   17:getfield        #120 <Field TypeResolutionContext _typeContext>
	//   12   20:aload_2         
	//   13   21:iload_1         
	//   14   22:aaload          
	//   15   23:invokeinterface #126 <Method JavaType TypeResolutionContext.resolveType(java.lang.reflect.Type)>
	//   16   28:areturn         
	}

	public Class getRawParameterType(int i)
	{
		Class aclass[] = getRawParameterTypes();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #110 <Method Class[] getRawParameterTypes()>
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
	//*   1    1:getfield        #131 <Field Class[] _paramClasses>
	//*   2    4:ifnonnull       18
			_paramClasses = _method.getParameterTypes();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field Method _method>
	//    6   12:invokevirtual   #134 <Method Class[] Method.getParameterTypes()>
	//    7   15:putfield        #131 <Field Class[] _paramClasses>
		return _paramClasses;
	//    8   18:aload_0         
	//    9   19:getfield        #131 <Field Class[] _paramClasses>
	//   10   22:areturn         
	}

	public Class getRawReturnType()
	{
		return _method.getReturnType();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:invokevirtual   #139 <Method Class Method.getReturnType()>
	//    3    7:areturn         
	}

	public Class getRawType()
	{
		return _method.getReturnType();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:invokevirtual   #139 <Method Class Method.getReturnType()>
	//    3    7:areturn         
	}

	public JavaType getType()
	{
		return _typeContext.resolveType(_method.getGenericReturnType());
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field TypeResolutionContext _typeContext>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field Method _method>
	//    4    8:invokevirtual   #146 <Method java.lang.reflect.Type Method.getGenericReturnType()>
	//    5   11:invokeinterface #126 <Method JavaType TypeResolutionContext.resolveType(java.lang.reflect.Type)>
	//    6   16:areturn         
	}

	public Object getValue(Object obj)
		throws IllegalArgumentException
	{
		obj = _method.invoke(obj, (Object[])null);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Method _method>
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:checkcast       #153 <Class Object[]>
	//    5    9:invokevirtual   #50  <Method Object Method.invoke(Object, Object[])>
	//    6   12:astore_1        
		return obj;
	//    7   13:aload_1         
	//    8   14:areturn         
		obj;
	//    9   15:astore_1        
		break MISSING_BLOCK_LABEL_20;
	//   10   16:goto            20
		obj;
	//   11   19:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   12   20:new             #155 <Class StringBuilder>
	//   13   23:dup             
	//   14   24:invokespecial   #158 <Method void StringBuilder()>
	//   15   27:astore_2        
		stringbuilder.append("Failed to getValue() with method ");
	//   16   28:aload_2         
	//   17   29:ldc1            #160 <String "Failed to getValue() with method ">
	//   18   31:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
		stringbuilder.append(getFullName());
	//   20   35:aload_2         
	//   21   36:aload_0         
	//   22   37:invokevirtual   #165 <Method String getFullName()>
	//   23   40:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   24   43:pop             
		stringbuilder.append(": ");
	//   25   44:aload_2         
	//   26   45:ldc1            #167 <String ": ">
	//   27   47:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   28   50:pop             
		stringbuilder.append(((ReflectiveOperationException) (obj)).getMessage());
	//   29   51:aload_2         
	//   30   52:aload_1         
	//   31   53:invokevirtual   #172 <Method String ReflectiveOperationException.getMessage()>
	//   32   56:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   33   59:pop             
		throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (obj)));
	//   34   60:new             #33  <Class IllegalArgumentException>
	//   35   63:dup             
	//   36   64:aload_2         
	//   37   65:invokevirtual   #175 <Method String StringBuilder.toString()>
	//   38   68:aload_1         
	//   39   69:invokespecial   #178 <Method void IllegalArgumentException(String, Throwable)>
	//   40   72:athrow          
	}

	public boolean hasReturnType()
	{
		Class class1 = getRawReturnType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #182 <Method Class getRawReturnType()>
	//    2    4:astore_1        
		return class1 != Void.TYPE && class1 != java/lang/Void;
	//    3    5:aload_1         
	//    4    6:getstatic       #188 <Field Class Void.TYPE>
	//    5    9:if_acmpeq       20
	//    6   12:aload_1         
	//    7   13:ldc1            #184 <Class Void>
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
	//    2    4:invokevirtual   #106 <Method String Method.getName()>
	//    3    7:invokevirtual   #191 <Method int String.hashCode()>
	//    4   10:ireturn         
	}

	Object readResolve()
	{
		Exception exception;
		Class class1 = _serialization.clazz;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field AnnotatedMethod$Serialization _serialization>
	//    2    4:getfield        #195 <Field Class AnnotatedMethod$Serialization.clazz>
	//    3    7:astore_1        
		Object obj;
		try
		{
			obj = ((Object) (class1.getDeclaredMethod(_serialization.name, _serialization.args)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field AnnotatedMethod$Serialization _serialization>
	//    7   13:getfield        #199 <Field String AnnotatedMethod$Serialization.name>
	//    8   16:aload_0         
	//    9   17:getfield        #29  <Field AnnotatedMethod$Serialization _serialization>
	//   10   20:getfield        #202 <Field Class[] AnnotatedMethod$Serialization.args>
	//   11   23:invokevirtual   #208 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   12   26:astore_2        
			if(!((Method) (obj)).isAccessible())
	//*  13   27:aload_2         
	//*  14   28:invokevirtual   #211 <Method boolean Method.isAccessible()>
	//*  15   31:ifne            39
				ClassUtil.checkAndFixAccess(((Member) (obj)), false);
	//   16   34:aload_2         
	//   17   35:iconst_0        
	//   18   36:invokestatic    #215 <Method void ClassUtil.checkAndFixAccess(Member, boolean)>
			obj = ((Object) (new AnnotatedMethod(((TypeResolutionContext) (null)), ((Method) (obj)), ((AnnotationMap) (null)), ((AnnotationMap []) (null)))));
	//   19   39:new             #2   <Class AnnotatedMethod>
	//   20   42:dup             
	//   21   43:aconst_null     
	//   22   44:aload_2         
	//   23   45:aconst_null     
	//   24   46:aconst_null     
	//   25   47:invokespecial   #217 <Method void AnnotatedMethod(TypeResolutionContext, Method, AnnotationMap, AnnotationMap[])>
	//   26   50:astore_2        
		}
	//*  27   51:aload_2         
	//*  28   52:areturn         
	//*  29   53:new             #155 <Class StringBuilder>
	//*  30   56:dup             
	//*  31   57:invokespecial   #158 <Method void StringBuilder()>
	//*  32   60:astore_2        
	//*  33   61:aload_2         
	//*  34   62:ldc1            #219 <String "Could not find method '">
	//*  35   64:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//*  36   67:pop             
	//*  37   68:aload_2         
	//*  38   69:aload_0         
	//*  39   70:getfield        #29  <Field AnnotatedMethod$Serialization _serialization>
	//*  40   73:getfield        #199 <Field String AnnotatedMethod$Serialization.name>
	//*  41   76:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//*  42   79:pop             
	//*  43   80:aload_2         
	//*  44   81:ldc1            #221 <String "' from Class '">
	//*  45   83:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//*  46   86:pop             
	//*  47   87:aload_2         
	//*  48   88:aload_1         
	//*  49   89:invokevirtual   #222 <Method String Class.getName()>
	//*  50   92:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//*  51   95:pop             
	//*  52   96:new             #33  <Class IllegalArgumentException>
	//*  53   99:dup             
	//*  54  100:aload_2         
	//*  55  101:invokevirtual   #175 <Method String StringBuilder.toString()>
	//*  56  104:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//*  57  107:athrow          
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("Could not find method '");
			((StringBuilder) (obj)).append(_serialization.name);
			((StringBuilder) (obj)).append("' from Class '");
			((StringBuilder) (obj)).append(class1.getName());
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
		}
		return obj;
	//*  58  108:astore_2        
	//*  59  109:goto            53
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
	//*  12   18:astore_1        
	//*  13   19:goto            23
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   14   22:astore_1        
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		obj1 = ((Object) (new StringBuilder()));
	//   15   23:new             #155 <Class StringBuilder>
	//   16   26:dup             
	//   17   27:invokespecial   #158 <Method void StringBuilder()>
	//   18   30:astore_2        
		((StringBuilder) (obj1)).append("Failed to setValue() with method ");
	//   19   31:aload_2         
	//   20   32:ldc1            #226 <String "Failed to setValue() with method ">
	//   21   34:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   22   37:pop             
		((StringBuilder) (obj1)).append(getFullName());
	//   23   38:aload_2         
	//   24   39:aload_0         
	//   25   40:invokevirtual   #165 <Method String getFullName()>
	//   26   43:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   27   46:pop             
		((StringBuilder) (obj1)).append(": ");
	//   28   47:aload_2         
	//   29   48:ldc1            #167 <String ": ">
	//   30   50:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   31   53:pop             
		((StringBuilder) (obj1)).append(((ReflectiveOperationException) (obj)).getMessage());
	//   32   54:aload_2         
	//   33   55:aload_1         
	//   34   56:invokevirtual   #172 <Method String ReflectiveOperationException.getMessage()>
	//   35   59:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   36   62:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj1)).toString(), ((Throwable) (obj)));
	//   37   63:new             #33  <Class IllegalArgumentException>
	//   38   66:dup             
	//   39   67:aload_2         
	//   40   68:invokevirtual   #175 <Method String StringBuilder.toString()>
	//   41   71:aload_1         
	//   42   72:invokespecial   #178 <Method void IllegalArgumentException(String, Throwable)>
	//   43   75:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #155 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #158 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[method ");
	//    4    8:aload_1         
	//    5    9:ldc1            #228 <String "[method ">
	//    6   11:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getFullName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #165 <Method String getFullName()>
	//   11   20:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("]");
	//   13   24:aload_1         
	//   14   25:ldc1            #230 <String "]">
	//   15   27:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #175 <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	public volatile Annotated withAnnotations(AnnotationMap annotationmap)
	{
		return ((Annotated) (withAnnotations(annotationmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #235 <Method AnnotatedMethod withAnnotations(AnnotationMap)>
	//    3    5:areturn         
	}

	public AnnotatedMethod withAnnotations(AnnotationMap annotationmap)
	{
		return new AnnotatedMethod(_typeContext, _method, annotationmap, _paramAnnotations);
	//    0    0:new             #2   <Class AnnotatedMethod>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #120 <Field TypeResolutionContext _typeContext>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field Method _method>
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #239 <Field AnnotationMap[] _paramAnnotations>
	//    9   17:invokespecial   #217 <Method void AnnotatedMethod(TypeResolutionContext, Method, AnnotationMap, AnnotationMap[])>
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
	//    6   12:invokespecial   #243 <Method void AnnotatedMethod$Serialization(Method)>
	//    7   15:invokespecial   #245 <Method void AnnotatedMethod(AnnotatedMethod$Serialization)>
	//    8   18:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final transient Method _method;
	protected Class _paramClasses[];
	protected Serialization _serialization;
}
