.class public Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "QuestionsBean"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$OptionsBean;
    }
.end annotation


# instance fields
.field private id:Ljava/lang/String;

.field private options:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$OptionsBean;>;"
        }
    .end annotation
.end field

.field private pictureUrl:Ljava/lang/String;

.field private question:Ljava/lang/String;

.field private required:Ljava/lang/String;

.field private subTitle:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static arrayQuestionsBeanFromData(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;>;"
        }
    .end annotation

    .line 174
    new-instance v0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$1;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$1;-><init>()V

    .line 175
    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 177
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public static objectFromData(Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;
    .locals 2

    .line 169
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;

    return-object v0
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$OptionsBean;>;"
        }
    .end annotation

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->options:Ljava/util/List;

    return-object v0
.end method

.method public getPictureUrl()Ljava/lang/String;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->pictureUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getQuestion()Ljava/lang/String;
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->question:Ljava/lang/String;

    return-object v0
.end method

.method public getRequired()Ljava/lang/String;
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->required:Ljava/lang/String;

    return-object v0
.end method

.method public getSubTitle()Ljava/lang/String;
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->subTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->type:Ljava/lang/String;

    return-object v0
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->id:Ljava/lang/String;

    .line 210
    return-void
.end method

.method public setOptions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$OptionsBean;>;)V"
        }
    .end annotation

    .line 233
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->options:Ljava/util/List;

    .line 234
    return-void
.end method

.method public setPictureUrl(Ljava/lang/String;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->pictureUrl:Ljava/lang/String;

    .line 202
    return-void
.end method

.method public setQuestion(Ljava/lang/String;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->question:Ljava/lang/String;

    .line 194
    return-void
.end method

.method public setRequired(Ljava/lang/String;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->required:Ljava/lang/String;

    .line 226
    return-void
.end method

.method public setSubTitle(Ljava/lang/String;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->subTitle:Ljava/lang/String;

    .line 186
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->type:Ljava/lang/String;

    .line 218
    return-void
.end method
