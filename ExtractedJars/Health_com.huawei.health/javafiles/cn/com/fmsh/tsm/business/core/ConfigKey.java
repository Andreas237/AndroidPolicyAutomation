// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.core;


public class ConfigKey
{

	public ConfigKey()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		index = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #15  <Field int index>
	//    5    9:return          
	}

	public int getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int index>
	//    2    4:ireturn         
	}

	public byte[] getPrivateKey()
	{
		return privateKey;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field byte[] privateKey>
	//    2    4:areturn         
	}

	public byte[] getPublicKey()
	{
		return publicKey;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field byte[] publicKey>
	//    2    4:areturn         
	}

	public void setIndex(int i)
	{
		index = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #15  <Field int index>
	//    3    5:return          
	}

	public void setPrivateKey(byte abyte0[])
	{
		privateKey = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field byte[] privateKey>
	//    3    5:return          
	}

	public void setPublicKey(byte abyte0[])
	{
		publicKey = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field byte[] publicKey>
	//    3    5:return          
	}

	private int index;
	private byte privateKey[];
	private byte publicKey[];
}
