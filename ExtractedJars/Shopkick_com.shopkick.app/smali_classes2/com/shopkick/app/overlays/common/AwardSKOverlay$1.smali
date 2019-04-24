.class Lcom/shopkick/app/overlays/common/AwardSKOverlay$1;
.super Ljava/lang/Object;
.source "AwardSKOverlay.java"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/common/AwardSKOverlay;->setupAwardCountAndLogo(Ljava/util/List;)V
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
.field final synthetic this$0:Lcom/shopkick/app/overlays/common/AwardSKOverlay;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/common/AwardSKOverlay;)V
    .locals 0

    .line 243
    iput-object p1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay$1;->this$0:Lcom/shopkick/app/overlays/common/AwardSKOverlay;

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

    .line 250
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay$1;->this$0:Lcom/shopkick/app/overlays/common/AwardSKOverlay;

    iget-object p1, p1, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->kicksCount:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 251
    iget-object p2, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay$1;->this$0:Lcom/shopkick/app/overlays/common/AwardSKOverlay;

    iget-object p2, p2, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->kicksText:Landroid/widget/TextView;

    iget-object p3, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay$1;->this$0:Lcom/shopkick/app/overlays/common/AwardSKOverlay;

    invoke-static {p3}, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->access$000(Lcom/shopkick/app/overlays/common/AwardSKOverlay;)Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const p4, 0x7f0f0048

    invoke-virtual {p3, p4, p1}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 252
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay$1;->this$0:Lcom/shopkick/app/overlays/common/AwardSKOverlay;

    iget-object p1, p1, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->kicksIcon:Landroid/widget/ImageView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    return p2
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 243
    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p5}, Lcom/shopkick/app/overlays/common/AwardSKOverlay$1;->onResourceReady(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z

    move-result p1

    return p1
.end method
