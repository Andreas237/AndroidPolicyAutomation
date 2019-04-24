// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzang

public final class zzer
{

	public zzer(String s, zzang zzang1, String s1, JSONObject jsonobject, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzaej = zzang1.zzcw;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:getfield        #24  <Field String zzang.zzcw>
	//    5    9:putfield        #26  <Field String zzaej>
		zzaeh = jsonobject;
	//    6   12:aload_0         
	//    7   13:aload           4
	//    8   15:putfield        #28  <Field JSONObject zzaeh>
		zzaei = s;
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:putfield        #30  <Field String zzaei>
		zzaeg = s1;
	//   12   23:aload_0         
	//   13   24:aload_3         
	//   14   25:putfield        #32  <Field String zzaeg>
		zzaek = flag;
	//   15   28:aload_0         
	//   16   29:iload           5
	//   17   31:putfield        #34  <Field boolean zzaek>
		zzael = flag1;
	//   18   34:aload_0         
	//   19   35:iload           6
	//   20   37:putfield        #36  <Field boolean zzael>
	//   21   40:return          
	}

	public final String zzfv()
	{
		return zzaeg;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String zzaeg>
	//    2    4:areturn         
	}

	public final String zzfw()
	{
		return zzaej;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String zzaej>
	//    2    4:areturn         
	}

	public final JSONObject zzfx()
	{
		return zzaeh;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field JSONObject zzaeh>
	//    2    4:areturn         
	}

	public final String zzfy()
	{
		return zzaei;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String zzaei>
	//    2    4:areturn         
	}

	public final boolean zzfz()
	{
		return zzaek;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean zzaek>
	//    2    4:ireturn         
	}

	public final boolean zzga()
	{
		return zzael;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean zzael>
	//    2    4:ireturn         
	}

	private final String zzaeg;
	private final JSONObject zzaeh;
	private final String zzaei;
	private final String zzaej;
	private final boolean zzaek;
	private final boolean zzael;
}
