// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import android.arch.lifecycle.LiveData;
import androidx.work.Data;
import androidx.work.State;
import java.util.List;

// Referenced classes of package androidx.work.impl.model:
//			WorkSpec

public interface WorkSpecDao
{

	public abstract void delete(String s);

	public abstract List getAllUnfinishedWork();

	public abstract List getAllWorkSpecIds();

	public abstract List getEligibleWorkForScheduling(int i);

	public abstract List getInputsFromPrerequisites(String s);

	public abstract State getState(String s);

	public abstract List getUnfinishedWorkWithName(String s);

	public abstract List getUnfinishedWorkWithTag(String s);

	public abstract WorkSpec getWorkSpec(String s);

	public abstract List getWorkSpecIdAndStatesForName(String s);

	public abstract WorkSpec[] getWorkSpecs(List list);

	public abstract WorkSpec.WorkStatusPojo getWorkStatusPojoForId(String s);

	public abstract List getWorkStatusPojoForIds(List list);

	public abstract List getWorkStatusPojoForName(String s);

	public abstract List getWorkStatusPojoForTag(String s);

	public abstract LiveData getWorkStatusPojoLiveDataForIds(List list);

	public abstract LiveData getWorkStatusPojoLiveDataForName(String s);

	public abstract LiveData getWorkStatusPojoLiveDataForTag(String s);

	public abstract int incrementWorkSpecRunAttemptCount(String s);

	public abstract void insertWorkSpec(WorkSpec workspec);

	public abstract int markWorkSpecScheduled(String s, long l);

	public abstract void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();

	public abstract int resetScheduledState();

	public abstract int resetWorkSpecRunAttemptCount(String s);

	public abstract void setOutput(String s, Data data);

	public abstract void setPeriodStartTime(String s, long l);

	public transient abstract int setState(State state, String as[]);
}
