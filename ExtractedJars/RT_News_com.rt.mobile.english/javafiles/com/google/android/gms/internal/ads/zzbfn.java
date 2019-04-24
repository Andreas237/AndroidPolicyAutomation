// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbez, zzbfa, zzbfi

public final class zzbfn extends zzbfc
{

	public zzbfn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzbfc()>
		zzcnd = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #13  <Field String zzcnd>
		zzebk = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #17  <Field zzbfe zzebk>
		zzebt = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #21  <Field int zzebt>
	//   11   19:return          
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            37
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          26
			{
				if(!super.zza(zzbez1, i))
	//*   8   15:aload_0         
	//*   9   16:aload_1         
	//*  10   17:iload_2         
	//*  11   18:invokespecial   #35  <Method boolean zzbfc.zza(zzbez, int)>
	//*  12   21:ifne            0
					return ((zzbfi) (this));
	//   13   24:aload_0         
	//   14   25:areturn         
			} else
			{
				zzcnd = zzbez1.readString();
	//   15   26:aload_0         
	//   16   27:aload_1         
	//   17   28:invokevirtual   #39  <Method String zzbez.readString()>
	//   18   31:putfield        #13  <Field String zzcnd>
			}
		} while(true);
	//   19   34:goto            0
		return ((zzbfi) (this));
	//   20   37:aload_0         
	//   21   38:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzcnd != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field String zzcnd>
	//*   2    4:ifnull          16
			zzbfa1.zzf(1, zzcnd);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #13  <Field String zzcnd>
	//    7   13:invokevirtual   #47  <Method void zzbfa.zzf(int, String)>
		super.zza(zzbfa1);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #49  <Method void zzbfc.zza(zzbfa)>
	//   11   21:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzcnd != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #13  <Field String zzcnd>
	//*   7   11:ifnull          25
			i = j + zzbfa.zzg(1, zzcnd);
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #13  <Field String zzcnd>
	//   12   20:invokestatic    #56  <Method int zzbfa.zzg(int, String)>
	//   13   23:iadd            
	//   14   24:istore_1        
		return i;
	//   15   25:iload_1         
	//   16   26:ireturn         
	}

	public String zzcnd;
}
