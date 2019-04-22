// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			MapLikeType, TypeBindings

public final class MapType extends MapLikeType
{

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
	//   10   16:invokespecial   #12  <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   11   19:return          
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
	//   11   15:invokespecial   #18  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   12   18:areturn         
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
	//    7   10:getfield        #25  <Field JavaType _keyType>
	//    8   13:aload_0         
	//    9   14:getfield        #28  <Field JavaType _valueType>
	//   10   17:aload_0         
	//   11   18:getfield        #32  <Field Object _valueHandler>
	//   12   21:aload_0         
	//   13   22:getfield        #35  <Field Object _typeHandler>
	//   14   25:aload_0         
	//   15   26:getfield        #39  <Field boolean _asStatic>
	//   16   29:invokespecial   #18  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   17   32:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #44  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[map type; class ");
	//    4    8:aload_1         
	//    5    9:ldc1            #49  <String "[map type; class ">
	//    6   11:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(_class.getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #57  <Field Class _class>
	//   11   20:invokevirtual   #62  <Method String Class.getName()>
	//   12   23:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(", ");
	//   14   27:aload_1         
	//   15   28:ldc1            #64  <String ", ">
	//   16   30:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(((Object) (_keyType)));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #25  <Field JavaType _keyType>
	//   21   39:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   22   42:pop             
		stringbuilder.append(" -> ");
	//   23   43:aload_1         
	//   24   44:ldc1            #69  <String " -> ">
	//   25   46:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		stringbuilder.append(((Object) (_valueType)));
	//   27   50:aload_1         
	//   28   51:aload_0         
	//   29   52:getfield        #28  <Field JavaType _valueType>
	//   30   55:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   31   58:pop             
		stringbuilder.append("]");
	//   32   59:aload_1         
	//   33   60:ldc1            #71  <String "]">
	//   34   62:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   35   65:pop             
		return stringbuilder.toString();
	//   36   66:aload_1         
	//   37   67:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   38   70:areturn         
	}

	public JavaType withContentType(JavaType javatype)
	{
		if(_valueType == javatype)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field JavaType _valueType>
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
	//    9   15:getfield        #57  <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #79  <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #82  <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #86  <Field JavaType[] _superInterfaces>
	//   16   30:aload_0         
	//   17   31:getfield        #25  <Field JavaType _keyType>
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #32  <Field Object _valueHandler>
	//   21   39:aload_0         
	//   22   40:getfield        #35  <Field Object _typeHandler>
	//   23   43:aload_0         
	//   24   44:getfield        #39  <Field boolean _asStatic>
	//   25   47:invokespecial   #18  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   26   50:areturn         
	}

	public volatile JavaType withContentTypeHandler(Object obj)
	{
		return ((JavaType) (withContentTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #91  <Method MapType withContentTypeHandler(Object)>
	//    3    5:areturn         
	}

	public volatile MapLikeType withContentTypeHandler(Object obj)
	{
		return ((MapLikeType) (withContentTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #91  <Method MapType withContentTypeHandler(Object)>
	//    3    5:areturn         
	}

	public MapType withContentTypeHandler(Object obj)
	{
		return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withTypeHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #57  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #79  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #82  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #86  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field JavaType _keyType>
	//   12   24:aload_0         
	//   13   25:getfield        #28  <Field JavaType _valueType>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #97  <Method JavaType JavaType.withTypeHandler(Object)>
	//   16   32:aload_0         
	//   17   33:getfield        #32  <Field Object _valueHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #35  <Field Object _typeHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #39  <Field boolean _asStatic>
	//   22   44:invokespecial   #18  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   23   47:areturn         
	}

	public volatile JavaType withContentValueHandler(Object obj)
	{
		return ((JavaType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #100 <Method MapType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public volatile MapLikeType withContentValueHandler(Object obj)
	{
		return ((MapLikeType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #100 <Method MapType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public MapType withContentValueHandler(Object obj)
	{
		return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withValueHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #57  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #79  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #82  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #86  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field JavaType _keyType>
	//   12   24:aload_0         
	//   13   25:getfield        #28  <Field JavaType _valueType>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #103 <Method JavaType JavaType.withValueHandler(Object)>
	//   16   32:aload_0         
	//   17   33:getfield        #32  <Field Object _valueHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #35  <Field Object _typeHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #39  <Field boolean _asStatic>
	//   22   44:invokespecial   #18  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   23   47:areturn         
	}

	public volatile MapLikeType withKeyType(JavaType javatype)
	{
		return ((MapLikeType) (withKeyType(javatype)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #108 <Method MapType withKeyType(JavaType)>
	//    3    5:areturn         
	}

	public MapType withKeyType(JavaType javatype)
	{
		if(javatype == _keyType)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #25  <Field JavaType _keyType>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new MapType(_class, _bindings, _superClass, _superInterfaces, javatype, _valueType, _valueHandler, _typeHandler, _asStatic);
	//    6   10:new             #2   <Class MapType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #57  <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #79  <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #82  <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #86  <Field JavaType[] _superInterfaces>
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #28  <Field JavaType _valueType>
	//   19   35:aload_0         
	//   20   36:getfield        #32  <Field Object _valueHandler>
	//   21   39:aload_0         
	//   22   40:getfield        #35  <Field Object _typeHandler>
	//   23   43:aload_0         
	//   24   44:getfield        #39  <Field boolean _asStatic>
	//   25   47:invokespecial   #18  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   26   50:areturn         
	}

	public volatile MapLikeType withKeyValueHandler(Object obj)
	{
		return ((MapLikeType) (withKeyValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #111 <Method MapType withKeyValueHandler(Object)>
	//    3    5:areturn         
	}

	public MapType withKeyValueHandler(Object obj)
	{
		return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withValueHandler(obj), _valueType, _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #57  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #79  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #82  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #86  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field JavaType _keyType>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #103 <Method JavaType JavaType.withValueHandler(Object)>
	//   14   28:aload_0         
	//   15   29:getfield        #28  <Field JavaType _valueType>
	//   16   32:aload_0         
	//   17   33:getfield        #32  <Field Object _valueHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #35  <Field Object _typeHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #39  <Field boolean _asStatic>
	//   22   44:invokespecial   #18  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   23   47:areturn         
	}

	public volatile JavaType withStaticTyping()
	{
		return ((JavaType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method MapType withStaticTyping()>
	//    2    4:areturn         
	}

	public volatile MapLikeType withStaticTyping()
	{
		return ((MapLikeType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method MapType withStaticTyping()>
	//    2    4:areturn         
	}

	public MapType withStaticTyping()
	{
		if(_asStatic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field boolean _asStatic>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withStaticTyping(), _valueType.withStaticTyping(), _valueHandler, _typeHandler, true);
	//    5    9:new             #2   <Class MapType>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #57  <Field Class _class>
	//    9   17:aload_0         
	//   10   18:getfield        #79  <Field TypeBindings _bindings>
	//   11   21:aload_0         
	//   12   22:getfield        #82  <Field JavaType _superClass>
	//   13   25:aload_0         
	//   14   26:getfield        #86  <Field JavaType[] _superInterfaces>
	//   15   29:aload_0         
	//   16   30:getfield        #25  <Field JavaType _keyType>
	//   17   33:invokevirtual   #119 <Method JavaType JavaType.withStaticTyping()>
	//   18   36:aload_0         
	//   19   37:getfield        #28  <Field JavaType _valueType>
	//   20   40:invokevirtual   #119 <Method JavaType JavaType.withStaticTyping()>
	//   21   43:aload_0         
	//   22   44:getfield        #32  <Field Object _valueHandler>
	//   23   47:aload_0         
	//   24   48:getfield        #35  <Field Object _typeHandler>
	//   25   51:iconst_1        
	//   26   52:invokespecial   #18  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   27   55:areturn         
	}

	public volatile JavaType withTypeHandler(Object obj)
	{
		return ((JavaType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #121 <Method MapType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public volatile MapLikeType withTypeHandler(Object obj)
	{
		return ((MapLikeType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #121 <Method MapType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public MapType withTypeHandler(Object obj)
	{
		return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType, _valueHandler, obj, _asStatic);
	//    0    0:new             #2   <Class MapType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #57  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #79  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #82  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #86  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field JavaType _keyType>
	//   12   24:aload_0         
	//   13   25:getfield        #28  <Field JavaType _valueType>
	//   14   28:aload_0         
	//   15   29:getfield        #32  <Field Object _valueHandler>
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #39  <Field boolean _asStatic>
	//   19   37:invokespecial   #18  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   20   40:areturn         
	}

	public volatile JavaType withValueHandler(Object obj)
	{
		return ((JavaType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #123 <Method MapType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public volatile MapLikeType withValueHandler(Object obj)
	{
		return ((MapLikeType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #123 <Method MapType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public MapType withValueHandler(Object obj)
	{
		return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType, obj, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #57  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #79  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #82  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #86  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field JavaType _keyType>
	//   12   24:aload_0         
	//   13   25:getfield        #28  <Field JavaType _valueType>
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #35  <Field Object _typeHandler>
	//   17   33:aload_0         
	//   18   34:getfield        #39  <Field boolean _asStatic>
	//   19   37:invokespecial   #18  <Method void MapType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   20   40:areturn         
	}

	private static final long serialVersionUID = 1L;
}
