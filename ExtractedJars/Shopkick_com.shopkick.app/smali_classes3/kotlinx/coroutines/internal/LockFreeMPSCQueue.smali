.class public final Lkotlinx/coroutines/internal/LockFreeMPSCQueue;
.super Ljava/lang/Object;
.source "LockFreeMPSCQueue.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLockFreeMPSCQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeMPSCQueue.kt\nkotlinx/coroutines/internal/LockFreeMPSCQueue\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,241:1\n96#2,2:242\n96#2,2:244\n96#2,2:246\n*E\n*S KotlinDebug\n*F\n+ 1 LockFreeMPSCQueue.kt\nkotlinx/coroutines/internal/LockFreeMPSCQueue\n*L\n30#1,2:242\n37#1,2:244\n48#1,2:246\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0013\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\r\u0010\u0010\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0011R$\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0006j\u0008\u0012\u0004\u0012\u00028\u0000`\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0008\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\n\u00a8\u0006\u0012"
    }
    d2 = {
        "Lkotlinx/coroutines/internal/LockFreeMPSCQueue;",
        "E",
        "",
        "()V",
        "_cur",
        "Lkotlinx/atomicfu/AtomicRef;",
        "Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;",
        "Lkotlinx/coroutines/internal/Core;",
        "isEmpty",
        "",
        "()Z",
        "addLast",
        "element",
        "(Ljava/lang/Object;)Z",
        "close",
        "",
        "removeFirstOrNull",
        "()Ljava/lang/Object;",
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
.field private static final _cur$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _cur:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueue;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_cur"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueue;->_cur$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;-><init>(I)V

    iput-object v0, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueue;->_cur:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final addLast(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    :goto_0
    iget-object v0, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueue;->_cur:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    .line 38
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->addLast(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x0

    return p1

    .line 41
    :pswitch_1
    sget-object v1, Lkotlinx/coroutines/internal/LockFreeMPSCQueue;->_cur$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->next()Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    move-result-object v2

    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_2
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final close()V
    .locals 3

    .line 243
    :goto_0
    iget-object v0, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueue;->_cur:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    .line 31
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->close()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 32
    :cond_0
    sget-object v1, Lkotlinx/coroutines/internal/LockFreeMPSCQueue;->_cur$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->next()Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    move-result-object v2

    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 27
    iget-object v0, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueue;->_cur:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final removeFirstOrNull()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 247
    :goto_0
    iget-object v0, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueue;->_cur:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    .line 49
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->removeFirstOrNull()Ljava/lang/Object;

    move-result-object v1

    .line 50
    sget-object v2, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->REMOVE_FROZEN:Lkotlinx/coroutines/internal/Symbol;

    if-eq v1, v2, :cond_0

    return-object v1

    .line 51
    :cond_0
    sget-object v1, Lkotlinx/coroutines/internal/LockFreeMPSCQueue;->_cur$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->next()Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    move-result-object v2

    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0
.end method
