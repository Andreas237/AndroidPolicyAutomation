.class Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b(Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

.field final synthetic e:Ljava/lang/Boolean;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Ljava/lang/Boolean;)V
    .locals 0

    .line 344
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$11;->a:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$11;->e:Ljava/lang/Boolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$11;->e:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "1"

    goto :goto_0

    :cond_0
    const-string v1, "0"

    .line 348
    :goto_0
    new-instance v2, Lcom/huawei/hihealth/HiUserPreference;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiUserPreference;-><init>()V

    .line 349
    const-string v0, "custom.weight_auto_update_status"

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserPreference;->setKey(Ljava/lang/String;)V

    .line 350
    invoke-virtual {v2, v1}, Lcom/huawei/hihealth/HiUserPreference;->setValue(Ljava/lang/String;)V

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$11;->a:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->a(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-interface {v0, v2}, Lo/clt;->e(Lcom/huawei/hihealth/HiUserPreference;)Z

    .line 352
    return-void
.end method
