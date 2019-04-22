// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;

public class TypeKey
{

	public TypeKey()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public TypeKey(JavaType javatype, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		_type = javatype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field JavaType _type>
		_class = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #23  <Field Class _class>
		_isTyped = flag;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #25  <Field boolean _isTyped>
		int i;
		if(flag)
	//*  11   19:iload_2         
	//*  12   20:ifeq            31
			i = typedHash(javatype);
	//   13   23:aload_1         
	//   14   24:invokestatic    #29  <Method int typedHash(JavaType)>
	//   15   27:istore_3        
		else
	//*  16   28:goto            36
			i = untypedHash(javatype);
	//   17   31:aload_1         
	//   18   32:invokestatic    #32  <Method int untypedHash(JavaType)>
	//   19   35:istore_3        
		_hashCode = i;
	//   20   36:aload_0         
	//   21   37:iload_3         
	//   22   38:putfield        #34  <Field int _hashCode>
	//   23   41:return          
	}

	public TypeKey(Class class1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		_class = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Class _class>
		_type = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #21  <Field JavaType _type>
		_isTyped = flag;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #25  <Field boolean _isTyped>
		int i;
		if(flag)
	//*  11   19:iload_2         
	//*  12   20:ifeq            31
			i = typedHash(class1);
	//   13   23:aload_1         
	//   14   24:invokestatic    #38  <Method int typedHash(Class)>
	//   15   27:istore_3        
		else
	//*  16   28:goto            36
			i = untypedHash(class1);
	//   17   31:aload_1         
	//   18   32:invokestatic    #40  <Method int untypedHash(Class)>
	//   19   35:istore_3        
		_hashCode = i;
	//   20   36:aload_0         
	//   21   37:iload_3         
	//   22   38:putfield        #34  <Field int _hashCode>
	//   23   41:return          
	}

	public static final int typedHash(JavaType javatype)
	{
		return javatype.hashCode() - 2;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method int JavaType.hashCode()>
	//    2    4:iconst_2        
	//    3    5:isub            
	//    4    6:ireturn         
	}

	public static final int typedHash(Class class1)
	{
		return class1.getName().hashCode() + 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method String Class.getName()>
	//    2    4:invokevirtual   #57  <Method int String.hashCode()>
	//    3    7:iconst_1        
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static final int untypedHash(JavaType javatype)
	{
		return javatype.hashCode() - 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method int JavaType.hashCode()>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:ireturn         
	}

	public static final int untypedHash(Class class1)
	{
		return class1.getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method String Class.getName()>
	//    2    4:invokevirtual   #57  <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public final boolean equals(Object obj)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(obj == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		if(obj == this)
	//*   6    8:aload_1         
	//*   7    9:aload_0         
	//*   8   10:if_acmpne       15
			return true;
	//    9   13:iconst_1        
	//   10   14:ireturn         
		if(obj.getClass() != ((Object)this).getClass())
	//*  11   15:aload_1         
	//*  12   16:invokevirtual   #64  <Method Class Object.getClass()>
	//*  13   19:aload_0         
	//*  14   20:invokevirtual   #64  <Method Class Object.getClass()>
	//*  15   23:if_acmpeq       28
			return false;
	//   16   26:iconst_0        
	//   17   27:ireturn         
		obj = ((Object) ((TypeKey)obj));
	//   18   28:aload_1         
	//   19   29:checkcast       #2   <Class TypeKey>
	//   20   32:astore_1        
		if(((TypeKey) (obj))._isTyped == _isTyped)
	//*  21   33:aload_1         
	//*  22   34:getfield        #25  <Field boolean _isTyped>
	//*  23   37:aload_0         
	//*  24   38:getfield        #25  <Field boolean _isTyped>
	//*  25   41:icmpne          77
		{
			Class class1 = _class;
	//   26   44:aload_0         
	//   27   45:getfield        #23  <Field Class _class>
	//   28   48:astore_3        
			if(class1 != null)
	//*  29   49:aload_3         
	//*  30   50:ifnull          65
			{
				if(((TypeKey) (obj))._class == class1)
	//*  31   53:aload_1         
	//*  32   54:getfield        #23  <Field Class _class>
	//*  33   57:aload_3         
	//*  34   58:if_acmpne       63
					flag = true;
	//   35   61:iconst_1        
	//   36   62:istore_2        
				return flag;
	//   37   63:iload_2         
	//   38   64:ireturn         
			} else
			{
				return _type.equals(((Object) (((TypeKey) (obj))._type)));
	//   39   65:aload_0         
	//   40   66:getfield        #21  <Field JavaType _type>
	//   41   69:aload_1         
	//   42   70:getfield        #21  <Field JavaType _type>
	//   43   73:invokevirtual   #66  <Method boolean JavaType.equals(Object)>
	//   44   76:ireturn         
			}
		} else
		{
			return false;
	//   45   77:iconst_0        
	//   46   78:ireturn         
		}
	}

	public Class getRawType()
	{
		return _class;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Class _class>
	//    2    4:areturn         
	}

	public JavaType getType()
	{
		return _type;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field JavaType _type>
	//    2    4:areturn         
	}

	public final int hashCode()
	{
		return _hashCode;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int _hashCode>
	//    2    4:ireturn         
	}

	public boolean isTyped()
	{
		return _isTyped;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean _isTyped>
	//    2    4:ireturn         
	}

	public final String toString()
	{
		if(_class != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Class _class>
	//*   2    4:ifnull          62
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #75  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #76  <Method void StringBuilder()>
	//    6   14:astore_1        
			stringbuilder.append("{class: ");
	//    7   15:aload_1         
	//    8   16:ldc1            #78  <String "{class: ">
	//    9   18:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			stringbuilder.append(_class.getName());
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:getfield        #23  <Field Class _class>
	//   14   27:invokevirtual   #54  <Method String Class.getName()>
	//   15   30:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			stringbuilder.append(", typed? ");
	//   17   34:aload_1         
	//   18   35:ldc1            #84  <String ", typed? ">
	//   19   37:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
			stringbuilder.append(_isTyped);
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:getfield        #25  <Field boolean _isTyped>
	//   24   46:invokevirtual   #87  <Method StringBuilder StringBuilder.append(boolean)>
	//   25   49:pop             
			stringbuilder.append("}");
	//   26   50:aload_1         
	//   27   51:ldc1            #89  <String "}">
	//   28   53:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
			return stringbuilder.toString();
	//   30   57:aload_1         
	//   31   58:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   32   61:areturn         
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   33   62:new             #75  <Class StringBuilder>
	//   34   65:dup             
	//   35   66:invokespecial   #76  <Method void StringBuilder()>
	//   36   69:astore_1        
			stringbuilder1.append("{type: ");
	//   37   70:aload_1         
	//   38   71:ldc1            #93  <String "{type: ">
	//   39   73:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   40   76:pop             
			stringbuilder1.append(((Object) (_type)));
	//   41   77:aload_1         
	//   42   78:aload_0         
	//   43   79:getfield        #21  <Field JavaType _type>
	//   44   82:invokevirtual   #96  <Method StringBuilder StringBuilder.append(Object)>
	//   45   85:pop             
			stringbuilder1.append(", typed? ");
	//   46   86:aload_1         
	//   47   87:ldc1            #84  <String ", typed? ">
	//   48   89:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   49   92:pop             
			stringbuilder1.append(_isTyped);
	//   50   93:aload_1         
	//   51   94:aload_0         
	//   52   95:getfield        #25  <Field boolean _isTyped>
	//   53   98:invokevirtual   #87  <Method StringBuilder StringBuilder.append(boolean)>
	//   54  101:pop             
			stringbuilder1.append("}");
	//   55  102:aload_1         
	//   56  103:ldc1            #89  <String "}">
	//   57  105:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   58  108:pop             
			return stringbuilder1.toString();
	//   59  109:aload_1         
	//   60  110:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   61  113:areturn         
		}
	}

	protected Class _class;
	protected int _hashCode;
	protected boolean _isTyped;
	protected JavaType _type;
}
