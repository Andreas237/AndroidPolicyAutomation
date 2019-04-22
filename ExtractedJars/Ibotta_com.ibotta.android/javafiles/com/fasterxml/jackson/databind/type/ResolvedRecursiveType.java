// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeBase, TypeBindings

public class ResolvedRecursiveType extends TypeBase
{

	public ResolvedRecursiveType(Class class1, TypeBindings typebindings)
	{
		super(class1, typebindings, ((JavaType) (null)), ((JavaType []) (null)), 0, ((Object) (null)), ((Object) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:iconst_0        
	//    6    6:aconst_null     
	//    7    7:aconst_null     
	//    8    8:iconst_0        
	//    9    9:invokespecial   #15  <Method void TypeBase(Class, TypeBindings, JavaType, JavaType[], int, Object, Object, boolean)>
	//   10   12:return          
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
		return obj.getClass() != ((Object)this).getClass() ? false : false;
	//    9   13:aload_1         
	//   10   14:invokevirtual   #26  <Method Class Object.getClass()>
	//   11   17:aload_0         
	//   12   18:invokevirtual   #26  <Method Class Object.getClass()>
	//   13   21:if_acmpne       26
	//   14   24:iconst_0        
	//   15   25:ireturn         
	//   16   26:iconst_0        
	//   17   27:ireturn         
	}

	public StringBuilder getGenericSignature(StringBuilder stringbuilder)
	{
		return _referencedType.getGenericSignature(stringbuilder);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field JavaType _referencedType>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method StringBuilder JavaType.getGenericSignature(StringBuilder)>
	//    4    8:areturn         
	}

	public JavaType getSelfReferencedType()
	{
		return _referencedType;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field JavaType _referencedType>
	//    2    4:areturn         
	}

	public JavaType getSuperClass()
	{
		JavaType javatype = _referencedType;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field JavaType _referencedType>
	//    2    4:astore_1        
		if(javatype != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return javatype.getSuperClass();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #39  <Method JavaType JavaType.getSuperClass()>
	//    7   13:areturn         
		else
			return super.getSuperClass();
	//    8   14:aload_0         
	//    9   15:invokespecial   #40  <Method JavaType TypeBase.getSuperClass()>
	//   10   18:areturn         
	}

	public boolean isContainerType()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public JavaType refine(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void setReference(JavaType javatype)
	{
		if(_referencedType == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field JavaType _referencedType>
	//*   2    4:ifnonnull       13
		{
			_referencedType = javatype;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #30  <Field JavaType _referencedType>
			return;
	//    6   12:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   13:new             #49  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #52  <Method void StringBuilder()>
	//   10   20:astore_2        
			stringbuilder.append("Trying to re-set self reference; old value = ");
	//   11   21:aload_2         
	//   12   22:ldc1            #54  <String "Trying to re-set self reference; old value = ">
	//   13   24:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			stringbuilder.append(((Object) (_referencedType)));
	//   15   28:aload_2         
	//   16   29:aload_0         
	//   17   30:getfield        #30  <Field JavaType _referencedType>
	//   18   33:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
	//   19   36:pop             
			stringbuilder.append(", new = ");
	//   20   37:aload_2         
	//   21   38:ldc1            #63  <String ", new = ">
	//   22   40:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			stringbuilder.append(((Object) (javatype)));
	//   24   44:aload_2         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
	//   27   49:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   28   50:new             #65  <Class IllegalStateException>
	//   29   53:dup             
	//   30   54:aload_2         
	//   31   55:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   32   58:invokespecial   #72  <Method void IllegalStateException(String)>
	//   33   61:athrow          
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(40);
	//    0    0:new             #49  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          40
	//    3    6:invokespecial   #75  <Method void StringBuilder(int)>
	//    4    9:astore_1        
		stringbuilder.append("[recursive type; ");
	//    5   10:aload_1         
	//    6   11:ldc1            #77  <String "[recursive type; ">
	//    7   13:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		JavaType javatype = _referencedType;
	//    9   17:aload_0         
	//   10   18:getfield        #30  <Field JavaType _referencedType>
	//   11   21:astore_2        
		if(javatype == null)
	//*  12   22:aload_2         
	//*  13   23:ifnonnull       36
			stringbuilder.append("UNRESOLVED");
	//   14   26:aload_1         
	//   15   27:ldc1            #79  <String "UNRESOLVED">
	//   16   29:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		else
	//*  18   33:goto            48
			stringbuilder.append(javatype.getRawClass().getName());
	//   19   36:aload_1         
	//   20   37:aload_2         
	//   21   38:invokevirtual   #82  <Method Class JavaType.getRawClass()>
	//   22   41:invokevirtual   #87  <Method String Class.getName()>
	//   23   44:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
		return stringbuilder.toString();
	//   25   48:aload_1         
	//   26   49:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   27   52:areturn         
	}

	public JavaType withContentType(JavaType javatype)
	{
		return ((JavaType) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public JavaType withContentTypeHandler(Object obj)
	{
		return ((JavaType) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public JavaType withContentValueHandler(Object obj)
	{
		return ((JavaType) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public JavaType withStaticTyping()
	{
		return ((JavaType) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public JavaType withTypeHandler(Object obj)
	{
		return ((JavaType) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public JavaType withValueHandler(Object obj)
	{
		return ((JavaType) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected JavaType _referencedType;
}
