.class public Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding;
.super Ljava/lang/Object;
.source "ImNoActivatedOffersDialog_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/view/ImNoActivatedOffersDialog;

.field private view7f090252:Landroid/view/View;

.field private view7f090255:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/ImNoActivatedOffersDialog;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding;-><init>(Lcom/ibotta/android/view/ImNoActivatedOffersDialog;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/view/ImNoActivatedOffersDialog;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding;->target:Lcom/ibotta/android/view/ImNoActivatedOffersDialog;

    const-string v0, "field \'ivOkayButton\' and method \'onClick\'"

    const v1, 0x7f090255

    .line 35
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'ivOkayButton\'"

    .line 36
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->ivOkayButton:Landroid/widget/Button;

    .line 37
    iput-object v0, p0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding;->view7f090255:Landroid/view/View;

    .line 38
    new-instance v1, Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding$1;-><init>(Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding;Lcom/ibotta/android/view/ImNoActivatedOffersDialog;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f090253

    const-string v1, "field \'tvDescription\'"

    .line 44
    const-class v2, Landroid/widget/TextView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->tvDescription:Landroid/widget/TextView;

    const-string v0, "field \'ivCloseButton\' and method \'onClick\'"

    const v1, 0x7f090252

    .line 45
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    const-string v0, "field \'ivCloseButton\'"

    .line 46
    const-class v2, Landroid/widget/ImageView;

    invoke-static {p2, v1, v0, v2}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->ivCloseButton:Landroid/widget/ImageView;

    .line 47
    iput-object p2, p0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding;->view7f090252:Landroid/view/View;

    .line 48
    new-instance v0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding$2;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding$2;-><init>(Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding;Lcom/ibotta/android/view/ImNoActivatedOffersDialog;)V

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
    iget-object v0, p0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding;->target:Lcom/ibotta/android/view/ImNoActivatedOffersDialog;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 61
    iput-object v1, p0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding;->target:Lcom/ibotta/android/view/ImNoActivatedOffersDialog;

    .line 63
    iput-object v1, v0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->ivOkayButton:Landroid/widget/Button;

    .line 64
    iput-object v1, v0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->tvDescription:Landroid/widget/TextView;

    .line 65
    iput-object v1, v0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->ivCloseButton:Landroid/widget/ImageView;

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding;->view7f090255:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 68
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding;->view7f090255:Landroid/view/View;

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding;->view7f090252:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 70
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog_ViewBinding;->view7f090252:Landroid/view/View;

    return-void

    .line 60
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
