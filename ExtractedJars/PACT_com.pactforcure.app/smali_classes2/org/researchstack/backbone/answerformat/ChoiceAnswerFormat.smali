.class public Lorg/researchstack/backbone/answerformat/ChoiceAnswerFormat;
.super Lorg/researchstack/backbone/answerformat/AnswerFormat;
.source "ChoiceAnswerFormat.java"


# instance fields
.field private answerStyle:Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

.field private choices:[Lorg/researchstack/backbone/model/Choice;


# direct methods
.method public varargs constructor <init>(Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;[Lorg/researchstack/backbone/model/Choice;)V
    .locals 1
    .param p1, "answerStyle"    # Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;
    .param p2, "choices"    # [Lorg/researchstack/backbone/model/Choice;

    .prologue
    .line 23
    invoke-direct {p0}, Lorg/researchstack/backbone/answerformat/AnswerFormat;-><init>()V

    .line 24
    iput-object p1, p0, Lorg/researchstack/backbone/answerformat/ChoiceAnswerFormat;->answerStyle:Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

    .line 25
    invoke-virtual {p2}, [Lorg/researchstack/backbone/model/Choice;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/researchstack/backbone/model/Choice;

    iput-object v0, p0, Lorg/researchstack/backbone/answerformat/ChoiceAnswerFormat;->choices:[Lorg/researchstack/backbone/model/Choice;

    .line 26
    return-void
.end method


# virtual methods
.method public getChoices()[Lorg/researchstack/backbone/model/Choice;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lorg/researchstack/backbone/answerformat/ChoiceAnswerFormat;->choices:[Lorg/researchstack/backbone/model/Choice;

    invoke-virtual {v0}, [Lorg/researchstack/backbone/model/Choice;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/researchstack/backbone/model/Choice;

    return-object v0
.end method

.method public getQuestionType()Lorg/researchstack/backbone/answerformat/AnswerFormat$QuestionType;
    .locals 2

    .prologue
    .line 37
    iget-object v0, p0, Lorg/researchstack/backbone/answerformat/ChoiceAnswerFormat;->answerStyle:Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

    sget-object v1, Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;->MultipleChoice:Lorg/researchstack/backbone/answerformat/AnswerFormat$ChoiceAnswerStyle;

    if-ne v0, v1, :cond_0

    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->MultipleChoice:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->SingleChoice:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    goto :goto_0
.end method
