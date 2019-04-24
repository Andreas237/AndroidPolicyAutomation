// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.irobot.home.view.CustomVideoView;

// Referenced classes of package com.irobot.home:
//			BraavaSpotCleanActivity

class BraavaSpotCleanActivity$1
	implements android.view.ayoutListener
{

	public void onGlobalLayout()
	{
		Object obj = ((Object) (new MediaMetadataRetriever()));
	//    0    0:new             #27  <Class MediaMetadataRetriever>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void MediaMetadataRetriever()>
	//    3    7:astore_3        
		((MediaMetadataRetriever) (obj)).setDataSource(((android.content.Context) (b)), a);
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field BraavaSpotCleanActivity b>
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field Uri a>
	//    9   17:invokevirtual   #32  <Method void MediaMetadataRetriever.setDataSource(android.content.Context, Uri)>
		obj = ((Object) (((MediaMetadataRetriever) (obj)).getFrameAtTime()));
	//   10   20:aload_3         
	//   11   21:invokevirtual   #36  <Method Bitmap MediaMetadataRetriever.getFrameAtTime()>
	//   12   24:astore_3        
		double d;
		if(obj != null)
	//*  13   25:aload_3         
	//*  14   26:ifnull          44
			d = (double)((Bitmap) (obj)).getHeight() / (double)((Bitmap) (obj)).getWidth();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #42  <Method int Bitmap.getHeight()>
	//   17   33:i2d             
	//   18   34:aload_3         
	//   19   35:invokevirtual   #45  <Method int Bitmap.getWidth()>
	//   20   38:i2d             
	//   21   39:ddiv            
	//   22   40:dstore_1        
		else
	//*  23   41:goto            48
			d = 0.75D;
	//   24   44:ldc2w           #46  <Double 0.75D>
	//   25   47:dstore_1        
		obj = ((Object) (b.b.getLayoutParams()));
	//   26   48:aload_0         
	//   27   49:getfield        #19  <Field BraavaSpotCleanActivity b>
	//   28   52:getfield        #50  <Field CustomVideoView BraavaSpotCleanActivity.b>
	//   29   55:invokevirtual   #56  <Method android.view.ViewGroup$LayoutParams CustomVideoView.getLayoutParams()>
	//   30   58:astore_3        
		b.b.measure(0, 0);
	//   31   59:aload_0         
	//   32   60:getfield        #19  <Field BraavaSpotCleanActivity b>
	//   33   63:getfield        #50  <Field CustomVideoView BraavaSpotCleanActivity.b>
	//   34   66:iconst_0        
	//   35   67:iconst_0        
	//   36   68:invokevirtual   #60  <Method void CustomVideoView.measure(int, int)>
		obj.height = (int)((double)b.b.getWidth() * d);
	//   37   71:aload_3         
	//   38   72:aload_0         
	//   39   73:getfield        #19  <Field BraavaSpotCleanActivity b>
	//   40   76:getfield        #50  <Field CustomVideoView BraavaSpotCleanActivity.b>
	//   41   79:invokevirtual   #61  <Method int CustomVideoView.getWidth()>
	//   42   82:i2d             
	//   43   83:dload_1         
	//   44   84:dmul            
	//   45   85:d2i             
	//   46   86:putfield        #67  <Field int android.view.ViewGroup$LayoutParams.height>
		b.b.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//   47   89:aload_0         
	//   48   90:getfield        #19  <Field BraavaSpotCleanActivity b>
	//   49   93:getfield        #50  <Field CustomVideoView BraavaSpotCleanActivity.b>
	//   50   96:aload_3         
	//   51   97:invokevirtual   #71  <Method void CustomVideoView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   52  100:return          
	}

	final Uri a;
	final BraavaSpotCleanActivity b;

	BraavaSpotCleanActivity$1(BraavaSpotCleanActivity braavaspotcleanactivity, Uri uri)
	{
		b = braavaspotcleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BraavaSpotCleanActivity b>
		a = uri;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Uri a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
