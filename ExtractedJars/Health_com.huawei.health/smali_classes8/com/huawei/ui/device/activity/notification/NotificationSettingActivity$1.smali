.class Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V
    .locals 0

    .line 233
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$1;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 237
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancel click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$1;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->e(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/widget/Switch;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 240
    return-void
.end method
