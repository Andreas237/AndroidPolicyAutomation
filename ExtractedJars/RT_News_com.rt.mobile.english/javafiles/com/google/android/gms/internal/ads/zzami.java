// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzajx, zzakk, zzanf

public final class zzami extends zzajx
{

	public zzami(Context context, String s, String s1)
	{
		this(s1, zzbv.zzek().zzm(context, s));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokestatic    #17  <Method zzakk zzbv.zzek()>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #23  <Method String zzakk.zzm(Context, String)>
	//    6   10:invokespecial   #26  <Method void zzami(String, String)>
	//    7   13:return          
	}

	private zzami(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void zzajx()>
		zzctw = new zzanf(s1);
	//    2    4:aload_0         
	//    3    5:new             #32  <Class zzanf>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #35  <Method void zzanf(String)>
	//    7   13:putfield        #37  <Field zzanf zzctw>
		zzag = s;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #39  <Field String zzag>
	//   11   21:return          
	}

	public final void onStop()
	{
	//    0    0:return          
	}

	public final void zzdn()
	{
		zzctw.zzcz(zzag);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field zzanf zzctw>
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field String zzag>
	//    4    8:invokevirtual   #44  <Method void zzanf.zzcz(String)>
	//    5   11:return          
	}

	private final String zzag;
	private final zzanf zzctw;
}
