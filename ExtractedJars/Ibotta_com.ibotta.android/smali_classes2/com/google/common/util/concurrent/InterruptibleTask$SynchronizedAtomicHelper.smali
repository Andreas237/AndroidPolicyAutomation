.class final Lcom/google/common/util/concurrent/InterruptibleTask$SynchronizedAtomicHelper;
.super Lcom/google/common/util/concurrent/InterruptibleTask$AtomicHelper;
.source "InterruptibleTask.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/util/concurrent/InterruptibleTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "SynchronizedAtomicHelper"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 110
    invoke-direct {p0, v0}, Lcom/google/common/util/concurrent/InterruptibleTask$AtomicHelper;-><init>(Lcom/google/common/util/concurrent/InterruptibleTask$1;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/common/util/concurrent/InterruptibleTask$1;)V
    .locals 0

    .line 110
    invoke-direct {p0}, Lcom/google/common/util/concurrent/InterruptibleTask$SynchronizedAtomicHelper;-><init>()V

    return-void
.end method


# virtual methods
.method compareAndSetRunner(Lcom/google/common/util/concurrent/InterruptibleTask;Ljava/lang/Thread;Ljava/lang/Thread;)Z
    .locals 1

    .line 113
    monitor-enter p1

    .line 114
    :try_start_0
    invoke-static {p1}, Lcom/google/common/util/concurrent/InterruptibleTask;->access$200(Lcom/google/common/util/concurrent/InterruptibleTask;)Ljava/lang/Thread;

    move-result-object v0

    if-ne v0, p2, :cond_0

    .line 115
    invoke-static {p1, p3}, Lcom/google/common/util/concurrent/InterruptibleTask;->access$202(Lcom/google/common/util/concurrent/InterruptibleTask;Ljava/lang/Thread;)Ljava/lang/Thread;

    .line 117
    :cond_0
    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
