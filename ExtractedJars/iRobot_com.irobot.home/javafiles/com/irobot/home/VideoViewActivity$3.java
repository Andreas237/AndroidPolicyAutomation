// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.media.MediaPlayer;
import android.widget.VideoView;

// Referenced classes of package com.irobot.home:
//			VideoViewActivity

class VideoViewActivity$3
	implements android.media.edListener
{

	public void onPrepared(MediaPlayer mediaplayer)
	{
		a.d.seekTo(VideoViewActivity.a(a));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field VideoViewActivity a>
	//    2    4:getfield        #28  <Field VideoView VideoViewActivity.d>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field VideoViewActivity a>
	//    5   11:invokestatic    #31  <Method int VideoViewActivity.a(VideoViewActivity)>
	//    6   14:invokevirtual   #37  <Method void VideoView.seekTo(int)>
		a.d.start();
	//    7   17:aload_0         
	//    8   18:getfield        #19  <Field VideoViewActivity a>
	//    9   21:getfield        #28  <Field VideoView VideoViewActivity.d>
	//   10   24:invokevirtual   #40  <Method void VideoView.start()>
		a.d.postDelayed(new Runnable() {

			public void run()
			{
				a.a.d.pause();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field VideoViewActivity$3 a>
			//    2    4:getfield        #25  <Field VideoViewActivity VideoViewActivity$3.a>
			//    3    7:getfield        #31  <Field VideoView VideoViewActivity.d>
			//    4   10:invokevirtual   #36  <Method void VideoView.pause()>
			//    5   13:return          
			}

			final VideoViewActivity._cls3 a;

			
			{
				a = VideoViewActivity._cls3.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field VideoViewActivity$3 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
, 400L);
	//   11   27:aload_0         
	//   12   28:getfield        #19  <Field VideoViewActivity a>
	//   13   31:getfield        #28  <Field VideoView VideoViewActivity.d>
	//   14   34:new             #13  <Class VideoViewActivity$3$1>
	//   15   37:dup             
	//   16   38:aload_0         
	//   17   39:invokespecial   #43  <Method void VideoViewActivity$3$1(VideoViewActivity$3)>
	//   18   42:ldc2w           #44  <Long 400L>
	//   19   45:invokevirtual   #49  <Method boolean VideoView.postDelayed(Runnable, long)>
	//   20   48:pop             
	//   21   49:return          
	}

	final VideoViewActivity a;

	VideoViewActivity$3(VideoViewActivity videoviewactivity)
	{
		a = videoviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field VideoViewActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
