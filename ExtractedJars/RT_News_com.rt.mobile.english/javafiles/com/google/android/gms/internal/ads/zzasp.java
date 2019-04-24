// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzw;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzasq, zzarh, zzasj, zzaqo, 
//			zzass, zzasi, zzci, zzang, 
//			zznx, zzhs

final class zzasp
	implements Callable
{

	zzasp(Context context, zzasi zzasi, String s, boolean flag, boolean flag1, zzci zzci, zzang zzang, 
			zznx zznx, zzbo zzbo, zzw zzw, zzhs zzhs)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		zzdck = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field Context zzdck>
		zzdco = zzasi;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #36  <Field zzasi zzdco>
		zzcah = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #38  <Field String zzcah>
		zzdcp = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #40  <Field boolean zzdcp>
		zzdcq = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #42  <Field boolean zzdcq>
		zzdcr = zzci;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #44  <Field zzci zzdcr>
		zzdcs = zzang;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #46  <Field zzang zzdcs>
		zzdct = zznx;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #48  <Field zznx zzdct>
		zzdcu = zzbo;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #50  <Field zzbo zzdcu>
		zzdcv = zzw;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #52  <Field zzw zzdcv>
		zzdcw = zzhs;
	//   32   61:aload_0         
	//   33   62:aload           11
	//   34   64:putfield        #54  <Field zzhs zzdcw>
	//   35   67:return          
	}

	public final Object call()
	{
		Object obj = ((Object) (zzdck));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Context zzdck>
	//    2    4:astore_3        
		Object obj1 = ((Object) (zzdco));
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field zzasi zzdco>
	//    5    9:astore          4
		Object obj2 = ((Object) (zzcah));
	//    6   11:aload_0         
	//    7   12:getfield        #38  <Field String zzcah>
	//    8   15:astore          5
		boolean flag = zzdcp;
	//    9   17:aload_0         
	//   10   18:getfield        #40  <Field boolean zzdcp>
	//   11   21:istore_1        
		boolean flag1 = zzdcq;
	//   12   22:aload_0         
	//   13   23:getfield        #42  <Field boolean zzdcq>
	//   14   26:istore_2        
		obj = ((Object) (zzasq.zzc(((Context) (obj)), ((zzasi) (obj1)), ((String) (obj2)), flag, flag1, zzdcr, zzdcs, zzdct, zzdcu, zzdcv, zzdcw)));
	//   15   27:aload_3         
	//   16   28:aload           4
	//   17   30:aload           5
	//   18   32:iload_1         
	//   19   33:iload_2         
	//   20   34:aload_0         
	//   21   35:getfield        #44  <Field zzci zzdcr>
	//   22   38:aload_0         
	//   23   39:getfield        #46  <Field zzang zzdcs>
	//   24   42:aload_0         
	//   25   43:getfield        #48  <Field zznx zzdct>
	//   26   46:aload_0         
	//   27   47:getfield        #50  <Field zzbo zzdcu>
	//   28   50:aload_0         
	//   29   51:getfield        #52  <Field zzw zzdcv>
	//   30   54:aload_0         
	//   31   55:getfield        #54  <Field zzhs zzdcw>
	//   32   58:invokestatic    #63  <Method zzasq zzasq.zzc(Context, zzasi, String, boolean, boolean, zzci, zzang, zznx, zzbo, zzw, zzhs)>
	//   33   61:astore_3        
		obj1 = ((Object) (new zzarh(((zzaqw) (obj)))));
	//   34   62:new             #65  <Class zzarh>
	//   35   65:dup             
	//   36   66:aload_3         
	//   37   67:invokespecial   #68  <Method void zzarh(zzaqw)>
	//   38   70:astore          4
		obj2 = ((Object) (new zzasj(((zzaqw) (obj1)), flag1)));
	//   39   72:new             #70  <Class zzasj>
	//   40   75:dup             
	//   41   76:aload           4
	//   42   78:iload_2         
	//   43   79:invokespecial   #73  <Method void zzasj(zzaqw, boolean)>
	//   44   82:astore          5
		((zzasq) (obj)).setWebChromeClient(((android.webkit.WebChromeClient) (new zzaqo(((zzaqw) (obj1))))));
	//   45   84:aload_3         
	//   46   85:new             #75  <Class zzaqo>
	//   47   88:dup             
	//   48   89:aload           4
	//   49   91:invokespecial   #76  <Method void zzaqo(zzaqw)>
	//   50   94:invokevirtual   #80  <Method void zzasq.setWebChromeClient(android.webkit.WebChromeClient)>
		((zzass) (obj)).zza(((zzasx) (obj2)));
	//   51   97:aload_3         
	//   52   98:aload           5
	//   53  100:invokevirtual   #86  <Method void zzass.zza(zzasx)>
		((zzass) (obj)).zza(((zzatb) (obj2)));
	//   54  103:aload_3         
	//   55  104:aload           5
	//   56  106:invokevirtual   #89  <Method void zzass.zza(zzatb)>
		((zzass) (obj)).zza(((zzata) (obj2)));
	//   57  109:aload_3         
	//   58  110:aload           5
	//   59  112:invokevirtual   #92  <Method void zzass.zza(zzata)>
		((zzass) (obj)).zza(((zzasz) (obj2)));
	//   60  115:aload_3         
	//   61  116:aload           5
	//   62  118:invokevirtual   #95  <Method void zzass.zza(zzasz)>
		((zzasq) (obj)).zza(((zzasj) (obj2)));
	//   63  121:aload_3         
	//   64  122:aload           5
	//   65  124:invokevirtual   #98  <Method void zzasq.zza(zzasj)>
		return obj1;
	//   66  127:aload           4
	//   67  129:areturn         
	}

	private final String zzcah;
	private final Context zzdck;
	private final zzasi zzdco;
	private final boolean zzdcp;
	private final boolean zzdcq;
	private final zzci zzdcr;
	private final zzang zzdcs;
	private final zznx zzdct;
	private final zzbo zzdcu;
	private final zzw zzdcv;
	private final zzhs zzdcw;
}
