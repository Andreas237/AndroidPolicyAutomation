.class public Lcom/yandex/metrica/impl/ob/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/h$b;,
        Lcom/yandex/metrica/impl/ob/h$a;,
        Lcom/yandex/metrica/impl/ob/h$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Thread;

.field private volatile b:Z

.field private final c:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lcom/yandex/metrica/impl/ob/h$a;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Class;",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/yandex/metrica/impl/ob/l<",
            "+",
            "Lcom/yandex/metrica/impl/ob/j;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Ljava/lang/Object;",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/yandex/metrica/impl/ob/h$c;",
            ">;>;"
        }
    .end annotation
.end field

.field private f:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Class;",
            "Lcom/yandex/metrica/impl/ob/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 75
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/h;->b:Z

    .line 77
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/h;->c:Ljava/util/concurrent/BlockingQueue;

    .line 78
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/h;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 80
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/h;->e:Ljava/util/WeakHashMap;

    .line 82
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/h;->f:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v0, "YMM-BD"

    .line 86
    new-instance v1, Lcom/yandex/metrica/impl/ob/h$1;

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/ob/h$1;-><init>(Lcom/yandex/metrica/impl/ob/h;)V

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/lt;->a(Ljava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/h;->a:Ljava/lang/Thread;

    .line 97
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/h;->a:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static final a()Lcom/yandex/metrica/impl/ob/h;
    .locals 1

    .line 71
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h$b;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/h;)Z
    .locals 0

    .line 23
    iget-boolean p0, p0, Lcom/yandex/metrica/impl/ob/h;->b:Z

    return p0
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/ob/h;)Ljava/util/concurrent/BlockingQueue;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/h;->c:Ljava/util/concurrent/BlockingQueue;

    return-object p0
.end method


# virtual methods
.method public declared-synchronized a(Lcom/yandex/metrica/impl/ob/j;)V
    .locals 2

    monitor-enter p0

    .line 107
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/h;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_0

    .line 109
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/impl/ob/l;

    .line 114
    invoke-virtual {p0, p1, v1}, Lcom/yandex/metrica/impl/ob/h;->a(Lcom/yandex/metrica/impl/ob/j;Lcom/yandex/metrica/impl/ob/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 117
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 106
    monitor-exit p0

    throw p1
.end method

.method a(Lcom/yandex/metrica/impl/ob/j;Lcom/yandex/metrica/impl/ob/l;)V
    .locals 3
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/j;",
            "Lcom/yandex/metrica/impl/ob/l<",
            "+",
            "Lcom/yandex/metrica/impl/ob/j;",
            ">;)V"
        }
    .end annotation

    .line 121
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/h;->c:Ljava/util/concurrent/BlockingQueue;

    new-instance v1, Lcom/yandex/metrica/impl/ob/h$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcom/yandex/metrica/impl/ob/h$a;-><init>(Lcom/yandex/metrica/impl/ob/j;Lcom/yandex/metrica/impl/ob/l;B)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public declared-synchronized a(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/yandex/metrica/impl/ob/j;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    .line 130
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/h;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 129
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Ljava/lang/Object;)V
    .locals 1

    monitor-enter p0

    .line 160
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/h;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    .line 162
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/h$c;

    .line 163
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/h$c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 166
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 159
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Ljava/lang/Object;Ljava/lang/Class;Lcom/yandex/metrica/impl/ob/l;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class;",
            "Lcom/yandex/metrica/impl/ob/l<",
            "+",
            "Lcom/yandex/metrica/impl/ob/j;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    .line 140
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/h;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    if-nez v0, :cond_0

    .line 142
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 143
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/h;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    :cond_0
    invoke-virtual {v0, p3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/h;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    if-nez v1, :cond_1

    .line 148
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 149
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/h;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    :cond_1
    new-instance p1, Lcom/yandex/metrica/impl/ob/h$c;

    const/4 v2, 0x0

    invoke-direct {p1, v0, p3, v2}, Lcom/yandex/metrica/impl/ob/h$c;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;Lcom/yandex/metrica/impl/ob/l;B)V

    invoke-virtual {v1, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/h;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/j;

    if-eqz p1, :cond_2

    .line 154
    invoke-virtual {p0, p1, p3}, Lcom/yandex/metrica/impl/ob/h;->a(Lcom/yandex/metrica/impl/ob/j;Lcom/yandex/metrica/impl/ob/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 139
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(Lcom/yandex/metrica/impl/ob/j;)V
    .locals 2

    monitor-enter p0

    .line 125
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/h;->a(Lcom/yandex/metrica/impl/ob/j;)V

    .line 126
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/h;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 124
    monitor-exit p0

    throw p1
.end method
