// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bdq, bds, bdr

public abstract class bdp
{

	public bdp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	private final bds a(int i, bds bds1)
	{
		return a(i, bds1, false, 0L);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:lconst_0        
	//    5    5:invokevirtual   #21  <Method bds a(int, bds, boolean, long)>
	//    6    8:areturn         
	}

	public final int a(int i, bdr bdr, bds bds1, int j)
	{
		a(i, bdr, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #25  <Method bdr a(int, bdr, boolean)>
	//    5    7:pop             
		int k = a(0, bds1).c;
	//    6    8:aload_0         
	//    7    9:iconst_0        
	//    8   10:aload_3         
	//    9   11:invokespecial   #27  <Method bds a(int, bds)>
	//   10   14:getfield        #33  <Field int bds.c>
	//   11   17:istore          6
		boolean flag = true;
	//   12   19:iconst_1        
	//   13   20:istore          5
		if(k == i)
	//*  14   22:iload           6
	//*  15   24:iload_1         
	//*  16   25:icmpne          116
		{
			switch(j)
	//*  17   28:iload           4
			{
	//*  18   30:tableswitch     0 2: default 56
	//	               0 86
	//	               1 81
	//	               2 64
			default:
				throw new IllegalStateException();
	//   19   56:new             #35  <Class IllegalStateException>
	//   20   59:dup             
	//   21   60:invokespecial   #36  <Method void IllegalStateException()>
	//   22   63:athrow          

			case 2: // '\002'
				i = ((int) (flag));
	//   23   64:iload           5
	//   24   66:istore_1        
				if(b() - 1 == 0)
	//*  25   67:aload_0         
	//*  26   68:invokevirtual   #40  <Method int b()>
	//*  27   71:iconst_1        
	//*  28   72:isub            
	//*  29   73:ifne            100
					i = 0;
	//   30   76:iconst_0        
	//   31   77:istore_1        
				break;

	//*  32   78:goto            100
			case 1: // '\001'
				i = 0;
	//   33   81:iconst_0        
	//   34   82:istore_1        
				break;

	//*  35   83:goto            100
			case 0: // '\0'
				i = ((int) (flag));
	//   36   86:iload           5
	//   37   88:istore_1        
				if(b() - 1 == 0)
	//*  38   89:aload_0         
	//*  39   90:invokevirtual   #40  <Method int b()>
	//*  40   93:iconst_1        
	//*  41   94:isub            
	//*  42   95:ifne            100
					i = -1;
	//   43   98:iconst_m1       
	//   44   99:istore_1        
				break;
			}
			if(i == -1)
	//*  45  100:iload_1         
	//*  46  101:iconst_m1       
	//*  47  102:icmpne          107
			{
				return -1;
	//   48  105:iconst_m1       
	//   49  106:ireturn         
			} else
			{
				a(i, bds1);
	//   50  107:aload_0         
	//   51  108:iload_1         
	//   52  109:aload_3         
	//   53  110:invokespecial   #27  <Method bds a(int, bds)>
	//   54  113:pop             
				return 0;
	//   55  114:iconst_0        
	//   56  115:ireturn         
			}
		} else
		{
			return i + 1;
	//   57  116:iload_1         
	//   58  117:iconst_1        
	//   59  118:iadd            
	//   60  119:ireturn         
		}
	}

	public abstract int a(Object obj);

	public abstract bdr a(int i, bdr bdr, boolean flag);

	public abstract bds a(int i, bds bds1, boolean flag, long l);

	public final boolean a()
	{
		return b() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method int b()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public abstract int b();

	public abstract int c();

	public static final bdp a = new bdq();

	static 
	{
	//    0    0:new             #10  <Class bdq>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void bdq()>
	//    3    7:putstatic       #15  <Field bdp a>
	//*   4   10:return          
	}
}
