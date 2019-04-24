.class public Lcom/huawei/hihealthservice/old/model/SportTimeLine;
.super Lcom/huawei/hihealthservice/old/model/TimeLine;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x72c1d9b6a55b8b57L


# instance fields
.field private realSteps:I

.field private totalCalory:I

.field private totalDistance:I

.field private totalSteps:I

.field private totalStoreys:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/model/TimeLine;-><init>()V

    return-void
.end method


# virtual methods
.method public getRealSteps()I
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->realSteps:I

    return v0
.end method

.method public getTotalCalory()I
    .locals 1

    .line 77
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->totalCalory:I

    return v0
.end method

.method public getTotalDistance()I
    .locals 1

    .line 87
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->totalDistance:I

    return v0
.end method

.method public getTotalSteps()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->totalSteps:I

    return v0
.end method

.method public getTotalStoreys()I
    .locals 1

    .line 57
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->totalStoreys:I

    return v0
.end method

.method public initFunctionAb()V
    .locals 0

    .line 121
    return-void
.end method

.method public initFunctionBb()V
    .locals 0

    .line 125
    return-void
.end method

.method public initFunctionCb()V
    .locals 0

    .line 129
    return-void
.end method

.method public setRealSteps(I)V
    .locals 0

    .line 113
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->realSteps:I

    .line 114
    return-void
.end method

.method public setTotalCalory(I)V
    .locals 0

    .line 82
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->totalCalory:I

    .line 83
    return-void
.end method

.method public setTotalDistance(I)V
    .locals 0

    .line 92
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->totalDistance:I

    .line 93
    return-void
.end method

.method public setTotalSteps(I)V
    .locals 0

    .line 72
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->totalSteps:I

    .line 73
    return-void
.end method

.method public setTotalStoreys(I)V
    .locals 0

    .line 62
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->totalStoreys:I

    .line 63
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SportTimeLine [totalSteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->totalSteps:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", realSteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->realSteps:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totalCalory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->totalCalory:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totalDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->totalDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totalStoreys="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/SportTimeLine;->totalStoreys:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
