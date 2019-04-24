// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.TextView;
import com.pactforcure.app.api.SimpleCallback;
import com.pactforcure.app.studies.Res;

// Referenced classes of package com.pactforcure.app.ui:
//			SettingsActivity, SelectStudyActivity

class SettingsActivity$3
	implements SimpleCallback
{

	static void lambda$onError$50(View view)
	{
	//    0    0:return          
	}

	public void onError(String s)
	{
		val$progressDialog.dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ProgressDialog val$progressDialog>
	//    2    4:invokevirtual   #34  <Method void ProgressDialog.dismiss()>
		class .Lambda._cls1
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$()
			{
				return ((android.view.View.OnClickListener) (instance));
			//    0    0:getstatic       #15  <Field SettingsActivity$3$$Lambda$1 instance>
			//    1    3:areturn         
			}

			public void onClick(View view)
			{
				SettingsActivity._cls3.lambda$onError$50(view);
			//    0    0:aload_1         
			//    1    1:invokestatic    #26  <Method void SettingsActivity$3.lambda$onError$50(View)>
			//    2    4:return          
			}

			private static final .Lambda._cls1 instance = new .Lambda._cls1();

			static 
			{
			//    0    0:new             #2   <Class SettingsActivity$3$$Lambda$1>
			//    1    3:dup             
			//    2    4:invokespecial   #13  <Method void SettingsActivity$3$$Lambda$1()>
			//    3    7:putstatic       #15  <Field SettingsActivity$3$$Lambda$1 instance>
			//*   4   10:return          
			}

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #17  <Method void Object()>
			//    2    4:return          
			}
		}

		s = ((String) (Snackbar.make(findViewById(0x7f0e00f7), ((CharSequence) (Res.getStudySpecificString(0x7f0802a0))), -2).setAction(0x7f080320, .Lambda._cls1.lambdaFactory.()).setActionTextColor(getResources().getColor(0x106000b))));
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field SettingsActivity this$0>
	//    5   11:ldc1            #35  <Int 0x7f0e00f7>
	//    6   13:invokevirtual   #39  <Method View SettingsActivity.findViewById(int)>
	//    7   16:ldc1            #40  <Int 0x7f0802a0>
	//    8   18:invokestatic    #46  <Method String Res.getStudySpecificString(int)>
	//    9   21:bipush          -2
	//   10   23:invokestatic    #52  <Method Snackbar Snackbar.make(View, CharSequence, int)>
	//   11   26:ldc1            #53  <Int 0x7f080320>
	//   12   28:invokestatic    #59  <Method android.view.View$OnClickListener SettingsActivity$3$$Lambda$1.lambdaFactory$()>
	//   13   31:invokevirtual   #63  <Method Snackbar Snackbar.setAction(int, android.view.View$OnClickListener)>
	//   14   34:aload_0         
	//   15   35:getfield        #19  <Field SettingsActivity this$0>
	//   16   38:invokevirtual   #67  <Method Resources SettingsActivity.getResources()>
	//   17   41:ldc1            #68  <Int 0x106000b>
	//   18   43:invokevirtual   #74  <Method int Resources.getColor(int)>
	//   19   46:invokevirtual   #78  <Method Snackbar Snackbar.setActionTextColor(int)>
	//   20   49:astore_1        
		((TextView)((Snackbar) (s)).getView().findViewById(0x7f0e011a)).setMaxLines(3);
	//   21   50:aload_1         
	//   22   51:invokevirtual   #82  <Method View Snackbar.getView()>
	//   23   54:ldc1            #83  <Int 0x7f0e011a>
	//   24   56:invokevirtual   #86  <Method View View.findViewById(int)>
	//   25   59:checkcast       #88  <Class TextView>
	//   26   62:iconst_3        
	//   27   63:invokevirtual   #92  <Method void TextView.setMaxLines(int)>
		((Snackbar) (s)).show();
	//   28   66:aload_1         
	//   29   67:invokevirtual   #95  <Method void Snackbar.show()>
	//   30   70:return          
	}

	public void onSuccess()
	{
		val$progressDialog.dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ProgressDialog val$progressDialog>
	//    2    4:invokevirtual   #34  <Method void ProgressDialog.dismiss()>
		SettingsActivity.access$100(SettingsActivity.this, true);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field SettingsActivity this$0>
	//    5   11:iconst_1        
	//    6   12:invokestatic    #101 <Method void SettingsActivity.access$100(SettingsActivity, boolean)>
		Intent intent = new Intent(((android.content.Context) (SettingsActivity.this)), com/pactforcure/app/ui/SelectStudyActivity);
	//    7   15:new             #103 <Class Intent>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:getfield        #19  <Field SettingsActivity this$0>
	//   11   23:ldc1            #105 <Class SelectStudyActivity>
	//   12   25:invokespecial   #108 <Method void Intent(android.content.Context, Class)>
	//   13   28:astore_1        
		intent.setFlags(0x10008000);
	//   14   29:aload_1         
	//   15   30:ldc1            #109 <Int 0x10008000>
	//   16   32:invokevirtual   #113 <Method Intent Intent.setFlags(int)>
	//   17   35:pop             
		startActivity(intent);
	//   18   36:aload_0         
	//   19   37:getfield        #19  <Field SettingsActivity this$0>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #117 <Method void SettingsActivity.startActivity(Intent)>
	//   22   44:return          
	}

	final SettingsActivity this$0;
	final ProgressDialog val$progressDialog;

	SettingsActivity$3()
	{
		this$0 = final_settingsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field SettingsActivity this$0>
		val$progressDialog = ProgressDialog.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ProgressDialog val$progressDialog>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
