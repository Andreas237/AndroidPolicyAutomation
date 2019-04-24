// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzwm, zzwl, zzwj, zzwh

public final class zzwk
{

	static final InputStream zzf(JSONObject jsonobject)
		throws JSONException
	{
		return ((InputStream) (new ByteArrayInputStream(jsonobject.toString().getBytes(UTF_8))));
	//    0    0:new             #46  <Class ByteArrayInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #52  <Method String JSONObject.toString()>
	//    4    8:getstatic       #25  <Field Charset UTF_8>
	//    5   11:invokevirtual   #58  <Method byte[] String.getBytes(Charset)>
	//    6   14:invokespecial   #61  <Method void ByteArrayInputStream(byte[])>
	//    7   17:areturn         
	}

	private static final Charset UTF_8 = Charset.forName("UTF-8");
	public static final zzwj zzbrc = new zzwm();
	private static final zzwh zzbrd;

	static 
	{
	//    0    0:ldc1            #17  <String "UTF-8">
	//    1    2:invokestatic    #23  <Method Charset Charset.forName(String)>
	//    2    5:putstatic       #25  <Field Charset UTF_8>
	//    3    8:new             #27  <Class zzwm>
	//    4   11:dup             
	//    5   12:invokespecial   #30  <Method void zzwm()>
	//    6   15:putstatic       #32  <Field zzwj zzbrc>
		zzbrd = zzwl.zzbre;
	//    7   18:getstatic       #37  <Field zzwh zzwl.zzbre>
	//    8   21:putstatic       #39  <Field zzwh zzbrd>
	//*   9   24:return          
	}
}
