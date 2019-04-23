// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import com.google.android.exoplayer.extractor.SeekMap;

// Referenced classes of package com.google.android.exoplayer.util:
//			ParsableByteArray, Util

public final class FlacSeekTable
{

	private FlacSeekTable(long al[], long al1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		sampleNumbers = al;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field long[] sampleNumbers>
		offsets = al1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field long[] offsets>
	//    8   14:return          
	}

	public static FlacSeekTable parseSeekTable(ParsableByteArray parsablebytearray)
	{
		parsablebytearray.skipBytes(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #35  <Method void ParsableByteArray.skipBytes(int)>
		int j = parsablebytearray.readUnsignedInt24() / 18;
	//    3    5:aload_0         
	//    4    6:invokevirtual   #39  <Method int ParsableByteArray.readUnsignedInt24()>
	//    5    9:bipush          18
	//    6   11:idiv            
	//    7   12:istore_2        
		long al[] = new long[j];
	//    8   13:iload_2         
	//    9   14:newarray        long[]
	//   10   16:astore_3        
		long al1[] = new long[j];
	//   11   17:iload_2         
	//   12   18:newarray        long[]
	//   13   20:astore          4
		for(int i = 0; i < j; i++)
	//*  14   22:iconst_0        
	//*  15   23:istore_1        
	//*  16   24:iload_1         
	//*  17   25:iload_2         
	//*  18   26:icmpge          56
		{
			al[i] = parsablebytearray.readLong();
	//   19   29:aload_3         
	//   20   30:iload_1         
	//   21   31:aload_0         
	//   22   32:invokevirtual   #43  <Method long ParsableByteArray.readLong()>
	//   23   35:lastore         
			al1[i] = parsablebytearray.readLong();
	//   24   36:aload           4
	//   25   38:iload_1         
	//   26   39:aload_0         
	//   27   40:invokevirtual   #43  <Method long ParsableByteArray.readLong()>
	//   28   43:lastore         
			parsablebytearray.skipBytes(2);
	//   29   44:aload_0         
	//   30   45:iconst_2        
	//   31   46:invokevirtual   #35  <Method void ParsableByteArray.skipBytes(int)>
		}

	//   32   49:iload_1         
	//   33   50:iconst_1        
	//   34   51:iadd            
	//   35   52:istore_1        
	//*  36   53:goto            24
		return new FlacSeekTable(al, al1);
	//   37   56:new             #2   <Class FlacSeekTable>
	//   38   59:dup             
	//   39   60:aload_3         
	//   40   61:aload           4
	//   41   63:invokespecial   #45  <Method void FlacSeekTable(long[], long[])>
	//   42   66:areturn         
	}

	public SeekMap createSeekMap(final long firstFrameOffset, final long sampleRate)
	{
		return new SeekMap() {

			public long getPosition(long l)
			{
				l = (l * sampleRate) / 0xf4240L;
			//    0    0:lload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #22  <Field long val$sampleRate>
			//    3    5:lmul            
			//    4    6:ldc2w           #31  <Long 0xf4240L>
			//    5    9:ldiv            
			//    6   10:lstore_1        
				int i = Util.binarySearchFloor(sampleNumbers, l, true, true);
			//    7   11:aload_0         
			//    8   12:getfield        #20  <Field FlacSeekTable this$0>
			//    9   15:invokestatic    #36  <Method long[] FlacSeekTable.access$000(FlacSeekTable)>
			//   10   18:lload_1         
			//   11   19:iconst_1        
			//   12   20:iconst_1        
			//   13   21:invokestatic    #42  <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
			//   14   24:istore_3        
				return firstFrameOffset + offsets[i];
			//   15   25:aload_0         
			//   16   26:getfield        #24  <Field long val$firstFrameOffset>
			//   17   29:aload_0         
			//   18   30:getfield        #20  <Field FlacSeekTable this$0>
			//   19   33:invokestatic    #45  <Method long[] FlacSeekTable.access$100(FlacSeekTable)>
			//   20   36:iload_3         
			//   21   37:laload          
			//   22   38:ladd            
			//   23   39:lreturn         
			}

			public boolean isSeekable()
			{
				return true;
			//    0    0:iconst_1        
			//    1    1:ireturn         
			}

			final FlacSeekTable this$0;
			final long val$firstFrameOffset;
			final long val$sampleRate;

			
			{
				this$0 = FlacSeekTable.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field FlacSeekTable this$0>
				sampleRate = l;
			//    3    5:aload_0         
			//    4    6:lload_2         
			//    5    7:putfield        #22  <Field long val$sampleRate>
				firstFrameOffset = l1;
			//    6   10:aload_0         
			//    7   11:lload           4
			//    8   13:putfield        #24  <Field long val$firstFrameOffset>
				super();
			//    9   16:aload_0         
			//   10   17:invokespecial   #27  <Method void Object()>
			//   11   20:return          
			}
		}
;
	//    0    0:new             #6   <Class FlacSeekTable$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:lload_3         
	//    4    6:lload_1         
	//    5    7:invokespecial   #50  <Method void FlacSeekTable$1(FlacSeekTable, long, long)>
	//    6   10:areturn         
	}

	private static final int METADATA_LENGTH_OFFSET = 1;
	private static final int SEEK_POINT_SIZE = 18;
	private final long offsets[];
	private final long sampleNumbers[];


/*
	static long[] access$000(FlacSeekTable flacseektable)
	{
		return flacseektable.sampleNumbers;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field long[] sampleNumbers>
	//    2    4:areturn         
	}

*/


/*
	static long[] access$100(FlacSeekTable flacseektable)
	{
		return flacseektable.offsets;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field long[] offsets>
	//    2    4:areturn         
	}

*/
}
