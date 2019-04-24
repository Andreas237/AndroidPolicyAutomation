.class public Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/RunPlanActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 22
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 23
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->activity_run_plan:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/RunPlanActivity;->setContentView(I)V

    .line 25
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/RunPlanActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    .line 27
    sget v0, Lcom/huawei/ui/homehealth/R$id;->fragment_run_plan:I

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;

    .line 28
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->a()V

    .line 30
    sget v0, Lcom/huawei/ui/homehealth/R$id;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/RunPlanActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/emr;

    .line 31
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/emr;->setRightButtonClickable(Z)V

    .line 32
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/RunPlanActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/RunPlanActivity$4;-><init>(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/RunPlanActivity;)V

    invoke-virtual {v3, v0}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    return-void
.end method
