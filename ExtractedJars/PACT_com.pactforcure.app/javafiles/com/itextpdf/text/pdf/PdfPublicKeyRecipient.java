// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.security.cert.Certificate;

public class PdfPublicKeyRecipient
{

	public PdfPublicKeyRecipient(Certificate certificate1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		certificate = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field Certificate certificate>
		permission = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #19  <Field int permission>
		cms = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #21  <Field byte[] cms>
		certificate = certificate1;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #17  <Field Certificate certificate>
		permission = i;
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:putfield        #19  <Field int permission>
	//   17   29:return          
	}

	public Certificate getCertificate()
	{
		return certificate;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Certificate certificate>
	//    2    4:areturn         
	}

	protected byte[] getCms()
	{
		return cms;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field byte[] cms>
	//    2    4:areturn         
	}

	public int getPermission()
	{
		return permission;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int permission>
	//    2    4:ireturn         
	}

	protected void setCms(byte abyte0[])
	{
		cms = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field byte[] cms>
	//    3    5:return          
	}

	private Certificate certificate;
	protected byte cms[];
	private int permission;
}
