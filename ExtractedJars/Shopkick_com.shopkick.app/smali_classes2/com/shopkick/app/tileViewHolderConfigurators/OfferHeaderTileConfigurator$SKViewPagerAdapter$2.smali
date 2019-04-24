.class Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter$2;
.super Ljava/lang/Object;
.source "OfferHeaderTileConfigurator.java"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
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
.field final synthetic this$1:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;)V
    .locals 0

    .line 341
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter$2;->this$1:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;

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

    .line 347
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter$2;->this$1:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;

    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->access$100(Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter$2;->this$1:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;

    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->access$100(Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;)Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 341
    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p5}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter$2;->onResourceReady(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z

    move-result p1

    return p1
.end method
