// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.*;
import com.irobot.home.util.c;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			RemoveButtonActivity

class RemoveButtonActivity$4
	implements android.content.ssListener
{

	public void onDismiss(DialogInterface dialoginterface)
	{
		Assembler.getInstance().getPersistenceHandler().removeFromGroup("MapGettingStartedTour", a.b);
	//    0    0:invokestatic    #28  <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #32  <Method PersistenceHandler Assembler.getPersistenceHandler()>
	//    2    6:ldc1            #34  <String "MapGettingStartedTour">
	//    3    8:aload_0         
	//    4    9:getfield        #17  <Field RemoveButtonActivity a>
	//    5   12:getfield        #38  <Field String RemoveButtonActivity.b>
	//    6   15:invokevirtual   #44  <Method void PersistenceHandler.removeFromGroup(String, String)>
		Assembler.getInstance().getApplicationUIService().sendCommand(ApplicationUIServiceCommand.AcknowledgeResetOrRemovalSuccessHandled, ((com.irobot.core.ApplicationUIServiceData) (null)));
	//    7   18:invokestatic    #28  <Method Assembler Assembler.getInstance()>
	//    8   21:invokevirtual   #48  <Method ApplicationUIService Assembler.getApplicationUIService()>
	//    9   24:getstatic       #54  <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.AcknowledgeResetOrRemovalSuccessHandled>
	//   10   27:aconst_null     
	//   11   28:invokevirtual   #60  <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, com.irobot.core.ApplicationUIServiceData)>
		if(j.C())
	//*  12   31:invokestatic    #66  <Method boolean j.C()>
	//*  13   34:ifeq            44
			c.a(((android.app.Activity) (a)));
	//   14   37:aload_0         
	//   15   38:getfield        #17  <Field RemoveButtonActivity a>
	//   16   41:invokestatic    #71  <Method void c.a(android.app.Activity)>
	//   17   44:return          
	}

	final RemoveButtonActivity a;

	RemoveButtonActivity$4(RemoveButtonActivity removebuttonactivity)
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
