// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			GenericLifecycleObserver, MethodCallsLogger, GeneratedAdapter, LifecycleOwner

public class CompositeGeneratedAdaptersObserver
	implements GenericLifecycleObserver
{

	CompositeGeneratedAdaptersObserver(GeneratedAdapter ageneratedadapter[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mGeneratedAdapters = ageneratedadapter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field GeneratedAdapter[] mGeneratedAdapters>
	//    5    9:return          
	}

	public void onStateChanged(LifecycleOwner lifecycleowner, Lifecycle.Event event)
	{
		MethodCallsLogger methodcallslogger = new MethodCallsLogger();
	//    0    0:new             #24  <Class MethodCallsLogger>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void MethodCallsLogger()>
	//    3    7:astore          6
		GeneratedAdapter ageneratedadapter[] = mGeneratedAdapters;
	//    4    9:aload_0         
	//    5   10:getfield        #19  <Field GeneratedAdapter[] mGeneratedAdapters>
	//    6   13:astore          7
		int k = ageneratedadapter.length;
	//    7   15:aload           7
	//    8   17:arraylength     
	//    9   18:istore          5
		boolean flag = false;
	//   10   20:iconst_0        
	//   11   21:istore          4
		for(int i = 0; i < k; i++)
	//*  12   23:iconst_0        
	//*  13   24:istore_3        
	//*  14   25:iload_3         
	//*  15   26:iload           5
	//*  16   28:icmpge          52
			ageneratedadapter[i].callMethods(lifecycleowner, event, false, methodcallslogger);
	//   17   31:aload           7
	//   18   33:iload_3         
	//   19   34:aaload          
	//   20   35:aload_1         
	//   21   36:aload_2         
	//   22   37:iconst_0        
	//   23   38:aload           6
	//   24   40:invokeinterface #31  <Method void GeneratedAdapter.callMethods(LifecycleOwner, Lifecycle$Event, boolean, MethodCallsLogger)>

	//   25   45:iload_3         
	//   26   46:iconst_1        
	//   27   47:iadd            
	//   28   48:istore_3        
	//*  29   49:goto            25
		ageneratedadapter = mGeneratedAdapters;
	//   30   52:aload_0         
	//   31   53:getfield        #19  <Field GeneratedAdapter[] mGeneratedAdapters>
	//   32   56:astore          7
		k = ageneratedadapter.length;
	//   33   58:aload           7
	//   34   60:arraylength     
	//   35   61:istore          5
		for(int j = ((int) (flag)); j < k; j++)
	//*  36   63:iload           4
	//*  37   65:istore_3        
	//*  38   66:iload_3         
	//*  39   67:iload           5
	//*  40   69:icmpge          93
			ageneratedadapter[j].callMethods(lifecycleowner, event, true, methodcallslogger);
	//   41   72:aload           7
	//   42   74:iload_3         
	//   43   75:aaload          
	//   44   76:aload_1         
	//   45   77:aload_2         
	//   46   78:iconst_1        
	//   47   79:aload           6
	//   48   81:invokeinterface #31  <Method void GeneratedAdapter.callMethods(LifecycleOwner, Lifecycle$Event, boolean, MethodCallsLogger)>

	//   49   86:iload_3         
	//   50   87:iconst_1        
	//   51   88:iadd            
	//   52   89:istore_3        
	//*  53   90:goto            66
	//   54   93:return          
	}

	private final GeneratedAdapter mGeneratedAdapters[];
}
