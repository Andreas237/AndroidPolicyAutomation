.class Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity$4;->b:Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 171
    const-string v0, "NotificationOVPhoneActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "continue click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity$4;->b:Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->e(Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.ui.device.activity.notification.NotificationOpenActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 174
    const-string v0, "isFromWear"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity$4;->b:Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->d(Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;)Z

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 175
    const-string v0, "device_id"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity$4;->b:Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->b(Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity$4;->b:Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->startActivity(Landroid/content/Intent;)V

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity$4;->b:Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->finish()V

    .line 179
    return-void
.end method
