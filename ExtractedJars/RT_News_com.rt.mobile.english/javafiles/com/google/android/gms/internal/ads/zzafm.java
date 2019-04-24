// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzuq, zzagn, zzhq, zzajd, 
//			zzmy, zzagf, zzafr, zzwv, 
//			zzagl, zzagm, zzaau, zzaje, 
//			zzafy, zzhn, zzajc, zzmz, 
//			zzagh, zzwu, zzagi, zzagj, 
//			zzaav, zzajg

public final class zzafm
{

	private zzafm(zzafy zzafy, zzhn zzhn, zzajc zzajc, zzmz zzmz, zzagh zzagh, zzwu zzwu, zzagi zzagi, 
			zzagj zzagj, zzaav zzaav, zzajg zzajg, boolean flag, zzafr zzafr1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #36  <Field zzafy zzcgw>
		zzcgx = zzhn;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #38  <Field zzhn zzcgx>
		zzcgy = zzajc;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #40  <Field zzajc zzcgy>
		zzcgz = zzmz;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #42  <Field zzmz zzcgz>
		zzcha = zzagh;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #44  <Field zzagh zzcha>
		zzchb = zzwu;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #46  <Field zzwu zzchb>
		zzchc = zzagi;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #48  <Field zzagi zzchc>
		zzchd = zzagj;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #50  <Field zzagj zzchd>
		zzche = zzaav;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #52  <Field zzaav zzche>
		zzchf = zzajg;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #54  <Field zzajg zzchf>
	//   32   61:aload_0         
	//   33   62:iconst_1        
	//   34   63:putfield        #56  <Field boolean zzcgv>
		zzchg = zzafr1;
	//   35   66:aload_0         
	//   36   67:aload           12
	//   37   69:putfield        #58  <Field zzafr zzchg>
	//   38   72:return          
	}

	public static zzafm zzm(Context context)
	{
		zzbv.zzfi().initialize(context);
	//    0    0:invokestatic    #67  <Method zzuq zzbv.zzfi()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #73  <Method void zzuq.initialize(Context)>
		zzagn zzagn1 = new zzagn(context);
	//    3    7:new             #75  <Class zzagn>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #77  <Method void zzagn(Context)>
	//    7   15:astore_1        
		return new zzafm(((zzafy) (null)), ((zzhn) (new zzhq())), ((zzajc) (new zzajd())), ((zzmz) (new zzmy())), ((zzagh) (new zzagf(context, ((zzafr) (zzagn1)).zzog()))), ((zzwu) (new zzwv())), ((zzagi) (new zzagl())), ((zzagj) (new zzagm())), ((zzaav) (new zzaau())), ((zzajg) (new zzaje())), true, ((zzafr) (zzagn1)));
	//    8   16:new             #2   <Class zzafm>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:new             #79  <Class zzhq>
	//   12   24:dup             
	//   13   25:invokespecial   #80  <Method void zzhq()>
	//   14   28:new             #82  <Class zzajd>
	//   15   31:dup             
	//   16   32:invokespecial   #83  <Method void zzajd()>
	//   17   35:new             #85  <Class zzmy>
	//   18   38:dup             
	//   19   39:invokespecial   #86  <Method void zzmy()>
	//   20   42:new             #88  <Class zzagf>
	//   21   45:dup             
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:invokeinterface #94  <Method zzwf zzafr.zzog()>
	//   25   53:invokespecial   #97  <Method void zzagf(Context, zzwf)>
	//   26   56:new             #99  <Class zzwv>
	//   27   59:dup             
	//   28   60:invokespecial   #100 <Method void zzwv()>
	//   29   63:new             #102 <Class zzagl>
	//   30   66:dup             
	//   31   67:invokespecial   #103 <Method void zzagl()>
	//   32   70:new             #105 <Class zzagm>
	//   33   73:dup             
	//   34   74:invokespecial   #106 <Method void zzagm()>
	//   35   77:new             #108 <Class zzaau>
	//   36   80:dup             
	//   37   81:invokespecial   #109 <Method void zzaau()>
	//   38   84:new             #111 <Class zzaje>
	//   39   87:dup             
	//   40   88:invokespecial   #112 <Method void zzaje()>
	//   41   91:iconst_1        
	//   42   92:aload_1         
	//   43   93:invokespecial   #114 <Method void zzafm(zzafy, zzhn, zzajc, zzmz, zzagh, zzwu, zzagi, zzagj, zzaav, zzajg, boolean, zzafr)>
	//   44   96:areturn         
	}

	public final boolean zzcgv = true;
	public final zzafy zzcgw = null;
	public final zzhn zzcgx;
	public final zzajc zzcgy;
	public final zzmz zzcgz;
	public final zzagh zzcha;
	public final zzwu zzchb;
	public final zzagi zzchc;
	public final zzagj zzchd;
	public final zzaav zzche;
	public final zzajg zzchf;
	public final zzafr zzchg;
}
