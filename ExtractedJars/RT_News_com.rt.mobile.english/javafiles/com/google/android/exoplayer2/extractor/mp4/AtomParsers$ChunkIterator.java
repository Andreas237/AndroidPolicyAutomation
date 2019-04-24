// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			AtomParsers

private static final class AtomParsers$ChunkIterator
{

	public boolean moveNext()
	{
		int i = index + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int index>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:istore_1        
		index = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #58  <Field int index>
		if(i == length)
	//*   8   12:iload_1         
	//*   9   13:aload_0         
	//*  10   14:getfield        #43  <Field int length>
	//*  11   17:icmpne          22
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		long l;
		if(chunkOffsetsAreLongs)
	//*  14   22:aload_0         
	//*  15   23:getfield        #31  <Field boolean chunkOffsetsAreLongs>
	//*  16   26:ifeq            40
			l = chunkOffsets.readUnsignedLongToLong();
	//   17   29:aload_0         
	//   18   30:getfield        #29  <Field ParsableByteArray chunkOffsets>
	//   19   33:invokevirtual   #65  <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   20   36:lstore_2        
		else
	//*  21   37:goto            48
			l = chunkOffsets.readUnsignedInt();
	//   22   40:aload_0         
	//   23   41:getfield        #29  <Field ParsableByteArray chunkOffsets>
	//   24   44:invokevirtual   #68  <Method long ParsableByteArray.readUnsignedInt()>
	//   25   47:lstore_2        
		offset = l;
	//   26   48:aload_0         
	//   27   49:lload_2         
	//   28   50:putfield        #70  <Field long offset>
		if(index == nextSamplesPerChunkChangeIndex)
	//*  29   53:aload_0         
	//*  30   54:getfield        #58  <Field int index>
	//*  31   57:aload_0         
	//*  32   58:getfield        #72  <Field int nextSamplesPerChunkChangeIndex>
	//*  33   61:icmpne          119
		{
			numSamples = stsc.readUnsignedIntToInt();
	//   34   64:aload_0         
	//   35   65:aload_0         
	//   36   66:getfield        #27  <Field ParsableByteArray stsc>
	//   37   69:invokevirtual   #41  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   38   72:putfield        #74  <Field int numSamples>
			stsc.skipBytes(4);
	//   39   75:aload_0         
	//   40   76:getfield        #27  <Field ParsableByteArray stsc>
	//   41   79:iconst_4        
	//   42   80:invokevirtual   #77  <Method void ParsableByteArray.skipBytes(int)>
			int j = remainingSamplesPerChunkChanges - 1;
	//   43   83:aload_0         
	//   44   84:getfield        #45  <Field int remainingSamplesPerChunkChanges>
	//   45   87:iconst_1        
	//   46   88:isub            
	//   47   89:istore_1        
			remainingSamplesPerChunkChanges = j;
	//   48   90:aload_0         
	//   49   91:iload_1         
	//   50   92:putfield        #45  <Field int remainingSamplesPerChunkChanges>
			if(j > 0)
	//*  51   95:iload_1         
	//*  52   96:ifle            112
				j = stsc.readUnsignedIntToInt() - 1;
	//   53   99:aload_0         
	//   54  100:getfield        #27  <Field ParsableByteArray stsc>
	//   55  103:invokevirtual   #41  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   56  106:iconst_1        
	//   57  107:isub            
	//   58  108:istore_1        
			else
	//*  59  109:goto            114
				j = -1;
	//   60  112:iconst_m1       
	//   61  113:istore_1        
			nextSamplesPerChunkChangeIndex = j;
	//   62  114:aload_0         
	//   63  115:iload_1         
	//   64  116:putfield        #72  <Field int nextSamplesPerChunkChangeIndex>
		}
		return true;
	//   65  119:iconst_1        
	//   66  120:ireturn         
	}

	private final ParsableByteArray chunkOffsets;
	private final boolean chunkOffsetsAreLongs;
	public int index;
	public final int length;
	private int nextSamplesPerChunkChangeIndex;
	public int numSamples;
	public long offset;
	private int remainingSamplesPerChunkChanges;
	private final ParsableByteArray stsc;

	public AtomParsers$ChunkIterator(ParsableByteArray parsablebytearray, ParsableByteArray parsablebytearray1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		stsc = parsablebytearray;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field ParsableByteArray stsc>
		chunkOffsets = parsablebytearray1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field ParsableByteArray chunkOffsets>
		chunkOffsetsAreLongs = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #31  <Field boolean chunkOffsetsAreLongs>
		parsablebytearray1.setPosition(12);
	//   11   19:aload_2         
	//   12   20:bipush          12
	//   13   22:invokevirtual   #37  <Method void ParsableByteArray.setPosition(int)>
		length = parsablebytearray1.readUnsignedIntToInt();
	//   14   25:aload_0         
	//   15   26:aload_2         
	//   16   27:invokevirtual   #41  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   17   30:putfield        #43  <Field int length>
		parsablebytearray.setPosition(12);
	//   18   33:aload_1         
	//   19   34:bipush          12
	//   20   36:invokevirtual   #37  <Method void ParsableByteArray.setPosition(int)>
		remainingSamplesPerChunkChanges = parsablebytearray.readUnsignedIntToInt();
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:invokevirtual   #41  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   24   44:putfield        #45  <Field int remainingSamplesPerChunkChanges>
		int i = parsablebytearray.readInt();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #48  <Method int ParsableByteArray.readInt()>
	//   27   51:istore          4
		flag = true;
	//   28   53:iconst_1        
	//   29   54:istore_3        
		if(i != 1)
	//*  30   55:iload           4
	//*  31   57:iconst_1        
	//*  32   58:icmpne          64
	//*  33   61:goto            66
			flag = false;
	//   34   64:iconst_0        
	//   35   65:istore_3        
		Assertions.checkState(flag, "first_chunk must be 1");
	//   36   66:iload_3         
	//   37   67:ldc1            #50  <String "first_chunk must be 1">
	//   38   69:invokestatic    #56  <Method void Assertions.checkState(boolean, Object)>
		index = -1;
	//   39   72:aload_0         
	//   40   73:iconst_m1       
	//   41   74:putfield        #58  <Field int index>
	//   42   77:return          
	}
}
