// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.*;
import android.support.v7.widget.Toolbar;
import android.view.*;
import android.widget.*;
import com.pactforcure.app.participant.login.CredentialsValidationError;
import com.pactforcure.app.participant.password.ResetPassword;
import com.pactforcure.app.studies.Res;
import java.util.Iterator;
import java.util.List;
import retrofit2.*;

// Referenced classes of package com.pactforcure.app.ui:
//			MainActivity

public class ResetPasswordActivity extends AppCompatActivity
{

	public ResetPasswordActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void AppCompatActivity()>
		handleResetPasswordCallback = new Callback() {

			static void lambda$onResponse$26(_cls1 _pcls1, DialogInterface dialoginterface, int i)
			{
				_pcls1.this$0.finish();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ResetPasswordActivity this$0>
			//    2    4:invokevirtual   #24  <Method void ResetPasswordActivity.finish()>
			//    3    7:return          
			}

			public void onFailure(Call call, Throwable throwable)
			{
				enableButtonAndHideSpinner();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ResetPasswordActivity this$0>
			//    2    4:invokestatic    #29  <Method void ResetPasswordActivity.access$000(ResetPasswordActivity)>
				call = ((Call) ((new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (ResetPasswordActivity.this)))).setTitle(0x7f080027).setMessage(0x7f080028).setPositiveButton(0x7f080320, ((android.content.DialogInterface.OnClickListener) (null))).create()));
			//    3    7:new             #31  <Class android.support.v7.app.AlertDialog$Builder>
			//    4   10:dup             
			//    5   11:aload_0         
			//    6   12:getfield        #15  <Field ResetPasswordActivity this$0>
			//    7   15:invokespecial   #34  <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context)>
			//    8   18:ldc1            #35  <Int 0x7f080027>
			//    9   20:invokevirtual   #39  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(int)>
			//   10   23:ldc1            #40  <Int 0x7f080028>
			//   11   25:invokevirtual   #43  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(int)>
			//   12   28:ldc1            #44  <Int 0x7f080320>
			//   13   30:aconst_null     
			//   14   31:invokevirtual   #48  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
			//   15   34:invokevirtual   #52  <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
			//   16   37:astore_1        
				if(!isFinishing())
			//*  17   38:aload_0         
			//*  18   39:getfield        #15  <Field ResetPasswordActivity this$0>
			//*  19   42:invokevirtual   #56  <Method boolean ResetPasswordActivity.isFinishing()>
			//*  20   45:ifne            52
					((AlertDialog) (call)).show();
			//   21   48:aload_1         
			//   22   49:invokevirtual   #61  <Method void AlertDialog.show()>
			//   23   52:return          
			}

			public void onResponse(Call call, Response response)
			{
				enableButtonAndHideSpinner();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ResetPasswordActivity this$0>
			//    2    4:invokestatic    #29  <Method void ResetPasswordActivity.access$000(ResetPasswordActivity)>
				class .Lambda._cls1
					implements android.content.DialogInterface.OnClickListener
				{

					public static android.content.DialogInterface.OnClickListener lambdaFactory$(_cls1 _pcls1)
					{
						return ((android.content.DialogInterface.OnClickListener) (((.Lambda._cls1) (_pcls1)). new .Lambda._cls1()));
					//    0    0:new             #2   <Class ResetPasswordActivity$1$$Lambda$1>
					//    1    3:dup             
					//    2    4:aload_0         
					//    3    5:invokespecial   #20  <Method void ResetPasswordActivity$1$$Lambda$1(ResetPasswordActivity$1)>
					//    4    8:areturn         
					}

					public void onClick(DialogInterface dialoginterface, int i)
					{
						_cls1.lambda.onResponse._mth26(arg$1, dialoginterface, i);
					//    0    0:aload_0         
					//    1    1:getfield        #15  <Field ResetPasswordActivity$1 arg$1>
					//    2    4:aload_1         
					//    3    5:iload_2         
					//    4    6:invokestatic    #28  <Method void ResetPasswordActivity$1.lambda$onResponse$26(ResetPasswordActivity$1, DialogInterface, int)>
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
						//    4    6:putfield        #15  <Field ResetPasswordActivity$1 arg$1>
						//    5    9:return          
						}
				}

				call = ((Call) ((new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (ResetPasswordActivity.this)))).setTitle(0x7f080026).setMessage(0x7f08004a).setPositiveButton(0x7f080320, .Lambda._cls1.lambdaFactory.(this)).create()));
			//    3    7:new             #31  <Class android.support.v7.app.AlertDialog$Builder>
			//    4   10:dup             
			//    5   11:aload_0         
			//    6   12:getfield        #15  <Field ResetPasswordActivity this$0>
			//    7   15:invokespecial   #34  <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context)>
			//    8   18:ldc1            #66  <Int 0x7f080026>
			//    9   20:invokevirtual   #39  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(int)>
			//   10   23:ldc1            #67  <Int 0x7f08004a>
			//   11   25:invokevirtual   #43  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(int)>
			//   12   28:ldc1            #44  <Int 0x7f080320>
			//   13   30:aload_0         
			//   14   31:invokestatic    #73  <Method android.content.DialogInterface$OnClickListener ResetPasswordActivity$1$$Lambda$1.lambdaFactory$(ResetPasswordActivity$1)>
			//   15   34:invokevirtual   #48  <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
			//   16   37:invokevirtual   #52  <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
			//   17   40:astore_1        
				if(!isFinishing())
			//*  18   41:aload_0         
			//*  19   42:getfield        #15  <Field ResetPasswordActivity this$0>
			//*  20   45:invokevirtual   #56  <Method boolean ResetPasswordActivity.isFinishing()>
			//*  21   48:ifne            55
					((AlertDialog) (call)).show();
			//   22   51:aload_1         
			//   23   52:invokevirtual   #61  <Method void AlertDialog.show()>
			//   24   55:return          
			}

			final ResetPasswordActivity this$0;

			
			{
				this$0 = ResetPasswordActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ResetPasswordActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    2    4:aload_0         
	//    3    5:new             #6   <Class ResetPasswordActivity$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #30  <Method void ResetPasswordActivity$1(ResetPasswordActivity)>
	//    7   13:putfield        #32  <Field Callback handleResetPasswordCallback>
	//    8   16:return          
	}

	private void disableButtonAndShowSpinner()
	{
		resetPasswordBtn.setEnabled(false);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Button resetPasswordBtn>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #46  <Method void Button.setEnabled(boolean)>
		progressBar.setVisibility(0);
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field ProgressBar progressBar>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #54  <Method void ProgressBar.setVisibility(int)>
	//    8   16:return          
	}

	private void enableButtonAndHideSpinner()
	{
		resetPasswordBtn.setEnabled(true);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Button resetPasswordBtn>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #46  <Method void Button.setEnabled(boolean)>
		progressBar.setVisibility(4);
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field ProgressBar progressBar>
	//    6   12:iconst_4        
	//    7   13:invokevirtual   #54  <Method void ProgressBar.setVisibility(int)>
	//    8   16:return          
	}

	private void handleValidationErrors(List list)
	{
		list = ((List) (list.iterator()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #62  <Method Iterator List.iterator()>
	//    2    6:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//    3    7:aload_1         
	//    4    8:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            89
			CredentialsValidationError credentialsvalidationerror = (CredentialsValidationError)((Iterator) (list)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #72  <Method Object Iterator.next()>
	//    8   22:checkcast       #74  <Class CredentialsValidationError>
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
	//*  10   26:getstatic       #78  <Field int[] ResetPasswordActivity$2.$SwitchMap$com$pactforcure$app$participant$login$CredentialsValidationError>
	//*  11   29:aload_2         
	//*  12   30:invokevirtual   #82  <Method int CredentialsValidationError.ordinal()>
	//*  13   33:iaload          
			{
	//*  14   34:tableswitch     1 2: default 56
	//	               1 59
	//	               2 74
	//*  15   56:goto            7
			case 1: // '\001'
				emailView.setError(((CharSequence) (Res.getStudySpecificString(0x7f0802d3))));
	//   16   59:aload_0         
	//   17   60:getfield        #84  <Field EditText emailView>
	//   18   63:ldc1            #85  <Int 0x7f0802d3>
	//   19   65:invokestatic    #91  <Method String Res.getStudySpecificString(int)>
	//   20   68:invokevirtual   #97  <Method void EditText.setError(CharSequence)>
				break;

	//*  21   71:goto            7
			case 2: // '\002'
				emailView.setError(((CharSequence) (Res.getStudySpecificString(0x7f0802d7))));
	//   22   74:aload_0         
	//   23   75:getfield        #84  <Field EditText emailView>
	//   24   78:ldc1            #98  <Int 0x7f0802d7>
	//   25   80:invokestatic    #91  <Method String Res.getStudySpecificString(int)>
	//   26   83:invokevirtual   #97  <Method void EditText.setError(CharSequence)>
				break;
			}
		} while(true);
	//*  27   86:goto            7
	//   28   89:return          
	}

	static void lambda$onCreate$25(ResetPasswordActivity resetpasswordactivity, View view)
	{
		resetpasswordactivity.tryToResetPassword();
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method void tryToResetPassword()>
	//    2    4:return          
	}

	private void tryToResetPassword()
	{
		ResetPassword resetpassword = new ResetPassword(((Object) (emailView.getText())).toString());
	//    0    0:new             #107 <Class ResetPassword>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #84  <Field EditText emailView>
	//    4    8:invokevirtual   #111 <Method android.text.Editable EditText.getText()>
	//    5   11:invokevirtual   #117 <Method String Object.toString()>
	//    6   14:invokespecial   #120 <Method void ResetPassword(String)>
	//    7   17:astore_1        
		List list = resetpassword.validate();
	//    8   18:aload_1         
	//    9   19:invokevirtual   #124 <Method List ResetPassword.validate()>
	//   10   22:astore_2        
		if(list.isEmpty())
	//*  11   23:aload_2         
	//*  12   24:invokeinterface #127 <Method boolean List.isEmpty()>
	//*  13   29:ifeq            45
		{
			disableButtonAndShowSpinner();
	//   14   32:aload_0         
	//   15   33:invokespecial   #129 <Method void disableButtonAndShowSpinner()>
			resetpassword.startResetProcess(handleResetPasswordCallback);
	//   16   36:aload_1         
	//   17   37:aload_0         
	//   18   38:getfield        #32  <Field Callback handleResetPasswordCallback>
	//   19   41:invokevirtual   #133 <Method void ResetPassword.startResetProcess(Callback)>
			return;
	//   20   44:return          
		} else
		{
			enableButtonAndHideSpinner();
	//   21   45:aload_0         
	//   22   46:invokespecial   #37  <Method void enableButtonAndHideSpinner()>
			handleValidationErrors(list);
	//   23   49:aload_0         
	//   24   50:aload_2         
	//   25   51:invokespecial   #135 <Method void handleValidationErrors(List)>
			return;
	//   26   54:return          
		}
	}

	public void onBackPressed()
	{
		super.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #138 <Method void AppCompatActivity.onBackPressed()>
		overridePendingTransition(0x7f050018, 0x7f05001b);
	//    2    4:aload_0         
	//    3    5:ldc1            #139 <Int 0x7f050018>
	//    4    7:ldc1            #140 <Int 0x7f05001b>
	//    5    9:invokevirtual   #144 <Method void overridePendingTransition(int, int)>
	//    6   12:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #149 <Method void AppCompatActivity.onCreate(Bundle)>
		setContentView(0x7f04002a);
	//    3    5:aload_0         
	//    4    6:ldc1            #150 <Int 0x7f04002a>
	//    5    8:invokevirtual   #153 <Method void setContentView(int)>
		toolbar = (Toolbar)findViewById(0x7f0e00af);
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:ldc1            #154 <Int 0x7f0e00af>
	//    9   15:invokevirtual   #158 <Method View findViewById(int)>
	//   10   18:checkcast       #160 <Class Toolbar>
	//   11   21:putfield        #162 <Field Toolbar toolbar>
		setSupportActionBar(toolbar);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #162 <Field Toolbar toolbar>
	//   15   29:invokevirtual   #166 <Method void setSupportActionBar(Toolbar)>
		setTitle(0x7f080052);
	//   16   32:aload_0         
	//   17   33:ldc1            #167 <Int 0x7f080052>
	//   18   35:invokevirtual   #170 <Method void setTitle(int)>
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	//   19   38:aload_0         
	//   20   39:invokevirtual   #174 <Method ActionBar getSupportActionBar()>
	//   21   42:iconst_1        
	//   22   43:invokevirtual   #179 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
		progressBar = (ProgressBar)findViewById(0x7f0e00a9);
	//   23   46:aload_0         
	//   24   47:aload_0         
	//   25   48:ldc1            #180 <Int 0x7f0e00a9>
	//   26   50:invokevirtual   #158 <Method View findViewById(int)>
	//   27   53:checkcast       #50  <Class ProgressBar>
	//   28   56:putfield        #48  <Field ProgressBar progressBar>
		emailView = (EditText)findViewById(0x7f0e009f);
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:ldc1            #181 <Int 0x7f0e009f>
	//   32   63:invokevirtual   #158 <Method View findViewById(int)>
	//   33   66:checkcast       #93  <Class EditText>
	//   34   69:putfield        #84  <Field EditText emailView>
		resetPasswordBtn = (Button)findViewById(0x7f0e00cc);
	//   35   72:aload_0         
	//   36   73:aload_0         
	//   37   74:ldc1            #182 <Int 0x7f0e00cc>
	//   38   76:invokevirtual   #158 <Method View findViewById(int)>
	//   39   79:checkcast       #42  <Class Button>
	//   40   82:putfield        #40  <Field Button resetPasswordBtn>
		emailView.setHint(((CharSequence) (Res.getStudySpecificString(0x7f080330))));
	//   41   85:aload_0         
	//   42   86:getfield        #84  <Field EditText emailView>
	//   43   89:ldc1            #183 <Int 0x7f080330>
	//   44   91:invokestatic    #91  <Method String Res.getStudySpecificString(int)>
	//   45   94:invokevirtual   #186 <Method void EditText.setHint(CharSequence)>
		class .Lambda._cls1
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(ResetPasswordActivity resetpasswordactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls1) (resetpasswordactivity)). new .Lambda._cls1()));
			//    0    0:new             #2   <Class ResetPasswordActivity$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void ResetPasswordActivity$$Lambda$1(ResetPasswordActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				ResetPasswordActivity.lambda$onCreate$25(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ResetPasswordActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void ResetPasswordActivity.lambda$onCreate$25(ResetPasswordActivity, View)>
			//    4    8:return          
			}

			private final ResetPasswordActivity arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = ResetPasswordActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field ResetPasswordActivity arg$1>
			//    5    9:return          
			}
		}

		resetPasswordBtn.setOnClickListener(.Lambda._cls1.lambdaFactory.(this));
	//   46   97:aload_0         
	//   47   98:getfield        #40  <Field Button resetPasswordBtn>
	//   48  101:aload_0         
	//   49  102:invokestatic    #192 <Method android.view.View$OnClickListener ResetPasswordActivity$$Lambda$1.lambdaFactory$(ResetPasswordActivity)>
	//   50  105:invokevirtual   #196 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
	//   51  108:return          
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		toolbar.inflateMenu(0x7f0f0004);
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field Toolbar toolbar>
	//    2    4:ldc1            #200 <Int 0x7f0f0004>
	//    3    6:invokevirtual   #203 <Method void Toolbar.inflateMenu(int)>
		return true;
	//    4    9:iconst_1        
	//    5   10:ireturn         
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		menuitem.getItemId();
	//    0    0:aload_1         
	//    1    1:invokeinterface #210 <Method int MenuItem.getItemId()>
		JVM INSTR lookupswitch 2: default 32
	//	               16908332: 34
	//	               2131624317: 41;
	//    2    6:lookupswitch    2: default 32
	//	               16908332: 34
	//	               2131624317: 41
		   goto _L1 _L2 _L3
_L1:
		return false;
	//    3   32:iconst_0        
	//    4   33:ireturn         
_L2:
		onBackPressed();
	//    5   34:aload_0         
	//    6   35:invokevirtual   #211 <Method void onBackPressed()>
		  goto _L1
	//*   7   38:goto            32
_L3:
		menuitem = ((MenuItem) (new Intent(((android.content.Context) (this)), com/pactforcure/app/ui/MainActivity)));
	//    8   41:new             #213 <Class Intent>
	//    9   44:dup             
	//   10   45:aload_0         
	//   11   46:ldc1            #215 <Class MainActivity>
	//   12   48:invokespecial   #218 <Method void Intent(android.content.Context, Class)>
	//   13   51:astore_1        
		((Intent) (menuitem)).setFlags(0x10008000);
	//   14   52:aload_1         
	//   15   53:ldc1            #219 <Int 0x10008000>
	//   16   55:invokevirtual   #223 <Method Intent Intent.setFlags(int)>
	//   17   58:pop             
		startActivity(((Intent) (menuitem)));
	//   18   59:aload_0         
	//   19   60:aload_1         
	//   20   61:invokevirtual   #227 <Method void startActivity(Intent)>
		return true;
	//   21   64:iconst_1        
	//   22   65:ireturn         
	}

	private static final String TAG = "ResetPasswordActivity";
	private EditText emailView;
	private Callback handleResetPasswordCallback;
	private ProgressBar progressBar;
	private Button resetPasswordBtn;
	private Toolbar toolbar;


/*
	static void access$000(ResetPasswordActivity resetpasswordactivity)
	{
		resetpasswordactivity.enableButtonAndHideSpinner();
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void enableButtonAndHideSpinner()>
		return;
	//    2    4:return          
	}

*/
}
