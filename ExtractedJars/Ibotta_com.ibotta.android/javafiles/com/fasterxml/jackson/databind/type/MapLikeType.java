// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeBase, TypeBindings

public class MapLikeType extends TypeBase
{

	protected MapLikeType(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[], JavaType javatype1, JavaType javatype2, Object obj, 
			Object obj1, boolean flag)
	{
		super(class1, typebindings, javatype, ajavatype, javatype1.hashCode() ^ javatype2.hashCode(), obj, obj1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokevirtual   #19  <Method int JavaType.hashCode()>
	//    7   11:aload           6
	//    8   13:invokevirtual   #19  <Method int JavaType.hashCode()>
	//    9   16:ixor            
	//   10   17:aload           7
	//   11   19:aload           8
	//   12   21:iload           9
	//   13   23:invokespecial   #22  <Method void TypeBase(Class, TypeBindings, JavaType, JavaType[], int, Object, Object, boolean)>
		_keyType = javatype1;
	//   14   26:aload_0         
	//   15   27:aload           5
	//   16   29:putfield        #24  <Field JavaType _keyType>
		_valueType = javatype2;
	//   17   32:aload_0         
	//   18   33:aload           6
	//   19   35:putfield        #26  <Field JavaType _valueType>
	//   20   38:return          
	}

	protected String buildCanonicalName()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #33  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(_class.getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field Class _class>
	//    7   13:invokevirtual   #45  <Method String Class.getName()>
	//    8   16:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		if(_keyType != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #24  <Field JavaType _keyType>
	//*  12   24:ifnull          72
		{
			stringbuilder.append('<');
	//   13   27:aload_1         
	//   14   28:bipush          60
	//   15   30:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   16   33:pop             
			stringbuilder.append(_keyType.toCanonical());
	//   17   34:aload_1         
	//   18   35:aload_0         
	//   19   36:getfield        #24  <Field JavaType _keyType>
	//   20   39:invokevirtual   #55  <Method String JavaType.toCanonical()>
	//   21   42:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   22   45:pop             
			stringbuilder.append(',');
	//   23   46:aload_1         
	//   24   47:bipush          44
	//   25   49:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   26   52:pop             
			stringbuilder.append(_valueType.toCanonical());
	//   27   53:aload_1         
	//   28   54:aload_0         
	//   29   55:getfield        #26  <Field JavaType _valueType>
	//   30   58:invokevirtual   #55  <Method String JavaType.toCanonical()>
	//   31   61:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   32   64:pop             
			stringbuilder.append('>');
	//   33   65:aload_1         
	//   34   66:bipush          62
	//   35   68:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   36   71:pop             
		}
		return stringbuilder.toString();
	//   37   72:aload_1         
	//   38   73:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   39   76:areturn         
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
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(obj.getClass() != ((Object)this).getClass())
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #66  <Method Class Object.getClass()>
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #66  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((MapLikeType)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class MapLikeType>
	//   18   30:astore_1        
		return _class == ((MapLikeType) (obj))._class && _keyType.equals(((Object) (((MapLikeType) (obj))._keyType))) && _valueType.equals(((Object) (((MapLikeType) (obj))._valueType)));
	//   19   31:aload_0         
	//   20   32:getfield        #40  <Field Class _class>
	//   21   35:aload_1         
	//   22   36:getfield        #40  <Field Class _class>
	//   23   39:if_acmpne       72
	//   24   42:aload_0         
	//   25   43:getfield        #24  <Field JavaType _keyType>
	//   26   46:aload_1         
	//   27   47:getfield        #24  <Field JavaType _keyType>
	//   28   50:invokevirtual   #68  <Method boolean JavaType.equals(Object)>
	//   29   53:ifeq            72
	//   30   56:aload_0         
	//   31   57:getfield        #26  <Field JavaType _valueType>
	//   32   60:aload_1         
	//   33   61:getfield        #26  <Field JavaType _valueType>
	//   34   64:invokevirtual   #68  <Method boolean JavaType.equals(Object)>
	//   35   67:ifeq            72
	//   36   70:iconst_1        
	//   37   71:ireturn         
	//   38   72:iconst_0        
	//   39   73:ireturn         
	}

	public JavaType getContentType()
	{
		return _valueType;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field JavaType _valueType>
	//    2    4:areturn         
	}

	public StringBuilder getGenericSignature(StringBuilder stringbuilder)
	{
		_classSignature(_class, stringbuilder, false);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Class _class>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokestatic    #76  <Method StringBuilder _classSignature(Class, StringBuilder, boolean)>
	//    5    9:pop             
		stringbuilder.append('<');
	//    6   10:aload_1         
	//    7   11:bipush          60
	//    8   13:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//    9   16:pop             
		_keyType.getGenericSignature(stringbuilder);
	//   10   17:aload_0         
	//   11   18:getfield        #24  <Field JavaType _keyType>
	//   12   21:aload_1         
	//   13   22:invokevirtual   #78  <Method StringBuilder JavaType.getGenericSignature(StringBuilder)>
	//   14   25:pop             
		_valueType.getGenericSignature(stringbuilder);
	//   15   26:aload_0         
	//   16   27:getfield        #26  <Field JavaType _valueType>
	//   17   30:aload_1         
	//   18   31:invokevirtual   #78  <Method StringBuilder JavaType.getGenericSignature(StringBuilder)>
	//   19   34:pop             
		stringbuilder.append(">;");
	//   20   35:aload_1         
	//   21   36:ldc1            #80  <String ">;">
	//   22   38:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   23   41:pop             
		return stringbuilder;
	//   24   42:aload_1         
	//   25   43:areturn         
	}

	public JavaType getKeyType()
	{
		return _keyType;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field JavaType _keyType>
	//    2    4:areturn         
	}

	public boolean hasHandlers()
	{
		return super.hasHandlers() || _valueType.hasHandlers() || _keyType.hasHandlers();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method boolean TypeBase.hasHandlers()>
	//    2    4:ifne            32
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field JavaType _valueType>
	//    5   11:invokevirtual   #86  <Method boolean JavaType.hasHandlers()>
	//    6   14:ifne            32
	//    7   17:aload_0         
	//    8   18:getfield        #24  <Field JavaType _keyType>
	//    9   21:invokevirtual   #86  <Method boolean JavaType.hasHandlers()>
	//   10   24:ifeq            30
	//   11   27:goto            32
	//   12   30:iconst_0        
	//   13   31:ireturn         
	//   14   32:iconst_1        
	//   15   33:ireturn         
	}

	public boolean isContainerType()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isMapLikeType()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isTrueMapType()
	{
		return ((Class) (java/util/Map)).isAssignableFrom(_class);
	//    0    0:ldc1            #91  <Class Map>
	//    1    2:aload_0         
	//    2    3:getfield        #40  <Field Class _class>
	//    3    6:invokevirtual   #95  <Method boolean Class.isAssignableFrom(Class)>
	//    4    9:ireturn         
	}

	public JavaType refine(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		return ((JavaType) (new MapLikeType(class1, typebindings, javatype, ajavatype, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic)));
	//    0    0:new             #2   <Class MapLikeType>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload_0         
	//    7   10:getfield        #24  <Field JavaType _keyType>
	//    8   13:aload_0         
	//    9   14:getfield        #26  <Field JavaType _valueType>
	//   10   17:aload_0         
	//   11   18:getfield        #101 <Field Object _valueHandler>
	//   12   21:aload_0         
	//   13   22:getfield        #104 <Field Object _typeHandler>
	//   14   25:aload_0         
	//   15   26:getfield        #108 <Field boolean _asStatic>
	//   16   29:invokespecial   #110 <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   17   32:areturn         
	}

	public String toString()
	{
		return String.format("[map-like type; class %s, %s -> %s]", new Object[] {
			_class.getName(), _keyType, _valueType
		});
	//    0    0:ldc1            #113 <String "[map-like type; class %s, %s -> %s]">
	//    1    2:iconst_3        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #40  <Field Class _class>
	//    7   12:invokevirtual   #45  <Method String Class.getName()>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:getfield        #24  <Field JavaType _keyType>
	//   13   22:aastore         
	//   14   23:dup             
	//   15   24:iconst_2        
	//   16   25:aload_0         
	//   17   26:getfield        #26  <Field JavaType _valueType>
	//   18   29:aastore         
	//   19   30:invokestatic    #119 <Method String String.format(String, Object[])>
	//   20   33:areturn         
	}

	public JavaType withContentType(JavaType javatype)
	{
		if(_valueType == javatype)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field JavaType _valueType>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return ((JavaType) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((JavaType) (new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, javatype, _valueHandler, _typeHandler, _asStatic)));
	//    6   10:new             #2   <Class MapLikeType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #40  <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #125 <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #128 <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #132 <Field JavaType[] _superInterfaces>
	//   16   30:aload_0         
	//   17   31:getfield        #24  <Field JavaType _keyType>
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #101 <Field Object _valueHandler>
	//   21   39:aload_0         
	//   22   40:getfield        #104 <Field Object _typeHandler>
	//   23   43:aload_0         
	//   24   44:getfield        #108 <Field boolean _asStatic>
	//   25   47:invokespecial   #110 <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   26   50:areturn         
	}

	public volatile JavaType withContentTypeHandler(Object obj)
	{
		return ((JavaType) (withContentTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #137 <Method MapLikeType withContentTypeHandler(Object)>
	//    3    5:areturn         
	}

	public MapLikeType withContentTypeHandler(Object obj)
	{
		return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withTypeHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #125 <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #128 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #132 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #24  <Field JavaType _keyType>
	//   12   24:aload_0         
	//   13   25:getfield        #26  <Field JavaType _valueType>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #140 <Method JavaType JavaType.withTypeHandler(Object)>
	//   16   32:aload_0         
	//   17   33:getfield        #101 <Field Object _valueHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #104 <Field Object _typeHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #108 <Field boolean _asStatic>
	//   22   44:invokespecial   #110 <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   23   47:areturn         
	}

	public volatile JavaType withContentValueHandler(Object obj)
	{
		return ((JavaType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #143 <Method MapLikeType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public MapLikeType withContentValueHandler(Object obj)
	{
		return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withValueHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #125 <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #128 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #132 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #24  <Field JavaType _keyType>
	//   12   24:aload_0         
	//   13   25:getfield        #26  <Field JavaType _valueType>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #146 <Method JavaType JavaType.withValueHandler(Object)>
	//   16   32:aload_0         
	//   17   33:getfield        #101 <Field Object _valueHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #104 <Field Object _typeHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #108 <Field boolean _asStatic>
	//   22   44:invokespecial   #110 <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   23   47:areturn         
	}

	public JavaType withHandlersFrom(JavaType javatype)
	{
		JavaType javatype1 = super.withHandlersFrom(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #149 <Method JavaType TypeBase.withHandlersFrom(JavaType)>
	//    3    5:astore_3        
		JavaType javatype2 = javatype.getKeyType();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #151 <Method JavaType JavaType.getKeyType()>
	//    6   10:astore          4
		Object obj = ((Object) (javatype1));
	//    7   12:aload_3         
	//    8   13:astore_2        
		if(javatype1 instanceof MapLikeType)
	//*   9   14:aload_3         
	//*  10   15:instanceof      #2   <Class MapLikeType>
	//*  11   18:ifeq            60
		{
			obj = ((Object) (javatype1));
	//   12   21:aload_3         
	//   13   22:astore_2        
			if(javatype2 != null)
	//*  14   23:aload           4
	//*  15   25:ifnull          60
			{
				javatype2 = _keyType.withHandlersFrom(javatype2);
	//   16   28:aload_0         
	//   17   29:getfield        #24  <Field JavaType _keyType>
	//   18   32:aload           4
	//   19   34:invokevirtual   #152 <Method JavaType JavaType.withHandlersFrom(JavaType)>
	//   20   37:astore          4
				obj = ((Object) (javatype1));
	//   21   39:aload_3         
	//   22   40:astore_2        
				if(javatype2 != _keyType)
	//*  23   41:aload           4
	//*  24   43:aload_0         
	//*  25   44:getfield        #24  <Field JavaType _keyType>
	//*  26   47:if_acmpeq       60
					obj = ((Object) (((MapLikeType)javatype1).withKeyType(javatype2)));
	//   27   50:aload_3         
	//   28   51:checkcast       #2   <Class MapLikeType>
	//   29   54:aload           4
	//   30   56:invokevirtual   #156 <Method MapLikeType withKeyType(JavaType)>
	//   31   59:astore_2        
			}
		}
		javatype1 = javatype.getContentType();
	//   32   60:aload_1         
	//   33   61:invokevirtual   #158 <Method JavaType JavaType.getContentType()>
	//   34   64:astore_3        
		javatype = ((JavaType) (obj));
	//   35   65:aload_2         
	//   36   66:astore_1        
		if(javatype1 != null)
	//*  37   67:aload_3         
	//*  38   68:ifnull          96
		{
			javatype1 = _valueType.withHandlersFrom(javatype1);
	//   39   71:aload_0         
	//   40   72:getfield        #26  <Field JavaType _valueType>
	//   41   75:aload_3         
	//   42   76:invokevirtual   #152 <Method JavaType JavaType.withHandlersFrom(JavaType)>
	//   43   79:astore_3        
			javatype = ((JavaType) (obj));
	//   44   80:aload_2         
	//   45   81:astore_1        
			if(javatype1 != _valueType)
	//*  46   82:aload_3         
	//*  47   83:aload_0         
	//*  48   84:getfield        #26  <Field JavaType _valueType>
	//*  49   87:if_acmpeq       96
				javatype = ((JavaType) (obj)).withContentType(javatype1);
	//   50   90:aload_2         
	//   51   91:aload_3         
	//   52   92:invokevirtual   #160 <Method JavaType JavaType.withContentType(JavaType)>
	//   53   95:astore_1        
		}
		return javatype;
	//   54   96:aload_1         
	//   55   97:areturn         
	}

	public MapLikeType withKeyType(JavaType javatype)
	{
		if(javatype == _keyType)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #24  <Field JavaType _keyType>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, javatype, _valueType, _valueHandler, _typeHandler, _asStatic);
	//    6   10:new             #2   <Class MapLikeType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #40  <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #125 <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #128 <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #132 <Field JavaType[] _superInterfaces>
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #26  <Field JavaType _valueType>
	//   19   35:aload_0         
	//   20   36:getfield        #101 <Field Object _valueHandler>
	//   21   39:aload_0         
	//   22   40:getfield        #104 <Field Object _typeHandler>
	//   23   43:aload_0         
	//   24   44:getfield        #108 <Field boolean _asStatic>
	//   25   47:invokespecial   #110 <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   26   50:areturn         
	}

	public MapLikeType withKeyValueHandler(Object obj)
	{
		return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType.withValueHandler(obj), _valueType, _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #125 <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #128 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #132 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #24  <Field JavaType _keyType>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #146 <Method JavaType JavaType.withValueHandler(Object)>
	//   14   28:aload_0         
	//   15   29:getfield        #26  <Field JavaType _valueType>
	//   16   32:aload_0         
	//   17   33:getfield        #101 <Field Object _valueHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #104 <Field Object _typeHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #108 <Field boolean _asStatic>
	//   22   44:invokespecial   #110 <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   23   47:areturn         
	}

	public volatile JavaType withStaticTyping()
	{
		return ((JavaType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method MapLikeType withStaticTyping()>
	//    2    4:areturn         
	}

	public MapLikeType withStaticTyping()
	{
		if(_asStatic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field boolean _asStatic>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withStaticTyping(), _valueHandler, _typeHandler, true);
	//    5    9:new             #2   <Class MapLikeType>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #40  <Field Class _class>
	//    9   17:aload_0         
	//   10   18:getfield        #125 <Field TypeBindings _bindings>
	//   11   21:aload_0         
	//   12   22:getfield        #128 <Field JavaType _superClass>
	//   13   25:aload_0         
	//   14   26:getfield        #132 <Field JavaType[] _superInterfaces>
	//   15   29:aload_0         
	//   16   30:getfield        #24  <Field JavaType _keyType>
	//   17   33:aload_0         
	//   18   34:getfield        #26  <Field JavaType _valueType>
	//   19   37:invokevirtual   #167 <Method JavaType JavaType.withStaticTyping()>
	//   20   40:aload_0         
	//   21   41:getfield        #101 <Field Object _valueHandler>
	//   22   44:aload_0         
	//   23   45:getfield        #104 <Field Object _typeHandler>
	//   24   48:iconst_1        
	//   25   49:invokespecial   #110 <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   26   52:areturn         
	}

	public volatile JavaType withTypeHandler(Object obj)
	{
		return ((JavaType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #169 <Method MapLikeType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public MapLikeType withTypeHandler(Object obj)
	{
		return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType, _valueHandler, obj, _asStatic);
	//    0    0:new             #2   <Class MapLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #125 <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #128 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #132 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #24  <Field JavaType _keyType>
	//   12   24:aload_0         
	//   13   25:getfield        #26  <Field JavaType _valueType>
	//   14   28:aload_0         
	//   15   29:getfield        #101 <Field Object _valueHandler>
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #108 <Field boolean _asStatic>
	//   19   37:invokespecial   #110 <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   20   40:areturn         
	}

	public volatile JavaType withValueHandler(Object obj)
	{
		return ((JavaType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #171 <Method MapLikeType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public MapLikeType withValueHandler(Object obj)
	{
		return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType, obj, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #125 <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #128 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #132 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #24  <Field JavaType _keyType>
	//   12   24:aload_0         
	//   13   25:getfield        #26  <Field JavaType _valueType>
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #104 <Field Object _typeHandler>
	//   17   33:aload_0         
	//   18   34:getfield        #108 <Field boolean _asStatic>
	//   19   37:invokespecial   #110 <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   20   40:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JavaType _keyType;
	protected final JavaType _valueType;
}
