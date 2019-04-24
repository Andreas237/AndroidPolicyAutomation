// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util;


public class FM_Long
{

	public FM_Long()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public FM_Long(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		value = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #14  <Field long value>
	//    5    9:return          
	}

	public long getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field long value>
	//    2    4:lreturn         
	}

	public void setValue(long l)
	{
		value = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #14  <Field long value>
	//    3    5:return          
	}

	private long value;
}
