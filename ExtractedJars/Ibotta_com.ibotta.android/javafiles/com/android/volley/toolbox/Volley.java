// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import com.android.volley.Network;
import com.android.volley.RequestQueue;
import java.io.File;

// Referenced classes of package com.android.volley.toolbox:
//			BaseHttpStack, DiskBasedCache, BasicNetwork, HurlStack, 
//			HttpClientStack

public class Volley
{

	public static RequestQueue newRequestQueue(Context context)
	{
		return newRequestQueue(context, (BaseHttpStack)null);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:checkcast       #8   <Class BaseHttpStack>
	//    3    5:invokestatic    #11  <Method RequestQueue newRequestQueue(Context, BaseHttpStack)>
	//    4    8:areturn         
	}

	private static RequestQueue newRequestQueue(Context context, Network network)
	{
		context = ((Context) (new RequestQueue(((com.android.volley.Cache) (new DiskBasedCache(new File(context.getCacheDir(), "volley")))), network)));
	//    0    0:new             #15  <Class RequestQueue>
	//    1    3:dup             
	//    2    4:new             #17  <Class DiskBasedCache>
	//    3    7:dup             
	//    4    8:new             #19  <Class File>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #25  <Method File Context.getCacheDir()>
	//    8   16:ldc1            #27  <String "volley">
	//    9   18:invokespecial   #31  <Method void File(File, String)>
	//   10   21:invokespecial   #34  <Method void DiskBasedCache(File)>
	//   11   24:aload_1         
	//   12   25:invokespecial   #37  <Method void RequestQueue(com.android.volley.Cache, Network)>
	//   13   28:astore_0        
		((RequestQueue) (context)).start();
	//   14   29:aload_0         
	//   15   30:invokevirtual   #41  <Method void RequestQueue.start()>
		return ((RequestQueue) (context));
	//   16   33:aload_0         
	//   17   34:areturn         
	}

	public static RequestQueue newRequestQueue(Context context, BaseHttpStack basehttpstack)
	{
		if(basehttpstack != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       112
_L1:
		if(android.os.Build.VERSION.SDK_INT < 9) goto _L4; else goto _L3
	//    2    4:getstatic       #49  <Field int android.os.Build$VERSION.SDK_INT>
	//    3    7:bipush          9
	//    4    9:icmplt          30
_L3:
		basehttpstack = ((BaseHttpStack) (new BasicNetwork(((BaseHttpStack) (new HurlStack())))));
	//    5   12:new             #51  <Class BasicNetwork>
	//    6   15:dup             
	//    7   16:new             #53  <Class HurlStack>
	//    8   19:dup             
	//    9   20:invokespecial   #55  <Method void HurlStack()>
	//   10   23:invokespecial   #58  <Method void BasicNetwork(BaseHttpStack)>
	//   11   26:astore_1        
		  goto _L5
	//*  12   27:goto            121
_L4:
		basehttpstack = "volley/0";
	//   13   30:ldc1            #60  <String "volley/0">
	//   14   32:astore_1        
		String s;
		s = context.getPackageName();
	//   15   33:aload_0         
	//   16   34:invokevirtual   #64  <Method String Context.getPackageName()>
	//   17   37:astore_2        
		PackageInfo packageinfo = context.getPackageManager().getPackageInfo(s, 0);
	//   18   38:aload_0         
	//   19   39:invokevirtual   #68  <Method PackageManager Context.getPackageManager()>
	//   20   42:aload_2         
	//   21   43:iconst_0        
	//   22   44:invokevirtual   #74  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   23   47:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   24   48:new             #76  <Class StringBuilder>
	//   25   51:dup             
	//   26   52:invokespecial   #77  <Method void StringBuilder()>
	//   27   55:astore          4
		stringbuilder.append(s);
	//   28   57:aload           4
	//   29   59:aload_2         
	//   30   60:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
		stringbuilder.append("/");
	//   32   64:aload           4
	//   33   66:ldc1            #83  <String "/">
	//   34   68:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   35   71:pop             
		stringbuilder.append(packageinfo.versionCode);
	//   36   72:aload           4
	//   37   74:aload_3         
	//   38   75:getfield        #88  <Field int PackageInfo.versionCode>
	//   39   78:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//   40   81:pop             
		s = stringbuilder.toString();
	//   41   82:aload           4
	//   42   84:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   43   87:astore_2        
		basehttpstack = ((BaseHttpStack) (s));
	//   44   88:aload_2         
	//   45   89:astore_1        
_L7:
		basehttpstack = ((BaseHttpStack) (new BasicNetwork(((HttpStack) (new HttpClientStack(((org.apache.http.client.HttpClient) (AndroidHttpClient.newInstance(((String) (basehttpstack)))))))))));
	//   46   90:new             #51  <Class BasicNetwork>
	//   47   93:dup             
	//   48   94:new             #96  <Class HttpClientStack>
	//   49   97:dup             
	//   50   98:aload_1         
	//   51   99:invokestatic    #102 <Method AndroidHttpClient AndroidHttpClient.newInstance(String)>
	//   52  102:invokespecial   #105 <Method void HttpClientStack(org.apache.http.client.HttpClient)>
	//   53  105:invokespecial   #108 <Method void BasicNetwork(HttpStack)>
	//   54  108:astore_1        
		  goto _L5
	//*  55  109:goto            121
_L2:
		basehttpstack = ((BaseHttpStack) (new BasicNetwork(basehttpstack)));
	//   56  112:new             #51  <Class BasicNetwork>
	//   57  115:dup             
	//   58  116:aload_1         
	//   59  117:invokespecial   #58  <Method void BasicNetwork(BaseHttpStack)>
	//   60  120:astore_1        
_L5:
		return newRequestQueue(context, ((Network) (basehttpstack)));
	//   61  121:aload_0         
	//   62  122:aload_1         
	//   63  123:invokestatic    #110 <Method RequestQueue newRequestQueue(Context, Network)>
	//   64  126:areturn         
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		namenotfoundexception;
	//   65  127:astore_2        
		if(true) goto _L7; else goto _L6
_L6:
	//*  66  128:goto            90
	}
}
