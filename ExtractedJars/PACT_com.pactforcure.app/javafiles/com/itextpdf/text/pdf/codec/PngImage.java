// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.*;
import java.io.*;
import java.net.URL;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public class PngImage
{
	static class NewByteArrayOutputStream extends ByteArrayOutputStream
	{

		public byte[] getBuf()
		{
			return buf;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field byte[] buf>
		//    2    4:areturn         
		}

		NewByteArrayOutputStream()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void ByteArrayOutputStream()>
		//    2    4:return          
		}
	}


	PngImage(InputStream inputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #116 <Method void Object()>
		additional = new PdfDictionary();
	//    2    4:aload_0         
	//    3    5:new             #118 <Class PdfDictionary>
	//    4    8:dup             
	//    5    9:invokespecial   #119 <Method void PdfDictionary()>
	//    6   12:putfield        #121 <Field PdfDictionary additional>
		idat = new NewByteArrayOutputStream();
	//    7   15:aload_0         
	//    8   16:new             #6   <Class PngImage$NewByteArrayOutputStream>
	//    9   19:dup             
	//   10   20:invokespecial   #122 <Method void PngImage$NewByteArrayOutputStream()>
	//   11   23:putfield        #124 <Field PngImage$NewByteArrayOutputStream idat>
		transRedGray = -1;
	//   12   26:aload_0         
	//   13   27:iconst_m1       
	//   14   28:putfield        #126 <Field int transRedGray>
		transGreen = -1;
	//   15   31:aload_0         
	//   16   32:iconst_m1       
	//   17   33:putfield        #128 <Field int transGreen>
		transBlue = -1;
	//   18   36:aload_0         
	//   19   37:iconst_m1       
	//   20   38:putfield        #130 <Field int transBlue>
		gamma = 1.0F;
	//   21   41:aload_0         
	//   22   42:fconst_1        
	//   23   43:putfield        #132 <Field float gamma>
		hasCHRM = false;
	//   24   46:aload_0         
	//   25   47:iconst_0        
	//   26   48:putfield        #134 <Field boolean hasCHRM>
		is = inputstream;
	//   27   51:aload_0         
	//   28   52:aload_1         
	//   29   53:putfield        #136 <Field InputStream is>
	//   30   56:return          
	}

	private static void decodeAverageFilter(byte abyte0[], byte abyte1[], int i, int j)
	{
		for(int k = 0; k < j; k++)
	//*   0    0:iconst_0        
	//*   1    1:istore          4
	//*   2    3:iload           4
	//*   3    5:iload_3         
	//*   4    6:icmpge          46
		{
			byte byte0 = abyte0[k];
	//    5    9:aload_0         
	//    6   10:iload           4
	//    7   12:baload          
	//    8   13:istore          5
			abyte0[k] = (byte)((abyte1[k] & 0xff) / 2 + (byte0 & 0xff));
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:aload_1         
	//   12   19:iload           4
	//   13   21:baload          
	//   14   22:sipush          255
	//   15   25:iand            
	//   16   26:iconst_2        
	//   17   27:idiv            
	//   18   28:iload           5
	//   19   30:sipush          255
	//   20   33:iand            
	//   21   34:iadd            
	//   22   35:int2byte        
	//   23   36:bastore         
		}

	//   24   37:iload           4
	//   25   39:iconst_1        
	//   26   40:iadd            
	//   27   41:istore          4
	//*  28   43:goto            3
		for(int l = j; l < i; l++)
	//*  29   46:iload_3         
	//*  30   47:istore          4
	//*  31   49:iload           4
	//*  32   51:iload_2         
	//*  33   52:icmpge          103
		{
			byte byte1 = abyte0[l];
	//   34   55:aload_0         
	//   35   56:iload           4
	//   36   58:baload          
	//   37   59:istore          5
			abyte0[l] = (byte)(((abyte0[l - j] & 0xff) + (abyte1[l] & 0xff)) / 2 + (byte1 & 0xff));
	//   38   61:aload_0         
	//   39   62:iload           4
	//   40   64:aload_0         
	//   41   65:iload           4
	//   42   67:iload_3         
	//   43   68:isub            
	//   44   69:baload          
	//   45   70:sipush          255
	//   46   73:iand            
	//   47   74:aload_1         
	//   48   75:iload           4
	//   49   77:baload          
	//   50   78:sipush          255
	//   51   81:iand            
	//   52   82:iadd            
	//   53   83:iconst_2        
	//   54   84:idiv            
	//   55   85:iload           5
	//   56   87:sipush          255
	//   57   90:iand            
	//   58   91:iadd            
	//   59   92:int2byte        
	//   60   93:bastore         
		}

	//   61   94:iload           4
	//   62   96:iconst_1        
	//   63   97:iadd            
	//   64   98:istore          4
	//*  65  100:goto            49
	//   66  103:return          
	}

	private static void decodePaethFilter(byte abyte0[], byte abyte1[], int i, int j)
	{
		for(int k = 0; k < j; k++)
	//*   0    0:iconst_0        
	//*   1    1:istore          4
	//*   2    3:iload           4
	//*   3    5:iload_3         
	//*   4    6:icmpge          40
			abyte0[k] = (byte)((abyte0[k] & 0xff) + (abyte1[k] & 0xff));
	//    5    9:aload_0         
	//    6   10:iload           4
	//    7   12:aload_0         
	//    8   13:iload           4
	//    9   15:baload          
	//   10   16:sipush          255
	//   11   19:iand            
	//   12   20:aload_1         
	//   13   21:iload           4
	//   14   23:baload          
	//   15   24:sipush          255
	//   16   27:iand            
	//   17   28:iadd            
	//   18   29:int2byte        
	//   19   30:bastore         

	//   20   31:iload           4
	//   21   33:iconst_1        
	//   22   34:iadd            
	//   23   35:istore          4
	//*  24   37:goto            3
		for(int l = j; l < i; l++)
	//*  25   40:iload_3         
	//*  26   41:istore          4
	//*  27   43:iload           4
	//*  28   45:iload_2         
	//*  29   46:icmpge          107
		{
			byte byte0 = abyte0[l];
	//   30   49:aload_0         
	//   31   50:iload           4
	//   32   52:baload          
	//   33   53:istore          5
			abyte0[l] = (byte)(paethPredictor(abyte0[l - j] & 0xff, abyte1[l] & 0xff, abyte1[l - j] & 0xff) + (byte0 & 0xff));
	//   34   55:aload_0         
	//   35   56:iload           4
	//   36   58:aload_0         
	//   37   59:iload           4
	//   38   61:iload_3         
	//   39   62:isub            
	//   40   63:baload          
	//   41   64:sipush          255
	//   42   67:iand            
	//   43   68:aload_1         
	//   44   69:iload           4
	//   45   71:baload          
	//   46   72:sipush          255
	//   47   75:iand            
	//   48   76:aload_1         
	//   49   77:iload           4
	//   50   79:iload_3         
	//   51   80:isub            
	//   52   81:baload          
	//   53   82:sipush          255
	//   54   85:iand            
	//   55   86:invokestatic    #143 <Method int paethPredictor(int, int, int)>
	//   56   89:iload           5
	//   57   91:sipush          255
	//   58   94:iand            
	//   59   95:iadd            
	//   60   96:int2byte        
	//   61   97:bastore         
		}

	//   62   98:iload           4
	//   63  100:iconst_1        
	//   64  101:iadd            
	//   65  102:istore          4
	//*  66  104:goto            43
	//   67  107:return          
	}

	private static void decodeSubFilter(byte abyte0[], int i, int j)
	{
		for(int k = j; k < i; k++)
	//*   0    0:iload_2         
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:iload_1         
	//*   4    4:icmpge          35
			abyte0[k] = (byte)((abyte0[k] & 0xff) + (abyte0[k - j] & 0xff));
	//    5    7:aload_0         
	//    6    8:iload_3         
	//    7    9:aload_0         
	//    8   10:iload_3         
	//    9   11:baload          
	//   10   12:sipush          255
	//   11   15:iand            
	//   12   16:aload_0         
	//   13   17:iload_3         
	//   14   18:iload_2         
	//   15   19:isub            
	//   16   20:baload          
	//   17   21:sipush          255
	//   18   24:iand            
	//   19   25:iadd            
	//   20   26:int2byte        
	//   21   27:bastore         

	//   22   28:iload_3         
	//   23   29:iconst_1        
	//   24   30:iadd            
	//   25   31:istore_3        
	//*  26   32:goto            2
	//   27   35:return          
	}

	private static void decodeUpFilter(byte abyte0[], byte abyte1[], int i)
	{
		for(int j = 0; j < i; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:iload_2         
	//*   4    4:icmpge          33
			abyte0[j] = (byte)((abyte0[j] & 0xff) + (abyte1[j] & 0xff));
	//    5    7:aload_0         
	//    6    8:iload_3         
	//    7    9:aload_0         
	//    8   10:iload_3         
	//    9   11:baload          
	//   10   12:sipush          255
	//   11   15:iand            
	//   12   16:aload_1         
	//   13   17:iload_3         
	//   14   18:baload          
	//   15   19:sipush          255
	//   16   22:iand            
	//   17   23:iadd            
	//   18   24:int2byte        
	//   19   25:bastore         

	//   20   26:iload_3         
	//   21   27:iconst_1        
	//   22   28:iadd            
	//   23   29:istore_3        
	//*  24   30:goto            2
	//   25   33:return          
	}

	public static Image getImage(InputStream inputstream)
		throws IOException
	{
		return (new PngImage(inputstream)).getImage();
	//    0    0:new             #2   <Class PngImage>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #153 <Method void PngImage(InputStream)>
	//    4    8:invokevirtual   #156 <Method Image getImage()>
	//    5   11:areturn         
	}

	public static Image getImage(String s)
		throws IOException
	{
		return getImage(Utilities.toURL(s));
	//    0    0:aload_0         
	//    1    1:invokestatic    #164 <Method URL Utilities.toURL(String)>
	//    2    4:invokestatic    #167 <Method Image getImage(URL)>
	//    3    7:areturn         
	}

	public static Image getImage(URL url)
		throws IOException
	{
		InputStream inputstream = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		InputStream inputstream1 = url.openStream();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #173 <Method InputStream URL.openStream()>
	//    4    6:astore_2        
		inputstream = inputstream1;
	//    5    7:aload_2         
	//    6    8:astore_1        
		Image image1 = getImage(inputstream1);
	//    7    9:aload_2         
	//    8   10:invokestatic    #175 <Method Image getImage(InputStream)>
	//    9   13:astore_3        
		inputstream = inputstream1;
	//   10   14:aload_2         
	//   11   15:astore_1        
		image1.setUrl(url);
	//   12   16:aload_3         
	//   13   17:aload_0         
	//   14   18:invokevirtual   #181 <Method void Image.setUrl(URL)>
		if(inputstream1 != null)
	//*  15   21:aload_2         
	//*  16   22:ifnull          29
			inputstream1.close();
	//   17   25:aload_2         
	//   18   26:invokevirtual   #186 <Method void InputStream.close()>
		return image1;
	//   19   29:aload_3         
	//   20   30:areturn         
		url;
	//   21   31:astore_0        
		if(inputstream != null)
	//*  22   32:aload_1         
	//*  23   33:ifnull          40
			inputstream.close();
	//   24   36:aload_1         
	//   25   37:invokevirtual   #186 <Method void InputStream.close()>
		throw url;
	//   26   40:aload_0         
	//   27   41:athrow          
	}

	public static Image getImage(byte abyte0[])
		throws IOException
	{
		Image image1 = getImage(((InputStream) (new ByteArrayInputStream(abyte0))));
	//    0    0:new             #189 <Class ByteArrayInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #192 <Method void ByteArrayInputStream(byte[])>
	//    4    8:invokestatic    #175 <Method Image getImage(InputStream)>
	//    5   11:astore_1        
		image1.setOriginalData(abyte0);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #195 <Method void Image.setOriginalData(byte[])>
		return image1;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public static final int getInt(InputStream inputstream)
		throws IOException
	{
		return (inputstream.read() << 24) + (inputstream.read() << 16) + (inputstream.read() << 8) + inputstream.read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #201 <Method int InputStream.read()>
	//    2    4:bipush          24
	//    3    6:ishl            
	//    4    7:aload_0         
	//    5    8:invokevirtual   #201 <Method int InputStream.read()>
	//    6   11:bipush          16
	//    7   13:ishl            
	//    8   14:iadd            
	//    9   15:aload_0         
	//   10   16:invokevirtual   #201 <Method int InputStream.read()>
	//   11   19:bipush          8
	//   12   21:ishl            
	//   13   22:iadd            
	//   14   23:aload_0         
	//   15   24:invokevirtual   #201 <Method int InputStream.read()>
	//   16   27:iadd            
	//   17   28:ireturn         
	}

	static int getPixel(byte abyte0[], int i, int j, int k, int l)
	{
		if(k == 8)
	//*   0    0:iload_3         
	//*   1    1:bipush          8
	//*   2    3:icmpne          19
			return abyte0[l * j + i] & 0xff;
	//    3    6:aload_0         
	//    4    7:iload           4
	//    5    9:iload_2         
	//    6   10:imul            
	//    7   11:iload_1         
	//    8   12:iadd            
	//    9   13:baload          
	//   10   14:sipush          255
	//   11   17:iand            
	//   12   18:ireturn         
		else
			return (1 << k) - 1 & abyte0[l * j + i / (8 / k)] >> 8 - (i % (8 / k)) * k - k;
	//   13   19:iconst_1        
	//   14   20:iload_3         
	//   15   21:ishl            
	//   16   22:iconst_1        
	//   17   23:isub            
	//   18   24:aload_0         
	//   19   25:iload           4
	//   20   27:iload_2         
	//   21   28:imul            
	//   22   29:iload_1         
	//   23   30:bipush          8
	//   24   32:iload_3         
	//   25   33:idiv            
	//   26   34:idiv            
	//   27   35:iadd            
	//   28   36:baload          
	//   29   37:bipush          8
	//   30   39:iload_1         
	//   31   40:bipush          8
	//   32   42:iload_3         
	//   33   43:idiv            
	//   34   44:irem            
	//   35   45:iload_3         
	//   36   46:imul            
	//   37   47:isub            
	//   38   48:iload_3         
	//   39   49:isub            
	//   40   50:ishr            
	//   41   51:iand            
	//   42   52:ireturn         
	}

	public static final String getString(InputStream inputstream)
		throws IOException
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #207 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #208 <Method void StringBuffer()>
	//    3    7:astore_2        
		for(int i = 0; i < 4; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iconst_4        
	//*   8   12:icmpge          32
			stringbuffer.append((char)inputstream.read());
	//    9   15:aload_2         
	//   10   16:aload_0         
	//   11   17:invokevirtual   #201 <Method int InputStream.read()>
	//   12   20:int2char        
	//   13   21:invokevirtual   #212 <Method StringBuffer StringBuffer.append(char)>
	//   14   24:pop             

	//   15   25:iload_1         
	//   16   26:iconst_1        
	//   17   27:iadd            
	//   18   28:istore_1        
	//*  19   29:goto            10
		return stringbuffer.toString();
	//   20   32:aload_2         
	//   21   33:invokevirtual   #216 <Method String StringBuffer.toString()>
	//   22   36:areturn         
	}

	public static final int getWord(InputStream inputstream)
		throws IOException
	{
		return (inputstream.read() << 8) + inputstream.read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #201 <Method int InputStream.read()>
	//    2    4:bipush          8
	//    3    6:ishl            
	//    4    7:aload_0         
	//    5    8:invokevirtual   #201 <Method int InputStream.read()>
	//    6   11:iadd            
	//    7   12:ireturn         
	}

	private static int paethPredictor(int i, int j, int k)
	{
		int j1 = (i + j) - k;
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iadd            
	//    3    3:iload_2         
	//    4    4:isub            
	//    5    5:istore          5
		int l = Math.abs(j1 - i);
	//    6    7:iload           5
	//    7    9:iload_0         
	//    8   10:isub            
	//    9   11:invokestatic    #223 <Method int Math.abs(int)>
	//   10   14:istore_3        
		int i1 = Math.abs(j1 - j);
	//   11   15:iload           5
	//   12   17:iload_1         
	//   13   18:isub            
	//   14   19:invokestatic    #223 <Method int Math.abs(int)>
	//   15   22:istore          4
		j1 = Math.abs(j1 - k);
	//   16   24:iload           5
	//   17   26:iload_2         
	//   18   27:isub            
	//   19   28:invokestatic    #223 <Method int Math.abs(int)>
	//   20   31:istore          5
		if(l <= i1 && l <= j1)
	//*  21   33:iload_3         
	//*  22   34:iload           4
	//*  23   36:icmpgt          47
	//*  24   39:iload_3         
	//*  25   40:iload           5
	//*  26   42:icmpgt          47
			return i;
	//   27   45:iload_0         
	//   28   46:ireturn         
		if(i1 <= j1)
	//*  29   47:iload           4
	//*  30   49:iload           5
	//*  31   51:icmpgt          56
			return j;
	//   32   54:iload_1         
	//   33   55:ireturn         
		else
			return k;
	//   34   56:iload_2         
	//   35   57:ireturn         
	}

	static void setPixel(byte abyte0[], int ai[], int i, int j, int k, int l, int i1, int j1)
	{
		if(i1 == 8)
	//*   0    0:iload           6
	//*   1    2:bipush          8
	//*   2    4:icmpne          47
			for(i1 = 0; i1 < j; i1++)
	//*   3    7:iconst_0        
	//*   4    8:istore          6
	//*   5   10:iload           6
	//*   6   12:iload_3         
	//*   7   13:icmpge          147
				abyte0[j1 * l + j * k + i1] = (byte)ai[i1 + i];
	//    8   16:aload_0         
	//    9   17:iload           7
	//   10   19:iload           5
	//   11   21:imul            
	//   12   22:iload_3         
	//   13   23:iload           4
	//   14   25:imul            
	//   15   26:iadd            
	//   16   27:iload           6
	//   17   29:iadd            
	//   18   30:aload_1         
	//   19   31:iload           6
	//   20   33:iload_2         
	//   21   34:iadd            
	//   22   35:iaload          
	//   23   36:int2byte        
	//   24   37:bastore         

	//   25   38:iload           6
	//   26   40:iconst_1        
	//   27   41:iadd            
	//   28   42:istore          6
		else
	//*  29   44:goto            10
		if(i1 == 16)
	//*  30   47:iload           6
	//*  31   49:bipush          16
	//*  32   51:icmpne          97
		{
			for(i1 = 0; i1 < j; i1++)
	//*  33   54:iconst_0        
	//*  34   55:istore          6
	//*  35   57:iload           6
	//*  36   59:iload_3         
	//*  37   60:icmpge          147
				abyte0[j1 * l + j * k + i1] = (byte)(ai[i1 + i] >>> 8);
	//   38   63:aload_0         
	//   39   64:iload           7
	//   40   66:iload           5
	//   41   68:imul            
	//   42   69:iload_3         
	//   43   70:iload           4
	//   44   72:imul            
	//   45   73:iadd            
	//   46   74:iload           6
	//   47   76:iadd            
	//   48   77:aload_1         
	//   49   78:iload           6
	//   50   80:iload_2         
	//   51   81:iadd            
	//   52   82:iaload          
	//   53   83:bipush          8
	//   54   85:iushr           
	//   55   86:int2byte        
	//   56   87:bastore         

	//   57   88:iload           6
	//   58   90:iconst_1        
	//   59   91:iadd            
	//   60   92:istore          6
		} else
	//*  61   94:goto            57
		{
			j = j1 * l + k / (8 / i1);
	//   62   97:iload           7
	//   63   99:iload           5
	//   64  101:imul            
	//   65  102:iload           4
	//   66  104:bipush          8
	//   67  106:iload           6
	//   68  108:idiv            
	//   69  109:idiv            
	//   70  110:iadd            
	//   71  111:istore_3        
			i = ai[i];
	//   72  112:aload_1         
	//   73  113:iload_2         
	//   74  114:iaload          
	//   75  115:istore_2        
			l = 8 / i1;
	//   76  116:bipush          8
	//   77  118:iload           6
	//   78  120:idiv            
	//   79  121:istore          5
			abyte0[j] = (byte)(abyte0[j] | i << 8 - (k % l) * i1 - i1);
	//   80  123:aload_0         
	//   81  124:iload_3         
	//   82  125:aload_0         
	//   83  126:iload_3         
	//   84  127:baload          
	//   85  128:iload_2         
	//   86  129:bipush          8
	//   87  131:iload           4
	//   88  133:iload           5
	//   89  135:irem            
	//   90  136:iload           6
	//   91  138:imul            
	//   92  139:isub            
	//   93  140:iload           6
	//   94  142:isub            
	//   95  143:ishl            
	//   96  144:ior             
	//   97  145:int2byte        
	//   98  146:bastore         
		}
	//   99  147:return          
	}

	boolean checkMarker(String s)
	{
		if(s.length() == 4) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #232 <Method int String.length()>
	//    2    4:iconst_4        
	//    3    5:icmpeq          10
_L1:
		return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
_L2:
		int i = 0;
	//    6   10:iconst_0        
	//    7   11:istore_2        
label0:
		do
		{
label1:
			{
				if(i >= 4)
					break label1;
	//    8   12:iload_2         
	//    9   13:iconst_4        
	//   10   14:icmpge          54
				char c = s.charAt(i);
	//   11   17:aload_1         
	//   12   18:iload_2         
	//   13   19:invokevirtual   #236 <Method char String.charAt(int)>
	//   14   22:istore_3        
				if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))
					break label0;
	//   15   23:iload_3         
	//   16   24:bipush          97
	//   17   26:icmplt          35
	//   18   29:iload_3         
	//   19   30:bipush          122
	//   20   32:icmple          47
	//   21   35:iload_3         
	//   22   36:bipush          65
	//   23   38:icmplt          8
	//   24   41:iload_3         
	//   25   42:bipush          90
	//   26   44:icmpgt          8
				i++;
	//   27   47:iload_2         
	//   28   48:iconst_1        
	//   29   49:iadd            
	//   30   50:istore_2        
			}
		} while(true);
	//   31   51:goto            12
		if(true) goto _L1; else goto _L3
_L3:
		return true;
	//   32   54:iconst_1        
	//   33   55:ireturn         
	}

	void decodeIdat()
	{
		int i;
		int j;
		byte byte0;
		i = bitDepth;
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field int bitDepth>
	//    2    4:istore_1        
		j = i;
	//    3    5:iload_1         
	//    4    6:istore_2        
		if(i == 16)
	//*   5    7:iload_1         
	//*   6    8:bipush          16
	//*   7   10:icmpne          16
			j = 8;
	//    8   13:bipush          8
	//    9   15:istore_2        
		byte0 = -1;
	//   10   16:iconst_m1       
	//   11   17:istore_3        
		if(bitDepth == 16)
	//*  12   18:aload_0         
	//*  13   19:getfield        #239 <Field int bitDepth>
	//*  14   22:bipush          16
	//*  15   24:icmpne          191
			i = 2;
	//   16   27:iconst_2        
	//   17   28:istore_1        
		else
	//*  18   29:aload_0         
	//*  19   30:iload_1         
	//*  20   31:putfield        #241 <Field int bytesPerPixel>
	//*  21   34:iload_3         
	//*  22   35:istore_1        
	//*  23   36:aload_0         
	//*  24   37:getfield        #243 <Field int colorType>
	//*  25   40:tableswitch     0 6: default 84
	//	               0 196
	//	               1 86
	//	               2 217
	//	               3 242
	//	               4 278
	//	               5 86
	//	               6 301
	//*  26   84:iload_3         
	//*  27   85:istore_1        
	//*  28   86:iload_1         
	//*  29   87:iflt            97
	//*  30   90:aload_0         
	//*  31   91:iload_1         
	//*  32   92:newarray        byte[]
	//*  33   94:putfield        #245 <Field byte[] image>
	//*  34   97:aload_0         
	//*  35   98:getfield        #247 <Field boolean palShades>
	//*  36  101:ifeq            326
	//*  37  104:aload_0         
	//*  38  105:aload_0         
	//*  39  106:getfield        #249 <Field int width>
	//*  40  109:aload_0         
	//*  41  110:getfield        #251 <Field int height>
	//*  42  113:imul            
	//*  43  114:newarray        byte[]
	//*  44  116:putfield        #253 <Field byte[] smask>
	//*  45  119:aload_0         
	//*  46  120:new             #255 <Class DataInputStream>
	//*  47  123:dup             
	//*  48  124:new             #257 <Class InflaterInputStream>
	//*  49  127:dup             
	//*  50  128:new             #189 <Class ByteArrayInputStream>
	//*  51  131:dup             
	//*  52  132:aload_0         
	//*  53  133:getfield        #124 <Field PngImage$NewByteArrayOutputStream idat>
	//*  54  136:invokevirtual   #261 <Method byte[] PngImage$NewByteArrayOutputStream.getBuf()>
	//*  55  139:iconst_0        
	//*  56  140:aload_0         
	//*  57  141:getfield        #124 <Field PngImage$NewByteArrayOutputStream idat>
	//*  58  144:invokevirtual   #264 <Method int PngImage$NewByteArrayOutputStream.size()>
	//*  59  147:invokespecial   #266 <Method void ByteArrayInputStream(byte[], int, int)>
	//*  60  150:new             #268 <Class Inflater>
	//*  61  153:dup             
	//*  62  154:invokespecial   #269 <Method void Inflater()>
	//*  63  157:invokespecial   #272 <Method void InflaterInputStream(InputStream, Inflater)>
	//*  64  160:invokespecial   #273 <Method void DataInputStream(InputStream)>
	//*  65  163:putfield        #275 <Field DataInputStream dataStream>
	//*  66  166:aload_0         
	//*  67  167:getfield        #277 <Field int interlaceMethod>
	//*  68  170:iconst_1        
	//*  69  171:icmpeq          357
	//*  70  174:aload_0         
	//*  71  175:iconst_0        
	//*  72  176:iconst_0        
	//*  73  177:iconst_1        
	//*  74  178:iconst_1        
	//*  75  179:aload_0         
	//*  76  180:getfield        #249 <Field int width>
	//*  77  183:aload_0         
	//*  78  184:getfield        #251 <Field int height>
	//*  79  187:invokevirtual   #281 <Method void decodePass(int, int, int, int, int, int)>
	//*  80  190:return          
			i = 1;
	//   81  191:iconst_1        
	//   82  192:istore_1        
		bytesPerPixel = i;
		i = ((int) (byte0));
		colorType;
		JVM INSTR tableswitch 0 6: default 84
	//	               0 196
	//	               1 86
	//	               2 217
	//	               3 242
	//	               4 278
	//	               5 86
	//	               6 301;
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L3 _L7
_L7:
		break MISSING_BLOCK_LABEL_301;
_L3:
		break; /* Loop/switch isn't completed */
_L1:
		i = ((int) (byte0));
_L8:
		if(i >= 0)
			image = new byte[i];
		if(palShades)
			smask = new byte[width * height];
		else
	//*  83  193:goto            29
	//*  84  196:aload_0         
	//*  85  197:getfield        #249 <Field int width>
	//*  86  200:iload_2         
	//*  87  201:imul            
	//*  88  202:bipush          7
	//*  89  204:iadd            
	//*  90  205:bipush          8
	//*  91  207:idiv            
	//*  92  208:aload_0         
	//*  93  209:getfield        #251 <Field int height>
	//*  94  212:imul            
	//*  95  213:istore_1        
	//*  96  214:goto            86
	//*  97  217:aload_0         
	//*  98  218:getfield        #249 <Field int width>
	//*  99  221:iconst_3        
	//* 100  222:imul            
	//* 101  223:aload_0         
	//* 102  224:getfield        #251 <Field int height>
	//* 103  227:imul            
	//* 104  228:istore_1        
	//* 105  229:aload_0         
	//* 106  230:aload_0         
	//* 107  231:getfield        #241 <Field int bytesPerPixel>
	//* 108  234:iconst_3        
	//* 109  235:imul            
	//* 110  236:putfield        #241 <Field int bytesPerPixel>
	//* 111  239:goto            86
	//* 112  242:iload_3         
	//* 113  243:istore_1        
	//* 114  244:aload_0         
	//* 115  245:getfield        #277 <Field int interlaceMethod>
	//* 116  248:iconst_1        
	//* 117  249:icmpne          270
	//* 118  252:aload_0         
	//* 119  253:getfield        #249 <Field int width>
	//* 120  256:iload_2         
	//* 121  257:imul            
	//* 122  258:bipush          7
	//* 123  260:iadd            
	//* 124  261:bipush          8
	//* 125  263:idiv            
	//* 126  264:aload_0         
	//* 127  265:getfield        #251 <Field int height>
	//* 128  268:imul            
	//* 129  269:istore_1        
	//* 130  270:aload_0         
	//* 131  271:iconst_1        
	//* 132  272:putfield        #241 <Field int bytesPerPixel>
	//* 133  275:goto            86
	//* 134  278:aload_0         
	//* 135  279:getfield        #249 <Field int width>
	//* 136  282:aload_0         
	//* 137  283:getfield        #251 <Field int height>
	//* 138  286:imul            
	//* 139  287:istore_1        
	//* 140  288:aload_0         
	//* 141  289:aload_0         
	//* 142  290:getfield        #241 <Field int bytesPerPixel>
	//* 143  293:iconst_2        
	//* 144  294:imul            
	//* 145  295:putfield        #241 <Field int bytesPerPixel>
	//* 146  298:goto            86
	//* 147  301:aload_0         
	//* 148  302:getfield        #249 <Field int width>
	//* 149  305:iconst_3        
	//* 150  306:imul            
	//* 151  307:aload_0         
	//* 152  308:getfield        #251 <Field int height>
	//* 153  311:imul            
	//* 154  312:istore_1        
	//* 155  313:aload_0         
	//* 156  314:aload_0         
	//* 157  315:getfield        #241 <Field int bytesPerPixel>
	//* 158  318:iconst_4        
	//* 159  319:imul            
	//* 160  320:putfield        #241 <Field int bytesPerPixel>
	//* 161  323:goto            86
		if(genBWMask)
	//* 162  326:aload_0         
	//* 163  327:getfield        #283 <Field boolean genBWMask>
	//* 164  330:ifeq            119
			smask = new byte[((width + 7) / 8) * height];
	//  165  333:aload_0         
	//  166  334:aload_0         
	//  167  335:getfield        #249 <Field int width>
	//  168  338:bipush          7
	//  169  340:iadd            
	//  170  341:bipush          8
	//  171  343:idiv            
	//  172  344:aload_0         
	//  173  345:getfield        #251 <Field int height>
	//  174  348:imul            
	//  175  349:newarray        byte[]
	//  176  351:putfield        #253 <Field byte[] smask>
		dataStream = new DataInputStream(((InputStream) (new InflaterInputStream(((InputStream) (new ByteArrayInputStream(idat.getBuf(), 0, idat.size()))), new Inflater()))));
		if(interlaceMethod != 1)
		{
			decodePass(0, 0, 1, 1, width, height);
			return;
		} else
	//* 177  354:goto            119
		{
			decodePass(0, 0, 8, 8, (width + 7) / 8, (height + 7) / 8);
	//  178  357:aload_0         
	//  179  358:iconst_0        
	//  180  359:iconst_0        
	//  181  360:bipush          8
	//  182  362:bipush          8
	//  183  364:aload_0         
	//  184  365:getfield        #249 <Field int width>
	//  185  368:bipush          7
	//  186  370:iadd            
	//  187  371:bipush          8
	//  188  373:idiv            
	//  189  374:aload_0         
	//  190  375:getfield        #251 <Field int height>
	//  191  378:bipush          7
	//  192  380:iadd            
	//  193  381:bipush          8
	//  194  383:idiv            
	//  195  384:invokevirtual   #281 <Method void decodePass(int, int, int, int, int, int)>
			decodePass(4, 0, 8, 8, (width + 3) / 8, (height + 7) / 8);
	//  196  387:aload_0         
	//  197  388:iconst_4        
	//  198  389:iconst_0        
	//  199  390:bipush          8
	//  200  392:bipush          8
	//  201  394:aload_0         
	//  202  395:getfield        #249 <Field int width>
	//  203  398:iconst_3        
	//  204  399:iadd            
	//  205  400:bipush          8
	//  206  402:idiv            
	//  207  403:aload_0         
	//  208  404:getfield        #251 <Field int height>
	//  209  407:bipush          7
	//  210  409:iadd            
	//  211  410:bipush          8
	//  212  412:idiv            
	//  213  413:invokevirtual   #281 <Method void decodePass(int, int, int, int, int, int)>
			decodePass(0, 4, 4, 8, (width + 3) / 4, (height + 3) / 8);
	//  214  416:aload_0         
	//  215  417:iconst_0        
	//  216  418:iconst_4        
	//  217  419:iconst_4        
	//  218  420:bipush          8
	//  219  422:aload_0         
	//  220  423:getfield        #249 <Field int width>
	//  221  426:iconst_3        
	//  222  427:iadd            
	//  223  428:iconst_4        
	//  224  429:idiv            
	//  225  430:aload_0         
	//  226  431:getfield        #251 <Field int height>
	//  227  434:iconst_3        
	//  228  435:iadd            
	//  229  436:bipush          8
	//  230  438:idiv            
	//  231  439:invokevirtual   #281 <Method void decodePass(int, int, int, int, int, int)>
			decodePass(2, 0, 4, 4, (width + 1) / 4, (height + 3) / 4);
	//  232  442:aload_0         
	//  233  443:iconst_2        
	//  234  444:iconst_0        
	//  235  445:iconst_4        
	//  236  446:iconst_4        
	//  237  447:aload_0         
	//  238  448:getfield        #249 <Field int width>
	//  239  451:iconst_1        
	//  240  452:iadd            
	//  241  453:iconst_4        
	//  242  454:idiv            
	//  243  455:aload_0         
	//  244  456:getfield        #251 <Field int height>
	//  245  459:iconst_3        
	//  246  460:iadd            
	//  247  461:iconst_4        
	//  248  462:idiv            
	//  249  463:invokevirtual   #281 <Method void decodePass(int, int, int, int, int, int)>
			decodePass(0, 2, 2, 4, (width + 1) / 2, (height + 1) / 4);
	//  250  466:aload_0         
	//  251  467:iconst_0        
	//  252  468:iconst_2        
	//  253  469:iconst_2        
	//  254  470:iconst_4        
	//  255  471:aload_0         
	//  256  472:getfield        #249 <Field int width>
	//  257  475:iconst_1        
	//  258  476:iadd            
	//  259  477:iconst_2        
	//  260  478:idiv            
	//  261  479:aload_0         
	//  262  480:getfield        #251 <Field int height>
	//  263  483:iconst_1        
	//  264  484:iadd            
	//  265  485:iconst_4        
	//  266  486:idiv            
	//  267  487:invokevirtual   #281 <Method void decodePass(int, int, int, int, int, int)>
			decodePass(1, 0, 2, 2, width / 2, (height + 1) / 2);
	//  268  490:aload_0         
	//  269  491:iconst_1        
	//  270  492:iconst_0        
	//  271  493:iconst_2        
	//  272  494:iconst_2        
	//  273  495:aload_0         
	//  274  496:getfield        #249 <Field int width>
	//  275  499:iconst_2        
	//  276  500:idiv            
	//  277  501:aload_0         
	//  278  502:getfield        #251 <Field int height>
	//  279  505:iconst_1        
	//  280  506:iadd            
	//  281  507:iconst_2        
	//  282  508:idiv            
	//  283  509:invokevirtual   #281 <Method void decodePass(int, int, int, int, int, int)>
			decodePass(0, 1, 1, 2, width, height / 2);
	//  284  512:aload_0         
	//  285  513:iconst_0        
	//  286  514:iconst_1        
	//  287  515:iconst_1        
	//  288  516:iconst_2        
	//  289  517:aload_0         
	//  290  518:getfield        #249 <Field int width>
	//  291  521:aload_0         
	//  292  522:getfield        #251 <Field int height>
	//  293  525:iconst_2        
	//  294  526:idiv            
	//  295  527:invokevirtual   #281 <Method void decodePass(int, int, int, int, int, int)>
			return;
	//  296  530:return          
		}
_L2:
		i = ((width * j + 7) / 8) * height;
		  goto _L8
_L4:
		i = width * 3 * height;
		bytesPerPixel = bytesPerPixel * 3;
		  goto _L8
_L5:
		i = ((int) (byte0));
		if(interlaceMethod == 1)
			i = ((width * j + 7) / 8) * height;
		bytesPerPixel = 1;
		  goto _L8
_L6:
		i = width * height;
		bytesPerPixel = bytesPerPixel * 2;
		  goto _L8
		i = width * 3 * height;
		bytesPerPixel = bytesPerPixel * 4;
		  goto _L8
	}

	void decodePass(int i, int j, int k, int l, int i1, int j1)
	{
		if(i1 != 0 && j1 != 0) goto _L2; else goto _L1
	//    0    0:iload           5
	//    1    2:ifeq            10
	//    2    5:iload           6
	//    3    7:ifne            11
_L1:
		return;
	//    4   10:return          
_L2:
		int k1;
		int l1;
		int j2;
		byte abyte0[];
		byte abyte1[];
		j2 = (inputBands * i1 * bitDepth + 7) / 8;
	//    5   11:aload_0         
	//    6   12:getfield        #287 <Field int inputBands>
	//    7   15:iload           5
	//    8   17:imul            
	//    9   18:aload_0         
	//   10   19:getfield        #239 <Field int bitDepth>
	//   11   22:imul            
	//   12   23:bipush          7
	//   13   25:iadd            
	//   14   26:bipush          8
	//   15   28:idiv            
	//   16   29:istore          10
		abyte0 = new byte[j2];
	//   17   31:iload           10
	//   18   33:newarray        byte[]
	//   19   35:astore          11
		abyte1 = new byte[j2];
	//   20   37:iload           10
	//   21   39:newarray        byte[]
	//   22   41:astore          12
		l1 = 0;
	//   23   43:iconst_0        
	//   24   44:istore          8
		k1 = j;
	//   25   46:iload_2         
	//   26   47:istore          7
_L10:
		if(l1 >= j1) goto _L1; else goto _L3
	//   27   49:iload           8
	//   28   51:iload           6
	//   29   53:icmpge          10
_L3:
		j = 0;
	//   30   56:iconst_0        
	//   31   57:istore_2        
		int i2 = dataStream.read();
	//   32   58:aload_0         
	//   33   59:getfield        #275 <Field DataInputStream dataStream>
	//   34   62:invokevirtual   #288 <Method int DataInputStream.read()>
	//   35   65:istore          9
		j = i2;
	//   36   67:iload           9
	//   37   69:istore_2        
		dataStream.readFully(abyte0, 0, j2);
	//   38   70:aload_0         
	//   39   71:getfield        #275 <Field DataInputStream dataStream>
	//   40   74:aload           11
	//   41   76:iconst_0        
	//   42   77:iload           10
	//   43   79:invokevirtual   #291 <Method void DataInputStream.readFully(byte[], int, int)>
		j = i2;
	//   44   82:iload           9
	//   45   84:istore_2        
_L12:
		j;
	//   46   85:iload_2         
		JVM INSTR tableswitch 0 4: default 120
	//	               0 149
	//	               1 138
	//	               2 189
	//	               3 201
	//	               4 217;
	//   47   86:tableswitch     0 4: default 120
	//	               0 149
	//	               1 138
	//	               2 189
	//	               3 201
	//	               4 217
		   goto _L4 _L5 _L6 _L7 _L8 _L9
_L9:
		break MISSING_BLOCK_LABEL_217;
_L5:
		break; /* Loop/switch isn't completed */
_L4:
		throw new RuntimeException(MessageLocalization.getComposedMessage("png.filter.unknown", new Object[0]));
	//   48  120:new             #293 <Class RuntimeException>
	//   49  123:dup             
	//   50  124:ldc2            #295 <String "png.filter.unknown">
	//   51  127:iconst_0        
	//   52  128:anewarray       Object[]
	//   53  131:invokestatic    #301 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   54  134:invokespecial   #304 <Method void RuntimeException(String)>
	//   55  137:athrow          
_L6:
		decodeSubFilter(abyte0, j2, bytesPerPixel);
	//   56  138:aload           11
	//   57  140:iload           10
	//   58  142:aload_0         
	//   59  143:getfield        #241 <Field int bytesPerPixel>
	//   60  146:invokestatic    #306 <Method void decodeSubFilter(byte[], int, int)>
_L11:
		processPixels(abyte0, i, k, k1, i1);
	//   61  149:aload_0         
	//   62  150:aload           11
	//   63  152:iload_1         
	//   64  153:iload_3         
	//   65  154:iload           7
	//   66  156:iload           5
	//   67  158:invokevirtual   #310 <Method void processPixels(byte[], int, int, int, int)>
		byte abyte2[] = abyte0;
	//   68  161:aload           11
	//   69  163:astore          13
		abyte0 = abyte1;
	//   70  165:aload           12
	//   71  167:astore          11
		l1++;
	//   72  169:iload           8
	//   73  171:iconst_1        
	//   74  172:iadd            
	//   75  173:istore          8
		k1 += l;
	//   76  175:iload           7
	//   77  177:iload           4
	//   78  179:iadd            
	//   79  180:istore          7
		abyte1 = abyte2;
	//   80  182:aload           13
	//   81  184:astore          12
		  goto _L10
	//*  82  186:goto            49
_L7:
		decodeUpFilter(abyte0, abyte1, j2);
	//   83  189:aload           11
	//   84  191:aload           12
	//   85  193:iload           10
	//   86  195:invokestatic    #312 <Method void decodeUpFilter(byte[], byte[], int)>
		  goto _L11
	//*  87  198:goto            149
_L8:
		decodeAverageFilter(abyte0, abyte1, j2, bytesPerPixel);
	//   88  201:aload           11
	//   89  203:aload           12
	//   90  205:iload           10
	//   91  207:aload_0         
	//   92  208:getfield        #241 <Field int bytesPerPixel>
	//   93  211:invokestatic    #314 <Method void decodeAverageFilter(byte[], byte[], int, int)>
		  goto _L11
	//*  94  214:goto            149
		decodePaethFilter(abyte0, abyte1, j2, bytesPerPixel);
	//   95  217:aload           11
	//   96  219:aload           12
	//   97  221:iload           10
	//   98  223:aload_0         
	//   99  224:getfield        #241 <Field int bytesPerPixel>
	//  100  227:invokestatic    #316 <Method void decodePaethFilter(byte[], byte[], int, int)>
		  goto _L11
	//* 101  230:goto            149
		Exception exception;
		exception;
	//  102  233:astore          13
		  goto _L12
	//* 103  235:goto            85
	}

	PdfObject getColorspace()
	{
		if(icc_profile != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #320 <Field ICC_Profile icc_profile>
	//*   2    4:ifnull          24
			if((colorType & 2) == 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #243 <Field int colorType>
	//*   5   11:iconst_2        
	//*   6   12:iand            
	//*   7   13:ifne            20
				return ((PdfObject) (PdfName.DEVICEGRAY));
	//    8   16:getstatic       #323 <Field PdfName PdfName.DEVICEGRAY>
	//    9   19:areturn         
			else
				return ((PdfObject) (PdfName.DEVICERGB));
	//   10   20:getstatic       #326 <Field PdfName PdfName.DEVICERGB>
	//   11   23:areturn         
		if(gamma == 1.0F && !hasCHRM)
	//*  12   24:aload_0         
	//*  13   25:getfield        #132 <Field float gamma>
	//*  14   28:fconst_1        
	//*  15   29:fcmpl           
	//*  16   30:ifne            57
	//*  17   33:aload_0         
	//*  18   34:getfield        #134 <Field boolean hasCHRM>
	//*  19   37:ifne            57
			if((colorType & 2) == 0)
	//*  20   40:aload_0         
	//*  21   41:getfield        #243 <Field int colorType>
	//*  22   44:iconst_2        
	//*  23   45:iand            
	//*  24   46:ifne            53
				return ((PdfObject) (PdfName.DEVICEGRAY));
	//   25   49:getstatic       #323 <Field PdfName PdfName.DEVICEGRAY>
	//   26   52:areturn         
			else
				return ((PdfObject) (PdfName.DEVICERGB));
	//   27   53:getstatic       #326 <Field PdfName PdfName.DEVICERGB>
	//   28   56:areturn         
		PdfArray pdfarray = new PdfArray();
	//   29   57:new             #328 <Class PdfArray>
	//   30   60:dup             
	//   31   61:invokespecial   #329 <Method void PdfArray()>
	//   32   64:astore          11
		PdfDictionary pdfdictionary = new PdfDictionary();
	//   33   66:new             #118 <Class PdfDictionary>
	//   34   69:dup             
	//   35   70:invokespecial   #119 <Method void PdfDictionary()>
	//   36   73:astore          12
		if((colorType & 2) == 0)
	//*  37   75:aload_0         
	//*  38   76:getfield        #243 <Field int colorType>
	//*  39   79:iconst_2        
	//*  40   80:iand            
	//*  41   81:ifne            154
			if(gamma == 1.0F)
	//*  42   84:aload_0         
	//*  43   85:getfield        #132 <Field float gamma>
	//*  44   88:fconst_1        
	//*  45   89:fcmpl           
	//*  46   90:ifne            97
			{
				return ((PdfObject) (PdfName.DEVICEGRAY));
	//   47   93:getstatic       #323 <Field PdfName PdfName.DEVICEGRAY>
	//   48   96:areturn         
			} else
			{
				pdfarray.add(((PdfObject) (PdfName.CALGRAY)));
	//   49   97:aload           11
	//   50   99:getstatic       #332 <Field PdfName PdfName.CALGRAY>
	//   51  102:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//   52  105:pop             
				pdfdictionary.put(PdfName.GAMMA, ((PdfObject) (new PdfNumber(gamma))));
	//   53  106:aload           12
	//   54  108:getstatic       #339 <Field PdfName PdfName.GAMMA>
	//   55  111:new             #341 <Class PdfNumber>
	//   56  114:dup             
	//   57  115:aload_0         
	//   58  116:getfield        #132 <Field float gamma>
	//   59  119:invokespecial   #344 <Method void PdfNumber(float)>
	//   60  122:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfdictionary.put(PdfName.WHITEPOINT, ((PdfObject) (new PdfLiteral("[1 1 1]"))));
	//   61  125:aload           12
	//   62  127:getstatic       #351 <Field PdfName PdfName.WHITEPOINT>
	//   63  130:new             #353 <Class PdfLiteral>
	//   64  133:dup             
	//   65  134:ldc2            #355 <String "[1 1 1]">
	//   66  137:invokespecial   #356 <Method void PdfLiteral(String)>
	//   67  140:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfarray.add(((PdfObject) (pdfdictionary)));
	//   68  143:aload           11
	//   69  145:aload           12
	//   70  147:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//   71  150:pop             
				return ((PdfObject) (pdfarray));
	//   72  151:aload           11
	//   73  153:areturn         
			}
		Object obj = ((Object) (new PdfLiteral("[1 1 1]")));
	//   74  154:new             #353 <Class PdfLiteral>
	//   75  157:dup             
	//   76  158:ldc2            #355 <String "[1 1 1]">
	//   77  161:invokespecial   #356 <Method void PdfLiteral(String)>
	//   78  164:astore          10
		pdfarray.add(((PdfObject) (PdfName.CALRGB)));
	//   79  166:aload           11
	//   80  168:getstatic       #359 <Field PdfName PdfName.CALRGB>
	//   81  171:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//   82  174:pop             
		if(gamma != 1.0F)
	//*  83  175:aload_0         
	//*  84  176:getfield        #132 <Field float gamma>
	//*  85  179:fconst_1        
	//*  86  180:fcmpl           
	//*  87  181:ifeq            240
		{
			PdfArray pdfarray1 = new PdfArray();
	//   88  184:new             #328 <Class PdfArray>
	//   89  187:dup             
	//   90  188:invokespecial   #329 <Method void PdfArray()>
	//   91  191:astore          13
			PdfNumber pdfnumber = new PdfNumber(gamma);
	//   92  193:new             #341 <Class PdfNumber>
	//   93  196:dup             
	//   94  197:aload_0         
	//   95  198:getfield        #132 <Field float gamma>
	//   96  201:invokespecial   #344 <Method void PdfNumber(float)>
	//   97  204:astore          14
			pdfarray1.add(((PdfObject) (pdfnumber)));
	//   98  206:aload           13
	//   99  208:aload           14
	//  100  210:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  101  213:pop             
			pdfarray1.add(((PdfObject) (pdfnumber)));
	//  102  214:aload           13
	//  103  216:aload           14
	//  104  218:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  105  221:pop             
			pdfarray1.add(((PdfObject) (pdfnumber)));
	//  106  222:aload           13
	//  107  224:aload           14
	//  108  226:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  109  229:pop             
			pdfdictionary.put(PdfName.GAMMA, ((PdfObject) (pdfarray1)));
	//  110  230:aload           12
	//  111  232:getstatic       #339 <Field PdfName PdfName.GAMMA>
	//  112  235:aload           13
	//  113  237:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		if(hasCHRM)
	//* 114  240:aload_0         
	//* 115  241:getfield        #134 <Field boolean hasCHRM>
	//* 116  244:ifeq            766
		{
			float f6 = yW * (((xG - xB) * yR - (xR - xB) * yG) + (xR - xG) * yB);
	//  117  247:aload_0         
	//  118  248:getfield        #361 <Field float yW>
	//  119  251:aload_0         
	//  120  252:getfield        #363 <Field float xG>
	//  121  255:aload_0         
	//  122  256:getfield        #365 <Field float xB>
	//  123  259:fsub            
	//  124  260:aload_0         
	//  125  261:getfield        #367 <Field float yR>
	//  126  264:fmul            
	//  127  265:aload_0         
	//  128  266:getfield        #369 <Field float xR>
	//  129  269:aload_0         
	//  130  270:getfield        #365 <Field float xB>
	//  131  273:fsub            
	//  132  274:aload_0         
	//  133  275:getfield        #371 <Field float yG>
	//  134  278:fmul            
	//  135  279:fsub            
	//  136  280:aload_0         
	//  137  281:getfield        #369 <Field float xR>
	//  138  284:aload_0         
	//  139  285:getfield        #363 <Field float xG>
	//  140  288:fsub            
	//  141  289:aload_0         
	//  142  290:getfield        #373 <Field float yB>
	//  143  293:fmul            
	//  144  294:fadd            
	//  145  295:fmul            
	//  146  296:fstore          7
			float f = (yR * (((xG - xB) * yW - (xW - xB) * yG) + (xW - xG) * yB)) / f6;
	//  147  298:aload_0         
	//  148  299:getfield        #367 <Field float yR>
	//  149  302:aload_0         
	//  150  303:getfield        #363 <Field float xG>
	//  151  306:aload_0         
	//  152  307:getfield        #365 <Field float xB>
	//  153  310:fsub            
	//  154  311:aload_0         
	//  155  312:getfield        #361 <Field float yW>
	//  156  315:fmul            
	//  157  316:aload_0         
	//  158  317:getfield        #375 <Field float xW>
	//  159  320:aload_0         
	//  160  321:getfield        #365 <Field float xB>
	//  161  324:fsub            
	//  162  325:aload_0         
	//  163  326:getfield        #371 <Field float yG>
	//  164  329:fmul            
	//  165  330:fsub            
	//  166  331:aload_0         
	//  167  332:getfield        #375 <Field float xW>
	//  168  335:aload_0         
	//  169  336:getfield        #363 <Field float xG>
	//  170  339:fsub            
	//  171  340:aload_0         
	//  172  341:getfield        #373 <Field float yB>
	//  173  344:fmul            
	//  174  345:fadd            
	//  175  346:fmul            
	//  176  347:fload           7
	//  177  349:fdiv            
	//  178  350:fstore_1        
			float f1 = (xR * f) / yR;
	//  179  351:aload_0         
	//  180  352:getfield        #369 <Field float xR>
	//  181  355:fload_1         
	//  182  356:fmul            
	//  183  357:aload_0         
	//  184  358:getfield        #367 <Field float yR>
	//  185  361:fdiv            
	//  186  362:fstore_2        
			float f2 = f * ((1.0F - xR) / yR - 1.0F);
	//  187  363:fload_1         
	//  188  364:fconst_1        
	//  189  365:aload_0         
	//  190  366:getfield        #369 <Field float xR>
	//  191  369:fsub            
	//  192  370:aload_0         
	//  193  371:getfield        #367 <Field float yR>
	//  194  374:fdiv            
	//  195  375:fconst_1        
	//  196  376:fsub            
	//  197  377:fmul            
	//  198  378:fstore_3        
			float f3 = (-yG * (((xR - xB) * yW - (xW - xB) * yR) + (xW - xR) * yB)) / f6;
	//  199  379:aload_0         
	//  200  380:getfield        #371 <Field float yG>
	//  201  383:fneg            
	//  202  384:aload_0         
	//  203  385:getfield        #369 <Field float xR>
	//  204  388:aload_0         
	//  205  389:getfield        #365 <Field float xB>
	//  206  392:fsub            
	//  207  393:aload_0         
	//  208  394:getfield        #361 <Field float yW>
	//  209  397:fmul            
	//  210  398:aload_0         
	//  211  399:getfield        #375 <Field float xW>
	//  212  402:aload_0         
	//  213  403:getfield        #365 <Field float xB>
	//  214  406:fsub            
	//  215  407:aload_0         
	//  216  408:getfield        #367 <Field float yR>
	//  217  411:fmul            
	//  218  412:fsub            
	//  219  413:aload_0         
	//  220  414:getfield        #375 <Field float xW>
	//  221  417:aload_0         
	//  222  418:getfield        #369 <Field float xR>
	//  223  421:fsub            
	//  224  422:aload_0         
	//  225  423:getfield        #373 <Field float yB>
	//  226  426:fmul            
	//  227  427:fadd            
	//  228  428:fmul            
	//  229  429:fload           7
	//  230  431:fdiv            
	//  231  432:fstore          4
			float f4 = (xG * f3) / yG;
	//  232  434:aload_0         
	//  233  435:getfield        #363 <Field float xG>
	//  234  438:fload           4
	//  235  440:fmul            
	//  236  441:aload_0         
	//  237  442:getfield        #371 <Field float yG>
	//  238  445:fdiv            
	//  239  446:fstore          5
			float f5 = f3 * ((1.0F - xG) / yG - 1.0F);
	//  240  448:fload           4
	//  241  450:fconst_1        
	//  242  451:aload_0         
	//  243  452:getfield        #363 <Field float xG>
	//  244  455:fsub            
	//  245  456:aload_0         
	//  246  457:getfield        #371 <Field float yG>
	//  247  460:fdiv            
	//  248  461:fconst_1        
	//  249  462:fsub            
	//  250  463:fmul            
	//  251  464:fstore          6
			f6 = (yB * (((xR - xG) * yW - (xW - xG) * yW) + (xW - xR) * yG)) / f6;
	//  252  466:aload_0         
	//  253  467:getfield        #373 <Field float yB>
	//  254  470:aload_0         
	//  255  471:getfield        #369 <Field float xR>
	//  256  474:aload_0         
	//  257  475:getfield        #363 <Field float xG>
	//  258  478:fsub            
	//  259  479:aload_0         
	//  260  480:getfield        #361 <Field float yW>
	//  261  483:fmul            
	//  262  484:aload_0         
	//  263  485:getfield        #375 <Field float xW>
	//  264  488:aload_0         
	//  265  489:getfield        #363 <Field float xG>
	//  266  492:fsub            
	//  267  493:aload_0         
	//  268  494:getfield        #361 <Field float yW>
	//  269  497:fmul            
	//  270  498:fsub            
	//  271  499:aload_0         
	//  272  500:getfield        #375 <Field float xW>
	//  273  503:aload_0         
	//  274  504:getfield        #369 <Field float xR>
	//  275  507:fsub            
	//  276  508:aload_0         
	//  277  509:getfield        #371 <Field float yG>
	//  278  512:fmul            
	//  279  513:fadd            
	//  280  514:fmul            
	//  281  515:fload           7
	//  282  517:fdiv            
	//  283  518:fstore          7
			float f7 = (xB * f6) / yB;
	//  284  520:aload_0         
	//  285  521:getfield        #365 <Field float xB>
	//  286  524:fload           7
	//  287  526:fmul            
	//  288  527:aload_0         
	//  289  528:getfield        #373 <Field float yB>
	//  290  531:fdiv            
	//  291  532:fstore          8
			float f8 = f6 * ((1.0F - xB) / yB - 1.0F);
	//  292  534:fload           7
	//  293  536:fconst_1        
	//  294  537:aload_0         
	//  295  538:getfield        #365 <Field float xB>
	//  296  541:fsub            
	//  297  542:aload_0         
	//  298  543:getfield        #373 <Field float yB>
	//  299  546:fdiv            
	//  300  547:fconst_1        
	//  301  548:fsub            
	//  302  549:fmul            
	//  303  550:fstore          9
			obj = ((Object) (new PdfArray()));
	//  304  552:new             #328 <Class PdfArray>
	//  305  555:dup             
	//  306  556:invokespecial   #329 <Method void PdfArray()>
	//  307  559:astore          10
			((PdfArray) (obj)).add(((PdfObject) (new PdfNumber(f1 + f4 + f7))));
	//  308  561:aload           10
	//  309  563:new             #341 <Class PdfNumber>
	//  310  566:dup             
	//  311  567:fload_2         
	//  312  568:fload           5
	//  313  570:fadd            
	//  314  571:fload           8
	//  315  573:fadd            
	//  316  574:invokespecial   #344 <Method void PdfNumber(float)>
	//  317  577:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  318  580:pop             
			((PdfArray) (obj)).add(((PdfObject) (new PdfNumber(1.0F))));
	//  319  581:aload           10
	//  320  583:new             #341 <Class PdfNumber>
	//  321  586:dup             
	//  322  587:fconst_1        
	//  323  588:invokespecial   #344 <Method void PdfNumber(float)>
	//  324  591:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  325  594:pop             
			((PdfArray) (obj)).add(((PdfObject) (new PdfNumber(f2 + f5 + f8))));
	//  326  595:aload           10
	//  327  597:new             #341 <Class PdfNumber>
	//  328  600:dup             
	//  329  601:fload_3         
	//  330  602:fload           6
	//  331  604:fadd            
	//  332  605:fload           9
	//  333  607:fadd            
	//  334  608:invokespecial   #344 <Method void PdfNumber(float)>
	//  335  611:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  336  614:pop             
			PdfArray pdfarray2 = new PdfArray();
	//  337  615:new             #328 <Class PdfArray>
	//  338  618:dup             
	//  339  619:invokespecial   #329 <Method void PdfArray()>
	//  340  622:astore          13
			pdfarray2.add(((PdfObject) (new PdfNumber(f1))));
	//  341  624:aload           13
	//  342  626:new             #341 <Class PdfNumber>
	//  343  629:dup             
	//  344  630:fload_2         
	//  345  631:invokespecial   #344 <Method void PdfNumber(float)>
	//  346  634:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  347  637:pop             
			pdfarray2.add(((PdfObject) (new PdfNumber(f))));
	//  348  638:aload           13
	//  349  640:new             #341 <Class PdfNumber>
	//  350  643:dup             
	//  351  644:fload_1         
	//  352  645:invokespecial   #344 <Method void PdfNumber(float)>
	//  353  648:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  354  651:pop             
			pdfarray2.add(((PdfObject) (new PdfNumber(f2))));
	//  355  652:aload           13
	//  356  654:new             #341 <Class PdfNumber>
	//  357  657:dup             
	//  358  658:fload_3         
	//  359  659:invokespecial   #344 <Method void PdfNumber(float)>
	//  360  662:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  361  665:pop             
			pdfarray2.add(((PdfObject) (new PdfNumber(f4))));
	//  362  666:aload           13
	//  363  668:new             #341 <Class PdfNumber>
	//  364  671:dup             
	//  365  672:fload           5
	//  366  674:invokespecial   #344 <Method void PdfNumber(float)>
	//  367  677:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  368  680:pop             
			pdfarray2.add(((PdfObject) (new PdfNumber(f3))));
	//  369  681:aload           13
	//  370  683:new             #341 <Class PdfNumber>
	//  371  686:dup             
	//  372  687:fload           4
	//  373  689:invokespecial   #344 <Method void PdfNumber(float)>
	//  374  692:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  375  695:pop             
			pdfarray2.add(((PdfObject) (new PdfNumber(f5))));
	//  376  696:aload           13
	//  377  698:new             #341 <Class PdfNumber>
	//  378  701:dup             
	//  379  702:fload           6
	//  380  704:invokespecial   #344 <Method void PdfNumber(float)>
	//  381  707:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  382  710:pop             
			pdfarray2.add(((PdfObject) (new PdfNumber(f7))));
	//  383  711:aload           13
	//  384  713:new             #341 <Class PdfNumber>
	//  385  716:dup             
	//  386  717:fload           8
	//  387  719:invokespecial   #344 <Method void PdfNumber(float)>
	//  388  722:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  389  725:pop             
			pdfarray2.add(((PdfObject) (new PdfNumber(f6))));
	//  390  726:aload           13
	//  391  728:new             #341 <Class PdfNumber>
	//  392  731:dup             
	//  393  732:fload           7
	//  394  734:invokespecial   #344 <Method void PdfNumber(float)>
	//  395  737:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  396  740:pop             
			pdfarray2.add(((PdfObject) (new PdfNumber(f8))));
	//  397  741:aload           13
	//  398  743:new             #341 <Class PdfNumber>
	//  399  746:dup             
	//  400  747:fload           9
	//  401  749:invokespecial   #344 <Method void PdfNumber(float)>
	//  402  752:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  403  755:pop             
			pdfdictionary.put(PdfName.MATRIX, ((PdfObject) (pdfarray2)));
	//  404  756:aload           12
	//  405  758:getstatic       #378 <Field PdfName PdfName.MATRIX>
	//  406  761:aload           13
	//  407  763:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		pdfdictionary.put(PdfName.WHITEPOINT, ((PdfObject) (obj)));
	//  408  766:aload           12
	//  409  768:getstatic       #351 <Field PdfName PdfName.WHITEPOINT>
	//  410  771:aload           10
	//  411  773:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfarray.add(((PdfObject) (pdfdictionary)));
	//  412  776:aload           11
	//  413  778:aload           12
	//  414  780:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  415  783:pop             
		return ((PdfObject) (pdfarray));
	//  416  784:aload           11
	//  417  786:areturn         
	}

	Image getImage()
		throws IOException
	{
		int j;
		int k;
		int l;
		int i1;
		readPng();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #381 <Method void readPng()>
		l = 0;
	//    2    4:iconst_0        
	//    3    5:istore          4
		j = 0;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		i1 = 0;
	//    6    9:iconst_0        
	//    7   10:istore          5
		k = 0;
	//    8   12:iconst_0        
	//    9   13:istore_3        
		palShades = false;
	//   10   14:aload_0         
	//   11   15:iconst_0        
	//   12   16:putfield        #247 <Field boolean palShades>
		if(trans == null) goto _L2; else goto _L1
	//   13   19:aload_0         
	//   14   20:getfield        #383 <Field byte[] trans>
	//   15   23:ifnull          91
_L1:
		int i = 0;
	//   16   26:iconst_0        
	//   17   27:istore_1        
_L24:
		l = j;
	//   18   28:iload_2         
	//   19   29:istore          4
		i1 = k;
	//   20   31:iload_3         
	//   21   32:istore          5
		if(i >= trans.length) goto _L2; else goto _L3
	//   22   34:iload_1         
	//   23   35:aload_0         
	//   24   36:getfield        #383 <Field byte[] trans>
	//   25   39:arraylength     
	//   26   40:icmpge          91
_L3:
		i1 = trans[i] & 0xff;
	//   27   43:aload_0         
	//   28   44:getfield        #383 <Field byte[] trans>
	//   29   47:iload_1         
	//   30   48:baload          
	//   31   49:sipush          255
	//   32   52:iand            
	//   33   53:istore          5
		l = j;
	//   34   55:iload_2         
	//   35   56:istore          4
		if(i1 == 0)
	//*  36   58:iload           5
	//*  37   60:ifne            70
		{
			l = j + 1;
	//   38   63:iload_2         
	//   39   64:iconst_1        
	//   40   65:iadd            
	//   41   66:istore          4
			k = i;
	//   42   68:iload_1         
	//   43   69:istore_3        
		}
		if(i1 == 0 || i1 == 255) goto _L5; else goto _L4
	//   44   70:iload           5
	//   45   72:ifeq            817
	//   46   75:iload           5
	//   47   77:sipush          255
	//   48   80:icmpeq          817
_L4:
		boolean flag;
		Object obj;
		Image image1;
		try
		{
			palShades = true;
	//   49   83:aload_0         
	//   50   84:iconst_1        
	//   51   85:putfield        #247 <Field boolean palShades>
		}
	//*  52   88:iload_3         
	//*  53   89:istore          5
	//*  54   91:aload_0         
	//*  55   92:getfield        #243 <Field int colorType>
	//*  56   95:iconst_4        
	//*  57   96:iand            
	//*  58   97:ifeq            105
	//*  59  100:aload_0         
	//*  60  101:iconst_1        
	//*  61  102:putfield        #247 <Field boolean palShades>
	//*  62  105:aload_0         
	//*  63  106:getfield        #247 <Field boolean palShades>
	//*  64  109:ifne            827
	//*  65  112:iload           4
	//*  66  114:iconst_1        
	//*  67  115:icmpgt          803
	//*  68  118:aload_0         
	//*  69  119:getfield        #126 <Field int transRedGray>
	//*  70  122:iflt            827
	//*  71  125:goto            803
	//*  72  128:aload_0         
	//*  73  129:iload           6
	//*  74  131:putfield        #283 <Field boolean genBWMask>
	//*  75  134:aload_0         
	//*  76  135:getfield        #247 <Field boolean palShades>
	//*  77  138:ifne            209
	//*  78  141:aload_0         
	//*  79  142:getfield        #283 <Field boolean genBWMask>
	//*  80  145:ifne            209
	//*  81  148:iload           4
	//*  82  150:iconst_1        
	//*  83  151:icmpne          209
	//*  84  154:aload_0         
	//*  85  155:getfield        #121 <Field PdfDictionary additional>
	//*  86  158:getstatic       #386 <Field PdfName PdfName.MASK>
	//*  87  161:new             #353 <Class PdfLiteral>
	//*  88  164:dup             
	//*  89  165:new             #388 <Class StringBuilder>
	//*  90  168:dup             
	//*  91  169:invokespecial   #389 <Method void StringBuilder()>
	//*  92  172:ldc2            #391 <String "[">
	//*  93  175:invokevirtual   #394 <Method StringBuilder StringBuilder.append(String)>
	//*  94  178:iload           5
	//*  95  180:invokevirtual   #397 <Method StringBuilder StringBuilder.append(int)>
	//*  96  183:ldc2            #399 <String " ">
	//*  97  186:invokevirtual   #394 <Method StringBuilder StringBuilder.append(String)>
	//*  98  189:iload           5
	//*  99  191:invokevirtual   #397 <Method StringBuilder StringBuilder.append(int)>
	//* 100  194:ldc2            #401 <String "]">
	//* 101  197:invokevirtual   #394 <Method StringBuilder StringBuilder.append(String)>
	//* 102  200:invokevirtual   #402 <Method String StringBuilder.toString()>
	//* 103  203:invokespecial   #356 <Method void PdfLiteral(String)>
	//* 104  206:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 105  209:aload_0         
	//* 106  210:getfield        #277 <Field int interlaceMethod>
	//* 107  213:iconst_1        
	//* 108  214:icmpeq          809
	//* 109  217:aload_0         
	//* 110  218:getfield        #239 <Field int bitDepth>
	//* 111  221:bipush          16
	//* 112  223:icmpeq          809
	//* 113  226:aload_0         
	//* 114  227:getfield        #243 <Field int colorType>
	//* 115  230:iconst_4        
	//* 116  231:iand            
	//* 117  232:ifne            809
	//* 118  235:aload_0         
	//* 119  236:getfield        #247 <Field boolean palShades>
	//* 120  239:ifne            809
	//* 121  242:aload_0         
	//* 122  243:getfield        #283 <Field boolean genBWMask>
	//* 123  246:ifeq            833
	//* 124  249:goto            809
	//* 125  252:aload_0         
	//* 126  253:getfield        #243 <Field int colorType>
	//* 127  256:tableswitch     0 6: default 814
	//	               0 573
	//	               1 300
	//	               2 593
	//	               3 601
	//	               4 609
	//	               5 300
	//	               6 617
	//* 128  300:iload_1         
	//* 129  301:ifeq            308
	//* 130  304:aload_0         
	//* 131  305:invokevirtual   #404 <Method void decodeIdat()>
	//* 132  308:aload_0         
	//* 133  309:getfield        #287 <Field int inputBands>
	//* 134  312:istore_2        
	//* 135  313:iload_2         
	//* 136  314:istore_1        
	//* 137  315:aload_0         
	//* 138  316:getfield        #243 <Field int colorType>
	//* 139  319:iconst_4        
	//* 140  320:iand            
	//* 141  321:ifeq            328
	//* 142  324:iload_2         
	//* 143  325:iconst_1        
	//* 144  326:isub            
	//* 145  327:istore_1        
	//* 146  328:aload_0         
	//* 147  329:getfield        #239 <Field int bitDepth>
	//* 148  332:istore_3        
	//* 149  333:iload_3         
	//* 150  334:istore_2        
	//* 151  335:iload_3         
	//* 152  336:bipush          16
	//* 153  338:icmpne          344
	//* 154  341:bipush          8
	//* 155  343:istore_2        
	//* 156  344:aload_0         
	//* 157  345:getfield        #245 <Field byte[] image>
	//* 158  348:ifnull          647
	//* 159  351:aload_0         
	//* 160  352:getfield        #243 <Field int colorType>
	//* 161  355:iconst_3        
	//* 162  356:icmpne          625
	//* 163  359:new             #406 <Class ImgRaw>
	//* 164  362:dup             
	//* 165  363:aload_0         
	//* 166  364:getfield        #249 <Field int width>
	//* 167  367:aload_0         
	//* 168  368:getfield        #251 <Field int height>
	//* 169  371:iload_1         
	//* 170  372:iload_2         
	//* 171  373:aload_0         
	//* 172  374:getfield        #245 <Field byte[] image>
	//* 173  377:invokespecial   #409 <Method void ImgRaw(int, int, int, int, byte[])>
	//* 174  380:astore          7
	//* 175  382:aload_0         
	//* 176  383:getfield        #121 <Field PdfDictionary additional>
	//* 177  386:getstatic       #412 <Field PdfName PdfName.COLORSPACE>
	//* 178  389:invokevirtual   #416 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 179  392:ifnonnull       409
	//* 180  395:aload_0         
	//* 181  396:getfield        #121 <Field PdfDictionary additional>
	//* 182  399:getstatic       #412 <Field PdfName PdfName.COLORSPACE>
	//* 183  402:aload_0         
	//* 184  403:invokevirtual   #418 <Method PdfObject getColorspace()>
	//* 185  406:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 186  409:aload_0         
	//* 187  410:getfield        #420 <Field PdfName intent>
	//* 188  413:ifnull          430
	//* 189  416:aload_0         
	//* 190  417:getfield        #121 <Field PdfDictionary additional>
	//* 191  420:getstatic       #423 <Field PdfName PdfName.INTENT>
	//* 192  423:aload_0         
	//* 193  424:getfield        #420 <Field PdfName intent>
	//* 194  427:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 195  430:aload_0         
	//* 196  431:getfield        #121 <Field PdfDictionary additional>
	//* 197  434:invokevirtual   #424 <Method int PdfDictionary.size()>
	//* 198  437:ifle            449
	//* 199  440:aload           7
	//* 200  442:aload_0         
	//* 201  443:getfield        #121 <Field PdfDictionary additional>
	//* 202  446:invokevirtual   #428 <Method void Image.setAdditional(PdfDictionary)>
	//* 203  449:aload_0         
	//* 204  450:getfield        #320 <Field ICC_Profile icc_profile>
	//* 205  453:ifnull          465
	//* 206  456:aload           7
	//* 207  458:aload_0         
	//* 208  459:getfield        #320 <Field ICC_Profile icc_profile>
	//* 209  462:invokevirtual   #432 <Method void Image.tagICC(ICC_Profile)>
	//* 210  465:aload_0         
	//* 211  466:getfield        #247 <Field boolean palShades>
	//* 212  469:ifeq            504
	//* 213  472:aload_0         
	//* 214  473:getfield        #249 <Field int width>
	//* 215  476:aload_0         
	//* 216  477:getfield        #251 <Field int height>
	//* 217  480:iconst_1        
	//* 218  481:bipush          8
	//* 219  483:aload_0         
	//* 220  484:getfield        #253 <Field byte[] smask>
	//* 221  487:invokestatic    #436 <Method Image Image.getInstance(int, int, int, int, byte[])>
	//* 222  490:astore          8
	//* 223  492:aload           8
	//* 224  494:invokevirtual   #439 <Method void Image.makeMask()>
	//* 225  497:aload           7
	//* 226  499:aload           8
	//* 227  501:invokevirtual   #443 <Method void Image.setImageMask(Image)>
	//* 228  504:aload_0         
	//* 229  505:getfield        #283 <Field boolean genBWMask>
	//* 230  508:ifeq            542
	//* 231  511:aload_0         
	//* 232  512:getfield        #249 <Field int width>
	//* 233  515:aload_0         
	//* 234  516:getfield        #251 <Field int height>
	//* 235  519:iconst_1        
	//* 236  520:iconst_1        
	//* 237  521:aload_0         
	//* 238  522:getfield        #253 <Field byte[] smask>
	//* 239  525:invokestatic    #436 <Method Image Image.getInstance(int, int, int, int, byte[])>
	//* 240  528:astore          8
	//* 241  530:aload           8
	//* 242  532:invokevirtual   #439 <Method void Image.makeMask()>
	//* 243  535:aload           7
	//* 244  537:aload           8
	//* 245  539:invokevirtual   #443 <Method void Image.setImageMask(Image)>
	//* 246  542:aload           7
	//* 247  544:aload_0         
	//* 248  545:getfield        #445 <Field int dpiX>
	//* 249  548:aload_0         
	//* 250  549:getfield        #447 <Field int dpiY>
	//* 251  552:invokevirtual   #451 <Method void Image.setDpi(int, int)>
	//* 252  555:aload           7
	//* 253  557:aload_0         
	//* 254  558:getfield        #453 <Field float XYRatio>
	//* 255  561:invokevirtual   #456 <Method void Image.setXYRatio(float)>
	//* 256  564:aload           7
	//* 257  566:iconst_2        
	//* 258  567:invokevirtual   #460 <Method void Image.setOriginalType(int)>
	//* 259  570:aload           7
	//* 260  572:areturn         
	//* 261  573:aload_0         
	//* 262  574:iconst_1        
	//* 263  575:putfield        #287 <Field int inputBands>
	//* 264  578:goto            300
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 265  581:astore          7
		{
			throw new ExceptionConverter(((Exception) (obj)));
	//  266  583:new             #462 <Class ExceptionConverter>
	//  267  586:dup             
	//  268  587:aload           7
	//  269  589:invokespecial   #465 <Method void ExceptionConverter(Exception)>
	//  270  592:athrow          
		}
		i1 = k;
_L2:
		if((colorType & 4) != 0)
			palShades = true;
		if(palShades) goto _L7; else goto _L6
_L6:
		if(l > 1) goto _L9; else goto _L8
_L8:
		if(transRedGray < 0) goto _L7; else goto _L9
_L23:
		genBWMask = flag;
		if(palShades || genBWMask || l != 1)
			break MISSING_BLOCK_LABEL_209;
		additional.put(PdfName.MASK, ((PdfObject) (new PdfLiteral((new StringBuilder()).append("[").append(i1).append(" ").append(i1).append("]").toString()))));
		PdfDictionary pdfdictionary;
		PdfName pdfname;
		if(interlaceMethod == 1 || bitDepth == 16 || (colorType & 4) != 0 || palShades || genBWMask)
	//* 271  593:aload_0         
	//* 272  594:iconst_3        
	//* 273  595:putfield        #287 <Field int inputBands>
	//* 274  598:goto            300
	//* 275  601:aload_0         
	//* 276  602:iconst_1        
	//* 277  603:putfield        #287 <Field int inputBands>
	//* 278  606:goto            300
	//* 279  609:aload_0         
	//* 280  610:iconst_2        
	//* 281  611:putfield        #287 <Field int inputBands>
	//* 282  614:goto            300
	//* 283  617:aload_0         
	//* 284  618:iconst_4        
	//* 285  619:putfield        #287 <Field int inputBands>
	//* 286  622:goto            300
	//* 287  625:aload_0         
	//* 288  626:getfield        #249 <Field int width>
	//* 289  629:aload_0         
	//* 290  630:getfield        #251 <Field int height>
	//* 291  633:iload_1         
	//* 292  634:iload_2         
	//* 293  635:aload_0         
	//* 294  636:getfield        #245 <Field byte[] image>
	//* 295  639:invokestatic    #436 <Method Image Image.getInstance(int, int, int, int, byte[])>
	//* 296  642:astore          7
	//* 297  644:goto            382
	//* 298  647:new             #406 <Class ImgRaw>
	//* 299  650:dup             
	//* 300  651:aload_0         
	//* 301  652:getfield        #249 <Field int width>
	//* 302  655:aload_0         
	//* 303  656:getfield        #251 <Field int height>
	//* 304  659:iload_1         
	//* 305  660:iload_2         
	//* 306  661:aload_0         
	//* 307  662:getfield        #124 <Field PngImage$NewByteArrayOutputStream idat>
	//* 308  665:invokevirtual   #468 <Method byte[] PngImage$NewByteArrayOutputStream.toByteArray()>
	//* 309  668:invokespecial   #409 <Method void ImgRaw(int, int, int, int, byte[])>
	//* 310  671:astore          7
	//* 311  673:aload           7
	//* 312  675:iconst_1        
	//* 313  676:invokevirtual   #472 <Method void Image.setDeflated(boolean)>
	//* 314  679:new             #118 <Class PdfDictionary>
	//* 315  682:dup             
	//* 316  683:invokespecial   #119 <Method void PdfDictionary()>
	//* 317  686:astore          8
	//* 318  688:aload           8
	//* 319  690:getstatic       #475 <Field PdfName PdfName.BITSPERCOMPONENT>
	//* 320  693:new             #341 <Class PdfNumber>
	//* 321  696:dup             
	//* 322  697:aload_0         
	//* 323  698:getfield        #239 <Field int bitDepth>
	//* 324  701:invokespecial   #477 <Method void PdfNumber(int)>
	//* 325  704:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 326  707:aload           8
	//* 327  709:getstatic       #480 <Field PdfName PdfName.PREDICTOR>
	//* 328  712:new             #341 <Class PdfNumber>
	//* 329  715:dup             
	//* 330  716:bipush          15
	//* 331  718:invokespecial   #477 <Method void PdfNumber(int)>
	//* 332  721:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 333  724:aload           8
	//* 334  726:getstatic       #483 <Field PdfName PdfName.COLUMNS>
	//* 335  729:new             #341 <Class PdfNumber>
	//* 336  732:dup             
	//* 337  733:aload_0         
	//* 338  734:getfield        #249 <Field int width>
	//* 339  737:invokespecial   #477 <Method void PdfNumber(int)>
	//* 340  740:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 341  743:getstatic       #486 <Field PdfName PdfName.COLORS>
	//* 342  746:astore          9
	//* 343  748:aload_0         
	//* 344  749:getfield        #243 <Field int colorType>
	//* 345  752:iconst_3        
	//* 346  753:icmpeq          838
	//* 347  756:aload_0         
	//* 348  757:getfield        #243 <Field int colorType>
	//* 349  760:iconst_2        
	//* 350  761:iand            
	//* 351  762:ifne            798
	//* 352  765:goto            838
	//* 353  768:aload           8
	//* 354  770:aload           9
	//* 355  772:new             #341 <Class PdfNumber>
	//* 356  775:dup             
	//* 357  776:iload_1         
	//* 358  777:invokespecial   #477 <Method void PdfNumber(int)>
	//* 359  780:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 360  783:aload_0         
	//* 361  784:getfield        #121 <Field PdfDictionary additional>
	//* 362  787:getstatic       #489 <Field PdfName PdfName.DECODEPARMS>
	//* 363  790:aload           8
	//* 364  792:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 365  795:goto            382
	//* 366  798:iconst_3        
	//* 367  799:istore_1        
	//* 368  800:goto            768
	//* 369  803:iconst_1        
	//* 370  804:istore          6
	//* 371  806:goto            128
			i = 1;
	//  372  809:iconst_1        
	//  373  810:istore_1        
		else
	//* 374  811:goto            252
	//* 375  814:goto            300
	//* 376  817:iload_1         
	//* 377  818:iconst_1        
	//* 378  819:iadd            
	//* 379  820:istore_1        
	//* 380  821:iload           4
	//* 381  823:istore_2        
	//* 382  824:goto            28
	//* 383  827:iconst_0        
	//* 384  828:istore          6
	//* 385  830:goto            128
			i = 0;
	//  386  833:iconst_0        
	//  387  834:istore_1        
		colorType;
		JVM INSTR tableswitch 0 6: default 814
	//	               0 573
	//	               1 300
	//	               2 593
	//	               3 601
	//	               4 609
	//	               5 300
	//	               6 617;
		   goto _L10 _L11 _L10 _L12 _L13 _L14 _L10 _L15
_L10:
		if(i == 0) goto _L17; else goto _L16
_L16:
		decodeIdat();
_L17:
		j = inputBands;
		i = j;
		if((colorType & 4) != 0)
			i = j - 1;
		k = bitDepth;
		j = k;
		if(k == 16)
			j = 8;
		if(image == null) goto _L19; else goto _L18
_L18:
		if(colorType != 3) goto _L21; else goto _L20
_L20:
		obj = ((Object) (new ImgRaw(width, height, i, j, image)));
_L22:
		if(additional.get(PdfName.COLORSPACE) == null)
			additional.put(PdfName.COLORSPACE, getColorspace());
		if(intent != null)
			additional.put(PdfName.INTENT, ((PdfObject) (intent)));
		if(additional.size() > 0)
			((Image) (obj)).setAdditional(additional);
		if(icc_profile != null)
			((Image) (obj)).tagICC(icc_profile);
		if(palShades)
		{
			image1 = Image.getInstance(width, height, 1, 8, smask);
			image1.makeMask();
			((Image) (obj)).setImageMask(image1);
		}
		if(genBWMask)
		{
			image1 = Image.getInstance(width, height, 1, 1, smask);
			image1.makeMask();
			((Image) (obj)).setImageMask(image1);
		}
		((Image) (obj)).setDpi(dpiX, dpiY);
		((Image) (obj)).setXYRatio(XYRatio);
		((Image) (obj)).setOriginalType(2);
		return ((Image) (obj));
_L11:
		inputBands = 1;
		  goto _L10
_L12:
		inputBands = 3;
		  goto _L10
_L13:
		inputBands = 1;
		  goto _L10
_L14:
		inputBands = 2;
		  goto _L10
_L15:
		inputBands = 4;
		  goto _L10
_L21:
		obj = ((Object) (Image.getInstance(width, height, i, j, image)));
		  goto _L22
_L19:
		obj = ((Object) (new ImgRaw(width, height, i, j, idat.toByteArray())));
		((Image) (obj)).setDeflated(true);
		pdfdictionary = new PdfDictionary();
		pdfdictionary.put(PdfName.BITSPERCOMPONENT, ((PdfObject) (new PdfNumber(bitDepth))));
		pdfdictionary.put(PdfName.PREDICTOR, ((PdfObject) (new PdfNumber(15))));
		pdfdictionary.put(PdfName.COLUMNS, ((PdfObject) (new PdfNumber(width))));
		pdfname = PdfName.COLORS;
		if(colorType != 3 && (colorType & 2) != 0)
			i = 3;
		else
	//* 388  835:goto            252
			i = 1;
	//  389  838:iconst_1        
	//  390  839:istore_1        
		pdfdictionary.put(pdfname, ((PdfObject) (new PdfNumber(i))));
		additional.put(PdfName.DECODEPARMS, ((PdfObject) (pdfdictionary)));
		  goto _L22
_L9:
		flag = true;
		  goto _L23
_L5:
		i++;
		j = l;
		  goto _L24
_L7:
		flag = false;
		  goto _L23
	//* 391  840:goto            768
	}

	int[] getPixel(byte abyte0[])
	{
		bitDepth;
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field int bitDepth>
		JVM INSTR lookupswitch 2: default 32
	//	               8: 117
	//	               16: 153;
	//    2    4:lookupswitch    2: default 32
	//	               8: 117
	//	               16: 153
		   goto _L1 _L2 _L3
_L1:
		int i;
		int j;
		int l;
		int i1;
		int ai[];
		ai = new int[(abyte0.length * 8) / bitDepth];
	//    3   32:aload_1         
	//    4   33:arraylength     
	//    5   34:bipush          8
	//    6   36:imul            
	//    7   37:aload_0         
	//    8   38:getfield        #239 <Field int bitDepth>
	//    9   41:idiv            
	//   10   42:newarray        int[]
	//   11   44:astore          7
		i = 0;
	//   12   46:iconst_0        
	//   13   47:istore_2        
		l = 8 / bitDepth;
	//   14   48:bipush          8
	//   15   50:aload_0         
	//   16   51:getfield        #239 <Field int bitDepth>
	//   17   54:idiv            
	//   18   55:istore          5
		i1 = bitDepth;
	//   19   57:aload_0         
	//   20   58:getfield        #239 <Field int bitDepth>
	//   21   61:istore          6
		j = 0;
	//   22   63:iconst_0        
	//   23   64:istore_3        
_L5:
		if(j >= abyte0.length)
			break; /* Loop/switch isn't completed */
	//   24   65:iload_3         
	//   25   66:aload_1         
	//   26   67:arraylength     
	//   27   68:icmpge          215
		for(int k = l - 1; k >= 0;)
	//*  28   71:iload           5
	//*  29   73:iconst_1        
	//*  30   74:isub            
	//*  31   75:istore          4
	//*  32   77:iload           4
	//*  33   79:iflt            208
		{
			ai[i] = abyte0[j] >>> bitDepth * k & (1 << i1) - 1;
	//   34   82:aload           7
	//   35   84:iload_2         
	//   36   85:aload_1         
	//   37   86:iload_3         
	//   38   87:baload          
	//   39   88:aload_0         
	//   40   89:getfield        #239 <Field int bitDepth>
	//   41   92:iload           4
	//   42   94:imul            
	//   43   95:iushr           
	//   44   96:iconst_1        
	//   45   97:iload           6
	//   46   99:ishl            
	//   47  100:iconst_1        
	//   48  101:isub            
	//   49  102:iand            
	//   50  103:iastore         
			k--;
	//   51  104:iload           4
	//   52  106:iconst_1        
	//   53  107:isub            
	//   54  108:istore          4
			i++;
	//   55  110:iload_2         
	//   56  111:iconst_1        
	//   57  112:iadd            
	//   58  113:istore_2        
		}

	//*  59  114:goto            77
	//*  60  117:aload_1         
	//*  61  118:arraylength     
	//*  62  119:newarray        int[]
	//*  63  121:astore          7
	//*  64  123:iconst_0        
	//*  65  124:istore_2        
	//*  66  125:iload_2         
	//*  67  126:aload           7
	//*  68  128:arraylength     
	//*  69  129:icmpge          150
	//*  70  132:aload           7
	//*  71  134:iload_2         
	//*  72  135:aload_1         
	//*  73  136:iload_2         
	//*  74  137:baload          
	//*  75  138:sipush          255
	//*  76  141:iand            
	//*  77  142:iastore         
	//*  78  143:iload_2         
	//*  79  144:iconst_1        
	//*  80  145:iadd            
	//*  81  146:istore_2        
	//*  82  147:goto            125
	//*  83  150:aload           7
	//*  84  152:areturn         
	//*  85  153:aload_1         
	//*  86  154:arraylength     
	//*  87  155:iconst_2        
	//*  88  156:idiv            
	//*  89  157:newarray        int[]
	//*  90  159:astore          7
	//*  91  161:iconst_0        
	//*  92  162:istore_2        
	//*  93  163:iload_2         
	//*  94  164:aload           7
	//*  95  166:arraylength     
	//*  96  167:icmpge          205
	//*  97  170:aload           7
	//*  98  172:iload_2         
	//*  99  173:aload_1         
	//* 100  174:iload_2         
	//* 101  175:iconst_2        
	//* 102  176:imul            
	//* 103  177:baload          
	//* 104  178:sipush          255
	//* 105  181:iand            
	//* 106  182:bipush          8
	//* 107  184:ishl            
	//* 108  185:aload_1         
	//* 109  186:iload_2         
	//* 110  187:iconst_2        
	//* 111  188:imul            
	//* 112  189:iconst_1        
	//* 113  190:iadd            
	//* 114  191:baload          
	//* 115  192:sipush          255
	//* 116  195:iand            
	//* 117  196:iadd            
	//* 118  197:iastore         
	//* 119  198:iload_2         
	//* 120  199:iconst_1        
	//* 121  200:iadd            
	//* 122  201:istore_2        
	//* 123  202:goto            163
	//* 124  205:aload           7
	//* 125  207:areturn         
		j++;
	//  126  208:iload_3         
	//  127  209:iconst_1        
	//  128  210:iadd            
	//  129  211:istore_3        
		continue; /* Loop/switch isn't completed */
	//  130  212:goto            65
_L2:
		ai = new int[abyte0.length];
		for(i = 0; i < ai.length; i++)
			ai[i] = abyte0[i] & 0xff;

		return ai;
_L3:
		ai = new int[abyte0.length / 2];
		for(i = 0; i < ai.length; i++)
			ai[i] = ((abyte0[i * 2] & 0xff) << 8) + (abyte0[i * 2 + 1] & 0xff);

		return ai;
		if(true) goto _L5; else goto _L4
_L4:
		return ai;
	//  131  215:aload           7
	//  132  217:areturn         
	}

	void processPixels(byte abyte0[], int i, int j, int k, int l)
	{
		int i1;
		boolean flag;
		abyte0 = ((byte []) (getPixel(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #492 <Method int[] getPixel(byte[])>
	//    3    5:astore_1        
		flag = false;
	//    4    6:iconst_0        
	//    5    7:istore          7
		i1 = ((int) (flag));
	//    6    9:iload           7
	//    7   11:istore          6
		colorType;
	//    8   13:aload_0         
	//    9   14:getfield        #243 <Field int colorType>
		JVM INSTR tableswitch 0 6: default 60
	//	               0 161
	//	               1 64
	//	               2 167
	//	               3 161
	//	               4 161
	//	               5 64
	//	               6 167;
	//   10   17:tableswitch     0 6: default 60
	//	               0 161
	//	               1 64
	//	               2 167
	//	               3 161
	//	               4 161
	//	               5 64
	//	               6 167
		   goto _L1 _L2 _L3 _L4 _L2 _L2 _L3 _L4
_L4:
		break MISSING_BLOCK_LABEL_167;
_L3:
		break; /* Loop/switch isn't completed */
_L1:
		i1 = ((int) (flag));
	//   11   60:iload           7
	//   12   62:istore          6
_L5:
		if(image != null)
	//*  13   64:aload_0         
	//*  14   65:getfield        #245 <Field byte[] image>
	//*  15   68:ifnull          182
		{
			int j2 = i;
	//   16   71:iload_2         
	//   17   72:istore          7
			int k5 = width;
	//   18   74:aload_0         
	//   19   75:getfield        #249 <Field int width>
	//   20   78:istore          9
			int i4;
			if(bitDepth == 16)
	//*  21   80:aload_0         
	//*  22   81:getfield        #239 <Field int bitDepth>
	//*  23   84:bipush          16
	//*  24   86:icmpne          173
				i4 = 8;
	//   25   89:bipush          8
	//   26   91:istore          8
			else
	//*  27   93:iload           8
	//*  28   95:iload           6
	//*  29   97:iload           9
	//*  30   99:imul            
	//*  31  100:imul            
	//*  32  101:bipush          7
	//*  33  103:iadd            
	//*  34  104:bipush          8
	//*  35  106:idiv            
	//*  36  107:istore          9
	//*  37  109:iconst_0        
	//*  38  110:istore          8
	//*  39  112:iload           8
	//*  40  114:iload           5
	//*  41  116:icmpge          182
	//*  42  119:aload_0         
	//*  43  120:getfield        #245 <Field byte[] image>
	//*  44  123:aload_1         
	//*  45  124:aload_0         
	//*  46  125:getfield        #287 <Field int inputBands>
	//*  47  128:iload           8
	//*  48  130:imul            
	//*  49  131:iload           6
	//*  50  133:iload           7
	//*  51  135:iload           4
	//*  52  137:aload_0         
	//*  53  138:getfield        #239 <Field int bitDepth>
	//*  54  141:iload           9
	//*  55  143:invokestatic    #494 <Method void setPixel(byte[], int[], int, int, int, int, int, int)>
	//*  56  146:iload           7
	//*  57  148:iload_3         
	//*  58  149:iadd            
	//*  59  150:istore          7
	//*  60  152:iload           8
	//*  61  154:iconst_1        
	//*  62  155:iadd            
	//*  63  156:istore          8
	//*  64  158:goto            112
	//*  65  161:iconst_1        
	//*  66  162:istore          6
	//*  67  164:goto            64
	//*  68  167:iconst_3        
	//*  69  168:istore          6
	//*  70  170:goto            64
				i4 = bitDepth;
	//   71  173:aload_0         
	//   72  174:getfield        #239 <Field int bitDepth>
	//   73  177:istore          8
			k5 = (i4 * (i1 * k5) + 7) / 8;
			for(i4 = 0; i4 < l; i4++)
			{
				setPixel(image, ((int []) (abyte0)), inputBands * i4, i1, j2, k, bitDepth, k5);
				j2 += j;
			}

		}
		break MISSING_BLOCK_LABEL_182;
	//   74  179:goto            93
_L2:
		i1 = 1;
		  goto _L5
		i1 = 3;
		  goto _L5
		if(!palShades) goto _L7; else goto _L6
	//   75  182:aload_0         
	//   76  183:getfield        #247 <Field boolean palShades>
	//   77  186:ifeq            395
_L6:
		if((colorType & 4) != 0)
	//*  78  189:aload_0         
	//*  79  190:getfield        #243 <Field int colorType>
	//*  80  193:iconst_4        
	//*  81  194:iand            
	//*  82  195:ifeq            305
		{
			if(bitDepth == 16)
	//*  83  198:aload_0         
	//*  84  199:getfield        #239 <Field int bitDepth>
	//*  85  202:bipush          16
	//*  86  204:icmpne          249
			{
				for(int k2 = 0; k2 < l; k2++)
	//*  87  207:iconst_0        
	//*  88  208:istore          7
	//*  89  210:iload           7
	//*  90  212:iload           5
	//*  91  214:icmpge          249
				{
					int j4 = inputBands * k2 + i1;
	//   92  217:aload_0         
	//   93  218:getfield        #287 <Field int inputBands>
	//   94  221:iload           7
	//   95  223:imul            
	//   96  224:iload           6
	//   97  226:iadd            
	//   98  227:istore          8
					abyte0[j4] = ((byte) (abyte0[j4] >>> 8));
	//   99  229:aload_1         
	//  100  230:iload           8
	//  101  232:aload_1         
	//  102  233:iload           8
	//  103  235:iaload          
	//  104  236:bipush          8
	//  105  238:iushr           
	//  106  239:iastore         
				}

	//  107  240:iload           7
	//  108  242:iconst_1        
	//  109  243:iadd            
	//  110  244:istore          7
			}
	//* 111  246:goto            210
			int k4 = width;
	//  112  249:aload_0         
	//  113  250:getfield        #249 <Field int width>
	//  114  253:istore          8
			int l2 = i;
	//  115  255:iload_2         
	//  116  256:istore          7
			for(i = 0; i < l; i++)
	//* 117  258:iconst_0        
	//* 118  259:istore_2        
	//* 119  260:iload_2         
	//* 120  261:iload           5
	//* 121  263:icmpge          436
			{
				setPixel(smask, ((int []) (abyte0)), inputBands * i + i1, 1, l2, k, 8, k4);
	//  122  266:aload_0         
	//  123  267:getfield        #253 <Field byte[] smask>
	//  124  270:aload_1         
	//  125  271:aload_0         
	//  126  272:getfield        #287 <Field int inputBands>
	//  127  275:iload_2         
	//  128  276:imul            
	//  129  277:iload           6
	//  130  279:iadd            
	//  131  280:iconst_1        
	//  132  281:iload           7
	//  133  283:iload           4
	//  134  285:bipush          8
	//  135  287:iload           8
	//  136  289:invokestatic    #494 <Method void setPixel(byte[], int[], int, int, int, int, int, int)>
				l2 += j;
	//  137  292:iload           7
	//  138  294:iload_3         
	//  139  295:iadd            
	//  140  296:istore          7
			}

	//  141  298:iload_2         
	//  142  299:iconst_1        
	//  143  300:iadd            
	//  144  301:istore_2        
		} else
	//* 145  302:goto            260
		{
			int i3 = width;
	//  146  305:aload_0         
	//  147  306:getfield        #249 <Field int width>
	//  148  309:istore          7
			int ai[] = new int[1];
	//  149  311:iconst_1        
	//  150  312:newarray        int[]
	//  151  314:astore          10
			int j1 = i;
	//  152  316:iload_2         
	//  153  317:istore          6
			i = 0;
	//  154  319:iconst_0        
	//  155  320:istore_2        
			while(i < l) 
	//* 156  321:iload_2         
	//* 157  322:iload           5
	//* 158  324:icmpge          436
			{
				byte byte0 = abyte0[i];
	//  159  327:aload_1         
	//  160  328:iload_2         
	//  161  329:iaload          
	//  162  330:istore          8
				if(byte0 < trans.length)
	//* 163  332:iload           8
	//* 164  334:aload_0         
	//* 165  335:getfield        #383 <Field byte[] trans>
	//* 166  338:arraylength     
	//* 167  339:icmpge          385
					ai[0] = ((int) (trans[byte0]));
	//  168  342:aload           10
	//  169  344:iconst_0        
	//  170  345:aload_0         
	//  171  346:getfield        #383 <Field byte[] trans>
	//  172  349:iload           8
	//  173  351:baload          
	//  174  352:iastore         
				else
	//* 175  353:aload_0         
	//* 176  354:getfield        #253 <Field byte[] smask>
	//* 177  357:aload           10
	//* 178  359:iconst_0        
	//* 179  360:iconst_1        
	//* 180  361:iload           6
	//* 181  363:iload           4
	//* 182  365:bipush          8
	//* 183  367:iload           7
	//* 184  369:invokestatic    #494 <Method void setPixel(byte[], int[], int, int, int, int, int, int)>
	//* 185  372:iload           6
	//* 186  374:iload_3         
	//* 187  375:iadd            
	//* 188  376:istore          6
	//* 189  378:iload_2         
	//* 190  379:iconst_1        
	//* 191  380:iadd            
	//* 192  381:istore_2        
	//* 193  382:goto            321
					ai[0] = 255;
	//  194  385:aload           10
	//  195  387:iconst_0        
	//  196  388:sipush          255
	//  197  391:iastore         
				setPixel(smask, ai, 0, 1, j1, k, 8, i3);
				j1 += j;
				i++;
			}
		}
		  goto _L8
	//* 198  392:goto            353
_L7:
		if(!genBWMask) goto _L8; else goto _L9
	//  199  395:aload_0         
	//  200  396:getfield        #283 <Field boolean genBWMask>
	//  201  399:ifeq            436
_L9:
		colorType;
	//  202  402:aload_0         
	//  203  403:getfield        #243 <Field int colorType>
		JVM INSTR tableswitch 0 3: default 436
	//	               0 536
	//	               1 436
	//	               2 620
	//	               3 437;
	//  204  406:tableswitch     0 3: default 436
	//	               0 536
	//	               1 436
	//	               2 620
	//	               3 437
		   goto _L8 _L10 _L8 _L11 _L12
_L8:
		return;
	//  205  436:return          
_L12:
		int l4 = (width + 7) / 8;
	//  206  437:aload_0         
	//  207  438:getfield        #249 <Field int width>
	//  208  441:bipush          7
	//  209  443:iadd            
	//  210  444:bipush          8
	//  211  446:idiv            
	//  212  447:istore          8
		int ai1[] = new int[1];
	//  213  449:iconst_1        
	//  214  450:newarray        int[]
	//  215  452:astore          10
		int k1 = i;
	//  216  454:iload_2         
	//  217  455:istore          6
		i = 0;
	//  218  457:iconst_0        
	//  219  458:istore_2        
		while(i < l) 
	//* 220  459:iload_2         
	//* 221  460:iload           5
	//* 222  462:icmpge          436
		{
			int j3 = ((int) (abyte0[i]));
	//  223  465:aload_1         
	//  224  466:iload_2         
	//  225  467:iaload          
	//  226  468:istore          7
			if(j3 < trans.length && trans[j3] == 0)
	//* 227  470:iload           7
	//* 228  472:aload_0         
	//* 229  473:getfield        #383 <Field byte[] trans>
	//* 230  476:arraylength     
	//* 231  477:icmpge          530
	//* 232  480:aload_0         
	//* 233  481:getfield        #383 <Field byte[] trans>
	//* 234  484:iload           7
	//* 235  486:baload          
	//* 236  487:ifne            530
				j3 = 1;
	//  237  490:iconst_1        
	//  238  491:istore          7
			else
	//* 239  493:aload           10
	//* 240  495:iconst_0        
	//* 241  496:iload           7
	//* 242  498:iastore         
	//* 243  499:aload_0         
	//* 244  500:getfield        #253 <Field byte[] smask>
	//* 245  503:aload           10
	//* 246  505:iconst_0        
	//* 247  506:iconst_1        
	//* 248  507:iload           6
	//* 249  509:iload           4
	//* 250  511:iconst_1        
	//* 251  512:iload           8
	//* 252  514:invokestatic    #494 <Method void setPixel(byte[], int[], int, int, int, int, int, int)>
	//* 253  517:iload           6
	//* 254  519:iload_3         
	//* 255  520:iadd            
	//* 256  521:istore          6
	//* 257  523:iload_2         
	//* 258  524:iconst_1        
	//* 259  525:iadd            
	//* 260  526:istore_2        
	//* 261  527:goto            459
				j3 = 0;
	//  262  530:iconst_0        
	//  263  531:istore          7
			ai1[0] = j3;
			setPixel(smask, ai1, 0, 1, k1, k, 1, l4);
			k1 += j;
			i++;
		}
		if(true)
			continue; /* Loop/switch isn't completed */
	//  264  533:goto            493
_L10:
		int i5 = (width + 7) / 8;
	//  265  536:aload_0         
	//  266  537:getfield        #249 <Field int width>
	//  267  540:bipush          7
	//  268  542:iadd            
	//  269  543:bipush          8
	//  270  545:idiv            
	//  271  546:istore          8
		int ai2[] = new int[1];
	//  272  548:iconst_1        
	//  273  549:newarray        int[]
	//  274  551:astore          10
		int l1 = i;
	//  275  553:iload_2         
	//  276  554:istore          6
		i = 0;
	//  277  556:iconst_0        
	//  278  557:istore_2        
		while(i < l) 
	//* 279  558:iload_2         
	//* 280  559:iload           5
	//* 281  561:icmpge          436
		{
			int k3;
			if(abyte0[i] == transRedGray)
	//* 282  564:aload_1         
	//* 283  565:iload_2         
	//* 284  566:iaload          
	//* 285  567:aload_0         
	//* 286  568:getfield        #126 <Field int transRedGray>
	//* 287  571:icmpne          614
				k3 = 1;
	//  288  574:iconst_1        
	//  289  575:istore          7
			else
	//* 290  577:aload           10
	//* 291  579:iconst_0        
	//* 292  580:iload           7
	//* 293  582:iastore         
	//* 294  583:aload_0         
	//* 295  584:getfield        #253 <Field byte[] smask>
	//* 296  587:aload           10
	//* 297  589:iconst_0        
	//* 298  590:iconst_1        
	//* 299  591:iload           6
	//* 300  593:iload           4
	//* 301  595:iconst_1        
	//* 302  596:iload           8
	//* 303  598:invokestatic    #494 <Method void setPixel(byte[], int[], int, int, int, int, int, int)>
	//* 304  601:iload           6
	//* 305  603:iload_3         
	//* 306  604:iadd            
	//* 307  605:istore          6
	//* 308  607:iload_2         
	//* 309  608:iconst_1        
	//* 310  609:iadd            
	//* 311  610:istore_2        
	//* 312  611:goto            558
				k3 = 0;
	//  313  614:iconst_0        
	//  314  615:istore          7
			ai2[0] = k3;
			setPixel(smask, ai2, 0, 1, l1, k, 1, i5);
			l1 += j;
			i++;
		}
		if(true) goto _L8; else goto _L11
	//  315  617:goto            577
_L11:
		int j5 = (width + 7) / 8;
	//  316  620:aload_0         
	//  317  621:getfield        #249 <Field int width>
	//  318  624:bipush          7
	//  319  626:iadd            
	//  320  627:bipush          8
	//  321  629:idiv            
	//  322  630:istore          8
		int ai3[] = new int[1];
	//  323  632:iconst_1        
	//  324  633:newarray        int[]
	//  325  635:astore          10
		int i2 = i;
	//  326  637:iload_2         
	//  327  638:istore          6
		i = 0;
	//  328  640:iconst_0        
	//  329  641:istore_2        
		while(i < l) 
	//* 330  642:iload_2         
	//* 331  643:iload           5
	//* 332  645:icmpge          436
		{
			int l3 = inputBands * i;
	//  333  648:aload_0         
	//  334  649:getfield        #287 <Field int inputBands>
	//  335  652:iload_2         
	//  336  653:imul            
	//  337  654:istore          7
			if(abyte0[l3] == transRedGray && abyte0[l3 + 1] == transGreen && abyte0[l3 + 2] == transBlue)
	//* 338  656:aload_1         
	//* 339  657:iload           7
	//* 340  659:iaload          
	//* 341  660:aload_0         
	//* 342  661:getfield        #126 <Field int transRedGray>
	//* 343  664:icmpne          733
	//* 344  667:aload_1         
	//* 345  668:iload           7
	//* 346  670:iconst_1        
	//* 347  671:iadd            
	//* 348  672:iaload          
	//* 349  673:aload_0         
	//* 350  674:getfield        #128 <Field int transGreen>
	//* 351  677:icmpne          733
	//* 352  680:aload_1         
	//* 353  681:iload           7
	//* 354  683:iconst_2        
	//* 355  684:iadd            
	//* 356  685:iaload          
	//* 357  686:aload_0         
	//* 358  687:getfield        #130 <Field int transBlue>
	//* 359  690:icmpne          733
				l3 = 1;
	//  360  693:iconst_1        
	//  361  694:istore          7
			else
	//* 362  696:aload           10
	//* 363  698:iconst_0        
	//* 364  699:iload           7
	//* 365  701:iastore         
	//* 366  702:aload_0         
	//* 367  703:getfield        #253 <Field byte[] smask>
	//* 368  706:aload           10
	//* 369  708:iconst_0        
	//* 370  709:iconst_1        
	//* 371  710:iload           6
	//* 372  712:iload           4
	//* 373  714:iconst_1        
	//* 374  715:iload           8
	//* 375  717:invokestatic    #494 <Method void setPixel(byte[], int[], int, int, int, int, int, int)>
	//* 376  720:iload           6
	//* 377  722:iload_3         
	//* 378  723:iadd            
	//* 379  724:istore          6
	//* 380  726:iload_2         
	//* 381  727:iconst_1        
	//* 382  728:iadd            
	//* 383  729:istore_2        
	//* 384  730:goto            642
				l3 = 0;
	//  385  733:iconst_0        
	//  386  734:istore          7
			ai3[0] = l3;
			setPixel(smask, ai3, 0, 1, i2, k, 1, j5);
			i2 += j;
			i++;
		}
		if(true) goto _L8; else goto _L13
	//  387  736:goto            696
_L13:
	}

	void readPng()
		throws IOException
	{
		byte abyte0[];
		for(int i = 0; i < PNGID.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:getstatic       #95  <Field int[] PNGID>
	//*   4    6:arraylength     
	//*   5    7:icmpge          50
			if(PNGID[i] != is.read())
	//*   6   10:getstatic       #95  <Field int[] PNGID>
	//*   7   13:iload_1         
	//*   8   14:iaload          
	//*   9   15:aload_0         
	//*  10   16:getfield        #136 <Field InputStream is>
	//*  11   19:invokevirtual   #201 <Method int InputStream.read()>
	//*  12   22:icmpeq          43
				throw new IOException(MessageLocalization.getComposedMessage("file.is.not.a.valid.png", new Object[0]));
	//   13   25:new             #151 <Class IOException>
	//   14   28:dup             
	//   15   29:ldc2            #496 <String "file.is.not.a.valid.png">
	//   16   32:iconst_0        
	//   17   33:anewarray       Object[]
	//   18   36:invokestatic    #301 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   19   39:invokespecial   #497 <Method void IOException(String)>
	//   20   42:athrow          

	//   21   43:iload_1         
	//   22   44:iconst_1        
	//   23   45:iadd            
	//   24   46:istore_1        
	//*  25   47:goto            2
		abyte0 = new byte[4096];
	//   26   50:sipush          4096
	//   27   53:newarray        byte[]
	//   28   55:astore          6
_L14:
		int j;
		Object obj;
		j = getInt(is);
	//   29   57:aload_0         
	//   30   58:getfield        #136 <Field InputStream is>
	//   31   61:invokestatic    #499 <Method int getInt(InputStream)>
	//   32   64:istore_1        
		obj = ((Object) (getString(is)));
	//   33   65:aload_0         
	//   34   66:getfield        #136 <Field InputStream is>
	//   35   69:invokestatic    #501 <Method String getString(InputStream)>
	//   36   72:astore          7
		if(j < 0 || !checkMarker(((String) (obj))))
	//*  37   74:iload_1         
	//*  38   75:iflt            87
	//*  39   78:aload_0         
	//*  40   79:aload           7
	//*  41   81:invokevirtual   #503 <Method boolean checkMarker(String)>
	//*  42   84:ifne            105
			throw new IOException(MessageLocalization.getComposedMessage("corrupted.png.file", new Object[0]));
	//   43   87:new             #151 <Class IOException>
	//   44   90:dup             
	//   45   91:ldc2            #505 <String "corrupted.png.file">
	//   46   94:iconst_0        
	//   47   95:anewarray       Object[]
	//   48   98:invokestatic    #301 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   49  101:invokespecial   #497 <Method void IOException(String)>
	//   50  104:athrow          
		if(!"IDAT".equals(obj)) goto _L2; else goto _L1
	//   51  105:ldc1            #10  <String "IDAT">
	//   52  107:aload           7
	//   53  109:invokevirtual   #509 <Method boolean String.equals(Object)>
	//   54  112:ifeq            160
_L1:
		if(j == 0) goto _L4; else goto _L3
	//   55  115:iload_1         
	//   56  116:ifeq            218
_L3:
		int k = is.read(abyte0, 0, Math.min(j, 4096));
	//   57  119:aload_0         
	//   58  120:getfield        #136 <Field InputStream is>
	//   59  123:aload           6
	//   60  125:iconst_0        
	//   61  126:iload_1         
	//   62  127:sipush          4096
	//   63  130:invokestatic    #513 <Method int Math.min(int, int)>
	//   64  133:invokevirtual   #516 <Method int InputStream.read(byte[], int, int)>
	//   65  136:istore_2        
		if(k >= 0) goto _L6; else goto _L5
	//   66  137:iload_2         
	//   67  138:ifge            142
_L5:
		return;
	//   68  141:return          
_L6:
		idat.write(abyte0, 0, k);
	//   69  142:aload_0         
	//   70  143:getfield        #124 <Field PngImage$NewByteArrayOutputStream idat>
	//   71  146:aload           6
	//   72  148:iconst_0        
	//   73  149:iload_2         
	//   74  150:invokevirtual   #519 <Method void PngImage$NewByteArrayOutputStream.write(byte[], int, int)>
		j -= k;
	//   75  153:iload_1         
	//   76  154:iload_2         
	//   77  155:isub            
	//   78  156:istore_1        
		  goto _L1
	//*  79  157:goto            115
_L2:
		if(!"tRNS".equals(obj)) goto _L8; else goto _L7
	//   80  160:ldc1            #45  <String "tRNS">
	//   81  162:aload           7
	//   82  164:invokevirtual   #509 <Method boolean String.equals(Object)>
	//   83  167:ifeq            531
_L7:
		k = j;
	//   84  170:iload_1         
	//   85  171:istore_2        
		colorType;
	//   86  172:aload_0         
	//   87  173:getfield        #243 <Field int colorType>
		JVM INSTR tableswitch 0 3: default 208
	//	               0 229
	//	               1 210
	//	               2 321
	//	               3 485;
	//   88  176:tableswitch     0 3: default 208
	//	               0 229
	//	               1 210
	//	               2 321
	//	               3 485
		   goto _L9 _L10 _L11 _L12 _L13
_L9:
		k = j;
	//   89  208:iload_1         
	//   90  209:istore_2        
_L11:
		Utilities.skip(is, k);
	//   91  210:aload_0         
	//   92  211:getfield        #136 <Field InputStream is>
	//   93  214:iload_2         
	//   94  215:invokestatic    #523 <Method void Utilities.skip(InputStream, int)>
_L4:
		Utilities.skip(is, 4);
	//   95  218:aload_0         
	//   96  219:getfield        #136 <Field InputStream is>
	//   97  222:iconst_4        
	//   98  223:invokestatic    #523 <Method void Utilities.skip(InputStream, int)>
		  goto _L14
	//*  99  226:goto            57
_L10:
		k = j;
	//  100  229:iload_1         
	//  101  230:istore_2        
		if(j >= 2)
	//* 102  231:iload_1         
	//* 103  232:iconst_2        
	//* 104  233:icmplt          210
		{
			k = j - 2;
	//  105  236:iload_1         
	//  106  237:iconst_2        
	//  107  238:isub            
	//  108  239:istore_2        
			j = getWord(is);
	//  109  240:aload_0         
	//  110  241:getfield        #136 <Field InputStream is>
	//  111  244:invokestatic    #525 <Method int getWord(InputStream)>
	//  112  247:istore_1        
			if(bitDepth == 16)
	//* 113  248:aload_0         
	//* 114  249:getfield        #239 <Field int bitDepth>
	//* 115  252:bipush          16
	//* 116  254:icmpne          265
				transRedGray = j;
	//  117  257:aload_0         
	//  118  258:iload_1         
	//  119  259:putfield        #126 <Field int transRedGray>
			else
	//* 120  262:goto            210
				additional.put(PdfName.MASK, ((PdfObject) (new PdfLiteral((new StringBuilder()).append("[").append(j).append(" ").append(j).append("]").toString()))));
	//  121  265:aload_0         
	//  122  266:getfield        #121 <Field PdfDictionary additional>
	//  123  269:getstatic       #386 <Field PdfName PdfName.MASK>
	//  124  272:new             #353 <Class PdfLiteral>
	//  125  275:dup             
	//  126  276:new             #388 <Class StringBuilder>
	//  127  279:dup             
	//  128  280:invokespecial   #389 <Method void StringBuilder()>
	//  129  283:ldc2            #391 <String "[">
	//  130  286:invokevirtual   #394 <Method StringBuilder StringBuilder.append(String)>
	//  131  289:iload_1         
	//  132  290:invokevirtual   #397 <Method StringBuilder StringBuilder.append(int)>
	//  133  293:ldc2            #399 <String " ">
	//  134  296:invokevirtual   #394 <Method StringBuilder StringBuilder.append(String)>
	//  135  299:iload_1         
	//  136  300:invokevirtual   #397 <Method StringBuilder StringBuilder.append(int)>
	//  137  303:ldc2            #401 <String "]">
	//  138  306:invokevirtual   #394 <Method StringBuilder StringBuilder.append(String)>
	//  139  309:invokevirtual   #402 <Method String StringBuilder.toString()>
	//  140  312:invokespecial   #356 <Method void PdfLiteral(String)>
	//  141  315:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		  goto _L11
	//* 142  318:goto            210
_L12:
		k = j;
	//  143  321:iload_1         
	//  144  322:istore_2        
		if(j >= 6)
	//* 145  323:iload_1         
	//* 146  324:bipush          6
	//* 147  326:icmplt          210
		{
			k = j - 6;
	//  148  329:iload_1         
	//  149  330:bipush          6
	//  150  332:isub            
	//  151  333:istore_2        
			j = getWord(is);
	//  152  334:aload_0         
	//  153  335:getfield        #136 <Field InputStream is>
	//  154  338:invokestatic    #525 <Method int getWord(InputStream)>
	//  155  341:istore_1        
			int j1 = getWord(is);
	//  156  342:aload_0         
	//  157  343:getfield        #136 <Field InputStream is>
	//  158  346:invokestatic    #525 <Method int getWord(InputStream)>
	//  159  349:istore_3        
			int l1 = getWord(is);
	//  160  350:aload_0         
	//  161  351:getfield        #136 <Field InputStream is>
	//  162  354:invokestatic    #525 <Method int getWord(InputStream)>
	//  163  357:istore          4
			if(bitDepth == 16)
	//* 164  359:aload_0         
	//* 165  360:getfield        #239 <Field int bitDepth>
	//* 166  363:bipush          16
	//* 167  365:icmpne          387
			{
				transRedGray = j;
	//  168  368:aload_0         
	//  169  369:iload_1         
	//  170  370:putfield        #126 <Field int transRedGray>
				transGreen = j1;
	//  171  373:aload_0         
	//  172  374:iload_3         
	//  173  375:putfield        #128 <Field int transGreen>
				transBlue = l1;
	//  174  378:aload_0         
	//  175  379:iload           4
	//  176  381:putfield        #130 <Field int transBlue>
			} else
	//* 177  384:goto            210
			{
				additional.put(PdfName.MASK, ((PdfObject) (new PdfLiteral((new StringBuilder()).append("[").append(j).append(" ").append(j).append(" ").append(j1).append(" ").append(j1).append(" ").append(l1).append(" ").append(l1).append("]").toString()))));
	//  178  387:aload_0         
	//  179  388:getfield        #121 <Field PdfDictionary additional>
	//  180  391:getstatic       #386 <Field PdfName PdfName.MASK>
	//  181  394:new             #353 <Class PdfLiteral>
	//  182  397:dup             
	//  183  398:new             #388 <Class StringBuilder>
	//  184  401:dup             
	//  185  402:invokespecial   #389 <Method void StringBuilder()>
	//  186  405:ldc2            #391 <String "[">
	//  187  408:invokevirtual   #394 <Method StringBuilder StringBuilder.append(String)>
	//  188  411:iload_1         
	//  189  412:invokevirtual   #397 <Method StringBuilder StringBuilder.append(int)>
	//  190  415:ldc2            #399 <String " ">
	//  191  418:invokevirtual   #394 <Method StringBuilder StringBuilder.append(String)>
	//  192  421:iload_1         
	//  193  422:invokevirtual   #397 <Method StringBuilder StringBuilder.append(int)>
	//  194  425:ldc2            #399 <String " ">
	//  195  428:invokevirtual   #394 <Method StringBuilder StringBuilder.append(String)>
	//  196  431:iload_3         
	//  197  432:invokevirtual   #397 <Method StringBuilder StringBuilder.append(int)>
	//  198  435:ldc2            #399 <String " ">
	//  199  438:invokevirtual   #394 <Method StringBuilder StringBuilder.append(String)>
	//  200  441:iload_3         
	//  201  442:invokevirtual   #397 <Method StringBuilder StringBuilder.append(int)>
	//  202  445:ldc2            #399 <String " ">
	//  203  448:invokevirtual   #394 <Method StringBuilder StringBuilder.append(String)>
	//  204  451:iload           4
	//  205  453:invokevirtual   #397 <Method StringBuilder StringBuilder.append(int)>
	//  206  456:ldc2            #399 <String " ">
	//  207  459:invokevirtual   #394 <Method StringBuilder StringBuilder.append(String)>
	//  208  462:iload           4
	//  209  464:invokevirtual   #397 <Method StringBuilder StringBuilder.append(int)>
	//  210  467:ldc2            #401 <String "]">
	//  211  470:invokevirtual   #394 <Method StringBuilder StringBuilder.append(String)>
	//  212  473:invokevirtual   #402 <Method String StringBuilder.toString()>
	//  213  476:invokespecial   #356 <Method void PdfLiteral(String)>
	//  214  479:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}
		}
		  goto _L11
	//* 215  482:goto            210
_L13:
		k = j;
	//  216  485:iload_1         
	//  217  486:istore_2        
		if(j > 0)
	//* 218  487:iload_1         
	//* 219  488:ifle            210
		{
			trans = new byte[j];
	//  220  491:aload_0         
	//  221  492:iload_1         
	//  222  493:newarray        byte[]
	//  223  495:putfield        #383 <Field byte[] trans>
			for(k = 0; k < j; k++)
	//* 224  498:iconst_0        
	//* 225  499:istore_2        
	//* 226  500:iload_2         
	//* 227  501:iload_1         
	//* 228  502:icmpge          526
				trans[k] = (byte)is.read();
	//  229  505:aload_0         
	//  230  506:getfield        #383 <Field byte[] trans>
	//  231  509:iload_2         
	//  232  510:aload_0         
	//  233  511:getfield        #136 <Field InputStream is>
	//  234  514:invokevirtual   #201 <Method int InputStream.read()>
	//  235  517:int2byte        
	//  236  518:bastore         

	//  237  519:iload_2         
	//  238  520:iconst_1        
	//  239  521:iadd            
	//  240  522:istore_2        
	//* 241  523:goto            500
			k = 0;
	//  242  526:iconst_0        
	//  243  527:istore_2        
		}
		  goto _L11
	//* 244  528:goto            210
_L8:
		if("IHDR".equals(obj))
	//* 245  531:ldc1            #14  <String "IHDR">
	//* 246  533:aload           7
	//* 247  535:invokevirtual   #509 <Method boolean String.equals(Object)>
	//* 248  538:ifeq            621
		{
			width = getInt(is);
	//  249  541:aload_0         
	//  250  542:aload_0         
	//  251  543:getfield        #136 <Field InputStream is>
	//  252  546:invokestatic    #499 <Method int getInt(InputStream)>
	//  253  549:putfield        #249 <Field int width>
			height = getInt(is);
	//  254  552:aload_0         
	//  255  553:aload_0         
	//  256  554:getfield        #136 <Field InputStream is>
	//  257  557:invokestatic    #499 <Method int getInt(InputStream)>
	//  258  560:putfield        #251 <Field int height>
			bitDepth = is.read();
	//  259  563:aload_0         
	//  260  564:aload_0         
	//  261  565:getfield        #136 <Field InputStream is>
	//  262  568:invokevirtual   #201 <Method int InputStream.read()>
	//  263  571:putfield        #239 <Field int bitDepth>
			colorType = is.read();
	//  264  574:aload_0         
	//  265  575:aload_0         
	//  266  576:getfield        #136 <Field InputStream is>
	//  267  579:invokevirtual   #201 <Method int InputStream.read()>
	//  268  582:putfield        #243 <Field int colorType>
			compressionMethod = is.read();
	//  269  585:aload_0         
	//  270  586:aload_0         
	//  271  587:getfield        #136 <Field InputStream is>
	//  272  590:invokevirtual   #201 <Method int InputStream.read()>
	//  273  593:putfield        #527 <Field int compressionMethod>
			filterMethod = is.read();
	//  274  596:aload_0         
	//  275  597:aload_0         
	//  276  598:getfield        #136 <Field InputStream is>
	//  277  601:invokevirtual   #201 <Method int InputStream.read()>
	//  278  604:putfield        #529 <Field int filterMethod>
			interlaceMethod = is.read();
	//  279  607:aload_0         
	//  280  608:aload_0         
	//  281  609:getfield        #136 <Field InputStream is>
	//  282  612:invokevirtual   #201 <Method int InputStream.read()>
	//  283  615:putfield        #277 <Field int interlaceMethod>
		} else
	//* 284  618:goto            218
		if("PLTE".equals(obj))
	//* 285  621:ldc1            #16  <String "PLTE">
	//* 286  623:aload           7
	//* 287  625:invokevirtual   #509 <Method boolean String.equals(Object)>
	//* 288  628:ifeq            772
		{
			if(colorType == 3)
	//* 289  631:aload_0         
	//* 290  632:getfield        #243 <Field int colorType>
	//* 291  635:iconst_3        
	//* 292  636:icmpne          761
			{
				obj = ((Object) (new PdfArray()));
	//  293  639:new             #328 <Class PdfArray>
	//  294  642:dup             
	//  295  643:invokespecial   #329 <Method void PdfArray()>
	//  296  646:astore          7
				((PdfArray) (obj)).add(((PdfObject) (PdfName.INDEXED)));
	//  297  648:aload           7
	//  298  650:getstatic       #532 <Field PdfName PdfName.INDEXED>
	//  299  653:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  300  656:pop             
				((PdfArray) (obj)).add(getColorspace());
	//  301  657:aload           7
	//  302  659:aload_0         
	//  303  660:invokevirtual   #418 <Method PdfObject getColorspace()>
	//  304  663:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  305  666:pop             
				((PdfArray) (obj)).add(((PdfObject) (new PdfNumber(j / 3 - 1))));
	//  306  667:aload           7
	//  307  669:new             #341 <Class PdfNumber>
	//  308  672:dup             
	//  309  673:iload_1         
	//  310  674:iconst_3        
	//  311  675:idiv            
	//  312  676:iconst_1        
	//  313  677:isub            
	//  314  678:invokespecial   #477 <Method void PdfNumber(int)>
	//  315  681:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  316  684:pop             
				ByteBuffer bytebuffer = new ByteBuffer();
	//  317  685:new             #534 <Class ByteBuffer>
	//  318  688:dup             
	//  319  689:invokespecial   #535 <Method void ByteBuffer()>
	//  320  692:astore          8
				for(; j > 0; j--)
	//* 321  694:iload_1         
	//* 322  695:ifle            718
					bytebuffer.append_i(is.read());
	//  323  698:aload           8
	//  324  700:aload_0         
	//  325  701:getfield        #136 <Field InputStream is>
	//  326  704:invokevirtual   #201 <Method int InputStream.read()>
	//  327  707:invokevirtual   #539 <Method ByteBuffer ByteBuffer.append_i(int)>
	//  328  710:pop             

	//  329  711:iload_1         
	//  330  712:iconst_1        
	//  331  713:isub            
	//  332  714:istore_1        
	//* 333  715:goto            694
				byte abyte1[] = bytebuffer.toByteArray();
	//  334  718:aload           8
	//  335  720:invokevirtual   #540 <Method byte[] ByteBuffer.toByteArray()>
	//  336  723:astore          8
				colorTable = abyte1;
	//  337  725:aload_0         
	//  338  726:aload           8
	//  339  728:putfield        #542 <Field byte[] colorTable>
				((PdfArray) (obj)).add(((PdfObject) (new PdfString(abyte1))));
	//  340  731:aload           7
	//  341  733:new             #544 <Class PdfString>
	//  342  736:dup             
	//  343  737:aload           8
	//  344  739:invokespecial   #545 <Method void PdfString(byte[])>
	//  345  742:invokevirtual   #336 <Method boolean PdfArray.add(PdfObject)>
	//  346  745:pop             
				additional.put(PdfName.COLORSPACE, ((PdfObject) (obj)));
	//  347  746:aload_0         
	//  348  747:getfield        #121 <Field PdfDictionary additional>
	//  349  750:getstatic       #412 <Field PdfName PdfName.COLORSPACE>
	//  350  753:aload           7
	//  351  755:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
			} else
	//* 352  758:goto            218
			{
				Utilities.skip(is, j);
	//  353  761:aload_0         
	//  354  762:getfield        #136 <Field InputStream is>
	//  355  765:iload_1         
	//  356  766:invokestatic    #523 <Method void Utilities.skip(InputStream, int)>
			}
		} else
	//* 357  769:goto            218
		if("pHYs".equals(obj))
	//* 358  772:ldc1            #41  <String "pHYs">
	//* 359  774:aload           7
	//* 360  776:invokevirtual   #509 <Method boolean String.equals(Object)>
	//* 361  779:ifeq            858
		{
			j = getInt(is);
	//  362  782:aload_0         
	//  363  783:getfield        #136 <Field InputStream is>
	//  364  786:invokestatic    #499 <Method int getInt(InputStream)>
	//  365  789:istore_1        
			int l = getInt(is);
	//  366  790:aload_0         
	//  367  791:getfield        #136 <Field InputStream is>
	//  368  794:invokestatic    #499 <Method int getInt(InputStream)>
	//  369  797:istore_2        
			if(is.read() == 1)
	//* 370  798:aload_0         
	//* 371  799:getfield        #136 <Field InputStream is>
	//* 372  802:invokevirtual   #201 <Method int InputStream.read()>
	//* 373  805:iconst_1        
	//* 374  806:icmpne          842
			{
				dpiX = (int)((float)j * 0.0254F + 0.5F);
	//  375  809:aload_0         
	//  376  810:iload_1         
	//  377  811:i2f             
	//  378  812:ldc2            #546 <Float 0.0254F>
	//  379  815:fmul            
	//  380  816:ldc2            #547 <Float 0.5F>
	//  381  819:fadd            
	//  382  820:f2i             
	//  383  821:putfield        #445 <Field int dpiX>
				dpiY = (int)((float)l * 0.0254F + 0.5F);
	//  384  824:aload_0         
	//  385  825:iload_2         
	//  386  826:i2f             
	//  387  827:ldc2            #546 <Float 0.0254F>
	//  388  830:fmul            
	//  389  831:ldc2            #547 <Float 0.5F>
	//  390  834:fadd            
	//  391  835:f2i             
	//  392  836:putfield        #447 <Field int dpiY>
			} else
	//* 393  839:goto            218
			if(l != 0)
	//* 394  842:iload_2         
	//* 395  843:ifeq            218
				XYRatio = (float)j / (float)l;
	//  396  846:aload_0         
	//  397  847:iload_1         
	//  398  848:i2f             
	//  399  849:iload_2         
	//  400  850:i2f             
	//  401  851:fdiv            
	//  402  852:putfield        #453 <Field float XYRatio>
		} else
	//* 403  855:goto            218
		if("cHRM".equals(obj))
	//* 404  858:ldc1            #33  <String "cHRM">
	//* 405  860:aload           7
	//* 406  862:invokevirtual   #509 <Method boolean String.equals(Object)>
	//* 407  865:ifeq            1126
		{
			xW = (float)getInt(is) / 100000F;
	//  408  868:aload_0         
	//  409  869:aload_0         
	//  410  870:getfield        #136 <Field InputStream is>
	//  411  873:invokestatic    #499 <Method int getInt(InputStream)>
	//  412  876:i2f             
	//  413  877:ldc2            #548 <Float 100000F>
	//  414  880:fdiv            
	//  415  881:putfield        #375 <Field float xW>
			yW = (float)getInt(is) / 100000F;
	//  416  884:aload_0         
	//  417  885:aload_0         
	//  418  886:getfield        #136 <Field InputStream is>
	//  419  889:invokestatic    #499 <Method int getInt(InputStream)>
	//  420  892:i2f             
	//  421  893:ldc2            #548 <Float 100000F>
	//  422  896:fdiv            
	//  423  897:putfield        #361 <Field float yW>
			xR = (float)getInt(is) / 100000F;
	//  424  900:aload_0         
	//  425  901:aload_0         
	//  426  902:getfield        #136 <Field InputStream is>
	//  427  905:invokestatic    #499 <Method int getInt(InputStream)>
	//  428  908:i2f             
	//  429  909:ldc2            #548 <Float 100000F>
	//  430  912:fdiv            
	//  431  913:putfield        #369 <Field float xR>
			yR = (float)getInt(is) / 100000F;
	//  432  916:aload_0         
	//  433  917:aload_0         
	//  434  918:getfield        #136 <Field InputStream is>
	//  435  921:invokestatic    #499 <Method int getInt(InputStream)>
	//  436  924:i2f             
	//  437  925:ldc2            #548 <Float 100000F>
	//  438  928:fdiv            
	//  439  929:putfield        #367 <Field float yR>
			xG = (float)getInt(is) / 100000F;
	//  440  932:aload_0         
	//  441  933:aload_0         
	//  442  934:getfield        #136 <Field InputStream is>
	//  443  937:invokestatic    #499 <Method int getInt(InputStream)>
	//  444  940:i2f             
	//  445  941:ldc2            #548 <Float 100000F>
	//  446  944:fdiv            
	//  447  945:putfield        #363 <Field float xG>
			yG = (float)getInt(is) / 100000F;
	//  448  948:aload_0         
	//  449  949:aload_0         
	//  450  950:getfield        #136 <Field InputStream is>
	//  451  953:invokestatic    #499 <Method int getInt(InputStream)>
	//  452  956:i2f             
	//  453  957:ldc2            #548 <Float 100000F>
	//  454  960:fdiv            
	//  455  961:putfield        #371 <Field float yG>
			xB = (float)getInt(is) / 100000F;
	//  456  964:aload_0         
	//  457  965:aload_0         
	//  458  966:getfield        #136 <Field InputStream is>
	//  459  969:invokestatic    #499 <Method int getInt(InputStream)>
	//  460  972:i2f             
	//  461  973:ldc2            #548 <Float 100000F>
	//  462  976:fdiv            
	//  463  977:putfield        #365 <Field float xB>
			yB = (float)getInt(is) / 100000F;
	//  464  980:aload_0         
	//  465  981:aload_0         
	//  466  982:getfield        #136 <Field InputStream is>
	//  467  985:invokestatic    #499 <Method int getInt(InputStream)>
	//  468  988:i2f             
	//  469  989:ldc2            #548 <Float 100000F>
	//  470  992:fdiv            
	//  471  993:putfield        #373 <Field float yB>
			boolean flag;
			if(Math.abs(xW) >= 0.0001F && Math.abs(yW) >= 0.0001F && Math.abs(xR) >= 0.0001F && Math.abs(yR) >= 0.0001F && Math.abs(xG) >= 0.0001F && Math.abs(yG) >= 0.0001F && Math.abs(xB) >= 0.0001F && Math.abs(yB) >= 0.0001F)
	//* 472  996:aload_0         
	//* 473  997:getfield        #375 <Field float xW>
	//* 474 1000:invokestatic    #551 <Method float Math.abs(float)>
	//* 475 1003:ldc2            #552 <Float 0.0001F>
	//* 476 1006:fcmpg           
	//* 477 1007:iflt            1120
	//* 478 1010:aload_0         
	//* 479 1011:getfield        #361 <Field float yW>
	//* 480 1014:invokestatic    #551 <Method float Math.abs(float)>
	//* 481 1017:ldc2            #552 <Float 0.0001F>
	//* 482 1020:fcmpg           
	//* 483 1021:iflt            1120
	//* 484 1024:aload_0         
	//* 485 1025:getfield        #369 <Field float xR>
	//* 486 1028:invokestatic    #551 <Method float Math.abs(float)>
	//* 487 1031:ldc2            #552 <Float 0.0001F>
	//* 488 1034:fcmpg           
	//* 489 1035:iflt            1120
	//* 490 1038:aload_0         
	//* 491 1039:getfield        #367 <Field float yR>
	//* 492 1042:invokestatic    #551 <Method float Math.abs(float)>
	//* 493 1045:ldc2            #552 <Float 0.0001F>
	//* 494 1048:fcmpg           
	//* 495 1049:iflt            1120
	//* 496 1052:aload_0         
	//* 497 1053:getfield        #363 <Field float xG>
	//* 498 1056:invokestatic    #551 <Method float Math.abs(float)>
	//* 499 1059:ldc2            #552 <Float 0.0001F>
	//* 500 1062:fcmpg           
	//* 501 1063:iflt            1120
	//* 502 1066:aload_0         
	//* 503 1067:getfield        #371 <Field float yG>
	//* 504 1070:invokestatic    #551 <Method float Math.abs(float)>
	//* 505 1073:ldc2            #552 <Float 0.0001F>
	//* 506 1076:fcmpg           
	//* 507 1077:iflt            1120
	//* 508 1080:aload_0         
	//* 509 1081:getfield        #365 <Field float xB>
	//* 510 1084:invokestatic    #551 <Method float Math.abs(float)>
	//* 511 1087:ldc2            #552 <Float 0.0001F>
	//* 512 1090:fcmpg           
	//* 513 1091:iflt            1120
	//* 514 1094:aload_0         
	//* 515 1095:getfield        #373 <Field float yB>
	//* 516 1098:invokestatic    #551 <Method float Math.abs(float)>
	//* 517 1101:ldc2            #552 <Float 0.0001F>
	//* 518 1104:fcmpg           
	//* 519 1105:iflt            1120
				flag = true;
	//  520 1108:iconst_1        
	//  521 1109:istore          5
			else
	//* 522 1111:aload_0         
	//* 523 1112:iload           5
	//* 524 1114:putfield        #134 <Field boolean hasCHRM>
	//* 525 1117:goto            218
				flag = false;
	//  526 1120:iconst_0        
	//  527 1121:istore          5
			hasCHRM = flag;
		} else
	//* 528 1123:goto            1111
		if("sRGB".equals(obj))
	//* 529 1126:ldc1            #43  <String "sRGB">
	//* 530 1128:aload           7
	//* 531 1130:invokevirtual   #509 <Method boolean String.equals(Object)>
	//* 532 1133:ifeq            1224
		{
			j = is.read();
	//  533 1136:aload_0         
	//  534 1137:getfield        #136 <Field InputStream is>
	//  535 1140:invokevirtual   #201 <Method int InputStream.read()>
	//  536 1143:istore_1        
			intent = intents[j];
	//  537 1144:aload_0         
	//  538 1145:getstatic       #111 <Field PdfName[] intents>
	//  539 1148:iload_1         
	//  540 1149:aaload          
	//  541 1150:putfield        #420 <Field PdfName intent>
			gamma = 2.2F;
	//  542 1153:aload_0         
	//  543 1154:ldc2            #553 <Float 2.2F>
	//  544 1157:putfield        #132 <Field float gamma>
			xW = 0.3127F;
	//  545 1160:aload_0         
	//  546 1161:ldc2            #554 <Float 0.3127F>
	//  547 1164:putfield        #375 <Field float xW>
			yW = 0.329F;
	//  548 1167:aload_0         
	//  549 1168:ldc2            #555 <Float 0.329F>
	//  550 1171:putfield        #361 <Field float yW>
			xR = 0.64F;
	//  551 1174:aload_0         
	//  552 1175:ldc2            #556 <Float 0.64F>
	//  553 1178:putfield        #369 <Field float xR>
			yR = 0.33F;
	//  554 1181:aload_0         
	//  555 1182:ldc2            #557 <Float 0.33F>
	//  556 1185:putfield        #367 <Field float yR>
			xG = 0.3F;
	//  557 1188:aload_0         
	//  558 1189:ldc2            #558 <Float 0.3F>
	//  559 1192:putfield        #363 <Field float xG>
			yG = 0.6F;
	//  560 1195:aload_0         
	//  561 1196:ldc2            #559 <Float 0.6F>
	//  562 1199:putfield        #371 <Field float yG>
			xB = 0.15F;
	//  563 1202:aload_0         
	//  564 1203:ldc2            #560 <Float 0.15F>
	//  565 1206:putfield        #365 <Field float xB>
			yB = 0.06F;
	//  566 1209:aload_0         
	//  567 1210:ldc2            #561 <Float 0.06F>
	//  568 1213:putfield        #373 <Field float yB>
			hasCHRM = true;
	//  569 1216:aload_0         
	//  570 1217:iconst_1        
	//  571 1218:putfield        #134 <Field boolean hasCHRM>
		} else
	//* 572 1221:goto            218
		if("gAMA".equals(obj))
	//* 573 1224:ldc1            #35  <String "gAMA">
	//* 574 1226:aload           7
	//* 575 1228:invokevirtual   #509 <Method boolean String.equals(Object)>
	//* 576 1231:ifeq            1327
		{
			j = getInt(is);
	//  577 1234:aload_0         
	//  578 1235:getfield        #136 <Field InputStream is>
	//  579 1238:invokestatic    #499 <Method int getInt(InputStream)>
	//  580 1241:istore_1        
			if(j != 0)
	//* 581 1242:iload_1         
	//* 582 1243:ifeq            218
			{
				gamma = 100000F / (float)j;
	//  583 1246:aload_0         
	//  584 1247:ldc2            #548 <Float 100000F>
	//  585 1250:iload_1         
	//  586 1251:i2f             
	//  587 1252:fdiv            
	//  588 1253:putfield        #132 <Field float gamma>
				if(!hasCHRM)
	//* 589 1256:aload_0         
	//* 590 1257:getfield        #134 <Field boolean hasCHRM>
	//* 591 1260:ifne            218
				{
					xW = 0.3127F;
	//  592 1263:aload_0         
	//  593 1264:ldc2            #554 <Float 0.3127F>
	//  594 1267:putfield        #375 <Field float xW>
					yW = 0.329F;
	//  595 1270:aload_0         
	//  596 1271:ldc2            #555 <Float 0.329F>
	//  597 1274:putfield        #361 <Field float yW>
					xR = 0.64F;
	//  598 1277:aload_0         
	//  599 1278:ldc2            #556 <Float 0.64F>
	//  600 1281:putfield        #369 <Field float xR>
					yR = 0.33F;
	//  601 1284:aload_0         
	//  602 1285:ldc2            #557 <Float 0.33F>
	//  603 1288:putfield        #367 <Field float yR>
					xG = 0.3F;
	//  604 1291:aload_0         
	//  605 1292:ldc2            #558 <Float 0.3F>
	//  606 1295:putfield        #363 <Field float xG>
					yG = 0.6F;
	//  607 1298:aload_0         
	//  608 1299:ldc2            #559 <Float 0.6F>
	//  609 1302:putfield        #371 <Field float yG>
					xB = 0.15F;
	//  610 1305:aload_0         
	//  611 1306:ldc2            #560 <Float 0.15F>
	//  612 1309:putfield        #365 <Field float xB>
					yB = 0.06F;
	//  613 1312:aload_0         
	//  614 1313:ldc2            #561 <Float 0.06F>
	//  615 1316:putfield        #373 <Field float yB>
					hasCHRM = true;
	//  616 1319:aload_0         
	//  617 1320:iconst_1        
	//  618 1321:putfield        #134 <Field boolean hasCHRM>
				}
			}
		} else
	//* 619 1324:goto            218
		{
			if(!"iCCP".equals(obj))
				continue; /* Loop/switch isn't completed */
	//  620 1327:ldc1            #37  <String "iCCP">
	//  621 1329:aload           7
	//  622 1331:invokevirtual   #509 <Method boolean String.equals(Object)>
	//  623 1334:ifeq            1451
			int i1;
			do
			{
				i1 = j - 1;
	//  624 1337:iload_1         
	//  625 1338:iconst_1        
	//  626 1339:isub            
	//  627 1340:istore_2        
				j = i1;
	//  628 1341:iload_2         
	//  629 1342:istore_1        
			} while(is.read() != 0);
	//  630 1343:aload_0         
	//  631 1344:getfield        #136 <Field InputStream is>
	//  632 1347:invokevirtual   #201 <Method int InputStream.read()>
	//  633 1350:ifne            1337
			is.read();
	//  634 1353:aload_0         
	//  635 1354:getfield        #136 <Field InputStream is>
	//  636 1357:invokevirtual   #201 <Method int InputStream.read()>
	//  637 1360:pop             
			j = i1 - 1;
	//  638 1361:iload_2         
	//  639 1362:iconst_1        
	//  640 1363:isub            
	//  641 1364:istore_1        
			obj = ((Object) (new byte[j]));
	//  642 1365:iload_1         
	//  643 1366:newarray        byte[]
	//  644 1368:astore          7
			i1 = 0;
	//  645 1370:iconst_0        
	//  646 1371:istore_2        
			int k1;
			for(; j > 0; j -= k1)
	//* 647 1372:iload_1         
	//* 648 1373:ifle            1421
			{
				k1 = is.read(((byte []) (obj)), i1, j);
	//  649 1376:aload_0         
	//  650 1377:getfield        #136 <Field InputStream is>
	//  651 1380:aload           7
	//  652 1382:iload_2         
	//  653 1383:iload_1         
	//  654 1384:invokevirtual   #516 <Method int InputStream.read(byte[], int, int)>
	//  655 1387:istore_3        
				if(k1 < 0)
	//* 656 1388:iload_3         
	//* 657 1389:ifge            1410
					throw new IOException(MessageLocalization.getComposedMessage("premature.end.of.file", new Object[0]));
	//  658 1392:new             #151 <Class IOException>
	//  659 1395:dup             
	//  660 1396:ldc2            #563 <String "premature.end.of.file">
	//  661 1399:iconst_0        
	//  662 1400:anewarray       Object[]
	//  663 1403:invokestatic    #301 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  664 1406:invokespecial   #497 <Method void IOException(String)>
	//  665 1409:athrow          
				i1 += k1;
	//  666 1410:iload_2         
	//  667 1411:iload_3         
	//  668 1412:iadd            
	//  669 1413:istore_2        
			}

	//  670 1414:iload_1         
	//  671 1415:iload_3         
	//  672 1416:isub            
	//  673 1417:istore_1        
	//* 674 1418:goto            1372
			obj = ((Object) (PdfReader.FlateDecode(((byte []) (obj)), true)));
	//  675 1421:aload           7
	//  676 1423:iconst_1        
	//  677 1424:invokestatic    #569 <Method byte[] PdfReader.FlateDecode(byte[], boolean)>
	//  678 1427:astore          7
			try
			{
				icc_profile = ICC_Profile.getInstance(((byte []) (obj)));
	//  679 1429:aload_0         
	//  680 1430:aload           7
	//  681 1432:invokestatic    #574 <Method ICC_Profile ICC_Profile.getInstance(byte[])>
	//  682 1435:putfield        #320 <Field ICC_Profile icc_profile>
			}
	//* 683 1438:goto            218
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//* 684 1441:astore          7
			{
				icc_profile = null;
	//  685 1443:aload_0         
	//  686 1444:aconst_null     
	//  687 1445:putfield        #320 <Field ICC_Profile icc_profile>
			}
		}
		  goto _L4
	//* 688 1448:goto            218
		if("IEND".equals(obj)) goto _L5; else goto _L15
	//  689 1451:ldc1            #12  <String "IEND">
	//  690 1453:aload           7
	//  691 1455:invokevirtual   #509 <Method boolean String.equals(Object)>
	//  692 1458:ifne            141
_L15:
		Utilities.skip(is, j);
	//  693 1461:aload_0         
	//  694 1462:getfield        #136 <Field InputStream is>
	//  695 1465:iload_1         
	//  696 1466:invokestatic    #523 <Method void Utilities.skip(InputStream, int)>
		  goto _L4
	//* 697 1469:goto            218
	}

	public static final String IDAT = "IDAT";
	public static final String IEND = "IEND";
	public static final String IHDR = "IHDR";
	public static final String PLTE = "PLTE";
	public static final int PNGID[] = {
		137, 80, 78, 71, 13, 10, 26, 10
	};
	private static final int PNG_FILTER_AVERAGE = 3;
	private static final int PNG_FILTER_NONE = 0;
	private static final int PNG_FILTER_PAETH = 4;
	private static final int PNG_FILTER_SUB = 1;
	private static final int PNG_FILTER_UP = 2;
	private static final int TRANSFERSIZE = 4096;
	public static final String cHRM = "cHRM";
	public static final String gAMA = "gAMA";
	public static final String iCCP = "iCCP";
	private static final PdfName intents[];
	public static final String pHYs = "pHYs";
	public static final String sRGB = "sRGB";
	public static final String tRNS = "tRNS";
	float XYRatio;
	PdfDictionary additional;
	int bitDepth;
	int bytesPerPixel;
	byte colorTable[];
	int colorType;
	int compressionMethod;
	DataInputStream dataStream;
	int dpiX;
	int dpiY;
	int filterMethod;
	float gamma;
	boolean genBWMask;
	boolean hasCHRM;
	int height;
	ICC_Profile icc_profile;
	NewByteArrayOutputStream idat;
	byte image[];
	int inputBands;
	PdfName intent;
	int interlaceMethod;
	InputStream is;
	boolean palShades;
	byte smask[];
	byte trans[];
	int transBlue;
	int transGreen;
	int transRedGray;
	int width;
	float xB;
	float xG;
	float xR;
	float xW;
	float yB;
	float yG;
	float yR;
	float yW;

	static 
	{
	//    0    0:bipush          8
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:sipush          137
	//    5    9:iastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:bipush          80
	//    9   14:iastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:bipush          78
	//   13   19:iastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:bipush          71
	//   17   24:iastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:bipush          13
	//   21   29:iastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:bipush          10
	//   25   34:iastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:bipush          26
	//   29   40:iastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:bipush          10
	//   33   46:iastore         
	//   34   47:putstatic       #95  <Field int[] PNGID>
		intents = (new PdfName[] {
			PdfName.PERCEPTUAL, PdfName.RELATIVECOLORIMETRIC, PdfName.SATURATION, PdfName.ABSOLUTECOLORIMETRIC
		});
	//   35   50:iconst_4        
	//   36   51:anewarray       PdfName[]
	//   37   54:dup             
	//   38   55:iconst_0        
	//   39   56:getstatic       #100 <Field PdfName PdfName.PERCEPTUAL>
	//   40   59:aastore         
	//   41   60:dup             
	//   42   61:iconst_1        
	//   43   62:getstatic       #103 <Field PdfName PdfName.RELATIVECOLORIMETRIC>
	//   44   65:aastore         
	//   45   66:dup             
	//   46   67:iconst_2        
	//   47   68:getstatic       #106 <Field PdfName PdfName.SATURATION>
	//   48   71:aastore         
	//   49   72:dup             
	//   50   73:iconst_3        
	//   51   74:getstatic       #109 <Field PdfName PdfName.ABSOLUTECOLORIMETRIC>
	//   52   77:aastore         
	//   53   78:putstatic       #111 <Field PdfName[] intents>
	//*  54   81:return          
	}
}
