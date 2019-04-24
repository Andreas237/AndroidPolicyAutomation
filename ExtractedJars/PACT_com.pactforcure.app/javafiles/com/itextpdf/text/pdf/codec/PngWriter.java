// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import com.itextpdf.text.DocWriter;
import java.io.*;
import java.util.zip.DeflaterOutputStream;

public class PngWriter
{

	public PngWriter(OutputStream outputstream)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
		outp = outputstream;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #56  <Field OutputStream outp>
		outputstream.write(PNG_SIGNTURE);
	//    5    9:aload_1         
	//    6   10:getstatic       #26  <Field byte[] PNG_SIGNTURE>
	//    7   13:invokevirtual   #62  <Method void OutputStream.write(byte[])>
	//    8   16:return          
	}

	private static int crc(byte abyte0[])
	{
		return ~update_crc(-1, abyte0, 0, abyte0.length);
	//    0    0:iconst_m1       
	//    1    1:aload_0         
	//    2    2:iconst_0        
	//    3    3:aload_0         
	//    4    4:arraylength     
	//    5    5:invokestatic    #69  <Method int update_crc(int, byte[], int, int)>
	//    6    8:iconst_m1       
	//    7    9:ixor            
	//    8   10:ireturn         
	}

	private static int crc(byte abyte0[], int i, int j)
	{
		return ~update_crc(-1, abyte0, i, j);
	//    0    0:iconst_m1       
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:iload_2         
	//    4    4:invokestatic    #69  <Method int update_crc(int, byte[], int, int)>
	//    5    7:iconst_m1       
	//    6    8:ixor            
	//    7    9:ireturn         
	}

	private static void make_crc_table()
	{
		if(crc_table != null)
	//*   0    0:getstatic       #73  <Field int[] crc_table>
	//*   1    3:ifnull          7
			return;
	//    2    6:return          
		int ai[] = new int[256];
	//    3    7:sipush          256
	//    4   10:newarray        int[]
	//    5   12:astore_3        
		for(int i = 0; i < 256; i++)
	//*   6   13:iconst_0        
	//*   7   14:istore_0        
	//*   8   15:iload_0         
	//*   9   16:sipush          256
	//*  10   19:icmpge          70
		{
			int j = i;
	//   11   22:iload_0         
	//   12   23:istore_1        
			int k = 0;
	//   13   24:iconst_0        
	//   14   25:istore_2        
			while(k < 8) 
	//*  15   26:iload_2         
	//*  16   27:bipush          8
	//*  17   29:icmpge          59
			{
				if((j & 1) != 0)
	//*  18   32:iload_1         
	//*  19   33:iconst_1        
	//*  20   34:iand            
	//*  21   35:ifeq            52
					j = 0xedb88320 ^ j >>> 1;
	//   22   38:ldc1            #74  <Int 0xedb88320>
	//   23   40:iload_1         
	//   24   41:iconst_1        
	//   25   42:iushr           
	//   26   43:ixor            
	//   27   44:istore_1        
				else
	//*  28   45:iload_2         
	//*  29   46:iconst_1        
	//*  30   47:iadd            
	//*  31   48:istore_2        
	//*  32   49:goto            26
					j >>>= 1;
	//   33   52:iload_1         
	//   34   53:iconst_1        
	//   35   54:iushr           
	//   36   55:istore_1        
				k++;
			}
	//*  37   56:goto            45
			ai[i] = j;
	//   38   59:aload_3         
	//   39   60:iload_0         
	//   40   61:iload_1         
	//   41   62:iastore         
		}

	//   42   63:iload_0         
	//   43   64:iconst_1        
	//   44   65:iadd            
	//   45   66:istore_0        
	//*  46   67:goto            15
		crc_table = ai;
	//   47   70:aload_3         
	//   48   71:putstatic       #73  <Field int[] crc_table>
	//   49   74:return          
	}

	public static void outputInt(int i, OutputStream outputstream)
		throws IOException
	{
		outputstream.write(((int) ((byte)(i >> 24))));
	//    0    0:aload_1         
	//    1    1:iload_0         
	//    2    2:bipush          24
	//    3    4:ishr            
	//    4    5:int2byte        
	//    5    6:invokevirtual   #79  <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(i >> 16))));
	//    6    9:aload_1         
	//    7   10:iload_0         
	//    8   11:bipush          16
	//    9   13:ishr            
	//   10   14:int2byte        
	//   11   15:invokevirtual   #79  <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(i >> 8))));
	//   12   18:aload_1         
	//   13   19:iload_0         
	//   14   20:bipush          8
	//   15   22:ishr            
	//   16   23:int2byte        
	//   17   24:invokevirtual   #79  <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)i)));
	//   18   27:aload_1         
	//   19   28:iload_0         
	//   20   29:int2byte        
	//   21   30:invokevirtual   #79  <Method void OutputStream.write(int)>
	//   22   33:return          
	}

	private static int update_crc(int i, byte abyte0[], int j, int k)
	{
		int l = i;
	//    0    0:iload_0         
	//    1    1:istore          4
		if(crc_table == null)
	//*   2    3:getstatic       #73  <Field int[] crc_table>
	//*   3    6:ifnonnull       12
			make_crc_table();
	//    4    9:invokestatic    #81  <Method void make_crc_table()>
		for(i = 0; i < k; i++)
	//*   5   12:iconst_0        
	//*   6   13:istore_0        
	//*   7   14:iload_0         
	//*   8   15:iload_3         
	//*   9   16:icmpge          50
			l = crc_table[(abyte0[i + j] ^ l) & 0xff] ^ l >>> 8;
	//   10   19:getstatic       #73  <Field int[] crc_table>
	//   11   22:aload_1         
	//   12   23:iload_0         
	//   13   24:iload_2         
	//   14   25:iadd            
	//   15   26:baload          
	//   16   27:iload           4
	//   17   29:ixor            
	//   18   30:sipush          255
	//   19   33:iand            
	//   20   34:iaload          
	//   21   35:iload           4
	//   22   37:bipush          8
	//   23   39:iushr           
	//   24   40:ixor            
	//   25   41:istore          4

	//   26   43:iload_0         
	//   27   44:iconst_1        
	//   28   45:iadd            
	//   29   46:istore_0        
	//*  30   47:goto            14
		return l;
	//   31   50:iload           4
	//   32   52:ireturn         
	}

	public void outputInt(int i)
		throws IOException
	{
		outputInt(i, outp);
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #56  <Field OutputStream outp>
	//    3    5:invokestatic    #83  <Method void outputInt(int, OutputStream)>
	//    4    8:return          
	}

	public void writeChunk(byte abyte0[], byte abyte1[])
		throws IOException
	{
		outputInt(abyte1.length);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:arraylength     
	//    3    3:invokevirtual   #87  <Method void outputInt(int)>
		outp.write(abyte0, 0, 4);
	//    4    6:aload_0         
	//    5    7:getfield        #56  <Field OutputStream outp>
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:iconst_4        
	//    9   13:invokevirtual   #90  <Method void OutputStream.write(byte[], int, int)>
		outp.write(abyte1);
	//   10   16:aload_0         
	//   11   17:getfield        #56  <Field OutputStream outp>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #62  <Method void OutputStream.write(byte[])>
		outputInt(~update_crc(update_crc(-1, abyte0, 0, abyte0.length), abyte1, 0, abyte1.length));
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:aload_1         
	//   17   27:iconst_0        
	//   18   28:aload_1         
	//   19   29:arraylength     
	//   20   30:invokestatic    #69  <Method int update_crc(int, byte[], int, int)>
	//   21   33:aload_2         
	//   22   34:iconst_0        
	//   23   35:aload_2         
	//   24   36:arraylength     
	//   25   37:invokestatic    #69  <Method int update_crc(int, byte[], int, int)>
	//   26   40:iconst_m1       
	//   27   41:ixor            
	//   28   42:invokevirtual   #87  <Method void outputInt(int)>
	//   29   45:return          
	}

	public void writeData(byte abyte0[], int i)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #94  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #95  <Method void ByteArrayOutputStream()>
	//    3    7:astore          4
		DeflaterOutputStream deflateroutputstream = new DeflaterOutputStream(((OutputStream) (bytearrayoutputstream)));
	//    4    9:new             #97  <Class DeflaterOutputStream>
	//    5   12:dup             
	//    6   13:aload           4
	//    7   15:invokespecial   #99  <Method void DeflaterOutputStream(OutputStream)>
	//    8   18:astore          5
		int j;
		for(j = 0; j < abyte0.length - i; j += i)
	//*   9   20:iconst_0        
	//*  10   21:istore_3        
	//*  11   22:iload_3         
	//*  12   23:aload_1         
	//*  13   24:arraylength     
	//*  14   25:iload_2         
	//*  15   26:isub            
	//*  16   27:icmpge          51
		{
			deflateroutputstream.write(0);
	//   17   30:aload           5
	//   18   32:iconst_0        
	//   19   33:invokevirtual   #100 <Method void DeflaterOutputStream.write(int)>
			deflateroutputstream.write(abyte0, j, i);
	//   20   36:aload           5
	//   21   38:aload_1         
	//   22   39:iload_3         
	//   23   40:iload_2         
	//   24   41:invokevirtual   #101 <Method void DeflaterOutputStream.write(byte[], int, int)>
		}

	//   25   44:iload_3         
	//   26   45:iload_2         
	//   27   46:iadd            
	//   28   47:istore_3        
	//*  29   48:goto            22
		i = abyte0.length - j;
	//   30   51:aload_1         
	//   31   52:arraylength     
	//   32   53:iload_3         
	//   33   54:isub            
	//   34   55:istore_2        
		if(i > 0)
	//*  35   56:iload_2         
	//*  36   57:ifle            74
		{
			deflateroutputstream.write(0);
	//   37   60:aload           5
	//   38   62:iconst_0        
	//   39   63:invokevirtual   #100 <Method void DeflaterOutputStream.write(int)>
			deflateroutputstream.write(abyte0, j, i);
	//   40   66:aload           5
	//   41   68:aload_1         
	//   42   69:iload_3         
	//   43   70:iload_2         
	//   44   71:invokevirtual   #101 <Method void DeflaterOutputStream.write(byte[], int, int)>
		}
		deflateroutputstream.close();
	//   45   74:aload           5
	//   46   76:invokevirtual   #104 <Method void DeflaterOutputStream.close()>
		writeChunk(IDAT, bytearrayoutputstream.toByteArray());
	//   47   79:aload_0         
	//   48   80:getstatic       #41  <Field byte[] IDAT>
	//   49   83:aload           4
	//   50   85:invokevirtual   #108 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   51   88:invokevirtual   #110 <Method void writeChunk(byte[], byte[])>
	//   52   91:return          
	}

	public void writeEnd()
		throws IOException
	{
		writeChunk(IEND, new byte[0]);
	//    0    0:aload_0         
	//    1    1:getstatic       #44  <Field byte[] IEND>
	//    2    4:iconst_0        
	//    3    5:newarray        byte[]
	//    4    7:invokevirtual   #110 <Method void writeChunk(byte[], byte[])>
	//    5   10:return          
	}

	public void writeHeader(int i, int j, int k, int l)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #94  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #95  <Method void ByteArrayOutputStream()>
	//    3    7:astore          5
		outputInt(i, ((OutputStream) (bytearrayoutputstream)));
	//    4    9:iload_1         
	//    5   10:aload           5
	//    6   12:invokestatic    #83  <Method void outputInt(int, OutputStream)>
		outputInt(j, ((OutputStream) (bytearrayoutputstream)));
	//    7   15:iload_2         
	//    8   16:aload           5
	//    9   18:invokestatic    #83  <Method void outputInt(int, OutputStream)>
		bytearrayoutputstream.write(k);
	//   10   21:aload           5
	//   11   23:iload_3         
	//   12   24:invokevirtual   #114 <Method void ByteArrayOutputStream.write(int)>
		bytearrayoutputstream.write(l);
	//   13   27:aload           5
	//   14   29:iload           4
	//   15   31:invokevirtual   #114 <Method void ByteArrayOutputStream.write(int)>
		bytearrayoutputstream.write(0);
	//   16   34:aload           5
	//   17   36:iconst_0        
	//   18   37:invokevirtual   #114 <Method void ByteArrayOutputStream.write(int)>
		bytearrayoutputstream.write(0);
	//   19   40:aload           5
	//   20   42:iconst_0        
	//   21   43:invokevirtual   #114 <Method void ByteArrayOutputStream.write(int)>
		bytearrayoutputstream.write(0);
	//   22   46:aload           5
	//   23   48:iconst_0        
	//   24   49:invokevirtual   #114 <Method void ByteArrayOutputStream.write(int)>
		writeChunk(IHDR, bytearrayoutputstream.toByteArray());
	//   25   52:aload_0         
	//   26   53:getstatic       #35  <Field byte[] IHDR>
	//   27   56:aload           5
	//   28   58:invokevirtual   #108 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   29   61:invokevirtual   #110 <Method void writeChunk(byte[], byte[])>
	//   30   64:return          
	}

	public void writeIccProfile(byte abyte0[])
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #94  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #95  <Method void ByteArrayOutputStream()>
	//    3    7:astore_2        
		bytearrayoutputstream.write(73);
	//    4    8:aload_2         
	//    5    9:bipush          73
	//    6   11:invokevirtual   #114 <Method void ByteArrayOutputStream.write(int)>
		bytearrayoutputstream.write(67);
	//    7   14:aload_2         
	//    8   15:bipush          67
	//    9   17:invokevirtual   #114 <Method void ByteArrayOutputStream.write(int)>
		bytearrayoutputstream.write(67);
	//   10   20:aload_2         
	//   11   21:bipush          67
	//   12   23:invokevirtual   #114 <Method void ByteArrayOutputStream.write(int)>
		bytearrayoutputstream.write(0);
	//   13   26:aload_2         
	//   14   27:iconst_0        
	//   15   28:invokevirtual   #114 <Method void ByteArrayOutputStream.write(int)>
		bytearrayoutputstream.write(0);
	//   16   31:aload_2         
	//   17   32:iconst_0        
	//   18   33:invokevirtual   #114 <Method void ByteArrayOutputStream.write(int)>
		DeflaterOutputStream deflateroutputstream = new DeflaterOutputStream(((OutputStream) (bytearrayoutputstream)));
	//   19   36:new             #97  <Class DeflaterOutputStream>
	//   20   39:dup             
	//   21   40:aload_2         
	//   22   41:invokespecial   #99  <Method void DeflaterOutputStream(OutputStream)>
	//   23   44:astore_3        
		deflateroutputstream.write(abyte0);
	//   24   45:aload_3         
	//   25   46:aload_1         
	//   26   47:invokevirtual   #116 <Method void DeflaterOutputStream.write(byte[])>
		deflateroutputstream.close();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #104 <Method void DeflaterOutputStream.close()>
		writeChunk(iCCP, bytearrayoutputstream.toByteArray());
	//   29   54:aload_0         
	//   30   55:getstatic       #47  <Field byte[] iCCP>
	//   31   58:aload_2         
	//   32   59:invokevirtual   #108 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   33   62:invokevirtual   #110 <Method void writeChunk(byte[], byte[])>
	//   34   65:return          
	}

	public void writePalette(byte abyte0[])
		throws IOException
	{
		writeChunk(PLTE, abyte0);
	//    0    0:aload_0         
	//    1    1:getstatic       #38  <Field byte[] PLTE>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #110 <Method void writeChunk(byte[], byte[])>
	//    4    8:return          
	}

	private static final byte IDAT[] = DocWriter.getISOBytes("IDAT");
	private static final byte IEND[] = DocWriter.getISOBytes("IEND");
	private static final byte IHDR[] = DocWriter.getISOBytes("IHDR");
	private static final byte PLTE[] = DocWriter.getISOBytes("PLTE");
	private static final byte PNG_SIGNTURE[] = {
		-119, 80, 78, 71, 13, 10, 26, 10
	};
	private static int crc_table[];
	private static final byte iCCP[] = DocWriter.getISOBytes("iCCP");
	private OutputStream outp;

	static 
	{
	//    0    0:bipush          8
	//    1    2:newarray        byte[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #18  <Int -119>
	//    5    8:bastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #19  <Int 80>
	//    9   13:bastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #20  <Int 78>
	//   13   18:bastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #21  <Int 71>
	//   17   23:bastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #22  <Int 13>
	//   21   28:bastore         
	//   22   29:dup             
	//   23   30:iconst_5        
	//   24   31:ldc1            #23  <Int 10>
	//   25   33:bastore         
	//   26   34:dup             
	//   27   35:bipush          6
	//   28   37:ldc1            #24  <Int 26>
	//   29   39:bastore         
	//   30   40:dup             
	//   31   41:bipush          7
	//   32   43:ldc1            #23  <Int 10>
	//   33   45:bastore         
	//   34   46:putstatic       #26  <Field byte[] PNG_SIGNTURE>
	//   35   49:ldc1            #27  <String "IHDR">
	//   36   51:invokestatic    #33  <Method byte[] DocWriter.getISOBytes(String)>
	//   37   54:putstatic       #35  <Field byte[] IHDR>
	//   38   57:ldc1            #36  <String "PLTE">
	//   39   59:invokestatic    #33  <Method byte[] DocWriter.getISOBytes(String)>
	//   40   62:putstatic       #38  <Field byte[] PLTE>
	//   41   65:ldc1            #39  <String "IDAT">
	//   42   67:invokestatic    #33  <Method byte[] DocWriter.getISOBytes(String)>
	//   43   70:putstatic       #41  <Field byte[] IDAT>
	//   44   73:ldc1            #42  <String "IEND">
	//   45   75:invokestatic    #33  <Method byte[] DocWriter.getISOBytes(String)>
	//   46   78:putstatic       #44  <Field byte[] IEND>
	//   47   81:ldc1            #45  <String "iCCP">
	//   48   83:invokestatic    #33  <Method byte[] DocWriter.getISOBytes(String)>
	//   49   86:putstatic       #47  <Field byte[] iCCP>
	//*  50   89:return          
	}
}
