// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import android.os.AsyncTask;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;

// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

private class APSMediaPlayer$trackURL extends AsyncTask
{

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((String[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class String[]>
	//    3    5:invokevirtual   #28  <Method Void doInBackground(String[])>
	//    4    8:areturn         
	}

	protected transient Void doInBackground(String as[])
	{
		String s = as[0].replace("\n", "").replace("\t", "");
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aaload          
	//    3    3:ldc1            #32  <String "\n">
	//    4    5:ldc1            #34  <String "">
	//    5    7:invokevirtual   #40  <Method String String.replace(CharSequence, CharSequence)>
	//    6   10:ldc1            #42  <String "\t">
	//    7   12:ldc1            #34  <String "">
	//    8   14:invokevirtual   #40  <Method String String.replace(CharSequence, CharSequence)>
	//    9   17:astore_2        
		as = ((String []) (s));
	//   10   18:aload_2         
	//   11   19:astore_1        
		if(s.startsWith("//"))
	//*  12   20:aload_2         
	//*  13   21:ldc1            #44  <String "//">
	//*  14   23:invokevirtual   #48  <Method boolean String.startsWith(String)>
	//*  15   26:ifeq            55
		{
			as = ((String []) (new StringBuilder()));
	//   16   29:new             #50  <Class StringBuilder>
	//   17   32:dup             
	//   18   33:invokespecial   #51  <Method void StringBuilder()>
	//   19   36:astore_1        
			((StringBuilder) (as)).append("http:");
	//   20   37:aload_1         
	//   21   38:ldc1            #53  <String "http:">
	//   22   40:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			((StringBuilder) (as)).append(s);
	//   24   44:aload_1         
	//   25   45:aload_2         
	//   26   46:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   27   49:pop             
			as = ((String []) (((StringBuilder) (as)).toString()));
	//   28   50:aload_1         
	//   29   51:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   30   54:astore_1        
		}
		try
		{
			as = ((String []) ((new com.squareup.okhttp.Request.Builder()).url(((String) (as))).header("User-Agent", APSMediaPlayer.access$300(APSMediaPlayer.this)).build()));
	//   31   55:new             #63  <Class com.squareup.okhttp.Request$Builder>
	//   32   58:dup             
	//   33   59:invokespecial   #64  <Method void com.squareup.okhttp.Request$Builder()>
	//   34   62:aload_1         
	//   35   63:invokevirtual   #68  <Method com.squareup.okhttp.Request$Builder com.squareup.okhttp.Request$Builder.url(String)>
	//   36   66:ldc1            #70  <String "User-Agent">
	//   37   68:aload_0         
	//   38   69:getfield        #14  <Field APSMediaPlayer this$0>
	//   39   72:invokestatic    #74  <Method String APSMediaPlayer.access$300(APSMediaPlayer)>
	//   40   75:invokevirtual   #78  <Method com.squareup.okhttp.Request$Builder com.squareup.okhttp.Request$Builder.header(String, String)>
	//   41   78:invokevirtual   #82  <Method com.squareup.okhttp.Request com.squareup.okhttp.Request$Builder.build()>
	//   42   81:astore_1        
			APSMediaPlayer.getInstance().getHttpClient().newCall(((com.squareup.okhttp.Request) (as))).execute();
	//   43   82:invokestatic    #86  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   44   85:invokevirtual   #90  <Method OkHttpClient APSMediaPlayer.getHttpClient()>
	//   45   88:aload_1         
	//   46   89:invokevirtual   #96  <Method Call OkHttpClient.newCall(com.squareup.okhttp.Request)>
	//   47   92:invokevirtual   #102 <Method com.squareup.okhttp.Response Call.execute()>
	//   48   95:pop             
		}
	//*  49   96:goto            104
		// Misplaced declaration of an exception variable
		catch(String as[])
	//*  50   99:astore_1        
		{
			((Exception) (as)).printStackTrace();
	//   51  100:aload_1         
	//   52  101:invokevirtual   #105 <Method void Exception.printStackTrace()>
		}
		return null;
	//   53  104:aconst_null     
	//   54  105:areturn         
	}

	final APSMediaPlayer this$0;

	private APSMediaPlayer$trackURL()
	{
		this$0 = APSMediaPlayer.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field APSMediaPlayer this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void AsyncTask()>
	//    5    9:return          
	}

	APSMediaPlayer$trackURL(APSMediaPlayer._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void APSMediaPlayer$trackURL(APSMediaPlayer)>
	//    3    5:return          
	}
}
