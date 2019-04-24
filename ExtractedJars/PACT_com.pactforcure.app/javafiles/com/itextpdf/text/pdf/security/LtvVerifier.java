// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import com.itextpdf.text.pdf.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Principal;
import java.security.cert.*;
import java.util.*;
import org.spongycastle.cert.ocsp.*;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			RootStoreVerifier, PdfPKCS7, VerificationException, CRLVerifier, 
//			OCSPVerifier, VerificationOK, CertificateVerifier

public class LtvVerifier extends RootStoreVerifier
{

	public LtvVerifier(PdfReader pdfreader)
		throws GeneralSecurityException
	{
		super(((CertificateVerifier) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #41  <Method void RootStoreVerifier(CertificateVerifier)>
		option = LtvVerification.CertificateOption.SIGNING_CERTIFICATE;
	//    3    5:aload_0         
	//    4    6:getstatic       #46  <Field LtvVerification$CertificateOption LtvVerification$CertificateOption.SIGNING_CERTIFICATE>
	//    5    9:putfield        #48  <Field LtvVerification$CertificateOption option>
		verifyRootCertificate = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #50  <Field boolean verifyRootCertificate>
		latestRevision = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #52  <Field boolean latestRevision>
		reader = pdfreader;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #54  <Field PdfReader reader>
		fields = pdfreader.getAcroFields();
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #60  <Method AcroFields PdfReader.getAcroFields()>
	//   18   32:putfield        #62  <Field AcroFields fields>
		pdfreader = ((PdfReader) (fields.getSignatureNames()));
	//   19   35:aload_0         
	//   20   36:getfield        #62  <Field AcroFields fields>
	//   21   39:invokevirtual   #68  <Method ArrayList AcroFields.getSignatureNames()>
	//   22   42:astore_1        
		signatureName = (String)((List) (pdfreader)).get(((List) (pdfreader)).size() - 1);
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:aload_1         
	//   26   46:invokeinterface #74  <Method int List.size()>
	//   27   51:iconst_1        
	//   28   52:isub            
	//   29   53:invokeinterface #78  <Method Object List.get(int)>
	//   30   58:checkcast       #80  <Class String>
	//   31   61:putfield        #82  <Field String signatureName>
		signDate = new Date();
	//   32   64:aload_0         
	//   33   65:new             #84  <Class Date>
	//   34   68:dup             
	//   35   69:invokespecial   #86  <Method void Date()>
	//   36   72:putfield        #88  <Field Date signDate>
		pkcs7 = coversWholeDocument();
	//   37   75:aload_0         
	//   38   76:aload_0         
	//   39   77:invokevirtual   #92  <Method PdfPKCS7 coversWholeDocument()>
	//   40   80:putfield        #94  <Field PdfPKCS7 pkcs7>
		Logger logger = LOGGER;
	//   41   83:getstatic       #33  <Field Logger LOGGER>
	//   42   86:astore_2        
		if(pkcs7.isTsp())
	//*  43   87:aload_0         
	//*  44   88:getfield        #94  <Field PdfPKCS7 pkcs7>
	//*  45   91:invokevirtual   #100 <Method boolean PdfPKCS7.isTsp()>
	//*  46   94:ifeq            127
			pdfreader = "document-level timestamp ";
	//   47   97:ldc1            #102 <String "document-level timestamp ">
	//   48   99:astore_1        
		else
	//*  49  100:aload_2         
	//*  50  101:ldc1            #104 <String "Checking %ssignature %s">
	//*  51  103:iconst_2        
	//*  52  104:anewarray       Object[]
	//*  53  107:dup             
	//*  54  108:iconst_0        
	//*  55  109:aload_1         
	//*  56  110:aastore         
	//*  57  111:dup             
	//*  58  112:iconst_1        
	//*  59  113:aload_0         
	//*  60  114:getfield        #82  <Field String signatureName>
	//*  61  117:aastore         
	//*  62  118:invokestatic    #110 <Method String String.format(String, Object[])>
	//*  63  121:invokeinterface #116 <Method void Logger.info(String)>
	//*  64  126:return          
			pdfreader = "";
	//   65  127:ldc1            #118 <String "">
	//   66  129:astore_1        
		logger.info(String.format("Checking %ssignature %s", new Object[] {
			pdfreader, signatureName
		}));
	//*  67  130:goto            100
	}

	protected PdfPKCS7 coversWholeDocument()
		throws GeneralSecurityException
	{
		PdfPKCS7 pdfpkcs7 = fields.verifySignature(signatureName);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field AcroFields fields>
	//    2    4:aload_0         
	//    3    5:getfield        #82  <Field String signatureName>
	//    4    8:invokevirtual   #123 <Method PdfPKCS7 AcroFields.verifySignature(String)>
	//    5   11:astore_1        
		if(fields.signatureCoversWholeDocument(signatureName))
	//*   6   12:aload_0         
	//*   7   13:getfield        #62  <Field AcroFields fields>
	//*   8   16:aload_0         
	//*   9   17:getfield        #82  <Field String signatureName>
	//*  10   20:invokevirtual   #127 <Method boolean AcroFields.signatureCoversWholeDocument(String)>
	//*  11   23:ifeq            55
		{
			LOGGER.info("The timestamp covers whole document.");
	//   12   26:getstatic       #33  <Field Logger LOGGER>
	//   13   29:ldc1            #129 <String "The timestamp covers whole document.">
	//   14   31:invokeinterface #116 <Method void Logger.info(String)>
			if(pdfpkcs7.verify())
	//*  15   36:aload_1         
	//*  16   37:invokevirtual   #132 <Method boolean PdfPKCS7.verify()>
	//*  17   40:ifeq            66
			{
				LOGGER.info("The signed document has not been modified.");
	//   18   43:getstatic       #33  <Field Logger LOGGER>
	//   19   46:ldc1            #134 <String "The signed document has not been modified.">
	//   20   48:invokeinterface #116 <Method void Logger.info(String)>
				return pdfpkcs7;
	//   21   53:aload_1         
	//   22   54:areturn         
			} else
	//*  23   55:new             #136 <Class VerificationException>
	//*  24   58:dup             
	//*  25   59:aconst_null     
	//*  26   60:ldc1            #138 <String "Signature doesn't cover whole document.">
	//*  27   62:invokespecial   #141 <Method void VerificationException(Certificate, String)>
	//*  28   65:athrow          
			{
				throw new VerificationException(((Certificate) (null)), "The document was altered after the final signature was applied.");
	//   29   66:new             #136 <Class VerificationException>
	//   30   69:dup             
	//   31   70:aconst_null     
	//   32   71:ldc1            #143 <String "The document was altered after the final signature was applied.">
	//   33   73:invokespecial   #141 <Method void VerificationException(Certificate, String)>
	//   34   76:athrow          
			}
		} else
		{
			throw new VerificationException(((Certificate) (null)), "Signature doesn't cover whole document.");
		}
	}

	public List getCRLsFromDSS()
		throws GeneralSecurityException, IOException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #149 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #150 <Method void ArrayList()>
	//    3    7:astore_2        
		if(dss != null) goto _L2; else goto _L1
	//    4    8:aload_0         
	//    5    9:getfield        #152 <Field PdfDictionary dss>
	//    6   12:ifnonnull       17
_L1:
		PdfArray pdfarray;
		return ((List) (arraylist));
	//    7   15:aload_2         
	//    8   16:areturn         
	//*   9   17:aload_0         
	//*  10   18:getfield        #152 <Field PdfDictionary dss>
	//*  11   21:getstatic       #158 <Field PdfName PdfName.CRLS>
	//*  12   24:invokevirtual   #164 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//*  13   27:astore_3        
_L2:
		if((pdfarray = dss.getAsArray(PdfName.CRLS)) != null)
	//*  14   28:aload_3         
	//*  15   29:ifnull          15
		{
			CertificateFactory certificatefactory = CertificateFactory.getInstance("X.509");
	//   16   32:ldc1            #166 <String "X.509">
	//   17   34:invokestatic    #172 <Method CertificateFactory CertificateFactory.getInstance(String)>
	//   18   37:astore          4
			int i = 0;
	//   19   39:iconst_0        
	//   20   40:istore_1        
			while(i < pdfarray.size()) 
	//*  21   41:iload_1         
	//*  22   42:aload_3         
	//*  23   43:invokevirtual   #175 <Method int PdfArray.size()>
	//*  24   46:icmpge          15
			{
				((List) (arraylist)).add(((Object) ((X509CRL)certificatefactory.generateCRL(((java.io.InputStream) (new ByteArrayInputStream(PdfReader.getStreamBytes((PRStream)pdfarray.getAsStream(i)))))))));
	//   25   49:aload_2         
	//   26   50:aload           4
	//   27   52:new             #177 <Class ByteArrayInputStream>
	//   28   55:dup             
	//   29   56:aload_3         
	//   30   57:iload_1         
	//   31   58:invokevirtual   #181 <Method com.itextpdf.text.pdf.PdfStream PdfArray.getAsStream(int)>
	//   32   61:checkcast       #183 <Class PRStream>
	//   33   64:invokestatic    #187 <Method byte[] PdfReader.getStreamBytes(PRStream)>
	//   34   67:invokespecial   #190 <Method void ByteArrayInputStream(byte[])>
	//   35   70:invokevirtual   #194 <Method java.security.cert.CRL CertificateFactory.generateCRL(java.io.InputStream)>
	//   36   73:checkcast       #196 <Class X509CRL>
	//   37   76:invokeinterface #200 <Method boolean List.add(Object)>
	//   38   81:pop             
				i++;
	//   39   82:iload_1         
	//   40   83:iconst_1        
	//   41   84:iadd            
	//   42   85:istore_1        
			}
		}
		if(true) goto _L1; else goto _L3
	//   43   86:goto            41
_L3:
	}

	public List getOCSPResponsesFromDSS()
		throws IOException, GeneralSecurityException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #149 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #150 <Method void ArrayList()>
	//    3    7:astore_2        
		if(dss != null) goto _L2; else goto _L1
	//    4    8:aload_0         
	//    5    9:getfield        #152 <Field PdfDictionary dss>
	//    6   12:ifnonnull       17
_L1:
		PdfArray pdfarray;
		return ((List) (arraylist));
	//    7   15:aload_2         
	//    8   16:areturn         
	//*   9   17:aload_0         
	//*  10   18:getfield        #152 <Field PdfDictionary dss>
	//*  11   21:getstatic       #208 <Field PdfName PdfName.OCSPS>
	//*  12   24:invokevirtual   #164 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//*  13   27:astore_3        
_L2:
		if((pdfarray = dss.getAsArray(PdfName.OCSPS)) != null)
	//*  14   28:aload_3         
	//*  15   29:ifnull          15
		{
			int i = 0;
	//   16   32:iconst_0        
	//   17   33:istore_1        
			while(i < pdfarray.size()) 
	//*  18   34:iload_1         
	//*  19   35:aload_3         
	//*  20   36:invokevirtual   #175 <Method int PdfArray.size()>
	//*  21   39:icmpge          15
			{
				OCSPResp ocspresp = new OCSPResp(PdfReader.getStreamBytes((PRStream)pdfarray.getAsStream(i)));
	//   22   42:new             #210 <Class OCSPResp>
	//   23   45:dup             
	//   24   46:aload_3         
	//   25   47:iload_1         
	//   26   48:invokevirtual   #181 <Method com.itextpdf.text.pdf.PdfStream PdfArray.getAsStream(int)>
	//   27   51:checkcast       #183 <Class PRStream>
	//   28   54:invokestatic    #187 <Method byte[] PdfReader.getStreamBytes(PRStream)>
	//   29   57:invokespecial   #211 <Method void OCSPResp(byte[])>
	//   30   60:astore          4
				if(ocspresp.getStatus() == 0)
	//*  31   62:aload           4
	//*  32   64:invokevirtual   #214 <Method int OCSPResp.getStatus()>
	//*  33   67:ifne            85
					try
					{
						((List) (arraylist)).add(((Object) ((BasicOCSPResp)ocspresp.getResponseObject())));
	//   34   70:aload_2         
	//   35   71:aload           4
	//   36   73:invokevirtual   #218 <Method Object OCSPResp.getResponseObject()>
	//   37   76:checkcast       #220 <Class BasicOCSPResp>
	//   38   79:invokeinterface #200 <Method boolean List.add(Object)>
	//   39   84:pop             
					}
	//*  40   85:iload_1         
	//*  41   86:iconst_1        
	//*  42   87:iadd            
	//*  43   88:istore_1        
	//*  44   89:goto            34
					catch(OCSPException ocspexception)
	//*  45   92:astore_2        
					{
						throw new GeneralSecurityException(((Throwable) (ocspexception)));
	//   46   93:new             #38  <Class GeneralSecurityException>
	//   47   96:dup             
	//   48   97:aload_2         
	//   49   98:invokespecial   #223 <Method void GeneralSecurityException(Throwable)>
	//   50  101:athrow          
					}
				i++;
			}
		}
		if(true) goto _L1; else goto _L3
_L3:
	}

	public void setCertificateOption(LtvVerification.CertificateOption certificateoption)
	{
		option = certificateoption;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field LtvVerification$CertificateOption option>
	//    3    5:return          
	}

	public void setVerifier(CertificateVerifier certificateverifier)
	{
		verifier = certificateverifier;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #231 <Field CertificateVerifier verifier>
	//    3    5:return          
	}

	public void setVerifyRootCertificate(boolean flag)
	{
		verifyRootCertificate = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #50  <Field boolean verifyRootCertificate>
	//    3    5:return          
	}

	public void switchToPreviousRevision()
		throws IOException, GeneralSecurityException
	{
		LOGGER.info("Switching to previous revision.");
	//    0    0:getstatic       #33  <Field Logger LOGGER>
	//    1    3:ldc1            #236 <String "Switching to previous revision.">
	//    2    5:invokeinterface #116 <Method void Logger.info(String)>
		latestRevision = false;
	//    3   10:aload_0         
	//    4   11:iconst_0        
	//    5   12:putfield        #52  <Field boolean latestRevision>
		dss = reader.getCatalog().getAsDict(PdfName.DSS);
	//    6   15:aload_0         
	//    7   16:aload_0         
	//    8   17:getfield        #54  <Field PdfReader reader>
	//    9   20:invokevirtual   #240 <Method PdfDictionary PdfReader.getCatalog()>
	//   10   23:getstatic       #243 <Field PdfName PdfName.DSS>
	//   11   26:invokevirtual   #247 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   12   29:putfield        #152 <Field PdfDictionary dss>
		Calendar calendar = pkcs7.getTimeStampDate();
	//   13   32:aload_0         
	//   14   33:getfield        #94  <Field PdfPKCS7 pkcs7>
	//   15   36:invokevirtual   #251 <Method Calendar PdfPKCS7.getTimeStampDate()>
	//   16   39:astore_2        
		Object obj = ((Object) (calendar));
	//   17   40:aload_2         
	//   18   41:astore_1        
		if(calendar == null)
	//*  19   42:aload_2         
	//*  20   43:ifnonnull       54
			obj = ((Object) (pkcs7.getSignDate()));
	//   21   46:aload_0         
	//   22   47:getfield        #94  <Field PdfPKCS7 pkcs7>
	//   23   50:invokevirtual   #254 <Method Calendar PdfPKCS7.getSignDate()>
	//   24   53:astore_1        
		signDate = ((Calendar) (obj)).getTime();
	//   25   54:aload_0         
	//   26   55:aload_1         
	//   27   56:invokevirtual   #260 <Method Date Calendar.getTime()>
	//   28   59:putfield        #88  <Field Date signDate>
		obj = ((Object) (fields.getSignatureNames()));
	//   29   62:aload_0         
	//   30   63:getfield        #62  <Field AcroFields fields>
	//   31   66:invokevirtual   #68  <Method ArrayList AcroFields.getSignatureNames()>
	//   32   69:astore_1        
		if(((List) (obj)).size() > 1)
	//*  33   70:aload_1         
	//*  34   71:invokeinterface #74  <Method int List.size()>
	//*  35   76:iconst_1        
	//*  36   77:icmple          221
		{
			signatureName = (String)((List) (obj)).get(((List) (obj)).size() - 2);
	//   37   80:aload_0         
	//   38   81:aload_1         
	//   39   82:aload_1         
	//   40   83:invokeinterface #74  <Method int List.size()>
	//   41   88:iconst_2        
	//   42   89:isub            
	//   43   90:invokeinterface #78  <Method Object List.get(int)>
	//   44   95:checkcast       #80  <Class String>
	//   45   98:putfield        #82  <Field String signatureName>
			reader = new PdfReader(fields.extractRevision(signatureName));
	//   46  101:aload_0         
	//   47  102:new             #56  <Class PdfReader>
	//   48  105:dup             
	//   49  106:aload_0         
	//   50  107:getfield        #62  <Field AcroFields fields>
	//   51  110:aload_0         
	//   52  111:getfield        #82  <Field String signatureName>
	//   53  114:invokevirtual   #264 <Method java.io.InputStream AcroFields.extractRevision(String)>
	//   54  117:invokespecial   #267 <Method void PdfReader(java.io.InputStream)>
	//   55  120:putfield        #54  <Field PdfReader reader>
			fields = reader.getAcroFields();
	//   56  123:aload_0         
	//   57  124:aload_0         
	//   58  125:getfield        #54  <Field PdfReader reader>
	//   59  128:invokevirtual   #60  <Method AcroFields PdfReader.getAcroFields()>
	//   60  131:putfield        #62  <Field AcroFields fields>
			obj = ((Object) (fields.getSignatureNames()));
	//   61  134:aload_0         
	//   62  135:getfield        #62  <Field AcroFields fields>
	//   63  138:invokevirtual   #68  <Method ArrayList AcroFields.getSignatureNames()>
	//   64  141:astore_1        
			signatureName = (String)((List) (obj)).get(((List) (obj)).size() - 1);
	//   65  142:aload_0         
	//   66  143:aload_1         
	//   67  144:aload_1         
	//   68  145:invokeinterface #74  <Method int List.size()>
	//   69  150:iconst_1        
	//   70  151:isub            
	//   71  152:invokeinterface #78  <Method Object List.get(int)>
	//   72  157:checkcast       #80  <Class String>
	//   73  160:putfield        #82  <Field String signatureName>
			pkcs7 = coversWholeDocument();
	//   74  163:aload_0         
	//   75  164:aload_0         
	//   76  165:invokevirtual   #92  <Method PdfPKCS7 coversWholeDocument()>
	//   77  168:putfield        #94  <Field PdfPKCS7 pkcs7>
			Logger logger = LOGGER;
	//   78  171:getstatic       #33  <Field Logger LOGGER>
	//   79  174:astore_2        
			if(pkcs7.isTsp())
	//*  80  175:aload_0         
	//*  81  176:getfield        #94  <Field PdfPKCS7 pkcs7>
	//*  82  179:invokevirtual   #100 <Method boolean PdfPKCS7.isTsp()>
	//*  83  182:ifeq            215
				obj = "document-level timestamp ";
	//   84  185:ldc1            #102 <String "document-level timestamp ">
	//   85  187:astore_1        
			else
	//*  86  188:aload_2         
	//*  87  189:ldc1            #104 <String "Checking %ssignature %s">
	//*  88  191:iconst_2        
	//*  89  192:anewarray       Object[]
	//*  90  195:dup             
	//*  91  196:iconst_0        
	//*  92  197:aload_1         
	//*  93  198:aastore         
	//*  94  199:dup             
	//*  95  200:iconst_1        
	//*  96  201:aload_0         
	//*  97  202:getfield        #82  <Field String signatureName>
	//*  98  205:aastore         
	//*  99  206:invokestatic    #110 <Method String String.format(String, Object[])>
	//* 100  209:invokeinterface #116 <Method void Logger.info(String)>
	//* 101  214:return          
				obj = "";
	//  102  215:ldc1            #118 <String "">
	//  103  217:astore_1        
			logger.info(String.format("Checking %ssignature %s", new Object[] {
				obj, signatureName
			}));
			return;
		} else
	//* 104  218:goto            188
		{
			LOGGER.info("No signatures in revision");
	//  105  221:getstatic       #33  <Field Logger LOGGER>
	//  106  224:ldc2            #269 <String "No signatures in revision">
	//  107  227:invokeinterface #116 <Method void Logger.info(String)>
			pkcs7 = null;
	//  108  232:aload_0         
	//  109  233:aconst_null     
	//  110  234:putfield        #94  <Field PdfPKCS7 pkcs7>
			return;
	//  111  237:return          
		}
	}

	public List verify(X509Certificate x509certificate, X509Certificate x509certificate1, Date date)
		throws GeneralSecurityException, IOException
	{
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
			Object obj = ((Object) (new RootStoreVerifier(verifier)));
	//    2    3:new             #4   <Class RootStoreVerifier>
	//    3    6:dup             
	//    4    7:aload_0         
	//    5    8:getfield        #231 <Field CertificateVerifier verifier>
	//    6   11:invokespecial   #41  <Method void RootStoreVerifier(CertificateVerifier)>
	//    7   14:astore          6
			((RootStoreVerifier) (obj)).setRootStore(rootStore);
	//    8   16:aload           6
	//    9   18:aload_0         
	//   10   19:getfield        #274 <Field java.security.KeyStore rootStore>
	//   11   22:invokevirtual   #278 <Method void RootStoreVerifier.setRootStore(java.security.KeyStore)>
			obj = ((Object) (new CRLVerifier(((CertificateVerifier) (obj)), getCRLsFromDSS())));
	//   12   25:new             #280 <Class CRLVerifier>
	//   13   28:dup             
	//   14   29:aload           6
	//   15   31:aload_0         
	//   16   32:invokevirtual   #282 <Method List getCRLsFromDSS()>
	//   17   35:invokespecial   #285 <Method void CRLVerifier(CertificateVerifier, List)>
	//   18   38:astore          6
			((CRLVerifier) (obj)).setRootStore(rootStore);
	//   19   40:aload           6
	//   20   42:aload_0         
	//   21   43:getfield        #274 <Field java.security.KeyStore rootStore>
	//   22   46:invokevirtual   #286 <Method void CRLVerifier.setRootStore(java.security.KeyStore)>
			boolean flag;
			if(latestRevision || onlineCheckingAllowed)
	//*  23   49:aload_0         
	//*  24   50:getfield        #52  <Field boolean latestRevision>
	//*  25   53:ifne            63
	//*  26   56:aload_0         
	//*  27   57:getfield        #289 <Field boolean onlineCheckingAllowed>
	//*  28   60:ifeq            134
				flag = true;
	//   29   63:iconst_1        
	//   30   64:istore          4
			else
	//*  31   66:aload           6
	//*  32   68:iload           4
	//*  33   70:invokevirtual   #292 <Method void CRLVerifier.setOnlineCheckingAllowed(boolean)>
	//*  34   73:new             #294 <Class OCSPVerifier>
	//*  35   76:dup             
	//*  36   77:aload           6
	//*  37   79:aload_0         
	//*  38   80:invokevirtual   #296 <Method List getOCSPResponsesFromDSS()>
	//*  39   83:invokespecial   #297 <Method void OCSPVerifier(CertificateVerifier, List)>
	//*  40   86:astore          6
	//*  41   88:aload           6
	//*  42   90:aload_0         
	//*  43   91:getfield        #274 <Field java.security.KeyStore rootStore>
	//*  44   94:invokevirtual   #298 <Method void OCSPVerifier.setRootStore(java.security.KeyStore)>
	//*  45   97:aload_0         
	//*  46   98:getfield        #52  <Field boolean latestRevision>
	//*  47  101:ifne            115
	//*  48  104:iload           5
	//*  49  106:istore          4
	//*  50  108:aload_0         
	//*  51  109:getfield        #289 <Field boolean onlineCheckingAllowed>
	//*  52  112:ifeq            118
	//*  53  115:iconst_1        
	//*  54  116:istore          4
	//*  55  118:aload           6
	//*  56  120:iload           4
	//*  57  122:invokevirtual   #299 <Method void OCSPVerifier.setOnlineCheckingAllowed(boolean)>
	//*  58  125:aload           6
	//*  59  127:aload_1         
	//*  60  128:aload_2         
	//*  61  129:aload_3         
	//*  62  130:invokevirtual   #301 <Method List OCSPVerifier.verify(X509Certificate, X509Certificate, Date)>
	//*  63  133:areturn         
				flag = false;
	//   64  134:iconst_0        
	//   65  135:istore          4
			((CRLVerifier) (obj)).setOnlineCheckingAllowed(flag);
			obj = ((Object) (new OCSPVerifier(((CertificateVerifier) (obj)), getOCSPResponsesFromDSS())));
			((OCSPVerifier) (obj)).setRootStore(rootStore);
			if(!latestRevision)
			{
				flag = flag1;
				if(!onlineCheckingAllowed)
					break label0;
			}
			flag = true;
		}
		((OCSPVerifier) (obj)).setOnlineCheckingAllowed(flag);
		return ((OCSPVerifier) (obj)).verify(x509certificate, x509certificate1, date);
	//*  66  137:goto            66
	}

	public List verify(List list)
		throws IOException, GeneralSecurityException
	{
		Object obj = ((Object) (list));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(list == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       14
			obj = ((Object) (new ArrayList()));
	//    4    6:new             #149 <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #150 <Method void ArrayList()>
	//    7   13:astore_2        
		while(pkcs7 != null) 
	//*   8   14:aload_0         
	//*   9   15:getfield        #94  <Field PdfPKCS7 pkcs7>
	//*  10   18:ifnull          35
			((List) (obj)).addAll(((java.util.Collection) (verifySignature())));
	//   11   21:aload_2         
	//   12   22:aload_0         
	//   13   23:invokevirtual   #305 <Method List verifySignature()>
	//   14   26:invokeinterface #309 <Method boolean List.addAll(java.util.Collection)>
	//   15   31:pop             
	//*  16   32:goto            14
		return ((List) (obj));
	//   17   35:aload_2         
	//   18   36:areturn         
	}

	public void verifyChain(Certificate acertificate[])
		throws GeneralSecurityException
	{
		for(int i = 0; i < acertificate.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:arraylength     
	//*   5    5:icmpge          46
		{
			((X509Certificate)acertificate[i]).checkValidity(signDate);
	//    6    8:aload_1         
	//    7    9:iload_2         
	//    8   10:aaload          
	//    9   11:checkcast       #314 <Class X509Certificate>
	//   10   14:aload_0         
	//   11   15:getfield        #88  <Field Date signDate>
	//   12   18:invokevirtual   #318 <Method void X509Certificate.checkValidity(Date)>
			if(i > 0)
	//*  13   21:iload_2         
	//*  14   22:ifle            39
				acertificate[i - 1].verify(acertificate[i].getPublicKey());
	//   15   25:aload_1         
	//   16   26:iload_2         
	//   17   27:iconst_1        
	//   18   28:isub            
	//   19   29:aaload          
	//   20   30:aload_1         
	//   21   31:iload_2         
	//   22   32:aaload          
	//   23   33:invokevirtual   #324 <Method java.security.PublicKey Certificate.getPublicKey()>
	//   24   36:invokevirtual   #327 <Method void Certificate.verify(java.security.PublicKey)>
		}

	//   25   39:iload_2         
	//   26   40:iconst_1        
	//   27   41:iadd            
	//   28   42:istore_2        
	//*  29   43:goto            2
		LOGGER.info((new StringBuilder()).append("All certificates are valid on ").append(signDate.toString()).toString());
	//   30   46:getstatic       #33  <Field Logger LOGGER>
	//   31   49:new             #329 <Class StringBuilder>
	//   32   52:dup             
	//   33   53:invokespecial   #330 <Method void StringBuilder()>
	//   34   56:ldc2            #332 <String "All certificates are valid on ">
	//   35   59:invokevirtual   #336 <Method StringBuilder StringBuilder.append(String)>
	//   36   62:aload_0         
	//   37   63:getfield        #88  <Field Date signDate>
	//   38   66:invokevirtual   #340 <Method String Date.toString()>
	//   39   69:invokevirtual   #336 <Method StringBuilder StringBuilder.append(String)>
	//   40   72:invokevirtual   #341 <Method String StringBuilder.toString()>
	//   41   75:invokeinterface #116 <Method void Logger.info(String)>
	//   42   80:return          
	}

	public List verifySignature()
		throws GeneralSecurityException, IOException
	{
		int i;
		int j;
		ArrayList arraylist;
		Certificate acertificate[];
		LOGGER.info("Verifying signature.");
	//    0    0:getstatic       #33  <Field Logger LOGGER>
	//    1    3:ldc2            #343 <String "Verifying signature.">
	//    2    6:invokeinterface #116 <Method void Logger.info(String)>
		arraylist = new ArrayList();
	//    3   11:new             #149 <Class ArrayList>
	//    4   14:dup             
	//    5   15:invokespecial   #150 <Method void ArrayList()>
	//    6   18:astore          6
		acertificate = pkcs7.getSignCertificateChain();
	//    7   20:aload_0         
	//    8   21:getfield        #94  <Field PdfPKCS7 pkcs7>
	//    9   24:invokevirtual   #347 <Method Certificate[] PdfPKCS7.getSignCertificateChain()>
	//   10   27:astore          7
		verifyChain(acertificate);
	//   11   29:aload_0         
	//   12   30:aload           7
	//   13   32:invokevirtual   #349 <Method void verifyChain(Certificate[])>
		i = 1;
	//   14   35:iconst_1        
	//   15   36:istore_1        
		if(LtvVerification.CertificateOption.WHOLE_CHAIN.equals(((Object) (option))))
	//*  16   37:getstatic       #352 <Field LtvVerification$CertificateOption LtvVerification$CertificateOption.WHOLE_CHAIN>
	//*  17   40:aload_0         
	//*  18   41:getfield        #48  <Field LtvVerification$CertificateOption option>
	//*  19   44:invokevirtual   #355 <Method boolean LtvVerification$CertificateOption.equals(Object)>
	//*  20   47:ifeq            54
			i = acertificate.length;
	//   21   50:aload           7
	//   22   52:arraylength     
	//   23   53:istore_1        
		j = 0;
	//   24   54:iconst_0        
	//   25   55:istore_2        
_L3:
		if(j >= i) goto _L2; else goto _L1
	//   26   56:iload_2         
	//   27   57:iload_1         
	//   28   58:icmpge          269
_L1:
		int k;
		Object obj;
		X509Certificate x509certificate;
		k = j + 1;
	//   29   61:iload_2         
	//   30   62:iconst_1        
	//   31   63:iadd            
	//   32   64:istore_3        
		x509certificate = (X509Certificate)acertificate[j];
	//   33   65:aload           7
	//   34   67:iload_2         
	//   35   68:aaload          
	//   36   69:checkcast       #314 <Class X509Certificate>
	//   37   72:astore          5
		obj = null;
	//   38   74:aconst_null     
	//   39   75:astore          4
		if(k < acertificate.length)
	//*  40   77:iload_3         
	//*  41   78:aload           7
	//*  42   80:arraylength     
	//*  43   81:icmpge          93
			obj = ((Object) ((X509Certificate)acertificate[k]));
	//   44   84:aload           7
	//   45   86:iload_3         
	//   46   87:aaload          
	//   47   88:checkcast       #314 <Class X509Certificate>
	//   48   91:astore          4
		LOGGER.info(x509certificate.getSubjectDN().getName());
	//   49   93:getstatic       #33  <Field Logger LOGGER>
	//   50   96:aload           5
	//   51   98:invokevirtual   #359 <Method Principal X509Certificate.getSubjectDN()>
	//   52  101:invokeinterface #364 <Method String Principal.getName()>
	//   53  106:invokeinterface #116 <Method void Logger.info(String)>
		obj = ((Object) (verify(x509certificate, ((X509Certificate) (obj)), signDate)));
	//   54  111:aload_0         
	//   55  112:aload           5
	//   56  114:aload           4
	//   57  116:aload_0         
	//   58  117:getfield        #88  <Field Date signDate>
	//   59  120:invokevirtual   #365 <Method List verify(X509Certificate, X509Certificate, Date)>
	//   60  123:astore          4
		if(((List) (obj)).size() != 0)
			break MISSING_BLOCK_LABEL_254;
	//   61  125:aload           4
	//   62  127:invokeinterface #74  <Method int List.size()>
	//   63  132:ifne            254
		try
		{
			x509certificate.verify(x509certificate.getPublicKey());
	//   64  135:aload           5
	//   65  137:aload           5
	//   66  139:invokevirtual   #366 <Method java.security.PublicKey X509Certificate.getPublicKey()>
	//   67  142:invokevirtual   #367 <Method void X509Certificate.verify(java.security.PublicKey)>
			if(latestRevision && acertificate.length > 1)
	//*  68  145:aload_0         
	//*  69  146:getfield        #52  <Field boolean latestRevision>
	//*  70  149:ifeq            183
	//*  71  152:aload           7
	//*  72  154:arraylength     
	//*  73  155:iconst_1        
	//*  74  156:icmple          183
				((List) (obj)).add(((Object) (new VerificationOK(x509certificate, ((Object)this).getClass(), "Root certificate in final revision"))));
	//   75  159:aload           4
	//   76  161:new             #369 <Class VerificationOK>
	//   77  164:dup             
	//   78  165:aload           5
	//   79  167:aload_0         
	//   80  168:invokevirtual   #373 <Method Class Object.getClass()>
	//   81  171:ldc2            #375 <String "Root certificate in final revision">
	//   82  174:invokespecial   #378 <Method void VerificationOK(X509Certificate, Class, String)>
	//   83  177:invokeinterface #200 <Method boolean List.add(Object)>
	//   84  182:pop             
			if(((List) (obj)).size() == 0 && verifyRootCertificate)
	//*  85  183:aload           4
	//*  86  185:invokeinterface #74  <Method int List.size()>
	//*  87  190:ifne            223
	//*  88  193:aload_0         
	//*  89  194:getfield        #50  <Field boolean verifyRootCertificate>
	//*  90  197:ifeq            223
				throw new GeneralSecurityException();
	//   91  200:new             #38  <Class GeneralSecurityException>
	//   92  203:dup             
	//   93  204:invokespecial   #379 <Method void GeneralSecurityException()>
	//   94  207:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  95  208:astore          4
		{
			throw new VerificationException(((Certificate) (x509certificate)), "Couldn't verify with CRL or OCSP or trusted anchor");
	//   96  210:new             #136 <Class VerificationException>
	//   97  213:dup             
	//   98  214:aload           5
	//   99  216:ldc2            #381 <String "Couldn't verify with CRL or OCSP or trusted anchor">
	//  100  219:invokespecial   #141 <Method void VerificationException(Certificate, String)>
	//  101  222:athrow          
		}
		if(acertificate.length > 1)
	//* 102  223:aload           7
	//* 103  225:arraylength     
	//* 104  226:iconst_1        
	//* 105  227:icmple          254
			((List) (obj)).add(((Object) (new VerificationOK(x509certificate, ((Object)this).getClass(), "Root certificate passed without checking"))));
	//  106  230:aload           4
	//  107  232:new             #369 <Class VerificationOK>
	//  108  235:dup             
	//  109  236:aload           5
	//  110  238:aload_0         
	//  111  239:invokevirtual   #373 <Method Class Object.getClass()>
	//  112  242:ldc2            #383 <String "Root certificate passed without checking">
	//  113  245:invokespecial   #378 <Method void VerificationOK(X509Certificate, Class, String)>
	//  114  248:invokeinterface #200 <Method boolean List.add(Object)>
	//  115  253:pop             
		((List) (arraylist)).addAll(((java.util.Collection) (obj)));
	//  116  254:aload           6
	//  117  256:aload           4
	//  118  258:invokeinterface #309 <Method boolean List.addAll(java.util.Collection)>
	//  119  263:pop             
		j = k;
	//  120  264:iload_3         
	//  121  265:istore_2        
		  goto _L3
	//* 122  266:goto            56
_L2:
		switchToPreviousRevision();
	//  123  269:aload_0         
	//  124  270:invokevirtual   #385 <Method void switchToPreviousRevision()>
		return ((List) (arraylist));
	//  125  273:aload           6
	//  126  275:areturn         
	}

	protected static final Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/security/LtvVerifier);
	protected PdfDictionary dss;
	protected AcroFields fields;
	protected boolean latestRevision;
	protected LtvVerification.CertificateOption option;
	protected PdfPKCS7 pkcs7;
	protected PdfReader reader;
	protected Date signDate;
	protected String signatureName;
	protected boolean verifyRootCertificate;

	static 
	{
	//    0    0:ldc1            #2   <Class LtvVerifier>
	//    1    2:invokestatic    #31  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #33  <Field Logger LOGGER>
	//*   3    8:return          
	}
}
