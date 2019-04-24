.class Lcom/huawei/hwstressmgr/StressAppInteractor$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwstressmgr/StressAppInteractor;->e(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwstressmgr/StressAppInteractor;

.field final synthetic c:I


# direct methods
.method constructor <init>(Lcom/huawei/hwstressmgr/StressAppInteractor;I)V
    .locals 0

    .line 686
    iput-object p1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$3;->a:Lcom/huawei/hwstressmgr/StressAppInteractor;

    iput p2, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$3;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;)V
    .locals 11

    .line 690
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$3;->a:Lcom/huawei/hwstressmgr/StressAppInteractor;

    iget v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$3;->c:I

    invoke-static {v0, v1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->b(Lcom/huawei/hwstressmgr/StressAppInteractor;I)V

    .line 692
    move-object v4, p2

    .line 693
    invoke-static {}, Lo/ahe;->b()Lo/ahe;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/ahe;->a(Lcom/huawei/hihealth/device/open/data/MeasureResult;)Lo/afz;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/aga;

    .line 694
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "-----heartRateData---:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 695
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 697
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-----heartRateData---:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/aga;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 699
    invoke-interface {v4}, Lcom/huawei/hihealth/device/open/data/MeasureResult;->getRecords()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/device/open/data/MeasureRecord;

    .line 700
    const-string v0, "RRI_SQI_RESULT"

    invoke-interface {v6, v0}, Lcom/huawei/hihealth/device/open/data/MeasureRecord;->getValueList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    .line 702
    if-eqz v7, :cond_0

    .line 703
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-----rri tostring ---:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$3;->a:Lcom/huawei/hwstressmgr/StressAppInteractor;

    invoke-static {v3, v7}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lcom/huawei/hwstressmgr/StressAppInteractor;Ljava/util/List;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 706
    :cond_0
    if-eqz v7, :cond_3

    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-eqz v0, :cond_3

    .line 707
    const/4 v8, 0x0

    .line 708
    const/4 v9, 0x0

    :goto_0
    const/16 v0, 0xe

    if-ge v9, v0, :cond_2

    .line 709
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v10

    .line 710
    if-eqz v10, :cond_1

    .line 711
    add-int/lit8 v8, v8, 0x1

    .line 712
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$3;->a:Lcom/huawei/hwstressmgr/StressAppInteractor;

    invoke-static {v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(Lcom/huawei/hwstressmgr/StressAppInteractor;)Ljava/util/List;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 708
    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 717
    :cond_2
    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_3

    .line 718
    add-int/lit8 v0, v9, 0xe

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v10

    .line 719
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$3;->a:Lcom/huawei/hwstressmgr/StressAppInteractor;

    invoke-static {v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lcom/huawei/hwstressmgr/StressAppInteractor;)Ljava/util/List;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 717
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 727
    :cond_3
    return-void
.end method

.method public onFailed(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 0

    .line 748
    return-void
.end method

.method public onProgressChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureRecord;)V
    .locals 0

    .line 732
    return-void
.end method

.method public onStatusChanged(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 4

    .line 736
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-----heartRateData_onStatusChanged---:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 737
    const/16 v0, 0xe

    if-ne p2, v0, :cond_0

    .line 738
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$3;->a:Lcom/huawei/hwstressmgr/StressAppInteractor;

    iget v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$3;->c:I

    invoke-static {v0, v1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->b(Lcom/huawei/hwstressmgr/StressAppInteractor;I)V

    goto :goto_0

    .line 739
    :cond_0
    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/16 v0, 0x8

    if-ne p2, v0, :cond_2

    .line 740
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$3;->a:Lcom/huawei/hwstressmgr/StressAppInteractor;

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$3;->a:Lcom/huawei/hwstressmgr/StressAppInteractor;

    invoke-static {v1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->e(Lcom/huawei/hwstressmgr/StressAppInteractor;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 743
    :cond_2
    :goto_0
    return-void
.end method
