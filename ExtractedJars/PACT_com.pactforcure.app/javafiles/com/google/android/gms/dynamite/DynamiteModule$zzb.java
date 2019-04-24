// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import android.content.Context;

// Referenced classes of package com.google.android.gms.dynamite:
//			DynamiteModule

public static interface DynamiteModule$zzb
{
	public static interface zza
	{

		public abstract int zzA(Context context, String s);

		public abstract DynamiteModule zza(Context context, String s, int i)
			throws DynamiteModule.zza;

		public abstract int zzb(Context context, String s, boolean flag)
			throws DynamiteModule.zza;
	}

	public static class zzb
	{

		public int zzaQD;
		public int zzaQE;
		public int zzaQF;

		public zzb()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzaQD = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #19  <Field int zzaQD>
			zzaQE = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #21  <Field int zzaQE>
			zzaQF = 0;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #23  <Field int zzaQF>
		//   11   19:return          
		}
	}


	public abstract zzb zza(Context context, String s, zza zza1)
		throws DynamiteModule$zza;
}
