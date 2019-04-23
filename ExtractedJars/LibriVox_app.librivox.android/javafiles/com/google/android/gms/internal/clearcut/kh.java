// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			cb, kl, cc

public final class kh extends Enum
	implements cb
{

	private kh(String s, int i1, int j1)
	{
		super(s, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #76  <Method void Enum(String, int)>
		k = j1;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #78  <Field int k>
	//    7   11:return          
	}

	public static kh a(int i1)
	{
		switch(i1)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 9: default 56
	//	               0 90
	//	               1 86
	//	               2 82
	//	               3 56
	//	               4 78
	//	               5 74
	//	               6 70
	//	               7 66
	//	               8 62
	//	               9 58
		case 3: // '\003'
		default:
			return null;
	//    2   56:aconst_null     
	//    3   57:areturn         

		case 9: // '\t'
			return i;
	//    4   58:getstatic       #64  <Field kh i>
	//    5   61:areturn         

		case 8: // '\b'
			return h;
	//    6   62:getstatic       #60  <Field kh h>
	//    7   65:areturn         

		case 7: // '\007'
			return g;
	//    8   66:getstatic       #56  <Field kh g>
	//    9   69:areturn         

		case 6: // '\006'
			return f;
	//   10   70:getstatic       #52  <Field kh f>
	//   11   73:areturn         

		case 5: // '\005'
			return e;
	//   12   74:getstatic       #48  <Field kh e>
	//   13   77:areturn         

		case 4: // '\004'
			return d;
	//   14   78:getstatic       #44  <Field kh d>
	//   15   81:areturn         

		case 2: // '\002'
			return c;
	//   16   82:getstatic       #40  <Field kh c>
	//   17   85:areturn         

		case 1: // '\001'
			return b;
	//   18   86:getstatic       #36  <Field kh b>
	//   19   89:areturn         

		case 0: // '\0'
			return a;
	//   20   90:getstatic       #32  <Field kh a>
	//   21   93:areturn         
		}
	}

	public static cc b()
	{
		return j;
	//    0    0:getstatic       #72  <Field cc j>
	//    1    3:areturn         
	}

	public static kh[] values()
	{
		return (kh[])((kh []) (l)).clone();
	//    0    0:getstatic       #66  <Field kh[] l>
	//    1    3:invokevirtual   #87  <Method Object _5B_Lcom.google.android.gms.internal.clearcut.kh_3B_.clone()>
	//    2    6:checkcast       #83  <Class kh[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field int k>
	//    2    4:ireturn         
	}

	private static final kh a;
	private static final kh b;
	private static final kh c;
	private static final kh d;
	private static final kh e;
	private static final kh f;
	private static final kh g;
	private static final kh h;
	private static final kh i;
	private static final cc j = new kl();
	private static final kh l[];
	private final int k;

	static 
	{
		a = new kh("ARCH_UNKNOWN", 0, 0);
	//    0    0:new             #2   <Class kh>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "ARCH_UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #30  <Method void kh(String, int, int)>
	//    6   11:putstatic       #32  <Field kh a>
		b = new kh("ARCH_NON_NATIVE", 1, 1);
	//    7   14:new             #2   <Class kh>
	//    8   17:dup             
	//    9   18:ldc1            #34  <String "ARCH_NON_NATIVE">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #30  <Method void kh(String, int, int)>
	//   13   25:putstatic       #36  <Field kh b>
		c = new kh("ARCH_ARMV5", 2, 2);
	//   14   28:new             #2   <Class kh>
	//   15   31:dup             
	//   16   32:ldc1            #38  <String "ARCH_ARMV5">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #30  <Method void kh(String, int, int)>
	//   20   39:putstatic       #40  <Field kh c>
		d = new kh("ARCH_ARMV7", 3, 4);
	//   21   42:new             #2   <Class kh>
	//   22   45:dup             
	//   23   46:ldc1            #42  <String "ARCH_ARMV7">
	//   24   48:iconst_3        
	//   25   49:iconst_4        
	//   26   50:invokespecial   #30  <Method void kh(String, int, int)>
	//   27   53:putstatic       #44  <Field kh d>
		e = new kh("ARCH_ARM64", 4, 5);
	//   28   56:new             #2   <Class kh>
	//   29   59:dup             
	//   30   60:ldc1            #46  <String "ARCH_ARM64">
	//   31   62:iconst_4        
	//   32   63:iconst_5        
	//   33   64:invokespecial   #30  <Method void kh(String, int, int)>
	//   34   67:putstatic       #48  <Field kh e>
		f = new kh("ARCH_MIPS", 5, 6);
	//   35   70:new             #2   <Class kh>
	//   36   73:dup             
	//   37   74:ldc1            #50  <String "ARCH_MIPS">
	//   38   76:iconst_5        
	//   39   77:bipush          6
	//   40   79:invokespecial   #30  <Method void kh(String, int, int)>
	//   41   82:putstatic       #52  <Field kh f>
		g = new kh("ARCH_MIPS_64", 6, 7);
	//   42   85:new             #2   <Class kh>
	//   43   88:dup             
	//   44   89:ldc1            #54  <String "ARCH_MIPS_64">
	//   45   91:bipush          6
	//   46   93:bipush          7
	//   47   95:invokespecial   #30  <Method void kh(String, int, int)>
	//   48   98:putstatic       #56  <Field kh g>
		h = new kh("ARCH_X86", 7, 8);
	//   49  101:new             #2   <Class kh>
	//   50  104:dup             
	//   51  105:ldc1            #58  <String "ARCH_X86">
	//   52  107:bipush          7
	//   53  109:bipush          8
	//   54  111:invokespecial   #30  <Method void kh(String, int, int)>
	//   55  114:putstatic       #60  <Field kh h>
		i = new kh("ARCH_X86_64", 8, 9);
	//   56  117:new             #2   <Class kh>
	//   57  120:dup             
	//   58  121:ldc1            #62  <String "ARCH_X86_64">
	//   59  123:bipush          8
	//   60  125:bipush          9
	//   61  127:invokespecial   #30  <Method void kh(String, int, int)>
	//   62  130:putstatic       #64  <Field kh i>
		l = (new kh[] {
			a, b, c, d, e, f, g, h, i
		});
	//   63  133:bipush          9
	//   64  135:anewarray       kh[]
	//   65  138:dup             
	//   66  139:iconst_0        
	//   67  140:getstatic       #32  <Field kh a>
	//   68  143:aastore         
	//   69  144:dup             
	//   70  145:iconst_1        
	//   71  146:getstatic       #36  <Field kh b>
	//   72  149:aastore         
	//   73  150:dup             
	//   74  151:iconst_2        
	//   75  152:getstatic       #40  <Field kh c>
	//   76  155:aastore         
	//   77  156:dup             
	//   78  157:iconst_3        
	//   79  158:getstatic       #44  <Field kh d>
	//   80  161:aastore         
	//   81  162:dup             
	//   82  163:iconst_4        
	//   83  164:getstatic       #48  <Field kh e>
	//   84  167:aastore         
	//   85  168:dup             
	//   86  169:iconst_5        
	//   87  170:getstatic       #52  <Field kh f>
	//   88  173:aastore         
	//   89  174:dup             
	//   90  175:bipush          6
	//   91  177:getstatic       #56  <Field kh g>
	//   92  180:aastore         
	//   93  181:dup             
	//   94  182:bipush          7
	//   95  184:getstatic       #60  <Field kh h>
	//   96  187:aastore         
	//   97  188:dup             
	//   98  189:bipush          8
	//   99  191:getstatic       #64  <Field kh i>
	//  100  194:aastore         
	//  101  195:putstatic       #66  <Field kh[] l>
	//  102  198:new             #68  <Class kl>
	//  103  201:dup             
	//  104  202:invokespecial   #70  <Method void kl()>
	//  105  205:putstatic       #72  <Field cc j>
	//* 106  208:return          
	}
}
