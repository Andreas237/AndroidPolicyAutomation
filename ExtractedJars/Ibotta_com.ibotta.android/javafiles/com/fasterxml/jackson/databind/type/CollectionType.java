// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			CollectionLikeType, TypeBindings

public final class CollectionType extends CollectionLikeType
{

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
	//    9   14:invokespecial   #12  <Method void CollectionLikeType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   10   17:return          
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
	//   10   13:invokespecial   #18  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   11   16:areturn         
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
	//    7   10:getfield        #25  <Field JavaType _elementType>
	//    8   13:aload_0         
	//    9   14:getfield        #29  <Field Object _valueHandler>
	//   10   17:aload_0         
	//   11   18:getfield        #32  <Field Object _typeHandler>
	//   12   21:aload_0         
	//   13   22:getfield        #36  <Field boolean _asStatic>
	//   14   25:invokespecial   #18  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   15   28:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #41  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[collection type; class ");
	//    4    8:aload_1         
	//    5    9:ldc1            #46  <String "[collection type; class ">
	//    6   11:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(_class.getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #54  <Field Class _class>
	//   11   20:invokevirtual   #59  <Method String Class.getName()>
	//   12   23:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(", contains ");
	//   14   27:aload_1         
	//   15   28:ldc1            #61  <String ", contains ">
	//   16   30:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(((Object) (_elementType)));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #25  <Field JavaType _elementType>
	//   21   39:invokevirtual   #64  <Method StringBuilder StringBuilder.append(Object)>
	//   22   42:pop             
		stringbuilder.append("]");
	//   23   43:aload_1         
	//   24   44:ldc1            #66  <String "]">
	//   25   46:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		return stringbuilder.toString();
	//   27   50:aload_1         
	//   28   51:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   29   54:areturn         
	}

	public JavaType withContentType(JavaType javatype)
	{
		if(_elementType == javatype)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field JavaType _elementType>
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
	//    9   15:getfield        #54  <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #74  <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #77  <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #81  <Field JavaType[] _superInterfaces>
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #29  <Field Object _valueHandler>
	//   19   35:aload_0         
	//   20   36:getfield        #32  <Field Object _typeHandler>
	//   21   39:aload_0         
	//   22   40:getfield        #36  <Field boolean _asStatic>
	//   23   43:invokespecial   #18  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   24   46:areturn         
	}

	public volatile JavaType withContentTypeHandler(Object obj)
	{
		return ((JavaType) (withContentTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #86  <Method CollectionType withContentTypeHandler(Object)>
	//    3    5:areturn         
	}

	public volatile CollectionLikeType withContentTypeHandler(Object obj)
	{
		return ((CollectionLikeType) (withContentTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #86  <Method CollectionType withContentTypeHandler(Object)>
	//    3    5:areturn         
	}

	public CollectionType withContentTypeHandler(Object obj)
	{
		return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withTypeHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class CollectionType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #77  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #81  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field JavaType _elementType>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #92  <Method JavaType JavaType.withTypeHandler(Object)>
	//   14   28:aload_0         
	//   15   29:getfield        #29  <Field Object _valueHandler>
	//   16   32:aload_0         
	//   17   33:getfield        #32  <Field Object _typeHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #36  <Field boolean _asStatic>
	//   20   40:invokespecial   #18  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   21   43:areturn         
	}

	public volatile JavaType withContentValueHandler(Object obj)
	{
		return ((JavaType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #95  <Method CollectionType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public volatile CollectionLikeType withContentValueHandler(Object obj)
	{
		return ((CollectionLikeType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #95  <Method CollectionType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public CollectionType withContentValueHandler(Object obj)
	{
		return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withValueHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class CollectionType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #77  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #81  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field JavaType _elementType>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #98  <Method JavaType JavaType.withValueHandler(Object)>
	//   14   28:aload_0         
	//   15   29:getfield        #29  <Field Object _valueHandler>
	//   16   32:aload_0         
	//   17   33:getfield        #32  <Field Object _typeHandler>
	//   18   36:aload_0         
	//   19   37:getfield        #36  <Field boolean _asStatic>
	//   20   40:invokespecial   #18  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   21   43:areturn         
	}

	public volatile JavaType withStaticTyping()
	{
		return ((JavaType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #103 <Method CollectionType withStaticTyping()>
	//    2    4:areturn         
	}

	public volatile CollectionLikeType withStaticTyping()
	{
		return ((CollectionLikeType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #103 <Method CollectionType withStaticTyping()>
	//    2    4:areturn         
	}

	public CollectionType withStaticTyping()
	{
		if(_asStatic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field boolean _asStatic>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withStaticTyping(), _valueHandler, _typeHandler, true);
	//    5    9:new             #2   <Class CollectionType>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #54  <Field Class _class>
	//    9   17:aload_0         
	//   10   18:getfield        #74  <Field TypeBindings _bindings>
	//   11   21:aload_0         
	//   12   22:getfield        #77  <Field JavaType _superClass>
	//   13   25:aload_0         
	//   14   26:getfield        #81  <Field JavaType[] _superInterfaces>
	//   15   29:aload_0         
	//   16   30:getfield        #25  <Field JavaType _elementType>
	//   17   33:invokevirtual   #106 <Method JavaType JavaType.withStaticTyping()>
	//   18   36:aload_0         
	//   19   37:getfield        #29  <Field Object _valueHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #32  <Field Object _typeHandler>
	//   22   44:iconst_1        
	//   23   45:invokespecial   #18  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   24   48:areturn         
	}

	public volatile JavaType withTypeHandler(Object obj)
	{
		return ((JavaType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #108 <Method CollectionType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public volatile CollectionLikeType withTypeHandler(Object obj)
	{
		return ((CollectionLikeType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #108 <Method CollectionType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public CollectionType withTypeHandler(Object obj)
	{
		return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType, _valueHandler, obj, _asStatic);
	//    0    0:new             #2   <Class CollectionType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #77  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #81  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field JavaType _elementType>
	//   12   24:aload_0         
	//   13   25:getfield        #29  <Field Object _valueHandler>
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #36  <Field boolean _asStatic>
	//   17   33:invokespecial   #18  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   18   36:areturn         
	}

	public volatile JavaType withValueHandler(Object obj)
	{
		return ((JavaType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #110 <Method CollectionType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public volatile CollectionLikeType withValueHandler(Object obj)
	{
		return ((CollectionLikeType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #110 <Method CollectionType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public CollectionType withValueHandler(Object obj)
	{
		return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType, obj, _typeHandler, _asStatic);
	//    0    0:new             #2   <Class CollectionType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field Class _class>
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field TypeBindings _bindings>
	//    6   12:aload_0         
	//    7   13:getfield        #77  <Field JavaType _superClass>
	//    8   16:aload_0         
	//    9   17:getfield        #81  <Field JavaType[] _superInterfaces>
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field JavaType _elementType>
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #32  <Field Object _typeHandler>
	//   15   29:aload_0         
	//   16   30:getfield        #36  <Field boolean _asStatic>
	//   17   33:invokespecial   #18  <Method void CollectionType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   18   36:areturn         
	}

	private static final long serialVersionUID = 1L;
}
