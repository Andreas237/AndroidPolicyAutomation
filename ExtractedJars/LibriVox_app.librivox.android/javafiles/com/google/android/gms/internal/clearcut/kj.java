// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			cb, kn, cc

public final class kj extends Enum
	implements cb
{

	private kj(String s, int i1, int j1)
	{
		super(s, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #81  <Method void Enum(String, int)>
		l = j1;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #83  <Field int l>
	//    7   11:return          
	}

	public static kj a(int i1)
	{
		switch(i1)
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
			return j;
	//    4   62:getstatic       #69  <Field kj j>
	//    5   65:areturn         

		case 9: // '\t'
			return i;
	//    6   66:getstatic       #65  <Field kj i>
	//    7   69:areturn         

		case 8: // '\b'
			return h;
	//    8   70:getstatic       #61  <Field kj h>
	//    9   73:areturn         

		case 7: // '\007'
			return g;
	//   10   74:getstatic       #57  <Field kj g>
	//   11   77:areturn         

		case 5: // '\005'
			return f;
	//   12   78:getstatic       #53  <Field kj f>
	//   13   81:areturn         

		case 4: // '\004'
			return e;
	//   14   82:getstatic       #49  <Field kj e>
	//   15   85:areturn         

		case 3: // '\003'
			return d;
	//   16   86:getstatic       #45  <Field kj d>
	//   17   89:areturn         

		case 2: // '\002'
			return c;
	//   18   90:getstatic       #41  <Field kj c>
	//   19   93:areturn         

		case 1: // '\001'
			return b;
	//   20   94:getstatic       #37  <Field kj b>
	//   21   97:areturn         

		case 0: // '\0'
			return a;
	//   22   98:getstatic       #33  <Field kj a>
	//   23  101:areturn         
		}
	}

	public static cc b()
	{
		return k;
	//    0    0:getstatic       #77  <Field cc k>
	//    1    3:areturn         
	}

	public static kj[] values()
	{
		return (kj[])((kj []) (m)).clone();
	//    0    0:getstatic       #71  <Field kj[] m>
	//    1    3:invokevirtual   #92  <Method Object _5B_Lcom.google.android.gms.internal.clearcut.kj_3B_.clone()>
	//    2    6:checkcast       #88  <Class kj[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int l>
	//    2    4:ireturn         
	}

	private static final kj a;
	private static final kj b;
	private static final kj c;
	private static final kj d;
	private static final kj e;
	private static final kj f;
	private static final kj g;
	private static final kj h;
	private static final kj i;
	private static final kj j;
	private static final cc k = new kn();
	private static final kj m[];
	private final int l;

	static 
	{
		a = new kj("DENSITY_UNKNOWN", 0, 0);
	//    0    0:new             #2   <Class kj>
	//    1    3:dup             
	//    2    4:ldc1            #27  <String "DENSITY_UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #31  <Method void kj(String, int, int)>
	//    6   11:putstatic       #33  <Field kj a>
		b = new kj("DENSITY_ALLDPI", 1, 1);
	//    7   14:new             #2   <Class kj>
	//    8   17:dup             
	//    9   18:ldc1            #35  <String "DENSITY_ALLDPI">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #31  <Method void kj(String, int, int)>
	//   13   25:putstatic       #37  <Field kj b>
		c = new kj("DENSITY_LDPI", 2, 2);
	//   14   28:new             #2   <Class kj>
	//   15   31:dup             
	//   16   32:ldc1            #39  <String "DENSITY_LDPI">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #31  <Method void kj(String, int, int)>
	//   20   39:putstatic       #41  <Field kj c>
		d = new kj("DENSITY_MDPI", 3, 3);
	//   21   42:new             #2   <Class kj>
	//   22   45:dup             
	//   23   46:ldc1            #43  <String "DENSITY_MDPI">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #31  <Method void kj(String, int, int)>
	//   27   53:putstatic       #45  <Field kj d>
		e = new kj("DENSITY_TVDPI", 4, 4);
	//   28   56:new             #2   <Class kj>
	//   29   59:dup             
	//   30   60:ldc1            #47  <String "DENSITY_TVDPI">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #31  <Method void kj(String, int, int)>
	//   34   67:putstatic       #49  <Field kj e>
		f = new kj("DENSITY_HDPI", 5, 5);
	//   35   70:new             #2   <Class kj>
	//   36   73:dup             
	//   37   74:ldc1            #51  <String "DENSITY_HDPI">
	//   38   76:iconst_5        
	//   39   77:iconst_5        
	//   40   78:invokespecial   #31  <Method void kj(String, int, int)>
	//   41   81:putstatic       #53  <Field kj f>
		g = new kj("DENSITY_XHDPI", 6, 7);
	//   42   84:new             #2   <Class kj>
	//   43   87:dup             
	//   44   88:ldc1            #55  <String "DENSITY_XHDPI">
	//   45   90:bipush          6
	//   46   92:bipush          7
	//   47   94:invokespecial   #31  <Method void kj(String, int, int)>
	//   48   97:putstatic       #57  <Field kj g>
		h = new kj("DENSITY_DPI400", 7, 8);
	//   49  100:new             #2   <Class kj>
	//   50  103:dup             
	//   51  104:ldc1            #59  <String "DENSITY_DPI400">
	//   52  106:bipush          7
	//   53  108:bipush          8
	//   54  110:invokespecial   #31  <Method void kj(String, int, int)>
	//   55  113:putstatic       #61  <Field kj h>
		i = new kj("DENSITY_XXHDPI", 8, 9);
	//   56  116:new             #2   <Class kj>
	//   57  119:dup             
	//   58  120:ldc1            #63  <String "DENSITY_XXHDPI">
	//   59  122:bipush          8
	//   60  124:bipush          9
	//   61  126:invokespecial   #31  <Method void kj(String, int, int)>
	//   62  129:putstatic       #65  <Field kj i>
		j = new kj("DENSITY_XXXHDPI", 9, 10);
	//   63  132:new             #2   <Class kj>
	//   64  135:dup             
	//   65  136:ldc1            #67  <String "DENSITY_XXXHDPI">
	//   66  138:bipush          9
	//   67  140:bipush          10
	//   68  142:invokespecial   #31  <Method void kj(String, int, int)>
	//   69  145:putstatic       #69  <Field kj j>
		m = (new kj[] {
			a, b, c, d, e, f, g, h, i, j
		});
	//   70  148:bipush          10
	//   71  150:anewarray       kj[]
	//   72  153:dup             
	//   73  154:iconst_0        
	//   74  155:getstatic       #33  <Field kj a>
	//   75  158:aastore         
	//   76  159:dup             
	//   77  160:iconst_1        
	//   78  161:getstatic       #37  <Field kj b>
	//   79  164:aastore         
	//   80  165:dup             
	//   81  166:iconst_2        
	//   82  167:getstatic       #41  <Field kj c>
	//   83  170:aastore         
	//   84  171:dup             
	//   85  172:iconst_3        
	//   86  173:getstatic       #45  <Field kj d>
	//   87  176:aastore         
	//   88  177:dup             
	//   89  178:iconst_4        
	//   90  179:getstatic       #49  <Field kj e>
	//   91  182:aastore         
	//   92  183:dup             
	//   93  184:iconst_5        
	//   94  185:getstatic       #53  <Field kj f>
	//   95  188:aastore         
	//   96  189:dup             
	//   97  190:bipush          6
	//   98  192:getstatic       #57  <Field kj g>
	//   99  195:aastore         
	//  100  196:dup             
	//  101  197:bipush          7
	//  102  199:getstatic       #61  <Field kj h>
	//  103  202:aastore         
	//  104  203:dup             
	//  105  204:bipush          8
	//  106  206:getstatic       #65  <Field kj i>
	//  107  209:aastore         
	//  108  210:dup             
	//  109  211:bipush          9
	//  110  213:getstatic       #69  <Field kj j>
	//  111  216:aastore         
	//  112  217:putstatic       #71  <Field kj[] m>
	//  113  220:new             #73  <Class kn>
	//  114  223:dup             
	//  115  224:invokespecial   #75  <Method void kn()>
	//  116  227:putstatic       #77  <Field cc k>
	//* 117  230:return          
	}
}
