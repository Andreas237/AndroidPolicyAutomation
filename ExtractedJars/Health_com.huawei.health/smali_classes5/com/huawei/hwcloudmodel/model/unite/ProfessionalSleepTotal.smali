.class public Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dataSource:I

.field private deviceCode:J

.field private generateTime:J

.field private professionalSleep:Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;

.field private recordDay:I

.field private timeZone:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDataSource()I
    .locals 1

    .line 23
    iget v0, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->dataSource:I

    return v0
.end method

.method public getDeviceCode()J
    .locals 2

    .line 27
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->deviceCode:J

    return-wide v0
.end method

.method public getGenerateTime()J
    .locals 2

    .line 19
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->generateTime:J

    return-wide v0
.end method

.method public getProfessionalSleep()Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->professionalSleep:Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;

    return-object v0
.end method

.method public getRecordDay()I
    .locals 1

    .line 15
    iget v0, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->recordDay:I

    return v0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->timeZone:Ljava/lang/String;

    return-object v0
.end method

.method public setDataSource(I)V
    .locals 0

    .line 47
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->dataSource:I

    .line 48
    return-void
.end method

.method public setDeviceCode(J)V
    .locals 0

    .line 51
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->deviceCode:J

    .line 52
    return-void
.end method

.method public setGenerateTime(J)V
    .locals 0

    .line 43
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->generateTime:J

    .line 44
    return-void
.end method

.method public setProfessionalSleep(Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->professionalSleep:Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;

    .line 56
    return-void
.end method

.method public setRecordDay(I)V
    .locals 0

    .line 39
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->recordDay:I

    .line 40
    return-void
.end method

.method public setTimeZone(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->timeZone:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ProfessionalSleepTotal{recordDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->recordDay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", generateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->generateTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->dataSource:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->deviceCode:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", professionalSleep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->professionalSleep:Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timeZone=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->timeZone:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
