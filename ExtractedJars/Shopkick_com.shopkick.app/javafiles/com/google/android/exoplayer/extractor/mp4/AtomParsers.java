// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.GaplessInfo;
import com.google.android.exoplayer.util.*;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//			Atom, TrackEncryptionBox, TrackSampleTable, Track, 
//			FixedSampleSizeRechunker

final class AtomParsers
{
	private static final class AvcCData
	{

		public final List initializationData;
		public final int nalUnitLengthFieldLength;
		public final float pixelWidthAspectRatio;

		public AvcCData(List list, int i, float f)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			initializationData = list;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field List initializationData>
			nalUnitLengthFieldLength = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #23  <Field int nalUnitLengthFieldLength>
			pixelWidthAspectRatio = f;
		//    8   14:aload_0         
		//    9   15:fload_3         
		//   10   16:putfield        #25  <Field float pixelWidthAspectRatio>
		//   11   19:return          
		}
	}

	private static final class ChunkIterator
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

		public ChunkIterator(ParsableByteArray parsablebytearray, ParsableByteArray parsablebytearray1, boolean flag)
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

	private static interface SampleSizeBox
	{

		public abstract int getSampleCount();

		public abstract boolean isFixedSampleSize();

		public abstract int readNextSampleSize();
	}

	private static final class StsdData
	{

		public MediaFormat mediaFormat;
		public int nalUnitLengthFieldLength;
		public final TrackEncryptionBox trackEncryptionBoxes[];

		public StsdData(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			trackEncryptionBoxes = new TrackEncryptionBox[i];
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:anewarray       TrackEncryptionBox[]
		//    5    9:putfield        #22  <Field TrackEncryptionBox[] trackEncryptionBoxes>
			nalUnitLengthFieldLength = -1;
		//    6   12:aload_0         
		//    7   13:iconst_m1       
		//    8   14:putfield        #24  <Field int nalUnitLengthFieldLength>
		//    9   17:return          
		}
	}

	static final class StszSampleSizeBox
		implements SampleSizeBox
	{

		public int getSampleCount()
		{
			return sampleCount;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field int sampleCount>
		//    2    4:ireturn         
		}

		public boolean isFixedSampleSize()
		{
			return fixedSampleSize != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field int fixedSampleSize>
		//    2    4:ifeq            9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public int readNextSampleSize()
		{
			int j = fixedSampleSize;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field int fixedSampleSize>
		//    2    4:istore_2        
			int i = j;
		//    3    5:iload_2         
		//    4    6:istore_1        
			if(j == 0)
		//*   5    7:iload_2         
		//*   6    8:ifne            19
				i = data.readUnsignedIntToInt();
		//    7   11:aload_0         
		//    8   12:getfield        #24  <Field ParsableByteArray data>
		//    9   15:invokevirtual   #34  <Method int ParsableByteArray.readUnsignedIntToInt()>
		//   10   18:istore_1        
			return i;
		//   11   19:iload_1         
		//   12   20:ireturn         
		}

		private final ParsableByteArray data;
		private final int fixedSampleSize;
		private final int sampleCount;

		public StszSampleSizeBox(Atom.LeafAtom leafatom)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			data = leafatom.data;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #23  <Field ParsableByteArray Atom$LeafAtom.data>
		//    5    9:putfield        #24  <Field ParsableByteArray data>
			data.setPosition(12);
		//    6   12:aload_0         
		//    7   13:getfield        #24  <Field ParsableByteArray data>
		//    8   16:bipush          12
		//    9   18:invokevirtual   #30  <Method void ParsableByteArray.setPosition(int)>
			fixedSampleSize = data.readUnsignedIntToInt();
		//   10   21:aload_0         
		//   11   22:aload_0         
		//   12   23:getfield        #24  <Field ParsableByteArray data>
		//   13   26:invokevirtual   #34  <Method int ParsableByteArray.readUnsignedIntToInt()>
		//   14   29:putfield        #36  <Field int fixedSampleSize>
			sampleCount = data.readUnsignedIntToInt();
		//   15   32:aload_0         
		//   16   33:aload_0         
		//   17   34:getfield        #24  <Field ParsableByteArray data>
		//   18   37:invokevirtual   #34  <Method int ParsableByteArray.readUnsignedIntToInt()>
		//   19   40:putfield        #38  <Field int sampleCount>
		//   20   43:return          
		}
	}

	static final class Stz2SampleSizeBox
		implements SampleSizeBox
	{

		public int getSampleCount()
		{
			return sampleCount;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field int sampleCount>
		//    2    4:ireturn         
		}

		public boolean isFixedSampleSize()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int readNextSampleSize()
		{
			int i = fieldSize;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field int fieldSize>
		//    2    4:istore_1        
			if(i == 8)
		//*   3    5:iload_1         
		//*   4    6:bipush          8
		//*   5    8:icmpne          19
				return data.readUnsignedByte();
		//    6   11:aload_0         
		//    7   12:getfield        #26  <Field ParsableByteArray data>
		//    8   15:invokevirtual   #48  <Method int ParsableByteArray.readUnsignedByte()>
		//    9   18:ireturn         
			if(i == 16)
		//*  10   19:iload_1         
		//*  11   20:bipush          16
		//*  12   22:icmpne          33
				return data.readUnsignedShort();
		//   13   25:aload_0         
		//   14   26:getfield        #26  <Field ParsableByteArray data>
		//   15   29:invokevirtual   #51  <Method int ParsableByteArray.readUnsignedShort()>
		//   16   32:ireturn         
			i = sampleIndex;
		//   17   33:aload_0         
		//   18   34:getfield        #53  <Field int sampleIndex>
		//   19   37:istore_1        
			sampleIndex = i + 1;
		//   20   38:aload_0         
		//   21   39:iload_1         
		//   22   40:iconst_1        
		//   23   41:iadd            
		//   24   42:putfield        #53  <Field int sampleIndex>
			if(i % 2 == 0)
		//*  25   45:iload_1         
		//*  26   46:iconst_2        
		//*  27   47:irem            
		//*  28   48:ifne            73
			{
				currentByte = data.readUnsignedByte();
		//   29   51:aload_0         
		//   30   52:aload_0         
		//   31   53:getfield        #26  <Field ParsableByteArray data>
		//   32   56:invokevirtual   #48  <Method int ParsableByteArray.readUnsignedByte()>
		//   33   59:putfield        #55  <Field int currentByte>
				return (currentByte & 0xf0) >> 4;
		//   34   62:aload_0         
		//   35   63:getfield        #55  <Field int currentByte>
		//   36   66:sipush          240
		//   37   69:iand            
		//   38   70:iconst_4        
		//   39   71:ishr            
		//   40   72:ireturn         
			} else
			{
				return currentByte & 0xf;
		//   41   73:aload_0         
		//   42   74:getfield        #55  <Field int currentByte>
		//   43   77:bipush          15
		//   44   79:iand            
		//   45   80:ireturn         
			}
		}

		private int currentByte;
		private final ParsableByteArray data;
		private final int fieldSize;
		private final int sampleCount;
		private int sampleIndex;

		public Stz2SampleSizeBox(Atom.LeafAtom leafatom)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			data = leafatom.data;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #25  <Field ParsableByteArray Atom$LeafAtom.data>
		//    5    9:putfield        #26  <Field ParsableByteArray data>
			data.setPosition(12);
		//    6   12:aload_0         
		//    7   13:getfield        #26  <Field ParsableByteArray data>
		//    8   16:bipush          12
		//    9   18:invokevirtual   #32  <Method void ParsableByteArray.setPosition(int)>
			fieldSize = data.readUnsignedIntToInt() & 0xff;
		//   10   21:aload_0         
		//   11   22:aload_0         
		//   12   23:getfield        #26  <Field ParsableByteArray data>
		//   13   26:invokevirtual   #36  <Method int ParsableByteArray.readUnsignedIntToInt()>
		//   14   29:sipush          255
		//   15   32:iand            
		//   16   33:putfield        #38  <Field int fieldSize>
			sampleCount = data.readUnsignedIntToInt();
		//   17   36:aload_0         
		//   18   37:aload_0         
		//   19   38:getfield        #26  <Field ParsableByteArray data>
		//   20   41:invokevirtual   #36  <Method int ParsableByteArray.readUnsignedIntToInt()>
		//   21   44:putfield        #40  <Field int sampleCount>
		//   22   47:return          
		}
	}

	private static final class TkhdData
	{

		private final long duration;
		private final int id;
		private final int rotationDegrees;


/*
		static long access$000(TkhdData tkhddata)
		{
			return tkhddata.duration;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field long duration>
		//    2    4:lreturn         
		}

*/


/*
		static int access$100(TkhdData tkhddata)
		{
			return tkhddata.id;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field int id>
		//    2    4:ireturn         
		}

*/


/*
		static int access$200(TkhdData tkhddata)
		{
			return tkhddata.rotationDegrees;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field int rotationDegrees>
		//    2    4:ireturn         
		}

*/

		public TkhdData(int i, long l, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			id = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #19  <Field int id>
			duration = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #21  <Field long duration>
			rotationDegrees = j;
		//    8   14:aload_0         
		//    9   15:iload           4
		//   10   17:putfield        #23  <Field int rotationDegrees>
		//   11   20:return          
		}
	}


	private AtomParsers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
	//    2    4:return          
	}

	private static int findEsdsPosition(ParsableByteArray parsablebytearray, int i, int j)
	{
		int l;
		for(int k = parsablebytearray.getPosition(); k - i < j; k += l)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #55  <Method int ParsableByteArray.getPosition()>
	//*   2    4:istore_3        
	//*   3    5:iload_3         
	//*   4    6:iload_1         
	//*   5    7:isub            
	//*   6    8:iload_2         
	//*   7    9:icmpge          64
		{
			parsablebytearray.setPosition(k);
	//    8   12:aload_0         
	//    9   13:iload_3         
	//   10   14:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
			l = parsablebytearray.readInt();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   13   21:istore          4
			boolean flag;
			if(l > 0)
	//*  14   23:iload           4
	//*  15   25:ifle            34
				flag = true;
	//   16   28:iconst_1        
	//   17   29:istore          5
			else
	//*  18   31:goto            37
				flag = false;
	//   19   34:iconst_0        
	//   20   35:istore          5
			Assertions.checkArgument(flag, "childAtomSize should be positive");
	//   21   37:iload           5
	//   22   39:ldc1            #64  <String "childAtomSize should be positive">
	//   23   41:invokestatic    #70  <Method void Assertions.checkArgument(boolean, Object)>
			if(parsablebytearray.readInt() == Atom.TYPE_esds)
	//*  24   44:aload_0         
	//*  25   45:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//*  26   48:getstatic       #75  <Field int Atom.TYPE_esds>
	//*  27   51:icmpne          56
				return k;
	//   28   54:iload_3         
	//   29   55:ireturn         
		}

	//   30   56:iload_3         
	//   31   57:iload           4
	//   32   59:iadd            
	//   33   60:istore_3        
	//*  34   61:goto            5
		return -1;
	//   35   64:iconst_m1       
	//   36   65:ireturn         
	}

	private static void parseAudioSampleEntry(ParsableByteArray parsablebytearray, int i, int j, int k, int l, long l1, String s, 
			boolean flag, StsdData stsddata, int i1)
	{
		StsdData stsddata1 = stsddata;
	//    0    0:aload           9
	//    1    2:astore          19
		parsablebytearray.setPosition(j + 8);
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:bipush          8
	//    5    8:iadd            
	//    6    9:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
		int i2;
		if(flag)
	//*   7   12:iload           8
	//*   8   14:ifeq            38
		{
			parsablebytearray.skipBytes(8);
	//    9   17:aload_0         
	//   10   18:bipush          8
	//   11   20:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
			i2 = parsablebytearray.readUnsignedShort();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #83  <Method int ParsableByteArray.readUnsignedShort()>
	//   14   27:istore          13
			parsablebytearray.skipBytes(6);
	//   15   29:aload_0         
	//   16   30:bipush          6
	//   17   32:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
		} else
	//*  18   35:goto            47
		{
			parsablebytearray.skipBytes(16);
	//   19   38:aload_0         
	//   20   39:bipush          16
	//   21   41:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
			i2 = 0;
	//   22   44:iconst_0        
	//   23   45:istore          13
		}
		byte byte0 = 2;
	//   24   47:iconst_2        
	//   25   48:istore          14
		boolean flag1 = true;
	//   26   50:iconst_1        
	//   27   51:istore          17
		int j1;
		int k1;
		if(i2 != 0 && i2 != 1)
	//*  28   53:iload           13
	//*  29   55:ifeq            105
	//*  30   58:iload           13
	//*  31   60:iconst_1        
	//*  32   61:icmpne          67
	//*  33   64:goto            105
		{
			if(i2 == 2)
	//*  34   67:iload           13
	//*  35   69:iconst_2        
	//*  36   70:icmpne          104
			{
				parsablebytearray.skipBytes(16);
	//   37   73:aload_0         
	//   38   74:bipush          16
	//   39   76:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
				k1 = (int)Math.round(parsablebytearray.readDouble());
	//   40   79:aload_0         
	//   41   80:invokevirtual   #87  <Method double ParsableByteArray.readDouble()>
	//   42   83:invokestatic    #93  <Method long Math.round(double)>
	//   43   86:l2i             
	//   44   87:istore          12
				j1 = parsablebytearray.readUnsignedIntToInt();
	//   45   89:aload_0         
	//   46   90:invokevirtual   #96  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   47   93:istore          11
				parsablebytearray.skipBytes(20);
	//   48   95:aload_0         
	//   49   96:bipush          20
	//   50   98:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
			} else
	//*  51  101:goto            151
			{
				return;
	//   52  104:return          
			}
		} else
		{
			int l2 = parsablebytearray.readUnsignedShort();
	//   53  105:aload_0         
	//   54  106:invokevirtual   #83  <Method int ParsableByteArray.readUnsignedShort()>
	//   55  109:istore          15
			parsablebytearray.skipBytes(6);
	//   56  111:aload_0         
	//   57  112:bipush          6
	//   58  114:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
			int j3 = parsablebytearray.readUnsignedFixedPoint1616();
	//   59  117:aload_0         
	//   60  118:invokevirtual   #99  <Method int ParsableByteArray.readUnsignedFixedPoint1616()>
	//   61  121:istore          16
			k1 = j3;
	//   62  123:iload           16
	//   63  125:istore          12
			j1 = l2;
	//   64  127:iload           15
	//   65  129:istore          11
			if(i2 == 1)
	//*  66  131:iload           13
	//*  67  133:iconst_1        
	//*  68  134:icmpne          151
			{
				parsablebytearray.skipBytes(16);
	//   69  137:aload_0         
	//   70  138:bipush          16
	//   71  140:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
				j1 = l2;
	//   72  143:iload           15
	//   73  145:istore          11
				k1 = j3;
	//   74  147:iload           16
	//   75  149:istore          12
			}
		}
		i2 = parsablebytearray.getPosition();
	//   76  151:aload_0         
	//   77  152:invokevirtual   #55  <Method int ParsableByteArray.getPosition()>
	//   78  155:istore          13
		if(i == Atom.TYPE_enca)
	//*  79  157:iload_1         
	//*  80  158:getstatic       #102 <Field int Atom.TYPE_enca>
	//*  81  161:icmpne          184
		{
			i = parseSampleEntryEncryptionData(parsablebytearray, j, k, stsddata1, i1);
	//   82  164:aload_0         
	//   83  165:iload_2         
	//   84  166:iload_3         
	//   85  167:aload           19
	//   86  169:iload           10
	//   87  171:invokestatic    #106 <Method int parseSampleEntryEncryptionData(ParsableByteArray, int, int, AtomParsers$StsdData, int)>
	//   88  174:istore_1        
			parsablebytearray.setPosition(i2);
	//   89  175:aload_0         
	//   90  176:iload           13
	//   91  178:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
		}
	//*  92  181:goto            184
		if(i == Atom.TYPE_ac_3)
	//*  93  184:iload_1         
	//*  94  185:getstatic       #109 <Field int Atom.TYPE_ac_3>
	//*  95  188:icmpne          198
			stsddata = "audio/ac3";
	//   96  191:ldc1            #111 <String "audio/ac3">
	//   97  193:astore          9
		else
	//*  98  195:goto            333
		if(i == Atom.TYPE_ec_3)
	//*  99  198:iload_1         
	//* 100  199:getstatic       #114 <Field int Atom.TYPE_ec_3>
	//* 101  202:icmpne          212
			stsddata = "audio/eac3";
	//  102  205:ldc1            #116 <String "audio/eac3">
	//  103  207:astore          9
		else
	//* 104  209:goto            333
		if(i == Atom.TYPE_dtsc)
	//* 105  212:iload_1         
	//* 106  213:getstatic       #119 <Field int Atom.TYPE_dtsc>
	//* 107  216:icmpne          226
			stsddata = "audio/vnd.dts";
	//  108  219:ldc1            #121 <String "audio/vnd.dts">
	//  109  221:astore          9
		else
	//* 110  223:goto            333
		if(i != Atom.TYPE_dtsh && i != Atom.TYPE_dtsl)
	//* 111  226:iload_1         
	//* 112  227:getstatic       #124 <Field int Atom.TYPE_dtsh>
	//* 113  230:icmpeq          329
	//* 114  233:iload_1         
	//* 115  234:getstatic       #127 <Field int Atom.TYPE_dtsl>
	//* 116  237:icmpne          243
	//* 117  240:goto            329
		{
			if(i == Atom.TYPE_dtse)
	//* 118  243:iload_1         
	//* 119  244:getstatic       #130 <Field int Atom.TYPE_dtse>
	//* 120  247:icmpne          257
				stsddata = "audio/vnd.dts.hd;profile=lbr";
	//  121  250:ldc1            #132 <String "audio/vnd.dts.hd;profile=lbr">
	//  122  252:astore          9
			else
	//* 123  254:goto            333
			if(i == Atom.TYPE_samr)
	//* 124  257:iload_1         
	//* 125  258:getstatic       #135 <Field int Atom.TYPE_samr>
	//* 126  261:icmpne          271
				stsddata = "audio/3gpp";
	//  127  264:ldc1            #137 <String "audio/3gpp">
	//  128  266:astore          9
			else
	//* 129  268:goto            333
			if(i == Atom.TYPE_sawb)
	//* 130  271:iload_1         
	//* 131  272:getstatic       #140 <Field int Atom.TYPE_sawb>
	//* 132  275:icmpne          285
				stsddata = "audio/amr-wb";
	//  133  278:ldc1            #142 <String "audio/amr-wb">
	//  134  280:astore          9
			else
	//* 135  282:goto            333
			if(i != Atom.TYPE_lpcm && i != Atom.TYPE_sowt)
	//* 136  285:iload_1         
	//* 137  286:getstatic       #145 <Field int Atom.TYPE_lpcm>
	//* 138  289:icmpeq          322
	//* 139  292:iload_1         
	//* 140  293:getstatic       #148 <Field int Atom.TYPE_sowt>
	//* 141  296:icmpne          302
	//* 142  299:goto            322
			{
				if(i == Atom.TYPE__mp3)
	//* 143  302:iload_1         
	//* 144  303:getstatic       #151 <Field int Atom.TYPE__mp3>
	//* 145  306:icmpne          316
					stsddata = "audio/mpeg";
	//  146  309:ldc1            #153 <String "audio/mpeg">
	//  147  311:astore          9
				else
	//* 148  313:goto            333
					stsddata = null;
	//  149  316:aconst_null     
	//  150  317:astore          9
			} else
	//* 151  319:goto            333
			{
				stsddata = "audio/raw";
	//  152  322:ldc1            #155 <String "audio/raw">
	//  153  324:astore          9
			}
		} else
	//* 154  326:goto            333
		{
			stsddata = "audio/vnd.dts.hd";
	//  155  329:ldc1            #157 <String "audio/vnd.dts.hd">
	//  156  331:astore          9
		}
		i = i2;
	//  157  333:iload           13
	//  158  335:istore_1        
		i1 = j1;
	//  159  336:iload           11
	//  160  338:istore          10
		byte abyte0[] = null;
	//  161  340:aconst_null     
	//  162  341:astore          20
		j1 = k1;
	//  163  343:iload           12
	//  164  345:istore          11
		k1 = i1;
	//  165  347:iload           10
	//  166  349:istore          12
		i1 = ((int) (byte0));
	//  167  351:iload           14
	//  168  353:istore          10
		int k2;
		int i3;
		for(; i - j < k; i = k2 + i3)
	//* 169  355:iload_1         
	//* 170  356:iload_2         
	//* 171  357:isub            
	//* 172  358:iload_3         
	//* 173  359:icmpge          695
		{
			parsablebytearray.setPosition(i);
	//  174  362:aload_0         
	//  175  363:iload_1         
	//  176  364:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
			int j2 = parsablebytearray.readInt();
	//  177  367:aload_0         
	//  178  368:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//  179  371:istore          13
			boolean flag2;
			if(j2 > 0)
	//* 180  373:iload           13
	//* 181  375:ifle            385
				flag2 = flag1;
	//  182  378:iload           17
	//  183  380:istore          18
			else
	//* 184  382:goto            388
				flag2 = false;
	//  185  385:iconst_0        
	//  186  386:istore          18
			Assertions.checkArgument(flag2, "childAtomSize should be positive");
	//  187  388:iload           18
	//  188  390:ldc1            #64  <String "childAtomSize should be positive">
	//  189  392:invokestatic    #70  <Method void Assertions.checkArgument(boolean, Object)>
			k2 = parsablebytearray.readInt();
	//  190  395:aload_0         
	//  191  396:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//  192  399:istore          14
			if(k2 != Atom.TYPE_esds && (!flag || k2 != Atom.TYPE_wave))
	//* 193  401:iload           14
	//* 194  403:getstatic       #75  <Field int Atom.TYPE_esds>
	//* 195  406:icmpeq          546
	//* 196  409:iload           8
	//* 197  411:ifeq            425
	//* 198  414:iload           14
	//* 199  416:getstatic       #160 <Field int Atom.TYPE_wave>
	//* 200  419:icmpne          425
	//* 201  422:goto            546
			{
				if(k2 == Atom.TYPE_dac3)
	//* 202  425:iload           14
	//* 203  427:getstatic       #163 <Field int Atom.TYPE_dac3>
	//* 204  430:icmpne          462
				{
					parsablebytearray.setPosition(i + 8);
	//  205  433:aload_0         
	//  206  434:iload_1         
	//  207  435:bipush          8
	//  208  437:iadd            
	//  209  438:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
					stsddata1.mediaFormat = Ac3Util.parseAc3AnnexFFormat(parsablebytearray, Integer.toString(l), l1, s);
	//  210  441:aload           19
	//  211  443:aload_0         
	//  212  444:iload           4
	//  213  446:invokestatic    #169 <Method String Integer.toString(int)>
	//  214  449:lload           5
	//  215  451:aload           7
	//  216  453:invokestatic    #175 <Method MediaFormat Ac3Util.parseAc3AnnexFFormat(ParsableByteArray, String, long, String)>
	//  217  456:putfield        #179 <Field MediaFormat AtomParsers$StsdData.mediaFormat>
				} else
	//* 218  459:goto            536
				if(k2 == Atom.TYPE_dec3)
	//* 219  462:iload           14
	//* 220  464:getstatic       #182 <Field int Atom.TYPE_dec3>
	//* 221  467:icmpne          499
				{
					parsablebytearray.setPosition(i + 8);
	//  222  470:aload_0         
	//  223  471:iload_1         
	//  224  472:bipush          8
	//  225  474:iadd            
	//  226  475:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
					stsddata1.mediaFormat = Ac3Util.parseEAc3AnnexFFormat(parsablebytearray, Integer.toString(l), l1, s);
	//  227  478:aload           19
	//  228  480:aload_0         
	//  229  481:iload           4
	//  230  483:invokestatic    #169 <Method String Integer.toString(int)>
	//  231  486:lload           5
	//  232  488:aload           7
	//  233  490:invokestatic    #185 <Method MediaFormat Ac3Util.parseEAc3AnnexFFormat(ParsableByteArray, String, long, String)>
	//  234  493:putfield        #179 <Field MediaFormat AtomParsers$StsdData.mediaFormat>
				} else
	//* 235  496:goto            536
				if(k2 == Atom.TYPE_ddts)
	//* 236  499:iload           14
	//* 237  501:getstatic       #188 <Field int Atom.TYPE_ddts>
	//* 238  504:icmpne          536
					stsddata1.mediaFormat = MediaFormat.createAudioFormat(Integer.toString(l), ((String) (stsddata)), -1, -1, l1, k1, j1, ((List) (null)), s);
	//  239  507:aload           19
	//  240  509:iload           4
	//  241  511:invokestatic    #169 <Method String Integer.toString(int)>
	//  242  514:aload           9
	//  243  516:iconst_m1       
	//  244  517:iconst_m1       
	//  245  518:lload           5
	//  246  520:iload           12
	//  247  522:iload           11
	//  248  524:aconst_null     
	//  249  525:aload           7
	//  250  527:invokestatic    #194 <Method MediaFormat MediaFormat.createAudioFormat(String, String, int, int, long, int, int, List, String)>
	//  251  530:putfield        #179 <Field MediaFormat AtomParsers$StsdData.mediaFormat>
	//* 252  533:goto            536
				k2 = i;
	//  253  536:iload_1         
	//  254  537:istore          14
				i3 = j2;
	//  255  539:iload           13
	//  256  541:istore          15
				continue;
	//  257  543:goto            686
			}
			if(k2 == Atom.TYPE_esds)
	//* 258  546:iload           14
	//* 259  548:getstatic       #75  <Field int Atom.TYPE_esds>
	//* 260  551:icmpne          560
				k2 = i;
	//  261  554:iload_1         
	//  262  555:istore          14
			else
	//* 263  557:goto            569
				k2 = findEsdsPosition(parsablebytearray, i, j2);
	//  264  560:aload_0         
	//  265  561:iload_1         
	//  266  562:iload           13
	//  267  564:invokestatic    #196 <Method int findEsdsPosition(ParsableByteArray, int, int)>
	//  268  567:istore          14
			if(k2 != -1)
	//* 269  569:iload           14
	//* 270  571:iconst_m1       
	//* 271  572:icmpeq          679
			{
				stsddata = ((StsdData) (parseEsdsFromParent(parsablebytearray, k2)));
	//  272  575:aload_0         
	//  273  576:iload           14
	//  274  578:invokestatic    #200 <Method Pair parseEsdsFromParent(ParsableByteArray, int)>
	//  275  581:astore          9
				String s1 = (String)((Pair) (stsddata)).first;
	//  276  583:aload           9
	//  277  585:getfield        #206 <Field Object Pair.first>
	//  278  588:checkcast       #208 <Class String>
	//  279  591:astore          21
				byte abyte1[] = (byte[])((Pair) (stsddata)).second;
	//  280  593:aload           9
	//  281  595:getfield        #211 <Field Object Pair.second>
	//  282  598:checkcast       #213 <Class byte[]>
	//  283  601:astore          22
				k2 = i;
	//  284  603:iload_1         
	//  285  604:istore          14
				i3 = j2;
	//  286  606:iload           13
	//  287  608:istore          15
				stsddata = ((StsdData) (s1));
	//  288  610:aload           21
	//  289  612:astore          9
				abyte0 = abyte1;
	//  290  614:aload           22
	//  291  616:astore          20
				if("audio/mp4a-latm".equals(((Object) (s1))))
	//* 292  618:ldc1            #215 <String "audio/mp4a-latm">
	//* 293  620:aload           21
	//* 294  622:invokevirtual   #219 <Method boolean String.equals(Object)>
	//* 295  625:ifeq            686
				{
					stsddata = ((StsdData) (CodecSpecificDataUtil.parseAacAudioSpecificConfig(abyte1)));
	//  296  628:aload           22
	//  297  630:invokestatic    #225 <Method Pair CodecSpecificDataUtil.parseAacAudioSpecificConfig(byte[])>
	//  298  633:astore          9
					j1 = ((Integer)((Pair) (stsddata)).first).intValue();
	//  299  635:aload           9
	//  300  637:getfield        #206 <Field Object Pair.first>
	//  301  640:checkcast       #165 <Class Integer>
	//  302  643:invokevirtual   #228 <Method int Integer.intValue()>
	//  303  646:istore          11
					k1 = ((Integer)((Pair) (stsddata)).second).intValue();
	//  304  648:aload           9
	//  305  650:getfield        #211 <Field Object Pair.second>
	//  306  653:checkcast       #165 <Class Integer>
	//  307  656:invokevirtual   #228 <Method int Integer.intValue()>
	//  308  659:istore          12
					k2 = i;
	//  309  661:iload_1         
	//  310  662:istore          14
					i3 = j2;
	//  311  664:iload           13
	//  312  666:istore          15
					stsddata = ((StsdData) (s1));
	//  313  668:aload           21
	//  314  670:astore          9
					abyte0 = abyte1;
	//  315  672:aload           22
	//  316  674:astore          20
				}
			} else
	//* 317  676:goto            686
			{
				i3 = j2;
	//  318  679:iload           13
	//  319  681:istore          15
				k2 = i;
	//  320  683:iload_1         
	//  321  684:istore          14
			}
		}

	//  322  686:iload           14
	//  323  688:iload           15
	//  324  690:iadd            
	//  325  691:istore_1        
	//* 326  692:goto            355
		if(stsddata1.mediaFormat == null && stsddata != null)
	//* 327  695:aload           19
	//* 328  697:getfield        #179 <Field MediaFormat AtomParsers$StsdData.mediaFormat>
	//* 329  700:ifnonnull       772
	//* 330  703:aload           9
	//* 331  705:ifnull          772
		{
			if(!"audio/raw".equals(((Object) (stsddata))))
	//* 332  708:ldc1            #155 <String "audio/raw">
	//* 333  710:aload           9
	//* 334  712:invokevirtual   #219 <Method boolean String.equals(Object)>
	//* 335  715:ifeq            721
	//* 336  718:goto            724
				i1 = -1;
	//  337  721:iconst_m1       
	//  338  722:istore          10
			String s2 = Integer.toString(l);
	//  339  724:iload           4
	//  340  726:invokestatic    #169 <Method String Integer.toString(int)>
	//  341  729:astore          21
			if(abyte0 == null)
	//* 342  731:aload           20
	//* 343  733:ifnonnull       741
				parsablebytearray = null;
	//  344  736:aconst_null     
	//  345  737:astore_0        
			else
	//* 346  738:goto            747
				parsablebytearray = ((ParsableByteArray) (Collections.singletonList(((Object) (abyte0)))));
	//  347  741:aload           20
	//  348  743:invokestatic    #234 <Method List Collections.singletonList(Object)>
	//  349  746:astore_0        
			stsddata1.mediaFormat = MediaFormat.createAudioFormat(s2, ((String) (stsddata)), -1, -1, l1, k1, j1, ((List) (parsablebytearray)), s, i1);
	//  350  747:aload           19
	//  351  749:aload           21
	//  352  751:aload           9
	//  353  753:iconst_m1       
	//  354  754:iconst_m1       
	//  355  755:lload           5
	//  356  757:iload           12
	//  357  759:iload           11
	//  358  761:aload_0         
	//  359  762:aload           7
	//  360  764:iload           10
	//  361  766:invokestatic    #237 <Method MediaFormat MediaFormat.createAudioFormat(String, String, int, int, long, int, int, List, String, int)>
	//  362  769:putfield        #179 <Field MediaFormat AtomParsers$StsdData.mediaFormat>
		}
	//  363  772:return          
	}

	private static AvcCData parseAvcCFromParent(ParsableByteArray parsablebytearray, int i)
	{
		parsablebytearray.setPosition(i + 8 + 4);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          8
	//    3    4:iadd            
	//    4    5:iconst_4        
	//    5    6:iadd            
	//    6    7:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
		int j = (parsablebytearray.readUnsignedByte() & 3) + 1;
	//    7   10:aload_0         
	//    8   11:invokevirtual   #242 <Method int ParsableByteArray.readUnsignedByte()>
	//    9   14:iconst_3        
	//   10   15:iand            
	//   11   16:iconst_1        
	//   12   17:iadd            
	//   13   18:istore_3        
		if(j != 3)
	//*  14   19:iload_3         
	//*  15   20:iconst_3        
	//*  16   21:icmpeq          158
		{
			ArrayList arraylist = new ArrayList();
	//   17   24:new             #244 <Class ArrayList>
	//   18   27:dup             
	//   19   28:invokespecial   #245 <Method void ArrayList()>
	//   20   31:astore          6
			float f = 1.0F;
	//   21   33:fconst_1        
	//   22   34:fstore_2        
			int k = parsablebytearray.readUnsignedByte() & 0x1f;
	//   23   35:aload_0         
	//   24   36:invokevirtual   #242 <Method int ParsableByteArray.readUnsignedByte()>
	//   25   39:bipush          31
	//   26   41:iand            
	//   27   42:istore          4
			for(i = 0; i < k; i++)
	//*  28   44:iconst_0        
	//*  29   45:istore_1        
	//*  30   46:iload_1         
	//*  31   47:iload           4
	//*  32   49:icmpge          71
				((List) (arraylist)).add(((Object) (NalUnitUtil.parseChildNalUnit(parsablebytearray))));
	//   33   52:aload           6
	//   34   54:aload_0         
	//   35   55:invokestatic    #251 <Method byte[] NalUnitUtil.parseChildNalUnit(ParsableByteArray)>
	//   36   58:invokeinterface #256 <Method boolean List.add(Object)>
	//   37   63:pop             

	//   38   64:iload_1         
	//   39   65:iconst_1        
	//   40   66:iadd            
	//   41   67:istore_1        
	//*  42   68:goto            46
			int l = parsablebytearray.readUnsignedByte();
	//   43   71:aload_0         
	//   44   72:invokevirtual   #242 <Method int ParsableByteArray.readUnsignedByte()>
	//   45   75:istore          5
			for(i = 0; i < l; i++)
	//*  46   77:iconst_0        
	//*  47   78:istore_1        
	//*  48   79:iload_1         
	//*  49   80:iload           5
	//*  50   82:icmpge          104
				((List) (arraylist)).add(((Object) (NalUnitUtil.parseChildNalUnit(parsablebytearray))));
	//   51   85:aload           6
	//   52   87:aload_0         
	//   53   88:invokestatic    #251 <Method byte[] NalUnitUtil.parseChildNalUnit(ParsableByteArray)>
	//   54   91:invokeinterface #256 <Method boolean List.add(Object)>
	//   55   96:pop             

	//   56   97:iload_1         
	//   57   98:iconst_1        
	//   58   99:iadd            
	//   59  100:istore_1        
	//*  60  101:goto            79
			if(k > 0)
	//*  61  104:iload           4
	//*  62  106:ifle            146
			{
				parsablebytearray = ((ParsableByteArray) (new ParsableBitArray((byte[])((List) (arraylist)).get(0))));
	//   63  109:new             #258 <Class ParsableBitArray>
	//   64  112:dup             
	//   65  113:aload           6
	//   66  115:iconst_0        
	//   67  116:invokeinterface #262 <Method Object List.get(int)>
	//   68  121:checkcast       #213 <Class byte[]>
	//   69  124:invokespecial   #265 <Method void ParsableBitArray(byte[])>
	//   70  127:astore_0        
				((ParsableBitArray) (parsablebytearray)).setPosition((j + 1) * 8);
	//   71  128:aload_0         
	//   72  129:iload_3         
	//   73  130:iconst_1        
	//   74  131:iadd            
	//   75  132:bipush          8
	//   76  134:imul            
	//   77  135:invokevirtual   #266 <Method void ParsableBitArray.setPosition(int)>
				f = NalUnitUtil.parseSpsNalUnit(((ParsableBitArray) (parsablebytearray))).pixelWidthAspectRatio;
	//   78  138:aload_0         
	//   79  139:invokestatic    #270 <Method com.google.android.exoplayer.util.NalUnitUtil$SpsData NalUnitUtil.parseSpsNalUnit(ParsableBitArray)>
	//   80  142:getfield        #276 <Field float com.google.android.exoplayer.util.NalUnitUtil$SpsData.pixelWidthAspectRatio>
	//   81  145:fstore_2        
			}
			return new AvcCData(((List) (arraylist)), j, f);
	//   82  146:new             #6   <Class AtomParsers$AvcCData>
	//   83  149:dup             
	//   84  150:aload           6
	//   85  152:iload_3         
	//   86  153:fload_2         
	//   87  154:invokespecial   #279 <Method void AtomParsers$AvcCData(List, int, float)>
	//   88  157:areturn         
		} else
		{
			throw new IllegalStateException();
	//   89  158:new             #281 <Class IllegalStateException>
	//   90  161:dup             
	//   91  162:invokespecial   #282 <Method void IllegalStateException()>
	//   92  165:athrow          
		}
	}

	private static Pair parseEdts(Atom.ContainerAtom containeratom)
	{
		if(containeratom != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          152
		{
			containeratom = ((Atom.ContainerAtom) (containeratom.getLeafAtomOfType(Atom.TYPE_elst)));
	//    2    4:aload_0         
	//    3    5:getstatic       #287 <Field int Atom.TYPE_elst>
	//    4    8:invokevirtual   #293 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//    5   11:astore_0        
			if(containeratom != null)
	//*   6   12:aload_0         
	//*   7   13:ifnonnull       19
	//*   8   16:goto            152
			{
				containeratom = ((Atom.ContainerAtom) (((Atom.LeafAtom) (containeratom)).data));
	//    9   19:aload_0         
	//   10   20:getfield        #299 <Field ParsableByteArray Atom$LeafAtom.data>
	//   11   23:astore_0        
				((ParsableByteArray) (containeratom)).setPosition(8);
	//   12   24:aload_0         
	//   13   25:bipush          8
	//   14   27:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
				int j = Atom.parseFullAtomVersion(((ParsableByteArray) (containeratom)).readInt());
	//   15   30:aload_0         
	//   16   31:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   17   34:invokestatic    #303 <Method int Atom.parseFullAtomVersion(int)>
	//   18   37:istore_2        
				int k = ((ParsableByteArray) (containeratom)).readUnsignedIntToInt();
	//   19   38:aload_0         
	//   20   39:invokevirtual   #96  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   21   42:istore_3        
				long al[] = new long[k];
	//   22   43:iload_3         
	//   23   44:newarray        long[]
	//   24   46:astore          6
				long al1[] = new long[k];
	//   25   48:iload_3         
	//   26   49:newarray        long[]
	//   27   51:astore          7
				for(int i = 0; i < k;)
	//*  28   53:iconst_0        
	//*  29   54:istore_1        
	//*  30   55:iload_1         
	//*  31   56:iload_3         
	//*  32   57:icmpge          144
				{
					long l;
					if(j == 1)
	//*  33   60:iload_2         
	//*  34   61:iconst_1        
	//*  35   62:icmpne          74
						l = ((ParsableByteArray) (containeratom)).readUnsignedLongToLong();
	//   36   65:aload_0         
	//   37   66:invokevirtual   #307 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   38   69:lstore          4
					else
	//*  39   71:goto            80
						l = ((ParsableByteArray) (containeratom)).readUnsignedInt();
	//   40   74:aload_0         
	//   41   75:invokevirtual   #310 <Method long ParsableByteArray.readUnsignedInt()>
	//   42   78:lstore          4
					al[i] = l;
	//   43   80:aload           6
	//   44   82:iload_1         
	//   45   83:lload           4
	//   46   85:lastore         
					if(j == 1)
	//*  47   86:iload_2         
	//*  48   87:iconst_1        
	//*  49   88:icmpne          100
						l = ((ParsableByteArray) (containeratom)).readLong();
	//   50   91:aload_0         
	//   51   92:invokevirtual   #313 <Method long ParsableByteArray.readLong()>
	//   52   95:lstore          4
					else
	//*  53   97:goto            107
						l = ((ParsableByteArray) (containeratom)).readInt();
	//   54  100:aload_0         
	//   55  101:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   56  104:i2l             
	//   57  105:lstore          4
					al1[i] = l;
	//   58  107:aload           7
	//   59  109:iload_1         
	//   60  110:lload           4
	//   61  112:lastore         
					if(((ParsableByteArray) (containeratom)).readShort() == 1)
	//*  62  113:aload_0         
	//*  63  114:invokevirtual   #317 <Method short ParsableByteArray.readShort()>
	//*  64  117:iconst_1        
	//*  65  118:icmpne          133
					{
						((ParsableByteArray) (containeratom)).skipBytes(2);
	//   66  121:aload_0         
	//   67  122:iconst_2        
	//   68  123:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
						i++;
	//   69  126:iload_1         
	//   70  127:iconst_1        
	//   71  128:iadd            
	//   72  129:istore_1        
					} else
	//*  73  130:goto            55
					{
						throw new IllegalArgumentException("Unsupported media rate.");
	//   74  133:new             #319 <Class IllegalArgumentException>
	//   75  136:dup             
	//   76  137:ldc2            #321 <String "Unsupported media rate.">
	//   77  140:invokespecial   #324 <Method void IllegalArgumentException(String)>
	//   78  143:athrow          
					}
				}

				return Pair.create(((Object) (al)), ((Object) (al1)));
	//   79  144:aload           6
	//   80  146:aload           7
	//   81  148:invokestatic    #328 <Method Pair Pair.create(Object, Object)>
	//   82  151:areturn         
			}
		}
		return Pair.create(((Object) (null)), ((Object) (null)));
	//   83  152:aconst_null     
	//   84  153:aconst_null     
	//   85  154:invokestatic    #328 <Method Pair Pair.create(Object, Object)>
	//   86  157:areturn         
	}

	private static Pair parseEsdsFromParent(ParsableByteArray parsablebytearray, int i)
	{
		parsablebytearray.setPosition(i + 8 + 4);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          8
	//    3    4:iadd            
	//    4    5:iconst_4        
	//    5    6:iadd            
	//    6    7:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
		parsablebytearray.skipBytes(1);
	//    7   10:aload_0         
	//    8   11:iconst_1        
	//    9   12:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
		parseExpandableClassSize(parsablebytearray);
	//   10   15:aload_0         
	//   11   16:invokestatic    #334 <Method int parseExpandableClassSize(ParsableByteArray)>
	//   12   19:pop             
		parsablebytearray.skipBytes(2);
	//   13   20:aload_0         
	//   14   21:iconst_2        
	//   15   22:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
		i = parsablebytearray.readUnsignedByte();
	//   16   25:aload_0         
	//   17   26:invokevirtual   #242 <Method int ParsableByteArray.readUnsignedByte()>
	//   18   29:istore_1        
		if((i & 0x80) != 0)
	//*  19   30:iload_1         
	//*  20   31:sipush          128
	//*  21   34:iand            
	//*  22   35:ifeq            43
			parsablebytearray.skipBytes(2);
	//   23   38:aload_0         
	//   24   39:iconst_2        
	//   25   40:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
		if((i & 0x40) != 0)
	//*  26   43:iload_1         
	//*  27   44:bipush          64
	//*  28   46:iand            
	//*  29   47:ifeq            58
			parsablebytearray.skipBytes(parsablebytearray.readUnsignedShort());
	//   30   50:aload_0         
	//   31   51:aload_0         
	//   32   52:invokevirtual   #83  <Method int ParsableByteArray.readUnsignedShort()>
	//   33   55:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
		if((i & 0x20) != 0)
	//*  34   58:iload_1         
	//*  35   59:bipush          32
	//*  36   61:iand            
	//*  37   62:ifeq            70
			parsablebytearray.skipBytes(2);
	//   38   65:aload_0         
	//   39   66:iconst_2        
	//   40   67:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
		parsablebytearray.skipBytes(1);
	//   41   70:aload_0         
	//   42   71:iconst_1        
	//   43   72:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
		parseExpandableClassSize(parsablebytearray);
	//   44   75:aload_0         
	//   45   76:invokestatic    #334 <Method int parseExpandableClassSize(ParsableByteArray)>
	//   46   79:pop             
		i = parsablebytearray.readUnsignedByte();
	//   47   80:aload_0         
	//   48   81:invokevirtual   #242 <Method int ParsableByteArray.readUnsignedByte()>
	//   49   84:istore_1        
		String s = null;
	//   50   85:aconst_null     
	//   51   86:astore_2        
		switch(i)
	//*  52   87:iload_1         
		{
	//*  53   88:lookupswitch    14: default 212
	//	               32: 268
	//	               33: 261
	//	               35: 254
	//	               64: 248
	//	               102: 248
	//	               103: 248
	//	               104: 248
	//	               107: 241
	//	               165: 235
	//	               166: 229
	//	               169: 222
	//	               170: 215
	//	               171: 215
	//	               172: 222
	//*  54  212:goto            272
		case 170: 
		case 171: 
			return Pair.create("audio/vnd.dts.hd", ((Object) (null)));
	//   55  215:ldc1            #157 <String "audio/vnd.dts.hd">
	//   56  217:aconst_null     
	//   57  218:invokestatic    #328 <Method Pair Pair.create(Object, Object)>
	//   58  221:areturn         

		case 169: 
		case 172: 
			return Pair.create("audio/vnd.dts", ((Object) (null)));
	//   59  222:ldc1            #121 <String "audio/vnd.dts">
	//   60  224:aconst_null     
	//   61  225:invokestatic    #328 <Method Pair Pair.create(Object, Object)>
	//   62  228:areturn         

		case 166: 
			s = "audio/eac3";
	//   63  229:ldc1            #116 <String "audio/eac3">
	//   64  231:astore_2        
			break;

	//*  65  232:goto            272
		case 165: 
			s = "audio/ac3";
	//   66  235:ldc1            #111 <String "audio/ac3">
	//   67  237:astore_2        
			break;

	//*  68  238:goto            272
		case 107: // 'k'
			return Pair.create("audio/mpeg", ((Object) (null)));
	//   69  241:ldc1            #153 <String "audio/mpeg">
	//   70  243:aconst_null     
	//   71  244:invokestatic    #328 <Method Pair Pair.create(Object, Object)>
	//   72  247:areturn         

		case 64: // '@'
		case 102: // 'f'
		case 103: // 'g'
		case 104: // 'h'
			s = "audio/mp4a-latm";
	//   73  248:ldc1            #215 <String "audio/mp4a-latm">
	//   74  250:astore_2        
			break;

	//*  75  251:goto            272
		case 35: // '#'
			s = "video/hevc";
	//   76  254:ldc2            #336 <String "video/hevc">
	//   77  257:astore_2        
			break;

	//*  78  258:goto            272
		case 33: // '!'
			s = "video/avc";
	//   79  261:ldc2            #338 <String "video/avc">
	//   80  264:astore_2        
			break;

	//*  81  265:goto            272
		case 32: // ' '
			s = "video/mp4v-es";
	//   82  268:ldc2            #340 <String "video/mp4v-es">
	//   83  271:astore_2        
			break;
		}
		parsablebytearray.skipBytes(12);
	//   84  272:aload_0         
	//   85  273:bipush          12
	//   86  275:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
		parsablebytearray.skipBytes(1);
	//   87  278:aload_0         
	//   88  279:iconst_1        
	//   89  280:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
		i = parseExpandableClassSize(parsablebytearray);
	//   90  283:aload_0         
	//   91  284:invokestatic    #334 <Method int parseExpandableClassSize(ParsableByteArray)>
	//   92  287:istore_1        
		byte abyte0[] = new byte[i];
	//   93  288:iload_1         
	//   94  289:newarray        byte[]
	//   95  291:astore_3        
		parsablebytearray.readBytes(abyte0, 0, i);
	//   96  292:aload_0         
	//   97  293:aload_3         
	//   98  294:iconst_0        
	//   99  295:iload_1         
	//  100  296:invokevirtual   #344 <Method void ParsableByteArray.readBytes(byte[], int, int)>
		return Pair.create(((Object) (s)), ((Object) (abyte0)));
	//  101  299:aload_2         
	//  102  300:aload_3         
	//  103  301:invokestatic    #328 <Method Pair Pair.create(Object, Object)>
	//  104  304:areturn         
	}

	private static int parseExpandableClassSize(ParsableByteArray parsablebytearray)
	{
		int j = parsablebytearray.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #242 <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:istore_2        
		int i;
		for(i = j & 0x7f; (j & 0x80) == 128; i = i << 7 | j & 0x7f)
	//*   3    5:iload_2         
	//*   4    6:bipush          127
	//*   5    8:iand            
	//*   6    9:istore_1        
	//*   7   10:iload_2         
	//*   8   11:sipush          128
	//*   9   14:iand            
	//*  10   15:sipush          128
	//*  11   18:icmpne          39
			j = parsablebytearray.readUnsignedByte();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #242 <Method int ParsableByteArray.readUnsignedByte()>
	//   14   25:istore_2        

	//   15   26:iload_1         
	//   16   27:bipush          7
	//   17   29:ishl            
	//   18   30:iload_2         
	//   19   31:bipush          127
	//   20   33:iand            
	//   21   34:ior             
	//   22   35:istore_1        
	//*  23   36:goto            10
		return i;
	//   24   39:iload_1         
	//   25   40:ireturn         
	}

	private static int parseHdlr(ParsableByteArray parsablebytearray)
	{
		parsablebytearray.setPosition(16);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
		return parsablebytearray.readInt();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//    5   10:ireturn         
	}

	private static Pair parseHvcCFromParent(ParsableByteArray parsablebytearray, int i)
	{
		parsablebytearray.setPosition(i + 8 + 21);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          8
	//    3    4:iadd            
	//    4    5:bipush          21
	//    5    7:iadd            
	//    6    8:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
		int k1 = parsablebytearray.readUnsignedByte();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #242 <Method int ParsableByteArray.readUnsignedByte()>
	//    9   15:istore          5
		int l1 = parsablebytearray.readUnsignedByte();
	//   10   17:aload_0         
	//   11   18:invokevirtual   #242 <Method int ParsableByteArray.readUnsignedByte()>
	//   12   21:istore          6
		int i1 = parsablebytearray.getPosition();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #55  <Method int ParsableByteArray.getPosition()>
	//   15   27:istore          4
		int j = 0;
	//   16   29:iconst_0        
	//   17   30:istore_2        
		i = j;
	//   18   31:iload_2         
	//   19   32:istore_1        
		for(; j < l1; j++)
	//*  20   33:iload_2         
	//*  21   34:iload           6
	//*  22   36:icmpge          91
		{
			parsablebytearray.skipBytes(1);
	//   23   39:aload_0         
	//   24   40:iconst_1        
	//   25   41:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
			int i2 = parsablebytearray.readUnsignedShort();
	//   26   44:aload_0         
	//   27   45:invokevirtual   #83  <Method int ParsableByteArray.readUnsignedShort()>
	//   28   48:istore          7
			for(int k = 0; k < i2; k++)
	//*  29   50:iconst_0        
	//*  30   51:istore_3        
	//*  31   52:iload_3         
	//*  32   53:iload           7
	//*  33   55:icmpge          84
			{
				int k2 = parsablebytearray.readUnsignedShort();
	//   34   58:aload_0         
	//   35   59:invokevirtual   #83  <Method int ParsableByteArray.readUnsignedShort()>
	//   36   62:istore          8
				i += k2 + 4;
	//   37   64:iload_1         
	//   38   65:iload           8
	//   39   67:iconst_4        
	//   40   68:iadd            
	//   41   69:iadd            
	//   42   70:istore_1        
				parsablebytearray.skipBytes(k2);
	//   43   71:aload_0         
	//   44   72:iload           8
	//   45   74:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
			}

	//   46   77:iload_3         
	//   47   78:iconst_1        
	//   48   79:iadd            
	//   49   80:istore_3        
		}

	//   50   81:goto            52
	//   51   84:iload_2         
	//   52   85:iconst_1        
	//   53   86:iadd            
	//   54   87:istore_2        
	//*  55   88:goto            33
		parsablebytearray.setPosition(i1);
	//   56   91:aload_0         
	//   57   92:iload           4
	//   58   94:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
		byte abyte0[] = new byte[i];
	//   59   97:iload_1         
	//   60   98:newarray        byte[]
	//   61  100:astore          9
		int l = 0;
	//   62  102:iconst_0        
	//   63  103:istore_3        
		j = l;
	//   64  104:iload_3         
	//   65  105:istore_2        
		for(; l < l1; l++)
	//*  66  106:iload_3         
	//*  67  107:iload           6
	//*  68  109:icmpge          203
		{
			parsablebytearray.skipBytes(1);
	//   69  112:aload_0         
	//   70  113:iconst_1        
	//   71  114:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
			int j2 = parsablebytearray.readUnsignedShort();
	//   72  117:aload_0         
	//   73  118:invokevirtual   #83  <Method int ParsableByteArray.readUnsignedShort()>
	//   74  121:istore          7
			for(int j1 = 0; j1 < j2; j1++)
	//*  75  123:iconst_0        
	//*  76  124:istore          4
	//*  77  126:iload           4
	//*  78  128:iload           7
	//*  79  130:icmpge          196
			{
				int l2 = parsablebytearray.readUnsignedShort();
	//   80  133:aload_0         
	//   81  134:invokevirtual   #83  <Method int ParsableByteArray.readUnsignedShort()>
	//   82  137:istore          8
				System.arraycopy(((Object) (NalUnitUtil.NAL_START_CODE)), 0, ((Object) (abyte0)), j, NalUnitUtil.NAL_START_CODE.length);
	//   83  139:getstatic       #350 <Field byte[] NalUnitUtil.NAL_START_CODE>
	//   84  142:iconst_0        
	//   85  143:aload           9
	//   86  145:iload_2         
	//   87  146:getstatic       #350 <Field byte[] NalUnitUtil.NAL_START_CODE>
	//   88  149:arraylength     
	//   89  150:invokestatic    #356 <Method void System.arraycopy(Object, int, Object, int, int)>
				j += NalUnitUtil.NAL_START_CODE.length;
	//   90  153:iload_2         
	//   91  154:getstatic       #350 <Field byte[] NalUnitUtil.NAL_START_CODE>
	//   92  157:arraylength     
	//   93  158:iadd            
	//   94  159:istore_2        
				System.arraycopy(((Object) (parsablebytearray.data)), parsablebytearray.getPosition(), ((Object) (abyte0)), j, l2);
	//   95  160:aload_0         
	//   96  161:getfield        #358 <Field byte[] ParsableByteArray.data>
	//   97  164:aload_0         
	//   98  165:invokevirtual   #55  <Method int ParsableByteArray.getPosition()>
	//   99  168:aload           9
	//  100  170:iload_2         
	//  101  171:iload           8
	//  102  173:invokestatic    #356 <Method void System.arraycopy(Object, int, Object, int, int)>
				j += l2;
	//  103  176:iload_2         
	//  104  177:iload           8
	//  105  179:iadd            
	//  106  180:istore_2        
				parsablebytearray.skipBytes(l2);
	//  107  181:aload_0         
	//  108  182:iload           8
	//  109  184:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
			}

	//  110  187:iload           4
	//  111  189:iconst_1        
	//  112  190:iadd            
	//  113  191:istore          4
		}

	//  114  193:goto            126
	//  115  196:iload_3         
	//  116  197:iconst_1        
	//  117  198:iadd            
	//  118  199:istore_3        
	//* 119  200:goto            106
		if(i == 0)
	//* 120  203:iload_1         
	//* 121  204:ifne            212
			parsablebytearray = null;
	//  122  207:aconst_null     
	//  123  208:astore_0        
		else
	//* 124  209:goto            218
			parsablebytearray = ((ParsableByteArray) (Collections.singletonList(((Object) (abyte0)))));
	//  125  212:aload           9
	//  126  214:invokestatic    #234 <Method List Collections.singletonList(Object)>
	//  127  217:astore_0        
		return Pair.create(((Object) (parsablebytearray)), ((Object) (Integer.valueOf((k1 & 3) + 1))));
	//  128  218:aload_0         
	//  129  219:iload           5
	//  130  221:iconst_3        
	//  131  222:iand            
	//  132  223:iconst_1        
	//  133  224:iadd            
	//  134  225:invokestatic    #362 <Method Integer Integer.valueOf(int)>
	//  135  228:invokestatic    #328 <Method Pair Pair.create(Object, Object)>
	//  136  231:areturn         
	}

	private static GaplessInfo parseIlst(ParsableByteArray parsablebytearray)
	{
		do
		{
			int i = parsablebytearray.bytesLeft();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #368 <Method int ParsableByteArray.bytesLeft()>
	//    2    4:istore_1        
			String s2 = null;
	//    3    5:aconst_null     
	//    4    6:astore          6
			if(i <= 0)
				break;
	//    5    8:iload_1         
	//    6    9:ifle            168
			i = parsablebytearray.getPosition() + parsablebytearray.readInt();
	//    7   12:aload_0         
	//    8   13:invokevirtual   #55  <Method int ParsableByteArray.getPosition()>
	//    9   16:aload_0         
	//   10   17:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   11   20:iadd            
	//   12   21:istore_1        
			if(parsablebytearray.readInt() == Atom.TYPE_DASHES)
	//*  13   22:aload_0         
	//*  14   23:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//*  15   26:getstatic       #371 <Field int Atom.TYPE_DASHES>
	//*  16   29:icmpne          160
			{
				String s1 = null;
	//   17   32:aconst_null     
	//   18   33:astore          5
				String s = s1;
	//   19   35:aload           5
	//   20   37:astore          4
				while(parsablebytearray.getPosition() < i) 
	//*  21   39:aload_0         
	//*  22   40:invokevirtual   #55  <Method int ParsableByteArray.getPosition()>
	//*  23   43:iload_1         
	//*  24   44:icmpge          131
				{
					int j = parsablebytearray.readInt() - 12;
	//   25   47:aload_0         
	//   26   48:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   27   51:bipush          12
	//   28   53:isub            
	//   29   54:istore_2        
					int k = parsablebytearray.readInt();
	//   30   55:aload_0         
	//   31   56:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   32   59:istore_3        
					parsablebytearray.skipBytes(4);
	//   33   60:aload_0         
	//   34   61:iconst_4        
	//   35   62:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
					if(k == Atom.TYPE_mean)
	//*  36   65:iload_3         
	//*  37   66:getstatic       #374 <Field int Atom.TYPE_mean>
	//*  38   69:icmpne          82
						s = parsablebytearray.readString(j);
	//   39   72:aload_0         
	//   40   73:iload_2         
	//   41   74:invokevirtual   #377 <Method String ParsableByteArray.readString(int)>
	//   42   77:astore          4
					else
	//*  43   79:goto            39
					if(k == Atom.TYPE_name)
	//*  44   82:iload_3         
	//*  45   83:getstatic       #380 <Field int Atom.TYPE_name>
	//*  46   86:icmpne          99
						s2 = parsablebytearray.readString(j);
	//   47   89:aload_0         
	//   48   90:iload_2         
	//   49   91:invokevirtual   #377 <Method String ParsableByteArray.readString(int)>
	//   50   94:astore          6
					else
	//*  51   96:goto            39
					if(k == Atom.TYPE_data)
	//*  52   99:iload_3         
	//*  53  100:getstatic       #383 <Field int Atom.TYPE_data>
	//*  54  103:icmpne          123
					{
						parsablebytearray.skipBytes(4);
	//   55  106:aload_0         
	//   56  107:iconst_4        
	//   57  108:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
						s1 = parsablebytearray.readString(j - 4);
	//   58  111:aload_0         
	//   59  112:iload_2         
	//   60  113:iconst_4        
	//   61  114:isub            
	//   62  115:invokevirtual   #377 <Method String ParsableByteArray.readString(int)>
	//   63  118:astore          5
					} else
	//*  64  120:goto            39
					{
						parsablebytearray.skipBytes(j);
	//   65  123:aload_0         
	//   66  124:iload_2         
	//   67  125:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
					}
				}
	//*  68  128:goto            39
				if(s2 != null && s1 != null && "com.apple.iTunes".equals(((Object) (s))))
	//*  69  131:aload           6
	//*  70  133:ifnull          0
	//*  71  136:aload           5
	//*  72  138:ifnull          0
	//*  73  141:ldc2            #385 <String "com.apple.iTunes">
	//*  74  144:aload           4
	//*  75  146:invokevirtual   #219 <Method boolean String.equals(Object)>
	//*  76  149:ifeq            0
					return GaplessInfo.createFromComment(s2, s1);
	//   77  152:aload           6
	//   78  154:aload           5
	//   79  156:invokestatic    #391 <Method GaplessInfo GaplessInfo.createFromComment(String, String)>
	//   80  159:areturn         
			} else
			{
				parsablebytearray.setPosition(i);
	//   81  160:aload_0         
	//   82  161:iload_1         
	//   83  162:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
			}
		} while(true);
	//   84  165:goto            0
		return null;
	//   85  168:aconst_null     
	//   86  169:areturn         
	}

	private static Pair parseMdhd(ParsableByteArray parsablebytearray)
	{
		byte byte0 = 8;
	//    0    0:bipush          8
	//    1    2:istore_2        
		parsablebytearray.setPosition(8);
	//    2    3:aload_0         
	//    3    4:bipush          8
	//    4    6:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
		int j = Atom.parseFullAtomVersion(parsablebytearray.readInt());
	//    5    9:aload_0         
	//    6   10:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//    7   13:invokestatic    #303 <Method int Atom.parseFullAtomVersion(int)>
	//    8   16:istore_3        
		int i;
		if(j == 0)
	//*   9   17:iload_3         
	//*  10   18:ifne            27
			i = 8;
	//   11   21:bipush          8
	//   12   23:istore_1        
		else
	//*  13   24:goto            30
			i = 16;
	//   14   27:bipush          16
	//   15   29:istore_1        
		parsablebytearray.skipBytes(i);
	//   16   30:aload_0         
	//   17   31:iload_1         
	//   18   32:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
		long l = parsablebytearray.readUnsignedInt();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #310 <Method long ParsableByteArray.readUnsignedInt()>
	//   21   39:lstore          4
		i = ((int) (byte0));
	//   22   41:iload_2         
	//   23   42:istore_1        
		if(j == 0)
	//*  24   43:iload_3         
	//*  25   44:ifne            49
			i = 4;
	//   26   47:iconst_4        
	//   27   48:istore_1        
		parsablebytearray.skipBytes(i);
	//   28   49:aload_0         
	//   29   50:iload_1         
	//   30   51:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
		i = parsablebytearray.readUnsignedShort();
	//   31   54:aload_0         
	//   32   55:invokevirtual   #83  <Method int ParsableByteArray.readUnsignedShort()>
	//   33   58:istore_1        
		parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   34   59:new             #395 <Class StringBuilder>
	//   35   62:dup             
	//   36   63:invokespecial   #396 <Method void StringBuilder()>
	//   37   66:astore_0        
		((StringBuilder) (parsablebytearray)).append("");
	//   38   67:aload_0         
	//   39   68:ldc2            #398 <String "">
	//   40   71:invokevirtual   #402 <Method StringBuilder StringBuilder.append(String)>
	//   41   74:pop             
		((StringBuilder) (parsablebytearray)).append((char)((i >> 10 & 0x1f) + 96));
	//   42   75:aload_0         
	//   43   76:iload_1         
	//   44   77:bipush          10
	//   45   79:ishr            
	//   46   80:bipush          31
	//   47   82:iand            
	//   48   83:bipush          96
	//   49   85:iadd            
	//   50   86:int2char        
	//   51   87:invokevirtual   #405 <Method StringBuilder StringBuilder.append(char)>
	//   52   90:pop             
		((StringBuilder) (parsablebytearray)).append((char)((i >> 5 & 0x1f) + 96));
	//   53   91:aload_0         
	//   54   92:iload_1         
	//   55   93:iconst_5        
	//   56   94:ishr            
	//   57   95:bipush          31
	//   58   97:iand            
	//   59   98:bipush          96
	//   60  100:iadd            
	//   61  101:int2char        
	//   62  102:invokevirtual   #405 <Method StringBuilder StringBuilder.append(char)>
	//   63  105:pop             
		((StringBuilder) (parsablebytearray)).append((char)((i & 0x1f) + 96));
	//   64  106:aload_0         
	//   65  107:iload_1         
	//   66  108:bipush          31
	//   67  110:iand            
	//   68  111:bipush          96
	//   69  113:iadd            
	//   70  114:int2char        
	//   71  115:invokevirtual   #405 <Method StringBuilder StringBuilder.append(char)>
	//   72  118:pop             
		return Pair.create(((Object) (Long.valueOf(l))), ((Object) (((StringBuilder) (parsablebytearray)).toString())));
	//   73  119:lload           4
	//   74  121:invokestatic    #410 <Method Long Long.valueOf(long)>
	//   75  124:aload_0         
	//   76  125:invokevirtual   #413 <Method String StringBuilder.toString()>
	//   77  128:invokestatic    #328 <Method Pair Pair.create(Object, Object)>
	//   78  131:areturn         
	}

	private static GaplessInfo parseMetaAtom(ParsableByteArray parsablebytearray)
	{
		parsablebytearray.skipBytes(12);
	//    0    0:aload_0         
	//    1    1:bipush          12
	//    2    3:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
		ParsableByteArray parsablebytearray1 = new ParsableByteArray();
	//    3    6:new             #51  <Class ParsableByteArray>
	//    4    9:dup             
	//    5   10:invokespecial   #416 <Method void ParsableByteArray()>
	//    6   13:astore_2        
		int i;
		for(; parsablebytearray.bytesLeft() >= 8; parsablebytearray.skipBytes(i))
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #368 <Method int ParsableByteArray.bytesLeft()>
	//*   9   18:bipush          8
	//*  10   20:icmplt          82
		{
			i = parsablebytearray.readInt() - 8;
	//   11   23:aload_0         
	//   12   24:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   13   27:bipush          8
	//   14   29:isub            
	//   15   30:istore_1        
			if(parsablebytearray.readInt() != Atom.TYPE_ilst)
				continue;
	//   16   31:aload_0         
	//   17   32:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   18   35:getstatic       #419 <Field int Atom.TYPE_ilst>
	//   19   38:icmpne          74
			parsablebytearray1.reset(parsablebytearray.data, parsablebytearray.getPosition() + i);
	//   20   41:aload_2         
	//   21   42:aload_0         
	//   22   43:getfield        #358 <Field byte[] ParsableByteArray.data>
	//   23   46:aload_0         
	//   24   47:invokevirtual   #55  <Method int ParsableByteArray.getPosition()>
	//   25   50:iload_1         
	//   26   51:iadd            
	//   27   52:invokevirtual   #423 <Method void ParsableByteArray.reset(byte[], int)>
			parsablebytearray1.setPosition(parsablebytearray.getPosition());
	//   28   55:aload_2         
	//   29   56:aload_0         
	//   30   57:invokevirtual   #55  <Method int ParsableByteArray.getPosition()>
	//   31   60:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
			GaplessInfo gaplessinfo = parseIlst(parsablebytearray1);
	//   32   63:aload_2         
	//   33   64:invokestatic    #425 <Method GaplessInfo parseIlst(ParsableByteArray)>
	//   34   67:astore_3        
			if(gaplessinfo != null)
	//*  35   68:aload_3         
	//*  36   69:ifnull          74
				return gaplessinfo;
	//   37   72:aload_3         
	//   38   73:areturn         
		}

	//   39   74:aload_0         
	//   40   75:iload_1         
	//   41   76:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
	//*  42   79:goto            14
		return null;
	//   43   82:aconst_null     
	//   44   83:areturn         
	}

	private static long parseMvhd(ParsableByteArray parsablebytearray)
	{
		byte byte0 = 8;
	//    0    0:bipush          8
	//    1    2:istore_1        
		parsablebytearray.setPosition(8);
	//    2    3:aload_0         
	//    3    4:bipush          8
	//    4    6:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
		if(Atom.parseFullAtomVersion(parsablebytearray.readInt()) != 0)
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//*   7   13:invokestatic    #303 <Method int Atom.parseFullAtomVersion(int)>
	//*   8   16:ifne            22
	//*   9   19:goto            25
			byte0 = 16;
	//   10   22:bipush          16
	//   11   24:istore_1        
		parsablebytearray.skipBytes(((int) (byte0)));
	//   12   25:aload_0         
	//   13   26:iload_1         
	//   14   27:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
		return parsablebytearray.readUnsignedInt();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #310 <Method long ParsableByteArray.readUnsignedInt()>
	//   17   34:lreturn         
	}

	private static float parsePaspFromParent(ParsableByteArray parsablebytearray, int i)
	{
		parsablebytearray.setPosition(i + 8);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          8
	//    3    4:iadd            
	//    4    5:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
		i = parsablebytearray.readUnsignedIntToInt();
	//    5    8:aload_0         
	//    6    9:invokevirtual   #96  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//    7   12:istore_1        
		int j = parsablebytearray.readUnsignedIntToInt();
	//    8   13:aload_0         
	//    9   14:invokevirtual   #96  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   10   17:istore_2        
		return (float)i / (float)j;
	//   11   18:iload_1         
	//   12   19:i2f             
	//   13   20:iload_2         
	//   14   21:i2f             
	//   15   22:fdiv            
	//   16   23:freturn         
	}

	private static byte[] parseProjFromParent(ParsableByteArray parsablebytearray, int i, int j)
	{
		int l;
		for(int k = i + 8; k - i < j; k += l)
	//*   0    0:iload_1         
	//*   1    1:bipush          8
	//*   2    3:iadd            
	//*   3    4:istore_3        
	//*   4    5:iload_3         
	//*   5    6:iload_1         
	//*   6    7:isub            
	//*   7    8:iload_2         
	//*   8    9:icmpge          54
		{
			parsablebytearray.setPosition(k);
	//    9   12:aload_0         
	//   10   13:iload_3         
	//   11   14:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
			l = parsablebytearray.readInt();
	//   12   17:aload_0         
	//   13   18:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   14   21:istore          4
			if(parsablebytearray.readInt() == Atom.TYPE_proj)
	//*  15   23:aload_0         
	//*  16   24:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//*  17   27:getstatic       #434 <Field int Atom.TYPE_proj>
	//*  18   30:icmpne          46
				return Arrays.copyOfRange(parsablebytearray.data, k, l + k);
	//   19   33:aload_0         
	//   20   34:getfield        #358 <Field byte[] ParsableByteArray.data>
	//   21   37:iload_3         
	//   22   38:iload           4
	//   23   40:iload_3         
	//   24   41:iadd            
	//   25   42:invokestatic    #440 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   26   45:areturn         
		}

	//   27   46:iload_3         
	//   28   47:iload           4
	//   29   49:iadd            
	//   30   50:istore_3        
	//*  31   51:goto            5
		return null;
	//   32   54:aconst_null     
	//   33   55:areturn         
	}

	private static int parseSampleEntryEncryptionData(ParsableByteArray parsablebytearray, int i, int j, StsdData stsddata, int k)
	{
		int l = parsablebytearray.getPosition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method int ParsableByteArray.getPosition()>
	//    2    4:istore          5
		do
		{
			boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          7
			if(l - i < j)
	//*   5    9:iload           5
	//*   6   11:iload_1         
	//*   7   12:isub            
	//*   8   13:iload_2         
	//*   9   14:icmpge          106
			{
				parsablebytearray.setPosition(l);
	//   10   17:aload_0         
	//   11   18:iload           5
	//   12   20:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
				int i1 = parsablebytearray.readInt();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   15   27:istore          6
				if(i1 > 0)
	//*  16   29:iload           6
	//*  17   31:ifle            37
					flag = true;
	//   18   34:iconst_1        
	//   19   35:istore          7
				Assertions.checkArgument(flag, "childAtomSize should be positive");
	//   20   37:iload           7
	//   21   39:ldc1            #64  <String "childAtomSize should be positive">
	//   22   41:invokestatic    #70  <Method void Assertions.checkArgument(boolean, Object)>
				if(parsablebytearray.readInt() == Atom.TYPE_sinf)
	//*  23   44:aload_0         
	//*  24   45:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//*  25   48:getstatic       #443 <Field int Atom.TYPE_sinf>
	//*  26   51:icmpne          96
				{
					Pair pair = parseSinfFromParent(parsablebytearray, l, i1);
	//   27   54:aload_0         
	//   28   55:iload           5
	//   29   57:iload           6
	//   30   59:invokestatic    #447 <Method Pair parseSinfFromParent(ParsableByteArray, int, int)>
	//   31   62:astore          8
					if(pair != null)
	//*  32   64:aload           8
	//*  33   66:ifnull          96
					{
						stsddata.trackEncryptionBoxes[k] = (TrackEncryptionBox)pair.second;
	//   34   69:aload_3         
	//   35   70:getfield        #451 <Field TrackEncryptionBox[] AtomParsers$StsdData.trackEncryptionBoxes>
	//   36   73:iload           4
	//   37   75:aload           8
	//   38   77:getfield        #211 <Field Object Pair.second>
	//   39   80:checkcast       #453 <Class TrackEncryptionBox>
	//   40   83:aastore         
						return ((Integer)pair.first).intValue();
	//   41   84:aload           8
	//   42   86:getfield        #206 <Field Object Pair.first>
	//   43   89:checkcast       #165 <Class Integer>
	//   44   92:invokevirtual   #228 <Method int Integer.intValue()>
	//   45   95:ireturn         
					}
				}
				l += i1;
	//   46   96:iload           5
	//   47   98:iload           6
	//   48  100:iadd            
	//   49  101:istore          5
			} else
	//*  50  103:goto            6
			{
				return 0;
	//   51  106:iconst_0        
	//   52  107:ireturn         
			}
		} while(true);
	}

	private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsablebytearray, int i, int j)
	{
		int l;
		for(int k = i + 8; k - i < j; k += l)
	//*   0    0:iload_1         
	//*   1    1:bipush          8
	//*   2    3:iadd            
	//*   3    4:istore_3        
	//*   4    5:iload_3         
	//*   5    6:iload_1         
	//*   6    7:isub            
	//*   7    8:iload_2         
	//*   8    9:icmpge          100
		{
			parsablebytearray.setPosition(k);
	//    9   12:aload_0         
	//   10   13:iload_3         
	//   11   14:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
			l = parsablebytearray.readInt();
	//   12   17:aload_0         
	//   13   18:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   14   21:istore          4
			if(parsablebytearray.readInt() == Atom.TYPE_tenc)
	//*  15   23:aload_0         
	//*  16   24:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//*  17   27:getstatic       #458 <Field int Atom.TYPE_tenc>
	//*  18   30:icmpne          92
			{
				parsablebytearray.skipBytes(6);
	//   19   33:aload_0         
	//   20   34:bipush          6
	//   21   36:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
				i = parsablebytearray.readUnsignedByte();
	//   22   39:aload_0         
	//   23   40:invokevirtual   #242 <Method int ParsableByteArray.readUnsignedByte()>
	//   24   43:istore_1        
				boolean flag = true;
	//   25   44:iconst_1        
	//   26   45:istore          5
				if(i != 1)
	//*  27   47:iload_1         
	//*  28   48:iconst_1        
	//*  29   49:icmpne          55
	//*  30   52:goto            58
					flag = false;
	//   31   55:iconst_0        
	//   32   56:istore          5
				i = parsablebytearray.readUnsignedByte();
	//   33   58:aload_0         
	//   34   59:invokevirtual   #242 <Method int ParsableByteArray.readUnsignedByte()>
	//   35   62:istore_1        
				byte abyte0[] = new byte[16];
	//   36   63:bipush          16
	//   37   65:newarray        byte[]
	//   38   67:astore          6
				parsablebytearray.readBytes(abyte0, 0, abyte0.length);
	//   39   69:aload_0         
	//   40   70:aload           6
	//   41   72:iconst_0        
	//   42   73:aload           6
	//   43   75:arraylength     
	//   44   76:invokevirtual   #344 <Method void ParsableByteArray.readBytes(byte[], int, int)>
				return new TrackEncryptionBox(flag, i, abyte0);
	//   45   79:new             #453 <Class TrackEncryptionBox>
	//   46   82:dup             
	//   47   83:iload           5
	//   48   85:iload_1         
	//   49   86:aload           6
	//   50   88:invokespecial   #461 <Method void TrackEncryptionBox(boolean, int, byte[])>
	//   51   91:areturn         
			}
		}

	//   52   92:iload_3         
	//   53   93:iload           4
	//   54   95:iadd            
	//   55   96:istore_3        
	//*  56   97:goto            5
		return null;
	//   57  100:aconst_null     
	//   58  101:areturn         
	}

	private static Pair parseSinfFromParent(ParsableByteArray parsablebytearray, int i, int j)
	{
		int k = i + 8;
	//    0    0:iload_1         
	//    1    1:bipush          8
	//    2    3:iadd            
	//    3    4:istore          4
		boolean flag3 = false;
	//    4    6:iconst_0        
	//    5    7:istore          9
		Integer integer = null;
	//    6    9:aconst_null     
	//    7   10:astore          10
		Object obj = ((Object) (integer));
	//    8   12:aload           10
	//    9   14:astore          11
		boolean flag = false;
	//   10   16:iconst_0        
	//   11   17:istore_3        
		do
		{
			boolean flag1 = true;
	//   12   18:iconst_1        
	//   13   19:istore          5
			if(k - i >= j)
				break;
	//   14   21:iload           4
	//   15   23:iload_1         
	//   16   24:isub            
	//   17   25:iload_2         
	//   18   26:icmpge          160
			parsablebytearray.setPosition(k);
	//   19   29:aload_0         
	//   20   30:iload           4
	//   21   32:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
			int l = parsablebytearray.readInt();
	//   22   35:aload_0         
	//   23   36:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   24   39:istore          6
			int i1 = parsablebytearray.readInt();
	//   25   41:aload_0         
	//   26   42:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   27   45:istore          7
			Integer integer1;
			if(i1 == Atom.TYPE_frma)
	//*  28   47:iload           7
	//*  29   49:getstatic       #464 <Field int Atom.TYPE_frma>
	//*  30   52:icmpne          70
			{
				integer1 = Integer.valueOf(parsablebytearray.readInt());
	//   31   55:aload_0         
	//   32   56:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   33   59:invokestatic    #362 <Method Integer Integer.valueOf(int)>
	//   34   62:astore          12
				flag1 = flag;
	//   35   64:iload_3         
	//   36   65:istore          5
			} else
	//*  37   67:goto            143
			if(i1 == Atom.TYPE_schm)
	//*  38   70:iload           7
	//*  39   72:getstatic       #467 <Field int Atom.TYPE_schm>
	//*  40   75:icmpne          111
			{
				parsablebytearray.skipBytes(4);
	//   41   78:aload_0         
	//   42   79:iconst_4        
	//   43   80:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
				if(parsablebytearray.readInt() == TYPE_cenc)
	//*  44   83:aload_0         
	//*  45   84:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//*  46   87:getstatic       #43  <Field int TYPE_cenc>
	//*  47   90:icmpne          99
					flag = flag1;
	//   48   93:iload           5
	//   49   95:istore_3        
				else
	//*  50   96:goto            101
					flag = false;
	//   51   99:iconst_0        
	//   52  100:istore_3        
				flag1 = flag;
	//   53  101:iload_3         
	//   54  102:istore          5
				integer1 = integer;
	//   55  104:aload           10
	//   56  106:astore          12
			} else
	//*  57  108:goto            143
			{
				flag1 = flag;
	//   58  111:iload_3         
	//   59  112:istore          5
				integer1 = integer;
	//   60  114:aload           10
	//   61  116:astore          12
				if(i1 == Atom.TYPE_schi)
	//*  62  118:iload           7
	//*  63  120:getstatic       #470 <Field int Atom.TYPE_schi>
	//*  64  123:icmpne          143
				{
					obj = ((Object) (parseSchiFromParent(parsablebytearray, k, l)));
	//   65  126:aload_0         
	//   66  127:iload           4
	//   67  129:iload           6
	//   68  131:invokestatic    #472 <Method TrackEncryptionBox parseSchiFromParent(ParsableByteArray, int, int)>
	//   69  134:astore          11
					integer1 = integer;
	//   70  136:aload           10
	//   71  138:astore          12
					flag1 = flag;
	//   72  140:iload_3         
	//   73  141:istore          5
				}
			}
			k += l;
	//   74  143:iload           4
	//   75  145:iload           6
	//   76  147:iadd            
	//   77  148:istore          4
			flag = flag1;
	//   78  150:iload           5
	//   79  152:istore_3        
			integer = integer1;
	//   80  153:aload           12
	//   81  155:astore          10
		} while(true);
	//   82  157:goto            18
		if(flag)
	//*  83  160:iload_3         
	//*  84  161:ifeq            214
		{
			boolean flag2;
			if(integer != null)
	//*  85  164:aload           10
	//*  86  166:ifnull          175
				flag2 = true;
	//   87  169:iconst_1        
	//   88  170:istore          8
			else
	//*  89  172:goto            178
				flag2 = false;
	//   90  175:iconst_0        
	//   91  176:istore          8
			Assertions.checkArgument(flag2, "frma atom is mandatory");
	//   92  178:iload           8
	//   93  180:ldc2            #474 <String "frma atom is mandatory">
	//   94  183:invokestatic    #70  <Method void Assertions.checkArgument(boolean, Object)>
			flag2 = flag3;
	//   95  186:iload           9
	//   96  188:istore          8
			if(obj != null)
	//*  97  190:aload           11
	//*  98  192:ifnull          198
				flag2 = true;
	//   99  195:iconst_1        
	//  100  196:istore          8
			Assertions.checkArgument(flag2, "schi->tenc atom is mandatory");
	//  101  198:iload           8
	//  102  200:ldc2            #476 <String "schi->tenc atom is mandatory">
	//  103  203:invokestatic    #70  <Method void Assertions.checkArgument(boolean, Object)>
			return Pair.create(((Object) (integer)), obj);
	//  104  206:aload           10
	//  105  208:aload           11
	//  106  210:invokestatic    #328 <Method Pair Pair.create(Object, Object)>
	//  107  213:areturn         
		} else
		{
			return null;
	//  108  214:aconst_null     
	//  109  215:areturn         
		}
	}

	public static TrackSampleTable parseStbl(Track track, Atom.ContainerAtom containeratom)
		throws ParserException
	{
label0:
		{
			Object obj = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_stsz)));
	//    0    0:aload_1         
	//    1    1:getstatic       #484 <Field int Atom.TYPE_stsz>
	//    2    4:invokevirtual   #293 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//    3    7:astore          26
			if(obj != null)
	//*   4    9:aload           26
	//*   5   11:ifnull          28
			{
				obj = ((Object) (new StszSampleSizeBox(((Atom.LeafAtom) (obj)))));
	//    6   14:new             #18  <Class AtomParsers$StszSampleSizeBox>
	//    7   17:dup             
	//    8   18:aload           26
	//    9   20:invokespecial   #487 <Method void AtomParsers$StszSampleSizeBox(Atom$LeafAtom)>
	//   10   23:astore          26
			} else
	//*  11   25:goto            53
			{
				obj = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_stz2)));
	//   12   28:aload_1         
	//   13   29:getstatic       #490 <Field int Atom.TYPE_stz2>
	//   14   32:invokevirtual   #293 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   15   35:astore          26
				if(obj == null)
					break label0;
	//   16   37:aload           26
	//   17   39:ifnull          1806
				obj = ((Object) (new Stz2SampleSizeBox(((Atom.LeafAtom) (obj)))));
	//   18   42:new             #21  <Class AtomParsers$Stz2SampleSizeBox>
	//   19   45:dup             
	//   20   46:aload           26
	//   21   48:invokespecial   #491 <Method void AtomParsers$Stz2SampleSizeBox(Atom$LeafAtom)>
	//   22   51:astore          26
			}
			int l = ((SampleSizeBox) (obj)).getSampleCount();
	//   23   53:aload           26
	//   24   55:invokeinterface #494 <Method int AtomParsers$SampleSizeBox.getSampleCount()>
	//   25   60:istore          5
			if(l == 0)
	//*  26   62:iload           5
	//*  27   64:ifne            88
				return new TrackSampleTable(new long[0], new int[0], 0, new long[0], new int[0]);
	//   28   67:new             #496 <Class TrackSampleTable>
	//   29   70:dup             
	//   30   71:iconst_0        
	//   31   72:newarray        long[]
	//   32   74:iconst_0        
	//   33   75:newarray        int[]
	//   34   77:iconst_0        
	//   35   78:iconst_0        
	//   36   79:newarray        long[]
	//   37   81:iconst_0        
	//   38   82:newarray        int[]
	//   39   84:invokespecial   #499 <Method void TrackSampleTable(long[], int[], int, long[], int[])>
	//   40   87:areturn         
			Object obj1 = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_stco)));
	//   41   88:aload_1         
	//   42   89:getstatic       #502 <Field int Atom.TYPE_stco>
	//   43   92:invokevirtual   #293 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   44   95:astore          27
			boolean flag4;
			if(obj1 == null)
	//*  45   97:aload           27
	//*  46   99:ifnonnull       117
			{
				obj1 = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_co64)));
	//   47  102:aload_1         
	//   48  103:getstatic       #505 <Field int Atom.TYPE_co64>
	//   49  106:invokevirtual   #293 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   50  109:astore          27
				flag4 = true;
	//   51  111:iconst_1        
	//   52  112:istore          17
			} else
	//*  53  114:goto            120
			{
				flag4 = false;
	//   54  117:iconst_0        
	//   55  118:istore          17
			}
			ParsableByteArray parsablebytearray = ((Atom.LeafAtom) (obj1)).data;
	//   56  120:aload           27
	//   57  122:getfield        #299 <Field ParsableByteArray Atom$LeafAtom.data>
	//   58  125:astore          28
			ParsableByteArray parsablebytearray1 = containeratom.getLeafAtomOfType(Atom.TYPE_stsc).data;
	//   59  127:aload_1         
	//   60  128:getstatic       #508 <Field int Atom.TYPE_stsc>
	//   61  131:invokevirtual   #293 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   62  134:getfield        #299 <Field ParsableByteArray Atom$LeafAtom.data>
	//   63  137:astore          29
			Object obj3 = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_stts).data));
	//   64  139:aload_1         
	//   65  140:getstatic       #511 <Field int Atom.TYPE_stts>
	//   66  143:invokevirtual   #293 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   67  146:getfield        #299 <Field ParsableByteArray Atom$LeafAtom.data>
	//   68  149:astore          32
			obj1 = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_stss)));
	//   69  151:aload_1         
	//   70  152:getstatic       #514 <Field int Atom.TYPE_stss>
	//   71  155:invokevirtual   #293 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   72  158:astore          27
			if(obj1 != null)
	//*  73  160:aload           27
	//*  74  162:ifnull          175
				obj1 = ((Object) (((Atom.LeafAtom) (obj1)).data));
	//   75  165:aload           27
	//   76  167:getfield        #299 <Field ParsableByteArray Atom$LeafAtom.data>
	//   77  170:astore          27
			else
	//*  78  172:goto            178
				obj1 = null;
	//   79  175:aconst_null     
	//   80  176:astore          27
			containeratom = ((Atom.ContainerAtom) (containeratom.getLeafAtomOfType(Atom.TYPE_ctts)));
	//   81  178:aload_1         
	//   82  179:getstatic       #517 <Field int Atom.TYPE_ctts>
	//   83  182:invokevirtual   #293 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   84  185:astore_1        
			if(containeratom != null)
	//*  85  186:aload_1         
	//*  86  187:ifnull          198
				containeratom = ((Atom.ContainerAtom) (((Atom.LeafAtom) (containeratom)).data));
	//   87  190:aload_1         
	//   88  191:getfield        #299 <Field ParsableByteArray Atom$LeafAtom.data>
	//   89  194:astore_1        
			else
	//*  90  195:goto            200
				containeratom = null;
	//   91  198:aconst_null     
	//   92  199:astore_1        
			ChunkIterator chunkiterator = new ChunkIterator(parsablebytearray1, parsablebytearray, flag4);
	//   93  200:new             #9   <Class AtomParsers$ChunkIterator>
	//   94  203:dup             
	//   95  204:aload           29
	//   96  206:aload           28
	//   97  208:iload           17
	//   98  210:invokespecial   #520 <Method void AtomParsers$ChunkIterator(ParsableByteArray, ParsableByteArray, boolean)>
	//   99  213:astore          33
			((ParsableByteArray) (obj3)).setPosition(12);
	//  100  215:aload           32
	//  101  217:bipush          12
	//  102  219:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
			int k2 = ((ParsableByteArray) (obj3)).readUnsignedIntToInt() - 1;
	//  103  222:aload           32
	//  104  224:invokevirtual   #96  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  105  227:iconst_1        
	//  106  228:isub            
	//  107  229:istore          7
			int k5 = ((ParsableByteArray) (obj3)).readUnsignedIntToInt();
	//  108  231:aload           32
	//  109  233:invokevirtual   #96  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  110  236:istore          12
			int l4 = ((ParsableByteArray) (obj3)).readUnsignedIntToInt();
	//  111  238:aload           32
	//  112  240:invokevirtual   #96  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  113  243:istore          10
			int i;
			if(containeratom != null)
	//* 114  245:aload_1         
	//* 115  246:ifnull          263
			{
				((ParsableByteArray) (containeratom)).setPosition(12);
	//  116  249:aload_1         
	//  117  250:bipush          12
	//  118  252:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
				i = ((ParsableByteArray) (containeratom)).readUnsignedIntToInt();
	//  119  255:aload_1         
	//  120  256:invokevirtual   #96  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  121  259:istore_2        
			} else
	//* 122  260:goto            265
			{
				i = 0;
	//  123  263:iconst_0        
	//  124  264:istore_2        
			}
			int k = -1;
	//  125  265:iconst_m1       
	//  126  266:istore          4
			int j;
			if(obj1 != null)
	//* 127  268:aload           27
	//* 128  270:ifnull          308
			{
				((ParsableByteArray) (obj1)).setPosition(12);
	//  129  273:aload           27
	//  130  275:bipush          12
	//  131  277:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
				j = ((ParsableByteArray) (obj1)).readUnsignedIntToInt();
	//  132  280:aload           27
	//  133  282:invokevirtual   #96  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  134  285:istore_3        
				if(j > 0)
	//* 135  286:iload_3         
	//* 136  287:ifle            302
					k = ((ParsableByteArray) (obj1)).readUnsignedIntToInt() - 1;
	//  137  290:aload           27
	//  138  292:invokevirtual   #96  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  139  295:iconst_1        
	//  140  296:isub            
	//  141  297:istore          4
				else
	//* 142  299:goto            310
					obj1 = null;
	//  143  302:aconst_null     
	//  144  303:astore          27
			} else
	//* 145  305:goto            310
			{
				j = 0;
	//  146  308:iconst_0        
	//  147  309:istore_3        
			}
			boolean flag2;
			if(((SampleSizeBox) (obj)).isFixedSampleSize() && "audio/raw".equals(((Object) (track.mediaFormat.mimeType))) && k2 == 0 && i == 0 && j == 0)
	//* 148  310:aload           26
	//* 149  312:invokeinterface #524 <Method boolean AtomParsers$SampleSizeBox.isFixedSampleSize()>
	//* 150  317:ifeq            354
	//* 151  320:ldc1            #155 <String "audio/raw">
	//* 152  322:aload_0         
	//* 153  323:getfield        #527 <Field MediaFormat Track.mediaFormat>
	//* 154  326:getfield        #530 <Field String MediaFormat.mimeType>
	//* 155  329:invokevirtual   #219 <Method boolean String.equals(Object)>
	//* 156  332:ifeq            354
	//* 157  335:iload           7
	//* 158  337:ifne            354
	//* 159  340:iload_2         
	//* 160  341:ifne            354
	//* 161  344:iload_3         
	//* 162  345:ifne            354
				flag2 = true;
	//  163  348:iconst_1        
	//  164  349:istore          6
			else
	//* 165  351:goto            357
				flag2 = false;
	//  166  354:iconst_0        
	//  167  355:istore          6
			long l13 = 0L;
	//  168  357:lconst_0        
	//  169  358:lstore          22
			int ai[];
			long al[];
			if(!flag2)
	//* 170  360:iload           6
	//* 171  362:ifne            943
			{
				long al2[] = new long[l];
	//  172  365:iload           5
	//  173  367:newarray        long[]
	//  174  369:astore          31
				int ai1[] = new int[l];
	//  175  371:iload           5
	//  176  373:newarray        int[]
	//  177  375:astore          29
				al = new long[l];
	//  178  377:iload           5
	//  179  379:newarray        long[]
	//  180  381:astore          28
				int ai3[] = new int[l];
	//  181  383:iload           5
	//  182  385:newarray        int[]
	//  183  387:astore          30
				int l5 = j;
	//  184  389:iload_3         
	//  185  390:istore          13
				long l7 = 0L;
	//  186  392:lconst_0        
	//  187  393:lstore          18
				long l10 = l7;
	//  188  395:lload           18
	//  189  397:lstore          20
				j = 0;
	//  190  399:iconst_0        
	//  191  400:istore_3        
				boolean flag3 = false;
	//  192  401:iconst_0        
	//  193  402:istore          15
				int k3 = 0;
	//  194  404:iconst_0        
	//  195  405:istore          8
				int j4 = 0;
	//  196  407:iconst_0        
	//  197  408:istore          9
				int j1 = k2;
	//  198  410:iload           7
	//  199  412:istore          6
				int j5 = 0;
	//  200  414:iconst_0        
	//  201  415:istore          11
				int j6 = k;
	//  202  417:iload           4
	//  203  419:istore          14
				k2 = ((int) (flag3));
	//  204  421:iload           15
	//  205  423:istore          7
				k = l;
	//  206  425:iload           5
	//  207  427:istore          4
				l = l5;
	//  208  429:iload           13
	//  209  431:istore          5
				while(j5 < k) 
	//* 210  433:iload           11
	//* 211  435:iload           4
	//* 212  437:icmpge          746
				{
					int i6 = k3;
	//  213  440:iload           8
	//  214  442:istore          13
					k3 = l4;
	//  215  444:iload           10
	//  216  446:istore          8
					for(; i6 == 0; i6 = chunkiterator.numSamples)
	//* 217  448:iload           13
	//* 218  450:ifne            478
					{
						Assertions.checkState(chunkiterator.moveNext());
	//  219  453:aload           33
	//  220  455:invokevirtual   #533 <Method boolean AtomParsers$ChunkIterator.moveNext()>
	//  221  458:invokestatic    #537 <Method void Assertions.checkState(boolean)>
						l7 = chunkiterator.offset;
	//  222  461:aload           33
	//  223  463:getfield        #541 <Field long AtomParsers$ChunkIterator.offset>
	//  224  466:lstore          18
					}

	//  225  468:aload           33
	//  226  470:getfield        #544 <Field int AtomParsers$ChunkIterator.numSamples>
	//  227  473:istore          13
	//* 228  475:goto            448
					int k6;
					if(containeratom != null)
	//* 229  478:aload_1         
	//* 230  479:ifnull          521
					{
						for(; j4 == 0 && i > 0; i--)
	//* 231  482:iload           9
	//* 232  484:ifne            509
	//* 233  487:iload_2         
	//* 234  488:ifle            509
						{
							j4 = ((ParsableByteArray) (containeratom)).readUnsignedIntToInt();
	//  235  491:aload_1         
	//  236  492:invokevirtual   #96  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  237  495:istore          9
							j = ((ParsableByteArray) (containeratom)).readInt();
	//  238  497:aload_1         
	//  239  498:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//  240  501:istore_3        
						}

	//  241  502:iload_2         
	//  242  503:iconst_1        
	//  243  504:isub            
	//  244  505:istore_2        
	//* 245  506:goto            482
						j4--;
	//  246  509:iload           9
	//  247  511:iconst_1        
	//  248  512:isub            
	//  249  513:istore          9
						k6 = i;
	//  250  515:iload_2         
	//  251  516:istore          15
					} else
	//* 252  518:goto            524
					{
						k6 = i;
	//  253  521:iload_2         
	//  254  522:istore          15
					}
					al2[j5] = l7;
	//  255  524:aload           31
	//  256  526:iload           11
	//  257  528:lload           18
	//  258  530:lastore         
					ai1[j5] = ((SampleSizeBox) (obj)).readNextSampleSize();
	//  259  531:aload           29
	//  260  533:iload           11
	//  261  535:aload           26
	//  262  537:invokeinterface #547 <Method int AtomParsers$SampleSizeBox.readNextSampleSize()>
	//  263  542:iastore         
					int l6;
					if(ai1[j5] > k2)
	//* 264  543:aload           29
	//* 265  545:iload           11
	//* 266  547:iaload          
	//* 267  548:iload           7
	//* 268  550:icmple          563
						l6 = ai1[j5];
	//  269  553:aload           29
	//  270  555:iload           11
	//  271  557:iaload          
	//  272  558:istore          16
					else
	//* 273  560:goto            567
						l6 = k2;
	//  274  563:iload           7
	//  275  565:istore          16
					al[j5] = l10 + (long)j;
	//  276  567:aload           28
	//  277  569:iload           11
	//  278  571:lload           20
	//  279  573:iload_3         
	//  280  574:i2l             
	//  281  575:ladd            
	//  282  576:lastore         
					if(obj1 == null)
	//* 283  577:aload           27
	//* 284  579:ifnonnull       587
						i = 1;
	//  285  582:iconst_1        
	//  286  583:istore_2        
					else
	//* 287  584:goto            589
						i = 0;
	//  288  587:iconst_0        
	//  289  588:istore_2        
					ai3[j5] = i;
	//  290  589:aload           30
	//  291  591:iload           11
	//  292  593:iload_2         
	//  293  594:iastore         
					if(j5 == j6)
	//* 294  595:iload           11
	//* 295  597:iload           14
	//* 296  599:icmpne          636
					{
						ai3[j5] = 1;
	//  297  602:aload           30
	//  298  604:iload           11
	//  299  606:iconst_1        
	//  300  607:iastore         
						i = l - 1;
	//  301  608:iload           5
	//  302  610:iconst_1        
	//  303  611:isub            
	//  304  612:istore_2        
						if(i > 0)
	//* 305  613:iload_2         
	//* 306  614:ifle            633
						{
							l = ((ParsableByteArray) (obj1)).readUnsignedIntToInt();
	//  307  617:aload           27
	//  308  619:invokevirtual   #96  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  309  622:istore          5
							j6 = l - 1;
	//  310  624:iload           5
	//  311  626:iconst_1        
	//  312  627:isub            
	//  313  628:istore          14
						}
					} else
	//* 314  630:goto            639
	//* 315  633:goto            639
					{
						i = l;
	//  316  636:iload           5
	//  317  638:istore_2        
					}
					l10 += k3;
	//  318  639:lload           20
	//  319  641:iload           8
	//  320  643:i2l             
	//  321  644:ladd            
	//  322  645:lstore          20
					k2 = k5 - 1;
	//  323  647:iload           12
	//  324  649:iconst_1        
	//  325  650:isub            
	//  326  651:istore          7
					if(k2 == 0 && j1 > 0)
	//* 327  653:iload           7
	//* 328  655:ifne            690
	//* 329  658:iload           6
	//* 330  660:ifle            690
					{
						k2 = ((ParsableByteArray) (obj3)).readUnsignedIntToInt();
	//  331  663:aload           32
	//  332  665:invokevirtual   #96  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  333  668:istore          7
						k3 = ((ParsableByteArray) (obj3)).readUnsignedIntToInt();
	//  334  670:aload           32
	//  335  672:invokevirtual   #96  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  336  675:istore          8
						l = j1 - 1;
	//  337  677:iload           6
	//  338  679:iconst_1        
	//  339  680:isub            
	//  340  681:istore          5
						j1 = k3;
	//  341  683:iload           8
	//  342  685:istore          6
					} else
	//* 343  687:goto            698
					{
						l = j1;
	//  344  690:iload           6
	//  345  692:istore          5
						j1 = k3;
	//  346  694:iload           8
	//  347  696:istore          6
					}
					l7 += ai1[j5];
	//  348  698:lload           18
	//  349  700:aload           29
	//  350  702:iload           11
	//  351  704:iaload          
	//  352  705:i2l             
	//  353  706:ladd            
	//  354  707:lstore          18
					k3 = i6 - 1;
	//  355  709:iload           13
	//  356  711:iconst_1        
	//  357  712:isub            
	//  358  713:istore          8
					j5++;
	//  359  715:iload           11
	//  360  717:iconst_1        
	//  361  718:iadd            
	//  362  719:istore          11
					l4 = j1;
	//  363  721:iload           6
	//  364  723:istore          10
					j1 = l;
	//  365  725:iload           5
	//  366  727:istore          6
					l = i;
	//  367  729:iload_2         
	//  368  730:istore          5
					k5 = k2;
	//  369  732:iload           7
	//  370  734:istore          12
					k2 = l6;
	//  371  736:iload           16
	//  372  738:istore          7
					i = k6;
	//  373  740:iload           15
	//  374  742:istore_2        
				}
	//* 375  743:goto            433
				j = k;
	//  376  746:iload           4
	//  377  748:istore_3        
				boolean flag5;
				if(j4 == 0)
	//* 378  749:iload           9
	//* 379  751:ifne            760
					flag5 = true;
	//  380  754:iconst_1        
	//  381  755:istore          17
				else
	//* 382  757:goto            763
					flag5 = false;
	//  383  760:iconst_0        
	//  384  761:istore          17
				Assertions.checkArgument(flag5);
	//  385  763:iload           17
	//  386  765:invokestatic    #549 <Method void Assertions.checkArgument(boolean)>
				for(; i > 0; i--)
	//* 387  768:iload_2         
	//* 388  769:ifle            805
				{
					boolean flag6;
					if(((ParsableByteArray) (containeratom)).readUnsignedIntToInt() == 0)
	//* 389  772:aload_1         
	//* 390  773:invokevirtual   #96  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//* 391  776:ifne            785
						flag6 = true;
	//  392  779:iconst_1        
	//  393  780:istore          17
					else
	//* 394  782:goto            788
						flag6 = false;
	//  395  785:iconst_0        
	//  396  786:istore          17
					Assertions.checkArgument(flag6);
	//  397  788:iload           17
	//  398  790:invokestatic    #549 <Method void Assertions.checkArgument(boolean)>
					((ParsableByteArray) (containeratom)).readInt();
	//  399  793:aload_1         
	//  400  794:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//  401  797:pop             
				}

	//  402  798:iload_2         
	//  403  799:iconst_1        
	//  404  800:isub            
	//  405  801:istore_2        
	//* 406  802:goto            768
				if(l != 0 || k5 != 0 || k3 != 0 || j1 != 0)
	//* 407  805:iload           5
	//* 408  807:ifne            831
	//* 409  810:iload           12
	//* 410  812:ifne            831
	//* 411  815:iload           8
	//* 412  817:ifne            831
	//* 413  820:iload           6
	//* 414  822:ifeq            828
	//* 415  825:goto            831
	//* 416  828:goto            926
				{
					containeratom = ((Atom.ContainerAtom) (new StringBuilder()));
	//  417  831:new             #395 <Class StringBuilder>
	//  418  834:dup             
	//  419  835:invokespecial   #396 <Method void StringBuilder()>
	//  420  838:astore_1        
					((StringBuilder) (containeratom)).append("Inconsistent stbl box for track ");
	//  421  839:aload_1         
	//  422  840:ldc2            #551 <String "Inconsistent stbl box for track ">
	//  423  843:invokevirtual   #402 <Method StringBuilder StringBuilder.append(String)>
	//  424  846:pop             
					((StringBuilder) (containeratom)).append(track.id);
	//  425  847:aload_1         
	//  426  848:aload_0         
	//  427  849:getfield        #554 <Field int Track.id>
	//  428  852:invokevirtual   #557 <Method StringBuilder StringBuilder.append(int)>
	//  429  855:pop             
					((StringBuilder) (containeratom)).append(": remainingSynchronizationSamples ");
	//  430  856:aload_1         
	//  431  857:ldc2            #559 <String ": remainingSynchronizationSamples ">
	//  432  860:invokevirtual   #402 <Method StringBuilder StringBuilder.append(String)>
	//  433  863:pop             
					((StringBuilder) (containeratom)).append(l);
	//  434  864:aload_1         
	//  435  865:iload           5
	//  436  867:invokevirtual   #557 <Method StringBuilder StringBuilder.append(int)>
	//  437  870:pop             
					((StringBuilder) (containeratom)).append(", remainingSamplesAtTimestampDelta ");
	//  438  871:aload_1         
	//  439  872:ldc2            #561 <String ", remainingSamplesAtTimestampDelta ">
	//  440  875:invokevirtual   #402 <Method StringBuilder StringBuilder.append(String)>
	//  441  878:pop             
					((StringBuilder) (containeratom)).append(k5);
	//  442  879:aload_1         
	//  443  880:iload           12
	//  444  882:invokevirtual   #557 <Method StringBuilder StringBuilder.append(int)>
	//  445  885:pop             
					((StringBuilder) (containeratom)).append(", remainingSamplesInChunk ");
	//  446  886:aload_1         
	//  447  887:ldc2            #563 <String ", remainingSamplesInChunk ">
	//  448  890:invokevirtual   #402 <Method StringBuilder StringBuilder.append(String)>
	//  449  893:pop             
					((StringBuilder) (containeratom)).append(k3);
	//  450  894:aload_1         
	//  451  895:iload           8
	//  452  897:invokevirtual   #557 <Method StringBuilder StringBuilder.append(int)>
	//  453  900:pop             
					((StringBuilder) (containeratom)).append(", remainingTimestampDeltaChanges ");
	//  454  901:aload_1         
	//  455  902:ldc2            #565 <String ", remainingTimestampDeltaChanges ">
	//  456  905:invokevirtual   #402 <Method StringBuilder StringBuilder.append(String)>
	//  457  908:pop             
					((StringBuilder) (containeratom)).append(j1);
	//  458  909:aload_1         
	//  459  910:iload           6
	//  460  912:invokevirtual   #557 <Method StringBuilder StringBuilder.append(int)>
	//  461  915:pop             
					Log.w("AtomParsers", ((StringBuilder) (containeratom)).toString());
	//  462  916:ldc1            #29  <String "AtomParsers">
	//  463  918:aload_1         
	//  464  919:invokevirtual   #413 <Method String StringBuilder.toString()>
	//  465  922:invokestatic    #571 <Method int Log.w(String, String)>
	//  466  925:pop             
				}
				i = k2;
	//  467  926:iload           7
	//  468  928:istore_2        
				containeratom = ((Atom.ContainerAtom) (al2));
	//  469  929:aload           31
	//  470  931:astore_1        
				obj = ((Object) (ai3));
	//  471  932:aload           30
	//  472  934:astore          26
				ai = ai1;
	//  473  936:aload           29
	//  474  938:astore          27
			} else
	//* 475  940:goto            1050
			{
				j = l;
	//  476  943:iload           5
	//  477  945:istore_3        
				containeratom = ((Atom.ContainerAtom) (new long[chunkiterator.length]));
	//  478  946:aload           33
	//  479  948:getfield        #574 <Field int AtomParsers$ChunkIterator.length>
	//  480  951:newarray        long[]
	//  481  953:astore_1        
				ai = new int[chunkiterator.length];
	//  482  954:aload           33
	//  483  956:getfield        #574 <Field int AtomParsers$ChunkIterator.length>
	//  484  959:newarray        int[]
	//  485  961:astore          27
				while(chunkiterator.moveNext()) 
	//* 486  963:aload           33
	//* 487  965:invokevirtual   #533 <Method boolean AtomParsers$ChunkIterator.moveNext()>
	//* 488  968:ifeq            999
				{
					containeratom[chunkiterator.index] = chunkiterator.offset;
	//  489  971:aload_1         
	//  490  972:aload           33
	//  491  974:getfield        #577 <Field int AtomParsers$ChunkIterator.index>
	//  492  977:aload           33
	//  493  979:getfield        #541 <Field long AtomParsers$ChunkIterator.offset>
	//  494  982:lastore         
					ai[chunkiterator.index] = chunkiterator.numSamples;
	//  495  983:aload           27
	//  496  985:aload           33
	//  497  987:getfield        #577 <Field int AtomParsers$ChunkIterator.index>
	//  498  990:aload           33
	//  499  992:getfield        #544 <Field int AtomParsers$ChunkIterator.numSamples>
	//  500  995:iastore         
				}
	//* 501  996:goto            963
				obj = ((Object) (FixedSampleSizeRechunker.rechunk(((SampleSizeBox) (obj)).readNextSampleSize(), ((long []) (containeratom)), ai, l4)));
	//  502  999:aload           26
	//  503 1001:invokeinterface #547 <Method int AtomParsers$SampleSizeBox.readNextSampleSize()>
	//  504 1006:aload_1         
	//  505 1007:aload           27
	//  506 1009:iload           10
	//  507 1011:i2l             
	//  508 1012:invokestatic    #583 <Method FixedSampleSizeRechunker$Results FixedSampleSizeRechunker.rechunk(int, long[], int[], long)>
	//  509 1015:astore          26
				containeratom = ((Atom.ContainerAtom) (((FixedSampleSizeRechunker.Results) (obj)).offsets));
	//  510 1017:aload           26
	//  511 1019:getfield        #589 <Field long[] FixedSampleSizeRechunker$Results.offsets>
	//  512 1022:astore_1        
				ai = ((FixedSampleSizeRechunker.Results) (obj)).sizes;
	//  513 1023:aload           26
	//  514 1025:getfield        #593 <Field int[] FixedSampleSizeRechunker$Results.sizes>
	//  515 1028:astore          27
				i = ((FixedSampleSizeRechunker.Results) (obj)).maximumSize;
	//  516 1030:aload           26
	//  517 1032:getfield        #596 <Field int FixedSampleSizeRechunker$Results.maximumSize>
	//  518 1035:istore_2        
				al = ((FixedSampleSizeRechunker.Results) (obj)).timestamps;
	//  519 1036:aload           26
	//  520 1038:getfield        #599 <Field long[] FixedSampleSizeRechunker$Results.timestamps>
	//  521 1041:astore          28
				obj = ((Object) (((FixedSampleSizeRechunker.Results) (obj)).flags));
	//  522 1043:aload           26
	//  523 1045:getfield        #602 <Field int[] FixedSampleSizeRechunker$Results.flags>
	//  524 1048:astore          26
			}
			obj3 = ((Object) (track));
	//  525 1050:aload_0         
	//  526 1051:astore          32
			if(((Track) (obj3)).editListDurations == null)
	//* 527 1053:aload           32
	//* 528 1055:getfield        #605 <Field long[] Track.editListDurations>
	//* 529 1058:ifnonnull       1090
			{
				Util.scaleLargeTimestampsInPlace(al, 0xf4240L, ((Track) (obj3)).timescale);
	//  530 1061:aload           28
	//  531 1063:ldc2w           #606 <Long 0xf4240L>
	//  532 1066:aload           32
	//  533 1068:getfield        #610 <Field long Track.timescale>
	//  534 1071:invokestatic    #614 <Method void Util.scaleLargeTimestampsInPlace(long[], long, long)>
				return new TrackSampleTable(((long []) (containeratom)), ai, i, al, ((int []) (obj)));
	//  535 1074:new             #496 <Class TrackSampleTable>
	//  536 1077:dup             
	//  537 1078:aload_1         
	//  538 1079:aload           27
	//  539 1081:iload_2         
	//  540 1082:aload           28
	//  541 1084:aload           26
	//  542 1086:invokespecial   #499 <Method void TrackSampleTable(long[], int[], int, long[], int[])>
	//  543 1089:areturn         
			}
			if(((Track) (obj3)).editListDurations.length == 1 && ((Track) (obj3)).editListDurations[0] == 0L)
	//* 544 1090:aload           32
	//* 545 1092:getfield        #605 <Field long[] Track.editListDurations>
	//* 546 1095:arraylength     
	//* 547 1096:iconst_1        
	//* 548 1097:icmpne          1171
	//* 549 1100:aload           32
	//* 550 1102:getfield        #605 <Field long[] Track.editListDurations>
	//* 551 1105:iconst_0        
	//* 552 1106:laload          
	//* 553 1107:lconst_0        
	//* 554 1108:lcmp            
	//* 555 1109:ifne            1171
			{
				for(j = 0; j < al.length; j++)
	//* 556 1112:iconst_0        
	//* 557 1113:istore_3        
	//* 558 1114:iload_3         
	//* 559 1115:aload           28
	//* 560 1117:arraylength     
	//* 561 1118:icmpge          1155
					al[j] = Util.scaleLargeTimestamp(al[j] - ((Track) (obj3)).editListMediaTimes[0], 0xf4240L, ((Track) (obj3)).timescale);
	//  562 1121:aload           28
	//  563 1123:iload_3         
	//  564 1124:aload           28
	//  565 1126:iload_3         
	//  566 1127:laload          
	//  567 1128:aload           32
	//  568 1130:getfield        #617 <Field long[] Track.editListMediaTimes>
	//  569 1133:iconst_0        
	//  570 1134:laload          
	//  571 1135:lsub            
	//  572 1136:ldc2w           #606 <Long 0xf4240L>
	//  573 1139:aload           32
	//  574 1141:getfield        #610 <Field long Track.timescale>
	//  575 1144:invokestatic    #621 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  576 1147:lastore         

	//  577 1148:iload_3         
	//  578 1149:iconst_1        
	//  579 1150:iadd            
	//  580 1151:istore_3        
	//* 581 1152:goto            1114
				return new TrackSampleTable(((long []) (containeratom)), ai, i, al, ((int []) (obj)));
	//  582 1155:new             #496 <Class TrackSampleTable>
	//  583 1158:dup             
	//  584 1159:aload_1         
	//  585 1160:aload           27
	//  586 1162:iload_2         
	//  587 1163:aload           28
	//  588 1165:aload           26
	//  589 1167:invokespecial   #499 <Method void TrackSampleTable(long[], int[], int, long[], int[])>
	//  590 1170:areturn         
			}
			int k1 = 0;
	//  591 1171:iconst_0        
	//  592 1172:istore          6
			k = 0;
	//  593 1174:iconst_0        
	//  594 1175:istore          4
			l = 0;
	//  595 1177:iconst_0        
	//  596 1178:istore          5
			int l3;
			for(int l2 = 0; k1 < ((Track) (obj3)).editListDurations.length; l2 = l3)
	//* 597 1180:iconst_0        
	//* 598 1181:istore          7
	//* 599 1183:iload           6
	//* 600 1185:aload           32
	//* 601 1187:getfield        #605 <Field long[] Track.editListDurations>
	//* 602 1190:arraylength     
	//* 603 1191:icmpge          1327
			{
				long l8 = ((Track) (obj3)).editListMediaTimes[k1];
	//  604 1194:aload           32
	//  605 1196:getfield        #617 <Field long[] Track.editListMediaTimes>
	//  606 1199:iload           6
	//  607 1201:laload          
	//  608 1202:lstore          18
				int i5 = k;
	//  609 1204:iload           4
	//  610 1206:istore          10
				int k4 = l;
	//  611 1208:iload           5
	//  612 1210:istore          9
				l3 = l2;
	//  613 1212:iload           7
	//  614 1214:istore          8
				if(l8 != -1L)
	//* 615 1216:lload           18
	//* 616 1218:ldc2w           #622 <Long -1L>
	//* 617 1221:lcmp            
	//* 618 1222:ifeq            1306
				{
					long l11 = Util.scaleLargeTimestamp(((Track) (obj3)).editListDurations[k1], ((Track) (obj3)).timescale, ((Track) (obj3)).movieTimescale);
	//  619 1225:aload           32
	//  620 1227:getfield        #605 <Field long[] Track.editListDurations>
	//  621 1230:iload           6
	//  622 1232:laload          
	//  623 1233:aload           32
	//  624 1235:getfield        #610 <Field long Track.timescale>
	//  625 1238:aload           32
	//  626 1240:getfield        #626 <Field long Track.movieTimescale>
	//  627 1243:invokestatic    #621 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  628 1246:lstore          20
					i5 = Util.binarySearchCeil(al, l8, true, true);
	//  629 1248:aload           28
	//  630 1250:lload           18
	//  631 1252:iconst_1        
	//  632 1253:iconst_1        
	//  633 1254:invokestatic    #630 <Method int Util.binarySearchCeil(long[], long, boolean, boolean)>
	//  634 1257:istore          10
					l3 = Util.binarySearchCeil(al, l8 + l11, true, false);
	//  635 1259:aload           28
	//  636 1261:lload           18
	//  637 1263:lload           20
	//  638 1265:ladd            
	//  639 1266:iconst_1        
	//  640 1267:iconst_0        
	//  641 1268:invokestatic    #630 <Method int Util.binarySearchCeil(long[], long, boolean, boolean)>
	//  642 1271:istore          8
					k4 = l + (l3 - i5);
	//  643 1273:iload           5
	//  644 1275:iload           8
	//  645 1277:iload           10
	//  646 1279:isub            
	//  647 1280:iadd            
	//  648 1281:istore          9
					if(l2 != i5)
	//* 649 1283:iload           7
	//* 650 1285:iload           10
	//* 651 1287:icmpeq          1296
						l = 1;
	//  652 1290:iconst_1        
	//  653 1291:istore          5
					else
	//* 654 1293:goto            1299
						l = 0;
	//  655 1296:iconst_0        
	//  656 1297:istore          5
					i5 = k | l;
	//  657 1299:iload           4
	//  658 1301:iload           5
	//  659 1303:ior             
	//  660 1304:istore          10
				}
				k1++;
	//  661 1306:iload           6
	//  662 1308:iconst_1        
	//  663 1309:iadd            
	//  664 1310:istore          6
				k = i5;
	//  665 1312:iload           10
	//  666 1314:istore          4
				l = k4;
	//  667 1316:iload           9
	//  668 1318:istore          5
			}

	//  669 1320:iload           8
	//  670 1322:istore          7
	//* 671 1324:goto            1183
			if(l != j)
	//* 672 1327:iload           5
	//* 673 1329:iload_3         
	//* 674 1330:icmpeq          1338
				j = 1;
	//  675 1333:iconst_1        
	//  676 1334:istore_3        
			else
	//* 677 1335:goto            1340
				j = 0;
	//  678 1338:iconst_0        
	//  679 1339:istore_3        
			int i4 = j | k;
	//  680 1340:iload_3         
	//  681 1341:iload           4
	//  682 1343:ior             
	//  683 1344:istore          8
			long al1[];
			if(i4 != 0)
	//* 684 1346:iload           8
	//* 685 1348:ifeq            1360
				al1 = new long[l];
	//  686 1351:iload           5
	//  687 1353:newarray        long[]
	//  688 1355:astore          30
			else
	//* 689 1357:goto            1363
				al1 = ((long []) (containeratom));
	//  690 1360:aload_1         
	//  691 1361:astore          30
			if(i4 != 0)
	//* 692 1363:iload           8
	//* 693 1365:ifeq            1376
				track = ((Track) (new int[l]));
	//  694 1368:iload           5
	//  695 1370:newarray        int[]
	//  696 1372:astore_0        
			else
	//* 697 1373:goto            1379
				track = ((Track) (ai));
	//  698 1376:aload           27
	//  699 1378:astore_0        
			if(i4 != 0)
	//* 700 1379:iload           8
	//* 701 1381:ifeq            1386
				i = 0;
	//  702 1384:iconst_0        
	//  703 1385:istore_2        
			int ai2[];
			if(i4 != 0)
	//* 704 1386:iload           8
	//* 705 1388:ifeq            1400
				ai2 = new int[l];
	//  706 1391:iload           5
	//  707 1393:newarray        int[]
	//  708 1395:astore          29
			else
	//* 709 1397:goto            1404
				ai2 = ((int []) (obj));
	//  710 1400:aload           26
	//  711 1402:astore          29
			long al3[] = new long[l];
	//  712 1404:iload           5
	//  713 1406:newarray        long[]
	//  714 1408:astore          33
			k = 0;
	//  715 1410:iconst_0        
	//  716 1411:istore          4
			j = 0;
	//  717 1413:iconst_0        
	//  718 1414:istore_3        
			long l9 = l13;
	//  719 1415:lload           22
	//  720 1417:lstore          18
			int ai4[] = ai2;
	//  721 1419:aload           29
	//  722 1421:astore          31
			ai2 = ((int []) (track));
	//  723 1423:aload_0         
	//  724 1424:astore          29
			track = ((Track) (al));
	//  725 1426:aload           28
	//  726 1428:astore_0        
			while(k < ((Track) (obj3)).editListDurations.length) 
	//* 727 1429:iload           4
	//* 728 1431:aload           32
	//* 729 1433:getfield        #605 <Field long[] Track.editListDurations>
	//* 730 1436:arraylength     
	//* 731 1437:icmpge          1724
			{
				long l12 = ((Track) (obj3)).editListMediaTimes[k];
	//  732 1440:aload           32
	//  733 1442:getfield        #617 <Field long[] Track.editListMediaTimes>
	//  734 1445:iload           4
	//  735 1447:laload          
	//  736 1448:lstore          20
				long l14 = ((Track) (obj3)).editListDurations[k];
	//  737 1450:aload           32
	//  738 1452:getfield        #605 <Field long[] Track.editListDurations>
	//  739 1455:iload           4
	//  740 1457:laload          
	//  741 1458:lstore          22
				int i1;
				if(l12 != -1L)
	//* 742 1460:lload           20
	//* 743 1462:ldc2w           #622 <Long -1L>
	//* 744 1465:lcmp            
	//* 745 1466:ifeq            1674
				{
					long l15 = Util.scaleLargeTimestamp(l14, ((Track) (obj3)).timescale, ((Track) (obj3)).movieTimescale);
	//  746 1469:lload           22
	//  747 1471:aload           32
	//  748 1473:getfield        #610 <Field long Track.timescale>
	//  749 1476:aload           32
	//  750 1478:getfield        #626 <Field long Track.movieTimescale>
	//  751 1481:invokestatic    #621 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  752 1484:lstore          24
					i1 = Util.binarySearchCeil(((long []) (track)), l12, true, true);
	//  753 1486:aload_0         
	//  754 1487:lload           20
	//  755 1489:iconst_1        
	//  756 1490:iconst_1        
	//  757 1491:invokestatic    #630 <Method int Util.binarySearchCeil(long[], long, boolean, boolean)>
	//  758 1494:istore          5
					int i3 = Util.binarySearchCeil(((long []) (track)), l15 + l12, true, false);
	//  759 1496:aload_0         
	//  760 1497:lload           24
	//  761 1499:lload           20
	//  762 1501:ladd            
	//  763 1502:iconst_1        
	//  764 1503:iconst_0        
	//  765 1504:invokestatic    #630 <Method int Util.binarySearchCeil(long[], long, boolean, boolean)>
	//  766 1507:istore          7
					if(i4 != 0)
	//* 767 1509:iload           8
	//* 768 1511:ifeq            1559
					{
						int l1 = i3 - i1;
	//  769 1514:iload           7
	//  770 1516:iload           5
	//  771 1518:isub            
	//  772 1519:istore          6
						System.arraycopy(((Object) (containeratom)), i1, ((Object) (al1)), j, l1);
	//  773 1521:aload_1         
	//  774 1522:iload           5
	//  775 1524:aload           30
	//  776 1526:iload_3         
	//  777 1527:iload           6
	//  778 1529:invokestatic    #356 <Method void System.arraycopy(Object, int, Object, int, int)>
						System.arraycopy(((Object) (ai)), i1, ((Object) (ai2)), j, l1);
	//  779 1532:aload           27
	//  780 1534:iload           5
	//  781 1536:aload           29
	//  782 1538:iload_3         
	//  783 1539:iload           6
	//  784 1541:invokestatic    #356 <Method void System.arraycopy(Object, int, Object, int, int)>
						System.arraycopy(obj, i1, ((Object) (ai4)), j, l1);
	//  785 1544:aload           26
	//  786 1546:iload           5
	//  787 1548:aload           31
	//  788 1550:iload_3         
	//  789 1551:iload           6
	//  790 1553:invokestatic    #356 <Method void System.arraycopy(Object, int, Object, int, int)>
					}
	//* 791 1556:goto            1559
					int i2 = i;
	//  792 1559:iload_2         
	//  793 1560:istore          6
					i = j;
	//  794 1562:iload_3         
	//  795 1563:istore_2        
					j = i2;
	//  796 1564:iload           6
	//  797 1566:istore_3        
					for(int j2 = i3; i1 < j2;)
	//* 798 1567:iload           7
	//* 799 1569:istore          6
	//* 800 1571:iload           5
	//* 801 1573:iload           6
	//* 802 1575:icmpge          1656
					{
						al3[i] = Util.scaleLargeTimestamp(l9, 0xf4240L, ((Track) (obj3)).movieTimescale) + Util.scaleLargeTimestamp(track[i1] - l12, 0xf4240L, ((Track) (obj3)).timescale);
	//  803 1578:aload           33
	//  804 1580:iload_2         
	//  805 1581:lload           18
	//  806 1583:ldc2w           #606 <Long 0xf4240L>
	//  807 1586:aload           32
	//  808 1588:getfield        #626 <Field long Track.movieTimescale>
	//  809 1591:invokestatic    #621 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  810 1594:aload_0         
	//  811 1595:iload           5
	//  812 1597:laload          
	//  813 1598:lload           20
	//  814 1600:lsub            
	//  815 1601:ldc2w           #606 <Long 0xf4240L>
	//  816 1604:aload           32
	//  817 1606:getfield        #610 <Field long Track.timescale>
	//  818 1609:invokestatic    #621 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  819 1612:ladd            
	//  820 1613:lastore         
						int j3 = j;
	//  821 1614:iload_3         
	//  822 1615:istore          7
						if(i4 != 0)
	//* 823 1617:iload           8
	//* 824 1619:ifeq            1640
						{
							j3 = j;
	//  825 1622:iload_3         
	//  826 1623:istore          7
							if(ai2[i] > j)
	//* 827 1625:aload           29
	//* 828 1627:iload_2         
	//* 829 1628:iaload          
	//* 830 1629:iload_3         
	//* 831 1630:icmple          1640
								j3 = ai[i1];
	//  832 1633:aload           27
	//  833 1635:iload           5
	//  834 1637:iaload          
	//  835 1638:istore          7
						}
						i++;
	//  836 1640:iload_2         
	//  837 1641:iconst_1        
	//  838 1642:iadd            
	//  839 1643:istore_2        
						i1++;
	//  840 1644:iload           5
	//  841 1646:iconst_1        
	//  842 1647:iadd            
	//  843 1648:istore          5
						j = j3;
	//  844 1650:iload           7
	//  845 1652:istore_3        
					}

	//* 846 1653:goto            1571
					Atom.ContainerAtom containeratom1 = containeratom;
	//  847 1656:aload_1         
	//  848 1657:astore          28
					containeratom = ((Atom.ContainerAtom) (obj));
	//  849 1659:aload           26
	//  850 1661:astore_1        
					obj = ((Object) (track));
	//  851 1662:aload_0         
	//  852 1663:astore          26
					i1 = j;
	//  853 1665:iload_3         
	//  854 1666:istore          5
					track = ((Track) (containeratom1));
	//  855 1668:aload           28
	//  856 1670:astore_0        
				} else
	//* 857 1671:goto            1691
				{
					Track track1 = track;
	//  858 1674:aload_0         
	//  859 1675:astore          28
					track = ((Track) (containeratom));
	//  860 1677:aload_1         
	//  861 1678:astore_0        
					i1 = i;
	//  862 1679:iload_2         
	//  863 1680:istore          5
					containeratom = ((Atom.ContainerAtom) (obj));
	//  864 1682:aload           26
	//  865 1684:astore_1        
					obj = ((Object) (track1));
	//  866 1685:aload           28
	//  867 1687:astore          26
					i = j;
	//  868 1689:iload_3         
	//  869 1690:istore_2        
				}
				l9 += l14;
	//  870 1691:lload           18
	//  871 1693:lload           22
	//  872 1695:ladd            
	//  873 1696:lstore          18
				Object obj2 = obj;
	//  874 1698:aload           26
	//  875 1700:astore          28
				obj = ((Object) (containeratom));
	//  876 1702:aload_1         
	//  877 1703:astore          26
				k++;
	//  878 1705:iload           4
	//  879 1707:iconst_1        
	//  880 1708:iadd            
	//  881 1709:istore          4
				containeratom = ((Atom.ContainerAtom) (track));
	//  882 1711:aload_0         
	//  883 1712:astore_1        
				track = ((Track) (obj2));
	//  884 1713:aload           28
	//  885 1715:astore_0        
				j = i;
	//  886 1716:iload_2         
	//  887 1717:istore_3        
				i = i1;
	//  888 1718:iload           5
	//  889 1720:istore_2        
			}
	//* 890 1721:goto            1429
			j = 0;
	//  891 1724:iconst_0        
	//  892 1725:istore_3        
			boolean flag;
			for(flag = false; j < ai4.length && !flag; j++)
	//* 893 1726:iconst_0        
	//* 894 1727:istore          4
	//* 895 1729:iload_3         
	//* 896 1730:aload           31
	//* 897 1732:arraylength     
	//* 898 1733:icmpge          1773
	//* 899 1736:iload           4
	//* 900 1738:ifne            1773
			{
				boolean flag1;
				if((ai4[j] & 1) != 0)
	//* 901 1741:aload           31
	//* 902 1743:iload_3         
	//* 903 1744:iaload          
	//* 904 1745:iconst_1        
	//* 905 1746:iand            
	//* 906 1747:ifeq            1756
					flag1 = true;
	//  907 1750:iconst_1        
	//  908 1751:istore          5
				else
	//* 909 1753:goto            1759
					flag1 = false;
	//  910 1756:iconst_0        
	//  911 1757:istore          5
				flag |= flag1;
	//  912 1759:iload           4
	//  913 1761:iload           5
	//  914 1763:ior             
	//  915 1764:istore          4
			}

	//  916 1766:iload_3         
	//  917 1767:iconst_1        
	//  918 1768:iadd            
	//  919 1769:istore_3        
	//* 920 1770:goto            1729
			if(flag)
	//* 921 1773:iload           4
	//* 922 1775:ifeq            1795
				return new TrackSampleTable(al1, ai2, i, al3, ai4);
	//  923 1778:new             #496 <Class TrackSampleTable>
	//  924 1781:dup             
	//  925 1782:aload           30
	//  926 1784:aload           29
	//  927 1786:iload_2         
	//  928 1787:aload           33
	//  929 1789:aload           31
	//  930 1791:invokespecial   #499 <Method void TrackSampleTable(long[], int[], int, long[], int[])>
	//  931 1794:areturn         
			else
				throw new ParserException("The edited sample sequence does not contain a sync sample.");
	//  932 1795:new             #481 <Class ParserException>
	//  933 1798:dup             
	//  934 1799:ldc2            #632 <String "The edited sample sequence does not contain a sync sample.">
	//  935 1802:invokespecial   #633 <Method void ParserException(String)>
	//  936 1805:athrow          
		}
		throw new ParserException("Track has no sample table size information");
	//  937 1806:new             #481 <Class ParserException>
	//  938 1809:dup             
	//  939 1810:ldc2            #635 <String "Track has no sample table size information">
	//  940 1813:invokespecial   #633 <Method void ParserException(String)>
	//  941 1816:athrow          
	}

	private static StsdData parseStsd(ParsableByteArray parsablebytearray, int i, long l, int j, String s, boolean flag)
	{
		parsablebytearray.setPosition(12);
	//    0    0:aload_0         
	//    1    1:bipush          12
	//    2    3:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
		int i1 = parsablebytearray.readInt();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//    5   10:istore          8
		StsdData stsddata = new StsdData(i1);
	//    6   12:new             #15  <Class AtomParsers$StsdData>
	//    7   15:dup             
	//    8   16:iload           8
	//    9   18:invokespecial   #640 <Method void AtomParsers$StsdData(int)>
	//   10   21:astore          13
		for(int k = 0; k < i1; k++)
	//*  11   23:iconst_0        
	//*  12   24:istore          7
	//*  13   26:iload           7
	//*  14   28:iload           8
	//*  15   30:icmpge          465
		{
			int j1 = parsablebytearray.getPosition();
	//   16   33:aload_0         
	//   17   34:invokevirtual   #55  <Method int ParsableByteArray.getPosition()>
	//   18   37:istore          9
			int k1 = parsablebytearray.readInt();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   21   43:istore          10
			boolean flag1;
			if(k1 > 0)
	//*  22   45:iload           10
	//*  23   47:ifle            56
				flag1 = true;
	//   24   50:iconst_1        
	//   25   51:istore          12
			else
	//*  26   53:goto            59
				flag1 = false;
	//   27   56:iconst_0        
	//   28   57:istore          12
			Assertions.checkArgument(flag1, "childAtomSize should be positive");
	//   29   59:iload           12
	//   30   61:ldc1            #64  <String "childAtomSize should be positive">
	//   31   63:invokestatic    #70  <Method void Assertions.checkArgument(boolean, Object)>
			int l1 = parsablebytearray.readInt();
	//   32   66:aload_0         
	//   33   67:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   34   70:istore          11
			if(l1 != Atom.TYPE_avc1 && l1 != Atom.TYPE_avc3 && l1 != Atom.TYPE_encv && l1 != Atom.TYPE_mp4v && l1 != Atom.TYPE_hvc1 && l1 != Atom.TYPE_hev1 && l1 != Atom.TYPE_s263 && l1 != Atom.TYPE_vp08 && l1 != Atom.TYPE_vp09)
	//*  35   72:iload           11
	//*  36   74:getstatic       #643 <Field int Atom.TYPE_avc1>
	//*  37   77:icmpeq          429
	//*  38   80:iload           11
	//*  39   82:getstatic       #646 <Field int Atom.TYPE_avc3>
	//*  40   85:icmpeq          429
	//*  41   88:iload           11
	//*  42   90:getstatic       #649 <Field int Atom.TYPE_encv>
	//*  43   93:icmpeq          429
	//*  44   96:iload           11
	//*  45   98:getstatic       #652 <Field int Atom.TYPE_mp4v>
	//*  46  101:icmpeq          429
	//*  47  104:iload           11
	//*  48  106:getstatic       #655 <Field int Atom.TYPE_hvc1>
	//*  49  109:icmpeq          429
	//*  50  112:iload           11
	//*  51  114:getstatic       #658 <Field int Atom.TYPE_hev1>
	//*  52  117:icmpeq          429
	//*  53  120:iload           11
	//*  54  122:getstatic       #661 <Field int Atom.TYPE_s263>
	//*  55  125:icmpeq          429
	//*  56  128:iload           11
	//*  57  130:getstatic       #664 <Field int Atom.TYPE_vp08>
	//*  58  133:icmpeq          429
	//*  59  136:iload           11
	//*  60  138:getstatic       #667 <Field int Atom.TYPE_vp09>
	//*  61  141:icmpne          147
	//*  62  144:goto            429
			{
				if(l1 != Atom.TYPE_mp4a && l1 != Atom.TYPE_enca && l1 != Atom.TYPE_ac_3 && l1 != Atom.TYPE_ec_3 && l1 != Atom.TYPE_dtsc && l1 != Atom.TYPE_dtse && l1 != Atom.TYPE_dtsh && l1 != Atom.TYPE_dtsl && l1 != Atom.TYPE_samr && l1 != Atom.TYPE_sawb && l1 != Atom.TYPE_lpcm && l1 != Atom.TYPE_sowt && l1 != Atom.TYPE__mp3)
	//*  63  147:iload           11
	//*  64  149:getstatic       #670 <Field int Atom.TYPE_mp4a>
	//*  65  152:icmpeq          406
	//*  66  155:iload           11
	//*  67  157:getstatic       #102 <Field int Atom.TYPE_enca>
	//*  68  160:icmpeq          406
	//*  69  163:iload           11
	//*  70  165:getstatic       #109 <Field int Atom.TYPE_ac_3>
	//*  71  168:icmpeq          406
	//*  72  171:iload           11
	//*  73  173:getstatic       #114 <Field int Atom.TYPE_ec_3>
	//*  74  176:icmpeq          406
	//*  75  179:iload           11
	//*  76  181:getstatic       #119 <Field int Atom.TYPE_dtsc>
	//*  77  184:icmpeq          406
	//*  78  187:iload           11
	//*  79  189:getstatic       #130 <Field int Atom.TYPE_dtse>
	//*  80  192:icmpeq          406
	//*  81  195:iload           11
	//*  82  197:getstatic       #124 <Field int Atom.TYPE_dtsh>
	//*  83  200:icmpeq          406
	//*  84  203:iload           11
	//*  85  205:getstatic       #127 <Field int Atom.TYPE_dtsl>
	//*  86  208:icmpeq          406
	//*  87  211:iload           11
	//*  88  213:getstatic       #135 <Field int Atom.TYPE_samr>
	//*  89  216:icmpeq          406
	//*  90  219:iload           11
	//*  91  221:getstatic       #140 <Field int Atom.TYPE_sawb>
	//*  92  224:icmpeq          406
	//*  93  227:iload           11
	//*  94  229:getstatic       #145 <Field int Atom.TYPE_lpcm>
	//*  95  232:icmpeq          406
	//*  96  235:iload           11
	//*  97  237:getstatic       #148 <Field int Atom.TYPE_sowt>
	//*  98  240:icmpeq          406
	//*  99  243:iload           11
	//* 100  245:getstatic       #151 <Field int Atom.TYPE__mp3>
	//* 101  248:icmpne          254
	//* 102  251:goto            406
				{
					if(l1 == Atom.TYPE_TTML)
	//* 103  254:iload           11
	//* 104  256:getstatic       #673 <Field int Atom.TYPE_TTML>
	//* 105  259:icmpne          284
						stsddata.mediaFormat = MediaFormat.createTextFormat(Integer.toString(i), "application/ttml+xml", -1, l, s);
	//  106  262:aload           13
	//  107  264:iload_1         
	//  108  265:invokestatic    #169 <Method String Integer.toString(int)>
	//  109  268:ldc2            #675 <String "application/ttml+xml">
	//  110  271:iconst_m1       
	//  111  272:lload_2         
	//  112  273:aload           5
	//  113  275:invokestatic    #679 <Method MediaFormat MediaFormat.createTextFormat(String, String, int, long, String)>
	//  114  278:putfield        #179 <Field MediaFormat AtomParsers$StsdData.mediaFormat>
					else
	//* 115  281:goto            447
					if(l1 == Atom.TYPE_tx3g)
	//* 116  284:iload           11
	//* 117  286:getstatic       #682 <Field int Atom.TYPE_tx3g>
	//* 118  289:icmpne          314
						stsddata.mediaFormat = MediaFormat.createTextFormat(Integer.toString(i), "application/x-quicktime-tx3g", -1, l, s);
	//  119  292:aload           13
	//  120  294:iload_1         
	//  121  295:invokestatic    #169 <Method String Integer.toString(int)>
	//  122  298:ldc2            #684 <String "application/x-quicktime-tx3g">
	//  123  301:iconst_m1       
	//  124  302:lload_2         
	//  125  303:aload           5
	//  126  305:invokestatic    #679 <Method MediaFormat MediaFormat.createTextFormat(String, String, int, long, String)>
	//  127  308:putfield        #179 <Field MediaFormat AtomParsers$StsdData.mediaFormat>
					else
	//* 128  311:goto            447
					if(l1 == Atom.TYPE_wvtt)
	//* 129  314:iload           11
	//* 130  316:getstatic       #687 <Field int Atom.TYPE_wvtt>
	//* 131  319:icmpne          344
						stsddata.mediaFormat = MediaFormat.createTextFormat(Integer.toString(i), "application/x-mp4vtt", -1, l, s);
	//  132  322:aload           13
	//  133  324:iload_1         
	//  134  325:invokestatic    #169 <Method String Integer.toString(int)>
	//  135  328:ldc2            #689 <String "application/x-mp4vtt">
	//  136  331:iconst_m1       
	//  137  332:lload_2         
	//  138  333:aload           5
	//  139  335:invokestatic    #679 <Method MediaFormat MediaFormat.createTextFormat(String, String, int, long, String)>
	//  140  338:putfield        #179 <Field MediaFormat AtomParsers$StsdData.mediaFormat>
					else
	//* 141  341:goto            447
					if(l1 == Atom.TYPE_stpp)
	//* 142  344:iload           11
	//* 143  346:getstatic       #692 <Field int Atom.TYPE_stpp>
	//* 144  349:icmpne          375
						stsddata.mediaFormat = MediaFormat.createTextFormat(Integer.toString(i), "application/ttml+xml", -1, l, s, 0L);
	//  145  352:aload           13
	//  146  354:iload_1         
	//  147  355:invokestatic    #169 <Method String Integer.toString(int)>
	//  148  358:ldc2            #675 <String "application/ttml+xml">
	//  149  361:iconst_m1       
	//  150  362:lload_2         
	//  151  363:aload           5
	//  152  365:lconst_0        
	//  153  366:invokestatic    #695 <Method MediaFormat MediaFormat.createTextFormat(String, String, int, long, String, long)>
	//  154  369:putfield        #179 <Field MediaFormat AtomParsers$StsdData.mediaFormat>
					else
	//* 155  372:goto            447
					if(l1 == Atom.TYPE_camm)
	//* 156  375:iload           11
	//* 157  377:getstatic       #698 <Field int Atom.TYPE_camm>
	//* 158  380:icmpne          403
						stsddata.mediaFormat = MediaFormat.createFormatForMimeType(Integer.toString(i), "application/x-camera-motion", -1, l);
	//  159  383:aload           13
	//  160  385:iload_1         
	//  161  386:invokestatic    #169 <Method String Integer.toString(int)>
	//  162  389:ldc2            #700 <String "application/x-camera-motion">
	//  163  392:iconst_m1       
	//  164  393:lload_2         
	//  165  394:invokestatic    #704 <Method MediaFormat MediaFormat.createFormatForMimeType(String, String, int, long)>
	//  166  397:putfield        #179 <Field MediaFormat AtomParsers$StsdData.mediaFormat>
				} else
	//* 167  400:goto            447
	//* 168  403:goto            447
				{
					parseAudioSampleEntry(parsablebytearray, l1, j1, k1, i, l, s, flag, stsddata, k);
	//  169  406:aload_0         
	//  170  407:iload           11
	//  171  409:iload           9
	//  172  411:iload           10
	//  173  413:iload_1         
	//  174  414:lload_2         
	//  175  415:aload           5
	//  176  417:iload           6
	//  177  419:aload           13
	//  178  421:iload           7
	//  179  423:invokestatic    #706 <Method void parseAudioSampleEntry(ParsableByteArray, int, int, int, int, long, String, boolean, AtomParsers$StsdData, int)>
				}
			} else
	//* 180  426:goto            447
			{
				parseVideoSampleEntry(parsablebytearray, l1, j1, k1, i, l, j, stsddata, k);
	//  181  429:aload_0         
	//  182  430:iload           11
	//  183  432:iload           9
	//  184  434:iload           10
	//  185  436:iload_1         
	//  186  437:lload_2         
	//  187  438:iload           4
	//  188  440:aload           13
	//  189  442:iload           7
	//  190  444:invokestatic    #710 <Method void parseVideoSampleEntry(ParsableByteArray, int, int, int, int, long, int, AtomParsers$StsdData, int)>
			}
			parsablebytearray.setPosition(j1 + k1);
	//  191  447:aload_0         
	//  192  448:iload           9
	//  193  450:iload           10
	//  194  452:iadd            
	//  195  453:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
		}

	//  196  456:iload           7
	//  197  458:iconst_1        
	//  198  459:iadd            
	//  199  460:istore          7
	//* 200  462:goto            26
		return stsddata;
	//  201  465:aload           13
	//  202  467:areturn         
	}

	private static TkhdData parseTkhd(ParsableByteArray parsablebytearray)
	{
		char c;
		int i;
		boolean flag;
		int j;
		int k;
label0:
		{
			i = 8;
	//    0    0:bipush          8
	//    1    2:istore_2        
			parsablebytearray.setPosition(8);
	//    2    3:aload_0         
	//    3    4:bipush          8
	//    4    6:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
			k = Atom.parseFullAtomVersion(parsablebytearray.readInt());
	//    5    9:aload_0         
	//    6   10:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//    7   13:invokestatic    #303 <Method int Atom.parseFullAtomVersion(int)>
	//    8   16:istore          5
			if(k == 0)
	//*   9   18:iload           5
	//*  10   20:ifne            29
				c = '\b';
	//   11   23:bipush          8
	//   12   25:istore_1        
			else
	//*  13   26:goto            32
				c = '\020';
	//   14   29:bipush          16
	//   15   31:istore_1        
			parsablebytearray.skipBytes(((int) (c)));
	//   16   32:aload_0         
	//   17   33:iload_1         
	//   18   34:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
			j = parsablebytearray.readInt();
	//   19   37:aload_0         
	//   20   38:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   21   41:istore          4
			parsablebytearray.skipBytes(4);
	//   22   43:aload_0         
	//   23   44:iconst_4        
	//   24   45:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
			int l = parsablebytearray.getPosition();
	//   25   48:aload_0         
	//   26   49:invokevirtual   #55  <Method int ParsableByteArray.getPosition()>
	//   27   52:istore          6
			c = ((char) (i));
	//   28   54:iload_2         
	//   29   55:istore_1        
			if(k == 0)
	//*  30   56:iload           5
	//*  31   58:ifne            63
				c = '\004';
	//   32   61:iconst_4        
	//   33   62:istore_1        
			flag = false;
	//   34   63:iconst_0        
	//   35   64:istore_3        
			i = 0;
	//   36   65:iconst_0        
	//   37   66:istore_2        
			do
			{
				if(i >= c)
					break;
	//   38   67:iload_2         
	//   39   68:iload_1         
	//   40   69:icmpge          97
				if(parsablebytearray.data[l + i] != -1)
	//*  41   72:aload_0         
	//*  42   73:getfield        #358 <Field byte[] ParsableByteArray.data>
	//*  43   76:iload           6
	//*  44   78:iload_2         
	//*  45   79:iadd            
	//*  46   80:baload          
	//*  47   81:iconst_m1       
	//*  48   82:icmpeq          90
				{
					i = 0;
	//   49   85:iconst_0        
	//   50   86:istore_2        
					break label0;
	//   51   87:goto            99
				}
				i++;
	//   52   90:iload_2         
	//   53   91:iconst_1        
	//   54   92:iadd            
	//   55   93:istore_2        
			} while(true);
	//   56   94:goto            67
			i = 1;
	//   57   97:iconst_1        
	//   58   98:istore_2        
		}
		long l2 = -1L;
	//   59   99:ldc2w           #622 <Long -1L>
	//   60  102:lstore          10
		long l1;
		if(i != 0)
	//*  61  104:iload_2         
	//*  62  105:ifeq            120
		{
			parsablebytearray.skipBytes(((int) (c)));
	//   63  108:aload_0         
	//   64  109:iload_1         
	//   65  110:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
			l1 = l2;
	//   66  113:lload           10
	//   67  115:lstore          8
		} else
	//*  68  117:goto            154
		{
			if(k == 0)
	//*  69  120:iload           5
	//*  70  122:ifne            134
				l1 = parsablebytearray.readUnsignedInt();
	//   71  125:aload_0         
	//   72  126:invokevirtual   #310 <Method long ParsableByteArray.readUnsignedInt()>
	//   73  129:lstore          8
			else
	//*  74  131:goto            140
				l1 = parsablebytearray.readUnsignedLongToLong();
	//   75  134:aload_0         
	//   76  135:invokevirtual   #307 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   77  138:lstore          8
			if(l1 == 0L)
	//*  78  140:lload           8
	//*  79  142:lconst_0        
	//*  80  143:lcmp            
	//*  81  144:ifne            154
				l1 = l2;
	//   82  147:lload           10
	//   83  149:lstore          8
		}
	//*  84  151:goto            154
		parsablebytearray.skipBytes(16);
	//   85  154:aload_0         
	//   86  155:bipush          16
	//   87  157:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
		i = parsablebytearray.readInt();
	//   88  160:aload_0         
	//   89  161:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   90  164:istore_2        
		k = parsablebytearray.readInt();
	//   91  165:aload_0         
	//   92  166:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   93  169:istore          5
		parsablebytearray.skipBytes(4);
	//   94  171:aload_0         
	//   95  172:iconst_4        
	//   96  173:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
		int i1 = parsablebytearray.readInt();
	//   97  176:aload_0         
	//   98  177:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   99  180:istore          6
		int j1 = parsablebytearray.readInt();
	//  100  182:aload_0         
	//  101  183:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//  102  186:istore          7
		if(i == 0 && k == 0x10000 && i1 == 0xffff0000 && j1 == 0)
	//* 103  188:iload_2         
	//* 104  189:ifne            219
	//* 105  192:iload           5
	//* 106  194:ldc2            #713 <Int 0x10000>
	//* 107  197:icmpne          219
	//* 108  200:iload           6
	//* 109  202:ldc2            #714 <Int 0xffff0000>
	//* 110  205:icmpne          219
	//* 111  208:iload           7
	//* 112  210:ifne            219
			c = 'Z';
	//  113  213:bipush          90
	//  114  215:istore_1        
		else
	//* 115  216:goto            288
		if(i == 0 && k == 0xffff0000 && i1 == 0x10000 && j1 == 0)
	//* 116  219:iload_2         
	//* 117  220:ifne            251
	//* 118  223:iload           5
	//* 119  225:ldc2            #714 <Int 0xffff0000>
	//* 120  228:icmpne          251
	//* 121  231:iload           6
	//* 122  233:ldc2            #713 <Int 0x10000>
	//* 123  236:icmpne          251
	//* 124  239:iload           7
	//* 125  241:ifne            251
		{
			c = '\u010E';
	//  126  244:sipush          270
	//  127  247:istore_1        
		} else
	//* 128  248:goto            288
		{
			c = ((char) (flag));
	//  129  251:iload_3         
	//  130  252:istore_1        
			if(i == 0xffff0000)
	//* 131  253:iload_2         
	//* 132  254:ldc2            #714 <Int 0xffff0000>
	//* 133  257:icmpne          288
			{
				c = ((char) (flag));
	//  134  260:iload_3         
	//  135  261:istore_1        
				if(k == 0)
	//* 136  262:iload           5
	//* 137  264:ifne            288
				{
					c = ((char) (flag));
	//  138  267:iload_3         
	//  139  268:istore_1        
					if(i1 == 0)
	//* 140  269:iload           6
	//* 141  271:ifne            288
					{
						c = ((char) (flag));
	//  142  274:iload_3         
	//  143  275:istore_1        
						if(j1 == 0xffff0000)
	//* 144  276:iload           7
	//* 145  278:ldc2            #714 <Int 0xffff0000>
	//* 146  281:icmpne          288
							c = '\264';
	//  147  284:sipush          180
	//  148  287:istore_1        
					}
				}
			}
		}
		return new TkhdData(j, l1, ((int) (c)));
	//  149  288:new             #24  <Class AtomParsers$TkhdData>
	//  150  291:dup             
	//  151  292:iload           4
	//  152  294:lload           8
	//  153  296:iload_1         
	//  154  297:invokespecial   #717 <Method void AtomParsers$TkhdData(int, long, int)>
	//  155  300:areturn         
	}

	public static Track parseTrak(Atom.ContainerAtom containeratom, Atom.LeafAtom leafatom, long l, boolean flag)
	{
		Object obj = ((Object) (containeratom.getContainerAtomOfType(Atom.TYPE_mdia)));
	//    0    0:aload_0         
	//    1    1:getstatic       #722 <Field int Atom.TYPE_mdia>
	//    2    4:invokevirtual   #726 <Method Atom$ContainerAtom Atom$ContainerAtom.getContainerAtomOfType(int)>
	//    3    7:astore          9
		int i = parseHdlr(((Atom.ContainerAtom) (obj)).getLeafAtomOfType(Atom.TYPE_hdlr).data);
	//    4    9:aload           9
	//    5   11:getstatic       #729 <Field int Atom.TYPE_hdlr>
	//    6   14:invokevirtual   #293 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//    7   17:getfield        #299 <Field ParsableByteArray Atom$LeafAtom.data>
	//    8   20:invokestatic    #731 <Method int parseHdlr(ParsableByteArray)>
	//    9   23:istore          5
		if(i != Track.TYPE_soun && i != Track.TYPE_vide && i != Track.TYPE_text && i != Track.TYPE_sbtl && i != Track.TYPE_subt && i != Track.TYPE_meta)
	//*  10   25:iload           5
	//*  11   27:getstatic       #734 <Field int Track.TYPE_soun>
	//*  12   30:icmpeq          75
	//*  13   33:iload           5
	//*  14   35:getstatic       #737 <Field int Track.TYPE_vide>
	//*  15   38:icmpeq          75
	//*  16   41:iload           5
	//*  17   43:getstatic       #740 <Field int Track.TYPE_text>
	//*  18   46:icmpeq          75
	//*  19   49:iload           5
	//*  20   51:getstatic       #743 <Field int Track.TYPE_sbtl>
	//*  21   54:icmpeq          75
	//*  22   57:iload           5
	//*  23   59:getstatic       #746 <Field int Track.TYPE_subt>
	//*  24   62:icmpeq          75
	//*  25   65:iload           5
	//*  26   67:getstatic       #749 <Field int Track.TYPE_meta>
	//*  27   70:icmpeq          75
			return null;
	//   28   73:aconst_null     
	//   29   74:areturn         
		TkhdData tkhddata = parseTkhd(containeratom.getLeafAtomOfType(Atom.TYPE_tkhd).data);
	//   30   75:aload_0         
	//   31   76:getstatic       #752 <Field int Atom.TYPE_tkhd>
	//   32   79:invokevirtual   #293 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   33   82:getfield        #299 <Field ParsableByteArray Atom$LeafAtom.data>
	//   34   85:invokestatic    #754 <Method AtomParsers$TkhdData parseTkhd(ParsableByteArray)>
	//   35   88:astore          8
		if(l == -1L)
	//*  36   90:lload_2         
	//*  37   91:ldc2w           #622 <Long -1L>
	//*  38   94:lcmp            
	//*  39   95:ifne            107
			l = tkhddata.duration;
	//   40   98:aload           8
	//   41  100:invokestatic    #758 <Method long AtomParsers$TkhdData.access$000(AtomParsers$TkhdData)>
	//   42  103:lstore_2        
	//*  43  104:goto            107
		long l1 = parseMvhd(leafatom.data);
	//   44  107:aload_1         
	//   45  108:getfield        #299 <Field ParsableByteArray Atom$LeafAtom.data>
	//   46  111:invokestatic    #760 <Method long parseMvhd(ParsableByteArray)>
	//   47  114:lstore          6
		if(l == -1L)
	//*  48  116:lload_2         
	//*  49  117:ldc2w           #622 <Long -1L>
	//*  50  120:lcmp            
	//*  51  121:ifne            131
			l = -1L;
	//   52  124:ldc2w           #622 <Long -1L>
	//   53  127:lstore_2        
		else
	//*  54  128:goto            141
			l = Util.scaleLargeTimestamp(l, 0xf4240L, l1);
	//   55  131:lload_2         
	//   56  132:ldc2w           #606 <Long 0xf4240L>
	//   57  135:lload           6
	//   58  137:invokestatic    #621 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   59  140:lstore_2        
		Atom.ContainerAtom containeratom1 = ((Atom.ContainerAtom) (obj)).getContainerAtomOfType(Atom.TYPE_minf).getContainerAtomOfType(Atom.TYPE_stbl);
	//   60  141:aload           9
	//   61  143:getstatic       #763 <Field int Atom.TYPE_minf>
	//   62  146:invokevirtual   #726 <Method Atom$ContainerAtom Atom$ContainerAtom.getContainerAtomOfType(int)>
	//   63  149:getstatic       #766 <Field int Atom.TYPE_stbl>
	//   64  152:invokevirtual   #726 <Method Atom$ContainerAtom Atom$ContainerAtom.getContainerAtomOfType(int)>
	//   65  155:astore          10
		leafatom = ((Atom.LeafAtom) (parseMdhd(((Atom.ContainerAtom) (obj)).getLeafAtomOfType(Atom.TYPE_mdhd).data)));
	//   66  157:aload           9
	//   67  159:getstatic       #769 <Field int Atom.TYPE_mdhd>
	//   68  162:invokevirtual   #293 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   69  165:getfield        #299 <Field ParsableByteArray Atom$LeafAtom.data>
	//   70  168:invokestatic    #771 <Method Pair parseMdhd(ParsableByteArray)>
	//   71  171:astore_1        
		obj = ((Object) (parseStsd(containeratom1.getLeafAtomOfType(Atom.TYPE_stsd).data, tkhddata.id, l, tkhddata.rotationDegrees, (String)((Pair) (leafatom)).second, flag)));
	//   72  172:aload           10
	//   73  174:getstatic       #774 <Field int Atom.TYPE_stsd>
	//   74  177:invokevirtual   #293 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   75  180:getfield        #299 <Field ParsableByteArray Atom$LeafAtom.data>
	//   76  183:aload           8
	//   77  185:invokestatic    #778 <Method int AtomParsers$TkhdData.access$100(AtomParsers$TkhdData)>
	//   78  188:lload_2         
	//   79  189:aload           8
	//   80  191:invokestatic    #781 <Method int AtomParsers$TkhdData.access$200(AtomParsers$TkhdData)>
	//   81  194:aload_1         
	//   82  195:getfield        #211 <Field Object Pair.second>
	//   83  198:checkcast       #208 <Class String>
	//   84  201:iload           4
	//   85  203:invokestatic    #783 <Method AtomParsers$StsdData parseStsd(ParsableByteArray, int, long, int, String, boolean)>
	//   86  206:astore          9
		containeratom = ((Atom.ContainerAtom) (parseEdts(containeratom.getContainerAtomOfType(Atom.TYPE_edts))));
	//   87  208:aload_0         
	//   88  209:getstatic       #786 <Field int Atom.TYPE_edts>
	//   89  212:invokevirtual   #726 <Method Atom$ContainerAtom Atom$ContainerAtom.getContainerAtomOfType(int)>
	//   90  215:invokestatic    #788 <Method Pair parseEdts(Atom$ContainerAtom)>
	//   91  218:astore_0        
		if(((StsdData) (obj)).mediaFormat == null)
	//*  92  219:aload           9
	//*  93  221:getfield        #179 <Field MediaFormat AtomParsers$StsdData.mediaFormat>
	//*  94  224:ifnonnull       229
			return null;
	//   95  227:aconst_null     
	//   96  228:areturn         
		else
			return new Track(tkhddata.id, i, ((Long)((Pair) (leafatom)).first).longValue(), l1, l, ((StsdData) (obj)).mediaFormat, ((StsdData) (obj)).trackEncryptionBoxes, ((StsdData) (obj)).nalUnitLengthFieldLength, (long[])((Pair) (containeratom)).first, (long[])((Pair) (containeratom)).second);
	//   97  229:new             #526 <Class Track>
	//   98  232:dup             
	//   99  233:aload           8
	//  100  235:invokestatic    #778 <Method int AtomParsers$TkhdData.access$100(AtomParsers$TkhdData)>
	//  101  238:iload           5
	//  102  240:aload_1         
	//  103  241:getfield        #206 <Field Object Pair.first>
	//  104  244:checkcast       #407 <Class Long>
	//  105  247:invokevirtual   #791 <Method long Long.longValue()>
	//  106  250:lload           6
	//  107  252:lload_2         
	//  108  253:aload           9
	//  109  255:getfield        #179 <Field MediaFormat AtomParsers$StsdData.mediaFormat>
	//  110  258:aload           9
	//  111  260:getfield        #451 <Field TrackEncryptionBox[] AtomParsers$StsdData.trackEncryptionBoxes>
	//  112  263:aload           9
	//  113  265:getfield        #794 <Field int AtomParsers$StsdData.nalUnitLengthFieldLength>
	//  114  268:aload_0         
	//  115  269:getfield        #206 <Field Object Pair.first>
	//  116  272:checkcast       #795 <Class long[]>
	//  117  275:aload_0         
	//  118  276:getfield        #211 <Field Object Pair.second>
	//  119  279:checkcast       #795 <Class long[]>
	//  120  282:invokespecial   #798 <Method void Track(int, int, long, long, long, MediaFormat, TrackEncryptionBox[], int, long[], long[])>
	//  121  285:areturn         
	}

	public static GaplessInfo parseUdta(Atom.LeafAtom leafatom, boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		leafatom = ((Atom.LeafAtom) (leafatom.data));
	//    4    6:aload_0         
	//    5    7:getfield        #299 <Field ParsableByteArray Atom$LeafAtom.data>
	//    6   10:astore_0        
		((ParsableByteArray) (leafatom)).setPosition(8);
	//    7   11:aload_0         
	//    8   12:bipush          8
	//    9   14:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
		int i;
		for(; ((ParsableByteArray) (leafatom)).bytesLeft() >= 8; ((ParsableByteArray) (leafatom)).skipBytes(i - 8))
	//*  10   17:aload_0         
	//*  11   18:invokevirtual   #368 <Method int ParsableByteArray.bytesLeft()>
	//*  12   21:bipush          8
	//*  13   23:icmplt          78
		{
			i = ((ParsableByteArray) (leafatom)).readInt();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   16   30:istore_2        
			if(((ParsableByteArray) (leafatom)).readInt() == Atom.TYPE_meta)
	//*  17   31:aload_0         
	//*  18   32:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//*  19   35:getstatic       #801 <Field int Atom.TYPE_meta>
	//*  20   38:icmpne          67
			{
				((ParsableByteArray) (leafatom)).setPosition(((ParsableByteArray) (leafatom)).getPosition() - 8);
	//   21   41:aload_0         
	//   22   42:aload_0         
	//   23   43:invokevirtual   #55  <Method int ParsableByteArray.getPosition()>
	//   24   46:bipush          8
	//   25   48:isub            
	//   26   49:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
				((ParsableByteArray) (leafatom)).setLimit(((ParsableByteArray) (leafatom)).getPosition() + i);
	//   27   52:aload_0         
	//   28   53:aload_0         
	//   29   54:invokevirtual   #55  <Method int ParsableByteArray.getPosition()>
	//   30   57:iload_2         
	//   31   58:iadd            
	//   32   59:invokevirtual   #804 <Method void ParsableByteArray.setLimit(int)>
				return parseMetaAtom(((ParsableByteArray) (leafatom)));
	//   33   62:aload_0         
	//   34   63:invokestatic    #806 <Method GaplessInfo parseMetaAtom(ParsableByteArray)>
	//   35   66:areturn         
			}
		}

	//   36   67:aload_0         
	//   37   68:iload_2         
	//   38   69:bipush          8
	//   39   71:isub            
	//   40   72:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
	//*  41   75:goto            17
		return null;
	//   42   78:aconst_null     
	//   43   79:areturn         
	}

	private static void parseVideoSampleEntry(ParsableByteArray parsablebytearray, int i, int j, int k, int l, long l1, int i1, 
			StsdData stsddata, int j1)
	{
		parsablebytearray.setPosition(j + 8);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:bipush          8
	//    3    4:iadd            
	//    4    5:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
		parsablebytearray.skipBytes(24);
	//    5    8:aload_0         
	//    6    9:bipush          24
	//    7   11:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
		int j2 = parsablebytearray.readUnsignedShort();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #83  <Method int ParsableByteArray.readUnsignedShort()>
	//   10   18:istore          16
		int k2 = parsablebytearray.readUnsignedShort();
	//   11   20:aload_0         
	//   12   21:invokevirtual   #83  <Method int ParsableByteArray.readUnsignedShort()>
	//   13   24:istore          17
		parsablebytearray.skipBytes(50);
	//   14   26:aload_0         
	//   15   27:bipush          50
	//   16   29:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
		int k1 = parsablebytearray.getPosition();
	//   17   32:aload_0         
	//   18   33:invokevirtual   #55  <Method int ParsableByteArray.getPosition()>
	//   19   36:istore          12
		if(i == Atom.TYPE_encv)
	//*  20   38:iload_1         
	//*  21   39:getstatic       #649 <Field int Atom.TYPE_encv>
	//*  22   42:icmpne          62
		{
			parseSampleEntryEncryptionData(parsablebytearray, j, k, stsddata, j1);
	//   23   45:aload_0         
	//   24   46:iload_2         
	//   25   47:iload_3         
	//   26   48:aload           8
	//   27   50:iload           9
	//   28   52:invokestatic    #106 <Method int parseSampleEntryEncryptionData(ParsableByteArray, int, int, AtomParsers$StsdData, int)>
	//   29   55:pop             
			parsablebytearray.setPosition(k1);
	//   30   56:aload_0         
	//   31   57:iload           12
	//   32   59:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
		}
		Object obj3 = null;
	//   33   62:aconst_null     
	//   34   63:astore          26
		int i2 = -1;
	//   35   65:iconst_m1       
	//   36   66:istore          14
		Object obj2 = null;
	//   37   68:aconst_null     
	//   38   69:astore          24
		byte abyte0[] = ((byte []) (obj2));
	//   39   71:aload           24
	//   40   73:astore          23
		float f1 = 1.0F;
	//   41   75:fconst_1        
	//   42   76:fstore          11
		boolean flag = false;
	//   43   78:iconst_0        
	//   44   79:istore          13
		while(k1 - j < k) 
	//*  45   81:iload           12
	//*  46   83:iload_2         
	//*  47   84:isub            
	//*  48   85:iload_3         
	//*  49   86:icmpge          918
		{
			parsablebytearray.setPosition(k1);
	//   50   89:aload_0         
	//   51   90:iload           12
	//   52   92:invokevirtual   #59  <Method void ParsableByteArray.setPosition(int)>
			j1 = parsablebytearray.getPosition();
	//   53   95:aload_0         
	//   54   96:invokevirtual   #55  <Method int ParsableByteArray.getPosition()>
	//   55   99:istore          9
			int l2 = parsablebytearray.readInt();
	//   56  101:aload_0         
	//   57  102:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   58  105:istore          18
			if(l2 == 0 && parsablebytearray.getPosition() - j == k)
	//*  59  107:iload           18
	//*  60  109:ifne            125
	//*  61  112:aload_0         
	//*  62  113:invokevirtual   #55  <Method int ParsableByteArray.getPosition()>
	//*  63  116:iload_2         
	//*  64  117:isub            
	//*  65  118:iload_3         
	//*  66  119:icmpne          125
				break;
	//   67  122:goto            918
			boolean flag2;
			if(l2 > 0)
	//*  68  125:iload           18
	//*  69  127:ifle            136
				flag2 = true;
	//   70  130:iconst_1        
	//   71  131:istore          20
			else
	//*  72  133:goto            139
				flag2 = false;
	//   73  136:iconst_0        
	//   74  137:istore          20
			Assertions.checkArgument(flag2, "childAtomSize should be positive");
	//   75  139:iload           20
	//   76  141:ldc1            #64  <String "childAtomSize should be positive">
	//   77  143:invokestatic    #70  <Method void Assertions.checkArgument(boolean, Object)>
			int i3 = parsablebytearray.readInt();
	//   78  146:aload_0         
	//   79  147:invokevirtual   #62  <Method int ParsableByteArray.readInt()>
	//   80  150:istore          19
			float f;
			boolean flag1;
			Object obj;
			Object obj1;
			byte abyte1[];
			if(i3 == Atom.TYPE_avcC)
	//*  81  152:iload           19
	//*  82  154:getstatic       #809 <Field int Atom.TYPE_avcC>
	//*  83  157:icmpne          268
			{
				boolean flag3;
				if(obj3 == null)
	//*  84  160:aload           26
	//*  85  162:ifnonnull       171
					flag3 = true;
	//   86  165:iconst_1        
	//   87  166:istore          20
				else
	//*  88  168:goto            174
					flag3 = false;
	//   89  171:iconst_0        
	//   90  172:istore          20
				Assertions.checkState(flag3);
	//   91  174:iload           20
	//   92  176:invokestatic    #537 <Method void Assertions.checkState(boolean)>
				obj2 = "video/avc";
	//   93  179:ldc2            #338 <String "video/avc">
	//   94  182:astore          24
				AvcCData avccdata = parseAvcCFromParent(parsablebytearray, j1);
	//   95  184:aload_0         
	//   96  185:iload           9
	//   97  187:invokestatic    #811 <Method AtomParsers$AvcCData parseAvcCFromParent(ParsableByteArray, int)>
	//   98  190:astore          27
				obj3 = ((Object) (avccdata.initializationData));
	//   99  192:aload           27
	//  100  194:getfield        #815 <Field List AtomParsers$AvcCData.initializationData>
	//  101  197:astore          26
				stsddata.nalUnitLengthFieldLength = avccdata.nalUnitLengthFieldLength;
	//  102  199:aload           8
	//  103  201:aload           27
	//  104  203:getfield        #816 <Field int AtomParsers$AvcCData.nalUnitLengthFieldLength>
	//  105  206:putfield        #794 <Field int AtomParsers$StsdData.nalUnitLengthFieldLength>
				flag1 = flag;
	//  106  209:iload           13
	//  107  211:istore          15
				obj = obj2;
	//  108  213:aload           24
	//  109  215:astore          21
				obj1 = obj3;
	//  110  217:aload           26
	//  111  219:astore          22
				f = f1;
	//  112  221:fload           11
	//  113  223:fstore          10
				abyte1 = abyte0;
	//  114  225:aload           23
	//  115  227:astore          25
				j1 = i2;
	//  116  229:iload           14
	//  117  231:istore          9
				if(!flag)
	//* 118  233:iload           13
	//* 119  235:ifne            884
				{
					f = avccdata.pixelWidthAspectRatio;
	//  120  238:aload           27
	//  121  240:getfield        #817 <Field float AtomParsers$AvcCData.pixelWidthAspectRatio>
	//  122  243:fstore          10
					flag1 = flag;
	//  123  245:iload           13
	//  124  247:istore          15
					obj = obj2;
	//  125  249:aload           24
	//  126  251:astore          21
					obj1 = obj3;
	//  127  253:aload           26
	//  128  255:astore          22
					abyte1 = abyte0;
	//  129  257:aload           23
	//  130  259:astore          25
					j1 = i2;
	//  131  261:iload           14
	//  132  263:istore          9
				}
			} else
	//* 133  265:goto            884
			if(i3 == Atom.TYPE_hvcC)
	//* 134  268:iload           19
	//* 135  270:getstatic       #820 <Field int Atom.TYPE_hvcC>
	//* 136  273:icmpne          353
			{
				boolean flag4;
				if(obj3 == null)
	//* 137  276:aload           26
	//* 138  278:ifnonnull       287
					flag4 = true;
	//  139  281:iconst_1        
	//  140  282:istore          20
				else
	//* 141  284:goto            290
					flag4 = false;
	//  142  287:iconst_0        
	//  143  288:istore          20
				Assertions.checkState(flag4);
	//  144  290:iload           20
	//  145  292:invokestatic    #537 <Method void Assertions.checkState(boolean)>
				obj = "video/hevc";
	//  146  295:ldc2            #336 <String "video/hevc">
	//  147  298:astore          21
				obj2 = ((Object) (parseHvcCFromParent(parsablebytearray, j1)));
	//  148  300:aload_0         
	//  149  301:iload           9
	//  150  303:invokestatic    #822 <Method Pair parseHvcCFromParent(ParsableByteArray, int)>
	//  151  306:astore          24
				obj1 = ((Object) ((List)((Pair) (obj2)).first));
	//  152  308:aload           24
	//  153  310:getfield        #206 <Field Object Pair.first>
	//  154  313:checkcast       #253 <Class List>
	//  155  316:astore          22
				stsddata.nalUnitLengthFieldLength = ((Integer)((Pair) (obj2)).second).intValue();
	//  156  318:aload           8
	//  157  320:aload           24
	//  158  322:getfield        #211 <Field Object Pair.second>
	//  159  325:checkcast       #165 <Class Integer>
	//  160  328:invokevirtual   #228 <Method int Integer.intValue()>
	//  161  331:putfield        #794 <Field int AtomParsers$StsdData.nalUnitLengthFieldLength>
				flag1 = flag;
	//  162  334:iload           13
	//  163  336:istore          15
				f = f1;
	//  164  338:fload           11
	//  165  340:fstore          10
				abyte1 = abyte0;
	//  166  342:aload           23
	//  167  344:astore          25
				j1 = i2;
	//  168  346:iload           14
	//  169  348:istore          9
			} else
	//* 170  350:goto            884
			if(i3 == Atom.TYPE_d263)
	//* 171  353:iload           19
	//* 172  355:getstatic       #825 <Field int Atom.TYPE_d263>
	//* 173  358:icmpne          408
			{
				boolean flag5;
				if(obj3 == null)
	//* 174  361:aload           26
	//* 175  363:ifnonnull       372
					flag5 = true;
	//  176  366:iconst_1        
	//  177  367:istore          20
				else
	//* 178  369:goto            375
					flag5 = false;
	//  179  372:iconst_0        
	//  180  373:istore          20
				Assertions.checkState(flag5);
	//  181  375:iload           20
	//  182  377:invokestatic    #537 <Method void Assertions.checkState(boolean)>
				obj = "video/3gpp";
	//  183  380:ldc2            #827 <String "video/3gpp">
	//  184  383:astore          21
				flag1 = flag;
	//  185  385:iload           13
	//  186  387:istore          15
				obj1 = obj2;
	//  187  389:aload           24
	//  188  391:astore          22
				f = f1;
	//  189  393:fload           11
	//  190  395:fstore          10
				abyte1 = abyte0;
	//  191  397:aload           23
	//  192  399:astore          25
				j1 = i2;
	//  193  401:iload           14
	//  194  403:istore          9
			} else
	//* 195  405:goto            884
			if(i3 == Atom.TYPE_esds)
	//* 196  408:iload           19
	//* 197  410:getstatic       #75  <Field int Atom.TYPE_esds>
	//* 198  413:icmpne          482
			{
				boolean flag6;
				if(obj3 == null)
	//* 199  416:aload           26
	//* 200  418:ifnonnull       427
					flag6 = true;
	//  201  421:iconst_1        
	//  202  422:istore          20
				else
	//* 203  424:goto            430
					flag6 = false;
	//  204  427:iconst_0        
	//  205  428:istore          20
				Assertions.checkState(flag6);
	//  206  430:iload           20
	//  207  432:invokestatic    #537 <Method void Assertions.checkState(boolean)>
				obj1 = ((Object) (parseEsdsFromParent(parsablebytearray, j1)));
	//  208  435:aload_0         
	//  209  436:iload           9
	//  210  438:invokestatic    #200 <Method Pair parseEsdsFromParent(ParsableByteArray, int)>
	//  211  441:astore          22
				obj = ((Object) ((String)((Pair) (obj1)).first));
	//  212  443:aload           22
	//  213  445:getfield        #206 <Field Object Pair.first>
	//  214  448:checkcast       #208 <Class String>
	//  215  451:astore          21
				obj1 = ((Object) (Collections.singletonList(((Pair) (obj1)).second)));
	//  216  453:aload           22
	//  217  455:getfield        #211 <Field Object Pair.second>
	//  218  458:invokestatic    #234 <Method List Collections.singletonList(Object)>
	//  219  461:astore          22
				flag1 = flag;
	//  220  463:iload           13
	//  221  465:istore          15
				f = f1;
	//  222  467:fload           11
	//  223  469:fstore          10
				abyte1 = abyte0;
	//  224  471:aload           23
	//  225  473:astore          25
				j1 = i2;
	//  226  475:iload           14
	//  227  477:istore          9
			} else
	//* 228  479:goto            884
			if(i3 == Atom.TYPE_pasp)
	//* 229  482:iload           19
	//* 230  484:getstatic       #830 <Field int Atom.TYPE_pasp>
	//* 231  487:icmpne          520
			{
				f = parsePaspFromParent(parsablebytearray, j1);
	//  232  490:aload_0         
	//  233  491:iload           9
	//  234  493:invokestatic    #832 <Method float parsePaspFromParent(ParsableByteArray, int)>
	//  235  496:fstore          10
				flag1 = true;
	//  236  498:iconst_1        
	//  237  499:istore          15
				obj = obj3;
	//  238  501:aload           26
	//  239  503:astore          21
				obj1 = obj2;
	//  240  505:aload           24
	//  241  507:astore          22
				abyte1 = abyte0;
	//  242  509:aload           23
	//  243  511:astore          25
				j1 = i2;
	//  244  513:iload           14
	//  245  515:istore          9
			} else
	//* 246  517:goto            884
			if(i3 == Atom.TYPE_vpcC)
	//* 247  520:iload           19
	//* 248  522:getstatic       #835 <Field int Atom.TYPE_vpcC>
	//* 249  525:icmpne          610
			{
				boolean flag7;
				if(obj3 == null)
	//* 250  528:aload           26
	//* 251  530:ifnonnull       539
					flag7 = true;
	//  252  533:iconst_1        
	//  253  534:istore          20
				else
	//* 254  536:goto            542
					flag7 = false;
	//  255  539:iconst_0        
	//  256  540:istore          20
				Assertions.checkState(flag7);
	//  257  542:iload           20
	//  258  544:invokestatic    #537 <Method void Assertions.checkState(boolean)>
				if(i == Atom.TYPE_vp08)
	//* 259  547:iload_1         
	//* 260  548:getstatic       #664 <Field int Atom.TYPE_vp08>
	//* 261  551:icmpne          582
				{
					obj = "video/x-vnd.on2.vp8";
	//  262  554:ldc2            #837 <String "video/x-vnd.on2.vp8">
	//  263  557:astore          21
					flag1 = flag;
	//  264  559:iload           13
	//  265  561:istore          15
					obj1 = obj2;
	//  266  563:aload           24
	//  267  565:astore          22
					f = f1;
	//  268  567:fload           11
	//  269  569:fstore          10
					abyte1 = abyte0;
	//  270  571:aload           23
	//  271  573:astore          25
					j1 = i2;
	//  272  575:iload           14
	//  273  577:istore          9
				} else
	//* 274  579:goto            884
				{
					obj = "video/x-vnd.on2.vp9";
	//  275  582:ldc2            #839 <String "video/x-vnd.on2.vp9">
	//  276  585:astore          21
					flag1 = flag;
	//  277  587:iload           13
	//  278  589:istore          15
					obj1 = obj2;
	//  279  591:aload           24
	//  280  593:astore          22
					f = f1;
	//  281  595:fload           11
	//  282  597:fstore          10
					abyte1 = abyte0;
	//  283  599:aload           23
	//  284  601:astore          25
					j1 = i2;
	//  285  603:iload           14
	//  286  605:istore          9
				}
			} else
	//* 287  607:goto            884
			if(i3 == Atom.TYPE_sv3d)
	//* 288  610:iload           19
	//* 289  612:getstatic       #842 <Field int Atom.TYPE_sv3d>
	//* 290  615:icmpne          651
			{
				abyte1 = parseProjFromParent(parsablebytearray, j1, l2);
	//  291  618:aload_0         
	//  292  619:iload           9
	//  293  621:iload           18
	//  294  623:invokestatic    #844 <Method byte[] parseProjFromParent(ParsableByteArray, int, int)>
	//  295  626:astore          25
				flag1 = flag;
	//  296  628:iload           13
	//  297  630:istore          15
				obj = obj3;
	//  298  632:aload           26
	//  299  634:astore          21
				obj1 = obj2;
	//  300  636:aload           24
	//  301  638:astore          22
				f = f1;
	//  302  640:fload           11
	//  303  642:fstore          10
				j1 = i2;
	//  304  644:iload           14
	//  305  646:istore          9
			} else
	//* 306  648:goto            884
			{
				flag1 = flag;
	//  307  651:iload           13
	//  308  653:istore          15
				obj = obj3;
	//  309  655:aload           26
	//  310  657:astore          21
				obj1 = obj2;
	//  311  659:aload           24
	//  312  661:astore          22
				f = f1;
	//  313  663:fload           11
	//  314  665:fstore          10
				abyte1 = abyte0;
	//  315  667:aload           23
	//  316  669:astore          25
				j1 = i2;
	//  317  671:iload           14
	//  318  673:istore          9
				if(i3 == Atom.TYPE_st3d)
	//* 319  675:iload           19
	//* 320  677:getstatic       #847 <Field int Atom.TYPE_st3d>
	//* 321  680:icmpne          884
				{
					int j3 = parsablebytearray.readUnsignedByte();
	//  322  683:aload_0         
	//  323  684:invokevirtual   #242 <Method int ParsableByteArray.readUnsignedByte()>
	//  324  687:istore          19
					parsablebytearray.skipBytes(3);
	//  325  689:aload_0         
	//  326  690:iconst_3        
	//  327  691:invokevirtual   #80  <Method void ParsableByteArray.skipBytes(int)>
					flag1 = flag;
	//  328  694:iload           13
	//  329  696:istore          15
					obj = obj3;
	//  330  698:aload           26
	//  331  700:astore          21
					obj1 = obj2;
	//  332  702:aload           24
	//  333  704:astore          22
					f = f1;
	//  334  706:fload           11
	//  335  708:fstore          10
					abyte1 = abyte0;
	//  336  710:aload           23
	//  337  712:astore          25
					j1 = i2;
	//  338  714:iload           14
	//  339  716:istore          9
					if(j3 == 0)
	//* 340  718:iload           19
	//* 341  720:ifne            884
						switch(parsablebytearray.readUnsignedByte())
	//* 342  723:aload_0         
	//* 343  724:invokevirtual   #242 <Method int ParsableByteArray.readUnsignedByte()>
						{
	//* 344  727:tableswitch     0 3: default 756
	//	               0 861
	//	               1 835
	//	               2 809
	//	               3 783
						default:
							flag1 = flag;
	//  345  756:iload           13
	//  346  758:istore          15
							obj = obj3;
	//  347  760:aload           26
	//  348  762:astore          21
							obj1 = obj2;
	//  349  764:aload           24
	//  350  766:astore          22
							f = f1;
	//  351  768:fload           11
	//  352  770:fstore          10
							abyte1 = abyte0;
	//  353  772:aload           23
	//  354  774:astore          25
							j1 = i2;
	//  355  776:iload           14
	//  356  778:istore          9
							break;

	//* 357  780:goto            884
						case 3: // '\003'
							j1 = 3;
	//  358  783:iconst_3        
	//  359  784:istore          9
							flag1 = flag;
	//  360  786:iload           13
	//  361  788:istore          15
							obj = obj3;
	//  362  790:aload           26
	//  363  792:astore          21
							obj1 = obj2;
	//  364  794:aload           24
	//  365  796:astore          22
							f = f1;
	//  366  798:fload           11
	//  367  800:fstore          10
							abyte1 = abyte0;
	//  368  802:aload           23
	//  369  804:astore          25
							break;

	//* 370  806:goto            884
						case 2: // '\002'
							j1 = 2;
	//  371  809:iconst_2        
	//  372  810:istore          9
							flag1 = flag;
	//  373  812:iload           13
	//  374  814:istore          15
							obj = obj3;
	//  375  816:aload           26
	//  376  818:astore          21
							obj1 = obj2;
	//  377  820:aload           24
	//  378  822:astore          22
							f = f1;
	//  379  824:fload           11
	//  380  826:fstore          10
							abyte1 = abyte0;
	//  381  828:aload           23
	//  382  830:astore          25
							break;

	//* 383  832:goto            884
						case 1: // '\001'
							j1 = 1;
	//  384  835:iconst_1        
	//  385  836:istore          9
							flag1 = flag;
	//  386  838:iload           13
	//  387  840:istore          15
							obj = obj3;
	//  388  842:aload           26
	//  389  844:astore          21
							obj1 = obj2;
	//  390  846:aload           24
	//  391  848:astore          22
							f = f1;
	//  392  850:fload           11
	//  393  852:fstore          10
							abyte1 = abyte0;
	//  394  854:aload           23
	//  395  856:astore          25
							break;

	//* 396  858:goto            884
						case 0: // '\0'
							j1 = 0;
	//  397  861:iconst_0        
	//  398  862:istore          9
							abyte1 = abyte0;
	//  399  864:aload           23
	//  400  866:astore          25
							f = f1;
	//  401  868:fload           11
	//  402  870:fstore          10
							obj1 = obj2;
	//  403  872:aload           24
	//  404  874:astore          22
							obj = obj3;
	//  405  876:aload           26
	//  406  878:astore          21
							flag1 = flag;
	//  407  880:iload           13
	//  408  882:istore          15
							break;
						}
				}
			}
			k1 += l2;
	//  409  884:iload           12
	//  410  886:iload           18
	//  411  888:iadd            
	//  412  889:istore          12
			flag = flag1;
	//  413  891:iload           15
	//  414  893:istore          13
			obj3 = obj;
	//  415  895:aload           21
	//  416  897:astore          26
			obj2 = obj1;
	//  417  899:aload           22
	//  418  901:astore          24
			f1 = f;
	//  419  903:fload           10
	//  420  905:fstore          11
			abyte0 = abyte1;
	//  421  907:aload           25
	//  422  909:astore          23
			i2 = j1;
	//  423  911:iload           9
	//  424  913:istore          14
		}
	//* 425  915:goto            81
		if(obj3 == null)
	//* 426  918:aload           26
	//* 427  920:ifnonnull       924
		{
			return;
	//  428  923:return          
		} else
		{
			stsddata.mediaFormat = MediaFormat.createVideoFormat(Integer.toString(l), ((String) (obj3)), -1, -1, l1, j2, k2, ((List) (obj2)), i1, f1, abyte0, i2);
	//  429  924:aload           8
	//  430  926:iload           4
	//  431  928:invokestatic    #169 <Method String Integer.toString(int)>
	//  432  931:aload           26
	//  433  933:iconst_m1       
	//  434  934:iconst_m1       
	//  435  935:lload           5
	//  436  937:iload           16
	//  437  939:iload           17
	//  438  941:aload           24
	//  439  943:iload           7
	//  440  945:fload           11
	//  441  947:aload           23
	//  442  949:iload           14
	//  443  951:invokestatic    #851 <Method MediaFormat MediaFormat.createVideoFormat(String, String, int, int, long, int, int, List, int, float, byte[], int)>
	//  444  954:putfield        #179 <Field MediaFormat AtomParsers$StsdData.mediaFormat>
			return;
	//  445  957:return          
		}
	}

	private static final String TAG = "AtomParsers";
	private static final int TYPE_cenc = Util.getIntegerCodeForString("cenc");

	static 
	{
	//    0    0:ldc1            #35  <String "cenc">
	//    1    2:invokestatic    #41  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #43  <Field int TYPE_cenc>
	//*   3    8:return          
	}
}
