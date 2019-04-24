.class public Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private timeStamp:J

.field private vo2maxValue:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getTimeStamp()J
    .locals 2

    .line 10
    iget-wide v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->timeStamp:J

    return-wide v0
.end method

.method public getVo2maxValue()I
    .locals 1

    .line 19
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->vo2maxValue:I

    return v0
.end method

.method public setTimeStamp(J)V
    .locals 0

    .line 14
    iput-wide p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->timeStamp:J

    .line 15
    return-void
.end method

.method public setVo2maxValue(I)V
    .locals 0

    .line 23
    iput p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->vo2maxValue:I

    .line 24
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 28
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "Vo2maxDetail{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 29
    const-string v0, "timeStamp="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->timeStamp:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 30
    const-string v0, ", vo2maxValue="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->vo2maxValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 31
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 32
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
