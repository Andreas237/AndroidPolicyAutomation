// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			kb, hg, hd

public class jw extends kb
{

	public jw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void kb()>
		a = ((hd) (new hg()));
	//    2    4:aload_0         
	//    3    5:new             #12  <Class hg>
	//    4    8:dup             
	//    5    9:invokespecial   #13  <Method void hg()>
	//    6   12:putfield        #15  <Field hd a>
	//    7   15:return          
	}

	public jw(kb kb1)
	{
		super(kb1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void kb(kb)>
		a = ((hd) (new hg()));
	//    3    5:aload_0         
	//    4    6:new             #12  <Class hg>
	//    5    9:dup             
	//    6   10:invokespecial   #13  <Method void hg()>
	//    7   13:putfield        #15  <Field hd a>
	//    8   16:return          
	}

	protected byte[] a(byte abyte0[])
		throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException
	{
		return a.b(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field hd a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #41  <Method byte[] hd.b(byte[])>
	//    4    8:areturn         
	}

	private hd a;
}
