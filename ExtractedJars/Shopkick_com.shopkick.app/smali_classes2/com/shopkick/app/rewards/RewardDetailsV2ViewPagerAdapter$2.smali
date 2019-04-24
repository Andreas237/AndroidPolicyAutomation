.class Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter$2;
.super Ljava/lang/Object;
.source "RewardDetailsV2ViewPagerAdapter.java"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->tryLoadingFirstCarouselThumbnail(Landroid/widget/ImageView;)Lcom/bumptech/glide/RequestBuilder;
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
.field final synthetic this$0:Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;


# direct methods
.method constructor <init>(Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter$2;->this$0:Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;

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

    .line 148
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter$2;->this$0:Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;

    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->access$000(Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;)V

    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 142
    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p5}, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter$2;->onResourceReady(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z

    move-result p1

    return p1
.end method
