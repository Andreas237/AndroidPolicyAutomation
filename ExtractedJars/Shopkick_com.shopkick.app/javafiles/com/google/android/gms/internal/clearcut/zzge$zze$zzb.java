// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcj, zzge, zzgg, zzck

public static final class zzge$zze$zzb extends Enum
	implements zzcj
{

	public static zzge$zze$zzb[] values()
	{
		return (zzge$zze$zzb[])((zzge$zze$zzb []) (zzuh)).clone();
	//    0    0:getstatic       #54  <Field zzge$zze$zzb[] zzuh>
	//    1    3:invokevirtual   #75  <Method Object _5B_Lcom.google.android.gms.internal.clearcut.zzge$zze$zzb_3B_.clone()>
	//    2    6:checkcast       #71  <Class zzge$zze$zzb[]>
	//    3    9:areturn         
	}

	public static zzge$zze$zzb zzar(int i)
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
			return zzug;
	//    4   38:getstatic       #52  <Field zzge$zze$zzb zzug>
	//    5   41:areturn         

		case 3: // '\003'
			return zzuf;
	//    6   42:getstatic       #48  <Field zzge$zze$zzb zzuf>
	//    7   45:areturn         

		case 2: // '\002'
			return zzue;
	//    8   46:getstatic       #44  <Field zzge$zze$zzb zzue>
	//    9   49:areturn         

		case 1: // '\001'
			return zzud;
	//   10   50:getstatic       #40  <Field zzge$zze$zzb zzud>
	//   11   53:areturn         

		case 0: // '\0'
			return zzuc;
	//   12   54:getstatic       #36  <Field zzge$zze$zzb zzuc>
	//   13   57:areturn         
		}
	}

	public static zzck zzd()
	{
		return zzbq;
	//    0    0:getstatic       #60  <Field zzck zzbq>
	//    1    3:areturn         
	}

	public final int zzc()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field int value>
	//    2    4:ireturn         
	}

	private static final zzck zzbq = new zzgg();
	private static final zzge$zze$zzb zzuc;
	private static final zzge$zze$zzb zzud;
	private static final zzge$zze$zzb zzue;
	private static final zzge$zze$zzb zzuf;
	private static final zzge$zze$zzb zzug;
	private static final zzge$zze$zzb zzuh[];
	private final int value;

	static 
	{
		zzuc = new zzge$zze$zzb("CLIENT_UNKNOWN", 0, 0);
	//    0    0:new             #2   <Class zzge$zze$zzb>
	//    1    3:dup             
	//    2    4:ldc1            #30  <String "CLIENT_UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #34  <Method void zzge$zze$zzb(String, int, int)>
	//    6   11:putstatic       #36  <Field zzge$zze$zzb zzuc>
		zzud = new zzge$zze$zzb("CHIRP", 1, 1);
	//    7   14:new             #2   <Class zzge$zze$zzb>
	//    8   17:dup             
	//    9   18:ldc1            #38  <String "CHIRP">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #34  <Method void zzge$zze$zzb(String, int, int)>
	//   13   25:putstatic       #40  <Field zzge$zze$zzb zzud>
		zzue = new zzge$zze$zzb("WAYMO", 2, 2);
	//   14   28:new             #2   <Class zzge$zze$zzb>
	//   15   31:dup             
	//   16   32:ldc1            #42  <String "WAYMO">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #34  <Method void zzge$zze$zzb(String, int, int)>
	//   20   39:putstatic       #44  <Field zzge$zze$zzb zzue>
		zzuf = new zzge$zze$zzb("GV_ANDROID", 3, 3);
	//   21   42:new             #2   <Class zzge$zze$zzb>
	//   22   45:dup             
	//   23   46:ldc1            #46  <String "GV_ANDROID">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #34  <Method void zzge$zze$zzb(String, int, int)>
	//   27   53:putstatic       #48  <Field zzge$zze$zzb zzuf>
		zzug = new zzge$zze$zzb("GV_IOS", 4, 4);
	//   28   56:new             #2   <Class zzge$zze$zzb>
	//   29   59:dup             
	//   30   60:ldc1            #50  <String "GV_IOS">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #34  <Method void zzge$zze$zzb(String, int, int)>
	//   34   67:putstatic       #52  <Field zzge$zze$zzb zzug>
		zzuh = (new zzge$zze$zzb[] {
			zzuc, zzud, zzue, zzuf, zzug
		});
	//   35   70:iconst_5        
	//   36   71:anewarray       zzge$zze$zzb[]
	//   37   74:dup             
	//   38   75:iconst_0        
	//   39   76:getstatic       #36  <Field zzge$zze$zzb zzuc>
	//   40   79:aastore         
	//   41   80:dup             
	//   42   81:iconst_1        
	//   43   82:getstatic       #40  <Field zzge$zze$zzb zzud>
	//   44   85:aastore         
	//   45   86:dup             
	//   46   87:iconst_2        
	//   47   88:getstatic       #44  <Field zzge$zze$zzb zzue>
	//   48   91:aastore         
	//   49   92:dup             
	//   50   93:iconst_3        
	//   51   94:getstatic       #48  <Field zzge$zze$zzb zzuf>
	//   52   97:aastore         
	//   53   98:dup             
	//   54   99:iconst_4        
	//   55  100:getstatic       #52  <Field zzge$zze$zzb zzug>
	//   56  103:aastore         
	//   57  104:putstatic       #54  <Field zzge$zze$zzb[] zzuh>
	//   58  107:new             #56  <Class zzgg>
	//   59  110:dup             
	//   60  111:invokespecial   #58  <Method void zzgg()>
	//   61  114:putstatic       #60  <Field zzck zzbq>
	//*  62  117:return          
	}

	private zzge$zze$zzb(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #64  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #66  <Field int value>
	//    7   11:return          
	}
}
