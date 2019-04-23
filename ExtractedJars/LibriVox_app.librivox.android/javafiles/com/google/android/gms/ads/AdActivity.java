// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.c.d;
import com.google.android.gms.internal.ads.*;

public class AdActivity extends Activity
{

	public AdActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Activity()>
	//    2    4:return          
	}

	private final void a()
	{
		nn nn1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field nn a>
	//    2    4:astore_1        
		if(nn1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
			try
			{
				nn1.l();
	//    5    9:aload_1         
	//    6   10:invokeinterface #20  <Method void nn.l()>
				return;
	//    7   15:return          
			}
			catch(RemoteException remoteexception)
	//*   8   16:astore_1        
			{
				aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    9   17:ldc1            #22  <String "#007 Could not call remote method.">
	//   10   19:aload_1         
	//   11   20:invokestatic    #28  <Method void aag.d(String, Throwable)>
			}
	//   12   23:return          
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		try
		{
			a.a(i, j, intent);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field nn a>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #34  <Method void nn.a(int, int, Intent)>
		}
	//*   6   12:goto            24
		catch(Exception exception)
	//*   7   15:astore          4
		{
			aag.d("#007 Could not call remote method.", ((Throwable) (exception)));
	//    8   17:ldc1            #22  <String "#007 Could not call remote method.">
	//    9   19:aload           4
	//   10   21:invokestatic    #28  <Method void aag.d(String, Throwable)>
		}
		super.onActivityResult(i, j, intent);
	//   11   24:aload_0         
	//   12   25:iload_1         
	//   13   26:iload_2         
	//   14   27:aload_3         
	//   15   28:invokespecial   #36  <Method void Activity.onActivityResult(int, int, Intent)>
	//   16   31:return          
	}

	public void onBackPressed()
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		boolean flag = flag1;
	//    2    2:iload_2         
	//    3    3:istore_1        
		try
		{
			if(a != null)
	//*   4    4:aload_0         
	//*   5    5:getfield        #15  <Field nn a>
	//*   6    8:ifnull          33
				flag = a.e();
	//    7   11:aload_0         
	//    8   12:getfield        #15  <Field nn a>
	//    9   15:invokeinterface #41  <Method boolean nn.e()>
	//   10   20:istore_1        
		}
	//*  11   21:goto            33
		catch(RemoteException remoteexception)
	//*  12   24:astore_3        
		{
			aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   13   25:ldc1            #22  <String "#007 Could not call remote method.">
	//   14   27:aload_3         
	//   15   28:invokestatic    #28  <Method void aag.d(String, Throwable)>
			flag = flag1;
	//   16   31:iload_2         
	//   17   32:istore_1        
		}
		if(flag)
	//*  18   33:iload_1         
	//*  19   34:ifeq            41
			super.onBackPressed();
	//   20   37:aload_0         
	//   21   38:invokespecial   #43  <Method void Activity.onBackPressed()>
	//   22   41:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method void Activity.onConfigurationChanged(Configuration)>
		try
		{
			a.a(d.a(((Object) (configuration))));
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field nn a>
	//    5    9:aload_1         
	//    6   10:invokestatic    #52  <Method com.google.android.gms.c.a d.a(Object)>
	//    7   13:invokeinterface #55  <Method void nn.a(com.google.android.gms.c.a)>
			return;
	//    8   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(Configuration configuration)
	//*   9   19:astore_1        
		{
			aag.d("#007 Could not call remote method.", ((Throwable) (configuration)));
	//   10   20:ldc1            #22  <String "#007 Could not call remote method.">
	//   11   22:aload_1         
	//   12   23:invokestatic    #28  <Method void aag.d(String, Throwable)>
		}
	//   13   26:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #59  <Method void Activity.onCreate(Bundle)>
		a = bwk.b().a(((Activity) (this)));
	//    3    5:aload_0         
	//    4    6:invokestatic    #65  <Method bwa bwk.b()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #70  <Method nn bwa.a(Activity)>
	//    7   13:putfield        #15  <Field nn a>
		nn nn1 = a;
	//    8   16:aload_0         
	//    9   17:getfield        #15  <Field nn a>
	//   10   20:astore_2        
		if(nn1 == null)
	//*  11   21:aload_2         
	//*  12   22:ifnonnull       36
		{
			aag.d("#007 Could not call remote method.", ((Throwable) (null)));
	//   13   25:ldc1            #22  <String "#007 Could not call remote method.">
	//   14   27:aconst_null     
	//   15   28:invokestatic    #28  <Method void aag.d(String, Throwable)>
			finish();
	//   16   31:aload_0         
	//   17   32:invokevirtual   #73  <Method void finish()>
			return;
	//   18   35:return          
		}
		try
		{
			nn1.a(bundle);
	//   19   36:aload_2         
	//   20   37:aload_1         
	//   21   38:invokeinterface #75  <Method void nn.a(Bundle)>
			return;
	//   22   43:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  23   44:astore_1        
		{
			aag.d("#007 Could not call remote method.", ((Throwable) (bundle)));
	//   24   45:ldc1            #22  <String "#007 Could not call remote method.">
	//   25   47:aload_1         
	//   26   48:invokestatic    #28  <Method void aag.d(String, Throwable)>
		}
		finish();
	//   27   51:aload_0         
	//   28   52:invokevirtual   #73  <Method void finish()>
	//   29   55:return          
	}

	protected void onDestroy()
	{
		try
		{
			if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field nn a>
	//*   2    4:ifnull          26
				a.k();
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field nn a>
	//    5   11:invokeinterface #79  <Method void nn.k()>
		}
	//*   6   16:goto            26
		catch(RemoteException remoteexception)
	//*   7   19:astore_1        
		{
			aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    8   20:ldc1            #22  <String "#007 Could not call remote method.">
	//    9   22:aload_1         
	//   10   23:invokestatic    #28  <Method void aag.d(String, Throwable)>
		}
		super.onDestroy();
	//   11   26:aload_0         
	//   12   27:invokespecial   #81  <Method void Activity.onDestroy()>
	//   13   30:return          
	}

	protected void onPause()
	{
		try
		{
			if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field nn a>
	//*   2    4:ifnull          30
				a.i();
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field nn a>
	//    5   11:invokeinterface #85  <Method void nn.i()>
		}
	//*   6   16:goto            30
		catch(RemoteException remoteexception)
	//*   7   19:astore_1        
		{
			aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    8   20:ldc1            #22  <String "#007 Could not call remote method.">
	//    9   22:aload_1         
	//   10   23:invokestatic    #28  <Method void aag.d(String, Throwable)>
			finish();
	//   11   26:aload_0         
	//   12   27:invokevirtual   #73  <Method void finish()>
		}
		super.onPause();
	//   13   30:aload_0         
	//   14   31:invokespecial   #87  <Method void Activity.onPause()>
	//   15   34:return          
	}

	protected void onRestart()
	{
		super.onRestart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #90  <Method void Activity.onRestart()>
		try
		{
			if(a != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #15  <Field nn a>
	//*   4    8:ifnull          20
				a.f();
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field nn a>
	//    7   15:invokeinterface #93  <Method void nn.f()>
			return;
	//    8   20:return          
		}
		catch(RemoteException remoteexception)
	//*   9   21:astore_1        
		{
			aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   10   22:ldc1            #22  <String "#007 Could not call remote method.">
	//   11   24:aload_1         
	//   12   25:invokestatic    #28  <Method void aag.d(String, Throwable)>
		}
		finish();
	//   13   28:aload_0         
	//   14   29:invokevirtual   #73  <Method void finish()>
	//   15   32:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void Activity.onResume()>
		try
		{
			if(a != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #15  <Field nn a>
	//*   4    8:ifnull          20
				a.h();
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field nn a>
	//    7   15:invokeinterface #99  <Method void nn.h()>
			return;
	//    8   20:return          
		}
		catch(RemoteException remoteexception)
	//*   9   21:astore_1        
		{
			aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   10   22:ldc1            #22  <String "#007 Could not call remote method.">
	//   11   24:aload_1         
	//   12   25:invokestatic    #28  <Method void aag.d(String, Throwable)>
		}
		finish();
	//   13   28:aload_0         
	//   14   29:invokevirtual   #73  <Method void finish()>
	//   15   32:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		try
		{
			if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field nn a>
	//*   2    4:ifnull          31
				a.b(bundle);
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field nn a>
	//    5   11:aload_1         
	//    6   12:invokeinterface #102 <Method void nn.b(Bundle)>
		}
	//*   7   17:goto            31
		catch(RemoteException remoteexception)
	//*   8   20:astore_2        
		{
			aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    9   21:ldc1            #22  <String "#007 Could not call remote method.">
	//   10   23:aload_2         
	//   11   24:invokestatic    #28  <Method void aag.d(String, Throwable)>
			finish();
	//   12   27:aload_0         
	//   13   28:invokevirtual   #73  <Method void finish()>
		}
		super.onSaveInstanceState(bundle);
	//   14   31:aload_0         
	//   15   32:aload_1         
	//   16   33:invokespecial   #104 <Method void Activity.onSaveInstanceState(Bundle)>
	//   17   36:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method void Activity.onStart()>
		try
		{
			if(a != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #15  <Field nn a>
	//*   4    8:ifnull          20
				a.g();
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field nn a>
	//    7   15:invokeinterface #110 <Method void nn.g()>
			return;
	//    8   20:return          
		}
		catch(RemoteException remoteexception)
	//*   9   21:astore_1        
		{
			aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   10   22:ldc1            #22  <String "#007 Could not call remote method.">
	//   11   24:aload_1         
	//   12   25:invokestatic    #28  <Method void aag.d(String, Throwable)>
		}
		finish();
	//   13   28:aload_0         
	//   14   29:invokevirtual   #73  <Method void finish()>
	//   15   32:return          
	}

	protected void onStop()
	{
		try
		{
			if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field nn a>
	//*   2    4:ifnull          30
				a.j();
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field nn a>
	//    5   11:invokeinterface #114 <Method void nn.j()>
		}
	//*   6   16:goto            30
		catch(RemoteException remoteexception)
	//*   7   19:astore_1        
		{
			aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    8   20:ldc1            #22  <String "#007 Could not call remote method.">
	//    9   22:aload_1         
	//   10   23:invokestatic    #28  <Method void aag.d(String, Throwable)>
			finish();
	//   11   26:aload_0         
	//   12   27:invokevirtual   #73  <Method void finish()>
		}
		super.onStop();
	//   13   30:aload_0         
	//   14   31:invokespecial   #116 <Method void Activity.onStop()>
	//   15   34:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #120 <Method void Activity.setContentView(int)>
		a();
	//    3    5:aload_0         
	//    4    6:invokespecial   #122 <Method void a()>
	//    5    9:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #125 <Method void Activity.setContentView(View)>
		a();
	//    3    5:aload_0         
	//    4    6:invokespecial   #122 <Method void a()>
	//    5    9:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #128 <Method void Activity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		a();
	//    4    6:aload_0         
	//    5    7:invokespecial   #122 <Method void a()>
	//    6   10:return          
	}

	private nn a;
}
