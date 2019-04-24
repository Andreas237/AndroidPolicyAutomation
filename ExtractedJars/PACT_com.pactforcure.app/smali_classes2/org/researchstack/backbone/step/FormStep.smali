.class public Lorg/researchstack/backbone/step/FormStep;
.super Lorg/researchstack/backbone/step/QuestionStep;
.source "FormStep.java"


# instance fields
.field private formSteps:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/researchstack/backbone/step/QuestionStep;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "identifier"    # Ljava/lang/String;
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "text"    # Ljava/lang/String;

    .prologue
    .line 23
    new-instance v0, Lorg/researchstack/backbone/answerformat/FormAnswerFormat;

    invoke-direct {v0}, Lorg/researchstack/backbone/answerformat/FormAnswerFormat;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lorg/researchstack/backbone/step/QuestionStep;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/researchstack/backbone/answerformat/AnswerFormat;)V

    .line 24
    invoke-virtual {p0, p3}, Lorg/researchstack/backbone/step/FormStep;->setText(Ljava/lang/String;)V

    .line 25
    return-void
.end method


# virtual methods
.method public getFormSteps()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lorg/researchstack/backbone/step/QuestionStep;",
            ">;"
        }
    .end annotation

    .prologue
    .line 34
    iget-object v0, p0, Lorg/researchstack/backbone/step/FormStep;->formSteps:Ljava/util/List;

    return-object v0
.end method

.method public setFormSteps(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lorg/researchstack/backbone/step/QuestionStep;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 39
    .local p1, "formSteps":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/step/QuestionStep;>;"
    iput-object p1, p0, Lorg/researchstack/backbone/step/FormStep;->formSteps:Ljava/util/List;

    .line 40
    return-void
.end method

.method public varargs setFormSteps([Lorg/researchstack/backbone/step/QuestionStep;)V
    .locals 1
    .param p1, "formSteps"    # [Lorg/researchstack/backbone/step/QuestionStep;

    .prologue
    .line 44
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/step/FormStep;->setFormSteps(Ljava/util/List;)V

    .line 45
    return-void
.end method
