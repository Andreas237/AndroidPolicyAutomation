.class Lcom/huawei/ui/device/activity/notification/NotificationTipActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/notification/NotificationTipActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/notification/NotificationTipActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationTipActivity;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationTipActivity$1;->d:Lcom/huawei/ui/device/activity/notification/NotificationTipActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 25
    const-string v0, "fuck"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onclick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationTipActivity$1;->d:Lcom/huawei/ui/device/activity/notification/NotificationTipActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationTipActivity;->finish()V

    .line 27
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationTipActivity$1;->d:Lcom/huawei/ui/device/activity/notification/NotificationTipActivity;

    sget v1, Lcom/huawei/ui/device/R$anim;->notification_tip_close:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/huawei/ui/device/activity/notification/NotificationTipActivity;->overridePendingTransition(II)V

    .line 28
    return-void
.end method
