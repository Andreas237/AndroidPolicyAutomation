// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import com.google.android.exoplayer.ExoPlayer;

public class PlayerControl
	implements android.widget.MediaController.MediaPlayerControl
{

	public PlayerControl(ExoPlayer exoplayer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		exoPlayer = exoplayer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field ExoPlayer exoPlayer>
	//    5    9:return          
	}

	public boolean canPause()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean canSeekBackward()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean canSeekForward()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public int getAudioSessionId()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #24  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public int getBufferPercentage()
	{
		return exoPlayer.getBufferedPercentage();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ExoPlayer exoPlayer>
	//    2    4:invokeinterface #31  <Method int ExoPlayer.getBufferedPercentage()>
	//    3    9:ireturn         
	}

	public int getCurrentPosition()
	{
		if(exoPlayer.getDuration() == -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field ExoPlayer exoPlayer>
	//*   2    4:invokeinterface #36  <Method long ExoPlayer.getDuration()>
	//*   3    9:ldc2w           #37  <Long -1L>
	//*   4   12:lcmp            
	//*   5   13:ifne            18
			return 0;
	//    6   16:iconst_0        
	//    7   17:ireturn         
		else
			return (int)exoPlayer.getCurrentPosition();
	//    8   18:aload_0         
	//    9   19:getfield        #15  <Field ExoPlayer exoPlayer>
	//   10   22:invokeinterface #40  <Method long ExoPlayer.getCurrentPosition()>
	//   11   27:l2i             
	//   12   28:ireturn         
	}

	public int getDuration()
	{
		if(exoPlayer.getDuration() == -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field ExoPlayer exoPlayer>
	//*   2    4:invokeinterface #36  <Method long ExoPlayer.getDuration()>
	//*   3    9:ldc2w           #37  <Long -1L>
	//*   4   12:lcmp            
	//*   5   13:ifne            18
			return 0;
	//    6   16:iconst_0        
	//    7   17:ireturn         
		else
			return (int)exoPlayer.getDuration();
	//    8   18:aload_0         
	//    9   19:getfield        #15  <Field ExoPlayer exoPlayer>
	//   10   22:invokeinterface #36  <Method long ExoPlayer.getDuration()>
	//   11   27:l2i             
	//   12   28:ireturn         
	}

	public boolean isPlaying()
	{
		return exoPlayer.getPlayWhenReady();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ExoPlayer exoPlayer>
	//    2    4:invokeinterface #44  <Method boolean ExoPlayer.getPlayWhenReady()>
	//    3    9:ireturn         
	}

	public void pause()
	{
		exoPlayer.setPlayWhenReady(false);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ExoPlayer exoPlayer>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #49  <Method void ExoPlayer.setPlayWhenReady(boolean)>
	//    4   10:return          
	}

	public void seekTo(int i)
	{
		long l;
		if(exoPlayer.getDuration() == -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field ExoPlayer exoPlayer>
	//*   2    4:invokeinterface #36  <Method long ExoPlayer.getDuration()>
	//*   3    9:ldc2w           #37  <Long -1L>
	//*   4   12:lcmp            
	//*   5   13:ifne            21
			l = 0L;
	//    6   16:lconst_0        
	//    7   17:lstore_2        
		else
	//*   8   18:goto            35
			l = Math.min(Math.max(0, i), getDuration());
	//    9   21:iconst_0        
	//   10   22:iload_1         
	//   11   23:invokestatic    #57  <Method int Math.max(int, int)>
	//   12   26:aload_0         
	//   13   27:invokevirtual   #59  <Method int getDuration()>
	//   14   30:invokestatic    #62  <Method int Math.min(int, int)>
	//   15   33:i2l             
	//   16   34:lstore_2        
		exoPlayer.seekTo(l);
	//   17   35:aload_0         
	//   18   36:getfield        #15  <Field ExoPlayer exoPlayer>
	//   19   39:lload_2         
	//   20   40:invokeinterface #65  <Method void ExoPlayer.seekTo(long)>
	//   21   45:return          
	}

	public void start()
	{
		exoPlayer.setPlayWhenReady(true);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ExoPlayer exoPlayer>
	//    2    4:iconst_1        
	//    3    5:invokeinterface #49  <Method void ExoPlayer.setPlayWhenReady(boolean)>
	//    4   10:return          
	}

	private final ExoPlayer exoPlayer;
}
