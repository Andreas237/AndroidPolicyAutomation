.class public Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;
.super Landroid/support/v4/view/ActionProvider;
.source "CurrentBalanceActionProvider.java"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/view/ActionProvider;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/featured/CurrentBalanceViewState;",
        "Lcom/ibotta/android/views/featured/CurrentBalanceViewEvents;",
        ">;"
    }
.end annotation


# instance fields
.field private balance:Ljava/lang/String;

.field private currentBalanceViewEvents:Lcom/ibotta/android/views/featured/CurrentBalanceViewEvents;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private tvBalance:Landroid/widget/TextView;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Landroid/support/v4/view/ActionProvider;-><init>(Landroid/content/Context;)V

    const-string p1, "$0.00"

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;->balance:Ljava/lang/String;

    return-void
.end method

.method private initView()V
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;->tvBalance:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 44
    iget-object v1, p0, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;->balance:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$onCreateActionView$0(Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;Landroid/view/View;)V
    .locals 0

    .line 52
    iget-object p1, p0, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;->currentBalanceViewEvents:Lcom/ibotta/android/views/featured/CurrentBalanceViewEvents;

    if-eqz p1, :cond_0

    .line 53
    invoke-interface {p1}, Lcom/ibotta/android/views/featured/CurrentBalanceViewEvents;->onBalanceClicked()V

    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 20
    check-cast p1, Lcom/ibotta/android/views/featured/CurrentBalanceViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;->bindViewEvents(Lcom/ibotta/android/views/featured/CurrentBalanceViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/featured/CurrentBalanceViewEvents;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;->currentBalanceViewEvents:Lcom/ibotta/android/views/featured/CurrentBalanceViewEvents;

    return-void
.end method

.method public onCreateActionView()Landroid/view/View;
    .locals 3

    .line 50
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0143

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;->tvBalance:Landroid/widget/TextView;

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;->tvBalance:Landroid/widget/TextView;

    new-instance v1, Lcom/ibotta/android/fragment/home/-$$Lambda$CurrentBalanceActionProvider$XSmIiwtgsAHzDD7JVCUKV50uEnA;

    invoke-direct {v1, p0}, Lcom/ibotta/android/fragment/home/-$$Lambda$CurrentBalanceActionProvider$XSmIiwtgsAHzDD7JVCUKV50uEnA;-><init>(Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 56
    :goto_0
    invoke-direct {p0}, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;->initView()V

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;->tvBalance:Landroid/widget/TextView;

    return-object v0
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 20
    check-cast p1, Lcom/ibotta/android/views/featured/CurrentBalanceViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;->updateViewState(Lcom/ibotta/android/views/featured/CurrentBalanceViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/featured/CurrentBalanceViewState;)V
    .locals 0

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/views/featured/CurrentBalanceViewState;->getBalance()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;->balance:Ljava/lang/String;

    .line 39
    invoke-direct {p0}, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;->initView()V

    return-void
.end method
