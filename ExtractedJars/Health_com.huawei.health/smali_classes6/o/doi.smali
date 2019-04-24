.class public abstract Lo/doi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/doi$b;,
        Lo/doi$a;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Landroid/os/Handler;

.field private c:Lo/doi$a;

.field private d:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<Lo/doi$a;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/doi$a;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doi;->b:Landroid/os/Handler;

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/doi;->e:Ljava/util/List;

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doi;->d:Ljava/util/Iterator;

    .line 24
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/doi;->a:Z

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doi;->c:Lo/doi$a;

    .line 29
    iput-object p1, p0, Lo/doi;->b:Landroid/os/Handler;

    .line 30
    return-void
.end method

.method private e()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<Lo/doi$a;>;"
        }
    .end annotation

    .line 110
    move-object v1, p0

    monitor-enter v1

    .line 111
    :try_start_0
    iget-object v0, p0, Lo/doi;->d:Ljava/util/Iterator;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 112
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method protected abstract a(I)V
.end method

.method protected abstract a(Ljava/util/Map;)V
.end method

.method public b()V
    .locals 3

    .line 103
    move-object v1, p0

    monitor-enter v1

    .line 104
    :try_start_0
    iget-object v0, p0, Lo/doi;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lo/doi;->d:Ljava/util/Iterator;

    .line 105
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/doi;->e(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 107
    :goto_0
    return-void
.end method

.method public d()V
    .locals 7

    .line 41
    move-object v4, p0

    monitor-enter v4

    .line 42
    :try_start_0
    iget-object v0, p0, Lo/doi;->c:Lo/doi$a;

    if-nez v0, :cond_0

    .line 43
    const-string v0, "AsyncSelectorSerialize"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postError when no Action executing,error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    monitor-exit v4

    return-void

    .line 46
    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lo/doi;->a:Z

    .line 47
    iget-object v0, p0, Lo/doi;->c:Lo/doi$a;

    invoke-interface {v0}, Lo/doi$a;->b()I

    move-result v5

    .line 48
    iget-object v0, p0, Lo/doi;->b:Landroid/os/Handler;

    new-instance v1, Lo/doi$5;

    invoke-direct {v1, p0, v5}, Lo/doi$5;-><init>(Lo/doi;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 55
    :goto_0
    return-void
.end method

.method public e(Ljava/util/Map;)V
    .locals 8

    .line 74
    move-object v4, p0

    monitor-enter v4

    .line 75
    :try_start_0
    iget-boolean v0, p0, Lo/doi;->a:Z

    if-eqz v0, :cond_0

    .line 76
    const-string v0, "AsyncSelectorSerialize"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AsyncSelectorSerialize success,why you call this"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    monitor-exit v4

    return-void

    .line 79
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lo/doi;->e()Ljava/util/Iterator;

    move-result-object v5

    .line 81
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 82
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/doi;->a:Z

    .line 83
    iget-object v0, p0, Lo/doi;->b:Landroid/os/Handler;

    new-instance v1, Lo/doi$1;

    invoke-direct {v1, p0, p1}, Lo/doi$1;-><init>(Lo/doi;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    monitor-exit v4

    return-void

    .line 91
    :cond_1
    :try_start_2
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/doi$a;

    .line 92
    iput-object v6, p0, Lo/doi;->c:Lo/doi$a;

    .line 93
    iget-object v0, p0, Lo/doi;->b:Landroid/os/Handler;

    new-instance v1, Lo/doi$2;

    invoke-direct {v1, p0, v6, p1}, Lo/doi$2;-><init>(Lo/doi;Lo/doi$a;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 99
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 100
    :goto_0
    return-void
.end method

.method public e(Lo/doi$a;)V
    .locals 1

    .line 33
    iget-object v0, p0, Lo/doi;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    return-void
.end method
