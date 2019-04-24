// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import com.android.volley.RequestQueue;
import java.io.File;

// Referenced classes of package com.android.volley.toolbox:
//			HurlStack, HttpClientStack, BasicNetwork, DiskBasedCache, 
//			HttpStack

public class Volley
{

	public Volley()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static RequestQueue newRequestQueue(Context context)
	{
		return newRequestQueue(context, ((HttpStack) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #18  <Method RequestQueue newRequestQueue(Context, HttpStack)>
	//    3    5:areturn         
	}

	public static RequestQueue newRequestQueue(Context context, int i)
	{
		return newRequestQueue(context, ((HttpStack) (null)), i);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iload_1         
	//    3    3:invokestatic    #22  <Method RequestQueue newRequestQueue(Context, HttpStack, int)>
	//    4    6:areturn         
	}

	public static RequestQueue newRequestQueue(Context context, HttpStack httpstack)
	{
		return newRequestQueue(context, httpstack, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokestatic    #22  <Method RequestQueue newRequestQueue(Context, HttpStack, int)>
	//    4    6:areturn         
	}

	public static RequestQueue newRequestQueue(Context context, HttpStack httpstack, int i)
	{
		Object obj;
		File file;
		file = new File(context.getCacheDir(), "volley");
	//    0    0:new             #26  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #32  <Method File Context.getCacheDir()>
	//    4    8:ldc1            #8   <String "volley">
	//    5   10:invokespecial   #35  <Method void File(File, String)>
	//    6   13:astore          4
		obj = "volley/0";
	//    7   15:ldc1            #37  <String "volley/0">
	//    8   17:astore_3        
		String s = context.getPackageName();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #41  <Method String Context.getPackageName()>
	//   11   22:astore          5
		context = ((Context) (context.getPackageManager().getPackageInfo(s, 0)));
	//   12   24:aload_0         
	//   13   25:invokevirtual   #45  <Method PackageManager Context.getPackageManager()>
	//   14   28:aload           5
	//   15   30:iconst_0        
	//   16   31:invokevirtual   #51  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   17   34:astore_0        
		context = ((Context) ((new StringBuilder()).append(s).append("/").append(((PackageInfo) (context)).versionCode).toString()));
	//   18   35:new             #53  <Class StringBuilder>
	//   19   38:dup             
	//   20   39:invokespecial   #54  <Method void StringBuilder()>
	//   21   42:aload           5
	//   22   44:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:ldc1            #60  <String "/">
	//   24   49:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:aload_0         
	//   26   53:getfield        #66  <Field int PackageInfo.versionCode>
	//   27   56:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   28   59:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   29   62:astore_0        
		obj = ((Object) (context));
	//   30   63:aload_0         
	//   31   64:astore_3        
		break MISSING_BLOCK_LABEL_69;
	//   32   65:goto            69
		context;
	//   33   68:astore_0        
		context = ((Context) (httpstack));
	//   34   69:aload_1         
	//   35   70:astore_0        
		if(httpstack == null)
	//*  36   71:aload_1         
	//*  37   72:ifnonnull       106
			if(android.os.Build.VERSION.SDK_INT >= 9)
	//*  38   75:getstatic       #77  <Field int android.os.Build$VERSION.SDK_INT>
	//*  39   78:bipush          9
	//*  40   80:icmplt          94
				context = ((Context) (new HurlStack()));
	//   41   83:new             #79  <Class HurlStack>
	//   42   86:dup             
	//   43   87:invokespecial   #80  <Method void HurlStack()>
	//   44   90:astore_0        
			else
	//*  45   91:goto            106
				context = ((Context) (new HttpClientStack(((org.apache.http.client.HttpClient) (AndroidHttpClient.newInstance(((String) (obj))))))));
	//   46   94:new             #82  <Class HttpClientStack>
	//   47   97:dup             
	//   48   98:aload_3         
	//   49   99:invokestatic    #88  <Method AndroidHttpClient AndroidHttpClient.newInstance(String)>
	//   50  102:invokespecial   #91  <Method void HttpClientStack(org.apache.http.client.HttpClient)>
	//   51  105:astore_0        
		context = ((Context) (new BasicNetwork(((HttpStack) (context)))));
	//   52  106:new             #93  <Class BasicNetwork>
	//   53  109:dup             
	//   54  110:aload_0         
	//   55  111:invokespecial   #96  <Method void BasicNetwork(HttpStack)>
	//   56  114:astore_0        
		if(i <= -1)
	//*  57  115:iload_2         
	//*  58  116:iconst_m1       
	//*  59  117:icmpgt          141
			context = ((Context) (new RequestQueue(((com.android.volley.Cache) (new DiskBasedCache(file))), ((com.android.volley.Network) (context)))));
	//   60  120:new             #98  <Class RequestQueue>
	//   61  123:dup             
	//   62  124:new             #100 <Class DiskBasedCache>
	//   63  127:dup             
	//   64  128:aload           4
	//   65  130:invokespecial   #103 <Method void DiskBasedCache(File)>
	//   66  133:aload_0         
	//   67  134:invokespecial   #106 <Method void RequestQueue(com.android.volley.Cache, com.android.volley.Network)>
	//   68  137:astore_0        
		else
	//*  69  138:goto            160
			context = ((Context) (new RequestQueue(((com.android.volley.Cache) (new DiskBasedCache(file, i))), ((com.android.volley.Network) (context)))));
	//   70  141:new             #98  <Class RequestQueue>
	//   71  144:dup             
	//   72  145:new             #100 <Class DiskBasedCache>
	//   73  148:dup             
	//   74  149:aload           4
	//   75  151:iload_2         
	//   76  152:invokespecial   #109 <Method void DiskBasedCache(File, int)>
	//   77  155:aload_0         
	//   78  156:invokespecial   #106 <Method void RequestQueue(com.android.volley.Cache, com.android.volley.Network)>
	//   79  159:astore_0        
		((RequestQueue) (context)).start();
	//   80  160:aload_0         
	//   81  161:invokevirtual   #112 <Method void RequestQueue.start()>
		return ((RequestQueue) (context));
	//   82  164:aload_0         
	//   83  165:areturn         
	}

	private static final String DEFAULT_CACHE_DIR = "volley";
}
