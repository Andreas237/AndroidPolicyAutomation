.class Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 843
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 846
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FeatureBroadcastRecever"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 847
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 848
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FeatureBroadcastRecever is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 849
    return-void

    .line 851
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 852
    const-string v0, "HEALTH_ACTION_DISMISSED_GROUP_SUCCESS"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 853
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->k(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 854
    :cond_1
    const-string v0, "HEALTH_ACTION_NOTIFY_GROUP_ACT_REFRESH_DATA"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 855
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->n(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b$2;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 863
    :cond_2
    :goto_0
    return-void
.end method
