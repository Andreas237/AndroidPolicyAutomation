.class public Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "BrandedLookbookScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/lookbooks/BrandedLookbookScreen$SpaceItemDecoration;
    }
.end annotation


# static fields
.field private static CARD_SPACING:I = 0x5


# instance fields
.field private adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private coverTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private currentPosition:I

.field private currentStoryCardId:Ljava/lang/String;

.field private dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private doneInitialFetch:Z

.field private endTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private hasLoggedFinished:Z

.field private hasLoggedStarted:Z

.field private myTiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private saveButton:Lcom/shopkick/app/widget/SKButton;

.field private screenLoadingSpinner:Landroid/widget/ProgressBar;

.field private storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

.field private storyCacheKey:Ljava/lang/String;

.field private storyCacheVersion:Ljava/lang/String;

.field private storyProxy:Lcom/shopkick/app/stories/StoryProxy;

.field private videoController:Lcom/shopkick/app/video/VideoController;

.field private videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private maybeAddTiles()V
    .locals 6

    .line 320
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v0}, Lcom/shopkick/app/stories/StoryProxy;->canBeDisplayed()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->myTiles:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 321
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 322
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->myTiles:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 323
    iget-object v1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->endTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    iget-object v1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    .line 326
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->saveButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 327
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 328
    invoke-direct {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->updateSaveButtonState()V

    .line 329
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->saveButton:Lcom/shopkick/app/widget/SKButton;

    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator$StorySaveClickListener;

    iget-object v3, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v4, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    iget-object v5, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {v2, v3, v4, v5, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator$StorySaveClickListener;-><init>(Lcom/shopkick/app/stories/StoriesDataSource;Lcom/shopkick/app/stories/StoryProxy;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;)V

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 335
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->hasLoggedStarted:Z

    if-nez v0, :cond_1

    .line 338
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v2, 0x20

    .line 339
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 340
    iget-object v2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 341
    iput-boolean v1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->hasLoggedStarted:Z

    :cond_1
    return-void
.end method

.method private updateSaveButtonState()V
    .locals 3

    .line 347
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v1}, Lcom/shopkick/app/stories/StoryProxy;->token()Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    move-result-object v1

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v2}, Lcom/shopkick/app/stories/StoryProxy;->isSaved()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/stories/StoriesDataSource;->getSaveStateForItem(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 349
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->saveButton:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x7f08019e

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonIcon(I)V

    .line 350
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->saveButton:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x7f110229

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    goto :goto_0

    .line 352
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->saveButton:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x7f08019f

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonIcon(I)V

    .line 353
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->saveButton:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x7f11022a

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 12

    const/4 p3, 0x0

    const v0, 0x7f0c0037

    .line 100
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090628

    .line 101
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const p2, 0x7f09009f

    .line 102
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const p2, 0x7f0900ba

    .line 104
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    const p2, 0x7f0905f6

    .line 105
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->saveButton:Lcom/shopkick/app/widget/SKButton;

    .line 106
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->saveButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 108
    invoke-virtual {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget v0, p2, Landroid/util/DisplayMetrics;->density:F

    .line 109
    invoke-virtual {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenWidth(Landroid/content/Context;)I

    move-result p2

    int-to-float v1, p2

    .line 110
    invoke-virtual {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getContext()Landroid/content/Context;

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

    .line 108
    invoke-static/range {v0 .. v8}, Lcom/shopkick/app/util/FrameConfigurator;->getMaxScaleFactor(FFFIIIIII)F

    move-result p2

    .line 118
    new-instance v7, Lcom/shopkick/app/view/SKRecyclerView/StoryCardLinearLayoutManager;

    .line 121
    invoke-virtual {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenWidth(Landroid/content/Context;)I

    move-result v4

    sget v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->STORY_CARD_WIDTH:I

    .line 123
    invoke-virtual {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 122
    invoke-static {v0, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p2

    float-to-int v5, v0

    sget v0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->CARD_SPACING:I

    int-to-float v0, v0

    .line 124
    invoke-virtual {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    float-to-int v6, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/view/SKRecyclerView/StoryCardLinearLayoutManager;-><init>(Landroid/content/Context;IZIII)V

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, v7}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 130
    invoke-virtual {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    invoke-static {v1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->getTileHeight(FF)F

    move-result p2

    float-to-int p2, p2

    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 132
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 134
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen$SpaceItemDecoration;

    sget v1, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->CARD_SPACING:I

    .line 135
    invoke-virtual {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen$SpaceItemDecoration;-><init>(IF)V

    .line 134
    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 137
    new-instance p2, Lcom/shopkick/app/video/VideoRecyclerViewModule;

    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p2, v0, v1, p3}, Lcom/shopkick/app/video/VideoRecyclerViewModule;-><init>(Lcom/shopkick/app/video/VideoController;Landroid/content/Context;I)V

    iput-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;

    .line 139
    new-instance p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v3, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v6, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v7, Ljava/util/HashSet;

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v1, 0x22

    .line 143
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, p3

    const/16 v9, 0x23

    .line 144
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v0, v4

    const/16 v2, 0x34

    .line 145
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x2

    aput-object v2, v0, v4

    const/16 v10, -0x17

    .line 146
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x3

    aput-object v2, v0, v4

    const/16 v11, -0x18

    .line 147
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x4

    aput-object v2, v0, v4

    .line 143
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 v8, 0x0

    move-object v2, p2

    move-object v4, p0

    move-object v5, p0

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 149
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeDefaultItemDecoration()V

    .line 150
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 151
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 152
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 154
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->coverTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 155
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->coverTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 156
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->endTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 157
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->endTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 159
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 160
    invoke-virtual {p2, v9}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusLargeTileViewHolderConfigurator;

    .line 161
    invoke-virtual {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getStoryId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusLargeTileViewHolderConfigurator;->setStoryId(Ljava/lang/String;)V

    .line 163
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 164
    invoke-virtual {p2, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;

    .line 165
    invoke-virtual {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getStoryId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardLargeTileViewHolderConfigurator;->setStoryId(Ljava/lang/String;)V

    .line 167
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 168
    invoke-virtual {p2, v10}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookCoverTileViewHolderConfigurator;

    .line 169
    invoke-virtual {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getStoryId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookCoverTileViewHolderConfigurator;->setStoryId(Ljava/lang/String;)V

    .line 171
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 172
    invoke-virtual {p2, v11}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator;

    .line 173
    invoke-virtual {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getStoryId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator;->setStoryId(Ljava/lang/String;)V

    .line 175
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyCacheKey:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/stories/StoriesDataSource;->getStoryProxyFromCache(Ljava/lang/String;)Lcom/shopkick/app/stories/StoryProxy;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    .line 176
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/shopkick/app/stories/StoryProxy;->name()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 177
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {p2}, Lcom/shopkick/app/stories/StoryProxy;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->setAppScreenTitle(Ljava/lang/String;)V

    .line 179
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v0, "storiesUpdatedEvent"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 180
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v0, "storesUpdateFailedEvent"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 181
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v0, "storiesSavedStateUpdated"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 183
    iput-boolean p3, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->doneInitialFetch:Z

    .line 184
    iput-boolean p3, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->hasLoggedStarted:Z

    .line 185
    iput-boolean p3, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->hasLoggedFinished:Z

    const/4 p2, 0x0

    .line 187
    iput-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->currentStoryCardId:Ljava/lang/String;

    const/4 p2, -0x1

    .line 188
    iput p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->currentPosition:I

    return-object p1
.end method

.method public getCurrentPosition()I
    .locals 1

    .line 312
    iget v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->currentPosition:I

    return v0
.end method

.method public getCurrentStoryCardId()Ljava/lang/String;
    .locals 1

    .line 316
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->currentStoryCardId:Ljava/lang/String;

    return-object v0
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 291
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/GetBrandedStoryTilesRequest;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/GetBrandedStoryTilesRequest;-><init>()V

    .line 292
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyCacheKey:Ljava/lang/String;

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetBrandedStoryTilesRequest;->storyCacheKey:Ljava/lang/String;

    return-object p1
.end method

.method public getStoryId()Ljava/lang/String;
    .locals 2

    .line 230
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->params:Ljava/util/Map;

    const-string/jumbo v1, "story_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
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

    .line 90
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iput-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    .line 91
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v0, "story_cache_key"

    .line 92
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyCacheKey:Ljava/lang/String;

    const-string/jumbo v0, "story_cache_version"

    .line 93
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyCacheVersion:Ljava/lang/String;

    .line 94
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 95
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iput-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    return-void
.end method

.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 224
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->destroy()V

    .line 225
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 226
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 7
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

    .line 239
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x71480102

    if-eq v0, v1, :cond_2

    const v1, -0x1536516e

    if-eq v0, v1, :cond_1

    const v1, 0x115c0a42

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string/jumbo v0, "storesUpdateFailedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    const-string/jumbo v0, "storiesUpdatedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const-string/jumbo v0, "storiesSavedStateUpdated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_2

    .line 280
    :pswitch_0
    invoke-direct {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->updateSaveButtonState()V

    goto/16 :goto_2

    :pswitch_1
    if-eqz p2, :cond_5

    const-string/jumbo p1, "updateStoriesKeys"

    .line 254
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    .line 255
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyCacheKey:Ljava/lang/String;

    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 256
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyCacheKey:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/stories/StoriesDataSource;->getStoryProxyFromCache(Ljava/lang/String;)Lcom/shopkick/app/stories/StoryProxy;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    .line 257
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {p1}, Lcom/shopkick/app/stories/StoryProxy;->name()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 258
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {p1}, Lcom/shopkick/app/stories/StoryProxy;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->setAppScreenTitle(Ljava/lang/String;)V

    .line 260
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {p1}, Lcom/shopkick/app/stories/StoryProxy;->canBeDisplayed()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 261
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->coverTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {p2}, Lcom/shopkick/app/stories/StoryProxy;->coverImageUrl()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    .line 262
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->coverTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {p2}, Lcom/shopkick/app/stories/StoryProxy;->storyPartnerThumbnailUrl()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    .line 263
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->coverTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {p2}, Lcom/shopkick/app/stories/StoryProxy;->coverCardTrackingUrl()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    .line 264
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->coverTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {p2}, Lcom/shopkick/app/stories/StoryProxy;->token()Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 265
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->coverTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {p2}, Lcom/shopkick/app/stories/StoryProxy;->coverCardViewabilityTrackingDetails()Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 267
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->endTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {p2}, Lcom/shopkick/app/stories/StoryProxy;->imageUrl()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    .line 268
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->endTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {p2}, Lcom/shopkick/app/stories/StoryProxy;->token()Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 269
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->endTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {p2}, Lcom/shopkick/app/stories/StoryProxy;->endCardTrackingUrl()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    .line 270
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->endTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {p2}, Lcom/shopkick/app/stories/StoryProxy;->endCardViewabilityTrackingDetails()Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 272
    invoke-direct {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->maybeAddTiles()V

    .line 274
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo p2, "storiesUpdatedEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto :goto_2

    .line 241
    :pswitch_2
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 242
    invoke-virtual {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 243
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v1, 0x0

    const p1, 0x7f110155

    .line 244
    invoke-virtual {p0, p1}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    const p1, 0x7f110142

    .line 245
    invoke-virtual {p0, p1}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    const p1, 0x7f11014f

    .line 246
    invoke-virtual {p0, p1}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getString(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/shopkick/app/lookbooks/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/lookbooks/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v6, 0x0

    .line 243
    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :cond_5
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    .line 375
    iput p3, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->currentPosition:I

    .line 376
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItem(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->storyCardId:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->currentStoryCardId:Ljava/lang/String;

    .line 377
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemCount()I

    move-result p1

    const/4 p2, 0x1

    sub-int/2addr p1, p2

    if-ne p3, p1, :cond_0

    iget-boolean p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->hasLoggedStarted:Z

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->hasLoggedFinished:Z

    if-nez p1, :cond_0

    .line 379
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 p3, 0x21

    .line 380
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 381
    iget-object p3, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p3, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 382
    iput-boolean p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->hasLoggedFinished:Z

    :cond_0
    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onPause()V
    .locals 2

    .line 216
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onPause()V

    .line 217
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyCacheKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/stories/StoriesDataSource;->storyHasBeenRead(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyCacheKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/stories/StoriesDataSource;->markStoryAsRead(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onScreenDidHide()V
    .locals 1

    .line 210
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidHide()V

    .line 211
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->pauseVideo()V

    return-void
.end method

.method protected onScreenDidShow()V
    .locals 2

    .line 195
    iget-boolean v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->doneInitialFetch:Z

    if-nez v0, :cond_0

    .line 196
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v1, "storyCardUpdated"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 197
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->fetchNextPage()V

    .line 198
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;-><init>()V

    .line 199
    iget-object v1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyCacheKey:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    .line 200
    iget-object v1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storyCacheVersion:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheVersion:Ljava/lang/String;

    .line 201
    iget-object v1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/stories/StoriesDataSource;->fetchOnlyConfigAndUserDataWithToken(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;)V

    const/4 v0, 0x1

    .line 202
    iput-boolean v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->doneInitialFetch:Z

    goto :goto_0

    .line 204
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->videoRecyclerViewModule:Lcom/shopkick/app/video/VideoRecyclerViewModule;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/video/VideoRecyclerViewModule;->maybeStartVideoTile(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    :goto_0
    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 0

    return-void
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 0

    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 1

    .line 298
    new-instance p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 299
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_1

    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-nez v0, :cond_0

    goto :goto_0

    .line 302
    :cond_0
    sget-object v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v0, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 303
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetBrandedStoryTilesResponse;

    .line 305
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetBrandedStoryTilesResponse;->tiles:Ljava/util/List;

    iput-object p2, p0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->myTiles:Ljava/util/List;

    .line 306
    invoke-direct {p0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->maybeAddTiles()V

    goto :goto_1

    .line 300
    :cond_1
    :goto_0
    sget-object p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p2, p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    :goto_1
    return-object p1
.end method
