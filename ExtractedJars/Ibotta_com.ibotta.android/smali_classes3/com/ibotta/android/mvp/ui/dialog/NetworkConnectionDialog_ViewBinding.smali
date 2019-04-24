.class public Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding;
.super Ljava/lang/Object;
.source "NetworkConnectionDialog_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;

.field private view7f090083:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 23
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;

    const-string v0, "field \'bConnectionErrorCta\' and method \'onCtaButtonClicked\'"

    const v1, 0x7f090083

    .line 31
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bConnectionErrorCta\'"

    .line 32
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;->bConnectionErrorCta:Landroid/widget/Button;

    .line 33
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding;->view7f090083:Landroid/view/View;

    .line 34
    new-instance v1, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding;Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f090548

    const-string v1, "field \'tvMessage\'"

    .line 40
    const-class v2, Landroid/widget/TextView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;->tvMessage:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 48
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;

    .line 50
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;->bConnectionErrorCta:Landroid/widget/Button;

    .line 51
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;->tvMessage:Landroid/widget/TextView;

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding;->view7f090083:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 54
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog_ViewBinding;->view7f090083:Landroid/view/View;

    return-void

    .line 47
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
