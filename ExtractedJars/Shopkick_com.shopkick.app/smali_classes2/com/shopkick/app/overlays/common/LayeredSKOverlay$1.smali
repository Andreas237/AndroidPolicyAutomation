.class Lcom/shopkick/app/overlays/common/LayeredSKOverlay$1;
.super Ljava/lang/Object;
.source "LayeredSKOverlay.java"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;
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
.field final synthetic this$0:Lcom/shopkick/app/overlays/common/LayeredSKOverlay;

.field final synthetic val$buttonView:Lcom/shopkick/app/widget/SKButton;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/common/LayeredSKOverlay;Lcom/shopkick/app/widget/SKButton;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay$1;->this$0:Lcom/shopkick/app/overlays/common/LayeredSKOverlay;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay$1;->val$buttonView:Lcom/shopkick/app/widget/SKButton;

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

    .line 220
    iget-object p2, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay$1;->this$0:Lcom/shopkick/app/overlays/common/LayeredSKOverlay;

    invoke-static {p2}, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->access$000(Lcom/shopkick/app/overlays/common/LayeredSKOverlay;)Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/shopkick/app/graphics/ButtonDrawableFactory;->createButtonDrawable(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 221
    iget-object p2, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay$1;->val$buttonView:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 214
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual/range {p0 .. p5}, Lcom/shopkick/app/overlays/common/LayeredSKOverlay$1;->onResourceReady(Landroid/graphics/Bitmap;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z

    move-result p1

    return p1
.end method
