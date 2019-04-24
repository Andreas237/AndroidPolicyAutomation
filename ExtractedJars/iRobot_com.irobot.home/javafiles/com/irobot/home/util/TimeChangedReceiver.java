// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import android.content.*;
import com.irobot.core.Assembler;
import com.irobot.core.TimeService;

// Referenced classes of package com.irobot.home.util:
//			o

public class TimeChangedReceiver extends BroadcastReceiver
{

	public TimeChangedReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		if(intent.getAction() == "android.intent.action.TIME_SET")
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #22  <Method String Intent.getAction()>
	//*   2    4:ldc1            #24  <String "android.intent.action.TIME_SET">
	//*   3    6:if_acmpne       32
		{
			o.b(a, "Device time change detected! Querying for NTP time...");
	//    4    9:getstatic       #26  <Field String a>
	//    5   12:ldc1            #28  <String "Device time change detected! Querying for NTP time...">
	//    6   14:invokestatic    #34  <Method void o.b(String, String)>
			context = ((Context) (Assembler.getInstance().getTimeService()));
	//    7   17:invokestatic    #40  <Method Assembler Assembler.getInstance()>
	//    8   20:invokevirtual   #44  <Method TimeService Assembler.getTimeService()>
	//    9   23:astore_1        
			if(context != null)
	//*  10   24:aload_1         
	//*  11   25:ifnull          32
				((TimeService) (context)).queryNtpTime();
	//   12   28:aload_1         
	//   13   29:invokevirtual   #49  <Method void TimeService.queryNtpTime()>
		}
	//   14   32:return          
	}

	private static final String a = "TimeChangedReceiver";

	static 
	{
	//    0    0:return          
	}
}
