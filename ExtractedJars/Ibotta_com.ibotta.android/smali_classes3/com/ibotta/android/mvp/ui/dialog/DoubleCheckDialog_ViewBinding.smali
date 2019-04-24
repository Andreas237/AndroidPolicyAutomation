.class public Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding;
.super Ljava/lang/Object;
.source "DoubleCheckDialog_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;

.field private view7f09007f:Landroid/view/View;

.field private view7f090084:Landroid/view/View;

.field private view7f09029e:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 27
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;

    const-string v0, "field \'bCancel\' and method \'onCancelClicked\'"

    const v1, 0x7f09007f

    .line 35
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bCancel\'"

    .line 36
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->bCancel:Landroid/widget/Button;

    .line 37
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding;->view7f09007f:Landroid/view/View;

    .line 38
    new-instance v1, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding;Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const-string v0, "field \'bContinue\' and method \'onContinue\'"

    const v1, 0x7f090084

    .line 44
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bContinue\'"

    .line 45
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->bContinue:Landroid/widget/Button;

    .line 46
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding;->view7f090084:Landroid/view/View;

    .line 47
    new-instance v1, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding;Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const v0, 0x7f09050a

    const-string v1, "field \'tvCheckFullReceipt\'"

    .line 53
    const-class v2, Landroid/widget/TextView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->tvCheckFullReceipt:Landroid/widget/TextView;

    const v0, 0x7f09029e

    const-string v1, "method \'onCloseClicked\'"

    .line 54
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 55
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding;->view7f09029e:Landroid/view/View;

    .line 56
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding$3;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding$3;-><init>(Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding;Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_2

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_2
    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    .line 69
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;

    .line 71
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->bCancel:Landroid/widget/Button;

    .line 72
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->bContinue:Landroid/widget/Button;

    .line 73
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->tvCheckFullReceipt:Landroid/widget/TextView;

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding;->view7f09007f:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 76
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding;->view7f09007f:Landroid/view/View;

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding;->view7f090084:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 78
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding;->view7f090084:Landroid/view/View;

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding;->view7f09029e:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 80
    :goto_2
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog_ViewBinding;->view7f09029e:Landroid/view/View;

    return-void

    .line 68
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
