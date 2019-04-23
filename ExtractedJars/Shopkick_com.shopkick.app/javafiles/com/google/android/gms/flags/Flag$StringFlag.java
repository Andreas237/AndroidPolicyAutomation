// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.flags:
//			Flag, zzc

public static class Flag$StringFlag extends Flag
{

	private final String zze(zzc zzc1)
	{
		try
		{
			zzc1 = ((zzc) (zzc1.getStringFlagValue(((Flag)this).getKey(), (String)((Flag)this).zzb(), ((Flag)this).getSource())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #22  <Method String Flag.getKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #26  <Method Object Flag.zzb()>
	//    5    9:checkcast       #28  <Class String>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #32  <Method int Flag.getSource()>
	//    8   16:invokeinterface #38  <Method String zzc.getStringFlagValue(String, String, int)>
	//    9   21:astore_1        
		}
	//*  10   22:aload_1         
	//*  11   23:areturn         
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #26  <Method Object Flag.zzb()>
	//*  14   28:checkcast       #28  <Class String>
	//*  15   31:areturn         
		// Misplaced declaration of an exception variable
		catch(zzc zzc1)
		{
			return (String)((Flag)this).zzb();
		}
		return ((String) (zzc1));
	//*  16   32:astore_1        
	//*  17   33:goto            24
	}

	public final Object zza(zzc zzc1)
	{
		return ((Object) (zze(zzc1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method String zze(zzc)>
	//    3    5:areturn         
	}

	public Flag$StringFlag(int i, String s, String s1)
	{
		super(i, s, ((Object) (s1)), ((zza) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #13  <Method void Flag(int, String, Object, zza)>
	//    6    8:return          
	}
}
