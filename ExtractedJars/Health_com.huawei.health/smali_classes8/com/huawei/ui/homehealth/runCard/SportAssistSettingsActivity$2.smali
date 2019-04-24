.class Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$2;->e:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$2;->e:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->finish()V

    .line 142
    return-void
.end method
