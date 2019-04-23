// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import java.util.List;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobParameters, JobTrigger, RetryStrategy

public interface JobValidator
{

	public abstract List validate(JobParameters jobparameters);

	public abstract List validate(JobTrigger jobtrigger);

	public abstract List validate(RetryStrategy retrystrategy);
}
