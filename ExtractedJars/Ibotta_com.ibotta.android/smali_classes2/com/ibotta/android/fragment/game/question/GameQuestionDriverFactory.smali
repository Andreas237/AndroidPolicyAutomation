.class public Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;
.super Ljava/lang/Object;
.source "GameQuestionDriverFactory.java"


# instance fields
.field private final optionHelper:Lcom/ibotta/api/helper/offer/OptionHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/helper/offer/OptionHelper;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;->optionHelper:Lcom/ibotta/api/helper/offer/OptionHelper;

    return-void
.end method


# virtual methods
.method public getDriver(Lcom/ibotta/api/model/TaskModel;)Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;
    .locals 2

    .line 18
    sget-object v0, Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory$1;->$SwitchMap$com$ibotta$api$model$TaskModel$Type:[I

    invoke-interface {p1}, Lcom/ibotta/api/model/TaskModel;->getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/TaskModel$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    goto :goto_0

    .line 38
    :pswitch_0
    new-instance v0, Lcom/ibotta/android/fragment/game/question/JoustGameQuestionDriver;

    invoke-direct {v0, p1}, Lcom/ibotta/android/fragment/game/question/JoustGameQuestionDriver;-><init>(Lcom/ibotta/api/model/TaskModel;)V

    goto :goto_0

    .line 35
    :pswitch_1
    new-instance v0, Lcom/ibotta/android/fragment/game/question/LogicSurveyGameQuestionDriver;

    iget-object v1, p0, Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;->optionHelper:Lcom/ibotta/api/helper/offer/OptionHelper;

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/fragment/game/question/LogicSurveyGameQuestionDriver;-><init>(Lcom/ibotta/api/helper/offer/OptionHelper;Lcom/ibotta/api/model/TaskModel;)V

    goto :goto_0

    .line 32
    :pswitch_2
    new-instance v0, Lcom/ibotta/android/fragment/game/question/SurveyGameQuestionDriver;

    invoke-direct {v0, p1}, Lcom/ibotta/android/fragment/game/question/SurveyGameQuestionDriver;-><init>(Lcom/ibotta/api/model/TaskModel;)V

    goto :goto_0

    .line 29
    :pswitch_3
    new-instance v0, Lcom/ibotta/android/fragment/game/question/QuizGameQuestionDriver;

    invoke-direct {v0, p1}, Lcom/ibotta/android/fragment/game/question/QuizGameQuestionDriver;-><init>(Lcom/ibotta/api/model/TaskModel;)V

    goto :goto_0

    .line 26
    :pswitch_4
    new-instance v0, Lcom/ibotta/android/fragment/game/question/PollMultiGameQuestionDriver;

    invoke-direct {v0, p1}, Lcom/ibotta/android/fragment/game/question/PollMultiGameQuestionDriver;-><init>(Lcom/ibotta/api/model/TaskModel;)V

    goto :goto_0

    .line 23
    :pswitch_5
    new-instance v0, Lcom/ibotta/android/fragment/game/question/GettingToKnowYouGameQuestionDriver;

    invoke-direct {v0, p1}, Lcom/ibotta/android/fragment/game/question/GettingToKnowYouGameQuestionDriver;-><init>(Lcom/ibotta/api/model/TaskModel;)V

    goto :goto_0

    .line 20
    :pswitch_6
    new-instance v0, Lcom/ibotta/android/fragment/game/question/PollGameQuestionDriver;

    invoke-direct {v0, p1}, Lcom/ibotta/android/fragment/game/question/PollGameQuestionDriver;-><init>(Lcom/ibotta/api/model/TaskModel;)V

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
