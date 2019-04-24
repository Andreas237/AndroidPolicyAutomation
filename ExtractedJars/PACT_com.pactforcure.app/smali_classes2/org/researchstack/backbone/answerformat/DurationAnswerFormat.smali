.class public Lorg/researchstack/backbone/answerformat/DurationAnswerFormat;
.super Lorg/researchstack/backbone/answerformat/AnswerFormat;
.source "DurationAnswerFormat.java"


# instance fields
.field private step:I

.field private unit:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0
    .param p1, "step"    # I
    .param p2, "unit"    # Ljava/lang/String;

    .prologue
    .line 11
    invoke-direct {p0}, Lorg/researchstack/backbone/answerformat/AnswerFormat;-><init>()V

    .line 12
    iput p1, p0, Lorg/researchstack/backbone/answerformat/DurationAnswerFormat;->step:I

    .line 13
    iput-object p2, p0, Lorg/researchstack/backbone/answerformat/DurationAnswerFormat;->unit:Ljava/lang/String;

    .line 14
    return-void
.end method


# virtual methods
.method public egtUnit()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lorg/researchstack/backbone/answerformat/DurationAnswerFormat;->unit:Ljava/lang/String;

    return-object v0
.end method

.method public getQuestionType()Lorg/researchstack/backbone/answerformat/AnswerFormat$QuestionType;
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Duration:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    return-object v0
.end method

.method public getStep()I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lorg/researchstack/backbone/answerformat/DurationAnswerFormat;->step:I

    return v0
.end method
