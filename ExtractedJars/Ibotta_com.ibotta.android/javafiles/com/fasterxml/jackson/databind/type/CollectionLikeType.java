// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeBase, TypeBindings

public class CollectionLikeType extends TypeBase
{

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
	//    6    8:invokevirtual   #18  <Method int JavaType.hashCode()>
	//    7   11:aload           6
	//    8   13:aload           7
	//    9   15:iload           8
	//   10   17:invokespecial   #21  <Method void TypeBase(Class, TypeBindings, JavaType, JavaType[], int, Object, Object, boolean)>
		_elementType = javatype1;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #23  <Field JavaType _elementType>
	//   14   26:return          
	}

	protected String buildCanonicalName()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #30  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(_class.getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field Class _class>
	//    7   13:invokevirtual   #42  <Method String Class.getName()>
	//    8   16:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		if(_elementType != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #23  <Field JavaType _elementType>
	//*  12   24:ifnull          53
		{
			stringbuilder.append('<');
	//   13   27:aload_1         
	//   14   28:bipush          60
	//   15   30:invokevirtual   #49  <Method StringBuilder StringBuilder.append(char)>
	//   16   33:pop             
			stringbuilder.append(_elementType.toCanonical());
	//   17   34:aload_1         
	//   18   35:aload_0         
	//   19   36:getfield        #23  <Field JavaType _elementType>
	//   20   39:invokevirtual   #52  <Method String JavaType.toCanonical()>
	//   21   42:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   22   45:pop             
			stringbuilder.append('>');
	//   23   46:aload_1         
	//   24   47:bipush          62
	//   25   49:invokevirtual   #49  <Method StringBuilder StringBuilder.append(char)>
	//   26   52:pop             
		}
		return stringbuilder.toString();
	//   27   53:aload_1         
	//   28   54:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   29   57:areturn         
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
	//*  10   14:invokevirtual   #63  <Method Class Object.getClass()>
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #63  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((CollectionLikeType)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class CollectionLikeType>
	//   18   30:astore_1        
		return _class == ((CollectionLikeType) (obj))._class && _elementType.equals(((Object) (((CollectionLikeType) (obj))._elementType)));
	//   19   31:aload_0         
	//   20   32:getfield        #37  <Field Class _class>
	//   21   35:aload_1         
	//   22   36:getfield        #37  <Field Class _class>
	//   23   39:if_acmpne       58
	//   24   42:aload_0         
	//   25   43:getfield        #23  <Field JavaType _elementType>
	//   26   46:aload_1         
	//   27   47:getfield        #23  <Field JavaType _elementType>
	//   28   50:invokevirtual   #65  <Method boolean JavaType.equals(Object)>
	//   29   53:ifeq            58
	//   30   56:iconst_1        
	//   31   57:ireturn         
	//   32   58:iconst_0        
	//   33   59:ireturn         
	}

	public JavaType getContentType()
	{
		return _elementType;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field JavaType _elementType>
	//    2    4:areturn         
	}

	public StringBuilder getGenericSignature(StringBuilder stringbuilder)
	{
		_classSignature(_class, stringbuilder, false);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Class _class>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokestatic    #73  <Method StringBuilder _classSignature(Class, StringBuilder, boolean)>
	//    5    9:pop             
		stringbuilder.append('<');
	//    6   10:aload_1         
	//    7   11:bipush          60
	//    8   13:invokevirtual   #49  <Method StringBuilder StringBuilder.append(char)>
	//    9   16:pop             
		_elementType.getGenericSignature(stringbuilder);
	//   10   17:aload_0         
	//   11   18:getfield        #23  <Field JavaType _elementType>
	//   12   21:aload_1         
	//   13   22:invokevirtual   #75  <Method StringBuilder JavaType.getGenericSignature(StringBuilder)>
	//   14   25:pop             
		stringbuilder.append(">;");
	//   15   26:aload_1         
	//   16   27:ldc1            #77  <String ">;">
	//   17   29:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
		return stringbuilder;
	//   19   33:aload_1         
	//   20   34:areturn         
	}

	public boolean hasHandlers()
	{
		return super.hasHandlers() || _elementType.hasHandlers();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method boolean TypeBase.hasHandlers()>
	//    2    4:ifne            22
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field JavaType _elementType>
	//    5   11:invokevirtual   #82  <Method boolean JavaType.hasHandlers()>
	//    6   14:ifeq            20
	//    7   17:goto            22
	//    8   20:iconst_0        
	//    9   21:ireturn         
	//   10   22:iconst_1        
	//   11   23:ireturn         
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
	//    0    0:ldc1            #87  <Class Collection>
	//    1    2:aload_0         
	//    2    3:getfield        #37  <Field Class _class>
	//    3    6:invokevirtual   #91  <Method boolean Class.isAssignableFrom(Class)>
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
	//    7   10:getfield        #23  <Field JavaType _elementType>
	//    8   13:aload_0         
	//    9   14:getfield        #97  <Field Object _valueHandler>
	//   10   17:aload_0         
	//   11   18:getfield        #100 <Field Object _typeHandler>
	//   12   21:aload_0         
	//   13   22:getfield        #104 <Field boolean _asStatic>
	//   14   25:invokespecial   #106 <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   15   28:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #30  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[collection-like type; class ");
	//    4    8:aload_1         
	//    5    9:ldc1            #109 <String "[collection-like type; class ">
	//    6   11:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(_class.getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #37  <Field Class _class>
	//   11   20:invokevirtual   #42  <Method String Class.getName()>
	//   12   23:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(", contains ");
	//   14   27:aload_1         
	//   15   28:ldc1            #111 <String ", contains ">
	//   16   30:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(((Object) (_elementType)));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #23  <Field JavaType _elementType>
	//   21   39:invokevirtual   #114 <Method StringBuilder StringBuilder.append(Object)>
	//   22   42:pop             
		stringbuilder.append("]");
	//   23   43:aload_1         
	//   24   44:ldc1            #116 <String "]">
	//   25   46:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		return stringbuilder.toString();
	//   27   50:aload_1         
	//   28   51:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   29   54:areturn         
	}

	public JavaType withContentType(JavaType javatype)
	{
		if(_elementType == javatype)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field JavaType _elementType>
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
	//    9   15:getfield        #37  <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #122 <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #125 <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #129 <Field JavaType[] _superInterfaces>
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #97  <Field Object _valueHandler>
	//   19   35:aload_0         
	//   20   36:getfield        #100 <Field Object _typeHandler>
	//   21   39:aload_0         
	//   22   40:getfield        #104 <Field boolean _asStatic>
	//   23   43:invokespecial   #106 <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   24   46:areturn         
	}

	public volatile JavaType withContentTypeHandler(Object obj)
	{
		return ((JavaType) (withContentTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #134 <Method CollectionLikeType withContentTypeHandler(Object)>
	//    3    5:areturn         
	}

	public CollectionLikeType withContentTypeHandler(Object obj)
	{
		return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType.withTypeHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class CollectionLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #122 <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #125 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #129 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #23  <Field JavaType _elementType>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #137 <Method JavaType JavaType.withTypeHandler(Object)>
	//   14   28:aload_0         
	//   15   29:getfield        #97  <Field Object _valueHandler>
	//   16   32:aload_0         
	//   17   33:getfield        #100 <Field Object _typeHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #104 <Field boolean _asStatic>
	//   20   40:invokespecial   #106 <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   21   43:areturn         
	}

	public volatile JavaType withContentValueHandler(Object obj)
	{
		return ((JavaType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #140 <Method CollectionLikeType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public CollectionLikeType withContentValueHandler(Object obj)
	{
		return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType.withValueHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class CollectionLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #122 <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #125 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #129 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #23  <Field JavaType _elementType>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #143 <Method JavaType JavaType.withValueHandler(Object)>
	//   14   28:aload_0         
	//   15   29:getfield        #97  <Field Object _valueHandler>
	//   16   32:aload_0         
	//   17   33:getfield        #100 <Field Object _typeHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #104 <Field boolean _asStatic>
	//   20   40:invokespecial   #106 <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   21   43:areturn         
	}

	public JavaType withHandlersFrom(JavaType javatype)
	{
		JavaType javatype1 = super.withHandlersFrom(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #146 <Method JavaType TypeBase.withHandlersFrom(JavaType)>
	//    3    5:astore_2        
		JavaType javatype2 = javatype.getContentType();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #148 <Method JavaType JavaType.getContentType()>
	//    6   10:astore_3        
		javatype = javatype1;
	//    7   11:aload_2         
	//    8   12:astore_1        
		if(javatype2 != null)
	//*   9   13:aload_3         
	//*  10   14:ifnull          42
		{
			javatype2 = _elementType.withHandlersFrom(javatype2);
	//   11   17:aload_0         
	//   12   18:getfield        #23  <Field JavaType _elementType>
	//   13   21:aload_3         
	//   14   22:invokevirtual   #149 <Method JavaType JavaType.withHandlersFrom(JavaType)>
	//   15   25:astore_3        
			javatype = javatype1;
	//   16   26:aload_2         
	//   17   27:astore_1        
			if(javatype2 != _elementType)
	//*  18   28:aload_3         
	//*  19   29:aload_0         
	//*  20   30:getfield        #23  <Field JavaType _elementType>
	//*  21   33:if_acmpeq       42
				javatype = javatype1.withContentType(javatype2);
	//   22   36:aload_2         
	//   23   37:aload_3         
	//   24   38:invokevirtual   #151 <Method JavaType JavaType.withContentType(JavaType)>
	//   25   41:astore_1        
		}
		return javatype;
	//   26   42:aload_1         
	//   27   43:areturn         
	}

	public volatile JavaType withStaticTyping()
	{
		return ((JavaType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #155 <Method CollectionLikeType withStaticTyping()>
	//    2    4:areturn         
	}

	public CollectionLikeType withStaticTyping()
	{
		if(_asStatic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field boolean _asStatic>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType.withStaticTyping(), _valueHandler, _typeHandler, true);
	//    5    9:new             #2   <Class CollectionLikeType>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #37  <Field Class _class>
	//    9   17:aload_0         
	//   10   18:getfield        #122 <Field TypeBindings _bindings>
	//   11   21:aload_0         
	//   12   22:getfield        #125 <Field JavaType _superClass>
	//   13   25:aload_0         
	//   14   26:getfield        #129 <Field JavaType[] _superInterfaces>
	//   15   29:aload_0         
	//   16   30:getfield        #23  <Field JavaType _elementType>
	//   17   33:invokevirtual   #157 <Method JavaType JavaType.withStaticTyping()>
	//   18   36:aload_0         
	//   19   37:getfield        #97  <Field Object _valueHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #100 <Field Object _typeHandler>
	//   22   44:iconst_1        
	//   23   45:invokespecial   #106 <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   24   48:areturn         
	}

	public volatile JavaType withTypeHandler(Object obj)
	{
		return ((JavaType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #159 <Method CollectionLikeType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public CollectionLikeType withTypeHandler(Object obj)
	{
		return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType, _valueHandler, obj, _asStatic);
	//    0    0:new             #2   <Class CollectionLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #122 <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #125 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #129 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #23  <Field JavaType _elementType>
	//   12   24:aload_0         
	//   13   25:getfield        #97  <Field Object _valueHandler>
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #104 <Field boolean _asStatic>
	//   17   33:invokespecial   #106 <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   18   36:areturn         
	}

	public volatile JavaType withValueHandler(Object obj)
	{
		return ((JavaType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #161 <Method CollectionLikeType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public CollectionLikeType withValueHandler(Object obj)
	{
		return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType, obj, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class CollectionLikeType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #122 <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #125 <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #129 <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #23  <Field JavaType _elementType>
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #100 <Field Object _typeHandler>
	//   15   29:aload_0         
	//   16   30:getfield        #104 <Field boolean _asStatic>
	//   17   33:invokespecial   #106 <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   18   36:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JavaType _elementType;
}
