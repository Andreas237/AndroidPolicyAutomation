// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.flags:
//			Flag, IFlagProvider

public static class Flag$StringFlag extends Flag
{

	public volatile Object get(IFlagProvider iflagprovider)
	{
		return ((Object) (get(iflagprovider)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #17  <Method String get(IFlagProvider)>
	//    3    5:areturn         
	}

	public String get(IFlagProvider iflagprovider)
	{
		try
		{
			iflagprovider = ((IFlagProvider) (iflagprovider.getStringFlagValue(((Flag)this).getKey(), (String)((Flag)this).getDefault(), ((Flag)this).getSource())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #23  <Method String Flag.getKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #27  <Method Object Flag.getDefault()>
	//    5    9:checkcast       #29  <Class String>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #33  <Method int Flag.getSource()>
	//    8   16:invokeinterface #39  <Method String IFlagProvider.getStringFlagValue(String, String, int)>
	//    9   21:astore_1        
		}
	//*  10   22:aload_1         
	//*  11   23:areturn         
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #27  <Method Object Flag.getDefault()>
	//*  14   28:checkcast       #29  <Class String>
	//*  15   31:areturn         
		// Misplaced declaration of an exception variable
		catch(IFlagProvider iflagprovider)
		{
			return (String)((Flag)this).getDefault();
		}
		return ((String) (iflagprovider));
	//*  16   32:astore_1        
	//*  17   33:goto            24
	}

	public Flag$StringFlag(int i, String s, String s1)
	{
		super(i, s, ((Object) (s1)), ((zza) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #11  <Method void Flag(int, String, Object, zza)>
	//    6    8:return          
	}
}
