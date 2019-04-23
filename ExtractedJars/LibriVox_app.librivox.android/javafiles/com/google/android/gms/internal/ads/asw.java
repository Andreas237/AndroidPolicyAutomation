// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			aqq

public final class asw extends Enum
{

	private asw(String s, int i1, Class class1, Class class2, Object obj)
	{
		super(s, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #120 <Method void Enum(String, int)>
		k = class1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #122 <Field Class k>
		l = class2;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #124 <Field Class l>
		m = obj;
	//   10   17:aload_0         
	//   11   18:aload           5
	//   12   20:putfield        #126 <Field Object m>
	//   13   23:return          
	}

	public static asw[] values()
	{
		return (asw[])((asw []) (n)).clone();
	//    0    0:getstatic       #116 <Field asw[] n>
	//    1    3:invokevirtual   #133 <Method Object _5B_Lcom.google.android.gms.internal.ads.asw_3B_.clone()>
	//    2    6:checkcast       #129 <Class asw[]>
	//    3    9:areturn         
	}

	public final Class a()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Class l>
	//    2    4:areturn         
	}

	public static final asw a;
	public static final asw b;
	public static final asw c;
	public static final asw d;
	public static final asw e;
	public static final asw f;
	public static final asw g;
	public static final asw h;
	public static final asw i;
	public static final asw j;
	private static final asw n[];
	private final Class k;
	private final Class l;
	private final Object m;

	static 
	{
		a = new asw("VOID", 0, java/lang/Void, java/lang/Void, ((Object) (null)));
	//    0    0:new             #2   <Class asw>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "VOID">
	//    3    6:iconst_0        
	//    4    7:ldc1            #28  <Class Void>
	//    5    9:ldc1            #28  <Class Void>
	//    6   11:aconst_null     
	//    7   12:invokespecial   #32  <Method void asw(String, int, Class, Class, Object)>
	//    8   15:putstatic       #34  <Field asw a>
		b = new asw("INT", 1, Integer.TYPE, java/lang/Integer, ((Object) (Integer.valueOf(0))));
	//    9   18:new             #2   <Class asw>
	//   10   21:dup             
	//   11   22:ldc1            #36  <String "INT">
	//   12   24:iconst_1        
	//   13   25:getstatic       #41  <Field Class Integer.TYPE>
	//   14   28:ldc1            #38  <Class Integer>
	//   15   30:iconst_0        
	//   16   31:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//   17   34:invokespecial   #32  <Method void asw(String, int, Class, Class, Object)>
	//   18   37:putstatic       #47  <Field asw b>
		c = new asw("LONG", 2, Long.TYPE, java/lang/Long, ((Object) (Long.valueOf(0L))));
	//   19   40:new             #2   <Class asw>
	//   20   43:dup             
	//   21   44:ldc1            #49  <String "LONG">
	//   22   46:iconst_2        
	//   23   47:getstatic       #52  <Field Class Long.TYPE>
	//   24   50:ldc1            #51  <Class Long>
	//   25   52:lconst_0        
	//   26   53:invokestatic    #55  <Method Long Long.valueOf(long)>
	//   27   56:invokespecial   #32  <Method void asw(String, int, Class, Class, Object)>
	//   28   59:putstatic       #57  <Field asw c>
		d = new asw("FLOAT", 3, Float.TYPE, java/lang/Float, ((Object) (Float.valueOf(0.0F))));
	//   29   62:new             #2   <Class asw>
	//   30   65:dup             
	//   31   66:ldc1            #59  <String "FLOAT">
	//   32   68:iconst_3        
	//   33   69:getstatic       #62  <Field Class Float.TYPE>
	//   34   72:ldc1            #61  <Class Float>
	//   35   74:fconst_0        
	//   36   75:invokestatic    #65  <Method Float Float.valueOf(float)>
	//   37   78:invokespecial   #32  <Method void asw(String, int, Class, Class, Object)>
	//   38   81:putstatic       #67  <Field asw d>
		e = new asw("DOUBLE", 4, Double.TYPE, java/lang/Double, ((Object) (Double.valueOf(0.0D))));
	//   39   84:new             #2   <Class asw>
	//   40   87:dup             
	//   41   88:ldc1            #69  <String "DOUBLE">
	//   42   90:iconst_4        
	//   43   91:getstatic       #72  <Field Class Double.TYPE>
	//   44   94:ldc1            #71  <Class Double>
	//   45   96:dconst_0        
	//   46   97:invokestatic    #75  <Method Double Double.valueOf(double)>
	//   47  100:invokespecial   #32  <Method void asw(String, int, Class, Class, Object)>
	//   48  103:putstatic       #77  <Field asw e>
		f = new asw("BOOLEAN", 5, Boolean.TYPE, java/lang/Boolean, ((Object) (Boolean.valueOf(false))));
	//   49  106:new             #2   <Class asw>
	//   50  109:dup             
	//   51  110:ldc1            #79  <String "BOOLEAN">
	//   52  112:iconst_5        
	//   53  113:getstatic       #82  <Field Class Boolean.TYPE>
	//   54  116:ldc1            #81  <Class Boolean>
	//   55  118:iconst_0        
	//   56  119:invokestatic    #85  <Method Boolean Boolean.valueOf(boolean)>
	//   57  122:invokespecial   #32  <Method void asw(String, int, Class, Class, Object)>
	//   58  125:putstatic       #87  <Field asw f>
		g = new asw("STRING", 6, java/lang/String, java/lang/String, "");
	//   59  128:new             #2   <Class asw>
	//   60  131:dup             
	//   61  132:ldc1            #89  <String "STRING">
	//   62  134:bipush          6
	//   63  136:ldc1            #91  <Class String>
	//   64  138:ldc1            #91  <Class String>
	//   65  140:ldc1            #93  <String "">
	//   66  142:invokespecial   #32  <Method void asw(String, int, Class, Class, Object)>
	//   67  145:putstatic       #95  <Field asw g>
		h = new asw("BYTE_STRING", 7, com/google/android/gms/internal/ads/aqq, com/google/android/gms/internal/ads/aqq, ((Object) (aqq.a)));
	//   68  148:new             #2   <Class asw>
	//   69  151:dup             
	//   70  152:ldc1            #97  <String "BYTE_STRING">
	//   71  154:bipush          7
	//   72  156:ldc1            #99  <Class aqq>
	//   73  158:ldc1            #99  <Class aqq>
	//   74  160:getstatic       #102 <Field aqq aqq.a>
	//   75  163:invokespecial   #32  <Method void asw(String, int, Class, Class, Object)>
	//   76  166:putstatic       #104 <Field asw h>
		i = new asw("ENUM", 8, Integer.TYPE, java/lang/Integer, ((Object) (null)));
	//   77  169:new             #2   <Class asw>
	//   78  172:dup             
	//   79  173:ldc1            #106 <String "ENUM">
	//   80  175:bipush          8
	//   81  177:getstatic       #41  <Field Class Integer.TYPE>
	//   82  180:ldc1            #38  <Class Integer>
	//   83  182:aconst_null     
	//   84  183:invokespecial   #32  <Method void asw(String, int, Class, Class, Object)>
	//   85  186:putstatic       #108 <Field asw i>
		j = new asw("MESSAGE", 9, java/lang/Object, java/lang/Object, ((Object) (null)));
	//   86  189:new             #2   <Class asw>
	//   87  192:dup             
	//   88  193:ldc1            #110 <String "MESSAGE">
	//   89  195:bipush          9
	//   90  197:ldc1            #112 <Class Object>
	//   91  199:ldc1            #112 <Class Object>
	//   92  201:aconst_null     
	//   93  202:invokespecial   #32  <Method void asw(String, int, Class, Class, Object)>
	//   94  205:putstatic       #114 <Field asw j>
		n = (new asw[] {
			a, b, c, d, e, f, g, h, i, j
		});
	//   95  208:bipush          10
	//   96  210:anewarray       asw[]
	//   97  213:dup             
	//   98  214:iconst_0        
	//   99  215:getstatic       #34  <Field asw a>
	//  100  218:aastore         
	//  101  219:dup             
	//  102  220:iconst_1        
	//  103  221:getstatic       #47  <Field asw b>
	//  104  224:aastore         
	//  105  225:dup             
	//  106  226:iconst_2        
	//  107  227:getstatic       #57  <Field asw c>
	//  108  230:aastore         
	//  109  231:dup             
	//  110  232:iconst_3        
	//  111  233:getstatic       #67  <Field asw d>
	//  112  236:aastore         
	//  113  237:dup             
	//  114  238:iconst_4        
	//  115  239:getstatic       #77  <Field asw e>
	//  116  242:aastore         
	//  117  243:dup             
	//  118  244:iconst_5        
	//  119  245:getstatic       #87  <Field asw f>
	//  120  248:aastore         
	//  121  249:dup             
	//  122  250:bipush          6
	//  123  252:getstatic       #95  <Field asw g>
	//  124  255:aastore         
	//  125  256:dup             
	//  126  257:bipush          7
	//  127  259:getstatic       #104 <Field asw h>
	//  128  262:aastore         
	//  129  263:dup             
	//  130  264:bipush          8
	//  131  266:getstatic       #108 <Field asw i>
	//  132  269:aastore         
	//  133  270:dup             
	//  134  271:bipush          9
	//  135  273:getstatic       #114 <Field asw j>
	//  136  276:aastore         
	//  137  277:putstatic       #116 <Field asw[] n>
	//* 138  280:return          
	}
}
