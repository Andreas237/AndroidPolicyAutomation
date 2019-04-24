// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import java.io.IOException;
import java.math.BigInteger;
import java.security.*;
import java.security.cert.*;
import java.util.*;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ocsp.OCSPObjectIdentifiers;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.cert.jcajce.JcaX509CertificateConverter;
import org.spongycastle.cert.ocsp.*;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.operator.bc.BcDigestCalculatorProvider;
import org.spongycastle.operator.jcajce.JcaContentVerifierProviderBuilder;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			RootStoreVerifier, OcspClientBouncyCastle, VerificationException, CertificateUtil, 
//			CRLVerifier, VerificationOK, CertificateVerifier

public class OCSPVerifier extends RootStoreVerifier
{

	public OCSPVerifier(CertificateVerifier certificateverifier, List list)
	{
		super(certificateverifier);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void RootStoreVerifier(CertificateVerifier)>
		ocsps = list;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #31  <Field List ocsps>
	//    6   10:return          
	}

	public BasicOCSPResp getOcspResponse(X509Certificate x509certificate, X509Certificate x509certificate1)
	{
		if(x509certificate != null || x509certificate1 != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       12
	//    2    4:aload_2         
	//    3    5:ifnonnull       12
_L1:
		x509certificate = null;
	//    4    8:aconst_null     
	//    5    9:astore_1        
_L4:
		return ((BasicOCSPResp) (x509certificate));
	//    6   10:aload_1         
	//    7   11:areturn         
_L2:
		x509certificate1 = ((X509Certificate) ((new OcspClientBouncyCastle()).getBasicOCSPResp(x509certificate, x509certificate1, ((String) (null)))));
	//    8   12:new             #37  <Class OcspClientBouncyCastle>
	//    9   15:dup             
	//   10   16:invokespecial   #39  <Method void OcspClientBouncyCastle()>
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aconst_null     
	//   14   22:invokevirtual   #43  <Method BasicOCSPResp OcspClientBouncyCastle.getBasicOCSPResp(X509Certificate, X509Certificate, String)>
	//   15   25:astore_2        
		if(x509certificate1 == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       32
			return null;
	//   18   30:aconst_null     
	//   19   31:areturn         
		SingleResp asingleresp[] = ((BasicOCSPResp) (x509certificate1)).getResponses();
	//   20   32:aload_2         
	//   21   33:invokevirtual   #49  <Method SingleResp[] BasicOCSPResp.getResponses()>
	//   22   36:astore          4
		int i = 0;
	//   23   38:iconst_0        
	//   24   39:istore_3        
label0:
		do
		{
label1:
			{
				if(i >= asingleresp.length)
					break label1;
	//   25   40:iload_3         
	//   26   41:aload           4
	//   27   43:arraylength     
	//   28   44:icmpge          69
				x509certificate = x509certificate1;
	//   29   47:aload_2         
	//   30   48:astore_1        
				if(asingleresp[i].getCertStatus() == CertificateStatus.GOOD)
					break label0;
	//   31   49:aload           4
	//   32   51:iload_3         
	//   33   52:aaload          
	//   34   53:invokevirtual   #55  <Method CertificateStatus SingleResp.getCertStatus()>
	//   35   56:getstatic       #61  <Field CertificateStatus CertificateStatus.GOOD>
	//   36   59:if_acmpeq       10
				i++;
	//   37   62:iload_3         
	//   38   63:iconst_1        
	//   39   64:iadd            
	//   40   65:istore_3        
			}
		} while(true);
	//   41   66:goto            40
		if(true) goto _L4; else goto _L3
_L3:
		return null;
	//   42   69:aconst_null     
	//   43   70:areturn         
	}

	public boolean isSignatureValid(BasicOCSPResp basicocspresp, Certificate certificate)
	{
		boolean flag;
		try
		{
			flag = basicocspresp.isSignatureValid((new JcaContentVerifierProviderBuilder()).setProvider("BC").build(certificate.getPublicKey()));
	//    0    0:aload_1         
	//    1    1:new             #69  <Class JcaContentVerifierProviderBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #70  <Method void JcaContentVerifierProviderBuilder()>
	//    4    8:ldc1            #72  <String "BC">
	//    5   10:invokevirtual   #76  <Method JcaContentVerifierProviderBuilder JcaContentVerifierProviderBuilder.setProvider(String)>
	//    6   13:aload_2         
	//    7   14:invokevirtual   #82  <Method java.security.PublicKey Certificate.getPublicKey()>
	//    8   17:invokevirtual   #86  <Method org.spongycastle.operator.ContentVerifierProvider JcaContentVerifierProviderBuilder.build(java.security.PublicKey)>
	//    9   20:invokevirtual   #89  <Method boolean BasicOCSPResp.isSignatureValid(org.spongycastle.operator.ContentVerifierProvider)>
	//   10   23:istore_3        
		}
	//*  11   24:iload_3         
	//*  12   25:ireturn         
		// Misplaced declaration of an exception variable
		catch(BasicOCSPResp basicocspresp)
	//*  13   26:astore_1        
		{
			return false;
	//   14   27:iconst_0        
	//   15   28:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(BasicOCSPResp basicocspresp)
	//*  16   29:astore_1        
		{
			return false;
	//   17   30:iconst_0        
	//   18   31:ireturn         
		}
		return flag;
	}

	public void isValidResponse(BasicOCSPResp basicocspresp, X509Certificate x509certificate)
		throws GeneralSecurityException, IOException
	{
		X509Certificate x509certificate1;
		Object obj2;
		x509certificate1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		if(isSignatureValid(basicocspresp, ((Certificate) (x509certificate))))
	//*   2    3:aload_0         
	//*   3    4:aload_1         
	//*   4    5:aload_2         
	//*   5    6:invokevirtual   #103 <Method boolean isSignatureValid(BasicOCSPResp, Certificate)>
	//*   6    9:ifeq            15
			x509certificate1 = x509certificate;
	//    7   12:aload_2         
	//    8   13:astore          6
		obj2 = ((Object) (x509certificate1));
	//    9   15:aload           6
	//   10   17:astore          8
		if(x509certificate1 != null) goto _L2; else goto _L1
	//   11   19:aload           6
	//   12   21:ifnonnull       254
_L1:
		if(basicocspresp.getCerts() == null) goto _L4; else goto _L3
	//   13   24:aload_1         
	//   14   25:invokevirtual   #107 <Method X509CertificateHolder[] BasicOCSPResp.getCerts()>
	//   15   28:ifnull          141
_L3:
		int i;
		int j;
		obj2 = ((Object) (basicocspresp.getCerts()));
	//   16   31:aload_1         
	//   17   32:invokevirtual   #107 <Method X509CertificateHolder[] BasicOCSPResp.getCerts()>
	//   18   35:astore          8
		j = obj2.length;
	//   19   37:aload           8
	//   20   39:arraylength     
	//   21   40:istore          4
		i = 0;
	//   22   42:iconst_0        
	//   23   43:istore_3        
_L5:
		Object obj;
		obj = ((Object) (x509certificate1));
	//   24   44:aload           6
	//   25   46:astore          7
		if(i >= j)
			break MISSING_BLOCK_LABEL_112;
	//   26   48:iload_3         
	//   27   49:iload           4
	//   28   51:icmpge          112
		obj = ((Object) (obj2[i]));
	//   29   54:aload           8
	//   30   56:iload_3         
	//   31   57:aaload          
	//   32   58:astore          7
		obj = ((Object) ((new JcaX509CertificateConverter()).getCertificate(((X509CertificateHolder) (obj)))));
	//   33   60:new             #109 <Class JcaX509CertificateConverter>
	//   34   63:dup             
	//   35   64:invokespecial   #110 <Method void JcaX509CertificateConverter()>
	//   36   67:aload           7
	//   37   69:invokevirtual   #114 <Method X509Certificate JcaX509CertificateConverter.getCertificate(X509CertificateHolder)>
	//   38   72:astore          7
		List list = ((X509Certificate) (obj)).getExtendedKeyUsage();
	//   39   74:aload           7
	//   40   76:invokevirtual   #120 <Method List X509Certificate.getExtendedKeyUsage()>
	//   41   79:astore          9
		if(list == null)
			break MISSING_BLOCK_LABEL_134;
	//   42   81:aload           9
	//   43   83:ifnull          134
		boolean flag;
		if(!list.contains("1.3.6.1.5.5.7.3.9"))
			break MISSING_BLOCK_LABEL_134;
	//   44   86:aload           9
	//   45   88:ldc1            #10  <String "1.3.6.1.5.5.7.3.9">
	//   46   90:invokeinterface #126 <Method boolean List.contains(Object)>
	//   47   95:ifeq            134
		flag = isSignatureValid(basicocspresp, ((Certificate) (obj)));
	//   48   98:aload_0         
	//   49   99:aload_1         
	//   50  100:aload           7
	//   51  102:invokevirtual   #103 <Method boolean isSignatureValid(BasicOCSPResp, Certificate)>
	//   52  105:istore          5
		if(!flag)
			break MISSING_BLOCK_LABEL_134;
	//   53  107:iload           5
	//   54  109:ifeq            134
		obj2 = obj;
	//   55  112:aload           7
	//   56  114:astore          8
		if(obj == null)
	//*  57  116:aload           7
	//*  58  118:ifnonnull       254
			throw new VerificationException(((Certificate) (x509certificate)), "OCSP response could not be verified");
	//   59  121:new             #128 <Class VerificationException>
	//   60  124:dup             
	//   61  125:aload_2         
	//   62  126:ldc1            #130 <String "OCSP response could not be verified">
	//   63  128:invokespecial   #133 <Method void VerificationException(Certificate, String)>
	//   64  131:athrow          
		break; /* Loop/switch isn't completed */
		Object obj1;
		obj1;
	//   65  132:astore          7
_L11:
		i++;
	//   66  134:iload_3         
	//   67  135:iconst_1        
	//   68  136:iadd            
	//   69  137:istore_3        
		if(true) goto _L5; else goto _L2
	//   70  138:goto            44
_L4:
		obj1 = ((Object) (x509certificate1));
	//   71  141:aload           6
	//   72  143:astore          7
		if(rootStore == null) goto _L7; else goto _L6
	//   73  145:aload_0         
	//   74  146:getfield        #137 <Field KeyStore rootStore>
	//   75  149:ifnull          227
_L6:
		obj2 = ((Object) (rootStore.aliases()));
	//   76  152:aload_0         
	//   77  153:getfield        #137 <Field KeyStore rootStore>
	//   78  156:invokevirtual   #143 <Method Enumeration KeyStore.aliases()>
	//   79  159:astore          8
_L10:
		obj1 = ((Object) (x509certificate1));
	//   80  161:aload           6
	//   81  163:astore          7
		if(!((Enumeration) (obj2)).hasMoreElements()) goto _L7; else goto _L8
	//   82  165:aload           8
	//   83  167:invokeinterface #149 <Method boolean Enumeration.hasMoreElements()>
	//   84  172:ifeq            227
_L8:
		obj1 = ((Object) ((String)((Enumeration) (obj2)).nextElement()));
	//   85  175:aload           8
	//   86  177:invokeinterface #153 <Method Object Enumeration.nextElement()>
	//   87  182:checkcast       #155 <Class String>
	//   88  185:astore          7
		if(!rootStore.isCertificateEntry(((String) (obj1))))
			continue; /* Loop/switch isn't completed */
	//   89  187:aload_0         
	//   90  188:getfield        #137 <Field KeyStore rootStore>
	//   91  191:aload           7
	//   92  193:invokevirtual   #159 <Method boolean KeyStore.isCertificateEntry(String)>
	//   93  196:ifeq            161
		obj1 = ((Object) ((X509Certificate)rootStore.getCertificate(((String) (obj1)))));
	//   94  199:aload_0         
	//   95  200:getfield        #137 <Field KeyStore rootStore>
	//   96  203:aload           7
	//   97  205:invokevirtual   #162 <Method Certificate KeyStore.getCertificate(String)>
	//   98  208:checkcast       #116 <Class X509Certificate>
	//   99  211:astore          7
		flag = isSignatureValid(basicocspresp, ((Certificate) (obj1)));
	//  100  213:aload_0         
	//  101  214:aload_1         
	//  102  215:aload           7
	//  103  217:invokevirtual   #103 <Method boolean isSignatureValid(BasicOCSPResp, Certificate)>
	//  104  220:istore          5
		if(!flag)
			continue; /* Loop/switch isn't completed */
	//  105  222:iload           5
	//  106  224:ifeq            161
_L7:
		obj2 = obj1;
	//  107  227:aload           7
	//  108  229:astore          8
		if(obj1 == null)
	//* 109  231:aload           7
	//* 110  233:ifnonnull       254
			throw new VerificationException(((Certificate) (x509certificate)), "OCSP response could not be verified");
	//  111  236:new             #128 <Class VerificationException>
	//  112  239:dup             
	//  113  240:aload_2         
	//  114  241:ldc1            #130 <String "OCSP response could not be verified">
	//  115  243:invokespecial   #133 <Method void VerificationException(Certificate, String)>
	//  116  246:athrow          
		break; /* Loop/switch isn't completed */
		basicocspresp;
	//  117  247:astore_1        
		obj1 = null;
	//  118  248:aconst_null     
	//  119  249:astore          7
		if(true) goto _L7; else goto _L2
	//  120  251:goto            227
_L2:
		((X509Certificate) (obj2)).verify(x509certificate.getPublicKey());
	//  121  254:aload           8
	//  122  256:aload_2         
	//  123  257:invokevirtual   #163 <Method java.security.PublicKey X509Certificate.getPublicKey()>
	//  124  260:invokevirtual   #167 <Method void X509Certificate.verify(java.security.PublicKey)>
		if(((X509Certificate) (obj2)).getExtensionValue(OCSPObjectIdentifiers.id_pkix_ocsp_nocheck.getId()) == null)
	//* 125  263:aload           8
	//* 126  265:getstatic       #173 <Field ASN1ObjectIdentifier OCSPObjectIdentifiers.id_pkix_ocsp_nocheck>
	//* 127  268:invokevirtual   #179 <Method String ASN1ObjectIdentifier.getId()>
	//* 128  271:invokevirtual   #183 <Method byte[] X509Certificate.getExtensionValue(String)>
	//* 129  274:ifnonnull       350
		{
			try
			{
				basicocspresp = ((BasicOCSPResp) (CertificateUtil.getCRL(((X509Certificate) (obj2)))));
	//  130  277:aload           8
	//  131  279:invokestatic    #189 <Method java.security.cert.CRL CertificateUtil.getCRL(X509Certificate)>
	//  132  282:astore_1        
			}
	//* 133  283:aload_1         
	//* 134  284:ifnull          350
	//* 135  287:aload_1         
	//* 136  288:instanceof      #191 <Class X509CRL>
	//* 137  291:ifeq            350
	//* 138  294:new             #193 <Class CRLVerifier>
	//* 139  297:dup             
	//* 140  298:aconst_null     
	//* 141  299:aconst_null     
	//* 142  300:invokespecial   #195 <Method void CRLVerifier(CertificateVerifier, List)>
	//* 143  303:astore          6
	//* 144  305:aload           6
	//* 145  307:aload_0         
	//* 146  308:getfield        #137 <Field KeyStore rootStore>
	//* 147  311:invokevirtual   #199 <Method void CRLVerifier.setRootStore(KeyStore)>
	//* 148  314:aload           6
	//* 149  316:aload_0         
	//* 150  317:getfield        #203 <Field boolean onlineCheckingAllowed>
	//* 151  320:invokevirtual   #207 <Method void CRLVerifier.setOnlineCheckingAllowed(boolean)>
	//* 152  323:aload           6
	//* 153  325:aload_1         
	//* 154  326:checkcast       #191 <Class X509CRL>
	//* 155  329:aload           8
	//* 156  331:aload_2         
	//* 157  332:new             #209 <Class Date>
	//* 158  335:dup             
	//* 159  336:invokespecial   #210 <Method void Date()>
	//* 160  339:invokevirtual   #213 <Method boolean CRLVerifier.verify(X509CRL, X509Certificate, X509Certificate, Date)>
	//* 161  342:pop             
	//* 162  343:return          
			// Misplaced declaration of an exception variable
			catch(BasicOCSPResp basicocspresp)
	//* 163  344:astore_1        
			{
				basicocspresp = null;
	//  164  345:aconst_null     
	//  165  346:astore_1        
			}
			if(basicocspresp != null && (basicocspresp instanceof X509CRL))
			{
				CRLVerifier crlverifier = new CRLVerifier(((CertificateVerifier) (null)), ((List) (null)));
				crlverifier.setRootStore(rootStore);
				crlverifier.setOnlineCheckingAllowed(onlineCheckingAllowed);
				crlverifier.verify((X509CRL)basicocspresp, ((X509Certificate) (obj2)), x509certificate, new Date());
				return;
			}
		}
	//* 166  347:goto            283
		((X509Certificate) (obj2)).checkValidity();
	//  167  350:aload           8
	//  168  352:invokevirtual   #216 <Method void X509Certificate.checkValidity()>
		return;
	//  169  355:return          
		obj1;
	//  170  356:astore          7
		if(true) goto _L10; else goto _L9
	//  171  358:goto            161
_L9:
		obj1;
	//  172  361:astore          7
		  goto _L11
	//* 173  363:goto            134
	}

	public List verify(X509Certificate x509certificate, X509Certificate x509certificate1, Date date)
		throws GeneralSecurityException, IOException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #220 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #221 <Method void ArrayList()>
	//    3    7:astore          9
		int i = 0;
	//    4    9:iconst_0        
	//    5   10:istore          4
		int j = 0;
	//    6   12:iconst_0        
	//    7   13:istore          5
		if(ocsps != null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #31  <Field List ocsps>
	//*  10   19:ifnull          76
		{
			Iterator iterator = ocsps.iterator();
	//   11   22:aload_0         
	//   12   23:getfield        #31  <Field List ocsps>
	//   13   26:invokeinterface #225 <Method Iterator List.iterator()>
	//   14   31:astore          8
			do
			{
				i = j;
	//   15   33:iload           5
	//   16   35:istore          4
				if(!iterator.hasNext())
					break;
	//   17   37:aload           8
	//   18   39:invokeinterface #230 <Method boolean Iterator.hasNext()>
	//   19   44:ifeq            76
				if(verify((BasicOCSPResp)iterator.next(), x509certificate, x509certificate1, date))
	//*  20   47:aload_0         
	//*  21   48:aload           8
	//*  22   50:invokeinterface #233 <Method Object Iterator.next()>
	//*  23   55:checkcast       #45  <Class BasicOCSPResp>
	//*  24   58:aload_1         
	//*  25   59:aload_2         
	//*  26   60:aload_3         
	//*  27   61:invokevirtual   #236 <Method boolean verify(BasicOCSPResp, X509Certificate, X509Certificate, Date)>
	//*  28   64:ifeq            33
					j++;
	//   29   67:iload           5
	//   30   69:iconst_1        
	//   31   70:iadd            
	//   32   71:istore          5
			} while(true);
	//   33   73:goto            33
		}
		boolean flag1 = false;
	//   34   76:iconst_0        
	//   35   77:istore          7
		boolean flag = flag1;
	//   36   79:iload           7
	//   37   81:istore          6
		j = i;
	//   38   83:iload           4
	//   39   85:istore          5
		if(onlineCheckingAllowed)
	//*  40   87:aload_0         
	//*  41   88:getfield        #203 <Field boolean onlineCheckingAllowed>
	//*  42   91:ifeq            140
		{
			flag = flag1;
	//   43   94:iload           7
	//   44   96:istore          6
			j = i;
	//   45   98:iload           4
	//   46  100:istore          5
			if(i == 0)
	//*  47  102:iload           4
	//*  48  104:ifne            140
			{
				flag = flag1;
	//   49  107:iload           7
	//   50  109:istore          6
				j = i;
	//   51  111:iload           4
	//   52  113:istore          5
				if(verify(getOcspResponse(x509certificate, x509certificate1), x509certificate, x509certificate1, date))
	//*  53  115:aload_0         
	//*  54  116:aload_0         
	//*  55  117:aload_1         
	//*  56  118:aload_2         
	//*  57  119:invokevirtual   #238 <Method BasicOCSPResp getOcspResponse(X509Certificate, X509Certificate)>
	//*  58  122:aload_1         
	//*  59  123:aload_2         
	//*  60  124:aload_3         
	//*  61  125:invokevirtual   #236 <Method boolean verify(BasicOCSPResp, X509Certificate, X509Certificate, Date)>
	//*  62  128:ifeq            140
				{
					j = i + 1;
	//   63  131:iload           4
	//   64  133:iconst_1        
	//   65  134:iadd            
	//   66  135:istore          5
					flag = true;
	//   67  137:iconst_1        
	//   68  138:istore          6
				}
			}
		}
		LOGGER.info((new StringBuilder()).append("Valid OCSPs found: ").append(j).toString());
	//   69  140:getstatic       #23  <Field Logger LOGGER>
	//   70  143:new             #240 <Class StringBuilder>
	//   71  146:dup             
	//   72  147:invokespecial   #241 <Method void StringBuilder()>
	//   73  150:ldc1            #243 <String "Valid OCSPs found: ">
	//   74  152:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   75  155:iload           5
	//   76  157:invokevirtual   #250 <Method StringBuilder StringBuilder.append(int)>
	//   77  160:invokevirtual   #253 <Method String StringBuilder.toString()>
	//   78  163:invokeinterface #259 <Method void Logger.info(String)>
		if(j > 0)
	//*  79  168:iload           5
	//*  80  170:ifle            237
		{
			Class class1 = ((Object)this).getClass();
	//   81  173:aload_0         
	//   82  174:invokevirtual   #265 <Method Class Object.getClass()>
	//   83  177:astore          10
			StringBuilder stringbuilder = (new StringBuilder()).append("Valid OCSPs Found: ").append(j);
	//   84  179:new             #240 <Class StringBuilder>
	//   85  182:dup             
	//   86  183:invokespecial   #241 <Method void StringBuilder()>
	//   87  186:ldc2            #267 <String "Valid OCSPs Found: ">
	//   88  189:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   89  192:iload           5
	//   90  194:invokevirtual   #250 <Method StringBuilder StringBuilder.append(int)>
	//   91  197:astore          11
			String s;
			if(flag)
	//*  92  199:iload           6
	//*  93  201:ifeq            265
				s = " (online)";
	//   94  204:ldc2            #269 <String " (online)">
	//   95  207:astore          8
			else
	//*  96  209:aload           9
	//*  97  211:new             #271 <Class VerificationOK>
	//*  98  214:dup             
	//*  99  215:aload_1         
	//* 100  216:aload           10
	//* 101  218:aload           11
	//* 102  220:aload           8
	//* 103  222:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//* 104  225:invokevirtual   #253 <Method String StringBuilder.toString()>
	//* 105  228:invokespecial   #274 <Method void VerificationOK(X509Certificate, Class, String)>
	//* 106  231:invokeinterface #277 <Method boolean List.add(Object)>
	//* 107  236:pop             
	//* 108  237:aload_0         
	//* 109  238:getfield        #281 <Field CertificateVerifier verifier>
	//* 110  241:ifnull          262
	//* 111  244:aload           9
	//* 112  246:aload_0         
	//* 113  247:getfield        #281 <Field CertificateVerifier verifier>
	//* 114  250:aload_1         
	//* 115  251:aload_2         
	//* 116  252:aload_3         
	//* 117  253:invokevirtual   #285 <Method List CertificateVerifier.verify(X509Certificate, X509Certificate, Date)>
	//* 118  256:invokeinterface #289 <Method boolean List.addAll(java.util.Collection)>
	//* 119  261:pop             
	//* 120  262:aload           9
	//* 121  264:areturn         
				s = "";
	//  122  265:ldc2            #291 <String "">
	//  123  268:astore          8
			((List) (arraylist)).add(((Object) (new VerificationOK(x509certificate, class1, stringbuilder.append(s).toString()))));
		}
		if(verifier != null)
			((List) (arraylist)).addAll(((java.util.Collection) (verifier.verify(x509certificate, x509certificate1, date))));
		return ((List) (arraylist));
	//* 124  270:goto            209
	}

	public boolean verify(BasicOCSPResp basicocspresp, X509Certificate x509certificate, X509Certificate x509certificate1, Date date)
		throws GeneralSecurityException, IOException
	{
		int i;
		Object obj;
		SingleResp asingleresp[];
		if(basicocspresp == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		asingleresp = basicocspresp.getResponses();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #49  <Method SingleResp[] BasicOCSPResp.getResponses()>
	//    6   10:astore          8
		i = 0;
	//    7   12:iconst_0        
	//    8   13:istore          5
		obj = ((Object) (x509certificate1));
	//    9   15:aload_3         
	//   10   16:astore          6
_L2:
		if(i >= asingleresp.length)
			break MISSING_BLOCK_LABEL_258;
	//   11   18:iload           5
	//   12   20:aload           8
	//   13   22:arraylength     
	//   14   23:icmpge          258
		if(x509certificate.getSerialNumber().equals(((Object) (asingleresp[i].getCertID().getSerialNumber()))))
			break; /* Loop/switch isn't completed */
	//   15   26:aload_2         
	//   16   27:invokevirtual   #296 <Method BigInteger X509Certificate.getSerialNumber()>
	//   17   30:aload           8
	//   18   32:iload           5
	//   19   34:aaload          
	//   20   35:invokevirtual   #300 <Method CertificateID SingleResp.getCertID()>
	//   21   38:invokevirtual   #303 <Method BigInteger CertificateID.getSerialNumber()>
	//   22   41:invokevirtual   #308 <Method boolean BigInteger.equals(Object)>
	//   23   44:ifne            56
_L3:
		i++;
	//   24   47:iload           5
	//   25   49:iconst_1        
	//   26   50:iadd            
	//   27   51:istore          5
		if(true) goto _L2; else goto _L1
	//   28   53:goto            18
_L1:
		x509certificate1 = ((X509Certificate) (obj));
	//   29   56:aload           6
	//   30   58:astore_3        
		if(obj == null)
	//*  31   59:aload           6
	//*  32   61:ifnonnull       66
			x509certificate1 = x509certificate;
	//   33   64:aload_2         
	//   34   65:astore_3        
		if(asingleresp[i].getCertID().matchesIssuer(new X509CertificateHolder(x509certificate1.getEncoded()), ((org.spongycastle.operator.DigestCalculatorProvider) (new BcDigestCalculatorProvider()))))
			break MISSING_BLOCK_LABEL_123;
	//   35   66:aload           8
	//   36   68:iload           5
	//   37   70:aaload          
	//   38   71:invokevirtual   #300 <Method CertificateID SingleResp.getCertID()>
	//   39   74:new             #310 <Class X509CertificateHolder>
	//   40   77:dup             
	//   41   78:aload_3         
	//   42   79:invokevirtual   #314 <Method byte[] X509Certificate.getEncoded()>
	//   43   82:invokespecial   #317 <Method void X509CertificateHolder(byte[])>
	//   44   85:new             #319 <Class BcDigestCalculatorProvider>
	//   45   88:dup             
	//   46   89:invokespecial   #320 <Method void BcDigestCalculatorProvider()>
	//   47   92:invokevirtual   #324 <Method boolean CertificateID.matchesIssuer(X509CertificateHolder, org.spongycastle.operator.DigestCalculatorProvider)>
	//   48   95:ifne            123
		LOGGER.info("OCSP: Issuers doesn't match.");
	//   49   98:getstatic       #23  <Field Logger LOGGER>
	//   50  101:ldc2            #326 <String "OCSP: Issuers doesn't match.">
	//   51  104:invokeinterface #259 <Method void Logger.info(String)>
		obj = ((Object) (x509certificate1));
	//   52  109:aload_3         
	//   53  110:astore          6
		  goto _L3
	//*  54  112:goto            47
		obj;
	//   55  115:astore          6
		obj = ((Object) (x509certificate1));
	//   56  117:aload_3         
	//   57  118:astore          6
		  goto _L3
	//*  58  120:goto            47
label0:
		{
			Date date1 = asingleresp[i].getNextUpdate();
	//   59  123:aload           8
	//   60  125:iload           5
	//   61  127:aaload          
	//   62  128:invokevirtual   #330 <Method Date SingleResp.getNextUpdate()>
	//   63  131:astore          7
			obj = ((Object) (date1));
	//   64  133:aload           7
	//   65  135:astore          6
			if(date1 == null)
	//*  66  137:aload           7
	//*  67  139:ifnonnull       189
			{
				obj = ((Object) (new Date(asingleresp[i].getThisUpdate().getTime() + 0x2bf20L)));
	//   68  142:new             #209 <Class Date>
	//   69  145:dup             
	//   70  146:aload           8
	//   71  148:iload           5
	//   72  150:aaload          
	//   73  151:invokevirtual   #333 <Method Date SingleResp.getThisUpdate()>
	//   74  154:invokevirtual   #337 <Method long Date.getTime()>
	//   75  157:ldc2w           #338 <Long 0x2bf20L>
	//   76  160:ladd            
	//   77  161:invokespecial   #342 <Method void Date(long)>
	//   78  164:astore          6
				LOGGER.info(String.format("No 'next update' for OCSP Response; assuming %s", new Object[] {
					obj
				}));
	//   79  166:getstatic       #23  <Field Logger LOGGER>
	//   80  169:ldc2            #344 <String "No 'next update' for OCSP Response; assuming %s">
	//   81  172:iconst_1        
	//   82  173:anewarray       Object[]
	//   83  176:dup             
	//   84  177:iconst_0        
	//   85  178:aload           6
	//   86  180:aastore         
	//   87  181:invokestatic    #348 <Method String String.format(String, Object[])>
	//   88  184:invokeinterface #259 <Method void Logger.info(String)>
			}
			if(!date.after(((Date) (obj))))
				break label0;
	//   89  189:aload           4
	//   90  191:aload           6
	//   91  193:invokevirtual   #352 <Method boolean Date.after(Date)>
	//   92  196:ifeq            233
			LOGGER.info(String.format("OCSP no longer valid: %s after %s", new Object[] {
				date, obj
			}));
	//   93  199:getstatic       #23  <Field Logger LOGGER>
	//   94  202:ldc2            #354 <String "OCSP no longer valid: %s after %s">
	//   95  205:iconst_2        
	//   96  206:anewarray       Object[]
	//   97  209:dup             
	//   98  210:iconst_0        
	//   99  211:aload           4
	//  100  213:aastore         
	//  101  214:dup             
	//  102  215:iconst_1        
	//  103  216:aload           6
	//  104  218:aastore         
	//  105  219:invokestatic    #348 <Method String String.format(String, Object[])>
	//  106  222:invokeinterface #259 <Method void Logger.info(String)>
			obj = ((Object) (x509certificate1));
	//  107  227:aload_3         
	//  108  228:astore          6
		}
		  goto _L3
	//* 109  230:goto            47
		obj = ((Object) (x509certificate1));
	//  110  233:aload_3         
	//  111  234:astore          6
		if(asingleresp[i].getCertStatus() != CertificateStatus.GOOD) goto _L3; else goto _L4
	//  112  236:aload           8
	//  113  238:iload           5
	//  114  240:aaload          
	//  115  241:invokevirtual   #55  <Method CertificateStatus SingleResp.getCertStatus()>
	//  116  244:getstatic       #61  <Field CertificateStatus CertificateStatus.GOOD>
	//  117  247:if_acmpne       47
_L4:
		isValidResponse(basicocspresp, x509certificate1);
	//  118  250:aload_0         
	//  119  251:aload_1         
	//  120  252:aload_3         
	//  121  253:invokevirtual   #356 <Method void isValidResponse(BasicOCSPResp, X509Certificate)>
		return true;
	//  122  256:iconst_1        
	//  123  257:ireturn         
		return false;
	//  124  258:iconst_0        
	//  125  259:ireturn         
	}

	public boolean verifyResponse(BasicOCSPResp basicocspresp, X509Certificate x509certificate)
	{
		try
		{
			isValidResponse(basicocspresp, x509certificate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #356 <Method void isValidResponse(BasicOCSPResp, X509Certificate)>
		}
	//*   4    6:iconst_1        
	//*   5    7:ireturn         
		// Misplaced declaration of an exception variable
		catch(BasicOCSPResp basicocspresp)
	//*   6    8:astore_1        
		{
			return false;
	//    7    9:iconst_0        
	//    8   10:ireturn         
		}
		return true;
	}

	protected static final Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/security/OCSPVerifier);
	protected static final String id_kp_OCSPSigning = "1.3.6.1.5.5.7.3.9";
	protected List ocsps;

	static 
	{
	//    0    0:ldc1            #2   <Class OCSPVerifier>
	//    1    2:invokestatic    #21  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #23  <Field Logger LOGGER>
	//*   3    8:return          
	}
}
