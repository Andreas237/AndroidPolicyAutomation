// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.*;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.*;
import com.newrelic.agent.android.instrumentation.AsyncTaskInstrumentation;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;
import java.util.*;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.ads.internal:
//			zzbs, zzbu, zzbq, zzbr, 
//			zzbt

public final class zzbp extends zzkt
{

	public zzbp(Context context, zzjn zzjn, String s, zzang zzang)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void zzkt()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field Context mContext>
		zzyf = zzang;
	//    5    9:aload_0         
	//    6   10:aload           4
	//    7   12:putfield        #37  <Field zzang zzyf>
		zzaau = zzjn;
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:putfield        #39  <Field zzjn zzaau>
		zzaax = new WebView(mContext);
	//   11   20:aload_0         
	//   12   21:new             #41  <Class WebView>
	//   13   24:dup             
	//   14   25:aload_0         
	//   15   26:getfield        #35  <Field Context mContext>
	//   16   29:invokespecial   #44  <Method void WebView(Context)>
	//   17   32:putfield        #46  <Field WebView zzaax>
	//   18   35:aload_0         
	//   19   36:new             #48  <Class zzbs>
	//   20   39:dup             
	//   21   40:aload_0         
	//   22   41:invokespecial   #51  <Method void zzbs(zzbp)>
	//   23   44:invokestatic    #57  <Method com.google.android.gms.internal.ads.zzanz zzaki.zza(java.util.concurrent.Callable)>
	//   24   47:putfield        #59  <Field Future zzaav>
		zzaaw = new zzbu(s);
	//   25   50:aload_0         
	//   26   51:new             #61  <Class zzbu>
	//   27   54:dup             
	//   28   55:aload_3         
	//   29   56:invokespecial   #64  <Method void zzbu(String)>
	//   30   59:putfield        #66  <Field zzbu zzaaw>
		zzk(0);
	//   31   62:aload_0         
	//   32   63:iconst_0        
	//   33   64:invokevirtual   #70  <Method void zzk(int)>
		zzaax.setVerticalScrollBarEnabled(false);
	//   34   67:aload_0         
	//   35   68:getfield        #46  <Field WebView zzaax>
	//   36   71:iconst_0        
	//   37   72:invokevirtual   #74  <Method void WebView.setVerticalScrollBarEnabled(boolean)>
		zzaax.getSettings().setJavaScriptEnabled(true);
	//   38   75:aload_0         
	//   39   76:getfield        #46  <Field WebView zzaax>
	//   40   79:invokevirtual   #78  <Method WebSettings WebView.getSettings()>
	//   41   82:iconst_1        
	//   42   83:invokevirtual   #83  <Method void WebSettings.setJavaScriptEnabled(boolean)>
		zzaax.setWebViewClient(((android.webkit.WebViewClient) (new zzbq(this))));
	//   43   86:aload_0         
	//   44   87:getfield        #46  <Field WebView zzaax>
	//   45   90:new             #85  <Class zzbq>
	//   46   93:dup             
	//   47   94:aload_0         
	//   48   95:invokespecial   #86  <Method void zzbq(zzbp)>
	//   49   98:invokevirtual   #90  <Method void WebView.setWebViewClient(android.webkit.WebViewClient)>
		context = ((Context) (zzaax));
	//   50  101:aload_0         
	//   51  102:getfield        #46  <Field WebView zzaax>
	//   52  105:astore_1        
		zzjn = ((zzjn) (new zzbr(this)));
	//   53  106:new             #92  <Class zzbr>
	//   54  109:dup             
	//   55  110:aload_0         
	//   56  111:invokespecial   #93  <Method void zzbr(zzbp)>
	//   57  114:astore_2        
		if(!(context instanceof View))
	//*  58  115:aload_1         
	//*  59  116:instanceof      #95  <Class View>
	//*  60  119:ifne            128
		{
			((WebView) (context)).setOnTouchListener(((android.view.View.OnTouchListener) (zzjn)));
	//   61  122:aload_1         
	//   62  123:aload_2         
	//   63  124:invokevirtual   #99  <Method void WebView.setOnTouchListener(android.view.View$OnTouchListener)>
			return;
	//   64  127:return          
		} else
		{
			ViewInstrumentation.setOnTouchListener((View)context, ((android.view.View.OnTouchListener) (zzjn)));
	//   65  128:aload_1         
	//   66  129:checkcast       #95  <Class View>
	//   67  132:aload_2         
	//   68  133:invokestatic    #104 <Method void ViewInstrumentation.setOnTouchListener(View, android.view.View$OnTouchListener)>
			return;
	//   69  136:return          
		}
	}

	static zzci zza(zzbp zzbp1, zzci zzci1)
	{
		zzbp1.zzaay = zzci1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #108 <Field zzci zzaay>
		return zzci1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static zzkh zza(zzbp zzbp1)
	{
		return zzbp1.zzxs;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field zzkh zzxs>
	//    2    4:areturn         
	}

	static String zza(zzbp zzbp1, String s)
	{
		return zzbp1.zzv(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #116 <Method String zzv(String)>
	//    3    5:areturn         
	}

	static zzci zzb(zzbp zzbp1)
	{
		return zzbp1.zzaay;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field zzci zzaay>
	//    2    4:areturn         
	}

	static void zzb(zzbp zzbp1, String s)
	{
		zzbp1.zzw(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #122 <Method void zzw(String)>
	//    3    5:return          
	}

	static zzang zzc(zzbp zzbp1)
	{
		return zzbp1.zzyf;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field zzang zzyf>
	//    2    4:areturn         
	}

	static Context zzd(zzbp zzbp1)
	{
		return zzbp1.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Context mContext>
	//    2    4:areturn         
	}

	static Future zze(zzbp zzbp1)
	{
		return zzbp1.zzaav;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Future zzaav>
	//    2    4:areturn         
	}

	static WebView zzf(zzbp zzbp1)
	{
		return zzbp1.zzaax;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field WebView zzaax>
	//    2    4:areturn         
	}

	private final String zzv(String s)
	{
		if(zzaay == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field zzci zzaay>
	//*   2    4:ifnonnull       9
			return s;
	//    3    7:aload_1         
	//    4    8:areturn         
		s = ((String) (Uri.parse(s)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #138 <Method Uri Uri.parse(String)>
	//    7   13:astore_1        
		Uri uri = zzaay.zza(((Uri) (s)), mContext, ((View) (null)), ((android.app.Activity) (null)));
	//    8   14:aload_0         
	//    9   15:getfield        #108 <Field zzci zzaay>
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #35  <Field Context mContext>
	//   13   23:aconst_null     
	//   14   24:aconst_null     
	//   15   25:invokevirtual   #143 <Method Uri zzci.zza(Uri, Context, View, android.app.Activity)>
	//   16   28:astore_2        
		s = ((String) (uri));
	//   17   29:aload_2         
	//   18   30:astore_1        
		break MISSING_BLOCK_LABEL_41;
	//   19   31:goto            41
		zzcj zzcj1;
		zzcj1;
	//   20   34:astore_2        
		zzakb.zzc("Unable to process ad data", ((Throwable) (zzcj1)));
	//   21   35:ldc1            #145 <String "Unable to process ad data">
	//   22   37:aload_2         
	//   23   38:invokestatic    #150 <Method void zzakb.zzc(String, Throwable)>
		return ((Uri) (s)).toString();
	//   24   41:aload_1         
	//   25   42:invokevirtual   #154 <Method String Uri.toString()>
	//   26   45:areturn         
	}

	private final void zzw(String s)
	{
		Intent intent = new Intent("android.intent.action.VIEW");
	//    0    0:new             #156 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #158 <String "android.intent.action.VIEW">
	//    3    6:invokespecial   #159 <Method void Intent(String)>
	//    4    9:astore_2        
		intent.setData(Uri.parse(s));
	//    5   10:aload_2         
	//    6   11:aload_1         
	//    7   12:invokestatic    #138 <Method Uri Uri.parse(String)>
	//    8   15:invokevirtual   #163 <Method Intent Intent.setData(Uri)>
	//    9   18:pop             
		mContext.startActivity(intent);
	//   10   19:aload_0         
	//   11   20:getfield        #35  <Field Context mContext>
	//   12   23:aload_2         
	//   13   24:invokevirtual   #169 <Method void Context.startActivity(Intent)>
	//   14   27:return          
	}

	public final void destroy()
		throws RemoteException
	{
		Preconditions.checkMainThread("destroy must be called on the main UI thread.");
	//    0    0:ldc1            #174 <String "destroy must be called on the main UI thread.">
	//    1    2:invokestatic    #179 <Method void Preconditions.checkMainThread(String)>
		zzaaz.cancel(true);
	//    2    5:aload_0         
	//    3    6:getfield        #181 <Field AsyncTask zzaaz>
	//    4    9:iconst_1        
	//    5   10:invokevirtual   #187 <Method boolean AsyncTask.cancel(boolean)>
	//    6   13:pop             
		zzaav.cancel(true);
	//    7   14:aload_0         
	//    8   15:getfield        #59  <Field Future zzaav>
	//    9   18:iconst_1        
	//   10   19:invokeinterface #190 <Method boolean Future.cancel(boolean)>
	//   11   24:pop             
		zzaax.destroy();
	//   12   25:aload_0         
	//   13   26:getfield        #46  <Field WebView zzaax>
	//   14   29:invokevirtual   #192 <Method void WebView.destroy()>
		zzaax = null;
	//   15   32:aload_0         
	//   16   33:aconst_null     
	//   17   34:putfield        #46  <Field WebView zzaax>
	//   18   37:return          
	}

	public final String getAdUnitId()
	{
		throw new IllegalStateException("getAdUnitId not implemented");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #198 <String "getAdUnitId not implemented">
	//    3    6:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final String getMediationAdapterClassName()
		throws RemoteException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final zzlo getVideoController()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final boolean isLoading()
		throws RemoteException
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean isReady()
		throws RemoteException
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void pause()
		throws RemoteException
	{
		Preconditions.checkMainThread("pause must be called on the main UI thread.");
	//    0    0:ldc1            #209 <String "pause must be called on the main UI thread.">
	//    1    2:invokestatic    #179 <Method void Preconditions.checkMainThread(String)>
	//    2    5:return          
	}

	public final void resume()
		throws RemoteException
	{
		Preconditions.checkMainThread("resume must be called on the main UI thread.");
	//    0    0:ldc1            #212 <String "resume must be called on the main UI thread.">
	//    1    2:invokestatic    #179 <Method void Preconditions.checkMainThread(String)>
	//    2    5:return          
	}

	public final void setImmersiveMode(boolean flag)
	{
		throw new IllegalStateException("Unused method");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #215 <String "Unused method">
	//    3    6:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final void setManualImpressionsEnabled(boolean flag)
		throws RemoteException
	{
	//    0    0:return          
	}

	public final void setUserId(String s)
		throws RemoteException
	{
		throw new IllegalStateException("Unused method");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #215 <String "Unused method">
	//    3    6:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final void showInterstitial()
		throws RemoteException
	{
		throw new IllegalStateException("Unused method");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #215 <String "Unused method">
	//    3    6:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final void stopLoading()
		throws RemoteException
	{
	//    0    0:return          
	}

	public final void zza(zzaaw zzaaw1)
		throws RemoteException
	{
		throw new IllegalStateException("Unused method");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #215 <String "Unused method">
	//    3    6:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final void zza(zzabc zzabc, String s)
		throws RemoteException
	{
		throw new IllegalStateException("Unused method");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #215 <String "Unused method">
	//    3    6:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final void zza(zzahe zzahe)
		throws RemoteException
	{
		throw new IllegalStateException("Unused method");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #215 <String "Unused method">
	//    3    6:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final void zza(zzjn zzjn)
		throws RemoteException
	{
		throw new IllegalStateException("AdSize must be set before initialization");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #225 <String "AdSize must be set before initialization">
	//    3    6:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final void zza(zzke zzke)
		throws RemoteException
	{
		throw new IllegalStateException("Unused method");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #215 <String "Unused method">
	//    3    6:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final void zza(zzkh zzkh)
		throws RemoteException
	{
		zzxs = zzkh;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #111 <Field zzkh zzxs>
	//    3    5:return          
	}

	public final void zza(zzkx zzkx)
	{
		throw new IllegalStateException("Unused method");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #215 <String "Unused method">
	//    3    6:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final void zza(zzla zzla)
		throws RemoteException
	{
		throw new IllegalStateException("Unused method");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #215 <String "Unused method">
	//    3    6:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final void zza(zzlg zzlg)
		throws RemoteException
	{
		throw new IllegalStateException("Unused method");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #215 <String "Unused method">
	//    3    6:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final void zza(zzlu zzlu)
	{
		throw new IllegalStateException("Unused method");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #215 <String "Unused method">
	//    3    6:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final void zza(zzmu zzmu)
	{
		throw new IllegalStateException("Unused method");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #215 <String "Unused method">
	//    3    6:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final void zza(zzod zzod)
		throws RemoteException
	{
		throw new IllegalStateException("Unused method");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #215 <String "Unused method">
	//    3    6:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final boolean zzb(zzjj zzjj)
		throws RemoteException
	{
		Preconditions.checkNotNull(((Object) (zzaax)), "This Search Ad has already been torn down");
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field WebView zzaax>
	//    2    4:ldc1            #236 <String "This Search Ad has already been torn down">
	//    3    6:invokestatic    #240 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    9:pop             
		zzaaw.zza(zzjj, zzyf);
	//    5   10:aload_0         
	//    6   11:getfield        #66  <Field zzbu zzaaw>
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:getfield        #37  <Field zzang zzyf>
	//   10   19:invokevirtual   #243 <Method void zzbu.zza(zzjj, zzang)>
		zzjj = ((zzjj) (new zzbt(this, ((zzbq) (null)))));
	//   11   22:new             #245 <Class zzbt>
	//   12   25:dup             
	//   13   26:aload_0         
	//   14   27:aconst_null     
	//   15   28:invokespecial   #248 <Method void zzbt(zzbp, zzbq)>
	//   16   31:astore_1        
		Void avoid[] = new Void[0];
	//   17   32:iconst_0        
	//   18   33:anewarray       Void[]
	//   19   36:astore_2        
		if(!(zzjj instanceof AsyncTask))
	//*  20   37:aload_1         
	//*  21   38:instanceof      #183 <Class AsyncTask>
	//*  22   41:ifne            53
			zzjj = ((zzjj) (((zzbt) (zzjj)).execute(((Object []) (avoid)))));
	//   23   44:aload_1         
	//   24   45:aload_2         
	//   25   46:invokevirtual   #254 <Method AsyncTask zzbt.execute(Object[])>
	//   26   49:astore_1        
		else
	//*  27   50:goto            62
			zzjj = ((zzjj) (AsyncTaskInstrumentation.execute((AsyncTask)zzjj, ((Object []) (avoid)))));
	//   28   53:aload_1         
	//   29   54:checkcast       #183 <Class AsyncTask>
	//   30   57:aload_2         
	//   31   58:invokestatic    #259 <Method AsyncTask AsyncTaskInstrumentation.execute(AsyncTask, Object[])>
	//   32   61:astore_1        
		zzaaz = ((AsyncTask) (zzjj));
	//   33   62:aload_0         
	//   34   63:aload_1         
	//   35   64:putfield        #181 <Field AsyncTask zzaaz>
		return true;
	//   36   67:iconst_1        
	//   37   68:ireturn         
	}

	public final Bundle zzba()
	{
		throw new IllegalStateException("Unused method");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #215 <String "Unused method">
	//    3    6:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final IObjectWrapper zzbj()
		throws RemoteException
	{
		Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
	//    0    0:ldc2            #265 <String "getAdFrame must be called on the main UI thread.">
	//    1    3:invokestatic    #179 <Method void Preconditions.checkMainThread(String)>
		return ObjectWrapper.wrap(((Object) (zzaax)));
	//    2    6:aload_0         
	//    3    7:getfield        #46  <Field WebView zzaax>
	//    4   10:invokestatic    #271 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    5   13:areturn         
	}

	public final zzjn zzbk()
		throws RemoteException
	{
		return zzaau;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzjn zzaau>
	//    2    4:areturn         
	}

	public final void zzbm()
		throws RemoteException
	{
		throw new IllegalStateException("Unused method");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #215 <String "Unused method">
	//    3    6:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final zzla zzbw()
	{
		throw new IllegalStateException("getIAppEventListener not implemented");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc2            #278 <String "getIAppEventListener not implemented">
	//    3    7:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4   10:athrow          
	}

	public final zzkh zzbx()
	{
		throw new IllegalStateException("getIAdListener not implemented");
	//    0    0:new             #196 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc2            #282 <String "getIAdListener not implemented">
	//    3    7:invokespecial   #199 <Method void IllegalStateException(String)>
	//    4   10:athrow          
	}

	public final String zzck()
		throws RemoteException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	final String zzea()
	{
		Object obj = ((Object) (new android.net.Uri.Builder()));
	//    0    0:new             #287 <Class android.net.Uri$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #288 <Method void android.net.Uri$Builder()>
	//    3    7:astore_1        
		Object obj1 = ((Object) (((android.net.Uri.Builder) (obj)).scheme("https://")));
	//    4    8:aload_1         
	//    5    9:ldc2            #290 <String "https://">
	//    6   12:invokevirtual   #294 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//    7   15:astore_2        
		Object obj2 = ((Object) (zznk.zzbcz));
	//    8   16:getstatic       #300 <Field com.google.android.gms.internal.ads.zzna zznk.zzbcz>
	//    9   19:astore_3        
		((android.net.Uri.Builder) (obj1)).appendEncodedPath((String)zzkb.zzik().zzd(((com.google.android.gms.internal.ads.zzna) (obj2))));
	//   10   20:aload_2         
	//   11   21:invokestatic    #306 <Method zzni zzkb.zzik()>
	//   12   24:aload_3         
	//   13   25:invokevirtual   #311 <Method Object zzni.zzd(com.google.android.gms.internal.ads.zzna)>
	//   14   28:checkcast       #313 <Class String>
	//   15   31:invokevirtual   #316 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
	//   16   34:pop             
		((android.net.Uri.Builder) (obj)).appendQueryParameter("query", zzaaw.getQuery());
	//   17   35:aload_1         
	//   18   36:ldc2            #318 <String "query">
	//   19   39:aload_0         
	//   20   40:getfield        #66  <Field zzbu zzaaw>
	//   21   43:invokevirtual   #321 <Method String zzbu.getQuery()>
	//   22   46:invokevirtual   #325 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   23   49:pop             
		((android.net.Uri.Builder) (obj)).appendQueryParameter("pubId", zzaaw.zzed());
	//   24   50:aload_1         
	//   25   51:ldc2            #327 <String "pubId">
	//   26   54:aload_0         
	//   27   55:getfield        #66  <Field zzbu zzaaw>
	//   28   58:invokevirtual   #330 <Method String zzbu.zzed()>
	//   29   61:invokevirtual   #325 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   30   64:pop             
		obj1 = ((Object) (zzaaw.zzee()));
	//   31   65:aload_0         
	//   32   66:getfield        #66  <Field zzbu zzaaw>
	//   33   69:invokevirtual   #334 <Method Map zzbu.zzee()>
	//   34   72:astore_2        
		String s;
		for(obj2 = ((Object) (((Map) (obj1)).keySet().iterator())); ((Iterator) (obj2)).hasNext(); ((android.net.Uri.Builder) (obj)).appendQueryParameter(s, (String)((Map) (obj1)).get(((Object) (s)))))
	//*  35   73:aload_2         
	//*  36   74:invokeinterface #340 <Method Set Map.keySet()>
	//*  37   79:invokeinterface #346 <Method Iterator Set.iterator()>
	//*  38   84:astore_3        
	//*  39   85:aload_3         
	//*  40   86:invokeinterface #351 <Method boolean Iterator.hasNext()>
	//*  41   91:ifeq            126
			s = (String)((Iterator) (obj2)).next();
	//   42   94:aload_3         
	//   43   95:invokeinterface #355 <Method Object Iterator.next()>
	//   44  100:checkcast       #313 <Class String>
	//   45  103:astore          4

	//   46  105:aload_1         
	//   47  106:aload           4
	//   48  108:aload_2         
	//   49  109:aload           4
	//   50  111:invokeinterface #359 <Method Object Map.get(Object)>
	//   51  116:checkcast       #313 <Class String>
	//   52  119:invokevirtual   #325 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   53  122:pop             
	//*  54  123:goto            85
		obj1 = ((Object) (((android.net.Uri.Builder) (obj)).build()));
	//   55  126:aload_1         
	//   56  127:invokevirtual   #363 <Method Uri android.net.Uri$Builder.build()>
	//   57  130:astore_2        
		obj2 = ((Object) (zzaay));
	//   58  131:aload_0         
	//   59  132:getfield        #108 <Field zzci zzaay>
	//   60  135:astore_3        
		obj = obj1;
	//   61  136:aload_2         
	//   62  137:astore_1        
		if(obj2 != null)
	//*  63  138:aload_3         
	//*  64  139:ifnull          164
			try
			{
				obj = ((Object) (((zzci) (obj2)).zza(((Uri) (obj1)), mContext)));
	//   65  142:aload_3         
	//   66  143:aload_2         
	//   67  144:aload_0         
	//   68  145:getfield        #35  <Field Context mContext>
	//   69  148:invokevirtual   #366 <Method Uri zzci.zza(Uri, Context)>
	//   70  151:astore_1        
			}
	//*  71  152:goto            164
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  72  155:astore_1        
			{
				zzakb.zzc("Unable to process ad data", ((Throwable) (obj)));
	//   73  156:ldc1            #145 <String "Unable to process ad data">
	//   74  158:aload_1         
	//   75  159:invokestatic    #150 <Method void zzakb.zzc(String, Throwable)>
				obj = obj1;
	//   76  162:aload_2         
	//   77  163:astore_1        
			}
		obj1 = ((Object) (zzeb()));
	//   78  164:aload_0         
	//   79  165:invokevirtual   #369 <Method String zzeb()>
	//   80  168:astore_2        
		obj = ((Object) (((Uri) (obj)).getEncodedQuery()));
	//   81  169:aload_1         
	//   82  170:invokevirtual   #372 <Method String Uri.getEncodedQuery()>
	//   83  173:astore_1        
		obj2 = ((Object) (new StringBuilder(String.valueOf(obj1).length() + 1 + String.valueOf(obj).length())));
	//   84  174:new             #374 <Class StringBuilder>
	//   85  177:dup             
	//   86  178:aload_2         
	//   87  179:invokestatic    #378 <Method String String.valueOf(Object)>
	//   88  182:invokevirtual   #382 <Method int String.length()>
	//   89  185:iconst_1        
	//   90  186:iadd            
	//   91  187:aload_1         
	//   92  188:invokestatic    #378 <Method String String.valueOf(Object)>
	//   93  191:invokevirtual   #382 <Method int String.length()>
	//   94  194:iadd            
	//   95  195:invokespecial   #384 <Method void StringBuilder(int)>
	//   96  198:astore_3        
		((StringBuilder) (obj2)).append(((String) (obj1)));
	//   97  199:aload_3         
	//   98  200:aload_2         
	//   99  201:invokevirtual   #388 <Method StringBuilder StringBuilder.append(String)>
	//  100  204:pop             
		((StringBuilder) (obj2)).append("#");
	//  101  205:aload_3         
	//  102  206:ldc2            #390 <String "#">
	//  103  209:invokevirtual   #388 <Method StringBuilder StringBuilder.append(String)>
	//  104  212:pop             
		((StringBuilder) (obj2)).append(((String) (obj)));
	//  105  213:aload_3         
	//  106  214:aload_1         
	//  107  215:invokevirtual   #388 <Method StringBuilder StringBuilder.append(String)>
	//  108  218:pop             
		return ((StringBuilder) (obj2)).toString();
	//  109  219:aload_3         
	//  110  220:invokevirtual   #391 <Method String StringBuilder.toString()>
	//  111  223:areturn         
	}

	final String zzeb()
	{
		Object obj = ((Object) (zzaaw.zzec()));
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field zzbu zzaaw>
	//    2    4:invokevirtual   #394 <Method String zzbu.zzec()>
	//    3    7:astore_2        
		String s = ((String) (obj));
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (obj))))
	//*   6   10:aload_2         
	//*   7   11:invokestatic    #400 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   14:ifeq            21
			s = "www.google.com";
	//    9   17:ldc2            #402 <String "www.google.com">
	//   10   20:astore_1        
		obj = ((Object) (zznk.zzbcz));
	//   11   21:getstatic       #300 <Field com.google.android.gms.internal.ads.zzna zznk.zzbcz>
	//   12   24:astore_2        
		obj = ((Object) ((String)zzkb.zzik().zzd(((com.google.android.gms.internal.ads.zzna) (obj)))));
	//   13   25:invokestatic    #306 <Method zzni zzkb.zzik()>
	//   14   28:aload_2         
	//   15   29:invokevirtual   #311 <Method Object zzni.zzd(com.google.android.gms.internal.ads.zzna)>
	//   16   32:checkcast       #313 <Class String>
	//   17   35:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 8 + String.valueOf(obj).length());
	//   18   36:new             #374 <Class StringBuilder>
	//   19   39:dup             
	//   20   40:aload_1         
	//   21   41:invokestatic    #378 <Method String String.valueOf(Object)>
	//   22   44:invokevirtual   #382 <Method int String.length()>
	//   23   47:bipush          8
	//   24   49:iadd            
	//   25   50:aload_2         
	//   26   51:invokestatic    #378 <Method String String.valueOf(Object)>
	//   27   54:invokevirtual   #382 <Method int String.length()>
	//   28   57:iadd            
	//   29   58:invokespecial   #384 <Method void StringBuilder(int)>
	//   30   61:astore_3        
		stringbuilder.append("https://");
	//   31   62:aload_3         
	//   32   63:ldc2            #290 <String "https://">
	//   33   66:invokevirtual   #388 <Method StringBuilder StringBuilder.append(String)>
	//   34   69:pop             
		stringbuilder.append(s);
	//   35   70:aload_3         
	//   36   71:aload_1         
	//   37   72:invokevirtual   #388 <Method StringBuilder StringBuilder.append(String)>
	//   38   75:pop             
		stringbuilder.append(((String) (obj)));
	//   39   76:aload_3         
	//   40   77:aload_2         
	//   41   78:invokevirtual   #388 <Method StringBuilder StringBuilder.append(String)>
	//   42   81:pop             
		return stringbuilder.toString();
	//   43   82:aload_3         
	//   44   83:invokevirtual   #391 <Method String StringBuilder.toString()>
	//   45   86:areturn         
	}

	final void zzk(int i)
	{
		if(zzaax == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field WebView zzaax>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, i);
	//    4    8:new             #404 <Class android.view.ViewGroup$LayoutParams>
	//    5   11:dup             
	//    6   12:iconst_m1       
	//    7   13:iload_1         
	//    8   14:invokespecial   #407 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//    9   17:astore_2        
			zzaax.setLayoutParams(layoutparams);
	//   10   18:aload_0         
	//   11   19:getfield        #46  <Field WebView zzaax>
	//   12   22:aload_2         
	//   13   23:invokevirtual   #411 <Method void WebView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			return;
	//   14   26:return          
		}
	}

	final int zzu(String s)
	{
		s = Uri.parse(s).getQueryParameter("height");
	//    0    0:aload_1         
	//    1    1:invokestatic    #138 <Method Uri Uri.parse(String)>
	//    2    4:ldc2            #417 <String "height">
	//    3    7:invokevirtual   #420 <Method String Uri.getQueryParameter(String)>
	//    4   10:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   5   11:aload_1         
	//*   6   12:invokestatic    #400 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   15:ifeq            20
			return 0;
	//    8   18:iconst_0        
	//    9   19:ireturn         
		int i;
		try
		{
			zzkb.zzif();
	//   10   20:invokestatic    #424 <Method zzamu zzkb.zzif()>
	//   11   23:pop             
			i = zzamu.zza(mContext, Integer.parseInt(s));
	//   12   24:aload_0         
	//   13   25:getfield        #35  <Field Context mContext>
	//   14   28:aload_1         
	//   15   29:invokestatic    #429 <Method int Integer.parseInt(String)>
	//   16   32:invokestatic    #434 <Method int zzamu.zza(Context, int)>
	//   17   35:istore_2        
		}
	//*  18   36:iload_2         
	//*  19   37:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  20   38:astore_1        
		{
			return 0;
	//   21   39:iconst_0        
	//   22   40:ireturn         
		}
		return i;
	}

	private final Context mContext;
	private final zzjn zzaau;
	private final Future zzaav = zzaki.zza(((java.util.concurrent.Callable) (new zzbs(this))));
	private final zzbu zzaaw;
	private WebView zzaax;
	private zzci zzaay;
	private AsyncTask zzaaz;
	private zzkh zzxs;
	private final zzang zzyf;
}
