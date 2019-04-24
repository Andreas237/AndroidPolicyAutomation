.class public Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;
.super Lorg/researchstack/backbone/answerformat/AnswerFormat;
.source "IntegerAnswerFormat.java"


# instance fields
.field private maxValue:I

.field private minValue:I


# direct methods
.method public constructor <init>(II)V
    .locals 0
    .param p1, "minValue"    # I
    .param p2, "maxValue"    # I

    .prologue
    .line 27
    invoke-direct {p0}, Lorg/researchstack/backbone/answerformat/AnswerFormat;-><init>()V

    .line 28
    iput p1, p0, Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;->minValue:I

    .line 29
    iput p2, p0, Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;->maxValue:I

    .line 30
    return-void
.end method


# virtual methods
.method public getMaxValue()I
    .locals 1

    .prologue
    .line 45
    iget v0, p0, Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;->maxValue:I

    return v0
.end method

.method public getMinValue()I
    .locals 1

    .prologue
    .line 55
    iget v0, p0, Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;->minValue:I

    return v0
.end method

.method public getQuestionType()Lorg/researchstack/backbone/answerformat/AnswerFormat$QuestionType;
    .locals 1

    .prologue
    .line 35
    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Integer:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    return-object v0
.end method

.method public validateAnswer(Ljava/lang/String;)Lorg/researchstack/backbone/ui/step/body/BodyAnswer;
    .locals 6
    .param p1, "inputString"    # Ljava/lang/String;

    .prologue
    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 62
    invoke-static {p1}, Lorg/researchstack/backbone/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 64
    sget-object v1, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->INVALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    .line 86
    :goto_0
    return-object v1

    .line 69
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    .line 70
    .local v0, "intAnswer":Ljava/lang/Integer;
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0}, Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;->getMinValue()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 72
    new-instance v1, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    sget v2, Lorg/researchstack/backbone/R$string;->rsb_invalid_answer_integer_under:I

    new-array v3, v3, [Ljava/lang/String;

    .line 74
    invoke-virtual {p0}, Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;->getMinValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-direct {v1, v5, v2, v3}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;-><init>(ZI[Ljava/lang/String;)V

    goto :goto_0

    .line 77
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0}, Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;->getMaxValue()I

    move-result v2

    if-le v1, v2, :cond_2

    .line 79
    new-instance v1, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    sget v2, Lorg/researchstack/backbone/R$string;->rsb_invalid_answer_integer_over:I

    new-array v3, v3, [Ljava/lang/String;

    .line 81
    invoke-virtual {p0}, Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;->getMaxValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-direct {v1, v5, v2, v3}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;-><init>(ZI[Ljava/lang/String;)V

    goto :goto_0

    .line 86
    :cond_2
    sget-object v1, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->VALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    goto :goto_0
.end method
