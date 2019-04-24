.class public Lcom/huawei/ui/device/activity/notification/NotificationTipActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 19
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 20
    sget v0, Lcom/huawei/ui/device/R$layout;->notification_tip_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationTipActivity;->setContentView(I)V

    .line 21
    sget v0, Lcom/huawei/ui/device/R$id;->notification_tip:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 22
    new-instance v0, Lcom/huawei/ui/device/activity/notification/NotificationTipActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/notification/NotificationTipActivity$1;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationTipActivity;)V

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 30
    return-void
.end method
