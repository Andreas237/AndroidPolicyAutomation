// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.pdf.crypto.AESCipher;
import com.itextpdf.text.pdf.crypto.ARCFOUREncryption;
import com.itextpdf.text.pdf.crypto.IVGenerator;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEncryption extends OutputStream
{

	public OutputStreamEncryption(OutputStream outputstream, byte abyte0[], int i)
	{
		this(outputstream, abyte0, 0, abyte0.length, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:aload_2         
	//    5    5:arraylength     
	//    6    6:iload_3         
	//    7    7:invokespecial   #25  <Method void OutputStreamEncryption(OutputStream, byte[], int, int, int)>
	//    8   10:return          
	}

	public OutputStreamEncryption(OutputStream outputstream, byte abyte0[], int i, int j, int k)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		super();
	//    2    3:aload_0         
	//    3    4:invokespecial   #31  <Method void OutputStream()>
		sb = new byte[1];
	//    4    7:aload_0         
	//    5    8:iconst_1        
	//    6    9:newarray        byte[]
	//    7   11:putfield        #33  <Field byte[] sb>
		byte abyte1[];
		try
		{
			out = outputstream;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #35  <Field OutputStream out>
		}
	//*  11   19:iload           5
	//*  12   21:iconst_4        
	//*  13   22:icmpeq          121
	//*  14   25:iload           5
	//*  15   27:iconst_5        
	//*  16   28:icmpne          34
	//*  17   31:goto            121
	//*  18   34:aload_0         
	//*  19   35:iload           6
	//*  20   37:putfield        #37  <Field boolean aes>
	//*  21   40:aload_0         
	//*  22   41:getfield        #37  <Field boolean aes>
	//*  23   44:ifeq            88
	//*  24   47:invokestatic    #43  <Method byte[] IVGenerator.getIV()>
	//*  25   50:astore_1        
	//*  26   51:iload           4
	//*  27   53:newarray        byte[]
	//*  28   55:astore          7
	//*  29   57:aload_2         
	//*  30   58:iload_3         
	//*  31   59:aload           7
	//*  32   61:iconst_0        
	//*  33   62:iload           4
	//*  34   64:invokestatic    #49  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  35   67:aload_0         
	//*  36   68:new             #51  <Class AESCipher>
	//*  37   71:dup             
	//*  38   72:iconst_1        
	//*  39   73:aload           7
	//*  40   75:aload_1         
	//*  41   76:invokespecial   #54  <Method void AESCipher(boolean, byte[], byte[])>
	//*  42   79:putfield        #56  <Field AESCipher cipher>
	//*  43   82:aload_0         
	//*  44   83:aload_1         
	//*  45   84:invokevirtual   #60  <Method void write(byte[])>
	//*  46   87:return          
	//*  47   88:aload_0         
	//*  48   89:new             #62  <Class ARCFOUREncryption>
	//*  49   92:dup             
	//*  50   93:invokespecial   #63  <Method void ARCFOUREncryption()>
	//*  51   96:putfield        #65  <Field ARCFOUREncryption arcfour>
	//*  52   99:aload_0         
	//*  53  100:getfield        #65  <Field ARCFOUREncryption arcfour>
	//*  54  103:aload_2         
	//*  55  104:iload_3         
	//*  56  105:iload           4
	//*  57  107:invokevirtual   #69  <Method void ARCFOUREncryption.prepareARCFOURKey(byte[], int, int)>
	//*  58  110:return          
		// Misplaced declaration of an exception variable
		catch(OutputStream outputstream)
	//*  59  111:astore_1        
		{
			throw new ExceptionConverter(((Exception) (outputstream)));
	//   60  112:new             #71  <Class ExceptionConverter>
	//   61  115:dup             
	//   62  116:aload_1         
	//   63  117:invokespecial   #74  <Method void ExceptionConverter(Exception)>
	//   64  120:athrow          
		}
		if(k == 4 || k == 5)
			flag = true;
	//   65  121:iconst_1        
	//   66  122:istore          6
		aes = flag;
		if(aes)
		{
			outputstream = ((OutputStream) (IVGenerator.getIV()));
			abyte1 = new byte[j];
			System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte1)), 0, j);
			cipher = new AESCipher(true, abyte1, ((byte []) (outputstream)));
			write(((byte []) (outputstream)));
			return;
		}
		arcfour = new ARCFOUREncryption();
		arcfour.prepareARCFOURKey(abyte0, i, j);
		return;
	//*  67  124:goto            34
	}

	public void close()
		throws IOException
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method void finish()>
		out.close();
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field OutputStream out>
	//    4    8:invokevirtual   #82  <Method void OutputStream.close()>
	//    5   11:return          
	}

	public void finish()
		throws IOException
	{
		if(!finished)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field boolean finished>
	//*   2    4:ifne            38
		{
			finished = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #85  <Field boolean finished>
			if(aes)
	//*   6   12:aload_0         
	//*   7   13:getfield        #37  <Field boolean aes>
	//*   8   16:ifeq            38
			{
				byte abyte0[];
				try
				{
					abyte0 = cipher.doFinal();
	//    9   19:aload_0         
	//   10   20:getfield        #56  <Field AESCipher cipher>
	//   11   23:invokevirtual   #88  <Method byte[] AESCipher.doFinal()>
	//   12   26:astore_1        
				}
	//*  13   27:aload_0         
	//*  14   28:getfield        #35  <Field OutputStream out>
	//*  15   31:aload_1         
	//*  16   32:iconst_0        
	//*  17   33:aload_1         
	//*  18   34:arraylength     
	//*  19   35:invokevirtual   #90  <Method void OutputStream.write(byte[], int, int)>
	//*  20   38:return          
				catch(Exception exception)
	//*  21   39:astore_1        
				{
					throw new ExceptionConverter(exception);
	//   22   40:new             #71  <Class ExceptionConverter>
	//   23   43:dup             
	//   24   44:aload_1         
	//   25   45:invokespecial   #74  <Method void ExceptionConverter(Exception)>
	//   26   48:athrow          
				}
				out.write(abyte0, 0, abyte0.length);
			}
		}
	}

	public void flush()
		throws IOException
	{
		out.flush();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field OutputStream out>
	//    2    4:invokevirtual   #93  <Method void OutputStream.flush()>
	//    3    7:return          
	}

	public void write(int i)
		throws IOException
	{
		sb[0] = (byte)i;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field byte[] sb>
	//    2    4:iconst_0        
	//    3    5:iload_1         
	//    4    6:int2byte        
	//    5    7:bastore         
		write(sb, 0, 1);
	//    6    8:aload_0         
	//    7    9:aload_0         
	//    8   10:getfield        #33  <Field byte[] sb>
	//    9   13:iconst_0        
	//   10   14:iconst_1        
	//   11   15:invokevirtual   #95  <Method void write(byte[], int, int)>
	//   12   18:return          
	}

	public void write(byte abyte0[])
		throws IOException
	{
		write(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #95  <Method void write(byte[], int, int)>
	//    6    8:return          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		if(!aes) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean aes>
	//    2    4:ifeq            40
_L1:
		abyte0 = cipher.update(abyte0, i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #56  <Field AESCipher cipher>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #99  <Method byte[] AESCipher.update(byte[], int, int)>
	//    9   17:astore_1        
		if(abyte0 != null && abyte0.length != 0) goto _L4; else goto _L3
	//   10   18:aload_1         
	//   11   19:ifnull          27
	//   12   22:aload_1         
	//   13   23:arraylength     
	//   14   24:ifne            28
_L3:
		return;
	//   15   27:return          
_L4:
		out.write(abyte0, 0, abyte0.length);
	//   16   28:aload_0         
	//   17   29:getfield        #35  <Field OutputStream out>
	//   18   32:aload_1         
	//   19   33:iconst_0        
	//   20   34:aload_1         
	//   21   35:arraylength     
	//   22   36:invokevirtual   #90  <Method void OutputStream.write(byte[], int, int)>
		return;
	//   23   39:return          
_L2:
		byte abyte1[] = new byte[Math.min(j, 4192)];
	//   24   40:iload_3         
	//   25   41:sipush          4192
	//   26   44:invokestatic    #105 <Method int Math.min(int, int)>
	//   27   47:newarray        byte[]
	//   28   49:astore          5
		while(j > 0) 
	//*  29   51:iload_3         
	//*  30   52:ifle            27
		{
			int k = Math.min(j, abyte1.length);
	//   31   55:iload_3         
	//   32   56:aload           5
	//   33   58:arraylength     
	//   34   59:invokestatic    #105 <Method int Math.min(int, int)>
	//   35   62:istore          4
			arcfour.encryptARCFOUR(abyte0, i, k, abyte1, 0);
	//   36   64:aload_0         
	//   37   65:getfield        #65  <Field ARCFOUREncryption arcfour>
	//   38   68:aload_1         
	//   39   69:iload_2         
	//   40   70:iload           4
	//   41   72:aload           5
	//   42   74:iconst_0        
	//   43   75:invokevirtual   #109 <Method void ARCFOUREncryption.encryptARCFOUR(byte[], int, int, byte[], int)>
			out.write(abyte1, 0, k);
	//   44   78:aload_0         
	//   45   79:getfield        #35  <Field OutputStream out>
	//   46   82:aload           5
	//   47   84:iconst_0        
	//   48   85:iload           4
	//   49   87:invokevirtual   #90  <Method void OutputStream.write(byte[], int, int)>
			j -= k;
	//   50   90:iload_3         
	//   51   91:iload           4
	//   52   93:isub            
	//   53   94:istore_3        
			i += k;
	//   54   95:iload_2         
	//   55   96:iload           4
	//   56   98:iadd            
	//   57   99:istore_2        
		}
		if(true) goto _L3; else goto _L5
	//   58  100:goto            51
_L5:
	}

	private static final int AES_128 = 4;
	private static final int AES_256 = 5;
	private boolean aes;
	protected ARCFOUREncryption arcfour;
	protected AESCipher cipher;
	private boolean finished;
	protected OutputStream out;
	private byte sb[];
}
