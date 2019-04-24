.class public Lo/afh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:I

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput p3, p0, Lo/afh;->b:I

    .line 32
    iput-object p2, p0, Lo/afh;->e:Ljava/lang/String;

    .line 33
    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/hihealth/HiHealthData;)V
    .locals 6

    .line 87
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginDeviceDataStored putDataIntoDataEngine enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    if-nez p1, :cond_0

    .line 90
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginDeviceDataStored putDataIntoDataEngine data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    return-void

    .line 95
    :cond_0
    new-instance v4, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 96
    invoke-virtual {v4, p1}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 97
    iget-object v0, p0, Lo/afh;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 98
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->setOwnerID(I)V

    .line 100
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v5

    .line 101
    new-instance v0, Lo/afh$1;

    invoke-direct {v0, p0}, Lo/afh$1;-><init>(Lo/afh;)V

    invoke-interface {v5, v4, v0}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 107
    return-void
.end method

.method public e(Lo/afz;)Lcom/huawei/hihealth/HiHealthData;
    .locals 13

    .line 36
    if-nez p1, :cond_0

    .line 37
    const/4 v0, 0x0

    return-object v0

    .line 40
    :cond_0
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    iget v0, p0, Lo/afh;->b:I

    invoke-direct {v5, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 42
    invoke-virtual {p1}, Lo/afz;->h()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 44
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PluginDeviceDataStored startTime is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/afz;->h()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    iget v0, p0, Lo/afh;->b:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 48
    :sswitch_0
    instance-of v0, p1, Lo/agg;

    if-eqz v0, :cond_1

    .line 49
    move-object v6, p1

    check-cast v6, Lo/agg;

    .line 50
    const-string v0, "weight"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/agg;->a()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 51
    const-string v0, "weight_bodyfat"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/agg;->c()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 52
    goto/16 :goto_0

    .line 55
    :sswitch_1
    move-object v6, p1

    check-cast v6, Lo/age;

    .line 56
    const-string v0, "bloodpressure_diastolic"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/age;->c()S

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(Ljava/lang/String;)Ljava/lang/Short;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Short;->shortValue()S

    move-result v1

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putShort(Ljava/lang/String;S)V

    .line 57
    const-string v0, "bloodpressure_systolic"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/age;->a()S

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(Ljava/lang/String;)Ljava/lang/Short;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Short;->shortValue()S

    move-result v1

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putShort(Ljava/lang/String;S)V

    .line 58
    const-string v0, "heart_rate"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/age;->b()S

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(Ljava/lang/String;)Ljava/lang/Short;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Short;->shortValue()S

    move-result v1

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putShort(Ljava/lang/String;S)V

    .line 59
    goto :goto_0

    .line 61
    :sswitch_2
    move-object v7, p1

    check-cast v7, Lo/afy;

    .line 62
    invoke-virtual {v7}, Lo/afy;->c()F

    move-result v8

    .line 63
    invoke-virtual {v7}, Lo/afy;->h()J

    move-result-wide v9

    .line 64
    invoke-static {v9, v10}, Lo/afy;->c(J)I

    move-result v11

    .line 65
    invoke-virtual {v5, v11}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 66
    invoke-virtual {v5, v8}, Lcom/huawei/hihealth/HiHealthData;->setValue(F)V

    .line 67
    goto :goto_0

    .line 70
    :sswitch_3
    instance-of v0, p1, Lo/aga;

    if-eqz v0, :cond_1

    .line 71
    move-object v12, p1

    check-cast v12, Lo/aga;

    .line 72
    invoke-virtual {v12}, Lo/aga;->c()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 73
    .line 79
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lo/afz;->k()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 81
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PluginDeviceDataStored EndTime is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/afz;->k()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    return-object v5

    :sswitch_data_0
    .sparse-switch
        0x7d2 -> :sswitch_3
        0x2711 -> :sswitch_2
        0x2712 -> :sswitch_1
        0x2716 -> :sswitch_0
        0xc351 -> :sswitch_3
    .end sparse-switch
.end method
