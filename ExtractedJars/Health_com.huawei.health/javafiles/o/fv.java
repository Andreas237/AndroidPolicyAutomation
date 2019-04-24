// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


public final class fv extends Enum
{

	private fv(String s, int j, int l, String s1)
	{
		super(s, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #73  <Method void Enum(String, int)>
		i = l;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #75  <Field int i>
		k = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #77  <Field String k>
	//   10   17:return          
	}

	public static fv b(int j)
	{
		switch(j)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    6: default 60
	//	               4001: 75
	//	               5000: 83
	//	               6001: 67
	//	               6002: 71
	//	               8000: 79
	//	               9000: 63
	//*   2   60:goto            87
		case 9000: 
			return d;
	//    3   63:getstatic       #31  <Field fv d>
	//    4   66:areturn         

		case 6001: 
			return a;
	//    5   67:getstatic       #43  <Field fv a>
	//    6   70:areturn         

		case 6002: 
			return b;
	//    7   71:getstatic       #49  <Field fv b>
	//    8   74:areturn         

		case 4001: 
			return e;
	//    9   75:getstatic       #55  <Field fv e>
	//   10   78:areturn         

		case 8000: 
			return g;
	//   11   79:getstatic       #67  <Field fv g>
	//   12   82:areturn         

		case 5000: 
			return f;
	//   13   83:getstatic       #61  <Field fv f>
	//   14   86:areturn         
		}
		return c;
	//   15   87:getstatic       #37  <Field fv c>
	//   16   90:areturn         
	}

	public static fv valueOf(String s)
	{
		return (fv)Enum.valueOf(o/fv, s);
	//    0    0:ldc1            #2   <Class fv>
	//    1    2:aload_0         
	//    2    3:invokestatic    #85  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class fv>
	//    4    9:areturn         
	}

	public static fv[] values()
	{
		return (fv[])((fv []) (h)).clone();
	//    0    0:getstatic       #69  <Field fv[] h>
	//    1    3:invokevirtual   #92  <Method Object _5B_Lo.fv_3B_.clone()>
	//    2    6:checkcast       #88  <Class fv[]>
	//    3    9:areturn         
	}

	public static final fv a;
	public static final fv b;
	public static final fv c;
	public static final fv d;
	public static final fv e;
	public static final fv f;
	public static final fv g;
	private static final fv h[];
	public int i;
	public String k;

	static 
	{
		d = new fv("SUCCEEDED", 0, 9000, "\u5904\u7406\u6210\u529F");
	//    0    0:new             #2   <Class fv>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "SUCCEEDED">
	//    3    6:iconst_0        
	//    4    7:sipush          9000
	//    5   10:ldc1            #25  <String "\u5904\u7406\u6210\u529F">
	//    6   12:invokespecial   #29  <Method void fv(String, int, int, String)>
	//    7   15:putstatic       #31  <Field fv d>
		c = new fv("FAILED", 1, 4000, "\u7CFB\u7EDF\u7E41\u5FD9\uFF0C\u8BF7\u7A0D\u540E\u518D\u8BD5");
	//    8   18:new             #2   <Class fv>
	//    9   21:dup             
	//   10   22:ldc1            #33  <String "FAILED">
	//   11   24:iconst_1        
	//   12   25:sipush          4000
	//   13   28:ldc1            #35  <String "\u7CFB\u7EDF\u7E41\u5FD9\uFF0C\u8BF7\u7A0D\u540E\u518D\u8BD5">
	//   14   30:invokespecial   #29  <Method void fv(String, int, int, String)>
	//   15   33:putstatic       #37  <Field fv c>
		a = new fv("CANCELED", 2, 6001, "\u7528\u6237\u53D6\u6D88");
	//   16   36:new             #2   <Class fv>
	//   17   39:dup             
	//   18   40:ldc1            #39  <String "CANCELED">
	//   19   42:iconst_2        
	//   20   43:sipush          6001
	//   21   46:ldc1            #41  <String "\u7528\u6237\u53D6\u6D88">
	//   22   48:invokespecial   #29  <Method void fv(String, int, int, String)>
	//   23   51:putstatic       #43  <Field fv a>
		b = new fv("NETWORK_ERROR", 3, 6002, "\u7F51\u7EDC\u8FDE\u63A5\u5F02\u5E38");
	//   24   54:new             #2   <Class fv>
	//   25   57:dup             
	//   26   58:ldc1            #45  <String "NETWORK_ERROR">
	//   27   60:iconst_3        
	//   28   61:sipush          6002
	//   29   64:ldc1            #47  <String "\u7F51\u7EDC\u8FDE\u63A5\u5F02\u5E38">
	//   30   66:invokespecial   #29  <Method void fv(String, int, int, String)>
	//   31   69:putstatic       #49  <Field fv b>
		e = new fv("PARAMS_ERROR", 4, 4001, "\u53C2\u6570\u9519\u8BEF");
	//   32   72:new             #2   <Class fv>
	//   33   75:dup             
	//   34   76:ldc1            #51  <String "PARAMS_ERROR">
	//   35   78:iconst_4        
	//   36   79:sipush          4001
	//   37   82:ldc1            #53  <String "\u53C2\u6570\u9519\u8BEF">
	//   38   84:invokespecial   #29  <Method void fv(String, int, int, String)>
	//   39   87:putstatic       #55  <Field fv e>
		f = new fv("DOUBLE_REQUEST", 5, 5000, "\u91CD\u590D\u8BF7\u6C42");
	//   40   90:new             #2   <Class fv>
	//   41   93:dup             
	//   42   94:ldc1            #57  <String "DOUBLE_REQUEST">
	//   43   96:iconst_5        
	//   44   97:sipush          5000
	//   45  100:ldc1            #59  <String "\u91CD\u590D\u8BF7\u6C42">
	//   46  102:invokespecial   #29  <Method void fv(String, int, int, String)>
	//   47  105:putstatic       #61  <Field fv f>
		g = new fv("PAY_WAITTING", 6, 8000, "\u652F\u4ED8\u7ED3\u679C\u786E\u8BA4\u4E2D");
	//   48  108:new             #2   <Class fv>
	//   49  111:dup             
	//   50  112:ldc1            #63  <String "PAY_WAITTING">
	//   51  114:bipush          6
	//   52  116:sipush          8000
	//   53  119:ldc1            #65  <String "\u652F\u4ED8\u7ED3\u679C\u786E\u8BA4\u4E2D">
	//   54  121:invokespecial   #29  <Method void fv(String, int, int, String)>
	//   55  124:putstatic       #67  <Field fv g>
		h = (new fv[] {
			d, c, a, b, e, f, g
		});
	//   56  127:bipush          7
	//   57  129:anewarray       fv[]
	//   58  132:dup             
	//   59  133:iconst_0        
	//   60  134:getstatic       #31  <Field fv d>
	//   61  137:aastore         
	//   62  138:dup             
	//   63  139:iconst_1        
	//   64  140:getstatic       #37  <Field fv c>
	//   65  143:aastore         
	//   66  144:dup             
	//   67  145:iconst_2        
	//   68  146:getstatic       #43  <Field fv a>
	//   69  149:aastore         
	//   70  150:dup             
	//   71  151:iconst_3        
	//   72  152:getstatic       #49  <Field fv b>
	//   73  155:aastore         
	//   74  156:dup             
	//   75  157:iconst_4        
	//   76  158:getstatic       #55  <Field fv e>
	//   77  161:aastore         
	//   78  162:dup             
	//   79  163:iconst_5        
	//   80  164:getstatic       #61  <Field fv f>
	//   81  167:aastore         
	//   82  168:dup             
	//   83  169:bipush          6
	//   84  171:getstatic       #67  <Field fv g>
	//   85  174:aastore         
	//   86  175:putstatic       #69  <Field fv[] h>
	//*  87  178:return          
	}
}
