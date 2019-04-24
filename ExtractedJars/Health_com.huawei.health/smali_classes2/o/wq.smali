.class public Lo/wq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final b:Ljava/lang/Object;

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/wq;->b:Ljava/lang/Object;

    .line 25
    iput-object p1, p0, Lo/wq;->d:Landroid/content/Context;

    .line 26
    return-void
.end method


# virtual methods
.method public a(ILo/wo;)V
    .locals 6

    .line 90
    const-string v0, "PSocial_SocialDownloadManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "--modifyRankListSwitch--"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    iget-object v4, p0, Lo/wq;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 92
    :try_start_0
    iget-object v0, p0, Lo/wq;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/wh;->b(Landroid/content/Context;)Lo/wj;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/wj;->d(ILo/wo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 94
    :goto_0
    return-void
.end method

.method public a(Ljava/util/ArrayList;Lo/wo;Landroid/os/Bundle;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;Lo/wo;Landroid/os/Bundle;)V"
        }
    .end annotation

    .line 83
    const-string v0, "PSocial_SocialDownloadManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "--getRankDetailsBytimeStamp--"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    iget-object v4, p0, Lo/wq;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 85
    :try_start_0
    iget-object v0, p0, Lo/wq;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/wh;->b(Landroid/content/Context;)Lo/wj;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lo/wj;->b(Ljava/util/ArrayList;Lo/wo;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 87
    :goto_0
    return-void
.end method

.method public b(JIILo/wo;)V
    .locals 8

    .line 77
    const-string v0, "PSocial_SocialDownloadManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "--updateLikeDetails--"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    iget-object v6, p0, Lo/wq;->b:Ljava/lang/Object;

    monitor-enter v6

    .line 79
    :try_start_0
    iget-object v0, p0, Lo/wq;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/wh;->b(Landroid/content/Context;)Lo/wj;

    move-result-object v0

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lo/wj;->a(JIILo/wo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 81
    :goto_0
    return-void
.end method

.method public c(Ljava/util/ArrayList;Lo/wo;Landroid/os/Bundle;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;Lo/wo;Landroid/os/Bundle;)V"
        }
    .end annotation

    .line 49
    const-string v0, "PSocial_SocialDownloadManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "--getUserProfileByHuIds--"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    iget-object v4, p0, Lo/wq;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 51
    :try_start_0
    iget-object v0, p0, Lo/wq;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/wh;->b(Landroid/content/Context;)Lo/wj;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lo/wj;->c(Ljava/util/ArrayList;Lo/wo;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 53
    :goto_0
    return-void
.end method

.method public d(Lo/wo;)V
    .locals 6

    .line 97
    const-string v0, "PSocial_SocialDownloadManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "--getRankListSwitch--"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    iget-object v4, p0, Lo/wq;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 99
    :try_start_0
    iget-object v0, p0, Lo/wq;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/wh;->b(Landroid/content/Context;)Lo/wj;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/wj;->b(Lo/wo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 101
    :goto_0
    return-void
.end method
