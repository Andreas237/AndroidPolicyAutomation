// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzgb, zzdz, zzea, zzgc, 
//			zzgd

public final class zzdy extends Enum
	implements zzgb
{

	private zzdy(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #93  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #95  <Field int value>
	//    7   11:return          
	}

	public static zzdy[] values()
	{
		return (zzdy[])((zzdy []) (zzrh)).clone();
	//    0    0:getstatic       #83  <Field zzdy[] zzrh>
	//    1    3:invokevirtual   #104 <Method Object _5B_Lcom.google.android.gms.internal.vision.zzdy_3B_.clone()>
	//    2    6:checkcast       #100 <Class zzdy[]>
	//    3    9:areturn         
	}

	public static zzgd zzah()
	{
		return zzea.zzhl;
	//    0    0:getstatic       #112 <Field zzgd zzea.zzhl>
	//    1    3:areturn         
	}

	public static zzdy zzw(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 12: default 64
	//	               1 110
	//	               2 106
	//	               3 102
	//	               4 98
	//	               5 94
	//	               6 90
	//	               7 86
	//	               8 82
	//	               9 78
	//	               10 74
	//	               11 70
	//	               12 66
		default:
			return null;
	//    2   64:aconst_null     
	//    3   65:areturn         

		case 12: // '\f'
			return zzrg;
	//    4   66:getstatic       #81  <Field zzdy zzrg>
	//    5   69:areturn         

		case 11: // '\013'
			return zzrf;
	//    6   70:getstatic       #77  <Field zzdy zzrf>
	//    7   73:areturn         

		case 10: // '\n'
			return zzre;
	//    8   74:getstatic       #73  <Field zzdy zzre>
	//    9   77:areturn         

		case 9: // '\t'
			return zzrd;
	//   10   78:getstatic       #69  <Field zzdy zzrd>
	//   11   81:areturn         

		case 8: // '\b'
			return zzrc;
	//   12   82:getstatic       #65  <Field zzdy zzrc>
	//   13   85:areturn         

		case 7: // '\007'
			return zzrb;
	//   14   86:getstatic       #61  <Field zzdy zzrb>
	//   15   89:areturn         

		case 6: // '\006'
			return zzra;
	//   16   90:getstatic       #57  <Field zzdy zzra>
	//   17   93:areturn         

		case 5: // '\005'
			return zzqz;
	//   18   94:getstatic       #53  <Field zzdy zzqz>
	//   19   97:areturn         

		case 4: // '\004'
			return zzqy;
	//   20   98:getstatic       #49  <Field zzdy zzqy>
	//   21  101:areturn         

		case 3: // '\003'
			return zzqx;
	//   22  102:getstatic       #45  <Field zzdy zzqx>
	//   23  105:areturn         

		case 2: // '\002'
			return zzqw;
	//   24  106:getstatic       #41  <Field zzdy zzqw>
	//   25  109:areturn         

		case 1: // '\001'
			return zzqv;
	//   26  110:getstatic       #37  <Field zzdy zzqv>
	//   27  113:areturn         
		}
	}

	public final int zzr()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field int value>
	//    2    4:ireturn         
	}

	private static final zzgc zzdv = new zzdz();
	private static final zzdy zzqv;
	private static final zzdy zzqw;
	private static final zzdy zzqx;
	private static final zzdy zzqy;
	private static final zzdy zzqz;
	private static final zzdy zzra;
	private static final zzdy zzrb;
	private static final zzdy zzrc;
	private static final zzdy zzrd;
	private static final zzdy zzre;
	private static final zzdy zzrf;
	private static final zzdy zzrg;
	private static final zzdy zzrh[];
	private final int value;

	static 
	{
		zzqv = new zzdy("CONTACT_INFO", 0, 1);
	//    0    0:new             #2   <Class zzdy>
	//    1    3:dup             
	//    2    4:ldc1            #31  <String "CONTACT_INFO">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #35  <Method void zzdy(String, int, int)>
	//    6   11:putstatic       #37  <Field zzdy zzqv>
		zzqw = new zzdy("EMAIL", 1, 2);
	//    7   14:new             #2   <Class zzdy>
	//    8   17:dup             
	//    9   18:ldc1            #39  <String "EMAIL">
	//   10   20:iconst_1        
	//   11   21:iconst_2        
	//   12   22:invokespecial   #35  <Method void zzdy(String, int, int)>
	//   13   25:putstatic       #41  <Field zzdy zzqw>
		zzqx = new zzdy("ISBN", 2, 3);
	//   14   28:new             #2   <Class zzdy>
	//   15   31:dup             
	//   16   32:ldc1            #43  <String "ISBN">
	//   17   34:iconst_2        
	//   18   35:iconst_3        
	//   19   36:invokespecial   #35  <Method void zzdy(String, int, int)>
	//   20   39:putstatic       #45  <Field zzdy zzqx>
		zzqy = new zzdy("PHONE", 3, 4);
	//   21   42:new             #2   <Class zzdy>
	//   22   45:dup             
	//   23   46:ldc1            #47  <String "PHONE">
	//   24   48:iconst_3        
	//   25   49:iconst_4        
	//   26   50:invokespecial   #35  <Method void zzdy(String, int, int)>
	//   27   53:putstatic       #49  <Field zzdy zzqy>
		zzqz = new zzdy("PRODUCT", 4, 5);
	//   28   56:new             #2   <Class zzdy>
	//   29   59:dup             
	//   30   60:ldc1            #51  <String "PRODUCT">
	//   31   62:iconst_4        
	//   32   63:iconst_5        
	//   33   64:invokespecial   #35  <Method void zzdy(String, int, int)>
	//   34   67:putstatic       #53  <Field zzdy zzqz>
		zzra = new zzdy("SMS", 5, 6);
	//   35   70:new             #2   <Class zzdy>
	//   36   73:dup             
	//   37   74:ldc1            #55  <String "SMS">
	//   38   76:iconst_5        
	//   39   77:bipush          6
	//   40   79:invokespecial   #35  <Method void zzdy(String, int, int)>
	//   41   82:putstatic       #57  <Field zzdy zzra>
		zzrb = new zzdy("TEXT", 6, 7);
	//   42   85:new             #2   <Class zzdy>
	//   43   88:dup             
	//   44   89:ldc1            #59  <String "TEXT">
	//   45   91:bipush          6
	//   46   93:bipush          7
	//   47   95:invokespecial   #35  <Method void zzdy(String, int, int)>
	//   48   98:putstatic       #61  <Field zzdy zzrb>
		zzrc = new zzdy("URL", 7, 8);
	//   49  101:new             #2   <Class zzdy>
	//   50  104:dup             
	//   51  105:ldc1            #63  <String "URL">
	//   52  107:bipush          7
	//   53  109:bipush          8
	//   54  111:invokespecial   #35  <Method void zzdy(String, int, int)>
	//   55  114:putstatic       #65  <Field zzdy zzrc>
		zzrd = new zzdy("WIFI", 8, 9);
	//   56  117:new             #2   <Class zzdy>
	//   57  120:dup             
	//   58  121:ldc1            #67  <String "WIFI">
	//   59  123:bipush          8
	//   60  125:bipush          9
	//   61  127:invokespecial   #35  <Method void zzdy(String, int, int)>
	//   62  130:putstatic       #69  <Field zzdy zzrd>
		zzre = new zzdy("GEO", 9, 10);
	//   63  133:new             #2   <Class zzdy>
	//   64  136:dup             
	//   65  137:ldc1            #71  <String "GEO">
	//   66  139:bipush          9
	//   67  141:bipush          10
	//   68  143:invokespecial   #35  <Method void zzdy(String, int, int)>
	//   69  146:putstatic       #73  <Field zzdy zzre>
		zzrf = new zzdy("CALENDAR_EVENT", 10, 11);
	//   70  149:new             #2   <Class zzdy>
	//   71  152:dup             
	//   72  153:ldc1            #75  <String "CALENDAR_EVENT">
	//   73  155:bipush          10
	//   74  157:bipush          11
	//   75  159:invokespecial   #35  <Method void zzdy(String, int, int)>
	//   76  162:putstatic       #77  <Field zzdy zzrf>
		zzrg = new zzdy("DRIVER_LICENSE", 11, 12);
	//   77  165:new             #2   <Class zzdy>
	//   78  168:dup             
	//   79  169:ldc1            #79  <String "DRIVER_LICENSE">
	//   80  171:bipush          11
	//   81  173:bipush          12
	//   82  175:invokespecial   #35  <Method void zzdy(String, int, int)>
	//   83  178:putstatic       #81  <Field zzdy zzrg>
		zzrh = (new zzdy[] {
			zzqv, zzqw, zzqx, zzqy, zzqz, zzra, zzrb, zzrc, zzrd, zzre, 
			zzrf, zzrg
		});
	//   84  181:bipush          12
	//   85  183:anewarray       zzdy[]
	//   86  186:dup             
	//   87  187:iconst_0        
	//   88  188:getstatic       #37  <Field zzdy zzqv>
	//   89  191:aastore         
	//   90  192:dup             
	//   91  193:iconst_1        
	//   92  194:getstatic       #41  <Field zzdy zzqw>
	//   93  197:aastore         
	//   94  198:dup             
	//   95  199:iconst_2        
	//   96  200:getstatic       #45  <Field zzdy zzqx>
	//   97  203:aastore         
	//   98  204:dup             
	//   99  205:iconst_3        
	//  100  206:getstatic       #49  <Field zzdy zzqy>
	//  101  209:aastore         
	//  102  210:dup             
	//  103  211:iconst_4        
	//  104  212:getstatic       #53  <Field zzdy zzqz>
	//  105  215:aastore         
	//  106  216:dup             
	//  107  217:iconst_5        
	//  108  218:getstatic       #57  <Field zzdy zzra>
	//  109  221:aastore         
	//  110  222:dup             
	//  111  223:bipush          6
	//  112  225:getstatic       #61  <Field zzdy zzrb>
	//  113  228:aastore         
	//  114  229:dup             
	//  115  230:bipush          7
	//  116  232:getstatic       #65  <Field zzdy zzrc>
	//  117  235:aastore         
	//  118  236:dup             
	//  119  237:bipush          8
	//  120  239:getstatic       #69  <Field zzdy zzrd>
	//  121  242:aastore         
	//  122  243:dup             
	//  123  244:bipush          9
	//  124  246:getstatic       #73  <Field zzdy zzre>
	//  125  249:aastore         
	//  126  250:dup             
	//  127  251:bipush          10
	//  128  253:getstatic       #77  <Field zzdy zzrf>
	//  129  256:aastore         
	//  130  257:dup             
	//  131  258:bipush          11
	//  132  260:getstatic       #81  <Field zzdy zzrg>
	//  133  263:aastore         
	//  134  264:putstatic       #83  <Field zzdy[] zzrh>
	//  135  267:new             #85  <Class zzdz>
	//  136  270:dup             
	//  137  271:invokespecial   #87  <Method void zzdz()>
	//  138  274:putstatic       #89  <Field zzgc zzdv>
	//* 139  277:return          
	}
}
