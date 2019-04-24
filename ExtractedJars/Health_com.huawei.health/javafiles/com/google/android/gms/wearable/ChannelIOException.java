// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import java.io.IOException;

public class ChannelIOException extends IOException
{

	public ChannelIOException(String s, int i, int j)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void IOException(String)>
		zzbSN = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #14  <Field int zzbSN>
		zzbSO = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #16  <Field int zzbSO>
	//    9   15:return          
	}

	public int getAppSpecificErrorCode()
	{
		return zzbSO;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int zzbSO>
	//    2    4:ireturn         
	}

	public int getCloseReason()
	{
		return zzbSN;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field int zzbSN>
	//    2    4:ireturn         
	}

	private final int zzbSN;
	private final int zzbSO;
}
