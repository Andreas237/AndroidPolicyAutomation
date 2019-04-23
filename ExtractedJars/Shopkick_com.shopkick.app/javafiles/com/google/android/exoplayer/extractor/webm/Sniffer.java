// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.webm;

import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.io.IOException;

final class Sniffer
{

	public Sniffer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ParsableByteArray>
	//    4    8:dup             
	//    5    9:bipush          8
	//    6   11:invokespecial   #21  <Method void ParsableByteArray(int)>
	//    7   14:putfield        #23  <Field ParsableByteArray scratch>
	//    8   17:return          
	}

	private long readUint(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		byte abyte0[] = scratch.data;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ParsableByteArray scratch>
	//    2    4:getfield        #34  <Field byte[] ParsableByteArray.data>
	//    3    7:astore          6
		int k = 0;
	//    4    9:iconst_0        
	//    5   10:istore          4
		extractorinput.peekFully(abyte0, 0, 1);
	//    6   12:aload_1         
	//    7   13:aload           6
	//    8   15:iconst_0        
	//    9   16:iconst_1        
	//   10   17:invokeinterface #40  <Method void ExtractorInput.peekFully(byte[], int, int)>
		int l = scratch.data[0] & 0xff;
	//   11   22:aload_0         
	//   12   23:getfield        #23  <Field ParsableByteArray scratch>
	//   13   26:getfield        #34  <Field byte[] ParsableByteArray.data>
	//   14   29:iconst_0        
	//   15   30:baload          
	//   16   31:sipush          255
	//   17   34:iand            
	//   18   35:istore          5
		if(l == 0)
	//*  19   37:iload           5
	//*  20   39:ifne            46
			return 0x0L;
	//   21   42:ldc2w           #41  <Long 0x0L>
	//   22   45:lreturn         
		int j = 128;
	//   23   46:sipush          128
	//   24   49:istore_3        
		int i;
		for(i = 0; (l & j) == 0; i++)
	//*  25   50:iconst_0        
	//*  26   51:istore_2        
	//*  27   52:iload           5
	//*  28   54:iload_3         
	//*  29   55:iand            
	//*  30   56:ifne            70
			j >>= 1;
	//   31   59:iload_3         
	//   32   60:iconst_1        
	//   33   61:ishr            
	//   34   62:istore_3        

	//   35   63:iload_2         
	//   36   64:iconst_1        
	//   37   65:iadd            
	//   38   66:istore_2        
	//*  39   67:goto            52
		j = l & j;
	//   40   70:iload           5
	//   41   72:iload_3         
	//   42   73:iand            
	//   43   74:istore_3        
		extractorinput.peekFully(scratch.data, 1, i);
	//   44   75:aload_1         
	//   45   76:aload_0         
	//   46   77:getfield        #23  <Field ParsableByteArray scratch>
	//   47   80:getfield        #34  <Field byte[] ParsableByteArray.data>
	//   48   83:iconst_1        
	//   49   84:iload_2         
	//   50   85:invokeinterface #40  <Method void ExtractorInput.peekFully(byte[], int, int)>
		while(k < i) 
	//*  51   90:iload           4
	//*  52   92:iload_2         
	//*  53   93:icmpge          127
		{
			extractorinput = ((ExtractorInput) (scratch.data));
	//   54   96:aload_0         
	//   55   97:getfield        #23  <Field ParsableByteArray scratch>
	//   56  100:getfield        #34  <Field byte[] ParsableByteArray.data>
	//   57  103:astore_1        
			k++;
	//   58  104:iload           4
	//   59  106:iconst_1        
	//   60  107:iadd            
	//   61  108:istore          4
			j = (extractorinput[k] & 0xff) + (j << 8);
	//   62  110:aload_1         
	//   63  111:iload           4
	//   64  113:baload          
	//   65  114:sipush          255
	//   66  117:iand            
	//   67  118:iload_3         
	//   68  119:bipush          8
	//   69  121:ishl            
	//   70  122:iadd            
	//   71  123:istore_3        
		}
	//*  72  124:goto            90
		peekLength = peekLength + (i + 1);
	//   73  127:aload_0         
	//   74  128:aload_0         
	//   75  129:getfield        #44  <Field int peekLength>
	//   76  132:iload_2         
	//   77  133:iconst_1        
	//   78  134:iadd            
	//   79  135:iadd            
	//   80  136:putfield        #44  <Field int peekLength>
		return (long)j;
	//   81  139:iload_3         
	//   82  140:i2l             
	//   83  141:lreturn         
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		long l2 = extractorinput.getLength();
	//    0    0:aload_1         
	//    1    1:invokeinterface #51  <Method long ExtractorInput.getLength()>
	//    2    6:lstore          7
		int i = l2 != -1L;
	//    3    8:lload           7
	//    4   10:ldc2w           #52  <Long -1L>
	//    5   13:lcmp            
	//    6   14:istore_2        
		long l5 = 1024L;
	//    7   15:ldc2w           #54  <Long 1024L>
	//    8   18:lstore          9
		long l1 = l5;
	//    9   20:lload           9
	//   10   22:lstore          5
		if(i != 0)
	//*  11   24:iload_2         
	//*  12   25:ifeq            48
			if(l2 > 1024L)
	//*  13   28:lload           7
	//*  14   30:ldc2w           #54  <Long 1024L>
	//*  15   33:lcmp            
	//*  16   34:ifle            44
				l1 = l5;
	//   17   37:lload           9
	//   18   39:lstore          5
			else
	//*  19   41:goto            48
				l1 = l2;
	//   20   44:lload           7
	//   21   46:lstore          5
		int k = (int)l1;
	//   22   48:lload           5
	//   23   50:l2i             
	//   24   51:istore_3        
		extractorinput.peekFully(scratch.data, 0, 4);
	//   25   52:aload_1         
	//   26   53:aload_0         
	//   27   54:getfield        #23  <Field ParsableByteArray scratch>
	//   28   57:getfield        #34  <Field byte[] ParsableByteArray.data>
	//   29   60:iconst_0        
	//   30   61:iconst_4        
	//   31   62:invokeinterface #40  <Method void ExtractorInput.peekFully(byte[], int, int)>
		l1 = scratch.readUnsignedInt();
	//   32   67:aload_0         
	//   33   68:getfield        #23  <Field ParsableByteArray scratch>
	//   34   71:invokevirtual   #58  <Method long ParsableByteArray.readUnsignedInt()>
	//   35   74:lstore          5
		peekLength = 4;
	//   36   76:aload_0         
	//   37   77:iconst_4        
	//   38   78:putfield        #44  <Field int peekLength>
		for(; l1 != 0x1a45dfa3L; l1 = (long)(scratch.data[0] & 0xff) | l1 << 8 & -256L)
	//*  39   81:lload           5
	//*  40   83:ldc2w           #59  <Long 0x1a45dfa3L>
	//*  41   86:lcmp            
	//*  42   87:ifeq            156
		{
			int l = peekLength + 1;
	//   43   90:aload_0         
	//   44   91:getfield        #44  <Field int peekLength>
	//   45   94:iconst_1        
	//   46   95:iadd            
	//   47   96:istore          4
			peekLength = l;
	//   48   98:aload_0         
	//   49   99:iload           4
	//   50  101:putfield        #44  <Field int peekLength>
			if(l == k)
	//*  51  104:iload           4
	//*  52  106:iload_3         
	//*  53  107:icmpne          112
				return false;
	//   54  110:iconst_0        
	//   55  111:ireturn         
			extractorinput.peekFully(scratch.data, 0, 1);
	//   56  112:aload_1         
	//   57  113:aload_0         
	//   58  114:getfield        #23  <Field ParsableByteArray scratch>
	//   59  117:getfield        #34  <Field byte[] ParsableByteArray.data>
	//   60  120:iconst_0        
	//   61  121:iconst_1        
	//   62  122:invokeinterface #40  <Method void ExtractorInput.peekFully(byte[], int, int)>
		}

	//   63  127:aload_0         
	//   64  128:getfield        #23  <Field ParsableByteArray scratch>
	//   65  131:getfield        #34  <Field byte[] ParsableByteArray.data>
	//   66  134:iconst_0        
	//   67  135:baload          
	//   68  136:sipush          255
	//   69  139:iand            
	//   70  140:i2l             
	//   71  141:lload           5
	//   72  143:bipush          8
	//   73  145:lshl            
	//   74  146:ldc2w           #61  <Long -256L>
	//   75  149:land            
	//   76  150:lor             
	//   77  151:lstore          5
	//*  78  153:goto            81
		l1 = readUint(extractorinput);
	//   79  156:aload_0         
	//   80  157:aload_1         
	//   81  158:invokespecial   #64  <Method long readUint(ExtractorInput)>
	//   82  161:lstore          5
		l5 = peekLength;
	//   83  163:aload_0         
	//   84  164:getfield        #44  <Field int peekLength>
	//   85  167:i2l             
	//   86  168:lstore          9
		if(l1 != 0x0L)
	//*  87  170:lload           5
	//*  88  172:ldc2w           #41  <Long 0x0L>
	//*  89  175:lcmp            
	//*  90  176:ifeq            304
		{
			if(i != 0 && l5 + l1 >= l2)
	//*  91  179:iload_2         
	//*  92  180:ifeq            196
	//*  93  183:lload           9
	//*  94  185:lload           5
	//*  95  187:ladd            
	//*  96  188:lload           7
	//*  97  190:lcmp            
	//*  98  191:iflt            196
				return false;
	//   99  194:iconst_0        
	//  100  195:ireturn         
			do
			{
				int j = peekLength;
	//  101  196:aload_0         
	//  102  197:getfield        #44  <Field int peekLength>
	//  103  200:istore_2        
				long l3 = j;
	//  104  201:iload_2         
	//  105  202:i2l             
	//  106  203:lstore          7
				long l6 = l5 + l1;
	//  107  205:lload           9
	//  108  207:lload           5
	//  109  209:ladd            
	//  110  210:lstore          11
				if(l3 < l6)
	//* 111  212:lload           7
	//* 112  214:lload           11
	//* 113  216:lcmp            
	//* 114  217:ifge            292
				{
					if(readUint(extractorinput) == 0x0L)
	//* 115  220:aload_0         
	//* 116  221:aload_1         
	//* 117  222:invokespecial   #64  <Method long readUint(ExtractorInput)>
	//* 118  225:ldc2w           #41  <Long 0x0L>
	//* 119  228:lcmp            
	//* 120  229:ifne            234
						return false;
	//  121  232:iconst_0        
	//  122  233:ireturn         
					long l4 = readUint(extractorinput);
	//  123  234:aload_0         
	//  124  235:aload_1         
	//  125  236:invokespecial   #64  <Method long readUint(ExtractorInput)>
	//  126  239:lstore          7
					j = l4 != 0L;
	//  127  241:lload           7
	//  128  243:lconst_0        
	//  129  244:lcmp            
	//  130  245:istore_2        
					if(j >= 0)
	//* 131  246:iload_2         
	//* 132  247:iflt            290
					{
						if(l4 > 0x7fffffffL)
	//* 133  250:lload           7
	//* 134  252:ldc2w           #65  <Long 0x7fffffffL>
	//* 135  255:lcmp            
	//* 136  256:ifle            261
							return false;
	//  137  259:iconst_0        
	//  138  260:ireturn         
						if(j != 0)
	//* 139  261:iload_2         
	//* 140  262:ifeq            196
						{
							extractorinput.advancePeekPosition((int)l4);
	//  141  265:aload_1         
	//  142  266:lload           7
	//  143  268:l2i             
	//  144  269:invokeinterface #69  <Method void ExtractorInput.advancePeekPosition(int)>
							peekLength = (int)((long)peekLength + l4);
	//  145  274:aload_0         
	//  146  275:aload_0         
	//  147  276:getfield        #44  <Field int peekLength>
	//  148  279:i2l             
	//  149  280:lload           7
	//  150  282:ladd            
	//  151  283:l2i             
	//  152  284:putfield        #44  <Field int peekLength>
						}
					} else
	//* 153  287:goto            196
					{
						return false;
	//  154  290:iconst_0        
	//  155  291:ireturn         
					}
				} else
				{
					return (long)j == l6;
	//  156  292:iload_2         
	//  157  293:i2l             
	//  158  294:lload           11
	//  159  296:lcmp            
	//  160  297:ifne            302
	//  161  300:iconst_1        
	//  162  301:ireturn         
	//  163  302:iconst_0        
	//  164  303:ireturn         
				}
			} while(true);
		} else
		{
			return false;
	//  165  304:iconst_0        
	//  166  305:ireturn         
		}
	}

	private static final int ID_EBML = 0x1a45dfa3;
	private static final int SEARCH_LENGTH = 1024;
	private int peekLength;
	private final ParsableByteArray scratch = new ParsableByteArray(8);
}
