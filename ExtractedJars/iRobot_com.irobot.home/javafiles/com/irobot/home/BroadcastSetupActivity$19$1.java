// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.bluetooth.BluetoothAdapter;
import android.content.DialogInterface;
import android.content.IntentFilter;
import com.irobot.home.util.BluetoothStateReceiver;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

class BroadcastSetupActivity$19$1
	implements android.content.ner
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		if(!BroadcastSetupActivity.f(a.a).enable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field BroadcastSetupActivity$19 a>
	//*   2    4:getfield        #25  <Field BroadcastSetupActivity BroadcastSetupActivity$19.a>
	//*   3    7:invokestatic    #31  <Method BluetoothAdapter BroadcastSetupActivity.f(BroadcastSetupActivity)>
	//*   4   10:invokevirtual   #37  <Method boolean BluetoothAdapter.enable()>
	//*   5   13:ifne            42
		{
			o.e(a.a.w, "Could not enable Bluetooth!");
	//    6   16:aload_0         
	//    7   17:getfield        #17  <Field BroadcastSetupActivity$19 a>
	//    8   20:getfield        #25  <Field BroadcastSetupActivity BroadcastSetupActivity$19.a>
	//    9   23:getfield        #41  <Field String BroadcastSetupActivity.w>
	//   10   26:ldc1            #43  <String "Could not enable Bluetooth!">
	//   11   28:invokestatic    #49  <Method void o.e(String, String)>
			a.a.h();
	//   12   31:aload_0         
	//   13   32:getfield        #17  <Field BroadcastSetupActivity$19 a>
	//   14   35:getfield        #25  <Field BroadcastSetupActivity BroadcastSetupActivity$19.a>
	//   15   38:invokevirtual   #52  <Method void BroadcastSetupActivity.h()>
			return;
	//   16   41:return          
		} else
		{
			BroadcastSetupActivity.a(a.a, new BluetoothStateReceiver(((com.irobot.home.util.BluetoothStateReceiver.a) (a.a))));
	//   17   42:aload_0         
	//   18   43:getfield        #17  <Field BroadcastSetupActivity$19 a>
	//   19   46:getfield        #25  <Field BroadcastSetupActivity BroadcastSetupActivity$19.a>
	//   20   49:new             #54  <Class BluetoothStateReceiver>
	//   21   52:dup             
	//   22   53:aload_0         
	//   23   54:getfield        #17  <Field BroadcastSetupActivity$19 a>
	//   24   57:getfield        #25  <Field BroadcastSetupActivity BroadcastSetupActivity$19.a>
	//   25   60:invokespecial   #57  <Method void BluetoothStateReceiver(com.irobot.home.util.BluetoothStateReceiver$a)>
	//   26   63:invokestatic    #60  <Method BluetoothStateReceiver BroadcastSetupActivity.a(BroadcastSetupActivity, BluetoothStateReceiver)>
	//   27   66:pop             
			a.a.registerReceiver(((android.content.BroadcastReceiver) (BroadcastSetupActivity.g(a.a))), new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
	//   28   67:aload_0         
	//   29   68:getfield        #17  <Field BroadcastSetupActivity$19 a>
	//   30   71:getfield        #25  <Field BroadcastSetupActivity BroadcastSetupActivity$19.a>
	//   31   74:aload_0         
	//   32   75:getfield        #17  <Field BroadcastSetupActivity$19 a>
	//   33   78:getfield        #25  <Field BroadcastSetupActivity BroadcastSetupActivity$19.a>
	//   34   81:invokestatic    #64  <Method BluetoothStateReceiver BroadcastSetupActivity.g(BroadcastSetupActivity)>
	//   35   84:new             #66  <Class IntentFilter>
	//   36   87:dup             
	//   37   88:ldc1            #68  <String "android.bluetooth.adapter.action.STATE_CHANGED">
	//   38   90:invokespecial   #71  <Method void IntentFilter(String)>
	//   39   93:invokevirtual   #75  <Method android.content.Intent BroadcastSetupActivity.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   40   96:pop             
			return;
	//   41   97:return          
		}
	}

	final BroadcastSetupActivity._cls19 a;

	BroadcastSetupActivity$19$1(BroadcastSetupActivity._cls19 _pcls19)
	{
		a = _pcls19;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BroadcastSetupActivity$19 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/irobot/home/BroadcastSetupActivity$19

/* anonymous class */
	class BroadcastSetupActivity._cls19
		implements Runnable
	{

		public void run()
		{
			(new android.app.AlertDialog.Builder(((android.content.Context) (a)))).setMessage(0x7f0f07fc).setNegativeButton(0x7f0f04d3, new BroadcastSetupActivity._cls19._cls2()).setPositiveButton(0x7f0f0986, ((android.content.DialogInterface.OnClickListener) (new BroadcastSetupActivity._cls19._cls1(this)))).show();
		//    0    0:new             #27  <Class android.app.AlertDialog$Builder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field BroadcastSetupActivity a>
		//    4    8:invokespecial   #30  <Method void android.app.AlertDialog$Builder(android.content.Context)>
		//    5   11:ldc1            #31  <Int 0x7f0f07fc>
		//    6   13:invokevirtual   #35  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
		//    7   16:ldc1            #36  <Int 0x7f0f04d3>
		//    8   18:new             #15  <Class BroadcastSetupActivity$19$2>
		//    9   21:dup             
		//   10   22:aload_0         
		//   11   23:invokespecial   #39  <Method void BroadcastSetupActivity$19$2(BroadcastSetupActivity$19)>
		//   12   26:invokevirtual   #43  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
		//   13   29:ldc1            #44  <Int 0x7f0f0986>
		//   14   31:new             #13  <Class BroadcastSetupActivity$19$1>
		//   15   34:dup             
		//   16   35:aload_0         
		//   17   36:invokespecial   #45  <Method void BroadcastSetupActivity$19$1(BroadcastSetupActivity$19)>
		//   18   39:invokevirtual   #48  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
		//   19   42:invokevirtual   #52  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
		//   20   45:pop             
		//   21   46:return          
		}

		final BroadcastSetupActivity a;

			
			{
				a = broadcastsetupactivity;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}

		// Unreferenced inner class com/irobot/home/BroadcastSetupActivity$19$2

/* anonymous class */
		class BroadcastSetupActivity._cls19._cls2
			implements android.content.DialogInterface.OnClickListener
		{

			public void onClick(DialogInterface dialoginterface, int i)
			{
				o.c(a.a.w, "User has chosen not to enable Bluetooth.");
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity$19 a>
			//    2    4:getfield        #25  <Field BroadcastSetupActivity BroadcastSetupActivity$19.a>
			//    3    7:getfield        #31  <Field String BroadcastSetupActivity.w>
			//    4   10:ldc1            #33  <String "User has chosen not to enable Bluetooth.">
			//    5   12:invokestatic    #39  <Method void o.c(String, String)>
				a.a.i();
			//    6   15:aload_0         
			//    7   16:getfield        #17  <Field BroadcastSetupActivity$19 a>
			//    8   19:getfield        #25  <Field BroadcastSetupActivity BroadcastSetupActivity$19.a>
			//    9   22:invokevirtual   #42  <Method void BroadcastSetupActivity.i()>
			//   10   25:return          
			}

			final BroadcastSetupActivity._cls19 a;

					
					{
						a = BroadcastSetupActivity._cls19.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #17  <Field BroadcastSetupActivity$19 a>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #19  <Method void Object()>
					//    5    9:return          
					}
		}

	}

}
