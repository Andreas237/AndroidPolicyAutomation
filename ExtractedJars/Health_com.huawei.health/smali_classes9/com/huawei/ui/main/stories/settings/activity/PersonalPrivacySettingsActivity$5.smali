.class Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V
    .locals 0

    .line 607
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$5;->c:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 610
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$5;->c:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b()V

    .line 611
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 612
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$5;->c:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 613
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$5;->c:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 615
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$5;->c:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_music_management_operation_success:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 616
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResponse clearPersonalPrivacySettingProfileOrFitness success err_code "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 617
    goto :goto_0

    .line 618
    :cond_0
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResponse clearPersonalPrivacySettingProfileOrFitness failure err_code "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$5;->c:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_music_management_operation_failed:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 621
    :goto_0
    return-void
.end method
