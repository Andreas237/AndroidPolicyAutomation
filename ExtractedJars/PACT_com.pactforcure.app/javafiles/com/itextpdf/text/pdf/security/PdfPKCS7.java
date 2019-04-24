// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.PdfName;
import java.io.*;
import java.math.BigInteger;
import java.security.*;
import java.security.cert.*;
import java.util.*;
import org.spongycastle.asn1.*;
import org.spongycastle.asn1.cms.*;
import org.spongycastle.asn1.esf.SignaturePolicyIdentifier;
import org.spongycastle.asn1.ess.*;
import org.spongycastle.asn1.ocsp.BasicOCSPResponse;
import org.spongycastle.asn1.ocsp.OCSPObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.tsp.MessageImprint;
import org.spongycastle.asn1.tsp.TSTInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.cert.jcajce.JcaX509CertificateHolder;
import org.spongycastle.cert.ocsp.*;
import org.spongycastle.jce.X509Principal;
import org.spongycastle.jce.provider.X509CertParser;
import org.spongycastle.operator.DigestCalculatorProvider;
import org.spongycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;
import org.spongycastle.tsp.TimeStampToken;
import org.spongycastle.tsp.TimeStampTokenInfo;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			DigestAlgorithms, BouncyCastleDigest, ExternalDigest, CertificateInfo, 
//			TSAClient, EncryptionAlgorithms, SignaturePolicyInfo

public class PdfPKCS7
{

	public PdfPKCS7(PrivateKey privatekey, Certificate acertificate[], String s, String s1, ExternalDigest externaldigest, boolean flag)
		throws InvalidKeyException, NoSuchProviderException, NoSuchAlgorithmException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void Object()>
		version = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #68  <Field int version>
		signerversion = 1;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #70  <Field int signerversion>
		provider = s1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #72  <Field String provider>
		interfaceDigest = externaldigest;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #74  <Field ExternalDigest interfaceDigest>
		digestAlgorithmOid = DigestAlgorithms.getAllowedDigests(s);
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:invokestatic    #80  <Method String DigestAlgorithms.getAllowedDigests(String)>
	//   17   31:putfield        #82  <Field String digestAlgorithmOid>
		if(digestAlgorithmOid == null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #82  <Field String digestAlgorithmOid>
	//*  20   38:ifnonnull       62
			throw new NoSuchAlgorithmException(MessageLocalization.getComposedMessage("unknown.hash.algorithm.1", new Object[] {
				s
			}));
	//   21   41:new             #63  <Class NoSuchAlgorithmException>
	//   22   44:dup             
	//   23   45:ldc1            #84  <String "unknown.hash.algorithm.1">
	//   24   47:iconst_1        
	//   25   48:anewarray       Object[]
	//   26   51:dup             
	//   27   52:iconst_0        
	//   28   53:aload_3         
	//   29   54:aastore         
	//   30   55:invokestatic    #90  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   31   58:invokespecial   #93  <Method void NoSuchAlgorithmException(String)>
	//   32   61:athrow          
		signCert = (X509Certificate)acertificate[0];
	//   33   62:aload_0         
	//   34   63:aload_2         
	//   35   64:iconst_0        
	//   36   65:aaload          
	//   37   66:checkcast       #95  <Class X509Certificate>
	//   38   69:putfield        #97  <Field X509Certificate signCert>
		certs = ((Collection) (new ArrayList()));
	//   39   72:aload_0         
	//   40   73:new             #99  <Class ArrayList>
	//   41   76:dup             
	//   42   77:invokespecial   #100 <Method void ArrayList()>
	//   43   80:putfield        #102 <Field Collection certs>
		int j = acertificate.length;
	//   44   83:aload_2         
	//   45   84:arraylength     
	//   46   85:istore          8
		for(int i = 0; i < j; i++)
	//*  47   87:iconst_0        
	//*  48   88:istore          7
	//*  49   90:iload           7
	//*  50   92:iload           8
	//*  51   94:icmpge          122
		{
			s = ((String) (acertificate[i]));
	//   52   97:aload_2         
	//   53   98:iload           7
	//   54  100:aaload          
	//   55  101:astore_3        
			certs.add(((Object) (s)));
	//   56  102:aload_0         
	//   57  103:getfield        #102 <Field Collection certs>
	//   58  106:aload_3         
	//   59  107:invokeinterface #108 <Method boolean Collection.add(Object)>
	//   60  112:pop             
		}

	//   61  113:iload           7
	//   62  115:iconst_1        
	//   63  116:iadd            
	//   64  117:istore          7
	//*  65  119:goto            90
		digestalgos = ((Set) (new HashSet()));
	//   66  122:aload_0         
	//   67  123:new             #110 <Class HashSet>
	//   68  126:dup             
	//   69  127:invokespecial   #111 <Method void HashSet()>
	//   70  130:putfield        #113 <Field Set digestalgos>
		digestalgos.add(((Object) (digestAlgorithmOid)));
	//   71  133:aload_0         
	//   72  134:getfield        #113 <Field Set digestalgos>
	//   73  137:aload_0         
	//   74  138:getfield        #82  <Field String digestAlgorithmOid>
	//   75  141:invokeinterface #116 <Method boolean Set.add(Object)>
	//   76  146:pop             
		if(privatekey != null)
	//*  77  147:aload_1         
	//*  78  148:ifnull          179
		{
			digestEncryptionAlgorithmOid = privatekey.getAlgorithm();
	//   79  151:aload_0         
	//   80  152:aload_1         
	//   81  153:invokeinterface #122 <Method String PrivateKey.getAlgorithm()>
	//   82  158:putfield        #124 <Field String digestEncryptionAlgorithmOid>
			if(digestEncryptionAlgorithmOid.equals("RSA"))
	//*  83  161:aload_0         
	//*  84  162:getfield        #124 <Field String digestEncryptionAlgorithmOid>
	//*  85  165:ldc1            #126 <String "RSA">
	//*  86  167:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  87  170:ifeq            218
				digestEncryptionAlgorithmOid = "1.2.840.113549.1.1.1";
	//   88  173:aload_0         
	//   89  174:ldc1            #133 <String "1.2.840.113549.1.1.1">
	//   90  176:putfield        #124 <Field String digestEncryptionAlgorithmOid>
			else
	//*  91  179:iload           6
	//*  92  181:ifeq            204
	//*  93  184:aload_0         
	//*  94  185:iconst_0        
	//*  95  186:newarray        byte[]
	//*  96  188:putfield        #135 <Field byte[] RSAdata>
	//*  97  191:aload_0         
	//*  98  192:aload_0         
	//*  99  193:invokevirtual   #138 <Method String getHashAlgorithm()>
	//* 100  196:aload           4
	//* 101  198:invokestatic    #142 <Method MessageDigest DigestAlgorithms.getMessageDigest(String, String)>
	//* 102  201:putfield        #144 <Field MessageDigest messageDigest>
	//* 103  204:aload_1         
	//* 104  205:ifnull          217
	//* 105  208:aload_0         
	//* 106  209:aload_0         
	//* 107  210:aload_1         
	//* 108  211:invokespecial   #148 <Method Signature initSignature(PrivateKey)>
	//* 109  214:putfield        #150 <Field Signature sig>
	//* 110  217:return          
			if(digestEncryptionAlgorithmOid.equals("DSA"))
	//* 111  218:aload_0         
	//* 112  219:getfield        #124 <Field String digestEncryptionAlgorithmOid>
	//* 113  222:ldc1            #152 <String "DSA">
	//* 114  224:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 115  227:ifeq            239
				digestEncryptionAlgorithmOid = "1.2.840.10040.4.1";
	//  116  230:aload_0         
	//  117  231:ldc1            #154 <String "1.2.840.10040.4.1">
	//  118  233:putfield        #124 <Field String digestEncryptionAlgorithmOid>
			else
	//* 119  236:goto            179
				throw new NoSuchAlgorithmException(MessageLocalization.getComposedMessage("unknown.key.algorithm.1", new Object[] {
					digestEncryptionAlgorithmOid
				}));
	//  120  239:new             #63  <Class NoSuchAlgorithmException>
	//  121  242:dup             
	//  122  243:ldc1            #156 <String "unknown.key.algorithm.1">
	//  123  245:iconst_1        
	//  124  246:anewarray       Object[]
	//  125  249:dup             
	//  126  250:iconst_0        
	//  127  251:aload_0         
	//  128  252:getfield        #124 <Field String digestEncryptionAlgorithmOid>
	//  129  255:aastore         
	//  130  256:invokestatic    #90  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  131  259:invokespecial   #93  <Method void NoSuchAlgorithmException(String)>
	//  132  262:athrow          
		}
		if(flag)
		{
			RSAdata = new byte[0];
			messageDigest = DigestAlgorithms.getMessageDigest(getHashAlgorithm(), s1);
		}
		if(privatekey != null)
			sig = initSignature(privatekey);
	}

	public PdfPKCS7(byte abyte0[], PdfName pdfname, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void Object()>
		version = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #68  <Field int version>
		signerversion = 1;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #70  <Field int signerversion>
		filterSubtype = pdfname;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #165 <Field PdfName filterSubtype>
		isTsp = PdfName.ETSI_RFC3161.equals(((Object) (pdfname)));
	//   11   19:aload_0         
	//   12   20:getstatic       #170 <Field PdfName PdfName.ETSI_RFC3161>
	//   13   23:aload_2         
	//   14   24:invokevirtual   #171 <Method boolean PdfName.equals(Object)>
	//   15   27:putfield        #173 <Field boolean isTsp>
		isCades = PdfName.ETSI_CADES_DETACHED.equals(((Object) (pdfname)));
	//   16   30:aload_0         
	//   17   31:getstatic       #176 <Field PdfName PdfName.ETSI_CADES_DETACHED>
	//   18   34:aload_2         
	//   19   35:invokevirtual   #171 <Method boolean PdfName.equals(Object)>
	//   20   38:putfield        #178 <Field boolean isCades>
		provider = s;
	//   21   41:aload_0         
	//   22   42:aload_3         
	//   23   43:putfield        #72  <Field String provider>
		pdfname = ((PdfName) (new ASN1InputStream(((java.io.InputStream) (new ByteArrayInputStream(abyte0))))));
	//   24   46:new             #180 <Class ASN1InputStream>
	//   25   49:dup             
	//   26   50:new             #182 <Class ByteArrayInputStream>
	//   27   53:dup             
	//   28   54:aload_1         
	//   29   55:invokespecial   #185 <Method void ByteArrayInputStream(byte[])>
	//   30   58:invokespecial   #188 <Method void ASN1InputStream(java.io.InputStream)>
	//   31   61:astore_2        
		pdfname = ((PdfName) (((ASN1InputStream) (pdfname)).readObject()));
	//   32   62:aload_2         
	//   33   63:invokevirtual   #192 <Method ASN1Primitive ASN1InputStream.readObject()>
	//   34   66:astore_2        
		if(!(pdfname instanceof ASN1Sequence))
	//*  35   67:aload_2         
	//*  36   68:instanceof      #194 <Class ASN1Sequence>
	//*  37   71:ifne            119
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("not.a.valid.pkcs.7.object.not.a.sequence", new Object[0]));
	//   38   74:new             #196 <Class IllegalArgumentException>
	//   39   77:dup             
	//   40   78:ldc1            #198 <String "not.a.valid.pkcs.7.object.not.a.sequence">
	//   41   80:iconst_0        
	//   42   81:anewarray       Object[]
	//   43   84:invokestatic    #90  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   44   87:invokespecial   #199 <Method void IllegalArgumentException(String)>
	//   45   90:athrow          
		break MISSING_BLOCK_LABEL_119;
	//*  46   91:astore_1        
	//*  47   92:new             #201 <Class ExceptionConverter>
	//*  48   95:dup             
	//*  49   96:aload_1         
	//*  50   97:invokespecial   #204 <Method void ExceptionConverter(Exception)>
	//*  51  100:athrow          
		abyte0;
	//   52  101:astore_1        
		throw new IllegalArgumentException(MessageLocalization.getComposedMessage("can.t.decode.pkcs7signeddata.object", new Object[0]));
	//   53  102:new             #196 <Class IllegalArgumentException>
	//   54  105:dup             
	//   55  106:ldc1            #206 <String "can.t.decode.pkcs7signeddata.object">
	//   56  108:iconst_0        
	//   57  109:anewarray       Object[]
	//   58  112:invokestatic    #90  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   59  115:invokespecial   #199 <Method void IllegalArgumentException(String)>
	//   60  118:athrow          
		Object obj;
		pdfname = ((PdfName) ((ASN1Sequence)pdfname));
	//   61  119:aload_2         
	//   62  120:checkcast       #194 <Class ASN1Sequence>
	//   63  123:astore_2        
		if(!((ASN1ObjectIdentifier)((ASN1Sequence) (pdfname)).getObjectAt(0)).getId().equals("1.2.840.113549.1.7.2"))
	//*  64  124:aload_2         
	//*  65  125:iconst_0        
	//*  66  126:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//*  67  129:checkcast       #212 <Class ASN1ObjectIdentifier>
	//*  68  132:invokevirtual   #215 <Method String ASN1ObjectIdentifier.getId()>
	//*  69  135:ldc1            #217 <String "1.2.840.113549.1.7.2">
	//*  70  137:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  71  140:ifne            160
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("not.a.valid.pkcs.7.object.not.signed.data", new Object[0]));
	//   72  143:new             #196 <Class IllegalArgumentException>
	//   73  146:dup             
	//   74  147:ldc1            #219 <String "not.a.valid.pkcs.7.object.not.signed.data">
	//   75  149:iconst_0        
	//   76  150:anewarray       Object[]
	//   77  153:invokestatic    #90  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   78  156:invokespecial   #199 <Method void IllegalArgumentException(String)>
	//   79  159:athrow          
		obj = ((Object) ((ASN1Sequence)((ASN1TaggedObject)((ASN1Sequence) (pdfname)).getObjectAt(1)).getObject()));
	//   80  160:aload_2         
	//   81  161:iconst_1        
	//   82  162:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//   83  165:checkcast       #221 <Class ASN1TaggedObject>
	//   84  168:invokevirtual   #224 <Method ASN1Primitive ASN1TaggedObject.getObject()>
	//   85  171:checkcast       #194 <Class ASN1Sequence>
	//   86  174:astore          8
		version = ((ASN1Integer)((ASN1Sequence) (obj)).getObjectAt(0)).getValue().intValue();
	//   87  176:aload_0         
	//   88  177:aload           8
	//   89  179:iconst_0        
	//   90  180:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//   91  183:checkcast       #226 <Class ASN1Integer>
	//   92  186:invokevirtual   #230 <Method BigInteger ASN1Integer.getValue()>
	//   93  189:invokevirtual   #236 <Method int BigInteger.intValue()>
	//   94  192:putfield        #68  <Field int version>
		digestalgos = ((Set) (new HashSet()));
	//   95  195:aload_0         
	//   96  196:new             #110 <Class HashSet>
	//   97  199:dup             
	//   98  200:invokespecial   #111 <Method void HashSet()>
	//   99  203:putfield        #113 <Field Set digestalgos>
		ASN1ObjectIdentifier asn1objectidentifier;
		for(Enumeration enumeration = ((ASN1Set)((ASN1Sequence) (obj)).getObjectAt(1)).getObjects(); enumeration.hasMoreElements(); digestalgos.add(((Object) (asn1objectidentifier.getId()))))
	//* 100  206:aload           8
	//* 101  208:iconst_1        
	//* 102  209:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//* 103  212:checkcast       #238 <Class ASN1Set>
	//* 104  215:invokevirtual   #242 <Method Enumeration ASN1Set.getObjects()>
	//* 105  218:astore          9
	//* 106  220:aload           9
	//* 107  222:invokeinterface #248 <Method boolean Enumeration.hasMoreElements()>
	//* 108  227:ifeq            267
			asn1objectidentifier = (ASN1ObjectIdentifier)((ASN1Sequence)enumeration.nextElement()).getObjectAt(0);
	//  109  230:aload           9
	//  110  232:invokeinterface #252 <Method Object Enumeration.nextElement()>
	//  111  237:checkcast       #194 <Class ASN1Sequence>
	//  112  240:iconst_0        
	//  113  241:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  114  244:checkcast       #212 <Class ASN1ObjectIdentifier>
	//  115  247:astore          10

	//  116  249:aload_0         
	//  117  250:getfield        #113 <Field Set digestalgos>
	//  118  253:aload           10
	//  119  255:invokevirtual   #215 <Method String ASN1ObjectIdentifier.getId()>
	//  120  258:invokeinterface #116 <Method boolean Set.add(Object)>
	//  121  263:pop             
		break MISSING_BLOCK_LABEL_267;
	//  122  264:goto            220
	//* 123  267:aload           8
	//* 124  269:iconst_2        
	//* 125  270:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//* 126  273:checkcast       #194 <Class ASN1Sequence>
	//* 127  276:astore          9
	//* 128  278:aload           9
	//* 129  280:invokevirtual   #255 <Method int ASN1Sequence.size()>
	//* 130  283:iconst_1        
	//* 131  284:icmple          1403
	//* 132  287:aload_0         
	//* 133  288:aload           9
	//* 134  290:iconst_1        
	//* 135  291:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//* 136  294:checkcast       #221 <Class ASN1TaggedObject>
	//* 137  297:invokevirtual   #224 <Method ASN1Primitive ASN1TaggedObject.getObject()>
	//* 138  300:checkcast       #257 <Class ASN1OctetString>
	//* 139  303:invokevirtual   #261 <Method byte[] ASN1OctetString.getOctets()>
	//* 140  306:putfield        #135 <Field byte[] RSAdata>
	//* 141  309:goto            1403
_L22:
		int i;
		for(; ((ASN1Sequence) (obj)).getObjectAt(i) instanceof ASN1TaggedObject; i++);
	//  142  312:aload           8
	//  143  314:iload           4
	//  144  316:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  145  319:instanceof      #221 <Class ASN1TaggedObject>
	//  146  322:ifeq            334
	//  147  325:iload           4
	//  148  327:iconst_1        
	//  149  328:iadd            
	//  150  329:istore          4
	//* 151  331:goto            312
		Object obj1 = ((Object) (new X509CertParser()));
	//  152  334:new             #263 <Class X509CertParser>
	//  153  337:dup             
	//  154  338:invokespecial   #264 <Method void X509CertParser()>
	//  155  341:astore          9
		((X509CertParser) (obj1)).engineInit(((java.io.InputStream) (new ByteArrayInputStream(abyte0))));
	//  156  343:aload           9
	//  157  345:new             #182 <Class ByteArrayInputStream>
	//  158  348:dup             
	//  159  349:aload_1         
	//  160  350:invokespecial   #185 <Method void ByteArrayInputStream(byte[])>
	//  161  353:invokevirtual   #267 <Method void X509CertParser.engineInit(java.io.InputStream)>
		certs = ((X509CertParser) (obj1)).engineReadAll();
	//  162  356:aload_0         
	//  163  357:aload           9
	//  164  359:invokevirtual   #271 <Method Collection X509CertParser.engineReadAll()>
	//  165  362:putfield        #102 <Field Collection certs>
		abyte0 = ((byte []) ((ASN1Set)((ASN1Sequence) (obj)).getObjectAt(i)));
	//  166  365:aload           8
	//  167  367:iload           4
	//  168  369:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  169  372:checkcast       #238 <Class ASN1Set>
	//  170  375:astore_1        
		if(((ASN1Set) (abyte0)).size() != 1)
	//* 171  376:aload_1         
	//* 172  377:invokevirtual   #272 <Method int ASN1Set.size()>
	//* 173  380:iconst_1        
	//* 174  381:icmpeq          402
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("this.pkcs.7.object.has.multiple.signerinfos.only.one.is.supported.at.this.time", new Object[0]));
	//  175  384:new             #196 <Class IllegalArgumentException>
	//  176  387:dup             
	//  177  388:ldc2            #274 <String "this.pkcs.7.object.has.multiple.signerinfos.only.one.is.supported.at.this.time">
	//  178  391:iconst_0        
	//  179  392:anewarray       Object[]
	//  180  395:invokestatic    #90  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  181  398:invokespecial   #199 <Method void IllegalArgumentException(String)>
	//  182  401:athrow          
		abyte0 = ((byte []) ((ASN1Sequence)((ASN1Set) (abyte0)).getObjectAt(0)));
	//  183  402:aload_1         
	//  184  403:iconst_0        
	//  185  404:invokevirtual   #275 <Method ASN1Encodable ASN1Set.getObjectAt(int)>
	//  186  407:checkcast       #194 <Class ASN1Sequence>
	//  187  410:astore_1        
		signerversion = ((ASN1Integer)((ASN1Sequence) (abyte0)).getObjectAt(0)).getValue().intValue();
	//  188  411:aload_0         
	//  189  412:aload_1         
	//  190  413:iconst_0        
	//  191  414:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  192  417:checkcast       #226 <Class ASN1Integer>
	//  193  420:invokevirtual   #230 <Method BigInteger ASN1Integer.getValue()>
	//  194  423:invokevirtual   #236 <Method int BigInteger.intValue()>
	//  195  426:putfield        #70  <Field int signerversion>
		obj1 = ((Object) ((ASN1Sequence)((ASN1Sequence) (abyte0)).getObjectAt(1)));
	//  196  429:aload_1         
	//  197  430:iconst_1        
	//  198  431:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  199  434:checkcast       #194 <Class ASN1Sequence>
	//  200  437:astore          9
		obj = ((Object) (new X509Principal(((ASN1Sequence) (obj1)).getObjectAt(0).toASN1Primitive().getEncoded())));
	//  201  439:new             #277 <Class X509Principal>
	//  202  442:dup             
	//  203  443:aload           9
	//  204  445:iconst_0        
	//  205  446:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  206  449:invokeinterface #282 <Method ASN1Primitive ASN1Encodable.toASN1Primitive()>
	//  207  454:invokevirtual   #287 <Method byte[] ASN1Primitive.getEncoded()>
	//  208  457:invokespecial   #288 <Method void X509Principal(byte[])>
	//  209  460:astore          8
		obj1 = ((Object) (((ASN1Integer)((ASN1Sequence) (obj1)).getObjectAt(1)).getValue()));
	//  210  462:aload           9
	//  211  464:iconst_1        
	//  212  465:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  213  468:checkcast       #226 <Class ASN1Integer>
	//  214  471:invokevirtual   #230 <Method BigInteger ASN1Integer.getValue()>
	//  215  474:astore          9
		Iterator iterator = certs.iterator();
	//  216  476:aload_0         
	//  217  477:getfield        #102 <Field Collection certs>
	//  218  480:invokeinterface #292 <Method Iterator Collection.iterator()>
	//  219  485:astore          10
		do
		{
			if(!iterator.hasNext())
				break;
	//  220  487:aload           10
	//  221  489:invokeinterface #297 <Method boolean Iterator.hasNext()>
	//  222  494:ifeq            543
			X509Certificate x509certificate = (X509Certificate)iterator.next();
	//  223  497:aload           10
	//  224  499:invokeinterface #300 <Method Object Iterator.next()>
	//  225  504:checkcast       #95  <Class X509Certificate>
	//  226  507:astore          11
			if(!x509certificate.getIssuerDN().equals(obj) || !((BigInteger) (obj1)).equals(((Object) (x509certificate.getSerialNumber()))))
				continue;
	//  227  509:aload           11
	//  228  511:invokevirtual   #304 <Method Principal X509Certificate.getIssuerDN()>
	//  229  514:aload           8
	//  230  516:invokeinterface #307 <Method boolean Principal.equals(Object)>
	//  231  521:ifeq            487
	//  232  524:aload           9
	//  233  526:aload           11
	//  234  528:invokevirtual   #310 <Method BigInteger X509Certificate.getSerialNumber()>
	//  235  531:invokevirtual   #311 <Method boolean BigInteger.equals(Object)>
	//  236  534:ifeq            487
			signCert = x509certificate;
	//  237  537:aload_0         
	//  238  538:aload           11
	//  239  540:putfield        #97  <Field X509Certificate signCert>
			break;
		} while(true);
		if(signCert == null)
	//* 240  543:aload_0         
	//* 241  544:getfield        #97  <Field X509Certificate signCert>
	//* 242  547:ifnonnull       605
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("can.t.find.signing.certificate.with.serial.1", new Object[] {
				(new StringBuilder()).append(((X509Principal) (obj)).getName()).append(" / ").append(((BigInteger) (obj1)).toString(16)).toString()
			}));
	//  243  550:new             #196 <Class IllegalArgumentException>
	//  244  553:dup             
	//  245  554:ldc2            #313 <String "can.t.find.signing.certificate.with.serial.1">
	//  246  557:iconst_1        
	//  247  558:anewarray       Object[]
	//  248  561:dup             
	//  249  562:iconst_0        
	//  250  563:new             #315 <Class StringBuilder>
	//  251  566:dup             
	//  252  567:invokespecial   #316 <Method void StringBuilder()>
	//  253  570:aload           8
	//  254  572:invokevirtual   #319 <Method String X509Principal.getName()>
	//  255  575:invokevirtual   #323 <Method StringBuilder StringBuilder.append(String)>
	//  256  578:ldc2            #325 <String " / ">
	//  257  581:invokevirtual   #323 <Method StringBuilder StringBuilder.append(String)>
	//  258  584:aload           9
	//  259  586:bipush          16
	//  260  588:invokevirtual   #329 <Method String BigInteger.toString(int)>
	//  261  591:invokevirtual   #323 <Method StringBuilder StringBuilder.append(String)>
	//  262  594:invokevirtual   #331 <Method String StringBuilder.toString()>
	//  263  597:aastore         
	//  264  598:invokestatic    #90  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  265  601:invokespecial   #199 <Method void IllegalArgumentException(String)>
	//  266  604:athrow          
		signCertificateChain();
	//  267  605:aload_0         
	//  268  606:invokespecial   #334 <Method void signCertificateChain()>
		digestAlgorithmOid = ((ASN1ObjectIdentifier)((ASN1Sequence)((ASN1Sequence) (abyte0)).getObjectAt(2)).getObjectAt(0)).getId();
	//  269  609:aload_0         
	//  270  610:aload_1         
	//  271  611:iconst_2        
	//  272  612:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  273  615:checkcast       #194 <Class ASN1Sequence>
	//  274  618:iconst_0        
	//  275  619:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  276  622:checkcast       #212 <Class ASN1ObjectIdentifier>
	//  277  625:invokevirtual   #215 <Method String ASN1ObjectIdentifier.getId()>
	//  278  628:putfield        #82  <Field String digestAlgorithmOid>
		int k;
		k = 0;
	//  279  631:iconst_0        
	//  280  632:istore          6
		i = 0;
	//  281  634:iconst_0        
	//  282  635:istore          4
		if(!(((ASN1Sequence) (abyte0)).getObjectAt(3) instanceof ASN1TaggedObject)) goto _L2; else goto _L1
	//  283  637:aload_1         
	//  284  638:iconst_3        
	//  285  639:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  286  642:instanceof      #221 <Class ASN1TaggedObject>
	//  287  645:ifeq            1393
_L1:
		obj = ((Object) (ASN1Set.getInstance((ASN1TaggedObject)((ASN1Sequence) (abyte0)).getObjectAt(3), false)));
	//  288  648:aload_1         
	//  289  649:iconst_3        
	//  290  650:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  291  653:checkcast       #221 <Class ASN1TaggedObject>
	//  292  656:iconst_0        
	//  293  657:invokestatic    #338 <Method ASN1Set ASN1Set.getInstance(ASN1TaggedObject, boolean)>
	//  294  660:astore          8
		sigAttr = ((ASN1Set) (obj)).getEncoded();
	//  295  662:aload_0         
	//  296  663:aload           8
	//  297  665:invokevirtual   #339 <Method byte[] ASN1Set.getEncoded()>
	//  298  668:putfield        #341 <Field byte[] sigAttr>
		sigAttrDer = ((ASN1Set) (obj)).getEncoded("DER");
	//  299  671:aload_0         
	//  300  672:aload           8
	//  301  674:ldc2            #343 <String "DER">
	//  302  677:invokevirtual   #346 <Method byte[] ASN1Set.getEncoded(String)>
	//  303  680:putfield        #348 <Field byte[] sigAttrDer>
		k = 0;
	//  304  683:iconst_0        
	//  305  684:istore          6
_L23:
		if(k >= ((ASN1Set) (obj)).size()) goto _L4; else goto _L3
	//  306  686:iload           6
	//  307  688:aload           8
	//  308  690:invokevirtual   #272 <Method int ASN1Set.size()>
	//  309  693:icmpge          1074
_L3:
		obj2 = ((Object) ((ASN1Sequence)((ASN1Set) (obj)).getObjectAt(k)));
	//  310  696:aload           8
	//  311  698:iload           6
	//  312  700:invokevirtual   #275 <Method ASN1Encodable ASN1Set.getObjectAt(int)>
	//  313  703:checkcast       #194 <Class ASN1Sequence>
	//  314  706:astore          9
		abyte1 = ((byte []) (((ASN1ObjectIdentifier)((ASN1Sequence) (obj2)).getObjectAt(0)).getId()));
	//  315  708:aload           9
	//  316  710:iconst_0        
	//  317  711:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  318  714:checkcast       #212 <Class ASN1ObjectIdentifier>
	//  319  717:invokevirtual   #215 <Method String ASN1ObjectIdentifier.getId()>
	//  320  720:astore          10
		if(!((String) (abyte1)).equals("1.2.840.113549.1.9.4")) goto _L6; else goto _L5
	//  321  722:aload           10
	//  322  724:ldc2            #350 <String "1.2.840.113549.1.9.4">
	//  323  727:invokevirtual   #131 <Method boolean String.equals(Object)>
	//  324  730:ifeq            763
_L5:
		digestAttr = ((ASN1OctetString)((ASN1Set)((ASN1Sequence) (obj2)).getObjectAt(1)).getObjectAt(0)).getOctets();
	//  325  733:aload_0         
	//  326  734:aload           9
	//  327  736:iconst_1        
	//  328  737:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  329  740:checkcast       #238 <Class ASN1Set>
	//  330  743:iconst_0        
	//  331  744:invokevirtual   #275 <Method ASN1Encodable ASN1Set.getObjectAt(int)>
	//  332  747:checkcast       #257 <Class ASN1OctetString>
	//  333  750:invokevirtual   #261 <Method byte[] ASN1OctetString.getOctets()>
	//  334  753:putfield        #352 <Field byte[] digestAttr>
		int j = i;
	//  335  756:iload           4
	//  336  758:istore          5
		  goto _L7
	//* 337  760:goto            1409
_L6:
		if(!((String) (abyte1)).equals("1.2.840.113583.1.1.8")) goto _L9; else goto _L8
	//  338  763:aload           10
	//  339  765:ldc2            #354 <String "1.2.840.113583.1.1.8">
	//  340  768:invokevirtual   #131 <Method boolean String.equals(Object)>
	//  341  771:ifeq            865
_L8:
		obj2 = ((Object) ((ASN1Sequence)((ASN1Set)((ASN1Sequence) (obj2)).getObjectAt(1)).getObjectAt(0)));
	//  342  774:aload           9
	//  343  776:iconst_1        
	//  344  777:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  345  780:checkcast       #238 <Class ASN1Set>
	//  346  783:iconst_0        
	//  347  784:invokevirtual   #275 <Method ASN1Encodable ASN1Set.getObjectAt(int)>
	//  348  787:checkcast       #194 <Class ASN1Sequence>
	//  349  790:astore          9
		int l = 0;
	//  350  792:iconst_0        
	//  351  793:istore          7
_L24:
		j = i;
	//  352  795:iload           4
	//  353  797:istore          5
		if(l >= ((ASN1Sequence) (obj2)).size()) goto _L7; else goto _L10
	//  354  799:iload           7
	//  355  801:aload           9
	//  356  803:invokevirtual   #255 <Method int ASN1Sequence.size()>
	//  357  806:icmpge          1409
_L10:
		abyte1 = ((byte []) ((ASN1TaggedObject)((ASN1Sequence) (obj2)).getObjectAt(l)));
	//  358  809:aload           9
	//  359  811:iload           7
	//  360  813:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  361  816:checkcast       #221 <Class ASN1TaggedObject>
	//  362  819:astore          10
		if(((ASN1TaggedObject) (abyte1)).getTagNo() == 0)
	//* 363  821:aload           10
	//* 364  823:invokevirtual   #357 <Method int ASN1TaggedObject.getTagNo()>
	//* 365  826:ifne            841
			findCRL((ASN1Sequence)((ASN1TaggedObject) (abyte1)).getObject());
	//  366  829:aload_0         
	//  367  830:aload           10
	//  368  832:invokevirtual   #224 <Method ASN1Primitive ASN1TaggedObject.getObject()>
	//  369  835:checkcast       #194 <Class ASN1Sequence>
	//  370  838:invokespecial   #361 <Method void findCRL(ASN1Sequence)>
		if(((ASN1TaggedObject) (abyte1)).getTagNo() == 1)
	//* 371  841:aload           10
	//* 372  843:invokevirtual   #357 <Method int ASN1TaggedObject.getTagNo()>
	//* 373  846:iconst_1        
	//* 374  847:icmpne          1422
			findOcsp((ASN1Sequence)((ASN1TaggedObject) (abyte1)).getObject());
	//  375  850:aload_0         
	//  376  851:aload           10
	//  377  853:invokevirtual   #224 <Method ASN1Primitive ASN1TaggedObject.getObject()>
	//  378  856:checkcast       #194 <Class ASN1Sequence>
	//  379  859:invokespecial   #364 <Method void findOcsp(ASN1Sequence)>
		  goto _L11
	//* 380  862:goto            1422
_L9:
		if(!isCades || !((String) (abyte1)).equals("1.2.840.113549.1.9.16.2.12")) goto _L13; else goto _L12
	//  381  865:aload_0         
	//  382  866:getfield        #178 <Field boolean isCades>
	//  383  869:ifeq            958
	//  384  872:aload           10
	//  385  874:ldc2            #366 <String "1.2.840.113549.1.9.16.2.12">
	//  386  877:invokevirtual   #131 <Method boolean String.equals(Object)>
	//  387  880:ifeq            958
_L12:
		obj2 = ((Object) (SigningCertificate.getInstance(((Object) ((ASN1Sequence)((ASN1Set)((ASN1Sequence) (obj2)).getObjectAt(1)).getObjectAt(0)))).getCerts()[0]));
	//  388  883:aload           9
	//  389  885:iconst_1        
	//  390  886:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  391  889:checkcast       #238 <Class ASN1Set>
	//  392  892:iconst_0        
	//  393  893:invokevirtual   #275 <Method ASN1Encodable ASN1Set.getObjectAt(int)>
	//  394  896:checkcast       #194 <Class ASN1Sequence>
	//  395  899:invokestatic    #371 <Method SigningCertificate SigningCertificate.getInstance(Object)>
	//  396  902:invokevirtual   #375 <Method ESSCertID[] SigningCertificate.getCerts()>
	//  397  905:iconst_0        
	//  398  906:aaload          
	//  399  907:astore          9
		abyte1 = signCert.getEncoded();
	//  400  909:aload_0         
	//  401  910:getfield        #97  <Field X509Certificate signCert>
	//  402  913:invokevirtual   #376 <Method byte[] X509Certificate.getEncoded()>
	//  403  916:astore          10
		if(!Arrays.equals((new BouncyCastleDigest()).getMessageDigest("SHA-1").digest(abyte1), ((ESSCertID) (obj2)).getCertHash()))
	//* 404  918:new             #378 <Class BouncyCastleDigest>
	//* 405  921:dup             
	//* 406  922:invokespecial   #379 <Method void BouncyCastleDigest()>
	//* 407  925:ldc2            #381 <String "SHA-1">
	//* 408  928:invokevirtual   #384 <Method MessageDigest BouncyCastleDigest.getMessageDigest(String)>
	//* 409  931:aload           10
	//* 410  933:invokevirtual   #389 <Method byte[] MessageDigest.digest(byte[])>
	//* 411  936:aload           9
	//* 412  938:invokevirtual   #394 <Method byte[] ESSCertID.getCertHash()>
	//* 413  941:invokestatic    #399 <Method boolean Arrays.equals(byte[], byte[])>
	//* 414  944:ifne            1431
			throw new IllegalArgumentException("Signing certificate doesn't match the ESS information.");
	//  415  947:new             #196 <Class IllegalArgumentException>
	//  416  950:dup             
	//  417  951:ldc2            #401 <String "Signing certificate doesn't match the ESS information.">
	//  418  954:invokespecial   #199 <Method void IllegalArgumentException(String)>
	//  419  957:athrow          
		  goto _L14
_L13:
		j = i;
	//  420  958:iload           4
	//  421  960:istore          5
		if(!isCades) goto _L7; else goto _L15
	//  422  962:aload_0         
	//  423  963:getfield        #178 <Field boolean isCades>
	//  424  966:ifeq            1409
_L15:
		j = i;
	//  425  969:iload           4
	//  426  971:istore          5
		if(!((String) (abyte1)).equals("1.2.840.113549.1.9.16.2.47")) goto _L7; else goto _L16
	//  427  973:aload           10
	//  428  975:ldc2            #403 <String "1.2.840.113549.1.9.16.2.47">
	//  429  978:invokevirtual   #131 <Method boolean String.equals(Object)>
	//  430  981:ifeq            1409
_L16:
		obj2 = ((Object) (SigningCertificateV2.getInstance(((Object) ((ASN1Sequence)((ASN1Set)((ASN1Sequence) (obj2)).getObjectAt(1)).getObjectAt(0)))).getCerts()[0]));
	//  431  984:aload           9
	//  432  986:iconst_1        
	//  433  987:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  434  990:checkcast       #238 <Class ASN1Set>
	//  435  993:iconst_0        
	//  436  994:invokevirtual   #275 <Method ASN1Encodable ASN1Set.getObjectAt(int)>
	//  437  997:checkcast       #194 <Class ASN1Sequence>
	//  438 1000:invokestatic    #408 <Method SigningCertificateV2 SigningCertificateV2.getInstance(Object)>
	//  439 1003:invokevirtual   #411 <Method ESSCertIDv2[] SigningCertificateV2.getCerts()>
	//  440 1006:iconst_0        
	//  441 1007:aaload          
	//  442 1008:astore          9
		AlgorithmIdentifier algorithmidentifier = ((ESSCertIDv2) (obj2)).getHashAlgorithm();
	//  443 1010:aload           9
	//  444 1012:invokevirtual   #416 <Method AlgorithmIdentifier ESSCertIDv2.getHashAlgorithm()>
	//  445 1015:astore          10
		byte abyte2[] = signCert.getEncoded();
	//  446 1017:aload_0         
	//  447 1018:getfield        #97  <Field X509Certificate signCert>
	//  448 1021:invokevirtual   #376 <Method byte[] X509Certificate.getEncoded()>
	//  449 1024:astore          11
		if(!Arrays.equals((new BouncyCastleDigest()).getMessageDigest(DigestAlgorithms.getDigest(algorithmidentifier.getAlgorithm().getId())).digest(abyte2), ((ESSCertIDv2) (obj2)).getCertHash()))
	//* 450 1026:new             #378 <Class BouncyCastleDigest>
	//* 451 1029:dup             
	//* 452 1030:invokespecial   #379 <Method void BouncyCastleDigest()>
	//* 453 1033:aload           10
	//* 454 1035:invokevirtual   #421 <Method ASN1ObjectIdentifier AlgorithmIdentifier.getAlgorithm()>
	//* 455 1038:invokevirtual   #215 <Method String ASN1ObjectIdentifier.getId()>
	//* 456 1041:invokestatic    #424 <Method String DigestAlgorithms.getDigest(String)>
	//* 457 1044:invokevirtual   #384 <Method MessageDigest BouncyCastleDigest.getMessageDigest(String)>
	//* 458 1047:aload           11
	//* 459 1049:invokevirtual   #389 <Method byte[] MessageDigest.digest(byte[])>
	//* 460 1052:aload           9
	//* 461 1054:invokevirtual   #425 <Method byte[] ESSCertIDv2.getCertHash()>
	//* 462 1057:invokestatic    #399 <Method boolean Arrays.equals(byte[], byte[])>
	//* 463 1060:ifne            1437
			throw new IllegalArgumentException("Signing certificate doesn't match the ESS information.");
	//  464 1063:new             #196 <Class IllegalArgumentException>
	//  465 1066:dup             
	//  466 1067:ldc2            #401 <String "Signing certificate doesn't match the ESS information.">
	//  467 1070:invokespecial   #199 <Method void IllegalArgumentException(String)>
	//  468 1073:athrow          
		  goto _L17
_L4:
		if(digestAttr == null)
	//* 469 1074:aload_0         
	//* 470 1075:getfield        #352 <Field byte[] digestAttr>
	//* 471 1078:ifnonnull       1443
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("authenticated.attribute.is.missing.the.digest", new Object[0]));
	//  472 1081:new             #196 <Class IllegalArgumentException>
	//  473 1084:dup             
	//  474 1085:ldc2            #427 <String "authenticated.attribute.is.missing.the.digest">
	//  475 1088:iconst_0        
	//  476 1089:anewarray       Object[]
	//  477 1092:invokestatic    #90  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  478 1095:invokespecial   #199 <Method void IllegalArgumentException(String)>
	//  479 1098:athrow          
		break MISSING_BLOCK_LABEL_1443;
_L21:
		if(!isCades || i != 0)
			break MISSING_BLOCK_LABEL_1122;
	//  480 1099:aload_0         
	//  481 1100:getfield        #178 <Field boolean isCades>
	//  482 1103:ifeq            1122
	//  483 1106:iload           4
	//  484 1108:ifne            1122
		throw new IllegalArgumentException("CAdES ESS information missing.");
	//  485 1111:new             #196 <Class IllegalArgumentException>
	//  486 1114:dup             
	//  487 1115:ldc2            #429 <String "CAdES ESS information missing.">
	//  488 1118:invokespecial   #199 <Method void IllegalArgumentException(String)>
	//  489 1121:athrow          
		i = j + 1;
	//  490 1122:iload           5
	//  491 1124:iconst_1        
	//  492 1125:iadd            
	//  493 1126:istore          4
		digestEncryptionAlgorithmOid = ((ASN1ObjectIdentifier)((ASN1Sequence)((ASN1Sequence) (abyte0)).getObjectAt(j)).getObjectAt(0)).getId();
	//  494 1128:aload_0         
	//  495 1129:aload_1         
	//  496 1130:iload           5
	//  497 1132:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  498 1135:checkcast       #194 <Class ASN1Sequence>
	//  499 1138:iconst_0        
	//  500 1139:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  501 1142:checkcast       #212 <Class ASN1ObjectIdentifier>
	//  502 1145:invokevirtual   #215 <Method String ASN1ObjectIdentifier.getId()>
	//  503 1148:putfield        #124 <Field String digestEncryptionAlgorithmOid>
		j = i + 1;
	//  504 1151:iload           4
	//  505 1153:iconst_1        
	//  506 1154:iadd            
	//  507 1155:istore          5
		digest = ((ASN1OctetString)((ASN1Sequence) (abyte0)).getObjectAt(i)).getOctets();
	//  508 1157:aload_0         
	//  509 1158:aload_1         
	//  510 1159:iload           4
	//  511 1161:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  512 1164:checkcast       #257 <Class ASN1OctetString>
	//  513 1167:invokevirtual   #261 <Method byte[] ASN1OctetString.getOctets()>
	//  514 1170:putfield        #431 <Field byte[] digest>
		if(j >= ((ASN1Sequence) (abyte0)).size() || !(((ASN1Sequence) (abyte0)).getObjectAt(j) instanceof ASN1TaggedObject))
			break MISSING_BLOCK_LABEL_1264;
	//  515 1173:iload           5
	//  516 1175:aload_1         
	//  517 1176:invokevirtual   #255 <Method int ASN1Sequence.size()>
	//  518 1179:icmpge          1264
	//  519 1182:aload_1         
	//  520 1183:iload           5
	//  521 1185:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  522 1188:instanceof      #221 <Class ASN1TaggedObject>
	//  523 1191:ifeq            1264
		abyte0 = ((byte []) ((new AttributeTable(ASN1Set.getInstance((ASN1TaggedObject)((ASN1Sequence) (abyte0)).getObjectAt(j), false))).get(PKCSObjectIdentifiers.id_aa_signatureTimeStampToken)));
	//  524 1194:new             #433 <Class AttributeTable>
	//  525 1197:dup             
	//  526 1198:aload_1         
	//  527 1199:iload           5
	//  528 1201:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//  529 1204:checkcast       #221 <Class ASN1TaggedObject>
	//  530 1207:iconst_0        
	//  531 1208:invokestatic    #338 <Method ASN1Set ASN1Set.getInstance(ASN1TaggedObject, boolean)>
	//  532 1211:invokespecial   #436 <Method void AttributeTable(ASN1Set)>
	//  533 1214:getstatic       #442 <Field ASN1ObjectIdentifier PKCSObjectIdentifiers.id_aa_signatureTimeStampToken>
	//  534 1217:invokevirtual   #446 <Method Attribute AttributeTable.get(ASN1ObjectIdentifier)>
	//  535 1220:astore_1        
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_1264;
	//  536 1221:aload_1         
	//  537 1222:ifnull          1264
		if(((Attribute) (abyte0)).getAttrValues().size() > 0)
	//* 538 1225:aload_1         
	//* 539 1226:invokevirtual   #452 <Method ASN1Set Attribute.getAttrValues()>
	//* 540 1229:invokevirtual   #272 <Method int ASN1Set.size()>
	//* 541 1232:ifle            1264
			timeStampToken = new TimeStampToken(new ContentInfo(ASN1Sequence.getInstance(((Object) (((Attribute) (abyte0)).getAttrValues().getObjectAt(0))))));
	//  542 1235:aload_0         
	//  543 1236:new             #454 <Class TimeStampToken>
	//  544 1239:dup             
	//  545 1240:new             #456 <Class ContentInfo>
	//  546 1243:dup             
	//  547 1244:aload_1         
	//  548 1245:invokevirtual   #452 <Method ASN1Set Attribute.getAttrValues()>
	//  549 1248:iconst_0        
	//  550 1249:invokevirtual   #275 <Method ASN1Encodable ASN1Set.getObjectAt(int)>
	//  551 1252:invokestatic    #459 <Method ASN1Sequence ASN1Sequence.getInstance(Object)>
	//  552 1255:invokespecial   #461 <Method void ContentInfo(ASN1Sequence)>
	//  553 1258:invokespecial   #464 <Method void TimeStampToken(ContentInfo)>
	//  554 1261:putfield        #466 <Field TimeStampToken timeStampToken>
		if(isTsp)
	//* 555 1264:aload_0         
	//* 556 1265:getfield        #173 <Field boolean isTsp>
	//* 557 1268:ifeq            1312
		{
			timeStampToken = new TimeStampToken(new ContentInfo(((ASN1Sequence) (pdfname))));
	//  558 1271:aload_0         
	//  559 1272:new             #454 <Class TimeStampToken>
	//  560 1275:dup             
	//  561 1276:new             #456 <Class ContentInfo>
	//  562 1279:dup             
	//  563 1280:aload_2         
	//  564 1281:invokespecial   #461 <Method void ContentInfo(ASN1Sequence)>
	//  565 1284:invokespecial   #464 <Method void TimeStampToken(ContentInfo)>
	//  566 1287:putfield        #466 <Field TimeStampToken timeStampToken>
			messageDigest = DigestAlgorithms.getMessageDigestFromOid(timeStampToken.getTimeStampInfo().getMessageImprintAlgOID().getId(), ((String) (null)));
	//  567 1290:aload_0         
	//  568 1291:aload_0         
	//  569 1292:getfield        #466 <Field TimeStampToken timeStampToken>
	//  570 1295:invokevirtual   #470 <Method TimeStampTokenInfo TimeStampToken.getTimeStampInfo()>
	//  571 1298:invokevirtual   #475 <Method ASN1ObjectIdentifier TimeStampTokenInfo.getMessageImprintAlgOID()>
	//  572 1301:invokevirtual   #215 <Method String ASN1ObjectIdentifier.getId()>
	//  573 1304:aconst_null     
	//  574 1305:invokestatic    #478 <Method MessageDigest DigestAlgorithms.getMessageDigestFromOid(String, String)>
	//  575 1308:putfield        #144 <Field MessageDigest messageDigest>
			return;
	//  576 1311:return          
		}
		if(RSAdata == null && digestAttr == null) goto _L19; else goto _L18
	//  577 1312:aload_0         
	//  578 1313:getfield        #135 <Field byte[] RSAdata>
	//  579 1316:ifnonnull       1326
	//  580 1319:aload_0         
	//  581 1320:getfield        #352 <Field byte[] digestAttr>
	//  582 1323:ifnull          1362
_L18:
		if(!PdfName.ADBE_PKCS7_SHA1.equals(((Object) (getFilterSubtype()))))
			break MISSING_BLOCK_LABEL_1378;
	//  583 1326:getstatic       #481 <Field PdfName PdfName.ADBE_PKCS7_SHA1>
	//  584 1329:aload_0         
	//  585 1330:invokevirtual   #485 <Method PdfName getFilterSubtype()>
	//  586 1333:invokevirtual   #171 <Method boolean PdfName.equals(Object)>
	//  587 1336:ifeq            1378
		messageDigest = DigestAlgorithms.getMessageDigest("SHA1", s);
	//  588 1339:aload_0         
	//  589 1340:ldc2            #487 <String "SHA1">
	//  590 1343:aload_3         
	//  591 1344:invokestatic    #142 <Method MessageDigest DigestAlgorithms.getMessageDigest(String, String)>
	//  592 1347:putfield        #144 <Field MessageDigest messageDigest>
_L20:
		encContDigest = DigestAlgorithms.getMessageDigest(getHashAlgorithm(), s);
	//  593 1350:aload_0         
	//  594 1351:aload_0         
	//  595 1352:invokevirtual   #138 <Method String getHashAlgorithm()>
	//  596 1355:aload_3         
	//  597 1356:invokestatic    #142 <Method MessageDigest DigestAlgorithms.getMessageDigest(String, String)>
	//  598 1359:putfield        #489 <Field MessageDigest encContDigest>
_L19:
		sig = initSignature(signCert.getPublicKey());
	//  599 1362:aload_0         
	//  600 1363:aload_0         
	//  601 1364:aload_0         
	//  602 1365:getfield        #97  <Field X509Certificate signCert>
	//  603 1368:invokevirtual   #493 <Method PublicKey X509Certificate.getPublicKey()>
	//  604 1371:invokespecial   #496 <Method Signature initSignature(PublicKey)>
	//  605 1374:putfield        #150 <Field Signature sig>
		return;
	//  606 1377:return          
		messageDigest = DigestAlgorithms.getMessageDigest(getHashAlgorithm(), s);
	//  607 1378:aload_0         
	//  608 1379:aload_0         
	//  609 1380:invokevirtual   #138 <Method String getHashAlgorithm()>
	//  610 1383:aload_3         
	//  611 1384:invokestatic    #142 <Method MessageDigest DigestAlgorithms.getMessageDigest(String, String)>
	//  612 1387:putfield        #144 <Field MessageDigest messageDigest>
		if(true) goto _L20; else goto _L2
	//  613 1390:goto            1350
_L2:
		j = 3;
	//  614 1393:iconst_3        
	//  615 1394:istore          5
		i = k;
	//  616 1396:iload           6
	//  617 1398:istore          4
		  goto _L21
		Object obj2;
		byte abyte1[];
		try
		{
			ASN1Sequence asn1sequence = (ASN1Sequence)((ASN1Sequence) (obj)).getObjectAt(2);
			if(asn1sequence.size() > 1)
				RSAdata = ((ASN1OctetString)((ASN1TaggedObject)asn1sequence.getObjectAt(1)).getObject()).getOctets();
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
		}
	//* 618 1400:goto            1099
		i = 3;
	//  619 1403:iconst_3        
	//  620 1404:istore          4
		  goto _L22
	//* 621 1406:goto            312
_L7:
		k++;
	//  622 1409:iload           6
	//  623 1411:iconst_1        
	//  624 1412:iadd            
	//  625 1413:istore          6
		i = j;
	//  626 1415:iload           5
	//  627 1417:istore          4
		  goto _L23
	//* 628 1419:goto            686
_L11:
		l++;
	//  629 1422:iload           7
	//  630 1424:iconst_1        
	//  631 1425:iadd            
	//  632 1426:istore          7
		  goto _L24
	//* 633 1428:goto            795
_L14:
		j = 1;
	//  634 1431:iconst_1        
	//  635 1432:istore          5
		  goto _L7
	//* 636 1434:goto            1409
_L17:
		j = 1;
	//  637 1437:iconst_1        
	//  638 1438:istore          5
		  goto _L7
	//* 639 1440:goto            1409
		j = 3 + 1;
	//  640 1443:iconst_3        
	//  641 1444:iconst_1        
	//  642 1445:iadd            
	//  643 1446:istore          5
		  goto _L21
	//* 644 1448:goto            1099
	}

	public PdfPKCS7(byte abyte0[], byte abyte1[], String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void Object()>
		version = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #68  <Field int version>
		signerversion = 1;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #70  <Field int signerversion>
		try
		{
			provider = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #72  <Field String provider>
			X509CertParser x509certparser = new X509CertParser();
	//   11   19:new             #263 <Class X509CertParser>
	//   12   22:dup             
	//   13   23:invokespecial   #264 <Method void X509CertParser()>
	//   14   26:astore          4
			x509certparser.engineInit(((java.io.InputStream) (new ByteArrayInputStream(abyte1))));
	//   15   28:aload           4
	//   16   30:new             #182 <Class ByteArrayInputStream>
	//   17   33:dup             
	//   18   34:aload_2         
	//   19   35:invokespecial   #185 <Method void ByteArrayInputStream(byte[])>
	//   20   38:invokevirtual   #267 <Method void X509CertParser.engineInit(java.io.InputStream)>
			certs = x509certparser.engineReadAll();
	//   21   41:aload_0         
	//   22   42:aload           4
	//   23   44:invokevirtual   #271 <Method Collection X509CertParser.engineReadAll()>
	//   24   47:putfield        #102 <Field Collection certs>
			signCerts = certs;
	//   25   50:aload_0         
	//   26   51:aload_0         
	//   27   52:getfield        #102 <Field Collection certs>
	//   28   55:putfield        #499 <Field Collection signCerts>
			signCert = (X509Certificate)certs.iterator().next();
	//   29   58:aload_0         
	//   30   59:aload_0         
	//   31   60:getfield        #102 <Field Collection certs>
	//   32   63:invokeinterface #292 <Method Iterator Collection.iterator()>
	//   33   68:invokeinterface #300 <Method Object Iterator.next()>
	//   34   73:checkcast       #95  <Class X509Certificate>
	//   35   76:putfield        #97  <Field X509Certificate signCert>
			crls = ((Collection) (new ArrayList()));
	//   36   79:aload_0         
	//   37   80:new             #99  <Class ArrayList>
	//   38   83:dup             
	//   39   84:invokespecial   #100 <Method void ArrayList()>
	//   40   87:putfield        #501 <Field Collection crls>
			digest = ((ASN1OctetString)(new ASN1InputStream(((java.io.InputStream) (new ByteArrayInputStream(abyte0))))).readObject()).getOctets();
	//   41   90:aload_0         
	//   42   91:new             #180 <Class ASN1InputStream>
	//   43   94:dup             
	//   44   95:new             #182 <Class ByteArrayInputStream>
	//   45   98:dup             
	//   46   99:aload_1         
	//   47  100:invokespecial   #185 <Method void ByteArrayInputStream(byte[])>
	//   48  103:invokespecial   #188 <Method void ASN1InputStream(java.io.InputStream)>
	//   49  106:invokevirtual   #192 <Method ASN1Primitive ASN1InputStream.readObject()>
	//   50  109:checkcast       #257 <Class ASN1OctetString>
	//   51  112:invokevirtual   #261 <Method byte[] ASN1OctetString.getOctets()>
	//   52  115:putfield        #431 <Field byte[] digest>
		}
	//*  53  118:aload_3         
	//*  54  119:ifnonnull       161
	//*  55  122:aload_0         
	//*  56  123:ldc2            #503 <String "SHA1withRSA">
	//*  57  126:invokestatic    #508 <Method Signature Signature.getInstance(String)>
	//*  58  129:putfield        #150 <Field Signature sig>
	//*  59  132:aload_0         
	//*  60  133:getfield        #150 <Field Signature sig>
	//*  61  136:aload_0         
	//*  62  137:getfield        #97  <Field X509Certificate signCert>
	//*  63  140:invokevirtual   #493 <Method PublicKey X509Certificate.getPublicKey()>
	//*  64  143:invokevirtual   #512 <Method void Signature.initVerify(PublicKey)>
	//*  65  146:aload_0         
	//*  66  147:ldc2            #514 <String "1.2.840.10040.4.3">
	//*  67  150:putfield        #82  <Field String digestAlgorithmOid>
	//*  68  153:aload_0         
	//*  69  154:ldc2            #516 <String "1.3.36.3.3.1.2">
	//*  70  157:putfield        #124 <Field String digestEncryptionAlgorithmOid>
	//*  71  160:return          
	//*  72  161:aload_0         
	//*  73  162:ldc2            #503 <String "SHA1withRSA">
	//*  74  165:aload_3         
	//*  75  166:invokestatic    #519 <Method Signature Signature.getInstance(String, String)>
	//*  76  169:putfield        #150 <Field Signature sig>
	//*  77  172:goto            132
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  78  175:astore_1        
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
	//   79  176:new             #201 <Class ExceptionConverter>
	//   80  179:dup             
	//   81  180:aload_1         
	//   82  181:invokespecial   #204 <Method void ExceptionConverter(Exception)>
	//   83  184:athrow          
		}
		if(s != null)
			break MISSING_BLOCK_LABEL_161;
		sig = Signature.getInstance("SHA1withRSA");
_L2:
		sig.initVerify(signCert.getPublicKey());
		digestAlgorithmOid = "1.2.840.10040.4.3";
		digestEncryptionAlgorithmOid = "1.3.36.3.3.1.2";
		return;
		sig = Signature.getInstance("SHA1withRSA", s);
		if(true) goto _L2; else goto _L1
_L1:
	}

	private ASN1EncodableVector buildUnauthenticatedAttributes(byte abyte0[])
		throws IOException
	{
		if(abyte0 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
		{
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			abyte0 = ((byte []) (new ASN1InputStream(((java.io.InputStream) (new ByteArrayInputStream(abyte0))))));
	//    4    6:new             #180 <Class ASN1InputStream>
	//    5    9:dup             
	//    6   10:new             #182 <Class ByteArrayInputStream>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #185 <Method void ByteArrayInputStream(byte[])>
	//   10   18:invokespecial   #188 <Method void ASN1InputStream(java.io.InputStream)>
	//   11   21:astore_1        
			ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
	//   12   22:new             #523 <Class ASN1EncodableVector>
	//   13   25:dup             
	//   14   26:invokespecial   #524 <Method void ASN1EncodableVector()>
	//   15   29:astore_2        
			ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
	//   16   30:new             #523 <Class ASN1EncodableVector>
	//   17   33:dup             
	//   18   34:invokespecial   #524 <Method void ASN1EncodableVector()>
	//   19   37:astore_3        
			asn1encodablevector1.add(((ASN1Encodable) (new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.2.14"))));
	//   20   38:aload_3         
	//   21   39:new             #212 <Class ASN1ObjectIdentifier>
	//   22   42:dup             
	//   23   43:ldc2            #526 <String "1.2.840.113549.1.9.16.2.14">
	//   24   46:invokespecial   #527 <Method void ASN1ObjectIdentifier(String)>
	//   25   49:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
			asn1encodablevector1.add(((ASN1Encodable) (new DERSet(((ASN1Encodable) ((ASN1Sequence)((ASN1InputStream) (abyte0)).readObject()))))));
	//   26   52:aload_3         
	//   27   53:new             #532 <Class DERSet>
	//   28   56:dup             
	//   29   57:aload_1         
	//   30   58:invokevirtual   #192 <Method ASN1Primitive ASN1InputStream.readObject()>
	//   31   61:checkcast       #194 <Class ASN1Sequence>
	//   32   64:invokespecial   #534 <Method void DERSet(ASN1Encodable)>
	//   33   67:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
			asn1encodablevector.add(((ASN1Encodable) (new DERSequence(asn1encodablevector1))));
	//   34   70:aload_2         
	//   35   71:new             #536 <Class DERSequence>
	//   36   74:dup             
	//   37   75:aload_3         
	//   38   76:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//   39   79:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
			return asn1encodablevector;
	//   40   82:aload_2         
	//   41   83:areturn         
		}
	}

	private void findCRL(ASN1Sequence asn1sequence)
	{
		int i;
		Object obj;
		try
		{
			crls = ((Collection) (new ArrayList()));
	//    0    0:aload_0         
	//    1    1:new             #99  <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #100 <Method void ArrayList()>
	//    4    8:putfield        #501 <Field Collection crls>
		}
	//*   5   11:iconst_0        
	//*   6   12:istore_2        
	//*   7   13:iload_2         
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #255 <Method int ASN1Sequence.size()>
	//*  10   18:icmpge          78
	//*  11   21:new             #182 <Class ByteArrayInputStream>
	//*  12   24:dup             
	//*  13   25:aload_1         
	//*  14   26:iload_2         
	//*  15   27:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//*  16   30:invokeinterface #282 <Method ASN1Primitive ASN1Encodable.toASN1Primitive()>
	//*  17   35:ldc2            #343 <String "DER">
	//*  18   38:invokevirtual   #540 <Method byte[] ASN1Primitive.getEncoded(String)>
	//*  19   41:invokespecial   #185 <Method void ByteArrayInputStream(byte[])>
	//*  20   44:astore_3        
	//*  21   45:ldc2            #542 <String "X.509">
	//*  22   48:invokestatic    #547 <Method CertificateFactory CertificateFactory.getInstance(String)>
	//*  23   51:aload_3         
	//*  24   52:invokevirtual   #551 <Method java.security.cert.CRL CertificateFactory.generateCRL(java.io.InputStream)>
	//*  25   55:checkcast       #553 <Class X509CRL>
	//*  26   58:astore_3        
	//*  27   59:aload_0         
	//*  28   60:getfield        #501 <Field Collection crls>
	//*  29   63:aload_3         
	//*  30   64:invokeinterface #108 <Method boolean Collection.add(Object)>
	//*  31   69:pop             
	//*  32   70:iload_2         
	//*  33   71:iconst_1        
	//*  34   72:iadd            
	//*  35   73:istore_2        
	//*  36   74:goto            13
		// Misplaced declaration of an exception variable
		catch(ASN1Sequence asn1sequence)
		{
			break; /* Loop/switch isn't completed */
		}
	//   37   77:astore_1        
	//   38   78:return          
		i = 0;
_L2:
		if(i >= asn1sequence.size())
			break; /* Loop/switch isn't completed */
		obj = ((Object) (new ByteArrayInputStream(asn1sequence.getObjectAt(i).toASN1Primitive().getEncoded("DER"))));
		obj = ((Object) ((X509CRL)CertificateFactory.getInstance("X.509").generateCRL(((java.io.InputStream) (obj)))));
		crls.add(obj);
		i++;
		continue; /* Loop/switch isn't completed */
		if(true) goto _L2; else goto _L1
_L1:
	}

	private void findOcsp(ASN1Sequence asn1sequence)
		throws IOException
	{
		ASN1Sequence asn1sequence1;
		basicResp = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #555 <Field BasicOCSPResp basicResp>
		asn1sequence1 = asn1sequence;
	//    3    5:aload_1         
	//    4    6:astore          5
_L7:
		if(!(asn1sequence1.getObjectAt(0) instanceof ASN1ObjectIdentifier) || !((ASN1ObjectIdentifier)asn1sequence1.getObjectAt(0)).getId().equals(((Object) (OCSPObjectIdentifiers.id_pkix_ocsp_basic.getId())))) goto _L2; else goto _L1
	//    5    8:aload           5
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//    8   14:instanceof      #212 <Class ASN1ObjectIdentifier>
	//    9   17:ifeq            81
	//   10   20:aload           5
	//   11   22:iconst_0        
	//   12   23:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//   13   26:checkcast       #212 <Class ASN1ObjectIdentifier>
	//   14   29:invokevirtual   #215 <Method String ASN1ObjectIdentifier.getId()>
	//   15   32:getstatic       #560 <Field ASN1ObjectIdentifier OCSPObjectIdentifiers.id_pkix_ocsp_basic>
	//   16   35:invokevirtual   #215 <Method String ASN1ObjectIdentifier.getId()>
	//   17   38:invokevirtual   #131 <Method boolean String.equals(Object)>
	//   18   41:ifeq            81
_L1:
		basicResp = new BasicOCSPResp(BasicOCSPResponse.getInstance(((Object) ((new ASN1InputStream(((ASN1OctetString)asn1sequence1.getObjectAt(1)).getOctets())).readObject()))));
	//   19   44:aload_0         
	//   20   45:new             #562 <Class BasicOCSPResp>
	//   21   48:dup             
	//   22   49:new             #180 <Class ASN1InputStream>
	//   23   52:dup             
	//   24   53:aload           5
	//   25   55:iconst_1        
	//   26   56:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//   27   59:checkcast       #257 <Class ASN1OctetString>
	//   28   62:invokevirtual   #261 <Method byte[] ASN1OctetString.getOctets()>
	//   29   65:invokespecial   #563 <Method void ASN1InputStream(byte[])>
	//   30   68:invokevirtual   #192 <Method ASN1Primitive ASN1InputStream.readObject()>
	//   31   71:invokestatic    #568 <Method BasicOCSPResponse BasicOCSPResponse.getInstance(Object)>
	//   32   74:invokespecial   #571 <Method void BasicOCSPResp(BasicOCSPResponse)>
	//   33   77:putfield        #555 <Field BasicOCSPResp basicResp>
_L9:
		return;
	//   34   80:return          
_L2:
		int i;
		boolean flag1;
		flag1 = true;
	//   35   81:iconst_1        
	//   36   82:istore          4
		i = 0;
	//   37   84:iconst_0        
	//   38   85:istore_3        
_L10:
		boolean flag;
		flag = flag1;
	//   39   86:iload           4
	//   40   88:istore_2        
		asn1sequence = asn1sequence1;
	//   41   89:aload           5
	//   42   91:astore_1        
		if(i >= asn1sequence1.size()) goto _L4; else goto _L3
	//   43   92:iload_3         
	//   44   93:aload           5
	//   45   95:invokevirtual   #255 <Method int ASN1Sequence.size()>
	//   46   98:icmpge          125
_L3:
		if(!(asn1sequence1.getObjectAt(i) instanceof ASN1Sequence)) goto _L6; else goto _L5
	//   47  101:aload           5
	//   48  103:iload_3         
	//   49  104:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//   50  107:instanceof      #194 <Class ASN1Sequence>
	//   51  110:ifeq            133
_L5:
		asn1sequence = (ASN1Sequence)asn1sequence1.getObjectAt(0);
	//   52  113:aload           5
	//   53  115:iconst_0        
	//   54  116:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//   55  119:checkcast       #194 <Class ASN1Sequence>
	//   56  122:astore_1        
		flag = false;
	//   57  123:iconst_0        
	//   58  124:istore_2        
_L4:
		asn1sequence1 = asn1sequence;
	//   59  125:aload_1         
	//   60  126:astore          5
		if(flag)
	//*  61  128:iload_2         
	//*  62  129:ifeq            8
			return;
	//   63  132:return          
		  goto _L7
_L6:
		if(!(asn1sequence1.getObjectAt(i) instanceof ASN1TaggedObject))
			break MISSING_BLOCK_LABEL_178;
	//   64  133:aload           5
	//   65  135:iload_3         
	//   66  136:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//   67  139:instanceof      #221 <Class ASN1TaggedObject>
	//   68  142:ifeq            178
		asn1sequence = ((ASN1Sequence) ((ASN1TaggedObject)asn1sequence1.getObjectAt(i)));
	//   69  145:aload           5
	//   70  147:iload_3         
	//   71  148:invokevirtual   #210 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//   72  151:checkcast       #221 <Class ASN1TaggedObject>
	//   73  154:astore_1        
		if(!(((ASN1TaggedObject) (asn1sequence)).getObject() instanceof ASN1Sequence)) goto _L9; else goto _L8
	//   74  155:aload_1         
	//   75  156:invokevirtual   #224 <Method ASN1Primitive ASN1TaggedObject.getObject()>
	//   76  159:instanceof      #194 <Class ASN1Sequence>
	//   77  162:ifeq            80
_L8:
		asn1sequence = (ASN1Sequence)((ASN1TaggedObject) (asn1sequence)).getObject();
	//   78  165:aload_1         
	//   79  166:invokevirtual   #224 <Method ASN1Primitive ASN1TaggedObject.getObject()>
	//   80  169:checkcast       #194 <Class ASN1Sequence>
	//   81  172:astore_1        
		flag = false;
	//   82  173:iconst_0        
	//   83  174:istore_2        
		  goto _L4
	//*  84  175:goto            125
		i++;
	//   85  178:iload_3         
	//   86  179:iconst_1        
	//   87  180:iadd            
	//   88  181:istore_3        
		  goto _L10
	//*  89  182:goto            86
	}

	private DERSet getAuthenticatedAttributeSet(byte abyte0[], byte abyte1[], Collection collection, MakeSignature.CryptoStandard cryptostandard)
	{
		boolean flag;
		ASN1EncodableVector asn1encodablevector;
		ASN1EncodableVector asn1encodablevector2;
		ASN1EncodableVector asn1encodablevector3;
		boolean flag1;
		byte abyte2[];
		try
		{
			asn1encodablevector = new ASN1EncodableVector();
	//    0    0:new             #523 <Class ASN1EncodableVector>
	//    1    3:dup             
	//    2    4:invokespecial   #524 <Method void ASN1EncodableVector()>
	//    3    7:astore          7
			ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
	//    4    9:new             #523 <Class ASN1EncodableVector>
	//    5   12:dup             
	//    6   13:invokespecial   #524 <Method void ASN1EncodableVector()>
	//    7   16:astore          8
			asn1encodablevector1.add(((ASN1Encodable) (new ASN1ObjectIdentifier("1.2.840.113549.1.9.3"))));
	//    8   18:aload           8
	//    9   20:new             #212 <Class ASN1ObjectIdentifier>
	//   10   23:dup             
	//   11   24:ldc2            #575 <String "1.2.840.113549.1.9.3">
	//   12   27:invokespecial   #527 <Method void ASN1ObjectIdentifier(String)>
	//   13   30:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
			asn1encodablevector1.add(((ASN1Encodable) (new DERSet(((ASN1Encodable) (new ASN1ObjectIdentifier("1.2.840.113549.1.7.1")))))));
	//   14   33:aload           8
	//   15   35:new             #532 <Class DERSet>
	//   16   38:dup             
	//   17   39:new             #212 <Class ASN1ObjectIdentifier>
	//   18   42:dup             
	//   19   43:ldc2            #577 <String "1.2.840.113549.1.7.1">
	//   20   46:invokespecial   #527 <Method void ASN1ObjectIdentifier(String)>
	//   21   49:invokespecial   #534 <Method void DERSet(ASN1Encodable)>
	//   22   52:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
			asn1encodablevector.add(((ASN1Encodable) (new DERSequence(asn1encodablevector1))));
	//   23   55:aload           7
	//   24   57:new             #536 <Class DERSequence>
	//   25   60:dup             
	//   26   61:aload           8
	//   27   63:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//   28   66:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
			asn1encodablevector1 = new ASN1EncodableVector();
	//   29   69:new             #523 <Class ASN1EncodableVector>
	//   30   72:dup             
	//   31   73:invokespecial   #524 <Method void ASN1EncodableVector()>
	//   32   76:astore          8
			asn1encodablevector1.add(((ASN1Encodable) (new ASN1ObjectIdentifier("1.2.840.113549.1.9.4"))));
	//   33   78:aload           8
	//   34   80:new             #212 <Class ASN1ObjectIdentifier>
	//   35   83:dup             
	//   36   84:ldc2            #350 <String "1.2.840.113549.1.9.4">
	//   37   87:invokespecial   #527 <Method void ASN1ObjectIdentifier(String)>
	//   38   90:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
			asn1encodablevector1.add(((ASN1Encodable) (new DERSet(((ASN1Encodable) (new DEROctetString(abyte0)))))));
	//   39   93:aload           8
	//   40   95:new             #532 <Class DERSet>
	//   41   98:dup             
	//   42   99:new             #579 <Class DEROctetString>
	//   43  102:dup             
	//   44  103:aload_1         
	//   45  104:invokespecial   #580 <Method void DEROctetString(byte[])>
	//   46  107:invokespecial   #534 <Method void DERSet(ASN1Encodable)>
	//   47  110:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
			asn1encodablevector.add(((ASN1Encodable) (new DERSequence(asn1encodablevector1))));
	//   48  113:aload           7
	//   49  115:new             #536 <Class DERSequence>
	//   50  118:dup             
	//   51  119:aload           8
	//   52  121:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//   53  124:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		}
	//*  54  127:iconst_0        
	//*  55  128:istore          6
	//*  56  130:iload           6
	//*  57  132:istore          5
	//*  58  134:aload_3         
	//*  59  135:ifnull          673
	//*  60  138:aload_3         
	//*  61  139:invokeinterface #292 <Method Iterator Collection.iterator()>
	//*  62  144:astore_1        
	//*  63  145:iload           6
	//*  64  147:istore          5
	//*  65  149:aload_1         
	//*  66  150:invokeinterface #297 <Method boolean Iterator.hasNext()>
	//*  67  155:ifeq            673
	//*  68  158:aload_1         
	//*  69  159:invokeinterface #300 <Method Object Iterator.next()>
	//*  70  164:checkcast       #581 <Class byte[]>
	//*  71  167:ifnull          145
	//*  72  170:iconst_1        
	//*  73  171:istore          5
	//*  74  173:goto            673
	//*  75  176:new             #523 <Class ASN1EncodableVector>
	//*  76  179:dup             
	//*  77  180:invokespecial   #524 <Method void ASN1EncodableVector()>
	//*  78  183:astore_1        
	//*  79  184:aload_1         
	//*  80  185:new             #212 <Class ASN1ObjectIdentifier>
	//*  81  188:dup             
	//*  82  189:ldc2            #354 <String "1.2.840.113583.1.1.8">
	//*  83  192:invokespecial   #527 <Method void ASN1ObjectIdentifier(String)>
	//*  84  195:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
	//*  85  198:new             #523 <Class ASN1EncodableVector>
	//*  86  201:dup             
	//*  87  202:invokespecial   #524 <Method void ASN1EncodableVector()>
	//*  88  205:astore          8
	//*  89  207:iload           5
	//*  90  209:ifeq            313
	//*  91  212:new             #523 <Class ASN1EncodableVector>
	//*  92  215:dup             
	//*  93  216:invokespecial   #524 <Method void ASN1EncodableVector()>
	//*  94  219:astore          9
	//*  95  221:aload_3         
	//*  96  222:invokeinterface #292 <Method Iterator Collection.iterator()>
	//*  97  227:astore_3        
	//*  98  228:aload_3         
	//*  99  229:invokeinterface #297 <Method boolean Iterator.hasNext()>
	//* 100  234:ifeq            290
	//* 101  237:aload_3         
	//* 102  238:invokeinterface #300 <Method Object Iterator.next()>
	//* 103  243:checkcast       #581 <Class byte[]>
	//* 104  246:astore          10
	//* 105  248:aload           10
	//* 106  250:ifnull          228
	//* 107  253:aload           9
	//* 108  255:new             #180 <Class ASN1InputStream>
	//* 109  258:dup             
	//* 110  259:new             #182 <Class ByteArrayInputStream>
	//* 111  262:dup             
	//* 112  263:aload           10
	//* 113  265:invokespecial   #185 <Method void ByteArrayInputStream(byte[])>
	//* 114  268:invokespecial   #188 <Method void ASN1InputStream(java.io.InputStream)>
	//* 115  271:invokevirtual   #192 <Method ASN1Primitive ASN1InputStream.readObject()>
	//* 116  274:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
	//* 117  277:goto            228
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 118  280:astore_1        
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
	//  119  281:new             #201 <Class ExceptionConverter>
	//  120  284:dup             
	//  121  285:aload_1         
	//  122  286:invokespecial   #204 <Method void ExceptionConverter(Exception)>
	//  123  289:athrow          
		}
		flag1 = false;
		flag = flag1;
		if(collection == null) goto _L2; else goto _L1
_L1:
		abyte0 = ((byte []) (collection.iterator()));
_L5:
		flag = flag1;
		if(!((Iterator) (abyte0)).hasNext()) goto _L2; else goto _L3
_L3:
		if((byte[])((Iterator) (abyte0)).next() == null) goto _L5; else goto _L4
_L4:
		flag = true;
		  goto _L2
_L7:
		abyte0 = ((byte []) (new ASN1EncodableVector()));
		((ASN1EncodableVector) (abyte0)).add(((ASN1Encodable) (new ASN1ObjectIdentifier("1.2.840.113583.1.1.8"))));
		asn1encodablevector2 = new ASN1EncodableVector();
		if(!flag)
			break MISSING_BLOCK_LABEL_313;
		asn1encodablevector3 = new ASN1EncodableVector();
		collection = ((Collection) (collection.iterator()));
_L6:
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break MISSING_BLOCK_LABEL_290;
			abyte2 = (byte[])((Iterator) (collection)).next();
		} while(abyte2 == null);
		asn1encodablevector3.add(((ASN1Encodable) ((new ASN1InputStream(((java.io.InputStream) (new ByteArrayInputStream(abyte2))))).readObject())));
		  goto _L6
		asn1encodablevector2.add(((ASN1Encodable) (new DERTaggedObject(true, 0, ((ASN1Encodable) (new DERSequence(asn1encodablevector3)))))));
	//  124  290:aload           8
	//  125  292:new             #583 <Class DERTaggedObject>
	//  126  295:dup             
	//  127  296:iconst_1        
	//  128  297:iconst_0        
	//  129  298:new             #536 <Class DERSequence>
	//  130  301:dup             
	//  131  302:aload           9
	//  132  304:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//  133  307:invokespecial   #586 <Method void DERTaggedObject(boolean, int, ASN1Encodable)>
	//  134  310:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		if(abyte1 == null)
			break MISSING_BLOCK_LABEL_439;
	//  135  313:aload_2         
	//  136  314:ifnull          439
		Object obj = ((Object) (new DEROctetString(abyte1)));
	//  137  317:new             #579 <Class DEROctetString>
	//  138  320:dup             
	//  139  321:aload_2         
	//  140  322:invokespecial   #580 <Method void DEROctetString(byte[])>
	//  141  325:astore          9
		abyte1 = ((byte []) (new ASN1EncodableVector()));
	//  142  327:new             #523 <Class ASN1EncodableVector>
	//  143  330:dup             
	//  144  331:invokespecial   #524 <Method void ASN1EncodableVector()>
	//  145  334:astore_2        
		collection = ((Collection) (new ASN1EncodableVector()));
	//  146  335:new             #523 <Class ASN1EncodableVector>
	//  147  338:dup             
	//  148  339:invokespecial   #524 <Method void ASN1EncodableVector()>
	//  149  342:astore_3        
		((ASN1EncodableVector) (collection)).add(((ASN1Encodable) (OCSPObjectIdentifiers.id_pkix_ocsp_basic)));
	//  150  343:aload_3         
	//  151  344:getstatic       #560 <Field ASN1ObjectIdentifier OCSPObjectIdentifiers.id_pkix_ocsp_basic>
	//  152  347:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		((ASN1EncodableVector) (collection)).add(((ASN1Encodable) (obj)));
	//  153  350:aload_3         
	//  154  351:aload           9
	//  155  353:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		obj = ((Object) (new ASN1Enumerated(0)));
	//  156  356:new             #588 <Class ASN1Enumerated>
	//  157  359:dup             
	//  158  360:iconst_0        
	//  159  361:invokespecial   #591 <Method void ASN1Enumerated(int)>
	//  160  364:astore          9
		ASN1EncodableVector asn1encodablevector4 = new ASN1EncodableVector();
	//  161  366:new             #523 <Class ASN1EncodableVector>
	//  162  369:dup             
	//  163  370:invokespecial   #524 <Method void ASN1EncodableVector()>
	//  164  373:astore          10
		asn1encodablevector4.add(((ASN1Encodable) (obj)));
	//  165  375:aload           10
	//  166  377:aload           9
	//  167  379:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		asn1encodablevector4.add(((ASN1Encodable) (new DERTaggedObject(true, 0, ((ASN1Encodable) (new DERSequence(((ASN1EncodableVector) (collection)))))))));
	//  168  382:aload           10
	//  169  384:new             #583 <Class DERTaggedObject>
	//  170  387:dup             
	//  171  388:iconst_1        
	//  172  389:iconst_0        
	//  173  390:new             #536 <Class DERSequence>
	//  174  393:dup             
	//  175  394:aload_3         
	//  176  395:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//  177  398:invokespecial   #586 <Method void DERTaggedObject(boolean, int, ASN1Encodable)>
	//  178  401:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		((ASN1EncodableVector) (abyte1)).add(((ASN1Encodable) (new DERSequence(asn1encodablevector4))));
	//  179  404:aload_2         
	//  180  405:new             #536 <Class DERSequence>
	//  181  408:dup             
	//  182  409:aload           10
	//  183  411:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//  184  414:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		asn1encodablevector2.add(((ASN1Encodable) (new DERTaggedObject(true, 1, ((ASN1Encodable) (new DERSequence(((ASN1EncodableVector) (abyte1)))))))));
	//  185  417:aload           8
	//  186  419:new             #583 <Class DERTaggedObject>
	//  187  422:dup             
	//  188  423:iconst_1        
	//  189  424:iconst_1        
	//  190  425:new             #536 <Class DERSequence>
	//  191  428:dup             
	//  192  429:aload_2         
	//  193  430:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//  194  433:invokespecial   #586 <Method void DERTaggedObject(boolean, int, ASN1Encodable)>
	//  195  436:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		((ASN1EncodableVector) (abyte0)).add(((ASN1Encodable) (new DERSet(((ASN1Encodable) (new DERSequence(asn1encodablevector2)))))));
	//  196  439:aload_1         
	//  197  440:new             #532 <Class DERSet>
	//  198  443:dup             
	//  199  444:new             #536 <Class DERSequence>
	//  200  447:dup             
	//  201  448:aload           8
	//  202  450:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//  203  453:invokespecial   #534 <Method void DERSet(ASN1Encodable)>
	//  204  456:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		asn1encodablevector.add(((ASN1Encodable) (new DERSequence(((ASN1EncodableVector) (abyte0))))));
	//  205  459:aload           7
	//  206  461:new             #536 <Class DERSequence>
	//  207  464:dup             
	//  208  465:aload_1         
	//  209  466:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//  210  469:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
_L8:
		if(cryptostandard == MakeSignature.CryptoStandard.CADES)
	//* 211  472:aload           4
	//* 212  474:getstatic       #597 <Field MakeSignature$CryptoStandard MakeSignature$CryptoStandard.CADES>
	//* 213  477:if_acmpne       628
		{
			abyte0 = ((byte []) (new ASN1EncodableVector()));
	//  214  480:new             #523 <Class ASN1EncodableVector>
	//  215  483:dup             
	//  216  484:invokespecial   #524 <Method void ASN1EncodableVector()>
	//  217  487:astore_1        
			((ASN1EncodableVector) (abyte0)).add(((ASN1Encodable) (new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.2.47"))));
	//  218  488:aload_1         
	//  219  489:new             #212 <Class ASN1ObjectIdentifier>
	//  220  492:dup             
	//  221  493:ldc2            #403 <String "1.2.840.113549.1.9.16.2.47">
	//  222  496:invokespecial   #527 <Method void ASN1ObjectIdentifier(String)>
	//  223  499:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
			abyte1 = ((byte []) (new ASN1EncodableVector()));
	//  224  502:new             #523 <Class ASN1EncodableVector>
	//  225  505:dup             
	//  226  506:invokespecial   #524 <Method void ASN1EncodableVector()>
	//  227  509:astore_2        
			if(!DigestAlgorithms.getAllowedDigests("SHA-256").equals(((Object) (digestAlgorithmOid))))
	//* 228  510:ldc2            #599 <String "SHA-256">
	//* 229  513:invokestatic    #80  <Method String DigestAlgorithms.getAllowedDigests(String)>
	//* 230  516:aload_0         
	//* 231  517:getfield        #82  <Field String digestAlgorithmOid>
	//* 232  520:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 233  523:ifne            548
				((ASN1EncodableVector) (abyte1)).add(((ASN1Encodable) (new AlgorithmIdentifier(new ASN1ObjectIdentifier(digestAlgorithmOid)))));
	//  234  526:aload_2         
	//  235  527:new             #418 <Class AlgorithmIdentifier>
	//  236  530:dup             
	//  237  531:new             #212 <Class ASN1ObjectIdentifier>
	//  238  534:dup             
	//  239  535:aload_0         
	//  240  536:getfield        #82  <Field String digestAlgorithmOid>
	//  241  539:invokespecial   #527 <Method void ASN1ObjectIdentifier(String)>
	//  242  542:invokespecial   #602 <Method void AlgorithmIdentifier(ASN1ObjectIdentifier)>
	//  243  545:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
			((ASN1EncodableVector) (abyte1)).add(((ASN1Encodable) (new DEROctetString(interfaceDigest.getMessageDigest(getHashAlgorithm()).digest(signCert.getEncoded())))));
	//  244  548:aload_2         
	//  245  549:new             #579 <Class DEROctetString>
	//  246  552:dup             
	//  247  553:aload_0         
	//  248  554:getfield        #74  <Field ExternalDigest interfaceDigest>
	//  249  557:aload_0         
	//  250  558:invokevirtual   #138 <Method String getHashAlgorithm()>
	//  251  561:invokeinterface #605 <Method MessageDigest ExternalDigest.getMessageDigest(String)>
	//  252  566:aload_0         
	//  253  567:getfield        #97  <Field X509Certificate signCert>
	//  254  570:invokevirtual   #376 <Method byte[] X509Certificate.getEncoded()>
	//  255  573:invokevirtual   #389 <Method byte[] MessageDigest.digest(byte[])>
	//  256  576:invokespecial   #580 <Method void DEROctetString(byte[])>
	//  257  579:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
			((ASN1EncodableVector) (abyte0)).add(((ASN1Encodable) (new DERSet(((ASN1Encodable) (new DERSequence(((ASN1Encodable) (new DERSequence(((ASN1Encodable) (new DERSequence(((ASN1EncodableVector) (abyte1)))))))))))))));
	//  258  582:aload_1         
	//  259  583:new             #532 <Class DERSet>
	//  260  586:dup             
	//  261  587:new             #536 <Class DERSequence>
	//  262  590:dup             
	//  263  591:new             #536 <Class DERSequence>
	//  264  594:dup             
	//  265  595:new             #536 <Class DERSequence>
	//  266  598:dup             
	//  267  599:aload_2         
	//  268  600:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//  269  603:invokespecial   #606 <Method void DERSequence(ASN1Encodable)>
	//  270  606:invokespecial   #606 <Method void DERSequence(ASN1Encodable)>
	//  271  609:invokespecial   #534 <Method void DERSet(ASN1Encodable)>
	//  272  612:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
			asn1encodablevector.add(((ASN1Encodable) (new DERSequence(((ASN1EncodableVector) (abyte0))))));
	//  273  615:aload           7
	//  274  617:new             #536 <Class DERSequence>
	//  275  620:dup             
	//  276  621:aload_1         
	//  277  622:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//  278  625:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		}
		if(signaturePolicyIdentifier != null)
	//* 279  628:aload_0         
	//* 280  629:getfield        #608 <Field SignaturePolicyIdentifier signaturePolicyIdentifier>
	//* 281  632:ifnull          661
			asn1encodablevector.add(((ASN1Encodable) (new Attribute(PKCSObjectIdentifiers.id_aa_ets_sigPolicyId, ((ASN1Set) (new DERSet(((ASN1Encodable) (signaturePolicyIdentifier)))))))));
	//  282  635:aload           7
	//  283  637:new             #448 <Class Attribute>
	//  284  640:dup             
	//  285  641:getstatic       #611 <Field ASN1ObjectIdentifier PKCSObjectIdentifiers.id_aa_ets_sigPolicyId>
	//  286  644:new             #532 <Class DERSet>
	//  287  647:dup             
	//  288  648:aload_0         
	//  289  649:getfield        #608 <Field SignaturePolicyIdentifier signaturePolicyIdentifier>
	//  290  652:invokespecial   #534 <Method void DERSet(ASN1Encodable)>
	//  291  655:invokespecial   #614 <Method void Attribute(ASN1ObjectIdentifier, ASN1Set)>
	//  292  658:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		abyte0 = ((byte []) (new DERSet(asn1encodablevector)));
	//  293  661:new             #532 <Class DERSet>
	//  294  664:dup             
	//  295  665:aload           7
	//  296  667:invokespecial   #615 <Method void DERSet(ASN1EncodableVector)>
	//  297  670:astore_1        
		return ((DERSet) (abyte0));
	//  298  671:aload_1         
	//  299  672:areturn         
_L2:
		if(abyte1 == null && !flag) goto _L8; else goto _L7
	//  300  673:aload_2         
	//  301  674:ifnonnull       176
	//  302  677:iload           5
	//  303  679:ifeq            472
	//* 304  682:goto            176
	}

	private Signature initSignature(PrivateKey privatekey)
		throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException
	{
		Signature signature;
		if(provider == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field String provider>
	//*   2    4:ifnonnull       22
			signature = Signature.getInstance(getDigestAlgorithm());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #620 <Method String getDigestAlgorithm()>
	//    5   11:invokestatic    #508 <Method Signature Signature.getInstance(String)>
	//    6   14:astore_2        
		else
	//*   7   15:aload_2         
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #624 <Method void Signature.initSign(PrivateKey)>
	//*  10   20:aload_2         
	//*  11   21:areturn         
			signature = Signature.getInstance(getDigestAlgorithm(), provider);
	//   12   22:aload_0         
	//   13   23:invokevirtual   #620 <Method String getDigestAlgorithm()>
	//   14   26:aload_0         
	//   15   27:getfield        #72  <Field String provider>
	//   16   30:invokestatic    #519 <Method Signature Signature.getInstance(String, String)>
	//   17   33:astore_2        
		signature.initSign(privatekey);
		return signature;
	//*  18   34:goto            15
	}

	private Signature initSignature(PublicKey publickey)
		throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException
	{
		Object obj = ((Object) (getDigestAlgorithm()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #620 <Method String getDigestAlgorithm()>
	//    2    4:astore_2        
		if(PdfName.ADBE_X509_RSA_SHA1.equals(((Object) (getFilterSubtype()))))
	//*   3    5:getstatic       #627 <Field PdfName PdfName.ADBE_X509_RSA_SHA1>
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #485 <Method PdfName getFilterSubtype()>
	//*   6   12:invokevirtual   #171 <Method boolean PdfName.equals(Object)>
	//*   7   15:ifeq            22
			obj = "SHA1withRSA";
	//    8   18:ldc2            #503 <String "SHA1withRSA">
	//    9   21:astore_2        
		if(provider == null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #72  <Field String provider>
	//*  12   26:ifnonnull       41
			obj = ((Object) (Signature.getInstance(((String) (obj)))));
	//   13   29:aload_2         
	//   14   30:invokestatic    #508 <Method Signature Signature.getInstance(String)>
	//   15   33:astore_2        
		else
	//*  16   34:aload_2         
	//*  17   35:aload_1         
	//*  18   36:invokevirtual   #512 <Method void Signature.initVerify(PublicKey)>
	//*  19   39:aload_2         
	//*  20   40:areturn         
			obj = ((Object) (Signature.getInstance(((String) (obj)), provider)));
	//   21   41:aload_2         
	//   22   42:aload_0         
	//   23   43:getfield        #72  <Field String provider>
	//   24   46:invokestatic    #519 <Method Signature Signature.getInstance(String, String)>
	//   25   49:astore_2        
		((Signature) (obj)).initVerify(publickey);
		return ((Signature) (obj));
	//*  26   50:goto            34
	}

	private void signCertificateChain()
	{
		boolean flag1;
		ArrayList arraylist;
		ArrayList arraylist1;
		arraylist = new ArrayList();
	//    0    0:new             #99  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void ArrayList()>
	//    3    7:astore          5
		arraylist.add(((Object) (signCert)));
	//    4    9:aload           5
	//    5   11:aload_0         
	//    6   12:getfield        #97  <Field X509Certificate signCert>
	//    7   15:invokevirtual   #628 <Method boolean ArrayList.add(Object)>
	//    8   18:pop             
		arraylist1 = new ArrayList(certs);
	//    9   19:new             #99  <Class ArrayList>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #102 <Field Collection certs>
	//   13   27:invokespecial   #631 <Method void ArrayList(Collection)>
	//   14   30:astore          6
		int j;
		for(int i = 0; i < arraylist1.size(); i = j + 1)
	//*  15   32:iconst_0        
	//*  16   33:istore_1        
	//*  17   34:iload_1         
	//*  18   35:aload           6
	//*  19   37:invokevirtual   #632 <Method int ArrayList.size()>
	//*  20   40:icmpge          79
		{
			j = i;
	//   21   43:iload_1         
	//   22   44:istore_2        
			if(signCert.equals(arraylist1.get(i)))
	//*  23   45:aload_0         
	//*  24   46:getfield        #97  <Field X509Certificate signCert>
	//*  25   49:aload           6
	//*  26   51:iload_1         
	//*  27   52:invokevirtual   #635 <Method Object ArrayList.get(int)>
	//*  28   55:invokevirtual   #636 <Method boolean X509Certificate.equals(Object)>
	//*  29   58:ifeq            72
			{
				arraylist1.remove(i);
	//   30   61:aload           6
	//   31   63:iload_1         
	//   32   64:invokevirtual   #639 <Method Object ArrayList.remove(int)>
	//   33   67:pop             
				j = i - 1;
	//   34   68:iload_1         
	//   35   69:iconst_1        
	//   36   70:isub            
	//   37   71:istore_2        
			}
		}

	//   38   72:iload_2         
	//   39   73:iconst_1        
	//   40   74:iadd            
	//   41   75:istore_1        
	//*  42   76:goto            34
		flag1 = true;
	//   43   79:iconst_1        
	//   44   80:istore_2        
_L4:
		if(!flag1) goto _L2; else goto _L1
	//   45   81:iload_2         
	//   46   82:ifeq            203
_L1:
		boolean flag;
		int k;
		X509Certificate x509certificate;
		x509certificate = (X509Certificate)arraylist.get(arraylist.size() - 1);
	//   47   85:aload           5
	//   48   87:aload           5
	//   49   89:invokevirtual   #632 <Method int ArrayList.size()>
	//   50   92:iconst_1        
	//   51   93:isub            
	//   52   94:invokevirtual   #635 <Method Object ArrayList.get(int)>
	//   53   97:checkcast       #95  <Class X509Certificate>
	//   54  100:astore          7
		flag = false;
	//   55  102:iconst_0        
	//   56  103:istore_1        
		k = 0;
	//   57  104:iconst_0        
	//   58  105:istore_3        
_L8:
		flag1 = flag;
	//   59  106:iload_1         
	//   60  107:istore_2        
		if(k >= arraylist1.size()) goto _L4; else goto _L3
	//   61  108:iload_3         
	//   62  109:aload           6
	//   63  111:invokevirtual   #632 <Method int ArrayList.size()>
	//   64  114:icmpge          81
_L3:
		X509Certificate x509certificate1;
		x509certificate1 = (X509Certificate)arraylist1.get(k);
	//   65  117:aload           6
	//   66  119:iload_3         
	//   67  120:invokevirtual   #635 <Method Object ArrayList.get(int)>
	//   68  123:checkcast       #95  <Class X509Certificate>
	//   69  126:astore          8
		flag1 = flag;
	//   70  128:iload_1         
	//   71  129:istore_2        
		if(provider != null) goto _L6; else goto _L5
	//   72  130:aload_0         
	//   73  131:getfield        #72  <Field String provider>
	//   74  134:ifnonnull       184
_L5:
		flag1 = flag;
	//   75  137:iload_1         
	//   76  138:istore_2        
		x509certificate.verify(x509certificate1.getPublicKey());
	//   77  139:aload           7
	//   78  141:aload           8
	//   79  143:invokevirtual   #493 <Method PublicKey X509Certificate.getPublicKey()>
	//   80  146:invokevirtual   #642 <Method void X509Certificate.verify(PublicKey)>
_L7:
		boolean flag2;
		flag2 = true;
	//   81  149:iconst_1        
	//   82  150:istore          4
		flag = true;
	//   83  152:iconst_1        
	//   84  153:istore_1        
		flag1 = flag2;
	//   85  154:iload           4
	//   86  156:istore_2        
		arraylist.add(arraylist1.get(k));
	//   87  157:aload           5
	//   88  159:aload           6
	//   89  161:iload_3         
	//   90  162:invokevirtual   #635 <Method Object ArrayList.get(int)>
	//   91  165:invokevirtual   #628 <Method boolean ArrayList.add(Object)>
	//   92  168:pop             
		flag1 = flag2;
	//   93  169:iload           4
	//   94  171:istore_2        
		arraylist1.remove(k);
	//   95  172:aload           6
	//   96  174:iload_3         
	//   97  175:invokevirtual   #639 <Method Object ArrayList.remove(int)>
	//   98  178:pop             
		flag1 = flag;
	//   99  179:iload_1         
	//  100  180:istore_2        
		  goto _L4
	//* 101  181:goto            81
_L6:
		flag1 = flag;
	//  102  184:iload_1         
	//  103  185:istore_2        
		x509certificate.verify(x509certificate1.getPublicKey(), provider);
	//  104  186:aload           7
	//  105  188:aload           8
	//  106  190:invokevirtual   #493 <Method PublicKey X509Certificate.getPublicKey()>
	//  107  193:aload_0         
	//  108  194:getfield        #72  <Field String provider>
	//  109  197:invokevirtual   #645 <Method void X509Certificate.verify(PublicKey, String)>
		  goto _L7
	//* 110  200:goto            149
_L2:
		signCerts = ((Collection) (arraylist));
	//  111  203:aload_0         
	//  112  204:aload           5
	//  113  206:putfield        #499 <Field Collection signCerts>
		return;
	//  114  209:return          
		Exception exception;
		exception;
	//  115  210:astore          8
		k++;
	//  116  212:iload_3         
	//  117  213:iconst_1        
	//  118  214:iadd            
	//  119  215:istore_3        
		flag = flag1;
	//  120  216:iload_2         
	//  121  217:istore_1        
		  goto _L8
	//* 122  218:goto            106
	}

	private boolean verifySigAttributes(byte abyte0[])
		throws GeneralSecurityException
	{
		Signature signature = initSignature(signCert.getPublicKey());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #97  <Field X509Certificate signCert>
	//    3    5:invokevirtual   #493 <Method PublicKey X509Certificate.getPublicKey()>
	//    4    8:invokespecial   #496 <Method Signature initSignature(PublicKey)>
	//    5   11:astore_2        
		signature.update(abyte0);
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #652 <Method void Signature.update(byte[])>
		return signature.verify(digest);
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:getfield        #431 <Field byte[] digest>
	//   12   22:invokevirtual   #654 <Method boolean Signature.verify(byte[])>
	//   13   25:ireturn         
	}

	public byte[] getAuthenticatedAttributeBytes(byte abyte0[], byte abyte1[], Collection collection, MakeSignature.CryptoStandard cryptostandard)
	{
		try
		{
			abyte0 = getAuthenticatedAttributeSet(abyte0, abyte1, collection, cryptostandard).getEncoded("DER");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #658 <Method DERSet getAuthenticatedAttributeSet(byte[], byte[], Collection, MakeSignature$CryptoStandard)>
	//    6    9:ldc2            #343 <String "DER">
	//    7   12:invokevirtual   #659 <Method byte[] DERSet.getEncoded(String)>
	//    8   15:astore_1        
		}
	//*   9   16:aload_1         
	//*  10   17:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  11   18:astore_1        
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
	//   12   19:new             #201 <Class ExceptionConverter>
	//   13   22:dup             
	//   14   23:aload_1         
	//   15   24:invokespecial   #204 <Method void ExceptionConverter(Exception)>
	//   16   27:athrow          
		}
		return abyte0;
	}

	public Collection getCRLs()
	{
		return crls;
	//    0    0:aload_0         
	//    1    1:getfield        #501 <Field Collection crls>
	//    2    4:areturn         
	}

	public Certificate[] getCertificates()
	{
		return (Certificate[])certs.toArray(((Object []) (new X509Certificate[certs.size()])));
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Collection certs>
	//    2    4:aload_0         
	//    3    5:getfield        #102 <Field Collection certs>
	//    4    8:invokeinterface #665 <Method int Collection.size()>
	//    5   13:anewarray       X509Certificate[]
	//    6   16:invokeinterface #669 <Method Object[] Collection.toArray(Object[])>
	//    7   21:checkcast       #671 <Class Certificate[]>
	//    8   24:areturn         
	}

	public String getDigestAlgorithm()
	{
		return (new StringBuilder()).append(getHashAlgorithm()).append("with").append(getEncryptionAlgorithm()).toString();
	//    0    0:new             #315 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #316 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #138 <Method String getHashAlgorithm()>
	//    5   11:invokevirtual   #323 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc2            #673 <String "with">
	//    7   17:invokevirtual   #323 <Method StringBuilder StringBuilder.append(String)>
	//    8   20:aload_0         
	//    9   21:invokevirtual   #676 <Method String getEncryptionAlgorithm()>
	//   10   24:invokevirtual   #323 <Method StringBuilder StringBuilder.append(String)>
	//   11   27:invokevirtual   #331 <Method String StringBuilder.toString()>
	//   12   30:areturn         
	}

	public String getDigestAlgorithmOid()
	{
		return digestAlgorithmOid;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field String digestAlgorithmOid>
	//    2    4:areturn         
	}

	public String getDigestEncryptionAlgorithmOid()
	{
		return digestEncryptionAlgorithmOid;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field String digestEncryptionAlgorithmOid>
	//    2    4:areturn         
	}

	public byte[] getEncodedPKCS1()
	{
		try
		{
			ByteArrayOutputStream bytearrayoutputstream;
			ASN1OutputStream asn1outputstream;
			if(externalDigest != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #681 <Field byte[] externalDigest>
	//*   2    4:ifnull          56
				digest = externalDigest;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #681 <Field byte[] externalDigest>
	//    6   12:putfield        #431 <Field byte[] digest>
			else
	//*   7   15:new             #683 <Class ByteArrayOutputStream>
	//*   8   18:dup             
	//*   9   19:invokespecial   #684 <Method void ByteArrayOutputStream()>
	//*  10   22:astore_1        
	//*  11   23:new             #686 <Class ASN1OutputStream>
	//*  12   26:dup             
	//*  13   27:aload_1         
	//*  14   28:invokespecial   #689 <Method void ASN1OutputStream(java.io.OutputStream)>
	//*  15   31:astore_2        
	//*  16   32:aload_2         
	//*  17   33:new             #579 <Class DEROctetString>
	//*  18   36:dup             
	//*  19   37:aload_0         
	//*  20   38:getfield        #431 <Field byte[] digest>
	//*  21   41:invokespecial   #580 <Method void DEROctetString(byte[])>
	//*  22   44:invokevirtual   #692 <Method void ASN1OutputStream.writeObject(ASN1Encodable)>
	//*  23   47:aload_2         
	//*  24   48:invokevirtual   #695 <Method void ASN1OutputStream.close()>
	//*  25   51:aload_1         
	//*  26   52:invokevirtual   #698 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  27   55:areturn         
				digest = sig.sign();
	//   28   56:aload_0         
	//   29   57:aload_0         
	//   30   58:getfield        #150 <Field Signature sig>
	//   31   61:invokevirtual   #701 <Method byte[] Signature.sign()>
	//   32   64:putfield        #431 <Field byte[] digest>
			bytearrayoutputstream = new ByteArrayOutputStream();
			asn1outputstream = new ASN1OutputStream(((java.io.OutputStream) (bytearrayoutputstream)));
			asn1outputstream.writeObject(((ASN1Encodable) (new DEROctetString(digest))));
			asn1outputstream.close();
			return bytearrayoutputstream.toByteArray();
		}
	//*  33   67:goto            15
		catch(Exception exception)
	//*  34   70:astore_1        
		{
			throw new ExceptionConverter(exception);
	//   35   71:new             #201 <Class ExceptionConverter>
	//   36   74:dup             
	//   37   75:aload_1         
	//   38   76:invokespecial   #204 <Method void ExceptionConverter(Exception)>
	//   39   79:athrow          
		}
	}

	public byte[] getEncodedPKCS7()
	{
		return getEncodedPKCS7(((byte []) (null)), ((TSAClient) (null)), ((byte []) (null)), ((Collection) (null)), MakeSignature.CryptoStandard.CMS);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:getstatic       #705 <Field MakeSignature$CryptoStandard MakeSignature$CryptoStandard.CMS>
	//    6    8:invokevirtual   #708 <Method byte[] getEncodedPKCS7(byte[], TSAClient, byte[], Collection, MakeSignature$CryptoStandard)>
	//    7   11:areturn         
	}

	public byte[] getEncodedPKCS7(byte abyte0[])
	{
		return getEncodedPKCS7(abyte0, ((TSAClient) (null)), ((byte []) (null)), ((Collection) (null)), MakeSignature.CryptoStandard.CMS);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:getstatic       #705 <Field MakeSignature$CryptoStandard MakeSignature$CryptoStandard.CMS>
	//    6    8:invokevirtual   #708 <Method byte[] getEncodedPKCS7(byte[], TSAClient, byte[], Collection, MakeSignature$CryptoStandard)>
	//    7   11:areturn         
	}

	public byte[] getEncodedPKCS7(byte abyte0[], TSAClient tsaclient, byte abyte1[], Collection collection, MakeSignature.CryptoStandard cryptostandard)
	{
		if(externalDigest == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #681 <Field byte[] externalDigest>
	//    2    4:ifnull          130
_L1:
		digest = externalDigest;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #681 <Field byte[] externalDigest>
	//    6   12:putfield        #431 <Field byte[] digest>
		if(RSAdata != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #135 <Field byte[] RSAdata>
	//*   9   19:ifnull          30
			RSAdata = externalRSAdata;
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #710 <Field byte[] externalRSAdata>
	//   13   27:putfield        #135 <Field byte[] RSAdata>
_L4:
		ASN1EncodableVector asn1encodablevector;
		asn1encodablevector = new ASN1EncodableVector();
	//   14   30:new             #523 <Class ASN1EncodableVector>
	//   15   33:dup             
	//   16   34:invokespecial   #524 <Method void ASN1EncodableVector()>
	//   17   37:astore          6
		ASN1EncodableVector asn1encodablevector1;
		for(Iterator iterator = digestalgos.iterator(); iterator.hasNext(); asn1encodablevector.add(((ASN1Encodable) (new DERSequence(asn1encodablevector1)))))
	//*  18   39:aload_0         
	//*  19   40:getfield        #113 <Field Set digestalgos>
	//*  20   43:invokeinterface #711 <Method Iterator Set.iterator()>
	//*  21   48:astore          7
	//*  22   50:aload           7
	//*  23   52:invokeinterface #297 <Method boolean Iterator.hasNext()>
	//*  24   57:ifeq            220
		{
			Object obj1 = iterator.next();
	//   25   60:aload           7
	//   26   62:invokeinterface #300 <Method Object Iterator.next()>
	//   27   67:astore          8
			asn1encodablevector1 = new ASN1EncodableVector();
	//   28   69:new             #523 <Class ASN1EncodableVector>
	//   29   72:dup             
	//   30   73:invokespecial   #524 <Method void ASN1EncodableVector()>
	//   31   76:astore          9
			asn1encodablevector1.add(((ASN1Encodable) (new ASN1ObjectIdentifier((String)obj1))));
	//   32   78:aload           9
	//   33   80:new             #212 <Class ASN1ObjectIdentifier>
	//   34   83:dup             
	//   35   84:aload           8
	//   36   86:checkcast       #128 <Class String>
	//   37   89:invokespecial   #527 <Method void ASN1ObjectIdentifier(String)>
	//   38   92:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
			asn1encodablevector1.add(((ASN1Encodable) (DERNull.INSTANCE)));
	//   39   95:aload           9
	//   40   97:getstatic       #717 <Field DERNull DERNull.INSTANCE>
	//   41  100:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		}

	//   42  103:aload           6
	//   43  105:new             #536 <Class DERSequence>
	//   44  108:dup             
	//   45  109:aload           9
	//   46  111:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//   47  114:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		break MISSING_BLOCK_LABEL_220;
	//   48  117:goto            50
	//*  49  120:astore_1        
	//*  50  121:new             #201 <Class ExceptionConverter>
	//*  51  124:dup             
	//*  52  125:aload_1         
	//*  53  126:invokespecial   #204 <Method void ExceptionConverter(Exception)>
	//*  54  129:athrow          
_L2:
		if(externalRSAdata != null && RSAdata != null)
	//*  55  130:aload_0         
	//*  56  131:getfield        #710 <Field byte[] externalRSAdata>
	//*  57  134:ifnull          177
	//*  58  137:aload_0         
	//*  59  138:getfield        #135 <Field byte[] RSAdata>
	//*  60  141:ifnull          177
		{
			RSAdata = externalRSAdata;
	//   61  144:aload_0         
	//   62  145:aload_0         
	//   63  146:getfield        #710 <Field byte[] externalRSAdata>
	//   64  149:putfield        #135 <Field byte[] RSAdata>
			sig.update(RSAdata);
	//   65  152:aload_0         
	//   66  153:getfield        #150 <Field Signature sig>
	//   67  156:aload_0         
	//   68  157:getfield        #135 <Field byte[] RSAdata>
	//   69  160:invokevirtual   #652 <Method void Signature.update(byte[])>
			digest = sig.sign();
	//   70  163:aload_0         
	//   71  164:aload_0         
	//   72  165:getfield        #150 <Field Signature sig>
	//   73  168:invokevirtual   #701 <Method byte[] Signature.sign()>
	//   74  171:putfield        #431 <Field byte[] digest>
			continue; /* Loop/switch isn't completed */
	//   75  174:goto            30
		}
		try
		{
			if(RSAdata != null)
	//*  76  177:aload_0         
	//*  77  178:getfield        #135 <Field byte[] RSAdata>
	//*  78  181:ifnull          206
			{
				RSAdata = messageDigest.digest();
	//   79  184:aload_0         
	//   80  185:aload_0         
	//   81  186:getfield        #144 <Field MessageDigest messageDigest>
	//   82  189:invokevirtual   #719 <Method byte[] MessageDigest.digest()>
	//   83  192:putfield        #135 <Field byte[] RSAdata>
				sig.update(RSAdata);
	//   84  195:aload_0         
	//   85  196:getfield        #150 <Field Signature sig>
	//   86  199:aload_0         
	//   87  200:getfield        #135 <Field byte[] RSAdata>
	//   88  203:invokevirtual   #652 <Method void Signature.update(byte[])>
			}
			digest = sig.sign();
	//   89  206:aload_0         
	//   90  207:aload_0         
	//   91  208:getfield        #150 <Field Signature sig>
	//   92  211:invokevirtual   #701 <Method byte[] Signature.sign()>
	//   93  214:putfield        #431 <Field byte[] digest>
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
		}
		if(true) goto _L4; else goto _L3
	//   94  217:goto            30
_L3:
		Object obj;
		Object obj2;
		obj = ((Object) (new ASN1EncodableVector()));
	//   95  220:new             #523 <Class ASN1EncodableVector>
	//   96  223:dup             
	//   97  224:invokespecial   #524 <Method void ASN1EncodableVector()>
	//   98  227:astore          7
		((ASN1EncodableVector) (obj)).add(((ASN1Encodable) (new ASN1ObjectIdentifier("1.2.840.113549.1.7.1"))));
	//   99  229:aload           7
	//  100  231:new             #212 <Class ASN1ObjectIdentifier>
	//  101  234:dup             
	//  102  235:ldc2            #577 <String "1.2.840.113549.1.7.1">
	//  103  238:invokespecial   #527 <Method void ASN1ObjectIdentifier(String)>
	//  104  241:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		if(RSAdata != null)
	//* 105  244:aload_0         
	//* 106  245:getfield        #135 <Field byte[] RSAdata>
	//* 107  248:ifnull          275
			((ASN1EncodableVector) (obj)).add(((ASN1Encodable) (new DERTaggedObject(0, ((ASN1Encodable) (new DEROctetString(RSAdata)))))));
	//  108  251:aload           7
	//  109  253:new             #583 <Class DERTaggedObject>
	//  110  256:dup             
	//  111  257:iconst_0        
	//  112  258:new             #579 <Class DEROctetString>
	//  113  261:dup             
	//  114  262:aload_0         
	//  115  263:getfield        #135 <Field byte[] RSAdata>
	//  116  266:invokespecial   #580 <Method void DEROctetString(byte[])>
	//  117  269:invokespecial   #722 <Method void DERTaggedObject(int, ASN1Encodable)>
	//  118  272:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		obj = ((Object) (new DERSequence(((ASN1EncodableVector) (obj)))));
	//  119  275:new             #536 <Class DERSequence>
	//  120  278:dup             
	//  121  279:aload           7
	//  122  281:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//  123  284:astore          7
		obj2 = ((Object) (new ASN1EncodableVector()));
	//  124  286:new             #523 <Class ASN1EncodableVector>
	//  125  289:dup             
	//  126  290:invokespecial   #524 <Method void ASN1EncodableVector()>
	//  127  293:astore          8
		for(Iterator iterator1 = certs.iterator(); iterator1.hasNext(); ((ASN1EncodableVector) (obj2)).add(((ASN1Encodable) ((new ASN1InputStream(((java.io.InputStream) (new ByteArrayInputStream(((X509Certificate)iterator1.next()).getEncoded()))))).readObject()))));
	//  128  295:aload_0         
	//  129  296:getfield        #102 <Field Collection certs>
	//  130  299:invokeinterface #292 <Method Iterator Collection.iterator()>
	//  131  304:astore          9
	//  132  306:aload           9
	//  133  308:invokeinterface #297 <Method boolean Iterator.hasNext()>
	//  134  313:ifeq            354
	//  135  316:aload           8
	//  136  318:new             #180 <Class ASN1InputStream>
	//  137  321:dup             
	//  138  322:new             #182 <Class ByteArrayInputStream>
	//  139  325:dup             
	//  140  326:aload           9
	//  141  328:invokeinterface #300 <Method Object Iterator.next()>
	//  142  333:checkcast       #95  <Class X509Certificate>
	//  143  336:invokevirtual   #376 <Method byte[] X509Certificate.getEncoded()>
	//  144  339:invokespecial   #185 <Method void ByteArrayInputStream(byte[])>
	//  145  342:invokespecial   #188 <Method void ASN1InputStream(java.io.InputStream)>
	//  146  345:invokevirtual   #192 <Method ASN1Primitive ASN1InputStream.readObject()>
	//  147  348:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
	//* 148  351:goto            306
		ASN1EncodableVector asn1encodablevector2;
		obj2 = ((Object) (new DERSet(((ASN1EncodableVector) (obj2)))));
	//  149  354:new             #532 <Class DERSet>
	//  150  357:dup             
	//  151  358:aload           8
	//  152  360:invokespecial   #615 <Method void DERSet(ASN1EncodableVector)>
	//  153  363:astore          8
		asn1encodablevector2 = new ASN1EncodableVector();
	//  154  365:new             #523 <Class ASN1EncodableVector>
	//  155  368:dup             
	//  156  369:invokespecial   #524 <Method void ASN1EncodableVector()>
	//  157  372:astore          9
		asn1encodablevector2.add(((ASN1Encodable) (new ASN1Integer(signerversion))));
	//  158  374:aload           9
	//  159  376:new             #226 <Class ASN1Integer>
	//  160  379:dup             
	//  161  380:aload_0         
	//  162  381:getfield        #70  <Field int signerversion>
	//  163  384:invokespecial   #723 <Method void ASN1Integer(int)>
	//  164  387:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		ASN1EncodableVector asn1encodablevector3 = new ASN1EncodableVector();
	//  165  390:new             #523 <Class ASN1EncodableVector>
	//  166  393:dup             
	//  167  394:invokespecial   #524 <Method void ASN1EncodableVector()>
	//  168  397:astore          10
		asn1encodablevector3.add(((ASN1Encodable) (CertificateInfo.getIssuer(signCert.getTBSCertificate()))));
	//  169  399:aload           10
	//  170  401:aload_0         
	//  171  402:getfield        #97  <Field X509Certificate signCert>
	//  172  405:invokevirtual   #726 <Method byte[] X509Certificate.getTBSCertificate()>
	//  173  408:invokestatic    #732 <Method ASN1Primitive CertificateInfo.getIssuer(byte[])>
	//  174  411:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		asn1encodablevector3.add(((ASN1Encodable) (new ASN1Integer(signCert.getSerialNumber()))));
	//  175  414:aload           10
	//  176  416:new             #226 <Class ASN1Integer>
	//  177  419:dup             
	//  178  420:aload_0         
	//  179  421:getfield        #97  <Field X509Certificate signCert>
	//  180  424:invokevirtual   #310 <Method BigInteger X509Certificate.getSerialNumber()>
	//  181  427:invokespecial   #735 <Method void ASN1Integer(BigInteger)>
	//  182  430:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		asn1encodablevector2.add(((ASN1Encodable) (new DERSequence(asn1encodablevector3))));
	//  183  433:aload           9
	//  184  435:new             #536 <Class DERSequence>
	//  185  438:dup             
	//  186  439:aload           10
	//  187  441:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//  188  444:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		asn1encodablevector3 = new ASN1EncodableVector();
	//  189  447:new             #523 <Class ASN1EncodableVector>
	//  190  450:dup             
	//  191  451:invokespecial   #524 <Method void ASN1EncodableVector()>
	//  192  454:astore          10
		asn1encodablevector3.add(((ASN1Encodable) (new ASN1ObjectIdentifier(digestAlgorithmOid))));
	//  193  456:aload           10
	//  194  458:new             #212 <Class ASN1ObjectIdentifier>
	//  195  461:dup             
	//  196  462:aload_0         
	//  197  463:getfield        #82  <Field String digestAlgorithmOid>
	//  198  466:invokespecial   #527 <Method void ASN1ObjectIdentifier(String)>
	//  199  469:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		asn1encodablevector3.add(((ASN1Encodable) (new DERNull())));
	//  200  472:aload           10
	//  201  474:new             #713 <Class DERNull>
	//  202  477:dup             
	//  203  478:invokespecial   #736 <Method void DERNull()>
	//  204  481:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		asn1encodablevector2.add(((ASN1Encodable) (new DERSequence(asn1encodablevector3))));
	//  205  484:aload           9
	//  206  486:new             #536 <Class DERSequence>
	//  207  489:dup             
	//  208  490:aload           10
	//  209  492:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//  210  495:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_526;
	//  211  498:aload_1         
	//  212  499:ifnull          526
		asn1encodablevector2.add(((ASN1Encodable) (new DERTaggedObject(false, 0, ((ASN1Encodable) (getAuthenticatedAttributeSet(abyte0, abyte1, collection, cryptostandard)))))));
	//  213  502:aload           9
	//  214  504:new             #583 <Class DERTaggedObject>
	//  215  507:dup             
	//  216  508:iconst_0        
	//  217  509:iconst_0        
	//  218  510:aload_0         
	//  219  511:aload_1         
	//  220  512:aload_3         
	//  221  513:aload           4
	//  222  515:aload           5
	//  223  517:invokespecial   #658 <Method DERSet getAuthenticatedAttributeSet(byte[], byte[], Collection, MakeSignature$CryptoStandard)>
	//  224  520:invokespecial   #586 <Method void DERTaggedObject(boolean, int, ASN1Encodable)>
	//  225  523:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		abyte0 = ((byte []) (new ASN1EncodableVector()));
	//  226  526:new             #523 <Class ASN1EncodableVector>
	//  227  529:dup             
	//  228  530:invokespecial   #524 <Method void ASN1EncodableVector()>
	//  229  533:astore_1        
		((ASN1EncodableVector) (abyte0)).add(((ASN1Encodable) (new ASN1ObjectIdentifier(digestEncryptionAlgorithmOid))));
	//  230  534:aload_1         
	//  231  535:new             #212 <Class ASN1ObjectIdentifier>
	//  232  538:dup             
	//  233  539:aload_0         
	//  234  540:getfield        #124 <Field String digestEncryptionAlgorithmOid>
	//  235  543:invokespecial   #527 <Method void ASN1ObjectIdentifier(String)>
	//  236  546:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		((ASN1EncodableVector) (abyte0)).add(((ASN1Encodable) (new DERNull())));
	//  237  549:aload_1         
	//  238  550:new             #713 <Class DERNull>
	//  239  553:dup             
	//  240  554:invokespecial   #736 <Method void DERNull()>
	//  241  557:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		asn1encodablevector2.add(((ASN1Encodable) (new DERSequence(((ASN1EncodableVector) (abyte0))))));
	//  242  560:aload           9
	//  243  562:new             #536 <Class DERSequence>
	//  244  565:dup             
	//  245  566:aload_1         
	//  246  567:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//  247  570:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		asn1encodablevector2.add(((ASN1Encodable) (new DEROctetString(digest))));
	//  248  573:aload           9
	//  249  575:new             #579 <Class DEROctetString>
	//  250  578:dup             
	//  251  579:aload_0         
	//  252  580:getfield        #431 <Field byte[] digest>
	//  253  583:invokespecial   #580 <Method void DEROctetString(byte[])>
	//  254  586:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		if(tsaclient == null)
			break MISSING_BLOCK_LABEL_649;
	//  255  589:aload_2         
	//  256  590:ifnull          649
		abyte0 = tsaclient.getTimeStampToken(tsaclient.getMessageDigest().digest(digest));
	//  257  593:aload_2         
	//  258  594:aload_2         
	//  259  595:invokeinterface #741 <Method MessageDigest TSAClient.getMessageDigest()>
	//  260  600:aload_0         
	//  261  601:getfield        #431 <Field byte[] digest>
	//  262  604:invokevirtual   #389 <Method byte[] MessageDigest.digest(byte[])>
	//  263  607:invokeinterface #744 <Method byte[] TSAClient.getTimeStampToken(byte[])>
	//  264  612:astore_1        
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_649;
	//  265  613:aload_1         
	//  266  614:ifnull          649
		abyte0 = ((byte []) (buildUnauthenticatedAttributes(abyte0)));
	//  267  617:aload_0         
	//  268  618:aload_1         
	//  269  619:invokespecial   #746 <Method ASN1EncodableVector buildUnauthenticatedAttributes(byte[])>
	//  270  622:astore_1        
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_649;
	//  271  623:aload_1         
	//  272  624:ifnull          649
		asn1encodablevector2.add(((ASN1Encodable) (new DERTaggedObject(false, 1, ((ASN1Encodable) (new DERSet(((ASN1EncodableVector) (abyte0)))))))));
	//  273  627:aload           9
	//  274  629:new             #583 <Class DERTaggedObject>
	//  275  632:dup             
	//  276  633:iconst_0        
	//  277  634:iconst_1        
	//  278  635:new             #532 <Class DERSet>
	//  279  638:dup             
	//  280  639:aload_1         
	//  281  640:invokespecial   #615 <Method void DERSet(ASN1EncodableVector)>
	//  282  643:invokespecial   #586 <Method void DERTaggedObject(boolean, int, ASN1Encodable)>
	//  283  646:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		abyte0 = ((byte []) (new ASN1EncodableVector()));
	//  284  649:new             #523 <Class ASN1EncodableVector>
	//  285  652:dup             
	//  286  653:invokespecial   #524 <Method void ASN1EncodableVector()>
	//  287  656:astore_1        
		((ASN1EncodableVector) (abyte0)).add(((ASN1Encodable) (new ASN1Integer(version))));
	//  288  657:aload_1         
	//  289  658:new             #226 <Class ASN1Integer>
	//  290  661:dup             
	//  291  662:aload_0         
	//  292  663:getfield        #68  <Field int version>
	//  293  666:invokespecial   #723 <Method void ASN1Integer(int)>
	//  294  669:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		((ASN1EncodableVector) (abyte0)).add(((ASN1Encodable) (new DERSet(asn1encodablevector))));
	//  295  672:aload_1         
	//  296  673:new             #532 <Class DERSet>
	//  297  676:dup             
	//  298  677:aload           6
	//  299  679:invokespecial   #615 <Method void DERSet(ASN1EncodableVector)>
	//  300  682:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		((ASN1EncodableVector) (abyte0)).add(((ASN1Encodable) (obj)));
	//  301  685:aload_1         
	//  302  686:aload           7
	//  303  688:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		((ASN1EncodableVector) (abyte0)).add(((ASN1Encodable) (new DERTaggedObject(false, 0, ((ASN1Encodable) (obj2))))));
	//  304  691:aload_1         
	//  305  692:new             #583 <Class DERTaggedObject>
	//  306  695:dup             
	//  307  696:iconst_0        
	//  308  697:iconst_0        
	//  309  698:aload           8
	//  310  700:invokespecial   #586 <Method void DERTaggedObject(boolean, int, ASN1Encodable)>
	//  311  703:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		((ASN1EncodableVector) (abyte0)).add(((ASN1Encodable) (new DERSet(((ASN1Encodable) (new DERSequence(asn1encodablevector2)))))));
	//  312  706:aload_1         
	//  313  707:new             #532 <Class DERSet>
	//  314  710:dup             
	//  315  711:new             #536 <Class DERSequence>
	//  316  714:dup             
	//  317  715:aload           9
	//  318  717:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//  319  720:invokespecial   #534 <Method void DERSet(ASN1Encodable)>
	//  320  723:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		tsaclient = ((TSAClient) (new ASN1EncodableVector()));
	//  321  726:new             #523 <Class ASN1EncodableVector>
	//  322  729:dup             
	//  323  730:invokespecial   #524 <Method void ASN1EncodableVector()>
	//  324  733:astore_2        
		((ASN1EncodableVector) (tsaclient)).add(((ASN1Encodable) (new ASN1ObjectIdentifier("1.2.840.113549.1.7.2"))));
	//  325  734:aload_2         
	//  326  735:new             #212 <Class ASN1ObjectIdentifier>
	//  327  738:dup             
	//  328  739:ldc1            #217 <String "1.2.840.113549.1.7.2">
	//  329  741:invokespecial   #527 <Method void ASN1ObjectIdentifier(String)>
	//  330  744:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		((ASN1EncodableVector) (tsaclient)).add(((ASN1Encodable) (new DERTaggedObject(0, ((ASN1Encodable) (new DERSequence(((ASN1EncodableVector) (abyte0)))))))));
	//  331  747:aload_2         
	//  332  748:new             #583 <Class DERTaggedObject>
	//  333  751:dup             
	//  334  752:iconst_0        
	//  335  753:new             #536 <Class DERSequence>
	//  336  756:dup             
	//  337  757:aload_1         
	//  338  758:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//  339  761:invokespecial   #722 <Method void DERTaggedObject(int, ASN1Encodable)>
	//  340  764:invokevirtual   #530 <Method void ASN1EncodableVector.add(ASN1Encodable)>
		abyte0 = ((byte []) (new ByteArrayOutputStream()));
	//  341  767:new             #683 <Class ByteArrayOutputStream>
	//  342  770:dup             
	//  343  771:invokespecial   #684 <Method void ByteArrayOutputStream()>
	//  344  774:astore_1        
		abyte1 = ((byte []) (new ASN1OutputStream(((java.io.OutputStream) (abyte0)))));
	//  345  775:new             #686 <Class ASN1OutputStream>
	//  346  778:dup             
	//  347  779:aload_1         
	//  348  780:invokespecial   #689 <Method void ASN1OutputStream(java.io.OutputStream)>
	//  349  783:astore_3        
		((ASN1OutputStream) (abyte1)).writeObject(((ASN1Encodable) (new DERSequence(((ASN1EncodableVector) (tsaclient))))));
	//  350  784:aload_3         
	//  351  785:new             #536 <Class DERSequence>
	//  352  788:dup             
	//  353  789:aload_2         
	//  354  790:invokespecial   #539 <Method void DERSequence(ASN1EncodableVector)>
	//  355  793:invokevirtual   #692 <Method void ASN1OutputStream.writeObject(ASN1Encodable)>
		((ASN1OutputStream) (abyte1)).close();
	//  356  796:aload_3         
	//  357  797:invokevirtual   #695 <Method void ASN1OutputStream.close()>
		abyte0 = ((ByteArrayOutputStream) (abyte0)).toByteArray();
	//  358  800:aload_1         
	//  359  801:invokevirtual   #698 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//  360  804:astore_1        
		return abyte0;
	//  361  805:aload_1         
	//  362  806:areturn         
	}

	public String getEncryptionAlgorithm()
	{
		String s1 = EncryptionAlgorithms.getAlgorithm(digestEncryptionAlgorithmOid);
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field String digestEncryptionAlgorithmOid>
	//    2    4:invokestatic    #751 <Method String EncryptionAlgorithms.getAlgorithm(String)>
	//    3    7:astore_2        
		String s = s1;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(s1 == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       19
			s = digestEncryptionAlgorithmOid;
	//    8   14:aload_0         
	//    9   15:getfield        #124 <Field String digestEncryptionAlgorithmOid>
	//   10   18:astore_1        
		return s;
	//   11   19:aload_1         
	//   12   20:areturn         
	}

	public PdfName getFilterSubtype()
	{
		return filterSubtype;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field PdfName filterSubtype>
	//    2    4:areturn         
	}

	public String getHashAlgorithm()
	{
		return DigestAlgorithms.getDigest(digestAlgorithmOid);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field String digestAlgorithmOid>
	//    2    4:invokestatic    #424 <Method String DigestAlgorithms.getDigest(String)>
	//    3    7:areturn         
	}

	public String getLocation()
	{
		return location;
	//    0    0:aload_0         
	//    1    1:getfield        #754 <Field String location>
	//    2    4:areturn         
	}

	public BasicOCSPResp getOcsp()
	{
		return basicResp;
	//    0    0:aload_0         
	//    1    1:getfield        #555 <Field BasicOCSPResp basicResp>
	//    2    4:areturn         
	}

	public String getReason()
	{
		return reason;
	//    0    0:aload_0         
	//    1    1:getfield        #759 <Field String reason>
	//    2    4:areturn         
	}

	public Certificate[] getSignCertificateChain()
	{
		return (Certificate[])signCerts.toArray(((Object []) (new X509Certificate[signCerts.size()])));
	//    0    0:aload_0         
	//    1    1:getfield        #499 <Field Collection signCerts>
	//    2    4:aload_0         
	//    3    5:getfield        #499 <Field Collection signCerts>
	//    4    8:invokeinterface #665 <Method int Collection.size()>
	//    5   13:anewarray       X509Certificate[]
	//    6   16:invokeinterface #669 <Method Object[] Collection.toArray(Object[])>
	//    7   21:checkcast       #671 <Class Certificate[]>
	//    8   24:areturn         
	}

	public Calendar getSignDate()
	{
		Calendar calendar1 = getTimeStampDate();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #765 <Method Calendar getTimeStampDate()>
	//    2    4:astore_2        
		Calendar calendar = calendar1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(calendar1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       16
			calendar = signDate;
	//    7   11:aload_0         
	//    8   12:getfield        #767 <Field Calendar signDate>
	//    9   15:astore_1        
		return calendar;
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public String getSignName()
	{
		return signName;
	//    0    0:aload_0         
	//    1    1:getfield        #770 <Field String signName>
	//    2    4:areturn         
	}

	public X509Certificate getSigningCertificate()
	{
		return signCert;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field X509Certificate signCert>
	//    2    4:areturn         
	}

	public int getSigningInfoVersion()
	{
		return signerversion;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int signerversion>
	//    2    4:ireturn         
	}

	public Calendar getTimeStampDate()
	{
		if(timeStampToken == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #466 <Field TimeStampToken timeStampToken>
	//*   2    4:ifnonnull       9
		{
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		} else
		{
			GregorianCalendar gregoriancalendar = new GregorianCalendar();
	//    5    9:new             #775 <Class GregorianCalendar>
	//    6   12:dup             
	//    7   13:invokespecial   #776 <Method void GregorianCalendar()>
	//    8   16:astore_1        
			((Calendar) (gregoriancalendar)).setTime(timeStampToken.getTimeStampInfo().getGenTime());
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #466 <Field TimeStampToken timeStampToken>
	//   12   22:invokevirtual   #470 <Method TimeStampTokenInfo TimeStampToken.getTimeStampInfo()>
	//   13   25:invokevirtual   #780 <Method java.util.Date TimeStampTokenInfo.getGenTime()>
	//   14   28:invokevirtual   #786 <Method void Calendar.setTime(java.util.Date)>
			return ((Calendar) (gregoriancalendar));
	//   15   31:aload_1         
	//   16   32:areturn         
		}
	}

	public TimeStampToken getTimeStampToken()
	{
		return timeStampToken;
	//    0    0:aload_0         
	//    1    1:getfield        #466 <Field TimeStampToken timeStampToken>
	//    2    4:areturn         
	}

	public int getVersion()
	{
		return version;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int version>
	//    2    4:ireturn         
	}

	public boolean isRevocationValid()
	{
		if(basicResp == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #555 <Field BasicOCSPResp basicResp>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(signCerts.size() < 2)
	//*   5    9:aload_0         
	//*   6   10:getfield        #499 <Field Collection signCerts>
	//*   7   13:invokeinterface #665 <Method int Collection.size()>
	//*   8   18:iconst_2        
	//*   9   19:icmpge          24
			return false;
	//   10   22:iconst_0        
	//   11   23:ireturn         
		boolean flag;
		try
		{
			X509Certificate ax509certificate[] = (X509Certificate[])(X509Certificate[])getSignCertificateChain();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #791 <Method Certificate[] getSignCertificateChain()>
	//   14   28:checkcast       #793 <Class X509Certificate[]>
	//   15   31:checkcast       #793 <Class X509Certificate[]>
	//   16   34:astore_2        
			CertificateID certificateid = basicResp.getResponses()[0].getCertID();
	//   17   35:aload_0         
	//   18   36:getfield        #555 <Field BasicOCSPResp basicResp>
	//   19   39:invokevirtual   #797 <Method SingleResp[] BasicOCSPResp.getResponses()>
	//   20   42:iconst_0        
	//   21   43:aaload          
	//   22   44:invokevirtual   #803 <Method CertificateID SingleResp.getCertID()>
	//   23   47:astore_3        
			org.spongycastle.operator.DigestCalculator digestcalculator = (new JcaDigestCalculatorProviderBuilder()).build().get(new AlgorithmIdentifier(certificateid.getHashAlgOID(), ((ASN1Encodable) (DERNull.INSTANCE))));
	//   24   48:new             #805 <Class JcaDigestCalculatorProviderBuilder>
	//   25   51:dup             
	//   26   52:invokespecial   #806 <Method void JcaDigestCalculatorProviderBuilder()>
	//   27   55:invokevirtual   #810 <Method DigestCalculatorProvider JcaDigestCalculatorProviderBuilder.build()>
	//   28   58:new             #418 <Class AlgorithmIdentifier>
	//   29   61:dup             
	//   30   62:aload_3         
	//   31   63:invokevirtual   #815 <Method ASN1ObjectIdentifier CertificateID.getHashAlgOID()>
	//   32   66:getstatic       #717 <Field DERNull DERNull.INSTANCE>
	//   33   69:invokespecial   #818 <Method void AlgorithmIdentifier(ASN1ObjectIdentifier, ASN1Encodable)>
	//   34   72:invokeinterface #823 <Method org.spongycastle.operator.DigestCalculator DigestCalculatorProvider.get(AlgorithmIdentifier)>
	//   35   77:astore          4
			X509Certificate x509certificate = getSigningCertificate();
	//   36   79:aload_0         
	//   37   80:invokevirtual   #825 <Method X509Certificate getSigningCertificate()>
	//   38   83:astore          5
			flag = (new CertificateID(digestcalculator, ((org.spongycastle.cert.X509CertificateHolder) (new JcaX509CertificateHolder(ax509certificate[1]))), x509certificate.getSerialNumber())).equals(((Object) (certificateid)));
	//   39   85:new             #812 <Class CertificateID>
	//   40   88:dup             
	//   41   89:aload           4
	//   42   91:new             #827 <Class JcaX509CertificateHolder>
	//   43   94:dup             
	//   44   95:aload_2         
	//   45   96:iconst_1        
	//   46   97:aaload          
	//   47   98:invokespecial   #830 <Method void JcaX509CertificateHolder(X509Certificate)>
	//   48  101:aload           5
	//   49  103:invokevirtual   #310 <Method BigInteger X509Certificate.getSerialNumber()>
	//   50  106:invokespecial   #833 <Method void CertificateID(org.spongycastle.operator.DigestCalculator, org.spongycastle.cert.X509CertificateHolder, BigInteger)>
	//   51  109:aload_3         
	//   52  110:invokevirtual   #834 <Method boolean CertificateID.equals(Object)>
	//   53  113:istore_1        
		}
	//*  54  114:iload_1         
	//*  55  115:ireturn         
		catch(Exception exception)
	//*  56  116:astore_2        
		{
			return false;
	//   57  117:iconst_0        
	//   58  118:ireturn         
		}
		return flag;
	}

	public boolean isTsp()
	{
		return isTsp;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field boolean isTsp>
	//    2    4:ireturn         
	}

	public void setExternalDigest(byte abyte0[], byte abyte1[], String s)
	{
label0:
		{
			externalDigest = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #681 <Field byte[] externalDigest>
			externalRSAdata = abyte1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #710 <Field byte[] externalRSAdata>
			if(s != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          29
			{
				if(!s.equals("RSA"))
					break label0;
	//    8   14:aload_3         
	//    9   15:ldc1            #126 <String "RSA">
	//   10   17:invokevirtual   #131 <Method boolean String.equals(Object)>
	//   11   20:ifeq            30
				digestEncryptionAlgorithmOid = "1.2.840.113549.1.1.1";
	//   12   23:aload_0         
	//   13   24:ldc1            #133 <String "1.2.840.113549.1.1.1">
	//   14   26:putfield        #124 <Field String digestEncryptionAlgorithmOid>
			}
			return;
	//   15   29:return          
		}
		if(s.equals("DSA"))
	//*  16   30:aload_3         
	//*  17   31:ldc1            #152 <String "DSA">
	//*  18   33:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  19   36:ifeq            46
		{
			digestEncryptionAlgorithmOid = "1.2.840.10040.4.1";
	//   20   39:aload_0         
	//   21   40:ldc1            #154 <String "1.2.840.10040.4.1">
	//   22   42:putfield        #124 <Field String digestEncryptionAlgorithmOid>
			return;
	//   23   45:return          
		}
		if(s.equals("ECDSA"))
	//*  24   46:aload_3         
	//*  25   47:ldc2            #837 <String "ECDSA">
	//*  26   50:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  27   53:ifeq            64
		{
			digestEncryptionAlgorithmOid = "1.2.840.10045.2.1";
	//   28   56:aload_0         
	//   29   57:ldc2            #839 <String "1.2.840.10045.2.1">
	//   30   60:putfield        #124 <Field String digestEncryptionAlgorithmOid>
			return;
	//   31   63:return          
		} else
		{
			throw new ExceptionConverter(((Exception) (new NoSuchAlgorithmException(MessageLocalization.getComposedMessage("unknown.key.algorithm.1", new Object[] {
				s
			})))));
	//   32   64:new             #201 <Class ExceptionConverter>
	//   33   67:dup             
	//   34   68:new             #63  <Class NoSuchAlgorithmException>
	//   35   71:dup             
	//   36   72:ldc1            #156 <String "unknown.key.algorithm.1">
	//   37   74:iconst_1        
	//   38   75:anewarray       Object[]
	//   39   78:dup             
	//   40   79:iconst_0        
	//   41   80:aload_3         
	//   42   81:aastore         
	//   43   82:invokestatic    #90  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   44   85:invokespecial   #93  <Method void NoSuchAlgorithmException(String)>
	//   45   88:invokespecial   #204 <Method void ExceptionConverter(Exception)>
	//   46   91:athrow          
		}
	}

	public void setLocation(String s)
	{
		location = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #754 <Field String location>
	//    3    5:return          
	}

	public void setReason(String s)
	{
		reason = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #759 <Field String reason>
	//    3    5:return          
	}

	public void setSignDate(Calendar calendar)
	{
		signDate = calendar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #767 <Field Calendar signDate>
	//    3    5:return          
	}

	public void setSignName(String s)
	{
		signName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #770 <Field String signName>
	//    3    5:return          
	}

	public void setSignaturePolicy(SignaturePolicyInfo signaturepolicyinfo)
	{
		signaturePolicyIdentifier = signaturepolicyinfo.toSignaturePolicyIdentifier();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #852 <Method SignaturePolicyIdentifier SignaturePolicyInfo.toSignaturePolicyIdentifier()>
	//    3    5:putfield        #608 <Field SignaturePolicyIdentifier signaturePolicyIdentifier>
	//    4    8:return          
	}

	public void setSignaturePolicy(SignaturePolicyIdentifier signaturepolicyidentifier)
	{
		signaturePolicyIdentifier = signaturepolicyidentifier;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #608 <Field SignaturePolicyIdentifier signaturePolicyIdentifier>
	//    3    5:return          
	}

	public void update(byte abyte0[], int i, int j)
		throws SignatureException
	{
		if(RSAdata != null || digestAttr != null || isTsp)
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field byte[] RSAdata>
	//*   2    4:ifnonnull       21
	//*   3    7:aload_0         
	//*   4    8:getfield        #352 <Field byte[] digestAttr>
	//*   5   11:ifnonnull       21
	//*   6   14:aload_0         
	//*   7   15:getfield        #173 <Field boolean isTsp>
	//*   8   18:ifeq            32
		{
			messageDigest.update(abyte0, i, j);
	//    9   21:aload_0         
	//   10   22:getfield        #144 <Field MessageDigest messageDigest>
	//   11   25:aload_1         
	//   12   26:iload_2         
	//   13   27:iload_3         
	//   14   28:invokevirtual   #858 <Method void MessageDigest.update(byte[], int, int)>
			return;
	//   15   31:return          
		} else
		{
			sig.update(abyte0, i, j);
	//   16   32:aload_0         
	//   17   33:getfield        #150 <Field Signature sig>
	//   18   36:aload_1         
	//   19   37:iload_2         
	//   20   38:iload_3         
	//   21   39:invokevirtual   #859 <Method void Signature.update(byte[], int, int)>
			return;
	//   22   42:return          
		}
	}

	public boolean verify()
		throws GeneralSecurityException
	{
		boolean flag4 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(verified)
	//*   2    3:aload_0         
	//*   3    4:getfield        #861 <Field boolean verified>
	//*   4    7:ifeq            15
			return verifyResult;
	//    5   10:aload_0         
	//    6   11:getfield        #863 <Field boolean verifyResult>
	//    7   14:ireturn         
		if(isTsp)
	//*   8   15:aload_0         
	//*   9   16:getfield        #173 <Field boolean isTsp>
	//*  10   19:ifeq            66
		{
			MessageImprint messageimprint = timeStampToken.getTimeStampInfo().toASN1Structure().getMessageImprint();
	//   11   22:aload_0         
	//   12   23:getfield        #466 <Field TimeStampToken timeStampToken>
	//   13   26:invokevirtual   #470 <Method TimeStampTokenInfo TimeStampToken.getTimeStampInfo()>
	//   14   29:invokevirtual   #867 <Method TSTInfo TimeStampTokenInfo.toASN1Structure()>
	//   15   32:invokevirtual   #873 <Method MessageImprint TSTInfo.getMessageImprint()>
	//   16   35:astore          6
			verifyResult = Arrays.equals(messageDigest.digest(), messageimprint.getHashedMessage());
	//   17   37:aload_0         
	//   18   38:aload_0         
	//   19   39:getfield        #144 <Field MessageDigest messageDigest>
	//   20   42:invokevirtual   #719 <Method byte[] MessageDigest.digest()>
	//   21   45:aload           6
	//   22   47:invokevirtual   #878 <Method byte[] MessageImprint.getHashedMessage()>
	//   23   50:invokestatic    #399 <Method boolean Arrays.equals(byte[], byte[])>
	//   24   53:putfield        #863 <Field boolean verifyResult>
		} else
	//*  25   56:aload_0         
	//*  26   57:iconst_1        
	//*  27   58:putfield        #861 <Field boolean verified>
	//*  28   61:aload_0         
	//*  29   62:getfield        #863 <Field boolean verifyResult>
	//*  30   65:ireturn         
		if(sigAttr != null || sigAttrDer != null)
	//*  31   66:aload_0         
	//*  32   67:getfield        #341 <Field byte[] sigAttr>
	//*  33   70:ifnonnull       80
	//*  34   73:aload_0         
	//*  35   74:getfield        #348 <Field byte[] sigAttrDer>
	//*  36   77:ifnull          227
		{
			byte abyte0[] = messageDigest.digest();
	//   37   80:aload_0         
	//   38   81:getfield        #144 <Field MessageDigest messageDigest>
	//   39   84:invokevirtual   #719 <Method byte[] MessageDigest.digest()>
	//   40   87:astore          6
			boolean flag2 = true;
	//   41   89:iconst_1        
	//   42   90:istore_3        
			boolean flag3 = false;
	//   43   91:iconst_0        
	//   44   92:istore          4
			if(RSAdata != null)
	//*  45   94:aload_0         
	//*  46   95:getfield        #135 <Field byte[] RSAdata>
	//*  47   98:ifnull          138
			{
				flag2 = Arrays.equals(abyte0, RSAdata);
	//   48  101:aload           6
	//   49  103:aload_0         
	//   50  104:getfield        #135 <Field byte[] RSAdata>
	//   51  107:invokestatic    #399 <Method boolean Arrays.equals(byte[], byte[])>
	//   52  110:istore_3        
				encContDigest.update(RSAdata);
	//   53  111:aload_0         
	//   54  112:getfield        #489 <Field MessageDigest encContDigest>
	//   55  115:aload_0         
	//   56  116:getfield        #135 <Field byte[] RSAdata>
	//   57  119:invokevirtual   #879 <Method void MessageDigest.update(byte[])>
				flag3 = Arrays.equals(encContDigest.digest(), digestAttr);
	//   58  122:aload_0         
	//   59  123:getfield        #489 <Field MessageDigest encContDigest>
	//   60  126:invokevirtual   #719 <Method byte[] MessageDigest.digest()>
	//   61  129:aload_0         
	//   62  130:getfield        #352 <Field byte[] digestAttr>
	//   63  133:invokestatic    #399 <Method boolean Arrays.equals(byte[], byte[])>
	//   64  136:istore          4
			}
			boolean flag;
			boolean flag1;
			if(Arrays.equals(abyte0, digestAttr) || flag3)
	//*  65  138:aload           6
	//*  66  140:aload_0         
	//*  67  141:getfield        #352 <Field byte[] digestAttr>
	//*  68  144:invokestatic    #399 <Method boolean Arrays.equals(byte[], byte[])>
	//*  69  147:ifne            155
	//*  70  150:iload           4
	//*  71  152:ifeq            217
				flag = true;
	//   72  155:iconst_1        
	//   73  156:istore_1        
			else
	//*  74  157:aload_0         
	//*  75  158:aload_0         
	//*  76  159:getfield        #341 <Field byte[] sigAttr>
	//*  77  162:invokespecial   #881 <Method boolean verifySigAttributes(byte[])>
	//*  78  165:ifne            179
	//*  79  168:aload_0         
	//*  80  169:aload_0         
	//*  81  170:getfield        #348 <Field byte[] sigAttrDer>
	//*  82  173:invokespecial   #881 <Method boolean verifySigAttributes(byte[])>
	//*  83  176:ifeq            222
	//*  84  179:iconst_1        
	//*  85  180:istore_2        
	//*  86  181:iload           5
	//*  87  183:istore          4
	//*  88  185:iload_1         
	//*  89  186:ifeq            208
	//*  90  189:iload           5
	//*  91  191:istore          4
	//*  92  193:iload_2         
	//*  93  194:ifeq            208
	//*  94  197:iload           5
	//*  95  199:istore          4
	//*  96  201:iload_3         
	//*  97  202:ifeq            208
	//*  98  205:iconst_1        
	//*  99  206:istore          4
	//* 100  208:aload_0         
	//* 101  209:iload           4
	//* 102  211:putfield        #863 <Field boolean verifyResult>
	//* 103  214:goto            56
				flag = false;
	//  104  217:iconst_0        
	//  105  218:istore_1        
			if(verifySigAttributes(sigAttr) || verifySigAttributes(sigAttrDer))
				flag1 = true;
			else
	//* 106  219:goto            157
				flag1 = false;
	//  107  222:iconst_0        
	//  108  223:istore_2        
			flag3 = flag4;
			if(flag)
			{
				flag3 = flag4;
				if(flag1)
				{
					flag3 = flag4;
					if(flag2)
						flag3 = true;
				}
			}
			verifyResult = flag3;
		} else
	//* 109  224:goto            181
		{
			if(RSAdata != null)
	//* 110  227:aload_0         
	//* 111  228:getfield        #135 <Field byte[] RSAdata>
	//* 112  231:ifnull          248
				sig.update(messageDigest.digest());
	//  113  234:aload_0         
	//  114  235:getfield        #150 <Field Signature sig>
	//  115  238:aload_0         
	//  116  239:getfield        #144 <Field MessageDigest messageDigest>
	//  117  242:invokevirtual   #719 <Method byte[] MessageDigest.digest()>
	//  118  245:invokevirtual   #652 <Method void Signature.update(byte[])>
			verifyResult = sig.verify(digest);
	//  119  248:aload_0         
	//  120  249:aload_0         
	//  121  250:getfield        #150 <Field Signature sig>
	//  122  253:aload_0         
	//  123  254:getfield        #431 <Field byte[] digest>
	//  124  257:invokevirtual   #654 <Method boolean Signature.verify(byte[])>
	//  125  260:putfield        #863 <Field boolean verifyResult>
		}
		verified = true;
		return verifyResult;
	//* 126  263:goto            56
	}

	public boolean verifyTimestampImprint()
		throws GeneralSecurityException
	{
		if(timeStampToken == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #466 <Field TimeStampToken timeStampToken>
	//*   2    4:ifnonnull       9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			Object obj = ((Object) (timeStampToken.getTimeStampInfo()));
	//    5    9:aload_0         
	//    6   10:getfield        #466 <Field TimeStampToken timeStampToken>
	//    7   13:invokevirtual   #470 <Method TimeStampTokenInfo TimeStampToken.getTimeStampInfo()>
	//    8   16:astore_2        
			MessageImprint messageimprint = ((TimeStampTokenInfo) (obj)).toASN1Structure().getMessageImprint();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #867 <Method TSTInfo TimeStampTokenInfo.toASN1Structure()>
	//   11   21:invokevirtual   #873 <Method MessageImprint TSTInfo.getMessageImprint()>
	//   12   24:astore_1        
			obj = ((Object) (((TimeStampTokenInfo) (obj)).getMessageImprintAlgOID().getId()));
	//   13   25:aload_2         
	//   14   26:invokevirtual   #475 <Method ASN1ObjectIdentifier TimeStampTokenInfo.getMessageImprintAlgOID()>
	//   15   29:invokevirtual   #215 <Method String ASN1ObjectIdentifier.getId()>
	//   16   32:astore_2        
			return Arrays.equals((new BouncyCastleDigest()).getMessageDigest(DigestAlgorithms.getDigest(((String) (obj)))).digest(digest), messageimprint.getHashedMessage());
	//   17   33:new             #378 <Class BouncyCastleDigest>
	//   18   36:dup             
	//   19   37:invokespecial   #379 <Method void BouncyCastleDigest()>
	//   20   40:aload_2         
	//   21   41:invokestatic    #424 <Method String DigestAlgorithms.getDigest(String)>
	//   22   44:invokevirtual   #384 <Method MessageDigest BouncyCastleDigest.getMessageDigest(String)>
	//   23   47:aload_0         
	//   24   48:getfield        #431 <Field byte[] digest>
	//   25   51:invokevirtual   #389 <Method byte[] MessageDigest.digest(byte[])>
	//   26   54:aload_1         
	//   27   55:invokevirtual   #878 <Method byte[] MessageImprint.getHashedMessage()>
	//   28   58:invokestatic    #399 <Method boolean Arrays.equals(byte[], byte[])>
	//   29   61:ireturn         
		}
	}

	private byte RSAdata[];
	private BasicOCSPResp basicResp;
	private Collection certs;
	private Collection crls;
	private byte digest[];
	private String digestAlgorithmOid;
	private byte digestAttr[];
	private String digestEncryptionAlgorithmOid;
	private Set digestalgos;
	private MessageDigest encContDigest;
	private byte externalDigest[];
	private byte externalRSAdata[];
	private PdfName filterSubtype;
	private ExternalDigest interfaceDigest;
	private boolean isCades;
	private boolean isTsp;
	private String location;
	private MessageDigest messageDigest;
	private String provider;
	private String reason;
	private Signature sig;
	private byte sigAttr[];
	private byte sigAttrDer[];
	private X509Certificate signCert;
	private Collection signCerts;
	private Calendar signDate;
	private String signName;
	private SignaturePolicyIdentifier signaturePolicyIdentifier;
	private int signerversion;
	private TimeStampToken timeStampToken;
	private boolean verified;
	private boolean verifyResult;
	private int version;
}
