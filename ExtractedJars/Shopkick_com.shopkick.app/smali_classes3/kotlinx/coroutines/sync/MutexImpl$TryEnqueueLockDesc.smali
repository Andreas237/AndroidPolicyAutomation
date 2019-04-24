.class final Lkotlinx/coroutines/sync/MutexImpl$TryEnqueueLockDesc;
.super Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;
.source "Mutex.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/sync/MutexImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "TryEnqueueLockDesc"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc<",
        "Lkotlinx/coroutines/sync/MutexImpl$LockSelect<",
        "TR;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00010\u00030\u0002j\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00010\u0003`\u0004BT\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c\u0012\"\u0010\r\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u000e\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0014R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0016"
    }
    d2 = {
        "Lkotlinx/coroutines/sync/MutexImpl$TryEnqueueLockDesc;",
        "R",
        "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;",
        "Lkotlinx/coroutines/sync/MutexImpl$LockSelect;",
        "Lkotlinx/coroutines/internal/AddLastDesc;",
        "mutex",
        "Lkotlinx/coroutines/sync/MutexImpl;",
        "owner",
        "",
        "queue",
        "Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;",
        "select",
        "Lkotlinx/coroutines/selects/SelectInstance;",
        "block",
        "Lkotlin/Function2;",
        "Lkotlinx/coroutines/sync/Mutex;",
        "Lkotlin/coroutines/Continuation;",
        "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V",
        "onPrepare",
        "affected",
        "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;",
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
.field public final mutex:Lkotlinx/coroutines/sync/MutexImpl;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V
    .locals 2
    .param p1    # Lkotlinx/coroutines/sync/MutexImpl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlinx/coroutines/selects/SelectInstance;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/sync/MutexImpl;",
            "Ljava/lang/Object;",
            "Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;",
            "Lkotlinx/coroutines/selects/SelectInstance<",
            "-TR;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lkotlinx/coroutines/sync/Mutex;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "mutex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queue"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "select"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    check-cast p3, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    new-instance v0, Lkotlinx/coroutines/sync/MutexImpl$LockSelect;

    move-object v1, p1

    check-cast v1, Lkotlinx/coroutines/sync/Mutex;

    invoke-direct {v0, p2, v1, p4, p5}, Lkotlinx/coroutines/sync/MutexImpl$LockSelect;-><init>(Ljava/lang/Object;Lkotlinx/coroutines/sync/Mutex;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V

    check-cast v0, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    invoke-direct {p0, p3, v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;-><init>(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V

    iput-object p1, p0, Lkotlinx/coroutines/sync/MutexImpl$TryEnqueueLockDesc;->mutex:Lkotlinx/coroutines/sync/MutexImpl;

    return-void
.end method


# virtual methods
.method protected onPrepare(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;
    .locals 2
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

    .line 295
    iget-object v0, p0, Lkotlinx/coroutines/sync/MutexImpl$TryEnqueueLockDesc;->mutex:Lkotlinx/coroutines/sync/MutexImpl;

    iget-object v0, v0, Lkotlinx/coroutines/sync/MutexImpl;->_state:Ljava/lang/Object;

    iget-object v1, p0, Lkotlinx/coroutines/sync/MutexImpl$TryEnqueueLockDesc;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    if-eq v0, v1, :cond_0

    invoke-static {}, Lkotlinx/coroutines/sync/MutexKt;->access$getENQUEUE_FAIL$p()Lkotlinx/coroutines/internal/Symbol;

    move-result-object p1

    return-object p1

    .line 296
    :cond_0
    invoke-super {p0, p1, p2}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;->onPrepare(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
