// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import android.os.AsyncTask;
import com.gigya.socialize.android.log.GigyaLog;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI

class GSAPI$7 extends AsyncTask
{

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((String[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class String[]>
	//    3    5:invokevirtual   #27  <Method Void doInBackground(String[])>
	//    4    8:areturn         
	}

	protected Void doInBackground(String as[])
	{
		DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
	//    0    0:new             #31  <Class DefaultHttpClient>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void DefaultHttpClient()>
	//    3    7:astore_2        
		as = ((String []) (new HttpGet(as[0])));
	//    4    8:new             #34  <Class HttpGet>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:iconst_0        
	//    8   14:aaload          
	//    9   15:invokespecial   #37  <Method void HttpGet(String)>
	//   10   18:astore_1        
		try
		{
			((HttpClient) (defaulthttpclient)).execute(((org.apache.http.client.methods.HttpUriRequest) (as)));
	//   11   19:aload_2         
	//   12   20:aload_1         
	//   13   21:invokeinterface #43  <Method org.apache.http.HttpResponse HttpClient.execute(org.apache.http.client.methods.HttpUriRequest)>
	//   14   26:pop             
		}
	//*  15   27:goto            38
	//*  16   30:invokestatic    #47  <Method String GSAPI.access$000()>
	//*  17   33:ldc1            #49  <String "Error reporting deeplink referral">
	//*  18   35:invokestatic    #55  <Method void GigyaLog.e(String, String)>
	//*  19   38:aconst_null     
	//*  20   39:areturn         
		// Misplaced declaration of an exception variable
		catch(String as[])
		{
			GigyaLog.e(GSAPI.access$000(), "Error reporting deeplink referral");
		}
		return null;
	//*  21   40:astore_1        
	//*  22   41:goto            30
	}

	final GSAPI this$0;

	GSAPI$7()
	{
		this$0 = GSAPI.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field GSAPI this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void AsyncTask()>
	//    5    9:return          
	}
}
