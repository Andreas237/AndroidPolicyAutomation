// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;


public final class BatchResultToken
{

	BatchResultToken(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		mId = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #14  <Field int mId>
	//    5    9:return          
	}

	protected final int mId;
}
