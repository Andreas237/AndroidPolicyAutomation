.class public Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;
.super Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;
.source "InstructionStepLayout.java"

# interfaces
.implements Lorg/researchstack/backbone/ui/step/layout/StepLayout;


# instance fields
.field private callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

.field private step:Lorg/researchstack/backbone/step/Step;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;-><init>(Landroid/content/Context;)V

    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 33
    invoke-direct {p0, p1, p2}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 38
    invoke-direct {p0, p1, p2, p3}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    return-void
.end method

.method static synthetic access$000(Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;)Lorg/researchstack/backbone/step/Step;
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;

    .prologue
    .line 21
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    return-object v0
.end method

.method private initializeStep()V
    .locals 9

    .prologue
    const/4 v8, 0x0

    .line 81
    iget-object v6, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    if-eqz v6, :cond_3

    .line 86
    iget-object v6, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v6}, Lorg/researchstack/backbone/step/Step;->getStepTitle()I

    move-result v6

    if-eqz v6, :cond_0

    .line 87
    sget v6, Lorg/researchstack/backbone/R$id;->title:I

    invoke-virtual {p0, v6}, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 88
    .local v0, "actionBarTitleView":Landroid/widget/TextView;
    if-eqz v0, :cond_0

    .line 89
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    iget-object v7, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v7}, Lorg/researchstack/backbone/step/Step;->getStepTitle()I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 90
    .local v5, "title":Ljava/lang/String;
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    .end local v0    # "actionBarTitleView":Landroid/widget/TextView;
    .end local v5    # "title":Ljava/lang/String;
    :cond_0
    iget-object v6, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v6}, Lorg/researchstack/backbone/step/Step;->allowsBackNavigation()Z

    move-result v6

    invoke-virtual {p0, v6}, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->toggleBackNavigation(Z)V

    .line 99
    iget-object v6, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v6}, Lorg/researchstack/backbone/step/Step;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lorg/researchstack/backbone/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 101
    sget v6, Lorg/researchstack/backbone/R$id;->rsb_intruction_title:I

    invoke-virtual {p0, v6}, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 102
    .local v5, "title":Landroid/widget/TextView;
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 103
    iget-object v6, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v6}, Lorg/researchstack/backbone/step/Step;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    .end local v5    # "title":Landroid/widget/TextView;
    :cond_1
    iget-object v6, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v6}, Lorg/researchstack/backbone/step/Step;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lorg/researchstack/backbone/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 109
    sget v6, Lorg/researchstack/backbone/R$id;->rsb_intruction_text:I

    invoke-virtual {p0, v6}, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 110
    .local v4, "summary":Landroid/widget/TextView;
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 111
    iget-object v6, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v6}, Lorg/researchstack/backbone/step/Step;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    new-instance v6, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout$1;

    invoke-direct {v6, p0}, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout$1;-><init>(Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;)V

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 128
    .end local v4    # "summary":Landroid/widget/TextView;
    :cond_2
    sget v6, Lorg/researchstack/backbone/R$id;->rsb_submit_bar:I

    invoke-virtual {p0, v6}, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lorg/researchstack/backbone/ui/views/SubmitBar;

    .line 129
    .local v3, "submitBar":Lorg/researchstack/backbone/ui/views/SubmitBar;
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    check-cast v1, Lorg/researchstack/backbone/step/InstructionStep;

    .line 130
    .local v1, "instructionStep":Lorg/researchstack/backbone/step/InstructionStep;
    invoke-virtual {v1}, Lorg/researchstack/backbone/step/InstructionStep;->getPositiveButtonTitleResId()I

    move-result v2

    .line 131
    .local v2, "positiveButtonTitleResId":I
    if-eqz v2, :cond_4

    .line 132
    invoke-virtual {v3, v2}, Lorg/researchstack/backbone/ui/views/SubmitBar;->setPositiveTitle(I)V

    .line 137
    :goto_0
    invoke-static {p0}, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout$$Lambda$1;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;)Lrx/functions/Action1;

    move-result-object v6

    invoke-virtual {v3, v6}, Lorg/researchstack/backbone/ui/views/SubmitBar;->setPositiveAction(Lrx/functions/Action1;)V

    .line 141
    iget-object v6, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v6}, Lorg/researchstack/backbone/step/Step;->isOptional()Z

    move-result v6

    if-eqz v6, :cond_5

    .line 143
    sget v6, Lorg/researchstack/backbone/R$string;->rsb_step_skip:I

    invoke-virtual {v3, v6}, Lorg/researchstack/backbone/ui/views/SubmitBar;->setNegativeTitle(I)V

    .line 144
    invoke-static {p0}, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout$$Lambda$2;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;)Lrx/functions/Action1;

    move-result-object v6

    invoke-virtual {v3, v6}, Lorg/researchstack/backbone/ui/views/SubmitBar;->setNegativeAction(Lrx/functions/Action1;)V

    .line 156
    .end local v1    # "instructionStep":Lorg/researchstack/backbone/step/InstructionStep;
    .end local v2    # "positiveButtonTitleResId":I
    .end local v3    # "submitBar":Lorg/researchstack/backbone/ui/views/SubmitBar;
    :cond_3
    :goto_1
    return-void

    .line 134
    .restart local v1    # "instructionStep":Lorg/researchstack/backbone/step/InstructionStep;
    .restart local v2    # "positiveButtonTitleResId":I
    .restart local v3    # "submitBar":Lorg/researchstack/backbone/ui/views/SubmitBar;
    :cond_4
    sget v6, Lorg/researchstack/backbone/R$string;->rsb_next:I

    invoke-virtual {v3, v6}, Lorg/researchstack/backbone/ui/views/SubmitBar;->setPositiveTitle(I)V

    goto :goto_0

    .line 153
    :cond_5
    invoke-virtual {v3}, Lorg/researchstack/backbone/ui/views/SubmitBar;->getNegativeActionView()Landroid/view/View;

    move-result-object v6

    const/16 v7, 0x8

    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1
.end method

.method static synthetic lambda$initializeStep$37(Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;Ljava/lang/Object;)V
    .locals 4
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;
    .param p1, "v"    # Ljava/lang/Object;

    .prologue
    .line 137
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    const/4 v1, 0x1

    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;->onSaveStep(ILorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V

    return-void
.end method

.method static synthetic lambda$initializeStep$38(Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;Ljava/lang/Object;)V
    .locals 4
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;
    .param p1, "v"    # Ljava/lang/Object;

    .prologue
    .line 145
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    if-eqz v0, :cond_0

    .line 147
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    const/4 v1, 0x1

    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;->onSaveStep(ILorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V

    .line 149
    :cond_0
    return-void
.end method


# virtual methods
.method public clearViews()V
    .locals 0

    .prologue
    .line 166
    return-void
.end method

.method public getContentResourceId()I
    .locals 1

    .prologue
    .line 70
    sget v0, Lorg/researchstack/backbone/R$layout;->rsb_step_layout_instruction:I

    return v0
.end method

.method public getLayout()Landroid/view/View;
    .locals 0

    .prologue
    .line 51
    return-object p0
.end method

.method public initialize(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V
    .locals 0
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "result"    # Lorg/researchstack/backbone/result/StepResult;

    .prologue
    .line 44
    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    .line 45
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->initializeStep()V

    .line 46
    return-void
.end method

.method public isBackEventConsumed()Z
    .locals 4

    .prologue
    .line 57
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    const/4 v1, -0x1

    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->step:Lorg/researchstack/backbone/step/Step;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;->onSaveStep(ILorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V

    .line 58
    const/4 v0, 0x0

    return v0
.end method

.method public onRestoreStep(Lorg/researchstack/backbone/step/Step;Ljava/lang/String;)V
    .locals 0
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "answer"    # Ljava/lang/String;

    .prologue
    .line 161
    return-void
.end method

.method public onViewChange(Lorg/researchstack/backbone/step/Step;)V
    .locals 1
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;

    .prologue
    .line 76
    invoke-virtual {p1}, Lorg/researchstack/backbone/step/Step;->allowsBackNavigation()Z

    move-result v0

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->toggleBackNavigation(Z)V

    .line 77
    return-void
.end method

.method public setCallbacks(Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;)V
    .locals 0
    .param p1, "callbacks"    # Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    .prologue
    .line 64
    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    .line 65
    return-void
.end method
