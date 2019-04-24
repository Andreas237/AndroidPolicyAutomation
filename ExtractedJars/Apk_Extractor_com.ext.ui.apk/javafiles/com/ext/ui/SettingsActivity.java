// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.ci;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

// Referenced classes of package com.ext.ui:
//			BillingActivity, SettingsFragment

public class SettingsActivity extends BillingActivity
{

	public SettingsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void BillingActivity()>
	//    2    4:return          
	}

	public void onBackPressed()
	{
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field boolean c>
	//*   2    4:ifeq            13
			setResult(9);
	//    3    7:aload_0         
	//    4    8:bipush          9
	//    5   10:invokevirtual   #20  <Method void setResult(int)>
		super.onBackPressed();
	//    6   13:aload_0         
	//    7   14:invokespecial   #22  <Method void BillingActivity.onBackPressed()>
	//    8   17:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void BillingActivity.onCreate(Bundle)>
		setContentView(0x7f0b0042);
	//    3    5:aload_0         
	//    4    6:ldc1            #27  <Int 0x7f0b0042>
	//    5    8:invokevirtual   #30  <Method void setContentView(int)>
		ci.a("SettingsActivity : ", "onCreate");
	//    6   11:ldc1            #32  <String "SettingsActivity : ">
	//    7   13:ldc1            #33  <String "onCreate">
	//    8   15:invokestatic    #39  <Method void ci.a(String, String)>
		d = (Toolbar)findViewById(0x7f090079);
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:ldc1            #40  <Int 0x7f090079>
	//   12   22:invokevirtual   #44  <Method android.view.View findViewById(int)>
	//   13   25:checkcast       #46  <Class Toolbar>
	//   14   28:putfield        #48  <Field Toolbar d>
		d.setTitle(0x7f0d0069);
	//   15   31:aload_0         
	//   16   32:getfield        #48  <Field Toolbar d>
	//   17   35:ldc1            #49  <Int 0x7f0d0069>
	//   18   37:invokevirtual   #52  <Method void Toolbar.setTitle(int)>
		d.setNavigationIcon(0x7f080067);
	//   19   40:aload_0         
	//   20   41:getfield        #48  <Field Toolbar d>
	//   21   44:ldc1            #53  <Int 0x7f080067>
	//   22   46:invokevirtual   #56  <Method void Toolbar.setNavigationIcon(int)>
		setSupportActionBar(d);
	//   23   49:aload_0         
	//   24   50:aload_0         
	//   25   51:getfield        #48  <Field Toolbar d>
	//   26   54:invokevirtual   #60  <Method void setSupportActionBar(Toolbar)>
		getFragmentManager().beginTransaction().replace(0x7f09005b, ((android.app.Fragment) (new SettingsFragment())), "settings").commit();
	//   27   57:aload_0         
	//   28   58:invokevirtual   #64  <Method FragmentManager getFragmentManager()>
	//   29   61:invokevirtual   #70  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   30   64:ldc1            #71  <Int 0x7f09005b>
	//   31   66:new             #73  <Class SettingsFragment>
	//   32   69:dup             
	//   33   70:invokespecial   #74  <Method void SettingsFragment()>
	//   34   73:ldc1            #76  <String "settings">
	//   35   75:invokevirtual   #82  <Method FragmentTransaction FragmentTransaction.replace(int, android.app.Fragment, String)>
	//   36   78:invokevirtual   #86  <Method int FragmentTransaction.commit()>
	//   37   81:pop             
	//   38   82:return          
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method void BillingActivity.onDestroy()>
		android.app.Fragment fragment = getFragmentManager().findFragmentByTag("settings");
	//    2    4:aload_0         
	//    3    5:invokevirtual   #64  <Method FragmentManager getFragmentManager()>
	//    4    8:ldc1            #76  <String "settings">
	//    5   10:invokevirtual   #93  <Method android.app.Fragment FragmentManager.findFragmentByTag(String)>
	//    6   13:astore_1        
		getFragmentManager().beginTransaction().detach(fragment);
	//    7   14:aload_0         
	//    8   15:invokevirtual   #64  <Method FragmentManager getFragmentManager()>
	//    9   18:invokevirtual   #70  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   10   21:aload_1         
	//   11   22:invokevirtual   #97  <Method FragmentTransaction FragmentTransaction.detach(android.app.Fragment)>
	//   12   25:pop             
		ci.a("SettingsActivity : ", "onDestroy");
	//   13   26:ldc1            #32  <String "SettingsActivity : ">
	//   14   28:ldc1            #98  <String "onDestroy">
	//   15   30:invokestatic    #39  <Method void ci.a(String, String)>
	//   16   33:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(menuitem.getItemId() == 0x102002c)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #105 <Method int MenuItem.getItemId()>
	//*   2    6:ldc1            #106 <Int 0x102002c>
	//*   3    8:icmpne          30
		{
			if(c)
	//*   4   11:aload_0         
	//*   5   12:getfield        #16  <Field boolean c>
	//*   6   15:ifeq            24
				setResult(9);
	//    7   18:aload_0         
	//    8   19:bipush          9
	//    9   21:invokevirtual   #20  <Method void setResult(int)>
			finish();
	//   10   24:aload_0         
	//   11   25:invokevirtual   #109 <Method void finish()>
			return true;
	//   12   28:iconst_1        
	//   13   29:ireturn         
		} else
		{
			return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         
		}
	}

	public boolean c;
	private Toolbar d;
}
