.class Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->handleStatusChangedInUiThread(Lo/acl;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;)V
    .locals 0

    .line 184
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 187
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "goback"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "honour_device"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->onBackPressed()Z

    goto :goto_0

    .line 190
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;

    const-class v1, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->popupFragment(Ljava/lang/Class;)V

    .line 192
    :goto_0
    return-void
.end method
