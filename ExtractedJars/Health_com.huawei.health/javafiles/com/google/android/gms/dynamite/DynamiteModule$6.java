// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import android.content.Context;

// Referenced classes of package com.google.android.gms.dynamite:
//			DynamiteModule

final class DynamiteModule$6
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
		zzb.zzaSb = zza1.zzH(context, s);
	//    4    9:aload           4
	//    5   11:aload_3         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokeinterface #26  <Method int DynamiteModule$zzb$zza.zzH(Context, String)>
	//    9   19:putfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSb>
		if(zzb.zzaSb != 0)
	//*  10   22:aload           4
	//*  11   24:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSb>
	//*  12   27:ifeq            47
			zzb.zzaSc = zza1.zzb(context, s, false);
	//   13   30:aload           4
	//   14   32:aload_3         
	//   15   33:aload_1         
	//   16   34:aload_2         
	//   17   35:iconst_0        
	//   18   36:invokeinterface #34  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
	//   19   41:putfield        #37  <Field int DynamiteModule$zzb$zzb.zzaSc>
		else
	//*  20   44:goto            61
			zzb.zzaSc = zza1.zzb(context, s, true);
	//   21   47:aload           4
	//   22   49:aload_3         
	//   23   50:aload_1         
	//   24   51:aload_2         
	//   25   52:iconst_1        
	//   26   53:invokeinterface #34  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
	//   27   58:putfield        #37  <Field int DynamiteModule$zzb$zzb.zzaSc>
		if(zzb.zzaSb == 0 && zzb.zzaSc == 0)
	//*  28   61:aload           4
	//*  29   63:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSb>
	//*  30   66:ifne            86
	//*  31   69:aload           4
	//*  32   71:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaSc>
	//*  33   74:ifne            86
		{
			zzb.zzaSd = 0;
	//   34   77:aload           4
	//   35   79:iconst_0        
	//   36   80:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSd>
			return zzb;
	//   37   83:aload           4
	//   38   85:areturn         
		}
		if(zzb.zzaSc >= zzb.zzaSb)
	//*  39   86:aload           4
	//*  40   88:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaSc>
	//*  41   91:aload           4
	//*  42   93:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSb>
	//*  43   96:icmplt          108
		{
			zzb.zzaSd = 1;
	//   44   99:aload           4
	//   45  101:iconst_1        
	//   46  102:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSd>
			return zzb;
	//   47  105:aload           4
	//   48  107:areturn         
		} else
		{
			zzb.zzaSd = -1;
	//   49  108:aload           4
	//   50  110:iconst_m1       
	//   51  111:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSd>
			return zzb;
	//   52  114:aload           4
	//   53  116:areturn         
		}
	}

	DynamiteModule$6()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
