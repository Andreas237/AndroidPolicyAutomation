.class public Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepInAndOutData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public inSleepTime:J

.field public outSleepTime:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getInSleepTime()J
    .locals 2

    .line 12
    iget-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepInAndOutData;->inSleepTime:J

    return-wide v0
.end method

.method public getOutSleepTime()J
    .locals 2

    .line 20
    iget-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepInAndOutData;->outSleepTime:J

    return-wide v0
.end method

.method public setInSleepTime(J)V
    .locals 0

    .line 16
    iput-wide p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepInAndOutData;->inSleepTime:J

    .line 17
    return-void
.end method

.method public setOutSleepTime(J)V
    .locals 0

    .line 24
    iput-wide p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepInAndOutData;->outSleepTime:J

    .line 25
    return-void
.end method
