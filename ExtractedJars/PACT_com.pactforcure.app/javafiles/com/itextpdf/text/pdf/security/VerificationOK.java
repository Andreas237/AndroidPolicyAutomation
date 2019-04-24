// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import java.security.Principal;
import java.security.cert.X509Certificate;

public class VerificationOK
{

	public VerificationOK(X509Certificate x509certificate, Class class1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		certificate = x509certificate;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field X509Certificate certificate>
		verifierClass = class1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field Class verifierClass>
		message = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #22  <Field String message>
	//   11   19:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:astore_1        
		if(certificate != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #18  <Field X509Certificate certificate>
	//*   6   12:ifnull          39
		{
			stringbuilder.append(certificate.getSubjectDN().getName());
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #18  <Field X509Certificate certificate>
	//   10   20:invokevirtual   #36  <Method Principal X509Certificate.getSubjectDN()>
	//   11   23:invokeinterface #41  <Method String Principal.getName()>
	//   12   28:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:pop             
			stringbuilder.append(" verified with ");
	//   14   32:aload_1         
	//   15   33:ldc1            #47  <String " verified with ">
	//   16   35:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   17   38:pop             
		}
		stringbuilder.append(verifierClass.getName());
	//   18   39:aload_1         
	//   19   40:aload_0         
	//   20   41:getfield        #20  <Field Class verifierClass>
	//   21   44:invokevirtual   #50  <Method String Class.getName()>
	//   22   47:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   23   50:pop             
		stringbuilder.append(": ");
	//   24   51:aload_1         
	//   25   52:ldc1            #52  <String ": ">
	//   26   54:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
		stringbuilder.append(message);
	//   28   58:aload_1         
	//   29   59:aload_0         
	//   30   60:getfield        #22  <Field String message>
	//   31   63:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
		return stringbuilder.toString();
	//   33   67:aload_1         
	//   34   68:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   35   71:areturn         
	}

	protected X509Certificate certificate;
	protected String message;
	protected Class verifierClass;
}
