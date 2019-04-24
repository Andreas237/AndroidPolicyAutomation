.class public Lcom/shopkick/app/storycards/StoryCardScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "StoryCardScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# instance fields
.field private adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private doneInitialFetch:Z

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private screenLoadingSpinner:Landroid/widget/ProgressBar;

.field private storyCardId:Ljava/lang/String;

.field private storyCardTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    const/4 p3, 0x0

    const v0, 0x7f0c01d2

    .line 59
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090628

    .line 60
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    .line 61
    iget-object p2, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {p2, p3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    const p2, 0x7f09059a

    .line 63
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p2, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 65
    invoke-virtual {p0}, Lcom/shopkick/app/storycards/StoryCardScreen;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget v0, p2, Landroid/util/DisplayMetrics;->density:F

    .line 66
    invoke-virtual {p0}, Lcom/shopkick/app/storycards/StoryCardScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenWidth(Landroid/content/Context;)I

    move-result p2

    int-to-float v1, p2

    .line 67
    invoke-virtual {p0}, Lcom/shopkick/app/storycards/StoryCardScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/shopkick/app/util/FrameConfigurator;->screenHeightWithoutStatusBar(Landroid/content/Context;)I

    move-result p2

    int-to-float v2, p2

    sget v3, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->STORY_CARD_WIDTH:I

    sget v4, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->STORY_CARD_HEIGHT:I

    sget v5, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->CARD_TO_SCREEN_EDGE_SPACING:I

    sget v6, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->CARD_TO_SCREEN_TOP_SPACING:I

    sget v7, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->CARD_TO_SCREEN_EDGE_SPACING:I

    sget v8, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->CARD_TO_SCREEN_TOP_SPACING:I

    .line 65
    invoke-static/range {v0 .. v8}, Lcom/shopkick/app/util/FrameConfigurator;->getMaxScaleFactor(FFFIIIIII)F

    move-result p2

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v8, Lcom/shopkick/app/view/SKRecyclerView/StoryCardLinearLayoutManager;

    .line 78
    invoke-virtual {p0}, Lcom/shopkick/app/storycards/StoryCardScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenWidth(Landroid/content/Context;)I

    move-result v5

    sget v1, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->STORY_CARD_WIDTH:I

    .line 80
    invoke-virtual {p0}, Lcom/shopkick/app/storycards/StoryCardScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 79
    invoke-static {v1, v2}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p2

    float-to-int v6, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/view/SKRecyclerView/StoryCardLinearLayoutManager;-><init>(Landroid/content/Context;IZIII)V

    .line 75
    invoke-virtual {v0, v8}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 85
    invoke-virtual {p0}, Lcom/shopkick/app/storycards/StoryCardScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    invoke-static {v1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->getTileHeight(FF)F

    move-result p2

    float-to-int p2, p2

    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 87
    iget-object p2, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 89
    new-instance p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v2, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v5, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v6, Ljava/util/HashSet;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v1, 0x22

    .line 93
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, p3

    const/16 v1, 0x34

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v1, p2

    move-object v3, p0

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object p2, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 95
    iget-object p2, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v0, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 96
    iget-object p2, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeDefaultItemDecoration()V

    .line 98
    iget-object p2, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v0, "storyCardUpdateFailed"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 99
    iget-object p2, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v0, "storyCardSavedStateUpdated"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 101
    iput-boolean p3, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->doneInitialFetch:Z

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 52
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v0, "story_card_id"

    .line 53
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->storyCardId:Ljava/lang/String;

    .line 54
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p1, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->destroy()V

    .line 118
    iget-object v0, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 119
    iget-object v0, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

    iget-object v1, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->storyCardId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/storycards/StoryCardDataSource;->cancelStoryCardFetch(Ljava/lang/String;)V

    .line 120
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 129
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x3f0a8ab

    if-eq v0, v1, :cond_1

    const v1, 0x4bca5f56    # 2.6525356E7f

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string/jumbo v0, "storyCardUpdated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    const-string/jumbo v0, "storyCardUpdateFailed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, -0x1

    :goto_1
    const/16 v0, 0x8

    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 137
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 138
    iget-object p1, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const p2, 0x7f110142

    invoke-virtual {p0, p2}, Lcom/shopkick/app/storycards/StoryCardScreen;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_2

    .line 131
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    const-string/jumbo p1, "storyCardKey"

    .line 132
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iput-object p1, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->storyCardTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 133
    iget-object p1, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    new-instance p2, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->storyCardTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    .line 134
    iget-object p1, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo p2, "storyCardUpdated"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onScreenDidShow()V
    .locals 2

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v1, "storyCardUpdated"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 109
    iget-boolean v0, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->doneInitialFetch:Z

    if-nez v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

    iget-object v1, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->storyCardId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/storycards/StoryCardDataSource;->fetchStoryCard(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 111
    iput-boolean v0, p0, Lcom/shopkick/app/storycards/StoryCardScreen;->doneInitialFetch:Z

    :cond_0
    return-void
.end method
