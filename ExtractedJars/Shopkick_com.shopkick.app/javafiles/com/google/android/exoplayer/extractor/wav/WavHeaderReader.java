// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.wav;

import android.util.Log;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.util.*;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor.wav:
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


	WavHeaderReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static WavHeader peek(ExtractorInput extractorinput)
		throws IOException, InterruptedException, ParserException
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
	//    7   14:astore          10
		if(ChunkHeader.peek(extractorinput, parsablebytearray).id != Util.getIntegerCodeForString("RIFF"))
	//*   8   16:aload_0         
	//*   9   17:aload           10
	//*  10   19:invokestatic    #43  <Method WavHeaderReader$ChunkHeader WavHeaderReader$ChunkHeader.peek(ExtractorInput, ParsableByteArray)>
	//*  11   22:getfield        #46  <Field int WavHeaderReader$ChunkHeader.id>
	//*  12   25:ldc1            #48  <String "RIFF">
	//*  13   27:invokestatic    #54  <Method int Util.getIntegerCodeForString(String)>
	//*  14   30:icmpeq          35
			return null;
	//   15   33:aconst_null     
	//   16   34:areturn         
		extractorinput.peekFully(parsablebytearray.data, 0, 4);
	//   17   35:aload_0         
	//   18   36:aload           10
	//   19   38:getfield        #58  <Field byte[] ParsableByteArray.data>
	//   20   41:iconst_0        
	//   21   42:iconst_4        
	//   22   43:invokeinterface #64  <Method void ExtractorInput.peekFully(byte[], int, int)>
		parsablebytearray.setPosition(0);
	//   23   48:aload           10
	//   24   50:iconst_0        
	//   25   51:invokevirtual   #67  <Method void ParsableByteArray.setPosition(int)>
		int i = parsablebytearray.readInt();
	//   26   54:aload           10
	//   27   56:invokevirtual   #71  <Method int ParsableByteArray.readInt()>
	//   28   59:istore_1        
		if(i != Util.getIntegerCodeForString("WAVE"))
	//*  29   60:iload_1         
	//*  30   61:ldc1            #73  <String "WAVE">
	//*  31   63:invokestatic    #54  <Method int Util.getIntegerCodeForString(String)>
	//*  32   66:icmpeq          102
		{
			extractorinput = ((ExtractorInput) (new StringBuilder()));
	//   33   69:new             #75  <Class StringBuilder>
	//   34   72:dup             
	//   35   73:invokespecial   #76  <Method void StringBuilder()>
	//   36   76:astore_0        
			((StringBuilder) (extractorinput)).append("Unsupported RIFF format: ");
	//   37   77:aload_0         
	//   38   78:ldc1            #78  <String "Unsupported RIFF format: ">
	//   39   80:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   40   83:pop             
			((StringBuilder) (extractorinput)).append(i);
	//   41   84:aload_0         
	//   42   85:iload_1         
	//   43   86:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//   44   89:pop             
			Log.e("WavHeaderReader", ((StringBuilder) (extractorinput)).toString());
	//   45   90:ldc1            #11  <String "WavHeaderReader">
	//   46   92:aload_0         
	//   47   93:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   48   96:invokestatic    #95  <Method int Log.e(String, String)>
	//   49   99:pop             
			return null;
	//   50  100:aconst_null     
	//   51  101:areturn         
		}
		ChunkHeader chunkheader;
		for(chunkheader = ChunkHeader.peek(extractorinput, parsablebytearray); chunkheader.id != Util.getIntegerCodeForString("fmt "); chunkheader = ChunkHeader.peek(extractorinput, parsablebytearray))
	//*  52  102:aload_0         
	//*  53  103:aload           10
	//*  54  105:invokestatic    #43  <Method WavHeaderReader$ChunkHeader WavHeaderReader$ChunkHeader.peek(ExtractorInput, ParsableByteArray)>
	//*  55  108:astore          9
	//*  56  110:aload           9
	//*  57  112:getfield        #46  <Field int WavHeaderReader$ChunkHeader.id>
	//*  58  115:ldc1            #97  <String "fmt ">
	//*  59  117:invokestatic    #54  <Method int Util.getIntegerCodeForString(String)>
	//*  60  120:icmpeq          146
			extractorinput.advancePeekPosition((int)chunkheader.size);
	//   61  123:aload_0         
	//   62  124:aload           9
	//   63  126:getfield        #101 <Field long WavHeaderReader$ChunkHeader.size>
	//   64  129:l2i             
	//   65  130:invokeinterface #104 <Method void ExtractorInput.advancePeekPosition(int)>

	//   66  135:aload_0         
	//   67  136:aload           10
	//   68  138:invokestatic    #43  <Method WavHeaderReader$ChunkHeader WavHeaderReader$ChunkHeader.peek(ExtractorInput, ParsableByteArray)>
	//   69  141:astore          9
	//*  70  143:goto            110
		boolean flag;
		if(chunkheader.size >= 16L)
	//*  71  146:aload           9
	//*  72  148:getfield        #101 <Field long WavHeaderReader$ChunkHeader.size>
	//*  73  151:ldc2w           #105 <Long 16L>
	//*  74  154:lcmp            
	//*  75  155:iflt            164
			flag = true;
	//   76  158:iconst_1        
	//   77  159:istore          8
		else
	//*  78  161:goto            167
			flag = false;
	//   79  164:iconst_0        
	//   80  165:istore          8
		Assertions.checkState(flag);
	//   81  167:iload           8
	//   82  169:invokestatic    #110 <Method void Assertions.checkState(boolean)>
		extractorinput.peekFully(parsablebytearray.data, 0, 16);
	//   83  172:aload_0         
	//   84  173:aload           10
	//   85  175:getfield        #58  <Field byte[] ParsableByteArray.data>
	//   86  178:iconst_0        
	//   87  179:bipush          16
	//   88  181:invokeinterface #64  <Method void ExtractorInput.peekFully(byte[], int, int)>
		parsablebytearray.setPosition(0);
	//   89  186:aload           10
	//   90  188:iconst_0        
	//   91  189:invokevirtual   #67  <Method void ParsableByteArray.setPosition(int)>
		i = parsablebytearray.readLittleEndianUnsignedShort();
	//   92  192:aload           10
	//   93  194:invokevirtual   #113 <Method int ParsableByteArray.readLittleEndianUnsignedShort()>
	//   94  197:istore_1        
		int j = parsablebytearray.readLittleEndianUnsignedShort();
	//   95  198:aload           10
	//   96  200:invokevirtual   #113 <Method int ParsableByteArray.readLittleEndianUnsignedShort()>
	//   97  203:istore_2        
		int k = parsablebytearray.readLittleEndianUnsignedIntToInt();
	//   98  204:aload           10
	//   99  206:invokevirtual   #116 <Method int ParsableByteArray.readLittleEndianUnsignedIntToInt()>
	//  100  209:istore_3        
		int l = parsablebytearray.readLittleEndianUnsignedIntToInt();
	//  101  210:aload           10
	//  102  212:invokevirtual   #116 <Method int ParsableByteArray.readLittleEndianUnsignedIntToInt()>
	//  103  215:istore          4
		int i1 = parsablebytearray.readLittleEndianUnsignedShort();
	//  104  217:aload           10
	//  105  219:invokevirtual   #113 <Method int ParsableByteArray.readLittleEndianUnsignedShort()>
	//  106  222:istore          5
		int j1 = parsablebytearray.readLittleEndianUnsignedShort();
	//  107  224:aload           10
	//  108  226:invokevirtual   #113 <Method int ParsableByteArray.readLittleEndianUnsignedShort()>
	//  109  229:istore          6
		int k1 = (j * j1) / 8;
	//  110  231:iload_2         
	//  111  232:iload           6
	//  112  234:imul            
	//  113  235:bipush          8
	//  114  237:idiv            
	//  115  238:istore          7
		if(i1 == k1)
	//* 116  240:iload           5
	//* 117  242:iload           7
	//* 118  244:icmpne          370
		{
			k1 = Util.getPcmEncoding(j1);
	//  119  247:iload           6
	//  120  249:invokestatic    #120 <Method int Util.getPcmEncoding(int)>
	//  121  252:istore          7
			if(k1 == 0)
	//* 122  254:iload           7
	//* 123  256:ifne            293
			{
				extractorinput = ((ExtractorInput) (new StringBuilder()));
	//  124  259:new             #75  <Class StringBuilder>
	//  125  262:dup             
	//  126  263:invokespecial   #76  <Method void StringBuilder()>
	//  127  266:astore_0        
				((StringBuilder) (extractorinput)).append("Unsupported WAV bit depth: ");
	//  128  267:aload_0         
	//  129  268:ldc1            #122 <String "Unsupported WAV bit depth: ">
	//  130  270:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  131  273:pop             
				((StringBuilder) (extractorinput)).append(j1);
	//  132  274:aload_0         
	//  133  275:iload           6
	//  134  277:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//  135  280:pop             
				Log.e("WavHeaderReader", ((StringBuilder) (extractorinput)).toString());
	//  136  281:ldc1            #11  <String "WavHeaderReader">
	//  137  283:aload_0         
	//  138  284:invokevirtual   #89  <Method String StringBuilder.toString()>
	//  139  287:invokestatic    #95  <Method int Log.e(String, String)>
	//  140  290:pop             
				return null;
	//  141  291:aconst_null     
	//  142  292:areturn         
			}
			if(i != 1 && i != 65534)
	//* 143  293:iload_1         
	//* 144  294:iconst_1        
	//* 145  295:icmpeq          337
	//* 146  298:iload_1         
	//* 147  299:ldc1            #16  <Int 65534>
	//* 148  301:icmpeq          337
			{
				extractorinput = ((ExtractorInput) (new StringBuilder()));
	//  149  304:new             #75  <Class StringBuilder>
	//  150  307:dup             
	//  151  308:invokespecial   #76  <Method void StringBuilder()>
	//  152  311:astore_0        
				((StringBuilder) (extractorinput)).append("Unsupported WAV format type: ");
	//  153  312:aload_0         
	//  154  313:ldc1            #124 <String "Unsupported WAV format type: ">
	//  155  315:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  156  318:pop             
				((StringBuilder) (extractorinput)).append(i);
	//  157  319:aload_0         
	//  158  320:iload_1         
	//  159  321:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//  160  324:pop             
				Log.e("WavHeaderReader", ((StringBuilder) (extractorinput)).toString());
	//  161  325:ldc1            #11  <String "WavHeaderReader">
	//  162  327:aload_0         
	//  163  328:invokevirtual   #89  <Method String StringBuilder.toString()>
	//  164  331:invokestatic    #95  <Method int Log.e(String, String)>
	//  165  334:pop             
				return null;
	//  166  335:aconst_null     
	//  167  336:areturn         
			} else
			{
				extractorinput.advancePeekPosition((int)chunkheader.size - 16);
	//  168  337:aload_0         
	//  169  338:aload           9
	//  170  340:getfield        #101 <Field long WavHeaderReader$ChunkHeader.size>
	//  171  343:l2i             
	//  172  344:bipush          16
	//  173  346:isub            
	//  174  347:invokeinterface #104 <Method void ExtractorInput.advancePeekPosition(int)>
				return new WavHeader(j, k, l, i1, j1, k1);
	//  175  352:new             #126 <Class WavHeader>
	//  176  355:dup             
	//  177  356:iload_2         
	//  178  357:iload_3         
	//  179  358:iload           4
	//  180  360:iload           5
	//  181  362:iload           6
	//  182  364:iload           7
	//  183  366:invokespecial   #129 <Method void WavHeader(int, int, int, int, int, int)>
	//  184  369:areturn         
			}
		} else
		{
			extractorinput = ((ExtractorInput) (new StringBuilder()));
	//  185  370:new             #75  <Class StringBuilder>
	//  186  373:dup             
	//  187  374:invokespecial   #76  <Method void StringBuilder()>
	//  188  377:astore_0        
			((StringBuilder) (extractorinput)).append("Expected block alignment: ");
	//  189  378:aload_0         
	//  190  379:ldc1            #131 <String "Expected block alignment: ">
	//  191  381:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  192  384:pop             
			((StringBuilder) (extractorinput)).append(k1);
	//  193  385:aload_0         
	//  194  386:iload           7
	//  195  388:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//  196  391:pop             
			((StringBuilder) (extractorinput)).append("; got: ");
	//  197  392:aload_0         
	//  198  393:ldc1            #133 <String "; got: ">
	//  199  395:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  200  398:pop             
			((StringBuilder) (extractorinput)).append(i1);
	//  201  399:aload_0         
	//  202  400:iload           5
	//  203  402:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//  204  405:pop             
			throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//  205  406:new             #29  <Class ParserException>
	//  206  409:dup             
	//  207  410:aload_0         
	//  208  411:invokevirtual   #89  <Method String StringBuilder.toString()>
	//  209  414:invokespecial   #136 <Method void ParserException(String)>
	//  210  417:athrow          
		}
	}

	public static void skipToData(ExtractorInput extractorinput, WavHeader wavheader)
		throws IOException, InterruptedException, ParserException
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
	//    7   11:invokeinterface #142 <Method void ExtractorInput.resetPeekPosition()>
		ParsableByteArray parsablebytearray = new ParsableByteArray(8);
	//    8   16:new             #37  <Class ParsableByteArray>
	//    9   19:dup             
	//   10   20:bipush          8
	//   11   22:invokespecial   #40  <Method void ParsableByteArray(int)>
	//   12   25:astore          5
		ChunkHeader chunkheader;
		for(chunkheader = ChunkHeader.peek(extractorinput, parsablebytearray); chunkheader.id != Util.getIntegerCodeForString("data");)
	//*  13   27:aload_0         
	//*  14   28:aload           5
	//*  15   30:invokestatic    #43  <Method WavHeaderReader$ChunkHeader WavHeaderReader$ChunkHeader.peek(ExtractorInput, ParsableByteArray)>
	//*  16   33:astore          4
	//*  17   35:aload           4
	//*  18   37:getfield        #46  <Field int WavHeaderReader$ChunkHeader.id>
	//*  19   40:ldc1            #143 <String "data">
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
	//   27   59:ldc1            #145 <String "Ignoring unknown WAV chunk: ">
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
	//   38   83:invokestatic    #148 <Method int Log.w(String, String)>
	//   39   86:pop             
			long l = chunkheader.size + 8L;
	//   40   87:aload           4
	//   41   89:getfield        #101 <Field long WavHeaderReader$ChunkHeader.size>
	//   42   92:ldc2w           #149 <Long 8L>
	//   43   95:ladd            
	//   44   96:lstore_2        
			if(chunkheader.id == Util.getIntegerCodeForString("RIFF"))
	//*  45   97:aload           4
	//*  46   99:getfield        #46  <Field int WavHeaderReader$ChunkHeader.id>
	//*  47  102:ldc1            #48  <String "RIFF">
	//*  48  104:invokestatic    #54  <Method int Util.getIntegerCodeForString(String)>
	//*  49  107:icmpne          114
				l = 12L;
	//   50  110:ldc2w           #151 <Long 12L>
	//   51  113:lstore_2        
			if(l <= 0x7fffffffL)
	//*  52  114:lload_2         
	//*  53  115:ldc2w           #153 <Long 0x7fffffffL>
	//*  54  118:lcmp            
	//*  55  119:ifgt            141
			{
				extractorinput.skipFully((int)l);
	//   56  122:aload_0         
	//   57  123:lload_2         
	//   58  124:l2i             
	//   59  125:invokeinterface #157 <Method void ExtractorInput.skipFully(int)>
				chunkheader = ChunkHeader.peek(extractorinput, parsablebytearray);
	//   60  130:aload_0         
	//   61  131:aload           5
	//   62  133:invokestatic    #43  <Method WavHeaderReader$ChunkHeader WavHeaderReader$ChunkHeader.peek(ExtractorInput, ParsableByteArray)>
	//   63  136:astore          4
			} else
	//*  64  138:goto            35
			{
				extractorinput = ((ExtractorInput) (new StringBuilder()));
	//   65  141:new             #75  <Class StringBuilder>
	//   66  144:dup             
	//   67  145:invokespecial   #76  <Method void StringBuilder()>
	//   68  148:astore_0        
				((StringBuilder) (extractorinput)).append("Chunk is too large (~2GB+) to skip; id: ");
	//   69  149:aload_0         
	//   70  150:ldc1            #159 <String "Chunk is too large (~2GB+) to skip; id: ">
	//   71  152:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   72  155:pop             
				((StringBuilder) (extractorinput)).append(chunkheader.id);
	//   73  156:aload_0         
	//   74  157:aload           4
	//   75  159:getfield        #46  <Field int WavHeaderReader$ChunkHeader.id>
	//   76  162:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//   77  165:pop             
				throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//   78  166:new             #29  <Class ParserException>
	//   79  169:dup             
	//   80  170:aload_0         
	//   81  171:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   82  174:invokespecial   #136 <Method void ParserException(String)>
	//   83  177:athrow          
			}
		}

		extractorinput.skipFully(8);
	//   84  178:aload_0         
	//   85  179:bipush          8
	//   86  181:invokeinterface #157 <Method void ExtractorInput.skipFully(int)>
		wavheader.setDataBounds(extractorinput.getPosition(), chunkheader.size);
	//   87  186:aload_1         
	//   88  187:aload_0         
	//   89  188:invokeinterface #163 <Method long ExtractorInput.getPosition()>
	//   90  193:aload           4
	//   91  195:getfield        #101 <Field long WavHeaderReader$ChunkHeader.size>
	//   92  198:invokevirtual   #167 <Method void WavHeader.setDataBounds(long, long)>
	//   93  201:return          
	}

	private static final String TAG = "WavHeaderReader";
	private static final int TYPE_PCM = 1;
	private static final int TYPE_WAVE_FORMAT_EXTENSIBLE = 65534;
}
