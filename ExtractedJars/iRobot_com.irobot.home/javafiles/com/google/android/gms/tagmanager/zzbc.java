// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzgj

final class zzbc extends zzbq
{

	public zzbc(Context context)
	{
		super(ID, new String[0]);
	//    0    0:aload_0         
	//    1    1:getstatic       #22  <Field String ID>
	//    2    4:iconst_0        
	//    3    5:anewarray       String[]
	//    4    8:invokespecial   #30  <Method void zzbq(String, String[])>
		zzri = context;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #32  <Field Context zzri>
	//    8   16:return          
	}

	public final zzp zzc(Map map)
	{
		map = ((Map) (android.provider.Settings.Secure.getString(zzri.getContentResolver(), "android_id")));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Context zzri>
	//    2    4:invokevirtual   #40  <Method android.content.ContentResolver Context.getContentResolver()>
	//    3    7:ldc1            #42  <String "android_id">
	//    4    9:invokestatic    #48  <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//    5   12:astore_1        
		if(map == null)
	//*   6   13:aload_1         
	//*   7   14:ifnonnull       21
			return zzgj.zzqq();
	//    8   17:invokestatic    #54  <Method zzp zzgj.zzqq()>
	//    9   20:areturn         
		else
			return zzgj.zzj(((Object) (map)));
	//   10   21:aload_1         
	//   11   22:invokestatic    #58  <Method zzp zzgj.zzj(Object)>
	//   12   25:areturn         
	}

	public final boolean zznk()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final String ID;
	private final Context zzri;

	static 
	{
		ID = zza.zzai.toString();
	//    0    0:getstatic       #16  <Field zza zza.zzai>
	//    1    3:invokevirtual   #20  <Method String zza.toString()>
	//    2    6:putstatic       #22  <Field String ID>
	//*   3    9:return          
	}
}
