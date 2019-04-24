// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;


// Referenced classes of package com.itextpdf.text.pdf.qrcode:
//			ByteMatrix, ErrorCorrectionLevel, Mode

public final class QRCode
{

	public QRCode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mode = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field Mode mode>
		ecLevel = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #28  <Field ErrorCorrectionLevel ecLevel>
		version = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #30  <Field int version>
		matrixWidth = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #32  <Field int matrixWidth>
		maskPattern = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #34  <Field int maskPattern>
		numTotalBytes = -1;
	//   17   29:aload_0         
	//   18   30:iconst_m1       
	//   19   31:putfield        #36  <Field int numTotalBytes>
		numDataBytes = -1;
	//   20   34:aload_0         
	//   21   35:iconst_m1       
	//   22   36:putfield        #38  <Field int numDataBytes>
		numECBytes = -1;
	//   23   39:aload_0         
	//   24   40:iconst_m1       
	//   25   41:putfield        #40  <Field int numECBytes>
		numRSBlocks = -1;
	//   26   44:aload_0         
	//   27   45:iconst_m1       
	//   28   46:putfield        #42  <Field int numRSBlocks>
		matrix = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #44  <Field ByteMatrix matrix>
	//   32   54:return          
	}

	public static boolean isValidMaskPattern(int i)
	{
		return i >= 0 && i < 8;
	//    0    0:iload_0         
	//    1    1:iflt            12
	//    2    4:iload_0         
	//    3    5:bipush          8
	//    4    7:icmpge          12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public int at(int i, int j)
	{
		i = ((int) (matrix.get(i, j)));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ByteMatrix matrix>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #55  <Method byte ByteMatrix.get(int, int)>
	//    5    9:istore_1        
		if(i != 0 && i != 1)
	//*   6   10:iload_1         
	//*   7   11:ifeq            29
	//*   8   14:iload_1         
	//*   9   15:iconst_1        
	//*  10   16:icmpeq          29
			throw new RuntimeException("Bad value");
	//   11   19:new             #57  <Class RuntimeException>
	//   12   22:dup             
	//   13   23:ldc1            #59  <String "Bad value">
	//   14   25:invokespecial   #62  <Method void RuntimeException(String)>
	//   15   28:athrow          
		else
			return i;
	//   16   29:iload_1         
	//   17   30:ireturn         
	}

	public ErrorCorrectionLevel getECLevel()
	{
		return ecLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ErrorCorrectionLevel ecLevel>
	//    2    4:areturn         
	}

	public int getMaskPattern()
	{
		return maskPattern;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int maskPattern>
	//    2    4:ireturn         
	}

	public ByteMatrix getMatrix()
	{
		return matrix;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ByteMatrix matrix>
	//    2    4:areturn         
	}

	public int getMatrixWidth()
	{
		return matrixWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int matrixWidth>
	//    2    4:ireturn         
	}

	public Mode getMode()
	{
		return mode;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Mode mode>
	//    2    4:areturn         
	}

	public int getNumDataBytes()
	{
		return numDataBytes;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int numDataBytes>
	//    2    4:ireturn         
	}

	public int getNumECBytes()
	{
		return numECBytes;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int numECBytes>
	//    2    4:ireturn         
	}

	public int getNumRSBlocks()
	{
		return numRSBlocks;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int numRSBlocks>
	//    2    4:ireturn         
	}

	public int getNumTotalBytes()
	{
		return numTotalBytes;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int numTotalBytes>
	//    2    4:ireturn         
	}

	public int getVersion()
	{
		return version;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int version>
	//    2    4:ireturn         
	}

	public boolean isValid()
	{
		return mode != null && ecLevel != null && version != -1 && matrixWidth != -1 && maskPattern != -1 && numTotalBytes != -1 && numDataBytes != -1 && numECBytes != -1 && numRSBlocks != -1 && isValidMaskPattern(maskPattern) && numTotalBytes == numDataBytes + numECBytes && matrix != null && matrixWidth == matrix.getWidth() && matrix.getWidth() == matrix.getHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Mode mode>
	//    2    4:ifnull          136
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field ErrorCorrectionLevel ecLevel>
	//    5   11:ifnull          136
	//    6   14:aload_0         
	//    7   15:getfield        #30  <Field int version>
	//    8   18:iconst_m1       
	//    9   19:icmpeq          136
	//   10   22:aload_0         
	//   11   23:getfield        #32  <Field int matrixWidth>
	//   12   26:iconst_m1       
	//   13   27:icmpeq          136
	//   14   30:aload_0         
	//   15   31:getfield        #34  <Field int maskPattern>
	//   16   34:iconst_m1       
	//   17   35:icmpeq          136
	//   18   38:aload_0         
	//   19   39:getfield        #36  <Field int numTotalBytes>
	//   20   42:iconst_m1       
	//   21   43:icmpeq          136
	//   22   46:aload_0         
	//   23   47:getfield        #38  <Field int numDataBytes>
	//   24   50:iconst_m1       
	//   25   51:icmpeq          136
	//   26   54:aload_0         
	//   27   55:getfield        #40  <Field int numECBytes>
	//   28   58:iconst_m1       
	//   29   59:icmpeq          136
	//   30   62:aload_0         
	//   31   63:getfield        #42  <Field int numRSBlocks>
	//   32   66:iconst_m1       
	//   33   67:icmpeq          136
	//   34   70:aload_0         
	//   35   71:getfield        #34  <Field int maskPattern>
	//   36   74:invokestatic    #80  <Method boolean isValidMaskPattern(int)>
	//   37   77:ifeq            136
	//   38   80:aload_0         
	//   39   81:getfield        #36  <Field int numTotalBytes>
	//   40   84:aload_0         
	//   41   85:getfield        #38  <Field int numDataBytes>
	//   42   88:aload_0         
	//   43   89:getfield        #40  <Field int numECBytes>
	//   44   92:iadd            
	//   45   93:icmpne          136
	//   46   96:aload_0         
	//   47   97:getfield        #44  <Field ByteMatrix matrix>
	//   48  100:ifnull          136
	//   49  103:aload_0         
	//   50  104:getfield        #32  <Field int matrixWidth>
	//   51  107:aload_0         
	//   52  108:getfield        #44  <Field ByteMatrix matrix>
	//   53  111:invokevirtual   #83  <Method int ByteMatrix.getWidth()>
	//   54  114:icmpne          136
	//   55  117:aload_0         
	//   56  118:getfield        #44  <Field ByteMatrix matrix>
	//   57  121:invokevirtual   #83  <Method int ByteMatrix.getWidth()>
	//   58  124:aload_0         
	//   59  125:getfield        #44  <Field ByteMatrix matrix>
	//   60  128:invokevirtual   #86  <Method int ByteMatrix.getHeight()>
	//   61  131:icmpne          136
	//   62  134:iconst_1        
	//   63  135:ireturn         
	//   64  136:iconst_0        
	//   65  137:ireturn         
	}

	public void setECLevel(ErrorCorrectionLevel errorcorrectionlevel)
	{
		ecLevel = errorcorrectionlevel;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field ErrorCorrectionLevel ecLevel>
	//    3    5:return          
	}

	public void setMaskPattern(int i)
	{
		maskPattern = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field int maskPattern>
	//    3    5:return          
	}

	public void setMatrix(ByteMatrix bytematrix)
	{
		matrix = bytematrix;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field ByteMatrix matrix>
	//    3    5:return          
	}

	public void setMatrixWidth(int i)
	{
		matrixWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field int matrixWidth>
	//    3    5:return          
	}

	public void setMode(Mode mode1)
	{
		mode = mode1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field Mode mode>
	//    3    5:return          
	}

	public void setNumDataBytes(int i)
	{
		numDataBytes = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field int numDataBytes>
	//    3    5:return          
	}

	public void setNumECBytes(int i)
	{
		numECBytes = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #40  <Field int numECBytes>
	//    3    5:return          
	}

	public void setNumRSBlocks(int i)
	{
		numRSBlocks = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #42  <Field int numRSBlocks>
	//    3    5:return          
	}

	public void setNumTotalBytes(int i)
	{
		numTotalBytes = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field int numTotalBytes>
	//    3    5:return          
	}

	public void setVersion(int i)
	{
		version = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int version>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer(200);
	//    0    0:new             #104 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:sipush          200
	//    3    7:invokespecial   #106 <Method void StringBuffer(int)>
	//    4   10:astore_1        
		stringbuffer.append("<<\n");
	//    5   11:aload_1         
	//    6   12:ldc1            #108 <String "<<\n">
	//    7   14:invokevirtual   #112 <Method StringBuffer StringBuffer.append(String)>
	//    8   17:pop             
		stringbuffer.append(" mode: ");
	//    9   18:aload_1         
	//   10   19:ldc1            #114 <String " mode: ">
	//   11   21:invokevirtual   #112 <Method StringBuffer StringBuffer.append(String)>
	//   12   24:pop             
		stringbuffer.append(((Object) (mode)));
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #26  <Field Mode mode>
	//   16   30:invokevirtual   #117 <Method StringBuffer StringBuffer.append(Object)>
	//   17   33:pop             
		stringbuffer.append("\n ecLevel: ");
	//   18   34:aload_1         
	//   19   35:ldc1            #119 <String "\n ecLevel: ">
	//   20   37:invokevirtual   #112 <Method StringBuffer StringBuffer.append(String)>
	//   21   40:pop             
		stringbuffer.append(((Object) (ecLevel)));
	//   22   41:aload_1         
	//   23   42:aload_0         
	//   24   43:getfield        #28  <Field ErrorCorrectionLevel ecLevel>
	//   25   46:invokevirtual   #117 <Method StringBuffer StringBuffer.append(Object)>
	//   26   49:pop             
		stringbuffer.append("\n version: ");
	//   27   50:aload_1         
	//   28   51:ldc1            #121 <String "\n version: ">
	//   29   53:invokevirtual   #112 <Method StringBuffer StringBuffer.append(String)>
	//   30   56:pop             
		stringbuffer.append(version);
	//   31   57:aload_1         
	//   32   58:aload_0         
	//   33   59:getfield        #30  <Field int version>
	//   34   62:invokevirtual   #124 <Method StringBuffer StringBuffer.append(int)>
	//   35   65:pop             
		stringbuffer.append("\n matrixWidth: ");
	//   36   66:aload_1         
	//   37   67:ldc1            #126 <String "\n matrixWidth: ">
	//   38   69:invokevirtual   #112 <Method StringBuffer StringBuffer.append(String)>
	//   39   72:pop             
		stringbuffer.append(matrixWidth);
	//   40   73:aload_1         
	//   41   74:aload_0         
	//   42   75:getfield        #32  <Field int matrixWidth>
	//   43   78:invokevirtual   #124 <Method StringBuffer StringBuffer.append(int)>
	//   44   81:pop             
		stringbuffer.append("\n maskPattern: ");
	//   45   82:aload_1         
	//   46   83:ldc1            #128 <String "\n maskPattern: ">
	//   47   85:invokevirtual   #112 <Method StringBuffer StringBuffer.append(String)>
	//   48   88:pop             
		stringbuffer.append(maskPattern);
	//   49   89:aload_1         
	//   50   90:aload_0         
	//   51   91:getfield        #34  <Field int maskPattern>
	//   52   94:invokevirtual   #124 <Method StringBuffer StringBuffer.append(int)>
	//   53   97:pop             
		stringbuffer.append("\n numTotalBytes: ");
	//   54   98:aload_1         
	//   55   99:ldc1            #130 <String "\n numTotalBytes: ">
	//   56  101:invokevirtual   #112 <Method StringBuffer StringBuffer.append(String)>
	//   57  104:pop             
		stringbuffer.append(numTotalBytes);
	//   58  105:aload_1         
	//   59  106:aload_0         
	//   60  107:getfield        #36  <Field int numTotalBytes>
	//   61  110:invokevirtual   #124 <Method StringBuffer StringBuffer.append(int)>
	//   62  113:pop             
		stringbuffer.append("\n numDataBytes: ");
	//   63  114:aload_1         
	//   64  115:ldc1            #132 <String "\n numDataBytes: ">
	//   65  117:invokevirtual   #112 <Method StringBuffer StringBuffer.append(String)>
	//   66  120:pop             
		stringbuffer.append(numDataBytes);
	//   67  121:aload_1         
	//   68  122:aload_0         
	//   69  123:getfield        #38  <Field int numDataBytes>
	//   70  126:invokevirtual   #124 <Method StringBuffer StringBuffer.append(int)>
	//   71  129:pop             
		stringbuffer.append("\n numECBytes: ");
	//   72  130:aload_1         
	//   73  131:ldc1            #134 <String "\n numECBytes: ">
	//   74  133:invokevirtual   #112 <Method StringBuffer StringBuffer.append(String)>
	//   75  136:pop             
		stringbuffer.append(numECBytes);
	//   76  137:aload_1         
	//   77  138:aload_0         
	//   78  139:getfield        #40  <Field int numECBytes>
	//   79  142:invokevirtual   #124 <Method StringBuffer StringBuffer.append(int)>
	//   80  145:pop             
		stringbuffer.append("\n numRSBlocks: ");
	//   81  146:aload_1         
	//   82  147:ldc1            #136 <String "\n numRSBlocks: ">
	//   83  149:invokevirtual   #112 <Method StringBuffer StringBuffer.append(String)>
	//   84  152:pop             
		stringbuffer.append(numRSBlocks);
	//   85  153:aload_1         
	//   86  154:aload_0         
	//   87  155:getfield        #42  <Field int numRSBlocks>
	//   88  158:invokevirtual   #124 <Method StringBuffer StringBuffer.append(int)>
	//   89  161:pop             
		if(matrix == null)
	//*  90  162:aload_0         
	//*  91  163:getfield        #44  <Field ByteMatrix matrix>
	//*  92  166:ifnonnull       188
		{
			stringbuffer.append("\n matrix: null\n");
	//   93  169:aload_1         
	//   94  170:ldc1            #138 <String "\n matrix: null\n">
	//   95  172:invokevirtual   #112 <Method StringBuffer StringBuffer.append(String)>
	//   96  175:pop             
		} else
	//*  97  176:aload_1         
	//*  98  177:ldc1            #140 <String ">>\n">
	//*  99  179:invokevirtual   #112 <Method StringBuffer StringBuffer.append(String)>
	//* 100  182:pop             
	//* 101  183:aload_1         
	//* 102  184:invokevirtual   #142 <Method String StringBuffer.toString()>
	//* 103  187:areturn         
		{
			stringbuffer.append("\n matrix:\n");
	//  104  188:aload_1         
	//  105  189:ldc1            #144 <String "\n matrix:\n">
	//  106  191:invokevirtual   #112 <Method StringBuffer StringBuffer.append(String)>
	//  107  194:pop             
			stringbuffer.append(matrix.toString());
	//  108  195:aload_1         
	//  109  196:aload_0         
	//  110  197:getfield        #44  <Field ByteMatrix matrix>
	//  111  200:invokevirtual   #145 <Method String ByteMatrix.toString()>
	//  112  203:invokevirtual   #112 <Method StringBuffer StringBuffer.append(String)>
	//  113  206:pop             
		}
		stringbuffer.append(">>\n");
		return stringbuffer.toString();
	//* 114  207:goto            176
	}

	public static final int NUM_MASK_PATTERNS = 8;
	private ErrorCorrectionLevel ecLevel;
	private int maskPattern;
	private ByteMatrix matrix;
	private int matrixWidth;
	private Mode mode;
	private int numDataBytes;
	private int numECBytes;
	private int numRSBlocks;
	private int numTotalBytes;
	private int version;
}
