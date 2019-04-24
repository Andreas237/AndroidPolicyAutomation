.class public Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dataSource:I

.field private deviceCode:J

.field private generateTime:J

.field private heartRateBasic:Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;

.field private recordDay:I

.field private timeZone:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDataSource()I
    .locals 1

    .line 29
    iget v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->dataSource:I

    return v0
.end method

.method public getDeviceCode()J
    .locals 2

    .line 37
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->deviceCode:J

    return-wide v0
.end method

.method public getGenerateTime()J
    .locals 2

    .line 21
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->generateTime:J

    return-wide v0
.end method

.method public getHeartRateBasic()Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->heartRateBasic:Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;

    return-object v0
.end method

.method public getRecordDay()I
    .locals 1

    .line 13
    iget v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->recordDay:I

    return v0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->timeZone:Ljava/lang/String;

    return-object v0
.end method

.method public setDataSource(I)V
    .locals 0

    .line 33
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->dataSource:I

    .line 34
    return-void
.end method

.method public setDeviceCode(J)V
    .locals 0

    .line 41
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->deviceCode:J

    .line 42
    return-void
.end method

.method public setGenerateTime(J)V
    .locals 0

    .line 25
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->generateTime:J

    .line 26
    return-void
.end method

.method public setHeartRateBasic(Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->heartRateBasic:Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;

    .line 50
    return-void
.end method

.method public setRecordDay(I)V
    .locals 0

    .line 17
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->recordDay:I

    .line 18
    return-void
.end method

.method public setTimeZone(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->timeZone:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 62
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "HeartRateTotal{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 63
    const-string v0, "recordDay="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->recordDay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 64
    const-string v0, ", generateTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->generateTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 65
    const-string v0, ", dataSource="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->dataSource:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 66
    const-string v0, ", deviceCode="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->deviceCode:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 67
    const-string v0, ", heartRateState="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->heartRateBasic:Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 68
    const-string v0, ", timeZone=\'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->timeZone:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 69
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 70
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
