// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			RemoveButtonActivity

class RemoveButtonActivity$6
	implements android.content.Listener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		Assembler.getInstance().getApplicationUIService().sendCommand(ApplicationUIServiceCommand.ContinueWithLocalResetOrRemove, ((com.irobot.core.ApplicationUIServiceData) (null)));
	//    0    0:invokestatic    #28  <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #32  <Method ApplicationUIService Assembler.getApplicationUIService()>
	//    2    6:getstatic       #38  <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.ContinueWithLocalResetOrRemove>
	//    3    9:aconst_null     
	//    4   10:invokevirtual   #44  <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, com.irobot.core.ApplicationUIServiceData)>
	//    5   13:return          
	}

	final RemoveButtonActivity a;

	RemoveButtonActivity$6(RemoveButtonActivity removebuttonactivity)
	{
		a = removebuttonactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field RemoveButtonActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
