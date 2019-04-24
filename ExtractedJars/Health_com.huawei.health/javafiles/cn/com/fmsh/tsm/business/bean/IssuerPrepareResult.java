// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;


public class IssuerPrepareResult
{

	public IssuerPrepareResult()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public byte[] getFailDesc()
	{
		return failDesc;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field byte[] failDesc>
	//    2    4:areturn         
	}

	public byte[] getSir()
	{
		return sir;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field byte[] sir>
	//    2    4:areturn         
	}

	public void setFailDesc(byte abyte0[])
	{
		failDesc = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field byte[] failDesc>
	//    3    5:return          
	}

	public void setSir(byte abyte0[])
	{
		sir = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field byte[] sir>
	//    3    5:return          
	}

	private byte failDesc[];
	private byte sir[];
}
