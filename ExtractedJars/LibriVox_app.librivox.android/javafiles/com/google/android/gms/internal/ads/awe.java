// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			aqq

public final class awe extends Enum
{

	private awe(String s, int l, Object obj)
	{
		super(s, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #99  <Method void Enum(String, int)>
		j = obj;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #101 <Field Object j>
	//    7   11:return          
	}

	public static awe[] values()
	{
		return (awe[])((awe []) (k)).clone();
	//    0    0:getstatic       #95  <Field awe[] k>
	//    1    3:invokevirtual   #108 <Method Object _5B_Lcom.google.android.gms.internal.ads.awe_3B_.clone()>
	//    2    6:checkcast       #104 <Class awe[]>
	//    3    9:areturn         
	}

	public static final awe a;
	public static final awe b;
	public static final awe c;
	public static final awe d;
	public static final awe e;
	public static final awe f;
	public static final awe g;
	public static final awe h;
	public static final awe i;
	private static final awe k[];
	private final Object j;

	static 
	{
		a = new awe("INT", 0, ((Object) (Integer.valueOf(0))));
	//    0    0:new             #2   <Class awe>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "INT">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//    6   11:invokespecial   #32  <Method void awe(String, int, Object)>
	//    7   14:putstatic       #34  <Field awe a>
		b = new awe("LONG", 1, ((Object) (Long.valueOf(0L))));
	//    8   17:new             #2   <Class awe>
	//    9   20:dup             
	//   10   21:ldc1            #36  <String "LONG">
	//   11   23:iconst_1        
	//   12   24:lconst_0        
	//   13   25:invokestatic    #41  <Method Long Long.valueOf(long)>
	//   14   28:invokespecial   #32  <Method void awe(String, int, Object)>
	//   15   31:putstatic       #43  <Field awe b>
		c = new awe("FLOAT", 2, ((Object) (Float.valueOf(0.0F))));
	//   16   34:new             #2   <Class awe>
	//   17   37:dup             
	//   18   38:ldc1            #45  <String "FLOAT">
	//   19   40:iconst_2        
	//   20   41:fconst_0        
	//   21   42:invokestatic    #50  <Method Float Float.valueOf(float)>
	//   22   45:invokespecial   #32  <Method void awe(String, int, Object)>
	//   23   48:putstatic       #52  <Field awe c>
		d = new awe("DOUBLE", 3, ((Object) (Double.valueOf(0.0D))));
	//   24   51:new             #2   <Class awe>
	//   25   54:dup             
	//   26   55:ldc1            #54  <String "DOUBLE">
	//   27   57:iconst_3        
	//   28   58:dconst_0        
	//   29   59:invokestatic    #59  <Method Double Double.valueOf(double)>
	//   30   62:invokespecial   #32  <Method void awe(String, int, Object)>
	//   31   65:putstatic       #61  <Field awe d>
		e = new awe("BOOLEAN", 4, ((Object) (Boolean.valueOf(false))));
	//   32   68:new             #2   <Class awe>
	//   33   71:dup             
	//   34   72:ldc1            #63  <String "BOOLEAN">
	//   35   74:iconst_4        
	//   36   75:iconst_0        
	//   37   76:invokestatic    #68  <Method Boolean Boolean.valueOf(boolean)>
	//   38   79:invokespecial   #32  <Method void awe(String, int, Object)>
	//   39   82:putstatic       #70  <Field awe e>
		f = new awe("STRING", 5, "");
	//   40   85:new             #2   <Class awe>
	//   41   88:dup             
	//   42   89:ldc1            #72  <String "STRING">
	//   43   91:iconst_5        
	//   44   92:ldc1            #74  <String "">
	//   45   94:invokespecial   #32  <Method void awe(String, int, Object)>
	//   46   97:putstatic       #76  <Field awe f>
		g = new awe("BYTE_STRING", 6, ((Object) (aqq.a)));
	//   47  100:new             #2   <Class awe>
	//   48  103:dup             
	//   49  104:ldc1            #78  <String "BYTE_STRING">
	//   50  106:bipush          6
	//   51  108:getstatic       #83  <Field aqq aqq.a>
	//   52  111:invokespecial   #32  <Method void awe(String, int, Object)>
	//   53  114:putstatic       #85  <Field awe g>
		h = new awe("ENUM", 7, ((Object) (null)));
	//   54  117:new             #2   <Class awe>
	//   55  120:dup             
	//   56  121:ldc1            #87  <String "ENUM">
	//   57  123:bipush          7
	//   58  125:aconst_null     
	//   59  126:invokespecial   #32  <Method void awe(String, int, Object)>
	//   60  129:putstatic       #89  <Field awe h>
		i = new awe("MESSAGE", 8, ((Object) (null)));
	//   61  132:new             #2   <Class awe>
	//   62  135:dup             
	//   63  136:ldc1            #91  <String "MESSAGE">
	//   64  138:bipush          8
	//   65  140:aconst_null     
	//   66  141:invokespecial   #32  <Method void awe(String, int, Object)>
	//   67  144:putstatic       #93  <Field awe i>
		k = (new awe[] {
			a, b, c, d, e, f, g, h, i
		});
	//   68  147:bipush          9
	//   69  149:anewarray       awe[]
	//   70  152:dup             
	//   71  153:iconst_0        
	//   72  154:getstatic       #34  <Field awe a>
	//   73  157:aastore         
	//   74  158:dup             
	//   75  159:iconst_1        
	//   76  160:getstatic       #43  <Field awe b>
	//   77  163:aastore         
	//   78  164:dup             
	//   79  165:iconst_2        
	//   80  166:getstatic       #52  <Field awe c>
	//   81  169:aastore         
	//   82  170:dup             
	//   83  171:iconst_3        
	//   84  172:getstatic       #61  <Field awe d>
	//   85  175:aastore         
	//   86  176:dup             
	//   87  177:iconst_4        
	//   88  178:getstatic       #70  <Field awe e>
	//   89  181:aastore         
	//   90  182:dup             
	//   91  183:iconst_5        
	//   92  184:getstatic       #76  <Field awe f>
	//   93  187:aastore         
	//   94  188:dup             
	//   95  189:bipush          6
	//   96  191:getstatic       #85  <Field awe g>
	//   97  194:aastore         
	//   98  195:dup             
	//   99  196:bipush          7
	//  100  198:getstatic       #89  <Field awe h>
	//  101  201:aastore         
	//  102  202:dup             
	//  103  203:bipush          8
	//  104  205:getstatic       #93  <Field awe i>
	//  105  208:aastore         
	//  106  209:putstatic       #95  <Field awe[] k>
	//* 107  212:return          
	}
}
