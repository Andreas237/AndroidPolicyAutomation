.class Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$5;
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
.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;)V
    .locals 0

    .line 315
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 318
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;)Lo/emu;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 319
    return-void
.end method
