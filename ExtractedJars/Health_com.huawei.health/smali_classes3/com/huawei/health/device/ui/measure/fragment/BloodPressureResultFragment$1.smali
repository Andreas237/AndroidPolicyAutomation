.class Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 154
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureResultFragment onClick()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    sget v0, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_save:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 157
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;)V

    goto :goto_0

    .line 159
    :cond_0
    sget v0, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_remeasure:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 160
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->onDestroy()V

    .line 161
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;

    const-class v1, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->popupFragment(Ljava/lang/Class;)V

    .line 163
    :cond_1
    :goto_0
    return-void
.end method
