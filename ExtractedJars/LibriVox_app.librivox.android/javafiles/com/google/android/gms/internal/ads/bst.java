// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asp, buq, bur, asq, 
//			asr

public final class bst extends Enum
	implements asp
{

	private bst(String s, int i1, int j1)
	{
		super(s, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #86  <Method void Enum(String, int)>
		m = j1;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #88  <Field int m>
	//    7   11:return          
	}

	public static bst a(int i1)
	{
		switch(i1)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 10: default 60
	//	               0 102
	//	               1 98
	//	               2 94
	//	               3 90
	//	               4 86
	//	               5 82
	//	               6 78
	//	               7 74
	//	               8 70
	//	               9 66
	//	               10 62
		default:
			return null;
	//    2   60:aconst_null     
	//    3   61:areturn         

		case 10: // '\n'
			return k;
	//    4   62:getstatic       #74  <Field bst k>
	//    5   65:areturn         

		case 9: // '\t'
			return j;
	//    6   66:getstatic       #70  <Field bst j>
	//    7   69:areturn         

		case 8: // '\b'
			return i;
	//    8   70:getstatic       #66  <Field bst i>
	//    9   73:areturn         

		case 7: // '\007'
			return h;
	//   10   74:getstatic       #62  <Field bst h>
	//   11   77:areturn         

		case 6: // '\006'
			return g;
	//   12   78:getstatic       #58  <Field bst g>
	//   13   81:areturn         

		case 5: // '\005'
			return f;
	//   14   82:getstatic       #54  <Field bst f>
	//   15   85:areturn         

		case 4: // '\004'
			return e;
	//   16   86:getstatic       #50  <Field bst e>
	//   17   89:areturn         

		case 3: // '\003'
			return d;
	//   18   90:getstatic       #46  <Field bst d>
	//   19   93:areturn         

		case 2: // '\002'
			return c;
	//   20   94:getstatic       #42  <Field bst c>
	//   21   97:areturn         

		case 1: // '\001'
			return b;
	//   22   98:getstatic       #38  <Field bst b>
	//   23  101:areturn         

		case 0: // '\0'
			return a;
	//   24  102:getstatic       #34  <Field bst a>
	//   25  105:areturn         
		}
	}

	public static asr b()
	{
		return bur.a;
	//    0    0:getstatic       #95  <Field asr bur.a>
	//    1    3:areturn         
	}

	public static bst[] values()
	{
		return (bst[])((bst []) (n)).clone();
	//    0    0:getstatic       #76  <Field bst[] n>
	//    1    3:invokevirtual   #102 <Method Object _5B_Lcom.google.android.gms.internal.ads.bst_3B_.clone()>
	//    2    6:checkcast       #98  <Class bst[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int m>
	//    2    4:ireturn         
	}

	private static final bst a;
	private static final bst b;
	private static final bst c;
	private static final bst d;
	private static final bst e;
	private static final bst f;
	private static final bst g;
	private static final bst h;
	private static final bst i;
	private static final bst j;
	private static final bst k;
	private static final asq l = new buq();
	private static final bst n[];
	private final int m;

	static 
	{
		a = new bst("AD_FORMAT_TYPE_UNSPECIFIED", 0, 0);
	//    0    0:new             #2   <Class bst>
	//    1    3:dup             
	//    2    4:ldc1            #28  <String "AD_FORMAT_TYPE_UNSPECIFIED">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #32  <Method void bst(String, int, int)>
	//    6   11:putstatic       #34  <Field bst a>
		b = new bst("BANNER", 1, 1);
	//    7   14:new             #2   <Class bst>
	//    8   17:dup             
	//    9   18:ldc1            #36  <String "BANNER">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #32  <Method void bst(String, int, int)>
	//   13   25:putstatic       #38  <Field bst b>
		c = new bst("INTERSTITIAL", 2, 2);
	//   14   28:new             #2   <Class bst>
	//   15   31:dup             
	//   16   32:ldc1            #40  <String "INTERSTITIAL">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #32  <Method void bst(String, int, int)>
	//   20   39:putstatic       #42  <Field bst c>
		d = new bst("NATIVE_EXPRESS", 3, 3);
	//   21   42:new             #2   <Class bst>
	//   22   45:dup             
	//   23   46:ldc1            #44  <String "NATIVE_EXPRESS">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #32  <Method void bst(String, int, int)>
	//   27   53:putstatic       #46  <Field bst d>
		e = new bst("NATIVE_CONTENT", 4, 4);
	//   28   56:new             #2   <Class bst>
	//   29   59:dup             
	//   30   60:ldc1            #48  <String "NATIVE_CONTENT">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #32  <Method void bst(String, int, int)>
	//   34   67:putstatic       #50  <Field bst e>
		f = new bst("NATIVE_APP_INSTALL", 5, 5);
	//   35   70:new             #2   <Class bst>
	//   36   73:dup             
	//   37   74:ldc1            #52  <String "NATIVE_APP_INSTALL">
	//   38   76:iconst_5        
	//   39   77:iconst_5        
	//   40   78:invokespecial   #32  <Method void bst(String, int, int)>
	//   41   81:putstatic       #54  <Field bst f>
		g = new bst("NATIVE_CUSTOM_TEMPLATE", 6, 6);
	//   42   84:new             #2   <Class bst>
	//   43   87:dup             
	//   44   88:ldc1            #56  <String "NATIVE_CUSTOM_TEMPLATE">
	//   45   90:bipush          6
	//   46   92:bipush          6
	//   47   94:invokespecial   #32  <Method void bst(String, int, int)>
	//   48   97:putstatic       #58  <Field bst g>
		h = new bst("DFP_BANNER", 7, 7);
	//   49  100:new             #2   <Class bst>
	//   50  103:dup             
	//   51  104:ldc1            #60  <String "DFP_BANNER">
	//   52  106:bipush          7
	//   53  108:bipush          7
	//   54  110:invokespecial   #32  <Method void bst(String, int, int)>
	//   55  113:putstatic       #62  <Field bst h>
		i = new bst("DFP_INTERSTITIAL", 8, 8);
	//   56  116:new             #2   <Class bst>
	//   57  119:dup             
	//   58  120:ldc1            #64  <String "DFP_INTERSTITIAL">
	//   59  122:bipush          8
	//   60  124:bipush          8
	//   61  126:invokespecial   #32  <Method void bst(String, int, int)>
	//   62  129:putstatic       #66  <Field bst i>
		j = new bst("REWARD_BASED_VIDEO_AD", 9, 9);
	//   63  132:new             #2   <Class bst>
	//   64  135:dup             
	//   65  136:ldc1            #68  <String "REWARD_BASED_VIDEO_AD">
	//   66  138:bipush          9
	//   67  140:bipush          9
	//   68  142:invokespecial   #32  <Method void bst(String, int, int)>
	//   69  145:putstatic       #70  <Field bst j>
		k = new bst("BANNER_SEARCH_ADS", 10, 10);
	//   70  148:new             #2   <Class bst>
	//   71  151:dup             
	//   72  152:ldc1            #72  <String "BANNER_SEARCH_ADS">
	//   73  154:bipush          10
	//   74  156:bipush          10
	//   75  158:invokespecial   #32  <Method void bst(String, int, int)>
	//   76  161:putstatic       #74  <Field bst k>
		n = (new bst[] {
			a, b, c, d, e, f, g, h, i, j, 
			k
		});
	//   77  164:bipush          11
	//   78  166:anewarray       bst[]
	//   79  169:dup             
	//   80  170:iconst_0        
	//   81  171:getstatic       #34  <Field bst a>
	//   82  174:aastore         
	//   83  175:dup             
	//   84  176:iconst_1        
	//   85  177:getstatic       #38  <Field bst b>
	//   86  180:aastore         
	//   87  181:dup             
	//   88  182:iconst_2        
	//   89  183:getstatic       #42  <Field bst c>
	//   90  186:aastore         
	//   91  187:dup             
	//   92  188:iconst_3        
	//   93  189:getstatic       #46  <Field bst d>
	//   94  192:aastore         
	//   95  193:dup             
	//   96  194:iconst_4        
	//   97  195:getstatic       #50  <Field bst e>
	//   98  198:aastore         
	//   99  199:dup             
	//  100  200:iconst_5        
	//  101  201:getstatic       #54  <Field bst f>
	//  102  204:aastore         
	//  103  205:dup             
	//  104  206:bipush          6
	//  105  208:getstatic       #58  <Field bst g>
	//  106  211:aastore         
	//  107  212:dup             
	//  108  213:bipush          7
	//  109  215:getstatic       #62  <Field bst h>
	//  110  218:aastore         
	//  111  219:dup             
	//  112  220:bipush          8
	//  113  222:getstatic       #66  <Field bst i>
	//  114  225:aastore         
	//  115  226:dup             
	//  116  227:bipush          9
	//  117  229:getstatic       #70  <Field bst j>
	//  118  232:aastore         
	//  119  233:dup             
	//  120  234:bipush          10
	//  121  236:getstatic       #74  <Field bst k>
	//  122  239:aastore         
	//  123  240:putstatic       #76  <Field bst[] n>
	//  124  243:new             #78  <Class buq>
	//  125  246:dup             
	//  126  247:invokespecial   #80  <Method void buq()>
	//  127  250:putstatic       #82  <Field asq l>
	//* 128  253:return          
	}
}
