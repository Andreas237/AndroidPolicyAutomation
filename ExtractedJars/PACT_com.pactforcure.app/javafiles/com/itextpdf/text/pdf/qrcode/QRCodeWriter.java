// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;

import java.util.Map;

// Referenced classes of package com.itextpdf.text.pdf.qrcode:
//			QRCode, ByteMatrix, WriterException, ErrorCorrectionLevel, 
//			EncodeHintType, Encoder

public final class QRCodeWriter
{

	public QRCodeWriter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private static ByteMatrix renderResult(QRCode qrcode, int i, int j)
	{
		ByteMatrix bytematrix = qrcode.getMatrix();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method ByteMatrix QRCode.getMatrix()>
	//    2    4:astore          15
		int i2 = bytematrix.getWidth();
	//    3    6:aload           15
	//    4    8:invokevirtual   #26  <Method int ByteMatrix.getWidth()>
	//    5   11:istore          8
		int j2 = bytematrix.getHeight();
	//    6   13:aload           15
	//    7   15:invokevirtual   #29  <Method int ByteMatrix.getHeight()>
	//    8   18:istore          9
		int k = i2 + 8;
	//    9   20:iload           8
	//   10   22:bipush          8
	//   11   24:iadd            
	//   12   25:istore          4
		int i1 = j2 + 8;
	//   13   27:iload           9
	//   14   29:bipush          8
	//   15   31:iadd            
	//   16   32:istore          5
		int k2 = Math.max(i, k);
	//   17   34:iload_1         
	//   18   35:iload           4
	//   19   37:invokestatic    #35  <Method int Math.max(int, int)>
	//   20   40:istore          10
		int l1 = Math.max(j, i1);
	//   21   42:iload_2         
	//   22   43:iload           5
	//   23   45:invokestatic    #35  <Method int Math.max(int, int)>
	//   24   48:istore          7
		int l2 = Math.min(k2 / k, l1 / i1);
	//   25   50:iload           10
	//   26   52:iload           4
	//   27   54:idiv            
	//   28   55:iload           7
	//   29   57:iload           5
	//   30   59:idiv            
	//   31   60:invokestatic    #38  <Method int Math.min(int, int)>
	//   32   63:istore          11
		int k1 = (k2 - i2 * l2) / 2;
	//   33   65:iload           10
	//   34   67:iload           8
	//   35   69:iload           11
	//   36   71:imul            
	//   37   72:isub            
	//   38   73:iconst_2        
	//   39   74:idiv            
	//   40   75:istore          6
		int i3 = (l1 - j2 * l2) / 2;
	//   41   77:iload           7
	//   42   79:iload           9
	//   43   81:iload           11
	//   44   83:imul            
	//   45   84:isub            
	//   46   85:iconst_2        
	//   47   86:idiv            
	//   48   87:istore          12
		qrcode = ((QRCode) (new ByteMatrix(k2, l1)));
	//   49   89:new             #22  <Class ByteMatrix>
	//   50   92:dup             
	//   51   93:iload           10
	//   52   95:iload           7
	//   53   97:invokespecial   #41  <Method void ByteMatrix(int, int)>
	//   54  100:astore_0        
		byte abyte0[][] = ((ByteMatrix) (qrcode)).getArray();
	//   55  101:aload_0         
	//   56  102:invokevirtual   #45  <Method byte[][] ByteMatrix.getArray()>
	//   57  105:astore          13
		byte abyte1[] = new byte[k2];
	//   58  107:iload           10
	//   59  109:newarray        byte[]
	//   60  111:astore          14
		for(i = 0; i < i3; i++)
	//*  61  113:iconst_0        
	//*  62  114:istore_1        
	//*  63  115:iload_1         
	//*  64  116:iload           12
	//*  65  118:icmpge          136
			setRowColor(abyte0[i], (byte)-1);
	//   66  121:aload           13
	//   67  123:iload_1         
	//   68  124:aaload          
	//   69  125:iconst_m1       
	//   70  126:invokestatic    #49  <Method void setRowColor(byte[], byte)>

	//   71  129:iload_1         
	//   72  130:iconst_1        
	//   73  131:iadd            
	//   74  132:istore_1        
	//*  75  133:goto            115
		byte abyte2[][] = bytematrix.getArray();
	//   76  136:aload           15
	//   77  138:invokevirtual   #45  <Method byte[][] ByteMatrix.getArray()>
	//   78  141:astore          15
		for(i = 0; i < j2; i++)
	//*  79  143:iconst_0        
	//*  80  144:istore_1        
	//*  81  145:iload_1         
	//*  82  146:iload           9
	//*  83  148:icmpge          312
		{
			for(j = 0; j < k1; j++)
	//*  84  151:iconst_0        
	//*  85  152:istore_2        
	//*  86  153:iload_2         
	//*  87  154:iload           6
	//*  88  156:icmpge          171
				abyte1[j] = -1;
	//   89  159:aload           14
	//   90  161:iload_2         
	//   91  162:iconst_m1       
	//   92  163:bastore         

	//   93  164:iload_2         
	//   94  165:iconst_1        
	//   95  166:iadd            
	//   96  167:istore_2        
	//*  97  168:goto            153
			int l = k1;
	//   98  171:iload           6
	//   99  173:istore          4
			for(j = 0; j < i2; j++)
	//* 100  175:iconst_0        
	//* 101  176:istore_2        
	//* 102  177:iload_2         
	//* 103  178:iload           8
	//* 104  180:icmpge          242
			{
				byte byte0;
				int j1;
				if(abyte2[i][j] == 1)
	//* 105  183:aload           15
	//* 106  185:iload_1         
	//* 107  186:aaload          
	//* 108  187:iload_2         
	//* 109  188:iaload          
	//* 110  189:iconst_1        
	//* 111  190:icmpne          223
					byte0 = 0;
	//  112  193:iconst_0        
	//  113  194:istore_3        
				else
	//* 114  195:iconst_0        
	//* 115  196:istore          5
	//* 116  198:iload           5
	//* 117  200:iload           11
	//* 118  202:icmpge          228
	//* 119  205:aload           14
	//* 120  207:iload           4
	//* 121  209:iload           5
	//* 122  211:iadd            
	//* 123  212:iload_3         
	//* 124  213:bastore         
	//* 125  214:iload           5
	//* 126  216:iconst_1        
	//* 127  217:iadd            
	//* 128  218:istore          5
	//* 129  220:goto            198
					byte0 = -1;
	//  130  223:iconst_m1       
	//  131  224:istore_3        
				for(j1 = 0; j1 < l2; j1++)
					abyte1[l + j1] = byte0;

	//* 132  225:goto            195
				l += l2;
	//  133  228:iload           4
	//  134  230:iload           11
	//  135  232:iadd            
	//  136  233:istore          4
			}

	//  137  235:iload_2         
	//  138  236:iconst_1        
	//  139  237:iadd            
	//  140  238:istore_2        
	//* 141  239:goto            177
			for(j = k1 + i2 * l2; j < k2; j++)
	//* 142  242:iload           6
	//* 143  244:iload           8
	//* 144  246:iload           11
	//* 145  248:imul            
	//* 146  249:iadd            
	//* 147  250:istore_2        
	//* 148  251:iload_2         
	//* 149  252:iload           10
	//* 150  254:icmpge          269
				abyte1[j] = -1;
	//  151  257:aload           14
	//  152  259:iload_2         
	//  153  260:iconst_m1       
	//  154  261:bastore         

	//  155  262:iload_2         
	//  156  263:iconst_1        
	//  157  264:iadd            
	//  158  265:istore_2        
	//* 159  266:goto            251
			for(j = 0; j < l2; j++)
	//* 160  269:iconst_0        
	//* 161  270:istore_2        
	//* 162  271:iload_2         
	//* 163  272:iload           11
	//* 164  274:icmpge          305
				System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0[i3 + i * l2 + j])), 0, k2);
	//  165  277:aload           14
	//  166  279:iconst_0        
	//  167  280:aload           13
	//  168  282:iload           12
	//  169  284:iload_1         
	//  170  285:iload           11
	//  171  287:imul            
	//  172  288:iadd            
	//  173  289:iload_2         
	//  174  290:iadd            
	//  175  291:aaload          
	//  176  292:iconst_0        
	//  177  293:iload           10
	//  178  295:invokestatic    #55  <Method void System.arraycopy(Object, int, Object, int, int)>

	//  179  298:iload_2         
	//  180  299:iconst_1        
	//  181  300:iadd            
	//  182  301:istore_2        
		}

	//  183  302:goto            271
	//  184  305:iload_1         
	//  185  306:iconst_1        
	//  186  307:iadd            
	//  187  308:istore_1        
	//* 188  309:goto            145
		for(i = i3 + j2 * l2; i < l1; i++)
	//* 189  312:iload           12
	//* 190  314:iload           9
	//* 191  316:iload           11
	//* 192  318:imul            
	//* 193  319:iadd            
	//* 194  320:istore_1        
	//* 195  321:iload_1         
	//* 196  322:iload           7
	//* 197  324:icmpge          342
			setRowColor(abyte0[i], (byte)-1);
	//  198  327:aload           13
	//  199  329:iload_1         
	//  200  330:aaload          
	//  201  331:iconst_m1       
	//  202  332:invokestatic    #49  <Method void setRowColor(byte[], byte)>

	//  203  335:iload_1         
	//  204  336:iconst_1        
	//  205  337:iadd            
	//  206  338:istore_1        
	//* 207  339:goto            321
		return ((ByteMatrix) (qrcode));
	//  208  342:aload_0         
	//  209  343:areturn         
	}

	private static void setRowColor(byte abyte0[], byte byte0)
	{
		for(int i = 0; i < abyte0.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:arraylength     
	//*   5    5:icmpge          19
			abyte0[i] = byte0;
	//    6    8:aload_0         
	//    7    9:iload_2         
	//    8   10:iload_1         
	//    9   11:bastore         

	//   10   12:iload_2         
	//   11   13:iconst_1        
	//   12   14:iadd            
	//   13   15:istore_2        
	//*  14   16:goto            2
	//   15   19:return          
	}

	public ByteMatrix encode(String s, int i, int j)
		throws WriterException
	{
		return encode(s, i, j, ((Map) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #62  <Method ByteMatrix encode(String, int, int, Map)>
	//    6    8:areturn         
	}

	public ByteMatrix encode(String s, int i, int j, Map map)
		throws WriterException
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #68  <Method int String.length()>
	//*   4    8:ifne            21
			throw new IllegalArgumentException("Found empty contents");
	//    5   11:new             #70  <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc1            #72  <String "Found empty contents">
	//    8   17:invokespecial   #75  <Method void IllegalArgumentException(String)>
	//    9   20:athrow          
		if(i < 0 || j < 0)
	//*  10   21:iload_2         
	//*  11   22:iflt            29
	//*  12   25:iload_3         
	//*  13   26:ifge            65
			throw new IllegalArgumentException((new StringBuilder()).append("Requested dimensions are too small: ").append(i).append('x').append(j).toString());
	//   14   29:new             #70  <Class IllegalArgumentException>
	//   15   32:dup             
	//   16   33:new             #77  <Class StringBuilder>
	//   17   36:dup             
	//   18   37:invokespecial   #78  <Method void StringBuilder()>
	//   19   40:ldc1            #80  <String "Requested dimensions are too small: ">
	//   20   42:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   21   45:iload_2         
	//   22   46:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   23   49:bipush          120
	//   24   51:invokevirtual   #90  <Method StringBuilder StringBuilder.append(char)>
	//   25   54:iload_3         
	//   26   55:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   27   58:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   28   61:invokespecial   #75  <Method void IllegalArgumentException(String)>
	//   29   64:athrow          
		Object obj = ((Object) (ErrorCorrectionLevel.L));
	//   30   65:getstatic       #100 <Field ErrorCorrectionLevel ErrorCorrectionLevel.L>
	//   31   68:astore          6
		ErrorCorrectionLevel errorcorrectionlevel = ((ErrorCorrectionLevel) (obj));
	//   32   70:aload           6
	//   33   72:astore          5
		if(map != null)
	//*  34   74:aload           4
	//*  35   76:ifnull          107
		{
			ErrorCorrectionLevel errorcorrectionlevel1 = (ErrorCorrectionLevel)map.get(((Object) (EncodeHintType.ERROR_CORRECTION)));
	//   36   79:aload           4
	//   37   81:getstatic       #106 <Field EncodeHintType EncodeHintType.ERROR_CORRECTION>
	//   38   84:invokeinterface #112 <Method Object Map.get(Object)>
	//   39   89:checkcast       #96  <Class ErrorCorrectionLevel>
	//   40   92:astore          7
			errorcorrectionlevel = ((ErrorCorrectionLevel) (obj));
	//   41   94:aload           6
	//   42   96:astore          5
			if(errorcorrectionlevel1 != null)
	//*  43   98:aload           7
	//*  44  100:ifnull          107
				errorcorrectionlevel = errorcorrectionlevel1;
	//   45  103:aload           7
	//   46  105:astore          5
		}
		obj = ((Object) (new QRCode()));
	//   47  107:new             #16  <Class QRCode>
	//   48  110:dup             
	//   49  111:invokespecial   #113 <Method void QRCode()>
	//   50  114:astore          6
		Encoder.encode(s, errorcorrectionlevel, map, ((QRCode) (obj)));
	//   51  116:aload_1         
	//   52  117:aload           5
	//   53  119:aload           4
	//   54  121:aload           6
	//   55  123:invokestatic    #118 <Method void Encoder.encode(String, ErrorCorrectionLevel, Map, QRCode)>
		return renderResult(((QRCode) (obj)), i, j);
	//   56  126:aload           6
	//   57  128:iload_2         
	//   58  129:iload_3         
	//   59  130:invokestatic    #120 <Method ByteMatrix renderResult(QRCode, int, int)>
	//   60  133:areturn         
	}

	private static final int QUIET_ZONE_SIZE = 4;
}
