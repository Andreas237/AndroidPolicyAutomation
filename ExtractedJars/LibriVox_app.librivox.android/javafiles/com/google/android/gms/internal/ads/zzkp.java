// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bnf

public abstract class zzkp
	implements zzki.zza
{

	public zzkp(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		c = (String)bnf.a(((Object) (s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #19  <Method Object bnf.a(Object)>
	//    5    9:checkcast       #21  <Class String>
	//    6   12:putfield        #23  <Field String c>
	//    7   15:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final String c;
}
