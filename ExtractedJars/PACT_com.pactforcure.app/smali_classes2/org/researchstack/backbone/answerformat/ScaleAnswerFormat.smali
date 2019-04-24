.class public Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;
.super Lorg/researchstack/backbone/answerformat/AnswerFormat;
.source "ScaleAnswerFormat.java"


# instance fields
.field private max:I

.field private maxValueHint:Ljava/lang/String;

.field private min:I

.field private minValueHint:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "min"    # I
    .param p2, "max"    # I
    .param p3, "minValueHint"    # Ljava/lang/String;
    .param p4, "maxValueHint"    # Ljava/lang/String;

    .prologue
    .line 14
    invoke-direct {p0}, Lorg/researchstack/backbone/answerformat/AnswerFormat;-><init>()V

    .line 15
    iput p1, p0, Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;->min:I

    .line 16
    iput p2, p0, Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;->max:I

    .line 17
    iput-object p3, p0, Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;->minValueHint:Ljava/lang/String;

    .line 18
    iput-object p4, p0, Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;->maxValueHint:Ljava/lang/String;

    .line 19
    return-void
.end method


# virtual methods
.method public getMax()I
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;->max:I

    return v0
.end method

.method public getMaxValueHint()Ljava/lang/String;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;->maxValueHint:Ljava/lang/String;

    return-object v0
.end method

.method public getMin()I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;->min:I

    return v0
.end method

.method public getMinValueHint()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;->minValueHint:Ljava/lang/String;

    return-object v0
.end method

.method public getQuestionType()Lorg/researchstack/backbone/answerformat/AnswerFormat$QuestionType;
    .locals 1

    .prologue
    .line 39
    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Scale:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    return-object v0
.end method
