// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocWriter;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.exceptions.BadPasswordException;
import com.itextpdf.text.pdf.crypto.AESCipherCBCnoPad;
import com.itextpdf.text.pdf.crypto.ARCFOUREncryption;
import com.itextpdf.text.pdf.crypto.IVGenerator;
import java.io.*;
import java.security.MessageDigest;
import java.security.cert.Certificate;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfPublicKeySecurityHandler, ByteBuffer, PdfLiteral, PdfPublicKeyRecipient, 
//			StandardDecryption, OutputStreamEncryption, PdfDictionary, PdfName, 
//			PdfNumber, PdfBoolean, StringUtils, PdfObject

public class PdfEncryption
{

	public PdfEncryption()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #100 <Method void Object()>
		mkey = new byte[0];
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:newarray        byte[]
	//    5    8:putfield        #102 <Field byte[] mkey>
		ownerKey = new byte[32];
	//    6   11:aload_0         
	//    7   12:bipush          32
	//    8   14:newarray        byte[]
	//    9   16:putfield        #104 <Field byte[] ownerKey>
		userKey = new byte[32];
	//   10   19:aload_0         
	//   11   20:bipush          32
	//   12   22:newarray        byte[]
	//   13   24:putfield        #106 <Field byte[] userKey>
		publicKeyHandler = null;
	//   14   27:aload_0         
	//   15   28:aconst_null     
	//   16   29:putfield        #108 <Field PdfPublicKeySecurityHandler publicKeyHandler>
		extra = new byte[5];
	//   17   32:aload_0         
	//   18   33:iconst_5        
	//   19   34:newarray        byte[]
	//   20   36:putfield        #110 <Field byte[] extra>
		arcfour = new ARCFOUREncryption();
	//   21   39:aload_0         
	//   22   40:new             #112 <Class ARCFOUREncryption>
	//   23   43:dup             
	//   24   44:invokespecial   #113 <Method void ARCFOUREncryption()>
	//   25   47:putfield        #115 <Field ARCFOUREncryption arcfour>
		try
		{
			md5 = MessageDigest.getInstance("MD5");
	//   26   50:aload_0         
	//   27   51:ldc1            #117 <String "MD5">
	//   28   53:invokestatic    #123 <Method MessageDigest MessageDigest.getInstance(String)>
	//   29   56:putfield        #125 <Field MessageDigest md5>
		}
	//*  30   59:aload_0         
	//*  31   60:new             #127 <Class PdfPublicKeySecurityHandler>
	//*  32   63:dup             
	//*  33   64:invokespecial   #128 <Method void PdfPublicKeySecurityHandler()>
	//*  34   67:putfield        #108 <Field PdfPublicKeySecurityHandler publicKeyHandler>
	//*  35   70:return          
		catch(Exception exception)
	//*  36   71:astore_1        
		{
			throw new ExceptionConverter(exception);
	//   37   72:new             #130 <Class ExceptionConverter>
	//   38   75:dup             
	//   39   76:aload_1         
	//   40   77:invokespecial   #133 <Method void ExceptionConverter(Exception)>
	//   41   80:athrow          
		}
		publicKeyHandler = new PdfPublicKeySecurityHandler();
	}

	public PdfEncryption(PdfEncryption pdfencryption)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #135 <Method void PdfEncryption()>
		if(pdfencryption.key != null)
	//*   2    4:aload_1         
	//*   3    5:getfield        #137 <Field byte[] key>
	//*   4    8:ifnull          28
			key = (byte[])(byte[])((byte []) (pdfencryption.key)).clone();
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:getfield        #137 <Field byte[] key>
	//    8   16:invokevirtual   #142 <Method Object _5B_B.clone()>
	//    9   19:checkcast       #138 <Class byte[]>
	//   10   22:checkcast       #138 <Class byte[]>
	//   11   25:putfield        #137 <Field byte[] key>
		keySize = pdfencryption.keySize;
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:getfield        #144 <Field int keySize>
	//   15   33:putfield        #144 <Field int keySize>
		mkey = (byte[])(byte[])((byte []) (pdfencryption.mkey)).clone();
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:getfield        #102 <Field byte[] mkey>
	//   19   41:invokevirtual   #142 <Method Object _5B_B.clone()>
	//   20   44:checkcast       #138 <Class byte[]>
	//   21   47:checkcast       #138 <Class byte[]>
	//   22   50:putfield        #102 <Field byte[] mkey>
		ownerKey = (byte[])(byte[])((byte []) (pdfencryption.ownerKey)).clone();
	//   23   53:aload_0         
	//   24   54:aload_1         
	//   25   55:getfield        #104 <Field byte[] ownerKey>
	//   26   58:invokevirtual   #142 <Method Object _5B_B.clone()>
	//   27   61:checkcast       #138 <Class byte[]>
	//   28   64:checkcast       #138 <Class byte[]>
	//   29   67:putfield        #104 <Field byte[] ownerKey>
		userKey = (byte[])(byte[])((byte []) (pdfencryption.userKey)).clone();
	//   30   70:aload_0         
	//   31   71:aload_1         
	//   32   72:getfield        #106 <Field byte[] userKey>
	//   33   75:invokevirtual   #142 <Method Object _5B_B.clone()>
	//   34   78:checkcast       #138 <Class byte[]>
	//   35   81:checkcast       #138 <Class byte[]>
	//   36   84:putfield        #106 <Field byte[] userKey>
		permissions = pdfencryption.permissions;
	//   37   87:aload_0         
	//   38   88:aload_1         
	//   39   89:getfield        #146 <Field long permissions>
	//   40   92:putfield        #146 <Field long permissions>
		if(pdfencryption.documentID != null)
	//*  41   95:aload_1         
	//*  42   96:getfield        #148 <Field byte[] documentID>
	//*  43   99:ifnull          119
			documentID = (byte[])(byte[])((byte []) (pdfencryption.documentID)).clone();
	//   44  102:aload_0         
	//   45  103:aload_1         
	//   46  104:getfield        #148 <Field byte[] documentID>
	//   47  107:invokevirtual   #142 <Method Object _5B_B.clone()>
	//   48  110:checkcast       #138 <Class byte[]>
	//   49  113:checkcast       #138 <Class byte[]>
	//   50  116:putfield        #148 <Field byte[] documentID>
		revision = pdfencryption.revision;
	//   51  119:aload_0         
	//   52  120:aload_1         
	//   53  121:getfield        #150 <Field int revision>
	//   54  124:putfield        #150 <Field int revision>
		keyLength = pdfencryption.keyLength;
	//   55  127:aload_0         
	//   56  128:aload_1         
	//   57  129:getfield        #152 <Field int keyLength>
	//   58  132:putfield        #152 <Field int keyLength>
		encryptMetadata = pdfencryption.encryptMetadata;
	//   59  135:aload_0         
	//   60  136:aload_1         
	//   61  137:getfield        #154 <Field boolean encryptMetadata>
	//   62  140:putfield        #154 <Field boolean encryptMetadata>
		embeddedFilesOnly = pdfencryption.embeddedFilesOnly;
	//   63  143:aload_0         
	//   64  144:aload_1         
	//   65  145:getfield        #156 <Field boolean embeddedFilesOnly>
	//   66  148:putfield        #156 <Field boolean embeddedFilesOnly>
		publicKeyHandler = pdfencryption.publicKeyHandler;
	//   67  151:aload_0         
	//   68  152:aload_1         
	//   69  153:getfield        #108 <Field PdfPublicKeySecurityHandler publicKeyHandler>
	//   70  156:putfield        #108 <Field PdfPublicKeySecurityHandler publicKeyHandler>
		if(pdfencryption.ueKey != null)
	//*  71  159:aload_1         
	//*  72  160:getfield        #158 <Field byte[] ueKey>
	//*  73  163:ifnull          180
			ueKey = (byte[])((byte []) (pdfencryption.ueKey)).clone();
	//   74  166:aload_0         
	//   75  167:aload_1         
	//   76  168:getfield        #158 <Field byte[] ueKey>
	//   77  171:invokevirtual   #142 <Method Object _5B_B.clone()>
	//   78  174:checkcast       #138 <Class byte[]>
	//   79  177:putfield        #158 <Field byte[] ueKey>
		if(pdfencryption.oeKey != null)
	//*  80  180:aload_1         
	//*  81  181:getfield        #160 <Field byte[] oeKey>
	//*  82  184:ifnull          201
			oeKey = (byte[])((byte []) (pdfencryption.oeKey)).clone();
	//   83  187:aload_0         
	//   84  188:aload_1         
	//   85  189:getfield        #160 <Field byte[] oeKey>
	//   86  192:invokevirtual   #142 <Method Object _5B_B.clone()>
	//   87  195:checkcast       #138 <Class byte[]>
	//   88  198:putfield        #160 <Field byte[] oeKey>
		if(pdfencryption.perms != null)
	//*  89  201:aload_1         
	//*  90  202:getfield        #162 <Field byte[] perms>
	//*  91  205:ifnull          222
			perms = (byte[])((byte []) (pdfencryption.perms)).clone();
	//   92  208:aload_0         
	//   93  209:aload_1         
	//   94  210:getfield        #162 <Field byte[] perms>
	//   95  213:invokevirtual   #142 <Method Object _5B_B.clone()>
	//   96  216:checkcast       #138 <Class byte[]>
	//   97  219:putfield        #162 <Field byte[] perms>
	//   98  222:return          
	}

	private static boolean compareArray(byte abyte0[], byte abyte1[], int i)
	{
		for(int j = 0; j < i; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:iload_2         
	//*   4    4:icmpge          25
			if(abyte0[j] != abyte1[j])
	//*   5    7:aload_0         
	//*   6    8:iload_3         
	//*   7    9:baload          
	//*   8   10:aload_1         
	//*   9   11:iload_3         
	//*  10   12:baload          
	//*  11   13:icmpeq          18
				return false;
	//   12   16:iconst_0        
	//   13   17:ireturn         

	//   14   18:iload_3         
	//   15   19:iconst_1        
	//   16   20:iadd            
	//   17   21:istore_3        
	//*  18   22:goto            2
		return true;
	//   19   25:iconst_1        
	//   20   26:ireturn         
	}

	private byte[] computeOwnerKey(byte abyte0[], byte abyte1[])
	{
		byte abyte2[] = new byte[32];
	//    0    0:bipush          32
	//    1    2:newarray        byte[]
	//    2    4:astore          5
		abyte1 = md5.digest(abyte1);
	//    3    6:aload_0         
	//    4    7:getfield        #125 <Field MessageDigest md5>
	//    5   10:aload_2         
	//    6   11:invokevirtual   #170 <Method byte[] MessageDigest.digest(byte[])>
	//    7   14:astore_2        
		if(revision == 3 || revision == 4)
	//*   8   15:aload_0         
	//*   9   16:getfield        #150 <Field int revision>
	//*  10   19:iconst_3        
	//*  11   20:icmpeq          31
	//*  12   23:aload_0         
	//*  13   24:getfield        #150 <Field int revision>
	//*  14   27:iconst_4        
	//*  15   28:icmpne          160
		{
			byte abyte3[] = new byte[keyLength / 8];
	//   16   31:aload_0         
	//   17   32:getfield        #152 <Field int keyLength>
	//   18   35:bipush          8
	//   19   37:idiv            
	//   20   38:newarray        byte[]
	//   21   40:astore          6
			for(int i = 0; i < 50; i++)
	//*  22   42:iconst_0        
	//*  23   43:istore_3        
	//*  24   44:iload_3         
	//*  25   45:bipush          50
	//*  26   47:icmpge          85
			{
				md5.update(abyte1, 0, abyte3.length);
	//   27   50:aload_0         
	//   28   51:getfield        #125 <Field MessageDigest md5>
	//   29   54:aload_2         
	//   30   55:iconst_0        
	//   31   56:aload           6
	//   32   58:arraylength     
	//   33   59:invokevirtual   #174 <Method void MessageDigest.update(byte[], int, int)>
				System.arraycopy(((Object) (md5.digest())), 0, ((Object) (abyte1)), 0, abyte3.length);
	//   34   62:aload_0         
	//   35   63:getfield        #125 <Field MessageDigest md5>
	//   36   66:invokevirtual   #177 <Method byte[] MessageDigest.digest()>
	//   37   69:iconst_0        
	//   38   70:aload_2         
	//   39   71:iconst_0        
	//   40   72:aload           6
	//   41   74:arraylength     
	//   42   75:invokestatic    #181 <Method void System.arraycopy(Object, int, Object, int, int)>
			}

	//   43   78:iload_3         
	//   44   79:iconst_1        
	//   45   80:iadd            
	//   46   81:istore_3        
	//*  47   82:goto            44
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte2)), 0, 32);
	//   48   85:aload_1         
	//   49   86:iconst_0        
	//   50   87:aload           5
	//   51   89:iconst_0        
	//   52   90:bipush          32
	//   53   92:invokestatic    #181 <Method void System.arraycopy(Object, int, Object, int, int)>
			for(int j = 0; j < 20; j++)
	//*  54   95:iconst_0        
	//*  55   96:istore_3        
	//*  56   97:iload_3         
	//*  57   98:bipush          20
	//*  58  100:icmpge          180
			{
				for(int k = 0; k < abyte3.length; k++)
	//*  59  103:iconst_0        
	//*  60  104:istore          4
	//*  61  106:iload           4
	//*  62  108:aload           6
	//*  63  110:arraylength     
	//*  64  111:icmpge          135
					abyte3[k] = (byte)(abyte1[k] ^ j);
	//   65  114:aload           6
	//   66  116:iload           4
	//   67  118:aload_2         
	//   68  119:iload           4
	//   69  121:baload          
	//   70  122:iload_3         
	//   71  123:ixor            
	//   72  124:int2byte        
	//   73  125:bastore         

	//   74  126:iload           4
	//   75  128:iconst_1        
	//   76  129:iadd            
	//   77  130:istore          4
	//*  78  132:goto            106
				arcfour.prepareARCFOURKey(abyte3);
	//   79  135:aload_0         
	//   80  136:getfield        #115 <Field ARCFOUREncryption arcfour>
	//   81  139:aload           6
	//   82  141:invokevirtual   #185 <Method void ARCFOUREncryption.prepareARCFOURKey(byte[])>
				arcfour.encryptARCFOUR(abyte2);
	//   83  144:aload_0         
	//   84  145:getfield        #115 <Field ARCFOUREncryption arcfour>
	//   85  148:aload           5
	//   86  150:invokevirtual   #188 <Method void ARCFOUREncryption.encryptARCFOUR(byte[])>
			}

	//   87  153:iload_3         
	//   88  154:iconst_1        
	//   89  155:iadd            
	//   90  156:istore_3        
		} else
	//*  91  157:goto            97
		{
			arcfour.prepareARCFOURKey(abyte1, 0, 5);
	//   92  160:aload_0         
	//   93  161:getfield        #115 <Field ARCFOUREncryption arcfour>
	//   94  164:aload_2         
	//   95  165:iconst_0        
	//   96  166:iconst_5        
	//   97  167:invokevirtual   #190 <Method void ARCFOUREncryption.prepareARCFOURKey(byte[], int, int)>
			arcfour.encryptARCFOUR(abyte0, abyte2);
	//   98  170:aload_0         
	//   99  171:getfield        #115 <Field ARCFOUREncryption arcfour>
	//  100  174:aload_1         
	//  101  175:aload           5
	//  102  177:invokevirtual   #193 <Method void ARCFOUREncryption.encryptARCFOUR(byte[], byte[])>
		}
		return abyte2;
	//  103  180:aload           5
	//  104  182:areturn         
	}

	public static byte[] createDocumentId()
	{
		long l;
		long l1;
		MessageDigest messagedigest;
		StringBuilder stringbuilder;
		try
		{
			messagedigest = MessageDigest.getInstance("MD5");
	//    0    0:ldc1            #117 <String "MD5">
	//    1    2:invokestatic    #123 <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    5:astore          4
		}
	//*   3    7:invokestatic    #92  <Method long System.currentTimeMillis()>
	//*   4   10:lstore_0        
	//*   5   11:invokestatic    #200 <Method Runtime Runtime.getRuntime()>
	//*   6   14:invokevirtual   #203 <Method long Runtime.freeMemory()>
	//*   7   17:lstore_2        
	//*   8   18:new             #205 <Class StringBuilder>
	//*   9   21:dup             
	//*  10   22:invokespecial   #206 <Method void StringBuilder()>
	//*  11   25:lload_0         
	//*  12   26:invokevirtual   #210 <Method StringBuilder StringBuilder.append(long)>
	//*  13   29:ldc1            #212 <String "+">
	//*  14   31:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
	//*  15   34:lload_2         
	//*  16   35:invokevirtual   #210 <Method StringBuilder StringBuilder.append(long)>
	//*  17   38:ldc1            #212 <String "+">
	//*  18   40:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
	//*  19   43:astore          5
	//*  20   45:getstatic       #94  <Field long seq>
	//*  21   48:lstore_0        
	//*  22   49:lconst_1        
	//*  23   50:lload_0         
	//*  24   51:ladd            
	//*  25   52:putstatic       #94  <Field long seq>
	//*  26   55:aload           4
	//*  27   57:aload           5
	//*  28   59:lload_0         
	//*  29   60:invokevirtual   #210 <Method StringBuilder StringBuilder.append(long)>
	//*  30   63:invokevirtual   #219 <Method String StringBuilder.toString()>
	//*  31   66:invokevirtual   #224 <Method byte[] String.getBytes()>
	//*  32   69:invokevirtual   #170 <Method byte[] MessageDigest.digest(byte[])>
	//*  33   72:areturn         
		catch(Exception exception)
	//*  34   73:astore          4
		{
			throw new ExceptionConverter(exception);
	//   35   75:new             #130 <Class ExceptionConverter>
	//   36   78:dup             
	//   37   79:aload           4
	//   38   81:invokespecial   #133 <Method void ExceptionConverter(Exception)>
	//   39   84:athrow          
		}
		l = System.currentTimeMillis();
		l1 = Runtime.getRuntime().freeMemory();
		stringbuilder = (new StringBuilder()).append(l).append("+").append(l1).append("+");
		l = seq;
		seq = 1L + l;
		return messagedigest.digest(stringbuilder.append(l).toString().getBytes());
	}

	public static PdfObject createInfoId(byte abyte0[], boolean flag)
		throws IOException
	{
		ByteBuffer bytebuffer = new ByteBuffer(90);
	//    0    0:new             #230 <Class ByteBuffer>
	//    1    3:dup             
	//    2    4:bipush          90
	//    3    6:invokespecial   #233 <Method void ByteBuffer(int)>
	//    4    9:astore          4
		byte abyte1[] = abyte0;
	//    5   11:aload_0         
	//    6   12:astore_3        
		if(abyte0.length == 0)
	//*   7   13:aload_0         
	//*   8   14:arraylength     
	//*   9   15:ifne            22
			abyte1 = createDocumentId();
	//   10   18:invokestatic    #235 <Method byte[] createDocumentId()>
	//   11   21:astore_3        
		bytebuffer.append('[').append('<');
	//   12   22:aload           4
	//   13   24:bipush          91
	//   14   26:invokevirtual   #238 <Method ByteBuffer ByteBuffer.append(char)>
	//   15   29:bipush          60
	//   16   31:invokevirtual   #238 <Method ByteBuffer ByteBuffer.append(char)>
	//   17   34:pop             
		for(int i = 0; i < abyte1.length; i++)
	//*  18   35:iconst_0        
	//*  19   36:istore_2        
	//*  20   37:iload_2         
	//*  21   38:aload_3         
	//*  22   39:arraylength     
	//*  23   40:icmpge          59
			bytebuffer.appendHex(abyte1[i]);
	//   24   43:aload           4
	//   25   45:aload_3         
	//   26   46:iload_2         
	//   27   47:baload          
	//   28   48:invokevirtual   #242 <Method ByteBuffer ByteBuffer.appendHex(byte)>
	//   29   51:pop             

	//   30   52:iload_2         
	//   31   53:iconst_1        
	//   32   54:iadd            
	//   33   55:istore_2        
	//*  34   56:goto            37
		bytebuffer.append('>').append('<');
	//   35   59:aload           4
	//   36   61:bipush          62
	//   37   63:invokevirtual   #238 <Method ByteBuffer ByteBuffer.append(char)>
	//   38   66:bipush          60
	//   39   68:invokevirtual   #238 <Method ByteBuffer ByteBuffer.append(char)>
	//   40   71:pop             
		if(flag)
	//*  41   72:iload_1         
	//*  42   73:ifeq            80
			abyte1 = createDocumentId();
	//   43   76:invokestatic    #235 <Method byte[] createDocumentId()>
	//   44   79:astore_3        
		for(int j = 0; j < abyte1.length; j++)
	//*  45   80:iconst_0        
	//*  46   81:istore_2        
	//*  47   82:iload_2         
	//*  48   83:aload_3         
	//*  49   84:arraylength     
	//*  50   85:icmpge          104
			bytebuffer.appendHex(abyte1[j]);
	//   51   88:aload           4
	//   52   90:aload_3         
	//   53   91:iload_2         
	//   54   92:baload          
	//   55   93:invokevirtual   #242 <Method ByteBuffer ByteBuffer.appendHex(byte)>
	//   56   96:pop             

	//   57   97:iload_2         
	//   58   98:iconst_1        
	//   59   99:iadd            
	//   60  100:istore_2        
	//*  61  101:goto            82
		bytebuffer.append('>').append(']');
	//   62  104:aload           4
	//   63  106:bipush          62
	//   64  108:invokevirtual   #238 <Method ByteBuffer ByteBuffer.append(char)>
	//   65  111:bipush          93
	//   66  113:invokevirtual   #238 <Method ByteBuffer ByteBuffer.append(char)>
	//   67  116:pop             
		bytebuffer.close();
	//   68  117:aload           4
	//   69  119:invokevirtual   #245 <Method void ByteBuffer.close()>
		return ((PdfObject) (new PdfLiteral(bytebuffer.toByteArray())));
	//   70  122:new             #247 <Class PdfLiteral>
	//   71  125:dup             
	//   72  126:aload           4
	//   73  128:invokevirtual   #250 <Method byte[] ByteBuffer.toByteArray()>
	//   74  131:invokespecial   #252 <Method void PdfLiteral(byte[])>
	//   75  134:areturn         
	}

	private byte[] padPassword(byte abyte0[])
	{
		byte abyte1[] = new byte[32];
	//    0    0:bipush          32
	//    1    2:newarray        byte[]
	//    2    4:astore_2        
		if(abyte0 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       22
		{
			System.arraycopy(((Object) (pad)), 0, ((Object) (abyte1)), 0, 32);
	//    5    9:getstatic       #79  <Field byte[] pad>
	//    6   12:iconst_0        
	//    7   13:aload_2         
	//    8   14:iconst_0        
	//    9   15:bipush          32
	//   10   17:invokestatic    #181 <Method void System.arraycopy(Object, int, Object, int, int)>
		} else
	//*  11   20:aload_2         
	//*  12   21:areturn         
		{
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, Math.min(abyte0.length, 32));
	//   13   22:aload_1         
	//   14   23:iconst_0        
	//   15   24:aload_2         
	//   16   25:iconst_0        
	//   17   26:aload_1         
	//   18   27:arraylength     
	//   19   28:bipush          32
	//   20   30:invokestatic    #260 <Method int Math.min(int, int)>
	//   21   33:invokestatic    #181 <Method void System.arraycopy(Object, int, Object, int, int)>
			if(abyte0.length < 32)
	//*  22   36:aload_1         
	//*  23   37:arraylength     
	//*  24   38:bipush          32
	//*  25   40:icmpge          20
			{
				System.arraycopy(((Object) (pad)), 0, ((Object) (abyte1)), abyte0.length, 32 - abyte0.length);
	//   26   43:getstatic       #79  <Field byte[] pad>
	//   27   46:iconst_0        
	//   28   47:aload_2         
	//   29   48:aload_1         
	//   30   49:arraylength     
	//   31   50:bipush          32
	//   32   52:aload_1         
	//   33   53:arraylength     
	//   34   54:isub            
	//   35   55:invokestatic    #181 <Method void System.arraycopy(Object, int, Object, int, int)>
				return abyte1;
	//   36   58:aload_2         
	//   37   59:areturn         
			}
		}
		return abyte1;
	}

	private void setupByOwnerPad(byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[], long l)
	{
		setupGlobalEncryptionKey(abyte0, computeOwnerKey(abyte3, abyte1), abyte3, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload           4
	//    4    5:aload_2         
	//    5    6:invokespecial   #264 <Method byte[] computeOwnerKey(byte[], byte[])>
	//    6    9:aload           4
	//    7   11:lload           5
	//    8   13:invokespecial   #268 <Method void setupGlobalEncryptionKey(byte[], byte[], byte[], long)>
		setupUserKey();
	//    9   16:aload_0         
	//   10   17:invokespecial   #271 <Method void setupUserKey()>
	//   11   20:return          
	}

	private void setupByUserPad(byte abyte0[], byte abyte1[], byte abyte2[], long l)
	{
		setupGlobalEncryptionKey(abyte0, abyte1, abyte2, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:lload           4
	//    5    6:invokespecial   #268 <Method void setupGlobalEncryptionKey(byte[], byte[], byte[], long)>
		setupUserKey();
	//    6    9:aload_0         
	//    7   10:invokespecial   #271 <Method void setupUserKey()>
	//    8   13:return          
	}

	private void setupGlobalEncryptionKey(byte abyte0[], byte abyte1[], byte abyte2[], long l)
	{
		documentID = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #148 <Field byte[] documentID>
		ownerKey = abyte2;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #104 <Field byte[] ownerKey>
		permissions = l;
	//    6   10:aload_0         
	//    7   11:lload           4
	//    8   13:putfield        #146 <Field long permissions>
		mkey = new byte[keyLength / 8];
	//    9   16:aload_0         
	//   10   17:aload_0         
	//   11   18:getfield        #152 <Field int keyLength>
	//   12   21:bipush          8
	//   13   23:idiv            
	//   14   24:newarray        byte[]
	//   15   26:putfield        #102 <Field byte[] mkey>
		md5.reset();
	//   16   29:aload_0         
	//   17   30:getfield        #125 <Field MessageDigest md5>
	//   18   33:invokevirtual   #275 <Method void MessageDigest.reset()>
		md5.update(abyte1);
	//   19   36:aload_0         
	//   20   37:getfield        #125 <Field MessageDigest md5>
	//   21   40:aload_2         
	//   22   41:invokevirtual   #277 <Method void MessageDigest.update(byte[])>
		md5.update(abyte2);
	//   23   44:aload_0         
	//   24   45:getfield        #125 <Field MessageDigest md5>
	//   25   48:aload_3         
	//   26   49:invokevirtual   #277 <Method void MessageDigest.update(byte[])>
		byte byte0 = (byte)(int)l;
	//   27   52:lload           4
	//   28   54:l2i             
	//   29   55:int2byte        
	//   30   56:istore          6
		byte byte1 = (byte)(int)(l >> 8);
	//   31   58:lload           4
	//   32   60:bipush          8
	//   33   62:lshr            
	//   34   63:l2i             
	//   35   64:int2byte        
	//   36   65:istore          7
		byte byte2 = (byte)(int)(l >> 16);
	//   37   67:lload           4
	//   38   69:bipush          16
	//   39   71:lshr            
	//   40   72:l2i             
	//   41   73:int2byte        
	//   42   74:istore          8
		byte byte3 = (byte)(int)(l >> 24);
	//   43   76:lload           4
	//   44   78:bipush          24
	//   45   80:lshr            
	//   46   81:l2i             
	//   47   82:int2byte        
	//   48   83:istore          9
		md5.update(new byte[] {
			byte0, byte1, byte2, byte3
		}, 0, 4);
	//   49   85:aload_0         
	//   50   86:getfield        #125 <Field MessageDigest md5>
	//   51   89:iconst_4        
	//   52   90:newarray        byte[]
	//   53   92:dup             
	//   54   93:iconst_0        
	//   55   94:iload           6
	//   56   96:bastore         
	//   57   97:dup             
	//   58   98:iconst_1        
	//   59   99:iload           7
	//   60  101:bastore         
	//   61  102:dup             
	//   62  103:iconst_2        
	//   63  104:iload           8
	//   64  106:bastore         
	//   65  107:dup             
	//   66  108:iconst_3        
	//   67  109:iload           9
	//   68  111:bastore         
	//   69  112:iconst_0        
	//   70  113:iconst_4        
	//   71  114:invokevirtual   #174 <Method void MessageDigest.update(byte[], int, int)>
		if(abyte0 != null)
	//*  72  117:aload_1         
	//*  73  118:ifnull          129
			md5.update(abyte0);
	//   74  121:aload_0         
	//   75  122:getfield        #125 <Field MessageDigest md5>
	//   76  125:aload_1         
	//   77  126:invokevirtual   #277 <Method void MessageDigest.update(byte[])>
		if(!encryptMetadata)
	//*  78  129:aload_0         
	//*  79  130:getfield        #154 <Field boolean encryptMetadata>
	//*  80  133:ifne            146
			md5.update(metadataPad);
	//   81  136:aload_0         
	//   82  137:getfield        #125 <Field MessageDigest md5>
	//   83  140:getstatic       #86  <Field byte[] metadataPad>
	//   84  143:invokevirtual   #277 <Method void MessageDigest.update(byte[])>
		abyte0 = new byte[mkey.length];
	//   85  146:aload_0         
	//   86  147:getfield        #102 <Field byte[] mkey>
	//   87  150:arraylength     
	//   88  151:newarray        byte[]
	//   89  153:astore_1        
		System.arraycopy(((Object) (md5.digest())), 0, ((Object) (abyte0)), 0, mkey.length);
	//   90  154:aload_0         
	//   91  155:getfield        #125 <Field MessageDigest md5>
	//   92  158:invokevirtual   #177 <Method byte[] MessageDigest.digest()>
	//   93  161:iconst_0        
	//   94  162:aload_1         
	//   95  163:iconst_0        
	//   96  164:aload_0         
	//   97  165:getfield        #102 <Field byte[] mkey>
	//   98  168:arraylength     
	//   99  169:invokestatic    #181 <Method void System.arraycopy(Object, int, Object, int, int)>
		if(revision == 3 || revision == 4)
	//* 100  172:aload_0         
	//* 101  173:getfield        #150 <Field int revision>
	//* 102  176:iconst_3        
	//* 103  177:icmpeq          188
	//* 104  180:aload_0         
	//* 105  181:getfield        #150 <Field int revision>
	//* 106  184:iconst_4        
	//* 107  185:icmpne          226
		{
			for(int i = 0; i < 50; i++)
	//* 108  188:iconst_0        
	//* 109  189:istore          10
	//* 110  191:iload           10
	//* 111  193:bipush          50
	//* 112  195:icmpge          226
				System.arraycopy(((Object) (md5.digest(abyte0))), 0, ((Object) (abyte0)), 0, mkey.length);
	//  113  198:aload_0         
	//  114  199:getfield        #125 <Field MessageDigest md5>
	//  115  202:aload_1         
	//  116  203:invokevirtual   #170 <Method byte[] MessageDigest.digest(byte[])>
	//  117  206:iconst_0        
	//  118  207:aload_1         
	//  119  208:iconst_0        
	//  120  209:aload_0         
	//  121  210:getfield        #102 <Field byte[] mkey>
	//  122  213:arraylength     
	//  123  214:invokestatic    #181 <Method void System.arraycopy(Object, int, Object, int, int)>

	//  124  217:iload           10
	//  125  219:iconst_1        
	//  126  220:iadd            
	//  127  221:istore          10
		}
	//* 128  223:goto            191
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (mkey)), 0, mkey.length);
	//  129  226:aload_1         
	//  130  227:iconst_0        
	//  131  228:aload_0         
	//  132  229:getfield        #102 <Field byte[] mkey>
	//  133  232:iconst_0        
	//  134  233:aload_0         
	//  135  234:getfield        #102 <Field byte[] mkey>
	//  136  237:arraylength     
	//  137  238:invokestatic    #181 <Method void System.arraycopy(Object, int, Object, int, int)>
	//  138  241:return          
	}

	private void setupUserKey()
	{
		if(revision == 3 || revision == 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field int revision>
	//*   2    4:iconst_3        
	//*   3    5:icmpeq          16
	//*   4    8:aload_0         
	//*   5    9:getfield        #150 <Field int revision>
	//*   6   12:iconst_4        
	//*   7   13:icmpne          146
		{
			md5.update(pad);
	//    8   16:aload_0         
	//    9   17:getfield        #125 <Field MessageDigest md5>
	//   10   20:getstatic       #79  <Field byte[] pad>
	//   11   23:invokevirtual   #277 <Method void MessageDigest.update(byte[])>
			byte abyte0[] = md5.digest(documentID);
	//   12   26:aload_0         
	//   13   27:getfield        #125 <Field MessageDigest md5>
	//   14   30:aload_0         
	//   15   31:getfield        #148 <Field byte[] documentID>
	//   16   34:invokevirtual   #170 <Method byte[] MessageDigest.digest(byte[])>
	//   17   37:astore_3        
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (userKey)), 0, 16);
	//   18   38:aload_3         
	//   19   39:iconst_0        
	//   20   40:aload_0         
	//   21   41:getfield        #106 <Field byte[] userKey>
	//   22   44:iconst_0        
	//   23   45:bipush          16
	//   24   47:invokestatic    #181 <Method void System.arraycopy(Object, int, Object, int, int)>
			for(int i = 16; i < 32; i++)
	//*  25   50:bipush          16
	//*  26   52:istore_1        
	//*  27   53:iload_1         
	//*  28   54:bipush          32
	//*  29   56:icmpge          73
				userKey[i] = 0;
	//   30   59:aload_0         
	//   31   60:getfield        #106 <Field byte[] userKey>
	//   32   63:iload_1         
	//   33   64:iconst_0        
	//   34   65:bastore         

	//   35   66:iload_1         
	//   36   67:iconst_1        
	//   37   68:iadd            
	//   38   69:istore_1        
	//*  39   70:goto            53
			for(int j = 0; j < 20; j++)
	//*  40   73:iconst_0        
	//*  41   74:istore_1        
	//*  42   75:iload_1         
	//*  43   76:bipush          20
	//*  44   78:icmpge          171
			{
				for(int k = 0; k < mkey.length; k++)
	//*  45   81:iconst_0        
	//*  46   82:istore_2        
	//*  47   83:iload_2         
	//*  48   84:aload_0         
	//*  49   85:getfield        #102 <Field byte[] mkey>
	//*  50   88:arraylength     
	//*  51   89:icmpge          111
					abyte0[k] = (byte)(mkey[k] ^ j);
	//   52   92:aload_3         
	//   53   93:iload_2         
	//   54   94:aload_0         
	//   55   95:getfield        #102 <Field byte[] mkey>
	//   56   98:iload_2         
	//   57   99:baload          
	//   58  100:iload_1         
	//   59  101:ixor            
	//   60  102:int2byte        
	//   61  103:bastore         

	//   62  104:iload_2         
	//   63  105:iconst_1        
	//   64  106:iadd            
	//   65  107:istore_2        
	//*  66  108:goto            83
				arcfour.prepareARCFOURKey(abyte0, 0, mkey.length);
	//   67  111:aload_0         
	//   68  112:getfield        #115 <Field ARCFOUREncryption arcfour>
	//   69  115:aload_3         
	//   70  116:iconst_0        
	//   71  117:aload_0         
	//   72  118:getfield        #102 <Field byte[] mkey>
	//   73  121:arraylength     
	//   74  122:invokevirtual   #190 <Method void ARCFOUREncryption.prepareARCFOURKey(byte[], int, int)>
				arcfour.encryptARCFOUR(userKey, 0, 16);
	//   75  125:aload_0         
	//   76  126:getfield        #115 <Field ARCFOUREncryption arcfour>
	//   77  129:aload_0         
	//   78  130:getfield        #106 <Field byte[] userKey>
	//   79  133:iconst_0        
	//   80  134:bipush          16
	//   81  136:invokevirtual   #279 <Method void ARCFOUREncryption.encryptARCFOUR(byte[], int, int)>
			}

	//   82  139:iload_1         
	//   83  140:iconst_1        
	//   84  141:iadd            
	//   85  142:istore_1        
		} else
	//*  86  143:goto            75
		{
			arcfour.prepareARCFOURKey(mkey);
	//   87  146:aload_0         
	//   88  147:getfield        #115 <Field ARCFOUREncryption arcfour>
	//   89  150:aload_0         
	//   90  151:getfield        #102 <Field byte[] mkey>
	//   91  154:invokevirtual   #185 <Method void ARCFOUREncryption.prepareARCFOURKey(byte[])>
			arcfour.encryptARCFOUR(pad, userKey);
	//   92  157:aload_0         
	//   93  158:getfield        #115 <Field ARCFOUREncryption arcfour>
	//   94  161:getstatic       #79  <Field byte[] pad>
	//   95  164:aload_0         
	//   96  165:getfield        #106 <Field byte[] userKey>
	//   97  168:invokevirtual   #193 <Method void ARCFOUREncryption.encryptARCFOUR(byte[], byte[])>
		}
	//   98  171:return          
	}

	public void addRecipient(Certificate certificate, int i)
	{
		documentID = createDocumentId();
	//    0    0:aload_0         
	//    1    1:invokestatic    #235 <Method byte[] createDocumentId()>
	//    2    4:putfield        #148 <Field byte[] documentID>
		publicKeyHandler.addRecipient(new PdfPublicKeyRecipient(certificate, i));
	//    3    7:aload_0         
	//    4    8:getfield        #108 <Field PdfPublicKeySecurityHandler publicKeyHandler>
	//    5   11:new             #283 <Class PdfPublicKeyRecipient>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:iload_2         
	//    9   17:invokespecial   #285 <Method void PdfPublicKeyRecipient(Certificate, int)>
	//   10   20:invokevirtual   #288 <Method void PdfPublicKeySecurityHandler.addRecipient(PdfPublicKeyRecipient)>
	//   11   23:return          
	}

	public int calculateStreamSize(int i)
	{
		int j;
label0:
		{
			if(revision != 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field int revision>
	//*   2    4:iconst_4        
	//*   3    5:icmpeq          18
			{
				j = i;
	//    4    8:iload_1         
	//    5    9:istore_2        
				if(revision != 5)
					break label0;
	//    6   10:aload_0         
	//    7   11:getfield        #150 <Field int revision>
	//    8   14:iconst_5        
	//    9   15:icmpne          27
			}
			j = (0x7ffffff0 & i) + 32;
	//   10   18:ldc2            #291 <Int 0x7ffffff0>
	//   11   21:iload_1         
	//   12   22:iand            
	//   13   23:bipush          32
	//   14   25:iadd            
	//   15   26:istore_2        
		}
		return j;
	//   16   27:iload_2         
	//   17   28:ireturn         
	}

	public byte[] computeUserPassword(byte abyte0[])
	{
		byte abyte1[];
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		abyte1 = ((byte []) (obj));
	//    2    3:aload           7
	//    3    5:astore          6
		if(publicKeyHandler.getRecipientsSize() != 0) goto _L2; else goto _L1
	//    4    7:aload_0         
	//    5    8:getfield        #108 <Field PdfPublicKeySecurityHandler publicKeyHandler>
	//    6   11:invokevirtual   #296 <Method int PdfPublicKeySecurityHandler.getRecipientsSize()>
	//    7   14:ifne            135
_L1:
		abyte1 = ((byte []) (obj));
	//    8   17:aload           7
	//    9   19:astore          6
		if(2 > revision) goto _L2; else goto _L3
	//   10   21:iconst_2        
	//   11   22:aload_0         
	//   12   23:getfield        #150 <Field int revision>
	//   13   26:icmpgt          135
_L3:
		abyte1 = ((byte []) (obj));
	//   14   29:aload           7
	//   15   31:astore          6
		if(revision > 4) goto _L2; else goto _L4
	//   16   33:aload_0         
	//   17   34:getfield        #150 <Field int revision>
	//   18   37:iconst_4        
	//   19   38:icmpgt          135
_L4:
		int i;
		abyte0 = computeOwnerKey(ownerKey, padPassword(abyte0));
	//   20   41:aload_0         
	//   21   42:aload_0         
	//   22   43:getfield        #104 <Field byte[] ownerKey>
	//   23   46:aload_0         
	//   24   47:aload_1         
	//   25   48:invokespecial   #298 <Method byte[] padPassword(byte[])>
	//   26   51:invokespecial   #264 <Method byte[] computeOwnerKey(byte[], byte[])>
	//   27   54:astore_1        
		i = 0;
	//   28   55:iconst_0        
	//   29   56:istore_2        
_L6:
		abyte1 = abyte0;
	//   30   57:aload_1         
	//   31   58:astore          6
		if(i < abyte0.length)
	//*  32   60:iload_2         
	//*  33   61:aload_1         
	//*  34   62:arraylength     
	//*  35   63:icmpge          135
		{
			boolean flag1 = true;
	//   36   66:iconst_1        
	//   37   67:istore          5
			int j = 0;
	//   38   69:iconst_0        
	//   39   70:istore_3        
			do
			{
label0:
				{
					boolean flag = flag1;
	//   40   71:iload           5
	//   41   73:istore          4
					if(j < abyte0.length - i)
	//*  42   75:iload_3         
	//*  43   76:aload_1         
	//*  44   77:arraylength     
	//*  45   78:iload_2         
	//*  46   79:isub            
	//*  47   80:icmpge          99
					{
						if(abyte0[i + j] == pad[j])
							break label0;
	//   48   83:aload_1         
	//   49   84:iload_2         
	//   50   85:iload_3         
	//   51   86:iadd            
	//   52   87:baload          
	//   53   88:getstatic       #79  <Field byte[] pad>
	//   54   91:iload_3         
	//   55   92:baload          
	//   56   93:icmpeq          111
						flag = false;
	//   57   96:iconst_0        
	//   58   97:istore          4
					}
					if(!flag)
	//*  59   99:iload           4
	//*  60  101:ifne            118
					{
						i++;
	//   61  104:iload_2         
	//   62  105:iconst_1        
	//   63  106:iadd            
	//   64  107:istore_2        
					} else
	//*  65  108:goto            57
	//*  66  111:iload_3         
	//*  67  112:iconst_1        
	//*  68  113:iadd            
	//*  69  114:istore_3        
	//*  70  115:goto            71
					{
						abyte1 = new byte[i];
	//   71  118:iload_2         
	//   72  119:newarray        byte[]
	//   73  121:astore          6
						System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, i);
	//   74  123:aload_1         
	//   75  124:iconst_0        
	//   76  125:aload           6
	//   77  127:iconst_0        
	//   78  128:iload_2         
	//   79  129:invokestatic    #181 <Method void System.arraycopy(Object, int, Object, int, int)>
						return abyte1;
	//   80  132:aload           6
	//   81  134:areturn         
					}
					continue; /* Loop/switch isn't completed */
				}
				j++;
			} while(true);
		}
_L2:
		return abyte1;
	//   82  135:aload           6
	//   83  137:areturn         
		if(true) goto _L6; else goto _L5
_L5:
	}

	public byte[] decryptByteArray(byte abyte0[])
	{
		ByteArrayOutputStream bytearrayoutputstream;
		StandardDecryption standarddecryption;
		try
		{
			bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #301 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #302 <Method void ByteArrayOutputStream()>
	//    3    7:astore_2        
			standarddecryption = getDecryptor();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #306 <Method StandardDecryption getDecryptor()>
	//    6   12:astore_3        
			abyte0 = standarddecryption.update(abyte0, 0, abyte0.length);
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:iconst_0        
	//   10   16:aload_1         
	//   11   17:arraylength     
	//   12   18:invokevirtual   #311 <Method byte[] StandardDecryption.update(byte[], int, int)>
	//   13   21:astore_1        
		}
	//*  14   22:aload_1         
	//*  15   23:ifnull          31
	//*  16   26:aload_2         
	//*  17   27:aload_1         
	//*  18   28:invokevirtual   #314 <Method void ByteArrayOutputStream.write(byte[])>
	//*  19   31:aload_3         
	//*  20   32:invokevirtual   #317 <Method byte[] StandardDecryption.finish()>
	//*  21   35:astore_1        
	//*  22   36:aload_1         
	//*  23   37:ifnull          45
	//*  24   40:aload_2         
	//*  25   41:aload_1         
	//*  26   42:invokevirtual   #314 <Method void ByteArrayOutputStream.write(byte[])>
	//*  27   45:aload_2         
	//*  28   46:invokevirtual   #318 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  29   49:astore_1        
	//*  30   50:aload_1         
	//*  31   51:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  32   52:astore_1        
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
	//   33   53:new             #130 <Class ExceptionConverter>
	//   34   56:dup             
	//   35   57:aload_1         
	//   36   58:invokespecial   #133 <Method void ExceptionConverter(Exception)>
	//   37   61:athrow          
		}
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_31;
		bytearrayoutputstream.write(abyte0);
		abyte0 = standarddecryption.finish();
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_45;
		bytearrayoutputstream.write(abyte0);
		abyte0 = bytearrayoutputstream.toByteArray();
		return abyte0;
	}

	public byte[] encryptByteArray(byte abyte0[])
	{
		try
		{
			ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #301 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #302 <Method void ByteArrayOutputStream()>
	//    3    7:astore_2        
			OutputStreamEncryption outputstreamencryption = getEncryptionStream(((OutputStream) (bytearrayoutputstream)));
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #323 <Method OutputStreamEncryption getEncryptionStream(OutputStream)>
	//    7   13:astore_3        
			outputstreamencryption.write(abyte0);
	//    8   14:aload_3         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #326 <Method void OutputStreamEncryption.write(byte[])>
			outputstreamencryption.finish();
	//   11   19:aload_3         
	//   12   20:invokevirtual   #328 <Method void OutputStreamEncryption.finish()>
			abyte0 = bytearrayoutputstream.toByteArray();
	//   13   23:aload_2         
	//   14   24:invokevirtual   #318 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   15   27:astore_1        
		}
	//*  16   28:aload_1         
	//*  17   29:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  18   30:astore_1        
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
	//   19   31:new             #130 <Class ExceptionConverter>
	//   20   34:dup             
	//   21   35:aload_1         
	//   22   36:invokespecial   #133 <Method void ExceptionConverter(Exception)>
	//   23   39:athrow          
		}
		return abyte0;
	}

	public int getCryptoMode()
	{
		return cryptoMode;
	//    0    0:aload_0         
	//    1    1:getfield        #331 <Field int cryptoMode>
	//    2    4:ireturn         
	}

	public StandardDecryption getDecryptor()
	{
		return new StandardDecryption(key, 0, keySize, revision);
	//    0    0:new             #308 <Class StandardDecryption>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #137 <Field byte[] key>
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #144 <Field int keySize>
	//    7   13:aload_0         
	//    8   14:getfield        #150 <Field int revision>
	//    9   17:invokespecial   #334 <Method void StandardDecryption(byte[], int, int, int)>
	//   10   20:areturn         
	}

	public PdfDictionary getEncryptionDictionary()
	{
		Object obj;
		PdfDictionary pdfdictionary2;
		pdfdictionary2 = new PdfDictionary();
	//    0    0:new             #338 <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:invokespecial   #339 <Method void PdfDictionary()>
	//    3    7:astore_3        
		if(publicKeyHandler.getRecipientsSize() <= 0)
			break MISSING_BLOCK_LABEL_610;
	//    4    8:aload_0         
	//    5    9:getfield        #108 <Field PdfPublicKeySecurityHandler publicKeyHandler>
	//    6   12:invokevirtual   #296 <Method int PdfPublicKeySecurityHandler.getRecipientsSize()>
	//    7   15:ifle            610
		pdfdictionary2.put(PdfName.FILTER, ((PdfObject) (PdfName.PUBSEC)));
	//    8   18:aload_3         
	//    9   19:getstatic       #345 <Field PdfName PdfName.FILTER>
	//   10   22:getstatic       #348 <Field PdfName PdfName.PUBSEC>
	//   11   25:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary2.put(PdfName.R, ((PdfObject) (new PdfNumber(revision))));
	//   12   28:aload_3         
	//   13   29:getstatic       #355 <Field PdfName PdfName.R>
	//   14   32:new             #357 <Class PdfNumber>
	//   15   35:dup             
	//   16   36:aload_0         
	//   17   37:getfield        #150 <Field int revision>
	//   18   40:invokespecial   #358 <Method void PdfNumber(int)>
	//   19   43:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		int i;
		Object obj1;
		try
		{
			obj1 = ((Object) (publicKeyHandler.getEncodedRecipients()));
	//   20   46:aload_0         
	//   21   47:getfield        #108 <Field PdfPublicKeySecurityHandler publicKeyHandler>
	//   22   50:invokevirtual   #362 <Method PdfArray PdfPublicKeySecurityHandler.getEncodedRecipients()>
	//   23   53:astore          4
		}
	//*  24   55:aload_0         
	//*  25   56:getfield        #150 <Field int revision>
	//*  26   59:iconst_2        
	//*  27   60:icmpne          165
	//*  28   63:aload_3         
	//*  29   64:getstatic       #365 <Field PdfName PdfName.V>
	//*  30   67:new             #357 <Class PdfNumber>
	//*  31   70:dup             
	//*  32   71:iconst_1        
	//*  33   72:invokespecial   #358 <Method void PdfNumber(int)>
	//*  34   75:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  35   78:aload_3         
	//*  36   79:getstatic       #368 <Field PdfName PdfName.SUBFILTER>
	//*  37   82:getstatic       #371 <Field PdfName PdfName.ADBE_PKCS7_S4>
	//*  38   85:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  39   88:aload_3         
	//*  40   89:getstatic       #374 <Field PdfName PdfName.RECIPIENTS>
	//*  41   92:aload           4
	//*  42   94:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  43   97:aload_0         
	//*  44   98:getfield        #150 <Field int revision>
	//*  45  101:iconst_5        
	//*  46  102:icmpne          525
	//*  47  105:ldc2            #376 <String "SHA-256">
	//*  48  108:invokestatic    #123 <Method MessageDigest MessageDigest.getInstance(String)>
	//*  49  111:astore_2        
	//*  50  112:aload_2         
	//*  51  113:aload_0         
	//*  52  114:getfield        #108 <Field PdfPublicKeySecurityHandler publicKeyHandler>
	//*  53  117:invokevirtual   #379 <Method byte[] PdfPublicKeySecurityHandler.getSeed()>
	//*  54  120:invokevirtual   #277 <Method void MessageDigest.update(byte[])>
	//*  55  123:iconst_0        
	//*  56  124:istore_1        
	//*  57  125:iload_1         
	//*  58  126:aload_0         
	//*  59  127:getfield        #108 <Field PdfPublicKeySecurityHandler publicKeyHandler>
	//*  60  130:invokevirtual   #296 <Method int PdfPublicKeySecurityHandler.getRecipientsSize()>
	//*  61  133:icmpge          535
	//*  62  136:aload_2         
	//*  63  137:aload_0         
	//*  64  138:getfield        #108 <Field PdfPublicKeySecurityHandler publicKeyHandler>
	//*  65  141:iload_1         
	//*  66  142:invokevirtual   #383 <Method byte[] PdfPublicKeySecurityHandler.getEncodedRecipient(int)>
	//*  67  145:invokevirtual   #277 <Method void MessageDigest.update(byte[])>
	//*  68  148:iload_1         
	//*  69  149:iconst_1        
	//*  70  150:iadd            
	//*  71  151:istore_1        
	//*  72  152:goto            125
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  73  155:astore_2        
		{
			throw new ExceptionConverter(((Exception) (obj)));
	//   74  156:new             #130 <Class ExceptionConverter>
	//   75  159:dup             
	//   76  160:aload_2         
	//   77  161:invokespecial   #133 <Method void ExceptionConverter(Exception)>
	//   78  164:athrow          
		}
		if(revision == 2)
		{
			pdfdictionary2.put(PdfName.V, ((PdfObject) (new PdfNumber(1))));
			pdfdictionary2.put(PdfName.SUBFILTER, ((PdfObject) (PdfName.ADBE_PKCS7_S4)));
			pdfdictionary2.put(PdfName.RECIPIENTS, ((PdfObject) (obj1)));
		} else
		if(revision == 3 && encryptMetadata)
	//*  79  165:aload_0         
	//*  80  166:getfield        #150 <Field int revision>
	//*  81  169:iconst_3        
	//*  82  170:icmpne          234
	//*  83  173:aload_0         
	//*  84  174:getfield        #154 <Field boolean encryptMetadata>
	//*  85  177:ifeq            234
		{
			pdfdictionary2.put(PdfName.V, ((PdfObject) (new PdfNumber(2))));
	//   86  180:aload_3         
	//   87  181:getstatic       #365 <Field PdfName PdfName.V>
	//   88  184:new             #357 <Class PdfNumber>
	//   89  187:dup             
	//   90  188:iconst_2        
	//   91  189:invokespecial   #358 <Method void PdfNumber(int)>
	//   92  192:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary2.put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(128))));
	//   93  195:aload_3         
	//   94  196:getstatic       #386 <Field PdfName PdfName.LENGTH>
	//   95  199:new             #357 <Class PdfNumber>
	//   96  202:dup             
	//   97  203:sipush          128
	//   98  206:invokespecial   #358 <Method void PdfNumber(int)>
	//   99  209:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary2.put(PdfName.SUBFILTER, ((PdfObject) (PdfName.ADBE_PKCS7_S4)));
	//  100  212:aload_3         
	//  101  213:getstatic       #368 <Field PdfName PdfName.SUBFILTER>
	//  102  216:getstatic       #371 <Field PdfName PdfName.ADBE_PKCS7_S4>
	//  103  219:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary2.put(PdfName.RECIPIENTS, ((PdfObject) (obj1)));
	//  104  222:aload_3         
	//  105  223:getstatic       #374 <Field PdfName PdfName.RECIPIENTS>
	//  106  226:aload           4
	//  107  228:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		} else
	//* 108  231:goto            97
		{
			if(revision == 5)
	//* 109  234:aload_0         
	//* 110  235:getfield        #150 <Field int revision>
	//* 111  238:iconst_5        
	//* 112  239:icmpne          418
			{
				pdfdictionary2.put(PdfName.R, ((PdfObject) (new PdfNumber(5))));
	//  113  242:aload_3         
	//  114  243:getstatic       #355 <Field PdfName PdfName.R>
	//  115  246:new             #357 <Class PdfNumber>
	//  116  249:dup             
	//  117  250:iconst_5        
	//  118  251:invokespecial   #358 <Method void PdfNumber(int)>
	//  119  254:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfdictionary2.put(PdfName.V, ((PdfObject) (new PdfNumber(5))));
	//  120  257:aload_3         
	//  121  258:getstatic       #365 <Field PdfName PdfName.V>
	//  122  261:new             #357 <Class PdfNumber>
	//  123  264:dup             
	//  124  265:iconst_5        
	//  125  266:invokespecial   #358 <Method void PdfNumber(int)>
	//  126  269:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			} else
	//* 127  272:aload_3         
	//* 128  273:getstatic       #368 <Field PdfName PdfName.SUBFILTER>
	//* 129  276:getstatic       #389 <Field PdfName PdfName.ADBE_PKCS7_S5>
	//* 130  279:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 131  282:new             #338 <Class PdfDictionary>
	//* 132  285:dup             
	//* 133  286:invokespecial   #339 <Method void PdfDictionary()>
	//* 134  289:astore_2        
	//* 135  290:aload_2         
	//* 136  291:getstatic       #374 <Field PdfName PdfName.RECIPIENTS>
	//* 137  294:aload           4
	//* 138  296:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 139  299:aload_0         
	//* 140  300:getfield        #154 <Field boolean encryptMetadata>
	//* 141  303:ifne            316
	//* 142  306:aload_2         
	//* 143  307:getstatic       #392 <Field PdfName PdfName.ENCRYPTMETADATA>
	//* 144  310:getstatic       #398 <Field PdfBoolean PdfBoolean.PDFFALSE>
	//* 145  313:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 146  316:aload_0         
	//* 147  317:getfield        #150 <Field int revision>
	//* 148  320:iconst_4        
	//* 149  321:icmpne          451
	//* 150  324:aload_2         
	//* 151  325:getstatic       #401 <Field PdfName PdfName.CFM>
	//* 152  328:getstatic       #404 <Field PdfName PdfName.AESV2>
	//* 153  331:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 154  334:aload_2         
	//* 155  335:getstatic       #386 <Field PdfName PdfName.LENGTH>
	//* 156  338:new             #357 <Class PdfNumber>
	//* 157  341:dup             
	//* 158  342:sipush          128
	//* 159  345:invokespecial   #358 <Method void PdfNumber(int)>
	//* 160  348:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 161  351:new             #338 <Class PdfDictionary>
	//* 162  354:dup             
	//* 163  355:invokespecial   #339 <Method void PdfDictionary()>
	//* 164  358:astore          4
	//* 165  360:aload           4
	//* 166  362:getstatic       #407 <Field PdfName PdfName.DEFAULTCRYPTFILTER>
	//* 167  365:aload_2         
	//* 168  366:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 169  369:aload_3         
	//* 170  370:getstatic       #410 <Field PdfName PdfName.CF>
	//* 171  373:aload           4
	//* 172  375:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 173  378:aload_0         
	//* 174  379:getfield        #156 <Field boolean embeddedFilesOnly>
	//* 175  382:ifeq            502
	//* 176  385:aload_3         
	//* 177  386:getstatic       #413 <Field PdfName PdfName.EFF>
	//* 178  389:getstatic       #407 <Field PdfName PdfName.DEFAULTCRYPTFILTER>
	//* 179  392:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 180  395:aload_3         
	//* 181  396:getstatic       #416 <Field PdfName PdfName.STRF>
	//* 182  399:getstatic       #419 <Field PdfName PdfName.IDENTITY>
	//* 183  402:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 184  405:aload_3         
	//* 185  406:getstatic       #422 <Field PdfName PdfName.STMF>
	//* 186  409:getstatic       #419 <Field PdfName PdfName.IDENTITY>
	//* 187  412:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 188  415:goto            97
			{
				pdfdictionary2.put(PdfName.R, ((PdfObject) (new PdfNumber(4))));
	//  189  418:aload_3         
	//  190  419:getstatic       #355 <Field PdfName PdfName.R>
	//  191  422:new             #357 <Class PdfNumber>
	//  192  425:dup             
	//  193  426:iconst_4        
	//  194  427:invokespecial   #358 <Method void PdfNumber(int)>
	//  195  430:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfdictionary2.put(PdfName.V, ((PdfObject) (new PdfNumber(4))));
	//  196  433:aload_3         
	//  197  434:getstatic       #365 <Field PdfName PdfName.V>
	//  198  437:new             #357 <Class PdfNumber>
	//  199  440:dup             
	//  200  441:iconst_4        
	//  201  442:invokespecial   #358 <Method void PdfNumber(int)>
	//  202  445:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}
			pdfdictionary2.put(PdfName.SUBFILTER, ((PdfObject) (PdfName.ADBE_PKCS7_S5)));
			obj = ((Object) (new PdfDictionary()));
			((PdfDictionary) (obj)).put(PdfName.RECIPIENTS, ((PdfObject) (obj1)));
			if(!encryptMetadata)
				((PdfDictionary) (obj)).put(PdfName.ENCRYPTMETADATA, ((PdfObject) (PdfBoolean.PDFFALSE)));
			if(revision == 4)
			{
				((PdfDictionary) (obj)).put(PdfName.CFM, ((PdfObject) (PdfName.AESV2)));
				((PdfDictionary) (obj)).put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(128))));
			} else
	//* 203  448:goto            272
			if(revision == 5)
	//* 204  451:aload_0         
	//* 205  452:getfield        #150 <Field int revision>
	//* 206  455:iconst_5        
	//* 207  456:icmpne          489
			{
				((PdfDictionary) (obj)).put(PdfName.CFM, ((PdfObject) (PdfName.AESV3)));
	//  208  459:aload_2         
	//  209  460:getstatic       #401 <Field PdfName PdfName.CFM>
	//  210  463:getstatic       #425 <Field PdfName PdfName.AESV3>
	//  211  466:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
				((PdfDictionary) (obj)).put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(256))));
	//  212  469:aload_2         
	//  213  470:getstatic       #386 <Field PdfName PdfName.LENGTH>
	//  214  473:new             #357 <Class PdfNumber>
	//  215  476:dup             
	//  216  477:sipush          256
	//  217  480:invokespecial   #358 <Method void PdfNumber(int)>
	//  218  483:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			} else
	//* 219  486:goto            351
			{
				((PdfDictionary) (obj)).put(PdfName.CFM, ((PdfObject) (PdfName.V2)));
	//  220  489:aload_2         
	//  221  490:getstatic       #401 <Field PdfName PdfName.CFM>
	//  222  493:getstatic       #428 <Field PdfName PdfName.V2>
	//  223  496:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}
			obj1 = ((Object) (new PdfDictionary()));
			((PdfDictionary) (obj1)).put(PdfName.DEFAULTCRYPTFILTER, ((PdfObject) (obj)));
			pdfdictionary2.put(PdfName.CF, ((PdfObject) (obj1)));
			if(embeddedFilesOnly)
			{
				pdfdictionary2.put(PdfName.EFF, ((PdfObject) (PdfName.DEFAULTCRYPTFILTER)));
				pdfdictionary2.put(PdfName.STRF, ((PdfObject) (PdfName.IDENTITY)));
				pdfdictionary2.put(PdfName.STMF, ((PdfObject) (PdfName.IDENTITY)));
			} else
	//* 224  499:goto            351
			{
				pdfdictionary2.put(PdfName.STRF, ((PdfObject) (PdfName.DEFAULTCRYPTFILTER)));
	//  225  502:aload_3         
	//  226  503:getstatic       #416 <Field PdfName PdfName.STRF>
	//  227  506:getstatic       #407 <Field PdfName PdfName.DEFAULTCRYPTFILTER>
	//  228  509:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfdictionary2.put(PdfName.STMF, ((PdfObject) (PdfName.DEFAULTCRYPTFILTER)));
	//  229  512:aload_3         
	//  230  513:getstatic       #422 <Field PdfName PdfName.STMF>
	//  231  516:getstatic       #407 <Field PdfName PdfName.DEFAULTCRYPTFILTER>
	//  232  519:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}
		}
		if(revision != 5)
			break MISSING_BLOCK_LABEL_525;
		obj = ((Object) (MessageDigest.getInstance("SHA-256")));
_L1:
		((MessageDigest) (obj)).update(publicKeyHandler.getSeed());
		i = 0;
		do
		{
			try
			{
				if(i >= publicKeyHandler.getRecipientsSize())
					break;
				((MessageDigest) (obj)).update(publicKeyHandler.getEncodedRecipient(i));
			}
	//* 233  522:goto            97
	//* 234  525:ldc2            #430 <String "SHA-1">
	//* 235  528:invokestatic    #123 <Method MessageDigest MessageDigest.getInstance(String)>
	//* 236  531:astore_2        
	//* 237  532:goto            112
	//* 238  535:aload_0         
	//* 239  536:getfield        #154 <Field boolean encryptMetadata>
	//* 240  539:ifne            569
	//* 241  542:aload_2         
	//* 242  543:iconst_4        
	//* 243  544:newarray        byte[]
	//* 244  546:dup             
	//* 245  547:iconst_0        
	//* 246  548:ldc1            #62  <Int -1>
	//* 247  550:bastore         
	//* 248  551:dup             
	//* 249  552:iconst_1        
	//* 250  553:ldc1            #62  <Int -1>
	//* 251  555:bastore         
	//* 252  556:dup             
	//* 253  557:iconst_2        
	//* 254  558:ldc1            #62  <Int -1>
	//* 255  560:bastore         
	//* 256  561:dup             
	//* 257  562:iconst_3        
	//* 258  563:ldc1            #62  <Int -1>
	//* 259  565:bastore         
	//* 260  566:invokevirtual   #277 <Method void MessageDigest.update(byte[])>
	//* 261  569:aload_2         
	//* 262  570:invokevirtual   #177 <Method byte[] MessageDigest.digest()>
	//* 263  573:astore_2        
	//* 264  574:aload_0         
	//* 265  575:getfield        #150 <Field int revision>
	//* 266  578:iconst_5        
	//* 267  579:icmpne          599
	//* 268  582:aload_0         
	//* 269  583:aload_2         
	//* 270  584:putfield        #137 <Field byte[] key>
	//* 271  587:aload_3         
	//* 272  588:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//* 273  589:astore_2        
			{
				throw new ExceptionConverter(((Exception) (obj)));
	//  274  590:new             #130 <Class ExceptionConverter>
	//  275  593:dup             
	//  276  594:aload_2         
	//  277  595:invokespecial   #133 <Method void ExceptionConverter(Exception)>
	//  278  598:athrow          
			}
			i++;
		} while(true);
		break MISSING_BLOCK_LABEL_535;
		obj = ((Object) (MessageDigest.getInstance("SHA-1")));
		  goto _L1
		if(!encryptMetadata)
			((MessageDigest) (obj)).update(new byte[] {
				-1, -1, -1, -1
			});
		obj = ((Object) (((MessageDigest) (obj)).digest()));
		if(revision == 5)
		{
			key = ((byte []) (obj));
			return pdfdictionary2;
		} else
		{
			setupByEncryptionKey(((byte []) (obj)), keyLength);
	//  279  599:aload_0         
	//  280  600:aload_2         
	//  281  601:aload_0         
	//  282  602:getfield        #152 <Field int keyLength>
	//  283  605:invokevirtual   #434 <Method void setupByEncryptionKey(byte[], int)>
			return pdfdictionary2;
	//  284  608:aload_3         
	//  285  609:areturn         
		}
		pdfdictionary2.put(PdfName.FILTER, ((PdfObject) (PdfName.STANDARD)));
	//  286  610:aload_3         
	//  287  611:getstatic       #345 <Field PdfName PdfName.FILTER>
	//  288  614:getstatic       #437 <Field PdfName PdfName.STANDARD>
	//  289  617:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary2.put(PdfName.O, ((PdfObject) (new PdfLiteral(StringUtils.escapeString(ownerKey)))));
	//  290  620:aload_3         
	//  291  621:getstatic       #440 <Field PdfName PdfName.O>
	//  292  624:new             #247 <Class PdfLiteral>
	//  293  627:dup             
	//  294  628:aload_0         
	//  295  629:getfield        #104 <Field byte[] ownerKey>
	//  296  632:invokestatic    #445 <Method byte[] StringUtils.escapeString(byte[])>
	//  297  635:invokespecial   #252 <Method void PdfLiteral(byte[])>
	//  298  638:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary2.put(PdfName.U, ((PdfObject) (new PdfLiteral(StringUtils.escapeString(userKey)))));
	//  299  641:aload_3         
	//  300  642:getstatic       #448 <Field PdfName PdfName.U>
	//  301  645:new             #247 <Class PdfLiteral>
	//  302  648:dup             
	//  303  649:aload_0         
	//  304  650:getfield        #106 <Field byte[] userKey>
	//  305  653:invokestatic    #445 <Method byte[] StringUtils.escapeString(byte[])>
	//  306  656:invokespecial   #252 <Method void PdfLiteral(byte[])>
	//  307  659:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary2.put(PdfName.P, ((PdfObject) (new PdfNumber(permissions))));
	//  308  662:aload_3         
	//  309  663:getstatic       #451 <Field PdfName PdfName.P>
	//  310  666:new             #357 <Class PdfNumber>
	//  311  669:dup             
	//  312  670:aload_0         
	//  313  671:getfield        #146 <Field long permissions>
	//  314  674:invokespecial   #454 <Method void PdfNumber(long)>
	//  315  677:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary2.put(PdfName.R, ((PdfObject) (new PdfNumber(revision))));
	//  316  680:aload_3         
	//  317  681:getstatic       #355 <Field PdfName PdfName.R>
	//  318  684:new             #357 <Class PdfNumber>
	//  319  687:dup             
	//  320  688:aload_0         
	//  321  689:getfield        #150 <Field int revision>
	//  322  692:invokespecial   #358 <Method void PdfNumber(int)>
	//  323  695:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(revision == 2)
	//* 324  698:aload_0         
	//* 325  699:getfield        #150 <Field int revision>
	//* 326  702:iconst_2        
	//* 327  703:icmpne          723
		{
			pdfdictionary2.put(PdfName.V, ((PdfObject) (new PdfNumber(1))));
	//  328  706:aload_3         
	//  329  707:getstatic       #365 <Field PdfName PdfName.V>
	//  330  710:new             #357 <Class PdfNumber>
	//  331  713:dup             
	//  332  714:iconst_1        
	//  333  715:invokespecial   #358 <Method void PdfNumber(int)>
	//  334  718:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return pdfdictionary2;
	//  335  721:aload_3         
	//  336  722:areturn         
		}
		if(revision == 3 && encryptMetadata)
	//* 337  723:aload_0         
	//* 338  724:getfield        #150 <Field int revision>
	//* 339  727:iconst_3        
	//* 340  728:icmpne          772
	//* 341  731:aload_0         
	//* 342  732:getfield        #154 <Field boolean encryptMetadata>
	//* 343  735:ifeq            772
		{
			pdfdictionary2.put(PdfName.V, ((PdfObject) (new PdfNumber(2))));
	//  344  738:aload_3         
	//  345  739:getstatic       #365 <Field PdfName PdfName.V>
	//  346  742:new             #357 <Class PdfNumber>
	//  347  745:dup             
	//  348  746:iconst_2        
	//  349  747:invokespecial   #358 <Method void PdfNumber(int)>
	//  350  750:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary2.put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(128))));
	//  351  753:aload_3         
	//  352  754:getstatic       #386 <Field PdfName PdfName.LENGTH>
	//  353  757:new             #357 <Class PdfNumber>
	//  354  760:dup             
	//  355  761:sipush          128
	//  356  764:invokespecial   #358 <Method void PdfNumber(int)>
	//  357  767:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return pdfdictionary2;
	//  358  770:aload_3         
	//  359  771:areturn         
		}
		if(revision == 5)
	//* 360  772:aload_0         
	//* 361  773:getfield        #150 <Field int revision>
	//* 362  776:iconst_5        
	//* 363  777:icmpne          1038
		{
			if(!encryptMetadata)
	//* 364  780:aload_0         
	//* 365  781:getfield        #154 <Field boolean encryptMetadata>
	//* 366  784:ifne            797
				pdfdictionary2.put(PdfName.ENCRYPTMETADATA, ((PdfObject) (PdfBoolean.PDFFALSE)));
	//  367  787:aload_3         
	//  368  788:getstatic       #392 <Field PdfName PdfName.ENCRYPTMETADATA>
	//  369  791:getstatic       #398 <Field PdfBoolean PdfBoolean.PDFFALSE>
	//  370  794:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary2.put(PdfName.OE, ((PdfObject) (new PdfLiteral(StringUtils.escapeString(oeKey)))));
	//  371  797:aload_3         
	//  372  798:getstatic       #457 <Field PdfName PdfName.OE>
	//  373  801:new             #247 <Class PdfLiteral>
	//  374  804:dup             
	//  375  805:aload_0         
	//  376  806:getfield        #160 <Field byte[] oeKey>
	//  377  809:invokestatic    #445 <Method byte[] StringUtils.escapeString(byte[])>
	//  378  812:invokespecial   #252 <Method void PdfLiteral(byte[])>
	//  379  815:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary2.put(PdfName.UE, ((PdfObject) (new PdfLiteral(StringUtils.escapeString(ueKey)))));
	//  380  818:aload_3         
	//  381  819:getstatic       #460 <Field PdfName PdfName.UE>
	//  382  822:new             #247 <Class PdfLiteral>
	//  383  825:dup             
	//  384  826:aload_0         
	//  385  827:getfield        #158 <Field byte[] ueKey>
	//  386  830:invokestatic    #445 <Method byte[] StringUtils.escapeString(byte[])>
	//  387  833:invokespecial   #252 <Method void PdfLiteral(byte[])>
	//  388  836:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary2.put(PdfName.PERMS, ((PdfObject) (new PdfLiteral(StringUtils.escapeString(perms)))));
	//  389  839:aload_3         
	//  390  840:getstatic       #463 <Field PdfName PdfName.PERMS>
	//  391  843:new             #247 <Class PdfLiteral>
	//  392  846:dup             
	//  393  847:aload_0         
	//  394  848:getfield        #162 <Field byte[] perms>
	//  395  851:invokestatic    #445 <Method byte[] StringUtils.escapeString(byte[])>
	//  396  854:invokespecial   #252 <Method void PdfLiteral(byte[])>
	//  397  857:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary2.put(PdfName.V, ((PdfObject) (new PdfNumber(revision))));
	//  398  860:aload_3         
	//  399  861:getstatic       #365 <Field PdfName PdfName.V>
	//  400  864:new             #357 <Class PdfNumber>
	//  401  867:dup             
	//  402  868:aload_0         
	//  403  869:getfield        #150 <Field int revision>
	//  404  872:invokespecial   #358 <Method void PdfNumber(int)>
	//  405  875:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary2.put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(256))));
	//  406  878:aload_3         
	//  407  879:getstatic       #386 <Field PdfName PdfName.LENGTH>
	//  408  882:new             #357 <Class PdfNumber>
	//  409  885:dup             
	//  410  886:sipush          256
	//  411  889:invokespecial   #358 <Method void PdfNumber(int)>
	//  412  892:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			PdfDictionary pdfdictionary = new PdfDictionary();
	//  413  895:new             #338 <Class PdfDictionary>
	//  414  898:dup             
	//  415  899:invokespecial   #339 <Method void PdfDictionary()>
	//  416  902:astore_2        
			pdfdictionary.put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(32))));
	//  417  903:aload_2         
	//  418  904:getstatic       #386 <Field PdfName PdfName.LENGTH>
	//  419  907:new             #357 <Class PdfNumber>
	//  420  910:dup             
	//  421  911:bipush          32
	//  422  913:invokespecial   #358 <Method void PdfNumber(int)>
	//  423  916:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			PdfDictionary pdfdictionary3;
			if(embeddedFilesOnly)
	//* 424  919:aload_0         
	//* 425  920:getfield        #156 <Field boolean embeddedFilesOnly>
	//* 426  923:ifeq            1005
			{
				pdfdictionary.put(PdfName.AUTHEVENT, ((PdfObject) (PdfName.EFOPEN)));
	//  427  926:aload_2         
	//  428  927:getstatic       #466 <Field PdfName PdfName.AUTHEVENT>
	//  429  930:getstatic       #469 <Field PdfName PdfName.EFOPEN>
	//  430  933:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfdictionary2.put(PdfName.EFF, ((PdfObject) (PdfName.STDCF)));
	//  431  936:aload_3         
	//  432  937:getstatic       #413 <Field PdfName PdfName.EFF>
	//  433  940:getstatic       #472 <Field PdfName PdfName.STDCF>
	//  434  943:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfdictionary2.put(PdfName.STRF, ((PdfObject) (PdfName.IDENTITY)));
	//  435  946:aload_3         
	//  436  947:getstatic       #416 <Field PdfName PdfName.STRF>
	//  437  950:getstatic       #419 <Field PdfName PdfName.IDENTITY>
	//  438  953:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfdictionary2.put(PdfName.STMF, ((PdfObject) (PdfName.IDENTITY)));
	//  439  956:aload_3         
	//  440  957:getstatic       #422 <Field PdfName PdfName.STMF>
	//  441  960:getstatic       #419 <Field PdfName PdfName.IDENTITY>
	//  442  963:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			} else
	//* 443  966:aload_2         
	//* 444  967:getstatic       #401 <Field PdfName PdfName.CFM>
	//* 445  970:getstatic       #425 <Field PdfName PdfName.AESV3>
	//* 446  973:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 447  976:new             #338 <Class PdfDictionary>
	//* 448  979:dup             
	//* 449  980:invokespecial   #339 <Method void PdfDictionary()>
	//* 450  983:astore          4
	//* 451  985:aload           4
	//* 452  987:getstatic       #472 <Field PdfName PdfName.STDCF>
	//* 453  990:aload_2         
	//* 454  991:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 455  994:aload_3         
	//* 456  995:getstatic       #410 <Field PdfName PdfName.CF>
	//* 457  998:aload           4
	//* 458 1000:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 459 1003:aload_3         
	//* 460 1004:areturn         
			{
				pdfdictionary.put(PdfName.AUTHEVENT, ((PdfObject) (PdfName.DOCOPEN)));
	//  461 1005:aload_2         
	//  462 1006:getstatic       #466 <Field PdfName PdfName.AUTHEVENT>
	//  463 1009:getstatic       #475 <Field PdfName PdfName.DOCOPEN>
	//  464 1012:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfdictionary2.put(PdfName.STRF, ((PdfObject) (PdfName.STDCF)));
	//  465 1015:aload_3         
	//  466 1016:getstatic       #416 <Field PdfName PdfName.STRF>
	//  467 1019:getstatic       #472 <Field PdfName PdfName.STDCF>
	//  468 1022:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
				pdfdictionary2.put(PdfName.STMF, ((PdfObject) (PdfName.STDCF)));
	//  469 1025:aload_3         
	//  470 1026:getstatic       #422 <Field PdfName PdfName.STMF>
	//  471 1029:getstatic       #472 <Field PdfName PdfName.STDCF>
	//  472 1032:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			}
			pdfdictionary.put(PdfName.CFM, ((PdfObject) (PdfName.AESV3)));
			pdfdictionary3 = new PdfDictionary();
			pdfdictionary3.put(PdfName.STDCF, ((PdfObject) (pdfdictionary)));
			pdfdictionary2.put(PdfName.CF, ((PdfObject) (pdfdictionary3)));
			return pdfdictionary2;
		}
	//* 473 1035:goto            966
		if(!encryptMetadata)
	//* 474 1038:aload_0         
	//* 475 1039:getfield        #154 <Field boolean encryptMetadata>
	//* 476 1042:ifne            1055
			pdfdictionary2.put(PdfName.ENCRYPTMETADATA, ((PdfObject) (PdfBoolean.PDFFALSE)));
	//  477 1045:aload_3         
	//  478 1046:getstatic       #392 <Field PdfName PdfName.ENCRYPTMETADATA>
	//  479 1049:getstatic       #398 <Field PdfBoolean PdfBoolean.PDFFALSE>
	//  480 1052:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary2.put(PdfName.R, ((PdfObject) (new PdfNumber(4))));
	//  481 1055:aload_3         
	//  482 1056:getstatic       #355 <Field PdfName PdfName.R>
	//  483 1059:new             #357 <Class PdfNumber>
	//  484 1062:dup             
	//  485 1063:iconst_4        
	//  486 1064:invokespecial   #358 <Method void PdfNumber(int)>
	//  487 1067:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary2.put(PdfName.V, ((PdfObject) (new PdfNumber(4))));
	//  488 1070:aload_3         
	//  489 1071:getstatic       #365 <Field PdfName PdfName.V>
	//  490 1074:new             #357 <Class PdfNumber>
	//  491 1077:dup             
	//  492 1078:iconst_4        
	//  493 1079:invokespecial   #358 <Method void PdfNumber(int)>
	//  494 1082:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary2.put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(128))));
	//  495 1085:aload_3         
	//  496 1086:getstatic       #386 <Field PdfName PdfName.LENGTH>
	//  497 1089:new             #357 <Class PdfNumber>
	//  498 1092:dup             
	//  499 1093:sipush          128
	//  500 1096:invokespecial   #358 <Method void PdfNumber(int)>
	//  501 1099:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		PdfDictionary pdfdictionary1 = new PdfDictionary();
	//  502 1102:new             #338 <Class PdfDictionary>
	//  503 1105:dup             
	//  504 1106:invokespecial   #339 <Method void PdfDictionary()>
	//  505 1109:astore_2        
		pdfdictionary1.put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(16))));
	//  506 1110:aload_2         
	//  507 1111:getstatic       #386 <Field PdfName PdfName.LENGTH>
	//  508 1114:new             #357 <Class PdfNumber>
	//  509 1117:dup             
	//  510 1118:bipush          16
	//  511 1120:invokespecial   #358 <Method void PdfNumber(int)>
	//  512 1123:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		PdfDictionary pdfdictionary4;
		if(embeddedFilesOnly)
	//* 513 1126:aload_0         
	//* 514 1127:getfield        #156 <Field boolean embeddedFilesOnly>
	//* 515 1130:ifeq            1220
		{
			pdfdictionary1.put(PdfName.AUTHEVENT, ((PdfObject) (PdfName.EFOPEN)));
	//  516 1133:aload_2         
	//  517 1134:getstatic       #466 <Field PdfName PdfName.AUTHEVENT>
	//  518 1137:getstatic       #469 <Field PdfName PdfName.EFOPEN>
	//  519 1140:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary2.put(PdfName.EFF, ((PdfObject) (PdfName.STDCF)));
	//  520 1143:aload_3         
	//  521 1144:getstatic       #413 <Field PdfName PdfName.EFF>
	//  522 1147:getstatic       #472 <Field PdfName PdfName.STDCF>
	//  523 1150:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary2.put(PdfName.STRF, ((PdfObject) (PdfName.IDENTITY)));
	//  524 1153:aload_3         
	//  525 1154:getstatic       #416 <Field PdfName PdfName.STRF>
	//  526 1157:getstatic       #419 <Field PdfName PdfName.IDENTITY>
	//  527 1160:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary2.put(PdfName.STMF, ((PdfObject) (PdfName.IDENTITY)));
	//  528 1163:aload_3         
	//  529 1164:getstatic       #422 <Field PdfName PdfName.STMF>
	//  530 1167:getstatic       #419 <Field PdfName PdfName.IDENTITY>
	//  531 1170:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		} else
	//* 532 1173:aload_0         
	//* 533 1174:getfield        #150 <Field int revision>
	//* 534 1177:iconst_4        
	//* 535 1178:icmpne          1253
	//* 536 1181:aload_2         
	//* 537 1182:getstatic       #401 <Field PdfName PdfName.CFM>
	//* 538 1185:getstatic       #404 <Field PdfName PdfName.AESV2>
	//* 539 1188:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 540 1191:new             #338 <Class PdfDictionary>
	//* 541 1194:dup             
	//* 542 1195:invokespecial   #339 <Method void PdfDictionary()>
	//* 543 1198:astore          4
	//* 544 1200:aload           4
	//* 545 1202:getstatic       #472 <Field PdfName PdfName.STDCF>
	//* 546 1205:aload_2         
	//* 547 1206:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 548 1209:aload_3         
	//* 549 1210:getstatic       #410 <Field PdfName PdfName.CF>
	//* 550 1213:aload           4
	//* 551 1215:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 552 1218:aload_3         
	//* 553 1219:areturn         
		{
			pdfdictionary1.put(PdfName.AUTHEVENT, ((PdfObject) (PdfName.DOCOPEN)));
	//  554 1220:aload_2         
	//  555 1221:getstatic       #466 <Field PdfName PdfName.AUTHEVENT>
	//  556 1224:getstatic       #475 <Field PdfName PdfName.DOCOPEN>
	//  557 1227:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary2.put(PdfName.STRF, ((PdfObject) (PdfName.STDCF)));
	//  558 1230:aload_3         
	//  559 1231:getstatic       #416 <Field PdfName PdfName.STRF>
	//  560 1234:getstatic       #472 <Field PdfName PdfName.STDCF>
	//  561 1237:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary2.put(PdfName.STMF, ((PdfObject) (PdfName.STDCF)));
	//  562 1240:aload_3         
	//  563 1241:getstatic       #422 <Field PdfName PdfName.STMF>
	//  564 1244:getstatic       #472 <Field PdfName PdfName.STDCF>
	//  565 1247:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		if(revision == 4)
			pdfdictionary1.put(PdfName.CFM, ((PdfObject) (PdfName.AESV2)));
		else
	//* 566 1250:goto            1173
			pdfdictionary1.put(PdfName.CFM, ((PdfObject) (PdfName.V2)));
	//  567 1253:aload_2         
	//  568 1254:getstatic       #401 <Field PdfName PdfName.CFM>
	//  569 1257:getstatic       #428 <Field PdfName PdfName.V2>
	//  570 1260:invokevirtual   #352 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary4 = new PdfDictionary();
		pdfdictionary4.put(PdfName.STDCF, ((PdfObject) (pdfdictionary1)));
		pdfdictionary2.put(PdfName.CF, ((PdfObject) (pdfdictionary4)));
		return pdfdictionary2;
	//* 571 1263:goto            1191
	}

	public OutputStreamEncryption getEncryptionStream(OutputStream outputstream)
	{
		return new OutputStreamEncryption(outputstream, key, 0, keySize, revision);
	//    0    0:new             #325 <Class OutputStreamEncryption>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #137 <Field byte[] key>
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:getfield        #144 <Field int keySize>
	//    8   14:aload_0         
	//    9   15:getfield        #150 <Field int revision>
	//   10   18:invokespecial   #478 <Method void OutputStreamEncryption(OutputStream, byte[], int, int, int)>
	//   11   21:areturn         
	}

	public PdfObject getFileID(boolean flag)
		throws IOException
	{
		return createInfoId(documentID, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field byte[] documentID>
	//    2    4:iload_1         
	//    3    5:invokestatic    #482 <Method PdfObject createInfoId(byte[], boolean)>
	//    4    8:areturn         
	}

	public long getPermissions()
	{
		return permissions;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field long permissions>
	//    2    4:lreturn         
	}

	public boolean isEmbeddedFilesOnly()
	{
		return embeddedFilesOnly;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field boolean embeddedFilesOnly>
	//    2    4:ireturn         
	}

	public boolean isMetadataEncrypted()
	{
		return encryptMetadata;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field boolean encryptMetadata>
	//    2    4:ireturn         
	}

	public boolean readKey(PdfDictionary pdfdictionary, byte abyte0[])
		throws BadPasswordException
	{
		byte abyte1[];
		abyte1 = abyte0;
	//    0    0:aload_2         
	//    1    1:astore          5
		if(abyte0 != null)
			break MISSING_BLOCK_LABEL_12;
	//    2    3:aload_2         
	//    3    4:ifnonnull       12
		abyte1 = new byte[0];
	//    4    7:iconst_0        
	//    5    8:newarray        byte[]
	//    6   10:astore          5
		boolean flag1;
		byte abyte2[];
		byte abyte3[];
		byte abyte4[];
		byte abyte5[];
		abyte0 = DocWriter.getISOBytes(pdfdictionary.get(PdfName.O).toString());
	//    7   12:aload_1         
	//    8   13:getstatic       #440 <Field PdfName PdfName.O>
	//    9   16:invokevirtual   #494 <Method PdfObject PdfDictionary.get(PdfName)>
	//   10   19:invokevirtual   #497 <Method String PdfObject.toString()>
	//   11   22:invokestatic    #503 <Method byte[] DocWriter.getISOBytes(String)>
	//   12   25:astore_2        
		abyte2 = DocWriter.getISOBytes(pdfdictionary.get(PdfName.U).toString());
	//   13   26:aload_1         
	//   14   27:getstatic       #448 <Field PdfName PdfName.U>
	//   15   30:invokevirtual   #494 <Method PdfObject PdfDictionary.get(PdfName)>
	//   16   33:invokevirtual   #497 <Method String PdfObject.toString()>
	//   17   36:invokestatic    #503 <Method byte[] DocWriter.getISOBytes(String)>
	//   18   39:astore          6
		abyte3 = DocWriter.getISOBytes(pdfdictionary.get(PdfName.OE).toString());
	//   19   41:aload_1         
	//   20   42:getstatic       #457 <Field PdfName PdfName.OE>
	//   21   45:invokevirtual   #494 <Method PdfObject PdfDictionary.get(PdfName)>
	//   22   48:invokevirtual   #497 <Method String PdfObject.toString()>
	//   23   51:invokestatic    #503 <Method byte[] DocWriter.getISOBytes(String)>
	//   24   54:astore          7
		abyte4 = DocWriter.getISOBytes(pdfdictionary.get(PdfName.UE).toString());
	//   25   56:aload_1         
	//   26   57:getstatic       #460 <Field PdfName PdfName.UE>
	//   27   60:invokevirtual   #494 <Method PdfObject PdfDictionary.get(PdfName)>
	//   28   63:invokevirtual   #497 <Method String PdfObject.toString()>
	//   29   66:invokestatic    #503 <Method byte[] DocWriter.getISOBytes(String)>
	//   30   69:astore          8
		abyte5 = DocWriter.getISOBytes(pdfdictionary.get(PdfName.PERMS).toString());
	//   31   71:aload_1         
	//   32   72:getstatic       #463 <Field PdfName PdfName.PERMS>
	//   33   75:invokevirtual   #494 <Method PdfObject PdfDictionary.get(PdfName)>
	//   34   78:invokevirtual   #497 <Method String PdfObject.toString()>
	//   35   81:invokestatic    #503 <Method byte[] DocWriter.getISOBytes(String)>
	//   36   84:astore          9
		pdfdictionary = ((PdfDictionary) ((PdfNumber)pdfdictionary.get(PdfName.P)));
	//   37   86:aload_1         
	//   38   87:getstatic       #451 <Field PdfName PdfName.P>
	//   39   90:invokevirtual   #494 <Method PdfObject PdfDictionary.get(PdfName)>
	//   40   93:checkcast       #357 <Class PdfNumber>
	//   41   96:astore_1        
		oeKey = abyte3;
	//   42   97:aload_0         
	//   43   98:aload           7
	//   44  100:putfield        #160 <Field byte[] oeKey>
		ueKey = abyte4;
	//   45  103:aload_0         
	//   46  104:aload           8
	//   47  106:putfield        #158 <Field byte[] ueKey>
		perms = abyte5;
	//   48  109:aload_0         
	//   49  110:aload           9
	//   50  112:putfield        #162 <Field byte[] perms>
		ownerKey = abyte0;
	//   51  115:aload_0         
	//   52  116:aload_2         
	//   53  117:putfield        #104 <Field byte[] ownerKey>
		userKey = abyte2;
	//   54  120:aload_0         
	//   55  121:aload           6
	//   56  123:putfield        #106 <Field byte[] userKey>
		permissions = ((PdfNumber) (pdfdictionary)).longValue();
	//   57  126:aload_0         
	//   58  127:aload_1         
	//   59  128:invokevirtual   #506 <Method long PdfNumber.longValue()>
	//   60  131:putfield        #146 <Field long permissions>
		pdfdictionary = ((PdfDictionary) (MessageDigest.getInstance("SHA-256")));
	//   61  134:ldc2            #376 <String "SHA-256">
	//   62  137:invokestatic    #123 <Method MessageDigest MessageDigest.getInstance(String)>
	//   63  140:astore_1        
		((MessageDigest) (pdfdictionary)).update(abyte1, 0, Math.min(abyte1.length, 127));
	//   64  141:aload_1         
	//   65  142:aload           5
	//   66  144:iconst_0        
	//   67  145:aload           5
	//   68  147:arraylength     
	//   69  148:bipush          127
	//   70  150:invokestatic    #260 <Method int Math.min(int, int)>
	//   71  153:invokevirtual   #174 <Method void MessageDigest.update(byte[], int, int)>
		((MessageDigest) (pdfdictionary)).update(abyte0, 32, 8);
	//   72  156:aload_1         
	//   73  157:aload_2         
	//   74  158:bipush          32
	//   75  160:bipush          8
	//   76  162:invokevirtual   #174 <Method void MessageDigest.update(byte[], int, int)>
		((MessageDigest) (pdfdictionary)).update(abyte2, 0, 48);
	//   77  165:aload_1         
	//   78  166:aload           6
	//   79  168:iconst_0        
	//   80  169:bipush          48
	//   81  171:invokevirtual   #174 <Method void MessageDigest.update(byte[], int, int)>
		flag1 = compareArray(((MessageDigest) (pdfdictionary)).digest(), abyte0, 32);
	//   82  174:aload_1         
	//   83  175:invokevirtual   #177 <Method byte[] MessageDigest.digest()>
	//   84  178:aload_2         
	//   85  179:bipush          32
	//   86  181:invokestatic    #508 <Method boolean compareArray(byte[], byte[], int)>
	//   87  184:istore          4
		if(!flag1) goto _L2; else goto _L1
	//   88  186:iload           4
	//   89  188:ifeq            319
_L1:
		((MessageDigest) (pdfdictionary)).update(abyte1, 0, Math.min(abyte1.length, 127));
	//   90  191:aload_1         
	//   91  192:aload           5
	//   92  194:iconst_0        
	//   93  195:aload           5
	//   94  197:arraylength     
	//   95  198:bipush          127
	//   96  200:invokestatic    #260 <Method int Math.min(int, int)>
	//   97  203:invokevirtual   #174 <Method void MessageDigest.update(byte[], int, int)>
		((MessageDigest) (pdfdictionary)).update(abyte0, 40, 8);
	//   98  206:aload_1         
	//   99  207:aload_2         
	//  100  208:bipush          40
	//  101  210:bipush          8
	//  102  212:invokevirtual   #174 <Method void MessageDigest.update(byte[], int, int)>
		((MessageDigest) (pdfdictionary)).update(abyte2, 0, 48);
	//  103  215:aload_1         
	//  104  216:aload           6
	//  105  218:iconst_0        
	//  106  219:bipush          48
	//  107  221:invokevirtual   #174 <Method void MessageDigest.update(byte[], int, int)>
		key = (new AESCipherCBCnoPad(false, ((MessageDigest) (pdfdictionary)).digest())).processBlock(abyte3, 0, abyte3.length);
	//  108  224:aload_0         
	//  109  225:new             #510 <Class AESCipherCBCnoPad>
	//  110  228:dup             
	//  111  229:iconst_0        
	//  112  230:aload_1         
	//  113  231:invokevirtual   #177 <Method byte[] MessageDigest.digest()>
	//  114  234:invokespecial   #513 <Method void AESCipherCBCnoPad(boolean, byte[])>
	//  115  237:aload           7
	//  116  239:iconst_0        
	//  117  240:aload           7
	//  118  242:arraylength     
	//  119  243:invokevirtual   #516 <Method byte[] AESCipherCBCnoPad.processBlock(byte[], int, int)>
	//  120  246:putfield        #137 <Field byte[] key>
_L3:
		pdfdictionary = ((PdfDictionary) ((new AESCipherCBCnoPad(false, key)).processBlock(abyte5, 0, abyte5.length)));
	//  121  249:new             #510 <Class AESCipherCBCnoPad>
	//  122  252:dup             
	//  123  253:iconst_0        
	//  124  254:aload_0         
	//  125  255:getfield        #137 <Field byte[] key>
	//  126  258:invokespecial   #513 <Method void AESCipherCBCnoPad(boolean, byte[])>
	//  127  261:aload           9
	//  128  263:iconst_0        
	//  129  264:aload           9
	//  130  266:arraylength     
	//  131  267:invokevirtual   #516 <Method byte[] AESCipherCBCnoPad.processBlock(byte[], int, int)>
	//  132  270:astore_1        
		if(pdfdictionary[9] != 97 || pdfdictionary[10] != 100 || pdfdictionary[11] != 98)
	//* 133  271:aload_1         
	//* 134  272:bipush          9
	//* 135  274:baload          
	//* 136  275:bipush          97
	//* 137  277:icmpne          298
	//* 138  280:aload_1         
	//* 139  281:bipush          10
	//* 140  283:baload          
	//* 141  284:bipush          100
	//* 142  286:icmpne          298
	//* 143  289:aload_1         
	//* 144  290:bipush          11
	//* 145  292:baload          
	//* 146  293:bipush          98
	//* 147  295:icmpeq          439
			try
			{
				throw new BadPasswordException(MessageLocalization.getComposedMessage("bad.user.password", new Object[0]));
	//  148  298:new             #490 <Class BadPasswordException>
	//  149  301:dup             
	//  150  302:ldc2            #518 <String "bad.user.password">
	//  151  305:iconst_0        
	//  152  306:anewarray       Object[]
	//  153  309:invokestatic    #524 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  154  312:invokespecial   #527 <Method void BadPasswordException(String)>
	//  155  315:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(PdfDictionary pdfdictionary)
	//* 156  316:astore_1        
			{
				throw pdfdictionary;
	//  157  317:aload_1         
	//  158  318:athrow          
			}
	//* 159  319:aload_1         
	//* 160  320:aload           5
	//* 161  322:iconst_0        
	//* 162  323:aload           5
	//* 163  325:arraylength     
	//* 164  326:bipush          127
	//* 165  328:invokestatic    #260 <Method int Math.min(int, int)>
	//* 166  331:invokevirtual   #174 <Method void MessageDigest.update(byte[], int, int)>
	//* 167  334:aload_1         
	//* 168  335:aload           6
	//* 169  337:bipush          32
	//* 170  339:bipush          8
	//* 171  341:invokevirtual   #174 <Method void MessageDigest.update(byte[], int, int)>
	//* 172  344:aload_1         
	//* 173  345:invokevirtual   #177 <Method byte[] MessageDigest.digest()>
	//* 174  348:aload           6
	//* 175  350:bipush          32
	//* 176  352:invokestatic    #508 <Method boolean compareArray(byte[], byte[], int)>
	//* 177  355:ifne            386
	//* 178  358:new             #490 <Class BadPasswordException>
	//* 179  361:dup             
	//* 180  362:ldc2            #518 <String "bad.user.password">
	//* 181  365:iconst_0        
	//* 182  366:anewarray       Object[]
	//* 183  369:invokestatic    #524 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 184  372:invokespecial   #527 <Method void BadPasswordException(String)>
	//* 185  375:athrow          
			// Misplaced declaration of an exception variable
			catch(PdfDictionary pdfdictionary)
	//* 186  376:astore_1        
			{
				throw new ExceptionConverter(((Exception) (pdfdictionary)));
	//  187  377:new             #130 <Class ExceptionConverter>
	//  188  380:dup             
	//  189  381:aload_1         
	//  190  382:invokespecial   #133 <Method void ExceptionConverter(Exception)>
	//  191  385:athrow          
			}
		break MISSING_BLOCK_LABEL_439;
_L2:
		((MessageDigest) (pdfdictionary)).update(abyte1, 0, Math.min(abyte1.length, 127));
		((MessageDigest) (pdfdictionary)).update(abyte2, 32, 8);
		if(!compareArray(((MessageDigest) (pdfdictionary)).digest(), abyte2, 32))
			throw new BadPasswordException(MessageLocalization.getComposedMessage("bad.user.password", new Object[0]));
		((MessageDigest) (pdfdictionary)).update(abyte1, 0, Math.min(abyte1.length, 127));
	//  192  386:aload_1         
	//  193  387:aload           5
	//  194  389:iconst_0        
	//  195  390:aload           5
	//  196  392:arraylength     
	//  197  393:bipush          127
	//  198  395:invokestatic    #260 <Method int Math.min(int, int)>
	//  199  398:invokevirtual   #174 <Method void MessageDigest.update(byte[], int, int)>
		((MessageDigest) (pdfdictionary)).update(abyte2, 40, 8);
	//  200  401:aload_1         
	//  201  402:aload           6
	//  202  404:bipush          40
	//  203  406:bipush          8
	//  204  408:invokevirtual   #174 <Method void MessageDigest.update(byte[], int, int)>
		key = (new AESCipherCBCnoPad(false, ((MessageDigest) (pdfdictionary)).digest())).processBlock(abyte4, 0, abyte4.length);
	//  205  411:aload_0         
	//  206  412:new             #510 <Class AESCipherCBCnoPad>
	//  207  415:dup             
	//  208  416:iconst_0        
	//  209  417:aload_1         
	//  210  418:invokevirtual   #177 <Method byte[] MessageDigest.digest()>
	//  211  421:invokespecial   #513 <Method void AESCipherCBCnoPad(boolean, byte[])>
	//  212  424:aload           8
	//  213  426:iconst_0        
	//  214  427:aload           8
	//  215  429:arraylength     
	//  216  430:invokevirtual   #516 <Method byte[] AESCipherCBCnoPad.processBlock(byte[], int, int)>
	//  217  433:putfield        #137 <Field byte[] key>
		  goto _L3
	//* 218  436:goto            249
		permissions = pdfdictionary[0] & 0xff | (pdfdictionary[1] & 0xff) << 8 | (pdfdictionary[2] & 0xff) << 16 | (pdfdictionary[2] & 0xff) << 24;
	//  219  439:aload_0         
	//  220  440:aload_1         
	//  221  441:iconst_0        
	//  222  442:baload          
	//  223  443:sipush          255
	//  224  446:iand            
	//  225  447:aload_1         
	//  226  448:iconst_1        
	//  227  449:baload          
	//  228  450:sipush          255
	//  229  453:iand            
	//  230  454:bipush          8
	//  231  456:ishl            
	//  232  457:ior             
	//  233  458:aload_1         
	//  234  459:iconst_2        
	//  235  460:baload          
	//  236  461:sipush          255
	//  237  464:iand            
	//  238  465:bipush          16
	//  239  467:ishl            
	//  240  468:ior             
	//  241  469:aload_1         
	//  242  470:iconst_2        
	//  243  471:baload          
	//  244  472:sipush          255
	//  245  475:iand            
	//  246  476:bipush          24
	//  247  478:ishl            
	//  248  479:ior             
	//  249  480:i2l             
	//  250  481:putfield        #146 <Field long permissions>
		boolean flag;
		if(pdfdictionary[8] == 84)
	//* 251  484:aload_1         
	//* 252  485:bipush          8
	//* 253  487:baload          
	//* 254  488:bipush          84
	//* 255  490:icmpne          503
			flag = true;
	//  256  493:iconst_1        
	//  257  494:istore_3        
		else
	//* 258  495:aload_0         
	//* 259  496:iload_3         
	//* 260  497:putfield        #154 <Field boolean encryptMetadata>
	//* 261  500:iload           4
	//* 262  502:ireturn         
			flag = false;
	//  263  503:iconst_0        
	//  264  504:istore_3        
		encryptMetadata = flag;
		return flag1;
	//* 265  505:goto            495
	}

	public void setCryptoMode(int i, int j)
	{
		cryptoMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #331 <Field int cryptoMode>
		boolean flag;
		if((i & 8) != 8)
	//*   3    5:iload_1         
	//*   4    6:bipush          8
	//*   5    8:iand            
	//*   6    9:bipush          8
	//*   7   11:icmpeq          90
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_3        
		else
	//*  10   16:aload_0         
	//*  11   17:iload_3         
	//*  12   18:putfield        #154 <Field boolean encryptMetadata>
	//*  13   21:iload_1         
	//*  14   22:bipush          24
	//*  15   24:iand            
	//*  16   25:bipush          24
	//*  17   27:icmpne          95
	//*  18   30:iconst_1        
	//*  19   31:istore_3        
	//*  20   32:aload_0         
	//*  21   33:iload_3         
	//*  22   34:putfield        #156 <Field boolean embeddedFilesOnly>
	//*  23   37:iload_1         
	//*  24   38:bipush          7
	//*  25   40:iand            
	//*  26   41:tableswitch     0 3: default 72
	//	               0 100
	//	               1 122
	//	               2 152
	//	               3 165
	//*  27   72:new             #531 <Class IllegalArgumentException>
	//*  28   75:dup             
	//*  29   76:ldc2            #533 <String "no.valid.encryption.mode">
	//*  30   79:iconst_0        
	//*  31   80:anewarray       Object[]
	//*  32   83:invokestatic    #524 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  33   86:invokespecial   #534 <Method void IllegalArgumentException(String)>
	//*  34   89:athrow          
			flag = false;
	//   35   90:iconst_0        
	//   36   91:istore_3        
		encryptMetadata = flag;
		if((i & 0x18) == 24)
			flag = true;
		else
	//*  37   92:goto            16
			flag = false;
	//   38   95:iconst_0        
	//   39   96:istore_3        
		embeddedFilesOnly = flag;
		switch(i & 7)
		{
		default:
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("no.valid.encryption.mode", new Object[0]));

	//*  40   97:goto            32
		case 0: // '\0'
			encryptMetadata = true;
	//   41  100:aload_0         
	//   42  101:iconst_1        
	//   43  102:putfield        #154 <Field boolean encryptMetadata>
			embeddedFilesOnly = false;
	//   44  105:aload_0         
	//   45  106:iconst_0        
	//   46  107:putfield        #156 <Field boolean embeddedFilesOnly>
			keyLength = 40;
	//   47  110:aload_0         
	//   48  111:bipush          40
	//   49  113:putfield        #152 <Field int keyLength>
			revision = 2;
	//   50  116:aload_0         
	//   51  117:iconst_2        
	//   52  118:putfield        #150 <Field int revision>
			return;
	//   53  121:return          

		case 1: // '\001'
			embeddedFilesOnly = false;
	//   54  122:aload_0         
	//   55  123:iconst_0        
	//   56  124:putfield        #156 <Field boolean embeddedFilesOnly>
			if(j > 0)
	//*  57  127:iload_2         
	//*  58  128:ifle            142
				keyLength = j;
	//   59  131:aload_0         
	//   60  132:iload_2         
	//   61  133:putfield        #152 <Field int keyLength>
			else
	//*  62  136:aload_0         
	//*  63  137:iconst_3        
	//*  64  138:putfield        #150 <Field int revision>
	//*  65  141:return          
				keyLength = 128;
	//   66  142:aload_0         
	//   67  143:sipush          128
	//   68  146:putfield        #152 <Field int keyLength>
			revision = 3;
			return;

	//*  69  149:goto            136
		case 2: // '\002'
			keyLength = 128;
	//   70  152:aload_0         
	//   71  153:sipush          128
	//   72  156:putfield        #152 <Field int keyLength>
			revision = 4;
	//   73  159:aload_0         
	//   74  160:iconst_4        
	//   75  161:putfield        #150 <Field int revision>
			return;
	//   76  164:return          

		case 3: // '\003'
			keyLength = 256;
	//   77  165:aload_0         
	//   78  166:sipush          256
	//   79  169:putfield        #152 <Field int keyLength>
			keySize = 32;
	//   80  172:aload_0         
	//   81  173:bipush          32
	//   82  175:putfield        #144 <Field int keySize>
			revision = 5;
	//   83  178:aload_0         
	//   84  179:iconst_5        
	//   85  180:putfield        #150 <Field int revision>
			return;
	//   86  183:return          
		}
	}

	public void setHashKey(int i, int j)
	{
		if(revision != 5)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field int revision>
	//*   2    4:iconst_5        
	//*   3    5:icmpne          9
	//*   4    8:return          
		{
			md5.reset();
	//    5    9:aload_0         
	//    6   10:getfield        #125 <Field MessageDigest md5>
	//    7   13:invokevirtual   #275 <Method void MessageDigest.reset()>
			extra[0] = (byte)i;
	//    8   16:aload_0         
	//    9   17:getfield        #110 <Field byte[] extra>
	//   10   20:iconst_0        
	//   11   21:iload_1         
	//   12   22:int2byte        
	//   13   23:bastore         
			extra[1] = (byte)(i >> 8);
	//   14   24:aload_0         
	//   15   25:getfield        #110 <Field byte[] extra>
	//   16   28:iconst_1        
	//   17   29:iload_1         
	//   18   30:bipush          8
	//   19   32:ishr            
	//   20   33:int2byte        
	//   21   34:bastore         
			extra[2] = (byte)(i >> 16);
	//   22   35:aload_0         
	//   23   36:getfield        #110 <Field byte[] extra>
	//   24   39:iconst_2        
	//   25   40:iload_1         
	//   26   41:bipush          16
	//   27   43:ishr            
	//   28   44:int2byte        
	//   29   45:bastore         
			extra[3] = (byte)j;
	//   30   46:aload_0         
	//   31   47:getfield        #110 <Field byte[] extra>
	//   32   50:iconst_3        
	//   33   51:iload_2         
	//   34   52:int2byte        
	//   35   53:bastore         
			extra[4] = (byte)(j >> 8);
	//   36   54:aload_0         
	//   37   55:getfield        #110 <Field byte[] extra>
	//   38   58:iconst_4        
	//   39   59:iload_2         
	//   40   60:bipush          8
	//   41   62:ishr            
	//   42   63:int2byte        
	//   43   64:bastore         
			md5.update(mkey);
	//   44   65:aload_0         
	//   45   66:getfield        #125 <Field MessageDigest md5>
	//   46   69:aload_0         
	//   47   70:getfield        #102 <Field byte[] mkey>
	//   48   73:invokevirtual   #277 <Method void MessageDigest.update(byte[])>
			md5.update(extra);
	//   49   76:aload_0         
	//   50   77:getfield        #125 <Field MessageDigest md5>
	//   51   80:aload_0         
	//   52   81:getfield        #110 <Field byte[] extra>
	//   53   84:invokevirtual   #277 <Method void MessageDigest.update(byte[])>
			if(revision == 4)
	//*  54   87:aload_0         
	//*  55   88:getfield        #150 <Field int revision>
	//*  56   91:iconst_4        
	//*  57   92:icmpne          105
				md5.update(salt);
	//   58   95:aload_0         
	//   59   96:getfield        #125 <Field MessageDigest md5>
	//   60   99:getstatic       #84  <Field byte[] salt>
	//   61  102:invokevirtual   #277 <Method void MessageDigest.update(byte[])>
			key = md5.digest();
	//   62  105:aload_0         
	//   63  106:aload_0         
	//   64  107:getfield        #125 <Field MessageDigest md5>
	//   65  110:invokevirtual   #177 <Method byte[] MessageDigest.digest()>
	//   66  113:putfield        #137 <Field byte[] key>
			keySize = mkey.length + 5;
	//   67  116:aload_0         
	//   68  117:aload_0         
	//   69  118:getfield        #102 <Field byte[] mkey>
	//   70  121:arraylength     
	//   71  122:iconst_5        
	//   72  123:iadd            
	//   73  124:putfield        #144 <Field int keySize>
			if(keySize > 16)
	//*  74  127:aload_0         
	//*  75  128:getfield        #144 <Field int keySize>
	//*  76  131:bipush          16
	//*  77  133:icmple          8
			{
				keySize = 16;
	//   78  136:aload_0         
	//   79  137:bipush          16
	//   80  139:putfield        #144 <Field int keySize>
				return;
	//   81  142:return          
			}
		}
	}

	public void setKey(byte abyte0[])
	{
		key = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #137 <Field byte[] key>
	//    3    5:return          
	}

	public void setupAllKeys(byte abyte0[], byte abyte1[], int i)
	{
		byte abyte2[];
label0:
		{
			if(abyte1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
			{
				abyte2 = abyte1;
	//    2    4:aload_2         
	//    3    5:astore          6
				if(abyte1.length != 0)
					break label0;
	//    4    7:aload_2         
	//    5    8:arraylength     
	//    6    9:ifne            24
			}
			abyte2 = md5.digest(createDocumentId());
	//    7   12:aload_0         
	//    8   13:getfield        #125 <Field MessageDigest md5>
	//    9   16:invokestatic    #235 <Method byte[] createDocumentId()>
	//   10   19:invokevirtual   #170 <Method byte[] MessageDigest.digest(byte[])>
	//   11   22:astore          6
		}
		char c;
		byte abyte3[];
		byte abyte4[];
		if(revision == 3 || revision == 4 || revision == 5)
	//*  12   24:aload_0         
	//*  13   25:getfield        #150 <Field int revision>
	//*  14   28:iconst_3        
	//*  15   29:icmpeq          48
	//*  16   32:aload_0         
	//*  17   33:getfield        #150 <Field int revision>
	//*  18   36:iconst_4        
	//*  19   37:icmpeq          48
	//*  20   40:aload_0         
	//*  21   41:getfield        #150 <Field int revision>
	//*  22   44:iconst_5        
	//*  23   45:icmpne          495
			c = '\uF0C0';
	//   24   48:sipush          -3904
	//   25   51:istore          5
		else
	//*  26   53:iload_3         
	//*  27   54:iload           5
	//*  28   56:ior             
	//*  29   57:bipush          -4
	//*  30   59:iand            
	//*  31   60:istore_3        
	//*  32   61:aload_0         
	//*  33   62:iload_3         
	//*  34   63:i2l             
	//*  35   64:putfield        #146 <Field long permissions>
	//*  36   67:aload_0         
	//*  37   68:getfield        #150 <Field int revision>
	//*  38   71:iconst_5        
	//*  39   72:icmpne          519
	//*  40   75:aload_1         
	//*  41   76:astore_2        
	//*  42   77:aload_1         
	//*  43   78:ifnonnull       85
	//*  44   81:iconst_0        
	//*  45   82:newarray        byte[]
	//*  46   84:astore_2        
	//*  47   85:aload_0         
	//*  48   86:invokestatic    #235 <Method byte[] createDocumentId()>
	//*  49   89:putfield        #148 <Field byte[] documentID>
	//*  50   92:bipush          8
	//*  51   94:invokestatic    #543 <Method byte[] IVGenerator.getIV(int)>
	//*  52   97:astore          7
	//*  53   99:bipush          8
	//*  54  101:invokestatic    #543 <Method byte[] IVGenerator.getIV(int)>
	//*  55  104:astore          8
	//*  56  106:aload_0         
	//*  57  107:bipush          32
	//*  58  109:invokestatic    #543 <Method byte[] IVGenerator.getIV(int)>
	//*  59  112:putfield        #137 <Field byte[] key>
	//*  60  115:ldc2            #376 <String "SHA-256">
	//*  61  118:invokestatic    #123 <Method MessageDigest MessageDigest.getInstance(String)>
	//*  62  121:astore_1        
	//*  63  122:aload_1         
	//*  64  123:aload_2         
	//*  65  124:iconst_0        
	//*  66  125:aload_2         
	//*  67  126:arraylength     
	//*  68  127:bipush          127
	//*  69  129:invokestatic    #260 <Method int Math.min(int, int)>
	//*  70  132:invokevirtual   #174 <Method void MessageDigest.update(byte[], int, int)>
	//*  71  135:aload_1         
	//*  72  136:aload           7
	//*  73  138:invokevirtual   #277 <Method void MessageDigest.update(byte[])>
	//*  74  141:aload_0         
	//*  75  142:bipush          48
	//*  76  144:newarray        byte[]
	//*  77  146:putfield        #106 <Field byte[] userKey>
	//*  78  149:aload_1         
	//*  79  150:aload_0         
	//*  80  151:getfield        #106 <Field byte[] userKey>
	//*  81  154:iconst_0        
	//*  82  155:bipush          32
	//*  83  157:invokevirtual   #546 <Method int MessageDigest.digest(byte[], int, int)>
	//*  84  160:pop             
	//*  85  161:aload           7
	//*  86  163:iconst_0        
	//*  87  164:aload_0         
	//*  88  165:getfield        #106 <Field byte[] userKey>
	//*  89  168:bipush          32
	//*  90  170:bipush          8
	//*  91  172:invokestatic    #181 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  92  175:aload           8
	//*  93  177:iconst_0        
	//*  94  178:aload_0         
	//*  95  179:getfield        #106 <Field byte[] userKey>
	//*  96  182:bipush          40
	//*  97  184:bipush          8
	//*  98  186:invokestatic    #181 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  99  189:aload_1         
	//* 100  190:aload_2         
	//* 101  191:iconst_0        
	//* 102  192:aload_2         
	//* 103  193:arraylength     
	//* 104  194:bipush          127
	//* 105  196:invokestatic    #260 <Method int Math.min(int, int)>
	//* 106  199:invokevirtual   #174 <Method void MessageDigest.update(byte[], int, int)>
	//* 107  202:aload_1         
	//* 108  203:aload           8
	//* 109  205:invokevirtual   #277 <Method void MessageDigest.update(byte[])>
	//* 110  208:aload_0         
	//* 111  209:new             #510 <Class AESCipherCBCnoPad>
	//* 112  212:dup             
	//* 113  213:iconst_1        
	//* 114  214:aload_1         
	//* 115  215:invokevirtual   #177 <Method byte[] MessageDigest.digest()>
	//* 116  218:invokespecial   #513 <Method void AESCipherCBCnoPad(boolean, byte[])>
	//* 117  221:aload_0         
	//* 118  222:getfield        #137 <Field byte[] key>
	//* 119  225:iconst_0        
	//* 120  226:aload_0         
	//* 121  227:getfield        #137 <Field byte[] key>
	//* 122  230:arraylength     
	//* 123  231:invokevirtual   #516 <Method byte[] AESCipherCBCnoPad.processBlock(byte[], int, int)>
	//* 124  234:putfield        #158 <Field byte[] ueKey>
	//* 125  237:bipush          8
	//* 126  239:invokestatic    #543 <Method byte[] IVGenerator.getIV(int)>
	//* 127  242:astore_2        
	//* 128  243:bipush          8
	//* 129  245:invokestatic    #543 <Method byte[] IVGenerator.getIV(int)>
	//* 130  248:astore          7
	//* 131  250:aload_1         
	//* 132  251:aload           6
	//* 133  253:iconst_0        
	//* 134  254:aload           6
	//* 135  256:arraylength     
	//* 136  257:bipush          127
	//* 137  259:invokestatic    #260 <Method int Math.min(int, int)>
	//* 138  262:invokevirtual   #174 <Method void MessageDigest.update(byte[], int, int)>
	//* 139  265:aload_1         
	//* 140  266:aload_2         
	//* 141  267:invokevirtual   #277 <Method void MessageDigest.update(byte[])>
	//* 142  270:aload_1         
	//* 143  271:aload_0         
	//* 144  272:getfield        #106 <Field byte[] userKey>
	//* 145  275:invokevirtual   #277 <Method void MessageDigest.update(byte[])>
	//* 146  278:aload_0         
	//* 147  279:bipush          48
	//* 148  281:newarray        byte[]
	//* 149  283:putfield        #104 <Field byte[] ownerKey>
	//* 150  286:aload_1         
	//* 151  287:aload_0         
	//* 152  288:getfield        #104 <Field byte[] ownerKey>
	//* 153  291:iconst_0        
	//* 154  292:bipush          32
	//* 155  294:invokevirtual   #546 <Method int MessageDigest.digest(byte[], int, int)>
	//* 156  297:pop             
	//* 157  298:aload_2         
	//* 158  299:iconst_0        
	//* 159  300:aload_0         
	//* 160  301:getfield        #104 <Field byte[] ownerKey>
	//* 161  304:bipush          32
	//* 162  306:bipush          8
	//* 163  308:invokestatic    #181 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 164  311:aload           7
	//* 165  313:iconst_0        
	//* 166  314:aload_0         
	//* 167  315:getfield        #104 <Field byte[] ownerKey>
	//* 168  318:bipush          40
	//* 169  320:bipush          8
	//* 170  322:invokestatic    #181 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 171  325:aload_1         
	//* 172  326:aload           6
	//* 173  328:iconst_0        
	//* 174  329:aload           6
	//* 175  331:arraylength     
	//* 176  332:bipush          127
	//* 177  334:invokestatic    #260 <Method int Math.min(int, int)>
	//* 178  337:invokevirtual   #174 <Method void MessageDigest.update(byte[], int, int)>
	//* 179  340:aload_1         
	//* 180  341:aload           7
	//* 181  343:invokevirtual   #277 <Method void MessageDigest.update(byte[])>
	//* 182  346:aload_1         
	//* 183  347:aload_0         
	//* 184  348:getfield        #106 <Field byte[] userKey>
	//* 185  351:invokevirtual   #277 <Method void MessageDigest.update(byte[])>
	//* 186  354:aload_0         
	//* 187  355:new             #510 <Class AESCipherCBCnoPad>
	//* 188  358:dup             
	//* 189  359:iconst_1        
	//* 190  360:aload_1         
	//* 191  361:invokevirtual   #177 <Method byte[] MessageDigest.digest()>
	//* 192  364:invokespecial   #513 <Method void AESCipherCBCnoPad(boolean, byte[])>
	//* 193  367:aload_0         
	//* 194  368:getfield        #137 <Field byte[] key>
	//* 195  371:iconst_0        
	//* 196  372:aload_0         
	//* 197  373:getfield        #137 <Field byte[] key>
	//* 198  376:arraylength     
	//* 199  377:invokevirtual   #516 <Method byte[] AESCipherCBCnoPad.processBlock(byte[], int, int)>
	//* 200  380:putfield        #160 <Field byte[] oeKey>
	//* 201  383:bipush          16
	//* 202  385:invokestatic    #543 <Method byte[] IVGenerator.getIV(int)>
	//* 203  388:astore_1        
	//* 204  389:aload_1         
	//* 205  390:iconst_0        
	//* 206  391:iload_3         
	//* 207  392:int2byte        
	//* 208  393:bastore         
	//* 209  394:aload_1         
	//* 210  395:iconst_1        
	//* 211  396:iload_3         
	//* 212  397:bipush          8
	//* 213  399:ishr            
	//* 214  400:int2byte        
	//* 215  401:bastore         
	//* 216  402:aload_1         
	//* 217  403:iconst_2        
	//* 218  404:iload_3         
	//* 219  405:bipush          16
	//* 220  407:ishr            
	//* 221  408:int2byte        
	//* 222  409:bastore         
	//* 223  410:aload_1         
	//* 224  411:iconst_3        
	//* 225  412:iload_3         
	//* 226  413:bipush          24
	//* 227  415:ishr            
	//* 228  416:int2byte        
	//* 229  417:bastore         
	//* 230  418:aload_1         
	//* 231  419:iconst_4        
	//* 232  420:iconst_m1       
	//* 233  421:bastore         
	//* 234  422:aload_1         
	//* 235  423:iconst_5        
	//* 236  424:iconst_m1       
	//* 237  425:bastore         
	//* 238  426:aload_1         
	//* 239  427:bipush          6
	//* 240  429:iconst_m1       
	//* 241  430:bastore         
	//* 242  431:aload_1         
	//* 243  432:bipush          7
	//* 244  434:iconst_m1       
	//* 245  435:bastore         
	//* 246  436:aload_0         
	//* 247  437:getfield        #154 <Field boolean encryptMetadata>
	//* 248  440:ifeq            502
	//* 249  443:bipush          84
	//* 250  445:istore          4
	//* 251  447:aload_1         
	//* 252  448:bipush          8
	//* 253  450:iload           4
	//* 254  452:bastore         
	//* 255  453:aload_1         
	//* 256  454:bipush          9
	//* 257  456:bipush          97
	//* 258  458:bastore         
	//* 259  459:aload_1         
	//* 260  460:bipush          10
	//* 261  462:bipush          100
	//* 262  464:bastore         
	//* 263  465:aload_1         
	//* 264  466:bipush          11
	//* 265  468:bipush          98
	//* 266  470:bastore         
	//* 267  471:aload_0         
	//* 268  472:new             #510 <Class AESCipherCBCnoPad>
	//* 269  475:dup             
	//* 270  476:iconst_1        
	//* 271  477:aload_0         
	//* 272  478:getfield        #137 <Field byte[] key>
	//* 273  481:invokespecial   #513 <Method void AESCipherCBCnoPad(boolean, byte[])>
	//* 274  484:aload_1         
	//* 275  485:iconst_0        
	//* 276  486:aload_1         
	//* 277  487:arraylength     
	//* 278  488:invokevirtual   #516 <Method byte[] AESCipherCBCnoPad.processBlock(byte[], int, int)>
	//* 279  491:putfield        #162 <Field byte[] perms>
	//* 280  494:return          
			c = '\uFFC0';
	//  281  495:bipush          -64
	//  282  497:istore          5
		i = (i | c) & -4;
		permissions = i;
		if(revision != 5)
			break MISSING_BLOCK_LABEL_519;
		abyte1 = abyte0;
		if(abyte0 != null)
			break MISSING_BLOCK_LABEL_85;
		abyte1 = new byte[0];
		documentID = createDocumentId();
		abyte3 = IVGenerator.getIV(8);
		abyte4 = IVGenerator.getIV(8);
		key = IVGenerator.getIV(32);
		abyte0 = ((byte []) (MessageDigest.getInstance("SHA-256")));
		((MessageDigest) (abyte0)).update(abyte1, 0, Math.min(abyte1.length, 127));
		((MessageDigest) (abyte0)).update(abyte3);
		userKey = new byte[48];
		((MessageDigest) (abyte0)).digest(userKey, 0, 32);
		System.arraycopy(((Object) (abyte3)), 0, ((Object) (userKey)), 32, 8);
		System.arraycopy(((Object) (abyte4)), 0, ((Object) (userKey)), 40, 8);
		((MessageDigest) (abyte0)).update(abyte1, 0, Math.min(abyte1.length, 127));
		((MessageDigest) (abyte0)).update(abyte4);
		ueKey = (new AESCipherCBCnoPad(true, ((MessageDigest) (abyte0)).digest())).processBlock(key, 0, key.length);
		abyte1 = IVGenerator.getIV(8);
		abyte3 = IVGenerator.getIV(8);
		((MessageDigest) (abyte0)).update(abyte2, 0, Math.min(abyte2.length, 127));
		((MessageDigest) (abyte0)).update(abyte1);
		((MessageDigest) (abyte0)).update(userKey);
		ownerKey = new byte[48];
		((MessageDigest) (abyte0)).digest(ownerKey, 0, 32);
		System.arraycopy(((Object) (abyte1)), 0, ((Object) (ownerKey)), 32, 8);
		System.arraycopy(((Object) (abyte3)), 0, ((Object) (ownerKey)), 40, 8);
		((MessageDigest) (abyte0)).update(abyte2, 0, Math.min(abyte2.length, 127));
		((MessageDigest) (abyte0)).update(abyte3);
		((MessageDigest) (abyte0)).update(userKey);
		oeKey = (new AESCipherCBCnoPad(true, ((MessageDigest) (abyte0)).digest())).processBlock(key, 0, key.length);
		abyte0 = IVGenerator.getIV(16);
		abyte0[0] = (byte)i;
		abyte0[1] = (byte)(i >> 8);
		abyte0[2] = (byte)(i >> 16);
		abyte0[3] = (byte)(i >> 24);
		abyte0[4] = -1;
		abyte0[5] = -1;
		abyte0[6] = -1;
		abyte0[7] = -1;
		byte byte0;
		if(encryptMetadata)
			byte0 = 84;
		else
	//* 283  499:goto            53
			byte0 = 70;
	//  284  502:bipush          70
	//  285  504:istore          4
		abyte0[8] = byte0;
		abyte0[9] = 97;
		abyte0[10] = 100;
		abyte0[11] = 98;
		try
		{
			perms = (new AESCipherCBCnoPad(true, key)).processBlock(abyte0, 0, abyte0.length);
			return;
		}
	//* 286  506:goto            447
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 287  509:astore_1        
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
	//  288  510:new             #130 <Class ExceptionConverter>
	//  289  513:dup             
	//  290  514:aload_1         
	//  291  515:invokespecial   #133 <Method void ExceptionConverter(Exception)>
	//  292  518:athrow          
		}
		abyte0 = padPassword(abyte0);
	//  293  519:aload_0         
	//  294  520:aload_1         
	//  295  521:invokespecial   #298 <Method byte[] padPassword(byte[])>
	//  296  524:astore_1        
		ownerKey = computeOwnerKey(abyte0, padPassword(abyte2));
	//  297  525:aload_0         
	//  298  526:aload_0         
	//  299  527:aload_1         
	//  300  528:aload_0         
	//  301  529:aload           6
	//  302  531:invokespecial   #298 <Method byte[] padPassword(byte[])>
	//  303  534:invokespecial   #264 <Method byte[] computeOwnerKey(byte[], byte[])>
	//  304  537:putfield        #104 <Field byte[] ownerKey>
		documentID = createDocumentId();
	//  305  540:aload_0         
	//  306  541:invokestatic    #235 <Method byte[] createDocumentId()>
	//  307  544:putfield        #148 <Field byte[] documentID>
		setupByUserPad(documentID, abyte0, ownerKey, i);
	//  308  547:aload_0         
	//  309  548:aload_0         
	//  310  549:getfield        #148 <Field byte[] documentID>
	//  311  552:aload_1         
	//  312  553:aload_0         
	//  313  554:getfield        #104 <Field byte[] ownerKey>
	//  314  557:iload_3         
	//  315  558:i2l             
	//  316  559:invokespecial   #548 <Method void setupByUserPad(byte[], byte[], byte[], long)>
		return;
	//  317  562:return          
	}

	public void setupByEncryptionKey(byte abyte0[], int i)
	{
		mkey = new byte[i / 8];
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:bipush          8
	//    3    4:idiv            
	//    4    5:newarray        byte[]
	//    5    7:putfield        #102 <Field byte[] mkey>
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (mkey)), 0, mkey.length);
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:aload_0         
	//    9   13:getfield        #102 <Field byte[] mkey>
	//   10   16:iconst_0        
	//   11   17:aload_0         
	//   12   18:getfield        #102 <Field byte[] mkey>
	//   13   21:arraylength     
	//   14   22:invokestatic    #181 <Method void System.arraycopy(Object, int, Object, int, int)>
	//   15   25:return          
	}

	public void setupByOwnerPassword(byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[], long l)
	{
		setupByOwnerPad(abyte0, padPassword(abyte1), abyte2, abyte3, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_2         
	//    4    4:invokespecial   #298 <Method byte[] padPassword(byte[])>
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:lload           5
	//    8   12:invokespecial   #551 <Method void setupByOwnerPad(byte[], byte[], byte[], byte[], long)>
	//    9   15:return          
	}

	public void setupByUserPassword(byte abyte0[], byte abyte1[], byte abyte2[], long l)
	{
		setupByUserPad(abyte0, padPassword(abyte1), abyte2, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_2         
	//    4    4:invokespecial   #298 <Method byte[] padPassword(byte[])>
	//    5    7:aload_3         
	//    6    8:lload           4
	//    7   10:invokespecial   #548 <Method void setupByUserPad(byte[], byte[], byte[], long)>
	//    8   13:return          
	}

	public static final int AES_128 = 4;
	public static final int AES_256 = 5;
	private static final int KEY_SALT_OFFSET = 40;
	private static final int OU_LENGHT = 48;
	private static final int SALT_LENGHT = 8;
	public static final int STANDARD_ENCRYPTION_128 = 3;
	public static final int STANDARD_ENCRYPTION_40 = 2;
	private static final int VALIDATION_SALT_OFFSET = 32;
	private static final byte metadataPad[] = {
		-1, -1, -1, -1
	};
	private static final byte pad[] = {
		40, -65, 78, 94, 78, 117, -118, 65, 100, 0, 
		78, 86, -1, -6, 1, 8, 46, 46, 0, -74, 
		-48, 104, 62, -128, 47, 12, -87, -2, 100, 83, 
		105, 122
	};
	private static final byte salt[] = {
		115, 65, 108, 84
	};
	static long seq = System.currentTimeMillis();
	private ARCFOUREncryption arcfour;
	private int cryptoMode;
	byte documentID[];
	private boolean embeddedFilesOnly;
	private boolean encryptMetadata;
	byte extra[];
	byte key[];
	private int keyLength;
	int keySize;
	MessageDigest md5;
	byte mkey[];
	byte oeKey[];
	byte ownerKey[];
	long permissions;
	byte perms[];
	protected PdfPublicKeySecurityHandler publicKeyHandler;
	private int revision;
	byte ueKey[];
	byte userKey[];

	static 
	{
	//    0    0:bipush          32
	//    1    2:newarray        byte[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #11  <Int 40>
	//    5    8:bastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #53  <Int -65>
	//    9   13:bastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #54  <Int 78>
	//   13   18:bastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #55  <Int 94>
	//   17   23:bastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #54  <Int 78>
	//   21   28:bastore         
	//   22   29:dup             
	//   23   30:iconst_5        
	//   24   31:ldc1            #56  <Int 117>
	//   25   33:bastore         
	//   26   34:dup             
	//   27   35:bipush          6
	//   28   37:ldc1            #57  <Int -118>
	//   29   39:bastore         
	//   30   40:dup             
	//   31   41:bipush          7
	//   32   43:ldc1            #58  <Int 65>
	//   33   45:bastore         
	//   34   46:dup             
	//   35   47:bipush          8
	//   36   49:ldc1            #59  <Int 100>
	//   37   51:bastore         
	//   38   52:dup             
	//   39   53:bipush          9
	//   40   55:ldc1            #60  <Int 0>
	//   41   57:bastore         
	//   42   58:dup             
	//   43   59:bipush          10
	//   44   61:ldc1            #54  <Int 78>
	//   45   63:bastore         
	//   46   64:dup             
	//   47   65:bipush          11
	//   48   67:ldc1            #61  <Int 86>
	//   49   69:bastore         
	//   50   70:dup             
	//   51   71:bipush          12
	//   52   73:ldc1            #62  <Int -1>
	//   53   75:bastore         
	//   54   76:dup             
	//   55   77:bipush          13
	//   56   79:ldc1            #63  <Int -6>
	//   57   81:bastore         
	//   58   82:dup             
	//   59   83:bipush          14
	//   60   85:ldc1            #64  <Int 1>
	//   61   87:bastore         
	//   62   88:dup             
	//   63   89:bipush          15
	//   64   91:ldc1            #15  <Int 8>
	//   65   93:bastore         
	//   66   94:dup             
	//   67   95:bipush          16
	//   68   97:ldc1            #65  <Int 46>
	//   69   99:bastore         
	//   70  100:dup             
	//   71  101:bipush          17
	//   72  103:ldc1            #65  <Int 46>
	//   73  105:bastore         
	//   74  106:dup             
	//   75  107:bipush          18
	//   76  109:ldc1            #60  <Int 0>
	//   77  111:bastore         
	//   78  112:dup             
	//   79  113:bipush          19
	//   80  115:ldc1            #66  <Int -74>
	//   81  117:bastore         
	//   82  118:dup             
	//   83  119:bipush          20
	//   84  121:ldc1            #67  <Int -48>
	//   85  123:bastore         
	//   86  124:dup             
	//   87  125:bipush          21
	//   88  127:ldc1            #68  <Int 104>
	//   89  129:bastore         
	//   90  130:dup             
	//   91  131:bipush          22
	//   92  133:ldc1            #69  <Int 62>
	//   93  135:bastore         
	//   94  136:dup             
	//   95  137:bipush          23
	//   96  139:ldc1            #70  <Int -128>
	//   97  141:bastore         
	//   98  142:dup             
	//   99  143:bipush          24
	//  100  145:ldc1            #71  <Int 47>
	//  101  147:bastore         
	//  102  148:dup             
	//  103  149:bipush          25
	//  104  151:ldc1            #72  <Int 12>
	//  105  153:bastore         
	//  106  154:dup             
	//  107  155:bipush          26
	//  108  157:ldc1            #73  <Int -87>
	//  109  159:bastore         
	//  110  160:dup             
	//  111  161:bipush          27
	//  112  163:ldc1            #74  <Int -2>
	//  113  165:bastore         
	//  114  166:dup             
	//  115  167:bipush          28
	//  116  169:ldc1            #59  <Int 100>
	//  117  171:bastore         
	//  118  172:dup             
	//  119  173:bipush          29
	//  120  175:ldc1            #75  <Int 83>
	//  121  177:bastore         
	//  122  178:dup             
	//  123  179:bipush          30
	//  124  181:ldc1            #76  <Int 105>
	//  125  183:bastore         
	//  126  184:dup             
	//  127  185:bipush          31
	//  128  187:ldc1            #77  <Int 122>
	//  129  189:bastore         
	//  130  190:putstatic       #79  <Field byte[] pad>
	//  131  193:iconst_4        
	//  132  194:newarray        byte[]
	//  133  196:dup             
	//  134  197:iconst_0        
	//  135  198:ldc1            #80  <Int 115>
	//  136  200:bastore         
	//  137  201:dup             
	//  138  202:iconst_1        
	//  139  203:ldc1            #58  <Int 65>
	//  140  205:bastore         
	//  141  206:dup             
	//  142  207:iconst_2        
	//  143  208:ldc1            #81  <Int 108>
	//  144  210:bastore         
	//  145  211:dup             
	//  146  212:iconst_3        
	//  147  213:ldc1            #82  <Int 84>
	//  148  215:bastore         
	//  149  216:putstatic       #84  <Field byte[] salt>
	//  150  219:iconst_4        
	//  151  220:newarray        byte[]
	//  152  222:dup             
	//  153  223:iconst_0        
	//  154  224:ldc1            #62  <Int -1>
	//  155  226:bastore         
	//  156  227:dup             
	//  157  228:iconst_1        
	//  158  229:ldc1            #62  <Int -1>
	//  159  231:bastore         
	//  160  232:dup             
	//  161  233:iconst_2        
	//  162  234:ldc1            #62  <Int -1>
	//  163  236:bastore         
	//  164  237:dup             
	//  165  238:iconst_3        
	//  166  239:ldc1            #62  <Int -1>
	//  167  241:bastore         
	//  168  242:putstatic       #86  <Field byte[] metadataPad>
	//  169  245:invokestatic    #92  <Method long System.currentTimeMillis()>
	//  170  248:putstatic       #94  <Field long seq>
	//* 171  251:return          
	}
}
