// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wx, bre, bra

public final class brd
{

	private static long a(long l, int i)
	{
		if(i == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            6
			return 1L;
	//    2    4:lconst_1        
	//    3    5:lreturn         
		if(i == 1)
	//*   4    6:iload_2         
	//*   5    7:iconst_1        
	//*   6    8:icmpne          13
			return l;
	//    7   11:lload_0         
	//    8   12:lreturn         
		if(i % 2 == 0)
	//*   9   13:iload_2         
	//*  10   14:iconst_2        
	//*  11   15:irem            
	//*  12   16:ifne            37
			return a((l * l) % 0x4000ffffL, i / 2) % 0x4000ffffL;
	//   13   19:lload_0         
	//   14   20:lload_0         
	//   15   21:lmul            
	//   16   22:ldc2w           #9   <Long 0x4000ffffL>
	//   17   25:lrem            
	//   18   26:iload_2         
	//   19   27:iconst_2        
	//   20   28:idiv            
	//   21   29:invokestatic    #12  <Method long a(long, int)>
	//   22   32:ldc2w           #9   <Long 0x4000ffffL>
	//   23   35:lrem            
	//   24   36:lreturn         
		else
			return (l * (a((l * l) % 0x4000ffffL, i / 2) % 0x4000ffffL)) % 0x4000ffffL;
	//   25   37:lload_0         
	//   26   38:lload_0         
	//   27   39:lload_0         
	//   28   40:lmul            
	//   29   41:ldc2w           #9   <Long 0x4000ffffL>
	//   30   44:lrem            
	//   31   45:iload_2         
	//   32   46:iconst_2        
	//   33   47:idiv            
	//   34   48:invokestatic    #12  <Method long a(long, int)>
	//   35   51:ldc2w           #9   <Long 0x4000ffffL>
	//   36   54:lrem            
	//   37   55:lmul            
	//   38   56:ldc2w           #9   <Long 0x4000ffffL>
	//   39   59:lrem            
	//   40   60:lreturn         
	}

	private static String a(String as[], int i, int j)
	{
		int k = as.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_3        
		j += i;
	//    3    3:iload_2         
	//    4    4:iload_1         
	//    5    5:iadd            
	//    6    6:istore_2        
		if(k < j)
	//*   7    7:iload_3         
	//*   8    8:iload_2         
	//*   9    9:icmpge          20
		{
			wx.c("Unable to construct shingle");
	//   10   12:ldc1            #16  <String "Unable to construct shingle">
	//   11   14:invokestatic    #22  <Method void wx.c(String)>
			return "";
	//   12   17:ldc1            #24  <String "">
	//   13   19:areturn         
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   14   20:new             #26  <Class StringBuilder>
	//   15   23:dup             
	//   16   24:invokespecial   #30  <Method void StringBuilder()>
	//   17   27:astore          4
		do
		{
			int l = j - 1;
	//   18   29:iload_2         
	//   19   30:iconst_1        
	//   20   31:isub            
	//   21   32:istore_3        
			if(i < l)
	//*  22   33:iload_1         
	//*  23   34:iload_3         
	//*  24   35:icmpge          62
			{
				stringbuilder.append(as[i]);
	//   25   38:aload           4
	//   26   40:aload_0         
	//   27   41:iload_1         
	//   28   42:aaload          
	//   29   43:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   30   46:pop             
				stringbuilder.append(' ');
	//   31   47:aload           4
	//   32   49:bipush          32
	//   33   51:invokevirtual   #37  <Method StringBuilder StringBuilder.append(char)>
	//   34   54:pop             
				i++;
	//   35   55:iload_1         
	//   36   56:iconst_1        
	//   37   57:iadd            
	//   38   58:istore_1        
			} else
	//*  39   59:goto            29
			{
				stringbuilder.append(as[l]);
	//   40   62:aload           4
	//   41   64:aload_0         
	//   42   65:iload_3         
	//   43   66:aaload          
	//   44   67:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   45   70:pop             
				return stringbuilder.toString();
	//   46   71:aload           4
	//   47   73:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   48   76:areturn         
			}
		} while(true);
	}

	private static void a(int i, long l, String s, int j, PriorityQueue priorityqueue)
	{
		s = ((String) (new bre(l, s, j)));
	//    0    0:new             #44  <Class bre>
	//    1    3:dup             
	//    2    4:lload_1         
	//    3    5:aload_3         
	//    4    6:iload           4
	//    5    8:invokespecial   #47  <Method void bre(long, String, int)>
	//    6   11:astore_3        
		if(priorityqueue.size() == i && (((bre)priorityqueue.peek()).c > ((bre) (s)).c || ((bre)priorityqueue.peek()).a > ((bre) (s)).a))
	//*   7   12:aload           5
	//*   8   14:invokevirtual   #53  <Method int PriorityQueue.size()>
	//*   9   17:iload_0         
	//*  10   18:icmpne          59
	//*  11   21:aload           5
	//*  12   23:invokevirtual   #57  <Method Object PriorityQueue.peek()>
	//*  13   26:checkcast       #44  <Class bre>
	//*  14   29:getfield        #60  <Field int bre.c>
	//*  15   32:aload_3         
	//*  16   33:getfield        #60  <Field int bre.c>
	//*  17   36:icmpgt          58
	//*  18   39:aload           5
	//*  19   41:invokevirtual   #57  <Method Object PriorityQueue.peek()>
	//*  20   44:checkcast       #44  <Class bre>
	//*  21   47:getfield        #63  <Field long bre.a>
	//*  22   50:aload_3         
	//*  23   51:getfield        #63  <Field long bre.a>
	//*  24   54:lcmp            
	//*  25   55:ifle            59
			return;
	//   26   58:return          
		if(priorityqueue.contains(((Object) (s))))
	//*  27   59:aload           5
	//*  28   61:aload_3         
	//*  29   62:invokevirtual   #67  <Method boolean PriorityQueue.contains(Object)>
	//*  30   65:ifeq            69
			return;
	//   31   68:return          
		priorityqueue.add(((Object) (s)));
	//   32   69:aload           5
	//   33   71:aload_3         
	//   34   72:invokevirtual   #70  <Method boolean PriorityQueue.add(Object)>
	//   35   75:pop             
		if(priorityqueue.size() > i)
	//*  36   76:aload           5
	//*  37   78:invokevirtual   #53  <Method int PriorityQueue.size()>
	//*  38   81:iload_0         
	//*  39   82:icmple          91
			priorityqueue.poll();
	//   40   85:aload           5
	//   41   87:invokevirtual   #73  <Method Object PriorityQueue.poll()>
	//   42   90:pop             
	//   43   91:return          
	}

	public static void a(String as[], int i, int j, PriorityQueue priorityqueue)
	{
		if(as.length < j)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:iload_2         
	//*   3    3:icmpge          28
		{
			a(i, b(as, 0, as.length), a(as, 0, as.length), as.length, priorityqueue);
	//    4    6:iload_1         
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:aload_0         
	//    8   10:arraylength     
	//    9   11:invokestatic    #78  <Method long b(String[], int, int)>
	//   10   14:aload_0         
	//   11   15:iconst_0        
	//   12   16:aload_0         
	//   13   17:arraylength     
	//   14   18:invokestatic    #80  <Method String a(String[], int, int)>
	//   15   21:aload_0         
	//   16   22:arraylength     
	//   17   23:aload_3         
	//   18   24:invokestatic    #82  <Method void a(int, long, String, int, PriorityQueue)>
			return;
	//   19   27:return          
		}
		long l1 = b(as, 0, j);
	//   20   28:aload_0         
	//   21   29:iconst_0        
	//   22   30:iload_2         
	//   23   31:invokestatic    #78  <Method long b(String[], int, int)>
	//   24   34:lstore          7
		a(i, l1, a(as, 0, j), j, priorityqueue);
	//   25   36:iload_1         
	//   26   37:lload           7
	//   27   39:aload_0         
	//   28   40:iconst_0        
	//   29   41:iload_2         
	//   30   42:invokestatic    #80  <Method String a(String[], int, int)>
	//   31   45:iload_2         
	//   32   46:aload_3         
	//   33   47:invokestatic    #82  <Method void a(int, long, String, int, PriorityQueue)>
		long l2 = a(0x1001fffL, j - 1);
	//   34   50:ldc2w           #83  <Long 0x1001fffL>
	//   35   53:iload_2         
	//   36   54:iconst_1        
	//   37   55:isub            
	//   38   56:invokestatic    #12  <Method long a(long, int)>
	//   39   59:lstore          9
		for(int k = 1; k < (as.length - j) + 1; k++)
	//*  40   61:iconst_1        
	//*  41   62:istore          4
	//*  42   64:iload           4
	//*  43   66:aload_0         
	//*  44   67:arraylength     
	//*  45   68:iload_2         
	//*  46   69:isub            
	//*  47   70:iconst_1        
	//*  48   71:iadd            
	//*  49   72:icmpge          179
		{
			int l = bra.a(as[k - 1]);
	//   50   75:aload_0         
	//   51   76:iload           4
	//   52   78:iconst_1        
	//   53   79:isub            
	//   54   80:aaload          
	//   55   81:invokestatic    #89  <Method int bra.a(String)>
	//   56   84:istore          5
			int i1 = bra.a(as[(k + j) - 1]);
	//   57   86:aload_0         
	//   58   87:iload           4
	//   59   89:iload_2         
	//   60   90:iadd            
	//   61   91:iconst_1        
	//   62   92:isub            
	//   63   93:aaload          
	//   64   94:invokestatic    #89  <Method int bra.a(String)>
	//   65   97:istore          6
			l1 = (((((l1 + 0x4000ffffL) - ((((long)l + 0x7fffffffL) % 0x4000ffffL) * l2) % 0x4000ffffL) % 0x4000ffffL) * 0x1001fffL) % 0x4000ffffL + ((long)i1 + 0x7fffffffL) % 0x4000ffffL) % 0x4000ffffL;
	//   66   99:lload           7
	//   67  101:ldc2w           #9   <Long 0x4000ffffL>
	//   68  104:ladd            
	//   69  105:iload           5
	//   70  107:i2l             
	//   71  108:ldc2w           #90  <Long 0x7fffffffL>
	//   72  111:ladd            
	//   73  112:ldc2w           #9   <Long 0x4000ffffL>
	//   74  115:lrem            
	//   75  116:lload           9
	//   76  118:lmul            
	//   77  119:ldc2w           #9   <Long 0x4000ffffL>
	//   78  122:lrem            
	//   79  123:lsub            
	//   80  124:ldc2w           #9   <Long 0x4000ffffL>
	//   81  127:lrem            
	//   82  128:ldc2w           #83  <Long 0x1001fffL>
	//   83  131:lmul            
	//   84  132:ldc2w           #9   <Long 0x4000ffffL>
	//   85  135:lrem            
	//   86  136:iload           6
	//   87  138:i2l             
	//   88  139:ldc2w           #90  <Long 0x7fffffffL>
	//   89  142:ladd            
	//   90  143:ldc2w           #9   <Long 0x4000ffffL>
	//   91  146:lrem            
	//   92  147:ladd            
	//   93  148:ldc2w           #9   <Long 0x4000ffffL>
	//   94  151:lrem            
	//   95  152:lstore          7
			a(i, l1, a(as, k, j), as.length, priorityqueue);
	//   96  154:iload_1         
	//   97  155:lload           7
	//   98  157:aload_0         
	//   99  158:iload           4
	//  100  160:iload_2         
	//  101  161:invokestatic    #80  <Method String a(String[], int, int)>
	//  102  164:aload_0         
	//  103  165:arraylength     
	//  104  166:aload_3         
	//  105  167:invokestatic    #82  <Method void a(int, long, String, int, PriorityQueue)>
		}

	//  106  170:iload           4
	//  107  172:iconst_1        
	//  108  173:iadd            
	//  109  174:istore          4
	//* 110  176:goto            64
	//  111  179:return          
	}

	private static long b(String as[], int i, int j)
	{
		long l = ((long)bra.a(as[0]) + 0x7fffffffL) % 0x4000ffffL;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aaload          
	//    3    3:invokestatic    #89  <Method int bra.a(String)>
	//    4    6:i2l             
	//    5    7:ldc2w           #90  <Long 0x7fffffffL>
	//    6   10:ladd            
	//    7   11:ldc2w           #9   <Long 0x4000ffffL>
	//    8   14:lrem            
	//    9   15:lstore_3        
		for(i = 1; i < j; i++)
	//*  10   16:iconst_1        
	//*  11   17:istore_1        
	//*  12   18:iload_1         
	//*  13   19:iload_2         
	//*  14   20:icmpge          60
			l = ((l * 0x1001fffL) % 0x4000ffffL + ((long)bra.a(as[i]) + 0x7fffffffL) % 0x4000ffffL) % 0x4000ffffL;
	//   15   23:lload_3         
	//   16   24:ldc2w           #83  <Long 0x1001fffL>
	//   17   27:lmul            
	//   18   28:ldc2w           #9   <Long 0x4000ffffL>
	//   19   31:lrem            
	//   20   32:aload_0         
	//   21   33:iload_1         
	//   22   34:aaload          
	//   23   35:invokestatic    #89  <Method int bra.a(String)>
	//   24   38:i2l             
	//   25   39:ldc2w           #90  <Long 0x7fffffffL>
	//   26   42:ladd            
	//   27   43:ldc2w           #9   <Long 0x4000ffffL>
	//   28   46:lrem            
	//   29   47:ladd            
	//   30   48:ldc2w           #9   <Long 0x4000ffffL>
	//   31   51:lrem            
	//   32   52:lstore_3        

	//   33   53:iload_1         
	//   34   54:iconst_1        
	//   35   55:iadd            
	//   36   56:istore_1        
	//*  37   57:goto            18
		return l;
	//   38   60:lload_3         
	//   39   61:lreturn         
	}
}
