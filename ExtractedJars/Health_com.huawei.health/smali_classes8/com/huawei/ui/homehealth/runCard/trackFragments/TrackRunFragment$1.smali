.class Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$1;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$1;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$1;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 92
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$1;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    invoke-virtual {v0, v3}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->startActivity(Landroid/content/Intent;)V

    .line 93
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$1;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$anim;->track_run_more_info_open:I

    sget v2, Lcom/huawei/ui/homehealth/R$anim;->track_run_more_info_open_stay:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentActivity;->overridePendingTransition(II)V

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$1;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;)V

    .line 96
    :cond_0
    return-void
.end method
