.class public Lkotlinx/coroutines/scheduling/GlobalQueue;
.super Lkotlinx/coroutines/internal/LockFreeTaskQueue;
.source "Tasks.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlinx/coroutines/internal/LockFreeTaskQueue<",
        "Lkotlinx/coroutines/scheduling/Task;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/scheduling/GlobalQueue\n+ 2 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueue\n+ 3 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n+ 4 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n+ 5 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion\n*L\n1#1,125:1\n61#2:126\n62#2:129\n63#2,3:166\n96#3,2:127\n391#3,2:131\n168#4:130\n169#4,2:133\n171#4,28:138\n301#5,3:135\n*E\n*S KotlinDebug\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/scheduling/GlobalQueue\n*L\n115#1:126\n115#1:129\n115#1,3:166\n115#1,2:127\n115#1,2:131\n115#1:130\n115#1,2:133\n115#1,28:138\n115#1,3:135\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0010\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\u0005"
    }
    d2 = {
        "Lkotlinx/coroutines/scheduling/GlobalQueue;",
        "Lkotlinx/coroutines/internal/LockFreeTaskQueue;",
        "Lkotlinx/coroutines/scheduling/Task;",
        "()V",
        "removeFirstBlockingModeOrNull",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 112
    invoke-direct {p0, v0}, Lkotlinx/coroutines/internal/LockFreeTaskQueue;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public removeFirstBlockingModeOrNull()Lkotlinx/coroutines/scheduling/Task;
    .locals 11
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 128
    :goto_0
    iget-object v0, p0, Lkotlinx/coroutines/internal/LockFreeTaskQueue;->_cur$internal:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;

    .line 132
    :cond_0
    :goto_1
    iget-wide v3, v0, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->_state$internal:J

    const-wide/high16 v1, 0x1000000000000000L

    and-long v5, v3, v1

    const-wide/16 v1, 0x0

    cmp-long v7, v5, v1

    const/4 v8, 0x0

    if-eqz v7, :cond_1

    .line 133
    sget-object v8, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->REMOVE_FROZEN:Lkotlinx/coroutines/internal/Symbol;

    goto/16 :goto_4

    .line 134
    :cond_1
    sget-object v1, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->Companion:Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;

    const-wide/32 v1, 0x3fffffff

    and-long v5, v3, v1

    const/4 v1, 0x0

    shr-long/2addr v5, v1

    long-to-int v7, v5

    const-wide v5, 0xfffffffc0000000L

    and-long v9, v3, v5

    const/16 v2, 0x1e

    shr-long v5, v9, v2

    long-to-int v2, v5

    .line 138
    invoke-static {v0}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->access$getMask$p(Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;)I

    move-result v5

    and-int/2addr v2, v5

    invoke-static {v0}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->access$getMask$p(Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;)I

    move-result v5

    and-int/2addr v5, v7

    if-ne v2, v5, :cond_2

    goto :goto_4

    .line 139
    :cond_2
    invoke-static {v0}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->access$getArray$p(Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;)Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v2

    invoke-static {v0}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->access$getMask$p(Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;)I

    move-result v5

    and-int/2addr v5, v7

    invoke-virtual {v2, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_3

    .line 142
    invoke-static {v0}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->access$getSingleConsumer$p(Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    .line 147
    :cond_3
    instance-of v2, v9, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Placeholder;

    if-eqz v2, :cond_4

    goto :goto_4

    .line 150
    :cond_4
    move-object v2, v9

    check-cast v2, Lkotlinx/coroutines/scheduling/Task;

    .line 115
    invoke-virtual {v2}, Lkotlinx/coroutines/scheduling/Task;->getMode()Lkotlinx/coroutines/scheduling/TaskMode;

    move-result-object v2

    sget-object v5, Lkotlinx/coroutines/scheduling/TaskMode;->PROBABLY_BLOCKING:Lkotlinx/coroutines/scheduling/TaskMode;

    if-ne v2, v5, :cond_5

    const/4 v1, 0x1

    :cond_5
    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    add-int/lit8 v1, v7, 0x1

    const v2, 0x3fffffff    # 1.9999999f

    and-int v10, v1, v2

    .line 153
    sget-object v1, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->_state$FU$internal:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    sget-object v2, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->Companion:Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;

    invoke-virtual {v2, v3, v4, v10}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;->updateHead(JI)J

    move-result-wide v5

    move-object v2, v0

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 156
    invoke-static {v0}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->access$getArray$p(Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;)Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v1

    invoke-static {v0}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->access$getMask$p(Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;)I

    move-result v2

    and-int/2addr v2, v7

    invoke-virtual {v1, v2, v8}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    goto :goto_3

    .line 160
    :cond_7
    invoke-static {v0}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->access$getSingleConsumer$p(Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;)Z

    move-result v1

    if-nez v1, :cond_8

    goto/16 :goto_1

    :cond_8
    move-object v1, v0

    .line 165
    :goto_2
    invoke-static {v1, v7, v10}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->access$removeSlowPath(Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;II)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;

    move-result-object v1

    if-eqz v1, :cond_9

    goto :goto_2

    :cond_9
    :goto_3
    move-object v8, v9

    .line 166
    :goto_4
    sget-object v1, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->REMOVE_FROZEN:Lkotlinx/coroutines/internal/Symbol;

    if-eq v8, v1, :cond_a

    .line 127
    check-cast v8, Lkotlinx/coroutines/scheduling/Task;

    return-object v8

    .line 167
    :cond_a
    sget-object v1, Lkotlinx/coroutines/internal/LockFreeTaskQueue;->_cur$FU$internal:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;->next()Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;

    move-result-object v2

    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_0
.end method
