// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzatr, zzba

public final class zzatq
{

	public static zzba zzl(Context context, String s, String s1)
	{
		return (new zzatr(context, s, s1)).zzak(5000);
	//    0    0:new             #8   <Class zzatr>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #12  <Method void zzatr(Context, String, String)>
	//    6   10:sipush          5000
	//    7   13:invokevirtual   #16  <Method zzba zzatr.zzak(int)>
	//    8   16:areturn         
	}
}
