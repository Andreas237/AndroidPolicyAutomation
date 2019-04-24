.class Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$1;
.super Ljava/lang/Object;
.source "ScanV3ViewHolderConfigurator.java"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
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
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

.field final synthetic val$imageView:Landroid/widget/ImageView;

.field final synthetic val$viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;Landroid/widget/ImageView;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 0

    .line 416
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$1;->val$imageView:Landroid/widget/ImageView;

    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$1;->val$viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

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

    .line 418
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$1;->val$imageView:Landroid/widget/ImageView;

    const p2, 0x7f08017e

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

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

    .line 423
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$1;->val$viewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    const p2, 0x7f09053e

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 416
    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p5}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$1;->onResourceReady(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z

    move-result p1

    return p1
.end method
