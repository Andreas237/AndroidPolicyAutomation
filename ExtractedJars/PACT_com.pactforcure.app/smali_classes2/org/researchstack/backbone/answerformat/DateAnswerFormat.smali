.class public Lorg/researchstack/backbone/answerformat/DateAnswerFormat;
.super Lorg/researchstack/backbone/answerformat/AnswerFormat;
.source "DateAnswerFormat.java"


# instance fields
.field private defaultDate:Ljava/util/Date;

.field private maximumDate:Ljava/util/Date;

.field private minimumDate:Ljava/util/Date;

.field private style:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;


# direct methods
.method public constructor <init>(Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;)V
    .locals 0
    .param p1, "style"    # Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    .prologue
    .line 24
    invoke-direct {p0}, Lorg/researchstack/backbone/answerformat/AnswerFormat;-><init>()V

    .line 25
    iput-object p1, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->style:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    .line 26
    return-void
.end method

.method public constructor <init>(Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V
    .locals 0
    .param p1, "style"    # Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;
    .param p2, "defaultDate"    # Ljava/util/Date;
    .param p3, "minimumDate"    # Ljava/util/Date;
    .param p4, "maximumDate"    # Ljava/util/Date;

    .prologue
    .line 29
    invoke-direct {p0}, Lorg/researchstack/backbone/answerformat/AnswerFormat;-><init>()V

    .line 30
    iput-object p1, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->style:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    .line 31
    iput-object p2, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->defaultDate:Ljava/util/Date;

    .line 32
    iput-object p3, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->minimumDate:Ljava/util/Date;

    .line 33
    iput-object p4, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->maximumDate:Ljava/util/Date;

    .line 34
    return-void
.end method


# virtual methods
.method public getDefaultDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->defaultDate:Ljava/util/Date;

    return-object v0
.end method

.method public getMaximumDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->maximumDate:Ljava/util/Date;

    return-object v0
.end method

.method public getMinimumDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->minimumDate:Ljava/util/Date;

    return-object v0
.end method

.method public getQuestionType()Lorg/researchstack/backbone/answerformat/AnswerFormat$QuestionType;
    .locals 2

    .prologue
    .line 86
    iget-object v0, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->style:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    sget-object v1, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->Date:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    if-ne v0, v1, :cond_0

    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Date:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    .line 90
    :goto_0
    return-object v0

    .line 87
    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->style:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    sget-object v1, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->DateAndTime:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    if-ne v0, v1, :cond_1

    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->DateAndTime:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    goto :goto_0

    .line 88
    :cond_1
    iget-object v0, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->style:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    sget-object v1, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->TimeOfDay:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    if-ne v0, v1, :cond_2

    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->TimeOfDay:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    goto :goto_0

    .line 90
    :cond_2
    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->None:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    goto :goto_0
.end method

.method public getStyle()Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->style:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    return-object v0
.end method

.method public validateAnswer(Ljava/util/Date;)Lorg/researchstack/backbone/ui/step/body/BodyAnswer;
    .locals 6
    .param p1, "resultDate"    # Ljava/util/Date;

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 95
    iget-object v0, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->minimumDate:Ljava/util/Date;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iget-object v2, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->minimumDate:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 97
    new-instance v0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    sget v1, Lorg/researchstack/backbone/R$string;->rsb_invalid_answer_date_under:I

    new-array v2, v4, [Ljava/lang/String;

    sget-object v3, Lorg/researchstack/backbone/utils/FormatHelper;->SIMPLE_FORMAT_DATE:Ljava/text/SimpleDateFormat;

    iget-object v4, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->minimumDate:Ljava/util/Date;

    .line 99
    invoke-virtual {v3, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-direct {v0, v5, v1, v2}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;-><init>(ZI[Ljava/lang/String;)V

    .line 109
    :goto_0
    return-object v0

    .line 102
    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->maximumDate:Ljava/util/Date;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iget-object v2, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->maximumDate:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 104
    new-instance v0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    sget v1, Lorg/researchstack/backbone/R$string;->rsb_invalid_answer_date_over:I

    new-array v2, v4, [Ljava/lang/String;

    sget-object v3, Lorg/researchstack/backbone/utils/FormatHelper;->SIMPLE_FORMAT_DATE:Ljava/text/SimpleDateFormat;

    iget-object v4, p0, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;->maximumDate:Ljava/util/Date;

    .line 106
    invoke-virtual {v3, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-direct {v0, v5, v1, v2}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;-><init>(ZI[Ljava/lang/String;)V

    goto :goto_0

    .line 109
    :cond_1
    sget-object v0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->VALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    goto :goto_0
.end method
