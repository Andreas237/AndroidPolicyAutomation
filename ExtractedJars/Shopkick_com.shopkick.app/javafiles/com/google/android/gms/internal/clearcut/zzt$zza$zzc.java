// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcj, zzt, zzw, zzck

public static final class zzt$zza$zzc extends Enum
	implements zzcj
{

	public static zzt$zza$zzc[] values()
	{
		return (zzt$zza$zzc[])((zzt$zza$zzc []) (zzce)).clone();
	//    0    0:getstatic       #89  <Field zzt$zza$zzc[] zzce>
	//    1    3:invokevirtual   #110 <Method Object _5B_Lcom.google.android.gms.internal.clearcut.zzt$zza$zzc_3B_.clone()>
	//    2    6:checkcast       #106 <Class zzt$zza$zzc[]>
	//    3    9:areturn         
	}

	public static zzt$zza$zzc zzc(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 11: default 64
	//	               0 110
	//	               1 106
	//	               2 102
	//	               3 98
	//	               4 94
	//	               5 90
	//	               6 86
	//	               7 82
	//	               8 78
	//	               9 74
	//	               10 70
	//	               11 66
		default:
			return null;
	//    2   64:aconst_null     
	//    3   65:areturn         

		case 11: // '\013'
			return zzcd;
	//    4   66:getstatic       #87  <Field zzt$zza$zzc zzcd>
	//    5   69:areturn         

		case 10: // '\n'
			return zzcc;
	//    6   70:getstatic       #83  <Field zzt$zza$zzc zzcc>
	//    7   73:areturn         

		case 9: // '\t'
			return zzcb;
	//    8   74:getstatic       #79  <Field zzt$zza$zzc zzcb>
	//    9   77:areturn         

		case 8: // '\b'
			return zzca;
	//   10   78:getstatic       #75  <Field zzt$zza$zzc zzca>
	//   11   81:areturn         

		case 7: // '\007'
			return zzbz;
	//   12   82:getstatic       #71  <Field zzt$zza$zzc zzbz>
	//   13   85:areturn         

		case 6: // '\006'
			return zzby;
	//   14   86:getstatic       #67  <Field zzt$zza$zzc zzby>
	//   15   89:areturn         

		case 5: // '\005'
			return zzbx;
	//   16   90:getstatic       #63  <Field zzt$zza$zzc zzbx>
	//   17   93:areturn         

		case 4: // '\004'
			return zzbw;
	//   18   94:getstatic       #59  <Field zzt$zza$zzc zzbw>
	//   19   97:areturn         

		case 3: // '\003'
			return zzbv;
	//   20   98:getstatic       #55  <Field zzt$zza$zzc zzbv>
	//   21  101:areturn         

		case 2: // '\002'
			return zzbu;
	//   22  102:getstatic       #51  <Field zzt$zza$zzc zzbu>
	//   23  105:areturn         

		case 1: // '\001'
			return zzbt;
	//   24  106:getstatic       #47  <Field zzt$zza$zzc zzbt>
	//   25  109:areturn         

		case 0: // '\0'
			return zzbs;
	//   26  110:getstatic       #43  <Field zzt$zza$zzc zzbs>
	//   27  113:areturn         
		}
	}

	public static zzck zzd()
	{
		return zzbq;
	//    0    0:getstatic       #95  <Field zzck zzbq>
	//    1    3:areturn         
	}

	public final int zzc()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field int value>
	//    2    4:ireturn         
	}

	private static final zzck zzbq = new zzw();
	private static final zzt$zza$zzc zzbs;
	private static final zzt$zza$zzc zzbt;
	private static final zzt$zza$zzc zzbu;
	private static final zzt$zza$zzc zzbv;
	private static final zzt$zza$zzc zzbw;
	private static final zzt$zza$zzc zzbx;
	private static final zzt$zza$zzc zzby;
	private static final zzt$zza$zzc zzbz;
	private static final zzt$zza$zzc zzca;
	private static final zzt$zza$zzc zzcb;
	private static final zzt$zza$zzc zzcc;
	private static final zzt$zza$zzc zzcd;
	private static final zzt$zza$zzc zzce[];
	private final int value;

	static 
	{
		zzbs = new zzt$zza$zzc("BUILD_TYPE_UNKNOWN", 0, 0);
	//    0    0:new             #2   <Class zzt$zza$zzc>
	//    1    3:dup             
	//    2    4:ldc1            #37  <String "BUILD_TYPE_UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #41  <Method void zzt$zza$zzc(String, int, int)>
	//    6   11:putstatic       #43  <Field zzt$zza$zzc zzbs>
		zzbt = new zzt$zza$zzc("BUILD_TYPE_PROD", 1, 1);
	//    7   14:new             #2   <Class zzt$zza$zzc>
	//    8   17:dup             
	//    9   18:ldc1            #45  <String "BUILD_TYPE_PROD">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #41  <Method void zzt$zza$zzc(String, int, int)>
	//   13   25:putstatic       #47  <Field zzt$zza$zzc zzbt>
		zzbu = new zzt$zza$zzc("BUILD_TYPE_INTERNAL", 2, 2);
	//   14   28:new             #2   <Class zzt$zza$zzc>
	//   15   31:dup             
	//   16   32:ldc1            #49  <String "BUILD_TYPE_INTERNAL">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #41  <Method void zzt$zza$zzc(String, int, int)>
	//   20   39:putstatic       #51  <Field zzt$zza$zzc zzbu>
		zzbv = new zzt$zza$zzc("BUILD_TYPE_PRODLMP", 3, 3);
	//   21   42:new             #2   <Class zzt$zza$zzc>
	//   22   45:dup             
	//   23   46:ldc1            #53  <String "BUILD_TYPE_PRODLMP">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #41  <Method void zzt$zza$zzc(String, int, int)>
	//   27   53:putstatic       #55  <Field zzt$zza$zzc zzbv>
		zzbw = new zzt$zza$zzc("BUILD_TYPE_THINGS", 4, 4);
	//   28   56:new             #2   <Class zzt$zza$zzc>
	//   29   59:dup             
	//   30   60:ldc1            #57  <String "BUILD_TYPE_THINGS">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #41  <Method void zzt$zza$zzc(String, int, int)>
	//   34   67:putstatic       #59  <Field zzt$zza$zzc zzbw>
		zzbx = new zzt$zza$zzc("BUILD_TYPE_PRODMNC", 5, 5);
	//   35   70:new             #2   <Class zzt$zza$zzc>
	//   36   73:dup             
	//   37   74:ldc1            #61  <String "BUILD_TYPE_PRODMNC">
	//   38   76:iconst_5        
	//   39   77:iconst_5        
	//   40   78:invokespecial   #41  <Method void zzt$zza$zzc(String, int, int)>
	//   41   81:putstatic       #63  <Field zzt$zza$zzc zzbx>
		zzby = new zzt$zza$zzc("BUILD_TYPE_WEARABLE", 6, 6);
	//   42   84:new             #2   <Class zzt$zza$zzc>
	//   43   87:dup             
	//   44   88:ldc1            #65  <String "BUILD_TYPE_WEARABLE">
	//   45   90:bipush          6
	//   46   92:bipush          6
	//   47   94:invokespecial   #41  <Method void zzt$zza$zzc(String, int, int)>
	//   48   97:putstatic       #67  <Field zzt$zza$zzc zzby>
		zzbz = new zzt$zza$zzc("BUILD_TYPE_AUTO", 7, 7);
	//   49  100:new             #2   <Class zzt$zza$zzc>
	//   50  103:dup             
	//   51  104:ldc1            #69  <String "BUILD_TYPE_AUTO">
	//   52  106:bipush          7
	//   53  108:bipush          7
	//   54  110:invokespecial   #41  <Method void zzt$zza$zzc(String, int, int)>
	//   55  113:putstatic       #71  <Field zzt$zza$zzc zzbz>
		zzca = new zzt$zza$zzc("BUILD_TYPE_SIDEWINDERMNC", 8, 8);
	//   56  116:new             #2   <Class zzt$zza$zzc>
	//   57  119:dup             
	//   58  120:ldc1            #73  <String "BUILD_TYPE_SIDEWINDERMNC">
	//   59  122:bipush          8
	//   60  124:bipush          8
	//   61  126:invokespecial   #41  <Method void zzt$zza$zzc(String, int, int)>
	//   62  129:putstatic       #75  <Field zzt$zza$zzc zzca>
		zzcb = new zzt$zza$zzc("BUILD_TYPE_ATV", 9, 9);
	//   63  132:new             #2   <Class zzt$zza$zzc>
	//   64  135:dup             
	//   65  136:ldc1            #77  <String "BUILD_TYPE_ATV">
	//   66  138:bipush          9
	//   67  140:bipush          9
	//   68  142:invokespecial   #41  <Method void zzt$zza$zzc(String, int, int)>
	//   69  145:putstatic       #79  <Field zzt$zza$zzc zzcb>
		zzcc = new zzt$zza$zzc("BUILD_TYPE_PRODPIX", 10, 10);
	//   70  148:new             #2   <Class zzt$zza$zzc>
	//   71  151:dup             
	//   72  152:ldc1            #81  <String "BUILD_TYPE_PRODPIX">
	//   73  154:bipush          10
	//   74  156:bipush          10
	//   75  158:invokespecial   #41  <Method void zzt$zza$zzc(String, int, int)>
	//   76  161:putstatic       #83  <Field zzt$zza$zzc zzcc>
		zzcd = new zzt$zza$zzc("BUILD_TYPE_PRODPI", 11, 11);
	//   77  164:new             #2   <Class zzt$zza$zzc>
	//   78  167:dup             
	//   79  168:ldc1            #85  <String "BUILD_TYPE_PRODPI">
	//   80  170:bipush          11
	//   81  172:bipush          11
	//   82  174:invokespecial   #41  <Method void zzt$zza$zzc(String, int, int)>
	//   83  177:putstatic       #87  <Field zzt$zza$zzc zzcd>
		zzce = (new zzt$zza$zzc[] {
			zzbs, zzbt, zzbu, zzbv, zzbw, zzbx, zzby, zzbz, zzca, zzcb, 
			zzcc, zzcd
		});
	//   84  180:bipush          12
	//   85  182:anewarray       zzt$zza$zzc[]
	//   86  185:dup             
	//   87  186:iconst_0        
	//   88  187:getstatic       #43  <Field zzt$zza$zzc zzbs>
	//   89  190:aastore         
	//   90  191:dup             
	//   91  192:iconst_1        
	//   92  193:getstatic       #47  <Field zzt$zza$zzc zzbt>
	//   93  196:aastore         
	//   94  197:dup             
	//   95  198:iconst_2        
	//   96  199:getstatic       #51  <Field zzt$zza$zzc zzbu>
	//   97  202:aastore         
	//   98  203:dup             
	//   99  204:iconst_3        
	//  100  205:getstatic       #55  <Field zzt$zza$zzc zzbv>
	//  101  208:aastore         
	//  102  209:dup             
	//  103  210:iconst_4        
	//  104  211:getstatic       #59  <Field zzt$zza$zzc zzbw>
	//  105  214:aastore         
	//  106  215:dup             
	//  107  216:iconst_5        
	//  108  217:getstatic       #63  <Field zzt$zza$zzc zzbx>
	//  109  220:aastore         
	//  110  221:dup             
	//  111  222:bipush          6
	//  112  224:getstatic       #67  <Field zzt$zza$zzc zzby>
	//  113  227:aastore         
	//  114  228:dup             
	//  115  229:bipush          7
	//  116  231:getstatic       #71  <Field zzt$zza$zzc zzbz>
	//  117  234:aastore         
	//  118  235:dup             
	//  119  236:bipush          8
	//  120  238:getstatic       #75  <Field zzt$zza$zzc zzca>
	//  121  241:aastore         
	//  122  242:dup             
	//  123  243:bipush          9
	//  124  245:getstatic       #79  <Field zzt$zza$zzc zzcb>
	//  125  248:aastore         
	//  126  249:dup             
	//  127  250:bipush          10
	//  128  252:getstatic       #83  <Field zzt$zza$zzc zzcc>
	//  129  255:aastore         
	//  130  256:dup             
	//  131  257:bipush          11
	//  132  259:getstatic       #87  <Field zzt$zza$zzc zzcd>
	//  133  262:aastore         
	//  134  263:putstatic       #89  <Field zzt$zza$zzc[] zzce>
	//  135  266:new             #91  <Class zzw>
	//  136  269:dup             
	//  137  270:invokespecial   #93  <Method void zzw()>
	//  138  273:putstatic       #95  <Field zzck zzbq>
	//* 139  276:return          
	}

	private zzt$zza$zzc(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #99  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #101 <Field int value>
	//    7   11:return          
	}
}
