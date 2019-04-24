.class public abstract Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "TileWithSubTilesViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator$OnReloadClickListener;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final SCROLL_POSITION:Ljava/lang/String; = "PARAMS_CLIENT_DATA_WIDGET_SCROLL_POS"


# instance fields
.field protected ON_RELOAD_CALLBACK_REF:Ljava/lang/String;

.field protected RECYCLER_VIEW_HEIGHT_ON_NO_CONTENT:I

.field protected appScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field protected context:Landroid/content/Context;

.field protected screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

.field protected urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field protected widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 1

    .line 62
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    const/16 v0, 0x64

    .line 50
    iput v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->RECYCLER_VIEW_HEIGHT_ON_NO_CONTENT:I

    const-string v0, "OnReloadCallbackRef"

    .line 51
    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->ON_RELOAD_CALLBACK_REF:Ljava/lang/String;

    .line 63
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    .line 64
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 65
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    .line 66
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 68
    invoke-virtual {p3}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method protected addListEndTile(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;IILjava/lang/String;)V
    .locals 1

    .line 233
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v0, p2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v0, p3}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->addListEndTile(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected addListEndTile(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 237
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v1, 0x404

    .line 238
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 239
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 240
    iput-object p3, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    .line 241
    iput-object p4, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    .line 242
    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->getWidgetType()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    .line 244
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    return-void
.end method

.method protected addNoContentTile(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;)V
    .locals 1

    const-string v0, "No items available"

    .line 199
    invoke-virtual {p0, p1, p2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->addNoContentTile(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Ljava/lang/String;)V

    return-void
.end method

.method protected addNoContentTile(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;I)V
    .locals 1

    .line 203
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v0, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->addNoContentTile(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Ljava/lang/String;)V

    return-void
.end method

.method protected addNoContentTile(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Ljava/lang/String;)V
    .locals 0

    .line 207
    invoke-static {p3}, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;->getNoContentTile(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p3

    .line 208
    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    .line 209
    iget p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->RECYCLER_VIEW_HEIGHT_ON_NO_CONTENT:I

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->setRecyclerViewHeight(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method protected addReloadTile(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$IReloadButtonClickCallback;)V
    .locals 4

    .line 214
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/4 v1, -0x2

    .line 215
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    if-eqz p2, :cond_0

    .line 220
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->ON_RELOAD_CALLBACK_REF:Ljava/lang/String;

    invoke-virtual {v2, v3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    :cond_0
    invoke-virtual {p1, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator;

    if-eqz v1, :cond_1

    .line 226
    invoke-virtual {v1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator;->setCallback(Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$IReloadButtonClickCallback;)V

    .line 229
    :cond_1
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    return-void
.end method

.method protected addTiles(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_3

    .line 179
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 181
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->getSupportedTileTypes()Ljava/util/Set;

    move-result-object v0

    .line 182
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 184
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 185
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 186
    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->getWidgetType()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    .line 187
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    .line 191
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->getMaxTileCount()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v1, p2, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    return-void

    :cond_3
    :goto_1
    return-void
.end method

.method protected abstract fetchData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/fetchers/DataResponse;
.end method

.method public flushWidget()V
    .locals 2

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->widgetDataSource:Lcom/shopkick/app/widget/WidgetDataSource;

    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->getWidgetType()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/WidgetDataSource;->flush(I)V

    return-void
.end method

.method protected getAdapter(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
    .locals 1

    const v0, 0x7f09059a

    .line 148
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    if-eqz p1, :cond_0

    .line 149
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0093

    return v0
.end method

.method protected getMaxTileCount()I
    .locals 1

    const/16 v0, 0xf

    return v0
.end method

.method protected abstract getSupportedTileTypes()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getWidgetType()I
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 3

    if-nez p2, :cond_0

    return-void

    .line 132
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const v1, 0x7f09084c

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const v1, 0x7f09084d

    .line 133
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setTag(ILjava/lang/Object;)V

    const/4 v1, 0x0

    .line 134
    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->scrollToPosition(I)V

    .line 137
    invoke-virtual {v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v1

    const-string v2, "PARAMS_CLIENT_DATA_WIDGET_SCROLL_POS"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Parcelable;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 140
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->setupImpressionLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;
    .locals 10

    .line 95
    invoke-super {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    move-result-object p1

    .line 97
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 100
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const v1, 0x7f09059a

    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f09084c

    invoke-virtual {v0, v3, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 103
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 104
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getAdapterPosition()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 107
    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->getSupportedTileTypes()Ljava/util/Set;

    move-result-object v6

    const/4 v1, -0x2

    .line 108
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/16 v1, 0x3ed

    .line 109
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/16 v1, 0x404

    .line 110
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 113
    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->willOverrideAdapter()Z

    move-result v1

    if-nez v1, :cond_0

    .line 114
    new-instance v9, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 115
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/shopkick/app/screens/AppScreen;

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, v9

    move-object v5, v0

    invoke-direct/range {v1 .. v8}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;I)V

    .line 121
    invoke-virtual {v9}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeDefaultItemDecoration()V

    .line 122
    invoke-virtual {v0, v9}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    :cond_0
    return-object p1
.end method

.method protected setRecyclerViewHeight(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V
    .locals 1

    const v0, 0x7f09059a

    .line 153
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-static {p2, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result p2

    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    return-void
.end method

.method protected setupImpressionLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    .line 158
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast v0, Lcom/shopkick/app/logging/IUserEventView;

    .line 160
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 161
    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->getWidgetType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lcom/shopkick/app/util/TileUtils;->getTileElement(Ljava/lang/Integer;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 162
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 163
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setWidgetId(Ljava/lang/String;)V

    .line 165
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 166
    invoke-virtual {p0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 167
    iget-object v3, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 168
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 169
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object p1, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 171
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/TileWithSubTilesViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {v0, v1, p1, v2}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method protected willOverrideAdapter()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
