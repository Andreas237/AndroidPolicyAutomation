// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzatc, zzasx, zzatb, zzakb, 
//			zzasu, zzasz, zzata

final class zzast extends WebViewClient
{

	zzast(zzasx zzasx1, zzatb zzatb1, zzasz zzasz1, zzata zzata1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void WebViewClient()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class zzatc>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void zzatc()>
	//    6   12:putfield        #26  <Field zzatc zzdfg>
		zzdfc = zzasx1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #28  <Field zzasx zzdfc>
		zzdfd = zzatb1;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #30  <Field zzatb zzdfd>
		zzdfe = zzasz1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #32  <Field zzasz zzdfe>
		zzdff = zzata1;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #34  <Field zzata zzdff>
	//   19   36:return          
	}

	private final boolean zzf(zzasu zzasu1)
	{
		return zzdfc.zza(zzasu1);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field zzasx zzdfc>
	//    2    4:aload_1         
	//    3    5:invokeinterface #42  <Method boolean zzasx.zza(zzasu)>
	//    4   10:ireturn         
	}

	private final WebResourceResponse zzg(zzasu zzasu1)
	{
		return zzdfd.zzd(zzasu1);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field zzatb zzdfd>
	//    2    4:aload_1         
	//    3    5:invokeinterface #49  <Method WebResourceResponse zzatb.zzd(zzasu)>
	//    4   10:areturn         
	}

	public final void onLoadResource(WebView webview, String s)
	{
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		webview = ((WebView) (String.valueOf(((Object) (s)))));
	//    3    5:aload_2         
	//    4    6:invokestatic    #57  <Method String String.valueOf(Object)>
	//    5    9:astore_1        
		if(((String) (webview)).length() != 0)
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #61  <Method int String.length()>
	//*   8   14:ifeq            27
			webview = ((WebView) ("Loading resource: ".concat(((String) (webview)))));
	//    9   17:ldc1            #63  <String "Loading resource: ">
	//   10   19:aload_1         
	//   11   20:invokevirtual   #67  <Method String String.concat(String)>
	//   12   23:astore_1        
		else
	//*  13   24:goto            37
			webview = ((WebView) (new String("Loading resource: ")));
	//   14   27:new             #53  <Class String>
	//   15   30:dup             
	//   16   31:ldc1            #63  <String "Loading resource: ">
	//   17   33:invokespecial   #70  <Method void String(String)>
	//   18   36:astore_1        
		zzakb.v(((String) (webview)));
	//   19   37:aload_1         
	//   20   38:invokestatic    #75  <Method void zzakb.v(String)>
		zzdfe.zzb(new zzasu(s));
	//   21   41:aload_0         
	//   22   42:getfield        #32  <Field zzasz zzdfe>
	//   23   45:new             #77  <Class zzasu>
	//   24   48:dup             
	//   25   49:aload_2         
	//   26   50:invokespecial   #78  <Method void zzasu(String)>
	//   27   53:invokeinterface #84  <Method void zzasz.zzb(zzasu)>
	//   28   58:return          
	}

	public final void onPageFinished(WebView webview, String s)
	{
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			zzdff.zzc(new zzasu(s));
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field zzata zzdff>
	//    5    9:new             #77  <Class zzasu>
	//    6   12:dup             
	//    7   13:aload_2         
	//    8   14:invokespecial   #78  <Method void zzasu(String)>
	//    9   17:invokeinterface #90  <Method void zzata.zzc(zzasu)>
			return;
	//   10   22:return          
		}
	}

	public final void onReceivedError(WebView webview, int i, String s, String s1)
	{
		zzdfg.zze(i, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field zzatc zzdfg>
	//    2    4:iload_2         
	//    3    5:aload           4
	//    4    7:invokevirtual   #96  <Method void zzatc.zze(int, String)>
	//    5   10:return          
	}

	public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
	{
		zzdfg.zzb(sslerror);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field zzatc zzdfg>
	//    2    4:aload_3         
	//    3    5:invokevirtual   #101 <Method void zzatc.zzb(SslError)>
	//    4    8:return          
	}

	public final WebResourceResponse shouldInterceptRequest(WebView webview, WebResourceRequest webresourcerequest)
	{
		if(webresourcerequest != null && webresourcerequest.getUrl() != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          29
	//*   2    4:aload_2         
	//*   3    5:invokeinterface #112 <Method android.net.Uri WebResourceRequest.getUrl()>
	//*   4   10:ifnonnull       16
	//*   5   13:goto            29
			return zzg(new zzasu(webresourcerequest));
	//    6   16:aload_0         
	//    7   17:new             #77  <Class zzasu>
	//    8   20:dup             
	//    9   21:aload_2         
	//   10   22:invokespecial   #115 <Method void zzasu(WebResourceRequest)>
	//   11   25:invokespecial   #117 <Method WebResourceResponse zzg(zzasu)>
	//   12   28:areturn         
		else
			return null;
	//   13   29:aconst_null     
	//   14   30:areturn         
	}

	public final WebResourceResponse shouldInterceptRequest(WebView webview, String s)
	{
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return zzg(new zzasu(s));
	//    4    6:aload_0         
	//    5    7:new             #77  <Class zzasu>
	//    6   10:dup             
	//    7   11:aload_2         
	//    8   12:invokespecial   #78  <Method void zzasu(String)>
	//    9   15:invokespecial   #117 <Method WebResourceResponse zzg(zzasu)>
	//   10   18:areturn         
	}

	public final boolean shouldOverrideKeyEvent(WebView webview, KeyEvent keyevent)
	{
		int i = keyevent.getKeyCode();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #126 <Method int KeyEvent.getKeyCode()>
	//    2    4:istore_3        
		if(i != 79 && i != 222)
	//*   3    5:iload_3         
	//*   4    6:bipush          79
	//*   5    8:icmpeq          98
	//*   6   11:iload_3         
	//*   7   12:sipush          222
	//*   8   15:icmpeq          98
			switch(i)
	//*   9   18:iload_3         
			{
	//*  10   19:tableswitch     85 91: default 60
	//	               85 98
	//	               86 98
	//	               87 98
	//	               88 98
	//	               89 98
	//	               90 98
	//	               91 98
			default:
				switch(i)
	//*  11   60:iload_3         
				{
	//*  12   61:tableswitch     126 130: default 96
	//	               126 98
	//	               127 98
	//	               128 98
	//	               129 98
	//	               130 98
				default:
					return false;
	//   13   96:iconst_0        
	//   14   97:ireturn         

				case 126: // '~'
				case 127: // '\177'
				case 128: 
				case 129: 
				case 130: 
					break;
				}
				break;

			case 85: // 'U'
			case 86: // 'V'
			case 87: // 'W'
			case 88: // 'X'
			case 89: // 'Y'
			case 90: // 'Z'
			case 91: // '['
				break;
			}
		return true;
	//   15   98:iconst_1        
	//   16   99:ireturn         
	}

	public final boolean shouldOverrideUrlLoading(WebView webview, WebResourceRequest webresourcerequest)
	{
		if(webresourcerequest != null && webresourcerequest.getUrl() != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          29
	//*   2    4:aload_2         
	//*   3    5:invokeinterface #112 <Method android.net.Uri WebResourceRequest.getUrl()>
	//*   4   10:ifnonnull       16
	//*   5   13:goto            29
			return zzf(new zzasu(webresourcerequest));
	//    6   16:aload_0         
	//    7   17:new             #77  <Class zzasu>
	//    8   20:dup             
	//    9   21:aload_2         
	//   10   22:invokespecial   #115 <Method void zzasu(WebResourceRequest)>
	//   11   25:invokespecial   #130 <Method boolean zzf(zzasu)>
	//   12   28:ireturn         
		else
			return false;
	//   13   29:iconst_0        
	//   14   30:ireturn         
	}

	public final boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return zzf(new zzasu(s));
	//    4    6:aload_0         
	//    5    7:new             #77  <Class zzasu>
	//    6   10:dup             
	//    7   11:aload_2         
	//    8   12:invokespecial   #78  <Method void zzasu(String)>
	//    9   15:invokespecial   #130 <Method boolean zzf(zzasu)>
	//   10   18:ireturn         
	}

	private final zzasx zzdfc;
	private final zzatb zzdfd;
	private final zzasz zzdfe;
	private final zzata zzdff;
	private final zzatc zzdfg = new zzatc();
}
