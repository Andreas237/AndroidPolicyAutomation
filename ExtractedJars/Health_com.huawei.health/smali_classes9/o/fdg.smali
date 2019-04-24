.class public Lo/fdg;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lcom/huawei/hihealth/HiHealthData;)Lo/fdf;
    .locals 11

    .line 21
    const-wide/16 v5, 0x0

    .line 22
    const/4 v7, 0x0

    .line 23
    const-wide/16 v8, 0x0

    .line 25
    new-instance v10, Lo/fdf;

    invoke-direct {v10}, Lo/fdf;-><init>()V

    .line 26
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v5

    .line 27
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v7

    .line 28
    const-string v0, "point_value"

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    .line 29
    iput-wide v5, v10, Lo/fdf;->a:J

    .line 30
    int-to-double v0, v7

    iput-wide v0, v10, Lo/fdf;->e:D

    .line 31
    iput-wide v8, v10, Lo/fdf;->d:D

    .line 32
    const-string v0, "HealthDataInteractorUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bloodsugarData.time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, v10, Lo/fdf;->a:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    const-string v0, "HealthDataInteractorUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bloodsugarData.value1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, v10, Lo/fdf;->e:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    const-string v0, "HealthDataInteractorUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bloodsugarData.value2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, v10, Lo/fdf;->d:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    return-object v10
.end method

.method public static e(Lcom/huawei/hihealth/HiHealthData;)Lo/fdf;
    .locals 5

    .line 45
    const-string v0, "HealthDataInteractorUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addWeightData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    new-instance v4, Lo/fdf;

    invoke-direct {v4}, Lo/fdf;-><init>()V

    .line 47
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    iput-wide v0, v4, Lo/fdf;->a:J

    .line 48
    const-string v0, "weight"

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, v4, Lo/fdf;->e:D

    .line 49
    const-string v0, "weight_bodyfat"

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, v4, Lo/fdf;->d:D

    .line 51
    const-string v0, "HealthDataInteractorUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "trackdata_deviceType"

    invoke-virtual {p0, v2}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    const-string v0, "trackdata_deviceType"

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/fdf;->a(I)V

    .line 53
    const-string v0, "weight_bmi"

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/fdf;->d(D)V

    .line 54
    const-string v0, "weight_bmr"

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/fdf;->f(D)V

    .line 55
    const-string v0, "weight_body_score"

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/fdf;->h(D)V

    .line 56
    const-string v0, "weight_bone_mineral"

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/fdf;->b(D)V

    .line 57
    const-string v0, "weight_water"

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/fdf;->a(D)V

    .line 58
    const-string v0, "weight_waterrate"

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/fdf;->c(D)V

    .line 59
    const-string v0, "weight_muscles"

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/fdf;->i(D)V

    .line 60
    const-string v0, "weight_fatlevel"

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/fdf;->e(D)V

    .line 61
    const-string v0, "weight_protein"

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/fdf;->k(D)V

    .line 62
    return-object v4
.end method
