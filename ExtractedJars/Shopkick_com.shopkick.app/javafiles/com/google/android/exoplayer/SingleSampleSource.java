// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.upstream.Loader;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer:
//			SampleSource, MediaFormat, MediaFormatHolder, SampleHolder

public final class SingleSampleSource
	implements SampleSource, SampleSource.SampleSourceReader, com.google.android.exoplayer.upstream.Loader.Callback, com.google.android.exoplayer.upstream.Loader.Loadable
{
	public static interface EventListener
	{

		public abstract void onLoadError(int i, IOException ioexception);
	}


	public SingleSampleSource(Uri uri1, DataSource datasource, MediaFormat mediaformat)
	{
		this(uri1, datasource, mediaformat, 3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_3        
	//    5    5:invokespecial   #58  <Method void SingleSampleSource(Uri, DataSource, MediaFormat, int)>
	//    6    8:return          
	}

	public SingleSampleSource(Uri uri1, DataSource datasource, MediaFormat mediaformat, int i)
	{
		this(uri1, datasource, mediaformat, i, ((Handler) (null)), ((EventListener) (null)), 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aconst_null     
	//    6    7:aconst_null     
	//    7    8:iconst_0        
	//    8    9:invokespecial   #62  <Method void SingleSampleSource(Uri, DataSource, MediaFormat, int, Handler, SingleSampleSource$EventListener, int)>
	//    9   12:return          
	}

	public SingleSampleSource(Uri uri1, DataSource datasource, MediaFormat mediaformat, int i, Handler handler, EventListener eventlistener, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void Object()>
		uri = uri1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #67  <Field Uri uri>
		dataSource = datasource;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #69  <Field DataSource dataSource>
		format = mediaformat;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #71  <Field MediaFormat format>
		minLoadableRetryCount = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #73  <Field int minLoadableRetryCount>
		eventHandler = handler;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #75  <Field Handler eventHandler>
		eventListener = eventlistener;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #77  <Field SingleSampleSource$EventListener eventListener>
		eventSourceId = j;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #79  <Field int eventSourceId>
		sampleData = new byte[1];
	//   23   43:aload_0         
	//   24   44:iconst_1        
	//   25   45:newarray        byte[]
	//   26   47:putfield        #81  <Field byte[] sampleData>
	//   27   50:return          
	}

	private void clearCurrentLoadableException()
	{
		currentLoadableException = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #88  <Field IOException currentLoadableException>
		currentLoadableExceptionCount = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #90  <Field int currentLoadableExceptionCount>
	//    6   10:return          
	}

	private long getRetryDelayMillis(long l)
	{
		return Math.min((l - 1L) * 1000L, 5000L);
	//    0    0:lload_1         
	//    1    1:lconst_1        
	//    2    2:lsub            
	//    3    3:ldc2w           #93  <Long 1000L>
	//    4    6:lmul            
	//    5    7:ldc2w           #95  <Long 5000L>
	//    6   10:invokestatic    #102 <Method long Math.min(long, long)>
	//    7   13:lreturn         
	}

	private void maybeStartLoading()
	{
		if(!loadingFinished && state != 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field boolean loadingFinished>
	//*   2    4:ifne            70
	//*   3    7:aload_0         
	//*   4    8:getfield        #107 <Field int state>
	//*   5   11:iconst_2        
	//*   6   12:icmpeq          70
		{
			if(loader.isLoading())
	//*   7   15:aload_0         
	//*   8   16:getfield        #109 <Field Loader loader>
	//*   9   19:invokevirtual   #115 <Method boolean Loader.isLoading()>
	//*  10   22:ifeq            26
				return;
	//   11   25:return          
			if(currentLoadableException != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #88  <Field IOException currentLoadableException>
	//*  14   30:ifnull          60
			{
				if(SystemClock.elapsedRealtime() - currentLoadableExceptionTimestamp < getRetryDelayMillis(currentLoadableExceptionCount))
	//*  15   33:invokestatic    #121 <Method long SystemClock.elapsedRealtime()>
	//*  16   36:aload_0         
	//*  17   37:getfield        #123 <Field long currentLoadableExceptionTimestamp>
	//*  18   40:lsub            
	//*  19   41:aload_0         
	//*  20   42:aload_0         
	//*  21   43:getfield        #90  <Field int currentLoadableExceptionCount>
	//*  22   46:i2l             
	//*  23   47:invokespecial   #125 <Method long getRetryDelayMillis(long)>
	//*  24   50:lcmp            
	//*  25   51:ifge            55
					return;
	//   26   54:return          
				currentLoadableException = null;
	//   27   55:aload_0         
	//   28   56:aconst_null     
	//   29   57:putfield        #88  <Field IOException currentLoadableException>
			}
			loader.startLoading(((com.google.android.exoplayer.upstream.Loader.Loadable) (this)), ((com.google.android.exoplayer.upstream.Loader.Callback) (this)));
	//   30   60:aload_0         
	//   31   61:getfield        #109 <Field Loader loader>
	//   32   64:aload_0         
	//   33   65:aload_0         
	//   34   66:invokevirtual   #129 <Method void Loader.startLoading(com.google.android.exoplayer.upstream.Loader$Loadable, com.google.android.exoplayer.upstream.Loader$Callback)>
			return;
	//   35   69:return          
		} else
		{
			return;
	//   36   70:return          
		}
	}

	private void notifyLoadError(final IOException e)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Handler eventHandler>
	//    2    4:astore_2        
		if(handler != null && eventListener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          30
	//*   5    9:aload_0         
	//*   6   10:getfield        #77  <Field SingleSampleSource$EventListener eventListener>
	//*   7   13:ifnull          30
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onLoadError(eventSourceId, e);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field SingleSampleSource this$0>
				//    2    4:invokestatic    #30  <Method SingleSampleSource$EventListener SingleSampleSource.access$100(SingleSampleSource)>
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field SingleSampleSource this$0>
				//    5   11:invokestatic    #34  <Method int SingleSampleSource.access$000(SingleSampleSource)>
				//    6   14:aload_0         
				//    7   15:getfield        #21  <Field IOException val$e>
				//    8   18:invokeinterface #40  <Method void SingleSampleSource$EventListener.onLoadError(int, IOException)>
				//    9   23:return          
				}

				final SingleSampleSource this$0;
				final IOException val$e;

			
			{
				this$0 = SingleSampleSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field SingleSampleSource this$0>
				e = ioexception;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field IOException val$e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   16:aload_2         
	//    9   17:new             #14  <Class SingleSampleSource$1>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #134 <Method void SingleSampleSource$1(SingleSampleSource, IOException)>
	//   14   26:invokevirtual   #140 <Method boolean Handler.post(Runnable)>
	//   15   29:pop             
	//   16   30:return          
	}

	public void cancelLoad()
	{
	//    0    0:return          
	}

	public boolean continueBuffering(int i, long l)
	{
		maybeStartLoading();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method void maybeStartLoading()>
		return loadingFinished;
	//    2    4:aload_0         
	//    3    5:getfield        #105 <Field boolean loadingFinished>
	//    4    8:ireturn         
	}

	public void disable(int i)
	{
		state = 2;
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:putfield        #107 <Field int state>
	//    3    5:return          
	}

	public void enable(int i, long l)
	{
		state = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #107 <Field int state>
		pendingDiscontinuityPositionUs = 0x0L;
	//    3    5:aload_0         
	//    4    6:ldc2w           #150 <Long 0x0L>
	//    5    9:putfield        #153 <Field long pendingDiscontinuityPositionUs>
		clearCurrentLoadableException();
	//    6   12:aload_0         
	//    7   13:invokespecial   #155 <Method void clearCurrentLoadableException()>
		maybeStartLoading();
	//    8   16:aload_0         
	//    9   17:invokespecial   #145 <Method void maybeStartLoading()>
	//   10   20:return          
	}

	public long getBufferedPositionUs()
	{
		return !loadingFinished ? 0L : -3L;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field boolean loadingFinished>
	//    2    4:ifeq            11
	//    3    7:ldc2w           #157 <Long -3L>
	//    4   10:lreturn         
	//    5   11:lconst_0        
	//    6   12:lreturn         
	}

	public MediaFormat getFormat(int i)
	{
		return format;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field MediaFormat format>
	//    2    4:areturn         
	}

	public int getTrackCount()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isLoadCanceled()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
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
	//    4    4:putfield        #170 <Field int sampleSize>
		dataSource.open(new DataSpec(uri));
	//    5    7:aload_0         
	//    6    8:getfield        #69  <Field DataSource dataSource>
	//    7   11:new             #172 <Class DataSpec>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #67  <Field Uri uri>
	//   11   19:invokespecial   #175 <Method void DataSpec(Uri)>
	//   12   22:invokeinterface #181 <Method long DataSource.open(DataSpec)>
	//   13   27:pop2            
_L2:
		if(i == -1)
			break; /* Loop/switch isn't completed */
	//   14   28:iload_1         
	//   15   29:iconst_m1       
	//   16   30:icmpeq          104
		sampleSize = sampleSize + i;
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #170 <Field int sampleSize>
	//   20   38:iload_1         
	//   21   39:iadd            
	//   22   40:putfield        #170 <Field int sampleSize>
		if(sampleSize == sampleData.length)
	//*  23   43:aload_0         
	//*  24   44:getfield        #170 <Field int sampleSize>
	//*  25   47:aload_0         
	//*  26   48:getfield        #81  <Field byte[] sampleData>
	//*  27   51:arraylength     
	//*  28   52:icmpne          73
			sampleData = Arrays.copyOf(sampleData, sampleData.length * 2);
	//   29   55:aload_0         
	//   30   56:aload_0         
	//   31   57:getfield        #81  <Field byte[] sampleData>
	//   32   60:aload_0         
	//   33   61:getfield        #81  <Field byte[] sampleData>
	//   34   64:arraylength     
	//   35   65:iconst_2        
	//   36   66:imul            
	//   37   67:invokestatic    #187 <Method byte[] Arrays.copyOf(byte[], int)>
	//   38   70:putfield        #81  <Field byte[] sampleData>
		i = dataSource.read(sampleData, sampleSize, sampleData.length - sampleSize);
	//   39   73:aload_0         
	//   40   74:getfield        #69  <Field DataSource dataSource>
	//   41   77:aload_0         
	//   42   78:getfield        #81  <Field byte[] sampleData>
	//   43   81:aload_0         
	//   44   82:getfield        #170 <Field int sampleSize>
	//   45   85:aload_0         
	//   46   86:getfield        #81  <Field byte[] sampleData>
	//   47   89:arraylength     
	//   48   90:aload_0         
	//   49   91:getfield        #170 <Field int sampleSize>
	//   50   94:isub            
	//   51   95:invokeinterface #191 <Method int DataSource.read(byte[], int, int)>
	//   52  100:istore_1        
		if(true) goto _L2; else goto _L1
	//   53  101:goto            28
_L1:
		Util.closeQuietly(dataSource);
	//   54  104:aload_0         
	//   55  105:getfield        #69  <Field DataSource dataSource>
	//   56  108:invokestatic    #197 <Method void Util.closeQuietly(DataSource)>
		return;
	//   57  111:return          
		Exception exception;
		exception;
	//   58  112:astore_2        
		Util.closeQuietly(dataSource);
	//   59  113:aload_0         
	//   60  114:getfield        #69  <Field DataSource dataSource>
	//   61  117:invokestatic    #197 <Method void Util.closeQuietly(DataSource)>
		throw exception;
	//   62  120:aload_2         
	//   63  121:athrow          
	}

	public void maybeThrowError()
		throws IOException
	{
		IOException ioexception = currentLoadableException;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field IOException currentLoadableException>
	//    2    4:astore_1        
		if(ioexception != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
		{
			if(currentLoadableExceptionCount <= minLoadableRetryCount)
	//*   5    9:aload_0         
	//*   6   10:getfield        #90  <Field int currentLoadableExceptionCount>
	//*   7   13:aload_0         
	//*   8   14:getfield        #73  <Field int minLoadableRetryCount>
	//*   9   17:icmpgt          21
				return;
	//   10   20:return          
			else
				throw ioexception;
	//   11   21:aload_1         
	//   12   22:athrow          
		} else
		{
			return;
	//   13   23:return          
		}
	}

	public void onLoadCanceled(com.google.android.exoplayer.upstream.Loader.Loadable loadable)
	{
	//    0    0:return          
	}

	public void onLoadCompleted(com.google.android.exoplayer.upstream.Loader.Loadable loadable)
	{
		loadingFinished = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #105 <Field boolean loadingFinished>
		clearCurrentLoadableException();
	//    3    5:aload_0         
	//    4    6:invokespecial   #155 <Method void clearCurrentLoadableException()>
	//    5    9:return          
	}

	public void onLoadError(com.google.android.exoplayer.upstream.Loader.Loadable loadable, IOException ioexception)
	{
		currentLoadableException = ioexception;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #88  <Field IOException currentLoadableException>
		currentLoadableExceptionCount = currentLoadableExceptionCount + 1;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #90  <Field int currentLoadableExceptionCount>
	//    6   10:iconst_1        
	//    7   11:iadd            
	//    8   12:putfield        #90  <Field int currentLoadableExceptionCount>
		currentLoadableExceptionTimestamp = SystemClock.elapsedRealtime();
	//    9   15:aload_0         
	//   10   16:invokestatic    #121 <Method long SystemClock.elapsedRealtime()>
	//   11   19:putfield        #123 <Field long currentLoadableExceptionTimestamp>
		notifyLoadError(ioexception);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokespecial   #206 <Method void notifyLoadError(IOException)>
		maybeStartLoading();
	//   15   27:aload_0         
	//   16   28:invokespecial   #145 <Method void maybeStartLoading()>
	//   17   31:return          
	}

	public boolean prepare(long l)
	{
		if(loader == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field Loader loader>
	//*   2    4:ifnonnull       49
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #210 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #211 <Method void StringBuilder()>
	//    6   14:astore_3        
			stringbuilder.append("Loader:");
	//    7   15:aload_3         
	//    8   16:ldc1            #213 <String "Loader:">
	//    9   18:invokevirtual   #217 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			stringbuilder.append(format.mimeType);
	//   11   22:aload_3         
	//   12   23:aload_0         
	//   13   24:getfield        #71  <Field MediaFormat format>
	//   14   27:getfield        #223 <Field String MediaFormat.mimeType>
	//   15   30:invokevirtual   #217 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			loader = new Loader(stringbuilder.toString());
	//   17   34:aload_0         
	//   18   35:new             #111 <Class Loader>
	//   19   38:dup             
	//   20   39:aload_3         
	//   21   40:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   22   43:invokespecial   #230 <Method void Loader(String)>
	//   23   46:putfield        #109 <Field Loader loader>
		}
		return true;
	//   24   49:iconst_1        
	//   25   50:ireturn         
	}

	public int readData(int i, long l, MediaFormatHolder mediaformatholder, SampleHolder sampleholder)
	{
		i = state;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field int state>
	//    2    4:istore_1        
		if(i == 2)
	//*   3    5:iload_1         
	//*   4    6:iconst_2        
	//*   5    7:icmpne          12
			return -1;
	//    6   10:iconst_m1       
	//    7   11:ireturn         
		if(i == 0)
	//*   8   12:iload_1         
	//*   9   13:ifne            33
		{
			mediaformatholder.format = format;
	//   10   16:aload           4
	//   11   18:aload_0         
	//   12   19:getfield        #71  <Field MediaFormat format>
	//   13   22:putfield        #235 <Field MediaFormat MediaFormatHolder.format>
			state = 1;
	//   14   25:aload_0         
	//   15   26:iconst_1        
	//   16   27:putfield        #107 <Field int state>
			return -4;
	//   17   30:bipush          -4
	//   18   32:ireturn         
		}
		boolean flag;
		if(i == 1)
	//*  19   33:iload_1         
	//*  20   34:iconst_1        
	//*  21   35:icmpne          44
			flag = true;
	//   22   38:iconst_1        
	//   23   39:istore          6
		else
	//*  24   41:goto            47
			flag = false;
	//   25   44:iconst_0        
	//   26   45:istore          6
		Assertions.checkState(flag);
	//   27   47:iload           6
	//   28   49:invokestatic    #241 <Method void Assertions.checkState(boolean)>
		if(!loadingFinished)
	//*  29   52:aload_0         
	//*  30   53:getfield        #105 <Field boolean loadingFinished>
	//*  31   56:ifne            62
		{
			return -2;
	//   32   59:bipush          -2
	//   33   61:ireturn         
		} else
		{
			sampleholder.timeUs = 0L;
	//   34   62:aload           5
	//   35   64:lconst_0        
	//   36   65:putfield        #246 <Field long SampleHolder.timeUs>
			sampleholder.size = sampleSize;
	//   37   68:aload           5
	//   38   70:aload_0         
	//   39   71:getfield        #170 <Field int sampleSize>
	//   40   74:putfield        #249 <Field int SampleHolder.size>
			sampleholder.flags = 1;
	//   41   77:aload           5
	//   42   79:iconst_1        
	//   43   80:putfield        #252 <Field int SampleHolder.flags>
			sampleholder.ensureSpaceForWrite(sampleholder.size);
	//   44   83:aload           5
	//   45   85:aload           5
	//   46   87:getfield        #249 <Field int SampleHolder.size>
	//   47   90:invokevirtual   #255 <Method void SampleHolder.ensureSpaceForWrite(int)>
			sampleholder.data.put(sampleData, 0, sampleSize);
	//   48   93:aload           5
	//   49   95:getfield        #259 <Field ByteBuffer SampleHolder.data>
	//   50   98:aload_0         
	//   51   99:getfield        #81  <Field byte[] sampleData>
	//   52  102:iconst_0        
	//   53  103:aload_0         
	//   54  104:getfield        #170 <Field int sampleSize>
	//   55  107:invokevirtual   #265 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//   56  110:pop             
			state = 2;
	//   57  111:aload_0         
	//   58  112:iconst_2        
	//   59  113:putfield        #107 <Field int state>
			return -3;
	//   60  116:bipush          -3
	//   61  118:ireturn         
		}
	}

	public long readDiscontinuity(int i)
	{
		long l = pendingDiscontinuityPositionUs;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field long pendingDiscontinuityPositionUs>
	//    2    4:lstore_2        
		pendingDiscontinuityPositionUs = 0x0L;
	//    3    5:aload_0         
	//    4    6:ldc2w           #150 <Long 0x0L>
	//    5    9:putfield        #153 <Field long pendingDiscontinuityPositionUs>
		return l;
	//    6   12:lload_2         
	//    7   13:lreturn         
	}

	public SampleSource.SampleSourceReader register()
	{
		return ((SampleSource.SampleSourceReader) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public void release()
	{
		Loader loader1 = loader;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Loader loader>
	//    2    4:astore_1        
		if(loader1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			loader1.release();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #272 <Method void Loader.release()>
			loader = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #109 <Field Loader loader>
		}
	//   10   18:return          
	}

	public void seekToUs(long l)
	{
		if(state == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field int state>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          18
		{
			pendingDiscontinuityPositionUs = l;
	//    4    8:aload_0         
	//    5    9:lload_1         
	//    6   10:putfield        #153 <Field long pendingDiscontinuityPositionUs>
			state = 1;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #107 <Field int state>
		}
	//   10   18:return          
	}

	public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
	private static final int INITIAL_SAMPLE_SIZE = 1;
	private static final int STATE_END_OF_STREAM = 2;
	private static final int STATE_SEND_FORMAT = 0;
	private static final int STATE_SEND_SAMPLE = 1;
	private IOException currentLoadableException;
	private int currentLoadableExceptionCount;
	private long currentLoadableExceptionTimestamp;
	private final DataSource dataSource;
	private final Handler eventHandler;
	private final EventListener eventListener;
	private final int eventSourceId;
	private final MediaFormat format;
	private Loader loader;
	private boolean loadingFinished;
	private final int minLoadableRetryCount;
	private long pendingDiscontinuityPositionUs;
	private byte sampleData[];
	private int sampleSize;
	private int state;
	private final Uri uri;


/*
	static int access$000(SingleSampleSource singlesamplesource)
	{
		return singlesamplesource.eventSourceId;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int eventSourceId>
	//    2    4:ireturn         
	}

*/


/*
	static EventListener access$100(SingleSampleSource singlesamplesource)
	{
		return singlesamplesource.eventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field SingleSampleSource$EventListener eventListener>
	//    2    4:areturn         
	}

*/
}
