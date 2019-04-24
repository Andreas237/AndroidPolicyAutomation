// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import android.content.Context;

// Referenced classes of package com.google.android.gms.dynamite:
//			DynamiteModule

final class DynamiteModule$5
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
		zzb.zzaQE = zza1.zzb(context, s, true);
	//   10   22:aload           4
	//   11   24:aload_3         
	//   12   25:aload_1         
	//   13   26:aload_2         
	//   14   27:iconst_1        
	//   15   28:invokeinterface #34  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
	//   16   33:putfield        #37  <Field int DynamiteModule$zzb$zzb.zzaQE>
		if(zzb.zzaQD == 0 && zzb.zzaQE == 0)
	//*  17   36:aload           4
	//*  18   38:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
	//*  19   41:ifne            61
	//*  20   44:aload           4
	//*  21   46:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaQE>
	//*  22   49:ifne            61
		{
			zzb.zzaQF = 0;
	//   23   52:aload           4
	//   24   54:iconst_0        
	//   25   55:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQF>
			return zzb;
	//   26   58:aload           4
	//   27   60:areturn         
		}
		if(zzb.zzaQD >= zzb.zzaQE)
	//*  28   61:aload           4
	//*  29   63:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
	//*  30   66:aload           4
	//*  31   68:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaQE>
	//*  32   71:icmplt          83
		{
			zzb.zzaQF = -1;
	//   33   74:aload           4
	//   34   76:iconst_m1       
	//   35   77:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQF>
			return zzb;
	//   36   80:aload           4
	//   37   82:areturn         
		} else
		{
			zzb.zzaQF = 1;
	//   38   83:aload           4
	//   39   85:iconst_1        
	//   40   86:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQF>
			return zzb;
	//   41   89:aload           4
	//   42   91:areturn         
		}
	}

	DynamiteModule$5()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
