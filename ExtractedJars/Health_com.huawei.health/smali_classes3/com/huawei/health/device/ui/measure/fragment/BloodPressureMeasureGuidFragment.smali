.class public Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;
.super Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;
.source "SourceFile"


# instance fields
.field protected device:Lo/acl;

.field private factory:Lo/agd;

.field private mProductInfo:Lo/afj;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;-><init>()V

    return-void
.end method

.method private getMeasure()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/Object;>;"
        }
    .end annotation

    .line 57
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureMeasureGuidFragment getMeasure()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 59
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->mProductInfo:Lo/afj;

    iget-object v0, v0, Lo/afj;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 60
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->mProductInfo:Lo/afj;

    iget-object v2, v2, Lo/afj;->n:Ljava/util/ArrayList;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    invoke-virtual {v2}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 61
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 63
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    return-object v4
.end method


# virtual methods
.method protected getMode()Lo/aha;
    .locals 5

    .line 43
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureMeasureGuidFragment getmode()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->mProductInfo:Lo/afj;

    .line 45
    new-instance v4, Lo/aha;

    invoke-direct {v4}, Lo/aha;-><init>()V

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->getMeasure()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/aha;->e(Ljava/util/ArrayList;)V

    .line 48
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->mProductId:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->mProductInfo:Lo/afj;

    iget-object v1, v1, Lo/afj;->n:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/afj$b;

    iget-object v1, v1, Lo/afj$b;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/aha;->e(Ljava/lang/String;)V

    .line 49
    const v0, 0x800003

    invoke-virtual {v4, v0}, Lo/aha;->b(I)V

    .line 50
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/aha;->d(Z)V

    .line 51
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/aha;->c(Z)V

    .line 52
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->mProductId:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->setTitle(Ljava/lang/String;)V

    .line 53
    return-object v4
.end method

.method protected getOnClickListener()Landroid/view/View$OnClickListener;
    .locals 1

    .line 95
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;)V

    return-object v0
.end method

.method protected handleDataChangedInUiThread(Lo/acl;Lo/afz;Z)V
    .locals 0

    .line 109
    return-void
.end method

.method protected handleDataChangedInUiThreadUniversal(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;Z)V
    .locals 0

    .line 114
    return-void
.end method

.method protected handleFailedEventInUiThread(Lo/acl;I)V
    .locals 0

    .line 129
    return-void
.end method

.method protected handleStatusChangedInUiThread(Lo/acl;I)V
    .locals 0

    .line 118
    return-void
.end method

.method protected handleStatusChangedInUiThreadUniversal(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 0

    .line 124
    return-void
.end method

.method public measureClick()V
    .locals 8

    .line 78
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BloodPressureMeasureGuidFragment onClick() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BloodPressureMeasureGuidFragment onClick() kind"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->mKind:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 81
    const-string v0, "device_name"

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->c:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    sget-object v0, Lo/dae;->fJ:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 84
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 86
    new-instance v6, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;

    invoke-direct {v6}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;-><init>()V

    .line 87
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 88
    const-string v0, "kind"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->mKind:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v2}, Lo/afj;->n()Lo/afj$a;

    move-result-object v2

    iget-object v2, v2, Lo/afj$a;->c:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    invoke-virtual {v6, v7}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 92
    invoke-virtual {p0, v6}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 93
    return-void
.end method

.method public onStart()V
    .locals 1

    .line 68
    invoke-super {p0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->onStart()V

    .line 70
    new-instance v0, Lo/agd;

    invoke-direct {v0}, Lo/agd;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;->factory:Lo/agd;

    .line 75
    return-void
.end method
