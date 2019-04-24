// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.home.util.f;

// Referenced classes of package com.irobot.home:
//			PersistentMapFeedbackActivity

class PersistentMapFeedbackActivity$3$1
	implements android.content.DialogInterface.OnClickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		f.a();
	//    0    0:invokestatic    #26  <Method void f.a()>
		PersistentMapFeedbackActivity.e(a.a);
	//    1    3:aload_0         
	//    2    4:getfield        #17  <Field PersistentMapFeedbackActivity$3 a>
	//    3    7:getfield        #29  <Field PersistentMapFeedbackActivity PersistentMapFeedbackActivity$3.a>
	//    4   10:invokestatic    #35  <Method void PersistentMapFeedbackActivity.e(PersistentMapFeedbackActivity)>
		a.a.finish();
	//    5   13:aload_0         
	//    6   14:getfield        #17  <Field PersistentMapFeedbackActivity$3 a>
	//    7   17:getfield        #29  <Field PersistentMapFeedbackActivity PersistentMapFeedbackActivity$3.a>
	//    8   20:invokevirtual   #38  <Method void PersistentMapFeedbackActivity.finish()>
	//    9   23:return          
	}

	final PersistentMapFeedbackActivity._cls3 a;

	PersistentMapFeedbackActivity$3$1(PersistentMapFeedbackActivity._cls3 _pcls3)
	{
		a = _pcls3;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field PersistentMapFeedbackActivity$3 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/irobot/home/PersistentMapFeedbackActivity$3

/* anonymous class */
	class PersistentMapFeedbackActivity._cls3
		implements Runnable
	{

		public void run()
		{
			PersistentMapFeedbackActivity.d(a);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field PersistentMapFeedbackActivity a>
		//    2    4:invokestatic    #26  <Method void PersistentMapFeedbackActivity.d(PersistentMapFeedbackActivity)>
			a.j = (new android.app.AlertDialog.Builder(((android.content.Context) (a)))).setMessage(0x7f0f02f0).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (new PersistentMapFeedbackActivity._cls3._cls1(this)))).show();
		//    3    7:aload_0         
		//    4    8:getfield        #19  <Field PersistentMapFeedbackActivity a>
		//    5   11:new             #28  <Class android.app.AlertDialog$Builder>
		//    6   14:dup             
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field PersistentMapFeedbackActivity a>
		//    9   19:invokespecial   #31  <Method void android.app.AlertDialog$Builder(android.content.Context)>
		//   10   22:ldc1            #32  <Int 0x7f0f02f0>
		//   11   24:invokevirtual   #36  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
		//   12   27:ldc1            #37  <Int 0x7f0f05bb>
		//   13   29:new             #13  <Class PersistentMapFeedbackActivity$3$1>
		//   14   32:dup             
		//   15   33:aload_0         
		//   16   34:invokespecial   #40  <Method void PersistentMapFeedbackActivity$3$1(PersistentMapFeedbackActivity$3)>
		//   17   37:invokevirtual   #44  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
		//   18   40:invokevirtual   #48  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
		//   19   43:putfield        #52  <Field android.app.AlertDialog PersistentMapFeedbackActivity.j>
		//   20   46:return          
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
