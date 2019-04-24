.class public Lcom/huawei/health/sns/logic/push/PushDealReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 22
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 24
    return-void

    .line 26
    :cond_0
    invoke-static {}, Lo/bch;->a()Lo/bch;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bch;->b(Landroid/content/Context;)V

    .line 29
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/ave;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 30
    return-void
.end method
