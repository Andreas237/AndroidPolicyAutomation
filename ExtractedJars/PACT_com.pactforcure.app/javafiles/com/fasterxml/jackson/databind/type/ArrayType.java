// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.ResolvedType;
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

	private JavaType _reportUnsupported()
	{
		throw new UnsupportedOperationException("Can not narrow or widen array types");
	//    0    0:new             #38  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #40  <String "Can not narrow or widen array types">
	//    3    6:invokespecial   #43  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public static ArrayType construct(JavaType javatype, TypeBindings typebindings)
	{
		return construct(javatype, typebindings, ((Object) (null)), ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokestatic    #48  <Method ArrayType construct(JavaType, TypeBindings, Object, Object)>
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
	//    5    7:invokevirtual   #51  <Method Class JavaType.getRawClass()>
	//    6   10:iconst_0        
	//    7   11:invokestatic    #57  <Method Object Array.newInstance(Class, int)>
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:iconst_0        
	//   11   17:invokespecial   #59  <Method void ArrayType(JavaType, TypeBindings, Object, Object, Object, boolean)>
	//   12   20:areturn         
	}

	protected JavaType _narrow(Class class1)
	{
		return _reportUnsupported();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method JavaType _reportUnsupported()>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag;
		if(obj == this)
	//*   2    2:aload_1         
	//*   3    3:aload_0         
	//*   4    4:if_acmpne       11
		{
			flag = true;
	//    5    7:iconst_1        
	//    6    8:istore_2        
		} else
	//*   7    9:iload_2         
	//*   8   10:ireturn         
		{
			flag = flag1;
	//    9   11:iload_3         
	//   10   12:istore_2        
			if(obj != null)
	//*  11   13:aload_1         
	//*  12   14:ifnull          9
			{
				flag = flag1;
	//   13   17:iload_3         
	//   14   18:istore_2        
				if(obj.getClass() == ((Object)this).getClass())
	//*  15   19:aload_1         
	//*  16   20:invokevirtual   #20  <Method Class Object.getClass()>
	//*  17   23:aload_0         
	//*  18   24:invokevirtual   #20  <Method Class Object.getClass()>
	//*  19   27:if_acmpne       9
				{
					obj = ((Object) ((ArrayType)obj));
	//   20   30:aload_1         
	//   21   31:checkcast       #2   <Class ArrayType>
	//   22   34:astore_1        
					return _componentType.equals(((Object) (((ArrayType) (obj))._componentType)));
	//   23   35:aload_0         
	//   24   36:getfield        #31  <Field JavaType _componentType>
	//   25   39:aload_1         
	//   26   40:getfield        #31  <Field JavaType _componentType>
	//   27   43:invokevirtual   #71  <Method boolean JavaType.equals(Object)>
	//   28   46:ireturn         
				}
			}
		}
		return flag;
	}

	public volatile ResolvedType getContentType()
	{
		return ((ResolvedType) (getContentType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method JavaType getContentType()>
	//    2    4:areturn         
	}

	public JavaType getContentType()
	{
		return _componentType;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field JavaType _componentType>
	//    2    4:areturn         
	}

	public Object getContentTypeHandler()
	{
		return _componentType.getTypeHandler();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field JavaType _componentType>
	//    2    4:invokevirtual   #80  <Method Object JavaType.getTypeHandler()>
	//    3    7:areturn         
	}

	public Object getContentValueHandler()
	{
		return _componentType.getValueHandler();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field JavaType _componentType>
	//    2    4:invokevirtual   #84  <Method Object JavaType.getValueHandler()>
	//    3    7:areturn         
	}

	public StringBuilder getErasedSignature(StringBuilder stringbuilder)
	{
		stringbuilder.append('[');
	//    0    0:aload_1         
	//    1    1:bipush          91
	//    2    3:invokevirtual   #92  <Method StringBuilder StringBuilder.append(char)>
	//    3    6:pop             
		return _componentType.getErasedSignature(stringbuilder);
	//    4    7:aload_0         
	//    5    8:getfield        #31  <Field JavaType _componentType>
	//    6   11:aload_1         
	//    7   12:invokevirtual   #94  <Method StringBuilder JavaType.getErasedSignature(StringBuilder)>
	//    8   15:areturn         
	}

	public StringBuilder getGenericSignature(StringBuilder stringbuilder)
	{
		stringbuilder.append('[');
	//    0    0:aload_1         
	//    1    1:bipush          91
	//    2    3:invokevirtual   #92  <Method StringBuilder StringBuilder.append(char)>
	//    3    6:pop             
		return _componentType.getGenericSignature(stringbuilder);
	//    4    7:aload_0         
	//    5    8:getfield        #31  <Field JavaType _componentType>
	//    6   11:aload_1         
	//    7   12:invokevirtual   #97  <Method StringBuilder JavaType.getGenericSignature(StringBuilder)>
	//    8   15:areturn         
	}

	public boolean hasGenericTypes()
	{
		return _componentType.hasGenericTypes();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field JavaType _componentType>
	//    2    4:invokevirtual   #101 <Method boolean JavaType.hasGenericTypes()>
	//    3    7:ireturn         
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
		return (new StringBuilder()).append("[array type, component type: ").append(((Object) (_componentType))).append("]").toString();
	//    0    0:new             #88  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #113 <Method void StringBuilder()>
	//    3    7:ldc1            #115 <String "[array type, component type: ">
	//    4    9:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #31  <Field JavaType _componentType>
	//    7   16:invokevirtual   #121 <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #123 <String "]">
	//    9   21:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	public JavaType withContentType(JavaType javatype)
	{
		Object obj = Array.newInstance(javatype.getRawClass(), 0);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #51  <Method Class JavaType.getRawClass()>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #57  <Method Object Array.newInstance(Class, int)>
	//    4    8:astore_2        
		return ((JavaType) (new ArrayType(javatype, _bindings, obj, _valueHandler, _typeHandler, _asStatic)));
	//    5    9:new             #2   <Class ArrayType>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #131 <Field TypeBindings _bindings>
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:getfield        #134 <Field Object _valueHandler>
	//   13   23:aload_0         
	//   14   24:getfield        #137 <Field Object _typeHandler>
	//   15   27:aload_0         
	//   16   28:getfield        #141 <Field boolean _asStatic>
	//   17   31:invokespecial   #59  <Method void ArrayType(JavaType, TypeBindings, Object, Object, Object, boolean)>
	//   18   34:areturn         
	}

	public volatile JavaType withContentTypeHandler(Object obj)
	{
		return ((JavaType) (withContentTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #146 <Method ArrayType withContentTypeHandler(Object)>
	//    3    5:areturn         
	}

	public ArrayType withContentTypeHandler(Object obj)
	{
		if(obj == _componentType.getTypeHandler())
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #31  <Field JavaType _componentType>
	//*   3    5:invokevirtual   #80  <Method Object JavaType.getTypeHandler()>
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
	//   12   22:invokevirtual   #149 <Method JavaType JavaType.withTypeHandler(Object)>
	//   13   25:aload_0         
	//   14   26:getfield        #131 <Field TypeBindings _bindings>
	//   15   29:aload_0         
	//   16   30:getfield        #33  <Field Object _emptyArray>
	//   17   33:aload_0         
	//   18   34:getfield        #134 <Field Object _valueHandler>
	//   19   37:aload_0         
	//   20   38:getfield        #137 <Field Object _typeHandler>
	//   21   41:aload_0         
	//   22   42:getfield        #141 <Field boolean _asStatic>
	//   23   45:invokespecial   #59  <Method void ArrayType(JavaType, TypeBindings, Object, Object, Object, boolean)>
	//   24   48:areturn         
	}

	public volatile JavaType withContentValueHandler(Object obj)
	{
		return ((JavaType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #152 <Method ArrayType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public ArrayType withContentValueHandler(Object obj)
	{
		if(obj == _componentType.getValueHandler())
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #31  <Field JavaType _componentType>
	//*   3    5:invokevirtual   #84  <Method Object JavaType.getValueHandler()>
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
	//   12   22:invokevirtual   #155 <Method JavaType JavaType.withValueHandler(Object)>
	//   13   25:aload_0         
	//   14   26:getfield        #131 <Field TypeBindings _bindings>
	//   15   29:aload_0         
	//   16   30:getfield        #33  <Field Object _emptyArray>
	//   17   33:aload_0         
	//   18   34:getfield        #134 <Field Object _valueHandler>
	//   19   37:aload_0         
	//   20   38:getfield        #137 <Field Object _typeHandler>
	//   21   41:aload_0         
	//   22   42:getfield        #141 <Field boolean _asStatic>
	//   23   45:invokespecial   #59  <Method void ArrayType(JavaType, TypeBindings, Object, Object, Object, boolean)>
	//   24   48:areturn         
	}

	public volatile JavaType withStaticTyping()
	{
		return ((JavaType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method ArrayType withStaticTyping()>
	//    2    4:areturn         
	}

	public ArrayType withStaticTyping()
	{
		if(_asStatic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field boolean _asStatic>
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
	//    9   17:invokevirtual   #161 <Method JavaType JavaType.withStaticTyping()>
	//   10   20:aload_0         
	//   11   21:getfield        #131 <Field TypeBindings _bindings>
	//   12   24:aload_0         
	//   13   25:getfield        #33  <Field Object _emptyArray>
	//   14   28:aload_0         
	//   15   29:getfield        #134 <Field Object _valueHandler>
	//   16   32:aload_0         
	//   17   33:getfield        #137 <Field Object _typeHandler>
	//   18   36:iconst_1        
	//   19   37:invokespecial   #59  <Method void ArrayType(JavaType, TypeBindings, Object, Object, Object, boolean)>
	//   20   40:areturn         
	}

	public volatile JavaType withTypeHandler(Object obj)
	{
		return ((JavaType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #163 <Method ArrayType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public ArrayType withTypeHandler(Object obj)
	{
		if(obj == _typeHandler)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #137 <Field Object _typeHandler>
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
	//   11   19:getfield        #131 <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #33  <Field Object _emptyArray>
	//   14   26:aload_0         
	//   15   27:getfield        #134 <Field Object _valueHandler>
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #141 <Field boolean _asStatic>
	//   19   35:invokespecial   #59  <Method void ArrayType(JavaType, TypeBindings, Object, Object, Object, boolean)>
	//   20   38:areturn         
	}

	public volatile JavaType withValueHandler(Object obj)
	{
		return ((JavaType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #165 <Method ArrayType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public ArrayType withValueHandler(Object obj)
	{
		if(obj == _valueHandler)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #134 <Field Object _valueHandler>
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
	//   11   19:getfield        #131 <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #33  <Field Object _emptyArray>
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #137 <Field Object _typeHandler>
	//   17   31:aload_0         
	//   18   32:getfield        #141 <Field boolean _asStatic>
	//   19   35:invokespecial   #59  <Method void ArrayType(JavaType, TypeBindings, Object, Object, Object, boolean)>
	//   20   38:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JavaType _componentType;
	protected final Object _emptyArray;
}
