// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.message.core;


public class MessageTagDefine
{

	public MessageTagDefine()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public int getExist()
	{
		return exist;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int exist>
	//    2    4:ireturn         
	}

	public int getMultiple()
	{
		return multiple;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int multiple>
	//    2    4:ireturn         
	}

	public int getOrder()
	{
		return order;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int order>
	//    2    4:ireturn         
	}

	public byte getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field byte tag>
	//    2    4:ireturn         
	}

	public void setExist(int i)
	{
		exist = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #19  <Field int exist>
	//    3    5:return          
	}

	public void setMultiple(int i)
	{
		multiple = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field int multiple>
	//    3    5:return          
	}

	public void setOrder(int i)
	{
		order = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field int order>
	//    3    5:return          
	}

	public void setTag(byte byte0)
	{
		tag = byte0;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field byte tag>
	//    3    5:return          
	}

	private int exist;
	private int multiple;
	private int order;
	private byte tag;
}
