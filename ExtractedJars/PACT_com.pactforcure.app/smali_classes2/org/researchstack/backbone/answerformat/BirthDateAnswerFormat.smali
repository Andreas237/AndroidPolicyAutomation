.class public Lorg/researchstack/backbone/answerformat/BirthDateAnswerFormat;
.super Lorg/researchstack/backbone/answerformat/DateAnswerFormat;
.source "BirthDateAnswerFormat.java"


# instance fields
.field private final maxAge:I

.field private final minAge:I


# direct methods
.method public constructor <init>(Ljava/util/Date;II)V
    .locals 3
    .param p1, "defaultDate"    # Ljava/util/Date;
    .param p2, "minAge"    # I
    .param p3, "maxAge"    # I

    .prologue
    .line 27
    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;->Date:Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;

    invoke-static {p3}, Lorg/researchstack/backbone/answerformat/BirthDateAnswerFormat;->dateFromAge(I)Ljava/util/Date;

    move-result-object v1

    invoke-static {p2}, Lorg/researchstack/backbone/answerformat/BirthDateAnswerFormat;->dateFromAge(I)Ljava/util/Date;

    move-result-object v2

    invoke-direct {p0, v0, p1, v1, v2}, Lorg/researchstack/backbone/answerformat/DateAnswerFormat;-><init>(Lorg/researchstack/backbone/answerformat/AnswerFormat$DateAnswerStyle;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V

    .line 28
    iput p2, p0, Lorg/researchstack/backbone/answerformat/BirthDateAnswerFormat;->minAge:I

    .line 29
    iput p3, p0, Lorg/researchstack/backbone/answerformat/BirthDateAnswerFormat;->maxAge:I

    .line 30
    return-void
.end method

.method private static dateFromAge(I)Ljava/util/Date;
    .locals 3
    .param p0, "age"    # I

    .prologue
    .line 15
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 16
    .local v0, "calendar":Ljava/util/Calendar;
    if-eqz p0, :cond_0

    .line 18
    const/4 v1, 0x1

    neg-int v2, p0

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    .line 19
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    .line 22
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private isOnOrBefore(Ljava/util/Date;Ljava/util/Date;)Z
    .locals 7
    .param p1, "inputDate"    # Ljava/util/Date;
    .param p2, "cutoffDate"    # Ljava/util/Date;

    .prologue
    const/4 v6, 0x6

    const/4 v5, 0x1

    .line 53
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 54
    .local v0, "calendar":Ljava/util/Calendar;
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 55
    invoke-virtual {v0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 56
    .local v4, "year":I
    invoke-virtual {v0, v6}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 57
    .local v3, "dayOfYear":I
    invoke-virtual {v0, p2}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 58
    invoke-virtual {v0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v2

    .line 59
    .local v2, "cutoffYear":I
    invoke-virtual {v0, v6}, Ljava/util/Calendar;->get(I)I

    move-result v1

    .line 61
    .local v1, "cutoffDayOfYear":I
    if-lt v4, v2, :cond_0

    if-ne v4, v2, :cond_1

    if-gt v3, v1, :cond_1

    :cond_0
    :goto_0
    return v5

    :cond_1
    const/4 v5, 0x0

    goto :goto_0
.end method


# virtual methods
.method public validateAnswer(Ljava/util/Date;)Lorg/researchstack/backbone/ui/step/body/BodyAnswer;
    .locals 7
    .param p1, "resultDate"    # Ljava/util/Date;

    .prologue
    const/4 v4, 0x1

    const/4 v6, 0x0

    .line 35
    invoke-virtual {p0}, Lorg/researchstack/backbone/answerformat/BirthDateAnswerFormat;->getMinimumDate()Ljava/util/Date;

    move-result-object v1

    .line 36
    .local v1, "minDate":Ljava/util/Date;
    invoke-virtual {p0}, Lorg/researchstack/backbone/answerformat/BirthDateAnswerFormat;->getMaximumDate()Ljava/util/Date;

    move-result-object v0

    .line 38
    .local v0, "maxDate":Ljava/util/Date;
    if-eqz v1, :cond_0

    invoke-direct {p0, p1, v1}, Lorg/researchstack/backbone/answerformat/BirthDateAnswerFormat;->isOnOrBefore(Ljava/util/Date;Ljava/util/Date;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 40
    new-instance v2, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    sget v3, Lorg/researchstack/backbone/R$string;->rsb_birth_date_too_old:I

    new-array v4, v4, [Ljava/lang/String;

    iget v5, p0, Lorg/researchstack/backbone/answerformat/BirthDateAnswerFormat;->maxAge:I

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-direct {v2, v6, v3, v4}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;-><init>(ZI[Ljava/lang/String;)V

    .line 48
    :goto_0
    return-object v2

    .line 43
    :cond_0
    if-eqz v0, :cond_1

    invoke-direct {p0, p1, v0}, Lorg/researchstack/backbone/answerformat/BirthDateAnswerFormat;->isOnOrBefore(Ljava/util/Date;Ljava/util/Date;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 45
    new-instance v2, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    sget v3, Lorg/researchstack/backbone/R$string;->rsb_birth_date_too_young:I

    new-array v4, v4, [Ljava/lang/String;

    iget v5, p0, Lorg/researchstack/backbone/answerformat/BirthDateAnswerFormat;->minAge:I

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-direct {v2, v6, v3, v4}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;-><init>(ZI[Ljava/lang/String;)V

    goto :goto_0

    .line 48
    :cond_1
    sget-object v2, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->VALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    goto :goto_0
.end method
