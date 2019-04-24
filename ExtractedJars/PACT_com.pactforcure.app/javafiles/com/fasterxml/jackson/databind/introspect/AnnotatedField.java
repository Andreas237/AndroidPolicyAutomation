// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedMember, AnnotationMap, TypeResolutionContext, Annotated

public final class AnnotatedField extends AnnotatedMember
	implements Serializable
{
	private static final class Serialization
		implements Serializable
	{

		private static final long serialVersionUID = 1L;
		protected Class clazz;
		protected String name;

		public Serialization(Field field)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			clazz = field.getDeclaringClass();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #29  <Method Class Field.getDeclaringClass()>
		//    5    9:putfield        #31  <Field Class clazz>
			name = field.getName();
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #35  <Method String Field.getName()>
		//    9   17:putfield        #37  <Field String name>
		//   10   20:return          
		}
	}


	protected AnnotatedField(Serialization serialization)
	{
		super(((TypeResolutionContext) (null)), ((AnnotationMap) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:invokespecial   #22  <Method void AnnotatedMember(TypeResolutionContext, AnnotationMap)>
		_field = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #24  <Field Field _field>
		_serialization = serialization;
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:putfield        #26  <Field AnnotatedField$Serialization _serialization>
	//   10   16:return          
	}

	public AnnotatedField(TypeResolutionContext typeresolutioncontext, Field field, AnnotationMap annotationmap)
	{
		super(typeresolutioncontext, annotationmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #22  <Method void AnnotatedMember(TypeResolutionContext, AnnotationMap)>
		_field = field;
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:putfield        #24  <Field Field _field>
	//    7   11:return          
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
	//*   8   12:invokevirtual   #36  <Method Class Object.getClass()>
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #36  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			if(((AnnotatedField)obj)._field != _field)
	//*  14   24:aload_1         
	//*  15   25:checkcast       #2   <Class AnnotatedField>
	//*  16   28:getfield        #24  <Field Field _field>
	//*  17   31:aload_0         
	//*  18   32:getfield        #24  <Field Field _field>
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
	//    1    1:invokevirtual   #41  <Method Field getAnnotated()>
	//    2    4:areturn         
	}

	public Field getAnnotated()
	{
		return _field;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Field _field>
	//    2    4:areturn         
	}

	public int getAnnotationCount()
	{
		return _annotations.size();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field AnnotationMap _annotations>
	//    2    4:invokevirtual   #52  <Method int AnnotationMap.size()>
	//    3    7:ireturn         
	}

	public Class getDeclaringClass()
	{
		return _field.getDeclaringClass();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Field _field>
	//    2    4:invokevirtual   #57  <Method Class Field.getDeclaringClass()>
	//    3    7:areturn         
	}

	public String getFullName()
	{
		return (new StringBuilder()).append(getDeclaringClass().getName()).append("#").append(getName()).toString();
	//    0    0:new             #63  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #67  <Method Class getDeclaringClass()>
	//    5   11:invokevirtual   #72  <Method String Class.getName()>
	//    6   14:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #78  <String "#">
	//    8   19:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_0         
	//   10   23:invokevirtual   #79  <Method String getName()>
	//   11   26:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   12   29:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   13   32:areturn         
	}

	public Member getMember()
	{
		return ((Member) (_field));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Field _field>
	//    2    4:areturn         
	}

	public int getModifiers()
	{
		return _field.getModifiers();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Field _field>
	//    2    4:invokevirtual   #87  <Method int Field.getModifiers()>
	//    3    7:ireturn         
	}

	public String getName()
	{
		return _field.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Field _field>
	//    2    4:invokevirtual   #88  <Method String Field.getName()>
	//    3    7:areturn         
	}

	public Class getRawType()
	{
		return _field.getType();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Field _field>
	//    2    4:invokevirtual   #92  <Method Class Field.getType()>
	//    3    7:areturn         
	}

	public JavaType getType()
	{
		return _typeContext.resolveType(_field.getGenericType());
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field TypeResolutionContext _typeContext>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field Field _field>
	//    4    8:invokevirtual   #101 <Method java.lang.reflect.Type Field.getGenericType()>
	//    5   11:invokeinterface #107 <Method JavaType TypeResolutionContext.resolveType(java.lang.reflect.Type)>
	//    6   16:areturn         
	}

	public Object getValue(Object obj)
		throws IllegalArgumentException
	{
		try
		{
			obj = _field.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Field _field>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #116 <Method Object Field.get(Object)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   7   11:astore_1        
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Failed to getValue() for field ").append(getFullName()).append(": ").append(((IllegalAccessException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
	//    8   12:new             #111 <Class IllegalArgumentException>
	//    9   15:dup             
	//   10   16:new             #63  <Class StringBuilder>
	//   11   19:dup             
	//   12   20:invokespecial   #66  <Method void StringBuilder()>
	//   13   23:ldc1            #118 <String "Failed to getValue() for field ">
	//   14   25:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:aload_0         
	//   16   29:invokevirtual   #120 <Method String getFullName()>
	//   17   32:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:ldc1            #122 <String ": ">
	//   19   37:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #125 <Method String IllegalAccessException.getMessage()>
	//   22   44:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   24   50:aload_1         
	//   25   51:invokespecial   #128 <Method void IllegalArgumentException(String, Throwable)>
	//   26   54:athrow          
		}
		return obj;
	}

	public int hashCode()
	{
		return _field.getName().hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Field _field>
	//    2    4:invokevirtual   #88  <Method String Field.getName()>
	//    3    7:invokevirtual   #134 <Method int String.hashCode()>
	//    4   10:ireturn         
	}

	public boolean isTransient()
	{
		return Modifier.isTransient(getModifiers());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #137 <Method int getModifiers()>
	//    2    4:invokestatic    #142 <Method boolean Modifier.isTransient(int)>
	//    3    7:ireturn         
	}

	Object readResolve()
	{
		Class class1 = _serialization.clazz;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field AnnotatedField$Serialization _serialization>
	//    2    4:getfield        #150 <Field Class AnnotatedField$Serialization.clazz>
	//    3    7:astore_1        
		Object obj;
		try
		{
			obj = ((Object) (class1.getDeclaredField(_serialization.name)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field AnnotatedField$Serialization _serialization>
	//    7   13:getfield        #154 <Field String AnnotatedField$Serialization.name>
	//    8   16:invokevirtual   #158 <Method Field Class.getDeclaredField(String)>
	//    9   19:astore_2        
			if(!((Field) (obj)).isAccessible())
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #161 <Method boolean Field.isAccessible()>
	//*  12   24:ifne            32
				ClassUtil.checkAndFixAccess(((Member) (obj)), false);
	//   13   27:aload_2         
	//   14   28:iconst_0        
	//   15   29:invokestatic    #167 <Method void ClassUtil.checkAndFixAccess(Member, boolean)>
			obj = ((Object) (new AnnotatedField(((TypeResolutionContext) (null)), ((Field) (obj)), ((AnnotationMap) (null)))));
	//   16   32:new             #2   <Class AnnotatedField>
	//   17   35:dup             
	//   18   36:aconst_null     
	//   19   37:aload_2         
	//   20   38:aconst_null     
	//   21   39:invokespecial   #169 <Method void AnnotatedField(TypeResolutionContext, Field, AnnotationMap)>
	//   22   42:astore_2        
		}
	//*  23   43:aload_2         
	//*  24   44:areturn         
		catch(Exception exception)
	//*  25   45:astore_2        
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Could not find method '").append(_serialization.name).append("' from Class '").append(class1.getName()).toString());
	//   26   46:new             #111 <Class IllegalArgumentException>
	//   27   49:dup             
	//   28   50:new             #63  <Class StringBuilder>
	//   29   53:dup             
	//   30   54:invokespecial   #66  <Method void StringBuilder()>
	//   31   57:ldc1            #171 <String "Could not find method '">
	//   32   59:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   33   62:aload_0         
	//   34   63:getfield        #26  <Field AnnotatedField$Serialization _serialization>
	//   35   66:getfield        #154 <Field String AnnotatedField$Serialization.name>
	//   36   69:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   37   72:ldc1            #173 <String "' from Class '">
	//   38   74:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   39   77:aload_1         
	//   40   78:invokevirtual   #72  <Method String Class.getName()>
	//   41   81:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   42   84:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   43   87:invokespecial   #176 <Method void IllegalArgumentException(String)>
	//   44   90:athrow          
		}
		return obj;
	}

	public void setValue(Object obj, Object obj1)
		throws IllegalArgumentException
	{
		try
		{
			_field.set(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Field _field>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #181 <Method void Field.set(Object, Object)>
			return;
	//    5    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   6   10:astore_1        
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Failed to setValue() for field ").append(getFullName()).append(": ").append(((IllegalAccessException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
	//    7   11:new             #111 <Class IllegalArgumentException>
	//    8   14:dup             
	//    9   15:new             #63  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #66  <Method void StringBuilder()>
	//   12   22:ldc1            #183 <String "Failed to setValue() for field ">
	//   13   24:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:aload_0         
	//   15   28:invokevirtual   #120 <Method String getFullName()>
	//   16   31:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:ldc1            #122 <String ": ">
	//   18   36:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #125 <Method String IllegalAccessException.getMessage()>
	//   21   43:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   22   46:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   23   49:aload_1         
	//   24   50:invokespecial   #128 <Method void IllegalArgumentException(String, Throwable)>
	//   25   53:athrow          
		}
	}

	public String toString()
	{
		return (new StringBuilder()).append("[field ").append(getFullName()).append("]").toString();
	//    0    0:new             #63  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void StringBuilder()>
	//    3    7:ldc1            #185 <String "[field ">
	//    4    9:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #120 <Method String getFullName()>
	//    7   16:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #187 <String "]">
	//    9   21:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	public volatile Annotated withAnnotations(AnnotationMap annotationmap)
	{
		return ((Annotated) (withAnnotations(annotationmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #192 <Method AnnotatedField withAnnotations(AnnotationMap)>
	//    3    5:areturn         
	}

	public AnnotatedField withAnnotations(AnnotationMap annotationmap)
	{
		return new AnnotatedField(_typeContext, _field, annotationmap);
	//    0    0:new             #2   <Class AnnotatedField>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #97  <Field TypeResolutionContext _typeContext>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field Field _field>
	//    6   12:aload_1         
	//    7   13:invokespecial   #169 <Method void AnnotatedField(TypeResolutionContext, Field, AnnotationMap)>
	//    8   16:areturn         
	}

	Object writeReplace()
	{
		return ((Object) (new AnnotatedField(new Serialization(_field))));
	//    0    0:new             #2   <Class AnnotatedField>
	//    1    3:dup             
	//    2    4:new             #8   <Class AnnotatedField$Serialization>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field Field _field>
	//    6   12:invokespecial   #196 <Method void AnnotatedField$Serialization(Field)>
	//    7   15:invokespecial   #198 <Method void AnnotatedField(AnnotatedField$Serialization)>
	//    8   18:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final transient Field _field;
	protected Serialization _serialization;
}
