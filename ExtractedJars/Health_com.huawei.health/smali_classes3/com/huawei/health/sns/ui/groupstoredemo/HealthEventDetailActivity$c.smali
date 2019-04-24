.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)V
    .locals 0

    .line 939
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$c;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 942
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 943
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter GroupEventDetailReveiver intent == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 944
    return-void

    .line 946
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 947
    if-eqz v4, :cond_1

    .line 948
    const-string v0, "ACTION_MODIFY_GROUP_ACTIVITY_SUCC"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 949
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$c;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->h(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->c(Z)V

    .line 952
    :cond_1
    return-void
.end method
