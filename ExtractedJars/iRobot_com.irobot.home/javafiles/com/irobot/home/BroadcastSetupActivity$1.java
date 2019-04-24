// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.irobot.home.fragments.bu;
import com.irobot.home.util.j;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

class BroadcastSetupActivity$1
	implements android.content.stener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		if(a.K instanceof bu)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field BroadcastSetupActivity a>
	//*   2    4:getfield        #24  <Field android.app.Fragment BroadcastSetupActivity.K>
	//*   3    7:instanceof      #26  <Class bu>
	//*   4   10:ifeq            27
		{
			((bu)a.K).b();
	//    5   13:aload_0         
	//    6   14:getfield        #14  <Field BroadcastSetupActivity a>
	//    7   17:getfield        #24  <Field android.app.Fragment BroadcastSetupActivity.K>
	//    8   20:checkcast       #26  <Class bu>
	//    9   23:invokevirtual   #29  <Method void bu.b()>
			return;
	//   10   26:return          
		}
		j.a(4, "Current fragment not the expected SetupNetworkFragment type.");
	//   11   27:iconst_4        
	//   12   28:ldc1            #31  <String "Current fragment not the expected SetupNetworkFragment type.">
	//   13   30:invokestatic    #36  <Method void j.a(int, String)>
		o.c(a.w, "Current fragment not the expected SetupNetworkFragment type.");
	//   14   33:aload_0         
	//   15   34:getfield        #14  <Field BroadcastSetupActivity a>
	//   16   37:getfield        #40  <Field String BroadcastSetupActivity.w>
	//   17   40:ldc1            #31  <String "Current fragment not the expected SetupNetworkFragment type.">
	//   18   42:invokestatic    #46  <Method void o.c(String, String)>
		if(BroadcastSetupActivity.a(a) != null && BroadcastSetupActivity.a(a).isShowing())
	//*  19   45:aload_0         
	//*  20   46:getfield        #14  <Field BroadcastSetupActivity a>
	//*  21   49:invokestatic    #49  <Method AlertDialog BroadcastSetupActivity.a(BroadcastSetupActivity)>
	//*  22   52:ifnull          78
	//*  23   55:aload_0         
	//*  24   56:getfield        #14  <Field BroadcastSetupActivity a>
	//*  25   59:invokestatic    #49  <Method AlertDialog BroadcastSetupActivity.a(BroadcastSetupActivity)>
	//*  26   62:invokevirtual   #55  <Method boolean AlertDialog.isShowing()>
	//*  27   65:ifeq            78
			BroadcastSetupActivity.a(a).dismiss();
	//   28   68:aload_0         
	//   29   69:getfield        #14  <Field BroadcastSetupActivity a>
	//   30   72:invokestatic    #49  <Method AlertDialog BroadcastSetupActivity.a(BroadcastSetupActivity)>
	//   31   75:invokevirtual   #58  <Method void AlertDialog.dismiss()>
	//   32   78:return          
	}

	final BroadcastSetupActivity a;

	BroadcastSetupActivity$1(BroadcastSetupActivity broadcastsetupactivity)
	{
		a = broadcastsetupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field BroadcastSetupActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
