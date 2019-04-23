// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import android.widget.RelativeLayout;

// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

class APSMediaPlayer$9
	implements Runnable
{

	public void run()
	{
		if(APSMediaPlayer.access$500(APSMediaPlayer.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field APSMediaPlayer this$0>
	//*   2    4:invokestatic    #26  <Method RelativeLayout APSMediaPlayer.access$500(APSMediaPlayer)>
	//*   3    7:ifnull          20
			APSMediaPlayer.access$500(APSMediaPlayer.this).removeAllViews();
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field APSMediaPlayer this$0>
	//    6   14:invokestatic    #26  <Method RelativeLayout APSMediaPlayer.access$500(APSMediaPlayer)>
	//    7   17:invokevirtual   #31  <Method void RelativeLayout.removeAllViews()>
	//    8   20:return          
	}

	final APSMediaPlayer this$0;

	APSMediaPlayer$9()
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
