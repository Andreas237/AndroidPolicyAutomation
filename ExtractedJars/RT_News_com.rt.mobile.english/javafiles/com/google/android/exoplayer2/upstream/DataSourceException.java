// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import java.io.IOException;

public final class DataSourceException extends IOException
{

	public DataSourceException(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void IOException()>
		reason = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #15  <Field int reason>
	//    5    9:return          
	}

	public static final int POSITION_OUT_OF_RANGE = 0;
	public final int reason;
}
