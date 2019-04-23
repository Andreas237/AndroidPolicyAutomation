// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.metadata;

import android.os.*;
import com.google.android.exoplayer.*;
import com.google.android.exoplayer.util.Assertions;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer.metadata:
//			MetadataParser

public final class MetadataTrackRenderer extends SampleSourceTrackRenderer
	implements android.os.Handler.Callback
{
	public static interface MetadataRenderer
	{

		public abstract void onMetadata(Object obj);
	}


	public MetadataTrackRenderer(SampleSource samplesource, MetadataParser metadataparser, MetadataRenderer metadatarenderer, Looper looper)
	{
		super(new SampleSource[] {
			samplesource
		});
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:anewarray       SampleSource[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:aastore         
	//    7    9:invokespecial   #39  <Method void SampleSourceTrackRenderer(SampleSource[])>
		metadataParser = (MetadataParser)Assertions.checkNotNull(((Object) (metadataparser)));
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:invokestatic    #45  <Method Object Assertions.checkNotNull(Object)>
	//   11   17:checkcast       #47  <Class MetadataParser>
	//   12   20:putfield        #49  <Field MetadataParser metadataParser>
		metadataRenderer = (MetadataRenderer)Assertions.checkNotNull(((Object) (metadatarenderer)));
	//   13   23:aload_0         
	//   14   24:aload_3         
	//   15   25:invokestatic    #45  <Method Object Assertions.checkNotNull(Object)>
	//   16   28:checkcast       #9   <Class MetadataTrackRenderer$MetadataRenderer>
	//   17   31:putfield        #51  <Field MetadataTrackRenderer$MetadataRenderer metadataRenderer>
		if(looper == null)
	//*  18   34:aload           4
	//*  19   36:ifnonnull       44
			samplesource = null;
	//   20   39:aconst_null     
	//   21   40:astore_1        
		else
	//*  22   41:goto            55
			samplesource = ((SampleSource) (new Handler(looper, ((android.os.Handler.Callback) (this)))));
	//   23   44:new             #53  <Class Handler>
	//   24   47:dup             
	//   25   48:aload           4
	//   26   50:aload_0         
	//   27   51:invokespecial   #56  <Method void Handler(Looper, android.os.Handler$Callback)>
	//   28   54:astore_1        
		metadataHandler = ((Handler) (samplesource));
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:putfield        #58  <Field Handler metadataHandler>
	//   32   60:aload_0         
	//   33   61:new             #60  <Class MediaFormatHolder>
	//   34   64:dup             
	//   35   65:invokespecial   #63  <Method void MediaFormatHolder()>
	//   36   68:putfield        #65  <Field MediaFormatHolder formatHolder>
	//   37   71:aload_0         
	//   38   72:new             #67  <Class SampleHolder>
	//   39   75:dup             
	//   40   76:iconst_1        
	//   41   77:invokespecial   #70  <Method void SampleHolder(int)>
	//   42   80:putfield        #72  <Field SampleHolder sampleHolder>
	//   43   83:return          
	}

	private void invokeRenderer(Object obj)
	{
		Handler handler = metadataHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Handler metadataHandler>
	//    2    4:astore_2        
		if(handler != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          19
		{
			handler.obtainMessage(0, obj).sendToTarget();
	//    5    9:aload_2         
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:invokevirtual   #81  <Method Message Handler.obtainMessage(int, Object)>
	//    9   15:invokevirtual   #86  <Method void Message.sendToTarget()>
			return;
	//   10   18:return          
		} else
		{
			invokeRendererInternal(obj);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokespecial   #89  <Method void invokeRendererInternal(Object)>
			return;
	//   14   24:return          
		}
	}

	private void invokeRendererInternal(Object obj)
	{
		metadataRenderer.onMetadata(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field MetadataTrackRenderer$MetadataRenderer metadataRenderer>
	//    2    4:aload_1         
	//    3    5:invokeinterface #93  <Method void MetadataTrackRenderer$MetadataRenderer.onMetadata(Object)>
	//    4   10:return          
	}

	protected void doSomeWork(long l, long l1, boolean flag)
		throws ExoPlaybackException
	{
		if(!inputStreamEnded && pendingMetadata == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field boolean inputStreamEnded>
	//*   2    4:ifne            110
	//*   3    7:aload_0         
	//*   4    8:getfield        #103 <Field Object pendingMetadata>
	//*   5   11:ifnonnull       110
		{
			sampleHolder.clearData();
	//    6   14:aload_0         
	//    7   15:getfield        #72  <Field SampleHolder sampleHolder>
	//    8   18:invokevirtual   #106 <Method void SampleHolder.clearData()>
			int i = readSource(l, formatHolder, sampleHolder);
	//    9   21:aload_0         
	//   10   22:lload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #65  <Field MediaFormatHolder formatHolder>
	//   13   27:aload_0         
	//   14   28:getfield        #72  <Field SampleHolder sampleHolder>
	//   15   31:invokevirtual   #110 <Method int readSource(long, MediaFormatHolder, SampleHolder)>
	//   16   34:istore          6
			if(i == -3)
	//*  17   36:iload           6
	//*  18   38:bipush          -3
	//*  19   40:icmpne          99
			{
				pendingMetadataTimestamp = sampleHolder.timeUs;
	//   20   43:aload_0         
	//   21   44:aload_0         
	//   22   45:getfield        #72  <Field SampleHolder sampleHolder>
	//   23   48:getfield        #113 <Field long SampleHolder.timeUs>
	//   24   51:putfield        #115 <Field long pendingMetadataTimestamp>
				try
				{
					pendingMetadata = metadataParser.parse(sampleHolder.data.array(), sampleHolder.size);
	//   25   54:aload_0         
	//   26   55:aload_0         
	//   27   56:getfield        #49  <Field MetadataParser metadataParser>
	//   28   59:aload_0         
	//   29   60:getfield        #72  <Field SampleHolder sampleHolder>
	//   30   63:getfield        #119 <Field ByteBuffer SampleHolder.data>
	//   31   66:invokevirtual   #125 <Method byte[] ByteBuffer.array()>
	//   32   69:aload_0         
	//   33   70:getfield        #72  <Field SampleHolder sampleHolder>
	//   34   73:getfield        #128 <Field int SampleHolder.size>
	//   35   76:invokeinterface #132 <Method Object MetadataParser.parse(byte[], int)>
	//   36   81:putfield        #103 <Field Object pendingMetadata>
				}
	//*  37   84:goto            110
				catch(IOException ioexception)
	//*  38   87:astore          7
				{
					throw new ExoPlaybackException(((Throwable) (ioexception)));
	//   39   89:new             #97  <Class ExoPlaybackException>
	//   40   92:dup             
	//   41   93:aload           7
	//   42   95:invokespecial   #135 <Method void ExoPlaybackException(Throwable)>
	//   43   98:athrow          
				}
			} else
			if(i == -1)
	//*  44   99:iload           6
	//*  45  101:iconst_m1       
	//*  46  102:icmpne          110
				inputStreamEnded = true;
	//   47  105:aload_0         
	//   48  106:iconst_1        
	//   49  107:putfield        #101 <Field boolean inputStreamEnded>
		}
		Object obj = pendingMetadata;
	//   50  110:aload_0         
	//   51  111:getfield        #103 <Field Object pendingMetadata>
	//   52  114:astore          7
		if(obj != null && pendingMetadataTimestamp <= l)
	//*  53  116:aload           7
	//*  54  118:ifnull          141
	//*  55  121:aload_0         
	//*  56  122:getfield        #115 <Field long pendingMetadataTimestamp>
	//*  57  125:lload_1         
	//*  58  126:lcmp            
	//*  59  127:ifgt            141
		{
			invokeRenderer(obj);
	//   60  130:aload_0         
	//   61  131:aload           7
	//   62  133:invokespecial   #137 <Method void invokeRenderer(Object)>
			pendingMetadata = null;
	//   63  136:aload_0         
	//   64  137:aconst_null     
	//   65  138:putfield        #103 <Field Object pendingMetadata>
		}
	//   66  141:return          
	}

	protected long getBufferedPositionUs()
	{
		return -3L;
	//    0    0:ldc2w           #141 <Long -3L>
	//    1    3:lreturn         
	}

	public boolean handleMessage(Message message)
	{
		if(message.what != 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #147 <Field int Message.what>
	//*   2    4:ifeq            9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			invokeRendererInternal(message.obj);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #150 <Field Object Message.obj>
	//    8   14:invokespecial   #89  <Method void invokeRendererInternal(Object)>
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		}
	}

	protected boolean handlesTrack(MediaFormat mediaformat)
	{
		return metadataParser.canParse(mediaformat.mimeType);
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field MetadataParser metadataParser>
	//    2    4:aload_1         
	//    3    5:getfield        #158 <Field String MediaFormat.mimeType>
	//    4    8:invokeinterface #162 <Method boolean MetadataParser.canParse(String)>
	//    5   13:ireturn         
	}

	protected boolean isEnded()
	{
		return inputStreamEnded;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field boolean inputStreamEnded>
	//    2    4:ireturn         
	}

	protected boolean isReady()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected void onDisabled()
		throws ExoPlaybackException
	{
		pendingMetadata = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #103 <Field Object pendingMetadata>
		super.onDisabled();
	//    3    5:aload_0         
	//    4    6:invokespecial   #168 <Method void SampleSourceTrackRenderer.onDisabled()>
	//    5    9:return          
	}

	protected void onDiscontinuity(long l)
	{
		pendingMetadata = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #103 <Field Object pendingMetadata>
		inputStreamEnded = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #101 <Field boolean inputStreamEnded>
	//    6   10:return          
	}

	private static final int MSG_INVOKE_RENDERER = 0;
	private final MediaFormatHolder formatHolder = new MediaFormatHolder();
	private boolean inputStreamEnded;
	private final Handler metadataHandler;
	private final MetadataParser metadataParser;
	private final MetadataRenderer metadataRenderer;
	private Object pendingMetadata;
	private long pendingMetadataTimestamp;
	private final SampleHolder sampleHolder = new SampleHolder(1);
}
