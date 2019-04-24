// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbfe

public final class zzbfg
{

	public static void zza(zzbfc zzbfc1, zzbfc zzbfc2)
	{
		if(zzbfc1.zzebk != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field zzbfe zzbfc.zzebk>
	//*   2    4:ifnull          21
			zzbfc2.zzebk = (zzbfe)zzbfc1.zzebk.clone();
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #39  <Field zzbfe zzbfc.zzebk>
	//    6   12:invokevirtual   #45  <Method Object zzbfe.clone()>
	//    7   15:checkcast       #41  <Class zzbfe>
	//    8   18:putfield        #39  <Field zzbfe zzbfc.zzebk>
	//    9   21:return          
	}

	private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
	protected static final Charset UTF_8 = Charset.forName("UTF-8");
	public static final Object zzebs = new Object();

	static 
	{
	//    0    0:ldc1            #13  <String "UTF-8">
	//    1    2:invokestatic    #19  <Method Charset Charset.forName(String)>
	//    2    5:putstatic       #21  <Field Charset UTF_8>
	//    3    8:ldc1            #23  <String "ISO-8859-1">
	//    4   10:invokestatic    #19  <Method Charset Charset.forName(String)>
	//    5   13:putstatic       #25  <Field Charset ISO_8859_1>
	//    6   16:new             #4   <Class Object>
	//    7   19:dup             
	//    8   20:invokespecial   #28  <Method void Object()>
	//    9   23:putstatic       #30  <Field Object zzebs>
	//*  10   26:return          
	}
}
