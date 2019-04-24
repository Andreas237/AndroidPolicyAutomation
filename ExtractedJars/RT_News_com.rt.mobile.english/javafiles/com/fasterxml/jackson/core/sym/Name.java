// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.sym;


public abstract class Name
{

	protected Name(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		_name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String _name>
		_hashCode = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #17  <Field int _hashCode>
	//    8   14:return          
	}

	public abstract boolean equals(int i);

	public abstract boolean equals(int i, int j);

	public abstract boolean equals(int i, int j, int k);

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

	public abstract boolean equals(int ai[], int i);

	public String getName()
	{
		return _name;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String _name>
	//    2    4:areturn         
	}

	public final int hashCode()
	{
		return _hashCode;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int _hashCode>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return _name;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String _name>
	//    2    4:areturn         
	}

	protected final int _hashCode;
	protected final String _name;
}
