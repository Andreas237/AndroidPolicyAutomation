// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcj, zzt, zzv, zzck

public static final class zzt$zza$zzb extends Enum
	implements zzcj
{

	public static zzt$zza$zzb[] values()
	{
		return (zzt$zza$zzb[])((zzt$zza$zzb []) (zzbr)).clone();
	//    0    0:getstatic       #74  <Field zzt$zza$zzb[] zzbr>
	//    1    3:invokevirtual   #95  <Method Object _5B_Lcom.google.android.gms.internal.clearcut.zzt$zza$zzb_3B_.clone()>
	//    2    6:checkcast       #91  <Class zzt$zza$zzb[]>
	//    3    9:areturn         
	}

	public static zzt$zza$zzb zza(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 9: default 56
	//	               0 90
	//	               1 86
	//	               2 82
	//	               3 56
	//	               4 78
	//	               5 74
	//	               6 70
	//	               7 66
	//	               8 62
	//	               9 58
		case 3: // '\003'
		default:
			return null;
	//    2   56:aconst_null     
	//    3   57:areturn         

		case 9: // '\t'
			return zzbp;
	//    4   58:getstatic       #72  <Field zzt$zza$zzb zzbp>
	//    5   61:areturn         

		case 8: // '\b'
			return zzbo;
	//    6   62:getstatic       #68  <Field zzt$zza$zzb zzbo>
	//    7   65:areturn         

		case 7: // '\007'
			return zzbn;
	//    8   66:getstatic       #64  <Field zzt$zza$zzb zzbn>
	//    9   69:areturn         

		case 6: // '\006'
			return zzbm;
	//   10   70:getstatic       #60  <Field zzt$zza$zzb zzbm>
	//   11   73:areturn         

		case 5: // '\005'
			return zzbl;
	//   12   74:getstatic       #56  <Field zzt$zza$zzb zzbl>
	//   13   77:areturn         

		case 4: // '\004'
			return zzbk;
	//   14   78:getstatic       #52  <Field zzt$zza$zzb zzbk>
	//   15   81:areturn         

		case 2: // '\002'
			return zzbj;
	//   16   82:getstatic       #48  <Field zzt$zza$zzb zzbj>
	//   17   85:areturn         

		case 1: // '\001'
			return zzbi;
	//   18   86:getstatic       #44  <Field zzt$zza$zzb zzbi>
	//   19   89:areturn         

		case 0: // '\0'
			return zzbh;
	//   20   90:getstatic       #40  <Field zzt$zza$zzb zzbh>
	//   21   93:areturn         
		}
	}

	public static zzck zzd()
	{
		return zzbq;
	//    0    0:getstatic       #80  <Field zzck zzbq>
	//    1    3:areturn         
	}

	public final int zzc()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int value>
	//    2    4:ireturn         
	}

	private static final zzt$zza$zzb zzbh;
	private static final zzt$zza$zzb zzbi;
	private static final zzt$zza$zzb zzbj;
	private static final zzt$zza$zzb zzbk;
	private static final zzt$zza$zzb zzbl;
	private static final zzt$zza$zzb zzbm;
	private static final zzt$zza$zzb zzbn;
	private static final zzt$zza$zzb zzbo;
	private static final zzt$zza$zzb zzbp;
	private static final zzck zzbq = new zzv();
	private static final zzt$zza$zzb zzbr[];
	private final int value;

	static 
	{
		zzbh = new zzt$zza$zzb("ARCH_UNKNOWN", 0, 0);
	//    0    0:new             #2   <Class zzt$zza$zzb>
	//    1    3:dup             
	//    2    4:ldc1            #34  <String "ARCH_UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #38  <Method void zzt$zza$zzb(String, int, int)>
	//    6   11:putstatic       #40  <Field zzt$zza$zzb zzbh>
		zzbi = new zzt$zza$zzb("ARCH_NON_NATIVE", 1, 1);
	//    7   14:new             #2   <Class zzt$zza$zzb>
	//    8   17:dup             
	//    9   18:ldc1            #42  <String "ARCH_NON_NATIVE">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #38  <Method void zzt$zza$zzb(String, int, int)>
	//   13   25:putstatic       #44  <Field zzt$zza$zzb zzbi>
		zzbj = new zzt$zza$zzb("ARCH_ARMV5", 2, 2);
	//   14   28:new             #2   <Class zzt$zza$zzb>
	//   15   31:dup             
	//   16   32:ldc1            #46  <String "ARCH_ARMV5">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #38  <Method void zzt$zza$zzb(String, int, int)>
	//   20   39:putstatic       #48  <Field zzt$zza$zzb zzbj>
		zzbk = new zzt$zza$zzb("ARCH_ARMV7", 3, 4);
	//   21   42:new             #2   <Class zzt$zza$zzb>
	//   22   45:dup             
	//   23   46:ldc1            #50  <String "ARCH_ARMV7">
	//   24   48:iconst_3        
	//   25   49:iconst_4        
	//   26   50:invokespecial   #38  <Method void zzt$zza$zzb(String, int, int)>
	//   27   53:putstatic       #52  <Field zzt$zza$zzb zzbk>
		zzbl = new zzt$zza$zzb("ARCH_ARM64", 4, 5);
	//   28   56:new             #2   <Class zzt$zza$zzb>
	//   29   59:dup             
	//   30   60:ldc1            #54  <String "ARCH_ARM64">
	//   31   62:iconst_4        
	//   32   63:iconst_5        
	//   33   64:invokespecial   #38  <Method void zzt$zza$zzb(String, int, int)>
	//   34   67:putstatic       #56  <Field zzt$zza$zzb zzbl>
		zzbm = new zzt$zza$zzb("ARCH_MIPS", 5, 6);
	//   35   70:new             #2   <Class zzt$zza$zzb>
	//   36   73:dup             
	//   37   74:ldc1            #58  <String "ARCH_MIPS">
	//   38   76:iconst_5        
	//   39   77:bipush          6
	//   40   79:invokespecial   #38  <Method void zzt$zza$zzb(String, int, int)>
	//   41   82:putstatic       #60  <Field zzt$zza$zzb zzbm>
		zzbn = new zzt$zza$zzb("ARCH_MIPS_64", 6, 7);
	//   42   85:new             #2   <Class zzt$zza$zzb>
	//   43   88:dup             
	//   44   89:ldc1            #62  <String "ARCH_MIPS_64">
	//   45   91:bipush          6
	//   46   93:bipush          7
	//   47   95:invokespecial   #38  <Method void zzt$zza$zzb(String, int, int)>
	//   48   98:putstatic       #64  <Field zzt$zza$zzb zzbn>
		zzbo = new zzt$zza$zzb("ARCH_X86", 7, 8);
	//   49  101:new             #2   <Class zzt$zza$zzb>
	//   50  104:dup             
	//   51  105:ldc1            #66  <String "ARCH_X86">
	//   52  107:bipush          7
	//   53  109:bipush          8
	//   54  111:invokespecial   #38  <Method void zzt$zza$zzb(String, int, int)>
	//   55  114:putstatic       #68  <Field zzt$zza$zzb zzbo>
		zzbp = new zzt$zza$zzb("ARCH_X86_64", 8, 9);
	//   56  117:new             #2   <Class zzt$zza$zzb>
	//   57  120:dup             
	//   58  121:ldc1            #70  <String "ARCH_X86_64">
	//   59  123:bipush          8
	//   60  125:bipush          9
	//   61  127:invokespecial   #38  <Method void zzt$zza$zzb(String, int, int)>
	//   62  130:putstatic       #72  <Field zzt$zza$zzb zzbp>
		zzbr = (new zzt$zza$zzb[] {
			zzbh, zzbi, zzbj, zzbk, zzbl, zzbm, zzbn, zzbo, zzbp
		});
	//   63  133:bipush          9
	//   64  135:anewarray       zzt$zza$zzb[]
	//   65  138:dup             
	//   66  139:iconst_0        
	//   67  140:getstatic       #40  <Field zzt$zza$zzb zzbh>
	//   68  143:aastore         
	//   69  144:dup             
	//   70  145:iconst_1        
	//   71  146:getstatic       #44  <Field zzt$zza$zzb zzbi>
	//   72  149:aastore         
	//   73  150:dup             
	//   74  151:iconst_2        
	//   75  152:getstatic       #48  <Field zzt$zza$zzb zzbj>
	//   76  155:aastore         
	//   77  156:dup             
	//   78  157:iconst_3        
	//   79  158:getstatic       #52  <Field zzt$zza$zzb zzbk>
	//   80  161:aastore         
	//   81  162:dup             
	//   82  163:iconst_4        
	//   83  164:getstatic       #56  <Field zzt$zza$zzb zzbl>
	//   84  167:aastore         
	//   85  168:dup             
	//   86  169:iconst_5        
	//   87  170:getstatic       #60  <Field zzt$zza$zzb zzbm>
	//   88  173:aastore         
	//   89  174:dup             
	//   90  175:bipush          6
	//   91  177:getstatic       #64  <Field zzt$zza$zzb zzbn>
	//   92  180:aastore         
	//   93  181:dup             
	//   94  182:bipush          7
	//   95  184:getstatic       #68  <Field zzt$zza$zzb zzbo>
	//   96  187:aastore         
	//   97  188:dup             
	//   98  189:bipush          8
	//   99  191:getstatic       #72  <Field zzt$zza$zzb zzbp>
	//  100  194:aastore         
	//  101  195:putstatic       #74  <Field zzt$zza$zzb[] zzbr>
	//  102  198:new             #76  <Class zzv>
	//  103  201:dup             
	//  104  202:invokespecial   #78  <Method void zzv()>
	//  105  205:putstatic       #80  <Field zzck zzbq>
	//* 106  208:return          
	}

	private zzt$zza$zzb(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #84  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #86  <Field int value>
	//    7   11:return          
	}
}
