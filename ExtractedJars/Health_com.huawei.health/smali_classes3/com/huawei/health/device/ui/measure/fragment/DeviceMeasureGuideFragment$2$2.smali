.class Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;->onStatusChanged(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;

.field final synthetic val$d:Lcom/huawei/hihealth/device/open/HealthDevice;

.field final synthetic val$s:I


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 0

    .line 315
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$2;->val$d:Lcom/huawei/hihealth/device/open/HealthDevice;

    iput p3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$2;->val$s:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 318
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment onStatusChanged 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 320
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment onStatusChanged 4"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$2;->val$d:Lcom/huawei/hihealth/device/open/HealthDevice;

    iget v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$2;->val$s:I

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->handleStatusChangedInUiThreadUniversal(Lcom/huawei/hihealth/device/open/HealthDevice;I)V

    .line 323
    :cond_0
    return-void
.end method
