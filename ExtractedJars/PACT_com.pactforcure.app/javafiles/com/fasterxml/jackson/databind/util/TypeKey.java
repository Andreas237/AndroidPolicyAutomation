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
	//*  12   20:ifeq            34
			i = typedHash(javatype);
	//   13   23:aload_1         
	//   14   24:invokestatic    #29  <Method int typedHash(JavaType)>
	//   15   27:istore_3        
		else
	//*  16   28:aload_0         
	//*  17   29:iload_3         
	//*  18   30:putfield        #31  <Field int _hashCode>
	//*  19   33:return          
			i = untypedHash(javatype);
	//   20   34:aload_1         
	//   21   35:invokestatic    #34  <Method int untypedHash(JavaType)>
	//   22   38:istore_3        
		_hashCode = i;
	//*  23   39:goto            28
	}

	public TypeKey(TypeKey typekey)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		_hashCode = typekey._hashCode;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #31  <Field int _hashCode>
	//    5    9:putfield        #31  <Field int _hashCode>
		_class = typekey._class;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #23  <Field Class _class>
	//    9   17:putfield        #23  <Field Class _class>
		_type = typekey._type;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #21  <Field JavaType _type>
	//   13   25:putfield        #21  <Field JavaType _type>
		_isTyped = typekey._isTyped;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #25  <Field boolean _isTyped>
	//   17   33:putfield        #25  <Field boolean _isTyped>
	//   18   36:return          
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
	//*  12   20:ifeq            34
			i = typedHash(class1);
	//   13   23:aload_1         
	//   14   24:invokestatic    #39  <Method int typedHash(Class)>
	//   15   27:istore_3        
		else
	//*  16   28:aload_0         
	//*  17   29:iload_3         
	//*  18   30:putfield        #31  <Field int _hashCode>
	//*  19   33:return          
			i = untypedHash(class1);
	//   20   34:aload_1         
	//   21   35:invokestatic    #41  <Method int untypedHash(Class)>
	//   22   38:istore_3        
		_hashCode = i;
	//*  23   39:goto            28
	}

	public static final int typedHash(JavaType javatype)
	{
		return javatype.hashCode() - 2;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method int JavaType.hashCode()>
	//    2    4:iconst_2        
	//    3    5:isub            
	//    4    6:ireturn         
	}

	public static final int typedHash(Class class1)
	{
		return class1.getName().hashCode() + 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method String Class.getName()>
	//    2    4:invokevirtual   #58  <Method int String.hashCode()>
	//    3    7:iconst_1        
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static final int untypedHash(JavaType javatype)
	{
		return javatype.hashCode() - 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method int JavaType.hashCode()>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:ireturn         
	}

	public static final int untypedHash(Class class1)
	{
		return class1.getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method String Class.getName()>
	//    2    4:invokevirtual   #58  <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public final boolean equals(Object obj)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(obj != null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
	//*   4    6:iconst_0        
	//*   5    7:ireturn         
		{
			if(obj == this)
	//*   6    8:aload_1         
	//*   7    9:aload_0         
	//*   8   10:if_acmpne       15
				return true;
	//    9   13:iconst_1        
	//   10   14:ireturn         
			if(obj.getClass() == ((Object)this).getClass())
	//*  11   15:aload_1         
	//*  12   16:invokevirtual   #65  <Method Class Object.getClass()>
	//*  13   19:aload_0         
	//*  14   20:invokevirtual   #65  <Method Class Object.getClass()>
	//*  15   23:if_acmpne       6
			{
				obj = ((Object) ((TypeKey)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class TypeKey>
	//   18   30:astore_1        
				if(((TypeKey) (obj))._isTyped == _isTyped)
	//*  19   31:aload_1         
	//*  20   32:getfield        #25  <Field boolean _isTyped>
	//*  21   35:aload_0         
	//*  22   36:getfield        #25  <Field boolean _isTyped>
	//*  23   39:icmpne          6
					if(_class != null)
	//*  24   42:aload_0         
	//*  25   43:getfield        #23  <Field Class _class>
	//*  26   46:ifnull          67
					{
						if(((TypeKey) (obj))._class != _class)
	//*  27   49:aload_1         
	//*  28   50:getfield        #23  <Field Class _class>
	//*  29   53:aload_0         
	//*  30   54:getfield        #23  <Field Class _class>
	//*  31   57:if_acmpne       62
	//*  32   60:iload_2         
	//*  33   61:ireturn         
							flag = false;
	//   34   62:iconst_0        
	//   35   63:istore_2        
						return flag;
					} else
	//*  36   64:goto            60
					{
						return _type.equals(((Object) (((TypeKey) (obj))._type)));
	//   37   67:aload_0         
	//   38   68:getfield        #21  <Field JavaType _type>
	//   39   71:aload_1         
	//   40   72:getfield        #21  <Field JavaType _type>
	//   41   75:invokevirtual   #67  <Method boolean JavaType.equals(Object)>
	//   42   78:ireturn         
					}
			}
		}
		return false;
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
	//    1    1:getfield        #31  <Field int _hashCode>
	//    2    4:ireturn         
	}

	public boolean isTyped()
	{
		return _isTyped;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean _isTyped>
	//    2    4:ireturn         
	}

	public final void resetTyped(JavaType javatype)
	{
		_type = javatype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field JavaType _type>
		_class = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #23  <Field Class _class>
		_isTyped = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #25  <Field boolean _isTyped>
		_hashCode = typedHash(javatype);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokestatic    #29  <Method int typedHash(JavaType)>
	//   12   20:putfield        #31  <Field int _hashCode>
	//   13   23:return          
	}

	public final void resetTyped(Class class1)
	{
		_type = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #21  <Field JavaType _type>
		_class = class1;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #23  <Field Class _class>
		_isTyped = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #25  <Field boolean _isTyped>
		_hashCode = typedHash(class1);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokestatic    #39  <Method int typedHash(Class)>
	//   12   20:putfield        #31  <Field int _hashCode>
	//   13   23:return          
	}

	public final void resetUntyped(JavaType javatype)
	{
		_type = javatype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field JavaType _type>
		_class = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #23  <Field Class _class>
		_isTyped = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #25  <Field boolean _isTyped>
		_hashCode = untypedHash(javatype);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokestatic    #34  <Method int untypedHash(JavaType)>
	//   12   20:putfield        #31  <Field int _hashCode>
	//   13   23:return          
	}

	public final void resetUntyped(Class class1)
	{
		_type = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #21  <Field JavaType _type>
		_class = class1;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #23  <Field Class _class>
		_isTyped = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #25  <Field boolean _isTyped>
		_hashCode = untypedHash(class1);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokestatic    #41  <Method int untypedHash(Class)>
	//   12   20:putfield        #31  <Field int _hashCode>
	//   13   23:return          
	}

	public final String toString()
	{
		if(_class != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Class _class>
	//*   2    4:ifnull          50
			return (new StringBuilder()).append("{class: ").append(_class.getName()).append(", typed? ").append(_isTyped).append("}").toString();
	//    3    7:new             #81  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #82  <Method void StringBuilder()>
	//    6   14:ldc1            #84  <String "{class: ">
	//    7   16:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:getfield        #23  <Field Class _class>
	//   10   23:invokevirtual   #55  <Method String Class.getName()>
	//   11   26:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   12   29:ldc1            #90  <String ", typed? ">
	//   13   31:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   14   34:aload_0         
	//   15   35:getfield        #25  <Field boolean _isTyped>
	//   16   38:invokevirtual   #93  <Method StringBuilder StringBuilder.append(boolean)>
	//   17   41:ldc1            #95  <String "}">
	//   18   43:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   19   46:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   20   49:areturn         
		else
			return (new StringBuilder()).append("{type: ").append(((Object) (_type))).append(", typed? ").append(_isTyped).append("}").toString();
	//   21   50:new             #81  <Class StringBuilder>
	//   22   53:dup             
	//   23   54:invokespecial   #82  <Method void StringBuilder()>
	//   24   57:ldc1            #99  <String "{type: ">
	//   25   59:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   26   62:aload_0         
	//   27   63:getfield        #21  <Field JavaType _type>
	//   28   66:invokevirtual   #102 <Method StringBuilder StringBuilder.append(Object)>
	//   29   69:ldc1            #90  <String ", typed? ">
	//   30   71:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   31   74:aload_0         
	//   32   75:getfield        #25  <Field boolean _isTyped>
	//   33   78:invokevirtual   #93  <Method StringBuilder StringBuilder.append(boolean)>
	//   34   81:ldc1            #95  <String "}">
	//   35   83:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   36   86:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   37   89:areturn         
	}

	protected Class _class;
	protected int _hashCode;
	protected boolean _isTyped;
	protected JavaType _type;
}
