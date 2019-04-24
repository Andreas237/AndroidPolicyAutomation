// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//			zzaqa, zzaqd

public static class zzaqa$zzd extends zzaqa
{

	public Object zza(zzaqd zzaqd1)
	{
		return ((Object) (zze(zzaqd1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #18  <Method String zze(zzaqd)>
	//    3    5:areturn         
	}

	public String zze(zzaqd zzaqd1)
	{
		try
		{
			zzaqd1 = ((zzaqd) (zzaqd1.getStringFlagValue(getKey(), (String)zzfr(), getSource())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #24  <Method String getKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #28  <Method Object zzfr()>
	//    5    9:checkcast       #30  <Class String>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #34  <Method int getSource()>
	//    8   16:invokeinterface #40  <Method String zzaqd.getStringFlagValue(String, String, int)>
	//    9   21:astore_1        
		}
	//*  10   22:aload_1         
	//*  11   23:areturn         
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #28  <Method Object zzfr()>
	//*  14   28:checkcast       #30  <Class String>
	//*  15   31:areturn         
		// Misplaced declaration of an exception variable
		catch(zzaqd zzaqd1)
		{
			return (String)zzfr();
		}
		return ((String) (zzaqd1));
	//*  16   32:astore_1        
	//*  17   33:goto            24
	}

	public zzaqa$zzd(int i, String s, String s1)
	{
		super(i, s, ((Object) (s1)), ((zzaqa._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #11  <Method void zzaqa(int, String, Object, zzaqa$1)>
	//    6    8:return          
	}
}
