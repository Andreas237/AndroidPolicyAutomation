.class Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;

.field final synthetic e:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;)V
    .locals 0

    .line 439
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$7;->e:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    iput-object p2, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$7;->d:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 442
    if-nez p3, :cond_0

    .line 443
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$7;->e:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->c(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;I)I

    goto :goto_0

    .line 444
    :cond_0
    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    .line 445
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$7;->e:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->c(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;I)I

    .line 447
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$7;->e:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->e(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$7;->e:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->c(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lo/ets;->k(Landroid/content/Context;I)V

    .line 448
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$7;->d:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$7;->e:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->c(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->d(I)V

    .line 450
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$7;->e:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->a(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)V

    .line 451
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$7;->e:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->h(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)V

    .line 452
    return-void
.end method
