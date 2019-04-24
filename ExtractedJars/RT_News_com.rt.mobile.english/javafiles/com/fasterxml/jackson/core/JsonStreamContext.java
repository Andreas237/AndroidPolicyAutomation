// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;


public abstract class JsonStreamContext
{

	protected JsonStreamContext()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public final int getCurrentIndex()
	{
		if(_index < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field int _index>
	//*   2    4:ifge            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return _index;
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field int _index>
	//    7   13:ireturn         
	}

	public abstract String getCurrentName();

	public Object getCurrentValue()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final int getEntryCount()
	{
		return _index + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int _index>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public abstract JsonStreamContext getParent();

	public final String getTypeDesc()
	{
		switch(_type)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int _type>
		{
	//*   2    4:tableswitch     0 2: default 32
	//	               0 41
	//	               1 38
	//	               2 35
		default:
			return "?";
	//    3   32:ldc1            #35  <String "?">
	//    4   34:areturn         

		case 2: // '\002'
			return "OBJECT";
	//    5   35:ldc1            #37  <String "OBJECT">
	//    6   37:areturn         

		case 1: // '\001'
			return "ARRAY";
	//    7   38:ldc1            #39  <String "ARRAY">
	//    8   40:areturn         

		case 0: // '\0'
			return "ROOT";
	//    9   41:ldc1            #41  <String "ROOT">
	//   10   43:areturn         
		}
	}

	public final boolean inArray()
	{
		return _type == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int _type>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final boolean inObject()
	{
		return _type == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int _type>
	//    2    4:iconst_2        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final boolean inRoot()
	{
		return _type == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int _type>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void setCurrentValue(Object obj)
	{
	//    0    0:return          
	}

	public String typeDesc()
	{
		switch(_type)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int _type>
		{
	//*   2    4:tableswitch     0 2: default 32
	//	               0 41
	//	               1 38
	//	               2 35
		default:
			return "?";
	//    3   32:ldc1            #35  <String "?">
	//    4   34:areturn         

		case 2: // '\002'
			return "Object";
	//    5   35:ldc1            #51  <String "Object">
	//    6   37:areturn         

		case 1: // '\001'
			return "Array";
	//    7   38:ldc1            #53  <String "Array">
	//    8   40:areturn         

		case 0: // '\0'
			return "root";
	//    9   41:ldc1            #55  <String "root">
	//   10   43:areturn         
		}
	}

	protected static final int TYPE_ARRAY = 1;
	protected static final int TYPE_OBJECT = 2;
	protected static final int TYPE_ROOT = 0;
	protected int _index;
	protected int _type;
}
