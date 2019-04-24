// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.os.Handler;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

// Referenced classes of package com.bumptech.glide.load.resource.gif:
//			GifFrameLoader

static class GifFrameLoader$DelayTarget extends SimpleTarget
{

	Bitmap getResource()
	{
		return resource;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Bitmap resource>
	//    2    4:areturn         
	}

	public void onResourceReady(Bitmap bitmap, Transition transition)
	{
		resource = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field Bitmap resource>
		bitmap = ((Bitmap) (handler.obtainMessage(1, ((Object) (this)))));
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field Handler handler>
	//    5    9:iconst_1        
	//    6   10:aload_0         
	//    7   11:invokevirtual   #40  <Method android.os.Message Handler.obtainMessage(int, Object)>
	//    8   14:astore_1        
		handler.sendMessageAtTime(((android.os.Message) (bitmap)), targetTime);
	//    9   15:aload_0         
	//   10   16:getfield        #23  <Field Handler handler>
	//   11   19:aload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #27  <Field long targetTime>
	//   14   24:invokevirtual   #44  <Method boolean Handler.sendMessageAtTime(android.os.Message, long)>
	//   15   27:pop             
	//   16   28:return          
	}

	public volatile void onResourceReady(Object obj, Transition transition)
	{
		onResourceReady((Bitmap)obj, transition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #49  <Class Bitmap>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #51  <Method void onResourceReady(Bitmap, Transition)>
	//    5    9:return          
	}

	private final Handler handler;
	final int index;
	private Bitmap resource;
	private final long targetTime;

	GifFrameLoader$DelayTarget(Handler handler1, int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void SimpleTarget()>
		handler = handler1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Handler handler>
		index = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #25  <Field int index>
		targetTime = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #27  <Field long targetTime>
	//   11   19:return          
	}
}
