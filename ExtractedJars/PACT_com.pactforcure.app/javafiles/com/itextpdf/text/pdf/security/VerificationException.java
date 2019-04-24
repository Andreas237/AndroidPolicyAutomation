// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import java.security.GeneralSecurityException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

public class VerificationException extends GeneralSecurityException
{

	public VerificationException(Certificate certificate, String s)
	{
		if(certificate == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       29
			certificate = "Unknown";
	//    2    4:ldc1            #12  <String "Unknown">
	//    3    6:astore_1        
		else
	//*   4    7:aload_0         
	//*   5    8:ldc1            #14  <String "Certificate %s failed: %s">
	//*   6   10:iconst_2        
	//*   7   11:anewarray       Object[]
	//*   8   14:dup             
	//*   9   15:iconst_0        
	//*  10   16:aload_1         
	//*  11   17:aastore         
	//*  12   18:dup             
	//*  13   19:iconst_1        
	//*  14   20:aload_2         
	//*  15   21:aastore         
	//*  16   22:invokestatic    #22  <Method String String.format(String, Object[])>
	//*  17   25:invokespecial   #25  <Method void GeneralSecurityException(String)>
	//*  18   28:return          
			certificate = ((Certificate) (((X509Certificate)certificate).getSubjectDN().getName()));
	//   19   29:aload_1         
	//   20   30:checkcast       #27  <Class X509Certificate>
	//   21   33:invokevirtual   #31  <Method Principal X509Certificate.getSubjectDN()>
	//   22   36:invokeinterface #37  <Method String Principal.getName()>
	//   23   41:astore_1        
		super(String.format("Certificate %s failed: %s", new Object[] {
			certificate, s
		}));
	//*  24   42:goto            7
	}

	private static final long serialVersionUID = 0x2af5dd70L;
}
