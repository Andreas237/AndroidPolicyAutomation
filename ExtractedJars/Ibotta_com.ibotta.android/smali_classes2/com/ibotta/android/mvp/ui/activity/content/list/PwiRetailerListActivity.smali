.class public Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "PwiRetailerListActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListView;"
    }
.end annotation


# instance fields
.field protected ilvContentListView:Lcom/ibotta/android/views/list/IbottaListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090248
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/components/ViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 20
    check-cast p1, Lcom/ibotta/android/views/content/list/ContentListViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListActivity;->bindViewEvents(Lcom/ibotta/android/views/content/list/ContentListViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/content/list/ContentListViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/content/list/ContentListViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListActivity;->ilvContentListView:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListComponent;
    .locals 1

    .line 27
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/content/list/DaggerPwiRetailerListComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/content/list/DaggerPwiRetailerListComponent$Builder;

    move-result-object v0

    .line 28
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/list/DaggerPwiRetailerListComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/content/list/DaggerPwiRetailerListComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListView;)V

    .line 29
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/content/list/DaggerPwiRetailerListComponent$Builder;->pwiRetailerListModule(Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListModule;)Lcom/ibotta/android/mvp/ui/activity/content/list/DaggerPwiRetailerListComponent$Builder;

    move-result-object p1

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/content/list/DaggerPwiRetailerListComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListComponent;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 20
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListComponent;)V
    .locals 0

    .line 35
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 40
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0029

    .line 42
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListActivity;->setContentView(I)V

    .line 43
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    return-void
.end method

.method public showPwiHomeScreen(I)V
    .locals 1

    .line 59
    new-instance v0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/components/ViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 20
    check-cast p1, Lcom/ibotta/android/views/content/list/ContentListViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListActivity;->updateViewState(Lcom/ibotta/android/views/content/list/ContentListViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/content/list/ContentListViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/content/list/ContentListViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 48
    invoke-virtual {p1}, Lcom/ibotta/android/views/content/list/ContentListViewState;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListActivity;->ilvContentListView:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/list/ContentListViewState;->getListViewState()Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-void
.end method
