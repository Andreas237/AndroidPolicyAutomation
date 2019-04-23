// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;


public final class ExoPlaybackException extends Exception
{

	public ExoPlaybackException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void Exception(String)>
		caughtAtTopLevel = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #12  <Field boolean caughtAtTopLevel>
	//    6   10:return          
	}

	public ExoPlaybackException(String s, Throwable throwable)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void Exception(String, Throwable)>
		caughtAtTopLevel = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #12  <Field boolean caughtAtTopLevel>
	//    7   11:return          
	}

	public ExoPlaybackException(Throwable throwable)
	{
		super(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void Exception(Throwable)>
		caughtAtTopLevel = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #12  <Field boolean caughtAtTopLevel>
	//    6   10:return          
	}

	ExoPlaybackException(Throwable throwable, boolean flag)
	{
		super(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void Exception(Throwable)>
		caughtAtTopLevel = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #12  <Field boolean caughtAtTopLevel>
	//    6   10:return          
	}

	public final boolean caughtAtTopLevel;
}
