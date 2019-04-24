// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.home.view.CustomButton;

// Referenced classes of package com.irobot.home:
//			PersistentMapFeedbackActivity

class PersistentMapFeedbackActivity$4$1
	implements android.content.DialogInterface.OnClickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		PersistentMapFeedbackActivity.e(a.a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PersistentMapFeedbackActivity$4 a>
	//    2    4:getfield        #25  <Field PersistentMapFeedbackActivity PersistentMapFeedbackActivity$4.a>
	//    3    7:invokestatic    #31  <Method void PersistentMapFeedbackActivity.e(PersistentMapFeedbackActivity)>
	//    4   10:return          
	}

	final PersistentMapFeedbackActivity._cls4 a;

	PersistentMapFeedbackActivity$4$1(PersistentMapFeedbackActivity._cls4 _pcls4)
	{
		a = _pcls4;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field PersistentMapFeedbackActivity$4 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/irobot/home/PersistentMapFeedbackActivity$4

/* anonymous class */
	class PersistentMapFeedbackActivity._cls4
		implements Runnable
	{

		public void run()
		{
			a.d.setEnabled(true);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field PersistentMapFeedbackActivity a>
		//    2    4:getfield        #27  <Field CustomButton PersistentMapFeedbackActivity.d>
		//    3    7:iconst_1        
		//    4    8:invokevirtual   #33  <Method void CustomButton.setEnabled(boolean)>
			PersistentMapFeedbackActivity.d(a);
		//    5   11:aload_0         
		//    6   12:getfield        #19  <Field PersistentMapFeedbackActivity a>
		//    7   15:invokestatic    #35  <Method void PersistentMapFeedbackActivity.d(PersistentMapFeedbackActivity)>
			a.j = (new android.app.AlertDialog.Builder(((android.content.Context) (a)))).setMessage(0x7f0f02ec).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (new PersistentMapFeedbackActivity._cls4._cls1(this)))).show();
		//    8   18:aload_0         
		//    9   19:getfield        #19  <Field PersistentMapFeedbackActivity a>
		//   10   22:new             #37  <Class android.app.AlertDialog$Builder>
		//   11   25:dup             
		//   12   26:aload_0         
		//   13   27:getfield        #19  <Field PersistentMapFeedbackActivity a>
		//   14   30:invokespecial   #40  <Method void android.app.AlertDialog$Builder(android.content.Context)>
		//   15   33:ldc1            #41  <Int 0x7f0f02ec>
		//   16   35:invokevirtual   #45  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
		//   17   38:ldc1            #46  <Int 0x7f0f05bb>
		//   18   40:new             #13  <Class PersistentMapFeedbackActivity$4$1>
		//   19   43:dup             
		//   20   44:aload_0         
		//   21   45:invokespecial   #49  <Method void PersistentMapFeedbackActivity$4$1(PersistentMapFeedbackActivity$4)>
		//   22   48:invokevirtual   #53  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
		//   23   51:invokevirtual   #57  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
		//   24   54:putfield        #61  <Field android.app.AlertDialog PersistentMapFeedbackActivity.j>
		//   25   57:return          
		}

		final PersistentMapFeedbackActivity a;

			
			{
				a = persistentmapfeedbackactivity;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PersistentMapFeedbackActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}

}
