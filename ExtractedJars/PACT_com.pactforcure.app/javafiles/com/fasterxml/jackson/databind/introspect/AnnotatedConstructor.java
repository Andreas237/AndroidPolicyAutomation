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
		if(constructor == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       22
		{
			throw new IllegalArgumentException("Null constructor not allowed");
	//    7   12:new             #29  <Class IllegalArgumentException>
	//    8   15:dup             
	//    9   16:ldc1            #31  <String "Null constructor not allowed">
	//   10   18:invokespecial   #34  <Method void IllegalArgumentException(String)>
	//   11   21:athrow          
		} else
		{
			_constructor = constructor;
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:putfield        #23  <Field Constructor _constructor>
			return;
	//   15   27:return          
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
	//*   8   12:invokevirtual   #57  <Method Class Object.getClass()>
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #57  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			if(((AnnotatedConstructor)obj)._constructor != _constructor)
	//*  14   24:aload_1         
	//*  15   25:checkcast       #2   <Class AnnotatedConstructor>
	//*  16   28:getfield        #23  <Field Constructor _constructor>
	//*  17   31:aload_0         
	//*  18   32:getfield        #23  <Field Constructor _constructor>
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
	//    1    1:invokevirtual   #62  <Method Constructor getAnnotated()>
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
	//    2    4:invokevirtual   #66  <Method Class Constructor.getDeclaringClass()>
	//    3    7:areturn         
	}

	public Member getMember()
	{
		return ((Member) (_constructor));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:areturn         
	}

	public int getModifiers()
	{
		return _constructor.getModifiers();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:invokevirtual   #73  <Method int Constructor.getModifiers()>
	//    3    7:ireturn         
	}

	public String getName()
	{
		return _constructor.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:invokevirtual   #77  <Method String Constructor.getName()>
	//    3    7:areturn         
	}

	public int getParameterCount()
	{
		return _constructor.getParameterTypes().length;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:invokevirtual   #82  <Method Class[] Constructor.getParameterTypes()>
	//    3    7:arraylength     
	//    4    8:ireturn         
	}

	public JavaType getParameterType(int i)
	{
		java.lang.reflect.Type atype[] = _constructor.getGenericParameterTypes();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:invokevirtual   #88  <Method java.lang.reflect.Type[] Constructor.getGenericParameterTypes()>
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
	//   11   17:getfield        #92  <Field TypeResolutionContext _typeContext>
	//   12   20:aload_2         
	//   13   21:iload_1         
	//   14   22:aaload          
	//   15   23:invokeinterface #98  <Method JavaType TypeResolutionContext.resolveType(java.lang.reflect.Type)>
	//   16   28:areturn         
	}

	public Class getRawParameterType(int i)
	{
		Class aclass[] = _constructor.getParameterTypes();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:invokevirtual   #82  <Method Class[] Constructor.getParameterTypes()>
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
	//    2    4:invokevirtual   #66  <Method Class Constructor.getDeclaringClass()>
	//    3    7:areturn         
	}

	public JavaType getType()
	{
		return _typeContext.resolveType(((java.lang.reflect.Type) (getRawType())));
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field TypeResolutionContext _typeContext>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #106 <Method Class getRawType()>
	//    4    8:invokeinterface #98  <Method JavaType TypeResolutionContext.resolveType(java.lang.reflect.Type)>
	//    5   13:areturn         
	}

	public Object getValue(Object obj)
		throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException((new StringBuilder()).append("Cannot call getValue() on constructor of ").append(getDeclaringClass().getName()).toString());
	//    0    0:new             #109 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:new             #111 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #114 <Method void StringBuilder()>
	//    5   11:ldc1            #116 <String "Cannot call getValue() on constructor of ">
	//    6   13:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:invokevirtual   #121 <Method Class getDeclaringClass()>
	//    9   20:invokevirtual   #124 <Method String Class.getName()>
	//   10   23:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   12   29:invokespecial   #128 <Method void UnsupportedOperationException(String)>
	//   13   32:athrow          
	}

	public int hashCode()
	{
		return _constructor.getName().hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Constructor _constructor>
	//    2    4:invokevirtual   #77  <Method String Constructor.getName()>
	//    3    7:invokevirtual   #133 <Method int String.hashCode()>
	//    4   10:ireturn         
	}

	Object readResolve()
	{
		Class class1 = _serialization.clazz;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AnnotatedConstructor$Serialization _serialization>
	//    2    4:getfield        #138 <Field Class AnnotatedConstructor$Serialization.clazz>
	//    3    7:astore_1        
		Object obj;
		try
		{
			obj = ((Object) (class1.getDeclaredConstructor(_serialization.args)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field AnnotatedConstructor$Serialization _serialization>
	//    7   13:getfield        #142 <Field Class[] AnnotatedConstructor$Serialization.args>
	//    8   16:invokevirtual   #146 <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    9   19:astore_2        
			if(!((Constructor) (obj)).isAccessible())
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #150 <Method boolean Constructor.isAccessible()>
	//*  12   24:ifne            32
				ClassUtil.checkAndFixAccess(((Member) (obj)), false);
	//   13   27:aload_2         
	//   14   28:iconst_0        
	//   15   29:invokestatic    #156 <Method void ClassUtil.checkAndFixAccess(Member, boolean)>
			obj = ((Object) (new AnnotatedConstructor(((TypeResolutionContext) (null)), ((Constructor) (obj)), ((AnnotationMap) (null)), ((AnnotationMap []) (null)))));
	//   16   32:new             #2   <Class AnnotatedConstructor>
	//   17   35:dup             
	//   18   36:aconst_null     
	//   19   37:aload_2         
	//   20   38:aconst_null     
	//   21   39:aconst_null     
	//   22   40:invokespecial   #158 <Method void AnnotatedConstructor(TypeResolutionContext, Constructor, AnnotationMap, AnnotationMap[])>
	//   23   43:astore_2        
		}
	//*  24   44:aload_2         
	//*  25   45:areturn         
		catch(Exception exception)
	//*  26   46:astore_2        
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Could not find constructor with ").append(_serialization.args.length).append(" args from Class '").append(class1.getName()).toString());
	//   27   47:new             #29  <Class IllegalArgumentException>
	//   28   50:dup             
	//   29   51:new             #111 <Class StringBuilder>
	//   30   54:dup             
	//   31   55:invokespecial   #114 <Method void StringBuilder()>
	//   32   58:ldc1            #160 <String "Could not find constructor with ">
	//   33   60:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   34   63:aload_0         
	//   35   64:getfield        #25  <Field AnnotatedConstructor$Serialization _serialization>
	//   36   67:getfield        #142 <Field Class[] AnnotatedConstructor$Serialization.args>
	//   37   70:arraylength     
	//   38   71:invokevirtual   #163 <Method StringBuilder StringBuilder.append(int)>
	//   39   74:ldc1            #165 <String " args from Class '">
	//   40   76:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   41   79:aload_1         
	//   42   80:invokevirtual   #124 <Method String Class.getName()>
	//   43   83:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   44   86:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   45   89:invokespecial   #34  <Method void IllegalArgumentException(String)>
	//   46   92:athrow          
		}
		return obj;
	}

	public void setValue(Object obj, Object obj1)
		throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException((new StringBuilder()).append("Cannot call setValue() on constructor of ").append(getDeclaringClass().getName()).toString());
	//    0    0:new             #109 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:new             #111 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #114 <Method void StringBuilder()>
	//    5   11:ldc1            #169 <String "Cannot call setValue() on constructor of ">
	//    6   13:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:invokevirtual   #121 <Method Class getDeclaringClass()>
	//    9   20:invokevirtual   #124 <Method String Class.getName()>
	//   10   23:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   12   29:invokespecial   #128 <Method void UnsupportedOperationException(String)>
	//   13   32:athrow          
	}

	public String toString()
	{
		return (new StringBuilder()).append("[constructor for ").append(getName()).append(", annotations: ").append(((Object) (_annotations))).append("]").toString();
	//    0    0:new             #111 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #114 <Method void StringBuilder()>
	//    3    7:ldc1            #171 <String "[constructor for ">
	//    4    9:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #172 <Method String getName()>
	//    7   16:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #174 <String ", annotations: ">
	//    9   21:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #178 <Field AnnotationMap _annotations>
	//   12   28:invokevirtual   #181 <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:ldc1            #183 <String "]">
	//   14   33:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   16   39:areturn         
	}

	public volatile Annotated withAnnotations(AnnotationMap annotationmap)
	{
		return ((Annotated) (withAnnotations(annotationmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #188 <Method AnnotatedConstructor withAnnotations(AnnotationMap)>
	//    3    5:areturn         
	}

	public AnnotatedConstructor withAnnotations(AnnotationMap annotationmap)
	{
		return new AnnotatedConstructor(_typeContext, _constructor, annotationmap, _paramAnnotations);
	//    0    0:new             #2   <Class AnnotatedConstructor>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #92  <Field TypeResolutionContext _typeContext>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field Constructor _constructor>
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #192 <Field AnnotationMap[] _paramAnnotations>
	//    9   17:invokespecial   #158 <Method void AnnotatedConstructor(TypeResolutionContext, Constructor, AnnotationMap, AnnotationMap[])>
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
	//    6   12:invokespecial   #196 <Method void AnnotatedConstructor$Serialization(Constructor)>
	//    7   15:invokespecial   #198 <Method void AnnotatedConstructor(AnnotatedConstructor$Serialization)>
	//    8   18:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Constructor _constructor;
	protected Serialization _serialization;
}
