// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.app.ProgressDialog;
import android.content.*;
import android.content.res.Resources;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.*;
import android.support.v7.widget.SwitchCompat;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.pactforcure.app.api.SimpleCallback;
import com.pactforcure.app.api.dto.*;
import com.pactforcure.app.core.message.SurveyUploadedMessage;
import com.pactforcure.app.databinding.ActivitySettingsBinding;
import com.pactforcure.app.participant.*;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.studies.StudyId;
import com.pactforcure.app.survey.PpdResultsStorage;
import com.pactforcure.app.survey.SurveyStorage;
import com.pactforcure.app.util.DialogUtils;
import com.pactforcure.app.util.StringUtils;
import org.greenrobot.eventbus.EventBus;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

// Referenced classes of package com.pactforcure.app.ui:
//			LogoutSuccessActivity, SelectStudyActivity

public class SettingsActivity extends AppCompatActivity
{

	public SettingsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void AppCompatActivity()>
		class .Lambda._cls1
			implements android.widget.CompoundButton.OnCheckedChangeListener
		{

			public static android.widget.CompoundButton.OnCheckedChangeListener lambdaFactory$(SettingsActivity settingsactivity)
			{
				return ((android.widget.CompoundButton.OnCheckedChangeListener) (((.Lambda._cls1) (settingsactivity)). new .Lambda._cls1()));
			//    0    0:new             #2   <Class SettingsActivity$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void SettingsActivity$$Lambda$1(SettingsActivity)>
			//    4    8:areturn         
			}

			public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
			{
				SettingsActivity.lambda$new$47(arg$1, compoundbutton, flag);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SettingsActivity arg$1>
			//    2    4:aload_1         
			//    3    5:iload_2         
			//    4    6:invokestatic    #28  <Method void SettingsActivity.lambda$new$47(SettingsActivity, CompoundButton, boolean)>
			//    5    9:return          
			}

			private final SettingsActivity arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SettingsActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SettingsActivity arg$1>
			//    5    9:return          
			}
		}

	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokestatic    #26  <Method android.widget.CompoundButton$OnCheckedChangeListener SettingsActivity$$Lambda$1.lambdaFactory$(SettingsActivity)>
	//    5    9:putfield        #28  <Field android.widget.CompoundButton$OnCheckedChangeListener onOptOutChangedListener>
	//    6   12:return          
	}

	private void clearLocalData(boolean flag)
	{
		ParticipantStorage.clear();
	//    0    0:invokestatic    #48  <Method void ParticipantStorage.clear()>
		SurveyStorage.clear(flag);
	//    1    3:iload_1         
	//    2    4:invokestatic    #52  <Method void SurveyStorage.clear(boolean)>
		PpdResultsStorage.clear();
	//    3    7:invokestatic    #55  <Method void PpdResultsStorage.clear()>
	//    4   10:return          
	}

	static void lambda$mayLogout$48(SettingsActivity settingsactivity, DialogInterface dialoginterface, int i)
	{
		settingsactivity.logout();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void logout()>
	//    2    4:return          
	}

	static void lambda$new$47(SettingsActivity settingsactivity, CompoundButton compoundbutton, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            10
		{
			settingsactivity.optOutOrIn(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #65  <Method void optOutOrIn(boolean)>
			return;
	//    5    9:return          
		} else
		{
			class .Lambda._cls6
				implements android.content.DialogInterface.OnClickListener
			{

				public static android.content.DialogInterface.OnClickListener lambdaFactory$(SettingsActivity settingsactivity1)
				{
					return ((android.content.DialogInterface.OnClickListener) (((.Lambda._cls6) (settingsactivity1)). new .Lambda._cls6()));
				//    0    0:new             #2   <Class SettingsActivity$$Lambda$6>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:invokespecial   #20  <Method void SettingsActivity$$Lambda$6(SettingsActivity)>
				//    4    8:areturn         
				}

				public void onClick(DialogInterface dialoginterface, int i)
				{
					SettingsActivity.lambda$null$45(arg$1, dialoginterface, i);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field SettingsActivity arg$1>
				//    2    4:aload_1         
				//    3    5:iload_2         
				//    4    6:invokestatic    #28  <Method void SettingsActivity.lambda$null$45(SettingsActivity, DialogInterface, int)>
				//    5    9:return          
				}

				private final SettingsActivity arg$1;

			private .Lambda._cls6()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SettingsActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SettingsActivity arg$1>
			//    5    9:return          
			}
			}

			class .Lambda._cls7
				implements android.content.DialogInterface.OnClickListener
			{

				public static android.content.DialogInterface.OnClickListener lambdaFactory$(SettingsActivity settingsactivity1)
				{
					return ((android.content.DialogInterface.OnClickListener) (((.Lambda._cls7) (settingsactivity1)). new .Lambda._cls7()));
				//    0    0:new             #2   <Class SettingsActivity$$Lambda$7>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:invokespecial   #20  <Method void SettingsActivity$$Lambda$7(SettingsActivity)>
				//    4    8:areturn         
				}

				public void onClick(DialogInterface dialoginterface, int i)
				{
					SettingsActivity.lambda$null$46(arg$1, dialoginterface, i);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field SettingsActivity arg$1>
				//    2    4:aload_1         
				//    3    5:iload_2         
				//    4    6:invokestatic    #28  <Method void SettingsActivity.lambda$null$46(SettingsActivity, DialogInterface, int)>
				//    5    9:return          
				}

				private final SettingsActivity arg$1;

			private .Lambda._cls7()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SettingsActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SettingsActivity arg$1>
			//    5    9:return          
			}
			}

			settingsactivity = ((SettingsActivity) ((new android.support.v7.app.AlertDialog.Builder(((Context) (settingsactivity)))).setTitle(((CharSequence) (Res.getStudySpecificString(0x7f0802b3)))).setMessage(((CharSequence) (Res.getStudySpecificString(0x7f0802b4)))).setCancelable(false).setNegativeButton(0x7f080055, .Lambda._cls6.lambdaFactory.(settingsactivity)).setPositiveButton(((CharSequence) (Res.getStudySpecificString(0x7f0802b3))), .Lambda._cls7.lambdaFactory.(settingsactivity)).create()));
	//    6   10:new             #67  <Class android.support.v7.app.AlertDialog$Builder>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #70  <Method void android.support.v7.app.AlertDialog$Builder(Context)>
	//   10   18:ldc1            #71  <Int 0x7f0802b3>
	//   11   20:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   12   23:invokevirtual   #81  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   13   26:ldc1            #82  <Int 0x7f0802b4>
	//   14   28:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   15   31:invokevirtual   #85  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   16   34:iconst_0        
	//   17   35:invokevirtual   #89  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setCancelable(boolean)>
	//   18   38:ldc1            #90  <Int 0x7f080055>
	//   19   40:aload_0         
	//   20   41:invokestatic    #95  <Method android.content.DialogInterface$OnClickListener SettingsActivity$$Lambda$6.lambdaFactory$(SettingsActivity)>
	//   21   44:invokevirtual   #99  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   22   47:ldc1            #71  <Int 0x7f0802b3>
	//   23   49:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   24   52:aload_0         
	//   25   53:invokestatic    #102 <Method android.content.DialogInterface$OnClickListener SettingsActivity$$Lambda$7.lambdaFactory$(SettingsActivity)>
	//   26   56:invokevirtual   #106 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   27   59:invokevirtual   #110 <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   28   62:astore_0        
			DialogUtils.boldPositiveAndNegativeButtons(((AlertDialog) (settingsactivity)));
	//   29   63:aload_0         
	//   30   64:invokestatic    #116 <Method void DialogUtils.boldPositiveAndNegativeButtons(AlertDialog)>
			((AlertDialog) (settingsactivity)).show();
	//   31   67:aload_0         
	//   32   68:invokevirtual   #121 <Method void AlertDialog.show()>
			return;
	//   33   71:return          
		}
	}

	static void lambda$null$41(SettingsActivity settingsactivity, DialogInterface dialoginterface, int i)
	{
		settingsactivity.leavePact();
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void leavePact()>
	//    2    4:return          
	}

	static void lambda$null$43(SettingsActivity settingsactivity, DialogInterface dialoginterface, int i)
	{
		settingsactivity.leaveDna();
	//    0    0:aload_0         
	//    1    1:invokespecial   #129 <Method void leaveDna()>
	//    2    4:return          
	}

	static void lambda$null$45(SettingsActivity settingsactivity, DialogInterface dialoginterface, int i)
	{
		settingsactivity.setOptOutCheckWithoutTrigger(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #35  <Method void setOptOutCheckWithoutTrigger(boolean)>
	//    3    5:return          
	}

	static void lambda$null$46(SettingsActivity settingsactivity, DialogInterface dialoginterface, int i)
	{
		settingsactivity.optOutOrIn(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #65  <Method void optOutOrIn(boolean)>
	//    3    5:return          
	}

	static void lambda$onCreate$40(SettingsActivity settingsactivity, View view)
	{
		settingsactivity.mayLogout();
	//    0    0:aload_0         
	//    1    1:invokespecial   #136 <Method void mayLogout()>
	//    2    4:return          
	}

	static void lambda$onCreate$42(SettingsActivity settingsactivity, View view)
	{
		class .Lambda._cls9
			implements android.content.DialogInterface.OnClickListener
		{

			public static android.content.DialogInterface.OnClickListener lambdaFactory$(SettingsActivity settingsactivity1)
			{
				return ((android.content.DialogInterface.OnClickListener) (((.Lambda._cls9) (settingsactivity1)). new .Lambda._cls9()));
			//    0    0:new             #2   <Class SettingsActivity$$Lambda$9>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void SettingsActivity$$Lambda$9(SettingsActivity)>
			//    4    8:areturn         
			}

			public void onClick(DialogInterface dialoginterface, int i)
			{
				SettingsActivity.lambda$null$41(arg$1, dialoginterface, i);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SettingsActivity arg$1>
			//    2    4:aload_1         
			//    3    5:iload_2         
			//    4    6:invokestatic    #28  <Method void SettingsActivity.lambda$null$41(SettingsActivity, DialogInterface, int)>
			//    5    9:return          
			}

			private final SettingsActivity arg$1;

			private .Lambda._cls9()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SettingsActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SettingsActivity arg$1>
			//    5    9:return          
			}
		}

		settingsactivity = ((SettingsActivity) ((new android.support.v7.app.AlertDialog.Builder(((Context) (settingsactivity)))).setTitle(((CharSequence) (Res.getStudySpecificString(0x7f08029f)))).setMessage(((CharSequence) (Res.getStudySpecificString(0x7f0802a1)))).setNegativeButton(0x7f080055, ((android.content.DialogInterface.OnClickListener) (null))).setPositiveButton(((CharSequence) (Res.getStudySpecificString(0x7f080377))), .Lambda._cls9.lambdaFactory.(settingsactivity)).create()));
	//    0    0:new             #67  <Class android.support.v7.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #70  <Method void android.support.v7.app.AlertDialog$Builder(Context)>
	//    4    8:ldc1            #138 <Int 0x7f08029f>
	//    5   10:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//    6   13:invokevirtual   #81  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(CharSequence)>
	//    7   16:ldc1            #139 <Int 0x7f0802a1>
	//    8   18:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//    9   21:invokevirtual   #85  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   10   24:ldc1            #90  <Int 0x7f080055>
	//   11   26:aconst_null     
	//   12   27:invokevirtual   #99  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   13   30:ldc1            #140 <Int 0x7f080377>
	//   14   32:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   15   35:aload_0         
	//   16   36:invokestatic    #143 <Method android.content.DialogInterface$OnClickListener SettingsActivity$$Lambda$9.lambdaFactory$(SettingsActivity)>
	//   17   39:invokevirtual   #106 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   18   42:invokevirtual   #110 <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   19   45:astore_0        
		DialogUtils.boldPositiveAndNegativeButtons(((AlertDialog) (settingsactivity)));
	//   20   46:aload_0         
	//   21   47:invokestatic    #116 <Method void DialogUtils.boldPositiveAndNegativeButtons(AlertDialog)>
		((AlertDialog) (settingsactivity)).show();
	//   22   50:aload_0         
	//   23   51:invokevirtual   #121 <Method void AlertDialog.show()>
	//   24   54:return          
	}

	static void lambda$onCreate$44(SettingsActivity settingsactivity, View view)
	{
		class .Lambda._cls8
			implements android.content.DialogInterface.OnClickListener
		{

			public static android.content.DialogInterface.OnClickListener lambdaFactory$(SettingsActivity settingsactivity1)
			{
				return ((android.content.DialogInterface.OnClickListener) (((.Lambda._cls8) (settingsactivity1)). new .Lambda._cls8()));
			//    0    0:new             #2   <Class SettingsActivity$$Lambda$8>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void SettingsActivity$$Lambda$8(SettingsActivity)>
			//    4    8:areturn         
			}

			public void onClick(DialogInterface dialoginterface, int i)
			{
				SettingsActivity.lambda$null$43(arg$1, dialoginterface, i);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SettingsActivity arg$1>
			//    2    4:aload_1         
			//    3    5:iload_2         
			//    4    6:invokestatic    #28  <Method void SettingsActivity.lambda$null$43(SettingsActivity, DialogInterface, int)>
			//    5    9:return          
			}

			private final SettingsActivity arg$1;

			private .Lambda._cls8()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SettingsActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SettingsActivity arg$1>
			//    5    9:return          
			}
		}

		settingsactivity = ((SettingsActivity) ((new android.support.v7.app.AlertDialog.Builder(((Context) (settingsactivity)))).setTitle(((CharSequence) (Res.getStudySpecificString(0x7f08029e)))).setMessage(((CharSequence) (Res.getStudySpecificString(0x7f08029d)))).setNegativeButton(0x7f080055, ((android.content.DialogInterface.OnClickListener) (null))).setPositiveButton(((CharSequence) (Res.getStudySpecificString(0x7f080377))), .Lambda._cls8.lambdaFactory.(settingsactivity)).create()));
	//    0    0:new             #67  <Class android.support.v7.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #70  <Method void android.support.v7.app.AlertDialog$Builder(Context)>
	//    4    8:ldc1            #145 <Int 0x7f08029e>
	//    5   10:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//    6   13:invokevirtual   #81  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(CharSequence)>
	//    7   16:ldc1            #146 <Int 0x7f08029d>
	//    8   18:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//    9   21:invokevirtual   #85  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   10   24:ldc1            #90  <Int 0x7f080055>
	//   11   26:aconst_null     
	//   12   27:invokevirtual   #99  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   13   30:ldc1            #140 <Int 0x7f080377>
	//   14   32:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   15   35:aload_0         
	//   16   36:invokestatic    #149 <Method android.content.DialogInterface$OnClickListener SettingsActivity$$Lambda$8.lambdaFactory$(SettingsActivity)>
	//   17   39:invokevirtual   #106 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   18   42:invokevirtual   #110 <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   19   45:astore_0        
		DialogUtils.boldPositiveAndNegativeButtons(((AlertDialog) (settingsactivity)));
	//   20   46:aload_0         
	//   21   47:invokestatic    #116 <Method void DialogUtils.boldPositiveAndNegativeButtons(AlertDialog)>
		((AlertDialog) (settingsactivity)).show();
	//   22   50:aload_0         
	//   23   51:invokevirtual   #121 <Method void AlertDialog.show()>
	//   24   54:return          
	}

	private void leaveDna()
	{
		final ProgressDialog progressDialog = ProgressDialog.show(((Context) (this)), ((CharSequence) (Res.getStudySpecificString(0x7f080377))), ((CharSequence) (Res.getStudySpecificString(0x7f0802e5))), true);
	//    0    0:aload_0         
	//    1    1:ldc1            #140 <Int 0x7f080377>
	//    2    3:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//    3    6:ldc1            #150 <Int 0x7f0802e5>
	//    4    8:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//    5   11:iconst_1        
	//    6   12:invokestatic    #155 <Method ProgressDialog ProgressDialog.show(Context, CharSequence, CharSequence, boolean)>
	//    7   15:astore_1        
		progressDialog.show();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #156 <Method void ProgressDialog.show()>
		(new ParticipantServerAgent()).leaveDna(new DtoCallback() {

			static void lambda$onError$51(View view)
			{
			//    0    0:return          
			}

			public void onError(CodeDescriptionError codedescriptionerror)
			{
				progressDialog.dismiss();
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field ProgressDialog val$progressDialog>
			//    2    4:invokevirtual   #34  <Method void ProgressDialog.dismiss()>
				class .Lambda._cls1
					implements android.view.View.OnClickListener
				{

					public static android.view.View.OnClickListener lambdaFactory$()
					{
						return ((android.view.View.OnClickListener) (instance));
					//    0    0:getstatic       #15  <Field SettingsActivity$4$$Lambda$1 instance>
					//    1    3:areturn         
					}

					public void onClick(View view)
					{
						_cls4.lambda.onError._mth51(view);
					//    0    0:aload_1         
					//    1    1:invokestatic    #26  <Method void SettingsActivity$4.lambda$onError$51(View)>
					//    2    4:return          
					}

					private static final .Lambda._cls1 instance = new .Lambda._cls1();

					static 
					{
					//    0    0:new             #2   <Class SettingsActivity$4$$Lambda$1>
					//    1    3:dup             
					//    2    4:invokespecial   #13  <Method void SettingsActivity$4$$Lambda$1()>
					//    3    7:putstatic       #15  <Field SettingsActivity$4$$Lambda$1 instance>
					//*   4   10:return          
					}

						private .Lambda._cls1()
						{
						//    0    0:aload_0         
						//    1    1:invokespecial   #17  <Method void Object()>
						//    2    4:return          
						}
				}

				codedescriptionerror = ((CodeDescriptionError) (Snackbar.make(findViewById(0x7f0e00f7), ((CharSequence) (Res.getStudySpecificString(0x7f08029c))), -2).setAction(0x7f080320, .Lambda._cls1.lambdaFactory.()).setActionTextColor(getResources().getColor(0x106000b))));
			//    3    7:aload_0         
			//    4    8:getfield        #20  <Field SettingsActivity this$0>
			//    5   11:ldc1            #35  <Int 0x7f0e00f7>
			//    6   13:invokevirtual   #39  <Method View SettingsActivity.findViewById(int)>
			//    7   16:ldc1            #40  <Int 0x7f08029c>
			//    8   18:invokestatic    #46  <Method String Res.getStudySpecificString(int)>
			//    9   21:bipush          -2
			//   10   23:invokestatic    #52  <Method Snackbar Snackbar.make(View, CharSequence, int)>
			//   11   26:ldc1            #53  <Int 0x7f080320>
			//   12   28:invokestatic    #59  <Method android.view.View$OnClickListener SettingsActivity$4$$Lambda$1.lambdaFactory$()>
			//   13   31:invokevirtual   #63  <Method Snackbar Snackbar.setAction(int, android.view.View$OnClickListener)>
			//   14   34:aload_0         
			//   15   35:getfield        #20  <Field SettingsActivity this$0>
			//   16   38:invokevirtual   #67  <Method Resources SettingsActivity.getResources()>
			//   17   41:ldc1            #68  <Int 0x106000b>
			//   18   43:invokevirtual   #74  <Method int Resources.getColor(int)>
			//   19   46:invokevirtual   #78  <Method Snackbar Snackbar.setActionTextColor(int)>
			//   20   49:astore_1        
				((TextView)((Snackbar) (codedescriptionerror)).getView().findViewById(0x7f0e011a)).setMaxLines(3);
			//   21   50:aload_1         
			//   22   51:invokevirtual   #82  <Method View Snackbar.getView()>
			//   23   54:ldc1            #83  <Int 0x7f0e011a>
			//   24   56:invokevirtual   #86  <Method View View.findViewById(int)>
			//   25   59:checkcast       #88  <Class TextView>
			//   26   62:iconst_3        
			//   27   63:invokevirtual   #92  <Method void TextView.setMaxLines(int)>
				((Snackbar) (codedescriptionerror)).show();
			//   28   66:aload_1         
			//   29   67:invokevirtual   #95  <Method void Snackbar.show()>
			//   30   70:return          
			}

			public void onSuccess(BaseDto basedto)
			{
				progressDialog.dismiss();
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field ProgressDialog val$progressDialog>
			//    2    4:invokevirtual   #34  <Method void ProgressDialog.dismiss()>
				basedto = ((BaseDto) (ParticipantStorage.getParticipant()));
			//    3    7:invokestatic    #103 <Method Participant ParticipantStorage.getParticipant()>
			//    4   10:astore_1        
				((Participant) (basedto)).setDNAregistered(false);
			//    5   11:aload_1         
			//    6   12:iconst_0        
			//    7   13:invokevirtual   #109 <Method void Participant.setDNAregistered(boolean)>
				((Participant) (basedto)).save();
			//    8   16:aload_1         
			//    9   17:invokevirtual   #112 <Method void Participant.save()>
				PpdResultsStorage.setGivenDnaConsent(Res.getStudyId(), false);
			//   10   20:invokestatic    #116 <Method StudyId Res.getStudyId()>
			//   11   23:iconst_0        
			//   12   24:invokestatic    #122 <Method void PpdResultsStorage.setGivenDnaConsent(StudyId, boolean)>
				PpdResultsStorage.setSentDnaKitBack(Res.getStudyId(), false);
			//   13   27:invokestatic    #116 <Method StudyId Res.getStudyId()>
			//   14   30:iconst_0        
			//   15   31:invokestatic    #125 <Method void PpdResultsStorage.setSentDnaKitBack(StudyId, boolean)>
				binding.leaveDnaTitle.setVisibility(8);
			//   16   34:aload_0         
			//   17   35:getfield        #20  <Field SettingsActivity this$0>
			//   18   38:invokestatic    #129 <Method ActivitySettingsBinding SettingsActivity.access$200(SettingsActivity)>
			//   19   41:getfield        #135 <Field TextView ActivitySettingsBinding.leaveDnaTitle>
			//   20   44:bipush          8
			//   21   46:invokevirtual   #138 <Method void TextView.setVisibility(int)>
				binding.leaveDnaExplanation.setVisibility(8);
			//   22   49:aload_0         
			//   23   50:getfield        #20  <Field SettingsActivity this$0>
			//   24   53:invokestatic    #129 <Method ActivitySettingsBinding SettingsActivity.access$200(SettingsActivity)>
			//   25   56:getfield        #141 <Field TextView ActivitySettingsBinding.leaveDnaExplanation>
			//   26   59:bipush          8
			//   27   61:invokevirtual   #138 <Method void TextView.setVisibility(int)>
				binding.leaveDnaBtn.setVisibility(8);
			//   28   64:aload_0         
			//   29   65:getfield        #20  <Field SettingsActivity this$0>
			//   30   68:invokestatic    #129 <Method ActivitySettingsBinding SettingsActivity.access$200(SettingsActivity)>
			//   31   71:getfield        #144 <Field TextView ActivitySettingsBinding.leaveDnaBtn>
			//   32   74:bipush          8
			//   33   76:invokevirtual   #138 <Method void TextView.setVisibility(int)>
				binding.addressTitle.setVisibility(8);
			//   34   79:aload_0         
			//   35   80:getfield        #20  <Field SettingsActivity this$0>
			//   36   83:invokestatic    #129 <Method ActivitySettingsBinding SettingsActivity.access$200(SettingsActivity)>
			//   37   86:getfield        #147 <Field TextView ActivitySettingsBinding.addressTitle>
			//   38   89:bipush          8
			//   39   91:invokevirtual   #138 <Method void TextView.setVisibility(int)>
				binding.addressView.setVisibility(8);
			//   40   94:aload_0         
			//   41   95:getfield        #20  <Field SettingsActivity this$0>
			//   42   98:invokestatic    #129 <Method ActivitySettingsBinding SettingsActivity.access$200(SettingsActivity)>
			//   43  101:getfield        #150 <Field TextView ActivitySettingsBinding.addressView>
			//   44  104:bipush          8
			//   45  106:invokevirtual   #138 <Method void TextView.setVisibility(int)>
				binding.addressChangeMail.setVisibility(8);
			//   46  109:aload_0         
			//   47  110:getfield        #20  <Field SettingsActivity this$0>
			//   48  113:invokestatic    #129 <Method ActivitySettingsBinding SettingsActivity.access$200(SettingsActivity)>
			//   49  116:getfield        #153 <Field TextView ActivitySettingsBinding.addressChangeMail>
			//   50  119:bipush          8
			//   51  121:invokevirtual   #138 <Method void TextView.setVisibility(int)>
				EventBus.getDefault().postSticky(((Object) (new SurveyUploadedMessage())));
			//   52  124:invokestatic    #159 <Method EventBus EventBus.getDefault()>
			//   53  127:new             #161 <Class SurveyUploadedMessage>
			//   54  130:dup             
			//   55  131:invokespecial   #162 <Method void SurveyUploadedMessage()>
			//   56  134:invokevirtual   #166 <Method void EventBus.postSticky(Object)>
			//   57  137:return          
			}

			public volatile void onSuccess(Object obj)
			{
				onSuccess((BaseDto)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #168 <Class BaseDto>
			//    3    5:invokevirtual   #170 <Method void onSuccess(BaseDto)>
			//    4    8:return          
			}

			final SettingsActivity this$0;
			final ProgressDialog val$progressDialog;

			
			{
				this$0 = SettingsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field SettingsActivity this$0>
				progressDialog = progressdialog;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field ProgressDialog val$progressDialog>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   10   20:new             #158 <Class ParticipantServerAgent>
	//   11   23:dup             
	//   12   24:invokespecial   #159 <Method void ParticipantServerAgent()>
	//   13   27:new             #12  <Class SettingsActivity$4>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #162 <Method void SettingsActivity$4(SettingsActivity, ProgressDialog)>
	//   18   36:invokevirtual   #165 <Method void ParticipantServerAgent.leaveDna(DtoCallback)>
	//   19   39:return          
	}

	private void leavePact()
	{
		final ProgressDialog progressDialog = ProgressDialog.show(((Context) (this)), ((CharSequence) (Res.getStudySpecificString(0x7f080377))), ((CharSequence) (Res.getStudySpecificString(0x7f0802e5))), true);
	//    0    0:aload_0         
	//    1    1:ldc1            #140 <Int 0x7f080377>
	//    2    3:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//    3    6:ldc1            #150 <Int 0x7f0802e5>
	//    4    8:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//    5   11:iconst_1        
	//    6   12:invokestatic    #155 <Method ProgressDialog ProgressDialog.show(Context, CharSequence, CharSequence, boolean)>
	//    7   15:astore_1        
		progressDialog.show();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #156 <Method void ProgressDialog.show()>
		(new ParticipantServerAgent()).withdraw(new SimpleCallback() {

			static void lambda$onError$50(View view)
			{
			//    0    0:return          
			}

			public void onError(String s)
			{
				progressDialog.dismiss();
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
						_cls3.lambda.onError._mth50(view);
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
				progressDialog.dismiss();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field ProgressDialog val$progressDialog>
			//    2    4:invokevirtual   #34  <Method void ProgressDialog.dismiss()>
				clearLocalData(true);
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field SettingsActivity this$0>
			//    5   11:iconst_1        
			//    6   12:invokestatic    #101 <Method void SettingsActivity.access$100(SettingsActivity, boolean)>
				Intent intent = new Intent(((Context) (SettingsActivity.this)), com/pactforcure/app/ui/SelectStudyActivity);
			//    7   15:new             #103 <Class Intent>
			//    8   18:dup             
			//    9   19:aload_0         
			//   10   20:getfield        #19  <Field SettingsActivity this$0>
			//   11   23:ldc1            #105 <Class SelectStudyActivity>
			//   12   25:invokespecial   #108 <Method void Intent(Context, Class)>
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

			
			{
				this$0 = SettingsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field SettingsActivity this$0>
				progressDialog = progressdialog;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ProgressDialog val$progressDialog>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   10   20:new             #158 <Class ParticipantServerAgent>
	//   11   23:dup             
	//   12   24:invokespecial   #159 <Method void ParticipantServerAgent()>
	//   13   27:new             #10  <Class SettingsActivity$3>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #166 <Method void SettingsActivity$3(SettingsActivity, ProgressDialog)>
	//   18   36:invokevirtual   #170 <Method void ParticipantServerAgent.withdraw(SimpleCallback)>
	//   19   39:return          
	}

	private void logout()
	{
		final ProgressDialog progressDialog = ProgressDialog.show(((Context) (this)), ((CharSequence) (Res.getStudySpecificString(0x7f0802a5))), ((CharSequence) (Res.getStudySpecificString(0x7f0802e5))), true);
	//    0    0:aload_0         
	//    1    1:ldc1            #171 <Int 0x7f0802a5>
	//    2    3:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//    3    6:ldc1            #150 <Int 0x7f0802e5>
	//    4    8:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//    5   11:iconst_1        
	//    6   12:invokestatic    #155 <Method ProgressDialog ProgressDialog.show(Context, CharSequence, CharSequence, boolean)>
	//    7   15:astore_1        
		progressDialog.show();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #156 <Method void ProgressDialog.show()>
		(new ParticipantServerAgent()).logout(new SimpleCallback() {

			static void lambda$onError$49(View view)
			{
			//    0    0:return          
			}

			public void onError(String s)
			{
				progressDialog.dismiss();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field ProgressDialog val$progressDialog>
			//    2    4:invokevirtual   #34  <Method void ProgressDialog.dismiss()>
				class .Lambda._cls1
					implements android.view.View.OnClickListener
				{

					public static android.view.View.OnClickListener lambdaFactory$()
					{
						return ((android.view.View.OnClickListener) (instance));
					//    0    0:getstatic       #15  <Field SettingsActivity$2$$Lambda$1 instance>
					//    1    3:areturn         
					}

					public void onClick(View view)
					{
						_cls2.lambda.onError._mth49(view);
					//    0    0:aload_1         
					//    1    1:invokestatic    #26  <Method void SettingsActivity$2.lambda$onError$49(View)>
					//    2    4:return          
					}

					private static final .Lambda._cls1 instance = new .Lambda._cls1();

					static 
					{
					//    0    0:new             #2   <Class SettingsActivity$2$$Lambda$1>
					//    1    3:dup             
					//    2    4:invokespecial   #13  <Method void SettingsActivity$2$$Lambda$1()>
					//    3    7:putstatic       #15  <Field SettingsActivity$2$$Lambda$1 instance>
					//*   4   10:return          
					}

						private .Lambda._cls1()
						{
						//    0    0:aload_0         
						//    1    1:invokespecial   #17  <Method void Object()>
						//    2    4:return          
						}
				}

				s = ((String) (Snackbar.make(findViewById(0x7f0e00f7), ((CharSequence) (Res.getStudySpecificString(0x7f0802a6))), -2).setAction(0x7f080320, .Lambda._cls1.lambdaFactory.()).setActionTextColor(getResources().getColor(0x106000b))));
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field SettingsActivity this$0>
			//    5   11:ldc1            #35  <Int 0x7f0e00f7>
			//    6   13:invokevirtual   #39  <Method View SettingsActivity.findViewById(int)>
			//    7   16:ldc1            #40  <Int 0x7f0802a6>
			//    8   18:invokestatic    #46  <Method String Res.getStudySpecificString(int)>
			//    9   21:bipush          -2
			//   10   23:invokestatic    #52  <Method Snackbar Snackbar.make(View, CharSequence, int)>
			//   11   26:ldc1            #53  <Int 0x7f080320>
			//   12   28:invokestatic    #59  <Method android.view.View$OnClickListener SettingsActivity$2$$Lambda$1.lambdaFactory$()>
			//   13   31:invokevirtual   #63  <Method Snackbar Snackbar.setAction(int, android.view.View$OnClickListener)>
			//   14   34:aload_0         
			//   15   35:getfield        #19  <Field SettingsActivity this$0>
			//   16   38:invokevirtual   #67  <Method Resources SettingsActivity.getResources()>
			//   17   41:ldc1            #68  <Int 0x106000b>
			//   18   43:invokevirtual   #74  <Method int Resources.getColor(int)>
			//   19   46:invokevirtual   #78  <Method Snackbar Snackbar.setActionTextColor(int)>
			//   20   49:astore_1        
				((TextView)((Snackbar) (s)).getView().findViewById(0x7f0e011a)).setMaxLines(5);
			//   21   50:aload_1         
			//   22   51:invokevirtual   #82  <Method View Snackbar.getView()>
			//   23   54:ldc1            #83  <Int 0x7f0e011a>
			//   24   56:invokevirtual   #86  <Method View View.findViewById(int)>
			//   25   59:checkcast       #88  <Class TextView>
			//   26   62:iconst_5        
			//   27   63:invokevirtual   #92  <Method void TextView.setMaxLines(int)>
				((Snackbar) (s)).show();
			//   28   66:aload_1         
			//   29   67:invokevirtual   #95  <Method void Snackbar.show()>
			//   30   70:return          
			}

			public void onSuccess()
			{
				progressDialog.dismiss();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field ProgressDialog val$progressDialog>
			//    2    4:invokevirtual   #34  <Method void ProgressDialog.dismiss()>
				clearLocalData(false);
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field SettingsActivity this$0>
			//    5   11:iconst_0        
			//    6   12:invokestatic    #101 <Method void SettingsActivity.access$100(SettingsActivity, boolean)>
				Intent intent = new Intent(((Context) (SettingsActivity.this)), com/pactforcure/app/ui/LogoutSuccessActivity);
			//    7   15:new             #103 <Class Intent>
			//    8   18:dup             
			//    9   19:aload_0         
			//   10   20:getfield        #19  <Field SettingsActivity this$0>
			//   11   23:ldc1            #105 <Class LogoutSuccessActivity>
			//   12   25:invokespecial   #108 <Method void Intent(Context, Class)>
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

			
			{
				this$0 = SettingsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field SettingsActivity this$0>
				progressDialog = progressdialog;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ProgressDialog val$progressDialog>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   10   20:new             #158 <Class ParticipantServerAgent>
	//   11   23:dup             
	//   12   24:invokespecial   #159 <Method void ParticipantServerAgent()>
	//   13   27:new             #8   <Class SettingsActivity$2>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #172 <Method void SettingsActivity$2(SettingsActivity, ProgressDialog)>
	//   18   36:invokevirtual   #174 <Method void ParticipantServerAgent.logout(SimpleCallback)>
	//   19   39:return          
	}

	private void mayLogout()
	{
		Object obj = ((Object) (Res.getStudyId().name()));
	//    0    0:invokestatic    #178 <Method StudyId Res.getStudyId()>
	//    1    3:invokevirtual   #184 <Method String StudyId.name()>
	//    2    6:astore_1        
		if(SurveyStorage.anySurveyAtUploading(((String) (obj))))
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #188 <Method boolean SurveyStorage.anySurveyAtUploading(String)>
	//*   5   11:ifeq            57
		{
			obj = ((Object) ((new android.support.v7.app.AlertDialog.Builder(((Context) (this)))).setTitle(((CharSequence) (Res.getStudySpecificString(0x7f0802a8)))).setMessage(((CharSequence) (Res.getStudySpecificString(0x7f0802a7)))).setPositiveButton(0x7f080320, ((android.content.DialogInterface.OnClickListener) (null))).create()));
	//    6   14:new             #67  <Class android.support.v7.app.AlertDialog$Builder>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:invokespecial   #70  <Method void android.support.v7.app.AlertDialog$Builder(Context)>
	//   10   22:ldc1            #189 <Int 0x7f0802a8>
	//   11   24:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   12   27:invokevirtual   #81  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   13   30:ldc1            #190 <Int 0x7f0802a7>
	//   14   32:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   15   35:invokevirtual   #85  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   16   38:ldc1            #191 <Int 0x7f080320>
	//   17   40:aconst_null     
	//   18   41:invokevirtual   #193 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   19   44:invokevirtual   #110 <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   20   47:astore_1        
			DialogUtils.boldPositiveAndNegativeButtons(((AlertDialog) (obj)));
	//   21   48:aload_1         
	//   22   49:invokestatic    #116 <Method void DialogUtils.boldPositiveAndNegativeButtons(AlertDialog)>
			((AlertDialog) (obj)).show();
	//   23   52:aload_1         
	//   24   53:invokevirtual   #121 <Method void AlertDialog.show()>
			return;
	//   25   56:return          
		}
		if(SurveyStorage.anySurveyAtStarted(((String) (obj))))
	//*  26   57:aload_1         
	//*  27   58:invokestatic    #196 <Method boolean SurveyStorage.anySurveyAtStarted(String)>
	//*  28   61:ifeq            119
		{
			class .Lambda._cls5
				implements android.content.DialogInterface.OnClickListener
			{

				public static android.content.DialogInterface.OnClickListener lambdaFactory$(SettingsActivity settingsactivity)
				{
					return ((android.content.DialogInterface.OnClickListener) (((.Lambda._cls5) (settingsactivity)). new .Lambda._cls5()));
				//    0    0:new             #2   <Class SettingsActivity$$Lambda$5>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:invokespecial   #20  <Method void SettingsActivity$$Lambda$5(SettingsActivity)>
				//    4    8:areturn         
				}

				public void onClick(DialogInterface dialoginterface, int i)
				{
					SettingsActivity.lambda$mayLogout$48(arg$1, dialoginterface, i);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field SettingsActivity arg$1>
				//    2    4:aload_1         
				//    3    5:iload_2         
				//    4    6:invokestatic    #28  <Method void SettingsActivity.lambda$mayLogout$48(SettingsActivity, DialogInterface, int)>
				//    5    9:return          
				}

				private final SettingsActivity arg$1;

			private .Lambda._cls5()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SettingsActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SettingsActivity arg$1>
			//    5    9:return          
			}
			}

			AlertDialog alertdialog = (new android.support.v7.app.AlertDialog.Builder(((Context) (this)))).setTitle(((CharSequence) (Res.getStudySpecificString(0x7f0802aa)))).setMessage(((CharSequence) (Res.getStudySpecificString(0x7f0802a9)))).setPositiveButton(((CharSequence) (Res.getStudySpecificString(0x7f0802a5))), .Lambda._cls5.lambdaFactory.(this)).setNegativeButton(0x7f080055, ((android.content.DialogInterface.OnClickListener) (null))).create();
	//   29   64:new             #67  <Class android.support.v7.app.AlertDialog$Builder>
	//   30   67:dup             
	//   31   68:aload_0         
	//   32   69:invokespecial   #70  <Method void android.support.v7.app.AlertDialog$Builder(Context)>
	//   33   72:ldc1            #197 <Int 0x7f0802aa>
	//   34   74:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   35   77:invokevirtual   #81  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   36   80:ldc1            #198 <Int 0x7f0802a9>
	//   37   82:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   38   85:invokevirtual   #85  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   39   88:ldc1            #171 <Int 0x7f0802a5>
	//   40   90:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   41   93:aload_0         
	//   42   94:invokestatic    #201 <Method android.content.DialogInterface$OnClickListener SettingsActivity$$Lambda$5.lambdaFactory$(SettingsActivity)>
	//   43   97:invokevirtual   #106 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   44  100:ldc1            #90  <Int 0x7f080055>
	//   45  102:aconst_null     
	//   46  103:invokevirtual   #99  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   47  106:invokevirtual   #110 <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   48  109:astore_1        
			DialogUtils.boldPositiveAndNegativeButtons(alertdialog);
	//   49  110:aload_1         
	//   50  111:invokestatic    #116 <Method void DialogUtils.boldPositiveAndNegativeButtons(AlertDialog)>
			alertdialog.show();
	//   51  114:aload_1         
	//   52  115:invokevirtual   #121 <Method void AlertDialog.show()>
			return;
	//   53  118:return          
		} else
		{
			logout();
	//   54  119:aload_0         
	//   55  120:invokespecial   #60  <Method void logout()>
			return;
	//   56  123:return          
		}
	}

	private void optOutOrIn(final boolean optOut)
	{
		final ProgressDialog progressDialog = ProgressDialog.show(((Context) (this)), ((CharSequence) (Res.getStudySpecificString(0x7f0802b3))), ((CharSequence) (Res.getStudySpecificString(0x7f0802e5))), true);
	//    0    0:aload_0         
	//    1    1:ldc1            #71  <Int 0x7f0802b3>
	//    2    3:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//    3    6:ldc1            #150 <Int 0x7f0802e5>
	//    4    8:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//    5   11:iconst_1        
	//    6   12:invokestatic    #155 <Method ProgressDialog ProgressDialog.show(Context, CharSequence, CharSequence, boolean)>
	//    7   15:astore_2        
		progressDialog.show();
	//    8   16:aload_2         
	//    9   17:invokevirtual   #156 <Method void ProgressDialog.show()>
		(new ParticipantServerAgent()).optInOrOutContact(optOut, new SimpleCallback() {

			public void onError(String s)
			{
				progressDialog.dismiss();
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field ProgressDialog val$progressDialog>
			//    2    4:invokevirtual   #37  <Method void ProgressDialog.dismiss()>
				setOptOutCheckWithoutTrigger(optOut);
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field SettingsActivity this$0>
			//    5   11:aload_0         
			//    6   12:getfield        #25  <Field boolean val$optOut>
			//    7   15:invokestatic    #41  <Method void SettingsActivity.access$000(SettingsActivity, boolean)>
			//    8   18:return          
			}

			public void onSuccess()
			{
				progressDialog.dismiss();
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field ProgressDialog val$progressDialog>
			//    2    4:invokevirtual   #37  <Method void ProgressDialog.dismiss()>
			//    3    7:return          
			}

			final SettingsActivity this$0;
			final boolean val$optOut;
			final ProgressDialog val$progressDialog;

			
			{
				this$0 = SettingsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field SettingsActivity this$0>
				progressDialog = progressdialog;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ProgressDialog val$progressDialog>
				optOut = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field boolean val$optOut>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   10   20:new             #158 <Class ParticipantServerAgent>
	//   11   23:dup             
	//   12   24:invokespecial   #159 <Method void ParticipantServerAgent()>
	//   13   27:iload_1         
	//   14   28:new             #6   <Class SettingsActivity$1>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:iload_1         
	//   19   35:invokespecial   #204 <Method void SettingsActivity$1(SettingsActivity, ProgressDialog, boolean)>
	//   20   38:invokevirtual   #208 <Method void ParticipantServerAgent.optInOrOutContact(boolean, SimpleCallback)>
	//   21   41:return          
	}

	private void overridePendingTransition()
	{
		overridePendingTransition(0x7f050018, 0x7f05001b);
	//    0    0:aload_0         
	//    1    1:ldc1            #210 <Int 0x7f050018>
	//    2    3:ldc1            #211 <Int 0x7f05001b>
	//    3    5:invokevirtual   #214 <Method void overridePendingTransition(int, int)>
	//    4    8:return          
	}

	private void setOptOutCheckWithoutTrigger(boolean flag)
	{
		binding.allowContactSwitch.setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ActivitySettingsBinding binding>
	//    2    4:getfield        #220 <Field SwitchCompat ActivitySettingsBinding.allowContactSwitch>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #226 <Method void SwitchCompat.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		binding.allowContactSwitch.setChecked(flag);
	//    5   11:aload_0         
	//    6   12:getfield        #43  <Field ActivitySettingsBinding binding>
	//    7   15:getfield        #220 <Field SwitchCompat ActivitySettingsBinding.allowContactSwitch>
	//    8   18:iload_1         
	//    9   19:invokevirtual   #229 <Method void SwitchCompat.setChecked(boolean)>
		binding.allowContactSwitch.setOnCheckedChangeListener(onOptOutChangedListener);
	//   10   22:aload_0         
	//   11   23:getfield        #43  <Field ActivitySettingsBinding binding>
	//   12   26:getfield        #220 <Field SwitchCompat ActivitySettingsBinding.allowContactSwitch>
	//   13   29:aload_0         
	//   14   30:getfield        #28  <Field android.widget.CompoundButton$OnCheckedChangeListener onOptOutChangedListener>
	//   15   33:invokevirtual   #226 <Method void SwitchCompat.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
	//   16   36:return          
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(((Context) (CalligraphyContextWrapper.wrap(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #236 <Method android.content.ContextWrapper CalligraphyContextWrapper.wrap(Context)>
	//    3    5:invokespecial   #238 <Method void AppCompatActivity.attachBaseContext(Context)>
	//    4    8:return          
	}

	public void onBackPressed()
	{
		super.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #241 <Method void AppCompatActivity.onBackPressed()>
		overridePendingTransition();
	//    2    4:aload_0         
	//    3    5:invokespecial   #243 <Method void overridePendingTransition()>
	//    4    8:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #248 <Method void AppCompatActivity.onCreate(Bundle)>
		binding = (ActivitySettingsBinding)DataBindingUtil.setContentView(((android.app.Activity) (this)), 0x7f04002d);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:ldc1            #249 <Int 0x7f04002d>
	//    6    9:invokestatic    #255 <Method android.databinding.ViewDataBinding DataBindingUtil.setContentView(android.app.Activity, int)>
	//    7   12:checkcast       #216 <Class ActivitySettingsBinding>
	//    8   15:putfield        #43  <Field ActivitySettingsBinding binding>
		binding.setParticipant(ParticipantStorage.getParticipant());
	//    9   18:aload_0         
	//   10   19:getfield        #43  <Field ActivitySettingsBinding binding>
	//   11   22:invokestatic    #259 <Method Participant ParticipantStorage.getParticipant()>
	//   12   25:invokevirtual   #263 <Method void ActivitySettingsBinding.setParticipant(Participant)>
		binding.executePendingBindings();
	//   13   28:aload_0         
	//   14   29:getfield        #43  <Field ActivitySettingsBinding binding>
	//   15   32:invokevirtual   #266 <Method void ActivitySettingsBinding.executePendingBindings()>
		binding.profileLabel.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802ed))));
	//   16   35:aload_0         
	//   17   36:getfield        #43  <Field ActivitySettingsBinding binding>
	//   18   39:getfield        #270 <Field TextView ActivitySettingsBinding.profileLabel>
	//   19   42:ldc2            #271 <Int 0x7f0802ed>
	//   20   45:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   21   48:invokevirtual   #277 <Method void TextView.setText(CharSequence)>
		binding.nameLabel.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802af))));
	//   22   51:aload_0         
	//   23   52:getfield        #43  <Field ActivitySettingsBinding binding>
	//   24   55:getfield        #280 <Field TextView ActivitySettingsBinding.nameLabel>
	//   25   58:ldc2            #281 <Int 0x7f0802af>
	//   26   61:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   27   64:invokevirtual   #277 <Method void TextView.setText(CharSequence)>
		binding.telephoneLabel.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802dc))));
	//   28   67:aload_0         
	//   29   68:getfield        #43  <Field ActivitySettingsBinding binding>
	//   30   71:getfield        #284 <Field TextView ActivitySettingsBinding.telephoneLabel>
	//   31   74:ldc2            #285 <Int 0x7f0802dc>
	//   32   77:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   33   80:invokevirtual   #277 <Method void TextView.setText(CharSequence)>
		binding.emailLabel.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802d2))));
	//   34   83:aload_0         
	//   35   84:getfield        #43  <Field ActivitySettingsBinding binding>
	//   36   87:getfield        #288 <Field TextView ActivitySettingsBinding.emailLabel>
	//   37   90:ldc2            #289 <Int 0x7f0802d2>
	//   38   93:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   39   96:invokevirtual   #277 <Method void TextView.setText(CharSequence)>
		binding.logoutBtn.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802a5))));
	//   40   99:aload_0         
	//   41  100:getfield        #43  <Field ActivitySettingsBinding binding>
	//   42  103:getfield        #292 <Field TextView ActivitySettingsBinding.logoutBtn>
	//   43  106:ldc1            #171 <Int 0x7f0802a5>
	//   44  108:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   45  111:invokevirtual   #277 <Method void TextView.setText(CharSequence)>
		binding.contactLabel.setText(((CharSequence) (Res.getStudySpecificString(0x7f08020b))));
	//   46  114:aload_0         
	//   47  115:getfield        #43  <Field ActivitySettingsBinding binding>
	//   48  118:getfield        #295 <Field TextView ActivitySettingsBinding.contactLabel>
	//   49  121:ldc2            #296 <Int 0x7f08020b>
	//   50  124:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   51  127:invokevirtual   #277 <Method void TextView.setText(CharSequence)>
		binding.allowPactContactMeLabel.setText(((CharSequence) (Res.getStudySpecificString(0x7f0801bc))));
	//   52  130:aload_0         
	//   53  131:getfield        #43  <Field ActivitySettingsBinding binding>
	//   54  134:getfield        #299 <Field TextView ActivitySettingsBinding.allowPactContactMeLabel>
	//   55  137:ldc2            #300 <Int 0x7f0801bc>
	//   56  140:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   57  143:invokevirtual   #277 <Method void TextView.setText(CharSequence)>
		binding.contactInformationLabel.setText(((CharSequence) (Res.getStudySpecificString(0x7f08020c))));
	//   58  146:aload_0         
	//   59  147:getfield        #43  <Field ActivitySettingsBinding binding>
	//   60  150:getfield        #303 <Field TextView ActivitySettingsBinding.contactInformationLabel>
	//   61  153:ldc2            #304 <Int 0x7f08020c>
	//   62  156:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   63  159:invokevirtual   #277 <Method void TextView.setText(CharSequence)>
		binding.participationLabel.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802df))));
	//   64  162:aload_0         
	//   65  163:getfield        #43  <Field ActivitySettingsBinding binding>
	//   66  166:getfield        #307 <Field TextView ActivitySettingsBinding.participationLabel>
	//   67  169:ldc2            #308 <Int 0x7f0802df>
	//   68  172:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   69  175:invokevirtual   #277 <Method void TextView.setText(CharSequence)>
		binding.leaveDnaTitle.setText(((CharSequence) (Res.getStudySpecificString(0x7f08029e))));
	//   70  178:aload_0         
	//   71  179:getfield        #43  <Field ActivitySettingsBinding binding>
	//   72  182:getfield        #311 <Field TextView ActivitySettingsBinding.leaveDnaTitle>
	//   73  185:ldc1            #145 <Int 0x7f08029e>
	//   74  187:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   75  190:invokevirtual   #277 <Method void TextView.setText(CharSequence)>
		binding.leaveDnaExplanation.setText(((CharSequence) (Res.getStudySpecificString(0x7f08029b))));
	//   76  193:aload_0         
	//   77  194:getfield        #43  <Field ActivitySettingsBinding binding>
	//   78  197:getfield        #314 <Field TextView ActivitySettingsBinding.leaveDnaExplanation>
	//   79  200:ldc2            #315 <Int 0x7f08029b>
	//   80  203:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   81  206:invokevirtual   #277 <Method void TextView.setText(CharSequence)>
		binding.leaveDnaBtn.setText(((CharSequence) (Res.getStudySpecificString(0x7f08029e))));
	//   82  209:aload_0         
	//   83  210:getfield        #43  <Field ActivitySettingsBinding binding>
	//   84  213:getfield        #318 <Field TextView ActivitySettingsBinding.leaveDnaBtn>
	//   85  216:ldc1            #145 <Int 0x7f08029e>
	//   86  218:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   87  221:invokevirtual   #277 <Method void TextView.setText(CharSequence)>
		binding.leavePactBtn.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802a2))));
	//   88  224:aload_0         
	//   89  225:getfield        #43  <Field ActivitySettingsBinding binding>
	//   90  228:getfield        #321 <Field TextView ActivitySettingsBinding.leavePactBtn>
	//   91  231:ldc2            #322 <Int 0x7f0802a2>
	//   92  234:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   93  237:invokevirtual   #277 <Method void TextView.setText(CharSequence)>
		binding.leaveStudyExplanation.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802a3))));
	//   94  240:aload_0         
	//   95  241:getfield        #43  <Field ActivitySettingsBinding binding>
	//   96  244:getfield        #325 <Field TextView ActivitySettingsBinding.leaveStudyExplanation>
	//   97  247:ldc2            #326 <Int 0x7f0802a3>
	//   98  250:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//   99  253:invokevirtual   #277 <Method void TextView.setText(CharSequence)>
		binding.leaveBtn.setText(((CharSequence) (Res.getStudySpecificString(0x7f0802a2))));
	//  100  256:aload_0         
	//  101  257:getfield        #43  <Field ActivitySettingsBinding binding>
	//  102  260:getfield        #329 <Field TextView ActivitySettingsBinding.leaveBtn>
	//  103  263:ldc2            #322 <Int 0x7f0802a2>
	//  104  266:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  105  269:invokevirtual   #277 <Method void TextView.setText(CharSequence)>
		class .Lambda._cls2
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(SettingsActivity settingsactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls2) (settingsactivity)). new .Lambda._cls2()));
			//    0    0:new             #2   <Class SettingsActivity$$Lambda$2>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void SettingsActivity$$Lambda$2(SettingsActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				SettingsActivity.lambda$onCreate$40(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SettingsActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void SettingsActivity.lambda$onCreate$40(SettingsActivity, View)>
			//    4    8:return          
			}

			private final SettingsActivity arg$1;

			private .Lambda._cls2()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SettingsActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SettingsActivity arg$1>
			//    5    9:return          
			}
		}

		binding.logoutBtn.setOnClickListener(.Lambda._cls2.lambdaFactory.(this));
	//  106  272:aload_0         
	//  107  273:getfield        #43  <Field ActivitySettingsBinding binding>
	//  108  276:getfield        #292 <Field TextView ActivitySettingsBinding.logoutBtn>
	//  109  279:aload_0         
	//  110  280:invokestatic    #334 <Method android.view.View$OnClickListener SettingsActivity$$Lambda$2.lambdaFactory$(SettingsActivity)>
	//  111  283:invokevirtual   #338 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		binding.allowContactSwitch.setOnCheckedChangeListener(onOptOutChangedListener);
	//  112  286:aload_0         
	//  113  287:getfield        #43  <Field ActivitySettingsBinding binding>
	//  114  290:getfield        #220 <Field SwitchCompat ActivitySettingsBinding.allowContactSwitch>
	//  115  293:aload_0         
	//  116  294:getfield        #28  <Field android.widget.CompoundButton$OnCheckedChangeListener onOptOutChangedListener>
	//  117  297:invokevirtual   #226 <Method void SwitchCompat.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		class .Lambda._cls3
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(SettingsActivity settingsactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls3) (settingsactivity)). new .Lambda._cls3()));
			//    0    0:new             #2   <Class SettingsActivity$$Lambda$3>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void SettingsActivity$$Lambda$3(SettingsActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				SettingsActivity.lambda$onCreate$42(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SettingsActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void SettingsActivity.lambda$onCreate$42(SettingsActivity, View)>
			//    4    8:return          
			}

			private final SettingsActivity arg$1;

			private .Lambda._cls3()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SettingsActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SettingsActivity arg$1>
			//    5    9:return          
			}
		}

		binding.leaveBtn.setOnClickListener(.Lambda._cls3.lambdaFactory.(this));
	//  118  300:aload_0         
	//  119  301:getfield        #43  <Field ActivitySettingsBinding binding>
	//  120  304:getfield        #329 <Field TextView ActivitySettingsBinding.leaveBtn>
	//  121  307:aload_0         
	//  122  308:invokestatic    #341 <Method android.view.View$OnClickListener SettingsActivity$$Lambda$3.lambdaFactory$(SettingsActivity)>
	//  123  311:invokevirtual   #338 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		setSupportActionBar(binding.toolbar);
	//  124  314:aload_0         
	//  125  315:aload_0         
	//  126  316:getfield        #43  <Field ActivitySettingsBinding binding>
	//  127  319:getfield        #345 <Field android.support.v7.widget.Toolbar ActivitySettingsBinding.toolbar>
	//  128  322:invokevirtual   #349 <Method void setSupportActionBar(android.support.v7.widget.Toolbar)>
		setTitle(((CharSequence) (Res.getStudySpecificString(0x7f080335))));
	//  129  325:aload_0         
	//  130  326:ldc2            #350 <Int 0x7f080335>
	//  131  329:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  132  332:invokevirtual   #352 <Method void setTitle(CharSequence)>
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	//  133  335:aload_0         
	//  134  336:invokevirtual   #356 <Method ActionBar getSupportActionBar()>
	//  135  339:iconst_1        
	//  136  340:invokevirtual   #361 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
		if(PpdResultsStorage.hasGivenDnaConsent(Res.getStudyId()))
	//* 137  343:invokestatic    #178 <Method StudyId Res.getStudyId()>
	//* 138  346:invokestatic    #365 <Method boolean PpdResultsStorage.hasGivenDnaConsent(StudyId)>
	//* 139  349:ifeq            561
		{
			binding.leaveDnaTitle.setVisibility(0);
	//  140  352:aload_0         
	//  141  353:getfield        #43  <Field ActivitySettingsBinding binding>
	//  142  356:getfield        #311 <Field TextView ActivitySettingsBinding.leaveDnaTitle>
	//  143  359:iconst_0        
	//  144  360:invokevirtual   #369 <Method void TextView.setVisibility(int)>
			binding.leaveDnaExplanation.setVisibility(0);
	//  145  363:aload_0         
	//  146  364:getfield        #43  <Field ActivitySettingsBinding binding>
	//  147  367:getfield        #314 <Field TextView ActivitySettingsBinding.leaveDnaExplanation>
	//  148  370:iconst_0        
	//  149  371:invokevirtual   #369 <Method void TextView.setVisibility(int)>
			binding.leaveDnaBtn.setVisibility(0);
	//  150  374:aload_0         
	//  151  375:getfield        #43  <Field ActivitySettingsBinding binding>
	//  152  378:getfield        #318 <Field TextView ActivitySettingsBinding.leaveDnaBtn>
	//  153  381:iconst_0        
	//  154  382:invokevirtual   #369 <Method void TextView.setVisibility(int)>
			class .Lambda._cls4
				implements android.view.View.OnClickListener
			{

				public static android.view.View.OnClickListener lambdaFactory$(SettingsActivity settingsactivity)
				{
					return ((android.view.View.OnClickListener) (((.Lambda._cls4) (settingsactivity)). new .Lambda._cls4()));
				//    0    0:new             #2   <Class SettingsActivity$$Lambda$4>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:invokespecial   #20  <Method void SettingsActivity$$Lambda$4(SettingsActivity)>
				//    4    8:areturn         
				}

				public void onClick(View view)
				{
					SettingsActivity.lambda$onCreate$44(arg$1, view);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field SettingsActivity arg$1>
				//    2    4:aload_1         
				//    3    5:invokestatic    #28  <Method void SettingsActivity.lambda$onCreate$44(SettingsActivity, View)>
				//    4    8:return          
				}

				private final SettingsActivity arg$1;

			private .Lambda._cls4()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SettingsActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SettingsActivity arg$1>
			//    5    9:return          
			}
			}

			binding.leaveDnaBtn.setOnClickListener(.Lambda._cls4.lambdaFactory.(this));
	//  155  385:aload_0         
	//  156  386:getfield        #43  <Field ActivitySettingsBinding binding>
	//  157  389:getfield        #318 <Field TextView ActivitySettingsBinding.leaveDnaBtn>
	//  158  392:aload_0         
	//  159  393:invokestatic    #372 <Method android.view.View$OnClickListener SettingsActivity$$Lambda$4.lambdaFactory$(SettingsActivity)>
	//  160  396:invokevirtual   #338 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
			binding.addressTitle.setVisibility(0);
	//  161  399:aload_0         
	//  162  400:getfield        #43  <Field ActivitySettingsBinding binding>
	//  163  403:getfield        #375 <Field TextView ActivitySettingsBinding.addressTitle>
	//  164  406:iconst_0        
	//  165  407:invokevirtual   #369 <Method void TextView.setVisibility(int)>
			binding.addressView.setVisibility(0);
	//  166  410:aload_0         
	//  167  411:getfield        #43  <Field ActivitySettingsBinding binding>
	//  168  414:getfield        #378 <Field TextView ActivitySettingsBinding.addressView>
	//  169  417:iconst_0        
	//  170  418:invokevirtual   #369 <Method void TextView.setVisibility(int)>
			binding.addressChangeMail.setVisibility(0);
	//  171  421:aload_0         
	//  172  422:getfield        #43  <Field ActivitySettingsBinding binding>
	//  173  425:getfield        #381 <Field TextView ActivitySettingsBinding.addressChangeMail>
	//  174  428:iconst_0        
	//  175  429:invokevirtual   #369 <Method void TextView.setVisibility(int)>
			bundle = ((Bundle) (new StringBuilder()));
	//  176  432:new             #383 <Class StringBuilder>
	//  177  435:dup             
	//  178  436:invokespecial   #384 <Method void StringBuilder()>
	//  179  439:astore_1        
			Participant participant = ParticipantStorage.getParticipant();
	//  180  440:invokestatic    #259 <Method Participant ParticipantStorage.getParticipant()>
	//  181  443:astore_2        
			((StringBuilder) (bundle)).append(participant.getAddress1());
	//  182  444:aload_1         
	//  183  445:aload_2         
	//  184  446:invokevirtual   #389 <Method String Participant.getAddress1()>
	//  185  449:invokevirtual   #393 <Method StringBuilder StringBuilder.append(String)>
	//  186  452:pop             
			if(!StringUtils.safeIsEmpty(participant.getAddress2()))
	//* 187  453:aload_2         
	//* 188  454:invokevirtual   #396 <Method String Participant.getAddress2()>
	//* 189  457:invokestatic    #401 <Method boolean StringUtils.safeIsEmpty(String)>
	//* 190  460:ifne            480
			{
				((StringBuilder) (bundle)).append("\n");
	//  191  463:aload_1         
	//  192  464:ldc2            #403 <String "\n">
	//  193  467:invokevirtual   #393 <Method StringBuilder StringBuilder.append(String)>
	//  194  470:pop             
				((StringBuilder) (bundle)).append(participant.getAddress2());
	//  195  471:aload_1         
	//  196  472:aload_2         
	//  197  473:invokevirtual   #396 <Method String Participant.getAddress2()>
	//  198  476:invokevirtual   #393 <Method StringBuilder StringBuilder.append(String)>
	//  199  479:pop             
			}
			((StringBuilder) (bundle)).append("\n");
	//  200  480:aload_1         
	//  201  481:ldc2            #403 <String "\n">
	//  202  484:invokevirtual   #393 <Method StringBuilder StringBuilder.append(String)>
	//  203  487:pop             
			((StringBuilder) (bundle)).append(participant.getCity());
	//  204  488:aload_1         
	//  205  489:aload_2         
	//  206  490:invokevirtual   #406 <Method String Participant.getCity()>
	//  207  493:invokevirtual   #393 <Method StringBuilder StringBuilder.append(String)>
	//  208  496:pop             
			((StringBuilder) (bundle)).append(", ");
	//  209  497:aload_1         
	//  210  498:ldc2            #408 <String ", ">
	//  211  501:invokevirtual   #393 <Method StringBuilder StringBuilder.append(String)>
	//  212  504:pop             
			((StringBuilder) (bundle)).append(participant.getState());
	//  213  505:aload_1         
	//  214  506:aload_2         
	//  215  507:invokevirtual   #411 <Method String Participant.getState()>
	//  216  510:invokevirtual   #393 <Method StringBuilder StringBuilder.append(String)>
	//  217  513:pop             
			((StringBuilder) (bundle)).append(" ");
	//  218  514:aload_1         
	//  219  515:ldc2            #413 <String " ">
	//  220  518:invokevirtual   #393 <Method StringBuilder StringBuilder.append(String)>
	//  221  521:pop             
			((StringBuilder) (bundle)).append(participant.getZip());
	//  222  522:aload_1         
	//  223  523:aload_2         
	//  224  524:invokevirtual   #416 <Method String Participant.getZip()>
	//  225  527:invokevirtual   #393 <Method StringBuilder StringBuilder.append(String)>
	//  226  530:pop             
			binding.addressView.setText(((CharSequence) (((StringBuilder) (bundle)).toString())));
	//  227  531:aload_0         
	//  228  532:getfield        #43  <Field ActivitySettingsBinding binding>
	//  229  535:getfield        #378 <Field TextView ActivitySettingsBinding.addressView>
	//  230  538:aload_1         
	//  231  539:invokevirtual   #419 <Method String StringBuilder.toString()>
	//  232  542:invokevirtual   #277 <Method void TextView.setText(CharSequence)>
			binding.addressChangeMail.setText(((CharSequence) (Res.getStudySpecificString(0x7f080205))));
	//  233  545:aload_0         
	//  234  546:getfield        #43  <Field ActivitySettingsBinding binding>
	//  235  549:getfield        #381 <Field TextView ActivitySettingsBinding.addressChangeMail>
	//  236  552:ldc2            #420 <Int 0x7f080205>
	//  237  555:invokestatic    #77  <Method String Res.getStudySpecificString(int)>
	//  238  558:invokevirtual   #277 <Method void TextView.setText(CharSequence)>
		}
	//  239  561:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #426 <Method void finish()>
		overridePendingTransition();
	//    2    4:aload_0         
	//    3    5:invokespecial   #243 <Method void overridePendingTransition()>
		return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	private ActivitySettingsBinding binding;
	final android.widget.CompoundButton.OnCheckedChangeListener onOptOutChangedListener = .Lambda._cls1.lambdaFactory.(this);


/*
	static void access$000(SettingsActivity settingsactivity, boolean flag)
	{
		settingsactivity.setOptOutCheckWithoutTrigger(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #35  <Method void setOptOutCheckWithoutTrigger(boolean)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$100(SettingsActivity settingsactivity, boolean flag)
	{
		settingsactivity.clearLocalData(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #39  <Method void clearLocalData(boolean)>
		return;
	//    3    5:return          
	}

*/


/*
	static ActivitySettingsBinding access$200(SettingsActivity settingsactivity)
	{
		return settingsactivity.binding;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ActivitySettingsBinding binding>
	//    2    4:areturn         
	}

*/
}
