// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			cb, km, cc

public final class ki extends Enum
	implements cb
{

	private ki(String s, int i1, int j1)
	{
		super(s, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #91  <Method void Enum(String, int)>
		n = j1;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #93  <Field int n>
	//    7   11:return          
	}

	public static ki a(int i1)
	{
		switch(i1)
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
			return l;
	//    4   66:getstatic       #79  <Field ki l>
	//    5   69:areturn         

		case 10: // '\n'
			return k;
	//    6   70:getstatic       #75  <Field ki k>
	//    7   73:areturn         

		case 9: // '\t'
			return j;
	//    8   74:getstatic       #71  <Field ki j>
	//    9   77:areturn         

		case 8: // '\b'
			return i;
	//   10   78:getstatic       #67  <Field ki i>
	//   11   81:areturn         

		case 7: // '\007'
			return h;
	//   12   82:getstatic       #63  <Field ki h>
	//   13   85:areturn         

		case 6: // '\006'
			return g;
	//   14   86:getstatic       #59  <Field ki g>
	//   15   89:areturn         

		case 5: // '\005'
			return f;
	//   16   90:getstatic       #55  <Field ki f>
	//   17   93:areturn         

		case 4: // '\004'
			return e;
	//   18   94:getstatic       #51  <Field ki e>
	//   19   97:areturn         

		case 3: // '\003'
			return d;
	//   20   98:getstatic       #47  <Field ki d>
	//   21  101:areturn         

		case 2: // '\002'
			return c;
	//   22  102:getstatic       #43  <Field ki c>
	//   23  105:areturn         

		case 1: // '\001'
			return b;
	//   24  106:getstatic       #39  <Field ki b>
	//   25  109:areturn         

		case 0: // '\0'
			return a;
	//   26  110:getstatic       #35  <Field ki a>
	//   27  113:areturn         
		}
	}

	public static cc b()
	{
		return m;
	//    0    0:getstatic       #87  <Field cc m>
	//    1    3:areturn         
	}

	public static ki[] values()
	{
		return (ki[])((ki []) (o)).clone();
	//    0    0:getstatic       #81  <Field ki[] o>
	//    1    3:invokevirtual   #102 <Method Object _5B_Lcom.google.android.gms.internal.clearcut.ki_3B_.clone()>
	//    2    6:checkcast       #98  <Class ki[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field int n>
	//    2    4:ireturn         
	}

	private static final ki a;
	private static final ki b;
	private static final ki c;
	private static final ki d;
	private static final ki e;
	private static final ki f;
	private static final ki g;
	private static final ki h;
	private static final ki i;
	private static final ki j;
	private static final ki k;
	private static final ki l;
	private static final cc m = new km();
	private static final ki o[];
	private final int n;

	static 
	{
		a = new ki("BUILD_TYPE_UNKNOWN", 0, 0);
	//    0    0:new             #2   <Class ki>
	//    1    3:dup             
	//    2    4:ldc1            #29  <String "BUILD_TYPE_UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #33  <Method void ki(String, int, int)>
	//    6   11:putstatic       #35  <Field ki a>
		b = new ki("BUILD_TYPE_PROD", 1, 1);
	//    7   14:new             #2   <Class ki>
	//    8   17:dup             
	//    9   18:ldc1            #37  <String "BUILD_TYPE_PROD">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #33  <Method void ki(String, int, int)>
	//   13   25:putstatic       #39  <Field ki b>
		c = new ki("BUILD_TYPE_INTERNAL", 2, 2);
	//   14   28:new             #2   <Class ki>
	//   15   31:dup             
	//   16   32:ldc1            #41  <String "BUILD_TYPE_INTERNAL">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #33  <Method void ki(String, int, int)>
	//   20   39:putstatic       #43  <Field ki c>
		d = new ki("BUILD_TYPE_PRODLMP", 3, 3);
	//   21   42:new             #2   <Class ki>
	//   22   45:dup             
	//   23   46:ldc1            #45  <String "BUILD_TYPE_PRODLMP">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #33  <Method void ki(String, int, int)>
	//   27   53:putstatic       #47  <Field ki d>
		e = new ki("BUILD_TYPE_THINGS", 4, 4);
	//   28   56:new             #2   <Class ki>
	//   29   59:dup             
	//   30   60:ldc1            #49  <String "BUILD_TYPE_THINGS">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #33  <Method void ki(String, int, int)>
	//   34   67:putstatic       #51  <Field ki e>
		f = new ki("BUILD_TYPE_PRODMNC", 5, 5);
	//   35   70:new             #2   <Class ki>
	//   36   73:dup             
	//   37   74:ldc1            #53  <String "BUILD_TYPE_PRODMNC">
	//   38   76:iconst_5        
	//   39   77:iconst_5        
	//   40   78:invokespecial   #33  <Method void ki(String, int, int)>
	//   41   81:putstatic       #55  <Field ki f>
		g = new ki("BUILD_TYPE_WEARABLE", 6, 6);
	//   42   84:new             #2   <Class ki>
	//   43   87:dup             
	//   44   88:ldc1            #57  <String "BUILD_TYPE_WEARABLE">
	//   45   90:bipush          6
	//   46   92:bipush          6
	//   47   94:invokespecial   #33  <Method void ki(String, int, int)>
	//   48   97:putstatic       #59  <Field ki g>
		h = new ki("BUILD_TYPE_AUTO", 7, 7);
	//   49  100:new             #2   <Class ki>
	//   50  103:dup             
	//   51  104:ldc1            #61  <String "BUILD_TYPE_AUTO">
	//   52  106:bipush          7
	//   53  108:bipush          7
	//   54  110:invokespecial   #33  <Method void ki(String, int, int)>
	//   55  113:putstatic       #63  <Field ki h>
		i = new ki("BUILD_TYPE_SIDEWINDERMNC", 8, 8);
	//   56  116:new             #2   <Class ki>
	//   57  119:dup             
	//   58  120:ldc1            #65  <String "BUILD_TYPE_SIDEWINDERMNC">
	//   59  122:bipush          8
	//   60  124:bipush          8
	//   61  126:invokespecial   #33  <Method void ki(String, int, int)>
	//   62  129:putstatic       #67  <Field ki i>
		j = new ki("BUILD_TYPE_ATV", 9, 9);
	//   63  132:new             #2   <Class ki>
	//   64  135:dup             
	//   65  136:ldc1            #69  <String "BUILD_TYPE_ATV">
	//   66  138:bipush          9
	//   67  140:bipush          9
	//   68  142:invokespecial   #33  <Method void ki(String, int, int)>
	//   69  145:putstatic       #71  <Field ki j>
		k = new ki("BUILD_TYPE_PRODPIX", 10, 10);
	//   70  148:new             #2   <Class ki>
	//   71  151:dup             
	//   72  152:ldc1            #73  <String "BUILD_TYPE_PRODPIX">
	//   73  154:bipush          10
	//   74  156:bipush          10
	//   75  158:invokespecial   #33  <Method void ki(String, int, int)>
	//   76  161:putstatic       #75  <Field ki k>
		l = new ki("BUILD_TYPE_PRODPI", 11, 11);
	//   77  164:new             #2   <Class ki>
	//   78  167:dup             
	//   79  168:ldc1            #77  <String "BUILD_TYPE_PRODPI">
	//   80  170:bipush          11
	//   81  172:bipush          11
	//   82  174:invokespecial   #33  <Method void ki(String, int, int)>
	//   83  177:putstatic       #79  <Field ki l>
		o = (new ki[] {
			a, b, c, d, e, f, g, h, i, j, 
			k, l
		});
	//   84  180:bipush          12
	//   85  182:anewarray       ki[]
	//   86  185:dup             
	//   87  186:iconst_0        
	//   88  187:getstatic       #35  <Field ki a>
	//   89  190:aastore         
	//   90  191:dup             
	//   91  192:iconst_1        
	//   92  193:getstatic       #39  <Field ki b>
	//   93  196:aastore         
	//   94  197:dup             
	//   95  198:iconst_2        
	//   96  199:getstatic       #43  <Field ki c>
	//   97  202:aastore         
	//   98  203:dup             
	//   99  204:iconst_3        
	//  100  205:getstatic       #47  <Field ki d>
	//  101  208:aastore         
	//  102  209:dup             
	//  103  210:iconst_4        
	//  104  211:getstatic       #51  <Field ki e>
	//  105  214:aastore         
	//  106  215:dup             
	//  107  216:iconst_5        
	//  108  217:getstatic       #55  <Field ki f>
	//  109  220:aastore         
	//  110  221:dup             
	//  111  222:bipush          6
	//  112  224:getstatic       #59  <Field ki g>
	//  113  227:aastore         
	//  114  228:dup             
	//  115  229:bipush          7
	//  116  231:getstatic       #63  <Field ki h>
	//  117  234:aastore         
	//  118  235:dup             
	//  119  236:bipush          8
	//  120  238:getstatic       #67  <Field ki i>
	//  121  241:aastore         
	//  122  242:dup             
	//  123  243:bipush          9
	//  124  245:getstatic       #71  <Field ki j>
	//  125  248:aastore         
	//  126  249:dup             
	//  127  250:bipush          10
	//  128  252:getstatic       #75  <Field ki k>
	//  129  255:aastore         
	//  130  256:dup             
	//  131  257:bipush          11
	//  132  259:getstatic       #79  <Field ki l>
	//  133  262:aastore         
	//  134  263:putstatic       #81  <Field ki[] o>
	//  135  266:new             #83  <Class km>
	//  136  269:dup             
	//  137  270:invokespecial   #85  <Method void km()>
	//  138  273:putstatic       #87  <Field cc m>
	//* 139  276:return          
	}
}
