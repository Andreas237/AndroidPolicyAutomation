// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import java.security.KeyStore;
import java.security.cert.*;
import java.util.*;
import org.spongycastle.cert.ocsp.BasicOCSPResp;
import org.spongycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder;
import org.spongycastle.operator.jcajce.JcaContentVerifierProviderBuilder;
import org.spongycastle.tsp.TimeStampToken;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			VerificationException

public class CertificateVerification
{

	public CertificateVerification()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String verifyCertificate(X509Certificate x509certificate, Collection collection, Calendar calendar)
	{
		Object obj;
		obj = ((Object) (calendar));
	//    0    0:aload_2         
	//    1    1:astore          4
		if(calendar == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       16
			obj = ((Object) (new GregorianCalendar()));
	//    4    7:new             #17  <Class GregorianCalendar>
	//    5   10:dup             
	//    6   11:invokespecial   #18  <Method void GregorianCalendar()>
	//    7   14:astore          4
		if(!x509certificate.hasUnsupportedCriticalExtension()) goto _L2; else goto _L1
	//    8   16:aload_0         
	//    9   17:invokevirtual   #24  <Method boolean X509Certificate.hasUnsupportedCriticalExtension()>
	//   10   20:ifeq            101
_L1:
		calendar = ((Calendar) (x509certificate.getCriticalExtensionOIDs().iterator()));
	//   11   23:aload_0         
	//   12   24:invokevirtual   #28  <Method Set X509Certificate.getCriticalExtensionOIDs()>
	//   13   27:invokeinterface #34  <Method Iterator Set.iterator()>
	//   14   32:astore_2        
_L5:
		if(!((Iterator) (calendar)).hasNext()) goto _L2; else goto _L3
	//   15   33:aload_2         
	//   16   34:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//   17   39:ifeq            101
_L3:
		String s = (String)((Iterator) (calendar)).next();
	//   18   42:aload_2         
	//   19   43:invokeinterface #43  <Method Object Iterator.next()>
	//   20   48:checkcast       #45  <Class String>
	//   21   51:astore          5
		if("2.5.29.15".equals(((Object) (s))) && x509certificate.getKeyUsage()[0]) goto _L5; else goto _L4
	//   22   53:ldc1            #47  <String "2.5.29.15">
	//   23   55:aload           5
	//   24   57:invokevirtual   #51  <Method boolean String.equals(Object)>
	//   25   60:ifeq            72
	//   26   63:aload_0         
	//   27   64:invokevirtual   #55  <Method boolean[] X509Certificate.getKeyUsage()>
	//   28   67:iconst_0        
	//   29   68:baload          
	//   30   69:ifne            33
_L4:
		boolean flag;
		if(!"2.5.29.37".equals(((Object) (s))))
			break; /* Loop/switch isn't completed */
	//   31   72:ldc1            #57  <String "2.5.29.37">
	//   32   74:aload           5
	//   33   76:invokevirtual   #51  <Method boolean String.equals(Object)>
	//   34   79:ifeq            98
		flag = x509certificate.getExtendedKeyUsage().contains("1.3.6.1.5.5.7.3.8");
	//   35   82:aload_0         
	//   36   83:invokevirtual   #61  <Method List X509Certificate.getExtendedKeyUsage()>
	//   37   86:ldc1            #63  <String "1.3.6.1.5.5.7.3.8">
	//   38   88:invokeinterface #68  <Method boolean List.contains(Object)>
	//   39   93:istore_3        
		if(flag) goto _L5; else goto _L6
	//   40   94:iload_3         
	//   41   95:ifne            33
_L6:
		return "Has unsupported critical extension";
	//   42   98:ldc1            #70  <String "Has unsupported critical extension">
	//   43  100:areturn         
_L2:
label0:
		{
			try
			{
				x509certificate.checkValidity(((Calendar) (obj)).getTime());
	//   44  101:aload_0         
	//   45  102:aload           4
	//   46  104:invokevirtual   #76  <Method java.util.Date Calendar.getTime()>
	//   47  107:invokevirtual   #80  <Method void X509Certificate.checkValidity(java.util.Date)>
			}
	//*  48  110:aload_1         
	//*  49  111:ifnull          155
	//*  50  114:aload_1         
	//*  51  115:invokeinterface #83  <Method Iterator Collection.iterator()>
	//*  52  120:astore_1        
	//*  53  121:aload_1         
	//*  54  122:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//*  55  127:ifeq            155
	//*  56  130:aload_1         
	//*  57  131:invokeinterface #43  <Method Object Iterator.next()>
	//*  58  136:checkcast       #85  <Class CRL>
	//*  59  139:aload_0         
	//*  60  140:invokevirtual   #89  <Method boolean CRL.isRevoked(Certificate)>
	//*  61  143:ifeq            121
	//*  62  146:ldc1            #91  <String "Certificate revoked">
	//*  63  148:areturn         
			// Misplaced declaration of an exception variable
			catch(X509Certificate x509certificate)
	//*  64  149:astore_0        
			{
				return ((Exception) (x509certificate)).getMessage();
	//   65  150:aload_0         
	//   66  151:invokevirtual   #95  <Method String Exception.getMessage()>
	//   67  154:areturn         
			}
			if(collection == null)
				break label0;
			collection = ((Collection) (collection.iterator()));
			do
				if(!((Iterator) (collection)).hasNext())
					break label0;
			while(!((CRL)((Iterator) (collection)).next()).isRevoked(((Certificate) (x509certificate))));
			return "Certificate revoked";
		}
		return null;
	//   68  155:aconst_null     
	//   69  156:areturn         
		x509certificate;
	//   70  157:astore_0        
		if(true) goto _L6; else goto _L7
_L7:
	//*  71  158:goto            98
	}

	public static List verifyCertificates(Certificate acertificate[], KeyStore keystore, Calendar calendar)
	{
		return verifyCertificates(acertificate, keystore, ((Collection) (null)), calendar);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokestatic    #102 <Method List verifyCertificates(Certificate[], KeyStore, Collection, Calendar)>
	//    5    7:areturn         
	}

	public static List verifyCertificates(Certificate acertificate[], KeyStore keystore, Collection collection, Calendar calendar)
	{
		int i;
		Object obj;
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    0    0:new             #105 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void ArrayList()>
	//    3    7:astore          8
		obj = ((Object) (calendar));
	//    4    9:aload_3         
	//    5   10:astore          7
		if(calendar == null)
	//*   6   12:aload_3         
	//*   7   13:ifnonnull       25
			obj = ((Object) (new GregorianCalendar()));
	//    8   16:new             #17  <Class GregorianCalendar>
	//    9   19:dup             
	//   10   20:invokespecial   #18  <Method void GregorianCalendar()>
	//   11   23:astore          7
		i = 0;
	//   12   25:iconst_0        
	//   13   26:istore          4
_L13:
		if(i >= acertificate.length) goto _L2; else goto _L1
	//   14   28:iload           4
	//   15   30:aload_0         
	//   16   31:arraylength     
	//   17   32:icmpge          239
_L1:
		calendar = ((Calendar) ((X509Certificate)acertificate[i]));
	//   18   35:aload_0         
	//   19   36:iload           4
	//   20   38:aaload          
	//   21   39:checkcast       #20  <Class X509Certificate>
	//   22   42:astore_3        
		String s = verifyCertificate(((X509Certificate) (calendar)), collection, ((Calendar) (obj)));
	//   23   43:aload_3         
	//   24   44:aload_2         
	//   25   45:aload           7
	//   26   47:invokestatic    #108 <Method String verifyCertificate(X509Certificate, Collection, Calendar)>
	//   27   50:astore          9
		if(s != null)
	//*  28   52:aload           9
	//*  29   54:ifnull          75
			((List) (arraylist)).add(((Object) (new VerificationException(((Certificate) (calendar)), s))));
	//   30   57:aload           8
	//   31   59:new             #110 <Class VerificationException>
	//   32   62:dup             
	//   33   63:aload_3         
	//   34   64:aload           9
	//   35   66:invokespecial   #113 <Method void VerificationException(Certificate, String)>
	//   36   69:invokeinterface #116 <Method boolean List.add(Object)>
	//   37   74:pop             
		Object obj1 = ((Object) (keystore.aliases()));
	//   38   75:aload_1         
	//   39   76:invokevirtual   #122 <Method Enumeration KeyStore.aliases()>
	//   40   79:astore          9
_L6:
		boolean flag = ((Enumeration) (obj1)).hasMoreElements();
	//   41   81:aload           9
	//   42   83:invokeinterface #127 <Method boolean Enumeration.hasMoreElements()>
	//   43   88:istore          6
		if(!flag) goto _L4; else goto _L3
	//   44   90:iload           6
	//   45   92:ifeq            161
_L3:
		Object obj2 = ((Object) ((String)((Enumeration) (obj1)).nextElement()));
	//   46   95:aload           9
	//   47   97:invokeinterface #130 <Method Object Enumeration.nextElement()>
	//   48  102:checkcast       #45  <Class String>
	//   49  105:astore          10
		if(!keystore.isCertificateEntry(((String) (obj2)))) goto _L6; else goto _L5
	//   50  107:aload_1         
	//   51  108:aload           10
	//   52  110:invokevirtual   #134 <Method boolean KeyStore.isCertificateEntry(String)>
	//   53  113:ifeq            81
_L5:
		String s1;
		obj2 = ((Object) ((X509Certificate)keystore.getCertificate(((String) (obj2)))));
	//   54  116:aload_1         
	//   55  117:aload           10
	//   56  119:invokevirtual   #138 <Method Certificate KeyStore.getCertificate(String)>
	//   57  122:checkcast       #20  <Class X509Certificate>
	//   58  125:astore          10
		s1 = verifyCertificate(((X509Certificate) (obj2)), collection, ((Calendar) (obj)));
	//   59  127:aload           10
	//   60  129:aload_2         
	//   61  130:aload           7
	//   62  132:invokestatic    #108 <Method String verifyCertificate(X509Certificate, Collection, Calendar)>
	//   63  135:astore          11
		if(s1 != null) goto _L6; else goto _L7
	//   64  137:aload           11
	//   65  139:ifnonnull       81
_L7:
		((X509Certificate) (calendar)).verify(((X509Certificate) (obj2)).getPublicKey());
	//   66  142:aload_3         
	//   67  143:aload           10
	//   68  145:invokevirtual   #142 <Method java.security.PublicKey X509Certificate.getPublicKey()>
	//   69  148:invokevirtual   #146 <Method void X509Certificate.verify(java.security.PublicKey)>
_L14:
		return ((List) (arraylist));
	//   70  151:aload           8
	//   71  153:areturn         
		Exception exception1;
		exception1;
	//   72  154:astore          10
		  goto _L6
	//*  73  156:goto            81
		Exception exception;
		exception;
	//   74  159:astore          9
_L4:
		int j = 0;
	//   75  161:iconst_0        
	//   76  162:istore          5
_L12:
		if(j >= acertificate.length) goto _L9; else goto _L8
	//   77  164:iload           5
	//   78  166:aload_0         
	//   79  167:arraylength     
	//   80  168:icmpge          205
_L8:
		if(j != i) goto _L11; else goto _L10
	//   81  171:iload           5
	//   82  173:iload           4
	//   83  175:icmpne          187
_L10:
		j++;
	//   84  178:iload           5
	//   85  180:iconst_1        
	//   86  181:iadd            
	//   87  182:istore          5
		  goto _L12
	//*  88  184:goto            164
_L11:
		exception = ((Exception) ((X509Certificate)acertificate[j]));
	//   89  187:aload_0         
	//   90  188:iload           5
	//   91  190:aaload          
	//   92  191:checkcast       #20  <Class X509Certificate>
	//   93  194:astore          9
		((X509Certificate) (calendar)).verify(((X509Certificate) (exception)).getPublicKey());
	//   94  196:aload_3         
	//   95  197:aload           9
	//   96  199:invokevirtual   #142 <Method java.security.PublicKey X509Certificate.getPublicKey()>
	//   97  202:invokevirtual   #146 <Method void X509Certificate.verify(java.security.PublicKey)>
_L9:
		if(j == acertificate.length)
	//*  98  205:iload           5
	//*  99  207:aload_0         
	//* 100  208:arraylength     
	//* 101  209:icmpne          230
			((List) (arraylist)).add(((Object) (new VerificationException(((Certificate) (calendar)), "Cannot be verified against the KeyStore or the certificate chain"))));
	//  102  212:aload           8
	//  103  214:new             #110 <Class VerificationException>
	//  104  217:dup             
	//  105  218:aload_3         
	//  106  219:ldc1            #148 <String "Cannot be verified against the KeyStore or the certificate chain">
	//  107  221:invokespecial   #113 <Method void VerificationException(Certificate, String)>
	//  108  224:invokeinterface #116 <Method boolean List.add(Object)>
	//  109  229:pop             
		i++;
	//  110  230:iload           4
	//  111  232:iconst_1        
	//  112  233:iadd            
	//  113  234:istore          4
		  goto _L13
	//* 114  236:goto            28
_L2:
		if(((List) (arraylist)).size() == 0)
	//* 115  239:aload           8
	//* 116  241:invokeinterface #152 <Method int List.size()>
	//* 117  246:ifne            151
		{
			((List) (arraylist)).add(((Object) (new VerificationException(((Certificate) (null)), "Invalid state. Possible circular certificate chain"))));
	//  118  249:aload           8
	//  119  251:new             #110 <Class VerificationException>
	//  120  254:dup             
	//  121  255:aconst_null     
	//  122  256:ldc1            #154 <String "Invalid state. Possible circular certificate chain">
	//  123  258:invokespecial   #113 <Method void VerificationException(Certificate, String)>
	//  124  261:invokeinterface #116 <Method boolean List.add(Object)>
	//  125  266:pop             
			return ((List) (arraylist));
	//  126  267:aload           8
	//  127  269:areturn         
		}
		  goto _L14
		exception;
	//  128  270:astore          9
		  goto _L10
	//* 129  272:goto            178
		exception1;
	//  130  275:astore          10
		  goto _L6
	//* 131  277:goto            81
	}

	public static boolean verifyOcspCertificates(BasicOCSPResp basicocspresp, KeyStore keystore, String s)
	{
		String s1;
		s1 = s;
	//    0    0:aload_2         
	//    1    1:astore          4
		if(s == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       11
			s1 = "BC";
	//    4    7:ldc1            #159 <String "BC">
	//    5    9:astore          4
		s = ((String) (keystore.aliases()));
	//    6   11:aload_1         
	//    7   12:invokevirtual   #122 <Method Enumeration KeyStore.aliases()>
	//    8   15:astore_2        
_L2:
		boolean flag = ((Enumeration) (s)).hasMoreElements();
	//    9   16:aload_2         
	//   10   17:invokeinterface #127 <Method boolean Enumeration.hasMoreElements()>
	//   11   22:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_90;
	//   12   23:iload_3         
	//   13   24:ifeq            90
		Object obj = ((Object) ((String)((Enumeration) (s)).nextElement()));
	//   14   27:aload_2         
	//   15   28:invokeinterface #130 <Method Object Enumeration.nextElement()>
	//   16   33:checkcast       #45  <Class String>
	//   17   36:astore          5
		if(!keystore.isCertificateEntry(((String) (obj))))
			continue; /* Loop/switch isn't completed */
	//   18   38:aload_1         
	//   19   39:aload           5
	//   20   41:invokevirtual   #134 <Method boolean KeyStore.isCertificateEntry(String)>
	//   21   44:ifeq            16
		obj = ((Object) ((X509Certificate)keystore.getCertificate(((String) (obj)))));
	//   22   47:aload_1         
	//   23   48:aload           5
	//   24   50:invokevirtual   #138 <Method Certificate KeyStore.getCertificate(String)>
	//   25   53:checkcast       #20  <Class X509Certificate>
	//   26   56:astore          5
		flag = basicocspresp.isSignatureValid((new JcaContentVerifierProviderBuilder()).setProvider(s1).build(((X509Certificate) (obj)).getPublicKey()));
	//   27   58:aload_0         
	//   28   59:new             #161 <Class JcaContentVerifierProviderBuilder>
	//   29   62:dup             
	//   30   63:invokespecial   #162 <Method void JcaContentVerifierProviderBuilder()>
	//   31   66:aload           4
	//   32   68:invokevirtual   #166 <Method JcaContentVerifierProviderBuilder JcaContentVerifierProviderBuilder.setProvider(String)>
	//   33   71:aload           5
	//   34   73:invokevirtual   #142 <Method java.security.PublicKey X509Certificate.getPublicKey()>
	//   35   76:invokevirtual   #170 <Method org.spongycastle.operator.ContentVerifierProvider JcaContentVerifierProviderBuilder.build(java.security.PublicKey)>
	//   36   79:invokevirtual   #176 <Method boolean BasicOCSPResp.isSignatureValid(org.spongycastle.operator.ContentVerifierProvider)>
	//   37   82:istore_3        
		if(flag)
	//*  38   83:iload_3         
	//*  39   84:ifeq            16
			return true;
	//   40   87:iconst_1        
	//   41   88:ireturn         
		continue; /* Loop/switch isn't completed */
		basicocspresp;
	//   42   89:astore_0        
		return false;
	//   43   90:iconst_0        
	//   44   91:ireturn         
		Exception exception;
		exception;
	//   45   92:astore          5
		if(true) goto _L2; else goto _L1
	//   46   94:goto            16
_L1:
	}

	public static boolean verifyTimestampCertificates(TimeStampToken timestamptoken, KeyStore keystore, String s)
	{
		String s1;
		s1 = s;
	//    0    0:aload_2         
	//    1    1:astore          4
		if(s == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       11
			s1 = "BC";
	//    4    7:ldc1            #159 <String "BC">
	//    5    9:astore          4
		s = ((String) (keystore.aliases()));
	//    6   11:aload_1         
	//    7   12:invokevirtual   #122 <Method Enumeration KeyStore.aliases()>
	//    8   15:astore_2        
_L2:
		boolean flag = ((Enumeration) (s)).hasMoreElements();
	//    9   16:aload_2         
	//   10   17:invokeinterface #127 <Method boolean Enumeration.hasMoreElements()>
	//   11   22:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_83;
	//   12   23:iload_3         
	//   13   24:ifeq            83
		Object obj = ((Object) ((String)((Enumeration) (s)).nextElement()));
	//   14   27:aload_2         
	//   15   28:invokeinterface #130 <Method Object Enumeration.nextElement()>
	//   16   33:checkcast       #45  <Class String>
	//   17   36:astore          5
		if(!keystore.isCertificateEntry(((String) (obj))))
			continue; /* Loop/switch isn't completed */
	//   18   38:aload_1         
	//   19   39:aload           5
	//   20   41:invokevirtual   #134 <Method boolean KeyStore.isCertificateEntry(String)>
	//   21   44:ifeq            16
		obj = ((Object) ((X509Certificate)keystore.getCertificate(((String) (obj)))));
	//   22   47:aload_1         
	//   23   48:aload           5
	//   24   50:invokevirtual   #138 <Method Certificate KeyStore.getCertificate(String)>
	//   25   53:checkcast       #20  <Class X509Certificate>
	//   26   56:astore          5
		timestamptoken.isSignatureValid((new JcaSimpleSignerInfoVerifierBuilder()).setProvider(s1).build(((X509Certificate) (obj))));
	//   27   58:aload_0         
	//   28   59:new             #180 <Class JcaSimpleSignerInfoVerifierBuilder>
	//   29   62:dup             
	//   30   63:invokespecial   #181 <Method void JcaSimpleSignerInfoVerifierBuilder()>
	//   31   66:aload           4
	//   32   68:invokevirtual   #184 <Method JcaSimpleSignerInfoVerifierBuilder JcaSimpleSignerInfoVerifierBuilder.setProvider(String)>
	//   33   71:aload           5
	//   34   73:invokevirtual   #187 <Method org.spongycastle.cms.SignerInformationVerifier JcaSimpleSignerInfoVerifierBuilder.build(X509Certificate)>
	//   35   76:invokevirtual   #192 <Method boolean TimeStampToken.isSignatureValid(org.spongycastle.cms.SignerInformationVerifier)>
	//   36   79:pop             
		return true;
	//   37   80:iconst_1        
	//   38   81:ireturn         
		timestamptoken;
	//   39   82:astore_0        
		return false;
	//   40   83:iconst_0        
	//   41   84:ireturn         
		Exception exception;
		exception;
	//   42   85:astore          5
		if(true) goto _L2; else goto _L1
	//   43   87:goto            16
_L1:
	}
}
