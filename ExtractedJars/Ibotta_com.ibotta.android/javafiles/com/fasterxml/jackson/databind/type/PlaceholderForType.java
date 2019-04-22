// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeBase, TypeBindings, TypeFactory

public class PlaceholderForType extends TypeBase
{

	public PlaceholderForType(int i)
	{
		super(java/lang/Object, TypeBindings.emptyBindings(), TypeFactory.unknownType(), ((JavaType []) (null)), 1, ((Object) (null)), ((Object) (null)), false);
	//    0    0:aload_0         
	//    1    1:ldc1            #16  <Class Object>
	//    2    3:invokestatic    #22  <Method TypeBindings TypeBindings.emptyBindings()>
	//    3    6:invokestatic    #28  <Method JavaType TypeFactory.unknownType()>
	//    4    9:aconst_null     
	//    5   10:iconst_1        
	//    6   11:aconst_null     
	//    7   12:aconst_null     
	//    8   13:iconst_0        
	//    9   14:invokespecial   #31  <Method void TypeBase(Class, TypeBindings, JavaType, JavaType[], int, Object, Object, boolean)>
		_ordinal = i;
	//   10   17:aload_0         
	//   11   18:iload_1         
	//   12   19:putfield        #33  <Field int _ordinal>
	//   13   22:return          
	}

	private Object _unsupported()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Operation should not be attempted on ");
	//    4    8:aload_1         
	//    5    9:ldc1            #43  <String "Operation should not be attempted on ">
	//    6   11:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object)this).getClass().getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #51  <Method Class Object.getClass()>
	//   11   20:invokevirtual   #57  <Method String Class.getName()>
	//   12   23:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		throw new UnsupportedOperationException(stringbuilder.toString());
	//   14   27:new             #59  <Class UnsupportedOperationException>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   18   35:invokespecial   #65  <Method void UnsupportedOperationException(String)>
	//   19   38:athrow          
	}

	public JavaType actualType()
	{
		return _actualType;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field JavaType _actualType>
	//    2    4:areturn         
	}

	public void actualType(JavaType javatype)
	{
		_actualType = javatype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field JavaType _actualType>
	//    3    5:return          
	}

	protected String buildCanonicalName()
	{
		return toString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method String toString()>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		return obj == this;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpne       7
	//    3    5:iconst_1        
	//    4    6:ireturn         
	//    5    7:iconst_0        
	//    6    8:ireturn         
	}

	public StringBuilder getErasedSignature(StringBuilder stringbuilder)
	{
		stringbuilder.append('$');
	//    0    0:aload_1         
	//    1    1:bipush          36
	//    2    3:invokevirtual   #80  <Method StringBuilder StringBuilder.append(char)>
	//    3    6:pop             
		stringbuilder.append(_ordinal + 1);
	//    4    7:aload_1         
	//    5    8:aload_0         
	//    6    9:getfield        #33  <Field int _ordinal>
	//    7   12:iconst_1        
	//    8   13:iadd            
	//    9   14:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
	//   10   17:pop             
		return stringbuilder;
	//   11   18:aload_1         
	//   12   19:areturn         
	}

	public StringBuilder getGenericSignature(StringBuilder stringbuilder)
	{
		return getErasedSignature(stringbuilder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #86  <Method StringBuilder getErasedSignature(StringBuilder)>
	//    3    5:areturn         
	}

	public boolean isContainerType()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public JavaType refine(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		return (JavaType)_unsupported();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method Object _unsupported()>
	//    2    4:checkcast       #94  <Class JavaType>
	//    3    7:areturn         
	}

	public String toString()
	{
		return getErasedSignature(new StringBuilder()).toString();
	//    0    0:aload_0         
	//    1    1:new             #38  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #41  <Method void StringBuilder()>
	//    4    8:invokevirtual   #86  <Method StringBuilder getErasedSignature(StringBuilder)>
	//    5   11:invokevirtual   #62  <Method String StringBuilder.toString()>
	//    6   14:areturn         
	}

	public JavaType withContentType(JavaType javatype)
	{
		return (JavaType)_unsupported();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method Object _unsupported()>
	//    2    4:checkcast       #94  <Class JavaType>
	//    3    7:areturn         
	}

	public JavaType withContentTypeHandler(Object obj)
	{
		return (JavaType)_unsupported();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method Object _unsupported()>
	//    2    4:checkcast       #94  <Class JavaType>
	//    3    7:areturn         
	}

	public JavaType withContentValueHandler(Object obj)
	{
		return (JavaType)_unsupported();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method Object _unsupported()>
	//    2    4:checkcast       #94  <Class JavaType>
	//    3    7:areturn         
	}

	public JavaType withStaticTyping()
	{
		return (JavaType)_unsupported();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method Object _unsupported()>
	//    2    4:checkcast       #94  <Class JavaType>
	//    3    7:areturn         
	}

	public JavaType withTypeHandler(Object obj)
	{
		return (JavaType)_unsupported();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method Object _unsupported()>
	//    2    4:checkcast       #94  <Class JavaType>
	//    3    7:areturn         
	}

	public JavaType withValueHandler(Object obj)
	{
		return (JavaType)_unsupported();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method Object _unsupported()>
	//    2    4:checkcast       #94  <Class JavaType>
	//    3    7:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected JavaType _actualType;
	protected final int _ordinal;
}
