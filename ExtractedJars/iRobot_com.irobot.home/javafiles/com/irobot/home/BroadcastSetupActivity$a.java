// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.*;
import android.net.wifi.WifiManager;
import com.irobot.core.NetworkSSID;
import com.irobot.home.model.WifiConfig;
import java.util.List;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

private class BroadcastSetupActivity$a extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if(intent.getAction().equals("android.net.wifi.SCAN_RESULTS"))
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #27  <Method String Intent.getAction()>
	//*   2    4:ldc1            #29  <String "android.net.wifi.SCAN_RESULTS">
	//*   3    6:invokevirtual   #35  <Method boolean String.equals(Object)>
	//*   4    9:ifeq            89
		{
			BroadcastSetupActivity.a(a, a.C.getScanResults());
	//    5   12:aload_0         
	//    6   13:getfield        #12  <Field BroadcastSetupActivity a>
	//    7   16:aload_0         
	//    8   17:getfield        #12  <Field BroadcastSetupActivity a>
	//    9   20:getfield        #39  <Field WifiManager BroadcastSetupActivity.C>
	//   10   23:invokevirtual   #45  <Method List WifiManager.getScanResults()>
	//   11   26:invokestatic    #48  <Method List BroadcastSetupActivity.a(BroadcastSetupActivity, List)>
	//   12   29:pop             
			if(!NetworkSSID.create(a.J.b()).isLikely5GhzNetwork() && (BroadcastSetupActivity.b(a) || BroadcastSetupActivity.c(a).isEmpty()))
	//*  13   30:aload_0         
	//*  14   31:getfield        #12  <Field BroadcastSetupActivity a>
	//*  15   34:getfield        #52  <Field WifiConfig BroadcastSetupActivity.J>
	//*  16   37:invokevirtual   #57  <Method String WifiConfig.b()>
	//*  17   40:invokestatic    #63  <Method NetworkSSID NetworkSSID.create(String)>
	//*  18   43:invokevirtual   #67  <Method boolean NetworkSSID.isLikely5GhzNetwork()>
	//*  19   46:ifne            82
	//*  20   49:aload_0         
	//*  21   50:getfield        #12  <Field BroadcastSetupActivity a>
	//*  22   53:invokestatic    #70  <Method boolean BroadcastSetupActivity.b(BroadcastSetupActivity)>
	//*  23   56:ifne            74
	//*  24   59:aload_0         
	//*  25   60:getfield        #12  <Field BroadcastSetupActivity a>
	//*  26   63:invokestatic    #74  <Method List BroadcastSetupActivity.c(BroadcastSetupActivity)>
	//*  27   66:invokeinterface #79  <Method boolean List.isEmpty()>
	//*  28   71:ifeq            82
			{
				BroadcastSetupActivity.d(a);
	//   29   74:aload_0         
	//   30   75:getfield        #12  <Field BroadcastSetupActivity a>
	//   31   78:invokestatic    #82  <Method void BroadcastSetupActivity.d(BroadcastSetupActivity)>
				return;
	//   32   81:return          
			}
			BroadcastSetupActivity.e(a);
	//   33   82:aload_0         
	//   34   83:getfield        #12  <Field BroadcastSetupActivity a>
	//   35   86:invokestatic    #85  <Method void BroadcastSetupActivity.e(BroadcastSetupActivity)>
		}
	//   36   89:return          
	}

	final BroadcastSetupActivity a;

	private BroadcastSetupActivity$a(BroadcastSetupActivity broadcastsetupactivity)
	{
		a = broadcastsetupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field BroadcastSetupActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
	//    5    9:return          
	}

	BroadcastSetupActivity$a(BroadcastSetupActivity broadcastsetupactivity, BroadcastSetupActivity$1 broadcastsetupactivity$1)
	{
		this(broadcastsetupactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void BroadcastSetupActivity$a(BroadcastSetupActivity)>
	//    3    5:return          
	}
}
