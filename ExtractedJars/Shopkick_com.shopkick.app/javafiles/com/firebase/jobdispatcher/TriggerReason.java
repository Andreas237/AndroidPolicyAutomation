// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import java.util.List;

public class TriggerReason
{

	TriggerReason(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		triggeredContentUris = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field List triggeredContentUris>
	//    5    9:return          
	}

	public List getTriggeredContentUris()
	{
		return triggeredContentUris;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field List triggeredContentUris>
	//    2    4:areturn         
	}

	private final List triggeredContentUris;
}
