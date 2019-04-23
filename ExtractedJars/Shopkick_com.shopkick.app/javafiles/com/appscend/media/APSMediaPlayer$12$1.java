// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import android.app.Activity;
import android.os.Handler;
import com.appscend.media.events.APSMediaEvent;
import com.appscend.media.events.APSMediaOverlay;
import com.appscend.utilities.APSUsageTracker;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

class APSMediaPlayer$12$1
	implements Runnable
{

	public void run()
	{
		val$event.trigger();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field APSMediaPlayer$12 this$1>
	//    2    4:getfield        #24  <Field APSMediaEvent APSMediaPlayer$12.val$event>
	//    3    7:invokevirtual   #29  <Method void APSMediaEvent.trigger()>
		if(val$event instanceof APSMediaOverlay)
	//*   4   10:aload_0         
	//*   5   11:getfield        #17  <Field APSMediaPlayer$12 this$1>
	//*   6   14:getfield        #24  <Field APSMediaEvent APSMediaPlayer$12.val$event>
	//*   7   17:instanceof      #31  <Class APSMediaOverlay>
	//*   8   20:ifeq            114
		{
			if(((APSMediaOverlay)val$event).metadata.get("skip_tracking") == null)
	//*   9   23:aload_0         
	//*  10   24:getfield        #17  <Field APSMediaPlayer$12 this$1>
	//*  11   27:getfield        #24  <Field APSMediaEvent APSMediaPlayer$12.val$event>
	//*  12   30:checkcast       #31  <Class APSMediaOverlay>
	//*  13   33:getfield        #35  <Field HashMap APSMediaOverlay.metadata>
	//*  14   36:ldc1            #37  <String "skip_tracking">
	//*  15   38:invokevirtual   #43  <Method Object HashMap.get(Object)>
	//*  16   41:ifnonnull       80
				(new APSUsageTracker()).execute(((Object []) (new String[] {
					"overlays.", APSMediaPlayer.access$1600(this$0).getPackageName()
				})));
	//   17   44:new             #45  <Class APSUsageTracker>
	//   18   47:dup             
	//   19   48:invokespecial   #46  <Method void APSUsageTracker()>
	//   20   51:iconst_2        
	//   21   52:anewarray       String[]
	//   22   55:dup             
	//   23   56:iconst_0        
	//   24   57:ldc1            #50  <String "overlays.">
	//   25   59:aastore         
	//   26   60:dup             
	//   27   61:iconst_1        
	//   28   62:aload_0         
	//   29   63:getfield        #17  <Field APSMediaPlayer$12 this$1>
	//   30   66:getfield        #54  <Field APSMediaPlayer APSMediaPlayer$12.this$0>
	//   31   69:invokestatic    #60  <Method Activity APSMediaPlayer.access$1600(APSMediaPlayer)>
	//   32   72:invokevirtual   #66  <Method String Activity.getPackageName()>
	//   33   75:aastore         
	//   34   76:invokevirtual   #70  <Method android.os.AsyncTask APSUsageTracker.execute(Object[])>
	//   35   79:pop             
			_overlaysDisplayed.add(((Object) ((APSMediaOverlay)val$event)));
	//   36   80:aload_0         
	//   37   81:getfield        #17  <Field APSMediaPlayer$12 this$1>
	//   38   84:getfield        #54  <Field APSMediaPlayer APSMediaPlayer$12.this$0>
	//   39   87:getfield        #74  <Field CopyOnWriteArrayList APSMediaPlayer._overlaysDisplayed>
	//   40   90:aload_0         
	//   41   91:getfield        #17  <Field APSMediaPlayer$12 this$1>
	//   42   94:getfield        #24  <Field APSMediaEvent APSMediaPlayer$12.val$event>
	//   43   97:checkcast       #31  <Class APSMediaOverlay>
	//   44  100:invokevirtual   #80  <Method boolean CopyOnWriteArrayList.add(Object)>
	//   45  103:pop             
			updateDisplayedOverlays();
	//   46  104:aload_0         
	//   47  105:getfield        #17  <Field APSMediaPlayer$12 this$1>
	//   48  108:getfield        #54  <Field APSMediaPlayer APSMediaPlayer$12.this$0>
	//   49  111:invokevirtual   #83  <Method void APSMediaPlayer.updateDisplayedOverlays()>
		}
	//   50  114:return          
	}

	final APSMediaPlayer._cls12 this$1;

	APSMediaPlayer$12$1()
	{
		this$1 = APSMediaPlayer._cls12.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field APSMediaPlayer$12 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/appscend/media/APSMediaPlayer$12

/* anonymous class */
	class APSMediaPlayer._cls12
		implements Runnable
	{

		public void run()
		{
			APSMediaEvent apsmediaevent = event;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field APSMediaEvent val$event>
		//    2    4:astore_1        
			apsmediaevent.preloadPoint = currentPlaybackTime;
		//    3    5:aload_1         
		//    4    6:aload_0         
		//    5    7:getfield        #27  <Field int val$currentPlaybackTime>
		//    6   10:i2l             
		//    7   11:putfield        #38  <Field long APSMediaEvent.preloadPoint>
			apsmediaevent.preload();
		//    8   14:aload_1         
		//    9   15:invokevirtual   #41  <Method void APSMediaEvent.preload()>
			if(event.getState() == com.appscend.media.events.APSMediaEvent.APSMediaEventState.APSMediaEventStatePreloaded)
		//*  10   18:aload_0         
		//*  11   19:getfield        #25  <Field APSMediaEvent val$event>
		//*  12   22:invokevirtual   #45  <Method com.appscend.media.events.APSMediaEvent$APSMediaEventState APSMediaEvent.getState()>
		//*  13   25:getstatic       #51  <Field com.appscend.media.events.APSMediaEvent$APSMediaEventState com.appscend.media.events.APSMediaEvent$APSMediaEventState.APSMediaEventStatePreloaded>
		//*  14   28:if_acmpne       73
			{
				APSMediaPlayer.access$1700().post(((Runnable) (new APSMediaPlayer._cls12._cls1())));
		//   15   31:invokestatic    #55  <Method Handler APSMediaPlayer.access$1700()>
		//   16   34:new             #13  <Class APSMediaPlayer$12$1>
		//   17   37:dup             
		//   18   38:aload_0         
		//   19   39:invokespecial   #58  <Method void APSMediaPlayer$12$1(APSMediaPlayer$12)>
		//   20   42:invokevirtual   #64  <Method boolean Handler.post(Runnable)>
		//   21   45:pop             
				if(event.endPoint() != -1)
		//*  22   46:aload_0         
		//*  23   47:getfield        #25  <Field APSMediaEvent val$event>
		//*  24   50:invokevirtual   #68  <Method int APSMediaEvent.endPoint()>
		//*  25   53:iconst_m1       
		//*  26   54:icmpeq          88
				{
					_triggeredEvents.add(((Object) (event)));
		//   27   57:aload_0         
		//   28   58:getfield        #23  <Field APSMediaPlayer this$0>
		//   29   61:getfield        #72  <Field CopyOnWriteArrayList APSMediaPlayer._triggeredEvents>
		//   30   64:aload_0         
		//   31   65:getfield        #25  <Field APSMediaEvent val$event>
		//   32   68:invokevirtual   #78  <Method boolean CopyOnWriteArrayList.add(Object)>
		//   33   71:pop             
					return;
		//   34   72:return          
				}
			} else
			{
				_preloadedEvents.add(((Object) (event)));
		//   35   73:aload_0         
		//   36   74:getfield        #23  <Field APSMediaPlayer this$0>
		//   37   77:getfield        #81  <Field CopyOnWriteArrayList APSMediaPlayer._preloadedEvents>
		//   38   80:aload_0         
		//   39   81:getfield        #25  <Field APSMediaEvent val$event>
		//   40   84:invokevirtual   #78  <Method boolean CopyOnWriteArrayList.add(Object)>
		//   41   87:pop             
			}
		//   42   88:return          
		}

		final APSMediaPlayer this$0;
		final int val$currentPlaybackTime;
		final APSMediaEvent val$event;

			
			{
				this$0 = final_apsmediaplayer;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field APSMediaPlayer this$0>
				event = apsmediaevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field APSMediaEvent val$event>
				currentPlaybackTime = I.this;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #27  <Field int val$currentPlaybackTime>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
	}

}
