// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.flags:
//			Flag, zzc

public static class Flag$IntegerFlag extends Flag
{

	private final Integer zzc(zzc zzc1)
	{
		int i;
		try
		{
			i = zzc1.getIntFlagValue(((Flag)this).getKey(), ((Integer)((Flag)this).zzb()).intValue(), ((Flag)this).getSource());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #22  <Method String Flag.getKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #26  <Method Object Flag.zzb()>
	//    5    9:checkcast       #28  <Class Integer>
	//    6   12:invokevirtual   #32  <Method int Integer.intValue()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #35  <Method int Flag.getSource()>
	//    9   19:invokeinterface #41  <Method int zzc.getIntFlagValue(String, int, int)>
	//   10   24:istore_2        
		}
	//*  11   25:iload_2         
	//*  12   26:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//*  13   29:areturn         
	//*  14   30:aload_0         
	//*  15   31:invokevirtual   #26  <Method Object Flag.zzb()>
	//*  16   34:checkcast       #28  <Class Integer>
	//*  17   37:areturn         
		// Misplaced declaration of an exception variable
		catch(zzc zzc1)
		{
			return (Integer)((Flag)this).zzb();
		}
		return Integer.valueOf(i);
	//*  18   38:astore_1        
	//*  19   39:goto            30
	}

	public final Object zza(zzc zzc1)
	{
		return ((Object) (zzc(zzc1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method Integer zzc(zzc)>
	//    3    5:areturn         
	}

	public Flag$IntegerFlag(int i, String s, Integer integer)
	{
		super(i, s, ((Object) (integer)), ((zza) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #13  <Method void Flag(int, String, Object, zza)>
	//    6    8:return          
	}
}
