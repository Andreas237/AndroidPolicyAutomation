// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzht, zzii, zzib

final class zzadp
	implements zzht
{

	private zzadp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public final void zza(zzii zzii1)
	{
		zzii1.zzanp.zzalt = Integer.valueOf(7);
	//    0    0:aload_1         
	//    1    1:getfield        #25  <Field zzib zzii.zzanp>
	//    2    4:bipush          7
	//    3    6:invokestatic    #31  <Method Integer Integer.valueOf(int)>
	//    4    9:putfield        #37  <Field Integer zzib.zzalt>
	//    5   12:return          
	}

	static final zzht zzccm = new zzadp();

	static 
	{
	//    0    0:new             #2   <Class zzadp>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void zzadp()>
	//    3    7:putstatic       #15  <Field zzht zzccm>
	//*   4   10:return          
	}
}
