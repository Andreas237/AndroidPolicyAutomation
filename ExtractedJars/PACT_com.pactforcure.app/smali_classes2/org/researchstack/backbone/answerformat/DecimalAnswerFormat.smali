.class public Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;
.super Lorg/researchstack/backbone/answerformat/AnswerFormat;
.source "DecimalAnswerFormat.java"


# instance fields
.field private maxValue:F

.field private minValue:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0
    .param p1, "minValue"    # F
    .param p2, "maxValue"    # F

    .prologue
    .line 27
    invoke-direct {p0}, Lorg/researchstack/backbone/answerformat/AnswerFormat;-><init>()V

    .line 28
    iput p1, p0, Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;->minValue:F

    .line 29
    iput p2, p0, Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;->maxValue:F

    .line 30
    return-void
.end method


# virtual methods
.method public getMaxValue()F
    .locals 1

    .prologue
    .line 55
    iget v0, p0, Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;->maxValue:F

    return v0
.end method

.method public getMinValue()F
    .locals 1

    .prologue
    .line 45
    iget v0, p0, Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;->minValue:F

    return v0
.end method

.method public getQuestionType()Lorg/researchstack/backbone/answerformat/AnswerFormat$QuestionType;
    .locals 1

    .prologue
    .line 35
    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Decimal:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    return-object v0
.end method

.method public validateAnswer(Ljava/lang/String;)Lorg/researchstack/backbone/ui/step/body/BodyAnswer;
    .locals 6
    .param p1, "inputString"    # Ljava/lang/String;

    .prologue
    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 61
    if-eqz p1, :cond_0

    invoke-static {p1}, Lorg/researchstack/backbone/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 62
    :cond_0
    sget-object v1, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->INVALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    .line 78
    :goto_0
    return-object v1

    .line 66
    :cond_1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    .line 67
    .local v0, "floatAnswer":Ljava/lang/Float;
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget v2, p0, Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;->minValue:F

    cmpg-float v1, v1, v2

    if-gez v1, :cond_2

    .line 68
    new-instance v1, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    sget v2, Lorg/researchstack/backbone/R$string;->rsb_invalid_answer_integer_under:I

    new-array v3, v3, [Ljava/lang/String;

    .line 69
    invoke-virtual {p0}, Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;->getMinValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-direct {v1, v5, v2, v3}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;-><init>(ZI[Ljava/lang/String;)V

    goto :goto_0

    .line 72
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget v2, p0, Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;->maxValue:F

    cmpl-float v1, v1, v2

    if-lez v1, :cond_3

    .line 73
    new-instance v1, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    sget v2, Lorg/researchstack/backbone/R$string;->rsb_invalid_answer_integer_over:I

    new-array v3, v3, [Ljava/lang/String;

    .line 74
    invoke-virtual {p0}, Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;->getMaxValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-direct {v1, v5, v2, v3}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;-><init>(ZI[Ljava/lang/String;)V

    goto :goto_0

    .line 78
    :cond_3
    sget-object v1, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->VALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    goto :goto_0
.end method
