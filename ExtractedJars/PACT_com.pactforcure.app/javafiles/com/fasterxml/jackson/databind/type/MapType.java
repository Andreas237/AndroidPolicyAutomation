// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			MapLikeType, TypeBindings, TypeBase

public final class MapType extends MapLikeType
{

	protected MapType(TypeBase typebase, JavaType javatype, JavaType javatype1)
	{
		super(typebase, javatype, javatype1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #12  <Method void MapLikeType(TypeBase, JavaType, JavaType)>
	//    5    7:return          
	}

	private MapType(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[], JavaType javatype1, JavaType javatype2, Object obj, 
			Object obj1, boolean flag)
	{
		super(class1, typebindings, javatype, ajavatype, javatype1, javatype2, obj, obj1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:aload           8
	//    9   14:iload           9
	//   10   16:invokespecial   #16  <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   11   19:return          
	}

	public static MapType construct(Class class1, JavaType javatype, JavaType javatype1)
	{
		java.lang.reflect.TypeVariable atypevariable[] = class1.getTypeParameters();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method java.lang.reflect.TypeVariable[] Class.getTypeParameters()>
	//    2    4:astore_3        
		TypeBindings typebindings;
		if(atypevariable == null || atypevariable.length != 2)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
	//*   5    9:aload_3         
	//*   6   10:arraylength     
	//*   7   11:iconst_2        
	//*   8   12:icmpeq          39
			typebindings = TypeBindings.emptyBindings();
	//    9   15:invokestatic    #33  <Method TypeBindings TypeBindings.emptyBindings()>
	//   10   18:astore_3        
		else
	//*  11   19:new             #2   <Class MapType>
	//*  12   22:dup             
	//*  13   23:aload_0         
	//*  14   24:aload_3         
	//*  15   25:aload_0         
	//*  16   26:invokestatic    #37  <Method JavaType _bogusSuperClass(Class)>
	//*  17   29:aconst_null     
	//*  18   30:aload_1         
	//*  19   31:aload_2         
	//*  20   32:aconst_null     
	//*  21   33:aconst_null     
	//*  22   34:iconst_0        
	//*  23   35:invokespecial   #38  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//*  24   38:areturn         
			typebindings = TypeBindings.create(class1, javatype, javatype1);
	//   25   39:aload_0         
	//   26   40:aload_1         
	//   27   41:aload_2         
	//   28   42:invokestatic    #42  <Method TypeBindings TypeBindings.create(Class, JavaType, JavaType)>
	//   29   45:astore_3        
		return new MapType(class1, typebindings, _bogusSuperClass(class1), ((JavaType []) (null)), javatype, javatype1, ((Object) (null)), ((Object) (null)), false);
	//*  30   46:goto            19
	}

	public static MapType construct(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[], JavaType javatype1, JavaType javatype2)
	{
		return new MapType(class1, typebindings, javatype, ajavatype, javatype1, javatype2, ((Object) (null)), ((Object) (null)), false);
	//    0    0:new             #2   <Class MapType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:iconst_0        
	//   11   15:invokespecial   #38  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   12   18:areturn         
	}

	protected JavaType _narrow(Class class1)
	{
		return ((JavaType) (new MapType(class1, _bindings, _superClass, _superInterfaces, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic)));
	//    0    0:new             #2   <Class MapType>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field TypeBindings _bindings>
	//    5    9:aload_0         
	//    6   10:getfield        #55  <Field JavaType _superClass>
	//    7   13:aload_0         
	//    8   14:getfield        #59  <Field JavaType[] _superInterfaces>
	//    9   17:aload_0         
	//   10   18:getfield        #62  <Field JavaType _keyType>
	//   11   21:aload_0         
	//   12   22:getfield        #65  <Field JavaType _valueType>
	//   13   25:aload_0         
	//   14   26:getfield        #69  <Field Object _valueHandler>
	//   15   29:aload_0         
	//   16   30:getfield        #72  <Field Object _typeHandler>
	//   17   33:aload_0         
	//   18   34:getfield        #76  <Field boolean _asStatic>
	//   19   37:invokespecial   #38  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   20   40:areturn         
	}

	public JavaType refine(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		return ((JavaType) (new MapType(class1, typebindings, javatype, ajavatype, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic)));
	//    0    0:new             #2   <Class MapType>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload_0         
	//    7   10:getfield        #62  <Field JavaType _keyType>
	//    8   13:aload_0         
	//    9   14:getfield        #65  <Field JavaType _valueType>
	//   10   17:aload_0         
	//   11   18:getfield        #69  <Field Object _valueHandler>
	//   12   21:aload_0         
	//   13   22:getfield        #72  <Field Object _typeHandler>
	//   14   25:aload_0         
	//   15   26:getfield        #76  <Field boolean _asStatic>
	//   16   29:invokespecial   #38  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   17   32:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("[map type; class ").append(_class.getName()).append(", ").append(((Object) (_keyType))).append(" -> ").append(((Object) (_valueType))).append("]").toString();
	//    0    0:new             #84  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void StringBuilder()>
	//    3    7:ldc1            #89  <String "[map type; class ">
	//    4    9:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #97  <Field Class _class>
	//    7   16:invokevirtual   #100 <Method String Class.getName()>
	//    8   19:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #102 <String ", ">
	//   10   24:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #62  <Field JavaType _keyType>
	//   13   31:invokevirtual   #105 <Method StringBuilder StringBuilder.append(Object)>
	//   14   34:ldc1            #107 <String " -> ">
	//   15   36:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:aload_0         
	//   17   40:getfield        #65  <Field JavaType _valueType>
	//   18   43:invokevirtual   #105 <Method StringBuilder StringBuilder.append(Object)>
	//   19   46:ldc1            #109 <String "]">
	//   20   48:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   21   51:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   22   54:areturn         
	}

	public JavaType withContentType(JavaType javatype)
	{
		if(_valueType == javatype)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field JavaType _valueType>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return ((JavaType) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((JavaType) (new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, javatype, _valueHandler, _typeHandler, _asStatic)));
	//    6   10:new             #2   <Class MapType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #97  <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #51  <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #55  <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #59  <Field JavaType[] _superInterfaces>
	//   16   30:aload_0         
	//   17   31:getfield        #62  <Field JavaType _keyType>
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #69  <Field Object _valueHandler>
	//   21   39:aload_0         
	//   22   40:getfield        #72  <Field Object _typeHandler>
	//   23   43:aload_0         
	//   24   44:getfield        #76  <Field boolean _asStatic>
	//   25   47:invokespecial   #38  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   26   50:areturn         
	}

	public volatile JavaType withContentTypeHandler(Object obj)
	{
		return ((JavaType) (withContentTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #118 <Method MapType withContentTypeHandler(Object)>
	//    3    5:areturn         
	}

	public volatile MapLikeType withContentTypeHandler(Object obj)
	{
		return ((MapLikeType) (withContentTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #118 <Method MapType withContentTypeHandler(Object)>
	//    3    5:areturn         
	}

	public MapType withContentTypeHandler(Object obj)
	{
		return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withTypeHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #97  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #55  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #62  <Field JavaType _keyType>
	//   12   24:aload_0         
	//   13   25:getfield        #65  <Field JavaType _valueType>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #124 <Method JavaType JavaType.withTypeHandler(Object)>
	//   16   32:aload_0         
	//   17   33:getfield        #69  <Field Object _valueHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #72  <Field Object _typeHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #76  <Field boolean _asStatic>
	//   22   44:invokespecial   #38  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   23   47:areturn         
	}

	public volatile JavaType withContentValueHandler(Object obj)
	{
		return ((JavaType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #127 <Method MapType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public volatile MapLikeType withContentValueHandler(Object obj)
	{
		return ((MapLikeType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #127 <Method MapType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public MapType withContentValueHandler(Object obj)
	{
		return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withValueHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #97  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #55  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #62  <Field JavaType _keyType>
	//   12   24:aload_0         
	//   13   25:getfield        #65  <Field JavaType _valueType>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #130 <Method JavaType JavaType.withValueHandler(Object)>
	//   16   32:aload_0         
	//   17   33:getfield        #69  <Field Object _valueHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #72  <Field Object _typeHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #76  <Field boolean _asStatic>
	//   22   44:invokespecial   #38  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   23   47:areturn         
	}

	public volatile MapLikeType withKeyType(JavaType javatype)
	{
		return ((MapLikeType) (withKeyType(javatype)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #135 <Method MapType withKeyType(JavaType)>
	//    3    5:areturn         
	}

	public MapType withKeyType(JavaType javatype)
	{
		if(javatype == _keyType)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #62  <Field JavaType _keyType>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new MapType(_class, _bindings, _superClass, _superInterfaces, javatype, _valueType, _valueHandler, _typeHandler, _asStatic);
	//    6   10:new             #2   <Class MapType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #97  <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #51  <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #55  <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #59  <Field JavaType[] _superInterfaces>
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #65  <Field JavaType _valueType>
	//   19   35:aload_0         
	//   20   36:getfield        #69  <Field Object _valueHandler>
	//   21   39:aload_0         
	//   22   40:getfield        #72  <Field Object _typeHandler>
	//   23   43:aload_0         
	//   24   44:getfield        #76  <Field boolean _asStatic>
	//   25   47:invokespecial   #38  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   26   50:areturn         
	}

	public volatile MapLikeType withKeyTypeHandler(Object obj)
	{
		return ((MapLikeType) (withKeyTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #138 <Method MapType withKeyTypeHandler(Object)>
	//    3    5:areturn         
	}

	public MapType withKeyTypeHandler(Object obj)
	{
		return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withTypeHandler(obj), _valueType, _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #97  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #55  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #62  <Field JavaType _keyType>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #124 <Method JavaType JavaType.withTypeHandler(Object)>
	//   14   28:aload_0         
	//   15   29:getfield        #65  <Field JavaType _valueType>
	//   16   32:aload_0         
	//   17   33:getfield        #69  <Field Object _valueHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #72  <Field Object _typeHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #76  <Field boolean _asStatic>
	//   22   44:invokespecial   #38  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   23   47:areturn         
	}

	public volatile MapLikeType withKeyValueHandler(Object obj)
	{
		return ((MapLikeType) (withKeyValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #141 <Method MapType withKeyValueHandler(Object)>
	//    3    5:areturn         
	}

	public MapType withKeyValueHandler(Object obj)
	{
		return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withValueHandler(obj), _valueType, _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #97  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #55  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #62  <Field JavaType _keyType>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #130 <Method JavaType JavaType.withValueHandler(Object)>
	//   14   28:aload_0         
	//   15   29:getfield        #65  <Field JavaType _valueType>
	//   16   32:aload_0         
	//   17   33:getfield        #69  <Field Object _valueHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #72  <Field Object _typeHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #76  <Field boolean _asStatic>
	//   22   44:invokespecial   #38  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   23   47:areturn         
	}

	public volatile JavaType withStaticTyping()
	{
		return ((JavaType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method MapType withStaticTyping()>
	//    2    4:areturn         
	}

	public volatile MapLikeType withStaticTyping()
	{
		return ((MapLikeType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method MapType withStaticTyping()>
	//    2    4:areturn         
	}

	public MapType withStaticTyping()
	{
		if(_asStatic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field boolean _asStatic>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withStaticTyping(), _valueType.withStaticTyping(), _valueHandler, _typeHandler, true);
	//    5    9:new             #2   <Class MapType>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #97  <Field Class _class>
	//    9   17:aload_0         
	//   10   18:getfield        #51  <Field TypeBindings _bindings>
	//   11   21:aload_0         
	//   12   22:getfield        #55  <Field JavaType _superClass>
	//   13   25:aload_0         
	//   14   26:getfield        #59  <Field JavaType[] _superInterfaces>
	//   15   29:aload_0         
	//   16   30:getfield        #62  <Field JavaType _keyType>
	//   17   33:invokevirtual   #149 <Method JavaType JavaType.withStaticTyping()>
	//   18   36:aload_0         
	//   19   37:getfield        #65  <Field JavaType _valueType>
	//   20   40:invokevirtual   #149 <Method JavaType JavaType.withStaticTyping()>
	//   21   43:aload_0         
	//   22   44:getfield        #69  <Field Object _valueHandler>
	//   23   47:aload_0         
	//   24   48:getfield        #72  <Field Object _typeHandler>
	//   25   51:iconst_1        
	//   26   52:invokespecial   #38  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   27   55:areturn         
	}

	public volatile JavaType withTypeHandler(Object obj)
	{
		return ((JavaType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #151 <Method MapType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public volatile MapLikeType withTypeHandler(Object obj)
	{
		return ((MapLikeType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #151 <Method MapType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public MapType withTypeHandler(Object obj)
	{
		return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType, _valueHandler, obj, _asStatic);
	//    0    0:new             #2   <Class MapType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #97  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #55  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #62  <Field JavaType _keyType>
	//   12   24:aload_0         
	//   13   25:getfield        #65  <Field JavaType _valueType>
	//   14   28:aload_0         
	//   15   29:getfield        #69  <Field Object _valueHandler>
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #76  <Field boolean _asStatic>
	//   19   37:invokespecial   #38  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   20   40:areturn         
	}

	public volatile JavaType withValueHandler(Object obj)
	{
		return ((JavaType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #153 <Method MapType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public volatile MapLikeType withValueHandler(Object obj)
	{
		return ((MapLikeType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #153 <Method MapType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public MapType withValueHandler(Object obj)
	{
		return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType, obj, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #97  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #55  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #62  <Field JavaType _keyType>
	//   12   24:aload_0         
	//   13   25:getfield        #65  <Field JavaType _valueType>
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #72  <Field Object _typeHandler>
	//   17   33:aload_0         
	//   18   34:getfield        #76  <Field boolean _asStatic>
	//   19   37:invokespecial   #38  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   20   40:areturn         
	}

	private static final long serialVersionUID = 1L;
}
