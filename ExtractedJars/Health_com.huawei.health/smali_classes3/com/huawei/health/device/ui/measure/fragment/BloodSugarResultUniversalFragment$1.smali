.class Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 135
    sget v0, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_save:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 136
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;)V

    goto :goto_0

    .line 137
    :cond_0
    sget v0, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_remeasure:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 138
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->onDestroy()V

    .line 139
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 142
    :cond_1
    :goto_0
    return-void
.end method
