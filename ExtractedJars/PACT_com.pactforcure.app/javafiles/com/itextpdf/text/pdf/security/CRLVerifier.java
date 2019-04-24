// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import java.io.IOException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.*;
import java.util.*;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			RootStoreVerifier, CertificateUtil, VerificationOK, CertificateVerifier, 
//			VerificationException

public class CRLVerifier extends RootStoreVerifier
{

	public CRLVerifier(CertificateVerifier certificateverifier, List list)
	{
		super(certificateverifier);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void RootStoreVerifier(CertificateVerifier)>
		crls = list;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field List crls>
	//    6   10:return          
	}

	public X509CRL getCRL(X509Certificate x509certificate, X509Certificate x509certificate1)
	{
		if(x509certificate1 != null);
	//    0    0:aload_2         
	//    1    1:ifnonnull       4
		try
		{
			x509certificate = ((X509Certificate) (CertificateUtil.getCRLURL(x509certificate)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #41  <Method String CertificateUtil.getCRLURL(X509Certificate)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       15
	//*   7   13:aconst_null     
	//*   8   14:areturn         
	//*   9   15:getstatic       #19  <Field Logger LOGGER>
	//*  10   18:new             #43  <Class StringBuilder>
	//*  11   21:dup             
	//*  12   22:invokespecial   #45  <Method void StringBuilder()>
	//*  13   25:ldc1            #47  <String "Getting CRL from ">
	//*  14   27:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//*  15   30:aload_1         
	//*  16   31:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//*  17   34:invokevirtual   #55  <Method String StringBuilder.toString()>
	//*  18   37:invokeinterface #61  <Method void Logger.info(String)>
	//*  19   42:ldc1            #63  <String "X.509">
	//*  20   44:invokestatic    #69  <Method CertificateFactory CertificateFactory.getInstance(String)>
	//*  21   47:new             #71  <Class URL>
	//*  22   50:dup             
	//*  23   51:aload_1         
	//*  24   52:invokespecial   #73  <Method void URL(String)>
	//*  25   55:invokevirtual   #77  <Method java.io.InputStream URL.openStream()>
	//*  26   58:invokevirtual   #81  <Method java.security.cert.CRL CertificateFactory.generateCRL(java.io.InputStream)>
	//*  27   61:checkcast       #83  <Class X509CRL>
	//*  28   64:astore_1        
	//*  29   65:aload_1         
	//*  30   66:areturn         
		// Misplaced declaration of an exception variable
		catch(X509Certificate x509certificate)
	//*  31   67:astore_1        
		{
			return null;
	//   32   68:aconst_null     
	//   33   69:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(X509Certificate x509certificate)
	//*  34   70:astore_1        
		{
			return null;
	//   35   71:aconst_null     
	//   36   72:areturn         
		}
		if(x509certificate == null)
			return null;
		LOGGER.info((new StringBuilder()).append("Getting CRL from ").append(((String) (x509certificate))).toString());
		x509certificate = ((X509Certificate) ((X509CRL)CertificateFactory.getInstance("X.509").generateCRL((new URL(((String) (x509certificate)))).openStream())));
		return ((X509CRL) (x509certificate));
	}

	public boolean isSignatureValid(X509CRL x509crl, X509Certificate x509certificate)
	{
		if(x509certificate == null)
			break MISSING_BLOCK_LABEL_25;
	//    0    0:aload_2         
	//    1    1:ifnull          25
		x509crl.verify(x509certificate.getPublicKey());
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #91  <Method java.security.PublicKey X509Certificate.getPublicKey()>
	//    5    9:invokevirtual   #95  <Method void X509CRL.verify(java.security.PublicKey)>
		return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		x509certificate;
	//    8   14:astore_2        
		LOGGER.warn("CRL not issued by the same authority as the certificate that is being checked");
	//    9   15:getstatic       #19  <Field Logger LOGGER>
	//   10   18:ldc1            #97  <String "CRL not issued by the same authority as the certificate that is being checked">
	//   11   20:invokeinterface #100 <Method void Logger.warn(String)>
		if(rootStore == null)
	//*  12   25:aload_0         
	//*  13   26:getfield        #104 <Field KeyStore rootStore>
	//*  14   29:ifnonnull       34
			return false;
	//   15   32:iconst_0        
	//   16   33:ireturn         
		x509certificate = ((X509Certificate) (rootStore.aliases()));
	//   17   34:aload_0         
	//   18   35:getfield        #104 <Field KeyStore rootStore>
	//   19   38:invokevirtual   #110 <Method Enumeration KeyStore.aliases()>
	//   20   41:astore_2        
_L2:
		String s;
		if(!((Enumeration) (x509certificate)).hasMoreElements())
			break; /* Loop/switch isn't completed */
	//   21   42:aload_2         
	//   22   43:invokeinterface #116 <Method boolean Enumeration.hasMoreElements()>
	//   23   48:ifeq            99
		s = (String)((Enumeration) (x509certificate)).nextElement();
	//   24   51:aload_2         
	//   25   52:invokeinterface #120 <Method Object Enumeration.nextElement()>
	//   26   57:checkcast       #122 <Class String>
	//   27   60:astore_3        
		if(!rootStore.isCertificateEntry(s))
			continue; /* Loop/switch isn't completed */
	//   28   61:aload_0         
	//   29   62:getfield        #104 <Field KeyStore rootStore>
	//   30   65:aload_3         
	//   31   66:invokevirtual   #126 <Method boolean KeyStore.isCertificateEntry(String)>
	//   32   69:ifeq            42
		x509crl.verify(((X509Certificate)rootStore.getCertificate(s)).getPublicKey());
	//   33   72:aload_1         
	//   34   73:aload_0         
	//   35   74:getfield        #104 <Field KeyStore rootStore>
	//   36   77:aload_3         
	//   37   78:invokevirtual   #130 <Method java.security.cert.Certificate KeyStore.getCertificate(String)>
	//   38   81:checkcast       #87  <Class X509Certificate>
	//   39   84:invokevirtual   #91  <Method java.security.PublicKey X509Certificate.getPublicKey()>
	//   40   87:invokevirtual   #95  <Method void X509CRL.verify(java.security.PublicKey)>
		return true;
	//   41   90:iconst_1        
	//   42   91:ireturn         
		GeneralSecurityException generalsecurityexception;
		generalsecurityexception;
	//   43   92:astore_3        
		if(true) goto _L2; else goto _L1
	//   44   93:goto            42
		x509crl;
	//   45   96:astore_1        
		return false;
	//   46   97:iconst_0        
	//   47   98:ireturn         
_L1:
		return false;
	//   48   99:iconst_0        
	//   49  100:ireturn         
	}

	public List verify(X509Certificate x509certificate, X509Certificate x509certificate1, Date date)
		throws GeneralSecurityException, IOException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #133 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #134 <Method void ArrayList()>
	//    3    7:astore          9
		int i = 0;
	//    4    9:iconst_0        
	//    5   10:istore          4
		int j = 0;
	//    6   12:iconst_0        
	//    7   13:istore          5
		if(crls != null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #27  <Field List crls>
	//*  10   19:ifnull          76
		{
			Iterator iterator = crls.iterator();
	//   11   22:aload_0         
	//   12   23:getfield        #27  <Field List crls>
	//   13   26:invokeinterface #140 <Method Iterator List.iterator()>
	//   14   31:astore          8
			do
			{
				i = j;
	//   15   33:iload           5
	//   16   35:istore          4
				if(!iterator.hasNext())
					break;
	//   17   37:aload           8
	//   18   39:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//   19   44:ifeq            76
				if(verify((X509CRL)iterator.next(), x509certificate, x509certificate1, date))
	//*  20   47:aload_0         
	//*  21   48:aload           8
	//*  22   50:invokeinterface #148 <Method Object Iterator.next()>
	//*  23   55:checkcast       #83  <Class X509CRL>
	//*  24   58:aload_1         
	//*  25   59:aload_2         
	//*  26   60:aload_3         
	//*  27   61:invokevirtual   #151 <Method boolean verify(X509CRL, X509Certificate, X509Certificate, Date)>
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
	//*  41   88:getfield        #155 <Field boolean onlineCheckingAllowed>
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
				if(verify(getCRL(x509certificate, x509certificate1), x509certificate, x509certificate1, date))
	//*  53  115:aload_0         
	//*  54  116:aload_0         
	//*  55  117:aload_1         
	//*  56  118:aload_2         
	//*  57  119:invokevirtual   #157 <Method X509CRL getCRL(X509Certificate, X509Certificate)>
	//*  58  122:aload_1         
	//*  59  123:aload_2         
	//*  60  124:aload_3         
	//*  61  125:invokevirtual   #151 <Method boolean verify(X509CRL, X509Certificate, X509Certificate, Date)>
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
		LOGGER.info((new StringBuilder()).append("Valid CRLs found: ").append(j).toString());
	//   69  140:getstatic       #19  <Field Logger LOGGER>
	//   70  143:new             #43  <Class StringBuilder>
	//   71  146:dup             
	//   72  147:invokespecial   #45  <Method void StringBuilder()>
	//   73  150:ldc1            #159 <String "Valid CRLs found: ">
	//   74  152:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   75  155:iload           5
	//   76  157:invokevirtual   #162 <Method StringBuilder StringBuilder.append(int)>
	//   77  160:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   78  163:invokeinterface #61  <Method void Logger.info(String)>
		if(j > 0)
	//*  79  168:iload           5
	//*  80  170:ifle            235
		{
			Class class1 = ((Object)this).getClass();
	//   81  173:aload_0         
	//   82  174:invokevirtual   #168 <Method Class Object.getClass()>
	//   83  177:astore          10
			StringBuilder stringbuilder = (new StringBuilder()).append("Valid CRLs found: ").append(j);
	//   84  179:new             #43  <Class StringBuilder>
	//   85  182:dup             
	//   86  183:invokespecial   #45  <Method void StringBuilder()>
	//   87  186:ldc1            #159 <String "Valid CRLs found: ">
	//   88  188:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   89  191:iload           5
	//   90  193:invokevirtual   #162 <Method StringBuilder StringBuilder.append(int)>
	//   91  196:astore          11
			String s;
			if(flag)
	//*  92  198:iload           6
	//*  93  200:ifeq            263
				s = " (online)";
	//   94  203:ldc1            #170 <String " (online)">
	//   95  205:astore          8
			else
	//*  96  207:aload           9
	//*  97  209:new             #172 <Class VerificationOK>
	//*  98  212:dup             
	//*  99  213:aload_1         
	//* 100  214:aload           10
	//* 101  216:aload           11
	//* 102  218:aload           8
	//* 103  220:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//* 104  223:invokevirtual   #55  <Method String StringBuilder.toString()>
	//* 105  226:invokespecial   #175 <Method void VerificationOK(X509Certificate, Class, String)>
	//* 106  229:invokeinterface #179 <Method boolean List.add(Object)>
	//* 107  234:pop             
	//* 108  235:aload_0         
	//* 109  236:getfield        #183 <Field CertificateVerifier verifier>
	//* 110  239:ifnull          260
	//* 111  242:aload           9
	//* 112  244:aload_0         
	//* 113  245:getfield        #183 <Field CertificateVerifier verifier>
	//* 114  248:aload_1         
	//* 115  249:aload_2         
	//* 116  250:aload_3         
	//* 117  251:invokevirtual   #187 <Method List CertificateVerifier.verify(X509Certificate, X509Certificate, Date)>
	//* 118  254:invokeinterface #191 <Method boolean List.addAll(java.util.Collection)>
	//* 119  259:pop             
	//* 120  260:aload           9
	//* 121  262:areturn         
				s = "";
	//  122  263:ldc1            #193 <String "">
	//  123  265:astore          8
			((List) (arraylist)).add(((Object) (new VerificationOK(x509certificate, class1, stringbuilder.append(s).toString()))));
		}
		if(verifier != null)
			((List) (arraylist)).addAll(((java.util.Collection) (verifier.verify(x509certificate, x509certificate1, date))));
		return ((List) (arraylist));
	//* 124  267:goto            207
	}

	public boolean verify(X509CRL x509crl, X509Certificate x509certificate, X509Certificate x509certificate1, Date date)
		throws GeneralSecurityException
	{
		while(x509crl == null || date == null || !x509crl.getIssuerX500Principal().equals(((Object) (x509certificate.getIssuerX500Principal()))) || !date.after(x509crl.getThisUpdate()) || !date.before(x509crl.getNextUpdate())) 
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
	//*   2    4:aload           4
	//*   3    6:ifnonnull       11
			return false;
	//    4    9:iconst_0        
	//    5   10:ireturn         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #199 <Method X500Principal X509CRL.getIssuerX500Principal()>
	//    8   15:aload_2         
	//    9   16:invokevirtual   #200 <Method X500Principal X509Certificate.getIssuerX500Principal()>
	//   10   19:invokevirtual   #205 <Method boolean X500Principal.equals(Object)>
	//   11   22:ifeq            9
	//   12   25:aload           4
	//   13   27:aload_1         
	//   14   28:invokevirtual   #209 <Method Date X509CRL.getThisUpdate()>
	//   15   31:invokevirtual   #215 <Method boolean Date.after(Date)>
	//   16   34:ifeq            9
	//   17   37:aload           4
	//   18   39:aload_1         
	//   19   40:invokevirtual   #218 <Method Date X509CRL.getNextUpdate()>
	//   20   43:invokevirtual   #221 <Method boolean Date.before(Date)>
	//   21   46:ifeq            9
		if(isSignatureValid(x509crl, x509certificate1) && x509crl.isRevoked(((java.security.cert.Certificate) (x509certificate))))
	//*  22   49:aload_0         
	//*  23   50:aload_1         
	//*  24   51:aload_3         
	//*  25   52:invokevirtual   #223 <Method boolean isSignatureValid(X509CRL, X509Certificate)>
	//*  26   55:ifeq            77
	//*  27   58:aload_1         
	//*  28   59:aload_2         
	//*  29   60:invokevirtual   #227 <Method boolean X509CRL.isRevoked(java.security.cert.Certificate)>
	//*  30   63:ifeq            77
			throw new VerificationException(((java.security.cert.Certificate) (x509certificate)), "The certificate has been revoked.");
	//   31   66:new             #229 <Class VerificationException>
	//   32   69:dup             
	//   33   70:aload_2         
	//   34   71:ldc1            #231 <String "The certificate has been revoked.">
	//   35   73:invokespecial   #234 <Method void VerificationException(java.security.cert.Certificate, String)>
	//   36   76:athrow          
		else
			return true;
	//   37   77:iconst_1        
	//   38   78:ireturn         
	}

	protected static final Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/security/CRLVerifier);
	List crls;

	static 
	{
	//    0    0:ldc1            #2   <Class CRLVerifier>
	//    1    2:invokestatic    #17  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #19  <Field Logger LOGGER>
	//*   3    8:return          
	}
}
