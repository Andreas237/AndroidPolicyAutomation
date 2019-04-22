// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			GenericLifecycleObserver, FullLifecycleObserver, LifecycleOwner

class FullLifecycleObserverAdapter
	implements GenericLifecycleObserver
{

	FullLifecycleObserverAdapter(FullLifecycleObserver fulllifecycleobserver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mObserver = fulllifecycleobserver;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field FullLifecycleObserver mObserver>
	//    5    9:return          
	}

	public void onStateChanged(LifecycleOwner lifecycleowner, Lifecycle.Event event)
	{
		static class _cls1
		{

			static final int $SwitchMap$android$arch$lifecycle$Lifecycle$Event[];

			static 
			{
				$SwitchMap$android$arch$lifecycle$Lifecycle$Event = new int[Lifecycle.Event.values().length];
			//    0    0:invokestatic    #18  <Method Lifecycle$Event[] Lifecycle$Event.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
			//    5   12:getstatic       #24  <Field Lifecycle$Event Lifecycle$Event.ON_CREATE>
			//    6   15:invokevirtual   #28  <Method int Lifecycle$Event.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
			//*  10   23:getstatic       #31  <Field Lifecycle$Event Lifecycle$Event.ON_START>
			//*  11   26:invokevirtual   #28  <Method int Lifecycle$Event.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
			//*  15   34:getstatic       #34  <Field Lifecycle$Event Lifecycle$Event.ON_RESUME>
			//*  16   37:invokevirtual   #28  <Method int Lifecycle$Event.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
			//*  20   45:getstatic       #37  <Field Lifecycle$Event Lifecycle$Event.ON_PAUSE>
			//*  21   48:invokevirtual   #28  <Method int Lifecycle$Event.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
			//*  25   56:getstatic       #40  <Field Lifecycle$Event Lifecycle$Event.ON_STOP>
			//*  26   59:invokevirtual   #28  <Method int Lifecycle$Event.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
			//*  30   67:getstatic       #43  <Field Lifecycle$Event Lifecycle$Event.ON_DESTROY>
			//*  31   70:invokevirtual   #28  <Method int Lifecycle$Event.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:getstatic       #20  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
			//*  35   79:getstatic       #46  <Field Lifecycle$Event Lifecycle$Event.ON_ANY>
			//*  36   82:invokevirtual   #28  <Method int Lifecycle$Event.ordinal()>
			//*  37   85:bipush          7
			//*  38   87:iastore         
			//*  39   88:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   40   89:astore_0        
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_START.ordinal()] = 2;
				}
			//*  41   90:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   42   93:astore_0        
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
				}
			//*  43   94:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   44   97:astore_0        
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
				}
			//*  45   98:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   46  101:astore_0        
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_STOP.ordinal()] = 5;
				}
			//*  47  102:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   48  105:astore_0        
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
				}
			//*  49  106:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   50  109:astore_0        
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_ANY.ordinal()] = 7;
				}
			//*  51  110:goto            76
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   52  113:astore_0        
			//*  53  114:return          
			}
		}

		switch(_cls1..SwitchMap.android.arch.lifecycle.Lifecycle.Event[event.ordinal()])
	//*   0    0:getstatic       #24  <Field int[] FullLifecycleObserverAdapter$1.$SwitchMap$android$arch$lifecycle$Lifecycle$Event>
	//*   1    3:aload_2         
	//*   2    4:invokevirtual   #30  <Method int Lifecycle$Event.ordinal()>
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
	//    6   53:new             #32  <Class IllegalArgumentException>
	//    7   56:dup             
	//    8   57:ldc1            #34  <String "ON_ANY must not been send by anybody">
	//    9   59:invokespecial   #37  <Method void IllegalArgumentException(String)>
	//   10   62:athrow          

		case 6: // '\006'
			mObserver.onDestroy(lifecycleowner);
	//   11   63:aload_0         
	//   12   64:getfield        #17  <Field FullLifecycleObserver mObserver>
	//   13   67:aload_1         
	//   14   68:invokeinterface #43  <Method void FullLifecycleObserver.onDestroy(LifecycleOwner)>
			return;
	//   15   73:return          

		case 5: // '\005'
			mObserver.onStop(lifecycleowner);
	//   16   74:aload_0         
	//   17   75:getfield        #17  <Field FullLifecycleObserver mObserver>
	//   18   78:aload_1         
	//   19   79:invokeinterface #46  <Method void FullLifecycleObserver.onStop(LifecycleOwner)>
			return;
	//   20   84:return          

		case 4: // '\004'
			mObserver.onPause(lifecycleowner);
	//   21   85:aload_0         
	//   22   86:getfield        #17  <Field FullLifecycleObserver mObserver>
	//   23   89:aload_1         
	//   24   90:invokeinterface #49  <Method void FullLifecycleObserver.onPause(LifecycleOwner)>
			return;
	//   25   95:return          

		case 3: // '\003'
			mObserver.onResume(lifecycleowner);
	//   26   96:aload_0         
	//   27   97:getfield        #17  <Field FullLifecycleObserver mObserver>
	//   28  100:aload_1         
	//   29  101:invokeinterface #52  <Method void FullLifecycleObserver.onResume(LifecycleOwner)>
			return;
	//   30  106:return          

		case 2: // '\002'
			mObserver.onStart(lifecycleowner);
	//   31  107:aload_0         
	//   32  108:getfield        #17  <Field FullLifecycleObserver mObserver>
	//   33  111:aload_1         
	//   34  112:invokeinterface #55  <Method void FullLifecycleObserver.onStart(LifecycleOwner)>
			return;
	//   35  117:return          

		case 1: // '\001'
			mObserver.onCreate(lifecycleowner);
	//   36  118:aload_0         
	//   37  119:getfield        #17  <Field FullLifecycleObserver mObserver>
	//   38  122:aload_1         
	//   39  123:invokeinterface #58  <Method void FullLifecycleObserver.onCreate(LifecycleOwner)>
			return;
	//   40  128:return          
		}
	}

	private final FullLifecycleObserver mObserver;
}
