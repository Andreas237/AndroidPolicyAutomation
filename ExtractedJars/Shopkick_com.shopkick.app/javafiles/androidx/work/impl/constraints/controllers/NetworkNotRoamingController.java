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

public class NetworkNotRoamingController extends ConstraintController
{

	public NetworkNotRoamingController(Context context)
	{
		super(((androidx.work.impl.constraints.trackers.ConstraintTracker) (Trackers.getInstance(context).getNetworkStateTracker())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #28  <Method Trackers Trackers.getInstance(Context)>
	//    3    5:invokevirtual   #32  <Method androidx.work.impl.constraints.trackers.NetworkStateTracker Trackers.getNetworkStateTracker()>
	//    4    8:invokespecial   #35  <Method void ConstraintController(androidx.work.impl.constraints.trackers.ConstraintTracker)>
	//    5   11:return          
	}

	boolean hasConstraint(WorkSpec workspec)
	{
		return workspec.constraints.getRequiredNetworkType() == NetworkType.NOT_ROAMING;
	//    0    0:aload_1         
	//    1    1:getfield        #44  <Field Constraints WorkSpec.constraints>
	//    2    4:invokevirtual   #50  <Method NetworkType Constraints.getRequiredNetworkType()>
	//    3    7:getstatic       #56  <Field NetworkType NetworkType.NOT_ROAMING>
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	boolean isConstrained(NetworkState networkstate)
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_2        
		boolean flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_3        
		if(i < 24)
	//*   4    6:iload_2         
	//*   5    7:bipush          24
	//*   6    9:icmpge          34
		{
			Logger.get().debug(TAG, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
	//    7   12:invokestatic    #69  <Method Logger Logger.get()>
	//    8   15:getstatic       #19  <Field String TAG>
	//    9   18:ldc1            #71  <String "Not-roaming network constraint is not supported before API 24, only checking for connected state.">
	//   10   20:iconst_0        
	//   11   21:anewarray       Throwable[]
	//   12   24:invokevirtual   #77  <Method void Logger.debug(String, String, Throwable[])>
			return networkstate.isConnected() ^ true;
	//   13   27:aload_1         
	//   14   28:invokevirtual   #83  <Method boolean NetworkState.isConnected()>
	//   15   31:iconst_1        
	//   16   32:ixor            
	//   17   33:ireturn         
		}
		if(networkstate.isConnected())
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #83  <Method boolean NetworkState.isConnected()>
	//*  20   38:ifeq            52
		{
			if(!networkstate.isNotRoaming())
	//*  21   41:aload_1         
	//*  22   42:invokevirtual   #86  <Method boolean NetworkState.isNotRoaming()>
	//*  23   45:ifne            50
				return true;
	//   24   48:iconst_1        
	//   25   49:ireturn         
			flag = false;
	//   26   50:iconst_0        
	//   27   51:istore_3        
		}
		return flag;
	//   28   52:iload_3         
	//   29   53:ireturn         
	}

	volatile boolean isConstrained(Object obj)
	{
		return isConstrained((NetworkState)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #79  <Class NetworkState>
	//    3    5:invokevirtual   #89  <Method boolean isConstrained(NetworkState)>
	//    4    8:ireturn         
	}

	private static final String TAG = Logger.tagWithPrefix("NetworkNotRoamingCtrlr");

	static 
	{
	//    0    0:ldc1            #11  <String "NetworkNotRoamingCtrlr">
	//    1    2:invokestatic    #17  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #19  <Field String TAG>
	//*   3    8:return          
	}
}
