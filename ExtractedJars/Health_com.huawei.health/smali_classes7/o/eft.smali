.class public Lo/eft;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<Ljava/lang/Runnable;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/eft;->a:Ljava/util/LinkedList;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 31
    iget-object v1, p0, Lo/eft;->a:Ljava/util/LinkedList;

    monitor-enter v1

    .line 32
    :try_start_0
    iget-object v0, p0, Lo/eft;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 34
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 3

    .line 25
    iget-object v1, p0, Lo/eft;->a:Ljava/util/LinkedList;

    monitor-enter v1

    .line 26
    :try_start_0
    iget-object v0, p0, Lo/eft;->a:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 28
    :goto_0
    return-void
.end method

.method public b()V
    .locals 4

    .line 13
    iget-object v1, p0, Lo/eft;->a:Ljava/util/LinkedList;

    monitor-enter v1

    .line 14
    :goto_0
    :try_start_0
    iget-object v0, p0, Lo/eft;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 16
    :try_start_1
    iget-object v0, p0, Lo/eft;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    goto :goto_0

    .line 17
    :catch_0
    move-exception v2

    .line 18
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 19
    goto :goto_0

    .line 21
    :cond_0
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    .line 22
    :goto_1
    return-void
.end method

.method public e()V
    .locals 1

    .line 37
    invoke-virtual {p0}, Lo/eft;->a()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eft;->a:Ljava/util/LinkedList;

    .line 39
    return-void
.end method
