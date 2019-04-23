// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Date;

public final class ayw
{

	public static Date a(long l)
	{
		return new Date((l - 0x7c25b080L) * 1000L);
	//    0    0:new             #8   <Class Date>
	//    1    3:dup             
	//    2    4:lload_0         
	//    3    5:ldc2w           #9   <Long 0x7c25b080L>
	//    4    8:lsub            
	//    5    9:ldc2w           #11  <Long 1000L>
	//    6   12:lmul            
	//    7   13:invokespecial   #16  <Method void Date(long)>
	//    8   16:areturn         
	}
}
