// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.os.AsyncTask;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

public class APSUsageTracker extends AsyncTask
{

	public APSUsageTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void AsyncTask()>
	//    2    4:return          
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((String[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class String[]>
	//    3    5:invokevirtual   #39  <Method Void doInBackground(String[])>
	//    4    8:areturn         
	}

	protected transient Void doInBackground(String as[])
	{
		Object obj = ((Object) (new BasicHttpParams()));
	//    0    0:new             #47  <Class BasicHttpParams>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void BasicHttpParams()>
	//    3    7:astore_2        
		HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj)), 2000);
	//    4    8:aload_2         
	//    5    9:sipush          2000
	//    6   12:invokestatic    #54  <Method void HttpConnectionParams.setConnectionTimeout(org.apache.http.params.HttpParams, int)>
		HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj)), 2000);
	//    7   15:aload_2         
	//    8   16:sipush          2000
	//    9   19:invokestatic    #57  <Method void HttpConnectionParams.setSoTimeout(org.apache.http.params.HttpParams, int)>
		obj = ((Object) (new DefaultHttpClient(((org.apache.http.params.HttpParams) (obj)))));
	//   10   22:new             #59  <Class DefaultHttpClient>
	//   11   25:dup             
	//   12   26:aload_2         
	//   13   27:invokespecial   #62  <Method void DefaultHttpClient(org.apache.http.params.HttpParams)>
	//   14   30:astore_2        
		HttpPost httppost = new HttpPost("http://panel.veeso.co:5200/track");
	//   15   31:new             #64  <Class HttpPost>
	//   16   34:dup             
	//   17   35:ldc1            #27  <String "http://panel.veeso.co:5200/track">
	//   18   37:invokespecial   #67  <Method void HttpPost(String)>
	//   19   40:astore_3        
		ArrayList arraylist = new ArrayList(2);
	//   20   41:new             #69  <Class ArrayList>
	//   21   44:dup             
	//   22   45:iconst_2        
	//   23   46:invokespecial   #72  <Method void ArrayList(int)>
	//   24   49:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   25   51:new             #74  <Class StringBuilder>
	//   26   54:dup             
	//   27   55:invokespecial   #75  <Method void StringBuilder()>
	//   28   58:astore          5
		stringbuilder.append(as[0]);
	//   29   60:aload           5
	//   30   62:aload_1         
	//   31   63:iconst_0        
	//   32   64:aaload          
	//   33   65:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   34   68:pop             
		stringbuilder.append(as[1]);
	//   35   69:aload           5
	//   36   71:aload_1         
	//   37   72:iconst_1        
	//   38   73:aaload          
	//   39   74:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   40   77:pop             
		((List) (arraylist)).add(((Object) (new BasicNameValuePair("key", stringbuilder.toString()))));
	//   41   78:aload           4
	//   42   80:new             #81  <Class BasicNameValuePair>
	//   43   83:dup             
	//   44   84:ldc1            #83  <String "key">
	//   45   86:aload           5
	//   46   88:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   47   91:invokespecial   #90  <Method void BasicNameValuePair(String, String)>
	//   48   94:invokeinterface #96  <Method boolean List.add(Object)>
	//   49   99:pop             
		try
		{
			httppost.setEntity(((org.apache.http.HttpEntity) (new UrlEncodedFormEntity(((List) (arraylist))))));
	//   50  100:aload_3         
	//   51  101:new             #98  <Class UrlEncodedFormEntity>
	//   52  104:dup             
	//   53  105:aload           4
	//   54  107:invokespecial   #101 <Method void UrlEncodedFormEntity(List)>
	//   55  110:invokevirtual   #105 <Method void HttpPost.setEntity(org.apache.http.HttpEntity)>
		}
	//*  56  113:aload_2         
	//*  57  114:aload_3         
	//*  58  115:invokeinterface #111 <Method org.apache.http.HttpResponse HttpClient.execute(org.apache.http.client.methods.HttpUriRequest)>
	//*  59  120:pop             
	//*  60  121:goto            137
	//*  61  124:astore_1        
	//*  62  125:aload_1         
	//*  63  126:invokevirtual   #114 <Method void IOException.printStackTrace()>
	//*  64  129:goto            137
	//*  65  132:astore_1        
	//*  66  133:aload_1         
	//*  67  134:invokevirtual   #115 <Method void ClientProtocolException.printStackTrace()>
	//*  68  137:aconst_null     
	//*  69  138:areturn         
		// Misplaced declaration of an exception variable
		catch(String as[]) { }
	//   70  139:astore_1        
		try
		{
			((HttpClient) (obj)).execute(((org.apache.http.client.methods.HttpUriRequest) (httppost)));
		}
		// Misplaced declaration of an exception variable
		catch(String as[])
		{
			((ClientProtocolException) (as)).printStackTrace();
		}
		// Misplaced declaration of an exception variable
		catch(String as[])
		{
			((IOException) (as)).printStackTrace();
		}
		return null;
	//*  71  140:goto            113
	}

	public static final String AD_TRACKING = "ads.";
	public static final String CONTENT_UNIT_TRACKING = "content_units.";
	public static final String MIDROLL_TRACKING = "midrolls.";
	public static final String OVERLAYS_TRACKING = "overlays.";
	public static final String POSTROLL_TRACKING = "postrolls.";
	public static final String PREROLL_TRACKING = "prerolls.";
	private static final String TRACKING_ENDPOINT = "http://panel.veeso.co:5200/track";
}
