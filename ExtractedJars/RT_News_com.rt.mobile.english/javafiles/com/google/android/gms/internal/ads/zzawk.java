// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbr, zzawl, zzbbs

public final class zzawk extends Enum
	implements zzbbr
{

	private zzawk(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #53  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #55  <Field int value>
	//    7   11:return          
	}

	public static zzawk[] values()
	{
		return (zzawk[])((zzawk []) (zzdjg)).clone();
	//    0    0:getstatic       #43  <Field zzawk[] zzdjg>
	//    1    3:invokevirtual   #64  <Method Object _5B_Lcom.google.android.gms.internal.ads.zzawk_3B_.clone()>
	//    2    6:checkcast       #60  <Class zzawk[]>
	//    3    9:areturn         
	}

	public static zzawk zzaq(int i)
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
			return zzdje;
	//    4   30:getstatic       #37  <Field zzawk zzdje>
	//    5   33:areturn         

		case 1: // '\001'
			return zzdjd;
	//    6   34:getstatic       #33  <Field zzawk zzdjd>
	//    7   37:areturn         

		case 0: // '\0'
			return zzdjc;
	//    8   38:getstatic       #29  <Field zzawk zzdjc>
	//    9   41:areturn         
		}
	}

	public final int zzhq()
	{
		if(this == zzdjf)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #41  <Field zzawk zzdjf>
	//*   2    4:if_acmpne       17
			throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
	//    3    7:new             #70  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #72  <String "Can't get the number of an unknown enum value.">
	//    6   13:invokespecial   #75  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		else
			return value;
	//    8   17:aload_0         
	//    9   18:getfield        #55  <Field int value>
	//   10   21:ireturn         
	}

	private static final zzbbs zzall = new zzawl();
	public static final zzawk zzdjc;
	public static final zzawk zzdjd;
	public static final zzawk zzdje;
	public static final zzawk zzdjf;
	private static final zzawk zzdjg[];
	private final int value;

	static 
	{
		zzdjc = new zzawk("UNKNOWN_FORMAT", 0, 0);
	//    0    0:new             #2   <Class zzawk>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "UNKNOWN_FORMAT">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #27  <Method void zzawk(String, int, int)>
	//    6   11:putstatic       #29  <Field zzawk zzdjc>
		zzdjd = new zzawk("UNCOMPRESSED", 1, 1);
	//    7   14:new             #2   <Class zzawk>
	//    8   17:dup             
	//    9   18:ldc1            #31  <String "UNCOMPRESSED">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #27  <Method void zzawk(String, int, int)>
	//   13   25:putstatic       #33  <Field zzawk zzdjd>
		zzdje = new zzawk("COMPRESSED", 2, 2);
	//   14   28:new             #2   <Class zzawk>
	//   15   31:dup             
	//   16   32:ldc1            #35  <String "COMPRESSED">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #27  <Method void zzawk(String, int, int)>
	//   20   39:putstatic       #37  <Field zzawk zzdje>
		zzdjf = new zzawk("UNRECOGNIZED", 3, -1);
	//   21   42:new             #2   <Class zzawk>
	//   22   45:dup             
	//   23   46:ldc1            #39  <String "UNRECOGNIZED">
	//   24   48:iconst_3        
	//   25   49:iconst_m1       
	//   26   50:invokespecial   #27  <Method void zzawk(String, int, int)>
	//   27   53:putstatic       #41  <Field zzawk zzdjf>
		zzdjg = (new zzawk[] {
			zzdjc, zzdjd, zzdje, zzdjf
		});
	//   28   56:iconst_4        
	//   29   57:anewarray       zzawk[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:getstatic       #29  <Field zzawk zzdjc>
	//   33   65:aastore         
	//   34   66:dup             
	//   35   67:iconst_1        
	//   36   68:getstatic       #33  <Field zzawk zzdjd>
	//   37   71:aastore         
	//   38   72:dup             
	//   39   73:iconst_2        
	//   40   74:getstatic       #37  <Field zzawk zzdje>
	//   41   77:aastore         
	//   42   78:dup             
	//   43   79:iconst_3        
	//   44   80:getstatic       #41  <Field zzawk zzdjf>
	//   45   83:aastore         
	//   46   84:putstatic       #43  <Field zzawk[] zzdjg>
	//   47   87:new             #45  <Class zzawl>
	//   48   90:dup             
	//   49   91:invokespecial   #47  <Method void zzawl()>
	//   50   94:putstatic       #49  <Field zzbbs zzall>
	//*  51   97:return          
	}
}
