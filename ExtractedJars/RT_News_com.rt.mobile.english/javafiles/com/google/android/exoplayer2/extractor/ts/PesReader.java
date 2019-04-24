// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.*;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			TsPayloadReader, ElementaryStreamReader

public final class PesReader
	implements TsPayloadReader
{

	public PesReader(ElementaryStreamReader elementarystreamreader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		reader = elementarystreamreader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #48  <Field ElementaryStreamReader reader>
	//    5    9:aload_0         
	//    6   10:new             #50  <Class ParsableBitArray>
	//    7   13:dup             
	//    8   14:bipush          10
	//    9   16:newarray        byte[]
	//   10   18:invokespecial   #53  <Method void ParsableBitArray(byte[])>
	//   11   21:putfield        #55  <Field ParsableBitArray pesScratch>
		state = 0;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #57  <Field int state>
	//   15   29:return          
	}

	private boolean continueRead(ParsableByteArray parsablebytearray, byte abyte0[], int i)
	{
		int j = Math.min(parsablebytearray.bytesLeft(), i - bytesRead);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #66  <Method int ParsableByteArray.bytesLeft()>
	//    2    4:iload_3         
	//    3    5:aload_0         
	//    4    6:getfield        #68  <Field int bytesRead>
	//    5    9:isub            
	//    6   10:invokestatic    #74  <Method int Math.min(int, int)>
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
	//   16   29:invokevirtual   #78  <Method void ParsableByteArray.skipBytes(int)>
		else
	//*  17   32:goto            46
			parsablebytearray.readBytes(abyte0, bytesRead, j);
	//   18   35:aload_1         
	//   19   36:aload_2         
	//   20   37:aload_0         
	//   21   38:getfield        #68  <Field int bytesRead>
	//   22   41:iload           4
	//   23   43:invokevirtual   #82  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		bytesRead = bytesRead + j;
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #68  <Field int bytesRead>
	//   27   51:iload           4
	//   28   53:iadd            
	//   29   54:putfield        #68  <Field int bytesRead>
		return bytesRead == i;
	//   30   57:aload_0         
	//   31   58:getfield        #68  <Field int bytesRead>
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
	//    1    1:getfield        #55  <Field ParsableBitArray pesScratch>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #87  <Method void ParsableBitArray.setPosition(int)>
		int i = pesScratch.readBits(24);
	//    4    8:aload_0         
	//    5    9:getfield        #55  <Field ParsableBitArray pesScratch>
	//    6   12:bipush          24
	//    7   14:invokevirtual   #91  <Method int ParsableBitArray.readBits(int)>
	//    8   17:istore_1        
		if(i != 1)
	//*   9   18:iload_1         
	//*  10   19:iconst_1        
	//*  11   20:icmpeq          61
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   12   23:new             #93  <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #94  <Method void StringBuilder()>
	//   15   30:astore_2        
			stringbuilder.append("Unexpected start code prefix: ");
	//   16   31:aload_2         
	//   17   32:ldc1            #96  <String "Unexpected start code prefix: ">
	//   18   34:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(i);
	//   20   38:aload_2         
	//   21   39:iload_1         
	//   22   40:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//   23   43:pop             
			Log.w("PesReader", stringbuilder.toString());
	//   24   44:ldc1            #24  <String "PesReader">
	//   25   46:aload_2         
	//   26   47:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   27   50:invokestatic    #113 <Method int Log.w(String, String)>
	//   28   53:pop             
			payloadSize = -1;
	//   29   54:aload_0         
	//   30   55:iconst_m1       
	//   31   56:putfield        #115 <Field int payloadSize>
			return false;
	//   32   59:iconst_0        
	//   33   60:ireturn         
		}
		pesScratch.skipBits(8);
	//   34   61:aload_0         
	//   35   62:getfield        #55  <Field ParsableBitArray pesScratch>
	//   36   65:bipush          8
	//   37   67:invokevirtual   #118 <Method void ParsableBitArray.skipBits(int)>
		i = pesScratch.readBits(16);
	//   38   70:aload_0         
	//   39   71:getfield        #55  <Field ParsableBitArray pesScratch>
	//   40   74:bipush          16
	//   41   76:invokevirtual   #91  <Method int ParsableBitArray.readBits(int)>
	//   42   79:istore_1        
		pesScratch.skipBits(5);
	//   43   80:aload_0         
	//   44   81:getfield        #55  <Field ParsableBitArray pesScratch>
	//   45   84:iconst_5        
	//   46   85:invokevirtual   #118 <Method void ParsableBitArray.skipBits(int)>
		dataAlignmentIndicator = pesScratch.readBit();
	//   47   88:aload_0         
	//   48   89:aload_0         
	//   49   90:getfield        #55  <Field ParsableBitArray pesScratch>
	//   50   93:invokevirtual   #121 <Method boolean ParsableBitArray.readBit()>
	//   51   96:putfield        #123 <Field boolean dataAlignmentIndicator>
		pesScratch.skipBits(2);
	//   52   99:aload_0         
	//   53  100:getfield        #55  <Field ParsableBitArray pesScratch>
	//   54  103:iconst_2        
	//   55  104:invokevirtual   #118 <Method void ParsableBitArray.skipBits(int)>
		ptsFlag = pesScratch.readBit();
	//   56  107:aload_0         
	//   57  108:aload_0         
	//   58  109:getfield        #55  <Field ParsableBitArray pesScratch>
	//   59  112:invokevirtual   #121 <Method boolean ParsableBitArray.readBit()>
	//   60  115:putfield        #125 <Field boolean ptsFlag>
		dtsFlag = pesScratch.readBit();
	//   61  118:aload_0         
	//   62  119:aload_0         
	//   63  120:getfield        #55  <Field ParsableBitArray pesScratch>
	//   64  123:invokevirtual   #121 <Method boolean ParsableBitArray.readBit()>
	//   65  126:putfield        #127 <Field boolean dtsFlag>
		pesScratch.skipBits(6);
	//   66  129:aload_0         
	//   67  130:getfield        #55  <Field ParsableBitArray pesScratch>
	//   68  133:bipush          6
	//   69  135:invokevirtual   #118 <Method void ParsableBitArray.skipBits(int)>
		extendedHeaderLength = pesScratch.readBits(8);
	//   70  138:aload_0         
	//   71  139:aload_0         
	//   72  140:getfield        #55  <Field ParsableBitArray pesScratch>
	//   73  143:bipush          8
	//   74  145:invokevirtual   #91  <Method int ParsableBitArray.readBits(int)>
	//   75  148:putfield        #129 <Field int extendedHeaderLength>
		if(i == 0)
	//*  76  151:iload_1         
	//*  77  152:ifne            162
		{
			payloadSize = -1;
	//   78  155:aload_0         
	//   79  156:iconst_m1       
	//   80  157:putfield        #115 <Field int payloadSize>
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
	//   90  171:getfield        #129 <Field int extendedHeaderLength>
	//   91  174:isub            
	//   92  175:putfield        #115 <Field int payloadSize>
			return true;
	//   93  178:iconst_1        
	//   94  179:ireturn         
		}
	}

	private void parseHeaderExtension()
	{
		pesScratch.setPosition(0);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field ParsableBitArray pesScratch>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #87  <Method void ParsableBitArray.setPosition(int)>
		timeUs = 0x1L;
	//    4    8:aload_0         
	//    5    9:ldc2w           #131 <Long 0x1L>
	//    6   12:putfield        #134 <Field long timeUs>
		if(ptsFlag)
	//*   7   15:aload_0         
	//*   8   16:getfield        #125 <Field boolean ptsFlag>
	//*   9   19:ifeq            218
		{
			pesScratch.skipBits(4);
	//   10   22:aload_0         
	//   11   23:getfield        #55  <Field ParsableBitArray pesScratch>
	//   12   26:iconst_4        
	//   13   27:invokevirtual   #118 <Method void ParsableBitArray.skipBits(int)>
			long l = pesScratch.readBits(3);
	//   14   30:aload_0         
	//   15   31:getfield        #55  <Field ParsableBitArray pesScratch>
	//   16   34:iconst_3        
	//   17   35:invokevirtual   #91  <Method int ParsableBitArray.readBits(int)>
	//   18   38:i2l             
	//   19   39:lstore_1        
			pesScratch.skipBits(1);
	//   20   40:aload_0         
	//   21   41:getfield        #55  <Field ParsableBitArray pesScratch>
	//   22   44:iconst_1        
	//   23   45:invokevirtual   #118 <Method void ParsableBitArray.skipBits(int)>
			long l1 = pesScratch.readBits(15) << 15;
	//   24   48:aload_0         
	//   25   49:getfield        #55  <Field ParsableBitArray pesScratch>
	//   26   52:bipush          15
	//   27   54:invokevirtual   #91  <Method int ParsableBitArray.readBits(int)>
	//   28   57:bipush          15
	//   29   59:ishl            
	//   30   60:i2l             
	//   31   61:lstore_3        
			pesScratch.skipBits(1);
	//   32   62:aload_0         
	//   33   63:getfield        #55  <Field ParsableBitArray pesScratch>
	//   34   66:iconst_1        
	//   35   67:invokevirtual   #118 <Method void ParsableBitArray.skipBits(int)>
			long l2 = pesScratch.readBits(15);
	//   36   70:aload_0         
	//   37   71:getfield        #55  <Field ParsableBitArray pesScratch>
	//   38   74:bipush          15
	//   39   76:invokevirtual   #91  <Method int ParsableBitArray.readBits(int)>
	//   40   79:i2l             
	//   41   80:lstore          5
			pesScratch.skipBits(1);
	//   42   82:aload_0         
	//   43   83:getfield        #55  <Field ParsableBitArray pesScratch>
	//   44   86:iconst_1        
	//   45   87:invokevirtual   #118 <Method void ParsableBitArray.skipBits(int)>
			if(!seenFirstDts && dtsFlag)
	//*  46   90:aload_0         
	//*  47   91:getfield        #136 <Field boolean seenFirstDts>
	//*  48   94:ifne            198
	//*  49   97:aload_0         
	//*  50   98:getfield        #127 <Field boolean dtsFlag>
	//*  51  101:ifeq            198
			{
				pesScratch.skipBits(4);
	//   52  104:aload_0         
	//   53  105:getfield        #55  <Field ParsableBitArray pesScratch>
	//   54  108:iconst_4        
	//   55  109:invokevirtual   #118 <Method void ParsableBitArray.skipBits(int)>
				long l3 = pesScratch.readBits(3);
	//   56  112:aload_0         
	//   57  113:getfield        #55  <Field ParsableBitArray pesScratch>
	//   58  116:iconst_3        
	//   59  117:invokevirtual   #91  <Method int ParsableBitArray.readBits(int)>
	//   60  120:i2l             
	//   61  121:lstore          7
				pesScratch.skipBits(1);
	//   62  123:aload_0         
	//   63  124:getfield        #55  <Field ParsableBitArray pesScratch>
	//   64  127:iconst_1        
	//   65  128:invokevirtual   #118 <Method void ParsableBitArray.skipBits(int)>
				long l4 = pesScratch.readBits(15) << 15;
	//   66  131:aload_0         
	//   67  132:getfield        #55  <Field ParsableBitArray pesScratch>
	//   68  135:bipush          15
	//   69  137:invokevirtual   #91  <Method int ParsableBitArray.readBits(int)>
	//   70  140:bipush          15
	//   71  142:ishl            
	//   72  143:i2l             
	//   73  144:lstore          9
				pesScratch.skipBits(1);
	//   74  146:aload_0         
	//   75  147:getfield        #55  <Field ParsableBitArray pesScratch>
	//   76  150:iconst_1        
	//   77  151:invokevirtual   #118 <Method void ParsableBitArray.skipBits(int)>
				long l5 = pesScratch.readBits(15);
	//   78  154:aload_0         
	//   79  155:getfield        #55  <Field ParsableBitArray pesScratch>
	//   80  158:bipush          15
	//   81  160:invokevirtual   #91  <Method int ParsableBitArray.readBits(int)>
	//   82  163:i2l             
	//   83  164:lstore          11
				pesScratch.skipBits(1);
	//   84  166:aload_0         
	//   85  167:getfield        #55  <Field ParsableBitArray pesScratch>
	//   86  170:iconst_1        
	//   87  171:invokevirtual   #118 <Method void ParsableBitArray.skipBits(int)>
				timestampAdjuster.adjustTsTimestamp(l3 << 30 | l4 | l5);
	//   88  174:aload_0         
	//   89  175:getfield        #138 <Field TimestampAdjuster timestampAdjuster>
	//   90  178:lload           7
	//   91  180:bipush          30
	//   92  182:lshl            
	//   93  183:lload           9
	//   94  185:lor             
	//   95  186:lload           11
	//   96  188:lor             
	//   97  189:invokevirtual   #144 <Method long TimestampAdjuster.adjustTsTimestamp(long)>
	//   98  192:pop2            
				seenFirstDts = true;
	//   99  193:aload_0         
	//  100  194:iconst_1        
	//  101  195:putfield        #136 <Field boolean seenFirstDts>
			}
			timeUs = timestampAdjuster.adjustTsTimestamp(l << 30 | l1 | l2);
	//  102  198:aload_0         
	//  103  199:aload_0         
	//  104  200:getfield        #138 <Field TimestampAdjuster timestampAdjuster>
	//  105  203:lload_1         
	//  106  204:bipush          30
	//  107  206:lshl            
	//  108  207:lload_3         
	//  109  208:lor             
	//  110  209:lload           5
	//  111  211:lor             
	//  112  212:invokevirtual   #144 <Method long TimestampAdjuster.adjustTsTimestamp(long)>
	//  113  215:putfield        #134 <Field long timeUs>
		}
	//  114  218:return          
	}

	private void setState(int i)
	{
		state = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field int state>
		bytesRead = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #68  <Field int bytesRead>
	//    6   10:return          
	}

	public final void consume(ParsableByteArray parsablebytearray, boolean flag)
		throws ParserException
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            122
		{
			switch(state)
	//*   2    4:aload_0         
	//*   3    5:getfield        #57  <Field int state>
			{
	//*   4    8:tableswitch     0 3: default 40
	//	               0 117
	//	               1 117
	//	               2 109
	//	               3 43
	//*   5   40:goto            117
			case 3: // '\003'
				if(payloadSize != -1)
	//*   6   43:aload_0         
	//*   7   44:getfield        #115 <Field int payloadSize>
	//*   8   47:iconst_m1       
	//*   9   48:icmpeq          97
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   10   51:new             #93  <Class StringBuilder>
	//   11   54:dup             
	//   12   55:invokespecial   #94  <Method void StringBuilder()>
	//   13   58:astore          6
					stringbuilder.append("Unexpected start indicator: expected ");
	//   14   60:aload           6
	//   15   62:ldc1            #151 <String "Unexpected start indicator: expected ">
	//   16   64:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   17   67:pop             
					stringbuilder.append(payloadSize);
	//   18   68:aload           6
	//   19   70:aload_0         
	//   20   71:getfield        #115 <Field int payloadSize>
	//   21   74:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//   22   77:pop             
					stringbuilder.append(" more bytes");
	//   23   78:aload           6
	//   24   80:ldc1            #153 <String " more bytes">
	//   25   82:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   26   85:pop             
					Log.w("PesReader", stringbuilder.toString());
	//   27   86:ldc1            #24  <String "PesReader">
	//   28   88:aload           6
	//   29   90:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   30   93:invokestatic    #113 <Method int Log.w(String, String)>
	//   31   96:pop             
				}
				reader.packetFinished();
	//   32   97:aload_0         
	//   33   98:getfield        #48  <Field ElementaryStreamReader reader>
	//   34  101:invokeinterface #158 <Method void ElementaryStreamReader.packetFinished()>
				break;

	//*  35  106:goto            117
			case 2: // '\002'
				Log.w("PesReader", "Unexpected start indicator reading extended header");
	//   36  109:ldc1            #24  <String "PesReader">
	//   37  111:ldc1            #160 <String "Unexpected start indicator reading extended header">
	//   38  113:invokestatic    #113 <Method int Log.w(String, String)>
	//   39  116:pop             
				break;
			}
			setState(1);
	//   40  117:aload_0         
	//   41  118:iconst_1        
	//   42  119:invokespecial   #162 <Method void setState(int)>
		}
		do
		{
			if(parsablebytearray.bytesLeft() <= 0)
				break;
	//   43  122:aload_1         
	//   44  123:invokevirtual   #66  <Method int ParsableByteArray.bytesLeft()>
	//   45  126:ifle            394
			int i1 = state;
	//   46  129:aload_0         
	//   47  130:getfield        #57  <Field int state>
	//   48  133:istore          5
			int l = 0;
	//   49  135:iconst_0        
	//   50  136:istore          4
			int i = 0;
	//   51  138:iconst_0        
	//   52  139:istore_3        
			switch(i1)
	//*  53  140:iload           5
			{
	//*  54  142:tableswitch     0 3: default 172
	//	               0 383
	//	               1 346
	//	               2 278
	//	               3 175
	//*  55  172:goto            122
			case 3: // '\003'
				int j1 = parsablebytearray.bytesLeft();
	//   56  175:aload_1         
	//   57  176:invokevirtual   #66  <Method int ParsableByteArray.bytesLeft()>
	//   58  179:istore          5
				if(payloadSize != -1)
	//*  59  181:aload_0         
	//*  60  182:getfield        #115 <Field int payloadSize>
	//*  61  185:iconst_m1       
	//*  62  186:icmpne          192
	//*  63  189:goto            200
					i = j1 - payloadSize;
	//   64  192:iload           5
	//   65  194:aload_0         
	//   66  195:getfield        #115 <Field int payloadSize>
	//   67  198:isub            
	//   68  199:istore_3        
				l = j1;
	//   69  200:iload           5
	//   70  202:istore          4
				if(i > 0)
	//*  71  204:iload_3         
	//*  72  205:ifle            225
				{
					l = j1 - i;
	//   73  208:iload           5
	//   74  210:iload_3         
	//   75  211:isub            
	//   76  212:istore          4
					parsablebytearray.setLimit(parsablebytearray.getPosition() + l);
	//   77  214:aload_1         
	//   78  215:aload_1         
	//   79  216:invokevirtual   #165 <Method int ParsableByteArray.getPosition()>
	//   80  219:iload           4
	//   81  221:iadd            
	//   82  222:invokevirtual   #168 <Method void ParsableByteArray.setLimit(int)>
				}
				reader.consume(parsablebytearray);
	//   83  225:aload_0         
	//   84  226:getfield        #48  <Field ElementaryStreamReader reader>
	//   85  229:aload_1         
	//   86  230:invokeinterface #171 <Method void ElementaryStreamReader.consume(ParsableByteArray)>
				if(payloadSize != -1)
	//*  87  235:aload_0         
	//*  88  236:getfield        #115 <Field int payloadSize>
	//*  89  239:iconst_m1       
	//*  90  240:icmpeq          122
				{
					payloadSize = payloadSize - l;
	//   91  243:aload_0         
	//   92  244:aload_0         
	//   93  245:getfield        #115 <Field int payloadSize>
	//   94  248:iload           4
	//   95  250:isub            
	//   96  251:putfield        #115 <Field int payloadSize>
					if(payloadSize == 0)
	//*  97  254:aload_0         
	//*  98  255:getfield        #115 <Field int payloadSize>
	//*  99  258:ifne            122
					{
						reader.packetFinished();
	//  100  261:aload_0         
	//  101  262:getfield        #48  <Field ElementaryStreamReader reader>
	//  102  265:invokeinterface #158 <Method void ElementaryStreamReader.packetFinished()>
						setState(1);
	//  103  270:aload_0         
	//  104  271:iconst_1        
	//  105  272:invokespecial   #162 <Method void setState(int)>
					}
				}
				break;

	//* 106  275:goto            122
			case 2: // '\002'
				int j = Math.min(10, extendedHeaderLength);
	//  107  278:bipush          10
	//  108  280:aload_0         
	//  109  281:getfield        #129 <Field int extendedHeaderLength>
	//  110  284:invokestatic    #74  <Method int Math.min(int, int)>
	//  111  287:istore_3        
				if(continueRead(parsablebytearray, pesScratch.data, j) && continueRead(parsablebytearray, ((byte []) (null)), extendedHeaderLength))
	//* 112  288:aload_0         
	//* 113  289:aload_1         
	//* 114  290:aload_0         
	//* 115  291:getfield        #55  <Field ParsableBitArray pesScratch>
	//* 116  294:getfield        #175 <Field byte[] ParsableBitArray.data>
	//* 117  297:iload_3         
	//* 118  298:invokespecial   #177 <Method boolean continueRead(ParsableByteArray, byte[], int)>
	//* 119  301:ifeq            122
	//* 120  304:aload_0         
	//* 121  305:aload_1         
	//* 122  306:aconst_null     
	//* 123  307:aload_0         
	//* 124  308:getfield        #129 <Field int extendedHeaderLength>
	//* 125  311:invokespecial   #177 <Method boolean continueRead(ParsableByteArray, byte[], int)>
	//* 126  314:ifeq            122
				{
					parseHeaderExtension();
	//  127  317:aload_0         
	//  128  318:invokespecial   #179 <Method void parseHeaderExtension()>
					reader.packetStarted(timeUs, dataAlignmentIndicator);
	//  129  321:aload_0         
	//  130  322:getfield        #48  <Field ElementaryStreamReader reader>
	//  131  325:aload_0         
	//  132  326:getfield        #134 <Field long timeUs>
	//  133  329:aload_0         
	//  134  330:getfield        #123 <Field boolean dataAlignmentIndicator>
	//  135  333:invokeinterface #183 <Method void ElementaryStreamReader.packetStarted(long, boolean)>
					setState(3);
	//  136  338:aload_0         
	//  137  339:iconst_3        
	//  138  340:invokespecial   #162 <Method void setState(int)>
				}
				break;

	//* 139  343:goto            122
			case 1: // '\001'
				if(continueRead(parsablebytearray, pesScratch.data, 9))
	//* 140  346:aload_0         
	//* 141  347:aload_1         
	//* 142  348:aload_0         
	//* 143  349:getfield        #55  <Field ParsableBitArray pesScratch>
	//* 144  352:getfield        #175 <Field byte[] ParsableBitArray.data>
	//* 145  355:bipush          9
	//* 146  357:invokespecial   #177 <Method boolean continueRead(ParsableByteArray, byte[], int)>
	//* 147  360:ifeq            122
				{
					int k = l;
	//  148  363:iload           4
	//  149  365:istore_3        
					if(parseHeader())
	//* 150  366:aload_0         
	//* 151  367:invokespecial   #185 <Method boolean parseHeader()>
	//* 152  370:ifeq            375
						k = 2;
	//  153  373:iconst_2        
	//  154  374:istore_3        
					setState(k);
	//  155  375:aload_0         
	//  156  376:iload_3         
	//  157  377:invokespecial   #162 <Method void setState(int)>
				}
				break;

	//* 158  380:goto            122
			case 0: // '\0'
				parsablebytearray.skipBytes(parsablebytearray.bytesLeft());
	//  159  383:aload_1         
	//  160  384:aload_1         
	//  161  385:invokevirtual   #66  <Method int ParsableByteArray.bytesLeft()>
	//  162  388:invokevirtual   #78  <Method void ParsableByteArray.skipBytes(int)>
				break;
			}
		} while(true);
	//  163  391:goto            122
	//  164  394:return          
	}

	public void init(TimestampAdjuster timestampadjuster, ExtractorOutput extractoroutput, TsPayloadReader.TrackIdGenerator trackidgenerator)
	{
		timestampAdjuster = timestampadjuster;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #138 <Field TimestampAdjuster timestampAdjuster>
		reader.createTracks(extractoroutput, trackidgenerator);
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field ElementaryStreamReader reader>
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokeinterface #192 <Method void ElementaryStreamReader.createTracks(ExtractorOutput, TsPayloadReader$TrackIdGenerator)>
	//    8   16:return          
	}

	public final void seek()
	{
		state = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #57  <Field int state>
		bytesRead = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #68  <Field int bytesRead>
		seenFirstDts = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #136 <Field boolean seenFirstDts>
		reader.seek();
	//    9   15:aload_0         
	//   10   16:getfield        #48  <Field ElementaryStreamReader reader>
	//   11   19:invokeinterface #195 <Method void ElementaryStreamReader.seek()>
	//   12   24:return          
	}

	private static final int HEADER_SIZE = 9;
	private static final int MAX_HEADER_EXTENSION_SIZE = 10;
	private static final int PES_SCRATCH_SIZE = 10;
	private static final int STATE_FINDING_HEADER = 0;
	private static final int STATE_READING_BODY = 3;
	private static final int STATE_READING_HEADER = 1;
	private static final int STATE_READING_HEADER_EXTENSION = 2;
	private static final String TAG = "PesReader";
	private int bytesRead;
	private boolean dataAlignmentIndicator;
	private boolean dtsFlag;
	private int extendedHeaderLength;
	private int payloadSize;
	private final ParsableBitArray pesScratch = new ParsableBitArray(new byte[10]);
	private boolean ptsFlag;
	private final ElementaryStreamReader reader;
	private boolean seenFirstDts;
	private int state;
	private long timeUs;
	private TimestampAdjuster timestampAdjuster;
}
