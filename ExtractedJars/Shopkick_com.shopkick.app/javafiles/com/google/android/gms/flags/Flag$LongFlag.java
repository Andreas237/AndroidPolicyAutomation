// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.flags:
//			Flag, zzc

public static class Flag$LongFlag extends Flag
{

	private final Long zzd(zzc zzc1)
	{
		long l;
		try
		{
			l = zzc1.getLongFlagValue(((Flag)this).getKey(), ((Long)((Flag)this).zzb()).longValue(), ((Flag)this).getSource());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #22  <Method String Flag.getKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #26  <Method Object Flag.zzb()>
	//    5    9:checkcast       #28  <Class Long>
	//    6   12:invokevirtual   #32  <Method long Long.longValue()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #36  <Method int Flag.getSource()>
	//    9   19:invokeinterface #42  <Method long zzc.getLongFlagValue(String, long, int)>
	//   10   24:lstore_2        
		}
	//*  11   25:lload_2         
	//*  12   26:invokestatic    #46  <Method Long Long.valueOf(long)>
	//*  13   29:areturn         
	//*  14   30:aload_0         
	//*  15   31:invokevirtual   #26  <Method Object Flag.zzb()>
	//*  16   34:checkcast       #28  <Class Long>
	//*  17   37:areturn         
		// Misplaced declaration of an exception variable
		catch(zzc zzc1)
		{
			return (Long)((Flag)this).zzb();
		}
		return Long.valueOf(l);
	//*  18   38:astore_1        
	//*  19   39:goto            30
	}

	public final Object zza(zzc zzc1)
	{
		return ((Object) (zzd(zzc1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #50  <Method Long zzd(zzc)>
	//    3    5:areturn         
	}

	public Flag$LongFlag(int i, String s, Long long1)
	{
		super(i, s, ((Object) (long1)), ((zza) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #13  <Method void Flag(int, String, Object, zza)>
	//    6    8:return          
	}
}
