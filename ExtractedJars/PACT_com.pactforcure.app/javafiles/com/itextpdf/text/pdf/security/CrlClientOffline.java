// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.ExceptionConverter;
import java.security.cert.*;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			CrlClient

public class CrlClientOffline
	implements CrlClient
{

	public CrlClientOffline(CRL crl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		crls = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void ArrayList()>
	//    6   12:putfield        #21  <Field ArrayList crls>
		try
		{
			crls.add(((Object) (((X509CRL)crl).getEncoded())));
	//    7   15:aload_0         
	//    8   16:getfield        #21  <Field ArrayList crls>
	//    9   19:aload_1         
	//   10   20:checkcast       #23  <Class X509CRL>
	//   11   23:invokevirtual   #27  <Method byte[] X509CRL.getEncoded()>
	//   12   26:invokevirtual   #31  <Method boolean ArrayList.add(Object)>
	//   13   29:pop             
			return;
	//   14   30:return          
		}
		// Misplaced declaration of an exception variable
		catch(CRL crl)
	//*  15   31:astore_1        
		{
			throw new ExceptionConverter(((Exception) (crl)));
	//   16   32:new             #33  <Class ExceptionConverter>
	//   17   35:dup             
	//   18   36:aload_1         
	//   19   37:invokespecial   #36  <Method void ExceptionConverter(Exception)>
	//   20   40:athrow          
		}
	}

	public CrlClientOffline(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		crls = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void ArrayList()>
	//    6   12:putfield        #21  <Field ArrayList crls>
		crls.add(((Object) (abyte0)));
	//    7   15:aload_0         
	//    8   16:getfield        #21  <Field ArrayList crls>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #31  <Method boolean ArrayList.add(Object)>
	//   11   23:pop             
	//   12   24:return          
	}

	public Collection getEncoded(X509Certificate x509certificate, String s)
	{
		return ((Collection) (crls));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ArrayList crls>
	//    2    4:areturn         
	}

	private ArrayList crls;
}
