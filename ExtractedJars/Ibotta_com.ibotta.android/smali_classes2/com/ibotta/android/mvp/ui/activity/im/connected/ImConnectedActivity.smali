.class public Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "ImConnectedActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;",
        "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewEvents;",
        ">;"
    }
.end annotation


# instance fields
.field protected bReceiptUpload:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09009a
    .end annotation
.end field

.field protected clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900f6
    .end annotation
.end field

.field private retailerId:I

.field protected tvNoCashBack:Lcom/ibotta/android/views/base/text/LinkTextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054f
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private initButton(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;)V
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->bReceiptUpload:Landroid/widget/Button;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;->getButtonText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initImDetailHeader(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;)V
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;->getImDetailHeaderViewState()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->updateViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)V

    return-void
.end method

.method private initLoginInstructions(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;)V
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->tvNoCashBack:Lcom/ibotta/android/views/base/text/LinkTextView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;->getLinkTextViewState()Lcom/ibotta/android/views/base/text/LinkTextViewState;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/text/LinkTextView;->updateViewState(Lcom/ibotta/android/views/base/text/LinkTextViewState;)V

    return-void
.end method

.method private initToolbar()V
    .locals 2

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method static synthetic lambda$bindViewEvents$0(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewEvents;Landroid/view/View;)V
    .locals 0

    .line 79
    invoke-interface {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewEvents;->onUploadReceiptTapped()V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const-string v0, "retailer_id"

    .line 57
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->retailerId:I

    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 59
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "retailer_id"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->retailerId:I

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public bindViewEvents(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewEvents;)V
    .locals 3

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->bReceiptUpload:Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/im/connected/-$$Lambda$ImConnectedActivity$kQ42R2bBfC-nNAdg7DGv3pMH4I4;

    invoke-direct {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/-$$Lambda$ImConnectedActivity$kQ42R2bBfC-nNAdg7DGv3pMH4I4;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewEvents;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 80
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->tvNoCashBack:Lcom/ibotta/android/views/base/text/LinkTextView;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/im/connected/-$$Lambda$rID0pvJuQyeAYz91o1tVo4RmgqM;

    invoke-direct {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/-$$Lambda$rID0pvJuQyeAYz91o1tVo4RmgqM;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewEvents;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/text/LinkTextView;->bindViewEvents(Lcom/ibotta/android/views/components/ClickableViewEvent;)V

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 23
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->bindViewEvents(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewEvents;)V

    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedComponent;
    .locals 1

    .line 33
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;

    move-result-object v0

    .line 34
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedModule;

    invoke-direct {v0, p0, p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;Lcom/ibotta/android/views/components/ViewComponent;)V

    .line 35
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;->imConnectedModule(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedModule;)Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;

    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/DaggerImConnectedComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedComponent;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 23
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedComponent;)V
    .locals 0

    .line 41
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 46
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 47
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c003e

    .line 49
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->setContentView(I)V

    .line 50
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 52
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenter;

    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->retailerId:I

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenter;->setRetailerId(I)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 65
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "retailer_id"

    .line 66
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->retailerId:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public showWebView(Ljava/lang/String;)V
    .locals 1

    .line 101
    new-instance v0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->forUrl(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 102
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;)V
    .locals 0
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 71
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->initToolbar()V

    .line 72
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->initImDetailHeader(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;)V

    .line 73
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->initButton(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;)V

    .line 74
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->initLoginInstructions(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 23
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;->updateViewState(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;)V

    return-void
.end method
