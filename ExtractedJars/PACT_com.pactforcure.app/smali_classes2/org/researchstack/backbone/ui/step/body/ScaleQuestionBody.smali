.class public Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;
.super Ljava/lang/Object;
.source "ScaleQuestionBody.java"

# interfaces
.implements Lorg/researchstack/backbone/ui/step/body/StepBody;


# instance fields
.field private currentValueView:Landroid/widget/TextView;

.field private final format:Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;

.field private final result:Lorg/researchstack/backbone/result/StepResult;

.field private seekBar:Landroid/widget/SeekBar;

.field private final step:Lorg/researchstack/backbone/step/QuestionStep;

.field private viewType:I


# direct methods
.method public constructor <init>(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V
    .locals 1
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "result"    # Lorg/researchstack/backbone/result/StepResult;

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v0, p1

    .line 44
    check-cast v0, Lorg/researchstack/backbone/step/QuestionStep;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    .line 45
    if-nez p2, :cond_0

    new-instance p2, Lorg/researchstack/backbone/result/StepResult;

    .end local p2    # "result":Lorg/researchstack/backbone/result/StepResult;
    invoke-direct {p2, p1}, Lorg/researchstack/backbone/result/StepResult;-><init>(Lorg/researchstack/backbone/step/Step;)V

    :cond_0
    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    .line 46
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v0}, Lorg/researchstack/backbone/step/QuestionStep;->getAnswerFormat()Lorg/researchstack/backbone/answerformat/AnswerFormat;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->format:Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;

    .line 47
    return-void
.end method

.method static synthetic access$000(Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;)Landroid/widget/TextView;
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;

    .prologue
    .line 26
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->currentValueView:Landroid/widget/TextView;

    return-object v0
.end method

.method private getViewForType(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .param p1, "viewType"    # I
    .param p2, "inflater"    # Landroid/view/LayoutInflater;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 74
    packed-switch p1, :pswitch_data_0

    .line 79
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid View Type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 77
    :pswitch_0
    invoke-direct {p0, p2, p3}, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->initView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 74
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private initView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 84
    sget v5, Lorg/researchstack/backbone/R$layout;->rsb_item_seek_bar:I

    const/4 v6, 0x0

    invoke-virtual {p1, v5, p2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 85
    .local v0, "bodyView":Landroid/view/View;
    sget v5, Lorg/researchstack/backbone/R$id;->seekBar:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/SeekBar;

    iput-object v5, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->seekBar:Landroid/widget/SeekBar;

    .line 86
    sget v5, Lorg/researchstack/backbone/R$id;->currentValueView:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->currentValueView:Landroid/widget/TextView;

    .line 88
    sget v5, Lorg/researchstack/backbone/R$id;->minValueView:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 89
    .local v4, "minValueView":Landroid/widget/TextView;
    sget v5, Lorg/researchstack/backbone/R$id;->maxValueView:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 90
    .local v2, "maxValueView":Landroid/widget/TextView;
    sget v5, Lorg/researchstack/backbone/R$id;->minValueHintView:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 91
    .local v3, "minValueHintView":Landroid/widget/TextView;
    sget v5, Lorg/researchstack/backbone/R$id;->maxValueHintView:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 93
    .local v1, "maxValueHintView":Landroid/widget/TextView;
    iget-object v5, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->format:Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;

    invoke-virtual {v5}, Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;->getMin()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    iget-object v5, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->format:Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;

    invoke-virtual {v5}, Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;->getMax()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    iget-object v5, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->format:Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;

    invoke-virtual {v5}, Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;->getMinValueHint()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    iget-object v5, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->format:Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;

    invoke-virtual {v5}, Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;->getMaxValueHint()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {p0, v5}, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->setFilters(Landroid/content/Context;)V

    .line 100
    return-object v0
.end method

.method private setFilters(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 104
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->format:Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;

    invoke-virtual {v0}, Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;->getMin()I

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Scale with min value != 0 is not supported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 107
    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->seekBar:Landroid/widget/SeekBar;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->format:Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;

    invoke-virtual {v1}, Lorg/researchstack/backbone/answerformat/ScaleAnswerFormat;->getMax()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 108
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->seekBar:Landroid/widget/SeekBar;

    new-instance v1, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody$1;

    invoke-direct {v1, p0}, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody$1;-><init>(Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;)V

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 124
    return-void
.end method


# virtual methods
.method public clearViews()V
    .locals 2

    .prologue
    .line 160
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->seekBar:Landroid/widget/SeekBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 161
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->currentValueView:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
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
    .line 145
    .local p1, "formStepChildren":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/ui/step/body/StepBody;>;"
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->currentValueView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->INVALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->VALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    goto :goto_0
.end method

.method public getBodyView(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .param p1, "viewType"    # I
    .param p2, "inflater"    # Landroid/view/LayoutInflater;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 51
    iput p1, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->viewType:I

    .line 53
    invoke-direct {p0, p1, p2, p3}, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->getViewForType(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 55
    .local v3, "view":Landroid/view/View;
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 56
    .local v1, "res":Landroid/content/res/Resources;
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    const/4 v5, -0x2

    invoke-direct {v0, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 58
    .local v0, "layoutParams":Landroid/view/ViewGroup$MarginLayoutParams;
    sget v4, Lorg/researchstack/backbone/R$dimen;->rsb_margin_right:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    iput v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 59
    sget v4, Lorg/researchstack/backbone/R$dimen;->rsb_margin_right:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    iput v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 60
    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 64
    :try_start_0
    iget-object v4, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-virtual {v4}, Lorg/researchstack/backbone/result/StepResult;->getResult()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 65
    .local v2, "value":I
    iget-object v4, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->seekBar:Landroid/widget/SeekBar;

    invoke-virtual {v4, v2}, Landroid/widget/SeekBar;->setProgress(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .end local v2    # "value":I
    :goto_0
    return-object v3

    .line 66
    :catch_0
    move-exception v4

    goto :goto_0
.end method

.method public getStepResult(Z)Lorg/researchstack/backbone/result/StepResult;
    .locals 2
    .param p1, "skipped"    # Z

    .prologue
    const/4 v1, 0x0

    .line 128
    if-eqz p1, :cond_0

    .line 130
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    .line 140
    :goto_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    return-object v0

    .line 134
    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->currentValueView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 135
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    goto :goto_0

    .line 137
    :cond_1
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->seekBar:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public setAnswer(Ljava/lang/String;)V
    .locals 4
    .param p1, "answer"    # Ljava/lang/String;

    .prologue
    .line 151
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    .line 152
    .local v1, "value":Ljava/lang/Integer;
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->seekBar:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setProgress(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    .end local v1    # "value":Ljava/lang/Integer;
    :goto_0
    return-void

    .line 153
    :catch_0
    move-exception v0

    .line 154
    .local v0, "e":Ljava/lang/NumberFormatException;
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->seekBar:Landroid/widget/SeekBar;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setProgress(I)V

    goto :goto_0
.end method

.method public setOnNextListener(Lorg/researchstack/backbone/ui/step/GoToNextLayout;)V
    .locals 0
    .param p1, "goToNextLayout"    # Lorg/researchstack/backbone/ui/step/GoToNextLayout;

    .prologue
    .line 167
    return-void
.end method
