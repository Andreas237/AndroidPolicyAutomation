// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package rx;

import java.util.concurrent.*;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.internal.operators.CompletableOnSubscribeConcat;
import rx.internal.operators.CompletableOnSubscribeConcatArray;
import rx.internal.operators.CompletableOnSubscribeConcatIterable;
import rx.internal.operators.CompletableOnSubscribeMerge;
import rx.internal.operators.CompletableOnSubscribeMergeArray;
import rx.internal.operators.CompletableOnSubscribeMergeDelayErrorArray;
import rx.internal.operators.CompletableOnSubscribeMergeDelayErrorIterable;
import rx.internal.operators.CompletableOnSubscribeMergeIterable;
import rx.internal.operators.CompletableOnSubscribeTimeout;
import rx.internal.util.UtilityFunctions;
import rx.plugins.RxJavaErrorHandler;
import rx.plugins.RxJavaPlugins;
import rx.schedulers.Schedulers;
import rx.subscriptions.MultipleAssignmentSubscription;

// Referenced classes of package rx:
//			Observable, Single, Scheduler, Subscription, 
//			Subscriber

public class Completable
{

	protected Completable(CompletableOnSubscribe completableonsubscribe)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
		onSubscribe = completableonsubscribe;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #55  <Field Completable$CompletableOnSubscribe onSubscribe>
	//    5    9:return          
	}

	public static Completable amb(Iterable iterable)
	{
		requireNonNull(((Object) (iterable)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new _cls4(iterable))));
	//    3    5:new             #68  <Class Completable$4>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #71  <Method void Completable$4(Iterable)>
	//    7   13:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    8   16:areturn         
	}

	public static transient Completable amb(Completable acompletable[])
	{
		requireNonNull(((Object) (acompletable)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		if(acompletable.length == 0)
	//*   3    5:aload_0         
	//*   4    6:arraylength     
	//*   5    7:ifne            14
			return complete();
	//    6   10:invokestatic    #78  <Method Completable complete()>
	//    7   13:areturn         
		if(acompletable.length == 1)
	//*   8   14:aload_0         
	//*   9   15:arraylength     
	//*  10   16:iconst_1        
	//*  11   17:icmpne          24
			return acompletable[0];
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:aaload          
	//   15   23:areturn         
		else
			return create(((CompletableOnSubscribe) (new _cls3(acompletable))));
	//   16   24:new             #80  <Class Completable$3>
	//   17   27:dup             
	//   18   28:aload_0         
	//   19   29:invokespecial   #83  <Method void Completable$3(Completable[])>
	//   20   32:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//   21   35:areturn         
	}

	public static Completable complete()
	{
		return COMPLETE;
	//    0    0:getstatic       #33  <Field Completable COMPLETE>
	//    1    3:areturn         
	}

	public static Completable concat(Iterable iterable)
	{
		requireNonNull(((Object) (iterable)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new CompletableOnSubscribeConcatIterable(iterable))));
	//    3    5:new             #86  <Class CompletableOnSubscribeConcatIterable>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #87  <Method void CompletableOnSubscribeConcatIterable(Iterable)>
	//    7   13:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    8   16:areturn         
	}

	public static Completable concat(Observable observable)
	{
		return concat(observable, 2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokestatic    #91  <Method Completable concat(Observable, int)>
	//    3    5:areturn         
	}

	public static Completable concat(Observable observable, int i)
	{
		requireNonNull(((Object) (observable)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		if(i < 1)
	//*   3    5:iload_1         
	//*   4    6:iconst_1        
	//*   5    7:icmpge          37
			throw new IllegalArgumentException((new StringBuilder()).append("prefetch > 0 required but it was ").append(i).toString());
	//    6   10:new             #94  <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:new             #96  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #97  <Method void StringBuilder()>
	//   11   21:ldc1            #99  <String "prefetch > 0 required but it was ">
	//   12   23:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:iload_1         
	//   14   27:invokevirtual   #106 <Method StringBuilder StringBuilder.append(int)>
	//   15   30:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   16   33:invokespecial   #113 <Method void IllegalArgumentException(String)>
	//   17   36:athrow          
		else
			return create(((CompletableOnSubscribe) (new CompletableOnSubscribeConcat(observable, i))));
	//   18   37:new             #115 <Class CompletableOnSubscribeConcat>
	//   19   40:dup             
	//   20   41:aload_0         
	//   21   42:iload_1         
	//   22   43:invokespecial   #118 <Method void CompletableOnSubscribeConcat(Observable, int)>
	//   23   46:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//   24   49:areturn         
	}

	public static transient Completable concat(Completable acompletable[])
	{
		requireNonNull(((Object) (acompletable)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		if(acompletable.length == 0)
	//*   3    5:aload_0         
	//*   4    6:arraylength     
	//*   5    7:ifne            14
			return complete();
	//    6   10:invokestatic    #78  <Method Completable complete()>
	//    7   13:areturn         
		if(acompletable.length == 1)
	//*   8   14:aload_0         
	//*   9   15:arraylength     
	//*  10   16:iconst_1        
	//*  11   17:icmpne          24
			return acompletable[0];
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:aaload          
	//   15   23:areturn         
		else
			return create(((CompletableOnSubscribe) (new CompletableOnSubscribeConcatArray(acompletable))));
	//   16   24:new             #121 <Class CompletableOnSubscribeConcatArray>
	//   17   27:dup             
	//   18   28:aload_0         
	//   19   29:invokespecial   #122 <Method void CompletableOnSubscribeConcatArray(Completable[])>
	//   20   32:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//   21   35:areturn         
	}

	public static Completable create(CompletableOnSubscribe completableonsubscribe)
	{
		requireNonNull(((Object) (completableonsubscribe)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		try
		{
			completableonsubscribe = ((CompletableOnSubscribe) (new Completable(completableonsubscribe)));
	//    3    5:new             #2   <Class Completable>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #128 <Method void Completable(Completable$CompletableOnSubscribe)>
	//    7   13:astore_0        
		}
	//*   8   14:aload_0         
	//*   9   15:areturn         
		// Misplaced declaration of an exception variable
		catch(CompletableOnSubscribe completableonsubscribe)
	//*  10   16:astore_0        
		{
			throw completableonsubscribe;
	//   11   17:aload_0         
	//   12   18:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(CompletableOnSubscribe completableonsubscribe)
	//*  13   19:astore_0        
		{
			ERROR_HANDLER.handleError(((Throwable) (completableonsubscribe)));
	//   14   20:getstatic       #50  <Field RxJavaErrorHandler ERROR_HANDLER>
	//   15   23:aload_0         
	//   16   24:invokevirtual   #133 <Method void RxJavaErrorHandler.handleError(Throwable)>
			throw toNpe(((Throwable) (completableonsubscribe)));
	//   17   27:aload_0         
	//   18   28:invokestatic    #137 <Method NullPointerException toNpe(Throwable)>
	//   19   31:athrow          
		}
		return ((Completable) (completableonsubscribe));
	}

	public static Completable defer(Func0 func0)
	{
		requireNonNull(((Object) (func0)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new _cls5(func0))));
	//    3    5:new             #141 <Class Completable$5>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #144 <Method void Completable$5(Func0)>
	//    7   13:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    8   16:areturn         
	}

	private static void deliverUncaughtException(Throwable throwable)
	{
		Thread thread = Thread.currentThread();
	//    0    0:invokestatic    #151 <Method Thread Thread.currentThread()>
	//    1    3:astore_1        
		thread.getUncaughtExceptionHandler().uncaughtException(thread, throwable);
	//    2    4:aload_1         
	//    3    5:invokevirtual   #155 <Method Thread$UncaughtExceptionHandler Thread.getUncaughtExceptionHandler()>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokeinterface #161 <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
	//    7   15:return          
	}

	public static Completable error(Throwable throwable)
	{
		requireNonNull(((Object) (throwable)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new _cls7(throwable))));
	//    3    5:new             #165 <Class Completable$7>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #167 <Method void Completable$7(Throwable)>
	//    7   13:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    8   16:areturn         
	}

	public static Completable error(Func0 func0)
	{
		requireNonNull(((Object) (func0)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new _cls6(func0))));
	//    3    5:new             #169 <Class Completable$6>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #170 <Method void Completable$6(Func0)>
	//    7   13:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    8   16:areturn         
	}

	public static Completable fromAction(Action0 action0)
	{
		requireNonNull(((Object) (action0)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new _cls8(action0))));
	//    3    5:new             #175 <Class Completable$8>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #178 <Method void Completable$8(Action0)>
	//    7   13:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    8   16:areturn         
	}

	public static Completable fromCallable(Callable callable)
	{
		requireNonNull(((Object) (callable)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new _cls9(callable))));
	//    3    5:new             #182 <Class Completable$9>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #185 <Method void Completable$9(Callable)>
	//    7   13:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    8   16:areturn         
	}

	public static Completable fromFuture(Future future)
	{
		requireNonNull(((Object) (future)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return fromObservable(Observable.from(future));
	//    3    5:aload_0         
	//    4    6:invokestatic    #194 <Method Observable Observable.from(Future)>
	//    5    9:invokestatic    #197 <Method Completable fromObservable(Observable)>
	//    6   12:areturn         
	}

	public static Completable fromObservable(Observable observable)
	{
		requireNonNull(((Object) (observable)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new _cls10(observable))));
	//    3    5:new             #200 <Class Completable$10>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #203 <Method void Completable$10(Observable)>
	//    7   13:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    8   16:areturn         
	}

	public static Completable fromSingle(Single single)
	{
		requireNonNull(((Object) (single)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new _cls11(single))));
	//    3    5:new             #208 <Class Completable$11>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #211 <Method void Completable$11(Single)>
	//    7   13:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    8   16:areturn         
	}

	public static Completable merge(Iterable iterable)
	{
		requireNonNull(((Object) (iterable)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new CompletableOnSubscribeMergeIterable(iterable))));
	//    3    5:new             #215 <Class CompletableOnSubscribeMergeIterable>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #216 <Method void CompletableOnSubscribeMergeIterable(Iterable)>
	//    7   13:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    8   16:areturn         
	}

	public static Completable merge(Observable observable)
	{
		return merge0(observable, 0x7fffffff, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #217 <Int 0x7fffffff>
	//    2    3:iconst_0        
	//    3    4:invokestatic    #221 <Method Completable merge0(Observable, int, boolean)>
	//    4    7:areturn         
	}

	public static Completable merge(Observable observable, int i)
	{
		return merge0(observable, i, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #221 <Method Completable merge0(Observable, int, boolean)>
	//    4    6:areturn         
	}

	public static transient Completable merge(Completable acompletable[])
	{
		requireNonNull(((Object) (acompletable)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		if(acompletable.length == 0)
	//*   3    5:aload_0         
	//*   4    6:arraylength     
	//*   5    7:ifne            14
			return complete();
	//    6   10:invokestatic    #78  <Method Completable complete()>
	//    7   13:areturn         
		if(acompletable.length == 1)
	//*   8   14:aload_0         
	//*   9   15:arraylength     
	//*  10   16:iconst_1        
	//*  11   17:icmpne          24
			return acompletable[0];
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:aaload          
	//   15   23:areturn         
		else
			return create(((CompletableOnSubscribe) (new CompletableOnSubscribeMergeArray(acompletable))));
	//   16   24:new             #223 <Class CompletableOnSubscribeMergeArray>
	//   17   27:dup             
	//   18   28:aload_0         
	//   19   29:invokespecial   #224 <Method void CompletableOnSubscribeMergeArray(Completable[])>
	//   20   32:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//   21   35:areturn         
	}

	protected static Completable merge0(Observable observable, int i, boolean flag)
	{
		requireNonNull(((Object) (observable)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		if(i < 1)
	//*   3    5:iload_1         
	//*   4    6:iconst_1        
	//*   5    7:icmpge          37
			throw new IllegalArgumentException((new StringBuilder()).append("maxConcurrency > 0 required but it was ").append(i).toString());
	//    6   10:new             #94  <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:new             #96  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #97  <Method void StringBuilder()>
	//   11   21:ldc1            #226 <String "maxConcurrency > 0 required but it was ">
	//   12   23:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:iload_1         
	//   14   27:invokevirtual   #106 <Method StringBuilder StringBuilder.append(int)>
	//   15   30:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   16   33:invokespecial   #113 <Method void IllegalArgumentException(String)>
	//   17   36:athrow          
		else
			return create(((CompletableOnSubscribe) (new CompletableOnSubscribeMerge(observable, i, flag))));
	//   18   37:new             #228 <Class CompletableOnSubscribeMerge>
	//   19   40:dup             
	//   20   41:aload_0         
	//   21   42:iload_1         
	//   22   43:iload_2         
	//   23   44:invokespecial   #231 <Method void CompletableOnSubscribeMerge(Observable, int, boolean)>
	//   24   47:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//   25   50:areturn         
	}

	public static Completable mergeDelayError(Iterable iterable)
	{
		requireNonNull(((Object) (iterable)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new CompletableOnSubscribeMergeDelayErrorIterable(iterable))));
	//    3    5:new             #235 <Class CompletableOnSubscribeMergeDelayErrorIterable>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #236 <Method void CompletableOnSubscribeMergeDelayErrorIterable(Iterable)>
	//    7   13:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    8   16:areturn         
	}

	public static Completable mergeDelayError(Observable observable)
	{
		return merge0(observable, 0x7fffffff, true);
	//    0    0:aload_0         
	//    1    1:ldc1            #217 <Int 0x7fffffff>
	//    2    3:iconst_1        
	//    3    4:invokestatic    #221 <Method Completable merge0(Observable, int, boolean)>
	//    4    7:areturn         
	}

	public static Completable mergeDelayError(Observable observable, int i)
	{
		return merge0(observable, i, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokestatic    #221 <Method Completable merge0(Observable, int, boolean)>
	//    4    6:areturn         
	}

	public static transient Completable mergeDelayError(Completable acompletable[])
	{
		requireNonNull(((Object) (acompletable)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new CompletableOnSubscribeMergeDelayErrorArray(acompletable))));
	//    3    5:new             #238 <Class CompletableOnSubscribeMergeDelayErrorArray>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #239 <Method void CompletableOnSubscribeMergeDelayErrorArray(Completable[])>
	//    7   13:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    8   16:areturn         
	}

	public static Completable never()
	{
		return NEVER;
	//    0    0:getstatic       #38  <Field Completable NEVER>
	//    1    3:areturn         
	}

	static Object requireNonNull(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			throw new NullPointerException();
	//    2    4:new             #124 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #241 <Method void NullPointerException()>
	//    5   11:athrow          
		else
			return obj;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public static Completable timer(long l, TimeUnit timeunit)
	{
		return timer(l, timeunit, Schedulers.computation());
	//    0    0:lload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #250 <Method Scheduler Schedulers.computation()>
	//    3    5:invokestatic    #253 <Method Completable timer(long, TimeUnit, Scheduler)>
	//    4    8:areturn         
	}

	public static Completable timer(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		requireNonNull(((Object) (timeunit)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		requireNonNull(((Object) (scheduler)));
	//    3    5:aload_3         
	//    4    6:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    5    9:pop             
		return create(((CompletableOnSubscribe) (new _cls12(scheduler, l, timeunit))));
	//    6   10:new             #255 <Class Completable$12>
	//    7   13:dup             
	//    8   14:aload_3         
	//    9   15:lload_0         
	//   10   16:aload_2         
	//   11   17:invokespecial   #258 <Method void Completable$12(Scheduler, long, TimeUnit)>
	//   12   20:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//   13   23:areturn         
	}

	static NullPointerException toNpe(Throwable throwable)
	{
		NullPointerException nullpointerexception = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
	//    0    0:new             #124 <Class NullPointerException>
	//    1    3:dup             
	//    2    4:ldc2            #260 <String "Actually not, but can't pass out an exception otherwise...">
	//    3    7:invokespecial   #261 <Method void NullPointerException(String)>
	//    4   10:astore_1        
		nullpointerexception.initCause(throwable);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:invokevirtual   #265 <Method Throwable NullPointerException.initCause(Throwable)>
	//    8   16:pop             
		return nullpointerexception;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public static Completable using(Func0 func0, Func1 func1, Action1 action1)
	{
		return using(func0, func1, action1, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokestatic    #270 <Method Completable using(Func0, Func1, Action1, boolean)>
	//    5    7:areturn         
	}

	public static Completable using(Func0 func0, Func1 func1, Action1 action1, boolean flag)
	{
		requireNonNull(((Object) (func0)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		requireNonNull(((Object) (func1)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    5    9:pop             
		requireNonNull(((Object) (action1)));
	//    6   10:aload_2         
	//    7   11:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    8   14:pop             
		return create(((CompletableOnSubscribe) (new _cls13(func0, func1, action1, flag))));
	//    9   15:new             #273 <Class Completable$13>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:iload_3         
	//   15   23:invokespecial   #276 <Method void Completable$13(Func0, Func1, Action1, boolean)>
	//   16   26:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//   17   29:areturn         
	}

	public final Completable ambWith(Completable completable)
	{
		requireNonNull(((Object) (completable)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return amb(new Completable[] {
			this, completable
		});
	//    3    5:iconst_2        
	//    4    6:anewarray       Completable[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_0         
	//    8   12:aastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:aload_1         
	//   12   16:aastore         
	//   13   17:invokestatic    #281 <Method Completable amb(Completable[])>
	//   14   20:areturn         
	}

	public final Observable andThen(Observable observable)
	{
		requireNonNull(((Object) (observable)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return observable.delaySubscription(toObservable());
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #287 <Method Observable toObservable()>
	//    6   10:invokevirtual   #290 <Method Observable Observable.delaySubscription(Observable)>
	//    7   13:areturn         
	}

	public final Single andThen(Single single)
	{
		requireNonNull(((Object) (single)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return single.delaySubscription(toObservable());
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #287 <Method Observable toObservable()>
	//    6   10:invokevirtual   #297 <Method Single Single.delaySubscription(Observable)>
	//    7   13:areturn         
	}

	public final void await()
	{
		CountDownLatch countdownlatch = new CountDownLatch(1);
	//    0    0:new             #303 <Class CountDownLatch>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #306 <Method void CountDownLatch(int)>
	//    4    8:astore_1        
		Throwable athrowable[] = new Throwable[1];
	//    5    9:iconst_1        
	//    6   10:anewarray       Throwable[]
	//    7   13:astore_2        
		subscribe(((CompletableSubscriber) (new _cls14(countdownlatch, athrowable))));
	//    8   14:aload_0         
	//    9   15:new             #308 <Class Completable$14>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:invokespecial   #311 <Method void Completable$14(Completable, CountDownLatch, Throwable[])>
	//   15   25:invokevirtual   #315 <Method void subscribe(Completable$CompletableSubscriber)>
		if(countdownlatch.getCount() == 0L)
	//*  16   28:aload_1         
	//*  17   29:invokevirtual   #319 <Method long CountDownLatch.getCount()>
	//*  18   32:lconst_0        
	//*  19   33:lcmp            
	//*  20   34:ifne            51
		{
			if(athrowable[0] != null)
	//*  21   37:aload_2         
	//*  22   38:iconst_0        
	//*  23   39:aaload          
	//*  24   40:ifnull          50
				Exceptions.propagate(athrowable[0]);
	//   25   43:aload_2         
	//   26   44:iconst_0        
	//   27   45:aaload          
	//   28   46:invokestatic    #325 <Method RuntimeException Exceptions.propagate(Throwable)>
	//   29   49:pop             
		} else
	//*  30   50:return          
		{
			try
			{
				countdownlatch.await();
	//   31   51:aload_1         
	//   32   52:invokevirtual   #327 <Method void CountDownLatch.await()>
			}
	//*  33   55:aload_2         
	//*  34   56:iconst_0        
	//*  35   57:aaload          
	//*  36   58:ifnull          50
	//*  37   61:aload_2         
	//*  38   62:iconst_0        
	//*  39   63:aaload          
	//*  40   64:invokestatic    #325 <Method RuntimeException Exceptions.propagate(Throwable)>
	//*  41   67:pop             
	//*  42   68:return          
			catch(InterruptedException interruptedexception)
	//*  43   69:astore_1        
			{
				throw Exceptions.propagate(((Throwable) (interruptedexception)));
	//   44   70:aload_1         
	//   45   71:invokestatic    #325 <Method RuntimeException Exceptions.propagate(Throwable)>
	//   46   74:athrow          
			}
			if(athrowable[0] != null)
			{
				Exceptions.propagate(athrowable[0]);
				return;
			}
		}
	}

	public final boolean await(long l, TimeUnit timeunit)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		requireNonNull(((Object) (timeunit)));
	//    2    3:aload_3         
	//    3    4:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    4    7:pop             
		CountDownLatch countdownlatch = new CountDownLatch(1);
	//    5    8:new             #303 <Class CountDownLatch>
	//    6   11:dup             
	//    7   12:iconst_1        
	//    8   13:invokespecial   #306 <Method void CountDownLatch(int)>
	//    9   16:astore          6
		Throwable athrowable[] = new Throwable[1];
	//   10   18:iconst_1        
	//   11   19:anewarray       Throwable[]
	//   12   22:astore          7
		subscribe(((CompletableSubscriber) (new _cls15(countdownlatch, athrowable))));
	//   13   24:aload_0         
	//   14   25:new             #330 <Class Completable$15>
	//   15   28:dup             
	//   16   29:aload_0         
	//   17   30:aload           6
	//   18   32:aload           7
	//   19   34:invokespecial   #331 <Method void Completable$15(Completable, CountDownLatch, Throwable[])>
	//   20   37:invokevirtual   #315 <Method void subscribe(Completable$CompletableSubscriber)>
		boolean flag;
		if(countdownlatch.getCount() == 0L)
	//*  21   40:aload           6
	//*  22   42:invokevirtual   #319 <Method long CountDownLatch.getCount()>
	//*  23   45:lconst_0        
	//*  24   46:lcmp            
	//*  25   47:ifne            76
		{
			flag = flag1;
	//   26   50:iload           5
	//   27   52:istore          4
			if(athrowable[0] != null)
	//*  28   54:aload           7
	//*  29   56:iconst_0        
	//*  30   57:aaload          
	//*  31   58:ifnull          73
			{
				Exceptions.propagate(athrowable[0]);
	//   32   61:aload           7
	//   33   63:iconst_0        
	//   34   64:aaload          
	//   35   65:invokestatic    #325 <Method RuntimeException Exceptions.propagate(Throwable)>
	//   36   68:pop             
				flag = flag1;
	//   37   69:iload           5
	//   38   71:istore          4
			}
		} else
	//*  39   73:iload           4
	//*  40   75:ireturn         
		{
			boolean flag2;
			try
			{
				flag2 = countdownlatch.await(l, timeunit);
	//   41   76:aload           6
	//   42   78:lload_1         
	//   43   79:aload_3         
	//   44   80:invokevirtual   #333 <Method boolean CountDownLatch.await(long, TimeUnit)>
	//   45   83:istore          5
			}
	//*  46   85:iload           5
	//*  47   87:istore          4
	//*  48   89:iload           5
	//*  49   91:ifeq            73
	//*  50   94:iload           5
	//*  51   96:istore          4
	//*  52   98:aload           7
	//*  53  100:iconst_0        
	//*  54  101:aaload          
	//*  55  102:ifnull          73
	//*  56  105:aload           7
	//*  57  107:iconst_0        
	//*  58  108:aaload          
	//*  59  109:invokestatic    #325 <Method RuntimeException Exceptions.propagate(Throwable)>
	//*  60  112:pop             
	//*  61  113:iload           5
	//*  62  115:ireturn         
			// Misplaced declaration of an exception variable
			catch(TimeUnit timeunit)
	//*  63  116:astore_3        
			{
				throw Exceptions.propagate(((Throwable) (timeunit)));
	//   64  117:aload_3         
	//   65  118:invokestatic    #325 <Method RuntimeException Exceptions.propagate(Throwable)>
	//   66  121:athrow          
			}
			flag = flag2;
			if(flag2)
			{
				flag = flag2;
				if(athrowable[0] != null)
				{
					Exceptions.propagate(athrowable[0]);
					return flag2;
				}
			}
		}
		return flag;
	}

	public final Completable compose(CompletableTransformer completabletransformer)
	{
		return (Completable)to(((Func1) (completabletransformer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #339 <Method Object to(Func1)>
	//    3    5:checkcast       #2   <Class Completable>
	//    4    8:areturn         
	}

	public final Completable concatWith(Completable completable)
	{
		requireNonNull(((Object) (completable)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return concat(new Completable[] {
			this, completable
		});
	//    3    5:iconst_2        
	//    4    6:anewarray       Completable[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_0         
	//    8   12:aastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:aload_1         
	//   12   16:aastore         
	//   13   17:invokestatic    #342 <Method Completable concat(Completable[])>
	//   14   20:areturn         
	}

	public final Completable delay(long l, TimeUnit timeunit)
	{
		return delay(l, timeunit, Schedulers.computation(), false);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #250 <Method Scheduler Schedulers.computation()>
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #346 <Method Completable delay(long, TimeUnit, Scheduler, boolean)>
	//    6   10:areturn         
	}

	public final Completable delay(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return delay(l, timeunit, scheduler, false);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:iconst_0        
	//    5    6:invokevirtual   #346 <Method Completable delay(long, TimeUnit, Scheduler, boolean)>
	//    6    9:areturn         
	}

	public final Completable delay(long l, TimeUnit timeunit, Scheduler scheduler, boolean flag)
	{
		requireNonNull(((Object) (timeunit)));
	//    0    0:aload_3         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		requireNonNull(((Object) (scheduler)));
	//    3    5:aload           4
	//    4    7:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    5   10:pop             
		return create(((CompletableOnSubscribe) (new _cls16(scheduler, l, timeunit, flag))));
	//    6   11:new             #348 <Class Completable$16>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:aload           4
	//   10   18:lload_1         
	//   11   19:aload_3         
	//   12   20:iload           5
	//   13   22:invokespecial   #351 <Method void Completable$16(Completable, Scheduler, long, TimeUnit, boolean)>
	//   14   25:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//   15   28:areturn         
	}

	public final Completable doAfterTerminate(Action0 action0)
	{
		return doOnLifecycle(((Action1) (Actions.empty())), ((Action1) (Actions.empty())), ((Action0) (Actions.empty())), action0, ((Action0) (Actions.empty())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    2    4:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    3    7:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    4   10:aload_1         
	//    5   11:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    6   14:invokevirtual   #362 <Method Completable doOnLifecycle(Action1, Action1, Action0, Action0, Action0)>
	//    7   17:areturn         
	}

	public final Completable doOnComplete(Action0 action0)
	{
		return doOnCompleted(action0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #367 <Method Completable doOnCompleted(Action0)>
	//    3    5:areturn         
	}

	public final Completable doOnCompleted(Action0 action0)
	{
		return doOnLifecycle(((Action1) (Actions.empty())), ((Action1) (Actions.empty())), action0, ((Action0) (Actions.empty())), ((Action0) (Actions.empty())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    2    4:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    3    7:aload_1         
	//    4    8:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    5   11:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    6   14:invokevirtual   #362 <Method Completable doOnLifecycle(Action1, Action1, Action0, Action0, Action0)>
	//    7   17:areturn         
	}

	public final Completable doOnError(Action1 action1)
	{
		return doOnLifecycle(((Action1) (Actions.empty())), action1, ((Action0) (Actions.empty())), ((Action0) (Actions.empty())), ((Action0) (Actions.empty())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    4    8:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    5   11:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    6   14:invokevirtual   #362 <Method Completable doOnLifecycle(Action1, Action1, Action0, Action0, Action0)>
	//    7   17:areturn         
	}

	protected final Completable doOnLifecycle(Action1 action1, Action1 action1_1, Action0 action0, Action0 action0_1, Action0 action0_2)
	{
		requireNonNull(((Object) (action1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		requireNonNull(((Object) (action1_1)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    5    9:pop             
		requireNonNull(((Object) (action0)));
	//    6   10:aload_3         
	//    7   11:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    8   14:pop             
		requireNonNull(((Object) (action0_1)));
	//    9   15:aload           4
	//   10   17:invokestatic    #66  <Method Object requireNonNull(Object)>
	//   11   20:pop             
		requireNonNull(((Object) (action0_2)));
	//   12   21:aload           5
	//   13   23:invokestatic    #66  <Method Object requireNonNull(Object)>
	//   14   26:pop             
		return create(((CompletableOnSubscribe) (new _cls17(action0, action0_1, action1_1, action1, action0_2))));
	//   15   27:new             #373 <Class Completable$17>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:aload_3         
	//   19   33:aload           4
	//   20   35:aload_2         
	//   21   36:aload_1         
	//   22   37:aload           5
	//   23   39:invokespecial   #376 <Method void Completable$17(Completable, Action0, Action0, Action1, Action1, Action0)>
	//   24   42:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//   25   45:areturn         
	}

	public final Completable doOnSubscribe(Action1 action1)
	{
		return doOnLifecycle(action1, ((Action1) (Actions.empty())), ((Action0) (Actions.empty())), ((Action0) (Actions.empty())), ((Action0) (Actions.empty())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    3    5:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    4    8:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    5   11:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    6   14:invokevirtual   #362 <Method Completable doOnLifecycle(Action1, Action1, Action0, Action0, Action0)>
	//    7   17:areturn         
	}

	public final Completable doOnTerminate(Action0 action0)
	{
		return doOnLifecycle(((Action1) (Actions.empty())), ((Action1) (new _cls18(action0))), action0, ((Action0) (Actions.empty())), ((Action0) (Actions.empty())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    2    4:new             #382 <Class Completable$18>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #385 <Method void Completable$18(Completable, Action0)>
	//    7   13:aload_1         
	//    8   14:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    9   17:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//   10   20:invokevirtual   #362 <Method Completable doOnLifecycle(Action1, Action1, Action0, Action0, Action0)>
	//   11   23:areturn         
	}

	public final Completable doOnUnsubscribe(Action0 action0)
	{
		return doOnLifecycle(((Action1) (Actions.empty())), ((Action1) (Actions.empty())), ((Action0) (Actions.empty())), ((Action0) (Actions.empty())), action0);
	//    0    0:aload_0         
	//    1    1:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    2    4:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    3    7:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    4   10:invokestatic    #358 <Method rx.functions.Actions$EmptyAction Actions.empty()>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #362 <Method Completable doOnLifecycle(Action1, Action1, Action0, Action0, Action0)>
	//    7   17:areturn         
	}

	public final Completable endWith(Completable completable)
	{
		return concatWith(completable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #389 <Method Completable concatWith(Completable)>
	//    3    5:areturn         
	}

	public final Observable endWith(Observable observable)
	{
		return observable.startWith(toObservable());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #287 <Method Observable toObservable()>
	//    3    5:invokevirtual   #392 <Method Observable Observable.startWith(Observable)>
	//    4    8:areturn         
	}

	public final Throwable get()
	{
		CountDownLatch countdownlatch = new CountDownLatch(1);
	//    0    0:new             #303 <Class CountDownLatch>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #306 <Method void CountDownLatch(int)>
	//    4    8:astore_1        
		Throwable athrowable[] = new Throwable[1];
	//    5    9:iconst_1        
	//    6   10:anewarray       Throwable[]
	//    7   13:astore_2        
		subscribe(((CompletableSubscriber) (new _cls19(countdownlatch, athrowable))));
	//    8   14:aload_0         
	//    9   15:new             #396 <Class Completable$19>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:invokespecial   #397 <Method void Completable$19(Completable, CountDownLatch, Throwable[])>
	//   15   25:invokevirtual   #315 <Method void subscribe(Completable$CompletableSubscriber)>
		if(countdownlatch.getCount() == 0L)
	//*  16   28:aload_1         
	//*  17   29:invokevirtual   #319 <Method long CountDownLatch.getCount()>
	//*  18   32:lconst_0        
	//*  19   33:lcmp            
	//*  20   34:ifne            41
			return athrowable[0];
	//   21   37:aload_2         
	//   22   38:iconst_0        
	//   23   39:aaload          
	//   24   40:areturn         
		try
		{
			countdownlatch.await();
	//   25   41:aload_1         
	//   26   42:invokevirtual   #327 <Method void CountDownLatch.await()>
		}
	//*  27   45:aload_2         
	//*  28   46:iconst_0        
	//*  29   47:aaload          
	//*  30   48:areturn         
		catch(InterruptedException interruptedexception)
	//*  31   49:astore_1        
		{
			throw Exceptions.propagate(((Throwable) (interruptedexception)));
	//   32   50:aload_1         
	//   33   51:invokestatic    #325 <Method RuntimeException Exceptions.propagate(Throwable)>
	//   34   54:athrow          
		}
		return athrowable[0];
	}

	public final Throwable get(long l, TimeUnit timeunit)
	{
		requireNonNull(((Object) (timeunit)));
	//    0    0:aload_3         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		CountDownLatch countdownlatch = new CountDownLatch(1);
	//    3    5:new             #303 <Class CountDownLatch>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #306 <Method void CountDownLatch(int)>
	//    7   13:astore          5
		Throwable athrowable[] = new Throwable[1];
	//    8   15:iconst_1        
	//    9   16:anewarray       Throwable[]
	//   10   19:astore          6
		subscribe(((CompletableSubscriber) (new _cls20(countdownlatch, athrowable))));
	//   11   21:aload_0         
	//   12   22:new             #400 <Class Completable$20>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:aload           5
	//   16   29:aload           6
	//   17   31:invokespecial   #401 <Method void Completable$20(Completable, CountDownLatch, Throwable[])>
	//   18   34:invokevirtual   #315 <Method void subscribe(Completable$CompletableSubscriber)>
		if(countdownlatch.getCount() == 0L)
	//*  19   37:aload           5
	//*  20   39:invokevirtual   #319 <Method long CountDownLatch.getCount()>
	//*  21   42:lconst_0        
	//*  22   43:lcmp            
	//*  23   44:ifne            52
			return athrowable[0];
	//   24   47:aload           6
	//   25   49:iconst_0        
	//   26   50:aaload          
	//   27   51:areturn         
		boolean flag;
		try
		{
			flag = countdownlatch.await(l, timeunit);
	//   28   52:aload           5
	//   29   54:lload_1         
	//   30   55:aload_3         
	//   31   56:invokevirtual   #333 <Method boolean CountDownLatch.await(long, TimeUnit)>
	//   32   59:istore          4
		}
	//*  33   61:iload           4
	//*  34   63:ifeq            77
	//*  35   66:aload           6
	//*  36   68:iconst_0        
	//*  37   69:aaload          
	//*  38   70:areturn         
		// Misplaced declaration of an exception variable
		catch(TimeUnit timeunit)
	//*  39   71:astore_3        
		{
			throw Exceptions.propagate(((Throwable) (timeunit)));
	//   40   72:aload_3         
	//   41   73:invokestatic    #325 <Method RuntimeException Exceptions.propagate(Throwable)>
	//   42   76:athrow          
		}
		if(flag)
		{
			return athrowable[0];
		} else
		{
			Exceptions.propagate(((Throwable) (new TimeoutException())));
	//   43   77:new             #403 <Class TimeoutException>
	//   44   80:dup             
	//   45   81:invokespecial   #404 <Method void TimeoutException()>
	//   46   84:invokestatic    #325 <Method RuntimeException Exceptions.propagate(Throwable)>
	//   47   87:pop             
			return null;
	//   48   88:aconst_null     
	//   49   89:areturn         
		}
	}

	public final Completable lift(CompletableOperator completableoperator)
	{
		requireNonNull(((Object) (completableoperator)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new _cls21(completableoperator))));
	//    3    5:new             #408 <Class Completable$21>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #411 <Method void Completable$21(Completable, Completable$CompletableOperator)>
	//    8   14:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    9   17:areturn         
	}

	public final Completable mergeWith(Completable completable)
	{
		requireNonNull(((Object) (completable)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return merge(new Completable[] {
			this, completable
		});
	//    3    5:iconst_2        
	//    4    6:anewarray       Completable[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_0         
	//    8   12:aastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:aload_1         
	//   12   16:aastore         
	//   13   17:invokestatic    #414 <Method Completable merge(Completable[])>
	//   14   20:areturn         
	}

	public final Completable observeOn(Scheduler scheduler)
	{
		requireNonNull(((Object) (scheduler)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new _cls22(scheduler))));
	//    3    5:new             #418 <Class Completable$22>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #421 <Method void Completable$22(Completable, Scheduler)>
	//    8   14:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    9   17:areturn         
	}

	public final Completable onErrorComplete()
	{
		return onErrorComplete(UtilityFunctions.alwaysTrue());
	//    0    0:aload_0         
	//    1    1:invokestatic    #428 <Method Func1 UtilityFunctions.alwaysTrue()>
	//    2    4:invokevirtual   #431 <Method Completable onErrorComplete(Func1)>
	//    3    7:areturn         
	}

	public final Completable onErrorComplete(Func1 func1)
	{
		requireNonNull(((Object) (func1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new _cls23(func1))));
	//    3    5:new             #433 <Class Completable$23>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #436 <Method void Completable$23(Completable, Func1)>
	//    8   14:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    9   17:areturn         
	}

	public final Completable onErrorResumeNext(Func1 func1)
	{
		requireNonNull(((Object) (func1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new _cls24(func1))));
	//    3    5:new             #440 <Class Completable$24>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #441 <Method void Completable$24(Completable, Func1)>
	//    8   14:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    9   17:areturn         
	}

	public final Completable repeat()
	{
		return fromObservable(toObservable().repeat());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #287 <Method Observable toObservable()>
	//    2    4:invokevirtual   #445 <Method Observable Observable.repeat()>
	//    3    7:invokestatic    #197 <Method Completable fromObservable(Observable)>
	//    4   10:areturn         
	}

	public final Completable repeat(long l)
	{
		return fromObservable(toObservable().repeat(l));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #287 <Method Observable toObservable()>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #449 <Method Observable Observable.repeat(long)>
	//    4    8:invokestatic    #197 <Method Completable fromObservable(Observable)>
	//    5   11:areturn         
	}

	public final Completable repeatWhen(Func1 func1)
	{
		requireNonNull(((Object) (func1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return fromObservable(toObservable().repeatWhen(func1));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #287 <Method Observable toObservable()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #453 <Method Observable Observable.repeatWhen(Func1)>
	//    7   13:invokestatic    #197 <Method Completable fromObservable(Observable)>
	//    8   16:areturn         
	}

	public final Completable retry()
	{
		return fromObservable(toObservable().retry());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #287 <Method Observable toObservable()>
	//    2    4:invokevirtual   #457 <Method Observable Observable.retry()>
	//    3    7:invokestatic    #197 <Method Completable fromObservable(Observable)>
	//    4   10:areturn         
	}

	public final Completable retry(long l)
	{
		return fromObservable(toObservable().retry(l));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #287 <Method Observable toObservable()>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #459 <Method Observable Observable.retry(long)>
	//    4    8:invokestatic    #197 <Method Completable fromObservable(Observable)>
	//    5   11:areturn         
	}

	public final Completable retry(Func2 func2)
	{
		return fromObservable(toObservable().retry(func2));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #287 <Method Observable toObservable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #463 <Method Observable Observable.retry(Func2)>
	//    4    8:invokestatic    #197 <Method Completable fromObservable(Observable)>
	//    5   11:areturn         
	}

	public final Completable retryWhen(Func1 func1)
	{
		return fromObservable(toObservable().retryWhen(func1));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #287 <Method Observable toObservable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #467 <Method Observable Observable.retryWhen(Func1)>
	//    4    8:invokestatic    #197 <Method Completable fromObservable(Observable)>
	//    5   11:areturn         
	}

	public final Completable startWith(Completable completable)
	{
		requireNonNull(((Object) (completable)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return concat(new Completable[] {
			completable, this
		});
	//    3    5:iconst_2        
	//    4    6:anewarray       Completable[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:aastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:aload_0         
	//   12   16:aastore         
	//   13   17:invokestatic    #342 <Method Completable concat(Completable[])>
	//   14   20:areturn         
	}

	public final Observable startWith(Observable observable)
	{
		requireNonNull(((Object) (observable)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return toObservable().startWith(observable);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #287 <Method Observable toObservable()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #392 <Method Observable Observable.startWith(Observable)>
	//    7   13:areturn         
	}

	public final Subscription subscribe()
	{
		MultipleAssignmentSubscription multipleassignmentsubscription = new MultipleAssignmentSubscription();
	//    0    0:new             #471 <Class MultipleAssignmentSubscription>
	//    1    3:dup             
	//    2    4:invokespecial   #472 <Method void MultipleAssignmentSubscription()>
	//    3    7:astore_1        
		subscribe(((CompletableSubscriber) (new _cls25(multipleassignmentsubscription))));
	//    4    8:aload_0         
	//    5    9:new             #474 <Class Completable$25>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #477 <Method void Completable$25(Completable, MultipleAssignmentSubscription)>
	//   10   18:invokevirtual   #315 <Method void subscribe(Completable$CompletableSubscriber)>
		return ((Subscription) (multipleassignmentsubscription));
	//   11   21:aload_1         
	//   12   22:areturn         
	}

	public final Subscription subscribe(Action0 action0)
	{
		requireNonNull(((Object) (action0)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		MultipleAssignmentSubscription multipleassignmentsubscription = new MultipleAssignmentSubscription();
	//    3    5:new             #471 <Class MultipleAssignmentSubscription>
	//    4    8:dup             
	//    5    9:invokespecial   #472 <Method void MultipleAssignmentSubscription()>
	//    6   12:astore_2        
		subscribe(((CompletableSubscriber) (new _cls26(action0, multipleassignmentsubscription))));
	//    7   13:aload_0         
	//    8   14:new             #480 <Class Completable$26>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:invokespecial   #483 <Method void Completable$26(Completable, Action0, MultipleAssignmentSubscription)>
	//   14   24:invokevirtual   #315 <Method void subscribe(Completable$CompletableSubscriber)>
		return ((Subscription) (multipleassignmentsubscription));
	//   15   27:aload_2         
	//   16   28:areturn         
	}

	public final Subscription subscribe(Action1 action1, Action0 action0)
	{
		requireNonNull(((Object) (action1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		requireNonNull(((Object) (action0)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    5    9:pop             
		MultipleAssignmentSubscription multipleassignmentsubscription = new MultipleAssignmentSubscription();
	//    6   10:new             #471 <Class MultipleAssignmentSubscription>
	//    7   13:dup             
	//    8   14:invokespecial   #472 <Method void MultipleAssignmentSubscription()>
	//    9   17:astore_3        
		subscribe(((CompletableSubscriber) (new _cls27(action0, multipleassignmentsubscription, action1))));
	//   10   18:aload_0         
	//   11   19:new             #486 <Class Completable$27>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:aload_3         
	//   16   26:aload_1         
	//   17   27:invokespecial   #489 <Method void Completable$27(Completable, Action0, MultipleAssignmentSubscription, Action1)>
	//   18   30:invokevirtual   #315 <Method void subscribe(Completable$CompletableSubscriber)>
		return ((Subscription) (multipleassignmentsubscription));
	//   19   33:aload_3         
	//   20   34:areturn         
	}

	public final void subscribe(CompletableSubscriber completablesubscriber)
	{
		requireNonNull(((Object) (completablesubscriber)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		try
		{
	/* block-local class not found */
	class CompletableOnSubscribe {}

			onSubscribe.call(((Object) (completablesubscriber)));
	//    3    5:aload_0         
	//    4    6:getfield        #55  <Field Completable$CompletableOnSubscribe onSubscribe>
	//    5    9:aload_1         
	//    6   10:invokeinterface #494 <Method void Completable$CompletableOnSubscribe.call(Object)>
			return;
	//    7   15:return          
		}
		// Misplaced declaration of an exception variable
		catch(CompletableSubscriber completablesubscriber)
	//*   8   16:astore_1        
		{
			throw completablesubscriber;
	//    9   17:aload_1         
	//   10   18:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(CompletableSubscriber completablesubscriber)
	//*  11   19:astore_1        
		{
			ERROR_HANDLER.handleError(((Throwable) (completablesubscriber)));
	//   12   20:getstatic       #50  <Field RxJavaErrorHandler ERROR_HANDLER>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #133 <Method void RxJavaErrorHandler.handleError(Throwable)>
		}
		throw toNpe(((Throwable) (completablesubscriber)));
	//   15   27:aload_1         
	//   16   28:invokestatic    #137 <Method NullPointerException toNpe(Throwable)>
	//   17   31:athrow          
	}

	public final void subscribe(Subscriber subscriber)
	{
		requireNonNull(((Object) (subscriber)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		if(subscriber == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       23
		{
			try
			{
				throw new NullPointerException("The RxJavaPlugins.onSubscribe returned a null Subscriber");
	//    5    9:new             #124 <Class NullPointerException>
	//    6   12:dup             
	//    7   13:ldc2            #497 <String "The RxJavaPlugins.onSubscribe returned a null Subscriber">
	//    8   16:invokespecial   #261 <Method void NullPointerException(String)>
	//    9   19:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(Subscriber subscriber)
	//*  10   20:astore_1        
			{
				throw subscriber;
	//   11   21:aload_1         
	//   12   22:athrow          
			}
	//*  13   23:aload_0         
	//*  14   24:new             #499 <Class Completable$28>
	//*  15   27:dup             
	//*  16   28:aload_0         
	//*  17   29:aload_1         
	//*  18   30:invokespecial   #502 <Method void Completable$28(Completable, Subscriber)>
	//*  19   33:invokevirtual   #315 <Method void subscribe(Completable$CompletableSubscriber)>
	//*  20   36:return          
			// Misplaced declaration of an exception variable
			catch(Subscriber subscriber)
	//*  21   37:astore_1        
			{
				ERROR_HANDLER.handleError(((Throwable) (subscriber)));
	//   22   38:getstatic       #50  <Field RxJavaErrorHandler ERROR_HANDLER>
	//   23   41:aload_1         
	//   24   42:invokevirtual   #133 <Method void RxJavaErrorHandler.handleError(Throwable)>
			}
			break MISSING_BLOCK_LABEL_45;
		}
		subscribe(((CompletableSubscriber) (new _cls28(subscriber))));
		return;
		throw toNpe(((Throwable) (subscriber)));
	//   25   45:aload_1         
	//   26   46:invokestatic    #137 <Method NullPointerException toNpe(Throwable)>
	//   27   49:athrow          
	}

	public final Completable subscribeOn(Scheduler scheduler)
	{
		requireNonNull(((Object) (scheduler)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new _cls29(scheduler))));
	//    3    5:new             #506 <Class Completable$29>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #507 <Method void Completable$29(Completable, Scheduler)>
	//    8   14:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    9   17:areturn         
	}

	public final Completable timeout(long l, TimeUnit timeunit)
	{
		return timeout0(l, timeunit, Schedulers.computation(), ((Completable) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokestatic    #250 <Method Scheduler Schedulers.computation()>
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #512 <Method Completable timeout0(long, TimeUnit, Scheduler, Completable)>
	//    6   10:areturn         
	}

	public final Completable timeout(long l, TimeUnit timeunit, Completable completable)
	{
		requireNonNull(((Object) (completable)));
	//    0    0:aload           4
	//    1    2:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    5:pop             
		return timeout0(l, timeunit, Schedulers.computation(), completable);
	//    3    6:aload_0         
	//    4    7:lload_1         
	//    5    8:aload_3         
	//    6    9:invokestatic    #250 <Method Scheduler Schedulers.computation()>
	//    7   12:aload           4
	//    8   14:invokevirtual   #512 <Method Completable timeout0(long, TimeUnit, Scheduler, Completable)>
	//    9   17:areturn         
	}

	public final Completable timeout(long l, TimeUnit timeunit, Scheduler scheduler)
	{
		return timeout0(l, timeunit, scheduler, ((Completable) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aconst_null     
	//    5    6:invokevirtual   #512 <Method Completable timeout0(long, TimeUnit, Scheduler, Completable)>
	//    6    9:areturn         
	}

	public final Completable timeout(long l, TimeUnit timeunit, Scheduler scheduler, Completable completable)
	{
		requireNonNull(((Object) (completable)));
	//    0    0:aload           5
	//    1    2:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    5:pop             
		return timeout0(l, timeunit, scheduler, completable);
	//    3    6:aload_0         
	//    4    7:lload_1         
	//    5    8:aload_3         
	//    6    9:aload           4
	//    7   11:aload           5
	//    8   13:invokevirtual   #512 <Method Completable timeout0(long, TimeUnit, Scheduler, Completable)>
	//    9   16:areturn         
	}

	public final Completable timeout0(long l, TimeUnit timeunit, Scheduler scheduler, Completable completable)
	{
		requireNonNull(((Object) (timeunit)));
	//    0    0:aload_3         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		requireNonNull(((Object) (scheduler)));
	//    3    5:aload           4
	//    4    7:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    5   10:pop             
		return create(((CompletableOnSubscribe) (new CompletableOnSubscribeTimeout(this, l, timeunit, scheduler, completable))));
	//    6   11:new             #515 <Class CompletableOnSubscribeTimeout>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:lload_1         
	//   10   17:aload_3         
	//   11   18:aload           4
	//   12   20:aload           5
	//   13   22:invokespecial   #518 <Method void CompletableOnSubscribeTimeout(Completable, long, TimeUnit, Scheduler, Completable)>
	//   14   25:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//   15   28:areturn         
	}

	public final Object to(Func1 func1)
	{
		return func1.call(((Object) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #522 <Method Object Func1.call(Object)>
	//    3    7:areturn         
	}

	public final Observable toObservable()
	{
		return Observable.create(((Observable.OnSubscribe) (new _cls30())));
	//    0    0:new             #525 <Class Completable$30>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #528 <Method void Completable$30(Completable)>
	//    4    8:invokestatic    #531 <Method Observable Observable.create(Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public final Single toSingle(Func0 func0)
	{
		requireNonNull(((Object) (func0)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return Single.create(((Single.OnSubscribe) (new _cls31(func0))));
	//    3    5:new             #536 <Class Completable$31>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #539 <Method void Completable$31(Completable, Func0)>
	//    8   14:invokestatic    #542 <Method Single Single.create(Single$OnSubscribe)>
	//    9   17:areturn         
	}

	public final Single toSingleDefault(Object obj)
	{
		requireNonNull(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return toSingle(((Func0) (new _cls32(obj))));
	//    3    5:aload_0         
	//    4    6:new             #547 <Class Completable$32>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #550 <Method void Completable$32(Completable, Object)>
	//    9   15:invokevirtual   #552 <Method Single toSingle(Func0)>
	//   10   18:areturn         
	}

	public final Completable unsubscribeOn(Scheduler scheduler)
	{
		requireNonNull(((Object) (scheduler)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method Object requireNonNull(Object)>
	//    2    4:pop             
		return create(((CompletableOnSubscribe) (new _cls33(scheduler))));
	//    3    5:new             #556 <Class Completable$33>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #557 <Method void Completable$33(Completable, Scheduler)>
	//    8   14:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    9   17:areturn         
	}

	static final Completable COMPLETE = create(((CompletableOnSubscribe) (new _cls1())));
	static final RxJavaErrorHandler ERROR_HANDLER = RxJavaPlugins.getInstance().getErrorHandler();
	static final Completable NEVER = create(((CompletableOnSubscribe) (new _cls2())));
	private final CompletableOnSubscribe onSubscribe;

	static 
	{
	//    0    0:new             #24  <Class Completable$1>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void Completable$1()>
	//    3    7:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    4   10:putstatic       #33  <Field Completable COMPLETE>
	//    5   13:new             #35  <Class Completable$2>
	//    6   16:dup             
	//    7   17:invokespecial   #36  <Method void Completable$2()>
	//    8   20:invokestatic    #31  <Method Completable create(Completable$CompletableOnSubscribe)>
	//    9   23:putstatic       #38  <Field Completable NEVER>
	//   10   26:invokestatic    #44  <Method RxJavaPlugins RxJavaPlugins.getInstance()>
	//   11   29:invokevirtual   #48  <Method RxJavaErrorHandler RxJavaPlugins.getErrorHandler()>
	//   12   32:putstatic       #50  <Field RxJavaErrorHandler ERROR_HANDLER>
	//*  13   35:return          
	}


/*
	static void access$000(Throwable throwable)
	{
		deliverUncaughtException(throwable);
	//    0    0:aload_0         
	//    1    1:invokestatic    #60  <Method void deliverUncaughtException(Throwable)>
		return;
	//    2    4:return          
	}

*/

	// Unreferenced inner class rx/Completable$CompletableOperator
	/* block-local class not found */
	class CompletableOperator {}


	// Unreferenced inner class rx/Completable$CompletableSubscriber
	/* block-local class not found */
	class CompletableSubscriber {}


	// Unreferenced inner class rx/Completable$CompletableTransformer
	/* block-local class not found */
	class CompletableTransformer {}


	/* member class not found */
	class _cls4 {}


	/* member class not found */
	class _cls3 {}


	/* member class not found */
	class _cls5 {}


	/* member class not found */
	class _cls7 {}


	/* member class not found */
	class _cls6 {}


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
	class _cls13 {}


	/* member class not found */
	class _cls14 {}


	/* member class not found */
	class _cls15 {}


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
	class _cls27 {}


	/* member class not found */
	class _cls28 {}


	/* member class not found */
	class _cls29 {}


	/* member class not found */
	class _cls30 {}


	/* member class not found */
	class _cls31 {}


	/* member class not found */
	class _cls32 {}


	/* member class not found */
	class _cls33 {}


	/* member class not found */
	class _cls1 {}


	/* member class not found */
	class _cls2 {}

}
