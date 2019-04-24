.class public Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity_ViewBinding;
.super Ljava/lang/Object;
.source "ForgotPasswordActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;

.field private view7f0900a0:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 23
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;

    const-string v0, "field \'etEmail\'"

    .line 31
    const-class v1, Landroid/widget/EditText;

    const v2, 0x7f0901c5

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->etEmail:Landroid/widget/EditText;

    const-string v0, "field \'bResetPassword\' and method \'onResetPasswordClicked\'"

    const v1, 0x7f0900a0

    .line 32
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    const-string v0, "field \'bResetPassword\'"

    .line 33
    const-class v2, Landroid/widget/Button;

    invoke-static {p2, v1, v0, v2}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->bResetPassword:Landroid/widget/Button;

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity_ViewBinding;->view7f0900a0:Landroid/view/View;

    .line 35
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity_ViewBinding$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 48
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;

    .line 50
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->etEmail:Landroid/widget/EditText;

    .line 51
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->bResetPassword:Landroid/widget/Button;

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity_ViewBinding;->view7f0900a0:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 54
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity_ViewBinding;->view7f0900a0:Landroid/view/View;

    return-void

    .line 47
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
