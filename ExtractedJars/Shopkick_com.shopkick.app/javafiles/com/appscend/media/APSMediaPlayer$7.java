// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;


// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

class APSMediaPlayer$7
	implements Runnable
{

	public void run()
	{
		skip();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field APSMediaPlayer this$0>
	//    2    4:invokevirtual   #24  <Method void APSMediaPlayer.skip()>
	//    3    7:return          
	}

	final APSMediaPlayer this$0;

	APSMediaPlayer$7()
	{
		this$0 = APSMediaPlayer.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field APSMediaPlayer this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
