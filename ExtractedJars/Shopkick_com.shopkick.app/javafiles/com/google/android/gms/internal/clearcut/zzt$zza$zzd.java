// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcj, zzt, zzx, zzck

public static final class zzt$zza$zzd extends Enum
	implements zzcj
{

	public static zzt$zza$zzd[] values()
	{
		return (zzt$zza$zzd[])((zzt$zza$zzd []) (zzcp)).clone();
	//    0    0:getstatic       #79  <Field zzt$zza$zzd[] zzcp>
	//    1    3:invokevirtual   #100 <Method Object _5B_Lcom.google.android.gms.internal.clearcut.zzt$zza$zzd_3B_.clone()>
	//    2    6:checkcast       #96  <Class zzt$zza$zzd[]>
	//    3    9:areturn         
	}

	public static zzck zzd()
	{
		return zzbq;
	//    0    0:getstatic       #85  <Field zzck zzbq>
	//    1    3:areturn         
	}

	public static zzt$zza$zzd zzd(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 10: default 60
	//	               0 98
	//	               1 94
	//	               2 90
	//	               3 86
	//	               4 82
	//	               5 78
	//	               6 60
	//	               7 74
	//	               8 70
	//	               9 66
	//	               10 62
		case 6: // '\006'
		default:
			return null;
	//    2   60:aconst_null     
	//    3   61:areturn         

		case 10: // '\n'
			return zzco;
	//    4   62:getstatic       #77  <Field zzt$zza$zzd zzco>
	//    5   65:areturn         

		case 9: // '\t'
			return zzcn;
	//    6   66:getstatic       #73  <Field zzt$zza$zzd zzcn>
	//    7   69:areturn         

		case 8: // '\b'
			return zzcm;
	//    8   70:getstatic       #69  <Field zzt$zza$zzd zzcm>
	//    9   73:areturn         

		case 7: // '\007'
			return zzcl;
	//   10   74:getstatic       #65  <Field zzt$zza$zzd zzcl>
	//   11   77:areturn         

		case 5: // '\005'
			return zzck;
	//   12   78:getstatic       #61  <Field zzt$zza$zzd zzck>
	//   13   81:areturn         

		case 4: // '\004'
			return zzcj;
	//   14   82:getstatic       #57  <Field zzt$zza$zzd zzcj>
	//   15   85:areturn         

		case 3: // '\003'
			return zzci;
	//   16   86:getstatic       #53  <Field zzt$zza$zzd zzci>
	//   17   89:areturn         

		case 2: // '\002'
			return zzch;
	//   18   90:getstatic       #49  <Field zzt$zza$zzd zzch>
	//   19   93:areturn         

		case 1: // '\001'
			return zzcg;
	//   20   94:getstatic       #45  <Field zzt$zza$zzd zzcg>
	//   21   97:areturn         

		case 0: // '\0'
			return zzcf;
	//   22   98:getstatic       #41  <Field zzt$zza$zzd zzcf>
	//   23  101:areturn         
		}
	}

	public final int zzc()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int value>
	//    2    4:ireturn         
	}

	private static final zzck zzbq = new zzx();
	private static final zzt$zza$zzd zzcf;
	private static final zzt$zza$zzd zzcg;
	private static final zzt$zza$zzd zzch;
	private static final zzt$zza$zzd zzci;
	private static final zzt$zza$zzd zzcj;
	private static final zzt$zza$zzd zzck;
	private static final zzt$zza$zzd zzcl;
	private static final zzt$zza$zzd zzcm;
	private static final zzt$zza$zzd zzcn;
	private static final zzt$zza$zzd zzco;
	private static final zzt$zza$zzd zzcp[];
	private final int value;

	static 
	{
		zzcf = new zzt$zza$zzd("DENSITY_UNKNOWN", 0, 0);
	//    0    0:new             #2   <Class zzt$zza$zzd>
	//    1    3:dup             
	//    2    4:ldc1            #35  <String "DENSITY_UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #39  <Method void zzt$zza$zzd(String, int, int)>
	//    6   11:putstatic       #41  <Field zzt$zza$zzd zzcf>
		zzcg = new zzt$zza$zzd("DENSITY_ALLDPI", 1, 1);
	//    7   14:new             #2   <Class zzt$zza$zzd>
	//    8   17:dup             
	//    9   18:ldc1            #43  <String "DENSITY_ALLDPI">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #39  <Method void zzt$zza$zzd(String, int, int)>
	//   13   25:putstatic       #45  <Field zzt$zza$zzd zzcg>
		zzch = new zzt$zza$zzd("DENSITY_LDPI", 2, 2);
	//   14   28:new             #2   <Class zzt$zza$zzd>
	//   15   31:dup             
	//   16   32:ldc1            #47  <String "DENSITY_LDPI">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #39  <Method void zzt$zza$zzd(String, int, int)>
	//   20   39:putstatic       #49  <Field zzt$zza$zzd zzch>
		zzci = new zzt$zza$zzd("DENSITY_MDPI", 3, 3);
	//   21   42:new             #2   <Class zzt$zza$zzd>
	//   22   45:dup             
	//   23   46:ldc1            #51  <String "DENSITY_MDPI">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #39  <Method void zzt$zza$zzd(String, int, int)>
	//   27   53:putstatic       #53  <Field zzt$zza$zzd zzci>
		zzcj = new zzt$zza$zzd("DENSITY_TVDPI", 4, 4);
	//   28   56:new             #2   <Class zzt$zza$zzd>
	//   29   59:dup             
	//   30   60:ldc1            #55  <String "DENSITY_TVDPI">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #39  <Method void zzt$zza$zzd(String, int, int)>
	//   34   67:putstatic       #57  <Field zzt$zza$zzd zzcj>
		zzck = new zzt$zza$zzd("DENSITY_HDPI", 5, 5);
	//   35   70:new             #2   <Class zzt$zza$zzd>
	//   36   73:dup             
	//   37   74:ldc1            #59  <String "DENSITY_HDPI">
	//   38   76:iconst_5        
	//   39   77:iconst_5        
	//   40   78:invokespecial   #39  <Method void zzt$zza$zzd(String, int, int)>
	//   41   81:putstatic       #61  <Field zzt$zza$zzd zzck>
		zzcl = new zzt$zza$zzd("DENSITY_XHDPI", 6, 7);
	//   42   84:new             #2   <Class zzt$zza$zzd>
	//   43   87:dup             
	//   44   88:ldc1            #63  <String "DENSITY_XHDPI">
	//   45   90:bipush          6
	//   46   92:bipush          7
	//   47   94:invokespecial   #39  <Method void zzt$zza$zzd(String, int, int)>
	//   48   97:putstatic       #65  <Field zzt$zza$zzd zzcl>
		zzcm = new zzt$zza$zzd("DENSITY_DPI400", 7, 8);
	//   49  100:new             #2   <Class zzt$zza$zzd>
	//   50  103:dup             
	//   51  104:ldc1            #67  <String "DENSITY_DPI400">
	//   52  106:bipush          7
	//   53  108:bipush          8
	//   54  110:invokespecial   #39  <Method void zzt$zza$zzd(String, int, int)>
	//   55  113:putstatic       #69  <Field zzt$zza$zzd zzcm>
		zzcn = new zzt$zza$zzd("DENSITY_XXHDPI", 8, 9);
	//   56  116:new             #2   <Class zzt$zza$zzd>
	//   57  119:dup             
	//   58  120:ldc1            #71  <String "DENSITY_XXHDPI">
	//   59  122:bipush          8
	//   60  124:bipush          9
	//   61  126:invokespecial   #39  <Method void zzt$zza$zzd(String, int, int)>
	//   62  129:putstatic       #73  <Field zzt$zza$zzd zzcn>
		zzco = new zzt$zza$zzd("DENSITY_XXXHDPI", 9, 10);
	//   63  132:new             #2   <Class zzt$zza$zzd>
	//   64  135:dup             
	//   65  136:ldc1            #75  <String "DENSITY_XXXHDPI">
	//   66  138:bipush          9
	//   67  140:bipush          10
	//   68  142:invokespecial   #39  <Method void zzt$zza$zzd(String, int, int)>
	//   69  145:putstatic       #77  <Field zzt$zza$zzd zzco>
		zzcp = (new zzt$zza$zzd[] {
			zzcf, zzcg, zzch, zzci, zzcj, zzck, zzcl, zzcm, zzcn, zzco
		});
	//   70  148:bipush          10
	//   71  150:anewarray       zzt$zza$zzd[]
	//   72  153:dup             
	//   73  154:iconst_0        
	//   74  155:getstatic       #41  <Field zzt$zza$zzd zzcf>
	//   75  158:aastore         
	//   76  159:dup             
	//   77  160:iconst_1        
	//   78  161:getstatic       #45  <Field zzt$zza$zzd zzcg>
	//   79  164:aastore         
	//   80  165:dup             
	//   81  166:iconst_2        
	//   82  167:getstatic       #49  <Field zzt$zza$zzd zzch>
	//   83  170:aastore         
	//   84  171:dup             
	//   85  172:iconst_3        
	//   86  173:getstatic       #53  <Field zzt$zza$zzd zzci>
	//   87  176:aastore         
	//   88  177:dup             
	//   89  178:iconst_4        
	//   90  179:getstatic       #57  <Field zzt$zza$zzd zzcj>
	//   91  182:aastore         
	//   92  183:dup             
	//   93  184:iconst_5        
	//   94  185:getstatic       #61  <Field zzt$zza$zzd zzck>
	//   95  188:aastore         
	//   96  189:dup             
	//   97  190:bipush          6
	//   98  192:getstatic       #65  <Field zzt$zza$zzd zzcl>
	//   99  195:aastore         
	//  100  196:dup             
	//  101  197:bipush          7
	//  102  199:getstatic       #69  <Field zzt$zza$zzd zzcm>
	//  103  202:aastore         
	//  104  203:dup             
	//  105  204:bipush          8
	//  106  206:getstatic       #73  <Field zzt$zza$zzd zzcn>
	//  107  209:aastore         
	//  108  210:dup             
	//  109  211:bipush          9
	//  110  213:getstatic       #77  <Field zzt$zza$zzd zzco>
	//  111  216:aastore         
	//  112  217:putstatic       #79  <Field zzt$zza$zzd[] zzcp>
	//  113  220:new             #81  <Class zzx>
	//  114  223:dup             
	//  115  224:invokespecial   #83  <Method void zzx()>
	//  116  227:putstatic       #85  <Field zzck zzbq>
	//* 117  230:return          
	}

	private zzt$zza$zzd(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #89  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #91  <Field int value>
	//    7   11:return          
	}
}
