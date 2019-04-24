.class public abstract Lo/fbs;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fbs$d;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fbs$d;>;"
        }
    .end annotation
.end field

.field private c:Landroid/os/Handler;

.field private d:Lo/fbs$d;

.field private e:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<Lo/fbs$d;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fbs;->c:Landroid/os/Handler;

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fbs;->b:Ljava/util/List;

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fbs;->e:Ljava/util/Iterator;

    .line 20
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fbs;->a:Z

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fbs;->d:Lo/fbs$d;

    .line 25
    iput-object p1, p0, Lo/fbs;->c:Landroid/os/Handler;

    .line 26
    return-void
.end method

.method private d()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<Lo/fbs$d;>;"
        }
    .end annotation

    .line 106
    move-object v1, p0

    monitor-enter v1

    .line 107
    :try_start_0
    iget-object v0, p0, Lo/fbs;->e:Ljava/util/Iterator;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 108
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 37
    move-object v2, p0

    monitor-enter v2

    .line 38
    :try_start_0
    iget-object v0, p0, Lo/fbs;->d:Lo/fbs$d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 40
    monitor-exit v2

    return-void

    .line 42
    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lo/fbs;->a:Z

    .line 43
    iget-object v0, p0, Lo/fbs;->d:Lo/fbs$d;

    invoke-interface {v0}, Lo/fbs$d;->a()I

    move-result v3

    .line 44
    iget-object v0, p0, Lo/fbs;->c:Landroid/os/Handler;

    new-instance v1, Lo/fbs$3;

    invoke-direct {v1, p0, v3}, Lo/fbs$3;-><init>(Lo/fbs;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 51
    :goto_0
    return-void
.end method

.method public b()V
    .locals 3

    .line 99
    move-object v1, p0

    monitor-enter v1

    .line 100
    :try_start_0
    iget-object v0, p0, Lo/fbs;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lo/fbs;->e:Ljava/util/Iterator;

    .line 101
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fbs;->e(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 103
    :goto_0
    return-void
.end method

.method protected abstract b(Ljava/util/Map;)V
.end method

.method public d(Lo/fbs$d;)V
    .locals 1

    .line 29
    iget-object v0, p0, Lo/fbs;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    return-void
.end method

.method protected abstract e(I)V
.end method

.method public e(Ljava/util/Map;)V
    .locals 6

    .line 70
    move-object v2, p0

    monitor-enter v2

    .line 71
    :try_start_0
    iget-boolean v0, p0, Lo/fbs;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 73
    monitor-exit v2

    return-void

    .line 75
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lo/fbs;->d()Ljava/util/Iterator;

    move-result-object v3

    .line 77
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 78
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fbs;->a:Z

    .line 79
    iget-object v0, p0, Lo/fbs;->c:Landroid/os/Handler;

    new-instance v1, Lo/fbs$5;

    invoke-direct {v1, p0, p1}, Lo/fbs$5;-><init>(Lo/fbs;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    monitor-exit v2

    return-void

    .line 87
    :cond_1
    :try_start_2
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fbs$d;

    .line 88
    iput-object v4, p0, Lo/fbs;->d:Lo/fbs$d;

    .line 89
    iget-object v0, p0, Lo/fbs;->c:Landroid/os/Handler;

    new-instance v1, Lo/fbs$4;

    invoke-direct {v1, p0, v4, p1}, Lo/fbs$4;-><init>(Lo/fbs;Lo/fbs$d;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 95
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 96
    :goto_0
    return-void
.end method
