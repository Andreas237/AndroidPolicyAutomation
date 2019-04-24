.class public Lorg/researchstack/backbone/ui/step/body/FormBody;
.super Ljava/lang/Object;
.source "FormBody.java"

# interfaces
.implements Lorg/researchstack/backbone/ui/step/body/StepBody;


# instance fields
.field private formStepChildren:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/researchstack/backbone/ui/step/body/StepBody;",
            ">;"
        }
    .end annotation
.end field

.field private result:Lorg/researchstack/backbone/result/StepResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/researchstack/backbone/result/StepResult",
            "<",
            "Lorg/researchstack/backbone/result/StepResult;",
            ">;"
        }
    .end annotation
.end field

.field private step:Lorg/researchstack/backbone/step/FormStep;


# direct methods
.method public constructor <init>(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V
    .locals 1
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "result"    # Lorg/researchstack/backbone/result/StepResult;

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v0, p1

    .line 36
    check-cast v0, Lorg/researchstack/backbone/step/FormStep;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/step/body/FormBody;->step:Lorg/researchstack/backbone/step/FormStep;

    .line 37
    if-nez p2, :cond_0

    new-instance p2, Lorg/researchstack/backbone/result/StepResult;

    .end local p2    # "result":Lorg/researchstack/backbone/result/StepResult;
    invoke-direct {p2, p1}, Lorg/researchstack/backbone/result/StepResult;-><init>(Lorg/researchstack/backbone/step/Step;)V

    :cond_0
    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/body/FormBody;->result:Lorg/researchstack/backbone/result/StepResult;

    .line 38
    return-void
.end method

.method private createStepBody(Lorg/researchstack/backbone/step/QuestionStep;)Lorg/researchstack/backbone/ui/step/body/StepBody;
    .locals 7
    .param p1, "questionStep"    # Lorg/researchstack/backbone/step/QuestionStep;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .prologue
    .line 116
    iget-object v4, p0, Lorg/researchstack/backbone/ui/step/body/FormBody;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-virtual {p1}, Lorg/researchstack/backbone/step/QuestionStep;->getIdentifier()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lorg/researchstack/backbone/result/StepResult;->getResultForIdentifier(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/result/StepResult;

    .line 118
    .local v0, "childResult":Lorg/researchstack/backbone/result/StepResult;
    invoke-virtual {p1}, Lorg/researchstack/backbone/step/QuestionStep;->getStepBodyClass()Ljava/lang/Class;

    move-result-object v1

    .line 121
    .local v1, "cls":Ljava/lang/Class;
    const/4 v4, 0x2

    :try_start_0
    new-array v4, v4, [Ljava/lang/Class;

    const/4 v5, 0x0

    const-class v6, Lorg/researchstack/backbone/step/Step;

    aput-object v6, v4, v5

    const/4 v5, 0x1

    const-class v6, Lorg/researchstack/backbone/result/StepResult;

    aput-object v6, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    .line 122
    .local v2, "constructor":Ljava/lang/reflect/Constructor;
    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x1

    aput-object v0, v4, v5

    invoke-virtual {v2, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/researchstack/backbone/ui/step/body/StepBody;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v4

    .line 124
    .end local v2    # "constructor":Ljava/lang/reflect/Constructor;
    :catch_0
    move-exception v3

    .line 126
    .local v3, "e":Ljava/lang/Exception;
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Cannot instantiate step body for step "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {p1}, Lorg/researchstack/backbone/step/QuestionStep;->getStepTitle()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ", class name: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lorg/researchstack/backbone/utils/LogExt;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 127
    new-instance v4, Ljava/lang/RuntimeException;

    invoke-direct {v4, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v4
.end method


# virtual methods
.method public clearViews()V
    .locals 0

    .prologue
    .line 106
    return-void
.end method

.method public getBodyAnswerState(Ljava/util/List;)Lorg/researchstack/backbone/ui/step/body/BodyAnswer;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lorg/researchstack/backbone/ui/step/body/StepBody;",
            ">;)",
            "Lorg/researchstack/backbone/ui/step/body/BodyAnswer;"
        }
    .end annotation

    .prologue
    .line 83
    .local p1, "formStepChildren":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/ui/step/body/StepBody;>;"
    if-nez p1, :cond_0

    .line 84
    iget-object p1, p0, Lorg/researchstack/backbone/ui/step/body/FormBody;->formStepChildren:Ljava/util/List;

    .line 86
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/researchstack/backbone/ui/step/body/StepBody;

    .line 88
    .local v1, "formStepBody":Lorg/researchstack/backbone/ui/step/body/StepBody;
    invoke-interface {v1, p1}, Lorg/researchstack/backbone/ui/step/body/StepBody;->getBodyAnswerState(Ljava/util/List;)Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    move-result-object v0

    .line 89
    .local v0, "bodyAnswer":Lorg/researchstack/backbone/ui/step/body/BodyAnswer;
    invoke-virtual {v0}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->isValid()Z

    move-result v3

    if-nez v3, :cond_1

    .line 95
    .end local v0    # "bodyAnswer":Lorg/researchstack/backbone/ui/step/body/BodyAnswer;
    .end local v1    # "formStepBody":Lorg/researchstack/backbone/ui/step/body/StepBody;
    :goto_0
    return-object v0

    :cond_2
    sget-object v0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->VALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    goto :goto_0
.end method

.method public getBodyView(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7
    .param p1, "viewType"    # I
    .param p2, "inflater"    # Landroid/view/LayoutInflater;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 44
    sget v5, Lorg/researchstack/backbone/R$layout;->rsb_step_layout_form_body:I

    const/4 v6, 0x0

    invoke-virtual {p2, v5, p3, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 48
    .local v0, "body":Landroid/widget/LinearLayout;
    iget-object v5, p0, Lorg/researchstack/backbone/ui/step/body/FormBody;->step:Lorg/researchstack/backbone/step/FormStep;

    invoke-virtual {v5}, Lorg/researchstack/backbone/step/FormStep;->getFormSteps()Ljava/util/List;

    move-result-object v3

    .line 49
    .local v3, "questionSteps":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/step/QuestionStep;>;"
    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v5, p0, Lorg/researchstack/backbone/ui/step/body/FormBody;->formStepChildren:Ljava/util/List;

    .line 53
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/researchstack/backbone/step/QuestionStep;

    .line 55
    .local v2, "questionStep":Lorg/researchstack/backbone/step/QuestionStep;
    invoke-direct {p0, v2}, Lorg/researchstack/backbone/ui/step/body/FormBody;->createStepBody(Lorg/researchstack/backbone/step/QuestionStep;)Lorg/researchstack/backbone/ui/step/body/StepBody;

    move-result-object v4

    .line 56
    .local v4, "stepBody":Lorg/researchstack/backbone/ui/step/body/StepBody;
    const/4 v6, 0x1

    invoke-interface {v4, v6, p2, v0}, Lorg/researchstack/backbone/ui/step/body/StepBody;->getBodyView(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 57
    .local v1, "bodyView":Landroid/view/View;
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 59
    iget-object v6, p0, Lorg/researchstack/backbone/ui/step/body/FormBody;->formStepChildren:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 62
    .end local v1    # "bodyView":Landroid/view/View;
    .end local v2    # "questionStep":Lorg/researchstack/backbone/step/QuestionStep;
    .end local v4    # "stepBody":Lorg/researchstack/backbone/ui/step/body/StepBody;
    :cond_0
    return-object v0
.end method

.method public getStepResult(Z)Lorg/researchstack/backbone/result/StepResult;
    .locals 5
    .param p1, "skipped"    # Z

    .prologue
    .line 68
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/FormBody;->formStepChildren:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/ui/step/body/StepBody;

    .line 70
    .local v0, "child":Lorg/researchstack/backbone/ui/step/body/StepBody;
    invoke-interface {v0, p1}, Lorg/researchstack/backbone/ui/step/body/StepBody;->getStepResult(Z)Lorg/researchstack/backbone/result/StepResult;

    move-result-object v1

    .line 71
    .local v1, "childResult":Lorg/researchstack/backbone/result/StepResult;
    if-eqz v1, :cond_0

    .line 73
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/body/FormBody;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-virtual {v1}, Lorg/researchstack/backbone/result/StepResult;->getIdentifier()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Lorg/researchstack/backbone/result/StepResult;->setResultForIdentifier(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 77
    .end local v0    # "child":Lorg/researchstack/backbone/ui/step/body/StepBody;
    .end local v1    # "childResult":Lorg/researchstack/backbone/result/StepResult;
    :cond_1
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/FormBody;->result:Lorg/researchstack/backbone/result/StepResult;

    return-object v2
.end method

.method public setAnswer(Ljava/lang/String;)V
    .locals 0
    .param p1, "answer"    # Ljava/lang/String;

    .prologue
    .line 101
    return-void
.end method

.method public setOnNextListener(Lorg/researchstack/backbone/ui/step/GoToNextLayout;)V
    .locals 0
    .param p1, "goToNextLayout"    # Lorg/researchstack/backbone/ui/step/GoToNextLayout;

    .prologue
    .line 111
    return-void
.end method
