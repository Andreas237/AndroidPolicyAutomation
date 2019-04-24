.class public Lcom/huawei/health/receiver/LoginStatusReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 22
    const-string v0, "Login_LoginStatusReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive the static BroadcastReceiver , logout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    invoke-static {}, Lo/cbi;->b()Lo/cbi;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/cbi;->c(Landroid/content/Context;Landroid/content/Intent;)V

    .line 24
    return-void
.end method
