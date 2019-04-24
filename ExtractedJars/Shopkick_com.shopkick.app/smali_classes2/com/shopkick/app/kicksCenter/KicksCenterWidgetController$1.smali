.class Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController$1;
.super Ljava/lang/Object;
.source "KicksCenterWidgetController.java"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->populateReward(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V
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
.field final synthetic this$0:Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;

.field final synthetic val$selectedReward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;


# direct methods
.method constructor <init>(Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController$1;->this$0:Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;

    iput-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController$1;->val$selectedReward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

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

    .line 108
    iget-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController$1;->this$0:Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;

    invoke-static {p1}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->access$000(Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;)V

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController$1;->this$0:Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;

    invoke-static {p1}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->access$100(Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;)Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    .line 110
    iget-object p1, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController$1;->this$0:Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;

    invoke-static {p1}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->access$100(Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;)Landroid/widget/FrameLayout;

    move-result-object p1

    const p2, 0x7f090378

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 111
    iget-object p2, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController$1;->this$0:Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;

    invoke-static {p2}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;->access$200(Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController;)Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p2

    iget-object p3, p0, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController$1;->val$selectedReward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->thumbnailImageUrl:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 102
    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p5}, Lcom/shopkick/app/kicksCenter/KicksCenterWidgetController$1;->onResourceReady(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z

    move-result p1

    return p1
.end method
