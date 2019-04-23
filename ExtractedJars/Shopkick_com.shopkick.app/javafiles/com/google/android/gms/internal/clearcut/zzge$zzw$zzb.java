// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcj, zzge, zzgs, zzck

public static final class zzge$zzw$zzb extends Enum
	implements zzcj
{

	public static zzge$zzw$zzb[] values()
	{
		return (zzge$zzw$zzb[])((zzge$zzw$zzb []) (zzbid)).clone();
	//    0    0:getstatic       #59  <Field zzge$zzw$zzb[] zzbid>
	//    1    3:invokevirtual   #80  <Method Object _5B_Lcom.google.android.gms.internal.clearcut.zzge$zzw$zzb_3B_.clone()>
	//    2    6:checkcast       #76  <Class zzge$zzw$zzb[]>
	//    3    9:areturn         
	}

	public static zzge$zzw$zzb zzbd(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 5: default 40
	//	               0 62
	//	               1 58
	//	               2 54
	//	               3 50
	//	               4 46
	//	               5 42
		default:
			return null;
	//    2   40:aconst_null     
	//    3   41:areturn         

		case 5: // '\005'
			return zzbic;
	//    4   42:getstatic       #57  <Field zzge$zzw$zzb zzbic>
	//    5   45:areturn         

		case 4: // '\004'
			return zzbib;
	//    6   46:getstatic       #53  <Field zzge$zzw$zzb zzbib>
	//    7   49:areturn         

		case 3: // '\003'
			return zzbia;
	//    8   50:getstatic       #49  <Field zzge$zzw$zzb zzbia>
	//    9   53:areturn         

		case 2: // '\002'
			return zzbhz;
	//   10   54:getstatic       #45  <Field zzge$zzw$zzb zzbhz>
	//   11   57:areturn         

		case 1: // '\001'
			return zzbhy;
	//   12   58:getstatic       #41  <Field zzge$zzw$zzb zzbhy>
	//   13   61:areturn         

		case 0: // '\0'
			return zzbhx;
	//   14   62:getstatic       #37  <Field zzge$zzw$zzb zzbhx>
	//   15   65:areturn         
		}
	}

	public static zzck zzd()
	{
		return zzbq;
	//    0    0:getstatic       #65  <Field zzck zzbq>
	//    1    3:areturn         
	}

	public final int zzc()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int value>
	//    2    4:ireturn         
	}

	private static final zzge$zzw$zzb zzbhx;
	private static final zzge$zzw$zzb zzbhy;
	private static final zzge$zzw$zzb zzbhz;
	private static final zzge$zzw$zzb zzbia;
	private static final zzge$zzw$zzb zzbib;
	private static final zzge$zzw$zzb zzbic;
	private static final zzge$zzw$zzb zzbid[];
	private static final zzck zzbq = new zzgs();
	private final int value;

	static 
	{
		zzbhx = new zzge$zzw$zzb("UNKNOWN", 0, 0);
	//    0    0:new             #2   <Class zzge$zzw$zzb>
	//    1    3:dup             
	//    2    4:ldc1            #31  <String "UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #35  <Method void zzge$zzw$zzb(String, int, int)>
	//    6   11:putstatic       #37  <Field zzge$zzw$zzb zzbhx>
		zzbhy = new zzge$zzw$zzb("ANDROID_CARDBOARD_SDK", 1, 1);
	//    7   14:new             #2   <Class zzge$zzw$zzb>
	//    8   17:dup             
	//    9   18:ldc1            #39  <String "ANDROID_CARDBOARD_SDK">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #35  <Method void zzge$zzw$zzb(String, int, int)>
	//   13   25:putstatic       #41  <Field zzge$zzw$zzb zzbhy>
		zzbhz = new zzge$zzw$zzb("IOS_CARDBOARD_SDK", 2, 2);
	//   14   28:new             #2   <Class zzge$zzw$zzb>
	//   15   31:dup             
	//   16   32:ldc1            #43  <String "IOS_CARDBOARD_SDK">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #35  <Method void zzge$zzw$zzb(String, int, int)>
	//   20   39:putstatic       #45  <Field zzge$zzw$zzb zzbhz>
		zzbia = new zzge$zzw$zzb("ANDROID_UNITY_SDK", 3, 3);
	//   21   42:new             #2   <Class zzge$zzw$zzb>
	//   22   45:dup             
	//   23   46:ldc1            #47  <String "ANDROID_UNITY_SDK">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #35  <Method void zzge$zzw$zzb(String, int, int)>
	//   27   53:putstatic       #49  <Field zzge$zzw$zzb zzbia>
		zzbib = new zzge$zzw$zzb("IOS_UNITY_SDK", 4, 4);
	//   28   56:new             #2   <Class zzge$zzw$zzb>
	//   29   59:dup             
	//   30   60:ldc1            #51  <String "IOS_UNITY_SDK">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #35  <Method void zzge$zzw$zzb(String, int, int)>
	//   34   67:putstatic       #53  <Field zzge$zzw$zzb zzbib>
		zzbic = new zzge$zzw$zzb("WINDOWS", 5, 5);
	//   35   70:new             #2   <Class zzge$zzw$zzb>
	//   36   73:dup             
	//   37   74:ldc1            #55  <String "WINDOWS">
	//   38   76:iconst_5        
	//   39   77:iconst_5        
	//   40   78:invokespecial   #35  <Method void zzge$zzw$zzb(String, int, int)>
	//   41   81:putstatic       #57  <Field zzge$zzw$zzb zzbic>
		zzbid = (new zzge$zzw$zzb[] {
			zzbhx, zzbhy, zzbhz, zzbia, zzbib, zzbic
		});
	//   42   84:bipush          6
	//   43   86:anewarray       zzge$zzw$zzb[]
	//   44   89:dup             
	//   45   90:iconst_0        
	//   46   91:getstatic       #37  <Field zzge$zzw$zzb zzbhx>
	//   47   94:aastore         
	//   48   95:dup             
	//   49   96:iconst_1        
	//   50   97:getstatic       #41  <Field zzge$zzw$zzb zzbhy>
	//   51  100:aastore         
	//   52  101:dup             
	//   53  102:iconst_2        
	//   54  103:getstatic       #45  <Field zzge$zzw$zzb zzbhz>
	//   55  106:aastore         
	//   56  107:dup             
	//   57  108:iconst_3        
	//   58  109:getstatic       #49  <Field zzge$zzw$zzb zzbia>
	//   59  112:aastore         
	//   60  113:dup             
	//   61  114:iconst_4        
	//   62  115:getstatic       #53  <Field zzge$zzw$zzb zzbib>
	//   63  118:aastore         
	//   64  119:dup             
	//   65  120:iconst_5        
	//   66  121:getstatic       #57  <Field zzge$zzw$zzb zzbic>
	//   67  124:aastore         
	//   68  125:putstatic       #59  <Field zzge$zzw$zzb[] zzbid>
	//   69  128:new             #61  <Class zzgs>
	//   70  131:dup             
	//   71  132:invokespecial   #63  <Method void zzgs()>
	//   72  135:putstatic       #65  <Field zzck zzbq>
	//*  73  138:return          
	}

	private zzge$zzw$zzb(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #69  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #71  <Field int value>
	//    7   11:return          
	}
}
