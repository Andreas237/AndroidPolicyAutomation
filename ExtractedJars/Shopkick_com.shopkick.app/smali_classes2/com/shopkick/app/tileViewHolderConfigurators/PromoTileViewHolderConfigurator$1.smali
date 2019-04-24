.class Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator$1;
.super Ljava/lang/Object;
.source "PromoTileViewHolderConfigurator.java"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator;->loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/request/RequestListener<",
        "Landroid/graphics/drawable/Drawable;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator;

.field final synthetic val$viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator$1;->val$viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadFailed(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Z)Z
    .locals 0
    .param p1    # Lcom/bumptech/glide/load/engine/GlideException;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/engine/GlideException;",
            "Ljava/lang/Object;",
            "Lcom/bumptech/glide/request/target/Target<",
            "Landroid/graphics/drawable/Drawable;",
            ">;Z)Z"
        }
    .end annotation

    .line 108
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator;

    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator;)I

    move-result p1

    const/16 p2, 0x8

    const/16 p3, 0x69

    if-eq p1, p3, :cond_0

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator$1;->val$viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const p3, 0x7f090056

    invoke-virtual {p1, p3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 111
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator$1;->val$viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const p3, 0x7f090434

    invoke-virtual {p1, p3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x0

    return p1
.end method

.method public onResourceReady(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            "Ljava/lang/Object;",
            "Lcom/bumptech/glide/request/target/Target<",
            "Landroid/graphics/drawable/Drawable;",
            ">;",
            "Lcom/bumptech/glide/load/DataSource;",
            "Z)Z"
        }
    .end annotation

    .line 116
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator;

    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator;)I

    move-result p1

    const/16 p2, 0x8

    const/16 p3, 0x69

    if-eq p1, p3, :cond_0

    .line 117
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator$1;->val$viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const p3, 0x7f090056

    invoke-virtual {p1, p3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 119
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator$1;->val$viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const p3, 0x7f090434

    invoke-virtual {p1, p3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 106
    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p5}, Lcom/shopkick/app/tileViewHolderConfigurators/PromoTileViewHolderConfigurator$1;->onResourceReady(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z

    move-result p1

    return p1
.end method
