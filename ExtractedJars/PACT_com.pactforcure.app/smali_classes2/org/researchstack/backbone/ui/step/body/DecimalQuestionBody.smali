.class public Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;
.super Ljava/lang/Object;
.source "DecimalQuestionBody.java"

# interfaces
.implements Lorg/researchstack/backbone/ui/step/body/StepBody;


# instance fields
.field private editText:Landroid/widget/EditText;

.field private format:Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;

.field private result:Lorg/researchstack/backbone/result/StepResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/researchstack/backbone/result/StepResult",
            "<",
            "Ljava/lang/Float;",
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
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v0, p1

    .line 42
    check-cast v0, Lorg/researchstack/backbone/step/QuestionStep;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    .line 43
    if-nez p2, :cond_0

    new-instance p2, Lorg/researchstack/backbone/result/StepResult;

    .end local p2    # "result":Lorg/researchstack/backbone/result/StepResult;
    invoke-direct {p2, p1}, Lorg/researchstack/backbone/result/StepResult;-><init>(Lorg/researchstack/backbone/step/Step;)V

    :cond_0
    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    .line 44
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v0}, Lorg/researchstack/backbone/step/QuestionStep;->getAnswerFormat()Lorg/researchstack/backbone/answerformat/AnswerFormat;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;

    .line 45
    return-void
.end method

.method private getViewForType(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .param p1, "viewType"    # I
    .param p2, "inflater"    # Landroid/view/LayoutInflater;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 66
    if-nez p1, :cond_0

    .line 68
    invoke-direct {p0, p2, p3}, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->initViewDefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 72
    :goto_0
    return-object v0

    .line 70
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 72
    invoke-direct {p0, p2, p3}, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->initViewCompact(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 76
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid View Type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private initViewCompact(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 90
    sget v2, Lorg/researchstack/backbone/R$layout;->rsb_item_edit_text_compact:I

    const/4 v3, 0x0

    invoke-virtual {p1, v2, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 92
    .local v0, "formItemView":Landroid/view/View;
    sget v2, Lorg/researchstack/backbone/R$id;->label:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 93
    .local v1, "title":Landroid/widget/TextView;
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v2}, Lorg/researchstack/backbone/step/QuestionStep;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    sget v2, Lorg/researchstack/backbone/R$id;->value:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    iput-object v2, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->editText:Landroid/widget/EditText;

    .line 96
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {p0, v2}, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->setFilters(Landroid/content/Context;)V

    .line 98
    return-object v0
.end method

.method private initViewDefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 82
    sget v0, Lorg/researchstack/backbone/R$layout;->rsb_item_edit_text:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->editText:Landroid/widget/EditText;

    .line 83
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->setFilters(Landroid/content/Context;)V

    .line 85
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->editText:Landroid/widget/EditText;

    return-object v0
.end method

.method private setFilters(Landroid/content/Context;)V
    .locals 13
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v12, 0x1

    .line 103
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v7, v12}, Landroid/widget/EditText;->setSingleLine(Z)V

    .line 104
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;

    invoke-virtual {v7}, Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;->getMinValue()F

    move-result v5

    .line 106
    .local v5, "minValue":F
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;

    invoke-virtual {v7}, Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;->getMaxValue()F

    move-result v7

    const/4 v8, 0x0

    cmpl-float v7, v7, v8

    if-nez v7, :cond_1

    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 108
    .local v3, "maxValue":F
    :goto_0
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v7}, Lorg/researchstack/backbone/step/QuestionStep;->getPlaceholder()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_2

    .line 110
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->editText:Landroid/widget/EditText;

    iget-object v8, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v8}, Lorg/researchstack/backbone/step/QuestionStep;->getPlaceholder()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 123
    :goto_1
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->editText:Landroid/widget/EditText;

    const/16 v8, 0x2002

    invoke-virtual {v7, v8}, Landroid/widget/EditText;->setInputType(I)V

    .line 125
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-virtual {v7}, Lorg/researchstack/backbone/result/StepResult;->getResult()Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_0

    .line 127
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->editText:Landroid/widget/EditText;

    iget-object v8, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-virtual {v8}, Lorg/researchstack/backbone/result/StepResult;->getResult()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 130
    :cond_0
    invoke-static {v5}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v4

    .line 131
    .local v4, "minStr":Ljava/lang/String;
    invoke-static {v3}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v2

    .line 132
    .local v2, "maxStr":Ljava/lang/String;
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-lt v7, v8, :cond_4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    .line 133
    .local v0, "maxLength":I
    :goto_2
    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v1, v0}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    .line 134
    .local v1, "maxLengthFilter":Landroid/text/InputFilter$LengthFilter;
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v7}, Landroid/widget/EditText;->getFilters()[Landroid/text/InputFilter;

    move-result-object v7

    invoke-static {v7, v1}, Lorg/researchstack/backbone/utils/ViewUtils;->addFilter([Landroid/text/InputFilter;Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object v6

    .line 135
    .local v6, "newFilters":[Landroid/text/InputFilter;
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v7, v6}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 136
    return-void

    .line 106
    .end local v0    # "maxLength":I
    .end local v1    # "maxLengthFilter":Landroid/text/InputFilter$LengthFilter;
    .end local v2    # "maxStr":Ljava/lang/String;
    .end local v3    # "maxValue":F
    .end local v4    # "minStr":Ljava/lang/String;
    .end local v6    # "newFilters":[Landroid/text/InputFilter;
    :cond_1
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;

    invoke-virtual {v7}, Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;->getMaxValue()F

    move-result v3

    goto :goto_0

    .line 112
    .restart local v3    # "maxValue":F
    :cond_2
    const/high16 v7, 0x4f000000

    cmpl-float v7, v3, v7

    if-nez v7, :cond_3

    .line 114
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->editText:Landroid/widget/EditText;

    sget v8, Lorg/researchstack/backbone/R$string;->rsb_hint_step_body_int_no_max:I

    invoke-virtual {p1, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 118
    :cond_3
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->editText:Landroid/widget/EditText;

    sget v8, Lorg/researchstack/backbone/R$string;->rsb_hint_step_body_dec:I

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    .line 119
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    aput-object v11, v9, v10

    .line 120
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    aput-object v10, v9, v12

    .line 118
    invoke-virtual {p1, v8, v9}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 132
    .restart local v2    # "maxStr":Ljava/lang/String;
    .restart local v4    # "minStr":Ljava/lang/String;
    :cond_4
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_2
.end method


# virtual methods
.method public clearViews()V
    .locals 0

    .prologue
    .line 175
    return-void
.end method

.method public getBodyAnswerState(Ljava/util/List;)Lorg/researchstack/backbone/ui/step/body/BodyAnswer;
    .locals 2
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
    .line 160
    .local p1, "stepBodyList":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/ui/step/body/StepBody;>;"
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->editText:Landroid/widget/EditText;

    if-nez v0, :cond_0

    .line 161
    sget-object v0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->INVALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    .line 164
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->format:Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/answerformat/DecimalAnswerFormat;->validateAnswer(Ljava/lang/String;)Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    move-result-object v0

    goto :goto_0
.end method

.method public getBodyView(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5
    .param p1, "viewType"    # I
    .param p2, "inflater"    # Landroid/view/LayoutInflater;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 50
    iput p1, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->viewType:I

    .line 52
    invoke-direct {p0, p1, p2, p3}, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->getViewForType(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 54
    .local v2, "view":Landroid/view/View;
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 55
    .local v1, "res":Landroid/content/res/Resources;
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-direct {v0, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 57
    .local v0, "layoutParams":Landroid/view/ViewGroup$MarginLayoutParams;
    sget v3, Lorg/researchstack/backbone/R$dimen;->rsb_margin_left:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 58
    sget v3, Lorg/researchstack/backbone/R$dimen;->rsb_margin_right:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 59
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 61
    return-object v2
.end method

.method public getStepResult(Z)Lorg/researchstack/backbone/result/StepResult;
    .locals 3
    .param p1, "skipped"    # Z

    .prologue
    .line 141
    if-eqz p1, :cond_1

    .line 143
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    .line 154
    :cond_0
    :goto_0
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    return-object v1

    .line 147
    :cond_1
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 148
    .local v0, "numString":Ljava/lang/String;
    invoke-static {v0}, Lorg/researchstack/backbone/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 150
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/DecimalQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public setAnswer(Ljava/lang/String;)V
    .locals 0
    .param p1, "answer"    # Ljava/lang/String;

    .prologue
    .line 170
    return-void
.end method

.method public setOnNextListener(Lorg/researchstack/backbone/ui/step/GoToNextLayout;)V
    .locals 0
    .param p1, "goToNextLayout"    # Lorg/researchstack/backbone/ui/step/GoToNextLayout;

    .prologue
    .line 180
    return-void
.end method
