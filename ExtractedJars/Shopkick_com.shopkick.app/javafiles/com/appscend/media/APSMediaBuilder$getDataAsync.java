// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import android.os.AsyncTask;
import com.squareup.okhttp.*;
import java.io.IOException;
import java.net.URL;

// Referenced classes of package com.appscend.media:
//			APSMediaBuilder, APSMediaPlayer

public static class APSMediaBuilder$getDataAsync extends AsyncTask
{

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((URL[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #17  <Class URL[]>
	//    3    5:invokevirtual   #20  <Method String doInBackground(URL[])>
	//    4    8:areturn         
	}

	protected transient String doInBackground(URL aurl[])
	{
		aurl = ((URL []) ((new com.squareup.okhttp.Request.Builder()).url(aurl[0]).header("User-Agent", APSMediaPlayer.getInstance().getUserAgent()).build()));
	//    0    0:new             #24  <Class com.squareup.okhttp.Request$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void com.squareup.okhttp.Request$Builder()>
	//    3    7:aload_1         
	//    4    8:iconst_0        
	//    5    9:aaload          
	//    6   10:invokevirtual   #29  <Method com.squareup.okhttp.Request$Builder com.squareup.okhttp.Request$Builder.url(URL)>
	//    7   13:ldc1            #31  <String "User-Agent">
	//    8   15:invokestatic    #37  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    9   18:invokevirtual   #41  <Method String APSMediaPlayer.getUserAgent()>
	//   10   21:invokevirtual   #45  <Method com.squareup.okhttp.Request$Builder com.squareup.okhttp.Request$Builder.header(String, String)>
	//   11   24:invokevirtual   #49  <Method com.squareup.okhttp.Request com.squareup.okhttp.Request$Builder.build()>
	//   12   27:astore_1        
		try
		{
			aurl = ((URL []) (APSMediaPlayer.getInstance().getHttpClient().newCall(((com.squareup.okhttp.Request) (aurl))).execute()));
	//   13   28:invokestatic    #37  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   14   31:invokevirtual   #53  <Method OkHttpClient APSMediaPlayer.getHttpClient()>
	//   15   34:aload_1         
	//   16   35:invokevirtual   #59  <Method Call OkHttpClient.newCall(com.squareup.okhttp.Request)>
	//   17   38:invokevirtual   #65  <Method Response Call.execute()>
	//   18   41:astore_1        
			if(((Response) (aurl)).isSuccessful())
	//*  19   42:aload_1         
	//*  20   43:invokevirtual   #71  <Method boolean Response.isSuccessful()>
	//*  21   46:ifeq            57
			{
				return ((Response) (aurl)).body().string();
	//   22   49:aload_1         
	//   23   50:invokevirtual   #75  <Method ResponseBody Response.body()>
	//   24   53:invokevirtual   #80  <Method String ResponseBody.string()>
	//   25   56:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   26   57:new             #82  <Class StringBuilder>
	//   27   60:dup             
	//   28   61:invokespecial   #83  <Method void StringBuilder()>
	//   29   64:astore_2        
				stringbuilder.append("Unexpected code ");
	//   30   65:aload_2         
	//   31   66:ldc1            #85  <String "Unexpected code ">
	//   32   68:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   33   71:pop             
				stringbuilder.append(((Object) (aurl)));
	//   34   72:aload_2         
	//   35   73:aload_1         
	//   36   74:invokevirtual   #92  <Method StringBuilder StringBuilder.append(Object)>
	//   37   77:pop             
				throw new IOException(stringbuilder.toString());
	//   38   78:new             #22  <Class IOException>
	//   39   81:dup             
	//   40   82:aload_2         
	//   41   83:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   42   86:invokespecial   #98  <Method void IOException(String)>
	//   43   89:athrow          
			}
		}
	//*  44   90:ldc1            #100 <String "">
	//*  45   92:areturn         
		// Misplaced declaration of an exception variable
		catch(URL aurl[])
		{
			return "";
		}
	//*  46   93:astore_1        
	//*  47   94:goto            90
	}

	public APSMediaBuilder$getDataAsync()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void AsyncTask()>
	//    2    4:return          
	}
}
