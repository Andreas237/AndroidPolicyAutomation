// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.extractor:
//			SeekMap, SeekPoint

public final class ChunkIndex
	implements SeekMap
{

	public ChunkIndex(int ai[], long al[], long al1[], long al2[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		sizes = ai;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field int[] sizes>
		offsets = al;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field long[] offsets>
		durationsUs = al1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field long[] durationsUs>
		timesUs = al2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #29  <Field long[] timesUs>
		length = ai.length;
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:arraylength     
	//   17   28:putfield        #31  <Field int length>
		if(length > 0)
	//*  18   31:aload_0         
	//*  19   32:getfield        #31  <Field int length>
	//*  20   35:ifle            61
		{
			durationUs = al1[length - 1] + al2[length - 1];
	//   21   38:aload_0         
	//   22   39:aload_3         
	//   23   40:aload_0         
	//   24   41:getfield        #31  <Field int length>
	//   25   44:iconst_1        
	//   26   45:isub            
	//   27   46:laload          
	//   28   47:aload           4
	//   29   49:aload_0         
	//   30   50:getfield        #31  <Field int length>
	//   31   53:iconst_1        
	//   32   54:isub            
	//   33   55:laload          
	//   34   56:ladd            
	//   35   57:putfield        #33  <Field long durationUs>
			return;
	//   36   60:return          
		} else
		{
			durationUs = 0L;
	//   37   61:aload_0         
	//   38   62:lconst_0        
	//   39   63:putfield        #33  <Field long durationUs>
			return;
	//   40   66:return          
		}
	}

	public int getChunkIndex(long l)
	{
		return Util.binarySearchFloor(timesUs, l, true, true);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field long[] timesUs>
	//    2    4:lload_1         
	//    3    5:iconst_1        
	//    4    6:iconst_1        
	//    5    7:invokestatic    #42  <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
	//    6   10:ireturn         
	}

	public long getDurationUs()
	{
		return durationUs;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field long durationUs>
	//    2    4:lreturn         
	}

	public SeekMap.SeekPoints getSeekPoints(long l)
	{
		int i = getChunkIndex(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #48  <Method int getChunkIndex(long)>
	//    3    5:istore_3        
		SeekPoint seekpoint = new SeekPoint(timesUs[i], offsets[i]);
	//    4    6:new             #50  <Class SeekPoint>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:getfield        #29  <Field long[] timesUs>
	//    8   14:iload_3         
	//    9   15:laload          
	//   10   16:aload_0         
	//   11   17:getfield        #25  <Field long[] offsets>
	//   12   20:iload_3         
	//   13   21:laload          
	//   14   22:invokespecial   #53  <Method void SeekPoint(long, long)>
	//   15   25:astore          4
		if(seekpoint.timeUs < l && i != length - 1)
	//*  16   27:aload           4
	//*  17   29:getfield        #56  <Field long SeekPoint.timeUs>
	//*  18   32:lload_1         
	//*  19   33:lcmp            
	//*  20   34:ifge            87
	//*  21   37:iload_3         
	//*  22   38:aload_0         
	//*  23   39:getfield        #31  <Field int length>
	//*  24   42:iconst_1        
	//*  25   43:isub            
	//*  26   44:icmpne          50
	//*  27   47:goto            87
		{
			long al[] = timesUs;
	//   28   50:aload_0         
	//   29   51:getfield        #29  <Field long[] timesUs>
	//   30   54:astore          5
			i++;
	//   31   56:iload_3         
	//   32   57:iconst_1        
	//   33   58:iadd            
	//   34   59:istore_3        
			return new SeekMap.SeekPoints(seekpoint, new SeekPoint(al[i], offsets[i]));
	//   35   60:new             #58  <Class SeekMap$SeekPoints>
	//   36   63:dup             
	//   37   64:aload           4
	//   38   66:new             #50  <Class SeekPoint>
	//   39   69:dup             
	//   40   70:aload           5
	//   41   72:iload_3         
	//   42   73:laload          
	//   43   74:aload_0         
	//   44   75:getfield        #25  <Field long[] offsets>
	//   45   78:iload_3         
	//   46   79:laload          
	//   47   80:invokespecial   #53  <Method void SeekPoint(long, long)>
	//   48   83:invokespecial   #61  <Method void SeekMap$SeekPoints(SeekPoint, SeekPoint)>
	//   49   86:areturn         
		} else
		{
			return new SeekMap.SeekPoints(seekpoint);
	//   50   87:new             #58  <Class SeekMap$SeekPoints>
	//   51   90:dup             
	//   52   91:aload           4
	//   53   93:invokespecial   #64  <Method void SeekMap$SeekPoints(SeekPoint)>
	//   54   96:areturn         
		}
	}

	public boolean isSeekable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #70  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ChunkIndex(length=");
	//    4    8:aload_1         
	//    5    9:ldc1            #73  <String "ChunkIndex(length=">
	//    6   11:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(length);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #31  <Field int length>
	//   11   20:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(", sizes=");
	//   13   24:aload_1         
	//   14   25:ldc1            #82  <String ", sizes=">
	//   15   27:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(Arrays.toString(sizes));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #23  <Field int[] sizes>
	//   20   36:invokestatic    #87  <Method String Arrays.toString(int[])>
	//   21   39:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		stringbuilder.append(", offsets=");
	//   23   43:aload_1         
	//   24   44:ldc1            #89  <String ", offsets=">
	//   25   46:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		stringbuilder.append(Arrays.toString(offsets));
	//   27   50:aload_1         
	//   28   51:aload_0         
	//   29   52:getfield        #25  <Field long[] offsets>
	//   30   55:invokestatic    #92  <Method String Arrays.toString(long[])>
	//   31   58:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   32   61:pop             
		stringbuilder.append(", timeUs=");
	//   33   62:aload_1         
	//   34   63:ldc1            #94  <String ", timeUs=">
	//   35   65:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
		stringbuilder.append(Arrays.toString(timesUs));
	//   37   69:aload_1         
	//   38   70:aload_0         
	//   39   71:getfield        #29  <Field long[] timesUs>
	//   40   74:invokestatic    #92  <Method String Arrays.toString(long[])>
	//   41   77:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   42   80:pop             
		stringbuilder.append(", durationsUs=");
	//   43   81:aload_1         
	//   44   82:ldc1            #96  <String ", durationsUs=">
	//   45   84:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   46   87:pop             
		stringbuilder.append(Arrays.toString(durationsUs));
	//   47   88:aload_1         
	//   48   89:aload_0         
	//   49   90:getfield        #27  <Field long[] durationsUs>
	//   50   93:invokestatic    #92  <Method String Arrays.toString(long[])>
	//   51   96:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   52   99:pop             
		stringbuilder.append(")");
	//   53  100:aload_1         
	//   54  101:ldc1            #98  <String ")">
	//   55  103:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   56  106:pop             
		return stringbuilder.toString();
	//   57  107:aload_1         
	//   58  108:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   59  111:areturn         
	}

	private final long durationUs;
	public final long durationsUs[];
	public final int length;
	public final long offsets[];
	public final int sizes[];
	public final long timesUs[];
}
