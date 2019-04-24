// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp3;

import android.util.Log;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

final class XingSeeker
	implements Mp3Extractor.Seeker
{

	private XingSeeker(long l, int i, long l1)
	{
		this(l, i, l1, -1L, ((long []) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:lload           4
	//    4    5:ldc2w           #21  <Long -1L>
	//    5    8:aconst_null     
	//    6    9:invokespecial   #25  <Method void XingSeeker(long, int, long, long, long[])>
	//    7   12:return          
	}

	private XingSeeker(long l, int i, long l1, long l2, 
			long al[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		dataStartPosition = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #31  <Field long dataStartPosition>
		xingFrameSize = i;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #33  <Field int xingFrameSize>
		durationUs = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #35  <Field long durationUs>
		dataSize = l2;
	//   11   20:aload_0         
	//   12   21:lload           6
	//   13   23:putfield        #37  <Field long dataSize>
		tableOfContents = al;
	//   14   26:aload_0         
	//   15   27:aload           8
	//   16   29:putfield        #39  <Field long[] tableOfContents>
	//   17   32:return          
	}

	public static XingSeeker create(long l, long l1, MpegAudioHeader mpegaudioheader, ParsableByteArray parsablebytearray)
	{
		int i = mpegaudioheader.samplesPerFrame;
	//    0    0:aload           4
	//    1    2:getfield        #46  <Field int MpegAudioHeader.samplesPerFrame>
	//    2    5:istore          6
		int k = mpegaudioheader.sampleRate;
	//    3    7:aload           4
	//    4    9:getfield        #49  <Field int MpegAudioHeader.sampleRate>
	//    5   12:istore          7
		int i1 = parsablebytearray.readInt();
	//    6   14:aload           5
	//    7   16:invokevirtual   #55  <Method int ParsableByteArray.readInt()>
	//    8   19:istore          8
		if((i1 & 1) == 1)
	//*   9   21:iload           8
	//*  10   23:iconst_1        
	//*  11   24:iand            
	//*  12   25:iconst_1        
	//*  13   26:icmpne          224
		{
			int j1 = parsablebytearray.readUnsignedIntToInt();
	//   14   29:aload           5
	//   15   31:invokevirtual   #58  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   16   34:istore          9
			if(j1 != 0)
	//*  17   36:iload           9
	//*  18   38:ifne            44
	//*  19   41:goto            224
			{
				long l2 = Util.scaleLargeTimestamp(j1, (long)i * 0xf4240L, k);
	//   20   44:iload           9
	//   21   46:i2l             
	//   22   47:iload           6
	//   23   49:i2l             
	//   24   50:ldc2w           #59  <Long 0xf4240L>
	//   25   53:lmul            
	//   26   54:iload           7
	//   27   56:i2l             
	//   28   57:invokestatic    #66  <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   29   60:lstore          10
				if((i1 & 6) != 6)
	//*  30   62:iload           8
	//*  31   64:bipush          6
	//*  32   66:iand            
	//*  33   67:bipush          6
	//*  34   69:icmpeq          88
					return new XingSeeker(l1, mpegaudioheader.frameSize, l2);
	//   35   72:new             #2   <Class XingSeeker>
	//   36   75:dup             
	//   37   76:lload_2         
	//   38   77:aload           4
	//   39   79:getfield        #69  <Field int MpegAudioHeader.frameSize>
	//   40   82:lload           10
	//   41   84:invokespecial   #71  <Method void XingSeeker(long, int, long)>
	//   42   87:areturn         
				long l3 = parsablebytearray.readUnsignedIntToInt();
	//   43   88:aload           5
	//   44   90:invokevirtual   #58  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   45   93:i2l             
	//   46   94:lstore          12
				long al[] = new long[100];
	//   47   96:bipush          100
	//   48   98:newarray        long[]
	//   49  100:astore          16
				for(int j = 0; j < 100; j++)
	//*  50  102:iconst_0        
	//*  51  103:istore          6
	//*  52  105:iload           6
	//*  53  107:bipush          100
	//*  54  109:icmpge          132
					al[j] = parsablebytearray.readUnsignedByte();
	//   55  112:aload           16
	//   56  114:iload           6
	//   57  116:aload           5
	//   58  118:invokevirtual   #74  <Method int ParsableByteArray.readUnsignedByte()>
	//   59  121:i2l             
	//   60  122:lastore         

	//   61  123:iload           6
	//   62  125:iconst_1        
	//   63  126:iadd            
	//   64  127:istore          6
	//*  65  129:goto            105
				if(l != -1L)
	//*  66  132:lload_0         
	//*  67  133:ldc2w           #21  <Long -1L>
	//*  68  136:lcmp            
	//*  69  137:ifeq            204
				{
					long l4 = l1 + l3;
	//   70  140:lload_2         
	//   71  141:lload           12
	//   72  143:ladd            
	//   73  144:lstore          14
					if(l != l4)
	//*  74  146:lload_0         
	//*  75  147:lload           14
	//*  76  149:lcmp            
	//*  77  150:ifeq            204
					{
						parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   78  153:new             #76  <Class StringBuilder>
	//   79  156:dup             
	//   80  157:invokespecial   #77  <Method void StringBuilder()>
	//   81  160:astore          5
						((StringBuilder) (parsablebytearray)).append("XING data size mismatch: ");
	//   82  162:aload           5
	//   83  164:ldc1            #79  <String "XING data size mismatch: ">
	//   84  166:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   85  169:pop             
						((StringBuilder) (parsablebytearray)).append(l);
	//   86  170:aload           5
	//   87  172:lload_0         
	//   88  173:invokevirtual   #86  <Method StringBuilder StringBuilder.append(long)>
	//   89  176:pop             
						((StringBuilder) (parsablebytearray)).append(", ");
	//   90  177:aload           5
	//   91  179:ldc1            #88  <String ", ">
	//   92  181:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   93  184:pop             
						((StringBuilder) (parsablebytearray)).append(l4);
	//   94  185:aload           5
	//   95  187:lload           14
	//   96  189:invokevirtual   #86  <Method StringBuilder StringBuilder.append(long)>
	//   97  192:pop             
						Log.w("XingSeeker", ((StringBuilder) (parsablebytearray)).toString());
	//   98  193:ldc1            #10  <String "XingSeeker">
	//   99  195:aload           5
	//  100  197:invokevirtual   #92  <Method String StringBuilder.toString()>
	//  101  200:invokestatic    #98  <Method int Log.w(String, String)>
	//  102  203:pop             
					}
				}
				return new XingSeeker(l1, mpegaudioheader.frameSize, l2, l3, al);
	//  103  204:new             #2   <Class XingSeeker>
	//  104  207:dup             
	//  105  208:lload_2         
	//  106  209:aload           4
	//  107  211:getfield        #69  <Field int MpegAudioHeader.frameSize>
	//  108  214:lload           10
	//  109  216:lload           12
	//  110  218:aload           16
	//  111  220:invokespecial   #25  <Method void XingSeeker(long, int, long, long, long[])>
	//  112  223:areturn         
			}
		}
		return null;
	//  113  224:aconst_null     
	//  114  225:areturn         
	}

	private long getTimeUsForTableIndex(int i)
	{
		return (durationUs * (long)i) / 100L;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field long durationUs>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:lmul            
	//    5    7:ldc2w           #101 <Long 100L>
	//    6   10:ldiv            
	//    7   11:lreturn         
	}

	public long getDurationUs()
	{
		return durationUs;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field long durationUs>
	//    2    4:lreturn         
	}

	public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long l)
	{
		if(!isSeekable())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #110 <Method boolean isSeekable()>
	//*   2    4:ifne            33
			return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(new SeekPoint(0L, dataStartPosition + (long)xingFrameSize));
	//    3    7:new             #112 <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
	//    4   10:dup             
	//    5   11:new             #114 <Class SeekPoint>
	//    6   14:dup             
	//    7   15:lconst_0        
	//    8   16:aload_0         
	//    9   17:getfield        #31  <Field long dataStartPosition>
	//   10   20:aload_0         
	//   11   21:getfield        #33  <Field int xingFrameSize>
	//   12   24:i2l             
	//   13   25:ladd            
	//   14   26:invokespecial   #117 <Method void SeekPoint(long, long)>
	//   15   29:invokespecial   #120 <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint)>
	//   16   32:areturn         
		l = Util.constrainValue(l, 0L, durationUs);
	//   17   33:lload_1         
	//   18   34:lconst_0        
	//   19   35:aload_0         
	//   20   36:getfield        #35  <Field long durationUs>
	//   21   39:invokestatic    #123 <Method long Util.constrainValue(long, long, long)>
	//   22   42:lstore_1        
		double d1 = ((double)l * 100D) / (double)durationUs;
	//   23   43:lload_1         
	//   24   44:l2d             
	//   25   45:ldc2w           #124 <Double 100D>
	//   26   48:dmul            
	//   27   49:aload_0         
	//   28   50:getfield        #35  <Field long durationUs>
	//   29   53:l2d             
	//   30   54:ddiv            
	//   31   55:dstore          5
		double d = 0.0D;
	//   32   57:dconst_0        
	//   33   58:dstore_3        
		if(d1 > 0.0D)
	//*  34   59:dload           5
	//*  35   61:dconst_0        
	//*  36   62:dcmpg           
	//*  37   63:ifgt            69
	//*  38   66:goto            140
			if(d1 >= 100D)
	//*  39   69:dload           5
	//*  40   71:ldc2w           #124 <Double 100D>
	//*  41   74:dcmpl           
	//*  42   75:iflt            85
			{
				d = 256D;
	//   43   78:ldc2w           #126 <Double 256D>
	//   44   81:dstore_3        
			} else
	//*  45   82:goto            140
			{
				int i = (int)d1;
	//   46   85:dload           5
	//   47   87:d2i             
	//   48   88:istore          9
				double d2 = tableOfContents[i];
	//   49   90:aload_0         
	//   50   91:getfield        #39  <Field long[] tableOfContents>
	//   51   94:iload           9
	//   52   96:laload          
	//   53   97:l2d             
	//   54   98:dstore          7
				if(i == 99)
	//*  55  100:iload           9
	//*  56  102:bipush          99
	//*  57  104:icmpne          114
					d = 256D;
	//   58  107:ldc2w           #126 <Double 256D>
	//   59  110:dstore_3        
				else
	//*  60  111:goto            125
					d = tableOfContents[i + 1];
	//   61  114:aload_0         
	//   62  115:getfield        #39  <Field long[] tableOfContents>
	//   63  118:iload           9
	//   64  120:iconst_1        
	//   65  121:iadd            
	//   66  122:laload          
	//   67  123:l2d             
	//   68  124:dstore_3        
				d = d2 + (d1 - (double)i) * (d - d2);
	//   69  125:dload           7
	//   70  127:dload           5
	//   71  129:iload           9
	//   72  131:i2d             
	//   73  132:dsub            
	//   74  133:dload_3         
	//   75  134:dload           7
	//   76  136:dsub            
	//   77  137:dmul            
	//   78  138:dadd            
	//   79  139:dstore_3        
			}
		long l1 = Util.constrainValue(Math.round((d / 256D) * (double)dataSize), xingFrameSize, dataSize - 1L);
	//   80  140:dload_3         
	//   81  141:ldc2w           #126 <Double 256D>
	//   82  144:ddiv            
	//   83  145:aload_0         
	//   84  146:getfield        #37  <Field long dataSize>
	//   85  149:l2d             
	//   86  150:dmul            
	//   87  151:invokestatic    #133 <Method long Math.round(double)>
	//   88  154:aload_0         
	//   89  155:getfield        #33  <Field int xingFrameSize>
	//   90  158:i2l             
	//   91  159:aload_0         
	//   92  160:getfield        #37  <Field long dataSize>
	//   93  163:lconst_1        
	//   94  164:lsub            
	//   95  165:invokestatic    #123 <Method long Util.constrainValue(long, long, long)>
	//   96  168:lstore          10
		return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(new SeekPoint(l, dataStartPosition + l1));
	//   97  170:new             #112 <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
	//   98  173:dup             
	//   99  174:new             #114 <Class SeekPoint>
	//  100  177:dup             
	//  101  178:lload_1         
	//  102  179:aload_0         
	//  103  180:getfield        #31  <Field long dataStartPosition>
	//  104  183:lload           10
	//  105  185:ladd            
	//  106  186:invokespecial   #117 <Method void SeekPoint(long, long)>
	//  107  189:invokespecial   #120 <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint)>
	//  108  192:areturn         
	}

	public long getTimeUs(long l)
	{
		l -= dataStartPosition;
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field long dataStartPosition>
	//    3    5:lsub            
	//    4    6:lstore_1        
		if(isSeekable() && l > (long)xingFrameSize)
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #110 <Method boolean isSeekable()>
	//*   7   11:ifeq            145
	//*   8   14:lload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #33  <Field int xingFrameSize>
	//*  11   19:i2l             
	//*  12   20:lcmp            
	//*  13   21:ifgt            27
	//*  14   24:goto            145
		{
			double d = ((double)l * 256D) / (double)dataSize;
	//   15   27:lload_1         
	//   16   28:l2d             
	//   17   29:ldc2w           #126 <Double 256D>
	//   18   32:dmul            
	//   19   33:aload_0         
	//   20   34:getfield        #37  <Field long dataSize>
	//   21   37:l2d             
	//   22   38:ddiv            
	//   23   39:dstore_3        
			int i = Util.binarySearchFloor(tableOfContents, (long)d, true, true);
	//   24   40:aload_0         
	//   25   41:getfield        #39  <Field long[] tableOfContents>
	//   26   44:dload_3         
	//   27   45:d2l             
	//   28   46:iconst_1        
	//   29   47:iconst_1        
	//   30   48:invokestatic    #139 <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
	//   31   51:istore          5
			long l1 = getTimeUsForTableIndex(i);
	//   32   53:aload_0         
	//   33   54:iload           5
	//   34   56:invokespecial   #141 <Method long getTimeUsForTableIndex(int)>
	//   35   59:lstore          7
			long l2 = tableOfContents[i];
	//   36   61:aload_0         
	//   37   62:getfield        #39  <Field long[] tableOfContents>
	//   38   65:iload           5
	//   39   67:laload          
	//   40   68:lstore          9
			int j = i + 1;
	//   41   70:iload           5
	//   42   72:iconst_1        
	//   43   73:iadd            
	//   44   74:istore          6
			long l3 = getTimeUsForTableIndex(j);
	//   45   76:aload_0         
	//   46   77:iload           6
	//   47   79:invokespecial   #141 <Method long getTimeUsForTableIndex(int)>
	//   48   82:lstore          11
			if(i == 99)
	//*  49   84:iload           5
	//*  50   86:bipush          99
	//*  51   88:icmpne          98
				l = 256L;
	//   52   91:ldc2w           #142 <Long 256L>
	//   53   94:lstore_1        
			else
	//*  54   95:goto            106
				l = tableOfContents[j];
	//   55   98:aload_0         
	//   56   99:getfield        #39  <Field long[] tableOfContents>
	//   57  102:iload           6
	//   58  104:laload          
	//   59  105:lstore_1        
			if(l2 == l)
	//*  60  106:lload           9
	//*  61  108:lload_1         
	//*  62  109:lcmp            
	//*  63  110:ifne            118
				d = 0.0D;
	//   64  113:dconst_0        
	//   65  114:dstore_3        
			else
	//*  66  115:goto            130
				d = (d - (double)l2) / (double)(l - l2);
	//   67  118:dload_3         
	//   68  119:lload           9
	//   69  121:l2d             
	//   70  122:dsub            
	//   71  123:lload_1         
	//   72  124:lload           9
	//   73  126:lsub            
	//   74  127:l2d             
	//   75  128:ddiv            
	//   76  129:dstore_3        
			return l1 + Math.round(d * (double)(l3 - l1));
	//   77  130:lload           7
	//   78  132:dload_3         
	//   79  133:lload           11
	//   80  135:lload           7
	//   81  137:lsub            
	//   82  138:l2d             
	//   83  139:dmul            
	//   84  140:invokestatic    #133 <Method long Math.round(double)>
	//   85  143:ladd            
	//   86  144:lreturn         
		} else
		{
			return 0L;
	//   87  145:lconst_0        
	//   88  146:lreturn         
		}
	}

	public boolean isSeekable()
	{
		return tableOfContents != null;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field long[] tableOfContents>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private static final String TAG = "XingSeeker";
	private final long dataSize;
	private final long dataStartPosition;
	private final long durationUs;
	private final long tableOfContents[];
	private final int xingFrameSize;
}
