.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$e;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;)V
    .locals 0

    .line 375
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$e;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 378
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 379
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter GroupActListReceiver intent == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    return-void

    .line 382
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 383
    if-eqz v4, :cond_1

    .line 384
    const-string v0, "ACTION_MODIFY_GROUP_ACTIVITY_SUCC"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 385
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$e;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;)V

    .line 388
    :cond_1
    return-void
.end method
