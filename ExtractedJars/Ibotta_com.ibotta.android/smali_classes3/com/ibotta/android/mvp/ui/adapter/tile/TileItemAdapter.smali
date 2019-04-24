.class public Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "TileItemAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter$ViewHolder;",
        ">;",
        "Landroid/view/View$OnClickListener;"
    }
.end annotation


# instance fields
.field private final imageCache:Lcom/ibotta/android/images/ImageCache;

.field private listener:Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapterListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapterListener<",
            "TD;>;"
        }
    .end annotation
.end field

.field private tileHeight:I

.field private tileItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem<",
            "TD;>;>;"
        }
    .end annotation
.end field

.field private tileWidth:I


# direct methods
.method public constructor <init>(Lcom/ibotta/android/images/ImageCache;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->tileItems:Ljava/util/List;

    const/16 v0, 0x190

    .line 27
    iput v0, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->tileWidth:I

    const/16 v0, 0x108

    .line 28
    iput v0, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->tileHeight:I

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->tileItems:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 20
    check-cast p1, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter$ViewHolder;I)V
    .locals 5

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->tileItems:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem;

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->imageCache:Lcom/ibotta/android/images/ImageCache;

    iget-object v1, p1, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter$ViewHolder;->ivImage:Landroid/widget/ImageView;

    .line 70
    invoke-virtual {v1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 71
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p1, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter$ViewHolder;->ivImage:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->FEATURED_SMALL_BANNER:Lcom/ibotta/android/views/images/Sizes;

    .line 69
    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 75
    iget-object p1, p1, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter$ViewHolder;->ivImage:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->listener:Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapterListener;

    if-eqz v0, :cond_0

    .line 86
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapterListener;->onTileItemClicked(Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 20
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter$ViewHolder;
    .locals 2

    .line 53
    new-instance p2, Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 54
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setClickable(Z)V

    .line 55
    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p2, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object p1, p2

    check-cast p1, Landroid/view/View;

    invoke-static {p1, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const/4 p1, 0x0

    .line 57
    invoke-static {p2, p1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableForegroundRipple(Landroid/view/View;Z)V

    .line 59
    new-instance p1, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget v0, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->tileWidth:I

    iget v1, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->tileHeight:I

    invoke-direct {p1, v0, v1}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(II)V

    .line 60
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 62
    new-instance p1, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter$ViewHolder;

    invoke-direct {p1, p2}, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter$ViewHolder;-><init>(Landroid/view/View;)V

    return-object p1
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapterListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapterListener<",
            "TD;>;)V"
        }
    .end annotation

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->listener:Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapterListener;

    return-void
.end method

.method public setTileHeight(I)V
    .locals 0

    .line 48
    iput p1, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->tileHeight:I

    return-void
.end method

.method public setTileItems(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem<",
            "TD;>;>;)V"
        }
    .end annotation

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->tileItems:Ljava/util/List;

    .line 40
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setTileWidth(I)V
    .locals 0

    .line 44
    iput p1, p0, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->tileWidth:I

    return-void
.end method
