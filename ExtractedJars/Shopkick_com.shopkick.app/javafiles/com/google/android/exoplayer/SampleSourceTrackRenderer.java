// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer:
//			TrackRenderer, SampleSource, ExoPlaybackException, MediaFormat, 
//			MediaFormatHolder, SampleHolder

public abstract class SampleSourceTrackRenderer extends TrackRenderer
{

	public transient SampleSourceTrackRenderer(SampleSource asamplesource[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void TrackRenderer()>
		sources = new SampleSource.SampleSourceReader[asamplesource.length];
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:anewarray       SampleSource.SampleSourceReader[]
	//    6   10:putfield        #24  <Field SampleSource$SampleSourceReader[] sources>
		for(int i = 0; i < asamplesource.length; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:aload_1         
	//*  11   17:arraylength     
	//*  12   18:icmpge          42
			sources[i] = asamplesource[i].register();
	//   13   21:aload_0         
	//   14   22:getfield        #24  <Field SampleSource$SampleSourceReader[] sources>
	//   15   25:iload_2         
	//   16   26:aload_1         
	//   17   27:iload_2         
	//   18   28:aaload          
	//   19   29:invokeinterface #30  <Method SampleSource$SampleSourceReader SampleSource.register()>
	//   20   34:aastore         

	//   21   35:iload_2         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_2        
	//*  25   39:goto            15
	//   26   42:return          
	}

	private long checkForDiscontinuity(long l)
		throws ExoPlaybackException
	{
		long l1 = enabledSource.readDiscontinuity(enabledSourceTrackIndex);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field SampleSource$SampleSourceReader enabledSource>
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field int enabledSourceTrackIndex>
	//    4    8:invokeinterface #43  <Method long SampleSource$SampleSourceReader.readDiscontinuity(int)>
	//    5   13:lstore_3        
		if(l1 != 0x0L)
	//*   6   14:lload_3         
	//*   7   15:ldc2w           #44  <Long 0x0L>
	//*   8   18:lcmp            
	//*   9   19:ifeq            29
		{
			onDiscontinuity(l1);
	//   10   22:aload_0         
	//   11   23:lload_3         
	//   12   24:invokevirtual   #49  <Method void onDiscontinuity(long)>
			return l1;
	//   13   27:lload_3         
	//   14   28:lreturn         
		} else
		{
			return l;
	//   15   29:lload_1         
	//   16   30:lreturn         
		}
	}

	private void maybeThrowError(SampleSource.SampleSourceReader samplesourcereader)
		throws ExoPlaybackException
	{
		try
		{
			samplesourcereader.maybeThrowError();
	//    0    0:aload_1         
	//    1    1:invokeinterface #56  <Method void SampleSource$SampleSourceReader.maybeThrowError()>
			return;
	//    2    6:return          
		}
		// Misplaced declaration of an exception variable
		catch(SampleSource.SampleSourceReader samplesourcereader)
	//*   3    7:astore_1        
		{
			throw new ExoPlaybackException(((Throwable) (samplesourcereader)));
	//    4    8:new             #35  <Class ExoPlaybackException>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #59  <Method void ExoPlaybackException(Throwable)>
	//    8   16:athrow          
		}
	}

	protected final boolean doPrepare(long l)
		throws ExoPlaybackException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = true;
	//    2    2:iconst_1        
	//    3    3:istore          4
		do
		{
			SampleSource.SampleSourceReader asamplesourcereader[] = sources;
	//    4    5:aload_0         
	//    5    6:getfield        #24  <Field SampleSource$SampleSourceReader[] sources>
	//    6    9:astore          11
			if(i >= asamplesourcereader.length)
				break;
	//    7   11:iload_3         
	//    8   12:aload           11
	//    9   14:arraylength     
	//   10   15:icmpge          40
			flag &= asamplesourcereader[i].prepare(l);
	//   11   18:iload           4
	//   12   20:aload           11
	//   13   22:iload_3         
	//   14   23:aaload          
	//   15   24:lload_1         
	//   16   25:invokeinterface #66  <Method boolean SampleSource$SampleSourceReader.prepare(long)>
	//   17   30:iand            
	//   18   31:istore          4
			i++;
	//   19   33:iload_3         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore_3        
		} while(true);
	//   23   37:goto            5
		if(!flag)
	//*  24   40:iload           4
	//*  25   42:ifne            47
			return false;
	//   26   45:iconst_0        
	//   27   46:ireturn         
		i = 0;
	//   28   47:iconst_0        
	//   29   48:istore_3        
		int k = i;
	//   30   49:iload_3         
	//   31   50:istore          4
		SampleSource.SampleSourceReader asamplesourcereader1[];
		do
		{
			asamplesourcereader1 = sources;
	//   32   52:aload_0         
	//   33   53:getfield        #24  <Field SampleSource$SampleSourceReader[] sources>
	//   34   56:astore          13
			if(i >= asamplesourcereader1.length)
				break;
	//   35   58:iload_3         
	//   36   59:aload           13
	//   37   61:arraylength     
	//   38   62:icmpge          86
			k += asamplesourcereader1[i].getTrackCount();
	//   39   65:iload           4
	//   40   67:aload           13
	//   41   69:iload_3         
	//   42   70:aaload          
	//   43   71:invokeinterface #70  <Method int SampleSource$SampleSourceReader.getTrackCount()>
	//   44   76:iadd            
	//   45   77:istore          4
			i++;
	//   46   79:iload_3         
	//   47   80:iconst_1        
	//   48   81:iadd            
	//   49   82:istore_3        
		} while(true);
	//   50   83:goto            52
		Object obj = ((Object) (new int[k]));
	//   51   86:iload           4
	//   52   88:newarray        int[]
	//   53   90:astore          11
		int ai[] = new int[k];
	//   54   92:iload           4
	//   55   94:newarray        int[]
	//   56   96:astore          12
		int k1 = asamplesourcereader1.length;
	//   57   98:aload           13
	//   58  100:arraylength     
	//   59  101:istore          6
		int j1 = 0;
	//   60  103:iconst_0        
	//   61  104:istore          5
		l = 0L;
	//   62  106:lconst_0        
	//   63  107:lstore_1        
		for(int j = j1; j < k1; j++)
	//*  64  108:iload           5
	//*  65  110:istore_3        
	//*  66  111:iload_3         
	//*  67  112:iload           6
	//*  68  114:icmpge          271
		{
			SampleSource.SampleSourceReader samplesourcereader = sources[j];
	//   69  117:aload_0         
	//   70  118:getfield        #24  <Field SampleSource$SampleSourceReader[] sources>
	//   71  121:iload_3         
	//   72  122:aaload          
	//   73  123:astore          13
			int l1 = samplesourcereader.getTrackCount();
	//   74  125:aload           13
	//   75  127:invokeinterface #70  <Method int SampleSource$SampleSourceReader.getTrackCount()>
	//   76  132:istore          7
			int i1 = 0;
	//   77  134:iconst_0        
	//   78  135:istore          4
			while(i1 < l1) 
	//*  79  137:iload           4
	//*  80  139:iload           7
	//*  81  141:icmpge          264
			{
				MediaFormat mediaformat = samplesourcereader.getFormat(i1);
	//   82  144:aload           13
	//   83  146:iload           4
	//   84  148:invokeinterface #74  <Method MediaFormat SampleSource$SampleSourceReader.getFormat(int)>
	//   85  153:astore          14
				long l2;
				boolean flag1;
				try
				{
					flag1 = handlesTrack(mediaformat);
	//   86  155:aload_0         
	//   87  156:aload           14
	//   88  158:invokevirtual   #78  <Method boolean handlesTrack(MediaFormat)>
	//   89  161:istore          10
				}
	//*  90  163:iload           10
	//*  91  165:ifeq            243
	//*  92  168:aload           11
	//*  93  170:iload           5
	//*  94  172:iload_3         
	//*  95  173:iastore         
	//*  96  174:aload           12
	//*  97  176:iload           5
	//*  98  178:iload           4
	//*  99  180:iastore         
	//* 100  181:iload           5
	//* 101  183:iconst_1        
	//* 102  184:iadd            
	//* 103  185:istore          5
	//* 104  187:lload_1         
	//* 105  188:ldc2w           #79  <Long -1L>
	//* 106  191:lcmp            
	//* 107  192:ifne            198
	//* 108  195:goto            243
	//* 109  198:aload           14
	//* 110  200:getfield        #84  <Field long MediaFormat.durationUs>
	//* 111  203:lstore          8
	//* 112  205:lload           8
	//* 113  207:ldc2w           #79  <Long -1L>
	//* 114  210:lcmp            
	//* 115  211:ifne            221
	//* 116  214:ldc2w           #79  <Long -1L>
	//* 117  217:lstore_1        
	//* 118  218:goto            243
	//* 119  221:lload           8
	//* 120  223:ldc2w           #85  <Long -2L>
	//* 121  226:lcmp            
	//* 122  227:ifne            233
	//* 123  230:goto            243
	//* 124  233:lload_1         
	//* 125  234:lload           8
	//* 126  236:invokestatic    #92  <Method long Math.max(long, long)>
	//* 127  239:lstore_1        
	//* 128  240:goto            243
	//* 129  243:iload           4
	//* 130  245:iconst_1        
	//* 131  246:iadd            
	//* 132  247:istore          4
	//* 133  249:goto            137
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//* 134  252:astore          11
				{
					throw new ExoPlaybackException(((Throwable) (obj)));
	//  135  254:new             #35  <Class ExoPlaybackException>
	//  136  257:dup             
	//  137  258:aload           11
	//  138  260:invokespecial   #59  <Method void ExoPlaybackException(Throwable)>
	//  139  263:athrow          
				}
				if(!flag1)
					continue;
				obj[j1] = j;
				ai[j1] = i1;
				j1++;
				if(l == -1L)
					continue;
				l2 = mediaformat.durationUs;
				if(l2 == -1L)
				{
					l = -1L;
					continue;
				}
				if(l2 != -2L)
					l = Math.max(l, l2);
				i1++;
			}
		}

	//  140  264:iload_3         
	//  141  265:iconst_1        
	//  142  266:iadd            
	//  143  267:istore_3        
	//* 144  268:goto            111
		durationUs = l;
	//  145  271:aload_0         
	//  146  272:lload_1         
	//  147  273:putfield        #93  <Field long durationUs>
		handledSourceIndices = Arrays.copyOf(((int []) (obj)), j1);
	//  148  276:aload_0         
	//  149  277:aload           11
	//  150  279:iload           5
	//  151  281:invokestatic    #99  <Method int[] Arrays.copyOf(int[], int)>
	//  152  284:putfield        #101 <Field int[] handledSourceIndices>
		handledSourceTrackIndices = Arrays.copyOf(ai, j1);
	//  153  287:aload_0         
	//  154  288:aload           12
	//  155  290:iload           5
	//  156  292:invokestatic    #99  <Method int[] Arrays.copyOf(int[], int)>
	//  157  295:putfield        #103 <Field int[] handledSourceTrackIndices>
		return true;
	//  158  298:iconst_1        
	//  159  299:ireturn         
	}

	protected final void doSomeWork(long l, long l1)
		throws ExoPlaybackException
	{
		l = shiftInputPosition(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #108 <Method long shiftInputPosition(long)>
	//    3    5:lstore_1        
		boolean flag = enabledSource.continueBuffering(enabledSourceTrackIndex, l);
	//    4    6:aload_0         
	//    5    7:getfield        #37  <Field SampleSource$SampleSourceReader enabledSource>
	//    6   10:aload_0         
	//    7   11:getfield        #39  <Field int enabledSourceTrackIndex>
	//    8   14:lload_1         
	//    9   15:invokeinterface #112 <Method boolean SampleSource$SampleSourceReader.continueBuffering(int, long)>
	//   10   20:istore          5
		doSomeWork(checkForDiscontinuity(l), l1, flag);
	//   11   22:aload_0         
	//   12   23:aload_0         
	//   13   24:lload_1         
	//   14   25:invokespecial   #114 <Method long checkForDiscontinuity(long)>
	//   15   28:lload_3         
	//   16   29:iload           5
	//   17   31:invokevirtual   #117 <Method void doSomeWork(long, long, boolean)>
	//   18   34:return          
	}

	protected abstract void doSomeWork(long l, long l1, boolean flag)
		throws ExoPlaybackException;

	protected long getBufferedPositionUs()
	{
		return enabledSource.getBufferedPositionUs();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field SampleSource$SampleSourceReader enabledSource>
	//    2    4:invokeinterface #121 <Method long SampleSource$SampleSourceReader.getBufferedPositionUs()>
	//    3    9:lreturn         
	}

	protected long getDurationUs()
	{
		return durationUs;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field long durationUs>
	//    2    4:lreturn         
	}

	protected final MediaFormat getFormat(int i)
	{
		return sources[handledSourceIndices[i]].getFormat(handledSourceTrackIndices[i]);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field SampleSource$SampleSourceReader[] sources>
	//    2    4:aload_0         
	//    3    5:getfield        #101 <Field int[] handledSourceIndices>
	//    4    8:iload_1         
	//    5    9:iaload          
	//    6   10:aaload          
	//    7   11:aload_0         
	//    8   12:getfield        #103 <Field int[] handledSourceTrackIndices>
	//    9   15:iload_1         
	//   10   16:iaload          
	//   11   17:invokeinterface #74  <Method MediaFormat SampleSource$SampleSourceReader.getFormat(int)>
	//   12   22:areturn         
	}

	protected final int getTrackCount()
	{
		return handledSourceTrackIndices.length;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int[] handledSourceTrackIndices>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	protected abstract boolean handlesTrack(MediaFormat mediaformat)
		throws MediaCodecUtil.DecoderQueryException;

	protected void maybeThrowError()
		throws ExoPlaybackException
	{
		SampleSource.SampleSourceReader samplesourcereader = enabledSource;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field SampleSource$SampleSourceReader enabledSource>
	//    2    4:astore_3        
		if(samplesourcereader != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
		{
			maybeThrowError(samplesourcereader);
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:invokespecial   #124 <Method void maybeThrowError(SampleSource$SampleSourceReader)>
			return;
	//    8   14:return          
		}
		int j = sources.length;
	//    9   15:aload_0         
	//   10   16:getfield        #24  <Field SampleSource$SampleSourceReader[] sources>
	//   11   19:arraylength     
	//   12   20:istore_2        
		for(int i = 0; i < j; i++)
	//*  13   21:iconst_0        
	//*  14   22:istore_1        
	//*  15   23:iload_1         
	//*  16   24:iload_2         
	//*  17   25:icmpge          45
			maybeThrowError(sources[i]);
	//   18   28:aload_0         
	//   19   29:aload_0         
	//   20   30:getfield        #24  <Field SampleSource$SampleSourceReader[] sources>
	//   21   33:iload_1         
	//   22   34:aaload          
	//   23   35:invokespecial   #124 <Method void maybeThrowError(SampleSource$SampleSourceReader)>

	//   24   38:iload_1         
	//   25   39:iconst_1        
	//   26   40:iadd            
	//   27   41:istore_1        
	//*  28   42:goto            23
	//   29   45:return          
	}

	protected void onDisabled()
		throws ExoPlaybackException
	{
		enabledSource.disable(enabledSourceTrackIndex);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field SampleSource$SampleSourceReader enabledSource>
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field int enabledSourceTrackIndex>
	//    4    8:invokeinterface #129 <Method void SampleSource$SampleSourceReader.disable(int)>
		enabledSource = null;
	//    5   13:aload_0         
	//    6   14:aconst_null     
	//    7   15:putfield        #37  <Field SampleSource$SampleSourceReader enabledSource>
	//    8   18:return          
	}

	protected abstract void onDiscontinuity(long l)
		throws ExoPlaybackException;

	protected void onEnabled(int i, long l, boolean flag)
		throws ExoPlaybackException
	{
		l = shiftInputPosition(l);
	//    0    0:aload_0         
	//    1    1:lload_2         
	//    2    2:invokevirtual   #108 <Method long shiftInputPosition(long)>
	//    3    5:lstore_2        
		enabledSource = sources[handledSourceIndices[i]];
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field SampleSource$SampleSourceReader[] sources>
	//    7   11:aload_0         
	//    8   12:getfield        #101 <Field int[] handledSourceIndices>
	//    9   15:iload_1         
	//   10   16:iaload          
	//   11   17:aaload          
	//   12   18:putfield        #37  <Field SampleSource$SampleSourceReader enabledSource>
		enabledSourceTrackIndex = handledSourceTrackIndices[i];
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:getfield        #103 <Field int[] handledSourceTrackIndices>
	//   16   26:iload_1         
	//   17   27:iaload          
	//   18   28:putfield        #39  <Field int enabledSourceTrackIndex>
		enabledSource.enable(enabledSourceTrackIndex, l);
	//   19   31:aload_0         
	//   20   32:getfield        #37  <Field SampleSource$SampleSourceReader enabledSource>
	//   21   35:aload_0         
	//   22   36:getfield        #39  <Field int enabledSourceTrackIndex>
	//   23   39:lload_2         
	//   24   40:invokeinterface #135 <Method void SampleSource$SampleSourceReader.enable(int, long)>
		onDiscontinuity(l);
	//   25   45:aload_0         
	//   26   46:lload_2         
	//   27   47:invokevirtual   #49  <Method void onDiscontinuity(long)>
	//   28   50:return          
	}

	protected void onReleased()
		throws ExoPlaybackException
	{
		int j = sources.length;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field SampleSource$SampleSourceReader[] sources>
	//    2    4:arraylength     
	//    3    5:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_1        
	//*   6    8:iload_1         
	//*   7    9:iload_2         
	//*   8   10:icmpge          31
			sources[i].release();
	//    9   13:aload_0         
	//   10   14:getfield        #24  <Field SampleSource$SampleSourceReader[] sources>
	//   11   17:iload_1         
	//   12   18:aaload          
	//   13   19:invokeinterface #139 <Method void SampleSource$SampleSourceReader.release()>

	//   14   24:iload_1         
	//   15   25:iconst_1        
	//   16   26:iadd            
	//   17   27:istore_1        
	//*  18   28:goto            8
	//   19   31:return          
	}

	protected final int readSource(long l, MediaFormatHolder mediaformatholder, SampleHolder sampleholder)
	{
		return enabledSource.readData(enabledSourceTrackIndex, l, mediaformatholder, sampleholder);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field SampleSource$SampleSourceReader enabledSource>
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field int enabledSourceTrackIndex>
	//    4    8:lload_1         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:invokeinterface #145 <Method int SampleSource$SampleSourceReader.readData(int, long, MediaFormatHolder, SampleHolder)>
	//    8   17:ireturn         
	}

	protected void seekTo(long l)
		throws ExoPlaybackException
	{
		l = shiftInputPosition(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #108 <Method long shiftInputPosition(long)>
	//    3    5:lstore_1        
		enabledSource.seekToUs(l);
	//    4    6:aload_0         
	//    5    7:getfield        #37  <Field SampleSource$SampleSourceReader enabledSource>
	//    6   10:lload_1         
	//    7   11:invokeinterface #149 <Method void SampleSource$SampleSourceReader.seekToUs(long)>
		checkForDiscontinuity(l);
	//    8   16:aload_0         
	//    9   17:lload_1         
	//   10   18:invokespecial   #114 <Method long checkForDiscontinuity(long)>
	//   11   21:pop2            
	//   12   22:return          
	}

	protected long shiftInputPosition(long l)
	{
		return l;
	//    0    0:lload_1         
	//    1    1:lreturn         
	}

	private long durationUs;
	private SampleSource.SampleSourceReader enabledSource;
	private int enabledSourceTrackIndex;
	private int handledSourceIndices[];
	private int handledSourceTrackIndices[];
	private final SampleSource.SampleSourceReader sources[];
}
