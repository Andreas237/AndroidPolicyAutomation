// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp3;

import android.util.Log;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

final class VbriSeeker
	implements Mp3Extractor.Seeker
{

	private VbriSeeker(long al[], long al1[], long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		timesUs = al;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field long[] timesUs>
		positions = al1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field long[] positions>
		durationUs = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #26  <Field long durationUs>
	//   11   19:return          
	}

	public static VbriSeeker create(long l, long l1, MpegAudioHeader mpegaudioheader, ParsableByteArray parsablebytearray)
	{
		parsablebytearray.skipBytes(10);
	//    0    0:aload           5
	//    1    2:bipush          10
	//    2    4:invokevirtual   #35  <Method void ParsableByteArray.skipBytes(int)>
		int i = parsablebytearray.readInt();
	//    3    7:aload           5
	//    4    9:invokevirtual   #39  <Method int ParsableByteArray.readInt()>
	//    5   12:istore          6
		if(i <= 0)
	//*   6   14:iload           6
	//*   7   16:ifgt            21
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
		int k = mpegaudioheader.sampleRate;
	//   10   21:aload           4
	//   11   23:getfield        #45  <Field int MpegAudioHeader.sampleRate>
	//   12   26:istore          7
		long l2 = i;
	//   13   28:iload           6
	//   14   30:i2l             
	//   15   31:lstore          11
		if(k >= 32000)
	//*  16   33:iload           7
	//*  17   35:sipush          32000
	//*  18   38:icmplt          49
			i = 1152;
	//   19   41:sipush          1152
	//   20   44:istore          6
		else
	//*  21   46:goto            54
			i = 576;
	//   22   49:sipush          576
	//   23   52:istore          6
		l2 = Util.scaleLargeTimestamp(l2, 0xf4240L * (long)i, k);
	//   24   54:lload           11
	//   25   56:ldc2w           #46  <Long 0xf4240L>
	//   26   59:iload           6
	//   27   61:i2l             
	//   28   62:lmul            
	//   29   63:iload           7
	//   30   65:i2l             
	//   31   66:invokestatic    #53  <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   32   69:lstore          11
		int i1 = parsablebytearray.readUnsignedShort();
	//   33   71:aload           5
	//   34   73:invokevirtual   #56  <Method int ParsableByteArray.readUnsignedShort()>
	//   35   76:istore          8
		int j1 = parsablebytearray.readUnsignedShort();
	//   36   78:aload           5
	//   37   80:invokevirtual   #56  <Method int ParsableByteArray.readUnsignedShort()>
	//   38   83:istore          9
		int k1 = parsablebytearray.readUnsignedShort();
	//   39   85:aload           5
	//   40   87:invokevirtual   #56  <Method int ParsableByteArray.readUnsignedShort()>
	//   41   90:istore          10
		parsablebytearray.skipBytes(2);
	//   42   92:aload           5
	//   43   94:iconst_2        
	//   44   95:invokevirtual   #35  <Method void ParsableByteArray.skipBytes(int)>
		long l4 = mpegaudioheader.frameSize;
	//   45   98:aload           4
	//   46  100:getfield        #59  <Field int MpegAudioHeader.frameSize>
	//   47  103:i2l             
	//   48  104:lstore          15
		mpegaudioheader = ((MpegAudioHeader) (new long[i1]));
	//   49  106:iload           8
	//   50  108:newarray        long[]
	//   51  110:astore          4
		long al[] = new long[i1];
	//   52  112:iload           8
	//   53  114:newarray        long[]
	//   54  116:astore          19
		k = 0;
	//   55  118:iconst_0        
	//   56  119:istore          7
		long l3;
		long l5;
		for(l3 = l1; k < i1; l3 += l5)
	//*  57  121:lload_2         
	//*  58  122:lstore          13
	//*  59  124:iload           7
	//*  60  126:iload           8
	//*  61  128:icmpge          255
		{
			mpegaudioheader[k] = ((long)k * l2) / (long)i1;
	//   62  131:aload           4
	//   63  133:iload           7
	//   64  135:iload           7
	//   65  137:i2l             
	//   66  138:lload           11
	//   67  140:lmul            
	//   68  141:iload           8
	//   69  143:i2l             
	//   70  144:ldiv            
	//   71  145:lastore         
			al[k] = Math.max(l3, l1 + l4);
	//   72  146:aload           19
	//   73  148:iload           7
	//   74  150:lload           13
	//   75  152:lload_2         
	//   76  153:lload           15
	//   77  155:ladd            
	//   78  156:invokestatic    #65  <Method long Math.max(long, long)>
	//   79  159:lastore         
			int j;
			switch(k1)
	//*  80  160:iload           10
			{
	//*  81  162:tableswitch     1 4: default 192
	//	               1 224
	//	               2 214
	//	               3 204
	//	               4 194
			default:
				return null;
	//   82  192:aconst_null     
	//   83  193:areturn         

			case 4: // '\004'
				j = parsablebytearray.readUnsignedIntToInt();
	//   84  194:aload           5
	//   85  196:invokevirtual   #68  <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   86  199:istore          6
				break;

	//*  87  201:goto            231
			case 3: // '\003'
				j = parsablebytearray.readUnsignedInt24();
	//   88  204:aload           5
	//   89  206:invokevirtual   #71  <Method int ParsableByteArray.readUnsignedInt24()>
	//   90  209:istore          6
				break;

	//*  91  211:goto            231
			case 2: // '\002'
				j = parsablebytearray.readUnsignedShort();
	//   92  214:aload           5
	//   93  216:invokevirtual   #56  <Method int ParsableByteArray.readUnsignedShort()>
	//   94  219:istore          6
				break;

	//*  95  221:goto            231
			case 1: // '\001'
				j = parsablebytearray.readUnsignedByte();
	//   96  224:aload           5
	//   97  226:invokevirtual   #74  <Method int ParsableByteArray.readUnsignedByte()>
	//   98  229:istore          6
				break;
			}
			l5 = j * j1;
	//   99  231:iload           6
	//  100  233:iload           9
	//  101  235:imul            
	//  102  236:i2l             
	//  103  237:lstore          17
			k++;
	//  104  239:iload           7
	//  105  241:iconst_1        
	//  106  242:iadd            
	//  107  243:istore          7
		}

	//  108  245:lload           13
	//  109  247:lload           17
	//  110  249:ladd            
	//  111  250:lstore          13
	//* 112  252:goto            124
		if(l != -1L && l != l3)
	//* 113  255:lload_0         
	//* 114  256:ldc2w           #75  <Long -1L>
	//* 115  259:lcmp            
	//* 116  260:ifeq            321
	//* 117  263:lload_0         
	//* 118  264:lload           13
	//* 119  266:lcmp            
	//* 120  267:ifeq            321
		{
			parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//  121  270:new             #78  <Class StringBuilder>
	//  122  273:dup             
	//  123  274:invokespecial   #79  <Method void StringBuilder()>
	//  124  277:astore          5
			((StringBuilder) (parsablebytearray)).append("VBRI data size mismatch: ");
	//  125  279:aload           5
	//  126  281:ldc1            #81  <String "VBRI data size mismatch: ">
	//  127  283:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//  128  286:pop             
			((StringBuilder) (parsablebytearray)).append(l);
	//  129  287:aload           5
	//  130  289:lload_0         
	//  131  290:invokevirtual   #88  <Method StringBuilder StringBuilder.append(long)>
	//  132  293:pop             
			((StringBuilder) (parsablebytearray)).append(", ");
	//  133  294:aload           5
	//  134  296:ldc1            #90  <String ", ">
	//  135  298:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//  136  301:pop             
			((StringBuilder) (parsablebytearray)).append(l3);
	//  137  302:aload           5
	//  138  304:lload           13
	//  139  306:invokevirtual   #88  <Method StringBuilder StringBuilder.append(long)>
	//  140  309:pop             
			Log.w("VbriSeeker", ((StringBuilder) (parsablebytearray)).toString());
	//  141  310:ldc1            #10  <String "VbriSeeker">
	//  142  312:aload           5
	//  143  314:invokevirtual   #94  <Method String StringBuilder.toString()>
	//  144  317:invokestatic    #100 <Method int Log.w(String, String)>
	//  145  320:pop             
		}
		return new VbriSeeker(((long []) (mpegaudioheader)), al, l2);
	//  146  321:new             #2   <Class VbriSeeker>
	//  147  324:dup             
	//  148  325:aload           4
	//  149  327:aload           19
	//  150  329:lload           11
	//  151  331:invokespecial   #102 <Method void VbriSeeker(long[], long[], long)>
	//  152  334:areturn         
	}

	public long getDurationUs()
	{
		return durationUs;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field long durationUs>
	//    2    4:lreturn         
	}

	public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long l)
	{
		int i = Util.binarySearchFloor(timesUs, l, true, true);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field long[] timesUs>
	//    2    4:lload_1         
	//    3    5:iconst_1        
	//    4    6:iconst_1        
	//    5    7:invokestatic    #110 <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
	//    6   10:istore_3        
		SeekPoint seekpoint = new SeekPoint(timesUs[i], positions[i]);
	//    7   11:new             #112 <Class SeekPoint>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field long[] timesUs>
	//   11   19:iload_3         
	//   12   20:laload          
	//   13   21:aload_0         
	//   14   22:getfield        #24  <Field long[] positions>
	//   15   25:iload_3         
	//   16   26:laload          
	//   17   27:invokespecial   #115 <Method void SeekPoint(long, long)>
	//   18   30:astore          4
		if(seekpoint.timeUs < l && i != timesUs.length - 1)
	//*  19   32:aload           4
	//*  20   34:getfield        #118 <Field long SeekPoint.timeUs>
	//*  21   37:lload_1         
	//*  22   38:lcmp            
	//*  23   39:ifge            93
	//*  24   42:iload_3         
	//*  25   43:aload_0         
	//*  26   44:getfield        #22  <Field long[] timesUs>
	//*  27   47:arraylength     
	//*  28   48:iconst_1        
	//*  29   49:isub            
	//*  30   50:icmpne          56
	//*  31   53:goto            93
		{
			long al[] = timesUs;
	//   32   56:aload_0         
	//   33   57:getfield        #22  <Field long[] timesUs>
	//   34   60:astore          5
			i++;
	//   35   62:iload_3         
	//   36   63:iconst_1        
	//   37   64:iadd            
	//   38   65:istore_3        
			return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekpoint, new SeekPoint(al[i], positions[i]));
	//   39   66:new             #120 <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
	//   40   69:dup             
	//   41   70:aload           4
	//   42   72:new             #112 <Class SeekPoint>
	//   43   75:dup             
	//   44   76:aload           5
	//   45   78:iload_3         
	//   46   79:laload          
	//   47   80:aload_0         
	//   48   81:getfield        #24  <Field long[] positions>
	//   49   84:iload_3         
	//   50   85:laload          
	//   51   86:invokespecial   #115 <Method void SeekPoint(long, long)>
	//   52   89:invokespecial   #123 <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint, SeekPoint)>
	//   53   92:areturn         
		} else
		{
			return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekpoint);
	//   54   93:new             #120 <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
	//   55   96:dup             
	//   56   97:aload           4
	//   57   99:invokespecial   #126 <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint)>
	//   58  102:areturn         
		}
	}

	public long getTimeUs(long l)
	{
		return timesUs[Util.binarySearchFloor(positions, l, true, true)];
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field long[] timesUs>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field long[] positions>
	//    4    8:lload_1         
	//    5    9:iconst_1        
	//    6   10:iconst_1        
	//    7   11:invokestatic    #110 <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
	//    8   14:laload          
	//    9   15:lreturn         
	}

	public boolean isSeekable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final String TAG = "VbriSeeker";
	private final long durationUs;
	private final long positions[];
	private final long timesUs[];
}
