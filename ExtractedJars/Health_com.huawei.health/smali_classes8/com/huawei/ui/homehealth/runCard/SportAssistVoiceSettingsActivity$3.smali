.class Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$3;->a:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .line 130
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 131
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$3;->a:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-static {v0, p2}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->c(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;Z)Z

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$3;->a:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->b(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Lo/emu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$3;->a:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->a(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$3;->a:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->a(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 135
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ets;->d(Landroid/content/Context;Z)V

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$3;->a:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->e(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;Z)V

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$3;->a:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->d(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$3;->a:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->c(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 141
    :cond_0
    const-string v0, "type"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 143
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ets;->d(Landroid/content/Context;Z)V

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$3;->a:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->e(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;Z)V

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$3;->a:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->c(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 146
    const-string v0, "type"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    :goto_0
    return-void
.end method
