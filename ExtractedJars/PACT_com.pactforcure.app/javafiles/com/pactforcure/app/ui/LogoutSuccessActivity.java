// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

// Referenced classes of package com.pactforcure.app.ui:
//			MainActivity

public class LogoutSuccessActivity extends AppCompatActivity
{

	public LogoutSuccessActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void AppCompatActivity()>
	//    2    4:return          
	}

	private void gotoMainScreen()
	{
		Intent intent = new Intent(((android.content.Context) (this)), com/pactforcure/app/ui/MainActivity);
	//    0    0:new             #14  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #16  <Class MainActivity>
	//    4    7:invokespecial   #19  <Method void Intent(android.content.Context, Class)>
	//    5   10:astore_1        
		intent.setFlags(0x10008000);
	//    6   11:aload_1         
	//    7   12:ldc1            #20  <Int 0x10008000>
	//    8   14:invokevirtual   #24  <Method Intent Intent.setFlags(int)>
	//    9   17:pop             
		startActivity(intent);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #28  <Method void startActivity(Intent)>
	//   13   23:return          
	}

	public void onBackPressed()
	{
		gotoMainScreen();
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void gotoMainScreen()>
	//    2    4:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void AppCompatActivity.onCreate(Bundle)>
		setContentView(0x7f040024);
	//    3    5:aload_0         
	//    4    6:ldc1            #37  <Int 0x7f040024>
	//    5    8:invokevirtual   #41  <Method void setContentView(int)>
		toolbar = (Toolbar)findViewById(0x7f0e00af);
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:ldc1            #42  <Int 0x7f0e00af>
	//    9   15:invokevirtual   #46  <Method android.view.View findViewById(int)>
	//   10   18:checkcast       #48  <Class Toolbar>
	//   11   21:putfield        #50  <Field Toolbar toolbar>
		setSupportActionBar(toolbar);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #50  <Field Toolbar toolbar>
	//   15   29:invokevirtual   #54  <Method void setSupportActionBar(Toolbar)>
		setTitle(0x7f080039);
	//   16   32:aload_0         
	//   17   33:ldc1            #55  <Int 0x7f080039>
	//   18   35:invokevirtual   #58  <Method void setTitle(int)>
	//   19   38:return          
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		toolbar.inflateMenu(0x7f0f0002);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Toolbar toolbar>
	//    2    4:ldc1            #62  <Int 0x7f0f0002>
	//    3    6:invokevirtual   #65  <Method void Toolbar.inflateMenu(int)>
		return true;
	//    4    9:iconst_1        
	//    5   10:ireturn         
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		gotoMainScreen();
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void gotoMainScreen()>
		return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
	}

	private Toolbar toolbar;
}
