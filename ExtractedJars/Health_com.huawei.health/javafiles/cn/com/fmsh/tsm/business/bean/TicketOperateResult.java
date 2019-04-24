// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;


public class TicketOperateResult
{

	public TicketOperateResult()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public int getOperateResult()
	{
		return operateResult;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int operateResult>
	//    2    4:ireturn         
	}

	public byte[] getTicketStub()
	{
		return ticketStub;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field byte[] ticketStub>
	//    2    4:areturn         
	}

	public void setOperateResult(int i)
	{
		operateResult = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field int operateResult>
	//    3    5:return          
	}

	public void setTicketStub(byte abyte0[])
	{
		ticketStub = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field byte[] ticketStub>
	//    3    5:return          
	}

	private int operateResult;
	private byte ticketStub[];
}
