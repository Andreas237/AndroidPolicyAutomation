// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.*;

// Referenced classes of package com.google.android.gms.ads.internal:
//			zzal, zzbw, zzaq, zzap

final class zzao extends zzajx
{

	public zzao(zzal zzal1, int i)
	{
		zzza = zzal1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzal zzza>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void zzajx()>
		zzzb = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #18  <Field int zzzb>
	//    8   14:return          
	}

	public final void onStop()
	{
	//    0    0:return          
	}

	public final void zzdn()
	{
		boolean flag = zzza.zzvw.zzze;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzal zzza>
	//    2    4:getfield        #27  <Field zzbw zzal.zzvw>
	//    3    7:getfield        #33  <Field boolean zzbw.zzze>
	//    4   10:istore          4
		boolean flag1 = zzza.zzdi();
	//    5   12:aload_0         
	//    6   13:getfield        #13  <Field zzal zzza>
	//    7   16:invokevirtual   #37  <Method boolean zzal.zzdi()>
	//    8   19:istore          5
		boolean flag2 = zzal.zza(zzza);
	//    9   21:aload_0         
	//   10   22:getfield        #13  <Field zzal zzza>
	//   11   25:invokestatic    #41  <Method boolean zzal.zza(zzal)>
	//   12   28:istore          6
		float f = zzal.zzb(zzza);
	//   13   30:aload_0         
	//   14   31:getfield        #13  <Field zzal zzza>
	//   15   34:invokestatic    #45  <Method float zzal.zzb(zzal)>
	//   16   37:fstore_1        
		int i;
		if(zzza.zzvw.zzze)
	//*  17   38:aload_0         
	//*  18   39:getfield        #13  <Field zzal zzza>
	//*  19   42:getfield        #27  <Field zzbw zzal.zzvw>
	//*  20   45:getfield        #33  <Field boolean zzbw.zzze>
	//*  21   48:ifeq            59
			i = zzzb;
	//   22   51:aload_0         
	//   23   52:getfield        #18  <Field int zzzb>
	//   24   55:istore_2        
		else
	//*  25   56:goto            61
			i = -1;
	//   26   59:iconst_m1       
	//   27   60:istore_2        
		Object obj = ((Object) (new zzaq(flag, flag1, flag2, f, i, zzal.zzc(zzza), zzza.zzvw.zzacw.zzzl, zzza.zzvw.zzacw.zzzm)));
	//   28   61:new             #47  <Class zzaq>
	//   29   64:dup             
	//   30   65:iload           4
	//   31   67:iload           5
	//   32   69:iload           6
	//   33   71:fload_1         
	//   34   72:iload_2         
	//   35   73:aload_0         
	//   36   74:getfield        #13  <Field zzal zzza>
	//   37   77:invokestatic    #50  <Method boolean zzal.zzc(zzal)>
	//   38   80:aload_0         
	//   39   81:getfield        #13  <Field zzal zzza>
	//   40   84:getfield        #27  <Field zzbw zzal.zzvw>
	//   41   87:getfield        #54  <Field zzajh zzbw.zzacw>
	//   42   90:getfield        #59  <Field boolean zzajh.zzzl>
	//   43   93:aload_0         
	//   44   94:getfield        #13  <Field zzal zzza>
	//   45   97:getfield        #27  <Field zzbw zzal.zzvw>
	//   46  100:getfield        #54  <Field zzajh zzbw.zzacw>
	//   47  103:getfield        #62  <Field boolean zzajh.zzzm>
	//   48  106:invokespecial   #65  <Method void zzaq(boolean, boolean, boolean, float, int, boolean, boolean, boolean)>
	//   49  109:astore          7
		int j = zzza.zzvw.zzacw.zzbyo.getRequestedOrientation();
	//   50  111:aload_0         
	//   51  112:getfield        #13  <Field zzal zzza>
	//   52  115:getfield        #27  <Field zzbw zzal.zzvw>
	//   53  118:getfield        #54  <Field zzajh zzbw.zzacw>
	//   54  121:getfield        #69  <Field zzaqw zzajh.zzbyo>
	//   55  124:invokeinterface #75  <Method int zzaqw.getRequestedOrientation()>
	//   56  129:istore_3        
		i = j;
	//   57  130:iload_3         
	//   58  131:istore_2        
		if(j == -1)
	//*  59  132:iload_3         
	//*  60  133:iconst_m1       
	//*  61  134:icmpne          151
			i = zzza.zzvw.zzacw.orientation;
	//   62  137:aload_0         
	//   63  138:getfield        #13  <Field zzal zzza>
	//   64  141:getfield        #27  <Field zzbw zzal.zzvw>
	//   65  144:getfield        #54  <Field zzajh zzbw.zzacw>
	//   66  147:getfield        #78  <Field int zzajh.orientation>
	//   67  150:istore_2        
		zzal zzal1 = zzza;
	//   68  151:aload_0         
	//   69  152:getfield        #13  <Field zzal zzza>
	//   70  155:astore          8
		obj = ((Object) (new AdOverlayInfoParcel(((com.google.android.gms.internal.ads.zzjd) (zzal1)), ((com.google.android.gms.ads.internal.overlay.zzn) (zzal1)), ((com.google.android.gms.ads.internal.overlay.zzt) (zzal1)), zzal1.zzvw.zzacw.zzbyo, i, zzza.zzvw.zzacr, zzza.zzvw.zzacw.zzcev, ((zzaq) (obj)))));
	//   71  157:new             #80  <Class AdOverlayInfoParcel>
	//   72  160:dup             
	//   73  161:aload           8
	//   74  163:aload           8
	//   75  165:aload           8
	//   76  167:aload           8
	//   77  169:getfield        #27  <Field zzbw zzal.zzvw>
	//   78  172:getfield        #54  <Field zzajh zzbw.zzacw>
	//   79  175:getfield        #69  <Field zzaqw zzajh.zzbyo>
	//   80  178:iload_2         
	//   81  179:aload_0         
	//   82  180:getfield        #13  <Field zzal zzza>
	//   83  183:getfield        #27  <Field zzbw zzal.zzvw>
	//   84  186:getfield        #84  <Field com.google.android.gms.internal.ads.zzang zzbw.zzacr>
	//   85  189:aload_0         
	//   86  190:getfield        #13  <Field zzal zzza>
	//   87  193:getfield        #27  <Field zzbw zzal.zzvw>
	//   88  196:getfield        #54  <Field zzajh zzbw.zzacw>
	//   89  199:getfield        #88  <Field String zzajh.zzcev>
	//   90  202:aload           7
	//   91  204:invokespecial   #91  <Method void AdOverlayInfoParcel(com.google.android.gms.internal.ads.zzjd, com.google.android.gms.ads.internal.overlay.zzn, com.google.android.gms.ads.internal.overlay.zzt, zzaqw, int, com.google.android.gms.internal.ads.zzang, String, zzaq)>
	//   92  207:astore          7
		zzakk.zzcrm.post(((Runnable) (new zzap(this, ((AdOverlayInfoParcel) (obj))))));
	//   93  209:getstatic       #97  <Field Handler zzakk.zzcrm>
	//   94  212:new             #99  <Class zzap>
	//   95  215:dup             
	//   96  216:aload_0         
	//   97  217:aload           7
	//   98  219:invokespecial   #102 <Method void zzap(zzao, AdOverlayInfoParcel)>
	//   99  222:invokevirtual   #108 <Method boolean Handler.post(Runnable)>
	//  100  225:pop             
	//  101  226:return          
	}

	final zzal zzza;
	private final int zzzb;
}
