.class public final Lkotlinx/coroutines/UndispatchedEventLoop;
.super Ljava/lang/Object;
.source "Dispatched.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDispatched.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dispatched.kt\nkotlinx/coroutines/UndispatchedEventLoop\n*L\n1#1,278:1\n61#1,5:279\n76#1:284\n66#1,9:285\n32#1,14:294\n61#1,5:308\n76#1:313\n66#1,9:314\n46#1:323\n61#1,5:324\n76#1:329\n66#1,9:330\n*E\n*S KotlinDebug\n*F\n+ 1 Dispatched.kt\nkotlinx/coroutines/UndispatchedEventLoop\n*L\n45#1,5:279\n45#1:284\n45#1,9:285\n56#1,5:324\n56#1:329\n56#1,9:330\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c1\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J?\u0010\u0007\u001a\u00020\u00082\n\u0010\t\u001a\u0006\u0012\u0002\u0008\u00030\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00082\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u0086\u0008J\u0012\u0010\u0012\u001a\u00020\u00082\n\u0010\u0013\u001a\u0006\u0012\u0002\u0008\u00030\u0014J\u001f\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00052\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u0086\u0008R \u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\u0008\u0012\u0004\u0012\u00020\u0005`\u00068\u0000X\u0081\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lkotlinx/coroutines/UndispatchedEventLoop;",
        "",
        "()V",
        "threadLocalEventLoop",
        "Lkotlinx/coroutines/internal/ThreadLocalWithInitialValue;",
        "Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;",
        "Lkotlinx/coroutines/internal/CommonThreadLocal;",
        "execute",
        "",
        "continuation",
        "Lkotlinx/coroutines/DispatchedContinuation;",
        "contState",
        "mode",
        "",
        "doYield",
        "block",
        "Lkotlin/Function0;",
        "",
        "resumeUndispatched",
        "task",
        "Lkotlinx/coroutines/DispatchedTask;",
        "runEventLoop",
        "eventLoop",
        "EventLoop",
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
.field public static final INSTANCE:Lkotlinx/coroutines/UndispatchedEventLoop;

.field public static final threadLocalEventLoop:Lkotlinx/coroutines/internal/ThreadLocalWithInitialValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/internal/ThreadLocalWithInitialValue<",
            "Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 15
    new-instance v0, Lkotlinx/coroutines/UndispatchedEventLoop;

    invoke-direct {v0}, Lkotlinx/coroutines/UndispatchedEventLoop;-><init>()V

    sput-object v0, Lkotlinx/coroutines/UndispatchedEventLoop;->INSTANCE:Lkotlinx/coroutines/UndispatchedEventLoop;

    .line 22
    new-instance v0, Lkotlinx/coroutines/internal/ThreadLocalWithInitialValue;

    sget-object v1, Lkotlinx/coroutines/UndispatchedEventLoop$threadLocalEventLoop$1;->INSTANCE:Lkotlinx/coroutines/UndispatchedEventLoop$threadLocalEventLoop$1;

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/ThreadLocalWithInitialValue;-><init>(Lkotlin/jvm/functions/Function0;)V

    sput-object v0, Lkotlinx/coroutines/UndispatchedEventLoop;->threadLocalEventLoop:Lkotlinx/coroutines/internal/ThreadLocalWithInitialValue;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic execute$default(Lkotlinx/coroutines/UndispatchedEventLoop;Lkotlinx/coroutines/DispatchedContinuation;Ljava/lang/Object;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Z
    .locals 1

    and-int/lit8 p0, p6, 0x8

    const/4 p6, 0x0

    if-eqz p0, :cond_0

    move p4, p6

    :cond_0
    const-string p0, "continuation"

    .line 31
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "block"

    invoke-static {p5, p0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 294
    sget-object p0, Lkotlinx/coroutines/UndispatchedEventLoop;->threadLocalEventLoop:Lkotlinx/coroutines/internal/ThreadLocalWithInitialValue;

    invoke-virtual {p0}, Lkotlinx/coroutines/internal/ThreadLocalWithInitialValue;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;

    .line 295
    iget-boolean p7, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    const/4 v0, 0x1

    if-eqz p7, :cond_2

    if-eqz p4, :cond_1

    .line 297
    iget-object p4, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    invoke-virtual {p4}, Lkotlinx/coroutines/internal/ArrayQueue;->isEmpty()Z

    move-result p4

    if-eqz p4, :cond_1

    return p6

    .line 301
    :cond_1
    iput-object p2, p1, Lkotlinx/coroutines/DispatchedContinuation;->_state:Ljava/lang/Object;

    .line 302
    iput p3, p1, Lkotlinx/coroutines/DispatchedContinuation;->resumeMode:I

    .line 303
    iget-object p0, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/internal/ArrayQueue;->addLast(Ljava/lang/Object;)V

    return v0

    :cond_2
    const-string p1, "eventLoop"

    .line 307
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    :try_start_0
    iput-boolean v0, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    .line 310
    invoke-interface {p5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 312
    :goto_0
    iget-object p1, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/ArrayQueue;->removeFirstOrNull()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Runnable;

    if-eqz p1, :cond_3

    .line 314
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 312
    :cond_3
    invoke-static {v0}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    .line 313
    iput-boolean p6, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    invoke-static {v0}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    return p6

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 321
    :try_start_1
    iget-object p2, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    invoke-virtual {p2}, Lkotlinx/coroutines/internal/ArrayQueue;->clear()V

    .line 322
    new-instance p2, Lkotlinx/coroutines/DispatchException;

    const-string p3, "Unexpected exception in undispatched event loop, clearing pending tasks"

    invoke-direct {p2, p3, p1}, Lkotlinx/coroutines/DispatchException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-static {v0}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    .line 313
    iput-boolean p6, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    invoke-static {v0}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    throw p1
.end method


# virtual methods
.method public final execute(Lkotlinx/coroutines/DispatchedContinuation;Ljava/lang/Object;IZLkotlin/jvm/functions/Function0;)Z
    .locals 4
    .param p1    # Lkotlinx/coroutines/DispatchedContinuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/DispatchedContinuation<",
            "*>;",
            "Ljava/lang/Object;",
            "IZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "continuation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    sget-object v0, Lkotlinx/coroutines/UndispatchedEventLoop;->threadLocalEventLoop:Lkotlinx/coroutines/internal/ThreadLocalWithInitialValue;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/ThreadLocalWithInitialValue;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;

    .line 33
    iget-boolean v1, v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-eqz p4, :cond_0

    .line 35
    iget-object p4, v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    invoke-virtual {p4}, Lkotlinx/coroutines/internal/ArrayQueue;->isEmpty()Z

    move-result p4

    if-eqz p4, :cond_0

    return v2

    .line 39
    :cond_0
    iput-object p2, p1, Lkotlinx/coroutines/DispatchedContinuation;->_state:Ljava/lang/Object;

    .line 40
    iput p3, p1, Lkotlinx/coroutines/DispatchedContinuation;->resumeMode:I

    .line 41
    iget-object p2, v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    invoke-virtual {p2, p1}, Lkotlinx/coroutines/internal/ArrayQueue;->addLast(Ljava/lang/Object;)V

    return v3

    :cond_1
    const-string p1, "eventLoop"

    .line 45
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    :try_start_0
    iput-boolean v3, v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    .line 281
    invoke-interface {p5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 283
    :goto_0
    iget-object p1, v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/ArrayQueue;->removeFirstOrNull()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Runnable;

    if-eqz p1, :cond_2

    .line 285
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 283
    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    .line 284
    iput-boolean v2, v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    invoke-static {v3}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    return v2

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 292
    :try_start_1
    iget-object p2, v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    invoke-virtual {p2}, Lkotlinx/coroutines/internal/ArrayQueue;->clear()V

    .line 293
    new-instance p2, Lkotlinx/coroutines/DispatchException;

    const-string p3, "Unexpected exception in undispatched event loop, clearing pending tasks"

    invoke-direct {p2, p3, p1}, Lkotlinx/coroutines/DispatchException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-static {v3}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    .line 284
    iput-boolean v2, v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    invoke-static {v3}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    throw p1
.end method

.method public final resumeUndispatched(Lkotlinx/coroutines/DispatchedTask;)Z
    .locals 4
    .param p1    # Lkotlinx/coroutines/DispatchedTask;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/DispatchedTask<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "task"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    sget-object v0, Lkotlinx/coroutines/UndispatchedEventLoop;->threadLocalEventLoop:Lkotlinx/coroutines/internal/ThreadLocalWithInitialValue;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/ThreadLocalWithInitialValue;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;

    .line 51
    iget-boolean v1, v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 52
    iget-object v0, v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/internal/ArrayQueue;->addLast(Ljava/lang/Object;)V

    return v2

    :cond_0
    const-string v1, "eventLoop"

    .line 56
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 325
    :try_start_0
    iput-boolean v2, v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    .line 56
    invoke-virtual {p1}, Lkotlinx/coroutines/DispatchedTask;->getDelegate()Lkotlin/coroutines/Continuation;

    move-result-object v2

    const/4 v3, 0x3

    invoke-static {p1, v2, v3}, Lkotlinx/coroutines/DispatchedKt;->resume(Lkotlinx/coroutines/DispatchedTask;Lkotlin/coroutines/Continuation;I)V

    .line 328
    :goto_0
    iget-object p1, v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/ArrayQueue;->removeFirstOrNull()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Runnable;

    if-eqz p1, :cond_1

    .line 330
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 329
    :cond_1
    iput-boolean v1, v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    return v1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 337
    :try_start_1
    iget-object v2, v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    invoke-virtual {v2}, Lkotlinx/coroutines/internal/ArrayQueue;->clear()V

    .line 338
    new-instance v2, Lkotlinx/coroutines/DispatchException;

    const-string v3, "Unexpected exception in undispatched event loop, clearing pending tasks"

    invoke-direct {v2, v3, p1}, Lkotlinx/coroutines/DispatchException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v2, Ljava/lang/Throwable;

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 329
    :goto_1
    iput-boolean v1, v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    throw p1
.end method

.method public final runEventLoop(Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;Lkotlin/jvm/functions/Function0;)V
    .locals 4
    .param p1    # Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "eventLoop"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 62
    :try_start_0
    iput-boolean v1, p1, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    .line 63
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 65
    :goto_0
    iget-object p2, p1, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    invoke-virtual {p2}, Lkotlinx/coroutines/internal/ArrayQueue;->removeFirstOrNull()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Runnable;

    if-eqz p2, :cond_0

    .line 66
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 65
    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    .line 76
    iput-boolean v0, p1, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    invoke-static {v1}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    return-void

    :catchall_0
    move-exception p2

    goto :goto_1

    :catch_0
    move-exception p2

    .line 73
    :try_start_1
    iget-object v2, p1, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    invoke-virtual {v2}, Lkotlinx/coroutines/internal/ArrayQueue;->clear()V

    .line 74
    new-instance v2, Lkotlinx/coroutines/DispatchException;

    const-string v3, "Unexpected exception in undispatched event loop, clearing pending tasks"

    invoke-direct {v2, v3, p2}, Lkotlinx/coroutines/DispatchException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v2, Ljava/lang/Throwable;

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    :goto_1
    invoke-static {v1}, Lkotlin/jvm/internal/InlineMarker;->finallyStart(I)V

    .line 76
    iput-boolean v0, p1, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    invoke-static {v1}, Lkotlin/jvm/internal/InlineMarker;->finallyEnd(I)V

    throw p2
.end method
