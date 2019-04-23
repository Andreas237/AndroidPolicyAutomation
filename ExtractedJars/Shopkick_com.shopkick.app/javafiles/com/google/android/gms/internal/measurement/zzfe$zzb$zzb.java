// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzur, zzfe, zzfg, zzfh, 
//			zzus, zzut

public static final class zzfe$zzb$zzb extends Enum
	implements zzur
{

	public static zzfe$zzb$zzb[] values()
	{
		return (zzfe$zzb$zzb[])((zzfe$zzb$zzb []) (zzavc)).clone();
	//    0    0:getstatic       #38  <Field zzfe$zzb$zzb[] zzavc>
	//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.google.android.gms.internal.measurement.zzfe$zzb$zzb_3B_.clone()>
	//    2    6:checkcast       #55  <Class zzfe$zzb$zzb[]>
	//    3    9:areturn         
	}

	public static zzut zzd()
	{
		return zzfh.zzoc;
	//    0    0:getstatic       #67  <Field zzut zzfh.zzoc>
	//    1    3:areturn         
	}

	public static zzfe$zzb$zzb zzt(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 2: default 24
	//	               1 30
	//	               2 26
		default:
			return null;
	//    2   24:aconst_null     
	//    3   25:areturn         

		case 2: // '\002'
			return zzavb;
	//    4   26:getstatic       #36  <Field zzfe$zzb$zzb zzavb>
	//    5   29:areturn         

		case 1: // '\001'
			return zzava;
	//    6   30:getstatic       #32  <Field zzfe$zzb$zzb zzava>
	//    7   33:areturn         
		}
	}

	public final int zzc()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int value>
	//    2    4:ireturn         
	}

	private static final zzfe$zzb$zzb zzava;
	private static final zzfe$zzb$zzb zzavb;
	private static final zzfe$zzb$zzb zzavc[];
	private static final zzus zzoa = new zzfg();
	private final int value;

	static 
	{
		zzava = new zzfe$zzb$zzb("RADS", 0, 1);
	//    0    0:new             #2   <Class zzfe$zzb$zzb>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "RADS">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #30  <Method void zzfe$zzb$zzb(String, int, int)>
	//    6   11:putstatic       #32  <Field zzfe$zzb$zzb zzava>
		zzavb = new zzfe$zzb$zzb("PROVISIONING", 1, 2);
	//    7   14:new             #2   <Class zzfe$zzb$zzb>
	//    8   17:dup             
	//    9   18:ldc1            #34  <String "PROVISIONING">
	//   10   20:iconst_1        
	//   11   21:iconst_2        
	//   12   22:invokespecial   #30  <Method void zzfe$zzb$zzb(String, int, int)>
	//   13   25:putstatic       #36  <Field zzfe$zzb$zzb zzavb>
		zzavc = (new zzfe$zzb$zzb[] {
			zzava, zzavb
		});
	//   14   28:iconst_2        
	//   15   29:anewarray       zzfe$zzb$zzb[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:getstatic       #32  <Field zzfe$zzb$zzb zzava>
	//   19   37:aastore         
	//   20   38:dup             
	//   21   39:iconst_1        
	//   22   40:getstatic       #36  <Field zzfe$zzb$zzb zzavb>
	//   23   43:aastore         
	//   24   44:putstatic       #38  <Field zzfe$zzb$zzb[] zzavc>
	//   25   47:new             #40  <Class zzfg>
	//   26   50:dup             
	//   27   51:invokespecial   #42  <Method void zzfg()>
	//   28   54:putstatic       #44  <Field zzus zzoa>
	//*  29   57:return          
	}

	private zzfe$zzb$zzb(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #48  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #50  <Field int value>
	//    7   11:return          
	}
}
