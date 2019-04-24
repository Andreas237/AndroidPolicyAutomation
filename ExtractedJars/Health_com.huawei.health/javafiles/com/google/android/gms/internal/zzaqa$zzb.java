// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//			zzaqa, zzaqd

public static class zzaqa$zzb extends zzaqa
{

	public Object zza(zzaqd zzaqd1)
	{
		return ((Object) (zzc(zzaqd1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #18  <Method Integer zzc(zzaqd)>
	//    3    5:areturn         
	}

	public Integer zzc(zzaqd zzaqd1)
	{
		int i;
		try
		{
			i = zzaqd1.getIntFlagValue(getKey(), ((Integer)zzfr()).intValue(), getSource());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #24  <Method String getKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #28  <Method Object zzfr()>
	//    5    9:checkcast       #30  <Class Integer>
	//    6   12:invokevirtual   #34  <Method int Integer.intValue()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #37  <Method int getSource()>
	//    9   19:invokeinterface #43  <Method int zzaqd.getIntFlagValue(String, int, int)>
	//   10   24:istore_2        
		}
	//*  11   25:iload_2         
	//*  12   26:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//*  13   29:areturn         
	//*  14   30:aload_0         
	//*  15   31:invokevirtual   #28  <Method Object zzfr()>
	//*  16   34:checkcast       #30  <Class Integer>
	//*  17   37:areturn         
		// Misplaced declaration of an exception variable
		catch(zzaqd zzaqd1)
		{
			return (Integer)zzfr();
		}
		return Integer.valueOf(i);
	//*  18   38:astore_1        
	//*  19   39:goto            30
	}

	public zzaqa$zzb(int i, String s, Integer integer)
	{
		super(i, s, ((Object) (integer)), ((zzaqa._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #11  <Method void zzaqa(int, String, Object, zzaqa$1)>
	//    6    8:return          
	}
}
