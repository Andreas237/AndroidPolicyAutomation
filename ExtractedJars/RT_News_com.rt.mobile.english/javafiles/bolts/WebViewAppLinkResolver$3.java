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
		do
		{
			if(url1 == null)
				break;
	//    9   17:aload_2         
	//   10   18:ifnull          115
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
	//*  30   56:ifeq            110
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
					continue;
	//   51  107:goto            17
				}
			}
			url1 = null;
	//   52  110:aconst_null     
	//   53  111:astore_2        
		} while(true);
	//   54  112:goto            17
		val$content.set(((Object) (WebViewAppLinkResolver.access$300(urlconnection))));
	//   55  115:aload_0         
	//   56  116:getfield        #27  <Field Capture val$content>
	//   57  119:aload_3         
	//   58  120:invokestatic    #92  <Method String WebViewAppLinkResolver.access$300(URLConnection)>
	//   59  123:invokevirtual   #98  <Method void Capture.set(Object)>
		val$contentType.set(((Object) (urlconnection.getContentType())));
	//   60  126:aload_0         
	//   61  127:getfield        #29  <Field Capture val$contentType>
	//   62  130:aload_3         
	//   63  131:invokevirtual   #101 <Method String URLConnection.getContentType()>
	//   64  134:invokevirtual   #98  <Method void Capture.set(Object)>
		if(urlconnection instanceof HttpURLConnection)
	//*  65  137:aload_3         
	//*  66  138:instanceof      #58  <Class HttpURLConnection>
	//*  67  141:ifeq            151
			((HttpURLConnection)urlconnection).disconnect();
	//   68  144:aload_3         
	//   69  145:checkcast       #58  <Class HttpURLConnection>
	//   70  148:invokevirtual   #88  <Method void HttpURLConnection.disconnect()>
		return null;
	//   71  151:aconst_null     
	//   72  152:areturn         
		Exception exception;
		exception;
	//   73  153:astore_2        
		if(urlconnection instanceof HttpURLConnection)
	//*  74  154:aload_3         
	//*  75  155:instanceof      #58  <Class HttpURLConnection>
	//*  76  158:ifeq            168
			((HttpURLConnection)urlconnection).disconnect();
	//   77  161:aload_3         
	//   78  162:checkcast       #58  <Class HttpURLConnection>
	//   79  165:invokevirtual   #88  <Method void HttpURLConnection.disconnect()>
		throw exception;
	//   80  168:aload_2         
	//   81  169:athrow          
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
