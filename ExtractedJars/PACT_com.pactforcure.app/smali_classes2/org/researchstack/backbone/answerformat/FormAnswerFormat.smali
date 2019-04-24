.class public Lorg/researchstack/backbone/answerformat/FormAnswerFormat;
.super Lorg/researchstack/backbone/answerformat/AnswerFormat;
.source "FormAnswerFormat.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lorg/researchstack/backbone/answerformat/AnswerFormat;-><init>()V

    .line 15
    return-void
.end method


# virtual methods
.method public getQuestionType()Lorg/researchstack/backbone/answerformat/AnswerFormat$QuestionType;
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Form:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    return-object v0
.end method
