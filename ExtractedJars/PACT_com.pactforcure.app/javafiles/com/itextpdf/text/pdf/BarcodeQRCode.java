// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.codec.CCITTG4Encoder;
import com.itextpdf.text.pdf.qrcode.ByteMatrix;
import com.itextpdf.text.pdf.qrcode.QRCodeWriter;
import com.itextpdf.text.pdf.qrcode.WriterException;
import java.util.Map;

public class BarcodeQRCode
{

	public BarcodeQRCode(String s, int i, int j, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		try
		{
			bm = (new QRCodeWriter()).encode(s, i, j, map);
	//    2    4:aload_0         
	//    3    5:new             #15  <Class QRCodeWriter>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void QRCodeWriter()>
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:iload_3         
	//    9   15:aload           4
	//   10   17:invokevirtual   #20  <Method ByteMatrix QRCodeWriter.encode(String, int, int, Map)>
	//   11   20:putfield        #22  <Field ByteMatrix bm>
			return;
	//   12   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  13   24:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//   14   25:new             #24  <Class ExceptionConverter>
	//   15   28:dup             
	//   16   29:aload_1         
	//   17   30:invokespecial   #27  <Method void ExceptionConverter(Exception)>
	//   18   33:athrow          
		}
	}

	private byte[] getBitMatrix()
	{
		int k = bm.getWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ByteMatrix bm>
	//    2    4:invokevirtual   #38  <Method int ByteMatrix.getWidth()>
	//    3    7:istore_3        
		int l = bm.getHeight();
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field ByteMatrix bm>
	//    6   12:invokevirtual   #41  <Method int ByteMatrix.getHeight()>
	//    7   15:istore          4
		int i1 = (k + 7) / 8;
	//    8   17:iload_3         
	//    9   18:bipush          7
	//   10   20:iadd            
	//   11   21:bipush          8
	//   12   23:idiv            
	//   13   24:istore          5
		byte abyte0[] = new byte[i1 * l];
	//   14   26:iload           5
	//   15   28:iload           4
	//   16   30:imul            
	//   17   31:newarray        byte[]
	//   18   33:astore          7
		byte abyte1[][] = bm.getArray();
	//   19   35:aload_0         
	//   20   36:getfield        #22  <Field ByteMatrix bm>
	//   21   39:invokevirtual   #45  <Method byte[][] ByteMatrix.getArray()>
	//   22   42:astore          8
		for(int i = 0; i < l; i++)
	//*  23   44:iconst_0        
	//*  24   45:istore_1        
	//*  25   46:iload_1         
	//*  26   47:iload           4
	//*  27   49:icmpge          118
		{
			byte abyte2[] = abyte1[i];
	//   28   52:aload           8
	//   29   54:iload_1         
	//   30   55:aaload          
	//   31   56:astore          9
			for(int j = 0; j < k; j++)
	//*  32   58:iconst_0        
	//*  33   59:istore_2        
	//*  34   60:iload_2         
	//*  35   61:iload_3         
	//*  36   62:icmpge          111
				if(abyte2[j] != 0)
	//*  37   65:aload           9
	//*  38   67:iload_2         
	//*  39   68:iaload          
	//*  40   69:ifeq            104
				{
					int j1 = i1 * i + j / 8;
	//   41   72:iload           5
	//   42   74:iload_1         
	//   43   75:imul            
	//   44   76:iload_2         
	//   45   77:bipush          8
	//   46   79:idiv            
	//   47   80:iadd            
	//   48   81:istore          6
					abyte0[j1] = (byte)(abyte0[j1] | (byte)(128 >> j % 8));
	//   49   83:aload           7
	//   50   85:iload           6
	//   51   87:aload           7
	//   52   89:iload           6
	//   53   91:baload          
	//   54   92:sipush          128
	//   55   95:iload_2         
	//   56   96:bipush          8
	//   57   98:irem            
	//   58   99:ishr            
	//   59  100:int2byte        
	//   60  101:ior             
	//   61  102:int2byte        
	//   62  103:bastore         
				}

	//   63  104:iload_2         
	//   64  105:iconst_1        
	//   65  106:iadd            
	//   66  107:istore_2        
		}

	//   67  108:goto            60
	//   68  111:iload_1         
	//   69  112:iconst_1        
	//   70  113:iadd            
	//   71  114:istore_1        
	//*  72  115:goto            46
		return abyte0;
	//   73  118:aload           7
	//   74  120:areturn         
	}

	public Image getImage()
		throws BadElementException
	{
		byte abyte0[] = CCITTG4Encoder.compress(getBitMatrix(), bm.getWidth(), bm.getHeight());
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method byte[] getBitMatrix()>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field ByteMatrix bm>
	//    4    8:invokevirtual   #38  <Method int ByteMatrix.getWidth()>
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field ByteMatrix bm>
	//    7   15:invokevirtual   #41  <Method int ByteMatrix.getHeight()>
	//    8   18:invokestatic    #57  <Method byte[] CCITTG4Encoder.compress(byte[], int, int)>
	//    9   21:astore_1        
		return Image.getInstance(bm.getWidth(), bm.getHeight(), false, 256, 1, abyte0, ((int []) (null)));
	//   10   22:aload_0         
	//   11   23:getfield        #22  <Field ByteMatrix bm>
	//   12   26:invokevirtual   #38  <Method int ByteMatrix.getWidth()>
	//   13   29:aload_0         
	//   14   30:getfield        #22  <Field ByteMatrix bm>
	//   15   33:invokevirtual   #41  <Method int ByteMatrix.getHeight()>
	//   16   36:iconst_0        
	//   17   37:sipush          256
	//   18   40:iconst_1        
	//   19   41:aload_1         
	//   20   42:aconst_null     
	//   21   43:invokestatic    #63  <Method Image Image.getInstance(int, int, boolean, int, int, byte[], int[])>
	//   22   46:areturn         
	}

	ByteMatrix bm;
}
