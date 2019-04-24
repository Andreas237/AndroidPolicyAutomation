.class public Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;
.super Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;
.source "SurveyStepLayout.java"

# interfaces
.implements Lorg/researchstack/backbone/ui/step/layout/StepLayout;
.implements Lorg/researchstack/backbone/ui/step/GoToNextLayout;


# static fields
.field public static final TAG:Ljava/lang/String;


# instance fields
.field private bodyView:Landroid/view/View;

.field private callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

.field private container:Landroid/widget/LinearLayout;

.field private questionStep:Lorg/researchstack/backbone/step/QuestionStep;

.field private stepBody:Lorg/researchstack/backbone/ui/step/body/StepBody;

.field private stepResult:Lorg/researchstack/backbone/result/StepResult;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 56
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;-><init>(Landroid/content/Context;)V

    .line 57
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 61
    invoke-direct {p0, p1, p2}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 62
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 66
    invoke-direct {p0, p1, p2, p3}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 67
    return-void
.end method

.method static synthetic access$000(Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;)Lorg/researchstack/backbone/step/QuestionStep;
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;

    .prologue
    .line 32
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->questionStep:Lorg/researchstack/backbone/step/QuestionStep;

    return-object v0
.end method

.method private createStepBody(Lorg/researchstack/backbone/step/QuestionStep;Lorg/researchstack/backbone/result/StepResult;)Lorg/researchstack/backbone/ui/step/body/StepBody;
    .locals 6
    .param p1, "questionStep"    # Lorg/researchstack/backbone/step/QuestionStep;
    .param p2, "result"    # Lorg/researchstack/backbone/result/StepResult;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .prologue
    .line 227
    :try_start_0
    invoke-virtual {p1}, Lorg/researchstack/backbone/step/QuestionStep;->getStepBodyClass()Ljava/lang/Class;

    move-result-object v0

    .line 228
    .local v0, "cls":Ljava/lang/Class;
    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    const-class v5, Lorg/researchstack/backbone/step/Step;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Lorg/researchstack/backbone/result/StepResult;

    aput-object v5, v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 229
    .local v1, "constructor":Ljava/lang/reflect/Constructor;
    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 v4, 0x1

    aput-object p2, v3, v4

    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/researchstack/backbone/ui/step/body/StepBody;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    .line 231
    .end local v0    # "cls":Ljava/lang/Class;
    .end local v1    # "constructor":Ljava/lang/reflect/Constructor;
    :catch_0
    move-exception v2

    .line 233
    .local v2, "e":Ljava/lang/Exception;
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3
.end method

.method static synthetic lambda$initStepLayout$39(Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;Ljava/lang/Object;)V
    .locals 0
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;
    .param p1, "v"    # Ljava/lang/Object;

    .prologue
    .line 159
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->onNextClicked()V

    return-void
.end method

.method static synthetic lambda$initStepLayout$40(Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;Ljava/lang/Object;)V
    .locals 0
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;
    .param p1, "v"    # Ljava/lang/Object;

    .prologue
    .line 194
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->onSkipClicked()V

    return-void
.end method


# virtual methods
.method public clearViews()V
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->stepBody:Lorg/researchstack/backbone/ui/step/body/StepBody;

    invoke-interface {v0}, Lorg/researchstack/backbone/ui/step/body/StepBody;->clearViews()V

    .line 143
    return-void
.end method

.method public getContentResourceId()I
    .locals 1

    .prologue
    .line 115
    sget v0, Lorg/researchstack/backbone/R$layout;->rsb_step_layout:I

    return v0
.end method

.method public getLayout()Landroid/view/View;
    .locals 0

    .prologue
    .line 91
    return-object p0
.end method

.method public getStep()Lorg/researchstack/backbone/step/Step;
    .locals 1

    .prologue
    .line 278
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->questionStep:Lorg/researchstack/backbone/step/QuestionStep;

    return-object v0
.end method

.method public getString(I)Ljava/lang/String;
    .locals 1
    .param p1, "stringResId"    # I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param

    .prologue
    .line 283
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public initStepBody()V
    .locals 5

    .prologue
    .line 205
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v4, "initStepBody()"

    invoke-static {v3, v4}, Lorg/researchstack/backbone/utils/LogExt;->i(Ljava/lang/Class;Ljava/lang/String;)V

    .line 207
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 208
    .local v1, "inflater":Landroid/view/LayoutInflater;
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->questionStep:Lorg/researchstack/backbone/step/QuestionStep;

    iget-object v4, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->stepResult:Lorg/researchstack/backbone/result/StepResult;

    invoke-direct {p0, v3, v4}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->createStepBody(Lorg/researchstack/backbone/step/QuestionStep;Lorg/researchstack/backbone/result/StepResult;)Lorg/researchstack/backbone/ui/step/body/StepBody;

    move-result-object v3

    iput-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->stepBody:Lorg/researchstack/backbone/ui/step/body/StepBody;

    .line 209
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->stepBody:Lorg/researchstack/backbone/ui/step/body/StepBody;

    invoke-interface {v3, p0}, Lorg/researchstack/backbone/ui/step/body/StepBody;->setOnNextListener(Lorg/researchstack/backbone/ui/step/GoToNextLayout;)V

    .line 210
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->stepBody:Lorg/researchstack/backbone/ui/step/body/StepBody;

    const/4 v4, 0x0

    invoke-interface {v3, v4, v1, p0}, Lorg/researchstack/backbone/ui/step/body/StepBody;->getBodyView(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    iput-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->bodyView:Landroid/view/View;

    .line 212
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->bodyView:Landroid/view/View;

    if-eqz v3, :cond_0

    .line 214
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->container:Landroid/widget/LinearLayout;

    sget v4, Lorg/researchstack/backbone/R$id;->rsb_survey_step_body:I

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 215
    .local v2, "oldView":Landroid/view/View;
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->container:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->indexOfChild(Landroid/view/View;)I

    move-result v0

    .line 216
    .local v0, "bodyIndex":I
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->container:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 217
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->container:Landroid/widget/LinearLayout;

    iget-object v4, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->bodyView:Landroid/view/View;

    invoke-virtual {v3, v4, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    .line 218
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->bodyView:Landroid/view/View;

    sget v4, Lorg/researchstack/backbone/R$id;->rsb_survey_step_body:I

    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 220
    .end local v0    # "bodyIndex":I
    .end local v2    # "oldView":Landroid/view/View;
    :cond_0
    return-void
.end method

.method public initStepLayout()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 153
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v4, "initStepLayout()"

    invoke-static {v3, v4}, Lorg/researchstack/backbone/utils/LogExt;->i(Ljava/lang/Class;Ljava/lang/String;)V

    .line 155
    sget v3, Lorg/researchstack/backbone/R$id;->rsb_survey_content_container:I

    invoke-virtual {p0, v3}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/LinearLayout;

    iput-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->container:Landroid/widget/LinearLayout;

    .line 156
    sget v3, Lorg/researchstack/backbone/R$id;->rsb_survey_title:I

    invoke-virtual {p0, v3}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 157
    .local v2, "title":Landroid/widget/TextView;
    sget v3, Lorg/researchstack/backbone/R$id;->rsb_survey_text:I

    invoke-virtual {p0, v3}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 158
    .local v1, "summary":Landroid/widget/TextView;
    sget v3, Lorg/researchstack/backbone/R$id;->rsb_submit_bar:I

    invoke-virtual {p0, v3}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/ui/views/SubmitBar;

    .line 159
    .local v0, "submitBar":Lorg/researchstack/backbone/ui/views/SubmitBar;
    invoke-static {p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout$$Lambda$1;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;)Lrx/functions/Action1;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/researchstack/backbone/ui/views/SubmitBar;->setPositiveAction(Lrx/functions/Action1;)V

    .line 161
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->questionStep:Lorg/researchstack/backbone/step/QuestionStep;

    if-eqz v3, :cond_2

    .line 164
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->questionStep:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v3}, Lorg/researchstack/backbone/step/QuestionStep;->allowsBackNavigation()Z

    move-result v3

    invoke-virtual {p0, v3}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->toggleBackNavigation(Z)V

    .line 166
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->questionStep:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v3}, Lorg/researchstack/backbone/step/QuestionStep;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/researchstack/backbone/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 168
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 169
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->questionStep:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v3}, Lorg/researchstack/backbone/step/QuestionStep;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    :cond_0
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->questionStep:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v3}, Lorg/researchstack/backbone/step/QuestionStep;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/researchstack/backbone/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 174
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 175
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->questionStep:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v3}, Lorg/researchstack/backbone/step/QuestionStep;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 176
    new-instance v3, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout$1;

    invoke-direct {v3, p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout$1;-><init>(Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;)V

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 191
    :cond_1
    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->questionStep:Lorg/researchstack/backbone/step/QuestionStep;

    invoke-virtual {v3}, Lorg/researchstack/backbone/step/QuestionStep;->isOptional()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 193
    sget v3, Lorg/researchstack/backbone/R$string;->rsb_step_skip:I

    invoke-virtual {v0, v3}, Lorg/researchstack/backbone/ui/views/SubmitBar;->setNegativeTitle(I)V

    .line 194
    invoke-static {p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout$$Lambda$2;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;)Lrx/functions/Action1;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/researchstack/backbone/ui/views/SubmitBar;->setNegativeAction(Lrx/functions/Action1;)V

    .line 201
    :cond_2
    :goto_0
    return-void

    .line 198
    :cond_3
    invoke-virtual {v0}, Lorg/researchstack/backbone/ui/views/SubmitBar;->getNegativeActionView()Landroid/view/View;

    move-result-object v3

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method public initialize(Lorg/researchstack/backbone/step/Step;)V
    .locals 1
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;

    .prologue
    .line 71
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->initialize(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V

    .line 72
    return-void
.end method

.method public initialize(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V
    .locals 2
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "result"    # Lorg/researchstack/backbone/result/StepResult;

    .prologue
    .line 77
    instance-of v0, p1, Lorg/researchstack/backbone/step/QuestionStep;

    if-nez v0, :cond_0

    .line 79
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Step being used in SurveyStep is not a QuestionStep"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 82
    :cond_0
    check-cast p1, Lorg/researchstack/backbone/step/QuestionStep;

    .end local p1    # "step":Lorg/researchstack/backbone/step/Step;
    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->questionStep:Lorg/researchstack/backbone/step/QuestionStep;

    .line 83
    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->stepResult:Lorg/researchstack/backbone/result/StepResult;

    .line 85
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->initializeStep()V

    .line 86
    return-void
.end method

.method public initializeStep()V
    .locals 0

    .prologue
    .line 147
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->initStepLayout()V

    .line 148
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->initStepBody()V

    .line 149
    return-void
.end method

.method public isBackEventConsumed()Z
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 102
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    const/4 v1, -0x1

    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->getStep()Lorg/researchstack/backbone/step/Step;

    move-result-object v2

    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->stepBody:Lorg/researchstack/backbone/ui/step/body/StepBody;

    invoke-interface {v3, v4}, Lorg/researchstack/backbone/ui/step/body/StepBody;->getStepResult(Z)Lorg/researchstack/backbone/result/StepResult;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;->onSaveStep(ILorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V

    .line 103
    return v4
.end method

.method public onNextClicked()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 247
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->stepBody:Lorg/researchstack/backbone/ui/step/body/StepBody;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lorg/researchstack/backbone/ui/step/body/StepBody;->getBodyAnswerState(Ljava/util/List;)Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    move-result-object v0

    .line 249
    .local v0, "bodyAnswer":Lorg/researchstack/backbone/ui/step/body/BodyAnswer;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->isValid()Z

    move-result v1

    if-nez v1, :cond_2

    .line 251
    :cond_0
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    if-nez v0, :cond_1

    sget-object v1, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->INVALID:Lorg/researchstack/backbone/ui/step/body/BodyAnswer;

    .line 253
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->getString(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 251
    :goto_0
    invoke-static {v2, v1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    .line 255
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 263
    :goto_1
    return-void

    .line 254
    :cond_1
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/ui/step/body/BodyAnswer;->getString(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 259
    :cond_2
    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    const/4 v2, 0x1

    .line 260
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->getStep()Lorg/researchstack/backbone/step/Step;

    move-result-object v3

    iget-object v4, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->stepBody:Lorg/researchstack/backbone/ui/step/body/StepBody;

    .line 261
    invoke-interface {v4, v5}, Lorg/researchstack/backbone/ui/step/body/StepBody;->getStepResult(Z)Lorg/researchstack/backbone/result/StepResult;

    move-result-object v4

    .line 259
    invoke-interface {v1, v2, v3, v4}, Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;->onSaveStep(ILorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V

    goto :goto_1
.end method

.method public onRestoreStep(Lorg/researchstack/backbone/step/Step;Ljava/lang/String;)V
    .locals 4
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "answer"    # Ljava/lang/String;

    .prologue
    .line 127
    if-nez p2, :cond_1

    .line 138
    :cond_0
    :goto_0
    return-void

    .line 131
    :cond_1
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->stepBody:Lorg/researchstack/backbone/ui/step/body/StepBody;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lorg/researchstack/backbone/ui/step/body/StepBody;->getStepResult(Z)Lorg/researchstack/backbone/result/StepResult;

    move-result-object v0

    .line 132
    .local v0, "stepResult":Lorg/researchstack/backbone/result/StepResult;
    invoke-virtual {v0}, Lorg/researchstack/backbone/result/StepResult;->getResults()Ljava/util/Map;

    move-result-object v2

    const-string v3, "answer"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 133
    .local v1, "stepResultAnswer":Ljava/lang/Object;
    if-nez v1, :cond_0

    .line 137
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->stepBody:Lorg/researchstack/backbone/ui/step/body/StepBody;

    invoke-interface {v2, p2}, Lorg/researchstack/backbone/ui/step/body/StepBody;->setAnswer(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 240
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->getStep()Lorg/researchstack/backbone/step/Step;

    move-result-object v1

    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->stepBody:Lorg/researchstack/backbone/ui/step/body/StepBody;

    invoke-interface {v2, v3}, Lorg/researchstack/backbone/ui/step/body/StepBody;->getStepResult(Z)Lorg/researchstack/backbone/result/StepResult;

    move-result-object v2

    invoke-interface {v0, v3, v1, v2}, Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;->onSaveStep(ILorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V

    .line 241
    invoke-super {p0}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    return-object v0
.end method

.method public onSkipClicked()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 267
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    if-eqz v0, :cond_0

    .line 270
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    .line 271
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->getStep()Lorg/researchstack/backbone/step/Step;

    move-result-object v1

    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->stepBody:Lorg/researchstack/backbone/ui/step/body/StepBody;

    .line 272
    invoke-interface {v2, v3}, Lorg/researchstack/backbone/ui/step/body/StepBody;->getStepResult(Z)Lorg/researchstack/backbone/result/StepResult;

    move-result-object v2

    .line 270
    invoke-interface {v0, v3, v1, v2}, Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;->onSaveStep(ILorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V

    .line 274
    :cond_0
    return-void
.end method

.method public onViewChange(Lorg/researchstack/backbone/step/Step;)V
    .locals 1
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;

    .prologue
    .line 121
    invoke-virtual {p1}, Lorg/researchstack/backbone/step/Step;->allowsBackNavigation()Z

    move-result v0

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->toggleBackNavigation(Z)V

    .line 122
    return-void
.end method

.method public setCallbacks(Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;)V
    .locals 0
    .param p1, "callbacks"    # Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    .prologue
    .line 109
    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    .line 110
    return-void
.end method
