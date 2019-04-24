.class Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$4;
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
.field final synthetic b:Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;)V
    .locals 0

    .line 281
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->d(Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;)Lo/cmj;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/cmj;->e(ZLo/cmo;)V

    .line 285
    return-void
.end method
