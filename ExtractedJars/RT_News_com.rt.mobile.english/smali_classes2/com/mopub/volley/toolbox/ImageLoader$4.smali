.class Lcom/mopub/volley/toolbox/ImageLoader$4;
.super Ljava/lang/Object;
.source "ImageLoader.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/volley/toolbox/ImageLoader;->batchResponse(Ljava/lang/String;Lcom/mopub/volley/toolbox/ImageLoader$BatchedImageRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/volley/toolbox/ImageLoader;


# direct methods
.method constructor <init>(Lcom/mopub/volley/toolbox/ImageLoader;)V
    .locals 0

    .line 438
    iput-object p1, p0, Lcom/mopub/volley/toolbox/ImageLoader$4;->this$0:Lcom/mopub/volley/toolbox/ImageLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 441
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader$4;->this$0:Lcom/mopub/volley/toolbox/ImageLoader;

    invoke-static {v0}, Lcom/mopub/volley/toolbox/ImageLoader;->access$200(Lcom/mopub/volley/toolbox/ImageLoader;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mopub/volley/toolbox/ImageLoader$BatchedImageRequest;

    .line 442
    invoke-static {v1}, Lcom/mopub/volley/toolbox/ImageLoader$BatchedImageRequest;->access$300(Lcom/mopub/volley/toolbox/ImageLoader$BatchedImageRequest;)Ljava/util/LinkedList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    .line 446
    invoke-static {v3}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->access$400(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;)Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_0

    .line 449
    :cond_1
    invoke-virtual {v1}, Lcom/mopub/volley/toolbox/ImageLoader$BatchedImageRequest;->getError()Lcom/mopub/volley/VolleyError;

    move-result-object v4

    if-nez v4, :cond_2

    .line 450
    invoke-static {v1}, Lcom/mopub/volley/toolbox/ImageLoader$BatchedImageRequest;->access$000(Lcom/mopub/volley/toolbox/ImageLoader$BatchedImageRequest;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->access$502(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 451
    invoke-static {v3}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->access$400(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;)Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {v4, v3, v5}, Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;->onResponse(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;Z)V

    goto :goto_0

    .line 453
    :cond_2
    invoke-static {v3}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->access$400(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;)Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;

    move-result-object v3

    invoke-virtual {v1}, Lcom/mopub/volley/toolbox/ImageLoader$BatchedImageRequest;->getError()Lcom/mopub/volley/VolleyError;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;->onErrorResponse(Lcom/mopub/volley/VolleyError;)V

    goto :goto_0

    .line 457
    :cond_3
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader$4;->this$0:Lcom/mopub/volley/toolbox/ImageLoader;

    invoke-static {v0}, Lcom/mopub/volley/toolbox/ImageLoader;->access$200(Lcom/mopub/volley/toolbox/ImageLoader;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 458
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader$4;->this$0:Lcom/mopub/volley/toolbox/ImageLoader;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/mopub/volley/toolbox/ImageLoader;->access$602(Lcom/mopub/volley/toolbox/ImageLoader;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    return-void
.end method
