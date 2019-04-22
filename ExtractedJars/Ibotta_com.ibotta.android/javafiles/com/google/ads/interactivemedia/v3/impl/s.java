// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.content.Context;
import android.os.Message;
import android.webkit.*;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			ab

public class s extends WebView
{

	public s(Context context, ab ab, CompanionData companiondata, List list)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void WebView(Context)>
		getSettings().setSupportMultipleWindows(true);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #17  <Method WebSettings getSettings()>
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #23  <Method void WebSettings.setSupportMultipleWindows(boolean)>
		setWebChromeClient(((WebChromeClient) (new WebChromeClient(context, ab, list) {

			public boolean onCreateWindow(WebView webview, boolean flag, boolean flag1, Message message)
			{
				webview = ((WebView) ((android.webkit.WebView.WebViewTransport)message.obj));
			//    0    0:aload           4
			//    1    2:getfield        #36  <Field Object Message.obj>
			//    2    5:checkcast       #38  <Class android.webkit.WebView$WebViewTransport>
			//    3    8:astore_1        
				((android.webkit.WebView.WebViewTransport) (webview)).setWebView(new WebView(a));
			//    4    9:aload_1         
			//    5   10:new             #40  <Class WebView>
			//    6   13:dup             
			//    7   14:aload_0         
			//    8   15:getfield        #20  <Field Context a>
			//    9   18:invokespecial   #43  <Method void WebView(Context)>
			//   10   21:invokevirtual   #47  <Method void android.webkit.WebView$WebViewTransport.setWebView(WebView)>
				((android.webkit.WebView.WebViewTransport) (webview)).getWebView().setWebViewClient(((WebViewClient) (new WebViewClient(this) {

					public boolean shouldOverrideUrlLoading(WebView webview, String s1)
					{
						a.b.d(s1);
					//    0    0:aload_0         
					//    1    1:getfield        #15  <Field s$1 a>
					//    2    4:getfield        #25  <Field ab s$1.b>
					//    3    7:aload_2         
					//    4    8:invokevirtual   #31  <Method void ab.d(String)>
						for(webview = ((WebView) (a.c.iterator())); ((Iterator) (webview)).hasNext(); ((com.google.ads.interactivemedia.v3.api.CompanionAdSlot.ClickListener)((Iterator) (webview)).next()).onCompanionAdClick());
					//    5   11:aload_0         
					//    6   12:getfield        #15  <Field s$1 a>
					//    7   15:getfield        #35  <Field List s$1.c>
					//    8   18:invokeinterface #41  <Method Iterator List.iterator()>
					//    9   23:astore_1        
					//   10   24:aload_1         
					//   11   25:invokeinterface #47  <Method boolean Iterator.hasNext()>
					//   12   30:ifeq            50
					//   13   33:aload_1         
					//   14   34:invokeinterface #51  <Method Object Iterator.next()>
					//   15   39:checkcast       #53  <Class com.google.ads.interactivemedia.v3.api.CompanionAdSlot$ClickListener>
					//   16   42:invokeinterface #56  <Method void com.google.ads.interactivemedia.v3.api.CompanionAdSlot$ClickListener.onCompanionAdClick()>
					//*  17   47:goto            24
						return true;
					//   18   50:iconst_1        
					//   19   51:ireturn         
					}

					final _cls1 a;

			
			{
				a = _pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field s$1 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void WebViewClient()>
			//    5    9:return          
			}
				}
)));
			//   11   24:aload_1         
			//   12   25:invokevirtual   #51  <Method WebView android.webkit.WebView$WebViewTransport.getWebView()>
			//   13   28:new             #11  <Class s$1$1>
			//   14   31:dup             
			//   15   32:aload_0         
			//   16   33:invokespecial   #54  <Method void s$1$1(s$1)>
			//   17   36:invokevirtual   #58  <Method void WebView.setWebViewClient(WebViewClient)>
				message.sendToTarget();
			//   18   39:aload           4
			//   19   41:invokevirtual   #61  <Method void Message.sendToTarget()>
				return true;
			//   20   44:iconst_1        
			//   21   45:ireturn         
			}

			final Context a;
			final ab b;
			final List c;

			
			{
				a = context;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #20  <Field Context a>
				b = ab;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field ab b>
				c = list;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #24  <Field List c>
				super();
			//    9   16:aload_0         
			//   10   17:invokespecial   #27  <Method void WebChromeClient()>
			//   11   20:return          
			}
		}
)));
	//    7   13:aload_0         
	//    8   14:new             #6   <Class s$1>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload           4
	//   14   23:invokespecial   #26  <Method void s$1(s, Context, ab, List)>
	//   15   26:invokevirtual   #30  <Method void setWebChromeClient(WebChromeClient)>
		if(companiondata.type() == com.google.ads.interactivemedia.v3.impl.data.CompanionData.a.Html)
	//*  16   29:aload_3         
	//*  17   30:invokevirtual   #36  <Method com.google.ads.interactivemedia.v3.impl.data.CompanionData$a CompanionData.type()>
	//*  18   33:getstatic       #42  <Field com.google.ads.interactivemedia.v3.impl.data.CompanionData$a com.google.ads.interactivemedia.v3.impl.data.CompanionData$a.Html>
	//*  19   36:if_acmpne       51
		{
			loadData(companiondata.src(), "text/html", ((String) (null)));
	//   20   39:aload_0         
	//   21   40:aload_3         
	//   22   41:invokevirtual   #46  <Method String CompanionData.src()>
	//   23   44:ldc1            #48  <String "text/html">
	//   24   46:aconst_null     
	//   25   47:invokevirtual   #52  <Method void loadData(String, String, String)>
			return;
	//   26   50:return          
		}
		if(companiondata.type() == com.google.ads.interactivemedia.v3.impl.data.CompanionData.a.IFrame)
	//*  27   51:aload_3         
	//*  28   52:invokevirtual   #36  <Method com.google.ads.interactivemedia.v3.impl.data.CompanionData$a CompanionData.type()>
	//*  29   55:getstatic       #55  <Field com.google.ads.interactivemedia.v3.impl.data.CompanionData$a com.google.ads.interactivemedia.v3.impl.data.CompanionData$a.IFrame>
	//*  30   58:if_acmpne       70
		{
			loadUrl(companiondata.src());
	//   31   61:aload_0         
	//   32   62:aload_3         
	//   33   63:invokevirtual   #46  <Method String CompanionData.src()>
	//   34   66:invokevirtual   #59  <Method void loadUrl(String)>
			return;
	//   35   69:return          
		} else
		{
			context = ((Context) (String.valueOf(((Object) (companiondata.type())))));
	//   36   70:aload_3         
	//   37   71:invokevirtual   #36  <Method com.google.ads.interactivemedia.v3.impl.data.CompanionData$a CompanionData.type()>
	//   38   74:invokestatic    #65  <Method String String.valueOf(Object)>
	//   39   77:astore_1        
			ab = ((ab) (new StringBuilder(String.valueOf(((Object) (context))).length() + 51)));
	//   40   78:new             #67  <Class StringBuilder>
	//   41   81:dup             
	//   42   82:aload_1         
	//   43   83:invokestatic    #65  <Method String String.valueOf(Object)>
	//   44   86:invokevirtual   #71  <Method int String.length()>
	//   45   89:bipush          51
	//   46   91:iadd            
	//   47   92:invokespecial   #74  <Method void StringBuilder(int)>
	//   48   95:astore_2        
			((StringBuilder) (ab)).append("Companion type ");
	//   49   96:aload_2         
	//   50   97:ldc1            #76  <String "Companion type ">
	//   51   99:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   52  102:pop             
			((StringBuilder) (ab)).append(((String) (context)));
	//   53  103:aload_2         
	//   54  104:aload_1         
	//   55  105:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   56  108:pop             
			((StringBuilder) (ab)).append(" is not valid for a CompanionWebView");
	//   57  109:aload_2         
	//   58  110:ldc1            #82  <String " is not valid for a CompanionWebView">
	//   59  112:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   60  115:pop             
			throw new IllegalArgumentException(((StringBuilder) (ab)).toString());
	//   61  116:new             #84  <Class IllegalArgumentException>
	//   62  119:dup             
	//   63  120:aload_2         
	//   64  121:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   65  124:invokespecial   #89  <Method void IllegalArgumentException(String)>
	//   66  127:athrow          
		}
	}
}
