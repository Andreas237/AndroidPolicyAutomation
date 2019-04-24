// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.webkit.*;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.Predicate;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaqw, zzapn, zzajm, zzarl, 
//			zzasi, zzfs, zzox, zznv, 
//			zznw, zzang, zzasc, zzci

public final class zzarh extends FrameLayout
	implements zzaqw
{

	public zzarh(zzaqw zzaqw1)
	{
		super(zzaqw1.getContext());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #17  <Method Context zzaqw.getContext()>
	//    3    7:invokespecial   #20  <Method void FrameLayout(Context)>
		zzdcy = zzaqw1;
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:putfield        #22  <Field zzaqw zzdcy>
		zzdcz = new zzapn(zzaqw1.zzua(), ((android.view.ViewGroup) (this)), ((zzaqw) (this)));
	//    7   15:aload_0         
	//    8   16:new             #24  <Class zzapn>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokeinterface #27  <Method Context zzaqw.zzua()>
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:invokespecial   #30  <Method void zzapn(Context, android.view.ViewGroup, zzaqw)>
	//   15   31:putfield        #32  <Field zzapn zzdcz>
		addView(zzdcy.getView());
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #22  <Field zzaqw zzdcy>
	//   19   39:invokeinterface #36  <Method View zzaqw.getView()>
	//   20   44:invokevirtual   #40  <Method void addView(View)>
	//   21   47:return          
	}

	public final void destroy()
	{
		zzdcy.destroy();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #45  <Method void zzaqw.destroy()>
	//    3    9:return          
	}

	public final android.view.View.OnClickListener getOnClickListener()
	{
		return zzdcy.getOnClickListener();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #49  <Method android.view.View$OnClickListener zzaqw.getOnClickListener()>
	//    3    9:areturn         
	}

	public final int getRequestedOrientation()
	{
		return zzdcy.getRequestedOrientation();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #53  <Method int zzaqw.getRequestedOrientation()>
	//    3    9:ireturn         
	}

	public final View getView()
	{
		return ((View) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final WebView getWebView()
	{
		return zzdcy.getWebView();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #57  <Method WebView zzaqw.getWebView()>
	//    3    9:areturn         
	}

	public final boolean isDestroyed()
	{
		return zzdcy.isDestroyed();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #61  <Method boolean zzaqw.isDestroyed()>
	//    3    9:ireturn         
	}

	public final void loadData(String s, String s1, String s2)
	{
		zzdcy.loadData(s, s1, s2);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #65  <Method void zzaqw.loadData(String, String, String)>
	//    6   12:return          
	}

	public final void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4)
	{
		zzdcy.loadDataWithBaseURL(s, s1, s2, s3, s4);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokeinterface #69  <Method void zzaqw.loadDataWithBaseURL(String, String, String, String, String)>
	//    8   16:return          
	}

	public final void loadUrl(String s)
	{
		zzdcy.loadUrl(s);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #73  <Method void zzaqw.loadUrl(String)>
	//    4   10:return          
	}

	public final void onPause()
	{
		zzdcz.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzapn zzdcz>
	//    2    4:invokevirtual   #76  <Method void zzapn.onPause()>
		zzdcy.onPause();
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field zzaqw zzdcy>
	//    5   11:invokeinterface #77  <Method void zzaqw.onPause()>
	//    6   16:return          
	}

	public final void onResume()
	{
		zzdcy.onResume();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #80  <Method void zzaqw.onResume()>
	//    3    9:return          
	}

	public final void setOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		zzdcy.setOnClickListener(onclicklistener);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #84  <Method void zzaqw.setOnClickListener(android.view.View$OnClickListener)>
	//    4   10:return          
	}

	public final void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener)
	{
		zzdcy.setOnTouchListener(ontouchlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #88  <Method void zzaqw.setOnTouchListener(android.view.View$OnTouchListener)>
	//    4   10:return          
	}

	public final void setRequestedOrientation(int i)
	{
		zzdcy.setRequestedOrientation(i);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:iload_1         
	//    3    5:invokeinterface #92  <Method void zzaqw.setRequestedOrientation(int)>
	//    4   10:return          
	}

	public final void setWebChromeClient(WebChromeClient webchromeclient)
	{
		zzdcy.setWebChromeClient(webchromeclient);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #96  <Method void zzaqw.setWebChromeClient(WebChromeClient)>
	//    4   10:return          
	}

	public final void setWebViewClient(WebViewClient webviewclient)
	{
		zzdcy.setWebViewClient(webviewclient);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #100 <Method void zzaqw.setWebViewClient(WebViewClient)>
	//    4   10:return          
	}

	public final void stopLoading()
	{
		zzdcy.stopLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #103 <Method void zzaqw.stopLoading()>
	//    3    9:return          
	}

	public final void zza(zzc zzc1)
	{
		zzdcy.zza(zzc1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #107 <Method void zzaqw.zza(zzc)>
	//    4   10:return          
	}

	public final void zza(zzd zzd)
	{
		zzdcy.zza(zzd);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #110 <Method void zzaqw.zza(zzd)>
	//    4   10:return          
	}

	public final void zza(zzarl zzarl)
	{
		zzdcy.zza(zzarl);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #113 <Method void zzaqw.zza(zzarl)>
	//    4   10:return          
	}

	public final void zza(zzasi zzasi)
	{
		zzdcy.zza(zzasi);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #116 <Method void zzaqw.zza(zzasi)>
	//    4   10:return          
	}

	public final void zza(zzfs zzfs)
	{
		zzdcy.zza(zzfs);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #119 <Method void zzaqw.zza(zzfs)>
	//    4   10:return          
	}

	public final void zza(String s, zzv zzv)
	{
		zzdcy.zza(s, zzv);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #122 <Method void zzaqw.zza(String, zzv)>
	//    5   11:return          
	}

	public final void zza(String s, Predicate predicate)
	{
		zzdcy.zza(s, predicate);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #127 <Method void zzaqw.zza(String, Predicate)>
	//    5   11:return          
	}

	public final void zza(String s, Map map)
	{
		zzdcy.zza(s, map);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #131 <Method void zzaqw.zza(String, Map)>
	//    5   11:return          
	}

	public final void zza(String s, JSONObject jsonobject)
	{
		zzdcy.zza(s, jsonobject);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #135 <Method void zzaqw.zza(String, JSONObject)>
	//    5   11:return          
	}

	public final void zza(boolean flag, int i)
	{
		zzdcy.zza(flag, i);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #138 <Method void zzaqw.zza(boolean, int)>
	//    5   11:return          
	}

	public final void zza(boolean flag, int i, String s)
	{
		zzdcy.zza(flag, i, s);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #141 <Method void zzaqw.zza(boolean, int, String)>
	//    6   12:return          
	}

	public final void zza(boolean flag, int i, String s, String s1)
	{
		zzdcy.zza(flag, i, s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokeinterface #144 <Method void zzaqw.zza(boolean, int, String, String)>
	//    7   14:return          
	}

	public final void zzah(boolean flag)
	{
		zzdcy.zzah(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:iload_1         
	//    3    5:invokeinterface #148 <Method void zzaqw.zzah(boolean)>
	//    4   10:return          
	}

	public final void zzai(int i)
	{
		zzdcy.zzai(i);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:iload_1         
	//    3    5:invokeinterface #151 <Method void zzaqw.zzai(int)>
	//    4   10:return          
	}

	public final void zzai(boolean flag)
	{
		zzdcy.zzai(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:iload_1         
	//    3    5:invokeinterface #153 <Method void zzaqw.zzai(boolean)>
	//    4   10:return          
	}

	public final void zzaj(boolean flag)
	{
		zzdcy.zzaj(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:iload_1         
	//    3    5:invokeinterface #156 <Method void zzaqw.zzaj(boolean)>
	//    4   10:return          
	}

	public final void zzak(boolean flag)
	{
		zzdcy.zzak(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:iload_1         
	//    3    5:invokeinterface #159 <Method void zzaqw.zzak(boolean)>
	//    4   10:return          
	}

	public final void zzb(zzd zzd)
	{
		zzdcy.zzb(zzd);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #162 <Method void zzaqw.zzb(zzd)>
	//    4   10:return          
	}

	public final void zzb(zzox zzox)
	{
		zzdcy.zzb(zzox);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #166 <Method void zzaqw.zzb(zzox)>
	//    4   10:return          
	}

	public final void zzb(String s, zzv zzv)
	{
		zzdcy.zzb(s, zzv);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #169 <Method void zzaqw.zzb(String, zzv)>
	//    5   11:return          
	}

	public final void zzb(String s, JSONObject jsonobject)
	{
		zzdcy.zzb(s, jsonobject);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #171 <Method void zzaqw.zzb(String, JSONObject)>
	//    5   11:return          
	}

	public final void zzbe(String s)
	{
		zzdcy.zzbe(s);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #174 <Method void zzaqw.zzbe(String)>
	//    4   10:return          
	}

	public final zzw zzbi()
	{
		return zzdcy.zzbi();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #178 <Method zzw zzaqw.zzbi()>
	//    3    9:areturn         
	}

	public final void zzbm(Context context)
	{
		zzdcy.zzbm(context);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #181 <Method void zzaqw.zzbm(Context)>
	//    4   10:return          
	}

	public final void zzc(String s, String s1, String s2)
	{
		zzdcy.zzc(s, s1, s2);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #184 <Method void com.google.android.gms.internal.ads.zzaqw.zzc(String, String, String)>
	//    6   12:return          
	}

	public final void zzcl()
	{
		zzdcy.zzcl();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #187 <Method void zzaqw.zzcl()>
	//    3    9:return          
	}

	public final void zzcm()
	{
		zzdcy.zzcm();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #190 <Method void zzaqw.zzcm()>
	//    3    9:return          
	}

	public final void zzdr(String s)
	{
		zzdcy.zzdr(s);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #193 <Method void zzaqw.zzdr(String)>
	//    4   10:return          
	}

	public final void zzno()
	{
		zzdcy.zzno();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #196 <Method void zzaqw.zzno()>
	//    3    9:return          
	}

	public final void zznp()
	{
		zzdcy.zznp();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #199 <Method void zzaqw.zznp()>
	//    3    9:return          
	}

	public final String zzol()
	{
		return zzdcy.zzol();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #203 <Method String zzaqw.zzol()>
	//    3    9:areturn         
	}

	public final zzapn zztl()
	{
		return zzdcz;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzapn zzdcz>
	//    2    4:areturn         
	}

	public final zzarl zztm()
	{
		return zzdcy.zztm();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #209 <Method zzarl zzaqw.zztm()>
	//    3    9:areturn         
	}

	public final zznv zztn()
	{
		return zzdcy.zztn();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #213 <Method zznv zzaqw.zztn()>
	//    3    9:areturn         
	}

	public final Activity zzto()
	{
		return zzdcy.zzto();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #217 <Method Activity zzaqw.zzto()>
	//    3    9:areturn         
	}

	public final zznw zztp()
	{
		return zzdcy.zztp();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #221 <Method zznw zzaqw.zztp()>
	//    3    9:areturn         
	}

	public final zzang zztq()
	{
		return zzdcy.zztq();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #225 <Method zzang zzaqw.zztq()>
	//    3    9:areturn         
	}

	public final int zztr()
	{
		return getMeasuredHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #229 <Method int getMeasuredHeight()>
	//    2    4:ireturn         
	}

	public final int zzts()
	{
		return getMeasuredWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #233 <Method int getMeasuredWidth()>
	//    2    4:ireturn         
	}

	public final void zzty()
	{
		zzdcy.zzty();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #236 <Method void zzaqw.zzty()>
	//    3    9:return          
	}

	public final void zztz()
	{
		zzdcy.zztz();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #239 <Method void zzaqw.zztz()>
	//    3    9:return          
	}

	public final void zzu(boolean flag)
	{
		zzdcy.zzu(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:iload_1         
	//    3    5:invokeinterface #242 <Method void zzaqw.zzu(boolean)>
	//    4   10:return          
	}

	public final Context zzua()
	{
		return zzdcy.zzua();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #27  <Method Context zzaqw.zzua()>
	//    3    9:areturn         
	}

	public final zzd zzub()
	{
		return zzdcy.zzub();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #246 <Method zzd zzaqw.zzub()>
	//    3    9:areturn         
	}

	public final zzd zzuc()
	{
		return zzdcy.zzuc();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #249 <Method zzd zzaqw.zzuc()>
	//    3    9:areturn         
	}

	public final zzasi zzud()
	{
		return zzdcy.zzud();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #253 <Method zzasi zzaqw.zzud()>
	//    3    9:areturn         
	}

	public final String zzue()
	{
		return zzdcy.zzue();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #256 <Method String zzaqw.zzue()>
	//    3    9:areturn         
	}

	public final zzasc zzuf()
	{
		return zzdcy.zzuf();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #260 <Method zzasc zzaqw.zzuf()>
	//    3    9:areturn         
	}

	public final WebViewClient zzug()
	{
		return zzdcy.zzug();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #264 <Method WebViewClient zzaqw.zzug()>
	//    3    9:areturn         
	}

	public final boolean zzuh()
	{
		return zzdcy.zzuh();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #267 <Method boolean zzaqw.zzuh()>
	//    3    9:ireturn         
	}

	public final zzci zzui()
	{
		return zzdcy.zzui();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #271 <Method zzci zzaqw.zzui()>
	//    3    9:areturn         
	}

	public final boolean zzuj()
	{
		return zzdcy.zzuj();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #274 <Method boolean zzaqw.zzuj()>
	//    3    9:ireturn         
	}

	public final void zzuk()
	{
		zzdcz.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzapn zzdcz>
	//    2    4:invokevirtual   #278 <Method void zzapn.onDestroy()>
		zzdcy.zzuk();
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field zzaqw zzdcy>
	//    5   11:invokeinterface #280 <Method void zzaqw.zzuk()>
	//    6   16:return          
	}

	public final boolean zzul()
	{
		return zzdcy.zzul();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #283 <Method boolean zzaqw.zzul()>
	//    3    9:ireturn         
	}

	public final boolean zzum()
	{
		return zzdcy.zzum();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #286 <Method boolean zzaqw.zzum()>
	//    3    9:ireturn         
	}

	public final boolean zzun()
	{
		return zzdcy.zzun();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #289 <Method boolean zzaqw.zzun()>
	//    3    9:ireturn         
	}

	public final void zzuo()
	{
		zzdcy.zzuo();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #292 <Method void zzaqw.zzuo()>
	//    3    9:return          
	}

	public final void zzup()
	{
		zzdcy.zzup();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #295 <Method void zzaqw.zzup()>
	//    3    9:return          
	}

	public final zzox zzuq()
	{
		return zzdcy.zzuq();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaqw zzdcy>
	//    2    4:invokeinterface #299 <Method zzox zzaqw.zzuq()>
	//    3    9:areturn         
	}

	public final void zzur()
	{
		setBackgroundColor(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #304 <Method void setBackgroundColor(int)>
		zzdcy.setBackgroundColor(0);
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field zzaqw zzdcy>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #305 <Method void zzaqw.setBackgroundColor(int)>
	//    7   15:return          
	}

	public final void zzus()
	{
		TextView textview = new TextView(getContext());
	//    0    0:new             #308 <Class TextView>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #309 <Method Context getContext()>
	//    4    8:invokespecial   #310 <Method void TextView(Context)>
	//    5   11:astore_2        
		Object obj = ((Object) (zzbv.zzeo().getResources()));
	//    6   12:invokestatic    #316 <Method zzajm zzbv.zzeo()>
	//    7   15:invokevirtual   #322 <Method Resources zzajm.getResources()>
	//    8   18:astore_1        
		if(obj != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          34
			obj = ((Object) (((Resources) (obj)).getString(com.google.android.gms.ads.impl.R.string.s7)));
	//   11   23:aload_1         
	//   12   24:getstatic       #328 <Field int com.google.android.gms.ads.impl.R$string.s7>
	//   13   27:invokevirtual   #334 <Method String Resources.getString(int)>
	//   14   30:astore_1        
		else
	//*  15   31:goto            38
			obj = "Test Ad";
	//   16   34:ldc2            #336 <String "Test Ad">
	//   17   37:astore_1        
		textview.setText(((CharSequence) (obj)));
	//   18   38:aload_2         
	//   19   39:aload_1         
	//   20   40:invokevirtual   #340 <Method void TextView.setText(CharSequence)>
		textview.setTextSize(15F);
	//   21   43:aload_2         
	//   22   44:ldc2            #341 <Float 15F>
	//   23   47:invokevirtual   #345 <Method void TextView.setTextSize(float)>
		textview.setTextColor(-1);
	//   24   50:aload_2         
	//   25   51:iconst_m1       
	//   26   52:invokevirtual   #348 <Method void TextView.setTextColor(int)>
		textview.setPadding(5, 0, 5, 0);
	//   27   55:aload_2         
	//   28   56:iconst_5        
	//   29   57:iconst_0        
	//   30   58:iconst_5        
	//   31   59:iconst_0        
	//   32   60:invokevirtual   #352 <Method void TextView.setPadding(int, int, int, int)>
		obj = ((Object) (new GradientDrawable()));
	//   33   63:new             #354 <Class GradientDrawable>
	//   34   66:dup             
	//   35   67:invokespecial   #356 <Method void GradientDrawable()>
	//   36   70:astore_1        
		((GradientDrawable) (obj)).setShape(0);
	//   37   71:aload_1         
	//   38   72:iconst_0        
	//   39   73:invokevirtual   #359 <Method void GradientDrawable.setShape(int)>
		((GradientDrawable) (obj)).setColor(0xff444444);
	//   40   76:aload_1         
	//   41   77:ldc2            #360 <Int 0xff444444>
	//   42   80:invokevirtual   #363 <Method void GradientDrawable.setColor(int)>
		((GradientDrawable) (obj)).setCornerRadius(8F);
	//   43   83:aload_1         
	//   44   84:ldc2            #364 <Float 8F>
	//   45   87:invokevirtual   #367 <Method void GradientDrawable.setCornerRadius(float)>
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  46   90:getstatic       #372 <Field int android.os.Build$VERSION.SDK_INT>
	//*  47   93:bipush          16
	//*  48   95:icmplt          106
			textview.setBackground(((android.graphics.drawable.Drawable) (obj)));
	//   49   98:aload_2         
	//   50   99:aload_1         
	//   51  100:invokevirtual   #376 <Method void TextView.setBackground(android.graphics.drawable.Drawable)>
		else
	//*  52  103:goto            111
			textview.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
	//   53  106:aload_2         
	//   54  107:aload_1         
	//   55  108:invokevirtual   #379 <Method void TextView.setBackgroundDrawable(android.graphics.drawable.Drawable)>
		addView(((View) (textview)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-2, -2, 49))));
	//   56  111:aload_0         
	//   57  112:aload_2         
	//   58  113:new             #381 <Class android.widget.FrameLayout$LayoutParams>
	//   59  116:dup             
	//   60  117:bipush          -2
	//   61  119:bipush          -2
	//   62  121:bipush          49
	//   63  123:invokespecial   #384 <Method void android.widget.FrameLayout$LayoutParams(int, int, int)>
	//   64  126:invokevirtual   #387 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
		bringChildToFront(((View) (textview)));
	//   65  129:aload_0         
	//   66  130:aload_2         
	//   67  131:invokevirtual   #390 <Method void bringChildToFront(View)>
	//   68  134:return          
	}

	private final zzaqw zzdcy;
	private final zzapn zzdcz;
}
