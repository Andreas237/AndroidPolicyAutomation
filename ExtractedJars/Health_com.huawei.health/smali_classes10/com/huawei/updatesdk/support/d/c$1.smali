.class final Lcom/huawei/updatesdk/support/d/c$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/updatesdk/support/d/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/updatesdk/support/d/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/updatesdk/support/d/b;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/updatesdk/support/d/c$1;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(ILcom/huawei/updatesdk/sdk/service/secure/a;)V
    .locals 5

    iget-object v1, p0, Lcom/huawei/updatesdk/support/d/c$1;->a:Ljava/util/List;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/updatesdk/support/d/c$1;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/updatesdk/support/d/b;

    invoke-interface {v3, p1, p2}, Lcom/huawei/updatesdk/support/d/b;->a(ILcom/huawei/updatesdk/sdk/service/secure/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    :goto_1
    return-void
.end method

.method public a(Lcom/huawei/updatesdk/support/d/b;)V
    .locals 5

    iget-object v2, p0, Lcom/huawei/updatesdk/support/d/c$1;->a:Ljava/util/List;

    monitor-enter v2

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    monitor-exit v2

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/updatesdk/support/d/c$1;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    :try_start_1
    iget-object v0, p0, Lcom/huawei/updatesdk/support/d/c$1;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "InstallObserverManager"

    const-string v1, "registerObserver UnsupportedOperationException"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v0, "InstallObserverManager"

    const-string v1, "registerObserver ClassCastException"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_2
    move-exception v3

    const-string v0, "InstallObserverManager"

    const-string v1, "registerObserver IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    :goto_1
    return-void
.end method

.method public b(Lcom/huawei/updatesdk/support/d/b;)V
    .locals 5

    iget-object v2, p0, Lcom/huawei/updatesdk/support/d/c$1;->a:Ljava/util/List;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/updatesdk/support/d/c$1;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "InstallObserverManager"

    const-string v1, "unRegisterObserver UnsupportedOperationException"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    :goto_1
    return-void
.end method
