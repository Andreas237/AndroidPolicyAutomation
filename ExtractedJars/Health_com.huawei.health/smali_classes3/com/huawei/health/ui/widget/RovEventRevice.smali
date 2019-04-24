.class public Lcom/huawei/health/ui/widget/RovEventRevice;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 14
    if-eqz p2, :cond_0

    .line 15
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    const-string v0, "com.huawei.systemmamanger.action.KILL_ROGAPP_END"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18
    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget;->b(Landroid/content/Context;)V

    .line 22
    :cond_0
    return-void
.end method
