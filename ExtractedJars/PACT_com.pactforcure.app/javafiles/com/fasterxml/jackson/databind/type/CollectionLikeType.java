// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.JavaType;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeBase, TypeBindings

public class CollectionLikeType extends TypeBase
{

	protected CollectionLikeType(TypeBase typebase, JavaType javatype)
	{
		super(typebase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void TypeBase(TypeBase)>
		_elementType = javatype;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field JavaType _elementType>
	//    6   10:return          
	}

	protected CollectionLikeType(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[], JavaType javatype1, Object obj, Object obj1, 
			boolean flag)
	{
		super(class1, typebindings, javatype, ajavatype, javatype1.hashCode(), obj, obj1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokevirtual   #25  <Method int JavaType.hashCode()>
	//    7   11:aload           6
	//    8   13:aload           7
	//    9   15:iload           8
	//   10   17:invokespecial   #28  <Method void TypeBase(Class, TypeBindings, JavaType, JavaType[], int, Object, Object, boolean)>
		_elementType = javatype1;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #17  <Field JavaType _elementType>
	//   14   26:return          
	}

	public static CollectionLikeType construct(Class class1, JavaType javatype)
	{
		java.lang.reflect.TypeVariable atypevariable[] = class1.getTypeParameters();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method java.lang.reflect.TypeVariable[] Class.getTypeParameters()>
	//    2    4:astore_2        
		TypeBindings typebindings;
		if(atypevariable == null || atypevariable.length != 1)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
	//*   5    9:aload_2         
	//*   6   10:arraylength     
	//*   7   11:iconst_1        
	//*   8   12:icmpeq          38
			typebindings = TypeBindings.emptyBindings();
	//    9   15:invokestatic    #45  <Method TypeBindings TypeBindings.emptyBindings()>
	//   10   18:astore_2        
		else
	//*  11   19:new             #2   <Class CollectionLikeType>
	//*  12   22:dup             
	//*  13   23:aload_0         
	//*  14   24:aload_2         
	//*  15   25:aload_0         
	//*  16   26:invokestatic    #49  <Method JavaType _bogusSuperClass(Class)>
	//*  17   29:aconst_null     
	//*  18   30:aload_1         
	//*  19   31:aconst_null     
	//*  20   32:aconst_null     
	//*  21   33:iconst_0        
	//*  22   34:invokespecial   #51  <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//*  23   37:areturn         
			typebindings = TypeBindings.create(class1, javatype);
	//   24   38:aload_0         
	//   25   39:aload_1         
	//   26   40:invokestatic    #55  <Method TypeBindings TypeBindings.create(Class, JavaType)>
	//   27   43:astore_2        
		return new CollectionLikeType(class1, typebindings, _bogusSuperClass(class1), ((JavaType []) (null)), javatype, ((Object) (null)), ((Object) (null)), false);
	//*  28   44:goto            19
	}

	public static CollectionLikeType construct(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[], JavaType javatype1)
	{
		return new CollectionLikeType(class1, typebindings, javatype, ajavatype, javatype1, ((Object) (null)), ((Object) (null)), false);
	//    0    0:new             #2   <Class CollectionLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aconst_null     
	//    8   11:aconst_null     
	//    9   12:iconst_0        
	//   10   13:invokespecial   #51  <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   11   16:areturn         
	}

	public static CollectionLikeType upgradeFrom(JavaType javatype, JavaType javatype1)
	{
		if(javatype instanceof TypeBase)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #4   <Class TypeBase>
	//*   2    4:ifeq            20
			return new CollectionLikeType((TypeBase)javatype, javatype1);
	//    3    7:new             #2   <Class CollectionLikeType>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:checkcast       #4   <Class TypeBase>
	//    7   15:aload_1         
	//    8   16:invokespecial   #63  <Method void CollectionLikeType(TypeBase, JavaType)>
	//    9   19:areturn         
		else
			throw new IllegalArgumentException((new StringBuilder()).append("Can not upgrade from an instance of ").append(((Object) (((Object) (javatype)).getClass()))).toString());
	//   10   20:new             #65  <Class IllegalArgumentException>
	//   11   23:dup             
	//   12   24:new             #67  <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #70  <Method void StringBuilder()>
	//   15   31:ldc1            #72  <String "Can not upgrade from an instance of ">
	//   16   33:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   17   36:aload_0         
	//   18   37:invokevirtual   #82  <Method Class Object.getClass()>
	//   19   40:invokevirtual   #85  <Method StringBuilder StringBuilder.append(Object)>
	//   20   43:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   21   46:invokespecial   #92  <Method void IllegalArgumentException(String)>
	//   22   49:athrow          
	}

	protected JavaType _narrow(Class class1)
	{
		return ((JavaType) (new CollectionLikeType(class1, _bindings, _superClass, _superInterfaces, _elementType, _valueHandler, _typeHandler, _asStatic)));
	//    0    0:new             #2   <Class CollectionLikeType>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #97  <Field TypeBindings _bindings>
	//    5    9:aload_0         
	//    6   10:getfield        #100 <Field JavaType _superClass>
	//    7   13:aload_0         
	//    8   14:getfield        #104 <Field JavaType[] _superInterfaces>
	//    9   17:aload_0         
	//   10   18:getfield        #17  <Field JavaType _elementType>
	//   11   21:aload_0         
	//   12   22:getfield        #108 <Field Object _valueHandler>
	//   13   25:aload_0         
	//   14   26:getfield        #111 <Field Object _typeHandler>
	//   15   29:aload_0         
	//   16   30:getfield        #115 <Field boolean _asStatic>
	//   17   33:invokespecial   #51  <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   18   36:areturn         
	}

	protected String buildCanonicalName()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #67  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(_class.getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #121 <Field Class _class>
	//    7   13:invokevirtual   #124 <Method String Class.getName()>
	//    8   16:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		if(_elementType != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #17  <Field JavaType _elementType>
	//*  12   24:ifnull          53
		{
			stringbuilder.append('<');
	//   13   27:aload_1         
	//   14   28:bipush          60
	//   15   30:invokevirtual   #127 <Method StringBuilder StringBuilder.append(char)>
	//   16   33:pop             
			stringbuilder.append(_elementType.toCanonical());
	//   17   34:aload_1         
	//   18   35:aload_0         
	//   19   36:getfield        #17  <Field JavaType _elementType>
	//   20   39:invokevirtual   #130 <Method String JavaType.toCanonical()>
	//   21   42:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   22   45:pop             
			stringbuilder.append('>');
	//   23   46:aload_1         
	//   24   47:bipush          62
	//   25   49:invokevirtual   #127 <Method StringBuilder StringBuilder.append(char)>
	//   26   52:pop             
		}
		return stringbuilder.toString();
	//   27   53:aload_1         
	//   28   54:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   29   57:areturn         
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
			if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
				return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
			if(obj.getClass() != ((Object)this).getClass())
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #82  <Method Class Object.getClass()>
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #82  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
				return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
			obj = ((Object) ((CollectionLikeType)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class CollectionLikeType>
	//   18   30:astore_1        
			if(_class != ((CollectionLikeType) (obj))._class || !_elementType.equals(((Object) (((CollectionLikeType) (obj))._elementType))))
	//*  19   31:aload_0         
	//*  20   32:getfield        #121 <Field Class _class>
	//*  21   35:aload_1         
	//*  22   36:getfield        #121 <Field Class _class>
	//*  23   39:if_acmpne       56
	//*  24   42:aload_0         
	//*  25   43:getfield        #17  <Field JavaType _elementType>
	//*  26   46:aload_1         
	//*  27   47:getfield        #17  <Field JavaType _elementType>
	//*  28   50:invokevirtual   #134 <Method boolean JavaType.equals(Object)>
	//*  29   53:ifne            5
				return false;
	//   30   56:iconst_0        
	//   31   57:ireturn         
		}
		return true;
	}

	public volatile ResolvedType getContentType()
	{
		return ((ResolvedType) (getContentType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method JavaType getContentType()>
	//    2    4:areturn         
	}

	public JavaType getContentType()
	{
		return _elementType;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field JavaType _elementType>
	//    2    4:areturn         
	}

	public Object getContentTypeHandler()
	{
		return _elementType.getTypeHandler();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field JavaType _elementType>
	//    2    4:invokevirtual   #144 <Method Object JavaType.getTypeHandler()>
	//    3    7:areturn         
	}

	public Object getContentValueHandler()
	{
		return _elementType.getValueHandler();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field JavaType _elementType>
	//    2    4:invokevirtual   #148 <Method Object JavaType.getValueHandler()>
	//    3    7:areturn         
	}

	public StringBuilder getErasedSignature(StringBuilder stringbuilder)
	{
		return _classSignature(_class, stringbuilder, true);
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field Class _class>
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:invokestatic    #154 <Method StringBuilder _classSignature(Class, StringBuilder, boolean)>
	//    5    9:areturn         
	}

	public StringBuilder getGenericSignature(StringBuilder stringbuilder)
	{
		_classSignature(_class, stringbuilder, false);
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field Class _class>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokestatic    #154 <Method StringBuilder _classSignature(Class, StringBuilder, boolean)>
	//    5    9:pop             
		stringbuilder.append('<');
	//    6   10:aload_1         
	//    7   11:bipush          60
	//    8   13:invokevirtual   #127 <Method StringBuilder StringBuilder.append(char)>
	//    9   16:pop             
		_elementType.getGenericSignature(stringbuilder);
	//   10   17:aload_0         
	//   11   18:getfield        #17  <Field JavaType _elementType>
	//   12   21:aload_1         
	//   13   22:invokevirtual   #157 <Method StringBuilder JavaType.getGenericSignature(StringBuilder)>
	//   14   25:pop             
		stringbuilder.append(">;");
	//   15   26:aload_1         
	//   16   27:ldc1            #159 <String ">;">
	//   17   29:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
		return stringbuilder;
	//   19   33:aload_1         
	//   20   34:areturn         
	}

	public boolean isCollectionLikeType()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isContainerType()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isTrueCollectionType()
	{
		return ((Class) (java/util/Collection)).isAssignableFrom(_class);
	//    0    0:ldc1            #165 <Class Collection>
	//    1    2:aload_0         
	//    2    3:getfield        #121 <Field Class _class>
	//    3    6:invokevirtual   #169 <Method boolean Class.isAssignableFrom(Class)>
	//    4    9:ireturn         
	}

	public JavaType refine(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		return ((JavaType) (new CollectionLikeType(class1, typebindings, javatype, ajavatype, _elementType, _valueHandler, _typeHandler, _asStatic)));
	//    0    0:new             #2   <Class CollectionLikeType>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload_0         
	//    7   10:getfield        #17  <Field JavaType _elementType>
	//    8   13:aload_0         
	//    9   14:getfield        #108 <Field Object _valueHandler>
	//   10   17:aload_0         
	//   11   18:getfield        #111 <Field Object _typeHandler>
	//   12   21:aload_0         
	//   13   22:getfield        #115 <Field boolean _asStatic>
	//   14   25:invokespecial   #51  <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   15   28:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("[collection-like type; class ").append(_class.getName()).append(", contains ").append(((Object) (_elementType))).append("]").toString();
	//    0    0:new             #67  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void StringBuilder()>
	//    3    7:ldc1            #174 <String "[collection-like type; class ">
	//    4    9:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #121 <Field Class _class>
	//    7   16:invokevirtual   #124 <Method String Class.getName()>
	//    8   19:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #176 <String ", contains ">
	//   10   24:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #17  <Field JavaType _elementType>
	//   13   31:invokevirtual   #85  <Method StringBuilder StringBuilder.append(Object)>
	//   14   34:ldc1            #178 <String "]">
	//   15   36:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   17   42:areturn         
	}

	public JavaType withContentType(JavaType javatype)
	{
		if(_elementType == javatype)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field JavaType _elementType>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return ((JavaType) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((JavaType) (new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, javatype, _valueHandler, _typeHandler, _asStatic)));
	//    6   10:new             #2   <Class CollectionLikeType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #121 <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #97  <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #100 <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #104 <Field JavaType[] _superInterfaces>
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #108 <Field Object _valueHandler>
	//   19   35:aload_0         
	//   20   36:getfield        #111 <Field Object _typeHandler>
	//   21   39:aload_0         
	//   22   40:getfield        #115 <Field boolean _asStatic>
	//   23   43:invokespecial   #51  <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   24   46:areturn         
	}

	public volatile JavaType withContentTypeHandler(Object obj)
	{
		return ((JavaType) (withContentTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #185 <Method CollectionLikeType withContentTypeHandler(Object)>
	//    3    5:areturn         
	}

	public CollectionLikeType withContentTypeHandler(Object obj)
	{
		return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType.withTypeHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class CollectionLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #121 <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #97  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #100 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #104 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #17  <Field JavaType _elementType>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #188 <Method JavaType JavaType.withTypeHandler(Object)>
	//   14   28:aload_0         
	//   15   29:getfield        #108 <Field Object _valueHandler>
	//   16   32:aload_0         
	//   17   33:getfield        #111 <Field Object _typeHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #115 <Field boolean _asStatic>
	//   20   40:invokespecial   #51  <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   21   43:areturn         
	}

	public volatile JavaType withContentValueHandler(Object obj)
	{
		return ((JavaType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #191 <Method CollectionLikeType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public CollectionLikeType withContentValueHandler(Object obj)
	{
		return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType.withValueHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class CollectionLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #121 <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #97  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #100 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #104 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #17  <Field JavaType _elementType>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #194 <Method JavaType JavaType.withValueHandler(Object)>
	//   14   28:aload_0         
	//   15   29:getfield        #108 <Field Object _valueHandler>
	//   16   32:aload_0         
	//   17   33:getfield        #111 <Field Object _typeHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #115 <Field boolean _asStatic>
	//   20   40:invokespecial   #51  <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   21   43:areturn         
	}

	public volatile JavaType withStaticTyping()
	{
		return ((JavaType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #198 <Method CollectionLikeType withStaticTyping()>
	//    2    4:areturn         
	}

	public CollectionLikeType withStaticTyping()
	{
		if(_asStatic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean _asStatic>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType.withStaticTyping(), _valueHandler, _typeHandler, true);
	//    5    9:new             #2   <Class CollectionLikeType>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #121 <Field Class _class>
	//    9   17:aload_0         
	//   10   18:getfield        #97  <Field TypeBindings _bindings>
	//   11   21:aload_0         
	//   12   22:getfield        #100 <Field JavaType _superClass>
	//   13   25:aload_0         
	//   14   26:getfield        #104 <Field JavaType[] _superInterfaces>
	//   15   29:aload_0         
	//   16   30:getfield        #17  <Field JavaType _elementType>
	//   17   33:invokevirtual   #200 <Method JavaType JavaType.withStaticTyping()>
	//   18   36:aload_0         
	//   19   37:getfield        #108 <Field Object _valueHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #111 <Field Object _typeHandler>
	//   22   44:iconst_1        
	//   23   45:invokespecial   #51  <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   24   48:areturn         
	}

	public volatile JavaType withTypeHandler(Object obj)
	{
		return ((JavaType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #202 <Method CollectionLikeType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public CollectionLikeType withTypeHandler(Object obj)
	{
		return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType, _valueHandler, obj, _asStatic);
	//    0    0:new             #2   <Class CollectionLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #121 <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #97  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #100 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #104 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #17  <Field JavaType _elementType>
	//   12   24:aload_0         
	//   13   25:getfield        #108 <Field Object _valueHandler>
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #115 <Field boolean _asStatic>
	//   17   33:invokespecial   #51  <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   18   36:areturn         
	}

	public volatile JavaType withValueHandler(Object obj)
	{
		return ((JavaType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #204 <Method CollectionLikeType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public CollectionLikeType withValueHandler(Object obj)
	{
		return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType, obj, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class CollectionLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #121 <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #97  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #100 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #104 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #17  <Field JavaType _elementType>
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #111 <Field Object _typeHandler>
	//   15   29:aload_0         
	//   16   30:getfield        #115 <Field boolean _asStatic>
	//   17   33:invokespecial   #51  <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   18   36:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JavaType _elementType;
}
