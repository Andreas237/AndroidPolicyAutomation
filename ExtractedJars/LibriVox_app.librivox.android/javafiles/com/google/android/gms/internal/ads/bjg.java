// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bmi

final class bjg
{

	public bjg(long l, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		a = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #20  <Field long a>
		b = l + (long)i;
	//    5    9:aload_0         
	//    6   10:lload_1         
	//    7   11:iload_3         
	//    8   12:i2l             
	//    9   13:ladd            
	//   10   14:putfield        #22  <Field long b>
	//   11   17:return          
	}

	public final bjg a()
	{
		d = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #26  <Field bmi d>
		return e;
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field bjg e>
	//    5    9:areturn         
	}

	public final long a;
	public final long b;
	public boolean c;
	public bmi d;
	public bjg e;
}
