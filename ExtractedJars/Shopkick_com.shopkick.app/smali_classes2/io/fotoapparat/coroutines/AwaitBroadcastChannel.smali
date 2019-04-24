.class public final Lio/fotoapparat/coroutines/AwaitBroadcastChannel;
.super Ljava/lang/Object;
.source "AwaitBroadcastChannel.kt"

# interfaces
.implements Lkotlinx/coroutines/channels/BroadcastChannel;
.implements Lkotlinx/coroutines/Deferred;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/channels/BroadcastChannel<",
        "TT;>;",
        "Lkotlinx/coroutines/Deferred<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u00022\u0008\u0012\u0004\u0012\u00020\u00040\u0003B%\u0012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0008\u00a2\u0006\u0002\u0010\tJ\u0011\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0097\u0001J\u0011\u0010*\u001a\u00020\u0004H\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\t\u0010,\u001a\u00020-H\u0096\u0001J\u0012\u0010,\u001a\u00020\u00042\u0008\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u000e\u00100\u001a\u00020\u0004H\u0097\u0001\u00a2\u0006\u0002\u0008,J\u0013\u00101\u001a\u00020\u00042\u0008\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0001J6\u00102\u001a\u0002H3\"\u0004\u0008\u0001\u001032\u0006\u00104\u001a\u0002H32\u0018\u00105\u001a\u0014\u0012\u0004\u0012\u0002H3\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u0002H306H\u0096\u0001\u00a2\u0006\u0002\u00108J(\u00109\u001a\u0004\u0018\u0001H:\"\u0008\u0008\u0001\u0010:*\u0002072\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u0002H:0\u0016H\u0096\u0003\u00a2\u0006\u0002\u0010;J\r\u0010<\u001a\u00060=j\u0002`>H\u0097\u0001J\u000e\u0010?\u001a\u00020\u0004H\u0097\u0001\u00a2\u0006\u0002\u0010@J\u000b\u0010A\u001a\u0004\u0018\u00010/H\u0097\u0001J\u0011\u0010B\u001a\u00028\u0000H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J.\u0010C\u001a\u00020-2#\u0010D\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010/\u00a2\u0006\u000c\u0008F\u0012\u0008\u0008G\u0012\u0004\u0008\u0008(.\u0012\u0004\u0012\u00020-0EH\u0097\u0001JB\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\'\u0010D\u001a#\u0012\u0015\u0012\u0013\u0018\u00010/\u00a2\u0006\u000c\u0008F\u0012\u0008\u0008G\u0012\u0004\u0008\u0008(.\u0012\u0004\u0012\u00020-0Ej\u0002`LH\u0097\u0001J2\u0010H\u001a\u00020I2\'\u0010D\u001a#\u0012\u0015\u0012\u0013\u0018\u00010/\u00a2\u0006\u000c\u0008F\u0012\u0008\u0008G\u0012\u0004\u0008\u0008(.\u0012\u0004\u0012\u00020-0Ej\u0002`LH\u0096\u0001J\u0011\u0010M\u001a\u00020-H\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u0015\u0010N\u001a\u00020O2\n\u0010\u0015\u001a\u0006\u0012\u0002\u0008\u00030\u0016H\u0096\u0001J\u0015\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010RJ\u000f\u0010S\u001a\u0008\u0012\u0004\u0012\u00028\u00000TH\u0096\u0001J\u0011\u0010U\u001a\u00020O2\u0006\u0010V\u001a\u00020OH\u0096\u0003J\u0011\u0010U\u001a\u00020\u000c2\u0006\u0010W\u001a\u00020\u000cH\u0097\u0003J\u0019\u0010X\u001a\u00020-2\u0006\u0010Q\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010YJ\t\u0010Z\u001a\u00020\u0004H\u0096\u0001R\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u0004X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0004X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0010R\u0012\u0010\u0013\u001a\u00020\u0004X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0010R\u0016\u0010\u0015\u001a\u0006\u0012\u0002\u0008\u00030\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001aX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u001eX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 R$\u0010!\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000#0\"X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006["
    }
    d2 = {
        "Lio/fotoapparat/coroutines/AwaitBroadcastChannel;",
        "T",
        "Lkotlinx/coroutines/channels/BroadcastChannel;",
        "Lkotlinx/coroutines/Deferred;",
        "",
        "channel",
        "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;",
        "deferred",
        "Lkotlinx/coroutines/CompletableDeferred;",
        "(Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;Lkotlinx/coroutines/CompletableDeferred;)V",
        "children",
        "Lkotlin/sequences/Sequence;",
        "Lkotlinx/coroutines/Job;",
        "getChildren",
        "()Lkotlin/sequences/Sequence;",
        "isActive",
        "()Z",
        "isCancelled",
        "isClosedForSend",
        "isCompleted",
        "isFull",
        "key",
        "Lkotlin/coroutines/CoroutineContext$Key;",
        "getKey",
        "()Lkotlin/coroutines/CoroutineContext$Key;",
        "onAwait",
        "Lkotlinx/coroutines/selects/SelectClause1;",
        "getOnAwait",
        "()Lkotlinx/coroutines/selects/SelectClause1;",
        "onJoin",
        "Lkotlinx/coroutines/selects/SelectClause0;",
        "getOnJoin",
        "()Lkotlinx/coroutines/selects/SelectClause0;",
        "onSend",
        "Lkotlinx/coroutines/selects/SelectClause2;",
        "Lkotlinx/coroutines/channels/SendChannel;",
        "getOnSend",
        "()Lkotlinx/coroutines/selects/SelectClause2;",
        "attachChild",
        "Lkotlinx/coroutines/ChildHandle;",
        "child",
        "Lkotlinx/coroutines/ChildJob;",
        "await",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "cancel",
        "",
        "cause",
        "",
        "cancel0",
        "close",
        "fold",
        "R",
        "initial",
        "operation",
        "Lkotlin/Function2;",
        "Lkotlin/coroutines/CoroutineContext$Element;",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;",
        "get",
        "E",
        "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;",
        "getCancellationException",
        "Ljava/util/concurrent/CancellationException;",
        "Lkotlinx/coroutines/CancellationException;",
        "getCompleted",
        "()Ljava/lang/Boolean;",
        "getCompletionExceptionOrNull",
        "getValue",
        "invokeOnClose",
        "handler",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "invokeOnCompletion",
        "Lkotlinx/coroutines/DisposableHandle;",
        "onCancelling",
        "invokeImmediately",
        "Lkotlinx/coroutines/CompletionHandler;",
        "join",
        "minusKey",
        "Lkotlin/coroutines/CoroutineContext;",
        "offer",
        "element",
        "(Ljava/lang/Object;)Z",
        "openSubscription",
        "Lkotlinx/coroutines/channels/ReceiveChannel;",
        "plus",
        "context",
        "other",
        "send",
        "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "start",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final channel:Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final deferred:Lkotlinx/coroutines/CompletableDeferred;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;-><init>(Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;Lkotlinx/coroutines/CompletableDeferred;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;Lkotlinx/coroutines/CompletableDeferred;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/CompletableDeferred;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel<",
            "TT;>;",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deferred"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->channel:Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;

    iput-object p2, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;Lkotlinx/coroutines/CompletableDeferred;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 12
    new-instance p1, Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;

    invoke-direct {p1}, Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;-><init>()V

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    const/4 p3, 0x1

    .line 13
    invoke-static {p2, p3, p2}, Lkotlinx/coroutines/CompletableDeferredKt;->CompletableDeferred$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;

    move-result-object p2

    :cond_1
    invoke-direct {p0, p1, p2}, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;-><init>(Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;Lkotlinx/coroutines/CompletableDeferred;)V

    return-void
.end method


# virtual methods
.method public attachChild(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;
    .locals 1
    .param p1    # Lkotlinx/coroutines/ChildJob;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlinx/coroutines/InternalCoroutinesApi;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/CompletableDeferred;->attachChild(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;

    move-result-object p1

    return-object p1
.end method

.method public await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/CompletableDeferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "await(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0}, Lkotlinx/coroutines/CompletableDeferred;->cancel()V

    return-void
.end method

.method public synthetic cancel()Z
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Left here for binary compatibility"
    .end annotation

    .annotation build Lkotlin/jvm/JvmName;
        name = "cancel"
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0}, Lkotlinx/coroutines/CompletableDeferred;->cancel()Z

    move-result v0

    return v0
.end method

.method public cancel(Ljava/lang/Throwable;)Z
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 35
    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->channel:Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;->cancel(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/CompletableDeferred;->cancel(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public close(Ljava/lang/Throwable;)Z
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->channel:Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;->close(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public fold(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 1
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lkotlin/jvm/functions/Function2<",
            "-TR;-",
            "Lkotlin/coroutines/CoroutineContext$Element;",
            "+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "operation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0, p1, p2}, Lkotlinx/coroutines/CompletableDeferred;->fold(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;
    .locals 1
    .param p1    # Lkotlin/coroutines/CoroutineContext$Key;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lkotlin/coroutines/CoroutineContext$Element;",
            ">(",
            "Lkotlin/coroutines/CoroutineContext$Key<",
            "TE;>;)TE;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/CompletableDeferred;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p1

    return-object p1
.end method

.method public getCancellationException()Ljava/util/concurrent/CancellationException;
    .locals 1
    .annotation build Lkotlinx/coroutines/InternalCoroutinesApi;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0}, Lkotlinx/coroutines/CompletableDeferred;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object v0

    return-object v0
.end method

.method public getChildren()Lkotlin/sequences/Sequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lkotlinx/coroutines/Job;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0}, Lkotlinx/coroutines/CompletableDeferred;->getChildren()Lkotlin/sequences/Sequence;

    move-result-object v0

    return-object v0
.end method

.method public getCompleted()Ljava/lang/Boolean;
    .locals 2
    .annotation build Lkotlinx/coroutines/ExperimentalCoroutinesApi;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0}, Lkotlinx/coroutines/CompletableDeferred;->getCompleted()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getCompleted(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic getCompleted()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->getCompleted()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public getCompletionExceptionOrNull()Ljava/lang/Throwable;
    .locals 1
    .annotation build Lkotlinx/coroutines/ExperimentalCoroutinesApi;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0}, Lkotlinx/coroutines/CompletableDeferred;->getCompletionExceptionOrNull()Ljava/lang/Throwable;

    move-result-object v0

    return-object v0
.end method

.method public getKey()Lkotlin/coroutines/CoroutineContext$Key;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/coroutines/CoroutineContext$Key<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0}, Lkotlinx/coroutines/CompletableDeferred;->getKey()Lkotlin/coroutines/CoroutineContext$Key;

    move-result-object v0

    return-object v0
.end method

.method public getOnAwait()Lkotlinx/coroutines/selects/SelectClause1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/selects/SelectClause1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0}, Lkotlinx/coroutines/CompletableDeferred;->getOnAwait()Lkotlinx/coroutines/selects/SelectClause1;

    move-result-object v0

    return-object v0
.end method

.method public getOnJoin()Lkotlinx/coroutines/selects/SelectClause0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0}, Lkotlinx/coroutines/CompletableDeferred;->getOnJoin()Lkotlinx/coroutines/selects/SelectClause0;

    move-result-object v0

    return-object v0
.end method

.method public getOnSend()Lkotlinx/coroutines/selects/SelectClause2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/selects/SelectClause2<",
            "TT;",
            "Lkotlinx/coroutines/channels/SendChannel<",
            "TT;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->channel:Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;

    invoke-virtual {v0}, Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;->getOnSend()Lkotlinx/coroutines/selects/SelectClause2;

    move-result-object v0

    return-object v0
.end method

.method public final getValue(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lio/fotoapparat/coroutines/AwaitBroadcastChannel$getValue$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel$getValue$1;

    iget v1, v0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel$getValue$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel$getValue$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel$getValue$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel$getValue$1;

    invoke-direct {v0, p0, p1}, Lio/fotoapparat/coroutines/AwaitBroadcastChannel$getValue$1;-><init>(Lio/fotoapparat/coroutines/AwaitBroadcastChannel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel$getValue$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 19
    iget v2, v0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel$getValue$1;->label:I

    packed-switch v2, :pswitch_data_0

    .line 21
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 19
    :pswitch_0
    iget-object v0, v0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel$getValue$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;

    instance-of v1, p1, Lkotlin/Result$Failure;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :pswitch_1
    instance-of v2, p1, Lkotlin/Result$Failure;

    if-nez v2, :cond_3

    .line 20
    iget-object p1, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    iput-object p0, v0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel$getValue$1;->L$0:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, v0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel$getValue$1;->label:I

    invoke-interface {p1, v0}, Lkotlinx/coroutines/CompletableDeferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    move-object v0, p0

    .line 21
    :goto_1
    iget-object p1, v0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->channel:Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;

    invoke-virtual {p1}, Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 19
    :cond_3
    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public invokeOnClose(Lkotlin/jvm/functions/Function1;)V
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
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlinx/coroutines/ExperimentalCoroutinesApi;
    .end annotation

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->channel:Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;->invokeOnClose(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;
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
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)",
            "Lkotlinx/coroutines/DisposableHandle;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/CompletableDeferred;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;

    move-result-object p1

    return-object p1
.end method

.method public invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;
    .locals 1
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)",
            "Lkotlinx/coroutines/DisposableHandle;"
        }
    .end annotation

    .annotation build Lkotlinx/coroutines/InternalCoroutinesApi;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "handler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0, p1, p2, p3}, Lkotlinx/coroutines/CompletableDeferred;->invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;

    move-result-object p1

    return-object p1
.end method

.method public isActive()Z
    .locals 1

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0}, Lkotlinx/coroutines/CompletableDeferred;->isActive()Z

    move-result v0

    return v0
.end method

.method public isCancelled()Z
    .locals 1

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0}, Lkotlinx/coroutines/CompletableDeferred;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public isClosedForSend()Z
    .locals 1

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->channel:Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;

    invoke-virtual {v0}, Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;->isClosedForSend()Z

    move-result v0

    return v0
.end method

.method public isCompleted()Z
    .locals 1

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0}, Lkotlinx/coroutines/CompletableDeferred;->isCompleted()Z

    move-result v0

    return v0
.end method

.method public isFull()Z
    .locals 1

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->channel:Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;

    invoke-virtual {v0}, Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;->isFull()Z

    move-result v0

    return v0
.end method

.method public join(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/CompletableDeferred;->join(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public minusKey(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;
    .locals 1
    .param p1    # Lkotlin/coroutines/CoroutineContext$Key;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/CoroutineContext$Key<",
            "*>;)",
            "Lkotlin/coroutines/CoroutineContext;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/CompletableDeferred;->minusKey(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    return-object p1
.end method

.method public offer(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/coroutines/CompletableDeferred;->complete(Ljava/lang/Object;)Z

    .line 26
    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->channel:Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;->offer(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public openSubscription()Lkotlinx/coroutines/channels/ReceiveChannel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/channels/ReceiveChannel<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->channel:Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;

    invoke-virtual {v0}, Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;->openSubscription()Lkotlinx/coroutines/channels/ReceiveChannel;

    move-result-object v0

    return-object v0
.end method

.method public plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;
    .locals 1
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/CompletableDeferred;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    return-object p1
.end method

.method public plus(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/Job;
    .locals 1
    .param p1    # Lkotlinx/coroutines/Job;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Operator \'+\' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`."
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/CompletableDeferred;->plus(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/Job;

    move-result-object p1

    return-object p1
.end method

.method public send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 30
    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    const/4 v1, 0x1

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/coroutines/CompletableDeferred;->complete(Ljava/lang/Object;)Z

    .line 31
    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->channel:Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;

    invoke-virtual {v0, p1, p2}, Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public start()Z
    .locals 1

    iget-object v0, p0, Lio/fotoapparat/coroutines/AwaitBroadcastChannel;->deferred:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0}, Lkotlinx/coroutines/CompletableDeferred;->start()Z

    move-result v0

    return v0
.end method
