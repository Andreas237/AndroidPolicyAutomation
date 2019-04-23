// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.audio;

import android.media.AudioTrack;
import android.media.PlaybackParams;

// Referenced classes of package com.google.android.exoplayer.audio:
//			AudioTrack

private static class AudioTrack$AudioTrackUtilV23 extends AudioTrack$AudioTrackUtilV19
{

	private void maybeApplyPlaybackParams()
	{
		if(audioTrack != null && playbackParams != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AudioTrack audioTrack>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #28  <Field PlaybackParams playbackParams>
	//*   5   11:ifnull          25
			audioTrack.setPlaybackParams(playbackParams);
	//    6   14:aload_0         
	//    7   15:getfield        #26  <Field AudioTrack audioTrack>
	//    8   18:aload_0         
	//    9   19:getfield        #28  <Field PlaybackParams playbackParams>
	//   10   22:invokevirtual   #34  <Method void AudioTrack.setPlaybackParams(PlaybackParams)>
	//   11   25:return          
	}

	public float getPlaybackSpeed()
	{
		return playbackSpeed;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field float playbackSpeed>
	//    2    4:freturn         
	}

	public void reconfigure(AudioTrack audiotrack, boolean flag)
	{
		super.reconfigure(audiotrack, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #40  <Method void AudioTrack$AudioTrackUtilV19.reconfigure(AudioTrack, boolean)>
		maybeApplyPlaybackParams();
	//    4    6:aload_0         
	//    5    7:invokespecial   #42  <Method void maybeApplyPlaybackParams()>
	//    6   10:return          
	}

	public void setPlaybackParameters(PlaybackParams playbackparams)
	{
		if(playbackparams == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          7
	//*   2    4:goto            15
			playbackparams = new PlaybackParams();
	//    3    7:new             #45  <Class PlaybackParams>
	//    4   10:dup             
	//    5   11:invokespecial   #46  <Method void PlaybackParams()>
	//    6   14:astore_1        
		playbackparams = playbackparams.allowDefaults();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #50  <Method PlaybackParams PlaybackParams.allowDefaults()>
	//    9   19:astore_1        
		playbackParams = playbackparams;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #28  <Field PlaybackParams playbackParams>
		playbackSpeed = playbackparams.getSpeed();
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #53  <Method float PlaybackParams.getSpeed()>
	//   16   30:putfield        #20  <Field float playbackSpeed>
		maybeApplyPlaybackParams();
	//   17   33:aload_0         
	//   18   34:invokespecial   #42  <Method void maybeApplyPlaybackParams()>
	//   19   37:return          
	}

	private PlaybackParams playbackParams;
	private float playbackSpeed;

	public AudioTrack$AudioTrackUtilV23()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void AudioTrack$AudioTrackUtilV19()>
		playbackSpeed = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #20  <Field float playbackSpeed>
	//    5    9:return          
	}
}
