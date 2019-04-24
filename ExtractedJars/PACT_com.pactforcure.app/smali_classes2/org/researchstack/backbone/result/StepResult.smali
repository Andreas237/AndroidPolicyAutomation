.class public Lorg/researchstack/backbone/result/StepResult;
.super Lorg/researchstack/backbone/result/Result;
.source "StepResult.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/researchstack/backbone/result/Result;"
    }
.end annotation


# static fields
.field public static final DEFAULT_KEY:Ljava/lang/String; = "answer"


# instance fields
.field private answerFormat:Lorg/researchstack/backbone/answerformat/AnswerFormat;

.field private results:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/researchstack/backbone/step/Step;)V
    .locals 1
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;

    .prologue
    .line 43
    .local p0, "this":Lorg/researchstack/backbone/result/StepResult;, "Lorg/researchstack/backbone/result/StepResult<TT;>;"
    invoke-virtual {p1}, Lorg/researchstack/backbone/step/Step;->getIdentifier()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/researchstack/backbone/result/Result;-><init>(Ljava/lang/String;)V

    .line 44
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/result/StepResult;->results:Ljava/util/Map;

    .line 46
    instance-of v0, p1, Lorg/researchstack/backbone/step/QuestionStep;

    if-eqz v0, :cond_0

    .line 48
    check-cast p1, Lorg/researchstack/backbone/step/QuestionStep;

    .end local p1    # "step":Lorg/researchstack/backbone/step/Step;
    invoke-virtual {p1}, Lorg/researchstack/backbone/step/QuestionStep;->getAnswerFormat()Lorg/researchstack/backbone/answerformat/AnswerFormat;

    move-result-object v0

    iput-object v0, p0, Lorg/researchstack/backbone/result/StepResult;->answerFormat:Lorg/researchstack/backbone/answerformat/AnswerFormat;

    .line 50
    :cond_0
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/result/StepResult;->setStartDate(Ljava/util/Date;)V

    .line 52
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/result/StepResult;->setEndDate(Ljava/util/Date;)V

    .line 53
    return-void
.end method


# virtual methods
.method public getAnswerFormat()Lorg/researchstack/backbone/answerformat/AnswerFormat;
    .locals 1

    .prologue
    .line 119
    .local p0, "this":Lorg/researchstack/backbone/result/StepResult;, "Lorg/researchstack/backbone/result/StepResult<TT;>;"
    iget-object v0, p0, Lorg/researchstack/backbone/result/StepResult;->answerFormat:Lorg/researchstack/backbone/answerformat/AnswerFormat;

    return-object v0
.end method

.method public getResult()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 72
    .local p0, "this":Lorg/researchstack/backbone/result/StepResult;, "Lorg/researchstack/backbone/result/StepResult<TT;>;"
    const-string v0, "answer"

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/result/StepResult;->getResultForIdentifier(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getResultForIdentifier(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .param p1, "identifier"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 95
    .local p0, "this":Lorg/researchstack/backbone/result/StepResult;, "Lorg/researchstack/backbone/result/StepResult<TT;>;"
    iget-object v0, p0, Lorg/researchstack/backbone/result/StepResult;->results:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getResults()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "TT;>;"
        }
    .end annotation

    .prologue
    .line 57
    .local p0, "this":Lorg/researchstack/backbone/result/StepResult;, "Lorg/researchstack/backbone/result/StepResult<TT;>;"
    iget-object v0, p0, Lorg/researchstack/backbone/result/StepResult;->results:Ljava/util/Map;

    return-object v0
.end method

.method public setResult(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 82
    .local p0, "this":Lorg/researchstack/backbone/result/StepResult;, "Lorg/researchstack/backbone/result/StepResult<TT;>;"
    .local p1, "result":Ljava/lang/Object;, "TT;"
    const-string v0, "answer"

    invoke-virtual {p0, v0, p1}, Lorg/researchstack/backbone/result/StepResult;->setResultForIdentifier(Ljava/lang/String;Ljava/lang/Object;)V

    .line 83
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/result/StepResult;->setEndDate(Ljava/util/Date;)V

    .line 84
    return-void
.end method

.method public setResultForIdentifier(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .param p1, "identifier"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    .prologue
    .line 108
    .local p0, "this":Lorg/researchstack/backbone/result/StepResult;, "Lorg/researchstack/backbone/result/StepResult<TT;>;"
    .local p2, "result":Ljava/lang/Object;, "TT;"
    iget-object v0, p0, Lorg/researchstack/backbone/result/StepResult;->results:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    return-void
.end method

.method public setResults(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "TT;>;)V"
        }
    .end annotation

    .prologue
    .line 62
    .local p0, "this":Lorg/researchstack/backbone/result/StepResult;, "Lorg/researchstack/backbone/result/StepResult<TT;>;"
    .local p1, "results":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;TT;>;"
    iput-object p1, p0, Lorg/researchstack/backbone/result/StepResult;->results:Ljava/util/Map;

    .line 63
    return-void
.end method
