// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import android.os.Message;
import com.bumptech.glide.RequestManager;

// Referenced classes of package com.bumptech.glide.load.resource.gif:
//			GifFrameLoader

private class GifFrameLoader$FrameLoaderCallback
	implements android.os.Handler.Callback
{

	public boolean handleMessage(Message message)
	{
		if(message.what == 1)
	//*   0    0:aload_1         
	//*   1    1:getfield        #31  <Field int Message.what>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          26
		{
			message = ((Message) ((GifFrameLoader.DelayTarget)message.obj));
	//    4    8:aload_1         
	//    5    9:getfield        #35  <Field Object Message.obj>
	//    6   12:checkcast       #37  <Class GifFrameLoader$DelayTarget>
	//    7   15:astore_1        
			onFrameReady(((GifFrameLoader.DelayTarget) (message)));
	//    8   16:aload_0         
	//    9   17:getfield        #20  <Field GifFrameLoader this$0>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #41  <Method void GifFrameLoader.onFrameReady(GifFrameLoader$DelayTarget)>
			return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		}
		if(message.what == 2)
	//*  14   26:aload_1         
	//*  15   27:getfield        #31  <Field int Message.what>
	//*  16   30:iconst_2        
	//*  17   31:icmpne          53
		{
			message = ((Message) ((GifFrameLoader.DelayTarget)message.obj));
	//   18   34:aload_1         
	//   19   35:getfield        #35  <Field Object Message.obj>
	//   20   38:checkcast       #37  <Class GifFrameLoader$DelayTarget>
	//   21   41:astore_1        
			requestManager.clear(((com.bumptech.glide.request.target.Target) (message)));
	//   22   42:aload_0         
	//   23   43:getfield        #20  <Field GifFrameLoader this$0>
	//   24   46:getfield        #45  <Field RequestManager GifFrameLoader.requestManager>
	//   25   49:aload_1         
	//   26   50:invokevirtual   #51  <Method void RequestManager.clear(com.bumptech.glide.request.target.Target)>
		}
		return false;
	//   27   53:iconst_0        
	//   28   54:ireturn         
	}

	static final int MSG_CLEAR = 2;
	static final int MSG_DELAY = 1;
	final GifFrameLoader this$0;

	GifFrameLoader$FrameLoaderCallback()
	{
		this$0 = GifFrameLoader.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field GifFrameLoader this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
