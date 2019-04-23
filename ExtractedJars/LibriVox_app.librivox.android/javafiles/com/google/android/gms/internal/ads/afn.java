// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.webkit.*;
import com.google.android.gms.ads.internal.ap;
import com.google.android.gms.ads.internal.bs;
import com.google.android.gms.ads.internal.gmsg.ag;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.c.a;
import com.google.android.gms.common.util.p;

// Referenced classes of package com.google.android.gms.internal.ads:
//			add, agk, agl, agp, 
//			ags, agt, agu, bpy, 
//			gw, hv, bf, agd, 
//			ahb, aeq, ab, zzbbi, 
//			agv, bad

public interface afn
	extends ap, add, agk, agl, agp, ags, agt, agu, bpy, gw, hv
{

	public abstract a A();

	public abstract boolean B();

	public abstract boolean C();

	public abstract void D();

	public abstract boolean E();

	public abstract boolean F();

	public abstract boolean G();

	public abstract void H();

	public abstract void I();

	public abstract bf J();

	public abstract void K();

	public abstract void L();

	public abstract void a(int i);

	public abstract void a(Context context);

	public abstract void a(c c1);

	public abstract void a(a a1);

	public abstract void a(agd agd);

	public abstract void a(ahb ahb);

	public abstract void a(bf bf);

	public abstract void a(String s1, ag ag);

	public abstract void a(String s1, p p1);

	public abstract void a(String s1, aeq aeq);

	public abstract void a(String s1, String s2, String s3);

	public abstract agd b();

	public abstract void b(c c1);

	public abstract void b(String s1);

	public abstract void b(String s1, ag ag);

	public abstract void b(boolean flag);

	public abstract void c(boolean flag);

	public abstract Activity d();

	public abstract void d(boolean flag);

	public abstract void destroy();

	public abstract bs e();

	public abstract void e(boolean flag);

	public abstract void f(boolean flag);

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

	public abstract ab j();

	public abstract zzbbi k();

	public abstract void loadData(String s1, String s2, String s3);

	public abstract void loadDataWithBaseURL(String s1, String s2, String s3, String s4, String s5);

	public abstract void loadUrl(String s1);

	public abstract void measure(int i, int l);

	public abstract void o();

	public abstract void onPause();

	public abstract void onResume();

	public abstract void p();

	public abstract void q();

	public abstract Context r();

	public abstract c s();

	public abstract void setBackgroundColor(int i);

	public abstract void setOnClickListener(android.view.View.OnClickListener onclicklistener);

	public abstract void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener);

	public abstract void setRequestedOrientation(int i);

	public abstract void setWebChromeClient(WebChromeClient webchromeclient);

	public abstract void setWebViewClient(WebViewClient webviewclient);

	public abstract void stopLoading();

	public abstract c t();

	public abstract ahb u();

	public abstract String v();

	public abstract agv w();

	public abstract WebViewClient x();

	public abstract boolean y();

	public abstract bad z();
}
