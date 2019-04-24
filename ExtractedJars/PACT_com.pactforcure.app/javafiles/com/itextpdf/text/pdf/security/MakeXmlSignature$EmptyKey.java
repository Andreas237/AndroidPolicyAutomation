// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import java.security.Key;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			MakeXmlSignature

private static class MakeXmlSignature$EmptyKey
	implements Key
{

	public static MakeXmlSignature$EmptyKey getInstance()
	{
		return instance;
	//    0    0:getstatic       #18  <Field MakeXmlSignature$EmptyKey instance>
	//    1    3:areturn         
	}

	public String getAlgorithm()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public byte[] getEncoded()
	{
		return new byte[0];
	//    0    0:iconst_0        
	//    1    1:newarray        byte[]
	//    2    3:areturn         
	}

	public String getFormat()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private static MakeXmlSignature$EmptyKey instance = new MakeXmlSignature$EmptyKey();

	static 
	{
	//    0    0:new             #2   <Class MakeXmlSignature$EmptyKey>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void MakeXmlSignature$EmptyKey()>
	//    3    7:putstatic       #18  <Field MakeXmlSignature$EmptyKey instance>
	//*   4   10:return          
	}

	private MakeXmlSignature$EmptyKey()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}
}
