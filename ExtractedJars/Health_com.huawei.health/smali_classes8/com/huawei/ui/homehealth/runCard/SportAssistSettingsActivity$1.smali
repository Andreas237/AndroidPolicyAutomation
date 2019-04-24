.class Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$1;->d:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$1;->d:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-static {v0, p2}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->b(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;Z)Z

    .line 173
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$1;->d:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->b(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$1;->d:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->b(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 176
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ets;->e(Landroid/content/Context;Z)V

    .line 177
    const-string v0, "type"

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 179
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ets;->e(Landroid/content/Context;Z)V

    .line 180
    const-string v0, "type"

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$1;->d:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-static {v0, v2}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->e(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;Ljava/util/Map;)V

    .line 184
    return-void
.end method
