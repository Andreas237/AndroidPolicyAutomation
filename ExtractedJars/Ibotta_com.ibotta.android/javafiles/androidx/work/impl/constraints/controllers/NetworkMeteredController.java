// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints.controllers;

import android.content.Context;
import androidx.work.*;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;

// Referenced classes of package androidx.work.impl.constraints.controllers:
//			ConstraintController

public class NetworkMeteredController extends ConstraintController
{

	public NetworkMeteredController(Context context)
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
		return workspec.constraints.getRequiredNetworkType() == NetworkType.METERED;
	//    0    0:aload_1         
	//    1    1:getfield        #30  <Field Constraints WorkSpec.constraints>
	//    2    4:invokevirtual   #36  <Method NetworkType Constraints.getRequiredNetworkType()>
	//    3    7:getstatic       #42  <Field NetworkType NetworkType.METERED>
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	boolean isConstrained(NetworkState networkstate)
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #51  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_2        
		boolean flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_3        
		if(i < 26)
	//*   4    6:iload_2         
	//*   5    7:bipush          26
	//*   6    9:icmpge          30
		{
			Logger.debug("NetworkMeteredCtrlr", "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
	//    7   12:ldc1            #53  <String "NetworkMeteredCtrlr">
	//    8   14:ldc1            #55  <String "Metered network constraint is not supported before API 26, only checking for connected state.">
	//    9   16:iconst_0        
	//   10   17:anewarray       Throwable[]
	//   11   20:invokestatic    #63  <Method void Logger.debug(String, String, Throwable[])>
			return networkstate.isConnected() ^ true;
	//   12   23:aload_1         
	//   13   24:invokevirtual   #69  <Method boolean NetworkState.isConnected()>
	//   14   27:iconst_1        
	//   15   28:ixor            
	//   16   29:ireturn         
		}
		if(networkstate.isConnected())
	//*  17   30:aload_1         
	//*  18   31:invokevirtual   #69  <Method boolean NetworkState.isConnected()>
	//*  19   34:ifeq            48
		{
			if(!networkstate.isMetered())
	//*  20   37:aload_1         
	//*  21   38:invokevirtual   #72  <Method boolean NetworkState.isMetered()>
	//*  22   41:ifne            46
				return true;
	//   23   44:iconst_1        
	//   24   45:ireturn         
			flag = false;
	//   25   46:iconst_0        
	//   26   47:istore_3        
		}
		return flag;
	//   27   48:iload_3         
	//   28   49:ireturn         
	}

	volatile boolean isConstrained(Object obj)
	{
		return isConstrained((NetworkState)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #65  <Class NetworkState>
	//    3    5:invokevirtual   #75  <Method boolean isConstrained(NetworkState)>
	//    4    8:ireturn         
	}
}
