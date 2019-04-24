// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import android.content.Context;

// Referenced classes of package com.google.android.gms.dynamite:
//			DynamiteModule

final class DynamiteModule$8
	implements b.zza
{

	public int zzA(Context context, String s)
	{
		return zzaQC;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int zzaQC>
	//    2    4:ireturn         
	}

	public DynamiteModule zza(Context context, String s, int i)
		throws a
	{
		throw new a("local only VersionPolicy should not load from remote", ((DynamiteModule$1) (null)));
	//    0    0:new             #26  <Class DynamiteModule$zza>
	//    1    3:dup             
	//    2    4:ldc1            #28  <String "local only VersionPolicy should not load from remote">
	//    3    6:aconst_null     
	//    4    7:invokespecial   #31  <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//    5   10:athrow          
	}

	public int zzb(Context context, String s, boolean flag)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	final int zzaQC;

	DynamiteModule$8(int i)
	{
		zzaQC = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field int zzaQC>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
