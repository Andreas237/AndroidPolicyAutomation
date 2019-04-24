// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.*;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzarh, zzari, zzakq, zzaqw, 
//			zzaqo, zzasi, zzci, zzang, 
//			zznx, zzhs

final class zzare
	implements Callable
{

	zzare(Context context, zzasi zzasi, String s, boolean flag, boolean flag1, zzci zzci, zzang zzang, 
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
		zzasi zzasi = zzdco;
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field zzasi zzdco>
	//    5    9:astore          4
		String s = zzcah;
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
		obj = ((Object) (new zzarh(((zzaqw) (zzari.zzb(((Context) (obj)), zzasi, s, flag, flag1, zzdcr, zzdcs, zzdct, zzdcu, zzdcv, zzdcw))))));
	//   15   27:new             #59  <Class zzarh>
	//   16   30:dup             
	//   17   31:aload_3         
	//   18   32:aload           4
	//   19   34:aload           5
	//   20   36:iload_1         
	//   21   37:iload_2         
	//   22   38:aload_0         
	//   23   39:getfield        #44  <Field zzci zzdcr>
	//   24   42:aload_0         
	//   25   43:getfield        #46  <Field zzang zzdcs>
	//   26   46:aload_0         
	//   27   47:getfield        #48  <Field zznx zzdct>
	//   28   50:aload_0         
	//   29   51:getfield        #50  <Field zzbo zzdcu>
	//   30   54:aload_0         
	//   31   55:getfield        #52  <Field zzw zzdcv>
	//   32   58:aload_0         
	//   33   59:getfield        #54  <Field zzhs zzdcw>
	//   34   62:invokestatic    #65  <Method zzari zzari.zzb(Context, zzasi, String, boolean, boolean, zzci, zzang, zznx, zzbo, zzw, zzhs)>
	//   35   65:invokespecial   #68  <Method void zzarh(zzaqw)>
	//   36   68:astore_3        
		((zzaqw) (obj)).setWebViewClient(((android.webkit.WebViewClient) (zzbv.zzem().zza(((zzaqw) (obj)), flag1))));
	//   37   69:aload_3         
	//   38   70:invokestatic    #74  <Method zzakq zzbv.zzem()>
	//   39   73:aload_3         
	//   40   74:iload_2         
	//   41   75:invokevirtual   #80  <Method zzaqx zzakq.zza(zzaqw, boolean)>
	//   42   78:invokeinterface #86  <Method void zzaqw.setWebViewClient(android.webkit.WebViewClient)>
		((zzaqw) (obj)).setWebChromeClient(((android.webkit.WebChromeClient) (new zzaqo(((zzaqw) (obj))))));
	//   43   83:aload_3         
	//   44   84:new             #88  <Class zzaqo>
	//   45   87:dup             
	//   46   88:aload_3         
	//   47   89:invokespecial   #89  <Method void zzaqo(zzaqw)>
	//   48   92:invokeinterface #93  <Method void zzaqw.setWebChromeClient(android.webkit.WebChromeClient)>
		return obj;
	//   49   97:aload_3         
	//   50   98:areturn         
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
