.class public Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dataSource:Ljava/lang/Integer;

.field private deviceCode:Ljava/lang/Long;

.field private generateTime:Ljava/lang/Long;

.field private recordDay:Ljava/lang/Integer;

.field private sleepBasic:Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;

.field private timeZone:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDataSource()Ljava/lang/Integer;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->dataSource:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public getGenerateTime()Ljava/lang/Long;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->generateTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getRecordDay()Ljava/lang/Integer;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->recordDay:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSleepBasic()Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->sleepBasic:Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;

    return-object v0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->timeZone:Ljava/lang/String;

    return-object v0
.end method

.method public setDataSource(Ljava/lang/Integer;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->dataSource:Ljava/lang/Integer;

    .line 19
    return-void
.end method

.method public setDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->deviceCode:Ljava/lang/Long;

    .line 27
    return-void
.end method

.method public setGenerateTime(Ljava/lang/Long;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->generateTime:Ljava/lang/Long;

    .line 59
    return-void
.end method

.method public setRecordDay(Ljava/lang/Integer;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->recordDay:Ljava/lang/Integer;

    .line 35
    return-void
.end method

.method public setSleepBasic(Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->sleepBasic:Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;

    .line 43
    return-void
.end method

.method public setTimeZone(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->timeZone:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 63
    const-string v0, "SleepTotal{}"

    return-object v0
.end method
