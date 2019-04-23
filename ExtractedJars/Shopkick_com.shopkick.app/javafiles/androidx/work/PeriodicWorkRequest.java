// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import androidx.work.impl.model.WorkSpec;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

// Referenced classes of package androidx.work:
//			WorkRequest, Constraints

public final class PeriodicWorkRequest extends WorkRequest
{
	public static final class Builder extends WorkRequest.Builder
	{

		PeriodicWorkRequest buildInternal()
		{
			if(mBackoffCriteriaSet && android.os.Build.VERSION.SDK_INT >= 23 && mWorkSpec.constraints.requiresDeviceIdle())
		//*   0    0:aload_0         
		//*   1    1:getfield        #58  <Field boolean mBackoffCriteriaSet>
		//*   2    4:ifeq            41
		//*   3    7:getstatic       #64  <Field int android.os.Build$VERSION.SDK_INT>
		//*   4   10:bipush          23
		//*   5   12:icmplt          41
		//*   6   15:aload_0         
		//*   7   16:getfield        #18  <Field WorkSpec mWorkSpec>
		//*   8   19:getfield        #68  <Field Constraints WorkSpec.constraints>
		//*   9   22:invokevirtual   #74  <Method boolean Constraints.requiresDeviceIdle()>
		//*  10   25:ifne            31
		//*  11   28:goto            41
				throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
		//   12   31:new             #76  <Class IllegalArgumentException>
		//   13   34:dup             
		//   14   35:ldc1            #78  <String "Cannot set backoff criteria on an idle mode job">
		//   15   37:invokespecial   #81  <Method void IllegalArgumentException(String)>
		//   16   40:athrow          
			else
				return new PeriodicWorkRequest(this);
		//   17   41:new             #7   <Class PeriodicWorkRequest>
		//   18   44:dup             
		//   19   45:aload_0         
		//   20   46:invokespecial   #84  <Method void PeriodicWorkRequest(PeriodicWorkRequest$Builder)>
		//   21   49:areturn         
		}

		volatile WorkRequest buildInternal()
		{
			return ((WorkRequest) (buildInternal()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #87  <Method PeriodicWorkRequest buildInternal()>
		//    2    4:areturn         
		}

		Builder getThis()
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		volatile WorkRequest.Builder getThis()
		{
			return ((WorkRequest.Builder) (getThis()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #92  <Method PeriodicWorkRequest$Builder getThis()>
		//    2    4:areturn         
		}

		public Builder(Class class1, long l, TimeUnit timeunit)
		{
			super(class1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void WorkRequest$Builder(Class)>
			mWorkSpec.setPeriodic(timeunit.toMillis(l));
		//    3    5:aload_0         
		//    4    6:getfield        #18  <Field WorkSpec mWorkSpec>
		//    5    9:aload           4
		//    6   11:lload_2         
		//    7   12:invokevirtual   #24  <Method long TimeUnit.toMillis(long)>
		//    8   15:invokevirtual   #30  <Method void WorkSpec.setPeriodic(long)>
		//    9   18:return          
		}

		public Builder(Class class1, long l, TimeUnit timeunit, long l1, TimeUnit timeunit1)
		{
			super(class1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void WorkRequest$Builder(Class)>
			mWorkSpec.setPeriodic(timeunit.toMillis(l), timeunit1.toMillis(l1));
		//    3    5:aload_0         
		//    4    6:getfield        #18  <Field WorkSpec mWorkSpec>
		//    5    9:aload           4
		//    6   11:lload_2         
		//    7   12:invokevirtual   #24  <Method long TimeUnit.toMillis(long)>
		//    8   15:aload           7
		//    9   17:lload           5
		//   10   19:invokevirtual   #24  <Method long TimeUnit.toMillis(long)>
		//   11   22:invokevirtual   #38  <Method void WorkSpec.setPeriodic(long, long)>
		//   12   25:return          
		}

		public Builder(Class class1, Duration duration)
		{
			super(class1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void WorkRequest$Builder(Class)>
			mWorkSpec.setPeriodic(duration.toMillis());
		//    3    5:aload_0         
		//    4    6:getfield        #18  <Field WorkSpec mWorkSpec>
		//    5    9:aload_2         
		//    6   10:invokevirtual   #48  <Method long Duration.toMillis()>
		//    7   13:invokevirtual   #30  <Method void WorkSpec.setPeriodic(long)>
		//    8   16:return          
		}

		public Builder(Class class1, Duration duration, Duration duration1)
		{
			super(class1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void WorkRequest$Builder(Class)>
			mWorkSpec.setPeriodic(duration.toMillis(), duration1.toMillis());
		//    3    5:aload_0         
		//    4    6:getfield        #18  <Field WorkSpec mWorkSpec>
		//    5    9:aload_2         
		//    6   10:invokevirtual   #48  <Method long Duration.toMillis()>
		//    7   13:aload_3         
		//    8   14:invokevirtual   #48  <Method long Duration.toMillis()>
		//    9   17:invokevirtual   #38  <Method void WorkSpec.setPeriodic(long, long)>
		//   10   20:return          
		}
	}


	PeriodicWorkRequest(Builder builder)
	{
		super(builder.mId, builder.mWorkSpec, builder.mTags);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #20  <Field java.util.UUID PeriodicWorkRequest$Builder.mId>
	//    3    5:aload_1         
	//    4    6:getfield        #24  <Field WorkSpec PeriodicWorkRequest$Builder.mWorkSpec>
	//    5    9:aload_1         
	//    6   10:getfield        #28  <Field java.util.Set PeriodicWorkRequest$Builder.mTags>
	//    7   13:invokespecial   #31  <Method void WorkRequest(java.util.UUID, WorkSpec, java.util.Set)>
	//    8   16:return          
	}

	public static final long MIN_PERIODIC_FLEX_MILLIS = 0x493e0L;
	public static final long MIN_PERIODIC_INTERVAL_MILLIS = 0xdbba0L;
}
