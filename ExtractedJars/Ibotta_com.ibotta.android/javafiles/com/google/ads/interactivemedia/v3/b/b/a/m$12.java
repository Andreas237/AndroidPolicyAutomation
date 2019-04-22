// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.d.*;
import com.google.ads.interactivemedia.v3.b.t;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;
import java.util.BitSet;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$12 extends w
{

	public BitSet a(a a1)
		throws IOException
	{
		if(a1.f() == b.i)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #24  <Method b a.f()>
	//*   2    4:getstatic       #30  <Field b b.i>
	//*   3    7:if_acmpne       16
		{
			a1.j();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #33  <Method void a.j()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		BitSet bitset = new BitSet();
	//    8   16:new             #35  <Class BitSet>
	//    9   19:dup             
	//   10   20:invokespecial   #36  <Method void BitSet()>
	//   11   23:astore          6
		a1.a();
	//   12   25:aload_1         
	//   13   26:invokevirtual   #38  <Method void a.a()>
		Object obj = ((Object) (a1.f()));
	//   14   29:aload_1         
	//   15   30:invokevirtual   #24  <Method b a.f()>
	//   16   33:astore          5
		int i = 0;
	//   17   35:iconst_0        
	//   18   36:istore_2        
		for(; obj != b.b; obj = ((Object) (a1.f())))
	//*  19   37:aload           5
	//*  20   39:getstatic       #41  <Field b b.b>
	//*  21   42:if_acmpeq       250
		{
			int j = com.google.ads.interactivemedia.v3.b.b.a.m$26.a[((b) (obj)).ordinal()];
	//   22   45:getstatic       #46  <Field int[] com.google.ads.interactivemedia.v3.b.b.a.m$26.a>
	//   23   48:aload           5
	//   24   50:invokevirtual   #50  <Method int b.ordinal()>
	//   25   53:iaload          
	//   26   54:istore_3        
			boolean flag = true;
	//   27   55:iconst_1        
	//   28   56:istore          4
			switch(j)
	//*  29   58:iload_3         
			{
	//*  30   59:tableswitch     1 3: default 84
	//	               1 213
	//	               2 204
	//	               3 137
			default:
				a1 = ((a) (String.valueOf(obj)));
	//   31   84:aload           5
	//   32   86:invokestatic    #56  <Method String String.valueOf(Object)>
	//   33   89:astore_1        
				obj = ((Object) (new StringBuilder(String.valueOf(((Object) (a1))).length() + 27)));
	//   34   90:new             #58  <Class StringBuilder>
	//   35   93:dup             
	//   36   94:aload_1         
	//   37   95:invokestatic    #56  <Method String String.valueOf(Object)>
	//   38   98:invokevirtual   #61  <Method int String.length()>
	//   39  101:bipush          27
	//   40  103:iadd            
	//   41  104:invokespecial   #64  <Method void StringBuilder(int)>
	//   42  107:astore          5
				((StringBuilder) (obj)).append("Invalid bitset value type: ");
	//   43  109:aload           5
	//   44  111:ldc1            #66  <String "Invalid bitset value type: ">
	//   45  113:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   46  116:pop             
				((StringBuilder) (obj)).append(((String) (a1)));
	//   47  117:aload           5
	//   48  119:aload_1         
	//   49  120:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   50  123:pop             
				throw new t(((StringBuilder) (obj)).toString());
	//   51  124:new             #72  <Class t>
	//   52  127:dup             
	//   53  128:aload           5
	//   54  130:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   55  133:invokespecial   #79  <Method void t(String)>
	//   56  136:athrow          

			case 3: // '\003'
				obj = ((Object) (a1.h()));
	//   57  137:aload_1         
	//   58  138:invokevirtual   #82  <Method String a.h()>
	//   59  141:astore          5
				int k;
				try
				{
					k = Integer.parseInt(((String) (obj)));
	//   60  143:aload           5
	//   61  145:invokestatic    #88  <Method int Integer.parseInt(String)>
	//   62  148:istore_3        
				}
	//*  63  149:iload_3         
	//*  64  150:ifeq            156
	//*  65  153:goto            226
	//*  66  156:iconst_0        
	//*  67  157:istore          4
	//*  68  159:goto            226
	//*  69  162:aload           5
	//*  70  164:invokestatic    #56  <Method String String.valueOf(Object)>
	//*  71  167:astore_1        
	//*  72  168:aload_1         
	//*  73  169:invokevirtual   #61  <Method int String.length()>
	//*  74  172:ifeq            185
	//*  75  175:ldc1            #90  <String "Error: Expecting: bitset number value (1, 0), Found: ">
	//*  76  177:aload_1         
	//*  77  178:invokevirtual   #94  <Method String String.concat(String)>
	//*  78  181:astore_1        
	//*  79  182:goto            195
	//*  80  185:new             #52  <Class String>
	//*  81  188:dup             
	//*  82  189:ldc1            #90  <String "Error: Expecting: bitset number value (1, 0), Found: ">
	//*  83  191:invokespecial   #95  <Method void String(String)>
	//*  84  194:astore_1        
	//*  85  195:new             #72  <Class t>
	//*  86  198:dup             
	//*  87  199:aload_1         
	//*  88  200:invokespecial   #79  <Method void t(String)>
	//*  89  203:athrow          
	//*  90  204:aload_1         
	//*  91  205:invokevirtual   #98  <Method boolean a.i()>
	//*  92  208:istore          4
	//*  93  210:goto            226
	//*  94  213:aload_1         
	//*  95  214:invokevirtual   #101 <Method int a.m()>
	//*  96  217:ifeq            223
	//*  97  220:goto            226
	//*  98  223:iconst_0        
	//*  99  224:istore          4
	//* 100  226:iload           4
	//* 101  228:ifeq            237
	//* 102  231:aload           6
	//* 103  233:iload_2         
	//* 104  234:invokevirtual   #104 <Method void BitSet.set(int)>
	//* 105  237:iload_2         
	//* 106  238:iconst_1        
	//* 107  239:iadd            
	//* 108  240:istore_2        
	//* 109  241:aload_1         
	//* 110  242:invokevirtual   #24  <Method b a.f()>
	//* 111  245:astore          5
	//* 112  247:goto            37
	//* 113  250:aload_1         
	//* 114  251:invokevirtual   #106 <Method void a.b()>
	//* 115  254:aload           6
	//* 116  256:areturn         
				// Misplaced declaration of an exception variable
				catch(a a1)
				{
					a1 = ((a) (String.valueOf(obj)));
					if(((String) (a1)).length() != 0)
						a1 = ((a) ("Error: Expecting: bitset number value (1, 0), Found: ".concat(((String) (a1)))));
					else
						a1 = ((a) (new String("Error: Expecting: bitset number value (1, 0), Found: ")));
					throw new t(((String) (a1)));
				}
				if(k == 0)
					flag = false;
				break;

			case 2: // '\002'
				flag = a1.i();
				break;

			case 1: // '\001'
				if(a1.m() == 0)
					flag = false;
				break;
			}
			if(flag)
				bitset.set(i);
			i++;
		}

		a1.b();
		return bitset;
	//* 117  257:astore_1        
	//* 118  258:goto            162
	}

	public void a(c c, BitSet bitset)
		throws IOException
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:539)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #110 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #112 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:539)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #115 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #119 <Method BitSet a(a)>
	//    3    5:areturn         
	}

	public void write(c c, Object obj)
		throws IOException
	{
		a(c, (BitSet)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #35  <Class BitSet>
	//    4    6:invokevirtual   #123 <Method void a(c, BitSet)>
	//    5    9:return          
	}

	m$12()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void w()>
	//    2    4:return          
	}
}
