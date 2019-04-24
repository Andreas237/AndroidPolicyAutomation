// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging.message;

import com.birbit.android.jobqueue.TagConstraint;
import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.Type;

public class CancelMessage extends Message
{

	public CancelMessage()
	{
		super(Type.CANCEL);
	//    0    0:aload_0         
	//    1    1:getstatic       #18  <Field Type Type.CANCEL>
	//    2    4:invokespecial   #21  <Method void Message(Type)>
	//    3    7:return          
	}

	public com.birbit.android.jobqueue.CancelResult.AsyncCancelCallback getCallback()
	{
		return callback;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field com.birbit.android.jobqueue.CancelResult$AsyncCancelCallback callback>
	//    2    4:areturn         
	}

	public TagConstraint getConstraint()
	{
		return constraint;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field TagConstraint constraint>
	//    2    4:areturn         
	}

	public String[] getTags()
	{
		return tags;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String[] tags>
	//    2    4:areturn         
	}

	protected void onRecycled()
	{
	//    0    0:return          
	}

	public void setCallback(com.birbit.android.jobqueue.CancelResult.AsyncCancelCallback asynccancelcallback)
	{
		callback = asynccancelcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field com.birbit.android.jobqueue.CancelResult$AsyncCancelCallback callback>
	//    3    5:return          
	}

	public void setConstraint(TagConstraint tagconstraint)
	{
		constraint = tagconstraint;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field TagConstraint constraint>
	//    3    5:return          
	}

	public void setTags(String as[])
	{
		tags = as;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field String[] tags>
	//    3    5:return          
	}

	private com.birbit.android.jobqueue.CancelResult.AsyncCancelCallback callback;
	private TagConstraint constraint;
	private String tags[];
}
