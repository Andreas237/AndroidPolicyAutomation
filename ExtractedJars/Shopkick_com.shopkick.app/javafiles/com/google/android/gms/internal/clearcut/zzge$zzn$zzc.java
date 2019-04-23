// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcj, zzge, zzgk, zzck

public static final class zzge$zzn$zzc extends Enum
	implements zzcj
{

	public static zzge$zzn$zzc[] values()
	{
		return (zzge$zzn$zzc[])((zzge$zzn$zzc []) (zzxv)).clone();
	//    0    0:getstatic       #79  <Field zzge$zzn$zzc[] zzxv>
	//    1    3:invokevirtual   #100 <Method Object _5B_Lcom.google.android.gms.internal.clearcut.zzge$zzn$zzc_3B_.clone()>
	//    2    6:checkcast       #96  <Class zzge$zzn$zzc[]>
	//    3    9:areturn         
	}

	public static zzge$zzn$zzc zzav(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 9: default 56
	//	               0 94
	//	               1 90
	//	               2 86
	//	               3 82
	//	               4 78
	//	               5 74
	//	               6 70
	//	               7 66
	//	               8 62
	//	               9 58
		default:
			return null;
	//    2   56:aconst_null     
	//    3   57:areturn         

		case 9: // '\t'
			return zzxu;
	//    4   58:getstatic       #77  <Field zzge$zzn$zzc zzxu>
	//    5   61:areturn         

		case 8: // '\b'
			return zzxt;
	//    6   62:getstatic       #73  <Field zzge$zzn$zzc zzxt>
	//    7   65:areturn         

		case 7: // '\007'
			return zzxs;
	//    8   66:getstatic       #69  <Field zzge$zzn$zzc zzxs>
	//    9   69:areturn         

		case 6: // '\006'
			return zzxr;
	//   10   70:getstatic       #65  <Field zzge$zzn$zzc zzxr>
	//   11   73:areturn         

		case 5: // '\005'
			return zzxq;
	//   12   74:getstatic       #61  <Field zzge$zzn$zzc zzxq>
	//   13   77:areturn         

		case 4: // '\004'
			return zzxp;
	//   14   78:getstatic       #57  <Field zzge$zzn$zzc zzxp>
	//   15   81:areturn         

		case 3: // '\003'
			return zzxo;
	//   16   82:getstatic       #53  <Field zzge$zzn$zzc zzxo>
	//   17   85:areturn         

		case 2: // '\002'
			return zzxn;
	//   18   86:getstatic       #49  <Field zzge$zzn$zzc zzxn>
	//   19   89:areturn         

		case 1: // '\001'
			return zzxm;
	//   20   90:getstatic       #45  <Field zzge$zzn$zzc zzxm>
	//   21   93:areturn         

		case 0: // '\0'
			return zzxl;
	//   22   94:getstatic       #41  <Field zzge$zzn$zzc zzxl>
	//   23   97:areturn         
		}
	}

	public static zzck zzd()
	{
		return zzbq;
	//    0    0:getstatic       #85  <Field zzck zzbq>
	//    1    3:areturn         
	}

	public final int zzc()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int value>
	//    2    4:ireturn         
	}

	private static final zzck zzbq = new zzgk();
	private static final zzge$zzn$zzc zzxl;
	private static final zzge$zzn$zzc zzxm;
	private static final zzge$zzn$zzc zzxn;
	private static final zzge$zzn$zzc zzxo;
	private static final zzge$zzn$zzc zzxp;
	private static final zzge$zzn$zzc zzxq;
	private static final zzge$zzn$zzc zzxr;
	private static final zzge$zzn$zzc zzxs;
	private static final zzge$zzn$zzc zzxt;
	private static final zzge$zzn$zzc zzxu;
	private static final zzge$zzn$zzc zzxv[];
	private final int value;

	static 
	{
		zzxl = new zzge$zzn$zzc("OS_UNKNOWN", 0, 0);
	//    0    0:new             #2   <Class zzge$zzn$zzc>
	//    1    3:dup             
	//    2    4:ldc1            #35  <String "OS_UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #39  <Method void zzge$zzn$zzc(String, int, int)>
	//    6   11:putstatic       #41  <Field zzge$zzn$zzc zzxl>
		zzxm = new zzge$zzn$zzc("MAC", 1, 1);
	//    7   14:new             #2   <Class zzge$zzn$zzc>
	//    8   17:dup             
	//    9   18:ldc1            #43  <String "MAC">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #39  <Method void zzge$zzn$zzc(String, int, int)>
	//   13   25:putstatic       #45  <Field zzge$zzn$zzc zzxm>
		zzxn = new zzge$zzn$zzc("WINDOWS", 2, 2);
	//   14   28:new             #2   <Class zzge$zzn$zzc>
	//   15   31:dup             
	//   16   32:ldc1            #47  <String "WINDOWS">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #39  <Method void zzge$zzn$zzc(String, int, int)>
	//   20   39:putstatic       #49  <Field zzge$zzn$zzc zzxn>
		zzxo = new zzge$zzn$zzc("ANDROID", 3, 3);
	//   21   42:new             #2   <Class zzge$zzn$zzc>
	//   22   45:dup             
	//   23   46:ldc1            #51  <String "ANDROID">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #39  <Method void zzge$zzn$zzc(String, int, int)>
	//   27   53:putstatic       #53  <Field zzge$zzn$zzc zzxo>
		zzxp = new zzge$zzn$zzc("LINUX", 4, 4);
	//   28   56:new             #2   <Class zzge$zzn$zzc>
	//   29   59:dup             
	//   30   60:ldc1            #55  <String "LINUX">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #39  <Method void zzge$zzn$zzc(String, int, int)>
	//   34   67:putstatic       #57  <Field zzge$zzn$zzc zzxp>
		zzxq = new zzge$zzn$zzc("CHROME_OS", 5, 5);
	//   35   70:new             #2   <Class zzge$zzn$zzc>
	//   36   73:dup             
	//   37   74:ldc1            #59  <String "CHROME_OS">
	//   38   76:iconst_5        
	//   39   77:iconst_5        
	//   40   78:invokespecial   #39  <Method void zzge$zzn$zzc(String, int, int)>
	//   41   81:putstatic       #61  <Field zzge$zzn$zzc zzxq>
		zzxr = new zzge$zzn$zzc("IPAD", 6, 6);
	//   42   84:new             #2   <Class zzge$zzn$zzc>
	//   43   87:dup             
	//   44   88:ldc1            #63  <String "IPAD">
	//   45   90:bipush          6
	//   46   92:bipush          6
	//   47   94:invokespecial   #39  <Method void zzge$zzn$zzc(String, int, int)>
	//   48   97:putstatic       #65  <Field zzge$zzn$zzc zzxr>
		zzxs = new zzge$zzn$zzc("IPHONE", 7, 7);
	//   49  100:new             #2   <Class zzge$zzn$zzc>
	//   50  103:dup             
	//   51  104:ldc1            #67  <String "IPHONE">
	//   52  106:bipush          7
	//   53  108:bipush          7
	//   54  110:invokespecial   #39  <Method void zzge$zzn$zzc(String, int, int)>
	//   55  113:putstatic       #69  <Field zzge$zzn$zzc zzxs>
		zzxt = new zzge$zzn$zzc("IPOD", 8, 8);
	//   56  116:new             #2   <Class zzge$zzn$zzc>
	//   57  119:dup             
	//   58  120:ldc1            #71  <String "IPOD">
	//   59  122:bipush          8
	//   60  124:bipush          8
	//   61  126:invokespecial   #39  <Method void zzge$zzn$zzc(String, int, int)>
	//   62  129:putstatic       #73  <Field zzge$zzn$zzc zzxt>
		zzxu = new zzge$zzn$zzc("CHROMECAST", 9, 9);
	//   63  132:new             #2   <Class zzge$zzn$zzc>
	//   64  135:dup             
	//   65  136:ldc1            #75  <String "CHROMECAST">
	//   66  138:bipush          9
	//   67  140:bipush          9
	//   68  142:invokespecial   #39  <Method void zzge$zzn$zzc(String, int, int)>
	//   69  145:putstatic       #77  <Field zzge$zzn$zzc zzxu>
		zzxv = (new zzge$zzn$zzc[] {
			zzxl, zzxm, zzxn, zzxo, zzxp, zzxq, zzxr, zzxs, zzxt, zzxu
		});
	//   70  148:bipush          10
	//   71  150:anewarray       zzge$zzn$zzc[]
	//   72  153:dup             
	//   73  154:iconst_0        
	//   74  155:getstatic       #41  <Field zzge$zzn$zzc zzxl>
	//   75  158:aastore         
	//   76  159:dup             
	//   77  160:iconst_1        
	//   78  161:getstatic       #45  <Field zzge$zzn$zzc zzxm>
	//   79  164:aastore         
	//   80  165:dup             
	//   81  166:iconst_2        
	//   82  167:getstatic       #49  <Field zzge$zzn$zzc zzxn>
	//   83  170:aastore         
	//   84  171:dup             
	//   85  172:iconst_3        
	//   86  173:getstatic       #53  <Field zzge$zzn$zzc zzxo>
	//   87  176:aastore         
	//   88  177:dup             
	//   89  178:iconst_4        
	//   90  179:getstatic       #57  <Field zzge$zzn$zzc zzxp>
	//   91  182:aastore         
	//   92  183:dup             
	//   93  184:iconst_5        
	//   94  185:getstatic       #61  <Field zzge$zzn$zzc zzxq>
	//   95  188:aastore         
	//   96  189:dup             
	//   97  190:bipush          6
	//   98  192:getstatic       #65  <Field zzge$zzn$zzc zzxr>
	//   99  195:aastore         
	//  100  196:dup             
	//  101  197:bipush          7
	//  102  199:getstatic       #69  <Field zzge$zzn$zzc zzxs>
	//  103  202:aastore         
	//  104  203:dup             
	//  105  204:bipush          8
	//  106  206:getstatic       #73  <Field zzge$zzn$zzc zzxt>
	//  107  209:aastore         
	//  108  210:dup             
	//  109  211:bipush          9
	//  110  213:getstatic       #77  <Field zzge$zzn$zzc zzxu>
	//  111  216:aastore         
	//  112  217:putstatic       #79  <Field zzge$zzn$zzc[] zzxv>
	//  113  220:new             #81  <Class zzgk>
	//  114  223:dup             
	//  115  224:invokespecial   #83  <Method void zzgk()>
	//  116  227:putstatic       #85  <Field zzck zzbq>
	//* 117  230:return          
	}

	private zzge$zzn$zzc(String s, int i, int j)
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
