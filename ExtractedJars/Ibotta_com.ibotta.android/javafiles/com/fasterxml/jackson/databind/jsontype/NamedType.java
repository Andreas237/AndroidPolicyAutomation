// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype;

import java.io.Serializable;

public final class NamedType
	implements Serializable
{

	public NamedType(Class class1)
	{
		this(class1, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #22  <Method void NamedType(Class, String)>
	//    4    6:return          
	}

	public NamedType(Class class1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		_class = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field Class _class>
		_hashCode = class1.getName().hashCode();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #36  <Method String Class.getName()>
	//    8   14:invokevirtual   #42  <Method int String.hashCode()>
	//    9   17:putfield        #44  <Field int _hashCode>
		setName(s);
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #48  <Method void setName(String)>
	//   13   25:return          
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
	//*  10   14:invokevirtual   #55  <Method Class Object.getClass()>
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #55  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		return _class == ((NamedType)obj)._class;
	//   16   26:aload_0         
	//   17   27:getfield        #30  <Field Class _class>
	//   18   30:aload_1         
	//   19   31:checkcast       #2   <Class NamedType>
	//   20   34:getfield        #30  <Field Class _class>
	//   21   37:if_acmpne       42
	//   22   40:iconst_1        
	//   23   41:ireturn         
	//   24   42:iconst_0        
	//   25   43:ireturn         
	}

	public String getName()
	{
		return _name;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String _name>
	//    2    4:areturn         
	}

	public Class getType()
	{
		return _class;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Class _class>
	//    2    4:areturn         
	}

	public boolean hasName()
	{
		return _name != null;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String _name>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int hashCode()
	{
		return _hashCode;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int _hashCode>
	//    2    4:ireturn         
	}

	public void setName(String s)
	{
		String s1;
label0:
		{
			if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			{
				s1 = s;
	//    2    4:aload_1         
	//    3    5:astore_2        
				if(s.length() != 0)
					break label0;
	//    4    6:aload_1         
	//    5    7:invokevirtual   #64  <Method int String.length()>
	//    6   10:ifne            15
			}
			s1 = null;
	//    7   13:aconst_null     
	//    8   14:astore_2        
		}
		_name = s1;
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:putfield        #57  <Field String _name>
	//   12   20:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #67  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("[NamedType, class ");
	//    4    8:aload_2         
	//    5    9:ldc1            #70  <String "[NamedType, class ">
	//    6   11:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(_class.getName());
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:getfield        #30  <Field Class _class>
	//   11   20:invokevirtual   #36  <Method String Class.getName()>
	//   12   23:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(", name: ");
	//   14   27:aload_2         
	//   15   28:ldc1            #76  <String ", name: ">
	//   16   30:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		Object obj;
		if(_name == null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #57  <Field String _name>
	//*  20   38:ifnonnull       47
		{
			obj = "null";
	//   21   41:ldc1            #78  <String "null">
	//   22   43:astore_1        
		} else
	//*  23   44:goto            83
		{
			obj = ((Object) (new StringBuilder()));
	//   24   47:new             #67  <Class StringBuilder>
	//   25   50:dup             
	//   26   51:invokespecial   #68  <Method void StringBuilder()>
	//   27   54:astore_1        
			((StringBuilder) (obj)).append("'");
	//   28   55:aload_1         
	//   29   56:ldc1            #80  <String "'">
	//   30   58:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
			((StringBuilder) (obj)).append(_name);
	//   32   62:aload_1         
	//   33   63:aload_0         
	//   34   64:getfield        #57  <Field String _name>
	//   35   67:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   36   70:pop             
			((StringBuilder) (obj)).append("'");
	//   37   71:aload_1         
	//   38   72:ldc1            #80  <String "'">
	//   39   74:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   40   77:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   41   78:aload_1         
	//   42   79:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   43   82:astore_1        
		}
		stringbuilder.append(((String) (obj)));
	//   44   83:aload_2         
	//   45   84:aload_1         
	//   46   85:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   47   88:pop             
		stringbuilder.append("]");
	//   48   89:aload_2         
	//   49   90:ldc1            #84  <String "]">
	//   50   92:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   51   95:pop             
		return stringbuilder.toString();
	//   52   96:aload_2         
	//   53   97:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   54  100:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Class _class;
	protected final int _hashCode;
	protected String _name;
}
