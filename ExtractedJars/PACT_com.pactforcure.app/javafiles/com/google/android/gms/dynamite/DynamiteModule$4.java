// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import android.content.Context;

// Referenced classes of package com.google.android.gms.dynamite:
//			DynamiteModule

final class DynamiteModule$4
	implements b
{

	public b.zzb zza(Context context, String s, b.zza zza1)
		throws a
	{
		b.zzb zzb = new b.zzb();
	//    0    0:new             #19  <Class DynamiteModule$zzb$zzb>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void DynamiteModule$zzb$zzb()>
	//    3    7:astore          4
		zzb.zzaQD = zza1.zzA(context, s);
	//    4    9:aload           4
	//    5   11:aload_3         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokeinterface #26  <Method int DynamiteModule$zzb$zza.zzA(Context, String)>
	//    9   19:putfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
		if(zzb.zzaQD != 0)
	//*  10   22:aload           4
	//*  11   24:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
	//*  12   27:ifeq            39
		{
			zzb.zzaQF = -1;
	//   13   30:aload           4
	//   14   32:iconst_m1       
	//   15   33:putfield        #33  <Field int DynamiteModule$zzb$zzb.zzaQF>
		} else
	//*  16   36:aload           4
	//*  17   38:areturn         
		{
			zzb.zzaQE = zza1.zzb(context, s, true);
	//   18   39:aload           4
	//   19   41:aload_3         
	//   20   42:aload_1         
	//   21   43:aload_2         
	//   22   44:iconst_1        
	//   23   45:invokeinterface #37  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
	//   24   50:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQE>
			if(zzb.zzaQE != 0)
	//*  25   53:aload           4
	//*  26   55:getfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQE>
	//*  27   58:ifeq            36
			{
				zzb.zzaQF = 1;
	//   28   61:aload           4
	//   29   63:iconst_1        
	//   30   64:putfield        #33  <Field int DynamiteModule$zzb$zzb.zzaQF>
				return zzb;
	//   31   67:aload           4
	//   32   69:areturn         
			}
		}
		return zzb;
	}

	DynamiteModule$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
