// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata;

import android.os.*;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.metadata:
//			MetadataDecoderFactory, MetadataOutput, MetadataInputBuffer, Metadata, 
//			MetadataDecoderException, MetadataDecoder

public final class MetadataRenderer extends BaseRenderer
	implements android.os.Handler.Callback
{
	public static interface Output
		extends MetadataOutput
	{
	}


	public MetadataRenderer(MetadataOutput metadataoutput, Looper looper)
	{
		this(metadataoutput, looper, MetadataDecoderFactory.DEFAULT);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #41  <Field MetadataDecoderFactory MetadataDecoderFactory.DEFAULT>
	//    4    6:invokespecial   #44  <Method void MetadataRenderer(MetadataOutput, Looper, MetadataDecoderFactory)>
	//    5    9:return          
	}

	public MetadataRenderer(MetadataOutput metadataoutput, Looper looper, MetadataDecoderFactory metadatadecoderfactory)
	{
		super(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokespecial   #48  <Method void BaseRenderer(int)>
		output = (MetadataOutput)Assertions.checkNotNull(((Object) (metadataoutput)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #54  <Method Object Assertions.checkNotNull(Object)>
	//    6   10:checkcast       #56  <Class MetadataOutput>
	//    7   13:putfield        #58  <Field MetadataOutput output>
		if(looper == null)
	//*   8   16:aload_2         
	//*   9   17:ifnonnull       25
			metadataoutput = null;
	//   10   20:aconst_null     
	//   11   21:astore_1        
		else
	//*  12   22:goto            35
			metadataoutput = ((MetadataOutput) (new Handler(looper, ((android.os.Handler.Callback) (this)))));
	//   13   25:new             #60  <Class Handler>
	//   14   28:dup             
	//   15   29:aload_2         
	//   16   30:aload_0         
	//   17   31:invokespecial   #63  <Method void Handler(Looper, android.os.Handler$Callback)>
	//   18   34:astore_1        
		outputHandler = ((Handler) (metadataoutput));
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:putfield        #65  <Field Handler outputHandler>
		decoderFactory = (MetadataDecoderFactory)Assertions.checkNotNull(((Object) (metadatadecoderfactory)));
	//   22   40:aload_0         
	//   23   41:aload_3         
	//   24   42:invokestatic    #54  <Method Object Assertions.checkNotNull(Object)>
	//   25   45:checkcast       #38  <Class MetadataDecoderFactory>
	//   26   48:putfield        #67  <Field MetadataDecoderFactory decoderFactory>
		formatHolder = new FormatHolder();
	//   27   51:aload_0         
	//   28   52:new             #69  <Class FormatHolder>
	//   29   55:dup             
	//   30   56:invokespecial   #72  <Method void FormatHolder()>
	//   31   59:putfield        #74  <Field FormatHolder formatHolder>
		buffer = new MetadataInputBuffer();
	//   32   62:aload_0         
	//   33   63:new             #76  <Class MetadataInputBuffer>
	//   34   66:dup             
	//   35   67:invokespecial   #77  <Method void MetadataInputBuffer()>
	//   36   70:putfield        #79  <Field MetadataInputBuffer buffer>
		pendingMetadata = new Metadata[5];
	//   37   73:aload_0         
	//   38   74:iconst_5        
	//   39   75:anewarray       Metadata[]
	//   40   78:putfield        #83  <Field Metadata[] pendingMetadata>
		pendingMetadataTimestamps = new long[5];
	//   41   81:aload_0         
	//   42   82:iconst_5        
	//   43   83:newarray        long[]
	//   44   85:putfield        #85  <Field long[] pendingMetadataTimestamps>
	//   45   88:return          
	}

	private void flushPendingMetadata()
	{
		Arrays.fill(((Object []) (pendingMetadata)), ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Metadata[] pendingMetadata>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #92  <Method void Arrays.fill(Object[], Object)>
		pendingMetadataIndex = 0;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #94  <Field int pendingMetadataIndex>
		pendingMetadataCount = 0;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #96  <Field int pendingMetadataCount>
	//   10   18:return          
	}

	private void invokeRenderer(Metadata metadata)
	{
		if(outputHandler != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field Handler outputHandler>
	//*   2    4:ifnull          20
		{
			outputHandler.obtainMessage(0, ((Object) (metadata))).sendToTarget();
	//    3    7:aload_0         
	//    4    8:getfield        #65  <Field Handler outputHandler>
	//    5   11:iconst_0        
	//    6   12:aload_1         
	//    7   13:invokevirtual   #102 <Method Message Handler.obtainMessage(int, Object)>
	//    8   16:invokevirtual   #107 <Method void Message.sendToTarget()>
			return;
	//    9   19:return          
		} else
		{
			invokeRendererInternal(metadata);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #110 <Method void invokeRendererInternal(Metadata)>
			return;
	//   13   25:return          
		}
	}

	private void invokeRendererInternal(Metadata metadata)
	{
		output.onMetadata(metadata);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field MetadataOutput output>
	//    2    4:aload_1         
	//    3    5:invokeinterface #113 <Method void MetadataOutput.onMetadata(Metadata)>
	//    4   10:return          
	}

	public boolean handleMessage(Message message)
	{
		if(message.what != 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #118 <Field int Message.what>
	//*   2    4:ifeq            15
		{
			throw new IllegalStateException();
	//    3    7:new             #120 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:invokespecial   #121 <Method void IllegalStateException()>
	//    6   14:athrow          
		} else
		{
			invokeRendererInternal((Metadata)message.obj);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:getfield        #125 <Field Object Message.obj>
	//   10   20:checkcast       #81  <Class Metadata>
	//   11   23:invokespecial   #110 <Method void invokeRendererInternal(Metadata)>
			return true;
	//   12   26:iconst_1        
	//   13   27:ireturn         
		}
	}

	public boolean isEnded()
	{
		return inputStreamEnded;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field boolean inputStreamEnded>
	//    2    4:ireturn         
	}

	public boolean isReady()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected void onDisabled()
	{
		flushPendingMetadata();
	//    0    0:aload_0         
	//    1    1:invokespecial   #133 <Method void flushPendingMetadata()>
		decoder = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #135 <Field MetadataDecoder decoder>
	//    5    9:return          
	}

	protected void onPositionReset(long l, boolean flag)
	{
		flushPendingMetadata();
	//    0    0:aload_0         
	//    1    1:invokespecial   #133 <Method void flushPendingMetadata()>
		inputStreamEnded = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #129 <Field boolean inputStreamEnded>
	//    5    9:return          
	}

	protected void onStreamChanged(Format aformat[], long l)
		throws ExoPlaybackException
	{
		decoder = decoderFactory.createDecoder(aformat[0]);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #67  <Field MetadataDecoderFactory decoderFactory>
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:aaload          
	//    6    8:invokeinterface #145 <Method MetadataDecoder MetadataDecoderFactory.createDecoder(Format)>
	//    7   13:putfield        #135 <Field MetadataDecoder decoder>
	//    8   16:return          
	}

	public void render(long l, long l1)
		throws ExoPlaybackException
	{
		if(!inputStreamEnded && pendingMetadataCount < 5)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field boolean inputStreamEnded>
	//*   2    4:ifne            167
	//*   3    7:aload_0         
	//*   4    8:getfield        #96  <Field int pendingMetadataCount>
	//*   5   11:iconst_5        
	//*   6   12:icmpge          167
		{
			buffer.clear();
	//    7   15:aload_0         
	//    8   16:getfield        #79  <Field MetadataInputBuffer buffer>
	//    9   19:invokevirtual   #153 <Method void MetadataInputBuffer.clear()>
			if(readSource(formatHolder, ((com.google.android.exoplayer2.decoder.DecoderInputBuffer) (buffer)), false) == -4)
	//*  10   22:aload_0         
	//*  11   23:aload_0         
	//*  12   24:getfield        #74  <Field FormatHolder formatHolder>
	//*  13   27:aload_0         
	//*  14   28:getfield        #79  <Field MetadataInputBuffer buffer>
	//*  15   31:iconst_0        
	//*  16   32:invokevirtual   #157 <Method int readSource(FormatHolder, com.google.android.exoplayer2.decoder.DecoderInputBuffer, boolean)>
	//*  17   35:bipush          -4
	//*  18   37:icmpne          167
				if(buffer.isEndOfStream())
	//*  19   40:aload_0         
	//*  20   41:getfield        #79  <Field MetadataInputBuffer buffer>
	//*  21   44:invokevirtual   #160 <Method boolean MetadataInputBuffer.isEndOfStream()>
	//*  22   47:ifeq            58
					inputStreamEnded = true;
	//   23   50:aload_0         
	//   24   51:iconst_1        
	//   25   52:putfield        #129 <Field boolean inputStreamEnded>
				else
	//*  26   55:goto            167
				if(!buffer.isDecodeOnly())
	//*  27   58:aload_0         
	//*  28   59:getfield        #79  <Field MetadataInputBuffer buffer>
	//*  29   62:invokevirtual   #163 <Method boolean MetadataInputBuffer.isDecodeOnly()>
	//*  30   65:ifeq            71
	//*  31   68:goto            167
				{
					buffer.subsampleOffsetUs = formatHolder.format.subsampleOffsetUs;
	//   32   71:aload_0         
	//   33   72:getfield        #79  <Field MetadataInputBuffer buffer>
	//   34   75:aload_0         
	//   35   76:getfield        #74  <Field FormatHolder formatHolder>
	//   36   79:getfield        #167 <Field Format FormatHolder.format>
	//   37   82:getfield        #173 <Field long Format.subsampleOffsetUs>
	//   38   85:putfield        #174 <Field long MetadataInputBuffer.subsampleOffsetUs>
					buffer.flip();
	//   39   88:aload_0         
	//   40   89:getfield        #79  <Field MetadataInputBuffer buffer>
	//   41   92:invokevirtual   #177 <Method void MetadataInputBuffer.flip()>
					try
					{
						int i = (pendingMetadataIndex + pendingMetadataCount) % 5;
	//   42   95:aload_0         
	//   43   96:getfield        #94  <Field int pendingMetadataIndex>
	//   44   99:aload_0         
	//   45  100:getfield        #96  <Field int pendingMetadataCount>
	//   46  103:iadd            
	//   47  104:iconst_5        
	//   48  105:irem            
	//   49  106:istore          5
						pendingMetadata[i] = decoder.decode(buffer);
	//   50  108:aload_0         
	//   51  109:getfield        #83  <Field Metadata[] pendingMetadata>
	//   52  112:iload           5
	//   53  114:aload_0         
	//   54  115:getfield        #135 <Field MetadataDecoder decoder>
	//   55  118:aload_0         
	//   56  119:getfield        #79  <Field MetadataInputBuffer buffer>
	//   57  122:invokeinterface #183 <Method Metadata MetadataDecoder.decode(MetadataInputBuffer)>
	//   58  127:aastore         
						pendingMetadataTimestamps[i] = buffer.timeUs;
	//   59  128:aload_0         
	//   60  129:getfield        #85  <Field long[] pendingMetadataTimestamps>
	//   61  132:iload           5
	//   62  134:aload_0         
	//   63  135:getfield        #79  <Field MetadataInputBuffer buffer>
	//   64  138:getfield        #186 <Field long MetadataInputBuffer.timeUs>
	//   65  141:lastore         
						pendingMetadataCount = pendingMetadataCount + 1;
	//   66  142:aload_0         
	//   67  143:aload_0         
	//   68  144:getfield        #96  <Field int pendingMetadataCount>
	//   69  147:iconst_1        
	//   70  148:iadd            
	//   71  149:putfield        #96  <Field int pendingMetadataCount>
					}
	//*  72  152:goto            167
					catch(MetadataDecoderException metadatadecoderexception)
	//*  73  155:astore          6
					{
						throw ExoPlaybackException.createForRenderer(((Exception) (metadatadecoderexception)), getIndex());
	//   74  157:aload           6
	//   75  159:aload_0         
	//   76  160:invokevirtual   #190 <Method int getIndex()>
	//   77  163:invokestatic    #194 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//   78  166:athrow          
					}
				}
		}
		if(pendingMetadataCount > 0 && pendingMetadataTimestamps[pendingMetadataIndex] <= l)
	//*  79  167:aload_0         
	//*  80  168:getfield        #96  <Field int pendingMetadataCount>
	//*  81  171:ifle            233
	//*  82  174:aload_0         
	//*  83  175:getfield        #85  <Field long[] pendingMetadataTimestamps>
	//*  84  178:aload_0         
	//*  85  179:getfield        #94  <Field int pendingMetadataIndex>
	//*  86  182:laload          
	//*  87  183:lload_1         
	//*  88  184:lcmp            
	//*  89  185:ifgt            233
		{
			invokeRenderer(pendingMetadata[pendingMetadataIndex]);
	//   90  188:aload_0         
	//   91  189:aload_0         
	//   92  190:getfield        #83  <Field Metadata[] pendingMetadata>
	//   93  193:aload_0         
	//   94  194:getfield        #94  <Field int pendingMetadataIndex>
	//   95  197:aaload          
	//   96  198:invokespecial   #196 <Method void invokeRenderer(Metadata)>
			pendingMetadata[pendingMetadataIndex] = null;
	//   97  201:aload_0         
	//   98  202:getfield        #83  <Field Metadata[] pendingMetadata>
	//   99  205:aload_0         
	//  100  206:getfield        #94  <Field int pendingMetadataIndex>
	//  101  209:aconst_null     
	//  102  210:aastore         
			pendingMetadataIndex = (pendingMetadataIndex + 1) % 5;
	//  103  211:aload_0         
	//  104  212:aload_0         
	//  105  213:getfield        #94  <Field int pendingMetadataIndex>
	//  106  216:iconst_1        
	//  107  217:iadd            
	//  108  218:iconst_5        
	//  109  219:irem            
	//  110  220:putfield        #94  <Field int pendingMetadataIndex>
			pendingMetadataCount = pendingMetadataCount - 1;
	//  111  223:aload_0         
	//  112  224:aload_0         
	//  113  225:getfield        #96  <Field int pendingMetadataCount>
	//  114  228:iconst_1        
	//  115  229:isub            
	//  116  230:putfield        #96  <Field int pendingMetadataCount>
		}
	//  117  233:return          
	}

	public int supportsFormat(Format format)
	{
		if(decoderFactory.supportsFormat(format))
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field MetadataDecoderFactory decoderFactory>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #201 <Method boolean MetadataDecoderFactory.supportsFormat(Format)>
	//*   4   10:ifeq            28
			return !supportsFormatDrm(((com.google.android.exoplayer2.drm.DrmSessionManager) (null)), format.drmInitData) ? 2 : 4;
	//    5   13:aconst_null     
	//    6   14:aload_1         
	//    7   15:getfield        #205 <Field com.google.android.exoplayer2.drm.DrmInitData Format.drmInitData>
	//    8   18:invokestatic    #209 <Method boolean supportsFormatDrm(com.google.android.exoplayer2.drm.DrmSessionManager, com.google.android.exoplayer2.drm.DrmInitData)>
	//    9   21:ifeq            26
	//   10   24:iconst_4        
	//   11   25:ireturn         
	//   12   26:iconst_2        
	//   13   27:ireturn         
		else
			return 0;
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	private static final int MAX_PENDING_METADATA_COUNT = 5;
	private static final int MSG_INVOKE_RENDERER = 0;
	private final MetadataInputBuffer buffer;
	private MetadataDecoder decoder;
	private final MetadataDecoderFactory decoderFactory;
	private final FormatHolder formatHolder;
	private boolean inputStreamEnded;
	private final MetadataOutput output;
	private final Handler outputHandler;
	private final Metadata pendingMetadata[];
	private int pendingMetadataCount;
	private int pendingMetadataIndex;
	private final long pendingMetadataTimestamps[];
}
