// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import android.net.Uri;
import java.net.*;
import java.util.concurrent.Callable;

// Referenced classes of package bolts:
//			WebViewAppLinkResolver, Capture

class WebViewAppLinkResolver$3
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method Void call()>
	//    2    4:areturn         
	}

	public Void call()
		throws Exception
	{
		URLConnection urlconnection;
		URL url1 = new URL(val$url.toString());
	//    0    0:new             #43  <Class URL>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field Uri val$url>
	//    4    8:invokevirtual   #49  <Method String Uri.toString()>
	//    5   11:invokespecial   #52  <Method void URL(String)>
	//    6   14:astore_2        
		urlconnection = null;
	//    7   15:aconst_null     
	//    8   16:astore_3        
		while(url1 != null) 
	//*   9   17:aload_2         
	//*  10   18:ifnull          120
		{
			urlconnection = url1.openConnection();
	//   11   21:aload_2         
	//   12   22:invokevirtual   #56  <Method URLConnection URL.openConnection()>
	//   13   25:astore_3        
			boolean flag = urlconnection instanceof HttpURLConnection;
	//   14   26:aload_3         
	//   15   27:instanceof      #58  <Class HttpURLConnection>
	//   16   30:istore_1        
			if(flag)
	//*  17   31:iload_1         
	//*  18   32:ifeq            43
				((HttpURLConnection)urlconnection).setInstanceFollowRedirects(true);
	//   19   35:aload_3         
	//   20   36:checkcast       #58  <Class HttpURLConnection>
	//   21   39:iconst_1        
	//   22   40:invokevirtual   #62  <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
			urlconnection.setRequestProperty("Prefer-Html-Meta-Tags", "al");
	//   23   43:aload_3         
	//   24   44:ldc1            #64  <String "Prefer-Html-Meta-Tags">
	//   25   46:ldc1            #66  <String "al">
	//   26   48:invokevirtual   #72  <Method void URLConnection.setRequestProperty(String, String)>
			urlconnection.connect();
	//   27   51:aload_3         
	//   28   52:invokevirtual   #75  <Method void URLConnection.connect()>
			if(flag)
	//*  29   55:iload_1         
	//*  30   56:ifeq            115
			{
				HttpURLConnection httpurlconnection = (HttpURLConnection)urlconnection;
	//   31   59:aload_3         
	//   32   60:checkcast       #58  <Class HttpURLConnection>
	//   33   63:astore          4
				if(httpurlconnection.getResponseCode() >= 300 && httpurlconnection.getResponseCode() < 400)
	//*  34   65:aload           4
	//*  35   67:invokevirtual   #79  <Method int HttpURLConnection.getResponseCode()>
	//*  36   70:sipush          300
	//*  37   73:icmplt          110
	//*  38   76:aload           4
	//*  39   78:invokevirtual   #79  <Method int HttpURLConnection.getResponseCode()>
	//*  40   81:sipush          400
	//*  41   84:icmpge          110
				{
					url1 = new URL(httpurlconnection.getHeaderField("Location"));
	//   42   87:new             #43  <Class URL>
	//   43   90:dup             
	//   44   91:aload           4
	//   45   93:ldc1            #81  <String "Location">
	//   46   95:invokevirtual   #85  <Method String HttpURLConnection.getHeaderField(String)>
	//   47   98:invokespecial   #52  <Method void URL(String)>
	//   48  101:astore_2        
					httpurlconnection.disconnect();
	//   49  102:aload           4
	//   50  104:invokevirtual   #88  <Method void HttpURLConnection.disconnect()>
				} else
	//*  51  107:goto            17
				{
					url1 = null;
	//   52  110:aconst_null     
	//   53  111:astore_2        
				}
			} else
	//*  54  112:goto            17
			{
				url1 = null;
	//   55  115:aconst_null     
	//   56  116:astore_2        
			}
		}
	//*  57  117:goto            17
		val$content.set(((Object) (WebViewAppLinkResolver.access$300(urlconnection))));
	//   58  120:aload_0         
	//   59  121:getfield        #27  <Field Capture val$content>
	//   60  124:aload_3         
	//   61  125:invokestatic    #92  <Method String WebViewAppLinkResolver.access$300(URLConnection)>
	//   62  128:invokevirtual   #98  <Method void Capture.set(Object)>
		val$contentType.set(((Object) (urlconnection.getContentType())));
	//   63  131:aload_0         
	//   64  132:getfield        #29  <Field Capture val$contentType>
	//   65  135:aload_3         
	//   66  136:invokevirtual   #101 <Method String URLConnection.getContentType()>
	//   67  139:invokevirtual   #98  <Method void Capture.set(Object)>
		if(urlconnection instanceof HttpURLConnection)
	//*  68  142:aload_3         
	//*  69  143:instanceof      #58  <Class HttpURLConnection>
	//*  70  146:ifeq            156
			((HttpURLConnection)urlconnection).disconnect();
	//   71  149:aload_3         
	//   72  150:checkcast       #58  <Class HttpURLConnection>
	//   73  153:invokevirtual   #88  <Method void HttpURLConnection.disconnect()>
		return null;
	//   74  156:aconst_null     
	//   75  157:areturn         
		Exception exception;
		exception;
	//   76  158:astore_2        
		if(urlconnection instanceof HttpURLConnection)
	//*  77  159:aload_3         
	//*  78  160:instanceof      #58  <Class HttpURLConnection>
	//*  79  163:ifeq            173
			((HttpURLConnection)urlconnection).disconnect();
	//   80  166:aload_3         
	//   81  167:checkcast       #58  <Class HttpURLConnection>
	//   82  170:invokevirtual   #88  <Method void HttpURLConnection.disconnect()>
		throw exception;
	//   83  173:aload_2         
	//   84  174:athrow          
	}

	final WebViewAppLinkResolver this$0;
	final Capture val$content;
	final Capture val$contentType;
	final Uri val$url;

	WebViewAppLinkResolver$3()
	{
		this$0 = final_webviewapplinkresolver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field WebViewAppLinkResolver this$0>
		val$url = uri;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field Uri val$url>
		val$content = capture;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field Capture val$content>
		val$contentType = Capture.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field Capture val$contentType>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
