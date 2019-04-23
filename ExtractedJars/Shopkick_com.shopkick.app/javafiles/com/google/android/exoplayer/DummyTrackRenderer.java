// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//			TrackRenderer, ExoPlaybackException, MediaFormat

public final class DummyTrackRenderer extends TrackRenderer
{

	public DummyTrackRenderer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void TrackRenderer()>
	//    2    4:return          
	}

	protected boolean doPrepare(long l)
		throws ExoPlaybackException
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected void doSomeWork(long l, long l1)
	{
		throw new IllegalStateException();
	//    0    0:new             #18  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void IllegalStateException()>
	//    3    7:athrow          
	}

	protected long getBufferedPositionUs()
	{
		throw new IllegalStateException();
	//    0    0:new             #18  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void IllegalStateException()>
	//    3    7:athrow          
	}

	protected long getDurationUs()
	{
		throw new IllegalStateException();
	//    0    0:new             #18  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void IllegalStateException()>
	//    3    7:athrow          
	}

	protected MediaFormat getFormat(int i)
	{
		throw new IllegalStateException();
	//    0    0:new             #18  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void IllegalStateException()>
	//    3    7:athrow          
	}

	protected int getTrackCount()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected boolean isEnded()
	{
		throw new IllegalStateException();
	//    0    0:new             #18  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void IllegalStateException()>
	//    3    7:athrow          
	}

	protected boolean isReady()
	{
		throw new IllegalStateException();
	//    0    0:new             #18  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void IllegalStateException()>
	//    3    7:athrow          
	}

	protected void maybeThrowError()
	{
		throw new IllegalStateException();
	//    0    0:new             #18  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void IllegalStateException()>
	//    3    7:athrow          
	}

	protected void seekTo(long l)
	{
		throw new IllegalStateException();
	//    0    0:new             #18  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void IllegalStateException()>
	//    3    7:athrow          
	}
}
