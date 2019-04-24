.class public Lcom/huawei/hihealthservice/old/model/SleepTimeLine;
.super Lcom/huawei/hihealthservice/old/model/TimeLine;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x3eedcb40d0b4b33L


# instance fields
.field private deepDuration:I

.field private shallowDuration:I

.field private wakeCount:I

.field private wakeDuration:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/model/TimeLine;-><init>()V

    return-void
.end method


# virtual methods
.method public getDeepDuration()I
    .locals 1

    .line 54
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/SleepTimeLine;->deepDuration:I

    return v0
.end method

.method public getShallowDuration()I
    .locals 1

    .line 70
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/SleepTimeLine;->shallowDuration:I

    return v0
.end method

.method public getWakeCount()I
    .locals 1

    .line 102
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/SleepTimeLine;->wakeCount:I

    return v0
.end method

.method public getWakeDuration()I
    .locals 1

    .line 86
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/SleepTimeLine;->wakeDuration:I

    return v0
.end method

.method public initFunctionA()V
    .locals 0

    .line 137
    return-void
.end method

.method public initFunctionB()V
    .locals 0

    .line 141
    return-void
.end method

.method public initFunctionC()V
    .locals 0

    .line 145
    return-void
.end method

.method public setDeepDuration(I)V
    .locals 0

    .line 62
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/SleepTimeLine;->deepDuration:I

    .line 63
    return-void
.end method

.method public setShallowDuration(I)V
    .locals 0

    .line 78
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/SleepTimeLine;->shallowDuration:I

    .line 79
    return-void
.end method

.method public setWakeCount(I)V
    .locals 0

    .line 110
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/SleepTimeLine;->wakeCount:I

    .line 111
    return-void
.end method

.method public setWakeDuration(I)V
    .locals 0

    .line 94
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/SleepTimeLine;->wakeDuration:I

    .line 95
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 118
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    const-string v0, "SportTimeLine [deepDuration="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/SleepTimeLine;->deepDuration:I

    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shallowDuration="

    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/SleepTimeLine;->shallowDuration:I

    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", wakeDuration="

    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/SleepTimeLine;->wakeDuration:I

    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", wakeCount="

    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/SleepTimeLine;->wakeCount:I

    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 127
    invoke-super {p0}, Lcom/huawei/hihealthservice/old/model/TimeLine;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
