// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			ExternalDigest, DigestAlgorithms

public class ProviderDigest
	implements ExternalDigest
{

	public ProviderDigest(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		provider = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String provider>
	//    5    9:return          
	}

	public MessageDigest getMessageDigest(String s)
		throws GeneralSecurityException
	{
		return DigestAlgorithms.getMessageDigest(s, provider);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field String provider>
	//    3    5:invokestatic    #25  <Method MessageDigest DigestAlgorithms.getMessageDigest(String, String)>
	//    4    8:areturn         
	}

	private String provider;
}
