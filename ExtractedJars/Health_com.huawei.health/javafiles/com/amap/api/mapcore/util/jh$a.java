// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.text.TextUtils;
import javax.net.ssl.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			jh

static class jh$a
	implements HostnameVerifier
{

	public void a(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #24  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			a = s;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #26  <Field String a>
			return;
	//    7   13:return          
		}
	}

	public boolean verify(String s, SSLSession sslsession)
	{
		HostnameVerifier hostnameverifier = HttpsURLConnection.getDefaultHostnameVerifier();
	//    0    0:invokestatic    #34  <Method HostnameVerifier HttpsURLConnection.getDefaultHostnameVerifier()>
	//    1    3:astore_3        
		if(!TextUtils.isEmpty(((CharSequence) (a))))
	//*   2    4:aload_0         
	//*   3    5:getfield        #26  <Field String a>
	//*   4    8:invokestatic    #24  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5   11:ifne            36
		{
			String s1 = a;
	//    6   14:aload_0         
	//    7   15:getfield        #26  <Field String a>
	//    8   18:astore          4
			a = null;
	//    9   20:aload_0         
	//   10   21:aconst_null     
	//   11   22:putfield        #26  <Field String a>
			if(s1.equals(((Object) (s))))
	//*  12   25:aload           4
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #40  <Method boolean String.equals(Object)>
	//*  15   31:ifeq            36
				return true;
	//   16   34:iconst_1        
	//   17   35:ireturn         
		}
		return hostnameverifier.verify(s, sslsession) || hostnameverifier.verify(s, sslsession);
	//   18   36:aload_3         
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokeinterface #42  <Method boolean HostnameVerifier.verify(String, SSLSession)>
	//   22   44:ifne            58
	//   23   47:aload_3         
	//   24   48:aload_1         
	//   25   49:aload_2         
	//   26   50:invokeinterface #42  <Method boolean HostnameVerifier.verify(String, SSLSession)>
	//   27   55:ifeq            60
	//   28   58:iconst_1        
	//   29   59:ireturn         
	//   30   60:iconst_0        
	//   31   61:ireturn         
	}

	private String a;

	private jh$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	jh$a(jh$1 jh$1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void jh$a()>
	//    2    4:return          
	}
}
