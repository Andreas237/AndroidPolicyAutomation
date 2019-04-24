.class Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;->onDataChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;

.field final synthetic val$d:Lcom/huawei/hihealth/device/open/HealthDevice;

.field final synthetic val$dat:Lcom/huawei/hihealth/device/open/data/MeasureResult;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;)V
    .locals 0

    .line 289
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$1;->val$d:Lcom/huawei/hihealth/device/open/HealthDevice;

    iput-object p3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$1;->val$dat:Lcom/huawei/hihealth/device/open/data/MeasureResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 292
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$1;->val$d:Lcom/huawei/hihealth/device/open/HealthDevice;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$2$1;->val$dat:Lcom/huawei/hihealth/device/open/data/MeasureResult;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->handleDataChangedInUiThreadUniversal(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;Z)V

    .line 293
    return-void
.end method
