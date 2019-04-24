.class public abstract Lcom/shopkick/app/feed/FeedRecyclerViewAdapterDiffCallback;
.super Landroid/support/v7/util/DiffUtil$Callback;
.source "FeedRecyclerViewAdapterDiffCallback.java"


# instance fields
.field protected newTileList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field protected oldTileList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Landroid/support/v7/util/DiffUtil$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public getNewListSize()I
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapterDiffCallback;->newTileList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getOldListSize()I
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapterDiffCallback;->oldTileList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public setLists(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 15
    iput-object p1, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapterDiffCallback;->oldTileList:Ljava/util/List;

    .line 16
    iput-object p2, p0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapterDiffCallback;->newTileList:Ljava/util/List;

    return-void
.end method
