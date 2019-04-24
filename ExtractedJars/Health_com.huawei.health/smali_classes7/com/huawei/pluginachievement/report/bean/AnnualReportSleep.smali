.class public Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;
.super Lcom/huawei/pluginachievement/report/bean/AnnualData;
.source "SourceFile"


# instance fields
.field private animalImage:I

.field private breLevel:D

.field private fallAsleepTime:Ljava/lang/String;

.field private sleepDuration:I

.field private sleepScore:D

.field private wakeupTime:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 51
    sget-object v0, Lo/dxp;->a:Lo/dxp;

    invoke-virtual {v0}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualData;-><init>(Ljava/lang/String;)V

    .line 52
    return-void
.end method


# virtual methods
.method public acquireAnimalImage()I
    .locals 1

    .line 71
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->animalImage:I

    return v0
.end method

.method public acquireFallAsleepTime()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->fallAsleepTime:Ljava/lang/String;

    return-object v0
.end method

.method public acquireSleepDuration()I
    .locals 1

    .line 55
    iget v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->sleepDuration:I

    return v0
.end method

.method public acquireSleepScore()D
    .locals 2

    .line 63
    iget-wide v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->sleepScore:D

    return-wide v0
.end method

.method public acquireWakeupTime()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->wakeupTime:Ljava/lang/String;

    return-object v0
.end method

.method public getBreLevel()D
    .locals 2

    .line 100
    iget-wide v0, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->breLevel:D

    return-wide v0
.end method

.method public saveAnimalImage(I)V
    .locals 0

    .line 75
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->animalImage:I

    .line 76
    return-void
.end method

.method public saveFallAsleepTime(Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->fallAsleepTime:Ljava/lang/String;

    .line 84
    return-void
.end method

.method public saveSleepDuration(I)V
    .locals 0

    .line 59
    iput p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->sleepDuration:I

    .line 60
    return-void
.end method

.method public saveSleepScore(D)V
    .locals 0

    .line 67
    iput-wide p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->sleepScore:D

    .line 68
    return-void
.end method

.method public saveWakeupTime(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->wakeupTime:Ljava/lang/String;

    .line 92
    return-void
.end method

.method public setBreLevel(D)V
    .locals 0

    .line 96
    iput-wide p1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->breLevel:D

    .line 97
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AnnualReportSleep{sleepDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->sleepDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sleepScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->sleepScore:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", animalImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->animalImage:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fallAsleepTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->fallAsleepTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", wakeupTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->wakeupTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", breLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->breLevel:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
