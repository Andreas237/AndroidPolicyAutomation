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
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.*;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

public class AdActivity extends Activity
	implements TraceFieldInterface
{

	public AdActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Activity()>
	//    2    4:return          
	}

	private final void zzax()
	{
		zzaap zzaap1 = zzuj;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field zzaap zzuj>
	//    2    4:astore_1        
		if(zzaap1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
			try
			{
				zzaap1.zzax();
	//    5    9:aload_1         
	//    6   10:invokeinterface #33  <Method void zzaap.zzax()>
				return;
	//    7   15:return          
			}
			catch(RemoteException remoteexception)
	//*   8   16:astore_1        
			{
				zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    9   17:ldc1            #35  <String "#007 Could not call remote method.">
	//   10   19:aload_1         
	//   11   20:invokestatic    #41  <Method void zzane.zzd(String, Throwable)>
			}
	//   12   23:return          
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		try
		{
			zzuj.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field zzaap zzuj>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #47  <Method void zzaap.onActivityResult(int, int, Intent)>
		}
	//*   6   12:goto            24
		catch(Exception exception)
	//*   7   15:astore          4
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (exception)));
	//    8   17:ldc1            #35  <String "#007 Could not call remote method.">
	//    9   19:aload           4
	//   10   21:invokestatic    #41  <Method void zzane.zzd(String, Throwable)>
		}
		super.onActivityResult(i, j, intent);
	//   11   24:aload_0         
	//   12   25:iload_1         
	//   13   26:iload_2         
	//   14   27:aload_3         
	//   15   28:invokespecial   #48  <Method void Activity.onActivityResult(int, int, Intent)>
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
			if(zzuj != null)
	//*   4    4:aload_0         
	//*   5    5:getfield        #29  <Field zzaap zzuj>
	//*   6    8:ifnull          33
				flag = zzuj.zznj();
	//    7   11:aload_0         
	//    8   12:getfield        #29  <Field zzaap zzuj>
	//    9   15:invokeinterface #53  <Method boolean zzaap.zznj()>
	//   10   20:istore_1        
		}
	//*  11   21:goto            33
		catch(RemoteException remoteexception)
	//*  12   24:astore_3        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   13   25:ldc1            #35  <String "#007 Could not call remote method.">
	//   14   27:aload_3         
	//   15   28:invokestatic    #41  <Method void zzane.zzd(String, Throwable)>
			flag = flag1;
	//   16   31:iload_2         
	//   17   32:istore_1        
		}
		if(flag)
	//*  18   33:iload_1         
	//*  19   34:ifeq            41
			super.onBackPressed();
	//   20   37:aload_0         
	//   21   38:invokespecial   #55  <Method void Activity.onBackPressed()>
	//   22   41:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #59  <Method void Activity.onConfigurationChanged(Configuration)>
		try
		{
			zzuj.zzo(ObjectWrapper.wrap(((Object) (configuration))));
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field zzaap zzuj>
	//    5    9:aload_1         
	//    6   10:invokestatic    #65  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    7   13:invokeinterface #69  <Method void zzaap.zzo(com.google.android.gms.dynamic.IObjectWrapper)>
			return;
	//    8   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(Configuration configuration)
	//*   9   19:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (configuration)));
	//   10   20:ldc1            #35  <String "#007 Could not call remote method.">
	//   11   22:aload_1         
	//   12   23:invokestatic    #41  <Method void zzane.zzd(String, Throwable)>
		}
	//   13   26:return          
	}

	protected void onCreate(Bundle bundle)
	{
		TraceMachine.startTracing("AdActivity");
	//    0    0:ldc1            #15  <String "AdActivity">
	//    1    2:invokestatic    #79  <Method void TraceMachine.startTracing(String)>
		TraceMachine.enterMethod(_nr_trace, "AdActivity#onCreate", ((java.util.ArrayList) (null)));
	//    2    5:aload_0         
	//    3    6:getfield        #81  <Field Trace _nr_trace>
	//    4    9:ldc1            #83  <String "AdActivity#onCreate">
	//    5   11:aconst_null     
	//    6   12:invokestatic    #87  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   7   15:goto            25
_L7:
		TraceMachine.enterMethod(((Trace) (null)), "AdActivity#onCreate", ((java.util.ArrayList) (null)));
	//    8   18:aconst_null     
	//    9   19:ldc1            #83  <String "AdActivity#onCreate">
	//   10   21:aconst_null     
	//   11   22:invokestatic    #87  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		zzaap zzaap1;
		super.onCreate(bundle);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokespecial   #89  <Method void Activity.onCreate(Bundle)>
		zzuj = zzkb.zzig().zzb(((Activity) (this)));
	//   15   30:aload_0         
	//   16   31:invokestatic    #95  <Method zzjr zzkb.zzig()>
	//   17   34:aload_0         
	//   18   35:invokevirtual   #101 <Method zzaap zzjr.zzb(Activity)>
	//   19   38:putfield        #29  <Field zzaap zzuj>
		zzaap1 = zzuj;
	//   20   41:aload_0         
	//   21   42:getfield        #29  <Field zzaap zzuj>
	//   22   45:astore_2        
		if(zzaap1 != null) goto _L3; else goto _L2
	//   23   46:aload_2         
	//   24   47:ifnonnull       64
_L2:
		zzane.zzd("#007 Could not call remote method.", ((Throwable) (null)));
	//   25   50:ldc1            #35  <String "#007 Could not call remote method.">
	//   26   52:aconst_null     
	//   27   53:invokestatic    #41  <Method void zzane.zzd(String, Throwable)>
_L5:
		finish();
	//   28   56:aload_0         
	//   29   57:invokevirtual   #104 <Method void finish()>
		TraceMachine.exitMethod();
	//   30   60:invokestatic    #107 <Method void TraceMachine.exitMethod()>
		return;
	//   31   63:return          
_L3:
		zzaap1.onCreate(bundle);
	//   32   64:aload_2         
	//   33   65:aload_1         
	//   34   66:invokeinterface #108 <Method void zzaap.onCreate(Bundle)>
		TraceMachine.exitMethod();
	//   35   71:invokestatic    #107 <Method void TraceMachine.exitMethod()>
		return;
	//   36   74:return          
		bundle;
	//   37   75:astore_1        
		zzane.zzd("#007 Could not call remote method.", ((Throwable) (bundle)));
	//   38   76:ldc1            #35  <String "#007 Could not call remote method.">
	//   39   78:aload_1         
	//   40   79:invokestatic    #41  <Method void zzane.zzd(String, Throwable)>
		if(true) goto _L5; else goto _L4
	//   41   82:goto            56
_L4:
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   42   85:astore_2        
		if(true) goto _L7; else goto _L6
_L6:
	//*  43   86:goto            18
	}

	protected void onDestroy()
	{
		try
		{
			if(zzuj != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field zzaap zzuj>
	//*   2    4:ifnull          26
				zzuj.onDestroy();
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field zzaap zzuj>
	//    5   11:invokeinterface #111 <Method void zzaap.onDestroy()>
		}
	//*   6   16:goto            26
		catch(RemoteException remoteexception)
	//*   7   19:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    8   20:ldc1            #35  <String "#007 Could not call remote method.">
	//    9   22:aload_1         
	//   10   23:invokestatic    #41  <Method void zzane.zzd(String, Throwable)>
		}
		super.onDestroy();
	//   11   26:aload_0         
	//   12   27:invokespecial   #112 <Method void Activity.onDestroy()>
	//   13   30:return          
	}

	protected void onPause()
	{
		try
		{
			if(zzuj != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field zzaap zzuj>
	//*   2    4:ifnull          30
				zzuj.onPause();
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field zzaap zzuj>
	//    5   11:invokeinterface #115 <Method void zzaap.onPause()>
		}
	//*   6   16:goto            30
		catch(RemoteException remoteexception)
	//*   7   19:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    8   20:ldc1            #35  <String "#007 Could not call remote method.">
	//    9   22:aload_1         
	//   10   23:invokestatic    #41  <Method void zzane.zzd(String, Throwable)>
			finish();
	//   11   26:aload_0         
	//   12   27:invokevirtual   #104 <Method void finish()>
		}
		super.onPause();
	//   13   30:aload_0         
	//   14   31:invokespecial   #116 <Method void Activity.onPause()>
	//   15   34:return          
	}

	protected void onRestart()
	{
		super.onRestart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #119 <Method void Activity.onRestart()>
		try
		{
			if(zzuj != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #29  <Field zzaap zzuj>
	//*   4    8:ifnull          20
				zzuj.onRestart();
	//    5   11:aload_0         
	//    6   12:getfield        #29  <Field zzaap zzuj>
	//    7   15:invokeinterface #120 <Method void zzaap.onRestart()>
			return;
	//    8   20:return          
		}
		catch(RemoteException remoteexception)
	//*   9   21:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   10   22:ldc1            #35  <String "#007 Could not call remote method.">
	//   11   24:aload_1         
	//   12   25:invokestatic    #41  <Method void zzane.zzd(String, Throwable)>
		}
		finish();
	//   13   28:aload_0         
	//   14   29:invokevirtual   #104 <Method void finish()>
	//   15   32:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #123 <Method void Activity.onResume()>
		try
		{
			if(zzuj != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #29  <Field zzaap zzuj>
	//*   4    8:ifnull          20
				zzuj.onResume();
	//    5   11:aload_0         
	//    6   12:getfield        #29  <Field zzaap zzuj>
	//    7   15:invokeinterface #124 <Method void zzaap.onResume()>
			return;
	//    8   20:return          
		}
		catch(RemoteException remoteexception)
	//*   9   21:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   10   22:ldc1            #35  <String "#007 Could not call remote method.">
	//   11   24:aload_1         
	//   12   25:invokestatic    #41  <Method void zzane.zzd(String, Throwable)>
		}
		finish();
	//   13   28:aload_0         
	//   14   29:invokevirtual   #104 <Method void finish()>
	//   15   32:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		try
		{
			if(zzuj != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field zzaap zzuj>
	//*   2    4:ifnull          31
				zzuj.onSaveInstanceState(bundle);
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field zzaap zzuj>
	//    5   11:aload_1         
	//    6   12:invokeinterface #127 <Method void zzaap.onSaveInstanceState(Bundle)>
		}
	//*   7   17:goto            31
		catch(RemoteException remoteexception)
	//*   8   20:astore_2        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    9   21:ldc1            #35  <String "#007 Could not call remote method.">
	//   10   23:aload_2         
	//   11   24:invokestatic    #41  <Method void zzane.zzd(String, Throwable)>
			finish();
	//   12   27:aload_0         
	//   13   28:invokevirtual   #104 <Method void finish()>
		}
		super.onSaveInstanceState(bundle);
	//   14   31:aload_0         
	//   15   32:aload_1         
	//   16   33:invokespecial   #128 <Method void Activity.onSaveInstanceState(Bundle)>
	//   17   36:return          
	}

	protected void onStart()
	{
		ApplicationStateMonitor.getInstance().activityStarted();
	//    0    0:invokestatic    #135 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    1    3:invokevirtual   #138 <Method void ApplicationStateMonitor.activityStarted()>
		super.onStart();
	//    2    6:aload_0         
	//    3    7:invokespecial   #140 <Method void Activity.onStart()>
		try
		{
			if(zzuj != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #29  <Field zzaap zzuj>
	//*   6   14:ifnull          26
				zzuj.onStart();
	//    7   17:aload_0         
	//    8   18:getfield        #29  <Field zzaap zzuj>
	//    9   21:invokeinterface #141 <Method void zzaap.onStart()>
			return;
	//   10   26:return          
		}
		catch(RemoteException remoteexception)
	//*  11   27:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   12   28:ldc1            #35  <String "#007 Could not call remote method.">
	//   13   30:aload_1         
	//   14   31:invokestatic    #41  <Method void zzane.zzd(String, Throwable)>
		}
		finish();
	//   15   34:aload_0         
	//   16   35:invokevirtual   #104 <Method void finish()>
	//   17   38:return          
	}

	protected void onStop()
	{
		ApplicationStateMonitor.getInstance().activityStopped();
	//    0    0:invokestatic    #135 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    1    3:invokevirtual   #145 <Method void ApplicationStateMonitor.activityStopped()>
		try
		{
			if(zzuj != null)
	//*   2    6:aload_0         
	//*   3    7:getfield        #29  <Field zzaap zzuj>
	//*   4   10:ifnull          36
				zzuj.onStop();
	//    5   13:aload_0         
	//    6   14:getfield        #29  <Field zzaap zzuj>
	//    7   17:invokeinterface #147 <Method void zzaap.onStop()>
		}
	//*   8   22:goto            36
		catch(RemoteException remoteexception)
	//*   9   25:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   10   26:ldc1            #35  <String "#007 Could not call remote method.">
	//   11   28:aload_1         
	//   12   29:invokestatic    #41  <Method void zzane.zzd(String, Throwable)>
			finish();
	//   13   32:aload_0         
	//   14   33:invokevirtual   #104 <Method void finish()>
		}
		super.onStop();
	//   15   36:aload_0         
	//   16   37:invokespecial   #148 <Method void Activity.onStop()>
	//   17   40:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #152 <Method void Activity.setContentView(int)>
		zzax();
	//    3    5:aload_0         
	//    4    6:invokespecial   #153 <Method void zzax()>
	//    5    9:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #156 <Method void Activity.setContentView(View)>
		zzax();
	//    3    5:aload_0         
	//    4    6:invokespecial   #153 <Method void zzax()>
	//    5    9:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #159 <Method void Activity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		zzax();
	//    4    6:aload_0         
	//    5    7:invokespecial   #153 <Method void zzax()>
	//    6   10:return          
	}

	public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
	public static final String SIMPLE_CLASS_NAME = "AdActivity";
	public Trace _nr_trace;
	private zzaap zzuj;
}
