// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Array;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeBase, TypeBindings

public final class ArrayType extends TypeBase
{

	protected ArrayType(JavaType javatype, TypeBindings typebindings, Object obj, Object obj1, Object obj2, boolean flag)
	{
		super(obj.getClass(), typebindings, ((JavaType) (null)), ((JavaType []) (null)), javatype.hashCode(), obj1, obj2, flag);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #20  <Method Class Object.getClass()>
	//    3    5:aload_2         
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:aload_1         
	//    7    9:invokevirtual   #26  <Method int JavaType.hashCode()>
	//    8   12:aload           4
	//    9   14:aload           5
	//   10   16:iload           6
	//   11   18:invokespecial   #29  <Method void TypeBase(Class, TypeBindings, JavaType, JavaType[], int, Object, Object, boolean)>
		_componentType = javatype;
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:putfield        #31  <Field JavaType _componentType>
		_emptyArray = obj;
	//   15   26:aload_0         
	//   16   27:aload_3         
	//   17   28:putfield        #33  <Field Object _emptyArray>
	//   18   31:return          
	}

	public static ArrayType construct(JavaType javatype, TypeBindings typebindings)
	{
		return construct(javatype, typebindings, ((Object) (null)), ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokestatic    #39  <Method ArrayType construct(JavaType, TypeBindings, Object, Object)>
	//    5    7:areturn         
	}

	public static ArrayType construct(JavaType javatype, TypeBindings typebindings, Object obj, Object obj1)
	{
		return new ArrayType(javatype, typebindings, Array.newInstance(javatype.getRawClass(), 0), obj, obj1, false);
	//    0    0:new             #2   <Class ArrayType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #42  <Method Class JavaType.getRawClass()>
	//    6   10:iconst_0        
	//    7   11:invokestatic    #48  <Method Object Array.newInstance(Class, int)>
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:iconst_0        
	//   11   17:invokespecial   #50  <Method void ArrayType(JavaType, TypeBindings, Object, Object, Object, boolean)>
	//   12   20:areturn         
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
	//*  10   14:invokevirtual   #20  <Method Class Object.getClass()>
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #20  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
		{
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		} else
		{
			obj = ((Object) ((ArrayType)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class ArrayType>
	//   18   30:astore_1        
			return _componentType.equals(((Object) (((ArrayType) (obj))._componentType)));
	//   19   31:aload_0         
	//   20   32:getfield        #31  <Field JavaType _componentType>
	//   21   35:aload_1         
	//   22   36:getfield        #31  <Field JavaType _componentType>
	//   23   39:invokevirtual   #54  <Method boolean JavaType.equals(Object)>
	//   24   42:ireturn         
		}
	}

	public JavaType getContentType()
	{
		return _componentType;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field JavaType _componentType>
	//    2    4:areturn         
	}

	public StringBuilder getGenericSignature(StringBuilder stringbuilder)
	{
		stringbuilder.append('[');
	//    0    0:aload_1         
	//    1    1:bipush          91
	//    2    3:invokevirtual   #64  <Method StringBuilder StringBuilder.append(char)>
	//    3    6:pop             
		return _componentType.getGenericSignature(stringbuilder);
	//    4    7:aload_0         
	//    5    8:getfield        #31  <Field JavaType _componentType>
	//    6   11:aload_1         
	//    7   12:invokevirtual   #66  <Method StringBuilder JavaType.getGenericSignature(StringBuilder)>
	//    8   15:areturn         
	}

	public boolean hasGenericTypes()
	{
		return _componentType.hasGenericTypes();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field JavaType _componentType>
	//    2    4:invokevirtual   #70  <Method boolean JavaType.hasGenericTypes()>
	//    3    7:ireturn         
	}

	public boolean hasHandlers()
	{
		return super.hasHandlers() || _componentType.hasHandlers();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method boolean TypeBase.hasHandlers()>
	//    2    4:ifne            22
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field JavaType _componentType>
	//    5   11:invokevirtual   #74  <Method boolean JavaType.hasHandlers()>
	//    6   14:ifeq            20
	//    7   17:goto            22
	//    8   20:iconst_0        
	//    9   21:ireturn         
	//   10   22:iconst_1        
	//   11   23:ireturn         
	}

	public boolean isAbstract()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isArrayType()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isConcrete()
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

	public JavaType refine(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #60  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[array type, component type: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #89  <String "[array type, component type: ">
	//    6   11:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (_componentType)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #31  <Field JavaType _componentType>
	//   11   20:invokevirtual   #95  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append("]");
	//   13   24:aload_1         
	//   14   25:ldc1            #97  <String "]">
	//   15   27:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	public JavaType withContentType(JavaType javatype)
	{
		Object obj = Array.newInstance(javatype.getRawClass(), 0);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #42  <Method Class JavaType.getRawClass()>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #48  <Method Object Array.newInstance(Class, int)>
	//    4    8:astore_2        
		return ((JavaType) (new ArrayType(javatype, _bindings, obj, _valueHandler, _typeHandler, _asStatic)));
	//    5    9:new             #2   <Class ArrayType>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #105 <Field TypeBindings _bindings>
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:getfield        #108 <Field Object _valueHandler>
	//   13   23:aload_0         
	//   14   24:getfield        #111 <Field Object _typeHandler>
	//   15   27:aload_0         
	//   16   28:getfield        #115 <Field boolean _asStatic>
	//   17   31:invokespecial   #50  <Method void ArrayType(JavaType, TypeBindings, Object, Object, Object, boolean)>
	//   18   34:areturn         
	}

	public volatile JavaType withContentTypeHandler(Object obj)
	{
		return ((JavaType) (withContentTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #120 <Method ArrayType withContentTypeHandler(Object)>
	//    3    5:areturn         
	}

	public ArrayType withContentTypeHandler(Object obj)
	{
		if(obj == _componentType.getTypeHandler())
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #31  <Field JavaType _componentType>
	//*   3    5:invokevirtual   #124 <Method Object JavaType.getTypeHandler()>
	//*   4    8:if_acmpne       13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return new ArrayType(_componentType.withTypeHandler(obj), _bindings, _emptyArray, _valueHandler, _typeHandler, _asStatic);
	//    7   13:new             #2   <Class ArrayType>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #31  <Field JavaType _componentType>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #127 <Method JavaType JavaType.withTypeHandler(Object)>
	//   13   25:aload_0         
	//   14   26:getfield        #105 <Field TypeBindings _bindings>
	//   15   29:aload_0         
	//   16   30:getfield        #33  <Field Object _emptyArray>
	//   17   33:aload_0         
	//   18   34:getfield        #108 <Field Object _valueHandler>
	//   19   37:aload_0         
	//   20   38:getfield        #111 <Field Object _typeHandler>
	//   21   41:aload_0         
	//   22   42:getfield        #115 <Field boolean _asStatic>
	//   23   45:invokespecial   #50  <Method void ArrayType(JavaType, TypeBindings, Object, Object, Object, boolean)>
	//   24   48:areturn         
	}

	public volatile JavaType withContentValueHandler(Object obj)
	{
		return ((JavaType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #130 <Method ArrayType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public ArrayType withContentValueHandler(Object obj)
	{
		if(obj == _componentType.getValueHandler())
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #31  <Field JavaType _componentType>
	//*   3    5:invokevirtual   #133 <Method Object JavaType.getValueHandler()>
	//*   4    8:if_acmpne       13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return new ArrayType(_componentType.withValueHandler(obj), _bindings, _emptyArray, _valueHandler, _typeHandler, _asStatic);
	//    7   13:new             #2   <Class ArrayType>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #31  <Field JavaType _componentType>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #136 <Method JavaType JavaType.withValueHandler(Object)>
	//   13   25:aload_0         
	//   14   26:getfield        #105 <Field TypeBindings _bindings>
	//   15   29:aload_0         
	//   16   30:getfield        #33  <Field Object _emptyArray>
	//   17   33:aload_0         
	//   18   34:getfield        #108 <Field Object _valueHandler>
	//   19   37:aload_0         
	//   20   38:getfield        #111 <Field Object _typeHandler>
	//   21   41:aload_0         
	//   22   42:getfield        #115 <Field boolean _asStatic>
	//   23   45:invokespecial   #50  <Method void ArrayType(JavaType, TypeBindings, Object, Object, Object, boolean)>
	//   24   48:areturn         
	}

	public volatile JavaType withStaticTyping()
	{
		return ((JavaType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method ArrayType withStaticTyping()>
	//    2    4:areturn         
	}

	public ArrayType withStaticTyping()
	{
		if(_asStatic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean _asStatic>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return new ArrayType(_componentType.withStaticTyping(), _bindings, _emptyArray, _valueHandler, _typeHandler, true);
	//    5    9:new             #2   <Class ArrayType>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #31  <Field JavaType _componentType>
	//    9   17:invokevirtual   #142 <Method JavaType JavaType.withStaticTyping()>
	//   10   20:aload_0         
	//   11   21:getfield        #105 <Field TypeBindings _bindings>
	//   12   24:aload_0         
	//   13   25:getfield        #33  <Field Object _emptyArray>
	//   14   28:aload_0         
	//   15   29:getfield        #108 <Field Object _valueHandler>
	//   16   32:aload_0         
	//   17   33:getfield        #111 <Field Object _typeHandler>
	//   18   36:iconst_1        
	//   19   37:invokespecial   #50  <Method void ArrayType(JavaType, TypeBindings, Object, Object, Object, boolean)>
	//   20   40:areturn         
	}

	public volatile JavaType withTypeHandler(Object obj)
	{
		return ((JavaType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #144 <Method ArrayType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public ArrayType withTypeHandler(Object obj)
	{
		if(obj == _typeHandler)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #111 <Field Object _typeHandler>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new ArrayType(_componentType, _bindings, _emptyArray, _valueHandler, obj, _asStatic);
	//    6   10:new             #2   <Class ArrayType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #31  <Field JavaType _componentType>
	//   10   18:aload_0         
	//   11   19:getfield        #105 <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #33  <Field Object _emptyArray>
	//   14   26:aload_0         
	//   15   27:getfield        #108 <Field Object _valueHandler>
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #115 <Field boolean _asStatic>
	//   19   35:invokespecial   #50  <Method void ArrayType(JavaType, TypeBindings, Object, Object, Object, boolean)>
	//   20   38:areturn         
	}

	public volatile JavaType withValueHandler(Object obj)
	{
		return ((JavaType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #146 <Method ArrayType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public ArrayType withValueHandler(Object obj)
	{
		if(obj == _valueHandler)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #108 <Field Object _valueHandler>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new ArrayType(_componentType, _bindings, _emptyArray, obj, _typeHandler, _asStatic);
	//    6   10:new             #2   <Class ArrayType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #31  <Field JavaType _componentType>
	//   10   18:aload_0         
	//   11   19:getfield        #105 <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #33  <Field Object _emptyArray>
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #111 <Field Object _typeHandler>
	//   17   31:aload_0         
	//   18   32:getfield        #115 <Field boolean _asStatic>
	//   19   35:invokespecial   #50  <Method void ArrayType(JavaType, TypeBindings, Object, Object, Object, boolean)>
	//   20   38:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JavaType _componentType;
	protected final Object _emptyArray;
}
