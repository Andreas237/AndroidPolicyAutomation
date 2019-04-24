.class Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator$1;
.super Ljava/lang/Object;
.source "ViewHolderConfigurator.java"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->getChainLogoRequestListener(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/RequestListener;
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
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

.field final synthetic val$chainLogo:Landroid/widget/ImageView;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;Landroid/widget/ImageView;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator$1;->val$chainLogo:Landroid/widget/ImageView;

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

    const/4 p1, 0x0

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

    .line 71
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    iget-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator$1;->val$chainLogo:Landroid/widget/ImageView;

    invoke-virtual {p2, p3, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->adjustChainLogoWidth(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V

    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 66
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual/range {p0 .. p5}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator$1;->onResourceReady(Landroid/graphics/Bitmap;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z

    move-result p1

    return p1
.end method
