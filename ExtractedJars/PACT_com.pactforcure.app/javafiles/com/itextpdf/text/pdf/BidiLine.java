// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.draw.DrawInterface;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.text.pdf.languages.ArabicLigaturizer;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			IntHashtable, PdfChunk, PdfFont, BaseFont, 
//			BidiOrder, PdfLine, HyphenationEvent

public class BidiLine
{

	public BidiLine()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
		pieceSize = 256;
	//    2    4:aload_0         
	//    3    5:sipush          256
	//    4    8:putfield        #66  <Field int pieceSize>
		text = new char[pieceSize];
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #66  <Field int pieceSize>
	//    8   16:newarray        char[]
	//    9   18:putfield        #68  <Field char[] text>
		detailChunks = new PdfChunk[pieceSize];
	//   10   21:aload_0         
	//   11   22:aload_0         
	//   12   23:getfield        #66  <Field int pieceSize>
	//   13   26:anewarray       PdfChunk[]
	//   14   29:putfield        #72  <Field PdfChunk[] detailChunks>
		totalTextLength = 0;
	//   15   32:aload_0         
	//   16   33:iconst_0        
	//   17   34:putfield        #74  <Field int totalTextLength>
		orderLevels = new byte[pieceSize];
	//   18   37:aload_0         
	//   19   38:aload_0         
	//   20   39:getfield        #66  <Field int pieceSize>
	//   21   42:newarray        byte[]
	//   22   44:putfield        #76  <Field byte[] orderLevels>
		indexChars = new int[pieceSize];
	//   23   47:aload_0         
	//   24   48:aload_0         
	//   25   49:getfield        #66  <Field int pieceSize>
	//   26   52:newarray        int[]
	//   27   54:putfield        #78  <Field int[] indexChars>
		chunks = new ArrayList();
	//   28   57:aload_0         
	//   29   58:new             #80  <Class ArrayList>
	//   30   61:dup             
	//   31   62:invokespecial   #81  <Method void ArrayList()>
	//   32   65:putfield        #83  <Field ArrayList chunks>
		indexChunk = 0;
	//   33   68:aload_0         
	//   34   69:iconst_0        
	//   35   70:putfield        #85  <Field int indexChunk>
		indexChunkChar = 0;
	//   36   73:aload_0         
	//   37   74:iconst_0        
	//   38   75:putfield        #87  <Field int indexChunkChar>
		currentChar = 0;
	//   39   78:aload_0         
	//   40   79:iconst_0        
	//   41   80:putfield        #89  <Field int currentChar>
		storedText = new char[0];
	//   42   83:aload_0         
	//   43   84:iconst_0        
	//   44   85:newarray        char[]
	//   45   87:putfield        #91  <Field char[] storedText>
		storedDetailChunks = new PdfChunk[0];
	//   46   90:aload_0         
	//   47   91:iconst_0        
	//   48   92:anewarray       PdfChunk[]
	//   49   95:putfield        #93  <Field PdfChunk[] storedDetailChunks>
		storedTotalTextLength = 0;
	//   50   98:aload_0         
	//   51   99:iconst_0        
	//   52  100:putfield        #95  <Field int storedTotalTextLength>
		storedOrderLevels = new byte[0];
	//   53  103:aload_0         
	//   54  104:iconst_0        
	//   55  105:newarray        byte[]
	//   56  107:putfield        #97  <Field byte[] storedOrderLevels>
		storedIndexChars = new int[0];
	//   57  110:aload_0         
	//   58  111:iconst_0        
	//   59  112:newarray        int[]
	//   60  114:putfield        #99  <Field int[] storedIndexChars>
		storedIndexChunk = 0;
	//   61  117:aload_0         
	//   62  118:iconst_0        
	//   63  119:putfield        #101 <Field int storedIndexChunk>
		storedIndexChunkChar = 0;
	//   64  122:aload_0         
	//   65  123:iconst_0        
	//   66  124:putfield        #103 <Field int storedIndexChunkChar>
		storedCurrentChar = 0;
	//   67  127:aload_0         
	//   68  128:iconst_0        
	//   69  129:putfield        #105 <Field int storedCurrentChar>
		isWordSplit = false;
	//   70  132:aload_0         
	//   71  133:iconst_0        
	//   72  134:putfield        #107 <Field boolean isWordSplit>
	//   73  137:return          
	}

	public BidiLine(BidiLine bidiline)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
		pieceSize = 256;
	//    2    4:aload_0         
	//    3    5:sipush          256
	//    4    8:putfield        #66  <Field int pieceSize>
		text = new char[pieceSize];
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #66  <Field int pieceSize>
	//    8   16:newarray        char[]
	//    9   18:putfield        #68  <Field char[] text>
		detailChunks = new PdfChunk[pieceSize];
	//   10   21:aload_0         
	//   11   22:aload_0         
	//   12   23:getfield        #66  <Field int pieceSize>
	//   13   26:anewarray       PdfChunk[]
	//   14   29:putfield        #72  <Field PdfChunk[] detailChunks>
		totalTextLength = 0;
	//   15   32:aload_0         
	//   16   33:iconst_0        
	//   17   34:putfield        #74  <Field int totalTextLength>
		orderLevels = new byte[pieceSize];
	//   18   37:aload_0         
	//   19   38:aload_0         
	//   20   39:getfield        #66  <Field int pieceSize>
	//   21   42:newarray        byte[]
	//   22   44:putfield        #76  <Field byte[] orderLevels>
		indexChars = new int[pieceSize];
	//   23   47:aload_0         
	//   24   48:aload_0         
	//   25   49:getfield        #66  <Field int pieceSize>
	//   26   52:newarray        int[]
	//   27   54:putfield        #78  <Field int[] indexChars>
		chunks = new ArrayList();
	//   28   57:aload_0         
	//   29   58:new             #80  <Class ArrayList>
	//   30   61:dup             
	//   31   62:invokespecial   #81  <Method void ArrayList()>
	//   32   65:putfield        #83  <Field ArrayList chunks>
		indexChunk = 0;
	//   33   68:aload_0         
	//   34   69:iconst_0        
	//   35   70:putfield        #85  <Field int indexChunk>
		indexChunkChar = 0;
	//   36   73:aload_0         
	//   37   74:iconst_0        
	//   38   75:putfield        #87  <Field int indexChunkChar>
		currentChar = 0;
	//   39   78:aload_0         
	//   40   79:iconst_0        
	//   41   80:putfield        #89  <Field int currentChar>
		storedText = new char[0];
	//   42   83:aload_0         
	//   43   84:iconst_0        
	//   44   85:newarray        char[]
	//   45   87:putfield        #91  <Field char[] storedText>
		storedDetailChunks = new PdfChunk[0];
	//   46   90:aload_0         
	//   47   91:iconst_0        
	//   48   92:anewarray       PdfChunk[]
	//   49   95:putfield        #93  <Field PdfChunk[] storedDetailChunks>
		storedTotalTextLength = 0;
	//   50   98:aload_0         
	//   51   99:iconst_0        
	//   52  100:putfield        #95  <Field int storedTotalTextLength>
		storedOrderLevels = new byte[0];
	//   53  103:aload_0         
	//   54  104:iconst_0        
	//   55  105:newarray        byte[]
	//   56  107:putfield        #97  <Field byte[] storedOrderLevels>
		storedIndexChars = new int[0];
	//   57  110:aload_0         
	//   58  111:iconst_0        
	//   59  112:newarray        int[]
	//   60  114:putfield        #99  <Field int[] storedIndexChars>
		storedIndexChunk = 0;
	//   61  117:aload_0         
	//   62  118:iconst_0        
	//   63  119:putfield        #101 <Field int storedIndexChunk>
		storedIndexChunkChar = 0;
	//   64  122:aload_0         
	//   65  123:iconst_0        
	//   66  124:putfield        #103 <Field int storedIndexChunkChar>
		storedCurrentChar = 0;
	//   67  127:aload_0         
	//   68  128:iconst_0        
	//   69  129:putfield        #105 <Field int storedCurrentChar>
		isWordSplit = false;
	//   70  132:aload_0         
	//   71  133:iconst_0        
	//   72  134:putfield        #107 <Field boolean isWordSplit>
		runDirection = bidiline.runDirection;
	//   73  137:aload_0         
	//   74  138:aload_1         
	//   75  139:getfield        #110 <Field int runDirection>
	//   76  142:putfield        #110 <Field int runDirection>
		pieceSize = bidiline.pieceSize;
	//   77  145:aload_0         
	//   78  146:aload_1         
	//   79  147:getfield        #66  <Field int pieceSize>
	//   80  150:putfield        #66  <Field int pieceSize>
		text = (char[])((char []) (bidiline.text)).clone();
	//   81  153:aload_0         
	//   82  154:aload_1         
	//   83  155:getfield        #68  <Field char[] text>
	//   84  158:invokevirtual   #115 <Method Object _5B_C.clone()>
	//   85  161:checkcast       #111 <Class char[]>
	//   86  164:putfield        #68  <Field char[] text>
		detailChunks = (PdfChunk[])((PdfChunk []) (bidiline.detailChunks)).clone();
	//   87  167:aload_0         
	//   88  168:aload_1         
	//   89  169:getfield        #72  <Field PdfChunk[] detailChunks>
	//   90  172:invokevirtual   #117 <Method Object _5B_Lcom.itextpdf.text.pdf.PdfChunk_3B_.clone()>
	//   91  175:checkcast       #116 <Class PdfChunk[]>
	//   92  178:putfield        #72  <Field PdfChunk[] detailChunks>
		totalTextLength = bidiline.totalTextLength;
	//   93  181:aload_0         
	//   94  182:aload_1         
	//   95  183:getfield        #74  <Field int totalTextLength>
	//   96  186:putfield        #74  <Field int totalTextLength>
		orderLevels = (byte[])((byte []) (bidiline.orderLevels)).clone();
	//   97  189:aload_0         
	//   98  190:aload_1         
	//   99  191:getfield        #76  <Field byte[] orderLevels>
	//  100  194:invokevirtual   #119 <Method Object _5B_B.clone()>
	//  101  197:checkcast       #118 <Class byte[]>
	//  102  200:putfield        #76  <Field byte[] orderLevels>
		indexChars = (int[])((int []) (bidiline.indexChars)).clone();
	//  103  203:aload_0         
	//  104  204:aload_1         
	//  105  205:getfield        #78  <Field int[] indexChars>
	//  106  208:invokevirtual   #121 <Method Object _5B_I.clone()>
	//  107  211:checkcast       #120 <Class int[]>
	//  108  214:putfield        #78  <Field int[] indexChars>
		chunks = new ArrayList(((java.util.Collection) (bidiline.chunks)));
	//  109  217:aload_0         
	//  110  218:new             #80  <Class ArrayList>
	//  111  221:dup             
	//  112  222:aload_1         
	//  113  223:getfield        #83  <Field ArrayList chunks>
	//  114  226:invokespecial   #124 <Method void ArrayList(java.util.Collection)>
	//  115  229:putfield        #83  <Field ArrayList chunks>
		indexChunk = bidiline.indexChunk;
	//  116  232:aload_0         
	//  117  233:aload_1         
	//  118  234:getfield        #85  <Field int indexChunk>
	//  119  237:putfield        #85  <Field int indexChunk>
		indexChunkChar = bidiline.indexChunkChar;
	//  120  240:aload_0         
	//  121  241:aload_1         
	//  122  242:getfield        #87  <Field int indexChunkChar>
	//  123  245:putfield        #87  <Field int indexChunkChar>
		currentChar = bidiline.currentChar;
	//  124  248:aload_0         
	//  125  249:aload_1         
	//  126  250:getfield        #89  <Field int currentChar>
	//  127  253:putfield        #89  <Field int currentChar>
		storedRunDirection = bidiline.storedRunDirection;
	//  128  256:aload_0         
	//  129  257:aload_1         
	//  130  258:getfield        #126 <Field int storedRunDirection>
	//  131  261:putfield        #126 <Field int storedRunDirection>
		storedText = (char[])((char []) (bidiline.storedText)).clone();
	//  132  264:aload_0         
	//  133  265:aload_1         
	//  134  266:getfield        #91  <Field char[] storedText>
	//  135  269:invokevirtual   #115 <Method Object _5B_C.clone()>
	//  136  272:checkcast       #111 <Class char[]>
	//  137  275:putfield        #91  <Field char[] storedText>
		storedDetailChunks = (PdfChunk[])((PdfChunk []) (bidiline.storedDetailChunks)).clone();
	//  138  278:aload_0         
	//  139  279:aload_1         
	//  140  280:getfield        #93  <Field PdfChunk[] storedDetailChunks>
	//  141  283:invokevirtual   #117 <Method Object _5B_Lcom.itextpdf.text.pdf.PdfChunk_3B_.clone()>
	//  142  286:checkcast       #116 <Class PdfChunk[]>
	//  143  289:putfield        #93  <Field PdfChunk[] storedDetailChunks>
		storedTotalTextLength = bidiline.storedTotalTextLength;
	//  144  292:aload_0         
	//  145  293:aload_1         
	//  146  294:getfield        #95  <Field int storedTotalTextLength>
	//  147  297:putfield        #95  <Field int storedTotalTextLength>
		storedOrderLevels = (byte[])((byte []) (bidiline.storedOrderLevels)).clone();
	//  148  300:aload_0         
	//  149  301:aload_1         
	//  150  302:getfield        #97  <Field byte[] storedOrderLevels>
	//  151  305:invokevirtual   #119 <Method Object _5B_B.clone()>
	//  152  308:checkcast       #118 <Class byte[]>
	//  153  311:putfield        #97  <Field byte[] storedOrderLevels>
		storedIndexChars = (int[])((int []) (bidiline.storedIndexChars)).clone();
	//  154  314:aload_0         
	//  155  315:aload_1         
	//  156  316:getfield        #99  <Field int[] storedIndexChars>
	//  157  319:invokevirtual   #121 <Method Object _5B_I.clone()>
	//  158  322:checkcast       #120 <Class int[]>
	//  159  325:putfield        #99  <Field int[] storedIndexChars>
		storedIndexChunk = bidiline.storedIndexChunk;
	//  160  328:aload_0         
	//  161  329:aload_1         
	//  162  330:getfield        #101 <Field int storedIndexChunk>
	//  163  333:putfield        #101 <Field int storedIndexChunk>
		storedIndexChunkChar = bidiline.storedIndexChunkChar;
	//  164  336:aload_0         
	//  165  337:aload_1         
	//  166  338:getfield        #103 <Field int storedIndexChunkChar>
	//  167  341:putfield        #103 <Field int storedIndexChunkChar>
		storedCurrentChar = bidiline.storedCurrentChar;
	//  168  344:aload_0         
	//  169  345:aload_1         
	//  170  346:getfield        #105 <Field int storedCurrentChar>
	//  171  349:putfield        #105 <Field int storedCurrentChar>
		shortStore = bidiline.shortStore;
	//  172  352:aload_0         
	//  173  353:aload_1         
	//  174  354:getfield        #128 <Field boolean shortStore>
	//  175  357:putfield        #128 <Field boolean shortStore>
		arabicOptions = bidiline.arabicOptions;
	//  176  360:aload_0         
	//  177  361:aload_1         
	//  178  362:getfield        #130 <Field int arabicOptions>
	//  179  365:putfield        #130 <Field int arabicOptions>
	//  180  368:return          
	}

	public static boolean isWS(char c)
	{
		return c <= ' ';
	//    0    0:iload_0         
	//    1    1:bipush          32
	//    2    3:icmpgt          8
	//    3    6:iconst_1        
	//    4    7:ireturn         
	//    5    8:iconst_0        
	//    6    9:ireturn         
	}

	public static String processLTR(String s, int i, int j)
	{
		Object obj = ((Object) (new BidiLine()));
	//    0    0:new             #2   <Class BidiLine>
	//    1    3:dup             
	//    2    4:invokespecial   #135 <Method void BidiLine()>
	//    3    7:astore_3        
		((BidiLine) (obj)).addChunk(new PdfChunk(new Chunk(s), ((PdfAction) (null))));
	//    4    8:aload_3         
	//    5    9:new             #70  <Class PdfChunk>
	//    6   12:dup             
	//    7   13:new             #137 <Class Chunk>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokespecial   #140 <Method void Chunk(String)>
	//   11   21:aconst_null     
	//   12   22:invokespecial   #143 <Method void PdfChunk(Chunk, PdfAction)>
	//   13   25:invokevirtual   #147 <Method void addChunk(PdfChunk)>
		obj.arabicOptions = j;
	//   14   28:aload_3         
	//   15   29:iload_2         
	//   16   30:putfield        #130 <Field int arabicOptions>
		((BidiLine) (obj)).getParagraph(i);
	//   17   33:aload_3         
	//   18   34:iload_1         
	//   19   35:invokevirtual   #151 <Method boolean getParagraph(int)>
	//   20   38:pop             
		obj = ((Object) (((BidiLine) (obj)).createArrayOfPdfChunks(0, ((BidiLine) (obj)).totalTextLength - 1)));
	//   21   39:aload_3         
	//   22   40:iconst_0        
	//   23   41:aload_3         
	//   24   42:getfield        #74  <Field int totalTextLength>
	//   25   45:iconst_1        
	//   26   46:isub            
	//   27   47:invokevirtual   #155 <Method ArrayList createArrayOfPdfChunks(int, int)>
	//   28   50:astore_3        
		s = ((String) (new StringBuilder()));
	//   29   51:new             #157 <Class StringBuilder>
	//   30   54:dup             
	//   31   55:invokespecial   #158 <Method void StringBuilder()>
	//   32   58:astore_0        
		for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((StringBuilder) (s)).append(((PdfChunk)((Iterator) (obj)).next()).toString()));
	//   33   59:aload_3         
	//   34   60:invokevirtual   #162 <Method Iterator ArrayList.iterator()>
	//   35   63:astore_3        
	//   36   64:aload_3         
	//   37   65:invokeinterface #168 <Method boolean Iterator.hasNext()>
	//   38   70:ifeq            93
	//   39   73:aload_0         
	//   40   74:aload_3         
	//   41   75:invokeinterface #171 <Method Object Iterator.next()>
	//   42   80:checkcast       #70  <Class PdfChunk>
	//   43   83:invokevirtual   #175 <Method String PdfChunk.toString()>
	//   44   86:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   45   89:pop             
	//*  46   90:goto            64
		return ((StringBuilder) (s)).toString();
	//   47   93:aload_0         
	//   48   94:invokevirtual   #180 <Method String StringBuilder.toString()>
	//   49   97:areturn         
	}

	private float processTabStop(TabStop tabstop, float f, float f1, float f2, float f3, boolean flag, List list)
	{
		f3 = tabstop.getPosition(f, f1 - f2, f3);
	//    0    0:aload_1         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:fload           4
	//    4    5:fsub            
	//    5    6:fload           5
	//    6    8:invokevirtual   #188 <Method float TabStop.getPosition(float, float, float)>
	//    7   11:fstore          5
		float f4 = f2 - (f3 - f);
	//    8   13:fload           4
	//    9   15:fload           5
	//   10   17:fload_2         
	//   11   18:fsub            
	//   12   19:fsub            
	//   13   20:fstore          8
		f2 = f3;
	//   14   22:fload           5
	//   15   24:fstore          4
		f1 = f4;
	//   16   26:fload           8
	//   17   28:fstore_3        
		if(f4 < 0.0F)
	//*  18   29:fload           8
	//*  19   31:fconst_0        
	//*  20   32:fcmpg           
	//*  21   33:ifge            45
		{
			f2 = f3 + f4;
	//   22   36:fload           5
	//   23   38:fload           8
	//   24   40:fadd            
	//   25   41:fstore          4
			f1 = 0.0F;
	//   26   43:fconst_0        
	//   27   44:fstore_3        
		}
		if(!flag)
	//*  28   45:iload           6
	//*  29   47:ifne            58
		{
			tabstop.setPosition(f2);
	//   30   50:aload_1         
	//   31   51:fload           4
	//   32   53:invokevirtual   #192 <Method void TabStop.setPosition(float)>
			return f1;
	//   33   56:fload_3         
	//   34   57:freturn         
		} else
		{
			tabstop.setPosition(f);
	//   35   58:aload_1         
	//   36   59:fload_2         
	//   37   60:invokevirtual   #192 <Method void TabStop.setPosition(float)>
			list.add(((Object) (tabstop)));
	//   38   63:aload           7
	//   39   65:aload_1         
	//   40   66:invokeinterface #198 <Method boolean List.add(Object)>
	//   41   71:pop             
			return f1;
	//   42   72:fload_3         
	//   43   73:freturn         
		}
	}

	public void addChunk(PdfChunk pdfchunk)
	{
		chunks.add(((Object) (pdfchunk)));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field ArrayList chunks>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #201 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void addChunks(ArrayList arraylist)
	{
		chunks.addAll(((java.util.Collection) (arraylist)));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field ArrayList chunks>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #207 <Method boolean ArrayList.addAll(java.util.Collection)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void addPiece(char c, PdfChunk pdfchunk)
	{
		if(totalTextLength >= pieceSize)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field int totalTextLength>
	//*   2    4:aload_0         
	//*   3    5:getfield        #66  <Field int pieceSize>
	//*   4    8:icmplt          84
		{
			char ac[] = text;
	//    5   11:aload_0         
	//    6   12:getfield        #68  <Field char[] text>
	//    7   15:astore          4
			PdfChunk apdfchunk1[] = detailChunks;
	//    8   17:aload_0         
	//    9   18:getfield        #72  <Field PdfChunk[] detailChunks>
	//   10   21:astore          5
			pieceSize = pieceSize * 2;
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #66  <Field int pieceSize>
	//   14   28:iconst_2        
	//   15   29:imul            
	//   16   30:putfield        #66  <Field int pieceSize>
			text = new char[pieceSize];
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #66  <Field int pieceSize>
	//   20   38:newarray        char[]
	//   21   40:putfield        #68  <Field char[] text>
			detailChunks = new PdfChunk[pieceSize];
	//   22   43:aload_0         
	//   23   44:aload_0         
	//   24   45:getfield        #66  <Field int pieceSize>
	//   25   48:anewarray       PdfChunk[]
	//   26   51:putfield        #72  <Field PdfChunk[] detailChunks>
			System.arraycopy(((Object) (ac)), 0, ((Object) (text)), 0, totalTextLength);
	//   27   54:aload           4
	//   28   56:iconst_0        
	//   29   57:aload_0         
	//   30   58:getfield        #68  <Field char[] text>
	//   31   61:iconst_0        
	//   32   62:aload_0         
	//   33   63:getfield        #74  <Field int totalTextLength>
	//   34   66:invokestatic    #216 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (apdfchunk1)), 0, ((Object) (detailChunks)), 0, totalTextLength);
	//   35   69:aload           5
	//   36   71:iconst_0        
	//   37   72:aload_0         
	//   38   73:getfield        #72  <Field PdfChunk[] detailChunks>
	//   39   76:iconst_0        
	//   40   77:aload_0         
	//   41   78:getfield        #74  <Field int totalTextLength>
	//   42   81:invokestatic    #216 <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		text[totalTextLength] = c;
	//   43   84:aload_0         
	//   44   85:getfield        #68  <Field char[] text>
	//   45   88:aload_0         
	//   46   89:getfield        #74  <Field int totalTextLength>
	//   47   92:iload_1         
	//   48   93:castore         
		PdfChunk apdfchunk[] = detailChunks;
	//   49   94:aload_0         
	//   50   95:getfield        #72  <Field PdfChunk[] detailChunks>
	//   51   98:astore          4
		int i = totalTextLength;
	//   52  100:aload_0         
	//   53  101:getfield        #74  <Field int totalTextLength>
	//   54  104:istore_3        
		totalTextLength = i + 1;
	//   55  105:aload_0         
	//   56  106:iload_3         
	//   57  107:iconst_1        
	//   58  108:iadd            
	//   59  109:putfield        #74  <Field int totalTextLength>
		apdfchunk[i] = pdfchunk;
	//   60  112:aload           4
	//   61  114:iload_3         
	//   62  115:aload_2         
	//   63  116:aastore         
	//   64  117:return          
	}

	public void clearChunks()
	{
		chunks.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field ArrayList chunks>
	//    2    4:invokevirtual   #220 <Method void ArrayList.clear()>
		totalTextLength = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #74  <Field int totalTextLength>
		currentChar = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #89  <Field int currentChar>
	//    9   17:return          
	}

	public ArrayList createArrayOfPdfChunks(int i, int j)
	{
		return createArrayOfPdfChunks(i, j, ((PdfChunk) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #223 <Method ArrayList createArrayOfPdfChunks(int, int, PdfChunk)>
	//    5    7:areturn         
	}

	public ArrayList createArrayOfPdfChunks(int i, int j, PdfChunk pdfchunk)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		StringBuffer stringbuffer;
		PdfChunk pdfchunk1;
		ArrayList arraylist;
		if(runDirection == 1)
	//*   2    3:aload_0         
	//*   3    4:getfield        #110 <Field int runDirection>
	//*   4    7:iconst_1        
	//*   5    8:icmpeq          104
	//*   6   11:iload           5
	//*   7   13:ifeq            22
	//*   8   16:aload_0         
	//*   9   17:iload_1         
	//*  10   18:iload_2         
	//*  11   19:invokevirtual   #228 <Method void reorder(int, int)>
	//*  12   22:new             #80  <Class ArrayList>
	//*  13   25:dup             
	//*  14   26:invokespecial   #81  <Method void ArrayList()>
	//*  15   29:astore          11
	//*  16   31:aload_0         
	//*  17   32:getfield        #72  <Field PdfChunk[] detailChunks>
	//*  18   35:iload_1         
	//*  19   36:aaload          
	//*  20   37:astore          9
	//*  21   39:new             #230 <Class StringBuffer>
	//*  22   42:dup             
	//*  23   43:invokespecial   #231 <Method void StringBuffer()>
	//*  24   46:astore          7
	//*  25   48:iload_1         
	//*  26   49:iload_2         
	//*  27   50:icmpgt          298
	//*  28   53:iload           5
	//*  29   55:ifeq            110
	//*  30   58:aload_0         
	//*  31   59:getfield        #78  <Field int[] indexChars>
	//*  32   62:iload_1         
	//*  33   63:iaload          
	//*  34   64:istore          6
	//*  35   66:aload_0         
	//*  36   67:getfield        #68  <Field char[] text>
	//*  37   70:iload           6
	//*  38   72:caload          
	//*  39   73:istore          4
	//*  40   75:aload_0         
	//*  41   76:getfield        #72  <Field PdfChunk[] detailChunks>
	//*  42   79:iload           6
	//*  43   81:aaload          
	//*  44   82:astore          10
	//*  45   84:aload           10
	//*  46   86:iload           4
	//*  47   88:invokevirtual   #235 <Method int PdfChunk.getUnicodeEquivalent(int)>
	//*  48   91:invokestatic    #238 <Method boolean PdfChunk.noPrint(int)>
	//*  49   94:ifeq            116
	//*  50   97:iload_1         
	//*  51   98:iconst_1        
	//*  52   99:iadd            
	//*  53  100:istore_1        
	//*  54  101:goto            48
			flag = false;
	//   55  104:iconst_0        
	//   56  105:istore          5
		if(flag)
			reorder(i, j);
		arraylist = new ArrayList();
		pdfchunk1 = detailChunks[i];
		stringbuffer = new StringBuffer();
		while(i <= j) 
		{
			char c;
			int k;
			PdfChunk pdfchunk2;
			if(flag)
				k = indexChars[i];
			else
	//*  57  107:goto            11
				k = i;
	//   58  110:iload_1         
	//   59  111:istore          6
			c = text[k];
			pdfchunk2 = detailChunks[k];
			if(!PdfChunk.noPrint(pdfchunk2.getUnicodeEquivalent(((int) (c)))))
	//*  60  113:goto            66
				if(pdfchunk2.isImage() || pdfchunk2.isSeparator() || pdfchunk2.isTab())
	//*  61  116:aload           10
	//*  62  118:invokevirtual   #241 <Method boolean PdfChunk.isImage()>
	//*  63  121:ifne            140
	//*  64  124:aload           10
	//*  65  126:invokevirtual   #244 <Method boolean PdfChunk.isSeparator()>
	//*  66  129:ifne            140
	//*  67  132:aload           10
	//*  68  134:invokevirtual   #247 <Method boolean PdfChunk.isTab()>
	//*  69  137:ifeq            196
				{
					StringBuffer stringbuffer1 = stringbuffer;
	//   70  140:aload           7
	//   71  142:astore          8
					if(stringbuffer.length() > 0)
	//*  72  144:aload           7
	//*  73  146:invokevirtual   #251 <Method int StringBuffer.length()>
	//*  74  149:ifle            181
					{
						arraylist.add(((Object) (new PdfChunk(stringbuffer.toString(), pdfchunk1))));
	//   75  152:aload           11
	//   76  154:new             #70  <Class PdfChunk>
	//   77  157:dup             
	//   78  158:aload           7
	//   79  160:invokevirtual   #252 <Method String StringBuffer.toString()>
	//   80  163:aload           9
	//   81  165:invokespecial   #255 <Method void PdfChunk(String, PdfChunk)>
	//   82  168:invokevirtual   #201 <Method boolean ArrayList.add(Object)>
	//   83  171:pop             
						stringbuffer1 = new StringBuffer();
	//   84  172:new             #230 <Class StringBuffer>
	//   85  175:dup             
	//   86  176:invokespecial   #231 <Method void StringBuffer()>
	//   87  179:astore          8
					}
					arraylist.add(((Object) (pdfchunk2)));
	//   88  181:aload           11
	//   89  183:aload           10
	//   90  185:invokevirtual   #201 <Method boolean ArrayList.add(Object)>
	//   91  188:pop             
					stringbuffer = stringbuffer1;
	//   92  189:aload           8
	//   93  191:astore          7
				} else
	//*  94  193:goto            97
				if(pdfchunk2 == pdfchunk1)
	//*  95  196:aload           10
	//*  96  198:aload           9
	//*  97  200:if_acmpne       214
				{
					stringbuffer.append(c);
	//   98  203:aload           7
	//   99  205:iload           4
	//  100  207:invokevirtual   #258 <Method StringBuffer StringBuffer.append(char)>
	//  101  210:pop             
				} else
	//* 102  211:goto            97
				{
					StringBuffer stringbuffer2 = stringbuffer;
	//  103  214:aload           7
	//  104  216:astore          8
					if(stringbuffer.length() > 0)
	//* 105  218:aload           7
	//* 106  220:invokevirtual   #251 <Method int StringBuffer.length()>
	//* 107  223:ifle            255
					{
						arraylist.add(((Object) (new PdfChunk(stringbuffer.toString(), pdfchunk1))));
	//  108  226:aload           11
	//  109  228:new             #70  <Class PdfChunk>
	//  110  231:dup             
	//  111  232:aload           7
	//  112  234:invokevirtual   #252 <Method String StringBuffer.toString()>
	//  113  237:aload           9
	//  114  239:invokespecial   #255 <Method void PdfChunk(String, PdfChunk)>
	//  115  242:invokevirtual   #201 <Method boolean ArrayList.add(Object)>
	//  116  245:pop             
						stringbuffer2 = new StringBuffer();
	//  117  246:new             #230 <Class StringBuffer>
	//  118  249:dup             
	//  119  250:invokespecial   #231 <Method void StringBuffer()>
	//  120  253:astore          8
					}
					if(!pdfchunk2.isImage() && !pdfchunk2.isSeparator() && !pdfchunk2.isTab())
	//* 121  255:aload           10
	//* 122  257:invokevirtual   #241 <Method boolean PdfChunk.isImage()>
	//* 123  260:ifne            287
	//* 124  263:aload           10
	//* 125  265:invokevirtual   #244 <Method boolean PdfChunk.isSeparator()>
	//* 126  268:ifne            287
	//* 127  271:aload           10
	//* 128  273:invokevirtual   #247 <Method boolean PdfChunk.isTab()>
	//* 129  276:ifne            287
						stringbuffer2.append(c);
	//  130  279:aload           8
	//  131  281:iload           4
	//  132  283:invokevirtual   #258 <Method StringBuffer StringBuffer.append(char)>
	//  133  286:pop             
					pdfchunk1 = pdfchunk2;
	//  134  287:aload           10
	//  135  289:astore          9
					stringbuffer = stringbuffer2;
	//  136  291:aload           8
	//  137  293:astore          7
				}
			i++;
		}
	//* 138  295:goto            97
		if(stringbuffer.length() > 0)
	//* 139  298:aload           7
	//* 140  300:invokevirtual   #251 <Method int StringBuffer.length()>
	//* 141  303:ifle            326
			arraylist.add(((Object) (new PdfChunk(stringbuffer.toString(), pdfchunk1))));
	//  142  306:aload           11
	//  143  308:new             #70  <Class PdfChunk>
	//  144  311:dup             
	//  145  312:aload           7
	//  146  314:invokevirtual   #252 <Method String StringBuffer.toString()>
	//  147  317:aload           9
	//  148  319:invokespecial   #255 <Method void PdfChunk(String, PdfChunk)>
	//  149  322:invokevirtual   #201 <Method boolean ArrayList.add(Object)>
	//  150  325:pop             
		if(pdfchunk != null)
	//* 151  326:aload_3         
	//* 152  327:ifnull          337
			arraylist.add(((Object) (pdfchunk)));
	//  153  330:aload           11
	//  154  332:aload_3         
	//  155  333:invokevirtual   #201 <Method boolean ArrayList.add(Object)>
	//  156  336:pop             
		return arraylist;
	//  157  337:aload           11
	//  158  339:areturn         
	}

	public void doArabicShapping()
	{
		int i;
		int j;
		j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
_L6:
		int k = j;
	//    4    4:iload_2         
	//    5    5:istore_3        
		if(k >= totalTextLength) goto _L2; else goto _L1
	//    6    6:iload_3         
	//    7    7:aload_0         
	//    8    8:getfield        #74  <Field int totalTextLength>
	//    9   11:icmpge          35
_L1:
		j = ((int) (text[k]));
	//   10   14:aload_0         
	//   11   15:getfield        #68  <Field char[] text>
	//   12   18:iload_3         
	//   13   19:caload          
	//   14   20:istore_2        
		if(j < '\u0600' || j > '\u06FF') goto _L3; else goto _L2
	//   15   21:iload_2         
	//   16   22:sipush          1536
	//   17   25:icmplt          49
	//   18   28:iload_2         
	//   19   29:sipush          1791
	//   20   32:icmpgt          49
	//*  21   35:iload_3         
	//*  22   36:aload_0         
	//*  23   37:getfield        #74  <Field int totalTextLength>
	//*  24   40:icmplt          101
	//*  25   43:aload_0         
	//*  26   44:iload_1         
	//*  27   45:putfield        #74  <Field int totalTextLength>
	//*  28   48:return          
_L3:
		if(k != i)
	//*  29   49:iload_3         
	//*  30   50:iload_1         
	//*  31   51:icmpeq          90
		{
			text[i] = text[k];
	//   32   54:aload_0         
	//   33   55:getfield        #68  <Field char[] text>
	//   34   58:iload_1         
	//   35   59:aload_0         
	//   36   60:getfield        #68  <Field char[] text>
	//   37   63:iload_3         
	//   38   64:caload          
	//   39   65:castore         
			detailChunks[i] = detailChunks[k];
	//   40   66:aload_0         
	//   41   67:getfield        #72  <Field PdfChunk[] detailChunks>
	//   42   70:iload_1         
	//   43   71:aload_0         
	//   44   72:getfield        #72  <Field PdfChunk[] detailChunks>
	//   45   75:iload_3         
	//   46   76:aaload          
	//   47   77:aastore         
			orderLevels[i] = orderLevels[k];
	//   48   78:aload_0         
	//   49   79:getfield        #76  <Field byte[] orderLevels>
	//   50   82:iload_1         
	//   51   83:aload_0         
	//   52   84:getfield        #76  <Field byte[] orderLevels>
	//   53   87:iload_3         
	//   54   88:baload          
	//   55   89:bastore         
		}
		j = k + 1;
	//   56   90:iload_3         
	//   57   91:iconst_1        
	//   58   92:iadd            
	//   59   93:istore_2        
		i++;
	//   60   94:iload_1         
	//   61   95:iconst_1        
	//   62   96:iadd            
	//   63   97:istore_1        
		  goto _L4
_L2:
		if(k >= totalTextLength)
		{
			totalTextLength = i;
			return;
		}
	//*  64   98:goto            4
		j = k + 1;
	//   65  101:iload_3         
	//   66  102:iconst_1        
	//   67  103:iadd            
	//   68  104:istore_2        
_L7:
label0:
		{
			if(j < totalTextLength)
	//*  69  105:iload_2         
	//*  70  106:aload_0         
	//*  71  107:getfield        #74  <Field int totalTextLength>
	//*  72  110:icmpge          137
			{
				char c = text[j];
	//   73  113:aload_0         
	//   74  114:getfield        #68  <Field char[] text>
	//   75  117:iload_2         
	//   76  118:caload          
	//   77  119:istore          4
				if(c >= '\u0600' && c <= '\u06FF')
					break label0;
	//   78  121:iload           4
	//   79  123:sipush          1536
	//   80  126:icmplt          137
	//   81  129:iload           4
	//   82  131:sipush          1791
	//   83  134:icmple          221
			}
			int l = j - k;
	//   84  137:iload_2         
	//   85  138:iload_3         
	//   86  139:isub            
	//   87  140:istore          4
			int j1 = ArabicLigaturizer.arabic_shape(text, k, l, text, i, l, arabicOptions);
	//   88  142:aload_0         
	//   89  143:getfield        #68  <Field char[] text>
	//   90  146:iload_3         
	//   91  147:iload           4
	//   92  149:aload_0         
	//   93  150:getfield        #68  <Field char[] text>
	//   94  153:iload_1         
	//   95  154:iload           4
	//   96  156:aload_0         
	//   97  157:getfield        #130 <Field int arabicOptions>
	//   98  160:invokestatic    #266 <Method int ArabicLigaturizer.arabic_shape(char[], int, int, char[], int, int, int)>
	//   99  163:istore          5
			if(k != i)
	//* 100  165:iload_3         
	//* 101  166:iload_1         
	//* 102  167:icmpeq          231
			{
				int i1 = 0;
	//  103  170:iconst_0        
	//  104  171:istore          4
				while(i1 < j1) 
	//* 105  173:iload           4
	//* 106  175:iload           5
	//* 107  177:icmpge          228
				{
					detailChunks[i] = detailChunks[k];
	//  108  180:aload_0         
	//  109  181:getfield        #72  <Field PdfChunk[] detailChunks>
	//  110  184:iload_1         
	//  111  185:aload_0         
	//  112  186:getfield        #72  <Field PdfChunk[] detailChunks>
	//  113  189:iload_3         
	//  114  190:aaload          
	//  115  191:aastore         
					orderLevels[i] = orderLevels[k];
	//  116  192:aload_0         
	//  117  193:getfield        #76  <Field byte[] orderLevels>
	//  118  196:iload_1         
	//  119  197:aload_0         
	//  120  198:getfield        #76  <Field byte[] orderLevels>
	//  121  201:iload_3         
	//  122  202:baload          
	//  123  203:bastore         
					i1++;
	//  124  204:iload           4
	//  125  206:iconst_1        
	//  126  207:iadd            
	//  127  208:istore          4
					k++;
	//  128  210:iload_3         
	//  129  211:iconst_1        
	//  130  212:iadd            
	//  131  213:istore_3        
					i++;
	//  132  214:iload_1         
	//  133  215:iconst_1        
	//  134  216:iadd            
	//  135  217:istore_1        
				}
			} else
	//* 136  218:goto            173
	//* 137  221:iload_2         
	//* 138  222:iconst_1        
	//* 139  223:iadd            
	//* 140  224:istore_2        
	//* 141  225:goto            105
	//* 142  228:goto            4
			{
				i += j1;
	//  143  231:iload_1         
	//  144  232:iload           5
	//  145  234:iadd            
	//  146  235:istore_1        
			}
		}
_L4:
		if(true) goto _L6; else goto _L5
	//  147  236:goto            4
_L5:
		j++;
		  goto _L7
	}

	public void flip(int i, int j)
	{
		int k = (i + j) / 2;
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iadd            
	//    3    3:iconst_2        
	//    4    4:idiv            
	//    5    5:istore_3        
		for(j--; i < k; j--)
	//*   6    6:iload_2         
	//*   7    7:iconst_1        
	//*   8    8:isub            
	//*   9    9:istore_2        
	//*  10   10:iload_1         
	//*  11   11:iload_3         
	//*  12   12:icmpge          54
		{
			int l = indexChars[i];
	//   13   15:aload_0         
	//   14   16:getfield        #78  <Field int[] indexChars>
	//   15   19:iload_1         
	//   16   20:iaload          
	//   17   21:istore          4
			indexChars[i] = indexChars[j];
	//   18   23:aload_0         
	//   19   24:getfield        #78  <Field int[] indexChars>
	//   20   27:iload_1         
	//   21   28:aload_0         
	//   22   29:getfield        #78  <Field int[] indexChars>
	//   23   32:iload_2         
	//   24   33:iaload          
	//   25   34:iastore         
			indexChars[j] = l;
	//   26   35:aload_0         
	//   27   36:getfield        #78  <Field int[] indexChars>
	//   28   39:iload_2         
	//   29   40:iload           4
	//   30   42:iastore         
			i++;
	//   31   43:iload_1         
	//   32   44:iconst_1        
	//   33   45:iadd            
	//   34   46:istore_1        
		}

	//   35   47:iload_2         
	//   36   48:iconst_1        
	//   37   49:isub            
	//   38   50:istore_2        
	//*  39   51:goto            10
	//   40   54:return          
	}

	public boolean getParagraph(int i)
	{
		boolean flag;
		runDirection = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #110 <Field int runDirection>
		currentChar = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #89  <Field int currentChar>
		totalTextLength = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #74  <Field int totalTextLength>
		flag = false;
	//    9   15:iconst_0        
	//   10   16:istore          6
_L10:
		boolean flag1 = flag;
	//   11   18:iload           6
	//   12   20:istore          7
		if(indexChunk >= chunks.size()) goto _L2; else goto _L1
	//   13   22:aload_0         
	//   14   23:getfield        #85  <Field int indexChunk>
	//   15   26:aload_0         
	//   16   27:getfield        #83  <Field ArrayList chunks>
	//   17   30:invokevirtual   #270 <Method int ArrayList.size()>
	//   18   33:icmpge          231
_L1:
		int j;
		PdfChunk pdfchunk;
		BaseFont basefont;
		String s;
		pdfchunk = (PdfChunk)chunks.get(indexChunk);
	//   19   36:aload_0         
	//   20   37:getfield        #83  <Field ArrayList chunks>
	//   21   40:aload_0         
	//   22   41:getfield        #85  <Field int indexChunk>
	//   23   44:invokevirtual   #274 <Method Object ArrayList.get(int)>
	//   24   47:checkcast       #70  <Class PdfChunk>
	//   25   50:astore          8
		basefont = pdfchunk.font().getFont();
	//   26   52:aload           8
	//   27   54:invokevirtual   #278 <Method PdfFont PdfChunk.font()>
	//   28   57:invokevirtual   #284 <Method BaseFont PdfFont.getFont()>
	//   29   60:astore          9
		s = pdfchunk.toString();
	//   30   62:aload           8
	//   31   64:invokevirtual   #175 <Method String PdfChunk.toString()>
	//   32   67:astore          10
		j = s.length();
	//   33   69:aload           10
	//   34   71:invokevirtual   #287 <Method int String.length()>
	//   35   74:istore          4
_L8:
		flag1 = flag;
	//   36   76:iload           6
	//   37   78:istore          7
		if(indexChunkChar >= j) goto _L4; else goto _L3
	//   38   80:aload_0         
	//   39   81:getfield        #87  <Field int indexChunkChar>
	//   40   84:iload           4
	//   41   86:icmpge          226
_L3:
		char c;
		char c1;
		c = s.charAt(indexChunkChar);
	//   42   89:aload           10
	//   43   91:aload_0         
	//   44   92:getfield        #87  <Field int indexChunkChar>
	//   45   95:invokevirtual   #291 <Method char String.charAt(int)>
	//   46   98:istore_3        
		c1 = (char)basefont.getUnicodeEquivalent(((int) (c)));
	//   47   99:aload           9
	//   48  101:iload_3         
	//   49  102:invokevirtual   #294 <Method int BaseFont.getUnicodeEquivalent(int)>
	//   50  105:int2char        
	//   51  106:istore          5
		if(c1 != '\r' && c1 != '\n') goto _L6; else goto _L5
	//   52  108:iload           5
	//   53  110:bipush          13
	//   54  112:icmpeq          122
	//   55  115:iload           5
	//   56  117:bipush          10
	//   57  119:icmpne          241
_L5:
		if(c1 == '\r' && indexChunkChar + 1 < j && s.charAt(indexChunkChar + 1) == '\n')
	//*  58  122:iload           5
	//*  59  124:bipush          13
	//*  60  126:icmpne          166
	//*  61  129:aload_0         
	//*  62  130:getfield        #87  <Field int indexChunkChar>
	//*  63  133:iconst_1        
	//*  64  134:iadd            
	//*  65  135:iload           4
	//*  66  137:icmpge          166
	//*  67  140:aload           10
	//*  68  142:aload_0         
	//*  69  143:getfield        #87  <Field int indexChunkChar>
	//*  70  146:iconst_1        
	//*  71  147:iadd            
	//*  72  148:invokevirtual   #291 <Method char String.charAt(int)>
	//*  73  151:bipush          10
	//*  74  153:icmpne          166
			indexChunkChar = indexChunkChar + 1;
	//   75  156:aload_0         
	//   76  157:aload_0         
	//   77  158:getfield        #87  <Field int indexChunkChar>
	//   78  161:iconst_1        
	//   79  162:iadd            
	//   80  163:putfield        #87  <Field int indexChunkChar>
		indexChunkChar = indexChunkChar + 1;
	//   81  166:aload_0         
	//   82  167:aload_0         
	//   83  168:getfield        #87  <Field int indexChunkChar>
	//   84  171:iconst_1        
	//   85  172:iadd            
	//   86  173:putfield        #87  <Field int indexChunkChar>
		if(indexChunkChar >= j)
	//*  87  176:aload_0         
	//*  88  177:getfield        #87  <Field int indexChunkChar>
	//*  89  180:iload           4
	//*  90  182:icmplt          200
		{
			indexChunkChar = 0;
	//   91  185:aload_0         
	//   92  186:iconst_0        
	//   93  187:putfield        #87  <Field int indexChunkChar>
			indexChunk = indexChunk + 1;
	//   94  190:aload_0         
	//   95  191:aload_0         
	//   96  192:getfield        #85  <Field int indexChunk>
	//   97  195:iconst_1        
	//   98  196:iadd            
	//   99  197:putfield        #85  <Field int indexChunk>
		}
		flag = true;
	//  100  200:iconst_1        
	//  101  201:istore          6
		flag1 = flag;
	//  102  203:iload           6
	//  103  205:istore          7
		if(totalTextLength == 0)
	//* 104  207:aload_0         
	//* 105  208:getfield        #74  <Field int totalTextLength>
	//* 106  211:ifne            226
		{
			detailChunks[0] = pdfchunk;
	//  107  214:aload_0         
	//  108  215:getfield        #72  <Field PdfChunk[] detailChunks>
	//  109  218:iconst_0        
	//  110  219:aload           8
	//  111  221:aastore         
			flag1 = flag;
	//  112  222:iload           6
	//  113  224:istore          7
		}
_L4:
		if(!flag1)
			break; /* Loop/switch isn't completed */
	//  114  226:iload           7
	//  115  228:ifeq            261
_L2:
		if(totalTextLength == 0)
	//* 116  231:aload_0         
	//* 117  232:getfield        #74  <Field int totalTextLength>
	//* 118  235:ifne            283
			return flag1;
	//  119  238:iload           7
	//  120  240:ireturn         
		break; /* Loop/switch isn't completed */
_L6:
		addPiece(c, pdfchunk);
	//  121  241:aload_0         
	//  122  242:iload_3         
	//  123  243:aload           8
	//  124  245:invokevirtual   #296 <Method void addPiece(char, PdfChunk)>
		indexChunkChar = indexChunkChar + 1;
	//  125  248:aload_0         
	//  126  249:aload_0         
	//  127  250:getfield        #87  <Field int indexChunkChar>
	//  128  253:iconst_1        
	//  129  254:iadd            
	//  130  255:putfield        #87  <Field int indexChunkChar>
		if(true) goto _L8; else goto _L7
	//  131  258:goto            76
_L7:
		indexChunkChar = 0;
	//  132  261:aload_0         
	//  133  262:iconst_0        
	//  134  263:putfield        #87  <Field int indexChunkChar>
		indexChunk = indexChunk + 1;
	//  135  266:aload_0         
	//  136  267:aload_0         
	//  137  268:getfield        #85  <Field int indexChunk>
	//  138  271:iconst_1        
	//  139  272:iadd            
	//  140  273:putfield        #85  <Field int indexChunk>
		flag = flag1;
	//  141  276:iload           7
	//  142  278:istore          6
		if(true) goto _L10; else goto _L9
	//  143  280:goto            18
_L9:
		totalTextLength = trimRight(0, totalTextLength - 1) + 1;
	//  144  283:aload_0         
	//  145  284:aload_0         
	//  146  285:iconst_0        
	//  147  286:aload_0         
	//  148  287:getfield        #74  <Field int totalTextLength>
	//  149  290:iconst_1        
	//  150  291:isub            
	//  151  292:invokevirtual   #299 <Method int trimRight(int, int)>
	//  152  295:iconst_1        
	//  153  296:iadd            
	//  154  297:putfield        #74  <Field int totalTextLength>
		if(totalTextLength == 0)
	//* 155  300:aload_0         
	//* 156  301:getfield        #74  <Field int totalTextLength>
	//* 157  304:ifne            309
			return true;
	//  158  307:iconst_1        
	//  159  308:ireturn         
		if(i == 1)
			break MISSING_BLOCK_LABEL_460;
	//  160  309:iload_1         
	//  161  310:iconst_1        
	//  162  311:icmpeq          460
		if(orderLevels.length < totalTextLength)
	//* 163  314:aload_0         
	//* 164  315:getfield        #76  <Field byte[] orderLevels>
	//* 165  318:arraylength     
	//* 166  319:aload_0         
	//* 167  320:getfield        #74  <Field int totalTextLength>
	//* 168  323:icmpge          346
		{
			orderLevels = new byte[pieceSize];
	//  169  326:aload_0         
	//  170  327:aload_0         
	//  171  328:getfield        #66  <Field int pieceSize>
	//  172  331:newarray        byte[]
	//  173  333:putfield        #76  <Field byte[] orderLevels>
			indexChars = new int[pieceSize];
	//  174  336:aload_0         
	//  175  337:aload_0         
	//  176  338:getfield        #66  <Field int pieceSize>
	//  177  341:newarray        int[]
	//  178  343:putfield        #78  <Field int[] indexChars>
		}
		ArabicLigaturizer.processNumbers(text, 0, totalTextLength, arabicOptions);
	//  179  346:aload_0         
	//  180  347:getfield        #68  <Field char[] text>
	//  181  350:iconst_0        
	//  182  351:aload_0         
	//  183  352:getfield        #74  <Field int totalTextLength>
	//  184  355:aload_0         
	//  185  356:getfield        #130 <Field int arabicOptions>
	//  186  359:invokestatic    #303 <Method void ArabicLigaturizer.processNumbers(char[], int, int, int)>
		i;
	//  187  362:iload_1         
		JVM INSTR tableswitch 2 3: default 384
	//	               2 442
	//	               3 447;
	//  188  363:tableswitch     2 3: default 384
	//	               2 442
	//	               3 447
		   goto _L11 _L12 _L13
_L11:
		byte byte0 = -1;
	//  189  384:iconst_m1       
	//  190  385:istore_2        
_L15:
		byte abyte0[] = (new BidiOrder(text, 0, totalTextLength, byte0)).getLevels();
	//  191  386:new             #305 <Class BidiOrder>
	//  192  389:dup             
	//  193  390:aload_0         
	//  194  391:getfield        #68  <Field char[] text>
	//  195  394:iconst_0        
	//  196  395:aload_0         
	//  197  396:getfield        #74  <Field int totalTextLength>
	//  198  399:iload_2         
	//  199  400:invokespecial   #308 <Method void BidiOrder(char[], int, int, byte)>
	//  200  403:invokevirtual   #312 <Method byte[] BidiOrder.getLevels()>
	//  201  406:astore          8
		for(i = 0; i < totalTextLength; i++)
	//* 202  408:iconst_0        
	//* 203  409:istore_1        
	//* 204  410:iload_1         
	//* 205  411:aload_0         
	//* 206  412:getfield        #74  <Field int totalTextLength>
	//* 207  415:icmpge          452
		{
			orderLevels[i] = abyte0[i];
	//  208  418:aload_0         
	//  209  419:getfield        #76  <Field byte[] orderLevels>
	//  210  422:iload_1         
	//  211  423:aload           8
	//  212  425:iload_1         
	//  213  426:baload          
	//  214  427:bastore         
			indexChars[i] = i;
	//  215  428:aload_0         
	//  216  429:getfield        #78  <Field int[] indexChars>
	//  217  432:iload_1         
	//  218  433:iload_1         
	//  219  434:iastore         
		}

	//  220  435:iload_1         
	//  221  436:iconst_1        
	//  222  437:iadd            
	//  223  438:istore_1        
		break; /* Loop/switch isn't completed */
	//  224  439:goto            410
_L12:
		byte0 = 0;
	//  225  442:iconst_0        
	//  226  443:istore_2        
		continue; /* Loop/switch isn't completed */
	//  227  444:goto            386
_L13:
		byte0 = 1;
	//  228  447:iconst_1        
	//  229  448:istore_2        
		if(true) goto _L15; else goto _L14
	//  230  449:goto            386
_L14:
		doArabicShapping();
	//  231  452:aload_0         
	//  232  453:invokevirtual   #314 <Method void doArabicShapping()>
		mirrorGlyphs();
	//  233  456:aload_0         
	//  234  457:invokevirtual   #317 <Method void mirrorGlyphs()>
		totalTextLength = trimRightEx(0, totalTextLength - 1) + 1;
	//  235  460:aload_0         
	//  236  461:aload_0         
	//  237  462:iconst_0        
	//  238  463:aload_0         
	//  239  464:getfield        #74  <Field int totalTextLength>
	//  240  467:iconst_1        
	//  241  468:isub            
	//  242  469:invokevirtual   #320 <Method int trimRightEx(int, int)>
	//  243  472:iconst_1        
	//  244  473:iadd            
	//  245  474:putfield        #74  <Field int totalTextLength>
		return true;
	//  246  477:iconst_1        
	//  247  478:ireturn         
	}

	public float getWidth(int i, int j)
	{
		return getWidth(i, j, 0.0F);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:fconst_0        
	//    4    4:invokevirtual   #325 <Method float getWidth(int, int, float)>
	//    5    7:freturn         
	}

	public float getWidth(int i, int j, float f)
	{
		float f1 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore          4
		TabStop tabstop1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          14
		float f6 = (0.0F / 0.0F);
	//    4    6:ldc2            #326 <Float (0.0F / 0.0F)>
	//    5    9:fstore          7
		float f8 = (0.0F / 0.0F);
	//    6   11:ldc2            #326 <Float (0.0F / 0.0F)>
	//    7   14:fstore          9
		while(i <= j) 
	//*   8   16:iload_1         
	//*   9   17:iload_2         
	//*  10   18:icmpgt          393
		{
			boolean flag = Utilities.isSurrogatePair(text, i);
	//   11   21:aload_0         
	//   12   22:getfield        #68  <Field char[] text>
	//   13   25:iload_1         
	//   14   26:invokestatic    #332 <Method boolean Utilities.isSurrogatePair(char[], int)>
	//   15   29:istore          12
			float f2;
			float f5;
			float f7;
			int k;
			TabStop tabstop;
			if(detailChunks[i].isTab() && detailChunks[i].isAttribute("TABSETTINGS"))
	//*  16   31:aload_0         
	//*  17   32:getfield        #72  <Field PdfChunk[] detailChunks>
	//*  18   35:iload_1         
	//*  19   36:aaload          
	//*  20   37:invokevirtual   #247 <Method boolean PdfChunk.isTab()>
	//*  21   40:ifeq            208
	//*  22   43:aload_0         
	//*  23   44:getfield        #72  <Field PdfChunk[] detailChunks>
	//*  24   47:iload_1         
	//*  25   48:aaload          
	//*  26   49:ldc2            #334 <String "TABSETTINGS">
	//*  27   52:invokevirtual   #338 <Method boolean PdfChunk.isAttribute(String)>
	//*  28   55:ifeq            208
			{
				f2 = f1;
	//   29   58:fload           4
	//   30   60:fstore          5
				if(tabstop1 != null)
	//*  31   62:aload           14
	//*  32   64:ifnull          97
				{
					float f4 = tabstop1.getPosition(f8, f1, f6);
	//   33   67:aload           14
	//   34   69:fload           9
	//   35   71:fload           4
	//   36   73:fload           7
	//   37   75:invokevirtual   #188 <Method float TabStop.getPosition(float, float, float)>
	//   38   78:fstore          6
					f2 = f4 + (f1 - f8);
	//   39   80:fload           6
	//   40   82:fload           4
	//   41   84:fload           9
	//   42   86:fsub            
	//   43   87:fadd            
	//   44   88:fstore          5
					tabstop1.setPosition(f4);
	//   45   90:aload           14
	//   46   92:fload           6
	//   47   94:invokevirtual   #192 <Method void TabStop.setPosition(float)>
				}
				tabstop = detailChunks[i].getTabStop();
	//   48   97:aload_0         
	//   49   98:getfield        #72  <Field PdfChunk[] detailChunks>
	//   50  101:iload_1         
	//   51  102:aaload          
	//   52  103:invokevirtual   #342 <Method TabStop PdfChunk.getTabStop()>
	//   53  106:astore          13
				if(tabstop == null)
	//*  54  108:aload           13
	//*  55  110:ifnonnull       162
				{
					tabstop = PdfChunk.getTabStop(detailChunks[i], f2);
	//   56  113:aload_0         
	//   57  114:getfield        #72  <Field PdfChunk[] detailChunks>
	//   58  117:iload_1         
	//   59  118:aaload          
	//   60  119:fload           5
	//   61  121:invokestatic    #345 <Method TabStop PdfChunk.getTabStop(PdfChunk, float)>
	//   62  124:astore          13
					f7 = f2;
	//   63  126:fload           5
	//   64  128:fstore          8
					f5 = (0.0F / 0.0F);
	//   65  130:ldc2            #326 <Float (0.0F / 0.0F)>
	//   66  133:fstore          6
					k = i;
	//   67  135:iload_1         
	//   68  136:istore          10
				} else
	//*  69  138:iload           10
	//*  70  140:iconst_1        
	//*  71  141:iadd            
	//*  72  142:istore_1        
	//*  73  143:fload           8
	//*  74  145:fstore          9
	//*  75  147:aload           13
	//*  76  149:astore          14
	//*  77  151:fload           6
	//*  78  153:fstore          7
	//*  79  155:fload           5
	//*  80  157:fstore          4
	//*  81  159:goto            16
				{
					if(runDirection == 3)
	//*  82  162:aload_0         
	//*  83  163:getfield        #110 <Field int runDirection>
	//*  84  166:iconst_3        
	//*  85  167:icmpne          198
						f2 = f - tabstop.getPosition();
	//   86  170:fload_3         
	//   87  171:aload           13
	//   88  173:invokevirtual   #348 <Method float TabStop.getPosition()>
	//   89  176:fsub            
	//   90  177:fstore          5
					else
	//*  91  179:aconst_null     
	//*  92  180:astore          13
	//*  93  182:ldc2            #326 <Float (0.0F / 0.0F)>
	//*  94  185:fstore          8
	//*  95  187:ldc2            #326 <Float (0.0F / 0.0F)>
	//*  96  190:fstore          6
	//*  97  192:iload_1         
	//*  98  193:istore          10
	//*  99  195:goto            138
						f2 = tabstop.getPosition();
	//  100  198:aload           13
	//  101  200:invokevirtual   #348 <Method float TabStop.getPosition()>
	//  102  203:fstore          5
					tabstop = null;
					f7 = (0.0F / 0.0F);
					f5 = (0.0F / 0.0F);
					k = i;
				}
			} else
	//* 103  205:goto            179
			if(flag)
	//* 104  208:iload           12
	//* 105  210:ifeq            255
			{
				f2 = f1 + detailChunks[i].getCharWidth(Utilities.convertToUtf32(text, i));
	//  106  213:fload           4
	//  107  215:aload_0         
	//  108  216:getfield        #72  <Field PdfChunk[] detailChunks>
	//  109  219:iload_1         
	//  110  220:aaload          
	//  111  221:aload_0         
	//  112  222:getfield        #68  <Field char[] text>
	//  113  225:iload_1         
	//  114  226:invokestatic    #352 <Method int Utilities.convertToUtf32(char[], int)>
	//  115  229:invokevirtual   #356 <Method float PdfChunk.getCharWidth(int)>
	//  116  232:fadd            
	//  117  233:fstore          5
				k = i + 1;
	//  118  235:iload_1         
	//  119  236:iconst_1        
	//  120  237:iadd            
	//  121  238:istore          10
				f7 = f8;
	//  122  240:fload           9
	//  123  242:fstore          8
				tabstop = tabstop1;
	//  124  244:aload           14
	//  125  246:astore          13
				f5 = f6;
	//  126  248:fload           7
	//  127  250:fstore          6
			} else
	//* 128  252:goto            138
			{
				char c = text[i];
	//  129  255:aload_0         
	//  130  256:getfield        #68  <Field char[] text>
	//  131  259:iload_1         
	//  132  260:caload          
	//  133  261:istore          11
				PdfChunk pdfchunk = detailChunks[i];
	//  134  263:aload_0         
	//  135  264:getfield        #72  <Field PdfChunk[] detailChunks>
	//  136  267:iload_1         
	//  137  268:aaload          
	//  138  269:astore          15
				f7 = f8;
	//  139  271:fload           9
	//  140  273:fstore          8
				tabstop = tabstop1;
	//  141  275:aload           14
	//  142  277:astore          13
				f5 = f6;
	//  143  279:fload           7
	//  144  281:fstore          6
				f2 = f1;
	//  145  283:fload           4
	//  146  285:fstore          5
				k = i;
	//  147  287:iload_1         
	//  148  288:istore          10
				if(!PdfChunk.noPrint(pdfchunk.getUnicodeEquivalent(((int) (c)))))
	//* 149  290:aload           15
	//* 150  292:iload           11
	//* 151  294:invokevirtual   #235 <Method int PdfChunk.getUnicodeEquivalent(int)>
	//* 152  297:invokestatic    #238 <Method boolean PdfChunk.noPrint(int)>
	//* 153  300:ifne            138
				{
					f5 = f6;
	//  154  303:fload           7
	//  155  305:fstore          6
					if(tabstop1 != null)
	//* 156  307:aload           14
	//* 157  309:ifnull          363
					{
						f5 = f6;
	//  158  312:fload           7
	//  159  314:fstore          6
						if(tabstop1.getAlignment() != com.itextpdf.text.TabStop.Alignment.ANCHOR)
	//* 160  316:aload           14
	//* 161  318:invokevirtual   #360 <Method com.itextpdf.text.TabStop$Alignment TabStop.getAlignment()>
	//* 162  321:getstatic       #366 <Field com.itextpdf.text.TabStop$Alignment com.itextpdf.text.TabStop$Alignment.ANCHOR>
	//* 163  324:if_acmpeq       363
						{
							f5 = f6;
	//  164  327:fload           7
	//  165  329:fstore          6
							if(Float.isNaN(f6))
	//* 166  331:fload           7
	//* 167  333:invokestatic    #372 <Method boolean Float.isNaN(float)>
	//* 168  336:ifeq            363
							{
								f5 = f6;
	//  169  339:fload           7
	//  170  341:fstore          6
								if(tabstop1.getAnchorChar() == (char)pdfchunk.getUnicodeEquivalent(((int) (c))))
	//* 171  343:aload           14
	//* 172  345:invokevirtual   #376 <Method char TabStop.getAnchorChar()>
	//* 173  348:aload           15
	//* 174  350:iload           11
	//* 175  352:invokevirtual   #235 <Method int PdfChunk.getUnicodeEquivalent(int)>
	//* 176  355:int2char        
	//* 177  356:icmpne          363
									f5 = f1;
	//  178  359:fload           4
	//  179  361:fstore          6
							}
						}
					}
					f2 = f1 + detailChunks[i].getCharWidth(((int) (c)));
	//  180  363:fload           4
	//  181  365:aload_0         
	//  182  366:getfield        #72  <Field PdfChunk[] detailChunks>
	//  183  369:iload_1         
	//  184  370:aaload          
	//  185  371:iload           11
	//  186  373:invokevirtual   #356 <Method float PdfChunk.getCharWidth(int)>
	//  187  376:fadd            
	//  188  377:fstore          5
					f7 = f8;
	//  189  379:fload           9
	//  190  381:fstore          8
					tabstop = tabstop1;
	//  191  383:aload           14
	//  192  385:astore          13
					k = i;
	//  193  387:iload_1         
	//  194  388:istore          10
				}
			}
			i = k + 1;
			f8 = f7;
			tabstop1 = tabstop;
			f6 = f5;
			f1 = f2;
		}
	//* 195  390:goto            138
		f = f1;
	//  196  393:fload           4
	//  197  395:fstore_3        
		if(tabstop1 != null)
	//* 198  396:aload           14
	//* 199  398:ifnull          430
		{
			float f3 = tabstop1.getPosition(f8, f1, f6);
	//  200  401:aload           14
	//  201  403:fload           9
	//  202  405:fload           4
	//  203  407:fload           7
	//  204  409:invokevirtual   #188 <Method float TabStop.getPosition(float, float, float)>
	//  205  412:fstore          5
			f = f3 + (f1 - f8);
	//  206  414:fload           5
	//  207  416:fload           4
	//  208  418:fload           9
	//  209  420:fsub            
	//  210  421:fadd            
	//  211  422:fstore_3        
			tabstop1.setPosition(f3);
	//  212  423:aload           14
	//  213  425:fload           5
	//  214  427:invokevirtual   #192 <Method void TabStop.setPosition(float)>
		}
		return f;
	//  215  430:fload_3         
	//  216  431:freturn         
	}

	public int[] getWord(int i, int j)
	{
		int l = j;
	//    0    0:iload_2         
	//    1    1:istore          4
		int k = j;
	//    2    3:iload_2         
	//    3    4:istore_3        
		do
		{
			if(l >= totalTextLength || !Character.isLetter(text[l]) && !Character.isDigit(text[l]) && text[l] != '\255')
	//*   4    5:iload           4
	//*   5    7:aload_0         
	//*   6    8:getfield        #74  <Field int totalTextLength>
	//*   7   11:icmpge          53
	//*   8   14:aload_0         
	//*   9   15:getfield        #68  <Field char[] text>
	//*  10   18:iload           4
	//*  11   20:caload          
	//*  12   21:invokestatic    #383 <Method boolean Character.isLetter(char)>
	//*  13   24:ifne            61
	//*  14   27:aload_0         
	//*  15   28:getfield        #68  <Field char[] text>
	//*  16   31:iload           4
	//*  17   33:caload          
	//*  18   34:invokestatic    #386 <Method boolean Character.isDigit(char)>
	//*  19   37:ifne            61
	//*  20   40:aload_0         
	//*  21   41:getfield        #68  <Field char[] text>
	//*  22   44:iload           4
	//*  23   46:caload          
	//*  24   47:sipush          173
	//*  25   50:icmpeq          61
			{
				if(l == j)
	//*  26   53:iload           4
	//*  27   55:iload_2         
	//*  28   56:icmpne          74
					return null;
	//   29   59:aconst_null     
	//   30   60:areturn         
				break;
			}
			l++;
	//   31   61:iload           4
	//   32   63:iconst_1        
	//   33   64:iadd            
	//   34   65:istore          4
		} while(true);
	//   35   67:goto            5
		while(k >= i && (Character.isLetter(text[k]) || Character.isDigit(text[k]) || text[k] == '\255')) 
			k--;
	//   36   70:iload_3         
	//   37   71:iconst_1        
	//   38   72:isub            
	//   39   73:istore_3        
	//   40   74:iload_3         
	//   41   75:iload_1         
	//   42   76:icmplt          115
	//   43   79:aload_0         
	//   44   80:getfield        #68  <Field char[] text>
	//   45   83:iload_3         
	//   46   84:caload          
	//   47   85:invokestatic    #383 <Method boolean Character.isLetter(char)>
	//   48   88:ifne            70
	//   49   91:aload_0         
	//   50   92:getfield        #68  <Field char[] text>
	//   51   95:iload_3         
	//   52   96:caload          
	//   53   97:invokestatic    #386 <Method boolean Character.isDigit(char)>
	//   54  100:ifne            70
	//   55  103:aload_0         
	//   56  104:getfield        #68  <Field char[] text>
	//   57  107:iload_3         
	//   58  108:caload          
	//   59  109:sipush          173
	//   60  112:icmpeq          70
		return (new int[] {
			k + 1, l
		});
	//   61  115:iconst_2        
	//   62  116:newarray        int[]
	//   63  118:dup             
	//   64  119:iconst_0        
	//   65  120:iload_3         
	//   66  121:iconst_1        
	//   67  122:iadd            
	//   68  123:iastore         
	//   69  124:dup             
	//   70  125:iconst_1        
	//   71  126:iload           4
	//   72  128:iastore         
	//   73  129:areturn         
	}

	public boolean isEmpty()
	{
		return currentChar >= totalTextLength && indexChunk >= chunks.size();
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int currentChar>
	//    2    4:aload_0         
	//    3    5:getfield        #74  <Field int totalTextLength>
	//    4    8:icmplt          27
	//    5   11:aload_0         
	//    6   12:getfield        #85  <Field int indexChunk>
	//    7   15:aload_0         
	//    8   16:getfield        #83  <Field ArrayList chunks>
	//    9   19:invokevirtual   #270 <Method int ArrayList.size()>
	//   10   22:icmplt          27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public boolean isWordSplit()
	{
		return isWordSplit;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field boolean isWordSplit>
	//    2    4:ireturn         
	}

	public void mirrorGlyphs()
	{
		for(int i = 0; i < totalTextLength; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #74  <Field int totalTextLength>
	//*   5    7:icmpge          54
		{
			if((orderLevels[i] & 1) != 1)
				continue;
	//    6   10:aload_0         
	//    7   11:getfield        #76  <Field byte[] orderLevels>
	//    8   14:iload_1         
	//    9   15:baload          
	//   10   16:iconst_1        
	//   11   17:iand            
	//   12   18:iconst_1        
	//   13   19:icmpne          47
			int j = mirrorChars.get(((int) (text[i])));
	//   14   22:getstatic       #46  <Field IntHashtable mirrorChars>
	//   15   25:aload_0         
	//   16   26:getfield        #68  <Field char[] text>
	//   17   29:iload_1         
	//   18   30:caload          
	//   19   31:invokevirtual   #389 <Method int IntHashtable.get(int)>
	//   20   34:istore_2        
			if(j != 0)
	//*  21   35:iload_2         
	//*  22   36:ifeq            47
				text[i] = (char)j;
	//   23   39:aload_0         
	//   24   40:getfield        #68  <Field char[] text>
	//   25   43:iload_1         
	//   26   44:iload_2         
	//   27   45:int2char        
	//   28   46:castore         
		}

	//   29   47:iload_1         
	//   30   48:iconst_1        
	//   31   49:iadd            
	//   32   50:istore_1        
	//*  33   51:goto            2
	//   34   54:return          
	}

	public PdfLine processLine(float f, float f1, int i, int j, int k, float f2, float f3, 
			float f4)
	{
		float f6;
		float f8;
		float f10;
		int j1;
		boolean flag;
		boolean flag1;
		Object obj;
		Object obj1;
		ArrayList arraylist1;
		isWordSplit = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #107 <Field boolean isWordSplit>
		arabicOptions = k;
	//    3    5:aload_0         
	//    4    6:iload           5
	//    5    8:putfield        #130 <Field int arabicOptions>
		save();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #394 <Method void save()>
		if(j == 3)
	//*   8   15:iload           4
	//*   9   17:iconst_3        
	//*  10   18:icmpne          46
			flag1 = true;
	//   11   21:iconst_1        
	//   12   22:istore          20
		else
	//*  13   24:aload_0         
	//*  14   25:getfield        #89  <Field int currentChar>
	//*  15   28:aload_0         
	//*  16   29:getfield        #74  <Field int totalTextLength>
	//*  17   32:icmplt          107
	//*  18   35:aload_0         
	//*  19   36:iload           4
	//*  20   38:invokevirtual   #151 <Method boolean getParagraph(int)>
	//*  21   41:ifne            52
	//*  22   44:aconst_null     
	//*  23   45:areturn         
			flag1 = false;
	//   24   46:iconst_0        
	//   25   47:istore          20
		if(currentChar >= totalTextLength)
		{
			if(!getParagraph(j))
				return null;
	//*  26   49:goto            24
			if(totalTextLength == 0)
	//*  27   52:aload_0         
	//*  28   53:getfield        #74  <Field int totalTextLength>
	//*  29   56:ifne            107
			{
				ArrayList arraylist = new ArrayList();
	//   30   59:new             #80  <Class ArrayList>
	//   31   62:dup             
	//   32   63:invokespecial   #81  <Method void ArrayList()>
	//   33   66:astore          23
				arraylist.add(((Object) (new PdfChunk("", detailChunks[0]))));
	//   34   68:aload           23
	//   35   70:new             #70  <Class PdfChunk>
	//   36   73:dup             
	//   37   74:ldc2            #396 <String "">
	//   38   77:aload_0         
	//   39   78:getfield        #72  <Field PdfChunk[] detailChunks>
	//   40   81:iconst_0        
	//   41   82:aaload          
	//   42   83:invokespecial   #255 <Method void PdfChunk(String, PdfChunk)>
	//   43   86:invokevirtual   #201 <Method boolean ArrayList.add(Object)>
	//   44   89:pop             
				return new PdfLine(0.0F, 0.0F, f1, i, true, arraylist, flag1);
	//   45   90:new             #398 <Class PdfLine>
	//   46   93:dup             
	//   47   94:fconst_0        
	//   48   95:fconst_0        
	//   49   96:fload_2         
	//   50   97:iload_3         
	//   51   98:iconst_1        
	//   52   99:aload           23
	//   53  101:iload           20
	//   54  103:invokespecial   #401 <Method void PdfLine(float, float, float, int, boolean, ArrayList, boolean)>
	//   55  106:areturn         
			}
		}
		j = -1;
	//   56  107:iconst_m1       
	//   57  108:istore          4
		if(currentChar != 0)
	//*  58  110:aload_0         
	//*  59  111:getfield        #89  <Field int currentChar>
	//*  60  114:ifeq            135
			currentChar = trimLeftEx(currentChar, totalTextLength - 1);
	//   61  117:aload_0         
	//   62  118:aload_0         
	//   63  119:aload_0         
	//   64  120:getfield        #89  <Field int currentChar>
	//   65  123:aload_0         
	//   66  124:getfield        #74  <Field int totalTextLength>
	//   67  127:iconst_1        
	//   68  128:isub            
	//   69  129:invokevirtual   #404 <Method int trimLeftEx(int, int)>
	//   70  132:putfield        #89  <Field int currentChar>
		j1 = currentChar;
	//   71  135:aload_0         
	//   72  136:getfield        #89  <Field int currentChar>
	//   73  139:istore          18
		obj1 = null;
	//   74  141:aconst_null     
	//   75  142:astore          24
		obj = null;
	//   76  144:aconst_null     
	//   77  145:astore          23
		arraylist1 = new ArrayList();
	//   78  147:new             #80  <Class ArrayList>
	//   79  150:dup             
	//   80  151:invokespecial   #81  <Method void ArrayList()>
	//   81  154:astore          27
		f8 = (0.0F / 0.0F);
	//   82  156:ldc2            #326 <Float (0.0F / 0.0F)>
	//   83  159:fstore          12
		f10 = (0.0F / 0.0F);
	//   84  161:ldc2            #326 <Float (0.0F / 0.0F)>
	//   85  164:fstore          14
		flag = false;
	//   86  166:iconst_0        
	//   87  167:istore          19
		f6 = f1;
	//   88  169:fload_2         
	//   89  170:fstore          10
_L5:
		float f5;
		int l;
		boolean flag2;
		Object obj2;
		obj2 = obj;
	//   90  172:aload           23
	//   91  174:astore          25
		l = j;
	//   92  176:iload           4
	//   93  178:istore          16
		flag2 = flag;
	//   94  180:iload           19
	//   95  182:istore          21
		f5 = f6;
	//   96  184:fload           10
	//   97  186:fstore          9
		if(currentChar >= totalTextLength) goto _L2; else goto _L1
	//   98  188:aload_0         
	//   99  189:getfield        #89  <Field int currentChar>
	//  100  192:aload_0         
	//  101  193:getfield        #74  <Field int totalTextLength>
	//  102  196:icmpge          559
_L1:
		int i1;
		PdfChunk pdfchunk;
		pdfchunk = detailChunks[currentChar];
	//  103  199:aload_0         
	//  104  200:getfield        #72  <Field PdfChunk[] detailChunks>
	//  105  203:aload_0         
	//  106  204:getfield        #89  <Field int currentChar>
	//  107  207:aaload          
	//  108  208:astore          26
		if(pdfchunk.isImage() && f2 < f3)
	//* 109  210:aload           26
	//* 110  212:invokevirtual   #241 <Method boolean PdfChunk.isImage()>
	//* 111  215:ifeq            305
	//* 112  218:fload           6
	//* 113  220:fload           7
	//* 114  222:fcmpg           
	//* 115  223:ifge            305
		{
			obj2 = ((Object) (pdfchunk.getImage()));
	//  116  226:aload           26
	//  117  228:invokevirtual   #408 <Method Image PdfChunk.getImage()>
	//  118  231:astore          25
			if(((Image) (obj2)).isScaleToFitHeight() && (2.0F * f4 + f3) - ((Image) (obj2)).getScaledHeight() - pdfchunk.getImageOffsetY() - ((Image) (obj2)).getSpacingBefore() < f2)
	//* 119  233:aload           25
	//* 120  235:invokevirtual   #413 <Method boolean Image.isScaleToFitHeight()>
	//* 121  238:ifeq            305
	//* 122  241:fconst_2        
	//* 123  242:fload           8
	//* 124  244:fmul            
	//* 125  245:fload           7
	//* 126  247:fadd            
	//* 127  248:aload           25
	//* 128  250:invokevirtual   #416 <Method float Image.getScaledHeight()>
	//* 129  253:fsub            
	//* 130  254:aload           26
	//* 131  256:invokevirtual   #419 <Method float PdfChunk.getImageOffsetY()>
	//* 132  259:fsub            
	//* 133  260:aload           25
	//* 134  262:invokevirtual   #422 <Method float Image.getSpacingBefore()>
	//* 135  265:fsub            
	//* 136  266:fload           6
	//* 137  268:fcmpg           
	//* 138  269:ifge            305
				pdfchunk.setImageScalePercentage(((2.0F * f4 + f3) - pdfchunk.getImageOffsetY() - ((Image) (obj2)).getSpacingBefore() - f2) / ((Image) (obj2)).getScaledHeight());
	//  139  272:aload           26
	//  140  274:fconst_2        
	//  141  275:fload           8
	//  142  277:fmul            
	//  143  278:fload           7
	//  144  280:fadd            
	//  145  281:aload           26
	//  146  283:invokevirtual   #419 <Method float PdfChunk.getImageOffsetY()>
	//  147  286:fsub            
	//  148  287:aload           25
	//  149  289:invokevirtual   #422 <Method float Image.getSpacingBefore()>
	//  150  292:fsub            
	//  151  293:fload           6
	//  152  295:fsub            
	//  153  296:aload           25
	//  154  298:invokevirtual   #416 <Method float Image.getScaledHeight()>
	//  155  301:fdiv            
	//  156  302:invokevirtual   #425 <Method void PdfChunk.setImageScalePercentage(float)>
		}
		flag = Utilities.isSurrogatePair(text, currentChar);
	//  157  305:aload_0         
	//  158  306:getfield        #68  <Field char[] text>
	//  159  309:aload_0         
	//  160  310:getfield        #89  <Field int currentChar>
	//  161  313:invokestatic    #332 <Method boolean Utilities.isSurrogatePair(char[], int)>
	//  162  316:istore          19
		if(flag)
	//* 163  318:iload           19
	//* 164  320:ifeq            370
			i1 = pdfchunk.getUnicodeEquivalent(Utilities.convertToUtf32(text, currentChar));
	//  165  323:aload           26
	//  166  325:aload_0         
	//  167  326:getfield        #68  <Field char[] text>
	//  168  329:aload_0         
	//  169  330:getfield        #89  <Field int currentChar>
	//  170  333:invokestatic    #352 <Method int Utilities.convertToUtf32(char[], int)>
	//  171  336:invokevirtual   #235 <Method int PdfChunk.getUnicodeEquivalent(int)>
	//  172  339:istore          17
		else
	//* 173  341:iload           17
	//* 174  343:invokestatic    #238 <Method boolean PdfChunk.noPrint(int)>
	//* 175  346:ifeq            389
	//* 176  349:aload           24
	//* 177  351:astore          25
	//* 178  353:aload_0         
	//* 179  354:aload_0         
	//* 180  355:getfield        #89  <Field int currentChar>
	//* 181  358:iconst_1        
	//* 182  359:iadd            
	//* 183  360:putfield        #89  <Field int currentChar>
	//* 184  363:aload           25
	//* 185  365:astore          24
	//* 186  367:goto            172
			i1 = pdfchunk.getUnicodeEquivalent(((int) (text[currentChar])));
	//  187  370:aload           26
	//  188  372:aload_0         
	//  189  373:getfield        #68  <Field char[] text>
	//  190  376:aload_0         
	//  191  377:getfield        #89  <Field int currentChar>
	//  192  380:caload          
	//  193  381:invokevirtual   #235 <Method int PdfChunk.getUnicodeEquivalent(int)>
	//  194  384:istore          17
		if(!PdfChunk.noPrint(i1)) goto _L4; else goto _L3
_L3:
		obj2 = obj1;
_L12:
		currentChar = currentChar + 1;
		obj1 = obj2;
		  goto _L5
	//* 195  386:goto            341
_L4:
		float f7;
		if(flag)
	//* 196  389:iload           19
	//* 197  391:ifeq            620
			f5 = pdfchunk.getCharWidth(i1);
	//  198  394:aload           26
	//  199  396:iload           17
	//  200  398:invokevirtual   #356 <Method float PdfChunk.getCharWidth(int)>
	//  201  401:fstore          9
		else
	//* 202  403:fload           9
	//* 203  405:fstore          11
	//* 204  407:fload           10
	//* 205  409:fload           9
	//* 206  411:fsub            
	//* 207  412:fconst_0        
	//* 208  413:fcmpg           
	//* 209  414:ifge            474
	//* 210  417:fload           9
	//* 211  419:fstore          11
	//* 212  421:aload           24
	//* 213  423:ifnonnull       474
	//* 214  426:fload           9
	//* 215  428:fstore          11
	//* 216  430:aload           26
	//* 217  432:invokevirtual   #241 <Method boolean PdfChunk.isImage()>
	//* 218  435:ifeq            474
	//* 219  438:aload           26
	//* 220  440:invokevirtual   #408 <Method Image PdfChunk.getImage()>
	//* 221  443:astore          25
	//* 222  445:fload           9
	//* 223  447:fstore          11
	//* 224  449:aload           25
	//* 225  451:invokevirtual   #428 <Method boolean Image.isScaleToFitLineWhenOverflow()>
	//* 226  454:ifeq            474
	//* 227  457:aload           26
	//* 228  459:fload           10
	//* 229  461:aload           25
	//* 230  463:invokevirtual   #430 <Method float Image.getWidth()>
	//* 231  466:fdiv            
	//* 232  467:invokevirtual   #425 <Method void PdfChunk.setImageScalePercentage(float)>
	//* 233  470:fload           10
	//* 234  472:fstore          11
	//* 235  474:aload           26
	//* 236  476:invokevirtual   #247 <Method boolean PdfChunk.isTab()>
	//* 237  479:ifeq            903
	//* 238  482:aload           26
	//* 239  484:ldc2            #334 <String "TABSETTINGS">
	//* 240  487:invokevirtual   #338 <Method boolean PdfChunk.isAttribute(String)>
	//* 241  490:ifeq            786
	//* 242  493:aload_0         
	//* 243  494:getfield        #89  <Field int currentChar>
	//* 244  497:istore          5
	//* 245  499:fload           10
	//* 246  501:fstore          9
	//* 247  503:aload           23
	//* 248  505:ifnull          527
	//* 249  508:aload_0         
	//* 250  509:aload           23
	//* 251  511:fload           14
	//* 252  513:fload_2         
	//* 253  514:fload           10
	//* 254  516:fload           12
	//* 255  518:iload           20
	//* 256  520:aload           27
	//* 257  522:invokespecial   #432 <Method float processTabStop(TabStop, float, float, float, float, boolean, List)>
	//* 258  525:fstore          9
	//* 259  527:aload           26
	//* 260  529:fload_2         
	//* 261  530:fload           9
	//* 262  532:fsub            
	//* 263  533:invokestatic    #345 <Method TabStop PdfChunk.getTabStop(PdfChunk, float)>
	//* 264  536:astore          23
	//* 265  538:aload           23
	//* 266  540:invokevirtual   #348 <Method float TabStop.getPosition()>
	//* 267  543:fload_2         
	//* 268  544:fcmpl           
	//* 269  545:ifle            657
	//* 270  548:aconst_null     
	//* 271  549:astore          25
	//* 272  551:iload           19
	//* 273  553:istore          21
	//* 274  555:iload           5
	//* 275  557:istore          16
	//* 276  559:aload           24
	//* 277  561:ifnonnull       1254
	//* 278  564:aload_0         
	//* 279  565:aload_0         
	//* 280  566:getfield        #89  <Field int currentChar>
	//* 281  569:iconst_1        
	//* 282  570:iadd            
	//* 283  571:putfield        #89  <Field int currentChar>
	//* 284  574:iload           21
	//* 285  576:ifeq            589
	//* 286  579:aload_0         
	//* 287  580:aload_0         
	//* 288  581:getfield        #89  <Field int currentChar>
	//* 289  584:iconst_1        
	//* 290  585:iadd            
	//* 291  586:putfield        #89  <Field int currentChar>
	//* 292  589:new             #398 <Class PdfLine>
	//* 293  592:dup             
	//* 294  593:fconst_0        
	//* 295  594:fload_2         
	//* 296  595:fconst_0        
	//* 297  596:iload_3         
	//* 298  597:iconst_0        
	//* 299  598:aload_0         
	//* 300  599:aload_0         
	//* 301  600:getfield        #89  <Field int currentChar>
	//* 302  603:iconst_1        
	//* 303  604:isub            
	//* 304  605:aload_0         
	//* 305  606:getfield        #89  <Field int currentChar>
	//* 306  609:iconst_1        
	//* 307  610:isub            
	//* 308  611:invokevirtual   #155 <Method ArrayList createArrayOfPdfChunks(int, int)>
	//* 309  614:iload           20
	//* 310  616:invokespecial   #401 <Method void PdfLine(float, float, float, int, boolean, ArrayList, boolean)>
	//* 311  619:areturn         
		if(pdfchunk.isImage())
	//* 312  620:aload           26
	//* 313  622:invokevirtual   #241 <Method boolean PdfChunk.isImage()>
	//* 314  625:ifeq            638
			f5 = pdfchunk.getImageWidth();
	//  315  628:aload           26
	//  316  630:invokevirtual   #435 <Method float PdfChunk.getImageWidth()>
	//  317  633:fstore          9
		else
	//* 318  635:goto            403
			f5 = pdfchunk.getCharWidth(((int) (text[currentChar])));
	//  319  638:aload           26
	//  320  640:aload_0         
	//  321  641:getfield        #68  <Field char[] text>
	//  322  644:aload_0         
	//  323  645:getfield        #89  <Field int currentChar>
	//  324  648:caload          
	//  325  649:invokevirtual   #356 <Method float PdfChunk.getCharWidth(int)>
	//  326  652:fstore          9
		f7 = f5;
		if(f6 - f5 < 0.0F)
		{
			f7 = f5;
			if(obj1 == null)
			{
				f7 = f5;
				if(pdfchunk.isImage())
				{
					obj2 = ((Object) (pdfchunk.getImage()));
					f7 = f5;
					if(((Image) (obj2)).isScaleToFitLineWhenOverflow())
					{
						pdfchunk.setImageScalePercentage(f6 / ((Image) (obj2)).getWidth());
						f7 = f6;
					}
				}
			}
		}
		if(!pdfchunk.isTab()) goto _L7; else goto _L6
_L6:
		if(!pdfchunk.isAttribute("TABSETTINGS")) goto _L9; else goto _L8
_L8:
		k = currentChar;
		f5 = f6;
		if(obj != null)
			f5 = processTabStop(((TabStop) (obj)), f10, f1, f6, f8, flag1, ((List) (arraylist1)));
		obj = ((Object) (PdfChunk.getTabStop(pdfchunk, f1 - f5)));
		if(((TabStop) (obj)).getPosition() <= f1) goto _L11; else goto _L10
_L10:
		obj2 = null;
		flag2 = flag;
		l = k;
_L2:
		if(obj1 == null)
		{
			currentChar = currentChar + 1;
			if(flag2)
				currentChar = currentChar + 1;
			return new PdfLine(0.0F, f1, 0.0F, i, false, createArrayOfPdfChunks(currentChar - 1, currentChar - 1), flag1);
		}
		break MISSING_BLOCK_LABEL_1254;
	//* 327  654:goto            403
_L11:
		float f9;
		pdfchunk.setTabStop(((TabStop) (obj)));
	//  328  657:aload           26
	//  329  659:aload           23
	//  330  661:invokevirtual   #439 <Method void PdfChunk.setTabStop(TabStop)>
		if(!flag1 && ((TabStop) (obj)).getAlignment() == com.itextpdf.text.TabStop.Alignment.LEFT)
	//* 331  664:iload           20
	//* 332  666:ifne            768
	//* 333  669:aload           23
	//* 334  671:invokevirtual   #360 <Method com.itextpdf.text.TabStop$Alignment TabStop.getAlignment()>
	//* 335  674:getstatic       #442 <Field com.itextpdf.text.TabStop$Alignment com.itextpdf.text.TabStop$Alignment.LEFT>
	//* 336  677:if_acmpne       768
		{
			f5 = f1 - ((TabStop) (obj)).getPosition();
	//  337  680:fload_2         
	//  338  681:aload           23
	//  339  683:invokevirtual   #348 <Method float TabStop.getPosition()>
	//  340  686:fsub            
	//  341  687:fstore          9
			obj1 = null;
	//  342  689:aconst_null     
	//  343  690:astore          24
			f9 = (0.0F / 0.0F);
	//  344  692:ldc2            #326 <Float (0.0F / 0.0F)>
	//  345  695:fstore          13
			f7 = (0.0F / 0.0F);
	//  346  697:ldc2            #326 <Float (0.0F / 0.0F)>
	//  347  700:fstore          11
		} else
	//* 348  702:aload           24
	//* 349  704:astore          23
	//* 350  706:fload           13
	//* 351  708:fstore          14
	//* 352  710:fload           11
	//* 353  712:fstore          12
	//* 354  714:iload           5
	//* 355  716:istore          4
	//* 356  718:aload           26
	//* 357  720:astore          25
	//* 358  722:fload           9
	//* 359  724:fstore          10
	//* 360  726:iload           19
	//* 361  728:ifeq            353
	//* 362  731:aload_0         
	//* 363  732:aload_0         
	//* 364  733:getfield        #89  <Field int currentChar>
	//* 365  736:iconst_1        
	//* 366  737:iadd            
	//* 367  738:putfield        #89  <Field int currentChar>
	//* 368  741:aload           24
	//* 369  743:astore          23
	//* 370  745:fload           13
	//* 371  747:fstore          14
	//* 372  749:fload           11
	//* 373  751:fstore          12
	//* 374  753:iload           5
	//* 375  755:istore          4
	//* 376  757:aload           26
	//* 377  759:astore          25
	//* 378  761:fload           9
	//* 379  763:fstore          10
	//* 380  765:goto            353
		{
			f9 = f1 - f5;
	//  381  768:fload_2         
	//  382  769:fload           9
	//  383  771:fsub            
	//  384  772:fstore          13
			f7 = (0.0F / 0.0F);
	//  385  774:ldc2            #326 <Float (0.0F / 0.0F)>
	//  386  777:fstore          11
			obj1 = obj;
	//  387  779:aload           23
	//  388  781:astore          24
		}
_L13:
		obj = obj1;
		f10 = f9;
		f8 = f7;
		j = k;
		obj2 = ((Object) (pdfchunk));
		f6 = f5;
		if(flag)
		{
			currentChar = currentChar + 1;
			obj = obj1;
			f10 = f9;
			f8 = f7;
			j = k;
			obj2 = ((Object) (pdfchunk));
			f6 = f5;
		}
		  goto _L12
	//* 389  783:goto            702
_L9:
		obj1 = ((Object) ((Object[])(Object[])pdfchunk.getAttribute("TAB")));
	//  390  786:aload           26
	//  391  788:ldc2            #444 <String "TAB">
	//  392  791:invokevirtual   #448 <Method Object PdfChunk.getAttribute(String)>
	//  393  794:checkcast       #450 <Class Object[]>
	//  394  797:checkcast       #450 <Class Object[]>
	//  395  800:astore          24
		f5 = ((Float)obj1[1]).floatValue();
	//  396  802:aload           24
	//  397  804:iconst_1        
	//  398  805:aaload          
	//  399  806:checkcast       #368 <Class Float>
	//  400  809:invokevirtual   #453 <Method float Float.floatValue()>
	//  401  812:fstore          9
		if(((Boolean)obj1[2]).booleanValue() && f5 < f1 - f6)
	//* 402  814:aload           24
	//* 403  816:iconst_2        
	//* 404  817:aaload          
	//* 405  818:checkcast       #455 <Class Boolean>
	//* 406  821:invokevirtual   #458 <Method boolean Boolean.booleanValue()>
	//* 407  824:ifeq            865
	//* 408  827:fload           9
	//* 409  829:fload_2         
	//* 410  830:fload           10
	//* 411  832:fsub            
	//* 412  833:fcmpg           
	//* 413  834:ifge            865
			return new PdfLine(0.0F, f1, f6, i, true, createArrayOfPdfChunks(j1, currentChar - 1), flag1);
	//  414  837:new             #398 <Class PdfLine>
	//  415  840:dup             
	//  416  841:fconst_0        
	//  417  842:fload_2         
	//  418  843:fload           10
	//  419  845:iload_3         
	//  420  846:iconst_1        
	//  421  847:aload_0         
	//  422  848:iload           18
	//  423  850:aload_0         
	//  424  851:getfield        #89  <Field int currentChar>
	//  425  854:iconst_1        
	//  426  855:isub            
	//  427  856:invokevirtual   #155 <Method ArrayList createArrayOfPdfChunks(int, int)>
	//  428  859:iload           20
	//  429  861:invokespecial   #401 <Method void PdfLine(float, float, float, int, boolean, ArrayList, boolean)>
	//  430  864:areturn         
		detailChunks[currentChar].adjustLeft(f);
	//  431  865:aload_0         
	//  432  866:getfield        #72  <Field PdfChunk[] detailChunks>
	//  433  869:aload_0         
	//  434  870:getfield        #89  <Field int currentChar>
	//  435  873:aaload          
	//  436  874:fload_1         
	//  437  875:invokevirtual   #461 <Method void PdfChunk.adjustLeft(float)>
		f5 = f1 - f5;
	//  438  878:fload_2         
	//  439  879:fload           9
	//  440  881:fsub            
	//  441  882:fstore          9
		obj1 = obj;
	//  442  884:aload           23
	//  443  886:astore          24
		f9 = f10;
	//  444  888:fload           14
	//  445  890:fstore          13
		f7 = f8;
	//  446  892:fload           12
	//  447  894:fstore          11
		k = j;
	//  448  896:iload           4
	//  449  898:istore          5
		  goto _L13
	//* 450  900:goto            702
_L7:
label0:
		{
			if(!pdfchunk.isSeparator())
				break label0;
	//  451  903:aload           26
	//  452  905:invokevirtual   #244 <Method boolean PdfChunk.isSeparator()>
	//  453  908:ifeq            1065
			obj2 = ((Object) ((Object[])(Object[])pdfchunk.getAttribute("SEPARATOR")));
	//  454  911:aload           26
	//  455  913:ldc2            #463 <String "SEPARATOR">
	//  456  916:invokevirtual   #448 <Method Object PdfChunk.getAttribute(String)>
	//  457  919:checkcast       #450 <Class Object[]>
	//  458  922:checkcast       #450 <Class Object[]>
	//  459  925:astore          25
			DrawInterface drawinterface = (DrawInterface)obj2[0];
	//  460  927:aload           25
	//  461  929:iconst_0        
	//  462  930:aaload          
	//  463  931:checkcast       #465 <Class DrawInterface>
	//  464  934:astore          28
			obj1 = obj;
	//  465  936:aload           23
	//  466  938:astore          24
			f9 = f10;
	//  467  940:fload           14
	//  468  942:fstore          13
			f7 = f8;
	//  469  944:fload           12
	//  470  946:fstore          11
			k = j;
	//  471  948:iload           4
	//  472  950:istore          5
			f5 = f6;
	//  473  952:fload           10
	//  474  954:fstore          9
			if(((Boolean)obj2[1]).booleanValue())
	//* 475  956:aload           25
	//* 476  958:iconst_1        
	//* 477  959:aaload          
	//* 478  960:checkcast       #455 <Class Boolean>
	//* 479  963:invokevirtual   #458 <Method boolean Boolean.booleanValue()>
	//* 480  966:ifeq            702
			{
				obj1 = obj;
	//  481  969:aload           23
	//  482  971:astore          24
				f9 = f10;
	//  483  973:fload           14
	//  484  975:fstore          13
				f7 = f8;
	//  485  977:fload           12
	//  486  979:fstore          11
				k = j;
	//  487  981:iload           4
	//  488  983:istore          5
				f5 = f6;
	//  489  985:fload           10
	//  490  987:fstore          9
				if(drawinterface instanceof LineSeparator)
	//* 491  989:aload           28
	//* 492  991:instanceof      #467 <Class LineSeparator>
	//* 493  994:ifeq            702
				{
					f6 -= (((LineSeparator)drawinterface).getPercentage() * f1) / 100F;
	//  494  997:fload           10
	//  495  999:aload           28
	//  496 1001:checkcast       #467 <Class LineSeparator>
	//  497 1004:invokevirtual   #470 <Method float LineSeparator.getPercentage()>
	//  498 1007:fload_2         
	//  499 1008:fmul            
	//  500 1009:ldc2            #471 <Float 100F>
	//  501 1012:fdiv            
	//  502 1013:fsub            
	//  503 1014:fstore          10
					obj1 = obj;
	//  504 1016:aload           23
	//  505 1018:astore          24
					f9 = f10;
	//  506 1020:fload           14
	//  507 1022:fstore          13
					f7 = f8;
	//  508 1024:fload           12
	//  509 1026:fstore          11
					k = j;
	//  510 1028:iload           4
	//  511 1030:istore          5
					f5 = f6;
	//  512 1032:fload           10
	//  513 1034:fstore          9
					if(f6 < 0.0F)
	//* 514 1036:fload           10
	//* 515 1038:fconst_0        
	//* 516 1039:fcmpg           
	//* 517 1040:ifge            702
					{
						f5 = 0.0F;
	//  518 1043:fconst_0        
	//  519 1044:fstore          9
						obj1 = obj;
	//  520 1046:aload           23
	//  521 1048:astore          24
						f9 = f10;
	//  522 1050:fload           14
	//  523 1052:fstore          13
						f7 = f8;
	//  524 1054:fload           12
	//  525 1056:fstore          11
						k = j;
	//  526 1058:iload           4
	//  527 1060:istore          5
					}
				}
			}
		}
		  goto _L13
	//* 528 1062:goto            702
		boolean flag3;
		flag3 = pdfchunk.isExtSplitCharacter(j1, currentChar, totalTextLength, text, detailChunks);
	//  529 1065:aload           26
	//  530 1067:iload           18
	//  531 1069:aload_0         
	//  532 1070:getfield        #89  <Field int currentChar>
	//  533 1073:aload_0         
	//  534 1074:getfield        #74  <Field int totalTextLength>
	//  535 1077:aload_0         
	//  536 1078:getfield        #68  <Field char[] text>
	//  537 1081:aload_0         
	//  538 1082:getfield        #72  <Field PdfChunk[] detailChunks>
	//  539 1085:invokevirtual   #475 <Method boolean PdfChunk.isExtSplitCharacter(int, int, int, char[], PdfChunk[])>
	//  540 1088:istore          22
		k = j;
	//  541 1090:iload           4
	//  542 1092:istore          5
		if(flag3)
	//* 543 1094:iload           22
	//* 544 1096:ifeq            1118
		{
			k = j;
	//  545 1099:iload           4
	//  546 1101:istore          5
			if(Character.isWhitespace((char)i1))
	//* 547 1103:iload           17
	//* 548 1105:int2char        
	//* 549 1106:invokestatic    #478 <Method boolean Character.isWhitespace(char)>
	//* 550 1109:ifeq            1118
				k = currentChar;
	//  551 1112:aload_0         
	//  552 1113:getfield        #89  <Field int currentChar>
	//  553 1116:istore          5
		}
		obj2 = obj;
	//  554 1118:aload           23
	//  555 1120:astore          25
		l = k;
	//  556 1122:iload           5
	//  557 1124:istore          16
		flag2 = flag;
	//  558 1126:iload           19
	//  559 1128:istore          21
		f5 = f6;
	//  560 1130:fload           10
	//  561 1132:fstore          9
		if(f6 - f7 < 0.0F) goto _L2; else goto _L14
	//  562 1134:fload           10
	//  563 1136:fload           11
	//  564 1138:fsub            
	//  565 1139:fconst_0        
	//  566 1140:fcmpg           
	//  567 1141:iflt            559
_L14:
		float f11 = f8;
	//  568 1144:fload           12
	//  569 1146:fstore          15
		if(obj != null)
	//* 570 1148:aload           23
	//* 571 1150:ifnull          1201
		{
			f11 = f8;
	//  572 1153:fload           12
	//  573 1155:fstore          15
			if(((TabStop) (obj)).getAlignment() == com.itextpdf.text.TabStop.Alignment.ANCHOR)
	//* 574 1157:aload           23
	//* 575 1159:invokevirtual   #360 <Method com.itextpdf.text.TabStop$Alignment TabStop.getAlignment()>
	//* 576 1162:getstatic       #366 <Field com.itextpdf.text.TabStop$Alignment com.itextpdf.text.TabStop$Alignment.ANCHOR>
	//* 577 1165:if_acmpne       1201
			{
				f11 = f8;
	//  578 1168:fload           12
	//  579 1170:fstore          15
				if(Float.isNaN(f8))
	//* 580 1172:fload           12
	//* 581 1174:invokestatic    #372 <Method boolean Float.isNaN(float)>
	//* 582 1177:ifeq            1201
				{
					f11 = f8;
	//  583 1180:fload           12
	//  584 1182:fstore          15
					if(((TabStop) (obj)).getAnchorChar() == (char)i1)
	//* 585 1184:aload           23
	//* 586 1186:invokevirtual   #376 <Method char TabStop.getAnchorChar()>
	//* 587 1189:iload           17
	//* 588 1191:int2char        
	//* 589 1192:icmpne          1201
						f11 = f1 - f6;
	//  590 1195:fload_2         
	//  591 1196:fload           10
	//  592 1198:fsub            
	//  593 1199:fstore          15
				}
			}
		}
		f6 -= f7;
	//  594 1201:fload           10
	//  595 1203:fload           11
	//  596 1205:fsub            
	//  597 1206:fstore          10
		obj1 = obj;
	//  598 1208:aload           23
	//  599 1210:astore          24
		f9 = f10;
	//  600 1212:fload           14
	//  601 1214:fstore          13
		f7 = f11;
	//  602 1216:fload           15
	//  603 1218:fstore          11
		f5 = f6;
	//  604 1220:fload           10
	//  605 1222:fstore          9
		if(flag3)
	//* 606 1224:iload           22
	//* 607 1226:ifeq            702
		{
			k = currentChar;
	//  608 1229:aload_0         
	//  609 1230:getfield        #89  <Field int currentChar>
	//  610 1233:istore          5
			obj1 = obj;
	//  611 1235:aload           23
	//  612 1237:astore          24
			f9 = f10;
	//  613 1239:fload           14
	//  614 1241:fstore          13
			f7 = f11;
	//  615 1243:fload           15
	//  616 1245:fstore          11
			f5 = f6;
	//  617 1247:fload           10
	//  618 1249:fstore          9
		}
		  goto _L13
	//* 619 1251:goto            702
		f = f5;
	//  620 1254:fload           9
	//  621 1256:fstore_1        
		if(obj2 != null)
	//* 622 1257:aload           25
	//* 623 1259:ifnull          1280
			f = processTabStop(((TabStop) (obj2)), f10, f1, f5, f8, flag1, ((List) (arraylist1)));
	//  624 1262:aload_0         
	//  625 1263:aload           25
	//  626 1265:fload           14
	//  627 1267:fload_2         
	//  628 1268:fload           9
	//  629 1270:fload           12
	//  630 1272:iload           20
	//  631 1274:aload           27
	//  632 1276:invokespecial   #432 <Method float processTabStop(TabStop, float, float, float, float, boolean, List)>
	//  633 1279:fstore_1        
		if(arraylist1 != null)
	//* 634 1280:aload           27
	//* 635 1282:ifnull          1333
		{
			TabStop tabstop;
			for(Iterator iterator = ((List) (arraylist1)).iterator(); iterator.hasNext(); tabstop.setPosition(f1 - f - tabstop.getPosition()))
	//* 636 1285:aload           27
	//* 637 1287:invokeinterface #479 <Method Iterator List.iterator()>
	//* 638 1292:astore          23
	//* 639 1294:aload           23
	//* 640 1296:invokeinterface #168 <Method boolean Iterator.hasNext()>
	//* 641 1301:ifeq            1333
				tabstop = (TabStop)iterator.next();
	//  642 1304:aload           23
	//  643 1306:invokeinterface #171 <Method Object Iterator.next()>
	//  644 1311:checkcast       #184 <Class TabStop>
	//  645 1314:astore          25

	//  646 1316:aload           25
	//  647 1318:fload_2         
	//  648 1319:fload_1         
	//  649 1320:fsub            
	//  650 1321:aload           25
	//  651 1323:invokevirtual   #348 <Method float TabStop.getPosition()>
	//  652 1326:fsub            
	//  653 1327:invokevirtual   #192 <Method void TabStop.setPosition(float)>
		}
	//* 654 1330:goto            1294
		if(currentChar >= totalTextLength)
	//* 655 1333:aload_0         
	//* 656 1334:getfield        #89  <Field int currentChar>
	//* 657 1337:aload_0         
	//* 658 1338:getfield        #74  <Field int totalTextLength>
	//* 659 1341:icmplt          1371
			return new PdfLine(0.0F, f1, f, i, true, createArrayOfPdfChunks(j1, totalTextLength - 1), flag1);
	//  660 1344:new             #398 <Class PdfLine>
	//  661 1347:dup             
	//  662 1348:fconst_0        
	//  663 1349:fload_2         
	//  664 1350:fload_1         
	//  665 1351:iload_3         
	//  666 1352:iconst_1        
	//  667 1353:aload_0         
	//  668 1354:iload           18
	//  669 1356:aload_0         
	//  670 1357:getfield        #74  <Field int totalTextLength>
	//  671 1360:iconst_1        
	//  672 1361:isub            
	//  673 1362:invokevirtual   #155 <Method ArrayList createArrayOfPdfChunks(int, int)>
	//  674 1365:iload           20
	//  675 1367:invokespecial   #401 <Method void PdfLine(float, float, float, int, boolean, ArrayList, boolean)>
	//  676 1370:areturn         
		j = trimRightEx(j1, currentChar - 1);
	//  677 1371:aload_0         
	//  678 1372:iload           18
	//  679 1374:aload_0         
	//  680 1375:getfield        #89  <Field int currentChar>
	//  681 1378:iconst_1        
	//  682 1379:isub            
	//  683 1380:invokevirtual   #320 <Method int trimRightEx(int, int)>
	//  684 1383:istore          4
		if(j < j1)
	//* 685 1385:iload           4
	//* 686 1387:iload           18
	//* 687 1389:icmpge          1419
			return new PdfLine(0.0F, f1, f, i, false, createArrayOfPdfChunks(j1, currentChar - 1), flag1);
	//  688 1392:new             #398 <Class PdfLine>
	//  689 1395:dup             
	//  690 1396:fconst_0        
	//  691 1397:fload_2         
	//  692 1398:fload_1         
	//  693 1399:iload_3         
	//  694 1400:iconst_0        
	//  695 1401:aload_0         
	//  696 1402:iload           18
	//  697 1404:aload_0         
	//  698 1405:getfield        #89  <Field int currentChar>
	//  699 1408:iconst_1        
	//  700 1409:isub            
	//  701 1410:invokevirtual   #155 <Method ArrayList createArrayOfPdfChunks(int, int)>
	//  702 1413:iload           20
	//  703 1415:invokespecial   #401 <Method void PdfLine(float, float, float, int, boolean, ArrayList, boolean)>
	//  704 1418:areturn         
		if(j == currentChar - 1)
	//* 705 1419:iload           4
	//* 706 1421:aload_0         
	//* 707 1422:getfield        #89  <Field int currentChar>
	//* 708 1425:iconst_1        
	//* 709 1426:isub            
	//* 710 1427:icmpne          1614
		{
			Object obj3 = ((Object) ((HyphenationEvent)((PdfChunk) (obj1)).getAttribute("HYPHENATION")));
	//  711 1430:aload           24
	//  712 1432:ldc2            #481 <String "HYPHENATION">
	//  713 1435:invokevirtual   #448 <Method Object PdfChunk.getAttribute(String)>
	//  714 1438:checkcast       #483 <Class HyphenationEvent>
	//  715 1441:astore          26
			if(obj3 != null)
	//* 716 1443:aload           26
	//* 717 1445:ifnull          1614
			{
				int ai[] = getWord(j1, j);
	//  718 1448:aload_0         
	//  719 1449:iload           18
	//  720 1451:iload           4
	//  721 1453:invokevirtual   #485 <Method int[] getWord(int, int)>
	//  722 1456:astore          23
				if(ai != null)
	//* 723 1458:aload           23
	//* 724 1460:ifnull          1614
				{
					f2 = f + getWidth(ai[0], currentChar - 1);
	//  725 1463:fload_1         
	//  726 1464:aload_0         
	//  727 1465:aload           23
	//  728 1467:iconst_0        
	//  729 1468:iaload          
	//  730 1469:aload_0         
	//  731 1470:getfield        #89  <Field int currentChar>
	//  732 1473:iconst_1        
	//  733 1474:isub            
	//  734 1475:invokevirtual   #487 <Method float getWidth(int, int)>
	//  735 1478:fadd            
	//  736 1479:fstore          6
					String s = ((HyphenationEvent) (obj3)).getHyphenatedWordPre(new String(text, ai[0], ai[1] - ai[0]), ((PdfChunk) (obj1)).font().getFont(), ((PdfChunk) (obj1)).font().size(), f2);
	//  737 1481:aload           26
	//  738 1483:new             #286 <Class String>
	//  739 1486:dup             
	//  740 1487:aload_0         
	//  741 1488:getfield        #68  <Field char[] text>
	//  742 1491:aload           23
	//  743 1493:iconst_0        
	//  744 1494:iaload          
	//  745 1495:aload           23
	//  746 1497:iconst_1        
	//  747 1498:iaload          
	//  748 1499:aload           23
	//  749 1501:iconst_0        
	//  750 1502:iaload          
	//  751 1503:isub            
	//  752 1504:invokespecial   #490 <Method void String(char[], int, int)>
	//  753 1507:aload           24
	//  754 1509:invokevirtual   #278 <Method PdfFont PdfChunk.font()>
	//  755 1512:invokevirtual   #284 <Method BaseFont PdfFont.getFont()>
	//  756 1515:aload           24
	//  757 1517:invokevirtual   #278 <Method PdfFont PdfChunk.font()>
	//  758 1520:invokevirtual   #492 <Method float PdfFont.size()>
	//  759 1523:fload           6
	//  760 1525:invokeinterface #496 <Method String HyphenationEvent.getHyphenatedWordPre(String, BaseFont, float, float)>
	//  761 1530:astore          25
					obj3 = ((Object) (((HyphenationEvent) (obj3)).getHyphenatedWordPost()));
	//  762 1532:aload           26
	//  763 1534:invokeinterface #499 <Method String HyphenationEvent.getHyphenatedWordPost()>
	//  764 1539:astore          26
					if(s.length() > 0)
	//* 765 1541:aload           25
	//* 766 1543:invokevirtual   #287 <Method int String.length()>
	//* 767 1546:ifle            1614
					{
						PdfChunk pdfchunk1 = new PdfChunk(s, ((PdfChunk) (obj1)));
	//  768 1549:new             #70  <Class PdfChunk>
	//  769 1552:dup             
	//  770 1553:aload           25
	//  771 1555:aload           24
	//  772 1557:invokespecial   #255 <Method void PdfChunk(String, PdfChunk)>
	//  773 1560:astore          27
						currentChar = ai[1] - ((String) (obj3)).length();
	//  774 1562:aload_0         
	//  775 1563:aload           23
	//  776 1565:iconst_1        
	//  777 1566:iaload          
	//  778 1567:aload           26
	//  779 1569:invokevirtual   #287 <Method int String.length()>
	//  780 1572:isub            
	//  781 1573:putfield        #89  <Field int currentChar>
						return new PdfLine(0.0F, f1, f2 - ((PdfChunk) (obj1)).width(s), i, false, createArrayOfPdfChunks(j1, ai[0] - 1, pdfchunk1), flag1);
	//  782 1576:new             #398 <Class PdfLine>
	//  783 1579:dup             
	//  784 1580:fconst_0        
	//  785 1581:fload_2         
	//  786 1582:fload           6
	//  787 1584:aload           24
	//  788 1586:aload           25
	//  789 1588:invokevirtual   #503 <Method float PdfChunk.width(String)>
	//  790 1591:fsub            
	//  791 1592:iload_3         
	//  792 1593:iconst_0        
	//  793 1594:aload_0         
	//  794 1595:iload           18
	//  795 1597:aload           23
	//  796 1599:iconst_0        
	//  797 1600:iaload          
	//  798 1601:iconst_1        
	//  799 1602:isub            
	//  800 1603:aload           27
	//  801 1605:invokevirtual   #223 <Method ArrayList createArrayOfPdfChunks(int, int, PdfChunk)>
	//  802 1608:iload           20
	//  803 1610:invokespecial   #401 <Method void PdfLine(float, float, float, int, boolean, ArrayList, boolean)>
	//  804 1613:areturn         
					}
				}
			}
		}
		if(l == -1)
	//* 805 1614:iload           16
	//* 806 1616:iconst_m1       
	//* 807 1617:icmpne          1625
			isWordSplit = true;
	//  808 1620:aload_0         
	//  809 1621:iconst_1        
	//  810 1622:putfield        #107 <Field boolean isWordSplit>
		if(l == -1 || l >= j)
	//* 811 1625:iload           16
	//* 812 1627:iconst_m1       
	//* 813 1628:icmpeq          1638
	//* 814 1631:iload           16
	//* 815 1633:iload           4
	//* 816 1635:icmplt          1677
			return new PdfLine(0.0F, f1, f + getWidth(j + 1, currentChar - 1, f1), i, false, createArrayOfPdfChunks(j1, j), flag1);
	//  817 1638:new             #398 <Class PdfLine>
	//  818 1641:dup             
	//  819 1642:fconst_0        
	//  820 1643:fload_2         
	//  821 1644:fload_1         
	//  822 1645:aload_0         
	//  823 1646:iload           4
	//  824 1648:iconst_1        
	//  825 1649:iadd            
	//  826 1650:aload_0         
	//  827 1651:getfield        #89  <Field int currentChar>
	//  828 1654:iconst_1        
	//  829 1655:isub            
	//  830 1656:fload_2         
	//  831 1657:invokevirtual   #325 <Method float getWidth(int, int, float)>
	//  832 1660:fadd            
	//  833 1661:iload_3         
	//  834 1662:iconst_0        
	//  835 1663:aload_0         
	//  836 1664:iload           18
	//  837 1666:iload           4
	//  838 1668:invokevirtual   #155 <Method ArrayList createArrayOfPdfChunks(int, int)>
	//  839 1671:iload           20
	//  840 1673:invokespecial   #401 <Method void PdfLine(float, float, float, int, boolean, ArrayList, boolean)>
	//  841 1676:areturn         
		currentChar = l + 1;
	//  842 1677:aload_0         
	//  843 1678:iload           16
	//  844 1680:iconst_1        
	//  845 1681:iadd            
	//  846 1682:putfield        #89  <Field int currentChar>
		k = trimRightEx(j1, l);
	//  847 1685:aload_0         
	//  848 1686:iload           18
	//  849 1688:iload           16
	//  850 1690:invokevirtual   #320 <Method int trimRightEx(int, int)>
	//  851 1693:istore          5
		j = k;
	//  852 1695:iload           5
	//  853 1697:istore          4
		if(k < j1)
	//* 854 1699:iload           5
	//* 855 1701:iload           18
	//* 856 1703:icmpge          1714
			j = currentChar - 1;
	//  857 1706:aload_0         
	//  858 1707:getfield        #89  <Field int currentChar>
	//  859 1710:iconst_1        
	//  860 1711:isub            
	//  861 1712:istore          4
		return new PdfLine(0.0F, f1, f1 - getWidth(j1, j, f1), i, false, createArrayOfPdfChunks(j1, j), flag1);
	//  862 1714:new             #398 <Class PdfLine>
	//  863 1717:dup             
	//  864 1718:fconst_0        
	//  865 1719:fload_2         
	//  866 1720:fload_2         
	//  867 1721:aload_0         
	//  868 1722:iload           18
	//  869 1724:iload           4
	//  870 1726:fload_2         
	//  871 1727:invokevirtual   #325 <Method float getWidth(int, int, float)>
	//  872 1730:fsub            
	//  873 1731:iload_3         
	//  874 1732:iconst_0        
	//  875 1733:aload_0         
	//  876 1734:iload           18
	//  877 1736:iload           4
	//  878 1738:invokevirtual   #155 <Method ArrayList createArrayOfPdfChunks(int, int)>
	//  879 1741:iload           20
	//  880 1743:invokespecial   #401 <Method void PdfLine(float, float, float, int, boolean, ArrayList, boolean)>
	//  881 1746:areturn         
		  goto _L12
	}

	public void reorder(int i, int j)
	{
		int k;
		byte byte0;
		byte byte1;
		byte byte2;
		k = ((int) (orderLevels[i]));
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field byte[] orderLevels>
	//    2    4:iload_1         
	//    3    5:baload          
	//    4    6:istore_3        
		byte2 = ((byte) (k));
	//    5    7:iload_3         
	//    6    8:istore          6
		byte1 = ((byte) (k));
	//    7   10:iload_3         
	//    8   11:istore          5
		byte0 = ((byte) (k));
	//    9   13:iload_3         
	//   10   14:istore          4
		int i1 = i + 1;
	//   11   16:iload_1         
	//   12   17:iconst_1        
	//   13   18:iadd            
	//   14   19:istore          7
		while(i1 <= j) 
	//*  15   21:iload           7
	//*  16   23:iload_2         
	//*  17   24:icmpgt          106
		{
			byte byte5 = orderLevels[i1];
	//   18   27:aload_0         
	//   19   28:getfield        #76  <Field byte[] orderLevels>
	//   20   31:iload           7
	//   21   33:baload          
	//   22   34:istore          10
			byte byte3;
			byte byte4;
			if(byte5 > k)
	//*  23   36:iload           10
	//*  24   38:iload_3         
	//*  25   39:icmple          82
			{
				byte3 = byte5;
	//   26   42:iload           10
	//   27   44:istore          8
				byte4 = byte2;
	//   28   46:iload           6
	//   29   48:istore          9
			} else
	//*  30   50:iload           5
	//*  31   52:iload           10
	//*  32   54:iand            
	//*  33   55:int2byte        
	//*  34   56:istore          5
	//*  35   58:iload           4
	//*  36   60:iload           10
	//*  37   62:ior             
	//*  38   63:int2byte        
	//*  39   64:istore          4
	//*  40   66:iload           7
	//*  41   68:iconst_1        
	//*  42   69:iadd            
	//*  43   70:istore          7
	//*  44   72:iload           8
	//*  45   74:istore_3        
	//*  46   75:iload           9
	//*  47   77:istore          6
	//*  48   79:goto            21
			{
				byte3 = ((byte) (k));
	//   49   82:iload_3         
	//   50   83:istore          8
				byte4 = byte2;
	//   51   85:iload           6
	//   52   87:istore          9
				if(byte5 < byte2)
	//*  53   89:iload           10
	//*  54   91:iload           6
	//*  55   93:icmpge          50
				{
					byte4 = byte5;
	//   56   96:iload           10
	//   57   98:istore          9
					byte3 = ((byte) (k));
	//   58  100:iload_3         
	//   59  101:istore          8
				}
			}
			byte1 &= byte5;
			byte0 |= byte5;
			i1++;
			k = ((int) (byte3));
			byte2 = byte4;
		}
	//*  60  103:goto            50
		if((byte0 & 1) != 0) goto _L2; else goto _L1
	//   61  106:iload           4
	//   62  108:iconst_1        
	//   63  109:iand            
	//   64  110:ifne            114
_L1:
		return;
	//   65  113:return          
_L2:
		if((byte1 & 1) == 1)
	//*  66  114:iload           5
	//*  67  116:iconst_1        
	//*  68  117:iand            
	//*  69  118:iconst_1        
	//*  70  119:icmpne          131
		{
			flip(i, j + 1);
	//   71  122:aload_0         
	//   72  123:iload_1         
	//   73  124:iload_2         
	//   74  125:iconst_1        
	//   75  126:iadd            
	//   76  127:invokevirtual   #505 <Method void flip(int, int)>
			return;
	//   77  130:return          
		}
		byte2 |= 1;
	//   78  131:iload           6
	//   79  133:iconst_1        
	//   80  134:ior             
	//   81  135:int2byte        
	//   82  136:istore          6
		byte0 = ((byte) (k));
	//   83  138:iload_3         
	//   84  139:istore          4
_L4:
		if(byte0 < byte2) goto _L1; else goto _L3
	//   85  141:iload           4
	//   86  143:iload           6
	//   87  145:icmplt          113
_L3:
label0:
		{
			for(k = i; k <= j && orderLevels[k] < byte0; k++)
				break label0;

	//   88  148:iload_1         
	//   89  149:istore_3        
	//   90  150:iload_3         
	//   91  151:iload_2         
	//   92  152:icmpgt          166
	//   93  155:aload_0         
	//   94  156:getfield        #76  <Field byte[] orderLevels>
	//   95  159:iload_3         
	//   96  160:baload          
	//   97  161:iload           4
	//   98  163:icmplt          181
	//   99  166:iload_3         
	//  100  167:iload_2         
	//  101  168:icmple          188
	//  102  171:iload           4
	//  103  173:iconst_1        
	//  104  174:isub            
	//  105  175:int2byte        
	//  106  176:istore          4
	//  107  178:goto            141
	//  108  181:iload_3         
	//  109  182:iconst_1        
	//  110  183:iadd            
	//  111  184:istore_3        
			if(k <= j)
				break MISSING_BLOCK_LABEL_188;
			byte0--;
		}
		  goto _L4
		  goto _L1
	//* 112  185:goto            150
label1:
		{
			for(int l = k + 1; l <= j && orderLevels[l] >= byte0; l++)
				break label1;

	//  113  188:iload_3         
	//  114  189:iconst_1        
	//  115  190:iadd            
	//  116  191:istore          5
	//  117  193:iload           5
	//  118  195:iload_2         
	//  119  196:icmpgt          211
	//  120  199:aload_0         
	//  121  200:getfield        #76  <Field byte[] orderLevels>
	//  122  203:iload           5
	//  123  205:baload          
	//  124  206:iload           4
	//  125  208:icmpge          226
	//  126  211:aload_0         
	//  127  212:iload_3         
	//  128  213:iload           5
	//  129  215:invokevirtual   #505 <Method void flip(int, int)>
	//  130  218:iload           5
	//  131  220:iconst_1        
	//  132  221:iadd            
	//  133  222:istore_3        
	//  134  223:goto            150
	//  135  226:iload           5
	//  136  228:iconst_1        
	//  137  229:iadd            
	//  138  230:istore          5
			flip(k, l);
			k = l + 1;
		}
		  goto _L3
	//* 139  232:goto            193
	}

	public void restore()
	{
		runDirection = storedRunDirection;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #126 <Field int storedRunDirection>
	//    3    5:putfield        #110 <Field int runDirection>
		totalTextLength = storedTotalTextLength;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #95  <Field int storedTotalTextLength>
	//    7   13:putfield        #74  <Field int totalTextLength>
		indexChunk = storedIndexChunk;
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #101 <Field int storedIndexChunk>
	//   11   21:putfield        #85  <Field int indexChunk>
		indexChunkChar = storedIndexChunkChar;
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #103 <Field int storedIndexChunkChar>
	//   15   29:putfield        #87  <Field int indexChunkChar>
		currentChar = storedCurrentChar;
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #105 <Field int storedCurrentChar>
	//   19   37:putfield        #89  <Field int currentChar>
		if(!shortStore)
	//*  20   40:aload_0         
	//*  21   41:getfield        #128 <Field boolean shortStore>
	//*  22   44:ifne            81
		{
			System.arraycopy(((Object) (storedText)), 0, ((Object) (text)), 0, totalTextLength);
	//   23   47:aload_0         
	//   24   48:getfield        #91  <Field char[] storedText>
	//   25   51:iconst_0        
	//   26   52:aload_0         
	//   27   53:getfield        #68  <Field char[] text>
	//   28   56:iconst_0        
	//   29   57:aload_0         
	//   30   58:getfield        #74  <Field int totalTextLength>
	//   31   61:invokestatic    #216 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (storedDetailChunks)), 0, ((Object) (detailChunks)), 0, totalTextLength);
	//   32   64:aload_0         
	//   33   65:getfield        #93  <Field PdfChunk[] storedDetailChunks>
	//   34   68:iconst_0        
	//   35   69:aload_0         
	//   36   70:getfield        #72  <Field PdfChunk[] detailChunks>
	//   37   73:iconst_0        
	//   38   74:aload_0         
	//   39   75:getfield        #74  <Field int totalTextLength>
	//   40   78:invokestatic    #216 <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		if(runDirection != 1)
	//*  41   81:aload_0         
	//*  42   82:getfield        #110 <Field int runDirection>
	//*  43   85:iconst_1        
	//*  44   86:icmpeq          145
		{
			System.arraycopy(((Object) (storedOrderLevels)), currentChar, ((Object) (orderLevels)), currentChar, totalTextLength - currentChar);
	//   45   89:aload_0         
	//   46   90:getfield        #97  <Field byte[] storedOrderLevels>
	//   47   93:aload_0         
	//   48   94:getfield        #89  <Field int currentChar>
	//   49   97:aload_0         
	//   50   98:getfield        #76  <Field byte[] orderLevels>
	//   51  101:aload_0         
	//   52  102:getfield        #89  <Field int currentChar>
	//   53  105:aload_0         
	//   54  106:getfield        #74  <Field int totalTextLength>
	//   55  109:aload_0         
	//   56  110:getfield        #89  <Field int currentChar>
	//   57  113:isub            
	//   58  114:invokestatic    #216 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (storedIndexChars)), currentChar, ((Object) (indexChars)), currentChar, totalTextLength - currentChar);
	//   59  117:aload_0         
	//   60  118:getfield        #99  <Field int[] storedIndexChars>
	//   61  121:aload_0         
	//   62  122:getfield        #89  <Field int currentChar>
	//   63  125:aload_0         
	//   64  126:getfield        #78  <Field int[] indexChars>
	//   65  129:aload_0         
	//   66  130:getfield        #89  <Field int currentChar>
	//   67  133:aload_0         
	//   68  134:getfield        #74  <Field int totalTextLength>
	//   69  137:aload_0         
	//   70  138:getfield        #89  <Field int currentChar>
	//   71  141:isub            
	//   72  142:invokestatic    #216 <Method void System.arraycopy(Object, int, Object, int, int)>
		}
	//   73  145:return          
	}

	public void save()
	{
		boolean flag;
		if(indexChunk > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field int indexChunk>
	//*   2    4:ifle            33
		{
			if(indexChunk >= chunks.size())
	//*   3    7:aload_0         
	//*   4    8:getfield        #85  <Field int indexChunk>
	//*   5   11:aload_0         
	//*   6   12:getfield        #83  <Field ArrayList chunks>
	//*   7   15:invokevirtual   #270 <Method int ArrayList.size()>
	//*   8   18:icmplt          262
			{
				chunks.clear();
	//    9   21:aload_0         
	//   10   22:getfield        #83  <Field ArrayList chunks>
	//   11   25:invokevirtual   #220 <Method void ArrayList.clear()>
			} else
	//*  12   28:aload_0         
	//*  13   29:iconst_0        
	//*  14   30:putfield        #85  <Field int indexChunk>
	//*  15   33:aload_0         
	//*  16   34:aload_0         
	//*  17   35:getfield        #110 <Field int runDirection>
	//*  18   38:putfield        #126 <Field int storedRunDirection>
	//*  19   41:aload_0         
	//*  20   42:aload_0         
	//*  21   43:getfield        #74  <Field int totalTextLength>
	//*  22   46:putfield        #95  <Field int storedTotalTextLength>
	//*  23   49:aload_0         
	//*  24   50:aload_0         
	//*  25   51:getfield        #85  <Field int indexChunk>
	//*  26   54:putfield        #101 <Field int storedIndexChunk>
	//*  27   57:aload_0         
	//*  28   58:aload_0         
	//*  29   59:getfield        #87  <Field int indexChunkChar>
	//*  30   62:putfield        #103 <Field int storedIndexChunkChar>
	//*  31   65:aload_0         
	//*  32   66:aload_0         
	//*  33   67:getfield        #89  <Field int currentChar>
	//*  34   70:putfield        #105 <Field int storedCurrentChar>
	//*  35   73:aload_0         
	//*  36   74:getfield        #89  <Field int currentChar>
	//*  37   77:aload_0         
	//*  38   78:getfield        #74  <Field int totalTextLength>
	//*  39   81:icmpge          304
	//*  40   84:iconst_1        
	//*  41   85:istore_1        
	//*  42   86:aload_0         
	//*  43   87:iload_1         
	//*  44   88:putfield        #128 <Field boolean shortStore>
	//*  45   91:aload_0         
	//*  46   92:getfield        #128 <Field boolean shortStore>
	//*  47   95:ifne            165
	//*  48   98:aload_0         
	//*  49   99:getfield        #91  <Field char[] storedText>
	//*  50  102:arraylength     
	//*  51  103:aload_0         
	//*  52  104:getfield        #74  <Field int totalTextLength>
	//*  53  107:icmpge          131
	//*  54  110:aload_0         
	//*  55  111:aload_0         
	//*  56  112:getfield        #74  <Field int totalTextLength>
	//*  57  115:newarray        char[]
	//*  58  117:putfield        #91  <Field char[] storedText>
	//*  59  120:aload_0         
	//*  60  121:aload_0         
	//*  61  122:getfield        #74  <Field int totalTextLength>
	//*  62  125:anewarray       PdfChunk[]
	//*  63  128:putfield        #93  <Field PdfChunk[] storedDetailChunks>
	//*  64  131:aload_0         
	//*  65  132:getfield        #68  <Field char[] text>
	//*  66  135:iconst_0        
	//*  67  136:aload_0         
	//*  68  137:getfield        #91  <Field char[] storedText>
	//*  69  140:iconst_0        
	//*  70  141:aload_0         
	//*  71  142:getfield        #74  <Field int totalTextLength>
	//*  72  145:invokestatic    #216 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  73  148:aload_0         
	//*  74  149:getfield        #72  <Field PdfChunk[] detailChunks>
	//*  75  152:iconst_0        
	//*  76  153:aload_0         
	//*  77  154:getfield        #93  <Field PdfChunk[] storedDetailChunks>
	//*  78  157:iconst_0        
	//*  79  158:aload_0         
	//*  80  159:getfield        #74  <Field int totalTextLength>
	//*  81  162:invokestatic    #216 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  82  165:aload_0         
	//*  83  166:getfield        #110 <Field int runDirection>
	//*  84  169:iconst_1        
	//*  85  170:icmpeq          261
	//*  86  173:aload_0         
	//*  87  174:getfield        #97  <Field byte[] storedOrderLevels>
	//*  88  177:arraylength     
	//*  89  178:aload_0         
	//*  90  179:getfield        #74  <Field int totalTextLength>
	//*  91  182:icmpge          205
	//*  92  185:aload_0         
	//*  93  186:aload_0         
	//*  94  187:getfield        #74  <Field int totalTextLength>
	//*  95  190:newarray        byte[]
	//*  96  192:putfield        #97  <Field byte[] storedOrderLevels>
	//*  97  195:aload_0         
	//*  98  196:aload_0         
	//*  99  197:getfield        #74  <Field int totalTextLength>
	//* 100  200:newarray        int[]
	//* 101  202:putfield        #99  <Field int[] storedIndexChars>
	//* 102  205:aload_0         
	//* 103  206:getfield        #76  <Field byte[] orderLevels>
	//* 104  209:aload_0         
	//* 105  210:getfield        #89  <Field int currentChar>
	//* 106  213:aload_0         
	//* 107  214:getfield        #97  <Field byte[] storedOrderLevels>
	//* 108  217:aload_0         
	//* 109  218:getfield        #89  <Field int currentChar>
	//* 110  221:aload_0         
	//* 111  222:getfield        #74  <Field int totalTextLength>
	//* 112  225:aload_0         
	//* 113  226:getfield        #89  <Field int currentChar>
	//* 114  229:isub            
	//* 115  230:invokestatic    #216 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 116  233:aload_0         
	//* 117  234:getfield        #78  <Field int[] indexChars>
	//* 118  237:aload_0         
	//* 119  238:getfield        #89  <Field int currentChar>
	//* 120  241:aload_0         
	//* 121  242:getfield        #99  <Field int[] storedIndexChars>
	//* 122  245:aload_0         
	//* 123  246:getfield        #89  <Field int currentChar>
	//* 124  249:aload_0         
	//* 125  250:getfield        #74  <Field int totalTextLength>
	//* 126  253:aload_0         
	//* 127  254:getfield        #89  <Field int currentChar>
	//* 128  257:isub            
	//* 129  258:invokestatic    #216 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 130  261:return          
			{
				indexChunk = indexChunk - 1;
	//  131  262:aload_0         
	//  132  263:aload_0         
	//  133  264:getfield        #85  <Field int indexChunk>
	//  134  267:iconst_1        
	//  135  268:isub            
	//  136  269:putfield        #85  <Field int indexChunk>
				while(indexChunk >= 0) 
	//* 137  272:aload_0         
	//* 138  273:getfield        #85  <Field int indexChunk>
	//* 139  276:iflt            28
				{
					chunks.remove(indexChunk);
	//  140  279:aload_0         
	//  141  280:getfield        #83  <Field ArrayList chunks>
	//  142  283:aload_0         
	//  143  284:getfield        #85  <Field int indexChunk>
	//  144  287:invokevirtual   #509 <Method Object ArrayList.remove(int)>
	//  145  290:pop             
					indexChunk = indexChunk - 1;
	//  146  291:aload_0         
	//  147  292:aload_0         
	//  148  293:getfield        #85  <Field int indexChunk>
	//  149  296:iconst_1        
	//  150  297:isub            
	//  151  298:putfield        #85  <Field int indexChunk>
				}
			}
			indexChunk = 0;
		}
		storedRunDirection = runDirection;
		storedTotalTextLength = totalTextLength;
		storedIndexChunk = indexChunk;
		storedIndexChunkChar = indexChunkChar;
		storedCurrentChar = currentChar;
		if(currentChar < totalTextLength)
			flag = true;
		else
	//* 152  301:goto            272
			flag = false;
	//  153  304:iconst_0        
	//  154  305:istore_1        
		shortStore = flag;
		if(!shortStore)
		{
			if(storedText.length < totalTextLength)
			{
				storedText = new char[totalTextLength];
				storedDetailChunks = new PdfChunk[totalTextLength];
			}
			System.arraycopy(((Object) (text)), 0, ((Object) (storedText)), 0, totalTextLength);
			System.arraycopy(((Object) (detailChunks)), 0, ((Object) (storedDetailChunks)), 0, totalTextLength);
		}
		if(runDirection != 1)
		{
			if(storedOrderLevels.length < totalTextLength)
			{
				storedOrderLevels = new byte[totalTextLength];
				storedIndexChars = new int[totalTextLength];
			}
			System.arraycopy(((Object) (orderLevels)), currentChar, ((Object) (storedOrderLevels)), currentChar, totalTextLength - currentChar);
			System.arraycopy(((Object) (indexChars)), currentChar, ((Object) (storedIndexChars)), currentChar, totalTextLength - currentChar);
		}
	//* 155  306:goto            86
	}

	public int trimLeft(int i, int j)
	{
		do
		{
			if(i > j || !isWS((char)detailChunks[i].getUnicodeEquivalent(((int) (text[i])))))
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpgt          27
	//*   3    5:aload_0         
	//*   4    6:getfield        #72  <Field PdfChunk[] detailChunks>
	//*   5    9:iload_1         
	//*   6   10:aaload          
	//*   7   11:aload_0         
	//*   8   12:getfield        #68  <Field char[] text>
	//*   9   15:iload_1         
	//*  10   16:caload          
	//*  11   17:invokevirtual   #235 <Method int PdfChunk.getUnicodeEquivalent(int)>
	//*  12   20:int2char        
	//*  13   21:invokestatic    #512 <Method boolean isWS(char)>
	//*  14   24:ifne            29
				return i;
	//   15   27:iload_1         
	//   16   28:ireturn         
			i++;
	//   17   29:iload_1         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:istore_1        
		} while(true);
	//   21   33:goto            0
	}

	public int trimLeftEx(int i, int j)
	{
		do
		{
			if(i > j)
				break;
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:icmpgt          99
			char c = (char)detailChunks[i].getUnicodeEquivalent(((int) (text[i])));
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field PdfChunk[] detailChunks>
	//    5    9:iload_1         
	//    6   10:aaload          
	//    7   11:aload_0         
	//    8   12:getfield        #68  <Field char[] text>
	//    9   15:iload_1         
	//   10   16:caload          
	//   11   17:invokevirtual   #235 <Method int PdfChunk.getUnicodeEquivalent(int)>
	//   12   20:int2char        
	//   13   21:istore_3        
			if(!isWS(c) && !PdfChunk.noPrint(((int) (c))) && (!detailChunks[i].isTab() || !detailChunks[i].isAttribute("TABSETTINGS") || !((Boolean)((Object[])(Object[])detailChunks[i].getAttribute("TAB"))[1]).booleanValue()))
				break;
	//   14   22:iload_3         
	//   15   23:invokestatic    #512 <Method boolean isWS(char)>
	//   16   26:ifne            92
	//   17   29:iload_3         
	//   18   30:invokestatic    #238 <Method boolean PdfChunk.noPrint(int)>
	//   19   33:ifne            92
	//   20   36:aload_0         
	//   21   37:getfield        #72  <Field PdfChunk[] detailChunks>
	//   22   40:iload_1         
	//   23   41:aaload          
	//   24   42:invokevirtual   #247 <Method boolean PdfChunk.isTab()>
	//   25   45:ifeq            99
	//   26   48:aload_0         
	//   27   49:getfield        #72  <Field PdfChunk[] detailChunks>
	//   28   52:iload_1         
	//   29   53:aaload          
	//   30   54:ldc2            #334 <String "TABSETTINGS">
	//   31   57:invokevirtual   #338 <Method boolean PdfChunk.isAttribute(String)>
	//   32   60:ifeq            99
	//   33   63:aload_0         
	//   34   64:getfield        #72  <Field PdfChunk[] detailChunks>
	//   35   67:iload_1         
	//   36   68:aaload          
	//   37   69:ldc2            #444 <String "TAB">
	//   38   72:invokevirtual   #448 <Method Object PdfChunk.getAttribute(String)>
	//   39   75:checkcast       #450 <Class Object[]>
	//   40   78:checkcast       #450 <Class Object[]>
	//   41   81:iconst_1        
	//   42   82:aaload          
	//   43   83:checkcast       #455 <Class Boolean>
	//   44   86:invokevirtual   #458 <Method boolean Boolean.booleanValue()>
	//   45   89:ifeq            99
			i++;
	//   46   92:iload_1         
	//   47   93:iconst_1        
	//   48   94:iadd            
	//   49   95:istore_1        
		} while(true);
	//   50   96:goto            0
		return i;
	//   51   99:iload_1         
	//   52  100:ireturn         
	}

	public int trimRight(int i, int j)
	{
		do
		{
			if(j < i || !isWS((char)detailChunks[j].getUnicodeEquivalent(((int) (text[j])))))
	//*   0    0:iload_2         
	//*   1    1:iload_1         
	//*   2    2:icmplt          27
	//*   3    5:aload_0         
	//*   4    6:getfield        #72  <Field PdfChunk[] detailChunks>
	//*   5    9:iload_2         
	//*   6   10:aaload          
	//*   7   11:aload_0         
	//*   8   12:getfield        #68  <Field char[] text>
	//*   9   15:iload_2         
	//*  10   16:caload          
	//*  11   17:invokevirtual   #235 <Method int PdfChunk.getUnicodeEquivalent(int)>
	//*  12   20:int2char        
	//*  13   21:invokestatic    #512 <Method boolean isWS(char)>
	//*  14   24:ifne            29
				return j;
	//   15   27:iload_2         
	//   16   28:ireturn         
			j--;
	//   17   29:iload_2         
	//   18   30:iconst_1        
	//   19   31:isub            
	//   20   32:istore_2        
		} while(true);
	//   21   33:goto            0
	}

	public int trimRightEx(int i, int j)
	{
		do
		{
			if(j < i)
				break;
	//    0    0:iload_2         
	//    1    1:iload_1         
	//    2    2:icmplt          99
			char c = (char)detailChunks[j].getUnicodeEquivalent(((int) (text[j])));
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field PdfChunk[] detailChunks>
	//    5    9:iload_2         
	//    6   10:aaload          
	//    7   11:aload_0         
	//    8   12:getfield        #68  <Field char[] text>
	//    9   15:iload_2         
	//   10   16:caload          
	//   11   17:invokevirtual   #235 <Method int PdfChunk.getUnicodeEquivalent(int)>
	//   12   20:int2char        
	//   13   21:istore_3        
			if(!isWS(c) && !PdfChunk.noPrint(((int) (c))) && (!detailChunks[j].isTab() || !detailChunks[j].isAttribute("TABSETTINGS") || !((Boolean)((Object[])(Object[])detailChunks[j].getAttribute("TAB"))[1]).booleanValue()))
				break;
	//   14   22:iload_3         
	//   15   23:invokestatic    #512 <Method boolean isWS(char)>
	//   16   26:ifne            92
	//   17   29:iload_3         
	//   18   30:invokestatic    #238 <Method boolean PdfChunk.noPrint(int)>
	//   19   33:ifne            92
	//   20   36:aload_0         
	//   21   37:getfield        #72  <Field PdfChunk[] detailChunks>
	//   22   40:iload_2         
	//   23   41:aaload          
	//   24   42:invokevirtual   #247 <Method boolean PdfChunk.isTab()>
	//   25   45:ifeq            99
	//   26   48:aload_0         
	//   27   49:getfield        #72  <Field PdfChunk[] detailChunks>
	//   28   52:iload_2         
	//   29   53:aaload          
	//   30   54:ldc2            #334 <String "TABSETTINGS">
	//   31   57:invokevirtual   #338 <Method boolean PdfChunk.isAttribute(String)>
	//   32   60:ifeq            99
	//   33   63:aload_0         
	//   34   64:getfield        #72  <Field PdfChunk[] detailChunks>
	//   35   67:iload_2         
	//   36   68:aaload          
	//   37   69:ldc2            #444 <String "TAB">
	//   38   72:invokevirtual   #448 <Method Object PdfChunk.getAttribute(String)>
	//   39   75:checkcast       #450 <Class Object[]>
	//   40   78:checkcast       #450 <Class Object[]>
	//   41   81:iconst_1        
	//   42   82:aaload          
	//   43   83:checkcast       #455 <Class Boolean>
	//   44   86:invokevirtual   #458 <Method boolean Boolean.booleanValue()>
	//   45   89:ifeq            99
			j--;
	//   46   92:iload_2         
	//   47   93:iconst_1        
	//   48   94:isub            
	//   49   95:istore_2        
		} while(true);
	//   50   96:goto            0
		return j;
	//   51   99:iload_2         
	//   52  100:ireturn         
	}

	protected static final IntHashtable mirrorChars;
	protected int arabicOptions;
	protected ArrayList chunks;
	protected int currentChar;
	protected PdfChunk detailChunks[];
	protected int indexChars[];
	protected int indexChunk;
	protected int indexChunkChar;
	protected boolean isWordSplit;
	protected byte orderLevels[];
	protected int pieceSize;
	protected int runDirection;
	protected boolean shortStore;
	protected int storedCurrentChar;
	protected PdfChunk storedDetailChunks[];
	protected int storedIndexChars[];
	protected int storedIndexChunk;
	protected int storedIndexChunkChar;
	protected byte storedOrderLevels[];
	protected int storedRunDirection;
	protected char storedText[];
	protected int storedTotalTextLength;
	protected char text[];
	protected int totalTextLength;

	static 
	{
		mirrorChars = new IntHashtable();
	//    0    0:new             #41  <Class IntHashtable>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void IntHashtable()>
	//    3    7:putstatic       #46  <Field IntHashtable mirrorChars>
		mirrorChars.put(40, 41);
	//    4   10:getstatic       #46  <Field IntHashtable mirrorChars>
	//    5   13:bipush          40
	//    6   15:bipush          41
	//    7   17:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//    8   20:pop             
		mirrorChars.put(41, 40);
	//    9   21:getstatic       #46  <Field IntHashtable mirrorChars>
	//   10   24:bipush          41
	//   11   26:bipush          40
	//   12   28:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   13   31:pop             
		mirrorChars.put(60, 62);
	//   14   32:getstatic       #46  <Field IntHashtable mirrorChars>
	//   15   35:bipush          60
	//   16   37:bipush          62
	//   17   39:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   18   42:pop             
		mirrorChars.put(62, 60);
	//   19   43:getstatic       #46  <Field IntHashtable mirrorChars>
	//   20   46:bipush          62
	//   21   48:bipush          60
	//   22   50:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   23   53:pop             
		mirrorChars.put(91, 93);
	//   24   54:getstatic       #46  <Field IntHashtable mirrorChars>
	//   25   57:bipush          91
	//   26   59:bipush          93
	//   27   61:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   28   64:pop             
		mirrorChars.put(93, 91);
	//   29   65:getstatic       #46  <Field IntHashtable mirrorChars>
	//   30   68:bipush          93
	//   31   70:bipush          91
	//   32   72:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   33   75:pop             
		mirrorChars.put(123, 125);
	//   34   76:getstatic       #46  <Field IntHashtable mirrorChars>
	//   35   79:bipush          123
	//   36   81:bipush          125
	//   37   83:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   38   86:pop             
		mirrorChars.put(125, 123);
	//   39   87:getstatic       #46  <Field IntHashtable mirrorChars>
	//   40   90:bipush          125
	//   41   92:bipush          123
	//   42   94:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   43   97:pop             
		mirrorChars.put(171, 187);
	//   44   98:getstatic       #46  <Field IntHashtable mirrorChars>
	//   45  101:sipush          171
	//   46  104:sipush          187
	//   47  107:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   48  110:pop             
		mirrorChars.put(187, 171);
	//   49  111:getstatic       #46  <Field IntHashtable mirrorChars>
	//   50  114:sipush          187
	//   51  117:sipush          171
	//   52  120:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   53  123:pop             
		mirrorChars.put(8249, 8250);
	//   54  124:getstatic       #46  <Field IntHashtable mirrorChars>
	//   55  127:sipush          8249
	//   56  130:sipush          8250
	//   57  133:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   58  136:pop             
		mirrorChars.put(8250, 8249);
	//   59  137:getstatic       #46  <Field IntHashtable mirrorChars>
	//   60  140:sipush          8250
	//   61  143:sipush          8249
	//   62  146:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   63  149:pop             
		mirrorChars.put(8261, 8262);
	//   64  150:getstatic       #46  <Field IntHashtable mirrorChars>
	//   65  153:sipush          8261
	//   66  156:sipush          8262
	//   67  159:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   68  162:pop             
		mirrorChars.put(8262, 8261);
	//   69  163:getstatic       #46  <Field IntHashtable mirrorChars>
	//   70  166:sipush          8262
	//   71  169:sipush          8261
	//   72  172:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   73  175:pop             
		mirrorChars.put(8317, 8318);
	//   74  176:getstatic       #46  <Field IntHashtable mirrorChars>
	//   75  179:sipush          8317
	//   76  182:sipush          8318
	//   77  185:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   78  188:pop             
		mirrorChars.put(8318, 8317);
	//   79  189:getstatic       #46  <Field IntHashtable mirrorChars>
	//   80  192:sipush          8318
	//   81  195:sipush          8317
	//   82  198:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   83  201:pop             
		mirrorChars.put(8333, 8334);
	//   84  202:getstatic       #46  <Field IntHashtable mirrorChars>
	//   85  205:sipush          8333
	//   86  208:sipush          8334
	//   87  211:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   88  214:pop             
		mirrorChars.put(8334, 8333);
	//   89  215:getstatic       #46  <Field IntHashtable mirrorChars>
	//   90  218:sipush          8334
	//   91  221:sipush          8333
	//   92  224:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   93  227:pop             
		mirrorChars.put(8712, 8715);
	//   94  228:getstatic       #46  <Field IntHashtable mirrorChars>
	//   95  231:sipush          8712
	//   96  234:sipush          8715
	//   97  237:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//   98  240:pop             
		mirrorChars.put(8713, 8716);
	//   99  241:getstatic       #46  <Field IntHashtable mirrorChars>
	//  100  244:sipush          8713
	//  101  247:sipush          8716
	//  102  250:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  103  253:pop             
		mirrorChars.put(8714, 8717);
	//  104  254:getstatic       #46  <Field IntHashtable mirrorChars>
	//  105  257:sipush          8714
	//  106  260:sipush          8717
	//  107  263:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  108  266:pop             
		mirrorChars.put(8715, 8712);
	//  109  267:getstatic       #46  <Field IntHashtable mirrorChars>
	//  110  270:sipush          8715
	//  111  273:sipush          8712
	//  112  276:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  113  279:pop             
		mirrorChars.put(8716, 8713);
	//  114  280:getstatic       #46  <Field IntHashtable mirrorChars>
	//  115  283:sipush          8716
	//  116  286:sipush          8713
	//  117  289:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  118  292:pop             
		mirrorChars.put(8717, 8714);
	//  119  293:getstatic       #46  <Field IntHashtable mirrorChars>
	//  120  296:sipush          8717
	//  121  299:sipush          8714
	//  122  302:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  123  305:pop             
		mirrorChars.put(8725, 10741);
	//  124  306:getstatic       #46  <Field IntHashtable mirrorChars>
	//  125  309:sipush          8725
	//  126  312:sipush          10741
	//  127  315:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  128  318:pop             
		mirrorChars.put(8764, 8765);
	//  129  319:getstatic       #46  <Field IntHashtable mirrorChars>
	//  130  322:sipush          8764
	//  131  325:sipush          8765
	//  132  328:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  133  331:pop             
		mirrorChars.put(8765, 8764);
	//  134  332:getstatic       #46  <Field IntHashtable mirrorChars>
	//  135  335:sipush          8765
	//  136  338:sipush          8764
	//  137  341:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  138  344:pop             
		mirrorChars.put(8771, 8909);
	//  139  345:getstatic       #46  <Field IntHashtable mirrorChars>
	//  140  348:sipush          8771
	//  141  351:sipush          8909
	//  142  354:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  143  357:pop             
		mirrorChars.put(8786, 8787);
	//  144  358:getstatic       #46  <Field IntHashtable mirrorChars>
	//  145  361:sipush          8786
	//  146  364:sipush          8787
	//  147  367:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  148  370:pop             
		mirrorChars.put(8787, 8786);
	//  149  371:getstatic       #46  <Field IntHashtable mirrorChars>
	//  150  374:sipush          8787
	//  151  377:sipush          8786
	//  152  380:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  153  383:pop             
		mirrorChars.put(8788, 8789);
	//  154  384:getstatic       #46  <Field IntHashtable mirrorChars>
	//  155  387:sipush          8788
	//  156  390:sipush          8789
	//  157  393:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  158  396:pop             
		mirrorChars.put(8789, 8788);
	//  159  397:getstatic       #46  <Field IntHashtable mirrorChars>
	//  160  400:sipush          8789
	//  161  403:sipush          8788
	//  162  406:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  163  409:pop             
		mirrorChars.put(8804, 8805);
	//  164  410:getstatic       #46  <Field IntHashtable mirrorChars>
	//  165  413:sipush          8804
	//  166  416:sipush          8805
	//  167  419:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  168  422:pop             
		mirrorChars.put(8805, 8804);
	//  169  423:getstatic       #46  <Field IntHashtable mirrorChars>
	//  170  426:sipush          8805
	//  171  429:sipush          8804
	//  172  432:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  173  435:pop             
		mirrorChars.put(8806, 8807);
	//  174  436:getstatic       #46  <Field IntHashtable mirrorChars>
	//  175  439:sipush          8806
	//  176  442:sipush          8807
	//  177  445:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  178  448:pop             
		mirrorChars.put(8807, 8806);
	//  179  449:getstatic       #46  <Field IntHashtable mirrorChars>
	//  180  452:sipush          8807
	//  181  455:sipush          8806
	//  182  458:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  183  461:pop             
		mirrorChars.put(8808, 8809);
	//  184  462:getstatic       #46  <Field IntHashtable mirrorChars>
	//  185  465:sipush          8808
	//  186  468:sipush          8809
	//  187  471:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  188  474:pop             
		mirrorChars.put(8809, 8808);
	//  189  475:getstatic       #46  <Field IntHashtable mirrorChars>
	//  190  478:sipush          8809
	//  191  481:sipush          8808
	//  192  484:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  193  487:pop             
		mirrorChars.put(8810, 8811);
	//  194  488:getstatic       #46  <Field IntHashtable mirrorChars>
	//  195  491:sipush          8810
	//  196  494:sipush          8811
	//  197  497:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  198  500:pop             
		mirrorChars.put(8811, 8810);
	//  199  501:getstatic       #46  <Field IntHashtable mirrorChars>
	//  200  504:sipush          8811
	//  201  507:sipush          8810
	//  202  510:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  203  513:pop             
		mirrorChars.put(8814, 8815);
	//  204  514:getstatic       #46  <Field IntHashtable mirrorChars>
	//  205  517:sipush          8814
	//  206  520:sipush          8815
	//  207  523:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  208  526:pop             
		mirrorChars.put(8815, 8814);
	//  209  527:getstatic       #46  <Field IntHashtable mirrorChars>
	//  210  530:sipush          8815
	//  211  533:sipush          8814
	//  212  536:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  213  539:pop             
		mirrorChars.put(8816, 8817);
	//  214  540:getstatic       #46  <Field IntHashtable mirrorChars>
	//  215  543:sipush          8816
	//  216  546:sipush          8817
	//  217  549:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  218  552:pop             
		mirrorChars.put(8817, 8816);
	//  219  553:getstatic       #46  <Field IntHashtable mirrorChars>
	//  220  556:sipush          8817
	//  221  559:sipush          8816
	//  222  562:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  223  565:pop             
		mirrorChars.put(8818, 8819);
	//  224  566:getstatic       #46  <Field IntHashtable mirrorChars>
	//  225  569:sipush          8818
	//  226  572:sipush          8819
	//  227  575:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  228  578:pop             
		mirrorChars.put(8819, 8818);
	//  229  579:getstatic       #46  <Field IntHashtable mirrorChars>
	//  230  582:sipush          8819
	//  231  585:sipush          8818
	//  232  588:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  233  591:pop             
		mirrorChars.put(8820, 8821);
	//  234  592:getstatic       #46  <Field IntHashtable mirrorChars>
	//  235  595:sipush          8820
	//  236  598:sipush          8821
	//  237  601:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  238  604:pop             
		mirrorChars.put(8821, 8820);
	//  239  605:getstatic       #46  <Field IntHashtable mirrorChars>
	//  240  608:sipush          8821
	//  241  611:sipush          8820
	//  242  614:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  243  617:pop             
		mirrorChars.put(8822, 8823);
	//  244  618:getstatic       #46  <Field IntHashtable mirrorChars>
	//  245  621:sipush          8822
	//  246  624:sipush          8823
	//  247  627:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  248  630:pop             
		mirrorChars.put(8823, 8822);
	//  249  631:getstatic       #46  <Field IntHashtable mirrorChars>
	//  250  634:sipush          8823
	//  251  637:sipush          8822
	//  252  640:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  253  643:pop             
		mirrorChars.put(8824, 8825);
	//  254  644:getstatic       #46  <Field IntHashtable mirrorChars>
	//  255  647:sipush          8824
	//  256  650:sipush          8825
	//  257  653:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  258  656:pop             
		mirrorChars.put(8825, 8824);
	//  259  657:getstatic       #46  <Field IntHashtable mirrorChars>
	//  260  660:sipush          8825
	//  261  663:sipush          8824
	//  262  666:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  263  669:pop             
		mirrorChars.put(8826, 8827);
	//  264  670:getstatic       #46  <Field IntHashtable mirrorChars>
	//  265  673:sipush          8826
	//  266  676:sipush          8827
	//  267  679:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  268  682:pop             
		mirrorChars.put(8827, 8826);
	//  269  683:getstatic       #46  <Field IntHashtable mirrorChars>
	//  270  686:sipush          8827
	//  271  689:sipush          8826
	//  272  692:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  273  695:pop             
		mirrorChars.put(8828, 8829);
	//  274  696:getstatic       #46  <Field IntHashtable mirrorChars>
	//  275  699:sipush          8828
	//  276  702:sipush          8829
	//  277  705:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  278  708:pop             
		mirrorChars.put(8829, 8828);
	//  279  709:getstatic       #46  <Field IntHashtable mirrorChars>
	//  280  712:sipush          8829
	//  281  715:sipush          8828
	//  282  718:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  283  721:pop             
		mirrorChars.put(8830, 8831);
	//  284  722:getstatic       #46  <Field IntHashtable mirrorChars>
	//  285  725:sipush          8830
	//  286  728:sipush          8831
	//  287  731:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  288  734:pop             
		mirrorChars.put(8831, 8830);
	//  289  735:getstatic       #46  <Field IntHashtable mirrorChars>
	//  290  738:sipush          8831
	//  291  741:sipush          8830
	//  292  744:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  293  747:pop             
		mirrorChars.put(8832, 8833);
	//  294  748:getstatic       #46  <Field IntHashtable mirrorChars>
	//  295  751:sipush          8832
	//  296  754:sipush          8833
	//  297  757:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  298  760:pop             
		mirrorChars.put(8833, 8832);
	//  299  761:getstatic       #46  <Field IntHashtable mirrorChars>
	//  300  764:sipush          8833
	//  301  767:sipush          8832
	//  302  770:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  303  773:pop             
		mirrorChars.put(8834, 8835);
	//  304  774:getstatic       #46  <Field IntHashtable mirrorChars>
	//  305  777:sipush          8834
	//  306  780:sipush          8835
	//  307  783:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  308  786:pop             
		mirrorChars.put(8835, 8834);
	//  309  787:getstatic       #46  <Field IntHashtable mirrorChars>
	//  310  790:sipush          8835
	//  311  793:sipush          8834
	//  312  796:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  313  799:pop             
		mirrorChars.put(8836, 8837);
	//  314  800:getstatic       #46  <Field IntHashtable mirrorChars>
	//  315  803:sipush          8836
	//  316  806:sipush          8837
	//  317  809:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  318  812:pop             
		mirrorChars.put(8837, 8836);
	//  319  813:getstatic       #46  <Field IntHashtable mirrorChars>
	//  320  816:sipush          8837
	//  321  819:sipush          8836
	//  322  822:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  323  825:pop             
		mirrorChars.put(8838, 8839);
	//  324  826:getstatic       #46  <Field IntHashtable mirrorChars>
	//  325  829:sipush          8838
	//  326  832:sipush          8839
	//  327  835:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  328  838:pop             
		mirrorChars.put(8839, 8838);
	//  329  839:getstatic       #46  <Field IntHashtable mirrorChars>
	//  330  842:sipush          8839
	//  331  845:sipush          8838
	//  332  848:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  333  851:pop             
		mirrorChars.put(8840, 8841);
	//  334  852:getstatic       #46  <Field IntHashtable mirrorChars>
	//  335  855:sipush          8840
	//  336  858:sipush          8841
	//  337  861:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  338  864:pop             
		mirrorChars.put(8841, 8840);
	//  339  865:getstatic       #46  <Field IntHashtable mirrorChars>
	//  340  868:sipush          8841
	//  341  871:sipush          8840
	//  342  874:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  343  877:pop             
		mirrorChars.put(8842, 8843);
	//  344  878:getstatic       #46  <Field IntHashtable mirrorChars>
	//  345  881:sipush          8842
	//  346  884:sipush          8843
	//  347  887:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  348  890:pop             
		mirrorChars.put(8843, 8842);
	//  349  891:getstatic       #46  <Field IntHashtable mirrorChars>
	//  350  894:sipush          8843
	//  351  897:sipush          8842
	//  352  900:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  353  903:pop             
		mirrorChars.put(8847, 8848);
	//  354  904:getstatic       #46  <Field IntHashtable mirrorChars>
	//  355  907:sipush          8847
	//  356  910:sipush          8848
	//  357  913:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  358  916:pop             
		mirrorChars.put(8848, 8847);
	//  359  917:getstatic       #46  <Field IntHashtable mirrorChars>
	//  360  920:sipush          8848
	//  361  923:sipush          8847
	//  362  926:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  363  929:pop             
		mirrorChars.put(8849, 8850);
	//  364  930:getstatic       #46  <Field IntHashtable mirrorChars>
	//  365  933:sipush          8849
	//  366  936:sipush          8850
	//  367  939:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  368  942:pop             
		mirrorChars.put(8850, 8849);
	//  369  943:getstatic       #46  <Field IntHashtable mirrorChars>
	//  370  946:sipush          8850
	//  371  949:sipush          8849
	//  372  952:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  373  955:pop             
		mirrorChars.put(8856, 10680);
	//  374  956:getstatic       #46  <Field IntHashtable mirrorChars>
	//  375  959:sipush          8856
	//  376  962:sipush          10680
	//  377  965:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  378  968:pop             
		mirrorChars.put(8866, 8867);
	//  379  969:getstatic       #46  <Field IntHashtable mirrorChars>
	//  380  972:sipush          8866
	//  381  975:sipush          8867
	//  382  978:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  383  981:pop             
		mirrorChars.put(8867, 8866);
	//  384  982:getstatic       #46  <Field IntHashtable mirrorChars>
	//  385  985:sipush          8867
	//  386  988:sipush          8866
	//  387  991:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  388  994:pop             
		mirrorChars.put(8870, 10974);
	//  389  995:getstatic       #46  <Field IntHashtable mirrorChars>
	//  390  998:sipush          8870
	//  391 1001:sipush          10974
	//  392 1004:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  393 1007:pop             
		mirrorChars.put(8872, 10980);
	//  394 1008:getstatic       #46  <Field IntHashtable mirrorChars>
	//  395 1011:sipush          8872
	//  396 1014:sipush          10980
	//  397 1017:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  398 1020:pop             
		mirrorChars.put(8873, 10979);
	//  399 1021:getstatic       #46  <Field IntHashtable mirrorChars>
	//  400 1024:sipush          8873
	//  401 1027:sipush          10979
	//  402 1030:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  403 1033:pop             
		mirrorChars.put(8875, 10981);
	//  404 1034:getstatic       #46  <Field IntHashtable mirrorChars>
	//  405 1037:sipush          8875
	//  406 1040:sipush          10981
	//  407 1043:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  408 1046:pop             
		mirrorChars.put(8880, 8881);
	//  409 1047:getstatic       #46  <Field IntHashtable mirrorChars>
	//  410 1050:sipush          8880
	//  411 1053:sipush          8881
	//  412 1056:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  413 1059:pop             
		mirrorChars.put(8881, 8880);
	//  414 1060:getstatic       #46  <Field IntHashtable mirrorChars>
	//  415 1063:sipush          8881
	//  416 1066:sipush          8880
	//  417 1069:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  418 1072:pop             
		mirrorChars.put(8882, 8883);
	//  419 1073:getstatic       #46  <Field IntHashtable mirrorChars>
	//  420 1076:sipush          8882
	//  421 1079:sipush          8883
	//  422 1082:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  423 1085:pop             
		mirrorChars.put(8883, 8882);
	//  424 1086:getstatic       #46  <Field IntHashtable mirrorChars>
	//  425 1089:sipush          8883
	//  426 1092:sipush          8882
	//  427 1095:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  428 1098:pop             
		mirrorChars.put(8884, 8885);
	//  429 1099:getstatic       #46  <Field IntHashtable mirrorChars>
	//  430 1102:sipush          8884
	//  431 1105:sipush          8885
	//  432 1108:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  433 1111:pop             
		mirrorChars.put(8885, 8884);
	//  434 1112:getstatic       #46  <Field IntHashtable mirrorChars>
	//  435 1115:sipush          8885
	//  436 1118:sipush          8884
	//  437 1121:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  438 1124:pop             
		mirrorChars.put(8886, 8887);
	//  439 1125:getstatic       #46  <Field IntHashtable mirrorChars>
	//  440 1128:sipush          8886
	//  441 1131:sipush          8887
	//  442 1134:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  443 1137:pop             
		mirrorChars.put(8887, 8886);
	//  444 1138:getstatic       #46  <Field IntHashtable mirrorChars>
	//  445 1141:sipush          8887
	//  446 1144:sipush          8886
	//  447 1147:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  448 1150:pop             
		mirrorChars.put(8905, 8906);
	//  449 1151:getstatic       #46  <Field IntHashtable mirrorChars>
	//  450 1154:sipush          8905
	//  451 1157:sipush          8906
	//  452 1160:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  453 1163:pop             
		mirrorChars.put(8906, 8905);
	//  454 1164:getstatic       #46  <Field IntHashtable mirrorChars>
	//  455 1167:sipush          8906
	//  456 1170:sipush          8905
	//  457 1173:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  458 1176:pop             
		mirrorChars.put(8907, 8908);
	//  459 1177:getstatic       #46  <Field IntHashtable mirrorChars>
	//  460 1180:sipush          8907
	//  461 1183:sipush          8908
	//  462 1186:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  463 1189:pop             
		mirrorChars.put(8908, 8907);
	//  464 1190:getstatic       #46  <Field IntHashtable mirrorChars>
	//  465 1193:sipush          8908
	//  466 1196:sipush          8907
	//  467 1199:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  468 1202:pop             
		mirrorChars.put(8909, 8771);
	//  469 1203:getstatic       #46  <Field IntHashtable mirrorChars>
	//  470 1206:sipush          8909
	//  471 1209:sipush          8771
	//  472 1212:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  473 1215:pop             
		mirrorChars.put(8912, 8913);
	//  474 1216:getstatic       #46  <Field IntHashtable mirrorChars>
	//  475 1219:sipush          8912
	//  476 1222:sipush          8913
	//  477 1225:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  478 1228:pop             
		mirrorChars.put(8913, 8912);
	//  479 1229:getstatic       #46  <Field IntHashtable mirrorChars>
	//  480 1232:sipush          8913
	//  481 1235:sipush          8912
	//  482 1238:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  483 1241:pop             
		mirrorChars.put(8918, 8919);
	//  484 1242:getstatic       #46  <Field IntHashtable mirrorChars>
	//  485 1245:sipush          8918
	//  486 1248:sipush          8919
	//  487 1251:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  488 1254:pop             
		mirrorChars.put(8919, 8918);
	//  489 1255:getstatic       #46  <Field IntHashtable mirrorChars>
	//  490 1258:sipush          8919
	//  491 1261:sipush          8918
	//  492 1264:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  493 1267:pop             
		mirrorChars.put(8920, 8921);
	//  494 1268:getstatic       #46  <Field IntHashtable mirrorChars>
	//  495 1271:sipush          8920
	//  496 1274:sipush          8921
	//  497 1277:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  498 1280:pop             
		mirrorChars.put(8921, 8920);
	//  499 1281:getstatic       #46  <Field IntHashtable mirrorChars>
	//  500 1284:sipush          8921
	//  501 1287:sipush          8920
	//  502 1290:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  503 1293:pop             
		mirrorChars.put(8922, 8923);
	//  504 1294:getstatic       #46  <Field IntHashtable mirrorChars>
	//  505 1297:sipush          8922
	//  506 1300:sipush          8923
	//  507 1303:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  508 1306:pop             
		mirrorChars.put(8923, 8922);
	//  509 1307:getstatic       #46  <Field IntHashtable mirrorChars>
	//  510 1310:sipush          8923
	//  511 1313:sipush          8922
	//  512 1316:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  513 1319:pop             
		mirrorChars.put(8924, 8925);
	//  514 1320:getstatic       #46  <Field IntHashtable mirrorChars>
	//  515 1323:sipush          8924
	//  516 1326:sipush          8925
	//  517 1329:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  518 1332:pop             
		mirrorChars.put(8925, 8924);
	//  519 1333:getstatic       #46  <Field IntHashtable mirrorChars>
	//  520 1336:sipush          8925
	//  521 1339:sipush          8924
	//  522 1342:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  523 1345:pop             
		mirrorChars.put(8926, 8927);
	//  524 1346:getstatic       #46  <Field IntHashtable mirrorChars>
	//  525 1349:sipush          8926
	//  526 1352:sipush          8927
	//  527 1355:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  528 1358:pop             
		mirrorChars.put(8927, 8926);
	//  529 1359:getstatic       #46  <Field IntHashtable mirrorChars>
	//  530 1362:sipush          8927
	//  531 1365:sipush          8926
	//  532 1368:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  533 1371:pop             
		mirrorChars.put(8928, 8929);
	//  534 1372:getstatic       #46  <Field IntHashtable mirrorChars>
	//  535 1375:sipush          8928
	//  536 1378:sipush          8929
	//  537 1381:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  538 1384:pop             
		mirrorChars.put(8929, 8928);
	//  539 1385:getstatic       #46  <Field IntHashtable mirrorChars>
	//  540 1388:sipush          8929
	//  541 1391:sipush          8928
	//  542 1394:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  543 1397:pop             
		mirrorChars.put(8930, 8931);
	//  544 1398:getstatic       #46  <Field IntHashtable mirrorChars>
	//  545 1401:sipush          8930
	//  546 1404:sipush          8931
	//  547 1407:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  548 1410:pop             
		mirrorChars.put(8931, 8930);
	//  549 1411:getstatic       #46  <Field IntHashtable mirrorChars>
	//  550 1414:sipush          8931
	//  551 1417:sipush          8930
	//  552 1420:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  553 1423:pop             
		mirrorChars.put(8932, 8933);
	//  554 1424:getstatic       #46  <Field IntHashtable mirrorChars>
	//  555 1427:sipush          8932
	//  556 1430:sipush          8933
	//  557 1433:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  558 1436:pop             
		mirrorChars.put(8933, 8932);
	//  559 1437:getstatic       #46  <Field IntHashtable mirrorChars>
	//  560 1440:sipush          8933
	//  561 1443:sipush          8932
	//  562 1446:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  563 1449:pop             
		mirrorChars.put(8934, 8935);
	//  564 1450:getstatic       #46  <Field IntHashtable mirrorChars>
	//  565 1453:sipush          8934
	//  566 1456:sipush          8935
	//  567 1459:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  568 1462:pop             
		mirrorChars.put(8935, 8934);
	//  569 1463:getstatic       #46  <Field IntHashtable mirrorChars>
	//  570 1466:sipush          8935
	//  571 1469:sipush          8934
	//  572 1472:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  573 1475:pop             
		mirrorChars.put(8936, 8937);
	//  574 1476:getstatic       #46  <Field IntHashtable mirrorChars>
	//  575 1479:sipush          8936
	//  576 1482:sipush          8937
	//  577 1485:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  578 1488:pop             
		mirrorChars.put(8937, 8936);
	//  579 1489:getstatic       #46  <Field IntHashtable mirrorChars>
	//  580 1492:sipush          8937
	//  581 1495:sipush          8936
	//  582 1498:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  583 1501:pop             
		mirrorChars.put(8938, 8939);
	//  584 1502:getstatic       #46  <Field IntHashtable mirrorChars>
	//  585 1505:sipush          8938
	//  586 1508:sipush          8939
	//  587 1511:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  588 1514:pop             
		mirrorChars.put(8939, 8938);
	//  589 1515:getstatic       #46  <Field IntHashtable mirrorChars>
	//  590 1518:sipush          8939
	//  591 1521:sipush          8938
	//  592 1524:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  593 1527:pop             
		mirrorChars.put(8940, 8941);
	//  594 1528:getstatic       #46  <Field IntHashtable mirrorChars>
	//  595 1531:sipush          8940
	//  596 1534:sipush          8941
	//  597 1537:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  598 1540:pop             
		mirrorChars.put(8941, 8940);
	//  599 1541:getstatic       #46  <Field IntHashtable mirrorChars>
	//  600 1544:sipush          8941
	//  601 1547:sipush          8940
	//  602 1550:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  603 1553:pop             
		mirrorChars.put(8944, 8945);
	//  604 1554:getstatic       #46  <Field IntHashtable mirrorChars>
	//  605 1557:sipush          8944
	//  606 1560:sipush          8945
	//  607 1563:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  608 1566:pop             
		mirrorChars.put(8945, 8944);
	//  609 1567:getstatic       #46  <Field IntHashtable mirrorChars>
	//  610 1570:sipush          8945
	//  611 1573:sipush          8944
	//  612 1576:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  613 1579:pop             
		mirrorChars.put(8946, 8954);
	//  614 1580:getstatic       #46  <Field IntHashtable mirrorChars>
	//  615 1583:sipush          8946
	//  616 1586:sipush          8954
	//  617 1589:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  618 1592:pop             
		mirrorChars.put(8947, 8955);
	//  619 1593:getstatic       #46  <Field IntHashtable mirrorChars>
	//  620 1596:sipush          8947
	//  621 1599:sipush          8955
	//  622 1602:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  623 1605:pop             
		mirrorChars.put(8948, 8956);
	//  624 1606:getstatic       #46  <Field IntHashtable mirrorChars>
	//  625 1609:sipush          8948
	//  626 1612:sipush          8956
	//  627 1615:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  628 1618:pop             
		mirrorChars.put(8950, 8957);
	//  629 1619:getstatic       #46  <Field IntHashtable mirrorChars>
	//  630 1622:sipush          8950
	//  631 1625:sipush          8957
	//  632 1628:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  633 1631:pop             
		mirrorChars.put(8951, 8958);
	//  634 1632:getstatic       #46  <Field IntHashtable mirrorChars>
	//  635 1635:sipush          8951
	//  636 1638:sipush          8958
	//  637 1641:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  638 1644:pop             
		mirrorChars.put(8954, 8946);
	//  639 1645:getstatic       #46  <Field IntHashtable mirrorChars>
	//  640 1648:sipush          8954
	//  641 1651:sipush          8946
	//  642 1654:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  643 1657:pop             
		mirrorChars.put(8955, 8947);
	//  644 1658:getstatic       #46  <Field IntHashtable mirrorChars>
	//  645 1661:sipush          8955
	//  646 1664:sipush          8947
	//  647 1667:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  648 1670:pop             
		mirrorChars.put(8956, 8948);
	//  649 1671:getstatic       #46  <Field IntHashtable mirrorChars>
	//  650 1674:sipush          8956
	//  651 1677:sipush          8948
	//  652 1680:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  653 1683:pop             
		mirrorChars.put(8957, 8950);
	//  654 1684:getstatic       #46  <Field IntHashtable mirrorChars>
	//  655 1687:sipush          8957
	//  656 1690:sipush          8950
	//  657 1693:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  658 1696:pop             
		mirrorChars.put(8958, 8951);
	//  659 1697:getstatic       #46  <Field IntHashtable mirrorChars>
	//  660 1700:sipush          8958
	//  661 1703:sipush          8951
	//  662 1706:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  663 1709:pop             
		mirrorChars.put(8968, 8969);
	//  664 1710:getstatic       #46  <Field IntHashtable mirrorChars>
	//  665 1713:sipush          8968
	//  666 1716:sipush          8969
	//  667 1719:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  668 1722:pop             
		mirrorChars.put(8969, 8968);
	//  669 1723:getstatic       #46  <Field IntHashtable mirrorChars>
	//  670 1726:sipush          8969
	//  671 1729:sipush          8968
	//  672 1732:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  673 1735:pop             
		mirrorChars.put(8970, 8971);
	//  674 1736:getstatic       #46  <Field IntHashtable mirrorChars>
	//  675 1739:sipush          8970
	//  676 1742:sipush          8971
	//  677 1745:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  678 1748:pop             
		mirrorChars.put(8971, 8970);
	//  679 1749:getstatic       #46  <Field IntHashtable mirrorChars>
	//  680 1752:sipush          8971
	//  681 1755:sipush          8970
	//  682 1758:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  683 1761:pop             
		mirrorChars.put(9001, 9002);
	//  684 1762:getstatic       #46  <Field IntHashtable mirrorChars>
	//  685 1765:sipush          9001
	//  686 1768:sipush          9002
	//  687 1771:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  688 1774:pop             
		mirrorChars.put(9002, 9001);
	//  689 1775:getstatic       #46  <Field IntHashtable mirrorChars>
	//  690 1778:sipush          9002
	//  691 1781:sipush          9001
	//  692 1784:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  693 1787:pop             
		mirrorChars.put(10088, 10089);
	//  694 1788:getstatic       #46  <Field IntHashtable mirrorChars>
	//  695 1791:sipush          10088
	//  696 1794:sipush          10089
	//  697 1797:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  698 1800:pop             
		mirrorChars.put(10089, 10088);
	//  699 1801:getstatic       #46  <Field IntHashtable mirrorChars>
	//  700 1804:sipush          10089
	//  701 1807:sipush          10088
	//  702 1810:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  703 1813:pop             
		mirrorChars.put(10090, 10091);
	//  704 1814:getstatic       #46  <Field IntHashtable mirrorChars>
	//  705 1817:sipush          10090
	//  706 1820:sipush          10091
	//  707 1823:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  708 1826:pop             
		mirrorChars.put(10091, 10090);
	//  709 1827:getstatic       #46  <Field IntHashtable mirrorChars>
	//  710 1830:sipush          10091
	//  711 1833:sipush          10090
	//  712 1836:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  713 1839:pop             
		mirrorChars.put(10092, 10093);
	//  714 1840:getstatic       #46  <Field IntHashtable mirrorChars>
	//  715 1843:sipush          10092
	//  716 1846:sipush          10093
	//  717 1849:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  718 1852:pop             
		mirrorChars.put(10093, 10092);
	//  719 1853:getstatic       #46  <Field IntHashtable mirrorChars>
	//  720 1856:sipush          10093
	//  721 1859:sipush          10092
	//  722 1862:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  723 1865:pop             
		mirrorChars.put(10094, 10095);
	//  724 1866:getstatic       #46  <Field IntHashtable mirrorChars>
	//  725 1869:sipush          10094
	//  726 1872:sipush          10095
	//  727 1875:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  728 1878:pop             
		mirrorChars.put(10095, 10094);
	//  729 1879:getstatic       #46  <Field IntHashtable mirrorChars>
	//  730 1882:sipush          10095
	//  731 1885:sipush          10094
	//  732 1888:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  733 1891:pop             
		mirrorChars.put(10096, 10097);
	//  734 1892:getstatic       #46  <Field IntHashtable mirrorChars>
	//  735 1895:sipush          10096
	//  736 1898:sipush          10097
	//  737 1901:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  738 1904:pop             
		mirrorChars.put(10097, 10096);
	//  739 1905:getstatic       #46  <Field IntHashtable mirrorChars>
	//  740 1908:sipush          10097
	//  741 1911:sipush          10096
	//  742 1914:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  743 1917:pop             
		mirrorChars.put(10098, 10099);
	//  744 1918:getstatic       #46  <Field IntHashtable mirrorChars>
	//  745 1921:sipush          10098
	//  746 1924:sipush          10099
	//  747 1927:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  748 1930:pop             
		mirrorChars.put(10099, 10098);
	//  749 1931:getstatic       #46  <Field IntHashtable mirrorChars>
	//  750 1934:sipush          10099
	//  751 1937:sipush          10098
	//  752 1940:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  753 1943:pop             
		mirrorChars.put(10100, 10101);
	//  754 1944:getstatic       #46  <Field IntHashtable mirrorChars>
	//  755 1947:sipush          10100
	//  756 1950:sipush          10101
	//  757 1953:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  758 1956:pop             
		mirrorChars.put(10101, 10100);
	//  759 1957:getstatic       #46  <Field IntHashtable mirrorChars>
	//  760 1960:sipush          10101
	//  761 1963:sipush          10100
	//  762 1966:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  763 1969:pop             
		mirrorChars.put(10197, 10198);
	//  764 1970:getstatic       #46  <Field IntHashtable mirrorChars>
	//  765 1973:sipush          10197
	//  766 1976:sipush          10198
	//  767 1979:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  768 1982:pop             
		mirrorChars.put(10198, 10197);
	//  769 1983:getstatic       #46  <Field IntHashtable mirrorChars>
	//  770 1986:sipush          10198
	//  771 1989:sipush          10197
	//  772 1992:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  773 1995:pop             
		mirrorChars.put(10205, 10206);
	//  774 1996:getstatic       #46  <Field IntHashtable mirrorChars>
	//  775 1999:sipush          10205
	//  776 2002:sipush          10206
	//  777 2005:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  778 2008:pop             
		mirrorChars.put(10206, 10205);
	//  779 2009:getstatic       #46  <Field IntHashtable mirrorChars>
	//  780 2012:sipush          10206
	//  781 2015:sipush          10205
	//  782 2018:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  783 2021:pop             
		mirrorChars.put(10210, 10211);
	//  784 2022:getstatic       #46  <Field IntHashtable mirrorChars>
	//  785 2025:sipush          10210
	//  786 2028:sipush          10211
	//  787 2031:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  788 2034:pop             
		mirrorChars.put(10211, 10210);
	//  789 2035:getstatic       #46  <Field IntHashtable mirrorChars>
	//  790 2038:sipush          10211
	//  791 2041:sipush          10210
	//  792 2044:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  793 2047:pop             
		mirrorChars.put(10212, 10213);
	//  794 2048:getstatic       #46  <Field IntHashtable mirrorChars>
	//  795 2051:sipush          10212
	//  796 2054:sipush          10213
	//  797 2057:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  798 2060:pop             
		mirrorChars.put(10213, 10212);
	//  799 2061:getstatic       #46  <Field IntHashtable mirrorChars>
	//  800 2064:sipush          10213
	//  801 2067:sipush          10212
	//  802 2070:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  803 2073:pop             
		mirrorChars.put(10214, 10215);
	//  804 2074:getstatic       #46  <Field IntHashtable mirrorChars>
	//  805 2077:sipush          10214
	//  806 2080:sipush          10215
	//  807 2083:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  808 2086:pop             
		mirrorChars.put(10215, 10214);
	//  809 2087:getstatic       #46  <Field IntHashtable mirrorChars>
	//  810 2090:sipush          10215
	//  811 2093:sipush          10214
	//  812 2096:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  813 2099:pop             
		mirrorChars.put(10216, 10217);
	//  814 2100:getstatic       #46  <Field IntHashtable mirrorChars>
	//  815 2103:sipush          10216
	//  816 2106:sipush          10217
	//  817 2109:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  818 2112:pop             
		mirrorChars.put(10217, 10216);
	//  819 2113:getstatic       #46  <Field IntHashtable mirrorChars>
	//  820 2116:sipush          10217
	//  821 2119:sipush          10216
	//  822 2122:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  823 2125:pop             
		mirrorChars.put(10218, 10219);
	//  824 2126:getstatic       #46  <Field IntHashtable mirrorChars>
	//  825 2129:sipush          10218
	//  826 2132:sipush          10219
	//  827 2135:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  828 2138:pop             
		mirrorChars.put(10219, 10218);
	//  829 2139:getstatic       #46  <Field IntHashtable mirrorChars>
	//  830 2142:sipush          10219
	//  831 2145:sipush          10218
	//  832 2148:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  833 2151:pop             
		mirrorChars.put(10627, 10628);
	//  834 2152:getstatic       #46  <Field IntHashtable mirrorChars>
	//  835 2155:sipush          10627
	//  836 2158:sipush          10628
	//  837 2161:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  838 2164:pop             
		mirrorChars.put(10628, 10627);
	//  839 2165:getstatic       #46  <Field IntHashtable mirrorChars>
	//  840 2168:sipush          10628
	//  841 2171:sipush          10627
	//  842 2174:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  843 2177:pop             
		mirrorChars.put(10629, 10630);
	//  844 2178:getstatic       #46  <Field IntHashtable mirrorChars>
	//  845 2181:sipush          10629
	//  846 2184:sipush          10630
	//  847 2187:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  848 2190:pop             
		mirrorChars.put(10630, 10629);
	//  849 2191:getstatic       #46  <Field IntHashtable mirrorChars>
	//  850 2194:sipush          10630
	//  851 2197:sipush          10629
	//  852 2200:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  853 2203:pop             
		mirrorChars.put(10631, 10632);
	//  854 2204:getstatic       #46  <Field IntHashtable mirrorChars>
	//  855 2207:sipush          10631
	//  856 2210:sipush          10632
	//  857 2213:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  858 2216:pop             
		mirrorChars.put(10632, 10631);
	//  859 2217:getstatic       #46  <Field IntHashtable mirrorChars>
	//  860 2220:sipush          10632
	//  861 2223:sipush          10631
	//  862 2226:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  863 2229:pop             
		mirrorChars.put(10633, 10634);
	//  864 2230:getstatic       #46  <Field IntHashtable mirrorChars>
	//  865 2233:sipush          10633
	//  866 2236:sipush          10634
	//  867 2239:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  868 2242:pop             
		mirrorChars.put(10634, 10633);
	//  869 2243:getstatic       #46  <Field IntHashtable mirrorChars>
	//  870 2246:sipush          10634
	//  871 2249:sipush          10633
	//  872 2252:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  873 2255:pop             
		mirrorChars.put(10635, 10636);
	//  874 2256:getstatic       #46  <Field IntHashtable mirrorChars>
	//  875 2259:sipush          10635
	//  876 2262:sipush          10636
	//  877 2265:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  878 2268:pop             
		mirrorChars.put(10636, 10635);
	//  879 2269:getstatic       #46  <Field IntHashtable mirrorChars>
	//  880 2272:sipush          10636
	//  881 2275:sipush          10635
	//  882 2278:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  883 2281:pop             
		mirrorChars.put(10637, 10640);
	//  884 2282:getstatic       #46  <Field IntHashtable mirrorChars>
	//  885 2285:sipush          10637
	//  886 2288:sipush          10640
	//  887 2291:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  888 2294:pop             
		mirrorChars.put(10638, 10639);
	//  889 2295:getstatic       #46  <Field IntHashtable mirrorChars>
	//  890 2298:sipush          10638
	//  891 2301:sipush          10639
	//  892 2304:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  893 2307:pop             
		mirrorChars.put(10639, 10638);
	//  894 2308:getstatic       #46  <Field IntHashtable mirrorChars>
	//  895 2311:sipush          10639
	//  896 2314:sipush          10638
	//  897 2317:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  898 2320:pop             
		mirrorChars.put(10640, 10637);
	//  899 2321:getstatic       #46  <Field IntHashtable mirrorChars>
	//  900 2324:sipush          10640
	//  901 2327:sipush          10637
	//  902 2330:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  903 2333:pop             
		mirrorChars.put(10641, 10642);
	//  904 2334:getstatic       #46  <Field IntHashtable mirrorChars>
	//  905 2337:sipush          10641
	//  906 2340:sipush          10642
	//  907 2343:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  908 2346:pop             
		mirrorChars.put(10642, 10641);
	//  909 2347:getstatic       #46  <Field IntHashtable mirrorChars>
	//  910 2350:sipush          10642
	//  911 2353:sipush          10641
	//  912 2356:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  913 2359:pop             
		mirrorChars.put(10643, 10644);
	//  914 2360:getstatic       #46  <Field IntHashtable mirrorChars>
	//  915 2363:sipush          10643
	//  916 2366:sipush          10644
	//  917 2369:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  918 2372:pop             
		mirrorChars.put(10644, 10643);
	//  919 2373:getstatic       #46  <Field IntHashtable mirrorChars>
	//  920 2376:sipush          10644
	//  921 2379:sipush          10643
	//  922 2382:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  923 2385:pop             
		mirrorChars.put(10645, 10646);
	//  924 2386:getstatic       #46  <Field IntHashtable mirrorChars>
	//  925 2389:sipush          10645
	//  926 2392:sipush          10646
	//  927 2395:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  928 2398:pop             
		mirrorChars.put(10646, 10645);
	//  929 2399:getstatic       #46  <Field IntHashtable mirrorChars>
	//  930 2402:sipush          10646
	//  931 2405:sipush          10645
	//  932 2408:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  933 2411:pop             
		mirrorChars.put(10647, 10648);
	//  934 2412:getstatic       #46  <Field IntHashtable mirrorChars>
	//  935 2415:sipush          10647
	//  936 2418:sipush          10648
	//  937 2421:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  938 2424:pop             
		mirrorChars.put(10648, 10647);
	//  939 2425:getstatic       #46  <Field IntHashtable mirrorChars>
	//  940 2428:sipush          10648
	//  941 2431:sipush          10647
	//  942 2434:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  943 2437:pop             
		mirrorChars.put(10680, 8856);
	//  944 2438:getstatic       #46  <Field IntHashtable mirrorChars>
	//  945 2441:sipush          10680
	//  946 2444:sipush          8856
	//  947 2447:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  948 2450:pop             
		mirrorChars.put(10688, 10689);
	//  949 2451:getstatic       #46  <Field IntHashtable mirrorChars>
	//  950 2454:sipush          10688
	//  951 2457:sipush          10689
	//  952 2460:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  953 2463:pop             
		mirrorChars.put(10689, 10688);
	//  954 2464:getstatic       #46  <Field IntHashtable mirrorChars>
	//  955 2467:sipush          10689
	//  956 2470:sipush          10688
	//  957 2473:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  958 2476:pop             
		mirrorChars.put(10692, 10693);
	//  959 2477:getstatic       #46  <Field IntHashtable mirrorChars>
	//  960 2480:sipush          10692
	//  961 2483:sipush          10693
	//  962 2486:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  963 2489:pop             
		mirrorChars.put(10693, 10692);
	//  964 2490:getstatic       #46  <Field IntHashtable mirrorChars>
	//  965 2493:sipush          10693
	//  966 2496:sipush          10692
	//  967 2499:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  968 2502:pop             
		mirrorChars.put(10703, 10704);
	//  969 2503:getstatic       #46  <Field IntHashtable mirrorChars>
	//  970 2506:sipush          10703
	//  971 2509:sipush          10704
	//  972 2512:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  973 2515:pop             
		mirrorChars.put(10704, 10703);
	//  974 2516:getstatic       #46  <Field IntHashtable mirrorChars>
	//  975 2519:sipush          10704
	//  976 2522:sipush          10703
	//  977 2525:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  978 2528:pop             
		mirrorChars.put(10705, 10706);
	//  979 2529:getstatic       #46  <Field IntHashtable mirrorChars>
	//  980 2532:sipush          10705
	//  981 2535:sipush          10706
	//  982 2538:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  983 2541:pop             
		mirrorChars.put(10706, 10705);
	//  984 2542:getstatic       #46  <Field IntHashtable mirrorChars>
	//  985 2545:sipush          10706
	//  986 2548:sipush          10705
	//  987 2551:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  988 2554:pop             
		mirrorChars.put(10708, 10709);
	//  989 2555:getstatic       #46  <Field IntHashtable mirrorChars>
	//  990 2558:sipush          10708
	//  991 2561:sipush          10709
	//  992 2564:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  993 2567:pop             
		mirrorChars.put(10709, 10708);
	//  994 2568:getstatic       #46  <Field IntHashtable mirrorChars>
	//  995 2571:sipush          10709
	//  996 2574:sipush          10708
	//  997 2577:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	//  998 2580:pop             
		mirrorChars.put(10712, 10713);
	//  999 2581:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1000 2584:sipush          10712
	// 1001 2587:sipush          10713
	// 1002 2590:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1003 2593:pop             
		mirrorChars.put(10713, 10712);
	// 1004 2594:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1005 2597:sipush          10713
	// 1006 2600:sipush          10712
	// 1007 2603:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1008 2606:pop             
		mirrorChars.put(10714, 10715);
	// 1009 2607:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1010 2610:sipush          10714
	// 1011 2613:sipush          10715
	// 1012 2616:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1013 2619:pop             
		mirrorChars.put(10715, 10714);
	// 1014 2620:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1015 2623:sipush          10715
	// 1016 2626:sipush          10714
	// 1017 2629:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1018 2632:pop             
		mirrorChars.put(10741, 8725);
	// 1019 2633:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1020 2636:sipush          10741
	// 1021 2639:sipush          8725
	// 1022 2642:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1023 2645:pop             
		mirrorChars.put(10744, 10745);
	// 1024 2646:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1025 2649:sipush          10744
	// 1026 2652:sipush          10745
	// 1027 2655:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1028 2658:pop             
		mirrorChars.put(10745, 10744);
	// 1029 2659:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1030 2662:sipush          10745
	// 1031 2665:sipush          10744
	// 1032 2668:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1033 2671:pop             
		mirrorChars.put(10748, 10749);
	// 1034 2672:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1035 2675:sipush          10748
	// 1036 2678:sipush          10749
	// 1037 2681:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1038 2684:pop             
		mirrorChars.put(10749, 10748);
	// 1039 2685:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1040 2688:sipush          10749
	// 1041 2691:sipush          10748
	// 1042 2694:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1043 2697:pop             
		mirrorChars.put(10795, 10796);
	// 1044 2698:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1045 2701:sipush          10795
	// 1046 2704:sipush          10796
	// 1047 2707:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1048 2710:pop             
		mirrorChars.put(10796, 10795);
	// 1049 2711:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1050 2714:sipush          10796
	// 1051 2717:sipush          10795
	// 1052 2720:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1053 2723:pop             
		mirrorChars.put(10797, 10796);
	// 1054 2724:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1055 2727:sipush          10797
	// 1056 2730:sipush          10796
	// 1057 2733:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1058 2736:pop             
		mirrorChars.put(10798, 10797);
	// 1059 2737:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1060 2740:sipush          10798
	// 1061 2743:sipush          10797
	// 1062 2746:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1063 2749:pop             
		mirrorChars.put(10804, 10805);
	// 1064 2750:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1065 2753:sipush          10804
	// 1066 2756:sipush          10805
	// 1067 2759:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1068 2762:pop             
		mirrorChars.put(10805, 10804);
	// 1069 2763:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1070 2766:sipush          10805
	// 1071 2769:sipush          10804
	// 1072 2772:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1073 2775:pop             
		mirrorChars.put(10812, 10813);
	// 1074 2776:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1075 2779:sipush          10812
	// 1076 2782:sipush          10813
	// 1077 2785:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1078 2788:pop             
		mirrorChars.put(10813, 10812);
	// 1079 2789:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1080 2792:sipush          10813
	// 1081 2795:sipush          10812
	// 1082 2798:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1083 2801:pop             
		mirrorChars.put(10852, 10853);
	// 1084 2802:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1085 2805:sipush          10852
	// 1086 2808:sipush          10853
	// 1087 2811:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1088 2814:pop             
		mirrorChars.put(10853, 10852);
	// 1089 2815:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1090 2818:sipush          10853
	// 1091 2821:sipush          10852
	// 1092 2824:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1093 2827:pop             
		mirrorChars.put(10873, 10874);
	// 1094 2828:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1095 2831:sipush          10873
	// 1096 2834:sipush          10874
	// 1097 2837:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1098 2840:pop             
		mirrorChars.put(10874, 10873);
	// 1099 2841:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1100 2844:sipush          10874
	// 1101 2847:sipush          10873
	// 1102 2850:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1103 2853:pop             
		mirrorChars.put(10877, 10878);
	// 1104 2854:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1105 2857:sipush          10877
	// 1106 2860:sipush          10878
	// 1107 2863:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1108 2866:pop             
		mirrorChars.put(10878, 10877);
	// 1109 2867:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1110 2870:sipush          10878
	// 1111 2873:sipush          10877
	// 1112 2876:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1113 2879:pop             
		mirrorChars.put(10879, 10880);
	// 1114 2880:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1115 2883:sipush          10879
	// 1116 2886:sipush          10880
	// 1117 2889:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1118 2892:pop             
		mirrorChars.put(10880, 10879);
	// 1119 2893:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1120 2896:sipush          10880
	// 1121 2899:sipush          10879
	// 1122 2902:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1123 2905:pop             
		mirrorChars.put(10881, 10882);
	// 1124 2906:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1125 2909:sipush          10881
	// 1126 2912:sipush          10882
	// 1127 2915:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1128 2918:pop             
		mirrorChars.put(10882, 10881);
	// 1129 2919:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1130 2922:sipush          10882
	// 1131 2925:sipush          10881
	// 1132 2928:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1133 2931:pop             
		mirrorChars.put(10883, 10884);
	// 1134 2932:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1135 2935:sipush          10883
	// 1136 2938:sipush          10884
	// 1137 2941:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1138 2944:pop             
		mirrorChars.put(10884, 10883);
	// 1139 2945:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1140 2948:sipush          10884
	// 1141 2951:sipush          10883
	// 1142 2954:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1143 2957:pop             
		mirrorChars.put(10891, 10892);
	// 1144 2958:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1145 2961:sipush          10891
	// 1146 2964:sipush          10892
	// 1147 2967:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1148 2970:pop             
		mirrorChars.put(10892, 10891);
	// 1149 2971:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1150 2974:sipush          10892
	// 1151 2977:sipush          10891
	// 1152 2980:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1153 2983:pop             
		mirrorChars.put(10897, 10898);
	// 1154 2984:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1155 2987:sipush          10897
	// 1156 2990:sipush          10898
	// 1157 2993:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1158 2996:pop             
		mirrorChars.put(10898, 10897);
	// 1159 2997:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1160 3000:sipush          10898
	// 1161 3003:sipush          10897
	// 1162 3006:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1163 3009:pop             
		mirrorChars.put(10899, 10900);
	// 1164 3010:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1165 3013:sipush          10899
	// 1166 3016:sipush          10900
	// 1167 3019:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1168 3022:pop             
		mirrorChars.put(10900, 10899);
	// 1169 3023:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1170 3026:sipush          10900
	// 1171 3029:sipush          10899
	// 1172 3032:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1173 3035:pop             
		mirrorChars.put(10901, 10902);
	// 1174 3036:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1175 3039:sipush          10901
	// 1176 3042:sipush          10902
	// 1177 3045:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1178 3048:pop             
		mirrorChars.put(10902, 10901);
	// 1179 3049:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1180 3052:sipush          10902
	// 1181 3055:sipush          10901
	// 1182 3058:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1183 3061:pop             
		mirrorChars.put(10903, 10904);
	// 1184 3062:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1185 3065:sipush          10903
	// 1186 3068:sipush          10904
	// 1187 3071:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1188 3074:pop             
		mirrorChars.put(10904, 10903);
	// 1189 3075:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1190 3078:sipush          10904
	// 1191 3081:sipush          10903
	// 1192 3084:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1193 3087:pop             
		mirrorChars.put(10905, 10906);
	// 1194 3088:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1195 3091:sipush          10905
	// 1196 3094:sipush          10906
	// 1197 3097:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1198 3100:pop             
		mirrorChars.put(10906, 10905);
	// 1199 3101:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1200 3104:sipush          10906
	// 1201 3107:sipush          10905
	// 1202 3110:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1203 3113:pop             
		mirrorChars.put(10907, 10908);
	// 1204 3114:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1205 3117:sipush          10907
	// 1206 3120:sipush          10908
	// 1207 3123:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1208 3126:pop             
		mirrorChars.put(10908, 10907);
	// 1209 3127:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1210 3130:sipush          10908
	// 1211 3133:sipush          10907
	// 1212 3136:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1213 3139:pop             
		mirrorChars.put(10913, 10914);
	// 1214 3140:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1215 3143:sipush          10913
	// 1216 3146:sipush          10914
	// 1217 3149:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1218 3152:pop             
		mirrorChars.put(10914, 10913);
	// 1219 3153:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1220 3156:sipush          10914
	// 1221 3159:sipush          10913
	// 1222 3162:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1223 3165:pop             
		mirrorChars.put(10918, 10919);
	// 1224 3166:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1225 3169:sipush          10918
	// 1226 3172:sipush          10919
	// 1227 3175:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1228 3178:pop             
		mirrorChars.put(10919, 10918);
	// 1229 3179:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1230 3182:sipush          10919
	// 1231 3185:sipush          10918
	// 1232 3188:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1233 3191:pop             
		mirrorChars.put(10920, 10921);
	// 1234 3192:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1235 3195:sipush          10920
	// 1236 3198:sipush          10921
	// 1237 3201:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1238 3204:pop             
		mirrorChars.put(10921, 10920);
	// 1239 3205:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1240 3208:sipush          10921
	// 1241 3211:sipush          10920
	// 1242 3214:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1243 3217:pop             
		mirrorChars.put(10922, 10923);
	// 1244 3218:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1245 3221:sipush          10922
	// 1246 3224:sipush          10923
	// 1247 3227:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1248 3230:pop             
		mirrorChars.put(10923, 10922);
	// 1249 3231:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1250 3234:sipush          10923
	// 1251 3237:sipush          10922
	// 1252 3240:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1253 3243:pop             
		mirrorChars.put(10924, 10925);
	// 1254 3244:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1255 3247:sipush          10924
	// 1256 3250:sipush          10925
	// 1257 3253:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1258 3256:pop             
		mirrorChars.put(10925, 10924);
	// 1259 3257:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1260 3260:sipush          10925
	// 1261 3263:sipush          10924
	// 1262 3266:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1263 3269:pop             
		mirrorChars.put(10927, 10928);
	// 1264 3270:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1265 3273:sipush          10927
	// 1266 3276:sipush          10928
	// 1267 3279:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1268 3282:pop             
		mirrorChars.put(10928, 10927);
	// 1269 3283:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1270 3286:sipush          10928
	// 1271 3289:sipush          10927
	// 1272 3292:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1273 3295:pop             
		mirrorChars.put(10931, 10932);
	// 1274 3296:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1275 3299:sipush          10931
	// 1276 3302:sipush          10932
	// 1277 3305:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1278 3308:pop             
		mirrorChars.put(10932, 10931);
	// 1279 3309:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1280 3312:sipush          10932
	// 1281 3315:sipush          10931
	// 1282 3318:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1283 3321:pop             
		mirrorChars.put(10939, 10940);
	// 1284 3322:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1285 3325:sipush          10939
	// 1286 3328:sipush          10940
	// 1287 3331:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1288 3334:pop             
		mirrorChars.put(10940, 10939);
	// 1289 3335:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1290 3338:sipush          10940
	// 1291 3341:sipush          10939
	// 1292 3344:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1293 3347:pop             
		mirrorChars.put(10941, 10942);
	// 1294 3348:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1295 3351:sipush          10941
	// 1296 3354:sipush          10942
	// 1297 3357:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1298 3360:pop             
		mirrorChars.put(10942, 10941);
	// 1299 3361:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1300 3364:sipush          10942
	// 1301 3367:sipush          10941
	// 1302 3370:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1303 3373:pop             
		mirrorChars.put(10943, 10944);
	// 1304 3374:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1305 3377:sipush          10943
	// 1306 3380:sipush          10944
	// 1307 3383:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1308 3386:pop             
		mirrorChars.put(10944, 10943);
	// 1309 3387:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1310 3390:sipush          10944
	// 1311 3393:sipush          10943
	// 1312 3396:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1313 3399:pop             
		mirrorChars.put(10945, 10946);
	// 1314 3400:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1315 3403:sipush          10945
	// 1316 3406:sipush          10946
	// 1317 3409:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1318 3412:pop             
		mirrorChars.put(10946, 10945);
	// 1319 3413:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1320 3416:sipush          10946
	// 1321 3419:sipush          10945
	// 1322 3422:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1323 3425:pop             
		mirrorChars.put(10947, 10948);
	// 1324 3426:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1325 3429:sipush          10947
	// 1326 3432:sipush          10948
	// 1327 3435:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1328 3438:pop             
		mirrorChars.put(10948, 10947);
	// 1329 3439:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1330 3442:sipush          10948
	// 1331 3445:sipush          10947
	// 1332 3448:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1333 3451:pop             
		mirrorChars.put(10949, 10950);
	// 1334 3452:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1335 3455:sipush          10949
	// 1336 3458:sipush          10950
	// 1337 3461:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1338 3464:pop             
		mirrorChars.put(10950, 10949);
	// 1339 3465:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1340 3468:sipush          10950
	// 1341 3471:sipush          10949
	// 1342 3474:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1343 3477:pop             
		mirrorChars.put(10957, 10958);
	// 1344 3478:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1345 3481:sipush          10957
	// 1346 3484:sipush          10958
	// 1347 3487:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1348 3490:pop             
		mirrorChars.put(10958, 10957);
	// 1349 3491:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1350 3494:sipush          10958
	// 1351 3497:sipush          10957
	// 1352 3500:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1353 3503:pop             
		mirrorChars.put(10959, 10960);
	// 1354 3504:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1355 3507:sipush          10959
	// 1356 3510:sipush          10960
	// 1357 3513:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1358 3516:pop             
		mirrorChars.put(10960, 10959);
	// 1359 3517:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1360 3520:sipush          10960
	// 1361 3523:sipush          10959
	// 1362 3526:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1363 3529:pop             
		mirrorChars.put(10961, 10962);
	// 1364 3530:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1365 3533:sipush          10961
	// 1366 3536:sipush          10962
	// 1367 3539:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1368 3542:pop             
		mirrorChars.put(10962, 10961);
	// 1369 3543:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1370 3546:sipush          10962
	// 1371 3549:sipush          10961
	// 1372 3552:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1373 3555:pop             
		mirrorChars.put(10963, 10964);
	// 1374 3556:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1375 3559:sipush          10963
	// 1376 3562:sipush          10964
	// 1377 3565:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1378 3568:pop             
		mirrorChars.put(10964, 10963);
	// 1379 3569:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1380 3572:sipush          10964
	// 1381 3575:sipush          10963
	// 1382 3578:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1383 3581:pop             
		mirrorChars.put(10965, 10966);
	// 1384 3582:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1385 3585:sipush          10965
	// 1386 3588:sipush          10966
	// 1387 3591:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1388 3594:pop             
		mirrorChars.put(10966, 10965);
	// 1389 3595:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1390 3598:sipush          10966
	// 1391 3601:sipush          10965
	// 1392 3604:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1393 3607:pop             
		mirrorChars.put(10974, 8870);
	// 1394 3608:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1395 3611:sipush          10974
	// 1396 3614:sipush          8870
	// 1397 3617:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1398 3620:pop             
		mirrorChars.put(10979, 8873);
	// 1399 3621:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1400 3624:sipush          10979
	// 1401 3627:sipush          8873
	// 1402 3630:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1403 3633:pop             
		mirrorChars.put(10980, 8872);
	// 1404 3634:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1405 3637:sipush          10980
	// 1406 3640:sipush          8872
	// 1407 3643:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1408 3646:pop             
		mirrorChars.put(10981, 8875);
	// 1409 3647:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1410 3650:sipush          10981
	// 1411 3653:sipush          8875
	// 1412 3656:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1413 3659:pop             
		mirrorChars.put(10988, 10989);
	// 1414 3660:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1415 3663:sipush          10988
	// 1416 3666:sipush          10989
	// 1417 3669:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1418 3672:pop             
		mirrorChars.put(10989, 10988);
	// 1419 3673:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1420 3676:sipush          10989
	// 1421 3679:sipush          10988
	// 1422 3682:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1423 3685:pop             
		mirrorChars.put(10999, 11000);
	// 1424 3686:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1425 3689:sipush          10999
	// 1426 3692:sipush          11000
	// 1427 3695:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1428 3698:pop             
		mirrorChars.put(11000, 10999);
	// 1429 3699:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1430 3702:sipush          11000
	// 1431 3705:sipush          10999
	// 1432 3708:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1433 3711:pop             
		mirrorChars.put(11001, 11002);
	// 1434 3712:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1435 3715:sipush          11001
	// 1436 3718:sipush          11002
	// 1437 3721:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1438 3724:pop             
		mirrorChars.put(11002, 11001);
	// 1439 3725:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1440 3728:sipush          11002
	// 1441 3731:sipush          11001
	// 1442 3734:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1443 3737:pop             
		mirrorChars.put(12296, 12297);
	// 1444 3738:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1445 3741:sipush          12296
	// 1446 3744:sipush          12297
	// 1447 3747:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1448 3750:pop             
		mirrorChars.put(12297, 12296);
	// 1449 3751:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1450 3754:sipush          12297
	// 1451 3757:sipush          12296
	// 1452 3760:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1453 3763:pop             
		mirrorChars.put(12298, 12299);
	// 1454 3764:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1455 3767:sipush          12298
	// 1456 3770:sipush          12299
	// 1457 3773:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1458 3776:pop             
		mirrorChars.put(12299, 12298);
	// 1459 3777:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1460 3780:sipush          12299
	// 1461 3783:sipush          12298
	// 1462 3786:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1463 3789:pop             
		mirrorChars.put(12300, 12301);
	// 1464 3790:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1465 3793:sipush          12300
	// 1466 3796:sipush          12301
	// 1467 3799:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1468 3802:pop             
		mirrorChars.put(12301, 12300);
	// 1469 3803:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1470 3806:sipush          12301
	// 1471 3809:sipush          12300
	// 1472 3812:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1473 3815:pop             
		mirrorChars.put(12302, 12303);
	// 1474 3816:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1475 3819:sipush          12302
	// 1476 3822:sipush          12303
	// 1477 3825:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1478 3828:pop             
		mirrorChars.put(12303, 12302);
	// 1479 3829:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1480 3832:sipush          12303
	// 1481 3835:sipush          12302
	// 1482 3838:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1483 3841:pop             
		mirrorChars.put(12304, 12305);
	// 1484 3842:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1485 3845:sipush          12304
	// 1486 3848:sipush          12305
	// 1487 3851:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1488 3854:pop             
		mirrorChars.put(12305, 12304);
	// 1489 3855:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1490 3858:sipush          12305
	// 1491 3861:sipush          12304
	// 1492 3864:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1493 3867:pop             
		mirrorChars.put(12308, 12309);
	// 1494 3868:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1495 3871:sipush          12308
	// 1496 3874:sipush          12309
	// 1497 3877:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1498 3880:pop             
		mirrorChars.put(12309, 12308);
	// 1499 3881:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1500 3884:sipush          12309
	// 1501 3887:sipush          12308
	// 1502 3890:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1503 3893:pop             
		mirrorChars.put(12310, 12311);
	// 1504 3894:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1505 3897:sipush          12310
	// 1506 3900:sipush          12311
	// 1507 3903:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1508 3906:pop             
		mirrorChars.put(12311, 12310);
	// 1509 3907:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1510 3910:sipush          12311
	// 1511 3913:sipush          12310
	// 1512 3916:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1513 3919:pop             
		mirrorChars.put(12312, 12313);
	// 1514 3920:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1515 3923:sipush          12312
	// 1516 3926:sipush          12313
	// 1517 3929:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1518 3932:pop             
		mirrorChars.put(12313, 12312);
	// 1519 3933:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1520 3936:sipush          12313
	// 1521 3939:sipush          12312
	// 1522 3942:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1523 3945:pop             
		mirrorChars.put(12314, 12315);
	// 1524 3946:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1525 3949:sipush          12314
	// 1526 3952:sipush          12315
	// 1527 3955:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1528 3958:pop             
		mirrorChars.put(12315, 12314);
	// 1529 3959:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1530 3962:sipush          12315
	// 1531 3965:sipush          12314
	// 1532 3968:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1533 3971:pop             
		mirrorChars.put(65288, 65289);
	// 1534 3972:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1535 3975:ldc1            #51  <Int 65288>
	// 1536 3977:ldc1            #52  <Int 65289>
	// 1537 3979:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1538 3982:pop             
		mirrorChars.put(65289, 65288);
	// 1539 3983:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1540 3986:ldc1            #52  <Int 65289>
	// 1541 3988:ldc1            #51  <Int 65288>
	// 1542 3990:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1543 3993:pop             
		mirrorChars.put(65308, 65310);
	// 1544 3994:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1545 3997:ldc1            #53  <Int 65308>
	// 1546 3999:ldc1            #54  <Int 65310>
	// 1547 4001:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1548 4004:pop             
		mirrorChars.put(65310, 65308);
	// 1549 4005:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1550 4008:ldc1            #54  <Int 65310>
	// 1551 4010:ldc1            #53  <Int 65308>
	// 1552 4012:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1553 4015:pop             
		mirrorChars.put(65339, 65341);
	// 1554 4016:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1555 4019:ldc1            #55  <Int 65339>
	// 1556 4021:ldc1            #56  <Int 65341>
	// 1557 4023:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1558 4026:pop             
		mirrorChars.put(65341, 65339);
	// 1559 4027:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1560 4030:ldc1            #56  <Int 65341>
	// 1561 4032:ldc1            #55  <Int 65339>
	// 1562 4034:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1563 4037:pop             
		mirrorChars.put(65371, 65373);
	// 1564 4038:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1565 4041:ldc1            #57  <Int 65371>
	// 1566 4043:ldc1            #58  <Int 65373>
	// 1567 4045:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1568 4048:pop             
		mirrorChars.put(65373, 65371);
	// 1569 4049:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1570 4052:ldc1            #58  <Int 65373>
	// 1571 4054:ldc1            #57  <Int 65371>
	// 1572 4056:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1573 4059:pop             
		mirrorChars.put(65375, 65376);
	// 1574 4060:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1575 4063:ldc1            #59  <Int 65375>
	// 1576 4065:ldc1            #60  <Int 65376>
	// 1577 4067:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1578 4070:pop             
		mirrorChars.put(65376, 65375);
	// 1579 4071:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1580 4074:ldc1            #60  <Int 65376>
	// 1581 4076:ldc1            #59  <Int 65375>
	// 1582 4078:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1583 4081:pop             
		mirrorChars.put(65378, 65379);
	// 1584 4082:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1585 4085:ldc1            #61  <Int 65378>
	// 1586 4087:ldc1            #62  <Int 65379>
	// 1587 4089:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1588 4092:pop             
		mirrorChars.put(65379, 65378);
	// 1589 4093:getstatic       #46  <Field IntHashtable mirrorChars>
	// 1590 4096:ldc1            #62  <Int 65379>
	// 1591 4098:ldc1            #61  <Int 65378>
	// 1592 4100:invokevirtual   #50  <Method int IntHashtable.put(int, int)>
	// 1593 4103:pop             
	//*1594 4104:return          
	}
}
