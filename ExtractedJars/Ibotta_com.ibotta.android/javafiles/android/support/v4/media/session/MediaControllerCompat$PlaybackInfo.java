// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;


// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat

public static final class MediaControllerCompat$PlaybackInfo
{

	private final int mAudioStream;
	private final int mCurrentVolume;
	private final int mMaxVolume;
	private final int mPlaybackType;
	private final int mVolumeControl;

	MediaControllerCompat$PlaybackInfo(int i, int j, int k, int l, int i1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mPlaybackType = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int mPlaybackType>
		mAudioStream = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int mAudioStream>
		mVolumeControl = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #24  <Field int mVolumeControl>
		mMaxVolume = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #26  <Field int mMaxVolume>
		mCurrentVolume = i1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #28  <Field int mCurrentVolume>
	//   17   31:return          
	}
}
