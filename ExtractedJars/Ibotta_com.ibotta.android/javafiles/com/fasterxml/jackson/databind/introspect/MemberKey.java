// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class MemberKey
{

	public MemberKey(String s, Class aclass[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		_name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field String _name>
		s = ((String) (aclass));
	//    5    9:aload_2         
	//    6   10:astore_1        
		if(aclass == null)
	//*   7   11:aload_2         
	//*   8   12:ifnonnull       19
			s = ((String) (NO_CLASSES));
	//    9   15:getstatic       #16  <Field Class[] NO_CLASSES>
	//   10   18:astore_1        
		_argTypes = ((Class []) (s));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #25  <Field Class[] _argTypes>
	//   14   24:return          
	}

	public MemberKey(Constructor constructor)
	{
		this("", constructor.getParameterTypes());
	//    0    0:aload_0         
	//    1    1:ldc1            #30  <String "">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #36  <Method Class[] Constructor.getParameterTypes()>
	//    4    7:invokespecial   #38  <Method void MemberKey(String, Class[])>
	//    5   10:return          
	}

	public MemberKey(Method method)
	{
		this(method.getName(), method.getParameterTypes());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #46  <Method String Method.getName()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #47  <Method Class[] Method.getParameterTypes()>
	//    5    9:invokespecial   #38  <Method void MemberKey(String, Class[])>
	//    6   12:return          
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
	//*  10   14:invokevirtual   #53  <Method Class Object.getClass()>
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #53  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((MemberKey)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class MemberKey>
	//   18   30:astore_1        
		if(!_name.equals(((Object) (((MemberKey) (obj))._name))))
	//*  19   31:aload_0         
	//*  20   32:getfield        #23  <Field String _name>
	//*  21   35:aload_1         
	//*  22   36:getfield        #23  <Field String _name>
	//*  23   39:invokevirtual   #57  <Method boolean String.equals(Object)>
	//*  24   42:ifne            47
			return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		obj = ((Object) (((MemberKey) (obj))._argTypes));
	//   27   47:aload_1         
	//   28   48:getfield        #25  <Field Class[] _argTypes>
	//   29   51:astore_1        
		int j = _argTypes.length;
	//   30   52:aload_0         
	//   31   53:getfield        #25  <Field Class[] _argTypes>
	//   32   56:arraylength     
	//   33   57:istore_3        
		if(obj.length != j)
	//*  34   58:aload_1         
	//*  35   59:arraylength     
	//*  36   60:iload_3         
	//*  37   61:icmpeq          66
			return false;
	//   38   64:iconst_0        
	//   39   65:ireturn         
		for(int i = 0; i < j;)
	//*  40   66:iconst_0        
	//*  41   67:istore_2        
	//*  42   68:iload_2         
	//*  43   69:iload_3         
	//*  44   70:icmpge          94
			if(obj[i] == _argTypes[i])
	//*  45   73:aload_1         
	//*  46   74:iload_2         
	//*  47   75:aaload          
	//*  48   76:aload_0         
	//*  49   77:getfield        #25  <Field Class[] _argTypes>
	//*  50   80:iload_2         
	//*  51   81:aaload          
	//*  52   82:if_acmpne       92
				i++;
	//   53   85:iload_2         
	//   54   86:iconst_1        
	//   55   87:iadd            
	//   56   88:istore_2        
			else
	//*  57   89:goto            68
				return false;
	//   58   92:iconst_0        
	//   59   93:ireturn         

		return true;
	//   60   94:iconst_1        
	//   61   95:ireturn         
	}

	public int hashCode()
	{
		return _name.hashCode() + _argTypes.length;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String _name>
	//    2    4:invokevirtual   #61  <Method int String.hashCode()>
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field Class[] _argTypes>
	//    5   11:arraylength     
	//    6   12:iadd            
	//    7   13:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #64  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(_name);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field String _name>
	//    7   13:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append("(");
	//    9   17:aload_1         
	//   10   18:ldc1            #71  <String "(">
	//   11   20:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(_argTypes.length);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #25  <Field Class[] _argTypes>
	//   16   29:arraylength     
	//   17   30:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   18   33:pop             
		stringbuilder.append("-args)");
	//   19   34:aload_1         
	//   20   35:ldc1            #76  <String "-args)">
	//   21   37:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
		return stringbuilder.toString();
	//   23   41:aload_1         
	//   24   42:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   25   45:areturn         
	}

	static final Class NO_CLASSES[] = new Class[0];
	final Class _argTypes[];
	final String _name;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Class[]
	//    2    4:putstatic       #16  <Field Class[] NO_CLASSES>
	//*   3    7:return          
	}
}
