// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging.message;

import com.birbit.android.jobqueue.CancelResult;
import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.Type;

public class CancelResultMessage extends Message
{

	public CancelResultMessage()
	{
		super(Type.CANCEL_RESULT_CALLBACK);
	//    0    0:aload_0         
	//    1    1:getstatic       #16  <Field Type Type.CANCEL_RESULT_CALLBACK>
	//    2    4:invokespecial   #19  <Method void Message(Type)>
	//    3    7:return          
	}

	public com.birbit.android.jobqueue.CancelResult.AsyncCancelCallback getCallback()
	{
		return callback;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field com.birbit.android.jobqueue.CancelResult$AsyncCancelCallback callback>
	//    2    4:areturn         
	}

	public CancelResult getResult()
	{
		return result;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field CancelResult result>
	//    2    4:areturn         
	}

	protected void onRecycled()
	{
		result = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #28  <Field CancelResult result>
		callback = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #24  <Field com.birbit.android.jobqueue.CancelResult$AsyncCancelCallback callback>
	//    6   10:return          
	}

	public void set(com.birbit.android.jobqueue.CancelResult.AsyncCancelCallback asynccancelcallback, CancelResult cancelresult)
	{
		callback = asynccancelcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field com.birbit.android.jobqueue.CancelResult$AsyncCancelCallback callback>
		result = cancelresult;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field CancelResult result>
	//    6   10:return          
	}

	com.birbit.android.jobqueue.CancelResult.AsyncCancelCallback callback;
	CancelResult result;
}
