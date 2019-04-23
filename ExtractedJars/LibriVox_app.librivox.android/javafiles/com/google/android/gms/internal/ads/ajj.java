// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			anr, anm, ans, ano, 
//			ant, amy, anu, asi, 
//			ash, aoi, and, ana

final class ajj
{

	public static anr a(anm anm1)
	{
		ans ans1 = anr.a().a(anm1.a());
	//    0    0:invokestatic    #25  <Method ans anr.a()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #30  <Method int anm.a()>
	//    3    7:invokevirtual   #35  <Method ans ans.a(int)>
	//    4   10:astore_1        
		ano ano1;
		for(anm1 = ((anm) (anm1.b().iterator())); ((Iterator) (anm1)).hasNext(); ans1.a((ant)(ash)((asi) (ant.a().a(ano1.b().a()).a(ano1.c()).a(ano1.e()).a(ano1.d()))).f()))
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #39  <Method List anm.b()>
	//*   7   15:invokeinterface #45  <Method Iterator List.iterator()>
	//*   8   20:astore_0        
	//*   9   21:aload_0         
	//*  10   22:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            91
			ano1 = (ano)((Iterator) (anm1)).next();
	//   12   30:aload_0         
	//   13   31:invokeinterface #55  <Method Object Iterator.next()>
	//   14   36:checkcast       #57  <Class ano>
	//   15   39:astore_2        

	//   16   40:aload_1         
	//   17   41:invokestatic    #62  <Method anu ant.a()>
	//   18   44:aload_2         
	//   19   45:invokevirtual   #65  <Method amy ano.b()>
	//   20   48:invokevirtual   #70  <Method String amy.a()>
	//   21   51:invokevirtual   #75  <Method anu anu.a(String)>
	//   22   54:aload_2         
	//   23   55:invokevirtual   #79  <Method and ano.c()>
	//   24   58:invokevirtual   #82  <Method anu anu.a(and)>
	//   25   61:aload_2         
	//   26   62:invokevirtual   #86  <Method aoi ano.e()>
	//   27   65:invokevirtual   #89  <Method anu anu.a(aoi)>
	//   28   68:aload_2         
	//   29   69:invokevirtual   #92  <Method int ano.d()>
	//   30   72:invokevirtual   #95  <Method anu anu.a(int)>
	//   31   75:invokevirtual   #101 <Method atv asi.f()>
	//   32   78:checkcast       #103 <Class ash>
	//   33   81:checkcast       #59  <Class ant>
	//   34   84:invokevirtual   #106 <Method ans ans.a(ant)>
	//   35   87:pop             
	//*  36   88:goto            21
		return (anr)(ash)((asi) (ans1)).f();
	//   37   91:aload_1         
	//   38   92:invokevirtual   #101 <Method atv asi.f()>
	//   39   95:checkcast       #103 <Class ash>
	//   40   98:checkcast       #22  <Class anr>
	//   41  101:areturn         
	}

	public static void b(anm anm1)
	{
		if(anm1.c() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #109 <Method int anm.c()>
	//*   2    4:ifeq            248
		{
			int i = anm1.a();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #30  <Method int anm.a()>
	//    5   11:istore          4
			anm1 = ((anm) (anm1.b().iterator()));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #39  <Method List anm.b()>
	//    8   17:invokeinterface #45  <Method Iterator List.iterator()>
	//    9   22:astore_0        
			boolean flag1 = false;
	//   10   23:iconst_0        
	//   11   24:istore_2        
			boolean flag = true;
	//   12   25:iconst_1        
	//   13   26:istore_1        
			while(((Iterator) (anm1)).hasNext()) 
	//*  14   27:aload_0         
	//*  15   28:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//*  16   33:ifeq            228
			{
				ano ano1 = (ano)((Iterator) (anm1)).next();
	//   17   36:aload_0         
	//   18   37:invokeinterface #55  <Method Object Iterator.next()>
	//   19   42:checkcast       #57  <Class ano>
	//   20   45:astore          5
				if(ano1.a())
	//*  21   47:aload           5
	//*  22   49:invokevirtual   #111 <Method boolean ano.a()>
	//*  23   52:ifeq            200
				{
					if(ano1.e() != aoi.a)
	//*  24   55:aload           5
	//*  25   57:invokevirtual   #86  <Method aoi ano.e()>
	//*  26   60:getstatic       #116 <Field aoi aoi.a>
	//*  27   63:if_acmpeq       172
					{
						if(ano1.c() != and.a)
	//*  28   66:aload           5
	//*  29   68:invokevirtual   #79  <Method and ano.c()>
	//*  30   71:getstatic       #121 <Field and and.a>
	//*  31   74:if_acmpeq       144
						{
							boolean flag2 = flag1;
	//   32   77:iload_2         
	//   33   78:istore_3        
							if(ano1.c() == and.b)
	//*  34   79:aload           5
	//*  35   81:invokevirtual   #79  <Method and ano.c()>
	//*  36   84:getstatic       #123 <Field and and.b>
	//*  37   87:if_acmpne       121
							{
								flag2 = flag1;
	//   38   90:iload_2         
	//   39   91:istore_3        
								if(ano1.d() == i)
	//*  40   92:aload           5
	//*  41   94:invokevirtual   #92  <Method int ano.d()>
	//*  42   97:iload           4
	//*  43   99:icmpne          121
									if(!flag1)
	//*  44  102:iload_2         
	//*  45  103:ifne            111
										flag2 = true;
	//   46  106:iconst_1        
	//   47  107:istore_3        
									else
	//*  48  108:goto            121
										throw new GeneralSecurityException("keyset contains multiple primary keys");
	//   49  111:new             #125 <Class GeneralSecurityException>
	//   50  114:dup             
	//   51  115:ldc1            #127 <String "keyset contains multiple primary keys">
	//   52  117:invokespecial   #131 <Method void GeneralSecurityException(String)>
	//   53  120:athrow          
							}
							flag1 = flag2;
	//   54  121:iload_3         
	//   55  122:istore_2        
							if(ano1.b().c() != ana.d)
	//*  56  123:aload           5
	//*  57  125:invokevirtual   #65  <Method amy ano.b()>
	//*  58  128:invokevirtual   #134 <Method ana amy.c()>
	//*  59  131:getstatic       #139 <Field ana ana.d>
	//*  60  134:if_acmpeq       27
							{
								flag = false;
	//   61  137:iconst_0        
	//   62  138:istore_1        
								flag1 = flag2;
	//   63  139:iload_3         
	//   64  140:istore_2        
							}
						} else
	//*  65  141:goto            27
						{
							throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[] {
								Integer.valueOf(ano1.d())
							}));
	//   66  144:new             #125 <Class GeneralSecurityException>
	//   67  147:dup             
	//   68  148:ldc1            #141 <String "key %d has unknown status">
	//   69  150:iconst_1        
	//   70  151:anewarray       Object[]
	//   71  154:dup             
	//   72  155:iconst_0        
	//   73  156:aload           5
	//   74  158:invokevirtual   #92  <Method int ano.d()>
	//   75  161:invokestatic    #147 <Method Integer Integer.valueOf(int)>
	//   76  164:aastore         
	//   77  165:invokestatic    #153 <Method String String.format(String, Object[])>
	//   78  168:invokespecial   #131 <Method void GeneralSecurityException(String)>
	//   79  171:athrow          
						}
					} else
					{
						throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[] {
							Integer.valueOf(ano1.d())
						}));
	//   80  172:new             #125 <Class GeneralSecurityException>
	//   81  175:dup             
	//   82  176:ldc1            #155 <String "key %d has unknown prefix">
	//   83  178:iconst_1        
	//   84  179:anewarray       Object[]
	//   85  182:dup             
	//   86  183:iconst_0        
	//   87  184:aload           5
	//   88  186:invokevirtual   #92  <Method int ano.d()>
	//   89  189:invokestatic    #147 <Method Integer Integer.valueOf(int)>
	//   90  192:aastore         
	//   91  193:invokestatic    #153 <Method String String.format(String, Object[])>
	//   92  196:invokespecial   #131 <Method void GeneralSecurityException(String)>
	//   93  199:athrow          
					}
				} else
				{
					throw new GeneralSecurityException(String.format("key %d has no key data", new Object[] {
						Integer.valueOf(ano1.d())
					}));
	//   94  200:new             #125 <Class GeneralSecurityException>
	//   95  203:dup             
	//   96  204:ldc1            #157 <String "key %d has no key data">
	//   97  206:iconst_1        
	//   98  207:anewarray       Object[]
	//   99  210:dup             
	//  100  211:iconst_0        
	//  101  212:aload           5
	//  102  214:invokevirtual   #92  <Method int ano.d()>
	//  103  217:invokestatic    #147 <Method Integer Integer.valueOf(int)>
	//  104  220:aastore         
	//  105  221:invokestatic    #153 <Method String String.format(String, Object[])>
	//  106  224:invokespecial   #131 <Method void GeneralSecurityException(String)>
	//  107  227:athrow          
				}
			}
			if(!flag1)
	//* 108  228:iload_2         
	//* 109  229:ifne            247
			{
				if(flag)
	//* 110  232:iload_1         
	//* 111  233:ifeq            237
					return;
	//  112  236:return          
				else
					throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
	//  113  237:new             #125 <Class GeneralSecurityException>
	//  114  240:dup             
	//  115  241:ldc1            #159 <String "keyset doesn't contain a valid primary key">
	//  116  243:invokespecial   #131 <Method void GeneralSecurityException(String)>
	//  117  246:athrow          
			} else
			{
				return;
	//  118  247:return          
			}
		} else
		{
			throw new GeneralSecurityException("empty keyset");
	//  119  248:new             #125 <Class GeneralSecurityException>
	//  120  251:dup             
	//  121  252:ldc1            #161 <String "empty keyset">
	//  122  254:invokespecial   #131 <Method void GeneralSecurityException(String)>
	//  123  257:athrow          
		}
	}

	private static final Charset a = Charset.forName("UTF-8");

	static 
	{
	//    0    0:ldc1            #10  <String "UTF-8">
	//    1    2:invokestatic    #16  <Method Charset Charset.forName(String)>
	//    2    5:putstatic       #18  <Field Charset a>
	//*   3    8:return          
	}
}
