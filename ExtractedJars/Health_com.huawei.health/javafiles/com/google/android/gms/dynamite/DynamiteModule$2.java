// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import android.content.Context;

// Referenced classes of package com.google.android.gms.dynamite:
//			DynamiteModule

final class DynamiteModule$2
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
		zzb.zzaSc = zza1.zzb(context, s, true);
	//    4    9:aload           4
	//    5   11:aload_3         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:iconst_1        
	//    9   15:invokeinterface #26  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
	//   10   20:putfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSc>
		if(zzb.zzaSc != 0)
	//*  11   23:aload           4
	//*  12   25:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSc>
	//*  13   28:ifeq            40
		{
			zzb.zzaSd = 1;
	//   14   31:aload           4
	//   15   33:iconst_1        
	//   16   34:putfield        #33  <Field int DynamiteModule$zzb$zzb.zzaSd>
			return zzb;
	//   17   37:aload           4
	//   18   39:areturn         
		}
		zzb.zzaSb = zza1.zzH(context, s);
	//   19   40:aload           4
	//   20   42:aload_3         
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:invokeinterface #37  <Method int DynamiteModule$zzb$zza.zzH(Context, String)>
	//   24   50:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSb>
		if(zzb.zzaSb != 0)
	//*  25   53:aload           4
	//*  26   55:getfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSb>
	//*  27   58:ifeq            67
			zzb.zzaSd = -1;
	//   28   61:aload           4
	//   29   63:iconst_m1       
	//   30   64:putfield        #33  <Field int DynamiteModule$zzb$zzb.zzaSd>
		return zzb;
	//   31   67:aload           4
	//   32   69:areturn         
	}

	DynamiteModule$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
