// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import android.app.Activity;
import com.appscend.media.events.APSMediaEvent;
import com.appscend.media.events.APSMediaOverlay;
import com.appscend.utilities.APSUsageTracker;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

class APSMediaPlayer$13
	implements Runnable
{

	public void run()
	{
		val$event.trigger();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field APSMediaEvent val$event>
	//    2    4:invokevirtual   #31  <Method void APSMediaEvent.trigger()>
		APSMediaEvent apsmediaevent = val$event;
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field APSMediaEvent val$event>
	//    5   11:astore_1        
		if(apsmediaevent instanceof APSMediaOverlay)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #33  <Class APSMediaOverlay>
	//*   8   16:ifeq            92
		{
			if(((APSMediaOverlay)apsmediaevent).metadata.get("skip_tracking") == null)
	//*   9   19:aload_1         
	//*  10   20:checkcast       #33  <Class APSMediaOverlay>
	//*  11   23:getfield        #37  <Field HashMap APSMediaOverlay.metadata>
	//*  12   26:ldc1            #39  <String "skip_tracking">
	//*  13   28:invokevirtual   #45  <Method Object HashMap.get(Object)>
	//*  14   31:ifnonnull       67
				(new APSUsageTracker()).execute(((Object []) (new String[] {
					"overlays.", APSMediaPlayer.access$1600(APSMediaPlayer.this).getPackageName()
				})));
	//   15   34:new             #47  <Class APSUsageTracker>
	//   16   37:dup             
	//   17   38:invokespecial   #48  <Method void APSUsageTracker()>
	//   18   41:iconst_2        
	//   19   42:anewarray       String[]
	//   20   45:dup             
	//   21   46:iconst_0        
	//   22   47:ldc1            #52  <String "overlays.">
	//   23   49:aastore         
	//   24   50:dup             
	//   25   51:iconst_1        
	//   26   52:aload_0         
	//   27   53:getfield        #19  <Field APSMediaPlayer this$0>
	//   28   56:invokestatic    #56  <Method Activity APSMediaPlayer.access$1600(APSMediaPlayer)>
	//   29   59:invokevirtual   #62  <Method String Activity.getPackageName()>
	//   30   62:aastore         
	//   31   63:invokevirtual   #66  <Method android.os.AsyncTask APSUsageTracker.execute(Object[])>
	//   32   66:pop             
			_overlaysDisplayed.add(((Object) ((APSMediaOverlay)val$event)));
	//   33   67:aload_0         
	//   34   68:getfield        #19  <Field APSMediaPlayer this$0>
	//   35   71:getfield        #70  <Field CopyOnWriteArrayList APSMediaPlayer._overlaysDisplayed>
	//   36   74:aload_0         
	//   37   75:getfield        #21  <Field APSMediaEvent val$event>
	//   38   78:checkcast       #33  <Class APSMediaOverlay>
	//   39   81:invokevirtual   #76  <Method boolean CopyOnWriteArrayList.add(Object)>
	//   40   84:pop             
			updateDisplayedOverlays();
	//   41   85:aload_0         
	//   42   86:getfield        #19  <Field APSMediaPlayer this$0>
	//   43   89:invokevirtual   #79  <Method void APSMediaPlayer.updateDisplayedOverlays()>
		}
	//   44   92:return          
	}

	final APSMediaPlayer this$0;
	final APSMediaEvent val$event;

	APSMediaPlayer$13()
	{
		this$0 = final_apsmediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field APSMediaPlayer this$0>
		val$event = APSMediaEvent.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field APSMediaEvent val$event>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
