// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzazh

public final class zzays
{

	public zzays(byte abyte0[], byte abyte1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		zzdnk = zzazh.zzm(abyte0);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #18  <Method zzazh zzazh.zzm(byte[])>
	//    5    9:putfield        #20  <Field zzazh zzdnk>
		zzdnl = zzazh.zzm(abyte1);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:invokestatic    #18  <Method zzazh zzazh.zzm(byte[])>
	//    9   17:putfield        #22  <Field zzazh zzdnl>
	//   10   20:return          
	}

	public final byte[] zzaap()
	{
		if(zzdnk == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field zzazh zzdnk>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzdnk.getBytes();
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field zzazh zzdnk>
	//    7   13:invokevirtual   #28  <Method byte[] zzazh.getBytes()>
	//    8   16:areturn         
	}

	public final byte[] zzaaq()
	{
		if(zzdnl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field zzazh zzdnl>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzdnl.getBytes();
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field zzazh zzdnl>
	//    7   13:invokevirtual   #28  <Method byte[] zzazh.getBytes()>
	//    8   16:areturn         
	}

	private final zzazh zzdnk;
	private final zzazh zzdnl;
}
