.class final Lcom/nytimes/android/external/cache/AbstractFuture$SynchronizedHelper;
.super Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;
.source "AbstractFuture.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/AbstractFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "SynchronizedHelper"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 877
    invoke-direct {p0, v0}, Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;-><init>(Lcom/nytimes/android/external/cache/AbstractFuture$1;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/nytimes/android/external/cache/AbstractFuture$1;)V
    .locals 0

    .line 877
    invoke-direct {p0}, Lcom/nytimes/android/external/cache/AbstractFuture$SynchronizedHelper;-><init>()V

    return-void
.end method


# virtual methods
.method casListeners(Lcom/nytimes/android/external/cache/AbstractFuture;Lcom/nytimes/android/external/cache/AbstractFuture$Listener;Lcom/nytimes/android/external/cache/AbstractFuture$Listener;)Z
    .locals 1
    .param p1    # Lcom/nytimes/android/external/cache/AbstractFuture;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/AbstractFuture<",
            "*>;",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Listener;",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Listener;",
            ")Z"
        }
    .end annotation

    .line 901
    monitor-enter p1

    .line 902
    :try_start_0
    invoke-static {p1}, Lcom/nytimes/android/external/cache/AbstractFuture;->access$600(Lcom/nytimes/android/external/cache/AbstractFuture;)Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

    move-result-object v0

    if-ne v0, p2, :cond_0

    .line 903
    invoke-static {p1, p3}, Lcom/nytimes/android/external/cache/AbstractFuture;->access$602(Lcom/nytimes/android/external/cache/AbstractFuture;Lcom/nytimes/android/external/cache/AbstractFuture$Listener;)Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

    const/4 p2, 0x1

    .line 904
    monitor-exit p1

    return p2

    :cond_0
    const/4 p2, 0x0

    .line 906
    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    .line 907
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method casValue(Lcom/nytimes/android/external/cache/AbstractFuture;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Lcom/nytimes/android/external/cache/AbstractFuture;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/AbstractFuture<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    .line 912
    monitor-enter p1

    .line 913
    :try_start_0
    invoke-static {p1}, Lcom/nytimes/android/external/cache/AbstractFuture;->access$200(Lcom/nytimes/android/external/cache/AbstractFuture;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p2, :cond_0

    .line 914
    invoke-static {p1, p3}, Lcom/nytimes/android/external/cache/AbstractFuture;->access$202(Lcom/nytimes/android/external/cache/AbstractFuture;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p2, 0x1

    .line 915
    monitor-exit p1

    return p2

    :cond_0
    const/4 p2, 0x0

    .line 917
    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    .line 918
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method casWaiters(Lcom/nytimes/android/external/cache/AbstractFuture;Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)Z
    .locals 1
    .param p1    # Lcom/nytimes/android/external/cache/AbstractFuture;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/AbstractFuture<",
            "*>;",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;",
            "Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;",
            ")Z"
        }
    .end annotation

    .line 890
    monitor-enter p1

    .line 891
    :try_start_0
    invoke-static {p1}, Lcom/nytimes/android/external/cache/AbstractFuture;->access$500(Lcom/nytimes/android/external/cache/AbstractFuture;)Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    move-result-object v0

    if-ne v0, p2, :cond_0

    .line 892
    invoke-static {p1, p3}, Lcom/nytimes/android/external/cache/AbstractFuture;->access$502(Lcom/nytimes/android/external/cache/AbstractFuture;Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    const/4 p2, 0x1

    .line 893
    monitor-exit p1

    return p2

    :cond_0
    const/4 p2, 0x0

    .line 895
    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    .line 896
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method putNext(Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)V
    .locals 0
    .param p1    # Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 885
    iput-object p2, p1, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->next:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    return-void
.end method

.method putThread(Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;Ljava/lang/Thread;)V
    .locals 0
    .param p1    # Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 880
    iput-object p2, p1, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->thread:Ljava/lang/Thread;

    return-void
.end method
