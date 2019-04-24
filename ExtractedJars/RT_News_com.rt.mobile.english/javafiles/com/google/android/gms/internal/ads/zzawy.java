// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbr, zzawz, zzbbs

public final class zzawy extends Enum
	implements zzbbr
{

	private zzawy(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #63  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #65  <Field int value>
	//    7   11:return          
	}

	public static zzawy[] values()
	{
		return (zzawy[])((zzawy []) (zzdke)).clone();
	//    0    0:getstatic       #53  <Field zzawy[] zzdke>
	//    1    3:invokevirtual   #74  <Method Object _5B_Lcom.google.android.gms.internal.ads.zzawy_3B_.clone()>
	//    2    6:checkcast       #70  <Class zzawy[]>
	//    3    9:areturn         
	}

	public static zzawy zzat(int i)
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
			return zzdkc;
	//    4   38:getstatic       #47  <Field zzawy zzdkc>
	//    5   41:areturn         

		case 3: // '\003'
			return zzdkb;
	//    6   42:getstatic       #43  <Field zzawy zzdkb>
	//    7   45:areturn         

		case 2: // '\002'
			return zzdka;
	//    8   46:getstatic       #39  <Field zzawy zzdka>
	//    9   49:areturn         

		case 1: // '\001'
			return zzdjz;
	//   10   50:getstatic       #35  <Field zzawy zzdjz>
	//   11   53:areturn         

		case 0: // '\0'
			return zzdjy;
	//   12   54:getstatic       #31  <Field zzawy zzdjy>
	//   13   57:areturn         
		}
	}

	public final int zzhq()
	{
		if(this == zzdkd)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #51  <Field zzawy zzdkd>
	//*   2    4:if_acmpne       17
			throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
	//    3    7:new             #80  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #82  <String "Can't get the number of an unknown enum value.">
	//    6   13:invokespecial   #85  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		else
			return value;
	//    8   17:aload_0         
	//    9   18:getfield        #65  <Field int value>
	//   10   21:ireturn         
	}

	private static final zzbbs zzall = new zzawz();
	private static final zzawy zzdjy;
	private static final zzawy zzdjz;
	public static final zzawy zzdka;
	public static final zzawy zzdkb;
	public static final zzawy zzdkc;
	public static final zzawy zzdkd;
	private static final zzawy zzdke[];
	private final int value;

	static 
	{
		zzdjy = new zzawy("UNKNOWN_CURVE", 0, 0);
	//    0    0:new             #2   <Class zzawy>
	//    1    3:dup             
	//    2    4:ldc1            #25  <String "UNKNOWN_CURVE">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #29  <Method void zzawy(String, int, int)>
	//    6   11:putstatic       #31  <Field zzawy zzdjy>
		zzdjz = new zzawy("NIST_P224", 1, 1);
	//    7   14:new             #2   <Class zzawy>
	//    8   17:dup             
	//    9   18:ldc1            #33  <String "NIST_P224">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #29  <Method void zzawy(String, int, int)>
	//   13   25:putstatic       #35  <Field zzawy zzdjz>
		zzdka = new zzawy("NIST_P256", 2, 2);
	//   14   28:new             #2   <Class zzawy>
	//   15   31:dup             
	//   16   32:ldc1            #37  <String "NIST_P256">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #29  <Method void zzawy(String, int, int)>
	//   20   39:putstatic       #39  <Field zzawy zzdka>
		zzdkb = new zzawy("NIST_P384", 3, 3);
	//   21   42:new             #2   <Class zzawy>
	//   22   45:dup             
	//   23   46:ldc1            #41  <String "NIST_P384">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #29  <Method void zzawy(String, int, int)>
	//   27   53:putstatic       #43  <Field zzawy zzdkb>
		zzdkc = new zzawy("NIST_P521", 4, 4);
	//   28   56:new             #2   <Class zzawy>
	//   29   59:dup             
	//   30   60:ldc1            #45  <String "NIST_P521">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #29  <Method void zzawy(String, int, int)>
	//   34   67:putstatic       #47  <Field zzawy zzdkc>
		zzdkd = new zzawy("UNRECOGNIZED", 5, -1);
	//   35   70:new             #2   <Class zzawy>
	//   36   73:dup             
	//   37   74:ldc1            #49  <String "UNRECOGNIZED">
	//   38   76:iconst_5        
	//   39   77:iconst_m1       
	//   40   78:invokespecial   #29  <Method void zzawy(String, int, int)>
	//   41   81:putstatic       #51  <Field zzawy zzdkd>
		zzdke = (new zzawy[] {
			zzdjy, zzdjz, zzdka, zzdkb, zzdkc, zzdkd
		});
	//   42   84:bipush          6
	//   43   86:anewarray       zzawy[]
	//   44   89:dup             
	//   45   90:iconst_0        
	//   46   91:getstatic       #31  <Field zzawy zzdjy>
	//   47   94:aastore         
	//   48   95:dup             
	//   49   96:iconst_1        
	//   50   97:getstatic       #35  <Field zzawy zzdjz>
	//   51  100:aastore         
	//   52  101:dup             
	//   53  102:iconst_2        
	//   54  103:getstatic       #39  <Field zzawy zzdka>
	//   55  106:aastore         
	//   56  107:dup             
	//   57  108:iconst_3        
	//   58  109:getstatic       #43  <Field zzawy zzdkb>
	//   59  112:aastore         
	//   60  113:dup             
	//   61  114:iconst_4        
	//   62  115:getstatic       #47  <Field zzawy zzdkc>
	//   63  118:aastore         
	//   64  119:dup             
	//   65  120:iconst_5        
	//   66  121:getstatic       #51  <Field zzawy zzdkd>
	//   67  124:aastore         
	//   68  125:putstatic       #53  <Field zzawy[] zzdke>
	//   69  128:new             #55  <Class zzawz>
	//   70  131:dup             
	//   71  132:invokespecial   #57  <Method void zzawz()>
	//   72  135:putstatic       #59  <Field zzbbs zzall>
	//*  73  138:return          
	}
}
