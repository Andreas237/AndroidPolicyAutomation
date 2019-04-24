// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal.gmsg;


// Referenced classes of package com.google.android.gms.ads.internal.gmsg:
//			HttpClient

static final class HttpClient$zza
{

	public final String getKey()
	{
		return mKey;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String mKey>
	//    2    4:areturn         
	}

	public final String getValue()
	{
		return mValue;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String mValue>
	//    2    4:areturn         
	}

	private final String mKey;
	private final String mValue;

	public HttpClient$zza(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mKey = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String mKey>
		mValue = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field String mValue>
	//    8   14:return          
	}
}
