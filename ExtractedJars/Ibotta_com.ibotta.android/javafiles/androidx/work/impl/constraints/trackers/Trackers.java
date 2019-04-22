// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints.trackers;

import android.content.Context;

// Referenced classes of package androidx.work.impl.constraints.trackers:
//			BatteryChargingTracker, BatteryNotLowTracker, NetworkStateTracker, StorageNotLowTracker

public class Trackers
{

	private Trackers(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		context = context.getApplicationContext();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #29  <Method Context Context.getApplicationContext()>
	//    4    8:astore_1        
		mBatteryChargingTracker = new BatteryChargingTracker(context);
	//    5    9:aload_0         
	//    6   10:new             #31  <Class BatteryChargingTracker>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #33  <Method void BatteryChargingTracker(Context)>
	//   10   18:putfield        #35  <Field BatteryChargingTracker mBatteryChargingTracker>
		mBatteryNotLowTracker = new BatteryNotLowTracker(context);
	//   11   21:aload_0         
	//   12   22:new             #37  <Class BatteryNotLowTracker>
	//   13   25:dup             
	//   14   26:aload_1         
	//   15   27:invokespecial   #38  <Method void BatteryNotLowTracker(Context)>
	//   16   30:putfield        #40  <Field BatteryNotLowTracker mBatteryNotLowTracker>
		mNetworkStateTracker = new NetworkStateTracker(context);
	//   17   33:aload_0         
	//   18   34:new             #42  <Class NetworkStateTracker>
	//   19   37:dup             
	//   20   38:aload_1         
	//   21   39:invokespecial   #43  <Method void NetworkStateTracker(Context)>
	//   22   42:putfield        #45  <Field NetworkStateTracker mNetworkStateTracker>
		mStorageNotLowTracker = new StorageNotLowTracker(context);
	//   23   45:aload_0         
	//   24   46:new             #47  <Class StorageNotLowTracker>
	//   25   49:dup             
	//   26   50:aload_1         
	//   27   51:invokespecial   #48  <Method void StorageNotLowTracker(Context)>
	//   28   54:putfield        #50  <Field StorageNotLowTracker mStorageNotLowTracker>
	//   29   57:return          
	}

	public static Trackers getInstance(Context context)
	{
		androidx/work/impl/constraints/trackers/Trackers;
	//    0    0:ldc1            #2   <Class Trackers>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(sInstance == null)
	//*   2    3:getstatic       #55  <Field Trackers sInstance>
	//*   3    6:ifnonnull       20
			sInstance = new Trackers(context);
	//    4    9:new             #2   <Class Trackers>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:invokespecial   #56  <Method void Trackers(Context)>
	//    8   17:putstatic       #55  <Field Trackers sInstance>
		context = ((Context) (sInstance));
	//    9   20:getstatic       #55  <Field Trackers sInstance>
	//   10   23:astore_0        
		androidx/work/impl/constraints/trackers/Trackers;
	//   11   24:ldc1            #2   <Class Trackers>
		JVM INSTR monitorexit ;
	//   12   26:monitorexit     
		return ((Trackers) (context));
	//   13   27:aload_0         
	//   14   28:areturn         
		context;
	//   15   29:astore_0        
	//*  16   30:ldc1            #2   <Class Trackers>
		throw context;
	//   17   32:monitorexit     
	//   18   33:aload_0         
	//   19   34:athrow          
	}

	public BatteryChargingTracker getBatteryChargingTracker()
	{
		return mBatteryChargingTracker;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field BatteryChargingTracker mBatteryChargingTracker>
	//    2    4:areturn         
	}

	public BatteryNotLowTracker getBatteryNotLowTracker()
	{
		return mBatteryNotLowTracker;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field BatteryNotLowTracker mBatteryNotLowTracker>
	//    2    4:areturn         
	}

	public NetworkStateTracker getNetworkStateTracker()
	{
		return mNetworkStateTracker;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field NetworkStateTracker mNetworkStateTracker>
	//    2    4:areturn         
	}

	public StorageNotLowTracker getStorageNotLowTracker()
	{
		return mStorageNotLowTracker;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field StorageNotLowTracker mStorageNotLowTracker>
	//    2    4:areturn         
	}

	private static Trackers sInstance;
	private BatteryChargingTracker mBatteryChargingTracker;
	private BatteryNotLowTracker mBatteryNotLowTracker;
	private NetworkStateTracker mNetworkStateTracker;
	private StorageNotLowTracker mStorageNotLowTracker;
}
