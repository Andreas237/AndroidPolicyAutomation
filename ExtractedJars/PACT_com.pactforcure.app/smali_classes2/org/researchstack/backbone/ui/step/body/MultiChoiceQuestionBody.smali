.class public Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;
.super Ljava/lang/Object;
.source "MultiChoiceQuestionBody.java"

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

.field private currentSelected:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<TT;>;"
        }
    .end annotation
.end field

.field private format:Lorg/researchstack/backbone/answerformat/ChoiceAnswerFormat;

.field private result:Lorg/researchstack/backbone/result/StepResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/researchstack/backbone/result/StepResult",
            "<[TT;>;"
        }
    .end annotation
.end field

.field private step:Lorg/researchstack/backbone/step/QuestionStep;


# direct methods
.method public constructor <init>(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V
    .locals 3
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "result"    # Lorg/researchstack/backbone/result/StepResult;

    .prologue
    .line 38
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 39
    check-cast v1, Lorg/researchstack/backbone/step/QuestionStep;

    iput-object v1, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    .line 40
    if-nez p2, :cond_0

    new-instance p2, Lorg/researchstack/backbone/result/StepResult;

    .end local p2    # "result":Lorg/researchstack/backbone/result/StepResult;
    invoke-direct {p2, p1}, Lorg/researchstack/backbone/result/StepResult;-><init>(Lorg/researchstack/backbone/step/Step;)V

    :cond_0
    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    .line 41
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v1}, Lorg/researchstack/backbone/step/QuestionStep;->getAnswerFormat()Lorg/researchstack/backbone/answerformat/AnswerFormat;

    move-result-object v1

    check-cast v1, Lorg/researchstack/backbone/answerformat/ChoiceAnswerFormat;

    iput-object v1, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->format:Lorg/researchstack/backbone/answerformat/ChoiceAnswerFormat;

    .line 42
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->format:Lorg/researchstack/backbone/answerformat/ChoiceAnswerFormat;

    invoke-virtual {v1}, Lorg/researchstack/backbone/answerformat/ChoiceAnswerFormat;->getChoices()[Lorg/researchstack/backbone/model/Choice;

    move-result-object v1

    iput-object v1, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->choices:[Lorg/researchstack/backbone/model/Choice;

    .line 45
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->currentSelected:Ljava/util/Set;

    .line 47
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-virtual {v1}, Lorg/researchstack/backbone/result/StepResult;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    .line 48
    .local v0, "resultArray":[Ljava/lang/Object;, "[TT;"
    if-eqz v0, :cond_1

    array-length v1, v0

    if-lez v1, :cond_1

    .line 50
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->currentSelected:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 52
    :cond_1
    return-void
.end method

.method private getViewForType(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .param p1, "viewType"    # I
    .param p2, "inflater"    # Landroid/view/LayoutInflater;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 71
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody<TT;>;"
    if-nez p1, :cond_0

    .line 73
    invoke-direct {p0, p2, p3}, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->initViewDefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 77
    :goto_0
    return-object v0

    .line 75
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 77
    invoke-direct {p0, p2, p3}, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->initViewCompact(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 81
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
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody<TT;>;"
    const/4 v3, 0x0

    .line 129
    invoke-direct {p0, p1, p2}, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->initViewDefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 131
    .local v0, "compactView":Landroid/view/ViewGroup;
    sget v2, Lorg/researchstack/backbone/R$layout;->rsb_item_text_view_title_compact:I

    invoke-virtual {p1, v2, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 134
    .local v1, "label":Landroid/widget/TextView;
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v2}, Lorg/researchstack/backbone/step/QuestionStep;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 136
    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 138
    return-object v0
.end method

.method private initViewDefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 87
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody<TT;>;"
    new-instance v3, Landroid/widget/RadioGroup;

    invoke-virtual {p1}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/RadioGroup;-><init>(Landroid/content/Context;)V

    .line 88
    .local v3, "radioGroup":Landroid/widget/RadioGroup;
    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Landroid/widget/RadioGroup;->setShowDividers(I)V

    .line 89
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lorg/researchstack/backbone/R$drawable;->rsb_divider_empty_8dp:I

    invoke-static {v4, v5}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/RadioGroup;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 92
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    iget-object v4, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->choices:[Lorg/researchstack/backbone/model/Choice;

    array-length v4, v4

    if-ge v1, v4, :cond_1

    .line 94
    iget-object v4, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->choices:[Lorg/researchstack/backbone/model/Choice;

    aget-object v2, v4, v1

    .line 97
    .local v2, "item":Lorg/researchstack/backbone/model/Choice;, "Lorg/researchstack/backbone/model/Choice<TT;>;"
    sget v4, Lorg/researchstack/backbone/R$layout;->rsb_item_checkbox:I

    const/4 v5, 0x0

    invoke-virtual {p1, v4, v3, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/AppCompatCheckBox;

    .line 100
    .local v0, "checkBox":Landroid/support/v7/widget/AppCompatCheckBox;
    invoke-virtual {v2}, Lorg/researchstack/backbone/model/Choice;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/AppCompatCheckBox;->setText(Ljava/lang/CharSequence;)V

    .line 101
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/AppCompatCheckBox;->setId(I)V

    .line 102
    invoke-virtual {v3, v0}, Landroid/widget/RadioGroup;->addView(Landroid/view/View;)V

    .line 105
    iget-object v4, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->currentSelected:Ljava/util/Set;

    invoke-virtual {v2}, Lorg/researchstack/backbone/model/Choice;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 107
    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/AppCompatCheckBox;->setChecked(Z)V

    .line 111
    :cond_0
    invoke-static {p0, v2}, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody$$Lambda$1;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;Lorg/researchstack/backbone/model/Choice;)Landroid/widget/CompoundButton$OnCheckedChangeListener;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/AppCompatCheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 92
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 124
    .end local v0    # "checkBox":Landroid/support/v7/widget/AppCompatCheckBox;
    .end local v2    # "item":Lorg/researchstack/backbone/model/Choice;, "Lorg/researchstack/backbone/model/Choice<TT;>;"
    :cond_1
    return-object v3
.end method

.method static synthetic lambda$initViewDefault$25(Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;Lorg/researchstack/backbone/model/Choice;Landroid/widget/CompoundButton;Z)V
    .locals 2
    .param p2, "buttonView"    # Landroid/widget/CompoundButton;
    .param p3, "isChecked"    # Z

    .prologue
    .line 113
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody<TT;>;"
    if-eqz p3, :cond_0

    .line 115
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->currentSelected:Ljava/util/Set;

    invoke-virtual {p1}, Lorg/researchstack/backbone/model/Choice;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 121
    :goto_0
    return-void

    .line 119
    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->currentSelected:Ljava/util/Set;

    invoke-virtual {p1}, Lorg/researchstack/backbone/model/Choice;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method


# virtual methods
.method public clearViews()V
    .locals 0

    .prologue
    .line 177
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody<TT;>;"
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
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody<TT;>;"
    .local p1, "stepBodyList":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/ui/step/body/StepBody;>;"
    const/4 v3, 0x0

    .line 159
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->currentSelected:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 161
    new-instance v0, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    sget v1, Lorg/researchstack/backbone/R$string;->rsb_invalid_answer_choice:I

    new-array v2, v3, [Ljava/lang/String;

    invoke-direct {v0, v3, v1, v2}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;-><init>(ZI[Ljava/lang/String;)V

    .line 165
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
    .line 57
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody<TT;>;"
    invoke-direct {p0, p1, p2, p3}, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->getViewForType(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 59
    .local v2, "view":Landroid/view/View;
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 60
    .local v1, "res":Landroid/content/res/Resources;
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-direct {v0, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 62
    .local v0, "layoutParams":Landroid/view/ViewGroup$MarginLayoutParams;
    sget v3, Lorg/researchstack/backbone/R$dimen;->rsb_margin_left:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 63
    sget v3, Lorg/researchstack/backbone/R$dimen;->rsb_margin_right:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 64
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 66
    return-object v2
.end method

.method public getStepResult(Z)Lorg/researchstack/backbone/result/StepResult;
    .locals 2
    .param p1, "skipped"    # Z

    .prologue
    .line 144
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody<TT;>;"
    if-eqz p1, :cond_0

    .line 146
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->currentSelected:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 147
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->currentSelected:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    .line 153
    :goto_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    return-object v0

    .line 151
    :cond_0
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;->currentSelected:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public setAnswer(Ljava/lang/String;)V
    .locals 0
    .param p1, "answer"    # Ljava/lang/String;

    .prologue
    .line 172
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody<TT;>;"
    return-void
.end method

.method public setOnNextListener(Lorg/researchstack/backbone/ui/step/GoToNextLayout;)V
    .locals 0
    .param p1, "goToNextLayout"    # Lorg/researchstack/backbone/ui/step/GoToNextLayout;

    .prologue
    .line 182
    .local p0, "this":Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody;, "Lorg/researchstack/backbone/ui/step/body/MultiChoiceQuestionBody<TT;>;"
    return-void
.end method
