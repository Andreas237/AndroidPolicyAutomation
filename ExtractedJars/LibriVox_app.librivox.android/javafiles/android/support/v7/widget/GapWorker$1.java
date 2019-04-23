// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import java.util.Comparator;

final class GapWorker$1
	implements Comparator
{

	public int compare(sk sk, sk sk1)
	{
		RecyclerView recyclerview = sk.view;
	//    0    0:aload_1         
	//    1    1:getfield        #19  <Field RecyclerView GapWorker$Task.view>
	//    2    4:astore          6
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          5
		int i;
		if(recyclerview == null)
	//*   5    9:aload           6
	//*   6   11:ifnonnull       19
			i = 1;
	//    7   14:iconst_1        
	//    8   15:istore_3        
		else
	//*   9   16:goto            21
			i = 0;
	//   10   19:iconst_0        
	//   11   20:istore_3        
		boolean flag;
		if(sk1.view == null)
	//*  12   21:aload_2         
	//*  13   22:getfield        #19  <Field RecyclerView GapWorker$Task.view>
	//*  14   25:ifnonnull       34
			flag = true;
	//   15   28:iconst_1        
	//   16   29:istore          4
		else
	//*  17   31:goto            37
			flag = false;
	//   18   34:iconst_0        
	//   19   35:istore          4
		if(i != flag)
	//*  20   37:iload_3         
	//*  21   38:iload           4
	//*  22   40:icmpeq          54
			return sk.view != null ? -1 : 1;
	//   23   43:aload_1         
	//   24   44:getfield        #19  <Field RecyclerView GapWorker$Task.view>
	//   25   47:ifnonnull       52
	//   26   50:iconst_1        
	//   27   51:ireturn         
	//   28   52:iconst_m1       
	//   29   53:ireturn         
		if(sk.immediate != sk1.immediate)
	//*  30   54:aload_1         
	//*  31   55:getfield        #23  <Field boolean GapWorker$Task.immediate>
	//*  32   58:aload_2         
	//*  33   59:getfield        #23  <Field boolean GapWorker$Task.immediate>
	//*  34   62:icmpeq          79
		{
			i = ((int) (flag1));
	//   35   65:iload           5
	//   36   67:istore_3        
			if(sk.immediate)
	//*  37   68:aload_1         
	//*  38   69:getfield        #23  <Field boolean GapWorker$Task.immediate>
	//*  39   72:ifeq            77
				i = -1;
	//   40   75:iconst_m1       
	//   41   76:istore_3        
			return i;
	//   42   77:iload_3         
	//   43   78:ireturn         
		}
		i = sk1.viewVelocity - sk.viewVelocity;
	//   44   79:aload_2         
	//   45   80:getfield        #27  <Field int GapWorker$Task.viewVelocity>
	//   46   83:aload_1         
	//   47   84:getfield        #27  <Field int GapWorker$Task.viewVelocity>
	//   48   87:isub            
	//   49   88:istore_3        
		if(i != 0)
	//*  50   89:iload_3         
	//*  51   90:ifeq            95
			return i;
	//   52   93:iload_3         
	//   53   94:ireturn         
		i = sk.distanceToItem - sk1.distanceToItem;
	//   54   95:aload_1         
	//   55   96:getfield        #30  <Field int GapWorker$Task.distanceToItem>
	//   56   99:aload_2         
	//   57  100:getfield        #30  <Field int GapWorker$Task.distanceToItem>
	//   58  103:isub            
	//   59  104:istore_3        
		if(i != 0)
	//*  60  105:iload_3         
	//*  61  106:ifeq            111
			return i;
	//   62  109:iload_3         
	//   63  110:ireturn         
		else
			return 0;
	//   64  111:iconst_0        
	//   65  112:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((sk)obj, (sk)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #15  <Class GapWorker$Task>
	//    3    5:aload_2         
	//    4    6:checkcast       #15  <Class GapWorker$Task>
	//    5    9:invokevirtual   #33  <Method int compare(GapWorker$Task, GapWorker$Task)>
	//    6   12:ireturn         
	}

	GapWorker$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}
}
