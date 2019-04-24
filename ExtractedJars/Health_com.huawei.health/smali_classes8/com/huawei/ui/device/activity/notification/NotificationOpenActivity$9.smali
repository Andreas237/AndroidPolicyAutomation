.class Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V
    .locals 0

    .line 934
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$9;->b:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 937
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 938
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$9;->b:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->e(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.ui.homewear21.home.WearHomeActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 939
    const-string v0, "isFromWear"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$9;->b:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->r(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Z

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 940
    const-string v0, "device_id"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$9;->b:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->q(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 941
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$9;->b:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->startActivity(Landroid/content/Intent;)V

    .line 942
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$9;->b:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->s(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 943
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$9;->b:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->finish()V

    .line 944
    return-void
.end method
