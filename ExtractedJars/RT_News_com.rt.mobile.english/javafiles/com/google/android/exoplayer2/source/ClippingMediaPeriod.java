// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.util.*;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source:
//			MediaPeriod, SampleStream, TrackGroupArray, SequenceableLoader

public final class ClippingMediaPeriod
	implements MediaPeriod, MediaPeriod.Callback
{
	private final class ClippingSampleStream
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

		public ClippingSampleStream(SampleStream samplestream)
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


	public ClippingMediaPeriod(MediaPeriod mediaperiod, boolean flag, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		mediaPeriod = mediaperiod;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field MediaPeriod mediaPeriod>
		sampleStreams = new ClippingSampleStream[0];
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:anewarray       ClippingSampleStream[]
	//    8   14:putfield        #30  <Field ClippingMediaPeriod$ClippingSampleStream[] sampleStreams>
		long l2;
		if(flag)
	//*   9   17:iload_2         
	//*  10   18:ifeq            27
			l2 = l;
	//   11   21:lload_3         
	//   12   22:lstore          7
		else
	//*  13   24:goto            32
			l2 = 0x1L;
	//   14   27:ldc2w           #31  <Long 0x1L>
	//   15   30:lstore          7
		pendingInitialDiscontinuityPositionUs = l2;
	//   16   32:aload_0         
	//   17   33:lload           7
	//   18   35:putfield        #34  <Field long pendingInitialDiscontinuityPositionUs>
		startUs = l;
	//   19   38:aload_0         
	//   20   39:lload_3         
	//   21   40:putfield        #36  <Field long startUs>
		endUs = l1;
	//   22   43:aload_0         
	//   23   44:lload           5
	//   24   46:putfield        #38  <Field long endUs>
	//   25   49:return          
	}

	private SeekParameters clipSeekParameters(long l, SeekParameters seekparameters)
	{
		long l1 = Util.constrainValue(seekparameters.toleranceBeforeUs, 0L, l - startUs);
	//    0    0:aload_3         
	//    1    1:getfield        #46  <Field long SeekParameters.toleranceBeforeUs>
	//    2    4:lconst_0        
	//    3    5:lload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #36  <Field long startUs>
	//    6   10:lsub            
	//    7   11:invokestatic    #52  <Method long Util.constrainValue(long, long, long)>
	//    8   14:lstore          4
		long l2 = seekparameters.toleranceAfterUs;
	//    9   16:aload_3         
	//   10   17:getfield        #55  <Field long SeekParameters.toleranceAfterUs>
	//   11   20:lstore          6
		if(endUs == 0x0L)
	//*  12   22:aload_0         
	//*  13   23:getfield        #38  <Field long endUs>
	//*  14   26:ldc2w           #56  <Long 0x0L>
	//*  15   29:lcmp            
	//*  16   30:ifne            40
			l = 0xffffffffL;
	//   17   33:ldc2w           #58  <Long 0xffffffffL>
	//   18   36:lstore_1        
		else
	//*  19   37:goto            47
			l = endUs - l;
	//   20   40:aload_0         
	//   21   41:getfield        #38  <Field long endUs>
	//   22   44:lload_1         
	//   23   45:lsub            
	//   24   46:lstore_1        
		l = Util.constrainValue(l2, 0L, l);
	//   25   47:lload           6
	//   26   49:lconst_0        
	//   27   50:lload_1         
	//   28   51:invokestatic    #52  <Method long Util.constrainValue(long, long, long)>
	//   29   54:lstore_1        
		if(l1 == seekparameters.toleranceBeforeUs && l == seekparameters.toleranceAfterUs)
	//*  30   55:lload           4
	//*  31   57:aload_3         
	//*  32   58:getfield        #46  <Field long SeekParameters.toleranceBeforeUs>
	//*  33   61:lcmp            
	//*  34   62:ifne            76
	//*  35   65:lload_1         
	//*  36   66:aload_3         
	//*  37   67:getfield        #55  <Field long SeekParameters.toleranceAfterUs>
	//*  38   70:lcmp            
	//*  39   71:ifne            76
			return seekparameters;
	//   40   74:aload_3         
	//   41   75:areturn         
		else
			return new SeekParameters(l1, l);
	//   42   76:new             #43  <Class SeekParameters>
	//   43   79:dup             
	//   44   80:lload           4
	//   45   82:lload_1         
	//   46   83:invokespecial   #62  <Method void SeekParameters(long, long)>
	//   47   86:areturn         
	}

	private static boolean shouldKeepInitialDiscontinuity(long l, TrackSelection atrackselection[])
	{
		if(l != 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifeq            53
		{
			int j = atrackselection.length;
	//    4    6:aload_2         
	//    5    7:arraylength     
	//    6    8:istore          4
			for(int i = 0; i < j; i++)
	//*   7   10:iconst_0        
	//*   8   11:istore_3        
	//*   9   12:iload_3         
	//*  10   13:iload           4
	//*  11   15:icmpge          53
			{
				TrackSelection trackselection = atrackselection[i];
	//   12   18:aload_2         
	//   13   19:iload_3         
	//   14   20:aaload          
	//   15   21:astore          5
				if(trackselection != null && !MimeTypes.isAudio(trackselection.getSelectedFormat().sampleMimeType))
	//*  16   23:aload           5
	//*  17   25:ifnull          46
	//*  18   28:aload           5
	//*  19   30:invokeinterface #70  <Method Format TrackSelection.getSelectedFormat()>
	//*  20   35:getfield        #76  <Field String Format.sampleMimeType>
	//*  21   38:invokestatic    #82  <Method boolean MimeTypes.isAudio(String)>
	//*  22   41:ifne            46
					return true;
	//   23   44:iconst_1        
	//   24   45:ireturn         
			}

	//   25   46:iload_3         
	//   26   47:iconst_1        
	//   27   48:iadd            
	//   28   49:istore_3        
		}
	//*  29   50:goto            12
		return false;
	//   30   53:iconst_0        
	//   31   54:ireturn         
	}

	public boolean continueLoading(long l)
	{
		return mediaPeriod.continueLoading(l);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field MediaPeriod mediaPeriod>
	//    2    4:lload_1         
	//    3    5:invokeinterface #86  <Method boolean MediaPeriod.continueLoading(long)>
	//    4   10:ireturn         
	}

	public void discardBuffer(long l, boolean flag)
	{
		mediaPeriod.discardBuffer(l, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field MediaPeriod mediaPeriod>
	//    2    4:lload_1         
	//    3    5:iload_3         
	//    4    6:invokeinterface #90  <Method void MediaPeriod.discardBuffer(long, boolean)>
	//    5   11:return          
	}

	public long getAdjustedSeekPositionUs(long l, SeekParameters seekparameters)
	{
		if(l == startUs)
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #36  <Field long startUs>
	//*   3    5:lcmp            
	//*   4    6:ifne            14
		{
			return startUs;
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field long startUs>
	//    7   13:lreturn         
		} else
		{
			seekparameters = clipSeekParameters(l, seekparameters);
	//    8   14:aload_0         
	//    9   15:lload_1         
	//   10   16:aload_3         
	//   11   17:invokespecial   #94  <Method SeekParameters clipSeekParameters(long, SeekParameters)>
	//   12   20:astore_3        
			return mediaPeriod.getAdjustedSeekPositionUs(l, seekparameters);
	//   13   21:aload_0         
	//   14   22:getfield        #28  <Field MediaPeriod mediaPeriod>
	//   15   25:lload_1         
	//   16   26:aload_3         
	//   17   27:invokeinterface #96  <Method long MediaPeriod.getAdjustedSeekPositionUs(long, SeekParameters)>
	//   18   32:lreturn         
		}
	}

	public long getBufferedPositionUs()
	{
		long l = mediaPeriod.getBufferedPositionUs();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field MediaPeriod mediaPeriod>
	//    2    4:invokeinterface #100 <Method long MediaPeriod.getBufferedPositionUs()>
	//    3    9:lstore_1        
		if(l != 0x0L)
	//*   4   10:lload_1         
	//*   5   11:ldc2w           #56  <Long 0x0L>
	//*   6   14:lcmp            
	//*   7   15:ifeq            44
		{
			if(endUs != 0x0L && l >= endUs)
	//*   8   18:aload_0         
	//*   9   19:getfield        #38  <Field long endUs>
	//*  10   22:ldc2w           #56  <Long 0x0L>
	//*  11   25:lcmp            
	//*  12   26:ifeq            42
	//*  13   29:lload_1         
	//*  14   30:aload_0         
	//*  15   31:getfield        #38  <Field long endUs>
	//*  16   34:lcmp            
	//*  17   35:iflt            42
				return 0x0L;
	//   18   38:ldc2w           #56  <Long 0x0L>
	//   19   41:lreturn         
			else
				return l;
	//   20   42:lload_1         
	//   21   43:lreturn         
		} else
		{
			return 0x0L;
	//   22   44:ldc2w           #56  <Long 0x0L>
	//   23   47:lreturn         
		}
	}

	public long getNextLoadPositionUs()
	{
		long l = mediaPeriod.getNextLoadPositionUs();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field MediaPeriod mediaPeriod>
	//    2    4:invokeinterface #103 <Method long MediaPeriod.getNextLoadPositionUs()>
	//    3    9:lstore_1        
		if(l != 0x0L)
	//*   4   10:lload_1         
	//*   5   11:ldc2w           #56  <Long 0x0L>
	//*   6   14:lcmp            
	//*   7   15:ifeq            44
		{
			if(endUs != 0x0L && l >= endUs)
	//*   8   18:aload_0         
	//*   9   19:getfield        #38  <Field long endUs>
	//*  10   22:ldc2w           #56  <Long 0x0L>
	//*  11   25:lcmp            
	//*  12   26:ifeq            42
	//*  13   29:lload_1         
	//*  14   30:aload_0         
	//*  15   31:getfield        #38  <Field long endUs>
	//*  16   34:lcmp            
	//*  17   35:iflt            42
				return 0x0L;
	//   18   38:ldc2w           #56  <Long 0x0L>
	//   19   41:lreturn         
			else
				return l;
	//   20   42:lload_1         
	//   21   43:lreturn         
		} else
		{
			return 0x0L;
	//   22   44:ldc2w           #56  <Long 0x0L>
	//   23   47:lreturn         
		}
	}

	public TrackGroupArray getTrackGroups()
	{
		return mediaPeriod.getTrackGroups();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field MediaPeriod mediaPeriod>
	//    2    4:invokeinterface #107 <Method TrackGroupArray MediaPeriod.getTrackGroups()>
	//    3    9:areturn         
	}

	boolean isPendingInitialDiscontinuity()
	{
		return pendingInitialDiscontinuityPositionUs != 0x1L;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field long pendingInitialDiscontinuityPositionUs>
	//    2    4:ldc2w           #31  <Long 0x1L>
	//    3    7:lcmp            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public void maybeThrowPrepareError()
		throws IOException
	{
		mediaPeriod.maybeThrowPrepareError();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field MediaPeriod mediaPeriod>
	//    2    4:invokeinterface #114 <Method void MediaPeriod.maybeThrowPrepareError()>
	//    3    9:return          
	}

	public void onContinueLoadingRequested(MediaPeriod mediaperiod)
	{
		callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaPeriod$Callback callback>
	//    2    4:aload_0         
	//    3    5:invokeinterface #122 <Method void MediaPeriod$Callback.onContinueLoadingRequested(SequenceableLoader)>
	//    4   10:return          
	}

	public volatile void onContinueLoadingRequested(SequenceableLoader sequenceableloader)
	{
		onContinueLoadingRequested((MediaPeriod)sequenceableloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #6   <Class MediaPeriod>
	//    3    5:invokevirtual   #124 <Method void onContinueLoadingRequested(MediaPeriod)>
	//    4    8:return          
	}

	public void onPrepared(MediaPeriod mediaperiod)
	{
		callback.onPrepared(((MediaPeriod) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaPeriod$Callback callback>
	//    2    4:aload_0         
	//    3    5:invokeinterface #127 <Method void MediaPeriod$Callback.onPrepared(MediaPeriod)>
	//    4   10:return          
	}

	public void prepare(MediaPeriod.Callback callback1, long l)
	{
		callback = callback1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #119 <Field MediaPeriod$Callback callback>
		mediaPeriod.prepare(((MediaPeriod.Callback) (this)), l);
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field MediaPeriod mediaPeriod>
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:invokeinterface #131 <Method void MediaPeriod.prepare(MediaPeriod$Callback, long)>
	//    8   16:return          
	}

	public long readDiscontinuity()
	{
		long l1;
		boolean flag;
label0:
		{
			if(isPendingInitialDiscontinuity())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #134 <Method boolean isPendingInitialDiscontinuity()>
	//*   2    4:ifeq            36
			{
				long l = pendingInitialDiscontinuityPositionUs;
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field long pendingInitialDiscontinuityPositionUs>
	//    5   11:lstore_1        
				pendingInitialDiscontinuityPositionUs = 0x1L;
	//    6   12:aload_0         
	//    7   13:ldc2w           #31  <Long 0x1L>
	//    8   16:putfield        #34  <Field long pendingInitialDiscontinuityPositionUs>
				long l2 = readDiscontinuity();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #136 <Method long readDiscontinuity()>
	//   11   23:lstore_3        
				if(l2 != 0x1L)
	//*  12   24:lload_3         
	//*  13   25:ldc2w           #31  <Long 0x1L>
	//*  14   28:lcmp            
	//*  15   29:ifeq            34
					l = l2;
	//   16   32:lload_3         
	//   17   33:lstore_1        
				return l;
	//   18   34:lload_1         
	//   19   35:lreturn         
			}
			l1 = mediaPeriod.readDiscontinuity();
	//   20   36:aload_0         
	//   21   37:getfield        #28  <Field MediaPeriod mediaPeriod>
	//   22   40:invokeinterface #137 <Method long MediaPeriod.readDiscontinuity()>
	//   23   45:lstore_1        
			if(l1 == 0x1L)
	//*  24   46:lload_1         
	//*  25   47:ldc2w           #31  <Long 0x1L>
	//*  26   50:lcmp            
	//*  27   51:ifne            58
				return 0x1L;
	//   28   54:ldc2w           #31  <Long 0x1L>
	//   29   57:lreturn         
			long l3 = startUs;
	//   30   58:aload_0         
	//   31   59:getfield        #36  <Field long startUs>
	//   32   62:lstore_3        
			boolean flag1 = false;
	//   33   63:iconst_0        
	//   34   64:istore          6
			if(l1 >= l3)
	//*  35   66:lload_1         
	//*  36   67:lload_3         
	//*  37   68:lcmp            
	//*  38   69:iflt            78
				flag = true;
	//   39   72:iconst_1        
	//   40   73:istore          5
			else
	//*  41   75:goto            81
				flag = false;
	//   42   78:iconst_0        
	//   43   79:istore          5
			Assertions.checkState(flag);
	//   44   81:iload           5
	//   45   83:invokestatic    #143 <Method void Assertions.checkState(boolean)>
			if(endUs != 0x0L)
	//*  46   86:aload_0         
	//*  47   87:getfield        #38  <Field long endUs>
	//*  48   90:ldc2w           #56  <Long 0x0L>
	//*  49   93:lcmp            
	//*  50   94:ifeq            110
			{
				flag = flag1;
	//   51   97:iload           6
	//   52   99:istore          5
				if(l1 > endUs)
					break label0;
	//   53  101:lload_1         
	//   54  102:aload_0         
	//   55  103:getfield        #38  <Field long endUs>
	//   56  106:lcmp            
	//   57  107:ifgt            113
			}
			flag = true;
	//   58  110:iconst_1        
	//   59  111:istore          5
		}
		Assertions.checkState(flag);
	//   60  113:iload           5
	//   61  115:invokestatic    #143 <Method void Assertions.checkState(boolean)>
		return l1;
	//   62  118:lload_1         
	//   63  119:lreturn         
	}

	public void reevaluateBuffer(long l)
	{
		mediaPeriod.reevaluateBuffer(l);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field MediaPeriod mediaPeriod>
	//    2    4:lload_1         
	//    3    5:invokeinterface #147 <Method void MediaPeriod.reevaluateBuffer(long)>
	//    4   10:return          
	}

	public long seekToUs(long l)
	{
		long l1;
		boolean flag;
label0:
		{
			pendingInitialDiscontinuityPositionUs = 0x1L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #31  <Long 0x1L>
	//    2    4:putfield        #34  <Field long pendingInitialDiscontinuityPositionUs>
			ClippingSampleStream aclippingsamplestream[] = sampleStreams;
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field ClippingMediaPeriod$ClippingSampleStream[] sampleStreams>
	//    5   11:astore          9
			boolean flag1 = false;
	//    6   13:iconst_0        
	//    7   14:istore          8
			int j = aclippingsamplestream.length;
	//    8   16:aload           9
	//    9   18:arraylength     
	//   10   19:istore          4
			for(int i = 0; i < j; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_3        
	//*  13   23:iload_3         
	//*  14   24:iload           4
	//*  15   26:icmpge          52
			{
				ClippingSampleStream clippingsamplestream = aclippingsamplestream[i];
	//   16   29:aload           9
	//   17   31:iload_3         
	//   18   32:aaload          
	//   19   33:astore          10
				if(clippingsamplestream != null)
	//*  20   35:aload           10
	//*  21   37:ifnull          45
					clippingsamplestream.clearSentEos();
	//   22   40:aload           10
	//   23   42:invokevirtual   #152 <Method void ClippingMediaPeriod$ClippingSampleStream.clearSentEos()>
			}

	//   24   45:iload_3         
	//   25   46:iconst_1        
	//   26   47:iadd            
	//   27   48:istore_3        
	//*  28   49:goto            23
			l1 = mediaPeriod.seekToUs(l);
	//   29   52:aload_0         
	//   30   53:getfield        #28  <Field MediaPeriod mediaPeriod>
	//   31   56:lload_1         
	//   32   57:invokeinterface #154 <Method long MediaPeriod.seekToUs(long)>
	//   33   62:lstore          5
			if(l1 != l)
	//*  34   64:lload           5
	//*  35   66:lload_1         
	//*  36   67:lcmp            
	//*  37   68:ifeq            110
			{
				flag = flag1;
	//   38   71:iload           8
	//   39   73:istore          7
				if(l1 < startUs)
					break label0;
	//   40   75:lload           5
	//   41   77:aload_0         
	//   42   78:getfield        #36  <Field long startUs>
	//   43   81:lcmp            
	//   44   82:iflt            113
				if(endUs != 0x0L)
	//*  45   85:aload_0         
	//*  46   86:getfield        #38  <Field long endUs>
	//*  47   89:ldc2w           #56  <Long 0x0L>
	//*  48   92:lcmp            
	//*  49   93:ifeq            110
				{
					flag = flag1;
	//   50   96:iload           8
	//   51   98:istore          7
					if(l1 > endUs)
						break label0;
	//   52  100:lload           5
	//   53  102:aload_0         
	//   54  103:getfield        #38  <Field long endUs>
	//   55  106:lcmp            
	//   56  107:ifgt            113
				}
			}
			flag = true;
	//   57  110:iconst_1        
	//   58  111:istore          7
		}
		Assertions.checkState(flag);
	//   59  113:iload           7
	//   60  115:invokestatic    #143 <Method void Assertions.checkState(boolean)>
		return l1;
	//   61  118:lload           5
	//   62  120:lreturn         
	}

	public long selectTracks(TrackSelection atrackselection[], boolean aflag[], SampleStream asamplestream[], boolean aflag1[], long l)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          8
		sampleStreams = new ClippingSampleStream[asamplestream.length];
	//    2    3:aload_0         
	//    3    4:aload_3         
	//    4    5:arraylength     
	//    5    6:anewarray       ClippingSampleStream[]
	//    6    9:putfield        #30  <Field ClippingMediaPeriod$ClippingSampleStream[] sampleStreams>
		SampleStream asamplestream1[] = new SampleStream[asamplestream.length];
	//    7   12:aload_3         
	//    8   13:arraylength     
	//    9   14:anewarray       SampleStream[]
	//   10   17:astore          15
		int i = 0;
	//   11   19:iconst_0        
	//   12   20:istore          7
		do
		{
			SampleStream samplestream = null;
	//   13   22:aconst_null     
	//   14   23:astore          14
			if(i >= asamplestream.length)
				break;
	//   15   25:iload           7
	//   16   27:aload_3         
	//   17   28:arraylength     
	//   18   29:icmpge          84
			sampleStreams[i] = (ClippingSampleStream)asamplestream[i];
	//   19   32:aload_0         
	//   20   33:getfield        #30  <Field ClippingMediaPeriod$ClippingSampleStream[] sampleStreams>
	//   21   36:iload           7
	//   22   38:aload_3         
	//   23   39:iload           7
	//   24   41:aaload          
	//   25   42:checkcast       #10  <Class ClippingMediaPeriod$ClippingSampleStream>
	//   26   45:aastore         
			if(sampleStreams[i] != null)
	//*  27   46:aload_0         
	//*  28   47:getfield        #30  <Field ClippingMediaPeriod$ClippingSampleStream[] sampleStreams>
	//*  29   50:iload           7
	//*  30   52:aaload          
	//*  31   53:ifnull          68
				samplestream = sampleStreams[i].childStream;
	//   32   56:aload_0         
	//   33   57:getfield        #30  <Field ClippingMediaPeriod$ClippingSampleStream[] sampleStreams>
	//   34   60:iload           7
	//   35   62:aaload          
	//   36   63:getfield        #162 <Field SampleStream ClippingMediaPeriod$ClippingSampleStream.childStream>
	//   37   66:astore          14
			asamplestream1[i] = samplestream;
	//   38   68:aload           15
	//   39   70:iload           7
	//   40   72:aload           14
	//   41   74:aastore         
			i++;
	//   42   75:iload           7
	//   43   77:iconst_1        
	//   44   78:iadd            
	//   45   79:istore          7
		} while(true);
	//   46   81:goto            22
		long l2 = mediaPeriod.selectTracks(atrackselection, aflag, asamplestream1, aflag1, l);
	//   47   84:aload_0         
	//   48   85:getfield        #28  <Field MediaPeriod mediaPeriod>
	//   49   88:aload_1         
	//   50   89:aload_2         
	//   51   90:aload           15
	//   52   92:aload           4
	//   53   94:lload           5
	//   54   96:invokeinterface #164 <Method long MediaPeriod.selectTracks(TrackSelection[], boolean[], SampleStream[], boolean[], long)>
	//   55  101:lstore          11
		long l1;
		if(isPendingInitialDiscontinuity() && l == startUs && shouldKeepInitialDiscontinuity(startUs, atrackselection))
	//*  56  103:aload_0         
	//*  57  104:invokevirtual   #134 <Method boolean isPendingInitialDiscontinuity()>
	//*  58  107:ifeq            138
	//*  59  110:lload           5
	//*  60  112:aload_0         
	//*  61  113:getfield        #36  <Field long startUs>
	//*  62  116:lcmp            
	//*  63  117:ifne            138
	//*  64  120:aload_0         
	//*  65  121:getfield        #36  <Field long startUs>
	//*  66  124:aload_1         
	//*  67  125:invokestatic    #166 <Method boolean shouldKeepInitialDiscontinuity(long, TrackSelection[])>
	//*  68  128:ifeq            138
			l1 = l2;
	//   69  131:lload           11
	//   70  133:lstore          9
		else
	//*  71  135:goto            143
			l1 = 0x1L;
	//   72  138:ldc2w           #31  <Long 0x1L>
	//   73  141:lstore          9
		pendingInitialDiscontinuityPositionUs = l1;
	//   74  143:aload_0         
	//   75  144:lload           9
	//   76  146:putfield        #34  <Field long pendingInitialDiscontinuityPositionUs>
		boolean flag1;
		if(l2 != l && (l2 < startUs || endUs != 0x0L && l2 > endUs))
	//*  77  149:lload           11
	//*  78  151:lload           5
	//*  79  153:lcmp            
	//*  80  154:ifeq            197
	//*  81  157:lload           11
	//*  82  159:aload_0         
	//*  83  160:getfield        #36  <Field long startUs>
	//*  84  163:lcmp            
	//*  85  164:iflt            191
	//*  86  167:aload_0         
	//*  87  168:getfield        #38  <Field long endUs>
	//*  88  171:ldc2w           #56  <Long 0x0L>
	//*  89  174:lcmp            
	//*  90  175:ifeq            197
	//*  91  178:lload           11
	//*  92  180:aload_0         
	//*  93  181:getfield        #38  <Field long endUs>
	//*  94  184:lcmp            
	//*  95  185:ifgt            191
	//*  96  188:goto            197
			flag1 = false;
	//   97  191:iconst_0        
	//   98  192:istore          13
		else
	//*  99  194:goto            200
			flag1 = true;
	//  100  197:iconst_1        
	//  101  198:istore          13
		Assertions.checkState(flag1);
	//  102  200:iload           13
	//  103  202:invokestatic    #143 <Method void Assertions.checkState(boolean)>
		for(int j = ((int) (flag)); j < asamplestream.length; j++)
	//* 104  205:iload           8
	//* 105  207:istore          7
	//* 106  209:iload           7
	//* 107  211:aload_3         
	//* 108  212:arraylength     
	//* 109  213:icmpge          300
		{
			if(asamplestream1[j] == null)
	//* 110  216:aload           15
	//* 111  218:iload           7
	//* 112  220:aaload          
	//* 113  221:ifnonnull       235
				sampleStreams[j] = null;
	//  114  224:aload_0         
	//  115  225:getfield        #30  <Field ClippingMediaPeriod$ClippingSampleStream[] sampleStreams>
	//  116  228:iload           7
	//  117  230:aconst_null     
	//  118  231:aastore         
			else
	//* 119  232:goto            280
			if(asamplestream[j] == null || sampleStreams[j].childStream != asamplestream1[j])
	//* 120  235:aload_3         
	//* 121  236:iload           7
	//* 122  238:aaload          
	//* 123  239:ifnull          260
	//* 124  242:aload_0         
	//* 125  243:getfield        #30  <Field ClippingMediaPeriod$ClippingSampleStream[] sampleStreams>
	//* 126  246:iload           7
	//* 127  248:aaload          
	//* 128  249:getfield        #162 <Field SampleStream ClippingMediaPeriod$ClippingSampleStream.childStream>
	//* 129  252:aload           15
	//* 130  254:iload           7
	//* 131  256:aaload          
	//* 132  257:if_acmpeq       280
				sampleStreams[j] = new ClippingSampleStream(asamplestream1[j]);
	//  133  260:aload_0         
	//  134  261:getfield        #30  <Field ClippingMediaPeriod$ClippingSampleStream[] sampleStreams>
	//  135  264:iload           7
	//  136  266:new             #10  <Class ClippingMediaPeriod$ClippingSampleStream>
	//  137  269:dup             
	//  138  270:aload_0         
	//  139  271:aload           15
	//  140  273:iload           7
	//  141  275:aaload          
	//  142  276:invokespecial   #169 <Method void ClippingMediaPeriod$ClippingSampleStream(ClippingMediaPeriod, SampleStream)>
	//  143  279:aastore         
			asamplestream[j] = ((SampleStream) (sampleStreams[j]));
	//  144  280:aload_3         
	//  145  281:iload           7
	//  146  283:aload_0         
	//  147  284:getfield        #30  <Field ClippingMediaPeriod$ClippingSampleStream[] sampleStreams>
	//  148  287:iload           7
	//  149  289:aaload          
	//  150  290:aastore         
		}

	//  151  291:iload           7
	//  152  293:iconst_1        
	//  153  294:iadd            
	//  154  295:istore          7
	//* 155  297:goto            209
		return l2;
	//  156  300:lload           11
	//  157  302:lreturn         
	}

	public void updateClipping(long l, long l1)
	{
		startUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #36  <Field long startUs>
		endUs = l1;
	//    3    5:aload_0         
	//    4    6:lload_3         
	//    5    7:putfield        #38  <Field long endUs>
	//    6   10:return          
	}

	private MediaPeriod.Callback callback;
	long endUs;
	public final MediaPeriod mediaPeriod;
	private long pendingInitialDiscontinuityPositionUs;
	private ClippingSampleStream sampleStreams[];
	long startUs;
}
