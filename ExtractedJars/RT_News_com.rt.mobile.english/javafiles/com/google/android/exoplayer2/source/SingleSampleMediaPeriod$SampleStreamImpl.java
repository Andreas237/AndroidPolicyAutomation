// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer2.source:
//			SampleStream, SingleSampleMediaPeriod

private final class SingleSampleMediaPeriod$SampleStreamImpl
	implements SampleStream
{

	private void sendFormat()
	{
		if(!formatSent)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field boolean formatSent>
	//*   2    4:ifne            45
		{
			SingleSampleMediaPeriod.access$300(SingleSampleMediaPeriod.this).downstreamFormatChanged(MimeTypes.getTrackType(format.sampleMimeType), format, 0, ((Object) (null)), 0L);
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field SingleSampleMediaPeriod this$0>
	//    5   11:invokestatic    #39  <Method MediaSourceEventListener$EventDispatcher SingleSampleMediaPeriod.access$300(SingleSampleMediaPeriod)>
	//    6   14:aload_0         
	//    7   15:getfield        #25  <Field SingleSampleMediaPeriod this$0>
	//    8   18:getfield        #43  <Field Format SingleSampleMediaPeriod.format>
	//    9   21:getfield        #49  <Field String Format.sampleMimeType>
	//   10   24:invokestatic    #55  <Method int MimeTypes.getTrackType(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #25  <Field SingleSampleMediaPeriod this$0>
	//   13   31:getfield        #43  <Field Format SingleSampleMediaPeriod.format>
	//   14   34:iconst_0        
	//   15   35:aconst_null     
	//   16   36:lconst_0        
	//   17   37:invokevirtual   #61  <Method void MediaSourceEventListener$EventDispatcher.downstreamFormatChanged(int, Format, int, Object, long)>
			formatSent = true;
	//   18   40:aload_0         
	//   19   41:iconst_1        
	//   20   42:putfield        #35  <Field boolean formatSent>
		}
	//   21   45:return          
	}

	public boolean isReady()
	{
		return loadingFinished;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SingleSampleMediaPeriod this$0>
	//    2    4:getfield        #66  <Field boolean SingleSampleMediaPeriod.loadingFinished>
	//    3    7:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
		if(!treatLoadErrorsAsEndOfStream)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field SingleSampleMediaPeriod this$0>
	//*   2    4:getfield        #72  <Field boolean SingleSampleMediaPeriod.treatLoadErrorsAsEndOfStream>
	//*   3    7:ifne            20
			loader.maybeThrowError();
	//    4   10:aload_0         
	//    5   11:getfield        #25  <Field SingleSampleMediaPeriod this$0>
	//    6   14:getfield        #76  <Field Loader SingleSampleMediaPeriod.loader>
	//    7   17:invokevirtual   #80  <Method void Loader.maybeThrowError()>
	//    8   20:return          
	}

	public int readData(FormatHolder formatholder, DecoderInputBuffer decoderinputbuffer, boolean flag)
	{
		if(streamState == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field int streamState>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          16
		{
			decoderinputbuffer.addFlag(4);
	//    4    8:aload_2         
	//    5    9:iconst_4        
	//    6   10:invokevirtual   #91  <Method void DecoderInputBuffer.addFlag(int)>
			return -4;
	//    7   13:bipush          -4
	//    8   15:ireturn         
		}
		if(!flag && streamState != 0)
	//*   9   16:iload_3         
	//*  10   17:ifne            117
	//*  11   20:aload_0         
	//*  12   21:getfield        #85  <Field int streamState>
	//*  13   24:ifne            30
	//*  14   27:goto            117
		{
			if(loadingFinished)
	//*  15   30:aload_0         
	//*  16   31:getfield        #25  <Field SingleSampleMediaPeriod this$0>
	//*  17   34:getfield        #66  <Field boolean SingleSampleMediaPeriod.loadingFinished>
	//*  18   37:ifeq            114
			{
				if(loadingSucceeded)
	//*  19   40:aload_0         
	//*  20   41:getfield        #25  <Field SingleSampleMediaPeriod this$0>
	//*  21   44:getfield        #94  <Field boolean SingleSampleMediaPeriod.loadingSucceeded>
	//*  22   47:ifeq            101
				{
					decoderinputbuffer.timeUs = 0L;
	//   23   50:aload_2         
	//   24   51:lconst_0        
	//   25   52:putfield        #98  <Field long DecoderInputBuffer.timeUs>
					decoderinputbuffer.addFlag(1);
	//   26   55:aload_2         
	//   27   56:iconst_1        
	//   28   57:invokevirtual   #91  <Method void DecoderInputBuffer.addFlag(int)>
					decoderinputbuffer.ensureSpaceForWrite(sampleSize);
	//   29   60:aload_2         
	//   30   61:aload_0         
	//   31   62:getfield        #25  <Field SingleSampleMediaPeriod this$0>
	//   32   65:getfield        #101 <Field int SingleSampleMediaPeriod.sampleSize>
	//   33   68:invokevirtual   #104 <Method void DecoderInputBuffer.ensureSpaceForWrite(int)>
					decoderinputbuffer.data.put(sampleData, 0, sampleSize);
	//   34   71:aload_2         
	//   35   72:getfield        #108 <Field ByteBuffer DecoderInputBuffer.data>
	//   36   75:aload_0         
	//   37   76:getfield        #25  <Field SingleSampleMediaPeriod this$0>
	//   38   79:getfield        #112 <Field byte[] SingleSampleMediaPeriod.sampleData>
	//   39   82:iconst_0        
	//   40   83:aload_0         
	//   41   84:getfield        #25  <Field SingleSampleMediaPeriod this$0>
	//   42   87:getfield        #101 <Field int SingleSampleMediaPeriod.sampleSize>
	//   43   90:invokevirtual   #118 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//   44   93:pop             
					sendFormat();
	//   45   94:aload_0         
	//   46   95:invokespecial   #120 <Method void sendFormat()>
				} else
	//*  47   98:goto            106
				{
					decoderinputbuffer.addFlag(4);
	//   48  101:aload_2         
	//   49  102:iconst_4        
	//   50  103:invokevirtual   #91  <Method void DecoderInputBuffer.addFlag(int)>
				}
				streamState = 2;
	//   51  106:aload_0         
	//   52  107:iconst_2        
	//   53  108:putfield        #85  <Field int streamState>
				return -4;
	//   54  111:bipush          -4
	//   55  113:ireturn         
			} else
			{
				return -3;
	//   56  114:bipush          -3
	//   57  116:ireturn         
			}
		} else
		{
			formatholder.format = format;
	//   58  117:aload_1         
	//   59  118:aload_0         
	//   60  119:getfield        #25  <Field SingleSampleMediaPeriod this$0>
	//   61  122:getfield        #43  <Field Format SingleSampleMediaPeriod.format>
	//   62  125:putfield        #123 <Field Format FormatHolder.format>
			streamState = 1;
	//   63  128:aload_0         
	//   64  129:iconst_1        
	//   65  130:putfield        #85  <Field int streamState>
			return -5;
	//   66  133:bipush          -5
	//   67  135:ireturn         
		}
	}

	public void reset()
	{
		if(streamState == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field int streamState>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          13
			streamState = 1;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #85  <Field int streamState>
	//    7   13:return          
	}

	public int skipData(long l)
	{
		if(l > 0L && streamState != 2)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifle            25
	//*   4    6:aload_0         
	//*   5    7:getfield        #85  <Field int streamState>
	//*   6   10:iconst_2        
	//*   7   11:icmpeq          25
		{
			streamState = 2;
	//    8   14:aload_0         
	//    9   15:iconst_2        
	//   10   16:putfield        #85  <Field int streamState>
			sendFormat();
	//   11   19:aload_0         
	//   12   20:invokespecial   #120 <Method void sendFormat()>
			return 1;
	//   13   23:iconst_1        
	//   14   24:ireturn         
		} else
		{
			return 0;
	//   15   25:iconst_0        
	//   16   26:ireturn         
		}
	}

	private static final int STREAM_STATE_END_OF_STREAM = 2;
	private static final int STREAM_STATE_SEND_FORMAT = 0;
	private static final int STREAM_STATE_SEND_SAMPLE = 1;
	private boolean formatSent;
	private int streamState;
	final SingleSampleMediaPeriod this$0;

	private SingleSampleMediaPeriod$SampleStreamImpl()
	{
		this$0 = SingleSampleMediaPeriod.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field SingleSampleMediaPeriod this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #28  <Method void Object()>
	//    5    9:return          
	}

	SingleSampleMediaPeriod$SampleStreamImpl(SingleSampleMediaPeriod._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void SingleSampleMediaPeriod$SampleStreamImpl(SingleSampleMediaPeriod)>
	//    3    5:return          
	}
}
