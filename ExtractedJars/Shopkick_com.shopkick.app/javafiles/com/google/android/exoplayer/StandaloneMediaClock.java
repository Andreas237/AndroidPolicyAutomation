// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.os.SystemClock;

// Referenced classes of package com.google.android.exoplayer:
//			MediaClock

final class StandaloneMediaClock
	implements MediaClock
{

	StandaloneMediaClock()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	private long elapsedRealtimeMinus(long l)
	{
		return SystemClock.elapsedRealtime() * 1000L - l;
	//    0    0:invokestatic    #24  <Method long SystemClock.elapsedRealtime()>
	//    1    3:ldc2w           #25  <Long 1000L>
	//    2    6:lmul            
	//    3    7:lload_1         
	//    4    8:lsub            
	//    5    9:lreturn         
	}

	public long getPositionUs()
	{
		if(started)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field boolean started>
	//*   2    4:ifeq            16
			return elapsedRealtimeMinus(deltaUs);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field long deltaUs>
	//    6   12:invokespecial   #33  <Method long elapsedRealtimeMinus(long)>
	//    7   15:lreturn         
		else
			return positionUs;
	//    8   16:aload_0         
	//    9   17:getfield        #35  <Field long positionUs>
	//   10   20:lreturn         
	}

	public void setPositionUs(long l)
	{
		positionUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #35  <Field long positionUs>
		deltaUs = elapsedRealtimeMinus(l);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:lload_1         
	//    6    8:invokespecial   #33  <Method long elapsedRealtimeMinus(long)>
	//    7   11:putfield        #31  <Field long deltaUs>
	//    8   14:return          
	}

	public void start()
	{
		if(!started)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field boolean started>
	//*   2    4:ifne            24
		{
			started = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #29  <Field boolean started>
			deltaUs = elapsedRealtimeMinus(positionUs);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #35  <Field long positionUs>
	//   10   18:invokespecial   #33  <Method long elapsedRealtimeMinus(long)>
	//   11   21:putfield        #31  <Field long deltaUs>
		}
	//   12   24:return          
	}

	public void stop()
	{
		if(started)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field boolean started>
	//*   2    4:ifeq            24
		{
			positionUs = elapsedRealtimeMinus(deltaUs);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field long deltaUs>
	//    7   13:invokespecial   #33  <Method long elapsedRealtimeMinus(long)>
	//    8   16:putfield        #35  <Field long positionUs>
			started = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #29  <Field boolean started>
		}
	//   12   24:return          
	}

	private long deltaUs;
	private long positionUs;
	private boolean started;
}
