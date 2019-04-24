.class final Lkotlinx/coroutines/channels/AbstractChannel$TryEnqueueReceiveDesc;
.super Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;
.source "AbstractChannel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/channels/AbstractChannel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "TryEnqueueReceiveDesc"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc<",
        "Lkotlinx/coroutines/channels/AbstractChannel<",
        "TE;>.ReceiveSelect<TR;-TE;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0082\u0004\u0018\u0000*\u0004\u0008\u0001\u0010\u0001*\u0004\u0008\u0002\u0010\u00022>\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0004R\u0008\u0012\u0004\u0012\u00028\u00000\u00050\u0003j\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0004R\u0008\u0012\u0004\u0012\u00028\u00000\u0005`\u0006BD\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u0008\u0012$\u0010\t\u001a \u0008\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000cH\u0014J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0014\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0017"
    }
    d2 = {
        "Lkotlinx/coroutines/channels/AbstractChannel$TryEnqueueReceiveDesc;",
        "E",
        "R",
        "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;",
        "Lkotlinx/coroutines/channels/AbstractChannel$ReceiveSelect;",
        "Lkotlinx/coroutines/channels/AbstractChannel;",
        "Lkotlinx/coroutines/internal/AddLastDesc;",
        "select",
        "Lkotlinx/coroutines/selects/SelectInstance;",
        "block",
        "Lkotlin/Function2;",
        "Lkotlin/coroutines/Continuation;",
        "",
        "nullOnClose",
        "",
        "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;Z)V",
        "failure",
        "affected",
        "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;",
        "next",
        "finishOnSuccess",
        "",
        "onPrepare",
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
.field final synthetic this$0:Lkotlinx/coroutines/channels/AbstractChannel;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;Z)V
    .locals 2
    .param p1    # Lkotlinx/coroutines/channels/AbstractChannel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/selects/SelectInstance;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/selects/SelectInstance<",
            "-TR;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TE;-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "select"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 713
    iput-object p1, p0, Lkotlinx/coroutines/channels/AbstractChannel$TryEnqueueReceiveDesc;->this$0:Lkotlinx/coroutines/channels/AbstractChannel;

    .line 717
    invoke-virtual {p1}, Lkotlinx/coroutines/channels/AbstractChannel;->getQueue()Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    new-instance v1, Lkotlinx/coroutines/channels/AbstractChannel$ReceiveSelect;

    invoke-direct {v1, p1, p2, p3, p4}, Lkotlinx/coroutines/channels/AbstractChannel$ReceiveSelect;-><init>(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;Z)V

    check-cast v1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    invoke-direct {p0, v0, v1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;-><init>(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V

    return-void
.end method


# virtual methods
.method protected failure(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlinx/coroutines/internal/LockFreeLinkedListNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "affected"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "next"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 719
    instance-of p1, p1, Lkotlinx/coroutines/channels/Send;

    if-eqz p1, :cond_0

    sget-object p1, Lkotlinx/coroutines/channels/AbstractChannelKt;->ENQUEUE_FAILED:Ljava/lang/Object;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected finishOnSuccess(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/internal/LockFreeLinkedListNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/internal/LockFreeLinkedListNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "affected"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "next"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 729
    invoke-super {p0, p1, p2}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;->finishOnSuccess(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V

    .line 731
    iget-object p1, p0, Lkotlinx/coroutines/channels/AbstractChannel$TryEnqueueReceiveDesc;->this$0:Lkotlinx/coroutines/channels/AbstractChannel;

    invoke-virtual {p1}, Lkotlinx/coroutines/channels/AbstractChannel;->onReceiveEnqueued()V

    .line 733
    iget-object p1, p0, Lkotlinx/coroutines/channels/AbstractChannel$TryEnqueueReceiveDesc;->node:Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    check-cast p1, Lkotlinx/coroutines/channels/AbstractChannel$ReceiveSelect;

    invoke-virtual {p1}, Lkotlinx/coroutines/channels/AbstractChannel$ReceiveSelect;->removeOnSelectCompletion()V

    return-void
.end method

.method protected onPrepare(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlinx/coroutines/internal/LockFreeLinkedListNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/internal/LockFreeLinkedListNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "affected"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "next"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 724
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractChannel$TryEnqueueReceiveDesc;->this$0:Lkotlinx/coroutines/channels/AbstractChannel;

    invoke-virtual {v0}, Lkotlinx/coroutines/channels/AbstractChannel;->isBufferEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lkotlinx/coroutines/channels/AbstractChannelKt;->ENQUEUE_FAILED:Ljava/lang/Object;

    return-object p1

    .line 725
    :cond_0
    invoke-super {p0, p1, p2}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;->onPrepare(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
