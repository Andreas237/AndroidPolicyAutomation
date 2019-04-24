// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//			zzapn, zzapq

public static class zzapn$zza extends zzapn
{

	public Object zza(zzapq zzapq1)
	{
		return ((Object) (zzb(zzapq1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #17  <Method Boolean zzb(zzapq)>
	//    3    5:areturn         
	}

	public Boolean zzb(zzapq zzapq1)
	{
		boolean flag;
		try
		{
			flag = zzapq1.getBooleanFlagValue(getKey(), ((Boolean)zzfm()).booleanValue(), getSource());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #23  <Method String getKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #27  <Method Object zzfm()>
	//    5    9:checkcast       #29  <Class Boolean>
	//    6   12:invokevirtual   #33  <Method boolean Boolean.booleanValue()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #37  <Method int getSource()>
	//    9   19:invokeinterface #43  <Method boolean zzapq.getBooleanFlagValue(String, boolean, int)>
	//   10   24:istore_2        
		}
	//*  11   25:iload_2         
	//*  12   26:invokestatic    #47  <Method Boolean Boolean.valueOf(boolean)>
	//*  13   29:areturn         
		// Misplaced declaration of an exception variable
		catch(zzapq zzapq1)
	//*  14   30:astore_1        
		{
			return (Boolean)zzfm();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #27  <Method Object zzfm()>
	//   17   35:checkcast       #29  <Class Boolean>
	//   18   38:areturn         
		}
		return Boolean.valueOf(flag);
	}

	public zzapn$zza(int i, String s, Boolean boolean1)
	{
		super(i, s, ((Object) (boolean1)), ((zzapn._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #11  <Method void zzapn(int, String, Object, zzapn$1)>
	//    6    8:return          
	}
}
