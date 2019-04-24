.class public Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private all:I

.field private climb:I

.field private dataType:I

.field private ride:I

.field private run:I

.field private walk:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public appendAll(I)V
    .locals 1

    .line 26
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->all:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->all:I

    .line 27
    return-void
.end method

.method public getAll()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->all:I

    return v0
.end method

.method public getClimb()I
    .locals 1

    .line 58
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->climb:I

    return v0
.end method

.method public getDataType()I
    .locals 1

    .line 34
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->dataType:I

    return v0
.end method

.method public getRide()I
    .locals 1

    .line 66
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->ride:I

    return v0
.end method

.method public getRun()I
    .locals 1

    .line 50
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->run:I

    return v0
.end method

.method public getWalk()I
    .locals 1

    .line 42
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->walk:I

    return v0
.end method

.method public setAll(I)V
    .locals 0

    .line 18
    iput p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->all:I

    .line 19
    return-void
.end method

.method public setClimb(I)V
    .locals 0

    .line 54
    iput p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->climb:I

    .line 55
    return-void
.end method

.method public setDataType(I)V
    .locals 0

    .line 30
    iput p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->dataType:I

    .line 31
    return-void
.end method

.method public setRide(I)V
    .locals 0

    .line 62
    iput p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->ride:I

    .line 63
    return-void
.end method

.method public setRun(I)V
    .locals 0

    .line 46
    iput p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->run:I

    .line 47
    return-void
.end method

.method public setWalk(I)V
    .locals 0

    .line 38
    iput p1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->walk:I

    .line 39
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FitnessTotalValue{dataType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->dataType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", all="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->all:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", walk="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->walk:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", run="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->run:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", climb="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->climb:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", ride="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->ride:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
