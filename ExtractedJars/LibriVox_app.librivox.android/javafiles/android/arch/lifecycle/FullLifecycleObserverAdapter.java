// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			GenericLifecycleObserver, d, g, FullLifecycleObserver, 
//			j

class FullLifecycleObserverAdapter
	implements GenericLifecycleObserver
{

	FullLifecycleObserverAdapter(FullLifecycleObserver fulllifecycleobserver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = fulllifecycleobserver;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field FullLifecycleObserver a>
	//    5    9:return          
	}

	public void a(j j, g g1)
	{
		switch(d.a[g1.ordinal()])
	//*   0    0:getstatic       #22  <Field int[] d.a>
	//*   1    3:aload_2         
	//*   2    4:invokevirtual   #28  <Method int g.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 7: default 52
	//	               1 118
	//	               2 107
	//	               3 96
	//	               4 85
	//	               5 74
	//	               6 63
	//	               7 53
		default:
			return;
	//    5   52:return          

		case 7: // '\007'
			throw new IllegalArgumentException("ON_ANY must not been send by anybody");
	//    6   53:new             #30  <Class IllegalArgumentException>
	//    7   56:dup             
	//    8   57:ldc1            #32  <String "ON_ANY must not been send by anybody">
	//    9   59:invokespecial   #35  <Method void IllegalArgumentException(String)>
	//   10   62:athrow          

		case 6: // '\006'
			a.f(j);
	//   11   63:aload_0         
	//   12   64:getfield        #15  <Field FullLifecycleObserver a>
	//   13   67:aload_1         
	//   14   68:invokeinterface #41  <Method void FullLifecycleObserver.f(j)>
			return;
	//   15   73:return          

		case 5: // '\005'
			a.e(j);
	//   16   74:aload_0         
	//   17   75:getfield        #15  <Field FullLifecycleObserver a>
	//   18   78:aload_1         
	//   19   79:invokeinterface #44  <Method void FullLifecycleObserver.e(j)>
			return;
	//   20   84:return          

		case 4: // '\004'
			a.d(j);
	//   21   85:aload_0         
	//   22   86:getfield        #15  <Field FullLifecycleObserver a>
	//   23   89:aload_1         
	//   24   90:invokeinterface #47  <Method void FullLifecycleObserver.d(j)>
			return;
	//   25   95:return          

		case 3: // '\003'
			a.c(j);
	//   26   96:aload_0         
	//   27   97:getfield        #15  <Field FullLifecycleObserver a>
	//   28  100:aload_1         
	//   29  101:invokeinterface #50  <Method void FullLifecycleObserver.c(j)>
			return;
	//   30  106:return          

		case 2: // '\002'
			a.b(j);
	//   31  107:aload_0         
	//   32  108:getfield        #15  <Field FullLifecycleObserver a>
	//   33  111:aload_1         
	//   34  112:invokeinterface #53  <Method void FullLifecycleObserver.b(j)>
			return;
	//   35  117:return          

		case 1: // '\001'
			a.a(j);
	//   36  118:aload_0         
	//   37  119:getfield        #15  <Field FullLifecycleObserver a>
	//   38  122:aload_1         
	//   39  123:invokeinterface #55  <Method void FullLifecycleObserver.a(j)>
			return;
	//   40  128:return          
		}
	}

	private final FullLifecycleObserver a;
}
