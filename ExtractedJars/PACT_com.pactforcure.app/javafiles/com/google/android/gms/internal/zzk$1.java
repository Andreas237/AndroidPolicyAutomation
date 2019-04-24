// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zzk

class zzk$1
	implements Runnable
{

	public void run()
	{
		zzk.zzd(zzQ).zza(zzO, zzP);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzk zzQ>
	//    2    4:invokestatic    #33  <Method zzs$zza zzk.zzd(zzk)>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field String zzO>
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field long zzP>
	//    7   15:invokevirtual   #39  <Method void zzs$zza.zza(String, long)>
		zzk.zzd(zzQ).zzd(((Object)this).toString());
	//    8   18:aload_0         
	//    9   19:getfield        #21  <Field zzk zzQ>
	//   10   22:invokestatic    #33  <Method zzs$zza zzk.zzd(zzk)>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #43  <Method String Object.toString()>
	//   13   29:invokevirtual   #44  <Method void zzs$zza.zzd(String)>
	//   14   32:return          
	}

	final String zzO;
	final long zzP;
	final zzk zzQ;

	zzk$1(zzk zzk1, String s, long l)
	{
		zzQ = zzk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field zzk zzQ>
		zzO = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field String zzO>
		zzP = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #25  <Field long zzP>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
