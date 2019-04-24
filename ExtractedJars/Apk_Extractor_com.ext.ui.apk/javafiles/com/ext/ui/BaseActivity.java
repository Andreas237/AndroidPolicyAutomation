// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.cl;
import android.view.MenuItem;
import android.view.Window;

public class BaseActivity extends AppCompatActivity
{

	public BaseActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void AppCompatActivity()>
	//    2    4:return          
	}

	public void a(String s)
	{
	//    0    0:return          
	}

	protected void a(String s, cl cl1)
	{
		a = cl1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field cl a>
		if(ContextCompat.checkSelfPermission(((android.content.Context) (this)), s) == 0)
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokestatic    #21  <Method int ContextCompat.checkSelfPermission(android.content.Context, String)>
	//*   6   10:ifne            28
		{
			cl1.b(new String[] {
				s
			});
	//    7   13:aload_2         
	//    8   14:iconst_1        
	//    9   15:anewarray       String[]
	//   10   18:dup             
	//   11   19:iconst_0        
	//   12   20:aload_1         
	//   13   21:aastore         
	//   14   22:invokeinterface #29  <Method void cl.b(String[])>
			return;
	//   15   27:return          
		} else
		{
			ActivityCompat.requestPermissions(((android.app.Activity) (this)), new String[] {
				s
			}, 1);
	//   16   28:aload_0         
	//   17   29:iconst_1        
	//   18   30:anewarray       String[]
	//   19   33:dup             
	//   20   34:iconst_0        
	//   21   35:aload_1         
	//   22   36:aastore         
	//   23   37:iconst_1        
	//   24   38:invokestatic    #35  <Method void ActivityCompat.requestPermissions(android.app.Activity, String[], int)>
			return;
	//   25   41:return          
		}
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #39  <Method void AppCompatActivity.onCreate(Bundle)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   3    5:getstatic       #45  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmplt          38
		{
			getWindow().addFlags(0x80000000);
	//    6   13:aload_0         
	//    7   14:invokevirtual   #49  <Method Window getWindow()>
	//    8   17:ldc1            #50  <Int 0x80000000>
	//    9   19:invokevirtual   #56  <Method void Window.addFlags(int)>
			getWindow().setStatusBarColor(getResources().getColor(0x7f06001c));
	//   10   22:aload_0         
	//   11   23:invokevirtual   #49  <Method Window getWindow()>
	//   12   26:aload_0         
	//   13   27:invokevirtual   #60  <Method Resources getResources()>
	//   14   30:ldc1            #61  <Int 0x7f06001c>
	//   15   32:invokevirtual   #67  <Method int Resources.getColor(int)>
	//   16   35:invokevirtual   #70  <Method void Window.setStatusBarColor(int)>
		}
	//   17   38:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		return super.onOptionsItemSelected(menuitem);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #74  <Method boolean AppCompatActivity.onOptionsItemSelected(MenuItem)>
	//    3    5:ireturn         
	}

	public void onRequestPermissionsResult(int i, String as[], int ai[])
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 1: default 20
	//	               1 21
		default:
			return;
	//    2   20:return          

		case 1: // '\001'
			break;
		}
		if(ai.length > 0 && ai[0] == 0)
	//*   3   21:aload_3         
	//*   4   22:arraylength     
	//*   5   23:ifle            43
	//*   6   26:aload_3         
	//*   7   27:iconst_0        
	//*   8   28:iaload          
	//*   9   29:ifne            43
		{
			a.a(as);
	//   10   32:aload_0         
	//   11   33:getfield        #15  <Field cl a>
	//   12   36:aload_2         
	//   13   37:invokeinterface #79  <Method void cl.a(String[])>
			return;
	//   14   42:return          
		} else
		{
			a.a();
	//   15   43:aload_0         
	//   16   44:getfield        #15  <Field cl a>
	//   17   47:invokeinterface #81  <Method void cl.a()>
			return;
	//   18   52:return          
		}
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void AppCompatActivity.onStart()>
	//    2    4:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void AppCompatActivity.onStop()>
	//    2    4:return          
	}

	private cl a;
}
