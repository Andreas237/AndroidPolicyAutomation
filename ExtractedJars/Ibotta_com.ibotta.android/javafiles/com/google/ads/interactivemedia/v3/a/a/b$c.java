// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.a;

import android.media.AudioTrack;
import android.media.PlaybackParams;

// Referenced classes of package com.google.ads.interactivemedia.v3.a.a:
//			b

private static class b$c extends b$b
{

	private void h()
	{
		if(a != null && b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field AudioTrack a>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #27  <Field PlaybackParams b>
	//*   5   11:ifnull          25
			a.setPlaybackParams(b);
	//    6   14:aload_0         
	//    7   15:getfield        #25  <Field AudioTrack a>
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field PlaybackParams b>
	//   10   22:invokevirtual   #33  <Method void AudioTrack.setPlaybackParams(PlaybackParams)>
	//   11   25:return          
	}

	public void a(AudioTrack audiotrack, boolean flag)
	{
		super.a(audiotrack, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #36  <Method void b$b.a(AudioTrack, boolean)>
		h();
	//    4    6:aload_0         
	//    5    7:invokespecial   #38  <Method void h()>
	//    6   10:return          
	}

	public void a(PlaybackParams playbackparams)
	{
		if(playbackparams == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          7
	//*   2    4:goto            15
			playbackparams = new PlaybackParams();
	//    3    7:new             #40  <Class PlaybackParams>
	//    4   10:dup             
	//    5   11:invokespecial   #41  <Method void PlaybackParams()>
	//    6   14:astore_1        
		playbackparams = playbackparams.allowDefaults();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #45  <Method PlaybackParams PlaybackParams.allowDefaults()>
	//    9   19:astore_1        
		b = playbackparams;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #27  <Field PlaybackParams b>
		c = playbackparams.getSpeed();
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #49  <Method float PlaybackParams.getSpeed()>
	//   16   30:putfield        #19  <Field float c>
		h();
	//   17   33:aload_0         
	//   18   34:invokespecial   #38  <Method void h()>
	//   19   37:return          
	}

	public float g()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field float c>
	//    2    4:freturn         
	}

	private PlaybackParams b;
	private float c;

	public b$c()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void b$b()>
		c = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #19  <Field float c>
	//    5    9:return          
	}
}
