.class public Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;
.super Ljava/lang/Object;
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

.field private timeZone:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

    .line 67
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->exerciseIntensityTotal:Ljava/util/List;

    return-object v0
.end method

.method public getHeartRateRiseAlarmTotal()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;>;"
        }
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->heartRateRiseAlarmTotal:Ljava/util/List;

    return-object v0
.end method

.method public getHeartRateTotal()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;>;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->heartRateTotal:Ljava/util/List;

    return-object v0
.end method

.method public getProfessionalSleepTotal()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;>;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->professionalSleepTotal:Ljava/util/List;

    return-object v0
.end method

.method public getSleepTotal()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;>;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->sleepTotal:Ljava/util/List;

    return-object v0
.end method

.method public getStressTotal()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/StressTotal;>;"
        }
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->stressTotal:Ljava/util/List;

    return-object v0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->timeZone:Ljava/lang/String;

    return-object v0
.end method

.method public setExerciseIntensityTotal(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/ExerciseIntensityTotal;>;)V"
        }
    .end annotation

    .line 71
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->exerciseIntensityTotal:Ljava/util/List;

    .line 72
    return-void
.end method

.method public setHeartRateRiseAlarmTotal(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;>;)V"
        }
    .end annotation

    .line 84
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->heartRateRiseAlarmTotal:Ljava/util/List;

    .line 85
    return-void
.end method

.method public setHeartRateTotal(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;>;)V"
        }
    .end annotation

    .line 30
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->heartRateTotal:Ljava/util/List;

    .line 31
    return-void
.end method

.method public setProfessionalSleepTotal(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;>;)V"
        }
    .end annotation

    .line 51
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->professionalSleepTotal:Ljava/util/List;

    .line 52
    return-void
.end method

.method public setSleepTotal(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;>;)V"
        }
    .end annotation

    .line 47
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->sleepTotal:Ljava/util/List;

    .line 48
    return-void
.end method

.method public setStressTotal(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/StressTotal;>;)V"
        }
    .end annotation

    .line 63
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->stressTotal:Ljava/util/List;

    .line 64
    return-void
.end method

.method public setTimeZone(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->timeZone:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 76
    const-string v0, "AddHealthStatReq{}"

    return-object v0
.end method
