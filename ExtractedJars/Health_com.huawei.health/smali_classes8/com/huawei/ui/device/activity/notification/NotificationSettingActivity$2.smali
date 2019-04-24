.class Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$2;
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

    .line 221
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$2;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 225
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closed click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$2;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Lo/eoa;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eoa;->e(I)V

    .line 228
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    invoke-virtual {v0}, Lo/dip;->b()V

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$2;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->b(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V

    .line 231
    return-void
.end method
