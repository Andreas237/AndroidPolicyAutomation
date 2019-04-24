.class Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)V
    .locals 0

    .line 366
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 369
    sget v0, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_save:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 370
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)V

    .line 372
    :cond_0
    return-void
.end method
