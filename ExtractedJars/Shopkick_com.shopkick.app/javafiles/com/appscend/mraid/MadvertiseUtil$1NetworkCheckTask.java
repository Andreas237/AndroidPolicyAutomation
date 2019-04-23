// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.os.AsyncTask;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseUtil

class MadvertiseUtil$1NetworkCheckTask extends AsyncTask
{

	protected transient Boolean doInBackground(Void avoid[])
	{
		try
		{
			avoid = ((Void []) ((HttpURLConnection)(new URL("http://ad.madvertise.de/sync.html")).openConnection()));
	//    0    0:new             #19  <Class URL>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "http://ad.madvertise.de/sync.html">
	//    3    6:invokespecial   #24  <Method void URL(String)>
	//    4    9:invokevirtual   #28  <Method java.net.URLConnection URL.openConnection()>
	//    5   12:checkcast       #30  <Class HttpURLConnection>
	//    6   15:astore_1        
			((HttpURLConnection) (avoid)).setConnectTimeout(999);
	//    7   16:aload_1         
	//    8   17:sipush          999
	//    9   20:invokevirtual   #34  <Method void HttpURLConnection.setConnectTimeout(int)>
			((HttpURLConnection) (avoid)).setRequestMethod("GET");
	//   10   23:aload_1         
	//   11   24:ldc1            #36  <String "GET">
	//   12   26:invokevirtual   #39  <Method void HttpURLConnection.setRequestMethod(String)>
			((HttpURLConnection) (avoid)).setDoInput(true);
	//   13   29:aload_1         
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #43  <Method void HttpURLConnection.setDoInput(boolean)>
			((HttpURLConnection) (avoid)).connect();
	//   16   34:aload_1         
	//   17   35:invokevirtual   #46  <Method void HttpURLConnection.connect()>
			if(((HttpURLConnection) (avoid)).getResponseCode() == 200)
	//*  18   38:aload_1         
	//*  19   39:invokevirtual   #50  <Method int HttpURLConnection.getResponseCode()>
	//*  20   42:sipush          200
	//*  21   45:icmpne          53
				return Boolean.valueOf(true);
	//   22   48:iconst_1        
	//   23   49:invokestatic    #56  <Method Boolean Boolean.valueOf(boolean)>
	//   24   52:areturn         
		}
	//*  25   53:iconst_0        
	//*  26   54:invokestatic    #56  <Method Boolean Boolean.valueOf(boolean)>
	//*  27   57:areturn         
	//*  28   58:iconst_0        
	//*  29   59:invokestatic    #56  <Method Boolean Boolean.valueOf(boolean)>
	//*  30   62:areturn         
		// Misplaced declaration of an exception variable
		catch(Void avoid[])
		{
			return Boolean.valueOf(false);
		}
		return Boolean.valueOf(false);
	//*  31   63:astore_1        
	//*  32   64:goto            58
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #59  <Class Void[]>
	//    3    5:invokevirtual   #61  <Method Boolean doInBackground(Void[])>
	//    4    8:areturn         
	}

	MadvertiseUtil$1NetworkCheckTask()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void AsyncTask()>
	//    2    4:return          
	}
}
