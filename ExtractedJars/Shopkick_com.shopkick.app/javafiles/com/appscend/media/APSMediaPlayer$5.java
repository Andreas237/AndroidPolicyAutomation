// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

class APSMediaPlayer$5
	implements Runnable
{

	public void run()
	{
		if(hudlessLoadImageView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field APSMediaPlayer this$0>
	//*   2    4:getfield        #26  <Field ImageView APSMediaPlayer.hudlessLoadImageView>
	//*   3    7:ifnull          26
			((AnimationDrawable)hudlessLoadImageView.getDrawable()).start();
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field APSMediaPlayer this$0>
	//    6   14:getfield        #26  <Field ImageView APSMediaPlayer.hudlessLoadImageView>
	//    7   17:invokevirtual   #32  <Method android.graphics.drawable.Drawable ImageView.getDrawable()>
	//    8   20:checkcast       #34  <Class AnimationDrawable>
	//    9   23:invokevirtual   #37  <Method void AnimationDrawable.start()>
	//   10   26:return          
	}

	final APSMediaPlayer this$0;

	APSMediaPlayer$5()
	{
		this$0 = APSMediaPlayer.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field APSMediaPlayer this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
