.class Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 223
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    .line 225
    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_autotrack__developer_must_finish_autotrack:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 224
    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 226
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 229
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Lo/cbz;

    move-result-object v0

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Lo/cbz;->a(I)V

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Lo/cbz;

    move-result-object v0

    const/16 v1, 0x258

    invoke-virtual {v0, v1}, Lo/cbz;->e(I)V

    .line 231
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Lo/cbz;

    move-result-object v0

    const/high16 v1, 0x447a0000    # 1000.0f

    invoke-virtual {v0, v1}, Lo/cbz;->d(F)V

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Lo/cbz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbz;->e(Landroid/content/Context;)V

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->h(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)V

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->i(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)V

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->g(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Lo/cbz;

    move-result-object v1

    invoke-virtual {v1}, Lo/cbz;->c()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;Z)V

    .line 237
    const-string v0, "Track_DeveloperAutoTrackDistanceSaveSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RecoveryAutoTrackSetting "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    :goto_0
    return-void
.end method
