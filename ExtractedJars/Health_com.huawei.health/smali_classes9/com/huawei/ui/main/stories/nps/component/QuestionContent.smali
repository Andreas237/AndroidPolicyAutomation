.class public Lcom/huawei/ui/main/stories/nps/component/QuestionContent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;
    }
.end annotation


# instance fields
.field private firstTime:Ljava/lang/String;

.field private queryTimes:Ljava/lang/String;

.field private reason:Ljava/lang/String;

.field private resCode:Ljava/lang/String;

.field private surveyContent:Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;

.field private surveyID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static arrayQuestionContentFromData(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/ui/main/stories/nps/component/QuestionContent;>;"
        }
    .end annotation

    .line 36
    new-instance v0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$1;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$1;-><init>()V

    .line 37
    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 39
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public static objectFromData(Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/component/QuestionContent;
    .locals 2

    .line 31
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;

    return-object v0
.end method


# virtual methods
.method public getFirstTime()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;->firstTime:Ljava/lang/String;

    return-object v0
.end method

.method public getQueryTimes()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;->queryTimes:Ljava/lang/String;

    return-object v0
.end method

.method public getReason()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;->reason:Ljava/lang/String;

    return-object v0
.end method

.method public getResCode()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;->resCode:Ljava/lang/String;

    return-object v0
.end method

.method public getSurveyContent()Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;->surveyContent:Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;

    return-object v0
.end method

.method public getSurveyID()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;->surveyID:Ljava/lang/String;

    return-object v0
.end method

.method public setFirstTime(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;->firstTime:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public setQueryTimes(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;->queryTimes:Ljava/lang/String;

    .line 80
    return-void
.end method

.method public setReason(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;->reason:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public setResCode(Ljava/lang/String;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;->resCode:Ljava/lang/String;

    .line 88
    return-void
.end method

.method public setSurveyContent(Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;->surveyContent:Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;

    .line 72
    return-void
.end method

.method public setSurveyID(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;->surveyID:Ljava/lang/String;

    .line 64
    return-void
.end method
