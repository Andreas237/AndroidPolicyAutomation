// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import android.view.View;
import android.widget.RelativeLayout;

// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

class APSMediaPlayer$8
	implements Runnable
{

	public void run()
	{
		APSMediaPlayer.access$400(APSMediaPlayer.this).removeView(val$viewToRemove);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field APSMediaPlayer this$0>
	//    2    4:invokestatic    #30  <Method RelativeLayout APSMediaPlayer.access$400(APSMediaPlayer)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field View val$viewToRemove>
	//    5   11:invokevirtual   #36  <Method void RelativeLayout.removeView(View)>
	//    6   14:return          
	}

	final APSMediaPlayer this$0;
	final View val$viewToRemove;

	APSMediaPlayer$8()
	{
		this$0 = final_apsmediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field APSMediaPlayer this$0>
		val$viewToRemove = View.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field View val$viewToRemove>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
