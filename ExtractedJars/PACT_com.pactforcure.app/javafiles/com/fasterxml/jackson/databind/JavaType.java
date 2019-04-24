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

	protected JavaType(JavaType javatype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void ResolvedType()>
		_class = javatype._class;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #29  <Field Class _class>
	//    5    9:putfield        #29  <Field Class _class>
		_hash = javatype._hash;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #31  <Field int _hash>
	//    9   17:putfield        #31  <Field int _hash>
		_valueHandler = javatype._valueHandler;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #33  <Field Object _valueHandler>
	//   13   25:putfield        #33  <Field Object _valueHandler>
		_typeHandler = javatype._typeHandler;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #35  <Field Object _typeHandler>
	//   17   33:putfield        #35  <Field Object _typeHandler>
		_asStatic = javatype._asStatic;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #37  <Field boolean _asStatic>
	//   21   41:putfield        #37  <Field boolean _asStatic>
	//   22   44:return          
	}

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
	//    7   11:invokevirtual   #45  <Method String Class.getName()>
	//    8   14:invokevirtual   #51  <Method int String.hashCode()>
	//    9   17:iload_2         
	//   10   18:iadd            
	//   11   19:putfield        #31  <Field int _hash>
		_valueHandler = obj;
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:putfield        #33  <Field Object _valueHandler>
		_typeHandler = obj1;
	//   15   27:aload_0         
	//   16   28:aload           4
	//   17   30:putfield        #35  <Field Object _typeHandler>
		_asStatic = flag;
	//   18   33:aload_0         
	//   19   34:iload           5
	//   20   36:putfield        #37  <Field boolean _asStatic>
	//   21   39:return          
	}

	protected abstract JavaType _narrow(Class class1);

	public volatile ResolvedType containedType(int i)
	{
		return ((ResolvedType) (containedType(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #61  <Method JavaType containedType(int)>
	//    3    5:areturn         
	}

	public abstract JavaType containedType(int i);

	public abstract int containedTypeCount();

	public abstract String containedTypeName(int i);

	public JavaType containedTypeOrUnknown(int i)
	{
		JavaType javatype1 = containedType(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #61  <Method JavaType containedType(int)>
	//    3    5:astore_3        
		JavaType javatype = javatype1;
	//    4    6:aload_3         
	//    5    7:astore_2        
		if(javatype1 == null)
	//*   6    8:aload_3         
	//*   7    9:ifnonnull       16
			javatype = TypeFactory.unknownType();
	//    8   12:invokestatic    #71  <Method JavaType TypeFactory.unknownType()>
	//    9   15:astore_2        
		return javatype;
	//   10   16:aload_2         
	//   11   17:areturn         
	}

	public abstract boolean equals(Object obj);

	public abstract JavaType findSuperType(Class class1);

	public abstract JavaType[] findTypeParameters(Class class1);

	public JavaType forcedNarrowBy(Class class1)
	{
		if(class1 == _class)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #29  <Field Class _class>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		Object obj = ((Object) (_narrow(class1)));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #79  <Method JavaType _narrow(Class)>
	//    9   15:astore_2        
		class1 = ((Class) (obj));
	//   10   16:aload_2         
	//   11   17:astore_1        
		if(_valueHandler != ((JavaType) (obj)).getValueHandler())
	//*  12   18:aload_0         
	//*  13   19:getfield        #33  <Field Object _valueHandler>
	//*  14   22:aload_2         
	//*  15   23:invokevirtual   #83  <Method Object getValueHandler()>
	//*  16   26:if_acmpeq       38
			class1 = ((Class) (((JavaType) (obj)).withValueHandler(_valueHandler)));
	//   17   29:aload_2         
	//   18   30:aload_0         
	//   19   31:getfield        #33  <Field Object _valueHandler>
	//   20   34:invokevirtual   #87  <Method JavaType withValueHandler(Object)>
	//   21   37:astore_1        
		obj = ((Object) (class1));
	//   22   38:aload_1         
	//   23   39:astore_2        
		if(_typeHandler != ((JavaType) (class1)).getTypeHandler())
	//*  24   40:aload_0         
	//*  25   41:getfield        #35  <Field Object _typeHandler>
	//*  26   44:aload_1         
	//*  27   45:invokevirtual   #90  <Method Object getTypeHandler()>
	//*  28   48:if_acmpeq       60
			obj = ((Object) (((JavaType) (class1)).withTypeHandler(_typeHandler)));
	//   29   51:aload_1         
	//   30   52:aload_0         
	//   31   53:getfield        #35  <Field Object _typeHandler>
	//   32   56:invokevirtual   #93  <Method JavaType withTypeHandler(Object)>
	//   33   59:astore_2        
		return ((JavaType) (obj));
	//   34   60:aload_2         
	//   35   61:areturn         
	}

	public abstract TypeBindings getBindings();

	public volatile ResolvedType getContentType()
	{
		return ((ResolvedType) (getContentType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #101 <Method JavaType getContentType()>
	//    2    4:areturn         
	}

	public JavaType getContentType()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getContentTypeHandler()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getContentValueHandler()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String getErasedSignature()
	{
		StringBuilder stringbuilder = new StringBuilder(40);
	//    0    0:new             #106 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          40
	//    3    6:invokespecial   #109 <Method void StringBuilder(int)>
	//    4    9:astore_1        
		getErasedSignature(stringbuilder);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #112 <Method StringBuilder getErasedSignature(StringBuilder)>
	//    8   15:pop             
		return stringbuilder.toString();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   11   20:areturn         
	}

	public abstract StringBuilder getErasedSignature(StringBuilder stringbuilder);

	public String getGenericSignature()
	{
		StringBuilder stringbuilder = new StringBuilder(40);
	//    0    0:new             #106 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          40
	//    3    6:invokespecial   #109 <Method void StringBuilder(int)>
	//    4    9:astore_1        
		getGenericSignature(stringbuilder);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #118 <Method StringBuilder getGenericSignature(StringBuilder)>
	//    8   15:pop             
		return stringbuilder.toString();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   11   20:areturn         
	}

	public abstract StringBuilder getGenericSignature(StringBuilder stringbuilder);

	public abstract List getInterfaces();

	public volatile ResolvedType getKeyType()
	{
		return ((ResolvedType) (getKeyType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #123 <Method JavaType getKeyType()>
	//    2    4:areturn         
	}

	public JavaType getKeyType()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Class getParameterSource()
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
	//    1    1:invokevirtual   #130 <Method JavaType getReferencedType()>
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
	//    1    1:getfield        #35  <Field Object _typeHandler>
	//    2    4:areturn         
	}

	public Object getValueHandler()
	{
		return _valueHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Object _valueHandler>
	//    2    4:areturn         
	}

	public boolean hasGenericTypes()
	{
		return containedTypeCount() > 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #136 <Method int containedTypeCount()>
	//    2    4:ifle            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
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

	public boolean hasValueHandler()
	{
		return _valueHandler != null;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Object _valueHandler>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final int hashCode()
	{
		return _hash;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int _hash>
	//    2    4:ireturn         
	}

	public boolean isAbstract()
	{
		return Modifier.isAbstract(_class.getModifiers());
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _class>
	//    2    4:invokevirtual   #144 <Method int Class.getModifiers()>
	//    3    7:invokestatic    #149 <Method boolean Modifier.isAbstract(int)>
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
	//*   2    4:invokevirtual   #144 <Method int Class.getModifiers()>
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
	//   10   20:invokevirtual   #155 <Method boolean Class.isPrimitive()>
	//   11   23:ireturn         
	}

	public abstract boolean isContainerType();

	public final boolean isEnumType()
	{
		return _class.isEnum();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _class>
	//    2    4:invokevirtual   #160 <Method boolean Class.isEnum()>
	//    3    7:ireturn         
	}

	public final boolean isFinal()
	{
		return Modifier.isFinal(_class.getModifiers());
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _class>
	//    2    4:invokevirtual   #144 <Method int Class.getModifiers()>
	//    3    7:invokestatic    #163 <Method boolean Modifier.isFinal(int)>
	//    4   10:ireturn         
	}

	public final boolean isInterface()
	{
		return _class.isInterface();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _class>
	//    2    4:invokevirtual   #166 <Method boolean Class.isInterface()>
	//    3    7:ireturn         
	}

	public final boolean isJavaLangObject()
	{
		return _class == java/lang/Object;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _class>
	//    2    4:ldc1            #169 <Class Object>
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
	//    2    4:invokevirtual   #155 <Method boolean Class.isPrimitive()>
	//    3    7:ireturn         
	}

	public boolean isThrowable()
	{
		return ((Class) (java/lang/Throwable)).isAssignableFrom(_class);
	//    0    0:ldc1            #173 <Class Throwable>
	//    1    2:aload_0         
	//    2    3:getfield        #29  <Field Class _class>
	//    3    6:invokevirtual   #176 <Method boolean Class.isAssignableFrom(Class)>
	//    4    9:ireturn         
	}

	public final boolean isTypeOrSubTypeOf(Class class1)
	{
		return _class == class1 || class1.isAssignableFrom(_class);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Class _class>
	//    2    4:aload_1         
	//    3    5:if_acmpeq       19
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field Class _class>
	//    7   13:invokevirtual   #176 <Method boolean Class.isAssignableFrom(Class)>
	//    8   16:ifeq            21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	public abstract JavaType refine(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[]);

	public abstract String toString();

	public final boolean useStaticType()
	{
		return _asStatic;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean _asStatic>
	//    2    4:ireturn         
	}

	public abstract JavaType withContentType(JavaType javatype);

	public abstract JavaType withContentTypeHandler(Object obj);

	public abstract JavaType withContentValueHandler(Object obj);

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
