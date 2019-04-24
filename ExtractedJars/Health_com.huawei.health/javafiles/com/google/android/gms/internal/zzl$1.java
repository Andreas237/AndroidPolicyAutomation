// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zzl

class zzl$1
	implements Runnable
{

	public void run()
	{
		zzl.zzd(zzR).zza(zzP, zzQ);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzl zzR>
	//    2    4:invokestatic    #33  <Method zzt$zza zzl.zzd(zzl)>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field String zzP>
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field long zzQ>
	//    7   15:invokevirtual   #39  <Method void zzt$zza.zza(String, long)>
		zzl.zzd(zzR).zzd(((Object)this).toString());
	//    8   18:aload_0         
	//    9   19:getfield        #21  <Field zzl zzR>
	//   10   22:invokestatic    #33  <Method zzt$zza zzl.zzd(zzl)>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #43  <Method String Object.toString()>
	//   13   29:invokevirtual   #44  <Method void zzt$zza.zzd(String)>
	//   14   32:return          
	}

	final String zzP;
	final long zzQ;
	final zzl zzR;

	zzl$1(zzl zzl1, String s, long l)
	{
		zzR = zzl1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field zzl zzR>
		zzP = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field String zzP>
		zzQ = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #25  <Field long zzQ>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
