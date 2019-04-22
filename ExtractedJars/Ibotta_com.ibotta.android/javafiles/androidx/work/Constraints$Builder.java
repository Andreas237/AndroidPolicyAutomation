// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;


// Referenced classes of package androidx.work:
//			Constraints, NetworkType, ContentUriTriggers

public static final class Constraints$Builder
{

	public Constraints build()
	{
		return new Constraints(this);
	//    0    0:new             #6   <Class Constraints>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #47  <Method void Constraints(Constraints$Builder)>
	//    4    8:areturn         
	}

	public Constraints$Builder setRequiredNetworkType(NetworkType networktype)
	{
		mRequiredNetworkType = networktype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field NetworkType mRequiredNetworkType>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	ContentUriTriggers mContentUriTriggers;
	NetworkType mRequiredNetworkType;
	boolean mRequiresBatteryNotLow;
	boolean mRequiresCharging;
	boolean mRequiresDeviceIdle;
	boolean mRequiresStorageNotLow;

	public Constraints$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mRequiresCharging = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field boolean mRequiresCharging>
		mRequiresDeviceIdle = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #24  <Field boolean mRequiresDeviceIdle>
		mRequiredNetworkType = NetworkType.NOT_REQUIRED;
	//    8   14:aload_0         
	//    9   15:getstatic       #29  <Field NetworkType NetworkType.NOT_REQUIRED>
	//   10   18:putfield        #31  <Field NetworkType mRequiredNetworkType>
		mRequiresBatteryNotLow = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #33  <Field boolean mRequiresBatteryNotLow>
		mRequiresStorageNotLow = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #35  <Field boolean mRequiresStorageNotLow>
		mContentUriTriggers = new ContentUriTriggers();
	//   17   31:aload_0         
	//   18   32:new             #37  <Class ContentUriTriggers>
	//   19   35:dup             
	//   20   36:invokespecial   #38  <Method void ContentUriTriggers()>
	//   21   39:putfield        #40  <Field ContentUriTriggers mContentUriTriggers>
	//   22   42:return          
	}
}
