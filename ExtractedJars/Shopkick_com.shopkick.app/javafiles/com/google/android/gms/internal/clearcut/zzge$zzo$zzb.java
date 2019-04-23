// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcj, zzge, zzgl, zzck

public static final class zzge$zzo$zzb extends Enum
	implements zzcj
{

	public static zzge$zzo$zzb[] values()
	{
		return (zzge$zzo$zzb[])((zzge$zzo$zzb []) (zzyz)).clone();
	//    0    0:getstatic       #44  <Field zzge$zzo$zzb[] zzyz>
	//    1    3:invokevirtual   #65  <Method Object _5B_Lcom.google.android.gms.internal.clearcut.zzge$zzo$zzb_3B_.clone()>
	//    2    6:checkcast       #61  <Class zzge$zzo$zzb[]>
	//    3    9:areturn         
	}

	public static zzge$zzo$zzb zzaw(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 38
	//	               1 34
	//	               2 30
		default:
			return null;
	//    2   28:aconst_null     
	//    3   29:areturn         

		case 2: // '\002'
			return zzyy;
	//    4   30:getstatic       #42  <Field zzge$zzo$zzb zzyy>
	//    5   33:areturn         

		case 1: // '\001'
			return zzyx;
	//    6   34:getstatic       #38  <Field zzge$zzo$zzb zzyx>
	//    7   37:areturn         

		case 0: // '\0'
			return zzyw;
	//    8   38:getstatic       #34  <Field zzge$zzo$zzb zzyw>
	//    9   41:areturn         
		}
	}

	public static zzck zzd()
	{
		return zzbq;
	//    0    0:getstatic       #50  <Field zzck zzbq>
	//    1    3:areturn         
	}

	public final int zzc()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int value>
	//    2    4:ireturn         
	}

	private static final zzck zzbq = new zzgl();
	private static final zzge$zzo$zzb zzyw;
	private static final zzge$zzo$zzb zzyx;
	private static final zzge$zzo$zzb zzyy;
	private static final zzge$zzo$zzb zzyz[];
	private final int value;

	static 
	{
		zzyw = new zzge$zzo$zzb("NONE", 0, 0);
	//    0    0:new             #2   <Class zzge$zzo$zzb>
	//    1    3:dup             
	//    2    4:ldc1            #28  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #32  <Method void zzge$zzo$zzb(String, int, int)>
	//    6   11:putstatic       #34  <Field zzge$zzo$zzb zzyw>
		zzyx = new zzge$zzo$zzb("WALL_CLOCK_SET", 1, 1);
	//    7   14:new             #2   <Class zzge$zzo$zzb>
	//    8   17:dup             
	//    9   18:ldc1            #36  <String "WALL_CLOCK_SET">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #32  <Method void zzge$zzo$zzb(String, int, int)>
	//   13   25:putstatic       #38  <Field zzge$zzo$zzb zzyx>
		zzyy = new zzge$zzo$zzb("DEVICE_BOOT", 2, 2);
	//   14   28:new             #2   <Class zzge$zzo$zzb>
	//   15   31:dup             
	//   16   32:ldc1            #40  <String "DEVICE_BOOT">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #32  <Method void zzge$zzo$zzb(String, int, int)>
	//   20   39:putstatic       #42  <Field zzge$zzo$zzb zzyy>
		zzyz = (new zzge$zzo$zzb[] {
			zzyw, zzyx, zzyy
		});
	//   21   42:iconst_3        
	//   22   43:anewarray       zzge$zzo$zzb[]
	//   23   46:dup             
	//   24   47:iconst_0        
	//   25   48:getstatic       #34  <Field zzge$zzo$zzb zzyw>
	//   26   51:aastore         
	//   27   52:dup             
	//   28   53:iconst_1        
	//   29   54:getstatic       #38  <Field zzge$zzo$zzb zzyx>
	//   30   57:aastore         
	//   31   58:dup             
	//   32   59:iconst_2        
	//   33   60:getstatic       #42  <Field zzge$zzo$zzb zzyy>
	//   34   63:aastore         
	//   35   64:putstatic       #44  <Field zzge$zzo$zzb[] zzyz>
	//   36   67:new             #46  <Class zzgl>
	//   37   70:dup             
	//   38   71:invokespecial   #48  <Method void zzgl()>
	//   39   74:putstatic       #50  <Field zzck zzbq>
	//*  40   77:return          
	}

	private zzge$zzo$zzb(String s, int i, int j)
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
