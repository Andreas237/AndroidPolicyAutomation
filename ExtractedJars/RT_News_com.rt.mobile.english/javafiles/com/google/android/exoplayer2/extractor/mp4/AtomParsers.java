// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.*;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			Atom, TrackEncryptionBox, MetadataUtil, TrackSampleTable, 
//			Track, FixedSampleSizeRechunker

final class AtomParsers
{
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

		public static final int STSD_HEADER_SIZE = 8;
		public Format format;
		public int nalUnitLengthFieldLength;
		public int requiredSampleTransformation;
		public final TrackEncryptionBox trackEncryptionBoxes[];

		public StsdData(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			trackEncryptionBoxes = new TrackEncryptionBox[i];
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:anewarray       TrackEncryptionBox[]
		//    5    9:putfield        #25  <Field TrackEncryptionBox[] trackEncryptionBoxes>
			requiredSampleTransformation = 0;
		//    6   12:aload_0         
		//    7   13:iconst_0        
		//    8   14:putfield        #27  <Field int requiredSampleTransformation>
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
			if(fixedSampleSize == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #36  <Field int fixedSampleSize>
		//*   2    4:ifne            15
				return data.readUnsignedIntToInt();
		//    3    7:aload_0         
		//    4    8:getfield        #24  <Field ParsableByteArray data>
		//    5   11:invokevirtual   #34  <Method int ParsableByteArray.readUnsignedIntToInt()>
		//    6   14:ireturn         
			else
				return fixedSampleSize;
		//    7   15:aload_0         
		//    8   16:getfield        #36  <Field int fixedSampleSize>
		//    9   19:ireturn         
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
			if(fieldSize == 8)
		//*   0    0:aload_0         
		//*   1    1:getfield        #38  <Field int fieldSize>
		//*   2    4:bipush          8
		//*   3    6:icmpne          17
				return data.readUnsignedByte();
		//    4    9:aload_0         
		//    5   10:getfield        #26  <Field ParsableByteArray data>
		//    6   13:invokevirtual   #48  <Method int ParsableByteArray.readUnsignedByte()>
		//    7   16:ireturn         
			if(fieldSize == 16)
		//*   8   17:aload_0         
		//*   9   18:getfield        #38  <Field int fieldSize>
		//*  10   21:bipush          16
		//*  11   23:icmpne          34
				return data.readUnsignedShort();
		//   12   26:aload_0         
		//   13   27:getfield        #26  <Field ParsableByteArray data>
		//   14   30:invokevirtual   #51  <Method int ParsableByteArray.readUnsignedShort()>
		//   15   33:ireturn         
			int i = sampleIndex;
		//   16   34:aload_0         
		//   17   35:getfield        #53  <Field int sampleIndex>
		//   18   38:istore_1        
			sampleIndex = i + 1;
		//   19   39:aload_0         
		//   20   40:iload_1         
		//   21   41:iconst_1        
		//   22   42:iadd            
		//   23   43:putfield        #53  <Field int sampleIndex>
			if(i % 2 == 0)
		//*  24   46:iload_1         
		//*  25   47:iconst_2        
		//*  26   48:irem            
		//*  27   49:ifne            74
			{
				currentByte = data.readUnsignedByte();
		//   28   52:aload_0         
		//   29   53:aload_0         
		//   30   54:getfield        #26  <Field ParsableByteArray data>
		//   31   57:invokevirtual   #48  <Method int ParsableByteArray.readUnsignedByte()>
		//   32   60:putfield        #55  <Field int currentByte>
				return (currentByte & 0xf0) >> 4;
		//   33   63:aload_0         
		//   34   64:getfield        #55  <Field int currentByte>
		//   35   67:sipush          240
		//   36   70:iand            
		//   37   71:iconst_4        
		//   38   72:ishr            
		//   39   73:ireturn         
			} else
			{
				return currentByte & 0xf;
		//   40   74:aload_0         
		//   41   75:getfield        #55  <Field int currentByte>
		//   42   78:bipush          15
		//   43   80:iand            
		//   44   81:ireturn         
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

	public static final class UnhandledEditListException extends ParserException
	{

		public UnhandledEditListException()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void ParserException()>
		//    2    4:return          
		}
	}


	private AtomParsers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void Object()>
	//    2    4:return          
	}

	private static boolean canApplyEditWithGaplessInfo(long al[], long l, long l1, long l2)
	{
		int j = al.length - 1;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:iconst_1        
	//    3    3:isub            
	//    4    4:istore          8
		int i = Util.constrainValue(3, 0, j);
	//    5    6:iconst_3        
	//    6    7:iconst_0        
	//    7    8:iload           8
	//    8   10:invokestatic    #85  <Method int Util.constrainValue(int, int, int)>
	//    9   13:istore          7
		j = Util.constrainValue(al.length - 3, 0, j);
	//   10   15:aload_0         
	//   11   16:arraylength     
	//   12   17:iconst_3        
	//   13   18:isub            
	//   14   19:iconst_0        
	//   15   20:iload           8
	//   16   22:invokestatic    #85  <Method int Util.constrainValue(int, int, int)>
	//   17   25:istore          8
		return al[0] <= l1 && l1 < al[i] && al[j] < l2 && l2 <= l;
	//   18   27:aload_0         
	//   19   28:iconst_0        
	//   20   29:laload          
	//   21   30:lload_3         
	//   22   31:lcmp            
	//   23   32:ifgt            63
	//   24   35:lload_3         
	//   25   36:aload_0         
	//   26   37:iload           7
	//   27   39:laload          
	//   28   40:lcmp            
	//   29   41:ifge            63
	//   30   44:aload_0         
	//   31   45:iload           8
	//   32   47:laload          
	//   33   48:lload           5
	//   34   50:lcmp            
	//   35   51:ifge            63
	//   36   54:lload           5
	//   37   56:lload_1         
	//   38   57:lcmp            
	//   39   58:ifgt            63
	//   40   61:iconst_1        
	//   41   62:ireturn         
	//   42   63:iconst_0        
	//   43   64:ireturn         
	}

	private static int findEsdsPosition(ParsableByteArray parsablebytearray, int i, int j)
	{
		int l;
		for(int k = parsablebytearray.getPosition(); k - i < j; k += l)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #93  <Method int ParsableByteArray.getPosition()>
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
	//   10   14:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
			l = parsablebytearray.readInt();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
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
	//   22   39:ldc1            #102 <String "childAtomSize should be positive">
	//   23   41:invokestatic    #108 <Method void Assertions.checkArgument(boolean, Object)>
			if(parsablebytearray.readInt() == Atom.TYPE_esds)
	//*  24   44:aload_0         
	//*  25   45:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//*  26   48:getstatic       #113 <Field int Atom.TYPE_esds>
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

	private static void parseAudioSampleEntry(ParsableByteArray parsablebytearray, int i, int j, int k, int l, String s, boolean flag, DrmInitData drminitdata, 
			StsdData stsddata, int i1)
		throws ParserException
	{
		int j1;
		int k1;
		int i2;
		boolean flag1;
		StsdData stsddata1;
		StsdData stsddata2;
		stsddata2 = stsddata;
	//    0    0:aload           8
	//    1    2:astore          20
		byte byte0 = 8;
	//    2    4:bipush          8
	//    3    6:istore          13
		parsablebytearray.setPosition(j + 8 + 8);
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:bipush          8
	//    7   12:iadd            
	//    8   13:bipush          8
	//    9   15:iadd            
	//   10   16:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
		flag1 = false;
	//   11   19:iconst_0        
	//   12   20:istore          17
		if(flag)
	//*  13   22:iload           6
	//*  14   24:ifeq            42
		{
			j1 = parsablebytearray.readUnsignedShort();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #120 <Method int ParsableByteArray.readUnsignedShort()>
	//   17   31:istore          10
			parsablebytearray.skipBytes(6);
	//   18   33:aload_0         
	//   19   34:bipush          6
	//   20   36:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
		} else
	//*  21   39:goto            51
		{
			parsablebytearray.skipBytes(8);
	//   22   42:aload_0         
	//   23   43:bipush          8
	//   24   45:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
			j1 = 0;
	//   25   48:iconst_0        
	//   26   49:istore          10
		}
		byte byte1 = 2;
	//   27   51:iconst_2        
	//   28   52:istore          14
		if(j1 != 0 && j1 != 1)
	//*  29   54:iload           10
	//*  30   56:ifeq            106
	//*  31   59:iload           10
	//*  32   61:iconst_1        
	//*  33   62:icmpne          68
	//*  34   65:goto            106
		{
			if(j1 == 2)
	//*  35   68:iload           10
	//*  36   70:iconst_2        
	//*  37   71:icmpne          105
			{
				parsablebytearray.skipBytes(16);
	//   38   74:aload_0         
	//   39   75:bipush          16
	//   40   77:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
				k1 = (int)Math.round(parsablebytearray.readDouble());
	//   41   80:aload_0         
	//   42   81:invokevirtual   #127 <Method double ParsableByteArray.readDouble()>
	//   43   84:invokestatic    #133 <Method long Math.round(double)>
	//   44   87:l2i             
	//   45   88:istore          11
				j1 = parsablebytearray.readUnsignedIntToInt();
	//   46   90:aload_0         
	//   47   91:invokevirtual   #136 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   48   94:istore          10
				parsablebytearray.skipBytes(20);
	//   49   96:aload_0         
	//   50   97:bipush          20
	//   51   99:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
			} else
	//*  52  102:goto            140
			{
				return;
	//   53  105:return          
			}
		} else
		{
			int l1 = parsablebytearray.readUnsignedShort();
	//   54  106:aload_0         
	//   55  107:invokevirtual   #120 <Method int ParsableByteArray.readUnsignedShort()>
	//   56  110:istore          12
			parsablebytearray.skipBytes(6);
	//   57  112:aload_0         
	//   58  113:bipush          6
	//   59  115:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
			k1 = parsablebytearray.readUnsignedFixedPoint1616();
	//   60  118:aload_0         
	//   61  119:invokevirtual   #139 <Method int ParsableByteArray.readUnsignedFixedPoint1616()>
	//   62  122:istore          11
			if(j1 == 1)
	//*  63  124:iload           10
	//*  64  126:iconst_1        
	//*  65  127:icmpne          136
				parsablebytearray.skipBytes(16);
	//   66  130:aload_0         
	//   67  131:bipush          16
	//   68  133:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
			j1 = l1;
	//   69  136:iload           12
	//   70  138:istore          10
		}
		int i3 = parsablebytearray.getPosition();
	//   71  140:aload_0         
	//   72  141:invokevirtual   #93  <Method int ParsableByteArray.getPosition()>
	//   73  144:istore          15
		int j3 = Atom.TYPE_enca;
	//   74  146:getstatic       #142 <Field int Atom.TYPE_enca>
	//   75  149:istore          16
		stsddata = ((StsdData) (drminitdata));
	//   76  151:aload           7
	//   77  153:astore          8
		i2 = i;
	//   78  155:iload_1         
	//   79  156:istore          12
		if(i == j3)
	//*  80  158:iload_1         
	//*  81  159:iload           16
	//*  82  161:icmpne          247
		{
			Pair pair = parseSampleEntryEncryptionData(parsablebytearray, j, k);
	//   83  164:aload_0         
	//   84  165:iload_2         
	//   85  166:iload_3         
	//   86  167:invokestatic    #146 <Method Pair parseSampleEntryEncryptionData(ParsableByteArray, int, int)>
	//   87  170:astore          19
			stsddata = ((StsdData) (drminitdata));
	//   88  172:aload           7
	//   89  174:astore          8
			if(pair != null)
	//*  90  176:aload           19
	//*  91  178:ifnull          238
			{
				i = ((Integer)pair.first).intValue();
	//   92  181:aload           19
	//   93  183:getfield        #152 <Field Object Pair.first>
	//   94  186:checkcast       #154 <Class Integer>
	//   95  189:invokevirtual   #157 <Method int Integer.intValue()>
	//   96  192:istore_1        
				if(drminitdata == null)
	//*  97  193:aload           7
	//*  98  195:ifnonnull       204
					stsddata = null;
	//   99  198:aconst_null     
	//  100  199:astore          8
				else
	//* 101  201:goto            222
					stsddata = ((StsdData) (drminitdata.copyWithSchemeType(((TrackEncryptionBox)pair.second).schemeType)));
	//  102  204:aload           7
	//  103  206:aload           19
	//  104  208:getfield        #160 <Field Object Pair.second>
	//  105  211:checkcast       #162 <Class TrackEncryptionBox>
	//  106  214:getfield        #165 <Field String TrackEncryptionBox.schemeType>
	//  107  217:invokevirtual   #171 <Method DrmInitData DrmInitData.copyWithSchemeType(String)>
	//  108  220:astore          8
				stsddata2.trackEncryptionBoxes[i1] = (TrackEncryptionBox)pair.second;
	//  109  222:aload           20
	//  110  224:getfield        #175 <Field TrackEncryptionBox[] AtomParsers$StsdData.trackEncryptionBoxes>
	//  111  227:iload           9
	//  112  229:aload           19
	//  113  231:getfield        #160 <Field Object Pair.second>
	//  114  234:checkcast       #162 <Class TrackEncryptionBox>
	//  115  237:aastore         
			}
			parsablebytearray.setPosition(i3);
	//  116  238:aload_0         
	//  117  239:iload           15
	//  118  241:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
			i2 = i;
	//  119  244:iload_1         
	//  120  245:istore          12
		}
		if(i2 == Atom.TYPE_ac_3)
	//* 121  247:iload           12
	//* 122  249:getstatic       #178 <Field int Atom.TYPE_ac_3>
	//* 123  252:icmpne          262
			drminitdata = "audio/ac3";
	//  124  255:ldc1            #180 <String "audio/ac3">
	//  125  257:astore          7
		else
	//* 126  259:goto            422
		if(i2 == Atom.TYPE_ec_3)
	//* 127  262:iload           12
	//* 128  264:getstatic       #183 <Field int Atom.TYPE_ec_3>
	//* 129  267:icmpne          277
			drminitdata = "audio/eac3";
	//  130  270:ldc1            #185 <String "audio/eac3">
	//  131  272:astore          7
		else
	//* 132  274:goto            422
		if(i2 == Atom.TYPE_dtsc)
	//* 133  277:iload           12
	//* 134  279:getstatic       #188 <Field int Atom.TYPE_dtsc>
	//* 135  282:icmpne          292
			drminitdata = "audio/vnd.dts";
	//  136  285:ldc1            #190 <String "audio/vnd.dts">
	//  137  287:astore          7
		else
	//* 138  289:goto            422
		if(i2 != Atom.TYPE_dtsh && i2 != Atom.TYPE_dtsl)
	//* 139  292:iload           12
	//* 140  294:getstatic       #193 <Field int Atom.TYPE_dtsh>
	//* 141  297:icmpeq          418
	//* 142  300:iload           12
	//* 143  302:getstatic       #196 <Field int Atom.TYPE_dtsl>
	//* 144  305:icmpne          311
	//* 145  308:goto            418
		{
			if(i2 == Atom.TYPE_dtse)
	//* 146  311:iload           12
	//* 147  313:getstatic       #199 <Field int Atom.TYPE_dtse>
	//* 148  316:icmpne          326
				drminitdata = "audio/vnd.dts.hd;profile=lbr";
	//  149  319:ldc1            #201 <String "audio/vnd.dts.hd;profile=lbr">
	//  150  321:astore          7
			else
	//* 151  323:goto            422
			if(i2 == Atom.TYPE_samr)
	//* 152  326:iload           12
	//* 153  328:getstatic       #204 <Field int Atom.TYPE_samr>
	//* 154  331:icmpne          341
				drminitdata = "audio/3gpp";
	//  155  334:ldc1            #206 <String "audio/3gpp">
	//  156  336:astore          7
			else
	//* 157  338:goto            422
			if(i2 == Atom.TYPE_sawb)
	//* 158  341:iload           12
	//* 159  343:getstatic       #209 <Field int Atom.TYPE_sawb>
	//* 160  346:icmpne          356
				drminitdata = "audio/amr-wb";
	//  161  349:ldc1            #211 <String "audio/amr-wb">
	//  162  351:astore          7
			else
	//* 163  353:goto            422
			if(i2 != Atom.TYPE_lpcm && i2 != Atom.TYPE_sowt)
	//* 164  356:iload           12
	//* 165  358:getstatic       #214 <Field int Atom.TYPE_lpcm>
	//* 166  361:icmpeq          411
	//* 167  364:iload           12
	//* 168  366:getstatic       #217 <Field int Atom.TYPE_sowt>
	//* 169  369:icmpne          375
	//* 170  372:goto            411
			{
				if(i2 == Atom.TYPE__mp3)
	//* 171  375:iload           12
	//* 172  377:getstatic       #220 <Field int Atom.TYPE__mp3>
	//* 173  380:icmpne          390
					drminitdata = "audio/mpeg";
	//  174  383:ldc1            #222 <String "audio/mpeg">
	//  175  385:astore          7
				else
	//* 176  387:goto            422
				if(i2 == Atom.TYPE_alac)
	//* 177  390:iload           12
	//* 178  392:getstatic       #225 <Field int Atom.TYPE_alac>
	//* 179  395:icmpne          405
					drminitdata = "audio/alac";
	//  180  398:ldc1            #227 <String "audio/alac">
	//  181  400:astore          7
				else
	//* 182  402:goto            422
					drminitdata = null;
	//  183  405:aconst_null     
	//  184  406:astore          7
			} else
	//* 185  408:goto            422
			{
				drminitdata = "audio/raw";
	//  186  411:ldc1            #229 <String "audio/raw">
	//  187  413:astore          7
			}
		} else
	//* 188  415:goto            422
		{
			drminitdata = "audio/vnd.dts.hd";
	//  189  418:ldc1            #231 <String "audio/vnd.dts.hd">
	//  190  420:astore          7
		}
		i1 = j1;
	//  191  422:iload           10
	//  192  424:istore          9
		i = i3;
	//  193  426:iload           15
	//  194  428:istore_1        
		Object obj = null;
	//  195  429:aconst_null     
	//  196  430:astore          21
		j1 = k1;
	//  197  432:iload           11
	//  198  434:istore          10
		k1 = i1;
	//  199  436:iload           9
	//  200  438:istore          11
		i2 = ((int) (byte0));
	//  201  440:iload           13
	//  202  442:istore          12
		i1 = ((int) (byte1));
	//  203  444:iload           14
	//  204  446:istore          9
		stsddata1 = stsddata;
	//  205  448:aload           8
	//  206  450:astore          19
		stsddata = ((StsdData) (obj));
	//  207  452:aload           21
	//  208  454:astore          8
_L7:
		if(i - j >= k) goto _L2; else goto _L1
	//  209  456:iload_1         
	//  210  457:iload_2         
	//  211  458:isub            
	//  212  459:iload_3         
	//  213  460:icmpge          826
_L1:
		int j2;
		int l2;
		parsablebytearray.setPosition(i);
	//  214  463:aload_0         
	//  215  464:iload_1         
	//  216  465:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
		j2 = parsablebytearray.readInt();
	//  217  468:aload_0         
	//  218  469:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//  219  472:istore          13
		i1 = j2;
	//  220  474:iload           13
	//  221  476:istore          9
		boolean flag2;
		if(i1 > 0)
	//* 222  478:iload           9
	//* 223  480:ifle            489
			flag2 = true;
	//  224  483:iconst_1        
	//  225  484:istore          18
		else
	//* 226  486:goto            493
			flag2 = flag1;
	//  227  489:iload           17
	//  228  491:istore          18
		Assertions.checkArgument(flag2, "childAtomSize should be positive");
	//  229  493:iload           18
	//  230  495:ldc1            #102 <String "childAtomSize should be positive">
	//  231  497:invokestatic    #108 <Method void Assertions.checkArgument(boolean, Object)>
		l2 = parsablebytearray.readInt();
	//  232  500:aload_0         
	//  233  501:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//  234  504:istore          14
		if(l2 == Atom.TYPE_esds || flag && l2 == Atom.TYPE_wave)
	//* 235  506:iload           14
	//* 236  508:getstatic       #113 <Field int Atom.TYPE_esds>
	//* 237  511:icmpeq          695
	//* 238  514:iload           6
	//* 239  516:ifeq            530
	//* 240  519:iload           14
	//* 241  521:getstatic       #234 <Field int Atom.TYPE_wave>
	//* 242  524:icmpne          530
			break MISSING_BLOCK_LABEL_695;
	//  243  527:goto            695
		if(l2 == Atom.TYPE_dac3)
	//* 244  530:iload           14
	//* 245  532:getstatic       #237 <Field int Atom.TYPE_dac3>
	//* 246  535:icmpne          567
		{
			parsablebytearray.setPosition(i2 + i);
	//  247  538:aload_0         
	//  248  539:iload           12
	//  249  541:iload_1         
	//  250  542:iadd            
	//  251  543:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
			stsddata2.format = Ac3Util.parseAc3AnnexFFormat(parsablebytearray, Integer.toString(l), s, ((DrmInitData) (stsddata1)));
	//  252  546:aload           20
	//  253  548:aload_0         
	//  254  549:iload           4
	//  255  551:invokestatic    #241 <Method String Integer.toString(int)>
	//  256  554:aload           5
	//  257  556:aload           19
	//  258  558:invokestatic    #247 <Method Format Ac3Util.parseAc3AnnexFFormat(ParsableByteArray, String, String, DrmInitData)>
	//  259  561:putfield        #251 <Field Format AtomParsers$StsdData.format>
			break MISSING_BLOCK_LABEL_815;
	//  260  564:goto            692
		}
		if(l2 == Atom.TYPE_dec3)
	//* 261  567:iload           14
	//* 262  569:getstatic       #254 <Field int Atom.TYPE_dec3>
	//* 263  572:icmpne          604
		{
			parsablebytearray.setPosition(i2 + i);
	//  264  575:aload_0         
	//  265  576:iload           12
	//  266  578:iload_1         
	//  267  579:iadd            
	//  268  580:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
			stsddata2.format = Ac3Util.parseEAc3AnnexFFormat(parsablebytearray, Integer.toString(l), s, ((DrmInitData) (stsddata1)));
	//  269  583:aload           20
	//  270  585:aload_0         
	//  271  586:iload           4
	//  272  588:invokestatic    #241 <Method String Integer.toString(int)>
	//  273  591:aload           5
	//  274  593:aload           19
	//  275  595:invokestatic    #257 <Method Format Ac3Util.parseEAc3AnnexFFormat(ParsableByteArray, String, String, DrmInitData)>
	//  276  598:putfield        #251 <Field Format AtomParsers$StsdData.format>
			break MISSING_BLOCK_LABEL_815;
	//  277  601:goto            564
		}
		if(l2 != Atom.TYPE_ddts) goto _L4; else goto _L3
	//  278  604:iload           14
	//  279  606:getstatic       #260 <Field int Atom.TYPE_ddts>
	//  280  609:icmpne          650
_L3:
		stsddata2.format = Format.createAudioSampleFormat(Integer.toString(l), ((String) (drminitdata)), ((String) (null)), -1, -1, k1, j1, ((java.util.List) (null)), ((DrmInitData) (stsddata1)), 0, s);
	//  281  612:aload           20
	//  282  614:iload           4
	//  283  616:invokestatic    #241 <Method String Integer.toString(int)>
	//  284  619:aload           7
	//  285  621:aconst_null     
	//  286  622:iconst_m1       
	//  287  623:iconst_m1       
	//  288  624:iload           11
	//  289  626:iload           10
	//  290  628:aconst_null     
	//  291  629:aload           19
	//  292  631:iconst_0        
	//  293  632:aload           5
	//  294  634:invokestatic    #266 <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, java.util.List, DrmInitData, int, String)>
	//  295  637:putfield        #251 <Field Format AtomParsers$StsdData.format>
_L6:
		i1 = j2;
	//  296  640:iload           13
	//  297  642:istore          9
		flag1 = false;
	//  298  644:iconst_0        
	//  299  645:istore          17
		break MISSING_BLOCK_LABEL_815;
	//  300  647:goto            692
_L4:
		DrmInitData drminitdata1 = drminitdata;
	//  301  650:aload           7
	//  302  652:astore          21
		if(l2 != Atom.TYPE_alac) goto _L6; else goto _L5
	//  303  654:iload           14
	//  304  656:getstatic       #225 <Field int Atom.TYPE_alac>
	//  305  659:icmpne          640
_L5:
		stsddata = ((StsdData) (new byte[i1]));
	//  306  662:iload           9
	//  307  664:newarray        byte[]
	//  308  666:astore          8
		parsablebytearray.setPosition(i);
	//  309  668:aload_0         
	//  310  669:iload_1         
	//  311  670:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
		flag1 = false;
	//  312  673:iconst_0        
	//  313  674:istore          17
		parsablebytearray.readBytes(((byte []) (stsddata)), 0, i1);
	//  314  676:aload_0         
	//  315  677:aload           8
	//  316  679:iconst_0        
	//  317  680:iload           9
	//  318  682:invokevirtual   #270 <Method void ParsableByteArray.readBytes(byte[], int, int)>
		drminitdata = drminitdata1;
	//  319  685:aload           21
	//  320  687:astore          7
		break MISSING_BLOCK_LABEL_815;
	//  321  689:goto            815
	//* 322  692:goto            815
		int k2;
		if(l2 == Atom.TYPE_esds)
	//* 323  695:iload           14
	//* 324  697:getstatic       #113 <Field int Atom.TYPE_esds>
	//* 325  700:icmpne          709
			k2 = i;
	//  326  703:iload_1         
	//  327  704:istore          13
		else
	//* 328  706:goto            718
			k2 = findEsdsPosition(parsablebytearray, i, i1);
	//  329  709:aload_0         
	//  330  710:iload_1         
	//  331  711:iload           9
	//  332  713:invokestatic    #272 <Method int findEsdsPosition(ParsableByteArray, int, int)>
	//  333  716:istore          13
		if(k2 != -1)
	//* 334  718:iload           13
	//* 335  720:iconst_m1       
	//* 336  721:icmpeq          815
		{
			drminitdata = ((DrmInitData) (parseEsdsFromParent(parsablebytearray, k2)));
	//  337  724:aload_0         
	//  338  725:iload           13
	//  339  727:invokestatic    #276 <Method Pair parseEsdsFromParent(ParsableByteArray, int)>
	//  340  730:astore          7
			String s1 = (String)((Pair) (drminitdata)).first;
	//  341  732:aload           7
	//  342  734:getfield        #152 <Field Object Pair.first>
	//  343  737:checkcast       #278 <Class String>
	//  344  740:astore          21
			byte abyte0[] = (byte[])((Pair) (drminitdata)).second;
	//  345  742:aload           7
	//  346  744:getfield        #160 <Field Object Pair.second>
	//  347  747:checkcast       #280 <Class byte[]>
	//  348  750:astore          22
			stsddata = ((StsdData) (abyte0));
	//  349  752:aload           22
	//  350  754:astore          8
			drminitdata = ((DrmInitData) (s1));
	//  351  756:aload           21
	//  352  758:astore          7
			if("audio/mp4a-latm".equals(((Object) (s1))))
	//* 353  760:ldc2            #282 <String "audio/mp4a-latm">
	//* 354  763:aload           21
	//* 355  765:invokevirtual   #286 <Method boolean String.equals(Object)>
	//* 356  768:ifeq            815
			{
				drminitdata = ((DrmInitData) (CodecSpecificDataUtil.parseAacAudioSpecificConfig(abyte0)));
	//  357  771:aload           22
	//  358  773:invokestatic    #292 <Method Pair CodecSpecificDataUtil.parseAacAudioSpecificConfig(byte[])>
	//  359  776:astore          7
				j1 = ((Integer)((Pair) (drminitdata)).first).intValue();
	//  360  778:aload           7
	//  361  780:getfield        #152 <Field Object Pair.first>
	//  362  783:checkcast       #154 <Class Integer>
	//  363  786:invokevirtual   #157 <Method int Integer.intValue()>
	//  364  789:istore          10
				k1 = ((Integer)((Pair) (drminitdata)).second).intValue();
	//  365  791:aload           7
	//  366  793:getfield        #160 <Field Object Pair.second>
	//  367  796:checkcast       #154 <Class Integer>
	//  368  799:invokevirtual   #157 <Method int Integer.intValue()>
	//  369  802:istore          11
				stsddata = ((StsdData) (abyte0));
	//  370  804:aload           22
	//  371  806:astore          8
				drminitdata = ((DrmInitData) (s1));
	//  372  808:aload           21
	//  373  810:astore          7
			}
		}
	//* 374  812:goto            815
		i += i1;
	//  375  815:iload_1         
	//  376  816:iload           9
	//  377  818:iadd            
	//  378  819:istore_1        
		i1 = 2;
	//  379  820:iconst_2        
	//  380  821:istore          9
		  goto _L7
	//* 381  823:goto            456
_L2:
		if(stsddata2.format == null && drminitdata != null)
	//* 382  826:aload           20
	//* 383  828:getfield        #251 <Field Format AtomParsers$StsdData.format>
	//* 384  831:ifnonnull       905
	//* 385  834:aload           7
	//* 386  836:ifnull          905
		{
			if(!"audio/raw".equals(((Object) (drminitdata))))
	//* 387  839:ldc1            #229 <String "audio/raw">
	//* 388  841:aload           7
	//* 389  843:invokevirtual   #286 <Method boolean String.equals(Object)>
	//* 390  846:ifeq            852
	//* 391  849:goto            855
				i1 = -1;
	//  392  852:iconst_m1       
	//  393  853:istore          9
			String s2 = Integer.toString(l);
	//  394  855:iload           4
	//  395  857:invokestatic    #241 <Method String Integer.toString(int)>
	//  396  860:astore          21
			if(stsddata == null)
	//* 397  862:aload           8
	//* 398  864:ifnonnull       872
				parsablebytearray = null;
	//  399  867:aconst_null     
	//  400  868:astore_0        
			else
	//* 401  869:goto            878
				parsablebytearray = ((ParsableByteArray) (Collections.singletonList(((Object) (stsddata)))));
	//  402  872:aload           8
	//  403  874:invokestatic    #298 <Method java.util.List Collections.singletonList(Object)>
	//  404  877:astore_0        
			stsddata2.format = Format.createAudioSampleFormat(s2, ((String) (drminitdata)), ((String) (null)), -1, -1, k1, j1, i1, ((java.util.List) (parsablebytearray)), ((DrmInitData) (stsddata1)), 0, s);
	//  405  878:aload           20
	//  406  880:aload           21
	//  407  882:aload           7
	//  408  884:aconst_null     
	//  409  885:iconst_m1       
	//  410  886:iconst_m1       
	//  411  887:iload           11
	//  412  889:iload           10
	//  413  891:iload           9
	//  414  893:aload_0         
	//  415  894:aload           19
	//  416  896:iconst_0        
	//  417  897:aload           5
	//  418  899:invokestatic    #301 <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, int, java.util.List, DrmInitData, int, String)>
	//  419  902:putfield        #251 <Field Format AtomParsers$StsdData.format>
		}
		return;
	//  420  905:return          
	}

	static Pair parseCommonEncryptionSinfFromParent(ParsableByteArray parsablebytearray, int i, int j)
	{
		int k = i + 8;
	//    0    0:iload_1         
	//    1    1:bipush          8
	//    2    3:iadd            
	//    3    4:istore_3        
		int i1 = -1;
	//    4    5:iconst_m1       
	//    5    6:istore          5
		String s = null;
	//    6    8:aconst_null     
	//    7    9:astore          11
		Object obj = ((Object) (s));
	//    8   11:aload           11
	//    9   13:astore          10
		int l = 0;
	//   10   15:iconst_0        
	//   11   16:istore          4
		while(k - i < j) 
	//*  12   18:iload_3         
	//*  13   19:iload_1         
	//*  14   20:isub            
	//*  15   21:iload_2         
	//*  16   22:icmpge          140
		{
			parsablebytearray.setPosition(k);
	//   17   25:aload_0         
	//   18   26:iload_3         
	//   19   27:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
			int j1 = parsablebytearray.readInt();
	//   20   30:aload_0         
	//   21   31:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//   22   34:istore          6
			int k1 = parsablebytearray.readInt();
	//   23   36:aload_0         
	//   24   37:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//   25   40:istore          7
			String s1;
			Object obj1;
			if(k1 == Atom.TYPE_frma)
	//*  26   42:iload           7
	//*  27   44:getstatic       #306 <Field int Atom.TYPE_frma>
	//*  28   47:icmpne          66
			{
				obj1 = ((Object) (Integer.valueOf(parsablebytearray.readInt())));
	//   29   50:aload_0         
	//   30   51:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//   31   54:invokestatic    #310 <Method Integer Integer.valueOf(int)>
	//   32   57:astore          13
				s1 = s;
	//   33   59:aload           11
	//   34   61:astore          12
			} else
	//*  35   63:goto            124
			if(k1 == Atom.TYPE_schm)
	//*  36   66:iload           7
	//*  37   68:getstatic       #313 <Field int Atom.TYPE_schm>
	//*  38   71:icmpne          93
			{
				parsablebytearray.skipBytes(4);
	//   39   74:aload_0         
	//   40   75:iconst_4        
	//   41   76:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
				s1 = parsablebytearray.readString(4);
	//   42   79:aload_0         
	//   43   80:iconst_4        
	//   44   81:invokevirtual   #316 <Method String ParsableByteArray.readString(int)>
	//   45   84:astore          12
				obj1 = obj;
	//   46   86:aload           10
	//   47   88:astore          13
			} else
	//*  48   90:goto            124
			{
				s1 = s;
	//   49   93:aload           11
	//   50   95:astore          12
				obj1 = obj;
	//   51   97:aload           10
	//   52   99:astore          13
				if(k1 == Atom.TYPE_schi)
	//*  53  101:iload           7
	//*  54  103:getstatic       #319 <Field int Atom.TYPE_schi>
	//*  55  106:icmpne          124
				{
					i1 = k;
	//   56  109:iload_3         
	//   57  110:istore          5
					l = j1;
	//   58  112:iload           6
	//   59  114:istore          4
					obj1 = obj;
	//   60  116:aload           10
	//   61  118:astore          13
					s1 = s;
	//   62  120:aload           11
	//   63  122:astore          12
				}
			}
			k += j1;
	//   64  124:iload_3         
	//   65  125:iload           6
	//   66  127:iadd            
	//   67  128:istore_3        
			s = s1;
	//   68  129:aload           12
	//   69  131:astore          11
			obj = obj1;
	//   70  133:aload           13
	//   71  135:astore          10
		}
	//*  72  137:goto            18
		if(!"cenc".equals(((Object) (s))) && !"cbc1".equals(((Object) (s))) && !"cens".equals(((Object) (s))) && !"cbcs".equals(((Object) (s))))
	//*  73  140:ldc2            #321 <String "cenc">
	//*  74  143:aload           11
	//*  75  145:invokevirtual   #286 <Method boolean String.equals(Object)>
	//*  76  148:ifne            189
	//*  77  151:ldc2            #323 <String "cbc1">
	//*  78  154:aload           11
	//*  79  156:invokevirtual   #286 <Method boolean String.equals(Object)>
	//*  80  159:ifne            189
	//*  81  162:ldc2            #325 <String "cens">
	//*  82  165:aload           11
	//*  83  167:invokevirtual   #286 <Method boolean String.equals(Object)>
	//*  84  170:ifne            189
	//*  85  173:ldc2            #327 <String "cbcs">
	//*  86  176:aload           11
	//*  87  178:invokevirtual   #286 <Method boolean String.equals(Object)>
	//*  88  181:ifeq            187
	//*  89  184:goto            189
			return null;
	//   90  187:aconst_null     
	//   91  188:areturn         
		boolean flag1 = true;
	//   92  189:iconst_1        
	//   93  190:istore          9
		boolean flag;
		if(obj != null)
	//*  94  192:aload           10
	//*  95  194:ifnull          203
			flag = true;
	//   96  197:iconst_1        
	//   97  198:istore          8
		else
	//*  98  200:goto            206
			flag = false;
	//   99  203:iconst_0        
	//  100  204:istore          8
		Assertions.checkArgument(flag, "frma atom is mandatory");
	//  101  206:iload           8
	//  102  208:ldc2            #329 <String "frma atom is mandatory">
	//  103  211:invokestatic    #108 <Method void Assertions.checkArgument(boolean, Object)>
		if(i1 != -1)
	//* 104  214:iload           5
	//* 105  216:iconst_m1       
	//* 106  217:icmpeq          226
			flag = true;
	//  107  220:iconst_1        
	//  108  221:istore          8
		else
	//* 109  223:goto            229
			flag = false;
	//  110  226:iconst_0        
	//  111  227:istore          8
		Assertions.checkArgument(flag, "schi atom is mandatory");
	//  112  229:iload           8
	//  113  231:ldc2            #331 <String "schi atom is mandatory">
	//  114  234:invokestatic    #108 <Method void Assertions.checkArgument(boolean, Object)>
		parsablebytearray = ((ParsableByteArray) (parseSchiFromParent(parsablebytearray, i1, l, s)));
	//  115  237:aload_0         
	//  116  238:iload           5
	//  117  240:iload           4
	//  118  242:aload           11
	//  119  244:invokestatic    #335 <Method TrackEncryptionBox parseSchiFromParent(ParsableByteArray, int, int, String)>
	//  120  247:astore_0        
		if(parsablebytearray != null)
	//* 121  248:aload_0         
	//* 122  249:ifnull          259
			flag = flag1;
	//  123  252:iload           9
	//  124  254:istore          8
		else
	//* 125  256:goto            262
			flag = false;
	//  126  259:iconst_0        
	//  127  260:istore          8
		Assertions.checkArgument(flag, "tenc atom is mandatory");
	//  128  262:iload           8
	//  129  264:ldc2            #337 <String "tenc atom is mandatory">
	//  130  267:invokestatic    #108 <Method void Assertions.checkArgument(boolean, Object)>
		return Pair.create(obj, ((Object) (parsablebytearray)));
	//  131  270:aload           10
	//  132  272:aload_0         
	//  133  273:invokestatic    #341 <Method Pair Pair.create(Object, Object)>
	//  134  276:areturn         
	}

	private static Pair parseEdts(Atom.ContainerAtom containeratom)
	{
		if(containeratom != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          152
		{
			containeratom = ((Atom.ContainerAtom) (containeratom.getLeafAtomOfType(Atom.TYPE_elst)));
	//    2    4:aload_0         
	//    3    5:getstatic       #348 <Field int Atom.TYPE_elst>
	//    4    8:invokevirtual   #354 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//    5   11:astore_0        
			if(containeratom != null)
	//*   6   12:aload_0         
	//*   7   13:ifnonnull       19
	//*   8   16:goto            152
			{
				containeratom = ((Atom.ContainerAtom) (((Atom.LeafAtom) (containeratom)).data));
	//    9   19:aload_0         
	//   10   20:getfield        #360 <Field ParsableByteArray Atom$LeafAtom.data>
	//   11   23:astore_0        
				((ParsableByteArray) (containeratom)).setPosition(8);
	//   12   24:aload_0         
	//   13   25:bipush          8
	//   14   27:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
				int j = Atom.parseFullAtomVersion(((ParsableByteArray) (containeratom)).readInt());
	//   15   30:aload_0         
	//   16   31:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//   17   34:invokestatic    #364 <Method int Atom.parseFullAtomVersion(int)>
	//   18   37:istore_2        
				int k = ((ParsableByteArray) (containeratom)).readUnsignedIntToInt();
	//   19   38:aload_0         
	//   20   39:invokevirtual   #136 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   21   42:istore_3        
				long al[] = new long[k];
	//   22   43:iload_3         
	//   23   44:newarray        long[]
	//   24   46:astore          6
				long al1[] = new long[k];
	//   25   48:iload_3         
	//   26   49:newarray        long[]
	//   27   51:astore          7
				for(int i = 0; i < k; i++)
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
	//   37   66:invokevirtual   #368 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   38   69:lstore          4
					else
	//*  39   71:goto            80
						l = ((ParsableByteArray) (containeratom)).readUnsignedInt();
	//   40   74:aload_0         
	//   41   75:invokevirtual   #371 <Method long ParsableByteArray.readUnsignedInt()>
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
	//   51   92:invokevirtual   #374 <Method long ParsableByteArray.readLong()>
	//   52   95:lstore          4
					else
	//*  53   97:goto            107
						l = ((ParsableByteArray) (containeratom)).readInt();
	//   54  100:aload_0         
	//   55  101:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//   56  104:i2l             
	//   57  105:lstore          4
					al1[i] = l;
	//   58  107:aload           7
	//   59  109:iload_1         
	//   60  110:lload           4
	//   61  112:lastore         
					if(((ParsableByteArray) (containeratom)).readShort() != 1)
	//*  62  113:aload_0         
	//*  63  114:invokevirtual   #378 <Method short ParsableByteArray.readShort()>
	//*  64  117:iconst_1        
	//*  65  118:icmpeq          132
						throw new IllegalArgumentException("Unsupported media rate.");
	//   66  121:new             #380 <Class IllegalArgumentException>
	//   67  124:dup             
	//   68  125:ldc2            #382 <String "Unsupported media rate.">
	//   69  128:invokespecial   #385 <Method void IllegalArgumentException(String)>
	//   70  131:athrow          
					((ParsableByteArray) (containeratom)).skipBytes(2);
	//   71  132:aload_0         
	//   72  133:iconst_2        
	//   73  134:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
				}

	//   74  137:iload_1         
	//   75  138:iconst_1        
	//   76  139:iadd            
	//   77  140:istore_1        
	//*  78  141:goto            55
				return Pair.create(((Object) (al)), ((Object) (al1)));
	//   79  144:aload           6
	//   80  146:aload           7
	//   81  148:invokestatic    #341 <Method Pair Pair.create(Object, Object)>
	//   82  151:areturn         
			}
		}
		return Pair.create(((Object) (null)), ((Object) (null)));
	//   83  152:aconst_null     
	//   84  153:aconst_null     
	//   85  154:invokestatic    #341 <Method Pair Pair.create(Object, Object)>
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
	//    6    7:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
		parsablebytearray.skipBytes(1);
	//    7   10:aload_0         
	//    8   11:iconst_1        
	//    9   12:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
		parseExpandableClassSize(parsablebytearray);
	//   10   15:aload_0         
	//   11   16:invokestatic    #390 <Method int parseExpandableClassSize(ParsableByteArray)>
	//   12   19:pop             
		parsablebytearray.skipBytes(2);
	//   13   20:aload_0         
	//   14   21:iconst_2        
	//   15   22:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
		i = parsablebytearray.readUnsignedByte();
	//   16   25:aload_0         
	//   17   26:invokevirtual   #393 <Method int ParsableByteArray.readUnsignedByte()>
	//   18   29:istore_1        
		if((i & 0x80) != 0)
	//*  19   30:iload_1         
	//*  20   31:sipush          128
	//*  21   34:iand            
	//*  22   35:ifeq            43
			parsablebytearray.skipBytes(2);
	//   23   38:aload_0         
	//   24   39:iconst_2        
	//   25   40:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
		if((i & 0x40) != 0)
	//*  26   43:iload_1         
	//*  27   44:bipush          64
	//*  28   46:iand            
	//*  29   47:ifeq            58
			parsablebytearray.skipBytes(parsablebytearray.readUnsignedShort());
	//   30   50:aload_0         
	//   31   51:aload_0         
	//   32   52:invokevirtual   #120 <Method int ParsableByteArray.readUnsignedShort()>
	//   33   55:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
		if((i & 0x20) != 0)
	//*  34   58:iload_1         
	//*  35   59:bipush          32
	//*  36   61:iand            
	//*  37   62:ifeq            70
			parsablebytearray.skipBytes(2);
	//   38   65:aload_0         
	//   39   66:iconst_2        
	//   40   67:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
		parsablebytearray.skipBytes(1);
	//   41   70:aload_0         
	//   42   71:iconst_1        
	//   43   72:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
		parseExpandableClassSize(parsablebytearray);
	//   44   75:aload_0         
	//   45   76:invokestatic    #390 <Method int parseExpandableClassSize(ParsableByteArray)>
	//   46   79:pop             
		String s = MimeTypes.getMimeTypeFromMp4ObjectType(parsablebytearray.readUnsignedByte());
	//   47   80:aload_0         
	//   48   81:invokevirtual   #393 <Method int ParsableByteArray.readUnsignedByte()>
	//   49   84:invokestatic    #398 <Method String MimeTypes.getMimeTypeFromMp4ObjectType(int)>
	//   50   87:astore_2        
		if(!"audio/mpeg".equals(((Object) (s))) && !"audio/vnd.dts".equals(((Object) (s))) && !"audio/vnd.dts.hd".equals(((Object) (s))))
	//*  51   88:ldc1            #222 <String "audio/mpeg">
	//*  52   90:aload_2         
	//*  53   91:invokevirtual   #286 <Method boolean String.equals(Object)>
	//*  54   94:ifne            151
	//*  55   97:ldc1            #190 <String "audio/vnd.dts">
	//*  56   99:aload_2         
	//*  57  100:invokevirtual   #286 <Method boolean String.equals(Object)>
	//*  58  103:ifne            151
	//*  59  106:ldc1            #231 <String "audio/vnd.dts.hd">
	//*  60  108:aload_2         
	//*  61  109:invokevirtual   #286 <Method boolean String.equals(Object)>
	//*  62  112:ifeq            118
	//*  63  115:goto            151
		{
			parsablebytearray.skipBytes(12);
	//   64  118:aload_0         
	//   65  119:bipush          12
	//   66  121:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
			parsablebytearray.skipBytes(1);
	//   67  124:aload_0         
	//   68  125:iconst_1        
	//   69  126:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
			i = parseExpandableClassSize(parsablebytearray);
	//   70  129:aload_0         
	//   71  130:invokestatic    #390 <Method int parseExpandableClassSize(ParsableByteArray)>
	//   72  133:istore_1        
			byte abyte0[] = new byte[i];
	//   73  134:iload_1         
	//   74  135:newarray        byte[]
	//   75  137:astore_3        
			parsablebytearray.readBytes(abyte0, 0, i);
	//   76  138:aload_0         
	//   77  139:aload_3         
	//   78  140:iconst_0        
	//   79  141:iload_1         
	//   80  142:invokevirtual   #270 <Method void ParsableByteArray.readBytes(byte[], int, int)>
			return Pair.create(((Object) (s)), ((Object) (abyte0)));
	//   81  145:aload_2         
	//   82  146:aload_3         
	//   83  147:invokestatic    #341 <Method Pair Pair.create(Object, Object)>
	//   84  150:areturn         
		} else
		{
			return Pair.create(((Object) (s)), ((Object) (null)));
	//   85  151:aload_2         
	//   86  152:aconst_null     
	//   87  153:invokestatic    #341 <Method Pair Pair.create(Object, Object)>
	//   88  156:areturn         
		}
	}

	private static int parseExpandableClassSize(ParsableByteArray parsablebytearray)
	{
		int j = parsablebytearray.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #393 <Method int ParsableByteArray.readUnsignedByte()>
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
	//   13   22:invokevirtual   #393 <Method int ParsableByteArray.readUnsignedByte()>
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
	//    2    3:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
		int i = parsablebytearray.readInt();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//    5   10:istore_1        
		if(i == TYPE_soun)
	//*   6   11:iload_1         
	//*   7   12:getstatic       #55  <Field int TYPE_soun>
	//*   8   15:icmpne          20
			return 1;
	//    9   18:iconst_1        
	//   10   19:ireturn         
		if(i == TYPE_vide)
	//*  11   20:iload_1         
	//*  12   21:getstatic       #51  <Field int TYPE_vide>
	//*  13   24:icmpne          29
			return 2;
	//   14   27:iconst_2        
	//   15   28:ireturn         
		if(i != TYPE_text && i != TYPE_sbtl && i != TYPE_subt && i != TYPE_clcp)
	//*  16   29:iload_1         
	//*  17   30:getstatic       #59  <Field int TYPE_text>
	//*  18   33:icmpeq          71
	//*  19   36:iload_1         
	//*  20   37:getstatic       #63  <Field int TYPE_sbtl>
	//*  21   40:icmpeq          71
	//*  22   43:iload_1         
	//*  23   44:getstatic       #67  <Field int TYPE_subt>
	//*  24   47:icmpeq          71
	//*  25   50:iload_1         
	//*  26   51:getstatic       #71  <Field int TYPE_clcp>
	//*  27   54:icmpne          60
	//*  28   57:goto            71
			return i != TYPE_meta ? -1 : 4;
	//   29   60:iload_1         
	//   30   61:getstatic       #75  <Field int TYPE_meta>
	//   31   64:icmpne          69
	//   32   67:iconst_4        
	//   33   68:ireturn         
	//   34   69:iconst_m1       
	//   35   70:ireturn         
		else
			return 3;
	//   36   71:iconst_3        
	//   37   72:ireturn         
	}

	private static Metadata parseIlst(ParsableByteArray parsablebytearray, int i)
	{
		parsablebytearray.skipBytes(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
		ArrayList arraylist = new ArrayList();
	//    3    6:new             #404 <Class ArrayList>
	//    4    9:dup             
	//    5   10:invokespecial   #405 <Method void ArrayList()>
	//    6   13:astore_2        
		do
		{
			if(parsablebytearray.getPosition() >= i)
				break;
	//    7   14:aload_0         
	//    8   15:invokevirtual   #93  <Method int ParsableByteArray.getPosition()>
	//    9   18:iload_1         
	//   10   19:icmpge          40
			com.google.android.exoplayer2.metadata.Metadata.Entry entry = MetadataUtil.parseIlstElement(parsablebytearray);
	//   11   22:aload_0         
	//   12   23:invokestatic    #411 <Method com.google.android.exoplayer2.metadata.Metadata$Entry MetadataUtil.parseIlstElement(ParsableByteArray)>
	//   13   26:astore_3        
			if(entry != null)
	//*  14   27:aload_3         
	//*  15   28:ifnull          14
				arraylist.add(((Object) (entry)));
	//   16   31:aload_2         
	//   17   32:aload_3         
	//   18   33:invokevirtual   #414 <Method boolean ArrayList.add(Object)>
	//   19   36:pop             
		} while(true);
	//   20   37:goto            14
		if(arraylist.isEmpty())
	//*  21   40:aload_2         
	//*  22   41:invokevirtual   #418 <Method boolean ArrayList.isEmpty()>
	//*  23   44:ifeq            49
			return null;
	//   24   47:aconst_null     
	//   25   48:areturn         
		else
			return new Metadata(((java.util.List) (arraylist)));
	//   26   49:new             #420 <Class Metadata>
	//   27   52:dup             
	//   28   53:aload_2         
	//   29   54:invokespecial   #423 <Method void Metadata(java.util.List)>
	//   30   57:areturn         
	}

	private static Pair parseMdhd(ParsableByteArray parsablebytearray)
	{
		byte byte0 = 8;
	//    0    0:bipush          8
	//    1    2:istore_2        
		parsablebytearray.setPosition(8);
	//    2    3:aload_0         
	//    3    4:bipush          8
	//    4    6:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
		int j = Atom.parseFullAtomVersion(parsablebytearray.readInt());
	//    5    9:aload_0         
	//    6   10:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//    7   13:invokestatic    #364 <Method int Atom.parseFullAtomVersion(int)>
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
	//   18   32:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
		long l = parsablebytearray.readUnsignedInt();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #371 <Method long ParsableByteArray.readUnsignedInt()>
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
	//   30   51:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
		i = parsablebytearray.readUnsignedShort();
	//   31   54:aload_0         
	//   32   55:invokevirtual   #120 <Method int ParsableByteArray.readUnsignedShort()>
	//   33   58:istore_1        
		parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   34   59:new             #427 <Class StringBuilder>
	//   35   62:dup             
	//   36   63:invokespecial   #428 <Method void StringBuilder()>
	//   37   66:astore_0        
		((StringBuilder) (parsablebytearray)).append("");
	//   38   67:aload_0         
	//   39   68:ldc2            #430 <String "">
	//   40   71:invokevirtual   #434 <Method StringBuilder StringBuilder.append(String)>
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
	//   51   87:invokevirtual   #437 <Method StringBuilder StringBuilder.append(char)>
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
	//   62  102:invokevirtual   #437 <Method StringBuilder StringBuilder.append(char)>
	//   63  105:pop             
		((StringBuilder) (parsablebytearray)).append((char)((i & 0x1f) + 96));
	//   64  106:aload_0         
	//   65  107:iload_1         
	//   66  108:bipush          31
	//   67  110:iand            
	//   68  111:bipush          96
	//   69  113:iadd            
	//   70  114:int2char        
	//   71  115:invokevirtual   #437 <Method StringBuilder StringBuilder.append(char)>
	//   72  118:pop             
		return Pair.create(((Object) (Long.valueOf(l))), ((Object) (((StringBuilder) (parsablebytearray)).toString())));
	//   73  119:lload           4
	//   74  121:invokestatic    #442 <Method Long Long.valueOf(long)>
	//   75  124:aload_0         
	//   76  125:invokevirtual   #445 <Method String StringBuilder.toString()>
	//   77  128:invokestatic    #341 <Method Pair Pair.create(Object, Object)>
	//   78  131:areturn         
	}

	private static Metadata parseMetaAtom(ParsableByteArray parsablebytearray, int i)
	{
		parsablebytearray.skipBytes(12);
	//    0    0:aload_0         
	//    1    1:bipush          12
	//    2    3:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
		int k;
		for(; parsablebytearray.getPosition() < i; parsablebytearray.skipBytes(k - 8))
	//*   3    6:aload_0         
	//*   4    7:invokevirtual   #93  <Method int ParsableByteArray.getPosition()>
	//*   5   10:iload_1         
	//*   6   11:icmpge          58
		{
			int j = parsablebytearray.getPosition();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #93  <Method int ParsableByteArray.getPosition()>
	//    9   18:istore_2        
			k = parsablebytearray.readInt();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//   12   23:istore_3        
			if(parsablebytearray.readInt() == Atom.TYPE_ilst)
	//*  13   24:aload_0         
	//*  14   25:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//*  15   28:getstatic       #450 <Field int Atom.TYPE_ilst>
	//*  16   31:icmpne          47
			{
				parsablebytearray.setPosition(j);
	//   17   34:aload_0         
	//   18   35:iload_2         
	//   19   36:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
				return parseIlst(parsablebytearray, j + k);
	//   20   39:aload_0         
	//   21   40:iload_2         
	//   22   41:iload_3         
	//   23   42:iadd            
	//   24   43:invokestatic    #452 <Method Metadata parseIlst(ParsableByteArray, int)>
	//   25   46:areturn         
			}
		}

	//   26   47:aload_0         
	//   27   48:iload_3         
	//   28   49:bipush          8
	//   29   51:isub            
	//   30   52:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
	//*  31   55:goto            6
		return null;
	//   32   58:aconst_null     
	//   33   59:areturn         
	}

	private static long parseMvhd(ParsableByteArray parsablebytearray)
	{
		byte byte0 = 8;
	//    0    0:bipush          8
	//    1    2:istore_1        
		parsablebytearray.setPosition(8);
	//    2    3:aload_0         
	//    3    4:bipush          8
	//    4    6:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
		if(Atom.parseFullAtomVersion(parsablebytearray.readInt()) != 0)
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//*   7   13:invokestatic    #364 <Method int Atom.parseFullAtomVersion(int)>
	//*   8   16:ifne            22
	//*   9   19:goto            25
			byte0 = 16;
	//   10   22:bipush          16
	//   11   24:istore_1        
		parsablebytearray.skipBytes(((int) (byte0)));
	//   12   25:aload_0         
	//   13   26:iload_1         
	//   14   27:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
		return parsablebytearray.readUnsignedInt();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #371 <Method long ParsableByteArray.readUnsignedInt()>
	//   17   34:lreturn         
	}

	private static float parsePaspFromParent(ParsableByteArray parsablebytearray, int i)
	{
		parsablebytearray.setPosition(i + 8);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          8
	//    3    4:iadd            
	//    4    5:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
		i = parsablebytearray.readUnsignedIntToInt();
	//    5    8:aload_0         
	//    6    9:invokevirtual   #136 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//    7   12:istore_1        
		int j = parsablebytearray.readUnsignedIntToInt();
	//    8   13:aload_0         
	//    9   14:invokevirtual   #136 <Method int ParsableByteArray.readUnsignedIntToInt()>
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
	//   11   14:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
			l = parsablebytearray.readInt();
	//   12   17:aload_0         
	//   13   18:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//   14   21:istore          4
			if(parsablebytearray.readInt() == Atom.TYPE_proj)
	//*  15   23:aload_0         
	//*  16   24:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//*  17   27:getstatic       #461 <Field int Atom.TYPE_proj>
	//*  18   30:icmpne          46
				return Arrays.copyOfRange(parsablebytearray.data, k, l + k);
	//   19   33:aload_0         
	//   20   34:getfield        #463 <Field byte[] ParsableByteArray.data>
	//   21   37:iload_3         
	//   22   38:iload           4
	//   23   40:iload_3         
	//   24   41:iadd            
	//   25   42:invokestatic    #469 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
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

	private static Pair parseSampleEntryEncryptionData(ParsableByteArray parsablebytearray, int i, int j)
	{
		int l;
		for(int k = parsablebytearray.getPosition(); k - i < j; k += l)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #93  <Method int ParsableByteArray.getPosition()>
	//*   2    4:istore_3        
	//*   3    5:iload_3         
	//*   4    6:iload_1         
	//*   5    7:isub            
	//*   6    8:iload_2         
	//*   7    9:icmpge          79
		{
			parsablebytearray.setPosition(k);
	//    8   12:aload_0         
	//    9   13:iload_3         
	//   10   14:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
			l = parsablebytearray.readInt();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
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
	//   22   39:ldc1            #102 <String "childAtomSize should be positive">
	//   23   41:invokestatic    #108 <Method void Assertions.checkArgument(boolean, Object)>
			if(parsablebytearray.readInt() != Atom.TYPE_sinf)
				continue;
	//   24   44:aload_0         
	//   25   45:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//   26   48:getstatic       #472 <Field int Atom.TYPE_sinf>
	//   27   51:icmpne          71
			Pair pair = parseCommonEncryptionSinfFromParent(parsablebytearray, k, l);
	//   28   54:aload_0         
	//   29   55:iload_3         
	//   30   56:iload           4
	//   31   58:invokestatic    #474 <Method Pair parseCommonEncryptionSinfFromParent(ParsableByteArray, int, int)>
	//   32   61:astore          6
			if(pair != null)
	//*  33   63:aload           6
	//*  34   65:ifnull          71
				return pair;
	//   35   68:aload           6
	//   36   70:areturn         
		}

	//   37   71:iload_3         
	//   38   72:iload           4
	//   39   74:iadd            
	//   40   75:istore_3        
	//*  41   76:goto            5
		return null;
	//   42   79:aconst_null     
	//   43   80:areturn         
	}

	private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsablebytearray, int i, int j, String s)
	{
		int k = i + 8;
	//    0    0:iload_1         
	//    1    1:bipush          8
	//    2    3:iadd            
	//    3    4:istore          4
		do
		{
			Object obj = null;
	//    4    6:aconst_null     
	//    5    7:astore          8
			if(k - i < j)
	//*   6    9:iload           4
	//*   7   11:iload_1         
	//*   8   12:isub            
	//*   9   13:iload_2         
	//*  10   14:icmpge          193
			{
				parsablebytearray.setPosition(k);
	//   11   17:aload_0         
	//   12   18:iload           4
	//   13   20:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
				int l = parsablebytearray.readInt();
	//   14   23:aload_0         
	//   15   24:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//   16   27:istore          5
				if(parsablebytearray.readInt() == Atom.TYPE_tenc)
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//*  19   33:getstatic       #477 <Field int Atom.TYPE_tenc>
	//*  20   36:icmpne          183
				{
					i = Atom.parseFullAtomVersion(parsablebytearray.readInt());
	//   21   39:aload_0         
	//   22   40:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//   23   43:invokestatic    #364 <Method int Atom.parseFullAtomVersion(int)>
	//   24   46:istore_1        
					parsablebytearray.skipBytes(1);
	//   25   47:aload_0         
	//   26   48:iconst_1        
	//   27   49:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
					if(i == 0)
	//*  28   52:iload_1         
	//*  29   53:ifne            68
					{
						parsablebytearray.skipBytes(1);
	//   30   56:aload_0         
	//   31   57:iconst_1        
	//   32   58:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
						i = 0;
	//   33   61:iconst_0        
	//   34   62:istore_1        
						j = i;
	//   35   63:iload_1         
	//   36   64:istore_2        
					} else
	//*  37   65:goto            86
					{
						i = parsablebytearray.readUnsignedByte();
	//   38   68:aload_0         
	//   39   69:invokevirtual   #393 <Method int ParsableByteArray.readUnsignedByte()>
	//   40   72:istore_1        
						j = i & 0xf;
	//   41   73:iload_1         
	//   42   74:bipush          15
	//   43   76:iand            
	//   44   77:istore_2        
						i = (i & 0xf0) >> 4;
	//   45   78:iload_1         
	//   46   79:sipush          240
	//   47   82:iand            
	//   48   83:iconst_4        
	//   49   84:ishr            
	//   50   85:istore_1        
					}
					boolean flag;
					if(parsablebytearray.readUnsignedByte() == 1)
	//*  51   86:aload_0         
	//*  52   87:invokevirtual   #393 <Method int ParsableByteArray.readUnsignedByte()>
	//*  53   90:iconst_1        
	//*  54   91:icmpne          100
						flag = true;
	//   55   94:iconst_1        
	//   56   95:istore          6
					else
	//*  57   97:goto            103
						flag = false;
	//   58  100:iconst_0        
	//   59  101:istore          6
					k = parsablebytearray.readUnsignedByte();
	//   60  103:aload_0         
	//   61  104:invokevirtual   #393 <Method int ParsableByteArray.readUnsignedByte()>
	//   62  107:istore          4
					byte abyte1[] = new byte[16];
	//   63  109:bipush          16
	//   64  111:newarray        byte[]
	//   65  113:astore          9
					parsablebytearray.readBytes(abyte1, 0, abyte1.length);
	//   66  115:aload_0         
	//   67  116:aload           9
	//   68  118:iconst_0        
	//   69  119:aload           9
	//   70  121:arraylength     
	//   71  122:invokevirtual   #270 <Method void ParsableByteArray.readBytes(byte[], int, int)>
					byte abyte0[] = ((byte []) (obj));
	//   72  125:aload           8
	//   73  127:astore          7
					if(flag)
	//*  74  129:iload           6
	//*  75  131:ifeq            164
					{
						abyte0 = ((byte []) (obj));
	//   76  134:aload           8
	//   77  136:astore          7
						if(k == 0)
	//*  78  138:iload           4
	//*  79  140:ifne            164
						{
							l = parsablebytearray.readUnsignedByte();
	//   80  143:aload_0         
	//   81  144:invokevirtual   #393 <Method int ParsableByteArray.readUnsignedByte()>
	//   82  147:istore          5
							abyte0 = new byte[l];
	//   83  149:iload           5
	//   84  151:newarray        byte[]
	//   85  153:astore          7
							parsablebytearray.readBytes(abyte0, 0, l);
	//   86  155:aload_0         
	//   87  156:aload           7
	//   88  158:iconst_0        
	//   89  159:iload           5
	//   90  161:invokevirtual   #270 <Method void ParsableByteArray.readBytes(byte[], int, int)>
						}
					}
					return new TrackEncryptionBox(flag, s, k, abyte1, i, j, abyte0);
	//   91  164:new             #162 <Class TrackEncryptionBox>
	//   92  167:dup             
	//   93  168:iload           6
	//   94  170:aload_3         
	//   95  171:iload           4
	//   96  173:aload           9
	//   97  175:iload_1         
	//   98  176:iload_2         
	//   99  177:aload           7
	//  100  179:invokespecial   #480 <Method void TrackEncryptionBox(boolean, String, int, byte[], int, int, byte[])>
	//  101  182:areturn         
				}
				k += l;
	//  102  183:iload           4
	//  103  185:iload           5
	//  104  187:iadd            
	//  105  188:istore          4
			} else
	//* 106  190:goto            6
			{
				return null;
	//  107  193:aconst_null     
	//  108  194:areturn         
			}
		} while(true);
	}

	public static TrackSampleTable parseStbl(Track track, Atom.ContainerAtom containeratom, GaplessInfoHolder gaplessinfoholder)
		throws ParserException
	{
		int i;
		int j;
		long l7;
		long l10;
		int ai[];
		int ai1[];
		long al[];
label0:
		{
			int i2;
			int k5;
			Object obj2;
			ChunkIterator chunkiterator;
label1:
			{
				obj2 = ((Object) (track));
	//    0    0:aload_0         
	//    1    1:astore          33
				Object obj = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_stsz)));
	//    2    3:aload_1         
	//    3    4:getstatic       #485 <Field int Atom.TYPE_stsz>
	//    4    7:invokevirtual   #354 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//    5   10:astore          30
				if(obj != null)
	//*   6   12:aload           30
	//*   7   14:ifnull          31
				{
					obj = ((Object) (new StszSampleSizeBox(((Atom.LeafAtom) (obj)))));
	//    8   17:new             #15  <Class AtomParsers$StszSampleSizeBox>
	//    9   20:dup             
	//   10   21:aload           30
	//   11   23:invokespecial   #488 <Method void AtomParsers$StszSampleSizeBox(Atom$LeafAtom)>
	//   12   26:astore          30
				} else
	//*  13   28:goto            67
				{
					obj = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_stz2)));
	//   14   31:aload_1         
	//   15   32:getstatic       #491 <Field int Atom.TYPE_stz2>
	//   16   35:invokevirtual   #354 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   17   38:astore          30
					if(obj == null)
	//*  18   40:aload           30
	//*  19   42:ifnonnull       56
						throw new ParserException("Track has no sample table size information");
	//   20   45:new             #117 <Class ParserException>
	//   21   48:dup             
	//   22   49:ldc2            #493 <String "Track has no sample table size information">
	//   23   52:invokespecial   #494 <Method void ParserException(String)>
	//   24   55:athrow          
					obj = ((Object) (new Stz2SampleSizeBox(((Atom.LeafAtom) (obj)))));
	//   25   56:new             #18  <Class AtomParsers$Stz2SampleSizeBox>
	//   26   59:dup             
	//   27   60:aload           30
	//   28   62:invokespecial   #495 <Method void AtomParsers$Stz2SampleSizeBox(Atom$LeafAtom)>
	//   29   65:astore          30
				}
				i2 = ((SampleSizeBox) (obj)).getSampleCount();
	//   30   67:aload           30
	//   31   69:invokeinterface #498 <Method int AtomParsers$SampleSizeBox.getSampleCount()>
	//   32   74:istore          7
				if(i2 == 0)
	//*  33   76:iload           7
	//*  34   78:ifne            107
					return new TrackSampleTable(((Track) (obj2)), new long[0], new int[0], 0, new long[0], new int[0], 0x1L);
	//   35   81:new             #500 <Class TrackSampleTable>
	//   36   84:dup             
	//   37   85:aload           33
	//   38   87:iconst_0        
	//   39   88:newarray        long[]
	//   40   90:iconst_0        
	//   41   91:newarray        int[]
	//   42   93:iconst_0        
	//   43   94:iconst_0        
	//   44   95:newarray        long[]
	//   45   97:iconst_0        
	//   46   98:newarray        int[]
	//   47  100:ldc2w           #501 <Long 0x1L>
	//   48  103:invokespecial   #505 <Method void TrackSampleTable(Track, long[], int[], int, long[], int[], long)>
	//   49  106:areturn         
				Object obj1 = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_stco)));
	//   50  107:aload_1         
	//   51  108:getstatic       #508 <Field int Atom.TYPE_stco>
	//   52  111:invokevirtual   #354 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   53  114:astore          31
				boolean flag2;
				if(obj1 == null)
	//*  54  116:aload           31
	//*  55  118:ifnonnull       136
				{
					obj1 = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_co64)));
	//   56  121:aload_1         
	//   57  122:getstatic       #511 <Field int Atom.TYPE_co64>
	//   58  125:invokevirtual   #354 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   59  128:astore          31
					flag2 = true;
	//   60  130:iconst_1        
	//   61  131:istore          19
				} else
	//*  62  133:goto            139
				{
					flag2 = false;
	//   63  136:iconst_0        
	//   64  137:istore          19
				}
				ParsableByteArray parsablebytearray2 = ((Atom.LeafAtom) (obj1)).data;
	//   65  139:aload           31
	//   66  141:getfield        #360 <Field ParsableByteArray Atom$LeafAtom.data>
	//   67  144:astore          35
				ParsableByteArray parsablebytearray3 = containeratom.getLeafAtomOfType(Atom.TYPE_stsc).data;
	//   68  146:aload_1         
	//   69  147:getstatic       #514 <Field int Atom.TYPE_stsc>
	//   70  150:invokevirtual   #354 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   71  153:getfield        #360 <Field ParsableByteArray Atom$LeafAtom.data>
	//   72  156:astore          36
				ParsableByteArray parsablebytearray1 = containeratom.getLeafAtomOfType(Atom.TYPE_stts).data;
	//   73  158:aload_1         
	//   74  159:getstatic       #517 <Field int Atom.TYPE_stts>
	//   75  162:invokevirtual   #354 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   76  165:getfield        #360 <Field ParsableByteArray Atom$LeafAtom.data>
	//   77  168:astore          34
				obj1 = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_stss)));
	//   78  170:aload_1         
	//   79  171:getstatic       #520 <Field int Atom.TYPE_stss>
	//   80  174:invokevirtual   #354 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   81  177:astore          31
				if(obj1 != null)
	//*  82  179:aload           31
	//*  83  181:ifnull          194
					obj1 = ((Object) (((Atom.LeafAtom) (obj1)).data));
	//   84  184:aload           31
	//   85  186:getfield        #360 <Field ParsableByteArray Atom$LeafAtom.data>
	//   86  189:astore          31
				else
	//*  87  191:goto            197
					obj1 = null;
	//   88  194:aconst_null     
	//   89  195:astore          31
				containeratom = ((Atom.ContainerAtom) (containeratom.getLeafAtomOfType(Atom.TYPE_ctts)));
	//   90  197:aload_1         
	//   91  198:getstatic       #523 <Field int Atom.TYPE_ctts>
	//   92  201:invokevirtual   #354 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   93  204:astore_1        
				ParsableByteArray parsablebytearray;
				if(containeratom != null)
	//*  94  205:aload_1         
	//*  95  206:ifnull          218
					parsablebytearray = ((Atom.LeafAtom) (containeratom)).data;
	//   96  209:aload_1         
	//   97  210:getfield        #360 <Field ParsableByteArray Atom$LeafAtom.data>
	//   98  213:astore          32
				else
	//*  99  215:goto            221
					parsablebytearray = null;
	//  100  218:aconst_null     
	//  101  219:astore          32
				chunkiterator = new ChunkIterator(parsablebytearray3, parsablebytearray2, flag2);
	//  102  221:new             #6   <Class AtomParsers$ChunkIterator>
	//  103  224:dup             
	//  104  225:aload           36
	//  105  227:aload           35
	//  106  229:iload           19
	//  107  231:invokespecial   #526 <Method void AtomParsers$ChunkIterator(ParsableByteArray, ParsableByteArray, boolean)>
	//  108  234:astore          38
				parsablebytearray1.setPosition(12);
	//  109  236:aload           34
	//  110  238:bipush          12
	//  111  240:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
				int i3 = parsablebytearray1.readUnsignedIntToInt() - 1;
	//  112  243:aload           34
	//  113  245:invokevirtual   #136 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  114  248:iconst_1        
	//  115  249:isub            
	//  116  250:istore          8
				int i6 = parsablebytearray1.readUnsignedIntToInt();
	//  117  252:aload           34
	//  118  254:invokevirtual   #136 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  119  257:istore          15
				k5 = parsablebytearray1.readUnsignedIntToInt();
	//  120  259:aload           34
	//  121  261:invokevirtual   #136 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  122  264:istore          13
				if(parsablebytearray != null)
	//* 123  266:aload           32
	//* 124  268:ifnull          287
				{
					parsablebytearray.setPosition(12);
	//  125  271:aload           32
	//  126  273:bipush          12
	//  127  275:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
					i = parsablebytearray.readUnsignedIntToInt();
	//  128  278:aload           32
	//  129  280:invokevirtual   #136 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  130  283:istore_3        
				} else
	//* 131  284:goto            289
				{
					i = 0;
	//  132  287:iconst_0        
	//  133  288:istore_3        
				}
				int k = -1;
	//  134  289:iconst_m1       
	//  135  290:istore          5
				if(obj1 != null)
	//* 136  292:aload           31
	//* 137  294:ifnull          334
				{
					((ParsableByteArray) (obj1)).setPosition(12);
	//  138  297:aload           31
	//  139  299:bipush          12
	//  140  301:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
					j = ((ParsableByteArray) (obj1)).readUnsignedIntToInt();
	//  141  304:aload           31
	//  142  306:invokevirtual   #136 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  143  309:istore          4
					if(j > 0)
	//* 144  311:iload           4
	//* 145  313:ifle            328
						k = ((ParsableByteArray) (obj1)).readUnsignedIntToInt() - 1;
	//  146  316:aload           31
	//  147  318:invokevirtual   #136 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  148  321:iconst_1        
	//  149  322:isub            
	//  150  323:istore          5
					else
	//* 151  325:goto            337
						obj1 = null;
	//  152  328:aconst_null     
	//  153  329:astore          31
				} else
	//* 154  331:goto            337
				{
					j = 0;
	//  155  334:iconst_0        
	//  156  335:istore          4
				}
				boolean flag;
				if(((SampleSizeBox) (obj)).isFixedSampleSize() && "audio/raw".equals(((Object) (((Track) (obj2)).format.sampleMimeType))) && i3 == 0 && i == 0 && j == 0)
	//* 157  337:aload           30
	//* 158  339:invokeinterface #529 <Method boolean AtomParsers$SampleSizeBox.isFixedSampleSize()>
	//* 159  344:ifeq            383
	//* 160  347:ldc1            #229 <String "audio/raw">
	//* 161  349:aload           33
	//* 162  351:getfield        #532 <Field Format Track.format>
	//* 163  354:getfield        #535 <Field String Format.sampleMimeType>
	//* 164  357:invokevirtual   #286 <Method boolean String.equals(Object)>
	//* 165  360:ifeq            383
	//* 166  363:iload           8
	//* 167  365:ifne            383
	//* 168  368:iload_3         
	//* 169  369:ifne            383
	//* 170  372:iload           4
	//* 171  374:ifne            383
					flag = true;
	//  172  377:iconst_1        
	//  173  378:istore          6
				else
	//* 174  380:goto            386
					flag = false;
	//  175  383:iconst_0        
	//  176  384:istore          6
				l10 = 0L;
	//  177  386:lconst_0        
	//  178  387:lstore          24
				if(flag)
					break label1;
	//  179  389:iload           6
	//  180  391:ifne            1056
				long al2[] = new long[i2];
	//  181  394:iload           7
	//  182  396:newarray        long[]
	//  183  398:astore          37
				int ai3[] = new int[i2];
	//  184  400:iload           7
	//  185  402:newarray        int[]
	//  186  404:astore          35
				long al1[] = new long[i2];
	//  187  406:iload           7
	//  188  408:newarray        long[]
	//  189  410:astore          36
				obj2 = ((Object) (new int[i2]));
	//  190  412:iload           7
	//  191  414:newarray        int[]
	//  192  416:astore          33
				int i1 = i3;
	//  193  418:iload           8
	//  194  420:istore          6
				containeratom = ((Atom.ContainerAtom) (parsablebytearray1));
	//  195  422:aload           34
	//  196  424:astore_1        
				int k3 = k;
	//  197  425:iload           5
	//  198  427:istore          9
				l7 = 0L;
	//  199  429:lconst_0        
	//  200  430:lstore          20
				boolean flag1 = false;
	//  201  432:iconst_0        
	//  202  433:istore          10
				int l5 = 0;
	//  203  435:iconst_0        
	//  204  436:istore          14
				int l4 = 0;
	//  205  438:iconst_0        
	//  206  439:istore          11
				i3 = 0;
	//  207  441:iconst_0        
	//  208  442:istore          8
				int j5 = 0;
	//  209  444:iconst_0        
	//  210  445:istore          12
				k = i;
	//  211  447:iload_3         
	//  212  448:istore          5
				long l8 = l7;
	//  213  450:lload           20
	//  214  452:lstore          22
				i = i1;
	//  215  454:iload           6
	//  216  456:istore_3        
				i1 = j5;
	//  217  457:iload           12
	//  218  459:istore          6
				j5 = j;
	//  219  461:iload           4
	//  220  463:istore          12
				j = k3;
	//  221  465:iload           9
	//  222  467:istore          4
				k3 = ((int) (flag1));
	//  223  469:iload           10
	//  224  471:istore          9
				while(l5 < i2) 
	//* 225  473:iload           14
	//* 226  475:iload           7
	//* 227  477:icmpge          843
				{
					int j4;
					int j6;
					int k6;
					int l6;
					long l12;
label2:
					{
						k6 = i3;
	//  228  480:iload           8
	//  229  482:istore          17
						j4 = k5;
	//  230  484:iload           13
	//  231  486:istore          10
						for(; k6 == 0; k6 = chunkiterator.numSamples)
	//* 232  488:iload           17
	//* 233  490:ifne            518
						{
							Assertions.checkState(chunkiterator.moveNext());
	//  234  493:aload           38
	//  235  495:invokevirtual   #538 <Method boolean AtomParsers$ChunkIterator.moveNext()>
	//  236  498:invokestatic    #542 <Method void Assertions.checkState(boolean)>
							l7 = chunkiterator.offset;
	//  237  501:aload           38
	//  238  503:getfield        #546 <Field long AtomParsers$ChunkIterator.offset>
	//  239  506:lstore          20
						}

	//  240  508:aload           38
	//  241  510:getfield        #549 <Field int AtomParsers$ChunkIterator.numSamples>
	//  242  513:istore          17
	//* 243  515:goto            488
						l6 = l4;
	//  244  518:iload           11
	//  245  520:istore          18
						j6 = k;
	//  246  522:iload           5
	//  247  524:istore          16
						i3 = i1;
	//  248  526:iload           6
	//  249  528:istore          8
						if(parsablebytearray != null)
	//* 250  530:aload           32
	//* 251  532:ifnull          582
						{
							for(; l4 == 0 && k > 0; k--)
	//* 252  535:iload           11
	//* 253  537:ifne            568
	//* 254  540:iload           5
	//* 255  542:ifle            568
							{
								l4 = parsablebytearray.readUnsignedIntToInt();
	//  256  545:aload           32
	//  257  547:invokevirtual   #136 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  258  550:istore          11
								i1 = parsablebytearray.readInt();
	//  259  552:aload           32
	//  260  554:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//  261  557:istore          6
							}

	//  262  559:iload           5
	//  263  561:iconst_1        
	//  264  562:isub            
	//  265  563:istore          5
	//* 266  565:goto            535
							l6 = l4 - 1;
	//  267  568:iload           11
	//  268  570:iconst_1        
	//  269  571:isub            
	//  270  572:istore          18
							i3 = i1;
	//  271  574:iload           6
	//  272  576:istore          8
							j6 = k;
	//  273  578:iload           5
	//  274  580:istore          16
						}
						al2[l5] = l7;
	//  275  582:aload           37
	//  276  584:iload           14
	//  277  586:lload           20
	//  278  588:lastore         
						ai3[l5] = ((SampleSizeBox) (obj)).readNextSampleSize();
	//  279  589:aload           35
	//  280  591:iload           14
	//  281  593:aload           30
	//  282  595:invokeinterface #552 <Method int AtomParsers$SampleSizeBox.readNextSampleSize()>
	//  283  600:iastore         
						l4 = k3;
	//  284  601:iload           9
	//  285  603:istore          11
						if(ai3[l5] > k3)
	//* 286  605:aload           35
	//* 287  607:iload           14
	//* 288  609:iaload          
	//* 289  610:iload           9
	//* 290  612:icmple          622
							l4 = ai3[l5];
	//  291  615:aload           35
	//  292  617:iload           14
	//  293  619:iaload          
	//  294  620:istore          11
						al1[l5] = l8 + (long)i3;
	//  295  622:aload           36
	//  296  624:iload           14
	//  297  626:lload           22
	//  298  628:iload           8
	//  299  630:i2l             
	//  300  631:ladd            
	//  301  632:lastore         
						if(obj1 == null)
	//* 302  633:aload           31
	//* 303  635:ifnonnull       644
							k = 1;
	//  304  638:iconst_1        
	//  305  639:istore          5
						else
	//* 306  641:goto            647
							k = 0;
	//  307  644:iconst_0        
	//  308  645:istore          5
						obj2[l5] = k;
	//  309  647:aload           33
	//  310  649:iload           14
	//  311  651:iload           5
	//  312  653:iastore         
						if(l5 == j)
	//* 313  654:iload           14
	//* 314  656:iload           4
	//* 315  658:icmpne          698
						{
							obj2[l5] = 1;
	//  316  661:aload           33
	//  317  663:iload           14
	//  318  665:iconst_1        
	//  319  666:iastore         
							i1 = j5 - 1;
	//  320  667:iload           12
	//  321  669:iconst_1        
	//  322  670:isub            
	//  323  671:istore          6
							if(i1 > 0)
	//* 324  673:iload           6
	//* 325  675:ifle            687
								j = ((ParsableByteArray) (obj1)).readUnsignedIntToInt() - 1;
	//  326  678:aload           31
	//  327  680:invokevirtual   #136 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  328  683:iconst_1        
	//  329  684:isub            
	//  330  685:istore          4
							k = j;
	//  331  687:iload           4
	//  332  689:istore          5
							j = i1;
	//  333  691:iload           6
	//  334  693:istore          4
						} else
	//* 335  695:goto            706
						{
							k = j;
	//  336  698:iload           4
	//  337  700:istore          5
							j = j5;
	//  338  702:iload           12
	//  339  704:istore          4
						}
						l12 = j4;
	//  340  706:iload           10
	//  341  708:i2l             
	//  342  709:lstore          26
						k3 = i6 - 1;
	//  343  711:iload           15
	//  344  713:iconst_1        
	//  345  714:isub            
	//  346  715:istore          9
						if(k3 == 0)
	//* 347  717:iload           9
	//* 348  719:ifne            762
						{
							i1 = i;
	//  349  722:iload_3         
	//  350  723:istore          6
							if(i1 > 0)
	//* 351  725:iload           6
	//* 352  727:ifle            759
							{
								Atom.ContainerAtom containeratom1 = containeratom;
	//  353  730:aload_1         
	//  354  731:astore          34
								j4 = ((ParsableByteArray) (containeratom1)).readUnsignedIntToInt();
	//  355  733:aload           34
	//  356  735:invokevirtual   #136 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  357  738:istore          10
								k3 = ((ParsableByteArray) (containeratom1)).readInt();
	//  358  740:aload           34
	//  359  742:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//  360  745:istore          9
								i = i1 - 1;
	//  361  747:iload           6
	//  362  749:iconst_1        
	//  363  750:isub            
	//  364  751:istore_3        
								i1 = k3;
	//  365  752:iload           9
	//  366  754:istore          6
								break label2;
	//  367  756:goto            770
							}
						}
	//* 368  759:goto            762
						i1 = j4;
	//  369  762:iload           10
	//  370  764:istore          6
						j4 = k3;
	//  371  766:iload           9
	//  372  768:istore          10
					}
					long l15 = ai3[l5];
	//  373  770:aload           35
	//  374  772:iload           14
	//  375  774:iaload          
	//  376  775:i2l             
	//  377  776:lstore          28
					i6 = k6 - 1;
	//  378  778:iload           17
	//  379  780:iconst_1        
	//  380  781:isub            
	//  381  782:istore          15
					l5++;
	//  382  784:iload           14
	//  383  786:iconst_1        
	//  384  787:iadd            
	//  385  788:istore          14
					j5 = j;
	//  386  790:iload           4
	//  387  792:istore          12
					k5 = i1;
	//  388  794:iload           6
	//  389  796:istore          13
					l7 += l15;
	//  390  798:lload           20
	//  391  800:lload           28
	//  392  802:ladd            
	//  393  803:lstore          20
					l8 += l12;
	//  394  805:lload           22
	//  395  807:lload           26
	//  396  809:ladd            
	//  397  810:lstore          22
					i1 = i3;
	//  398  812:iload           8
	//  399  814:istore          6
					k3 = l4;
	//  400  816:iload           11
	//  401  818:istore          9
					j = k;
	//  402  820:iload           5
	//  403  822:istore          4
					l4 = l6;
	//  404  824:iload           18
	//  405  826:istore          11
					k = j6;
	//  406  828:iload           16
	//  407  830:istore          5
					i3 = i6;
	//  408  832:iload           15
	//  409  834:istore          8
					i6 = j4;
	//  410  836:iload           10
	//  411  838:istore          15
				}
	//* 412  840:goto            473
				j = i2;
	//  413  843:iload           7
	//  414  845:istore          4
				l7 = l8 + (long)i1;
	//  415  847:lload           22
	//  416  849:iload           6
	//  417  851:i2l             
	//  418  852:ladd            
	//  419  853:lstore          20
				if(l4 == 0)
	//* 420  855:iload           11
	//* 421  857:ifne            866
					flag2 = true;
	//  422  860:iconst_1        
	//  423  861:istore          19
				else
	//* 424  863:goto            869
					flag2 = false;
	//  425  866:iconst_0        
	//  426  867:istore          19
				Assertions.checkArgument(flag2);
	//  427  869:iload           19
	//  428  871:invokestatic    #554 <Method void Assertions.checkArgument(boolean)>
				for(; k > 0; k--)
	//* 429  874:iload           5
	//* 430  876:ifle            916
				{
					boolean flag3;
					if(parsablebytearray.readUnsignedIntToInt() == 0)
	//* 431  879:aload           32
	//* 432  881:invokevirtual   #136 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//* 433  884:ifne            893
						flag3 = true;
	//  434  887:iconst_1        
	//  435  888:istore          19
					else
	//* 436  890:goto            896
						flag3 = false;
	//  437  893:iconst_0        
	//  438  894:istore          19
					Assertions.checkArgument(flag3);
	//  439  896:iload           19
	//  440  898:invokestatic    #554 <Method void Assertions.checkArgument(boolean)>
					parsablebytearray.readInt();
	//  441  901:aload           32
	//  442  903:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//  443  906:pop             
				}

	//  444  907:iload           5
	//  445  909:iconst_1        
	//  446  910:isub            
	//  447  911:istore          5
	//* 448  913:goto            874
				if(j5 != 0 || i6 != 0 || i3 != 0 || i != 0)
	//* 449  916:iload           12
	//* 450  918:ifne            941
	//* 451  921:iload           15
	//* 452  923:ifne            941
	//* 453  926:iload           8
	//* 454  928:ifne            941
	//* 455  931:iload_3         
	//* 456  932:ifeq            938
	//* 457  935:goto            941
	//* 458  938:goto            1035
				{
					containeratom = ((Atom.ContainerAtom) (new StringBuilder()));
	//  459  941:new             #427 <Class StringBuilder>
	//  460  944:dup             
	//  461  945:invokespecial   #428 <Method void StringBuilder()>
	//  462  948:astore_1        
					((StringBuilder) (containeratom)).append("Inconsistent stbl box for track ");
	//  463  949:aload_1         
	//  464  950:ldc2            #556 <String "Inconsistent stbl box for track ">
	//  465  953:invokevirtual   #434 <Method StringBuilder StringBuilder.append(String)>
	//  466  956:pop             
					((StringBuilder) (containeratom)).append(track.id);
	//  467  957:aload_1         
	//  468  958:aload_0         
	//  469  959:getfield        #559 <Field int Track.id>
	//  470  962:invokevirtual   #562 <Method StringBuilder StringBuilder.append(int)>
	//  471  965:pop             
					((StringBuilder) (containeratom)).append(": remainingSynchronizationSamples ");
	//  472  966:aload_1         
	//  473  967:ldc2            #564 <String ": remainingSynchronizationSamples ">
	//  474  970:invokevirtual   #434 <Method StringBuilder StringBuilder.append(String)>
	//  475  973:pop             
					((StringBuilder) (containeratom)).append(j5);
	//  476  974:aload_1         
	//  477  975:iload           12
	//  478  977:invokevirtual   #562 <Method StringBuilder StringBuilder.append(int)>
	//  479  980:pop             
					((StringBuilder) (containeratom)).append(", remainingSamplesAtTimestampDelta ");
	//  480  981:aload_1         
	//  481  982:ldc2            #566 <String ", remainingSamplesAtTimestampDelta ">
	//  482  985:invokevirtual   #434 <Method StringBuilder StringBuilder.append(String)>
	//  483  988:pop             
					((StringBuilder) (containeratom)).append(i6);
	//  484  989:aload_1         
	//  485  990:iload           15
	//  486  992:invokevirtual   #562 <Method StringBuilder StringBuilder.append(int)>
	//  487  995:pop             
					((StringBuilder) (containeratom)).append(", remainingSamplesInChunk ");
	//  488  996:aload_1         
	//  489  997:ldc2            #568 <String ", remainingSamplesInChunk ">
	//  490 1000:invokevirtual   #434 <Method StringBuilder StringBuilder.append(String)>
	//  491 1003:pop             
					((StringBuilder) (containeratom)).append(i3);
	//  492 1004:aload_1         
	//  493 1005:iload           8
	//  494 1007:invokevirtual   #562 <Method StringBuilder StringBuilder.append(int)>
	//  495 1010:pop             
					((StringBuilder) (containeratom)).append(", remainingTimestampDeltaChanges ");
	//  496 1011:aload_1         
	//  497 1012:ldc2            #570 <String ", remainingTimestampDeltaChanges ">
	//  498 1015:invokevirtual   #434 <Method StringBuilder StringBuilder.append(String)>
	//  499 1018:pop             
					((StringBuilder) (containeratom)).append(i);
	//  500 1019:aload_1         
	//  501 1020:iload_3         
	//  502 1021:invokevirtual   #562 <Method StringBuilder StringBuilder.append(int)>
	//  503 1024:pop             
					Log.w("AtomParsers", ((StringBuilder) (containeratom)).toString());
	//  504 1025:ldc1            #32  <String "AtomParsers">
	//  505 1027:aload_1         
	//  506 1028:invokevirtual   #445 <Method String StringBuilder.toString()>
	//  507 1031:invokestatic    #576 <Method int Log.w(String, String)>
	//  508 1034:pop             
				}
				i = k3;
	//  509 1035:iload           9
	//  510 1037:istore_3        
				ai = ((int []) (al2));
	//  511 1038:aload           37
	//  512 1040:astore          30
				al = al1;
	//  513 1042:aload           36
	//  514 1044:astore          32
				ai1 = ai3;
	//  515 1046:aload           35
	//  516 1048:astore          31
				containeratom = ((Atom.ContainerAtom) (obj2));
	//  517 1050:aload           33
	//  518 1052:astore_1        
				break label0;
	//  519 1053:goto            1183
			}
			j = i2;
	//  520 1056:iload           7
	//  521 1058:istore          4
			containeratom = ((Atom.ContainerAtom) (new long[chunkiterator.length]));
	//  522 1060:aload           38
	//  523 1062:getfield        #579 <Field int AtomParsers$ChunkIterator.length>
	//  524 1065:newarray        long[]
	//  525 1067:astore_1        
			ai = new int[chunkiterator.length];
	//  526 1068:aload           38
	//  527 1070:getfield        #579 <Field int AtomParsers$ChunkIterator.length>
	//  528 1073:newarray        int[]
	//  529 1075:astore          30
			while(chunkiterator.moveNext()) 
	//* 530 1077:aload           38
	//* 531 1079:invokevirtual   #538 <Method boolean AtomParsers$ChunkIterator.moveNext()>
	//* 532 1082:ifeq            1113
			{
				containeratom[chunkiterator.index] = chunkiterator.offset;
	//  533 1085:aload_1         
	//  534 1086:aload           38
	//  535 1088:getfield        #582 <Field int AtomParsers$ChunkIterator.index>
	//  536 1091:aload           38
	//  537 1093:getfield        #546 <Field long AtomParsers$ChunkIterator.offset>
	//  538 1096:lastore         
				ai[chunkiterator.index] = ((long) (chunkiterator.numSamples));
	//  539 1097:aload           30
	//  540 1099:aload           38
	//  541 1101:getfield        #582 <Field int AtomParsers$ChunkIterator.index>
	//  542 1104:aload           38
	//  543 1106:getfield        #549 <Field int AtomParsers$ChunkIterator.numSamples>
	//  544 1109:iastore         
			}
	//* 545 1110:goto            1077
			obj2 = ((Object) (FixedSampleSizeRechunker.rechunk(Util.getPcmFrameSize(((Track) (obj2)).format.pcmEncoding, ((Track) (obj2)).format.channelCount), ((long []) (containeratom)), ai, k5)));
	//  546 1113:aload           33
	//  547 1115:getfield        #532 <Field Format Track.format>
	//  548 1118:getfield        #585 <Field int Format.pcmEncoding>
	//  549 1121:aload           33
	//  550 1123:getfield        #532 <Field Format Track.format>
	//  551 1126:getfield        #588 <Field int Format.channelCount>
	//  552 1129:invokestatic    #592 <Method int Util.getPcmFrameSize(int, int)>
	//  553 1132:aload_1         
	//  554 1133:aload           30
	//  555 1135:iload           13
	//  556 1137:i2l             
	//  557 1138:invokestatic    #598 <Method FixedSampleSizeRechunker$Results FixedSampleSizeRechunker.rechunk(int, long[], int[], long)>
	//  558 1141:astore          33
			ai = ((int []) (((FixedSampleSizeRechunker.Results) (obj2)).offsets));
	//  559 1143:aload           33
	//  560 1145:getfield        #604 <Field long[] FixedSampleSizeRechunker$Results.offsets>
	//  561 1148:astore          30
			ai1 = ((FixedSampleSizeRechunker.Results) (obj2)).sizes;
	//  562 1150:aload           33
	//  563 1152:getfield        #608 <Field int[] FixedSampleSizeRechunker$Results.sizes>
	//  564 1155:astore          31
			i = ((FixedSampleSizeRechunker.Results) (obj2)).maximumSize;
	//  565 1157:aload           33
	//  566 1159:getfield        #611 <Field int FixedSampleSizeRechunker$Results.maximumSize>
	//  567 1162:istore_3        
			al = ((FixedSampleSizeRechunker.Results) (obj2)).timestamps;
	//  568 1163:aload           33
	//  569 1165:getfield        #614 <Field long[] FixedSampleSizeRechunker$Results.timestamps>
	//  570 1168:astore          32
			containeratom = ((Atom.ContainerAtom) (((FixedSampleSizeRechunker.Results) (obj2)).flags));
	//  571 1170:aload           33
	//  572 1172:getfield        #617 <Field int[] FixedSampleSizeRechunker$Results.flags>
	//  573 1175:astore_1        
			l7 = ((FixedSampleSizeRechunker.Results) (obj2)).duration;
	//  574 1176:aload           33
	//  575 1178:getfield        #620 <Field long FixedSampleSizeRechunker$Results.duration>
	//  576 1181:lstore          20
		}
		Track track1 = track;
	//  577 1183:aload_0         
	//  578 1184:astore          33
		long l9 = Util.scaleLargeTimestamp(l7, 0xf4240L, track1.timescale);
	//  579 1186:lload           20
	//  580 1188:ldc2w           #621 <Long 0xf4240L>
	//  581 1191:aload           33
	//  582 1193:getfield        #625 <Field long Track.timescale>
	//  583 1196:invokestatic    #629 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  584 1199:lstore          22
		if(track1.editListDurations != null && !gaplessinfoholder.hasGaplessInfo())
	//* 585 1201:aload           33
	//* 586 1203:getfield        #632 <Field long[] Track.editListDurations>
	//* 587 1206:ifnull          2196
	//* 588 1209:aload_2         
	//* 589 1210:invokevirtual   #637 <Method boolean GaplessInfoHolder.hasGaplessInfo()>
	//* 590 1213:ifeq            1219
	//* 591 1216:goto            2196
		{
			if(track1.editListDurations.length == 1 && track1.type == 1 && al.length >= 2)
	//* 592 1219:aload           33
	//* 593 1221:getfield        #632 <Field long[] Track.editListDurations>
	//* 594 1224:arraylength     
	//* 595 1225:iconst_1        
	//* 596 1226:icmpne          1422
	//* 597 1229:aload           33
	//* 598 1231:getfield        #640 <Field int Track.type>
	//* 599 1234:iconst_1        
	//* 600 1235:icmpne          1422
	//* 601 1238:aload           32
	//* 602 1240:arraylength     
	//* 603 1241:iconst_2        
	//* 604 1242:icmplt          1422
			{
				long l16 = track1.editListMediaTimes[0];
	//  605 1245:aload           33
	//  606 1247:getfield        #643 <Field long[] Track.editListMediaTimes>
	//  607 1250:iconst_0        
	//  608 1251:laload          
	//  609 1252:lstore          28
				long l13 = l16 + Util.scaleLargeTimestamp(track1.editListDurations[0], track1.timescale, track1.movieTimescale);
	//  610 1254:lload           28
	//  611 1256:aload           33
	//  612 1258:getfield        #632 <Field long[] Track.editListDurations>
	//  613 1261:iconst_0        
	//  614 1262:laload          
	//  615 1263:aload           33
	//  616 1265:getfield        #625 <Field long Track.timescale>
	//  617 1268:aload           33
	//  618 1270:getfield        #646 <Field long Track.movieTimescale>
	//  619 1273:invokestatic    #629 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  620 1276:ladd            
	//  621 1277:lstore          26
				if(canApplyEditWithGaplessInfo(al, l7, l16, l13))
	//* 622 1279:aload           32
	//* 623 1281:lload           20
	//* 624 1283:lload           28
	//* 625 1285:lload           26
	//* 626 1287:invokestatic    #648 <Method boolean canApplyEditWithGaplessInfo(long[], long, long, long)>
	//* 627 1290:ifeq            1422
				{
					l16 = Util.scaleLargeTimestamp(l16 - al[0], track1.format.sampleRate, track1.timescale);
	//  628 1293:lload           28
	//  629 1295:aload           32
	//  630 1297:iconst_0        
	//  631 1298:laload          
	//  632 1299:lsub            
	//  633 1300:aload           33
	//  634 1302:getfield        #532 <Field Format Track.format>
	//  635 1305:getfield        #651 <Field int Format.sampleRate>
	//  636 1308:i2l             
	//  637 1309:aload           33
	//  638 1311:getfield        #625 <Field long Track.timescale>
	//  639 1314:invokestatic    #629 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  640 1317:lstore          28
					l13 = Util.scaleLargeTimestamp(l7 - l13, track1.format.sampleRate, track1.timescale);
	//  641 1319:lload           20
	//  642 1321:lload           26
	//  643 1323:lsub            
	//  644 1324:aload           33
	//  645 1326:getfield        #532 <Field Format Track.format>
	//  646 1329:getfield        #651 <Field int Format.sampleRate>
	//  647 1332:i2l             
	//  648 1333:aload           33
	//  649 1335:getfield        #625 <Field long Track.timescale>
	//  650 1338:invokestatic    #629 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  651 1341:lstore          26
					if((l16 != 0L || l13 != 0L) && l16 <= 0x7fffffffL && l13 <= 0x7fffffffL)
	//* 652 1343:lload           28
	//* 653 1345:lconst_0        
	//* 654 1346:lcmp            
	//* 655 1347:ifne            1357
	//* 656 1350:lload           26
	//* 657 1352:lconst_0        
	//* 658 1353:lcmp            
	//* 659 1354:ifeq            1422
	//* 660 1357:lload           28
	//* 661 1359:ldc2w           #652 <Long 0x7fffffffL>
	//* 662 1362:lcmp            
	//* 663 1363:ifgt            1422
	//* 664 1366:lload           26
	//* 665 1368:ldc2w           #652 <Long 0x7fffffffL>
	//* 666 1371:lcmp            
	//* 667 1372:ifgt            1422
					{
						gaplessinfoholder.encoderDelay = (int)l16;
	//  668 1375:aload_2         
	//  669 1376:lload           28
	//  670 1378:l2i             
	//  671 1379:putfield        #656 <Field int GaplessInfoHolder.encoderDelay>
						gaplessinfoholder.encoderPadding = (int)l13;
	//  672 1382:aload_2         
	//  673 1383:lload           26
	//  674 1385:l2i             
	//  675 1386:putfield        #659 <Field int GaplessInfoHolder.encoderPadding>
						Util.scaleLargeTimestampsInPlace(al, 0xf4240L, track1.timescale);
	//  676 1389:aload           32
	//  677 1391:ldc2w           #621 <Long 0xf4240L>
	//  678 1394:aload           33
	//  679 1396:getfield        #625 <Field long Track.timescale>
	//  680 1399:invokestatic    #663 <Method void Util.scaleLargeTimestampsInPlace(long[], long, long)>
						return new TrackSampleTable(track1, ((long []) (ai)), ai1, i, al, ((int []) (containeratom)), l9);
	//  681 1402:new             #500 <Class TrackSampleTable>
	//  682 1405:dup             
	//  683 1406:aload           33
	//  684 1408:aload           30
	//  685 1410:aload           31
	//  686 1412:iload_3         
	//  687 1413:aload           32
	//  688 1415:aload_1         
	//  689 1416:lload           22
	//  690 1418:invokespecial   #505 <Method void TrackSampleTable(Track, long[], int[], int, long[], int[], long)>
	//  691 1421:areturn         
					}
				}
			}
			if(track1.editListDurations.length == 1 && track1.editListDurations[0] == 0L)
	//* 692 1422:aload           33
	//* 693 1424:getfield        #632 <Field long[] Track.editListDurations>
	//* 694 1427:arraylength     
	//* 695 1428:iconst_1        
	//* 696 1429:icmpne          1531
	//* 697 1432:aload           33
	//* 698 1434:getfield        #632 <Field long[] Track.editListDurations>
	//* 699 1437:iconst_0        
	//* 700 1438:laload          
	//* 701 1439:lconst_0        
	//* 702 1440:lcmp            
	//* 703 1441:ifne            1531
			{
				l9 = track1.editListMediaTimes[0];
	//  704 1444:aload           33
	//  705 1446:getfield        #643 <Field long[] Track.editListMediaTimes>
	//  706 1449:iconst_0        
	//  707 1450:laload          
	//  708 1451:lstore          22
				for(j = 0; j < al.length; j++)
	//* 709 1453:iconst_0        
	//* 710 1454:istore          4
	//* 711 1456:iload           4
	//* 712 1458:aload           32
	//* 713 1460:arraylength     
	//* 714 1461:icmpge          1497
					al[j] = Util.scaleLargeTimestamp(al[j] - l9, 0xf4240L, track1.timescale);
	//  715 1464:aload           32
	//  716 1466:iload           4
	//  717 1468:aload           32
	//  718 1470:iload           4
	//  719 1472:laload          
	//  720 1473:lload           22
	//  721 1475:lsub            
	//  722 1476:ldc2w           #621 <Long 0xf4240L>
	//  723 1479:aload           33
	//  724 1481:getfield        #625 <Field long Track.timescale>
	//  725 1484:invokestatic    #629 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  726 1487:lastore         

	//  727 1488:iload           4
	//  728 1490:iconst_1        
	//  729 1491:iadd            
	//  730 1492:istore          4
	//* 731 1494:goto            1456
				return new TrackSampleTable(track1, ((long []) (ai)), ai1, i, al, ((int []) (containeratom)), Util.scaleLargeTimestamp(l7 - l9, 0xf4240L, track1.timescale));
	//  732 1497:new             #500 <Class TrackSampleTable>
	//  733 1500:dup             
	//  734 1501:aload           33
	//  735 1503:aload           30
	//  736 1505:aload           31
	//  737 1507:iload_3         
	//  738 1508:aload           32
	//  739 1510:aload_1         
	//  740 1511:lload           20
	//  741 1513:lload           22
	//  742 1515:lsub            
	//  743 1516:ldc2w           #621 <Long 0xf4240L>
	//  744 1519:aload           33
	//  745 1521:getfield        #625 <Field long Track.timescale>
	//  746 1524:invokestatic    #629 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  747 1527:invokespecial   #505 <Method void TrackSampleTable(Track, long[], int[], int, long[], int[], long)>
	//  748 1530:areturn         
			}
			boolean flag4;
			if(track1.type == 1)
	//* 749 1531:aload           33
	//* 750 1533:getfield        #640 <Field int Track.type>
	//* 751 1536:iconst_1        
	//* 752 1537:icmpne          1546
				flag4 = true;
	//  753 1540:iconst_1        
	//  754 1541:istore          19
			else
	//* 755 1543:goto            1549
				flag4 = false;
	//  756 1546:iconst_0        
	//  757 1547:istore          19
			int j2 = 0;
	//  758 1549:iconst_0        
	//  759 1550:istore          7
			int l = 0;
	//  760 1552:iconst_0        
	//  761 1553:istore          5
			int j1 = 0;
	//  762 1555:iconst_0        
	//  763 1556:istore          6
			int j3 = 0;
	//  764 1558:iconst_0        
	//  765 1559:istore          8
			gaplessinfoholder = ((GaplessInfoHolder) (ai));
	//  766 1561:aload           30
	//  767 1563:astore_2        
			do
			{
				ai = ((int []) (track));
	//  768 1564:aload_0         
	//  769 1565:astore          30
				if(j2 >= ((Track) (ai)).editListDurations.length)
					break;
	//  770 1567:iload           7
	//  771 1569:aload           30
	//  772 1571:getfield        #632 <Field long[] Track.editListDurations>
	//  773 1574:arraylength     
	//  774 1575:icmpge          1719
				l7 = ((Track) (ai)).editListMediaTimes[j2];
	//  775 1578:aload           30
	//  776 1580:getfield        #643 <Field long[] Track.editListMediaTimes>
	//  777 1583:iload           7
	//  778 1585:laload          
	//  779 1586:lstore          20
				int l3;
				if(l7 != -1L)
	//* 780 1588:lload           20
	//* 781 1590:ldc2w           #664 <Long -1L>
	//* 782 1593:lcmp            
	//* 783 1594:ifeq            1694
				{
					l9 = Util.scaleLargeTimestamp(((Track) (ai)).editListDurations[j2], ((Track) (ai)).timescale, ((Track) (ai)).movieTimescale);
	//  784 1597:aload           30
	//  785 1599:getfield        #632 <Field long[] Track.editListDurations>
	//  786 1602:iload           7
	//  787 1604:laload          
	//  788 1605:aload           30
	//  789 1607:getfield        #625 <Field long Track.timescale>
	//  790 1610:aload           30
	//  791 1612:getfield        #646 <Field long Track.movieTimescale>
	//  792 1615:invokestatic    #629 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  793 1618:lstore          22
					int i5 = Util.binarySearchCeil(al, l7, true, true);
	//  794 1620:aload           32
	//  795 1622:lload           20
	//  796 1624:iconst_1        
	//  797 1625:iconst_1        
	//  798 1626:invokestatic    #669 <Method int Util.binarySearchCeil(long[], long, boolean, boolean)>
	//  799 1629:istore          11
					int k4 = Util.binarySearchCeil(al, l7 + l9, flag4, false);
	//  800 1631:aload           32
	//  801 1633:lload           20
	//  802 1635:lload           22
	//  803 1637:ladd            
	//  804 1638:iload           19
	//  805 1640:iconst_0        
	//  806 1641:invokestatic    #669 <Method int Util.binarySearchCeil(long[], long, boolean, boolean)>
	//  807 1644:istore          10
					l3 = j1 + (k4 - i5);
	//  808 1646:iload           6
	//  809 1648:iload           10
	//  810 1650:iload           11
	//  811 1652:isub            
	//  812 1653:iadd            
	//  813 1654:istore          9
					if(j3 != i5)
	//* 814 1656:iload           8
	//* 815 1658:iload           11
	//* 816 1660:icmpeq          1669
						j3 = 1;
	//  817 1663:iconst_1        
	//  818 1664:istore          8
					else
	//* 819 1666:goto            1672
						j3 = 0;
	//  820 1669:iconst_0        
	//  821 1670:istore          8
					j1 = k4;
	//  822 1672:iload           10
	//  823 1674:istore          6
					l = j3 | l;
	//  824 1676:iload           8
	//  825 1678:iload           5
	//  826 1680:ior             
	//  827 1681:istore          5
					j3 = l3;
	//  828 1683:iload           9
	//  829 1685:istore          8
					l3 = j1;
	//  830 1687:iload           6
	//  831 1689:istore          9
				} else
	//* 832 1691:goto            1702
				{
					l3 = j3;
	//  833 1694:iload           8
	//  834 1696:istore          9
					j3 = j1;
	//  835 1698:iload           6
	//  836 1700:istore          8
				}
				j2++;
	//  837 1702:iload           7
	//  838 1704:iconst_1        
	//  839 1705:iadd            
	//  840 1706:istore          7
				j1 = j3;
	//  841 1708:iload           8
	//  842 1710:istore          6
				j3 = l3;
	//  843 1712:iload           9
	//  844 1714:istore          8
			} while(true);
	//  845 1716:goto            1564
			ai = ai1;
	//  846 1719:aload           31
	//  847 1721:astore          30
			if(j1 != j)
	//* 848 1723:iload           6
	//* 849 1725:iload           4
	//* 850 1727:icmpeq          1736
				j = 1;
	//  851 1730:iconst_1        
	//  852 1731:istore          4
			else
	//* 853 1733:goto            1739
				j = 0;
	//  854 1736:iconst_0        
	//  855 1737:istore          4
			j3 = j | l;
	//  856 1739:iload           4
	//  857 1741:iload           5
	//  858 1743:ior             
	//  859 1744:istore          8
			if(j3 != 0)
	//* 860 1746:iload           8
	//* 861 1748:ifeq            1760
				track1 = ((Track) (new long[j1]));
	//  862 1751:iload           6
	//  863 1753:newarray        long[]
	//  864 1755:astore          33
			else
	//* 865 1757:goto            1763
				track1 = ((Track) (gaplessinfoholder));
	//  866 1760:aload_2         
	//  867 1761:astore          33
			int ai2[];
			if(j3 != 0)
	//* 868 1763:iload           8
	//* 869 1765:ifeq            1777
				ai2 = new int[j1];
	//  870 1768:iload           6
	//  871 1770:newarray        int[]
	//  872 1772:astore          34
			else
	//* 873 1774:goto            1781
				ai2 = ai;
	//  874 1777:aload           30
	//  875 1779:astore          34
			if(j3 != 0)
	//* 876 1781:iload           8
	//* 877 1783:ifeq            1788
				i = 0;
	//  878 1786:iconst_0        
	//  879 1787:istore_3        
			if(j3 != 0)
	//* 880 1788:iload           8
	//* 881 1790:ifeq            1802
				ai1 = new int[j1];
	//  882 1793:iload           6
	//  883 1795:newarray        int[]
	//  884 1797:astore          31
			else
	//* 885 1799:goto            1805
				ai1 = ((int []) (containeratom));
	//  886 1802:aload_1         
	//  887 1803:astore          31
			long al3[] = new long[j1];
	//  888 1805:iload           6
	//  889 1807:newarray        long[]
	//  890 1809:astore          37
			l = 0;
	//  891 1811:iconst_0        
	//  892 1812:istore          5
			j = 0;
	//  893 1814:iconst_0        
	//  894 1815:istore          4
			GaplessInfoHolder gaplessinfoholder1 = gaplessinfoholder;
	//  895 1817:aload_2         
	//  896 1818:astore          35
			Object obj3 = ((Object) (ai));
	//  897 1820:aload           30
	//  898 1822:astore          36
			l7 = l10;
	//  899 1824:lload           24
	//  900 1826:lstore          20
			ai = ((int []) (al3));
	//  901 1828:aload           37
	//  902 1830:astore          30
			gaplessinfoholder = ((GaplessInfoHolder) (ai1));
	//  903 1832:aload           31
	//  904 1834:astore_2        
			while(l < track.editListDurations.length) 
	//* 905 1835:iload           5
	//* 906 1837:aload_0         
	//* 907 1838:getfield        #632 <Field long[] Track.editListDurations>
	//* 908 1841:arraylength     
	//* 909 1842:icmpge          2167
			{
				l9 = track.editListMediaTimes[l];
	//  910 1845:aload_0         
	//  911 1846:getfield        #643 <Field long[] Track.editListMediaTimes>
	//  912 1849:iload           5
	//  913 1851:laload          
	//  914 1852:lstore          22
				long l11 = track.editListDurations[l];
	//  915 1854:aload_0         
	//  916 1855:getfield        #632 <Field long[] Track.editListDurations>
	//  917 1858:iload           5
	//  918 1860:laload          
	//  919 1861:lstore          24
				int l1;
				if(l9 != -1L)
	//* 920 1863:lload           22
	//* 921 1865:ldc2w           #664 <Long -1L>
	//* 922 1868:lcmp            
	//* 923 1869:ifeq            2115
				{
					long l14 = Util.scaleLargeTimestamp(l11, track.timescale, track.movieTimescale);
	//  924 1872:lload           24
	//  925 1874:aload_0         
	//  926 1875:getfield        #625 <Field long Track.timescale>
	//  927 1878:aload_0         
	//  928 1879:getfield        #646 <Field long Track.movieTimescale>
	//  929 1882:invokestatic    #629 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  930 1885:lstore          26
					int k2 = Util.binarySearchCeil(al, l9, true, true);
	//  931 1887:aload           32
	//  932 1889:lload           22
	//  933 1891:iconst_1        
	//  934 1892:iconst_1        
	//  935 1893:invokestatic    #669 <Method int Util.binarySearchCeil(long[], long, boolean, boolean)>
	//  936 1896:istore          7
					int i4 = Util.binarySearchCeil(al, l9 + l14, flag4, false);
	//  937 1898:aload           32
	//  938 1900:lload           22
	//  939 1902:lload           26
	//  940 1904:ladd            
	//  941 1905:iload           19
	//  942 1907:iconst_0        
	//  943 1908:invokestatic    #669 <Method int Util.binarySearchCeil(long[], long, boolean, boolean)>
	//  944 1911:istore          9
					if(j3 != 0)
	//* 945 1913:iload           8
	//* 946 1915:ifeq            1965
					{
						int k1 = i4 - k2;
	//  947 1918:iload           9
	//  948 1920:iload           7
	//  949 1922:isub            
	//  950 1923:istore          6
						System.arraycopy(((Object) (gaplessinfoholder1)), k2, ((Object) (track1)), j, k1);
	//  951 1925:aload           35
	//  952 1927:iload           7
	//  953 1929:aload           33
	//  954 1931:iload           4
	//  955 1933:iload           6
	//  956 1935:invokestatic    #675 <Method void System.arraycopy(Object, int, Object, int, int)>
						System.arraycopy(obj3, k2, ((Object) (ai2)), j, k1);
	//  957 1938:aload           36
	//  958 1940:iload           7
	//  959 1942:aload           34
	//  960 1944:iload           4
	//  961 1946:iload           6
	//  962 1948:invokestatic    #675 <Method void System.arraycopy(Object, int, Object, int, int)>
						System.arraycopy(((Object) (containeratom)), k2, ((Object) (gaplessinfoholder)), j, k1);
	//  963 1951:aload_1         
	//  964 1952:iload           7
	//  965 1954:aload_2         
	//  966 1955:iload           4
	//  967 1957:iload           6
	//  968 1959:invokestatic    #675 <Method void System.arraycopy(Object, int, Object, int, int)>
					}
	//* 969 1962:goto            1965
					if(k2 < i4 && (gaplessinfoholder[j] & 1) == 0)
	//* 970 1965:iload           7
	//* 971 1967:iload           9
	//* 972 1969:icmpge          1998
	//* 973 1972:aload_2         
	//* 974 1973:iload           4
	//* 975 1975:iaload          
	//* 976 1976:iconst_1        
	//* 977 1977:iand            
	//* 978 1978:ifne            1998
					{
						Log.w("AtomParsers", "Ignoring edit list: edit does not start with a sync sample.");
	//  979 1981:ldc1            #32  <String "AtomParsers">
	//  980 1983:ldc2            #677 <String "Ignoring edit list: edit does not start with a sync sample.">
	//  981 1986:invokestatic    #576 <Method int Log.w(String, String)>
	//  982 1989:pop             
						throw new UnhandledEditListException();
	//  983 1990:new             #24  <Class AtomParsers$UnhandledEditListException>
	//  984 1993:dup             
	//  985 1994:invokespecial   #678 <Method void AtomParsers$UnhandledEditListException()>
	//  986 1997:athrow          
					}
					l1 = i;
	//  987 1998:iload_3         
	//  988 1999:istore          6
					i = j;
	//  989 2001:iload           4
	//  990 2003:istore_3        
					j = l1;
	//  991 2004:iload           6
	//  992 2006:istore          4
					for(l1 = k2; l1 < i4;)
	//* 993 2008:iload           7
	//* 994 2010:istore          6
	//* 995 2012:iload           6
	//* 996 2014:iload           9
	//* 997 2016:icmpge          2100
					{
						ai[i] = Util.scaleLargeTimestamp(l7, 0xf4240L, track.movieTimescale) + Util.scaleLargeTimestamp(al[l1] - l9, 0xf4240L, track.timescale);
	//  998 2019:aload           30
	//  999 2021:iload_3         
	// 1000 2022:lload           20
	// 1001 2024:ldc2w           #621 <Long 0xf4240L>
	// 1002 2027:aload_0         
	// 1003 2028:getfield        #646 <Field long Track.movieTimescale>
	// 1004 2031:invokestatic    #629 <Method long Util.scaleLargeTimestamp(long, long, long)>
	// 1005 2034:aload           32
	// 1006 2036:iload           6
	// 1007 2038:laload          
	// 1008 2039:lload           22
	// 1009 2041:lsub            
	// 1010 2042:ldc2w           #621 <Long 0xf4240L>
	// 1011 2045:aload_0         
	// 1012 2046:getfield        #625 <Field long Track.timescale>
	// 1013 2049:invokestatic    #629 <Method long Util.scaleLargeTimestamp(long, long, long)>
	// 1014 2052:ladd            
	// 1015 2053:lastore         
						int l2 = j;
	// 1016 2054:iload           4
	// 1017 2056:istore          7
						if(j3 != 0)
	//*1018 2058:iload           8
	//*1019 2060:ifeq            2083
						{
							l2 = j;
	// 1020 2063:iload           4
	// 1021 2065:istore          7
							if(ai2[i] > j)
	//*1022 2067:aload           34
	//*1023 2069:iload_3         
	//*1024 2070:iaload          
	//*1025 2071:iload           4
	//*1026 2073:icmple          2083
								l2 = obj3[l1];
	// 1027 2076:aload           36
	// 1028 2078:iload           6
	// 1029 2080:iaload          
	// 1030 2081:istore          7
						}
						i++;
	// 1031 2083:iload_3         
	// 1032 2084:iconst_1        
	// 1033 2085:iadd            
	// 1034 2086:istore_3        
						l1++;
	// 1035 2087:iload           6
	// 1036 2089:iconst_1        
	// 1037 2090:iadd            
	// 1038 2091:istore          6
						j = l2;
	// 1039 2093:iload           7
	// 1040 2095:istore          4
					}

	//*1041 2097:goto            2012
					ai1 = ((int []) (gaplessinfoholder));
	// 1042 2100:aload_2         
	// 1043 2101:astore          31
					l1 = j;
	// 1044 2103:iload           4
	// 1045 2105:istore          6
					gaplessinfoholder = ((GaplessInfoHolder) (containeratom));
	// 1046 2107:aload_1         
	// 1047 2108:astore_2        
					containeratom = ((Atom.ContainerAtom) (ai1));
	// 1048 2109:aload           31
	// 1049 2111:astore_1        
				} else
	//*1050 2112:goto            2129
				{
					ai1 = ((int []) (containeratom));
	// 1051 2115:aload_1         
	// 1052 2116:astore          31
					containeratom = ((Atom.ContainerAtom) (gaplessinfoholder));
	// 1053 2118:aload_2         
	// 1054 2119:astore_1        
					gaplessinfoholder = ((GaplessInfoHolder) (ai1));
	// 1055 2120:aload           31
	// 1056 2122:astore_2        
					l1 = i;
	// 1057 2123:iload_3         
	// 1058 2124:istore          6
					i = j;
	// 1059 2126:iload           4
	// 1060 2128:istore_3        
				}
				l++;
	// 1061 2129:iload           5
	// 1062 2131:iconst_1        
	// 1063 2132:iadd            
	// 1064 2133:istore          5
				l7 += l11;
	// 1065 2135:lload           20
	// 1066 2137:lload           24
	// 1067 2139:ladd            
	// 1068 2140:lstore          20
				ai1 = ai;
	// 1069 2142:aload           30
	// 1070 2144:astore          31
				ai = ((int []) (containeratom));
	// 1071 2146:aload_1         
	// 1072 2147:astore          30
				containeratom = ((Atom.ContainerAtom) (gaplessinfoholder));
	// 1073 2149:aload_2         
	// 1074 2150:astore_1        
				gaplessinfoholder = ((GaplessInfoHolder) (ai));
	// 1075 2151:aload           30
	// 1076 2153:astore_2        
				ai = ai1;
	// 1077 2154:aload           31
	// 1078 2156:astore          30
				j = i;
	// 1079 2158:iload_3         
	// 1080 2159:istore          4
				i = l1;
	// 1081 2161:iload           6
	// 1082 2163:istore_3        
			}
	//*1083 2164:goto            1835
			return new TrackSampleTable(track, ((long []) (track1)), ai2, i, ((long []) (ai)), ((int []) (gaplessinfoholder)), Util.scaleLargeTimestamp(l7, 0xf4240L, track.timescale));
	// 1084 2167:new             #500 <Class TrackSampleTable>
	// 1085 2170:dup             
	// 1086 2171:aload_0         
	// 1087 2172:aload           33
	// 1088 2174:aload           34
	// 1089 2176:iload_3         
	// 1090 2177:aload           30
	// 1091 2179:aload_2         
	// 1092 2180:lload           20
	// 1093 2182:ldc2w           #621 <Long 0xf4240L>
	// 1094 2185:aload_0         
	// 1095 2186:getfield        #625 <Field long Track.timescale>
	// 1096 2189:invokestatic    #629 <Method long Util.scaleLargeTimestamp(long, long, long)>
	// 1097 2192:invokespecial   #505 <Method void TrackSampleTable(Track, long[], int[], int, long[], int[], long)>
	// 1098 2195:areturn         
		} else
		{
			Util.scaleLargeTimestampsInPlace(al, 0xf4240L, track1.timescale);
	// 1099 2196:aload           32
	// 1100 2198:ldc2w           #621 <Long 0xf4240L>
	// 1101 2201:aload           33
	// 1102 2203:getfield        #625 <Field long Track.timescale>
	// 1103 2206:invokestatic    #663 <Method void Util.scaleLargeTimestampsInPlace(long[], long, long)>
			return new TrackSampleTable(track1, ((long []) (ai)), ai1, i, al, ((int []) (containeratom)), l9);
	// 1104 2209:new             #500 <Class TrackSampleTable>
	// 1105 2212:dup             
	// 1106 2213:aload           33
	// 1107 2215:aload           30
	// 1108 2217:aload           31
	// 1109 2219:iload_3         
	// 1110 2220:aload           32
	// 1111 2222:aload_1         
	// 1112 2223:lload           22
	// 1113 2225:invokespecial   #505 <Method void TrackSampleTable(Track, long[], int[], int, long[], int[], long)>
	// 1114 2228:areturn         
		}
	}

	private static StsdData parseStsd(ParsableByteArray parsablebytearray, int i, int j, String s, DrmInitData drminitdata, boolean flag)
		throws ParserException
	{
		parsablebytearray.setPosition(12);
	//    0    0:aload_0         
	//    1    1:bipush          12
	//    2    3:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
		int l = parsablebytearray.readInt();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//    5   10:istore          7
		StsdData stsddata = new StsdData(l);
	//    6   12:new             #12  <Class AtomParsers$StsdData>
	//    7   15:dup             
	//    8   16:iload           7
	//    9   18:invokespecial   #682 <Method void AtomParsers$StsdData(int)>
	//   10   21:astore          12
		for(int k = 0; k < l; k++)
	//*  11   23:iconst_0        
	//*  12   24:istore          6
	//*  13   26:iload           6
	//*  14   28:iload           7
	//*  15   30:icmpge          410
		{
			int i1 = parsablebytearray.getPosition();
	//   16   33:aload_0         
	//   17   34:invokevirtual   #93  <Method int ParsableByteArray.getPosition()>
	//   18   37:istore          8
			int j1 = parsablebytearray.readInt();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//   21   43:istore          9
			boolean flag1;
			if(j1 > 0)
	//*  22   45:iload           9
	//*  23   47:ifle            56
				flag1 = true;
	//   24   50:iconst_1        
	//   25   51:istore          11
			else
	//*  26   53:goto            59
				flag1 = false;
	//   27   56:iconst_0        
	//   28   57:istore          11
			Assertions.checkArgument(flag1, "childAtomSize should be positive");
	//   29   59:iload           11
	//   30   61:ldc1            #102 <String "childAtomSize should be positive">
	//   31   63:invokestatic    #108 <Method void Assertions.checkArgument(boolean, Object)>
			int k1 = parsablebytearray.readInt();
	//   32   66:aload_0         
	//   33   67:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//   34   70:istore          10
			if(k1 != Atom.TYPE_avc1 && k1 != Atom.TYPE_avc3 && k1 != Atom.TYPE_encv && k1 != Atom.TYPE_mp4v && k1 != Atom.TYPE_hvc1 && k1 != Atom.TYPE_hev1 && k1 != Atom.TYPE_s263 && k1 != Atom.TYPE_vp08 && k1 != Atom.TYPE_vp09)
	//*  35   72:iload           10
	//*  36   74:getstatic       #685 <Field int Atom.TYPE_avc1>
	//*  37   77:icmpeq          374
	//*  38   80:iload           10
	//*  39   82:getstatic       #688 <Field int Atom.TYPE_avc3>
	//*  40   85:icmpeq          374
	//*  41   88:iload           10
	//*  42   90:getstatic       #691 <Field int Atom.TYPE_encv>
	//*  43   93:icmpeq          374
	//*  44   96:iload           10
	//*  45   98:getstatic       #694 <Field int Atom.TYPE_mp4v>
	//*  46  101:icmpeq          374
	//*  47  104:iload           10
	//*  48  106:getstatic       #697 <Field int Atom.TYPE_hvc1>
	//*  49  109:icmpeq          374
	//*  50  112:iload           10
	//*  51  114:getstatic       #700 <Field int Atom.TYPE_hev1>
	//*  52  117:icmpeq          374
	//*  53  120:iload           10
	//*  54  122:getstatic       #703 <Field int Atom.TYPE_s263>
	//*  55  125:icmpeq          374
	//*  56  128:iload           10
	//*  57  130:getstatic       #706 <Field int Atom.TYPE_vp08>
	//*  58  133:icmpeq          374
	//*  59  136:iload           10
	//*  60  138:getstatic       #709 <Field int Atom.TYPE_vp09>
	//*  61  141:icmpne          147
	//*  62  144:goto            374
			{
				if(k1 != Atom.TYPE_mp4a && k1 != Atom.TYPE_enca && k1 != Atom.TYPE_ac_3 && k1 != Atom.TYPE_ec_3 && k1 != Atom.TYPE_dtsc && k1 != Atom.TYPE_dtse && k1 != Atom.TYPE_dtsh && k1 != Atom.TYPE_dtsl && k1 != Atom.TYPE_samr && k1 != Atom.TYPE_sawb && k1 != Atom.TYPE_lpcm && k1 != Atom.TYPE_sowt && k1 != Atom.TYPE__mp3 && k1 != Atom.TYPE_alac)
	//*  63  147:iload           10
	//*  64  149:getstatic       #712 <Field int Atom.TYPE_mp4a>
	//*  65  152:icmpeq          351
	//*  66  155:iload           10
	//*  67  157:getstatic       #142 <Field int Atom.TYPE_enca>
	//*  68  160:icmpeq          351
	//*  69  163:iload           10
	//*  70  165:getstatic       #178 <Field int Atom.TYPE_ac_3>
	//*  71  168:icmpeq          351
	//*  72  171:iload           10
	//*  73  173:getstatic       #183 <Field int Atom.TYPE_ec_3>
	//*  74  176:icmpeq          351
	//*  75  179:iload           10
	//*  76  181:getstatic       #188 <Field int Atom.TYPE_dtsc>
	//*  77  184:icmpeq          351
	//*  78  187:iload           10
	//*  79  189:getstatic       #199 <Field int Atom.TYPE_dtse>
	//*  80  192:icmpeq          351
	//*  81  195:iload           10
	//*  82  197:getstatic       #193 <Field int Atom.TYPE_dtsh>
	//*  83  200:icmpeq          351
	//*  84  203:iload           10
	//*  85  205:getstatic       #196 <Field int Atom.TYPE_dtsl>
	//*  86  208:icmpeq          351
	//*  87  211:iload           10
	//*  88  213:getstatic       #204 <Field int Atom.TYPE_samr>
	//*  89  216:icmpeq          351
	//*  90  219:iload           10
	//*  91  221:getstatic       #209 <Field int Atom.TYPE_sawb>
	//*  92  224:icmpeq          351
	//*  93  227:iload           10
	//*  94  229:getstatic       #214 <Field int Atom.TYPE_lpcm>
	//*  95  232:icmpeq          351
	//*  96  235:iload           10
	//*  97  237:getstatic       #217 <Field int Atom.TYPE_sowt>
	//*  98  240:icmpeq          351
	//*  99  243:iload           10
	//* 100  245:getstatic       #220 <Field int Atom.TYPE__mp3>
	//* 101  248:icmpeq          351
	//* 102  251:iload           10
	//* 103  253:getstatic       #225 <Field int Atom.TYPE_alac>
	//* 104  256:icmpne          262
	//* 105  259:goto            351
				{
					if(k1 != Atom.TYPE_TTML && k1 != Atom.TYPE_tx3g && k1 != Atom.TYPE_wvtt && k1 != Atom.TYPE_stpp && k1 != Atom.TYPE_c608)
	//* 106  262:iload           10
	//* 107  264:getstatic       #715 <Field int Atom.TYPE_TTML>
	//* 108  267:icmpeq          334
	//* 109  270:iload           10
	//* 110  272:getstatic       #718 <Field int Atom.TYPE_tx3g>
	//* 111  275:icmpeq          334
	//* 112  278:iload           10
	//* 113  280:getstatic       #721 <Field int Atom.TYPE_wvtt>
	//* 114  283:icmpeq          334
	//* 115  286:iload           10
	//* 116  288:getstatic       #724 <Field int Atom.TYPE_stpp>
	//* 117  291:icmpeq          334
	//* 118  294:iload           10
	//* 119  296:getstatic       #727 <Field int Atom.TYPE_c608>
	//* 120  299:icmpne          305
	//* 121  302:goto            334
					{
						if(k1 == Atom.TYPE_camm)
	//* 122  305:iload           10
	//* 123  307:getstatic       #730 <Field int Atom.TYPE_camm>
	//* 124  310:icmpne          392
							stsddata.format = Format.createSampleFormat(Integer.toString(i), "application/x-camera-motion", ((String) (null)), -1, ((DrmInitData) (null)));
	//  125  313:aload           12
	//  126  315:iload_1         
	//  127  316:invokestatic    #241 <Method String Integer.toString(int)>
	//  128  319:ldc2            #732 <String "application/x-camera-motion">
	//  129  322:aconst_null     
	//  130  323:iconst_m1       
	//  131  324:aconst_null     
	//  132  325:invokestatic    #736 <Method Format Format.createSampleFormat(String, String, String, int, DrmInitData)>
	//  133  328:putfield        #251 <Field Format AtomParsers$StsdData.format>
					} else
	//* 134  331:goto            392
					{
						parseTextSampleEntry(parsablebytearray, k1, i1, j1, i, s, stsddata);
	//  135  334:aload_0         
	//  136  335:iload           10
	//  137  337:iload           8
	//  138  339:iload           9
	//  139  341:iload_1         
	//  140  342:aload_3         
	//  141  343:aload           12
	//  142  345:invokestatic    #740 <Method void parseTextSampleEntry(ParsableByteArray, int, int, int, int, String, AtomParsers$StsdData)>
					}
				} else
	//* 143  348:goto            392
				{
					parseAudioSampleEntry(parsablebytearray, k1, i1, j1, i, s, flag, drminitdata, stsddata, k);
	//  144  351:aload_0         
	//  145  352:iload           10
	//  146  354:iload           8
	//  147  356:iload           9
	//  148  358:iload_1         
	//  149  359:aload_3         
	//  150  360:iload           5
	//  151  362:aload           4
	//  152  364:aload           12
	//  153  366:iload           6
	//  154  368:invokestatic    #742 <Method void parseAudioSampleEntry(ParsableByteArray, int, int, int, int, String, boolean, DrmInitData, AtomParsers$StsdData, int)>
				}
			} else
	//* 155  371:goto            392
			{
				parseVideoSampleEntry(parsablebytearray, k1, i1, j1, i, j, drminitdata, stsddata, k);
	//  156  374:aload_0         
	//  157  375:iload           10
	//  158  377:iload           8
	//  159  379:iload           9
	//  160  381:iload_1         
	//  161  382:iload_2         
	//  162  383:aload           4
	//  163  385:aload           12
	//  164  387:iload           6
	//  165  389:invokestatic    #746 <Method void parseVideoSampleEntry(ParsableByteArray, int, int, int, int, int, DrmInitData, AtomParsers$StsdData, int)>
			}
			parsablebytearray.setPosition(i1 + j1);
	//  166  392:aload_0         
	//  167  393:iload           8
	//  168  395:iload           9
	//  169  397:iadd            
	//  170  398:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
		}

	//  171  401:iload           6
	//  172  403:iconst_1        
	//  173  404:iadd            
	//  174  405:istore          6
	//* 175  407:goto            26
		return stsddata;
	//  176  410:aload           12
	//  177  412:areturn         
	}

	private static void parseTextSampleEntry(ParsableByteArray parsablebytearray, int i, int j, int k, int l, String s, StsdData stsddata)
		throws ParserException
	{
		long l1;
		Object obj1;
		parsablebytearray.setPosition(j + 8 + 8);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:bipush          8
	//    3    4:iadd            
	//    4    5:bipush          8
	//    5    7:iadd            
	//    6    8:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
		j = Atom.TYPE_TTML;
	//    7   11:getstatic       #715 <Field int Atom.TYPE_TTML>
	//    8   14:istore_2        
		obj1 = null;
	//    9   15:aconst_null     
	//   10   16:astore          10
		l1 = 0xffffffffL;
	//   11   18:ldc2w           #747 <Long 0xffffffffL>
	//   12   21:lstore          7
		if(i != j) goto _L2; else goto _L1
	//   13   23:iload_1         
	//   14   24:iload_2         
	//   15   25:icmpne          41
_L1:
		parsablebytearray = "application/ttml+xml";
	//   16   28:ldc2            #750 <String "application/ttml+xml">
	//   17   31:astore_0        
_L6:
		Object obj;
		obj = ((Object) (parsablebytearray));
	//   18   32:aload_0         
	//   19   33:astore          9
		parsablebytearray = ((ParsableByteArray) (obj1));
	//   20   35:aload           10
	//   21   37:astore_0        
		  goto _L3
	//*  22   38:goto            134
_L2:
		if(i != Atom.TYPE_tx3g) goto _L5; else goto _L4
	//   23   41:iload_1         
	//   24   42:getstatic       #718 <Field int Atom.TYPE_tx3g>
	//   25   45:icmpne          83
_L4:
		i = k - 8 - 8;
	//   26   48:iload_3         
	//   27   49:bipush          8
	//   28   51:isub            
	//   29   52:bipush          8
	//   30   54:isub            
	//   31   55:istore_1        
		obj = ((Object) (new byte[i]));
	//   32   56:iload_1         
	//   33   57:newarray        byte[]
	//   34   59:astore          9
		parsablebytearray.readBytes(((byte []) (obj)), 0, i);
	//   35   61:aload_0         
	//   36   62:aload           9
	//   37   64:iconst_0        
	//   38   65:iload_1         
	//   39   66:invokevirtual   #270 <Method void ParsableByteArray.readBytes(byte[], int, int)>
		parsablebytearray = ((ParsableByteArray) (Collections.singletonList(obj)));
	//   40   69:aload           9
	//   41   71:invokestatic    #298 <Method java.util.List Collections.singletonList(Object)>
	//   42   74:astore_0        
		obj = "application/x-quicktime-tx3g";
	//   43   75:ldc2            #752 <String "application/x-quicktime-tx3g">
	//   44   78:astore          9
		  goto _L3
	//*  45   80:goto            38
_L5:
		if(i == Atom.TYPE_wvtt)
	//*  46   83:iload_1         
	//*  47   84:getstatic       #721 <Field int Atom.TYPE_wvtt>
	//*  48   87:icmpne          97
			parsablebytearray = "application/x-mp4-vtt";
	//   49   90:ldc2            #754 <String "application/x-mp4-vtt">
	//   50   93:astore_0        
		else
	//*  51   94:goto            32
		if(i == Atom.TYPE_stpp)
	//*  52   97:iload_1         
	//*  53   98:getstatic       #724 <Field int Atom.TYPE_stpp>
	//*  54  101:icmpne          114
		{
			parsablebytearray = "application/ttml+xml";
	//   55  104:ldc2            #750 <String "application/ttml+xml">
	//   56  107:astore_0        
			l1 = 0L;
	//   57  108:lconst_0        
	//   58  109:lstore          7
		} else
	//*  59  111:goto            32
		if(i == Atom.TYPE_c608)
	//*  60  114:iload_1         
	//*  61  115:getstatic       #727 <Field int Atom.TYPE_c608>
	//*  62  118:icmpne          160
		{
			parsablebytearray = "application/x-mp4-cea-608";
	//   63  121:ldc2            #756 <String "application/x-mp4-cea-608">
	//   64  124:astore_0        
			stsddata.requiredSampleTransformation = 1;
	//   65  125:aload           6
	//   66  127:iconst_1        
	//   67  128:putfield        #759 <Field int AtomParsers$StsdData.requiredSampleTransformation>
		} else
	//*  68  131:goto            32
	//*  69  134:aload           6
	//*  70  136:iload           4
	//*  71  138:invokestatic    #241 <Method String Integer.toString(int)>
	//*  72  141:aload           9
	//*  73  143:aconst_null     
	//*  74  144:iconst_m1       
	//*  75  145:iconst_0        
	//*  76  146:aload           5
	//*  77  148:iconst_m1       
	//*  78  149:aconst_null     
	//*  79  150:lload           7
	//*  80  152:aload_0         
	//*  81  153:invokestatic    #763 <Method Format Format.createTextSampleFormat(String, String, String, int, int, String, int, DrmInitData, long, java.util.List)>
	//*  82  156:putfield        #251 <Field Format AtomParsers$StsdData.format>
	//*  83  159:return          
		{
			throw new IllegalStateException();
	//   84  160:new             #765 <Class IllegalStateException>
	//   85  163:dup             
	//   86  164:invokespecial   #766 <Method void IllegalStateException()>
	//   87  167:athrow          
		}
		if(true) goto _L6; else goto _L3
_L3:
		stsddata.format = Format.createTextSampleFormat(Integer.toString(l), ((String) (obj)), ((String) (null)), -1, 0, s, -1, ((DrmInitData) (null)), l1, ((java.util.List) (parsablebytearray)));
		return;
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
	//    4    6:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
			k = Atom.parseFullAtomVersion(parsablebytearray.readInt());
	//    5    9:aload_0         
	//    6   10:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//    7   13:invokestatic    #364 <Method int Atom.parseFullAtomVersion(int)>
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
	//   18   34:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
			j = parsablebytearray.readInt();
	//   19   37:aload_0         
	//   20   38:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//   21   41:istore          4
			parsablebytearray.skipBytes(4);
	//   22   43:aload_0         
	//   23   44:iconst_4        
	//   24   45:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
			int l = parsablebytearray.getPosition();
	//   25   48:aload_0         
	//   26   49:invokevirtual   #93  <Method int ParsableByteArray.getPosition()>
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
	//*  42   73:getfield        #463 <Field byte[] ParsableByteArray.data>
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
		long l2 = 0x1L;
	//   59   99:ldc2w           #501 <Long 0x1L>
	//   60  102:lstore          10
		long l1;
		if(i != 0)
	//*  61  104:iload_2         
	//*  62  105:ifeq            120
		{
			parsablebytearray.skipBytes(((int) (c)));
	//   63  108:aload_0         
	//   64  109:iload_1         
	//   65  110:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
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
	//   72  126:invokevirtual   #371 <Method long ParsableByteArray.readUnsignedInt()>
	//   73  129:lstore          8
			else
	//*  74  131:goto            140
				l1 = parsablebytearray.readUnsignedLongToLong();
	//   75  134:aload_0         
	//   76  135:invokevirtual   #368 <Method long ParsableByteArray.readUnsignedLongToLong()>
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
	//   87  157:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
		i = parsablebytearray.readInt();
	//   88  160:aload_0         
	//   89  161:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//   90  164:istore_2        
		k = parsablebytearray.readInt();
	//   91  165:aload_0         
	//   92  166:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//   93  169:istore          5
		parsablebytearray.skipBytes(4);
	//   94  171:aload_0         
	//   95  172:iconst_4        
	//   96  173:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
		int i1 = parsablebytearray.readInt();
	//   97  176:aload_0         
	//   98  177:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//   99  180:istore          6
		int j1 = parsablebytearray.readInt();
	//  100  182:aload_0         
	//  101  183:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//  102  186:istore          7
		if(i == 0 && k == 0x10000 && i1 == 0xffff0000 && j1 == 0)
	//* 103  188:iload_2         
	//* 104  189:ifne            219
	//* 105  192:iload           5
	//* 106  194:ldc2            #769 <Int 0x10000>
	//* 107  197:icmpne          219
	//* 108  200:iload           6
	//* 109  202:ldc2            #770 <Int 0xffff0000>
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
	//* 119  225:ldc2            #770 <Int 0xffff0000>
	//* 120  228:icmpne          251
	//* 121  231:iload           6
	//* 122  233:ldc2            #769 <Int 0x10000>
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
	//* 132  254:ldc2            #770 <Int 0xffff0000>
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
	//* 145  278:ldc2            #770 <Int 0xffff0000>
	//* 146  281:icmpne          288
							c = '\264';
	//  147  284:sipush          180
	//  148  287:istore_1        
					}
				}
			}
		}
		return new TkhdData(j, l1, ((int) (c)));
	//  149  288:new             #21  <Class AtomParsers$TkhdData>
	//  150  291:dup             
	//  151  292:iload           4
	//  152  294:lload           8
	//  153  296:iload_1         
	//  154  297:invokespecial   #773 <Method void AtomParsers$TkhdData(int, long, int)>
	//  155  300:areturn         
	}

	public static Track parseTrak(Atom.ContainerAtom containeratom, Atom.LeafAtom leafatom, long l, DrmInitData drminitdata, boolean flag, boolean flag1)
		throws ParserException
	{
		Object obj = ((Object) (containeratom.getContainerAtomOfType(Atom.TYPE_mdia)));
	//    0    0:aload_0         
	//    1    1:getstatic       #778 <Field int Atom.TYPE_mdia>
	//    2    4:invokevirtual   #782 <Method Atom$ContainerAtom Atom$ContainerAtom.getContainerAtomOfType(int)>
	//    3    7:astore          13
		int i = parseHdlr(((Atom.ContainerAtom) (obj)).getLeafAtomOfType(Atom.TYPE_hdlr).data);
	//    4    9:aload           13
	//    5   11:getstatic       #785 <Field int Atom.TYPE_hdlr>
	//    6   14:invokevirtual   #354 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//    7   17:getfield        #360 <Field ParsableByteArray Atom$LeafAtom.data>
	//    8   20:invokestatic    #787 <Method int parseHdlr(ParsableByteArray)>
	//    9   23:istore          7
		if(i == -1)
	//*  10   25:iload           7
	//*  11   27:iconst_m1       
	//*  12   28:icmpne          33
			return null;
	//   13   31:aconst_null     
	//   14   32:areturn         
		TkhdData tkhddata = parseTkhd(containeratom.getLeafAtomOfType(Atom.TYPE_tkhd).data);
	//   15   33:aload_0         
	//   16   34:getstatic       #790 <Field int Atom.TYPE_tkhd>
	//   17   37:invokevirtual   #354 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   18   40:getfield        #360 <Field ParsableByteArray Atom$LeafAtom.data>
	//   19   43:invokestatic    #792 <Method AtomParsers$TkhdData parseTkhd(ParsableByteArray)>
	//   20   46:astore          12
		long l1 = 0x1L;
	//   21   48:ldc2w           #501 <Long 0x1L>
	//   22   51:lstore          8
		if(l == 0x1L)
	//*  23   53:lload_2         
	//*  24   54:ldc2w           #501 <Long 0x1L>
	//*  25   57:lcmp            
	//*  26   58:ifne            70
			l = tkhddata.duration;
	//   27   61:aload           12
	//   28   63:invokestatic    #796 <Method long AtomParsers$TkhdData.access$000(AtomParsers$TkhdData)>
	//   29   66:lstore_2        
	//*  30   67:goto            70
		long l2 = parseMvhd(leafatom.data);
	//   31   70:aload_1         
	//   32   71:getfield        #360 <Field ParsableByteArray Atom$LeafAtom.data>
	//   33   74:invokestatic    #798 <Method long parseMvhd(ParsableByteArray)>
	//   34   77:lstore          10
		if(l == 0x1L)
	//*  35   79:lload_2         
	//*  36   80:ldc2w           #501 <Long 0x1L>
	//*  37   83:lcmp            
	//*  38   84:ifne            93
			l = l1;
	//   39   87:lload           8
	//   40   89:lstore_2        
		else
	//*  41   90:goto            106
			l = Util.scaleLargeTimestamp(l, 0xf4240L, l2);
	//   42   93:lload_2         
	//   43   94:ldc2w           #621 <Long 0xf4240L>
	//   44   97:lload           10
	//   45   99:invokestatic    #629 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   46  102:lstore_2        
	//*  47  103:goto            90
		leafatom = ((Atom.LeafAtom) (((Atom.ContainerAtom) (obj)).getContainerAtomOfType(Atom.TYPE_minf).getContainerAtomOfType(Atom.TYPE_stbl)));
	//   48  106:aload           13
	//   49  108:getstatic       #801 <Field int Atom.TYPE_minf>
	//   50  111:invokevirtual   #782 <Method Atom$ContainerAtom Atom$ContainerAtom.getContainerAtomOfType(int)>
	//   51  114:getstatic       #804 <Field int Atom.TYPE_stbl>
	//   52  117:invokevirtual   #782 <Method Atom$ContainerAtom Atom$ContainerAtom.getContainerAtomOfType(int)>
	//   53  120:astore_1        
		obj = ((Object) (parseMdhd(((Atom.ContainerAtom) (obj)).getLeafAtomOfType(Atom.TYPE_mdhd).data)));
	//   54  121:aload           13
	//   55  123:getstatic       #807 <Field int Atom.TYPE_mdhd>
	//   56  126:invokevirtual   #354 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   57  129:getfield        #360 <Field ParsableByteArray Atom$LeafAtom.data>
	//   58  132:invokestatic    #809 <Method Pair parseMdhd(ParsableByteArray)>
	//   59  135:astore          13
		drminitdata = ((DrmInitData) (parseStsd(((Atom.ContainerAtom) (leafatom)).getLeafAtomOfType(Atom.TYPE_stsd).data, tkhddata.id, tkhddata.rotationDegrees, (String)((Pair) (obj)).second, drminitdata, flag1)));
	//   60  137:aload_1         
	//   61  138:getstatic       #812 <Field int Atom.TYPE_stsd>
	//   62  141:invokevirtual   #354 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   63  144:getfield        #360 <Field ParsableByteArray Atom$LeafAtom.data>
	//   64  147:aload           12
	//   65  149:invokestatic    #816 <Method int AtomParsers$TkhdData.access$100(AtomParsers$TkhdData)>
	//   66  152:aload           12
	//   67  154:invokestatic    #819 <Method int AtomParsers$TkhdData.access$200(AtomParsers$TkhdData)>
	//   68  157:aload           13
	//   69  159:getfield        #160 <Field Object Pair.second>
	//   70  162:checkcast       #278 <Class String>
	//   71  165:aload           4
	//   72  167:iload           6
	//   73  169:invokestatic    #821 <Method AtomParsers$StsdData parseStsd(ParsableByteArray, int, int, String, DrmInitData, boolean)>
	//   74  172:astore          4
		if(!flag)
	//*  75  174:iload           5
	//*  76  176:ifne            209
		{
			leafatom = ((Atom.LeafAtom) (parseEdts(containeratom.getContainerAtomOfType(Atom.TYPE_edts))));
	//   77  179:aload_0         
	//   78  180:getstatic       #824 <Field int Atom.TYPE_edts>
	//   79  183:invokevirtual   #782 <Method Atom$ContainerAtom Atom$ContainerAtom.getContainerAtomOfType(int)>
	//   80  186:invokestatic    #826 <Method Pair parseEdts(Atom$ContainerAtom)>
	//   81  189:astore_1        
			containeratom = ((Atom.ContainerAtom) ((long[])((Pair) (leafatom)).first));
	//   82  190:aload_1         
	//   83  191:getfield        #152 <Field Object Pair.first>
	//   84  194:checkcast       #827 <Class long[]>
	//   85  197:astore_0        
			leafatom = ((Atom.LeafAtom) ((long[])((Pair) (leafatom)).second));
	//   86  198:aload_1         
	//   87  199:getfield        #160 <Field Object Pair.second>
	//   88  202:checkcast       #827 <Class long[]>
	//   89  205:astore_1        
		} else
	//*  90  206:goto            213
		{
			containeratom = null;
	//   91  209:aconst_null     
	//   92  210:astore_0        
			leafatom = ((Atom.LeafAtom) (containeratom));
	//   93  211:aload_0         
	//   94  212:astore_1        
		}
		if(((StsdData) (drminitdata)).format == null)
	//*  95  213:aload           4
	//*  96  215:getfield        #251 <Field Format AtomParsers$StsdData.format>
	//*  97  218:ifnonnull       223
			return null;
	//   98  221:aconst_null     
	//   99  222:areturn         
		else
			return new Track(tkhddata.id, i, ((Long)((Pair) (obj)).first).longValue(), l2, l, ((StsdData) (drminitdata)).format, ((StsdData) (drminitdata)).requiredSampleTransformation, ((StsdData) (drminitdata)).trackEncryptionBoxes, ((StsdData) (drminitdata)).nalUnitLengthFieldLength, ((long []) (containeratom)), ((long []) (leafatom)));
	//  100  223:new             #531 <Class Track>
	//  101  226:dup             
	//  102  227:aload           12
	//  103  229:invokestatic    #816 <Method int AtomParsers$TkhdData.access$100(AtomParsers$TkhdData)>
	//  104  232:iload           7
	//  105  234:aload           13
	//  106  236:getfield        #152 <Field Object Pair.first>
	//  107  239:checkcast       #439 <Class Long>
	//  108  242:invokevirtual   #830 <Method long Long.longValue()>
	//  109  245:lload           10
	//  110  247:lload_2         
	//  111  248:aload           4
	//  112  250:getfield        #251 <Field Format AtomParsers$StsdData.format>
	//  113  253:aload           4
	//  114  255:getfield        #759 <Field int AtomParsers$StsdData.requiredSampleTransformation>
	//  115  258:aload           4
	//  116  260:getfield        #175 <Field TrackEncryptionBox[] AtomParsers$StsdData.trackEncryptionBoxes>
	//  117  263:aload           4
	//  118  265:getfield        #833 <Field int AtomParsers$StsdData.nalUnitLengthFieldLength>
	//  119  268:aload_0         
	//  120  269:aload_1         
	//  121  270:invokespecial   #836 <Method void Track(int, int, long, long, long, Format, int, TrackEncryptionBox[], int, long[], long[])>
	//  122  273:areturn         
	}

	public static Metadata parseUdta(Atom.LeafAtom leafatom, boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		leafatom = ((Atom.LeafAtom) (leafatom.data));
	//    4    6:aload_0         
	//    5    7:getfield        #360 <Field ParsableByteArray Atom$LeafAtom.data>
	//    6   10:astore_0        
		((ParsableByteArray) (leafatom)).setPosition(8);
	//    7   11:aload_0         
	//    8   12:bipush          8
	//    9   14:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
		int j;
		for(; ((ParsableByteArray) (leafatom)).bytesLeft() >= 8; ((ParsableByteArray) (leafatom)).skipBytes(j - 8))
	//*  10   17:aload_0         
	//*  11   18:invokevirtual   #841 <Method int ParsableByteArray.bytesLeft()>
	//*  12   21:bipush          8
	//*  13   23:icmplt          70
		{
			int i = ((ParsableByteArray) (leafatom)).getPosition();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #93  <Method int ParsableByteArray.getPosition()>
	//   16   30:istore_2        
			j = ((ParsableByteArray) (leafatom)).readInt();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//   19   35:istore_3        
			if(((ParsableByteArray) (leafatom)).readInt() == Atom.TYPE_meta)
	//*  20   36:aload_0         
	//*  21   37:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//*  22   40:getstatic       #842 <Field int Atom.TYPE_meta>
	//*  23   43:icmpne          59
			{
				((ParsableByteArray) (leafatom)).setPosition(i);
	//   24   46:aload_0         
	//   25   47:iload_2         
	//   26   48:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
				return parseMetaAtom(((ParsableByteArray) (leafatom)), i + j);
	//   27   51:aload_0         
	//   28   52:iload_2         
	//   29   53:iload_3         
	//   30   54:iadd            
	//   31   55:invokestatic    #844 <Method Metadata parseMetaAtom(ParsableByteArray, int)>
	//   32   58:areturn         
			}
		}

	//   33   59:aload_0         
	//   34   60:iload_3         
	//   35   61:bipush          8
	//   36   63:isub            
	//   37   64:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
	//*  38   67:goto            17
		return null;
	//   39   70:aconst_null     
	//   40   71:areturn         
	}

	private static void parseVideoSampleEntry(ParsableByteArray parsablebytearray, int i, int j, int k, int l, int i1, DrmInitData drminitdata, StsdData stsddata, 
			int j1)
		throws ParserException
	{
		parsablebytearray.setPosition(j + 8 + 8);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:bipush          8
	//    3    4:iadd            
	//    4    5:bipush          8
	//    5    7:iadd            
	//    6    8:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
		parsablebytearray.skipBytes(16);
	//    7   11:aload_0         
	//    8   12:bipush          16
	//    9   14:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
		int k2 = parsablebytearray.readUnsignedShort();
	//   10   17:aload_0         
	//   11   18:invokevirtual   #120 <Method int ParsableByteArray.readUnsignedShort()>
	//   12   21:istore          15
		int l2 = parsablebytearray.readUnsignedShort();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #120 <Method int ParsableByteArray.readUnsignedShort()>
	//   15   27:istore          16
		parsablebytearray.skipBytes(50);
	//   16   29:aload_0         
	//   17   30:bipush          50
	//   18   32:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
		int l1 = parsablebytearray.getPosition();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #93  <Method int ParsableByteArray.getPosition()>
	//   21   39:istore          12
		int i2 = Atom.TYPE_encv;
	//   22   41:getstatic       #691 <Field int Atom.TYPE_encv>
	//   23   44:istore          13
		Object obj3 = null;
	//   24   46:aconst_null     
	//   25   47:astore          25
		Object obj1 = ((Object) (drminitdata));
	//   26   49:aload           6
	//   27   51:astore          21
		int k1 = i;
	//   28   53:iload_1         
	//   29   54:istore          11
		if(i == i2)
	//*  30   56:iload_1         
	//*  31   57:iload           13
	//*  32   59:icmpne          149
		{
			obj1 = ((Object) (parseSampleEntryEncryptionData(parsablebytearray, j, k)));
	//   33   62:aload_0         
	//   34   63:iload_2         
	//   35   64:iload_3         
	//   36   65:invokestatic    #146 <Method Pair parseSampleEntryEncryptionData(ParsableByteArray, int, int)>
	//   37   68:astore          21
			DrmInitData drminitdata1 = drminitdata;
	//   38   70:aload           6
	//   39   72:astore          20
			if(obj1 != null)
	//*  40   74:aload           21
	//*  41   76:ifnull          136
			{
				i = ((Integer)((Pair) (obj1)).first).intValue();
	//   42   79:aload           21
	//   43   81:getfield        #152 <Field Object Pair.first>
	//   44   84:checkcast       #154 <Class Integer>
	//   45   87:invokevirtual   #157 <Method int Integer.intValue()>
	//   46   90:istore_1        
				if(drminitdata == null)
	//*  47   91:aload           6
	//*  48   93:ifnonnull       102
					drminitdata1 = null;
	//   49   96:aconst_null     
	//   50   97:astore          20
				else
	//*  51   99:goto            120
					drminitdata1 = drminitdata.copyWithSchemeType(((TrackEncryptionBox)((Pair) (obj1)).second).schemeType);
	//   52  102:aload           6
	//   53  104:aload           21
	//   54  106:getfield        #160 <Field Object Pair.second>
	//   55  109:checkcast       #162 <Class TrackEncryptionBox>
	//   56  112:getfield        #165 <Field String TrackEncryptionBox.schemeType>
	//   57  115:invokevirtual   #171 <Method DrmInitData DrmInitData.copyWithSchemeType(String)>
	//   58  118:astore          20
				stsddata.trackEncryptionBoxes[j1] = (TrackEncryptionBox)((Pair) (obj1)).second;
	//   59  120:aload           7
	//   60  122:getfield        #175 <Field TrackEncryptionBox[] AtomParsers$StsdData.trackEncryptionBoxes>
	//   61  125:iload           8
	//   62  127:aload           21
	//   63  129:getfield        #160 <Field Object Pair.second>
	//   64  132:checkcast       #162 <Class TrackEncryptionBox>
	//   65  135:aastore         
			}
			parsablebytearray.setPosition(l1);
	//   66  136:aload_0         
	//   67  137:iload           12
	//   68  139:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
			k1 = i;
	//   69  142:iload_1         
	//   70  143:istore          11
			obj1 = ((Object) (drminitdata1));
	//   71  145:aload           20
	//   72  147:astore          21
		}
		i2 = -1;
	//   73  149:iconst_m1       
	//   74  150:istore          13
		Object obj2 = null;
	//   75  152:aconst_null     
	//   76  153:astore          23
		byte abyte0[] = ((byte []) (obj2));
	//   77  155:aload           23
	//   78  157:astore          22
		float f1 = 1.0F;
	//   79  159:fconst_1        
	//   80  160:fstore          10
		i = 0;
	//   81  162:iconst_0        
	//   82  163:istore_1        
		j1 = l1;
	//   83  164:iload           12
	//   84  166:istore          8
		l1 = i;
	//   85  168:iload_1         
	//   86  169:istore          12
		while(j1 - j < k) 
	//*  87  171:iload           8
	//*  88  173:iload_2         
	//*  89  174:isub            
	//*  90  175:iload_3         
	//*  91  176:icmpge          972
		{
			parsablebytearray.setPosition(j1);
	//   92  179:aload_0         
	//   93  180:iload           8
	//   94  182:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
			i = parsablebytearray.getPosition();
	//   95  185:aload_0         
	//   96  186:invokevirtual   #93  <Method int ParsableByteArray.getPosition()>
	//   97  189:istore_1        
			int i3 = parsablebytearray.readInt();
	//   98  190:aload_0         
	//   99  191:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//  100  194:istore          17
			if(i3 == 0 && parsablebytearray.getPosition() - j == k)
	//* 101  196:iload           17
	//* 102  198:ifne            214
	//* 103  201:aload_0         
	//* 104  202:invokevirtual   #93  <Method int ParsableByteArray.getPosition()>
	//* 105  205:iload_2         
	//* 106  206:isub            
	//* 107  207:iload_3         
	//* 108  208:icmpne          214
				break;
	//  109  211:goto            972
			boolean flag;
			if(i3 > 0)
	//* 110  214:iload           17
	//* 111  216:ifle            225
				flag = true;
	//  112  219:iconst_1        
	//  113  220:istore          19
			else
	//* 114  222:goto            228
				flag = false;
	//  115  225:iconst_0        
	//  116  226:istore          19
			Assertions.checkArgument(flag, "childAtomSize should be positive");
	//  117  228:iload           19
	//  118  230:ldc1            #102 <String "childAtomSize should be positive">
	//  119  232:invokestatic    #108 <Method void Assertions.checkArgument(boolean, Object)>
			int j3 = parsablebytearray.readInt();
	//  120  235:aload_0         
	//  121  236:invokevirtual   #100 <Method int ParsableByteArray.readInt()>
	//  122  239:istore          18
			float f;
			int j2;
			Object obj;
			byte abyte1[];
			if(j3 == Atom.TYPE_avcC)
	//* 123  241:iload           18
	//* 124  243:getstatic       #847 <Field int Atom.TYPE_avcC>
	//* 125  246:icmpne          361
			{
				boolean flag1;
				if(obj3 == null)
	//* 126  249:aload           25
	//* 127  251:ifnonnull       260
					flag1 = true;
	//  128  254:iconst_1        
	//  129  255:istore          19
				else
	//* 130  257:goto            263
					flag1 = false;
	//  131  260:iconst_0        
	//  132  261:istore          19
				Assertions.checkState(flag1);
	//  133  263:iload           19
	//  134  265:invokestatic    #542 <Method void Assertions.checkState(boolean)>
				obj2 = "video/avc";
	//  135  268:ldc2            #849 <String "video/avc">
	//  136  271:astore          23
				parsablebytearray.setPosition(i + 8);
	//  137  273:aload_0         
	//  138  274:iload_1         
	//  139  275:bipush          8
	//  140  277:iadd            
	//  141  278:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
				AvcConfig avcconfig = AvcConfig.parse(parsablebytearray);
	//  142  281:aload_0         
	//  143  282:invokestatic    #855 <Method AvcConfig AvcConfig.parse(ParsableByteArray)>
	//  144  285:astore          26
				obj3 = ((Object) (avcconfig.initializationData));
	//  145  287:aload           26
	//  146  289:getfield        #859 <Field java.util.List AvcConfig.initializationData>
	//  147  292:astore          25
				stsddata.nalUnitLengthFieldLength = avcconfig.nalUnitLengthFieldLength;
	//  148  294:aload           7
	//  149  296:aload           26
	//  150  298:getfield        #860 <Field int AvcConfig.nalUnitLengthFieldLength>
	//  151  301:putfield        #833 <Field int AtomParsers$StsdData.nalUnitLengthFieldLength>
				j2 = l1;
	//  152  304:iload           12
	//  153  306:istore          14
				drminitdata = ((DrmInitData) (obj2));
	//  154  308:aload           23
	//  155  310:astore          6
				obj = obj3;
	//  156  312:aload           25
	//  157  314:astore          20
				f = f1;
	//  158  316:fload           10
	//  159  318:fstore          9
				abyte1 = abyte0;
	//  160  320:aload           22
	//  161  322:astore          24
				i = i2;
	//  162  324:iload           13
	//  163  326:istore_1        
				if(l1 == 0)
	//* 164  327:iload           12
	//* 165  329:ifne            939
				{
					f = avcconfig.pixelWidthAspectRatio;
	//  166  332:aload           26
	//  167  334:getfield        #864 <Field float AvcConfig.pixelWidthAspectRatio>
	//  168  337:fstore          9
					j2 = l1;
	//  169  339:iload           12
	//  170  341:istore          14
					drminitdata = ((DrmInitData) (obj2));
	//  171  343:aload           23
	//  172  345:astore          6
					obj = obj3;
	//  173  347:aload           25
	//  174  349:astore          20
					abyte1 = abyte0;
	//  175  351:aload           22
	//  176  353:astore          24
					i = i2;
	//  177  355:iload           13
	//  178  357:istore_1        
				}
			} else
	//* 179  358:goto            939
			if(j3 == Atom.TYPE_hvcC)
	//* 180  361:iload           18
	//* 181  363:getstatic       #867 <Field int Atom.TYPE_hvcC>
	//* 182  366:icmpne          442
			{
				boolean flag2;
				if(obj3 == null)
	//* 183  369:aload           25
	//* 184  371:ifnonnull       380
					flag2 = true;
	//  185  374:iconst_1        
	//  186  375:istore          19
				else
	//* 187  377:goto            383
					flag2 = false;
	//  188  380:iconst_0        
	//  189  381:istore          19
				Assertions.checkState(flag2);
	//  190  383:iload           19
	//  191  385:invokestatic    #542 <Method void Assertions.checkState(boolean)>
				drminitdata = "video/hevc";
	//  192  388:ldc2            #869 <String "video/hevc">
	//  193  391:astore          6
				parsablebytearray.setPosition(i + 8);
	//  194  393:aload_0         
	//  195  394:iload_1         
	//  196  395:bipush          8
	//  197  397:iadd            
	//  198  398:invokevirtual   #97  <Method void ParsableByteArray.setPosition(int)>
				obj2 = ((Object) (HevcConfig.parse(parsablebytearray)));
	//  199  401:aload_0         
	//  200  402:invokestatic    #874 <Method HevcConfig HevcConfig.parse(ParsableByteArray)>
	//  201  405:astore          23
				obj = ((Object) (((HevcConfig) (obj2)).initializationData));
	//  202  407:aload           23
	//  203  409:getfield        #875 <Field java.util.List HevcConfig.initializationData>
	//  204  412:astore          20
				stsddata.nalUnitLengthFieldLength = ((HevcConfig) (obj2)).nalUnitLengthFieldLength;
	//  205  414:aload           7
	//  206  416:aload           23
	//  207  418:getfield        #876 <Field int HevcConfig.nalUnitLengthFieldLength>
	//  208  421:putfield        #833 <Field int AtomParsers$StsdData.nalUnitLengthFieldLength>
				j2 = l1;
	//  209  424:iload           12
	//  210  426:istore          14
				f = f1;
	//  211  428:fload           10
	//  212  430:fstore          9
				abyte1 = abyte0;
	//  213  432:aload           22
	//  214  434:astore          24
				i = i2;
	//  215  436:iload           13
	//  216  438:istore_1        
			} else
	//* 217  439:goto            939
			if(j3 == Atom.TYPE_vpcC)
	//* 218  442:iload           18
	//* 219  444:getstatic       #879 <Field int Atom.TYPE_vpcC>
	//* 220  447:icmpne          512
			{
				boolean flag3;
				if(obj3 == null)
	//* 221  450:aload           25
	//* 222  452:ifnonnull       461
					flag3 = true;
	//  223  455:iconst_1        
	//  224  456:istore          19
				else
	//* 225  458:goto            464
					flag3 = false;
	//  226  461:iconst_0        
	//  227  462:istore          19
				Assertions.checkState(flag3);
	//  228  464:iload           19
	//  229  466:invokestatic    #542 <Method void Assertions.checkState(boolean)>
				if(k1 == Atom.TYPE_vp08)
	//* 230  469:iload           11
	//* 231  471:getstatic       #706 <Field int Atom.TYPE_vp08>
	//* 232  474:icmpne          504
					drminitdata = "video/x-vnd.on2.vp8";
	//  233  477:ldc2            #881 <String "video/x-vnd.on2.vp8">
	//  234  480:astore          6
				else
	//* 235  482:iload           12
	//* 236  484:istore          14
	//* 237  486:aload           23
	//* 238  488:astore          20
	//* 239  490:fload           10
	//* 240  492:fstore          9
	//* 241  494:aload           22
	//* 242  496:astore          24
	//* 243  498:iload           13
	//* 244  500:istore_1        
	//* 245  501:goto            939
					drminitdata = "video/x-vnd.on2.vp9";
	//  246  504:ldc2            #883 <String "video/x-vnd.on2.vp9">
	//  247  507:astore          6
				j2 = l1;
				obj = obj2;
				f = f1;
				abyte1 = abyte0;
				i = i2;
			} else
	//* 248  509:goto            482
			if(j3 == Atom.TYPE_d263)
	//* 249  512:iload           18
	//* 250  514:getstatic       #886 <Field int Atom.TYPE_d263>
	//* 251  517:icmpne          566
			{
				boolean flag4;
				if(obj3 == null)
	//* 252  520:aload           25
	//* 253  522:ifnonnull       531
					flag4 = true;
	//  254  525:iconst_1        
	//  255  526:istore          19
				else
	//* 256  528:goto            534
					flag4 = false;
	//  257  531:iconst_0        
	//  258  532:istore          19
				Assertions.checkState(flag4);
	//  259  534:iload           19
	//  260  536:invokestatic    #542 <Method void Assertions.checkState(boolean)>
				drminitdata = "video/3gpp";
	//  261  539:ldc2            #888 <String "video/3gpp">
	//  262  542:astore          6
				j2 = l1;
	//  263  544:iload           12
	//  264  546:istore          14
				obj = obj2;
	//  265  548:aload           23
	//  266  550:astore          20
				f = f1;
	//  267  552:fload           10
	//  268  554:fstore          9
				abyte1 = abyte0;
	//  269  556:aload           22
	//  270  558:astore          24
				i = i2;
	//  271  560:iload           13
	//  272  562:istore_1        
			} else
	//* 273  563:goto            939
			if(j3 == Atom.TYPE_esds)
	//* 274  566:iload           18
	//* 275  568:getstatic       #113 <Field int Atom.TYPE_esds>
	//* 276  571:icmpne          638
			{
				boolean flag5;
				if(obj3 == null)
	//* 277  574:aload           25
	//* 278  576:ifnonnull       585
					flag5 = true;
	//  279  579:iconst_1        
	//  280  580:istore          19
				else
	//* 281  582:goto            588
					flag5 = false;
	//  282  585:iconst_0        
	//  283  586:istore          19
				Assertions.checkState(flag5);
	//  284  588:iload           19
	//  285  590:invokestatic    #542 <Method void Assertions.checkState(boolean)>
				obj = ((Object) (parseEsdsFromParent(parsablebytearray, i)));
	//  286  593:aload_0         
	//  287  594:iload_1         
	//  288  595:invokestatic    #276 <Method Pair parseEsdsFromParent(ParsableByteArray, int)>
	//  289  598:astore          20
				drminitdata = ((DrmInitData) ((String)((Pair) (obj)).first));
	//  290  600:aload           20
	//  291  602:getfield        #152 <Field Object Pair.first>
	//  292  605:checkcast       #278 <Class String>
	//  293  608:astore          6
				obj = ((Object) (Collections.singletonList(((Pair) (obj)).second)));
	//  294  610:aload           20
	//  295  612:getfield        #160 <Field Object Pair.second>
	//  296  615:invokestatic    #298 <Method java.util.List Collections.singletonList(Object)>
	//  297  618:astore          20
				j2 = l1;
	//  298  620:iload           12
	//  299  622:istore          14
				f = f1;
	//  300  624:fload           10
	//  301  626:fstore          9
				abyte1 = abyte0;
	//  302  628:aload           22
	//  303  630:astore          24
				i = i2;
	//  304  632:iload           13
	//  305  634:istore_1        
			} else
	//* 306  635:goto            939
			if(j3 == Atom.TYPE_pasp)
	//* 307  638:iload           18
	//* 308  640:getstatic       #891 <Field int Atom.TYPE_pasp>
	//* 309  643:icmpne          674
			{
				f = parsePaspFromParent(parsablebytearray, i);
	//  310  646:aload_0         
	//  311  647:iload_1         
	//  312  648:invokestatic    #893 <Method float parsePaspFromParent(ParsableByteArray, int)>
	//  313  651:fstore          9
				j2 = 1;
	//  314  653:iconst_1        
	//  315  654:istore          14
				drminitdata = ((DrmInitData) (obj3));
	//  316  656:aload           25
	//  317  658:astore          6
				obj = obj2;
	//  318  660:aload           23
	//  319  662:astore          20
				abyte1 = abyte0;
	//  320  664:aload           22
	//  321  666:astore          24
				i = i2;
	//  322  668:iload           13
	//  323  670:istore_1        
			} else
	//* 324  671:goto            939
			if(j3 == Atom.TYPE_sv3d)
	//* 325  674:iload           18
	//* 326  676:getstatic       #896 <Field int Atom.TYPE_sv3d>
	//* 327  679:icmpne          713
			{
				abyte1 = parseProjFromParent(parsablebytearray, i, i3);
	//  328  682:aload_0         
	//  329  683:iload_1         
	//  330  684:iload           17
	//  331  686:invokestatic    #898 <Method byte[] parseProjFromParent(ParsableByteArray, int, int)>
	//  332  689:astore          24
				j2 = l1;
	//  333  691:iload           12
	//  334  693:istore          14
				drminitdata = ((DrmInitData) (obj3));
	//  335  695:aload           25
	//  336  697:astore          6
				obj = obj2;
	//  337  699:aload           23
	//  338  701:astore          20
				f = f1;
	//  339  703:fload           10
	//  340  705:fstore          9
				i = i2;
	//  341  707:iload           13
	//  342  709:istore_1        
			} else
	//* 343  710:goto            939
			{
				j2 = l1;
	//  344  713:iload           12
	//  345  715:istore          14
				drminitdata = ((DrmInitData) (obj3));
	//  346  717:aload           25
	//  347  719:astore          6
				obj = obj2;
	//  348  721:aload           23
	//  349  723:astore          20
				f = f1;
	//  350  725:fload           10
	//  351  727:fstore          9
				abyte1 = abyte0;
	//  352  729:aload           22
	//  353  731:astore          24
				i = i2;
	//  354  733:iload           13
	//  355  735:istore_1        
				if(j3 == Atom.TYPE_st3d)
	//* 356  736:iload           18
	//* 357  738:getstatic       #901 <Field int Atom.TYPE_st3d>
	//* 358  741:icmpne          939
				{
					int k3 = parsablebytearray.readUnsignedByte();
	//  359  744:aload_0         
	//  360  745:invokevirtual   #393 <Method int ParsableByteArray.readUnsignedByte()>
	//  361  748:istore          18
					parsablebytearray.skipBytes(3);
	//  362  750:aload_0         
	//  363  751:iconst_3        
	//  364  752:invokevirtual   #123 <Method void ParsableByteArray.skipBytes(int)>
					j2 = l1;
	//  365  755:iload           12
	//  366  757:istore          14
					drminitdata = ((DrmInitData) (obj3));
	//  367  759:aload           25
	//  368  761:astore          6
					obj = obj2;
	//  369  763:aload           23
	//  370  765:astore          20
					f = f1;
	//  371  767:fload           10
	//  372  769:fstore          9
					abyte1 = abyte0;
	//  373  771:aload           22
	//  374  773:astore          24
					i = i2;
	//  375  775:iload           13
	//  376  777:istore_1        
					if(k3 == 0)
	//* 377  778:iload           18
	//* 378  780:ifne            939
						switch(parsablebytearray.readUnsignedByte())
	//* 379  783:aload_0         
	//* 380  784:invokevirtual   #393 <Method int ParsableByteArray.readUnsignedByte()>
						{
	//* 381  787:tableswitch     0 3: default 816
	//	               0 917
	//	               1 892
	//	               2 867
	//	               3 842
						default:
							j2 = l1;
	//  382  816:iload           12
	//  383  818:istore          14
							drminitdata = ((DrmInitData) (obj3));
	//  384  820:aload           25
	//  385  822:astore          6
							obj = obj2;
	//  386  824:aload           23
	//  387  826:astore          20
							f = f1;
	//  388  828:fload           10
	//  389  830:fstore          9
							abyte1 = abyte0;
	//  390  832:aload           22
	//  391  834:astore          24
							i = i2;
	//  392  836:iload           13
	//  393  838:istore_1        
							break;

	//* 394  839:goto            939
						case 3: // '\003'
							i = 3;
	//  395  842:iconst_3        
	//  396  843:istore_1        
							j2 = l1;
	//  397  844:iload           12
	//  398  846:istore          14
							drminitdata = ((DrmInitData) (obj3));
	//  399  848:aload           25
	//  400  850:astore          6
							obj = obj2;
	//  401  852:aload           23
	//  402  854:astore          20
							f = f1;
	//  403  856:fload           10
	//  404  858:fstore          9
							abyte1 = abyte0;
	//  405  860:aload           22
	//  406  862:astore          24
							break;

	//* 407  864:goto            939
						case 2: // '\002'
							i = 2;
	//  408  867:iconst_2        
	//  409  868:istore_1        
							j2 = l1;
	//  410  869:iload           12
	//  411  871:istore          14
							drminitdata = ((DrmInitData) (obj3));
	//  412  873:aload           25
	//  413  875:astore          6
							obj = obj2;
	//  414  877:aload           23
	//  415  879:astore          20
							f = f1;
	//  416  881:fload           10
	//  417  883:fstore          9
							abyte1 = abyte0;
	//  418  885:aload           22
	//  419  887:astore          24
							break;

	//* 420  889:goto            939
						case 1: // '\001'
							i = 1;
	//  421  892:iconst_1        
	//  422  893:istore_1        
							j2 = l1;
	//  423  894:iload           12
	//  424  896:istore          14
							drminitdata = ((DrmInitData) (obj3));
	//  425  898:aload           25
	//  426  900:astore          6
							obj = obj2;
	//  427  902:aload           23
	//  428  904:astore          20
							f = f1;
	//  429  906:fload           10
	//  430  908:fstore          9
							abyte1 = abyte0;
	//  431  910:aload           22
	//  432  912:astore          24
							break;

	//* 433  914:goto            939
						case 0: // '\0'
							i = 0;
	//  434  917:iconst_0        
	//  435  918:istore_1        
							abyte1 = abyte0;
	//  436  919:aload           22
	//  437  921:astore          24
							f = f1;
	//  438  923:fload           10
	//  439  925:fstore          9
							obj = obj2;
	//  440  927:aload           23
	//  441  929:astore          20
							drminitdata = ((DrmInitData) (obj3));
	//  442  931:aload           25
	//  443  933:astore          6
							j2 = l1;
	//  444  935:iload           12
	//  445  937:istore          14
							break;
						}
				}
			}
			j1 += i3;
	//  446  939:iload           8
	//  447  941:iload           17
	//  448  943:iadd            
	//  449  944:istore          8
			l1 = j2;
	//  450  946:iload           14
	//  451  948:istore          12
			obj3 = ((Object) (drminitdata));
	//  452  950:aload           6
	//  453  952:astore          25
			obj2 = obj;
	//  454  954:aload           20
	//  455  956:astore          23
			f1 = f;
	//  456  958:fload           9
	//  457  960:fstore          10
			abyte0 = abyte1;
	//  458  962:aload           24
	//  459  964:astore          22
			i2 = i;
	//  460  966:iload_1         
	//  461  967:istore          13
		}
	//* 462  969:goto            171
		if(obj3 == null)
	//* 463  972:aload           25
	//* 464  974:ifnonnull       978
		{
			return;
	//  465  977:return          
		} else
		{
			stsddata.format = Format.createVideoSampleFormat(Integer.toString(l), ((String) (obj3)), ((String) (null)), -1, -1, k2, l2, -1F, ((java.util.List) (obj2)), i1, f1, abyte0, i2, ((com.google.android.exoplayer2.video.ColorInfo) (null)), ((DrmInitData) (obj1)));
	//  466  978:aload           7
	//  467  980:iload           4
	//  468  982:invokestatic    #241 <Method String Integer.toString(int)>
	//  469  985:aload           25
	//  470  987:aconst_null     
	//  471  988:iconst_m1       
	//  472  989:iconst_m1       
	//  473  990:iload           15
	//  474  992:iload           16
	//  475  994:ldc2            #902 <Float -1F>
	//  476  997:aload           23
	//  477  999:iload           5
	//  478 1001:fload           10
	//  479 1003:aload           22
	//  480 1005:iload           13
	//  481 1007:aconst_null     
	//  482 1008:aload           21
	//  483 1010:invokestatic    #906 <Method Format Format.createVideoSampleFormat(String, String, String, int, int, int, int, float, java.util.List, int, float, byte[], int, com.google.android.exoplayer2.video.ColorInfo, DrmInitData)>
	//  484 1013:putfield        #251 <Field Format AtomParsers$StsdData.format>
			return;
	//  485 1016:return          
		}
	}

	private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 3;
	private static final String TAG = "AtomParsers";
	private static final int TYPE_clcp = Util.getIntegerCodeForString("clcp");
	private static final int TYPE_meta = Util.getIntegerCodeForString("meta");
	private static final int TYPE_sbtl = Util.getIntegerCodeForString("sbtl");
	private static final int TYPE_soun = Util.getIntegerCodeForString("soun");
	private static final int TYPE_subt = Util.getIntegerCodeForString("subt");
	private static final int TYPE_text = Util.getIntegerCodeForString("text");
	private static final int TYPE_vide = Util.getIntegerCodeForString("vide");

	static 
	{
	//    0    0:ldc1            #43  <String "vide">
	//    1    2:invokestatic    #49  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #51  <Field int TYPE_vide>
	//    3    8:ldc1            #53  <String "soun">
	//    4   10:invokestatic    #49  <Method int Util.getIntegerCodeForString(String)>
	//    5   13:putstatic       #55  <Field int TYPE_soun>
	//    6   16:ldc1            #57  <String "text">
	//    7   18:invokestatic    #49  <Method int Util.getIntegerCodeForString(String)>
	//    8   21:putstatic       #59  <Field int TYPE_text>
	//    9   24:ldc1            #61  <String "sbtl">
	//   10   26:invokestatic    #49  <Method int Util.getIntegerCodeForString(String)>
	//   11   29:putstatic       #63  <Field int TYPE_sbtl>
	//   12   32:ldc1            #65  <String "subt">
	//   13   34:invokestatic    #49  <Method int Util.getIntegerCodeForString(String)>
	//   14   37:putstatic       #67  <Field int TYPE_subt>
	//   15   40:ldc1            #69  <String "clcp">
	//   16   42:invokestatic    #49  <Method int Util.getIntegerCodeForString(String)>
	//   17   45:putstatic       #71  <Field int TYPE_clcp>
	//   18   48:ldc1            #73  <String "meta">
	//   19   50:invokestatic    #49  <Method int Util.getIntegerCodeForString(String)>
	//   20   53:putstatic       #75  <Field int TYPE_meta>
	//*  21   56:return          
	}
}
