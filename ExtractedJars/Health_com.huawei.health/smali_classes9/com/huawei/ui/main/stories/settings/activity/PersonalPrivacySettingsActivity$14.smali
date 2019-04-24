.class Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V
    .locals 0

    .line 328
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$14;->b:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 331
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$14;->b:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->a(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.weight_auto_update_status"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v2

    .line 332
    if-eqz v2, :cond_0

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$14;->b:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v3

    .line 334
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$14;->b:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 336
    :cond_0
    return-void
.end method
