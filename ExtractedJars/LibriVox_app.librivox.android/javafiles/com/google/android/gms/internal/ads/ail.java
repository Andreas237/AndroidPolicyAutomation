// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aim, akh

public final class ail
{

	public static akh a(Context context, String s, String s1)
	{
		return (new aim(context, s, s1)).b(5000);
	//    0    0:new             #8   <Class aim>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #12  <Method void aim(Context, String, String)>
	//    6   10:sipush          5000
	//    7   13:invokevirtual   #16  <Method akh aim.b(int)>
	//    8   16:areturn         
	}
}
