.class public final Lio/streamroot/dna/core/js/CallExecutor;
.super Ljava/lang/Object;
.source "CallExecutor.kt"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCallExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallExecutor.kt\nio/streamroot/dna/core/js/CallExecutor\n*L\n1#1,51:1\n*E\n"
.end annotation

.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\n\u001a\u00020\u000b2\u001b\u0010\u000c\u001a\u0017\u0012\u0008\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0008\u0010H\u0086\u0008J0\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u001b\u0010\u000c\u001a\u0017\u0012\u0008\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0008\u0010H\u0086H\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0008\u0010\u0013\u001a\u00020\u000bH\u0016J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0005J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\tR\u0014\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/streamroot/dna/core/js/CallExecutor;",
        "Ljava/lang/AutoCloseable;",
        "()V",
        "callExecutionQueue",
        "Ljava/util/ArrayDeque;",
        "",
        "enabled",
        "",
        "javaScriptInterpreter",
        "Lio/streamroot/dna/core/js/JavaScriptInterpreter;",
        "buildAndExecute",
        "",
        "builderAction",
        "Lkotlin/Function1;",
        "Ljava/lang/StringBuilder;",
        "Lkotlin/text/StringBuilder;",
        "Lkotlin/ExtensionFunctionType;",
        "buildAndExecuteString",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "close",
        "execute",
        "call",
        "executeString",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "register",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final callExecutionQueue:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private enabled:Z

.field private javaScriptInterpreter:Lio/streamroot/dna/core/js/JavaScriptInterpreter;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lio/streamroot/dna/core/js/CallExecutor;->callExecutionQueue:Ljava/util/ArrayDeque;

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lio/streamroot/dna/core/js/CallExecutor;->enabled:Z

    return-void
.end method

.method private final buildAndExecuteString$$forInline(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {v0}, Lkotlin/jvm/internal/InlineMarker;->mark(I)V

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/js/CallExecutor;->executeString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p2}, Lkotlin/jvm/internal/InlineMarker;->mark(I)V

    return-object p1
.end method


# virtual methods
.method public final buildAndExecute(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/StringBuilder;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/js/CallExecutor;->execute(Ljava/lang/String;)V

    return-void
.end method

.method public final buildAndExecuteString(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/StringBuilder;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lio/streamroot/dna/core/js/CallExecutor;->executeString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized close()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 46
    :try_start_0
    iput-boolean v0, p0, Lio/streamroot/dna/core/js/CallExecutor;->enabled:Z

    const/4 v0, 0x0

    .line 47
    check-cast v0, Lio/streamroot/dna/core/js/JavaScriptInterpreter;

    iput-object v0, p0, Lio/streamroot/dna/core/js/CallExecutor;->javaScriptInterpreter:Lio/streamroot/dna/core/js/JavaScriptInterpreter;

    .line 48
    iget-object v0, p0, Lio/streamroot/dna/core/js/CallExecutor;->callExecutionQueue:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 45
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized execute(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    iget-boolean v0, p0, Lio/streamroot/dna/core/js/CallExecutor;->enabled:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/streamroot/dna/core/js/CallExecutor;->javaScriptInterpreter:Lio/streamroot/dna/core/js/JavaScriptInterpreter;

    if-nez v0, :cond_0

    .line 33
    iget-object v0, p0, Lio/streamroot/dna/core/js/CallExecutor;->callExecutionQueue:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    goto :goto_0

    .line 35
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/core/js/CallExecutor;->javaScriptInterpreter:Lio/streamroot/dna/core/js/JavaScriptInterpreter;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lio/streamroot/dna/core/js/JavaScriptInterpreter;->interpretVoid(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 31
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized executeString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    monitor-enter p0

    :try_start_0
    instance-of v0, p2, Lio/streamroot/dna/core/js/CallExecutor$executeString$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/streamroot/dna/core/js/CallExecutor$executeString$1;

    iget v1, v0, Lio/streamroot/dna/core/js/CallExecutor$executeString$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lio/streamroot/dna/core/js/CallExecutor$executeString$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lio/streamroot/dna/core/js/CallExecutor$executeString$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/streamroot/dna/core/js/CallExecutor$executeString$1;

    invoke-direct {v0, p0, p2}, Lio/streamroot/dna/core/js/CallExecutor$executeString$1;-><init>(Lio/streamroot/dna/core/js/CallExecutor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lio/streamroot/dna/core/js/CallExecutor$executeString$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 40
    iget v2, v0, Lio/streamroot/dna/core/js/CallExecutor$executeString$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    goto :goto_2

    :pswitch_0
    iget-object p1, v0, Lio/streamroot/dna/core/js/CallExecutor$executeString$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/streamroot/dna/core/js/CallExecutor$executeString$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/streamroot/dna/core/js/CallExecutor;

    instance-of p1, p2, Lkotlin/Result$Failure;

    if-eqz p1, :cond_2

    check-cast p2, Lkotlin/Result$Failure;

    iget-object p1, p2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :pswitch_1
    instance-of v2, p2, Lkotlin/Result$Failure;

    if-eqz v2, :cond_1

    check-cast p2, Lkotlin/Result$Failure;

    iget-object p1, p2, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    .line 41
    :cond_1
    iget-object p2, p0, Lio/streamroot/dna/core/js/CallExecutor;->javaScriptInterpreter:Lio/streamroot/dna/core/js/JavaScriptInterpreter;

    if-eqz p2, :cond_3

    iput-object p0, v0, Lio/streamroot/dna/core/js/CallExecutor$executeString$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lio/streamroot/dna/core/js/CallExecutor$executeString$1;->L$1:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, v0, Lio/streamroot/dna/core/js/CallExecutor$executeString$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/streamroot/dna/core/js/JavaScriptInterpreter;->interpretString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p2, v1, :cond_2

    .line 40
    monitor-exit p0

    return-object v1

    :cond_2
    :try_start_1
    check-cast p2, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_1
    monitor-exit p0

    return-object p2

    :goto_2
    :try_start_2
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    .line 39
    monitor-exit p0

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final declared-synchronized register(Lio/streamroot/dna/core/js/JavaScriptInterpreter;)V
    .locals 2
    .param p1    # Lio/streamroot/dna/core/js/JavaScriptInterpreter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "javaScriptInterpreter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    :goto_0
    iget-object v0, p0, Lio/streamroot/dna/core/js/CallExecutor;->callExecutionQueue:Ljava/util/ArrayDeque;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 15
    iget-object v0, p0, Lio/streamroot/dna/core/js/CallExecutor;->callExecutionQueue:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "callExecutionQueue.poll()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lio/streamroot/dna/core/js/JavaScriptInterpreter;->interpretVoid(Ljava/lang/String;)V

    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/core/js/CallExecutor;->callExecutionQueue:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 19
    iput-object p1, p0, Lio/streamroot/dna/core/js/CallExecutor;->javaScriptInterpreter:Lio/streamroot/dna/core/js/JavaScriptInterpreter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 13
    monitor-exit p0

    throw p1
.end method
