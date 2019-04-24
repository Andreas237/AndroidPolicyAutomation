// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//			TransportStateListener

public abstract class TransportController
{

	public TransportController()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public abstract int getBufferPercentage();

	public abstract long getCurrentPosition();

	public abstract long getDuration();

	public abstract int getTransportControlFlags();

	public abstract boolean isPlaying();

	public abstract void pausePlaying();

	public abstract void registerStateListener(TransportStateListener transportstatelistener);

	public abstract void seekTo(long l);

	public abstract void startPlaying();

	public abstract void stopPlaying();

	public abstract void unregisterStateListener(TransportStateListener transportstatelistener);
}
