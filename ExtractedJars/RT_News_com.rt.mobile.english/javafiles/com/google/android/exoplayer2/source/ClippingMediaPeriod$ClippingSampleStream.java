// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source:
//			SampleStream, ClippingMediaPeriod

private final class ClippingMediaPeriod$ClippingSampleStream
	implements SampleStream
{

	public void clearSentEos()
	{
		sentEos = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #28  <Field boolean sentEos>
	//    3    5:return          
	}

	public boolean isReady()
	{
		return !isPendingInitialDiscontinuity() && childStream.isReady();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ClippingMediaPeriod this$0>
	//    2    4:invokevirtual   #33  <Method boolean ClippingMediaPeriod.isPendingInitialDiscontinuity()>
	//    3    7:ifne            24
	//    4   10:aload_0         
	//    5   11:getfield        #24  <Field SampleStream childStream>
	//    6   14:invokeinterface #35  <Method boolean SampleStream.isReady()>
	//    7   19:ifeq            24
	//    8   22:iconst_1        
	//    9   23:ireturn         
	//   10   24:iconst_0        
	//   11   25:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
		childStream.maybeThrowError();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field SampleStream childStream>
	//    2    4:invokeinterface #40  <Method void SampleStream.maybeThrowError()>
	//    3    9:return          
	}

	public int readData(FormatHolder formatholder, DecoderInputBuffer decoderinputbuffer, boolean flag)
	{
		if(isPendingInitialDiscontinuity())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ClippingMediaPeriod this$0>
	//*   2    4:invokevirtual   #33  <Method boolean ClippingMediaPeriod.isPendingInitialDiscontinuity()>
	//*   3    7:ifeq            13
			return -3;
	//    4   10:bipush          -3
	//    5   12:ireturn         
		if(sentEos)
	//*   6   13:aload_0         
	//*   7   14:getfield        #28  <Field boolean sentEos>
	//*   8   17:ifeq            28
		{
			decoderinputbuffer.setFlags(4);
	//    9   20:aload_2         
	//   10   21:iconst_4        
	//   11   22:invokevirtual   #49  <Method void DecoderInputBuffer.setFlags(int)>
			return -4;
	//   12   25:bipush          -4
	//   13   27:ireturn         
		}
		int i = childStream.readData(formatholder, decoderinputbuffer, flag);
	//   14   28:aload_0         
	//   15   29:getfield        #24  <Field SampleStream childStream>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:iload_3         
	//   19   35:invokeinterface #51  <Method int SampleStream.readData(FormatHolder, DecoderInputBuffer, boolean)>
	//   20   40:istore          4
		if(i == -5)
	//*  21   42:iload           4
	//*  22   44:bipush          -5
	//*  23   46:icmpne          137
		{
			decoderinputbuffer = ((DecoderInputBuffer) (formatholder.format));
	//   24   49:aload_1         
	//   25   50:getfield        #57  <Field Format FormatHolder.format>
	//   26   53:astore_2        
			if(((Format) (decoderinputbuffer)).encoderDelay != 0 || ((Format) (decoderinputbuffer)).encoderPadding != 0)
	//*  27   54:aload_2         
	//*  28   55:getfield        #63  <Field int Format.encoderDelay>
	//*  29   58:ifne            68
	//*  30   61:aload_2         
	//*  31   62:getfield        #66  <Field int Format.encoderPadding>
	//*  32   65:ifeq            134
			{
				long l = startUs;
	//   33   68:aload_0         
	//   34   69:getfield        #19  <Field ClippingMediaPeriod this$0>
	//   35   72:getfield        #70  <Field long ClippingMediaPeriod.startUs>
	//   36   75:lstore          6
				int j = 0;
	//   37   77:iconst_0        
	//   38   78:istore          5
				if(l != 0L)
	//*  39   80:lload           6
	//*  40   82:lconst_0        
	//*  41   83:lcmp            
	//*  42   84:ifeq            93
					i = 0;
	//   43   87:iconst_0        
	//   44   88:istore          4
				else
	//*  45   90:goto            99
					i = ((Format) (decoderinputbuffer)).encoderDelay;
	//   46   93:aload_2         
	//   47   94:getfield        #63  <Field int Format.encoderDelay>
	//   48   97:istore          4
				if(endUs == 0x0L)
	//*  49   99:aload_0         
	//*  50  100:getfield        #19  <Field ClippingMediaPeriod this$0>
	//*  51  103:getfield        #73  <Field long ClippingMediaPeriod.endUs>
	//*  52  106:ldc2w           #74  <Long 0x0L>
	//*  53  109:lcmp            
	//*  54  110:ifeq            116
	//*  55  113:goto            122
					j = ((Format) (decoderinputbuffer)).encoderPadding;
	//   56  116:aload_2         
	//   57  117:getfield        #66  <Field int Format.encoderPadding>
	//   58  120:istore          5
				formatholder.format = ((Format) (decoderinputbuffer)).copyWithGaplessInfo(i, j);
	//   59  122:aload_1         
	//   60  123:aload_2         
	//   61  124:iload           4
	//   62  126:iload           5
	//   63  128:invokevirtual   #79  <Method Format Format.copyWithGaplessInfo(int, int)>
	//   64  131:putfield        #57  <Field Format FormatHolder.format>
			}
			return -5;
	//   65  134:bipush          -5
	//   66  136:ireturn         
		}
		if(endUs != 0x0L && (i == -4 && decoderinputbuffer.timeUs >= endUs || i == -3 && getBufferedPositionUs() == 0x0L))
	//*  67  137:aload_0         
	//*  68  138:getfield        #19  <Field ClippingMediaPeriod this$0>
	//*  69  141:getfield        #73  <Field long ClippingMediaPeriod.endUs>
	//*  70  144:ldc2w           #74  <Long 0x0L>
	//*  71  147:lcmp            
	//*  72  148:ifeq            211
	//*  73  151:iload           4
	//*  74  153:bipush          -4
	//*  75  155:icmpne          173
	//*  76  158:aload_2         
	//*  77  159:getfield        #82  <Field long DecoderInputBuffer.timeUs>
	//*  78  162:aload_0         
	//*  79  163:getfield        #19  <Field ClippingMediaPeriod this$0>
	//*  80  166:getfield        #73  <Field long ClippingMediaPeriod.endUs>
	//*  81  169:lcmp            
	//*  82  170:ifge            194
	//*  83  173:iload           4
	//*  84  175:bipush          -3
	//*  85  177:icmpne          211
	//*  86  180:aload_0         
	//*  87  181:getfield        #19  <Field ClippingMediaPeriod this$0>
	//*  88  184:invokevirtual   #86  <Method long ClippingMediaPeriod.getBufferedPositionUs()>
	//*  89  187:ldc2w           #74  <Long 0x0L>
	//*  90  190:lcmp            
	//*  91  191:ifne            211
		{
			decoderinputbuffer.clear();
	//   92  194:aload_2         
	//   93  195:invokevirtual   #89  <Method void DecoderInputBuffer.clear()>
			decoderinputbuffer.setFlags(4);
	//   94  198:aload_2         
	//   95  199:iconst_4        
	//   96  200:invokevirtual   #49  <Method void DecoderInputBuffer.setFlags(int)>
			sentEos = true;
	//   97  203:aload_0         
	//   98  204:iconst_1        
	//   99  205:putfield        #28  <Field boolean sentEos>
			return -4;
	//  100  208:bipush          -4
	//  101  210:ireturn         
		} else
		{
			return i;
	//  102  211:iload           4
	//  103  213:ireturn         
		}
	}

	public int skipData(long l)
	{
		if(isPendingInitialDiscontinuity())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ClippingMediaPeriod this$0>
	//*   2    4:invokevirtual   #33  <Method boolean ClippingMediaPeriod.isPendingInitialDiscontinuity()>
	//*   3    7:ifeq            13
			return -3;
	//    4   10:bipush          -3
	//    5   12:ireturn         
		else
			return childStream.skipData(l);
	//    6   13:aload_0         
	//    7   14:getfield        #24  <Field SampleStream childStream>
	//    8   17:lload_1         
	//    9   18:invokeinterface #93  <Method int SampleStream.skipData(long)>
	//   10   23:ireturn         
	}

	public final SampleStream childStream;
	private boolean sentEos;
	final ClippingMediaPeriod this$0;

	public ClippingMediaPeriod$ClippingSampleStream(SampleStream samplestream)
	{
		this$0 = ClippingMediaPeriod.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ClippingMediaPeriod this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		childStream = samplestream;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field SampleStream childStream>
	//    8   14:return          
	}
}
