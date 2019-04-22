// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.a;

import android.media.AudioTrack;

// Referenced classes of package com.google.ads.interactivemedia.v3.a.a:
//			b

class b$2 extends Thread
{

	public void run()
	{
		a.release();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AudioTrack a>
	//    2    4:invokevirtual   #24  <Method void AudioTrack.release()>
	//    3    7:return          
	}

	final AudioTrack a;

	b$2(b b1, AudioTrack audiotrack)
	{
		a = audiotrack;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field AudioTrack a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Thread()>
	//    5    9:return          
	}
}
