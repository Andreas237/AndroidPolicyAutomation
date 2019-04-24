.class public Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView_ViewBinding;
.super Ljava/lang/Object;
.source "SpotlightUnlockView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;

.field private view7f0900a7:Landroid/view/View;

.field private view7f090237:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;

    const-string v0, "field \'ibUnlock\' and method \'onUnlockClicked\'"

    const v1, 0x7f090237

    .line 33
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'ibUnlock\'"

    .line 34
    const-class v3, Landroid/widget/ImageButton;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageButton;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->ibUnlock:Landroid/widget/ImageButton;

    .line 35
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView_ViewBinding;->view7f090237:Landroid/view/View;

    .line 36
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const-string v0, "field \'bShop\' and method \'onShopClicked\'"

    const v1, 0x7f0900a7

    .line 42
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    const-string v0, "field \'bShop\'"

    .line 43
    const-class v2, Landroid/widget/Button;

    invoke-static {p2, v1, v0, v2}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->bShop:Landroid/widget/Button;

    .line 44
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView_ViewBinding;->view7f0900a7:Landroid/view/View;

    .line 45
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView_ViewBinding$2;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;)V

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

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 58
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;

    .line 60
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->ibUnlock:Landroid/widget/ImageButton;

    .line 61
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->bShop:Landroid/widget/Button;

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView_ViewBinding;->view7f090237:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 64
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView_ViewBinding;->view7f090237:Landroid/view/View;

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView_ViewBinding;->view7f0900a7:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 66
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView_ViewBinding;->view7f0900a7:Landroid/view/View;

    return-void

    .line 57
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
