// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.view.KeyEvent;
import android.widget.MediaController;

// Referenced classes of package com.irobot.home:
//			VideoViewActivity

public class VideoViewActivity$LocalMediaController extends MediaController
{

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		if(keyevent.getKeyCode() == 4)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #29  <Method int KeyEvent.getKeyCode()>
	//*   2    4:iconst_4        
	//*   3    5:icmpne          15
			a.finish();
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field Activity a>
	//    6   12:invokevirtual   #35  <Method void Activity.finish()>
		return super.dispatchKeyEvent(keyevent);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #37  <Method boolean MediaController.dispatchKeyEvent(KeyEvent)>
	//   10   20:ireturn         
	}

	Activity a;
	final VideoViewActivity b;

	VideoViewActivity$LocalMediaController(VideoViewActivity videoviewactivity, Activity activity)
	{
		b = videoviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field VideoViewActivity b>
		super(((android.content.Context) (activity)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void MediaController(android.content.Context)>
		a = activity;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #20  <Field Activity a>
	//    9   15:return          
	}
}
