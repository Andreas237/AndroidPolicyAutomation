// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//			zzapn, zzapq

public static class zzapn$zzd extends zzapn
{

	public Object zza(zzapq zzapq1)
	{
		return ((Object) (zze(zzapq1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #18  <Method String zze(zzapq)>
	//    3    5:areturn         
	}

	public String zze(zzapq zzapq1)
	{
		try
		{
			zzapq1 = ((zzapq) (zzapq1.getStringFlagValue(getKey(), (String)zzfm(), getSource())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #24  <Method String getKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #28  <Method Object zzfm()>
	//    5    9:checkcast       #30  <Class String>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #34  <Method int getSource()>
	//    8   16:invokeinterface #40  <Method String zzapq.getStringFlagValue(String, String, int)>
	//    9   21:astore_1        
		}
	//*  10   22:aload_1         
	//*  11   23:areturn         
		// Misplaced declaration of an exception variable
		catch(zzapq zzapq1)
	//*  12   24:astore_1        
		{
			return (String)zzfm();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #28  <Method Object zzfm()>
	//   15   29:checkcast       #30  <Class String>
	//   16   32:areturn         
		}
		return ((String) (zzapq1));
	}

	public zzapn$zzd(int i, String s, String s1)
	{
		super(i, s, ((Object) (s1)), ((zzapn._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #11  <Method void zzapn(int, String, Object, zzapn$1)>
	//    6    8:return          
	}
}
