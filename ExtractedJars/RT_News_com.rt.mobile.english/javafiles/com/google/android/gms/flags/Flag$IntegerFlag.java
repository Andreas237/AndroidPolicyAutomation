// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.flags:
//			Flag, IFlagProvider

public static class Flag$IntegerFlag extends Flag
{

	public Integer get(IFlagProvider iflagprovider)
	{
		int i;
		try
		{
			i = iflagprovider.getIntFlagValue(((Flag)this).getKey(), ((Integer)((Flag)this).getDefault()).intValue(), ((Flag)this).getSource());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #20  <Method String Flag.getKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #24  <Method Object Flag.getDefault()>
	//    5    9:checkcast       #26  <Class Integer>
	//    6   12:invokevirtual   #30  <Method int Integer.intValue()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #33  <Method int Flag.getSource()>
	//    9   19:invokeinterface #39  <Method int IFlagProvider.getIntFlagValue(String, int, int)>
	//   10   24:istore_2        
		}
	//*  11   25:iload_2         
	//*  12   26:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//*  13   29:areturn         
	//*  14   30:aload_0         
	//*  15   31:invokevirtual   #24  <Method Object Flag.getDefault()>
	//*  16   34:checkcast       #26  <Class Integer>
	//*  17   37:areturn         
		// Misplaced declaration of an exception variable
		catch(IFlagProvider iflagprovider)
		{
			return (Integer)((Flag)this).getDefault();
		}
		return Integer.valueOf(i);
	//*  18   38:astore_1        
	//*  19   39:goto            30
	}

	public volatile Object get(IFlagProvider iflagprovider)
	{
		return ((Object) (get(iflagprovider)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #46  <Method Integer get(IFlagProvider)>
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
	//    5    5:invokespecial   #11  <Method void Flag(int, String, Object, zza)>
	//    6    8:return          
	}
}
