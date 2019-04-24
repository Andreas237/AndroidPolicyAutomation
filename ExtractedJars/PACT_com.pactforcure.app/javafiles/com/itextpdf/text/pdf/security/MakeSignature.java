// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.io.*;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import com.itextpdf.text.pdf.*;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.*;
import org.spongycastle.asn1.esf.SignaturePolicyIdentifier;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			CrlClient, ExternalSignatureContainer, SignaturePolicyInfo, ExternalSignature, 
//			PdfPKCS7, ExternalDigest, DigestAlgorithms, OcspClient, 
//			TSAClient

public class MakeSignature
{
	public static final class CryptoStandard extends Enum
	{

		public static CryptoStandard valueOf(String s)
		{
			return (CryptoStandard)Enum.valueOf(com/itextpdf/text/pdf/security/MakeSignature$CryptoStandard, s);
		//    0    0:ldc1            #2   <Class MakeSignature$CryptoStandard>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class MakeSignature$CryptoStandard>
		//    4    9:areturn         
		}

		public static CryptoStandard[] values()
		{
			return (CryptoStandard[])((CryptoStandard []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field MakeSignature$CryptoStandard[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.itextpdf.text.pdf.security.MakeSignature$CryptoStandard_3B_.clone()>
		//    2    6:checkcast       #38  <Class MakeSignature$CryptoStandard[]>
		//    3    9:areturn         
		}

		private static final CryptoStandard $VALUES[];
		public static final CryptoStandard CADES;
		public static final CryptoStandard CMS;

		static 
		{
			CMS = new CryptoStandard("CMS", 0);
		//    0    0:new             #2   <Class MakeSignature$CryptoStandard>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "CMS">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void MakeSignature$CryptoStandard(String, int)>
		//    5   10:putstatic       #22  <Field MakeSignature$CryptoStandard CMS>
			CADES = new CryptoStandard("CADES", 1);
		//    6   13:new             #2   <Class MakeSignature$CryptoStandard>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "CADES">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void MakeSignature$CryptoStandard(String, int)>
		//   11   23:putstatic       #25  <Field MakeSignature$CryptoStandard CADES>
			$VALUES = (new CryptoStandard[] {
				CMS, CADES
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       CryptoStandard[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field MakeSignature$CryptoStandard CMS>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field MakeSignature$CryptoStandard CADES>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field MakeSignature$CryptoStandard[] $VALUES>
		//*  23   45:return          
		}

		private CryptoStandard(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public MakeSignature()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public static Collection processCrl(Certificate certificate, Collection collection)
	{
		if(collection == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       8
		{
			certificate = null;
	//    2    4:aconst_null     
	//    3    5:astore_0        
		} else
	//*   4    6:aload_0         
	//*   5    7:areturn         
		{
			ArrayList arraylist = new ArrayList();
	//    6    8:new             #27  <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #28  <Method void ArrayList()>
	//    9   15:astore_2        
			collection = ((Collection) (collection.iterator()));
	//   10   16:aload_1         
	//   11   17:invokeinterface #34  <Method Iterator Collection.iterator()>
	//   12   22:astore_1        
			do
			{
				if(!((Iterator) (collection)).hasNext())
					break;
	//   13   23:aload_1         
	//   14   24:invokeinterface #40  <Method boolean Iterator.hasNext()>
	//   15   29:ifeq            104
				Object obj = ((Object) ((CrlClient)((Iterator) (collection)).next()));
	//   16   32:aload_1         
	//   17   33:invokeinterface #44  <Method Object Iterator.next()>
	//   18   38:checkcast       #46  <Class CrlClient>
	//   19   41:astore_3        
				if(obj != null)
	//*  20   42:aload_3         
	//*  21   43:ifnull          23
				{
					LOGGER.info((new StringBuilder()).append("Processing ").append(obj.getClass().getName()).toString());
	//   22   46:getstatic       #19  <Field Logger LOGGER>
	//   23   49:new             #48  <Class StringBuilder>
	//   24   52:dup             
	//   25   53:invokespecial   #49  <Method void StringBuilder()>
	//   26   56:ldc1            #51  <String "Processing ">
	//   27   58:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   28   61:aload_3         
	//   29   62:invokevirtual   #59  <Method Class Object.getClass()>
	//   30   65:invokevirtual   #65  <Method String Class.getName()>
	//   31   68:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   32   71:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   33   74:invokeinterface #74  <Method void Logger.info(String)>
					obj = ((Object) (((CrlClient) (obj)).getEncoded((X509Certificate)certificate, ((String) (null)))));
	//   34   79:aload_3         
	//   35   80:aload_0         
	//   36   81:checkcast       #76  <Class X509Certificate>
	//   37   84:aconst_null     
	//   38   85:invokeinterface #80  <Method Collection CrlClient.getEncoded(X509Certificate, String)>
	//   39   90:astore_3        
					if(obj != null)
	//*  40   91:aload_3         
	//*  41   92:ifnull          23
						arraylist.addAll(((Collection) (obj)));
	//   42   95:aload_2         
	//   43   96:aload_3         
	//   44   97:invokevirtual   #84  <Method boolean ArrayList.addAll(Collection)>
	//   45  100:pop             
				}
			} while(true);
	//   46  101:goto            23
			certificate = ((Certificate) (arraylist));
	//   47  104:aload_2         
	//   48  105:astore_0        
			if(arraylist.isEmpty())
	//*  49  106:aload_2         
	//*  50  107:invokevirtual   #87  <Method boolean ArrayList.isEmpty()>
	//*  51  110:ifeq            6
				return null;
	//   52  113:aconst_null     
	//   53  114:areturn         
		}
		return ((Collection) (certificate));
	}

	public static void signDeferred(PdfReader pdfreader, String s, OutputStream outputstream, ExternalSignatureContainer externalsignaturecontainer)
		throws DocumentException, IOException, GeneralSecurityException
	{
		Object obj = ((Object) (pdfreader.getAcroFields()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #103 <Method AcroFields PdfReader.getAcroFields()>
	//    2    4:astore          7
		PdfDictionary pdfdictionary = ((AcroFields) (obj)).getSignatureDictionary(s);
	//    3    6:aload           7
	//    4    8:aload_1         
	//    5    9:invokevirtual   #109 <Method PdfDictionary AcroFields.getSignatureDictionary(String)>
	//    6   12:astore          8
		if(pdfdictionary == null)
	//*   7   14:aload           8
	//*   8   16:ifnonnull       29
			throw new DocumentException("No field");
	//    9   19:new             #93  <Class DocumentException>
	//   10   22:dup             
	//   11   23:ldc1            #111 <String "No field">
	//   12   25:invokespecial   #113 <Method void DocumentException(String)>
	//   13   28:athrow          
		if(!((AcroFields) (obj)).signatureCoversWholeDocument(s))
	//*  14   29:aload           7
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #117 <Method boolean AcroFields.signatureCoversWholeDocument(String)>
	//*  17   35:ifne            48
			throw new DocumentException("Not the last signature");
	//   18   38:new             #93  <Class DocumentException>
	//   19   41:dup             
	//   20   42:ldc1            #119 <String "Not the last signature">
	//   21   44:invokespecial   #113 <Method void DocumentException(String)>
	//   22   47:athrow          
		obj = ((Object) (pdfdictionary.getAsArray(PdfName.BYTERANGE)));
	//   23   48:aload           8
	//   24   50:getstatic       #125 <Field PdfName PdfName.BYTERANGE>
	//   25   53:invokevirtual   #131 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   26   56:astore          7
		s = ((String) (((PdfArray) (obj)).asLongArray()));
	//   27   58:aload           7
	//   28   60:invokevirtual   #137 <Method long[] PdfArray.asLongArray()>
	//   29   63:astore_1        
		if(((PdfArray) (obj)).size() != 4 || s[0] != 0L)
	//*  30   64:aload           7
	//*  31   66:invokevirtual   #141 <Method int PdfArray.size()>
	//*  32   69:iconst_4        
	//*  33   70:icmpne          81
	//*  34   73:aload_1         
	//*  35   74:iconst_0        
	//*  36   75:laload          
	//*  37   76:lconst_0        
	//*  38   77:lcmp            
	//*  39   78:ifeq            91
			throw new DocumentException("Single exclusion space supported");
	//   40   81:new             #93  <Class DocumentException>
	//   41   84:dup             
	//   42   85:ldc1            #143 <String "Single exclusion space supported">
	//   43   87:invokespecial   #113 <Method void DocumentException(String)>
	//   44   90:athrow          
		pdfreader = ((PdfReader) (pdfreader.getSafeFile().createSourceView()));
	//   45   91:aload_0         
	//   46   92:invokevirtual   #147 <Method RandomAccessFileOrArray PdfReader.getSafeFile()>
	//   47   95:invokevirtual   #153 <Method com.itextpdf.text.io.RandomAccessSource RandomAccessFileOrArray.createSourceView()>
	//   48   98:astore_0        
		externalsignaturecontainer = ((ExternalSignatureContainer) (externalsignaturecontainer.sign(((java.io.InputStream) (new RASInputStream((new RandomAccessSourceFactory()).createRanged(((com.itextpdf.text.io.RandomAccessSource) (pdfreader)), ((long []) (s)))))))));
	//   49   99:aload_3         
	//   50  100:new             #155 <Class RASInputStream>
	//   51  103:dup             
	//   52  104:new             #157 <Class RandomAccessSourceFactory>
	//   53  107:dup             
	//   54  108:invokespecial   #158 <Method void RandomAccessSourceFactory()>
	//   55  111:aload_0         
	//   56  112:aload_1         
	//   57  113:invokevirtual   #162 <Method com.itextpdf.text.io.RandomAccessSource RandomAccessSourceFactory.createRanged(com.itextpdf.text.io.RandomAccessSource, long[])>
	//   58  116:invokespecial   #165 <Method void RASInputStream(com.itextpdf.text.io.RandomAccessSource)>
	//   59  119:invokeinterface #171 <Method byte[] ExternalSignatureContainer.sign(java.io.InputStream)>
	//   60  124:astore_3        
		int i = (int)(s[2] - s[1]) - 2;
	//   61  125:aload_1         
	//   62  126:iconst_2        
	//   63  127:laload          
	//   64  128:aload_1         
	//   65  129:iconst_1        
	//   66  130:laload          
	//   67  131:lsub            
	//   68  132:l2i             
	//   69  133:iconst_2        
	//   70  134:isub            
	//   71  135:istore          4
		if((i & 1) != 0)
	//*  72  137:iload           4
	//*  73  139:iconst_1        
	//*  74  140:iand            
	//*  75  141:ifeq            154
			throw new DocumentException("Gap is not a multiple of 2");
	//   76  144:new             #93  <Class DocumentException>
	//   77  147:dup             
	//   78  148:ldc1            #173 <String "Gap is not a multiple of 2">
	//   79  150:invokespecial   #113 <Method void DocumentException(String)>
	//   80  153:athrow          
		int l = i / 2;
	//   81  154:iload           4
	//   82  156:iconst_2        
	//   83  157:idiv            
	//   84  158:istore          5
		if(l < externalsignaturecontainer.length)
	//*  85  160:iload           5
	//*  86  162:aload_3         
	//*  87  163:arraylength     
	//*  88  164:icmpge          177
			throw new DocumentException("Not enough space");
	//   89  167:new             #93  <Class DocumentException>
	//   90  170:dup             
	//   91  171:ldc1            #175 <String "Not enough space">
	//   92  173:invokespecial   #113 <Method void DocumentException(String)>
	//   93  176:athrow          
		StreamUtil.CopyBytes(((com.itextpdf.text.io.RandomAccessSource) (pdfreader)), 0L, s[1] + 1L, outputstream);
	//   94  177:aload_0         
	//   95  178:lconst_0        
	//   96  179:aload_1         
	//   97  180:iconst_1        
	//   98  181:laload          
	//   99  182:lconst_1        
	//  100  183:ladd            
	//  101  184:aload_2         
	//  102  185:invokestatic    #181 <Method void StreamUtil.CopyBytes(com.itextpdf.text.io.RandomAccessSource, long, long, OutputStream)>
		obj = ((Object) (new ByteBuffer(l * 2)));
	//  103  188:new             #183 <Class ByteBuffer>
	//  104  191:dup             
	//  105  192:iload           5
	//  106  194:iconst_2        
	//  107  195:imul            
	//  108  196:invokespecial   #186 <Method void ByteBuffer(int)>
	//  109  199:astore          7
		int i1 = externalsignaturecontainer.length;
	//  110  201:aload_3         
	//  111  202:arraylength     
	//  112  203:istore          6
		for(int j = 0; j < i1; j++)
	//* 113  205:iconst_0        
	//* 114  206:istore          4
	//* 115  208:iload           4
	//* 116  210:iload           6
	//* 117  212:icmpge          234
			((ByteBuffer) (obj)).appendHex(externalsignaturecontainer[j]);
	//  118  215:aload           7
	//  119  217:aload_3         
	//  120  218:iload           4
	//  121  220:baload          
	//  122  221:invokevirtual   #190 <Method ByteBuffer ByteBuffer.appendHex(byte)>
	//  123  224:pop             

	//  124  225:iload           4
	//  125  227:iconst_1        
	//  126  228:iadd            
	//  127  229:istore          4
	//* 128  231:goto            208
		i1 = externalsignaturecontainer.length;
	//  129  234:aload_3         
	//  130  235:arraylength     
	//  131  236:istore          6
		for(int k = 0; k < (l - i1) * 2; k++)
	//* 132  238:iconst_0        
	//* 133  239:istore          4
	//* 134  241:iload           4
	//* 135  243:iload           5
	//* 136  245:iload           6
	//* 137  247:isub            
	//* 138  248:iconst_2        
	//* 139  249:imul            
	//* 140  250:icmpge          270
			((ByteBuffer) (obj)).append((byte)48);
	//  141  253:aload           7
	//  142  255:bipush          48
	//  143  257:invokevirtual   #192 <Method ByteBuffer ByteBuffer.append(byte)>
	//  144  260:pop             

	//  145  261:iload           4
	//  146  263:iconst_1        
	//  147  264:iadd            
	//  148  265:istore          4
	//* 149  267:goto            241
		((ByteBuffer) (obj)).writeTo(outputstream);
	//  150  270:aload           7
	//  151  272:aload_2         
	//  152  273:invokevirtual   #196 <Method void ByteBuffer.writeTo(OutputStream)>
		StreamUtil.CopyBytes(((com.itextpdf.text.io.RandomAccessSource) (pdfreader)), s[2] - 1L, s[3] + 1L, outputstream);
	//  153  276:aload_0         
	//  154  277:aload_1         
	//  155  278:iconst_2        
	//  156  279:laload          
	//  157  280:lconst_1        
	//  158  281:lsub            
	//  159  282:aload_1         
	//  160  283:iconst_3        
	//  161  284:laload          
	//  162  285:lconst_1        
	//  163  286:ladd            
	//  164  287:aload_2         
	//  165  288:invokestatic    #181 <Method void StreamUtil.CopyBytes(com.itextpdf.text.io.RandomAccessSource, long, long, OutputStream)>
	//  166  291:return          
	}

	public static void signDetached(PdfSignatureAppearance pdfsignatureappearance, ExternalDigest externaldigest, ExternalSignature externalsignature, Certificate acertificate[], Collection collection, OcspClient ocspclient, TSAClient tsaclient, int i, 
			CryptoStandard cryptostandard)
		throws IOException, DocumentException, GeneralSecurityException
	{
		signDetached(pdfsignatureappearance, externaldigest, externalsignature, acertificate, collection, ocspclient, tsaclient, i, cryptostandard, (SignaturePolicyIdentifier)null);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:iload           7
	//    8   12:aload           8
	//    9   14:aconst_null     
	//   10   15:checkcast       #201 <Class SignaturePolicyIdentifier>
	//   11   18:invokestatic    #204 <Method void signDetached(PdfSignatureAppearance, ExternalDigest, ExternalSignature, Certificate[], Collection, OcspClient, TSAClient, int, MakeSignature$CryptoStandard, SignaturePolicyIdentifier)>
	//   12   21:return          
	}

	public static void signDetached(PdfSignatureAppearance pdfsignatureappearance, ExternalDigest externaldigest, ExternalSignature externalsignature, Certificate acertificate[], Collection collection, OcspClient ocspclient, TSAClient tsaclient, int i, 
			CryptoStandard cryptostandard, SignaturePolicyInfo signaturepolicyinfo)
		throws IOException, DocumentException, GeneralSecurityException
	{
		signDetached(pdfsignatureappearance, externaldigest, externalsignature, acertificate, collection, ocspclient, tsaclient, i, cryptostandard, signaturepolicyinfo.toSignaturePolicyIdentifier());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:iload           7
	//    8   12:aload           8
	//    9   14:aload           9
	//   10   16:invokevirtual   #212 <Method SignaturePolicyIdentifier SignaturePolicyInfo.toSignaturePolicyIdentifier()>
	//   11   19:invokestatic    #204 <Method void signDetached(PdfSignatureAppearance, ExternalDigest, ExternalSignature, Certificate[], Collection, OcspClient, TSAClient, int, MakeSignature$CryptoStandard, SignaturePolicyIdentifier)>
	//   12   22:return          
	}

	public static void signDetached(PdfSignatureAppearance pdfsignatureappearance, ExternalDigest externaldigest, ExternalSignature externalsignature, Certificate acertificate[], Collection collection, OcspClient ocspclient, TSAClient tsaclient, int i, 
			CryptoStandard cryptostandard, SignaturePolicyIdentifier signaturepolicyidentifier)
		throws IOException, DocumentException, GeneralSecurityException
	{
		Collection collection1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          12
		for(int j = 0; collection1 == null && j < acertificate.length; j++)
	//*   2    3:iconst_0        
	//*   3    4:istore          10
	//*   4    6:aload           12
	//*   5    8:ifnonnull       38
	//*   6   11:iload           10
	//*   7   13:aload_3         
	//*   8   14:arraylength     
	//*   9   15:icmpge          38
			collection1 = processCrl(acertificate[j], collection);
	//   10   18:aload_3         
	//   11   19:iload           10
	//   12   21:aaload          
	//   13   22:aload           4
	//   14   24:invokestatic    #215 <Method Collection processCrl(Certificate, Collection)>
	//   15   27:astore          12

	//   16   29:iload           10
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:istore          10
	//*  20   35:goto            6
		int l = i;
	//   21   38:iload           7
	//   22   40:istore          11
		if(i == 0)
	//*  23   42:iload           7
	//*  24   44:ifne            140
		{
			int k = 8192;
	//   25   47:sipush          8192
	//   26   50:istore          10
			i = k;
	//   27   52:iload           10
	//   28   54:istore          7
			if(collection1 != null)
	//*  29   56:aload           12
	//*  30   58:ifnull          106
			{
				collection = ((Collection) (collection1.iterator()));
	//   31   61:aload           12
	//   32   63:invokeinterface #34  <Method Iterator Collection.iterator()>
	//   33   68:astore          4
				do
				{
					i = k;
	//   34   70:iload           10
	//   35   72:istore          7
					if(!((Iterator) (collection)).hasNext())
						break;
	//   36   74:aload           4
	//   37   76:invokeinterface #40  <Method boolean Iterator.hasNext()>
	//   38   81:ifeq            106
					k += ((byte[])((Iterator) (collection)).next()).length + 10;
	//   39   84:iload           10
	//   40   86:aload           4
	//   41   88:invokeinterface #44  <Method Object Iterator.next()>
	//   42   93:checkcast       #217 <Class byte[]>
	//   43   96:arraylength     
	//   44   97:bipush          10
	//   45   99:iadd            
	//   46  100:iadd            
	//   47  101:istore          10
				} while(true);
	//   48  103:goto            70
			}
			k = i;
	//   49  106:iload           7
	//   50  108:istore          10
			if(ocspclient != null)
	//*  51  110:aload           5
	//*  52  112:ifnull          123
				k = i + 4192;
	//   53  115:iload           7
	//   54  117:sipush          4192
	//   55  120:iadd            
	//   56  121:istore          10
			l = k;
	//   57  123:iload           10
	//   58  125:istore          11
			if(tsaclient != null)
	//*  59  127:aload           6
	//*  60  129:ifnull          140
				l = k + 4192;
	//   61  132:iload           10
	//   62  134:sipush          4192
	//   63  137:iadd            
	//   64  138:istore          11
		}
		pdfsignatureappearance.setCertificate(acertificate[0]);
	//   65  140:aload_0         
	//   66  141:aload_3         
	//   67  142:iconst_0        
	//   68  143:aaload          
	//   69  144:invokevirtual   #223 <Method void PdfSignatureAppearance.setCertificate(Certificate)>
		if(cryptostandard == CryptoStandard.CADES)
	//*  70  147:aload           8
	//*  71  149:getstatic       #227 <Field MakeSignature$CryptoStandard MakeSignature$CryptoStandard.CADES>
	//*  72  152:if_acmpne       162
			pdfsignatureappearance.addDeveloperExtension(PdfDeveloperExtension.ESIC_1_7_EXTENSIONLEVEL2);
	//   73  155:aload_0         
	//   74  156:getstatic       #233 <Field PdfDeveloperExtension PdfDeveloperExtension.ESIC_1_7_EXTENSIONLEVEL2>
	//   75  159:invokevirtual   #237 <Method void PdfSignatureAppearance.addDeveloperExtension(PdfDeveloperExtension)>
		Object obj = ((Object) (PdfName.ADOBE_PPKLITE));
	//   76  162:getstatic       #240 <Field PdfName PdfName.ADOBE_PPKLITE>
	//   77  165:astore          13
		if(cryptostandard == CryptoStandard.CADES)
	//*  78  167:aload           8
	//*  79  169:getstatic       #227 <Field MakeSignature$CryptoStandard MakeSignature$CryptoStandard.CADES>
	//*  80  172:if_acmpne       444
			collection = ((Collection) (PdfName.ETSI_CADES_DETACHED));
	//   81  175:getstatic       #243 <Field PdfName PdfName.ETSI_CADES_DETACHED>
	//   82  178:astore          4
		else
	//*  83  180:new             #245 <Class PdfSignature>
	//*  84  183:dup             
	//*  85  184:aload           13
	//*  86  186:aload           4
	//*  87  188:invokespecial   #248 <Method void PdfSignature(PdfName, PdfName)>
	//*  88  191:astore          4
	//*  89  193:aload           4
	//*  90  195:aload_0         
	//*  91  196:invokevirtual   #251 <Method String PdfSignatureAppearance.getReason()>
	//*  92  199:invokevirtual   #254 <Method void PdfSignature.setReason(String)>
	//*  93  202:aload           4
	//*  94  204:aload_0         
	//*  95  205:invokevirtual   #257 <Method String PdfSignatureAppearance.getLocation()>
	//*  96  208:invokevirtual   #260 <Method void PdfSignature.setLocation(String)>
	//*  97  211:aload           4
	//*  98  213:aload_0         
	//*  99  214:invokevirtual   #263 <Method String PdfSignatureAppearance.getSignatureCreator()>
	//* 100  217:invokevirtual   #266 <Method void PdfSignature.setSignatureCreator(String)>
	//* 101  220:aload           4
	//* 102  222:aload_0         
	//* 103  223:invokevirtual   #269 <Method String PdfSignatureAppearance.getContact()>
	//* 104  226:invokevirtual   #272 <Method void PdfSignature.setContact(String)>
	//* 105  229:aload           4
	//* 106  231:new             #274 <Class PdfDate>
	//* 107  234:dup             
	//* 108  235:aload_0         
	//* 109  236:invokevirtual   #278 <Method java.util.Calendar PdfSignatureAppearance.getSignDate()>
	//* 110  239:invokespecial   #281 <Method void PdfDate(java.util.Calendar)>
	//* 111  242:invokevirtual   #285 <Method void PdfSignature.setDate(PdfDate)>
	//* 112  245:aload_0         
	//* 113  246:aload           4
	//* 114  248:invokevirtual   #289 <Method void PdfSignatureAppearance.setCryptoDictionary(PdfDictionary)>
	//* 115  251:new             #291 <Class HashMap>
	//* 116  254:dup             
	//* 117  255:invokespecial   #292 <Method void HashMap()>
	//* 118  258:astore          4
	//* 119  260:aload           4
	//* 120  262:getstatic       #295 <Field PdfName PdfName.CONTENTS>
	//* 121  265:new             #297 <Class Integer>
	//* 122  268:dup             
	//* 123  269:iload           11
	//* 124  271:iconst_2        
	//* 125  272:imul            
	//* 126  273:iconst_2        
	//* 127  274:iadd            
	//* 128  275:invokespecial   #298 <Method void Integer(int)>
	//* 129  278:invokevirtual   #302 <Method Object HashMap.put(Object, Object)>
	//* 130  281:pop             
	//* 131  282:aload_0         
	//* 132  283:aload           4
	//* 133  285:invokevirtual   #306 <Method void PdfSignatureAppearance.preClose(HashMap)>
	//* 134  288:aload_2         
	//* 135  289:invokeinterface #311 <Method String ExternalSignature.getHashAlgorithm()>
	//* 136  294:astore          4
	//* 137  296:new             #313 <Class PdfPKCS7>
	//* 138  299:dup             
	//* 139  300:aconst_null     
	//* 140  301:aload_3         
	//* 141  302:aload           4
	//* 142  304:aconst_null     
	//* 143  305:aload_1         
	//* 144  306:iconst_0        
	//* 145  307:invokespecial   #316 <Method void PdfPKCS7(java.security.PrivateKey, Certificate[], String, String, ExternalDigest, boolean)>
	//* 146  310:astore          13
	//* 147  312:aload           9
	//* 148  314:ifnull          324
	//* 149  317:aload           13
	//* 150  319:aload           9
	//* 151  321:invokevirtual   #320 <Method void PdfPKCS7.setSignaturePolicy(SignaturePolicyIdentifier)>
	//* 152  324:aload_0         
	//* 153  325:invokevirtual   #324 <Method java.io.InputStream PdfSignatureAppearance.getRangeStream()>
	//* 154  328:aload_1         
	//* 155  329:aload           4
	//* 156  331:invokeinterface #330 <Method java.security.MessageDigest ExternalDigest.getMessageDigest(String)>
	//* 157  336:invokestatic    #336 <Method byte[] DigestAlgorithms.digest(java.io.InputStream, java.security.MessageDigest)>
	//* 158  339:astore          9
	//* 159  341:aconst_null     
	//* 160  342:astore          4
	//* 161  344:aload           4
	//* 162  346:astore_1        
	//* 163  347:aload_3         
	//* 164  348:arraylength     
	//* 165  349:iconst_2        
	//* 166  350:icmplt          382
	//* 167  353:aload           4
	//* 168  355:astore_1        
	//* 169  356:aload           5
	//* 170  358:ifnull          382
	//* 171  361:aload           5
	//* 172  363:aload_3         
	//* 173  364:iconst_0        
	//* 174  365:aaload          
	//* 175  366:checkcast       #76  <Class X509Certificate>
	//* 176  369:aload_3         
	//* 177  370:iconst_1        
	//* 178  371:aaload          
	//* 179  372:checkcast       #76  <Class X509Certificate>
	//* 180  375:aconst_null     
	//* 181  376:invokeinterface #341 <Method byte[] OcspClient.getEncoded(X509Certificate, X509Certificate, String)>
	//* 182  381:astore_1        
	//* 183  382:aload           13
	//* 184  384:aload_2         
	//* 185  385:aload           13
	//* 186  387:aload           9
	//* 187  389:aload_1         
	//* 188  390:aload           12
	//* 189  392:aload           8
	//* 190  394:invokevirtual   #345 <Method byte[] PdfPKCS7.getAuthenticatedAttributeBytes(byte[], byte[], Collection, MakeSignature$CryptoStandard)>
	//* 191  397:invokeinterface #348 <Method byte[] ExternalSignature.sign(byte[])>
	//* 192  402:aconst_null     
	//* 193  403:aload_2         
	//* 194  404:invokeinterface #351 <Method String ExternalSignature.getEncryptionAlgorithm()>
	//* 195  409:invokevirtual   #355 <Method void PdfPKCS7.setExternalDigest(byte[], byte[], String)>
	//* 196  412:aload           13
	//* 197  414:aload           9
	//* 198  416:aload           6
	//* 199  418:aload_1         
	//* 200  419:aload           12
	//* 201  421:aload           8
	//* 202  423:invokevirtual   #359 <Method byte[] PdfPKCS7.getEncodedPKCS7(byte[], TSAClient, byte[], Collection, MakeSignature$CryptoStandard)>
	//* 203  426:astore_2        
	//* 204  427:iload           11
	//* 205  429:aload_2         
	//* 206  430:arraylength     
	//* 207  431:icmpge          452
	//* 208  434:new             #95  <Class IOException>
	//* 209  437:dup             
	//* 210  438:ldc1            #175 <String "Not enough space">
	//* 211  440:invokespecial   #360 <Method void IOException(String)>
	//* 212  443:athrow          
			collection = ((Collection) (PdfName.ADBE_PKCS7_DETACHED));
	//  213  444:getstatic       #363 <Field PdfName PdfName.ADBE_PKCS7_DETACHED>
	//  214  447:astore          4
		collection = ((Collection) (new PdfSignature(((PdfName) (obj)), ((PdfName) (collection)))));
		((PdfSignature) (collection)).setReason(pdfsignatureappearance.getReason());
		((PdfSignature) (collection)).setLocation(pdfsignatureappearance.getLocation());
		((PdfSignature) (collection)).setSignatureCreator(pdfsignatureappearance.getSignatureCreator());
		((PdfSignature) (collection)).setContact(pdfsignatureappearance.getContact());
		((PdfSignature) (collection)).setDate(new PdfDate(pdfsignatureappearance.getSignDate()));
		pdfsignatureappearance.setCryptoDictionary(((PdfDictionary) (collection)));
		collection = ((Collection) (new HashMap()));
		((HashMap) (collection)).put(((Object) (PdfName.CONTENTS)), ((Object) (new Integer(l * 2 + 2))));
		pdfsignatureappearance.preClose(((HashMap) (collection)));
		collection = ((Collection) (externalsignature.getHashAlgorithm()));
		obj = ((Object) (new PdfPKCS7(((java.security.PrivateKey) (null)), acertificate, ((String) (collection)), ((String) (null)), externaldigest, false)));
		if(signaturepolicyidentifier != null)
			((PdfPKCS7) (obj)).setSignaturePolicy(signaturepolicyidentifier);
		signaturepolicyidentifier = ((SignaturePolicyIdentifier) (DigestAlgorithms.digest(pdfsignatureappearance.getRangeStream(), externaldigest.getMessageDigest(((String) (collection))))));
		collection = null;
		externaldigest = ((ExternalDigest) (collection));
		if(acertificate.length >= 2)
		{
			externaldigest = ((ExternalDigest) (collection));
			if(ocspclient != null)
				externaldigest = ((ExternalDigest) (ocspclient.getEncoded((X509Certificate)acertificate[0], (X509Certificate)acertificate[1], ((String) (null)))));
		}
		((PdfPKCS7) (obj)).setExternalDigest(externalsignature.sign(((PdfPKCS7) (obj)).getAuthenticatedAttributeBytes(((byte []) (signaturepolicyidentifier)), ((byte []) (externaldigest)), collection1, cryptostandard)), ((byte []) (null)), externalsignature.getEncryptionAlgorithm());
		externalsignature = ((ExternalSignature) (((PdfPKCS7) (obj)).getEncodedPKCS7(((byte []) (signaturepolicyidentifier)), tsaclient, ((byte []) (externaldigest)), collection1, cryptostandard)));
		if(l < externalsignature.length)
		{
			throw new IOException("Not enough space");
		} else
	//* 215  449:goto            180
		{
			externaldigest = ((ExternalDigest) (new byte[l]));
	//  216  452:iload           11
	//  217  454:newarray        byte[]
	//  218  456:astore_1        
			System.arraycopy(((Object) (externalsignature)), 0, ((Object) (externaldigest)), 0, externalsignature.length);
	//  219  457:aload_2         
	//  220  458:iconst_0        
	//  221  459:aload_1         
	//  222  460:iconst_0        
	//  223  461:aload_2         
	//  224  462:arraylength     
	//  225  463:invokestatic    #369 <Method void System.arraycopy(Object, int, Object, int, int)>
			externalsignature = ((ExternalSignature) (new PdfDictionary()));
	//  226  466:new             #127 <Class PdfDictionary>
	//  227  469:dup             
	//  228  470:invokespecial   #370 <Method void PdfDictionary()>
	//  229  473:astore_2        
			((PdfDictionary) (externalsignature)).put(PdfName.CONTENTS, ((com.itextpdf.text.pdf.PdfObject) ((new PdfString(((byte []) (externaldigest)))).setHexWriting(true))));
	//  230  474:aload_2         
	//  231  475:getstatic       #295 <Field PdfName PdfName.CONTENTS>
	//  232  478:new             #372 <Class PdfString>
	//  233  481:dup             
	//  234  482:aload_1         
	//  235  483:invokespecial   #375 <Method void PdfString(byte[])>
	//  236  486:iconst_1        
	//  237  487:invokevirtual   #379 <Method PdfString PdfString.setHexWriting(boolean)>
	//  238  490:invokevirtual   #382 <Method void PdfDictionary.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
			pdfsignatureappearance.close(((PdfDictionary) (externalsignature)));
	//  239  493:aload_0         
	//  240  494:aload_2         
	//  241  495:invokevirtual   #385 <Method void PdfSignatureAppearance.close(PdfDictionary)>
			return;
	//  242  498:return          
		}
	}

	public static void signExternalContainer(PdfSignatureAppearance pdfsignatureappearance, ExternalSignatureContainer externalsignaturecontainer, int i)
		throws GeneralSecurityException, IOException, DocumentException
	{
		Object obj = ((Object) (new PdfSignature(((PdfName) (null)), ((PdfName) (null)))));
	//    0    0:new             #245 <Class PdfSignature>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:invokespecial   #248 <Method void PdfSignature(PdfName, PdfName)>
	//    5    9:astore_3        
		((PdfSignature) (obj)).setReason(pdfsignatureappearance.getReason());
	//    6   10:aload_3         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #251 <Method String PdfSignatureAppearance.getReason()>
	//    9   15:invokevirtual   #254 <Method void PdfSignature.setReason(String)>
		((PdfSignature) (obj)).setLocation(pdfsignatureappearance.getLocation());
	//   10   18:aload_3         
	//   11   19:aload_0         
	//   12   20:invokevirtual   #257 <Method String PdfSignatureAppearance.getLocation()>
	//   13   23:invokevirtual   #260 <Method void PdfSignature.setLocation(String)>
		((PdfSignature) (obj)).setSignatureCreator(pdfsignatureappearance.getSignatureCreator());
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:invokevirtual   #263 <Method String PdfSignatureAppearance.getSignatureCreator()>
	//   17   31:invokevirtual   #266 <Method void PdfSignature.setSignatureCreator(String)>
		((PdfSignature) (obj)).setContact(pdfsignatureappearance.getContact());
	//   18   34:aload_3         
	//   19   35:aload_0         
	//   20   36:invokevirtual   #269 <Method String PdfSignatureAppearance.getContact()>
	//   21   39:invokevirtual   #272 <Method void PdfSignature.setContact(String)>
		((PdfSignature) (obj)).setDate(new PdfDate(pdfsignatureappearance.getSignDate()));
	//   22   42:aload_3         
	//   23   43:new             #274 <Class PdfDate>
	//   24   46:dup             
	//   25   47:aload_0         
	//   26   48:invokevirtual   #278 <Method java.util.Calendar PdfSignatureAppearance.getSignDate()>
	//   27   51:invokespecial   #281 <Method void PdfDate(java.util.Calendar)>
	//   28   54:invokevirtual   #285 <Method void PdfSignature.setDate(PdfDate)>
		externalsignaturecontainer.modifySigningDictionary(((PdfDictionary) (obj)));
	//   29   57:aload_1         
	//   30   58:aload_3         
	//   31   59:invokeinterface #391 <Method void ExternalSignatureContainer.modifySigningDictionary(PdfDictionary)>
		pdfsignatureappearance.setCryptoDictionary(((PdfDictionary) (obj)));
	//   32   64:aload_0         
	//   33   65:aload_3         
	//   34   66:invokevirtual   #289 <Method void PdfSignatureAppearance.setCryptoDictionary(PdfDictionary)>
		obj = ((Object) (new HashMap()));
	//   35   69:new             #291 <Class HashMap>
	//   36   72:dup             
	//   37   73:invokespecial   #292 <Method void HashMap()>
	//   38   76:astore_3        
		((HashMap) (obj)).put(((Object) (PdfName.CONTENTS)), ((Object) (new Integer(i * 2 + 2))));
	//   39   77:aload_3         
	//   40   78:getstatic       #295 <Field PdfName PdfName.CONTENTS>
	//   41   81:new             #297 <Class Integer>
	//   42   84:dup             
	//   43   85:iload_2         
	//   44   86:iconst_2        
	//   45   87:imul            
	//   46   88:iconst_2        
	//   47   89:iadd            
	//   48   90:invokespecial   #298 <Method void Integer(int)>
	//   49   93:invokevirtual   #302 <Method Object HashMap.put(Object, Object)>
	//   50   96:pop             
		pdfsignatureappearance.preClose(((HashMap) (obj)));
	//   51   97:aload_0         
	//   52   98:aload_3         
	//   53   99:invokevirtual   #306 <Method void PdfSignatureAppearance.preClose(HashMap)>
		byte abyte0[] = externalsignaturecontainer.sign(pdfsignatureappearance.getRangeStream());
	//   54  102:aload_1         
	//   55  103:aload_0         
	//   56  104:invokevirtual   #324 <Method java.io.InputStream PdfSignatureAppearance.getRangeStream()>
	//   57  107:invokeinterface #171 <Method byte[] ExternalSignatureContainer.sign(java.io.InputStream)>
	//   58  112:astore_3        
		if(i < abyte0.length)
	//*  59  113:iload_2         
	//*  60  114:aload_3         
	//*  61  115:arraylength     
	//*  62  116:icmpge          129
		{
			throw new IOException("Not enough space");
	//   63  119:new             #95  <Class IOException>
	//   64  122:dup             
	//   65  123:ldc1            #175 <String "Not enough space">
	//   66  125:invokespecial   #360 <Method void IOException(String)>
	//   67  128:athrow          
		} else
		{
			externalsignaturecontainer = ((ExternalSignatureContainer) (new byte[i]));
	//   68  129:iload_2         
	//   69  130:newarray        byte[]
	//   70  132:astore_1        
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (externalsignaturecontainer)), 0, abyte0.length);
	//   71  133:aload_3         
	//   72  134:iconst_0        
	//   73  135:aload_1         
	//   74  136:iconst_0        
	//   75  137:aload_3         
	//   76  138:arraylength     
	//   77  139:invokestatic    #369 <Method void System.arraycopy(Object, int, Object, int, int)>
			PdfDictionary pdfdictionary = new PdfDictionary();
	//   78  142:new             #127 <Class PdfDictionary>
	//   79  145:dup             
	//   80  146:invokespecial   #370 <Method void PdfDictionary()>
	//   81  149:astore_3        
			pdfdictionary.put(PdfName.CONTENTS, ((com.itextpdf.text.pdf.PdfObject) ((new PdfString(((byte []) (externalsignaturecontainer)))).setHexWriting(true))));
	//   82  150:aload_3         
	//   83  151:getstatic       #295 <Field PdfName PdfName.CONTENTS>
	//   84  154:new             #372 <Class PdfString>
	//   85  157:dup             
	//   86  158:aload_1         
	//   87  159:invokespecial   #375 <Method void PdfString(byte[])>
	//   88  162:iconst_1        
	//   89  163:invokevirtual   #379 <Method PdfString PdfString.setHexWriting(boolean)>
	//   90  166:invokevirtual   #382 <Method void PdfDictionary.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
			pdfsignatureappearance.close(pdfdictionary);
	//   91  169:aload_0         
	//   92  170:aload_3         
	//   93  171:invokevirtual   #385 <Method void PdfSignatureAppearance.close(PdfDictionary)>
			return;
	//   94  174:return          
		}
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/security/MakeSignature);

	static 
	{
	//    0    0:ldc1            #2   <Class MakeSignature>
	//    1    2:invokestatic    #17  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #19  <Field Logger LOGGER>
	//*   3    8:return          
	}
}
