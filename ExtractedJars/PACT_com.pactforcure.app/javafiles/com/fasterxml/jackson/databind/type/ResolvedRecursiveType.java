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

	protected JavaType _narrow(Class class1)
	{
		return ((JavaType) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
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
	//*  16   20:invokevirtual   #31  <Method Class Object.getClass()>
	//*  17   23:aload_0         
	//*  18   24:invokevirtual   #31  <Method Class Object.getClass()>
	//*  19   27:if_acmpne       9
					return ((ResolvedRecursiveType)obj).getSelfReferencedType().equals(((Object) (getSelfReferencedType())));
	//   20   30:aload_1         
	//   21   31:checkcast       #2   <Class ResolvedRecursiveType>
	//   22   34:invokevirtual   #35  <Method JavaType getSelfReferencedType()>
	//   23   37:aload_0         
	//   24   38:invokevirtual   #35  <Method JavaType getSelfReferencedType()>
	//   25   41:invokevirtual   #39  <Method boolean JavaType.equals(Object)>
	//   26   44:ireturn         
			}
		}
		return flag;
	}

	public StringBuilder getErasedSignature(StringBuilder stringbuilder)
	{
		return _referencedType.getErasedSignature(stringbuilder);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field JavaType _referencedType>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #45  <Method StringBuilder JavaType.getErasedSignature(StringBuilder)>
	//    4    8:areturn         
	}

	public StringBuilder getGenericSignature(StringBuilder stringbuilder)
	{
		return _referencedType.getGenericSignature(stringbuilder);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field JavaType _referencedType>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #48  <Method StringBuilder JavaType.getGenericSignature(StringBuilder)>
	//    4    8:areturn         
	}

	public JavaType getSelfReferencedType()
	{
		return _referencedType;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field JavaType _referencedType>
	//    2    4:areturn         
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
		if(_referencedType != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field JavaType _referencedType>
	//*   2    4:ifnull          46
		{
			throw new IllegalStateException((new StringBuilder()).append("Trying to re-set self reference; old value = ").append(((Object) (_referencedType))).append(", new = ").append(((Object) (javatype))).toString());
	//    3    7:new             #57  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #59  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #62  <Method void StringBuilder()>
	//    8   18:ldc1            #64  <String "Trying to re-set self reference; old value = ">
	//    9   20:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_0         
	//   11   24:getfield        #43  <Field JavaType _referencedType>
	//   12   27:invokevirtual   #71  <Method StringBuilder StringBuilder.append(Object)>
	//   13   30:ldc1            #73  <String ", new = ">
	//   14   32:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #71  <Method StringBuilder StringBuilder.append(Object)>
	//   17   39:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   18   42:invokespecial   #80  <Method void IllegalStateException(String)>
	//   19   45:athrow          
		} else
		{
			_referencedType = javatype;
	//   20   46:aload_0         
	//   21   47:aload_1         
	//   22   48:putfield        #43  <Field JavaType _referencedType>
			return;
	//   23   51:return          
		}
	}

	public String toString()
	{
		return (new StringBuilder(40)).append("[resolved recursive type -> ").append(((Object) (_referencedType))).append(']').toString();
	//    0    0:new             #59  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          40
	//    3    6:invokespecial   #83  <Method void StringBuilder(int)>
	//    4    9:ldc1            #85  <String "[resolved recursive type -> ">
	//    5   11:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_0         
	//    7   15:getfield        #43  <Field JavaType _referencedType>
	//    8   18:invokevirtual   #71  <Method StringBuilder StringBuilder.append(Object)>
	//    9   21:bipush          93
	//   10   23:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   11   26:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   12   29:areturn         
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
