.class public Lo/fup;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fuc;


# instance fields
.field final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lo/fur;>;"
        }
    .end annotation
.end field

.field final d:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<Lo/fuk;>;"
        }
    .end annotation
.end field

.field e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fup;->e:Z

    .line 47
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/fup;->a:Ljava/util/Map;

    .line 49
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lo/fup;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/concurrent/LinkedBlockingQueue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/concurrent/LinkedBlockingQueue<Lo/fuk;>;"
        }
    .end annotation

    .line 69
    iget-object v0, p0, Lo/fup;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/fur;>;"
        }
    .end annotation

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lo/fup;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public c()V
    .locals 1

    .line 73
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fup;->e:Z

    .line 74
    return-void
.end method

.method public declared-synchronized e(Ljava/lang/String;)Lo/fty;
    .locals 3

    monitor-enter p0

    .line 52
    :try_start_0
    iget-object v0, p0, Lo/fup;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fur;

    .line 53
    if-nez v2, :cond_0

    .line 54
    new-instance v2, Lo/fur;

    iget-object v0, p0, Lo/fup;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    iget-boolean v1, p0, Lo/fup;->e:Z

    invoke-direct {v2, p1, v0, v1}, Lo/fur;-><init>(Ljava/lang/String;Ljava/util/Queue;Z)V

    .line 55
    iget-object v0, p0, Lo/fup;->a:Ljava/util/Map;

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    :cond_0
    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public e()V
    .locals 1

    .line 77
    iget-object v0, p0, Lo/fup;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 78
    iget-object v0, p0, Lo/fup;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    .line 79
    return-void
.end method
