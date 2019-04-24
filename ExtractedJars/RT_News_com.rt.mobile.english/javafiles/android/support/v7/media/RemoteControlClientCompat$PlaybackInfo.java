// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//			RemoteControlClientCompat

public static final class RemoteControlClientCompat$PlaybackInfo
{

	public int playbackStream;
	public int playbackType;
	public int volume;
	public int volumeHandling;
	public int volumeMax;

	public RemoteControlClientCompat$PlaybackInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		volumeHandling = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field int volumeHandling>
		playbackStream = 3;
	//    5    9:aload_0         
	//    6   10:iconst_3        
	//    7   11:putfield        #21  <Field int playbackStream>
		playbackType = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #23  <Field int playbackType>
	//   11   19:return          
	}
}
