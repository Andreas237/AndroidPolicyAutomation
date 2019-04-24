.class Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/epn$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)V
    .locals 0

    .line 315
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$8;->d:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/app/Dialog;II)V
    .locals 2

    .line 319
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 320
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$8;->d:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-static {v0, p2}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->a(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;I)I

    move-result v1

    .line 321
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$8;->d:Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-static {v0, v1, p3}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->a(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;II)V

    .line 322
    return-void
.end method
