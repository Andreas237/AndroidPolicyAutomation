.class Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 124
    sget v0, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_save:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 125
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;)V

    goto :goto_0

    .line 126
    :cond_0
    sget v0, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_remeasure:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 127
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->onDestroy()V

    .line 128
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;

    const-class v1, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->popupFragment(Ljava/lang/Class;)V

    .line 130
    :cond_1
    :goto_0
    return-void
.end method
