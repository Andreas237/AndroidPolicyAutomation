.class public Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator$StorySaveClickListener;
.super Ljava/lang/Object;
.source "BrandedLookbookEndTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StorySaveClickListener"
.end annotation


# instance fields
.field private appScreenWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;",
            ">;"
        }
    .end annotation
.end field

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

.field private storyProxy:Lcom/shopkick/app/stories/StoryProxy;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/stories/StoriesDataSource;Lcom/shopkick/app/stories/StoryProxy;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;)V
    .locals 0

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator$StorySaveClickListener;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    .line 134
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator$StorySaveClickListener;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    .line 135
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator$StorySaveClickListener;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 136
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator$StorySaveClickListener;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 141
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator$StorySaveClickListener;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator$StorySaveClickListener;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v0}, Lcom/shopkick/app/stories/StoryProxy;->token()Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator$StorySaveClickListener;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v1}, Lcom/shopkick/app/stories/StoryProxy;->isSaved()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/stories/StoriesDataSource;->getSaveStateForItem(Ljava/lang/String;Z)Z

    move-result p1

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator$StorySaveClickListener;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator$StorySaveClickListener;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v1}, Lcom/shopkick/app/stories/StoryProxy;->token()Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    move-result-object v1

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator$StorySaveClickListener;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {v2}, Lcom/shopkick/app/stories/StoryProxy;->isSaved()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/stories/StoriesDataSource;->toggleItemSaveState(Ljava/lang/String;Z)V

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator$StorySaveClickListener;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_3

    .line 144
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;

    .line 145
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    if-eqz p1, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    .line 146
    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    if-eqz p1, :cond_1

    const/16 p1, 0xc

    goto :goto_1

    :cond_1
    const/16 p1, 0xb

    .line 147
    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 148
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator$StorySaveClickListener;->storyProxy:Lcom/shopkick/app/stories/StoryProxy;

    invoke-virtual {p1}, Lcom/shopkick/app/stories/StoryProxy;->storyId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setStoryId(Ljava/lang/String;)V

    if-eqz v0, :cond_2

    .line 150
    invoke-virtual {v0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getCurrentStoryCardId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setStoryCardId(Ljava/lang/String;)V

    .line 151
    invoke-virtual {v0}, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;->getCurrentPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setHorizontalListDataPos(Ljava/lang/Integer;)V

    .line 153
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/BrandedLookbookEndTileViewHolderConfigurator$StorySaveClickListener;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    :cond_3
    return-void
.end method
