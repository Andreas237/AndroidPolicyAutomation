.class public Lcom/shopkick/app/lookbooks/LookbookScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "LookbookScreen.java"

# interfaces
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field private static final COLUMN_COUNT:I = 0x2

.field private static final LOOKBOOK_ONLINE_OFFER_HEIGHT:I = 0x148


# instance fields
.field private adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private isNoContent:Z

.field private lookbookCoverTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private lookbookDescriptionTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private screenLoadingSpinner:Landroid/widget/ProgressBar;

.field private shouldAddStoryTile:Z

.field private storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

.field private storyContentTiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field private storyFetchDone:Z

.field private storyProxy:Lcom/shopkick/app/stories/StoryProxy;

.field private storyProxyUpdateFailed:Z

.field private storyToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private maybeAddNoContentTile()V
    .locals 3

    .line 300
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->containsTileOfType(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 301
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 302
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v1, 0x3ed

    .line 303
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 304
    invoke-virtual {p0}, Lcom/shopkick/app/lookbooks/LookbookScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1106d6

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 305
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 307
    iget-object v2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/shopkick/app/stories/StoryProxy;->canBeDisplayed()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 308
    iget-object v2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookCoverTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 309
    iget-object v2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookDescriptionTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v2, :cond_0

    .line 310
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    const/4 v2, 0x0

    .line 312
    iput-boolean v2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->shouldAddStoryTile:Z

    .line 314
    :cond_1
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 315
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    .line 316
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    :cond_2
    return-void
.end method

.method private maybeAddReloadTile()V
    .locals 2

    .line 292
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    const/16 v1, 0x3ed

    invoke-virtual {v0, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->containsTileOfType(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 293
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    .line 294
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addReloadTile()V

    :cond_0
    return-void
.end method

.method private maybeAddTiles()V
    .locals 4

    .line 273
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/app/stories/StoryProxy;->canBeDisplayed()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyContentTiles:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 274
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 275
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 276
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyContentTiles:Ljava/util/List;

    .line 277
    iget-boolean v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->shouldAddStoryTile:Z

    if-eqz v1, :cond_1

    .line 278
    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookCoverTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 279
    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookDescriptionTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v1, :cond_0

    const/4 v3, 0x1

    .line 280
    invoke-interface {v0, v3, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 282
    :cond_0
    iput-boolean v2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->shouldAddStoryTile:Z

    .line 285
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    const/4 v0, 0x0

    .line 286
    iput-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyContentTiles:Ljava/util/List;

    :cond_2
    return-void
.end method

.method private setupLookbookCoverTile()V
    .locals 2

    .line 190
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookCoverTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 191
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookCoverTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 192
    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v1}, Lcom/shopkick/app/stories/StoryProxy;->coverImageUrl()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    .line 193
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookCoverTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v1}, Lcom/shopkick/app/stories/StoryProxy;->skLink()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    .line 194
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookCoverTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v1}, Lcom/shopkick/app/stories/StoryProxy;->storyPartnerThumbnailUrl()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    .line 195
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookCoverTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v1}, Lcom/shopkick/app/stories/StoryProxy;->storyOwnerThumbnailUrl()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->profileImageUrl:Ljava/lang/String;

    .line 196
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookCoverTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v1}, Lcom/shopkick/app/stories/StoryProxy;->tileImageUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->lookbookTileImageSize:Ljava/lang/Integer;

    .line 198
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookCoverTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    .line 199
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookCoverTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v1}, Lcom/shopkick/app/stories/StoryProxy;->coverCardTrackingUrl()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    .line 200
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookCoverTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v1}, Lcom/shopkick/app/stories/StoryProxy;->isSaved()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSaved:Ljava/lang/Boolean;

    .line 201
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookCoverTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v1}, Lcom/shopkick/app/stories/StoryProxy;->storyPartnerChainId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    .line 202
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookCoverTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v1}, Lcom/shopkick/app/stories/StoryProxy;->storyPartnerChainName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    .line 203
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookCoverTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const/16 v1, -0x16

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    return-void
.end method

.method private setupLookbookDescriptionTile()V
    .locals 2

    .line 207
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/stories/StoryProxy;->storyDescription()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 212
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookDescriptionTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 213
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookDescriptionTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    const/16 v1, -0x37

    .line 214
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 215
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookDescriptionTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v1}, Lcom/shopkick/app/stories/StoryProxy;->storyDescription()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->descriptionText:Ljava/lang/String;

    return-void

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 208
    iput-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->lookbookDescriptionTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method

.method private setupStoryProxy()V
    .locals 5

    .line 158
    invoke-direct {p0}, Lcom/shopkick/app/lookbooks/LookbookScreen;->setupLookbookCoverTile()V

    .line 159
    invoke-direct {p0}, Lcom/shopkick/app/lookbooks/LookbookScreen;->setupLookbookDescriptionTile()V

    .line 162
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    const/16 v1, -0x16

    .line 163
    invoke-virtual {v0, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;

    .line 164
    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v1}, Lcom/shopkick/app/stories/StoryProxy;->storyType()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->setStoryType(Ljava/lang/Integer;)V

    .line 167
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    const/16 v1, 0xc

    .line 168
    invoke-virtual {v0, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;

    .line 169
    iget-object v2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->setStoryProxy(Lcom/shopkick/app/stories/StoryProxy;)V

    .line 172
    iget-object v2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v2}, Lcom/shopkick/app/stories/StoryProxy;->storyType()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1

    const/16 v3, 0x8

    .line 173
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eq v3, v4, :cond_0

    const/4 v3, 0x7

    .line 174
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v3, v2, :cond_1

    :cond_0
    const/16 v2, 0x148

    .line 175
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->setTileHeight(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 177
    invoke-virtual {v0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/InstantBonusTileViewHolderConfigurator;->setTileHeight(Ljava/lang/Integer;)V

    .line 181
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->invalidateTilesOfType(I)V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    const/4 p3, 0x0

    const v0, 0x7f0c0117

    .line 83
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090628

    .line 84
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const p2, 0x7f09059a

    .line 85
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 86
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v0, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;-><init>(II)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 89
    new-instance p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v4, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v7, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v8, Ljava/util/HashSet;

    const/16 v0, 0xc

    new-array v3, v0, [Ljava/lang/Integer;

    const/16 v5, 0x12

    .line 93
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, p3

    .line 94
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v3, v2

    const/16 p3, 0x1b

    .line 95
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v1

    const/16 v1, 0x47

    .line 96
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x3

    aput-object v5, v3, v6

    .line 97
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v5, 0x4

    aput-object v0, v3, v5

    const/16 v0, 0x1e

    .line 98
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x5

    aput-object v5, v3, v6

    const/16 v5, 0x1f

    .line 99
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x6

    aput-object v5, v3, v6

    const/16 v5, 0x3ed

    .line 100
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x7

    aput-object v5, v3, v6

    const/4 v5, -0x1

    .line 101
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v6, 0x8

    aput-object v5, v3, v6

    const/4 v5, -0x2

    .line 102
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v6, 0x9

    aput-object v5, v3, v6

    const/16 v5, -0x37

    .line 103
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v6, 0xa

    aput-object v5, v3, v6

    const/16 v5, -0x16

    .line 104
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v6, 0xb

    aput-object v5, v3, v6

    .line 93
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v8, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 v9, 0x0

    move-object v3, p2

    move-object v5, p0

    move-object v6, p0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object p2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 106
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v3, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p2, v3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 108
    iput-boolean v2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->shouldAddStoryTile:Z

    .line 110
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 111
    invoke-virtual {p2, v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedBannerTileViewHolderConfigurator;

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedBannerTileViewHolderConfigurator;->setStoryId(Ljava/lang/String;)V

    .line 114
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 115
    invoke-virtual {p2, p3}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;

    .line 116
    iget-object p3, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/ProductTileViewHolderConfigurator;->setStoryId(Ljava/lang/String;)V

    .line 118
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 119
    invoke-virtual {p2, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookOnlineOfferTileViewHolderConfigurator;

    .line 120
    iget-object p3, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookOnlineOfferTileViewHolderConfigurator;->setStoryId(Ljava/lang/String;)V

    return-object p1
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 2

    .line 224
    iget-boolean v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxyUpdateFailed:Z

    if-eqz v0, :cond_0

    .line 225
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/stories/StoriesDataSource;->fetchStoryWithToken(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;)V

    .line 228
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoryTilesRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoryTilesRequest;-><init>()V

    .line 229
    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoryTilesRequest;->storyCacheKey:Ljava/lang/String;

    .line 230
    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->homeScreenFeedTilesPageSize:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoryTilesRequest;->pageSize:Ljava/lang/Integer;

    .line 231
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoryTilesRequest;->previousPageKey:Ljava/lang/String;

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

    .line 71
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iput-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    .line 72
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 73
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 75
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 76
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    const-string/jumbo v0, "story_cache_key"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    .line 77
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    const-string/jumbo v0, "story_cache_version"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheVersion:Ljava/lang/String;

    .line 78
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    const-string/jumbo v0, "story_id"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->destroy()V

    .line 135
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 136
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 4
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

    .line 326
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x1536516e

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_2

    const v1, 0x115c0a42

    if-eq v0, v1, :cond_1

    const v1, 0x556e6c68

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "eventOnlineOfferClickSucceeded"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_1

    :cond_1
    const-string/jumbo v0, "storesUpdateFailedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move p1, v3

    goto :goto_1

    :cond_2
    const-string/jumbo v0, "storiesUpdatedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move p1, v2

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 351
    :pswitch_0
    iput-boolean v3, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->shouldAddStoryTile:Z

    .line 352
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    .line 353
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->fetchNextPage()V

    goto :goto_2

    .line 344
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 345
    invoke-direct {p0}, Lcom/shopkick/app/lookbooks/LookbookScreen;->maybeAddReloadTile()V

    .line 346
    iput-boolean v3, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxyUpdateFailed:Z

    goto :goto_2

    :pswitch_2
    if-nez p2, :cond_4

    return-void

    .line 329
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object p2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/stories/StoriesDataSource;->getStoryProxyFromCache(Ljava/lang/String;)Lcom/shopkick/app/stories/StoryProxy;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    .line 330
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/shopkick/app/stories/StoryProxy;->canBeDisplayed()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 331
    invoke-direct {p0}, Lcom/shopkick/app/lookbooks/LookbookScreen;->setupStoryProxy()V

    .line 332
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo p2, "storiesUpdatedEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 333
    iput-boolean v2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxyUpdateFailed:Z

    .line 335
    iget-boolean p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->isNoContent:Z

    if-nez p1, :cond_5

    .line 336
    invoke-direct {p0}, Lcom/shopkick/app/lookbooks/LookbookScreen;->maybeAddTiles()V

    goto :goto_2

    .line 338
    :cond_5
    invoke-direct {p0}, Lcom/shopkick/app/lookbooks/LookbookScreen;->maybeAddNoContentTile()V

    :cond_6
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onPause()V
    .locals 2

    .line 126
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onPause()V

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/stories/StoriesDataSource;->storyHasBeenRead(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/stories/StoriesDataSource;->markStoryAsRead(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected onScreenDidShow()V
    .locals 2

    .line 141
    iget-boolean v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyFetchDone:Z

    if-nez v0, :cond_1

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/stories/StoryProxy;->canBeDisplayed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    invoke-direct {p0}, Lcom/shopkick/app/lookbooks/LookbookScreen;->setupStoryProxy()V

    goto :goto_0

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v1, "storiesUpdatedEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 146
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v1, "storesUpdateFailedEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/stories/StoriesDataSource;->fetchStoryWithToken(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;)V

    .line 151
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->fetchNextPage()V

    const/4 v0, 0x1

    .line 153
    iput-boolean v0, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyFetchDone:Z

    :cond_1
    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 2

    .line 238
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 239
    iget-boolean v1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_4

    iget-object v1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v1, :cond_4

    .line 240
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoryTilesResponse;

    .line 241
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoryTilesResponse;->storyTiles:Ljava/util/List;

    iput-object v1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyContentTiles:Ljava/util/List;

    .line 242
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoryTilesResponse;->pageKey:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->nextPageKey:Ljava/lang/String;

    .line 243
    sget-object v1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object v1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 245
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoryTilesRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoryTilesRequest;->previousPageKey:Ljava/lang/String;

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyContentTiles:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 246
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    .line 247
    iput-boolean p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->isNoContent:Z

    .line 248
    invoke-direct {p0}, Lcom/shopkick/app/lookbooks/LookbookScreen;->maybeAddNoContentTile()V

    goto :goto_0

    .line 249
    :cond_1
    iget-boolean p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->shouldAddStoryTile:Z

    if-eqz p1, :cond_3

    .line 251
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoryTilesResponse;->pageKey:Ljava/lang/String;

    if-eqz p1, :cond_2

    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoryTilesResponse;->pageKey:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_2

    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoryTilesResponse;->storyTiles:Ljava/util/List;

    if-eqz p1, :cond_2

    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoryTilesResponse;->storyTiles:Ljava/util/List;

    .line 252
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    .line 253
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/4 p2, -0x1

    .line 254
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 255
    iget-object p2, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->storyContentTiles:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    const/4 p1, 0x0

    .line 257
    iput-boolean p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->isNoContent:Z

    .line 258
    invoke-direct {p0}, Lcom/shopkick/app/lookbooks/LookbookScreen;->maybeAddTiles()V

    goto :goto_0

    .line 261
    :cond_3
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/GetStoryTilesResponse;->storyTiles:Ljava/util/List;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    goto :goto_0

    .line 264
    :cond_4
    sget-object p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 265
    iget-object p1, p0, Lcom/shopkick/app/lookbooks/LookbookScreen;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :goto_0
    return-object v0
.end method

.method public shouldDisplayAppScreenHeader()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
