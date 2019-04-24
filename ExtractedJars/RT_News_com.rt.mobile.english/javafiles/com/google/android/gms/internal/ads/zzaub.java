// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaxp, zzbbo

public final class zzaub
{

	public static zzaxp zza(String s, String s1, String s2, int i, boolean flag)
	{
		zzaxp.zza zza1 = zzaxp.zzzi().zzee(s1);
	//    0    0:invokestatic    #12  <Method zzaxp$zza zzaxp.zzzi()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #18  <Method zzaxp$zza zzaxp$zza.zzee(String)>
	//    3    7:astore          5
		s1 = String.valueOf(((Object) (s2)));
	//    4    9:aload_2         
	//    5   10:invokestatic    #24  <Method String String.valueOf(Object)>
	//    6   13:astore_1        
		if(s1.length() != 0)
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #28  <Method int String.length()>
	//*   9   18:ifeq            31
			s1 = "type.googleapis.com/google.crypto.tink.".concat(s1);
	//   10   21:ldc1            #30  <String "type.googleapis.com/google.crypto.tink.">
	//   11   23:aload_1         
	//   12   24:invokevirtual   #34  <Method String String.concat(String)>
	//   13   27:astore_1        
		else
	//*  14   28:goto            41
			s1 = new String("type.googleapis.com/google.crypto.tink.");
	//   15   31:new             #20  <Class String>
	//   16   34:dup             
	//   17   35:ldc1            #30  <String "type.googleapis.com/google.crypto.tink.">
	//   18   37:invokespecial   #38  <Method void String(String)>
	//   19   40:astore_1        
		return (zzaxp)(zzbbo)((zzbbo.zza) (zza1.zzef(s1).zzaz(0).zzao(true).zzeg(s))).zzadi();
	//   20   41:aload           5
	//   21   43:aload_1         
	//   22   44:invokevirtual   #41  <Method zzaxp$zza zzaxp$zza.zzef(String)>
	//   23   47:iconst_0        
	//   24   48:invokevirtual   #45  <Method zzaxp$zza zzaxp$zza.zzaz(int)>
	//   25   51:iconst_1        
	//   26   52:invokevirtual   #49  <Method zzaxp$zza zzaxp$zza.zzao(boolean)>
	//   27   55:aload_0         
	//   28   56:invokevirtual   #52  <Method zzaxp$zza zzaxp$zza.zzeg(String)>
	//   29   59:invokevirtual   #58  <Method zzbbo zzbbo$zza.zzadi()>
	//   30   62:checkcast       #60  <Class zzbbo>
	//   31   65:checkcast       #8   <Class zzaxp>
	//   32   68:areturn         
	}
}
