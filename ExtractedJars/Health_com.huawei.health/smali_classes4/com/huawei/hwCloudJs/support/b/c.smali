.class public abstract Lcom/huawei/hwCloudJs/support/b/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hwCloudJs/support/b/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Lcom/huawei/hwCloudJs/support/b/d;>Ljava/lang/Object;Lcom/huawei/hwCloudJs/support/b/a<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwCloudJs/support/b/b<TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwCloudJs/support/b/c;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hwCloudJs/support/b/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwCloudJs/support/b/b<TT;>;)V"
        }
    .end annotation

    iget-object v1, p0, Lcom/huawei/hwCloudJs/support/b/c;->a:Ljava/util/List;

    monitor-enter v1

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    monitor-exit v1

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/support/b/c;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/support/b/c;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method

.method public a(Lcom/huawei/hwCloudJs/support/b/d;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v1, p0, Lcom/huawei/hwCloudJs/support/b/c;->a:Ljava/util/List;

    monitor-enter v1

    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/support/b/c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwCloudJs/support/b/b;

    invoke-interface {v4, p1}, Lcom/huawei/hwCloudJs/support/b/b;->onReceive(Lcom/huawei/hwCloudJs/support/b/d;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/support/b/c;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v1

    throw v5

    :goto_1
    return-void
.end method

.method public b(Lcom/huawei/hwCloudJs/support/b/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwCloudJs/support/b/b<TT;>;)V"
        }
    .end annotation

    iget-object v1, p0, Lcom/huawei/hwCloudJs/support/b/c;->a:Ljava/util/List;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/support/b/c;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method
