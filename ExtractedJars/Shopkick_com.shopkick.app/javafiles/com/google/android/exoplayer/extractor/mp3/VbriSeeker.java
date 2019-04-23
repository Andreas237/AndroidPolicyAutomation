// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp3;

import com.google.android.exoplayer.util.*;

final class VbriSeeker
	implements Mp3Extractor.Seeker
{

	private VbriSeeker(long al[], long al1[], long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		timesUs = al;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field long[] timesUs>
		positions = al1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field long[] positions>
		durationUs = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #22  <Field long durationUs>
	//   11   19:return          
	}

	public static VbriSeeker create(MpegAudioHeader mpegaudioheader, ParsableByteArray parsablebytearray, long l, long l1)
	{
		parsablebytearray.skipBytes(10);
	//    0    0:aload_1         
	//    1    1:bipush          10
	//    2    3:invokevirtual   #31  <Method void ParsableByteArray.skipBytes(int)>
		int i = parsablebytearray.readInt();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #35  <Method int ParsableByteArray.readInt()>
	//    5   10:istore          6
		if(i <= 0)
	//*   6   12:iload           6
	//*   7   14:ifgt            19
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
		int k = mpegaudioheader.sampleRate;
	//   10   19:aload_0         
	//   11   20:getfield        #41  <Field int MpegAudioHeader.sampleRate>
	//   12   23:istore          7
		long l2 = i;
	//   13   25:iload           6
	//   14   27:i2l             
	//   15   28:lstore          11
		if(k >= 32000)
	//*  16   30:iload           7
	//*  17   32:sipush          32000
	//*  18   35:icmplt          46
			i = 1152;
	//   19   38:sipush          1152
	//   20   41:istore          6
		else
	//*  21   43:goto            51
			i = 576;
	//   22   46:sipush          576
	//   23   49:istore          6
		long l3 = Util.scaleLargeTimestamp(l2, 0xf4240L * (long)i, k);
	//   24   51:lload           11
	//   25   53:ldc2w           #42  <Long 0xf4240L>
	//   26   56:iload           6
	//   27   58:i2l             
	//   28   59:lmul            
	//   29   60:iload           7
	//   30   62:i2l             
	//   31   63:invokestatic    #49  <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   32   66:lstore          13
		int i1 = parsablebytearray.readUnsignedShort();
	//   33   68:aload_1         
	//   34   69:invokevirtual   #52  <Method int ParsableByteArray.readUnsignedShort()>
	//   35   72:istore          8
		int j1 = parsablebytearray.readUnsignedShort();
	//   36   74:aload_1         
	//   37   75:invokevirtual   #52  <Method int ParsableByteArray.readUnsignedShort()>
	//   38   78:istore          9
		int k1 = parsablebytearray.readUnsignedShort();
	//   39   80:aload_1         
	//   40   81:invokevirtual   #52  <Method int ParsableByteArray.readUnsignedShort()>
	//   41   84:istore          10
		parsablebytearray.skipBytes(2);
	//   42   86:aload_1         
	//   43   87:iconst_2        
	//   44   88:invokevirtual   #31  <Method void ParsableByteArray.skipBytes(int)>
		l2 = l + (long)mpegaudioheader.frameSize;
	//   45   91:lload_2         
	//   46   92:aload_0         
	//   47   93:getfield        #55  <Field int MpegAudioHeader.frameSize>
	//   48   96:i2l             
	//   49   97:ladd            
	//   50   98:lstore          11
		i = i1 + 1;
	//   51  100:iload           8
	//   52  102:iconst_1        
	//   53  103:iadd            
	//   54  104:istore          6
		mpegaudioheader = ((MpegAudioHeader) (new long[i]));
	//   55  106:iload           6
	//   56  108:newarray        long[]
	//   57  110:astore_0        
		long al[] = new long[i];
	//   58  111:iload           6
	//   59  113:newarray        long[]
	//   60  115:astore          15
		mpegaudioheader[0] = 0L;
	//   61  117:aload_0         
	//   62  118:iconst_0        
	//   63  119:lconst_0        
	//   64  120:lastore         
		al[0] = l2;
	//   65  121:aload           15
	//   66  123:iconst_0        
	//   67  124:lload           11
	//   68  126:lastore         
		k = 1;
	//   69  127:iconst_1        
	//   70  128:istore          7
		l = l3;
	//   71  130:lload           13
	//   72  132:lstore_2        
		for(; k < mpegaudioheader.length; k++)
	//*  73  133:iload           7
	//*  74  135:aload_0         
	//*  75  136:arraylength     
	//*  76  137:icmpge          272
		{
			int j;
			switch(k1)
	//*  77  140:iload           10
			{
	//*  78  142:tableswitch     1 4: default 172
	//	               1 201
	//	               2 192
	//	               3 183
	//	               4 174
			default:
				return null;
	//   79  172:aconst_null     
	//   80  173:areturn         

			case 4: // '\004'
				j = parsablebytearray.readUnsignedIntToInt();
	//   81  174:aload_1         
	//   82  175:invokevirtual   #58  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   83  178:istore          6
				break;

	//*  84  180:goto            207
			case 3: // '\003'
				j = parsablebytearray.readUnsignedInt24();
	//   85  183:aload_1         
	//   86  184:invokevirtual   #61  <Method int ParsableByteArray.readUnsignedInt24()>
	//   87  187:istore          6
				break;

	//*  88  189:goto            207
			case 2: // '\002'
				j = parsablebytearray.readUnsignedShort();
	//   89  192:aload_1         
	//   90  193:invokevirtual   #52  <Method int ParsableByteArray.readUnsignedShort()>
	//   91  196:istore          6
				break;

	//*  92  198:goto            207
			case 1: // '\001'
				j = parsablebytearray.readUnsignedByte();
	//   93  201:aload_1         
	//   94  202:invokevirtual   #64  <Method int ParsableByteArray.readUnsignedByte()>
	//   95  205:istore          6
				break;
			}
			l2 += j * j1;
	//   96  207:lload           11
	//   97  209:iload           6
	//   98  211:iload           9
	//   99  213:imul            
	//  100  214:i2l             
	//  101  215:ladd            
	//  102  216:lstore          11
			mpegaudioheader[k] = ((long)k * l) / (long)i1;
	//  103  218:aload_0         
	//  104  219:iload           7
	//  105  221:iload           7
	//  106  223:i2l             
	//  107  224:lload_2         
	//  108  225:lmul            
	//  109  226:iload           8
	//  110  228:i2l             
	//  111  229:ldiv            
	//  112  230:lastore         
			long l4;
			if(l1 == -1L)
	//* 113  231:lload           4
	//* 114  233:ldc2w           #65  <Long -1L>
	//* 115  236:lcmp            
	//* 116  237:ifne            247
				l4 = l2;
	//  117  240:lload           11
	//  118  242:lstore          13
			else
	//* 119  244:goto            256
				l4 = Math.min(l1, l2);
	//  120  247:lload           4
	//  121  249:lload           11
	//  122  251:invokestatic    #72  <Method long Math.min(long, long)>
	//  123  254:lstore          13
			al[k] = l4;
	//  124  256:aload           15
	//  125  258:iload           7
	//  126  260:lload           13
	//  127  262:lastore         
		}

	//  128  263:iload           7
	//  129  265:iconst_1        
	//  130  266:iadd            
	//  131  267:istore          7
	//* 132  269:goto            133
		return new VbriSeeker(((long []) (mpegaudioheader)), al, l);
	//  133  272:new             #2   <Class VbriSeeker>
	//  134  275:dup             
	//  135  276:aload_0         
	//  136  277:aload           15
	//  137  279:lload_2         
	//  138  280:invokespecial   #74  <Method void VbriSeeker(long[], long[], long)>
	//  139  283:areturn         
	}

	public long getDurationUs()
	{
		return durationUs;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field long durationUs>
	//    2    4:lreturn         
	}

	public long getPosition(long l)
	{
		return positions[Util.binarySearchFloor(timesUs, l, true, true)];
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field long[] positions>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field long[] timesUs>
	//    4    8:lload_1         
	//    5    9:iconst_1        
	//    6   10:iconst_1        
	//    7   11:invokestatic    #82  <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
	//    8   14:laload          
	//    9   15:lreturn         
	}

	public long getTimeUs(long l)
	{
		return timesUs[Util.binarySearchFloor(positions, l, true, true)];
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field long[] timesUs>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field long[] positions>
	//    4    8:lload_1         
	//    5    9:iconst_1        
	//    6   10:iconst_1        
	//    7   11:invokestatic    #82  <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
	//    8   14:laload          
	//    9   15:lreturn         
	}

	public boolean isSeekable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private final long durationUs;
	private final long positions[];
	private final long timesUs[];
}
