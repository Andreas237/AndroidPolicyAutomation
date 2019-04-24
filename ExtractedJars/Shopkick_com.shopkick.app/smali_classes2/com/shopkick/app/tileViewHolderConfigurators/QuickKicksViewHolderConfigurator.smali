.class public Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;
.source "QuickKicksViewHolderConfigurator.java"


# static fields
.field private static final RECYCLER_VIEW_HEIGHT:I = 0x5a


# instance fields
.field private adapter:Lcom/shopkick/app/feed/QuickKicksAdapter;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V

    .line 46
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method private setupRecyclerView(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 8

    const/4 v0, 0x1

    .line 63
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setHasFixedSize(Z)V

    .line 66
    new-instance v0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    invoke-direct {v0}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;-><init>()V

    const-wide/16 v1, 0xfa

    .line 67
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->setAddStartDelay(J)V

    const-wide/16 v3, 0x96

    .line 68
    invoke-virtual {v0, v3, v4}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->setAddDuration(J)V

    .line 69
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->setMoveDuration(J)V

    const-wide/16 v1, 0x12c

    .line 70
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->setChangeDuration(J)V

    .line 71
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setItemAnimator(Landroid/support/v7/widget/RecyclerView$ItemAnimator;)V

    .line 74
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator$1;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;)V

    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addOnItemTouchListener(Landroid/support/v7/widget/RecyclerView$OnItemTouchListener;)V

    .line 93
    new-instance v0, Lcom/shopkick/app/feed/QuickKicksAdapter;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 95
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/shopkick/app/screens/AppScreen;

    .line 98
    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;->getSupportedTileTypes()Ljava/util/Set;

    move-result-object v6

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v1, v0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/feed/QuickKicksAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;->adapter:Lcom/shopkick/app/feed/QuickKicksAdapter;

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;->adapter:Lcom/shopkick/app/feed/QuickKicksAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/QuickKicksAdapter;->removeDefaultItemDecoration()V

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;->adapter:Lcom/shopkick/app/feed/QuickKicksAdapter;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method


# virtual methods
.method protected getSupportedTileTypes()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 123
    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0x53

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 125
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1}, Lcom/shopkick/app/util/FeatureFlagHelper;->areProgrammaticSurveysEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x57

    .line 126
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method

.method public getWidgetType()I
    .locals 1

    const/16 v0, 0xfad

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 109
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    const/16 v0, 0x5a

    .line 112
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;->setRecyclerViewHeight(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    .line 113
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;->adapter:Lcom/shopkick/app/feed/QuickKicksAdapter;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/feed/QuickKicksAdapter;->setWidgetId(Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;
    .locals 1

    .line 54
    invoke-super {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesV2ViewHolderConfigurator;->onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    move-result-object p1

    const v0, 0x7f09059a

    .line 56
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-direct {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;->setupRecyclerView(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    return-object p1
.end method

.method public updateSurveyTileStatus(Ljava/lang/String;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;->adapter:Lcom/shopkick/app/feed/QuickKicksAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/shopkick/app/feed/QuickKicksAdapter;->updateSurveyTile(Ljava/lang/String;I)V

    return-void
.end method

.method protected willOverrideAdapter()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
