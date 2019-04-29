.class public abstract Lkotlinx/coroutines/AbstractContinuation;
.super Lkotlinx/coroutines/DispatchedTask;
.source "AbstractContinuation.kt"

# interfaces
.implements Lkotlin/coroutines/Continuation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/DispatchedTask<",
        "TT;>;",
        "Lkotlin/coroutines/Continuation<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAbstractContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractContinuation.kt\nkotlinx/coroutines/AbstractContinuation\n+ 2 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 3 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,292:1\n186#1,2:294\n186#1,2:300\n186#1,2:303\n13#2:293\n22#2:302\n280#3,2:296\n280#3,2:298\n*E\n*S KotlinDebug\n*F\n+ 1 AbstractContinuation.kt\nkotlinx/coroutines/AbstractContinuation\n*L\n98#1,2:294\n148#1,2:300\n192#1,2:303\n82#1:293\n148#1:302\n112#1,2:296\n122#1,2:298\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008 \u0018\u0000*\u0006\u0008\u0000\u0010\u0001 \u00002\u0008\u0012\u0004\u0012\u0002H\u00010\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0019\u001a\u00020\u00102\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00102\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\"\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0008\u0010!\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\"\u001a\u00020\u0006H\u0004J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0006H\u0002J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0016J\n\u0010\'\u001a\u0004\u0018\u00010\u000cH\u0001J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001bH\u0002J\u0017\u0010*\u001a\u00020\u001e2\u0008\u0010%\u001a\u0004\u0018\u00010&H\u0000\u00a2\u0006\u0002\u0008+J/\u0010,\u001a\u00020\u001e2\'\u0010-\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u001b\u00a2\u0006\u000c\u0008/\u0012\u0008\u00080\u0012\u0004\u0008\u0008(\u001a\u0012\u0004\u0012\u00020\u001e0.j\u0002`1J\u001f\u00102\u001a\u0002032\u0014\u00104\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u001e0.H\u0084\u0008J1\u00105\u001a\u0002062\'\u0010-\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u001b\u00a2\u0006\u000c\u0008/\u0012\u0008\u00080\u0012\u0004\u0008\u0008(\u001a\u0012\u0004\u0012\u00020\u001e0.j\u0002`1H\u0002J\u0008\u00107\u001a\u000208H\u0014J\u001a\u00109\u001a\u00020\u001e2\u0008\u0010:\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0005\u001a\u00020\u0006H\u0004J\u001e\u0010;\u001a\u00020\u001e2\u000c\u0010<\u001a\u0008\u0012\u0004\u0012\u00028\u00000=H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J\u001d\u0010?\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\u0008@J\u0008\u0010A\u001a\u000208H\u0002J\n\u0010B\u001a\u0004\u0018\u00010\u000cH\u0016J\u0008\u0010C\u001a\u000208H\u0016J\u0008\u0010D\u001a\u00020\u0010H\u0002J\u0008\u0010E\u001a\u00020\u0010H\u0002J\u001a\u0010F\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0008\u0010!\u001a\u0004\u0018\u00010\u000cH\u0004J\"\u0010G\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0008\u0010:\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\"\u001a\u00020\u0006H\u0002R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u000c8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006H"
    }
    d2 = {
        "Lkotlinx/coroutines/AbstractContinuation;",
        "T",
        "Lkotlinx/coroutines/DispatchedTask;",
        "Lkotlin/coroutines/Continuation;",
        "delegate",
        "resumeMode",
        "",
        "(Lkotlin/coroutines/Continuation;I)V",
        "_decision",
        "Lkotlinx/atomicfu/AtomicInt;",
        "_state",
        "Lkotlinx/atomicfu/AtomicRef;",
        "",
        "getDelegate",
        "()Lkotlin/coroutines/Continuation;",
        "isActive",
        "",
        "()Z",
        "isCancelled",
        "isCompleted",
        "parentHandle",
        "Lkotlinx/coroutines/DisposableHandle;",
        "state",
        "getState$kotlinx_coroutines_core",
        "()Ljava/lang/Object;",
        "cancel",
        "cause",
        "",
        "cancelImpl",
        "completeStateUpdate",
        "",
        "expect",
        "Lkotlinx/coroutines/NotCompleted;",
        "update",
        "mode",
        "dispatchResume",
        "getContinuationCancellationCause",
        "parent",
        "Lkotlinx/coroutines/Job;",
        "getResult",
        "handleException",
        "exception",
        "initParentJobInternal",
        "initParentJobInternal$kotlinx_coroutines_core",
        "invokeOnCancellation",
        "handler",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "Lkotlinx/coroutines/CompletionHandler;",
        "loopOnState",
        "",
        "block",
        "makeHandler",
        "Lkotlinx/coroutines/CancelHandler;",
        "nameString",
        "",
        "resumeImpl",
        "proposedUpdate",
        "resumeWith",
        "result",
        "Lkotlin/Result;",
        "(Ljava/lang/Object;)V",
        "resumeWithExceptionMode",
        "resumeWithExceptionMode$kotlinx_coroutines_core",
        "stateString",
        "takeState",
        "toString",
        "tryResume",
        "trySuspend",
        "tryUpdateStateToFinal",
        "updateStateToFinal",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final _decision$FU:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field private static final _state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _decision:I

.field private volatile _state:Ljava/lang/Object;

.field private final delegate:Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/coroutines/Continuation<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile parentHandle:Lkotlinx/coroutines/DisposableHandle;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lkotlinx/coroutines/AbstractContinuation;

    const-string v1, "_decision"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/AbstractContinuation;->_decision$FU:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-class v0, Lkotlinx/coroutines/AbstractContinuation;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_state"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/AbstractContinuation;->_state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lkotlin/coroutines/Continuation;I)V
    .locals 1
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;I)V"
        }
    .end annotation

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0, p2}, Lkotlinx/coroutines/DispatchedTask;-><init>(I)V

    iput-object p1, p0, Lkotlinx/coroutines/AbstractContinuation;->delegate:Lkotlin/coroutines/Continuation;

    const/4 p1, 0x0

    .line 50
    iput p1, p0, Lkotlinx/coroutines/AbstractContinuation;->_decision:I

    .line 61
    invoke-static {}, Lkotlinx/coroutines/AbstractContinuationKt;->access$getACTIVE$p()Lkotlinx/coroutines/Active;

    move-result-object p1

    iput-object p1, p0, Lkotlinx/coroutines/AbstractContinuation;->_state:Ljava/lang/Object;

    return-void
.end method

.method private final dispatchResume(I)V
    .locals 1

    .line 180
    invoke-direct {p0}, Lkotlinx/coroutines/AbstractContinuation;->tryResume()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 182
    :cond_0
    invoke-static {p0, p1}, Lkotlinx/coroutines/DispatchedKt;->dispatch(Lkotlinx/coroutines/DispatchedTask;I)V

    return-void
.end method

.method private final handleException(Ljava/lang/Throwable;)V
    .locals 3

    .line 254
    invoke-virtual {p0}, Lkotlinx/coroutines/AbstractContinuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {v0, p1, v1, v2, v1}, Lkotlinx/coroutines/CoroutineExceptionHandlerKt;->handleCoroutineException$default(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;ILjava/lang/Object;)V

    return-void
.end method

.method private final makeHandler(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/CancelHandler;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)",
            "Lkotlinx/coroutines/CancelHandler;"
        }
    .end annotation

    .line 177
    instance-of v0, p1, Lkotlinx/coroutines/CancelHandler;

    if-eqz v0, :cond_0

    check-cast p1, Lkotlinx/coroutines/CancelHandler;

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlinx/coroutines/InvokeOnCancel;

    invoke-direct {v0, p1}, Lkotlinx/coroutines/InvokeOnCancel;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object p1, v0

    check-cast p1, Lkotlinx/coroutines/CancelHandler;

    :goto_0
    return-object p1
.end method

.method private final stateString()Ljava/lang/String;
    .locals 2

    .line 264
    invoke-virtual {p0}, Lkotlinx/coroutines/AbstractContinuation;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 266
    instance-of v1, v0, Lkotlinx/coroutines/NotCompleted;

    if-eqz v1, :cond_0

    const-string v0, "Active"

    goto :goto_0

    .line 267
    :cond_0
    instance-of v1, v0, Lkotlinx/coroutines/CancelledContinuation;

    if-eqz v1, :cond_1

    const-string v0, "Cancelled"

    goto :goto_0

    .line 268
    :cond_1
    instance-of v0, v0, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz v0, :cond_2

    const-string v0, "CompletedExceptionally"

    goto :goto_0

    :cond_2
    const-string v0, "Completed"

    :goto_0
    return-object v0
.end method

.method private final tryResume()Z
    .locals 3

    .line 299
    :cond_0
    iget v0, p0, Lkotlinx/coroutines/AbstractContinuation;->_decision:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    const-string v0, "Already resumed"

    .line 126
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    throw v1

    :pswitch_0
    return v1

    .line 124
    :pswitch_1
    sget-object v0, Lkotlinx/coroutines/AbstractContinuation;->_decision$FU:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v2, 0x2

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final trySuspend()Z
    .locals 3

    .line 297
    :cond_0
    iget v0, p0, Lkotlinx/coroutines/AbstractContinuation;->_decision:I

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const-string v0, "Already suspended"

    .line 116
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    throw v1

    :cond_1
    return v1

    .line 114
    :cond_2
    sget-object v0, Lkotlinx/coroutines/AbstractContinuation;->_decision$FU:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2
.end method

.method private final updateStateToFinal(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;I)Z
    .locals 1

    .line 219
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/AbstractContinuation;->tryUpdateStateToFinal(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 222
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/AbstractContinuation;->completeStateUpdate(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;I)V

    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final cancel(Ljava/lang/Throwable;)Z
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 95
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/AbstractContinuation;->cancelImpl(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final cancelImpl(Ljava/lang/Throwable;)Z
    .locals 4
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 295
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/AbstractContinuation;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 99
    instance-of v1, v0, Lkotlinx/coroutines/NotCompleted;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 100
    :cond_1
    new-instance v1, Lkotlinx/coroutines/CancelledContinuation;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    invoke-direct {v1, v3, p1}, Lkotlinx/coroutines/CancelledContinuation;-><init>(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;)V

    .line 101
    check-cast v0, Lkotlinx/coroutines/NotCompleted;

    invoke-direct {p0, v0, v1, v2}, Lkotlinx/coroutines/AbstractContinuation;->updateStateToFinal(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1
.end method

.method protected final completeStateUpdate(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;I)V
    .locals 3
    .param p1    # Lkotlinx/coroutines/NotCompleted;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "expect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    instance-of v0, p2, Lkotlinx/coroutines/CompletedExceptionally;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    check-cast v0, Lkotlinx/coroutines/CompletedExceptionally;

    .line 240
    instance-of p2, p2, Lkotlinx/coroutines/CancelledContinuation;

    if-eqz p2, :cond_2

    instance-of p2, p1, Lkotlinx/coroutines/CancelHandler;

    if-eqz p2, :cond_2

    .line 242
    :try_start_0
    move-object p2, p1

    check-cast p2, Lkotlinx/coroutines/CancelHandler;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    :cond_1
    invoke-virtual {p2, v1}, Lkotlinx/coroutines/CancelHandler;->invoke(Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    .line 244
    new-instance v0, Lkotlinx/coroutines/CompletionHandlerException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in completion handler "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lkotlinx/coroutines/CompletionHandlerException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v0, Ljava/lang/Throwable;

    invoke-direct {p0, v0}, Lkotlinx/coroutines/AbstractContinuation;->handleException(Ljava/lang/Throwable;)V

    .line 250
    :cond_2
    :goto_1
    invoke-direct {p0, p3}, Lkotlinx/coroutines/AbstractContinuation;->dispatchResume(I)V

    return-void
.end method

.method public getContinuationCancellationCause(Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;
    .locals 1
    .param p1    # Lkotlinx/coroutines/Job;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    invoke-interface {p1}, Lkotlinx/coroutines/Job;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    return-object p1
.end method

.method public final getDelegate()Lkotlin/coroutines/Continuation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/coroutines/Continuation<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    iget-object v0, p0, Lkotlinx/coroutines/AbstractContinuation;->delegate:Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public final getResult()Ljava/lang/Object;
    .locals 2
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 133
    invoke-direct {p0}, Lkotlinx/coroutines/AbstractContinuation;->trySuspend()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 135
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/AbstractContinuation;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 136
    instance-of v1, v0, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz v1, :cond_1

    check-cast v0, Lkotlinx/coroutines/CompletedExceptionally;

    iget-object v0, v0, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    throw v0

    .line 137
    :cond_1
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/AbstractContinuation;->getSuccessfulResult(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getState$kotlinx_coroutines_core()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 66
    iget-object v0, p0, Lkotlinx/coroutines/AbstractContinuation;->_state:Ljava/lang/Object;

    return-object v0
.end method

.method public final initParentJobInternal$kotlinx_coroutines_core(Lkotlinx/coroutines/Job;)V
    .locals 6
    .param p1    # Lkotlinx/coroutines/Job;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 75
    iget-object v0, p0, Lkotlinx/coroutines/AbstractContinuation;->parentHandle:Lkotlinx/coroutines/DisposableHandle;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string p1, "Check failed."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    :cond_1
    if-nez p1, :cond_2

    .line 77
    sget-object p1, Lkotlinx/coroutines/NonDisposableHandle;->INSTANCE:Lkotlinx/coroutines/NonDisposableHandle;

    check-cast p1, Lkotlinx/coroutines/DisposableHandle;

    iput-object p1, p0, Lkotlinx/coroutines/AbstractContinuation;->parentHandle:Lkotlinx/coroutines/DisposableHandle;

    return-void

    .line 80
    :cond_2
    invoke-interface {p1}, Lkotlinx/coroutines/Job;->start()Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 82
    new-instance v0, Lkotlinx/coroutines/ChildContinuation;

    invoke-direct {v0, p1, p0}, Lkotlinx/coroutines/ChildContinuation;-><init>(Lkotlinx/coroutines/Job;Lkotlinx/coroutines/AbstractContinuation;)V

    check-cast v0, Lkotlinx/coroutines/CompletionHandlerBase;

    .line 293
    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p1

    .line 81
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/Job$DefaultImpls;->invokeOnCompletion$default(Lkotlinx/coroutines/Job;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/DisposableHandle;

    move-result-object p1

    .line 84
    iput-object p1, p0, Lkotlinx/coroutines/AbstractContinuation;->parentHandle:Lkotlinx/coroutines/DisposableHandle;

    .line 86
    invoke-virtual {p0}, Lkotlinx/coroutines/AbstractContinuation;->isCompleted()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 87
    invoke-interface {p1}, Lkotlinx/coroutines/DisposableHandle;->dispose()V

    .line 88
    sget-object p1, Lkotlinx/coroutines/NonDisposableHandle;->INSTANCE:Lkotlinx/coroutines/NonDisposableHandle;

    check-cast p1, Lkotlinx/coroutines/DisposableHandle;

    iput-object p1, p0, Lkotlinx/coroutines/AbstractContinuation;->parentHandle:Lkotlinx/coroutines/DisposableHandle;

    :cond_3
    return-void
.end method

.method public final invokeOnCancellation(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 147
    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CancelHandler;

    .line 301
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/AbstractContinuation;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v2

    .line 150
    instance-of v3, v2, Lkotlinx/coroutines/Active;

    if-eqz v3, :cond_2

    if-eqz v1, :cond_1

    goto :goto_0

    .line 151
    :cond_1
    invoke-direct {p0, p1}, Lkotlinx/coroutines/AbstractContinuation;->makeHandler(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/CancelHandler;

    move-result-object v1

    .line 152
    :goto_0
    sget-object v3, Lkotlinx/coroutines/AbstractContinuation;->_state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v3, p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    .line 156
    :cond_2
    instance-of v1, v2, Lkotlinx/coroutines/CancelHandler;

    if-eqz v1, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "It\'s prohibited to register multiple handlers, tried to register "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", already has "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 157
    :cond_3
    instance-of v1, v2, Lkotlinx/coroutines/CancelledContinuation;

    if-eqz v1, :cond_6

    .line 168
    instance-of v1, v2, Lkotlinx/coroutines/CompletedExceptionally;

    if-nez v1, :cond_4

    move-object v2, v0

    :cond_4
    check-cast v2, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz v2, :cond_5

    iget-object v0, v2, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    .line 302
    :cond_5
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_6
    return-void
.end method

.method public final isActive()Z
    .locals 1

    .line 68
    invoke-virtual {p0}, Lkotlinx/coroutines/AbstractContinuation;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lkotlinx/coroutines/NotCompleted;

    return v0
.end method

.method public final isCancelled()Z
    .locals 1

    .line 72
    invoke-virtual {p0}, Lkotlinx/coroutines/AbstractContinuation;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lkotlinx/coroutines/CancelledContinuation;

    return v0
.end method

.method public final isCompleted()Z
    .locals 1

    .line 70
    invoke-virtual {p0}, Lkotlinx/coroutines/AbstractContinuation;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lkotlinx/coroutines/NotCompleted;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected final loopOnState(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    :goto_0
    invoke-virtual {p0}, Lkotlinx/coroutines/AbstractContinuation;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method protected nameString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 261
    invoke-static {p0}, Lkotlinx/coroutines/DebugKt;->getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final resumeImpl(Ljava/lang/Object;I)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 304
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/AbstractContinuation;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 194
    instance-of v1, v0, Lkotlinx/coroutines/NotCompleted;

    if-eqz v1, :cond_1

    .line 195
    check-cast v0, Lkotlinx/coroutines/NotCompleted;

    invoke-direct {p0, v0, p1, p2}, Lkotlinx/coroutines/AbstractContinuation;->updateStateToFinal(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 197
    :cond_1
    instance-of p2, v0, Lkotlinx/coroutines/CancelledContinuation;

    if-eqz p2, :cond_3

    .line 205
    instance-of p2, p1, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz p2, :cond_2

    .line 206
    check-cast p1, Lkotlinx/coroutines/CompletedExceptionally;

    iget-object p1, p1, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    invoke-direct {p0, p1}, Lkotlinx/coroutines/AbstractContinuation;->handleException(Ljava/lang/Throwable;)V

    :cond_2
    return-void

    .line 210
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Already resumed, but proposed with update "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 141
    invoke-static {p1}, Lkotlinx/coroutines/CompletedExceptionallyKt;->toState(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget v0, p0, Lkotlinx/coroutines/AbstractContinuation;->resumeMode:I

    invoke-virtual {p0, p1, v0}, Lkotlinx/coroutines/AbstractContinuation;->resumeImpl(Ljava/lang/Object;I)V

    return-void
.end method

.method public final resumeWithExceptionMode$kotlinx_coroutines_core(Ljava/lang/Throwable;I)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    new-instance v0, Lkotlinx/coroutines/CompletedExceptionally;

    invoke-direct {v0, p1}, Lkotlinx/coroutines/CompletedExceptionally;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0, p2}, Lkotlinx/coroutines/AbstractContinuation;->resumeImpl(Ljava/lang/Object;I)V

    return-void
.end method

.method public takeState()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 92
    invoke-virtual {p0}, Lkotlinx/coroutines/AbstractContinuation;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 259
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lkotlinx/coroutines/AbstractContinuation;->nameString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lkotlinx/coroutines/AbstractContinuation;->stateString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lkotlinx/coroutines/DebugKt;->getHexAddress(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final tryUpdateStateToFinal(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Lkotlinx/coroutines/NotCompleted;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "expect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    instance-of v0, p2, Lkotlinx/coroutines/NotCompleted;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    const-string p1, "Failed requirement."

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2

    .line 228
    :cond_1
    sget-object v0, Lkotlinx/coroutines/AbstractContinuation;->_state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    .line 230
    :cond_2
    iget-object p1, p0, Lkotlinx/coroutines/AbstractContinuation;->parentHandle:Lkotlinx/coroutines/DisposableHandle;

    if-eqz p1, :cond_3

    .line 231
    invoke-interface {p1}, Lkotlinx/coroutines/DisposableHandle;->dispose()V

    .line 232
    sget-object p1, Lkotlinx/coroutines/NonDisposableHandle;->INSTANCE:Lkotlinx/coroutines/NonDisposableHandle;

    check-cast p1, Lkotlinx/coroutines/DisposableHandle;

    iput-object p1, p0, Lkotlinx/coroutines/AbstractContinuation;->parentHandle:Lkotlinx/coroutines/DisposableHandle;

    :cond_3
    return v2
.end method
