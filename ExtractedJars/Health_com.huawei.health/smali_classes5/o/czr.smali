.class public Lo/czr;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/czr$d;
    }
.end annotation


# instance fields
.field private c:Landroid/os/Handler;

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lo/czr;->d:Landroid/content/Context;

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lo/czr;->c:Landroid/os/Handler;

    .line 30
    iput-object p1, p0, Lo/czr;->d:Landroid/content/Context;

    .line 31
    return-void
.end method


# virtual methods
.method public b()V
    .locals 5

    .line 46
    const-string v0, "HWDataRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshToken begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 49
    const-string v0, "com.huawei.plugin.account.refresh.accessToken"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 50
    iget-object v0, p0, Lo/czr;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 51
    iget-object v0, p0, Lo/czr;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 53
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/util/Map;IILo/cyy;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;IILo/cyy;)V"
        }
    .end annotation

    .line 64
    const-string v0, "HWDataRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "call(),service="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    new-instance v9, Lo/czq;

    iget-object v0, p0, Lo/czr;->d:Landroid/content/Context;

    invoke-direct {v9, v0}, Lo/czq;-><init>(Landroid/content/Context;)V

    .line 66
    iget-object v0, p0, Lo/czr;->c:Landroid/os/Handler;

    new-instance v1, Lo/czr$2;

    move-object v2, p0

    move-object v3, v9

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    move v7, p4

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, Lo/czr$2;-><init>(Lo/czr;Lo/czq;Ljava/lang/String;Ljava/util/Map;IILo/cyy;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 78
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Lo/cyy;)V"
        }
    .end annotation

    .line 58
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    invoke-virtual/range {v0 .. v5}, Lo/czr;->b(Ljava/lang/String;Ljava/util/Map;IILo/cyy;)V

    .line 59
    return-void
.end method

.method public e()V
    .locals 3

    .line 34
    new-instance v2, Landroid/os/HandlerThread;

    const-string v0, "HwCloudManager"

    invoke-direct {v2, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 35
    invoke-virtual {v2}, Landroid/os/HandlerThread;->start()V

    .line 36
    new-instance v0, Lo/czr$d;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/czr$d;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/czr;->c:Landroid/os/Handler;

    .line 37
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/util/Map;IILo/cyy;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;IILo/cyy;)V"
        }
    .end annotation

    .line 89
    const-string v0, "HWDataRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wifiCall(),service="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    new-instance v9, Lo/czq;

    iget-object v0, p0, Lo/czr;->d:Landroid/content/Context;

    invoke-direct {v9, v0}, Lo/czq;-><init>(Landroid/content/Context;)V

    .line 91
    iget-object v0, p0, Lo/czr;->c:Landroid/os/Handler;

    new-instance v1, Lo/czr$3;

    move-object v2, p0

    move-object v3, v9

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    move v7, p4

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, Lo/czr$3;-><init>(Lo/czr;Lo/czq;Ljava/lang/String;Ljava/util/Map;IILo/cyy;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 110
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/util/Map;Lo/cyy;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Lo/cyy;)V"
        }
    .end annotation

    .line 83
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    invoke-virtual/range {v0 .. v5}, Lo/czr;->e(Ljava/lang/String;Ljava/util/Map;IILo/cyy;)V

    .line 84
    return-void
.end method
