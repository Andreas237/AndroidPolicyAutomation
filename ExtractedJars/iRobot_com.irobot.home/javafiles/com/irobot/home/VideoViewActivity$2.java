// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

// Referenced classes of package com.irobot.home:
//			VideoViewActivity

class VideoViewActivity$2
	implements android.view.
{

	public void onClick(View view)
	{
		a.e.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field VideoViewActivity a>
	//    2    4:getfield        #25  <Field ImageView VideoViewActivity.e>
	//    3    7:bipush          8
	//    4    9:invokevirtual   #31  <Method void ImageView.setVisibility(int)>
		a.d.start();
	//    5   12:aload_0         
	//    6   13:getfield        #17  <Field VideoViewActivity a>
	//    7   16:getfield        #35  <Field VideoView VideoViewActivity.d>
	//    8   19:invokevirtual   #40  <Method void VideoView.start()>
	//    9   22:return          
	}

	final VideoViewActivity a;

	VideoViewActivity$2(VideoViewActivity videoviewactivity)
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
