.class Lo/enp$2;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/enp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/enp;


# direct methods
.method constructor <init>(Lo/enp;)V
    .locals 0

    .line 488
    iput-object p1, p0, Lo/enp$2;->b:Lo/enp;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 491
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    const-string v0, "com.huawei.health.action.ACTION_BACKGROUND_DOWNLOAD_DEVICE"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 492
    iget-object v0, p0, Lo/enp$2;->b:Lo/enp;

    invoke-static {v0}, Lo/enp;->g(Lo/enp;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 494
    const-string v0, "BTAutoScanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download end , start show dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    iget-object v0, p0, Lo/enp$2;->b:Lo/enp;

    invoke-static {v0}, Lo/enp;->k(Lo/enp;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 497
    :cond_0
    iget-object v0, p0, Lo/enp$2;->b:Lo/enp;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/enp;->e(Lo/enp;Z)Z

    .line 499
    iget-object v0, p0, Lo/enp$2;->b:Lo/enp;

    const/16 v1, 0x14

    invoke-static {v0, v1}, Lo/enp;->e(Lo/enp;I)V

    .line 502
    :cond_1
    :goto_0
    return-void
.end method
