// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.arch.core.internal.FastSafeIterableMap;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.arch.lifecycle:
//			Lifecycle, LifecycleOwner, LifecycleObserver, Lifecycling, 
//			GenericLifecycleObserver

public class LifecycleRegistry extends Lifecycle
{
	static class ObserverWithState
	{

		void dispatchEvent(LifecycleOwner lifecycleowner, Lifecycle.Event event)
		{
			Lifecycle.State state = LifecycleRegistry.getStateAfter(event);
		//    0    0:aload_2         
		//    1    1:invokestatic    #33  <Method Lifecycle$State LifecycleRegistry.getStateAfter(Lifecycle$Event)>
		//    2    4:astore_3        
			mState = LifecycleRegistry.min(mState, state);
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #26  <Field Lifecycle$State mState>
		//    6   10:aload_3         
		//    7   11:invokestatic    #37  <Method Lifecycle$State LifecycleRegistry.min(Lifecycle$State, Lifecycle$State)>
		//    8   14:putfield        #26  <Field Lifecycle$State mState>
			mLifecycleObserver.onStateChanged(lifecycleowner, event);
		//    9   17:aload_0         
		//   10   18:getfield        #24  <Field GenericLifecycleObserver mLifecycleObserver>
		//   11   21:aload_1         
		//   12   22:aload_2         
		//   13   23:invokeinterface #42  <Method void GenericLifecycleObserver.onStateChanged(LifecycleOwner, Lifecycle$Event)>
			mState = state;
		//   14   28:aload_0         
		//   15   29:aload_3         
		//   16   30:putfield        #26  <Field Lifecycle$State mState>
		//   17   33:return          
		}

		GenericLifecycleObserver mLifecycleObserver;
		Lifecycle.State mState;

		ObserverWithState(LifecycleObserver lifecycleobserver, Lifecycle.State state)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mLifecycleObserver = Lifecycling.getCallback(((Object) (lifecycleobserver)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #22  <Method GenericLifecycleObserver Lifecycling.getCallback(Object)>
		//    5    9:putfield        #24  <Field GenericLifecycleObserver mLifecycleObserver>
			mState = state;
		//    6   12:aload_0         
		//    7   13:aload_2         
		//    8   14:putfield        #26  <Field Lifecycle$State mState>
		//    9   17:return          
		}
	}


	public LifecycleRegistry(LifecycleOwner lifecycleowner)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Lifecycle()>
		mObserverMap = new FastSafeIterableMap();
	//    2    4:aload_0         
	//    3    5:new             #37  <Class FastSafeIterableMap>
	//    4    8:dup             
	//    5    9:invokespecial   #38  <Method void FastSafeIterableMap()>
	//    6   12:putfield        #40  <Field FastSafeIterableMap mObserverMap>
		mAddingObserverCounter = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #42  <Field int mAddingObserverCounter>
		mHandlingEvent = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #44  <Field boolean mHandlingEvent>
		mNewEventOccurred = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #46  <Field boolean mNewEventOccurred>
		mParentStates = new ArrayList();
	//   16   30:aload_0         
	//   17   31:new             #48  <Class ArrayList>
	//   18   34:dup             
	//   19   35:invokespecial   #49  <Method void ArrayList()>
	//   20   38:putfield        #51  <Field ArrayList mParentStates>
		mLifecycleOwner = new WeakReference(((Object) (lifecycleowner)));
	//   21   41:aload_0         
	//   22   42:new             #53  <Class WeakReference>
	//   23   45:dup             
	//   24   46:aload_1         
	//   25   47:invokespecial   #56  <Method void WeakReference(Object)>
	//   26   50:putfield        #58  <Field WeakReference mLifecycleOwner>
		mState = Lifecycle.State.INITIALIZED;
	//   27   53:aload_0         
	//   28   54:getstatic       #63  <Field Lifecycle$State Lifecycle$State.INITIALIZED>
	//   29   57:putfield        #65  <Field Lifecycle$State mState>
	//   30   60:return          
	}

	private void backwardPass(LifecycleOwner lifecycleowner)
	{
		for(Iterator iterator = mObserverMap.descendingIterator(); iterator.hasNext() && !mNewEventOccurred;)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field FastSafeIterableMap mObserverMap>
	//*   2    4:invokevirtual   #72  <Method Iterator FastSafeIterableMap.descendingIterator()>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            117
	//*   7   17:aload_0         
	//*   8   18:getfield        #46  <Field boolean mNewEventOccurred>
	//*   9   21:ifne            117
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   10   24:aload_2         
	//   11   25:invokeinterface #82  <Method Object Iterator.next()>
	//   12   30:checkcast       #84  <Class java.util.Map$Entry>
	//   13   33:astore_3        
			ObserverWithState observerwithstate = (ObserverWithState)entry.getValue();
	//   14   34:aload_3         
	//   15   35:invokeinterface #87  <Method Object java.util.Map$Entry.getValue()>
	//   16   40:checkcast       #8   <Class LifecycleRegistry$ObserverWithState>
	//   17   43:astore          4
			while(observerwithstate.mState.compareTo(((Enum) (mState))) > 0 && !mNewEventOccurred && mObserverMap.contains(entry.getKey())) 
	//*  18   45:aload           4
	//*  19   47:getfield        #88  <Field Lifecycle$State LifecycleRegistry$ObserverWithState.mState>
	//*  20   50:aload_0         
	//*  21   51:getfield        #65  <Field Lifecycle$State mState>
	//*  22   54:invokevirtual   #92  <Method int Lifecycle$State.compareTo(Enum)>
	//*  23   57:ifle            8
	//*  24   60:aload_0         
	//*  25   61:getfield        #46  <Field boolean mNewEventOccurred>
	//*  26   64:ifne            8
	//*  27   67:aload_0         
	//*  28   68:getfield        #40  <Field FastSafeIterableMap mObserverMap>
	//*  29   71:aload_3         
	//*  30   72:invokeinterface #95  <Method Object java.util.Map$Entry.getKey()>
	//*  31   77:invokevirtual   #99  <Method boolean FastSafeIterableMap.contains(Object)>
	//*  32   80:ifeq            8
			{
				Lifecycle.Event event = downEvent(observerwithstate.mState);
	//   33   83:aload           4
	//   34   85:getfield        #88  <Field Lifecycle$State LifecycleRegistry$ObserverWithState.mState>
	//   35   88:invokestatic    #103 <Method Lifecycle$Event downEvent(Lifecycle$State)>
	//   36   91:astore          5
				pushParentState(getStateAfter(event));
	//   37   93:aload_0         
	//   38   94:aload           5
	//   39   96:invokestatic    #107 <Method Lifecycle$State getStateAfter(Lifecycle$Event)>
	//   40   99:invokespecial   #111 <Method void pushParentState(Lifecycle$State)>
				observerwithstate.dispatchEvent(lifecycleowner, event);
	//   41  102:aload           4
	//   42  104:aload_1         
	//   43  105:aload           5
	//   44  107:invokevirtual   #115 <Method void LifecycleRegistry$ObserverWithState.dispatchEvent(LifecycleOwner, Lifecycle$Event)>
				popParentState();
	//   45  110:aload_0         
	//   46  111:invokespecial   #118 <Method void popParentState()>
			}
		}

	//*  47  114:goto            45
	//   48  117:return          
	}

	private Lifecycle.State calculateTargetState(LifecycleObserver lifecycleobserver)
	{
		lifecycleobserver = ((LifecycleObserver) (mObserverMap.ceil(((Object) (lifecycleobserver)))));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field FastSafeIterableMap mObserverMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #124 <Method java.util.Map$Entry FastSafeIterableMap.ceil(Object)>
	//    4    8:astore_1        
		Lifecycle.State state = null;
	//    5    9:aconst_null     
	//    6   10:astore_2        
		if(lifecycleobserver != null)
	//*   7   11:aload_1         
	//*   8   12:ifnull          31
			lifecycleobserver = ((LifecycleObserver) (((ObserverWithState)((java.util.Map.Entry) (lifecycleobserver)).getValue()).mState));
	//    9   15:aload_1         
	//   10   16:invokeinterface #87  <Method Object java.util.Map$Entry.getValue()>
	//   11   21:checkcast       #8   <Class LifecycleRegistry$ObserverWithState>
	//   12   24:getfield        #88  <Field Lifecycle$State LifecycleRegistry$ObserverWithState.mState>
	//   13   27:astore_1        
		else
	//*  14   28:goto            33
			lifecycleobserver = null;
	//   15   31:aconst_null     
	//   16   32:astore_1        
		if(!mParentStates.isEmpty())
	//*  17   33:aload_0         
	//*  18   34:getfield        #51  <Field ArrayList mParentStates>
	//*  19   37:invokevirtual   #127 <Method boolean ArrayList.isEmpty()>
	//*  20   40:ifne            63
			state = (Lifecycle.State)mParentStates.get(mParentStates.size() - 1);
	//   21   43:aload_0         
	//   22   44:getfield        #51  <Field ArrayList mParentStates>
	//   23   47:aload_0         
	//   24   48:getfield        #51  <Field ArrayList mParentStates>
	//   25   51:invokevirtual   #131 <Method int ArrayList.size()>
	//   26   54:iconst_1        
	//   27   55:isub            
	//   28   56:invokevirtual   #135 <Method Object ArrayList.get(int)>
	//   29   59:checkcast       #60  <Class Lifecycle$State>
	//   30   62:astore_2        
		return min(min(mState, ((Lifecycle.State) (lifecycleobserver))), state);
	//   31   63:aload_0         
	//   32   64:getfield        #65  <Field Lifecycle$State mState>
	//   33   67:aload_1         
	//   34   68:invokestatic    #139 <Method Lifecycle$State min(Lifecycle$State, Lifecycle$State)>
	//   35   71:aload_2         
	//   36   72:invokestatic    #139 <Method Lifecycle$State min(Lifecycle$State, Lifecycle$State)>
	//   37   75:areturn         
	}

	private static Lifecycle.Event downEvent(Lifecycle.State state)
	{
		static class _cls1
		{

			static final int $SwitchMap$android$arch$lifecycle$Lifecycle$Event[];
			static final int $SwitchMap$android$arch$lifecycle$Lifecycle$State[];

			static 
			{
				$SwitchMap$android$arch$lifecycle$Lifecycle$State = new int[Lifecycle.State.values().length];
			//    0    0:invokestatic    #19  <Method Lifecycle$State[] Lifecycle$State.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #21  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$State>
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.INITIALIZED.ordinal()] = 1;
			//    4    9:getstatic       #21  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$State>
			//    5   12:getstatic       #25  <Field Lifecycle$State Lifecycle$State.INITIALIZED>
			//    6   15:invokevirtual   #29  <Method int Lifecycle$State.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #21  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$State>
			//*  10   23:getstatic       #32  <Field Lifecycle$State Lifecycle$State.CREATED>
			//*  11   26:invokevirtual   #29  <Method int Lifecycle$State.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #21  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$State>
			//*  15   34:getstatic       #35  <Field Lifecycle$State Lifecycle$State.STARTED>
			//*  16   37:invokevirtual   #29  <Method int Lifecycle$State.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #21  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$State>
			//*  20   45:getstatic       #38  <Field Lifecycle$State Lifecycle$State.RESUMED>
			//*  21   48:invokevirtual   #29  <Method int Lifecycle$State.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #21  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$State>
			//*  25   56:getstatic       #41  <Field Lifecycle$State Lifecycle$State.DESTROYED>
			//*  26   59:invokevirtual   #29  <Method int Lifecycle$State.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:invokestatic    #46  <Method Lifecycle$Event[] Lifecycle$Event.values()>
			//*  30   67:arraylength     
			//*  31   68:newarray        int[]
			//*  32   70:putstatic       #48  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
			//*  33   73:getstatic       #48  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
			//*  34   76:getstatic       #52  <Field Lifecycle$Event Lifecycle$Event.ON_CREATE>
			//*  35   79:invokevirtual   #53  <Method int Lifecycle$Event.ordinal()>
			//*  36   82:iconst_1        
			//*  37   83:iastore         
			//*  38   84:getstatic       #48  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
			//*  39   87:getstatic       #56  <Field Lifecycle$Event Lifecycle$Event.ON_STOP>
			//*  40   90:invokevirtual   #53  <Method int Lifecycle$Event.ordinal()>
			//*  41   93:iconst_2        
			//*  42   94:iastore         
			//*  43   95:getstatic       #48  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
			//*  44   98:getstatic       #59  <Field Lifecycle$Event Lifecycle$Event.ON_START>
			//*  45  101:invokevirtual   #53  <Method int Lifecycle$Event.ordinal()>
			//*  46  104:iconst_3        
			//*  47  105:iastore         
			//*  48  106:getstatic       #48  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
			//*  49  109:getstatic       #62  <Field Lifecycle$Event Lifecycle$Event.ON_PAUSE>
			//*  50  112:invokevirtual   #53  <Method int Lifecycle$Event.ordinal()>
			//*  51  115:iconst_4        
			//*  52  116:iastore         
			//*  53  117:getstatic       #48  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
			//*  54  120:getstatic       #65  <Field Lifecycle$Event Lifecycle$Event.ON_RESUME>
			//*  55  123:invokevirtual   #53  <Method int Lifecycle$Event.ordinal()>
			//*  56  126:iconst_5        
			//*  57  127:iastore         
			//*  58  128:getstatic       #48  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
			//*  59  131:getstatic       #68  <Field Lifecycle$Event Lifecycle$Event.ON_DESTROY>
			//*  60  134:invokevirtual   #53  <Method int Lifecycle$Event.ordinal()>
			//*  61  137:bipush          6
			//*  62  139:iastore         
			//*  63  140:getstatic       #48  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
			//*  64  143:getstatic       #71  <Field Lifecycle$Event Lifecycle$Event.ON_ANY>
			//*  65  146:invokevirtual   #53  <Method int Lifecycle$Event.ordinal()>
			//*  66  149:bipush          7
			//*  67  151:iastore         
			//*  68  152:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   69  153:astore_0        
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.CREATED.ordinal()] = 2;
				}
			//*  70  154:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   71  157:astore_0        
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.STARTED.ordinal()] = 3;
				}
			//*  72  158:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   73  161:astore_0        
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.RESUMED.ordinal()] = 4;
				}
			//*  74  162:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   75  165:astore_0        
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.DESTROYED.ordinal()] = 5;
				}
			//*  76  166:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   77  169:astore_0        
				$SwitchMap$android$arch$lifecycle$Lifecycle$Event = new int[Lifecycle.Event.values().length];
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
				}
			//*  78  170:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   79  173:astore_0        
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_STOP.ordinal()] = 2;
				}
			//*  80  174:goto            84
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   81  177:astore_0        
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_START.ordinal()] = 3;
				}
			//*  82  178:goto            95
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   83  181:astore_0        
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
				}
			//*  84  182:goto            106
				catch(NoSuchFieldError nosuchfielderror8) { }
			//   85  185:astore_0        
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_RESUME.ordinal()] = 5;
				}
			//*  86  186:goto            117
				catch(NoSuchFieldError nosuchfielderror9) { }
			//   87  189:astore_0        
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
				}
			//*  88  190:goto            128
				catch(NoSuchFieldError nosuchfielderror10) { }
			//   89  193:astore_0        
				try
				{
					$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_ANY.ordinal()] = 7;
				}
			//*  90  194:goto            140
				catch(NoSuchFieldError nosuchfielderror11) { }
			//   91  197:astore_0        
			//*  92  198:return          
			}
		}

		switch(_cls1..SwitchMap.android.arch.lifecycle.Lifecycle.State[state.ordinal()])
	//*   0    0:getstatic       #143 <Field int[] LifecycleRegistry$1.$SwitchMap$android$arch$lifecycle$Lifecycle$State>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #146 <Method int Lifecycle$State.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 5: default 44
	//	               1 97
	//	               2 93
	//	               3 89
	//	               4 85
	//	               5 77
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    5   44:new             #148 <Class StringBuilder>
	//    6   47:dup             
	//    7   48:invokespecial   #149 <Method void StringBuilder()>
	//    8   51:astore_1        
			stringbuilder.append("Unexpected state value ");
	//    9   52:aload_1         
	//   10   53:ldc1            #151 <String "Unexpected state value ">
	//   11   55:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//   12   58:pop             
			stringbuilder.append(((Object) (state)));
	//   13   59:aload_1         
	//   14   60:aload_0         
	//   15   61:invokevirtual   #158 <Method StringBuilder StringBuilder.append(Object)>
	//   16   64:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   17   65:new             #160 <Class IllegalArgumentException>
	//   18   68:dup             
	//   19   69:aload_1         
	//   20   70:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   21   73:invokespecial   #167 <Method void IllegalArgumentException(String)>
	//   22   76:athrow          

		case 5: // '\005'
			throw new IllegalArgumentException();
	//   23   77:new             #160 <Class IllegalArgumentException>
	//   24   80:dup             
	//   25   81:invokespecial   #168 <Method void IllegalArgumentException()>
	//   26   84:athrow          

		case 4: // '\004'
			return Lifecycle.Event.ON_PAUSE;
	//   27   85:getstatic       #174 <Field Lifecycle$Event Lifecycle$Event.ON_PAUSE>
	//   28   88:areturn         

		case 3: // '\003'
			return Lifecycle.Event.ON_STOP;
	//   29   89:getstatic       #177 <Field Lifecycle$Event Lifecycle$Event.ON_STOP>
	//   30   92:areturn         

		case 2: // '\002'
			return Lifecycle.Event.ON_DESTROY;
	//   31   93:getstatic       #180 <Field Lifecycle$Event Lifecycle$Event.ON_DESTROY>
	//   32   96:areturn         

		case 1: // '\001'
			throw new IllegalArgumentException();
	//   33   97:new             #160 <Class IllegalArgumentException>
	//   34  100:dup             
	//   35  101:invokespecial   #168 <Method void IllegalArgumentException()>
	//   36  104:athrow          
		}
	}

	private void forwardPass(LifecycleOwner lifecycleowner)
	{
		for(android.arch.core.internal.SafeIterableMap.IteratorWithAdditions iteratorwithadditions = mObserverMap.iteratorWithAdditions(); ((Iterator) (iteratorwithadditions)).hasNext() && !mNewEventOccurred;)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field FastSafeIterableMap mObserverMap>
	//*   2    4:invokevirtual   #185 <Method android.arch.core.internal.SafeIterableMap$IteratorWithAdditions FastSafeIterableMap.iteratorWithAdditions()>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            113
	//*   7   17:aload_0         
	//*   8   18:getfield        #46  <Field boolean mNewEventOccurred>
	//*   9   21:ifne            113
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (iteratorwithadditions)).next();
	//   10   24:aload_2         
	//   11   25:invokeinterface #82  <Method Object Iterator.next()>
	//   12   30:checkcast       #84  <Class java.util.Map$Entry>
	//   13   33:astore_3        
			ObserverWithState observerwithstate = (ObserverWithState)entry.getValue();
	//   14   34:aload_3         
	//   15   35:invokeinterface #87  <Method Object java.util.Map$Entry.getValue()>
	//   16   40:checkcast       #8   <Class LifecycleRegistry$ObserverWithState>
	//   17   43:astore          4
			while(observerwithstate.mState.compareTo(((Enum) (mState))) < 0 && !mNewEventOccurred && mObserverMap.contains(entry.getKey())) 
	//*  18   45:aload           4
	//*  19   47:getfield        #88  <Field Lifecycle$State LifecycleRegistry$ObserverWithState.mState>
	//*  20   50:aload_0         
	//*  21   51:getfield        #65  <Field Lifecycle$State mState>
	//*  22   54:invokevirtual   #92  <Method int Lifecycle$State.compareTo(Enum)>
	//*  23   57:ifge            8
	//*  24   60:aload_0         
	//*  25   61:getfield        #46  <Field boolean mNewEventOccurred>
	//*  26   64:ifne            8
	//*  27   67:aload_0         
	//*  28   68:getfield        #40  <Field FastSafeIterableMap mObserverMap>
	//*  29   71:aload_3         
	//*  30   72:invokeinterface #95  <Method Object java.util.Map$Entry.getKey()>
	//*  31   77:invokevirtual   #99  <Method boolean FastSafeIterableMap.contains(Object)>
	//*  32   80:ifeq            8
			{
				pushParentState(observerwithstate.mState);
	//   33   83:aload_0         
	//   34   84:aload           4
	//   35   86:getfield        #88  <Field Lifecycle$State LifecycleRegistry$ObserverWithState.mState>
	//   36   89:invokespecial   #111 <Method void pushParentState(Lifecycle$State)>
				observerwithstate.dispatchEvent(lifecycleowner, upEvent(observerwithstate.mState));
	//   37   92:aload           4
	//   38   94:aload_1         
	//   39   95:aload           4
	//   40   97:getfield        #88  <Field Lifecycle$State LifecycleRegistry$ObserverWithState.mState>
	//   41  100:invokestatic    #188 <Method Lifecycle$Event upEvent(Lifecycle$State)>
	//   42  103:invokevirtual   #115 <Method void LifecycleRegistry$ObserverWithState.dispatchEvent(LifecycleOwner, Lifecycle$Event)>
				popParentState();
	//   43  106:aload_0         
	//   44  107:invokespecial   #118 <Method void popParentState()>
			}
		}

	//*  45  110:goto            45
	//   46  113:return          
	}

	static Lifecycle.State getStateAfter(Lifecycle.Event event)
	{
		switch(_cls1..SwitchMap.android.arch.lifecycle.Lifecycle.Event[event.ordinal()])
	//*   0    0:getstatic       #191 <Field int[] LifecycleRegistry$1.$SwitchMap$android$arch$lifecycle$Lifecycle$Event>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #192 <Method int Lifecycle$Event.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 6: default 48
	//	               1 93
	//	               2 93
	//	               3 89
	//	               4 89
	//	               5 85
	//	               6 81
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    5   48:new             #148 <Class StringBuilder>
	//    6   51:dup             
	//    7   52:invokespecial   #149 <Method void StringBuilder()>
	//    8   55:astore_1        
			stringbuilder.append("Unexpected event value ");
	//    9   56:aload_1         
	//   10   57:ldc1            #194 <String "Unexpected event value ">
	//   11   59:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//   12   62:pop             
			stringbuilder.append(((Object) (event)));
	//   13   63:aload_1         
	//   14   64:aload_0         
	//   15   65:invokevirtual   #158 <Method StringBuilder StringBuilder.append(Object)>
	//   16   68:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   17   69:new             #160 <Class IllegalArgumentException>
	//   18   72:dup             
	//   19   73:aload_1         
	//   20   74:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   21   77:invokespecial   #167 <Method void IllegalArgumentException(String)>
	//   22   80:athrow          

		case 6: // '\006'
			return Lifecycle.State.DESTROYED;
	//   23   81:getstatic       #197 <Field Lifecycle$State Lifecycle$State.DESTROYED>
	//   24   84:areturn         

		case 5: // '\005'
			return Lifecycle.State.RESUMED;
	//   25   85:getstatic       #200 <Field Lifecycle$State Lifecycle$State.RESUMED>
	//   26   88:areturn         

		case 3: // '\003'
		case 4: // '\004'
			return Lifecycle.State.STARTED;
	//   27   89:getstatic       #203 <Field Lifecycle$State Lifecycle$State.STARTED>
	//   28   92:areturn         

		case 1: // '\001'
		case 2: // '\002'
			return Lifecycle.State.CREATED;
	//   29   93:getstatic       #206 <Field Lifecycle$State Lifecycle$State.CREATED>
	//   30   96:areturn         
		}
	}

	private boolean isSynced()
	{
		if(mObserverMap.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field FastSafeIterableMap mObserverMap>
	//*   2    4:invokevirtual   #208 <Method int FastSafeIterableMap.size()>
	//*   3    7:ifne            12
			return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
		Lifecycle.State state = ((ObserverWithState)mObserverMap.eldest().getValue()).mState;
	//    6   12:aload_0         
	//    7   13:getfield        #40  <Field FastSafeIterableMap mObserverMap>
	//    8   16:invokevirtual   #212 <Method java.util.Map$Entry FastSafeIterableMap.eldest()>
	//    9   19:invokeinterface #87  <Method Object java.util.Map$Entry.getValue()>
	//   10   24:checkcast       #8   <Class LifecycleRegistry$ObserverWithState>
	//   11   27:getfield        #88  <Field Lifecycle$State LifecycleRegistry$ObserverWithState.mState>
	//   12   30:astore_1        
		Lifecycle.State state1 = ((ObserverWithState)mObserverMap.newest().getValue()).mState;
	//   13   31:aload_0         
	//   14   32:getfield        #40  <Field FastSafeIterableMap mObserverMap>
	//   15   35:invokevirtual   #215 <Method java.util.Map$Entry FastSafeIterableMap.newest()>
	//   16   38:invokeinterface #87  <Method Object java.util.Map$Entry.getValue()>
	//   17   43:checkcast       #8   <Class LifecycleRegistry$ObserverWithState>
	//   18   46:getfield        #88  <Field Lifecycle$State LifecycleRegistry$ObserverWithState.mState>
	//   19   49:astore_2        
		return state == state1 && mState == state1;
	//   20   50:aload_1         
	//   21   51:aload_2         
	//   22   52:if_acmpne       65
	//   23   55:aload_0         
	//   24   56:getfield        #65  <Field Lifecycle$State mState>
	//   25   59:aload_2         
	//   26   60:if_acmpne       65
	//   27   63:iconst_1        
	//   28   64:ireturn         
	//   29   65:iconst_0        
	//   30   66:ireturn         
	}

	static Lifecycle.State min(Lifecycle.State state, Lifecycle.State state1)
	{
		Lifecycle.State state2 = state;
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(state1 != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          18
		{
			state2 = state;
	//    4    6:aload_0         
	//    5    7:astore_2        
			if(state1.compareTo(((Enum) (state))) < 0)
	//*   6    8:aload_1         
	//*   7    9:aload_0         
	//*   8   10:invokevirtual   #92  <Method int Lifecycle$State.compareTo(Enum)>
	//*   9   13:ifge            18
				state2 = state1;
	//   10   16:aload_1         
	//   11   17:astore_2        
		}
		return state2;
	//   12   18:aload_2         
	//   13   19:areturn         
	}

	private void moveToState(Lifecycle.State state)
	{
		if(mState == state)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field Lifecycle$State mState>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		mState = state;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #65  <Field Lifecycle$State mState>
		if(!mHandlingEvent && mAddingObserverCounter == 0)
	//*   8   14:aload_0         
	//*   9   15:getfield        #44  <Field boolean mHandlingEvent>
	//*  10   18:ifne            46
	//*  11   21:aload_0         
	//*  12   22:getfield        #42  <Field int mAddingObserverCounter>
	//*  13   25:ifeq            31
	//*  14   28:goto            46
		{
			mHandlingEvent = true;
	//   15   31:aload_0         
	//   16   32:iconst_1        
	//   17   33:putfield        #44  <Field boolean mHandlingEvent>
			sync();
	//   18   36:aload_0         
	//   19   37:invokespecial   #220 <Method void sync()>
			mHandlingEvent = false;
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:putfield        #44  <Field boolean mHandlingEvent>
			return;
	//   23   45:return          
		} else
		{
			mNewEventOccurred = true;
	//   24   46:aload_0         
	//   25   47:iconst_1        
	//   26   48:putfield        #46  <Field boolean mNewEventOccurred>
			return;
	//   27   51:return          
		}
	}

	private void popParentState()
	{
		mParentStates.remove(mParentStates.size() - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ArrayList mParentStates>
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field ArrayList mParentStates>
	//    4    8:invokevirtual   #131 <Method int ArrayList.size()>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:invokevirtual   #223 <Method Object ArrayList.remove(int)>
	//    8   16:pop             
	//    9   17:return          
	}

	private void pushParentState(Lifecycle.State state)
	{
		mParentStates.add(((Object) (state)));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ArrayList mParentStates>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #226 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	private void sync()
	{
		LifecycleOwner lifecycleowner = (LifecycleOwner)mLifecycleOwner.get();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field WeakReference mLifecycleOwner>
	//    2    4:invokevirtual   #228 <Method Object WeakReference.get()>
	//    3    7:checkcast       #230 <Class LifecycleOwner>
	//    4   10:astore_1        
		if(lifecycleowner == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       24
		{
			Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
	//    7   15:ldc1            #13  <String "LifecycleRegistry">
	//    8   17:ldc1            #232 <String "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.">
	//    9   19:invokestatic    #238 <Method int Log.w(String, String)>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
		do
		{
			if(isSynced())
				break;
	//   12   24:aload_0         
	//   13   25:invokespecial   #240 <Method boolean isSynced()>
	//   14   28:ifne            118
			mNewEventOccurred = false;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #46  <Field boolean mNewEventOccurred>
			if(mState.compareTo(((Enum) (((ObserverWithState)mObserverMap.eldest().getValue()).mState))) < 0)
	//*  18   36:aload_0         
	//*  19   37:getfield        #65  <Field Lifecycle$State mState>
	//*  20   40:aload_0         
	//*  21   41:getfield        #40  <Field FastSafeIterableMap mObserverMap>
	//*  22   44:invokevirtual   #212 <Method java.util.Map$Entry FastSafeIterableMap.eldest()>
	//*  23   47:invokeinterface #87  <Method Object java.util.Map$Entry.getValue()>
	//*  24   52:checkcast       #8   <Class LifecycleRegistry$ObserverWithState>
	//*  25   55:getfield        #88  <Field Lifecycle$State LifecycleRegistry$ObserverWithState.mState>
	//*  26   58:invokevirtual   #92  <Method int Lifecycle$State.compareTo(Enum)>
	//*  27   61:ifge            69
				backwardPass(lifecycleowner);
	//   28   64:aload_0         
	//   29   65:aload_1         
	//   30   66:invokespecial   #242 <Method void backwardPass(LifecycleOwner)>
			java.util.Map.Entry entry = mObserverMap.newest();
	//   31   69:aload_0         
	//   32   70:getfield        #40  <Field FastSafeIterableMap mObserverMap>
	//   33   73:invokevirtual   #215 <Method java.util.Map$Entry FastSafeIterableMap.newest()>
	//   34   76:astore_2        
			if(!mNewEventOccurred && entry != null && mState.compareTo(((Enum) (((ObserverWithState)entry.getValue()).mState))) > 0)
	//*  35   77:aload_0         
	//*  36   78:getfield        #46  <Field boolean mNewEventOccurred>
	//*  37   81:ifne            24
	//*  38   84:aload_2         
	//*  39   85:ifnull          24
	//*  40   88:aload_0         
	//*  41   89:getfield        #65  <Field Lifecycle$State mState>
	//*  42   92:aload_2         
	//*  43   93:invokeinterface #87  <Method Object java.util.Map$Entry.getValue()>
	//*  44   98:checkcast       #8   <Class LifecycleRegistry$ObserverWithState>
	//*  45  101:getfield        #88  <Field Lifecycle$State LifecycleRegistry$ObserverWithState.mState>
	//*  46  104:invokevirtual   #92  <Method int Lifecycle$State.compareTo(Enum)>
	//*  47  107:ifle            24
				forwardPass(lifecycleowner);
	//   48  110:aload_0         
	//   49  111:aload_1         
	//   50  112:invokespecial   #244 <Method void forwardPass(LifecycleOwner)>
		} while(true);
	//   51  115:goto            24
		mNewEventOccurred = false;
	//   52  118:aload_0         
	//   53  119:iconst_0        
	//   54  120:putfield        #46  <Field boolean mNewEventOccurred>
	//   55  123:return          
	}

	private static Lifecycle.Event upEvent(Lifecycle.State state)
	{
		switch(_cls1..SwitchMap.android.arch.lifecycle.Lifecycle.State[state.ordinal()])
	//*   0    0:getstatic       #143 <Field int[] LifecycleRegistry$1.$SwitchMap$android$arch$lifecycle$Lifecycle$State>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #146 <Method int Lifecycle$State.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 5: default 44
	//	               1 93
	//	               2 89
	//	               3 85
	//	               4 77
	//	               5 93
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    5   44:new             #148 <Class StringBuilder>
	//    6   47:dup             
	//    7   48:invokespecial   #149 <Method void StringBuilder()>
	//    8   51:astore_1        
			stringbuilder.append("Unexpected state value ");
	//    9   52:aload_1         
	//   10   53:ldc1            #151 <String "Unexpected state value ">
	//   11   55:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//   12   58:pop             
			stringbuilder.append(((Object) (state)));
	//   13   59:aload_1         
	//   14   60:aload_0         
	//   15   61:invokevirtual   #158 <Method StringBuilder StringBuilder.append(Object)>
	//   16   64:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   17   65:new             #160 <Class IllegalArgumentException>
	//   18   68:dup             
	//   19   69:aload_1         
	//   20   70:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   21   73:invokespecial   #167 <Method void IllegalArgumentException(String)>
	//   22   76:athrow          

		case 4: // '\004'
			throw new IllegalArgumentException();
	//   23   77:new             #160 <Class IllegalArgumentException>
	//   24   80:dup             
	//   25   81:invokespecial   #168 <Method void IllegalArgumentException()>
	//   26   84:athrow          

		case 3: // '\003'
			return Lifecycle.Event.ON_RESUME;
	//   27   85:getstatic       #247 <Field Lifecycle$Event Lifecycle$Event.ON_RESUME>
	//   28   88:areturn         

		case 2: // '\002'
			return Lifecycle.Event.ON_START;
	//   29   89:getstatic       #250 <Field Lifecycle$Event Lifecycle$Event.ON_START>
	//   30   92:areturn         

		case 1: // '\001'
		case 5: // '\005'
			return Lifecycle.Event.ON_CREATE;
	//   31   93:getstatic       #253 <Field Lifecycle$Event Lifecycle$Event.ON_CREATE>
	//   32   96:areturn         
		}
	}

	public void addObserver(LifecycleObserver lifecycleobserver)
	{
		Lifecycle.State state;
		if(mState == Lifecycle.State.DESTROYED)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field Lifecycle$State mState>
	//*   2    4:getstatic       #197 <Field Lifecycle$State Lifecycle$State.DESTROYED>
	//*   3    7:if_acmpne       17
			state = Lifecycle.State.DESTROYED;
	//    4   10:getstatic       #197 <Field Lifecycle$State Lifecycle$State.DESTROYED>
	//    5   13:astore_3        
		else
	//*   6   14:goto            21
			state = Lifecycle.State.INITIALIZED;
	//    7   17:getstatic       #63  <Field Lifecycle$State Lifecycle$State.INITIALIZED>
	//    8   20:astore_3        
		ObserverWithState observerwithstate = new ObserverWithState(lifecycleobserver, state);
	//    9   21:new             #8   <Class LifecycleRegistry$ObserverWithState>
	//   10   24:dup             
	//   11   25:aload_1         
	//   12   26:aload_3         
	//   13   27:invokespecial   #258 <Method void LifecycleRegistry$ObserverWithState(LifecycleObserver, Lifecycle$State)>
	//   14   30:astore          4
		if((ObserverWithState)mObserverMap.putIfAbsent(((Object) (lifecycleobserver)), ((Object) (observerwithstate))) != null)
	//*  15   32:aload_0         
	//*  16   33:getfield        #40  <Field FastSafeIterableMap mObserverMap>
	//*  17   36:aload_1         
	//*  18   37:aload           4
	//*  19   39:invokevirtual   #262 <Method Object FastSafeIterableMap.putIfAbsent(Object, Object)>
	//*  20   42:checkcast       #8   <Class LifecycleRegistry$ObserverWithState>
	//*  21   45:ifnull          49
			return;
	//   22   48:return          
		LifecycleOwner lifecycleowner = (LifecycleOwner)mLifecycleOwner.get();
	//   23   49:aload_0         
	//   24   50:getfield        #58  <Field WeakReference mLifecycleOwner>
	//   25   53:invokevirtual   #228 <Method Object WeakReference.get()>
	//   26   56:checkcast       #230 <Class LifecycleOwner>
	//   27   59:astore          5
		if(lifecycleowner == null)
	//*  28   61:aload           5
	//*  29   63:ifnonnull       67
			return;
	//   30   66:return          
		boolean flag;
		if(mAddingObserverCounter == 0 && !mHandlingEvent)
	//*  31   67:aload_0         
	//*  32   68:getfield        #42  <Field int mAddingObserverCounter>
	//*  33   71:ifne            89
	//*  34   74:aload_0         
	//*  35   75:getfield        #44  <Field boolean mHandlingEvent>
	//*  36   78:ifeq            84
	//*  37   81:goto            89
			flag = false;
	//   38   84:iconst_0        
	//   39   85:istore_2        
		else
	//*  40   86:goto            91
			flag = true;
	//   41   89:iconst_1        
	//   42   90:istore_2        
		state = calculateTargetState(lifecycleobserver);
	//   43   91:aload_0         
	//   44   92:aload_1         
	//   45   93:invokespecial   #264 <Method Lifecycle$State calculateTargetState(LifecycleObserver)>
	//   46   96:astore_3        
		mAddingObserverCounter = mAddingObserverCounter + 1;
	//   47   97:aload_0         
	//   48   98:aload_0         
	//   49   99:getfield        #42  <Field int mAddingObserverCounter>
	//   50  102:iconst_1        
	//   51  103:iadd            
	//   52  104:putfield        #42  <Field int mAddingObserverCounter>
		for(; observerwithstate.mState.compareTo(((Enum) (state))) < 0 && mObserverMap.contains(((Object) (lifecycleobserver))); state = calculateTargetState(lifecycleobserver))
	//*  53  107:aload           4
	//*  54  109:getfield        #88  <Field Lifecycle$State LifecycleRegistry$ObserverWithState.mState>
	//*  55  112:aload_3         
	//*  56  113:invokevirtual   #92  <Method int Lifecycle$State.compareTo(Enum)>
	//*  57  116:ifge            167
	//*  58  119:aload_0         
	//*  59  120:getfield        #40  <Field FastSafeIterableMap mObserverMap>
	//*  60  123:aload_1         
	//*  61  124:invokevirtual   #99  <Method boolean FastSafeIterableMap.contains(Object)>
	//*  62  127:ifeq            167
		{
			pushParentState(observerwithstate.mState);
	//   63  130:aload_0         
	//   64  131:aload           4
	//   65  133:getfield        #88  <Field Lifecycle$State LifecycleRegistry$ObserverWithState.mState>
	//   66  136:invokespecial   #111 <Method void pushParentState(Lifecycle$State)>
			observerwithstate.dispatchEvent(lifecycleowner, upEvent(observerwithstate.mState));
	//   67  139:aload           4
	//   68  141:aload           5
	//   69  143:aload           4
	//   70  145:getfield        #88  <Field Lifecycle$State LifecycleRegistry$ObserverWithState.mState>
	//   71  148:invokestatic    #188 <Method Lifecycle$Event upEvent(Lifecycle$State)>
	//   72  151:invokevirtual   #115 <Method void LifecycleRegistry$ObserverWithState.dispatchEvent(LifecycleOwner, Lifecycle$Event)>
			popParentState();
	//   73  154:aload_0         
	//   74  155:invokespecial   #118 <Method void popParentState()>
		}

	//   75  158:aload_0         
	//   76  159:aload_1         
	//   77  160:invokespecial   #264 <Method Lifecycle$State calculateTargetState(LifecycleObserver)>
	//   78  163:astore_3        
	//*  79  164:goto            107
		if(!flag)
	//*  80  167:iload_2         
	//*  81  168:ifne            175
			sync();
	//   82  171:aload_0         
	//   83  172:invokespecial   #220 <Method void sync()>
		mAddingObserverCounter = mAddingObserverCounter - 1;
	//   84  175:aload_0         
	//   85  176:aload_0         
	//   86  177:getfield        #42  <Field int mAddingObserverCounter>
	//   87  180:iconst_1        
	//   88  181:isub            
	//   89  182:putfield        #42  <Field int mAddingObserverCounter>
	//   90  185:return          
	}

	public Lifecycle.State getCurrentState()
	{
		return mState;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Lifecycle$State mState>
	//    2    4:areturn         
	}

	public int getObserverCount()
	{
		return mObserverMap.size();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field FastSafeIterableMap mObserverMap>
	//    2    4:invokevirtual   #208 <Method int FastSafeIterableMap.size()>
	//    3    7:ireturn         
	}

	public void handleLifecycleEvent(Lifecycle.Event event)
	{
		moveToState(getStateAfter(event));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #107 <Method Lifecycle$State getStateAfter(Lifecycle$Event)>
	//    3    5:invokespecial   #272 <Method void moveToState(Lifecycle$State)>
	//    4    8:return          
	}

	public void markState(Lifecycle.State state)
	{
		moveToState(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #272 <Method void moveToState(Lifecycle$State)>
	//    3    5:return          
	}

	public void removeObserver(LifecycleObserver lifecycleobserver)
	{
		mObserverMap.remove(((Object) (lifecycleobserver)));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field FastSafeIterableMap mObserverMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #278 <Method Object FastSafeIterableMap.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	private static final String LOG_TAG = "LifecycleRegistry";
	private int mAddingObserverCounter;
	private boolean mHandlingEvent;
	private final WeakReference mLifecycleOwner;
	private boolean mNewEventOccurred;
	private FastSafeIterableMap mObserverMap;
	private ArrayList mParentStates;
	private Lifecycle.State mState;
}
