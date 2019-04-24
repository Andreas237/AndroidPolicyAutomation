// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MediaClock;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2:
//			Renderer, RendererCapabilities, ExoPlaybackException, RendererConfiguration, 
//			Format

public abstract class NoSampleRenderer
	implements Renderer, RendererCapabilities
{

	public NoSampleRenderer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public final void disable()
	{
		int i = state;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int state>
	//    2    4:istore_1        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		if(i != 1)
	//*   5    7:iload_1         
	//*   6    8:iconst_1        
	//*   7    9:icmpne          15
	//*   8   12:goto            17
			flag = false;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		Assertions.checkState(flag);
	//   11   17:iload_2         
	//   12   18:invokestatic    #31  <Method void Assertions.checkState(boolean)>
		state = 0;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #25  <Field int state>
		stream = null;
	//   16   26:aload_0         
	//   17   27:aconst_null     
	//   18   28:putfield        #33  <Field SampleStream stream>
		streamIsFinal = false;
	//   19   31:aload_0         
	//   20   32:iconst_0        
	//   21   33:putfield        #35  <Field boolean streamIsFinal>
		onDisabled();
	//   22   36:aload_0         
	//   23   37:invokevirtual   #38  <Method void onDisabled()>
	//   24   40:return          
	}

	public final void enable(RendererConfiguration rendererconfiguration, Format aformat[], SampleStream samplestream, long l, boolean flag, long l1)
		throws ExoPlaybackException
	{
		boolean flag1;
		if(state == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field int state>
	//*   2    4:ifne            13
			flag1 = true;
	//    3    7:iconst_1        
	//    4    8:istore          9
		else
	//*   5   10:goto            16
			flag1 = false;
	//    6   13:iconst_0        
	//    7   14:istore          9
		Assertions.checkState(flag1);
	//    8   16:iload           9
	//    9   18:invokestatic    #31  <Method void Assertions.checkState(boolean)>
		configuration = rendererconfiguration;
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:putfield        #44  <Field RendererConfiguration configuration>
		state = 1;
	//   13   26:aload_0         
	//   14   27:iconst_1        
	//   15   28:putfield        #25  <Field int state>
		onEnabled(flag);
	//   16   31:aload_0         
	//   17   32:iload           6
	//   18   34:invokevirtual   #47  <Method void onEnabled(boolean)>
		replaceStream(aformat, samplestream, l1);
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:aload_3         
	//   22   40:lload           7
	//   23   42:invokevirtual   #51  <Method void replaceStream(Format[], SampleStream, long)>
		onPositionReset(l, flag);
	//   24   45:aload_0         
	//   25   46:lload           4
	//   26   48:iload           6
	//   27   50:invokevirtual   #55  <Method void onPositionReset(long, boolean)>
	//   28   53:return          
	}

	public final RendererCapabilities getCapabilities()
	{
		return ((RendererCapabilities) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	protected final RendererConfiguration getConfiguration()
	{
		return configuration;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field RendererConfiguration configuration>
	//    2    4:areturn         
	}

	protected final int getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int index>
	//    2    4:ireturn         
	}

	public MediaClock getMediaClock()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final int getState()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int state>
	//    2    4:ireturn         
	}

	public final SampleStream getStream()
	{
		return stream;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SampleStream stream>
	//    2    4:areturn         
	}

	public final int getTrackType()
	{
		return 5;
	//    0    0:iconst_5        
	//    1    1:ireturn         
	}

	public void handleMessage(int i, Object obj)
		throws ExoPlaybackException
	{
	//    0    0:return          
	}

	public final boolean hasReadStreamToEnd()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final boolean isCurrentStreamFinal()
	{
		return streamIsFinal;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean streamIsFinal>
	//    2    4:ireturn         
	}

	public boolean isEnded()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isReady()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final void maybeThrowStreamError()
		throws IOException
	{
	//    0    0:return          
	}

	protected void onDisabled()
	{
	//    0    0:return          
	}

	protected void onEnabled(boolean flag)
		throws ExoPlaybackException
	{
	//    0    0:return          
	}

	protected void onPositionReset(long l, boolean flag)
		throws ExoPlaybackException
	{
	//    0    0:return          
	}

	protected void onRendererOffsetChanged(long l)
		throws ExoPlaybackException
	{
	//    0    0:return          
	}

	protected void onStarted()
		throws ExoPlaybackException
	{
	//    0    0:return          
	}

	protected void onStopped()
		throws ExoPlaybackException
	{
	//    0    0:return          
	}

	public final void replaceStream(Format aformat[], SampleStream samplestream, long l)
		throws ExoPlaybackException
	{
		Assertions.checkState(streamIsFinal ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean streamIsFinal>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #31  <Method void Assertions.checkState(boolean)>
		stream = samplestream;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field SampleStream stream>
		onRendererOffsetChanged(l);
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:invokevirtual   #86  <Method void onRendererOffsetChanged(long)>
	//   11   19:return          
	}

	public final void resetPosition(long l)
		throws ExoPlaybackException
	{
		streamIsFinal = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #35  <Field boolean streamIsFinal>
		onPositionReset(l, false);
	//    3    5:aload_0         
	//    4    6:lload_1         
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #55  <Method void onPositionReset(long, boolean)>
	//    7   11:return          
	}

	public final void setCurrentStreamFinal()
	{
		streamIsFinal = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #35  <Field boolean streamIsFinal>
	//    3    5:return          
	}

	public final void setIndex(int i)
	{
		index = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field int index>
	//    3    5:return          
	}

	public final void start()
		throws ExoPlaybackException
	{
		int i = state;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int state>
	//    2    4:istore_1        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		if(i != 1)
	//*   5    7:iload_1         
	//*   6    8:iconst_1        
	//*   7    9:icmpne          15
	//*   8   12:goto            17
			flag = false;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		Assertions.checkState(flag);
	//   11   17:iload_2         
	//   12   18:invokestatic    #31  <Method void Assertions.checkState(boolean)>
		state = 2;
	//   13   21:aload_0         
	//   14   22:iconst_2        
	//   15   23:putfield        #25  <Field int state>
		onStarted();
	//   16   26:aload_0         
	//   17   27:invokevirtual   #93  <Method void onStarted()>
	//   18   30:return          
	}

	public final void stop()
		throws ExoPlaybackException
	{
		boolean flag;
		if(state == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field int state>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		Assertions.checkState(flag);
	//    9   15:iload_1         
	//   10   16:invokestatic    #31  <Method void Assertions.checkState(boolean)>
		state = 1;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #25  <Field int state>
		onStopped();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #96  <Method void onStopped()>
	//   16   28:return          
	}

	public int supportsFormat(Format format)
		throws ExoPlaybackException
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int supportsMixedMimeTypeAdaptation()
		throws ExoPlaybackException
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private RendererConfiguration configuration;
	private int index;
	private int state;
	private SampleStream stream;
	private boolean streamIsFinal;
}
