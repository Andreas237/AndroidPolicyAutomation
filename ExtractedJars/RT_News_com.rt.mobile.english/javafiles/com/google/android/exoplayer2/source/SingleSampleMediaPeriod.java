// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.*;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.source:
//			MediaPeriod, TrackGroupArray, TrackGroup, SampleStream

final class SingleSampleMediaPeriod
	implements MediaPeriod, com.google.android.exoplayer2.upstream.Loader.Callback
{
	private final class SampleStreamImpl
		implements SampleStream
	{

		private void sendFormat()
		{
			if(!formatSent)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field boolean formatSent>
		//*   2    4:ifne            45
			{
				eventDispatcher.downstreamFormatChanged(MimeTypes.getTrackType(format.sampleMimeType), format, 0, ((Object) (null)), 0L);
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

		private SampleStreamImpl()
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

	}

	static final class SourceLoadable
		implements com.google.android.exoplayer2.upstream.Loader.Loadable
	{

		public void cancelLoad()
		{
		//    0    0:return          
		}

		public void load()
			throws IOException, InterruptedException
		{
			int i;
			i = 0;
		//    0    0:iconst_0        
		//    1    1:istore_1        
			sampleSize = 0;
		//    2    2:aload_0         
		//    3    3:iconst_0        
		//    4    4:putfield        #31  <Field int sampleSize>
			dataSource.open(dataSpec);
		//    5    7:aload_0         
		//    6    8:getfield        #26  <Field DataSource dataSource>
		//    7   11:aload_0         
		//    8   12:getfield        #24  <Field DataSpec dataSpec>
		//    9   15:invokeinterface #47  <Method long DataSource.open(DataSpec)>
		//   10   20:pop2            
_L2:
			if(i == -1)
				break; /* Loop/switch isn't completed */
		//   11   21:iload_1         
		//   12   22:iconst_m1       
		//   13   23:icmpeq          116
			sampleSize = sampleSize + i;
		//   14   26:aload_0         
		//   15   27:aload_0         
		//   16   28:getfield        #31  <Field int sampleSize>
		//   17   31:iload_1         
		//   18   32:iadd            
		//   19   33:putfield        #31  <Field int sampleSize>
			if(sampleData == null)
		//*  20   36:aload_0         
		//*  21   37:getfield        #35  <Field byte[] sampleData>
		//*  22   40:ifnonnull       55
			{
				sampleData = new byte[1024];
		//   23   43:aload_0         
		//   24   44:sipush          1024
		//   25   47:newarray        byte[]
		//   26   49:putfield        #35  <Field byte[] sampleData>
				break MISSING_BLOCK_LABEL_85;
		//   27   52:goto            85
			}
			if(sampleSize == sampleData.length)
		//*  28   55:aload_0         
		//*  29   56:getfield        #31  <Field int sampleSize>
		//*  30   59:aload_0         
		//*  31   60:getfield        #35  <Field byte[] sampleData>
		//*  32   63:arraylength     
		//*  33   64:icmpne          85
				sampleData = Arrays.copyOf(sampleData, sampleData.length * 2);
		//   34   67:aload_0         
		//   35   68:aload_0         
		//   36   69:getfield        #35  <Field byte[] sampleData>
		//   37   72:aload_0         
		//   38   73:getfield        #35  <Field byte[] sampleData>
		//   39   76:arraylength     
		//   40   77:iconst_2        
		//   41   78:imul            
		//   42   79:invokestatic    #53  <Method byte[] Arrays.copyOf(byte[], int)>
		//   43   82:putfield        #35  <Field byte[] sampleData>
			i = dataSource.read(sampleData, sampleSize, sampleData.length - sampleSize);
		//   44   85:aload_0         
		//   45   86:getfield        #26  <Field DataSource dataSource>
		//   46   89:aload_0         
		//   47   90:getfield        #35  <Field byte[] sampleData>
		//   48   93:aload_0         
		//   49   94:getfield        #31  <Field int sampleSize>
		//   50   97:aload_0         
		//   51   98:getfield        #35  <Field byte[] sampleData>
		//   52  101:arraylength     
		//   53  102:aload_0         
		//   54  103:getfield        #31  <Field int sampleSize>
		//   55  106:isub            
		//   56  107:invokeinterface #57  <Method int DataSource.read(byte[], int, int)>
		//   57  112:istore_1        
			if(true) goto _L2; else goto _L1
		//   58  113:goto            21
_L1:
			Util.closeQuietly(dataSource);
		//   59  116:aload_0         
		//   60  117:getfield        #26  <Field DataSource dataSource>
		//   61  120:invokestatic    #63  <Method void Util.closeQuietly(DataSource)>
			return;
		//   62  123:return          
			Exception exception;
			exception;
		//   63  124:astore_2        
			Util.closeQuietly(dataSource);
		//   64  125:aload_0         
		//   65  126:getfield        #26  <Field DataSource dataSource>
		//   66  129:invokestatic    #63  <Method void Util.closeQuietly(DataSource)>
			throw exception;
		//   67  132:aload_2         
		//   68  133:athrow          
		}

		private final DataSource dataSource;
		public final DataSpec dataSpec;
		private byte sampleData[];
		private int sampleSize;


/*
		static int access$100(SourceLoadable sourceloadable)
		{
			return sourceloadable.sampleSize;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field int sampleSize>
		//    2    4:ireturn         
		}

*/


/*
		static byte[] access$200(SourceLoadable sourceloadable)
		{
			return sourceloadable.sampleData;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field byte[] sampleData>
		//    2    4:areturn         
		}

*/

		public SourceLoadable(DataSpec dataspec, DataSource datasource)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			dataSpec = dataspec;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field DataSpec dataSpec>
			dataSource = datasource;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field DataSource dataSource>
		//    8   14:return          
		}
	}


	public SingleSampleMediaPeriod(DataSpec dataspec, com.google.android.exoplayer2.upstream.DataSource.Factory factory, Format format1, long l, int i, MediaSourceEventListener.EventDispatcher eventdispatcher, 
			boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
		dataSpec = dataspec;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #54  <Field DataSpec dataSpec>
		dataSourceFactory = factory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #56  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
		format = format1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #58  <Field Format format>
		durationUs = l;
	//   11   19:aload_0         
	//   12   20:lload           4
	//   13   22:putfield        #60  <Field long durationUs>
		minLoadableRetryCount = i;
	//   14   25:aload_0         
	//   15   26:iload           6
	//   16   28:putfield        #62  <Field int minLoadableRetryCount>
		eventDispatcher = eventdispatcher;
	//   17   31:aload_0         
	//   18   32:aload           7
	//   19   34:putfield        #64  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
		treatLoadErrorsAsEndOfStream = flag;
	//   20   37:aload_0         
	//   21   38:iload           8
	//   22   40:putfield        #66  <Field boolean treatLoadErrorsAsEndOfStream>
		tracks = new TrackGroupArray(new TrackGroup[] {
			new TrackGroup(new Format[] {
				format1
			})
		});
	//   23   43:aload_0         
	//   24   44:new             #68  <Class TrackGroupArray>
	//   25   47:dup             
	//   26   48:iconst_1        
	//   27   49:anewarray       TrackGroup[]
	//   28   52:dup             
	//   29   53:iconst_0        
	//   30   54:new             #70  <Class TrackGroup>
	//   31   57:dup             
	//   32   58:iconst_1        
	//   33   59:anewarray       Format[]
	//   34   62:dup             
	//   35   63:iconst_0        
	//   36   64:aload_3         
	//   37   65:aastore         
	//   38   66:invokespecial   #75  <Method void TrackGroup(Format[])>
	//   39   69:aastore         
	//   40   70:invokespecial   #78  <Method void TrackGroupArray(TrackGroup[])>
	//   41   73:putfield        #80  <Field TrackGroupArray tracks>
	//   42   76:aload_0         
	//   43   77:new             #82  <Class ArrayList>
	//   44   80:dup             
	//   45   81:invokespecial   #83  <Method void ArrayList()>
	//   46   84:putfield        #85  <Field ArrayList sampleStreams>
	//   47   87:aload_0         
	//   48   88:new             #87  <Class Loader>
	//   49   91:dup             
	//   50   92:ldc1            #89  <String "Loader:SingleSampleMediaPeriod">
	//   51   94:invokespecial   #92  <Method void Loader(String)>
	//   52   97:putfield        #94  <Field Loader loader>
		eventdispatcher.mediaPeriodCreated();
	//   53  100:aload           7
	//   54  102:invokevirtual   #99  <Method void MediaSourceEventListener$EventDispatcher.mediaPeriodCreated()>
	//   55  105:return          
	}

	public boolean continueLoading(long l)
	{
		if(!loadingFinished && !loader.isLoading())
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field boolean loadingFinished>
	//*   2    4:ifne            80
	//*   3    7:aload_0         
	//*   4    8:getfield        #94  <Field Loader loader>
	//*   5   11:invokevirtual   #110 <Method boolean Loader.isLoading()>
	//*   6   14:ifeq            20
	//*   7   17:goto            80
		{
			l = loader.startLoading(((com.google.android.exoplayer2.upstream.Loader.Loadable) (new SourceLoadable(dataSpec, dataSourceFactory.createDataSource()))), ((com.google.android.exoplayer2.upstream.Loader.Callback) (this)), minLoadableRetryCount);
	//    8   20:aload_0         
	//    9   21:getfield        #94  <Field Loader loader>
	//   10   24:new             #16  <Class SingleSampleMediaPeriod$SourceLoadable>
	//   11   27:dup             
	//   12   28:aload_0         
	//   13   29:getfield        #54  <Field DataSpec dataSpec>
	//   14   32:aload_0         
	//   15   33:getfield        #56  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
	//   16   36:invokeinterface #116 <Method DataSource com.google.android.exoplayer2.upstream.DataSource$Factory.createDataSource()>
	//   17   41:invokespecial   #119 <Method void SingleSampleMediaPeriod$SourceLoadable(DataSpec, DataSource)>
	//   18   44:aload_0         
	//   19   45:aload_0         
	//   20   46:getfield        #62  <Field int minLoadableRetryCount>
	//   21   49:invokevirtual   #123 <Method long Loader.startLoading(com.google.android.exoplayer2.upstream.Loader$Loadable, com.google.android.exoplayer2.upstream.Loader$Callback, int)>
	//   22   52:lstore_1        
			eventDispatcher.loadStarted(dataSpec, 1, -1, format, 0, ((Object) (null)), 0L, durationUs, l);
	//   23   53:aload_0         
	//   24   54:getfield        #64  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   25   57:aload_0         
	//   26   58:getfield        #54  <Field DataSpec dataSpec>
	//   27   61:iconst_1        
	//   28   62:iconst_m1       
	//   29   63:aload_0         
	//   30   64:getfield        #58  <Field Format format>
	//   31   67:iconst_0        
	//   32   68:aconst_null     
	//   33   69:lconst_0        
	//   34   70:aload_0         
	//   35   71:getfield        #60  <Field long durationUs>
	//   36   74:lload_1         
	//   37   75:invokevirtual   #127 <Method void MediaSourceEventListener$EventDispatcher.loadStarted(DataSpec, int, int, Format, int, Object, long, long, long)>
			return true;
	//   38   78:iconst_1        
	//   39   79:ireturn         
		} else
		{
			return false;
	//   40   80:iconst_0        
	//   41   81:ireturn         
		}
	}

	public void discardBuffer(long l, boolean flag)
	{
	//    0    0:return          
	}

	public long getAdjustedSeekPositionUs(long l, SeekParameters seekparameters)
	{
		return l;
	//    0    0:lload_1         
	//    1    1:lreturn         
	}

	public long getBufferedPositionUs()
	{
		return !loadingFinished ? 0L : 0x0L;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field boolean loadingFinished>
	//    2    4:ifeq            11
	//    3    7:ldc2w           #134 <Long 0x0L>
	//    4   10:lreturn         
	//    5   11:lconst_0        
	//    6   12:lreturn         
	}

	public long getNextLoadPositionUs()
	{
		return !loadingFinished && !loader.isLoading() ? 0L : 0x0L;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field boolean loadingFinished>
	//    2    4:ifne            22
	//    3    7:aload_0         
	//    4    8:getfield        #94  <Field Loader loader>
	//    5   11:invokevirtual   #110 <Method boolean Loader.isLoading()>
	//    6   14:ifeq            20
	//    7   17:goto            22
	//    8   20:lconst_0        
	//    9   21:lreturn         
	//   10   22:ldc2w           #134 <Long 0x0L>
	//   11   25:lreturn         
	}

	public TrackGroupArray getTrackGroups()
	{
		return tracks;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field TrackGroupArray tracks>
	//    2    4:areturn         
	}

	public void maybeThrowPrepareError()
		throws IOException
	{
	//    0    0:return          
	}

	public void onLoadCanceled(SourceLoadable sourceloadable, long l, long l1, boolean flag)
	{
		eventDispatcher.loadCanceled(sourceloadable.dataSpec, 1, -1, ((Format) (null)), 0, ((Object) (null)), 0L, durationUs, l, l1, sourceloadable.sampleSize);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    2    4:aload_1         
	//    3    5:getfield        #145 <Field DataSpec SingleSampleMediaPeriod$SourceLoadable.dataSpec>
	//    4    8:iconst_1        
	//    5    9:iconst_m1       
	//    6   10:aconst_null     
	//    7   11:iconst_0        
	//    8   12:aconst_null     
	//    9   13:lconst_0        
	//   10   14:aload_0         
	//   11   15:getfield        #60  <Field long durationUs>
	//   12   18:lload_2         
	//   13   19:lload           4
	//   14   21:aload_1         
	//   15   22:invokestatic    #149 <Method int SingleSampleMediaPeriod$SourceLoadable.access$100(SingleSampleMediaPeriod$SourceLoadable)>
	//   16   25:i2l             
	//   17   26:invokevirtual   #153 <Method void MediaSourceEventListener$EventDispatcher.loadCanceled(DataSpec, int, int, Format, int, Object, long, long, long, long, long)>
	//   18   29:return          
	}

	public volatile void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, boolean flag)
	{
		onLoadCanceled((SourceLoadable)loadable, l, l1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class SingleSampleMediaPeriod$SourceLoadable>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:iload           6
	//    6   10:invokevirtual   #156 <Method void onLoadCanceled(SingleSampleMediaPeriod$SourceLoadable, long, long, boolean)>
	//    7   13:return          
	}

	public void onLoadCompleted(SourceLoadable sourceloadable, long l, long l1)
	{
		eventDispatcher.loadCompleted(sourceloadable.dataSpec, 1, -1, format, 0, ((Object) (null)), 0L, durationUs, l, l1, sourceloadable.sampleSize);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    2    4:aload_1         
	//    3    5:getfield        #145 <Field DataSpec SingleSampleMediaPeriod$SourceLoadable.dataSpec>
	//    4    8:iconst_1        
	//    5    9:iconst_m1       
	//    6   10:aload_0         
	//    7   11:getfield        #58  <Field Format format>
	//    8   14:iconst_0        
	//    9   15:aconst_null     
	//   10   16:lconst_0        
	//   11   17:aload_0         
	//   12   18:getfield        #60  <Field long durationUs>
	//   13   21:lload_2         
	//   14   22:lload           4
	//   15   24:aload_1         
	//   16   25:invokestatic    #149 <Method int SingleSampleMediaPeriod$SourceLoadable.access$100(SingleSampleMediaPeriod$SourceLoadable)>
	//   17   28:i2l             
	//   18   29:invokevirtual   #161 <Method void MediaSourceEventListener$EventDispatcher.loadCompleted(DataSpec, int, int, Format, int, Object, long, long, long, long, long)>
		sampleSize = sourceloadable.sampleSize;
	//   19   32:aload_0         
	//   20   33:aload_1         
	//   21   34:invokestatic    #149 <Method int SingleSampleMediaPeriod$SourceLoadable.access$100(SingleSampleMediaPeriod$SourceLoadable)>
	//   22   37:putfield        #163 <Field int sampleSize>
		sampleData = sourceloadable.sampleData;
	//   23   40:aload_0         
	//   24   41:aload_1         
	//   25   42:invokestatic    #167 <Method byte[] SingleSampleMediaPeriod$SourceLoadable.access$200(SingleSampleMediaPeriod$SourceLoadable)>
	//   26   45:putfield        #169 <Field byte[] sampleData>
		loadingFinished = true;
	//   27   48:aload_0         
	//   28   49:iconst_1        
	//   29   50:putfield        #106 <Field boolean loadingFinished>
		loadingSucceeded = true;
	//   30   53:aload_0         
	//   31   54:iconst_1        
	//   32   55:putfield        #171 <Field boolean loadingSucceeded>
	//   33   58:return          
	}

	public volatile void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1)
	{
		onLoadCompleted((SourceLoadable)loadable, l, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class SingleSampleMediaPeriod$SourceLoadable>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #174 <Method void onLoadCompleted(SingleSampleMediaPeriod$SourceLoadable, long, long)>
	//    6   11:return          
	}

	public int onLoadError(SourceLoadable sourceloadable, long l, long l1, IOException ioexception)
	{
		errorCount = errorCount + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #178 <Field int errorCount>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #178 <Field int errorCount>
		boolean flag;
		if(treatLoadErrorsAsEndOfStream && errorCount >= minLoadableRetryCount)
	//*   6   10:aload_0         
	//*   7   11:getfield        #66  <Field boolean treatLoadErrorsAsEndOfStream>
	//*   8   14:ifeq            34
	//*   9   17:aload_0         
	//*  10   18:getfield        #178 <Field int errorCount>
	//*  11   21:aload_0         
	//*  12   22:getfield        #62  <Field int minLoadableRetryCount>
	//*  13   25:icmplt          34
			flag = true;
	//   14   28:iconst_1        
	//   15   29:istore          7
		else
	//*  16   31:goto            37
			flag = false;
	//   17   34:iconst_0        
	//   18   35:istore          7
		eventDispatcher.loadError(sourceloadable.dataSpec, 1, -1, format, 0, ((Object) (null)), 0L, durationUs, l, l1, sourceloadable.sampleSize, ioexception, flag);
	//   19   37:aload_0         
	//   20   38:getfield        #64  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   21   41:aload_1         
	//   22   42:getfield        #145 <Field DataSpec SingleSampleMediaPeriod$SourceLoadable.dataSpec>
	//   23   45:iconst_1        
	//   24   46:iconst_m1       
	//   25   47:aload_0         
	//   26   48:getfield        #58  <Field Format format>
	//   27   51:iconst_0        
	//   28   52:aconst_null     
	//   29   53:lconst_0        
	//   30   54:aload_0         
	//   31   55:getfield        #60  <Field long durationUs>
	//   32   58:lload_2         
	//   33   59:lload           4
	//   34   61:aload_1         
	//   35   62:invokestatic    #149 <Method int SingleSampleMediaPeriod$SourceLoadable.access$100(SingleSampleMediaPeriod$SourceLoadable)>
	//   36   65:i2l             
	//   37   66:aload           6
	//   38   68:iload           7
	//   39   70:invokevirtual   #182 <Method void MediaSourceEventListener$EventDispatcher.loadError(DataSpec, int, int, Format, int, Object, long, long, long, long, long, IOException, boolean)>
		if(flag)
	//*  40   73:iload           7
	//*  41   75:ifeq            85
		{
			loadingFinished = true;
	//   42   78:aload_0         
	//   43   79:iconst_1        
	//   44   80:putfield        #106 <Field boolean loadingFinished>
			return 2;
	//   45   83:iconst_2        
	//   46   84:ireturn         
		} else
		{
			return 0;
	//   47   85:iconst_0        
	//   48   86:ireturn         
		}
	}

	public volatile int onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, IOException ioexception)
	{
		return onLoadError((SourceLoadable)loadable, l, l1, ioexception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class SingleSampleMediaPeriod$SourceLoadable>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:aload           6
	//    6   10:invokevirtual   #185 <Method int onLoadError(SingleSampleMediaPeriod$SourceLoadable, long, long, IOException)>
	//    7   13:ireturn         
	}

	public void prepare(MediaPeriod.Callback callback, long l)
	{
		callback.onPrepared(((MediaPeriod) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #193 <Method void MediaPeriod$Callback.onPrepared(MediaPeriod)>
	//    3    7:return          
	}

	public long readDiscontinuity()
	{
		if(!notifiedReadingStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field boolean notifiedReadingStarted>
	//*   2    4:ifne            19
		{
			eventDispatcher.readingStarted();
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    5   11:invokevirtual   #199 <Method void MediaSourceEventListener$EventDispatcher.readingStarted()>
			notifiedReadingStarted = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #196 <Field boolean notifiedReadingStarted>
		}
		return 0x1L;
	//    9   19:ldc2w           #200 <Long 0x1L>
	//   10   22:lreturn         
	}

	public void reevaluateBuffer(long l)
	{
	//    0    0:return          
	}

	public void release()
	{
		loader.release();
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Loader loader>
	//    2    4:invokevirtual   #206 <Method void Loader.release()>
		eventDispatcher.mediaPeriodReleased();
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    5   11:invokevirtual   #209 <Method void MediaSourceEventListener$EventDispatcher.mediaPeriodReleased()>
	//    6   14:return          
	}

	public long seekToUs(long l)
	{
		for(int i = 0; i < sampleStreams.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #85  <Field ArrayList sampleStreams>
	//*   5    7:invokevirtual   #215 <Method int ArrayList.size()>
	//*   6   10:icmpge          34
			((SampleStreamImpl)sampleStreams.get(i)).reset();
	//    7   13:aload_0         
	//    8   14:getfield        #85  <Field ArrayList sampleStreams>
	//    9   17:iload_3         
	//   10   18:invokevirtual   #219 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #13  <Class SingleSampleMediaPeriod$SampleStreamImpl>
	//   12   24:invokevirtual   #222 <Method void SingleSampleMediaPeriod$SampleStreamImpl.reset()>

	//   13   27:iload_3         
	//   14   28:iconst_1        
	//   15   29:iadd            
	//   16   30:istore_3        
	//*  17   31:goto            2
		return l;
	//   18   34:lload_1         
	//   19   35:lreturn         
	}

	public long selectTracks(TrackSelection atrackselection[], boolean aflag[], SampleStream asamplestream[], boolean aflag1[], long l)
	{
		for(int i = 0; i < atrackselection.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore          7
	//*   2    3:iload           7
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:icmpge          104
		{
			if(asamplestream[i] != null && (atrackselection[i] == null || !aflag[i]))
	//*   6   10:aload_3         
	//*   7   11:iload           7
	//*   8   13:aaload          
	//*   9   14:ifnull          48
	//*  10   17:aload_1         
	//*  11   18:iload           7
	//*  12   20:aaload          
	//*  13   21:ifnull          31
	//*  14   24:aload_2         
	//*  15   25:iload           7
	//*  16   27:baload          
	//*  17   28:ifne            48
			{
				sampleStreams.remove(((Object) (asamplestream[i])));
	//   18   31:aload_0         
	//   19   32:getfield        #85  <Field ArrayList sampleStreams>
	//   20   35:aload_3         
	//   21   36:iload           7
	//   22   38:aaload          
	//   23   39:invokevirtual   #228 <Method boolean ArrayList.remove(Object)>
	//   24   42:pop             
				asamplestream[i] = null;
	//   25   43:aload_3         
	//   26   44:iload           7
	//   27   46:aconst_null     
	//   28   47:aastore         
			}
			if(asamplestream[i] == null && atrackselection[i] != null)
	//*  29   48:aload_3         
	//*  30   49:iload           7
	//*  31   51:aaload          
	//*  32   52:ifnonnull       95
	//*  33   55:aload_1         
	//*  34   56:iload           7
	//*  35   58:aaload          
	//*  36   59:ifnull          95
			{
				SampleStreamImpl samplestreamimpl = new SampleStreamImpl();
	//   37   62:new             #13  <Class SingleSampleMediaPeriod$SampleStreamImpl>
	//   38   65:dup             
	//   39   66:aload_0         
	//   40   67:aconst_null     
	//   41   68:invokespecial   #231 <Method void SingleSampleMediaPeriod$SampleStreamImpl(SingleSampleMediaPeriod, SingleSampleMediaPeriod$1)>
	//   42   71:astore          8
				sampleStreams.add(((Object) (samplestreamimpl)));
	//   43   73:aload_0         
	//   44   74:getfield        #85  <Field ArrayList sampleStreams>
	//   45   77:aload           8
	//   46   79:invokevirtual   #234 <Method boolean ArrayList.add(Object)>
	//   47   82:pop             
				asamplestream[i] = ((SampleStream) (samplestreamimpl));
	//   48   83:aload_3         
	//   49   84:iload           7
	//   50   86:aload           8
	//   51   88:aastore         
				aflag1[i] = true;
	//   52   89:aload           4
	//   53   91:iload           7
	//   54   93:iconst_1        
	//   55   94:bastore         
			}
		}

	//   56   95:iload           7
	//   57   97:iconst_1        
	//   58   98:iadd            
	//   59   99:istore          7
	//*  60  101:goto            3
		return l;
	//   61  104:lload           5
	//   62  106:lreturn         
	}

	private static final int INITIAL_SAMPLE_SIZE = 1024;
	private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
	private final DataSpec dataSpec;
	private final long durationUs;
	private int errorCount;
	private final MediaSourceEventListener.EventDispatcher eventDispatcher;
	final Format format;
	final Loader loader = new Loader("Loader:SingleSampleMediaPeriod");
	boolean loadingFinished;
	boolean loadingSucceeded;
	private final int minLoadableRetryCount;
	boolean notifiedReadingStarted;
	byte sampleData[];
	int sampleSize;
	private final ArrayList sampleStreams = new ArrayList();
	private final TrackGroupArray tracks;
	final boolean treatLoadErrorsAsEndOfStream;


/*
	static MediaSourceEventListener.EventDispatcher access$300(SingleSampleMediaPeriod singlesamplemediaperiod)
	{
		return singlesamplemediaperiod.eventDispatcher;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    2    4:areturn         
	}

*/
}
