.class public Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private endTime:Ljava/lang/Long;

.field private key:Ljava/lang/String;

.field private startTime:Ljava/lang/Long;

.field private unit:Ljava/lang/String;

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getEndTime()Ljava/lang/Long;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->endTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->key:Ljava/lang/String;

    return-object v0
.end method

.method public getStartTime()Ljava/lang/Long;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->startTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getUnit()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->unit:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->value:Ljava/lang/String;

    return-object v0
.end method

.method public setEndTime(Ljava/lang/Long;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->endTime:Ljava/lang/Long;

    .line 38
    return-void
.end method

.method public setKey(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->key:Ljava/lang/String;

    .line 46
    return-void
.end method

.method public setStartTime(Ljava/lang/Long;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->startTime:Ljava/lang/Long;

    .line 30
    return-void
.end method

.method public setUnit(Ljava/lang/String;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->unit:Ljava/lang/String;

    .line 62
    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->value:Ljava/lang/String;

    .line 54
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SamplePoint{startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->startTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->endTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", key=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->key:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", value=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->value:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", unit=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->unit:Ljava/lang/String;

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
