// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints.controllers;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;

// Referenced classes of package androidx.work.impl.constraints.controllers:
//			ConstraintController

public class NetworkUnmeteredController extends ConstraintController
{

	public NetworkUnmeteredController(Context context)
	{
		super(((androidx.work.impl.constraints.trackers.ConstraintTracker) (Trackers.getInstance(context).getNetworkStateTracker())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #13  <Method Trackers Trackers.getInstance(Context)>
	//    3    5:invokevirtual   #17  <Method androidx.work.impl.constraints.trackers.NetworkStateTracker Trackers.getNetworkStateTracker()>
	//    4    8:invokespecial   #20  <Method void ConstraintController(androidx.work.impl.constraints.trackers.ConstraintTracker)>
	//    5   11:return          
	}

	boolean hasConstraint(WorkSpec workspec)
	{
		return workspec.constraints.getRequiredNetworkType() == NetworkType.UNMETERED;
	//    0    0:aload_1         
	//    1    1:getfield        #30  <Field Constraints WorkSpec.constraints>
	//    2    4:invokevirtual   #36  <Method NetworkType Constraints.getRequiredNetworkType()>
	//    3    7:getstatic       #42  <Field NetworkType NetworkType.UNMETERED>
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	boolean isConstrained(NetworkState networkstate)
	{
		return !networkstate.isConnected() || networkstate.isMetered();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #51  <Method boolean NetworkState.isConnected()>
	//    2    4:ifeq            19
	//    3    7:aload_1         
	//    4    8:invokevirtual   #54  <Method boolean NetworkState.isMetered()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	volatile boolean isConstrained(Object obj)
	{
		return isConstrained((NetworkState)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #47  <Class NetworkState>
	//    3    5:invokevirtual   #57  <Method boolean isConstrained(NetworkState)>
	//    4    8:ireturn         
	}
}
