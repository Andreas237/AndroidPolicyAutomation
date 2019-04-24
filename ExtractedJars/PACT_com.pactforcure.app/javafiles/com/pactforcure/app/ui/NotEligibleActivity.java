// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.*;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class NotEligibleActivity extends AppCompatActivity
{

	public NotEligibleActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AppCompatActivity()>
	//    2    4:return          
	}

	static void lambda$onCreate$21(NotEligibleActivity noteligibleactivity, View view)
	{
		noteligibleactivity.finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #14  <Method void finish()>
	//    2    4:return          
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(((Context) (CalligraphyContextWrapper.wrap(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #22  <Method android.content.ContextWrapper CalligraphyContextWrapper.wrap(Context)>
	//    3    5:invokespecial   #24  <Method void AppCompatActivity.attachBaseContext(Context)>
	//    4    8:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void AppCompatActivity.onCreate(Bundle)>
		setContentView(0x7f040026);
	//    3    5:aload_0         
	//    4    6:ldc1            #30  <Int 0x7f040026>
	//    5    8:invokevirtual   #34  <Method void setContentView(int)>
		class .Lambda._cls1
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(NotEligibleActivity noteligibleactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls1) (noteligibleactivity)). new .Lambda._cls1()));
			//    0    0:new             #2   <Class NotEligibleActivity$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void NotEligibleActivity$$Lambda$1(NotEligibleActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				NotEligibleActivity.lambda$onCreate$21(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field NotEligibleActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void NotEligibleActivity.lambda$onCreate$21(NotEligibleActivity, View)>
			//    4    8:return          
			}

			private final NotEligibleActivity arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = NotEligibleActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field NotEligibleActivity arg$1>
			//    5    9:return          
			}
		}

		findViewById(0x7f0e00df).setOnClickListener(.Lambda._cls1.lambdaFactory.(this));
	//    6   11:aload_0         
	//    7   12:ldc1            #35  <Int 0x7f0e00df>
	//    8   14:invokevirtual   #39  <Method View findViewById(int)>
	//    9   17:aload_0         
	//   10   18:invokestatic    #45  <Method android.view.View$OnClickListener NotEligibleActivity$$Lambda$1.lambdaFactory$(NotEligibleActivity)>
	//   11   21:invokevirtual   #51  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
	//   12   24:return          
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #14  <Method void finish()>
		return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
	}
}
