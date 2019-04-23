// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bld, ble

public class bli
{

	public bli(bld bld, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = bld;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field bld a>
		b = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #18  <Field long b>
		c = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #20  <Field long c>
	//   11   20:return          
	}

	public bld a(ble ble)
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field bld a>
	//    2    4:areturn         
	}

	final bld a;
	final long b;
	final long c;
}
