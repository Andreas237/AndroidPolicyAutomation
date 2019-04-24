.class Lcom/shopkick/app/activities/HomeActivity$3;
.super Ljava/lang/Object;
.source "HomeActivity.java"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/activities/HomeActivity;->loadThumbnail()V
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
.field final synthetic this$0:Lcom/shopkick/app/activities/HomeActivity;

.field final synthetic val$newThumbnailPhoto:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/shopkick/app/activities/HomeActivity;Ljava/lang/String;)V
    .locals 0

    .line 642
    iput-object p1, p0, Lcom/shopkick/app/activities/HomeActivity$3;->this$0:Lcom/shopkick/app/activities/HomeActivity;

    iput-object p2, p0, Lcom/shopkick/app/activities/HomeActivity$3;->val$newThumbnailPhoto:Ljava/lang/String;

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

    .line 648
    iget-object p2, p0, Lcom/shopkick/app/activities/HomeActivity$3;->this$0:Lcom/shopkick/app/activities/HomeActivity;

    iget-object p3, p0, Lcom/shopkick/app/activities/HomeActivity$3;->val$newThumbnailPhoto:Ljava/lang/String;

    invoke-static {p2, p3}, Lcom/shopkick/app/activities/HomeActivity;->access$002(Lcom/shopkick/app/activities/HomeActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 649
    iget-object p2, p0, Lcom/shopkick/app/activities/HomeActivity$3;->this$0:Lcom/shopkick/app/activities/HomeActivity;

    invoke-static {p2, p1}, Lcom/shopkick/app/activities/HomeActivity;->access$300(Lcom/shopkick/app/activities/HomeActivity;Landroid/graphics/Bitmap;)V

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 642
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual/range {p0 .. p5}, Lcom/shopkick/app/activities/HomeActivity$3;->onResourceReady(Landroid/graphics/Bitmap;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z

    move-result p1

    return p1
.end method
