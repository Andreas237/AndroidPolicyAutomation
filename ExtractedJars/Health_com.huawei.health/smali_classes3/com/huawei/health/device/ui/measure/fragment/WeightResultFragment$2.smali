.class Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;)V
    .locals 0

    .line 252
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 255
    sget v0, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_save:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 256
    invoke-static {}, Lo/ene;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 257
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;)V

    goto :goto_0

    .line 259
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightResultFragment saveWeightBtn click too fast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    return-void

    .line 263
    :cond_1
    :goto_0
    return-void
.end method
