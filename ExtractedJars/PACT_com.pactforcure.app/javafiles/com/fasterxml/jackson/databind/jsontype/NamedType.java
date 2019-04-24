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
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
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
			if(_class != ((NamedType)obj)._class)
	//*  16   26:aload_0         
	//*  17   27:getfield        #30  <Field Class _class>
	//*  18   30:aload_1         
	//*  19   31:checkcast       #2   <Class NamedType>
	//*  20   34:getfield        #30  <Field Class _class>
	//*  21   37:if_acmpeq       5
				return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
		}
		return true;
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
		StringBuilder stringbuilder = (new StringBuilder()).append("[NamedType, class ").append(_class.getName()).append(", name: ");
	//    0    0:new             #67  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void StringBuilder()>
	//    3    7:ldc1            #70  <String "[NamedType, class ">
	//    4    9:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #30  <Field Class _class>
	//    7   16:invokevirtual   #36  <Method String Class.getName()>
	//    8   19:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #76  <String ", name: ">
	//   10   24:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:astore_2        
		String s;
		if(_name == null)
	//*  12   28:aload_0         
	//*  13   29:getfield        #57  <Field String _name>
	//*  14   32:ifnonnull       52
			s = "null";
	//   15   35:ldc1            #78  <String "null">
	//   16   37:astore_1        
		else
	//*  17   38:aload_2         
	//*  18   39:aload_1         
	//*  19   40:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//*  20   43:ldc1            #80  <String "]">
	//*  21   45:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//*  22   48:invokevirtual   #82  <Method String StringBuilder.toString()>
	//*  23   51:areturn         
			s = (new StringBuilder()).append("'").append(_name).append("'").toString();
	//   24   52:new             #67  <Class StringBuilder>
	//   25   55:dup             
	//   26   56:invokespecial   #68  <Method void StringBuilder()>
	//   27   59:ldc1            #84  <String "'">
	//   28   61:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   29   64:aload_0         
	//   30   65:getfield        #57  <Field String _name>
	//   31   68:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   32   71:ldc1            #84  <String "'">
	//   33   73:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   34   76:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   35   79:astore_1        
		return stringbuilder.append(s).append("]").toString();
	//*  36   80:goto            38
	}

	private static final long serialVersionUID = 1L;
	protected final Class _class;
	protected final int _hashCode;
	protected String _name;
}
