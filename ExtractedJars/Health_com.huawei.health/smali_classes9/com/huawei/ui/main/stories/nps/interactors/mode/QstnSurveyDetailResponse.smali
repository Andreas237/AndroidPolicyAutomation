.class public Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private firstTime:Ljava/lang/String;

.field private queryTimes:I

.field private reason:Ljava/lang/String;

.field private resCode:I

.field private surveyContent:Lcom/huawei/ui/main/stories/nps/interactors/mode/QuestionnaireInfo;

.field private surveyID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QuestionnaireInfo;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QuestionnaireInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->surveyContent:Lcom/huawei/ui/main/stories/nps/interactors/mode/QuestionnaireInfo;

    return-void
.end method


# virtual methods
.method public getFirstTime()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->firstTime:Ljava/lang/String;

    return-object v0
.end method

.method public getQueryTimes()I
    .locals 1

    .line 34
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->queryTimes:I

    return v0
.end method

.method public getReason()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->reason:Ljava/lang/String;

    return-object v0
.end method

.method public getResCode()I
    .locals 1

    .line 18
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->resCode:I

    return v0
.end method

.method public getSurveyContent()Lcom/huawei/ui/main/stories/nps/interactors/mode/QuestionnaireInfo;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->surveyContent:Lcom/huawei/ui/main/stories/nps/interactors/mode/QuestionnaireInfo;

    return-object v0
.end method

.method public getSurveyID()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->surveyID:Ljava/lang/String;

    return-object v0
.end method

.method public setFirstTime(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->firstTime:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public setQueryTimes(I)V
    .locals 0

    .line 38
    iput p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->queryTimes:I

    .line 39
    return-void
.end method

.method public setReason(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->reason:Ljava/lang/String;

    .line 31
    return-void
.end method

.method public setResCode(I)V
    .locals 0

    .line 22
    iput p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->resCode:I

    .line 23
    return-void
.end method

.method public setSurveyContent(Lcom/huawei/ui/main/stories/nps/interactors/mode/QuestionnaireInfo;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->surveyContent:Lcom/huawei/ui/main/stories/nps/interactors/mode/QuestionnaireInfo;

    .line 55
    return-void
.end method

.method public setSurveyID(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->surveyID:Ljava/lang/String;

    .line 63
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QstnSurveyDetailResponse{resCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->resCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", reason=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->reason:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", firstTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->firstTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", queryTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->queryTimes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", surveyID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->surveyID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", surveyContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->surveyContent:Lcom/huawei/ui/main/stories/nps/interactors/mode/QuestionnaireInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
