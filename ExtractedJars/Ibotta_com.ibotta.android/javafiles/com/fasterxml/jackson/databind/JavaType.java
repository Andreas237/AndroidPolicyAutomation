// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

public abstract class JavaType extends ResolvedType
	implements Serializable, Type
{

	protected JavaType(Class class1, int i, Object obj, Object obj1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void ResolvedType()>
		_class = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field Class _class>
		_hash = class1.getName().hashCode() + i;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #35  <Method String Class.getName()>
	//    8   14:invokevirtual   #41  <Method int String.hashCode()>
	//    9   17:iload_2         
	//   10   18:iadd            
	//   11   19:putfield        #43  <Field int _hash>
		_valueHandler = obj;
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:putfield        #45  <Field Object _valueHandler>
		_typeHandler = obj1;
	//   15   27:aload_0         
	//   16   28:aload           4
	//   17   30:putfield        #47  <Field Object _typeHandler>
		_asStatic = flag;
	//   18   33:aload_0         
	//   19   34:iload           5
	//   20   36:putfield        #49  <Field boolean _asStatic>
	//   21   39:return          
	}

	public abstract JavaType containedType(int i);

	public abstract int containedTypeCount();

	public JavaType containedTypeOrUnknown(int i)
	{
		JavaType javatype1 = containedType(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #58  <Method JavaType containedType(int)>
	//    3    5:astore_3        
		JavaType javatype = javatype1;
	//    4    6:aload_3         
	//    5    7:astore_2        
		if(javatype1 == null)
	//*   6    8:aload_3         
	//*   7    9:ifnonnull       16
			javatype = TypeFactory.unknownType();
	//    8   12:invokestatic    #64  <Method JavaType TypeFactory.unknownType()>
	//    9   15:astore_2        
		return javatype;
	//   10   16:aload_2         
	//   11   17:areturn         
	}

	public abstract boolean equals(Object obj);

	public abstract JavaType findSuperType(Class class1);

	public abstract TypeBindings getBindings();

	public JavaType getContentType()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String getGenericSignature()
	{
		StringBuilder stringbuilder = new StringBuilder(40);
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          40
	//    3    6:invokespecial   #77  <Method void StringBuilder(int)>
	//    4    9:astore_1        
		getGenericSignature(stringbuilder);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #80  <Method StringBuilder getGenericSignature(StringBuilder)>
	//    8   15:pop             
		return stringbuilder.toString();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   11   20:areturn         
	}

	public abstract StringBuilder getGenericSignature(StringBuilder stringbuilder);

	public abstract List getInterfaces();

	public JavaType getKeyType()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final Class getRawClass()
	{
		return _class;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _class>
	//    2    4:areturn         
	}

	public volatile ResolvedType getReferencedType()
	{
		return ((ResolvedType) (getReferencedType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method JavaType getReferencedType()>
	//    2    4:areturn         
	}

	public JavaType getReferencedType()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract JavaType getSuperClass();

	public Object getTypeHandler()
	{
		return _typeHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Object _typeHandler>
	//    2    4:areturn         
	}

	public Object getValueHandler()
	{
		return _valueHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Object _valueHandler>
	//    2    4:areturn         
	}

	public boolean hasContentType()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean hasGenericTypes()
	{
		return containedTypeCount() > 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #103 <Method int containedTypeCount()>
	//    2    4:ifle            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hasHandlers()
	{
		return _typeHandler != null || _valueHandler != null;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Object _typeHandler>
	//    2    4:ifnonnull       19
	//    3    7:aload_0         
	//    4    8:getfield        #45  <Field Object _valueHandler>
	//    5   11:ifnull          17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public final boolean hasRawClass(Class class1)
	{
		return _class == class1;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _class>
	//    2    4:aload_1         
	//    3    5:if_acmpne       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final int hashCode()
	{
		return _hash;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int _hash>
	//    2    4:ireturn         
	}

	public boolean isAbstract()
	{
		return Modifier.isAbstract(_class.getModifiers());
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _class>
	//    2    4:invokevirtual   #111 <Method int Class.getModifiers()>
	//    3    7:invokestatic    #116 <Method boolean Modifier.isAbstract(int)>
	//    4   10:ireturn         
	}

	public boolean isArrayType()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isCollectionLikeType()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isConcrete()
	{
		if((_class.getModifiers() & 0x600) == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field Class _class>
	//*   2    4:invokevirtual   #111 <Method int Class.getModifiers()>
	//*   3    7:sipush          1536
	//*   4   10:iand            
	//*   5   11:ifne            16
			return true;
	//    6   14:iconst_1        
	//    7   15:ireturn         
		else
			return _class.isPrimitive();
	//    8   16:aload_0         
	//    9   17:getfield        #29  <Field Class _class>
	//   10   20:invokevirtual   #122 <Method boolean Class.isPrimitive()>
	//   11   23:ireturn         
	}

	public abstract boolean isContainerType();

	public final boolean isEnumType()
	{
		return _class.isEnum();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _class>
	//    2    4:invokevirtual   #127 <Method boolean Class.isEnum()>
	//    3    7:ireturn         
	}

	public final boolean isFinal()
	{
		return Modifier.isFinal(_class.getModifiers());
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _class>
	//    2    4:invokevirtual   #111 <Method int Class.getModifiers()>
	//    3    7:invokestatic    #130 <Method boolean Modifier.isFinal(int)>
	//    4   10:ireturn         
	}

	public final boolean isInterface()
	{
		return _class.isInterface();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _class>
	//    2    4:invokevirtual   #133 <Method boolean Class.isInterface()>
	//    3    7:ireturn         
	}

	public final boolean isJavaLangObject()
	{
		return _class == java/lang/Object;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _class>
	//    2    4:ldc1            #136 <Class Object>
	//    3    6:if_acmpne       11
	//    4    9:iconst_1        
	//    5   10:ireturn         
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}

	public boolean isMapLikeType()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean isPrimitive()
	{
		return _class.isPrimitive();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _class>
	//    2    4:invokevirtual   #122 <Method boolean Class.isPrimitive()>
	//    3    7:ireturn         
	}

	public boolean isThrowable()
	{
		return ((Class) (java/lang/Throwable)).isAssignableFrom(_class);
	//    0    0:ldc1            #140 <Class Throwable>
	//    1    2:aload_0         
	//    2    3:getfield        #29  <Field Class _class>
	//    3    6:invokevirtual   #143 <Method boolean Class.isAssignableFrom(Class)>
	//    4    9:ireturn         
	}

	public final boolean isTypeOrSubTypeOf(Class class1)
	{
		Class class2 = _class;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _class>
	//    2    4:astore_2        
		return class2 == class1 || class1.isAssignableFrom(class2);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:if_acmpeq       23
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #143 <Method boolean Class.isAssignableFrom(Class)>
	//    9   15:ifeq            21
	//   10   18:goto            23
	//   11   21:iconst_0        
	//   12   22:ireturn         
	//   13   23:iconst_1        
	//   14   24:ireturn         
	}

	public final boolean isTypeOrSuperTypeOf(Class class1)
	{
		Class class2 = _class;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _class>
	//    2    4:astore_2        
		return class2 == class1 || class2.isAssignableFrom(class1);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:if_acmpeq       23
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #143 <Method boolean Class.isAssignableFrom(Class)>
	//    9   15:ifeq            21
	//   10   18:goto            23
	//   11   21:iconst_0        
	//   12   22:ireturn         
	//   13   23:iconst_1        
	//   14   24:ireturn         
	}

	public abstract JavaType refine(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[]);

	public abstract String toString();

	public final boolean useStaticType()
	{
		return _asStatic;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean _asStatic>
	//    2    4:ireturn         
	}

	public abstract JavaType withContentType(JavaType javatype);

	public abstract JavaType withContentTypeHandler(Object obj);

	public abstract JavaType withContentValueHandler(Object obj);

	public JavaType withHandlersFrom(JavaType javatype)
	{
		Object obj = javatype.getTypeHandler();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #156 <Method Object getTypeHandler()>
	//    2    4:astore_2        
		if(obj != _typeHandler)
	//*   3    5:aload_2         
	//*   4    6:aload_0         
	//*   5    7:getfield        #47  <Field Object _typeHandler>
	//*   6   10:if_acmpeq       22
			obj = ((Object) (withTypeHandler(obj)));
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #159 <Method JavaType withTypeHandler(Object)>
	//   10   18:astore_2        
		else
	//*  11   19:goto            24
			obj = ((Object) (this));
	//   12   22:aload_0         
	//   13   23:astore_2        
		Object obj1 = javatype.getValueHandler();
	//   14   24:aload_1         
	//   15   25:invokevirtual   #161 <Method Object getValueHandler()>
	//   16   28:astore_3        
		javatype = ((JavaType) (obj));
	//   17   29:aload_2         
	//   18   30:astore_1        
		if(obj1 != _valueHandler)
	//*  19   31:aload_3         
	//*  20   32:aload_0         
	//*  21   33:getfield        #45  <Field Object _valueHandler>
	//*  22   36:if_acmpeq       45
			javatype = ((JavaType) (obj)).withValueHandler(obj1);
	//   23   39:aload_2         
	//   24   40:aload_3         
	//   25   41:invokevirtual   #164 <Method JavaType withValueHandler(Object)>
	//   26   44:astore_1        
		return javatype;
	//   27   45:aload_1         
	//   28   46:areturn         
	}

	public abstract JavaType withStaticTyping();

	public abstract JavaType withTypeHandler(Object obj);

	public abstract JavaType withValueHandler(Object obj);

	private static final long serialVersionUID = 1L;
	protected final boolean _asStatic;
	protected final Class _class;
	protected final int _hash;
	protected final Object _typeHandler;
	protected final Object _valueHandler;
}
