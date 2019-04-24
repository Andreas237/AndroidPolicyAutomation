.class public abstract Lo/ekh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ekh$a;,
        Lo/ekh$e;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ekh$e;>;"
        }
    .end annotation
.end field

.field private b:Lo/ekh$e;

.field private c:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<Lo/ekh$e;>;"
        }
    .end annotation
.end field

.field private d:Landroid/os/Handler;

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ekh;->d:Landroid/os/Handler;

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ekh;->a:Ljava/util/List;

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ekh;->c:Ljava/util/Iterator;

    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ekh;->e:Z

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ekh;->b:Lo/ekh$e;

    .line 28
    iput-object p1, p0, Lo/ekh;->d:Landroid/os/Handler;

    .line 29
    return-void
.end method

.method private a()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<Lo/ekh$e;>;"
        }
    .end annotation

    .line 109
    move-object v1, p0

    monitor-enter v1

    .line 110
    :try_start_0
    iget-object v0, p0, Lo/ekh;->c:Ljava/util/Iterator;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 111
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method protected abstract a(Ljava/util/Map;)V
.end method

.method public b()V
    .locals 7

    .line 40
    move-object v4, p0

    monitor-enter v4

    .line 41
    :try_start_0
    iget-object v0, p0, Lo/ekh;->b:Lo/ekh$e;

    if-nez v0, :cond_0

    .line 42
    const-string v0, "AsyncSelectorSerialize"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postError when no Action executing,error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    monitor-exit v4

    return-void

    .line 45
    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lo/ekh;->e:Z

    .line 46
    iget-object v0, p0, Lo/ekh;->b:Lo/ekh$e;

    invoke-interface {v0}, Lo/ekh$e;->a()I

    move-result v5

    .line 47
    iget-object v0, p0, Lo/ekh;->d:Landroid/os/Handler;

    new-instance v1, Lo/ekh$2;

    invoke-direct {v1, p0, v5}, Lo/ekh$2;-><init>(Lo/ekh;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 54
    :goto_0
    return-void
.end method

.method protected abstract b(I)V
.end method

.method public b(Lo/ekh$e;)V
    .locals 1

    .line 32
    iget-object v0, p0, Lo/ekh;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    return-void
.end method

.method public d()V
    .locals 3

    .line 102
    move-object v1, p0

    monitor-enter v1

    .line 103
    :try_start_0
    iget-object v0, p0, Lo/ekh;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lo/ekh;->c:Ljava/util/Iterator;

    .line 104
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ekh;->e(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 106
    :goto_0
    return-void
.end method

.method public e(Ljava/util/Map;)V
    .locals 8

    .line 73
    move-object v4, p0

    monitor-enter v4

    .line 74
    :try_start_0
    iget-boolean v0, p0, Lo/ekh;->e:Z

    if-eqz v0, :cond_0

    .line 75
    const-string v0, "AsyncSelectorSerialize"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AsyncSelectorSerialize success,why you call this"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    monitor-exit v4

    return-void

    .line 78
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lo/ekh;->a()Ljava/util/Iterator;

    move-result-object v5

    .line 80
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 81
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ekh;->e:Z

    .line 82
    iget-object v0, p0, Lo/ekh;->d:Landroid/os/Handler;

    new-instance v1, Lo/ekh$4;

    invoke-direct {v1, p0, p1}, Lo/ekh$4;-><init>(Lo/ekh;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    monitor-exit v4

    return-void

    .line 90
    :cond_1
    :try_start_2
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ekh$e;

    .line 91
    iput-object v6, p0, Lo/ekh;->b:Lo/ekh$e;

    .line 92
    iget-object v0, p0, Lo/ekh;->d:Landroid/os/Handler;

    new-instance v1, Lo/ekh$3;

    invoke-direct {v1, p0, v6, p1}, Lo/ekh$3;-><init>(Lo/ekh;Lo/ekh$e;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 98
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 99
    :goto_0
    return-void
.end method
