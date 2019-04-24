.class public Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public deviceID:Ljava/lang/String;

.field public deviceType:Ljava/lang/String;

.field public id:I

.field public lastSurveyTime:J

.field public surveyID:Ljava/lang/String;

.field public times:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->id:I

    return-void
.end method


# virtual methods
.method public QSTData1()V
    .locals 0

    .line 63
    return-void
.end method

.method public QSTData2()V
    .locals 0

    .line 64
    return-void
.end method

.method public QSTData3()V
    .locals 0

    .line 65
    return-void
.end method

.method public QSTData4()V
    .locals 0

    .line 66
    return-void
.end method

.method public QSTData5()V
    .locals 0

    .line 67
    return-void
.end method

.method public QSTData6()V
    .locals 0

    .line 68
    return-void
.end method

.method public QSTData7()V
    .locals 0

    .line 69
    return-void
.end method

.method public QSTData8()V
    .locals 0

    .line 70
    return-void
.end method

.method public QSTData9()V
    .locals 0

    .line 71
    return-void
.end method

.method public getDeviceID()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->deviceID:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceType()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->deviceType:Ljava/lang/String;

    return-object v0
.end method

.method public getLastSurveyTime()J
    .locals 2

    .line 22
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->lastSurveyTime:J

    return-wide v0
.end method

.method public getSurveyID()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->surveyID:Ljava/lang/String;

    return-object v0
.end method

.method public getTimes()Ljava/lang/Integer;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->times:Ljava/lang/Integer;

    return-object v0
.end method

.method public setDeviceID(Ljava/lang/String;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->deviceID:Ljava/lang/String;

    .line 19
    return-void
.end method

.method public setDeviceType(Ljava/lang/String;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->deviceType:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public setLastSurveyTime(J)V
    .locals 0

    .line 26
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->lastSurveyTime:J

    .line 27
    return-void
.end method

.method public setSurveyID(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->surveyID:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public setTimes(Ljava/lang/Integer;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->times:Ljava/lang/Integer;

    .line 43
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QstnSurveyTable{, lastSurveyTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->lastSurveyTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceType=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->deviceType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", times="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->times:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", surveyID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->surveyID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
