// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import java.io.IOException;
import java.security.*;
import java.security.cert.X509Certificate;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			CertificateVerifier, VerificationOK

public class RootStoreVerifier extends CertificateVerifier
{

	public RootStoreVerifier(CertificateVerifier certificateverifier)
	{
		super(certificateverifier);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void CertificateVerifier(CertificateVerifier)>
		rootStore = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #25  <Field KeyStore rootStore>
	//    6   10:return          
	}

	public void setRootStore(KeyStore keystore)
	{
		rootStore = keystore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field KeyStore rootStore>
	//    3    5:return          
	}

	public List verify(X509Certificate x509certificate, X509Certificate x509certificate1, Date date)
		throws GeneralSecurityException, IOException
	{
		LOGGER.info((new StringBuilder()).append("Root store verification: ").append(x509certificate.getSubjectDN().getName()).toString());
	//    0    0:getstatic       #18  <Field Logger LOGGER>
	//    1    3:new             #35  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #37  <Method void StringBuilder()>
	//    4   10:ldc1            #39  <String "Root store verification: ">
	//    5   12:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_1         
	//    7   16:invokevirtual   #49  <Method Principal X509Certificate.getSubjectDN()>
	//    8   19:invokeinterface #55  <Method String Principal.getName()>
	//    9   24:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   10   27:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   11   30:invokeinterface #64  <Method void Logger.info(String)>
		if(rootStore == null)
	//*  12   35:aload_0         
	//*  13   36:getfield        #25  <Field KeyStore rootStore>
	//*  14   39:ifnonnull       50
			return super.verify(x509certificate, x509certificate1, date);
	//   15   42:aload_0         
	//   16   43:aload_1         
	//   17   44:aload_2         
	//   18   45:aload_3         
	//   19   46:invokespecial   #66  <Method List CertificateVerifier.verify(X509Certificate, X509Certificate, Date)>
	//   20   49:areturn         
		ArrayList arraylist;
		Enumeration enumeration;
		arraylist = new ArrayList();
	//   21   50:new             #68  <Class ArrayList>
	//   22   53:dup             
	//   23   54:invokespecial   #69  <Method void ArrayList()>
	//   24   57:astore          4
		enumeration = rootStore.aliases();
	//   25   59:aload_0         
	//   26   60:getfield        #25  <Field KeyStore rootStore>
	//   27   63:invokevirtual   #75  <Method Enumeration KeyStore.aliases()>
	//   28   66:astore          5
_L2:
		String s;
		if(!enumeration.hasMoreElements())
			break; /* Loop/switch isn't completed */
	//   29   68:aload           5
	//   30   70:invokeinterface #81  <Method boolean Enumeration.hasMoreElements()>
	//   31   75:ifeq            176
		s = (String)enumeration.nextElement();
	//   32   78:aload           5
	//   33   80:invokeinterface #85  <Method Object Enumeration.nextElement()>
	//   34   85:checkcast       #87  <Class String>
	//   35   88:astore          6
		if(!rootStore.isCertificateEntry(s))
			continue; /* Loop/switch isn't completed */
	//   36   90:aload_0         
	//   37   91:getfield        #25  <Field KeyStore rootStore>
	//   38   94:aload           6
	//   39   96:invokevirtual   #91  <Method boolean KeyStore.isCertificateEntry(String)>
	//   40   99:ifeq            68
		x509certificate.verify(((X509Certificate)rootStore.getCertificate(s)).getPublicKey());
	//   41  102:aload_1         
	//   42  103:aload_0         
	//   43  104:getfield        #25  <Field KeyStore rootStore>
	//   44  107:aload           6
	//   45  109:invokevirtual   #95  <Method java.security.cert.Certificate KeyStore.getCertificate(String)>
	//   46  112:checkcast       #45  <Class X509Certificate>
	//   47  115:invokevirtual   #99  <Method java.security.PublicKey X509Certificate.getPublicKey()>
	//   48  118:invokevirtual   #102 <Method void X509Certificate.verify(java.security.PublicKey)>
		LOGGER.info("Certificate verified against root store");
	//   49  121:getstatic       #18  <Field Logger LOGGER>
	//   50  124:ldc1            #104 <String "Certificate verified against root store">
	//   51  126:invokeinterface #64  <Method void Logger.info(String)>
		((List) (arraylist)).add(((Object) (new VerificationOK(x509certificate, ((Object)this).getClass(), "Certificate verified against root store."))));
	//   52  131:aload           4
	//   53  133:new             #106 <Class VerificationOK>
	//   54  136:dup             
	//   55  137:aload_1         
	//   56  138:aload_0         
	//   57  139:invokevirtual   #112 <Method Class Object.getClass()>
	//   58  142:ldc1            #114 <String "Certificate verified against root store.">
	//   59  144:invokespecial   #117 <Method void VerificationOK(X509Certificate, Class, String)>
	//   60  147:invokeinterface #123 <Method boolean List.add(Object)>
	//   61  152:pop             
		((List) (arraylist)).addAll(((java.util.Collection) (super.verify(x509certificate, x509certificate1, date))));
	//   62  153:aload           4
	//   63  155:aload_0         
	//   64  156:aload_1         
	//   65  157:aload_2         
	//   66  158:aload_3         
	//   67  159:invokespecial   #66  <Method List CertificateVerifier.verify(X509Certificate, X509Certificate, Date)>
	//   68  162:invokeinterface #127 <Method boolean List.addAll(java.util.Collection)>
	//   69  167:pop             
		return ((List) (arraylist));
	//   70  168:aload           4
	//   71  170:areturn         
		GeneralSecurityException generalsecurityexception1;
		generalsecurityexception1;
	//   72  171:astore          6
		if(true) goto _L2; else goto _L1
	//   73  173:goto            68
_L1:
		try
		{
			((List) (arraylist)).addAll(((java.util.Collection) (super.verify(x509certificate, x509certificate1, date))));
	//   74  176:aload           4
	//   75  178:aload_0         
	//   76  179:aload_1         
	//   77  180:aload_2         
	//   78  181:aload_3         
	//   79  182:invokespecial   #66  <Method List CertificateVerifier.verify(X509Certificate, X509Certificate, Date)>
	//   80  185:invokeinterface #127 <Method boolean List.addAll(java.util.Collection)>
	//   81  190:pop             
		}
	//*  82  191:aload           4
	//*  83  193:areturn         
		catch(GeneralSecurityException generalsecurityexception)
	//*  84  194:astore          4
		{
			return super.verify(x509certificate, x509certificate1, date);
	//   85  196:aload_0         
	//   86  197:aload_1         
	//   87  198:aload_2         
	//   88  199:aload_3         
	//   89  200:invokespecial   #66  <Method List CertificateVerifier.verify(X509Certificate, X509Certificate, Date)>
	//   90  203:areturn         
		}
		return ((List) (arraylist));
	}

	protected static final Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/security/RootStoreVerifier);
	protected KeyStore rootStore;

	static 
	{
	//    0    0:ldc1            #2   <Class RootStoreVerifier>
	//    1    2:invokestatic    #16  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #18  <Field Logger LOGGER>
	//*   3    8:return          
	}
}
