// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.util.DialogUtils;

public abstract class FormActivity extends AppCompatActivity
{

	public FormActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void AppCompatActivity()>
	//    2    4:return          
	}

	static void lambda$onOptionsItemSelected$3(FormActivity formactivity, DialogInterface dialoginterface, int i)
	{
		formactivity.setResult(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #22  <Method void setResult(int)>
		formactivity.finish();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #25  <Method void finish()>
	//    5    9:return          
	}

	public void displayRegistrationError(String s)
	{
		bottomBarBtn.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field TextView bottomBarBtn>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #34  <Method void TextView.setVisibility(int)>
		progressBar.setVisibility(8);
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field ProgressBar progressBar>
	//    6   12:bipush          8
	//    7   14:invokevirtual   #39  <Method void ProgressBar.setVisibility(int)>
		messageView.setText(((CharSequence) (s)));
	//    8   17:aload_0         
	//    9   18:getfield        #41  <Field TextView messageView>
	//   10   21:aload_1         
	//   11   22:invokevirtual   #45  <Method void TextView.setText(CharSequence)>
		bottomBarBtn.setText(((CharSequence) (Res.getStudySpecificString(0x7f08036e))));
	//   12   25:aload_0         
	//   13   26:getfield        #29  <Field TextView bottomBarBtn>
	//   14   29:ldc1            #46  <Int 0x7f08036e>
	//   15   31:invokestatic    #52  <Method String Res.getStudySpecificString(int)>
	//   16   34:invokevirtual   #45  <Method void TextView.setText(CharSequence)>
	//   17   37:return          
	}

	protected abstract int getLayoutResId();

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #59  <Method void AppCompatActivity.onCreate(Bundle)>
		setContentView(getLayoutResId());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #61  <Method int getLayoutResId()>
	//    6   10:invokevirtual   #64  <Method void setContentView(int)>
		toolbar = (Toolbar)findViewById(0x7f0e00af);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:ldc1            #65  <Int 0x7f0e00af>
	//   10   17:invokevirtual   #69  <Method android.view.View findViewById(int)>
	//   11   20:checkcast       #71  <Class Toolbar>
	//   12   23:putfield        #73  <Field Toolbar toolbar>
		setSupportActionBar(toolbar);
	//   13   26:aload_0         
	//   14   27:aload_0         
	//   15   28:getfield        #73  <Field Toolbar toolbar>
	//   16   31:invokevirtual   #77  <Method void setSupportActionBar(Toolbar)>
		messageView = (TextView)findViewById(0x7f0e00a7);
	//   17   34:aload_0         
	//   18   35:aload_0         
	//   19   36:ldc1            #78  <Int 0x7f0e00a7>
	//   20   38:invokevirtual   #69  <Method android.view.View findViewById(int)>
	//   21   41:checkcast       #31  <Class TextView>
	//   22   44:putfield        #41  <Field TextView messageView>
		bottomBarBtn = (TextView)findViewById(0x7f0e00a8);
	//   23   47:aload_0         
	//   24   48:aload_0         
	//   25   49:ldc1            #79  <Int 0x7f0e00a8>
	//   26   51:invokevirtual   #69  <Method android.view.View findViewById(int)>
	//   27   54:checkcast       #31  <Class TextView>
	//   28   57:putfield        #29  <Field TextView bottomBarBtn>
		progressBar = (ProgressBar)findViewById(0x7f0e00a9);
	//   29   60:aload_0         
	//   30   61:aload_0         
	//   31   62:ldc1            #80  <Int 0x7f0e00a9>
	//   32   64:invokevirtual   #69  <Method android.view.View findViewById(int)>
	//   33   67:checkcast       #38  <Class ProgressBar>
	//   34   70:putfield        #36  <Field ProgressBar progressBar>
	//   35   73:return          
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		toolbar.inflateMenu(0x7f0f0003);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Toolbar toolbar>
	//    2    4:ldc1            #84  <Int 0x7f0f0003>
	//    3    6:invokevirtual   #87  <Method void Toolbar.inflateMenu(int)>
		return true;
	//    4    9:iconst_1        
	//    5   10:ireturn         
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		class .Lambda._cls1
			implements android.content.DialogInterface.OnClickListener
		{

			public static android.content.DialogInterface.OnClickListener lambdaFactory$(FormActivity formactivity)
			{
				return ((android.content.DialogInterface.OnClickListener) (((.Lambda._cls1) (formactivity)). new .Lambda._cls1()));
			//    0    0:new             #2   <Class FormActivity$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void FormActivity$$Lambda$1(FormActivity)>
			//    4    8:areturn         
			}

			public void onClick(DialogInterface dialoginterface, int i)
			{
				FormActivity.lambda$onOptionsItemSelected$3(arg$1, dialoginterface, i);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field FormActivity arg$1>
			//    2    4:aload_1         
			//    3    5:iload_2         
			//    4    6:invokestatic    #28  <Method void FormActivity.lambda$onOptionsItemSelected$3(FormActivity, DialogInterface, int)>
			//    5    9:return          
			}

			private final FormActivity arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = FormActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field FormActivity arg$1>
			//    5    9:return          
			}
		}

		menuitem = ((MenuItem) ((new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(((CharSequence) (getString(0x7f080078)))).setNegativeButton(0x7f080077, ((android.content.DialogInterface.OnClickListener) (null))).setPositiveButton(0x7f08006b, .Lambda._cls1.lambdaFactory.(this)).create()));
	//    0    0:new             #91  <Class android.support.v7.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #94  <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:aload_0         
	//    5    9:ldc1            #95  <Int 0x7f080078>
	//    6   11:invokevirtual   #98  <Method String getString(int)>
	//    7   14:invokevirtual   #102 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(CharSequence)>
	//    8   17:ldc1            #103 <Int 0x7f080077>
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #107 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   11   23:ldc1            #108 <Int 0x7f08006b>
	//   12   25:aload_0         
	//   13   26:invokestatic    #114 <Method android.content.DialogInterface$OnClickListener FormActivity$$Lambda$1.lambdaFactory$(FormActivity)>
	//   14   29:invokevirtual   #117 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   15   32:invokevirtual   #121 <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   16   35:astore_1        
		DialogUtils.boldPositiveAndNegativeButtons(((AlertDialog) (menuitem)));
	//   17   36:aload_1         
	//   18   37:invokestatic    #127 <Method void DialogUtils.boldPositiveAndNegativeButtons(AlertDialog)>
		((AlertDialog) (menuitem)).show();
	//   19   40:aload_1         
	//   20   41:invokevirtual   #132 <Method void AlertDialog.show()>
		return true;
	//   21   44:iconst_1        
	//   22   45:ireturn         
	}

	protected TextView bottomBarBtn;
	protected TextView messageView;
	protected ProgressBar progressBar;
	protected Toolbar toolbar;
}
