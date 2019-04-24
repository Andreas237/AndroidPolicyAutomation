.class public Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;
.super Lcom/ibotta/android/mvp/base/MvpActivity;
.source "DebugFeatureFlagsActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/MvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsView;"
    }
.end annotation


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;

.field protected rvFeatureFlags:Landroid/support/v7/widget/RecyclerView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903d8
    .end annotation
.end field

.field protected tvEmpty:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09051d
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/MvpActivity;-><init>()V

    return-void
.end method

.method private initAdapter()V
    .locals 4

    .line 87
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;->bindViewEvents(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;)V

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->rvFeatureFlags:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->rvFeatureFlags:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    return-void
.end method

.method private initRecycler()V
    .locals 3

    .line 76
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    invoke-direct {v0, p0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f060027

    .line 77
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->colorResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f070180

    .line 78
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->sizeResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f070165

    const v2, 0x7f07015c

    .line 79
    invoke-virtual {v0, v1, v2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->marginResId(II)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    move-result-object v0

    .line 80
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->showLastDivider()Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    .line 81
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->build()Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;

    move-result-object v0

    .line 83
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->rvFeatureFlags:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 48
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method public static start(Landroid/content/Context;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 44
    :cond_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->newIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 31
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsComponent;
    .locals 1

    .line 53
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DaggerDebugFeatureFlagsComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/debug/feature/DaggerDebugFeatureFlagsComponent$Builder;

    move-result-object v0

    .line 54
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DaggerDebugFeatureFlagsComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/DaggerDebugFeatureFlagsComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsView;)V

    .line 55
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DaggerDebugFeatureFlagsComponent$Builder;->debugFeatureFlagsModule(Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsModule;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/DaggerDebugFeatureFlagsComponent$Builder;

    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DaggerDebugFeatureFlagsComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsComponent;

    move-result-object p1

    return-object p1
.end method

.method public getNavButtonType()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 31
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsComponent;)V
    .locals 0

    .line 61
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 66
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c002d

    .line 68
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->setContentView(I)V

    .line 69
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 71
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->initRecycler()V

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->initAdapter()V

    return-void
.end method

.method public onRowTapped(I)V
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenter;->onRowTapped(I)V

    return-void
.end method

.method public setDebugFeatureFlagItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;",
            ">;)V"
        }
    .end annotation

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;->setItems(Ljava/util/List;)V

    return-void
.end method

.method public showDebugFeatureFlagDetail(Ljava/lang/String;)V
    .locals 1

    .line 117
    new-instance v0, Lcom/ibotta/android/routing/intent/DebugFeatureFlagIntentCreator;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/DebugFeatureFlagIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/DebugFeatureFlagIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showNoFeatureFlagsAvailable()V
    .locals 2

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->rvFeatureFlags:Landroid/support/v7/widget/RecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsActivity;->tvEmpty:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method
