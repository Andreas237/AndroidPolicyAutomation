// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//			zzeh

static final class zzeh$zza extends Enum
{

	public static zzeh$zza[] values()
	{
		return (zzeh$zza[])((zzeh$zza []) (zzbej)).clone();
	//    0    0:getstatic       #34  <Field zzeh$zza[] zzbej>
	//    1    3:invokevirtual   #44  <Method Object _5B_Lcom.google.android.gms.tagmanager.zzeh$zza_3B_.clone()>
	//    2    6:checkcast       #40  <Class zzeh$zza[]>
	//    3    9:areturn         
	}

	public static final zzeh$zza zzbeg;
	public static final zzeh$zza zzbeh;
	public static final zzeh$zza zzbei;
	private static final zzeh$zza zzbej[];

	static 
	{
		zzbeg = new zzeh$zza("NONE", 0);
	//    0    0:new             #2   <Class zzeh$zza>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void zzeh$zza(String, int)>
	//    5   10:putstatic       #24  <Field zzeh$zza zzbeg>
		zzbeh = new zzeh$zza("CONTAINER", 1);
	//    6   13:new             #2   <Class zzeh$zza>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "CONTAINER">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void zzeh$zza(String, int)>
	//   11   23:putstatic       #28  <Field zzeh$zza zzbeh>
		zzbei = new zzeh$zza("CONTAINER_DEBUG", 2);
	//   12   26:new             #2   <Class zzeh$zza>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "CONTAINER_DEBUG">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void zzeh$zza(String, int)>
	//   17   36:putstatic       #32  <Field zzeh$zza zzbei>
		zzbej = (new zzeh$zza[] {
			zzbeg, zzbeh, zzbei
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       zzeh$zza[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #24  <Field zzeh$zza zzbeg>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #28  <Field zzeh$zza zzbeh>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #32  <Field zzeh$zza zzbei>
	//   31   60:aastore         
	//   32   61:putstatic       #34  <Field zzeh$zza[] zzbej>
	//*  33   64:return          
	}

	private zzeh$zza(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #36  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
