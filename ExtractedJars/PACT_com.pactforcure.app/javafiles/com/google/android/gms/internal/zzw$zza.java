// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

// Referenced classes of package com.google.android.gms.internal:
//			zzw

public static final class zzw$zza extends HttpEntityEnclosingRequestBase
{

	public String getMethod()
	{
		return "PATCH";
	//    0    0:ldc1            #27  <String "PATCH">
	//    1    2:areturn         
	}

	public zzw$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void HttpEntityEnclosingRequestBase()>
	//    2    4:return          
	}

	public zzw$zza(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void HttpEntityEnclosingRequestBase()>
		setURI(URI.create(s));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #19  <Method URI URI.create(String)>
	//    5    9:invokevirtual   #23  <Method void setURI(URI)>
	//    6   12:return          
	}
}
