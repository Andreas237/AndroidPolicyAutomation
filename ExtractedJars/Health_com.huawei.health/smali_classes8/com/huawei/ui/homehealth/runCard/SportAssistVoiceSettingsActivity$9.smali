.class Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)V
    .locals 0

    .line 241
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$9;->e:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 4

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$9;->e:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-static {v0, p2}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->h(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;Z)Z

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$9;->e:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->l(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Lo/emu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$9;->e:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->p(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 246
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$9;->e:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    const-string v1, "voice_heart_rate"

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$9;->e:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-static {v2}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->p(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->a(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;Ljava/lang/String;Z)V

    .line 247
    const-string v0, "Track_SportAssistVoiceSettingsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mVoiceHeartRateEnable is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$9;->e:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-static {v2}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->p(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    return-void
.end method
