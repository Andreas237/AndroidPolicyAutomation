.class public Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$OptionsBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OptionsBean"
.end annotation


# instance fields
.field private name:Ljava/lang/String;

.field private remark:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 236
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static arrayOptionsBeanFromData(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$OptionsBean;>;"
        }
    .end annotation

    .line 252
    new-instance v0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$OptionsBean$1;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$OptionsBean$1;-><init>()V

    .line 253
    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$OptionsBean$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 255
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public static objectFromData(Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$OptionsBean;
    .locals 2

    .line 247
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$OptionsBean;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$OptionsBean;

    return-object v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$OptionsBean;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getRemark()Ljava/lang/String;
    .locals 1

    .line 267
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$OptionsBean;->remark:Ljava/lang/String;

    return-object v0
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 263
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$OptionsBean;->name:Ljava/lang/String;

    .line 264
    return-void
.end method

.method public setRemark(Ljava/lang/String;)V
    .locals 0

    .line 271
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean$OptionsBean;->remark:Ljava/lang/String;

    .line 272
    return-void
.end method
