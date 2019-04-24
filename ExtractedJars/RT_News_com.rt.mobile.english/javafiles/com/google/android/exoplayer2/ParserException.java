// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import java.io.IOException;

public class ParserException extends IOException
{

	public ParserException()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void IOException()>
	//    2    4:return          
	}

	public ParserException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void IOException(String)>
	//    3    5:return          
	}

	public ParserException(String s, Throwable throwable)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void IOException(String, Throwable)>
	//    4    6:return          
	}

	public ParserException(Throwable throwable)
	{
		super(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void IOException(Throwable)>
	//    3    5:return          
	}
}
