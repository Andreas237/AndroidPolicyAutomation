// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import androidx.work.impl.model.WorkSpec;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package androidx.work:
//			BackoffPolicy, Constraints, Data

public abstract class WorkRequest
{
	public static abstract class Builder
	{

		public final Builder addTag(String s)
		{
			mTags.add(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Set mTags>
		//    2    4:aload_1         
		//    3    5:invokeinterface #68  <Method boolean Set.add(Object)>
		//    4   10:pop             
			return getThis();
		//    5   11:aload_0         
		//    6   12:invokevirtual   #72  <Method WorkRequest$Builder getThis()>
		//    7   15:areturn         
		}

		public final WorkRequest build()
		{
			WorkRequest workrequest = buildInternal();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #79  <Method WorkRequest buildInternal()>
		//    2    4:astore_1        
			mId = UUID.randomUUID();
		//    3    5:aload_0         
		//    4    6:invokestatic    #36  <Method UUID UUID.randomUUID()>
		//    5    9:putfield        #38  <Field UUID mId>
			mWorkSpec = new WorkSpec(mWorkSpec);
		//    6   12:aload_0         
		//    7   13:new             #40  <Class WorkSpec>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:getfield        #54  <Field WorkSpec mWorkSpec>
		//   11   21:invokespecial   #82  <Method void WorkSpec(WorkSpec)>
		//   12   24:putfield        #54  <Field WorkSpec mWorkSpec>
			mWorkSpec.id = mId.toString();
		//   13   27:aload_0         
		//   14   28:getfield        #54  <Field WorkSpec mWorkSpec>
		//   15   31:aload_0         
		//   16   32:getfield        #38  <Field UUID mId>
		//   17   35:invokevirtual   #44  <Method String UUID.toString()>
		//   18   38:putfield        #86  <Field String WorkSpec.id>
			return workrequest;
		//   19   41:aload_1         
		//   20   42:areturn         
		}

		abstract WorkRequest buildInternal();

		abstract Builder getThis();

		public final Builder keepResultsForAtLeast(long l, TimeUnit timeunit)
		{
			mWorkSpec.minimumRetentionDuration = timeunit.toMillis(l);
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field WorkSpec mWorkSpec>
		//    2    4:aload_3         
		//    3    5:lload_1         
		//    4    6:invokevirtual   #95  <Method long TimeUnit.toMillis(long)>
		//    5    9:putfield        #99  <Field long WorkSpec.minimumRetentionDuration>
			return getThis();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #72  <Method WorkRequest$Builder getThis()>
		//    8   16:areturn         
		}

		public final Builder keepResultsForAtLeast(Duration duration)
		{
			mWorkSpec.minimumRetentionDuration = duration.toMillis();
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field WorkSpec mWorkSpec>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #109 <Method long Duration.toMillis()>
		//    4    8:putfield        #99  <Field long WorkSpec.minimumRetentionDuration>
			return getThis();
		//    5   11:aload_0         
		//    6   12:invokevirtual   #72  <Method WorkRequest$Builder getThis()>
		//    7   15:areturn         
		}

		public final Builder setBackoffCriteria(BackoffPolicy backoffpolicy, long l, TimeUnit timeunit)
		{
			mBackoffCriteriaSet = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #25  <Field boolean mBackoffCriteriaSet>
			WorkSpec workspec = mWorkSpec;
		//    3    5:aload_0         
		//    4    6:getfield        #54  <Field WorkSpec mWorkSpec>
		//    5    9:astore          5
			workspec.backoffPolicy = backoffpolicy;
		//    6   11:aload           5
		//    7   13:aload_1         
		//    8   14:putfield        #116 <Field BackoffPolicy WorkSpec.backoffPolicy>
			workspec.setBackoffDelayDuration(timeunit.toMillis(l));
		//    9   17:aload           5
		//   10   19:aload           4
		//   11   21:lload_2         
		//   12   22:invokevirtual   #95  <Method long TimeUnit.toMillis(long)>
		//   13   25:invokevirtual   #120 <Method void WorkSpec.setBackoffDelayDuration(long)>
			return getThis();
		//   14   28:aload_0         
		//   15   29:invokevirtual   #72  <Method WorkRequest$Builder getThis()>
		//   16   32:areturn         
		}

		public final Builder setBackoffCriteria(BackoffPolicy backoffpolicy, Duration duration)
		{
			mBackoffCriteriaSet = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #25  <Field boolean mBackoffCriteriaSet>
			WorkSpec workspec = mWorkSpec;
		//    3    5:aload_0         
		//    4    6:getfield        #54  <Field WorkSpec mWorkSpec>
		//    5    9:astore_3        
			workspec.backoffPolicy = backoffpolicy;
		//    6   10:aload_3         
		//    7   11:aload_1         
		//    8   12:putfield        #116 <Field BackoffPolicy WorkSpec.backoffPolicy>
			workspec.setBackoffDelayDuration(duration.toMillis());
		//    9   15:aload_3         
		//   10   16:aload_2         
		//   11   17:invokevirtual   #109 <Method long Duration.toMillis()>
		//   12   20:invokevirtual   #120 <Method void WorkSpec.setBackoffDelayDuration(long)>
			return getThis();
		//   13   23:aload_0         
		//   14   24:invokevirtual   #72  <Method WorkRequest$Builder getThis()>
		//   15   27:areturn         
		}

		public final Builder setConstraints(Constraints constraints)
		{
			mWorkSpec.constraints = constraints;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field WorkSpec mWorkSpec>
		//    2    4:aload_1         
		//    3    5:putfield        #129 <Field Constraints WorkSpec.constraints>
			return getThis();
		//    4    8:aload_0         
		//    5    9:invokevirtual   #72  <Method WorkRequest$Builder getThis()>
		//    6   12:areturn         
		}

		public final Builder setInitialRunAttemptCount(int i)
		{
			mWorkSpec.runAttemptCount = i;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field WorkSpec mWorkSpec>
		//    2    4:iload_1         
		//    3    5:putfield        #140 <Field int WorkSpec.runAttemptCount>
			return getThis();
		//    4    8:aload_0         
		//    5    9:invokevirtual   #72  <Method WorkRequest$Builder getThis()>
		//    6   12:areturn         
		}

		public final Builder setInitialState(WorkInfo.State state)
		{
			mWorkSpec.state = state;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field WorkSpec mWorkSpec>
		//    2    4:aload_1         
		//    3    5:putfield        #147 <Field WorkInfo$State WorkSpec.state>
			return getThis();
		//    4    8:aload_0         
		//    5    9:invokevirtual   #72  <Method WorkRequest$Builder getThis()>
		//    6   12:areturn         
		}

		public final Builder setInputData(Data data)
		{
			mWorkSpec.input = data;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field WorkSpec mWorkSpec>
		//    2    4:aload_1         
		//    3    5:putfield        #154 <Field Data WorkSpec.input>
			return getThis();
		//    4    8:aload_0         
		//    5    9:invokevirtual   #72  <Method WorkRequest$Builder getThis()>
		//    6   12:areturn         
		}

		public final Builder setPeriodStartTime(long l, TimeUnit timeunit)
		{
			mWorkSpec.periodStartTime = timeunit.toMillis(l);
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field WorkSpec mWorkSpec>
		//    2    4:aload_3         
		//    3    5:lload_1         
		//    4    6:invokevirtual   #95  <Method long TimeUnit.toMillis(long)>
		//    5    9:putfield        #159 <Field long WorkSpec.periodStartTime>
			return getThis();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #72  <Method WorkRequest$Builder getThis()>
		//    8   16:areturn         
		}

		public final Builder setScheduleRequestedAt(long l, TimeUnit timeunit)
		{
			mWorkSpec.scheduleRequestedAt = timeunit.toMillis(l);
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field WorkSpec mWorkSpec>
		//    2    4:aload_3         
		//    3    5:lload_1         
		//    4    6:invokevirtual   #95  <Method long TimeUnit.toMillis(long)>
		//    5    9:putfield        #163 <Field long WorkSpec.scheduleRequestedAt>
			return getThis();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #72  <Method WorkRequest$Builder getThis()>
		//    8   16:areturn         
		}

		boolean mBackoffCriteriaSet;
		UUID mId;
		Set mTags;
		WorkSpec mWorkSpec;

		Builder(Class class1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			mBackoffCriteriaSet = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #25  <Field boolean mBackoffCriteriaSet>
			mTags = ((Set) (new HashSet()));
		//    5    9:aload_0         
		//    6   10:new             #27  <Class HashSet>
		//    7   13:dup             
		//    8   14:invokespecial   #28  <Method void HashSet()>
		//    9   17:putfield        #30  <Field Set mTags>
			mId = UUID.randomUUID();
		//   10   20:aload_0         
		//   11   21:invokestatic    #36  <Method UUID UUID.randomUUID()>
		//   12   24:putfield        #38  <Field UUID mId>
			mWorkSpec = new WorkSpec(mId.toString(), class1.getName());
		//   13   27:aload_0         
		//   14   28:new             #40  <Class WorkSpec>
		//   15   31:dup             
		//   16   32:aload_0         
		//   17   33:getfield        #38  <Field UUID mId>
		//   18   36:invokevirtual   #44  <Method String UUID.toString()>
		//   19   39:aload_1         
		//   20   40:invokevirtual   #49  <Method String Class.getName()>
		//   21   43:invokespecial   #52  <Method void WorkSpec(String, String)>
		//   22   46:putfield        #54  <Field WorkSpec mWorkSpec>
			addTag(class1.getName());
		//   23   49:aload_0         
		//   24   50:aload_1         
		//   25   51:invokevirtual   #49  <Method String Class.getName()>
		//   26   54:invokevirtual   #58  <Method WorkRequest$Builder addTag(String)>
		//   27   57:pop             
		//   28   58:return          
		}
	}


	protected WorkRequest(UUID uuid, WorkSpec workspec, Set set)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		mId = uuid;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field UUID mId>
		mWorkSpec = workspec;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #38  <Field WorkSpec mWorkSpec>
		mTags = set;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #40  <Field Set mTags>
	//   11   19:return          
	}

	public UUID getId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field UUID mId>
	//    2    4:areturn         
	}

	public String getStringId()
	{
		return mId.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field UUID mId>
	//    2    4:invokevirtual   #54  <Method String UUID.toString()>
	//    3    7:areturn         
	}

	public Set getTags()
	{
		return mTags;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Set mTags>
	//    2    4:areturn         
	}

	public WorkSpec getWorkSpec()
	{
		return mWorkSpec;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field WorkSpec mWorkSpec>
	//    2    4:areturn         
	}

	public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000L;
	public static final long MAX_BACKOFF_MILLIS = 0x112a880L;
	public static final long MIN_BACKOFF_MILLIS = 10000L;
	private UUID mId;
	private Set mTags;
	private WorkSpec mWorkSpec;
}
