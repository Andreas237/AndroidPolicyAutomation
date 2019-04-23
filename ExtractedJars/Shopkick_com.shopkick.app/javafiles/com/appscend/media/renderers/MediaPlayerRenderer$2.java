// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers;

import android.view.SurfaceView;

// Referenced classes of package com.appscend.media.renderers:
//			MediaPlayerRenderer

class MediaPlayerRenderer$2
	implements Runnable
{

	public void run()
	{
		if(MediaPlayerRenderer.access$300(MediaPlayerRenderer.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field MediaPlayerRenderer this$0>
	//*   2    4:invokestatic    #30  <Method SurfaceView MediaPlayerRenderer.access$300(MediaPlayerRenderer)>
	//*   3    7:ifnull          38
		{
			SurfaceView surfaceview = MediaPlayerRenderer.access$300(MediaPlayerRenderer.this);
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field MediaPlayerRenderer this$0>
	//    6   14:invokestatic    #30  <Method SurfaceView MediaPlayerRenderer.access$300(MediaPlayerRenderer)>
	//    7   17:astore_2        
			int i;
			if(val$value)
	//*   8   18:aload_0         
	//*   9   19:getfield        #21  <Field boolean val$value>
	//*  10   22:ifeq            30
				i = 0;
	//   11   25:iconst_0        
	//   12   26:istore_1        
			else
	//*  13   27:goto            33
				i = 0xff000000;
	//   14   30:ldc1            #31  <Int 0xff000000>
	//   15   32:istore_1        
			surfaceview.setBackgroundColor(i);
	//   16   33:aload_2         
	//   17   34:iload_1         
	//   18   35:invokevirtual   #37  <Method void SurfaceView.setBackgroundColor(int)>
		}
	//   19   38:return          
	}

	final MediaPlayerRenderer this$0;
	final boolean val$value;

	MediaPlayerRenderer$2()
	{
		this$0 = final_mediaplayerrenderer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field MediaPlayerRenderer this$0>
		val$value = Z.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean val$value>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
