// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzgb, zzcz, zzdb, zzdc, 
//			zzgc, zzgd

public static final class zzcz$zzc$zzb extends Enum
	implements zzgb
{

	public static zzcz$zzc$zzb[] values()
	{
		return (zzcz$zzc$zzb[])((zzcz$zzc$zzb []) (zzmp)).clone();
	//    0    0:getstatic       #49  <Field zzcz$zzc$zzb[] zzmp>
	//    1    3:invokevirtual   #70  <Method Object _5B_Lcom.google.android.gms.internal.vision.zzcz$zzc$zzb_3B_.clone()>
	//    2    6:checkcast       #66  <Class zzcz$zzc$zzb[]>
	//    3    9:areturn         
	}

	public static zzgd zzah()
	{
		return zzdc.zzhl;
	//    0    0:getstatic       #78  <Field zzgd zzdc.zzhl>
	//    1    3:areturn         
	}

	public static zzcz$zzc$zzb zzs(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 46
	//	               1 42
	//	               2 38
	//	               3 34
		default:
			return null;
	//    2   32:aconst_null     
	//    3   33:areturn         

		case 3: // '\003'
			return zzmo;
	//    4   34:getstatic       #47  <Field zzcz$zzc$zzb zzmo>
	//    5   37:areturn         

		case 2: // '\002'
			return zzmn;
	//    6   38:getstatic       #43  <Field zzcz$zzc$zzb zzmn>
	//    7   41:areturn         

		case 1: // '\001'
			return zzmm;
	//    8   42:getstatic       #39  <Field zzcz$zzc$zzb zzmm>
	//    9   45:areturn         

		case 0: // '\0'
			return zzml;
	//   10   46:getstatic       #35  <Field zzcz$zzc$zzb zzml>
	//   11   49:areturn         
		}
	}

	public final int zzr()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int value>
	//    2    4:ireturn         
	}

	private static final zzgc zzdv = new zzdb();
	private static final zzcz$zzc$zzb zzml;
	private static final zzcz$zzc$zzb zzmm;
	private static final zzcz$zzc$zzb zzmn;
	private static final zzcz$zzc$zzb zzmo;
	private static final zzcz$zzc$zzb zzmp[];
	private final int value;

	static 
	{
		zzml = new zzcz$zzc$zzb("REASON_UNKNOWN", 0, 0);
	//    0    0:new             #2   <Class zzcz$zzc$zzb>
	//    1    3:dup             
	//    2    4:ldc1            #29  <String "REASON_UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #33  <Method void zzcz$zzc$zzb(String, int, int)>
	//    6   11:putstatic       #35  <Field zzcz$zzc$zzb zzml>
		zzmm = new zzcz$zzc$zzb("REASON_MISSING", 1, 1);
	//    7   14:new             #2   <Class zzcz$zzc$zzb>
	//    8   17:dup             
	//    9   18:ldc1            #37  <String "REASON_MISSING">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #33  <Method void zzcz$zzc$zzb(String, int, int)>
	//   13   25:putstatic       #39  <Field zzcz$zzc$zzb zzmm>
		zzmn = new zzcz$zzc$zzb("REASON_UPGRADE", 2, 2);
	//   14   28:new             #2   <Class zzcz$zzc$zzb>
	//   15   31:dup             
	//   16   32:ldc1            #41  <String "REASON_UPGRADE">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #33  <Method void zzcz$zzc$zzb(String, int, int)>
	//   20   39:putstatic       #43  <Field zzcz$zzc$zzb zzmn>
		zzmo = new zzcz$zzc$zzb("REASON_INVALID", 3, 3);
	//   21   42:new             #2   <Class zzcz$zzc$zzb>
	//   22   45:dup             
	//   23   46:ldc1            #45  <String "REASON_INVALID">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #33  <Method void zzcz$zzc$zzb(String, int, int)>
	//   27   53:putstatic       #47  <Field zzcz$zzc$zzb zzmo>
		zzmp = (new zzcz$zzc$zzb[] {
			zzml, zzmm, zzmn, zzmo
		});
	//   28   56:iconst_4        
	//   29   57:anewarray       zzcz$zzc$zzb[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:getstatic       #35  <Field zzcz$zzc$zzb zzml>
	//   33   65:aastore         
	//   34   66:dup             
	//   35   67:iconst_1        
	//   36   68:getstatic       #39  <Field zzcz$zzc$zzb zzmm>
	//   37   71:aastore         
	//   38   72:dup             
	//   39   73:iconst_2        
	//   40   74:getstatic       #43  <Field zzcz$zzc$zzb zzmn>
	//   41   77:aastore         
	//   42   78:dup             
	//   43   79:iconst_3        
	//   44   80:getstatic       #47  <Field zzcz$zzc$zzb zzmo>
	//   45   83:aastore         
	//   46   84:putstatic       #49  <Field zzcz$zzc$zzb[] zzmp>
	//   47   87:new             #51  <Class zzdb>
	//   48   90:dup             
	//   49   91:invokespecial   #53  <Method void zzdb()>
	//   50   94:putstatic       #55  <Field zzgc zzdv>
	//*  51   97:return          
	}

	private zzcz$zzc$zzb(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #59  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #61  <Field int value>
	//    7   11:return          
	}
}
