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

public class NetworkConnectedController extends ConstraintController
{

	public NetworkConnectedController(Context context)
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
		return workspec.constraints.getRequiredNetworkType() == NetworkType.CONNECTED;
	//    0    0:aload_1         
	//    1    1:getfield        #30  <Field Constraints WorkSpec.constraints>
	//    2    4:invokevirtual   #36  <Method NetworkType Constraints.getRequiredNetworkType()>
	//    3    7:getstatic       #42  <Field NetworkType NetworkType.CONNECTED>
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
		if(i >= 26)
	//*   4    6:iload_2         
	//*   5    7:bipush          26
	//*   6    9:icmplt          32
		{
			if(networkstate.isConnected())
	//*   7   12:aload_1         
	//*   8   13:invokevirtual   #57  <Method boolean NetworkState.isConnected()>
	//*   9   16:ifeq            30
			{
				if(!networkstate.isValidated())
	//*  10   19:aload_1         
	//*  11   20:invokevirtual   #60  <Method boolean NetworkState.isValidated()>
	//*  12   23:ifne            28
					return true;
	//   13   26:iconst_1        
	//   14   27:ireturn         
				flag = false;
	//   15   28:iconst_0        
	//   16   29:istore_3        
			}
			return flag;
	//   17   30:iload_3         
	//   18   31:ireturn         
		} else
		{
			return networkstate.isConnected() ^ true;
	//   19   32:aload_1         
	//   20   33:invokevirtual   #57  <Method boolean NetworkState.isConnected()>
	//   21   36:iconst_1        
	//   22   37:ixor            
	//   23   38:ireturn         
		}
	}

	volatile boolean isConstrained(Object obj)
	{
		return isConstrained((NetworkState)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #53  <Class NetworkState>
	//    3    5:invokevirtual   #63  <Method boolean isConstrained(NetworkState)>
	//    4    8:ireturn         
	}
}
