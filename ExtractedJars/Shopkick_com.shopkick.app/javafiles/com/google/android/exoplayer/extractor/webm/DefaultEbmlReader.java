// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.webm;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.util.Assertions;
import java.io.EOFException;
import java.io.IOException;
import java.util.Stack;

// Referenced classes of package com.google.android.exoplayer.extractor.webm:
//			EbmlReader, VarintReader, EbmlReaderOutput

final class DefaultEbmlReader
	implements EbmlReader
{
	private static final class MasterElement
	{

		private final long elementEndPosition;
		private final int elementId;


/*
		static long access$000(MasterElement masterelement)
		{
			return masterelement.elementEndPosition;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field long elementEndPosition>
		//    2    4:lreturn         
		}

*/


/*
		static int access$100(MasterElement masterelement)
		{
			return masterelement.elementId;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field int elementId>
		//    2    4:ireturn         
		}

*/

		private MasterElement(int i, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			elementId = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #18  <Field int elementId>
			elementEndPosition = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #20  <Field long elementEndPosition>
		//    8   14:return          
		}

		MasterElement(int i, long l, _cls1 _pcls1)
		{
			this(i, l);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:lload_2         
		//    3    3:invokespecial   #24  <Method void DefaultEbmlReader$MasterElement(int, long)>
		//    4    6:return          
		}
	}


	DefaultEbmlReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          8
	//    4    7:newarray        byte[]
	//    5    9:putfield        #44  <Field byte[] scratch>
	//    6   12:aload_0         
	//    7   13:new             #46  <Class Stack>
	//    8   16:dup             
	//    9   17:invokespecial   #47  <Method void Stack()>
	//   10   20:putfield        #49  <Field Stack masterElementsStack>
	//   11   23:aload_0         
	//   12   24:new             #51  <Class VarintReader>
	//   13   27:dup             
	//   14   28:invokespecial   #52  <Method void VarintReader()>
	//   15   31:putfield        #54  <Field VarintReader varintReader>
	//   16   34:return          
	}

	private long maybeResyncToNextLevel1Element(ExtractorInput extractorinput)
		throws EOFException, IOException, InterruptedException
	{
		extractorinput.resetPeekPosition();
	//    0    0:aload_1         
	//    1    1:invokeinterface #68  <Method void ExtractorInput.resetPeekPosition()>
		do
		{
			extractorinput.peekFully(scratch, 0, 4);
	//    2    6:aload_1         
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field byte[] scratch>
	//    5   11:iconst_0        
	//    6   12:iconst_4        
	//    7   13:invokeinterface #72  <Method void ExtractorInput.peekFully(byte[], int, int)>
			int i = VarintReader.parseUnsignedVarintLength(((int) (scratch[0])));
	//    8   18:aload_0         
	//    9   19:getfield        #44  <Field byte[] scratch>
	//   10   22:iconst_0        
	//   11   23:baload          
	//   12   24:invokestatic    #76  <Method int VarintReader.parseUnsignedVarintLength(int)>
	//   13   27:istore_2        
			if(i != -1 && i <= 4)
	//*  14   28:iload_2         
	//*  15   29:iconst_m1       
	//*  16   30:icmpeq          72
	//*  17   33:iload_2         
	//*  18   34:iconst_4        
	//*  19   35:icmpgt          72
			{
				int j = (int)VarintReader.assembleVarint(scratch, i, false);
	//   20   38:aload_0         
	//   21   39:getfield        #44  <Field byte[] scratch>
	//   22   42:iload_2         
	//   23   43:iconst_0        
	//   24   44:invokestatic    #80  <Method long VarintReader.assembleVarint(byte[], int, boolean)>
	//   25   47:l2i             
	//   26   48:istore_3        
				if(output.isLevel1Element(j))
	//*  27   49:aload_0         
	//*  28   50:getfield        #82  <Field EbmlReaderOutput output>
	//*  29   53:iload_3         
	//*  30   54:invokeinterface #88  <Method boolean EbmlReaderOutput.isLevel1Element(int)>
	//*  31   59:ifeq            72
				{
					extractorinput.skipFully(i);
	//   32   62:aload_1         
	//   33   63:iload_2         
	//   34   64:invokeinterface #92  <Method void ExtractorInput.skipFully(int)>
					return (long)j;
	//   35   69:iload_3         
	//   36   70:i2l             
	//   37   71:lreturn         
				}
			}
			extractorinput.skipFully(1);
	//   38   72:aload_1         
	//   39   73:iconst_1        
	//   40   74:invokeinterface #92  <Method void ExtractorInput.skipFully(int)>
		} while(true);
	//   41   79:goto            6
	}

	private double readFloat(ExtractorInput extractorinput, int i)
		throws IOException, InterruptedException
	{
		long l = readInteger(extractorinput, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #99  <Method long readInteger(ExtractorInput, int)>
	//    4    6:lstore_3        
		if(i == 4)
	//*   5    7:iload_2         
	//*   6    8:iconst_4        
	//*   7    9:icmpne          19
			return (double)Float.intBitsToFloat((int)l);
	//    8   12:lload_3         
	//    9   13:l2i             
	//   10   14:invokestatic    #105 <Method float Float.intBitsToFloat(int)>
	//   11   17:f2d             
	//   12   18:dreturn         
		else
			return Double.longBitsToDouble(l);
	//   13   19:lload_3         
	//   14   20:invokestatic    #111 <Method double Double.longBitsToDouble(long)>
	//   15   23:dreturn         
	}

	private long readInteger(ExtractorInput extractorinput, int i)
		throws IOException, InterruptedException
	{
		byte abyte0[] = scratch;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field byte[] scratch>
	//    2    4:astore          6
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		extractorinput.readFully(abyte0, 0, i);
	//    5    8:aload_1         
	//    6    9:aload           6
	//    7   11:iconst_0        
	//    8   12:iload_2         
	//    9   13:invokeinterface #114 <Method void ExtractorInput.readFully(byte[], int, int)>
		long l = 0L;
	//   10   18:lconst_0        
	//   11   19:lstore          4
		for(; j < i; j++)
	//*  12   21:iload_3         
	//*  13   22:iload_2         
	//*  14   23:icmpge          52
			l = l << 8 | (long)(scratch[j] & 0xff);
	//   15   26:lload           4
	//   16   28:bipush          8
	//   17   30:lshl            
	//   18   31:aload_0         
	//   19   32:getfield        #44  <Field byte[] scratch>
	//   20   35:iload_3         
	//   21   36:baload          
	//   22   37:sipush          255
	//   23   40:iand            
	//   24   41:i2l             
	//   25   42:lor             
	//   26   43:lstore          4

	//   27   45:iload_3         
	//   28   46:iconst_1        
	//   29   47:iadd            
	//   30   48:istore_3        
	//*  31   49:goto            21
		return l;
	//   32   52:lload           4
	//   33   54:lreturn         
	}

	private String readString(ExtractorInput extractorinput, int i)
		throws IOException, InterruptedException
	{
		if(i == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            7
		{
			return "";
	//    2    4:ldc1            #118 <String "">
	//    3    6:areturn         
		} else
		{
			byte abyte0[] = new byte[i];
	//    4    7:iload_2         
	//    5    8:newarray        byte[]
	//    6   10:astore_3        
			extractorinput.readFully(abyte0, 0, i);
	//    7   11:aload_1         
	//    8   12:aload_3         
	//    9   13:iconst_0        
	//   10   14:iload_2         
	//   11   15:invokeinterface #114 <Method void ExtractorInput.readFully(byte[], int, int)>
			return new String(abyte0);
	//   12   20:new             #120 <Class String>
	//   13   23:dup             
	//   14   24:aload_3         
	//   15   25:invokespecial   #123 <Method void String(byte[])>
	//   16   28:areturn         
		}
	}

	public void init(EbmlReaderOutput ebmlreaderoutput)
	{
		output = ebmlreaderoutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field EbmlReaderOutput output>
	//    3    5:return          
	}

	public boolean read(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		boolean flag;
		if(output != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field EbmlReaderOutput output>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		Assertions.checkState(flag);
	//    8   14:iload_3         
	//    9   15:invokestatic    #133 <Method void Assertions.checkState(boolean)>
		do
		{
			if(!masterElementsStack.isEmpty() && extractorinput.getPosition() >= ((MasterElement)masterElementsStack.peek()).elementEndPosition)
	//*  10   18:aload_0         
	//*  11   19:getfield        #49  <Field Stack masterElementsStack>
	//*  12   22:invokevirtual   #137 <Method boolean Stack.isEmpty()>
	//*  13   25:ifne            75
	//*  14   28:aload_1         
	//*  15   29:invokeinterface #141 <Method long ExtractorInput.getPosition()>
	//*  16   34:aload_0         
	//*  17   35:getfield        #49  <Field Stack masterElementsStack>
	//*  18   38:invokevirtual   #145 <Method Object Stack.peek()>
	//*  19   41:checkcast       #10  <Class DefaultEbmlReader$MasterElement>
	//*  20   44:invokestatic    #149 <Method long DefaultEbmlReader$MasterElement.access$000(DefaultEbmlReader$MasterElement)>
	//*  21   47:lcmp            
	//*  22   48:iflt            75
			{
				output.endMasterElement(((MasterElement)masterElementsStack.pop()).elementId);
	//   23   51:aload_0         
	//   24   52:getfield        #82  <Field EbmlReaderOutput output>
	//   25   55:aload_0         
	//   26   56:getfield        #49  <Field Stack masterElementsStack>
	//   27   59:invokevirtual   #152 <Method Object Stack.pop()>
	//   28   62:checkcast       #10  <Class DefaultEbmlReader$MasterElement>
	//   29   65:invokestatic    #156 <Method int DefaultEbmlReader$MasterElement.access$100(DefaultEbmlReader$MasterElement)>
	//   30   68:invokeinterface #159 <Method void EbmlReaderOutput.endMasterElement(int)>
				return true;
	//   31   73:iconst_1        
	//   32   74:ireturn         
			}
			if(elementState == 0)
	//*  33   75:aload_0         
	//*  34   76:getfield        #161 <Field int elementState>
	//*  35   79:ifne            138
			{
				long l5 = varintReader.readUnsignedVarint(extractorinput, true, false, 4);
	//   36   82:aload_0         
	//   37   83:getfield        #54  <Field VarintReader varintReader>
	//   38   86:aload_1         
	//   39   87:iconst_1        
	//   40   88:iconst_0        
	//   41   89:iconst_4        
	//   42   90:invokevirtual   #165 <Method long VarintReader.readUnsignedVarint(ExtractorInput, boolean, boolean, int)>
	//   43   93:lstore          6
				long l = l5;
	//   44   95:lload           6
	//   45   97:lstore          4
				if(l5 == -2L)
	//*  46   99:lload           6
	//*  47  101:ldc2w           #166 <Long -2L>
	//*  48  104:lcmp            
	//*  49  105:ifne            115
					l = maybeResyncToNextLevel1Element(extractorinput);
	//   50  108:aload_0         
	//   51  109:aload_1         
	//   52  110:invokespecial   #169 <Method long maybeResyncToNextLevel1Element(ExtractorInput)>
	//   53  113:lstore          4
				if(l == -1L)
	//*  54  115:lload           4
	//*  55  117:ldc2w           #170 <Long -1L>
	//*  56  120:lcmp            
	//*  57  121:ifne            126
					return false;
	//   58  124:iconst_0        
	//   59  125:ireturn         
				elementId = (int)l;
	//   60  126:aload_0         
	//   61  127:lload           4
	//   62  129:l2i             
	//   63  130:putfield        #173 <Field int elementId>
				elementState = 1;
	//   64  133:aload_0         
	//   65  134:iconst_1        
	//   66  135:putfield        #161 <Field int elementState>
			}
			if(elementState == 1)
	//*  67  138:aload_0         
	//*  68  139:getfield        #161 <Field int elementState>
	//*  69  142:iconst_1        
	//*  70  143:icmpne          167
			{
				elementContentSize = varintReader.readUnsignedVarint(extractorinput, false, true, 8);
	//   71  146:aload_0         
	//   72  147:aload_0         
	//   73  148:getfield        #54  <Field VarintReader varintReader>
	//   74  151:aload_1         
	//   75  152:iconst_0        
	//   76  153:iconst_1        
	//   77  154:bipush          8
	//   78  156:invokevirtual   #165 <Method long VarintReader.readUnsignedVarint(ExtractorInput, boolean, boolean, int)>
	//   79  159:putfield        #175 <Field long elementContentSize>
				elementState = 2;
	//   80  162:aload_0         
	//   81  163:iconst_2        
	//   82  164:putfield        #161 <Field int elementState>
			}
			int i = output.getElementType(elementId);
	//   83  167:aload_0         
	//   84  168:getfield        #82  <Field EbmlReaderOutput output>
	//   85  171:aload_0         
	//   86  172:getfield        #173 <Field int elementId>
	//   87  175:invokeinterface #178 <Method int EbmlReaderOutput.getElementType(int)>
	//   88  180:istore_2        
			switch(i)
	//*  89  181:iload_2         
			{
	//*  90  182:tableswitch     0 5: default 220
	//	               0 595
	//	               1 530
	//	               2 451
	//	               3 372
	//	               4 346
	//	               5 253
			default:
				extractorinput = ((ExtractorInput) (new StringBuilder()));
	//   91  220:new             #180 <Class StringBuilder>
	//   92  223:dup             
	//   93  224:invokespecial   #181 <Method void StringBuilder()>
	//   94  227:astore_1        
				((StringBuilder) (extractorinput)).append("Invalid element type ");
	//   95  228:aload_1         
	//   96  229:ldc1            #183 <String "Invalid element type ">
	//   97  231:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   98  234:pop             
				((StringBuilder) (extractorinput)).append(i);
	//   99  235:aload_1         
	//  100  236:iload_2         
	//  101  237:invokevirtual   #190 <Method StringBuilder StringBuilder.append(int)>
	//  102  240:pop             
				throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//  103  241:new             #192 <Class ParserException>
	//  104  244:dup             
	//  105  245:aload_1         
	//  106  246:invokevirtual   #196 <Method String StringBuilder.toString()>
	//  107  249:invokespecial   #199 <Method void ParserException(String)>
	//  108  252:athrow          

			case 5: // '\005'
				long l1 = elementContentSize;
	//  109  253:aload_0         
	//  110  254:getfield        #175 <Field long elementContentSize>
	//  111  257:lstore          4
				if(l1 != 4L && l1 != 8L)
	//* 112  259:lload           4
	//* 113  261:ldc2w           #200 <Long 4L>
	//* 114  264:lcmp            
	//* 115  265:ifeq            316
	//* 116  268:lload           4
	//* 117  270:ldc2w           #202 <Long 8L>
	//* 118  273:lcmp            
	//* 119  274:ifne            280
	//* 120  277:goto            316
				{
					extractorinput = ((ExtractorInput) (new StringBuilder()));
	//  121  280:new             #180 <Class StringBuilder>
	//  122  283:dup             
	//  123  284:invokespecial   #181 <Method void StringBuilder()>
	//  124  287:astore_1        
					((StringBuilder) (extractorinput)).append("Invalid float size: ");
	//  125  288:aload_1         
	//  126  289:ldc1            #205 <String "Invalid float size: ">
	//  127  291:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//  128  294:pop             
					((StringBuilder) (extractorinput)).append(elementContentSize);
	//  129  295:aload_1         
	//  130  296:aload_0         
	//  131  297:getfield        #175 <Field long elementContentSize>
	//  132  300:invokevirtual   #208 <Method StringBuilder StringBuilder.append(long)>
	//  133  303:pop             
					throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//  134  304:new             #192 <Class ParserException>
	//  135  307:dup             
	//  136  308:aload_1         
	//  137  309:invokevirtual   #196 <Method String StringBuilder.toString()>
	//  138  312:invokespecial   #199 <Method void ParserException(String)>
	//  139  315:athrow          
				} else
				{
					output.floatElement(elementId, readFloat(extractorinput, (int)elementContentSize));
	//  140  316:aload_0         
	//  141  317:getfield        #82  <Field EbmlReaderOutput output>
	//  142  320:aload_0         
	//  143  321:getfield        #173 <Field int elementId>
	//  144  324:aload_0         
	//  145  325:aload_1         
	//  146  326:aload_0         
	//  147  327:getfield        #175 <Field long elementContentSize>
	//  148  330:l2i             
	//  149  331:invokespecial   #210 <Method double readFloat(ExtractorInput, int)>
	//  150  334:invokeinterface #214 <Method void EbmlReaderOutput.floatElement(int, double)>
					elementState = 0;
	//  151  339:aload_0         
	//  152  340:iconst_0        
	//  153  341:putfield        #161 <Field int elementState>
					return true;
	//  154  344:iconst_1        
	//  155  345:ireturn         
				}

			case 4: // '\004'
				output.binaryElement(elementId, (int)elementContentSize, extractorinput);
	//  156  346:aload_0         
	//  157  347:getfield        #82  <Field EbmlReaderOutput output>
	//  158  350:aload_0         
	//  159  351:getfield        #173 <Field int elementId>
	//  160  354:aload_0         
	//  161  355:getfield        #175 <Field long elementContentSize>
	//  162  358:l2i             
	//  163  359:aload_1         
	//  164  360:invokeinterface #218 <Method void EbmlReaderOutput.binaryElement(int, int, ExtractorInput)>
				elementState = 0;
	//  165  365:aload_0         
	//  166  366:iconst_0        
	//  167  367:putfield        #161 <Field int elementState>
				return true;
	//  168  370:iconst_1        
	//  169  371:ireturn         

			case 3: // '\003'
				long l2 = elementContentSize;
	//  170  372:aload_0         
	//  171  373:getfield        #175 <Field long elementContentSize>
	//  172  376:lstore          4
				if(l2 <= 0x7fffffffL)
	//* 173  378:lload           4
	//* 174  380:ldc2w           #219 <Long 0x7fffffffL>
	//* 175  383:lcmp            
	//* 176  384:ifgt            415
				{
					output.stringElement(elementId, readString(extractorinput, (int)l2));
	//  177  387:aload_0         
	//  178  388:getfield        #82  <Field EbmlReaderOutput output>
	//  179  391:aload_0         
	//  180  392:getfield        #173 <Field int elementId>
	//  181  395:aload_0         
	//  182  396:aload_1         
	//  183  397:lload           4
	//  184  399:l2i             
	//  185  400:invokespecial   #222 <Method String readString(ExtractorInput, int)>
	//  186  403:invokeinterface #226 <Method void EbmlReaderOutput.stringElement(int, String)>
					elementState = 0;
	//  187  408:aload_0         
	//  188  409:iconst_0        
	//  189  410:putfield        #161 <Field int elementState>
					return true;
	//  190  413:iconst_1        
	//  191  414:ireturn         
				} else
				{
					extractorinput = ((ExtractorInput) (new StringBuilder()));
	//  192  415:new             #180 <Class StringBuilder>
	//  193  418:dup             
	//  194  419:invokespecial   #181 <Method void StringBuilder()>
	//  195  422:astore_1        
					((StringBuilder) (extractorinput)).append("String element size: ");
	//  196  423:aload_1         
	//  197  424:ldc1            #228 <String "String element size: ">
	//  198  426:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//  199  429:pop             
					((StringBuilder) (extractorinput)).append(elementContentSize);
	//  200  430:aload_1         
	//  201  431:aload_0         
	//  202  432:getfield        #175 <Field long elementContentSize>
	//  203  435:invokevirtual   #208 <Method StringBuilder StringBuilder.append(long)>
	//  204  438:pop             
					throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//  205  439:new             #192 <Class ParserException>
	//  206  442:dup             
	//  207  443:aload_1         
	//  208  444:invokevirtual   #196 <Method String StringBuilder.toString()>
	//  209  447:invokespecial   #199 <Method void ParserException(String)>
	//  210  450:athrow          
				}

			case 2: // '\002'
				long l3 = elementContentSize;
	//  211  451:aload_0         
	//  212  452:getfield        #175 <Field long elementContentSize>
	//  213  455:lstore          4
				if(l3 <= 8L)
	//* 214  457:lload           4
	//* 215  459:ldc2w           #202 <Long 8L>
	//* 216  462:lcmp            
	//* 217  463:ifgt            494
				{
					output.integerElement(elementId, readInteger(extractorinput, (int)l3));
	//  218  466:aload_0         
	//  219  467:getfield        #82  <Field EbmlReaderOutput output>
	//  220  470:aload_0         
	//  221  471:getfield        #173 <Field int elementId>
	//  222  474:aload_0         
	//  223  475:aload_1         
	//  224  476:lload           4
	//  225  478:l2i             
	//  226  479:invokespecial   #99  <Method long readInteger(ExtractorInput, int)>
	//  227  482:invokeinterface #232 <Method void EbmlReaderOutput.integerElement(int, long)>
					elementState = 0;
	//  228  487:aload_0         
	//  229  488:iconst_0        
	//  230  489:putfield        #161 <Field int elementState>
					return true;
	//  231  492:iconst_1        
	//  232  493:ireturn         
				} else
				{
					extractorinput = ((ExtractorInput) (new StringBuilder()));
	//  233  494:new             #180 <Class StringBuilder>
	//  234  497:dup             
	//  235  498:invokespecial   #181 <Method void StringBuilder()>
	//  236  501:astore_1        
					((StringBuilder) (extractorinput)).append("Invalid integer size: ");
	//  237  502:aload_1         
	//  238  503:ldc1            #234 <String "Invalid integer size: ">
	//  239  505:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//  240  508:pop             
					((StringBuilder) (extractorinput)).append(elementContentSize);
	//  241  509:aload_1         
	//  242  510:aload_0         
	//  243  511:getfield        #175 <Field long elementContentSize>
	//  244  514:invokevirtual   #208 <Method StringBuilder StringBuilder.append(long)>
	//  245  517:pop             
					throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//  246  518:new             #192 <Class ParserException>
	//  247  521:dup             
	//  248  522:aload_1         
	//  249  523:invokevirtual   #196 <Method String StringBuilder.toString()>
	//  250  526:invokespecial   #199 <Method void ParserException(String)>
	//  251  529:athrow          
				}

			case 1: // '\001'
				long l4 = extractorinput.getPosition();
	//  252  530:aload_1         
	//  253  531:invokeinterface #141 <Method long ExtractorInput.getPosition()>
	//  254  536:lstore          4
				long l6 = elementContentSize;
	//  255  538:aload_0         
	//  256  539:getfield        #175 <Field long elementContentSize>
	//  257  542:lstore          6
				masterElementsStack.add(((Object) (new MasterElement(elementId, l6 + l4))));
	//  258  544:aload_0         
	//  259  545:getfield        #49  <Field Stack masterElementsStack>
	//  260  548:new             #10  <Class DefaultEbmlReader$MasterElement>
	//  261  551:dup             
	//  262  552:aload_0         
	//  263  553:getfield        #173 <Field int elementId>
	//  264  556:lload           6
	//  265  558:lload           4
	//  266  560:ladd            
	//  267  561:aconst_null     
	//  268  562:invokespecial   #237 <Method void DefaultEbmlReader$MasterElement(int, long, DefaultEbmlReader$1)>
	//  269  565:invokevirtual   #241 <Method boolean Stack.add(Object)>
	//  270  568:pop             
				output.startMasterElement(elementId, l4, elementContentSize);
	//  271  569:aload_0         
	//  272  570:getfield        #82  <Field EbmlReaderOutput output>
	//  273  573:aload_0         
	//  274  574:getfield        #173 <Field int elementId>
	//  275  577:lload           4
	//  276  579:aload_0         
	//  277  580:getfield        #175 <Field long elementContentSize>
	//  278  583:invokeinterface #245 <Method void EbmlReaderOutput.startMasterElement(int, long, long)>
				elementState = 0;
	//  279  588:aload_0         
	//  280  589:iconst_0        
	//  281  590:putfield        #161 <Field int elementState>
				return true;
	//  282  593:iconst_1        
	//  283  594:ireturn         

			case 0: // '\0'
				extractorinput.skipFully((int)elementContentSize);
	//  284  595:aload_1         
	//  285  596:aload_0         
	//  286  597:getfield        #175 <Field long elementContentSize>
	//  287  600:l2i             
	//  288  601:invokeinterface #92  <Method void ExtractorInput.skipFully(int)>
				elementState = 0;
	//  289  606:aload_0         
	//  290  607:iconst_0        
	//  291  608:putfield        #161 <Field int elementState>
				break;
			}
		} while(true);
	//* 292  611:goto            18
	}

	public void reset()
	{
		elementState = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #161 <Field int elementState>
		masterElementsStack.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #49  <Field Stack masterElementsStack>
	//    5    9:invokevirtual   #249 <Method void Stack.clear()>
		varintReader.reset();
	//    6   12:aload_0         
	//    7   13:getfield        #54  <Field VarintReader varintReader>
	//    8   16:invokevirtual   #251 <Method void VarintReader.reset()>
	//    9   19:return          
	}

	private static final int ELEMENT_STATE_READ_CONTENT = 2;
	private static final int ELEMENT_STATE_READ_CONTENT_SIZE = 1;
	private static final int ELEMENT_STATE_READ_ID = 0;
	private static final int MAX_ID_BYTES = 4;
	private static final int MAX_INTEGER_ELEMENT_SIZE_BYTES = 8;
	private static final int MAX_LENGTH_BYTES = 8;
	private static final int VALID_FLOAT32_ELEMENT_SIZE_BYTES = 4;
	private static final int VALID_FLOAT64_ELEMENT_SIZE_BYTES = 8;
	private long elementContentSize;
	private int elementId;
	private int elementState;
	private final Stack masterElementsStack = new Stack();
	private EbmlReaderOutput output;
	private final byte scratch[] = new byte[8];
	private final VarintReader varintReader = new VarintReader();
}
