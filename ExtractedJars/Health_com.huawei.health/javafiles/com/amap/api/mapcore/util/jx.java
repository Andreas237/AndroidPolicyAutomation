// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			kb, gz, hm, hd

public class jx extends kb
{

	public transient jx(Context context, kb kb1, hd hd1, String s, Object aobj[])
	{
		super(kb1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #17  <Method void kb(kb)>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #19  <Field Context a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #21  <Field String b>
		e = hd1;
	//    9   16:aload_0         
	//   10   17:aload_3         
	//   11   18:putfield        #23  <Field hd e>
		f = aobj;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #25  <Field Object[] f>
	//   15   27:return          
	}

	private String a(Context context)
	{
		try
		{
			context = ((Context) (String.format(gz.c(b), f)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String b>
	//    2    4:invokestatic    #35  <Method String gz.c(String)>
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field Object[] f>
	//    5   11:invokestatic    #41  <Method String String.format(String, Object[])>
	//    6   14:astore_1        
		}
	//*   7   15:aload_1         
	//*   8   16:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   9   17:astore_1        
		{
			((Throwable) (context)).printStackTrace();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #45  <Method void Throwable.printStackTrace()>
			hm.c(((Throwable) (context)), "ofm", "gpj");
	//   12   22:aload_1         
	//   13   23:ldc1            #47  <String "ofm">
	//   14   25:ldc1            #49  <String "gpj">
	//   15   27:invokestatic    #54  <Method void hm.c(Throwable, String, String)>
			return "";
	//   16   30:ldc1            #56  <String "">
	//   17   32:areturn         
		}
		return ((String) (context));
	}

	private String b(Context context)
		throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException
	{
		context = ((Context) (a(context)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #74  <Method String a(Context)>
	//    3    5:astore_1        
		return gz.a(e.b(gz.a(((String) (context)))));
	//    4    6:aload_0         
	//    5    7:getfield        #23  <Field hd e>
	//    6   10:aload_1         
	//    7   11:invokestatic    #77  <Method byte[] gz.a(String)>
	//    8   14:invokevirtual   #82  <Method byte[] hd.b(byte[])>
	//    9   17:invokestatic    #85  <Method String gz.a(byte[])>
	//   10   20:areturn         
	}

	protected byte[] a(byte abyte0[])
		throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException
	{
		abyte0 = ((byte []) (gz.a(abyte0)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #85  <Method String gz.a(byte[])>
	//    2    4:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (abyte0))))
	//*   3    5:aload_1         
	//*   4    6:invokestatic    #92  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5    9:ifeq            14
		{
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		} else
		{
			String s = b(a);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #19  <Field Context a>
	//   11   19:invokespecial   #94  <Method String b(Context)>
	//   12   22:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   13   23:new             #96  <Class StringBuilder>
	//   14   26:dup             
	//   15   27:invokespecial   #98  <Method void StringBuilder()>
	//   16   30:astore_3        
			stringbuilder.append("{\"pinfo\":\"").append(s).append("\",\"els\":[");
	//   17   31:aload_3         
	//   18   32:ldc1            #100 <String "{\"pinfo\":\"">
	//   19   34:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   20   37:aload_2         
	//   21   38:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   22   41:ldc1            #106 <String "\",\"els\":[">
	//   23   43:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
			stringbuilder.append(((String) (abyte0)));
	//   25   47:aload_3         
	//   26   48:aload_1         
	//   27   49:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			stringbuilder.append("]}");
	//   29   53:aload_3         
	//   30   54:ldc1            #108 <String "]}">
	//   31   56:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
			return gz.a(stringbuilder.toString());
	//   33   60:aload_3         
	//   34   61:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   35   64:invokestatic    #77  <Method byte[] gz.a(String)>
	//   36   67:areturn         
		}
	}

	private Context a;
	private String b;
	private hd e;
	private Object f[];
}
