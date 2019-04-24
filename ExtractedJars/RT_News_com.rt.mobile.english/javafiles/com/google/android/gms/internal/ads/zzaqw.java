// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.webkit.*;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.Predicate;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzapw, zzarr, zzars, zzarw, 
//			zzarz, zzasa, zzasb, zzft, 
//			zzue, zzve, zzarl, zzasi, 
//			zzox, zznw, zzang, zzasc, 
//			zzci

public interface zzaqw
	extends zzbo, zzapw, zzarr, zzars, zzarw, zzarz, zzasa, zzasb, zzft, zzue, zzve
{

	public abstract void destroy();

	public abstract Context getContext();

	public abstract int getHeight();

	public abstract android.view.ViewGroup.LayoutParams getLayoutParams();

	public abstract void getLocationOnScreen(int ai[]);

	public abstract android.view.View.OnClickListener getOnClickListener();

	public abstract ViewParent getParent();

	public abstract int getRequestedOrientation();

	public abstract View getView();

	public abstract WebView getWebView();

	public abstract int getWidth();

	public abstract boolean isDestroyed();

	public abstract void loadData(String s, String s1, String s2);

	public abstract void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4);

	public abstract void loadUrl(String s);

	public abstract void measure(int i, int j);

	public abstract void onPause();

	public abstract void onResume();

	public abstract void setBackgroundColor(int i);

	public abstract void setOnClickListener(android.view.View.OnClickListener onclicklistener);

	public abstract void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener);

	public abstract void setRequestedOrientation(int i);

	public abstract void setWebChromeClient(WebChromeClient webchromeclient);

	public abstract void setWebViewClient(WebViewClient webviewclient);

	public abstract void stopLoading();

	public abstract void zza(zzd zzd);

	public abstract void zza(zzarl zzarl);

	public abstract void zza(zzasi zzasi);

	public abstract void zza(String s, zzv zzv);

	public abstract void zza(String s, Predicate predicate);

	public abstract void zzai(int i);

	public abstract void zzai(boolean flag);

	public abstract void zzaj(boolean flag);

	public abstract void zzak(boolean flag);

	public abstract void zzb(zzd zzd);

	public abstract void zzb(zzox zzox);

	public abstract void zzb(String s, zzv zzv);

	public abstract zzw zzbi();

	public abstract void zzbm(Context context);

	public abstract void zzc(String s, String s1, String s2);

	public abstract void zzdr(String s);

	public abstract void zzno();

	public abstract zzarl zztm();

	public abstract Activity zzto();

	public abstract zznw zztp();

	public abstract zzang zztq();

	public abstract void zzty();

	public abstract void zztz();

	public abstract void zzu(boolean flag);

	public abstract Context zzua();

	public abstract zzd zzub();

	public abstract zzd zzuc();

	public abstract zzasi zzud();

	public abstract String zzue();

	public abstract zzasc zzuf();

	public abstract WebViewClient zzug();

	public abstract boolean zzuh();

	public abstract zzci zzui();

	public abstract boolean zzuj();

	public abstract void zzuk();

	public abstract boolean zzul();

	public abstract boolean zzum();

	public abstract boolean zzun();

	public abstract void zzuo();

	public abstract void zzup();

	public abstract zzox zzuq();

	public abstract void zzur();

	public abstract void zzus();
}
