.class public Lorg/researchstack/backbone/result/TaskResult;
.super Lorg/researchstack/backbone/result/Result;
.source "TaskResult.java"


# instance fields
.field private outputDirectory:Landroid/net/Uri;

.field private results:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lorg/researchstack/backbone/result/StepResult;",
            ">;"
        }
    .end annotation
.end field

.field private uuidTask:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "identifier"    # Ljava/lang/String;

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/result/Result;-><init>(Ljava/lang/String;)V

    .line 33
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/result/TaskResult;->results:Ljava/util/Map;

    .line 34
    return-void
.end method


# virtual methods
.method public getResults()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lorg/researchstack/backbone/result/StepResult;",
            ">;"
        }
    .end annotation

    .prologue
    .line 43
    iget-object v0, p0, Lorg/researchstack/backbone/result/TaskResult;->results:Ljava/util/Map;

    return-object v0
.end method

.method public getStepResult(Ljava/lang/String;)Lorg/researchstack/backbone/result/StepResult;
    .locals 1
    .param p1, "identifier"    # Ljava/lang/String;

    .prologue
    .line 54
    iget-object v0, p0, Lorg/researchstack/backbone/result/TaskResult;->results:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/result/StepResult;

    return-object v0
.end method

.method public setStepResultForStepIdentifier(Ljava/lang/String;Lorg/researchstack/backbone/result/StepResult;)V
    .locals 1
    .param p1, "identifier"    # Ljava/lang/String;
    .param p2, "stepResult"    # Lorg/researchstack/backbone/result/StepResult;

    .prologue
    .line 65
    iget-object v0, p0, Lorg/researchstack/backbone/result/TaskResult;->results:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    return-void
.end method
