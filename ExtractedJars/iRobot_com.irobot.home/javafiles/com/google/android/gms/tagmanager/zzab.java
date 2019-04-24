// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzac, Container, zzy, zzai

final class zzab
	implements zzac
{

	zzab(zzy zzy1, boolean flag)
	{
		zzbau = zzy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzy zzbau>
		zzbaw = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #18  <Field boolean zzbaw>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void Object()>
	//    8   14:return          
	}

	public final boolean zzb(Container container)
	{
		if(zzbaw)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field boolean zzbaw>
	//*   2    4:ifeq            65
		{
			long l = container.getLastRefreshTime();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #30  <Method long Container.getLastRefreshTime()>
	//    5   11:lstore_2        
			if(zzbav == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #32  <Field Long zzbav>
	//*   8   16:ifnonnull       36
				zzbav = Long.valueOf(zzy.zzc(zzbau).zznz());
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #16  <Field zzy zzbau>
	//   12   24:invokestatic    #38  <Method zzai zzy.zzc(zzy)>
	//   13   27:invokevirtual   #43  <Method long zzai.zznz()>
	//   14   30:invokestatic    #49  <Method Long Long.valueOf(long)>
	//   15   33:putfield        #32  <Field Long zzbav>
			return l + zzbav.longValue() >= zzy.zzd(zzbau).currentTimeMillis();
	//   16   36:lload_2         
	//   17   37:aload_0         
	//   18   38:getfield        #32  <Field Long zzbav>
	//   19   41:invokevirtual   #52  <Method long Long.longValue()>
	//   20   44:ladd            
	//   21   45:aload_0         
	//   22   46:getfield        #16  <Field zzy zzbau>
	//   23   49:invokestatic    #56  <Method Clock zzy.zzd(zzy)>
	//   24   52:invokeinterface #61  <Method long Clock.currentTimeMillis()>
	//   25   57:lcmp            
	//   26   58:iflt            63
	//   27   61:iconst_1        
	//   28   62:ireturn         
	//   29   63:iconst_0        
	//   30   64:ireturn         
		}
		return !container.isDefault();
	//   31   65:aload_1         
	//   32   66:invokevirtual   #65  <Method boolean Container.isDefault()>
	//   33   69:ifne            74
	//   34   72:iconst_1        
	//   35   73:ireturn         
	//   36   74:iconst_0        
	//   37   75:ireturn         
	}

	private final zzy zzbau;
	private Long zzbav;
	private final boolean zzbaw;
}
