// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MediaClock;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2:
//			Renderer, RendererCapabilities, ExoPlaybackException, FormatHolder, 
//			Format, RendererConfiguration

public abstract class BaseRenderer
	implements Renderer, RendererCapabilities
{

	public BaseRenderer(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		trackType = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field int trackType>
		readEndOfStream = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #32  <Field boolean readEndOfStream>
	//    8   14:return          
	}

	protected static boolean supportsFormatDrm(DrmSessionManager drmsessionmanager, DrmInitData drminitdata)
	{
		if(drminitdata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		if(drmsessionmanager == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       12
			return false;
	//    6   10:iconst_0        
	//    7   11:ireturn         
		else
			return drmsessionmanager.canAcquireSession(drminitdata);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokeinterface #42  <Method boolean DrmSessionManager.canAcquireSession(DrmInitData)>
	//   11   19:ireturn         
	}

	public final void disable()
	{
		int i = state;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int state>
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
	//   12   18:invokestatic    #54  <Method void Assertions.checkState(boolean)>
		state = 0;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #48  <Field int state>
		stream = null;
	//   16   26:aload_0         
	//   17   27:aconst_null     
	//   18   28:putfield        #56  <Field SampleStream stream>
		streamFormats = null;
	//   19   31:aload_0         
	//   20   32:aconst_null     
	//   21   33:putfield        #58  <Field Format[] streamFormats>
		streamIsFinal = false;
	//   22   36:aload_0         
	//   23   37:iconst_0        
	//   24   38:putfield        #60  <Field boolean streamIsFinal>
		onDisabled();
	//   25   41:aload_0         
	//   26   42:invokevirtual   #63  <Method void onDisabled()>
	//   27   45:return          
	}

	public final void enable(RendererConfiguration rendererconfiguration, Format aformat[], SampleStream samplestream, long l, boolean flag, long l1)
		throws ExoPlaybackException
	{
		boolean flag1;
		if(state == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field int state>
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
	//    9   18:invokestatic    #54  <Method void Assertions.checkState(boolean)>
		configuration = rendererconfiguration;
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:putfield        #69  <Field RendererConfiguration configuration>
		state = 1;
	//   13   26:aload_0         
	//   14   27:iconst_1        
	//   15   28:putfield        #48  <Field int state>
		onEnabled(flag);
	//   16   31:aload_0         
	//   17   32:iload           6
	//   18   34:invokevirtual   #72  <Method void onEnabled(boolean)>
		replaceStream(aformat, samplestream, l1);
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:aload_3         
	//   22   40:lload           7
	//   23   42:invokevirtual   #76  <Method void replaceStream(Format[], SampleStream, long)>
		onPositionReset(l, flag);
	//   24   45:aload_0         
	//   25   46:lload           4
	//   26   48:iload           6
	//   27   50:invokevirtual   #80  <Method void onPositionReset(long, boolean)>
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
	//    1    1:getfield        #69  <Field RendererConfiguration configuration>
	//    2    4:areturn         
	}

	protected final int getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int index>
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
	//    1    1:getfield        #48  <Field int state>
	//    2    4:ireturn         
	}

	public final SampleStream getStream()
	{
		return stream;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field SampleStream stream>
	//    2    4:areturn         
	}

	protected final Format[] getStreamFormats()
	{
		return streamFormats;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Format[] streamFormats>
	//    2    4:areturn         
	}

	public final int getTrackType()
	{
		return trackType;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int trackType>
	//    2    4:ireturn         
	}

	public void handleMessage(int i, Object obj)
		throws ExoPlaybackException
	{
	//    0    0:return          
	}

	public final boolean hasReadStreamToEnd()
	{
		return readEndOfStream;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field boolean readEndOfStream>
	//    2    4:ireturn         
	}

	public final boolean isCurrentStreamFinal()
	{
		return streamIsFinal;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean streamIsFinal>
	//    2    4:ireturn         
	}

	protected final boolean isSourceReady()
	{
		if(readEndOfStream)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean readEndOfStream>
	//*   2    4:ifeq            12
			return streamIsFinal;
	//    3    7:aload_0         
	//    4    8:getfield        #60  <Field boolean streamIsFinal>
	//    5   11:ireturn         
		else
			return stream.isReady();
	//    6   12:aload_0         
	//    7   13:getfield        #56  <Field SampleStream stream>
	//    8   16:invokeinterface #108 <Method boolean SampleStream.isReady()>
	//    9   21:ireturn         
	}

	public final void maybeThrowStreamError()
		throws IOException
	{
		stream.maybeThrowError();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field SampleStream stream>
	//    2    4:invokeinterface #114 <Method void SampleStream.maybeThrowError()>
	//    3    9:return          
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

	protected void onStreamChanged(Format aformat[], long l)
		throws ExoPlaybackException
	{
	//    0    0:return          
	}

	protected final int readSource(FormatHolder formatholder, DecoderInputBuffer decoderinputbuffer, boolean flag)
	{
		int i = stream.readData(formatholder, decoderinputbuffer, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field SampleStream stream>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #123 <Method int SampleStream.readData(FormatHolder, DecoderInputBuffer, boolean)>
	//    6   12:istore          4
		if(i == -4)
	//*   7   14:iload           4
	//*   8   16:bipush          -4
	//*   9   18:icmpne          62
			if(decoderinputbuffer.isEndOfStream())
	//*  10   21:aload_2         
	//*  11   22:invokevirtual   #128 <Method boolean DecoderInputBuffer.isEndOfStream()>
	//*  12   25:ifeq            46
			{
				readEndOfStream = true;
	//   13   28:aload_0         
	//   14   29:iconst_1        
	//   15   30:putfield        #32  <Field boolean readEndOfStream>
				return !streamIsFinal ? -3 : -4;
	//   16   33:aload_0         
	//   17   34:getfield        #60  <Field boolean streamIsFinal>
	//   18   37:ifeq            43
	//   19   40:bipush          -4
	//   20   42:ireturn         
	//   21   43:bipush          -3
	//   22   45:ireturn         
			} else
			{
				decoderinputbuffer.timeUs = decoderinputbuffer.timeUs + streamOffsetUs;
	//   23   46:aload_2         
	//   24   47:aload_2         
	//   25   48:getfield        #131 <Field long DecoderInputBuffer.timeUs>
	//   26   51:aload_0         
	//   27   52:getfield        #133 <Field long streamOffsetUs>
	//   28   55:ladd            
	//   29   56:putfield        #131 <Field long DecoderInputBuffer.timeUs>
				return i;
	//   30   59:iload           4
	//   31   61:ireturn         
			}
		if(i == -5)
	//*  32   62:iload           4
	//*  33   64:bipush          -5
	//*  34   66:icmpne          102
		{
			decoderinputbuffer = ((DecoderInputBuffer) (formatholder.format));
	//   35   69:aload_1         
	//   36   70:getfield        #139 <Field Format FormatHolder.format>
	//   37   73:astore_2        
			if(((Format) (decoderinputbuffer)).subsampleOffsetUs != 0xffffffffL)
	//*  38   74:aload_2         
	//*  39   75:getfield        #144 <Field long Format.subsampleOffsetUs>
	//*  40   78:ldc2w           #145 <Long 0xffffffffL>
	//*  41   81:lcmp            
	//*  42   82:ifeq            102
				formatholder.format = ((Format) (decoderinputbuffer)).copyWithSubsampleOffsetUs(((Format) (decoderinputbuffer)).subsampleOffsetUs + streamOffsetUs);
	//   43   85:aload_1         
	//   44   86:aload_2         
	//   45   87:aload_2         
	//   46   88:getfield        #144 <Field long Format.subsampleOffsetUs>
	//   47   91:aload_0         
	//   48   92:getfield        #133 <Field long streamOffsetUs>
	//   49   95:ladd            
	//   50   96:invokevirtual   #150 <Method Format Format.copyWithSubsampleOffsetUs(long)>
	//   51   99:putfield        #139 <Field Format FormatHolder.format>
		}
		return i;
	//   52  102:iload           4
	//   53  104:ireturn         
	}

	public final void replaceStream(Format aformat[], SampleStream samplestream, long l)
		throws ExoPlaybackException
	{
		Assertions.checkState(streamIsFinal ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean streamIsFinal>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #54  <Method void Assertions.checkState(boolean)>
		stream = samplestream;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #56  <Field SampleStream stream>
		readEndOfStream = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #32  <Field boolean readEndOfStream>
		streamFormats = aformat;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #58  <Field Format[] streamFormats>
		streamOffsetUs = l;
	//   14   24:aload_0         
	//   15   25:lload_3         
	//   16   26:putfield        #133 <Field long streamOffsetUs>
		onStreamChanged(aformat, l);
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:lload_3         
	//   20   32:invokevirtual   #152 <Method void onStreamChanged(Format[], long)>
	//   21   35:return          
	}

	public final void resetPosition(long l)
		throws ExoPlaybackException
	{
		streamIsFinal = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #60  <Field boolean streamIsFinal>
		readEndOfStream = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #32  <Field boolean readEndOfStream>
		onPositionReset(l, false);
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #80  <Method void onPositionReset(long, boolean)>
	//   10   16:return          
	}

	public final void setCurrentStreamFinal()
	{
		streamIsFinal = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #60  <Field boolean streamIsFinal>
	//    3    5:return          
	}

	public final void setIndex(int i)
	{
		index = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #89  <Field int index>
	//    3    5:return          
	}

	protected int skipSource(long l)
	{
		return stream.skipData(l - streamOffsetUs);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field SampleStream stream>
	//    2    4:lload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #133 <Field long streamOffsetUs>
	//    5    9:lsub            
	//    6   10:invokeinterface #161 <Method int SampleStream.skipData(long)>
	//    7   15:ireturn         
	}

	public final void start()
		throws ExoPlaybackException
	{
		int i = state;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int state>
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
	//   12   18:invokestatic    #54  <Method void Assertions.checkState(boolean)>
		state = 2;
	//   13   21:aload_0         
	//   14   22:iconst_2        
	//   15   23:putfield        #48  <Field int state>
		onStarted();
	//   16   26:aload_0         
	//   17   27:invokevirtual   #164 <Method void onStarted()>
	//   18   30:return          
	}

	public final void stop()
		throws ExoPlaybackException
	{
		boolean flag;
		if(state == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field int state>
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
	//   10   16:invokestatic    #54  <Method void Assertions.checkState(boolean)>
		state = 1;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #48  <Field int state>
		onStopped();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #167 <Method void onStopped()>
	//   16   28:return          
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
	private boolean readEndOfStream;
	private int state;
	private SampleStream stream;
	private Format streamFormats[];
	private boolean streamIsFinal;
	private long streamOffsetUs;
	private final int trackType;
}
