// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.wav;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.*;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor.wav:
//			WavHeader

final class WavHeaderReader
{
	private static final class ChunkHeader
	{

		public static ChunkHeader peek(ExtractorInput extractorinput, ParsableByteArray parsablebytearray)
			throws IOException, InterruptedException
		{
			extractorinput.peekFully(parsablebytearray.data, 0, 8);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #35  <Field byte[] ParsableByteArray.data>
		//    3    5:iconst_0        
		//    4    6:bipush          8
		//    5    8:invokeinterface #41  <Method void ExtractorInput.peekFully(byte[], int, int)>
			parsablebytearray.setPosition(0);
		//    6   13:aload_1         
		//    7   14:iconst_0        
		//    8   15:invokevirtual   #45  <Method void ParsableByteArray.setPosition(int)>
			return new ChunkHeader(parsablebytearray.readInt(), parsablebytearray.readLittleEndianUnsignedInt());
		//    9   18:new             #2   <Class WavHeaderReader$ChunkHeader>
		//   10   21:dup             
		//   11   22:aload_1         
		//   12   23:invokevirtual   #49  <Method int ParsableByteArray.readInt()>
		//   13   26:aload_1         
		//   14   27:invokevirtual   #53  <Method long ParsableByteArray.readLittleEndianUnsignedInt()>
		//   15   30:invokespecial   #55  <Method void WavHeaderReader$ChunkHeader(int, long)>
		//   16   33:areturn         
		}

		public static final int SIZE_IN_BYTES = 8;
		public final int id;
		public final long size;

		private ChunkHeader(int i, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			id = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #20  <Field int id>
			size = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #22  <Field long size>
		//    8   14:return          
		}
	}


	private WavHeaderReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static WavHeader peek(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		int i;
		int j;
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		ChunkHeader chunkheader;
label0:
		{
			Assertions.checkNotNull(((Object) (extractorinput)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method Object Assertions.checkNotNull(Object)>
	//    2    4:pop             
			ParsableByteArray parsablebytearray = new ParsableByteArray(16);
	//    3    5:new             #37  <Class ParsableByteArray>
	//    4    8:dup             
	//    5    9:bipush          16
	//    6   11:invokespecial   #40  <Method void ParsableByteArray(int)>
	//    7   14:astore          11
			if(ChunkHeader.peek(extractorinput, parsablebytearray).id != Util.getIntegerCodeForString("RIFF"))
	//*   8   16:aload_0         
	//*   9   17:aload           11
	//*  10   19:invokestatic    #43  <Method WavHeaderReader$ChunkHeader WavHeaderReader$ChunkHeader.peek(ExtractorInput, ParsableByteArray)>
	//*  11   22:getfield        #46  <Field int WavHeaderReader$ChunkHeader.id>
	//*  12   25:ldc1            #48  <String "RIFF">
	//*  13   27:invokestatic    #54  <Method int Util.getIntegerCodeForString(String)>
	//*  14   30:icmpeq          35
				return null;
	//   15   33:aconst_null     
	//   16   34:areturn         
			byte abyte0[] = parsablebytearray.data;
	//   17   35:aload           11
	//   18   37:getfield        #58  <Field byte[] ParsableByteArray.data>
	//   19   40:astore          10
			i = 4;
	//   20   42:iconst_4        
	//   21   43:istore_1        
			extractorinput.peekFully(abyte0, 0, 4);
	//   22   44:aload_0         
	//   23   45:aload           10
	//   24   47:iconst_0        
	//   25   48:iconst_4        
	//   26   49:invokeinterface #64  <Method void ExtractorInput.peekFully(byte[], int, int)>
			parsablebytearray.setPosition(0);
	//   27   54:aload           11
	//   28   56:iconst_0        
	//   29   57:invokevirtual   #67  <Method void ParsableByteArray.setPosition(int)>
			j = parsablebytearray.readInt();
	//   30   60:aload           11
	//   31   62:invokevirtual   #71  <Method int ParsableByteArray.readInt()>
	//   32   65:istore_2        
			if(j != Util.getIntegerCodeForString("WAVE"))
	//*  33   66:iload_2         
	//*  34   67:ldc1            #73  <String "WAVE">
	//*  35   69:invokestatic    #54  <Method int Util.getIntegerCodeForString(String)>
	//*  36   72:icmpeq          108
			{
				extractorinput = ((ExtractorInput) (new StringBuilder()));
	//   37   75:new             #75  <Class StringBuilder>
	//   38   78:dup             
	//   39   79:invokespecial   #76  <Method void StringBuilder()>
	//   40   82:astore_0        
				((StringBuilder) (extractorinput)).append("Unsupported RIFF format: ");
	//   41   83:aload_0         
	//   42   84:ldc1            #78  <String "Unsupported RIFF format: ">
	//   43   86:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   44   89:pop             
				((StringBuilder) (extractorinput)).append(j);
	//   45   90:aload_0         
	//   46   91:iload_2         
	//   47   92:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//   48   95:pop             
				Log.e("WavHeaderReader", ((StringBuilder) (extractorinput)).toString());
	//   49   96:ldc1            #11  <String "WavHeaderReader">
	//   50   98:aload_0         
	//   51   99:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   52  102:invokestatic    #95  <Method int Log.e(String, String)>
	//   53  105:pop             
				return null;
	//   54  106:aconst_null     
	//   55  107:areturn         
			}
			for(chunkheader = ChunkHeader.peek(extractorinput, parsablebytearray); chunkheader.id != Util.getIntegerCodeForString("fmt "); chunkheader = ChunkHeader.peek(extractorinput, parsablebytearray))
	//*  56  108:aload_0         
	//*  57  109:aload           11
	//*  58  111:invokestatic    #43  <Method WavHeaderReader$ChunkHeader WavHeaderReader$ChunkHeader.peek(ExtractorInput, ParsableByteArray)>
	//*  59  114:astore          10
	//*  60  116:aload           10
	//*  61  118:getfield        #46  <Field int WavHeaderReader$ChunkHeader.id>
	//*  62  121:ldc1            #97  <String "fmt ">
	//*  63  123:invokestatic    #54  <Method int Util.getIntegerCodeForString(String)>
	//*  64  126:icmpeq          152
				extractorinput.advancePeekPosition((int)chunkheader.size);
	//   65  129:aload_0         
	//   66  130:aload           10
	//   67  132:getfield        #101 <Field long WavHeaderReader$ChunkHeader.size>
	//   68  135:l2i             
	//   69  136:invokeinterface #104 <Method void ExtractorInput.advancePeekPosition(int)>

	//   70  141:aload_0         
	//   71  142:aload           11
	//   72  144:invokestatic    #43  <Method WavHeaderReader$ChunkHeader WavHeaderReader$ChunkHeader.peek(ExtractorInput, ParsableByteArray)>
	//   73  147:astore          10
	//*  74  149:goto            116
			boolean flag;
			if(chunkheader.size >= 16L)
	//*  75  152:aload           10
	//*  76  154:getfield        #101 <Field long WavHeaderReader$ChunkHeader.size>
	//*  77  157:ldc2w           #105 <Long 16L>
	//*  78  160:lcmp            
	//*  79  161:iflt            170
				flag = true;
	//   80  164:iconst_1        
	//   81  165:istore          9
			else
	//*  82  167:goto            173
				flag = false;
	//   83  170:iconst_0        
	//   84  171:istore          9
			Assertions.checkState(flag);
	//   85  173:iload           9
	//   86  175:invokestatic    #110 <Method void Assertions.checkState(boolean)>
			extractorinput.peekFully(parsablebytearray.data, 0, 16);
	//   87  178:aload_0         
	//   88  179:aload           11
	//   89  181:getfield        #58  <Field byte[] ParsableByteArray.data>
	//   90  184:iconst_0        
	//   91  185:bipush          16
	//   92  187:invokeinterface #64  <Method void ExtractorInput.peekFully(byte[], int, int)>
			parsablebytearray.setPosition(0);
	//   93  192:aload           11
	//   94  194:iconst_0        
	//   95  195:invokevirtual   #67  <Method void ParsableByteArray.setPosition(int)>
			j = parsablebytearray.readLittleEndianUnsignedShort();
	//   96  198:aload           11
	//   97  200:invokevirtual   #113 <Method int ParsableByteArray.readLittleEndianUnsignedShort()>
	//   98  203:istore_2        
			k = parsablebytearray.readLittleEndianUnsignedShort();
	//   99  204:aload           11
	//  100  206:invokevirtual   #113 <Method int ParsableByteArray.readLittleEndianUnsignedShort()>
	//  101  209:istore_3        
			l = parsablebytearray.readLittleEndianUnsignedIntToInt();
	//  102  210:aload           11
	//  103  212:invokevirtual   #116 <Method int ParsableByteArray.readLittleEndianUnsignedIntToInt()>
	//  104  215:istore          4
			i1 = parsablebytearray.readLittleEndianUnsignedIntToInt();
	//  105  217:aload           11
	//  106  219:invokevirtual   #116 <Method int ParsableByteArray.readLittleEndianUnsignedIntToInt()>
	//  107  222:istore          5
			j1 = parsablebytearray.readLittleEndianUnsignedShort();
	//  108  224:aload           11
	//  109  226:invokevirtual   #113 <Method int ParsableByteArray.readLittleEndianUnsignedShort()>
	//  110  229:istore          6
			k1 = parsablebytearray.readLittleEndianUnsignedShort();
	//  111  231:aload           11
	//  112  233:invokevirtual   #113 <Method int ParsableByteArray.readLittleEndianUnsignedShort()>
	//  113  236:istore          7
			int l1 = (k * k1) / 8;
	//  114  238:iload_3         
	//  115  239:iload           7
	//  116  241:imul            
	//  117  242:bipush          8
	//  118  244:idiv            
	//  119  245:istore          8
			if(j1 != l1)
	//* 120  247:iload           6
	//* 121  249:iload           8
	//* 122  251:icmpeq          302
			{
				extractorinput = ((ExtractorInput) (new StringBuilder()));
	//  123  254:new             #75  <Class StringBuilder>
	//  124  257:dup             
	//  125  258:invokespecial   #76  <Method void StringBuilder()>
	//  126  261:astore_0        
				((StringBuilder) (extractorinput)).append("Expected block alignment: ");
	//  127  262:aload_0         
	//  128  263:ldc1            #118 <String "Expected block alignment: ">
	//  129  265:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  130  268:pop             
				((StringBuilder) (extractorinput)).append(l1);
	//  131  269:aload_0         
	//  132  270:iload           8
	//  133  272:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//  134  275:pop             
				((StringBuilder) (extractorinput)).append("; got: ");
	//  135  276:aload_0         
	//  136  277:ldc1            #120 <String "; got: ">
	//  137  279:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  138  282:pop             
				((StringBuilder) (extractorinput)).append(j1);
	//  139  283:aload_0         
	//  140  284:iload           6
	//  141  286:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//  142  289:pop             
				throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//  143  290:new             #122 <Class ParserException>
	//  144  293:dup             
	//  145  294:aload_0         
	//  146  295:invokevirtual   #89  <Method String StringBuilder.toString()>
	//  147  298:invokespecial   #125 <Method void ParserException(String)>
	//  148  301:athrow          
			}
			if(j != 1)
	//* 149  302:iload_2         
	//* 150  303:iconst_1        
	//* 151  304:icmpeq          366
				if(j != 3)
	//* 152  307:iload_2         
	//* 153  308:iconst_3        
	//* 154  309:icmpeq          351
				{
					if(j != 65534)
	//* 155  312:iload_2         
	//* 156  313:ldc1            #18  <Int 65534>
	//* 157  315:icmpeq          366
					{
						extractorinput = ((ExtractorInput) (new StringBuilder()));
	//  158  318:new             #75  <Class StringBuilder>
	//  159  321:dup             
	//  160  322:invokespecial   #76  <Method void StringBuilder()>
	//  161  325:astore_0        
						((StringBuilder) (extractorinput)).append("Unsupported WAV format type: ");
	//  162  326:aload_0         
	//  163  327:ldc1            #127 <String "Unsupported WAV format type: ">
	//  164  329:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  165  332:pop             
						((StringBuilder) (extractorinput)).append(j);
	//  166  333:aload_0         
	//  167  334:iload_2         
	//  168  335:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//  169  338:pop             
						Log.e("WavHeaderReader", ((StringBuilder) (extractorinput)).toString());
	//  170  339:ldc1            #11  <String "WavHeaderReader">
	//  171  341:aload_0         
	//  172  342:invokevirtual   #89  <Method String StringBuilder.toString()>
	//  173  345:invokestatic    #95  <Method int Log.e(String, String)>
	//  174  348:pop             
						return null;
	//  175  349:aconst_null     
	//  176  350:areturn         
					}
				} else
				{
					if(k1 != 32)
	//* 177  351:iload           7
	//* 178  353:bipush          32
	//* 179  355:icmpne          361
	//* 180  358:goto            363
						i = 0;
	//  181  361:iconst_0        
	//  182  362:istore_1        
					break label0;
	//  183  363:goto            372
				}
			i = Util.getPcmEncoding(k1);
	//  184  366:iload           7
	//  185  368:invokestatic    #131 <Method int Util.getPcmEncoding(int)>
	//  186  371:istore_1        
		}
		if(i == 0)
	//* 187  372:iload_1         
	//* 188  373:ifne            423
		{
			extractorinput = ((ExtractorInput) (new StringBuilder()));
	//  189  376:new             #75  <Class StringBuilder>
	//  190  379:dup             
	//  191  380:invokespecial   #76  <Method void StringBuilder()>
	//  192  383:astore_0        
			((StringBuilder) (extractorinput)).append("Unsupported WAV bit depth ");
	//  193  384:aload_0         
	//  194  385:ldc1            #133 <String "Unsupported WAV bit depth ">
	//  195  387:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  196  390:pop             
			((StringBuilder) (extractorinput)).append(k1);
	//  197  391:aload_0         
	//  198  392:iload           7
	//  199  394:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//  200  397:pop             
			((StringBuilder) (extractorinput)).append(" for type ");
	//  201  398:aload_0         
	//  202  399:ldc1            #135 <String " for type ">
	//  203  401:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  204  404:pop             
			((StringBuilder) (extractorinput)).append(j);
	//  205  405:aload_0         
	//  206  406:iload_2         
	//  207  407:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//  208  410:pop             
			Log.e("WavHeaderReader", ((StringBuilder) (extractorinput)).toString());
	//  209  411:ldc1            #11  <String "WavHeaderReader">
	//  210  413:aload_0         
	//  211  414:invokevirtual   #89  <Method String StringBuilder.toString()>
	//  212  417:invokestatic    #95  <Method int Log.e(String, String)>
	//  213  420:pop             
			return null;
	//  214  421:aconst_null     
	//  215  422:areturn         
		} else
		{
			extractorinput.advancePeekPosition((int)chunkheader.size - 16);
	//  216  423:aload_0         
	//  217  424:aload           10
	//  218  426:getfield        #101 <Field long WavHeaderReader$ChunkHeader.size>
	//  219  429:l2i             
	//  220  430:bipush          16
	//  221  432:isub            
	//  222  433:invokeinterface #104 <Method void ExtractorInput.advancePeekPosition(int)>
			return new WavHeader(k, l, i1, j1, k1, i);
	//  223  438:new             #137 <Class WavHeader>
	//  224  441:dup             
	//  225  442:iload_3         
	//  226  443:iload           4
	//  227  445:iload           5
	//  228  447:iload           6
	//  229  449:iload           7
	//  230  451:iload_1         
	//  231  452:invokespecial   #140 <Method void WavHeader(int, int, int, int, int, int)>
	//  232  455:areturn         
		}
	}

	public static void skipToData(ExtractorInput extractorinput, WavHeader wavheader)
		throws IOException, InterruptedException
	{
		Assertions.checkNotNull(((Object) (extractorinput)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method Object Assertions.checkNotNull(Object)>
	//    2    4:pop             
		Assertions.checkNotNull(((Object) (wavheader)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #35  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:pop             
		extractorinput.resetPeekPosition();
	//    6   10:aload_0         
	//    7   11:invokeinterface #146 <Method void ExtractorInput.resetPeekPosition()>
		ParsableByteArray parsablebytearray = new ParsableByteArray(8);
	//    8   16:new             #37  <Class ParsableByteArray>
	//    9   19:dup             
	//   10   20:bipush          8
	//   11   22:invokespecial   #40  <Method void ParsableByteArray(int)>
	//   12   25:astore          5
		ChunkHeader chunkheader;
		for(chunkheader = ChunkHeader.peek(extractorinput, parsablebytearray); chunkheader.id != Util.getIntegerCodeForString("data"); chunkheader = ChunkHeader.peek(extractorinput, parsablebytearray))
	//*  13   27:aload_0         
	//*  14   28:aload           5
	//*  15   30:invokestatic    #43  <Method WavHeaderReader$ChunkHeader WavHeaderReader$ChunkHeader.peek(ExtractorInput, ParsableByteArray)>
	//*  16   33:astore          4
	//*  17   35:aload           4
	//*  18   37:getfield        #46  <Field int WavHeaderReader$ChunkHeader.id>
	//*  19   40:ldc1            #147 <String "data">
	//*  20   42:invokestatic    #54  <Method int Util.getIntegerCodeForString(String)>
	//*  21   45:icmpeq          178
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   22   48:new             #75  <Class StringBuilder>
	//   23   51:dup             
	//   24   52:invokespecial   #76  <Method void StringBuilder()>
	//   25   55:astore          6
			stringbuilder.append("Ignoring unknown WAV chunk: ");
	//   26   57:aload           6
	//   27   59:ldc1            #149 <String "Ignoring unknown WAV chunk: ">
	//   28   61:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   29   64:pop             
			stringbuilder.append(chunkheader.id);
	//   30   65:aload           6
	//   31   67:aload           4
	//   32   69:getfield        #46  <Field int WavHeaderReader$ChunkHeader.id>
	//   33   72:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//   34   75:pop             
			Log.w("WavHeaderReader", stringbuilder.toString());
	//   35   76:ldc1            #11  <String "WavHeaderReader">
	//   36   78:aload           6
	//   37   80:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   38   83:invokestatic    #152 <Method int Log.w(String, String)>
	//   39   86:pop             
			long l = 8L + chunkheader.size;
	//   40   87:ldc2w           #153 <Long 8L>
	//   41   90:aload           4
	//   42   92:getfield        #101 <Field long WavHeaderReader$ChunkHeader.size>
	//   43   95:ladd            
	//   44   96:lstore_2        
			if(chunkheader.id == Util.getIntegerCodeForString("RIFF"))
	//*  45   97:aload           4
	//*  46   99:getfield        #46  <Field int WavHeaderReader$ChunkHeader.id>
	//*  47  102:ldc1            #48  <String "RIFF">
	//*  48  104:invokestatic    #54  <Method int Util.getIntegerCodeForString(String)>
	//*  49  107:icmpne          114
				l = 12L;
	//   50  110:ldc2w           #155 <Long 12L>
	//   51  113:lstore_2        
			if(l > 0x7fffffffL)
	//*  52  114:lload_2         
	//*  53  115:ldc2w           #157 <Long 0x7fffffffL>
	//*  54  118:lcmp            
	//*  55  119:ifle            159
			{
				extractorinput = ((ExtractorInput) (new StringBuilder()));
	//   56  122:new             #75  <Class StringBuilder>
	//   57  125:dup             
	//   58  126:invokespecial   #76  <Method void StringBuilder()>
	//   59  129:astore_0        
				((StringBuilder) (extractorinput)).append("Chunk is too large (~2GB+) to skip; id: ");
	//   60  130:aload_0         
	//   61  131:ldc1            #160 <String "Chunk is too large (~2GB+) to skip; id: ">
	//   62  133:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   63  136:pop             
				((StringBuilder) (extractorinput)).append(chunkheader.id);
	//   64  137:aload_0         
	//   65  138:aload           4
	//   66  140:getfield        #46  <Field int WavHeaderReader$ChunkHeader.id>
	//   67  143:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//   68  146:pop             
				throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//   69  147:new             #122 <Class ParserException>
	//   70  150:dup             
	//   71  151:aload_0         
	//   72  152:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   73  155:invokespecial   #125 <Method void ParserException(String)>
	//   74  158:athrow          
			}
			extractorinput.skipFully((int)l);
	//   75  159:aload_0         
	//   76  160:lload_2         
	//   77  161:l2i             
	//   78  162:invokeinterface #163 <Method void ExtractorInput.skipFully(int)>
		}

	//   79  167:aload_0         
	//   80  168:aload           5
	//   81  170:invokestatic    #43  <Method WavHeaderReader$ChunkHeader WavHeaderReader$ChunkHeader.peek(ExtractorInput, ParsableByteArray)>
	//   82  173:astore          4
	//*  83  175:goto            35
		extractorinput.skipFully(8);
	//   84  178:aload_0         
	//   85  179:bipush          8
	//   86  181:invokeinterface #163 <Method void ExtractorInput.skipFully(int)>
		wavheader.setDataBounds(extractorinput.getPosition(), chunkheader.size);
	//   87  186:aload_1         
	//   88  187:aload_0         
	//   89  188:invokeinterface #167 <Method long ExtractorInput.getPosition()>
	//   90  193:aload           4
	//   91  195:getfield        #101 <Field long WavHeaderReader$ChunkHeader.size>
	//   92  198:invokevirtual   #171 <Method void WavHeader.setDataBounds(long, long)>
	//   93  201:return          
	}

	private static final String TAG = "WavHeaderReader";
	private static final int TYPE_FLOAT = 3;
	private static final int TYPE_PCM = 1;
	private static final int TYPE_WAVE_FORMAT_EXTENSIBLE = 65534;
}
