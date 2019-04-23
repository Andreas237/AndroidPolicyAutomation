// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.os.Bundle;

// Referenced classes of package com.firebase.jobdispatcher:
//			RetryStrategy, JobTrigger, TriggerReason

public interface JobParameters
{

	public abstract int[] getConstraints();

	public abstract Bundle getExtras();

	public abstract int getLifetime();

	public abstract RetryStrategy getRetryStrategy();

	public abstract String getService();

	public abstract String getTag();

	public abstract JobTrigger getTrigger();

	public abstract TriggerReason getTriggerReason();

	public abstract boolean isRecurring();

	public abstract boolean shouldReplaceCurrent();
}
