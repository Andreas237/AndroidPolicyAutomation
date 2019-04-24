.class Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V
    .locals 0

    .line 899
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$7;->e:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 902
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 903
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$7;->e:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->e(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.ui.homewear21.home.WearHomeActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 904
    const-string v0, "isFromWear"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$7;->e:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->r(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Z

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 905
    const-string v0, "device_id"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$7;->e:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->q(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 906
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$7;->e:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->startActivity(Landroid/content/Intent;)V

    .line 907
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "open later click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 908
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$7;->e:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->finish()V

    .line 909
    return-void
.end method
