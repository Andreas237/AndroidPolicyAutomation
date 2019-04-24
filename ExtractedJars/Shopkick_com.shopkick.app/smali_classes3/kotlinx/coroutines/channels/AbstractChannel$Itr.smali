.class final Lkotlinx/coroutines/channels/AbstractChannel$Itr;
.super Ljava/lang/Object;
.source "AbstractChannel.kt"

# interfaces
.implements Lkotlinx/coroutines/channels/ChannelIterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/channels/AbstractChannel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Itr"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/channels/ChannelIterator<",
        "TE;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAbstractChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractChannel.kt\nkotlinx/coroutines/channels/AbstractChannel$Itr\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1086:1\n176#2,6:1087\n*E\n*S KotlinDebug\n*F\n+ 1 AbstractChannel.kt\nkotlinx/coroutines/channels/AbstractChannel$Itr\n*L\n866#1,6:1087\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0002\u0018\u0000*\u0004\u0008\u0001\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\u000e\u001a\u00020\u000fH\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\u000f2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0002J\u0011\u0010\u0012\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u0013\u001a\u00028\u0001H\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u0017\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u001c\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0014"
    }
    d2 = {
        "Lkotlinx/coroutines/channels/AbstractChannel$Itr;",
        "E",
        "Lkotlinx/coroutines/channels/ChannelIterator;",
        "channel",
        "Lkotlinx/coroutines/channels/AbstractChannel;",
        "(Lkotlinx/coroutines/channels/AbstractChannel;)V",
        "getChannel",
        "()Lkotlinx/coroutines/channels/AbstractChannel;",
        "result",
        "",
        "getResult",
        "()Ljava/lang/Object;",
        "setResult",
        "(Ljava/lang/Object;)V",
        "hasNext",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "hasNextResult",
        "hasNextSuspend",
        "next",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final channel:Lkotlinx/coroutines/channels/AbstractChannel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/AbstractChannel<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private result:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/AbstractChannel;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/channels/AbstractChannel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/AbstractChannel<",
            "TE;>;)V"
        }
    .end annotation

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 845
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->channel:Lkotlinx/coroutines/channels/AbstractChannel;

    .line 846
    sget-object p1, Lkotlinx/coroutines/channels/AbstractChannelKt;->POLL_FAILED:Ljava/lang/Object;

    iput-object p1, p0, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->result:Ljava/lang/Object;

    return-void
.end method

.method private final hasNextResult(Ljava/lang/Object;)Z
    .locals 1

    .line 859
    instance-of v0, p1, Lkotlinx/coroutines/channels/Closed;

    if-eqz v0, :cond_1

    .line 860
    check-cast p1, Lkotlinx/coroutines/channels/Closed;

    iget-object v0, p1, Lkotlinx/coroutines/channels/Closed;->closeCause:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lkotlinx/coroutines/channels/Closed;->getReceiveException()Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final getChannel()Lkotlinx/coroutines/channels/AbstractChannel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/channels/AbstractChannel<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 845
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->channel:Lkotlinx/coroutines/channels/AbstractChannel;

    return-object v0
.end method

.method public final getResult()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 846
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->result:Ljava/lang/Object;

    return-object v0
.end method

.method public hasNext(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
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

    .line 850
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->result:Ljava/lang/Object;

    sget-object v1, Lkotlinx/coroutines/channels/AbstractChannelKt;->POLL_FAILED:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    iget-object p1, p0, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->result:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->hasNextResult(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 852
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->channel:Lkotlinx/coroutines/channels/AbstractChannel;

    invoke-virtual {v0}, Lkotlinx/coroutines/channels/AbstractChannel;->pollInternal()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->result:Ljava/lang/Object;

    .line 853
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->result:Ljava/lang/Object;

    sget-object v1, Lkotlinx/coroutines/channels/AbstractChannelKt;->POLL_FAILED:Ljava/lang/Object;

    if-eq v0, v1, :cond_1

    iget-object p1, p0, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->result:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->hasNextResult(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 855
    :cond_1
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->hasNextSuspend(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final synthetic hasNextSuspend(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
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

    .line 1088
    new-instance v0, Lkotlinx/coroutines/CancellableContinuationImpl;

    invoke-static {p1}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/CancellableContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 1090
    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CancellableContinuation;

    .line 867
    new-instance v3, Lkotlinx/coroutines/channels/AbstractChannel$ReceiveHasNext;

    invoke-direct {v3, p0, v1}, Lkotlinx/coroutines/channels/AbstractChannel$ReceiveHasNext;-><init>(Lkotlinx/coroutines/channels/AbstractChannel$Itr;Lkotlinx/coroutines/CancellableContinuation;)V

    .line 869
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->getChannel()Lkotlinx/coroutines/channels/AbstractChannel;

    move-result-object v4

    move-object v5, v3

    check-cast v5, Lkotlinx/coroutines/channels/Receive;

    invoke-static {v4, v5}, Lkotlinx/coroutines/channels/AbstractChannel;->access$enqueueReceive(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/channels/Receive;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 870
    invoke-interface {v1}, Lkotlinx/coroutines/CancellableContinuation;->initCancellability()V

    .line 871
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->getChannel()Lkotlinx/coroutines/channels/AbstractChannel;

    move-result-object v2

    invoke-static {v2, v1, v5}, Lkotlinx/coroutines/channels/AbstractChannel;->access$removeReceiveOnCancel(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/CancellableContinuation;Lkotlinx/coroutines/channels/Receive;)V

    goto :goto_0

    .line 875
    :cond_1
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->getChannel()Lkotlinx/coroutines/channels/AbstractChannel;

    move-result-object v4

    invoke-virtual {v4}, Lkotlinx/coroutines/channels/AbstractChannel;->pollInternal()Ljava/lang/Object;

    move-result-object v4

    .line 876
    invoke-virtual {p0, v4}, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->setResult(Ljava/lang/Object;)V

    .line 877
    instance-of v5, v4, Lkotlinx/coroutines/channels/Closed;

    if-eqz v5, :cond_3

    .line 878
    check-cast v4, Lkotlinx/coroutines/channels/Closed;

    iget-object v3, v4, Lkotlinx/coroutines/channels/Closed;->closeCause:Ljava/lang/Throwable;

    if-nez v3, :cond_2

    .line 879
    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    .line 881
    :cond_2
    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {v4}, Lkotlinx/coroutines/channels/Closed;->getReceiveException()Ljava/lang/Throwable;

    move-result-object v2

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    .line 884
    :cond_3
    sget-object v5, Lkotlinx/coroutines/channels/AbstractChannelKt;->POLL_FAILED:Ljava/lang/Object;

    if-eq v4, v5, :cond_0

    .line 885
    check-cast v1, Lkotlin/coroutines/Continuation;

    const/4 v2, 0x1

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 1091
    :goto_0
    invoke-virtual {v0}, Lkotlinx/coroutines/CancellableContinuationImpl;->getResult()Ljava/lang/Object;

    move-result-object v0

    .line 1087
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_4

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_4
    return-object v0
.end method

.method public next(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-TE;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 893
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->result:Ljava/lang/Object;

    .line 894
    instance-of v1, v0, Lkotlinx/coroutines/channels/Closed;

    if-nez v1, :cond_1

    .line 895
    sget-object v1, Lkotlinx/coroutines/channels/AbstractChannelKt;->POLL_FAILED:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    .line 896
    sget-object p1, Lkotlinx/coroutines/channels/AbstractChannelKt;->POLL_FAILED:Ljava/lang/Object;

    iput-object p1, p0, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->result:Ljava/lang/Object;

    return-object v0

    .line 900
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->channel:Lkotlinx/coroutines/channels/AbstractChannel;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/channels/AbstractChannel;->receive(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 894
    :cond_1
    check-cast v0, Lkotlinx/coroutines/channels/Closed;

    invoke-virtual {v0}, Lkotlinx/coroutines/channels/Closed;->getReceiveException()Ljava/lang/Throwable;

    move-result-object p1

    throw p1
.end method

.method public final setResult(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 846
    iput-object p1, p0, Lkotlinx/coroutines/channels/AbstractChannel$Itr;->result:Ljava/lang/Object;

    return-void
.end method
