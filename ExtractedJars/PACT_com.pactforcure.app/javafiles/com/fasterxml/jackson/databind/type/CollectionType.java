// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			CollectionLikeType, TypeBindings, TypeBase

public final class CollectionType extends CollectionLikeType
{

	protected CollectionType(TypeBase typebase, JavaType javatype)
	{
		super(typebase, javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void CollectionLikeType(TypeBase, JavaType)>
	//    4    6:return          
	}

	private CollectionType(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[], JavaType javatype1, Object obj, Object obj1, 
			boolean flag)
	{
		super(class1, typebindings, javatype, ajavatype, javatype1, obj, obj1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:iload           8
	//    9   14:invokespecial   #16  <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   10   17:return          
	}

	public static CollectionType construct(Class class1, JavaType javatype)
	{
		java.lang.reflect.TypeVariable atypevariable[] = class1.getTypeParameters();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method java.lang.reflect.TypeVariable[] Class.getTypeParameters()>
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
	//    9   15:invokestatic    #33  <Method TypeBindings TypeBindings.emptyBindings()>
	//   10   18:astore_2        
		else
	//*  11   19:new             #2   <Class CollectionType>
	//*  12   22:dup             
	//*  13   23:aload_0         
	//*  14   24:aload_2         
	//*  15   25:aload_0         
	//*  16   26:invokestatic    #37  <Method JavaType _bogusSuperClass(Class)>
	//*  17   29:aconst_null     
	//*  18   30:aload_1         
	//*  19   31:aconst_null     
	//*  20   32:aconst_null     
	//*  21   33:iconst_0        
	//*  22   34:invokespecial   #38  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//*  23   37:areturn         
			typebindings = TypeBindings.create(class1, javatype);
	//   24   38:aload_0         
	//   25   39:aload_1         
	//   26   40:invokestatic    #42  <Method TypeBindings TypeBindings.create(Class, JavaType)>
	//   27   43:astore_2        
		return new CollectionType(class1, typebindings, _bogusSuperClass(class1), ((JavaType []) (null)), javatype, ((Object) (null)), ((Object) (null)), false);
	//*  28   44:goto            19
	}

	public static CollectionType construct(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[], JavaType javatype1)
	{
		return new CollectionType(class1, typebindings, javatype, ajavatype, javatype1, ((Object) (null)), ((Object) (null)), false);
	//    0    0:new             #2   <Class CollectionType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aconst_null     
	//    8   11:aconst_null     
	//    9   12:iconst_0        
	//   10   13:invokespecial   #38  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   11   16:areturn         
	}

	protected JavaType _narrow(Class class1)
	{
		return ((JavaType) (new CollectionType(class1, _bindings, _superClass, _superInterfaces, _elementType, ((Object) (null)), ((Object) (null)), _asStatic)));
	//    0    0:new             #2   <Class CollectionType>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field TypeBindings _bindings>
	//    5    9:aload_0         
	//    6   10:getfield        #55  <Field JavaType _superClass>
	//    7   13:aload_0         
	//    8   14:getfield        #59  <Field JavaType[] _superInterfaces>
	//    9   17:aload_0         
	//   10   18:getfield        #62  <Field JavaType _elementType>
	//   11   21:aconst_null     
	//   12   22:aconst_null     
	//   13   23:aload_0         
	//   14   24:getfield        #66  <Field boolean _asStatic>
	//   15   27:invokespecial   #38  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   16   30:areturn         
	}

	public JavaType refine(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		return ((JavaType) (new CollectionType(class1, typebindings, javatype, ajavatype, _elementType, _valueHandler, _typeHandler, _asStatic)));
	//    0    0:new             #2   <Class CollectionType>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload_0         
	//    7   10:getfield        #62  <Field JavaType _elementType>
	//    8   13:aload_0         
	//    9   14:getfield        #73  <Field Object _valueHandler>
	//   10   17:aload_0         
	//   11   18:getfield        #76  <Field Object _typeHandler>
	//   12   21:aload_0         
	//   13   22:getfield        #66  <Field boolean _asStatic>
	//   14   25:invokespecial   #38  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   15   28:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("[collection type; class ").append(_class.getName()).append(", contains ").append(((Object) (_elementType))).append("]").toString();
	//    0    0:new             #81  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #84  <Method void StringBuilder()>
	//    3    7:ldc1            #86  <String "[collection type; class ">
	//    4    9:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #94  <Field Class _class>
	//    7   16:invokevirtual   #97  <Method String Class.getName()>
	//    8   19:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #99  <String ", contains ">
	//   10   24:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #62  <Field JavaType _elementType>
	//   13   31:invokevirtual   #102 <Method StringBuilder StringBuilder.append(Object)>
	//   14   34:ldc1            #104 <String "]">
	//   15   36:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   17   42:areturn         
	}

	public JavaType withContentType(JavaType javatype)
	{
		if(_elementType == javatype)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field JavaType _elementType>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return ((JavaType) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((JavaType) (new CollectionType(_class, _bindings, _superClass, _superInterfaces, javatype, _valueHandler, _typeHandler, _asStatic)));
	//    6   10:new             #2   <Class CollectionType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #94  <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #51  <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #55  <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #59  <Field JavaType[] _superInterfaces>
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #73  <Field Object _valueHandler>
	//   19   35:aload_0         
	//   20   36:getfield        #76  <Field Object _typeHandler>
	//   21   39:aload_0         
	//   22   40:getfield        #66  <Field boolean _asStatic>
	//   23   43:invokespecial   #38  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   24   46:areturn         
	}

	public volatile JavaType withContentTypeHandler(Object obj)
	{
		return ((JavaType) (withContentTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #113 <Method CollectionType withContentTypeHandler(Object)>
	//    3    5:areturn         
	}

	public volatile CollectionLikeType withContentTypeHandler(Object obj)
	{
		return ((CollectionLikeType) (withContentTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #113 <Method CollectionType withContentTypeHandler(Object)>
	//    3    5:areturn         
	}

	public CollectionType withContentTypeHandler(Object obj)
	{
		return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withTypeHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class CollectionType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #94  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #55  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #62  <Field JavaType _elementType>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #119 <Method JavaType JavaType.withTypeHandler(Object)>
	//   14   28:aload_0         
	//   15   29:getfield        #73  <Field Object _valueHandler>
	//   16   32:aload_0         
	//   17   33:getfield        #76  <Field Object _typeHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #66  <Field boolean _asStatic>
	//   20   40:invokespecial   #38  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   21   43:areturn         
	}

	public volatile JavaType withContentValueHandler(Object obj)
	{
		return ((JavaType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #122 <Method CollectionType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public volatile CollectionLikeType withContentValueHandler(Object obj)
	{
		return ((CollectionLikeType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #122 <Method CollectionType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public CollectionType withContentValueHandler(Object obj)
	{
		return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withValueHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class CollectionType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #94  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #55  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #62  <Field JavaType _elementType>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #125 <Method JavaType JavaType.withValueHandler(Object)>
	//   14   28:aload_0         
	//   15   29:getfield        #73  <Field Object _valueHandler>
	//   16   32:aload_0         
	//   17   33:getfield        #76  <Field Object _typeHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #66  <Field boolean _asStatic>
	//   20   40:invokespecial   #38  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   21   43:areturn         
	}

	public volatile JavaType withStaticTyping()
	{
		return ((JavaType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method CollectionType withStaticTyping()>
	//    2    4:areturn         
	}

	public volatile CollectionLikeType withStaticTyping()
	{
		return ((CollectionLikeType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method CollectionType withStaticTyping()>
	//    2    4:areturn         
	}

	public CollectionType withStaticTyping()
	{
		if(_asStatic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field boolean _asStatic>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withStaticTyping(), _valueHandler, _typeHandler, true);
	//    5    9:new             #2   <Class CollectionType>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #94  <Field Class _class>
	//    9   17:aload_0         
	//   10   18:getfield        #51  <Field TypeBindings _bindings>
	//   11   21:aload_0         
	//   12   22:getfield        #55  <Field JavaType _superClass>
	//   13   25:aload_0         
	//   14   26:getfield        #59  <Field JavaType[] _superInterfaces>
	//   15   29:aload_0         
	//   16   30:getfield        #62  <Field JavaType _elementType>
	//   17   33:invokevirtual   #133 <Method JavaType JavaType.withStaticTyping()>
	//   18   36:aload_0         
	//   19   37:getfield        #73  <Field Object _valueHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #76  <Field Object _typeHandler>
	//   22   44:iconst_1        
	//   23   45:invokespecial   #38  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   24   48:areturn         
	}

	public volatile JavaType withTypeHandler(Object obj)
	{
		return ((JavaType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #135 <Method CollectionType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public volatile CollectionLikeType withTypeHandler(Object obj)
	{
		return ((CollectionLikeType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #135 <Method CollectionType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public CollectionType withTypeHandler(Object obj)
	{
		return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType, _valueHandler, obj, _asStatic);
	//    0    0:new             #2   <Class CollectionType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #94  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #55  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #62  <Field JavaType _elementType>
	//   12   24:aload_0         
	//   13   25:getfield        #73  <Field Object _valueHandler>
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #66  <Field boolean _asStatic>
	//   17   33:invokespecial   #38  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   18   36:areturn         
	}

	public volatile JavaType withValueHandler(Object obj)
	{
		return ((JavaType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #137 <Method CollectionType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public volatile CollectionLikeType withValueHandler(Object obj)
	{
		return ((CollectionLikeType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #137 <Method CollectionType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public CollectionType withValueHandler(Object obj)
	{
		return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType, obj, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class CollectionType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #94  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #55  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #62  <Field JavaType _elementType>
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #76  <Field Object _typeHandler>
	//   15   29:aload_0         
	//   16   30:getfield        #66  <Field boolean _asStatic>
	//   17   33:invokespecial   #38  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   18   36:areturn         
	}

	private static final long serialVersionUID = 1L;
}
