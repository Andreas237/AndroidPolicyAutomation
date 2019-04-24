.class public Lorg/researchstack/backbone/step/QuestionStep;
.super Lorg/researchstack/backbone/step/Step;
.source "QuestionStep.java"


# instance fields
.field private answerFormat:Lorg/researchstack/backbone/answerformat/AnswerFormat;

.field private placeholder:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "identifier"    # Ljava/lang/String;

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/step/Step;-><init>(Ljava/lang/String;)V

    .line 39
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "identifier"    # Ljava/lang/String;
    .param p2, "title"    # Ljava/lang/String;

    .prologue
    .line 50
    invoke-direct {p0, p1, p2}, Lorg/researchstack/backbone/step/Step;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lorg/researchstack/backbone/answerformat/AnswerFormat;)V
    .locals 0
    .param p1, "identifier"    # Ljava/lang/String;
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "format"    # Lorg/researchstack/backbone/answerformat/AnswerFormat;

    .prologue
    .line 64
    invoke-direct {p0, p1, p2}, Lorg/researchstack/backbone/step/Step;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    iput-object p3, p0, Lorg/researchstack/backbone/step/QuestionStep;->answerFormat:Lorg/researchstack/backbone/answerformat/AnswerFormat;

    .line 66
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lorg/researchstack/backbone/answerformat/AnswerFormat;Ljava/lang/String;)V
    .locals 0
    .param p1, "identifier"    # Ljava/lang/String;
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "format"    # Lorg/researchstack/backbone/answerformat/AnswerFormat;
    .param p4, "placeholder"    # Ljava/lang/String;

    .prologue
    .line 79
    invoke-direct {p0, p1, p2, p3}, Lorg/researchstack/backbone/step/QuestionStep;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/researchstack/backbone/answerformat/AnswerFormat;)V

    .line 80
    iput-object p4, p0, Lorg/researchstack/backbone/step/QuestionStep;->placeholder:Ljava/lang/String;

    .line 81
    return-void
.end method


# virtual methods
.method public getAnswerFormat()Lorg/researchstack/backbone/answerformat/AnswerFormat;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lorg/researchstack/backbone/step/QuestionStep;->answerFormat:Lorg/researchstack/backbone/answerformat/AnswerFormat;

    return-object v0
.end method

.method public getPlaceholder()Ljava/lang/String;
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lorg/researchstack/backbone/step/QuestionStep;->placeholder:Ljava/lang/String;

    return-object v0
.end method

.method public getStepBodyClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 119
    iget-object v0, p0, Lorg/researchstack/backbone/step/QuestionStep;->answerFormat:Lorg/researchstack/backbone/answerformat/AnswerFormat;

    invoke-virtual {v0}, Lorg/researchstack/backbone/answerformat/AnswerFormat;->getQuestionType()Lorg/researchstack/backbone/answerformat/AnswerFormat$QuestionType;

    move-result-object v0

    invoke-interface {v0}, Lorg/researchstack/backbone/answerformat/AnswerFormat$QuestionType;->getStepBodyClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public getStepLayoutClass()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 101
    const-class v0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;

    return-object v0
.end method

.method public getStepTitle()I
    .locals 1

    .prologue
    .line 85
    invoke-super {p0}, Lorg/researchstack/backbone/step/Step;->getStepTitle()I

    move-result v0

    if-nez v0, :cond_0

    sget v0, Lorg/researchstack/backbone/R$string;->rsb_consent:I

    .line 86
    :goto_0
    return v0

    :cond_0
    invoke-super {p0}, Lorg/researchstack/backbone/step/Step;->getStepTitle()I

    move-result v0

    goto :goto_0
.end method

.method public setAnswerFormat(Lorg/researchstack/backbone/answerformat/AnswerFormat;)V
    .locals 0
    .param p1, "answerFormat"    # Lorg/researchstack/backbone/answerformat/AnswerFormat;

    .prologue
    .line 145
    iput-object p1, p0, Lorg/researchstack/backbone/step/QuestionStep;->answerFormat:Lorg/researchstack/backbone/answerformat/AnswerFormat;

    .line 146
    return-void
.end method

.method public setPlaceholder(Ljava/lang/String;)V
    .locals 0
    .param p1, "placeholder"    # Ljava/lang/String;

    .prologue
    .line 173
    iput-object p1, p0, Lorg/researchstack/backbone/step/QuestionStep;->placeholder:Ljava/lang/String;

    .line 174
    return-void
.end method
