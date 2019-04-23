// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp3;

import com.google.android.exoplayer.util.*;

final class XingSeeker
	implements Mp3Extractor.Seeker
{

	private XingSeeker(long l, long l1, long l2)
	{
		this(l, l1, l2, ((long []) (null)), 0L, 0);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:lload           5
	//    4    5:aconst_null     
	//    5    6:lconst_0        
	//    6    7:iconst_0        
	//    7    8:invokespecial   #20  <Method void XingSeeker(long, long, long, long[], long, int)>
	//    8   11:return          
	}

	private XingSeeker(long l, long l1, long l2, long al[], 
			long l3, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		firstFramePosition = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #26  <Field long firstFramePosition>
		durationUs = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #28  <Field long durationUs>
		inputLength = l2;
	//    8   14:aload_0         
	//    9   15:lload           5
	//   10   17:putfield        #30  <Field long inputLength>
		tableOfContents = al;
	//   11   20:aload_0         
	//   12   21:aload           7
	//   13   23:putfield        #32  <Field long[] tableOfContents>
		sizeBytes = l3;
	//   14   26:aload_0         
	//   15   27:lload           8
	//   16   29:putfield        #34  <Field long sizeBytes>
		headerSize = i;
	//   17   32:aload_0         
	//   18   33:iload           10
	//   19   35:putfield        #36  <Field int headerSize>
	//   20   38:return          
	}

	public static XingSeeker create(MpegAudioHeader mpegaudioheader, ParsableByteArray parsablebytearray, long l, long l1)
	{
		int i = mpegaudioheader.samplesPerFrame;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int MpegAudioHeader.samplesPerFrame>
	//    2    4:istore          6
		int k = mpegaudioheader.sampleRate;
	//    3    6:aload_0         
	//    4    7:getfield        #46  <Field int MpegAudioHeader.sampleRate>
	//    5   10:istore          7
		l += mpegaudioheader.frameSize;
	//    6   12:lload_2         
	//    7   13:aload_0         
	//    8   14:getfield        #49  <Field int MpegAudioHeader.frameSize>
	//    9   17:i2l             
	//   10   18:ladd            
	//   11   19:lstore_2        
		int i1 = parsablebytearray.readInt();
	//   12   20:aload_1         
	//   13   21:invokevirtual   #55  <Method int ParsableByteArray.readInt()>
	//   14   24:istore          8
		if((i1 & 1) == 1)
	//*  15   26:iload           8
	//*  16   28:iconst_1        
	//*  17   29:iand            
	//*  18   30:iconst_1        
	//*  19   31:icmpne          157
		{
			int j1 = parsablebytearray.readUnsignedIntToInt();
	//   20   34:aload_1         
	//   21   35:invokevirtual   #58  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   22   38:istore          9
			if(j1 != 0)
	//*  23   40:iload           9
	//*  24   42:ifne            48
	//*  25   45:goto            157
			{
				long l2 = Util.scaleLargeTimestamp(j1, (long)i * 0xf4240L, k);
	//   26   48:iload           9
	//   27   50:i2l             
	//   28   51:iload           6
	//   29   53:i2l             
	//   30   54:ldc2w           #59  <Long 0xf4240L>
	//   31   57:lmul            
	//   32   58:iload           7
	//   33   60:i2l             
	//   34   61:invokestatic    #66  <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   35   64:lstore          10
				if((i1 & 6) != 6)
	//*  36   66:iload           8
	//*  37   68:bipush          6
	//*  38   70:iand            
	//*  39   71:bipush          6
	//*  40   73:icmpeq          89
					return new XingSeeker(l, l2, l1);
	//   41   76:new             #2   <Class XingSeeker>
	//   42   79:dup             
	//   43   80:lload_2         
	//   44   81:lload           10
	//   45   83:lload           4
	//   46   85:invokespecial   #68  <Method void XingSeeker(long, long, long)>
	//   47   88:areturn         
				long l3 = parsablebytearray.readUnsignedIntToInt();
	//   48   89:aload_1         
	//   49   90:invokevirtual   #58  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   50   93:i2l             
	//   51   94:lstore          12
				parsablebytearray.skipBytes(1);
	//   52   96:aload_1         
	//   53   97:iconst_1        
	//   54   98:invokevirtual   #72  <Method void ParsableByteArray.skipBytes(int)>
				long al[] = new long[99];
	//   55  101:bipush          99
	//   56  103:newarray        long[]
	//   57  105:astore          14
				for(int j = 0; j < 99; j++)
	//*  58  107:iconst_0        
	//*  59  108:istore          6
	//*  60  110:iload           6
	//*  61  112:bipush          99
	//*  62  114:icmpge          136
					al[j] = parsablebytearray.readUnsignedByte();
	//   63  117:aload           14
	//   64  119:iload           6
	//   65  121:aload_1         
	//   66  122:invokevirtual   #75  <Method int ParsableByteArray.readUnsignedByte()>
	//   67  125:i2l             
	//   68  126:lastore         

	//   69  127:iload           6
	//   70  129:iconst_1        
	//   71  130:iadd            
	//   72  131:istore          6
	//*  73  133:goto            110
				return new XingSeeker(l, l2, l1, al, l3, mpegaudioheader.frameSize);
	//   74  136:new             #2   <Class XingSeeker>
	//   75  139:dup             
	//   76  140:lload_2         
	//   77  141:lload           10
	//   78  143:lload           4
	//   79  145:aload           14
	//   80  147:lload           12
	//   81  149:aload_0         
	//   82  150:getfield        #49  <Field int MpegAudioHeader.frameSize>
	//   83  153:invokespecial   #20  <Method void XingSeeker(long, long, long, long[], long, int)>
	//   84  156:areturn         
			}
		}
		return null;
	//   85  157:aconst_null     
	//   86  158:areturn         
	}

	private long getTimeUsForTocPosition(int i)
	{
		return (durationUs * (long)i) / 100L;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field long durationUs>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:lmul            
	//    5    7:ldc2w           #78  <Long 100L>
	//    6   10:ldiv            
	//    7   11:lreturn         
	}

	public long getDurationUs()
	{
		return durationUs;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field long durationUs>
	//    2    4:lreturn         
	}

	public long getPosition(long l)
	{
		if(!isSeekable())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #87  <Method boolean isSeekable()>
	//*   2    4:ifne            12
			return firstFramePosition;
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field long firstFramePosition>
	//    5   11:lreturn         
		float f3 = ((float)l * 100F) / (float)durationUs;
	//    6   12:lload_1         
	//    7   13:l2f             
	//    8   14:ldc1            #88  <Float 100F>
	//    9   16:fmul            
	//   10   17:aload_0         
	//   11   18:getfield        #28  <Field long durationUs>
	//   12   21:l2f             
	//   13   22:fdiv            
	//   14   23:fstore          6
		float f2 = 0.0F;
	//   15   25:fconst_0        
	//   16   26:fstore          5
		float f = 0.0F;
	//   17   28:fconst_0        
	//   18   29:fstore_3        
		float f1 = 256F;
	//   19   30:ldc1            #89  <Float 256F>
	//   20   32:fstore          4
		if(f3 <= 0.0F)
	//*  21   34:fload           6
	//*  22   36:fconst_0        
	//*  23   37:fcmpg           
	//*  24   38:ifgt            47
			f = f2;
	//   25   41:fload           5
	//   26   43:fstore_3        
		else
	//*  27   44:goto            116
		if(f3 >= 100F)
	//*  28   47:fload           6
	//*  29   49:ldc1            #88  <Float 100F>
	//*  30   51:fcmpl           
	//*  31   52:iflt            61
		{
			f = 256F;
	//   32   55:ldc1            #89  <Float 256F>
	//   33   57:fstore_3        
		} else
	//*  34   58:goto            116
		{
			int i = (int)f3;
	//   35   61:fload           6
	//   36   63:f2i             
	//   37   64:istore          7
			if(i != 0)
	//*  38   66:iload           7
	//*  39   68:ifne            74
	//*  40   71:goto            85
				f = tableOfContents[i - 1];
	//   41   74:aload_0         
	//   42   75:getfield        #32  <Field long[] tableOfContents>
	//   43   78:iload           7
	//   44   80:iconst_1        
	//   45   81:isub            
	//   46   82:laload          
	//   47   83:l2f             
	//   48   84:fstore_3        
			if(i < 99)
	//*  49   85:iload           7
	//*  50   87:bipush          99
	//*  51   89:icmpge          102
				f1 = tableOfContents[i];
	//   52   92:aload_0         
	//   53   93:getfield        #32  <Field long[] tableOfContents>
	//   54   96:iload           7
	//   55   98:laload          
	//   56   99:l2f             
	//   57  100:fstore          4
			f += (f1 - f) * (f3 - (float)i);
	//   58  102:fload_3         
	//   59  103:fload           4
	//   60  105:fload_3         
	//   61  106:fsub            
	//   62  107:fload           6
	//   63  109:iload           7
	//   64  111:i2f             
	//   65  112:fsub            
	//   66  113:fmul            
	//   67  114:fadd            
	//   68  115:fstore_3        
		}
		long l1 = Math.round((double)f * 0.00390625D * (double)sizeBytes);
	//   69  116:fload_3         
	//   70  117:f2d             
	//   71  118:ldc2w           #90  <Double 0.00390625D>
	//   72  121:dmul            
	//   73  122:aload_0         
	//   74  123:getfield        #34  <Field long sizeBytes>
	//   75  126:l2d             
	//   76  127:dmul            
	//   77  128:invokestatic    #97  <Method long Math.round(double)>
	//   78  131:lstore          8
		long l2 = firstFramePosition;
	//   79  133:aload_0         
	//   80  134:getfield        #26  <Field long firstFramePosition>
	//   81  137:lstore          10
		l = inputLength;
	//   82  139:aload_0         
	//   83  140:getfield        #30  <Field long inputLength>
	//   84  143:lstore_1        
		if(l != -1L)
	//*  85  144:lload_1         
	//*  86  145:ldc2w           #98  <Long -1L>
	//*  87  148:lcmp            
	//*  88  149:ifeq            159
			l--;
	//   89  152:lload_1         
	//   90  153:lconst_1        
	//   91  154:lsub            
	//   92  155:lstore_1        
		else
	//*  93  156:goto            175
			l = ((l2 - (long)headerSize) + sizeBytes) - 1L;
	//   94  159:lload           10
	//   95  161:aload_0         
	//   96  162:getfield        #36  <Field int headerSize>
	//   97  165:i2l             
	//   98  166:lsub            
	//   99  167:aload_0         
	//  100  168:getfield        #34  <Field long sizeBytes>
	//  101  171:ladd            
	//  102  172:lconst_1        
	//  103  173:lsub            
	//  104  174:lstore_1        
		return Math.min(l1 + l2, l);
	//  105  175:lload           8
	//  106  177:lload           10
	//  107  179:ladd            
	//  108  180:lload_1         
	//  109  181:invokestatic    #103 <Method long Math.min(long, long)>
	//  110  184:lreturn         
	}

	public long getTimeUs(long l)
	{
		boolean flag = isSeekable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method boolean isSeekable()>
	//    2    4:istore          14
		long l2 = 0L;
	//    3    6:lconst_0        
	//    4    7:lstore          8
		if(flag)
	//*   5    9:iload           14
	//*   6   11:ifeq            159
		{
			long l1 = firstFramePosition;
	//    7   14:aload_0         
	//    8   15:getfield        #26  <Field long firstFramePosition>
	//    9   18:lstore          6
			if(l < l1)
	//*  10   20:lload_1         
	//*  11   21:lload           6
	//*  12   23:lcmp            
	//*  13   24:ifge            29
				return 0L;
	//   14   27:lconst_0        
	//   15   28:lreturn         
			double d = ((double)(l - l1) * 256D) / (double)sizeBytes;
	//   16   29:lload_1         
	//   17   30:lload           6
	//   18   32:lsub            
	//   19   33:l2d             
	//   20   34:ldc2w           #105 <Double 256D>
	//   21   37:dmul            
	//   22   38:aload_0         
	//   23   39:getfield        #34  <Field long sizeBytes>
	//   24   42:l2d             
	//   25   43:ddiv            
	//   26   44:dstore_3        
			int i = Util.binarySearchFloor(tableOfContents, (long)d, true, false) + 1;
	//   27   45:aload_0         
	//   28   46:getfield        #32  <Field long[] tableOfContents>
	//   29   49:dload_3         
	//   30   50:d2l             
	//   31   51:iconst_1        
	//   32   52:iconst_0        
	//   33   53:invokestatic    #110 <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
	//   34   56:iconst_1        
	//   35   57:iadd            
	//   36   58:istore          5
			long l3 = getTimeUsForTocPosition(i);
	//   37   60:aload_0         
	//   38   61:iload           5
	//   39   63:invokespecial   #112 <Method long getTimeUsForTocPosition(int)>
	//   40   66:lstore          10
			if(i == 0)
	//*  41   68:iload           5
	//*  42   70:ifne            78
				l = 0L;
	//   43   73:lconst_0        
	//   44   74:lstore_1        
			else
	//*  45   75:goto            88
				l = tableOfContents[i - 1];
	//   46   78:aload_0         
	//   47   79:getfield        #32  <Field long[] tableOfContents>
	//   48   82:iload           5
	//   49   84:iconst_1        
	//   50   85:isub            
	//   51   86:laload          
	//   52   87:lstore_1        
			if(i == 99)
	//*  53   88:iload           5
	//*  54   90:bipush          99
	//*  55   92:icmpne          103
				l1 = 256L;
	//   56   95:ldc2w           #113 <Long 256L>
	//   57   98:lstore          6
			else
	//*  58  100:goto            112
				l1 = tableOfContents[i];
	//   59  103:aload_0         
	//   60  104:getfield        #32  <Field long[] tableOfContents>
	//   61  107:iload           5
	//   62  109:laload          
	//   63  110:lstore          6
			long l4 = getTimeUsForTocPosition(i + 1);
	//   64  112:aload_0         
	//   65  113:iload           5
	//   66  115:iconst_1        
	//   67  116:iadd            
	//   68  117:invokespecial   #112 <Method long getTimeUsForTocPosition(int)>
	//   69  120:lstore          12
			if(l1 == l)
	//*  70  122:lload           6
	//*  71  124:lload_1         
	//*  72  125:lcmp            
	//*  73  126:ifne            135
				l = l2;
	//   74  129:lload           8
	//   75  131:lstore_1        
			else
	//*  76  132:goto            154
				l = (long)(((double)(l4 - l3) * (d - (double)l)) / (double)(l1 - l));
	//   77  135:lload           12
	//   78  137:lload           10
	//   79  139:lsub            
	//   80  140:l2d             
	//   81  141:dload_3         
	//   82  142:lload_1         
	//   83  143:l2d             
	//   84  144:dsub            
	//   85  145:dmul            
	//   86  146:lload           6
	//   87  148:lload_1         
	//   88  149:lsub            
	//   89  150:l2d             
	//   90  151:ddiv            
	//   91  152:d2l             
	//   92  153:lstore_1        
			return l3 + l;
	//   93  154:lload           10
	//   94  156:lload_1         
	//   95  157:ladd            
	//   96  158:lreturn         
		} else
		{
			return 0L;
	//   97  159:lconst_0        
	//   98  160:lreturn         
		}
	}

	public boolean isSeekable()
	{
		return tableOfContents != null;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field long[] tableOfContents>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private final long durationUs;
	private final long firstFramePosition;
	private final int headerSize;
	private final long inputLength;
	private final long sizeBytes;
	private final long tableOfContents[];
}
