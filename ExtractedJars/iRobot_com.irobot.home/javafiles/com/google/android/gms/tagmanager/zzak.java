// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzfz

final class zzak extends zzfz
{

	public zzak()
	{
		super(ID);
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field String ID>
	//    2    4:invokespecial   #25  <Method void zzfz(String)>
	//    3    7:return          
	}

	protected final boolean zza(String s, String s1, Map map)
	{
		return s.contains(((CharSequence) (s1)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #33  <Method boolean String.contains(CharSequence)>
	//    3    5:ireturn         
	}

	private static final String ID;

	static 
	{
		ID = zza.zzbm.toString();
	//    0    0:getstatic       #14  <Field zza zza.zzbm>
	//    1    3:invokevirtual   #18  <Method String zza.toString()>
	//    2    6:putstatic       #20  <Field String ID>
	//*   3    9:return          
	}
}
