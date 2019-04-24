// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzwo, zzwp, zzvf, zzwq, 
//			zzalo, zzang, zzwi, zzwh, 
//			zzwf

public final class zzwn
{

	public zzwn(Context context, zzang zzang, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		zzbrh = new zzvf(context, zzang, s, zzbrf, zzbrg);
	//    2    4:aload_0         
	//    3    5:new             #32  <Class zzvf>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:getstatic       #22  <Field zzalo zzbrf>
	//    9   15:getstatic       #27  <Field zzalo zzbrg>
	//   10   18:invokespecial   #35  <Method void zzvf(Context, zzang, String, zzalo, zzalo)>
	//   11   21:putfield        #37  <Field zzvf zzbrh>
	//   12   24:return          
	}

	public final zzwf zza(String s, zzwi zzwi, zzwh zzwh)
	{
		return ((zzwf) (new zzwq(zzbrh, s, zzwi, zzwh)));
	//    0    0:new             #41  <Class zzwq>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field zzvf zzbrh>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #44  <Method void zzwq(zzvf, String, zzwi, zzwh)>
	//    8   14:areturn         
	}

	private static final zzalo zzbrf = new zzwo();
	private static final zzalo zzbrg = new zzwp();
	private final zzvf zzbrh;

	static 
	{
	//    0    0:new             #17  <Class zzwo>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void zzwo()>
	//    3    7:putstatic       #22  <Field zzalo zzbrf>
	//    4   10:new             #24  <Class zzwp>
	//    5   13:dup             
	//    6   14:invokespecial   #25  <Method void zzwp()>
	//    7   17:putstatic       #27  <Field zzalo zzbrg>
	//*   8   20:return          
	}
}
