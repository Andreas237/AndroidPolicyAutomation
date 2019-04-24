// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.media.MediaPlayer;
import android.widget.ImageView;

// Referenced classes of package com.irobot.home:
//			VideoViewActivity

class VideoViewActivity$1
	implements android.media.tionListener
{

	public void onCompletion(MediaPlayer mediaplayer)
	{
		if(a.c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field VideoViewActivity a>
	//*   2    4:getfield        #26  <Field boolean VideoViewActivity.c>
	//*   3    7:ifeq            17
			a.finish();
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field VideoViewActivity a>
	//    6   14:invokevirtual   #29  <Method void VideoViewActivity.finish()>
		a.e.setVisibility(0);
	//    7   17:aload_0         
	//    8   18:getfield        #17  <Field VideoViewActivity a>
	//    9   21:getfield        #32  <Field ImageView VideoViewActivity.e>
	//   10   24:iconst_0        
	//   11   25:invokevirtual   #38  <Method void ImageView.setVisibility(int)>
	//   12   28:return          
	}

	final VideoViewActivity a;

	VideoViewActivity$1(VideoViewActivity videoviewactivity)
	{
		a = videoviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field VideoViewActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
