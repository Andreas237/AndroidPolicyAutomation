.class public Lorg/researchstack/backbone/answerformat/BooleanAnswerFormat;
.super Lorg/researchstack/backbone/answerformat/ChoiceAnswerFormat;
.source "BooleanAnswerFormat.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .param p1, "trueString"    # Ljava/lang/String;
    .param p2, "falseString"    # Ljava/lang/String;

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 25
    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;->SingleChoice:Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

    const/4 v1, 0x2

    new-array v1, v1, [Lorg/researchstack/backbone/model/Choice;

    new-instance v2, Lorg/researchstack/backbone/model/Choice;

    .line 26
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v2, p1, v3}, Lorg/researchstack/backbone/model/Choice;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    aput-object v2, v1, v4

    new-instance v2, Lorg/researchstack/backbone/model/Choice;

    .line 27
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v2, p2, v3}, Lorg/researchstack/backbone/model/Choice;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    aput-object v2, v1, v5

    .line 25
    invoke-direct {p0, v0, v1}, Lorg/researchstack/backbone/answerformat/ChoiceAnswerFormat;-><init>(Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;[Lorg/researchstack/backbone/model/Choice;)V

    .line 28
    return-void
.end method


# virtual methods
.method public getQuestionType()Lorg/researchstack/backbone/answerformat/AnswerFormat$QuestionType;
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Boolean:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    return-object v0
.end method
