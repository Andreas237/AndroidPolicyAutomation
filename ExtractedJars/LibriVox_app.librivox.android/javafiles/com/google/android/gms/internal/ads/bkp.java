// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			blc, bkx, ble, bks

final class bkp
{

	private bkp(boolean flag, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field boolean a>
		b = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #18  <Field long b>
		c = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #20  <Field long c>
	//   11   20:return          
	}

	public static bkp a(blc blc1, long l)
	{
		int j = blc1.c.size();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List blc.c>
	//    2    4:invokeinterface #33  <Method int List.size()>
	//    3    9:istore          5
		long l2 = 0xffffffffL;
	//    4   11:ldc2w           #34  <Long 0xffffffffL>
	//    5   14:lstore          10
		int i = 0;
	//    6   16:iconst_0        
	//    7   17:istore_3        
		boolean flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          4
		boolean flag1 = false;
	//   10   21:iconst_0        
	//   11   22:istore          12
		long l1 = 0L;
	//   12   24:lconst_0        
	//   13   25:lstore          8
		for(; i < j; i++)
	//*  14   27:iload_3         
	//*  15   28:iload           5
	//*  16   30:icmpge          203
		{
			bks bks1 = ((ble)((bkx)blc1.c.get(i)).c.get(0)).e();
	//   17   33:aload_0         
	//   18   34:getfield        #27  <Field List blc.c>
	//   19   37:iload_3         
	//   20   38:invokeinterface #39  <Method Object List.get(int)>
	//   21   43:checkcast       #41  <Class bkx>
	//   22   46:getfield        #42  <Field List bkx.c>
	//   23   49:iconst_0        
	//   24   50:invokeinterface #39  <Method Object List.get(int)>
	//   25   55:checkcast       #44  <Class ble>
	//   26   58:invokevirtual   #48  <Method bks ble.e()>
	//   27   61:astore          13
			if(bks1 == null)
	//*  28   63:aload           13
	//*  29   65:ifnonnull       79
				return new bkp(true, 0L, l);
	//   30   68:new             #2   <Class bkp>
	//   31   71:dup             
	//   32   72:iconst_1        
	//   33   73:lconst_0        
	//   34   74:lload_1         
	//   35   75:invokespecial   #50  <Method void bkp(boolean, long, long)>
	//   36   78:areturn         
			flag1 |= bks1.b();
	//   37   79:iload           12
	//   38   81:aload           13
	//   39   83:invokeinterface #55  <Method boolean bks.b()>
	//   40   88:ior             
	//   41   89:istore          12
			int k = bks1.a(l);
	//   42   91:aload           13
	//   43   93:lload_1         
	//   44   94:invokeinterface #58  <Method int bks.a(long)>
	//   45   99:istore          6
			if(k == 0)
	//*  46  101:iload           6
	//*  47  103:ifne            118
			{
				flag = true;
	//   48  106:iconst_1        
	//   49  107:istore          4
				l1 = 0L;
	//   50  109:lconst_0        
	//   51  110:lstore          8
				l2 = 0L;
	//   52  112:lconst_0        
	//   53  113:lstore          10
				continue;
	//   54  115:goto            196
			}
			if(flag)
				continue;
	//   55  118:iload           4
	//   56  120:ifne            196
			int i1 = bks1.a();
	//   57  123:aload           13
	//   58  125:invokeinterface #60  <Method int bks.a()>
	//   59  130:istore          7
			l1 = Math.max(l1, bks1.a(i1));
	//   60  132:lload           8
	//   61  134:aload           13
	//   62  136:iload           7
	//   63  138:invokeinterface #63  <Method long bks.a(int)>
	//   64  143:invokestatic    #69  <Method long Math.max(long, long)>
	//   65  146:lstore          8
			if(k != -1)
	//*  66  148:iload           6
	//*  67  150:iconst_m1       
	//*  68  151:icmpeq          193
			{
				k = (i1 + k) - 1;
	//   69  154:iload           7
	//   70  156:iload           6
	//   71  158:iadd            
	//   72  159:iconst_1        
	//   73  160:isub            
	//   74  161:istore          6
				l2 = Math.min(l2, bks1.a(k) + bks1.a(k, l));
	//   75  163:lload           10
	//   76  165:aload           13
	//   77  167:iload           6
	//   78  169:invokeinterface #63  <Method long bks.a(int)>
	//   79  174:aload           13
	//   80  176:iload           6
	//   81  178:lload_1         
	//   82  179:invokeinterface #72  <Method long bks.a(int, long)>
	//   83  184:ladd            
	//   84  185:invokestatic    #75  <Method long Math.min(long, long)>
	//   85  188:lstore          10
			}
		}

	//   86  190:goto            196
	//   87  193:goto            196
	//   88  196:iload_3         
	//   89  197:iconst_1        
	//   90  198:iadd            
	//   91  199:istore_3        
	//*  92  200:goto            27
		return new bkp(flag1, l1, l2);
	//   93  203:new             #2   <Class bkp>
	//   94  206:dup             
	//   95  207:iload           12
	//   96  209:lload           8
	//   97  211:lload           10
	//   98  213:invokespecial   #50  <Method void bkp(boolean, long, long)>
	//   99  216:areturn         
	}

	public final boolean a;
	public final long b;
	public final long c;
}
