// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.interfaces.ECPrivateKey;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aix, aox, apd, aou

public final class aov
	implements aix
{

	public aov(ECPrivateKey ecprivatekey, byte abyte0[], String s, apd apd, aou aou)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		b = ecprivatekey;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field ECPrivateKey b>
		c = new aox(ecprivatekey);
	//    5    9:aload_0         
	//    6   10:new             #32  <Class aox>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #35  <Method void aox(ECPrivateKey)>
	//   10   18:putfield        #37  <Field aox c>
		e = abyte0;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #39  <Field byte[] e>
		d = s;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #41  <Field String d>
		f = apd;
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:putfield        #43  <Field apd f>
		g = aou;
	//   20   37:aload_0         
	//   21   38:aload           5
	//   22   40:putfield        #45  <Field aou g>
	//   23   43:return          
	}

	private static final byte a[] = new byte[0];
	private final ECPrivateKey b;
	private final aox c;
	private final String d;
	private final byte e[];
	private final apd f;
	private final aou g;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        byte[]
	//    2    3:putstatic       #23  <Field byte[] a>
	//*   3    6:return          
	}
}
