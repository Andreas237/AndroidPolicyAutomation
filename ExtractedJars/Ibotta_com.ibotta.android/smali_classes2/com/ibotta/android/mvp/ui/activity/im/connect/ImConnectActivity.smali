.class public Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "ImConnectActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;",
        "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewEvents;",
        ">;"
    }
.end annotation


# instance fields
.field protected bImConnect:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09008b
    .end annotation
.end field

.field protected clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900f6
    .end annotation
.end field

.field protected handler:Landroid/os/Handler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private retailerId:I

.field protected tvCreateLink:Lcom/ibotta/android/views/base/text/LinkTextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090510
    .end annotation
.end field

.field protected tvDisclaimer:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090519
    .end annotation
.end field

.field private viewEvents:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewEvents;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->viewEvents:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewEvents;

    return-void
.end method

.method private initButton(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;)V
    .locals 2

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->bImConnect:Landroid/widget/Button;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->getButtonText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 112
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->initButtonAction(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;)V

    return-void
.end method

.method private initButtonAction(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;)V
    .locals 2

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->bImConnect:Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/im/connect/-$$Lambda$ImConnectActivity$aOhOaj-dv5k88r4ROLJT13n62oE;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/-$$Lambda$ImConnectActivity$aOhOaj-dv5k88r4ROLJT13n62oE;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;)V

    instance-of p1, v0, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private initDisclaimer(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;)V
    .locals 1

    .line 96
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->getDisclaimer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->tvDisclaimer:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->getDisclaimer()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->tvDisclaimer:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private initImDetailHeader(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;)V
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->getImDetailHeaderViewState()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->updateViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)V

    return-void
.end method

.method private initLoginLinkText(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;)V
    .locals 2

    .line 120
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->getLinkTextViewState()Lcom/ibotta/android/views/base/text/LinkTextViewState;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/views/base/text/LinkTextViewState;->EMPTY:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    if-eq v0, v1, :cond_0

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->tvCreateLink:Lcom/ibotta/android/views/base/text/LinkTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/text/LinkTextView;->setVisibility(I)V

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->tvCreateLink:Lcom/ibotta/android/views/base/text/LinkTextView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->getLinkTextViewState()Lcom/ibotta/android/views/base/text/LinkTextViewState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/text/LinkTextView;->updateViewState(Lcom/ibotta/android/views/base/text/LinkTextViewState;)V

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->tvCreateLink:Lcom/ibotta/android/views/base/text/LinkTextView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/im/connect/-$$Lambda$ImConnectActivity$dzAX87RrAEvF6VRyN-w6-fnq-nY;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/-$$Lambda$ImConnectActivity$dzAX87RrAEvF6VRyN-w6-fnq-nY;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/text/LinkTextView;->bindViewEvents(Lcom/ibotta/android/views/components/ClickableViewEvent;)V

    :cond_0
    return-void
.end method

.method private initToolbar()V
    .locals 2

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic lambda$initButtonAction$0(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;Landroid/view/View;)V
    .locals 0

    .line 116
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->getButtonAction()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->onAction(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;)V

    return-void
.end method

.method public static synthetic lambda$initLoginLinkText$1(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;)V
    .locals 0

    .line 123
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->getLinkAction()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->onAction(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const-string v0, "retailer_id"

    .line 74
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->retailerId:I

    goto :goto_0

    .line 75
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "retailer_id"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->retailerId:I

    :cond_1
    :goto_0
    return-void
.end method

.method private onAction(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;)V
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->viewEvents:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewEvents;

    if-eqz v0, :cond_1

    .line 134
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->LOGIN:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    if-ne p1, v0, :cond_0

    .line 135
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->viewEvents:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewEvents;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewEvents;->onImAccountLoginClicked()V

    goto :goto_0

    .line 136
    :cond_0
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->CREATE:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    if-ne p1, v0, :cond_1

    .line 137
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->viewEvents:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewEvents;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewEvents;->onImAccountCreateClicked()V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public bindViewEvents(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewEvents;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewEvents;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 129
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->viewEvents:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewEvents;

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/components/ViewEvents;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 34
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->bindViewEvents(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewEvents;)V

    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 34
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectComponent;
    .locals 1

    .line 49
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;

    move-result-object v0

    .line 50
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;

    invoke-direct {v0, p0, p0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectView;Lcom/ibotta/android/views/components/ViewComponent;)V

    .line 51
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->imConnectModule(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;)Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;

    move-result-object p1

    .line 52
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/DaggerImConnectComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectComponent;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 34
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectComponent;)V
    .locals 0

    .line 57
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 162
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 p3, 0x1a

    if-eq p1, p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string p2, "Error displaying url"

    .line 177
    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p2, p1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    const-string p2, "User exited, and we did not see the account_created url"

    .line 173
    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p2, p1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_2
    const-string p2, "Success creating IM account"

    .line 167
    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p2, p1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    new-instance p1, Lcom/ibotta/android/routing/intent/ImLoginIntentCreator;

    iget p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->retailerId:I

    const/4 p3, 0x1

    invoke-direct {p1, p0, p2, p3}, Lcom/ibotta/android/routing/intent/ImLoginIntentCreator;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/ImLoginIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 169
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->startActivity(Landroid/content/Intent;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 62
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 64
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c003d

    .line 66
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->setContentView(I)V

    .line 67
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 69
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;

    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->retailerId:I

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;->setRetailerId(I)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 82
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "retailer_id"

    .line 83
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->retailerId:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public showImLogin()V
    .locals 2

    .line 155
    new-instance v0, Lcom/ibotta/android/routing/intent/ImLoginIntentCreator;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->retailerId:I

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/routing/intent/ImLoginIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/ImLoginIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    .line 156
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->startActivity(Landroid/content/Intent;)V

    const v0, 0x7f010021

    const v1, 0x7f01001c

    .line 157
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->overridePendingTransition(II)V

    return-void
.end method

.method public showImWeb(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 144
    new-instance v0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;-><init>(Landroid/content/Context;)V

    .line 145
    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->forUrl(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;

    move-result-object p1

    const/4 v0, 0x1

    .line 146
    invoke-virtual {p1, v0}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->withXForNavIcon(Z)Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;

    move-result-object p1

    .line 147
    invoke-virtual {p1, v0}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->withSlideFromBottom(Z)Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;

    move-result-object p1

    .line 148
    invoke-virtual {p1, p2}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->addExitUrl(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;

    move-result-object p1

    .line 149
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    const/16 p2, 0x1a

    .line 150
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 88
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->initToolbar()V

    .line 89
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->initImDetailHeader(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;)V

    .line 90
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->initButton(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;)V

    .line 91
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->initLoginLinkText(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;)V

    .line 92
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->initDisclaimer(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/components/ViewState;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 34
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;->updateViewState(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;)V

    return-void
.end method
