// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.*;
import java.security.*;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.crypto.*;
import org.spongycastle.asn1.*;
import org.spongycastle.asn1.cms.*;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfPublicKeyRecipient, PdfArray, PdfLiteral, StringUtils

public class PdfPublicKeySecurityHandler
{

	public PdfPublicKeySecurityHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		recipients = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #20  <Field ArrayList recipients>
		seed = new byte[20];
	//    5    9:aload_0         
	//    6   10:bipush          20
	//    7   12:newarray        byte[]
	//    8   14:putfield        #22  <Field byte[] seed>
		try
		{
			KeyGenerator keygenerator = KeyGenerator.getInstance("AES");
	//    9   17:ldc1            #24  <String "AES">
	//   10   19:invokestatic    #30  <Method KeyGenerator KeyGenerator.getInstance(String)>
	//   11   22:astore_1        
			keygenerator.init(192, new SecureRandom());
	//   12   23:aload_1         
	//   13   24:sipush          192
	//   14   27:new             #32  <Class SecureRandom>
	//   15   30:dup             
	//   16   31:invokespecial   #33  <Method void SecureRandom()>
	//   17   34:invokevirtual   #37  <Method void KeyGenerator.init(int, SecureRandom)>
			System.arraycopy(((Object) (keygenerator.generateKey().getEncoded())), 0, ((Object) (seed)), 0, 20);
	//   18   37:aload_1         
	//   19   38:invokevirtual   #41  <Method SecretKey KeyGenerator.generateKey()>
	//   20   41:invokeinterface #47  <Method byte[] SecretKey.getEncoded()>
	//   21   46:iconst_0        
	//   22   47:aload_0         
	//   23   48:getfield        #22  <Field byte[] seed>
	//   24   51:iconst_0        
	//   25   52:bipush          20
	//   26   54:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
	//*  27   57:aload_0         
	//*  28   58:new             #55  <Class ArrayList>
	//*  29   61:dup             
	//*  30   62:invokespecial   #56  <Method void ArrayList()>
	//*  31   65:putfield        #20  <Field ArrayList recipients>
	//*  32   68:return          
		catch(NoSuchAlgorithmException nosuchalgorithmexception)
	//*  33   69:astore_1        
		{
			seed = SecureRandom.getSeed(20);
	//   34   70:aload_0         
	//   35   71:bipush          20
	//   36   73:invokestatic    #60  <Method byte[] SecureRandom.getSeed(int)>
	//   37   76:putfield        #22  <Field byte[] seed>
		}
		recipients = new ArrayList();
	//*  38   79:goto            57
	}

	private KeyTransRecipientInfo computeRecipientInfo(X509Certificate x509certificate, byte abyte0[])
		throws GeneralSecurityException, IOException
	{
		Object obj = ((Object) (TBSCertificateStructure.getInstance(((Object) ((new ASN1InputStream(((java.io.InputStream) (new ByteArrayInputStream(x509certificate.getTBSCertificate()))))).readObject())))));
	//    0    0:new             #71  <Class ASN1InputStream>
	//    1    3:dup             
	//    2    4:new             #73  <Class ByteArrayInputStream>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokevirtual   #78  <Method byte[] X509Certificate.getTBSCertificate()>
	//    6   12:invokespecial   #81  <Method void ByteArrayInputStream(byte[])>
	//    7   15:invokespecial   #84  <Method void ASN1InputStream(java.io.InputStream)>
	//    8   18:invokevirtual   #88  <Method ASN1Primitive ASN1InputStream.readObject()>
	//    9   21:invokestatic    #93  <Method TBSCertificateStructure TBSCertificateStructure.getInstance(Object)>
	//   10   24:astore          4
		AlgorithmIdentifier algorithmidentifier = ((TBSCertificateStructure) (obj)).getSubjectPublicKeyInfo().getAlgorithm();
	//   11   26:aload           4
	//   12   28:invokevirtual   #97  <Method SubjectPublicKeyInfo TBSCertificateStructure.getSubjectPublicKeyInfo()>
	//   13   31:invokevirtual   #103 <Method AlgorithmIdentifier SubjectPublicKeyInfo.getAlgorithm()>
	//   14   34:astore_3        
		obj = ((Object) (new IssuerAndSerialNumber(((TBSCertificateStructure) (obj)).getIssuer(), ((TBSCertificateStructure) (obj)).getSerialNumber().getValue())));
	//   15   35:new             #105 <Class IssuerAndSerialNumber>
	//   16   38:dup             
	//   17   39:aload           4
	//   18   41:invokevirtual   #109 <Method org.spongycastle.asn1.x500.X500Name TBSCertificateStructure.getIssuer()>
	//   19   44:aload           4
	//   20   46:invokevirtual   #113 <Method ASN1Integer TBSCertificateStructure.getSerialNumber()>
	//   21   49:invokevirtual   #119 <Method java.math.BigInteger ASN1Integer.getValue()>
	//   22   52:invokespecial   #122 <Method void IssuerAndSerialNumber(org.spongycastle.asn1.x500.X500Name, java.math.BigInteger)>
	//   23   55:astore          4
		Cipher cipher = Cipher.getInstance(algorithmidentifier.getAlgorithm().getId());
	//   24   57:aload_3         
	//   25   58:invokevirtual   #127 <Method ASN1ObjectIdentifier AlgorithmIdentifier.getAlgorithm()>
	//   26   61:invokevirtual   #133 <Method String ASN1ObjectIdentifier.getId()>
	//   27   64:invokestatic    #138 <Method Cipher Cipher.getInstance(String)>
	//   28   67:astore          5
		try
		{
			cipher.init(1, ((java.security.cert.Certificate) (x509certificate)));
	//   29   69:aload           5
	//   30   71:iconst_1        
	//   31   72:aload_1         
	//   32   73:invokevirtual   #141 <Method void Cipher.init(int, java.security.cert.Certificate)>
		}
	//*  33   76:new             #143 <Class DEROctetString>
	//*  34   79:dup             
	//*  35   80:aload           5
	//*  36   82:aload_2         
	//*  37   83:invokevirtual   #147 <Method byte[] Cipher.doFinal(byte[])>
	//*  38   86:invokespecial   #148 <Method void DEROctetString(byte[])>
	//*  39   89:astore_1        
	//*  40   90:new             #150 <Class KeyTransRecipientInfo>
	//*  41   93:dup             
	//*  42   94:new             #152 <Class RecipientIdentifier>
	//*  43   97:dup             
	//*  44   98:aload           4
	//*  45  100:invokespecial   #155 <Method void RecipientIdentifier(IssuerAndSerialNumber)>
	//*  46  103:aload_3         
	//*  47  104:aload_1         
	//*  48  105:invokespecial   #158 <Method void KeyTransRecipientInfo(RecipientIdentifier, AlgorithmIdentifier, org.spongycastle.asn1.ASN1OctetString)>
	//*  49  108:areturn         
		catch(InvalidKeyException invalidkeyexception)
	//*  50  109:astore          6
		{
			cipher.init(1, ((java.security.Key) (x509certificate.getPublicKey())));
	//   51  111:aload           5
	//   52  113:iconst_1        
	//   53  114:aload_1         
	//   54  115:invokevirtual   #162 <Method java.security.PublicKey X509Certificate.getPublicKey()>
	//   55  118:invokevirtual   #165 <Method void Cipher.init(int, java.security.Key)>
		}
		x509certificate = ((X509Certificate) (new DEROctetString(cipher.doFinal(abyte0))));
		return new KeyTransRecipientInfo(new RecipientIdentifier(((IssuerAndSerialNumber) (obj))), algorithmidentifier, ((org.spongycastle.asn1.ASN1OctetString) (x509certificate)));
	//*  56  121:goto            76
	}

	private ASN1Primitive createDERForRecipient(byte abyte0[], X509Certificate x509certificate)
		throws IOException, GeneralSecurityException
	{
		AlgorithmParameters algorithmparameters = AlgorithmParameterGenerator.getInstance("1.2.840.113549.3.2").generateParameters();
	//    0    0:ldc1            #170 <String "1.2.840.113549.3.2">
	//    1    2:invokestatic    #175 <Method AlgorithmParameterGenerator AlgorithmParameterGenerator.getInstance(String)>
	//    2    5:invokevirtual   #179 <Method AlgorithmParameters AlgorithmParameterGenerator.generateParameters()>
	//    3    8:astore          4
		Object obj = ((Object) ((new ASN1InputStream(((java.io.InputStream) (new ByteArrayInputStream(algorithmparameters.getEncoded("ASN.1")))))).readObject()));
	//    4   10:new             #71  <Class ASN1InputStream>
	//    5   13:dup             
	//    6   14:new             #73  <Class ByteArrayInputStream>
	//    7   17:dup             
	//    8   18:aload           4
	//    9   20:ldc1            #181 <String "ASN.1">
	//   10   22:invokevirtual   #186 <Method byte[] AlgorithmParameters.getEncoded(String)>
	//   11   25:invokespecial   #81  <Method void ByteArrayInputStream(byte[])>
	//   12   28:invokespecial   #84  <Method void ASN1InputStream(java.io.InputStream)>
	//   13   31:invokevirtual   #88  <Method ASN1Primitive ASN1InputStream.readObject()>
	//   14   34:astore_3        
		Object obj1 = ((Object) (KeyGenerator.getInstance("1.2.840.113549.3.2")));
	//   15   35:ldc1            #170 <String "1.2.840.113549.3.2">
	//   16   37:invokestatic    #30  <Method KeyGenerator KeyGenerator.getInstance(String)>
	//   17   40:astore          5
		((KeyGenerator) (obj1)).init(128);
	//   18   42:aload           5
	//   19   44:sipush          128
	//   20   47:invokevirtual   #189 <Method void KeyGenerator.init(int)>
		obj1 = ((Object) (((KeyGenerator) (obj1)).generateKey()));
	//   21   50:aload           5
	//   22   52:invokevirtual   #41  <Method SecretKey KeyGenerator.generateKey()>
	//   23   55:astore          5
		Cipher cipher = Cipher.getInstance("1.2.840.113549.3.2");
	//   24   57:ldc1            #170 <String "1.2.840.113549.3.2">
	//   25   59:invokestatic    #138 <Method Cipher Cipher.getInstance(String)>
	//   26   62:astore          6
		cipher.init(1, ((java.security.Key) (obj1)), algorithmparameters);
	//   27   64:aload           6
	//   28   66:iconst_1        
	//   29   67:aload           5
	//   30   69:aload           4
	//   31   71:invokevirtual   #192 <Method void Cipher.init(int, java.security.Key, AlgorithmParameters)>
		abyte0 = ((byte []) (new DEROctetString(cipher.doFinal(abyte0))));
	//   32   74:new             #143 <Class DEROctetString>
	//   33   77:dup             
	//   34   78:aload           6
	//   35   80:aload_1         
	//   36   81:invokevirtual   #147 <Method byte[] Cipher.doFinal(byte[])>
	//   37   84:invokespecial   #148 <Method void DEROctetString(byte[])>
	//   38   87:astore_1        
		x509certificate = ((X509Certificate) (new DERSet(((org.spongycastle.asn1.ASN1Encodable) (new RecipientInfo(computeRecipientInfo(x509certificate, ((SecretKey) (obj1)).getEncoded())))))));
	//   39   88:new             #194 <Class DERSet>
	//   40   91:dup             
	//   41   92:new             #196 <Class RecipientInfo>
	//   42   95:dup             
	//   43   96:aload_0         
	//   44   97:aload_2         
	//   45   98:aload           5
	//   46  100:invokeinterface #47  <Method byte[] SecretKey.getEncoded()>
	//   47  105:invokespecial   #198 <Method KeyTransRecipientInfo computeRecipientInfo(X509Certificate, byte[])>
	//   48  108:invokespecial   #201 <Method void RecipientInfo(KeyTransRecipientInfo)>
	//   49  111:invokespecial   #204 <Method void DERSet(org.spongycastle.asn1.ASN1Encodable)>
	//   50  114:astore_2        
		obj = ((Object) (new AlgorithmIdentifier(new ASN1ObjectIdentifier("1.2.840.113549.3.2"), ((org.spongycastle.asn1.ASN1Encodable) (obj)))));
	//   51  115:new             #124 <Class AlgorithmIdentifier>
	//   52  118:dup             
	//   53  119:new             #129 <Class ASN1ObjectIdentifier>
	//   54  122:dup             
	//   55  123:ldc1            #170 <String "1.2.840.113549.3.2">
	//   56  125:invokespecial   #207 <Method void ASN1ObjectIdentifier(String)>
	//   57  128:aload_3         
	//   58  129:invokespecial   #210 <Method void AlgorithmIdentifier(ASN1ObjectIdentifier, org.spongycastle.asn1.ASN1Encodable)>
	//   59  132:astore_3        
		abyte0 = ((byte []) (new EnvelopedData(((org.spongycastle.asn1.cms.OriginatorInfo) (null)), ((org.spongycastle.asn1.ASN1Set) (x509certificate)), new EncryptedContentInfo(PKCSObjectIdentifiers.data, ((AlgorithmIdentifier) (obj)), ((org.spongycastle.asn1.ASN1OctetString) (abyte0))), ((org.spongycastle.asn1.ASN1Set) (null)))));
	//   60  133:new             #212 <Class EnvelopedData>
	//   61  136:dup             
	//   62  137:aconst_null     
	//   63  138:aload_2         
	//   64  139:new             #214 <Class EncryptedContentInfo>
	//   65  142:dup             
	//   66  143:getstatic       #220 <Field ASN1ObjectIdentifier PKCSObjectIdentifiers.data>
	//   67  146:aload_3         
	//   68  147:aload_1         
	//   69  148:invokespecial   #223 <Method void EncryptedContentInfo(ASN1ObjectIdentifier, AlgorithmIdentifier, org.spongycastle.asn1.ASN1OctetString)>
	//   70  151:aconst_null     
	//   71  152:invokespecial   #226 <Method void EnvelopedData(org.spongycastle.asn1.cms.OriginatorInfo, org.spongycastle.asn1.ASN1Set, EncryptedContentInfo, org.spongycastle.asn1.ASN1Set)>
	//   72  155:astore_1        
		return (new ContentInfo(PKCSObjectIdentifiers.envelopedData, ((org.spongycastle.asn1.ASN1Encodable) (abyte0)))).toASN1Primitive();
	//   73  156:new             #228 <Class ContentInfo>
	//   74  159:dup             
	//   75  160:getstatic       #231 <Field ASN1ObjectIdentifier PKCSObjectIdentifiers.envelopedData>
	//   76  163:aload_1         
	//   77  164:invokespecial   #232 <Method void ContentInfo(ASN1ObjectIdentifier, org.spongycastle.asn1.ASN1Encodable)>
	//   78  167:invokevirtual   #235 <Method ASN1Primitive ContentInfo.toASN1Primitive()>
	//   79  170:areturn         
	}

	public void addRecipient(PdfPublicKeyRecipient pdfpublickeyrecipient)
	{
		recipients.add(((Object) (pdfpublickeyrecipient)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ArrayList recipients>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #241 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public byte[] getEncodedRecipient(int i)
		throws IOException, GeneralSecurityException
	{
		PdfPublicKeyRecipient pdfpublickeyrecipient = (PdfPublicKeyRecipient)recipients.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ArrayList recipients>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #246 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #248 <Class PdfPublicKeyRecipient>
	//    5   11:astore          7
		byte abyte0[] = pdfpublickeyrecipient.getCms();
	//    6   13:aload           7
	//    7   15:invokevirtual   #251 <Method byte[] PdfPublicKeyRecipient.getCms()>
	//    8   18:astore          8
		if(abyte0 != null)
	//*   9   20:aload           8
	//*  10   22:ifnull          28
			return abyte0;
	//   11   25:aload           8
	//   12   27:areturn         
		Object obj = ((Object) (pdfpublickeyrecipient.getCertificate()));
	//   13   28:aload           7
	//   14   30:invokevirtual   #255 <Method java.security.cert.Certificate PdfPublicKeyRecipient.getCertificate()>
	//   15   33:astore          8
		int j = pdfpublickeyrecipient.getPermission();
	//   16   35:aload           7
	//   17   37:invokevirtual   #259 <Method int PdfPublicKeyRecipient.getPermission()>
	//   18   40:istore          6
		byte byte0;
		byte byte1;
		byte byte2;
		byte byte3;
		byte abyte1[];
		ByteArrayOutputStream bytearrayoutputstream;
		if(3 == 3)
	//*  19   42:iconst_3        
	//*  20   43:iconst_3        
	//*  21   44:icmpne          182
			i = -3904;
	//   22   47:sipush          -3904
	//   23   50:istore_1        
		else
	//*  24   51:iload           6
	//*  25   53:iload_1         
	//*  26   54:ior             
	//*  27   55:bipush          -4
	//*  28   57:iand            
	//*  29   58:iconst_1        
	//*  30   59:iadd            
	//*  31   60:istore_1        
	//*  32   61:bipush          24
	//*  33   63:newarray        byte[]
	//*  34   65:astore          9
	//*  35   67:iload_1         
	//*  36   68:int2byte        
	//*  37   69:istore_2        
	//*  38   70:iload_1         
	//*  39   71:bipush          8
	//*  40   73:ishr            
	//*  41   74:int2byte        
	//*  42   75:istore_3        
	//*  43   76:iload_1         
	//*  44   77:bipush          16
	//*  45   79:ishr            
	//*  46   80:int2byte        
	//*  47   81:istore          4
	//*  48   83:iload_1         
	//*  49   84:bipush          24
	//*  50   86:ishr            
	//*  51   87:int2byte        
	//*  52   88:istore          5
	//*  53   90:aload_0         
	//*  54   91:getfield        #22  <Field byte[] seed>
	//*  55   94:iconst_0        
	//*  56   95:aload           9
	//*  57   97:iconst_0        
	//*  58   98:bipush          20
	//*  59  100:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  60  103:aload           9
	//*  61  105:bipush          20
	//*  62  107:iload           5
	//*  63  109:bastore         
	//*  64  110:aload           9
	//*  65  112:bipush          21
	//*  66  114:iload           4
	//*  67  116:bastore         
	//*  68  117:aload           9
	//*  69  119:bipush          22
	//*  70  121:iload_3         
	//*  71  122:bastore         
	//*  72  123:aload           9
	//*  73  125:bipush          23
	//*  74  127:iload_2         
	//*  75  128:bastore         
	//*  76  129:aload_0         
	//*  77  130:aload           9
	//*  78  132:aload           8
	//*  79  134:checkcast       #75  <Class X509Certificate>
	//*  80  137:invokespecial   #261 <Method ASN1Primitive createDERForRecipient(byte[], X509Certificate)>
	//*  81  140:astore          8
	//*  82  142:new             #263 <Class ByteArrayOutputStream>
	//*  83  145:dup             
	//*  84  146:invokespecial   #264 <Method void ByteArrayOutputStream()>
	//*  85  149:astore          9
	//*  86  151:new             #266 <Class DEROutputStream>
	//*  87  154:dup             
	//*  88  155:aload           9
	//*  89  157:invokespecial   #269 <Method void DEROutputStream(java.io.OutputStream)>
	//*  90  160:aload           8
	//*  91  162:invokevirtual   #272 <Method void DEROutputStream.writeObject(org.spongycastle.asn1.ASN1Encodable)>
	//*  92  165:aload           9
	//*  93  167:invokevirtual   #275 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  94  170:astore          8
	//*  95  172:aload           7
	//*  96  174:aload           8
	//*  97  176:invokevirtual   #278 <Method void PdfPublicKeyRecipient.setCms(byte[])>
	//*  98  179:aload           8
	//*  99  181:areturn         
			i = -64;
	//  100  182:bipush          -64
	//  101  184:istore_1        
		i = ((j | i) & -4) + 1;
		abyte1 = new byte[24];
		byte0 = (byte)i;
		byte1 = (byte)(i >> 8);
		byte2 = (byte)(i >> 16);
		byte3 = (byte)(i >> 24);
		System.arraycopy(((Object) (seed)), 0, ((Object) (abyte1)), 0, 20);
		abyte1[20] = byte3;
		abyte1[21] = byte2;
		abyte1[22] = byte1;
		abyte1[23] = byte0;
		obj = ((Object) (createDERForRecipient(abyte1, (X509Certificate)obj)));
		bytearrayoutputstream = new ByteArrayOutputStream();
		(new DEROutputStream(((java.io.OutputStream) (bytearrayoutputstream)))).writeObject(((org.spongycastle.asn1.ASN1Encodable) (obj)));
		obj = ((Object) (bytearrayoutputstream.toByteArray()));
		pdfpublickeyrecipient.setCms(((byte []) (obj)));
		return ((byte []) (obj));
	//* 102  185:goto            51
	}

	public PdfArray getEncodedRecipients()
		throws IOException, GeneralSecurityException
	{
		Object obj = ((Object) (new PdfArray()));
	//    0    0:new             #282 <Class PdfArray>
	//    1    3:dup             
	//    2    4:invokespecial   #283 <Method void PdfArray()>
	//    3    7:astore_2        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		while(i < recipients.size()) 
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #20  <Field ArrayList recipients>
	//*   9   15:invokevirtual   #286 <Method int ArrayList.size()>
	//*  10   18:icmpge          60
		{
			try
			{
				((PdfArray) (obj)).add(((PdfObject) (new PdfLiteral(StringUtils.escapeString(getEncodedRecipient(i))))));
	//   11   21:aload_2         
	//   12   22:new             #288 <Class PdfLiteral>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:iload_1         
	//   16   28:invokevirtual   #290 <Method byte[] getEncodedRecipient(int)>
	//   17   31:invokestatic    #295 <Method byte[] StringUtils.escapeString(byte[])>
	//   18   34:invokespecial   #296 <Method void PdfLiteral(byte[])>
	//   19   37:invokevirtual   #299 <Method boolean PdfArray.add(PdfObject)>
	//   20   40:pop             
			}
	//*  21   41:iload_1         
	//*  22   42:iconst_1        
	//*  23   43:iadd            
	//*  24   44:istore_1        
	//*  25   45:goto            10
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  26   48:astore_2        
			{
				obj = null;
	//   27   49:aconst_null     
	//   28   50:astore_2        
			}
	//*  29   51:goto            41
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  30   54:astore_2        
			{
				obj = null;
	//   31   55:aconst_null     
	//   32   56:astore_2        
			}
			i++;
		}
	//*  33   57:goto            41
		return ((PdfArray) (obj));
	//   34   60:aload_2         
	//   35   61:areturn         
	}

	public int getRecipientsSize()
	{
		return recipients.size();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ArrayList recipients>
	//    2    4:invokevirtual   #286 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	protected byte[] getSeed()
	{
		return (byte[])((byte []) (seed)).clone();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field byte[] seed>
	//    2    4:invokevirtual   #305 <Method Object _5B_B.clone()>
	//    3    7:checkcast       #301 <Class byte[]>
	//    4   10:areturn         
	}

	static final int SEED_LENGTH = 20;
	private ArrayList recipients;
	private byte seed[];
}
