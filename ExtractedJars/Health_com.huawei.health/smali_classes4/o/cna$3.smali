.class Lo/cna$3;
.super Lo/cmu;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cna;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/cmu<Lo/aav;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/cna;


# direct methods
.method constructor <init>(Lo/cna;Landroid/content/Context;Landroid/content/Intent;Z)V
    .locals 0

    .line 95
    iput-object p1, p0, Lo/cna$3;->d:Lo/cna;

    invoke-direct {p0, p2, p3, p4}, Lo/cmu;-><init>(Landroid/content/Context;Landroid/content/Intent;Z)V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/IBinder;)Lo/aav;
    .locals 1

    .line 98
    invoke-static {p1}, Lo/aav$a;->e(Landroid/os/IBinder;)Lo/aav;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 2

    .line 125
    invoke-static {}, Lo/cna;->h()Lo/cmo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 126
    invoke-static {}, Lo/cna;->h()Lo/cmo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cmo;->e(Ljava/lang/Object;)V

    .line 128
    :cond_0
    return-void
.end method

.method public synthetic b(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 1

    .line 95
    invoke-virtual {p0, p1}, Lo/cna$3;->a(Landroid/os/IBinder;)Lo/aav;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 2

    .line 117
    iget-object v0, p0, Lo/cna$3;->d:Lo/cna;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cna;->b(Lo/cna;Z)Z

    .line 118
    invoke-static {}, Lo/cna;->h()Lo/cmo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 119
    invoke-static {}, Lo/cna;->h()Lo/cmo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cmo;->b(Ljava/lang/Object;)V

    .line 121
    :cond_0
    return-void
.end method

.method public c()V
    .locals 7

    .line 103
    iget-object v0, p0, Lo/cna$3;->d:Lo/cna;

    invoke-static {v0}, Lo/cna;->e(Lo/cna;)Ljava/util/List;

    move-result-object v3

    monitor-enter v3

    .line 104
    const/4 v4, 0x0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lo/cna$3;->d:Lo/cna;

    invoke-static {v0}, Lo/cna;->e(Lo/cna;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 105
    iget-object v0, p0, Lo/cna$3;->d:Lo/cna;

    iget-object v1, p0, Lo/cna$3;->d:Lo/cna;

    invoke-static {v1}, Lo/cna;->e(Lo/cna;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cnf;

    invoke-static {v0, v1}, Lo/cna;->c(Lo/cna;Lo/cnf;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 107
    :cond_0
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    .line 108
    :goto_1
    iget-object v0, p0, Lo/cna$3;->d:Lo/cna;

    invoke-static {v0}, Lo/cna;->c(Lo/cna;)Ljava/util/List;

    move-result-object v3

    monitor-enter v3

    .line 109
    const/4 v4, 0x0

    :goto_2
    :try_start_1
    iget-object v0, p0, Lo/cna$3;->d:Lo/cna;

    invoke-static {v0}, Lo/cna;->c(Lo/cna;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 110
    iget-object v0, p0, Lo/cna$3;->d:Lo/cna;

    iget-object v1, p0, Lo/cna$3;->d:Lo/cna;

    invoke-static {v1}, Lo/cna;->c(Lo/cna;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cna$d;

    iget-object v1, v1, Lo/cna$d;->d:Lo/cnh;

    iget-object v2, p0, Lo/cna$3;->d:Lo/cna;

    invoke-static {v2}, Lo/cna;->c(Lo/cna;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/cna$d;

    iget v2, v2, Lo/cna$d;->b:I

    invoke-static {v0, v1, v2}, Lo/cna;->e(Lo/cna;Lo/cnh;I)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 109
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 112
    :cond_1
    monitor-exit v3

    goto :goto_3

    :catchall_1
    move-exception v6

    monitor-exit v3

    throw v6

    .line 113
    :goto_3
    return-void
.end method

.method public d()V
    .locals 2

    .line 132
    iget-object v0, p0, Lo/cna$3;->d:Lo/cna;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cna;->b(Lo/cna;Z)Z

    .line 133
    invoke-static {}, Lo/cna;->h()Lo/cmo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 134
    invoke-static {}, Lo/cna;->h()Lo/cmo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cmo;->a(Ljava/lang/Object;)V

    .line 136
    :cond_0
    return-void
.end method
