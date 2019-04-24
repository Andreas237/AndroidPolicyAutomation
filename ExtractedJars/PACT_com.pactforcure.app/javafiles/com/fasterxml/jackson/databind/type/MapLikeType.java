// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.JavaType;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeBase, TypeBindings

public class MapLikeType extends TypeBase
{

	protected MapLikeType(TypeBase typebase, JavaType javatype, JavaType javatype1)
	{
		super(typebase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void TypeBase(TypeBase)>
		_keyType = javatype;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field JavaType _keyType>
		_valueType = javatype1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field JavaType _valueType>
	//    9   15:return          
	}

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
	//    6    8:invokevirtual   #28  <Method int JavaType.hashCode()>
	//    7   11:aload           6
	//    8   13:invokevirtual   #28  <Method int JavaType.hashCode()>
	//    9   16:ixor            
	//   10   17:aload           7
	//   11   19:aload           8
	//   12   21:iload           9
	//   13   23:invokespecial   #31  <Method void TypeBase(Class, TypeBindings, JavaType, JavaType[], int, Object, Object, boolean)>
		_keyType = javatype1;
	//   14   26:aload_0         
	//   15   27:aload           5
	//   16   29:putfield        #18  <Field JavaType _keyType>
		_valueType = javatype2;
	//   17   32:aload_0         
	//   18   33:aload           6
	//   19   35:putfield        #20  <Field JavaType _valueType>
	//   20   38:return          
	}

	public static MapLikeType construct(Class class1, JavaType javatype, JavaType javatype1)
	{
		java.lang.reflect.TypeVariable atypevariable[] = class1.getTypeParameters();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method java.lang.reflect.TypeVariable[] Class.getTypeParameters()>
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
	//    9   15:invokestatic    #48  <Method TypeBindings TypeBindings.emptyBindings()>
	//   10   18:astore_3        
		else
	//*  11   19:new             #2   <Class MapLikeType>
	//*  12   22:dup             
	//*  13   23:aload_0         
	//*  14   24:aload_3         
	//*  15   25:aload_0         
	//*  16   26:invokestatic    #52  <Method JavaType _bogusSuperClass(Class)>
	//*  17   29:aconst_null     
	//*  18   30:aload_1         
	//*  19   31:aload_2         
	//*  20   32:aconst_null     
	//*  21   33:aconst_null     
	//*  22   34:iconst_0        
	//*  23   35:invokespecial   #54  <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//*  24   38:areturn         
			typebindings = TypeBindings.create(class1, javatype, javatype1);
	//   25   39:aload_0         
	//   26   40:aload_1         
	//   27   41:aload_2         
	//   28   42:invokestatic    #58  <Method TypeBindings TypeBindings.create(Class, JavaType, JavaType)>
	//   29   45:astore_3        
		return new MapLikeType(class1, typebindings, _bogusSuperClass(class1), ((JavaType []) (null)), javatype, javatype1, ((Object) (null)), ((Object) (null)), false);
	//*  30   46:goto            19
	}

	public static MapLikeType upgradeFrom(JavaType javatype, JavaType javatype1, JavaType javatype2)
	{
		if(javatype instanceof TypeBase)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #4   <Class TypeBase>
	//*   2    4:ifeq            21
			return new MapLikeType((TypeBase)javatype, javatype1, javatype2);
	//    3    7:new             #2   <Class MapLikeType>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:checkcast       #4   <Class TypeBase>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokespecial   #64  <Method void MapLikeType(TypeBase, JavaType, JavaType)>
	//   10   20:areturn         
		else
			throw new IllegalArgumentException((new StringBuilder()).append("Can not upgrade from an instance of ").append(((Object) (((Object) (javatype)).getClass()))).toString());
	//   11   21:new             #66  <Class IllegalArgumentException>
	//   12   24:dup             
	//   13   25:new             #68  <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #71  <Method void StringBuilder()>
	//   16   32:ldc1            #73  <String "Can not upgrade from an instance of ">
	//   17   34:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:aload_0         
	//   19   38:invokevirtual   #83  <Method Class Object.getClass()>
	//   20   41:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   21   44:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   22   47:invokespecial   #93  <Method void IllegalArgumentException(String)>
	//   23   50:athrow          
	}

	protected JavaType _narrow(Class class1)
	{
		return ((JavaType) (new MapLikeType(class1, _bindings, _superClass, _superInterfaces, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic)));
	//    0    0:new             #2   <Class MapLikeType>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #98  <Field TypeBindings _bindings>
	//    5    9:aload_0         
	//    6   10:getfield        #101 <Field JavaType _superClass>
	//    7   13:aload_0         
	//    8   14:getfield        #105 <Field JavaType[] _superInterfaces>
	//    9   17:aload_0         
	//   10   18:getfield        #18  <Field JavaType _keyType>
	//   11   21:aload_0         
	//   12   22:getfield        #20  <Field JavaType _valueType>
	//   13   25:aload_0         
	//   14   26:getfield        #109 <Field Object _valueHandler>
	//   15   29:aload_0         
	//   16   30:getfield        #112 <Field Object _typeHandler>
	//   17   33:aload_0         
	//   18   34:getfield        #116 <Field boolean _asStatic>
	//   19   37:invokespecial   #54  <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   20   40:areturn         
	}

	protected String buildCanonicalName()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #68  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(_class.getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #122 <Field Class _class>
	//    7   13:invokevirtual   #125 <Method String Class.getName()>
	//    8   16:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		if(_keyType != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #18  <Field JavaType _keyType>
	//*  12   24:ifnull          72
		{
			stringbuilder.append('<');
	//   13   27:aload_1         
	//   14   28:bipush          60
	//   15   30:invokevirtual   #128 <Method StringBuilder StringBuilder.append(char)>
	//   16   33:pop             
			stringbuilder.append(_keyType.toCanonical());
	//   17   34:aload_1         
	//   18   35:aload_0         
	//   19   36:getfield        #18  <Field JavaType _keyType>
	//   20   39:invokevirtual   #131 <Method String JavaType.toCanonical()>
	//   21   42:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   22   45:pop             
			stringbuilder.append(',');
	//   23   46:aload_1         
	//   24   47:bipush          44
	//   25   49:invokevirtual   #128 <Method StringBuilder StringBuilder.append(char)>
	//   26   52:pop             
			stringbuilder.append(_valueType.toCanonical());
	//   27   53:aload_1         
	//   28   54:aload_0         
	//   29   55:getfield        #20  <Field JavaType _valueType>
	//   30   58:invokevirtual   #131 <Method String JavaType.toCanonical()>
	//   31   61:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   32   64:pop             
			stringbuilder.append('>');
	//   33   65:aload_1         
	//   34   66:bipush          62
	//   35   68:invokevirtual   #128 <Method StringBuilder StringBuilder.append(char)>
	//   36   71:pop             
		}
		return stringbuilder.toString();
	//   37   72:aload_1         
	//   38   73:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   39   76:areturn         
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
	//*  10   14:invokevirtual   #83  <Method Class Object.getClass()>
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #83  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
				return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
			obj = ((Object) ((MapLikeType)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class MapLikeType>
	//   18   30:astore_1        
			if(_class != ((MapLikeType) (obj))._class || !_keyType.equals(((Object) (((MapLikeType) (obj))._keyType))) || !_valueType.equals(((Object) (((MapLikeType) (obj))._valueType))))
	//*  19   31:aload_0         
	//*  20   32:getfield        #122 <Field Class _class>
	//*  21   35:aload_1         
	//*  22   36:getfield        #122 <Field Class _class>
	//*  23   39:if_acmpne       70
	//*  24   42:aload_0         
	//*  25   43:getfield        #18  <Field JavaType _keyType>
	//*  26   46:aload_1         
	//*  27   47:getfield        #18  <Field JavaType _keyType>
	//*  28   50:invokevirtual   #135 <Method boolean JavaType.equals(Object)>
	//*  29   53:ifeq            70
	//*  30   56:aload_0         
	//*  31   57:getfield        #20  <Field JavaType _valueType>
	//*  32   60:aload_1         
	//*  33   61:getfield        #20  <Field JavaType _valueType>
	//*  34   64:invokevirtual   #135 <Method boolean JavaType.equals(Object)>
	//*  35   67:ifne            5
				return false;
	//   36   70:iconst_0        
	//   37   71:ireturn         
		}
		return true;
	}

	public volatile ResolvedType getContentType()
	{
		return ((ResolvedType) (getContentType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method JavaType getContentType()>
	//    2    4:areturn         
	}

	public JavaType getContentType()
	{
		return _valueType;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field JavaType _valueType>
	//    2    4:areturn         
	}

	public Object getContentTypeHandler()
	{
		return _valueType.getTypeHandler();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field JavaType _valueType>
	//    2    4:invokevirtual   #145 <Method Object JavaType.getTypeHandler()>
	//    3    7:areturn         
	}

	public Object getContentValueHandler()
	{
		return _valueType.getValueHandler();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field JavaType _valueType>
	//    2    4:invokevirtual   #149 <Method Object JavaType.getValueHandler()>
	//    3    7:areturn         
	}

	public StringBuilder getErasedSignature(StringBuilder stringbuilder)
	{
		return _classSignature(_class, stringbuilder, true);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field Class _class>
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:invokestatic    #155 <Method StringBuilder _classSignature(Class, StringBuilder, boolean)>
	//    5    9:areturn         
	}

	public StringBuilder getGenericSignature(StringBuilder stringbuilder)
	{
		_classSignature(_class, stringbuilder, false);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field Class _class>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokestatic    #155 <Method StringBuilder _classSignature(Class, StringBuilder, boolean)>
	//    5    9:pop             
		stringbuilder.append('<');
	//    6   10:aload_1         
	//    7   11:bipush          60
	//    8   13:invokevirtual   #128 <Method StringBuilder StringBuilder.append(char)>
	//    9   16:pop             
		_keyType.getGenericSignature(stringbuilder);
	//   10   17:aload_0         
	//   11   18:getfield        #18  <Field JavaType _keyType>
	//   12   21:aload_1         
	//   13   22:invokevirtual   #158 <Method StringBuilder JavaType.getGenericSignature(StringBuilder)>
	//   14   25:pop             
		_valueType.getGenericSignature(stringbuilder);
	//   15   26:aload_0         
	//   16   27:getfield        #20  <Field JavaType _valueType>
	//   17   30:aload_1         
	//   18   31:invokevirtual   #158 <Method StringBuilder JavaType.getGenericSignature(StringBuilder)>
	//   19   34:pop             
		stringbuilder.append(">;");
	//   20   35:aload_1         
	//   21   36:ldc1            #160 <String ">;">
	//   22   38:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   23   41:pop             
		return stringbuilder;
	//   24   42:aload_1         
	//   25   43:areturn         
	}

	public volatile ResolvedType getKeyType()
	{
		return ((ResolvedType) (getKeyType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #163 <Method JavaType getKeyType()>
	//    2    4:areturn         
	}

	public JavaType getKeyType()
	{
		return _keyType;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field JavaType _keyType>
	//    2    4:areturn         
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
	//    0    0:ldc1            #169 <Class Map>
	//    1    2:aload_0         
	//    2    3:getfield        #122 <Field Class _class>
	//    3    6:invokevirtual   #173 <Method boolean Class.isAssignableFrom(Class)>
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
	//    7   10:getfield        #18  <Field JavaType _keyType>
	//    8   13:aload_0         
	//    9   14:getfield        #20  <Field JavaType _valueType>
	//   10   17:aload_0         
	//   11   18:getfield        #109 <Field Object _valueHandler>
	//   12   21:aload_0         
	//   13   22:getfield        #112 <Field Object _typeHandler>
	//   14   25:aload_0         
	//   15   26:getfield        #116 <Field boolean _asStatic>
	//   16   29:invokespecial   #54  <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   17   32:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("[map-like type; class ").append(_class.getName()).append(", ").append(((Object) (_keyType))).append(" -> ").append(((Object) (_valueType))).append("]").toString();
	//    0    0:new             #68  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void StringBuilder()>
	//    3    7:ldc1            #178 <String "[map-like type; class ">
	//    4    9:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #122 <Field Class _class>
	//    7   16:invokevirtual   #125 <Method String Class.getName()>
	//    8   19:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #180 <String ", ">
	//   10   24:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #18  <Field JavaType _keyType>
	//   13   31:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   14   34:ldc1            #182 <String " -> ">
	//   15   36:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:aload_0         
	//   17   40:getfield        #20  <Field JavaType _valueType>
	//   18   43:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   19   46:ldc1            #184 <String "]">
	//   20   48:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   21   51:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   22   54:areturn         
	}

	public JavaType withContentType(JavaType javatype)
	{
		if(_valueType == javatype)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field JavaType _valueType>
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
	//    9   15:getfield        #122 <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #98  <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #101 <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #105 <Field JavaType[] _superInterfaces>
	//   16   30:aload_0         
	//   17   31:getfield        #18  <Field JavaType _keyType>
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #109 <Field Object _valueHandler>
	//   21   39:aload_0         
	//   22   40:getfield        #112 <Field Object _typeHandler>
	//   23   43:aload_0         
	//   24   44:getfield        #116 <Field boolean _asStatic>
	//   25   47:invokespecial   #54  <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   26   50:areturn         
	}

	public volatile JavaType withContentTypeHandler(Object obj)
	{
		return ((JavaType) (withContentTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #191 <Method MapLikeType withContentTypeHandler(Object)>
	//    3    5:areturn         
	}

	public MapLikeType withContentTypeHandler(Object obj)
	{
		return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withTypeHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #122 <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #98  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #101 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #105 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #18  <Field JavaType _keyType>
	//   12   24:aload_0         
	//   13   25:getfield        #20  <Field JavaType _valueType>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #194 <Method JavaType JavaType.withTypeHandler(Object)>
	//   16   32:aload_0         
	//   17   33:getfield        #109 <Field Object _valueHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #112 <Field Object _typeHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #116 <Field boolean _asStatic>
	//   22   44:invokespecial   #54  <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   23   47:areturn         
	}

	public volatile JavaType withContentValueHandler(Object obj)
	{
		return ((JavaType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #197 <Method MapLikeType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public MapLikeType withContentValueHandler(Object obj)
	{
		return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withValueHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #122 <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #98  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #101 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #105 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #18  <Field JavaType _keyType>
	//   12   24:aload_0         
	//   13   25:getfield        #20  <Field JavaType _valueType>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #200 <Method JavaType JavaType.withValueHandler(Object)>
	//   16   32:aload_0         
	//   17   33:getfield        #109 <Field Object _valueHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #112 <Field Object _typeHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #116 <Field boolean _asStatic>
	//   22   44:invokespecial   #54  <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   23   47:areturn         
	}

	public MapLikeType withKeyType(JavaType javatype)
	{
		if(javatype == _keyType)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #18  <Field JavaType _keyType>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, javatype, _valueType, _valueHandler, _typeHandler, _asStatic);
	//    6   10:new             #2   <Class MapLikeType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #122 <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #98  <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #101 <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #105 <Field JavaType[] _superInterfaces>
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #20  <Field JavaType _valueType>
	//   19   35:aload_0         
	//   20   36:getfield        #109 <Field Object _valueHandler>
	//   21   39:aload_0         
	//   22   40:getfield        #112 <Field Object _typeHandler>
	//   23   43:aload_0         
	//   24   44:getfield        #116 <Field boolean _asStatic>
	//   25   47:invokespecial   #54  <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   26   50:areturn         
	}

	public MapLikeType withKeyTypeHandler(Object obj)
	{
		return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType.withTypeHandler(obj), _valueType, _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #122 <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #98  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #101 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #105 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #18  <Field JavaType _keyType>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #194 <Method JavaType JavaType.withTypeHandler(Object)>
	//   14   28:aload_0         
	//   15   29:getfield        #20  <Field JavaType _valueType>
	//   16   32:aload_0         
	//   17   33:getfield        #109 <Field Object _valueHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #112 <Field Object _typeHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #116 <Field boolean _asStatic>
	//   22   44:invokespecial   #54  <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   23   47:areturn         
	}

	public MapLikeType withKeyValueHandler(Object obj)
	{
		return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType.withValueHandler(obj), _valueType, _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #122 <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #98  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #101 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #105 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #18  <Field JavaType _keyType>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #200 <Method JavaType JavaType.withValueHandler(Object)>
	//   14   28:aload_0         
	//   15   29:getfield        #20  <Field JavaType _valueType>
	//   16   32:aload_0         
	//   17   33:getfield        #109 <Field Object _valueHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #112 <Field Object _typeHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #116 <Field boolean _asStatic>
	//   22   44:invokespecial   #54  <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   23   47:areturn         
	}

	public volatile JavaType withStaticTyping()
	{
		return ((JavaType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #208 <Method MapLikeType withStaticTyping()>
	//    2    4:areturn         
	}

	public MapLikeType withStaticTyping()
	{
		if(_asStatic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field boolean _asStatic>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withStaticTyping(), _valueHandler, _typeHandler, true);
	//    5    9:new             #2   <Class MapLikeType>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #122 <Field Class _class>
	//    9   17:aload_0         
	//   10   18:getfield        #98  <Field TypeBindings _bindings>
	//   11   21:aload_0         
	//   12   22:getfield        #101 <Field JavaType _superClass>
	//   13   25:aload_0         
	//   14   26:getfield        #105 <Field JavaType[] _superInterfaces>
	//   15   29:aload_0         
	//   16   30:getfield        #18  <Field JavaType _keyType>
	//   17   33:aload_0         
	//   18   34:getfield        #20  <Field JavaType _valueType>
	//   19   37:invokevirtual   #210 <Method JavaType JavaType.withStaticTyping()>
	//   20   40:aload_0         
	//   21   41:getfield        #109 <Field Object _valueHandler>
	//   22   44:aload_0         
	//   23   45:getfield        #112 <Field Object _typeHandler>
	//   24   48:iconst_1        
	//   25   49:invokespecial   #54  <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   26   52:areturn         
	}

	public volatile JavaType withTypeHandler(Object obj)
	{
		return ((JavaType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #212 <Method MapLikeType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public MapLikeType withTypeHandler(Object obj)
	{
		return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType, _valueHandler, obj, _asStatic);
	//    0    0:new             #2   <Class MapLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #122 <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #98  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #101 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #105 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #18  <Field JavaType _keyType>
	//   12   24:aload_0         
	//   13   25:getfield        #20  <Field JavaType _valueType>
	//   14   28:aload_0         
	//   15   29:getfield        #109 <Field Object _valueHandler>
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #116 <Field boolean _asStatic>
	//   19   37:invokespecial   #54  <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   20   40:areturn         
	}

	public volatile JavaType withValueHandler(Object obj)
	{
		return ((JavaType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #214 <Method MapLikeType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public MapLikeType withValueHandler(Object obj)
	{
		return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType, obj, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class MapLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #122 <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #98  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #101 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #105 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #18  <Field JavaType _keyType>
	//   12   24:aload_0         
	//   13   25:getfield        #20  <Field JavaType _valueType>
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #112 <Field Object _typeHandler>
	//   17   33:aload_0         
	//   18   34:getfield        #116 <Field boolean _asStatic>
	//   19   37:invokespecial   #54  <Method void MapLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   20   40:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JavaType _keyType;
	protected final JavaType _valueType;
}
