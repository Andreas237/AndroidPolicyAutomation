.class Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator$1;
.super Ljava/lang/Object;
.source "FlattenedLookbookTileViewHolderConfigurator.java"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;->loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/request/RequestListener<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;

.field final synthetic val$lookbookImage:Landroid/widget/ImageView;

.field final synthetic val$viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Landroid/widget/ImageView;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator$1;->val$viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator$1;->val$lookbookImage:Landroid/widget/ImageView;

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
            "Landroid/graphics/Bitmap;",
            ">;Z)Z"
        }
    .end annotation

    .line 175
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator$1;->val$viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const p2, 0x7f090434

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public onResourceReady(Landroid/graphics/Bitmap;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Ljava/lang/Object;",
            "Lcom/bumptech/glide/request/target/Target<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/bumptech/glide/load/DataSource;",
            "Z)Z"
        }
    .end annotation

    .line 181
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator$1;->val$viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const p3, 0x7f090434

    invoke-virtual {p2, p3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 182
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator$1;->val$lookbookImage:Landroid/widget/ImageView;

    const/16 p3, 0x140

    const/16 p4, 0xbe

    invoke-static {p1, p3, p4}, Lcom/shopkick/app/graphics/BitmapHelpers;->cropBitmapHeightWise(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 172
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual/range {p0 .. p5}, Lcom/shopkick/app/tileViewHolderConfigurators/FlattenedLookbookTileViewHolderConfigurator$1;->onResourceReady(Landroid/graphics/Bitmap;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z

    move-result p1

    return p1
.end method
