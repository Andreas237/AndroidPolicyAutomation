.class public Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity_ViewBinding;
.super Ljava/lang/Object;
.source "VerifyWizardActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;

.field private view7f090095:Landroid/view/View;

.field private view7f0900b4:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;

    const-string v0, "field \'tvInitializing\'"

    .line 33
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090532

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->tvInitializing:Landroid/widget/TextView;

    const-string v0, "field \'llMainContent\'"

    .line 34
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090316

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->llMainContent:Landroid/widget/LinearLayout;

    const-string v0, "field \'tvQuestion\'"

    .line 35
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090562

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->tvQuestion:Landroid/widget/TextView;

    const-string v0, "field \'tvName\'"

    .line 36
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09054d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->tvName:Landroid/widget/TextView;

    const-string v0, "method \'onNoClicked\'"

    const v1, 0x7f090095

    .line 37
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 38
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity_ViewBinding;->view7f090095:Landroid/view/View;

    .line 39
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f0900b4

    const-string v1, "method \'onYesClicked\'"

    .line 45
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 46
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity_ViewBinding;->view7f0900b4:Landroid/view/View;

    .line 47
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity_ViewBinding$2;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_1

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 60
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;

    .line 62
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->tvInitializing:Landroid/widget/TextView;

    .line 63
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->llMainContent:Landroid/widget/LinearLayout;

    .line 64
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->tvQuestion:Landroid/widget/TextView;

    .line 65
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;->tvName:Landroid/widget/TextView;

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity_ViewBinding;->view7f090095:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 68
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity_ViewBinding;->view7f090095:Landroid/view/View;

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity_ViewBinding;->view7f0900b4:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 70
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity_ViewBinding;->view7f0900b4:Landroid/view/View;

    return-void

    .line 59
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
