// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.widget.*;
import com.pactforcure.app.participant.login.CredentialsValidationError;
import com.pactforcure.app.participant.password.SetPassword;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.util.DialogUtils;
import com.pactforcure.app.util.KeyboardUtils;
import java.util.Iterator;
import java.util.List;
import retrofit2.*;

// Referenced classes of package com.pactforcure.app.ui:
//			LoginActivity

public class SetPasswordActivity extends AppCompatActivity
{

	public SetPasswordActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void AppCompatActivity()>
		handleSetPasswordCallback = new Callback() {

			static void lambda$onResponse$38(_cls1 _pcls1, DialogInterface dialoginterface, int i)
			{
				_pcls1.this$0.goToLogin();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SetPasswordActivity this$0>
			//    2    4:invokestatic    #24  <Method void SetPasswordActivity.access$300(SetPasswordActivity)>
			//    3    7:return          
			}

			public void onFailure(Call call, Throwable throwable)
			{
				tryingToSetPassword = false;
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SetPasswordActivity this$0>
			//    2    4:iconst_0        
			//    3    5:invokestatic    #30  <Method boolean SetPasswordActivity.access$002(SetPasswordActivity, boolean)>
			//    4    8:pop             
				progressBar.setVisibility(4);
			//    5    9:aload_0         
			//    6   10:getfield        #15  <Field SetPasswordActivity this$0>
			//    7   13:invokestatic    #34  <Method ProgressBar SetPasswordActivity.access$100(SetPasswordActivity)>
			//    8   16:iconst_4        
			//    9   17:invokevirtual   #40  <Method void ProgressBar.setVisibility(int)>
				displaySetPasswordFailureDialog();
			//   10   20:aload_0         
			//   11   21:getfield        #15  <Field SetPasswordActivity this$0>
			//   12   24:invokestatic    #43  <Method void SetPasswordActivity.access$200(SetPasswordActivity)>
			//   13   27:return          
			}

			public void onResponse(Call call, Response response)
			{
				tryingToSetPassword = false;
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SetPasswordActivity this$0>
			//    2    4:iconst_0        
			//    3    5:invokestatic    #30  <Method boolean SetPasswordActivity.access$002(SetPasswordActivity, boolean)>
			//    4    8:pop             
				progressBar.setVisibility(4);
			//    5    9:aload_0         
			//    6   10:getfield        #15  <Field SetPasswordActivity this$0>
			//    7   13:invokestatic    #34  <Method ProgressBar SetPasswordActivity.access$100(SetPasswordActivity)>
			//    8   16:iconst_4        
			//    9   17:invokevirtual   #40  <Method void ProgressBar.setVisibility(int)>
				class .Lambda._cls1
					implements android.content.DialogInterface.OnClickListener
				{

					public static android.content.DialogInterface.OnClickListener lambdaFactory$(_cls1 _pcls1)
					{
						return ((android.content.DialogInterface.OnClickListener) (((.Lambda._cls1) (_pcls1)). new .Lambda._cls1()));
					//    0    0:new             #2   <Class SetPasswordActivity$1$$Lambda$1>
					//    1    3:dup             
					//    2    4:aload_0         
					//    3    5:invokespecial   #20  <Method void SetPasswordActivity$1$$Lambda$1(SetPasswordActivity$1)>
					//    4    8:areturn         
					}

					public void onClick(DialogInterface dialoginterface, int i)
					{
						_cls1.lambda.onResponse._mth38(arg$1, dialoginterface, i);
					//    0    0:aload_0         
					//    1    1:getfield        #15  <Field SetPasswordActivity$1 arg$1>
					//    2    4:aload_1         
					//    3    5:iload_2         
					//    4    6:invokestatic    #28  <Method void SetPasswordActivity$1.lambda$onResponse$38(SetPasswordActivity$1, DialogInterface, int)>
					//    5    9:return          
					}

					private final _cls1 arg$1;

						private .Lambda._cls1()
						{
						//    0    0:aload_0         
						//    1    1:invokespecial   #13  <Method void Object()>
							arg$1 = _cls1.this;
						//    2    4:aload_0         
						//    3    5:aload_1         
						//    4    6:putfield        #15  <Field SetPasswordActivity$1 arg$1>
						//    5    9:return          
						}
				}

				call = ((Call) ((new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (SetPasswordActivity.this)))).setTitle(0x7f080026).setMessage(0x7f08004a).setPositiveButton(0x7f080320, .Lambda._cls1.lambdaFactory.(this)).setCancelable(false).create()));
			//   10   20:new             #49  <Class android.support.v7.app.AlertDialog$Builder>
			//   11   23:dup             
			//   12   24:aload_0         
			//   13   25:getfield        #15  <Field SetPasswordActivity this$0>
			//   14   28:invokespecial   #52  <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context)>
			//   15   31:ldc1            #53  <Int 0x7f080026>
			//   16   33:invokevirtual   #57  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(int)>
			//   17   36:ldc1            #58  <Int 0x7f08004a>
			//   18   38:invokevirtual   #61  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(int)>
			//   19   41:ldc1            #62  <Int 0x7f080320>
			//   20   43:aload_0         
			//   21   44:invokestatic    #68  <Method android.content.DialogInterface$OnClickListener SetPasswordActivity$1$$Lambda$1.lambdaFactory$(SetPasswordActivity$1)>
			//   22   47:invokevirtual   #72  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
			//   23   50:iconst_0        
			//   24   51:invokevirtual   #76  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setCancelable(boolean)>
			//   25   54:invokevirtual   #80  <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
			//   26   57:astore_1        
				((AlertDialog) (call)).show();
			//   27   58:aload_1         
			//   28   59:invokevirtual   #85  <Method void AlertDialog.show()>
				DialogUtils.boldPositiveAndNegativeButtons(((AlertDialog) (call)));
			//   29   62:aload_1         
			//   30   63:invokestatic    #91  <Method void DialogUtils.boldPositiveAndNegativeButtons(AlertDialog)>
			//   31   66:return          
			}

			final SetPasswordActivity this$0;

			
			{
				this$0 = SetPasswordActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SetPasswordActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    2    4:aload_0         
	//    3    5:new             #6   <Class SetPasswordActivity$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #30  <Method void SetPasswordActivity$1(SetPasswordActivity)>
	//    7   13:putfield        #32  <Field Callback handleSetPasswordCallback>
	//    8   16:return          
	}

	private void displaySetPasswordFailureDialog()
	{
		class .Lambda._cls3
			implements android.content.DialogInterface.OnClickListener
		{

			public static android.content.DialogInterface.OnClickListener lambdaFactory$()
			{
				return ((android.content.DialogInterface.OnClickListener) (instance));
			//    0    0:getstatic       #15  <Field SetPasswordActivity$$Lambda$3 instance>
			//    1    3:areturn         
			}

			public void onClick(DialogInterface dialoginterface, int i)
			{
				SetPasswordActivity.lambda$displaySetPasswordFailureDialog$39(dialoginterface, i);
			//    0    0:aload_1         
			//    1    1:iload_2         
			//    2    2:invokestatic    #26  <Method void SetPasswordActivity.lambda$displaySetPasswordFailureDialog$39(DialogInterface, int)>
			//    3    5:return          
			}

			private static final .Lambda._cls3 instance = new .Lambda._cls3();

			static 
			{
			//    0    0:new             #2   <Class SetPasswordActivity$$Lambda$3>
			//    1    3:dup             
			//    2    4:invokespecial   #13  <Method void SetPasswordActivity$$Lambda$3()>
			//    3    7:putstatic       #15  <Field SetPasswordActivity$$Lambda$3 instance>
			//*   4   10:return          
			}

			private .Lambda._cls3()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #17  <Method void Object()>
			//    2    4:return          
			}
		}

		AlertDialog alertdialog = (new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(((CharSequence) (getString(0x7f08003c)))).setMessage(0x7f080028).setPositiveButton(0x7f080320, .Lambda._cls3.lambdaFactory.()).create();
	//    0    0:new             #51  <Class android.support.v7.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #54  <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:aload_0         
	//    5    9:ldc1            #55  <Int 0x7f08003c>
	//    6   11:invokevirtual   #59  <Method String getString(int)>
	//    7   14:invokevirtual   #63  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(CharSequence)>
	//    8   17:ldc1            #64  <Int 0x7f080028>
	//    9   19:invokevirtual   #68  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(int)>
	//   10   22:ldc1            #69  <Int 0x7f080320>
	//   11   24:invokestatic    #75  <Method android.content.DialogInterface$OnClickListener SetPasswordActivity$$Lambda$3.lambdaFactory$()>
	//   12   27:invokevirtual   #79  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   13   30:invokevirtual   #83  <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   14   33:astore_1        
		DialogUtils.boldPositiveAndNegativeButtons(alertdialog);
	//   15   34:aload_1         
	//   16   35:invokestatic    #89  <Method void DialogUtils.boldPositiveAndNegativeButtons(AlertDialog)>
		if(!isFinishing())
	//*  17   38:aload_0         
	//*  18   39:invokevirtual   #93  <Method boolean isFinishing()>
	//*  19   42:ifne            49
			alertdialog.show();
	//   20   45:aload_1         
	//   21   46:invokevirtual   #98  <Method void AlertDialog.show()>
	//   22   49:return          
	}

	private void goToLogin()
	{
		Intent intent = new Intent(((android.content.Context) (this)), com/pactforcure/app/ui/LoginActivity);
	//    0    0:new             #100 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #102 <Class LoginActivity>
	//    4    7:invokespecial   #105 <Method void Intent(android.content.Context, Class)>
	//    5   10:astore_1        
		intent.setFlags(0x10008000);
	//    6   11:aload_1         
	//    7   12:ldc1            #106 <Int 0x10008000>
	//    8   14:invokevirtual   #110 <Method Intent Intent.setFlags(int)>
	//    9   17:pop             
		startActivity(intent);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #114 <Method void startActivity(Intent)>
	//   13   23:return          
	}

	private void handleValidationErrors(List list)
	{
		list = ((List) (list.iterator()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #122 <Method Iterator List.iterator()>
	//    2    6:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//    3    7:aload_1         
	//    4    8:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            89
			CredentialsValidationError credentialsvalidationerror = (CredentialsValidationError)((Iterator) (list)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #131 <Method Object Iterator.next()>
	//    8   22:checkcast       #133 <Class CredentialsValidationError>
	//    9   25:astore_2        
			static class _cls2
			{

				static final int $SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError[];

				static 
				{
					$SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError = new int[CredentialsValidationError.values().length];
				//    0    0:invokestatic    #18  <Method CredentialsValidationError[] CredentialsValidationError.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError>
					try
					{
						$SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError[CredentialsValidationError.EMPTY_EMAIL.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError>
				//    5   12:getstatic       #24  <Field CredentialsValidationError CredentialsValidationError.EMPTY_EMAIL>
				//    6   15:invokevirtual   #28  <Method int CredentialsValidationError.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError>
				//*  10   23:getstatic       #31  <Field CredentialsValidationError CredentialsValidationError.INVALID_EMAIL>
				//*  11   26:invokevirtual   #28  <Method int CredentialsValidationError.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:return          
				//*  15   32:astore_0        
				//*  16   33:return          
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   17   34:astore_0        
					try
					{
						$SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError[CredentialsValidationError.INVALID_EMAIL.ordinal()] = 2;
					}
					catch(NoSuchFieldError nosuchfielderror)
					{
						return;
					}
				//*  18   35:goto            20
				}
			}

			switch(_cls2..SwitchMap.com.pactforcure.app.participant.login.CredentialsValidationError[credentialsvalidationerror.ordinal()])
	//*  10   26:getstatic       #137 <Field int[] SetPasswordActivity$2.$SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError>
	//*  11   29:aload_2         
	//*  12   30:invokevirtual   #141 <Method int CredentialsValidationError.ordinal()>
	//*  13   33:iaload          
			{
	//*  14   34:tableswitch     1 2: default 56
	//	               1 59
	//	               2 74
	//*  15   56:goto            7
			case 1: // '\001'
				emailView.setError(((CharSequence) (Res.getStudySpecificString(0x7f0802d3))));
	//   16   59:aload_0         
	//   17   60:getfield        #143 <Field EditText emailView>
	//   18   63:ldc1            #144 <Int 0x7f0802d3>
	//   19   65:invokestatic    #149 <Method String Res.getStudySpecificString(int)>
	//   20   68:invokevirtual   #155 <Method void EditText.setError(CharSequence)>
				break;

	//*  21   71:goto            7
			case 2: // '\002'
				emailView.setError(((CharSequence) (Res.getStudySpecificString(0x7f0802d7))));
	//   22   74:aload_0         
	//   23   75:getfield        #143 <Field EditText emailView>
	//   24   78:ldc1            #156 <Int 0x7f0802d7>
	//   25   80:invokestatic    #149 <Method String Res.getStudySpecificString(int)>
	//   26   83:invokevirtual   #155 <Method void EditText.setError(CharSequence)>
				break;
			}
		} while(true);
	//*  27   86:goto            7
	//   28   89:return          
	}

	static void lambda$displaySetPasswordFailureDialog$39(DialogInterface dialoginterface, int i)
	{
	//    0    0:return          
	}

	static void lambda$onCreate$36(SetPasswordActivity setpasswordactivity, View view)
	{
		setpasswordactivity.tryToSetPassword();
	//    0    0:aload_0         
	//    1    1:invokespecial   #165 <Method void tryToSetPassword()>
	//    2    4:return          
	}

	static boolean lambda$onCreate$37(SetPasswordActivity setpasswordactivity, TextView textview, int i, KeyEvent keyevent)
	{
		if(i == 2)
	//*   0    0:iload_2         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          11
		{
			setpasswordactivity.tryToSetPassword();
	//    3    5:aload_0         
	//    4    6:invokespecial   #165 <Method void tryToSetPassword()>
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		} else
		{
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		}
	}

	private void tryToSetPassword()
	{
		if(tryingToSetPassword)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field boolean tryingToSetPassword>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		tryingToSetPassword = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #37  <Field boolean tryingToSetPassword>
		SetPassword setpassword = new SetPassword(((Object) (emailView.getText())).toString());
	//    7   13:new             #169 <Class SetPassword>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #143 <Field EditText emailView>
	//   11   21:invokevirtual   #173 <Method android.text.Editable EditText.getText()>
	//   12   24:invokevirtual   #179 <Method String Object.toString()>
	//   13   27:invokespecial   #182 <Method void SetPassword(String)>
	//   14   30:astore_1        
		List list = setpassword.validate();
	//   15   31:aload_1         
	//   16   32:invokevirtual   #186 <Method List SetPassword.validate()>
	//   17   35:astore_2        
		if(list.isEmpty())
	//*  18   36:aload_2         
	//*  19   37:invokeinterface #189 <Method boolean List.isEmpty()>
	//*  20   42:ifeq            66
		{
			KeyboardUtils.dismissKeyboard(((android.app.Activity) (this)));
	//   21   45:aload_0         
	//   22   46:invokestatic    #195 <Method void KeyboardUtils.dismissKeyboard(android.app.Activity)>
			progressBar.setVisibility(0);
	//   23   49:aload_0         
	//   24   50:getfield        #41  <Field ProgressBar progressBar>
	//   25   53:iconst_0        
	//   26   54:invokevirtual   #201 <Method void ProgressBar.setVisibility(int)>
			setpassword.startSetPasswordProcess(handleSetPasswordCallback);
	//   27   57:aload_1         
	//   28   58:aload_0         
	//   29   59:getfield        #32  <Field Callback handleSetPasswordCallback>
	//   30   62:invokevirtual   #205 <Method void SetPassword.startSetPasswordProcess(Callback)>
			return;
	//   31   65:return          
		} else
		{
			handleValidationErrors(list);
	//   32   66:aload_0         
	//   33   67:aload_2         
	//   34   68:invokespecial   #207 <Method void handleValidationErrors(List)>
			tryingToSetPassword = false;
	//   35   71:aload_0         
	//   36   72:iconst_0        
	//   37   73:putfield        #37  <Field boolean tryingToSetPassword>
			return;
	//   38   76:return          
		}
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #212 <Method void AppCompatActivity.onCreate(Bundle)>
		setContentView(0x7f04002c);
	//    3    5:aload_0         
	//    4    6:ldc1            #213 <Int 0x7f04002c>
	//    5    8:invokevirtual   #216 <Method void setContentView(int)>
		toolbar = (Toolbar)findViewById(0x7f0e00af);
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:ldc1            #217 <Int 0x7f0e00af>
	//    9   15:invokevirtual   #221 <Method View findViewById(int)>
	//   10   18:checkcast       #223 <Class Toolbar>
	//   11   21:putfield        #225 <Field Toolbar toolbar>
		setSupportActionBar(toolbar);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #225 <Field Toolbar toolbar>
	//   15   29:invokevirtual   #229 <Method void setSupportActionBar(Toolbar)>
		setTitle(0x7f080334);
	//   16   32:aload_0         
	//   17   33:ldc1            #230 <Int 0x7f080334>
	//   18   35:invokevirtual   #232 <Method void setTitle(int)>
		progressBar = (ProgressBar)findViewById(0x7f0e00a9);
	//   19   38:aload_0         
	//   20   39:aload_0         
	//   21   40:ldc1            #233 <Int 0x7f0e00a9>
	//   22   42:invokevirtual   #221 <Method View findViewById(int)>
	//   23   45:checkcast       #197 <Class ProgressBar>
	//   24   48:putfield        #41  <Field ProgressBar progressBar>
		setPasswordHelpTextView = (TextView)findViewById(0x7f0e00f5);
	//   25   51:aload_0         
	//   26   52:aload_0         
	//   27   53:ldc1            #234 <Int 0x7f0e00f5>
	//   28   55:invokevirtual   #221 <Method View findViewById(int)>
	//   29   58:checkcast       #236 <Class TextView>
	//   30   61:putfield        #238 <Field TextView setPasswordHelpTextView>
		emailView = (EditText)findViewById(0x7f0e009f);
	//   31   64:aload_0         
	//   32   65:aload_0         
	//   33   66:ldc1            #239 <Int 0x7f0e009f>
	//   34   68:invokevirtual   #221 <Method View findViewById(int)>
	//   35   71:checkcast       #151 <Class EditText>
	//   36   74:putfield        #143 <Field EditText emailView>
		setPasswordBtn = (Button)findViewById(0x7f0e00f6);
	//   37   77:aload_0         
	//   38   78:aload_0         
	//   39   79:ldc1            #240 <Int 0x7f0e00f6>
	//   40   81:invokevirtual   #221 <Method View findViewById(int)>
	//   41   84:checkcast       #242 <Class Button>
	//   42   87:putfield        #244 <Field Button setPasswordBtn>
		class .Lambda._cls1
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(SetPasswordActivity setpasswordactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls1) (setpasswordactivity)). new .Lambda._cls1()));
			//    0    0:new             #2   <Class SetPasswordActivity$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void SetPasswordActivity$$Lambda$1(SetPasswordActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				SetPasswordActivity.lambda$onCreate$36(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SetPasswordActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void SetPasswordActivity.lambda$onCreate$36(SetPasswordActivity, View)>
			//    4    8:return          
			}

			private final SetPasswordActivity arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SetPasswordActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SetPasswordActivity arg$1>
			//    5    9:return          
			}
		}

		setPasswordBtn.setOnClickListener(.Lambda._cls1.lambdaFactory.(this));
	//   43   90:aload_0         
	//   44   91:getfield        #244 <Field Button setPasswordBtn>
	//   45   94:aload_0         
	//   46   95:invokestatic    #249 <Method android.view.View$OnClickListener SetPasswordActivity$$Lambda$1.lambdaFactory$(SetPasswordActivity)>
	//   47   98:invokevirtual   #253 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		class .Lambda._cls2
			implements android.widget.TextView.OnEditorActionListener
		{

			public static android.widget.TextView.OnEditorActionListener lambdaFactory$(SetPasswordActivity setpasswordactivity)
			{
				return ((android.widget.TextView.OnEditorActionListener) (((.Lambda._cls2) (setpasswordactivity)). new .Lambda._cls2()));
			//    0    0:new             #2   <Class SetPasswordActivity$$Lambda$2>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void SetPasswordActivity$$Lambda$2(SetPasswordActivity)>
			//    4    8:areturn         
			}

			public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
			{
				return SetPasswordActivity.lambda$onCreate$37(arg$1, textview, i, keyevent);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SetPasswordActivity arg$1>
			//    2    4:aload_1         
			//    3    5:iload_2         
			//    4    6:aload_3         
			//    5    7:invokestatic    #28  <Method boolean SetPasswordActivity.lambda$onCreate$37(SetPasswordActivity, TextView, int, KeyEvent)>
			//    6   10:ireturn         
			}

			private final SetPasswordActivity arg$1;

			private .Lambda._cls2()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = SetPasswordActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field SetPasswordActivity arg$1>
			//    5    9:return          
			}
		}

		emailView.setOnEditorActionListener(.Lambda._cls2.lambdaFactory.(this));
	//   48  101:aload_0         
	//   49  102:getfield        #143 <Field EditText emailView>
	//   50  105:aload_0         
	//   51  106:invokestatic    #258 <Method android.widget.TextView$OnEditorActionListener SetPasswordActivity$$Lambda$2.lambdaFactory$(SetPasswordActivity)>
	//   52  109:invokevirtual   #262 <Method void EditText.setOnEditorActionListener(android.widget.TextView$OnEditorActionListener)>
	//   53  112:return          
	}

	private EditText emailView;
	private Callback handleSetPasswordCallback;
	private ProgressBar progressBar;
	private Button setPasswordBtn;
	private TextView setPasswordHelpTextView;
	private Toolbar toolbar;
	private boolean tryingToSetPassword;


/*
	static boolean access$002(SetPasswordActivity setpasswordactivity, boolean flag)
	{
		setpasswordactivity.tryingToSetPassword = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #37  <Field boolean tryingToSetPassword>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static ProgressBar access$100(SetPasswordActivity setpasswordactivity)
	{
		return setpasswordactivity.progressBar;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ProgressBar progressBar>
	//    2    4:areturn         
	}

*/


/*
	static void access$200(SetPasswordActivity setpasswordactivity)
	{
		setpasswordactivity.displaySetPasswordFailureDialog();
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void displaySetPasswordFailureDialog()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$300(SetPasswordActivity setpasswordactivity)
	{
		setpasswordactivity.goToLogin();
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void goToLogin()>
		return;
	//    2    4:return          
	}

*/
}
