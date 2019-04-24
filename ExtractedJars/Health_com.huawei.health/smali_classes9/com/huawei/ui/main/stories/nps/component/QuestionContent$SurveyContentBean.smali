.class public Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/nps/component/QuestionContent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SurveyContentBean"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;
    }
.end annotation


# instance fields
.field private endDesc:Ljava/lang/String;

.field private questions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;>;"
        }
    .end annotation
.end field

.field private startDesc:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static arraySurveyContentBeanFromData(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;>;"
        }
    .end annotation

    .line 110
    new-instance v0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$1;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$1;-><init>()V

    .line 111
    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 113
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public static objectFromData(Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;
    .locals 2

    .line 105
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;

    return-object v0
.end method


# virtual methods
.method public getEndDesc()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;->endDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getQuestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;>;"
        }
    .end annotation

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;->questions:Ljava/util/List;

    return-object v0
.end method

.method public getStartDesc()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;->startDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setEndDesc(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;->endDesc:Ljava/lang/String;

    .line 122
    return-void
.end method

.method public setQuestions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;>;)V"
        }
    .end annotation

    .line 145
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;->questions:Ljava/util/List;

    .line 146
    return-void
.end method

.method public setStartDesc(Ljava/lang/String;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;->startDesc:Ljava/lang/String;

    .line 138
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;->title:Ljava/lang/String;

    .line 130
    return-void
.end method
