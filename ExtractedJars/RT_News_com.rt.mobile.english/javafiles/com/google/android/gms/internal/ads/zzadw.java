// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.DeviceProperties;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzady, zzkb, zzamu, zznk, 
//			zzni, zzang, zzadv

final class zzadw
	implements zzady
{

	zzadw(Context context)
	{
		val$context = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field Context val$context>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final boolean zza(zzang zzang1)
	{
		zzkb.zzif();
	//    0    0:invokestatic    #24  <Method zzamu zzkb.zzif()>
	//    1    3:pop             
		boolean flag1 = zzamu.zzbe(val$context);
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field Context val$context>
	//    4    8:invokestatic    #30  <Method boolean zzamu.zzbe(Context)>
	//    5   11:istore_3        
		zzna zzna = zznk.zzbeq;
	//    6   12:getstatic       #36  <Field zzna zznk.zzbeq>
	//    7   15:astore          4
		boolean flag;
		if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue() && zzang1.zzcvg)
	//*   8   17:invokestatic    #40  <Method zzni zzkb.zzik()>
	//*   9   20:aload           4
	//*  10   22:invokevirtual   #46  <Method Object zzni.zzd(zzna)>
	//*  11   25:checkcast       #48  <Class Boolean>
	//*  12   28:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//*  13   31:ifeq            46
	//*  14   34:aload_1         
	//*  15   35:getfield        #58  <Field boolean zzang.zzcvg>
	//*  16   38:ifeq            46
			flag = true;
	//   17   41:iconst_1        
	//   18   42:istore_2        
		else
	//*  19   43:goto            48
			flag = false;
	//   20   46:iconst_0        
	//   21   47:istore_2        
		if(zzadv.zzd(val$context, zzang1.zzcvg) && flag1 && !flag)
	//*  22   48:aload_0         
	//*  23   49:getfield        #12  <Field Context val$context>
	//*  24   52:aload_1         
	//*  25   53:getfield        #58  <Field boolean zzang.zzcvg>
	//*  26   56:invokestatic    #63  <Method boolean zzadv.zzd(Context, boolean)>
	//*  27   59:ifeq            104
	//*  28   62:iload_3         
	//*  29   63:ifeq            104
	//*  30   66:iload_2         
	//*  31   67:ifne            104
		{
			if(DeviceProperties.isSidewinder(val$context))
	//*  32   70:aload_0         
	//*  33   71:getfield        #12  <Field Context val$context>
	//*  34   74:invokestatic    #68  <Method boolean DeviceProperties.isSidewinder(Context)>
	//*  35   77:ifeq            102
			{
				zzang1 = ((zzang) (zznk.zzawa));
	//   36   80:getstatic       #71  <Field zzna zznk.zzawa>
	//   37   83:astore_1        
				if(!((Boolean)zzkb.zzik().zzd(((zzna) (zzang1)))).booleanValue())
	//*  38   84:invokestatic    #40  <Method zzni zzkb.zzik()>
	//*  39   87:aload_1         
	//*  40   88:invokevirtual   #46  <Method Object zzni.zzd(zzna)>
	//*  41   91:checkcast       #48  <Class Boolean>
	//*  42   94:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//*  43   97:ifne            102
					return true;
	//   44  100:iconst_1        
	//   45  101:ireturn         
			}
			return false;
	//   46  102:iconst_0        
	//   47  103:ireturn         
		} else
		{
			return true;
	//   48  104:iconst_1        
	//   49  105:ireturn         
		}
	}

	private final Context val$context;
}
