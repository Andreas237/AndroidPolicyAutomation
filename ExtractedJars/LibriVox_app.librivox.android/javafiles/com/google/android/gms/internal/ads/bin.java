// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bjj

public final class bin
	implements bjj
{

	public bin(bjj abjj[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = abjj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field bjj[] a>
	//    5    9:return          
	}

	public final boolean a(long l)
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          9
		boolean flag;
		boolean flag3;
		do
		{
			long l1 = r_();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #21  <Method long r_()>
	//    4    7:lstore          7
			flag3 = flag2;
	//    5    9:iload           9
	//    6   11:istore          10
			if(l1 == 0x0L)
				break;
	//    7   13:lload           7
	//    8   15:ldc2w           #22  <Long 0x0L>
	//    9   18:lcmp            
	//   10   19:ifeq            107
			bjj abjj[] = a;
	//   11   22:aload_0         
	//   12   23:getfield        #15  <Field bjj[] a>
	//   13   26:astore          11
			int j = abjj.length;
	//   14   28:aload           11
	//   15   30:arraylength     
	//   16   31:istore          6
			int i = 0;
	//   17   33:iconst_0        
	//   18   34:istore_3        
			boolean flag1;
			for(flag = false; i < j; flag = flag1)
	//*  19   35:iconst_0        
	//*  20   36:istore          4
	//*  21   38:iload_3         
	//*  22   39:iload           6
	//*  23   41:icmpge          91
			{
				bjj bjj1 = abjj[i];
	//   24   44:aload           11
	//   25   46:iload_3         
	//   26   47:aaload          
	//   27   48:astore          12
				flag1 = flag;
	//   28   50:iload           4
	//   29   52:istore          5
				if(bjj1.r_() == l1)
	//*  30   54:aload           12
	//*  31   56:invokeinterface #24  <Method long bjj.r_()>
	//*  32   61:lload           7
	//*  33   63:lcmp            
	//*  34   64:ifne            80
					flag1 = flag | bjj1.a(l);
	//   35   67:iload           4
	//   36   69:aload           12
	//   37   71:lload_1         
	//   38   72:invokeinterface #26  <Method boolean bjj.a(long)>
	//   39   77:ior             
	//   40   78:istore          5
				i++;
	//   41   80:iload_3         
	//   42   81:iconst_1        
	//   43   82:iadd            
	//   44   83:istore_3        
			}

	//   45   84:iload           5
	//   46   86:istore          4
	//*  47   88:goto            38
			flag3 = flag2 | flag;
	//   48   91:iload           9
	//   49   93:iload           4
	//   50   95:ior             
	//   51   96:istore          10
			flag2 = flag3;
	//   52   98:iload           10
	//   53  100:istore          9
		} while(flag);
	//   54  102:iload           4
	//   55  104:ifne            3
		return flag3;
	//   56  107:iload           10
	//   57  109:ireturn         
	}

	public final long r_()
	{
		bjj abjj[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field bjj[] a>
	//    2    4:astore          9
		int j = abjj.length;
	//    3    6:aload           9
	//    4    8:arraylength     
	//    5    9:istore_2        
		int i = 0;
	//    6   10:iconst_0        
	//    7   11:istore_1        
		long l;
		long l1;
		for(l = 0xffffffffL; i < j; l = l1)
	//*   8   12:ldc2w           #27  <Long 0xffffffffL>
	//*   9   15:lstore_3        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          62
		{
			long l2 = abjj[i].r_();
	//   13   21:aload           9
	//   14   23:iload_1         
	//   15   24:aaload          
	//   16   25:invokeinterface #24  <Method long bjj.r_()>
	//   17   30:lstore          7
			l1 = l;
	//   18   32:lload_3         
	//   19   33:lstore          5
			if(l2 != 0x0L)
	//*  20   35:lload           7
	//*  21   37:ldc2w           #22  <Long 0x0L>
	//*  22   40:lcmp            
	//*  23   41:ifeq            52
				l1 = Math.min(l, l2);
	//   24   44:lload_3         
	//   25   45:lload           7
	//   26   47:invokestatic    #34  <Method long Math.min(long, long)>
	//   27   50:lstore          5
			i++;
	//   28   52:iload_1         
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore_1        
		}

	//   32   56:lload           5
	//   33   58:lstore_3        
	//*  34   59:goto            16
		if(l == 0xffffffffL)
	//*  35   62:lload_3         
	//*  36   63:ldc2w           #27  <Long 0xffffffffL>
	//*  37   66:lcmp            
	//*  38   67:ifne            74
			return 0x0L;
	//   39   70:ldc2w           #22  <Long 0x0L>
	//   40   73:lreturn         
		else
			return l;
	//   41   74:lload_3         
	//   42   75:lreturn         
	}

	private final bjj a[];
}
