// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.events;

import com.appboy.models.ResponseError;
import com.appboy.models.outgoing.Feedback;

public final class SubmitFeedbackFailed
{

	public SubmitFeedbackFailed(Feedback feedback, ResponseError responseerror)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = feedback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Feedback a>
		b = responseerror;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field ResponseError b>
	//    8   14:return          
	}

	public ResponseError getError()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ResponseError b>
	//    2    4:areturn         
	}

	public Feedback getFeedback()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Feedback a>
	//    2    4:areturn         
	}

	private final Feedback a;
	private final ResponseError b;
}
