// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.data;


public class Blob
{

	public Blob()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public Blob(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		blob = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field byte[] blob>
	//    5    9:return          
	}

	public byte[] getBlob()
	{
		return blob;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field byte[] blob>
	//    2    4:areturn         
	}

	public void setBlob(byte abyte0[])
	{
		blob = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field byte[] blob>
	//    3    5:return          
	}

	private byte blob[];
}
