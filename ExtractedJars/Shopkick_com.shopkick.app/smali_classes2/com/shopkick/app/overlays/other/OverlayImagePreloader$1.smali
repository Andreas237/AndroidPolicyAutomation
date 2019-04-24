.class Lcom/shopkick/app/overlays/other/OverlayImagePreloader$1;
.super Ljava/lang/Object;
.source "OverlayImagePreloader.java"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->preload()V
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
.field final synthetic this$0:Lcom/shopkick/app/overlays/other/OverlayImagePreloader;

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/other/OverlayImagePreloader;Ljava/lang/String;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$1;->this$0:Lcom/shopkick/app/overlays/other/OverlayImagePreloader;

    iput-object p2, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$1;->val$url:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadFailed(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Z)Z
    .locals 4
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

    .line 77
    iget-object p1, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$1;->this$0:Lcom/shopkick/app/overlays/other/OverlayImagePreloader;

    invoke-static {p1}, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->access$000(Lcom/shopkick/app/overlays/other/OverlayImagePreloader;)Z

    move-result p1

    const/4 p2, 0x1

    if-nez p1, :cond_0

    .line 78
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p3, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {p3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide p3

    const-string v0, "Failed to load overlay image [%1$s]"

    new-array v1, p2, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$1;->val$url:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-virtual {p1, p3, p4, v0, v1}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 79
    iget-object p1, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$1;->this$0:Lcom/shopkick/app/overlays/other/OverlayImagePreloader;

    invoke-static {p1}, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->access$100(Lcom/shopkick/app/overlays/other/OverlayImagePreloader;)V

    :cond_0
    return p2
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

    .line 86
    iget-object p1, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$1;->this$0:Lcom/shopkick/app/overlays/other/OverlayImagePreloader;

    monitor-enter p1

    .line 87
    :try_start_0
    iget-object p2, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$1;->this$0:Lcom/shopkick/app/overlays/other/OverlayImagePreloader;

    invoke-static {p2}, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->access$208(Lcom/shopkick/app/overlays/other/OverlayImagePreloader;)I

    .line 88
    iget-object p2, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$1;->this$0:Lcom/shopkick/app/overlays/other/OverlayImagePreloader;

    invoke-static {p2}, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->access$000(Lcom/shopkick/app/overlays/other/OverlayImagePreloader;)Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$1;->this$0:Lcom/shopkick/app/overlays/other/OverlayImagePreloader;

    invoke-static {p2}, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->access$200(Lcom/shopkick/app/overlays/other/OverlayImagePreloader;)I

    move-result p2

    iget-object p3, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$1;->this$0:Lcom/shopkick/app/overlays/other/OverlayImagePreloader;

    invoke-static {p3}, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->access$300(Lcom/shopkick/app/overlays/other/OverlayImagePreloader;)Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    if-ne p2, p3, :cond_0

    .line 89
    iget-object p2, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$1;->this$0:Lcom/shopkick/app/overlays/other/OverlayImagePreloader;

    invoke-static {p2}, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->access$400(Lcom/shopkick/app/overlays/other/OverlayImagePreloader;)V

    .line 91
    :cond_0
    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 74
    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p5}, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$1;->onResourceReady(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z

    move-result p1

    return p1
.end method
