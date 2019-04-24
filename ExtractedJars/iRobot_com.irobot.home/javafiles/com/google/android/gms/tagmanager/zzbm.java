// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzfz

public final class zzbm extends zzfz
{

	public zzbm()
	{
		super(ID);
	//    0    0:aload_0         
	//    1    1:getstatic       #22  <Field String ID>
	//    2    4:invokespecial   #27  <Method void zzfz(String)>
	//    3    7:return          
	}

	protected final boolean zza(String s, String s1, Map map)
	{
		return s.equals(((Object) (s1)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #35  <Method boolean String.equals(Object)>
	//    3    5:ireturn         
	}

	private static final String ID;

	static 
	{
		ID = zza.zzbn.toString();
	//    0    0:getstatic       #16  <Field zza zza.zzbn>
	//    1    3:invokevirtual   #20  <Method String zza.toString()>
	//    2    6:putstatic       #22  <Field String ID>
	//*   3    9:return          
	}
}
