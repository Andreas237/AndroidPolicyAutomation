.class public final Lkotlinx/coroutines/selects/SelectBuilderImpl;
.super Lkotlinx/coroutines/internal/LockFreeLinkedListHead;
.source "Select.kt"

# interfaces
.implements Lkotlinx/coroutines/selects/SelectBuilder;
.implements Lkotlinx/coroutines/selects/SelectInstance;
.implements Lkotlin/coroutines/Continuation;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/selects/SelectBuilderImpl$SelectOnCancelling;,
        Lkotlinx/coroutines/selects/SelectBuilderImpl$AtomicSelectOp;,
        Lkotlinx/coroutines/selects/SelectBuilderImpl$DisposeNode;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;",
        "Lkotlinx/coroutines/selects/SelectBuilder<",
        "TR;>;",
        "Lkotlinx/coroutines/selects/SelectInstance<",
        "TR;>;",
        "Lkotlin/coroutines/Continuation<",
        "TR;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectBuilderImpl\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n+ 3 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 4 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 5 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 6 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,426:1\n229#1,2:429\n231#1,11:433\n229#1,2:444\n231#1,11:448\n96#2,2:427\n96#2,2:431\n96#2,2:446\n96#2,2:460\n13#3:459\n148#4:462\n84#4,3:463\n149#4,5:466\n677#5,6:471\n17#6:477\n*E\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectBuilderImpl\n*L\n246#1,2:429\n246#1,11:433\n253#1,2:444\n253#1,11:448\n230#1,2:427\n246#1,2:431\n253#1,2:446\n292#1,2:460\n276#1:459\n313#1:462\n313#1,3:463\n313#1,5:466\n324#1,6:471\n413#1:477\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000*\u0006\u0008\u0000\u0010\u0001 \u00002\u00020\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u00032\u0008\u0012\u0004\u0012\u0002H\u00010\u00042\u0008\u0012\u0004\u0012\u0002H\u00010\u0005:\u0003DEFB\u0013\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J\u0008\u0010\u001e\u001a\u00020\u001cH\u0002J\'\u0010\u001f\u001a\u00020\u001c2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0!2\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001c0!H\u0082\u0008J\n\u0010#\u001a\u0004\u0018\u00010\nH\u0001J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0001J\u0008\u0010\'\u001a\u00020\u001cH\u0002J6\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*2\u001c\u0010\"\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0+H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\n2\u0006\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u0004\u0018\u00010\n2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020&H\u0016J\u001e\u00103\u001a\u00020\u001c2\u000c\u00104\u001a\u0008\u0012\u0004\u0012\u00028\u000005H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J\u0012\u00107\u001a\u00020\u00142\u0008\u00108\u001a\u0004\u0018\u00010\nH\u0016J3\u00109\u001a\u00020\u001c*\u00020:2\u001c\u0010\"\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0+H\u0096\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;JE\u00109\u001a\u00020\u001c\"\u0004\u0008\u0001\u0010<*\u0008\u0012\u0004\u0012\u0002H<0=2\"\u0010\"\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u0002H<\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0>H\u0096\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010?JY\u00109\u001a\u00020\u001c\"\u0004\u0008\u0001\u0010@\"\u0004\u0008\u0002\u0010<*\u000e\u0012\u0004\u0012\u0002H@\u0012\u0004\u0012\u0002H<0A2\u0006\u0010B\u001a\u0002H@2\"\u0010\"\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u0002H<\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0>H\u0096\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010CR\u0016\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006G"
    }
    d2 = {
        "Lkotlinx/coroutines/selects/SelectBuilderImpl;",
        "R",
        "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;",
        "Lkotlinx/coroutines/selects/SelectBuilder;",
        "Lkotlinx/coroutines/selects/SelectInstance;",
        "Lkotlin/coroutines/Continuation;",
        "uCont",
        "(Lkotlin/coroutines/Continuation;)V",
        "_result",
        "Lkotlinx/atomicfu/AtomicRef;",
        "",
        "_state",
        "completion",
        "getCompletion",
        "()Lkotlin/coroutines/Continuation;",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "getContext",
        "()Lkotlin/coroutines/CoroutineContext;",
        "isSelected",
        "",
        "()Z",
        "parentHandle",
        "Lkotlinx/coroutines/DisposableHandle;",
        "state",
        "getState",
        "()Ljava/lang/Object;",
        "disposeOnSelect",
        "",
        "handle",
        "doAfterSelect",
        "doResume",
        "value",
        "Lkotlin/Function0;",
        "block",
        "getResult",
        "handleBuilderException",
        "e",
        "",
        "initCancellability",
        "onTimeout",
        "timeMillis",
        "",
        "Lkotlin/Function1;",
        "(JLkotlin/jvm/functions/Function1;)V",
        "performAtomicIfNotSelected",
        "desc",
        "Lkotlinx/coroutines/internal/AtomicDesc;",
        "performAtomicTrySelect",
        "resumeSelectCancellableWithException",
        "exception",
        "resumeWith",
        "result",
        "Lkotlin/Result;",
        "(Ljava/lang/Object;)V",
        "trySelect",
        "idempotent",
        "invoke",
        "Lkotlinx/coroutines/selects/SelectClause0;",
        "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V",
        "Q",
        "Lkotlinx/coroutines/selects/SelectClause1;",
        "Lkotlin/Function2;",
        "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V",
        "P",
        "Lkotlinx/coroutines/selects/SelectClause2;",
        "param",
        "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V",
        "AtomicSelectOp",
        "DisposeNode",
        "SelectOnCancelling",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation

.annotation build Lkotlin/PublishedApi;
.end annotation


# static fields
.field static final _result$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field static final _state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field volatile _result:Ljava/lang/Object;

.field volatile _state:Ljava/lang/Object;

.field private volatile parentHandle:Lkotlinx/coroutines/DisposableHandle;

.field private final uCont:Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/coroutines/Continuation<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lkotlinx/coroutines/selects/SelectBuilderImpl;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_state"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-class v0, Lkotlinx/coroutines/selects/SelectBuilderImpl;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_result"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_result$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 1
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;)V"
        }
    .end annotation

    const-string v0, "uCont"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    invoke-direct {p0}, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->uCont:Lkotlin/coroutines/Continuation;

    .line 199
    iput-object p0, p0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_state:Ljava/lang/Object;

    .line 202
    invoke-static {}, Lkotlinx/coroutines/selects/SelectKt;->access$getUNDECIDED$p()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_result:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$doAfterSelect(Lkotlinx/coroutines/selects/SelectBuilderImpl;)V
    .locals 0

    .line 194
    invoke-direct {p0}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->doAfterSelect()V

    return-void
.end method

.method public static final synthetic access$getState$p(Lkotlinx/coroutines/selects/SelectBuilderImpl;)Ljava/lang/Object;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 194
    invoke-direct {p0}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->getState()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final doAfterSelect()V
    .locals 2

    .line 323
    iget-object v0, p0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->parentHandle:Lkotlinx/coroutines/DisposableHandle;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlinx/coroutines/DisposableHandle;->dispose()V

    .line 471
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;->getNext()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    check-cast v0, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    .line 472
    :goto_0
    move-object v1, p0

    check-cast v1, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_3

    .line 473
    instance-of v1, v0, Lkotlinx/coroutines/selects/SelectBuilderImpl$DisposeNode;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/selects/SelectBuilderImpl$DisposeNode;

    .line 325
    iget-object v1, v1, Lkotlinx/coroutines/selects/SelectBuilderImpl$DisposeNode;->handle:Lkotlinx/coroutines/DisposableHandle;

    invoke-interface {v1}, Lkotlinx/coroutines/DisposableHandle;->dispose()V

    .line 474
    :cond_2
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->getNextNode()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    move-result-object v0

    goto :goto_0

    :cond_3
    return-void
.end method

.method private final doResume(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 229
    invoke-virtual {p0}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->isSelected()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Must be selected first"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2

    .line 428
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_result:Ljava/lang/Object;

    .line 232
    invoke-static {}, Lkotlinx/coroutines/selects/SelectKt;->access$getUNDECIDED$p()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    sget-object v0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_result$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lkotlinx/coroutines/selects/SelectKt;->access$getUNDECIDED$p()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 233
    :cond_1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    sget-object v0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_result$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 234
    invoke-static {}, Lkotlinx/coroutines/selects/SelectKt;->access$getRESUMED$p()Ljava/lang/Object;

    move-result-object v2

    .line 233
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void

    .line 239
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already resumed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method private final getState()Ljava/lang/Object;
    .locals 2

    .line 461
    :goto_0
    iget-object v0, p0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_state:Ljava/lang/Object;

    .line 293
    instance-of v1, v0, Lkotlinx/coroutines/internal/OpDescriptor;

    if-nez v1, :cond_0

    return-object v0

    .line 294
    :cond_0
    check-cast v0, Lkotlinx/coroutines/internal/OpDescriptor;

    invoke-virtual {v0, p0}, Lkotlinx/coroutines/internal/OpDescriptor;->perform(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method private final initCancellability()V
    .locals 7

    .line 274
    invoke-virtual {p0}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    sget-object v1, Lkotlinx/coroutines/Job;->Key:Lkotlinx/coroutines/Job$Key;

    check-cast v1, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/Job;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 276
    new-instance v0, Lkotlinx/coroutines/selects/SelectBuilderImpl$SelectOnCancelling;

    invoke-direct {v0, p0, v1}, Lkotlinx/coroutines/selects/SelectBuilderImpl$SelectOnCancelling;-><init>(Lkotlinx/coroutines/selects/SelectBuilderImpl;Lkotlinx/coroutines/Job;)V

    check-cast v0, Lkotlinx/coroutines/CompletionHandlerBase;

    .line 459
    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x2

    const/4 v6, 0x0

    .line 275
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/Job$DefaultImpls;->invokeOnCompletion$default(Lkotlinx/coroutines/Job;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/DisposableHandle;

    move-result-object v0

    .line 277
    iput-object v0, p0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->parentHandle:Lkotlinx/coroutines/DisposableHandle;

    .line 279
    invoke-virtual {p0}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Lkotlinx/coroutines/DisposableHandle;->dispose()V

    :cond_0
    return-void

    :cond_1
    return-void
.end method


# virtual methods
.method public disposeOnSelect(Lkotlinx/coroutines/DisposableHandle;)V
    .locals 4
    .param p1    # Lkotlinx/coroutines/DisposableHandle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "handle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    new-instance v0, Lkotlinx/coroutines/selects/SelectBuilderImpl$DisposeNode;

    invoke-direct {v0, p1}, Lkotlinx/coroutines/selects/SelectBuilderImpl$DisposeNode;-><init>(Lkotlinx/coroutines/DisposableHandle;)V

    .line 311
    :cond_0
    invoke-direct {p0}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->getState()Ljava/lang/Object;

    move-result-object v1

    .line 312
    move-object v2, p0

    check-cast v2, Lkotlinx/coroutines/selects/SelectBuilderImpl;

    if-ne v1, v2, :cond_2

    .line 463
    new-instance v1, Lkotlinx/coroutines/selects/SelectBuilderImpl$disposeOnSelect$$inlined$addLastIf$1;

    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    invoke-direct {v1, v2, v2, p0}, Lkotlinx/coroutines/selects/SelectBuilderImpl$disposeOnSelect$$inlined$addLastIf$1;-><init>(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/selects/SelectBuilderImpl;)V

    check-cast v1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;

    .line 467
    :goto_0
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->getPrev()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    check-cast v3, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    .line 468
    invoke-virtual {v3, v2, p0, v1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->tryCondAddNext(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 v1, 0x0

    goto :goto_1

    :pswitch_1
    const/4 v1, 0x1

    :goto_1
    if-eqz v1, :cond_0

    return-void

    .line 316
    :cond_2
    invoke-interface {p1}, Lkotlinx/coroutines/DisposableHandle;->dispose()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getCompletion()Lkotlin/coroutines/Continuation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/coroutines/Continuation<",
            "TR;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 226
    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public getContext()Lkotlin/coroutines/CoroutineContext;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 224
    iget-object v0, p0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->uCont:Lkotlin/coroutines/Continuation;

    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    return-object v0
.end method

.method public final getResult()Ljava/lang/Object;
    .locals 3
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 260
    invoke-virtual {p0}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->isSelected()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->initCancellability()V

    .line 261
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_result:Ljava/lang/Object;

    .line 262
    invoke-static {}, Lkotlinx/coroutines/selects/SelectKt;->access$getUNDECIDED$p()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    .line 263
    sget-object v0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_result$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lkotlinx/coroutines/selects/SelectKt;->access$getUNDECIDED$p()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 264
    :cond_1
    iget-object v0, p0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_result:Ljava/lang/Object;

    .line 267
    :cond_2
    invoke-static {}, Lkotlinx/coroutines/selects/SelectKt;->access$getRESUMED$p()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already resumed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 268
    :cond_3
    instance-of v1, v0, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz v1, :cond_4

    check-cast v0, Lkotlinx/coroutines/CompletedExceptionally;

    iget-object v0, v0, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    throw v0

    :cond_4
    return-object v0
.end method

.method public final handleBuilderException(Ljava/lang/Throwable;)V
    .locals 3
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 300
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->trySelect(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 301
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    .line 303
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v1, p1, v0, v2, v0}, Lkotlinx/coroutines/CoroutineExceptionHandlerKt;->handleCoroutineException$default(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public invoke(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/selects/SelectClause0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/selects/SelectClause0;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 396
    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/selects/SelectInstance;

    invoke-interface {p1, v0, p2}, Lkotlinx/coroutines/selects/SelectClause0;->registerSelectClause0(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public invoke(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/selects/SelectClause1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Q:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/selects/SelectClause1<",
            "+TQ;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TQ;-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 400
    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/selects/SelectInstance;

    invoke-interface {p1, v0, p2}, Lkotlinx/coroutines/selects/SelectClause1;->registerSelectClause1(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public invoke(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/selects/SelectClause2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            "Q:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/selects/SelectClause2<",
            "-TP;+TQ;>;TP;",
            "Lkotlin/jvm/functions/Function2<",
            "-TQ;-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/selects/SelectInstance;

    invoke-interface {p1, v0, p2, p3}, Lkotlinx/coroutines/selects/SelectClause2;->registerSelectClause2(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public invoke(Lkotlinx/coroutines/selects/SelectClause2;Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/selects/SelectClause2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            "Q:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/selects/SelectClause2<",
            "-TP;+TQ;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TQ;-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    invoke-static {p0, p1, p2}, Lkotlinx/coroutines/selects/SelectBuilder$DefaultImpls;->invoke(Lkotlinx/coroutines/selects/SelectBuilder;Lkotlinx/coroutines/selects/SelectClause2;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public isSelected()Z
    .locals 2

    .line 306
    invoke-direct {p0}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->getState()Ljava/lang/Object;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Lkotlinx/coroutines/selects/SelectBuilderImpl;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onTimeout(JLkotlin/jvm/functions/Function1;)V
    .locals 3
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_1

    const/4 p1, 0x0

    .line 409
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->trySelect(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 410
    invoke-virtual {p0}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->getCompletion()Lkotlin/coroutines/Continuation;

    move-result-object p1

    invoke-static {p3, p1}, Lkotlinx/coroutines/intrinsics/UndispatchedKt;->startCoroutineUnintercepted(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-void

    .line 477
    :cond_1
    new-instance v0, Lkotlinx/coroutines/selects/SelectBuilderImpl$onTimeout$$inlined$Runnable$1;

    invoke-direct {v0, p0, p3}, Lkotlinx/coroutines/selects/SelectBuilderImpl$onTimeout$$inlined$Runnable$1;-><init>(Lkotlinx/coroutines/selects/SelectBuilderImpl;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Ljava/lang/Runnable;

    .line 419
    invoke-virtual {p0}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p3

    invoke-static {p3}, Lkotlinx/coroutines/DelayKt;->getDelay(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Delay;

    move-result-object p3

    invoke-interface {p3, p1, p2, v0}, Lkotlinx/coroutines/Delay;->invokeOnTimeout(JLjava/lang/Runnable;)Lkotlinx/coroutines/DisposableHandle;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->disposeOnSelect(Lkotlinx/coroutines/DisposableHandle;)V

    return-void
.end method

.method public performAtomicIfNotSelected(Lkotlinx/coroutines/internal/AtomicDesc;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lkotlinx/coroutines/internal/AtomicDesc;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "desc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 350
    new-instance v0, Lkotlinx/coroutines/selects/SelectBuilderImpl$AtomicSelectOp;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lkotlinx/coroutines/selects/SelectBuilderImpl$AtomicSelectOp;-><init>(Lkotlinx/coroutines/selects/SelectBuilderImpl;Lkotlinx/coroutines/internal/AtomicDesc;Z)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/selects/SelectBuilderImpl$AtomicSelectOp;->perform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public performAtomicTrySelect(Lkotlinx/coroutines/internal/AtomicDesc;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lkotlinx/coroutines/internal/AtomicDesc;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "desc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 349
    new-instance v0, Lkotlinx/coroutines/selects/SelectBuilderImpl$AtomicSelectOp;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lkotlinx/coroutines/selects/SelectBuilderImpl$AtomicSelectOp;-><init>(Lkotlinx/coroutines/selects/SelectBuilderImpl;Lkotlinx/coroutines/internal/AtomicDesc;Z)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/selects/SelectBuilderImpl$AtomicSelectOp;->perform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public resumeSelectCancellableWithException(Ljava/lang/Throwable;)V
    .locals 3
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 444
    invoke-virtual {p0}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->isSelected()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Must be selected first"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 447
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_result:Ljava/lang/Object;

    .line 449
    invoke-static {}, Lkotlinx/coroutines/selects/SelectKt;->access$getUNDECIDED$p()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-static {}, Lkotlinx/coroutines/selects/SelectKt;->access$getUNDECIDED$p()Ljava/lang/Object;

    move-result-object v0

    .line 253
    new-instance v1, Lkotlinx/coroutines/CompletedExceptionally;

    invoke-direct {v1, p1}, Lkotlinx/coroutines/CompletedExceptionally;-><init>(Ljava/lang/Throwable;)V

    sget-object v2, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_result$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 450
    :cond_1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    sget-object v0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_result$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 451
    invoke-static {}, Lkotlinx/coroutines/selects/SelectKt;->access$getRESUMED$p()Ljava/lang/Object;

    move-result-object v2

    .line 450
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 254
    iget-object v0, p0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->uCont:Lkotlin/coroutines/Continuation;

    invoke-static {v0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlinx/coroutines/DispatchedKt;->resumeCancellableWithException(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;)V

    :goto_0
    return-void

    .line 456
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already resumed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 429
    invoke-virtual {p0}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->isSelected()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Must be selected first"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 432
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_result:Ljava/lang/Object;

    .line 434
    invoke-static {}, Lkotlinx/coroutines/selects/SelectKt;->access$getUNDECIDED$p()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-static {}, Lkotlinx/coroutines/selects/SelectKt;->access$getUNDECIDED$p()Ljava/lang/Object;

    move-result-object v0

    .line 246
    invoke-static {p1}, Lkotlinx/coroutines/CompletedExceptionallyKt;->toState(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_result$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 435
    :cond_1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    sget-object v0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_result$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 436
    invoke-static {}, Lkotlinx/coroutines/selects/SelectKt;->access$getRESUMED$p()Ljava/lang/Object;

    move-result-object v2

    .line 435
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 247
    iget-object v0, p0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->uCont:Lkotlin/coroutines/Continuation;

    invoke-interface {v0, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    return-void

    .line 441
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already resumed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public trySelect(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 331
    instance-of v0, p1, Lkotlinx/coroutines/internal/OpDescriptor;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    const-string p1, "cannot use OpDescriptor as idempotent marker"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 333
    :cond_1
    invoke-direct {p0}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->getState()Ljava/lang/Object;

    move-result-object v0

    .line 335
    move-object v3, p0

    check-cast v3, Lkotlinx/coroutines/selects/SelectBuilderImpl;

    if-ne v0, v3, :cond_2

    .line 336
    sget-object v0, Lkotlinx/coroutines/selects/SelectBuilderImpl;->_state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 337
    invoke-direct {p0}, Lkotlinx/coroutines/selects/SelectBuilderImpl;->doAfterSelect()V

    return v2

    :cond_2
    if-nez p1, :cond_3

    return v1

    :cond_3
    if-ne v0, p1, :cond_4

    return v2

    :cond_4
    return v1
.end method
