.class public Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;
.super Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;
.source "SourceFile"


# instance fields
.field private exerciseIntensityTotal:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;>;"
        }
    .end annotation
.end field

.field private heartRateRiseAlarmTotal:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;>;"
        }
    .end annotation
.end field

.field private heartRateTotal:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;>;"
        }
    .end annotation
.end field

.field private professionalSleepTotal:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;>;"
        }
    .end annotation
.end field

.field private sleepTotal:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;>;"
        }
    .end annotation
.end field

.field private stressTotal:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/StressTotal;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getExerciseIntensityTotal()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;>;"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->exerciseIntensityTotal:Ljava/util/List;

    return-object v0
.end method

.method public getHeartRateRiseTotal()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;>;"
        }
    .end annotation

    .line 67
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->heartRateRiseAlarmTotal:Ljava/util/List;

    return-object v0
.end method

.method public getHeartRateTotal()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;>;"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->heartRateTotal:Ljava/util/List;

    return-object v0
.end method

.method public getProfessionalSleepTotal()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;>;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->professionalSleepTotal:Ljava/util/List;

    return-object v0
.end method

.method public getSleepTotal()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;>;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->sleepTotal:Ljava/util/List;

    return-object v0
.end method

.method public getStressTotal()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/StressTotal;>;"
        }
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->stressTotal:Ljava/util/List;

    return-object v0
.end method

.method public setExerciseIntensityTotal(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;>;)V"
        }
    .end annotation

    .line 58
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->exerciseIntensityTotal:Ljava/util/List;

    .line 59
    return-void
.end method

.method public setHeartRateRiseTotal(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;>;)V"
        }
    .end annotation

    .line 71
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->heartRateRiseAlarmTotal:Ljava/util/List;

    .line 72
    return-void
.end method

.method public setHeartRateTotal(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;>;)V"
        }
    .end annotation

    .line 42
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->heartRateTotal:Ljava/util/List;

    .line 43
    return-void
.end method

.method public setProfessionalSleepTotal(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;>;)V"
        }
    .end annotation

    .line 34
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->professionalSleepTotal:Ljava/util/List;

    .line 35
    return-void
.end method

.method public setSleepTotal(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;>;)V"
        }
    .end annotation

    .line 30
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->sleepTotal:Ljava/util/List;

    .line 31
    return-void
.end method

.method public setStressTotal(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/StressTotal;>;)V"
        }
    .end annotation

    .line 50
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;->stressTotal:Ljava/util/List;

    .line 51
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 63
    const-string v0, "GetHealthStatRsp"

    return-object v0
.end method
