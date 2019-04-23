// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcj, zzge, zzgq, zzck

public static final class zzge$zzt$zzb extends Enum
	implements zzcj
{

	public static zzge$zzt$zzb[] values()
	{
		return (zzge$zzt$zzb[])((zzge$zzt$zzb []) (zzbhf)).clone();
	//    0    0:getstatic       #64  <Field zzge$zzt$zzb[] zzbhf>
	//    1    3:invokevirtual   #85  <Method Object _5B_Lcom.google.android.gms.internal.clearcut.zzge$zzt$zzb_3B_.clone()>
	//    2    6:checkcast       #81  <Class zzge$zzt$zzb[]>
	//    3    9:areturn         
	}

	public static zzge$zzt$zzb zzbb(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 6: default 44
	//	               0 70
	//	               1 66
	//	               2 62
	//	               3 58
	//	               4 54
	//	               5 50
	//	               6 46
		default:
			return null;
	//    2   44:aconst_null     
	//    3   45:areturn         

		case 6: // '\006'
			return zzbhe;
	//    4   46:getstatic       #62  <Field zzge$zzt$zzb zzbhe>
	//    5   49:areturn         

		case 5: // '\005'
			return zzbhd;
	//    6   50:getstatic       #58  <Field zzge$zzt$zzb zzbhd>
	//    7   53:areturn         

		case 4: // '\004'
			return zzbhc;
	//    8   54:getstatic       #54  <Field zzge$zzt$zzb zzbhc>
	//    9   57:areturn         

		case 3: // '\003'
			return zzbhb;
	//   10   58:getstatic       #50  <Field zzge$zzt$zzb zzbhb>
	//   11   61:areturn         

		case 2: // '\002'
			return zzbha;
	//   12   62:getstatic       #46  <Field zzge$zzt$zzb zzbha>
	//   13   65:areturn         

		case 1: // '\001'
			return zzbgz;
	//   14   66:getstatic       #42  <Field zzge$zzt$zzb zzbgz>
	//   15   69:areturn         

		case 0: // '\0'
			return zzbgy;
	//   16   70:getstatic       #38  <Field zzge$zzt$zzb zzbgy>
	//   17   73:areturn         
		}
	}

	public static zzck zzd()
	{
		return zzbq;
	//    0    0:getstatic       #70  <Field zzck zzbq>
	//    1    3:areturn         
	}

	public final int zzc()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field int value>
	//    2    4:ireturn         
	}

	private static final zzge$zzt$zzb zzbgy;
	private static final zzge$zzt$zzb zzbgz;
	private static final zzge$zzt$zzb zzbha;
	private static final zzge$zzt$zzb zzbhb;
	private static final zzge$zzt$zzb zzbhc;
	private static final zzge$zzt$zzb zzbhd;
	private static final zzge$zzt$zzb zzbhe;
	private static final zzge$zzt$zzb zzbhf[];
	private static final zzck zzbq = new zzgq();
	private final int value;

	static 
	{
		zzbgy = new zzge$zzt$zzb("OS_TYPE_UNKNOWN", 0, 0);
	//    0    0:new             #2   <Class zzge$zzt$zzb>
	//    1    3:dup             
	//    2    4:ldc1            #32  <String "OS_TYPE_UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #36  <Method void zzge$zzt$zzb(String, int, int)>
	//    6   11:putstatic       #38  <Field zzge$zzt$zzb zzbgy>
		zzbgz = new zzge$zzt$zzb("OS_TYPE_MAC", 1, 1);
	//    7   14:new             #2   <Class zzge$zzt$zzb>
	//    8   17:dup             
	//    9   18:ldc1            #40  <String "OS_TYPE_MAC">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #36  <Method void zzge$zzt$zzb(String, int, int)>
	//   13   25:putstatic       #42  <Field zzge$zzt$zzb zzbgz>
		zzbha = new zzge$zzt$zzb("OS_TYPE_WINDOWS", 2, 2);
	//   14   28:new             #2   <Class zzge$zzt$zzb>
	//   15   31:dup             
	//   16   32:ldc1            #44  <String "OS_TYPE_WINDOWS">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #36  <Method void zzge$zzt$zzb(String, int, int)>
	//   20   39:putstatic       #46  <Field zzge$zzt$zzb zzbha>
		zzbhb = new zzge$zzt$zzb("OS_TYPE_ANDROID", 3, 3);
	//   21   42:new             #2   <Class zzge$zzt$zzb>
	//   22   45:dup             
	//   23   46:ldc1            #48  <String "OS_TYPE_ANDROID">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #36  <Method void zzge$zzt$zzb(String, int, int)>
	//   27   53:putstatic       #50  <Field zzge$zzt$zzb zzbhb>
		zzbhc = new zzge$zzt$zzb("OS_TYPE_CROS", 4, 4);
	//   28   56:new             #2   <Class zzge$zzt$zzb>
	//   29   59:dup             
	//   30   60:ldc1            #52  <String "OS_TYPE_CROS">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #36  <Method void zzge$zzt$zzb(String, int, int)>
	//   34   67:putstatic       #54  <Field zzge$zzt$zzb zzbhc>
		zzbhd = new zzge$zzt$zzb("OS_TYPE_LINUX", 5, 5);
	//   35   70:new             #2   <Class zzge$zzt$zzb>
	//   36   73:dup             
	//   37   74:ldc1            #56  <String "OS_TYPE_LINUX">
	//   38   76:iconst_5        
	//   39   77:iconst_5        
	//   40   78:invokespecial   #36  <Method void zzge$zzt$zzb(String, int, int)>
	//   41   81:putstatic       #58  <Field zzge$zzt$zzb zzbhd>
		zzbhe = new zzge$zzt$zzb("OS_TYPE_OPENBSD", 6, 6);
	//   42   84:new             #2   <Class zzge$zzt$zzb>
	//   43   87:dup             
	//   44   88:ldc1            #60  <String "OS_TYPE_OPENBSD">
	//   45   90:bipush          6
	//   46   92:bipush          6
	//   47   94:invokespecial   #36  <Method void zzge$zzt$zzb(String, int, int)>
	//   48   97:putstatic       #62  <Field zzge$zzt$zzb zzbhe>
		zzbhf = (new zzge$zzt$zzb[] {
			zzbgy, zzbgz, zzbha, zzbhb, zzbhc, zzbhd, zzbhe
		});
	//   49  100:bipush          7
	//   50  102:anewarray       zzge$zzt$zzb[]
	//   51  105:dup             
	//   52  106:iconst_0        
	//   53  107:getstatic       #38  <Field zzge$zzt$zzb zzbgy>
	//   54  110:aastore         
	//   55  111:dup             
	//   56  112:iconst_1        
	//   57  113:getstatic       #42  <Field zzge$zzt$zzb zzbgz>
	//   58  116:aastore         
	//   59  117:dup             
	//   60  118:iconst_2        
	//   61  119:getstatic       #46  <Field zzge$zzt$zzb zzbha>
	//   62  122:aastore         
	//   63  123:dup             
	//   64  124:iconst_3        
	//   65  125:getstatic       #50  <Field zzge$zzt$zzb zzbhb>
	//   66  128:aastore         
	//   67  129:dup             
	//   68  130:iconst_4        
	//   69  131:getstatic       #54  <Field zzge$zzt$zzb zzbhc>
	//   70  134:aastore         
	//   71  135:dup             
	//   72  136:iconst_5        
	//   73  137:getstatic       #58  <Field zzge$zzt$zzb zzbhd>
	//   74  140:aastore         
	//   75  141:dup             
	//   76  142:bipush          6
	//   77  144:getstatic       #62  <Field zzge$zzt$zzb zzbhe>
	//   78  147:aastore         
	//   79  148:putstatic       #64  <Field zzge$zzt$zzb[] zzbhf>
	//   80  151:new             #66  <Class zzgq>
	//   81  154:dup             
	//   82  155:invokespecial   #68  <Method void zzgq()>
	//   83  158:putstatic       #70  <Field zzck zzbq>
	//*  84  161:return          
	}

	private zzge$zzt$zzb(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #74  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #76  <Field int value>
	//    7   11:return          
	}
}
