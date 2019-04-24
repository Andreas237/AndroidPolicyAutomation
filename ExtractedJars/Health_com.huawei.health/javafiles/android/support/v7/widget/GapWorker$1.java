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
		if(sk.view == null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #22  <Field RecyclerView GapWorker$Task.view>
	//*   2    4:ifnonnull       12
			i = 1;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		boolean flag;
		if(sk1.view == null)
	//*   8   14:aload_2         
	//*   9   15:getfield        #22  <Field RecyclerView GapWorker$Task.view>
	//*  10   18:ifnonnull       27
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore          4
		else
	//*  13   24:goto            30
			flag = false;
	//   14   27:iconst_0        
	//   15   28:istore          4
		if(i != flag)
	//*  16   30:iload_3         
	//*  17   31:iload           4
	//*  18   33:icmpeq          47
			return sk.view != null ? -1 : 1;
	//   19   36:aload_1         
	//   20   37:getfield        #22  <Field RecyclerView GapWorker$Task.view>
	//   21   40:ifnonnull       45
	//   22   43:iconst_1        
	//   23   44:ireturn         
	//   24   45:iconst_m1       
	//   25   46:ireturn         
		if(sk.immediate != sk1.immediate)
	//*  26   47:aload_1         
	//*  27   48:getfield        #26  <Field boolean GapWorker$Task.immediate>
	//*  28   51:aload_2         
	//*  29   52:getfield        #26  <Field boolean GapWorker$Task.immediate>
	//*  30   55:icmpeq          69
			return !sk.immediate ? 1 : -1;
	//   31   58:aload_1         
	//   32   59:getfield        #26  <Field boolean GapWorker$Task.immediate>
	//   33   62:ifeq            67
	//   34   65:iconst_m1       
	//   35   66:ireturn         
	//   36   67:iconst_1        
	//   37   68:ireturn         
		i = sk1.viewVelocity - sk.viewVelocity;
	//   38   69:aload_2         
	//   39   70:getfield        #30  <Field int GapWorker$Task.viewVelocity>
	//   40   73:aload_1         
	//   41   74:getfield        #30  <Field int GapWorker$Task.viewVelocity>
	//   42   77:isub            
	//   43   78:istore_3        
		if(i != 0)
	//*  44   79:iload_3         
	//*  45   80:ifeq            85
			return i;
	//   46   83:iload_3         
	//   47   84:ireturn         
		i = sk.distanceToItem - sk1.distanceToItem;
	//   48   85:aload_1         
	//   49   86:getfield        #33  <Field int GapWorker$Task.distanceToItem>
	//   50   89:aload_2         
	//   51   90:getfield        #33  <Field int GapWorker$Task.distanceToItem>
	//   52   93:isub            
	//   53   94:istore_3        
		if(i != 0)
	//*  54   95:iload_3         
	//*  55   96:ifeq            101
			return i;
	//   56   99:iload_3         
	//   57  100:ireturn         
		else
			return 0;
	//   58  101:iconst_0        
	//   59  102:ireturn         
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
