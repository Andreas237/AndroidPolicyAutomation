.class public Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator$OnReloadClickListener;
.super Ljava/lang/Object;
.source "TileWithSubTilesViewHolderConfigurator.java"

# interfaces
.implements Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$IReloadButtonClickCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "OnReloadClickListener"
.end annotation


# instance fields
.field private adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private configuratorRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;",
            ">;"
        }
    .end annotation
.end field

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private viewHolderRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    .line 256
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 257
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator$OnReloadClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    .line 258
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator$OnReloadClickListener;->viewHolderRef:Ljava/lang/ref/WeakReference;

    .line 259
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator$OnReloadClickListener;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 260
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator$OnReloadClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method


# virtual methods
.method public onReloadClicked()V
    .locals 3

    .line 265
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator$OnReloadClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;

    .line 266
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator$OnReloadClickListener;->viewHolderRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    .line 270
    :cond_0
    iget-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator$OnReloadClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/WidgetDataSource;->flush(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 271
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator$OnReloadClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->fetchData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/fetchers/DataResponse;

    return-void

    :cond_1
    :goto_0
    return-void
.end method
