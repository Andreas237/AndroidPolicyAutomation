// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.stream;

import java.io.IOException;

public final class MalformedJsonException extends IOException
{

	public MalformedJsonException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void IOException(String)>
	//    3    5:return          
	}

	public MalformedJsonException(String s, Throwable throwable)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void IOException(String)>
		initCause(throwable);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #18  <Method Throwable initCause(Throwable)>
	//    6   10:pop             
	//    7   11:return          
	}

	public MalformedJsonException(Throwable throwable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void IOException()>
		initCause(throwable);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #18  <Method Throwable initCause(Throwable)>
	//    5    9:pop             
	//    6   10:return          
	}

	private static final long serialVersionUID = 1L;
}
