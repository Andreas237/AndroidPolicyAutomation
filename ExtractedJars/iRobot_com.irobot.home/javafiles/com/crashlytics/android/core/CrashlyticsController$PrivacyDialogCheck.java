// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.app.Activity;
import b.a.a.a.a.g.o;
import b.a.a.a.*;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController, CrashPromptDialog, PreferenceManager

private static final class CrashlyticsController$PrivacyDialogCheck
	implements ReportUploader.SendCheck
{

	public boolean canSendReports()
	{
		Activity activity = kit.getFabric().b();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field i kit>
	//    2    4:invokevirtual   #41  <Method c i.getFabric()>
	//    3    7:invokevirtual   #47  <Method Activity c.b()>
	//    4   10:astore_1        
		if(activity != null && !activity.isFinishing())
	//*   5   11:aload_1         
	//*   6   12:ifnull          78
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #52  <Method boolean Activity.isFinishing()>
	//*   9   19:ifeq            25
	//*  10   22:goto            78
		{
			final CrashPromptDialog dialog = ((CrashPromptDialog) (new CrashPromptDialog.AlwaysSendCallback() {

				public void sendUserReportsWithoutPrompting(boolean flag)
				{
					preferenceManager.setShouldAlwaysSendReports(flag);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field CrashlyticsController$PrivacyDialogCheck this$0>
				//    2    4:invokestatic    #30  <Method PreferenceManager CrashlyticsController$PrivacyDialogCheck.access$2100(CrashlyticsController$PrivacyDialogCheck)>
				//    3    7:iload_1         
				//    4    8:invokevirtual   #35  <Method void PreferenceManager.setShouldAlwaysSendReports(boolean)>
				//    5   11:return          
				}

				final CrashlyticsController.PrivacyDialogCheck this$0;

			
			{
				this$0 = CrashlyticsController.PrivacyDialogCheck.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CrashlyticsController$PrivacyDialogCheck this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
			}
));
	//   11   25:new             #11  <Class CrashlyticsController$PrivacyDialogCheck$1>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:invokespecial   #55  <Method void CrashlyticsController$PrivacyDialogCheck$1(CrashlyticsController$PrivacyDialogCheck)>
	//   15   33:astore_2        
			dialog = CrashPromptDialog.create(activity, promptData, ((CrashPromptDialog.AlwaysSendCallback) (dialog)));
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:getfield        #30  <Field o promptData>
	//   19   39:aload_2         
	//   20   40:invokestatic    #61  <Method CrashPromptDialog CrashPromptDialog.create(Activity, o, CrashPromptDialog$AlwaysSendCallback)>
	//   21   43:astore_2        
			activity.runOnUiThread(new Runnable() {

				public void run()
				{
					dialog.show();
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field CrashPromptDialog val$dialog>
				//    2    4:invokevirtual   #34  <Method void CrashPromptDialog.show()>
				//    3    7:return          
				}

				final CrashlyticsController.PrivacyDialogCheck this$0;
				final CrashPromptDialog val$dialog;

			
			{
				this$0 = CrashlyticsController.PrivacyDialogCheck.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field CrashlyticsController$PrivacyDialogCheck this$0>
				dialog = crashpromptdialog;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field CrashPromptDialog val$dialog>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   22   44:aload_1         
	//   23   45:new             #13  <Class CrashlyticsController$PrivacyDialogCheck$2>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:aload_2         
	//   27   51:invokespecial   #64  <Method void CrashlyticsController$PrivacyDialogCheck$2(CrashlyticsController$PrivacyDialogCheck, CrashPromptDialog)>
	//   28   54:invokevirtual   #68  <Method void Activity.runOnUiThread(Runnable)>
			c.g().a("CrashlyticsCore", "Waiting for user opt-in.");
	//   29   57:invokestatic    #72  <Method l c.g()>
	//   30   60:ldc1            #74  <String "CrashlyticsCore">
	//   31   62:ldc1            #76  <String "Waiting for user opt-in.">
	//   32   64:invokeinterface #82  <Method void l.a(String, String)>
			dialog.await();
	//   33   69:aload_2         
	//   34   70:invokevirtual   #85  <Method void CrashPromptDialog.await()>
			return dialog.getOptIn();
	//   35   73:aload_2         
	//   36   74:invokevirtual   #88  <Method boolean CrashPromptDialog.getOptIn()>
	//   37   77:ireturn         
		} else
		{
			return true;
	//   38   78:iconst_1        
	//   39   79:ireturn         
		}
	}

	private final i kit;
	private final PreferenceManager preferenceManager;
	private final o promptData;


/*
	static PreferenceManager access$2100(CrashlyticsController$PrivacyDialogCheck crashlyticscontroller$privacydialogcheck)
	{
		return crashlyticscontroller$privacydialogcheck.preferenceManager;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field PreferenceManager preferenceManager>
	//    2    4:areturn         
	}

*/

	public CrashlyticsController$PrivacyDialogCheck(i j, PreferenceManager preferencemanager, o o)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		kit = j;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field i kit>
		preferenceManager = preferencemanager;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field PreferenceManager preferenceManager>
		promptData = o;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field o promptData>
	//   11   19:return          
	}
}
