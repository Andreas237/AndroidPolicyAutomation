// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;


// Referenced classes of package com.firebase.jobdispatcher:
//			ExecutionDelegator, JobInvocation

static interface ExecutionDelegator$JobFinishedCallback
{

	public abstract void onJobFinished(JobInvocation jobinvocation, int i);
}
