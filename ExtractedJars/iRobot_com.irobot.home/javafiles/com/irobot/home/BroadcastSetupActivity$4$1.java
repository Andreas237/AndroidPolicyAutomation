// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

class BroadcastSetupActivity$4$1
	implements android.content.ener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		a.a.I();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BroadcastSetupActivity$4 a>
	//    2    4:getfield        #25  <Field BroadcastSetupActivity BroadcastSetupActivity$4.a>
	//    3    7:invokevirtual   #30  <Method void BroadcastSetupActivity.I()>
	//    4   10:return          
	}

	final BroadcastSetupActivity._cls4 a;

	BroadcastSetupActivity$4$1(BroadcastSetupActivity._cls4 _pcls4)
	{
		a = _pcls4;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BroadcastSetupActivity$4 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/irobot/home/BroadcastSetupActivity$4

/* anonymous class */
	class BroadcastSetupActivity._cls4
		implements Runnable
	{

		public void run()
		{
			(new android.app.AlertDialog.Builder(((android.content.Context) (a)))).setTitle("Update Required").setMessage("BLE provisioning requires the robot firmware to be updated.\n\nPlease upgrade your robot or select another robot to provision.").setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (new BroadcastSetupActivity._cls4._cls1(this)))).show();
		//    0    0:new             #25  <Class android.app.AlertDialog$Builder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field BroadcastSetupActivity a>
		//    4    8:invokespecial   #28  <Method void android.app.AlertDialog$Builder(android.content.Context)>
		//    5   11:ldc1            #30  <String "Update Required">
		//    6   13:invokevirtual   #34  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
		//    7   16:ldc1            #36  <String "BLE provisioning requires the robot firmware to be updated.\n\nPlease upgrade your robot or select another robot to provision.">
		//    8   18:invokevirtual   #39  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
		//    9   21:ldc1            #40  <Int 0x7f0f05bb>
		//   10   23:new             #13  <Class BroadcastSetupActivity$4$1>
		//   11   26:dup             
		//   12   27:aload_0         
		//   13   28:invokespecial   #43  <Method void BroadcastSetupActivity$4$1(BroadcastSetupActivity$4)>
		//   14   31:invokevirtual   #47  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
		//   15   34:invokevirtual   #51  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
		//   16   37:pop             
		//   17   38:return          
		}

		final BroadcastSetupActivity a;

			
			{
				a = broadcastsetupactivity;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}

}
