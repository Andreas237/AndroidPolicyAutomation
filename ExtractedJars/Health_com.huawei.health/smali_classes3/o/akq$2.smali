.class Lo/akq$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ceu;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/akq;


# direct methods
.method constructor <init>(Lo/akq;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lo/akq$2;->e:Lo/akq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 7

    .line 68
    invoke-static {}, Lo/akq;->e()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 69
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Bundle sportInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    iget-object v1, p0, Lo/akq$2;->e:Lo/akq;

    const-string v2, "origintarget"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Lo/akq;->c(Lo/akq;I)I

    move-result v1

    invoke-static {v0, v1}, Lo/akq;->d(Lo/akq;I)I

    .line 72
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    const-string v1, "sportType"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lo/akq;->e(Lo/akq;I)I

    .line 73
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    const-string v1, "sportState"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lo/akq;->b(Lo/akq;I)I

    .line 75
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v0}, Lo/akq;->e(Lo/akq;)I

    move-result v0

    iget-object v1, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v1}, Lo/akq;->b(Lo/akq;)I

    move-result v1

    if-eq v0, v1, :cond_6

    .line 76
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "------------------Before----------------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "reportTrackState is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v3}, Lo/akq;->b(Lo/akq;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "preTrackState is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v3}, Lo/akq;->a(Lo/akq;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "curTrackState is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v3}, Lo/akq;->e(Lo/akq;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    invoke-virtual {v0}, Lo/akv;->f()V

    .line 81
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v1

    invoke-virtual {v1}, Lo/akv;->d()Z

    move-result v1

    invoke-static {v0, v1}, Lo/akq;->a(Lo/akq;Z)Z

    .line 82
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v1

    invoke-virtual {v1}, Lo/akv;->c()Z

    move-result v1

    invoke-static {v0, v1}, Lo/akq;->b(Lo/akq;Z)Z

    .line 83
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v1

    invoke-virtual {v1}, Lo/akv;->h()Z

    move-result v1

    invoke-static {v0, v1}, Lo/akq;->d(Lo/akq;Z)Z

    .line 84
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isNewLinkStrategy:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v3}, Lo/akq;->c(Lo/akq;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  isOldLinkStrategy:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v3}, Lo/akq;->d(Lo/akq;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  isSupportHeartReport:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/akq$2;->e:Lo/akq;

    .line 85
    invoke-static {v3}, Lo/akq;->k(Lo/akq;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 84
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v0}, Lo/akq;->b(Lo/akq;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 87
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v0}, Lo/akq;->e(Lo/akq;)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    .line 88
    invoke-static {v0}, Lo/akq;->e(Lo/akq;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    .line 89
    :goto_0
    if-eqz v5, :cond_2

    .line 90
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/akv;->b(Z)V

    .line 91
    invoke-static {}, Lo/yy;->b()Lo/yy;

    move-result-object v0

    invoke-virtual {v0}, Lo/yy;->c()V

    .line 92
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v0}, Lo/akq;->h(Lo/akq;)V

    goto :goto_1

    .line 94
    :cond_2
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v0}, Lo/akq;->g(Lo/akq;)V

    .line 96
    :goto_1
    goto :goto_2

    :cond_3
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v0}, Lo/akq;->b(Lo/akq;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 97
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v0}, Lo/akq;->f(Lo/akq;)V

    goto :goto_2

    .line 99
    :cond_4
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v0}, Lo/akq;->b(Lo/akq;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 100
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v0}, Lo/akq;->i(Lo/akq;)V

    .line 103
    :cond_5
    :goto_2
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "------------------After----------------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    iget-object v1, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v1}, Lo/akq;->e(Lo/akq;)I

    move-result v1

    invoke-static {v0, v1}, Lo/akq;->a(Lo/akq;I)I

    .line 105
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    iget-object v1, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v1}, Lo/akq;->b(Lo/akq;)I

    move-result v1

    invoke-static {v0, v1}, Lo/akq;->g(Lo/akq;I)I

    .line 106
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/akq;->e(Lo/akq;Z)Z

    .line 107
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "preTrackState is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v3}, Lo/akq;->a(Lo/akq;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "curTrackState is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v3}, Lo/akq;->e(Lo/akq;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    :cond_6
    iget-object v0, p0, Lo/akq$2;->e:Lo/akq;

    invoke-static {v0, p1}, Lo/akq;->a(Lo/akq;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    monitor-exit v4

    goto :goto_3

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 114
    :goto_3
    return-void
.end method

.method public d(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V
    .locals 0

    .line 119
    return-void
.end method
