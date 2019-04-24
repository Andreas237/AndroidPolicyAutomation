// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.android.publish.adsCommon.d.b;
import com.startapp.android.publish.html.JsInterface;
import com.startapp.common.a.g;

public class VideoJsInterface extends JsInterface
{

	public VideoJsInterface(Context context, Runnable runnable, Runnable runnable1, Runnable runnable2, Runnable runnable3, Runnable runnable4, b b, 
			boolean flag)
	{
		super(context, runnable, runnable1, b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           7
	//    5    6:invokespecial   #17  <Method void JsInterface(Context, Runnable, Runnable, b)>
		replayCallback = null;
	//    6    9:aload_0         
	//    7   10:aconst_null     
	//    8   11:putfield        #19  <Field Runnable replayCallback>
		skipCallback = null;
	//    9   14:aload_0         
	//   10   15:aconst_null     
	//   11   16:putfield        #21  <Field Runnable skipCallback>
		toggleSoundCallback = null;
	//   12   19:aload_0         
	//   13   20:aconst_null     
	//   14   21:putfield        #23  <Field Runnable toggleSoundCallback>
		replayCallback = runnable2;
	//   15   24:aload_0         
	//   16   25:aload           4
	//   17   27:putfield        #19  <Field Runnable replayCallback>
		skipCallback = runnable3;
	//   18   30:aload_0         
	//   19   31:aload           5
	//   20   33:putfield        #21  <Field Runnable skipCallback>
		toggleSoundCallback = runnable4;
	//   21   36:aload_0         
	//   22   37:aload           6
	//   23   39:putfield        #23  <Field Runnable toggleSoundCallback>
		inAppBrowserEnabled = flag;
	//   24   42:aload_0         
	//   25   43:iload           8
	//   26   45:putfield        #27  <Field boolean inAppBrowserEnabled>
	//   27   48:return          
	}

	public void replayVideo()
	{
		g.a("VideoJsInterface", 3, "replayVideo called");
	//    0    0:ldc1            #8   <String "VideoJsInterface">
	//    1    2:iconst_3        
	//    2    3:ldc1            #33  <String "replayVideo called">
	//    3    5:invokestatic    #39  <Method void g.a(String, int, String)>
		if(replayCallback != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #19  <Field Runnable replayCallback>
	//*   6   12:ifnull          33
			(new Handler(Looper.getMainLooper())).post(replayCallback);
	//    7   15:new             #41  <Class Handler>
	//    8   18:dup             
	//    9   19:invokestatic    #47  <Method Looper Looper.getMainLooper()>
	//   10   22:invokespecial   #50  <Method void Handler(Looper)>
	//   11   25:aload_0         
	//   12   26:getfield        #19  <Field Runnable replayCallback>
	//   13   29:invokevirtual   #54  <Method boolean Handler.post(Runnable)>
	//   14   32:pop             
	//   15   33:return          
	}

	public void skipVideo()
	{
		g.a("VideoJsInterface", 3, "skipVideo called");
	//    0    0:ldc1            #8   <String "VideoJsInterface">
	//    1    2:iconst_3        
	//    2    3:ldc1            #58  <String "skipVideo called">
	//    3    5:invokestatic    #39  <Method void g.a(String, int, String)>
		if(skipCallback != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #21  <Field Runnable skipCallback>
	//*   6   12:ifnull          33
			(new Handler(Looper.getMainLooper())).post(skipCallback);
	//    7   15:new             #41  <Class Handler>
	//    8   18:dup             
	//    9   19:invokestatic    #47  <Method Looper Looper.getMainLooper()>
	//   10   22:invokespecial   #50  <Method void Handler(Looper)>
	//   11   25:aload_0         
	//   12   26:getfield        #21  <Field Runnable skipCallback>
	//   13   29:invokevirtual   #54  <Method boolean Handler.post(Runnable)>
	//   14   32:pop             
	//   15   33:return          
	}

	public void toggleSound()
	{
		g.a("VideoJsInterface", 3, "toggleSound called");
	//    0    0:ldc1            #8   <String "VideoJsInterface">
	//    1    2:iconst_3        
	//    2    3:ldc1            #61  <String "toggleSound called">
	//    3    5:invokestatic    #39  <Method void g.a(String, int, String)>
		if(toggleSoundCallback != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #23  <Field Runnable toggleSoundCallback>
	//*   6   12:ifnull          33
			(new Handler(Looper.getMainLooper())).post(toggleSoundCallback);
	//    7   15:new             #41  <Class Handler>
	//    8   18:dup             
	//    9   19:invokestatic    #47  <Method Looper Looper.getMainLooper()>
	//   10   22:invokespecial   #50  <Method void Handler(Looper)>
	//   11   25:aload_0         
	//   12   26:getfield        #23  <Field Runnable toggleSoundCallback>
	//   13   29:invokevirtual   #54  <Method boolean Handler.post(Runnable)>
	//   14   32:pop             
	//   15   33:return          
	}

	private static final String TAG = "VideoJsInterface";
	private Runnable replayCallback;
	private Runnable skipCallback;
	private Runnable toggleSoundCallback;
}
