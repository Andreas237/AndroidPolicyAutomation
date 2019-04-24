// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class UnitTestActivity extends Activity
{

	public UnitTestActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Activity()>
	//    2    4:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void Activity.onCreate(Bundle)>
	//    3    5:return          
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		return super.onOptionsItemSelected(menuitem);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method boolean Activity.onOptionsItemSelected(MenuItem)>
	//    3    5:ireturn         
	}
}
