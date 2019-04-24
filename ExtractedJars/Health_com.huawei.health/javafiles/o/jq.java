// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.util.SparseArray;

public class jq
{

	static void c(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #37  <Field String b>
	//    2    4:return          
	}

	static void d(String s)
	{
		k = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #39  <Field String k>
	//    2    4:return          
	}

	static void e(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #35  <Field String a>
	//    2    4:return          
	}

	static void e(boolean flag)
	{
		h = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #41  <Field boolean h>
	//    2    4:return          
	}

	static String a = "";
	static String b = "";
	static String c = null;
	static String d = null;
	static String e = null;
	static long f = 30000L;
	static boolean g = true;
	static boolean h = false;
	static long i = 10000L;
	static String k = "";
	static boolean m = true;
	static final String o[] = {
		"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_LOCATION_EXTRA_COMMANDS", "android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.INTERNET", "android.permission.READ_PHONE_STATE", "android.permission.WRITE_EXTERNAL_STORAGE"
	};
	static final SparseArray p;

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #27  <Field String e>
	//    2    4:aconst_null     
	//    3    5:putstatic       #29  <Field String c>
	//    4    8:aconst_null     
	//    5    9:putstatic       #31  <Field String d>
	//    6   12:ldc1            #33  <String "">
	//    7   14:putstatic       #35  <Field String a>
	//    8   17:ldc1            #33  <String "">
	//    9   19:putstatic       #37  <Field String b>
	//   10   22:ldc1            #33  <String "">
	//   11   24:putstatic       #39  <Field String k>
	//   12   27:iconst_0        
	//   13   28:putstatic       #41  <Field boolean h>
	//   14   31:iconst_1        
	//   15   32:putstatic       #43  <Field boolean g>
	//   16   35:ldc2w           #44  <Long 10000L>
	//   17   38:putstatic       #47  <Field long i>
	//   18   41:ldc2w           #48  <Long 30000L>
	//   19   44:putstatic       #51  <Field long f>
	//   20   47:iconst_1        
	//   21   48:putstatic       #53  <Field boolean m>
		p = new SparseArray();
	//   22   51:new             #55  <Class SparseArray>
	//   23   54:dup             
	//   24   55:invokespecial   #58  <Method void SparseArray()>
	//   25   58:putstatic       #60  <Field SparseArray p>
		p.append(0, "UNKNOWN");
	//   26   61:getstatic       #60  <Field SparseArray p>
	//   27   64:iconst_0        
	//   28   65:ldc1            #62  <String "UNKNOWN">
	//   29   67:invokevirtual   #66  <Method void SparseArray.append(int, Object)>
		p.append(1, "GPRS");
	//   30   70:getstatic       #60  <Field SparseArray p>
	//   31   73:iconst_1        
	//   32   74:ldc1            #68  <String "GPRS">
	//   33   76:invokevirtual   #66  <Method void SparseArray.append(int, Object)>
		p.append(2, "EDGE");
	//   34   79:getstatic       #60  <Field SparseArray p>
	//   35   82:iconst_2        
	//   36   83:ldc1            #70  <String "EDGE">
	//   37   85:invokevirtual   #66  <Method void SparseArray.append(int, Object)>
		p.append(3, "UMTS");
	//   38   88:getstatic       #60  <Field SparseArray p>
	//   39   91:iconst_3        
	//   40   92:ldc1            #72  <String "UMTS">
	//   41   94:invokevirtual   #66  <Method void SparseArray.append(int, Object)>
		p.append(4, "CDMA");
	//   42   97:getstatic       #60  <Field SparseArray p>
	//   43  100:iconst_4        
	//   44  101:ldc1            #74  <String "CDMA">
	//   45  103:invokevirtual   #66  <Method void SparseArray.append(int, Object)>
		p.append(5, "EVDO_0");
	//   46  106:getstatic       #60  <Field SparseArray p>
	//   47  109:iconst_5        
	//   48  110:ldc1            #76  <String "EVDO_0">
	//   49  112:invokevirtual   #66  <Method void SparseArray.append(int, Object)>
		p.append(6, "EVDO_A");
	//   50  115:getstatic       #60  <Field SparseArray p>
	//   51  118:bipush          6
	//   52  120:ldc1            #78  <String "EVDO_A">
	//   53  122:invokevirtual   #66  <Method void SparseArray.append(int, Object)>
		p.append(7, "1xRTT");
	//   54  125:getstatic       #60  <Field SparseArray p>
	//   55  128:bipush          7
	//   56  130:ldc1            #80  <String "1xRTT">
	//   57  132:invokevirtual   #66  <Method void SparseArray.append(int, Object)>
		p.append(8, "HSDPA");
	//   58  135:getstatic       #60  <Field SparseArray p>
	//   59  138:bipush          8
	//   60  140:ldc1            #82  <String "HSDPA">
	//   61  142:invokevirtual   #66  <Method void SparseArray.append(int, Object)>
		p.append(9, "HSUPA");
	//   62  145:getstatic       #60  <Field SparseArray p>
	//   63  148:bipush          9
	//   64  150:ldc1            #84  <String "HSUPA">
	//   65  152:invokevirtual   #66  <Method void SparseArray.append(int, Object)>
		p.append(10, "HSPA");
	//   66  155:getstatic       #60  <Field SparseArray p>
	//   67  158:bipush          10
	//   68  160:ldc1            #86  <String "HSPA">
	//   69  162:invokevirtual   #66  <Method void SparseArray.append(int, Object)>
		p.append(11, "IDEN");
	//   70  165:getstatic       #60  <Field SparseArray p>
	//   71  168:bipush          11
	//   72  170:ldc1            #88  <String "IDEN">
	//   73  172:invokevirtual   #66  <Method void SparseArray.append(int, Object)>
		p.append(12, "EVDO_B");
	//   74  175:getstatic       #60  <Field SparseArray p>
	//   75  178:bipush          12
	//   76  180:ldc1            #90  <String "EVDO_B">
	//   77  182:invokevirtual   #66  <Method void SparseArray.append(int, Object)>
		p.append(13, "LTE");
	//   78  185:getstatic       #60  <Field SparseArray p>
	//   79  188:bipush          13
	//   80  190:ldc1            #92  <String "LTE">
	//   81  192:invokevirtual   #66  <Method void SparseArray.append(int, Object)>
		p.append(14, "EHRPD");
	//   82  195:getstatic       #60  <Field SparseArray p>
	//   83  198:bipush          14
	//   84  200:ldc1            #94  <String "EHRPD">
	//   85  202:invokevirtual   #66  <Method void SparseArray.append(int, Object)>
		p.append(15, "HSPAP");
	//   86  205:getstatic       #60  <Field SparseArray p>
	//   87  208:bipush          15
	//   88  210:ldc1            #96  <String "HSPAP">
	//   89  212:invokevirtual   #66  <Method void SparseArray.append(int, Object)>
	//   90  215:bipush          9
	//   91  217:anewarray       String[]
	//   92  220:dup             
	//   93  221:iconst_0        
	//   94  222:ldc1            #100 <String "android.permission.ACCESS_COARSE_LOCATION">
	//   95  224:aastore         
	//   96  225:dup             
	//   97  226:iconst_1        
	//   98  227:ldc1            #102 <String "android.permission.ACCESS_FINE_LOCATION">
	//   99  229:aastore         
	//  100  230:dup             
	//  101  231:iconst_2        
	//  102  232:ldc1            #104 <String "android.permission.ACCESS_LOCATION_EXTRA_COMMANDS">
	//  103  234:aastore         
	//  104  235:dup             
	//  105  236:iconst_3        
	//  106  237:ldc1            #106 <String "android.permission.ACCESS_NETWORK_STATE">
	//  107  239:aastore         
	//  108  240:dup             
	//  109  241:iconst_4        
	//  110  242:ldc1            #108 <String "android.permission.ACCESS_WIFI_STATE">
	//  111  244:aastore         
	//  112  245:dup             
	//  113  246:iconst_5        
	//  114  247:ldc1            #110 <String "android.permission.CHANGE_WIFI_STATE">
	//  115  249:aastore         
	//  116  250:dup             
	//  117  251:bipush          6
	//  118  253:ldc1            #112 <String "android.permission.INTERNET">
	//  119  255:aastore         
	//  120  256:dup             
	//  121  257:bipush          7
	//  122  259:ldc1            #114 <String "android.permission.READ_PHONE_STATE">
	//  123  261:aastore         
	//  124  262:dup             
	//  125  263:bipush          8
	//  126  265:ldc1            #116 <String "android.permission.WRITE_EXTERNAL_STORAGE">
	//  127  267:aastore         
	//  128  268:putstatic       #118 <Field String[] o>
	//* 129  271:return          
	}
}
