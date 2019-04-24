// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzav, zza, zzamy, zzalt, 
//			zzz, zzy

final class zzaly extends zzav
{

	zzaly(zzalt zzalt, int i, String s, zzz zzz, zzy zzy, byte abyte0[], Map map, 
			zzamy zzamy1)
	{
		zzctk = abyte0;
	//    0    0:aload_0         
	//    1    1:aload           6
	//    2    3:putfield        #14  <Field byte[] zzctk>
		zzctl = map;
	//    3    6:aload_0         
	//    4    7:aload           7
	//    5    9:putfield        #16  <Field Map zzctl>
		zzctm = zzamy1;
	//    6   12:aload_0         
	//    7   13:aload           8
	//    8   15:putfield        #18  <Field zzamy zzctm>
		super(i, s, zzz, zzy);
	//    9   18:aload_0         
	//   10   19:iload_2         
	//   11   20:aload_3         
	//   12   21:aload           4
	//   13   23:aload           5
	//   14   25:invokespecial   #21  <Method void zzav(int, String, zzz, zzy)>
	//   15   28:return          
	}

	public final Map getHeaders()
		throws zza
	{
		if(zzctl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field Map zzctl>
	//*   2    4:ifnonnull       12
			return super.getHeaders();
	//    3    7:aload_0         
	//    4    8:invokespecial   #28  <Method Map zzav.getHeaders()>
	//    5   11:areturn         
		else
			return zzctl;
	//    6   12:aload_0         
	//    7   13:getfield        #16  <Field Map zzctl>
	//    8   16:areturn         
	}

	protected final void zza(Object obj)
	{
		((zzav)this).zzh((String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class String>
	//    3    5:invokevirtual   #39  <Method void zzav.zzh(String)>
	//    4    8:return          
	}

	public final byte[] zzg()
		throws zza
	{
		if(zzctk == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field byte[] zzctk>
	//*   2    4:ifnonnull       12
			return super.zzg();
	//    3    7:aload_0         
	//    4    8:invokespecial   #43  <Method byte[] zzav.zzg()>
	//    5   11:areturn         
		else
			return zzctk;
	//    6   12:aload_0         
	//    7   13:getfield        #14  <Field byte[] zzctk>
	//    8   16:areturn         
	}

	protected final void zzh(String s)
	{
		zzctm.zzdg(s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzamy zzctm>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #48  <Method void zzamy.zzdg(String)>
		super.zzh(s);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #39  <Method void zzav.zzh(String)>
	//    7   13:return          
	}

	private final byte zzctk[];
	private final Map zzctl;
	private final zzamy zzctm;
}
