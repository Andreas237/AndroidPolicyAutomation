.class Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->e(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)V
    .locals 0

    .line 213
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$2;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 216
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$2;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/RunPlanActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 218
    const-string v0, "KEY_TYPE_SHOW_PLAN"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$2;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-virtual {v0, v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->startActivity(Landroid/content/Intent;)V

    .line 220
    return-void
.end method
