// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedMember, TypeResolutionContext, AnnotationMap, Annotated

public class VirtualAnnotatedMember extends AnnotatedMember
	implements Serializable
{

	public VirtualAnnotatedMember(TypeResolutionContext typeresolutioncontext, Class class1, String s, Class class2)
	{
		super(typeresolutioncontext, ((AnnotationMap) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #21  <Method void AnnotatedMember(TypeResolutionContext, AnnotationMap)>
		_declaringClass = class1;
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:putfield        #23  <Field Class _declaringClass>
		_rawType = class2;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #25  <Field Class _rawType>
		_name = s;
	//   10   17:aload_0         
	//   11   18:aload_3         
	//   12   19:putfield        #27  <Field String _name>
	//   13   22:return          
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
	//*   8   12:invokevirtual   #38  <Method Class Object.getClass()>
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #38  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((VirtualAnnotatedMember)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class VirtualAnnotatedMember>
	//   16   28:astore_1        
			if(((VirtualAnnotatedMember) (obj))._declaringClass != _declaringClass || !((VirtualAnnotatedMember) (obj))._name.equals(((Object) (_name))))
	//*  17   29:aload_1         
	//*  18   30:getfield        #23  <Field Class _declaringClass>
	//*  19   33:aload_0         
	//*  20   34:getfield        #23  <Field Class _declaringClass>
	//*  21   37:if_acmpne       54
	//*  22   40:aload_1         
	//*  23   41:getfield        #27  <Field String _name>
	//*  24   44:aload_0         
	//*  25   45:getfield        #27  <Field String _name>
	//*  26   48:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*  27   51:ifne            5
				return false;
	//   28   54:iconst_0        
	//   29   55:ireturn         
		}
		return true;
	}

	public volatile AnnotatedElement getAnnotated()
	{
		return ((AnnotatedElement) (getAnnotated()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method Field getAnnotated()>
	//    2    4:areturn         
	}

	public Field getAnnotated()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getAnnotationCount()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Class getDeclaringClass()
	{
		return _declaringClass;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Class _declaringClass>
	//    2    4:areturn         
	}

	public String getFullName()
	{
		return (new StringBuilder()).append(getDeclaringClass().getName()).append("#").append(getName()).toString();
	//    0    0:new             #55  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #60  <Method Class getDeclaringClass()>
	//    5   11:invokevirtual   #65  <Method String Class.getName()>
	//    6   14:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #71  <String "#">
	//    8   19:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_0         
	//   10   23:invokevirtual   #72  <Method String getName()>
	//   11   26:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   12   29:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   13   32:areturn         
	}

	public Member getMember()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getModifiers()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getName()
	{
		return _name;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String _name>
	//    2    4:areturn         
	}

	public Class getRawType()
	{
		return _rawType;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Class _rawType>
	//    2    4:areturn         
	}

	public JavaType getType()
	{
		return _typeContext.resolveType(((java.lang.reflect.Type) (_rawType)));
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field TypeResolutionContext _typeContext>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field Class _rawType>
	//    4    8:invokeinterface #91  <Method JavaType TypeResolutionContext.resolveType(java.lang.reflect.Type)>
	//    5   13:areturn         
	}

	public Object getValue(Object obj)
		throws IllegalArgumentException
	{
		throw new IllegalArgumentException((new StringBuilder()).append("Can not get virtual property '").append(_name).append("'").toString());
	//    0    0:new             #95  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:new             #55  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #58  <Method void StringBuilder()>
	//    5   11:ldc1            #97  <String "Can not get virtual property '">
	//    6   13:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:getfield        #27  <Field String _name>
	//    9   20:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:ldc1            #99  <String "'">
	//   11   25:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   12   28:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   13   31:invokespecial   #102 <Method void IllegalArgumentException(String)>
	//   14   34:athrow          
	}

	public int hashCode()
	{
		return _name.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String _name>
	//    2    4:invokevirtual   #106 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public void setValue(Object obj, Object obj1)
		throws IllegalArgumentException
	{
		throw new IllegalArgumentException((new StringBuilder()).append("Can not set virtual property '").append(_name).append("'").toString());
	//    0    0:new             #95  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:new             #55  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #58  <Method void StringBuilder()>
	//    5   11:ldc1            #110 <String "Can not set virtual property '">
	//    6   13:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:getfield        #27  <Field String _name>
	//    9   20:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:ldc1            #99  <String "'">
	//   11   25:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   12   28:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   13   31:invokespecial   #102 <Method void IllegalArgumentException(String)>
	//   14   34:athrow          
	}

	public String toString()
	{
		return (new StringBuilder()).append("[field ").append(getFullName()).append("]").toString();
	//    0    0:new             #55  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void StringBuilder()>
	//    3    7:ldc1            #112 <String "[field ">
	//    4    9:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #114 <Method String getFullName()>
	//    7   16:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #116 <String "]">
	//    9   21:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	public Annotated withAnnotations(AnnotationMap annotationmap)
	{
		return ((Annotated) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Class _declaringClass;
	protected final String _name;
	protected final Class _rawType;
}
