// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.chunk;

import android.util.Log;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleQueue;

public final class BaseMediaChunkOutput
	implements ChunkExtractorWrapper.TrackOutputProvider
{

	public BaseMediaChunkOutput(int ai[], SampleQueue asamplequeue[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		trackTypes = ai;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field int[] trackTypes>
		sampleQueues = asamplequeue;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field SampleQueue[] sampleQueues>
	//    8   14:return          
	}

	public int[] getWriteIndices()
	{
		Object aobj[] = ((Object []) (sampleQueues));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SampleQueue[] sampleQueues>
	//    2    4:astore_2        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		aobj = ((Object []) (new int[aobj.length]));
	//    5    7:aload_2         
	//    6    8:arraylength     
	//    7    9:newarray        int[]
	//    8   11:astore_2        
		for(; i < sampleQueues.length; i++)
	//*   9   12:iload_1         
	//*  10   13:aload_0         
	//*  11   14:getfield        #23  <Field SampleQueue[] sampleQueues>
	//*  12   17:arraylength     
	//*  13   18:icmpge          49
			if(sampleQueues[i] != null)
	//*  14   21:aload_0         
	//*  15   22:getfield        #23  <Field SampleQueue[] sampleQueues>
	//*  16   25:iload_1         
	//*  17   26:aaload          
	//*  18   27:ifnull          42
				aobj[i] = sampleQueues[i].getWriteIndex();
	//   19   30:aload_2         
	//   20   31:iload_1         
	//   21   32:aload_0         
	//   22   33:getfield        #23  <Field SampleQueue[] sampleQueues>
	//   23   36:iload_1         
	//   24   37:aaload          
	//   25   38:invokevirtual   #32  <Method int SampleQueue.getWriteIndex()>
	//   26   41:iastore         

	//   27   42:iload_1         
	//   28   43:iconst_1        
	//   29   44:iadd            
	//   30   45:istore_1        
	//*  31   46:goto            12
		return ((int []) (aobj));
	//   32   49:aload_2         
	//   33   50:areturn         
	}

	public void setSampleOffsetUs(long l)
	{
		SampleQueue asamplequeue[] = sampleQueues;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SampleQueue[] sampleQueues>
	//    2    4:astore          5
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		for(int j = asamplequeue.length; i < j; i++)
	//*   5    8:aload           5
	//*   6   10:arraylength     
	//*   7   11:istore          4
	//*   8   13:iload_3         
	//*   9   14:iload           4
	//*  10   16:icmpge          43
		{
			SampleQueue samplequeue = asamplequeue[i];
	//   11   19:aload           5
	//   12   21:iload_3         
	//   13   22:aaload          
	//   14   23:astore          6
			if(samplequeue != null)
	//*  15   25:aload           6
	//*  16   27:ifnull          36
				samplequeue.setSampleOffsetUs(l);
	//   17   30:aload           6
	//   18   32:lload_1         
	//   19   33:invokevirtual   #36  <Method void SampleQueue.setSampleOffsetUs(long)>
		}

	//   20   36:iload_3         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:istore_3        
	//*  24   40:goto            13
	//   25   43:return          
	}

	public TrackOutput track(int i, int j)
	{
		for(i = 0; i < trackTypes.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #21  <Field int[] trackTypes>
	//*   5    7:arraylength     
	//*   6    8:icmpge          35
			if(j == trackTypes[i])
	//*   7   11:iload_2         
	//*   8   12:aload_0         
	//*   9   13:getfield        #21  <Field int[] trackTypes>
	//*  10   16:iload_1         
	//*  11   17:iaload          
	//*  12   18:icmpne          28
				return ((TrackOutput) (sampleQueues[i]));
	//   13   21:aload_0         
	//   14   22:getfield        #23  <Field SampleQueue[] sampleQueues>
	//   15   25:iload_1         
	//   16   26:aaload          
	//   17   27:areturn         

	//   18   28:iload_1         
	//   19   29:iconst_1        
	//   20   30:iadd            
	//   21   31:istore_1        
	//*  22   32:goto            2
		StringBuilder stringbuilder = new StringBuilder();
	//   23   35:new             #40  <Class StringBuilder>
	//   24   38:dup             
	//   25   39:invokespecial   #41  <Method void StringBuilder()>
	//   26   42:astore_3        
		stringbuilder.append("Unmatched track of type: ");
	//   27   43:aload_3         
	//   28   44:ldc1            #43  <String "Unmatched track of type: ">
	//   29   46:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   30   49:pop             
		stringbuilder.append(j);
	//   31   50:aload_3         
	//   32   51:iload_2         
	//   33   52:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
	//   34   55:pop             
		Log.e("BaseMediaChunkOutput", stringbuilder.toString());
	//   35   56:ldc1            #10  <String "BaseMediaChunkOutput">
	//   36   58:aload_3         
	//   37   59:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   38   62:invokestatic    #60  <Method int Log.e(String, String)>
	//   39   65:pop             
		return ((TrackOutput) (new DummyTrackOutput()));
	//   40   66:new             #62  <Class DummyTrackOutput>
	//   41   69:dup             
	//   42   70:invokespecial   #63  <Method void DummyTrackOutput()>
	//   43   73:areturn         
	}

	private static final String TAG = "BaseMediaChunkOutput";
	private final SampleQueue sampleQueues[];
	private final int trackTypes[];
}
