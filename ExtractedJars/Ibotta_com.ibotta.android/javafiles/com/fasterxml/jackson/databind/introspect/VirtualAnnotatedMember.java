// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedMember, TypeResolutionContext, AnnotationMap, Annotated

public class VirtualAnnotatedMember extends AnnotatedMember
	implements Serializable
{

	public VirtualAnnotatedMember(TypeResolutionContext typeresolutioncontext, Class class1, String s, JavaType javatype)
	{
		super(typeresolutioncontext, ((AnnotationMap) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #22  <Method void AnnotatedMember(TypeResolutionContext, AnnotationMap)>
		_declaringClass = class1;
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:putfield        #24  <Field Class _declaringClass>
		_type = javatype;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #26  <Field JavaType _type>
		_name = s;
	//   10   17:aload_0         
	//   11   18:aload_3         
	//   12   19:putfield        #28  <Field String _name>
	//   13   22:return          
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
		if(!ClassUtil.hasClass(obj, ((Object)this).getClass()))
	//*   5    7:aload_1         
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #39  <Method Class Object.getClass()>
	//*   8   12:invokestatic    #45  <Method boolean ClassUtil.hasClass(Object, Class)>
	//*   9   15:ifne            20
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		obj = ((Object) ((VirtualAnnotatedMember)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class VirtualAnnotatedMember>
	//   14   24:astore_1        
		return ((VirtualAnnotatedMember) (obj))._declaringClass == _declaringClass && ((VirtualAnnotatedMember) (obj))._name.equals(((Object) (_name)));
	//   15   25:aload_1         
	//   16   26:getfield        #24  <Field Class _declaringClass>
	//   17   29:aload_0         
	//   18   30:getfield        #24  <Field Class _declaringClass>
	//   19   33:if_acmpne       52
	//   20   36:aload_1         
	//   21   37:getfield        #28  <Field String _name>
	//   22   40:aload_0         
	//   23   41:getfield        #28  <Field String _name>
	//   24   44:invokevirtual   #49  <Method boolean String.equals(Object)>
	//   25   47:ifeq            52
	//   26   50:iconst_1        
	//   27   51:ireturn         
	//   28   52:iconst_0        
	//   29   53:ireturn         
	}

	public volatile AnnotatedElement getAnnotated()
	{
		return ((AnnotatedElement) (getAnnotated()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method Field getAnnotated()>
	//    2    4:areturn         
	}

	public Field getAnnotated()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Class getDeclaringClass()
	{
		return _declaringClass;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Class _declaringClass>
	//    2    4:areturn         
	}

	public Member getMember()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String getName()
	{
		return _name;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String _name>
	//    2    4:areturn         
	}

	public Class getRawType()
	{
		return _type.getRawClass();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field JavaType _type>
	//    2    4:invokevirtual   #66  <Method Class JavaType.getRawClass()>
	//    3    7:areturn         
	}

	public JavaType getType()
	{
		return _type;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field JavaType _type>
	//    2    4:areturn         
	}

	public Object getValue(Object obj)
		throws IllegalArgumentException
	{
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append("Cannot get virtual property '");
	//    4    8:aload_1         
	//    5    9:ldc1            #79  <String "Cannot get virtual property '">
	//    6   11:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(_name);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #28  <Field String _name>
	//   11   20:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		((StringBuilder) (obj)).append("'");
	//   13   24:aload_1         
	//   14   25:ldc1            #85  <String "'">
	//   15   27:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   17   31:new             #72  <Class IllegalArgumentException>
	//   18   34:dup             
	//   19   35:aload_1         
	//   20   36:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   21   39:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//   22   42:athrow          
	}

	public int hashCode()
	{
		return _name.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String _name>
	//    2    4:invokevirtual   #96  <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public void setValue(Object obj, Object obj1)
		throws IllegalArgumentException
	{
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append("Cannot set virtual property '");
	//    4    8:aload_1         
	//    5    9:ldc1            #100 <String "Cannot set virtual property '">
	//    6   11:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(_name);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #28  <Field String _name>
	//   11   20:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		((StringBuilder) (obj)).append("'");
	//   13   24:aload_1         
	//   14   25:ldc1            #85  <String "'">
	//   15   27:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   17   31:new             #72  <Class IllegalArgumentException>
	//   18   34:dup             
	//   19   35:aload_1         
	//   20   36:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   21   39:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//   22   42:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[virtual ");
	//    4    8:aload_1         
	//    5    9:ldc1            #102 <String "[virtual ">
	//    6   11:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getFullName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #105 <Method String getFullName()>
	//   11   20:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("]");
	//   13   24:aload_1         
	//   14   25:ldc1            #107 <String "]">
	//   15   27:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   19   35:areturn         
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
	protected final JavaType _type;
}
