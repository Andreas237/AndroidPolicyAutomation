// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbah

public final class zzbbw extends Enum
{

	private zzbbw(String s, int i, Class class1, Class class2, Object obj)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #123 <Method void Enum(String, int)>
		zzdve = class1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #125 <Field Class zzdve>
		zzdvf = class2;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #127 <Field Class zzdvf>
		zzdvg = obj;
	//   10   17:aload_0         
	//   11   18:aload           5
	//   12   20:putfield        #129 <Field Object zzdvg>
	//   13   23:return          
	}

	public static zzbbw[] values()
	{
		return (zzbbw[])((zzbbw []) (zzdvh)).clone();
	//    0    0:getstatic       #119 <Field zzbbw[] zzdvh>
	//    1    3:invokevirtual   #138 <Method Object _5B_Lcom.google.android.gms.internal.ads.zzbbw_3B_.clone()>
	//    2    6:checkcast       #134 <Class zzbbw[]>
	//    3    9:areturn         
	}

	public final Class zzadt()
	{
		return zzdvf;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field Class zzdvf>
	//    2    4:areturn         
	}

	public static final zzbbw zzduu;
	public static final zzbbw zzduv;
	public static final zzbbw zzduw;
	public static final zzbbw zzdux;
	public static final zzbbw zzduy;
	public static final zzbbw zzduz;
	public static final zzbbw zzdva;
	public static final zzbbw zzdvb;
	public static final zzbbw zzdvc;
	public static final zzbbw zzdvd;
	private static final zzbbw zzdvh[];
	private final Class zzdve;
	private final Class zzdvf;
	private final Object zzdvg;

	static 
	{
		zzduu = new zzbbw("VOID", 0, java/lang/Void, java/lang/Void, ((Object) (null)));
	//    0    0:new             #2   <Class zzbbw>
	//    1    3:dup             
	//    2    4:ldc1            #28  <String "VOID">
	//    3    6:iconst_0        
	//    4    7:ldc1            #30  <Class Void>
	//    5    9:ldc1            #30  <Class Void>
	//    6   11:aconst_null     
	//    7   12:invokespecial   #34  <Method void zzbbw(String, int, Class, Class, Object)>
	//    8   15:putstatic       #36  <Field zzbbw zzduu>
		zzduv = new zzbbw("INT", 1, Integer.TYPE, java/lang/Integer, ((Object) (Integer.valueOf(0))));
	//    9   18:new             #2   <Class zzbbw>
	//   10   21:dup             
	//   11   22:ldc1            #38  <String "INT">
	//   12   24:iconst_1        
	//   13   25:getstatic       #43  <Field Class Integer.TYPE>
	//   14   28:ldc1            #40  <Class Integer>
	//   15   30:iconst_0        
	//   16   31:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   17   34:invokespecial   #34  <Method void zzbbw(String, int, Class, Class, Object)>
	//   18   37:putstatic       #49  <Field zzbbw zzduv>
		zzduw = new zzbbw("LONG", 2, Long.TYPE, java/lang/Long, ((Object) (Long.valueOf(0L))));
	//   19   40:new             #2   <Class zzbbw>
	//   20   43:dup             
	//   21   44:ldc1            #51  <String "LONG">
	//   22   46:iconst_2        
	//   23   47:getstatic       #54  <Field Class Long.TYPE>
	//   24   50:ldc1            #53  <Class Long>
	//   25   52:lconst_0        
	//   26   53:invokestatic    #57  <Method Long Long.valueOf(long)>
	//   27   56:invokespecial   #34  <Method void zzbbw(String, int, Class, Class, Object)>
	//   28   59:putstatic       #59  <Field zzbbw zzduw>
		zzdux = new zzbbw("FLOAT", 3, Float.TYPE, java/lang/Float, ((Object) (Float.valueOf(0.0F))));
	//   29   62:new             #2   <Class zzbbw>
	//   30   65:dup             
	//   31   66:ldc1            #61  <String "FLOAT">
	//   32   68:iconst_3        
	//   33   69:getstatic       #64  <Field Class Float.TYPE>
	//   34   72:ldc1            #63  <Class Float>
	//   35   74:fconst_0        
	//   36   75:invokestatic    #67  <Method Float Float.valueOf(float)>
	//   37   78:invokespecial   #34  <Method void zzbbw(String, int, Class, Class, Object)>
	//   38   81:putstatic       #69  <Field zzbbw zzdux>
		zzduy = new zzbbw("DOUBLE", 4, Double.TYPE, java/lang/Double, ((Object) (Double.valueOf(0.0D))));
	//   39   84:new             #2   <Class zzbbw>
	//   40   87:dup             
	//   41   88:ldc1            #71  <String "DOUBLE">
	//   42   90:iconst_4        
	//   43   91:getstatic       #74  <Field Class Double.TYPE>
	//   44   94:ldc1            #73  <Class Double>
	//   45   96:dconst_0        
	//   46   97:invokestatic    #77  <Method Double Double.valueOf(double)>
	//   47  100:invokespecial   #34  <Method void zzbbw(String, int, Class, Class, Object)>
	//   48  103:putstatic       #79  <Field zzbbw zzduy>
		zzduz = new zzbbw("BOOLEAN", 5, Boolean.TYPE, java/lang/Boolean, ((Object) (Boolean.valueOf(false))));
	//   49  106:new             #2   <Class zzbbw>
	//   50  109:dup             
	//   51  110:ldc1            #81  <String "BOOLEAN">
	//   52  112:iconst_5        
	//   53  113:getstatic       #84  <Field Class Boolean.TYPE>
	//   54  116:ldc1            #83  <Class Boolean>
	//   55  118:iconst_0        
	//   56  119:invokestatic    #87  <Method Boolean Boolean.valueOf(boolean)>
	//   57  122:invokespecial   #34  <Method void zzbbw(String, int, Class, Class, Object)>
	//   58  125:putstatic       #89  <Field zzbbw zzduz>
		zzdva = new zzbbw("STRING", 6, java/lang/String, java/lang/String, "");
	//   59  128:new             #2   <Class zzbbw>
	//   60  131:dup             
	//   61  132:ldc1            #91  <String "STRING">
	//   62  134:bipush          6
	//   63  136:ldc1            #93  <Class String>
	//   64  138:ldc1            #93  <Class String>
	//   65  140:ldc1            #95  <String "">
	//   66  142:invokespecial   #34  <Method void zzbbw(String, int, Class, Class, Object)>
	//   67  145:putstatic       #97  <Field zzbbw zzdva>
		zzdvb = new zzbbw("BYTE_STRING", 7, com/google/android/gms/internal/ads/zzbah, com/google/android/gms/internal/ads/zzbah, ((Object) (zzbah.zzdpq)));
	//   68  148:new             #2   <Class zzbbw>
	//   69  151:dup             
	//   70  152:ldc1            #99  <String "BYTE_STRING">
	//   71  154:bipush          7
	//   72  156:ldc1            #101 <Class zzbah>
	//   73  158:ldc1            #101 <Class zzbah>
	//   74  160:getstatic       #105 <Field zzbah zzbah.zzdpq>
	//   75  163:invokespecial   #34  <Method void zzbbw(String, int, Class, Class, Object)>
	//   76  166:putstatic       #107 <Field zzbbw zzdvb>
		zzdvc = new zzbbw("ENUM", 8, Integer.TYPE, java/lang/Integer, ((Object) (null)));
	//   77  169:new             #2   <Class zzbbw>
	//   78  172:dup             
	//   79  173:ldc1            #109 <String "ENUM">
	//   80  175:bipush          8
	//   81  177:getstatic       #43  <Field Class Integer.TYPE>
	//   82  180:ldc1            #40  <Class Integer>
	//   83  182:aconst_null     
	//   84  183:invokespecial   #34  <Method void zzbbw(String, int, Class, Class, Object)>
	//   85  186:putstatic       #111 <Field zzbbw zzdvc>
		zzdvd = new zzbbw("MESSAGE", 9, java/lang/Object, java/lang/Object, ((Object) (null)));
	//   86  189:new             #2   <Class zzbbw>
	//   87  192:dup             
	//   88  193:ldc1            #113 <String "MESSAGE">
	//   89  195:bipush          9
	//   90  197:ldc1            #115 <Class Object>
	//   91  199:ldc1            #115 <Class Object>
	//   92  201:aconst_null     
	//   93  202:invokespecial   #34  <Method void zzbbw(String, int, Class, Class, Object)>
	//   94  205:putstatic       #117 <Field zzbbw zzdvd>
		zzdvh = (new zzbbw[] {
			zzduu, zzduv, zzduw, zzdux, zzduy, zzduz, zzdva, zzdvb, zzdvc, zzdvd
		});
	//   95  208:bipush          10
	//   96  210:anewarray       zzbbw[]
	//   97  213:dup             
	//   98  214:iconst_0        
	//   99  215:getstatic       #36  <Field zzbbw zzduu>
	//  100  218:aastore         
	//  101  219:dup             
	//  102  220:iconst_1        
	//  103  221:getstatic       #49  <Field zzbbw zzduv>
	//  104  224:aastore         
	//  105  225:dup             
	//  106  226:iconst_2        
	//  107  227:getstatic       #59  <Field zzbbw zzduw>
	//  108  230:aastore         
	//  109  231:dup             
	//  110  232:iconst_3        
	//  111  233:getstatic       #69  <Field zzbbw zzdux>
	//  112  236:aastore         
	//  113  237:dup             
	//  114  238:iconst_4        
	//  115  239:getstatic       #79  <Field zzbbw zzduy>
	//  116  242:aastore         
	//  117  243:dup             
	//  118  244:iconst_5        
	//  119  245:getstatic       #89  <Field zzbbw zzduz>
	//  120  248:aastore         
	//  121  249:dup             
	//  122  250:bipush          6
	//  123  252:getstatic       #97  <Field zzbbw zzdva>
	//  124  255:aastore         
	//  125  256:dup             
	//  126  257:bipush          7
	//  127  259:getstatic       #107 <Field zzbbw zzdvb>
	//  128  262:aastore         
	//  129  263:dup             
	//  130  264:bipush          8
	//  131  266:getstatic       #111 <Field zzbbw zzdvc>
	//  132  269:aastore         
	//  133  270:dup             
	//  134  271:bipush          9
	//  135  273:getstatic       #117 <Field zzbbw zzdvd>
	//  136  276:aastore         
	//  137  277:putstatic       #119 <Field zzbbw[] zzdvh>
	//* 138  280:return          
	}
}
