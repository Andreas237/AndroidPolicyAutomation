// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import android.net.Uri;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

// Referenced classes of package androidx.work:
//			Constraints, NetworkType, ContentUriTriggers

public static final class Constraints$Builder
{

	public Constraints$Builder addContentUriTrigger(Uri uri, boolean flag)
	{
		mContentUriTriggers.add(uri, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ContentUriTriggers mContentUriTriggers>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #60  <Method void ContentUriTriggers.add(Uri, boolean)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Constraints build()
	{
		return new Constraints(this);
	//    0    0:new             #6   <Class Constraints>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #67  <Method void Constraints(Constraints$Builder)>
	//    4    8:areturn         
	}

	public Constraints$Builder setRequiredNetworkType(NetworkType networktype)
	{
		mRequiredNetworkType = networktype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field NetworkType mRequiredNetworkType>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Constraints$Builder setRequiresBatteryNotLow(boolean flag)
	{
		mRequiresBatteryNotLow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field boolean mRequiresBatteryNotLow>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Constraints$Builder setRequiresCharging(boolean flag)
	{
		mRequiresCharging = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field boolean mRequiresCharging>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Constraints$Builder setRequiresDeviceIdle(boolean flag)
	{
		mRequiresDeviceIdle = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field boolean mRequiresDeviceIdle>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Constraints$Builder setRequiresStorageNotLow(boolean flag)
	{
		mRequiresStorageNotLow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field boolean mRequiresStorageNotLow>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Constraints$Builder setTriggerContentMaxDelay(long l, TimeUnit timeunit)
	{
		mTriggerContentMaxDelay = timeunit.toMillis(l);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:lload_1         
	//    3    3:invokevirtual   #83  <Method long TimeUnit.toMillis(long)>
	//    4    6:putfield        #44  <Field long mTriggerContentMaxDelay>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Constraints$Builder setTriggerContentMaxDelay(Duration duration)
	{
		mTriggerContentMaxDelay = duration.toMillis();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #90  <Method long Duration.toMillis()>
	//    3    5:putfield        #44  <Field long mTriggerContentMaxDelay>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Constraints$Builder setTriggerContentUpdateDelay(long l, TimeUnit timeunit)
	{
		mTriggerContentUpdateDelay = timeunit.toMillis(l);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:lload_1         
	//    3    3:invokevirtual   #83  <Method long TimeUnit.toMillis(long)>
	//    4    6:putfield        #42  <Field long mTriggerContentUpdateDelay>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Constraints$Builder setTriggerContentUpdateDelay(Duration duration)
	{
		mTriggerContentUpdateDelay = duration.toMillis();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #90  <Method long Duration.toMillis()>
	//    3    5:putfield        #42  <Field long mTriggerContentUpdateDelay>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	ContentUriTriggers mContentUriTriggers;
	NetworkType mRequiredNetworkType;
	boolean mRequiresBatteryNotLow;
	boolean mRequiresCharging;
	boolean mRequiresDeviceIdle;
	boolean mRequiresStorageNotLow;
	long mTriggerContentMaxDelay;
	long mTriggerContentUpdateDelay;

	public Constraints$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		mRequiresCharging = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #25  <Field boolean mRequiresCharging>
		mRequiresDeviceIdle = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #27  <Field boolean mRequiresDeviceIdle>
		mRequiredNetworkType = NetworkType.NOT_REQUIRED;
	//    8   14:aload_0         
	//    9   15:getstatic       #32  <Field NetworkType NetworkType.NOT_REQUIRED>
	//   10   18:putfield        #34  <Field NetworkType mRequiredNetworkType>
		mRequiresBatteryNotLow = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #36  <Field boolean mRequiresBatteryNotLow>
		mRequiresStorageNotLow = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #38  <Field boolean mRequiresStorageNotLow>
		mTriggerContentUpdateDelay = -1L;
	//   17   31:aload_0         
	//   18   32:ldc2w           #39  <Long -1L>
	//   19   35:putfield        #42  <Field long mTriggerContentUpdateDelay>
		mTriggerContentMaxDelay = -1L;
	//   20   38:aload_0         
	//   21   39:ldc2w           #39  <Long -1L>
	//   22   42:putfield        #44  <Field long mTriggerContentMaxDelay>
		mContentUriTriggers = new ContentUriTriggers();
	//   23   45:aload_0         
	//   24   46:new             #46  <Class ContentUriTriggers>
	//   25   49:dup             
	//   26   50:invokespecial   #47  <Method void ContentUriTriggers()>
	//   27   53:putfield        #49  <Field ContentUriTriggers mContentUriTriggers>
	//   28   56:return          
	}
}
