// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.*;

public class CertificateVerifier
{

	public CertificateVerifier(CertificateVerifier certificateverifier)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		onlineCheckingAllowed = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #15  <Field boolean onlineCheckingAllowed>
		verifier = certificateverifier;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #17  <Field CertificateVerifier verifier>
	//    8   14:return          
	}

	public void setOnlineCheckingAllowed(boolean flag)
	{
		onlineCheckingAllowed = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #15  <Field boolean onlineCheckingAllowed>
	//    3    5:return          
	}

	public List verify(X509Certificate x509certificate, X509Certificate x509certificate1, Date date)
		throws GeneralSecurityException, IOException
	{
		if(date != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          9
			x509certificate.checkValidity(date);
	//    2    4:aload_1         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #32  <Method void X509Certificate.checkValidity(Date)>
		ArrayList arraylist;
		if(x509certificate1 != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          58
			x509certificate.verify(x509certificate1.getPublicKey());
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #36  <Method java.security.PublicKey X509Certificate.getPublicKey()>
	//   10   18:invokevirtual   #39  <Method void X509Certificate.verify(java.security.PublicKey)>
		else
	//*  11   21:new             #41  <Class ArrayList>
	//*  12   24:dup             
	//*  13   25:invokespecial   #42  <Method void ArrayList()>
	//*  14   28:astore          4
	//*  15   30:aload_0         
	//*  16   31:getfield        #17  <Field CertificateVerifier verifier>
	//*  17   34:ifnull          55
	//*  18   37:aload           4
	//*  19   39:aload_0         
	//*  20   40:getfield        #17  <Field CertificateVerifier verifier>
	//*  21   43:aload_1         
	//*  22   44:aload_2         
	//*  23   45:aload_3         
	//*  24   46:invokevirtual   #44  <Method List verify(X509Certificate, X509Certificate, Date)>
	//*  25   49:invokeinterface #50  <Method boolean List.addAll(java.util.Collection)>
	//*  26   54:pop             
	//*  27   55:aload           4
	//*  28   57:areturn         
			x509certificate.verify(x509certificate.getPublicKey());
	//   29   58:aload_1         
	//   30   59:aload_1         
	//   31   60:invokevirtual   #36  <Method java.security.PublicKey X509Certificate.getPublicKey()>
	//   32   63:invokevirtual   #39  <Method void X509Certificate.verify(java.security.PublicKey)>
		arraylist = new ArrayList();
		if(verifier != null)
			((List) (arraylist)).addAll(((java.util.Collection) (verifier.verify(x509certificate, x509certificate1, date))));
		return ((List) (arraylist));
	//*  33   66:goto            21
	}

	protected boolean onlineCheckingAllowed;
	protected CertificateVerifier verifier;
}
