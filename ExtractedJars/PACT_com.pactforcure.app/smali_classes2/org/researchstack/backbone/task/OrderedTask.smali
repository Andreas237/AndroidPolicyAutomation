.class public Lorg/researchstack/backbone/task/OrderedTask;
.super Lorg/researchstack/backbone/task/Task;
.source "OrderedTask.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field protected steps:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/researchstack/backbone/step/Step;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .param p1, "identifier"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lorg/researchstack/backbone/step/Step;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 44
    .local p2, "steps":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/step/Step;>;"
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/task/Task;-><init>(Ljava/lang/String;)V

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lorg/researchstack/backbone/task/OrderedTask;->steps:Ljava/util/List;

    .line 46
    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;[Lorg/researchstack/backbone/step/Step;)V
    .locals 1
    .param p1, "identifier"    # Ljava/lang/String;
    .param p2, "steps"    # [Lorg/researchstack/backbone/step/Step;

    .prologue
    .line 56
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/researchstack/backbone/task/OrderedTask;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 57
    return-void
.end method


# virtual methods
.method public getAnswerForStep(Lorg/researchstack/backbone/step/Step;)Ljava/lang/String;
    .locals 1
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;

    .prologue
    .line 183
    const/4 v0, 0x0

    return-object v0
.end method

.method public getProgressOfCurrentStep(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/TaskResult;)Lorg/researchstack/backbone/task/Task$TaskProgress;
    .locals 3
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "result"    # Lorg/researchstack/backbone/result/TaskResult;

    .prologue
    .line 121
    if-nez p1, :cond_0

    const/4 v0, -0x1

    .line 122
    .local v0, "current":I
    :goto_0
    new-instance v1, Lorg/researchstack/backbone/task/Task$TaskProgress;

    iget-object v2, p0, Lorg/researchstack/backbone/task/OrderedTask;->steps:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v0, v2}, Lorg/researchstack/backbone/task/Task$TaskProgress;-><init>(II)V

    return-object v1

    .line 121
    .end local v0    # "current":I
    :cond_0
    iget-object v1, p0, Lorg/researchstack/backbone/task/OrderedTask;->steps:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0
.end method

.method public getStepAfterStep(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/TaskResult;)Lorg/researchstack/backbone/step/Step;
    .locals 3
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "result"    # Lorg/researchstack/backbone/result/TaskResult;

    .prologue
    .line 69
    if-nez p1, :cond_0

    .line 71
    iget-object v1, p0, Lorg/researchstack/backbone/task/OrderedTask;->steps:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/researchstack/backbone/step/Step;

    .line 81
    :goto_0
    return-object v1

    .line 74
    :cond_0
    iget-object v1, p0, Lorg/researchstack/backbone/task/OrderedTask;->steps:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    add-int/lit8 v0, v1, 0x1

    .line 76
    .local v0, "nextIndex":I
    iget-object v1, p0, Lorg/researchstack/backbone/task/OrderedTask;->steps:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 78
    iget-object v1, p0, Lorg/researchstack/backbone/task/OrderedTask;->steps:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/researchstack/backbone/step/Step;

    goto :goto_0

    .line 81
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public getStepBeforeStep(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/TaskResult;)Lorg/researchstack/backbone/step/Step;
    .locals 2
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "result"    # Lorg/researchstack/backbone/result/TaskResult;

    .prologue
    .line 95
    iget-object v1, p0, Lorg/researchstack/backbone/task/OrderedTask;->steps:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    add-int/lit8 v0, v1, -0x1

    .line 97
    .local v0, "nextIndex":I
    if-ltz v0, :cond_0

    .line 99
    iget-object v1, p0, Lorg/researchstack/backbone/task/OrderedTask;->steps:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/researchstack/backbone/step/Step;

    .line 102
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public getStepById(Ljava/lang/String;)Lorg/researchstack/backbone/step/Step;
    .locals 3
    .param p1, "identifier"    # Ljava/lang/String;

    .prologue
    .line 108
    iget-object v1, p0, Lorg/researchstack/backbone/task/OrderedTask;->steps:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/step/Step;

    .line 110
    .local v0, "step":Lorg/researchstack/backbone/step/Step;
    invoke-virtual {v0}, Lorg/researchstack/backbone/step/Step;->getIdentifier()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 115
    .end local v0    # "step":Lorg/researchstack/backbone/step/Step;
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getSteps()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lorg/researchstack/backbone/step/Step;",
            ">;"
        }
    .end annotation

    .prologue
    .line 178
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/researchstack/backbone/task/OrderedTask;->steps:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getTitleForStep(Landroid/content/Context;Lorg/researchstack/backbone/step/Step;)Ljava/lang/String;
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "step"    # Lorg/researchstack/backbone/step/Step;

    .prologue
    .line 140
    invoke-super {p0, p1, p2}, Lorg/researchstack/backbone/task/Task;->getTitleForStep(Landroid/content/Context;Lorg/researchstack/backbone/step/Step;)Ljava/lang/String;

    move-result-object v1

    .line 141
    .local v1, "title":Ljava/lang/String;
    invoke-static {v1}, Lorg/researchstack/backbone/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 143
    iget-object v2, p0, Lorg/researchstack/backbone/task/OrderedTask;->steps:Ljava/util/List;

    invoke-interface {v2, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 144
    .local v0, "currentIndex":I
    sget v2, Lorg/researchstack/backbone/R$string;->rsb_format_step_title:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    add-int/lit8 v5, v0, 0x1

    .line 145
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    iget-object v5, p0, Lorg/researchstack/backbone/task/OrderedTask;->steps:Ljava/util/List;

    .line 146
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    .line 144
    invoke-virtual {p1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 148
    .end local v0    # "currentIndex":I
    :cond_0
    return-object v1
.end method

.method public stepShown(Lorg/researchstack/backbone/step/Step;)V
    .locals 0
    .param p1, "currentStep"    # Lorg/researchstack/backbone/step/Step;

    .prologue
    .line 128
    return-void
.end method

.method public validateParameters()V
    .locals 4

    .prologue
    .line 159
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 160
    .local v1, "uniqueIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    iget-object v2, p0, Lorg/researchstack/backbone/task/OrderedTask;->steps:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/step/Step;

    .line 162
    .local v0, "step":Lorg/researchstack/backbone/step/Step;
    invoke-virtual {v0}, Lorg/researchstack/backbone/step/Step;->getIdentifier()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 165
    .end local v0    # "step":Lorg/researchstack/backbone/step/Step;
    :cond_0
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v2

    iget-object v3, p0, Lorg/researchstack/backbone/task/OrderedTask;->steps:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-eq v2, v3, :cond_1

    .line 167
    new-instance v2, Lorg/researchstack/backbone/task/Task$InvalidTaskException;

    const-string v3, "OrderedTask has steps with duplicate ids"

    invoke-direct {v2, v3}, Lorg/researchstack/backbone/task/Task$InvalidTaskException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 169
    :cond_1
    return-void
.end method
