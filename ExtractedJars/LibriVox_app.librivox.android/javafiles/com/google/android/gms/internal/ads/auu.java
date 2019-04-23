// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			auv, auw

final class auu
{

	static Iterable a()
	{
		return b;
	//    0    0:getstatic       #22  <Field Iterable b>
	//    1    3:areturn         
	}

	static Iterator b()
	{
		return a;
	//    0    0:getstatic       #17  <Field Iterator a>
	//    1    3:areturn         
	}

	private static final Iterator a = new auv();
	private static final Iterable b = new auw();

	static 
	{
	//    0    0:new             #12  <Class auv>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void auv()>
	//    3    7:putstatic       #17  <Field Iterator a>
	//    4   10:new             #19  <Class auw>
	//    5   13:dup             
	//    6   14:invokespecial   #20  <Method void auw()>
	//    7   17:putstatic       #22  <Field Iterable b>
	//*   8   20:return          
	}
}
