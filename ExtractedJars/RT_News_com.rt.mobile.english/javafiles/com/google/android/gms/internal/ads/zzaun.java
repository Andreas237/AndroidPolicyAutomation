// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaxl, zzayd

public final class zzaun
{

	public zzaun(Object obj, byte abyte0[], zzaxl zzaxl, zzayd zzayd)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzdhm = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Object zzdhm>
		zzdhn = Arrays.copyOf(abyte0, abyte0.length);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_2         
	//    8   12:arraylength     
	//    9   13:invokestatic    #27  <Method byte[] Arrays.copyOf(byte[], int)>
	//   10   16:putfield        #29  <Field byte[] zzdhn>
		zzdho = zzaxl;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #31  <Field zzaxl zzdho>
		zzdhp = zzayd;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #33  <Field zzayd zzdhp>
	//   17   30:return          
	}

	public final Object zzwi()
	{
		return zzdhm;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object zzdhm>
	//    2    4:areturn         
	}

	public final byte[] zzwj()
	{
		if(zzdhn == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field byte[] zzdhn>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return Arrays.copyOf(zzdhn, zzdhn.length);
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field byte[] zzdhn>
	//    7   13:aload_0         
	//    8   14:getfield        #29  <Field byte[] zzdhn>
	//    9   17:arraylength     
	//   10   18:invokestatic    #27  <Method byte[] Arrays.copyOf(byte[], int)>
	//   11   21:areturn         
	}

	private final Object zzdhm;
	private final byte zzdhn[];
	private final zzaxl zzdho;
	private final zzayd zzdhp;
}
