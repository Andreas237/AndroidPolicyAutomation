.class public Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_ViewBinding;
.super Ljava/lang/Object;
.source "ButtonSdkWelcomeBackDialog_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;

.field private view7f090089:Landroid/view/View;

.field private view7f090231:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 27
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;

    const-string v0, "field \'ibClose\' and method \'onCloseClicked\'"

    const v1, 0x7f090231

    .line 36
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'ibClose\'"

    .line 37
    const-class v3, Landroid/widget/ImageButton;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageButton;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->ibClose:Landroid/widget/ImageButton;

    .line 38
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_ViewBinding;->view7f090231:Landroid/view/View;

    .line 39
    new-instance v1, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_ViewBinding;Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f0901ed

    const-string v1, "field \'flContentContainer\'"

    .line 45
    const-class v2, Landroid/widget/FrameLayout;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->flContentContainer:Landroid/widget/FrameLayout;

    const-string v0, "field \'bGotIt\' and method \'onGotItClicked\'"

    const v1, 0x7f090089

    .line 46
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bGotIt\'"

    .line 47
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->bGotIt:Landroid/widget/Button;

    .line 48
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_ViewBinding;->view7f090089:Landroid/view/View;

    .line 49
    new-instance v1, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_ViewBinding$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_ViewBinding;Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const v0, 0x7f090574

    const-string v1, "field \'tvShoppingTrip\'"

    .line 55
    const-class v2, Landroid/widget/TextView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->tvShoppingTrip:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 63
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;

    .line 65
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->ibClose:Landroid/widget/ImageButton;

    .line 66
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->flContentContainer:Landroid/widget/FrameLayout;

    .line 67
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->bGotIt:Landroid/widget/Button;

    .line 68
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog;->tvShoppingTrip:Landroid/widget/TextView;

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_ViewBinding;->view7f090231:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 71
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_ViewBinding;->view7f090231:Landroid/view/View;

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_ViewBinding;->view7f090089:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 73
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/ButtonSdkWelcomeBackDialog_ViewBinding;->view7f090089:Landroid/view/View;

    return-void

    .line 62
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
