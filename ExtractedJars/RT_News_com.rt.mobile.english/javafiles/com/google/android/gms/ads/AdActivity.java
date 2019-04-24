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

public class AdActivity extends Activity
{

	public AdActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Activity()>
	//    2    4:return          
	}

	private final void zzax()
	{
		if(zzuj != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field zzaap zzuj>
	//*   2    4:ifnull          24
			try
			{
				zzuj.zzax();
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field zzaap zzuj>
	//    5   11:invokeinterface #28  <Method void zzaap.zzax()>
				return;
	//    6   16:return          
			}
			catch(RemoteException remoteexception)
	//*   7   17:astore_1        
			{
				zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    8   18:ldc1            #30  <String "#007 Could not call remote method.">
	//    9   20:aload_1         
	//   10   21:invokestatic    #36  <Method void zzane.zzd(String, Throwable)>
			}
	//   11   24:return          
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		try
		{
			zzuj.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzaap zzuj>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #42  <Method void zzaap.onActivityResult(int, int, Intent)>
		}
	//*   6   12:goto            24
		catch(Exception exception)
	//*   7   15:astore          4
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (exception)));
	//    8   17:ldc1            #30  <String "#007 Could not call remote method.">
	//    9   19:aload           4
	//   10   21:invokestatic    #36  <Method void zzane.zzd(String, Throwable)>
		}
		super.onActivityResult(i, j, intent);
	//   11   24:aload_0         
	//   12   25:iload_1         
	//   13   26:iload_2         
	//   14   27:aload_3         
	//   15   28:invokespecial   #43  <Method void Activity.onActivityResult(int, int, Intent)>
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
	//*   5    5:getfield        #24  <Field zzaap zzuj>
	//*   6    8:ifnull          33
				flag = zzuj.zznj();
	//    7   11:aload_0         
	//    8   12:getfield        #24  <Field zzaap zzuj>
	//    9   15:invokeinterface #48  <Method boolean zzaap.zznj()>
	//   10   20:istore_1        
		}
	//*  11   21:goto            33
		catch(RemoteException remoteexception)
	//*  12   24:astore_3        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   13   25:ldc1            #30  <String "#007 Could not call remote method.">
	//   14   27:aload_3         
	//   15   28:invokestatic    #36  <Method void zzane.zzd(String, Throwable)>
			flag = flag1;
	//   16   31:iload_2         
	//   17   32:istore_1        
		}
		if(flag)
	//*  18   33:iload_1         
	//*  19   34:ifeq            41
			super.onBackPressed();
	//   20   37:aload_0         
	//   21   38:invokespecial   #50  <Method void Activity.onBackPressed()>
	//   22   41:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void Activity.onConfigurationChanged(Configuration)>
		try
		{
			zzuj.zzo(ObjectWrapper.wrap(((Object) (configuration))));
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field zzaap zzuj>
	//    5    9:aload_1         
	//    6   10:invokestatic    #60  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    7   13:invokeinterface #64  <Method void zzaap.zzo(com.google.android.gms.dynamic.IObjectWrapper)>
			return;
	//    8   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(Configuration configuration)
	//*   9   19:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (configuration)));
	//   10   20:ldc1            #30  <String "#007 Could not call remote method.">
	//   11   22:aload_1         
	//   12   23:invokestatic    #36  <Method void zzane.zzd(String, Throwable)>
		}
	//   13   26:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #68  <Method void Activity.onCreate(Bundle)>
		zzuj = zzkb.zzig().zzb(((Activity) (this)));
	//    3    5:aload_0         
	//    4    6:invokestatic    #74  <Method zzjr zzkb.zzig()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #80  <Method zzaap zzjr.zzb(Activity)>
	//    7   13:putfield        #24  <Field zzaap zzuj>
		if(zzuj == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #24  <Field zzaap zzuj>
	//*  10   20:ifnonnull       34
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (null)));
	//   11   23:ldc1            #30  <String "#007 Could not call remote method.">
	//   12   25:aconst_null     
	//   13   26:invokestatic    #36  <Method void zzane.zzd(String, Throwable)>
		else
	//*  14   29:aload_0         
	//*  15   30:invokevirtual   #83  <Method void finish()>
	//*  16   33:return          
			try
			{
				zzuj.onCreate(bundle);
	//   17   34:aload_0         
	//   18   35:getfield        #24  <Field zzaap zzuj>
	//   19   38:aload_1         
	//   20   39:invokeinterface #84  <Method void zzaap.onCreate(Bundle)>
				return;
	//   21   44:return          
			}
			// Misplaced declaration of an exception variable
			catch(Bundle bundle)
	//*  22   45:astore_1        
			{
				zzane.zzd("#007 Could not call remote method.", ((Throwable) (bundle)));
	//   23   46:ldc1            #30  <String "#007 Could not call remote method.">
	//   24   48:aload_1         
	//   25   49:invokestatic    #36  <Method void zzane.zzd(String, Throwable)>
			}
		finish();
	//*  26   52:goto            29
	}

	protected void onDestroy()
	{
		try
		{
			if(zzuj != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field zzaap zzuj>
	//*   2    4:ifnull          26
				zzuj.onDestroy();
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field zzaap zzuj>
	//    5   11:invokeinterface #87  <Method void zzaap.onDestroy()>
		}
	//*   6   16:goto            26
		catch(RemoteException remoteexception)
	//*   7   19:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    8   20:ldc1            #30  <String "#007 Could not call remote method.">
	//    9   22:aload_1         
	//   10   23:invokestatic    #36  <Method void zzane.zzd(String, Throwable)>
		}
		super.onDestroy();
	//   11   26:aload_0         
	//   12   27:invokespecial   #88  <Method void Activity.onDestroy()>
	//   13   30:return          
	}

	protected void onPause()
	{
		try
		{
			if(zzuj != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field zzaap zzuj>
	//*   2    4:ifnull          30
				zzuj.onPause();
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field zzaap zzuj>
	//    5   11:invokeinterface #91  <Method void zzaap.onPause()>
		}
	//*   6   16:goto            30
		catch(RemoteException remoteexception)
	//*   7   19:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    8   20:ldc1            #30  <String "#007 Could not call remote method.">
	//    9   22:aload_1         
	//   10   23:invokestatic    #36  <Method void zzane.zzd(String, Throwable)>
			finish();
	//   11   26:aload_0         
	//   12   27:invokevirtual   #83  <Method void finish()>
		}
		super.onPause();
	//   13   30:aload_0         
	//   14   31:invokespecial   #92  <Method void Activity.onPause()>
	//   15   34:return          
	}

	protected void onRestart()
	{
		super.onRestart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method void Activity.onRestart()>
		try
		{
			if(zzuj != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #24  <Field zzaap zzuj>
	//*   4    8:ifnull          20
				zzuj.onRestart();
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field zzaap zzuj>
	//    7   15:invokeinterface #96  <Method void zzaap.onRestart()>
			return;
	//    8   20:return          
		}
		catch(RemoteException remoteexception)
	//*   9   21:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   10   22:ldc1            #30  <String "#007 Could not call remote method.">
	//   11   24:aload_1         
	//   12   25:invokestatic    #36  <Method void zzane.zzd(String, Throwable)>
		}
		finish();
	//   13   28:aload_0         
	//   14   29:invokevirtual   #83  <Method void finish()>
	//   15   32:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method void Activity.onResume()>
		try
		{
			if(zzuj != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #24  <Field zzaap zzuj>
	//*   4    8:ifnull          20
				zzuj.onResume();
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field zzaap zzuj>
	//    7   15:invokeinterface #100 <Method void zzaap.onResume()>
			return;
	//    8   20:return          
		}
		catch(RemoteException remoteexception)
	//*   9   21:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   10   22:ldc1            #30  <String "#007 Could not call remote method.">
	//   11   24:aload_1         
	//   12   25:invokestatic    #36  <Method void zzane.zzd(String, Throwable)>
		}
		finish();
	//   13   28:aload_0         
	//   14   29:invokevirtual   #83  <Method void finish()>
	//   15   32:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		try
		{
			if(zzuj != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field zzaap zzuj>
	//*   2    4:ifnull          31
				zzuj.onSaveInstanceState(bundle);
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field zzaap zzuj>
	//    5   11:aload_1         
	//    6   12:invokeinterface #103 <Method void zzaap.onSaveInstanceState(Bundle)>
		}
	//*   7   17:goto            31
		catch(RemoteException remoteexception)
	//*   8   20:astore_2        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    9   21:ldc1            #30  <String "#007 Could not call remote method.">
	//   10   23:aload_2         
	//   11   24:invokestatic    #36  <Method void zzane.zzd(String, Throwable)>
			finish();
	//   12   27:aload_0         
	//   13   28:invokevirtual   #83  <Method void finish()>
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
			if(zzuj != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #24  <Field zzaap zzuj>
	//*   4    8:ifnull          20
				zzuj.onStart();
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field zzaap zzuj>
	//    7   15:invokeinterface #108 <Method void zzaap.onStart()>
			return;
	//    8   20:return          
		}
		catch(RemoteException remoteexception)
	//*   9   21:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   10   22:ldc1            #30  <String "#007 Could not call remote method.">
	//   11   24:aload_1         
	//   12   25:invokestatic    #36  <Method void zzane.zzd(String, Throwable)>
		}
		finish();
	//   13   28:aload_0         
	//   14   29:invokevirtual   #83  <Method void finish()>
	//   15   32:return          
	}

	protected void onStop()
	{
		try
		{
			if(zzuj != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field zzaap zzuj>
	//*   2    4:ifnull          30
				zzuj.onStop();
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field zzaap zzuj>
	//    5   11:invokeinterface #111 <Method void zzaap.onStop()>
		}
	//*   6   16:goto            30
		catch(RemoteException remoteexception)
	//*   7   19:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    8   20:ldc1            #30  <String "#007 Could not call remote method.">
	//    9   22:aload_1         
	//   10   23:invokestatic    #36  <Method void zzane.zzd(String, Throwable)>
			finish();
	//   11   26:aload_0         
	//   12   27:invokevirtual   #83  <Method void finish()>
		}
		super.onStop();
	//   13   30:aload_0         
	//   14   31:invokespecial   #112 <Method void Activity.onStop()>
	//   15   34:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #116 <Method void Activity.setContentView(int)>
		zzax();
	//    3    5:aload_0         
	//    4    6:invokespecial   #117 <Method void zzax()>
	//    5    9:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #120 <Method void Activity.setContentView(View)>
		zzax();
	//    3    5:aload_0         
	//    4    6:invokespecial   #117 <Method void zzax()>
	//    5    9:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #123 <Method void Activity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		zzax();
	//    4    6:aload_0         
	//    5    7:invokespecial   #117 <Method void zzax()>
	//    6   10:return          
	}

	public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
	public static final String SIMPLE_CLASS_NAME = "AdActivity";
	private zzaap zzuj;
}
