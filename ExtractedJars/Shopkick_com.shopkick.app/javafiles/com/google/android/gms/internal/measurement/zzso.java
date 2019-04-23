// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.net.Uri;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzsi

public final class zzso
{

	public zzso(Uri uri)
	{
		this(((String) (null)), uri, "", "", false, false, false);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:ldc1            #18  <String "">
	//    4    5:ldc1            #18  <String "">
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:iconst_0        
	//    8   10:invokespecial   #21  <Method void zzso(String, Uri, String, String, boolean, boolean, boolean)>
	//    9   13:return          
	}

	private zzso(String s, Uri uri, String s1, String s2, boolean flag, boolean flag1, boolean flag2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		zzbrs = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #27  <Field String zzbrs>
		zzbrt = uri;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field Uri zzbrt>
		zzbru = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #31  <Field String zzbru>
		zzbrv = s2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #33  <Field String zzbrv>
		zzbrw = false;
	//   14   25:aload_0         
	//   15   26:iconst_0        
	//   16   27:putfield        #35  <Field boolean zzbrw>
		zzbrx = false;
	//   17   30:aload_0         
	//   18   31:iconst_0        
	//   19   32:putfield        #37  <Field boolean zzbrx>
		zzbry = false;
	//   20   35:aload_0         
	//   21   36:iconst_0        
	//   22   37:putfield        #39  <Field boolean zzbry>
	//   23   40:return          
	}

	static Uri zza(zzso zzso1)
	{
		return zzso1.zzbrt;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Uri zzbrt>
	//    2    4:areturn         
	}

	static String zzb(zzso zzso1)
	{
		return zzso1.zzbrv;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String zzbrv>
	//    2    4:areturn         
	}

	static String zzc(zzso zzso1)
	{
		return zzso1.zzbru;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String zzbru>
	//    2    4:areturn         
	}

	public final zzsi zzb(String s, double d)
	{
		return zzsi.zzb(this, s, d);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:invokestatic    #50  <Method zzsi zzsi.zzb(zzso, String, double)>
	//    4    6:areturn         
	}

	public final zzsi zzd(String s, int i)
	{
		return zzsi.zzb(this, s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #57  <Method zzsi zzsi.zzb(zzso, String, int)>
	//    4    6:areturn         
	}

	public final zzsi zzd(String s, boolean flag)
	{
		return zzsi.zzb(this, s, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #62  <Method zzsi zzsi.zzb(zzso, String, boolean)>
	//    4    6:areturn         
	}

	public final zzsi zze(String s, long l)
	{
		return zzsi.zzb(this, s, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokestatic    #68  <Method zzsi zzsi.zzb(zzso, String, long)>
	//    4    6:areturn         
	}

	public final zzsi zzy(String s, String s1)
	{
		return zzsi.zzb(this, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #74  <Method zzsi zzsi.zzb(zzso, String, String)>
	//    4    6:areturn         
	}

	private final String zzbrs;
	private final Uri zzbrt;
	private final String zzbru;
	private final String zzbrv;
	private final boolean zzbrw;
	private final boolean zzbrx;
	private final boolean zzbry;
}
