.class Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V
    .locals 0

    .line 617
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$c;->b:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 620
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FeatureBroadcastRecever"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 621
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 622
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FeatureBroadcastRecever is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 623
    return-void

    .line 625
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 627
    const-string v0, "HEALTH_ACTION_TRANSFER_GROUP_SUCCESS"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 629
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v5

    .line 630
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 631
    const-string v0, "HEALTH_ACTION_NOTIFY_GROUP_ACT_REFRESH_DATA"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 632
    invoke-virtual {v5, v6}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 633
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$c;->b:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->finish()V

    .line 635
    :cond_1
    return-void
.end method
