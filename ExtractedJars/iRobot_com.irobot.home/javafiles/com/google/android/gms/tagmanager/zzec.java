// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzfw, zzbw, zzeb, zzdi

final class zzec
	implements zzfw
{

	zzec(zzeb zzeb1)
	{
		zzbdx = zzeb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzeb zzbdx>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final void zza(zzbw zzbw1)
	{
		zzeb.zza(zzbdx, zzbw1.zzov());
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzeb zzbdx>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #25  <Method long zzbw.zzov()>
	//    4    8:invokestatic    #30  <Method void zzeb.zza(zzeb, long)>
	//    5   11:return          
	}

	public final void zzb(zzbw zzbw1)
	{
		zzeb.zza(zzbdx, zzbw1.zzov());
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzeb zzbdx>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #25  <Method long zzbw.zzov()>
	//    4    8:invokestatic    #30  <Method void zzeb.zza(zzeb, long)>
		long l = zzbw1.zzov();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #25  <Method long zzbw.zzov()>
	//    7   15:lstore_2        
		zzbw1 = ((zzbw) (new StringBuilder(57)));
	//    8   16:new             #33  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:bipush          57
	//   11   22:invokespecial   #36  <Method void StringBuilder(int)>
	//   12   25:astore_1        
		((StringBuilder) (zzbw1)).append("Permanent failure dispatching hitId: ");
	//   13   26:aload_1         
	//   14   27:ldc1            #38  <String "Permanent failure dispatching hitId: ">
	//   15   29:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		((StringBuilder) (zzbw1)).append(l);
	//   17   33:aload_1         
	//   18   34:lload_2         
	//   19   35:invokevirtual   #45  <Method StringBuilder StringBuilder.append(long)>
	//   20   38:pop             
		zzdi.v(((StringBuilder) (zzbw1)).toString());
	//   21   39:aload_1         
	//   22   40:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   23   43:invokestatic    #55  <Method void zzdi.v(String)>
	//   24   46:return          
	}

	public final void zzc(zzbw zzbw1)
	{
		long l = zzbw1.zzow();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #59  <Method long zzbw.zzow()>
	//    2    4:lstore_2        
		if(l == 0L)
	//*   3    5:lload_2         
	//*   4    6:lconst_0        
	//*   5    7:lcmp            
	//*   6    8:ifne            35
		{
			zzeb.zza(zzbdx, zzbw1.zzov(), zzeb.zza(zzbdx).currentTimeMillis());
	//    7   11:aload_0         
	//    8   12:getfield        #13  <Field zzeb zzbdx>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #25  <Method long zzbw.zzov()>
	//   11   19:aload_0         
	//   12   20:getfield        #13  <Field zzeb zzbdx>
	//   13   23:invokestatic    #62  <Method Clock zzeb.zza(zzeb)>
	//   14   26:invokeinterface #67  <Method long Clock.currentTimeMillis()>
	//   15   31:invokestatic    #70  <Method void zzeb.zza(zzeb, long, long)>
			return;
	//   16   34:return          
		}
		if(l + 0xdbba00L < zzeb.zza(zzbdx).currentTimeMillis())
	//*  17   35:lload_2         
	//*  18   36:ldc2w           #71  <Long 0xdbba00L>
	//*  19   39:ladd            
	//*  20   40:aload_0         
	//*  21   41:getfield        #13  <Field zzeb zzbdx>
	//*  22   44:invokestatic    #62  <Method Clock zzeb.zza(zzeb)>
	//*  23   47:invokeinterface #67  <Method long Clock.currentTimeMillis()>
	//*  24   52:lcmp            
	//*  25   53:ifge            102
		{
			zzeb.zza(zzbdx, zzbw1.zzov());
	//   26   56:aload_0         
	//   27   57:getfield        #13  <Field zzeb zzbdx>
	//   28   60:aload_1         
	//   29   61:invokevirtual   #25  <Method long zzbw.zzov()>
	//   30   64:invokestatic    #30  <Method void zzeb.zza(zzeb, long)>
			long l1 = zzbw1.zzov();
	//   31   67:aload_1         
	//   32   68:invokevirtual   #25  <Method long zzbw.zzov()>
	//   33   71:lstore_2        
			zzbw1 = ((zzbw) (new StringBuilder(47)));
	//   34   72:new             #33  <Class StringBuilder>
	//   35   75:dup             
	//   36   76:bipush          47
	//   37   78:invokespecial   #36  <Method void StringBuilder(int)>
	//   38   81:astore_1        
			((StringBuilder) (zzbw1)).append("Giving up on failed hitId: ");
	//   39   82:aload_1         
	//   40   83:ldc1            #74  <String "Giving up on failed hitId: ">
	//   41   85:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   42   88:pop             
			((StringBuilder) (zzbw1)).append(l1);
	//   43   89:aload_1         
	//   44   90:lload_2         
	//   45   91:invokevirtual   #45  <Method StringBuilder StringBuilder.append(long)>
	//   46   94:pop             
			zzdi.v(((StringBuilder) (zzbw1)).toString());
	//   47   95:aload_1         
	//   48   96:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   49   99:invokestatic    #55  <Method void zzdi.v(String)>
		}
	//   50  102:return          
	}

	private final zzeb zzbdx;
}
