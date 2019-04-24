// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayDeque;

// Referenced classes of package com.google.android.exoplayer2.extractor.mkv:
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


	public DefaultEbmlReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          8
	//    4    7:newarray        byte[]
	//    5    9:putfield        #44  <Field byte[] scratch>
	//    6   12:aload_0         
	//    7   13:new             #46  <Class ArrayDeque>
	//    8   16:dup             
	//    9   17:invokespecial   #47  <Method void ArrayDeque()>
	//   10   20:putfield        #49  <Field ArrayDeque masterElementsStack>
	//   11   23:aload_0         
	//   12   24:new             #51  <Class VarintReader>
	//   13   27:dup             
	//   14   28:invokespecial   #52  <Method void VarintReader()>
	//   15   31:putfield        #54  <Field VarintReader varintReader>
	//   16   34:return          
	}

	private long maybeResyncToNextLevel1Element(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		extractorinput.resetPeekPosition();
	//    0    0:aload_1         
	//    1    1:invokeinterface #66  <Method void ExtractorInput.resetPeekPosition()>
		do
		{
			extractorinput.peekFully(scratch, 0, 4);
	//    2    6:aload_1         
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field byte[] scratch>
	//    5   11:iconst_0        
	//    6   12:iconst_4        
	//    7   13:invokeinterface #70  <Method void ExtractorInput.peekFully(byte[], int, int)>
			int i = VarintReader.parseUnsignedVarintLength(((int) (scratch[0])));
	//    8   18:aload_0         
	//    9   19:getfield        #44  <Field byte[] scratch>
	//   10   22:iconst_0        
	//   11   23:baload          
	//   12   24:invokestatic    #74  <Method int VarintReader.parseUnsignedVarintLength(int)>
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
	//   24   44:invokestatic    #78  <Method long VarintReader.assembleVarint(byte[], int, boolean)>
	//   25   47:l2i             
	//   26   48:istore_3        
				if(output.isLevel1Element(j))
	//*  27   49:aload_0         
	//*  28   50:getfield        #80  <Field EbmlReaderOutput output>
	//*  29   53:iload_3         
	//*  30   54:invokeinterface #86  <Method boolean EbmlReaderOutput.isLevel1Element(int)>
	//*  31   59:ifeq            72
				{
					extractorinput.skipFully(i);
	//   32   62:aload_1         
	//   33   63:iload_2         
	//   34   64:invokeinterface #90  <Method void ExtractorInput.skipFully(int)>
					return (long)j;
	//   35   69:iload_3         
	//   36   70:i2l             
	//   37   71:lreturn         
				}
			}
			extractorinput.skipFully(1);
	//   38   72:aload_1         
	//   39   73:iconst_1        
	//   40   74:invokeinterface #90  <Method void ExtractorInput.skipFully(int)>
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
	//    3    3:invokespecial   #97  <Method long readInteger(ExtractorInput, int)>
	//    4    6:lstore_3        
		if(i == 4)
	//*   5    7:iload_2         
	//*   6    8:iconst_4        
	//*   7    9:icmpne          19
			return (double)Float.intBitsToFloat((int)l);
	//    8   12:lload_3         
	//    9   13:l2i             
	//   10   14:invokestatic    #103 <Method float Float.intBitsToFloat(int)>
	//   11   17:f2d             
	//   12   18:dreturn         
		else
			return Double.longBitsToDouble(l);
	//   13   19:lload_3         
	//   14   20:invokestatic    #109 <Method double Double.longBitsToDouble(long)>
	//   15   23:dreturn         
	}

	private long readInteger(ExtractorInput extractorinput, int i)
		throws IOException, InterruptedException
	{
		byte abyte0[] = scratch;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field byte[] scratch>
	//    2    4:astore          8
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		extractorinput.readFully(abyte0, 0, i);
	//    5    8:aload_1         
	//    6    9:aload           8
	//    7   11:iconst_0        
	//    8   12:iload_2         
	//    9   13:invokeinterface #112 <Method void ExtractorInput.readFully(byte[], int, int)>
		long l;
		long l1;
		for(l = 0L; j < i; l = l << 8 | l1)
	//*  10   18:lconst_0        
	//*  11   19:lstore          4
	//*  12   21:iload_3         
	//*  13   22:iload_2         
	//*  14   23:icmpge          56
		{
			l1 = scratch[j] & 0xff;
	//   15   26:aload_0         
	//   16   27:getfield        #44  <Field byte[] scratch>
	//   17   30:iload_3         
	//   18   31:baload          
	//   19   32:sipush          255
	//   20   35:iand            
	//   21   36:i2l             
	//   22   37:lstore          6
			j++;
	//   23   39:iload_3         
	//   24   40:iconst_1        
	//   25   41:iadd            
	//   26   42:istore_3        
		}

	//   27   43:lload           4
	//   28   45:bipush          8
	//   29   47:lshl            
	//   30   48:lload           6
	//   31   50:lor             
	//   32   51:lstore          4
	//*  33   53:goto            21
		return l;
	//   34   56:lload           4
	//   35   58:lreturn         
	}

	private String readString(ExtractorInput extractorinput, int i)
		throws IOException, InterruptedException
	{
		if(i == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            7
			return "";
	//    2    4:ldc1            #116 <String "">
	//    3    6:areturn         
		byte abyte0[] = new byte[i];
	//    4    7:iload_2         
	//    5    8:newarray        byte[]
	//    6   10:astore_3        
		extractorinput.readFully(abyte0, 0, i);
	//    7   11:aload_1         
	//    8   12:aload_3         
	//    9   13:iconst_0        
	//   10   14:iload_2         
	//   11   15:invokeinterface #112 <Method void ExtractorInput.readFully(byte[], int, int)>
		for(; i > 0 && abyte0[i - 1] == 0; i--);
	//   12   20:iload_2         
	//   13   21:ifle            39
	//   14   24:aload_3         
	//   15   25:iload_2         
	//   16   26:iconst_1        
	//   17   27:isub            
	//   18   28:baload          
	//   19   29:ifne            39
	//   20   32:iload_2         
	//   21   33:iconst_1        
	//   22   34:isub            
	//   23   35:istore_2        
	//*  24   36:goto            20
		return new String(abyte0, 0, i);
	//   25   39:new             #118 <Class String>
	//   26   42:dup             
	//   27   43:aload_3         
	//   28   44:iconst_0        
	//   29   45:iload_2         
	//   30   46:invokespecial   #120 <Method void String(byte[], int, int)>
	//   31   49:areturn         
	}

	public void init(EbmlReaderOutput ebmlreaderoutput)
	{
		output = ebmlreaderoutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field EbmlReaderOutput output>
	//    3    5:return          
	}

	public boolean read(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		boolean flag;
		if(output != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field EbmlReaderOutput output>
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
	//    9   15:invokestatic    #130 <Method void Assertions.checkState(boolean)>
		do
		{
			if(!masterElementsStack.isEmpty() && extractorinput.getPosition() >= ((MasterElement)masterElementsStack.peek()).elementEndPosition)
	//*  10   18:aload_0         
	//*  11   19:getfield        #49  <Field ArrayDeque masterElementsStack>
	//*  12   22:invokevirtual   #134 <Method boolean ArrayDeque.isEmpty()>
	//*  13   25:ifne            75
	//*  14   28:aload_1         
	//*  15   29:invokeinterface #138 <Method long ExtractorInput.getPosition()>
	//*  16   34:aload_0         
	//*  17   35:getfield        #49  <Field ArrayDeque masterElementsStack>
	//*  18   38:invokevirtual   #142 <Method Object ArrayDeque.peek()>
	//*  19   41:checkcast       #10  <Class DefaultEbmlReader$MasterElement>
	//*  20   44:invokestatic    #146 <Method long DefaultEbmlReader$MasterElement.access$000(DefaultEbmlReader$MasterElement)>
	//*  21   47:lcmp            
	//*  22   48:iflt            75
			{
				output.endMasterElement(((MasterElement)masterElementsStack.pop()).elementId);
	//   23   51:aload_0         
	//   24   52:getfield        #80  <Field EbmlReaderOutput output>
	//   25   55:aload_0         
	//   26   56:getfield        #49  <Field ArrayDeque masterElementsStack>
	//   27   59:invokevirtual   #149 <Method Object ArrayDeque.pop()>
	//   28   62:checkcast       #10  <Class DefaultEbmlReader$MasterElement>
	//   29   65:invokestatic    #153 <Method int DefaultEbmlReader$MasterElement.access$100(DefaultEbmlReader$MasterElement)>
	//   30   68:invokeinterface #156 <Method void EbmlReaderOutput.endMasterElement(int)>
				return true;
	//   31   73:iconst_1        
	//   32   74:ireturn         
			}
			if(elementState == 0)
	//*  33   75:aload_0         
	//*  34   76:getfield        #158 <Field int elementState>
	//*  35   79:ifne            138
			{
				long l2 = varintReader.readUnsignedVarint(extractorinput, true, false, 4);
	//   36   82:aload_0         
	//   37   83:getfield        #54  <Field VarintReader varintReader>
	//   38   86:aload_1         
	//   39   87:iconst_1        
	//   40   88:iconst_0        
	//   41   89:iconst_4        
	//   42   90:invokevirtual   #162 <Method long VarintReader.readUnsignedVarint(ExtractorInput, boolean, boolean, int)>
	//   43   93:lstore          6
				long l = l2;
	//   44   95:lload           6
	//   45   97:lstore          4
				if(l2 == -2L)
	//*  46   99:lload           6
	//*  47  101:ldc2w           #163 <Long -2L>
	//*  48  104:lcmp            
	//*  49  105:ifne            115
					l = maybeResyncToNextLevel1Element(extractorinput);
	//   50  108:aload_0         
	//   51  109:aload_1         
	//   52  110:invokespecial   #166 <Method long maybeResyncToNextLevel1Element(ExtractorInput)>
	//   53  113:lstore          4
				if(l == -1L)
	//*  54  115:lload           4
	//*  55  117:ldc2w           #167 <Long -1L>
	//*  56  120:lcmp            
	//*  57  121:ifne            126
					return false;
	//   58  124:iconst_0        
	//   59  125:ireturn         
				elementId = (int)l;
	//   60  126:aload_0         
	//   61  127:lload           4
	//   62  129:l2i             
	//   63  130:putfield        #170 <Field int elementId>
				elementState = 1;
	//   64  133:aload_0         
	//   65  134:iconst_1        
	//   66  135:putfield        #158 <Field int elementState>
			}
			if(elementState == 1)
	//*  67  138:aload_0         
	//*  68  139:getfield        #158 <Field int elementState>
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
	//   78  156:invokevirtual   #162 <Method long VarintReader.readUnsignedVarint(ExtractorInput, boolean, boolean, int)>
	//   79  159:putfield        #172 <Field long elementContentSize>
				elementState = 2;
	//   80  162:aload_0         
	//   81  163:iconst_2        
	//   82  164:putfield        #158 <Field int elementState>
			}
			int i = output.getElementType(elementId);
	//   83  167:aload_0         
	//   84  168:getfield        #80  <Field EbmlReaderOutput output>
	//   85  171:aload_0         
	//   86  172:getfield        #170 <Field int elementId>
	//   87  175:invokeinterface #175 <Method int EbmlReaderOutput.getElementType(int)>
	//   88  180:istore_2        
			switch(i)
	//*  89  181:iload_2         
			{
	//*  90  182:tableswitch     0 5: default 220
	//	               0 585
	//	               1 521
	//	               2 444
	//	               3 367
	//	               4 341
	//	               5 253
			default:
				extractorinput = ((ExtractorInput) (new StringBuilder()));
	//   91  220:new             #177 <Class StringBuilder>
	//   92  223:dup             
	//   93  224:invokespecial   #178 <Method void StringBuilder()>
	//   94  227:astore_1        
				((StringBuilder) (extractorinput)).append("Invalid element type ");
	//   95  228:aload_1         
	//   96  229:ldc1            #180 <String "Invalid element type ">
	//   97  231:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   98  234:pop             
				((StringBuilder) (extractorinput)).append(i);
	//   99  235:aload_1         
	//  100  236:iload_2         
	//  101  237:invokevirtual   #187 <Method StringBuilder StringBuilder.append(int)>
	//  102  240:pop             
				throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//  103  241:new             #189 <Class ParserException>
	//  104  244:dup             
	//  105  245:aload_1         
	//  106  246:invokevirtual   #193 <Method String StringBuilder.toString()>
	//  107  249:invokespecial   #196 <Method void ParserException(String)>
	//  108  252:athrow          

			case 5: // '\005'
				if(elementContentSize != 4L && elementContentSize != 8L)
	//* 109  253:aload_0         
	//* 110  254:getfield        #172 <Field long elementContentSize>
	//* 111  257:ldc2w           #197 <Long 4L>
	//* 112  260:lcmp            
	//* 113  261:ifeq            311
	//* 114  264:aload_0         
	//* 115  265:getfield        #172 <Field long elementContentSize>
	//* 116  268:ldc2w           #199 <Long 8L>
	//* 117  271:lcmp            
	//* 118  272:ifeq            311
				{
					extractorinput = ((ExtractorInput) (new StringBuilder()));
	//  119  275:new             #177 <Class StringBuilder>
	//  120  278:dup             
	//  121  279:invokespecial   #178 <Method void StringBuilder()>
	//  122  282:astore_1        
					((StringBuilder) (extractorinput)).append("Invalid float size: ");
	//  123  283:aload_1         
	//  124  284:ldc1            #202 <String "Invalid float size: ">
	//  125  286:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  126  289:pop             
					((StringBuilder) (extractorinput)).append(elementContentSize);
	//  127  290:aload_1         
	//  128  291:aload_0         
	//  129  292:getfield        #172 <Field long elementContentSize>
	//  130  295:invokevirtual   #205 <Method StringBuilder StringBuilder.append(long)>
	//  131  298:pop             
					throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//  132  299:new             #189 <Class ParserException>
	//  133  302:dup             
	//  134  303:aload_1         
	//  135  304:invokevirtual   #193 <Method String StringBuilder.toString()>
	//  136  307:invokespecial   #196 <Method void ParserException(String)>
	//  137  310:athrow          
				} else
				{
					output.floatElement(elementId, readFloat(extractorinput, (int)elementContentSize));
	//  138  311:aload_0         
	//  139  312:getfield        #80  <Field EbmlReaderOutput output>
	//  140  315:aload_0         
	//  141  316:getfield        #170 <Field int elementId>
	//  142  319:aload_0         
	//  143  320:aload_1         
	//  144  321:aload_0         
	//  145  322:getfield        #172 <Field long elementContentSize>
	//  146  325:l2i             
	//  147  326:invokespecial   #207 <Method double readFloat(ExtractorInput, int)>
	//  148  329:invokeinterface #211 <Method void EbmlReaderOutput.floatElement(int, double)>
					elementState = 0;
	//  149  334:aload_0         
	//  150  335:iconst_0        
	//  151  336:putfield        #158 <Field int elementState>
					return true;
	//  152  339:iconst_1        
	//  153  340:ireturn         
				}

			case 4: // '\004'
				output.binaryElement(elementId, (int)elementContentSize, extractorinput);
	//  154  341:aload_0         
	//  155  342:getfield        #80  <Field EbmlReaderOutput output>
	//  156  345:aload_0         
	//  157  346:getfield        #170 <Field int elementId>
	//  158  349:aload_0         
	//  159  350:getfield        #172 <Field long elementContentSize>
	//  160  353:l2i             
	//  161  354:aload_1         
	//  162  355:invokeinterface #215 <Method void EbmlReaderOutput.binaryElement(int, int, ExtractorInput)>
				elementState = 0;
	//  163  360:aload_0         
	//  164  361:iconst_0        
	//  165  362:putfield        #158 <Field int elementState>
				return true;
	//  166  365:iconst_1        
	//  167  366:ireturn         

			case 3: // '\003'
				if(elementContentSize > 0x7fffffffL)
	//* 168  367:aload_0         
	//* 169  368:getfield        #172 <Field long elementContentSize>
	//* 170  371:ldc2w           #216 <Long 0x7fffffffL>
	//* 171  374:lcmp            
	//* 172  375:ifle            414
				{
					extractorinput = ((ExtractorInput) (new StringBuilder()));
	//  173  378:new             #177 <Class StringBuilder>
	//  174  381:dup             
	//  175  382:invokespecial   #178 <Method void StringBuilder()>
	//  176  385:astore_1        
					((StringBuilder) (extractorinput)).append("String element size: ");
	//  177  386:aload_1         
	//  178  387:ldc1            #219 <String "String element size: ">
	//  179  389:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  180  392:pop             
					((StringBuilder) (extractorinput)).append(elementContentSize);
	//  181  393:aload_1         
	//  182  394:aload_0         
	//  183  395:getfield        #172 <Field long elementContentSize>
	//  184  398:invokevirtual   #205 <Method StringBuilder StringBuilder.append(long)>
	//  185  401:pop             
					throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//  186  402:new             #189 <Class ParserException>
	//  187  405:dup             
	//  188  406:aload_1         
	//  189  407:invokevirtual   #193 <Method String StringBuilder.toString()>
	//  190  410:invokespecial   #196 <Method void ParserException(String)>
	//  191  413:athrow          
				} else
				{
					output.stringElement(elementId, readString(extractorinput, (int)elementContentSize));
	//  192  414:aload_0         
	//  193  415:getfield        #80  <Field EbmlReaderOutput output>
	//  194  418:aload_0         
	//  195  419:getfield        #170 <Field int elementId>
	//  196  422:aload_0         
	//  197  423:aload_1         
	//  198  424:aload_0         
	//  199  425:getfield        #172 <Field long elementContentSize>
	//  200  428:l2i             
	//  201  429:invokespecial   #221 <Method String readString(ExtractorInput, int)>
	//  202  432:invokeinterface #225 <Method void EbmlReaderOutput.stringElement(int, String)>
					elementState = 0;
	//  203  437:aload_0         
	//  204  438:iconst_0        
	//  205  439:putfield        #158 <Field int elementState>
					return true;
	//  206  442:iconst_1        
	//  207  443:ireturn         
				}

			case 2: // '\002'
				if(elementContentSize > 8L)
	//* 208  444:aload_0         
	//* 209  445:getfield        #172 <Field long elementContentSize>
	//* 210  448:ldc2w           #199 <Long 8L>
	//* 211  451:lcmp            
	//* 212  452:ifle            491
				{
					extractorinput = ((ExtractorInput) (new StringBuilder()));
	//  213  455:new             #177 <Class StringBuilder>
	//  214  458:dup             
	//  215  459:invokespecial   #178 <Method void StringBuilder()>
	//  216  462:astore_1        
					((StringBuilder) (extractorinput)).append("Invalid integer size: ");
	//  217  463:aload_1         
	//  218  464:ldc1            #227 <String "Invalid integer size: ">
	//  219  466:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  220  469:pop             
					((StringBuilder) (extractorinput)).append(elementContentSize);
	//  221  470:aload_1         
	//  222  471:aload_0         
	//  223  472:getfield        #172 <Field long elementContentSize>
	//  224  475:invokevirtual   #205 <Method StringBuilder StringBuilder.append(long)>
	//  225  478:pop             
					throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//  226  479:new             #189 <Class ParserException>
	//  227  482:dup             
	//  228  483:aload_1         
	//  229  484:invokevirtual   #193 <Method String StringBuilder.toString()>
	//  230  487:invokespecial   #196 <Method void ParserException(String)>
	//  231  490:athrow          
				} else
				{
					output.integerElement(elementId, readInteger(extractorinput, (int)elementContentSize));
	//  232  491:aload_0         
	//  233  492:getfield        #80  <Field EbmlReaderOutput output>
	//  234  495:aload_0         
	//  235  496:getfield        #170 <Field int elementId>
	//  236  499:aload_0         
	//  237  500:aload_1         
	//  238  501:aload_0         
	//  239  502:getfield        #172 <Field long elementContentSize>
	//  240  505:l2i             
	//  241  506:invokespecial   #97  <Method long readInteger(ExtractorInput, int)>
	//  242  509:invokeinterface #231 <Method void EbmlReaderOutput.integerElement(int, long)>
					elementState = 0;
	//  243  514:aload_0         
	//  244  515:iconst_0        
	//  245  516:putfield        #158 <Field int elementState>
					return true;
	//  246  519:iconst_1        
	//  247  520:ireturn         
				}

			case 1: // '\001'
				long l1 = extractorinput.getPosition();
	//  248  521:aload_1         
	//  249  522:invokeinterface #138 <Method long ExtractorInput.getPosition()>
	//  250  527:lstore          4
				long l3 = elementContentSize;
	//  251  529:aload_0         
	//  252  530:getfield        #172 <Field long elementContentSize>
	//  253  533:lstore          6
				masterElementsStack.push(((Object) (new MasterElement(elementId, l1 + l3))));
	//  254  535:aload_0         
	//  255  536:getfield        #49  <Field ArrayDeque masterElementsStack>
	//  256  539:new             #10  <Class DefaultEbmlReader$MasterElement>
	//  257  542:dup             
	//  258  543:aload_0         
	//  259  544:getfield        #170 <Field int elementId>
	//  260  547:lload           4
	//  261  549:lload           6
	//  262  551:ladd            
	//  263  552:aconst_null     
	//  264  553:invokespecial   #234 <Method void DefaultEbmlReader$MasterElement(int, long, DefaultEbmlReader$1)>
	//  265  556:invokevirtual   #238 <Method void ArrayDeque.push(Object)>
				output.startMasterElement(elementId, l1, elementContentSize);
	//  266  559:aload_0         
	//  267  560:getfield        #80  <Field EbmlReaderOutput output>
	//  268  563:aload_0         
	//  269  564:getfield        #170 <Field int elementId>
	//  270  567:lload           4
	//  271  569:aload_0         
	//  272  570:getfield        #172 <Field long elementContentSize>
	//  273  573:invokeinterface #242 <Method void EbmlReaderOutput.startMasterElement(int, long, long)>
				elementState = 0;
	//  274  578:aload_0         
	//  275  579:iconst_0        
	//  276  580:putfield        #158 <Field int elementState>
				return true;
	//  277  583:iconst_1        
	//  278  584:ireturn         

			case 0: // '\0'
				extractorinput.skipFully((int)elementContentSize);
	//  279  585:aload_1         
	//  280  586:aload_0         
	//  281  587:getfield        #172 <Field long elementContentSize>
	//  282  590:l2i             
	//  283  591:invokeinterface #90  <Method void ExtractorInput.skipFully(int)>
				elementState = 0;
	//  284  596:aload_0         
	//  285  597:iconst_0        
	//  286  598:putfield        #158 <Field int elementState>
				break;
			}
		} while(true);
	//* 287  601:goto            18
	}

	public void reset()
	{
		elementState = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #158 <Field int elementState>
		masterElementsStack.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #49  <Field ArrayDeque masterElementsStack>
	//    5    9:invokevirtual   #246 <Method void ArrayDeque.clear()>
		varintReader.reset();
	//    6   12:aload_0         
	//    7   13:getfield        #54  <Field VarintReader varintReader>
	//    8   16:invokevirtual   #248 <Method void VarintReader.reset()>
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
	private final ArrayDeque masterElementsStack = new ArrayDeque();
	private EbmlReaderOutput output;
	private final byte scratch[] = new byte[8];
	private final VarintReader varintReader = new VarintReader();
}
