// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.events;

import com.appboy.models.outgoing.Feedback;

public final class SubmitFeedbackSucceeded
{

	public SubmitFeedbackSucceeded(Feedback feedback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		a = feedback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Feedback a>
	//    5    9:return          
	}

	public Feedback getFeedback()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Feedback a>
	//    2    4:areturn         
	}

	private final Feedback a;
}
