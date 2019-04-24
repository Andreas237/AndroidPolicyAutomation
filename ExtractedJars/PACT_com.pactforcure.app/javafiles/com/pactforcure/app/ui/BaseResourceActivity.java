// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public abstract class BaseResourceActivity extends AppCompatActivity
{

	public BaseResourceActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void AppCompatActivity()>
	//    2    4:return          
	}

	private void overridePendingTransition()
	{
		overridePendingTransition(0x7f050018, 0x7f05001b);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Int 0x7f050018>
	//    2    3:ldc1            #14  <Int 0x7f05001b>
	//    3    5:invokevirtual   #17  <Method void overridePendingTransition(int, int)>
	//    4    8:return          
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(((Context) (CalligraphyContextWrapper.wrap(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #25  <Method android.content.ContextWrapper CalligraphyContextWrapper.wrap(Context)>
	//    3    5:invokespecial   #27  <Method void AppCompatActivity.attachBaseContext(Context)>
	//    4    8:return          
	}

	protected abstract int getLayoutId();

	protected abstract String getScreenTitle();

	public void onBackPressed()
	{
		super.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void AppCompatActivity.onBackPressed()>
		overridePendingTransition();
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void overridePendingTransition()>
	//    4    8:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void AppCompatActivity.onCreate(Bundle)>
		setContentView(getLayoutId());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #43  <Method int getLayoutId()>
	//    6   10:invokevirtual   #47  <Method void setContentView(int)>
		toolbar = (Toolbar)findViewById(0x7f0e00af);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:ldc1            #48  <Int 0x7f0e00af>
	//   10   17:invokevirtual   #52  <Method android.view.View findViewById(int)>
	//   11   20:checkcast       #54  <Class Toolbar>
	//   12   23:putfield        #56  <Field Toolbar toolbar>
		setSupportActionBar(toolbar);
	//   13   26:aload_0         
	//   14   27:aload_0         
	//   15   28:getfield        #56  <Field Toolbar toolbar>
	//   16   31:invokevirtual   #60  <Method void setSupportActionBar(Toolbar)>
		setTitle(((CharSequence) (getScreenTitle())));
	//   17   34:aload_0         
	//   18   35:aload_0         
	//   19   36:invokevirtual   #62  <Method String getScreenTitle()>
	//   20   39:invokevirtual   #66  <Method void setTitle(CharSequence)>
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	//   21   42:aload_0         
	//   22   43:invokevirtual   #70  <Method ActionBar getSupportActionBar()>
	//   23   46:iconst_1        
	//   24   47:invokevirtual   #76  <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
	//   25   50:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method void finish()>
		overridePendingTransition();
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void overridePendingTransition()>
		return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	protected Toolbar toolbar;
}
