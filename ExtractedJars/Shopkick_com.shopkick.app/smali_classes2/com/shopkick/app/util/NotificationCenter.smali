.class public Lcom/shopkick/app/util/NotificationCenter;
.super Ljava/lang/Object;
.source "NotificationCenter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/util/NotificationCenter$NotificationCallbackTask;
    }
.end annotation


# static fields
.field private static final backgroundObserversAccessLock:Ljava/lang/Object;

.field private static final threadPoolExecutor:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private backgroundObservers:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/util/INotificationObserver;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private observers:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/util/INotificationObserver;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/util/NotificationCenter;->threadPoolExecutor:Ljava/util/concurrent/ExecutorService;

    .line 28
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/app/util/NotificationCenter;->backgroundObserversAccessLock:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/util/NotificationCenter;->observers:Ljava/util/HashMap;

    .line 32
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/util/NotificationCenter;->backgroundObservers:Ljava/util/concurrent/ConcurrentMap;

    return-void
.end method

.method private getWeakRefFromColloection(Ljava/util/Collection;Lcom/shopkick/app/util/INotificationObserver;)Ljava/lang/ref/WeakReference;
    .locals 3
    .param p1    # Ljava/util/Collection;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/shopkick/app/util/INotificationObserver;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/util/INotificationObserver;",
            ">;>;",
            "Lcom/shopkick/app/util/INotificationObserver;",
            ")",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/util/INotificationObserver;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    if-nez p2, :cond_0

    goto :goto_1

    .line 207
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 208
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 209
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 210
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    .line 211
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 212
    :cond_2
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p2, :cond_1

    return-object v1

    :cond_3
    return-object v0

    :cond_4
    :goto_1
    return-object v0
.end method


# virtual methods
.method public addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_5

    if-nez p2, :cond_0

    goto :goto_2

    .line 48
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/util/NotificationCenter;->backgroundObservers:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p2}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/util/NotificationCenter;->backgroundObservers:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p2}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/util/NotificationCenter;->getWeakRefFromColloection(Ljava/util/Collection;Lcom/shopkick/app/util/INotificationObserver;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "same observer has already been registered for same event for background callbacks"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 56
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/util/NotificationCenter;->observers:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 57
    iget-object v0, p0, Lcom/shopkick/app/util/NotificationCenter;->observers:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 58
    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/util/NotificationCenter;->getWeakRefFromColloection(Ljava/util/Collection;Lcom/shopkick/app/util/INotificationObserver;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    if-nez v1, :cond_4

    .line 59
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 62
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 63
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/shopkick/app/util/NotificationCenter;->observers:Ljava/util/HashMap;

    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_5
    :goto_2
    return-void
.end method

.method public addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V
    .locals 2

    if-eqz p1, :cond_5

    .line 76
    invoke-static {p2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    if-nez p3, :cond_0

    .line 81
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto :goto_2

    .line 84
    :cond_0
    iget-object p3, p0, Lcom/shopkick/app/util/NotificationCenter;->observers:Ljava/util/HashMap;

    invoke-virtual {p3, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/shopkick/app/util/NotificationCenter;->observers:Ljava/util/HashMap;

    invoke-virtual {p3, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Collection;

    invoke-direct {p0, p3, p1}, Lcom/shopkick/app/util/NotificationCenter;->getWeakRefFromColloection(Ljava/util/Collection;Lcom/shopkick/app/util/INotificationObserver;)Ljava/lang/ref/WeakReference;

    move-result-object p3

    if-nez p3, :cond_1

    goto :goto_0

    .line 85
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "The same observer has been registered for this event in synchronize callback."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 89
    :cond_2
    :goto_0
    sget-object p3, Lcom/shopkick/app/util/NotificationCenter;->backgroundObserversAccessLock:Ljava/lang/Object;

    monitor-enter p3

    .line 90
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/util/NotificationCenter;->backgroundObservers:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p2}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/util/NotificationCenter;->backgroundObservers:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p2}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 92
    invoke-direct {p0, p2, p1}, Lcom/shopkick/app/util/NotificationCenter;->getWeakRefFromColloection(Ljava/util/Collection;Lcom/shopkick/app/util/INotificationObserver;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-nez v0, :cond_4

    .line 93
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 96
    :cond_3
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 97
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/util/NotificationCenter;->backgroundObservers:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {p1, p2, v0}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    :cond_4
    :goto_1
    monitor-exit p3

    :goto_2
    return-void

    :catchall_0
    move-exception p1

    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 77
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "trying to add either null observer or empty event"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public notifyEvent(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/concurrent/Future;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 162
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/util/concurrent/Future;",
            ">;"
        }
    .end annotation

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/util/NotificationCenter;->observers:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 173
    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 174
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 175
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/util/INotificationObserver;

    if-eqz v1, :cond_0

    .line 177
    invoke-interface {v1, p1, p2}, Lcom/shopkick/app/util/INotificationObserver;->onEvent(Ljava/lang/String;Ljava/util/HashMap;)V

    goto :goto_0

    .line 182
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 183
    iget-object v1, p0, Lcom/shopkick/app/util/NotificationCenter;->backgroundObservers:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_2

    .line 185
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 186
    sget-object v3, Lcom/shopkick/app/util/NotificationCenter;->threadPoolExecutor:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Lcom/shopkick/app/util/NotificationCenter$NotificationCallbackTask;

    invoke-direct {v4, p0, v2, p1, p2}, Lcom/shopkick/app/util/NotificationCenter$NotificationCallbackTask;-><init>(Lcom/shopkick/app/util/NotificationCenter;Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/util/HashMap;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method public removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 143
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 144
    iget-object v1, p0, Lcom/shopkick/app/util/NotificationCenter;->observers:Ljava/util/HashMap;

    .line 145
    invoke-virtual {v1}, Ljava/util/HashMap;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/HashMap;

    .line 146
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 147
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 148
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 151
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/util/NotificationCenter;->backgroundObservers:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 153
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 154
    invoke-virtual {p0, p1, v1}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    .line 112
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/util/NotificationCenter;->observers:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 113
    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/util/NotificationCenter;->getWeakRefFromColloection(Ljava/util/Collection;Lcom/shopkick/app/util/INotificationObserver;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 115
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 116
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/util/NotificationCenter;->observers:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    :cond_1
    sget-object v0, Lcom/shopkick/app/util/NotificationCenter;->backgroundObserversAccessLock:Ljava/lang/Object;

    monitor-enter v0

    .line 122
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/util/NotificationCenter;->backgroundObservers:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, p2}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 123
    invoke-direct {p0, v1, p1}, Lcom/shopkick/app/util/NotificationCenter;->getWeakRefFromColloection(Ljava/util/Collection;Lcom/shopkick/app/util/INotificationObserver;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 125
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 126
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 127
    iget-object p1, p0, Lcom/shopkick/app/util/NotificationCenter;->backgroundObservers:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {p1, p2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    :goto_0
    return-void
.end method
