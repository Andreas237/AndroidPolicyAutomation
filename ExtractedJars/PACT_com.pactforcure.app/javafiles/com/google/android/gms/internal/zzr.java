// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zzi

public class zzr extends Exception
{

	public zzr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Exception()>
		zzah = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #14  <Field zzi zzah>
	//    5    9:return          
	}

	public zzr(zzi zzi)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Exception()>
		zzah = zzi;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field zzi zzah>
	//    5    9:return          
	}

	public zzr(Throwable throwable)
	{
		super(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void Exception(Throwable)>
		zzah = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #14  <Field zzi zzah>
	//    6   10:return          
	}

	void zza(long l)
	{
		zzA = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #23  <Field long zzA>
	//    3    5:return          
	}

	private long zzA;
	public final zzi zzah;
}
