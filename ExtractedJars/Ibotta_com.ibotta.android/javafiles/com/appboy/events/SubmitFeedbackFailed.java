// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.events;

import bo.app.cr;
import com.appboy.models.outgoing.Feedback;

public final class SubmitFeedbackFailed
{

	public SubmitFeedbackFailed(Feedback feedback, cr cr)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = feedback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Feedback a>
		b = cr;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field cr b>
	//    8   14:return          
	}

	public cr getError()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field cr b>
	//    2    4:areturn         
	}

	public Feedback getFeedback()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Feedback a>
	//    2    4:areturn         
	}

	private final Feedback a;
	private final cr b;
}
