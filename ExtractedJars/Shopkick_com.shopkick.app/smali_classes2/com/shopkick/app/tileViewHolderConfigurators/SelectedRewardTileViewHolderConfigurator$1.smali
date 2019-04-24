.class Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$1;
.super Ljava/lang/Object;
.source "SelectedRewardTileViewHolderConfigurator.java"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->updateGiftCardInfo()V
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
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)V
    .locals 0

    .line 233
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;

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

    .line 236
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;

    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)Landroid/widget/ImageView;

    move-result-object p1

    const p2, 0x7f0802b5

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

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

    .line 242
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;

    invoke-static {p2, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->access$100(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 243
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;

    invoke-static {p2, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->access$200(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;Landroid/graphics/Bitmap;)Lcom/shopkick/app/drawables/RoundedImageDrawable;

    move-result-object p1

    .line 244
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;

    invoke-static {p2}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)Landroid/widget/ImageView;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 245
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;

    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator;)Landroid/widget/ImageView;

    move-result-object p1

    const/4 p2, 0x2

    invoke-virtual {p1, p2, p2, p2, p2}, Landroid/widget/ImageView;->setPadding(IIII)V

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 233
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual/range {p0 .. p5}, Lcom/shopkick/app/tileViewHolderConfigurators/SelectedRewardTileViewHolderConfigurator$1;->onResourceReady(Landroid/graphics/Bitmap;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z

    move-result p1

    return p1
.end method
