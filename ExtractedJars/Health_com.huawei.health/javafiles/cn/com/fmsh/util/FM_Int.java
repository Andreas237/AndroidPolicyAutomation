// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util;


public class FM_Int
{

	public FM_Int()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public FM_Int(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		value = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #14  <Field int value>
	//    5    9:return          
	}

	public int getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field int value>
	//    2    4:ireturn         
	}

	public void setValue(int i)
	{
		value = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #14  <Field int value>
	//    3    5:return          
	}

	private int value;
}
