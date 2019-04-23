// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bef

final class beg extends Thread
{

	beg(bef bef1, AudioTrack audiotrack)
	{
		b = bef1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bef b>
		a = audiotrack;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #14  <Field AudioTrack a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #17  <Method void Thread()>
	//    8   14:return          
	}

	public final void run()
	{
		a.flush();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AudioTrack a>
	//    2    4:invokevirtual   #24  <Method void AudioTrack.flush()>
		a.release();
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field AudioTrack a>
	//    5   11:invokevirtual   #27  <Method void AudioTrack.release()>
		bef.a(b).open();
	//    6   14:aload_0         
	//    7   15:getfield        #12  <Field bef b>
	//    8   18:invokestatic    #32  <Method ConditionVariable bef.a(bef)>
	//    9   21:invokevirtual   #37  <Method void ConditionVariable.open()>
		return;
	//   10   24:return          
		Exception exception;
		exception;
	//   11   25:astore_1        
		bef.a(b).open();
	//   12   26:aload_0         
	//   13   27:getfield        #12  <Field bef b>
	//   14   30:invokestatic    #32  <Method ConditionVariable bef.a(bef)>
	//   15   33:invokevirtual   #37  <Method void ConditionVariable.open()>
		throw exception;
	//   16   36:aload_1         
	//   17   37:athrow          
	}

	private final AudioTrack a;
	private final bef b;
}
