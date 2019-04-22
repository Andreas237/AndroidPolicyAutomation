// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.a;

import android.media.AudioTrack;
import android.os.ConditionVariable;

// Referenced classes of package com.google.ads.interactivemedia.v3.a.a:
//			b

class b$1 extends Thread
{

	public void run()
	{
		a.flush();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AudioTrack a>
	//    2    4:invokevirtual   #28  <Method void AudioTrack.flush()>
		a.release();
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field AudioTrack a>
	//    5   11:invokevirtual   #31  <Method void AudioTrack.release()>
		com.google.ads.interactivemedia.v3.a.a.b.a(b).open();
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field b b>
	//    8   18:invokestatic    #34  <Method ConditionVariable b.a(b)>
	//    9   21:invokevirtual   #39  <Method void ConditionVariable.open()>
		return;
	//   10   24:return          
		Exception exception;
		exception;
	//   11   25:astore_1        
		com.google.ads.interactivemedia.v3.a.a.b.a(b).open();
	//   12   26:aload_0         
	//   13   27:getfield        #17  <Field b b>
	//   14   30:invokestatic    #34  <Method ConditionVariable b.a(b)>
	//   15   33:invokevirtual   #39  <Method void ConditionVariable.open()>
		throw exception;
	//   16   36:aload_1         
	//   17   37:athrow          
	}

	final AudioTrack a;
	final b b;

	b$1(b b1, AudioTrack audiotrack)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field b b>
		a = audiotrack;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field AudioTrack a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void Thread()>
	//    8   14:return          
	}
}
