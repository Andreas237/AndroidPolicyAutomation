.class Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->g()V
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

    .line 405
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$4;->d:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 408
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$4;->d:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 409
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$4;->d:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->a:Landroid/os/Handler;

    const/16 v1, 0x6f

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 411
    :cond_0
    const-string v0, "Track_SportSettingsFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "settingListenType mHandle is  null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    :goto_0
    return-void
.end method
