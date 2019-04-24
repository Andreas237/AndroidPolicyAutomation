.class public Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;
.super Ljava/lang/Object;
.source "DurationQuestionBody.java"

# interfaces
.implements Lorg/researchstack/backbone/ui/step/body/StepBody;


# instance fields
.field private format:Lorg/researchstack/backbone/answerformat/DurationAnswerFormat;

.field private hoursSpinner:Landroid/widget/Spinner;

.field private minutesSpinner:Landroid/widget/Spinner;

.field private result:Lorg/researchstack/backbone/result/StepResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/researchstack/backbone/result/StepResult",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private step:Lorg/researchstack/backbone/step/QuestionStep;

.field private viewType:I


# direct methods
.method public constructor <init>(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V
    .locals 1
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "result"    # Lorg/researchstack/backbone/result/StepResult;

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v0, p1

    .line 53
    check-cast v0, Lorg/researchstack/backbone/step/QuestionStep;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    .line 54
    if-nez p2, :cond_0

    new-instance p2, Lorg/researchstack/backbone/result/StepResult;

    .end local p2    # "result":Lorg/researchstack/backbone/result/StepResult;
    invoke-direct {p2, p1}, Lorg/researchstack/backbone/result/StepResult;-><init>(Lorg/researchstack/backbone/step/Step;)V

    :cond_0
    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    .line 55
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v0}, Lorg/researchstack/backbone/step/QuestionStep;->getAnswerFormat()Lorg/researchstack/backbone/answerformat/AnswerFormat;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/answerformat/DurationAnswerFormat;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DurationAnswerFormat;

    .line 56
    return-void
.end method

.method private getViewForType(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .param p1, "viewType"    # I
    .param p2, "inflater"    # Landroid/view/LayoutInflater;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 77
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 79
    :cond_0
    invoke-direct {p0, p2, p3}, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->initView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 83
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid View Type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private initView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 13
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "parent"    # Landroid/view/ViewGroup;

    .prologue
    const v12, 0x1090009

    const v11, 0x1090008

    const/16 v10, 0x3c

    const/16 v9, 0x18

    .line 89
    sget v7, Lorg/researchstack/backbone/R$layout;->rsb_item_edit_duration:I

    const/4 v8, 0x0

    invoke-virtual {p1, v7, p2, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    .line 91
    .local v6, "v":Landroid/view/View;
    new-array v1, v9, [Ljava/lang/String;

    .line 92
    .local v1, "hoursStrs":[Ljava/lang/String;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    if-ge v2, v9, :cond_0

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 93
    :cond_0
    new-instance v0, Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-direct {v0, v7, v11, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 94
    .local v0, "hoursChoices":Landroid/widget/ArrayAdapter;, "Landroid/widget/ArrayAdapter<Ljava/lang/String;>;"
    invoke-virtual {v0, v12}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 95
    sget v7, Lorg/researchstack/backbone/R$id;->hours:I

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/Spinner;

    iput-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->hoursSpinner:Landroid/widget/Spinner;

    .line 96
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->hoursSpinner:Landroid/widget/Spinner;

    invoke-virtual {v7, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 98
    new-array v4, v10, [Ljava/lang/String;

    .line 99
    .local v4, "minutesStrs":[Ljava/lang/String;
    const/4 v2, 0x0

    :goto_1
    if-ge v2, v10, :cond_1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v4, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 100
    :cond_1
    new-instance v3, Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-direct {v3, v7, v11, v4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 101
    .local v3, "minutesChoices":Landroid/widget/ArrayAdapter;, "Landroid/widget/ArrayAdapter<Ljava/lang/String;>;"
    invoke-virtual {v3, v12}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 102
    sget v7, Lorg/researchstack/backbone/R$id;->minutes:I

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/Spinner;

    iput-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->minutesSpinner:Landroid/widget/Spinner;

    .line 103
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->minutesSpinner:Landroid/widget/Spinner;

    invoke-virtual {v7, v3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 105
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-virtual {v7}, Lorg/researchstack/backbone/result/StepResult;->getResult()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    .line 106
    .local v5, "result":Ljava/lang/Integer;
    if-eqz v5, :cond_2

    .line 107
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->hoursSpinner:Landroid/widget/Spinner;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v8

    div-int/lit8 v8, v8, 0x3c

    invoke-virtual {v7, v8}, Landroid/widget/Spinner;->setSelection(I)V

    .line 108
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->minutesSpinner:Landroid/widget/Spinner;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v8

    rem-int/lit8 v8, v8, 0x3c

    invoke-virtual {v7, v8}, Landroid/widget/Spinner;->setSelection(I)V

    .line 111
    :cond_2
    return-object v6
.end method


# virtual methods
.method public clearViews()V
    .locals 0

    .prologue
    .line 148
    return-void
.end method

.method public getBodyAnswerState(Ljava/util/List;)Lorg/researchstack/backbone/ui/step/body/BodyAnswer;
    .locals 1
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
    .line 137
    .local p1, "stepBodyList":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/ui/step/body/StepBody;>;"
    sget-object v0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->VALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    return-object v0
.end method

.method public getBodyView(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5
    .param p1, "viewType"    # I
    .param p2, "inflater"    # Landroid/view/LayoutInflater;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 61
    iput p1, p0, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->viewType:I

    .line 63
    invoke-direct {p0, p1, p2, p3}, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->getViewForType(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 65
    .local v2, "view":Landroid/view/View;
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 66
    .local v1, "res":Landroid/content/res/Resources;
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-direct {v0, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 68
    .local v0, "layoutParams":Landroid/view/ViewGroup$MarginLayoutParams;
    sget v3, Lorg/researchstack/backbone/R$dimen;->rsb_margin_left:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 69
    sget v3, Lorg/researchstack/backbone/R$dimen;->rsb_margin_right:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 70
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 72
    return-object v2
.end method

.method public getStepResult(Z)Lorg/researchstack/backbone/result/StepResult;
    .locals 4
    .param p1, "skipped"    # Z

    .prologue
    .line 117
    if-eqz p1, :cond_0

    .line 119
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    .line 128
    :goto_0
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    return-object v2

    .line 123
    :cond_0
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->hoursSpinner:Landroid/widget/Spinner;

    invoke-virtual {v2}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v0

    .line 124
    .local v0, "hours":I
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->minutesSpinner:Landroid/widget/Spinner;

    invoke-virtual {v2}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v1

    .line 125
    .local v1, "minutes":I
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/DurationQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    mul-int/lit8 v3, v0, 0x3c

    add-int/2addr v3, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public setAnswer(Ljava/lang/String;)V
    .locals 0
    .param p1, "answer"    # Ljava/lang/String;

    .prologue
    .line 143
    return-void
.end method

.method public setOnNextListener(Lorg/researchstack/backbone/ui/step/GoToNextLayout;)V
    .locals 0
    .param p1, "goToNextLayout"    # Lorg/researchstack/backbone/ui/step/GoToNextLayout;

    .prologue
    .line 153
    return-void
.end method
