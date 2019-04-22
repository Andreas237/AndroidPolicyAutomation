// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.util.SimpleArrayMap;
import android.text.TextUtils;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.*;

// Referenced classes of package com.google.android.gms.ads.internal:
//			zzah, zzw

public final class zzak extends zzko
{

	public zzak(Context context, String s, zzxn zzxn, zzang zzang, zzw zzw)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void zzko()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #45  <Field Context mContext>
		zzye = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #47  <Field String zzye>
		zzwh = zzxn;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #49  <Field zzxn zzwh>
		zzyf = zzang;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #51  <Field zzang zzyf>
		zzyo = new SimpleArrayMap();
	//   14   25:aload_0         
	//   15   26:new             #53  <Class SimpleArrayMap>
	//   16   29:dup             
	//   17   30:invokespecial   #54  <Method void SimpleArrayMap()>
	//   18   33:putfield        #56  <Field SimpleArrayMap zzyo>
		zzyn = new SimpleArrayMap();
	//   19   36:aload_0         
	//   20   37:new             #53  <Class SimpleArrayMap>
	//   21   40:dup             
	//   22   41:invokespecial   #54  <Method void SimpleArrayMap()>
	//   23   44:putfield        #58  <Field SimpleArrayMap zzyn>
		zzwc = zzw;
	//   24   47:aload_0         
	//   25   48:aload           5
	//   26   50:putfield        #60  <Field zzw zzwc>
	//   27   53:return          
	}

	public final void zza(PublisherAdViewOptions publisheradviewoptions)
	{
		zzxy = publisheradviewoptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field PublisherAdViewOptions zzxy>
	//    3    5:return          
	}

	public final void zza(zzpl zzpl)
	{
		zzyb = zzpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field zzpl zzyb>
	//    3    5:return          
	}

	public final void zza(zzqw zzqw)
	{
		zzyk = zzqw;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #71  <Field zzqw zzyk>
	//    3    5:return          
	}

	public final void zza(zzqz zzqz)
	{
		zzym = zzqz;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #74  <Field zzqz zzym>
	//    3    5:return          
	}

	public final void zza(zzri zzri, zzjn zzjn)
	{
		zzyp = zzri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field zzri zzyp>
		zzxx = zzjn;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #79  <Field zzjn zzxx>
	//    6   10:return          
	}

	public final void zza(zzrl zzrl)
	{
		zzyl = zzrl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field zzrl zzyl>
	//    3    5:return          
	}

	public final void zza(String s, zzrf zzrf, zzrc zzrc)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #89  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            28
		{
			zzyo.put(((Object) (s)), ((Object) (zzrf)));
	//    3    7:aload_0         
	//    4    8:getfield        #56  <Field SimpleArrayMap zzyo>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #93  <Method Object SimpleArrayMap.put(Object, Object)>
	//    8   16:pop             
			zzyn.put(((Object) (s)), ((Object) (zzrc)));
	//    9   17:aload_0         
	//   10   18:getfield        #58  <Field SimpleArrayMap zzyn>
	//   11   21:aload_1         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #93  <Method Object SimpleArrayMap.put(Object, Object)>
	//   14   26:pop             
			return;
	//   15   27:return          
		} else
		{
			throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
	//   16   28:new             #95  <Class IllegalArgumentException>
	//   17   31:dup             
	//   18   32:ldc1            #97  <String "Custom template ID for native custom template ad is empty. Please provide a valid template id.">
	//   19   34:invokespecial   #100 <Method void IllegalArgumentException(String)>
	//   20   37:athrow          
		}
	}

	public final void zzb(zzkh zzkh)
	{
		zzxs = zzkh;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #104 <Field zzkh zzxs>
	//    3    5:return          
	}

	public final void zzb(zzlg zzlg)
	{
		zzyd = zzlg;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #107 <Field zzlg zzyd>
	//    3    5:return          
	}

	public final zzkk zzdh()
	{
		return ((zzkk) (new zzah(mContext, zzye, zzwh, zzyf, zzxs, zzyk, zzyl, zzym, zzyo, zzyn, zzyb, zzyd, zzwc, zzyp, zzxx, zzxy)));
	//    0    0:new             #111 <Class zzah>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field Context mContext>
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field String zzye>
	//    6   12:aload_0         
	//    7   13:getfield        #49  <Field zzxn zzwh>
	//    8   16:aload_0         
	//    9   17:getfield        #51  <Field zzang zzyf>
	//   10   20:aload_0         
	//   11   21:getfield        #104 <Field zzkh zzxs>
	//   12   24:aload_0         
	//   13   25:getfield        #71  <Field zzqw zzyk>
	//   14   28:aload_0         
	//   15   29:getfield        #82  <Field zzrl zzyl>
	//   16   32:aload_0         
	//   17   33:getfield        #74  <Field zzqz zzym>
	//   18   36:aload_0         
	//   19   37:getfield        #56  <Field SimpleArrayMap zzyo>
	//   20   40:aload_0         
	//   21   41:getfield        #58  <Field SimpleArrayMap zzyn>
	//   22   44:aload_0         
	//   23   45:getfield        #68  <Field zzpl zzyb>
	//   24   48:aload_0         
	//   25   49:getfield        #107 <Field zzlg zzyd>
	//   26   52:aload_0         
	//   27   53:getfield        #60  <Field zzw zzwc>
	//   28   56:aload_0         
	//   29   57:getfield        #77  <Field zzri zzyp>
	//   30   60:aload_0         
	//   31   61:getfield        #79  <Field zzjn zzxx>
	//   32   64:aload_0         
	//   33   65:getfield        #65  <Field PublisherAdViewOptions zzxy>
	//   34   68:invokespecial   #114 <Method void zzah(Context, String, zzxn, zzang, zzkh, zzqw, zzrl, zzqz, SimpleArrayMap, SimpleArrayMap, zzpl, zzlg, zzw, zzri, zzjn, PublisherAdViewOptions)>
	//   35   71:areturn         
	}

	private final Context mContext;
	private final zzw zzwc;
	private final zzxn zzwh;
	private zzkh zzxs;
	private zzjn zzxx;
	private PublisherAdViewOptions zzxy;
	private zzpl zzyb;
	private zzlg zzyd;
	private final String zzye;
	private final zzang zzyf;
	private zzqw zzyk;
	private zzrl zzyl;
	private zzqz zzym;
	private SimpleArrayMap zzyn;
	private SimpleArrayMap zzyo;
	private zzri zzyp;
}
