// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.itextpdf.text.pdf.qrcode:
//			WriterException, BitVector, Mode, CharacterSetECI, 
//			Version, MaskUtil, MatrixUtil, QRCode, 
//			ByteMatrix, EncodeHintType, ByteArray, ReedSolomonEncoder, 
//			GF256, BlockPair, ErrorCorrectionLevel

public final class Encoder
{

	private Encoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	static void append8BitBytes(String s, BitVector bitvector, String s1)
		throws WriterException
	{
		int i;
		try
		{
			s = ((String) (s.getBytes(s1)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #30  <Method byte[] String.getBytes(String)>
	//    3    5:astore_0        
		}
	//*   4    6:iconst_0        
	//*   5    7:istore_3        
	//*   6    8:iload_3         
	//*   7    9:aload_0         
	//*   8   10:arraylength     
	//*   9   11:icmpge          43
	//*  10   14:aload_1         
	//*  11   15:aload_0         
	//*  12   16:iload_3         
	//*  13   17:baload          
	//*  14   18:bipush          8
	//*  15   20:invokevirtual   #36  <Method void BitVector.appendBits(int, int)>
	//*  16   23:iload_3         
	//*  17   24:iconst_1        
	//*  18   25:iadd            
	//*  19   26:istore_3        
	//*  20   27:goto            8
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  21   30:astore_0        
		{
			throw new WriterException(((UnsupportedEncodingException) (s)).toString());
	//   22   31:new             #22  <Class WriterException>
	//   23   34:dup             
	//   24   35:aload_0         
	//   25   36:invokevirtual   #40  <Method String UnsupportedEncodingException.toString()>
	//   26   39:invokespecial   #43  <Method void WriterException(String)>
	//   27   42:athrow          
		}
		for(i = 0; i < s.length; i++)
			bitvector.appendBits(((int) (s[i])), 8);

	//   28   43:return          
	}

	static void appendAlphanumericBytes(String s, BitVector bitvector)
		throws WriterException
	{
		int j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method int String.length()>
	//    2    4:istore_3        
		for(int i = 0; i < j;)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          105
		{
			int k = getAlphanumericCode(((int) (s.charAt(i))));
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #54  <Method char String.charAt(int)>
	//   11   17:invokestatic    #58  <Method int getAlphanumericCode(int)>
	//   12   20:istore          4
			if(k == -1)
	//*  13   22:iload           4
	//*  14   24:iconst_m1       
	//*  15   25:icmpne          36
				throw new WriterException();
	//   16   28:new             #22  <Class WriterException>
	//   17   31:dup             
	//   18   32:invokespecial   #59  <Method void WriterException()>
	//   19   35:athrow          
			if(i + 1 < j)
	//*  20   36:iload_2         
	//*  21   37:iconst_1        
	//*  22   38:iadd            
	//*  23   39:iload_3         
	//*  24   40:icmpge          90
			{
				int l = getAlphanumericCode(((int) (s.charAt(i + 1))));
	//   25   43:aload_0         
	//   26   44:iload_2         
	//   27   45:iconst_1        
	//   28   46:iadd            
	//   29   47:invokevirtual   #54  <Method char String.charAt(int)>
	//   30   50:invokestatic    #58  <Method int getAlphanumericCode(int)>
	//   31   53:istore          5
				if(l == -1)
	//*  32   55:iload           5
	//*  33   57:iconst_m1       
	//*  34   58:icmpne          69
					throw new WriterException();
	//   35   61:new             #22  <Class WriterException>
	//   36   64:dup             
	//   37   65:invokespecial   #59  <Method void WriterException()>
	//   38   68:athrow          
				bitvector.appendBits(k * 45 + l, 11);
	//   39   69:aload_1         
	//   40   70:iload           4
	//   41   72:bipush          45
	//   42   74:imul            
	//   43   75:iload           5
	//   44   77:iadd            
	//   45   78:bipush          11
	//   46   80:invokevirtual   #36  <Method void BitVector.appendBits(int, int)>
				i += 2;
	//   47   83:iload_2         
	//   48   84:iconst_2        
	//   49   85:iadd            
	//   50   86:istore_2        
			} else
	//*  51   87:goto            7
			{
				bitvector.appendBits(k, 6);
	//   52   90:aload_1         
	//   53   91:iload           4
	//   54   93:bipush          6
	//   55   95:invokevirtual   #36  <Method void BitVector.appendBits(int, int)>
				i++;
	//   56   98:iload_2         
	//   57   99:iconst_1        
	//   58  100:iadd            
	//   59  101:istore_2        
			}
		}

	//*  60  102:goto            7
	//   61  105:return          
	}

	static void appendBytes(String s, Mode mode, BitVector bitvector, String s1)
		throws WriterException
	{
		if(((Object) (mode)).equals(((Object) (Mode.NUMERIC))))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #67  <Field Mode Mode.NUMERIC>
	//*   2    4:invokevirtual   #71  <Method boolean Object.equals(Object)>
	//*   3    7:ifeq            16
		{
			appendNumericBytes(s, bitvector);
	//    4   10:aload_0         
	//    5   11:aload_2         
	//    6   12:invokestatic    #74  <Method void appendNumericBytes(String, BitVector)>
			return;
	//    7   15:return          
		}
		if(((Object) (mode)).equals(((Object) (Mode.ALPHANUMERIC))))
	//*   8   16:aload_1         
	//*   9   17:getstatic       #77  <Field Mode Mode.ALPHANUMERIC>
	//*  10   20:invokevirtual   #71  <Method boolean Object.equals(Object)>
	//*  11   23:ifeq            32
		{
			appendAlphanumericBytes(s, bitvector);
	//   12   26:aload_0         
	//   13   27:aload_2         
	//   14   28:invokestatic    #79  <Method void appendAlphanumericBytes(String, BitVector)>
			return;
	//   15   31:return          
		}
		if(((Object) (mode)).equals(((Object) (Mode.BYTE))))
	//*  16   32:aload_1         
	//*  17   33:getstatic       #82  <Field Mode Mode.BYTE>
	//*  18   36:invokevirtual   #71  <Method boolean Object.equals(Object)>
	//*  19   39:ifeq            49
		{
			append8BitBytes(s, bitvector, s1);
	//   20   42:aload_0         
	//   21   43:aload_2         
	//   22   44:aload_3         
	//   23   45:invokestatic    #84  <Method void append8BitBytes(String, BitVector, String)>
			return;
	//   24   48:return          
		}
		if(((Object) (mode)).equals(((Object) (Mode.KANJI))))
	//*  25   49:aload_1         
	//*  26   50:getstatic       #87  <Field Mode Mode.KANJI>
	//*  27   53:invokevirtual   #71  <Method boolean Object.equals(Object)>
	//*  28   56:ifeq            65
		{
			appendKanjiBytes(s, bitvector);
	//   29   59:aload_0         
	//   30   60:aload_2         
	//   31   61:invokestatic    #90  <Method void appendKanjiBytes(String, BitVector)>
			return;
	//   32   64:return          
		} else
		{
			throw new WriterException((new StringBuilder()).append("Invalid mode: ").append(((Object) (mode))).toString());
	//   33   65:new             #22  <Class WriterException>
	//   34   68:dup             
	//   35   69:new             #92  <Class StringBuilder>
	//   36   72:dup             
	//   37   73:invokespecial   #93  <Method void StringBuilder()>
	//   38   76:ldc1            #95  <String "Invalid mode: ">
	//   39   78:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   40   81:aload_1         
	//   41   82:invokevirtual   #102 <Method StringBuilder StringBuilder.append(Object)>
	//   42   85:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   43   88:invokespecial   #43  <Method void WriterException(String)>
	//   44   91:athrow          
		}
	}

	private static void appendECI(CharacterSetECI characterseteci, BitVector bitvector)
	{
		bitvector.appendBits(Mode.ECI.getBits(), 4);
	//    0    0:aload_1         
	//    1    1:getstatic       #108 <Field Mode Mode.ECI>
	//    2    4:invokevirtual   #111 <Method int Mode.getBits()>
	//    3    7:iconst_4        
	//    4    8:invokevirtual   #36  <Method void BitVector.appendBits(int, int)>
		bitvector.appendBits(characterseteci.getValue(), 8);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:invokevirtual   #116 <Method int CharacterSetECI.getValue()>
	//    8   16:bipush          8
	//    9   18:invokevirtual   #36  <Method void BitVector.appendBits(int, int)>
	//   10   21:return          
	}

	static void appendKanjiBytes(String s, BitVector bitvector)
		throws WriterException
	{
		int i;
		int j;
		byte byte0;
		int l;
		int k;
		try
		{
			s = ((String) (s.getBytes("Shift_JIS")));
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "Shift_JIS">
	//    2    3:invokevirtual   #30  <Method byte[] String.getBytes(String)>
	//    3    6:astore_0        
		}
	//*   4    7:aload_0         
	//*   5    8:arraylength     
	//*   6    9:istore          5
	//*   7   11:iconst_0        
	//*   8   12:istore_3        
	//*   9   13:iload_3         
	//*  10   14:iload           5
	//*  11   16:icmpge          148
	//*  12   19:aload_0         
	//*  13   20:iload_3         
	//*  14   21:baload          
	//*  15   22:sipush          255
	//*  16   25:iand            
	//*  17   26:bipush          8
	//*  18   28:ishl            
	//*  19   29:aload_0         
	//*  20   30:iload_3         
	//*  21   31:iconst_1        
	//*  22   32:iadd            
	//*  23   33:baload          
	//*  24   34:sipush          255
	//*  25   37:iand            
	//*  26   38:ior             
	//*  27   39:istore          6
	//*  28   41:iconst_m1       
	//*  29   42:istore          4
	//*  30   44:iload           6
	//*  31   46:ldc1            #119 <Int 33088>
	//*  32   48:icmplt          92
	//*  33   51:iload           6
	//*  34   53:ldc1            #120 <Int 40956>
	//*  35   55:icmpgt          92
	//*  36   58:iload           6
	//*  37   60:ldc1            #119 <Int 33088>
	//*  38   62:isub            
	//*  39   63:istore_2        
	//*  40   64:iload_2         
	//*  41   65:iconst_m1       
	//*  42   66:icmpne          121
	//*  43   69:new             #22  <Class WriterException>
	//*  44   72:dup             
	//*  45   73:ldc1            #122 <String "Invalid byte sequence">
	//*  46   75:invokespecial   #43  <Method void WriterException(String)>
	//*  47   78:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  48   79:astore_0        
		{
			throw new WriterException(((UnsupportedEncodingException) (s)).toString());
	//   49   80:new             #22  <Class WriterException>
	//   50   83:dup             
	//   51   84:aload_0         
	//   52   85:invokevirtual   #40  <Method String UnsupportedEncodingException.toString()>
	//   53   88:invokespecial   #43  <Method void WriterException(String)>
	//   54   91:athrow          
		}
		k = s.length;
		j = 0;
_L7:
		if(j >= k) goto _L2; else goto _L1
_L1:
		l = (s[j] & 0xff) << 8 | s[j + 1] & 0xff;
		byte0 = -1;
		if(l < 33088 || l > 40956) goto _L4; else goto _L3
_L3:
		i = l - 33088;
_L6:
		if(i == -1)
			throw new WriterException("Invalid byte sequence");
		break; /* Loop/switch isn't completed */
_L4:
		i = ((int) (byte0));
	//   55   92:iload           4
	//   56   94:istore_2        
		if(l >= 57408)
	//*  57   95:iload           6
	//*  58   97:ldc1            #123 <Int 57408>
	//*  59   99:icmplt          64
		{
			i = ((int) (byte0));
	//   60  102:iload           4
	//   61  104:istore_2        
			if(l <= 60351)
	//*  62  105:iload           6
	//*  63  107:ldc1            #124 <Int 60351>
	//*  64  109:icmpgt          64
				i = l - 49472;
	//   65  112:iload           6
	//   66  114:ldc1            #125 <Int 49472>
	//   67  116:isub            
	//   68  117:istore_2        
		}
		if(true) goto _L6; else goto _L5
	//   69  118:goto            64
_L5:
		bitvector.appendBits((i >> 8) * 192 + (i & 0xff), 13);
	//   70  121:aload_1         
	//   71  122:iload_2         
	//   72  123:bipush          8
	//   73  125:ishr            
	//   74  126:sipush          192
	//   75  129:imul            
	//   76  130:iload_2         
	//   77  131:sipush          255
	//   78  134:iand            
	//   79  135:iadd            
	//   80  136:bipush          13
	//   81  138:invokevirtual   #36  <Method void BitVector.appendBits(int, int)>
		j += 2;
	//   82  141:iload_3         
	//   83  142:iconst_2        
	//   84  143:iadd            
	//   85  144:istore_3        
		  goto _L7
	//*  86  145:goto            13
_L2:
	//   87  148:return          
	}

	static void appendLengthInfo(int i, int j, Mode mode, BitVector bitvector)
		throws WriterException
	{
		j = mode.getCharacterCountBits(Version.getVersionForNumber(j));
	//    0    0:aload_2         
	//    1    1:iload_1         
	//    2    2:invokestatic    #133 <Method Version Version.getVersionForNumber(int)>
	//    3    5:invokevirtual   #137 <Method int Mode.getCharacterCountBits(Version)>
	//    4    8:istore_1        
		if(i > (1 << j) - 1)
	//*   5    9:iload_0         
	//*   6   10:iconst_1        
	//*   7   11:iload_1         
	//*   8   12:ishl            
	//*   9   13:iconst_1        
	//*  10   14:isub            
	//*  11   15:icmple          53
		{
			throw new WriterException((new StringBuilder()).append(i).append("is bigger than").append((1 << j) - 1).toString());
	//   12   18:new             #22  <Class WriterException>
	//   13   21:dup             
	//   14   22:new             #92  <Class StringBuilder>
	//   15   25:dup             
	//   16   26:invokespecial   #93  <Method void StringBuilder()>
	//   17   29:iload_0         
	//   18   30:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//   19   33:ldc1            #142 <String "is bigger than">
	//   20   35:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   21   38:iconst_1        
	//   22   39:iload_1         
	//   23   40:ishl            
	//   24   41:iconst_1        
	//   25   42:isub            
	//   26   43:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//   27   46:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   28   49:invokespecial   #43  <Method void WriterException(String)>
	//   29   52:athrow          
		} else
		{
			bitvector.appendBits(i, j);
	//   30   53:aload_3         
	//   31   54:iload_0         
	//   32   55:iload_1         
	//   33   56:invokevirtual   #36  <Method void BitVector.appendBits(int, int)>
			return;
	//   34   59:return          
		}
	}

	static void appendModeInfo(Mode mode, BitVector bitvector)
	{
		bitvector.appendBits(mode.getBits(), 4);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #111 <Method int Mode.getBits()>
	//    3    5:iconst_4        
	//    4    6:invokevirtual   #36  <Method void BitVector.appendBits(int, int)>
	//    5    9:return          
	}

	static void appendNumericBytes(String s, BitVector bitvector)
	{
		int j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method int String.length()>
	//    2    4:istore_3        
		for(int i = 0; i < j;)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          122
		{
			int k = s.charAt(i) - 48;
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #54  <Method char String.charAt(int)>
	//   11   17:bipush          48
	//   12   19:isub            
	//   13   20:istore          4
			if(i + 2 < j)
	//*  14   22:iload_2         
	//*  15   23:iconst_2        
	//*  16   24:iadd            
	//*  17   25:iload_3         
	//*  18   26:icmpge          72
			{
				bitvector.appendBits(k * 100 + (s.charAt(i + 1) - 48) * 10 + (s.charAt(i + 2) - 48), 10);
	//   19   29:aload_1         
	//   20   30:iload           4
	//   21   32:bipush          100
	//   22   34:imul            
	//   23   35:aload_0         
	//   24   36:iload_2         
	//   25   37:iconst_1        
	//   26   38:iadd            
	//   27   39:invokevirtual   #54  <Method char String.charAt(int)>
	//   28   42:bipush          48
	//   29   44:isub            
	//   30   45:bipush          10
	//   31   47:imul            
	//   32   48:iadd            
	//   33   49:aload_0         
	//   34   50:iload_2         
	//   35   51:iconst_2        
	//   36   52:iadd            
	//   37   53:invokevirtual   #54  <Method char String.charAt(int)>
	//   38   56:bipush          48
	//   39   58:isub            
	//   40   59:iadd            
	//   41   60:bipush          10
	//   42   62:invokevirtual   #36  <Method void BitVector.appendBits(int, int)>
				i += 3;
	//   43   65:iload_2         
	//   44   66:iconst_3        
	//   45   67:iadd            
	//   46   68:istore_2        
			} else
	//*  47   69:goto            7
			if(i + 1 < j)
	//*  48   72:iload_2         
	//*  49   73:iconst_1        
	//*  50   74:iadd            
	//*  51   75:iload_3         
	//*  52   76:icmpge          108
			{
				bitvector.appendBits(k * 10 + (s.charAt(i + 1) - 48), 7);
	//   53   79:aload_1         
	//   54   80:iload           4
	//   55   82:bipush          10
	//   56   84:imul            
	//   57   85:aload_0         
	//   58   86:iload_2         
	//   59   87:iconst_1        
	//   60   88:iadd            
	//   61   89:invokevirtual   #54  <Method char String.charAt(int)>
	//   62   92:bipush          48
	//   63   94:isub            
	//   64   95:iadd            
	//   65   96:bipush          7
	//   66   98:invokevirtual   #36  <Method void BitVector.appendBits(int, int)>
				i += 2;
	//   67  101:iload_2         
	//   68  102:iconst_2        
	//   69  103:iadd            
	//   70  104:istore_2        
			} else
	//*  71  105:goto            7
			{
				bitvector.appendBits(k, 4);
	//   72  108:aload_1         
	//   73  109:iload           4
	//   74  111:iconst_4        
	//   75  112:invokevirtual   #36  <Method void BitVector.appendBits(int, int)>
				i++;
	//   76  115:iload_2         
	//   77  116:iconst_1        
	//   78  117:iadd            
	//   79  118:istore_2        
			}
		}

	//*  80  119:goto            7
	//   81  122:return          
	}

	private static int calculateMaskPenalty(ByteMatrix bytematrix)
	{
		return 0 + MaskUtil.applyMaskPenaltyRule1(bytematrix) + MaskUtil.applyMaskPenaltyRule2(bytematrix) + MaskUtil.applyMaskPenaltyRule3(bytematrix) + MaskUtil.applyMaskPenaltyRule4(bytematrix);
	//    0    0:iconst_0        
	//    1    1:aload_0         
	//    2    2:invokestatic    #151 <Method int MaskUtil.applyMaskPenaltyRule1(ByteMatrix)>
	//    3    5:iadd            
	//    4    6:aload_0         
	//    5    7:invokestatic    #154 <Method int MaskUtil.applyMaskPenaltyRule2(ByteMatrix)>
	//    6   10:iadd            
	//    7   11:aload_0         
	//    8   12:invokestatic    #157 <Method int MaskUtil.applyMaskPenaltyRule3(ByteMatrix)>
	//    9   15:iadd            
	//   10   16:aload_0         
	//   11   17:invokestatic    #160 <Method int MaskUtil.applyMaskPenaltyRule4(ByteMatrix)>
	//   12   20:iadd            
	//   13   21:ireturn         
	}

	private static int chooseMaskPattern(BitVector bitvector, ErrorCorrectionLevel errorcorrectionlevel, int i, ByteMatrix bytematrix)
		throws WriterException
	{
		int k = 0x7fffffff;
	//    0    0:ldc1            #163 <Int 0x7fffffff>
	//    1    2:istore          5
		int i1 = -1;
	//    2    4:iconst_m1       
	//    3    5:istore          7
		for(int j = 0; j < 8;)
	//*   4    7:iconst_0        
	//*   5    8:istore          4
	//*   6   10:iload           4
	//*   7   12:bipush          8
	//*   8   14:icmpge          64
		{
			MatrixUtil.buildMatrix(bitvector, errorcorrectionlevel, i, j, bytematrix);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:iload_2         
	//   12   20:iload           4
	//   13   22:aload_3         
	//   14   23:invokestatic    #169 <Method void MatrixUtil.buildMatrix(BitVector, ErrorCorrectionLevel, int, int, ByteMatrix)>
			int j1 = calculateMaskPenalty(bytematrix);
	//   15   26:aload_3         
	//   16   27:invokestatic    #171 <Method int calculateMaskPenalty(ByteMatrix)>
	//   17   30:istore          8
			int l = k;
	//   18   32:iload           5
	//   19   34:istore          6
			if(j1 < k)
	//*  20   36:iload           8
	//*  21   38:iload           5
	//*  22   40:icmpge          51
			{
				l = j1;
	//   23   43:iload           8
	//   24   45:istore          6
				i1 = j;
	//   25   47:iload           4
	//   26   49:istore          7
			}
			j++;
	//   27   51:iload           4
	//   28   53:iconst_1        
	//   29   54:iadd            
	//   30   55:istore          4
			k = l;
	//   31   57:iload           6
	//   32   59:istore          5
		}

	//*  33   61:goto            10
		return i1;
	//   34   64:iload           7
	//   35   66:ireturn         
	}

	public static Mode chooseMode(String s)
	{
		return chooseMode(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #176 <Method Mode chooseMode(String, String)>
	//    3    5:areturn         
	}

	public static Mode chooseMode(String s, String s1)
	{
		if("Shift_JIS".equals(((Object) (s1))))
	//*   0    0:ldc1            #118 <String "Shift_JIS">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #177 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            24
			if(isOnlyDoubleByteKanji(s))
	//*   4    9:aload_0         
	//*   5   10:invokestatic    #181 <Method boolean isOnlyDoubleByteKanji(String)>
	//*   6   13:ifeq            20
				return Mode.KANJI;
	//    7   16:getstatic       #87  <Field Mode Mode.KANJI>
	//    8   19:areturn         
			else
				return Mode.BYTE;
	//    9   20:getstatic       #82  <Field Mode Mode.BYTE>
	//   10   23:areturn         
		boolean flag = false;
	//   11   24:iconst_0        
	//   12   25:istore_3        
		boolean flag1 = false;
	//   13   26:iconst_0        
	//   14   27:istore          4
		int i = 0;
	//   15   29:iconst_0        
	//   16   30:istore_2        
		while(i < s.length()) 
	//*  17   31:iload_2         
	//*  18   32:aload_0         
	//*  19   33:invokevirtual   #50  <Method int String.length()>
	//*  20   36:icmpge          88
		{
			char c = s.charAt(i);
	//   21   39:aload_0         
	//   22   40:iload_2         
	//   23   41:invokevirtual   #54  <Method char String.charAt(int)>
	//   24   44:istore          5
			if(c >= '0' && c <= '9')
	//*  25   46:iload           5
	//*  26   48:bipush          48
	//*  27   50:icmplt          69
	//*  28   53:iload           5
	//*  29   55:bipush          57
	//*  30   57:icmpgt          69
				flag = true;
	//   31   60:iconst_1        
	//   32   61:istore_3        
			else
	//*  33   62:iload_2         
	//*  34   63:iconst_1        
	//*  35   64:iadd            
	//*  36   65:istore_2        
	//*  37   66:goto            31
			if(getAlphanumericCode(((int) (c))) != -1)
	//*  38   69:iload           5
	//*  39   71:invokestatic    #58  <Method int getAlphanumericCode(int)>
	//*  40   74:iconst_m1       
	//*  41   75:icmpeq          84
				flag1 = true;
	//   42   78:iconst_1        
	//   43   79:istore          4
			else
	//*  44   81:goto            62
				return Mode.BYTE;
	//   45   84:getstatic       #82  <Field Mode Mode.BYTE>
	//   46   87:areturn         
			i++;
		}
		if(flag1)
	//*  47   88:iload           4
	//*  48   90:ifeq            97
			return Mode.ALPHANUMERIC;
	//   49   93:getstatic       #77  <Field Mode Mode.ALPHANUMERIC>
	//   50   96:areturn         
		if(flag)
	//*  51   97:iload_3         
	//*  52   98:ifeq            105
			return Mode.NUMERIC;
	//   53  101:getstatic       #67  <Field Mode Mode.NUMERIC>
	//   54  104:areturn         
		else
			return Mode.BYTE;
	//   55  105:getstatic       #82  <Field Mode Mode.BYTE>
	//   56  108:areturn         
	}

	public static void encode(String s, ErrorCorrectionLevel errorcorrectionlevel, QRCode qrcode)
		throws WriterException
	{
		encode(s, errorcorrectionlevel, ((Map) (null)), qrcode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokestatic    #186 <Method void encode(String, ErrorCorrectionLevel, Map, QRCode)>
	//    5    7:return          
	}

	public static void encode(String s, ErrorCorrectionLevel errorcorrectionlevel, Map map, QRCode qrcode)
		throws WriterException
	{
		int i;
		Object obj;
		BitVector bitvector;
		if(map == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       261
			map = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:aload_2         
	//*   5    7:astore          5
	//*   6    9:aload_2         
	//*   7   10:ifnonnull       17
	//*   8   13:ldc1            #10  <String "ISO-8859-1">
	//*   9   15:astore          5
	//*  10   17:aload_0         
	//*  11   18:aload           5
	//*  12   20:invokestatic    #176 <Method Mode chooseMode(String, String)>
	//*  13   23:astore_2        
	//*  14   24:new             #32  <Class BitVector>
	//*  15   27:dup             
	//*  16   28:invokespecial   #187 <Method void BitVector()>
	//*  17   31:astore          6
	//*  18   33:aload_0         
	//*  19   34:aload_2         
	//*  20   35:aload           6
	//*  21   37:aload           5
	//*  22   39:invokestatic    #189 <Method void appendBytes(String, Mode, BitVector, String)>
	//*  23   42:aload           6
	//*  24   44:invokevirtual   #192 <Method int BitVector.sizeInBytes()>
	//*  25   47:aload_1         
	//*  26   48:aload_2         
	//*  27   49:aload_3         
	//*  28   50:invokestatic    #196 <Method void initQRCode(int, ErrorCorrectionLevel, Mode, QRCode)>
	//*  29   53:new             #32  <Class BitVector>
	//*  30   56:dup             
	//*  31   57:invokespecial   #187 <Method void BitVector()>
	//*  32   60:astore_1        
	//*  33   61:aload_2         
	//*  34   62:getstatic       #82  <Field Mode Mode.BYTE>
	//*  35   65:if_acmpne       96
	//*  36   68:ldc1            #10  <String "ISO-8859-1">
	//*  37   70:aload           5
	//*  38   72:invokevirtual   #177 <Method boolean String.equals(Object)>
	//*  39   75:ifne            96
	//*  40   78:aload           5
	//*  41   80:invokestatic    #200 <Method CharacterSetECI CharacterSetECI.getCharacterSetECIByName(String)>
	//*  42   83:astore          5
	//*  43   85:aload           5
	//*  44   87:ifnull          96
	//*  45   90:aload           5
	//*  46   92:aload_1         
	//*  47   93:invokestatic    #202 <Method void appendECI(CharacterSetECI, BitVector)>
	//*  48   96:aload_2         
	//*  49   97:aload_1         
	//*  50   98:invokestatic    #204 <Method void appendModeInfo(Mode, BitVector)>
	//*  51  101:aload_2         
	//*  52  102:getstatic       #82  <Field Mode Mode.BYTE>
	//*  53  105:invokevirtual   #71  <Method boolean Object.equals(Object)>
	//*  54  108:ifeq            277
	//*  55  111:aload           6
	//*  56  113:invokevirtual   #192 <Method int BitVector.sizeInBytes()>
	//*  57  116:istore          4
	//*  58  118:iload           4
	//*  59  120:aload_3         
	//*  60  121:invokevirtual   #209 <Method int QRCode.getVersion()>
	//*  61  124:aload_2         
	//*  62  125:aload_1         
	//*  63  126:invokestatic    #211 <Method void appendLengthInfo(int, int, Mode, BitVector)>
	//*  64  129:aload_1         
	//*  65  130:aload           6
	//*  66  132:invokevirtual   #215 <Method void BitVector.appendBitVector(BitVector)>
	//*  67  135:aload_3         
	//*  68  136:invokevirtual   #218 <Method int QRCode.getNumDataBytes()>
	//*  69  139:aload_1         
	//*  70  140:invokestatic    #222 <Method void terminateBits(int, BitVector)>
	//*  71  143:new             #32  <Class BitVector>
	//*  72  146:dup             
	//*  73  147:invokespecial   #187 <Method void BitVector()>
	//*  74  150:astore_0        
	//*  75  151:aload_1         
	//*  76  152:aload_3         
	//*  77  153:invokevirtual   #225 <Method int QRCode.getNumTotalBytes()>
	//*  78  156:aload_3         
	//*  79  157:invokevirtual   #218 <Method int QRCode.getNumDataBytes()>
	//*  80  160:aload_3         
	//*  81  161:invokevirtual   #228 <Method int QRCode.getNumRSBlocks()>
	//*  82  164:aload_0         
	//*  83  165:invokestatic    #232 <Method void interleaveWithECBytes(BitVector, int, int, int, BitVector)>
	//*  84  168:new             #234 <Class ByteMatrix>
	//*  85  171:dup             
	//*  86  172:aload_3         
	//*  87  173:invokevirtual   #237 <Method int QRCode.getMatrixWidth()>
	//*  88  176:aload_3         
	//*  89  177:invokevirtual   #237 <Method int QRCode.getMatrixWidth()>
	//*  90  180:invokespecial   #239 <Method void ByteMatrix(int, int)>
	//*  91  183:astore_1        
	//*  92  184:aload_3         
	//*  93  185:aload_0         
	//*  94  186:aload_3         
	//*  95  187:invokevirtual   #243 <Method ErrorCorrectionLevel QRCode.getECLevel()>
	//*  96  190:aload_3         
	//*  97  191:invokevirtual   #209 <Method int QRCode.getVersion()>
	//*  98  194:aload_1         
	//*  99  195:invokestatic    #245 <Method int chooseMaskPattern(BitVector, ErrorCorrectionLevel, int, ByteMatrix)>
	//* 100  198:invokevirtual   #249 <Method void QRCode.setMaskPattern(int)>
	//* 101  201:aload_0         
	//* 102  202:aload_3         
	//* 103  203:invokevirtual   #243 <Method ErrorCorrectionLevel QRCode.getECLevel()>
	//* 104  206:aload_3         
	//* 105  207:invokevirtual   #209 <Method int QRCode.getVersion()>
	//* 106  210:aload_3         
	//* 107  211:invokevirtual   #252 <Method int QRCode.getMaskPattern()>
	//* 108  214:aload_1         
	//* 109  215:invokestatic    #169 <Method void MatrixUtil.buildMatrix(BitVector, ErrorCorrectionLevel, int, int, ByteMatrix)>
	//* 110  218:aload_3         
	//* 111  219:aload_1         
	//* 112  220:invokevirtual   #256 <Method void QRCode.setMatrix(ByteMatrix)>
	//* 113  223:aload_3         
	//* 114  224:invokevirtual   #260 <Method boolean QRCode.isValid()>
	//* 115  227:ifne            286
	//* 116  230:new             #22  <Class WriterException>
	//* 117  233:dup             
	//* 118  234:new             #92  <Class StringBuilder>
	//* 119  237:dup             
	//* 120  238:invokespecial   #93  <Method void StringBuilder()>
	//* 121  241:ldc2            #262 <String "Invalid QR code: ">
	//* 122  244:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 123  247:aload_3         
	//* 124  248:invokevirtual   #263 <Method String QRCode.toString()>
	//* 125  251:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//* 126  254:invokevirtual   #103 <Method String StringBuilder.toString()>
	//* 127  257:invokespecial   #43  <Method void WriterException(String)>
	//* 128  260:athrow          
			map = ((Map) ((String)map.get(((Object) (EncodeHintType.CHARACTER_SET)))));
	//  129  261:aload_2         
	//  130  262:getstatic       #269 <Field EncodeHintType EncodeHintType.CHARACTER_SET>
	//  131  265:invokeinterface #275 <Method Object Map.get(Object)>
	//  132  270:checkcast       #26  <Class String>
	//  133  273:astore_2        
		obj = ((Object) (map));
		if(map == null)
			obj = "ISO-8859-1";
		map = ((Map) (chooseMode(s, ((String) (obj)))));
		bitvector = new BitVector();
		appendBytes(s, ((Mode) (map)), bitvector, ((String) (obj)));
		initQRCode(bitvector.sizeInBytes(), errorcorrectionlevel, ((Mode) (map)), qrcode);
		errorcorrectionlevel = ((ErrorCorrectionLevel) (new BitVector()));
		if(map == Mode.BYTE && !"ISO-8859-1".equals(obj))
		{
			obj = ((Object) (CharacterSetECI.getCharacterSetECIByName(((String) (obj)))));
			if(obj != null)
				appendECI(((CharacterSetECI) (obj)), ((BitVector) (errorcorrectionlevel)));
		}
		appendModeInfo(((Mode) (map)), ((BitVector) (errorcorrectionlevel)));
		if(((Object) (map)).equals(((Object) (Mode.BYTE))))
			i = bitvector.sizeInBytes();
		else
	//* 134  274:goto            6
			i = s.length();
	//  135  277:aload_0         
	//  136  278:invokevirtual   #50  <Method int String.length()>
	//  137  281:istore          4
		appendLengthInfo(i, qrcode.getVersion(), ((Mode) (map)), ((BitVector) (errorcorrectionlevel)));
		((BitVector) (errorcorrectionlevel)).appendBitVector(bitvector);
		terminateBits(qrcode.getNumDataBytes(), ((BitVector) (errorcorrectionlevel)));
		s = ((String) (new BitVector()));
		interleaveWithECBytes(((BitVector) (errorcorrectionlevel)), qrcode.getNumTotalBytes(), qrcode.getNumDataBytes(), qrcode.getNumRSBlocks(), ((BitVector) (s)));
		errorcorrectionlevel = ((ErrorCorrectionLevel) (new ByteMatrix(qrcode.getMatrixWidth(), qrcode.getMatrixWidth())));
		qrcode.setMaskPattern(chooseMaskPattern(((BitVector) (s)), qrcode.getECLevel(), qrcode.getVersion(), ((ByteMatrix) (errorcorrectionlevel))));
		MatrixUtil.buildMatrix(((BitVector) (s)), qrcode.getECLevel(), qrcode.getVersion(), qrcode.getMaskPattern(), ((ByteMatrix) (errorcorrectionlevel)));
		qrcode.setMatrix(((ByteMatrix) (errorcorrectionlevel)));
		if(!qrcode.isValid())
			throw new WriterException((new StringBuilder()).append("Invalid QR code: ").append(qrcode.toString()).toString());
		else
	//* 138  283:goto            118
			return;
	//  139  286:return          
	}

	static ByteArray generateECBytes(ByteArray bytearray, int i)
	{
		int l = bytearray.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #284 <Method int ByteArray.size()>
	//    2    4:istore_3        
		int ai[] = new int[l + i];
	//    3    5:iload_3         
	//    4    6:iload_1         
	//    5    7:iadd            
	//    6    8:newarray        int[]
	//    7   10:astore          4
		for(int j = 0; j < l; j++)
	//*   8   12:iconst_0        
	//*   9   13:istore_2        
	//*  10   14:iload_2         
	//*  11   15:iload_3         
	//*  12   16:icmpge          35
			ai[j] = bytearray.at(j);
	//   13   19:aload           4
	//   14   21:iload_2         
	//   15   22:aload_0         
	//   16   23:iload_2         
	//   17   24:invokevirtual   #287 <Method int ByteArray.at(int)>
	//   18   27:iastore         

	//   19   28:iload_2         
	//   20   29:iconst_1        
	//   21   30:iadd            
	//   22   31:istore_2        
	//*  23   32:goto            14
		(new ReedSolomonEncoder(GF256.QR_CODE_FIELD)).encode(ai, i);
	//   24   35:new             #289 <Class ReedSolomonEncoder>
	//   25   38:dup             
	//   26   39:getstatic       #295 <Field GF256 GF256.QR_CODE_FIELD>
	//   27   42:invokespecial   #298 <Method void ReedSolomonEncoder(GF256)>
	//   28   45:aload           4
	//   29   47:iload_1         
	//   30   48:invokevirtual   #301 <Method void ReedSolomonEncoder.encode(int[], int)>
		bytearray = new ByteArray(i);
	//   31   51:new             #281 <Class ByteArray>
	//   32   54:dup             
	//   33   55:iload_1         
	//   34   56:invokespecial   #303 <Method void ByteArray(int)>
	//   35   59:astore_0        
		for(int k = 0; k < i; k++)
	//*  36   60:iconst_0        
	//*  37   61:istore_2        
	//*  38   62:iload_2         
	//*  39   63:iload_1         
	//*  40   64:icmpge          85
			bytearray.set(k, ai[l + k]);
	//   41   67:aload_0         
	//   42   68:iload_2         
	//   43   69:aload           4
	//   44   71:iload_3         
	//   45   72:iload_2         
	//   46   73:iadd            
	//   47   74:iaload          
	//   48   75:invokevirtual   #306 <Method void ByteArray.set(int, int)>

	//   49   78:iload_2         
	//   50   79:iconst_1        
	//   51   80:iadd            
	//   52   81:istore_2        
	//*  53   82:goto            62
		return bytearray;
	//   54   85:aload_0         
	//   55   86:areturn         
	}

	static int getAlphanumericCode(int i)
	{
		if(i < ALPHANUMERIC_TABLE.length)
	//*   0    0:iload_0         
	//*   1    1:getstatic       #14  <Field int[] ALPHANUMERIC_TABLE>
	//*   2    4:arraylength     
	//*   3    5:icmpge          14
			return ALPHANUMERIC_TABLE[i];
	//    4    8:getstatic       #14  <Field int[] ALPHANUMERIC_TABLE>
	//    5   11:iload_0         
	//    6   12:iaload          
	//    7   13:ireturn         
		else
			return -1;
	//    8   14:iconst_m1       
	//    9   15:ireturn         
	}

	static void getNumDataBytesAndNumECBytesForBlockID(int i, int j, int k, int l, int ai[], int ai1[])
		throws WriterException
	{
		if(l >= k)
	//*   0    0:iload_3         
	//*   1    1:iload_2         
	//*   2    2:icmplt          16
			throw new WriterException("Block ID too large");
	//    3    5:new             #22  <Class WriterException>
	//    4    8:dup             
	//    5    9:ldc2            #310 <String "Block ID too large">
	//    6   12:invokespecial   #43  <Method void WriterException(String)>
	//    7   15:athrow          
		int i1 = i % k;
	//    8   16:iload_0         
	//    9   17:iload_2         
	//   10   18:irem            
	//   11   19:istore          6
		int j1 = k - i1;
	//   12   21:iload_2         
	//   13   22:iload           6
	//   14   24:isub            
	//   15   25:istore          7
		int k1 = i / k;
	//   16   27:iload_0         
	//   17   28:iload_2         
	//   18   29:idiv            
	//   19   30:istore          8
		j /= k;
	//   20   32:iload_1         
	//   21   33:iload_2         
	//   22   34:idiv            
	//   23   35:istore_1        
		int l1 = j + 1;
	//   24   36:iload_1         
	//   25   37:iconst_1        
	//   26   38:iadd            
	//   27   39:istore          9
		int i2 = k1 - j;
	//   28   41:iload           8
	//   29   43:iload_1         
	//   30   44:isub            
	//   31   45:istore          10
		k1 = (k1 + 1) - l1;
	//   32   47:iload           8
	//   33   49:iconst_1        
	//   34   50:iadd            
	//   35   51:iload           9
	//   36   53:isub            
	//   37   54:istore          8
		if(i2 != k1)
	//*  38   56:iload           10
	//*  39   58:iload           8
	//*  40   60:icmpeq          74
			throw new WriterException("EC bytes mismatch");
	//   41   63:new             #22  <Class WriterException>
	//   42   66:dup             
	//   43   67:ldc2            #312 <String "EC bytes mismatch">
	//   44   70:invokespecial   #43  <Method void WriterException(String)>
	//   45   73:athrow          
		if(k != j1 + i1)
	//*  46   74:iload_2         
	//*  47   75:iload           7
	//*  48   77:iload           6
	//*  49   79:iadd            
	//*  50   80:icmpeq          94
			throw new WriterException("RS blocks mismatch");
	//   51   83:new             #22  <Class WriterException>
	//   52   86:dup             
	//   53   87:ldc2            #314 <String "RS blocks mismatch">
	//   54   90:invokespecial   #43  <Method void WriterException(String)>
	//   55   93:athrow          
		if(i != (j + i2) * j1 + (l1 + k1) * i1)
	//*  56   94:iload_0         
	//*  57   95:iload_1         
	//*  58   96:iload           10
	//*  59   98:iadd            
	//*  60   99:iload           7
	//*  61  101:imul            
	//*  62  102:iload           9
	//*  63  104:iload           8
	//*  64  106:iadd            
	//*  65  107:iload           6
	//*  66  109:imul            
	//*  67  110:iadd            
	//*  68  111:icmpeq          125
			throw new WriterException("Total bytes mismatch");
	//   69  114:new             #22  <Class WriterException>
	//   70  117:dup             
	//   71  118:ldc2            #316 <String "Total bytes mismatch">
	//   72  121:invokespecial   #43  <Method void WriterException(String)>
	//   73  124:athrow          
		if(l < j1)
	//*  74  125:iload_3         
	//*  75  126:iload           7
	//*  76  128:icmpge          143
		{
			ai[0] = j;
	//   77  131:aload           4
	//   78  133:iconst_0        
	//   79  134:iload_1         
	//   80  135:iastore         
			ai1[0] = i2;
	//   81  136:aload           5
	//   82  138:iconst_0        
	//   83  139:iload           10
	//   84  141:iastore         
			return;
	//   85  142:return          
		} else
		{
			ai[0] = l1;
	//   86  143:aload           4
	//   87  145:iconst_0        
	//   88  146:iload           9
	//   89  148:iastore         
			ai1[0] = k1;
	//   90  149:aload           5
	//   91  151:iconst_0        
	//   92  152:iload           8
	//   93  154:iastore         
			return;
	//   94  155:return          
		}
	}

	private static void initQRCode(int i, ErrorCorrectionLevel errorcorrectionlevel, Mode mode, QRCode qrcode)
		throws WriterException
	{
		qrcode.setECLevel(errorcorrectionlevel);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #320 <Method void QRCode.setECLevel(ErrorCorrectionLevel)>
		qrcode.setMode(mode);
	//    3    5:aload_3         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #324 <Method void QRCode.setMode(Mode)>
		for(int j = 1; j <= 40; j++)
	//*   6   10:iconst_1        
	//*   7   11:istore          4
	//*   8   13:iload           4
	//*   9   15:bipush          40
	//*  10   17:icmpgt          116
		{
			mode = ((Mode) (Version.getVersionForNumber(j)));
	//   11   20:iload           4
	//   12   22:invokestatic    #133 <Method Version Version.getVersionForNumber(int)>
	//   13   25:astore_2        
			int k = ((Version) (mode)).getTotalCodewords();
	//   14   26:aload_2         
	//   15   27:invokevirtual   #327 <Method int Version.getTotalCodewords()>
	//   16   30:istore          5
			Version.ECBlocks ecblocks = ((Version) (mode)).getECBlocksForLevel(errorcorrectionlevel);
	//   17   32:aload_2         
	//   18   33:aload_1         
	//   19   34:invokevirtual   #331 <Method Version$ECBlocks Version.getECBlocksForLevel(ErrorCorrectionLevel)>
	//   20   37:astore          9
			int l = ecblocks.getTotalECCodewords();
	//   21   39:aload           9
	//   22   41:invokevirtual   #336 <Method int Version$ECBlocks.getTotalECCodewords()>
	//   23   44:istore          6
			int i1 = ecblocks.getNumBlocks();
	//   24   46:aload           9
	//   25   48:invokevirtual   #339 <Method int Version$ECBlocks.getNumBlocks()>
	//   26   51:istore          7
			int j1 = k - l;
	//   27   53:iload           5
	//   28   55:iload           6
	//   29   57:isub            
	//   30   58:istore          8
			if(j1 >= i + 3)
	//*  31   60:iload           8
	//*  32   62:iload_0         
	//*  33   63:iconst_3        
	//*  34   64:iadd            
	//*  35   65:icmplt          107
			{
				qrcode.setVersion(j);
	//   36   68:aload_3         
	//   37   69:iload           4
	//   38   71:invokevirtual   #342 <Method void QRCode.setVersion(int)>
				qrcode.setNumTotalBytes(k);
	//   39   74:aload_3         
	//   40   75:iload           5
	//   41   77:invokevirtual   #345 <Method void QRCode.setNumTotalBytes(int)>
				qrcode.setNumDataBytes(j1);
	//   42   80:aload_3         
	//   43   81:iload           8
	//   44   83:invokevirtual   #348 <Method void QRCode.setNumDataBytes(int)>
				qrcode.setNumRSBlocks(i1);
	//   45   86:aload_3         
	//   46   87:iload           7
	//   47   89:invokevirtual   #351 <Method void QRCode.setNumRSBlocks(int)>
				qrcode.setNumECBytes(l);
	//   48   92:aload_3         
	//   49   93:iload           6
	//   50   95:invokevirtual   #354 <Method void QRCode.setNumECBytes(int)>
				qrcode.setMatrixWidth(((Version) (mode)).getDimensionForVersion());
	//   51   98:aload_3         
	//   52   99:aload_2         
	//   53  100:invokevirtual   #357 <Method int Version.getDimensionForVersion()>
	//   54  103:invokevirtual   #360 <Method void QRCode.setMatrixWidth(int)>
				return;
	//   55  106:return          
			}
		}

	//   56  107:iload           4
	//   57  109:iconst_1        
	//   58  110:iadd            
	//   59  111:istore          4
	//*  60  113:goto            13
		throw new WriterException("Cannot find proper rs block info (input data too big?)");
	//   61  116:new             #22  <Class WriterException>
	//   62  119:dup             
	//   63  120:ldc2            #362 <String "Cannot find proper rs block info (input data too big?)">
	//   64  123:invokespecial   #43  <Method void WriterException(String)>
	//   65  126:athrow          
	}

	static void interleaveWithECBytes(BitVector bitvector, int i, int j, int k, BitVector bitvector1)
		throws WriterException
	{
		if(bitvector.sizeInBytes() != j)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #192 <Method int BitVector.sizeInBytes()>
	//*   2    4:iload_2         
	//*   3    5:icmpeq          19
			throw new WriterException("Number of bits and data bytes does not match");
	//    4    8:new             #22  <Class WriterException>
	//    5   11:dup             
	//    6   12:ldc2            #364 <String "Number of bits and data bytes does not match">
	//    7   15:invokespecial   #43  <Method void WriterException(String)>
	//    8   18:athrow          
		int k1 = 0;
	//    9   19:iconst_0        
	//   10   20:istore          8
		int i1 = 0;
	//   11   22:iconst_0        
	//   12   23:istore          6
		int l = 0;
	//   13   25:iconst_0        
	//   14   26:istore          5
		ArrayList arraylist = new ArrayList(k);
	//   15   28:new             #366 <Class ArrayList>
	//   16   31:dup             
	//   17   32:iload_3         
	//   18   33:invokespecial   #367 <Method void ArrayList(int)>
	//   19   36:astore          9
		for(int j1 = 0; j1 < k; j1++)
	//*  20   38:iconst_0        
	//*  21   39:istore          7
	//*  22   41:iload           7
	//*  23   43:iload_3         
	//*  24   44:icmpge          163
		{
			int ai[] = new int[1];
	//   25   47:iconst_1        
	//   26   48:newarray        int[]
	//   27   50:astore          10
			int ai1[] = new int[1];
	//   28   52:iconst_1        
	//   29   53:newarray        int[]
	//   30   55:astore          12
			getNumDataBytesAndNumECBytesForBlockID(i, j, k, j1, ai, ai1);
	//   31   57:iload_1         
	//   32   58:iload_2         
	//   33   59:iload_3         
	//   34   60:iload           7
	//   35   62:aload           10
	//   36   64:aload           12
	//   37   66:invokestatic    #369 <Method void getNumDataBytesAndNumECBytesForBlockID(int, int, int, int, int[], int[])>
			ByteArray bytearray = new ByteArray();
	//   38   69:new             #281 <Class ByteArray>
	//   39   72:dup             
	//   40   73:invokespecial   #370 <Method void ByteArray()>
	//   41   76:astore          11
			bytearray.set(bitvector.getArray(), k1, ai[0]);
	//   42   78:aload           11
	//   43   80:aload_0         
	//   44   81:invokevirtual   #374 <Method byte[] BitVector.getArray()>
	//   45   84:iload           8
	//   46   86:aload           10
	//   47   88:iconst_0        
	//   48   89:iaload          
	//   49   90:invokevirtual   #377 <Method void ByteArray.set(byte[], int, int)>
			ByteArray bytearray1 = generateECBytes(bytearray, ai1[0]);
	//   50   93:aload           11
	//   51   95:aload           12
	//   52   97:iconst_0        
	//   53   98:iaload          
	//   54   99:invokestatic    #379 <Method ByteArray generateECBytes(ByteArray, int)>
	//   55  102:astore          12
			arraylist.add(((Object) (new BlockPair(bytearray, bytearray1))));
	//   56  104:aload           9
	//   57  106:new             #381 <Class BlockPair>
	//   58  109:dup             
	//   59  110:aload           11
	//   60  112:aload           12
	//   61  114:invokespecial   #384 <Method void BlockPair(ByteArray, ByteArray)>
	//   62  117:invokevirtual   #387 <Method boolean ArrayList.add(Object)>
	//   63  120:pop             
			i1 = Math.max(i1, bytearray.size());
	//   64  121:iload           6
	//   65  123:aload           11
	//   66  125:invokevirtual   #284 <Method int ByteArray.size()>
	//   67  128:invokestatic    #393 <Method int Math.max(int, int)>
	//   68  131:istore          6
			l = Math.max(l, bytearray1.size());
	//   69  133:iload           5
	//   70  135:aload           12
	//   71  137:invokevirtual   #284 <Method int ByteArray.size()>
	//   72  140:invokestatic    #393 <Method int Math.max(int, int)>
	//   73  143:istore          5
			k1 += ai[0];
	//   74  145:iload           8
	//   75  147:aload           10
	//   76  149:iconst_0        
	//   77  150:iaload          
	//   78  151:iadd            
	//   79  152:istore          8
		}

	//   80  154:iload           7
	//   81  156:iconst_1        
	//   82  157:iadd            
	//   83  158:istore          7
	//*  84  160:goto            41
		if(j != k1)
	//*  85  163:iload_2         
	//*  86  164:iload           8
	//*  87  166:icmpeq          180
			throw new WriterException("Data bytes does not match offset");
	//   88  169:new             #22  <Class WriterException>
	//   89  172:dup             
	//   90  173:ldc2            #395 <String "Data bytes does not match offset">
	//   91  176:invokespecial   #43  <Method void WriterException(String)>
	//   92  179:athrow          
		for(j = 0; j < i1; j++)
	//*  93  180:iconst_0        
	//*  94  181:istore_2        
	//*  95  182:iload_2         
	//*  96  183:iload           6
	//*  97  185:icmpge          246
			for(k = 0; k < arraylist.size(); k++)
	//*  98  188:iconst_0        
	//*  99  189:istore_3        
	//* 100  190:iload_3         
	//* 101  191:aload           9
	//* 102  193:invokevirtual   #396 <Method int ArrayList.size()>
	//* 103  196:icmpge          239
			{
				bitvector = ((BitVector) (((BlockPair)arraylist.get(k)).getDataBytes()));
	//  104  199:aload           9
	//  105  201:iload_3         
	//  106  202:invokevirtual   #399 <Method Object ArrayList.get(int)>
	//  107  205:checkcast       #381 <Class BlockPair>
	//  108  208:invokevirtual   #403 <Method ByteArray BlockPair.getDataBytes()>
	//  109  211:astore_0        
				if(j < ((ByteArray) (bitvector)).size())
	//* 110  212:iload_2         
	//* 111  213:aload_0         
	//* 112  214:invokevirtual   #284 <Method int ByteArray.size()>
	//* 113  217:icmpge          232
					bitvector1.appendBits(((ByteArray) (bitvector)).at(j), 8);
	//  114  220:aload           4
	//  115  222:aload_0         
	//  116  223:iload_2         
	//  117  224:invokevirtual   #287 <Method int ByteArray.at(int)>
	//  118  227:bipush          8
	//  119  229:invokevirtual   #36  <Method void BitVector.appendBits(int, int)>
			}

	//  120  232:iload_3         
	//  121  233:iconst_1        
	//  122  234:iadd            
	//  123  235:istore_3        

	//  124  236:goto            190
	//  125  239:iload_2         
	//  126  240:iconst_1        
	//  127  241:iadd            
	//  128  242:istore_2        
	//* 129  243:goto            182
		for(j = 0; j < l; j++)
	//* 130  246:iconst_0        
	//* 131  247:istore_2        
	//* 132  248:iload_2         
	//* 133  249:iload           5
	//* 134  251:icmpge          312
			for(k = 0; k < arraylist.size(); k++)
	//* 135  254:iconst_0        
	//* 136  255:istore_3        
	//* 137  256:iload_3         
	//* 138  257:aload           9
	//* 139  259:invokevirtual   #396 <Method int ArrayList.size()>
	//* 140  262:icmpge          305
			{
				bitvector = ((BitVector) (((BlockPair)arraylist.get(k)).getErrorCorrectionBytes()));
	//  141  265:aload           9
	//  142  267:iload_3         
	//  143  268:invokevirtual   #399 <Method Object ArrayList.get(int)>
	//  144  271:checkcast       #381 <Class BlockPair>
	//  145  274:invokevirtual   #406 <Method ByteArray BlockPair.getErrorCorrectionBytes()>
	//  146  277:astore_0        
				if(j < ((ByteArray) (bitvector)).size())
	//* 147  278:iload_2         
	//* 148  279:aload_0         
	//* 149  280:invokevirtual   #284 <Method int ByteArray.size()>
	//* 150  283:icmpge          298
					bitvector1.appendBits(((ByteArray) (bitvector)).at(j), 8);
	//  151  286:aload           4
	//  152  288:aload_0         
	//  153  289:iload_2         
	//  154  290:invokevirtual   #287 <Method int ByteArray.at(int)>
	//  155  293:bipush          8
	//  156  295:invokevirtual   #36  <Method void BitVector.appendBits(int, int)>
			}

	//  157  298:iload_3         
	//  158  299:iconst_1        
	//  159  300:iadd            
	//  160  301:istore_3        

	//  161  302:goto            256
	//  162  305:iload_2         
	//  163  306:iconst_1        
	//  164  307:iadd            
	//  165  308:istore_2        
	//* 166  309:goto            248
		if(i != bitvector1.sizeInBytes())
	//* 167  312:iload_1         
	//* 168  313:aload           4
	//* 169  315:invokevirtual   #192 <Method int BitVector.sizeInBytes()>
	//* 170  318:icmpeq          369
			throw new WriterException((new StringBuilder()).append("Interleaving error: ").append(i).append(" and ").append(bitvector1.sizeInBytes()).append(" differ.").toString());
	//  171  321:new             #22  <Class WriterException>
	//  172  324:dup             
	//  173  325:new             #92  <Class StringBuilder>
	//  174  328:dup             
	//  175  329:invokespecial   #93  <Method void StringBuilder()>
	//  176  332:ldc2            #408 <String "Interleaving error: ">
	//  177  335:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  178  338:iload_1         
	//  179  339:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//  180  342:ldc2            #410 <String " and ">
	//  181  345:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  182  348:aload           4
	//  183  350:invokevirtual   #192 <Method int BitVector.sizeInBytes()>
	//  184  353:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//  185  356:ldc2            #412 <String " differ.">
	//  186  359:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  187  362:invokevirtual   #103 <Method String StringBuilder.toString()>
	//  188  365:invokespecial   #43  <Method void WriterException(String)>
	//  189  368:athrow          
		else
			return;
	//  190  369:return          
	}

	private static boolean isOnlyDoubleByteKanji(String s)
	{
		int j;
		try
		{
			s = ((String) (s.getBytes("Shift_JIS")));
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "Shift_JIS">
	//    2    3:invokevirtual   #30  <Method byte[] String.getBytes(String)>
	//    3    6:astore_0        
		}
	//*   4    7:aload_0         
	//*   5    8:arraylength     
	//*   6    9:istore_2        
	//*   7   10:iload_2         
	//*   8   11:iconst_2        
	//*   9   12:irem            
	//*  10   13:ifeq            21
	//*  11   16:iconst_0        
	//*  12   17:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  13   18:astore_0        
		{
			return false;
	//   14   19:iconst_0        
	//   15   20:ireturn         
		}
		j = s.length;
		if(j % 2 == 0) goto _L2; else goto _L1
_L1:
		return false;
_L2:
		int i = 0;
	//   16   21:iconst_0        
	//   17   22:istore_1        
label0:
		do
		{
label1:
			{
				if(i >= j)
					break label1;
	//   18   23:iload_1         
	//   19   24:iload_2         
	//   20   25:icmpge          71
				int k = s[i] & 0xff;
	//   21   28:aload_0         
	//   22   29:iload_1         
	//   23   30:baload          
	//   24   31:sipush          255
	//   25   34:iand            
	//   26   35:istore_3        
				if((k < 129 || k > 159) && (k < 224 || k > 235))
					break label0;
	//   27   36:iload_3         
	//   28   37:sipush          129
	//   29   40:icmplt          50
	//   30   43:iload_3         
	//   31   44:sipush          159
	//   32   47:icmple          64
	//   33   50:iload_3         
	//   34   51:sipush          224
	//   35   54:icmplt          16
	//   36   57:iload_3         
	//   37   58:sipush          235
	//   38   61:icmpgt          16
				i += 2;
	//   39   64:iload_1         
	//   40   65:iconst_2        
	//   41   66:iadd            
	//   42   67:istore_1        
			}
		} while(true);
	//   43   68:goto            23
		if(true) goto _L1; else goto _L3
_L3:
		return true;
	//   44   71:iconst_1        
	//   45   72:ireturn         
	}

	static void terminateBits(int i, BitVector bitvector)
		throws WriterException
	{
		int i1 = i << 3;
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:ishl            
	//    3    3:istore_3        
		if(bitvector.size() > i1)
	//*   4    4:aload_1         
	//*   5    5:invokevirtual   #413 <Method int BitVector.size()>
	//*   6    8:iload_3         
	//*   7    9:icmple          53
			throw new WriterException((new StringBuilder()).append("data bits cannot fit in the QR Code").append(bitvector.size()).append(" > ").append(i1).toString());
	//    8   12:new             #22  <Class WriterException>
	//    9   15:dup             
	//   10   16:new             #92  <Class StringBuilder>
	//   11   19:dup             
	//   12   20:invokespecial   #93  <Method void StringBuilder()>
	//   13   23:ldc2            #415 <String "data bits cannot fit in the QR Code">
	//   14   26:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #413 <Method int BitVector.size()>
	//   17   33:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//   18   36:ldc2            #417 <String " > ">
	//   19   39:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   20   42:iload_3         
	//   21   43:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//   22   46:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   23   49:invokespecial   #43  <Method void WriterException(String)>
	//   24   52:athrow          
		for(int j = 0; j < 4 && bitvector.size() < i1; j++)
	//*  25   53:iconst_0        
	//*  26   54:istore_2        
	//*  27   55:iload_2         
	//*  28   56:iconst_4        
	//*  29   57:icmpge          80
	//*  30   60:aload_1         
	//*  31   61:invokevirtual   #413 <Method int BitVector.size()>
	//*  32   64:iload_3         
	//*  33   65:icmpge          80
			bitvector.appendBit(0);
	//   34   68:aload_1         
	//   35   69:iconst_0        
	//   36   70:invokevirtual   #420 <Method void BitVector.appendBit(int)>

	//   37   73:iload_2         
	//   38   74:iconst_1        
	//   39   75:iadd            
	//   40   76:istore_2        
	//*  41   77:goto            55
		int j1 = bitvector.size() % 8;
	//   42   80:aload_1         
	//   43   81:invokevirtual   #413 <Method int BitVector.size()>
	//   44   84:bipush          8
	//   45   86:irem            
	//   46   87:istore          4
		if(j1 > 0)
	//*  47   89:iload           4
	//*  48   91:ifle            117
		{
			for(int k = 0; k < 8 - j1; k++)
	//*  49   94:iconst_0        
	//*  50   95:istore_2        
	//*  51   96:iload_2         
	//*  52   97:bipush          8
	//*  53   99:iload           4
	//*  54  101:isub            
	//*  55  102:icmpge          117
				bitvector.appendBit(0);
	//   56  105:aload_1         
	//   57  106:iconst_0        
	//   58  107:invokevirtual   #420 <Method void BitVector.appendBit(int)>

	//   59  110:iload_2         
	//   60  111:iconst_1        
	//   61  112:iadd            
	//   62  113:istore_2        
		}
	//*  63  114:goto            96
		if(bitvector.size() % 8 != 0)
	//*  64  117:aload_1         
	//*  65  118:invokevirtual   #413 <Method int BitVector.size()>
	//*  66  121:bipush          8
	//*  67  123:irem            
	//*  68  124:ifeq            138
			throw new WriterException("Number of bits is not a multiple of 8");
	//   69  127:new             #22  <Class WriterException>
	//   70  130:dup             
	//   71  131:ldc2            #422 <String "Number of bits is not a multiple of 8">
	//   72  134:invokespecial   #43  <Method void WriterException(String)>
	//   73  137:athrow          
		j1 = bitvector.sizeInBytes();
	//   74  138:aload_1         
	//   75  139:invokevirtual   #192 <Method int BitVector.sizeInBytes()>
	//   76  142:istore          4
		int l = 0;
	//   77  144:iconst_0        
	//   78  145:istore_2        
		while(l < i - j1) 
	//*  79  146:iload_2         
	//*  80  147:iload_0         
	//*  81  148:iload           4
	//*  82  150:isub            
	//*  83  151:icmpge          187
		{
			if(l % 2 == 0)
	//*  84  154:iload_2         
	//*  85  155:iconst_2        
	//*  86  156:irem            
	//*  87  157:ifne            176
				bitvector.appendBits(236, 8);
	//   88  160:aload_1         
	//   89  161:sipush          236
	//   90  164:bipush          8
	//   91  166:invokevirtual   #36  <Method void BitVector.appendBits(int, int)>
			else
	//*  92  169:iload_2         
	//*  93  170:iconst_1        
	//*  94  171:iadd            
	//*  95  172:istore_2        
	//*  96  173:goto            146
				bitvector.appendBits(17, 8);
	//   97  176:aload_1         
	//   98  177:bipush          17
	//   99  179:bipush          8
	//  100  181:invokevirtual   #36  <Method void BitVector.appendBits(int, int)>
			l++;
		}
	//* 101  184:goto            169
		if(bitvector.size() != i1)
	//* 102  187:aload_1         
	//* 103  188:invokevirtual   #413 <Method int BitVector.size()>
	//* 104  191:iload_3         
	//* 105  192:icmpeq          206
			throw new WriterException("Bits size does not equal capacity");
	//  106  195:new             #22  <Class WriterException>
	//  107  198:dup             
	//  108  199:ldc2            #424 <String "Bits size does not equal capacity">
	//  109  202:invokespecial   #43  <Method void WriterException(String)>
	//  110  205:athrow          
		else
			return;
	//  111  206:return          
	}

	private static final int ALPHANUMERIC_TABLE[] = {
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, 36, -1, -1, -1, 37, 38, -1, -1, 
		-1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 
		2, 3, 4, 5, 6, 7, 8, 9, 44, -1, 
		-1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 
		15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
		25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 
		35, -1, -1, -1, -1, -1
	};
	static final String DEFAULT_BYTE_MODE_ENCODING = "ISO-8859-1";

	static 
	{
	//    0    0:bipush          96
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_m1       
	//    5    7:iastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:iconst_m1       
	//    9   11:iastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:iconst_m1       
	//   13   15:iastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:iconst_m1       
	//   17   19:iastore         
	//   18   20:dup             
	//   19   21:iconst_4        
	//   20   22:iconst_m1       
	//   21   23:iastore         
	//   22   24:dup             
	//   23   25:iconst_5        
	//   24   26:iconst_m1       
	//   25   27:iastore         
	//   26   28:dup             
	//   27   29:bipush          6
	//   28   31:iconst_m1       
	//   29   32:iastore         
	//   30   33:dup             
	//   31   34:bipush          7
	//   32   36:iconst_m1       
	//   33   37:iastore         
	//   34   38:dup             
	//   35   39:bipush          8
	//   36   41:iconst_m1       
	//   37   42:iastore         
	//   38   43:dup             
	//   39   44:bipush          9
	//   40   46:iconst_m1       
	//   41   47:iastore         
	//   42   48:dup             
	//   43   49:bipush          10
	//   44   51:iconst_m1       
	//   45   52:iastore         
	//   46   53:dup             
	//   47   54:bipush          11
	//   48   56:iconst_m1       
	//   49   57:iastore         
	//   50   58:dup             
	//   51   59:bipush          12
	//   52   61:iconst_m1       
	//   53   62:iastore         
	//   54   63:dup             
	//   55   64:bipush          13
	//   56   66:iconst_m1       
	//   57   67:iastore         
	//   58   68:dup             
	//   59   69:bipush          14
	//   60   71:iconst_m1       
	//   61   72:iastore         
	//   62   73:dup             
	//   63   74:bipush          15
	//   64   76:iconst_m1       
	//   65   77:iastore         
	//   66   78:dup             
	//   67   79:bipush          16
	//   68   81:iconst_m1       
	//   69   82:iastore         
	//   70   83:dup             
	//   71   84:bipush          17
	//   72   86:iconst_m1       
	//   73   87:iastore         
	//   74   88:dup             
	//   75   89:bipush          18
	//   76   91:iconst_m1       
	//   77   92:iastore         
	//   78   93:dup             
	//   79   94:bipush          19
	//   80   96:iconst_m1       
	//   81   97:iastore         
	//   82   98:dup             
	//   83   99:bipush          20
	//   84  101:iconst_m1       
	//   85  102:iastore         
	//   86  103:dup             
	//   87  104:bipush          21
	//   88  106:iconst_m1       
	//   89  107:iastore         
	//   90  108:dup             
	//   91  109:bipush          22
	//   92  111:iconst_m1       
	//   93  112:iastore         
	//   94  113:dup             
	//   95  114:bipush          23
	//   96  116:iconst_m1       
	//   97  117:iastore         
	//   98  118:dup             
	//   99  119:bipush          24
	//  100  121:iconst_m1       
	//  101  122:iastore         
	//  102  123:dup             
	//  103  124:bipush          25
	//  104  126:iconst_m1       
	//  105  127:iastore         
	//  106  128:dup             
	//  107  129:bipush          26
	//  108  131:iconst_m1       
	//  109  132:iastore         
	//  110  133:dup             
	//  111  134:bipush          27
	//  112  136:iconst_m1       
	//  113  137:iastore         
	//  114  138:dup             
	//  115  139:bipush          28
	//  116  141:iconst_m1       
	//  117  142:iastore         
	//  118  143:dup             
	//  119  144:bipush          29
	//  120  146:iconst_m1       
	//  121  147:iastore         
	//  122  148:dup             
	//  123  149:bipush          30
	//  124  151:iconst_m1       
	//  125  152:iastore         
	//  126  153:dup             
	//  127  154:bipush          31
	//  128  156:iconst_m1       
	//  129  157:iastore         
	//  130  158:dup             
	//  131  159:bipush          32
	//  132  161:bipush          36
	//  133  163:iastore         
	//  134  164:dup             
	//  135  165:bipush          33
	//  136  167:iconst_m1       
	//  137  168:iastore         
	//  138  169:dup             
	//  139  170:bipush          34
	//  140  172:iconst_m1       
	//  141  173:iastore         
	//  142  174:dup             
	//  143  175:bipush          35
	//  144  177:iconst_m1       
	//  145  178:iastore         
	//  146  179:dup             
	//  147  180:bipush          36
	//  148  182:bipush          37
	//  149  184:iastore         
	//  150  185:dup             
	//  151  186:bipush          37
	//  152  188:bipush          38
	//  153  190:iastore         
	//  154  191:dup             
	//  155  192:bipush          38
	//  156  194:iconst_m1       
	//  157  195:iastore         
	//  158  196:dup             
	//  159  197:bipush          39
	//  160  199:iconst_m1       
	//  161  200:iastore         
	//  162  201:dup             
	//  163  202:bipush          40
	//  164  204:iconst_m1       
	//  165  205:iastore         
	//  166  206:dup             
	//  167  207:bipush          41
	//  168  209:iconst_m1       
	//  169  210:iastore         
	//  170  211:dup             
	//  171  212:bipush          42
	//  172  214:bipush          39
	//  173  216:iastore         
	//  174  217:dup             
	//  175  218:bipush          43
	//  176  220:bipush          40
	//  177  222:iastore         
	//  178  223:dup             
	//  179  224:bipush          44
	//  180  226:iconst_m1       
	//  181  227:iastore         
	//  182  228:dup             
	//  183  229:bipush          45
	//  184  231:bipush          41
	//  185  233:iastore         
	//  186  234:dup             
	//  187  235:bipush          46
	//  188  237:bipush          42
	//  189  239:iastore         
	//  190  240:dup             
	//  191  241:bipush          47
	//  192  243:bipush          43
	//  193  245:iastore         
	//  194  246:dup             
	//  195  247:bipush          48
	//  196  249:iconst_0        
	//  197  250:iastore         
	//  198  251:dup             
	//  199  252:bipush          49
	//  200  254:iconst_1        
	//  201  255:iastore         
	//  202  256:dup             
	//  203  257:bipush          50
	//  204  259:iconst_2        
	//  205  260:iastore         
	//  206  261:dup             
	//  207  262:bipush          51
	//  208  264:iconst_3        
	//  209  265:iastore         
	//  210  266:dup             
	//  211  267:bipush          52
	//  212  269:iconst_4        
	//  213  270:iastore         
	//  214  271:dup             
	//  215  272:bipush          53
	//  216  274:iconst_5        
	//  217  275:iastore         
	//  218  276:dup             
	//  219  277:bipush          54
	//  220  279:bipush          6
	//  221  281:iastore         
	//  222  282:dup             
	//  223  283:bipush          55
	//  224  285:bipush          7
	//  225  287:iastore         
	//  226  288:dup             
	//  227  289:bipush          56
	//  228  291:bipush          8
	//  229  293:iastore         
	//  230  294:dup             
	//  231  295:bipush          57
	//  232  297:bipush          9
	//  233  299:iastore         
	//  234  300:dup             
	//  235  301:bipush          58
	//  236  303:bipush          44
	//  237  305:iastore         
	//  238  306:dup             
	//  239  307:bipush          59
	//  240  309:iconst_m1       
	//  241  310:iastore         
	//  242  311:dup             
	//  243  312:bipush          60
	//  244  314:iconst_m1       
	//  245  315:iastore         
	//  246  316:dup             
	//  247  317:bipush          61
	//  248  319:iconst_m1       
	//  249  320:iastore         
	//  250  321:dup             
	//  251  322:bipush          62
	//  252  324:iconst_m1       
	//  253  325:iastore         
	//  254  326:dup             
	//  255  327:bipush          63
	//  256  329:iconst_m1       
	//  257  330:iastore         
	//  258  331:dup             
	//  259  332:bipush          64
	//  260  334:iconst_m1       
	//  261  335:iastore         
	//  262  336:dup             
	//  263  337:bipush          65
	//  264  339:bipush          10
	//  265  341:iastore         
	//  266  342:dup             
	//  267  343:bipush          66
	//  268  345:bipush          11
	//  269  347:iastore         
	//  270  348:dup             
	//  271  349:bipush          67
	//  272  351:bipush          12
	//  273  353:iastore         
	//  274  354:dup             
	//  275  355:bipush          68
	//  276  357:bipush          13
	//  277  359:iastore         
	//  278  360:dup             
	//  279  361:bipush          69
	//  280  363:bipush          14
	//  281  365:iastore         
	//  282  366:dup             
	//  283  367:bipush          70
	//  284  369:bipush          15
	//  285  371:iastore         
	//  286  372:dup             
	//  287  373:bipush          71
	//  288  375:bipush          16
	//  289  377:iastore         
	//  290  378:dup             
	//  291  379:bipush          72
	//  292  381:bipush          17
	//  293  383:iastore         
	//  294  384:dup             
	//  295  385:bipush          73
	//  296  387:bipush          18
	//  297  389:iastore         
	//  298  390:dup             
	//  299  391:bipush          74
	//  300  393:bipush          19
	//  301  395:iastore         
	//  302  396:dup             
	//  303  397:bipush          75
	//  304  399:bipush          20
	//  305  401:iastore         
	//  306  402:dup             
	//  307  403:bipush          76
	//  308  405:bipush          21
	//  309  407:iastore         
	//  310  408:dup             
	//  311  409:bipush          77
	//  312  411:bipush          22
	//  313  413:iastore         
	//  314  414:dup             
	//  315  415:bipush          78
	//  316  417:bipush          23
	//  317  419:iastore         
	//  318  420:dup             
	//  319  421:bipush          79
	//  320  423:bipush          24
	//  321  425:iastore         
	//  322  426:dup             
	//  323  427:bipush          80
	//  324  429:bipush          25
	//  325  431:iastore         
	//  326  432:dup             
	//  327  433:bipush          81
	//  328  435:bipush          26
	//  329  437:iastore         
	//  330  438:dup             
	//  331  439:bipush          82
	//  332  441:bipush          27
	//  333  443:iastore         
	//  334  444:dup             
	//  335  445:bipush          83
	//  336  447:bipush          28
	//  337  449:iastore         
	//  338  450:dup             
	//  339  451:bipush          84
	//  340  453:bipush          29
	//  341  455:iastore         
	//  342  456:dup             
	//  343  457:bipush          85
	//  344  459:bipush          30
	//  345  461:iastore         
	//  346  462:dup             
	//  347  463:bipush          86
	//  348  465:bipush          31
	//  349  467:iastore         
	//  350  468:dup             
	//  351  469:bipush          87
	//  352  471:bipush          32
	//  353  473:iastore         
	//  354  474:dup             
	//  355  475:bipush          88
	//  356  477:bipush          33
	//  357  479:iastore         
	//  358  480:dup             
	//  359  481:bipush          89
	//  360  483:bipush          34
	//  361  485:iastore         
	//  362  486:dup             
	//  363  487:bipush          90
	//  364  489:bipush          35
	//  365  491:iastore         
	//  366  492:dup             
	//  367  493:bipush          91
	//  368  495:iconst_m1       
	//  369  496:iastore         
	//  370  497:dup             
	//  371  498:bipush          92
	//  372  500:iconst_m1       
	//  373  501:iastore         
	//  374  502:dup             
	//  375  503:bipush          93
	//  376  505:iconst_m1       
	//  377  506:iastore         
	//  378  507:dup             
	//  379  508:bipush          94
	//  380  510:iconst_m1       
	//  381  511:iastore         
	//  382  512:dup             
	//  383  513:bipush          95
	//  384  515:iconst_m1       
	//  385  516:iastore         
	//  386  517:putstatic       #14  <Field int[] ALPHANUMERIC_TABLE>
	//* 387  520:return          
	}
}
