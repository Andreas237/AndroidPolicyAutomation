.class Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$1;
.super Ljava/lang/Object;
.source "ScanClickUtils.java"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->onClick(Landroid/view/View;)V
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
.field final synthetic this$0:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

.field final synthetic val$largeImageView:Lcom/github/chrisbanes/photoview/PhotoView;

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;Lcom/github/chrisbanes/photoview/PhotoView;Ljava/lang/String;)V
    .locals 0

    .line 340
    iput-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$1;->this$0:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

    iput-object p2, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$1;->val$largeImageView:Lcom/github/chrisbanes/photoview/PhotoView;

    iput-object p3, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$1;->val$url:Ljava/lang/String;

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

    .line 343
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$1;->this$0:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

    invoke-static {p1}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->access$000(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;)Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;

    move-result-object p1

    const p2, 0x7f09054a

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;->findViewById(I)Landroid/view/View;

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

    .line 349
    iget-object p2, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$1;->this$0:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

    invoke-static {p2}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->access$000(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;)Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;

    move-result-object p2

    const p3, 0x7f09054a

    invoke-virtual {p2, p3}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 350
    iget-object p2, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$1;->val$largeImageView:Lcom/github/chrisbanes/photoview/PhotoView;

    invoke-virtual {p2, p1}, Lcom/github/chrisbanes/photoview/PhotoView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 351
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$1;->val$url:Ljava/lang/String;

    iget-object p2, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$1;->this$0:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

    invoke-static {p2}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->access$100(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p2

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 p2, 0x1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$1;->this$0:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

    invoke-static {p1, p2}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->access$202(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;Z)Z

    .line 352
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$1;->this$0:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

    iget-object p3, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$1;->val$largeImageView:Lcom/github/chrisbanes/photoview/PhotoView;

    invoke-static {p1, p3}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->access$300(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;Lcom/github/chrisbanes/photoview/PhotoView;)V

    return p2
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 340
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual/range {p0 .. p5}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$1;->onResourceReady(Landroid/graphics/Bitmap;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z

    move-result p1

    return p1
.end method
