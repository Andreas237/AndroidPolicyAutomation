.class Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$8;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V
    .locals 0

    .line 658
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$8;->a:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 662
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 663
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAPPInstalledReceiver: intent = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 664
    return-void

    .line 666
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 667
    const-string v0, "android.intent.action.PACKAGE_ADDED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "android.intent.action.PACKAGE_REMOVED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 668
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$8;->a:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->e:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$b;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$8;->a:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$b;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 670
    :cond_2
    return-void
.end method
