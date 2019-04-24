// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import java.util.Comparator;

// Referenced classes of package android.support.v7.widget:
//			GapWorker

static final class GapWorker$1
	implements Comparator
{

	public int compare(sk sk, sk sk1)
	{
		int i;
		byte byte0;
		byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          5
		boolean flag1 = true;
	//    2    3:iconst_1        
	//    3    4:istore          6
		boolean flag;
		if(sk.view == null)
	//*   4    6:aload_1         
	//*   5    7:getfield        #22  <Field RecyclerView GapWorker$Task.view>
	//*   6   10:ifnonnull       43
			i = 1;
	//    7   13:iconst_1        
	//    8   14:istore_3        
		else
	//*   9   15:aload_2         
	//*  10   16:getfield        #22  <Field RecyclerView GapWorker$Task.view>
	//*  11   19:ifnonnull       48
	//*  12   22:iconst_1        
	//*  13   23:istore          4
	//*  14   25:iload_3         
	//*  15   26:iload           4
	//*  16   28:icmpeq          56
	//*  17   31:aload_1         
	//*  18   32:getfield        #22  <Field RecyclerView GapWorker$Task.view>
	//*  19   35:ifnonnull       54
	//*  20   38:iload           6
	//*  21   40:istore_3        
	//*  22   41:iload_3         
	//*  23   42:ireturn         
			i = 0;
	//   24   43:iconst_0        
	//   25   44:istore_3        
		if(sk1.view == null)
			flag = true;
		else
	//*  26   45:goto            15
			flag = false;
	//   27   48:iconst_0        
	//   28   49:istore          4
		if(i == flag) goto _L2; else goto _L1
_L1:
		if(sk.view != null) goto _L4; else goto _L3
_L3:
		i = ((int) (flag1));
_L6:
		return i;
	//*  29   51:goto            25
_L4:
		return -1;
	//   30   54:iconst_m1       
	//   31   55:ireturn         
_L2:
		if(sk.immediate != sk1.immediate)
	//*  32   56:aload_1         
	//*  33   57:getfield        #26  <Field boolean GapWorker$Task.immediate>
	//*  34   60:aload_2         
	//*  35   61:getfield        #26  <Field boolean GapWorker$Task.immediate>
	//*  36   64:icmpeq          84
		{
			if(sk.immediate)
	//*  37   67:aload_1         
	//*  38   68:getfield        #26  <Field boolean GapWorker$Task.immediate>
	//*  39   71:ifeq            79
				i = ((int) (byte0));
	//   40   74:iload           5
	//   41   76:istore_3        
			else
	//*  42   77:iload_3         
	//*  43   78:ireturn         
				i = 1;
	//   44   79:iconst_1        
	//   45   80:istore_3        
			return i;
		}
	//*  46   81:goto            77
		int j = sk1.viewVelocity - sk.viewVelocity;
	//   47   84:aload_2         
	//   48   85:getfield        #30  <Field int GapWorker$Task.viewVelocity>
	//   49   88:aload_1         
	//   50   89:getfield        #30  <Field int GapWorker$Task.viewVelocity>
	//   51   92:isub            
	//   52   93:istore          4
		i = j;
	//   53   95:iload           4
	//   54   97:istore_3        
		if(j == 0)
	//*  55   98:iload           4
	//*  56  100:ifne            41
		{
			int k = sk.distanceToItem - sk1.distanceToItem;
	//   57  103:aload_1         
	//   58  104:getfield        #33  <Field int GapWorker$Task.distanceToItem>
	//   59  107:aload_2         
	//   60  108:getfield        #33  <Field int GapWorker$Task.distanceToItem>
	//   61  111:isub            
	//   62  112:istore          4
			i = k;
	//   63  114:iload           4
	//   64  116:istore_3        
			if(k == 0)
	//*  65  117:iload           4
	//*  66  119:ifne            41
				return 0;
	//   67  122:iconst_0        
	//   68  123:ireturn         
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((sk)obj, (sk)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class GapWorker$Task>
	//    3    5:aload_2         
	//    4    6:checkcast       #18  <Class GapWorker$Task>
	//    5    9:invokevirtual   #36  <Method int compare(GapWorker$Task, GapWorker$Task)>
	//    6   12:ireturn         
	}

	GapWorker$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
