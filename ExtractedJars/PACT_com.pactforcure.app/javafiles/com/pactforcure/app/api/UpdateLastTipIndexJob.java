// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api;

import com.birbit.android.jobqueue.*;
import com.pactforcure.app.participant.ParticipantServerAgent;

public class UpdateLastTipIndexJob extends Job
{

	public UpdateLastTipIndexJob()
	{
		super((new Params(1)).persist());
	//    0    0:aload_0         
	//    1    1:new             #8   <Class Params>
	//    2    4:dup             
	//    3    5:iconst_1        
	//    4    6:invokespecial   #11  <Method void Params(int)>
	//    5    9:invokevirtual   #15  <Method Params Params.persist()>
	//    6   12:invokespecial   #18  <Method void Job(Params)>
	//    7   15:return          
	}

	public void onAdded()
	{
	//    0    0:return          
	}

	protected void onCancel(int i, Throwable throwable)
	{
	//    0    0:return          
	}

	public void onRun()
		throws Throwable
	{
		(new ParticipantServerAgent()).updateProfileSynchronous();
	//    0    0:new             #29  <Class ParticipantServerAgent>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void ParticipantServerAgent()>
	//    3    7:invokevirtual   #34  <Method void ParticipantServerAgent.updateProfileSynchronous()>
	//    4   10:return          
	}

	protected RetryConstraint shouldReRunOnThrowable(Throwable throwable, int i, int j)
	{
		return RetryConstraint.createExponentialBackoff(i, 5000L);
	//    0    0:iload_2         
	//    1    1:ldc2w           #39  <Long 5000L>
	//    2    4:invokestatic    #46  <Method RetryConstraint RetryConstraint.createExponentialBackoff(int, long)>
	//    3    7:areturn         
	}
}
