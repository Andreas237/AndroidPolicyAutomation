.class Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->getOnClickListener()Landroid/view/View$OnClickListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 99
    sget v0, Lcom/huawei/plugindevice/R$id;->bt_device_measure_guide_next:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 100
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->measureClick()V

    .line 102
    :cond_0
    return-void
.end method
