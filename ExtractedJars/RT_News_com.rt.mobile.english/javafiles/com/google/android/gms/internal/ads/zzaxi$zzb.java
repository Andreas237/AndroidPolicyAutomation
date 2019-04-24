// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbr, zzaxi, zzaxk, zzbbs

public static final class zzaxi$zzb extends Enum
	implements zzbbr
{

	public static zzaxi$zzb[] values()
	{
		return (zzaxi$zzb[])((zzaxi$zzb []) (zzdlc)).clone();
	//    0    0:getstatic       #56  <Field zzaxi$zzb[] zzdlc>
	//    1    3:invokevirtual   #77  <Method Object _5B_Lcom.google.android.gms.internal.ads.zzaxi$zzb_3B_.clone()>
	//    2    6:checkcast       #73  <Class zzaxi$zzb[]>
	//    3    9:areturn         
	}

	public static zzaxi$zzb zzaw(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 4: default 36
	//	               0 54
	//	               1 50
	//	               2 46
	//	               3 42
	//	               4 38
		default:
			return null;
	//    2   36:aconst_null     
	//    3   37:areturn         

		case 4: // '\004'
			return zzdla;
	//    4   38:getstatic       #50  <Field zzaxi$zzb zzdla>
	//    5   41:areturn         

		case 3: // '\003'
			return zzdkz;
	//    6   42:getstatic       #46  <Field zzaxi$zzb zzdkz>
	//    7   45:areturn         

		case 2: // '\002'
			return zzdky;
	//    8   46:getstatic       #42  <Field zzaxi$zzb zzdky>
	//    9   49:areturn         

		case 1: // '\001'
			return zzdkx;
	//   10   50:getstatic       #38  <Field zzaxi$zzb zzdkx>
	//   11   53:areturn         

		case 0: // '\0'
			return zzdkw;
	//   12   54:getstatic       #34  <Field zzaxi$zzb zzdkw>
	//   13   57:areturn         
		}
	}

	public final int zzhq()
	{
		if(this == zzdlb)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #54  <Field zzaxi$zzb zzdlb>
	//*   2    4:if_acmpne       17
			throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
	//    3    7:new             #83  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #85  <String "Can't get the number of an unknown enum value.">
	//    6   13:invokespecial   #88  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		else
			return value;
	//    8   17:aload_0         
	//    9   18:getfield        #68  <Field int value>
	//   10   21:ireturn         
	}

	private static final zzbbs zzall = new zzaxk();
	public static final zzaxi$zzb zzdkw;
	public static final zzaxi$zzb zzdkx;
	public static final zzaxi$zzb zzdky;
	public static final zzaxi$zzb zzdkz;
	public static final zzaxi$zzb zzdla;
	public static final zzaxi$zzb zzdlb;
	private static final zzaxi$zzb zzdlc[];
	private final int value;

	static 
	{
		zzdkw = new zzaxi$zzb("UNKNOWN_KEYMATERIAL", 0, 0);
	//    0    0:new             #2   <Class zzaxi$zzb>
	//    1    3:dup             
	//    2    4:ldc1            #28  <String "UNKNOWN_KEYMATERIAL">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #32  <Method void zzaxi$zzb(String, int, int)>
	//    6   11:putstatic       #34  <Field zzaxi$zzb zzdkw>
		zzdkx = new zzaxi$zzb("SYMMETRIC", 1, 1);
	//    7   14:new             #2   <Class zzaxi$zzb>
	//    8   17:dup             
	//    9   18:ldc1            #36  <String "SYMMETRIC">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #32  <Method void zzaxi$zzb(String, int, int)>
	//   13   25:putstatic       #38  <Field zzaxi$zzb zzdkx>
		zzdky = new zzaxi$zzb("ASYMMETRIC_PRIVATE", 2, 2);
	//   14   28:new             #2   <Class zzaxi$zzb>
	//   15   31:dup             
	//   16   32:ldc1            #40  <String "ASYMMETRIC_PRIVATE">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #32  <Method void zzaxi$zzb(String, int, int)>
	//   20   39:putstatic       #42  <Field zzaxi$zzb zzdky>
		zzdkz = new zzaxi$zzb("ASYMMETRIC_PUBLIC", 3, 3);
	//   21   42:new             #2   <Class zzaxi$zzb>
	//   22   45:dup             
	//   23   46:ldc1            #44  <String "ASYMMETRIC_PUBLIC">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #32  <Method void zzaxi$zzb(String, int, int)>
	//   27   53:putstatic       #46  <Field zzaxi$zzb zzdkz>
		zzdla = new zzaxi$zzb("REMOTE", 4, 4);
	//   28   56:new             #2   <Class zzaxi$zzb>
	//   29   59:dup             
	//   30   60:ldc1            #48  <String "REMOTE">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #32  <Method void zzaxi$zzb(String, int, int)>
	//   34   67:putstatic       #50  <Field zzaxi$zzb zzdla>
		zzdlb = new zzaxi$zzb("UNRECOGNIZED", 5, -1);
	//   35   70:new             #2   <Class zzaxi$zzb>
	//   36   73:dup             
	//   37   74:ldc1            #52  <String "UNRECOGNIZED">
	//   38   76:iconst_5        
	//   39   77:iconst_m1       
	//   40   78:invokespecial   #32  <Method void zzaxi$zzb(String, int, int)>
	//   41   81:putstatic       #54  <Field zzaxi$zzb zzdlb>
		zzdlc = (new zzaxi$zzb[] {
			zzdkw, zzdkx, zzdky, zzdkz, zzdla, zzdlb
		});
	//   42   84:bipush          6
	//   43   86:anewarray       zzaxi$zzb[]
	//   44   89:dup             
	//   45   90:iconst_0        
	//   46   91:getstatic       #34  <Field zzaxi$zzb zzdkw>
	//   47   94:aastore         
	//   48   95:dup             
	//   49   96:iconst_1        
	//   50   97:getstatic       #38  <Field zzaxi$zzb zzdkx>
	//   51  100:aastore         
	//   52  101:dup             
	//   53  102:iconst_2        
	//   54  103:getstatic       #42  <Field zzaxi$zzb zzdky>
	//   55  106:aastore         
	//   56  107:dup             
	//   57  108:iconst_3        
	//   58  109:getstatic       #46  <Field zzaxi$zzb zzdkz>
	//   59  112:aastore         
	//   60  113:dup             
	//   61  114:iconst_4        
	//   62  115:getstatic       #50  <Field zzaxi$zzb zzdla>
	//   63  118:aastore         
	//   64  119:dup             
	//   65  120:iconst_5        
	//   66  121:getstatic       #54  <Field zzaxi$zzb zzdlb>
	//   67  124:aastore         
	//   68  125:putstatic       #56  <Field zzaxi$zzb[] zzdlc>
	//   69  128:new             #58  <Class zzaxk>
	//   70  131:dup             
	//   71  132:invokespecial   #60  <Method void zzaxk()>
	//   72  135:putstatic       #62  <Field zzbbs zzall>
	//*  73  138:return          
	}

	private zzaxi$zzb(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #66  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #68  <Field int value>
	//    7   11:return          
	}
}
