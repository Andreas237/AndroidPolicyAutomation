// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.flags:
//			Flag, zzc

public static class Flag$BooleanFlag extends Flag
{

	private final Boolean zzb(zzc zzc1)
	{
		boolean flag;
		try
		{
			flag = zzc1.getBooleanFlagValue(((Flag)this).getKey(), ((Boolean)((Flag)this).zzb()).booleanValue(), ((Flag)this).getSource());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #21  <Method String Flag.getKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #24  <Method Object Flag.zzb()>
	//    5    9:checkcast       #26  <Class Boolean>
	//    6   12:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #34  <Method int Flag.getSource()>
	//    9   19:invokeinterface #40  <Method boolean zzc.getBooleanFlagValue(String, boolean, int)>
	//   10   24:istore_2        
		}
	//*  11   25:iload_2         
	//*  12   26:invokestatic    #44  <Method Boolean Boolean.valueOf(boolean)>
	//*  13   29:areturn         
	//*  14   30:aload_0         
	//*  15   31:invokevirtual   #24  <Method Object Flag.zzb()>
	//*  16   34:checkcast       #26  <Class Boolean>
	//*  17   37:areturn         
		// Misplaced declaration of an exception variable
		catch(zzc zzc1)
		{
			return (Boolean)((Flag)this).zzb();
		}
		return Boolean.valueOf(flag);
	//*  18   38:astore_1        
	//*  19   39:goto            30
	}

	public final Object zza(zzc zzc1)
	{
		return ((Object) (zzb(zzc1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method Boolean zzb(zzc)>
	//    3    5:areturn         
	}

	public Flag$BooleanFlag(int i, String s, Boolean boolean1)
	{
		super(i, s, ((Object) (boolean1)), ((zza) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #12  <Method void Flag(int, String, Object, zza)>
	//    6    8:return          
	}
}
