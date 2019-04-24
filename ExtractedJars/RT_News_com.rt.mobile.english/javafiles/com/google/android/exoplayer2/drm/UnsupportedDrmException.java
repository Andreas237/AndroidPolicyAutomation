// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import java.lang.annotation.Annotation;

public final class UnsupportedDrmException extends Exception
{
	public static interface Reason
		extends Annotation
	{
	}


	public UnsupportedDrmException(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Exception()>
		reason = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int reason>
	//    5    9:return          
	}

	public UnsupportedDrmException(int i, Exception exception)
	{
		super(((Throwable) (exception)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #25  <Method void Exception(Throwable)>
		reason = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #20  <Field int reason>
	//    6   10:return          
	}

	public static final int REASON_INSTANTIATION_ERROR = 2;
	public static final int REASON_UNSUPPORTED_SCHEME = 1;
	public final int reason;
}
