.class public Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;
.super Ljava/lang/Object;
.source "IntegerQuestionBody.java"

# interfaces
.implements Lorg/researchstack/backbone/ui/step/body/StepBody;


# instance fields
.field private editText:Landroid/widget/EditText;

.field private format:Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;

.field private goToNextListener:Lorg/researchstack/backbone/ui/step/GoToNextLayout;

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
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v0, p1

    .line 43
    check-cast v0, Lorg/researchstack/backbone/step/QuestionStep;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    .line 44
    if-nez p2, :cond_0

    new-instance p2, Lorg/researchstack/backbone/result/StepResult;

    .end local p2    # "result":Lorg/researchstack/backbone/result/StepResult;
    invoke-direct {p2, p1}, Lorg/researchstack/backbone/result/StepResult;-><init>(Lorg/researchstack/backbone/step/Step;)V

    :cond_0
    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    .line 45
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v0}, Lorg/researchstack/backbone/step/QuestionStep;->getAnswerFormat()Lorg/researchstack/backbone/answerformat/AnswerFormat;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->format:Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;

    .line 46
    return-void
.end method

.method private getViewForType(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .param p1, "viewType"    # I
    .param p2, "inflater"    # Landroid/view/LayoutInflater;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 67
    if-nez p1, :cond_0

    .line 69
    invoke-direct {p0, p2, p3}, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->initViewDefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 73
    :goto_0
    return-object v0

    .line 71
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 73
    invoke-direct {p0, p2, p3}, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->initViewCompact(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 77
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
    .line 92
    sget v2, Lorg/researchstack/backbone/R$layout;->rsb_item_edit_text_compact:I

    const/4 v3, 0x0

    invoke-virtual {p1, v2, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 94
    .local v0, "formItemView":Landroid/view/View;
    sget v2, Lorg/researchstack/backbone/R$id;->label:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 95
    .local v1, "title":Landroid/widget/TextView;
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v2}, Lorg/researchstack/backbone/step/QuestionStep;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    sget v2, Lorg/researchstack/backbone/R$id;->value:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    iput-object v2, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    .line 98
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {p0, v2}, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->setFilters(Landroid/content/Context;)V

    .line 99
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->setGoToNextListener()V

    .line 101
    return-object v0
.end method

.method private initViewDefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 83
    sget v0, Lorg/researchstack/backbone/R$layout;->rsb_item_edit_text:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    .line 84
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->setFilters(Landroid/content/Context;)V

    .line 85
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->setGoToNextListener()V

    .line 87
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic lambda$setGoToNextListener$24(Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;
    .param p1, "v"    # Landroid/widget/TextView;
    .param p2, "actionId"    # I
    .param p3, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 106
    const/4 v0, 0x5

    if-ne p2, v0, :cond_0

    .line 107
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->goToNextListener:Lorg/researchstack/backbone/ui/step/GoToNextLayout;

    invoke-interface {v0}, Lorg/researchstack/backbone/ui/step/GoToNextLayout;->onNextClicked()V

    .line 108
    const/4 v0, 0x1

    .line 110
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private setFilters(Landroid/content/Context;)V
    .locals 14
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const v7, 0x7fffffff

    const/4 v13, 0x2

    const/4 v12, 0x1

    .line 116
    iget-object v8, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v8, v12}, Landroid/widget/EditText;->setSingleLine(Z)V

    .line 117
    iget-object v8, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->format:Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;

    invoke-virtual {v8}, Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;->getMinValue()I

    move-result v5

    .line 119
    .local v5, "minValue":I
    iget-object v8, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->format:Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;

    invoke-virtual {v8}, Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;->getMaxValue()I

    move-result v8

    if-nez v8, :cond_1

    move v3, v7

    .line 121
    .local v3, "maxValue":I
    :goto_0
    iget-object v8, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v8}, Lorg/researchstack/backbone/step/QuestionStep;->getPlaceholder()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_2

    .line 123
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    iget-object v8, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v8}, Lorg/researchstack/backbone/step/QuestionStep;->getPlaceholder()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 136
    :goto_1
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v7, v13}, Landroid/widget/EditText;->setInputType(I)V

    .line 138
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-virtual {v7}, Lorg/researchstack/backbone/result/StepResult;->getResult()Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_0

    .line 140
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    iget-object v8, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-virtual {v8}, Lorg/researchstack/backbone/result/StepResult;->getResult()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 143
    :cond_0
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    .line 144
    .local v4, "minStr":Ljava/lang/String;
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 145
    .local v2, "maxStr":Ljava/lang/String;
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-lt v7, v8, :cond_4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    .line 146
    .local v0, "maxLength":I
    :goto_2
    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v1, v0}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    .line 147
    .local v1, "maxLengthFilter":Landroid/text/InputFilter$LengthFilter;
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v7}, Landroid/widget/EditText;->getFilters()[Landroid/text/InputFilter;

    move-result-object v7

    invoke-static {v7, v1}, Lorg/researchstack/backbone/utils/ViewUtils;->addFilter([Landroid/text/InputFilter;Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object v6

    .line 148
    .local v6, "newFilters":[Landroid/text/InputFilter;
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v7, v6}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 149
    return-void

    .line 119
    .end local v0    # "maxLength":I
    .end local v1    # "maxLengthFilter":Landroid/text/InputFilter$LengthFilter;
    .end local v2    # "maxStr":Ljava/lang/String;
    .end local v3    # "maxValue":I
    .end local v4    # "minStr":Ljava/lang/String;
    .end local v6    # "newFilters":[Landroid/text/InputFilter;
    :cond_1
    iget-object v8, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->format:Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;

    invoke-virtual {v8}, Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;->getMaxValue()I

    move-result v3

    goto :goto_0

    .line 125
    .restart local v3    # "maxValue":I
    :cond_2
    if-ne v3, v7, :cond_3

    .line 127
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    sget v8, Lorg/researchstack/backbone/R$string;->rsb_hint_step_body_int_no_max:I

    invoke-virtual {p1, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 131
    :cond_3
    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    sget v8, Lorg/researchstack/backbone/R$string;->rsb_hint_step_body_int:I

    new-array v9, v13, [Ljava/lang/Object;

    const/4 v10, 0x0

    .line 132
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v9, v10

    .line 133
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v12

    .line 131
    invoke-virtual {p1, v8, v9}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 145
    .restart local v2    # "maxStr":Ljava/lang/String;
    .restart local v4    # "minStr":Ljava/lang/String;
    :cond_4
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_2
.end method

.method private setGoToNextListener()V
    .locals 2

    .prologue
    .line 105
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    invoke-static {p0}, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody$$Lambda$1;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;)Landroid/widget/TextView$OnEditorActionListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 112
    return-void
.end method


# virtual methods
.method public clearViews()V
    .locals 2

    .prologue
    .line 188
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 189
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
    .line 173
    .local p1, "stepBodyList":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/ui/step/body/StepBody;>;"
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    if-nez v0, :cond_0

    .line 175
    sget-object v0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->INVALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    .line 178
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->format:Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/answerformat/IntegerAnswerFormat;->validateAnswer(Ljava/lang/String;)Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    move-result-object v0

    goto :goto_0
.end method

.method public getBodyView(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5
    .param p1, "viewType"    # I
    .param p2, "inflater"    # Landroid/view/LayoutInflater;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 51
    iput p1, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->viewType:I

    .line 53
    invoke-direct {p0, p1, p2, p3}, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->getViewForType(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 55
    .local v2, "view":Landroid/view/View;
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 56
    .local v1, "res":Landroid/content/res/Resources;
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-direct {v0, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 58
    .local v0, "layoutParams":Landroid/view/ViewGroup$MarginLayoutParams;
    sget v3, Lorg/researchstack/backbone/R$dimen;->rsb_margin_left:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 59
    sget v3, Lorg/researchstack/backbone/R$dimen;->rsb_margin_right:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 60
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 62
    return-object v2
.end method

.method public getStepResult(Z)Lorg/researchstack/backbone/result/StepResult;
    .locals 3
    .param p1, "skipped"    # Z

    .prologue
    .line 154
    if-eqz p1, :cond_1

    .line 156
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    .line 167
    :cond_0
    :goto_0
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    return-object v1

    .line 160
    :cond_1
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 161
    .local v0, "numString":Ljava/lang/String;
    invoke-static {v0}, Lorg/researchstack/backbone/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 163
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public setAnswer(Ljava/lang/String;)V
    .locals 1
    .param p1, "answer"    # Ljava/lang/String;

    .prologue
    .line 183
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 184
    return-void
.end method

.method public setOnNextListener(Lorg/researchstack/backbone/ui/step/GoToNextLayout;)V
    .locals 0
    .param p1, "goToNextLayoutListener"    # Lorg/researchstack/backbone/ui/step/GoToNextLayout;

    .prologue
    .line 193
    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/body/IntegerQuestionBody;->goToNextListener:Lorg/researchstack/backbone/ui/step/GoToNextLayout;

    .line 194
    return-void
.end method
