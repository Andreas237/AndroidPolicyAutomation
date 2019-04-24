.class public Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding;
.super Ljava/lang/Object;
.source "ImConnectedAccountDialog_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/view/ImConnectedAccountDialog;

.field private view7f09024d:Landroid/view/View;

.field private view7f09024e:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/ImConnectedAccountDialog;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding;-><init>(Lcom/ibotta/android/view/ImConnectedAccountDialog;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/view/ImConnectedAccountDialog;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding;->target:Lcom/ibotta/android/view/ImConnectedAccountDialog;

    const-string v0, "field \'icavImage\'"

    .line 34
    const-class v1, Lcom/ibotta/android/views/im/connection/ImConnectionAnimationView;

    const v2, 0x7f090250

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/im/connection/ImConnectionAnimationView;

    iput-object v0, p1, Lcom/ibotta/android/view/ImConnectedAccountDialog;->icavImage:Lcom/ibotta/android/views/im/connection/ImConnectionAnimationView;

    const-string v0, "field \'tvTitle\'"

    .line 35
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090251

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/view/ImConnectedAccountDialog;->tvTitle:Landroid/widget/TextView;

    const-string v0, "field \'tvDescription\'"

    .line 36
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09024f

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/view/ImConnectedAccountDialog;->tvDescription:Landroid/widget/TextView;

    const-string v0, "field \'bViewOffers\' and method \'onConnectedButtonClick\'"

    const v1, 0x7f09024d

    .line 37
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bViewOffers\'"

    .line 38
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/view/ImConnectedAccountDialog;->bViewOffers:Landroid/widget/Button;

    .line 39
    iput-object v0, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding;->view7f09024d:Landroid/view/View;

    .line 40
    new-instance v1, Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding$1;-><init>(Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding;Lcom/ibotta/android/view/ImConnectedAccountDialog;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f090519

    const-string v1, "field \'tvDisclaimer\'"

    .line 46
    const-class v2, Landroid/widget/TextView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/view/ImConnectedAccountDialog;->tvDisclaimer:Landroid/widget/TextView;

    const v0, 0x7f09024e

    const-string v1, "method \'onCloseButtonClick\'"

    .line 47
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 48
    iput-object p2, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding;->view7f09024e:Landroid/view/View;

    .line 49
    new-instance v0, Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding$2;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding$2;-><init>(Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding;Lcom/ibotta/android/view/ImConnectedAccountDialog;)V

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

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding;->target:Lcom/ibotta/android/view/ImConnectedAccountDialog;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 62
    iput-object v1, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding;->target:Lcom/ibotta/android/view/ImConnectedAccountDialog;

    .line 64
    iput-object v1, v0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->icavImage:Lcom/ibotta/android/views/im/connection/ImConnectionAnimationView;

    .line 65
    iput-object v1, v0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->tvTitle:Landroid/widget/TextView;

    .line 66
    iput-object v1, v0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->tvDescription:Landroid/widget/TextView;

    .line 67
    iput-object v1, v0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->bViewOffers:Landroid/widget/Button;

    .line 68
    iput-object v1, v0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->tvDisclaimer:Landroid/widget/TextView;

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding;->view7f09024d:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 71
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding;->view7f09024d:Landroid/view/View;

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding;->view7f09024e:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 73
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog_ViewBinding;->view7f09024e:Landroid/view/View;

    return-void

    .line 61
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
