// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;


// Referenced classes of package com.itextpdf.text.pdf.qrcode:
//			WriterException, ByteMatrix, BitVector, MaskUtil, 
//			QRCode, ErrorCorrectionLevel

public final class MatrixUtil
{

	private MatrixUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:return          
	}

	public static void buildMatrix(BitVector bitvector, ErrorCorrectionLevel errorcorrectionlevel, int i, int j, ByteMatrix bytematrix)
		throws WriterException
	{
		clearMatrix(bytematrix);
	//    0    0:aload           4
	//    1    2:invokestatic    #46  <Method void clearMatrix(ByteMatrix)>
		embedBasicPatterns(i, bytematrix);
	//    2    5:iload_2         
	//    3    6:aload           4
	//    4    8:invokestatic    #50  <Method void embedBasicPatterns(int, ByteMatrix)>
		embedTypeInfo(errorcorrectionlevel, j, bytematrix);
	//    5   11:aload_1         
	//    6   12:iload_3         
	//    7   13:aload           4
	//    8   15:invokestatic    #54  <Method void embedTypeInfo(ErrorCorrectionLevel, int, ByteMatrix)>
		maybeEmbedVersionInfo(i, bytematrix);
	//    9   18:iload_2         
	//   10   19:aload           4
	//   11   21:invokestatic    #57  <Method void maybeEmbedVersionInfo(int, ByteMatrix)>
		embedDataBits(bitvector, j, bytematrix);
	//   12   24:aload_0         
	//   13   25:iload_3         
	//   14   26:aload           4
	//   15   28:invokestatic    #61  <Method void embedDataBits(BitVector, int, ByteMatrix)>
	//   16   31:return          
	}

	public static int calculateBCHCode(int i, int j)
	{
		int k = findMSBSet(j);
	//    0    0:iload_1         
	//    1    1:invokestatic    #68  <Method int findMSBSet(int)>
	//    2    4:istore_2        
		for(i <<= k - 1; findMSBSet(i) >= k; i ^= j << findMSBSet(i) - k);
	//    3    5:iload_0         
	//    4    6:iload_2         
	//    5    7:iconst_1        
	//    6    8:isub            
	//    7    9:ishl            
	//    8   10:istore_0        
	//    9   11:iload_0         
	//   10   12:invokestatic    #68  <Method int findMSBSet(int)>
	//   11   15:iload_2         
	//   12   16:icmplt          33
	//   13   19:iload_0         
	//   14   20:iload_1         
	//   15   21:iload_0         
	//   16   22:invokestatic    #68  <Method int findMSBSet(int)>
	//   17   25:iload_2         
	//   18   26:isub            
	//   19   27:ishl            
	//   20   28:ixor            
	//   21   29:istore_0        
	//*  22   30:goto            11
		return i;
	//   23   33:iload_0         
	//   24   34:ireturn         
	}

	public static void clearMatrix(ByteMatrix bytematrix)
	{
		bytematrix.clear((byte)-1);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:invokevirtual   #74  <Method void ByteMatrix.clear(byte)>
	//    3    5:return          
	}

	public static void embedBasicPatterns(int i, ByteMatrix bytematrix)
		throws WriterException
	{
		embedPositionDetectionPatternsAndSeparators(bytematrix);
	//    0    0:aload_1         
	//    1    1:invokestatic    #77  <Method void embedPositionDetectionPatternsAndSeparators(ByteMatrix)>
		embedDarkDotAtLeftBottomCorner(bytematrix);
	//    2    4:aload_1         
	//    3    5:invokestatic    #80  <Method void embedDarkDotAtLeftBottomCorner(ByteMatrix)>
		maybeEmbedPositionAdjustmentPatterns(i, bytematrix);
	//    4    8:iload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #83  <Method void maybeEmbedPositionAdjustmentPatterns(int, ByteMatrix)>
		embedTimingPatterns(bytematrix);
	//    7   13:aload_1         
	//    8   14:invokestatic    #86  <Method void embedTimingPatterns(ByteMatrix)>
	//    9   17:return          
	}

	private static void embedDarkDotAtLeftBottomCorner(ByteMatrix bytematrix)
		throws WriterException
	{
		if(bytematrix.get(8, bytematrix.getHeight() - 8) == 0)
	//*   0    0:aload_0         
	//*   1    1:bipush          8
	//*   2    3:aload_0         
	//*   3    4:invokevirtual   #90  <Method int ByteMatrix.getHeight()>
	//*   4    7:bipush          8
	//*   5    9:isub            
	//*   6   10:invokevirtual   #94  <Method byte ByteMatrix.get(int, int)>
	//*   7   13:ifne            24
		{
			throw new WriterException();
	//    8   16:new             #42  <Class WriterException>
	//    9   19:dup             
	//   10   20:invokespecial   #95  <Method void WriterException()>
	//   11   23:athrow          
		} else
		{
			bytematrix.set(8, bytematrix.getHeight() - 8, 1);
	//   12   24:aload_0         
	//   13   25:bipush          8
	//   14   27:aload_0         
	//   15   28:invokevirtual   #90  <Method int ByteMatrix.getHeight()>
	//   16   31:bipush          8
	//   17   33:isub            
	//   18   34:iconst_1        
	//   19   35:invokevirtual   #99  <Method void ByteMatrix.set(int, int, int)>
			return;
	//   20   38:return          
		}
	}

	public static void embedDataBits(BitVector bitvector, int i, ByteMatrix bytematrix)
		throws WriterException
	{
		int k1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          8
		int l = -1;
	//    2    3:iconst_m1       
	//    3    4:istore          5
		int k = bytematrix.getWidth() - 1;
	//    4    6:aload_2         
	//    5    7:invokevirtual   #102 <Method int ByteMatrix.getWidth()>
	//    6   10:iconst_1        
	//    7   11:isub            
	//    8   12:istore          4
		int j = bytematrix.getHeight() - 1;
	//    9   14:aload_2         
	//   10   15:invokevirtual   #90  <Method int ByteMatrix.getHeight()>
	//   11   18:iconst_1        
	//   12   19:isub            
	//   13   20:istore_3        
		while(k > 0) 
	//*  14   21:iload           4
	//*  15   23:ifle            218
		{
			int l1 = k1;
	//   16   26:iload           8
	//   17   28:istore          9
			int i1 = k;
	//   18   30:iload           4
	//   19   32:istore          6
			int j1 = j;
	//   20   34:iload_3         
	//   21   35:istore          7
			if(k == 6)
	//*  22   37:iload           4
	//*  23   39:bipush          6
	//*  24   41:icmpne          57
			{
				i1 = k - 1;
	//   25   44:iload           4
	//   26   46:iconst_1        
	//   27   47:isub            
	//   28   48:istore          6
				j1 = j;
	//   29   50:iload_3         
	//   30   51:istore          7
				l1 = k1;
	//   31   53:iload           8
	//   32   55:istore          9
			}
			while(j1 >= 0 && j1 < bytematrix.getHeight()) 
	//*  33   57:iload           7
	//*  34   59:iflt            194
	//*  35   62:iload           7
	//*  36   64:aload_2         
	//*  37   65:invokevirtual   #90  <Method int ByteMatrix.getHeight()>
	//*  38   68:icmpge          194
			{
				k1 = 0;
	//   39   71:iconst_0        
	//   40   72:istore          8
				j = l1;
	//   41   74:iload           9
	//   42   76:istore_3        
				while(k1 < 2) 
	//*  43   77:iload           8
	//*  44   79:iconst_2        
	//*  45   80:icmpge          181
				{
					int i2 = i1 - k1;
	//   46   83:iload           6
	//   47   85:iload           8
	//   48   87:isub            
	//   49   88:istore          10
					if(isEmpty(((int) (bytematrix.get(i2, j1)))))
	//*  50   90:aload_2         
	//*  51   91:iload           10
	//*  52   93:iload           7
	//*  53   95:invokevirtual   #94  <Method byte ByteMatrix.get(int, int)>
	//*  54   98:invokestatic    #106 <Method boolean isEmpty(int)>
	//*  55  101:ifne            113
	//*  56  104:iload           8
	//*  57  106:iconst_1        
	//*  58  107:iadd            
	//*  59  108:istore          8
	//*  60  110:goto            77
					{
						if(j < bitvector.size())
	//*  61  113:iload_3         
	//*  62  114:aload_0         
	//*  63  115:invokevirtual   #111 <Method int BitVector.size()>
	//*  64  118:icmpge          175
						{
							k = bitvector.at(j);
	//   65  121:aload_0         
	//   66  122:iload_3         
	//   67  123:invokevirtual   #114 <Method int BitVector.at(int)>
	//   68  126:istore          4
							j++;
	//   69  128:iload_3         
	//   70  129:iconst_1        
	//   71  130:iadd            
	//   72  131:istore_3        
						} else
	//*  73  132:iload           4
	//*  74  134:istore          9
	//*  75  136:iload_1         
	//*  76  137:iconst_m1       
	//*  77  138:icmpeq          162
	//*  78  141:iload           4
	//*  79  143:istore          9
	//*  80  145:iload_1         
	//*  81  146:iload           10
	//*  82  148:iload           7
	//*  83  150:invokestatic    #120 <Method boolean MaskUtil.getDataMaskBit(int, int, int)>
	//*  84  153:ifeq            162
	//*  85  156:iload           4
	//*  86  158:iconst_1        
	//*  87  159:ixor            
	//*  88  160:istore          9
	//*  89  162:aload_2         
	//*  90  163:iload           10
	//*  91  165:iload           7
	//*  92  167:iload           9
	//*  93  169:invokevirtual   #99  <Method void ByteMatrix.set(int, int, int)>
	//*  94  172:goto            104
						{
							k = 0;
	//   95  175:iconst_0        
	//   96  176:istore          4
						}
						l1 = k;
						if(i != -1)
						{
							l1 = k;
							if(MaskUtil.getDataMaskBit(i, i2, j1))
								l1 = k ^ 1;
						}
						bytematrix.set(i2, j1, l1);
					}
					k1++;
				}
	//*  97  178:goto            132
				j1 += l;
	//   98  181:iload           7
	//   99  183:iload           5
	//  100  185:iadd            
	//  101  186:istore          7
				l1 = j;
	//  102  188:iload_3         
	//  103  189:istore          9
			}
	//* 104  191:goto            57
			l = -l;
	//  105  194:iload           5
	//  106  196:ineg            
	//  107  197:istore          5
			j = j1 + l;
	//  108  199:iload           7
	//  109  201:iload           5
	//  110  203:iadd            
	//  111  204:istore_3        
			k = i1 - 2;
	//  112  205:iload           6
	//  113  207:iconst_2        
	//  114  208:isub            
	//  115  209:istore          4
			k1 = l1;
	//  116  211:iload           9
	//  117  213:istore          8
		}
	//* 118  215:goto            21
		if(k1 != bitvector.size())
	//* 119  218:iload           8
	//* 120  220:aload_0         
	//* 121  221:invokevirtual   #111 <Method int BitVector.size()>
	//* 122  224:icmpeq          267
			throw new WriterException((new StringBuilder()).append("Not all bits consumed: ").append(k1).append('/').append(bitvector.size()).toString());
	//  123  227:new             #42  <Class WriterException>
	//  124  230:dup             
	//  125  231:new             #122 <Class StringBuilder>
	//  126  234:dup             
	//  127  235:invokespecial   #123 <Method void StringBuilder()>
	//  128  238:ldc1            #125 <String "Not all bits consumed: ">
	//  129  240:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  130  243:iload           8
	//  131  245:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//  132  248:bipush          47
	//  133  250:invokevirtual   #135 <Method StringBuilder StringBuilder.append(char)>
	//  134  253:aload_0         
	//  135  254:invokevirtual   #111 <Method int BitVector.size()>
	//  136  257:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//  137  260:invokevirtual   #139 <Method String StringBuilder.toString()>
	//  138  263:invokespecial   #142 <Method void WriterException(String)>
	//  139  266:athrow          
		else
			return;
	//  140  267:return          
	}

	private static void embedHorizontalSeparationPattern(int i, int j, ByteMatrix bytematrix)
		throws WriterException
	{
		if(HORIZONTAL_SEPARATION_PATTERN[0].length != 8 || HORIZONTAL_SEPARATION_PATTERN.length != 1)
	//*   0    0:getstatic       #26  <Field int[][] HORIZONTAL_SEPARATION_PATTERN>
	//*   1    3:iconst_0        
	//*   2    4:aaload          
	//*   3    5:arraylength     
	//*   4    6:bipush          8
	//*   5    8:icmpne          19
	//*   6   11:getstatic       #26  <Field int[][] HORIZONTAL_SEPARATION_PATTERN>
	//*   7   14:arraylength     
	//*   8   15:iconst_1        
	//*   9   16:icmpeq          29
			throw new WriterException("Bad horizontal separation pattern");
	//   10   19:new             #42  <Class WriterException>
	//   11   22:dup             
	//   12   23:ldc1            #146 <String "Bad horizontal separation pattern">
	//   13   25:invokespecial   #142 <Method void WriterException(String)>
	//   14   28:athrow          
		for(int k = 0; k < 8; k++)
	//*  15   29:iconst_0        
	//*  16   30:istore_3        
	//*  17   31:iload_3         
	//*  18   32:bipush          8
	//*  19   34:icmpge          81
		{
			if(!isEmpty(((int) (bytematrix.get(i + k, j)))))
	//*  20   37:aload_2         
	//*  21   38:iload_0         
	//*  22   39:iload_3         
	//*  23   40:iadd            
	//*  24   41:iload_1         
	//*  25   42:invokevirtual   #94  <Method byte ByteMatrix.get(int, int)>
	//*  26   45:invokestatic    #106 <Method boolean isEmpty(int)>
	//*  27   48:ifne            59
				throw new WriterException();
	//   28   51:new             #42  <Class WriterException>
	//   29   54:dup             
	//   30   55:invokespecial   #95  <Method void WriterException()>
	//   31   58:athrow          
			bytematrix.set(i + k, j, HORIZONTAL_SEPARATION_PATTERN[0][k]);
	//   32   59:aload_2         
	//   33   60:iload_0         
	//   34   61:iload_3         
	//   35   62:iadd            
	//   36   63:iload_1         
	//   37   64:getstatic       #26  <Field int[][] HORIZONTAL_SEPARATION_PATTERN>
	//   38   67:iconst_0        
	//   39   68:aaload          
	//   40   69:iload_3         
	//   41   70:iaload          
	//   42   71:invokevirtual   #99  <Method void ByteMatrix.set(int, int, int)>
		}

	//   43   74:iload_3         
	//   44   75:iconst_1        
	//   45   76:iadd            
	//   46   77:istore_3        
	//*  47   78:goto            31
	//   48   81:return          
	}

	private static void embedPositionAdjustmentPattern(int i, int j, ByteMatrix bytematrix)
		throws WriterException
	{
		if(POSITION_ADJUSTMENT_PATTERN[0].length != 5 || POSITION_ADJUSTMENT_PATTERN.length != 5)
	//*   0    0:getstatic       #30  <Field int[][] POSITION_ADJUSTMENT_PATTERN>
	//*   1    3:iconst_0        
	//*   2    4:aaload          
	//*   3    5:arraylength     
	//*   4    6:iconst_5        
	//*   5    7:icmpne          18
	//*   6   10:getstatic       #30  <Field int[][] POSITION_ADJUSTMENT_PATTERN>
	//*   7   13:arraylength     
	//*   8   14:iconst_5        
	//*   9   15:icmpeq          28
			throw new WriterException("Bad position adjustment");
	//   10   18:new             #42  <Class WriterException>
	//   11   21:dup             
	//   12   22:ldc1            #149 <String "Bad position adjustment">
	//   13   24:invokespecial   #142 <Method void WriterException(String)>
	//   14   27:athrow          
		for(int k = 0; k < 5; k++)
	//*  15   28:iconst_0        
	//*  16   29:istore_3        
	//*  17   30:iload_3         
	//*  18   31:iconst_5        
	//*  19   32:icmpge          104
		{
			for(int l = 0; l < 5; l++)
	//*  20   35:iconst_0        
	//*  21   36:istore          4
	//*  22   38:iload           4
	//*  23   40:iconst_5        
	//*  24   41:icmpge          97
			{
				if(!isEmpty(((int) (bytematrix.get(i + l, j + k)))))
	//*  25   44:aload_2         
	//*  26   45:iload_0         
	//*  27   46:iload           4
	//*  28   48:iadd            
	//*  29   49:iload_1         
	//*  30   50:iload_3         
	//*  31   51:iadd            
	//*  32   52:invokevirtual   #94  <Method byte ByteMatrix.get(int, int)>
	//*  33   55:invokestatic    #106 <Method boolean isEmpty(int)>
	//*  34   58:ifne            69
					throw new WriterException();
	//   35   61:new             #42  <Class WriterException>
	//   36   64:dup             
	//   37   65:invokespecial   #95  <Method void WriterException()>
	//   38   68:athrow          
				bytematrix.set(i + l, j + k, POSITION_ADJUSTMENT_PATTERN[k][l]);
	//   39   69:aload_2         
	//   40   70:iload_0         
	//   41   71:iload           4
	//   42   73:iadd            
	//   43   74:iload_1         
	//   44   75:iload_3         
	//   45   76:iadd            
	//   46   77:getstatic       #30  <Field int[][] POSITION_ADJUSTMENT_PATTERN>
	//   47   80:iload_3         
	//   48   81:aaload          
	//   49   82:iload           4
	//   50   84:iaload          
	//   51   85:invokevirtual   #99  <Method void ByteMatrix.set(int, int, int)>
			}

	//   52   88:iload           4
	//   53   90:iconst_1        
	//   54   91:iadd            
	//   55   92:istore          4
		}

	//   56   94:goto            38
	//   57   97:iload_3         
	//   58   98:iconst_1        
	//   59   99:iadd            
	//   60  100:istore_3        
	//*  61  101:goto            30
	//   62  104:return          
	}

	private static void embedPositionDetectionPattern(int i, int j, ByteMatrix bytematrix)
		throws WriterException
	{
		if(POSITION_DETECTION_PATTERN[0].length != 7 || POSITION_DETECTION_PATTERN.length != 7)
	//*   0    0:getstatic       #24  <Field int[][] POSITION_DETECTION_PATTERN>
	//*   1    3:iconst_0        
	//*   2    4:aaload          
	//*   3    5:arraylength     
	//*   4    6:bipush          7
	//*   5    8:icmpne          20
	//*   6   11:getstatic       #24  <Field int[][] POSITION_DETECTION_PATTERN>
	//*   7   14:arraylength     
	//*   8   15:bipush          7
	//*   9   17:icmpeq          30
			throw new WriterException("Bad position detection pattern");
	//   10   20:new             #42  <Class WriterException>
	//   11   23:dup             
	//   12   24:ldc1            #152 <String "Bad position detection pattern">
	//   13   26:invokespecial   #142 <Method void WriterException(String)>
	//   14   29:athrow          
		for(int k = 0; k < 7; k++)
	//*  15   30:iconst_0        
	//*  16   31:istore_3        
	//*  17   32:iload_3         
	//*  18   33:bipush          7
	//*  19   35:icmpge          108
		{
			for(int l = 0; l < 7; l++)
	//*  20   38:iconst_0        
	//*  21   39:istore          4
	//*  22   41:iload           4
	//*  23   43:bipush          7
	//*  24   45:icmpge          101
			{
				if(!isEmpty(((int) (bytematrix.get(i + l, j + k)))))
	//*  25   48:aload_2         
	//*  26   49:iload_0         
	//*  27   50:iload           4
	//*  28   52:iadd            
	//*  29   53:iload_1         
	//*  30   54:iload_3         
	//*  31   55:iadd            
	//*  32   56:invokevirtual   #94  <Method byte ByteMatrix.get(int, int)>
	//*  33   59:invokestatic    #106 <Method boolean isEmpty(int)>
	//*  34   62:ifne            73
					throw new WriterException();
	//   35   65:new             #42  <Class WriterException>
	//   36   68:dup             
	//   37   69:invokespecial   #95  <Method void WriterException()>
	//   38   72:athrow          
				bytematrix.set(i + l, j + k, POSITION_DETECTION_PATTERN[k][l]);
	//   39   73:aload_2         
	//   40   74:iload_0         
	//   41   75:iload           4
	//   42   77:iadd            
	//   43   78:iload_1         
	//   44   79:iload_3         
	//   45   80:iadd            
	//   46   81:getstatic       #24  <Field int[][] POSITION_DETECTION_PATTERN>
	//   47   84:iload_3         
	//   48   85:aaload          
	//   49   86:iload           4
	//   50   88:iaload          
	//   51   89:invokevirtual   #99  <Method void ByteMatrix.set(int, int, int)>
			}

	//   52   92:iload           4
	//   53   94:iconst_1        
	//   54   95:iadd            
	//   55   96:istore          4
		}

	//   56   98:goto            41
	//   57  101:iload_3         
	//   58  102:iconst_1        
	//   59  103:iadd            
	//   60  104:istore_3        
	//*  61  105:goto            32
	//   62  108:return          
	}

	private static void embedPositionDetectionPatternsAndSeparators(ByteMatrix bytematrix)
		throws WriterException
	{
		int i = POSITION_DETECTION_PATTERN[0].length;
	//    0    0:getstatic       #24  <Field int[][] POSITION_DETECTION_PATTERN>
	//    1    3:iconst_0        
	//    2    4:aaload          
	//    3    5:arraylength     
	//    4    6:istore_1        
		embedPositionDetectionPattern(0, 0, bytematrix);
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:aload_0         
	//    8   10:invokestatic    #154 <Method void embedPositionDetectionPattern(int, int, ByteMatrix)>
		embedPositionDetectionPattern(bytematrix.getWidth() - i, 0, bytematrix);
	//    9   13:aload_0         
	//   10   14:invokevirtual   #102 <Method int ByteMatrix.getWidth()>
	//   11   17:iload_1         
	//   12   18:isub            
	//   13   19:iconst_0        
	//   14   20:aload_0         
	//   15   21:invokestatic    #154 <Method void embedPositionDetectionPattern(int, int, ByteMatrix)>
		embedPositionDetectionPattern(0, bytematrix.getWidth() - i, bytematrix);
	//   16   24:iconst_0        
	//   17   25:aload_0         
	//   18   26:invokevirtual   #102 <Method int ByteMatrix.getWidth()>
	//   19   29:iload_1         
	//   20   30:isub            
	//   21   31:aload_0         
	//   22   32:invokestatic    #154 <Method void embedPositionDetectionPattern(int, int, ByteMatrix)>
		i = HORIZONTAL_SEPARATION_PATTERN[0].length;
	//   23   35:getstatic       #26  <Field int[][] HORIZONTAL_SEPARATION_PATTERN>
	//   24   38:iconst_0        
	//   25   39:aaload          
	//   26   40:arraylength     
	//   27   41:istore_1        
		embedHorizontalSeparationPattern(0, i - 1, bytematrix);
	//   28   42:iconst_0        
	//   29   43:iload_1         
	//   30   44:iconst_1        
	//   31   45:isub            
	//   32   46:aload_0         
	//   33   47:invokestatic    #156 <Method void embedHorizontalSeparationPattern(int, int, ByteMatrix)>
		embedHorizontalSeparationPattern(bytematrix.getWidth() - i, i - 1, bytematrix);
	//   34   50:aload_0         
	//   35   51:invokevirtual   #102 <Method int ByteMatrix.getWidth()>
	//   36   54:iload_1         
	//   37   55:isub            
	//   38   56:iload_1         
	//   39   57:iconst_1        
	//   40   58:isub            
	//   41   59:aload_0         
	//   42   60:invokestatic    #156 <Method void embedHorizontalSeparationPattern(int, int, ByteMatrix)>
		embedHorizontalSeparationPattern(0, bytematrix.getWidth() - i, bytematrix);
	//   43   63:iconst_0        
	//   44   64:aload_0         
	//   45   65:invokevirtual   #102 <Method int ByteMatrix.getWidth()>
	//   46   68:iload_1         
	//   47   69:isub            
	//   48   70:aload_0         
	//   49   71:invokestatic    #156 <Method void embedHorizontalSeparationPattern(int, int, ByteMatrix)>
		i = VERTICAL_SEPARATION_PATTERN.length;
	//   50   74:getstatic       #28  <Field int[][] VERTICAL_SEPARATION_PATTERN>
	//   51   77:arraylength     
	//   52   78:istore_1        
		embedVerticalSeparationPattern(i, 0, bytematrix);
	//   53   79:iload_1         
	//   54   80:iconst_0        
	//   55   81:aload_0         
	//   56   82:invokestatic    #159 <Method void embedVerticalSeparationPattern(int, int, ByteMatrix)>
		embedVerticalSeparationPattern(bytematrix.getHeight() - i - 1, 0, bytematrix);
	//   57   85:aload_0         
	//   58   86:invokevirtual   #90  <Method int ByteMatrix.getHeight()>
	//   59   89:iload_1         
	//   60   90:isub            
	//   61   91:iconst_1        
	//   62   92:isub            
	//   63   93:iconst_0        
	//   64   94:aload_0         
	//   65   95:invokestatic    #159 <Method void embedVerticalSeparationPattern(int, int, ByteMatrix)>
		embedVerticalSeparationPattern(i, bytematrix.getHeight() - i, bytematrix);
	//   66   98:iload_1         
	//   67   99:aload_0         
	//   68  100:invokevirtual   #90  <Method int ByteMatrix.getHeight()>
	//   69  103:iload_1         
	//   70  104:isub            
	//   71  105:aload_0         
	//   72  106:invokestatic    #159 <Method void embedVerticalSeparationPattern(int, int, ByteMatrix)>
	//   73  109:return          
	}

	private static void embedTimingPatterns(ByteMatrix bytematrix)
		throws WriterException
	{
		for(int i = 8; i < bytematrix.getWidth() - 8; i++)
	//*   0    0:bipush          8
	//*   1    2:istore_1        
	//*   2    3:iload_1         
	//*   3    4:aload_0         
	//*   4    5:invokevirtual   #102 <Method int ByteMatrix.getWidth()>
	//*   5    8:bipush          8
	//*   6   10:isub            
	//*   7   11:icmpge          111
		{
			int j = (i + 1) % 2;
	//    8   14:iload_1         
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:iconst_2        
	//   12   18:irem            
	//   13   19:istore_2        
			if(!isValidValue(((int) (bytematrix.get(i, 6)))))
	//*  14   20:aload_0         
	//*  15   21:iload_1         
	//*  16   22:bipush          6
	//*  17   24:invokevirtual   #94  <Method byte ByteMatrix.get(int, int)>
	//*  18   27:invokestatic    #162 <Method boolean isValidValue(int)>
	//*  19   30:ifne            41
				throw new WriterException();
	//   20   33:new             #42  <Class WriterException>
	//   21   36:dup             
	//   22   37:invokespecial   #95  <Method void WriterException()>
	//   23   40:athrow          
			if(isEmpty(((int) (bytematrix.get(i, 6)))))
	//*  24   41:aload_0         
	//*  25   42:iload_1         
	//*  26   43:bipush          6
	//*  27   45:invokevirtual   #94  <Method byte ByteMatrix.get(int, int)>
	//*  28   48:invokestatic    #106 <Method boolean isEmpty(int)>
	//*  29   51:ifeq            62
				bytematrix.set(i, 6, j);
	//   30   54:aload_0         
	//   31   55:iload_1         
	//   32   56:bipush          6
	//   33   58:iload_2         
	//   34   59:invokevirtual   #99  <Method void ByteMatrix.set(int, int, int)>
			if(!isValidValue(((int) (bytematrix.get(6, i)))))
	//*  35   62:aload_0         
	//*  36   63:bipush          6
	//*  37   65:iload_1         
	//*  38   66:invokevirtual   #94  <Method byte ByteMatrix.get(int, int)>
	//*  39   69:invokestatic    #162 <Method boolean isValidValue(int)>
	//*  40   72:ifne            83
				throw new WriterException();
	//   41   75:new             #42  <Class WriterException>
	//   42   78:dup             
	//   43   79:invokespecial   #95  <Method void WriterException()>
	//   44   82:athrow          
			if(isEmpty(((int) (bytematrix.get(6, i)))))
	//*  45   83:aload_0         
	//*  46   84:bipush          6
	//*  47   86:iload_1         
	//*  48   87:invokevirtual   #94  <Method byte ByteMatrix.get(int, int)>
	//*  49   90:invokestatic    #106 <Method boolean isEmpty(int)>
	//*  50   93:ifeq            104
				bytematrix.set(6, i, j);
	//   51   96:aload_0         
	//   52   97:bipush          6
	//   53   99:iload_1         
	//   54  100:iload_2         
	//   55  101:invokevirtual   #99  <Method void ByteMatrix.set(int, int, int)>
		}

	//   56  104:iload_1         
	//   57  105:iconst_1        
	//   58  106:iadd            
	//   59  107:istore_1        
	//*  60  108:goto            3
	//   61  111:return          
	}

	public static void embedTypeInfo(ErrorCorrectionLevel errorcorrectionlevel, int i, ByteMatrix bytematrix)
		throws WriterException
	{
		BitVector bitvector = new BitVector();
	//    0    0:new             #108 <Class BitVector>
	//    1    3:dup             
	//    2    4:invokespecial   #163 <Method void BitVector()>
	//    3    7:astore          4
		makeTypeInfoBits(errorcorrectionlevel, i, bitvector);
	//    4    9:aload_0         
	//    5   10:iload_1         
	//    6   11:aload           4
	//    7   13:invokestatic    #167 <Method void makeTypeInfoBits(ErrorCorrectionLevel, int, BitVector)>
		i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_1        
		while(i < bitvector.size()) 
	//*  10   18:iload_1         
	//*  11   19:aload           4
	//*  12   21:invokevirtual   #111 <Method int BitVector.size()>
	//*  13   24:icmpge          111
		{
			int j = bitvector.at(bitvector.size() - 1 - i);
	//   14   27:aload           4
	//   15   29:aload           4
	//   16   31:invokevirtual   #111 <Method int BitVector.size()>
	//   17   34:iconst_1        
	//   18   35:isub            
	//   19   36:iload_1         
	//   20   37:isub            
	//   21   38:invokevirtual   #114 <Method int BitVector.at(int)>
	//   22   41:istore_3        
			bytematrix.set(TYPE_INFO_COORDINATES[i][0], TYPE_INFO_COORDINATES[i][1], j);
	//   23   42:aload_2         
	//   24   43:getstatic       #34  <Field int[][] TYPE_INFO_COORDINATES>
	//   25   46:iload_1         
	//   26   47:aaload          
	//   27   48:iconst_0        
	//   28   49:iaload          
	//   29   50:getstatic       #34  <Field int[][] TYPE_INFO_COORDINATES>
	//   30   53:iload_1         
	//   31   54:aaload          
	//   32   55:iconst_1        
	//   33   56:iaload          
	//   34   57:iload_3         
	//   35   58:invokevirtual   #99  <Method void ByteMatrix.set(int, int, int)>
			if(i < 8)
	//*  36   61:iload_1         
	//*  37   62:bipush          8
	//*  38   64:icmpge          89
				bytematrix.set(bytematrix.getWidth() - i - 1, 8, j);
	//   39   67:aload_2         
	//   40   68:aload_2         
	//   41   69:invokevirtual   #102 <Method int ByteMatrix.getWidth()>
	//   42   72:iload_1         
	//   43   73:isub            
	//   44   74:iconst_1        
	//   45   75:isub            
	//   46   76:bipush          8
	//   47   78:iload_3         
	//   48   79:invokevirtual   #99  <Method void ByteMatrix.set(int, int, int)>
			else
	//*  49   82:iload_1         
	//*  50   83:iconst_1        
	//*  51   84:iadd            
	//*  52   85:istore_1        
	//*  53   86:goto            18
				bytematrix.set(8, (bytematrix.getHeight() - 7) + (i - 8), j);
	//   54   89:aload_2         
	//   55   90:bipush          8
	//   56   92:aload_2         
	//   57   93:invokevirtual   #90  <Method int ByteMatrix.getHeight()>
	//   58   96:bipush          7
	//   59   98:isub            
	//   60   99:iload_1         
	//   61  100:bipush          8
	//   62  102:isub            
	//   63  103:iadd            
	//   64  104:iload_3         
	//   65  105:invokevirtual   #99  <Method void ByteMatrix.set(int, int, int)>
			i++;
		}
	//*  66  108:goto            82
	//   67  111:return          
	}

	private static void embedVerticalSeparationPattern(int i, int j, ByteMatrix bytematrix)
		throws WriterException
	{
		if(VERTICAL_SEPARATION_PATTERN[0].length != 1 || VERTICAL_SEPARATION_PATTERN.length != 7)
	//*   0    0:getstatic       #28  <Field int[][] VERTICAL_SEPARATION_PATTERN>
	//*   1    3:iconst_0        
	//*   2    4:aaload          
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpne          19
	//*   6   10:getstatic       #28  <Field int[][] VERTICAL_SEPARATION_PATTERN>
	//*   7   13:arraylength     
	//*   8   14:bipush          7
	//*   9   16:icmpeq          29
			throw new WriterException("Bad vertical separation pattern");
	//   10   19:new             #42  <Class WriterException>
	//   11   22:dup             
	//   12   23:ldc1            #169 <String "Bad vertical separation pattern">
	//   13   25:invokespecial   #142 <Method void WriterException(String)>
	//   14   28:athrow          
		for(int k = 0; k < 7; k++)
	//*  15   29:iconst_0        
	//*  16   30:istore_3        
	//*  17   31:iload_3         
	//*  18   32:bipush          7
	//*  19   34:icmpge          81
		{
			if(!isEmpty(((int) (bytematrix.get(i, j + k)))))
	//*  20   37:aload_2         
	//*  21   38:iload_0         
	//*  22   39:iload_1         
	//*  23   40:iload_3         
	//*  24   41:iadd            
	//*  25   42:invokevirtual   #94  <Method byte ByteMatrix.get(int, int)>
	//*  26   45:invokestatic    #106 <Method boolean isEmpty(int)>
	//*  27   48:ifne            59
				throw new WriterException();
	//   28   51:new             #42  <Class WriterException>
	//   29   54:dup             
	//   30   55:invokespecial   #95  <Method void WriterException()>
	//   31   58:athrow          
			bytematrix.set(i, j + k, VERTICAL_SEPARATION_PATTERN[k][0]);
	//   32   59:aload_2         
	//   33   60:iload_0         
	//   34   61:iload_1         
	//   35   62:iload_3         
	//   36   63:iadd            
	//   37   64:getstatic       #28  <Field int[][] VERTICAL_SEPARATION_PATTERN>
	//   38   67:iload_3         
	//   39   68:aaload          
	//   40   69:iconst_0        
	//   41   70:iaload          
	//   42   71:invokevirtual   #99  <Method void ByteMatrix.set(int, int, int)>
		}

	//   43   74:iload_3         
	//   44   75:iconst_1        
	//   45   76:iadd            
	//   46   77:istore_3        
	//*  47   78:goto            31
	//   48   81:return          
	}

	public static int findMSBSet(int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int j = i;
	//    2    2:iload_0         
	//    3    3:istore_1        
		for(i = ((int) (flag)); j != 0; i++)
	//*   4    4:iload_2         
	//*   5    5:istore_0        
	//*   6    6:iload_1         
	//*   7    7:ifeq            21
			j >>>= 1;
	//    8   10:iload_1         
	//    9   11:iconst_1        
	//   10   12:iushr           
	//   11   13:istore_1        

	//   12   14:iload_0         
	//   13   15:iconst_1        
	//   14   16:iadd            
	//   15   17:istore_0        
	//*  16   18:goto            6
		return i;
	//   17   21:iload_0         
	//   18   22:ireturn         
	}

	private static boolean isEmpty(int i)
	{
		return i == -1;
	//    0    0:iload_0         
	//    1    1:iconst_m1       
	//    2    2:icmpne          7
	//    3    5:iconst_1        
	//    4    6:ireturn         
	//    5    7:iconst_0        
	//    6    8:ireturn         
	}

	private static boolean isValidValue(int i)
	{
		return i == -1 || i == 0 || i == 1;
	//    0    0:iload_0         
	//    1    1:iconst_m1       
	//    2    2:icmpeq          14
	//    3    5:iload_0         
	//    4    6:ifeq            14
	//    5    9:iload_0         
	//    6   10:iconst_1        
	//    7   11:icmpne          16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	public static void makeTypeInfoBits(ErrorCorrectionLevel errorcorrectionlevel, int i, BitVector bitvector)
		throws WriterException
	{
		if(!QRCode.isValidMaskPattern(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #174 <Method boolean QRCode.isValidMaskPattern(int)>
	//*   2    4:ifne            17
			throw new WriterException("Invalid mask pattern");
	//    3    7:new             #42  <Class WriterException>
	//    4   10:dup             
	//    5   11:ldc1            #176 <String "Invalid mask pattern">
	//    6   13:invokespecial   #142 <Method void WriterException(String)>
	//    7   16:athrow          
		i = errorcorrectionlevel.getBits() << 3 | i;
	//    8   17:aload_0         
	//    9   18:invokevirtual   #181 <Method int ErrorCorrectionLevel.getBits()>
	//   10   21:iconst_3        
	//   11   22:ishl            
	//   12   23:iload_1         
	//   13   24:ior             
	//   14   25:istore_1        
		bitvector.appendBits(i, 5);
	//   15   26:aload_2         
	//   16   27:iload_1         
	//   17   28:iconst_5        
	//   18   29:invokevirtual   #185 <Method void BitVector.appendBits(int, int)>
		bitvector.appendBits(calculateBCHCode(i, 1335), 10);
	//   19   32:aload_2         
	//   20   33:iload_1         
	//   21   34:sipush          1335
	//   22   37:invokestatic    #187 <Method int calculateBCHCode(int, int)>
	//   23   40:bipush          10
	//   24   42:invokevirtual   #185 <Method void BitVector.appendBits(int, int)>
		errorcorrectionlevel = ((ErrorCorrectionLevel) (new BitVector()));
	//   25   45:new             #108 <Class BitVector>
	//   26   48:dup             
	//   27   49:invokespecial   #163 <Method void BitVector()>
	//   28   52:astore_0        
		((BitVector) (errorcorrectionlevel)).appendBits(21522, 15);
	//   29   53:aload_0         
	//   30   54:sipush          21522
	//   31   57:bipush          15
	//   32   59:invokevirtual   #185 <Method void BitVector.appendBits(int, int)>
		bitvector.xor(((BitVector) (errorcorrectionlevel)));
	//   33   62:aload_2         
	//   34   63:aload_0         
	//   35   64:invokevirtual   #191 <Method void BitVector.xor(BitVector)>
		if(bitvector.size() != 15)
	//*  36   67:aload_2         
	//*  37   68:invokevirtual   #111 <Method int BitVector.size()>
	//*  38   71:bipush          15
	//*  39   73:icmpeq          106
			throw new WriterException((new StringBuilder()).append("should not happen but we got: ").append(bitvector.size()).toString());
	//   40   76:new             #42  <Class WriterException>
	//   41   79:dup             
	//   42   80:new             #122 <Class StringBuilder>
	//   43   83:dup             
	//   44   84:invokespecial   #123 <Method void StringBuilder()>
	//   45   87:ldc1            #193 <String "should not happen but we got: ">
	//   46   89:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   47   92:aload_2         
	//   48   93:invokevirtual   #111 <Method int BitVector.size()>
	//   49   96:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//   50   99:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   51  102:invokespecial   #142 <Method void WriterException(String)>
	//   52  105:athrow          
		else
			return;
	//   53  106:return          
	}

	public static void makeVersionInfoBits(int i, BitVector bitvector)
		throws WriterException
	{
		bitvector.appendBits(i, 6);
	//    0    0:aload_1         
	//    1    1:iload_0         
	//    2    2:bipush          6
	//    3    4:invokevirtual   #185 <Method void BitVector.appendBits(int, int)>
		bitvector.appendBits(calculateBCHCode(i, 7973), 12);
	//    4    7:aload_1         
	//    5    8:iload_0         
	//    6    9:sipush          7973
	//    7   12:invokestatic    #187 <Method int calculateBCHCode(int, int)>
	//    8   15:bipush          12
	//    9   17:invokevirtual   #185 <Method void BitVector.appendBits(int, int)>
		if(bitvector.size() != 18)
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #111 <Method int BitVector.size()>
	//*  12   24:bipush          18
	//*  13   26:icmpeq          59
			throw new WriterException((new StringBuilder()).append("should not happen but we got: ").append(bitvector.size()).toString());
	//   14   29:new             #42  <Class WriterException>
	//   15   32:dup             
	//   16   33:new             #122 <Class StringBuilder>
	//   17   36:dup             
	//   18   37:invokespecial   #123 <Method void StringBuilder()>
	//   19   40:ldc1            #193 <String "should not happen but we got: ">
	//   20   42:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #111 <Method int BitVector.size()>
	//   23   49:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//   24   52:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   25   55:invokespecial   #142 <Method void WriterException(String)>
	//   26   58:athrow          
		else
			return;
	//   27   59:return          
	}

	private static void maybeEmbedPositionAdjustmentPatterns(int i, ByteMatrix bytematrix)
		throws WriterException
	{
		if(i >= 2) goto _L2; else goto _L1
	//    0    0:iload_0         
	//    1    1:iconst_2        
	//    2    2:icmpge          6
_L1:
		return;
	//    3    5:return          
_L2:
		i--;
	//    4    6:iload_0         
	//    5    7:iconst_1        
	//    6    8:isub            
	//    7    9:istore_0        
		int ai[] = POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE[i];
	//    8   10:getstatic       #32  <Field int[][] POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE>
	//    9   13:iload_0         
	//   10   14:aaload          
	//   11   15:astore          6
		int k = POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE[i].length;
	//   12   17:getstatic       #32  <Field int[][] POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE>
	//   13   20:iload_0         
	//   14   21:aaload          
	//   15   22:arraylength     
	//   16   23:istore_3        
		i = 0;
	//   17   24:iconst_0        
	//   18   25:istore_0        
		do
		{
			if(i >= k)
				continue;
	//   19   26:iload_0         
	//   20   27:iload_3         
	//   21   28:icmpge          5
			int j = 0;
	//   22   31:iconst_0        
	//   23   32:istore_2        
			do
			{
				if(j >= k)
					break;
	//   24   33:iload_2         
	//   25   34:iload_3         
	//   26   35:icmpge          98
				int l = ai[i];
	//   27   38:aload           6
	//   28   40:iload_0         
	//   29   41:iaload          
	//   30   42:istore          4
				int i1 = ai[j];
	//   31   44:aload           6
	//   32   46:iload_2         
	//   33   47:iaload          
	//   34   48:istore          5
				if(i1 != -1 && l != -1 && isEmpty(((int) (bytematrix.get(i1, l)))))
	//*  35   50:iload           5
	//*  36   52:iconst_m1       
	//*  37   53:icmpeq          62
	//*  38   56:iload           4
	//*  39   58:iconst_m1       
	//*  40   59:icmpne          69
	//*  41   62:iload_2         
	//*  42   63:iconst_1        
	//*  43   64:iadd            
	//*  44   65:istore_2        
	//*  45   66:goto            33
	//*  46   69:aload_1         
	//*  47   70:iload           5
	//*  48   72:iload           4
	//*  49   74:invokevirtual   #94  <Method byte ByteMatrix.get(int, int)>
	//*  50   77:invokestatic    #106 <Method boolean isEmpty(int)>
	//*  51   80:ifeq            62
					embedPositionAdjustmentPattern(i1 - 2, l - 2, bytematrix);
	//   52   83:iload           5
	//   53   85:iconst_2        
	//   54   86:isub            
	//   55   87:iload           4
	//   56   89:iconst_2        
	//   57   90:isub            
	//   58   91:aload_1         
	//   59   92:invokestatic    #197 <Method void embedPositionAdjustmentPattern(int, int, ByteMatrix)>
				j++;
			} while(true);
	//*  60   95:goto            62
			i++;
	//   61   98:iload_0         
	//   62   99:iconst_1        
	//   63  100:iadd            
	//   64  101:istore_0        
		} while(true);
	//   65  102:goto            26
		if(true) goto _L1; else goto _L3
_L3:
	}

	public static void maybeEmbedVersionInfo(int i, ByteMatrix bytematrix)
		throws WriterException
	{
		if(i >= 7)
	//*   0    0:iload_0         
	//*   1    1:bipush          7
	//*   2    3:icmpge          7
	//*   3    6:return          
		{
			BitVector bitvector = new BitVector();
	//    4    7:new             #108 <Class BitVector>
	//    5   10:dup             
	//    6   11:invokespecial   #163 <Method void BitVector()>
	//    7   14:astore          5
			makeVersionInfoBits(i, bitvector);
	//    8   16:iload_0         
	//    9   17:aload           5
	//   10   19:invokestatic    #199 <Method void makeVersionInfoBits(int, BitVector)>
			int j = 17;
	//   11   22:bipush          17
	//   12   24:istore_2        
			i = 0;
	//   13   25:iconst_0        
	//   14   26:istore_0        
			while(i < 6) 
	//*  15   27:iload_0         
	//*  16   28:bipush          6
	//*  17   30:icmpge          6
			{
				for(int k = 0; k < 3; k++)
	//*  18   33:iconst_0        
	//*  19   34:istore_3        
	//*  20   35:iload_3         
	//*  21   36:iconst_3        
	//*  22   37:icmpge          91
				{
					int l = bitvector.at(j);
	//   23   40:aload           5
	//   24   42:iload_2         
	//   25   43:invokevirtual   #114 <Method int BitVector.at(int)>
	//   26   46:istore          4
					j--;
	//   27   48:iload_2         
	//   28   49:iconst_1        
	//   29   50:isub            
	//   30   51:istore_2        
					bytematrix.set(i, (bytematrix.getHeight() - 11) + k, l);
	//   31   52:aload_1         
	//   32   53:iload_0         
	//   33   54:aload_1         
	//   34   55:invokevirtual   #90  <Method int ByteMatrix.getHeight()>
	//   35   58:bipush          11
	//   36   60:isub            
	//   37   61:iload_3         
	//   38   62:iadd            
	//   39   63:iload           4
	//   40   65:invokevirtual   #99  <Method void ByteMatrix.set(int, int, int)>
					bytematrix.set((bytematrix.getHeight() - 11) + k, i, l);
	//   41   68:aload_1         
	//   42   69:aload_1         
	//   43   70:invokevirtual   #90  <Method int ByteMatrix.getHeight()>
	//   44   73:bipush          11
	//   45   75:isub            
	//   46   76:iload_3         
	//   47   77:iadd            
	//   48   78:iload_0         
	//   49   79:iload           4
	//   50   81:invokevirtual   #99  <Method void ByteMatrix.set(int, int, int)>
				}

	//   51   84:iload_3         
	//   52   85:iconst_1        
	//   53   86:iadd            
	//   54   87:istore_3        
	//*  55   88:goto            35
				i++;
	//   56   91:iload_0         
	//   57   92:iconst_1        
	//   58   93:iadd            
	//   59   94:istore_0        
			}
		}
	//*  60   95:goto            27
	}

	private static final int HORIZONTAL_SEPARATION_PATTERN[][] = {
		{
			0, 0, 0, 0, 0, 0, 0, 0
		}
	};
	private static final int POSITION_ADJUSTMENT_PATTERN[][] = {
		{
			1, 1, 1, 1, 1
		}, {
			1, 0, 0, 0, 1
		}, {
			1, 0, 1, 0, 1
		}, {
			1, 0, 0, 0, 1
		}, {
			1, 1, 1, 1, 1
		}
	};
	private static final int POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE[][];
	private static final int POSITION_DETECTION_PATTERN[][];
	private static final int TYPE_INFO_COORDINATES[][];
	private static final int TYPE_INFO_MASK_PATTERN = 21522;
	private static final int TYPE_INFO_POLY = 1335;
	private static final int VERSION_INFO_POLY = 7973;
	private static final int VERTICAL_SEPARATION_PATTERN[][];

	static 
	{
		int ai[] = {
			1, 0, 1, 1, 1, 0, 1
		};
	//    0    0:bipush          7
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_1        
	//    5    7:iastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:iconst_0        
	//    9   11:iastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:iconst_1        
	//   13   15:iastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:iconst_1        
	//   17   19:iastore         
	//   18   20:dup             
	//   19   21:iconst_4        
	//   20   22:iconst_1        
	//   21   23:iastore         
	//   22   24:dup             
	//   23   25:iconst_5        
	//   24   26:iconst_0        
	//   25   27:iastore         
	//   26   28:dup             
	//   27   29:bipush          6
	//   28   31:iconst_1        
	//   29   32:iastore         
	//   30   33:astore_0        
		POSITION_DETECTION_PATTERN = (new int[][] {
			new int[] {
				1, 1, 1, 1, 1, 1, 1
			}, new int[] {
				1, 0, 0, 0, 0, 0, 1
			}, new int[] {
				1, 0, 1, 1, 1, 0, 1
			}, ai, new int[] {
				1, 0, 1, 1, 1, 0, 1
			}, new int[] {
				1, 0, 0, 0, 0, 0, 1
			}, new int[] {
				1, 1, 1, 1, 1, 1, 1
			}
		});
	//   31   34:bipush          7
	//   32   36:anewarray       int[][]
	//   33   39:dup             
	//   34   40:iconst_0        
	//   35   41:bipush          7
	//   36   43:newarray        int[]
	//   37   45:dup             
	//   38   46:iconst_0        
	//   39   47:iconst_1        
	//   40   48:iastore         
	//   41   49:dup             
	//   42   50:iconst_1        
	//   43   51:iconst_1        
	//   44   52:iastore         
	//   45   53:dup             
	//   46   54:iconst_2        
	//   47   55:iconst_1        
	//   48   56:iastore         
	//   49   57:dup             
	//   50   58:iconst_3        
	//   51   59:iconst_1        
	//   52   60:iastore         
	//   53   61:dup             
	//   54   62:iconst_4        
	//   55   63:iconst_1        
	//   56   64:iastore         
	//   57   65:dup             
	//   58   66:iconst_5        
	//   59   67:iconst_1        
	//   60   68:iastore         
	//   61   69:dup             
	//   62   70:bipush          6
	//   63   72:iconst_1        
	//   64   73:iastore         
	//   65   74:aastore         
	//   66   75:dup             
	//   67   76:iconst_1        
	//   68   77:bipush          7
	//   69   79:newarray        int[]
	//   70   81:dup             
	//   71   82:iconst_0        
	//   72   83:iconst_1        
	//   73   84:iastore         
	//   74   85:dup             
	//   75   86:iconst_1        
	//   76   87:iconst_0        
	//   77   88:iastore         
	//   78   89:dup             
	//   79   90:iconst_2        
	//   80   91:iconst_0        
	//   81   92:iastore         
	//   82   93:dup             
	//   83   94:iconst_3        
	//   84   95:iconst_0        
	//   85   96:iastore         
	//   86   97:dup             
	//   87   98:iconst_4        
	//   88   99:iconst_0        
	//   89  100:iastore         
	//   90  101:dup             
	//   91  102:iconst_5        
	//   92  103:iconst_0        
	//   93  104:iastore         
	//   94  105:dup             
	//   95  106:bipush          6
	//   96  108:iconst_1        
	//   97  109:iastore         
	//   98  110:aastore         
	//   99  111:dup             
	//  100  112:iconst_2        
	//  101  113:bipush          7
	//  102  115:newarray        int[]
	//  103  117:dup             
	//  104  118:iconst_0        
	//  105  119:iconst_1        
	//  106  120:iastore         
	//  107  121:dup             
	//  108  122:iconst_1        
	//  109  123:iconst_0        
	//  110  124:iastore         
	//  111  125:dup             
	//  112  126:iconst_2        
	//  113  127:iconst_1        
	//  114  128:iastore         
	//  115  129:dup             
	//  116  130:iconst_3        
	//  117  131:iconst_1        
	//  118  132:iastore         
	//  119  133:dup             
	//  120  134:iconst_4        
	//  121  135:iconst_1        
	//  122  136:iastore         
	//  123  137:dup             
	//  124  138:iconst_5        
	//  125  139:iconst_0        
	//  126  140:iastore         
	//  127  141:dup             
	//  128  142:bipush          6
	//  129  144:iconst_1        
	//  130  145:iastore         
	//  131  146:aastore         
	//  132  147:dup             
	//  133  148:iconst_3        
	//  134  149:aload_0         
	//  135  150:aastore         
	//  136  151:dup             
	//  137  152:iconst_4        
	//  138  153:bipush          7
	//  139  155:newarray        int[]
	//  140  157:dup             
	//  141  158:iconst_0        
	//  142  159:iconst_1        
	//  143  160:iastore         
	//  144  161:dup             
	//  145  162:iconst_1        
	//  146  163:iconst_0        
	//  147  164:iastore         
	//  148  165:dup             
	//  149  166:iconst_2        
	//  150  167:iconst_1        
	//  151  168:iastore         
	//  152  169:dup             
	//  153  170:iconst_3        
	//  154  171:iconst_1        
	//  155  172:iastore         
	//  156  173:dup             
	//  157  174:iconst_4        
	//  158  175:iconst_1        
	//  159  176:iastore         
	//  160  177:dup             
	//  161  178:iconst_5        
	//  162  179:iconst_0        
	//  163  180:iastore         
	//  164  181:dup             
	//  165  182:bipush          6
	//  166  184:iconst_1        
	//  167  185:iastore         
	//  168  186:aastore         
	//  169  187:dup             
	//  170  188:iconst_5        
	//  171  189:bipush          7
	//  172  191:newarray        int[]
	//  173  193:dup             
	//  174  194:iconst_0        
	//  175  195:iconst_1        
	//  176  196:iastore         
	//  177  197:dup             
	//  178  198:iconst_1        
	//  179  199:iconst_0        
	//  180  200:iastore         
	//  181  201:dup             
	//  182  202:iconst_2        
	//  183  203:iconst_0        
	//  184  204:iastore         
	//  185  205:dup             
	//  186  206:iconst_3        
	//  187  207:iconst_0        
	//  188  208:iastore         
	//  189  209:dup             
	//  190  210:iconst_4        
	//  191  211:iconst_0        
	//  192  212:iastore         
	//  193  213:dup             
	//  194  214:iconst_5        
	//  195  215:iconst_0        
	//  196  216:iastore         
	//  197  217:dup             
	//  198  218:bipush          6
	//  199  220:iconst_1        
	//  200  221:iastore         
	//  201  222:aastore         
	//  202  223:dup             
	//  203  224:bipush          6
	//  204  226:bipush          7
	//  205  228:newarray        int[]
	//  206  230:dup             
	//  207  231:iconst_0        
	//  208  232:iconst_1        
	//  209  233:iastore         
	//  210  234:dup             
	//  211  235:iconst_1        
	//  212  236:iconst_1        
	//  213  237:iastore         
	//  214  238:dup             
	//  215  239:iconst_2        
	//  216  240:iconst_1        
	//  217  241:iastore         
	//  218  242:dup             
	//  219  243:iconst_3        
	//  220  244:iconst_1        
	//  221  245:iastore         
	//  222  246:dup             
	//  223  247:iconst_4        
	//  224  248:iconst_1        
	//  225  249:iastore         
	//  226  250:dup             
	//  227  251:iconst_5        
	//  228  252:iconst_1        
	//  229  253:iastore         
	//  230  254:dup             
	//  231  255:bipush          6
	//  232  257:iconst_1        
	//  233  258:iastore         
	//  234  259:aastore         
	//  235  260:putstatic       #24  <Field int[][] POSITION_DETECTION_PATTERN>
	//  236  263:iconst_1        
	//  237  264:anewarray       int[][]
	//  238  267:dup             
	//  239  268:iconst_0        
	//  240  269:bipush          8
	//  241  271:newarray        int[]
	//  242  273:dup             
	//  243  274:iconst_0        
	//  244  275:iconst_0        
	//  245  276:iastore         
	//  246  277:dup             
	//  247  278:iconst_1        
	//  248  279:iconst_0        
	//  249  280:iastore         
	//  250  281:dup             
	//  251  282:iconst_2        
	//  252  283:iconst_0        
	//  253  284:iastore         
	//  254  285:dup             
	//  255  286:iconst_3        
	//  256  287:iconst_0        
	//  257  288:iastore         
	//  258  289:dup             
	//  259  290:iconst_4        
	//  260  291:iconst_0        
	//  261  292:iastore         
	//  262  293:dup             
	//  263  294:iconst_5        
	//  264  295:iconst_0        
	//  265  296:iastore         
	//  266  297:dup             
	//  267  298:bipush          6
	//  268  300:iconst_0        
	//  269  301:iastore         
	//  270  302:dup             
	//  271  303:bipush          7
	//  272  305:iconst_0        
	//  273  306:iastore         
	//  274  307:aastore         
	//  275  308:putstatic       #26  <Field int[][] HORIZONTAL_SEPARATION_PATTERN>
		ai = (new int[] {
			0
		});
	//  276  311:iconst_1        
	//  277  312:newarray        int[]
	//  278  314:dup             
	//  279  315:iconst_0        
	//  280  316:iconst_0        
	//  281  317:iastore         
	//  282  318:astore_0        
		int ai1[] = {
			0
		};
	//  283  319:iconst_1        
	//  284  320:newarray        int[]
	//  285  322:dup             
	//  286  323:iconst_0        
	//  287  324:iconst_0        
	//  288  325:iastore         
	//  289  326:astore_1        
		int ai2[] = {
			0
		};
	//  290  327:iconst_1        
	//  291  328:newarray        int[]
	//  292  330:dup             
	//  293  331:iconst_0        
	//  294  332:iconst_0        
	//  295  333:iastore         
	//  296  334:astore_2        
		VERTICAL_SEPARATION_PATTERN = (new int[][] {
			new int[] {
				0
			}, ai, ai1, new int[] {
				0
			}, ai2, new int[] {
				0
			}, new int[] {
				0
			}
		});
	//  297  335:bipush          7
	//  298  337:anewarray       int[][]
	//  299  340:dup             
	//  300  341:iconst_0        
	//  301  342:iconst_1        
	//  302  343:newarray        int[]
	//  303  345:dup             
	//  304  346:iconst_0        
	//  305  347:iconst_0        
	//  306  348:iastore         
	//  307  349:aastore         
	//  308  350:dup             
	//  309  351:iconst_1        
	//  310  352:aload_0         
	//  311  353:aastore         
	//  312  354:dup             
	//  313  355:iconst_2        
	//  314  356:aload_1         
	//  315  357:aastore         
	//  316  358:dup             
	//  317  359:iconst_3        
	//  318  360:iconst_1        
	//  319  361:newarray        int[]
	//  320  363:dup             
	//  321  364:iconst_0        
	//  322  365:iconst_0        
	//  323  366:iastore         
	//  324  367:aastore         
	//  325  368:dup             
	//  326  369:iconst_4        
	//  327  370:aload_2         
	//  328  371:aastore         
	//  329  372:dup             
	//  330  373:iconst_5        
	//  331  374:iconst_1        
	//  332  375:newarray        int[]
	//  333  377:dup             
	//  334  378:iconst_0        
	//  335  379:iconst_0        
	//  336  380:iastore         
	//  337  381:aastore         
	//  338  382:dup             
	//  339  383:bipush          6
	//  340  385:iconst_1        
	//  341  386:newarray        int[]
	//  342  388:dup             
	//  343  389:iconst_0        
	//  344  390:iconst_0        
	//  345  391:iastore         
	//  346  392:aastore         
	//  347  393:putstatic       #28  <Field int[][] VERTICAL_SEPARATION_PATTERN>
	//  348  396:iconst_5        
	//  349  397:anewarray       int[][]
	//  350  400:dup             
	//  351  401:iconst_0        
	//  352  402:iconst_5        
	//  353  403:newarray        int[]
	//  354  405:dup             
	//  355  406:iconst_0        
	//  356  407:iconst_1        
	//  357  408:iastore         
	//  358  409:dup             
	//  359  410:iconst_1        
	//  360  411:iconst_1        
	//  361  412:iastore         
	//  362  413:dup             
	//  363  414:iconst_2        
	//  364  415:iconst_1        
	//  365  416:iastore         
	//  366  417:dup             
	//  367  418:iconst_3        
	//  368  419:iconst_1        
	//  369  420:iastore         
	//  370  421:dup             
	//  371  422:iconst_4        
	//  372  423:iconst_1        
	//  373  424:iastore         
	//  374  425:aastore         
	//  375  426:dup             
	//  376  427:iconst_1        
	//  377  428:iconst_5        
	//  378  429:newarray        int[]
	//  379  431:dup             
	//  380  432:iconst_0        
	//  381  433:iconst_1        
	//  382  434:iastore         
	//  383  435:dup             
	//  384  436:iconst_1        
	//  385  437:iconst_0        
	//  386  438:iastore         
	//  387  439:dup             
	//  388  440:iconst_2        
	//  389  441:iconst_0        
	//  390  442:iastore         
	//  391  443:dup             
	//  392  444:iconst_3        
	//  393  445:iconst_0        
	//  394  446:iastore         
	//  395  447:dup             
	//  396  448:iconst_4        
	//  397  449:iconst_1        
	//  398  450:iastore         
	//  399  451:aastore         
	//  400  452:dup             
	//  401  453:iconst_2        
	//  402  454:iconst_5        
	//  403  455:newarray        int[]
	//  404  457:dup             
	//  405  458:iconst_0        
	//  406  459:iconst_1        
	//  407  460:iastore         
	//  408  461:dup             
	//  409  462:iconst_1        
	//  410  463:iconst_0        
	//  411  464:iastore         
	//  412  465:dup             
	//  413  466:iconst_2        
	//  414  467:iconst_1        
	//  415  468:iastore         
	//  416  469:dup             
	//  417  470:iconst_3        
	//  418  471:iconst_0        
	//  419  472:iastore         
	//  420  473:dup             
	//  421  474:iconst_4        
	//  422  475:iconst_1        
	//  423  476:iastore         
	//  424  477:aastore         
	//  425  478:dup             
	//  426  479:iconst_3        
	//  427  480:iconst_5        
	//  428  481:newarray        int[]
	//  429  483:dup             
	//  430  484:iconst_0        
	//  431  485:iconst_1        
	//  432  486:iastore         
	//  433  487:dup             
	//  434  488:iconst_1        
	//  435  489:iconst_0        
	//  436  490:iastore         
	//  437  491:dup             
	//  438  492:iconst_2        
	//  439  493:iconst_0        
	//  440  494:iastore         
	//  441  495:dup             
	//  442  496:iconst_3        
	//  443  497:iconst_0        
	//  444  498:iastore         
	//  445  499:dup             
	//  446  500:iconst_4        
	//  447  501:iconst_1        
	//  448  502:iastore         
	//  449  503:aastore         
	//  450  504:dup             
	//  451  505:iconst_4        
	//  452  506:iconst_5        
	//  453  507:newarray        int[]
	//  454  509:dup             
	//  455  510:iconst_0        
	//  456  511:iconst_1        
	//  457  512:iastore         
	//  458  513:dup             
	//  459  514:iconst_1        
	//  460  515:iconst_1        
	//  461  516:iastore         
	//  462  517:dup             
	//  463  518:iconst_2        
	//  464  519:iconst_1        
	//  465  520:iastore         
	//  466  521:dup             
	//  467  522:iconst_3        
	//  468  523:iconst_1        
	//  469  524:iastore         
	//  470  525:dup             
	//  471  526:iconst_4        
	//  472  527:iconst_1        
	//  473  528:iastore         
	//  474  529:aastore         
	//  475  530:putstatic       #30  <Field int[][] POSITION_ADJUSTMENT_PATTERN>
		ai = (new int[] {
			6, 22, 38, -1, -1, -1, -1
		});
	//  476  533:bipush          7
	//  477  535:newarray        int[]
	//  478  537:dup             
	//  479  538:iconst_0        
	//  480  539:bipush          6
	//  481  541:iastore         
	//  482  542:dup             
	//  483  543:iconst_1        
	//  484  544:bipush          22
	//  485  546:iastore         
	//  486  547:dup             
	//  487  548:iconst_2        
	//  488  549:bipush          38
	//  489  551:iastore         
	//  490  552:dup             
	//  491  553:iconst_3        
	//  492  554:iconst_m1       
	//  493  555:iastore         
	//  494  556:dup             
	//  495  557:iconst_4        
	//  496  558:iconst_m1       
	//  497  559:iastore         
	//  498  560:dup             
	//  499  561:iconst_5        
	//  500  562:iconst_m1       
	//  501  563:iastore         
	//  502  564:dup             
	//  503  565:bipush          6
	//  504  567:iconst_m1       
	//  505  568:iastore         
	//  506  569:astore_0        
		ai1 = (new int[] {
			6, 26, 46, -1, -1, -1, -1
		});
	//  507  570:bipush          7
	//  508  572:newarray        int[]
	//  509  574:dup             
	//  510  575:iconst_0        
	//  511  576:bipush          6
	//  512  578:iastore         
	//  513  579:dup             
	//  514  580:iconst_1        
	//  515  581:bipush          26
	//  516  583:iastore         
	//  517  584:dup             
	//  518  585:iconst_2        
	//  519  586:bipush          46
	//  520  588:iastore         
	//  521  589:dup             
	//  522  590:iconst_3        
	//  523  591:iconst_m1       
	//  524  592:iastore         
	//  525  593:dup             
	//  526  594:iconst_4        
	//  527  595:iconst_m1       
	//  528  596:iastore         
	//  529  597:dup             
	//  530  598:iconst_5        
	//  531  599:iconst_m1       
	//  532  600:iastore         
	//  533  601:dup             
	//  534  602:bipush          6
	//  535  604:iconst_m1       
	//  536  605:iastore         
	//  537  606:astore_1        
		ai2 = (new int[] {
			6, 26, 46, 66, -1, -1, -1
		});
	//  538  607:bipush          7
	//  539  609:newarray        int[]
	//  540  611:dup             
	//  541  612:iconst_0        
	//  542  613:bipush          6
	//  543  615:iastore         
	//  544  616:dup             
	//  545  617:iconst_1        
	//  546  618:bipush          26
	//  547  620:iastore         
	//  548  621:dup             
	//  549  622:iconst_2        
	//  550  623:bipush          46
	//  551  625:iastore         
	//  552  626:dup             
	//  553  627:iconst_3        
	//  554  628:bipush          66
	//  555  630:iastore         
	//  556  631:dup             
	//  557  632:iconst_4        
	//  558  633:iconst_m1       
	//  559  634:iastore         
	//  560  635:dup             
	//  561  636:iconst_5        
	//  562  637:iconst_m1       
	//  563  638:iastore         
	//  564  639:dup             
	//  565  640:bipush          6
	//  566  642:iconst_m1       
	//  567  643:iastore         
	//  568  644:astore_2        
		int ai3[] = {
			6, 30, 58, 86, -1, -1, -1
		};
	//  569  645:bipush          7
	//  570  647:newarray        int[]
	//  571  649:dup             
	//  572  650:iconst_0        
	//  573  651:bipush          6
	//  574  653:iastore         
	//  575  654:dup             
	//  576  655:iconst_1        
	//  577  656:bipush          30
	//  578  658:iastore         
	//  579  659:dup             
	//  580  660:iconst_2        
	//  581  661:bipush          58
	//  582  663:iastore         
	//  583  664:dup             
	//  584  665:iconst_3        
	//  585  666:bipush          86
	//  586  668:iastore         
	//  587  669:dup             
	//  588  670:iconst_4        
	//  589  671:iconst_m1       
	//  590  672:iastore         
	//  591  673:dup             
	//  592  674:iconst_5        
	//  593  675:iconst_m1       
	//  594  676:iastore         
	//  595  677:dup             
	//  596  678:bipush          6
	//  597  680:iconst_m1       
	//  598  681:iastore         
	//  599  682:astore_3        
		int ai4[] = {
			6, 34, 60, 86, 112, 138, -1
		};
	//  600  683:bipush          7
	//  601  685:newarray        int[]
	//  602  687:dup             
	//  603  688:iconst_0        
	//  604  689:bipush          6
	//  605  691:iastore         
	//  606  692:dup             
	//  607  693:iconst_1        
	//  608  694:bipush          34
	//  609  696:iastore         
	//  610  697:dup             
	//  611  698:iconst_2        
	//  612  699:bipush          60
	//  613  701:iastore         
	//  614  702:dup             
	//  615  703:iconst_3        
	//  616  704:bipush          86
	//  617  706:iastore         
	//  618  707:dup             
	//  619  708:iconst_4        
	//  620  709:bipush          112
	//  621  711:iastore         
	//  622  712:dup             
	//  623  713:iconst_5        
	//  624  714:sipush          138
	//  625  717:iastore         
	//  626  718:dup             
	//  627  719:bipush          6
	//  628  721:iconst_m1       
	//  629  722:iastore         
	//  630  723:astore          4
		int ai5[] = {
			6, 30, 54, 78, 102, 126, 150
		};
	//  631  725:bipush          7
	//  632  727:newarray        int[]
	//  633  729:dup             
	//  634  730:iconst_0        
	//  635  731:bipush          6
	//  636  733:iastore         
	//  637  734:dup             
	//  638  735:iconst_1        
	//  639  736:bipush          30
	//  640  738:iastore         
	//  641  739:dup             
	//  642  740:iconst_2        
	//  643  741:bipush          54
	//  644  743:iastore         
	//  645  744:dup             
	//  646  745:iconst_3        
	//  647  746:bipush          78
	//  648  748:iastore         
	//  649  749:dup             
	//  650  750:iconst_4        
	//  651  751:bipush          102
	//  652  753:iastore         
	//  653  754:dup             
	//  654  755:iconst_5        
	//  655  756:bipush          126
	//  656  758:iastore         
	//  657  759:dup             
	//  658  760:bipush          6
	//  659  762:sipush          150
	//  660  765:iastore         
	//  661  766:astore          5
		POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE = (new int[][] {
			new int[] {
				-1, -1, -1, -1, -1, -1, -1
			}, new int[] {
				6, 18, -1, -1, -1, -1, -1
			}, new int[] {
				6, 22, -1, -1, -1, -1, -1
			}, new int[] {
				6, 26, -1, -1, -1, -1, -1
			}, new int[] {
				6, 30, -1, -1, -1, -1, -1
			}, new int[] {
				6, 34, -1, -1, -1, -1, -1
			}, ai, new int[] {
				6, 24, 42, -1, -1, -1, -1
			}, ai1, new int[] {
				6, 28, 50, -1, -1, -1, -1
			}, new int[] {
				6, 30, 54, -1, -1, -1, -1
			}, new int[] {
				6, 32, 58, -1, -1, -1, -1
			}, new int[] {
				6, 34, 62, -1, -1, -1, -1
			}, ai2, new int[] {
				6, 26, 48, 70, -1, -1, -1
			}, new int[] {
				6, 26, 50, 74, -1, -1, -1
			}, new int[] {
				6, 30, 54, 78, -1, -1, -1
			}, new int[] {
				6, 30, 56, 82, -1, -1, -1
			}, ai3, new int[] {
				6, 34, 62, 90, -1, -1, -1
			}, new int[] {
				6, 28, 50, 72, 94, -1, -1
			}, new int[] {
				6, 26, 50, 74, 98, -1, -1
			}, new int[] {
				6, 30, 54, 78, 102, -1, -1
			}, new int[] {
				6, 28, 54, 80, 106, -1, -1
			}, new int[] {
				6, 32, 58, 84, 110, -1, -1
			}, new int[] {
				6, 30, 58, 86, 114, -1, -1
			}, new int[] {
				6, 34, 62, 90, 118, -1, -1
			}, new int[] {
				6, 26, 50, 74, 98, 122, -1
			}, new int[] {
				6, 30, 54, 78, 102, 126, -1
			}, new int[] {
				6, 26, 52, 78, 104, 130, -1
			}, new int[] {
				6, 30, 56, 82, 108, 134, -1
			}, ai4, new int[] {
				6, 30, 58, 86, 114, 142, -1
			}, new int[] {
				6, 34, 62, 90, 118, 146, -1
			}, ai5, new int[] {
				6, 24, 50, 76, 102, 128, 154
			}, new int[] {
				6, 28, 54, 80, 106, 132, 158
			}, new int[] {
				6, 32, 58, 84, 110, 136, 162
			}, new int[] {
				6, 26, 54, 82, 110, 138, 166
			}, new int[] {
				6, 30, 58, 86, 114, 142, 170
			}
		});
	//  662  768:bipush          40
	//  663  770:anewarray       int[][]
	//  664  773:dup             
	//  665  774:iconst_0        
	//  666  775:bipush          7
	//  667  777:newarray        int[]
	//  668  779:dup             
	//  669  780:iconst_0        
	//  670  781:iconst_m1       
	//  671  782:iastore         
	//  672  783:dup             
	//  673  784:iconst_1        
	//  674  785:iconst_m1       
	//  675  786:iastore         
	//  676  787:dup             
	//  677  788:iconst_2        
	//  678  789:iconst_m1       
	//  679  790:iastore         
	//  680  791:dup             
	//  681  792:iconst_3        
	//  682  793:iconst_m1       
	//  683  794:iastore         
	//  684  795:dup             
	//  685  796:iconst_4        
	//  686  797:iconst_m1       
	//  687  798:iastore         
	//  688  799:dup             
	//  689  800:iconst_5        
	//  690  801:iconst_m1       
	//  691  802:iastore         
	//  692  803:dup             
	//  693  804:bipush          6
	//  694  806:iconst_m1       
	//  695  807:iastore         
	//  696  808:aastore         
	//  697  809:dup             
	//  698  810:iconst_1        
	//  699  811:bipush          7
	//  700  813:newarray        int[]
	//  701  815:dup             
	//  702  816:iconst_0        
	//  703  817:bipush          6
	//  704  819:iastore         
	//  705  820:dup             
	//  706  821:iconst_1        
	//  707  822:bipush          18
	//  708  824:iastore         
	//  709  825:dup             
	//  710  826:iconst_2        
	//  711  827:iconst_m1       
	//  712  828:iastore         
	//  713  829:dup             
	//  714  830:iconst_3        
	//  715  831:iconst_m1       
	//  716  832:iastore         
	//  717  833:dup             
	//  718  834:iconst_4        
	//  719  835:iconst_m1       
	//  720  836:iastore         
	//  721  837:dup             
	//  722  838:iconst_5        
	//  723  839:iconst_m1       
	//  724  840:iastore         
	//  725  841:dup             
	//  726  842:bipush          6
	//  727  844:iconst_m1       
	//  728  845:iastore         
	//  729  846:aastore         
	//  730  847:dup             
	//  731  848:iconst_2        
	//  732  849:bipush          7
	//  733  851:newarray        int[]
	//  734  853:dup             
	//  735  854:iconst_0        
	//  736  855:bipush          6
	//  737  857:iastore         
	//  738  858:dup             
	//  739  859:iconst_1        
	//  740  860:bipush          22
	//  741  862:iastore         
	//  742  863:dup             
	//  743  864:iconst_2        
	//  744  865:iconst_m1       
	//  745  866:iastore         
	//  746  867:dup             
	//  747  868:iconst_3        
	//  748  869:iconst_m1       
	//  749  870:iastore         
	//  750  871:dup             
	//  751  872:iconst_4        
	//  752  873:iconst_m1       
	//  753  874:iastore         
	//  754  875:dup             
	//  755  876:iconst_5        
	//  756  877:iconst_m1       
	//  757  878:iastore         
	//  758  879:dup             
	//  759  880:bipush          6
	//  760  882:iconst_m1       
	//  761  883:iastore         
	//  762  884:aastore         
	//  763  885:dup             
	//  764  886:iconst_3        
	//  765  887:bipush          7
	//  766  889:newarray        int[]
	//  767  891:dup             
	//  768  892:iconst_0        
	//  769  893:bipush          6
	//  770  895:iastore         
	//  771  896:dup             
	//  772  897:iconst_1        
	//  773  898:bipush          26
	//  774  900:iastore         
	//  775  901:dup             
	//  776  902:iconst_2        
	//  777  903:iconst_m1       
	//  778  904:iastore         
	//  779  905:dup             
	//  780  906:iconst_3        
	//  781  907:iconst_m1       
	//  782  908:iastore         
	//  783  909:dup             
	//  784  910:iconst_4        
	//  785  911:iconst_m1       
	//  786  912:iastore         
	//  787  913:dup             
	//  788  914:iconst_5        
	//  789  915:iconst_m1       
	//  790  916:iastore         
	//  791  917:dup             
	//  792  918:bipush          6
	//  793  920:iconst_m1       
	//  794  921:iastore         
	//  795  922:aastore         
	//  796  923:dup             
	//  797  924:iconst_4        
	//  798  925:bipush          7
	//  799  927:newarray        int[]
	//  800  929:dup             
	//  801  930:iconst_0        
	//  802  931:bipush          6
	//  803  933:iastore         
	//  804  934:dup             
	//  805  935:iconst_1        
	//  806  936:bipush          30
	//  807  938:iastore         
	//  808  939:dup             
	//  809  940:iconst_2        
	//  810  941:iconst_m1       
	//  811  942:iastore         
	//  812  943:dup             
	//  813  944:iconst_3        
	//  814  945:iconst_m1       
	//  815  946:iastore         
	//  816  947:dup             
	//  817  948:iconst_4        
	//  818  949:iconst_m1       
	//  819  950:iastore         
	//  820  951:dup             
	//  821  952:iconst_5        
	//  822  953:iconst_m1       
	//  823  954:iastore         
	//  824  955:dup             
	//  825  956:bipush          6
	//  826  958:iconst_m1       
	//  827  959:iastore         
	//  828  960:aastore         
	//  829  961:dup             
	//  830  962:iconst_5        
	//  831  963:bipush          7
	//  832  965:newarray        int[]
	//  833  967:dup             
	//  834  968:iconst_0        
	//  835  969:bipush          6
	//  836  971:iastore         
	//  837  972:dup             
	//  838  973:iconst_1        
	//  839  974:bipush          34
	//  840  976:iastore         
	//  841  977:dup             
	//  842  978:iconst_2        
	//  843  979:iconst_m1       
	//  844  980:iastore         
	//  845  981:dup             
	//  846  982:iconst_3        
	//  847  983:iconst_m1       
	//  848  984:iastore         
	//  849  985:dup             
	//  850  986:iconst_4        
	//  851  987:iconst_m1       
	//  852  988:iastore         
	//  853  989:dup             
	//  854  990:iconst_5        
	//  855  991:iconst_m1       
	//  856  992:iastore         
	//  857  993:dup             
	//  858  994:bipush          6
	//  859  996:iconst_m1       
	//  860  997:iastore         
	//  861  998:aastore         
	//  862  999:dup             
	//  863 1000:bipush          6
	//  864 1002:aload_0         
	//  865 1003:aastore         
	//  866 1004:dup             
	//  867 1005:bipush          7
	//  868 1007:bipush          7
	//  869 1009:newarray        int[]
	//  870 1011:dup             
	//  871 1012:iconst_0        
	//  872 1013:bipush          6
	//  873 1015:iastore         
	//  874 1016:dup             
	//  875 1017:iconst_1        
	//  876 1018:bipush          24
	//  877 1020:iastore         
	//  878 1021:dup             
	//  879 1022:iconst_2        
	//  880 1023:bipush          42
	//  881 1025:iastore         
	//  882 1026:dup             
	//  883 1027:iconst_3        
	//  884 1028:iconst_m1       
	//  885 1029:iastore         
	//  886 1030:dup             
	//  887 1031:iconst_4        
	//  888 1032:iconst_m1       
	//  889 1033:iastore         
	//  890 1034:dup             
	//  891 1035:iconst_5        
	//  892 1036:iconst_m1       
	//  893 1037:iastore         
	//  894 1038:dup             
	//  895 1039:bipush          6
	//  896 1041:iconst_m1       
	//  897 1042:iastore         
	//  898 1043:aastore         
	//  899 1044:dup             
	//  900 1045:bipush          8
	//  901 1047:aload_1         
	//  902 1048:aastore         
	//  903 1049:dup             
	//  904 1050:bipush          9
	//  905 1052:bipush          7
	//  906 1054:newarray        int[]
	//  907 1056:dup             
	//  908 1057:iconst_0        
	//  909 1058:bipush          6
	//  910 1060:iastore         
	//  911 1061:dup             
	//  912 1062:iconst_1        
	//  913 1063:bipush          28
	//  914 1065:iastore         
	//  915 1066:dup             
	//  916 1067:iconst_2        
	//  917 1068:bipush          50
	//  918 1070:iastore         
	//  919 1071:dup             
	//  920 1072:iconst_3        
	//  921 1073:iconst_m1       
	//  922 1074:iastore         
	//  923 1075:dup             
	//  924 1076:iconst_4        
	//  925 1077:iconst_m1       
	//  926 1078:iastore         
	//  927 1079:dup             
	//  928 1080:iconst_5        
	//  929 1081:iconst_m1       
	//  930 1082:iastore         
	//  931 1083:dup             
	//  932 1084:bipush          6
	//  933 1086:iconst_m1       
	//  934 1087:iastore         
	//  935 1088:aastore         
	//  936 1089:dup             
	//  937 1090:bipush          10
	//  938 1092:bipush          7
	//  939 1094:newarray        int[]
	//  940 1096:dup             
	//  941 1097:iconst_0        
	//  942 1098:bipush          6
	//  943 1100:iastore         
	//  944 1101:dup             
	//  945 1102:iconst_1        
	//  946 1103:bipush          30
	//  947 1105:iastore         
	//  948 1106:dup             
	//  949 1107:iconst_2        
	//  950 1108:bipush          54
	//  951 1110:iastore         
	//  952 1111:dup             
	//  953 1112:iconst_3        
	//  954 1113:iconst_m1       
	//  955 1114:iastore         
	//  956 1115:dup             
	//  957 1116:iconst_4        
	//  958 1117:iconst_m1       
	//  959 1118:iastore         
	//  960 1119:dup             
	//  961 1120:iconst_5        
	//  962 1121:iconst_m1       
	//  963 1122:iastore         
	//  964 1123:dup             
	//  965 1124:bipush          6
	//  966 1126:iconst_m1       
	//  967 1127:iastore         
	//  968 1128:aastore         
	//  969 1129:dup             
	//  970 1130:bipush          11
	//  971 1132:bipush          7
	//  972 1134:newarray        int[]
	//  973 1136:dup             
	//  974 1137:iconst_0        
	//  975 1138:bipush          6
	//  976 1140:iastore         
	//  977 1141:dup             
	//  978 1142:iconst_1        
	//  979 1143:bipush          32
	//  980 1145:iastore         
	//  981 1146:dup             
	//  982 1147:iconst_2        
	//  983 1148:bipush          58
	//  984 1150:iastore         
	//  985 1151:dup             
	//  986 1152:iconst_3        
	//  987 1153:iconst_m1       
	//  988 1154:iastore         
	//  989 1155:dup             
	//  990 1156:iconst_4        
	//  991 1157:iconst_m1       
	//  992 1158:iastore         
	//  993 1159:dup             
	//  994 1160:iconst_5        
	//  995 1161:iconst_m1       
	//  996 1162:iastore         
	//  997 1163:dup             
	//  998 1164:bipush          6
	//  999 1166:iconst_m1       
	// 1000 1167:iastore         
	// 1001 1168:aastore         
	// 1002 1169:dup             
	// 1003 1170:bipush          12
	// 1004 1172:bipush          7
	// 1005 1174:newarray        int[]
	// 1006 1176:dup             
	// 1007 1177:iconst_0        
	// 1008 1178:bipush          6
	// 1009 1180:iastore         
	// 1010 1181:dup             
	// 1011 1182:iconst_1        
	// 1012 1183:bipush          34
	// 1013 1185:iastore         
	// 1014 1186:dup             
	// 1015 1187:iconst_2        
	// 1016 1188:bipush          62
	// 1017 1190:iastore         
	// 1018 1191:dup             
	// 1019 1192:iconst_3        
	// 1020 1193:iconst_m1       
	// 1021 1194:iastore         
	// 1022 1195:dup             
	// 1023 1196:iconst_4        
	// 1024 1197:iconst_m1       
	// 1025 1198:iastore         
	// 1026 1199:dup             
	// 1027 1200:iconst_5        
	// 1028 1201:iconst_m1       
	// 1029 1202:iastore         
	// 1030 1203:dup             
	// 1031 1204:bipush          6
	// 1032 1206:iconst_m1       
	// 1033 1207:iastore         
	// 1034 1208:aastore         
	// 1035 1209:dup             
	// 1036 1210:bipush          13
	// 1037 1212:aload_2         
	// 1038 1213:aastore         
	// 1039 1214:dup             
	// 1040 1215:bipush          14
	// 1041 1217:bipush          7
	// 1042 1219:newarray        int[]
	// 1043 1221:dup             
	// 1044 1222:iconst_0        
	// 1045 1223:bipush          6
	// 1046 1225:iastore         
	// 1047 1226:dup             
	// 1048 1227:iconst_1        
	// 1049 1228:bipush          26
	// 1050 1230:iastore         
	// 1051 1231:dup             
	// 1052 1232:iconst_2        
	// 1053 1233:bipush          48
	// 1054 1235:iastore         
	// 1055 1236:dup             
	// 1056 1237:iconst_3        
	// 1057 1238:bipush          70
	// 1058 1240:iastore         
	// 1059 1241:dup             
	// 1060 1242:iconst_4        
	// 1061 1243:iconst_m1       
	// 1062 1244:iastore         
	// 1063 1245:dup             
	// 1064 1246:iconst_5        
	// 1065 1247:iconst_m1       
	// 1066 1248:iastore         
	// 1067 1249:dup             
	// 1068 1250:bipush          6
	// 1069 1252:iconst_m1       
	// 1070 1253:iastore         
	// 1071 1254:aastore         
	// 1072 1255:dup             
	// 1073 1256:bipush          15
	// 1074 1258:bipush          7
	// 1075 1260:newarray        int[]
	// 1076 1262:dup             
	// 1077 1263:iconst_0        
	// 1078 1264:bipush          6
	// 1079 1266:iastore         
	// 1080 1267:dup             
	// 1081 1268:iconst_1        
	// 1082 1269:bipush          26
	// 1083 1271:iastore         
	// 1084 1272:dup             
	// 1085 1273:iconst_2        
	// 1086 1274:bipush          50
	// 1087 1276:iastore         
	// 1088 1277:dup             
	// 1089 1278:iconst_3        
	// 1090 1279:bipush          74
	// 1091 1281:iastore         
	// 1092 1282:dup             
	// 1093 1283:iconst_4        
	// 1094 1284:iconst_m1       
	// 1095 1285:iastore         
	// 1096 1286:dup             
	// 1097 1287:iconst_5        
	// 1098 1288:iconst_m1       
	// 1099 1289:iastore         
	// 1100 1290:dup             
	// 1101 1291:bipush          6
	// 1102 1293:iconst_m1       
	// 1103 1294:iastore         
	// 1104 1295:aastore         
	// 1105 1296:dup             
	// 1106 1297:bipush          16
	// 1107 1299:bipush          7
	// 1108 1301:newarray        int[]
	// 1109 1303:dup             
	// 1110 1304:iconst_0        
	// 1111 1305:bipush          6
	// 1112 1307:iastore         
	// 1113 1308:dup             
	// 1114 1309:iconst_1        
	// 1115 1310:bipush          30
	// 1116 1312:iastore         
	// 1117 1313:dup             
	// 1118 1314:iconst_2        
	// 1119 1315:bipush          54
	// 1120 1317:iastore         
	// 1121 1318:dup             
	// 1122 1319:iconst_3        
	// 1123 1320:bipush          78
	// 1124 1322:iastore         
	// 1125 1323:dup             
	// 1126 1324:iconst_4        
	// 1127 1325:iconst_m1       
	// 1128 1326:iastore         
	// 1129 1327:dup             
	// 1130 1328:iconst_5        
	// 1131 1329:iconst_m1       
	// 1132 1330:iastore         
	// 1133 1331:dup             
	// 1134 1332:bipush          6
	// 1135 1334:iconst_m1       
	// 1136 1335:iastore         
	// 1137 1336:aastore         
	// 1138 1337:dup             
	// 1139 1338:bipush          17
	// 1140 1340:bipush          7
	// 1141 1342:newarray        int[]
	// 1142 1344:dup             
	// 1143 1345:iconst_0        
	// 1144 1346:bipush          6
	// 1145 1348:iastore         
	// 1146 1349:dup             
	// 1147 1350:iconst_1        
	// 1148 1351:bipush          30
	// 1149 1353:iastore         
	// 1150 1354:dup             
	// 1151 1355:iconst_2        
	// 1152 1356:bipush          56
	// 1153 1358:iastore         
	// 1154 1359:dup             
	// 1155 1360:iconst_3        
	// 1156 1361:bipush          82
	// 1157 1363:iastore         
	// 1158 1364:dup             
	// 1159 1365:iconst_4        
	// 1160 1366:iconst_m1       
	// 1161 1367:iastore         
	// 1162 1368:dup             
	// 1163 1369:iconst_5        
	// 1164 1370:iconst_m1       
	// 1165 1371:iastore         
	// 1166 1372:dup             
	// 1167 1373:bipush          6
	// 1168 1375:iconst_m1       
	// 1169 1376:iastore         
	// 1170 1377:aastore         
	// 1171 1378:dup             
	// 1172 1379:bipush          18
	// 1173 1381:aload_3         
	// 1174 1382:aastore         
	// 1175 1383:dup             
	// 1176 1384:bipush          19
	// 1177 1386:bipush          7
	// 1178 1388:newarray        int[]
	// 1179 1390:dup             
	// 1180 1391:iconst_0        
	// 1181 1392:bipush          6
	// 1182 1394:iastore         
	// 1183 1395:dup             
	// 1184 1396:iconst_1        
	// 1185 1397:bipush          34
	// 1186 1399:iastore         
	// 1187 1400:dup             
	// 1188 1401:iconst_2        
	// 1189 1402:bipush          62
	// 1190 1404:iastore         
	// 1191 1405:dup             
	// 1192 1406:iconst_3        
	// 1193 1407:bipush          90
	// 1194 1409:iastore         
	// 1195 1410:dup             
	// 1196 1411:iconst_4        
	// 1197 1412:iconst_m1       
	// 1198 1413:iastore         
	// 1199 1414:dup             
	// 1200 1415:iconst_5        
	// 1201 1416:iconst_m1       
	// 1202 1417:iastore         
	// 1203 1418:dup             
	// 1204 1419:bipush          6
	// 1205 1421:iconst_m1       
	// 1206 1422:iastore         
	// 1207 1423:aastore         
	// 1208 1424:dup             
	// 1209 1425:bipush          20
	// 1210 1427:bipush          7
	// 1211 1429:newarray        int[]
	// 1212 1431:dup             
	// 1213 1432:iconst_0        
	// 1214 1433:bipush          6
	// 1215 1435:iastore         
	// 1216 1436:dup             
	// 1217 1437:iconst_1        
	// 1218 1438:bipush          28
	// 1219 1440:iastore         
	// 1220 1441:dup             
	// 1221 1442:iconst_2        
	// 1222 1443:bipush          50
	// 1223 1445:iastore         
	// 1224 1446:dup             
	// 1225 1447:iconst_3        
	// 1226 1448:bipush          72
	// 1227 1450:iastore         
	// 1228 1451:dup             
	// 1229 1452:iconst_4        
	// 1230 1453:bipush          94
	// 1231 1455:iastore         
	// 1232 1456:dup             
	// 1233 1457:iconst_5        
	// 1234 1458:iconst_m1       
	// 1235 1459:iastore         
	// 1236 1460:dup             
	// 1237 1461:bipush          6
	// 1238 1463:iconst_m1       
	// 1239 1464:iastore         
	// 1240 1465:aastore         
	// 1241 1466:dup             
	// 1242 1467:bipush          21
	// 1243 1469:bipush          7
	// 1244 1471:newarray        int[]
	// 1245 1473:dup             
	// 1246 1474:iconst_0        
	// 1247 1475:bipush          6
	// 1248 1477:iastore         
	// 1249 1478:dup             
	// 1250 1479:iconst_1        
	// 1251 1480:bipush          26
	// 1252 1482:iastore         
	// 1253 1483:dup             
	// 1254 1484:iconst_2        
	// 1255 1485:bipush          50
	// 1256 1487:iastore         
	// 1257 1488:dup             
	// 1258 1489:iconst_3        
	// 1259 1490:bipush          74
	// 1260 1492:iastore         
	// 1261 1493:dup             
	// 1262 1494:iconst_4        
	// 1263 1495:bipush          98
	// 1264 1497:iastore         
	// 1265 1498:dup             
	// 1266 1499:iconst_5        
	// 1267 1500:iconst_m1       
	// 1268 1501:iastore         
	// 1269 1502:dup             
	// 1270 1503:bipush          6
	// 1271 1505:iconst_m1       
	// 1272 1506:iastore         
	// 1273 1507:aastore         
	// 1274 1508:dup             
	// 1275 1509:bipush          22
	// 1276 1511:bipush          7
	// 1277 1513:newarray        int[]
	// 1278 1515:dup             
	// 1279 1516:iconst_0        
	// 1280 1517:bipush          6
	// 1281 1519:iastore         
	// 1282 1520:dup             
	// 1283 1521:iconst_1        
	// 1284 1522:bipush          30
	// 1285 1524:iastore         
	// 1286 1525:dup             
	// 1287 1526:iconst_2        
	// 1288 1527:bipush          54
	// 1289 1529:iastore         
	// 1290 1530:dup             
	// 1291 1531:iconst_3        
	// 1292 1532:bipush          78
	// 1293 1534:iastore         
	// 1294 1535:dup             
	// 1295 1536:iconst_4        
	// 1296 1537:bipush          102
	// 1297 1539:iastore         
	// 1298 1540:dup             
	// 1299 1541:iconst_5        
	// 1300 1542:iconst_m1       
	// 1301 1543:iastore         
	// 1302 1544:dup             
	// 1303 1545:bipush          6
	// 1304 1547:iconst_m1       
	// 1305 1548:iastore         
	// 1306 1549:aastore         
	// 1307 1550:dup             
	// 1308 1551:bipush          23
	// 1309 1553:bipush          7
	// 1310 1555:newarray        int[]
	// 1311 1557:dup             
	// 1312 1558:iconst_0        
	// 1313 1559:bipush          6
	// 1314 1561:iastore         
	// 1315 1562:dup             
	// 1316 1563:iconst_1        
	// 1317 1564:bipush          28
	// 1318 1566:iastore         
	// 1319 1567:dup             
	// 1320 1568:iconst_2        
	// 1321 1569:bipush          54
	// 1322 1571:iastore         
	// 1323 1572:dup             
	// 1324 1573:iconst_3        
	// 1325 1574:bipush          80
	// 1326 1576:iastore         
	// 1327 1577:dup             
	// 1328 1578:iconst_4        
	// 1329 1579:bipush          106
	// 1330 1581:iastore         
	// 1331 1582:dup             
	// 1332 1583:iconst_5        
	// 1333 1584:iconst_m1       
	// 1334 1585:iastore         
	// 1335 1586:dup             
	// 1336 1587:bipush          6
	// 1337 1589:iconst_m1       
	// 1338 1590:iastore         
	// 1339 1591:aastore         
	// 1340 1592:dup             
	// 1341 1593:bipush          24
	// 1342 1595:bipush          7
	// 1343 1597:newarray        int[]
	// 1344 1599:dup             
	// 1345 1600:iconst_0        
	// 1346 1601:bipush          6
	// 1347 1603:iastore         
	// 1348 1604:dup             
	// 1349 1605:iconst_1        
	// 1350 1606:bipush          32
	// 1351 1608:iastore         
	// 1352 1609:dup             
	// 1353 1610:iconst_2        
	// 1354 1611:bipush          58
	// 1355 1613:iastore         
	// 1356 1614:dup             
	// 1357 1615:iconst_3        
	// 1358 1616:bipush          84
	// 1359 1618:iastore         
	// 1360 1619:dup             
	// 1361 1620:iconst_4        
	// 1362 1621:bipush          110
	// 1363 1623:iastore         
	// 1364 1624:dup             
	// 1365 1625:iconst_5        
	// 1366 1626:iconst_m1       
	// 1367 1627:iastore         
	// 1368 1628:dup             
	// 1369 1629:bipush          6
	// 1370 1631:iconst_m1       
	// 1371 1632:iastore         
	// 1372 1633:aastore         
	// 1373 1634:dup             
	// 1374 1635:bipush          25
	// 1375 1637:bipush          7
	// 1376 1639:newarray        int[]
	// 1377 1641:dup             
	// 1378 1642:iconst_0        
	// 1379 1643:bipush          6
	// 1380 1645:iastore         
	// 1381 1646:dup             
	// 1382 1647:iconst_1        
	// 1383 1648:bipush          30
	// 1384 1650:iastore         
	// 1385 1651:dup             
	// 1386 1652:iconst_2        
	// 1387 1653:bipush          58
	// 1388 1655:iastore         
	// 1389 1656:dup             
	// 1390 1657:iconst_3        
	// 1391 1658:bipush          86
	// 1392 1660:iastore         
	// 1393 1661:dup             
	// 1394 1662:iconst_4        
	// 1395 1663:bipush          114
	// 1396 1665:iastore         
	// 1397 1666:dup             
	// 1398 1667:iconst_5        
	// 1399 1668:iconst_m1       
	// 1400 1669:iastore         
	// 1401 1670:dup             
	// 1402 1671:bipush          6
	// 1403 1673:iconst_m1       
	// 1404 1674:iastore         
	// 1405 1675:aastore         
	// 1406 1676:dup             
	// 1407 1677:bipush          26
	// 1408 1679:bipush          7
	// 1409 1681:newarray        int[]
	// 1410 1683:dup             
	// 1411 1684:iconst_0        
	// 1412 1685:bipush          6
	// 1413 1687:iastore         
	// 1414 1688:dup             
	// 1415 1689:iconst_1        
	// 1416 1690:bipush          34
	// 1417 1692:iastore         
	// 1418 1693:dup             
	// 1419 1694:iconst_2        
	// 1420 1695:bipush          62
	// 1421 1697:iastore         
	// 1422 1698:dup             
	// 1423 1699:iconst_3        
	// 1424 1700:bipush          90
	// 1425 1702:iastore         
	// 1426 1703:dup             
	// 1427 1704:iconst_4        
	// 1428 1705:bipush          118
	// 1429 1707:iastore         
	// 1430 1708:dup             
	// 1431 1709:iconst_5        
	// 1432 1710:iconst_m1       
	// 1433 1711:iastore         
	// 1434 1712:dup             
	// 1435 1713:bipush          6
	// 1436 1715:iconst_m1       
	// 1437 1716:iastore         
	// 1438 1717:aastore         
	// 1439 1718:dup             
	// 1440 1719:bipush          27
	// 1441 1721:bipush          7
	// 1442 1723:newarray        int[]
	// 1443 1725:dup             
	// 1444 1726:iconst_0        
	// 1445 1727:bipush          6
	// 1446 1729:iastore         
	// 1447 1730:dup             
	// 1448 1731:iconst_1        
	// 1449 1732:bipush          26
	// 1450 1734:iastore         
	// 1451 1735:dup             
	// 1452 1736:iconst_2        
	// 1453 1737:bipush          50
	// 1454 1739:iastore         
	// 1455 1740:dup             
	// 1456 1741:iconst_3        
	// 1457 1742:bipush          74
	// 1458 1744:iastore         
	// 1459 1745:dup             
	// 1460 1746:iconst_4        
	// 1461 1747:bipush          98
	// 1462 1749:iastore         
	// 1463 1750:dup             
	// 1464 1751:iconst_5        
	// 1465 1752:bipush          122
	// 1466 1754:iastore         
	// 1467 1755:dup             
	// 1468 1756:bipush          6
	// 1469 1758:iconst_m1       
	// 1470 1759:iastore         
	// 1471 1760:aastore         
	// 1472 1761:dup             
	// 1473 1762:bipush          28
	// 1474 1764:bipush          7
	// 1475 1766:newarray        int[]
	// 1476 1768:dup             
	// 1477 1769:iconst_0        
	// 1478 1770:bipush          6
	// 1479 1772:iastore         
	// 1480 1773:dup             
	// 1481 1774:iconst_1        
	// 1482 1775:bipush          30
	// 1483 1777:iastore         
	// 1484 1778:dup             
	// 1485 1779:iconst_2        
	// 1486 1780:bipush          54
	// 1487 1782:iastore         
	// 1488 1783:dup             
	// 1489 1784:iconst_3        
	// 1490 1785:bipush          78
	// 1491 1787:iastore         
	// 1492 1788:dup             
	// 1493 1789:iconst_4        
	// 1494 1790:bipush          102
	// 1495 1792:iastore         
	// 1496 1793:dup             
	// 1497 1794:iconst_5        
	// 1498 1795:bipush          126
	// 1499 1797:iastore         
	// 1500 1798:dup             
	// 1501 1799:bipush          6
	// 1502 1801:iconst_m1       
	// 1503 1802:iastore         
	// 1504 1803:aastore         
	// 1505 1804:dup             
	// 1506 1805:bipush          29
	// 1507 1807:bipush          7
	// 1508 1809:newarray        int[]
	// 1509 1811:dup             
	// 1510 1812:iconst_0        
	// 1511 1813:bipush          6
	// 1512 1815:iastore         
	// 1513 1816:dup             
	// 1514 1817:iconst_1        
	// 1515 1818:bipush          26
	// 1516 1820:iastore         
	// 1517 1821:dup             
	// 1518 1822:iconst_2        
	// 1519 1823:bipush          52
	// 1520 1825:iastore         
	// 1521 1826:dup             
	// 1522 1827:iconst_3        
	// 1523 1828:bipush          78
	// 1524 1830:iastore         
	// 1525 1831:dup             
	// 1526 1832:iconst_4        
	// 1527 1833:bipush          104
	// 1528 1835:iastore         
	// 1529 1836:dup             
	// 1530 1837:iconst_5        
	// 1531 1838:sipush          130
	// 1532 1841:iastore         
	// 1533 1842:dup             
	// 1534 1843:bipush          6
	// 1535 1845:iconst_m1       
	// 1536 1846:iastore         
	// 1537 1847:aastore         
	// 1538 1848:dup             
	// 1539 1849:bipush          30
	// 1540 1851:bipush          7
	// 1541 1853:newarray        int[]
	// 1542 1855:dup             
	// 1543 1856:iconst_0        
	// 1544 1857:bipush          6
	// 1545 1859:iastore         
	// 1546 1860:dup             
	// 1547 1861:iconst_1        
	// 1548 1862:bipush          30
	// 1549 1864:iastore         
	// 1550 1865:dup             
	// 1551 1866:iconst_2        
	// 1552 1867:bipush          56
	// 1553 1869:iastore         
	// 1554 1870:dup             
	// 1555 1871:iconst_3        
	// 1556 1872:bipush          82
	// 1557 1874:iastore         
	// 1558 1875:dup             
	// 1559 1876:iconst_4        
	// 1560 1877:bipush          108
	// 1561 1879:iastore         
	// 1562 1880:dup             
	// 1563 1881:iconst_5        
	// 1564 1882:sipush          134
	// 1565 1885:iastore         
	// 1566 1886:dup             
	// 1567 1887:bipush          6
	// 1568 1889:iconst_m1       
	// 1569 1890:iastore         
	// 1570 1891:aastore         
	// 1571 1892:dup             
	// 1572 1893:bipush          31
	// 1573 1895:aload           4
	// 1574 1897:aastore         
	// 1575 1898:dup             
	// 1576 1899:bipush          32
	// 1577 1901:bipush          7
	// 1578 1903:newarray        int[]
	// 1579 1905:dup             
	// 1580 1906:iconst_0        
	// 1581 1907:bipush          6
	// 1582 1909:iastore         
	// 1583 1910:dup             
	// 1584 1911:iconst_1        
	// 1585 1912:bipush          30
	// 1586 1914:iastore         
	// 1587 1915:dup             
	// 1588 1916:iconst_2        
	// 1589 1917:bipush          58
	// 1590 1919:iastore         
	// 1591 1920:dup             
	// 1592 1921:iconst_3        
	// 1593 1922:bipush          86
	// 1594 1924:iastore         
	// 1595 1925:dup             
	// 1596 1926:iconst_4        
	// 1597 1927:bipush          114
	// 1598 1929:iastore         
	// 1599 1930:dup             
	// 1600 1931:iconst_5        
	// 1601 1932:sipush          142
	// 1602 1935:iastore         
	// 1603 1936:dup             
	// 1604 1937:bipush          6
	// 1605 1939:iconst_m1       
	// 1606 1940:iastore         
	// 1607 1941:aastore         
	// 1608 1942:dup             
	// 1609 1943:bipush          33
	// 1610 1945:bipush          7
	// 1611 1947:newarray        int[]
	// 1612 1949:dup             
	// 1613 1950:iconst_0        
	// 1614 1951:bipush          6
	// 1615 1953:iastore         
	// 1616 1954:dup             
	// 1617 1955:iconst_1        
	// 1618 1956:bipush          34
	// 1619 1958:iastore         
	// 1620 1959:dup             
	// 1621 1960:iconst_2        
	// 1622 1961:bipush          62
	// 1623 1963:iastore         
	// 1624 1964:dup             
	// 1625 1965:iconst_3        
	// 1626 1966:bipush          90
	// 1627 1968:iastore         
	// 1628 1969:dup             
	// 1629 1970:iconst_4        
	// 1630 1971:bipush          118
	// 1631 1973:iastore         
	// 1632 1974:dup             
	// 1633 1975:iconst_5        
	// 1634 1976:sipush          146
	// 1635 1979:iastore         
	// 1636 1980:dup             
	// 1637 1981:bipush          6
	// 1638 1983:iconst_m1       
	// 1639 1984:iastore         
	// 1640 1985:aastore         
	// 1641 1986:dup             
	// 1642 1987:bipush          34
	// 1643 1989:aload           5
	// 1644 1991:aastore         
	// 1645 1992:dup             
	// 1646 1993:bipush          35
	// 1647 1995:bipush          7
	// 1648 1997:newarray        int[]
	// 1649 1999:dup             
	// 1650 2000:iconst_0        
	// 1651 2001:bipush          6
	// 1652 2003:iastore         
	// 1653 2004:dup             
	// 1654 2005:iconst_1        
	// 1655 2006:bipush          24
	// 1656 2008:iastore         
	// 1657 2009:dup             
	// 1658 2010:iconst_2        
	// 1659 2011:bipush          50
	// 1660 2013:iastore         
	// 1661 2014:dup             
	// 1662 2015:iconst_3        
	// 1663 2016:bipush          76
	// 1664 2018:iastore         
	// 1665 2019:dup             
	// 1666 2020:iconst_4        
	// 1667 2021:bipush          102
	// 1668 2023:iastore         
	// 1669 2024:dup             
	// 1670 2025:iconst_5        
	// 1671 2026:sipush          128
	// 1672 2029:iastore         
	// 1673 2030:dup             
	// 1674 2031:bipush          6
	// 1675 2033:sipush          154
	// 1676 2036:iastore         
	// 1677 2037:aastore         
	// 1678 2038:dup             
	// 1679 2039:bipush          36
	// 1680 2041:bipush          7
	// 1681 2043:newarray        int[]
	// 1682 2045:dup             
	// 1683 2046:iconst_0        
	// 1684 2047:bipush          6
	// 1685 2049:iastore         
	// 1686 2050:dup             
	// 1687 2051:iconst_1        
	// 1688 2052:bipush          28
	// 1689 2054:iastore         
	// 1690 2055:dup             
	// 1691 2056:iconst_2        
	// 1692 2057:bipush          54
	// 1693 2059:iastore         
	// 1694 2060:dup             
	// 1695 2061:iconst_3        
	// 1696 2062:bipush          80
	// 1697 2064:iastore         
	// 1698 2065:dup             
	// 1699 2066:iconst_4        
	// 1700 2067:bipush          106
	// 1701 2069:iastore         
	// 1702 2070:dup             
	// 1703 2071:iconst_5        
	// 1704 2072:sipush          132
	// 1705 2075:iastore         
	// 1706 2076:dup             
	// 1707 2077:bipush          6
	// 1708 2079:sipush          158
	// 1709 2082:iastore         
	// 1710 2083:aastore         
	// 1711 2084:dup             
	// 1712 2085:bipush          37
	// 1713 2087:bipush          7
	// 1714 2089:newarray        int[]
	// 1715 2091:dup             
	// 1716 2092:iconst_0        
	// 1717 2093:bipush          6
	// 1718 2095:iastore         
	// 1719 2096:dup             
	// 1720 2097:iconst_1        
	// 1721 2098:bipush          32
	// 1722 2100:iastore         
	// 1723 2101:dup             
	// 1724 2102:iconst_2        
	// 1725 2103:bipush          58
	// 1726 2105:iastore         
	// 1727 2106:dup             
	// 1728 2107:iconst_3        
	// 1729 2108:bipush          84
	// 1730 2110:iastore         
	// 1731 2111:dup             
	// 1732 2112:iconst_4        
	// 1733 2113:bipush          110
	// 1734 2115:iastore         
	// 1735 2116:dup             
	// 1736 2117:iconst_5        
	// 1737 2118:sipush          136
	// 1738 2121:iastore         
	// 1739 2122:dup             
	// 1740 2123:bipush          6
	// 1741 2125:sipush          162
	// 1742 2128:iastore         
	// 1743 2129:aastore         
	// 1744 2130:dup             
	// 1745 2131:bipush          38
	// 1746 2133:bipush          7
	// 1747 2135:newarray        int[]
	// 1748 2137:dup             
	// 1749 2138:iconst_0        
	// 1750 2139:bipush          6
	// 1751 2141:iastore         
	// 1752 2142:dup             
	// 1753 2143:iconst_1        
	// 1754 2144:bipush          26
	// 1755 2146:iastore         
	// 1756 2147:dup             
	// 1757 2148:iconst_2        
	// 1758 2149:bipush          54
	// 1759 2151:iastore         
	// 1760 2152:dup             
	// 1761 2153:iconst_3        
	// 1762 2154:bipush          82
	// 1763 2156:iastore         
	// 1764 2157:dup             
	// 1765 2158:iconst_4        
	// 1766 2159:bipush          110
	// 1767 2161:iastore         
	// 1768 2162:dup             
	// 1769 2163:iconst_5        
	// 1770 2164:sipush          138
	// 1771 2167:iastore         
	// 1772 2168:dup             
	// 1773 2169:bipush          6
	// 1774 2171:sipush          166
	// 1775 2174:iastore         
	// 1776 2175:aastore         
	// 1777 2176:dup             
	// 1778 2177:bipush          39
	// 1779 2179:bipush          7
	// 1780 2181:newarray        int[]
	// 1781 2183:dup             
	// 1782 2184:iconst_0        
	// 1783 2185:bipush          6
	// 1784 2187:iastore         
	// 1785 2188:dup             
	// 1786 2189:iconst_1        
	// 1787 2190:bipush          30
	// 1788 2192:iastore         
	// 1789 2193:dup             
	// 1790 2194:iconst_2        
	// 1791 2195:bipush          58
	// 1792 2197:iastore         
	// 1793 2198:dup             
	// 1794 2199:iconst_3        
	// 1795 2200:bipush          86
	// 1796 2202:iastore         
	// 1797 2203:dup             
	// 1798 2204:iconst_4        
	// 1799 2205:bipush          114
	// 1800 2207:iastore         
	// 1801 2208:dup             
	// 1802 2209:iconst_5        
	// 1803 2210:sipush          142
	// 1804 2213:iastore         
	// 1805 2214:dup             
	// 1806 2215:bipush          6
	// 1807 2217:sipush          170
	// 1808 2220:iastore         
	// 1809 2221:aastore         
	// 1810 2222:putstatic       #32  <Field int[][] POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE>
		ai = (new int[] {
			8, 0
		});
	// 1811 2225:iconst_2        
	// 1812 2226:newarray        int[]
	// 1813 2228:dup             
	// 1814 2229:iconst_0        
	// 1815 2230:bipush          8
	// 1816 2232:iastore         
	// 1817 2233:dup             
	// 1818 2234:iconst_1        
	// 1819 2235:iconst_0        
	// 1820 2236:iastore         
	// 1821 2237:astore_0        
		ai1 = (new int[] {
			8, 1
		});
	// 1822 2238:iconst_2        
	// 1823 2239:newarray        int[]
	// 1824 2241:dup             
	// 1825 2242:iconst_0        
	// 1826 2243:bipush          8
	// 1827 2245:iastore         
	// 1828 2246:dup             
	// 1829 2247:iconst_1        
	// 1830 2248:iconst_1        
	// 1831 2249:iastore         
	// 1832 2250:astore_1        
		ai2 = (new int[] {
			8, 2
		});
	// 1833 2251:iconst_2        
	// 1834 2252:newarray        int[]
	// 1835 2254:dup             
	// 1836 2255:iconst_0        
	// 1837 2256:bipush          8
	// 1838 2258:iastore         
	// 1839 2259:dup             
	// 1840 2260:iconst_1        
	// 1841 2261:iconst_2        
	// 1842 2262:iastore         
	// 1843 2263:astore_2        
		ai3 = (new int[] {
			8, 7
		});
	// 1844 2264:iconst_2        
	// 1845 2265:newarray        int[]
	// 1846 2267:dup             
	// 1847 2268:iconst_0        
	// 1848 2269:bipush          8
	// 1849 2271:iastore         
	// 1850 2272:dup             
	// 1851 2273:iconst_1        
	// 1852 2274:bipush          7
	// 1853 2276:iastore         
	// 1854 2277:astore_3        
		ai4 = (new int[] {
			8, 8
		});
	// 1855 2278:iconst_2        
	// 1856 2279:newarray        int[]
	// 1857 2281:dup             
	// 1858 2282:iconst_0        
	// 1859 2283:bipush          8
	// 1860 2285:iastore         
	// 1861 2286:dup             
	// 1862 2287:iconst_1        
	// 1863 2288:bipush          8
	// 1864 2290:iastore         
	// 1865 2291:astore          4
		ai5 = (new int[] {
			4, 8
		});
	// 1866 2293:iconst_2        
	// 1867 2294:newarray        int[]
	// 1868 2296:dup             
	// 1869 2297:iconst_0        
	// 1870 2298:iconst_4        
	// 1871 2299:iastore         
	// 1872 2300:dup             
	// 1873 2301:iconst_1        
	// 1874 2302:bipush          8
	// 1875 2304:iastore         
	// 1876 2305:astore          5
		int ai6[] = {
			1, 8
		};
	// 1877 2307:iconst_2        
	// 1878 2308:newarray        int[]
	// 1879 2310:dup             
	// 1880 2311:iconst_0        
	// 1881 2312:iconst_1        
	// 1882 2313:iastore         
	// 1883 2314:dup             
	// 1884 2315:iconst_1        
	// 1885 2316:bipush          8
	// 1886 2318:iastore         
	// 1887 2319:astore          6
		TYPE_INFO_COORDINATES = (new int[][] {
			ai, ai1, ai2, new int[] {
				8, 3
			}, new int[] {
				8, 4
			}, new int[] {
				8, 5
			}, ai3, ai4, new int[] {
				7, 8
			}, new int[] {
				5, 8
			}, 
			ai5, new int[] {
				3, 8
			}, new int[] {
				2, 8
			}, ai6, new int[] {
				0, 8
			}
		});
	// 1888 2321:bipush          15
	// 1889 2323:anewarray       int[][]
	// 1890 2326:dup             
	// 1891 2327:iconst_0        
	// 1892 2328:aload_0         
	// 1893 2329:aastore         
	// 1894 2330:dup             
	// 1895 2331:iconst_1        
	// 1896 2332:aload_1         
	// 1897 2333:aastore         
	// 1898 2334:dup             
	// 1899 2335:iconst_2        
	// 1900 2336:aload_2         
	// 1901 2337:aastore         
	// 1902 2338:dup             
	// 1903 2339:iconst_3        
	// 1904 2340:iconst_2        
	// 1905 2341:newarray        int[]
	// 1906 2343:dup             
	// 1907 2344:iconst_0        
	// 1908 2345:bipush          8
	// 1909 2347:iastore         
	// 1910 2348:dup             
	// 1911 2349:iconst_1        
	// 1912 2350:iconst_3        
	// 1913 2351:iastore         
	// 1914 2352:aastore         
	// 1915 2353:dup             
	// 1916 2354:iconst_4        
	// 1917 2355:iconst_2        
	// 1918 2356:newarray        int[]
	// 1919 2358:dup             
	// 1920 2359:iconst_0        
	// 1921 2360:bipush          8
	// 1922 2362:iastore         
	// 1923 2363:dup             
	// 1924 2364:iconst_1        
	// 1925 2365:iconst_4        
	// 1926 2366:iastore         
	// 1927 2367:aastore         
	// 1928 2368:dup             
	// 1929 2369:iconst_5        
	// 1930 2370:iconst_2        
	// 1931 2371:newarray        int[]
	// 1932 2373:dup             
	// 1933 2374:iconst_0        
	// 1934 2375:bipush          8
	// 1935 2377:iastore         
	// 1936 2378:dup             
	// 1937 2379:iconst_1        
	// 1938 2380:iconst_5        
	// 1939 2381:iastore         
	// 1940 2382:aastore         
	// 1941 2383:dup             
	// 1942 2384:bipush          6
	// 1943 2386:aload_3         
	// 1944 2387:aastore         
	// 1945 2388:dup             
	// 1946 2389:bipush          7
	// 1947 2391:aload           4
	// 1948 2393:aastore         
	// 1949 2394:dup             
	// 1950 2395:bipush          8
	// 1951 2397:iconst_2        
	// 1952 2398:newarray        int[]
	// 1953 2400:dup             
	// 1954 2401:iconst_0        
	// 1955 2402:bipush          7
	// 1956 2404:iastore         
	// 1957 2405:dup             
	// 1958 2406:iconst_1        
	// 1959 2407:bipush          8
	// 1960 2409:iastore         
	// 1961 2410:aastore         
	// 1962 2411:dup             
	// 1963 2412:bipush          9
	// 1964 2414:iconst_2        
	// 1965 2415:newarray        int[]
	// 1966 2417:dup             
	// 1967 2418:iconst_0        
	// 1968 2419:iconst_5        
	// 1969 2420:iastore         
	// 1970 2421:dup             
	// 1971 2422:iconst_1        
	// 1972 2423:bipush          8
	// 1973 2425:iastore         
	// 1974 2426:aastore         
	// 1975 2427:dup             
	// 1976 2428:bipush          10
	// 1977 2430:aload           5
	// 1978 2432:aastore         
	// 1979 2433:dup             
	// 1980 2434:bipush          11
	// 1981 2436:iconst_2        
	// 1982 2437:newarray        int[]
	// 1983 2439:dup             
	// 1984 2440:iconst_0        
	// 1985 2441:iconst_3        
	// 1986 2442:iastore         
	// 1987 2443:dup             
	// 1988 2444:iconst_1        
	// 1989 2445:bipush          8
	// 1990 2447:iastore         
	// 1991 2448:aastore         
	// 1992 2449:dup             
	// 1993 2450:bipush          12
	// 1994 2452:iconst_2        
	// 1995 2453:newarray        int[]
	// 1996 2455:dup             
	// 1997 2456:iconst_0        
	// 1998 2457:iconst_2        
	// 1999 2458:iastore         
	// 2000 2459:dup             
	// 2001 2460:iconst_1        
	// 2002 2461:bipush          8
	// 2003 2463:iastore         
	// 2004 2464:aastore         
	// 2005 2465:dup             
	// 2006 2466:bipush          13
	// 2007 2468:aload           6
	// 2008 2470:aastore         
	// 2009 2471:dup             
	// 2010 2472:bipush          14
	// 2011 2474:iconst_2        
	// 2012 2475:newarray        int[]
	// 2013 2477:dup             
	// 2014 2478:iconst_0        
	// 2015 2479:iconst_0        
	// 2016 2480:iastore         
	// 2017 2481:dup             
	// 2018 2482:iconst_1        
	// 2019 2483:bipush          8
	// 2020 2485:iastore         
	// 2021 2486:aastore         
	// 2022 2487:putstatic       #34  <Field int[][] TYPE_INFO_COORDINATES>
	//*2023 2490:return          
	}
}
