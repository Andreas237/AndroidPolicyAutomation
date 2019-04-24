// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbr, zzaxm, zzbbs

public final class zzaxl extends Enum
	implements zzbbr
{

	private zzaxl(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #58  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #60  <Field int value>
	//    7   11:return          
	}

	public static zzaxl[] values()
	{
		return (zzaxl[])((zzaxl []) (zzdli)).clone();
	//    0    0:getstatic       #48  <Field zzaxl[] zzdli>
	//    1    3:invokevirtual   #69  <Method Object _5B_Lcom.google.android.gms.internal.ads.zzaxl_3B_.clone()>
	//    2    6:checkcast       #65  <Class zzaxl[]>
	//    3    9:areturn         
	}

	public static zzaxl zzax(int i)
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
			return zzdlg;
	//    4   34:getstatic       #42  <Field zzaxl zzdlg>
	//    5   37:areturn         

		case 2: // '\002'
			return zzdlf;
	//    6   38:getstatic       #38  <Field zzaxl zzdlf>
	//    7   41:areturn         

		case 1: // '\001'
			return zzdle;
	//    8   42:getstatic       #34  <Field zzaxl zzdle>
	//    9   45:areturn         

		case 0: // '\0'
			return zzdld;
	//   10   46:getstatic       #30  <Field zzaxl zzdld>
	//   11   49:areturn         
		}
	}

	public final int zzhq()
	{
		if(this == zzdlh)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #46  <Field zzaxl zzdlh>
	//*   2    4:if_acmpne       17
			throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
	//    3    7:new             #75  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #77  <String "Can't get the number of an unknown enum value.">
	//    6   13:invokespecial   #80  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		else
			return value;
	//    8   17:aload_0         
	//    9   18:getfield        #60  <Field int value>
	//   10   21:ireturn         
	}

	private static final zzbbs zzall = new zzaxm();
	public static final zzaxl zzdld;
	public static final zzaxl zzdle;
	private static final zzaxl zzdlf;
	private static final zzaxl zzdlg;
	public static final zzaxl zzdlh;
	private static final zzaxl zzdli[];
	private final int value;

	static 
	{
		zzdld = new zzaxl("UNKNOWN_STATUS", 0, 0);
	//    0    0:new             #2   <Class zzaxl>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "UNKNOWN_STATUS">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #28  <Method void zzaxl(String, int, int)>
	//    6   11:putstatic       #30  <Field zzaxl zzdld>
		zzdle = new zzaxl("ENABLED", 1, 1);
	//    7   14:new             #2   <Class zzaxl>
	//    8   17:dup             
	//    9   18:ldc1            #32  <String "ENABLED">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #28  <Method void zzaxl(String, int, int)>
	//   13   25:putstatic       #34  <Field zzaxl zzdle>
		zzdlf = new zzaxl("DISABLED", 2, 2);
	//   14   28:new             #2   <Class zzaxl>
	//   15   31:dup             
	//   16   32:ldc1            #36  <String "DISABLED">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #28  <Method void zzaxl(String, int, int)>
	//   20   39:putstatic       #38  <Field zzaxl zzdlf>
		zzdlg = new zzaxl("DESTROYED", 3, 3);
	//   21   42:new             #2   <Class zzaxl>
	//   22   45:dup             
	//   23   46:ldc1            #40  <String "DESTROYED">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #28  <Method void zzaxl(String, int, int)>
	//   27   53:putstatic       #42  <Field zzaxl zzdlg>
		zzdlh = new zzaxl("UNRECOGNIZED", 4, -1);
	//   28   56:new             #2   <Class zzaxl>
	//   29   59:dup             
	//   30   60:ldc1            #44  <String "UNRECOGNIZED">
	//   31   62:iconst_4        
	//   32   63:iconst_m1       
	//   33   64:invokespecial   #28  <Method void zzaxl(String, int, int)>
	//   34   67:putstatic       #46  <Field zzaxl zzdlh>
		zzdli = (new zzaxl[] {
			zzdld, zzdle, zzdlf, zzdlg, zzdlh
		});
	//   35   70:iconst_5        
	//   36   71:anewarray       zzaxl[]
	//   37   74:dup             
	//   38   75:iconst_0        
	//   39   76:getstatic       #30  <Field zzaxl zzdld>
	//   40   79:aastore         
	//   41   80:dup             
	//   42   81:iconst_1        
	//   43   82:getstatic       #34  <Field zzaxl zzdle>
	//   44   85:aastore         
	//   45   86:dup             
	//   46   87:iconst_2        
	//   47   88:getstatic       #38  <Field zzaxl zzdlf>
	//   48   91:aastore         
	//   49   92:dup             
	//   50   93:iconst_3        
	//   51   94:getstatic       #42  <Field zzaxl zzdlg>
	//   52   97:aastore         
	//   53   98:dup             
	//   54   99:iconst_4        
	//   55  100:getstatic       #46  <Field zzaxl zzdlh>
	//   56  103:aastore         
	//   57  104:putstatic       #48  <Field zzaxl[] zzdli>
	//   58  107:new             #50  <Class zzaxm>
	//   59  110:dup             
	//   60  111:invokespecial   #52  <Method void zzaxm()>
	//   61  114:putstatic       #54  <Field zzbbs zzall>
	//*  62  117:return          
	}
}
