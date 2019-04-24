.class public Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;
.super Ljava/lang/Object;
.source "SingleChoiceQuestionBody.java"

# interfaces
.implements Lorg/researchstack/backbone/ui/step/body/StepBody;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/researchstack/backbone/ui/step/body/StepBody;"
    }
.end annotation


# instance fields
.field private choices:[Lorg/researchstack/backbone/model/Choice;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lorg/researchstack/backbone/model/Choice",
            "<TT;>;"
        }
    .end annotation
.end field

.field private currentSelected:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private format:Lorg/researchstack/backbone/answerformat/ChoiceAnswerFormat;

.field private radioGroup:Landroid/widget/RadioGroup;

.field private result:Lorg/researchstack/backbone/result/StepResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/researchstack/backbone/result/StepResult",
            "<TT;>;"
        }
    .end annotation
.end field

.field private step:Lorg/researchstack/backbone/step/QuestionStep;


# direct methods
.method public constructor <init>(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V
    .locals 6
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "result"    # Lorg/researchstack/backbone/result/StepResult;

    .prologue
    .line 38
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v2, p1

    .line 39
    check-cast v2, Lorg/researchstack/backbone/step/QuestionStep;

    iput-object v2, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    .line 40
    if-nez p2, :cond_0

    new-instance p2, Lorg/researchstack/backbone/result/StepResult;

    .end local p2    # "result":Lorg/researchstack/backbone/result/StepResult;
    invoke-direct {p2, p1}, Lorg/researchstack/backbone/result/StepResult;-><init>(Lorg/researchstack/backbone/step/Step;)V

    :cond_0
    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    .line 41
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v2}, Lorg/researchstack/backbone/step/QuestionStep;->getAnswerFormat()Lorg/researchstack/backbone/answerformat/AnswerFormat;

    move-result-object v2

    check-cast v2, Lorg/researchstack/backbone/answerformat/ChoiceAnswerFormat;

    iput-object v2, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->format:Lorg/researchstack/backbone/answerformat/ChoiceAnswerFormat;

    .line 42
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->format:Lorg/researchstack/backbone/answerformat/ChoiceAnswerFormat;

    invoke-virtual {v2}, Lorg/researchstack/backbone/answerformat/ChoiceAnswerFormat;->getChoices()[Lorg/researchstack/backbone/model/Choice;

    move-result-object v2

    iput-object v2, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->choices:[Lorg/researchstack/backbone/model/Choice;

    .line 45
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-virtual {v2}, Lorg/researchstack/backbone/result/StepResult;->getResult()Ljava/lang/Object;

    move-result-object v1

    .line 46
    .local v1, "resultValue":Ljava/lang/Object;, "TT;"
    if-eqz v1, :cond_2

    .line 48
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->choices:[Lorg/researchstack/backbone/model/Choice;

    array-length v4, v3

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v4, :cond_2

    aget-object v0, v3, v2

    .line 50
    .local v0, "choice":Lorg/researchstack/backbone/model/Choice;, "Lorg/researchstack/backbone/model/Choice<TT;>;"
    invoke-virtual {v0}, Lorg/researchstack/backbone/model/Choice;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 52
    invoke-virtual {v0}, Lorg/researchstack/backbone/model/Choice;->getValue()Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->currentSelected:Ljava/lang/Object;

    .line 48
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 56
    .end local v0    # "choice":Lorg/researchstack/backbone/model/Choice;, "Lorg/researchstack/backbone/model/Choice<TT;>;"
    :cond_2
    return-void
.end method

.method private getViewForType(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .param p1, "viewType"    # I
    .param p2, "inflater"    # Landroid/view/LayoutInflater;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 75
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody<TT;>;"
    if-nez p1, :cond_0

    .line 77
    invoke-direct {p0, p2, p3}, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->initViewDefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 81
    :goto_0
    return-object v0

    .line 79
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 81
    invoke-direct {p0, p2, p3}, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->initViewCompact(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 85
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
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody<TT;>;"
    const/4 v3, 0x0

    .line 127
    invoke-direct {p0, p1, p2}, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->initViewDefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 129
    .local v0, "compactView":Landroid/view/ViewGroup;
    sget v2, Lorg/researchstack/backbone/R$layout;->rsb_item_text_view_title_compact:I

    invoke-virtual {p1, v2, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 132
    .local v1, "label":Landroid/widget/TextView;
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v2}, Lorg/researchstack/backbone/step/QuestionStep;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 136
    return-object v0
.end method

.method private initViewDefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 91
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody<TT;>;"
    new-instance v3, Landroid/widget/RadioGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/RadioGroup;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->radioGroup:Landroid/widget/RadioGroup;

    .line 92
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->radioGroup:Landroid/widget/RadioGroup;

    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Landroid/widget/RadioGroup;->setShowDividers(I)V

    .line 93
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->radioGroup:Landroid/widget/RadioGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lorg/researchstack/backbone/R$drawable;->rsb_divider_empty_8dp:I

    invoke-static {v4, v5}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/RadioGroup;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 96
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->choices:[Lorg/researchstack/backbone/model/Choice;

    array-length v3, v3

    if-ge v1, v3, :cond_1

    .line 98
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->choices:[Lorg/researchstack/backbone/model/Choice;

    aget-object v0, v3, v1

    .line 99
    .local v0, "choice":Lorg/researchstack/backbone/model/Choice;
    sget v3, Lorg/researchstack/backbone/R$layout;->rsb_item_radio:I

    iget-object v4, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->radioGroup:Landroid/widget/RadioGroup;

    const/4 v5, 0x0

    invoke-virtual {p1, v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RadioButton;

    .line 102
    .local v2, "radioButton":Landroid/widget/RadioButton;
    invoke-virtual {v0}, Lorg/researchstack/backbone/model/Choice;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 103
    invoke-virtual {v2, v1}, Landroid/widget/RadioButton;->setId(I)V

    .line 105
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->currentSelected:Ljava/lang/Object;

    if-eqz v3, :cond_0

    .line 107
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->currentSelected:Ljava/lang/Object;

    invoke-virtual {v0}, Lorg/researchstack/backbone/model/Choice;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 110
    :cond_0
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->radioGroup:Landroid/widget/RadioGroup;

    invoke-virtual {v3, v2}, Landroid/widget/RadioGroup;->addView(Landroid/view/View;)V

    .line 96
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 113
    .end local v0    # "choice":Lorg/researchstack/backbone/model/Choice;
    .end local v2    # "radioButton":Landroid/widget/RadioButton;
    :cond_1
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->radioGroup:Landroid/widget/RadioGroup;

    invoke-static {p0}, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody$$Lambda$1;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;)Landroid/widget/RadioGroup$OnCheckedChangeListener;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 122
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->radioGroup:Landroid/widget/RadioGroup;

    return-object v3
.end method

.method static synthetic lambda$initViewDefault$26(Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;Landroid/widget/RadioGroup;I)V
    .locals 2
    .param p1, "group"    # Landroid/widget/RadioGroup;
    .param p2, "checkedId"    # I

    .prologue
    .line 114
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody<TT;>;"
    const/4 v1, -0x1

    if-ne p2, v1, :cond_0

    .line 115
    const/4 v1, 0x0

    iput-object v1, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->currentSelected:Ljava/lang/Object;

    .line 120
    :goto_0
    return-void

    .line 117
    :cond_0
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->choices:[Lorg/researchstack/backbone/model/Choice;

    aget-object v0, v1, p2

    .line 118
    .local v0, "choice":Lorg/researchstack/backbone/model/Choice;, "Lorg/researchstack/backbone/model/Choice<TT;>;"
    invoke-virtual {v0}, Lorg/researchstack/backbone/model/Choice;->getValue()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->currentSelected:Ljava/lang/Object;

    goto :goto_0
.end method


# virtual methods
.method public clearViews()V
    .locals 1

    .prologue
    .line 180
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody<TT;>;"
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->radioGroup:Landroid/widget/RadioGroup;

    invoke-virtual {v0}, Landroid/widget/RadioGroup;->clearCheck()V

    .line 181
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
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody<TT;>;"
    .local p1, "stepBodyList":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/ui/step/body/StepBody;>;"
    const/4 v3, 0x0

    .line 157
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->currentSelected:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 159
    new-instance v0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    sget v1, Lorg/researchstack/backbone/R$string;->rsb_invalid_answer_choice:I

    new-array v2, v3, [Ljava/lang/String;

    invoke-direct {v0, v3, v1, v2}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;-><init>(ZI[Ljava/lang/String;)V

    .line 163
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->VALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    goto :goto_0
.end method

.method public getBodyView(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5
    .param p1, "viewType"    # I
    .param p2, "inflater"    # Landroid/view/LayoutInflater;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 61
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody<TT;>;"
    invoke-direct {p0, p1, p2, p3}, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->getViewForType(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 63
    .local v2, "view":Landroid/view/View;
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 64
    .local v1, "res":Landroid/content/res/Resources;
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-direct {v0, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 66
    .local v0, "layoutParams":Landroid/view/ViewGroup$MarginLayoutParams;
    sget v3, Lorg/researchstack/backbone/R$dimen;->rsb_margin_left:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 67
    sget v3, Lorg/researchstack/backbone/R$dimen;->rsb_margin_right:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 68
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 70
    return-object v2
.end method

.method public getStepResult(Z)Lorg/researchstack/backbone/result/StepResult;
    .locals 2
    .param p1, "skipped"    # Z

    .prologue
    .line 142
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody<TT;>;"
    if-eqz p1, :cond_0

    .line 144
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    .line 151
    :goto_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    return-object v0

    .line 148
    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->currentSelected:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public setAnswer(Ljava/lang/String;)V
    .locals 3
    .param p1, "answer"    # Ljava/lang/String;

    .prologue
    .line 169
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody<TT;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->choices:[Lorg/researchstack/backbone/model/Choice;

    array-length v2, v2

    if-ge v0, v2, :cond_0

    .line 170
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->choices:[Lorg/researchstack/backbone/model/Choice;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Lorg/researchstack/backbone/model/Choice;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 171
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;->radioGroup:Landroid/widget/RadioGroup;

    invoke-virtual {v2, v0}, Landroid/widget/RadioGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RadioButton;

    .line 172
    .local v1, "radioButton":Landroid/widget/RadioButton;
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 176
    .end local v1    # "radioButton":Landroid/widget/RadioButton;
    :cond_0
    return-void

    .line 169
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public setOnNextListener(Lorg/researchstack/backbone/ui/step/GoToNextLayout;)V
    .locals 0
    .param p1, "goToNextLayout"    # Lorg/researchstack/backbone/ui/step/GoToNextLayout;

    .prologue
    .line 186
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody<TT;>;"
    return-void
.end method
