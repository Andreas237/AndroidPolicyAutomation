// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.Log;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bno, bfw

public final class bls
{

	private static int a(bno bno1)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		int j;
		int k;
		do
		{
			if(bno1.b() == 0)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #12  <Method int bno.b()>
	//*   4    6:ifne            11
				return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
			k = bno1.f();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #15  <Method int bno.f()>
	//    9   15:istore_3        
			j = i + k;
	//   10   16:iload_1         
	//   11   17:iload_3         
	//   12   18:iadd            
	//   13   19:istore_2        
			i = j;
	//   14   20:iload_2         
	//   15   21:istore_1        
		} while(k == 255);
	//   16   22:iload_3         
	//   17   23:sipush          255
	//   18   26:icmpeq          2
		return j;
	//   19   29:iload_2         
	//   20   30:ireturn         
	}

	public static void a(long l, bno bno1, bfw abfw[])
	{
		while(bno1.b() > 1) 
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #12  <Method int bno.b()>
	//*   2    4:iconst_1        
	//*   3    5:icmple          275
		{
			int i = a(bno1);
	//    4    8:aload_2         
	//    5    9:invokestatic    #19  <Method int a(bno)>
	//    6   12:istore          4
			int j1 = a(bno1);
	//    7   14:aload_2         
	//    8   15:invokestatic    #19  <Method int a(bno)>
	//    9   18:istore          6
			if(j1 != -1 && j1 <= bno1.b())
	//*  10   20:iload           6
	//*  11   22:iconst_m1       
	//*  12   23:icmpeq          256
	//*  13   26:iload           6
	//*  14   28:aload_2         
	//*  15   29:invokevirtual   #12  <Method int bno.b()>
	//*  16   32:icmple          38
	//*  17   35:goto            256
			{
				boolean flag1 = false;
	//   18   38:iconst_0        
	//   19   39:istore          5
				boolean flag;
				if(i == 4 && j1 >= 8)
	//*  20   41:iload           4
	//*  21   43:iconst_4        
	//*  22   44:icmpne          133
	//*  23   47:iload           6
	//*  24   49:bipush          8
	//*  25   51:icmpge          57
	//*  26   54:goto            133
				{
					int j = bno1.d();
	//   27   57:aload_2         
	//   28   58:invokevirtual   #22  <Method int bno.d()>
	//   29   61:istore          4
					int k1 = bno1.f();
	//   30   63:aload_2         
	//   31   64:invokevirtual   #15  <Method int bno.f()>
	//   32   67:istore          7
					int i2 = bno1.g();
	//   33   69:aload_2         
	//   34   70:invokevirtual   #25  <Method int bno.g()>
	//   35   73:istore          8
					int k2 = bno1.l();
	//   36   75:aload_2         
	//   37   76:invokevirtual   #28  <Method int bno.l()>
	//   38   79:istore          9
					int i3 = bno1.f();
	//   39   81:aload_2         
	//   40   82:invokevirtual   #15  <Method int bno.f()>
	//   41   85:istore          10
					bno1.c(j);
	//   42   87:aload_2         
	//   43   88:iload           4
	//   44   90:invokevirtual   #32  <Method void bno.c(int)>
					if(k1 == 181 && i2 == 49 && k2 == 0x47413934 && i3 == 3)
	//*  45   93:iload           7
	//*  46   95:sipush          181
	//*  47   98:icmpne          127
	//*  48  101:iload           8
	//*  49  103:bipush          49
	//*  50  105:icmpne          127
	//*  51  108:iload           9
	//*  52  110:ldc1            #33  <Int 0x47413934>
	//*  53  112:icmpne          127
	//*  54  115:iload           10
	//*  55  117:iconst_3        
	//*  56  118:icmpne          127
						flag = true;
	//   57  121:iconst_1        
	//   58  122:istore          4
					else
	//*  59  124:goto            136
						flag = false;
	//   60  127:iconst_0        
	//   61  128:istore          4
				} else
	//*  62  130:goto            136
				{
					flag = false;
	//   63  133:iconst_0        
	//   64  134:istore          4
				}
				if(flag)
	//*  65  136:iload           4
	//*  66  138:ifeq            247
				{
					bno1.d(8);
	//   67  141:aload_2         
	//   68  142:bipush          8
	//   69  144:invokevirtual   #35  <Method void bno.d(int)>
					int k = bno1.f();
	//   70  147:aload_2         
	//   71  148:invokevirtual   #15  <Method int bno.f()>
	//   72  151:istore          4
					bno1.d(1);
	//   73  153:aload_2         
	//   74  154:iconst_1        
	//   75  155:invokevirtual   #35  <Method void bno.d(int)>
					int l1 = (k & 0x1f) * 3;
	//   76  158:iload           4
	//   77  160:bipush          31
	//   78  162:iand            
	//   79  163:iconst_3        
	//   80  164:imul            
	//   81  165:istore          7
					int j2 = bno1.d();
	//   82  167:aload_2         
	//   83  168:invokevirtual   #22  <Method int bno.d()>
	//   84  171:istore          8
					int l2 = abfw.length;
	//   85  173:aload_3         
	//   86  174:arraylength     
	//   87  175:istore          9
					for(int i1 = ((int) (flag1)); i1 < l2; i1++)
	//*  88  177:iload           5
	//*  89  179:istore          4
	//*  90  181:iload           4
	//*  91  183:iload           9
	//*  92  185:icmpge          232
					{
						bfw bfw1 = abfw[i1];
	//   93  188:aload_3         
	//   94  189:iload           4
	//   95  191:aaload          
	//   96  192:astore          11
						bno1.c(j2);
	//   97  194:aload_2         
	//   98  195:iload           8
	//   99  197:invokevirtual   #32  <Method void bno.c(int)>
						bfw1.a(bno1, l1);
	//  100  200:aload           11
	//  101  202:aload_2         
	//  102  203:iload           7
	//  103  205:invokeinterface #40  <Method void bfw.a(bno, int)>
						bfw1.a(l, 1, l1, 0, ((bfx) (null)));
	//  104  210:aload           11
	//  105  212:lload_0         
	//  106  213:iconst_1        
	//  107  214:iload           7
	//  108  216:iconst_0        
	//  109  217:aconst_null     
	//  110  218:invokeinterface #43  <Method void bfw.a(long, int, int, int, bfx)>
					}

	//  111  223:iload           4
	//  112  225:iconst_1        
	//  113  226:iadd            
	//  114  227:istore          4
	//* 115  229:goto            181
					bno1.d(j1 - (l1 + 10));
	//  116  232:aload_2         
	//  117  233:iload           6
	//  118  235:iload           7
	//  119  237:bipush          10
	//  120  239:iadd            
	//  121  240:isub            
	//  122  241:invokevirtual   #35  <Method void bno.d(int)>
				} else
	//* 123  244:goto            0
				{
					bno1.d(j1);
	//  124  247:aload_2         
	//  125  248:iload           6
	//  126  250:invokevirtual   #35  <Method void bno.d(int)>
				}
			} else
	//* 127  253:goto            0
			{
				Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
	//  128  256:ldc1            #45  <String "CeaUtil">
	//  129  258:ldc1            #47  <String "Skipping remainder of malformed SEI NAL unit.">
	//  130  260:invokestatic    #53  <Method int Log.w(String, String)>
	//  131  263:pop             
				bno1.c(bno1.c());
	//  132  264:aload_2         
	//  133  265:aload_2         
	//  134  266:invokevirtual   #55  <Method int bno.c()>
	//  135  269:invokevirtual   #32  <Method void bno.c(int)>
			}
		}
	//* 136  272:goto            0
	//  137  275:return          
	}
}
