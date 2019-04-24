.class Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->doStartMeasureUniversal()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;)V
    .locals 0

    .line 276
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;)V
    .locals 6

    .line 280
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment onDataChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->stopTimer()V

    .line 285
    move-object v4, p1

    .line 286
    move-object v5, p2

    .line 288
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 289
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$1;

    invoke-direct {v1, p0, v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 296
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment activity is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    :goto_0
    return-void
.end method

.method public onFailed(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 0

    .line 335
    return-void
.end method

.method public onProgressChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureRecord;)V
    .locals 0

    .line 303
    return-void
.end method

.method public onStatusChanged(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 6

    .line 307
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment onStatusChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    move-object v4, p1

    .line 310
    move v5, p2

    .line 311
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 313
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;)V

    .line 314
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment onStatusChanged 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$2;

    invoke-direct {v1, p0, v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;Lcom/huawei/hihealth/device/open/HealthDevice;I)V

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 326
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment activity is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    :goto_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment onStatusChanged 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    return-void
.end method
