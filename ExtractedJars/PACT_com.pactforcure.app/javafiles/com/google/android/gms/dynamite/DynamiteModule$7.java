// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import android.content.Context;

// Referenced classes of package com.google.android.gms.dynamite:
//			DynamiteModule

final class DynamiteModule$7
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
	//*  12   27:ifeq            69
			zzb.zzaQE = zza1.zzb(context, s, false);
	//   13   30:aload           4
	//   14   32:aload_3         
	//   15   33:aload_1         
	//   16   34:aload_2         
	//   17   35:iconst_0        
	//   18   36:invokeinterface #34  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
	//   19   41:putfield        #37  <Field int DynamiteModule$zzb$zzb.zzaQE>
		else
	//*  20   44:aload           4
	//*  21   46:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
	//*  22   49:ifne            86
	//*  23   52:aload           4
	//*  24   54:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaQE>
	//*  25   57:ifne            86
	//*  26   60:aload           4
	//*  27   62:iconst_0        
	//*  28   63:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQF>
	//*  29   66:aload           4
	//*  30   68:areturn         
			zzb.zzaQE = zza1.zzb(context, s, true);
	//   31   69:aload           4
	//   32   71:aload_3         
	//   33   72:aload_1         
	//   34   73:aload_2         
	//   35   74:iconst_1        
	//   36   75:invokeinterface #34  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
	//   37   80:putfield        #37  <Field int DynamiteModule$zzb$zzb.zzaQE>
		if(zzb.zzaQD == 0 && zzb.zzaQE == 0)
		{
			zzb.zzaQF = 0;
			return zzb;
		}
	//*  38   83:goto            44
		if(zzb.zzaQE >= zzb.zzaQD)
	//*  39   86:aload           4
	//*  40   88:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaQE>
	//*  41   91:aload           4
	//*  42   93:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
	//*  43   96:icmplt          108
		{
			zzb.zzaQF = 1;
	//   44   99:aload           4
	//   45  101:iconst_1        
	//   46  102:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQF>
			return zzb;
	//   47  105:aload           4
	//   48  107:areturn         
		} else
		{
			zzb.zzaQF = -1;
	//   49  108:aload           4
	//   50  110:iconst_m1       
	//   51  111:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQF>
			return zzb;
	//   52  114:aload           4
	//   53  116:areturn         
		}
	}

	DynamiteModule$7()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
