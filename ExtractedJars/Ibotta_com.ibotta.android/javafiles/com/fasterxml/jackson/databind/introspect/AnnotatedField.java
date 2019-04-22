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
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		return ClassUtil.hasClass(obj, ((Object)this).getClass()) && ((AnnotatedField)obj)._field == _field;
	//    5    7:aload_1         
	//    6    8:aload_0         
	//    7    9:invokevirtual   #36  <Method Class Object.getClass()>
	//    8   12:invokestatic    #42  <Method boolean ClassUtil.hasClass(Object, Class)>
	//    9   15:ifeq            34
	//   10   18:aload_1         
	//   11   19:checkcast       #2   <Class AnnotatedField>
	//   12   22:getfield        #24  <Field Field _field>
	//   13   25:aload_0         
	//   14   26:getfield        #24  <Field Field _field>
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
	//    1    1:invokevirtual   #47  <Method Field getAnnotated()>
	//    2    4:areturn         
	}

	public Field getAnnotated()
	{
		return _field;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Field _field>
	//    2    4:areturn         
	}

	public Class getDeclaringClass()
	{
		return _field.getDeclaringClass();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Field _field>
	//    2    4:invokevirtual   #52  <Method Class Field.getDeclaringClass()>
	//    3    7:areturn         
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
	//    2    4:invokevirtual   #60  <Method int Field.getModifiers()>
	//    3    7:ireturn         
	}

	public String getName()
	{
		return _field.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Field _field>
	//    2    4:invokevirtual   #64  <Method String Field.getName()>
	//    3    7:areturn         
	}

	public Class getRawType()
	{
		return _field.getType();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Field _field>
	//    2    4:invokevirtual   #68  <Method Class Field.getType()>
	//    3    7:areturn         
	}

	public JavaType getType()
	{
		return _typeContext.resolveType(_field.getGenericType());
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field TypeResolutionContext _typeContext>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field Field _field>
	//    4    8:invokevirtual   #77  <Method java.lang.reflect.Type Field.getGenericType()>
	//    5   11:invokeinterface #83  <Method JavaType TypeResolutionContext.resolveType(java.lang.reflect.Type)>
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
	//    3    5:invokevirtual   #92  <Method Object Field.get(Object)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   7   11:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   12:new             #94  <Class StringBuilder>
	//    9   15:dup             
	//   10   16:invokespecial   #97  <Method void StringBuilder()>
	//   11   19:astore_2        
			stringbuilder.append("Failed to getValue() for field ");
	//   12   20:aload_2         
	//   13   21:ldc1            #99  <String "Failed to getValue() for field ">
	//   14   23:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   15   26:pop             
			stringbuilder.append(getFullName());
	//   16   27:aload_2         
	//   17   28:aload_0         
	//   18   29:invokevirtual   #106 <Method String getFullName()>
	//   19   32:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   20   35:pop             
			stringbuilder.append(": ");
	//   21   36:aload_2         
	//   22   37:ldc1            #108 <String ": ">
	//   23   39:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   24   42:pop             
			stringbuilder.append(((IllegalAccessException) (obj)).getMessage());
	//   25   43:aload_2         
	//   26   44:aload_1         
	//   27   45:invokevirtual   #111 <Method String IllegalAccessException.getMessage()>
	//   28   48:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   29   51:pop             
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (obj)));
	//   30   52:new             #87  <Class IllegalArgumentException>
	//   31   55:dup             
	//   32   56:aload_2         
	//   33   57:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   34   60:aload_1         
	//   35   61:invokespecial   #117 <Method void IllegalArgumentException(String, Throwable)>
	//   36   64:athrow          
		}
		return obj;
	}

	public int hashCode()
	{
		return _field.getName().hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Field _field>
	//    2    4:invokevirtual   #64  <Method String Field.getName()>
	//    3    7:invokevirtual   #123 <Method int String.hashCode()>
	//    4   10:ireturn         
	}

	public boolean isTransient()
	{
		return Modifier.isTransient(getModifiers());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #126 <Method int getModifiers()>
	//    2    4:invokestatic    #131 <Method boolean Modifier.isTransient(int)>
	//    3    7:ireturn         
	}

	Object readResolve()
	{
		Exception exception;
		Class class1 = _serialization.clazz;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field AnnotatedField$Serialization _serialization>
	//    2    4:getfield        #139 <Field Class AnnotatedField$Serialization.clazz>
	//    3    7:astore_1        
		Object obj;
		try
		{
			obj = ((Object) (class1.getDeclaredField(_serialization.name)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field AnnotatedField$Serialization _serialization>
	//    7   13:getfield        #143 <Field String AnnotatedField$Serialization.name>
	//    8   16:invokevirtual   #149 <Method Field Class.getDeclaredField(String)>
	//    9   19:astore_2        
			if(!((Field) (obj)).isAccessible())
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #152 <Method boolean Field.isAccessible()>
	//*  12   24:ifne            32
				ClassUtil.checkAndFixAccess(((Member) (obj)), false);
	//   13   27:aload_2         
	//   14   28:iconst_0        
	//   15   29:invokestatic    #156 <Method void ClassUtil.checkAndFixAccess(Member, boolean)>
			obj = ((Object) (new AnnotatedField(((TypeResolutionContext) (null)), ((Field) (obj)), ((AnnotationMap) (null)))));
	//   16   32:new             #2   <Class AnnotatedField>
	//   17   35:dup             
	//   18   36:aconst_null     
	//   19   37:aload_2         
	//   20   38:aconst_null     
	//   21   39:invokespecial   #158 <Method void AnnotatedField(TypeResolutionContext, Field, AnnotationMap)>
	//   22   42:astore_2        
		}
	//*  23   43:aload_2         
	//*  24   44:areturn         
	//*  25   45:new             #94  <Class StringBuilder>
	//*  26   48:dup             
	//*  27   49:invokespecial   #97  <Method void StringBuilder()>
	//*  28   52:astore_2        
	//*  29   53:aload_2         
	//*  30   54:ldc1            #160 <String "Could not find method '">
	//*  31   56:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  32   59:pop             
	//*  33   60:aload_2         
	//*  34   61:aload_0         
	//*  35   62:getfield        #26  <Field AnnotatedField$Serialization _serialization>
	//*  36   65:getfield        #143 <Field String AnnotatedField$Serialization.name>
	//*  37   68:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  38   71:pop             
	//*  39   72:aload_2         
	//*  40   73:ldc1            #162 <String "' from Class '">
	//*  41   75:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  42   78:pop             
	//*  43   79:aload_2         
	//*  44   80:aload_1         
	//*  45   81:invokevirtual   #163 <Method String Class.getName()>
	//*  46   84:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  47   87:pop             
	//*  48   88:new             #87  <Class IllegalArgumentException>
	//*  49   91:dup             
	//*  50   92:aload_2         
	//*  51   93:invokevirtual   #114 <Method String StringBuilder.toString()>
	//*  52   96:invokespecial   #166 <Method void IllegalArgumentException(String)>
	//*  53   99:athrow          
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
	//*  54  100:astore_2        
	//*  55  101:goto            45
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
	//    4    6:invokevirtual   #171 <Method void Field.set(Object, Object)>
			return;
	//    5    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   6   10:astore_1        
		{
			obj1 = ((Object) (new StringBuilder()));
	//    7   11:new             #94  <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #97  <Method void StringBuilder()>
	//   10   18:astore_2        
		}
		((StringBuilder) (obj1)).append("Failed to setValue() for field ");
	//   11   19:aload_2         
	//   12   20:ldc1            #173 <String "Failed to setValue() for field ">
	//   13   22:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
		((StringBuilder) (obj1)).append(getFullName());
	//   15   26:aload_2         
	//   16   27:aload_0         
	//   17   28:invokevirtual   #106 <Method String getFullName()>
	//   18   31:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
		((StringBuilder) (obj1)).append(": ");
	//   20   35:aload_2         
	//   21   36:ldc1            #108 <String ": ">
	//   22   38:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   23   41:pop             
		((StringBuilder) (obj1)).append(((IllegalAccessException) (obj)).getMessage());
	//   24   42:aload_2         
	//   25   43:aload_1         
	//   26   44:invokevirtual   #111 <Method String IllegalAccessException.getMessage()>
	//   27   47:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   28   50:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj1)).toString(), ((Throwable) (obj)));
	//   29   51:new             #87  <Class IllegalArgumentException>
	//   30   54:dup             
	//   31   55:aload_2         
	//   32   56:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   33   59:aload_1         
	//   34   60:invokespecial   #117 <Method void IllegalArgumentException(String, Throwable)>
	//   35   63:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #94  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #97  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[field ");
	//    4    8:aload_1         
	//    5    9:ldc1            #175 <String "[field ">
	//    6   11:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getFullName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #106 <Method String getFullName()>
	//   11   20:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("]");
	//   13   24:aload_1         
	//   14   25:ldc1            #177 <String "]">
	//   15   27:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	public volatile Annotated withAnnotations(AnnotationMap annotationmap)
	{
		return ((Annotated) (withAnnotations(annotationmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #182 <Method AnnotatedField withAnnotations(AnnotationMap)>
	//    3    5:areturn         
	}

	public AnnotatedField withAnnotations(AnnotationMap annotationmap)
	{
		return new AnnotatedField(_typeContext, _field, annotationmap);
	//    0    0:new             #2   <Class AnnotatedField>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #73  <Field TypeResolutionContext _typeContext>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field Field _field>
	//    6   12:aload_1         
	//    7   13:invokespecial   #158 <Method void AnnotatedField(TypeResolutionContext, Field, AnnotationMap)>
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
	//    6   12:invokespecial   #186 <Method void AnnotatedField$Serialization(Field)>
	//    7   15:invokespecial   #188 <Method void AnnotatedField(AnnotatedField$Serialization)>
	//    8   18:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final transient Field _field;
	protected Serialization _serialization;
}
