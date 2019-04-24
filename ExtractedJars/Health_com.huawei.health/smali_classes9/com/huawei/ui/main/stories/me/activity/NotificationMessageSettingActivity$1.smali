.class Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;)V
    .locals 0

    .line 305
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$1;->d:Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 308
    new-instance v3, Landroid/content/Intent;

    const-string v0, "com.huawei.health.action.unbindNotification"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$1;->d:Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v3, v1}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$1;->d:Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->d(Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;)Lo/cmj;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$1;->d:Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->d(Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;)Lo/cmj;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/cmj;->e(ZLo/cmo;)V

    .line 313
    :cond_0
    return-void
.end method
