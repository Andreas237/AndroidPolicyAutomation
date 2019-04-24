.class public abstract Lo/eki;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eki$e;,
        Lo/eki$b;
    }
.end annotation


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eki$b;>;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eki;->a:Landroid/os/Handler;

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eki;->b:Ljava/util/List;

    .line 18
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eki;->e:Z

    .line 19
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eki;->d:Z

    .line 22
    iput-object p1, p0, Lo/eki;->a:Landroid/os/Handler;

    .line 23
    return-void
.end method


# virtual methods
.method protected abstract c()V
.end method

.method public c(Lo/eki$b;)V
    .locals 3

    .line 51
    move-object v1, p0

    monitor-enter v1

    .line 52
    :try_start_0
    iget-boolean v0, p0, Lo/eki;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 53
    monitor-exit v1

    return-void

    .line 55
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/eki;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 56
    monitor-exit v1

    return-void

    .line 58
    :cond_1
    :try_start_2
    iget-object v0, p0, Lo/eki;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 59
    iget-object v0, p0, Lo/eki;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 61
    invoke-virtual {p0}, Lo/eki;->c()V

    .line 62
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eki;->d:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    :cond_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 65
    :goto_0
    return-void
.end method

.method public d()V
    .locals 6

    .line 72
    move-object v2, p0

    monitor-enter v2

    .line 73
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lo/eki;->e:Z

    .line 74
    iget-object v0, p0, Lo/eki;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eki$b;

    .line 75
    instance-of v0, v4, Lo/eki$e;

    if-eqz v0, :cond_0

    .line 76
    goto :goto_0

    .line 78
    :cond_0
    iget-object v0, p0, Lo/eki;->a:Landroid/os/Handler;

    new-instance v1, Lo/eki$3;

    invoke-direct {v1, p0, v4}, Lo/eki$3;-><init>(Lo/eki;Lo/eki$b;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    goto :goto_0

    .line 85
    :cond_1
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 86
    :goto_1
    return-void
.end method

.method public d(Lo/eki$b;)V
    .locals 5

    .line 26
    move-object v3, p0

    monitor-enter v3

    .line 27
    :try_start_0
    iget-boolean v0, p0, Lo/eki;->e:Z

    if-eqz v0, :cond_0

    .line 28
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mExecuting not allow add action!!!:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 30
    :cond_0
    iget-object v0, p0, Lo/eki;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 33
    :goto_0
    return-void
.end method
