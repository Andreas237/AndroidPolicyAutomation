.class synthetic Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory$1;
.super Ljava/lang/Object;
.source "GameQuestionDriverFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$api$model$TaskModel$Type:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 18
    invoke-static {}, Lcom/ibotta/api/model/TaskModel$Type;->values()[Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory$1;->$SwitchMap$com$ibotta$api$model$TaskModel$Type:[I

    :try_start_0
    sget-object v0, Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory$1;->$SwitchMap$com$ibotta$api$model$TaskModel$Type:[I

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->POLL:Lcom/ibotta/api/model/TaskModel$Type;

    invoke-virtual {v1}, Lcom/ibotta/api/model/TaskModel$Type;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory$1;->$SwitchMap$com$ibotta$api$model$TaskModel$Type:[I

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->GETTING_TO_KNOW_YOU:Lcom/ibotta/api/model/TaskModel$Type;

    invoke-virtual {v1}, Lcom/ibotta/api/model/TaskModel$Type;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory$1;->$SwitchMap$com$ibotta$api$model$TaskModel$Type:[I

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->POLL_MULTI:Lcom/ibotta/api/model/TaskModel$Type;

    invoke-virtual {v1}, Lcom/ibotta/api/model/TaskModel$Type;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v0, Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory$1;->$SwitchMap$com$ibotta$api$model$TaskModel$Type:[I

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->QUIZ:Lcom/ibotta/api/model/TaskModel$Type;

    invoke-virtual {v1}, Lcom/ibotta/api/model/TaskModel$Type;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v0, Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory$1;->$SwitchMap$com$ibotta$api$model$TaskModel$Type:[I

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->SURVEY:Lcom/ibotta/api/model/TaskModel$Type;

    invoke-virtual {v1}, Lcom/ibotta/api/model/TaskModel$Type;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v0, Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory$1;->$SwitchMap$com$ibotta$api$model$TaskModel$Type:[I

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->LOGIC_SURVEY:Lcom/ibotta/api/model/TaskModel$Type;

    invoke-virtual {v1}, Lcom/ibotta/api/model/TaskModel$Type;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v0, Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory$1;->$SwitchMap$com$ibotta$api$model$TaskModel$Type:[I

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->JOUST:Lcom/ibotta/api/model/TaskModel$Type;

    invoke-virtual {v1}, Lcom/ibotta/api/model/TaskModel$Type;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    return-void
.end method
