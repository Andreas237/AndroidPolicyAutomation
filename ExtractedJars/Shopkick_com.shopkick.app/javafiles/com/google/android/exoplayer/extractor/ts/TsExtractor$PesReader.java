// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import android.util.Log;
import com.google.android.exoplayer.extractor.ExtractorOutput;
import com.google.android.exoplayer.util.ParsableBitArray;
import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			TsExtractor, PtsTimestampAdjuster, ElementaryStreamReader

private static final class TsExtractor$PesReader extends eader
{

	private boolean continueRead(ParsableByteArray parsablebytearray, byte abyte0[], int i)
	{
		int j = Math.min(parsablebytearray.bytesLeft(), i - bytesRead);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #65  <Method int ParsableByteArray.bytesLeft()>
	//    2    4:iload_3         
	//    3    5:aload_0         
	//    4    6:getfield        #67  <Field int bytesRead>
	//    5    9:isub            
	//    6   10:invokestatic    #73  <Method int Math.min(int, int)>
	//    7   13:istore          4
		if(j <= 0)
	//*   8   15:iload           4
	//*   9   17:ifgt            22
			return true;
	//   10   20:iconst_1        
	//   11   21:ireturn         
		if(abyte0 == null)
	//*  12   22:aload_2         
	//*  13   23:ifnonnull       35
			parsablebytearray.skipBytes(j);
	//   14   26:aload_1         
	//   15   27:iload           4
	//   16   29:invokevirtual   #77  <Method void ParsableByteArray.skipBytes(int)>
		else
	//*  17   32:goto            46
			parsablebytearray.readBytes(abyte0, bytesRead, j);
	//   18   35:aload_1         
	//   19   36:aload_2         
	//   20   37:aload_0         
	//   21   38:getfield        #67  <Field int bytesRead>
	//   22   41:iload           4
	//   23   43:invokevirtual   #81  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		bytesRead = bytesRead + j;
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #67  <Field int bytesRead>
	//   27   51:iload           4
	//   28   53:iadd            
	//   29   54:putfield        #67  <Field int bytesRead>
		return bytesRead == i;
	//   30   57:aload_0         
	//   31   58:getfield        #67  <Field int bytesRead>
	//   32   61:iload_3         
	//   33   62:icmpne          67
	//   34   65:iconst_1        
	//   35   66:ireturn         
	//   36   67:iconst_0        
	//   37   68:ireturn         
	}

	private boolean parseHeader()
	{
		pesScratch.setPosition(0);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field ParsableBitArray pesScratch>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #86  <Method void ParsableBitArray.setPosition(int)>
		int i = pesScratch.readBits(24);
	//    4    8:aload_0         
	//    5    9:getfield        #54  <Field ParsableBitArray pesScratch>
	//    6   12:bipush          24
	//    7   14:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
	//    8   17:istore_1        
		if(i != 1)
	//*   9   18:iload_1         
	//*  10   19:iconst_1        
	//*  11   20:icmpeq          61
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   12   23:new             #92  <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #95  <Method void StringBuilder()>
	//   15   30:astore_2        
			stringbuilder.append("Unexpected start code prefix: ");
	//   16   31:aload_2         
	//   17   32:ldc1            #97  <String "Unexpected start code prefix: ">
	//   18   34:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(i);
	//   20   38:aload_2         
	//   21   39:iload_1         
	//   22   40:invokevirtual   #104 <Method StringBuilder StringBuilder.append(int)>
	//   23   43:pop             
			Log.w("TsExtractor", stringbuilder.toString());
	//   24   44:ldc1            #106 <String "TsExtractor">
	//   25   46:aload_2         
	//   26   47:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   27   50:invokestatic    #116 <Method int Log.w(String, String)>
	//   28   53:pop             
			payloadSize = -1;
	//   29   54:aload_0         
	//   30   55:iconst_m1       
	//   31   56:putfield        #118 <Field int payloadSize>
			return false;
	//   32   59:iconst_0        
	//   33   60:ireturn         
		}
		pesScratch.skipBits(8);
	//   34   61:aload_0         
	//   35   62:getfield        #54  <Field ParsableBitArray pesScratch>
	//   36   65:bipush          8
	//   37   67:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
		i = pesScratch.readBits(16);
	//   38   70:aload_0         
	//   39   71:getfield        #54  <Field ParsableBitArray pesScratch>
	//   40   74:bipush          16
	//   41   76:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
	//   42   79:istore_1        
		pesScratch.skipBits(5);
	//   43   80:aload_0         
	//   44   81:getfield        #54  <Field ParsableBitArray pesScratch>
	//   45   84:iconst_5        
	//   46   85:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
		dataAlignmentIndicator = pesScratch.readBit();
	//   47   88:aload_0         
	//   48   89:aload_0         
	//   49   90:getfield        #54  <Field ParsableBitArray pesScratch>
	//   50   93:invokevirtual   #124 <Method boolean ParsableBitArray.readBit()>
	//   51   96:putfield        #126 <Field boolean dataAlignmentIndicator>
		pesScratch.skipBits(2);
	//   52   99:aload_0         
	//   53  100:getfield        #54  <Field ParsableBitArray pesScratch>
	//   54  103:iconst_2        
	//   55  104:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
		ptsFlag = pesScratch.readBit();
	//   56  107:aload_0         
	//   57  108:aload_0         
	//   58  109:getfield        #54  <Field ParsableBitArray pesScratch>
	//   59  112:invokevirtual   #124 <Method boolean ParsableBitArray.readBit()>
	//   60  115:putfield        #128 <Field boolean ptsFlag>
		dtsFlag = pesScratch.readBit();
	//   61  118:aload_0         
	//   62  119:aload_0         
	//   63  120:getfield        #54  <Field ParsableBitArray pesScratch>
	//   64  123:invokevirtual   #124 <Method boolean ParsableBitArray.readBit()>
	//   65  126:putfield        #130 <Field boolean dtsFlag>
		pesScratch.skipBits(6);
	//   66  129:aload_0         
	//   67  130:getfield        #54  <Field ParsableBitArray pesScratch>
	//   68  133:bipush          6
	//   69  135:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
		extendedHeaderLength = pesScratch.readBits(8);
	//   70  138:aload_0         
	//   71  139:aload_0         
	//   72  140:getfield        #54  <Field ParsableBitArray pesScratch>
	//   73  143:bipush          8
	//   74  145:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
	//   75  148:putfield        #132 <Field int extendedHeaderLength>
		if(i == 0)
	//*  76  151:iload_1         
	//*  77  152:ifne            162
		{
			payloadSize = -1;
	//   78  155:aload_0         
	//   79  156:iconst_m1       
	//   80  157:putfield        #118 <Field int payloadSize>
			return true;
	//   81  160:iconst_1        
	//   82  161:ireturn         
		} else
		{
			payloadSize = (i + 6) - 9 - extendedHeaderLength;
	//   83  162:aload_0         
	//   84  163:iload_1         
	//   85  164:bipush          6
	//   86  166:iadd            
	//   87  167:bipush          9
	//   88  169:isub            
	//   89  170:aload_0         
	//   90  171:getfield        #132 <Field int extendedHeaderLength>
	//   91  174:isub            
	//   92  175:putfield        #118 <Field int payloadSize>
			return true;
	//   93  178:iconst_1        
	//   94  179:ireturn         
		}
	}

	private void parseHeaderExtension()
	{
		pesScratch.setPosition(0);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field ParsableBitArray pesScratch>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #86  <Method void ParsableBitArray.setPosition(int)>
		timeUs = -1L;
	//    4    8:aload_0         
	//    5    9:ldc2w           #134 <Long -1L>
	//    6   12:putfield        #137 <Field long timeUs>
		if(ptsFlag)
	//*   7   15:aload_0         
	//*   8   16:getfield        #128 <Field boolean ptsFlag>
	//*   9   19:ifeq            218
		{
			pesScratch.skipBits(4);
	//   10   22:aload_0         
	//   11   23:getfield        #54  <Field ParsableBitArray pesScratch>
	//   12   26:iconst_4        
	//   13   27:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
			long l = pesScratch.readBits(3);
	//   14   30:aload_0         
	//   15   31:getfield        #54  <Field ParsableBitArray pesScratch>
	//   16   34:iconst_3        
	//   17   35:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
	//   18   38:i2l             
	//   19   39:lstore_1        
			pesScratch.skipBits(1);
	//   20   40:aload_0         
	//   21   41:getfield        #54  <Field ParsableBitArray pesScratch>
	//   22   44:iconst_1        
	//   23   45:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
			long l1 = pesScratch.readBits(15) << 15;
	//   24   48:aload_0         
	//   25   49:getfield        #54  <Field ParsableBitArray pesScratch>
	//   26   52:bipush          15
	//   27   54:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
	//   28   57:bipush          15
	//   29   59:ishl            
	//   30   60:i2l             
	//   31   61:lstore_3        
			pesScratch.skipBits(1);
	//   32   62:aload_0         
	//   33   63:getfield        #54  <Field ParsableBitArray pesScratch>
	//   34   66:iconst_1        
	//   35   67:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
			long l2 = pesScratch.readBits(15);
	//   36   70:aload_0         
	//   37   71:getfield        #54  <Field ParsableBitArray pesScratch>
	//   38   74:bipush          15
	//   39   76:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
	//   40   79:i2l             
	//   41   80:lstore          5
			pesScratch.skipBits(1);
	//   42   82:aload_0         
	//   43   83:getfield        #54  <Field ParsableBitArray pesScratch>
	//   44   86:iconst_1        
	//   45   87:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
			if(!seenFirstDts && dtsFlag)
	//*  46   90:aload_0         
	//*  47   91:getfield        #139 <Field boolean seenFirstDts>
	//*  48   94:ifne            198
	//*  49   97:aload_0         
	//*  50   98:getfield        #130 <Field boolean dtsFlag>
	//*  51  101:ifeq            198
			{
				pesScratch.skipBits(4);
	//   52  104:aload_0         
	//   53  105:getfield        #54  <Field ParsableBitArray pesScratch>
	//   54  108:iconst_4        
	//   55  109:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
				long l3 = pesScratch.readBits(3);
	//   56  112:aload_0         
	//   57  113:getfield        #54  <Field ParsableBitArray pesScratch>
	//   58  116:iconst_3        
	//   59  117:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
	//   60  120:i2l             
	//   61  121:lstore          7
				pesScratch.skipBits(1);
	//   62  123:aload_0         
	//   63  124:getfield        #54  <Field ParsableBitArray pesScratch>
	//   64  127:iconst_1        
	//   65  128:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
				long l4 = pesScratch.readBits(15) << 15;
	//   66  131:aload_0         
	//   67  132:getfield        #54  <Field ParsableBitArray pesScratch>
	//   68  135:bipush          15
	//   69  137:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
	//   70  140:bipush          15
	//   71  142:ishl            
	//   72  143:i2l             
	//   73  144:lstore          9
				pesScratch.skipBits(1);
	//   74  146:aload_0         
	//   75  147:getfield        #54  <Field ParsableBitArray pesScratch>
	//   76  150:iconst_1        
	//   77  151:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
				long l5 = pesScratch.readBits(15);
	//   78  154:aload_0         
	//   79  155:getfield        #54  <Field ParsableBitArray pesScratch>
	//   80  158:bipush          15
	//   81  160:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
	//   82  163:i2l             
	//   83  164:lstore          11
				pesScratch.skipBits(1);
	//   84  166:aload_0         
	//   85  167:getfield        #54  <Field ParsableBitArray pesScratch>
	//   86  170:iconst_1        
	//   87  171:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
				ptsTimestampAdjuster.adjustTimestamp(l3 << 30 | l4 | l5);
	//   88  174:aload_0         
	//   89  175:getfield        #47  <Field PtsTimestampAdjuster ptsTimestampAdjuster>
	//   90  178:lload           7
	//   91  180:bipush          30
	//   92  182:lshl            
	//   93  183:lload           9
	//   94  185:lor             
	//   95  186:lload           11
	//   96  188:lor             
	//   97  189:invokevirtual   #145 <Method long PtsTimestampAdjuster.adjustTimestamp(long)>
	//   98  192:pop2            
				seenFirstDts = true;
	//   99  193:aload_0         
	//  100  194:iconst_1        
	//  101  195:putfield        #139 <Field boolean seenFirstDts>
			}
			timeUs = ptsTimestampAdjuster.adjustTimestamp(l << 30 | l1 | l2);
	//  102  198:aload_0         
	//  103  199:aload_0         
	//  104  200:getfield        #47  <Field PtsTimestampAdjuster ptsTimestampAdjuster>
	//  105  203:lload_1         
	//  106  204:bipush          30
	//  107  206:lshl            
	//  108  207:lload_3         
	//  109  208:lor             
	//  110  209:lload           5
	//  111  211:lor             
	//  112  212:invokevirtual   #145 <Method long PtsTimestampAdjuster.adjustTimestamp(long)>
	//  113  215:putfield        #137 <Field long timeUs>
		}
	//  114  218:return          
	}

	private void setState(int i)
	{
		state = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #56  <Field int state>
		bytesRead = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #67  <Field int bytesRead>
	//    6   10:return          
	}

	public void consume(ParsableByteArray parsablebytearray, boolean flag, ExtractorOutput extractoroutput)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            115
		{
			switch(state)
	//*   2    4:aload_0         
	//*   3    5:getfield        #56  <Field int state>
			{
	//*   4    8:tableswitch     0 3: default 40
	//	               0 110
	//	               1 110
	//	               2 102
	//	               3 43
	//*   5   40:goto            110
			case 3: // '\003'
				if(payloadSize != -1)
	//*   6   43:aload_0         
	//*   7   44:getfield        #118 <Field int payloadSize>
	//*   8   47:iconst_m1       
	//*   9   48:icmpeq          92
				{
					extractoroutput = ((ExtractorOutput) (new StringBuilder()));
	//   10   51:new             #92  <Class StringBuilder>
	//   11   54:dup             
	//   12   55:invokespecial   #95  <Method void StringBuilder()>
	//   13   58:astore_3        
					((StringBuilder) (extractoroutput)).append("Unexpected start indicator: expected ");
	//   14   59:aload_3         
	//   15   60:ldc1            #150 <String "Unexpected start indicator: expected ">
	//   16   62:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   17   65:pop             
					((StringBuilder) (extractoroutput)).append(payloadSize);
	//   18   66:aload_3         
	//   19   67:aload_0         
	//   20   68:getfield        #118 <Field int payloadSize>
	//   21   71:invokevirtual   #104 <Method StringBuilder StringBuilder.append(int)>
	//   22   74:pop             
					((StringBuilder) (extractoroutput)).append(" more bytes");
	//   23   75:aload_3         
	//   24   76:ldc1            #152 <String " more bytes">
	//   25   78:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   26   81:pop             
					Log.w("TsExtractor", ((StringBuilder) (extractoroutput)).toString());
	//   27   82:ldc1            #106 <String "TsExtractor">
	//   28   84:aload_3         
	//   29   85:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   30   88:invokestatic    #116 <Method int Log.w(String, String)>
	//   31   91:pop             
				}
				pesPayloadReader.packetFinished();
	//   32   92:aload_0         
	//   33   93:getfield        #45  <Field ElementaryStreamReader pesPayloadReader>
	//   34   96:invokevirtual   #157 <Method void ElementaryStreamReader.packetFinished()>
				break;

	//*  35   99:goto            110
			case 2: // '\002'
				Log.w("TsExtractor", "Unexpected start indicator reading extended header");
	//   36  102:ldc1            #106 <String "TsExtractor">
	//   37  104:ldc1            #159 <String "Unexpected start indicator reading extended header">
	//   38  106:invokestatic    #116 <Method int Log.w(String, String)>
	//   39  109:pop             
				break;
			}
			setState(1);
	//   40  110:aload_0         
	//   41  111:iconst_1        
	//   42  112:invokespecial   #161 <Method void setState(int)>
		}
		do
		{
			if(parsablebytearray.bytesLeft() <= 0)
				break;
	//   43  115:aload_1         
	//   44  116:invokevirtual   #65  <Method int ParsableByteArray.bytesLeft()>
	//   45  119:ifle            392
			int k = state;
	//   46  122:aload_0         
	//   47  123:getfield        #56  <Field int state>
	//   48  126:istore          6
			int i = 0;
	//   49  128:iconst_0        
	//   50  129:istore          4
			int j = 0;
	//   51  131:iconst_0        
	//   52  132:istore          5
			switch(k)
	//*  53  134:iload           6
			{
	//*  54  136:tableswitch     0 3: default 168
	//	               0 381
	//	               1 345
	//	               2 277
	//	               3 171
	//*  55  168:goto            115
			case 3: // '\003'
				int l = parsablebytearray.bytesLeft();
	//   56  171:aload_1         
	//   57  172:invokevirtual   #65  <Method int ParsableByteArray.bytesLeft()>
	//   58  175:istore          6
				i = payloadSize;
	//   59  177:aload_0         
	//   60  178:getfield        #118 <Field int payloadSize>
	//   61  181:istore          4
				if(i != -1)
	//*  62  183:iload           4
	//*  63  185:iconst_m1       
	//*  64  186:icmpne          192
	//*  65  189:goto            199
					j = l - i;
	//   66  192:iload           6
	//   67  194:iload           4
	//   68  196:isub            
	//   69  197:istore          5
				i = l;
	//   70  199:iload           6
	//   71  201:istore          4
				if(j > 0)
	//*  72  203:iload           5
	//*  73  205:ifle            226
				{
					i = l - j;
	//   74  208:iload           6
	//   75  210:iload           5
	//   76  212:isub            
	//   77  213:istore          4
					parsablebytearray.setLimit(parsablebytearray.getPosition() + i);
	//   78  215:aload_1         
	//   79  216:aload_1         
	//   80  217:invokevirtual   #164 <Method int ParsableByteArray.getPosition()>
	//   81  220:iload           4
	//   82  222:iadd            
	//   83  223:invokevirtual   #167 <Method void ParsableByteArray.setLimit(int)>
				}
				pesPayloadReader.consume(parsablebytearray);
	//   84  226:aload_0         
	//   85  227:getfield        #45  <Field ElementaryStreamReader pesPayloadReader>
	//   86  230:aload_1         
	//   87  231:invokevirtual   #170 <Method void ElementaryStreamReader.consume(ParsableByteArray)>
				j = payloadSize;
	//   88  234:aload_0         
	//   89  235:getfield        #118 <Field int payloadSize>
	//   90  238:istore          5
				if(j != -1)
	//*  91  240:iload           5
	//*  92  242:iconst_m1       
	//*  93  243:icmpeq          115
				{
					payloadSize = j - i;
	//   94  246:aload_0         
	//   95  247:iload           5
	//   96  249:iload           4
	//   97  251:isub            
	//   98  252:putfield        #118 <Field int payloadSize>
					if(payloadSize == 0)
	//*  99  255:aload_0         
	//* 100  256:getfield        #118 <Field int payloadSize>
	//* 101  259:ifne            115
					{
						pesPayloadReader.packetFinished();
	//  102  262:aload_0         
	//  103  263:getfield        #45  <Field ElementaryStreamReader pesPayloadReader>
	//  104  266:invokevirtual   #157 <Method void ElementaryStreamReader.packetFinished()>
						setState(1);
	//  105  269:aload_0         
	//  106  270:iconst_1        
	//  107  271:invokespecial   #161 <Method void setState(int)>
					}
				}
				break;

	//* 108  274:goto            115
			case 2: // '\002'
				i = Math.min(10, extendedHeaderLength);
	//  109  277:bipush          10
	//  110  279:aload_0         
	//  111  280:getfield        #132 <Field int extendedHeaderLength>
	//  112  283:invokestatic    #73  <Method int Math.min(int, int)>
	//  113  286:istore          4
				if(continueRead(parsablebytearray, pesScratch.data, i) && continueRead(parsablebytearray, ((byte []) (null)), extendedHeaderLength))
	//* 114  288:aload_0         
	//* 115  289:aload_1         
	//* 116  290:aload_0         
	//* 117  291:getfield        #54  <Field ParsableBitArray pesScratch>
	//* 118  294:getfield        #174 <Field byte[] ParsableBitArray.data>
	//* 119  297:iload           4
	//* 120  299:invokespecial   #176 <Method boolean continueRead(ParsableByteArray, byte[], int)>
	//* 121  302:ifeq            115
	//* 122  305:aload_0         
	//* 123  306:aload_1         
	//* 124  307:aconst_null     
	//* 125  308:aload_0         
	//* 126  309:getfield        #132 <Field int extendedHeaderLength>
	//* 127  312:invokespecial   #176 <Method boolean continueRead(ParsableByteArray, byte[], int)>
	//* 128  315:ifeq            115
				{
					parseHeaderExtension();
	//  129  318:aload_0         
	//  130  319:invokespecial   #178 <Method void parseHeaderExtension()>
					pesPayloadReader.packetStarted(timeUs, dataAlignmentIndicator);
	//  131  322:aload_0         
	//  132  323:getfield        #45  <Field ElementaryStreamReader pesPayloadReader>
	//  133  326:aload_0         
	//  134  327:getfield        #137 <Field long timeUs>
	//  135  330:aload_0         
	//  136  331:getfield        #126 <Field boolean dataAlignmentIndicator>
	//  137  334:invokevirtual   #182 <Method void ElementaryStreamReader.packetStarted(long, boolean)>
					setState(3);
	//  138  337:aload_0         
	//  139  338:iconst_3        
	//  140  339:invokespecial   #161 <Method void setState(int)>
				}
				break;

	//* 141  342:goto            115
			case 1: // '\001'
				if(continueRead(parsablebytearray, pesScratch.data, 9))
	//* 142  345:aload_0         
	//* 143  346:aload_1         
	//* 144  347:aload_0         
	//* 145  348:getfield        #54  <Field ParsableBitArray pesScratch>
	//* 146  351:getfield        #174 <Field byte[] ParsableBitArray.data>
	//* 147  354:bipush          9
	//* 148  356:invokespecial   #176 <Method boolean continueRead(ParsableByteArray, byte[], int)>
	//* 149  359:ifeq            115
				{
					if(parseHeader())
	//* 150  362:aload_0         
	//* 151  363:invokespecial   #184 <Method boolean parseHeader()>
	//* 152  366:ifeq            372
						i = 2;
	//  153  369:iconst_2        
	//  154  370:istore          4
					setState(i);
	//  155  372:aload_0         
	//  156  373:iload           4
	//  157  375:invokespecial   #161 <Method void setState(int)>
				}
				break;

	//* 158  378:goto            115
			case 0: // '\0'
				parsablebytearray.skipBytes(parsablebytearray.bytesLeft());
	//  159  381:aload_1         
	//  160  382:aload_1         
	//  161  383:invokevirtual   #65  <Method int ParsableByteArray.bytesLeft()>
	//  162  386:invokevirtual   #77  <Method void ParsableByteArray.skipBytes(int)>
				break;
			}
		} while(true);
	//  163  389:goto            115
	//  164  392:return          
	}

	public void seek()
	{
		state = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #56  <Field int state>
		bytesRead = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #67  <Field int bytesRead>
		seenFirstDts = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #139 <Field boolean seenFirstDts>
		pesPayloadReader.seek();
	//    9   15:aload_0         
	//   10   16:getfield        #45  <Field ElementaryStreamReader pesPayloadReader>
	//   11   19:invokevirtual   #187 <Method void ElementaryStreamReader.seek()>
	//   12   22:return          
	}

	private static final int HEADER_SIZE = 9;
	private static final int MAX_HEADER_EXTENSION_SIZE = 10;
	private static final int PES_SCRATCH_SIZE = 10;
	private static final int STATE_FINDING_HEADER = 0;
	private static final int STATE_READING_BODY = 3;
	private static final int STATE_READING_HEADER = 1;
	private static final int STATE_READING_HEADER_EXTENSION = 2;
	private int bytesRead;
	private boolean dataAlignmentIndicator;
	private boolean dtsFlag;
	private int extendedHeaderLength;
	private int payloadSize;
	private final ElementaryStreamReader pesPayloadReader;
	private final ParsableBitArray pesScratch = new ParsableBitArray(new byte[10]);
	private boolean ptsFlag;
	private final PtsTimestampAdjuster ptsTimestampAdjuster;
	private boolean seenFirstDts;
	private int state;
	private long timeUs;

	public TsExtractor$PesReader(ElementaryStreamReader elementarystreamreader, PtsTimestampAdjuster ptstimestampadjuster)
	{
		super(((TsExtractor._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #43  <Method void TsExtractor$TsPayloadReader(TsExtractor$1)>
		pesPayloadReader = elementarystreamreader;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #45  <Field ElementaryStreamReader pesPayloadReader>
		ptsTimestampAdjuster = ptstimestampadjuster;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #47  <Field PtsTimestampAdjuster ptsTimestampAdjuster>
	//    9   15:aload_0         
	//   10   16:new             #49  <Class ParsableBitArray>
	//   11   19:dup             
	//   12   20:bipush          10
	//   13   22:newarray        byte[]
	//   14   24:invokespecial   #52  <Method void ParsableBitArray(byte[])>
	//   15   27:putfield        #54  <Field ParsableBitArray pesScratch>
		state = 0;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #56  <Field int state>
	//   19   35:return          
	}
}
