// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal.ads:
//			brw, zzty

public final class bsd
{

	public bsd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static Future a(Context context, zzty zzty)
	{
		return (new brw(context)).a(zzty);
	//    0    0:new             #14  <Class brw>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #17  <Method void brw(Context)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #20  <Method Future brw.a(zzty)>
	//    6   12:areturn         
	}
}
