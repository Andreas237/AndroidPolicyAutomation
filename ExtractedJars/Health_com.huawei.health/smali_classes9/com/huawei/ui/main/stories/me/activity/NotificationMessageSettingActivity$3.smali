.class Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;)V
    .locals 0

    .line 287
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;)Lo/emu;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 291
    return-void
.end method
