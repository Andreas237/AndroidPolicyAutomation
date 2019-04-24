.class public Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "EngagementRoutingActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingView;"
    }
.end annotation


# instance fields
.field private offerId:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const-string v0, "offer_id"

    .line 52
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingActivity;->offerId:I

    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 54
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "offer_id"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingActivity;->offerId:I

    .line 57
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenter;

    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingActivity;->offerId:I

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenter;->setOfferId(I)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 22
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingComponent;
    .locals 1

    .line 29
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/DaggerEngagementRoutingComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/engagement/routing/DaggerEngagementRoutingComponent$Builder;

    move-result-object v0

    .line 30
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/DaggerEngagementRoutingComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/engagement/routing/DaggerEngagementRoutingComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingView;)V

    .line 31
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/DaggerEngagementRoutingComponent$Builder;->engagementRoutingModule(Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingModule;)Lcom/ibotta/android/mvp/ui/activity/engagement/routing/DaggerEngagementRoutingComponent$Builder;

    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/DaggerEngagementRoutingComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingComponent;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingComponent;)V
    .locals 0

    .line 37
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 42
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0c0034

    .line 44
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingActivity;->setContentView(I)V

    .line 45
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 47
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingActivity;->loadState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 62
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "offer_id"

    .line 63
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingActivity;->offerId:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public showEngagement(ZI)V
    .locals 1

    .line 68
    new-instance v0, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;-><init>(Landroid/content/Context;ZI)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
