.class public Lorg/researchstack/backbone/answerformat/ConfirmEmailAnswerFormat;
.super Lorg/researchstack/backbone/answerformat/EmailAnswerFormat;
.source "ConfirmEmailAnswerFormat.java"


# instance fields
.field private originalEmailIdentifier:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "originalEmailIdentifier"    # Ljava/lang/String;

    .prologue
    .line 16
    invoke-direct {p0}, Lorg/researchstack/backbone/answerformat/EmailAnswerFormat;-><init>()V

    .line 17
    iput-object p1, p0, Lorg/researchstack/backbone/answerformat/ConfirmEmailAnswerFormat;->originalEmailIdentifier:Ljava/lang/String;

    .line 18
    return-void
.end method


# virtual methods
.method public isAnswerValid(Ljava/lang/String;Ljava/util/List;)Z
    .locals 7
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
    .local p2, "formStepChildren":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/ui/step/body/StepBody;>;"
    const/4 v3, 0x0

    .line 24
    const-string v1, ""

    .line 25
    .local v1, "originalEmail":Ljava/lang/String;
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/ui/step/body/StepBody;

    .line 26
    .local v0, "formStepChild":Lorg/researchstack/backbone/ui/step/body/StepBody;
    invoke-interface {v0, v3}, Lorg/researchstack/backbone/ui/step/body/StepBody;->getStepResult(Z)Lorg/researchstack/backbone/result/StepResult;

    move-result-object v2

    .line 27
    .local v2, "stepResult":Lorg/researchstack/backbone/result/StepResult;
    invoke-virtual {v2}, Lorg/researchstack/backbone/result/StepResult;->getIdentifier()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lorg/researchstack/backbone/answerformat/ConfirmEmailAnswerFormat;->originalEmailIdentifier:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 28
    invoke-virtual {v2}, Lorg/researchstack/backbone/result/StepResult;->getResult()Ljava/lang/Object;

    move-result-object v1

    .end local v1    # "originalEmail":Ljava/lang/String;
    check-cast v1, Ljava/lang/String;

    .line 32
    .end local v0    # "formStepChild":Lorg/researchstack/backbone/ui/step/body/StepBody;
    .end local v2    # "stepResult":Lorg/researchstack/backbone/result/StepResult;
    .restart local v1    # "originalEmail":Ljava/lang/String;
    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1}, Lorg/researchstack/backbone/utils/TextUtils;->isValidEmail(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v3, 0x1

    :cond_2
    return v3
.end method
