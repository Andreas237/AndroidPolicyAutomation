.class public Lkotlinx/coroutines/scheduling/GlobalQueue;
.super Lkotlinx/coroutines/internal/LockFreeMPMCQueue;
.source "Tasks.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlinx/coroutines/internal/LockFreeMPMCQueue<",
        "Lkotlinx/coroutines/scheduling/Task;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/scheduling/GlobalQueue\n+ 2 LockFreeMPMCQueue.kt\nkotlinx/coroutines/internal/LockFreeMPMCQueue\n*L\n1#1,129:1\n50#2,11:130\n75#2,6:141\n75#2,6:147\n*E\n*S KotlinDebug\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/scheduling/GlobalQueue\n*L\n111#1,11:130\n115#1,6:141\n119#1,6:147\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0010\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u00a8\u0006\t"
    }
    d2 = {
        "Lkotlinx/coroutines/scheduling/GlobalQueue;",
        "Lkotlinx/coroutines/internal/LockFreeMPMCQueue;",
        "Lkotlinx/coroutines/scheduling/Task;",
        "()V",
        "add",
        "",
        "task",
        "removeFirstBlockingModeOrNull",
        "removeFirstIfNotClosed",
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
    .locals 0

    .line 108
    invoke-direct {p0}, Lkotlinx/coroutines/internal/LockFreeMPMCQueue;-><init>()V

    return-void
.end method


# virtual methods
.method public final add(Lkotlinx/coroutines/scheduling/Task;)Z
    .locals 4
    .param p1    # Lkotlinx/coroutines/scheduling/Task;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "task"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/LockFreeMPMCQueue;->getTailValue()Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;

    move-result-object v0

    .line 132
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;->getNextValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;

    if-eqz v1, :cond_1

    .line 134
    invoke-virtual {p0, v0, v1}, Lkotlinx/coroutines/internal/LockFreeMPMCQueue;->tailCas(Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;)Z

    goto :goto_0

    .line 111
    :cond_1
    invoke-static {}, Lkotlinx/coroutines/scheduling/TasksKt;->getCLOSED_TASK()Lkotlinx/coroutines/scheduling/Task;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    move v1, v3

    :goto_1
    if-nez v1, :cond_3

    move v2, v3

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    .line 138
    move-object v3, p1

    check-cast v3, Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;

    invoke-virtual {v0, v1, v3}, Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;->nextCas(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 139
    invoke-virtual {p0, v0, v3}, Lkotlinx/coroutines/internal/LockFreeMPMCQueue;->tailCas(Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;)Z

    :goto_2
    return v2
.end method

.method public removeFirstBlockingModeOrNull()Lkotlinx/coroutines/scheduling/Task;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 148
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/LockFreeMPMCQueue;->getHeadValue()Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;

    move-result-object v0

    .line 149
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;->getNextValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 150
    move-object v3, v1

    check-cast v3, Lkotlinx/coroutines/scheduling/Task;

    .line 119
    invoke-virtual {v3}, Lkotlinx/coroutines/scheduling/Task;->getMode()Lkotlinx/coroutines/scheduling/TaskMode;

    move-result-object v3

    sget-object v4, Lkotlinx/coroutines/scheduling/TaskMode;->PROBABLY_BLOCKING:Lkotlinx/coroutines/scheduling/TaskMode;

    if-ne v3, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_2

    goto :goto_1

    .line 151
    :cond_2
    invoke-virtual {p0, v0, v1}, Lkotlinx/coroutines/internal/LockFreeMPMCQueue;->headCas(Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v2, v1

    .line 147
    :cond_3
    :goto_1
    check-cast v2, Lkotlinx/coroutines/scheduling/Task;

    return-object v2
.end method

.method public final removeFirstIfNotClosed()Lkotlinx/coroutines/scheduling/Task;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 142
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/LockFreeMPMCQueue;->getHeadValue()Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;

    move-result-object v0

    .line 143
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;->getNextValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 144
    move-object v3, v1

    check-cast v3, Lkotlinx/coroutines/scheduling/Task;

    .line 115
    invoke-static {}, Lkotlinx/coroutines/scheduling/TasksKt;->getCLOSED_TASK()Lkotlinx/coroutines/scheduling/Task;

    move-result-object v4

    if-eq v3, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_2

    goto :goto_1

    .line 145
    :cond_2
    invoke-virtual {p0, v0, v1}, Lkotlinx/coroutines/internal/LockFreeMPMCQueue;->headCas(Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;Lkotlinx/coroutines/internal/LockFreeMPMCQueueNode;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v2, v1

    .line 141
    :cond_3
    :goto_1
    check-cast v2, Lkotlinx/coroutines/scheduling/Task;

    return-object v2
.end method
