// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzur, zzc, zze, zzf, 
//			zzus, zzut

public static final class zzc$zza$zzb extends Enum
	implements zzur
{

	public static zzc$zza$zzb[] values()
	{
		return (zzc$zza$zzb[])((zzc$zza$zzb []) (zzob)).clone();
	//    0    0:getstatic       #44  <Field zzc$zza$zzb[] zzob>
	//    1    3:invokevirtual   #65  <Method Object _5B_Lcom.google.android.gms.internal.measurement.zzc$zza$zzb_3B_.clone()>
	//    2    6:checkcast       #61  <Class zzc$zza$zzb[]>
	//    3    9:areturn         
	}

	public static zzc$zza$zzb zza(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 38
	//	               2 34
	//	               3 30
		default:
			return null;
	//    2   28:aconst_null     
	//    3   29:areturn         

		case 3: // '\003'
			return zznz;
	//    4   30:getstatic       #42  <Field zzc$zza$zzb zznz>
	//    5   33:areturn         

		case 2: // '\002'
			return zzny;
	//    6   34:getstatic       #38  <Field zzc$zza$zzb zzny>
	//    7   37:areturn         

		case 1: // '\001'
			return zznx;
	//    8   38:getstatic       #34  <Field zzc$zza$zzb zznx>
	//    9   41:areturn         
		}
	}

	public static zzut zzd()
	{
		return zzf.zzoc;
	//    0    0:getstatic       #74  <Field zzut zzf.zzoc>
	//    1    3:areturn         
	}

	public final int zzc()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int value>
	//    2    4:ireturn         
	}

	private static final zzc$zza$zzb zznx;
	private static final zzc$zza$zzb zzny;
	private static final zzc$zza$zzb zznz;
	private static final zzus zzoa = new zze();
	private static final zzc$zza$zzb zzob[];
	private final int value;

	static 
	{
		zznx = new zzc$zza$zzb("NO_CACHE", 0, 1);
	//    0    0:new             #2   <Class zzc$zza$zzb>
	//    1    3:dup             
	//    2    4:ldc1            #28  <String "NO_CACHE">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #32  <Method void zzc$zza$zzb(String, int, int)>
	//    6   11:putstatic       #34  <Field zzc$zza$zzb zznx>
		zzny = new zzc$zza$zzb("PRIVATE", 1, 2);
	//    7   14:new             #2   <Class zzc$zza$zzb>
	//    8   17:dup             
	//    9   18:ldc1            #36  <String "PRIVATE">
	//   10   20:iconst_1        
	//   11   21:iconst_2        
	//   12   22:invokespecial   #32  <Method void zzc$zza$zzb(String, int, int)>
	//   13   25:putstatic       #38  <Field zzc$zza$zzb zzny>
		zznz = new zzc$zza$zzb("PUBLIC", 2, 3);
	//   14   28:new             #2   <Class zzc$zza$zzb>
	//   15   31:dup             
	//   16   32:ldc1            #40  <String "PUBLIC">
	//   17   34:iconst_2        
	//   18   35:iconst_3        
	//   19   36:invokespecial   #32  <Method void zzc$zza$zzb(String, int, int)>
	//   20   39:putstatic       #42  <Field zzc$zza$zzb zznz>
		zzob = (new zzc$zza$zzb[] {
			zznx, zzny, zznz
		});
	//   21   42:iconst_3        
	//   22   43:anewarray       zzc$zza$zzb[]
	//   23   46:dup             
	//   24   47:iconst_0        
	//   25   48:getstatic       #34  <Field zzc$zza$zzb zznx>
	//   26   51:aastore         
	//   27   52:dup             
	//   28   53:iconst_1        
	//   29   54:getstatic       #38  <Field zzc$zza$zzb zzny>
	//   30   57:aastore         
	//   31   58:dup             
	//   32   59:iconst_2        
	//   33   60:getstatic       #42  <Field zzc$zza$zzb zznz>
	//   34   63:aastore         
	//   35   64:putstatic       #44  <Field zzc$zza$zzb[] zzob>
	//   36   67:new             #46  <Class zze>
	//   37   70:dup             
	//   38   71:invokespecial   #48  <Method void zze()>
	//   39   74:putstatic       #50  <Field zzus zzoa>
	//*  40   77:return          
	}

	private zzc$zza$zzb(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #54  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #56  <Field int value>
	//    7   11:return          
	}
}
