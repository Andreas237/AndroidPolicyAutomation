.class Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V
    .locals 0

    .line 684
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$5;->e:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 686
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$5;->e:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/enu;

    move-result-object v0

    iget v0, v0, Lo/enu;->c:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$5;->e:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/enu;

    const/4 v1, 0x0

    if-ne v0, v1, :cond_0

    .line 687
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mUpdateInteractors.STATUS_INITIAL "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 689
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 690
    const-string v0, "action_app_check_new_version_state"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 691
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$5;->e:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$5;->e:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->a(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Landroid/content/BroadcastReceiver;

    move-result-object v1

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 692
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$5;->e:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->f(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    .line 694
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$5;->e:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/enu;

    move-result-object v0

    iget v0, v0, Lo/enu;->c:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$5;->e:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/enu;

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 695
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mUpdateInteractors.STATUS_PULL_CHANGE_LOG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 697
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$5;->e:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->i(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    .line 699
    :cond_1
    return-void
.end method
