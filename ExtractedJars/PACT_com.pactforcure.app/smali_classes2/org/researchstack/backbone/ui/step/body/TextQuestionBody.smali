.class public Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;
.super Ljava/lang/Object;
.source "TextQuestionBody.java"

# interfaces
.implements Lorg/researchstack/backbone/ui/step/body/StepBody;


# instance fields
.field private editText:Landroid/widget/EditText;

.field private goToNextListener:Lorg/researchstack/backbone/ui/step/GoToNextLayout;

.field private result:Lorg/researchstack/backbone/result/StepResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/researchstack/backbone/result/StepResult",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private step:Lorg/researchstack/backbone/step/QuestionStep;


# direct methods
.method public constructor <init>(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V
    .locals 1
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "result"    # Lorg/researchstack/backbone/result/StepResult;

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v0, p1

    .line 45
    check-cast v0, Lorg/researchstack/backbone/step/QuestionStep;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    .line 46
    if-nez p2, :cond_0

    new-instance p2, Lorg/researchstack/backbone/result/StepResult;

    .end local p2    # "result":Lorg/researchstack/backbone/result/StepResult;
    invoke-direct {p2, p1}, Lorg/researchstack/backbone/result/StepResult;-><init>(Lorg/researchstack/backbone/step/Step;)V

    :cond_0
    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    .line 47
    return-void
.end method

.method static synthetic lambda$getBodyView$27(Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;Ljava/lang/CharSequence;)V
    .locals 2
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;
    .param p1, "text"    # Ljava/lang/CharSequence;

    .prologue
    .line 76
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    .line 77
    return-void
.end method

.method static synthetic lambda$getBodyView$28(Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;
    .param p1, "v"    # Landroid/widget/TextView;
    .param p2, "actionId"    # I
    .param p3, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 120
    const/4 v0, 0x5

    if-ne p2, v0, :cond_0

    .line 121
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->goToNextListener:Lorg/researchstack/backbone/ui/step/GoToNextLayout;

    invoke-interface {v0}, Lorg/researchstack/backbone/ui/step/GoToNextLayout;->onNextClicked()V

    .line 122
    const/4 v0, 0x1

    .line 124
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public clearViews()V
    .locals 2

    .prologue
    .line 164
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 165
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
    .line 149
    .local p1, "formStepChildren":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/ui/step/body/StepBody;>;"
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v1}, Lorg/researchstack/backbone/step/QuestionStep;->getAnswerFormat()Lorg/researchstack/backbone/answerformat/AnswerFormat;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;

    .line 150
    .local v0, "format":Lorg/researchstack/backbone/answerformat/TextAnswerFormat;
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->isAnswerValid(Ljava/lang/String;Ljava/util/List;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 151
    sget-object v1, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->INVALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    .line 154
    :goto_0
    return-object v1

    :cond_0
    sget-object v1, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->VALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    goto :goto_0
.end method

.method public getBodyView(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11
    .param p1, "viewType"    # I
    .param p2, "inflater"    # Landroid/view/LayoutInflater;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 51
    sget v9, Lorg/researchstack/backbone/R$layout;->rsb_item_edit_text_compact:I

    const/4 v10, 0x0

    invoke-virtual {p2, v9, p3, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 53
    .local v0, "body":Landroid/view/View;
    sget v9, Lorg/researchstack/backbone/R$id;->value:I

    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/EditText;

    iput-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    .line 54
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v9}, Lorg/researchstack/backbone/step/QuestionStep;->getPlaceholder()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_2

    .line 55
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    iget-object v10, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v10}, Lorg/researchstack/backbone/step/QuestionStep;->getPlaceholder()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 60
    :goto_0
    sget v9, Lorg/researchstack/backbone/R$id;->label:I

    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    .line 62
    .local v8, "title":Landroid/widget/TextView;
    const/4 v9, 0x1

    if-ne p1, v9, :cond_3

    .line 63
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v9}, Lorg/researchstack/backbone/step/QuestionStep;->getTitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    :goto_1
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    invoke-virtual {v9}, Lorg/researchstack/backbone/result/StepResult;->getResult()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 70
    .local v7, "stringResult":Ljava/lang/String;
    invoke-static {v7}, Lorg/researchstack/backbone/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_0

    .line 71
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v9, v7}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 75
    :cond_0
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    invoke-static {v9}, Lcom/jakewharton/rxbinding/widget/RxTextView;->textChanges(Landroid/widget/TextView;)Lrx/Observable;

    move-result-object v9

    invoke-static {p0}, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody$$Lambda$1;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;)Lrx/functions/Action1;

    move-result-object v10

    invoke-virtual {v9, v10}, Lrx/Observable;->subscribe(Lrx/functions/Action1;)Lrx/Subscription;

    .line 80
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->step:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v9}, Lorg/researchstack/backbone/step/QuestionStep;->getAnswerFormat()Lorg/researchstack/backbone/answerformat/AnswerFormat;

    move-result-object v2

    check-cast v2, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;

    .line 82
    .local v2, "format":Lorg/researchstack/backbone/answerformat/TextAnswerFormat;
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v2}, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->getInputType()I

    move-result v10

    invoke-virtual {v9, v10}, Landroid/widget/EditText;->setInputType(I)V

    .line 85
    iget-object v10, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v2}, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->isMultipleLines()Z

    move-result v9

    if-nez v9, :cond_4

    const/4 v9, 0x1

    :goto_2
    invoke-virtual {v10, v9}, Landroid/widget/EditText;->setSingleLine(Z)V

    .line 86
    invoke-virtual {v2}, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->isMultipleLines()Z

    move-result v9

    if-eqz v9, :cond_5

    .line 87
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    const v10, 0x20001

    invoke-virtual {v9, v10}, Landroid/widget/EditText;->setInputType(I)V

    .line 88
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    const/high16 v10, 0x40000000    # 2.0f

    invoke-virtual {v9, v10}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 89
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Landroid/widget/EditText;->setVerticalScrollBarEnabled(Z)V

    .line 90
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    const/16 v10, 0xa

    invoke-virtual {v9, v10}, Landroid/widget/EditText;->setMaxLines(I)V

    .line 91
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    const/4 v10, 0x5

    invoke-virtual {v9, v10}, Landroid/widget/EditText;->setLines(I)V

    .line 97
    :goto_3
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v9}, Landroid/widget/EditText;->getInputType()I

    move-result v3

    .line 98
    .local v3, "inputType":I
    sget-object v9, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody$1;->$SwitchMap$org$researchstack$backbone$answerformat$TextAnswerFormat$Capitalization:[I

    invoke-virtual {v2}, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->getCapitalization()Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;

    move-result-object v10

    invoke-virtual {v10}, Lorg/researchstack/backbone/answerformat/TextAnswerFormat$Capitalization;->ordinal()I

    move-result v10

    aget v9, v9, v10

    packed-switch v9, :pswitch_data_0

    .line 111
    :goto_4
    :pswitch_0
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v9, v3}, Landroid/widget/EditText;->setInputType(I)V

    .line 113
    invoke-virtual {v2}, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->getMaximumLength()I

    move-result v9

    if-lez v9, :cond_1

    .line 114
    new-instance v5, Landroid/text/InputFilter$LengthFilter;

    invoke-virtual {v2}, Lorg/researchstack/backbone/answerformat/TextAnswerFormat;->getMaximumLength()I

    move-result v9

    invoke-direct {v5, v9}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    .line 115
    .local v5, "maxLengthFilter":Landroid/text/InputFilter$LengthFilter;
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v9}, Landroid/widget/EditText;->getFilters()[Landroid/text/InputFilter;

    move-result-object v9

    invoke-static {v9, v5}, Lorg/researchstack/backbone/utils/ViewUtils;->addFilter([Landroid/text/InputFilter;Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object v1

    .line 116
    .local v1, "filters":[Landroid/text/InputFilter;
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v9, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 119
    .end local v1    # "filters":[Landroid/text/InputFilter;
    .end local v5    # "maxLengthFilter":Landroid/text/InputFilter$LengthFilter;
    :cond_1
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    invoke-static {p0}, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody$$Lambda$2;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;)Landroid/widget/TextView$OnEditorActionListener;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 127
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    .line 128
    .local v6, "res":Landroid/content/res/Resources;
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x1

    const/4 v10, -0x2

    invoke-direct {v4, v9, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 130
    .local v4, "layoutParams":Landroid/view/ViewGroup$MarginLayoutParams;
    sget v9, Lorg/researchstack/backbone/R$dimen;->rsb_margin_left:I

    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v9

    iput v9, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 131
    sget v9, Lorg/researchstack/backbone/R$dimen;->rsb_margin_right:I

    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v9

    iput v9, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 132
    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 134
    return-object v0

    .line 57
    .end local v2    # "format":Lorg/researchstack/backbone/answerformat/TextAnswerFormat;
    .end local v3    # "inputType":I
    .end local v4    # "layoutParams":Landroid/view/ViewGroup$MarginLayoutParams;
    .end local v6    # "res":Landroid/content/res/Resources;
    .end local v7    # "stringResult":Ljava/lang/String;
    .end local v8    # "title":Landroid/widget/TextView;
    :cond_2
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    sget v10, Lorg/researchstack/backbone/R$string;->rsb_hint_step_body_text:I

    invoke-virtual {v9, v10}, Landroid/widget/EditText;->setHint(I)V

    goto/16 :goto_0

    .line 65
    .restart local v8    # "title":Landroid/widget/TextView;
    :cond_3
    const/16 v9, 0x8

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_1

    .line 85
    .restart local v2    # "format":Lorg/researchstack/backbone/answerformat/TextAnswerFormat;
    .restart local v7    # "stringResult":Ljava/lang/String;
    :cond_4
    const/4 v9, 0x0

    goto/16 :goto_2

    .line 93
    :cond_5
    iget-object v9, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Landroid/widget/EditText;->setInputType(I)V

    goto :goto_3

    .line 102
    .restart local v3    # "inputType":I
    :pswitch_1
    or-int/lit16 v3, v3, 0x4000

    .line 103
    goto :goto_4

    .line 105
    :pswitch_2
    or-int/lit16 v3, v3, 0x2000

    .line 106
    goto :goto_4

    .line 108
    :pswitch_3
    or-int/lit16 v3, v3, 0x1000

    goto :goto_4

    .line 98
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public getStepResult(Z)Lorg/researchstack/backbone/result/StepResult;
    .locals 2
    .param p1, "skipped"    # Z

    .prologue
    .line 140
    if-eqz p1, :cond_0

    .line 141
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    .line 144
    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->result:Lorg/researchstack/backbone/result/StepResult;

    return-object v0
.end method

.method public setAnswer(Ljava/lang/String;)V
    .locals 1
    .param p1, "answer"    # Ljava/lang/String;

    .prologue
    .line 159
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->editText:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 160
    return-void
.end method

.method public setOnNextListener(Lorg/researchstack/backbone/ui/step/GoToNextLayout;)V
    .locals 0
    .param p1, "goToNextLayoutListener"    # Lorg/researchstack/backbone/ui/step/GoToNextLayout;

    .prologue
    .line 169
    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/body/TextQuestionBody;->goToNextListener:Lorg/researchstack/backbone/ui/step/GoToNextLayout;

    .line 170
    return-void
.end method
