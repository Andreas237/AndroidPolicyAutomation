// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package rx;

import java.util.*;
import java.util.concurrent.*;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Action2;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.functions.Func5;
import rx.functions.Func6;
import rx.functions.Func7;
import rx.functions.Func8;
import rx.functions.Func9;
import rx.functions.FuncN;
import rx.functions.Functions;
import rx.internal.operators.CachedObservable;
import rx.internal.operators.OnSubscribeAmb;
import rx.internal.operators.OnSubscribeCombineLatest;
import rx.internal.operators.OnSubscribeConcatMap;
import rx.internal.operators.OnSubscribeDefer;
import rx.internal.operators.OnSubscribeDelaySubscription;
import rx.internal.operators.OnSubscribeDelaySubscriptionOther;
import rx.internal.operators.OnSubscribeDelaySubscriptionWithSelector;
import rx.internal.operators.OnSubscribeFromArray;
import rx.internal.operators.OnSubscribeFromCallable;
import rx.internal.operators.OnSubscribeFromIterable;
import rx.internal.operators.OnSubscribeGroupJoin;
import rx.internal.operators.OnSubscribeJoin;
import rx.internal.operators.OnSubscribeRange;
import rx.internal.operators.OnSubscribeRedo;
import rx.internal.operators.OnSubscribeSingle;
import rx.internal.operators.OnSubscribeTimerOnce;
import rx.internal.operators.OnSubscribeTimerPeriodically;
import rx.internal.operators.OnSubscribeToObservableFuture;
import rx.internal.operators.OnSubscribeUsing;
import rx.internal.operators.OperatorAll;
import rx.internal.operators.OperatorAny;
import rx.internal.operators.OperatorAsObservable;
import rx.internal.operators.OperatorBufferWithSingleObservable;
import rx.internal.operators.OperatorBufferWithSize;
import rx.internal.operators.OperatorBufferWithStartEndObservable;
import rx.internal.operators.OperatorBufferWithTime;
import rx.internal.operators.OperatorCast;
import rx.internal.operators.OperatorDebounceWithSelector;
import rx.internal.operators.OperatorDebounceWithTime;
import rx.internal.operators.OperatorDelay;
import rx.internal.operators.OperatorDelayWithSelector;
import rx.internal.operators.OperatorDematerialize;
import rx.internal.operators.OperatorDistinct;
import rx.internal.operators.OperatorDistinctUntilChanged;
import rx.internal.operators.OperatorDoAfterTerminate;
import rx.internal.operators.OperatorDoOnEach;
import rx.internal.operators.OperatorDoOnRequest;
import rx.internal.operators.OperatorDoOnSubscribe;
import rx.internal.operators.OperatorDoOnUnsubscribe;
import rx.internal.operators.OperatorEagerConcatMap;
import rx.internal.operators.OperatorElementAt;
import rx.internal.operators.OperatorFilter;
import rx.internal.operators.OperatorGroupBy;
import rx.internal.operators.OperatorIgnoreElements;
import rx.internal.operators.OperatorMap;
import rx.internal.operators.OperatorMapNotification;
import rx.internal.operators.OperatorMapPair;
import rx.internal.operators.OperatorMaterialize;
import rx.internal.operators.OperatorMerge;
import rx.internal.operators.OperatorObserveOn;
import rx.internal.operators.OperatorOnBackpressureBuffer;
import rx.internal.operators.OperatorOnBackpressureDrop;
import rx.internal.operators.OperatorOnBackpressureLatest;
import rx.internal.operators.OperatorOnErrorResumeNextViaFunction;
import rx.internal.operators.OperatorPublish;
import rx.internal.operators.OperatorReplay;
import rx.internal.operators.OperatorRetryWithPredicate;
import rx.internal.operators.OperatorSampleWithObservable;
import rx.internal.operators.OperatorSampleWithTime;
import rx.internal.operators.OperatorScan;
import rx.internal.operators.OperatorSequenceEqual;
import rx.internal.operators.OperatorSerialize;
import rx.internal.operators.OperatorSingle;
import rx.internal.operators.OperatorSkip;
import rx.internal.operators.OperatorSkipLast;
import rx.internal.operators.OperatorSkipLastTimed;
import rx.internal.operators.OperatorSkipTimed;
import rx.internal.operators.OperatorSkipUntil;
import rx.internal.operators.OperatorSkipWhile;
import rx.internal.operators.OperatorSubscribeOn;
import rx.internal.operators.OperatorSwitch;
import rx.internal.operators.OperatorSwitchIfEmpty;
import rx.internal.operators.OperatorTake;
import rx.internal.operators.OperatorTakeLast;
import rx.internal.operators.OperatorTakeLastOne;
import rx.internal.operators.OperatorTakeLastTimed;
import rx.internal.operators.OperatorTakeTimed;
import rx.internal.operators.OperatorTakeUntil;
import rx.internal.operators.OperatorTakeUntilPredicate;
import rx.internal.operators.OperatorTakeWhile;
import rx.internal.operators.OperatorThrottleFirst;
import rx.internal.operators.OperatorTimeInterval;
import rx.internal.operators.OperatorTimeout;
import rx.internal.operators.OperatorTimeoutWithSelector;
import rx.internal.operators.OperatorTimestamp;
import rx.internal.operators.OperatorToMap;
import rx.internal.operators.OperatorToMultimap;
import rx.internal.operators.OperatorToObservableList;
import rx.internal.operators.OperatorToObservableSortedList;
import rx.internal.operators.OperatorUnsubscribeOn;
import rx.internal.operators.OperatorWindowWithObservable;
import rx.internal.operators.OperatorWindowWithObservableFactory;
import rx.internal.operators.OperatorWindowWithSize;
import rx.internal.operators.OperatorWindowWithStartEndObservable;
import rx.internal.operators.OperatorWindowWithTime;
import rx.internal.operators.OperatorWithLatestFrom;
import rx.internal.operators.OperatorZip;
import rx.internal.operators.OperatorZipIterable;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.UtilityFunctions;
import rx.observables.AsyncOnSubscribe;
import rx.observables.BlockingObservable;
import rx.observables.ConnectableObservable;
import rx.observables.SyncOnSubscribe;
import rx.observers.SafeSubscriber;
import rx.plugins.RxJavaObservableExecutionHook;
import rx.plugins.RxJavaPlugins;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx:
//			Subscriber, Completable, Single, Subscription, 
//			Scheduler, Observer

public class Observable
{

	protected Observable(OnSubscribe onsubscribe)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		onSubscribe = onsubscribe;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #49  <Field Observable$OnSubscribe onSubscribe>
	//    5    9:return          
	}

	public static Observable amb(Iterable iterable)
	{
		return create(OnSubscribeAmb.amb(iterable));
	//    0    0:aload_0         
	//    1    1:invokestatic    #63  <Method Observable$OnSubscribe OnSubscribeAmb.amb(Iterable)>
	//    2    4:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    3    7:areturn         
	}

	public static Observable amb(Observable observable, Observable observable1)
	{
		return create(OnSubscribeAmb.amb(observable, observable1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #72  <Method Observable$OnSubscribe OnSubscribeAmb.amb(Observable, Observable)>
	//    3    5:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    4    8:areturn         
	}

	public static Observable amb(Observable observable, Observable observable1, Observable observable2)
	{
		return create(OnSubscribeAmb.amb(observable, observable1, observable2));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #77  <Method Observable$OnSubscribe OnSubscribeAmb.amb(Observable, Observable, Observable)>
	//    4    6:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    5    9:areturn         
	}

	public static Observable amb(Observable observable, Observable observable1, Observable observable2, Observable observable3)
	{
		return create(OnSubscribeAmb.amb(observable, observable1, observable2, observable3));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #82  <Method Observable$OnSubscribe OnSubscribeAmb.amb(Observable, Observable, Observable, Observable)>
	//    5    7:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    6   10:areturn         
	}

	public static Observable amb(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4)
	{
		return create(OnSubscribeAmb.amb(observable, observable1, observable2, observable3, observable4));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #87  <Method Observable$OnSubscribe OnSubscribeAmb.amb(Observable, Observable, Observable, Observable, Observable)>
	//    6    9:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    7   12:areturn         
	}

	public static Observable amb(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5)
	{
		return create(OnSubscribeAmb.amb(observable, observable1, observable2, observable3, observable4, observable5));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokestatic    #92  <Method Observable$OnSubscribe OnSubscribeAmb.amb(Observable, Observable, Observable, Observable, Observable, Observable)>
	//    7   11:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    8   14:areturn         
	}

	public static Observable amb(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6)
	{
		return create(OnSubscribeAmb.amb(observable, observable1, observable2, observable3, observable4, observable5, observable6));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokestatic    #97  <Method Observable$OnSubscribe OnSubscribeAmb.amb(Observable, Observable, Observable, Observable, Observable, Observable, Observable)>
	//    8   13:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    9   16:areturn         
	}

	public static Observable amb(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7)
	{
		return create(OnSubscribeAmb.amb(observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:invokestatic    #102 <Method Observable$OnSubscribe OnSubscribeAmb.amb(Observable, Observable, Observable, Observable, Observable, Observable, Observable, Observable)>
	//    9   15:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//   10   18:areturn         
	}

	public static Observable amb(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
			Observable observable8)
	{
		return create(OnSubscribeAmb.amb(observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7, observable8));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:aload           8
	//    9   14:invokestatic    #107 <Method Observable$OnSubscribe OnSubscribeAmb.amb(Observable, Observable, Observable, Observable, Observable, Observable, Observable, Observable, Observable)>
	//   10   17:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//   11   20:areturn         
	}

	public static Observable combineLatest(Iterable iterable, FuncN funcn)
	{
		return create(((OnSubscribe) (new OnSubscribeCombineLatest(iterable, funcn))));
	//    0    0:new             #112 <Class OnSubscribeCombineLatest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #115 <Method void OnSubscribeCombineLatest(Iterable, FuncN)>
	//    5    9:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    6   12:areturn         
	}

	public static Observable combineLatest(List list, FuncN funcn)
	{
		return create(((OnSubscribe) (new OnSubscribeCombineLatest(((Iterable) (list)), funcn))));
	//    0    0:new             #112 <Class OnSubscribeCombineLatest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #115 <Method void OnSubscribeCombineLatest(Iterable, FuncN)>
	//    5    9:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    6   12:areturn         
	}

	public static Observable combineLatest(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
			Observable observable8, Func9 func9)
	{
		return combineLatest(Arrays.asList(((Object []) (new Observable[] {
			observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7, observable8
		}))), Functions.fromFunc(func9));
	//    0    0:bipush          9
	//    1    2:anewarray       Observable[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:dup             
	//   27   32:bipush          6
	//   28   34:aload           6
	//   29   36:aastore         
	//   30   37:dup             
	//   31   38:bipush          7
	//   32   40:aload           7
	//   33   42:aastore         
	//   34   43:dup             
	//   35   44:bipush          8
	//   36   46:aload           8
	//   37   48:aastore         
	//   38   49:invokestatic    #125 <Method List Arrays.asList(Object[])>
	//   39   52:aload           9
	//   40   54:invokestatic    #131 <Method FuncN Functions.fromFunc(Func9)>
	//   41   57:invokestatic    #133 <Method Observable combineLatest(List, FuncN)>
	//   42   60:areturn         
	}

	public static Observable combineLatest(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
			Func8 func8)
	{
		return combineLatest(Arrays.asList(((Object []) (new Observable[] {
			observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7
		}))), Functions.fromFunc(func8));
	//    0    0:bipush          8
	//    1    2:anewarray       Observable[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:dup             
	//   27   32:bipush          6
	//   28   34:aload           6
	//   29   36:aastore         
	//   30   37:dup             
	//   31   38:bipush          7
	//   32   40:aload           7
	//   33   42:aastore         
	//   34   43:invokestatic    #125 <Method List Arrays.asList(Object[])>
	//   35   46:aload           8
	//   36   48:invokestatic    #138 <Method FuncN Functions.fromFunc(Func8)>
	//   37   51:invokestatic    #133 <Method Observable combineLatest(List, FuncN)>
	//   38   54:areturn         
	}

	public static Observable combineLatest(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Func7 func7)
	{
		return combineLatest(Arrays.asList(((Object []) (new Observable[] {
			observable, observable1, observable2, observable3, observable4, observable5, observable6
		}))), Functions.fromFunc(func7));
	//    0    0:bipush          7
	//    1    2:anewarray       Observable[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:dup             
	//   27   32:bipush          6
	//   28   34:aload           6
	//   29   36:aastore         
	//   30   37:invokestatic    #125 <Method List Arrays.asList(Object[])>
	//   31   40:aload           7
	//   32   42:invokestatic    #143 <Method FuncN Functions.fromFunc(Func7)>
	//   33   45:invokestatic    #133 <Method Observable combineLatest(List, FuncN)>
	//   34   48:areturn         
	}

	public static Observable combineLatest(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Func6 func6)
	{
		return combineLatest(Arrays.asList(((Object []) (new Observable[] {
			observable, observable1, observable2, observable3, observable4, observable5
		}))), Functions.fromFunc(func6));
	//    0    0:bipush          6
	//    1    2:anewarray       Observable[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:invokestatic    #125 <Method List Arrays.asList(Object[])>
	//   27   34:aload           6
	//   28   36:invokestatic    #148 <Method FuncN Functions.fromFunc(Func6)>
	//   29   39:invokestatic    #133 <Method Observable combineLatest(List, FuncN)>
	//   30   42:areturn         
	}

	public static Observable combineLatest(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Func5 func5)
	{
		return combineLatest(Arrays.asList(((Object []) (new Observable[] {
			observable, observable1, observable2, observable3, observable4
		}))), Functions.fromFunc(func5));
	//    0    0:iconst_5        
	//    1    1:anewarray       Observable[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:aload_2         
	//   13   15:aastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:aload_3         
	//   17   19:aastore         
	//   18   20:dup             
	//   19   21:iconst_4        
	//   20   22:aload           4
	//   21   24:aastore         
	//   22   25:invokestatic    #125 <Method List Arrays.asList(Object[])>
	//   23   28:aload           5
	//   24   30:invokestatic    #153 <Method FuncN Functions.fromFunc(Func5)>
	//   25   33:invokestatic    #133 <Method Observable combineLatest(List, FuncN)>
	//   26   36:areturn         
	}

	public static Observable combineLatest(Observable observable, Observable observable1, Observable observable2, Observable observable3, Func4 func4)
	{
		return combineLatest(Arrays.asList(((Object []) (new Observable[] {
			observable, observable1, observable2, observable3
		}))), Functions.fromFunc(func4));
	//    0    0:iconst_4        
	//    1    1:anewarray       Observable[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:aload_2         
	//   13   15:aastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:aload_3         
	//   17   19:aastore         
	//   18   20:invokestatic    #125 <Method List Arrays.asList(Object[])>
	//   19   23:aload           4
	//   20   25:invokestatic    #158 <Method FuncN Functions.fromFunc(Func4)>
	//   21   28:invokestatic    #133 <Method Observable combineLatest(List, FuncN)>
	//   22   31:areturn         
	}

	public static Observable combineLatest(Observable observable, Observable observable1, Observable observable2, Func3 func3)
	{
		return combineLatest(Arrays.asList(((Object []) (new Observable[] {
			observable, observable1, observable2
		}))), Functions.fromFunc(func3));
	//    0    0:iconst_3        
	//    1    1:anewarray       Observable[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:aload_2         
	//   13   15:aastore         
	//   14   16:invokestatic    #125 <Method List Arrays.asList(Object[])>
	//   15   19:aload_3         
	//   16   20:invokestatic    #163 <Method FuncN Functions.fromFunc(Func3)>
	//   17   23:invokestatic    #133 <Method Observable combineLatest(List, FuncN)>
	//   18   26:areturn         
	}

	public static Observable combineLatest(Observable observable, Observable observable1, Func2 func2)
	{
		return combineLatest(Arrays.asList(((Object []) (new Observable[] {
			observable, observable1
		}))), Functions.fromFunc(func2));
	//    0    0:iconst_2        
	//    1    1:anewarray       Observable[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:invokestatic    #125 <Method List Arrays.asList(Object[])>
	//   11   15:aload_2         
	//   12   16:invokestatic    #168 <Method FuncN Functions.fromFunc(Func2)>
	//   13   19:invokestatic    #133 <Method Observable combineLatest(List, FuncN)>
	//   14   22:areturn         
	}

	public static Observable combineLatestDelayError(Iterable iterable, FuncN funcn)
	{
		return create(((OnSubscribe) (new OnSubscribeCombineLatest(((Observable []) (null)), iterable, funcn, RxRingBuffer.SIZE, true))));
	//    0    0:new             #112 <Class OnSubscribeCombineLatest>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getstatic       #176 <Field int RxRingBuffer.SIZE>
	//    6   10:iconst_1        
	//    7   11:invokespecial   #179 <Method void OnSubscribeCombineLatest(Observable[], Iterable, FuncN, int, boolean)>
	//    8   14:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    9   17:areturn         
	}

	public static Observable concat(Observable observable)
	{
		return observable.concatMap(UtilityFunctions.identity());
	//    0    0:aload_0         
	//    1    1:invokestatic    #187 <Method Func1 UtilityFunctions.identity()>
	//    2    4:invokevirtual   #191 <Method Observable concatMap(Func1)>
	//    3    7:areturn         
	}

	public static Observable concat(Observable observable, Observable observable1)
	{
		return concat(just(((Object) (observable)), ((Object) (observable1))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #196 <Method Observable just(Object, Object)>
	//    3    5:invokestatic    #198 <Method Observable concat(Observable)>
	//    4    8:areturn         
	}

	public static Observable concat(Observable observable, Observable observable1, Observable observable2)
	{
		return concat(just(((Object) (observable)), ((Object) (observable1)), ((Object) (observable2))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #201 <Method Observable just(Object, Object, Object)>
	//    4    6:invokestatic    #198 <Method Observable concat(Observable)>
	//    5    9:areturn         
	}

	public static Observable concat(Observable observable, Observable observable1, Observable observable2, Observable observable3)
	{
		return concat(just(((Object) (observable)), ((Object) (observable1)), ((Object) (observable2)), ((Object) (observable3))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #204 <Method Observable just(Object, Object, Object, Object)>
	//    5    7:invokestatic    #198 <Method Observable concat(Observable)>
	//    6   10:areturn         
	}

	public static Observable concat(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4)
	{
		return concat(just(((Object) (observable)), ((Object) (observable1)), ((Object) (observable2)), ((Object) (observable3)), ((Object) (observable4))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #207 <Method Observable just(Object, Object, Object, Object, Object)>
	//    6    9:invokestatic    #198 <Method Observable concat(Observable)>
	//    7   12:areturn         
	}

	public static Observable concat(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5)
	{
		return concat(just(((Object) (observable)), ((Object) (observable1)), ((Object) (observable2)), ((Object) (observable3)), ((Object) (observable4)), ((Object) (observable5))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokestatic    #210 <Method Observable just(Object, Object, Object, Object, Object, Object)>
	//    7   11:invokestatic    #198 <Method Observable concat(Observable)>
	//    8   14:areturn         
	}

	public static Observable concat(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6)
	{
		return concat(just(((Object) (observable)), ((Object) (observable1)), ((Object) (observable2)), ((Object) (observable3)), ((Object) (observable4)), ((Object) (observable5)), ((Object) (observable6))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokestatic    #213 <Method Observable just(Object, Object, Object, Object, Object, Object, Object)>
	//    8   13:invokestatic    #198 <Method Observable concat(Observable)>
	//    9   16:areturn         
	}

	public static Observable concat(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7)
	{
		return concat(just(((Object) (observable)), ((Object) (observable1)), ((Object) (observable2)), ((Object) (observable3)), ((Object) (observable4)), ((Object) (observable5)), ((Object) (observable6)), ((Object) (observable7))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:invokestatic    #216 <Method Observable just(Object, Object, Object, Object, Object, Object, Object, Object)>
	//    9   15:invokestatic    #198 <Method Observable concat(Observable)>
	//   10   18:areturn         
	}

	public static Observable concat(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
			Observable observable8)
	{
		return concat(just(((Object) (observable)), ((Object) (observable1)), ((Object) (observable2)), ((Object) (observable3)), ((Object) (observable4)), ((Object) (observable5)), ((Object) (observable6)), ((Object) (observable7)), ((Object) (observable8))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:aload           8
	//    9   14:invokestatic    #219 <Method Observable just(Object, Object, Object, Object, Object, Object, Object, Object, Object)>
	//   10   17:invokestatic    #198 <Method Observable concat(Observable)>
	//   11   20:areturn         
	}

	public static Observable concatDelayError(Iterable iterable)
	{
		return concatDelayError(from(iterable));
	//    0    0:aload_0         
	//    1    1:invokestatic    #224 <Method Observable from(Iterable)>
	//    2    4:invokestatic    #226 <Method Observable concatDelayError(Observable)>
	//    3    7:areturn         
	}

	public static Observable concatDelayError(Observable observable)
	{
		return observable.concatMapDelayError(UtilityFunctions.identity());
	//    0    0:aload_0         
	//    1    1:invokestatic    #187 <Method Func1 UtilityFunctions.identity()>
	//    2    4:invokevirtual   #230 <Method Observable concatMapDelayError(Func1)>
	//    3    7:areturn         
	}

	public static Observable concatEager(Iterable iterable)
	{
		return from(iterable).concatMapEager(UtilityFunctions.identity());
	//    0    0:aload_0         
	//    1    1:invokestatic    #224 <Method Observable from(Iterable)>
	//    2    4:invokestatic    #187 <Method Func1 UtilityFunctions.identity()>
	//    3    7:invokevirtual   #234 <Method Observable concatMapEager(Func1)>
	//    4   10:areturn         
	}

	public static Observable concatEager(Iterable iterable, int i)
	{
		return from(iterable).concatMapEager(UtilityFunctions.identity(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #224 <Method Observable from(Iterable)>
	//    2    4:invokestatic    #187 <Method Func1 UtilityFunctions.identity()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #238 <Method Observable concatMapEager(Func1, int)>
	//    5   11:areturn         
	}

	public static Observable concatEager(Observable observable)
	{
		return observable.concatMapEager(UtilityFunctions.identity());
	//    0    0:aload_0         
	//    1    1:invokestatic    #187 <Method Func1 UtilityFunctions.identity()>
	//    2    4:invokevirtual   #234 <Method Observable concatMapEager(Func1)>
	//    3    7:areturn         
	}

	public static Observable concatEager(Observable observable, int i)
	{
		return observable.concatMapEager(UtilityFunctions.identity(), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #187 <Method Func1 UtilityFunctions.identity()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #238 <Method Observable concatMapEager(Func1, int)>
	//    4    8:areturn         
	}

	public static Observable concatEager(Observable observable, Observable observable1)
	{
		return concatEager(((Iterable) (Arrays.asList(((Object []) (new Observable[] {
			observable, observable1
		}))))));
	//    0    0:iconst_2        
	//    1    1:anewarray       Observable[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:invokestatic    #125 <Method List Arrays.asList(Object[])>
	//   11   15:invokestatic    #243 <Method Observable concatEager(Iterable)>
	//   12   18:areturn         
	}

	public static Observable concatEager(Observable observable, Observable observable1, Observable observable2)
	{
		return concatEager(((Iterable) (Arrays.asList(((Object []) (new Observable[] {
			observable, observable1, observable2
		}))))));
	//    0    0:iconst_3        
	//    1    1:anewarray       Observable[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:aload_2         
	//   13   15:aastore         
	//   14   16:invokestatic    #125 <Method List Arrays.asList(Object[])>
	//   15   19:invokestatic    #243 <Method Observable concatEager(Iterable)>
	//   16   22:areturn         
	}

	public static Observable concatEager(Observable observable, Observable observable1, Observable observable2, Observable observable3)
	{
		return concatEager(((Iterable) (Arrays.asList(((Object []) (new Observable[] {
			observable, observable1, observable2, observable3
		}))))));
	//    0    0:iconst_4        
	//    1    1:anewarray       Observable[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:aload_2         
	//   13   15:aastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:aload_3         
	//   17   19:aastore         
	//   18   20:invokestatic    #125 <Method List Arrays.asList(Object[])>
	//   19   23:invokestatic    #243 <Method Observable concatEager(Iterable)>
	//   20   26:areturn         
	}

	public static Observable concatEager(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4)
	{
		return concatEager(((Iterable) (Arrays.asList(((Object []) (new Observable[] {
			observable, observable1, observable2, observable3, observable4
		}))))));
	//    0    0:iconst_5        
	//    1    1:anewarray       Observable[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:aload_2         
	//   13   15:aastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:aload_3         
	//   17   19:aastore         
	//   18   20:dup             
	//   19   21:iconst_4        
	//   20   22:aload           4
	//   21   24:aastore         
	//   22   25:invokestatic    #125 <Method List Arrays.asList(Object[])>
	//   23   28:invokestatic    #243 <Method Observable concatEager(Iterable)>
	//   24   31:areturn         
	}

	public static Observable concatEager(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5)
	{
		return concatEager(((Iterable) (Arrays.asList(((Object []) (new Observable[] {
			observable, observable1, observable2, observable3, observable4, observable5
		}))))));
	//    0    0:bipush          6
	//    1    2:anewarray       Observable[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:invokestatic    #125 <Method List Arrays.asList(Object[])>
	//   27   34:invokestatic    #243 <Method Observable concatEager(Iterable)>
	//   28   37:areturn         
	}

	public static Observable concatEager(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6)
	{
		return concatEager(((Iterable) (Arrays.asList(((Object []) (new Observable[] {
			observable, observable1, observable2, observable3, observable4, observable5, observable6
		}))))));
	//    0    0:bipush          7
	//    1    2:anewarray       Observable[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:dup             
	//   27   32:bipush          6
	//   28   34:aload           6
	//   29   36:aastore         
	//   30   37:invokestatic    #125 <Method List Arrays.asList(Object[])>
	//   31   40:invokestatic    #243 <Method Observable concatEager(Iterable)>
	//   32   43:areturn         
	}

	public static Observable concatEager(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7)
	{
		return concatEager(((Iterable) (Arrays.asList(((Object []) (new Observable[] {
			observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7
		}))))));
	//    0    0:bipush          8
	//    1    2:anewarray       Observable[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:dup             
	//   27   32:bipush          6
	//   28   34:aload           6
	//   29   36:aastore         
	//   30   37:dup             
	//   31   38:bipush          7
	//   32   40:aload           7
	//   33   42:aastore         
	//   34   43:invokestatic    #125 <Method List Arrays.asList(Object[])>
	//   35   46:invokestatic    #243 <Method Observable concatEager(Iterable)>
	//   36   49:areturn         
	}

	public static Observable concatEager(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
			Observable observable8)
	{
		return concatEager(((Iterable) (Arrays.asList(((Object []) (new Observable[] {
			observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7, observable8
		}))))));
	//    0    0:bipush          9
	//    1    2:anewarray       Observable[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:dup             
	//   27   32:bipush          6
	//   28   34:aload           6
	//   29   36:aastore         
	//   30   37:dup             
	//   31   38:bipush          7
	//   32   40:aload           7
	//   33   42:aastore         
	//   34   43:dup             
	//   35   44:bipush          8
	//   36   46:aload           8
	//   37   48:aastore         
	//   38   49:invokestatic    #125 <Method List Arrays.asList(Object[])>
	//   39   52:invokestatic    #243 <Method Observable concatEager(Iterable)>
	//   40   55:areturn         
	}

	public static Observable create(OnSubscribe onsubscribe)
	{
		return new Observable(hook.onCreate(onsubscribe));
	//    0    0:new             #2   <Class Observable>
	//    1    3:dup             
	//    2    4:getstatic       #42  <Field RxJavaObservableExecutionHook hook>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #249 <Method Observable$OnSubscribe RxJavaObservableExecutionHook.onCreate(Observable$OnSubscribe)>
	//    5   11:invokespecial   #251 <Method void Observable(Observable$OnSubscribe)>
	//    6   14:areturn         
	}

	public static Observable create(AsyncOnSubscribe asynconsubscribe)
	{
		return new Observable(hook.onCreate(((OnSubscribe) (asynconsubscribe))));
	//    0    0:new             #2   <Class Observable>
	//    1    3:dup             
	//    2    4:getstatic       #42  <Field RxJavaObservableExecutionHook hook>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #249 <Method Observable$OnSubscribe RxJavaObservableExecutionHook.onCreate(Observable$OnSubscribe)>
	//    5   11:invokespecial   #251 <Method void Observable(Observable$OnSubscribe)>
	//    6   14:areturn         
	}

	public static Observable create(SyncOnSubscribe synconsubscribe)
	{
		return new Observable(hook.onCreate(((OnSubscribe) (synconsubscribe))));
	//    0    0:new             #2   <Class Observable>
	//    1    3:dup             
	//    2    4:getstatic       #42  <Field RxJavaObservableExecutionHook hook>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #249 <Method Observable$OnSubscribe RxJavaObservableExecutionHook.onCreate(Observable$OnSubscribe)>
	//    5   11:invokespecial   #251 <Method void Observable(Observable$OnSubscribe)>
	//    6   14:areturn         
	}

	public static Observable defer(Func0 func0)
	{
		return create(((OnSubscribe) (new OnSubscribeDefer(func0))));
	//    0    0:new             #261 <Class OnSubscribeDefer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #264 <Method void OnSubscribeDefer(Func0)>
	//    4    8:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Observable empty()
	{
	/* block-local class not found */
	class EmptyHolder {}

		return EmptyHolder.INSTANCE;
	//    0    0:getstatic       #271 <Field Observable Observable$EmptyHolder.INSTANCE>
	//    1    3:areturn         
	}

	public static Observable error(Throwable throwable)
	{
	/* block-local class not found */
	class ThrowObservable {}

		return ((Observable) (new ThrowObservable(throwable)));
	//    0    0:new             #21  <Class Observable$ThrowObservable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #277 <Method void Observable$ThrowObservable(Throwable)>
	//    4    8:areturn         
	}

	public static Observable from(Iterable iterable)
	{
		return create(((OnSubscribe) (new OnSubscribeFromIterable(iterable))));
	//    0    0:new             #280 <Class OnSubscribeFromIterable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #283 <Method void OnSubscribeFromIterable(Iterable)>
	//    4    8:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Observable from(Future future)
	{
		return create(OnSubscribeToObservableFuture.toObservableFuture(future));
	//    0    0:aload_0         
	//    1    1:invokestatic    #291 <Method Observable$OnSubscribe OnSubscribeToObservableFuture.toObservableFuture(Future)>
	//    2    4:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    3    7:areturn         
	}

	public static Observable from(Future future, long l, TimeUnit timeunit)
	{
		return create(OnSubscribeToObservableFuture.toObservableFuture(future, l, timeunit));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #296 <Method Observable$OnSubscribe OnSubscribeToObservableFuture.toObservableFuture(Future, long, TimeUnit)>
	//    4    6:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    5    9:areturn         
	}

	public static Observable from(Future future, Scheduler scheduler)
	{
		return create(OnSubscribeToObservableFuture.toObservableFuture(future)).subscribeOn(scheduler);
	//    0    0:aload_0         
	//    1    1:invokestatic    #291 <Method Observable$OnSubscribe OnSubscribeToObservableFuture.toObservableFuture(Future)>
	//    2    4:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #302 <Method Observable subscribeOn(Scheduler)>
	//    5   11:areturn         
	}

	public static Observable from(Object aobj[])
	{
		int i = aobj.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_1        
		if(i == 0)
	//*   3    3:iload_1         
	//*   4    4:ifne            11
			return empty();
	//    5    7:invokestatic    #306 <Method Observable empty()>
	//    6   10:areturn         
		if(i == 1)
	//*   7   11:iload_1         
	//*   8   12:iconst_1        
	//*   9   13:icmpne          23
			return just(aobj[0]);
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:aaload          
	//   13   19:invokestatic    #309 <Method Observable just(Object)>
	//   14   22:areturn         
		else
			return create(((OnSubscribe) (new OnSubscribeFromArray(aobj))));
	//   15   23:new             #311 <Class OnSubscribeFromArray>
	//   16   26:dup             
	//   17   27:aload_0         
	//   18   28:invokespecial   #314 <Method void OnSubscribeFromArray(Object[])>
	//   19   31:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//   20   34:areturn         
	}

	public static Observable fromCallable(Callable callable)
	{
		return create(((OnSubscribe) (new OnSubscribeFromCallable(callable))));
	//    0    0:new             #319 <Class OnSubscribeFromCallable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #322 <Method void OnSubscribeFromCallable(Callable)>
	//    4    8:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Observable interval(long l, long l1, TimeUnit timeunit)
	{
		return interval(l, l1, timeunit, Schedulers.computation());
	//    0    0:lload_0         
	//    1    1:lload_2         
	//    2    2:aload           4
	//    3    4:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    4    7:invokestatic    #334 <Method Observable interval(long, long, TimeUnit, Scheduler)>
	//    5   10:areturn         
	}

	public static Observable interval(long l, long l1, TimeUnit timeunit, Scheduler scheduler)
	{
		return create(((OnSubscribe) (new OnSubscribeTimerPeriodically(l, l1, timeunit, scheduler))));
	//    0    0:new             #337 <Class OnSubscribeTimerPeriodically>
	//    1    3:dup             
	//    2    4:lload_0         
	//    3    5:lload_2         
	//    4    6:aload           4
	//    5    8:aload           5
	//    6   10:invokespecial   #340 <Method void OnSubscribeTimerPeriodically(long, long, TimeUnit, Scheduler)>
	//    7   13:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    8   16:areturn         
	}

	public static Observable interval(long l, TimeUnit timeunit)
	{
		return interval(l, l, timeunit, Schedulers.computation());
	//    0    0:lload_0         
	//    1    1:lload_0         
	//    2    2:aload_2         
	//    3    3:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    4    6:invokestatic    #334 <Method Observable interval(long, long, TimeUnit, Scheduler)>
	//    5    9:areturn         
	}

	public static Observable interval(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return interval(l, l, timeunit, scheduler);
	//    0    0:lload_0         
	//    1    1:lload_0         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #334 <Method Observable interval(long, long, TimeUnit, Scheduler)>
	//    5    7:areturn         
	}

	public static Observable just(Object obj)
	{
		return ((Observable) (ScalarSynchronousObservable.create(obj)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #350 <Method ScalarSynchronousObservable ScalarSynchronousObservable.create(Object)>
	//    2    4:areturn         
	}

	public static Observable just(Object obj, Object obj1)
	{
		return from((Object[])(new Object[] {
			obj, obj1
		}));
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:checkcast       #353 <Class Object[]>
	//   11   15:invokestatic    #355 <Method Observable from(Object[])>
	//   12   18:areturn         
	}

	public static Observable just(Object obj, Object obj1, Object obj2)
	{
		return from((Object[])(new Object[] {
			obj, obj1, obj2
		}));
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:aload_2         
	//   13   15:aastore         
	//   14   16:checkcast       #353 <Class Object[]>
	//   15   19:invokestatic    #355 <Method Observable from(Object[])>
	//   16   22:areturn         
	}

	public static Observable just(Object obj, Object obj1, Object obj2, Object obj3)
	{
		return from((Object[])(new Object[] {
			obj, obj1, obj2, obj3
		}));
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:aload_2         
	//   13   15:aastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:aload_3         
	//   17   19:aastore         
	//   18   20:checkcast       #353 <Class Object[]>
	//   19   23:invokestatic    #355 <Method Observable from(Object[])>
	//   20   26:areturn         
	}

	public static Observable just(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
	{
		return from((Object[])(new Object[] {
			obj, obj1, obj2, obj3, obj4
		}));
	//    0    0:iconst_5        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:aload_2         
	//   13   15:aastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:aload_3         
	//   17   19:aastore         
	//   18   20:dup             
	//   19   21:iconst_4        
	//   20   22:aload           4
	//   21   24:aastore         
	//   22   25:checkcast       #353 <Class Object[]>
	//   23   28:invokestatic    #355 <Method Observable from(Object[])>
	//   24   31:areturn         
	}

	public static Observable just(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
	{
		return from((Object[])(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5
		}));
	//    0    0:bipush          6
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:checkcast       #353 <Class Object[]>
	//   27   34:invokestatic    #355 <Method Observable from(Object[])>
	//   28   37:areturn         
	}

	public static Observable just(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6)
	{
		return from((Object[])(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6
		}));
	//    0    0:bipush          7
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:dup             
	//   27   32:bipush          6
	//   28   34:aload           6
	//   29   36:aastore         
	//   30   37:checkcast       #353 <Class Object[]>
	//   31   40:invokestatic    #355 <Method Observable from(Object[])>
	//   32   43:areturn         
	}

	public static Observable just(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
	{
		return from((Object[])(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7
		}));
	//    0    0:bipush          8
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:dup             
	//   27   32:bipush          6
	//   28   34:aload           6
	//   29   36:aastore         
	//   30   37:dup             
	//   31   38:bipush          7
	//   32   40:aload           7
	//   33   42:aastore         
	//   34   43:checkcast       #353 <Class Object[]>
	//   35   46:invokestatic    #355 <Method Observable from(Object[])>
	//   36   49:areturn         
	}

	public static Observable just(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
			Object obj8)
	{
		return from((Object[])(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8
		}));
	//    0    0:bipush          9
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:dup             
	//   27   32:bipush          6
	//   28   34:aload           6
	//   29   36:aastore         
	//   30   37:dup             
	//   31   38:bipush          7
	//   32   40:aload           7
	//   33   42:aastore         
	//   34   43:dup             
	//   35   44:bipush          8
	//   36   46:aload           8
	//   37   48:aastore         
	//   38   49:checkcast       #353 <Class Object[]>
	//   39   52:invokestatic    #355 <Method Observable from(Object[])>
	//   40   55:areturn         
	}

	public static Observable just(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
			Object obj8, Object obj9)
	{
		return from((Object[])(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9
		}));
	//    0    0:bipush          10
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:dup             
	//   27   32:bipush          6
	//   28   34:aload           6
	//   29   36:aastore         
	//   30   37:dup             
	//   31   38:bipush          7
	//   32   40:aload           7
	//   33   42:aastore         
	//   34   43:dup             
	//   35   44:bipush          8
	//   36   46:aload           8
	//   37   48:aastore         
	//   38   49:dup             
	//   39   50:bipush          9
	//   40   52:aload           9
	//   41   54:aastore         
	//   42   55:checkcast       #353 <Class Object[]>
	//   43   58:invokestatic    #355 <Method Observable from(Object[])>
	//   44   61:areturn         
	}

	private Observable mapNotification(Func1 func1, Func1 func1_1, Func0 func0)
	{
		return lift(((Operator) (new OperatorMapNotification(func1, func1_1, func0))));
	//    0    0:aload_0         
	//    1    1:new             #369 <Class OperatorMapNotification>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #372 <Method void OperatorMapNotification(Func1, Func1, Func0)>
	//    7   11:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    8   14:areturn         
	}

	public static Observable merge(Iterable iterable)
	{
		return merge(from(iterable));
	//    0    0:aload_0         
	//    1    1:invokestatic    #224 <Method Observable from(Iterable)>
	//    2    4:invokestatic    #380 <Method Observable merge(Observable)>
	//    3    7:areturn         
	}

	public static Observable merge(Iterable iterable, int i)
	{
		return merge(from(iterable), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #224 <Method Observable from(Iterable)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #382 <Method Observable merge(Observable, int)>
	//    4    8:areturn         
	}

	public static Observable merge(Observable observable)
	{
		if(((Object) (observable)).getClass() == rx/internal/util/ScalarSynchronousObservable)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #386 <Method Class Object.getClass()>
	//*   2    4:ldc2            #347 <Class ScalarSynchronousObservable>
	//*   3    7:if_acmpne       21
			return ((ScalarSynchronousObservable)observable).scalarFlatMap(UtilityFunctions.identity());
	//    4   10:aload_0         
	//    5   11:checkcast       #347 <Class ScalarSynchronousObservable>
	//    6   14:invokestatic    #187 <Method Func1 UtilityFunctions.identity()>
	//    7   17:invokevirtual   #389 <Method Observable ScalarSynchronousObservable.scalarFlatMap(Func1)>
	//    8   20:areturn         
		else
			return observable.lift(((Operator) (OperatorMerge.instance(false))));
	//    9   21:aload_0         
	//   10   22:iconst_0        
	//   11   23:invokestatic    #395 <Method OperatorMerge OperatorMerge.instance(boolean)>
	//   12   26:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   13   29:areturn         
	}

	public static Observable merge(Observable observable, int i)
	{
		if(((Object) (observable)).getClass() == rx/internal/util/ScalarSynchronousObservable)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #386 <Method Class Object.getClass()>
	//*   2    4:ldc2            #347 <Class ScalarSynchronousObservable>
	//*   3    7:if_acmpne       21
			return ((ScalarSynchronousObservable)observable).scalarFlatMap(UtilityFunctions.identity());
	//    4   10:aload_0         
	//    5   11:checkcast       #347 <Class ScalarSynchronousObservable>
	//    6   14:invokestatic    #187 <Method Func1 UtilityFunctions.identity()>
	//    7   17:invokevirtual   #389 <Method Observable ScalarSynchronousObservable.scalarFlatMap(Func1)>
	//    8   20:areturn         
		else
			return observable.lift(((Operator) (OperatorMerge.instance(false, i))));
	//    9   21:aload_0         
	//   10   22:iconst_0        
	//   11   23:iload_1         
	//   12   24:invokestatic    #398 <Method OperatorMerge OperatorMerge.instance(boolean, int)>
	//   13   27:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   14   30:areturn         
	}

	public static Observable merge(Observable observable, Observable observable1)
	{
		return merge(new Observable[] {
			observable, observable1
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Observable[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:invokestatic    #401 <Method Observable merge(Observable[])>
	//   11   15:areturn         
	}

	public static Observable merge(Observable observable, Observable observable1, Observable observable2)
	{
		return merge(new Observable[] {
			observable, observable1, observable2
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Observable[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:aload_2         
	//   13   15:aastore         
	//   14   16:invokestatic    #401 <Method Observable merge(Observable[])>
	//   15   19:areturn         
	}

	public static Observable merge(Observable observable, Observable observable1, Observable observable2, Observable observable3)
	{
		return merge(new Observable[] {
			observable, observable1, observable2, observable3
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Observable[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:aload_2         
	//   13   15:aastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:aload_3         
	//   17   19:aastore         
	//   18   20:invokestatic    #401 <Method Observable merge(Observable[])>
	//   19   23:areturn         
	}

	public static Observable merge(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4)
	{
		return merge(new Observable[] {
			observable, observable1, observable2, observable3, observable4
		});
	//    0    0:iconst_5        
	//    1    1:anewarray       Observable[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:aload_2         
	//   13   15:aastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:aload_3         
	//   17   19:aastore         
	//   18   20:dup             
	//   19   21:iconst_4        
	//   20   22:aload           4
	//   21   24:aastore         
	//   22   25:invokestatic    #401 <Method Observable merge(Observable[])>
	//   23   28:areturn         
	}

	public static Observable merge(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5)
	{
		return merge(new Observable[] {
			observable, observable1, observable2, observable3, observable4, observable5
		});
	//    0    0:bipush          6
	//    1    2:anewarray       Observable[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:invokestatic    #401 <Method Observable merge(Observable[])>
	//   27   34:areturn         
	}

	public static Observable merge(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6)
	{
		return merge(new Observable[] {
			observable, observable1, observable2, observable3, observable4, observable5, observable6
		});
	//    0    0:bipush          7
	//    1    2:anewarray       Observable[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:dup             
	//   27   32:bipush          6
	//   28   34:aload           6
	//   29   36:aastore         
	//   30   37:invokestatic    #401 <Method Observable merge(Observable[])>
	//   31   40:areturn         
	}

	public static Observable merge(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7)
	{
		return merge(new Observable[] {
			observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7
		});
	//    0    0:bipush          8
	//    1    2:anewarray       Observable[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:dup             
	//   27   32:bipush          6
	//   28   34:aload           6
	//   29   36:aastore         
	//   30   37:dup             
	//   31   38:bipush          7
	//   32   40:aload           7
	//   33   42:aastore         
	//   34   43:invokestatic    #401 <Method Observable merge(Observable[])>
	//   35   46:areturn         
	}

	public static Observable merge(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
			Observable observable8)
	{
		return merge(new Observable[] {
			observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7, observable8
		});
	//    0    0:bipush          9
	//    1    2:anewarray       Observable[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:dup             
	//   27   32:bipush          6
	//   28   34:aload           6
	//   29   36:aastore         
	//   30   37:dup             
	//   31   38:bipush          7
	//   32   40:aload           7
	//   33   42:aastore         
	//   34   43:dup             
	//   35   44:bipush          8
	//   36   46:aload           8
	//   37   48:aastore         
	//   38   49:invokestatic    #401 <Method Observable merge(Observable[])>
	//   39   52:areturn         
	}

	public static Observable merge(Observable aobservable[])
	{
		return merge(from(((Object []) (aobservable))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #355 <Method Observable from(Object[])>
	//    2    4:invokestatic    #380 <Method Observable merge(Observable)>
	//    3    7:areturn         
	}

	public static Observable merge(Observable aobservable[], int i)
	{
		return merge(from(((Object []) (aobservable))), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #355 <Method Observable from(Object[])>
	//    2    4:iload_1         
	//    3    5:invokestatic    #382 <Method Observable merge(Observable, int)>
	//    4    8:areturn         
	}

	public static Observable mergeDelayError(Iterable iterable)
	{
		return mergeDelayError(from(iterable));
	//    0    0:aload_0         
	//    1    1:invokestatic    #224 <Method Observable from(Iterable)>
	//    2    4:invokestatic    #407 <Method Observable mergeDelayError(Observable)>
	//    3    7:areturn         
	}

	public static Observable mergeDelayError(Iterable iterable, int i)
	{
		return mergeDelayError(from(iterable), i);
	//    0    0:aload_0         
	//    1    1:invokestatic    #224 <Method Observable from(Iterable)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #409 <Method Observable mergeDelayError(Observable, int)>
	//    4    8:areturn         
	}

	public static Observable mergeDelayError(Observable observable)
	{
		return observable.lift(((Operator) (OperatorMerge.instance(true))));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #395 <Method OperatorMerge OperatorMerge.instance(boolean)>
	//    3    5:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    4    8:areturn         
	}

	public static Observable mergeDelayError(Observable observable, int i)
	{
		return observable.lift(((Operator) (OperatorMerge.instance(true, i))));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:invokestatic    #398 <Method OperatorMerge OperatorMerge.instance(boolean, int)>
	//    4    6:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    5    9:areturn         
	}

	public static Observable mergeDelayError(Observable observable, Observable observable1)
	{
		return mergeDelayError(just(((Object) (observable)), ((Object) (observable1))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #196 <Method Observable just(Object, Object)>
	//    3    5:invokestatic    #407 <Method Observable mergeDelayError(Observable)>
	//    4    8:areturn         
	}

	public static Observable mergeDelayError(Observable observable, Observable observable1, Observable observable2)
	{
		return mergeDelayError(just(((Object) (observable)), ((Object) (observable1)), ((Object) (observable2))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #201 <Method Observable just(Object, Object, Object)>
	//    4    6:invokestatic    #407 <Method Observable mergeDelayError(Observable)>
	//    5    9:areturn         
	}

	public static Observable mergeDelayError(Observable observable, Observable observable1, Observable observable2, Observable observable3)
	{
		return mergeDelayError(just(((Object) (observable)), ((Object) (observable1)), ((Object) (observable2)), ((Object) (observable3))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #204 <Method Observable just(Object, Object, Object, Object)>
	//    5    7:invokestatic    #407 <Method Observable mergeDelayError(Observable)>
	//    6   10:areturn         
	}

	public static Observable mergeDelayError(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4)
	{
		return mergeDelayError(just(((Object) (observable)), ((Object) (observable1)), ((Object) (observable2)), ((Object) (observable3)), ((Object) (observable4))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #207 <Method Observable just(Object, Object, Object, Object, Object)>
	//    6    9:invokestatic    #407 <Method Observable mergeDelayError(Observable)>
	//    7   12:areturn         
	}

	public static Observable mergeDelayError(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5)
	{
		return mergeDelayError(just(((Object) (observable)), ((Object) (observable1)), ((Object) (observable2)), ((Object) (observable3)), ((Object) (observable4)), ((Object) (observable5))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokestatic    #210 <Method Observable just(Object, Object, Object, Object, Object, Object)>
	//    7   11:invokestatic    #407 <Method Observable mergeDelayError(Observable)>
	//    8   14:areturn         
	}

	public static Observable mergeDelayError(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6)
	{
		return mergeDelayError(just(((Object) (observable)), ((Object) (observable1)), ((Object) (observable2)), ((Object) (observable3)), ((Object) (observable4)), ((Object) (observable5)), ((Object) (observable6))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokestatic    #213 <Method Observable just(Object, Object, Object, Object, Object, Object, Object)>
	//    8   13:invokestatic    #407 <Method Observable mergeDelayError(Observable)>
	//    9   16:areturn         
	}

	public static Observable mergeDelayError(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7)
	{
		return mergeDelayError(just(((Object) (observable)), ((Object) (observable1)), ((Object) (observable2)), ((Object) (observable3)), ((Object) (observable4)), ((Object) (observable5)), ((Object) (observable6)), ((Object) (observable7))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:invokestatic    #216 <Method Observable just(Object, Object, Object, Object, Object, Object, Object, Object)>
	//    9   15:invokestatic    #407 <Method Observable mergeDelayError(Observable)>
	//   10   18:areturn         
	}

	public static Observable mergeDelayError(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
			Observable observable8)
	{
		return mergeDelayError(just(((Object) (observable)), ((Object) (observable1)), ((Object) (observable2)), ((Object) (observable3)), ((Object) (observable4)), ((Object) (observable5)), ((Object) (observable6)), ((Object) (observable7)), ((Object) (observable8))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:aload           8
	//    9   14:invokestatic    #219 <Method Observable just(Object, Object, Object, Object, Object, Object, Object, Object, Object)>
	//   10   17:invokestatic    #407 <Method Observable mergeDelayError(Observable)>
	//   11   20:areturn         
	}

	public static Observable never()
	{
	/* block-local class not found */
	class NeverObservable {}

		return ((Observable) (NeverObservable.instance()));
	//    0    0:invokestatic    #413 <Method Observable$NeverObservable Observable$NeverObservable.instance()>
	//    1    3:areturn         
	}

	public static Observable range(int i, int j)
	{
		if(j < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            15
			throw new IllegalArgumentException("Count can not be negative");
	//    2    4:new             #417 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #419 <String "Count can not be negative">
	//    5   11:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(j == 0)
	//*   7   15:iload_1         
	//*   8   16:ifne            23
			return empty();
	//    9   19:invokestatic    #306 <Method Observable empty()>
	//   10   22:areturn         
		if(i > (0x7fffffff - j) + 1)
	//*  11   23:iload_0         
	//*  12   24:ldc2            #423 <Int 0x7fffffff>
	//*  13   27:iload_1         
	//*  14   28:isub            
	//*  15   29:iconst_1        
	//*  16   30:iadd            
	//*  17   31:icmple          45
			throw new IllegalArgumentException("start + count can not exceed Integer.MAX_VALUE");
	//   18   34:new             #417 <Class IllegalArgumentException>
	//   19   37:dup             
	//   20   38:ldc2            #425 <String "start + count can not exceed Integer.MAX_VALUE">
	//   21   41:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//   22   44:athrow          
		if(j == 1)
	//*  23   45:iload_1         
	//*  24   46:iconst_1        
	//*  25   47:icmpne          58
			return just(((Object) (Integer.valueOf(i))));
	//   26   50:iload_0         
	//   27   51:invokestatic    #431 <Method Integer Integer.valueOf(int)>
	//   28   54:invokestatic    #309 <Method Observable just(Object)>
	//   29   57:areturn         
		else
			return create(((OnSubscribe) (new OnSubscribeRange(i, (j - 1) + i))));
	//   30   58:new             #433 <Class OnSubscribeRange>
	//   31   61:dup             
	//   32   62:iload_0         
	//   33   63:iload_1         
	//   34   64:iconst_1        
	//   35   65:isub            
	//   36   66:iload_0         
	//   37   67:iadd            
	//   38   68:invokespecial   #436 <Method void OnSubscribeRange(int, int)>
	//   39   71:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//   40   74:areturn         
	}

	public static Observable range(int i, int j, Scheduler scheduler)
	{
		return range(i, j).subscribeOn(scheduler);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #440 <Method Observable range(int, int)>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #302 <Method Observable subscribeOn(Scheduler)>
	//    5    9:areturn         
	}

	public static Observable sequenceEqual(Observable observable, Observable observable1)
	{
		return sequenceEqual(observable, observable1, ((Func2) (new _cls3())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #444 <Class Observable$3>
	//    3    5:dup             
	//    4    6:invokespecial   #445 <Method void Observable$3()>
	//    5    9:invokestatic    #447 <Method Observable sequenceEqual(Observable, Observable, Func2)>
	//    6   12:areturn         
	}

	public static Observable sequenceEqual(Observable observable, Observable observable1, Func2 func2)
	{
		return OperatorSequenceEqual.sequenceEqual(observable, observable1, func2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #451 <Method Observable OperatorSequenceEqual.sequenceEqual(Observable, Observable, Func2)>
	//    4    6:areturn         
	}

	private static Subscription subscribe(Subscriber subscriber, Observable observable)
	{
		if(subscriber == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("observer can not be null");
	//    2    4:new             #417 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #456 <String "observer can not be null">
	//    5   11:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(observable.onSubscribe == null)
	//*   7   15:aload_1         
	//*   8   16:getfield        #49  <Field Observable$OnSubscribe onSubscribe>
	//*   9   19:ifnonnull       33
			throw new IllegalStateException("onSubscribe function can not be null.");
	//   10   22:new             #458 <Class IllegalStateException>
	//   11   25:dup             
	//   12   26:ldc2            #460 <String "onSubscribe function can not be null.">
	//   13   29:invokespecial   #461 <Method void IllegalStateException(String)>
	//   14   32:athrow          
		subscriber.onStart();
	//   15   33:aload_0         
	//   16   34:invokevirtual   #466 <Method void Subscriber.onStart()>
		Object obj = ((Object) (subscriber));
	//   17   37:aload_0         
	//   18   38:astore_2        
		if(!(subscriber instanceof SafeSubscriber))
	//*  19   39:aload_0         
	//*  20   40:instanceof      #468 <Class SafeSubscriber>
	//*  21   43:ifne            55
			obj = ((Object) (new SafeSubscriber(subscriber)));
	//   22   46:new             #468 <Class SafeSubscriber>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:invokespecial   #471 <Method void SafeSubscriber(Subscriber)>
	//   26   54:astore_2        
		try
		{
	/* block-local class not found */
	class OnSubscribe {}

			hook.onSubscribeStart(observable, observable.onSubscribe).call(obj);
	//   27   55:getstatic       #42  <Field RxJavaObservableExecutionHook hook>
	//   28   58:aload_1         
	//   29   59:aload_1         
	//   30   60:getfield        #49  <Field Observable$OnSubscribe onSubscribe>
	//   31   63:invokevirtual   #475 <Method Observable$OnSubscribe RxJavaObservableExecutionHook.onSubscribeStart(Observable, Observable$OnSubscribe)>
	//   32   66:aload_2         
	//   33   67:invokeinterface #479 <Method void Observable$OnSubscribe.call(Object)>
			subscriber = ((Subscriber) (hook.onSubscribeReturn(((Subscription) (obj)))));
	//   34   72:getstatic       #42  <Field RxJavaObservableExecutionHook hook>
	//   35   75:aload_2         
	//   36   76:invokevirtual   #483 <Method Subscription RxJavaObservableExecutionHook.onSubscribeReturn(Subscription)>
	//   37   79:astore_0        
		}
	//*  38   80:aload_0         
	//*  39   81:areturn         
		// Misplaced declaration of an exception variable
		catch(Subscriber subscriber)
	//*  40   82:astore_0        
		{
			Exceptions.throwIfFatal(((Throwable) (subscriber)));
	//   41   83:aload_0         
	//   42   84:invokestatic    #488 <Method void Exceptions.throwIfFatal(Throwable)>
			try
			{
				((Subscriber) (obj)).onError(hook.onSubscribeError(((Throwable) (subscriber))));
	//   43   87:aload_2         
	//   44   88:getstatic       #42  <Field RxJavaObservableExecutionHook hook>
	//   45   91:aload_0         
	//   46   92:invokevirtual   #492 <Method Throwable RxJavaObservableExecutionHook.onSubscribeError(Throwable)>
	//   47   95:invokevirtual   #495 <Method void Subscriber.onError(Throwable)>
			}
	//*  48   98:invokestatic    #501 <Method Subscription Subscriptions.unsubscribed()>
	//*  49  101:areturn         
			// Misplaced declaration of an exception variable
			catch(Observable observable)
	//*  50  102:astore_1        
			{
				Exceptions.throwIfFatal(((Throwable) (observable)));
	//   51  103:aload_1         
	//   52  104:invokestatic    #488 <Method void Exceptions.throwIfFatal(Throwable)>
				subscriber = ((Subscriber) (new RuntimeException((new StringBuilder()).append("Error occurred attempting to subscribe [").append(((Throwable) (subscriber)).getMessage()).append("] and then again while trying to pass to onError.").toString(), ((Throwable) (observable)))));
	//   53  107:new             #503 <Class RuntimeException>
	//   54  110:dup             
	//   55  111:new             #505 <Class StringBuilder>
	//   56  114:dup             
	//   57  115:invokespecial   #506 <Method void StringBuilder()>
	//   58  118:ldc2            #508 <String "Error occurred attempting to subscribe [">
	//   59  121:invokevirtual   #512 <Method StringBuilder StringBuilder.append(String)>
	//   60  124:aload_0         
	//   61  125:invokevirtual   #516 <Method String Throwable.getMessage()>
	//   62  128:invokevirtual   #512 <Method StringBuilder StringBuilder.append(String)>
	//   63  131:ldc2            #518 <String "] and then again while trying to pass to onError.">
	//   64  134:invokevirtual   #512 <Method StringBuilder StringBuilder.append(String)>
	//   65  137:invokevirtual   #521 <Method String StringBuilder.toString()>
	//   66  140:aload_1         
	//   67  141:invokespecial   #524 <Method void RuntimeException(String, Throwable)>
	//   68  144:astore_0        
				hook.onSubscribeError(((Throwable) (subscriber)));
	//   69  145:getstatic       #42  <Field RxJavaObservableExecutionHook hook>
	//   70  148:aload_0         
	//   71  149:invokevirtual   #492 <Method Throwable RxJavaObservableExecutionHook.onSubscribeError(Throwable)>
	//   72  152:pop             
				throw subscriber;
	//   73  153:aload_0         
	//   74  154:athrow          
			}
			return Subscriptions.unsubscribed();
		}
		return ((Subscription) (subscriber));
	}

	public static Observable switchOnNext(Observable observable)
	{
		return observable.lift(((Operator) (OperatorSwitch.instance(false))));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #531 <Method OperatorSwitch OperatorSwitch.instance(boolean)>
	//    3    5:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    4    8:areturn         
	}

	public static Observable switchOnNextDelayError(Observable observable)
	{
		return observable.lift(((Operator) (OperatorSwitch.instance(true))));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #531 <Method OperatorSwitch OperatorSwitch.instance(boolean)>
	//    3    5:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    4    8:areturn         
	}

	public static Observable timer(long l, long l1, TimeUnit timeunit)
	{
		return interval(l, l1, timeunit, Schedulers.computation());
	//    0    0:lload_0         
	//    1    1:lload_2         
	//    2    2:aload           4
	//    3    4:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    4    7:invokestatic    #334 <Method Observable interval(long, long, TimeUnit, Scheduler)>
	//    5   10:areturn         
	}

	public static Observable timer(long l, long l1, TimeUnit timeunit, Scheduler scheduler)
	{
		return interval(l, l1, timeunit, scheduler);
	//    0    0:lload_0         
	//    1    1:lload_2         
	//    2    2:aload           4
	//    3    4:aload           5
	//    4    6:invokestatic    #334 <Method Observable interval(long, long, TimeUnit, Scheduler)>
	//    5    9:areturn         
	}

	public static Observable timer(long l, TimeUnit timeunit)
	{
		return timer(l, timeunit, Schedulers.computation());
	//    0    0:lload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    3    5:invokestatic    #537 <Method Observable timer(long, TimeUnit, Scheduler)>
	//    4    8:areturn         
	}

	public static Observable timer(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return create(((OnSubscribe) (new OnSubscribeTimerOnce(l, timeunit, scheduler))));
	//    0    0:new             #539 <Class OnSubscribeTimerOnce>
	//    1    3:dup             
	//    2    4:lload_0         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #542 <Method void OnSubscribeTimerOnce(long, TimeUnit, Scheduler)>
	//    6   10:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    7   13:areturn         
	}

	public static Observable using(Func0 func0, Func1 func1, Action1 action1)
	{
		return using(func0, func1, action1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #547 <Method Observable using(Func0, Func1, Action1, boolean)>
	//    5    7:areturn         
	}

	public static Observable using(Func0 func0, Func1 func1, Action1 action1, boolean flag)
	{
		return create(((OnSubscribe) (new OnSubscribeUsing(func0, func1, action1, flag))));
	//    0    0:new             #550 <Class OnSubscribeUsing>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #553 <Method void OnSubscribeUsing(Func0, Func1, Action1, boolean)>
	//    7   11:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    8   14:areturn         
	}

	public static Observable zip(Iterable iterable, FuncN funcn)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #557 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #558 <Method void ArrayList()>
	//    3    7:astore_2        
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); ((List) (arraylist)).add(((Object) ((Observable)((Iterator) (iterable)).next()))));
	//    4    8:aload_0         
	//    5    9:invokeinterface #564 <Method Iterator Iterable.iterator()>
	//    6   14:astore_0        
	//    7   15:aload_0         
	//    8   16:invokeinterface #570 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            43
	//   10   24:aload_2         
	//   11   25:aload_0         
	//   12   26:invokeinterface #574 <Method Object Iterator.next()>
	//   13   31:checkcast       #2   <Class Observable>
	//   14   34:invokeinterface #580 <Method boolean List.add(Object)>
	//   15   39:pop             
	//*  16   40:goto            15
		return just(((Object) (((List) (arraylist)).toArray(((Object []) (new Observable[((List) (arraylist)).size()])))))).lift(((Operator) (new OperatorZip(funcn))));
	//   17   43:aload_2         
	//   18   44:aload_2         
	//   19   45:invokeinterface #584 <Method int List.size()>
	//   20   50:anewarray       Observable[]
	//   21   53:invokeinterface #588 <Method Object[] List.toArray(Object[])>
	//   22   58:invokestatic    #309 <Method Observable just(Object)>
	//   23   61:new             #590 <Class OperatorZip>
	//   24   64:dup             
	//   25   65:aload_1         
	//   26   66:invokespecial   #593 <Method void OperatorZip(FuncN)>
	//   27   69:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   28   72:areturn         
	}

	public static Observable zip(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
			Observable observable8, Func9 func9)
	{
		return just(((Object) (new Observable[] {
			observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7, observable8
		}))).lift(((Operator) (new OperatorZip(func9))));
	//    0    0:bipush          9
	//    1    2:anewarray       Observable[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:dup             
	//   27   32:bipush          6
	//   28   34:aload           6
	//   29   36:aastore         
	//   30   37:dup             
	//   31   38:bipush          7
	//   32   40:aload           7
	//   33   42:aastore         
	//   34   43:dup             
	//   35   44:bipush          8
	//   36   46:aload           8
	//   37   48:aastore         
	//   38   49:invokestatic    #309 <Method Observable just(Object)>
	//   39   52:new             #590 <Class OperatorZip>
	//   40   55:dup             
	//   41   56:aload           9
	//   42   58:invokespecial   #597 <Method void OperatorZip(Func9)>
	//   43   61:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   44   64:areturn         
	}

	public static Observable zip(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
			Func8 func8)
	{
		return just(((Object) (new Observable[] {
			observable, observable1, observable2, observable3, observable4, observable5, observable6, observable7
		}))).lift(((Operator) (new OperatorZip(func8))));
	//    0    0:bipush          8
	//    1    2:anewarray       Observable[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:dup             
	//   27   32:bipush          6
	//   28   34:aload           6
	//   29   36:aastore         
	//   30   37:dup             
	//   31   38:bipush          7
	//   32   40:aload           7
	//   33   42:aastore         
	//   34   43:invokestatic    #309 <Method Observable just(Object)>
	//   35   46:new             #590 <Class OperatorZip>
	//   36   49:dup             
	//   37   50:aload           8
	//   38   52:invokespecial   #600 <Method void OperatorZip(Func8)>
	//   39   55:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   40   58:areturn         
	}

	public static Observable zip(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Func7 func7)
	{
		return just(((Object) (new Observable[] {
			observable, observable1, observable2, observable3, observable4, observable5, observable6
		}))).lift(((Operator) (new OperatorZip(func7))));
	//    0    0:bipush          7
	//    1    2:anewarray       Observable[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:dup             
	//   27   32:bipush          6
	//   28   34:aload           6
	//   29   36:aastore         
	//   30   37:invokestatic    #309 <Method Observable just(Object)>
	//   31   40:new             #590 <Class OperatorZip>
	//   32   43:dup             
	//   33   44:aload           7
	//   34   46:invokespecial   #603 <Method void OperatorZip(Func7)>
	//   35   49:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   36   52:areturn         
	}

	public static Observable zip(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Func6 func6)
	{
		return just(((Object) (new Observable[] {
			observable, observable1, observable2, observable3, observable4, observable5
		}))).lift(((Operator) (new OperatorZip(func6))));
	//    0    0:bipush          6
	//    1    2:anewarray       Observable[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:aload_1         
	//    9   12:aastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:aload_2         
	//   13   16:aastore         
	//   14   17:dup             
	//   15   18:iconst_3        
	//   16   19:aload_3         
	//   17   20:aastore         
	//   18   21:dup             
	//   19   22:iconst_4        
	//   20   23:aload           4
	//   21   25:aastore         
	//   22   26:dup             
	//   23   27:iconst_5        
	//   24   28:aload           5
	//   25   30:aastore         
	//   26   31:invokestatic    #309 <Method Observable just(Object)>
	//   27   34:new             #590 <Class OperatorZip>
	//   28   37:dup             
	//   29   38:aload           6
	//   30   40:invokespecial   #606 <Method void OperatorZip(Func6)>
	//   31   43:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   32   46:areturn         
	}

	public static Observable zip(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Func5 func5)
	{
		return just(((Object) (new Observable[] {
			observable, observable1, observable2, observable3, observable4
		}))).lift(((Operator) (new OperatorZip(func5))));
	//    0    0:iconst_5        
	//    1    1:anewarray       Observable[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:aload_2         
	//   13   15:aastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:aload_3         
	//   17   19:aastore         
	//   18   20:dup             
	//   19   21:iconst_4        
	//   20   22:aload           4
	//   21   24:aastore         
	//   22   25:invokestatic    #309 <Method Observable just(Object)>
	//   23   28:new             #590 <Class OperatorZip>
	//   24   31:dup             
	//   25   32:aload           5
	//   26   34:invokespecial   #609 <Method void OperatorZip(Func5)>
	//   27   37:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   28   40:areturn         
	}

	public static Observable zip(Observable observable, Observable observable1, Observable observable2, Observable observable3, Func4 func4)
	{
		return just(((Object) (new Observable[] {
			observable, observable1, observable2, observable3
		}))).lift(((Operator) (new OperatorZip(func4))));
	//    0    0:iconst_4        
	//    1    1:anewarray       Observable[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:aload_2         
	//   13   15:aastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:aload_3         
	//   17   19:aastore         
	//   18   20:invokestatic    #309 <Method Observable just(Object)>
	//   19   23:new             #590 <Class OperatorZip>
	//   20   26:dup             
	//   21   27:aload           4
	//   22   29:invokespecial   #612 <Method void OperatorZip(Func4)>
	//   23   32:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   24   35:areturn         
	}

	public static Observable zip(Observable observable, Observable observable1, Observable observable2, Func3 func3)
	{
		return just(((Object) (new Observable[] {
			observable, observable1, observable2
		}))).lift(((Operator) (new OperatorZip(func3))));
	//    0    0:iconst_3        
	//    1    1:anewarray       Observable[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:aload_2         
	//   13   15:aastore         
	//   14   16:invokestatic    #309 <Method Observable just(Object)>
	//   15   19:new             #590 <Class OperatorZip>
	//   16   22:dup             
	//   17   23:aload_3         
	//   18   24:invokespecial   #615 <Method void OperatorZip(Func3)>
	//   19   27:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   20   30:areturn         
	}

	public static Observable zip(Observable observable, Observable observable1, Func2 func2)
	{
		return just(((Object) (new Observable[] {
			observable, observable1
		}))).lift(((Operator) (new OperatorZip(func2))));
	//    0    0:iconst_2        
	//    1    1:anewarray       Observable[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:aastore         
	//   10   12:invokestatic    #309 <Method Observable just(Object)>
	//   11   15:new             #590 <Class OperatorZip>
	//   12   18:dup             
	//   13   19:aload_2         
	//   14   20:invokespecial   #618 <Method void OperatorZip(Func2)>
	//   15   23:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   16   26:areturn         
	}

	public static Observable zip(Observable observable, FuncN funcn)
	{
		return observable.toList().map(((Func1) (new _cls4()))).lift(((Operator) (new OperatorZip(funcn))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #622 <Method Observable toList()>
	//    2    4:new             #624 <Class Observable$4>
	//    3    7:dup             
	//    4    8:invokespecial   #625 <Method void Observable$4()>
	//    5   11:invokevirtual   #628 <Method Observable map(Func1)>
	//    6   14:new             #590 <Class OperatorZip>
	//    7   17:dup             
	//    8   18:aload_1         
	//    9   19:invokespecial   #593 <Method void OperatorZip(FuncN)>
	//   10   22:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   11   25:areturn         
	}

	public final Observable all(Func1 func1)
	{
		return lift(((Operator) (new OperatorAll(func1))));
	//    0    0:aload_0         
	//    1    1:new             #632 <Class OperatorAll>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #635 <Method void OperatorAll(Func1)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable ambWith(Observable observable)
	{
		return amb(this, observable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #639 <Method Observable amb(Observable, Observable)>
	//    3    5:areturn         
	}

	public final Observable asObservable()
	{
		return lift(((Operator) (OperatorAsObservable.instance())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #646 <Method OperatorAsObservable OperatorAsObservable.instance()>
	//    2    4:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    3    7:areturn         
	}

	public final Observable buffer(int i)
	{
		return buffer(i, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #651 <Method Observable buffer(int, int)>
	//    4    6:areturn         
	}

	public final Observable buffer(int i, int j)
	{
		return lift(((Operator) (new OperatorBufferWithSize(i, j))));
	//    0    0:aload_0         
	//    1    1:new             #654 <Class OperatorBufferWithSize>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #655 <Method void OperatorBufferWithSize(int, int)>
	//    6   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   13:areturn         
	}

	public final Observable buffer(long l, long l1, TimeUnit timeunit)
	{
		return buffer(l, l1, timeunit, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:aload           5
	//    4    5:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    5    8:invokevirtual   #658 <Method Observable buffer(long, long, TimeUnit, Scheduler)>
	//    6   11:areturn         
	}

	public final Observable buffer(long l, long l1, TimeUnit timeunit, Scheduler scheduler)
	{
		return lift(((Operator) (new OperatorBufferWithTime(l, l1, timeunit, 0x7fffffff, scheduler))));
	//    0    0:aload_0         
	//    1    1:new             #661 <Class OperatorBufferWithTime>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:lload_3         
	//    5    7:aload           5
	//    6    9:ldc2            #423 <Int 0x7fffffff>
	//    7   12:aload           6
	//    8   14:invokespecial   #664 <Method void OperatorBufferWithTime(long, long, TimeUnit, int, Scheduler)>
	//    9   17:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   10   20:areturn         
	}

	public final Observable buffer(long l, TimeUnit timeunit)
	{
		return buffer(l, timeunit, 0x7fffffff, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:ldc2            #423 <Int 0x7fffffff>
	//    4    6:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    5    9:invokevirtual   #668 <Method Observable buffer(long, TimeUnit, int, Scheduler)>
	//    6   12:areturn         
	}

	public final Observable buffer(long l, TimeUnit timeunit, int i)
	{
		return lift(((Operator) (new OperatorBufferWithTime(l, l, timeunit, i, Schedulers.computation()))));
	//    0    0:aload_0         
	//    1    1:new             #661 <Class OperatorBufferWithTime>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:lload_1         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    8   13:invokespecial   #664 <Method void OperatorBufferWithTime(long, long, TimeUnit, int, Scheduler)>
	//    9   16:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   10   19:areturn         
	}

	public final Observable buffer(long l, TimeUnit timeunit, int i, Scheduler scheduler)
	{
		return lift(((Operator) (new OperatorBufferWithTime(l, l, timeunit, i, scheduler))));
	//    0    0:aload_0         
	//    1    1:new             #661 <Class OperatorBufferWithTime>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:lload_1         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:aload           5
	//    8   12:invokespecial   #664 <Method void OperatorBufferWithTime(long, long, TimeUnit, int, Scheduler)>
	//    9   15:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   10   18:areturn         
	}

	public final Observable buffer(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return buffer(l, l, timeunit, scheduler);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_1         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #658 <Method Observable buffer(long, long, TimeUnit, Scheduler)>
	//    6    9:areturn         
	}

	public final Observable buffer(Observable observable)
	{
		return buffer(observable, 16);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:bipush          16
	//    3    4:invokevirtual   #675 <Method Observable buffer(Observable, int)>
	//    4    7:areturn         
	}

	public final Observable buffer(Observable observable, int i)
	{
		return lift(((Operator) (new OperatorBufferWithSingleObservable(observable, i))));
	//    0    0:aload_0         
	//    1    1:new             #678 <Class OperatorBufferWithSingleObservable>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #681 <Method void OperatorBufferWithSingleObservable(Observable, int)>
	//    6   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   13:areturn         
	}

	public final Observable buffer(Observable observable, Func1 func1)
	{
		return lift(((Operator) (new OperatorBufferWithStartEndObservable(observable, func1))));
	//    0    0:aload_0         
	//    1    1:new             #685 <Class OperatorBufferWithStartEndObservable>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #688 <Method void OperatorBufferWithStartEndObservable(Observable, Func1)>
	//    6   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   13:areturn         
	}

	public final Observable buffer(Func0 func0)
	{
		return lift(((Operator) (new OperatorBufferWithSingleObservable(func0, 16))));
	//    0    0:aload_0         
	//    1    1:new             #678 <Class OperatorBufferWithSingleObservable>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:bipush          16
	//    5    8:invokespecial   #692 <Method void OperatorBufferWithSingleObservable(Func0, int)>
	//    6   11:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   14:areturn         
	}

	public final Observable cache()
	{
		return ((Observable) (CachedObservable.from(this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #699 <Method CachedObservable CachedObservable.from(Observable)>
	//    2    4:areturn         
	}

	public final Observable cache(int i)
	{
		return cacheWithInitialCapacity(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #702 <Method Observable cacheWithInitialCapacity(int)>
	//    3    5:areturn         
	}

	public final Observable cacheWithInitialCapacity(int i)
	{
		return ((Observable) (CachedObservable.from(this, i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #706 <Method CachedObservable CachedObservable.from(Observable, int)>
	//    3    5:areturn         
	}

	public final Observable cast(Class class1)
	{
		return lift(((Operator) (new OperatorCast(class1))));
	//    0    0:aload_0         
	//    1    1:new             #710 <Class OperatorCast>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #713 <Method void OperatorCast(Class)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable collect(Func0 func0, Action2 action2)
	{
		return lift(((Operator) (new OperatorScan(func0, ((Func2) (new _cls5(action2))))))).last();
	//    0    0:aload_0         
	//    1    1:new             #718 <Class OperatorScan>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:new             #720 <Class Observable$5>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #723 <Method void Observable$5(Observable, Action2)>
	//    9   15:invokespecial   #726 <Method void OperatorScan(Func0, Func2)>
	//   10   18:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   11   21:invokevirtual   #729 <Method Observable last()>
	//   12   24:areturn         
	}

	public Observable compose(Transformer transformer)
	{
	/* block-local class not found */
	class Transformer {}

		return (Observable)transformer.call(((Object) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #735 <Method Object Observable$Transformer.call(Object)>
	//    3    7:checkcast       #2   <Class Observable>
	//    4   10:areturn         
	}

	public final Observable concatMap(Func1 func1)
	{
		if(this instanceof ScalarSynchronousObservable)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #347 <Class ScalarSynchronousObservable>
	//*   2    4:ifeq            16
			return ((ScalarSynchronousObservable)this).scalarFlatMap(func1);
	//    3    7:aload_0         
	//    4    8:checkcast       #347 <Class ScalarSynchronousObservable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #389 <Method Observable ScalarSynchronousObservable.scalarFlatMap(Func1)>
	//    7   15:areturn         
		else
			return create(((OnSubscribe) (new OnSubscribeConcatMap(this, func1, 2, 0))));
	//    8   16:new             #738 <Class OnSubscribeConcatMap>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:iconst_2        
	//   13   23:iconst_0        
	//   14   24:invokespecial   #741 <Method void OnSubscribeConcatMap(Observable, Func1, int, int)>
	//   15   27:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//   16   30:areturn         
	}

	public final Observable concatMapDelayError(Func1 func1)
	{
		if(this instanceof ScalarSynchronousObservable)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #347 <Class ScalarSynchronousObservable>
	//*   2    4:ifeq            16
			return ((ScalarSynchronousObservable)this).scalarFlatMap(func1);
	//    3    7:aload_0         
	//    4    8:checkcast       #347 <Class ScalarSynchronousObservable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #389 <Method Observable ScalarSynchronousObservable.scalarFlatMap(Func1)>
	//    7   15:areturn         
		else
			return create(((OnSubscribe) (new OnSubscribeConcatMap(this, func1, 2, 2))));
	//    8   16:new             #738 <Class OnSubscribeConcatMap>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:iconst_2        
	//   13   23:iconst_2        
	//   14   24:invokespecial   #741 <Method void OnSubscribeConcatMap(Observable, Func1, int, int)>
	//   15   27:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//   16   30:areturn         
	}

	public final Observable concatMapEager(Func1 func1)
	{
		return concatMapEager(func1, RxRingBuffer.SIZE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #176 <Field int RxRingBuffer.SIZE>
	//    3    5:invokevirtual   #238 <Method Observable concatMapEager(Func1, int)>
	//    4    8:areturn         
	}

	public final Observable concatMapEager(Func1 func1, int i)
	{
		if(i < 1)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          33
			throw new IllegalArgumentException((new StringBuilder()).append("capacityHint > 0 required but it was ").append(i).toString());
	//    3    5:new             #417 <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:new             #505 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #506 <Method void StringBuilder()>
	//    8   16:ldc2            #744 <String "capacityHint > 0 required but it was ">
	//    9   19:invokevirtual   #512 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:iload_2         
	//   11   23:invokevirtual   #747 <Method StringBuilder StringBuilder.append(int)>
	//   12   26:invokevirtual   #521 <Method String StringBuilder.toString()>
	//   13   29:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//   14   32:athrow          
		else
			return lift(((Operator) (new OperatorEagerConcatMap(func1, i, 0x7fffffff))));
	//   15   33:aload_0         
	//   16   34:new             #749 <Class OperatorEagerConcatMap>
	//   17   37:dup             
	//   18   38:aload_1         
	//   19   39:iload_2         
	//   20   40:ldc2            #423 <Int 0x7fffffff>
	//   21   43:invokespecial   #752 <Method void OperatorEagerConcatMap(Func1, int, int)>
	//   22   46:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   23   49:areturn         
	}

	public final Observable concatMapEager(Func1 func1, int i, int j)
	{
		if(i < 1)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          33
			throw new IllegalArgumentException((new StringBuilder()).append("capacityHint > 0 required but it was ").append(i).toString());
	//    3    5:new             #417 <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:new             #505 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #506 <Method void StringBuilder()>
	//    8   16:ldc2            #744 <String "capacityHint > 0 required but it was ">
	//    9   19:invokevirtual   #512 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:iload_2         
	//   11   23:invokevirtual   #747 <Method StringBuilder StringBuilder.append(int)>
	//   12   26:invokevirtual   #521 <Method String StringBuilder.toString()>
	//   13   29:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//   14   32:athrow          
		if(j < 1)
	//*  15   33:iload_3         
	//*  16   34:iconst_1        
	//*  17   35:icmpge          66
			throw new IllegalArgumentException((new StringBuilder()).append("maxConcurrent > 0 required but it was ").append(i).toString());
	//   18   38:new             #417 <Class IllegalArgumentException>
	//   19   41:dup             
	//   20   42:new             #505 <Class StringBuilder>
	//   21   45:dup             
	//   22   46:invokespecial   #506 <Method void StringBuilder()>
	//   23   49:ldc2            #756 <String "maxConcurrent > 0 required but it was ">
	//   24   52:invokevirtual   #512 <Method StringBuilder StringBuilder.append(String)>
	//   25   55:iload_2         
	//   26   56:invokevirtual   #747 <Method StringBuilder StringBuilder.append(int)>
	//   27   59:invokevirtual   #521 <Method String StringBuilder.toString()>
	//   28   62:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//   29   65:athrow          
		else
			return lift(((Operator) (new OperatorEagerConcatMap(func1, i, j))));
	//   30   66:aload_0         
	//   31   67:new             #749 <Class OperatorEagerConcatMap>
	//   32   70:dup             
	//   33   71:aload_1         
	//   34   72:iload_2         
	//   35   73:iload_3         
	//   36   74:invokespecial   #752 <Method void OperatorEagerConcatMap(Func1, int, int)>
	//   37   77:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   38   80:areturn         
	}

	public final Observable concatMapIterable(Func1 func1)
	{
		return concat(map(OperatorMapPair.convertSelector(func1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #764 <Method Func1 OperatorMapPair.convertSelector(Func1)>
	//    3    5:invokevirtual   #628 <Method Observable map(Func1)>
	//    4    8:invokestatic    #198 <Method Observable concat(Observable)>
	//    5   11:areturn         
	}

	public final Observable concatWith(Observable observable)
	{
		return concat(this, observable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #768 <Method Observable concat(Observable, Observable)>
	//    3    5:areturn         
	}

	public final Observable contains(Object obj)
	{
		return exists(((Func1) (new _cls6(obj))));
	//    0    0:aload_0         
	//    1    1:new             #771 <Class Observable$6>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #774 <Method void Observable$6(Observable, Object)>
	//    6   10:invokevirtual   #777 <Method Observable exists(Func1)>
	//    7   13:areturn         
	}

	public final Observable count()
	{
	/* block-local class not found */
	class CountHolder {}

		return reduce(((Object) (Integer.valueOf(0))), CountHolder.INSTANCE);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #431 <Method Integer Integer.valueOf(int)>
	//    3    5:getstatic       #782 <Field Func2 Observable$CountHolder.INSTANCE>
	//    4    8:invokevirtual   #786 <Method Observable reduce(Object, Func2)>
	//    5   11:areturn         
	}

	public final Observable countLong()
	{
	/* block-local class not found */
	class CountLongHolder {}

		return reduce(((Object) (Long.valueOf(0L))), CountLongHolder.INSTANCE);
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:invokestatic    #793 <Method Long Long.valueOf(long)>
	//    3    5:getstatic       #794 <Field Func2 Observable$CountLongHolder.INSTANCE>
	//    4    8:invokevirtual   #786 <Method Observable reduce(Object, Func2)>
	//    5   11:areturn         
	}

	public final Observable debounce(long l, TimeUnit timeunit)
	{
		return debounce(l, timeunit, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    4    6:invokevirtual   #798 <Method Observable debounce(long, TimeUnit, Scheduler)>
	//    5    9:areturn         
	}

	public final Observable debounce(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return lift(((Operator) (new OperatorDebounceWithTime(l, timeunit, scheduler))));
	//    0    0:aload_0         
	//    1    1:new             #801 <Class OperatorDebounceWithTime>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #802 <Method void OperatorDebounceWithTime(long, TimeUnit, Scheduler)>
	//    7   12:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    8   15:areturn         
	}

	public final Observable debounce(Func1 func1)
	{
		return lift(((Operator) (new OperatorDebounceWithSelector(func1))));
	//    0    0:aload_0         
	//    1    1:new             #805 <Class OperatorDebounceWithSelector>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #806 <Method void OperatorDebounceWithSelector(Func1)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable defaultIfEmpty(Object obj)
	{
		return switchIfEmpty(create(((OnSubscribe) (new _cls7(obj)))));
	//    0    0:aload_0         
	//    1    1:new             #810 <Class Observable$7>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #811 <Method void Observable$7(Observable, Object)>
	//    6   10:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    7   13:invokevirtual   #814 <Method Observable switchIfEmpty(Observable)>
	//    8   16:areturn         
	}

	public final Observable delay(long l, TimeUnit timeunit)
	{
		return delay(l, timeunit, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    4    6:invokevirtual   #818 <Method Observable delay(long, TimeUnit, Scheduler)>
	//    5    9:areturn         
	}

	public final Observable delay(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return lift(((Operator) (new OperatorDelay(l, timeunit, scheduler))));
	//    0    0:aload_0         
	//    1    1:new             #820 <Class OperatorDelay>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #821 <Method void OperatorDelay(long, TimeUnit, Scheduler)>
	//    7   12:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    8   15:areturn         
	}

	public final Observable delay(Func0 func0, Func1 func1)
	{
		return delaySubscription(func0).lift(((Operator) (new OperatorDelayWithSelector(this, func1))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #825 <Method Observable delaySubscription(Func0)>
	//    3    5:new             #827 <Class OperatorDelayWithSelector>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #828 <Method void OperatorDelayWithSelector(Observable, Func1)>
	//    8   14:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    9   17:areturn         
	}

	public final Observable delay(Func1 func1)
	{
		return lift(((Operator) (new OperatorDelayWithSelector(this, func1))));
	//    0    0:aload_0         
	//    1    1:new             #827 <Class OperatorDelayWithSelector>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #828 <Method void OperatorDelayWithSelector(Observable, Func1)>
	//    6   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   13:areturn         
	}

	public final Observable delaySubscription(long l, TimeUnit timeunit)
	{
		return delaySubscription(l, timeunit, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    4    6:invokevirtual   #831 <Method Observable delaySubscription(long, TimeUnit, Scheduler)>
	//    5    9:areturn         
	}

	public final Observable delaySubscription(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return create(((OnSubscribe) (new OnSubscribeDelaySubscription(this, l, timeunit, scheduler))));
	//    0    0:new             #833 <Class OnSubscribeDelaySubscription>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #836 <Method void OnSubscribeDelaySubscription(Observable, long, TimeUnit, Scheduler)>
	//    7   12:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    8   15:areturn         
	}

	public final Observable delaySubscription(Observable observable)
	{
		if(observable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			throw new NullPointerException();
	//    2    4:new             #838 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #839 <Method void NullPointerException()>
	//    5   11:athrow          
		else
			return create(((OnSubscribe) (new OnSubscribeDelaySubscriptionOther(this, observable))));
	//    6   12:new             #841 <Class OnSubscribeDelaySubscriptionOther>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #844 <Method void OnSubscribeDelaySubscriptionOther(Observable, Observable)>
	//   11   21:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//   12   24:areturn         
	}

	public final Observable delaySubscription(Func0 func0)
	{
		return create(((OnSubscribe) (new OnSubscribeDelaySubscriptionWithSelector(this, func0))));
	//    0    0:new             #847 <Class OnSubscribeDelaySubscriptionWithSelector>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #850 <Method void OnSubscribeDelaySubscriptionWithSelector(Observable, Func0)>
	//    5    9:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    6   12:areturn         
	}

	public final Observable dematerialize()
	{
		return lift(((Operator) (OperatorDematerialize.instance())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #857 <Method OperatorDematerialize OperatorDematerialize.instance()>
	//    2    4:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    3    7:areturn         
	}

	public final Observable distinct()
	{
		return lift(((Operator) (OperatorDistinct.instance())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #864 <Method OperatorDistinct OperatorDistinct.instance()>
	//    2    4:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    3    7:areturn         
	}

	public final Observable distinct(Func1 func1)
	{
		return lift(((Operator) (new OperatorDistinct(func1))));
	//    0    0:aload_0         
	//    1    1:new             #861 <Class OperatorDistinct>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #865 <Method void OperatorDistinct(Func1)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable distinctUntilChanged()
	{
		return lift(((Operator) (OperatorDistinctUntilChanged.instance())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #872 <Method OperatorDistinctUntilChanged OperatorDistinctUntilChanged.instance()>
	//    2    4:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    3    7:areturn         
	}

	public final Observable distinctUntilChanged(Func1 func1)
	{
		return lift(((Operator) (new OperatorDistinctUntilChanged(func1))));
	//    0    0:aload_0         
	//    1    1:new             #869 <Class OperatorDistinctUntilChanged>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #873 <Method void OperatorDistinctUntilChanged(Func1)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable doAfterTerminate(Action0 action0)
	{
		return lift(((Operator) (new OperatorDoAfterTerminate(action0))));
	//    0    0:aload_0         
	//    1    1:new             #877 <Class OperatorDoAfterTerminate>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #880 <Method void OperatorDoAfterTerminate(Action0)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable doOnCompleted(Action0 action0)
	{
		return lift(((Operator) (new OperatorDoOnEach(((Observer) (new _cls8(action0)))))));
	//    0    0:aload_0         
	//    1    1:new             #884 <Class OperatorDoOnEach>
	//    2    4:dup             
	//    3    5:new             #886 <Class Observable$8>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #889 <Method void Observable$8(Observable, Action0)>
	//    8   14:invokespecial   #892 <Method void OperatorDoOnEach(Observer)>
	//    9   17:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   10   20:areturn         
	}

	public final Observable doOnEach(Observer observer)
	{
		return lift(((Operator) (new OperatorDoOnEach(observer))));
	//    0    0:aload_0         
	//    1    1:new             #884 <Class OperatorDoOnEach>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #892 <Method void OperatorDoOnEach(Observer)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable doOnEach(Action1 action1)
	{
		return lift(((Operator) (new OperatorDoOnEach(((Observer) (new _cls9(action1)))))));
	//    0    0:aload_0         
	//    1    1:new             #884 <Class OperatorDoOnEach>
	//    2    4:dup             
	//    3    5:new             #898 <Class Observable$9>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #901 <Method void Observable$9(Observable, Action1)>
	//    8   14:invokespecial   #892 <Method void OperatorDoOnEach(Observer)>
	//    9   17:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   10   20:areturn         
	}

	public final Observable doOnError(Action1 action1)
	{
		return lift(((Operator) (new OperatorDoOnEach(((Observer) (new _cls10(action1)))))));
	//    0    0:aload_0         
	//    1    1:new             #884 <Class OperatorDoOnEach>
	//    2    4:dup             
	//    3    5:new             #905 <Class Observable$10>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #906 <Method void Observable$10(Observable, Action1)>
	//    8   14:invokespecial   #892 <Method void OperatorDoOnEach(Observer)>
	//    9   17:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   10   20:areturn         
	}

	public final Observable doOnNext(Action1 action1)
	{
		return lift(((Operator) (new OperatorDoOnEach(((Observer) (new _cls11(action1)))))));
	//    0    0:aload_0         
	//    1    1:new             #884 <Class OperatorDoOnEach>
	//    2    4:dup             
	//    3    5:new             #910 <Class Observable$11>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #911 <Method void Observable$11(Observable, Action1)>
	//    8   14:invokespecial   #892 <Method void OperatorDoOnEach(Observer)>
	//    9   17:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   10   20:areturn         
	}

	public final Observable doOnRequest(Action1 action1)
	{
		return lift(((Operator) (new OperatorDoOnRequest(action1))));
	//    0    0:aload_0         
	//    1    1:new             #915 <Class OperatorDoOnRequest>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #918 <Method void OperatorDoOnRequest(Action1)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable doOnSubscribe(Action0 action0)
	{
		return lift(((Operator) (new OperatorDoOnSubscribe(action0))));
	//    0    0:aload_0         
	//    1    1:new             #922 <Class OperatorDoOnSubscribe>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #923 <Method void OperatorDoOnSubscribe(Action0)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable doOnTerminate(Action0 action0)
	{
		return lift(((Operator) (new OperatorDoOnEach(((Observer) (new _cls12(action0)))))));
	//    0    0:aload_0         
	//    1    1:new             #884 <Class OperatorDoOnEach>
	//    2    4:dup             
	//    3    5:new             #926 <Class Observable$12>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #927 <Method void Observable$12(Observable, Action0)>
	//    8   14:invokespecial   #892 <Method void OperatorDoOnEach(Observer)>
	//    9   17:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   10   20:areturn         
	}

	public final Observable doOnUnsubscribe(Action0 action0)
	{
		return lift(((Operator) (new OperatorDoOnUnsubscribe(action0))));
	//    0    0:aload_0         
	//    1    1:new             #930 <Class OperatorDoOnUnsubscribe>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #931 <Method void OperatorDoOnUnsubscribe(Action0)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable elementAt(int i)
	{
		return lift(((Operator) (new OperatorElementAt(i))));
	//    0    0:aload_0         
	//    1    1:new             #934 <Class OperatorElementAt>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #937 <Method void OperatorElementAt(int)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable elementAtOrDefault(int i, Object obj)
	{
		return lift(((Operator) (new OperatorElementAt(i, obj))));
	//    0    0:aload_0         
	//    1    1:new             #934 <Class OperatorElementAt>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #942 <Method void OperatorElementAt(int, Object)>
	//    6   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   13:areturn         
	}

	public final Observable exists(Func1 func1)
	{
		return lift(((Operator) (new OperatorAny(func1, false))));
	//    0    0:aload_0         
	//    1    1:new             #945 <Class OperatorAny>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:invokespecial   #948 <Method void OperatorAny(Func1, boolean)>
	//    6   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   13:areturn         
	}

	public Object extend(Func1 func1)
	{
		return func1.call(((Object) (new _cls1())));
	//    0    0:aload_1         
	//    1    1:new             #952 <Class Observable$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #955 <Method void Observable$1(Observable)>
	//    5    9:invokeinterface #958 <Method Object Func1.call(Object)>
	//    6   14:areturn         
	}

	public final Observable filter(Func1 func1)
	{
		return lift(((Operator) (new OperatorFilter(func1))));
	//    0    0:aload_0         
	//    1    1:new             #962 <Class OperatorFilter>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #963 <Method void OperatorFilter(Func1)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable finallyDo(Action0 action0)
	{
		return lift(((Operator) (new OperatorDoAfterTerminate(action0))));
	//    0    0:aload_0         
	//    1    1:new             #877 <Class OperatorDoAfterTerminate>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #880 <Method void OperatorDoAfterTerminate(Action0)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable first()
	{
		return take(1).single();
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #969 <Method Observable take(int)>
	//    3    5:invokevirtual   #972 <Method Observable single()>
	//    4    8:areturn         
	}

	public final Observable first(Func1 func1)
	{
		return takeFirst(func1).single();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #975 <Method Observable takeFirst(Func1)>
	//    3    5:invokevirtual   #972 <Method Observable single()>
	//    4    8:areturn         
	}

	public final Observable firstOrDefault(Object obj)
	{
		return take(1).singleOrDefault(obj);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #969 <Method Observable take(int)>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #979 <Method Observable singleOrDefault(Object)>
	//    5    9:areturn         
	}

	public final Observable firstOrDefault(Object obj, Func1 func1)
	{
		return takeFirst(func1).singleOrDefault(obj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #975 <Method Observable takeFirst(Func1)>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #979 <Method Observable singleOrDefault(Object)>
	//    5    9:areturn         
	}

	public final Observable flatMap(Func1 func1)
	{
		if(((Object)this).getClass() == rx/internal/util/ScalarSynchronousObservable)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #386 <Method Class Object.getClass()>
	//*   2    4:ldc2            #347 <Class ScalarSynchronousObservable>
	//*   3    7:if_acmpne       19
			return ((ScalarSynchronousObservable)this).scalarFlatMap(func1);
	//    4   10:aload_0         
	//    5   11:checkcast       #347 <Class ScalarSynchronousObservable>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #389 <Method Observable ScalarSynchronousObservable.scalarFlatMap(Func1)>
	//    8   18:areturn         
		else
			return merge(map(func1));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #628 <Method Observable map(Func1)>
	//   12   24:invokestatic    #380 <Method Observable merge(Observable)>
	//   13   27:areturn         
	}

	public final Observable flatMap(Func1 func1, int i)
	{
		if(((Object)this).getClass() == rx/internal/util/ScalarSynchronousObservable)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #386 <Method Class Object.getClass()>
	//*   2    4:ldc2            #347 <Class ScalarSynchronousObservable>
	//*   3    7:if_acmpne       19
			return ((ScalarSynchronousObservable)this).scalarFlatMap(func1);
	//    4   10:aload_0         
	//    5   11:checkcast       #347 <Class ScalarSynchronousObservable>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #389 <Method Observable ScalarSynchronousObservable.scalarFlatMap(Func1)>
	//    8   18:areturn         
		else
			return merge(map(func1), i);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #628 <Method Observable map(Func1)>
	//   12   24:iload_2         
	//   13   25:invokestatic    #382 <Method Observable merge(Observable, int)>
	//   14   28:areturn         
	}

	public final Observable flatMap(Func1 func1, Func1 func1_1, Func0 func0)
	{
		return merge(mapNotification(func1, func1_1, func0));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #984 <Method Observable mapNotification(Func1, Func1, Func0)>
	//    5    7:invokestatic    #380 <Method Observable merge(Observable)>
	//    6   10:areturn         
	}

	public final Observable flatMap(Func1 func1, Func1 func1_1, Func0 func0, int i)
	{
		return merge(mapNotification(func1, func1_1, func0), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #984 <Method Observable mapNotification(Func1, Func1, Func0)>
	//    5    7:iload           4
	//    6    9:invokestatic    #382 <Method Observable merge(Observable, int)>
	//    7   12:areturn         
	}

	public final Observable flatMap(Func1 func1, Func2 func2)
	{
		return merge(lift(((Operator) (new OperatorMapPair(func1, func2)))));
	//    0    0:aload_0         
	//    1    1:new             #760 <Class OperatorMapPair>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #991 <Method void OperatorMapPair(Func1, Func2)>
	//    6   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   13:invokestatic    #380 <Method Observable merge(Observable)>
	//    8   16:areturn         
	}

	public final Observable flatMap(Func1 func1, Func2 func2, int i)
	{
		return merge(lift(((Operator) (new OperatorMapPair(func1, func2)))), i);
	//    0    0:aload_0         
	//    1    1:new             #760 <Class OperatorMapPair>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #991 <Method void OperatorMapPair(Func1, Func2)>
	//    6   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   13:iload_3         
	//    8   14:invokestatic    #382 <Method Observable merge(Observable, int)>
	//    9   17:areturn         
	}

	public final Observable flatMapIterable(Func1 func1)
	{
		return merge(map(OperatorMapPair.convertSelector(func1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #764 <Method Func1 OperatorMapPair.convertSelector(Func1)>
	//    3    5:invokevirtual   #628 <Method Observable map(Func1)>
	//    4    8:invokestatic    #380 <Method Observable merge(Observable)>
	//    5   11:areturn         
	}

	public final Observable flatMapIterable(Func1 func1, int i)
	{
		return merge(map(OperatorMapPair.convertSelector(func1)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #764 <Method Func1 OperatorMapPair.convertSelector(Func1)>
	//    3    5:invokevirtual   #628 <Method Observable map(Func1)>
	//    4    8:iload_2         
	//    5    9:invokestatic    #382 <Method Observable merge(Observable, int)>
	//    6   12:areturn         
	}

	public final Observable flatMapIterable(Func1 func1, Func2 func2)
	{
		return flatMap(OperatorMapPair.convertSelector(func1), func2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #764 <Method Func1 OperatorMapPair.convertSelector(Func1)>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #998 <Method Observable flatMap(Func1, Func2)>
	//    5    9:areturn         
	}

	public final Observable flatMapIterable(Func1 func1, Func2 func2, int i)
	{
		return flatMap(OperatorMapPair.convertSelector(func1), func2, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #764 <Method Func1 OperatorMapPair.convertSelector(Func1)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #1001 <Method Observable flatMap(Func1, Func2, int)>
	//    6   10:areturn         
	}

	public final void forEach(Action1 action1)
	{
		subscribe(action1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1006 <Method Subscription subscribe(Action1)>
	//    3    5:pop             
	//    4    6:return          
	}

	public final void forEach(Action1 action1, Action1 action1_1)
	{
		subscribe(action1, action1_1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #1011 <Method Subscription subscribe(Action1, Action1)>
	//    4    6:pop             
	//    5    7:return          
	}

	public final void forEach(Action1 action1, Action1 action1_1, Action0 action0)
	{
		subscribe(action1, action1_1, action0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #1016 <Method Subscription subscribe(Action1, Action1, Action0)>
	//    5    7:pop             
	//    6    8:return          
	}

	public final Observable groupBy(Func1 func1)
	{
		return lift(((Operator) (new OperatorGroupBy(func1))));
	//    0    0:aload_0         
	//    1    1:new             #1020 <Class OperatorGroupBy>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1021 <Method void OperatorGroupBy(Func1)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable groupBy(Func1 func1, Func1 func1_1)
	{
		return lift(((Operator) (new OperatorGroupBy(func1, func1_1))));
	//    0    0:aload_0         
	//    1    1:new             #1020 <Class OperatorGroupBy>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #1026 <Method void OperatorGroupBy(Func1, Func1)>
	//    6   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   13:areturn         
	}

	public final Observable groupJoin(Observable observable, Func1 func1, Func1 func1_1, Func2 func2)
	{
		return create(((OnSubscribe) (new OnSubscribeGroupJoin(this, observable, func1, func1_1, func2))));
	//    0    0:new             #1031 <Class OnSubscribeGroupJoin>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #1034 <Method void OnSubscribeGroupJoin(Observable, Observable, Func1, Func1, Func2)>
	//    8   13:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    9   16:areturn         
	}

	public final Observable ignoreElements()
	{
		return lift(((Operator) (OperatorIgnoreElements.instance())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #1041 <Method OperatorIgnoreElements OperatorIgnoreElements.instance()>
	//    2    4:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    3    7:areturn         
	}

	public final Observable isEmpty()
	{
	/* block-local class not found */
	class HolderAnyForEmpty {}

		return lift(((Operator) (HolderAnyForEmpty.INSTANCE)));
	//    0    0:aload_0         
	//    1    1:getstatic       #1045 <Field OperatorAny Observable$HolderAnyForEmpty.INSTANCE>
	//    2    4:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    3    7:areturn         
	}

	public final Observable join(Observable observable, Func1 func1, Func1 func1_1, Func2 func2)
	{
		return create(((OnSubscribe) (new OnSubscribeJoin(this, observable, func1, func1_1, func2))));
	//    0    0:new             #1049 <Class OnSubscribeJoin>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #1050 <Method void OnSubscribeJoin(Observable, Observable, Func1, Func1, Func2)>
	//    8   13:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//    9   16:areturn         
	}

	public final Observable last()
	{
		return takeLast(1).single();
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #1054 <Method Observable takeLast(int)>
	//    3    5:invokevirtual   #972 <Method Observable single()>
	//    4    8:areturn         
	}

	public final Observable last(Func1 func1)
	{
		return filter(func1).takeLast(1).single();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1056 <Method Observable filter(Func1)>
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #1054 <Method Observable takeLast(int)>
	//    5    9:invokevirtual   #972 <Method Observable single()>
	//    6   12:areturn         
	}

	public final Observable lastOrDefault(Object obj)
	{
		return takeLast(1).singleOrDefault(obj);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #1054 <Method Observable takeLast(int)>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #979 <Method Observable singleOrDefault(Object)>
	//    5    9:areturn         
	}

	public final Observable lastOrDefault(Object obj, Func1 func1)
	{
		return filter(func1).takeLast(1).singleOrDefault(obj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #1056 <Method Observable filter(Func1)>
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #1054 <Method Observable takeLast(int)>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #979 <Method Observable singleOrDefault(Object)>
	//    7   13:areturn         
	}

	public final Observable lift(Operator operator)
	{
		return new Observable(((OnSubscribe) (new _cls2(operator))));
	//    0    0:new             #2   <Class Observable>
	//    1    3:dup             
	//    2    4:new             #1059 <Class Observable$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #1062 <Method void Observable$2(Observable, Observable$Operator)>
	//    7   13:invokespecial   #251 <Method void Observable(Observable$OnSubscribe)>
	//    8   16:areturn         
	}

	public final Observable limit(int i)
	{
		return take(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #969 <Method Observable take(int)>
	//    3    5:areturn         
	}

	public final Observable map(Func1 func1)
	{
		return lift(((Operator) (new OperatorMap(func1))));
	//    0    0:aload_0         
	//    1    1:new             #1066 <Class OperatorMap>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1067 <Method void OperatorMap(Func1)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable materialize()
	{
		return lift(((Operator) (OperatorMaterialize.instance())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #1074 <Method OperatorMaterialize OperatorMaterialize.instance()>
	//    2    4:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    3    7:areturn         
	}

	public final Observable mergeWith(Observable observable)
	{
		return merge(this, observable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #1078 <Method Observable merge(Observable, Observable)>
	//    3    5:areturn         
	}

	public final Observable nest()
	{
		return just(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #309 <Method Observable just(Object)>
	//    2    4:areturn         
	}

	public final Observable observeOn(Scheduler scheduler)
	{
		return observeOn(scheduler, RxRingBuffer.SIZE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #176 <Field int RxRingBuffer.SIZE>
	//    3    5:invokevirtual   #1084 <Method Observable observeOn(Scheduler, int)>
	//    4    8:areturn         
	}

	public final Observable observeOn(Scheduler scheduler, int i)
	{
		return observeOn(scheduler, false, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iload_2         
	//    4    4:invokevirtual   #1088 <Method Observable observeOn(Scheduler, boolean, int)>
	//    5    7:areturn         
	}

	public final Observable observeOn(Scheduler scheduler, boolean flag)
	{
		return observeOn(scheduler, flag, RxRingBuffer.SIZE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:getstatic       #176 <Field int RxRingBuffer.SIZE>
	//    4    6:invokevirtual   #1088 <Method Observable observeOn(Scheduler, boolean, int)>
	//    5    9:areturn         
	}

	public final Observable observeOn(Scheduler scheduler, boolean flag, int i)
	{
		if(this instanceof ScalarSynchronousObservable)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #347 <Class ScalarSynchronousObservable>
	//*   2    4:ifeq            16
			return ((ScalarSynchronousObservable)this).scalarScheduleOn(scheduler);
	//    3    7:aload_0         
	//    4    8:checkcast       #347 <Class ScalarSynchronousObservable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #1094 <Method Observable ScalarSynchronousObservable.scalarScheduleOn(Scheduler)>
	//    7   15:areturn         
		else
			return lift(((Operator) (new OperatorObserveOn(scheduler, flag, i))));
	//    8   16:aload_0         
	//    9   17:new             #1096 <Class OperatorObserveOn>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:iload_2         
	//   13   23:iload_3         
	//   14   24:invokespecial   #1099 <Method void OperatorObserveOn(Scheduler, boolean, int)>
	//   15   27:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   16   30:areturn         
	}

	public final Observable ofType(Class class1)
	{
		return filter(((Func1) (new _cls13(class1)))).cast(class1);
	//    0    0:aload_0         
	//    1    1:new             #1103 <Class Observable$13>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #1106 <Method void Observable$13(Observable, Class)>
	//    6   10:invokevirtual   #1056 <Method Observable filter(Func1)>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #1108 <Method Observable cast(Class)>
	//    9   17:areturn         
	}

	public final Observable onBackpressureBuffer()
	{
		return lift(((Operator) (OperatorOnBackpressureBuffer.instance())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #1114 <Method OperatorOnBackpressureBuffer OperatorOnBackpressureBuffer.instance()>
	//    2    4:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    3    7:areturn         
	}

	public final Observable onBackpressureBuffer(long l)
	{
		return lift(((Operator) (new OperatorOnBackpressureBuffer(l))));
	//    0    0:aload_0         
	//    1    1:new             #1111 <Class OperatorOnBackpressureBuffer>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:invokespecial   #1118 <Method void OperatorOnBackpressureBuffer(long)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable onBackpressureBuffer(long l, Action0 action0)
	{
		return lift(((Operator) (new OperatorOnBackpressureBuffer(l, action0))));
	//    0    0:aload_0         
	//    1    1:new             #1111 <Class OperatorOnBackpressureBuffer>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:aload_3         
	//    5    7:invokespecial   #1123 <Method void OperatorOnBackpressureBuffer(long, Action0)>
	//    6   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   13:areturn         
	}

	public final Observable onBackpressureBuffer(long l, Action0 action0, BackpressureOverflow.Strategy strategy)
	{
		return lift(((Operator) (new OperatorOnBackpressureBuffer(l, action0, strategy))));
	//    0    0:aload_0         
	//    1    1:new             #1111 <Class OperatorOnBackpressureBuffer>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #1128 <Method void OperatorOnBackpressureBuffer(long, Action0, BackpressureOverflow$Strategy)>
	//    7   12:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    8   15:areturn         
	}

	public final Observable onBackpressureDrop()
	{
		return lift(((Operator) (OperatorOnBackpressureDrop.instance())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #1135 <Method OperatorOnBackpressureDrop OperatorOnBackpressureDrop.instance()>
	//    2    4:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    3    7:areturn         
	}

	public final Observable onBackpressureDrop(Action1 action1)
	{
		return lift(((Operator) (new OperatorOnBackpressureDrop(action1))));
	//    0    0:aload_0         
	//    1    1:new             #1132 <Class OperatorOnBackpressureDrop>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1136 <Method void OperatorOnBackpressureDrop(Action1)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable onBackpressureLatest()
	{
		return lift(((Operator) (OperatorOnBackpressureLatest.instance())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #1142 <Method OperatorOnBackpressureLatest OperatorOnBackpressureLatest.instance()>
	//    2    4:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    3    7:areturn         
	}

	public final Observable onErrorResumeNext(Observable observable)
	{
		return lift(((Operator) (OperatorOnErrorResumeNextViaFunction.withOther(observable))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #1149 <Method OperatorOnErrorResumeNextViaFunction OperatorOnErrorResumeNextViaFunction.withOther(Observable)>
	//    3    5:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    4    8:areturn         
	}

	public final Observable onErrorResumeNext(Func1 func1)
	{
		return lift(((Operator) (new OperatorOnErrorResumeNextViaFunction(func1))));
	//    0    0:aload_0         
	//    1    1:new             #1145 <Class OperatorOnErrorResumeNextViaFunction>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1150 <Method void OperatorOnErrorResumeNextViaFunction(Func1)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable onErrorReturn(Func1 func1)
	{
		return lift(((Operator) (OperatorOnErrorResumeNextViaFunction.withSingle(func1))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #1156 <Method OperatorOnErrorResumeNextViaFunction OperatorOnErrorResumeNextViaFunction.withSingle(Func1)>
	//    3    5:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    4    8:areturn         
	}

	public final Observable onExceptionResumeNext(Observable observable)
	{
		return lift(((Operator) (OperatorOnErrorResumeNextViaFunction.withException(observable))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #1161 <Method OperatorOnErrorResumeNextViaFunction OperatorOnErrorResumeNextViaFunction.withException(Observable)>
	//    3    5:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    4    8:areturn         
	}

	public final Observable publish(Func1 func1)
	{
		return OperatorPublish.create(this, func1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #1166 <Method Observable OperatorPublish.create(Observable, Func1)>
	//    3    5:areturn         
	}

	public final ConnectableObservable publish()
	{
		return OperatorPublish.create(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #1171 <Method ConnectableObservable OperatorPublish.create(Observable)>
	//    2    4:areturn         
	}

	public final Observable reduce(Object obj, Func2 func2)
	{
		return scan(obj, func2).takeLast(1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #1175 <Method Observable scan(Object, Func2)>
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #1054 <Method Observable takeLast(int)>
	//    6   10:areturn         
	}

	public final Observable reduce(Func2 func2)
	{
		return scan(func2).last();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1179 <Method Observable scan(Func2)>
	//    3    5:invokevirtual   #729 <Method Observable last()>
	//    4    8:areturn         
	}

	public final Observable repeat()
	{
		return OnSubscribeRedo.repeat(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #1185 <Method Observable OnSubscribeRedo.repeat(Observable)>
	//    2    4:areturn         
	}

	public final Observable repeat(long l)
	{
		return OnSubscribeRedo.repeat(this, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #1188 <Method Observable OnSubscribeRedo.repeat(Observable, long)>
	//    3    5:areturn         
	}

	public final Observable repeat(long l, Scheduler scheduler)
	{
		return OnSubscribeRedo.repeat(this, l, scheduler);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #1192 <Method Observable OnSubscribeRedo.repeat(Observable, long, Scheduler)>
	//    4    6:areturn         
	}

	public final Observable repeat(Scheduler scheduler)
	{
		return OnSubscribeRedo.repeat(this, scheduler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #1196 <Method Observable OnSubscribeRedo.repeat(Observable, Scheduler)>
	//    3    5:areturn         
	}

	public final Observable repeatWhen(Func1 func1)
	{
		return OnSubscribeRedo.repeat(this, ((Func1) (new _cls15(func1))));
	//    0    0:aload_0         
	//    1    1:new             #1199 <Class Observable$15>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #1200 <Method void Observable$15(Observable, Func1)>
	//    6   10:invokestatic    #1202 <Method Observable OnSubscribeRedo.repeat(Observable, Func1)>
	//    7   13:areturn         
	}

	public final Observable repeatWhen(Func1 func1, Scheduler scheduler)
	{
		return OnSubscribeRedo.repeat(this, ((Func1) (new _cls14(func1))), scheduler);
	//    0    0:aload_0         
	//    1    1:new             #1206 <Class Observable$14>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #1207 <Method void Observable$14(Observable, Func1)>
	//    6   10:aload_2         
	//    7   11:invokestatic    #1210 <Method Observable OnSubscribeRedo.repeat(Observable, Func1, Scheduler)>
	//    8   14:areturn         
	}

	public final Observable replay(Func1 func1)
	{
		return OperatorReplay.multicastSelector(((Func0) (new _cls16())), func1);
	//    0    0:new             #1214 <Class Observable$16>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1215 <Method void Observable$16(Observable)>
	//    4    8:aload_1         
	//    5    9:invokestatic    #1220 <Method Observable OperatorReplay.multicastSelector(Func0, Func1)>
	//    6   12:areturn         
	}

	public final Observable replay(Func1 func1, int i)
	{
		return OperatorReplay.multicastSelector(((Func0) (new _cls17(i))), func1);
	//    0    0:new             #1222 <Class Observable$17>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:invokespecial   #1223 <Method void Observable$17(Observable, int)>
	//    5    9:aload_1         
	//    6   10:invokestatic    #1220 <Method Observable OperatorReplay.multicastSelector(Func0, Func1)>
	//    7   13:areturn         
	}

	public final Observable replay(Func1 func1, int i, long l, TimeUnit timeunit)
	{
		return replay(func1, i, l, timeunit, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:lload_3         
	//    4    4:aload           5
	//    5    6:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    6    9:invokevirtual   #1228 <Method Observable replay(Func1, int, long, TimeUnit, Scheduler)>
	//    7   12:areturn         
	}

	public final Observable replay(Func1 func1, int i, long l, TimeUnit timeunit, Scheduler scheduler)
	{
		if(i < 0)
	//*   0    0:iload_2         
	//*   1    1:ifge            15
			throw new IllegalArgumentException("bufferSize < 0");
	//    2    4:new             #417 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #1231 <String "bufferSize < 0">
	//    5   11:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		else
			return OperatorReplay.multicastSelector(((Func0) (new _cls18(i, l, timeunit, scheduler))), func1);
	//    7   15:new             #1233 <Class Observable$18>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:iload_2         
	//   11   21:lload_3         
	//   12   22:aload           5
	//   13   24:aload           6
	//   14   26:invokespecial   #1236 <Method void Observable$18(Observable, int, long, TimeUnit, Scheduler)>
	//   15   29:aload_1         
	//   16   30:invokestatic    #1220 <Method Observable OperatorReplay.multicastSelector(Func0, Func1)>
	//   17   33:areturn         
	}

	public final Observable replay(Func1 func1, int i, Scheduler scheduler)
	{
		return OperatorReplay.multicastSelector(((Func0) (new _cls19(i))), ((Func1) (new _cls20(func1, scheduler))));
	//    0    0:new             #1240 <Class Observable$19>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:invokespecial   #1241 <Method void Observable$19(Observable, int)>
	//    5    9:new             #1243 <Class Observable$20>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_3         
	//   10   16:invokespecial   #1246 <Method void Observable$20(Observable, Func1, Scheduler)>
	//   11   19:invokestatic    #1220 <Method Observable OperatorReplay.multicastSelector(Func0, Func1)>
	//   12   22:areturn         
	}

	public final Observable replay(Func1 func1, long l, TimeUnit timeunit)
	{
		return replay(func1, l, timeunit, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:aload           4
	//    4    5:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    5    8:invokevirtual   #1251 <Method Observable replay(Func1, long, TimeUnit, Scheduler)>
	//    6   11:areturn         
	}

	public final Observable replay(Func1 func1, long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return OperatorReplay.multicastSelector(((Func0) (new _cls21(l, timeunit, scheduler))), func1);
	//    0    0:new             #1254 <Class Observable$21>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:lload_2         
	//    4    6:aload           4
	//    5    8:aload           5
	//    6   10:invokespecial   #1255 <Method void Observable$21(Observable, long, TimeUnit, Scheduler)>
	//    7   13:aload_1         
	//    8   14:invokestatic    #1220 <Method Observable OperatorReplay.multicastSelector(Func0, Func1)>
	//    9   17:areturn         
	}

	public final Observable replay(Func1 func1, Scheduler scheduler)
	{
		return OperatorReplay.multicastSelector(((Func0) (new _cls22())), ((Func1) (new _cls23(func1, scheduler))));
	//    0    0:new             #1258 <Class Observable$22>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1259 <Method void Observable$22(Observable)>
	//    4    8:new             #1261 <Class Observable$23>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokespecial   #1262 <Method void Observable$23(Observable, Func1, Scheduler)>
	//   10   18:invokestatic    #1220 <Method Observable OperatorReplay.multicastSelector(Func0, Func1)>
	//   11   21:areturn         
	}

	public final ConnectableObservable replay()
	{
		return OperatorReplay.create(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #1264 <Method ConnectableObservable OperatorReplay.create(Observable)>
	//    2    4:areturn         
	}

	public final ConnectableObservable replay(int i)
	{
		return OperatorReplay.create(this, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #1268 <Method ConnectableObservable OperatorReplay.create(Observable, int)>
	//    3    5:areturn         
	}

	public final ConnectableObservable replay(int i, long l, TimeUnit timeunit)
	{
		return replay(i, l, timeunit, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:aload           4
	//    4    5:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    5    8:invokevirtual   #1273 <Method ConnectableObservable replay(int, long, TimeUnit, Scheduler)>
	//    6   11:areturn         
	}

	public final ConnectableObservable replay(int i, long l, TimeUnit timeunit, Scheduler scheduler)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            15
			throw new IllegalArgumentException("bufferSize < 0");
	//    2    4:new             #417 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #1231 <String "bufferSize < 0">
	//    5   11:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		else
			return OperatorReplay.create(this, l, timeunit, scheduler, i);
	//    7   15:aload_0         
	//    8   16:lload_2         
	//    9   17:aload           4
	//   10   19:aload           5
	//   11   21:iload_1         
	//   12   22:invokestatic    #1277 <Method ConnectableObservable OperatorReplay.create(Observable, long, TimeUnit, Scheduler, int)>
	//   13   25:areturn         
	}

	public final ConnectableObservable replay(int i, Scheduler scheduler)
	{
		return OperatorReplay.observeOn(replay(i), scheduler);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #1281 <Method ConnectableObservable replay(int)>
	//    3    5:aload_2         
	//    4    6:invokestatic    #1284 <Method ConnectableObservable OperatorReplay.observeOn(ConnectableObservable, Scheduler)>
	//    5    9:areturn         
	}

	public final ConnectableObservable replay(long l, TimeUnit timeunit)
	{
		return replay(l, timeunit, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    4    6:invokevirtual   #1289 <Method ConnectableObservable replay(long, TimeUnit, Scheduler)>
	//    5    9:areturn         
	}

	public final ConnectableObservable replay(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return OperatorReplay.create(this, l, timeunit, scheduler);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokestatic    #1293 <Method ConnectableObservable OperatorReplay.create(Observable, long, TimeUnit, Scheduler)>
	//    5    8:areturn         
	}

	public final ConnectableObservable replay(Scheduler scheduler)
	{
		return OperatorReplay.observeOn(replay(), scheduler);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1297 <Method ConnectableObservable replay()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #1284 <Method ConnectableObservable OperatorReplay.observeOn(ConnectableObservable, Scheduler)>
	//    4    8:areturn         
	}

	public final Observable retry()
	{
		return OnSubscribeRedo.retry(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #1301 <Method Observable OnSubscribeRedo.retry(Observable)>
	//    2    4:areturn         
	}

	public final Observable retry(long l)
	{
		return OnSubscribeRedo.retry(this, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #1303 <Method Observable OnSubscribeRedo.retry(Observable, long)>
	//    3    5:areturn         
	}

	public final Observable retry(Func2 func2)
	{
		return nest().lift(((Operator) (new OperatorRetryWithPredicate(func2))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1305 <Method Observable nest()>
	//    2    4:new             #1307 <Class OperatorRetryWithPredicate>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #1308 <Method void OperatorRetryWithPredicate(Func2)>
	//    6   12:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   15:areturn         
	}

	public final Observable retryWhen(Func1 func1)
	{
		return OnSubscribeRedo.retry(this, ((Func1) (new _cls24(func1))));
	//    0    0:aload_0         
	//    1    1:new             #1312 <Class Observable$24>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #1313 <Method void Observable$24(Observable, Func1)>
	//    6   10:invokestatic    #1315 <Method Observable OnSubscribeRedo.retry(Observable, Func1)>
	//    7   13:areturn         
	}

	public final Observable retryWhen(Func1 func1, Scheduler scheduler)
	{
		return OnSubscribeRedo.retry(this, ((Func1) (new _cls25(func1))), scheduler);
	//    0    0:aload_0         
	//    1    1:new             #1318 <Class Observable$25>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #1319 <Method void Observable$25(Observable, Func1)>
	//    6   10:aload_2         
	//    7   11:invokestatic    #1321 <Method Observable OnSubscribeRedo.retry(Observable, Func1, Scheduler)>
	//    8   14:areturn         
	}

	public final Observable sample(long l, TimeUnit timeunit)
	{
		return sample(l, timeunit, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    4    6:invokevirtual   #1325 <Method Observable sample(long, TimeUnit, Scheduler)>
	//    5    9:areturn         
	}

	public final Observable sample(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return lift(((Operator) (new OperatorSampleWithTime(l, timeunit, scheduler))));
	//    0    0:aload_0         
	//    1    1:new             #1327 <Class OperatorSampleWithTime>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #1328 <Method void OperatorSampleWithTime(long, TimeUnit, Scheduler)>
	//    7   12:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    8   15:areturn         
	}

	public final Observable sample(Observable observable)
	{
		return lift(((Operator) (new OperatorSampleWithObservable(observable))));
	//    0    0:aload_0         
	//    1    1:new             #1330 <Class OperatorSampleWithObservable>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1331 <Method void OperatorSampleWithObservable(Observable)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable scan(Object obj, Func2 func2)
	{
		return lift(((Operator) (new OperatorScan(obj, func2))));
	//    0    0:aload_0         
	//    1    1:new             #718 <Class OperatorScan>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #1334 <Method void OperatorScan(Object, Func2)>
	//    6   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   13:areturn         
	}

	public final Observable scan(Func2 func2)
	{
		return lift(((Operator) (new OperatorScan(func2))));
	//    0    0:aload_0         
	//    1    1:new             #718 <Class OperatorScan>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1335 <Method void OperatorScan(Func2)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable serialize()
	{
		return lift(((Operator) (OperatorSerialize.instance())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #1341 <Method OperatorSerialize OperatorSerialize.instance()>
	//    2    4:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    3    7:areturn         
	}

	public final Observable share()
	{
		return publish().refCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1344 <Method ConnectableObservable publish()>
	//    2    4:invokevirtual   #1349 <Method Observable ConnectableObservable.refCount()>
	//    3    7:areturn         
	}

	public final Observable single()
	{
		return lift(((Operator) (OperatorSingle.instance())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #1354 <Method OperatorSingle OperatorSingle.instance()>
	//    2    4:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    3    7:areturn         
	}

	public final Observable single(Func1 func1)
	{
		return filter(func1).single();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1056 <Method Observable filter(Func1)>
	//    3    5:invokevirtual   #972 <Method Observable single()>
	//    4    8:areturn         
	}

	public final Observable singleOrDefault(Object obj)
	{
		return lift(((Operator) (new OperatorSingle(obj))));
	//    0    0:aload_0         
	//    1    1:new             #1351 <Class OperatorSingle>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1356 <Method void OperatorSingle(Object)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable singleOrDefault(Object obj, Func1 func1)
	{
		return filter(func1).singleOrDefault(obj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #1056 <Method Observable filter(Func1)>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #979 <Method Observable singleOrDefault(Object)>
	//    5    9:areturn         
	}

	public final Observable skip(int i)
	{
		return lift(((Operator) (new OperatorSkip(i))));
	//    0    0:aload_0         
	//    1    1:new             #1359 <Class OperatorSkip>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #1360 <Method void OperatorSkip(int)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable skip(long l, TimeUnit timeunit)
	{
		return skip(l, timeunit, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    4    6:invokevirtual   #1362 <Method Observable skip(long, TimeUnit, Scheduler)>
	//    5    9:areturn         
	}

	public final Observable skip(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return lift(((Operator) (new OperatorSkipTimed(l, timeunit, scheduler))));
	//    0    0:aload_0         
	//    1    1:new             #1364 <Class OperatorSkipTimed>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #1365 <Method void OperatorSkipTimed(long, TimeUnit, Scheduler)>
	//    7   12:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    8   15:areturn         
	}

	public final Observable skipLast(int i)
	{
		return lift(((Operator) (new OperatorSkipLast(i))));
	//    0    0:aload_0         
	//    1    1:new             #1368 <Class OperatorSkipLast>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #1369 <Method void OperatorSkipLast(int)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable skipLast(long l, TimeUnit timeunit)
	{
		return skipLast(l, timeunit, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    4    6:invokevirtual   #1371 <Method Observable skipLast(long, TimeUnit, Scheduler)>
	//    5    9:areturn         
	}

	public final Observable skipLast(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return lift(((Operator) (new OperatorSkipLastTimed(l, timeunit, scheduler))));
	//    0    0:aload_0         
	//    1    1:new             #1373 <Class OperatorSkipLastTimed>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #1374 <Method void OperatorSkipLastTimed(long, TimeUnit, Scheduler)>
	//    7   12:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    8   15:areturn         
	}

	public final Observable skipUntil(Observable observable)
	{
		return lift(((Operator) (new OperatorSkipUntil(observable))));
	//    0    0:aload_0         
	//    1    1:new             #1377 <Class OperatorSkipUntil>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1378 <Method void OperatorSkipUntil(Observable)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable skipWhile(Func1 func1)
	{
		return lift(((Operator) (new OperatorSkipWhile(OperatorSkipWhile.toPredicate2(func1)))));
	//    0    0:aload_0         
	//    1    1:new             #1381 <Class OperatorSkipWhile>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokestatic    #1385 <Method Func2 OperatorSkipWhile.toPredicate2(Func1)>
	//    5    9:invokespecial   #1386 <Method void OperatorSkipWhile(Func2)>
	//    6   12:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   15:areturn         
	}

	public final Observable startWith(Iterable iterable)
	{
		return concat(from(iterable), this);
	//    0    0:aload_1         
	//    1    1:invokestatic    #224 <Method Observable from(Iterable)>
	//    2    4:aload_0         
	//    3    5:invokestatic    #768 <Method Observable concat(Observable, Observable)>
	//    4    8:areturn         
	}

	public final Observable startWith(Object obj)
	{
		return concat(just(obj), this);
	//    0    0:aload_1         
	//    1    1:invokestatic    #309 <Method Observable just(Object)>
	//    2    4:aload_0         
	//    3    5:invokestatic    #768 <Method Observable concat(Observable, Observable)>
	//    4    8:areturn         
	}

	public final Observable startWith(Object obj, Object obj1)
	{
		return concat(just(obj, obj1), this);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #196 <Method Observable just(Object, Object)>
	//    3    5:aload_0         
	//    4    6:invokestatic    #768 <Method Observable concat(Observable, Observable)>
	//    5    9:areturn         
	}

	public final Observable startWith(Object obj, Object obj1, Object obj2)
	{
		return concat(just(obj, obj1, obj2), this);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #201 <Method Observable just(Object, Object, Object)>
	//    4    6:aload_0         
	//    5    7:invokestatic    #768 <Method Observable concat(Observable, Observable)>
	//    6   10:areturn         
	}

	public final Observable startWith(Object obj, Object obj1, Object obj2, Object obj3)
	{
		return concat(just(obj, obj1, obj2, obj3), this);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokestatic    #204 <Method Observable just(Object, Object, Object, Object)>
	//    5    8:aload_0         
	//    6    9:invokestatic    #768 <Method Observable concat(Observable, Observable)>
	//    7   12:areturn         
	}

	public final Observable startWith(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
	{
		return concat(just(obj, obj1, obj2, obj3, obj4), this);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:invokestatic    #207 <Method Observable just(Object, Object, Object, Object, Object)>
	//    6   10:aload_0         
	//    7   11:invokestatic    #768 <Method Observable concat(Observable, Observable)>
	//    8   14:areturn         
	}

	public final Observable startWith(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
	{
		return concat(just(obj, obj1, obj2, obj3, obj4, obj5), this);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:aload           6
	//    6    9:invokestatic    #210 <Method Observable just(Object, Object, Object, Object, Object, Object)>
	//    7   12:aload_0         
	//    8   13:invokestatic    #768 <Method Observable concat(Observable, Observable)>
	//    9   16:areturn         
	}

	public final Observable startWith(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6)
	{
		return concat(just(obj, obj1, obj2, obj3, obj4, obj5, obj6), this);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:aload           6
	//    6    9:aload           7
	//    7   11:invokestatic    #213 <Method Observable just(Object, Object, Object, Object, Object, Object, Object)>
	//    8   14:aload_0         
	//    9   15:invokestatic    #768 <Method Observable concat(Observable, Observable)>
	//   10   18:areturn         
	}

	public final Observable startWith(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
			Object obj7)
	{
		return concat(just(obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7), this);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:aload           6
	//    6    9:aload           7
	//    7   11:aload           8
	//    8   13:invokestatic    #216 <Method Observable just(Object, Object, Object, Object, Object, Object, Object, Object)>
	//    9   16:aload_0         
	//   10   17:invokestatic    #768 <Method Observable concat(Observable, Observable)>
	//   11   20:areturn         
	}

	public final Observable startWith(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
			Object obj7, Object obj8)
	{
		return concat(just(obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8), this);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:aload           6
	//    6    9:aload           7
	//    7   11:aload           8
	//    8   13:aload           9
	//    9   15:invokestatic    #219 <Method Observable just(Object, Object, Object, Object, Object, Object, Object, Object, Object)>
	//   10   18:aload_0         
	//   11   19:invokestatic    #768 <Method Observable concat(Observable, Observable)>
	//   12   22:areturn         
	}

	public final Observable startWith(Observable observable)
	{
		return concat(observable, this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #768 <Method Observable concat(Observable, Observable)>
	//    3    5:areturn         
	}

	public final Subscription subscribe()
	{
		return subscribe(((Subscriber) (new _cls26())));
	//    0    0:aload_0         
	//    1    1:new             #1399 <Class Observable$26>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #1400 <Method void Observable$26(Observable)>
	//    5    9:invokevirtual   #1403 <Method Subscription subscribe(Subscriber)>
	//    6   12:areturn         
	}

	public final Subscription subscribe(Observer observer)
	{
		if(observer instanceof Subscriber)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #463 <Class Subscriber>
	//*   2    4:ifeq            16
			return subscribe((Subscriber)observer);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #463 <Class Subscriber>
	//    6   12:invokevirtual   #1403 <Method Subscription subscribe(Subscriber)>
	//    7   15:areturn         
		else
			return subscribe(((Subscriber) (new _cls30(observer))));
	//    8   16:aload_0         
	//    9   17:new             #1406 <Class Observable$30>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #1409 <Method void Observable$30(Observable, Observer)>
	//   14   26:invokevirtual   #1403 <Method Subscription subscribe(Subscriber)>
	//   15   29:areturn         
	}

	public final Subscription subscribe(Subscriber subscriber)
	{
		return subscribe(subscriber, this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #56  <Method Subscription subscribe(Subscriber, Observable)>
	//    3    5:areturn         
	}

	public final Subscription subscribe(Action1 action1)
	{
		if(action1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("onNext can not be null");
	//    2    4:new             #417 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #1413 <String "onNext can not be null">
	//    5   11:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		else
			return subscribe(((Subscriber) (new _cls27(action1))));
	//    7   15:aload_0         
	//    8   16:new             #1415 <Class Observable$27>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #1416 <Method void Observable$27(Observable, Action1)>
	//   13   25:invokevirtual   #1403 <Method Subscription subscribe(Subscriber)>
	//   14   28:areturn         
	}

	public final Subscription subscribe(Action1 action1, Action1 action1_1)
	{
		if(action1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("onNext can not be null");
	//    2    4:new             #417 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #1413 <String "onNext can not be null">
	//    5   11:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(action1_1 == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       30
			throw new IllegalArgumentException("onError can not be null");
	//    9   19:new             #417 <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc2            #1419 <String "onError can not be null">
	//   12   26:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//   13   29:athrow          
		else
			return subscribe(((Subscriber) (new _cls28(action1_1, action1))));
	//   14   30:aload_0         
	//   15   31:new             #1421 <Class Observable$28>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:aload_2         
	//   19   37:aload_1         
	//   20   38:invokespecial   #1424 <Method void Observable$28(Observable, Action1, Action1)>
	//   21   41:invokevirtual   #1403 <Method Subscription subscribe(Subscriber)>
	//   22   44:areturn         
	}

	public final Subscription subscribe(Action1 action1, Action1 action1_1, Action0 action0)
	{
		if(action1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("onNext can not be null");
	//    2    4:new             #417 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #1413 <String "onNext can not be null">
	//    5   11:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(action1_1 == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       30
			throw new IllegalArgumentException("onError can not be null");
	//    9   19:new             #417 <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc2            #1419 <String "onError can not be null">
	//   12   26:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//   13   29:athrow          
		if(action0 == null)
	//*  14   30:aload_3         
	//*  15   31:ifnonnull       45
			throw new IllegalArgumentException("onComplete can not be null");
	//   16   34:new             #417 <Class IllegalArgumentException>
	//   17   37:dup             
	//   18   38:ldc2            #1427 <String "onComplete can not be null">
	//   19   41:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//   20   44:athrow          
		else
			return subscribe(((Subscriber) (new _cls29(action0, action1_1, action1))));
	//   21   45:aload_0         
	//   22   46:new             #1429 <Class Observable$29>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:aload_3         
	//   26   52:aload_2         
	//   27   53:aload_1         
	//   28   54:invokespecial   #1432 <Method void Observable$29(Observable, Action0, Action1, Action1)>
	//   29   57:invokevirtual   #1403 <Method Subscription subscribe(Subscriber)>
	//   30   60:areturn         
	}

	public final Observable subscribeOn(Scheduler scheduler)
	{
		if(this instanceof ScalarSynchronousObservable)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #347 <Class ScalarSynchronousObservable>
	//*   2    4:ifeq            16
			return ((ScalarSynchronousObservable)this).scalarScheduleOn(scheduler);
	//    3    7:aload_0         
	//    4    8:checkcast       #347 <Class ScalarSynchronousObservable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #1094 <Method Observable ScalarSynchronousObservable.scalarScheduleOn(Scheduler)>
	//    7   15:areturn         
		else
			return create(((OnSubscribe) (new OperatorSubscribeOn(this, scheduler))));
	//    8   16:new             #1435 <Class OperatorSubscribeOn>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #1438 <Method void OperatorSubscribeOn(Observable, Scheduler)>
	//   13   25:invokestatic    #67  <Method Observable create(Observable$OnSubscribe)>
	//   14   28:areturn         
	}

	public final Observable switchIfEmpty(Observable observable)
	{
		return lift(((Operator) (new OperatorSwitchIfEmpty(observable))));
	//    0    0:aload_0         
	//    1    1:new             #1440 <Class OperatorSwitchIfEmpty>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1441 <Method void OperatorSwitchIfEmpty(Observable)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable switchMap(Func1 func1)
	{
		return switchOnNext(map(func1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #628 <Method Observable map(Func1)>
	//    3    5:invokestatic    #1444 <Method Observable switchOnNext(Observable)>
	//    4    8:areturn         
	}

	public final Observable switchMapDelayError(Func1 func1)
	{
		return switchOnNextDelayError(map(func1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #628 <Method Observable map(Func1)>
	//    3    5:invokestatic    #1447 <Method Observable switchOnNextDelayError(Observable)>
	//    4    8:areturn         
	}

	public final Observable take(int i)
	{
		return lift(((Operator) (new OperatorTake(i))));
	//    0    0:aload_0         
	//    1    1:new             #1449 <Class OperatorTake>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #1450 <Method void OperatorTake(int)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable take(long l, TimeUnit timeunit)
	{
		return take(l, timeunit, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    4    6:invokevirtual   #1452 <Method Observable take(long, TimeUnit, Scheduler)>
	//    5    9:areturn         
	}

	public final Observable take(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return lift(((Operator) (new OperatorTakeTimed(l, timeunit, scheduler))));
	//    0    0:aload_0         
	//    1    1:new             #1454 <Class OperatorTakeTimed>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #1455 <Method void OperatorTakeTimed(long, TimeUnit, Scheduler)>
	//    7   12:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    8   15:areturn         
	}

	public final Observable takeFirst(Func1 func1)
	{
		return filter(func1).take(1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1056 <Method Observable filter(Func1)>
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #969 <Method Observable take(int)>
	//    5    9:areturn         
	}

	public final Observable takeLast(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            9
			return ignoreElements();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1457 <Method Observable ignoreElements()>
	//    4    8:areturn         
		if(i == 1)
	//*   5    9:iload_1         
	//*   6   10:iconst_1        
	//*   7   11:icmpne          22
			return lift(((Operator) (OperatorTakeLastOne.instance())));
	//    8   14:aload_0         
	//    9   15:invokestatic    #1462 <Method OperatorTakeLastOne OperatorTakeLastOne.instance()>
	//   10   18:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   11   21:areturn         
		else
			return lift(((Operator) (new OperatorTakeLast(i))));
	//   12   22:aload_0         
	//   13   23:new             #1464 <Class OperatorTakeLast>
	//   14   26:dup             
	//   15   27:iload_1         
	//   16   28:invokespecial   #1465 <Method void OperatorTakeLast(int)>
	//   17   31:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   18   34:areturn         
	}

	public final Observable takeLast(int i, long l, TimeUnit timeunit)
	{
		return takeLast(i, l, timeunit, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:aload           4
	//    4    5:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    5    8:invokevirtual   #1469 <Method Observable takeLast(int, long, TimeUnit, Scheduler)>
	//    6   11:areturn         
	}

	public final Observable takeLast(int i, long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return lift(((Operator) (new OperatorTakeLastTimed(i, l, timeunit, scheduler))));
	//    0    0:aload_0         
	//    1    1:new             #1472 <Class OperatorTakeLastTimed>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:lload_2         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokespecial   #1475 <Method void OperatorTakeLastTimed(int, long, TimeUnit, Scheduler)>
	//    8   14:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    9   17:areturn         
	}

	public final Observable takeLast(long l, TimeUnit timeunit)
	{
		return takeLast(l, timeunit, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    4    6:invokevirtual   #1478 <Method Observable takeLast(long, TimeUnit, Scheduler)>
	//    5    9:areturn         
	}

	public final Observable takeLast(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return lift(((Operator) (new OperatorTakeLastTimed(l, timeunit, scheduler))));
	//    0    0:aload_0         
	//    1    1:new             #1472 <Class OperatorTakeLastTimed>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #1479 <Method void OperatorTakeLastTimed(long, TimeUnit, Scheduler)>
	//    7   12:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    8   15:areturn         
	}

	public final Observable takeLastBuffer(int i)
	{
		return takeLast(i).toList();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #1054 <Method Observable takeLast(int)>
	//    3    5:invokevirtual   #622 <Method Observable toList()>
	//    4    8:areturn         
	}

	public final Observable takeLastBuffer(int i, long l, TimeUnit timeunit)
	{
		return takeLast(i, l, timeunit).toList();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:aload           4
	//    4    5:invokevirtual   #1482 <Method Observable takeLast(int, long, TimeUnit)>
	//    5    8:invokevirtual   #622 <Method Observable toList()>
	//    6   11:areturn         
	}

	public final Observable takeLastBuffer(int i, long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return takeLast(i, l, timeunit, scheduler).toList();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:invokevirtual   #1469 <Method Observable takeLast(int, long, TimeUnit, Scheduler)>
	//    6   10:invokevirtual   #622 <Method Observable toList()>
	//    7   13:areturn         
	}

	public final Observable takeLastBuffer(long l, TimeUnit timeunit)
	{
		return takeLast(l, timeunit).toList();
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #1486 <Method Observable takeLast(long, TimeUnit)>
	//    4    6:invokevirtual   #622 <Method Observable toList()>
	//    5    9:areturn         
	}

	public final Observable takeLastBuffer(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return takeLast(l, timeunit, scheduler).toList();
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokevirtual   #1478 <Method Observable takeLast(long, TimeUnit, Scheduler)>
	//    5    8:invokevirtual   #622 <Method Observable toList()>
	//    6   11:areturn         
	}

	public final Observable takeUntil(Observable observable)
	{
		return lift(((Operator) (new OperatorTakeUntil(observable))));
	//    0    0:aload_0         
	//    1    1:new             #1489 <Class OperatorTakeUntil>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1490 <Method void OperatorTakeUntil(Observable)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable takeUntil(Func1 func1)
	{
		return lift(((Operator) (new OperatorTakeUntilPredicate(func1))));
	//    0    0:aload_0         
	//    1    1:new             #1493 <Class OperatorTakeUntilPredicate>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1494 <Method void OperatorTakeUntilPredicate(Func1)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable takeWhile(Func1 func1)
	{
		return lift(((Operator) (new OperatorTakeWhile(func1))));
	//    0    0:aload_0         
	//    1    1:new             #1497 <Class OperatorTakeWhile>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1498 <Method void OperatorTakeWhile(Func1)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable throttleFirst(long l, TimeUnit timeunit)
	{
		return throttleFirst(l, timeunit, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    4    6:invokevirtual   #1501 <Method Observable throttleFirst(long, TimeUnit, Scheduler)>
	//    5    9:areturn         
	}

	public final Observable throttleFirst(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return lift(((Operator) (new OperatorThrottleFirst(l, timeunit, scheduler))));
	//    0    0:aload_0         
	//    1    1:new             #1503 <Class OperatorThrottleFirst>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #1504 <Method void OperatorThrottleFirst(long, TimeUnit, Scheduler)>
	//    7   12:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    8   15:areturn         
	}

	public final Observable throttleLast(long l, TimeUnit timeunit)
	{
		return sample(l, timeunit);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #1507 <Method Observable sample(long, TimeUnit)>
	//    4    6:areturn         
	}

	public final Observable throttleLast(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return sample(l, timeunit, scheduler);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokevirtual   #1325 <Method Observable sample(long, TimeUnit, Scheduler)>
	//    5    8:areturn         
	}

	public final Observable throttleWithTimeout(long l, TimeUnit timeunit)
	{
		return debounce(l, timeunit);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #1510 <Method Observable debounce(long, TimeUnit)>
	//    4    6:areturn         
	}

	public final Observable throttleWithTimeout(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return debounce(l, timeunit, scheduler);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokevirtual   #798 <Method Observable debounce(long, TimeUnit, Scheduler)>
	//    5    8:areturn         
	}

	public final Observable timeInterval()
	{
		return timeInterval(Schedulers.immediate());
	//    0    0:aload_0         
	//    1    1:invokestatic    #1514 <Method Scheduler Schedulers.immediate()>
	//    2    4:invokevirtual   #1516 <Method Observable timeInterval(Scheduler)>
	//    3    7:areturn         
	}

	public final Observable timeInterval(Scheduler scheduler)
	{
		return lift(((Operator) (new OperatorTimeInterval(scheduler))));
	//    0    0:aload_0         
	//    1    1:new             #1519 <Class OperatorTimeInterval>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1522 <Method void OperatorTimeInterval(Scheduler)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable timeout(long l, TimeUnit timeunit)
	{
		return timeout(l, timeunit, ((Observable) (null)), Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:aconst_null     
	//    4    4:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    5    7:invokevirtual   #1527 <Method Observable timeout(long, TimeUnit, Observable, Scheduler)>
	//    6   10:areturn         
	}

	public final Observable timeout(long l, TimeUnit timeunit, Observable observable)
	{
		return timeout(l, timeunit, observable, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    5    8:invokevirtual   #1527 <Method Observable timeout(long, TimeUnit, Observable, Scheduler)>
	//    6   11:areturn         
	}

	public final Observable timeout(long l, TimeUnit timeunit, Observable observable, Scheduler scheduler)
	{
		return lift(((Operator) (new OperatorTimeout(l, timeunit, observable, scheduler))));
	//    0    0:aload_0         
	//    1    1:new             #1531 <Class OperatorTimeout>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokespecial   #1534 <Method void OperatorTimeout(long, TimeUnit, Observable, Scheduler)>
	//    8   14:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    9   17:areturn         
	}

	public final Observable timeout(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return timeout(l, timeunit, ((Observable) (null)), scheduler);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:aconst_null     
	//    4    4:aload           4
	//    5    6:invokevirtual   #1527 <Method Observable timeout(long, TimeUnit, Observable, Scheduler)>
	//    6    9:areturn         
	}

	public final Observable timeout(Func0 func0, Func1 func1)
	{
		return timeout(func0, func1, ((Observable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #1538 <Method Observable timeout(Func0, Func1, Observable)>
	//    5    7:areturn         
	}

	public final Observable timeout(Func0 func0, Func1 func1, Observable observable)
	{
		if(func1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
			throw new NullPointerException("timeoutSelector is null");
	//    2    4:new             #838 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc2            #1540 <String "timeoutSelector is null">
	//    5   11:invokespecial   #1541 <Method void NullPointerException(String)>
	//    6   14:athrow          
		else
			return lift(((Operator) (new OperatorTimeoutWithSelector(func0, func1, observable))));
	//    7   15:aload_0         
	//    8   16:new             #1543 <Class OperatorTimeoutWithSelector>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:invokespecial   #1546 <Method void OperatorTimeoutWithSelector(Func0, Func1, Observable)>
	//   14   26:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   15   29:areturn         
	}

	public final Observable timeout(Func1 func1)
	{
		return timeout(((Func0) (null)), func1, ((Observable) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #1538 <Method Observable timeout(Func0, Func1, Observable)>
	//    5    7:areturn         
	}

	public final Observable timeout(Func1 func1, Observable observable)
	{
		return timeout(((Func0) (null)), func1, observable);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #1538 <Method Observable timeout(Func0, Func1, Observable)>
	//    5    7:areturn         
	}

	public final Observable timestamp()
	{
		return timestamp(Schedulers.immediate());
	//    0    0:aload_0         
	//    1    1:invokestatic    #1514 <Method Scheduler Schedulers.immediate()>
	//    2    4:invokevirtual   #1553 <Method Observable timestamp(Scheduler)>
	//    3    7:areturn         
	}

	public final Observable timestamp(Scheduler scheduler)
	{
		return lift(((Operator) (new OperatorTimestamp(scheduler))));
	//    0    0:aload_0         
	//    1    1:new             #1556 <Class OperatorTimestamp>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1557 <Method void OperatorTimestamp(Scheduler)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final BlockingObservable toBlocking()
	{
		return BlockingObservable.from(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #1565 <Method BlockingObservable BlockingObservable.from(Observable)>
	//    2    4:areturn         
	}

	public Completable toCompletable()
	{
		return Completable.fromObservable(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #1574 <Method Completable Completable.fromObservable(Observable)>
	//    2    4:areturn         
	}

	public final Observable toList()
	{
		return lift(((Operator) (OperatorToObservableList.instance())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #1579 <Method OperatorToObservableList OperatorToObservableList.instance()>
	//    2    4:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    3    7:areturn         
	}

	public final Observable toMap(Func1 func1)
	{
		return lift(((Operator) (new OperatorToMap(func1, UtilityFunctions.identity()))));
	//    0    0:aload_0         
	//    1    1:new             #1583 <Class OperatorToMap>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokestatic    #187 <Method Func1 UtilityFunctions.identity()>
	//    5    9:invokespecial   #1584 <Method void OperatorToMap(Func1, Func1)>
	//    6   12:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   15:areturn         
	}

	public final Observable toMap(Func1 func1, Func1 func1_1)
	{
		return lift(((Operator) (new OperatorToMap(func1, func1_1))));
	//    0    0:aload_0         
	//    1    1:new             #1583 <Class OperatorToMap>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #1584 <Method void OperatorToMap(Func1, Func1)>
	//    6   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   13:areturn         
	}

	public final Observable toMap(Func1 func1, Func1 func1_1, Func0 func0)
	{
		return lift(((Operator) (new OperatorToMap(func1, func1_1, func0))));
	//    0    0:aload_0         
	//    1    1:new             #1583 <Class OperatorToMap>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #1587 <Method void OperatorToMap(Func1, Func1, Func0)>
	//    7   11:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    8   14:areturn         
	}

	public final Observable toMultimap(Func1 func1)
	{
		return lift(((Operator) (new OperatorToMultimap(func1, UtilityFunctions.identity()))));
	//    0    0:aload_0         
	//    1    1:new             #1591 <Class OperatorToMultimap>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokestatic    #187 <Method Func1 UtilityFunctions.identity()>
	//    5    9:invokespecial   #1592 <Method void OperatorToMultimap(Func1, Func1)>
	//    6   12:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   15:areturn         
	}

	public final Observable toMultimap(Func1 func1, Func1 func1_1)
	{
		return lift(((Operator) (new OperatorToMultimap(func1, func1_1))));
	//    0    0:aload_0         
	//    1    1:new             #1591 <Class OperatorToMultimap>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #1592 <Method void OperatorToMultimap(Func1, Func1)>
	//    6   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   13:areturn         
	}

	public final Observable toMultimap(Func1 func1, Func1 func1_1, Func0 func0)
	{
		return lift(((Operator) (new OperatorToMultimap(func1, func1_1, func0))));
	//    0    0:aload_0         
	//    1    1:new             #1591 <Class OperatorToMultimap>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #1595 <Method void OperatorToMultimap(Func1, Func1, Func0)>
	//    7   11:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    8   14:areturn         
	}

	public final Observable toMultimap(Func1 func1, Func1 func1_1, Func0 func0, Func1 func1_2)
	{
		return lift(((Operator) (new OperatorToMultimap(func1, func1_1, func0, func1_2))));
	//    0    0:aload_0         
	//    1    1:new             #1591 <Class OperatorToMultimap>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #1600 <Method void OperatorToMultimap(Func1, Func1, Func0, Func1)>
	//    8   13:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    9   16:areturn         
	}

	public Single toSingle()
	{
		return new Single(((Single.OnSubscribe) (OnSubscribeSingle.create(this))));
	//    0    0:new             #1605 <Class Single>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #1610 <Method OnSubscribeSingle OnSubscribeSingle.create(Observable)>
	//    4    8:invokespecial   #1613 <Method void Single(Single$OnSubscribe)>
	//    5   11:areturn         
	}

	public final Observable toSortedList()
	{
		return lift(((Operator) (new OperatorToObservableSortedList(10))));
	//    0    0:aload_0         
	//    1    1:new             #1617 <Class OperatorToObservableSortedList>
	//    2    4:dup             
	//    3    5:bipush          10
	//    4    7:invokespecial   #1618 <Method void OperatorToObservableSortedList(int)>
	//    5   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   13:areturn         
	}

	public final Observable toSortedList(int i)
	{
		return lift(((Operator) (new OperatorToObservableSortedList(i))));
	//    0    0:aload_0         
	//    1    1:new             #1617 <Class OperatorToObservableSortedList>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #1618 <Method void OperatorToObservableSortedList(int)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable toSortedList(Func2 func2)
	{
		return lift(((Operator) (new OperatorToObservableSortedList(func2, 10))));
	//    0    0:aload_0         
	//    1    1:new             #1617 <Class OperatorToObservableSortedList>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:bipush          10
	//    5    8:invokespecial   #1621 <Method void OperatorToObservableSortedList(Func2, int)>
	//    6   11:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   14:areturn         
	}

	public final Observable toSortedList(Func2 func2, int i)
	{
		return lift(((Operator) (new OperatorToObservableSortedList(func2, i))));
	//    0    0:aload_0         
	//    1    1:new             #1617 <Class OperatorToObservableSortedList>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #1621 <Method void OperatorToObservableSortedList(Func2, int)>
	//    6   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   13:areturn         
	}

	public final Subscription unsafeSubscribe(Subscriber subscriber)
	{
		Subscription subscription;
		try
		{
			subscriber.onStart();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #466 <Method void Subscriber.onStart()>
			hook.onSubscribeStart(this, onSubscribe).call(((Object) (subscriber)));
	//    2    4:getstatic       #42  <Field RxJavaObservableExecutionHook hook>
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #49  <Field Observable$OnSubscribe onSubscribe>
	//    6   12:invokevirtual   #475 <Method Observable$OnSubscribe RxJavaObservableExecutionHook.onSubscribeStart(Observable, Observable$OnSubscribe)>
	//    7   15:aload_1         
	//    8   16:invokeinterface #479 <Method void Observable$OnSubscribe.call(Object)>
			subscription = hook.onSubscribeReturn(((Subscription) (subscriber)));
	//    9   21:getstatic       #42  <Field RxJavaObservableExecutionHook hook>
	//   10   24:aload_1         
	//   11   25:invokevirtual   #483 <Method Subscription RxJavaObservableExecutionHook.onSubscribeReturn(Subscription)>
	//   12   28:astore_2        
		}
	//*  13   29:aload_2         
	//*  14   30:areturn         
		catch(Throwable throwable)
	//*  15   31:astore_2        
		{
			Exceptions.throwIfFatal(throwable);
	//   16   32:aload_2         
	//   17   33:invokestatic    #488 <Method void Exceptions.throwIfFatal(Throwable)>
			try
			{
				subscriber.onError(hook.onSubscribeError(throwable));
	//   18   36:aload_1         
	//   19   37:getstatic       #42  <Field RxJavaObservableExecutionHook hook>
	//   20   40:aload_2         
	//   21   41:invokevirtual   #492 <Method Throwable RxJavaObservableExecutionHook.onSubscribeError(Throwable)>
	//   22   44:invokevirtual   #495 <Method void Subscriber.onError(Throwable)>
			}
	//*  23   47:invokestatic    #501 <Method Subscription Subscriptions.unsubscribed()>
	//*  24   50:areturn         
			// Misplaced declaration of an exception variable
			catch(Subscriber subscriber)
	//*  25   51:astore_1        
			{
				Exceptions.throwIfFatal(((Throwable) (subscriber)));
	//   26   52:aload_1         
	//   27   53:invokestatic    #488 <Method void Exceptions.throwIfFatal(Throwable)>
				subscriber = ((Subscriber) (new RuntimeException((new StringBuilder()).append("Error occurred attempting to subscribe [").append(throwable.getMessage()).append("] and then again while trying to pass to onError.").toString(), ((Throwable) (subscriber)))));
	//   28   56:new             #503 <Class RuntimeException>
	//   29   59:dup             
	//   30   60:new             #505 <Class StringBuilder>
	//   31   63:dup             
	//   32   64:invokespecial   #506 <Method void StringBuilder()>
	//   33   67:ldc2            #508 <String "Error occurred attempting to subscribe [">
	//   34   70:invokevirtual   #512 <Method StringBuilder StringBuilder.append(String)>
	//   35   73:aload_2         
	//   36   74:invokevirtual   #516 <Method String Throwable.getMessage()>
	//   37   77:invokevirtual   #512 <Method StringBuilder StringBuilder.append(String)>
	//   38   80:ldc2            #518 <String "] and then again while trying to pass to onError.">
	//   39   83:invokevirtual   #512 <Method StringBuilder StringBuilder.append(String)>
	//   40   86:invokevirtual   #521 <Method String StringBuilder.toString()>
	//   41   89:aload_1         
	//   42   90:invokespecial   #524 <Method void RuntimeException(String, Throwable)>
	//   43   93:astore_1        
				hook.onSubscribeError(((Throwable) (subscriber)));
	//   44   94:getstatic       #42  <Field RxJavaObservableExecutionHook hook>
	//   45   97:aload_1         
	//   46   98:invokevirtual   #492 <Method Throwable RxJavaObservableExecutionHook.onSubscribeError(Throwable)>
	//   47  101:pop             
				throw subscriber;
	//   48  102:aload_1         
	//   49  103:athrow          
			}
			return Subscriptions.unsubscribed();
		}
		return subscription;
	}

	public final Observable unsubscribeOn(Scheduler scheduler)
	{
		return lift(((Operator) (new OperatorUnsubscribeOn(scheduler))));
	//    0    0:aload_0         
	//    1    1:new             #1628 <Class OperatorUnsubscribeOn>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1629 <Method void OperatorUnsubscribeOn(Scheduler)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable window(int i)
	{
		return window(i, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #1632 <Method Observable window(int, int)>
	//    4    6:areturn         
	}

	public final Observable window(int i, int j)
	{
		if(i <= 0)
	//*   0    0:iload_1         
	//*   1    1:ifgt            32
			throw new IllegalArgumentException((new StringBuilder()).append("count > 0 required but it was ").append(i).toString());
	//    2    4:new             #417 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:new             #505 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #506 <Method void StringBuilder()>
	//    7   15:ldc2            #1635 <String "count > 0 required but it was ">
	//    8   18:invokevirtual   #512 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:iload_1         
	//   10   22:invokevirtual   #747 <Method StringBuilder StringBuilder.append(int)>
	//   11   25:invokevirtual   #521 <Method String StringBuilder.toString()>
	//   12   28:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//   13   31:athrow          
		if(j <= 0)
	//*  14   32:iload_2         
	//*  15   33:ifgt            64
			throw new IllegalArgumentException((new StringBuilder()).append("skip > 0 required but it was ").append(j).toString());
	//   16   36:new             #417 <Class IllegalArgumentException>
	//   17   39:dup             
	//   18   40:new             #505 <Class StringBuilder>
	//   19   43:dup             
	//   20   44:invokespecial   #506 <Method void StringBuilder()>
	//   21   47:ldc2            #1637 <String "skip > 0 required but it was ">
	//   22   50:invokevirtual   #512 <Method StringBuilder StringBuilder.append(String)>
	//   23   53:iload_2         
	//   24   54:invokevirtual   #747 <Method StringBuilder StringBuilder.append(int)>
	//   25   57:invokevirtual   #521 <Method String StringBuilder.toString()>
	//   26   60:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//   27   63:athrow          
		else
			return lift(((Operator) (new OperatorWindowWithSize(i, j))));
	//   28   64:aload_0         
	//   29   65:new             #1639 <Class OperatorWindowWithSize>
	//   30   68:dup             
	//   31   69:iload_1         
	//   32   70:iload_2         
	//   33   71:invokespecial   #1640 <Method void OperatorWindowWithSize(int, int)>
	//   34   74:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   35   77:areturn         
	}

	public final Observable window(long l, long l1, TimeUnit timeunit)
	{
		return window(l, l1, timeunit, 0x7fffffff, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:aload           5
	//    4    5:ldc2            #423 <Int 0x7fffffff>
	//    5    8:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    6   11:invokevirtual   #1644 <Method Observable window(long, long, TimeUnit, int, Scheduler)>
	//    7   14:areturn         
	}

	public final Observable window(long l, long l1, TimeUnit timeunit, int i, Scheduler scheduler)
	{
		return lift(((Operator) (new OperatorWindowWithTime(l, l1, timeunit, i, scheduler))));
	//    0    0:aload_0         
	//    1    1:new             #1647 <Class OperatorWindowWithTime>
	//    2    4:dup             
	//    3    5:lload_1         
	//    4    6:lload_3         
	//    5    7:aload           5
	//    6    9:iload           6
	//    7   11:aload           7
	//    8   13:invokespecial   #1648 <Method void OperatorWindowWithTime(long, long, TimeUnit, int, Scheduler)>
	//    9   16:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//   10   19:areturn         
	}

	public final Observable window(long l, long l1, TimeUnit timeunit, Scheduler scheduler)
	{
		return window(l, l1, timeunit, 0x7fffffff, scheduler);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:aload           5
	//    4    5:ldc2            #423 <Int 0x7fffffff>
	//    5    8:aload           6
	//    6   10:invokevirtual   #1644 <Method Observable window(long, long, TimeUnit, int, Scheduler)>
	//    7   13:areturn         
	}

	public final Observable window(long l, TimeUnit timeunit)
	{
		return window(l, l, timeunit, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_1         
	//    3    3:aload_3         
	//    4    4:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    5    7:invokevirtual   #1652 <Method Observable window(long, long, TimeUnit, Scheduler)>
	//    6   10:areturn         
	}

	public final Observable window(long l, TimeUnit timeunit, int i)
	{
		return window(l, timeunit, i, Schedulers.computation());
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:iload           4
	//    4    5:invokestatic    #331 <Method Scheduler Schedulers.computation()>
	//    5    8:invokevirtual   #1655 <Method Observable window(long, TimeUnit, int, Scheduler)>
	//    6   11:areturn         
	}

	public final Observable window(long l, TimeUnit timeunit, int i, Scheduler scheduler)
	{
		return window(l, l, timeunit, i, scheduler);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_1         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:invokevirtual   #1644 <Method Observable window(long, long, TimeUnit, int, Scheduler)>
	//    7   11:areturn         
	}

	public final Observable window(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return window(l, timeunit, 0x7fffffff, scheduler);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:ldc2            #423 <Int 0x7fffffff>
	//    4    6:aload           4
	//    5    8:invokevirtual   #1655 <Method Observable window(long, TimeUnit, int, Scheduler)>
	//    6   11:areturn         
	}

	public final Observable window(Observable observable)
	{
		return lift(((Operator) (new OperatorWindowWithObservable(observable))));
	//    0    0:aload_0         
	//    1    1:new             #1660 <Class OperatorWindowWithObservable>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1661 <Method void OperatorWindowWithObservable(Observable)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable window(Observable observable, Func1 func1)
	{
		return lift(((Operator) (new OperatorWindowWithStartEndObservable(observable, func1))));
	//    0    0:aload_0         
	//    1    1:new             #1664 <Class OperatorWindowWithStartEndObservable>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #1665 <Method void OperatorWindowWithStartEndObservable(Observable, Func1)>
	//    6   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   13:areturn         
	}

	public final Observable window(Func0 func0)
	{
		return lift(((Operator) (new OperatorWindowWithObservableFactory(func0))));
	//    0    0:aload_0         
	//    1    1:new             #1668 <Class OperatorWindowWithObservableFactory>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1669 <Method void OperatorWindowWithObservableFactory(Func0)>
	//    5    9:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    6   12:areturn         
	}

	public final Observable withLatestFrom(Observable observable, Func2 func2)
	{
		return lift(((Operator) (new OperatorWithLatestFrom(observable, func2))));
	//    0    0:aload_0         
	//    1    1:new             #1674 <Class OperatorWithLatestFrom>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #1677 <Method void OperatorWithLatestFrom(Observable, Func2)>
	//    6   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   13:areturn         
	}

	public final Observable zipWith(Iterable iterable, Func2 func2)
	{
		return lift(((Operator) (new OperatorZipIterable(iterable, func2))));
	//    0    0:aload_0         
	//    1    1:new             #1682 <Class OperatorZipIterable>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #1685 <Method void OperatorZipIterable(Iterable, Func2)>
	//    6   10:invokevirtual   #376 <Method Observable lift(Observable$Operator)>
	//    7   13:areturn         
	}

	public final Observable zipWith(Observable observable, Func2 func2)
	{
		return zip(this, observable, func2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #1688 <Method Observable zip(Observable, Observable, Func2)>
	//    4    6:areturn         
	}

	static final RxJavaObservableExecutionHook hook = RxJavaPlugins.getInstance().getObservableExecutionHook();
	final OnSubscribe onSubscribe;

	static 
	{
	//    0    0:invokestatic    #36  <Method RxJavaPlugins RxJavaPlugins.getInstance()>
	//    1    3:invokevirtual   #40  <Method RxJavaObservableExecutionHook RxJavaPlugins.getObservableExecutionHook()>
	//    2    6:putstatic       #42  <Field RxJavaObservableExecutionHook hook>
	//*   3    9:return          
	}


/*
	static Subscription access$000(Subscriber subscriber, Observable observable)
	{
		return subscribe(subscriber, observable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #56  <Method Subscription subscribe(Subscriber, Observable)>
	//    3    5:areturn         
	}

*/

	// Unreferenced inner class rx/Observable$Operator
	/* block-local class not found */
	class Operator {}


	/* member class not found */
	class _cls3 {}


	/* member class not found */
	class _cls4 {}


	/* member class not found */
	class _cls5 {}


	/* member class not found */
	class _cls6 {}


	/* member class not found */
	class _cls7 {}


	/* member class not found */
	class _cls8 {}


	/* member class not found */
	class _cls9 {}


	/* member class not found */
	class _cls10 {}


	/* member class not found */
	class _cls11 {}


	/* member class not found */
	class _cls12 {}


	/* member class not found */
	class _cls1 {}


	/* member class not found */
	class _cls2 {}


	/* member class not found */
	class _cls13 {}


	/* member class not found */
	class _cls15 {}


	/* member class not found */
	class _cls14 {}


	/* member class not found */
	class _cls16 {}


	/* member class not found */
	class _cls17 {}


	/* member class not found */
	class _cls18 {}


	/* member class not found */
	class _cls19 {}


	/* member class not found */
	class _cls20 {}


	/* member class not found */
	class _cls21 {}


	/* member class not found */
	class _cls22 {}


	/* member class not found */
	class _cls23 {}


	/* member class not found */
	class _cls24 {}


	/* member class not found */
	class _cls25 {}


	/* member class not found */
	class _cls26 {}


	/* member class not found */
	class _cls30 {}


	/* member class not found */
	class _cls27 {}


	/* member class not found */
	class _cls28 {}


	/* member class not found */
	class _cls29 {}

}
