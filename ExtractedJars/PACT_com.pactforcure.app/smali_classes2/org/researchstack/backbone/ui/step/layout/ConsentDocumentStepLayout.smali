.class public Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;
.super Landroid/widget/LinearLayout;
.source "ConsentDocumentStepLayout.java"

# interfaces
.implements Lorg/researchstack/backbone/ui/step/layout/StepLayout;


# instance fields
.field private callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

.field private confirmationDialogBody:Ljava/lang/String;

.field private htmlContent:Ljava/lang/String;

.field private step:Lorg/researchstack/backbone/step/ConsentDocumentStep;

.field private stepResult:Lorg/researchstack/backbone/result/StepResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/researchstack/backbone/result/StepResult",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 39
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 49
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 50
    return-void
.end method

.method private initializeStep()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 98
    invoke-virtual {p0, v4}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->setOrientation(I)V

    .line 99
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lorg/researchstack/backbone/R$layout;->rsb_step_layout_consent_doc:I

    invoke-virtual {v2, v3, p0, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 101
    sget v2, Lorg/researchstack/backbone/R$id;->webview:I

    invoke-virtual {p0, v2}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    .line 102
    .local v0, "pdfView":Landroid/webkit/WebView;
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->htmlContent:Ljava/lang/String;

    const-string v3, "text/html; charset=UTF-8"

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v4}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    sget v2, Lorg/researchstack/backbone/R$id;->submit_bar:I

    invoke-virtual {p0, v2}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lorg/researchstack/backbone/ui/views/SubmitBar;

    .line 105
    .local v1, "submitBar":Lorg/researchstack/backbone/ui/views/SubmitBar;
    invoke-static {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$1;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;)Lrx/functions/Action1;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/researchstack/backbone/ui/views/SubmitBar;->setPositiveAction(Lrx/functions/Action1;)V

    .line 106
    invoke-static {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$2;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;)Lrx/functions/Action1;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/researchstack/backbone/ui/views/SubmitBar;->setNegativeAction(Lrx/functions/Action1;)V

    .line 107
    return-void
.end method

.method static synthetic lambda$initializeStep$29(Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;Ljava/lang/Object;)V
    .locals 0
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;
    .param p1, "v"    # Ljava/lang/Object;

    .prologue
    .line 105
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->showDialog()V

    return-void
.end method

.method static synthetic lambda$initializeStep$30(Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;Ljava/lang/Object;)V
    .locals 1
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;
    .param p1, "v"    # Ljava/lang/Object;

    .prologue
    .line 106
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    invoke-interface {v0}, Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;->onCancelStep()V

    return-void
.end method

.method static synthetic lambda$showDialog$31(Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;Landroid/content/DialogInterface;I)V
    .locals 4
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    const/4 v3, 0x1

    .line 115
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->stepResult:Lorg/researchstack/backbone/result/StepResult;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    .line 116
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->step:Lorg/researchstack/backbone/step/ConsentDocumentStep;

    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->stepResult:Lorg/researchstack/backbone/result/StepResult;

    invoke-interface {v0, v3, v1, v2}, Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;->onSaveStep(ILorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V

    .line 117
    return-void
.end method

.method static synthetic lambda$showDialog$32(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p0, "dialog"    # Landroid/content/DialogInterface;
    .param p1, "which"    # I

    .prologue
    .line 120
    return-void
.end method

.method private showDialog()V
    .locals 3

    .prologue
    .line 111
    new-instance v0, Landroid/support/v7/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lorg/researchstack/backbone/R$string;->rsb_consent_review_alert_title:I

    invoke-virtual {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setTitle(I)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->confirmationDialogBody:Ljava/lang/String;

    .line 112
    invoke-virtual {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 113
    invoke-virtual {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setCancelable(Z)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lorg/researchstack/backbone/R$string;->rsb_agree:I

    invoke-static {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$3;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;)Landroid/content/DialogInterface$OnClickListener;

    move-result-object v2

    .line 114
    invoke-virtual {v0, v1, v2}, Landroid/support/v7/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lorg/researchstack/backbone/R$string;->rsb_consent_review_cancel:I

    invoke-static {}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$4;->lambdaFactory$()Landroid/content/DialogInterface$OnClickListener;

    move-result-object v2

    .line 118
    invoke-virtual {v0, v1, v2}, Landroid/support/v7/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v0

    .line 121
    invoke-virtual {v0}, Landroid/support/v7/app/AlertDialog$Builder;->show()Landroid/support/v7/app/AlertDialog;

    .line 122
    return-void
.end method


# virtual methods
.method public clearViews()V
    .locals 0

    .prologue
    .line 132
    return-void
.end method

.method public getLayout()Landroid/view/View;
    .locals 0

    .prologue
    .line 71
    return-object p0
.end method

.method public initialize(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V
    .locals 1
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "result"    # Lorg/researchstack/backbone/result/StepResult;

    .prologue
    .line 55
    move-object v0, p1

    check-cast v0, Lorg/researchstack/backbone/step/ConsentDocumentStep;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->step:Lorg/researchstack/backbone/step/ConsentDocumentStep;

    move-object v0, p1

    .line 56
    check-cast v0, Lorg/researchstack/backbone/step/ConsentDocumentStep;

    invoke-virtual {v0}, Lorg/researchstack/backbone/step/ConsentDocumentStep;->getConfirmMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->confirmationDialogBody:Ljava/lang/String;

    move-object v0, p1

    .line 57
    check-cast v0, Lorg/researchstack/backbone/step/ConsentDocumentStep;

    invoke-virtual {v0}, Lorg/researchstack/backbone/step/ConsentDocumentStep;->getConsentHTML()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->htmlContent:Ljava/lang/String;

    .line 58
    iput-object p2, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->stepResult:Lorg/researchstack/backbone/result/StepResult;

    .line 60
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->stepResult:Lorg/researchstack/backbone/result/StepResult;

    if-nez v0, :cond_0

    .line 62
    new-instance v0, Lorg/researchstack/backbone/result/StepResult;

    invoke-direct {v0, p1}, Lorg/researchstack/backbone/result/StepResult;-><init>(Lorg/researchstack/backbone/step/Step;)V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->stepResult:Lorg/researchstack/backbone/result/StepResult;

    .line 65
    :cond_0
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->initializeStep()V

    .line 66
    return-void
.end method

.method public isBackEventConsumed()Z
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 77
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->stepResult:Lorg/researchstack/backbone/result/StepResult;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/result/StepResult;->setResult(Ljava/lang/Object;)V

    .line 78
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    const/4 v1, -0x1

    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->step:Lorg/researchstack/backbone/step/ConsentDocumentStep;

    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->stepResult:Lorg/researchstack/backbone/result/StepResult;

    invoke-interface {v0, v1, v2, v3}, Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;->onSaveStep(ILorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V

    .line 79
    return v4
.end method

.method public onRestoreStep(Lorg/researchstack/backbone/step/Step;Ljava/lang/String;)V
    .locals 0
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "answer"    # Ljava/lang/String;

    .prologue
    .line 127
    return-void
.end method

.method public onViewChange(Lorg/researchstack/backbone/step/Step;)V
    .locals 3
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;

    .prologue
    .line 91
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/support/v7/app/AppCompatActivity;

    .line 92
    .local v1, "activity":Landroid/support/v7/app/AppCompatActivity;
    invoke-virtual {v1}, Landroid/support/v7/app/AppCompatActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    .line 93
    .local v0, "actionBar":Landroid/support/v7/app/ActionBar;
    invoke-virtual {p1}, Lorg/researchstack/backbone/step/Step;->allowsBackNavigation()Z

    move-result v2

    invoke-static {v0, v2}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;->toggleBackNavigation(Landroid/support/v7/app/ActionBar;Z)V

    .line 94
    return-void
.end method

.method public setCallbacks(Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;)V
    .locals 0
    .param p1, "callbacks"    # Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    .prologue
    .line 85
    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    .line 86
    return-void
.end method
