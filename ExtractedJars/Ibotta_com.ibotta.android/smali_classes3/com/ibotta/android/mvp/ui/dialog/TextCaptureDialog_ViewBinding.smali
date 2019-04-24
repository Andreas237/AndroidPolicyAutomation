.class public Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog_ViewBinding;
.super Ljava/lang/Object;
.source "TextCaptureDialog_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;

.field private view7f090502:Landroid/view/View;

.field private view7f090573:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;

    const-string v0, "field \'etInput\'"

    .line 33
    const-class v1, Landroid/widget/EditText;

    const v2, 0x7f0901cb

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->etInput:Landroid/widget/EditText;

    const-string v0, "field \'tvInstructions\'"

    .line 34
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090534

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->tvInstructions:Landroid/widget/TextView;

    const-string v0, "field \'tvShoppingTripId\'"

    .line 35
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090575

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->tvShoppingTripId:Landroid/widget/TextView;

    const-string v0, "field \'tvSend\' and method \'onSend\'"

    const v1, 0x7f090573

    .line 36
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'tvSend\'"

    .line 37
    const-class v3, Landroid/widget/TextView;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->tvSend:Landroid/widget/TextView;

    .line 38
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog_ViewBinding;->view7f090573:Landroid/view/View;

    .line 39
    new-instance v1, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog_ViewBinding;Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const-string v0, "field \'tvCancel\' and method \'onCancel\'"

    const v1, 0x7f090502

    .line 45
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    const-string v0, "field \'tvCancel\'"

    .line 46
    const-class v2, Landroid/widget/TextView;

    invoke-static {p2, v1, v0, v2}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->tvCancel:Landroid/widget/TextView;

    .line 47
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog_ViewBinding;->view7f090502:Landroid/view/View;

    .line 48
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog_ViewBinding$2;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog_ViewBinding;Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;)V

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

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 61
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;

    .line 63
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->etInput:Landroid/widget/EditText;

    .line 64
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->tvInstructions:Landroid/widget/TextView;

    .line 65
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->tvShoppingTripId:Landroid/widget/TextView;

    .line 66
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->tvSend:Landroid/widget/TextView;

    .line 67
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->tvCancel:Landroid/widget/TextView;

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog_ViewBinding;->view7f090573:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 70
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog_ViewBinding;->view7f090573:Landroid/view/View;

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog_ViewBinding;->view7f090502:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 72
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog_ViewBinding;->view7f090502:Landroid/view/View;

    return-void

    .line 60
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
