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

public final class AnnotatedConstructor extends AnnotatedWithParams
{
	private static final class Serialization
		implements Serializable
	{

		private static final long serialVersionUID = 1L;
		protected Class args[];
		protected Class clazz;

		public Serialization(Constructor constructor)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			clazz = constructor.getDeclaringClass();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #30  <Method Class Constructor.getDeclaringClass()>
		//    5    9:putfield        #32  <Field Class clazz>
			args = constructor.getParameterTypes();
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #36  <Method Class[] Constructor.getParameterTypes()>
		//    9   17:putfield        #38  <Field Class[] args>
		//   10   20:return          
		}
	}


	protected AnnotatedConstructor(Serialization serialization)
	{
		super(((TypeResolutionContext) (null)), ((AnnotationMap) (null)), ((AnnotationMap []) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #21  <Method void AnnotatedWithParams(TypeResolutionContext, AnnotationMap, AnnotationMap[])>
		_constructor = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #23  <Field Constructor _constructor>
		_serialization = serialization;
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:putfield        #25  <Field AnnotatedConstructor$Serialization _serialization>
	//   11   17:return          
	}

	public AnnotatedConstructor(TypeResolutionContext typeresolutioncontext, Constructor constructor, AnnotationMap annotationmap, AnnotationMap aannotationmap[])
	{
		super(typeresolutioncontext, annotationmap, aannotationmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokespecial   #21  <Method void AnnotatedWithParams(TypeResolutionContext, AnnotationMap, AnnotationMap[])>
		if(constructor != null)
	//*   5    8:aload_2         
	//*   6    9:ifnull          18
		{
			_constructor = constructor;
	//    7   12:aload_0         
	//    8   13:aload_2         
	//    9   14:putfield        #23  <Field Constructor _constructor>
			return;
	//   10   17:return          
		} else
		{
			throw new IllegalArgumentException("Null constructor not allowed");
	//   11   18:new             #29  <Class IllegalArgumentException>
	//   12   21:dup             
	//   13   22:ldc1            #31  <String "Null constructor not allowed">
	//   14   24:invokespecial   #34  <Method void IllegalArgumentException(String)>
	//   15   27:athrow          
		}
	}

	public final Object call()
		throws Exception
	{
		return _constructor.newInstance(new Object[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:iconst_0        
	//    3    5:anewarray       Object[]
	//    4    8:invokevirtual   #48  <Method Object Constructor.newInstance(Object[])>
	//    5   11:areturn         
	}

	public final Object call(Object aobj[])
		throws Exception
	{
		return _constructor.newInstance(aobj);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #48  <Method Object Constructor.newInstance(Object[])>
	//    4    8:areturn         
	}

	public final Object call1(Object obj)
		throws Exception
	{
		return _constructor.newInstance(new Object[] {
			obj
		});
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:iconst_1        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:aastore         
	//    8   12:invokevirtual   #48  <Method Object Constructor.newInstance(Object[])>
	//    9   15:areturn         
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
		return ClassUtil.hasClass(obj, ((Object)this).getClass()) && ((AnnotatedConstructor)obj)._constructor == _constructor;
	//    5    7:aload_1         
	//    6    8:aload_0         
	//    7    9:invokevirtual   #57  <Method Class Object.getClass()>
	//    8   12:invokestatic    #63  <Method boolean ClassUtil.hasClass(Object, Class)>
	//    9   15:ifeq            34
	//   10   18:aload_1         
	//   11   19:checkcast       #2   <Class AnnotatedConstructor>
	//   12   22:getfield        #23  <Field Constructor _constructor>
	//   13   25:aload_0         
	//   14   26:getfield        #23  <Field Constructor _constructor>
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
	//    1    1:invokevirtual   #68  <Method Constructor getAnnotated()>
	//    2    4:areturn         
	}

	public Constructor getAnnotated()
	{
		return _constructor;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:areturn         
	}

	public Class getDeclaringClass()
	{
		return _constructor.getDeclaringClass();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:invokevirtual   #72  <Method Class Constructor.getDeclaringClass()>
	//    3    7:areturn         
	}

	public Member getMember()
	{
		return ((Member) (_constructor));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:areturn         
	}

	public String getName()
	{
		return _constructor.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:invokevirtual   #79  <Method String Constructor.getName()>
	//    3    7:areturn         
	}

	public int getParameterCount()
	{
		return _constructor.getParameterTypes().length;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:invokevirtual   #85  <Method Class[] Constructor.getParameterTypes()>
	//    3    7:arraylength     
	//    4    8:ireturn         
	}

	public JavaType getParameterType(int i)
	{
		java.lang.reflect.Type atype[] = _constructor.getGenericParameterTypes();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:invokevirtual   #91  <Method java.lang.reflect.Type[] Constructor.getGenericParameterTypes()>
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
	//   11   17:getfield        #95  <Field TypeResolutionContext _typeContext>
	//   12   20:aload_2         
	//   13   21:iload_1         
	//   14   22:aaload          
	//   15   23:invokeinterface #101 <Method JavaType TypeResolutionContext.resolveType(java.lang.reflect.Type)>
	//   16   28:areturn         
	}

	public Class getRawParameterType(int i)
	{
		Class aclass[] = _constructor.getParameterTypes();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:invokevirtual   #85  <Method Class[] Constructor.getParameterTypes()>
	//    3    7:astore_2        
		if(i >= aclass.length)
	//*   4    8:iload_1         
	//*   5    9:aload_2         
	//*   6   10:arraylength     
	//*   7   11:icmplt          16
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		else
			return aclass[i];
	//   10   16:aload_2         
	//   11   17:iload_1         
	//   12   18:aaload          
	//   13   19:areturn         
	}

	public Class getRawType()
	{
		return _constructor.getDeclaringClass();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:invokevirtual   #72  <Method Class Constructor.getDeclaringClass()>
	//    3    7:areturn         
	}

	public JavaType getType()
	{
		return _typeContext.resolveType(((java.lang.reflect.Type) (getRawType())));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field TypeResolutionContext _typeContext>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #109 <Method Class getRawType()>
	//    4    8:invokeinterface #101 <Method JavaType TypeResolutionContext.resolveType(java.lang.reflect.Type)>
	//    5   13:areturn         
	}

	public Object getValue(Object obj)
		throws UnsupportedOperationException
	{
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #114 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #117 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append("Cannot call getValue() on constructor of ");
	//    4    8:aload_1         
	//    5    9:ldc1            #119 <String "Cannot call getValue() on constructor of ">
	//    6   11:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(getDeclaringClass().getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #124 <Method Class getDeclaringClass()>
	//   11   20:invokevirtual   #127 <Method String Class.getName()>
	//   12   23:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		throw new UnsupportedOperationException(((StringBuilder) (obj)).toString());
	//   14   27:new             #112 <Class UnsupportedOperationException>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   18   35:invokespecial   #131 <Method void UnsupportedOperationException(String)>
	//   19   38:athrow          
	}

	public int hashCode()
	{
		return _constructor.getName().hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:invokevirtual   #79  <Method String Constructor.getName()>
	//    3    7:invokevirtual   #136 <Method int String.hashCode()>
	//    4   10:ireturn         
	}

	Object readResolve()
	{
		Exception exception;
		Class class1 = _serialization.clazz;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AnnotatedConstructor$Serialization _serialization>
	//    2    4:getfield        #141 <Field Class AnnotatedConstructor$Serialization.clazz>
	//    3    7:astore_1        
		Object obj;
		try
		{
			obj = ((Object) (class1.getDeclaredConstructor(_serialization.args)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field AnnotatedConstructor$Serialization _serialization>
	//    7   13:getfield        #145 <Field Class[] AnnotatedConstructor$Serialization.args>
	//    8   16:invokevirtual   #149 <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    9   19:astore_2        
			if(!((Constructor) (obj)).isAccessible())
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #153 <Method boolean Constructor.isAccessible()>
	//*  12   24:ifne            32
				ClassUtil.checkAndFixAccess(((Member) (obj)), false);
	//   13   27:aload_2         
	//   14   28:iconst_0        
	//   15   29:invokestatic    #157 <Method void ClassUtil.checkAndFixAccess(Member, boolean)>
			obj = ((Object) (new AnnotatedConstructor(((TypeResolutionContext) (null)), ((Constructor) (obj)), ((AnnotationMap) (null)), ((AnnotationMap []) (null)))));
	//   16   32:new             #2   <Class AnnotatedConstructor>
	//   17   35:dup             
	//   18   36:aconst_null     
	//   19   37:aload_2         
	//   20   38:aconst_null     
	//   21   39:aconst_null     
	//   22   40:invokespecial   #159 <Method void AnnotatedConstructor(TypeResolutionContext, Constructor, AnnotationMap, AnnotationMap[])>
	//   23   43:astore_2        
		}
	//*  24   44:aload_2         
	//*  25   45:areturn         
	//*  26   46:new             #114 <Class StringBuilder>
	//*  27   49:dup             
	//*  28   50:invokespecial   #117 <Method void StringBuilder()>
	//*  29   53:astore_2        
	//*  30   54:aload_2         
	//*  31   55:ldc1            #161 <String "Could not find constructor with ">
	//*  32   57:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//*  33   60:pop             
	//*  34   61:aload_2         
	//*  35   62:aload_0         
	//*  36   63:getfield        #25  <Field AnnotatedConstructor$Serialization _serialization>
	//*  37   66:getfield        #145 <Field Class[] AnnotatedConstructor$Serialization.args>
	//*  38   69:arraylength     
	//*  39   70:invokevirtual   #164 <Method StringBuilder StringBuilder.append(int)>
	//*  40   73:pop             
	//*  41   74:aload_2         
	//*  42   75:ldc1            #166 <String " args from Class '">
	//*  43   77:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//*  44   80:pop             
	//*  45   81:aload_2         
	//*  46   82:aload_1         
	//*  47   83:invokevirtual   #127 <Method String Class.getName()>
	//*  48   86:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//*  49   89:pop             
	//*  50   90:new             #29  <Class IllegalArgumentException>
	//*  51   93:dup             
	//*  52   94:aload_2         
	//*  53   95:invokevirtual   #130 <Method String StringBuilder.toString()>
	//*  54   98:invokespecial   #34  <Method void IllegalArgumentException(String)>
	//*  55  101:athrow          
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("Could not find constructor with ");
			((StringBuilder) (obj)).append(_serialization.args.length);
			((StringBuilder) (obj)).append(" args from Class '");
			((StringBuilder) (obj)).append(class1.getName());
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
		}
		return obj;
	//*  56  102:astore_2        
	//*  57  103:goto            46
	}

	public void setValue(Object obj, Object obj1)
		throws UnsupportedOperationException
	{
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #114 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #117 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append("Cannot call setValue() on constructor of ");
	//    4    8:aload_1         
	//    5    9:ldc1            #170 <String "Cannot call setValue() on constructor of ">
	//    6   11:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(getDeclaringClass().getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #124 <Method Class getDeclaringClass()>
	//   11   20:invokevirtual   #127 <Method String Class.getName()>
	//   12   23:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		throw new UnsupportedOperationException(((StringBuilder) (obj)).toString());
	//   14   27:new             #112 <Class UnsupportedOperationException>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   18   35:invokespecial   #131 <Method void UnsupportedOperationException(String)>
	//   19   38:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #114 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #117 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[constructor for ");
	//    4    8:aload_1         
	//    5    9:ldc1            #172 <String "[constructor for ">
	//    6   11:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #173 <Method String getName()>
	//   11   20:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(", annotations: ");
	//   13   24:aload_1         
	//   14   25:ldc1            #175 <String ", annotations: ">
	//   15   27:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (_annotations)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #179 <Field AnnotationMap _annotations>
	//   20   36:invokevirtual   #182 <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append("]");
	//   22   40:aload_1         
	//   23   41:ldc1            #184 <String "]">
	//   24   43:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	public volatile Annotated withAnnotations(AnnotationMap annotationmap)
	{
		return ((Annotated) (withAnnotations(annotationmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #189 <Method AnnotatedConstructor withAnnotations(AnnotationMap)>
	//    3    5:areturn         
	}

	public AnnotatedConstructor withAnnotations(AnnotationMap annotationmap)
	{
		return new AnnotatedConstructor(_typeContext, _constructor, annotationmap, _paramAnnotations);
	//    0    0:new             #2   <Class AnnotatedConstructor>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #95  <Field TypeResolutionContext _typeContext>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field Constructor _constructor>
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #193 <Field AnnotationMap[] _paramAnnotations>
	//    9   17:invokespecial   #159 <Method void AnnotatedConstructor(TypeResolutionContext, Constructor, AnnotationMap, AnnotationMap[])>
	//   10   20:areturn         
	}

	Object writeReplace()
	{
		return ((Object) (new AnnotatedConstructor(new Serialization(_constructor))));
	//    0    0:new             #2   <Class AnnotatedConstructor>
	//    1    3:dup             
	//    2    4:new             #6   <Class AnnotatedConstructor$Serialization>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field Constructor _constructor>
	//    6   12:invokespecial   #197 <Method void AnnotatedConstructor$Serialization(Constructor)>
	//    7   15:invokespecial   #199 <Method void AnnotatedConstructor(AnnotatedConstructor$Serialization)>
	//    8   18:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Constructor _constructor;
	protected Serialization _serialization;
}
