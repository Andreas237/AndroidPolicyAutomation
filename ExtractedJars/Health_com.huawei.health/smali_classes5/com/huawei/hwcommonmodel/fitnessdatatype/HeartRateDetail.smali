.class public Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final HEART_RATE_TYPE_SPORT:I = 0x258

.field public static final HEART_RATE_TYPE_TRANQUILLIZATION:I = 0x259


# instance fields
.field private hrValue:I

.field private timeStamp:J

.field private type:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->timeStamp:J

    .line 20
    const/16 v0, 0x259

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->type:I

    .line 21
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->hrValue:I

    .line 22
    return-void
.end method


# virtual methods
.method public getHeartRateType()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->type:I

    return v0
.end method

.method public getHeartRateValue()I
    .locals 1

    .line 41
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->hrValue:I

    return v0
.end method

.method public getTimeStamp()J
    .locals 2

    .line 25
    iget-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->timeStamp:J

    return-wide v0
.end method

.method public initHeartRateDetail1()V
    .locals 0

    .line 58
    return-void
.end method

.method public initHeartRateDetail2()V
    .locals 0

    .line 59
    return-void
.end method

.method public initHeartRateDetail3()V
    .locals 0

    .line 60
    return-void
.end method

.method public initHeartRateDetail4()V
    .locals 0

    .line 61
    return-void
.end method

.method public initHeartRateDetail5()V
    .locals 0

    .line 62
    return-void
.end method

.method public initHeartRateDetail6()V
    .locals 0

    .line 63
    return-void
.end method

.method public setHeartRateType(I)V
    .locals 0

    .line 37
    iput p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->type:I

    .line 38
    return-void
.end method

.method public setHeartRateValue(I)V
    .locals 0

    .line 45
    iput p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->hrValue:I

    .line 46
    return-void
.end method

.method public setTimeStamp(J)V
    .locals 0

    .line 29
    iput-wide p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->timeStamp:J

    .line 30
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HeartRateDetail{timeStamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->timeStamp:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hrValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->hrValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
