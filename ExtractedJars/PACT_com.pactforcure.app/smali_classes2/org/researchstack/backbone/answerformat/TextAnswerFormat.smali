.class public Lorg/researchstack/backbone/answerformat/TextAnswerFormat;
.super Lorg/researchstack/backbone/answerformat/AnswerFormat;
.source "TextAnswerFormat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;
    }
.end annotation


# static fields
.field public static final UNLIMITED_LENGTH:I


# instance fields
.field private capitalization:Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

.field private isMultipleLines:Z

.field private maximumLength:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;-><init>(I)V

    .line 35
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1
    .param p1, "maximumLength"    # I

    .prologue
    .line 43
    invoke-direct {p0}, Lorg/researchstack/backbone/answerformat/AnswerFormat;-><init>()V

    .line 18
    sget-object v0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;->NoCapitalization:Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    iput-object v0, p0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->capitalization:Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->isMultipleLines:Z

    .line 44
    iput p1, p0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->maximumLength:I

    .line 45
    return-void
.end method


# virtual methods
.method public getCapitalization()Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->capitalization:Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    return-object v0
.end method

.method public getInputType()I
    .locals 1

    .prologue
    .line 117
    const/high16 v0, 0x20000

    return v0
.end method

.method public getMaximumLength()I
    .locals 1

    .prologue
    .line 54
    iget v0, p0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->maximumLength:I

    return v0
.end method

.method public getQuestionType()Lorg/researchstack/backbone/answerformat/AnswerFormat$QuestionType;
    .locals 1

    .prologue
    .line 60
    sget-object v0, Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;->Text:Lorg/researchstack/backbone/answerformat/AnswerFormat$Type;

    return-object v0
.end method

.method public isAnswerValid(Ljava/lang/String;Ljava/util/List;)Z
    .locals 2
    .param p1, "text"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lorg/researchstack/backbone/ui/step/body/StepBody;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 91
    .local p2, "formStepChildren":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/ui/step/body/StepBody;>;"
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    iget v0, p0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->maximumLength:I

    if-eqz v0, :cond_0

    .line 92
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->maximumLength:I

    if-gt v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isMultipleLines()Z
    .locals 1

    .prologue
    .line 80
    iget-boolean v0, p0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->isMultipleLines:Z

    return v0
.end method

.method public setCapitalization(Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;)V
    .locals 0
    .param p1, "capitalization"    # Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    .prologue
    .line 101
    iput-object p1, p0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->capitalization:Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    .line 102
    return-void
.end method

.method public setIsMultipleLines(Z)V
    .locals 0
    .param p1, "isMultipleLines"    # Z

    .prologue
    .line 70
    iput-boolean p1, p0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->isMultipleLines:Z

    .line 71
    return-void
.end method
