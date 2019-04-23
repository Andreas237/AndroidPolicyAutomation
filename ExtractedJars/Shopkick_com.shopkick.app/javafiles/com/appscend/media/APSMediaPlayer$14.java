// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import com.appscend.media.events.APSMediaOverlay;
import java.lang.reflect.Method;

// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

class APSMediaPlayer$14
	implements Runnable
{

	public void run()
	{
		try
		{
			((Object) (val$event.controller)).getClass().getMethod("update", new Class[] {
				Integer.TYPE, Integer.TYPE
			}).invoke(((Object) (val$event.controller)), new Object[] {
				Integer.valueOf(duration()), Integer.valueOf(val$currentPlaybackTime * 1000)
			});
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field APSMediaOverlay val$event>
	//    2    4:getfield        #38  <Field com.appscend.overlaycontrollers.APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//    3    7:invokevirtual   #42  <Method Class Object.getClass()>
	//    4   10:ldc1            #44  <String "update">
	//    5   12:iconst_2        
	//    6   13:anewarray       Class[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:getstatic       #52  <Field Class Integer.TYPE>
	//   10   21:aastore         
	//   11   22:dup             
	//   12   23:iconst_1        
	//   13   24:getstatic       #52  <Field Class Integer.TYPE>
	//   14   27:aastore         
	//   15   28:invokevirtual   #56  <Method Method Class.getMethod(String, Class[])>
	//   16   31:aload_0         
	//   17   32:getfield        #23  <Field APSMediaOverlay val$event>
	//   18   35:getfield        #38  <Field com.appscend.overlaycontrollers.APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   19   38:iconst_2        
	//   20   39:anewarray       Object[]
	//   21   42:dup             
	//   22   43:iconst_0        
	//   23   44:aload_0         
	//   24   45:getfield        #21  <Field APSMediaPlayer this$0>
	//   25   48:invokevirtual   #60  <Method int APSMediaPlayer.duration()>
	//   26   51:invokestatic    #64  <Method Integer Integer.valueOf(int)>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_1        
	//   30   57:aload_0         
	//   31   58:getfield        #25  <Field int val$currentPlaybackTime>
	//   32   61:sipush          1000
	//   33   64:imul            
	//   34   65:invokestatic    #64  <Method Integer Integer.valueOf(int)>
	//   35   68:aastore         
	//   36   69:invokevirtual   #70  <Method Object Method.invoke(Object, Object[])>
	//   37   72:pop             
			return;
	//   38   73:return          
		}
		catch(Exception exception)
	//*  39   74:astore_1        
		{
			return;
	//   40   75:return          
		}
	}

	final APSMediaPlayer this$0;
	final int val$currentPlaybackTime;
	final APSMediaOverlay val$event;

	APSMediaPlayer$14()
	{
		this$0 = final_apsmediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field APSMediaPlayer this$0>
		val$event = apsmediaoverlay;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field APSMediaOverlay val$event>
		val$currentPlaybackTime = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field int val$currentPlaybackTime>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
