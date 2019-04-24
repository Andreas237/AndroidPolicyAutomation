// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.webkit.*;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzasx, zzasz, zzata, zzatb, 
//			zzakq, zzakb, zzast, zzajm, 
//			zzasy, zzash, zzasu

public class zzass extends WebView
	implements zzasx, zzasz, zzata, zzatb
{

	public zzass(zzash zzash)
	{
		super(((android.content.Context) (zzash)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void WebView(android.content.Context)>
	//    3    5:aload_0         
	//    4    6:new             #36  <Class CopyOnWriteArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #39  <Method void CopyOnWriteArrayList()>
	//    7   13:putfield        #41  <Field List zzdew>
	//    8   16:aload_0         
	//    9   17:new             #36  <Class CopyOnWriteArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #39  <Method void CopyOnWriteArrayList()>
	//   12   24:putfield        #43  <Field List zzdex>
	//   13   27:aload_0         
	//   14   28:new             #36  <Class CopyOnWriteArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #39  <Method void CopyOnWriteArrayList()>
	//   17   35:putfield        #45  <Field List zzdey>
	//   18   38:aload_0         
	//   19   39:new             #36  <Class CopyOnWriteArrayList>
	//   20   42:dup             
	//   21   43:invokespecial   #39  <Method void CopyOnWriteArrayList()>
	//   22   46:putfield        #47  <Field List zzdez>
		zzdfa = zzash;
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:putfield        #49  <Field zzash zzdfa>
		setBackgroundColor(0);
	//   26   54:aload_0         
	//   27   55:iconst_0        
	//   28   56:invokevirtual   #53  <Method void setBackgroundColor(int)>
		zzash = ((zzash) (getSettings()));
	//   29   59:aload_0         
	//   30   60:invokevirtual   #57  <Method WebSettings getSettings()>
	//   31   63:astore_1        
		((WebSettings) (zzash)).setAllowFileAccess(false);
	//   32   64:aload_1         
	//   33   65:iconst_0        
	//   34   66:invokevirtual   #63  <Method void WebSettings.setAllowFileAccess(boolean)>
		((WebSettings) (zzash)).setSavePassword(false);
	//   35   69:aload_1         
	//   36   70:iconst_0        
	//   37   71:invokevirtual   #66  <Method void WebSettings.setSavePassword(boolean)>
		((WebSettings) (zzash)).setSupportMultipleWindows(true);
	//   38   74:aload_1         
	//   39   75:iconst_1        
	//   40   76:invokevirtual   #69  <Method void WebSettings.setSupportMultipleWindows(boolean)>
		((WebSettings) (zzash)).setJavaScriptCanOpenWindowsAutomatically(true);
	//   41   79:aload_1         
	//   42   80:iconst_1        
	//   43   81:invokevirtual   #72  <Method void WebSettings.setJavaScriptCanOpenWindowsAutomatically(boolean)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  44   84:getstatic       #78  <Field int android.os.Build$VERSION.SDK_INT>
	//*  45   87:bipush          21
	//*  46   89:icmplt          97
			((WebSettings) (zzash)).setMixedContentMode(2);
	//   47   92:aload_1         
	//   48   93:iconst_2        
	//   49   94:invokevirtual   #81  <Method void WebSettings.setMixedContentMode(int)>
		zzbv.zzem().zza(getContext(), ((WebSettings) (zzash)));
	//   50   97:invokestatic    #87  <Method zzakq zzbv.zzem()>
	//   51  100:aload_0         
	//   52  101:invokevirtual   #91  <Method android.content.Context getContext()>
	//   53  104:aload_1         
	//   54  105:invokevirtual   #97  <Method boolean zzakq.zza(android.content.Context, WebSettings)>
	//   55  108:pop             
		removeJavascriptInterface("accessibility");
	//   56  109:aload_0         
	//   57  110:ldc1            #99  <String "accessibility">
	//   58  112:invokevirtual   #103 <Method void removeJavascriptInterface(String)>
		removeJavascriptInterface("accessibilityTraversal");
	//   59  115:aload_0         
	//   60  116:ldc1            #105 <String "accessibilityTraversal">
	//   61  118:invokevirtual   #103 <Method void removeJavascriptInterface(String)>
		try
		{
			getSettings().setJavaScriptEnabled(true);
	//   62  121:aload_0         
	//   63  122:invokevirtual   #57  <Method WebSettings getSettings()>
	//   64  125:iconst_1        
	//   65  126:invokevirtual   #108 <Method void WebSettings.setJavaScriptEnabled(boolean)>
		}
	//*  66  129:goto            139
		// Misplaced declaration of an exception variable
		catch(zzash zzash)
	//*  67  132:astore_1        
		{
			zzakb.zzb("Unable to enable Javascript.", ((Throwable) (zzash)));
	//   68  133:ldc1            #110 <String "Unable to enable Javascript.">
	//   69  135:aload_1         
	//   70  136:invokestatic    #116 <Method void zzakb.zzb(String, Throwable)>
		}
		setLayerType(1, ((android.graphics.Paint) (null)));
	//   71  139:aload_0         
	//   72  140:iconst_1        
	//   73  141:aconst_null     
	//   74  142:invokevirtual   #120 <Method void setLayerType(int, android.graphics.Paint)>
	//   75  145:aload_0         
	//   76  146:new             #122 <Class zzast>
	//   77  149:dup             
	//   78  150:aload_0         
	//   79  151:aload_0         
	//   80  152:aload_0         
	//   81  153:aload_0         
	//   82  154:invokespecial   #125 <Method void zzast(zzasx, zzatb, zzasz, zzata)>
	//   83  157:putfield        #127 <Field WebViewClient zzdfb>
		super.setWebViewClient(zzdfb);
	//   84  160:aload_0         
	//   85  161:aload_0         
	//   86  162:getfield        #127 <Field WebViewClient zzdfb>
	//   87  165:invokespecial   #131 <Method void WebView.setWebViewClient(WebViewClient)>
	//   88  168:return          
	}

	public void addJavascriptInterface(Object obj, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #78  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          15
		{
			super.addJavascriptInterface(obj, s);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:invokespecial   #136 <Method void WebView.addJavascriptInterface(Object, String)>
			return;
	//    7   14:return          
		} else
		{
			zzakb.v("Ignore addJavascriptInterface due to low Android version.");
	//    8   15:ldc1            #138 <String "Ignore addJavascriptInterface due to low Android version.">
	//    9   17:invokestatic    #141 <Method void zzakb.v(String)>
			return;
	//   10   20:return          
		}
	}

	public void loadUrl(String s)
	{
		try
		{
			super.loadUrl(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #150 <Method void WebView.loadUrl(String)>
			return;
	//    3    5:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   4    6:astore_1        
		{
			zzbv.zzeo().zza(((Throwable) (s)), "CoreWebView.loadUrl");
	//    5    7:invokestatic    #154 <Method zzajm zzbv.zzeo()>
	//    6   10:aload_1         
	//    7   11:ldc1            #156 <String "CoreWebView.loadUrl">
	//    8   13:invokevirtual   #161 <Method void zzajm.zza(Throwable, String)>
		}
		zzakb.zzd("#007 Could not call remote method.", ((Throwable) (s)));
	//    9   16:ldc1            #163 <String "#007 Could not call remote method.">
	//   10   18:aload_1         
	//   11   19:invokestatic    #166 <Method void zzakb.zzd(String, Throwable)>
	//   12   22:return          
	}

	public void setWebViewClient(WebViewClient webviewclient)
	{
	//    0    0:return          
	}

	public final void zza(zzasx zzasx1)
	{
		zzdew.add(((Object) (zzasx1)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List zzdew>
	//    2    4:aload_1         
	//    3    5:invokeinterface #173 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final void zza(zzasz zzasz1)
	{
		zzdey.add(((Object) (zzasz1)));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field List zzdey>
	//    2    4:aload_1         
	//    3    5:invokeinterface #173 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final void zza(zzata zzata1)
	{
		zzdez.add(((Object) (zzata1)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List zzdez>
	//    2    4:aload_1         
	//    3    5:invokeinterface #173 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final void zza(zzatb zzatb1)
	{
		zzdex.add(((Object) (zzatb1)));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List zzdex>
	//    2    4:aload_1         
	//    3    5:invokeinterface #173 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final boolean zza(zzasu zzasu)
	{
		for(Iterator iterator = zzdew.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field List zzdew>
	//*   2    4:invokeinterface #181 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #187 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            39
			if(((zzasx)iterator.next()).zza(zzasu))
	//*   7   19:aload_2         
	//*   8   20:invokeinterface #191 <Method Object Iterator.next()>
	//*   9   25:checkcast       #6   <Class zzasx>
	//*  10   28:aload_1         
	//*  11   29:invokeinterface #193 <Method boolean zzasx.zza(zzasu)>
	//*  12   34:ifeq            10
				return true;
	//   13   37:iconst_1        
	//   14   38:ireturn         

		return false;
	//   15   39:iconst_0        
	//   16   40:ireturn         
	}

	public final void zzb(zzasu zzasu)
	{
		for(Iterator iterator = zzdey.iterator(); iterator.hasNext(); ((zzasz)iterator.next()).zzb(zzasu));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field List zzdey>
	//    2    4:invokeinterface #181 <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #187 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_2         
	//    8   20:invokeinterface #191 <Method Object Iterator.next()>
	//    9   25:checkcast       #8   <Class zzasz>
	//   10   28:aload_1         
	//   11   29:invokeinterface #196 <Method void zzasz.zzb(zzasu)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	public void zzbe(String s)
	{
		zzasy.zza(((WebView) (this)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #202 <Method void zzasy.zza(WebView, String)>
	//    3    5:return          
	}

	public void zzc(zzasu zzasu)
	{
		for(Iterator iterator = zzdez.iterator(); iterator.hasNext(); ((zzata)iterator.next()).zzc(zzasu));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List zzdez>
	//    2    4:invokeinterface #181 <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #187 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_2         
	//    8   20:invokeinterface #191 <Method Object Iterator.next()>
	//    9   25:checkcast       #10  <Class zzata>
	//   10   28:aload_1         
	//   11   29:invokeinterface #205 <Method void zzata.zzc(zzasu)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	public final WebResourceResponse zzd(zzasu zzasu)
	{
		for(Iterator iterator = zzdex.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field List zzdex>
	//*   2    4:invokeinterface #181 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #187 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            41
		{
			WebResourceResponse webresourceresponse = ((zzatb)iterator.next()).zzd(zzasu);
	//    7   19:aload_2         
	//    8   20:invokeinterface #191 <Method Object Iterator.next()>
	//    9   25:checkcast       #12  <Class zzatb>
	//   10   28:aload_1         
	//   11   29:invokeinterface #208 <Method WebResourceResponse zzatb.zzd(zzasu)>
	//   12   34:astore_3        
			if(webresourceresponse != null)
	//*  13   35:aload_3         
	//*  14   36:ifnull          10
				return webresourceresponse;
	//   15   39:aload_3         
	//   16   40:areturn         
		}

		return null;
	//   17   41:aconst_null     
	//   18   42:areturn         
	}

	protected final zzash zzvv()
	{
		return zzdfa;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field zzash zzdfa>
	//    2    4:areturn         
	}

	private final List zzdew = new CopyOnWriteArrayList();
	private final List zzdex = new CopyOnWriteArrayList();
	private final List zzdey = new CopyOnWriteArrayList();
	private final List zzdez = new CopyOnWriteArrayList();
	private final zzash zzdfa;
	protected final WebViewClient zzdfb = new zzast(((zzasx) (this)), ((zzatb) (this)), ((zzasz) (this)), ((zzata) (this)));
}
