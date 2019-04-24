.class public Lorg/researchstack/backbone/ui/ViewTaskActivity;
.super Lorg/researchstack/backbone/ui/PinCodeActivity;
.source "ViewTaskActivity.java"

# interfaces
.implements Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;
    }
.end annotation


# static fields
.field public static final EXTRA_STEP:Ljava/lang/String; = "ViewTaskActivity.ExtraStep"

.field public static final EXTRA_TASK:Ljava/lang/String; = "ViewTaskActivity.ExtraTask"

.field public static final EXTRA_TASK_RESULT:Ljava/lang/String; = "ViewTaskActivity.ExtraTaskResult"

.field private static final TAG:Ljava/lang/String; = "ViewTaskActivity"


# instance fields
.field private currentStep:Lorg/researchstack/backbone/step/Step;

.field private root:Lorg/researchstack/backbone/ui/views/StepSwitcher;

.field private task:Lorg/researchstack/backbone/task/Task;

.field private taskResult:Lorg/researchstack/backbone/result/TaskResult;

.field private transitioningToADifferentStep:Z

.field private userHasCompletedThisTask:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;-><init>()V

    .line 120
    return-void
.end method

.method private createLayoutFromStep(Lorg/researchstack/backbone/step/Step;)Lorg/researchstack/backbone/ui/step/layout/StepLayout;
    .locals 6
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .prologue
    .line 177
    :try_start_0
    invoke-virtual {p1}, Lorg/researchstack/backbone/step/Step;->getStepLayoutClass()Ljava/lang/Class;

    move-result-object v0

    .line 178
    .local v0, "cls":Ljava/lang/Class;
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    const-class v5, Landroid/content/Context;

    aput-object v5, v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 179
    .local v1, "constructor":Ljava/lang/reflect/Constructor;
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p0, v3, v4

    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/researchstack/backbone/ui/step/layout/StepLayout;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    .line 181
    .end local v0    # "cls":Ljava/lang/Class;
    .end local v1    # "constructor":Ljava/lang/reflect/Constructor;
    :catch_0
    move-exception v2

    .line 183
    .local v2, "e":Ljava/lang/Exception;
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3
.end method

.method private hideKeyboard()V
    .locals 3

    .prologue
    .line 338
    const-string v1, "input_method"

    invoke-virtual {p0, v1}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 339
    .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
    invoke-virtual {v0}, Landroid/view/inputmethod/InputMethodManager;->isActive()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/inputmethod/InputMethodManager;->isAcceptingText()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 341
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 343
    :cond_0
    return-void
.end method

.method static synthetic lambda$showConfirmExitDialog$12(Lorg/researchstack/backbone/ui/ViewTaskActivity;Landroid/content/DialogInterface;I)V
    .locals 1
    .param p0, "this"    # Lorg/researchstack/backbone/ui/ViewTaskActivity;
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 352
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    invoke-virtual {v0}, Lorg/researchstack/backbone/task/Task;->taskClosedByTheUser()V

    .line 353
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->finish()V

    .line 354
    return-void
.end method

.method static synthetic lambda$showConfirmExitDialog$13(Landroid/support/v7/app/AlertDialog;Landroid/content/DialogInterface;)V
    .locals 3
    .param p1, "v"    # Landroid/content/DialogInterface;

    .prologue
    const/4 v2, 0x1

    .line 357
    const/4 v0, -0x2

    invoke-virtual {p0, v0}, Landroid/support/v7/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1, v2}, Landroid/widget/Button;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 358
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroid/support/v7/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1, v2}, Landroid/widget/Button;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 359
    return-void
.end method

.method static synthetic lambda$showStep$11(Lorg/researchstack/backbone/ui/ViewTaskActivity;)V
    .locals 1
    .param p0, "this"    # Lorg/researchstack/backbone/ui/ViewTaskActivity;

    .prologue
    .line 143
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->transitioningToADifferentStep:Z

    return-void
.end method

.method public static newIntent(Landroid/content/Context;Lorg/researchstack/backbone/task/Task;)Landroid/content/Intent;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "task"    # Lorg/researchstack/backbone/task/Task;

    .prologue
    .line 48
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lorg/researchstack/backbone/ui/ViewTaskActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 49
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "ViewTaskActivity.ExtraTask"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 50
    return-object v0
.end method

.method private notifyStepOfBackPress()V
    .locals 2

    .prologue
    .line 273
    sget v1, Lorg/researchstack/backbone/R$id;->rsb_current_step:I

    invoke-virtual {p0, v1}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/ui/step/layout/StepLayout;

    .line 274
    .local v0, "currentStepLayout":Lorg/researchstack/backbone/ui/step/layout/StepLayout;
    invoke-interface {v0}, Lorg/researchstack/backbone/ui/step/layout/StepLayout;->isBackEventConsumed()Z

    .line 275
    iget-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    invoke-interface {v0, v1}, Lorg/researchstack/backbone/ui/step/layout/StepLayout;->onViewChange(Lorg/researchstack/backbone/step/Step;)V

    .line 276
    return-void
.end method

.method private saveAndFinish()V
    .locals 3

    .prologue
    .line 189
    const/4 v1, 0x1

    iput-boolean v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->userHasCompletedThisTask:Z

    .line 190
    iget-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->taskResult:Lorg/researchstack/backbone/result/TaskResult;

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Lorg/researchstack/backbone/result/TaskResult;->setEndDate(Ljava/util/Date;)V

    .line 191
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 192
    .local v0, "resultIntent":Landroid/content/Intent;
    const-string v1, "ViewTaskActivity.ExtraTaskResult"

    iget-object v2, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->taskResult:Lorg/researchstack/backbone/result/TaskResult;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 193
    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->setResult(ILandroid/content/Intent;)V

    .line 194
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->finish()V

    .line 195
    return-void
.end method

.method private showConfirmExitDialog()V
    .locals 4

    .prologue
    .line 347
    new-instance v1, Landroid/support/v7/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v2, Lorg/researchstack/backbone/R$string;->rsb_sure_cancel:I

    .line 348
    invoke-virtual {p0, v2}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v7/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lorg/researchstack/backbone/R$string;->rsb_no_proceed:I

    const/4 v3, 0x0

    .line 350
    invoke-virtual {v1, v2, v3}, Landroid/support/v7/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lorg/researchstack/backbone/R$string;->rsb_end_task:I

    invoke-static {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$2;->lambdaFactory$(Lorg/researchstack/backbone/ui/ViewTaskActivity;)Landroid/content/DialogInterface$OnClickListener;

    move-result-object v3

    .line 351
    invoke-virtual {v1, v2, v3}, Landroid/support/v7/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v1

    .line 355
    invoke-virtual {v1}, Landroid/support/v7/app/AlertDialog$Builder;->create()Landroid/support/v7/app/AlertDialog;

    move-result-object v0

    .line 356
    .local v0, "alertDialog":Landroid/support/v7/app/AlertDialog;
    invoke-static {v0}, Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$3;->lambdaFactory$(Landroid/support/v7/app/AlertDialog;)Landroid/content/DialogInterface$OnShowListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/AlertDialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 360
    invoke-virtual {v0}, Landroid/support/v7/app/AlertDialog;->show()V

    .line 361
    return-void
.end method

.method private showStep(Lorg/researchstack/backbone/step/Step;)V
    .locals 7
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;

    .prologue
    const/4 v3, 0x1

    .line 128
    iget-boolean v4, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->transitioningToADifferentStep:Z

    if-eqz v4, :cond_0

    .line 129
    const-string v3, "ViewTaskActivity"

    const-string v4, "trying to change steps during a step change animation"

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    :goto_0
    return-void

    .line 132
    :cond_0
    iput-boolean v3, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->transitioningToADifferentStep:Z

    .line 134
    iget-object v4, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    iget-object v5, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    iget-object v6, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->taskResult:Lorg/researchstack/backbone/result/TaskResult;

    invoke-virtual {v4, v5, v6}, Lorg/researchstack/backbone/task/Task;->getProgressOfCurrentStep(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/TaskResult;)Lorg/researchstack/backbone/task/Task$TaskProgress;

    move-result-object v4

    invoke-virtual {v4}, Lorg/researchstack/backbone/task/Task$TaskProgress;->getCurrent()I

    move-result v0

    .line 135
    .local v0, "currentStepPosition":I
    iget-object v4, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    iget-object v5, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->taskResult:Lorg/researchstack/backbone/result/TaskResult;

    invoke-virtual {v4, p1, v5}, Lorg/researchstack/backbone/task/Task;->getProgressOfCurrentStep(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/TaskResult;)Lorg/researchstack/backbone/task/Task$TaskProgress;

    move-result-object v4

    invoke-virtual {v4}, Lorg/researchstack/backbone/task/Task$TaskProgress;->getCurrent()I

    move-result v1

    .line 137
    .local v1, "newStepPosition":I
    invoke-virtual {p0, p1}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->getLayoutForStep(Lorg/researchstack/backbone/step/Step;)Lorg/researchstack/backbone/ui/step/layout/StepLayout;

    move-result-object v2

    .line 138
    .local v2, "stepLayout":Lorg/researchstack/backbone/ui/step/layout/StepLayout;
    invoke-interface {v2}, Lorg/researchstack/backbone/ui/step/layout/StepLayout;->getLayout()Landroid/view/View;

    move-result-object v4

    sget v5, Lorg/researchstack/backbone/R$id;->rsb_step_layout_id:I

    invoke-virtual {p1}, Lorg/researchstack/backbone/step/Step;->getIdentifier()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 139
    iget-object v4, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->root:Lorg/researchstack/backbone/ui/views/StepSwitcher;

    if-lt v1, v0, :cond_1

    :goto_1
    invoke-static {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$1;->lambdaFactory$(Lorg/researchstack/backbone/ui/ViewTaskActivity;)Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;

    move-result-object v5

    invoke-virtual {v4, v2, v3, v5}, Lorg/researchstack/backbone/ui/views/StepSwitcher;->show(Lorg/researchstack/backbone/ui/step/layout/StepLayout;ILorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;)V

    .line 145
    iput-object p1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    .line 146
    iget-object v3, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    iget-object v4, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v3, v4}, Lorg/researchstack/backbone/task/Task;->stepShown(Lorg/researchstack/backbone/step/Step;)V

    .line 147
    invoke-virtual {p1}, Lorg/researchstack/backbone/step/Step;->mustResetViews()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 148
    invoke-interface {v2}, Lorg/researchstack/backbone/ui/step/layout/StepLayout;->clearViews()V

    .line 149
    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Lorg/researchstack/backbone/step/Step;->resetToInitialState(Z)V

    goto :goto_0

    .line 139
    :cond_1
    const/4 v3, -0x1

    goto :goto_1

    .line 151
    :cond_2
    iget-object v3, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    iget-object v4, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    iget-object v5, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v4, v5}, Lorg/researchstack/backbone/task/Task;->getAnswerForStep(Lorg/researchstack/backbone/step/Step;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lorg/researchstack/backbone/ui/step/layout/StepLayout;->onRestoreStep(Lorg/researchstack/backbone/step/Step;Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public getCurrentStep()Lorg/researchstack/backbone/step/Step;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    return-object v0
.end method

.method protected getLayoutForStep(Lorg/researchstack/backbone/step/Step;)Lorg/researchstack/backbone/ui/step/layout/StepLayout;
    .locals 5
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;

    .prologue
    .line 158
    iget-object v3, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    invoke-virtual {v3, p0, p1}, Lorg/researchstack/backbone/task/Task;->getTitleForStep(Landroid/content/Context;Lorg/researchstack/backbone/step/Step;)Ljava/lang/String;

    move-result-object v2

    .line 159
    .local v2, "title":Ljava/lang/String;
    invoke-virtual {p0, v2}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->setActionBarTitle(Ljava/lang/String;)V

    .line 162
    iget-object v3, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->taskResult:Lorg/researchstack/backbone/result/TaskResult;

    invoke-virtual {p1}, Lorg/researchstack/backbone/step/Step;->getIdentifier()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/researchstack/backbone/result/TaskResult;->getStepResult(Ljava/lang/String;)Lorg/researchstack/backbone/result/StepResult;

    move-result-object v0

    .line 165
    .local v0, "result":Lorg/researchstack/backbone/result/StepResult;
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->createLayoutFromStep(Lorg/researchstack/backbone/step/Step;)Lorg/researchstack/backbone/ui/step/layout/StepLayout;

    move-result-object v1

    .line 166
    .local v1, "stepLayout":Lorg/researchstack/backbone/ui/step/layout/StepLayout;
    invoke-interface {v1, p1, v0}, Lorg/researchstack/backbone/ui/step/layout/StepLayout;->initialize(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V

    .line 167
    invoke-interface {v1, p0}, Lorg/researchstack/backbone/ui/step/layout/StepLayout;->setCallbacks(Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;)V

    .line 169
    return-object v1
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 257
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v0}, Lorg/researchstack/backbone/step/Step;->allowsBackNavigation()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 258
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->notifyStepOfBackPress()V

    .line 260
    :cond_0
    return-void
.end method

.method public onCancelStep()V
    .locals 1

    .prologue
    .line 366
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->setResult(I)V

    .line 367
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->finish()V

    .line 368
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 56
    invoke-super {p0, p1}, Lorg/researchstack/backbone/ui/PinCodeActivity;->onCreate(Landroid/os/Bundle;)V

    .line 57
    const/4 v1, 0x0

    invoke-super {p0, v1}, Lorg/researchstack/backbone/ui/PinCodeActivity;->setResult(I)V

    .line 58
    sget v1, Lorg/researchstack/backbone/R$layout;->rsb_activity_step_switcher:I

    invoke-super {p0, v1}, Lorg/researchstack/backbone/ui/PinCodeActivity;->setContentView(I)V

    .line 60
    sget v1, Lorg/researchstack/backbone/R$id;->toolbar:I

    invoke-virtual {p0, v1}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    .line 61
    .local v0, "toolbar":Landroid/support/v7/widget/Toolbar;
    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 62
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 64
    sget v1, Lorg/researchstack/backbone/R$id;->container:I

    invoke-virtual {p0, v1}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lorg/researchstack/backbone/ui/views/StepSwitcher;

    iput-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->root:Lorg/researchstack/backbone/ui/views/StepSwitcher;

    .line 66
    if-nez p1, :cond_0

    .line 68
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "ViewTaskActivity.ExtraTask"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lorg/researchstack/backbone/task/Task;

    iput-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    .line 69
    new-instance v1, Lorg/researchstack/backbone/result/TaskResult;

    iget-object v2, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    invoke-virtual {v2}, Lorg/researchstack/backbone/task/Task;->getIdentifier()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/researchstack/backbone/result/TaskResult;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->taskResult:Lorg/researchstack/backbone/result/TaskResult;

    .line 70
    iget-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->taskResult:Lorg/researchstack/backbone/result/TaskResult;

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Lorg/researchstack/backbone/result/TaskResult;->setStartDate(Ljava/util/Date;)V

    .line 79
    :goto_0
    iget-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    invoke-virtual {v1}, Lorg/researchstack/backbone/task/Task;->validateParameters()V

    .line 81
    iget-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    sget-object v2, Lorg/researchstack/backbone/task/Task$ViewChangeType;->ActivityCreate:Lorg/researchstack/backbone/task/Task$ViewChangeType;

    iget-object v3, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v1, v2, p0, v3}, Lorg/researchstack/backbone/task/Task;->onViewChange(Lorg/researchstack/backbone/task/Task$ViewChangeType;Lorg/researchstack/backbone/ui/ViewTaskActivity;Lorg/researchstack/backbone/step/Step;)V

    .line 82
    return-void

    .line 74
    :cond_0
    const-string v1, "ViewTaskActivity.ExtraTask"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lorg/researchstack/backbone/task/Task;

    iput-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    .line 75
    const-string v1, "ViewTaskActivity.ExtraTaskResult"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lorg/researchstack/backbone/result/TaskResult;

    iput-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->taskResult:Lorg/researchstack/backbone/result/TaskResult;

    .line 76
    const-string v1, "ViewTaskActivity.ExtraStep"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lorg/researchstack/backbone/step/Step;

    iput-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    goto :goto_0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2
    .param p1, "menu"    # Landroid/view/Menu;

    .prologue
    .line 250
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lorg/researchstack/backbone/R$menu;->rsb_view_task:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 251
    const/4 v0, 0x1

    return v0
.end method

.method public onDataFailed()V
    .locals 2

    .prologue
    .line 294
    invoke-super {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->onDataFailed()V

    .line 295
    sget v0, Lorg/researchstack/backbone/R$string;->rsb_error_data_failed:I

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 296
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->finish()V

    .line 297
    return-void
.end method

.method public onDataReady()V
    .locals 3

    .prologue
    .line 281
    invoke-super {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->onDataReady()V

    .line 283
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    if-nez v0, :cond_0

    .line 285
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    const/4 v1, 0x0

    iget-object v2, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->taskResult:Lorg/researchstack/backbone/result/TaskResult;

    invoke-virtual {v0, v1, v2}, Lorg/researchstack/backbone/task/Task;->getStepAfterStep(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/TaskResult;)Lorg/researchstack/backbone/step/Step;

    move-result-object v0

    iput-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    .line 288
    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    invoke-direct {p0, v0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->showStep(Lorg/researchstack/backbone/step/Step;)V

    .line 289
    return-void
.end method

.method protected onExecuteStepAction(I)V
    .locals 3
    .param p1, "action"    # I

    .prologue
    .line 313
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 315
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->showNextStep()V

    .line 334
    :cond_0
    :goto_0
    return-void

    .line 317
    :cond_1
    const/4 v0, -0x1

    if-ne p1, v0, :cond_2

    .line 319
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->showPreviousStep()V

    goto :goto_0

    .line 321
    :cond_2
    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    .line 323
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->showConfirmExitDialog()V

    goto :goto_0

    .line 325
    :cond_3
    if-eqz p1, :cond_0

    .line 331
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Action with value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is invalid. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "See StepCallbacks for allowable arguments"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3
    .param p1, "item"    # Landroid/view/MenuItem;

    .prologue
    const/4 v1, 0x1

    .line 233
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    .line 234
    .local v0, "itemId":I
    const v2, 0x102002c

    if-ne v0, v2, :cond_0

    .line 236
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->notifyStepOfBackPress()V

    .line 245
    :goto_0
    return v1

    .line 239
    :cond_0
    sget v2, Lorg/researchstack/backbone/R$id;->cancel:I

    if-ne v0, v2, :cond_1

    .line 241
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->showConfirmExitDialog()V

    goto :goto_0

    .line 245
    :cond_1
    invoke-super {p0, p1}, Lorg/researchstack/backbone/ui/PinCodeActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v1

    goto :goto_0
.end method

.method protected onPause()V
    .locals 3

    .prologue
    .line 200
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->hideKeyboard()V

    .line 201
    invoke-super {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->onPause()V

    .line 203
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    sget-object v1, Lorg/researchstack/backbone/task/Task$ViewChangeType;->ActivityPause:Lorg/researchstack/backbone/task/Task$ViewChangeType;

    iget-object v2, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v0, v1, p0, v2}, Lorg/researchstack/backbone/task/Task;->onViewChange(Lorg/researchstack/backbone/task/Task$ViewChangeType;Lorg/researchstack/backbone/ui/ViewTaskActivity;Lorg/researchstack/backbone/step/Step;)V

    .line 204
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->getLayoutForStep(Lorg/researchstack/backbone/step/Step;)Lorg/researchstack/backbone/ui/step/layout/StepLayout;

    move-result-object v0

    iget-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    invoke-interface {v0, v1}, Lorg/researchstack/backbone/ui/step/layout/StepLayout;->onViewChange(Lorg/researchstack/backbone/step/Step;)V

    .line 207
    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 3

    .prologue
    .line 211
    invoke-super {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->onResume()V

    .line 212
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    sget-object v1, Lorg/researchstack/backbone/task/Task$ViewChangeType;->ActivityResume:Lorg/researchstack/backbone/task/Task$ViewChangeType;

    iget-object v2, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v0, v1, p0, v2}, Lorg/researchstack/backbone/task/Task;->onViewChange(Lorg/researchstack/backbone/task/Task$ViewChangeType;Lorg/researchstack/backbone/ui/ViewTaskActivity;Lorg/researchstack/backbone/step/Step;)V

    .line 213
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    if-eqz v0, :cond_0

    .line 214
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->getLayoutForStep(Lorg/researchstack/backbone/step/Step;)Lorg/researchstack/backbone/ui/step/layout/StepLayout;

    move-result-object v0

    iget-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    invoke-interface {v0, v1}, Lorg/researchstack/backbone/ui/step/layout/StepLayout;->onViewChange(Lorg/researchstack/backbone/step/Step;)V

    .line 216
    :cond_0
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "outState"    # Landroid/os/Bundle;

    .prologue
    .line 265
    invoke-super {p0, p1}, Lorg/researchstack/backbone/ui/PinCodeActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 266
    const-string v0, "ViewTaskActivity.ExtraTask"

    iget-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 267
    const-string v0, "ViewTaskActivity.ExtraTaskResult"

    iget-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->taskResult:Lorg/researchstack/backbone/result/TaskResult;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 268
    const-string v0, "ViewTaskActivity.ExtraStep"

    iget-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 269
    return-void
.end method

.method public onSaveStep(ILorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V
    .locals 1
    .param p1, "action"    # I
    .param p2, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p3, "result"    # Lorg/researchstack/backbone/result/StepResult;

    .prologue
    .line 302
    invoke-virtual {p2}, Lorg/researchstack/backbone/step/Step;->getIdentifier()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p3}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->onSaveStepResult(Ljava/lang/String;Lorg/researchstack/backbone/result/StepResult;)V

    .line 303
    invoke-virtual {p0, p1}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->onExecuteStepAction(I)V

    .line 304
    return-void
.end method

.method protected onSaveStepResult(Ljava/lang/String;Lorg/researchstack/backbone/result/StepResult;)V
    .locals 1
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "result"    # Lorg/researchstack/backbone/result/StepResult;

    .prologue
    .line 308
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->taskResult:Lorg/researchstack/backbone/result/TaskResult;

    invoke-virtual {v0, p1, p2}, Lorg/researchstack/backbone/result/TaskResult;->setStepResultForStepIdentifier(Ljava/lang/String;Lorg/researchstack/backbone/result/StepResult;)V

    .line 309
    return-void
.end method

.method protected onStop()V
    .locals 3

    .prologue
    .line 220
    invoke-super {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->onStop()V

    .line 221
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    sget-object v1, Lorg/researchstack/backbone/task/Task$ViewChangeType;->ActivityStop:Lorg/researchstack/backbone/task/Task$ViewChangeType;

    iget-object v2, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {v0, v1, p0, v2}, Lorg/researchstack/backbone/task/Task;->onViewChange(Lorg/researchstack/backbone/task/Task$ViewChangeType;Lorg/researchstack/backbone/ui/ViewTaskActivity;Lorg/researchstack/backbone/step/Step;)V

    .line 222
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    if-eqz v0, :cond_0

    .line 223
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->getLayoutForStep(Lorg/researchstack/backbone/step/Step;)Lorg/researchstack/backbone/ui/step/layout/StepLayout;

    move-result-object v0

    iget-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    invoke-interface {v0, v1}, Lorg/researchstack/backbone/ui/step/layout/StepLayout;->onViewChange(Lorg/researchstack/backbone/step/Step;)V

    .line 224
    iget-boolean v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->userHasCompletedThisTask:Z

    if-nez v0, :cond_0

    .line 225
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/task/Task;->willStop(Z)V

    .line 228
    :cond_0
    return-void
.end method

.method public setActionBarTitle(Ljava/lang/String;)V
    .locals 1
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 372
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    .line 373
    .local v0, "actionBar":Landroid/support/v7/app/ActionBar;
    if-eqz v0, :cond_0

    .line 375
    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 377
    :cond_0
    return-void
.end method

.method protected showNextStep()V
    .locals 4

    .prologue
    .line 95
    iget-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    iget-object v2, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    iget-object v3, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->taskResult:Lorg/researchstack/backbone/result/TaskResult;

    invoke-virtual {v1, v2, v3}, Lorg/researchstack/backbone/task/Task;->getStepAfterStep(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/TaskResult;)Lorg/researchstack/backbone/step/Step;

    move-result-object v0

    .line 96
    .local v0, "nextStep":Lorg/researchstack/backbone/step/Step;
    if-nez v0, :cond_0

    .line 98
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->saveAndFinish()V

    .line 99
    iget-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lorg/researchstack/backbone/task/Task;->willStop(Z)V

    .line 105
    :goto_0
    return-void

    .line 103
    :cond_0
    invoke-direct {p0, v0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->showStep(Lorg/researchstack/backbone/step/Step;)V

    goto :goto_0
.end method

.method protected showPreviousStep()V
    .locals 4

    .prologue
    .line 109
    iget-object v1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->task:Lorg/researchstack/backbone/task/Task;

    iget-object v2, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->currentStep:Lorg/researchstack/backbone/step/Step;

    iget-object v3, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity;->taskResult:Lorg/researchstack/backbone/result/TaskResult;

    invoke-virtual {v1, v2, v3}, Lorg/researchstack/backbone/task/Task;->getStepBeforeStep(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/TaskResult;)Lorg/researchstack/backbone/step/Step;

    move-result-object v0

    .line 110
    .local v0, "previousStep":Lorg/researchstack/backbone/step/Step;
    if-nez v0, :cond_0

    .line 112
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->finish()V

    .line 118
    :goto_0
    return-void

    .line 116
    :cond_0
    invoke-direct {p0, v0}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->showStep(Lorg/researchstack/backbone/step/Step;)V

    goto :goto_0
.end method
