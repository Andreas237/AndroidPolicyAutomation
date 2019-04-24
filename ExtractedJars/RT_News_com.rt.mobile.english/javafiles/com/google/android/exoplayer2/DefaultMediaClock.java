// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.StandaloneMediaClock;

// Referenced classes of package com.google.android.exoplayer2:
//			PlaybackParameters, Renderer, ExoPlaybackException

final class DefaultMediaClock
	implements MediaClock
{
	public static interface PlaybackParameterListener
	{

		public abstract void onPlaybackParametersChanged(PlaybackParameters playbackparameters);
	}


	public DefaultMediaClock(PlaybackParameterListener playbackparameterlistener, Clock clock)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		listener = playbackparameterlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field DefaultMediaClock$PlaybackParameterListener listener>
		standaloneMediaClock = new StandaloneMediaClock(clock);
	//    5    9:aload_0         
	//    6   10:new             #27  <Class StandaloneMediaClock>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #30  <Method void StandaloneMediaClock(Clock)>
	//   10   18:putfield        #32  <Field StandaloneMediaClock standaloneMediaClock>
	//   11   21:return          
	}

	private void ensureSynced()
	{
		long l = rendererClock.getPositionUs();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field MediaClock rendererClock>
	//    2    4:invokeinterface #40  <Method long MediaClock.getPositionUs()>
	//    3    9:lstore_1        
		standaloneMediaClock.resetPosition(l);
	//    4   10:aload_0         
	//    5   11:getfield        #32  <Field StandaloneMediaClock standaloneMediaClock>
	//    6   14:lload_1         
	//    7   15:invokevirtual   #44  <Method void StandaloneMediaClock.resetPosition(long)>
		PlaybackParameters playbackparameters = rendererClock.getPlaybackParameters();
	//    8   18:aload_0         
	//    9   19:getfield        #36  <Field MediaClock rendererClock>
	//   10   22:invokeinterface #48  <Method PlaybackParameters MediaClock.getPlaybackParameters()>
	//   11   27:astore_3        
		if(!playbackparameters.equals(((Object) (standaloneMediaClock.getPlaybackParameters()))))
	//*  12   28:aload_3         
	//*  13   29:aload_0         
	//*  14   30:getfield        #32  <Field StandaloneMediaClock standaloneMediaClock>
	//*  15   33:invokevirtual   #49  <Method PlaybackParameters StandaloneMediaClock.getPlaybackParameters()>
	//*  16   36:invokevirtual   #55  <Method boolean PlaybackParameters.equals(Object)>
	//*  17   39:ifne            61
		{
			standaloneMediaClock.setPlaybackParameters(playbackparameters);
	//   18   42:aload_0         
	//   19   43:getfield        #32  <Field StandaloneMediaClock standaloneMediaClock>
	//   20   46:aload_3         
	//   21   47:invokevirtual   #59  <Method PlaybackParameters StandaloneMediaClock.setPlaybackParameters(PlaybackParameters)>
	//   22   50:pop             
			listener.onPlaybackParametersChanged(playbackparameters);
	//   23   51:aload_0         
	//   24   52:getfield        #25  <Field DefaultMediaClock$PlaybackParameterListener listener>
	//   25   55:aload_3         
	//   26   56:invokeinterface #63  <Method void DefaultMediaClock$PlaybackParameterListener.onPlaybackParametersChanged(PlaybackParameters)>
		}
	//   27   61:return          
	}

	private boolean isUsingRendererClock()
	{
		return rendererClockSource != null && !rendererClockSource.isEnded() && (rendererClockSource.isReady() || !rendererClockSource.hasReadStreamToEnd());
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Renderer rendererClockSource>
	//    2    4:ifnull          45
	//    3    7:aload_0         
	//    4    8:getfield        #67  <Field Renderer rendererClockSource>
	//    5   11:invokeinterface #72  <Method boolean Renderer.isEnded()>
	//    6   16:ifne            45
	//    7   19:aload_0         
	//    8   20:getfield        #67  <Field Renderer rendererClockSource>
	//    9   23:invokeinterface #75  <Method boolean Renderer.isReady()>
	//   10   28:ifne            43
	//   11   31:aload_0         
	//   12   32:getfield        #67  <Field Renderer rendererClockSource>
	//   13   35:invokeinterface #78  <Method boolean Renderer.hasReadStreamToEnd()>
	//   14   40:ifne            45
	//   15   43:iconst_1        
	//   16   44:ireturn         
	//   17   45:iconst_0        
	//   18   46:ireturn         
	}

	public PlaybackParameters getPlaybackParameters()
	{
		if(rendererClock != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field MediaClock rendererClock>
	//*   2    4:ifnull          17
			return rendererClock.getPlaybackParameters();
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field MediaClock rendererClock>
	//    5   11:invokeinterface #48  <Method PlaybackParameters MediaClock.getPlaybackParameters()>
	//    6   16:areturn         
		else
			return standaloneMediaClock.getPlaybackParameters();
	//    7   17:aload_0         
	//    8   18:getfield        #32  <Field StandaloneMediaClock standaloneMediaClock>
	//    9   21:invokevirtual   #49  <Method PlaybackParameters StandaloneMediaClock.getPlaybackParameters()>
	//   10   24:areturn         
	}

	public long getPositionUs()
	{
		if(isUsingRendererClock())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #80  <Method boolean isUsingRendererClock()>
	//*   2    4:ifeq            17
			return rendererClock.getPositionUs();
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field MediaClock rendererClock>
	//    5   11:invokeinterface #40  <Method long MediaClock.getPositionUs()>
	//    6   16:lreturn         
		else
			return standaloneMediaClock.getPositionUs();
	//    7   17:aload_0         
	//    8   18:getfield        #32  <Field StandaloneMediaClock standaloneMediaClock>
	//    9   21:invokevirtual   #81  <Method long StandaloneMediaClock.getPositionUs()>
	//   10   24:lreturn         
	}

	public void onRendererDisabled(Renderer renderer)
	{
		if(renderer == rendererClockSource)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #67  <Field Renderer rendererClockSource>
	//*   3    5:if_acmpne       18
		{
			rendererClock = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #36  <Field MediaClock rendererClock>
			rendererClockSource = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #67  <Field Renderer rendererClockSource>
		}
	//   10   18:return          
	}

	public void onRendererEnabled(Renderer renderer)
		throws ExoPlaybackException
	{
		MediaClock mediaclock = renderer.getMediaClock();
	//    0    0:aload_1         
	//    1    1:invokeinterface #90  <Method MediaClock Renderer.getMediaClock()>
	//    2    6:astore_2        
		if(mediaclock != null && mediaclock != rendererClock)
	//*   3    7:aload_2         
	//*   4    8:ifnull          70
	//*   5   11:aload_2         
	//*   6   12:aload_0         
	//*   7   13:getfield        #36  <Field MediaClock rendererClock>
	//*   8   16:if_acmpeq       70
		{
			if(rendererClock != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #36  <Field MediaClock rendererClock>
	//*  11   23:ifnull          39
				throw ExoPlaybackException.createForUnexpected(((RuntimeException) (new IllegalStateException("Multiple renderer media clocks enabled."))));
	//   12   26:new             #92  <Class IllegalStateException>
	//   13   29:dup             
	//   14   30:ldc1            #94  <String "Multiple renderer media clocks enabled.">
	//   15   32:invokespecial   #97  <Method void IllegalStateException(String)>
	//   16   35:invokestatic    #101 <Method ExoPlaybackException ExoPlaybackException.createForUnexpected(RuntimeException)>
	//   17   38:athrow          
			rendererClock = mediaclock;
	//   18   39:aload_0         
	//   19   40:aload_2         
	//   20   41:putfield        #36  <Field MediaClock rendererClock>
			rendererClockSource = renderer;
	//   21   44:aload_0         
	//   22   45:aload_1         
	//   23   46:putfield        #67  <Field Renderer rendererClockSource>
			rendererClock.setPlaybackParameters(standaloneMediaClock.getPlaybackParameters());
	//   24   49:aload_0         
	//   25   50:getfield        #36  <Field MediaClock rendererClock>
	//   26   53:aload_0         
	//   27   54:getfield        #32  <Field StandaloneMediaClock standaloneMediaClock>
	//   28   57:invokevirtual   #49  <Method PlaybackParameters StandaloneMediaClock.getPlaybackParameters()>
	//   29   60:invokeinterface #102 <Method PlaybackParameters MediaClock.setPlaybackParameters(PlaybackParameters)>
	//   30   65:pop             
			ensureSynced();
	//   31   66:aload_0         
	//   32   67:invokespecial   #104 <Method void ensureSynced()>
		}
	//   33   70:return          
	}

	public void resetPosition(long l)
	{
		standaloneMediaClock.resetPosition(l);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field StandaloneMediaClock standaloneMediaClock>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #44  <Method void StandaloneMediaClock.resetPosition(long)>
	//    4    8:return          
	}

	public PlaybackParameters setPlaybackParameters(PlaybackParameters playbackparameters)
	{
		PlaybackParameters playbackparameters1 = playbackparameters;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(rendererClock != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #36  <Field MediaClock rendererClock>
	//*   4    6:ifnull          20
			playbackparameters1 = rendererClock.setPlaybackParameters(playbackparameters);
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field MediaClock rendererClock>
	//    7   13:aload_1         
	//    8   14:invokeinterface #102 <Method PlaybackParameters MediaClock.setPlaybackParameters(PlaybackParameters)>
	//    9   19:astore_2        
		standaloneMediaClock.setPlaybackParameters(playbackparameters1);
	//   10   20:aload_0         
	//   11   21:getfield        #32  <Field StandaloneMediaClock standaloneMediaClock>
	//   12   24:aload_2         
	//   13   25:invokevirtual   #59  <Method PlaybackParameters StandaloneMediaClock.setPlaybackParameters(PlaybackParameters)>
	//   14   28:pop             
		listener.onPlaybackParametersChanged(playbackparameters1);
	//   15   29:aload_0         
	//   16   30:getfield        #25  <Field DefaultMediaClock$PlaybackParameterListener listener>
	//   17   33:aload_2         
	//   18   34:invokeinterface #63  <Method void DefaultMediaClock$PlaybackParameterListener.onPlaybackParametersChanged(PlaybackParameters)>
		return playbackparameters1;
	//   19   39:aload_2         
	//   20   40:areturn         
	}

	public void start()
	{
		standaloneMediaClock.start();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field StandaloneMediaClock standaloneMediaClock>
	//    2    4:invokevirtual   #108 <Method void StandaloneMediaClock.start()>
	//    3    7:return          
	}

	public void stop()
	{
		standaloneMediaClock.stop();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field StandaloneMediaClock standaloneMediaClock>
	//    2    4:invokevirtual   #111 <Method void StandaloneMediaClock.stop()>
	//    3    7:return          
	}

	public long syncAndGetPositionUs()
	{
		if(isUsingRendererClock())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #80  <Method boolean isUsingRendererClock()>
	//*   2    4:ifeq            21
		{
			ensureSynced();
	//    3    7:aload_0         
	//    4    8:invokespecial   #104 <Method void ensureSynced()>
			return rendererClock.getPositionUs();
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field MediaClock rendererClock>
	//    7   15:invokeinterface #40  <Method long MediaClock.getPositionUs()>
	//    8   20:lreturn         
		} else
		{
			return standaloneMediaClock.getPositionUs();
	//    9   21:aload_0         
	//   10   22:getfield        #32  <Field StandaloneMediaClock standaloneMediaClock>
	//   11   25:invokevirtual   #81  <Method long StandaloneMediaClock.getPositionUs()>
	//   12   28:lreturn         
		}
	}

	private final PlaybackParameterListener listener;
	private MediaClock rendererClock;
	private Renderer rendererClockSource;
	private final StandaloneMediaClock standaloneMediaClock;
}
