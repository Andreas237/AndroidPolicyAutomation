.class Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator$1;
.super Ljava/lang/Object;
.source "LookbookHeaderTileViewHolderConfigurator.java"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
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
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;

.field final synthetic val$chainLogo:Landroid/widget/ImageView;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;Landroid/widget/ImageView;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator$1;->val$chainLogo:Landroid/widget/ImageView;

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

    .line 236
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p3

    if-ne p2, p3, :cond_0

    .line 238
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator$1;->val$chainLogo:Landroid/widget/ImageView;

    const/16 p3, 0xf

    const/16 p4, 0x1e

    invoke-static {p2, p1, p4, p4, p3}, Lcom/shopkick/app/util/TileUtils;->setRoundedImage(Landroid/widget/ImageView;Landroid/graphics/Bitmap;III)V

    goto :goto_0

    .line 241
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator$1;->val$chainLogo:Landroid/widget/ImageView;

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 242
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;

    iget-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator$1;->val$chainLogo:Landroid/widget/ImageView;

    invoke-virtual {p2, p3, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator;->adjustChainLogoWidth(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 230
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual/range {p0 .. p5}, Lcom/shopkick/app/tileViewHolderConfigurators/LookbookHeaderTileViewHolderConfigurator$1;->onResourceReady(Landroid/graphics/Bitmap;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z

    move-result p1

    return p1
.end method
