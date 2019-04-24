// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.io.StreamUtil;
import com.itextpdf.text.log.*;
import com.itextpdf.text.pdf.PdfEncryption;
import java.io.*;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.Security;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.ocsp.OCSPObjectIdentifiers;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.cert.jcajce.JcaX509CertificateHolder;
import org.spongycastle.cert.ocsp.*;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.ocsp.RevokedStatus;
import org.spongycastle.operator.DigestCalculatorProvider;
import org.spongycastle.operator.OperatorException;
import org.spongycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			OcspClient, CertificateUtil, OCSPVerifier

public class OcspClientBouncyCastle
	implements OcspClient
{

	public OcspClientBouncyCastle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		verifier = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #27  <Field OCSPVerifier verifier>
	//    5    9:return          
	}

	public OcspClientBouncyCastle(OCSPVerifier ocspverifier)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		verifier = ocspverifier;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field OCSPVerifier verifier>
	//    5    9:return          
	}

	private static OCSPReq generateOCSPRequest(X509Certificate x509certificate, BigInteger biginteger)
		throws OCSPException, IOException, OperatorException, CertificateEncodingException
	{
		Security.addProvider(((java.security.Provider) (new BouncyCastleProvider())));
	//    0    0:new             #41  <Class BouncyCastleProvider>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void BouncyCastleProvider()>
	//    3    7:invokestatic    #48  <Method int Security.addProvider(java.security.Provider)>
	//    4   10:pop             
		x509certificate = ((X509Certificate) (new CertificateID((new JcaDigestCalculatorProviderBuilder()).build().get(CertificateID.HASH_SHA1), ((org.spongycastle.cert.X509CertificateHolder) (new JcaX509CertificateHolder(x509certificate))), biginteger)));
	//    5   11:new             #50  <Class CertificateID>
	//    6   14:dup             
	//    7   15:new             #52  <Class JcaDigestCalculatorProviderBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #53  <Method void JcaDigestCalculatorProviderBuilder()>
	//   10   22:invokevirtual   #57  <Method DigestCalculatorProvider JcaDigestCalculatorProviderBuilder.build()>
	//   11   25:getstatic       #61  <Field org.spongycastle.asn1.x509.AlgorithmIdentifier CertificateID.HASH_SHA1>
	//   12   28:invokeinterface #67  <Method org.spongycastle.operator.DigestCalculator DigestCalculatorProvider.get(org.spongycastle.asn1.x509.AlgorithmIdentifier)>
	//   13   33:new             #69  <Class JcaX509CertificateHolder>
	//   14   36:dup             
	//   15   37:aload_0         
	//   16   38:invokespecial   #72  <Method void JcaX509CertificateHolder(X509Certificate)>
	//   17   41:aload_1         
	//   18   42:invokespecial   #75  <Method void CertificateID(org.spongycastle.operator.DigestCalculator, org.spongycastle.cert.X509CertificateHolder, BigInteger)>
	//   19   45:astore_0        
		biginteger = ((BigInteger) (new OCSPReqBuilder()));
	//   20   46:new             #77  <Class OCSPReqBuilder>
	//   21   49:dup             
	//   22   50:invokespecial   #78  <Method void OCSPReqBuilder()>
	//   23   53:astore_1        
		((OCSPReqBuilder) (biginteger)).addRequest(((CertificateID) (x509certificate)));
	//   24   54:aload_1         
	//   25   55:aload_0         
	//   26   56:invokevirtual   #82  <Method OCSPReqBuilder OCSPReqBuilder.addRequest(CertificateID)>
	//   27   59:pop             
		((OCSPReqBuilder) (biginteger)).setRequestExtensions(new Extensions(new Extension[] {
			new Extension(OCSPObjectIdentifiers.id_pkix_ocsp_nonce, false, ((org.spongycastle.asn1.ASN1OctetString) (new DEROctetString((new DEROctetString(PdfEncryption.createDocumentId())).getEncoded()))))
		}));
	//   28   60:aload_1         
	//   29   61:new             #84  <Class Extensions>
	//   30   64:dup             
	//   31   65:iconst_1        
	//   32   66:anewarray       Extension[]
	//   33   69:dup             
	//   34   70:iconst_0        
	//   35   71:new             #86  <Class Extension>
	//   36   74:dup             
	//   37   75:getstatic       #92  <Field org.spongycastle.asn1.ASN1ObjectIdentifier OCSPObjectIdentifiers.id_pkix_ocsp_nonce>
	//   38   78:iconst_0        
	//   39   79:new             #94  <Class DEROctetString>
	//   40   82:dup             
	//   41   83:new             #94  <Class DEROctetString>
	//   42   86:dup             
	//   43   87:invokestatic    #100 <Method byte[] PdfEncryption.createDocumentId()>
	//   44   90:invokespecial   #103 <Method void DEROctetString(byte[])>
	//   45   93:invokevirtual   #106 <Method byte[] DEROctetString.getEncoded()>
	//   46   96:invokespecial   #103 <Method void DEROctetString(byte[])>
	//   47   99:invokespecial   #109 <Method void Extension(org.spongycastle.asn1.ASN1ObjectIdentifier, boolean, org.spongycastle.asn1.ASN1OctetString)>
	//   48  102:aastore         
	//   49  103:invokespecial   #112 <Method void Extensions(Extension[])>
	//   50  106:invokevirtual   #116 <Method OCSPReqBuilder OCSPReqBuilder.setRequestExtensions(Extensions)>
	//   51  109:pop             
		return ((OCSPReqBuilder) (biginteger)).build();
	//   52  110:aload_1         
	//   53  111:invokevirtual   #119 <Method OCSPReq OCSPReqBuilder.build()>
	//   54  114:areturn         
	}

	private OCSPResp getOcspResponse(X509Certificate x509certificate, X509Certificate x509certificate1, String s)
		throws GeneralSecurityException, OCSPException, IOException, OperatorException
	{
		if(x509certificate != null && x509certificate1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          8
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       10
	//*   4    8:aconst_null     
	//*   5    9:areturn         
		{
			String s1 = s;
	//    6   10:aload_3         
	//    7   11:astore          4
			if(s == null)
	//*   8   13:aload_3         
	//*   9   14:ifnonnull       23
				s1 = CertificateUtil.getOCSPURL(x509certificate);
	//   10   17:aload_1         
	//   11   18:invokestatic    #130 <Method String CertificateUtil.getOCSPURL(X509Certificate)>
	//   12   21:astore          4
			if(s1 != null)
	//*  13   23:aload           4
	//*  14   25:ifnull          8
			{
				LOGGER.info((new StringBuilder()).append("Getting OCSP from ").append(s1).toString());
	//   15   28:getstatic       #20  <Field Logger LOGGER>
	//   16   31:new             #132 <Class StringBuilder>
	//   17   34:dup             
	//   18   35:invokespecial   #133 <Method void StringBuilder()>
	//   19   38:ldc1            #135 <String "Getting OCSP from ">
	//   20   40:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   21   43:aload           4
	//   22   45:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:invokevirtual   #143 <Method String StringBuilder.toString()>
	//   24   51:invokeinterface #149 <Method void Logger.info(String)>
				x509certificate = ((X509Certificate) (generateOCSPRequest(x509certificate1, x509certificate.getSerialNumber()).getEncoded()));
	//   25   56:aload_2         
	//   26   57:aload_1         
	//   27   58:invokevirtual   #155 <Method BigInteger X509Certificate.getSerialNumber()>
	//   28   61:invokestatic    #157 <Method OCSPReq generateOCSPRequest(X509Certificate, BigInteger)>
	//   29   64:invokevirtual   #160 <Method byte[] OCSPReq.getEncoded()>
	//   30   67:astore_1        
				x509certificate1 = ((X509Certificate) ((HttpURLConnection)(new URL(s1)).openConnection()));
	//   31   68:new             #162 <Class URL>
	//   32   71:dup             
	//   33   72:aload           4
	//   34   74:invokespecial   #164 <Method void URL(String)>
	//   35   77:invokevirtual   #168 <Method java.net.URLConnection URL.openConnection()>
	//   36   80:checkcast       #170 <Class HttpURLConnection>
	//   37   83:astore_2        
				((HttpURLConnection) (x509certificate1)).setRequestProperty("Content-Type", "application/ocsp-request");
	//   38   84:aload_2         
	//   39   85:ldc1            #172 <String "Content-Type">
	//   40   87:ldc1            #174 <String "application/ocsp-request">
	//   41   89:invokevirtual   #178 <Method void HttpURLConnection.setRequestProperty(String, String)>
				((HttpURLConnection) (x509certificate1)).setRequestProperty("Accept", "application/ocsp-response");
	//   42   92:aload_2         
	//   43   93:ldc1            #180 <String "Accept">
	//   44   95:ldc1            #182 <String "application/ocsp-response">
	//   45   97:invokevirtual   #178 <Method void HttpURLConnection.setRequestProperty(String, String)>
				((HttpURLConnection) (x509certificate1)).setDoOutput(true);
	//   46  100:aload_2         
	//   47  101:iconst_1        
	//   48  102:invokevirtual   #186 <Method void HttpURLConnection.setDoOutput(boolean)>
				s = ((String) (new DataOutputStream(((java.io.OutputStream) (new BufferedOutputStream(((HttpURLConnection) (x509certificate1)).getOutputStream()))))));
	//   49  105:new             #188 <Class DataOutputStream>
	//   50  108:dup             
	//   51  109:new             #190 <Class BufferedOutputStream>
	//   52  112:dup             
	//   53  113:aload_2         
	//   54  114:invokevirtual   #194 <Method java.io.OutputStream HttpURLConnection.getOutputStream()>
	//   55  117:invokespecial   #197 <Method void BufferedOutputStream(java.io.OutputStream)>
	//   56  120:invokespecial   #198 <Method void DataOutputStream(java.io.OutputStream)>
	//   57  123:astore_3        
				((DataOutputStream) (s)).write(((byte []) (x509certificate)));
	//   58  124:aload_3         
	//   59  125:aload_1         
	//   60  126:invokevirtual   #201 <Method void DataOutputStream.write(byte[])>
				((DataOutputStream) (s)).flush();
	//   61  129:aload_3         
	//   62  130:invokevirtual   #204 <Method void DataOutputStream.flush()>
				((DataOutputStream) (s)).close();
	//   63  133:aload_3         
	//   64  134:invokevirtual   #207 <Method void DataOutputStream.close()>
				if(((HttpURLConnection) (x509certificate1)).getResponseCode() / 100 != 2)
	//*  65  137:aload_2         
	//*  66  138:invokevirtual   #211 <Method int HttpURLConnection.getResponseCode()>
	//*  67  141:bipush          100
	//*  68  143:idiv            
	//*  69  144:iconst_2        
	//*  70  145:icmpeq          165
					throw new IOException(MessageLocalization.getComposedMessage("invalid.http.response.1", ((HttpURLConnection) (x509certificate1)).getResponseCode()));
	//   71  148:new             #35  <Class IOException>
	//   72  151:dup             
	//   73  152:ldc1            #213 <String "invalid.http.response.1">
	//   74  154:aload_2         
	//   75  155:invokevirtual   #211 <Method int HttpURLConnection.getResponseCode()>
	//   76  158:invokestatic    #219 <Method String MessageLocalization.getComposedMessage(String, int)>
	//   77  161:invokespecial   #220 <Method void IOException(String)>
	//   78  164:athrow          
				else
					return new OCSPResp(StreamUtil.inputStreamToArray((InputStream)((HttpURLConnection) (x509certificate1)).getContent()));
	//   79  165:new             #222 <Class OCSPResp>
	//   80  168:dup             
	//   81  169:aload_2         
	//   82  170:invokevirtual   #226 <Method Object HttpURLConnection.getContent()>
	//   83  173:checkcast       #228 <Class InputStream>
	//   84  176:invokestatic    #234 <Method byte[] StreamUtil.inputStreamToArray(InputStream)>
	//   85  179:invokespecial   #235 <Method void OCSPResp(byte[])>
	//   86  182:areturn         
			}
		}
		return null;
	}

	public BasicOCSPResp getBasicOCSPResp(X509Certificate x509certificate, X509Certificate x509certificate1, String s)
	{
		x509certificate = ((X509Certificate) (getOcspResponse(x509certificate, x509certificate1, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #241 <Method OCSPResp getOcspResponse(X509Certificate, X509Certificate, String)>
	//    5    7:astore_1        
		if(x509certificate == null)
	//*   6    8:aload_1         
	//*   7    9:ifnonnull       14
			return null;
	//    8   12:aconst_null     
	//    9   13:areturn         
		if(((OCSPResp) (x509certificate)).getStatus() != 0)
	//*  10   14:aload_1         
	//*  11   15:invokevirtual   #244 <Method int OCSPResp.getStatus()>
	//*  12   18:ifeq            23
			return null;
	//   13   21:aconst_null     
	//   14   22:areturn         
		s = ((String) ((BasicOCSPResp)((OCSPResp) (x509certificate)).getResponseObject()));
	//   15   23:aload_1         
	//   16   24:invokevirtual   #247 <Method Object OCSPResp.getResponseObject()>
	//   17   27:checkcast       #249 <Class BasicOCSPResp>
	//   18   30:astore_3        
		x509certificate = ((X509Certificate) (s));
	//   19   31:aload_3         
	//   20   32:astore_1        
		if(verifier == null)
			break MISSING_BLOCK_LABEL_80;
	//   21   33:aload_0         
	//   22   34:getfield        #27  <Field OCSPVerifier verifier>
	//   23   37:ifnull          80
		verifier.isValidResponse(((BasicOCSPResp) (s)), x509certificate1);
	//   24   40:aload_0         
	//   25   41:getfield        #27  <Field OCSPVerifier verifier>
	//   26   44:aload_3         
	//   27   45:aload_2         
	//   28   46:invokevirtual   #255 <Method void OCSPVerifier.isValidResponse(BasicOCSPResp, X509Certificate)>
		return ((BasicOCSPResp) (s));
	//   29   49:aload_3         
	//   30   50:areturn         
		x509certificate;
	//   31   51:astore_1        
		if(LOGGER.isLogging(Level.ERROR))
	//*  32   52:getstatic       #20  <Field Logger LOGGER>
	//*  33   55:getstatic       #261 <Field Level Level.ERROR>
	//*  34   58:invokeinterface #265 <Method boolean Logger.isLogging(Level)>
	//*  35   63:ifeq            78
			LOGGER.error(((Exception) (x509certificate)).getMessage());
	//   36   66:getstatic       #20  <Field Logger LOGGER>
	//   37   69:aload_1         
	//   38   70:invokevirtual   #268 <Method String Exception.getMessage()>
	//   39   73:invokeinterface #271 <Method void Logger.error(String)>
		x509certificate = null;
	//   40   78:aconst_null     
	//   41   79:astore_1        
		return ((BasicOCSPResp) (x509certificate));
	//   42   80:aload_1         
	//   43   81:areturn         
	}

	public byte[] getEncoded(X509Certificate x509certificate, X509Certificate x509certificate1, String s)
	{
		x509certificate = ((X509Certificate) (getBasicOCSPResp(x509certificate, x509certificate1, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #274 <Method BasicOCSPResp getBasicOCSPResp(X509Certificate, X509Certificate, String)>
	//    5    7:astore_1        
label0:
		{
			if(x509certificate != null)
	//*   6    8:aload_1         
	//*   7    9:ifnull          94
				try
				{
					x509certificate1 = ((X509Certificate) (((BasicOCSPResp) (x509certificate)).getResponses()));
	//    8   12:aload_1         
	//    9   13:invokevirtual   #278 <Method SingleResp[] BasicOCSPResp.getResponses()>
	//   10   16:astore_2        
					if(x509certificate1.length == 1)
	//*  11   17:aload_2         
	//*  12   18:arraylength     
	//*  13   19:iconst_1        
	//*  14   20:icmpne          94
					{
						x509certificate1 = ((X509Certificate) (((SingleResp) (x509certificate1[0])).getCertStatus()));
	//   15   23:aload_2         
	//   16   24:iconst_0        
	//   17   25:aaload          
	//   18   26:invokevirtual   #284 <Method CertificateStatus SingleResp.getCertStatus()>
	//   19   29:astore_2        
						if(x509certificate1 == CertificateStatus.GOOD)
	//*  20   30:aload_2         
	//*  21   31:getstatic       #290 <Field CertificateStatus CertificateStatus.GOOD>
	//*  22   34:if_acmpne       42
							return ((BasicOCSPResp) (x509certificate)).getEncoded();
	//   23   37:aload_1         
	//   24   38:invokevirtual   #291 <Method byte[] BasicOCSPResp.getEncoded()>
	//   25   41:areturn         
						if(x509certificate1 instanceof RevokedStatus)
	//*  26   42:aload_2         
	//*  27   43:instanceof      #293 <Class RevokedStatus>
	//*  28   46:ifeq            96
							throw new IOException(MessageLocalization.getComposedMessage("ocsp.status.is.revoked", new Object[0]));
	//   29   49:new             #35  <Class IOException>
	//   30   52:dup             
	//   31   53:ldc2            #295 <String "ocsp.status.is.revoked">
	//   32   56:iconst_0        
	//   33   57:anewarray       Object[]
	//   34   60:invokestatic    #298 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   35   63:invokespecial   #220 <Method void IOException(String)>
	//   36   66:athrow          
						break label0;
					}
				}
				// Misplaced declaration of an exception variable
				catch(X509Certificate x509certificate)
	//*  37   67:astore_1        
				{
					if(LOGGER.isLogging(Level.ERROR))
	//*  38   68:getstatic       #20  <Field Logger LOGGER>
	//*  39   71:getstatic       #261 <Field Level Level.ERROR>
	//*  40   74:invokeinterface #265 <Method boolean Logger.isLogging(Level)>
	//*  41   79:ifeq            94
						LOGGER.error(((Exception) (x509certificate)).getMessage());
	//   42   82:getstatic       #20  <Field Logger LOGGER>
	//   43   85:aload_1         
	//   44   86:invokevirtual   #268 <Method String Exception.getMessage()>
	//   45   89:invokeinterface #271 <Method void Logger.error(String)>
				}
			return null;
	//   46   94:aconst_null     
	//   47   95:areturn         
		}
		throw new IOException(MessageLocalization.getComposedMessage("ocsp.status.is.unknown", new Object[0]));
	//   48   96:new             #35  <Class IOException>
	//   49   99:dup             
	//   50  100:ldc2            #300 <String "ocsp.status.is.unknown">
	//   51  103:iconst_0        
	//   52  104:anewarray       Object[]
	//   53  107:invokestatic    #298 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   54  110:invokespecial   #220 <Method void IOException(String)>
	//   55  113:athrow          
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/security/OcspClientBouncyCastle);
	private final OCSPVerifier verifier;

	static 
	{
	//    0    0:ldc1            #2   <Class OcspClientBouncyCastle>
	//    1    2:invokestatic    #18  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #20  <Field Logger LOGGER>
	//*   3    8:return          
	}
}
