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
		byte byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          5
		int i;
		boolean flag;
		if(sk.view == null)
	//*   2    3:aload_1         
	//*   3    4:getfield        #22  <Field RecyclerView GapWorker$Task.view>
	//*   4    7:ifnonnull       37
			i = 1;
	//    5   10:iconst_1        
	//    6   11:istore_3        
		else
	//*   7   12:aload_2         
	//*   8   13:getfield        #22  <Field RecyclerView GapWorker$Task.view>
	//*   9   16:ifnonnull       42
	//*  10   19:iconst_1        
	//*  11   20:istore          4
	//*  12   22:iload_3         
	//*  13   23:iload           4
	//*  14   25:icmpeq          50
	//*  15   28:aload_1         
	//*  16   29:getfield        #22  <Field RecyclerView GapWorker$Task.view>
	//*  17   32:ifnonnull       48
	//*  18   35:iconst_1        
	//*  19   36:ireturn         
			i = 0;
	//   20   37:iconst_0        
	//   21   38:istore_3        
		if(sk1.view == null)
			flag = true;
		else
	//*  22   39:goto            12
			flag = false;
	//   23   42:iconst_0        
	//   24   43:istore          4
		if(i != flag)
			return sk.view != null ? -1 : 1;
	//   25   45:goto            22
	//   26   48:iconst_m1       
	//   27   49:ireturn         
		if(sk.immediate != sk1.immediate)
	//*  28   50:aload_1         
	//*  29   51:getfield        #26  <Field boolean GapWorker$Task.immediate>
	//*  30   54:aload_2         
	//*  31   55:getfield        #26  <Field boolean GapWorker$Task.immediate>
	//*  32   58:icmpeq          78
		{
			if(sk.immediate)
	//*  33   61:aload_1         
	//*  34   62:getfield        #26  <Field boolean GapWorker$Task.immediate>
	//*  35   65:ifeq            73
				i = ((int) (byte0));
	//   36   68:iload           5
	//   37   70:istore_3        
			else
	//*  38   71:iload_3         
	//*  39   72:ireturn         
				i = 1;
	//   40   73:iconst_1        
	//   41   74:istore_3        
			return i;
		}
	//*  42   75:goto            71
		i = sk1.viewVelocity - sk.viewVelocity;
	//   43   78:aload_2         
	//   44   79:getfield        #30  <Field int GapWorker$Task.viewVelocity>
	//   45   82:aload_1         
	//   46   83:getfield        #30  <Field int GapWorker$Task.viewVelocity>
	//   47   86:isub            
	//   48   87:istore_3        
		if(i != 0)
	//*  49   88:iload_3         
	//*  50   89:ifeq            94
			return i;
	//   51   92:iload_3         
	//   52   93:ireturn         
		i = sk.distanceToItem - sk1.distanceToItem;
	//   53   94:aload_1         
	//   54   95:getfield        #33  <Field int GapWorker$Task.distanceToItem>
	//   55   98:aload_2         
	//   56   99:getfield        #33  <Field int GapWorker$Task.distanceToItem>
	//   57  102:isub            
	//   58  103:istore_3        
		if(i != 0)
	//*  59  104:iload_3         
	//*  60  105:ifeq            110
			return i;
	//   61  108:iload_3         
	//   62  109:ireturn         
		else
			return 0;
	//   63  110:iconst_0        
	//   64  111:ireturn         
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
