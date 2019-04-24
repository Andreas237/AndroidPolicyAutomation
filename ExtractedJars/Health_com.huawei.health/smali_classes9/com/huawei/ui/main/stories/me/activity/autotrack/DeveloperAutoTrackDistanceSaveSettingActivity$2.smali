.class Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)V
    .locals 0

    .line 245
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->f(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    .line 251
    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_autotrack__developer_error_number:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 250
    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 253
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 255
    :cond_0
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    .line 257
    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_autotrack__developer_must_finish_autotrack:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 256
    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 258
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 261
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->p(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;-><init>(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 275
    :goto_0
    return-void
.end method
