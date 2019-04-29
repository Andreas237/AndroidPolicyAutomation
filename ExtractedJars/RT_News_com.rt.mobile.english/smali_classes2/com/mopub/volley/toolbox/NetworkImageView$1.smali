.class Lcom/mopub/volley/toolbox/NetworkImageView$1;
.super Ljava/lang/Object;
.source "NetworkImageView.java"

# interfaces
.implements Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/volley/toolbox/NetworkImageView;->loadImageIfNecessary(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/volley/toolbox/NetworkImageView;

.field final synthetic val$isInLayoutPass:Z


# direct methods
.method constructor <init>(Lcom/mopub/volley/toolbox/NetworkImageView;Z)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/mopub/volley/toolbox/NetworkImageView$1;->this$0:Lcom/mopub/volley/toolbox/NetworkImageView;

    iput-boolean p2, p0, Lcom/mopub/volley/toolbox/NetworkImageView$1;->val$isInLayoutPass:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onErrorResponse(Lcom/mopub/volley/VolleyError;)V
    .locals 1

    .line 153
    iget-object p1, p0, Lcom/mopub/volley/toolbox/NetworkImageView$1;->this$0:Lcom/mopub/volley/toolbox/NetworkImageView;

    invoke-static {p1}, Lcom/mopub/volley/toolbox/NetworkImageView;->access$000(Lcom/mopub/volley/toolbox/NetworkImageView;)I

    move-result p1

    if-eqz p1, :cond_0

    .line 154
    iget-object p1, p0, Lcom/mopub/volley/toolbox/NetworkImageView$1;->this$0:Lcom/mopub/volley/toolbox/NetworkImageView;

    iget-object v0, p0, Lcom/mopub/volley/toolbox/NetworkImageView$1;->this$0:Lcom/mopub/volley/toolbox/NetworkImageView;

    invoke-static {v0}, Lcom/mopub/volley/toolbox/NetworkImageView;->access$000(Lcom/mopub/volley/toolbox/NetworkImageView;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/mopub/volley/toolbox/NetworkImageView;->setImageResource(I)V

    :cond_0
    return-void
.end method

.method public onResponse(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;Z)V
    .locals 1

    if-eqz p2, :cond_0

    .line 164
    iget-boolean p2, p0, Lcom/mopub/volley/toolbox/NetworkImageView$1;->val$isInLayoutPass:Z

    if-eqz p2, :cond_0

    .line 165
    iget-object p2, p0, Lcom/mopub/volley/toolbox/NetworkImageView$1;->this$0:Lcom/mopub/volley/toolbox/NetworkImageView;

    new-instance v0, Lcom/mopub/volley/toolbox/NetworkImageView$1$1;

    invoke-direct {v0, p0, p1}, Lcom/mopub/volley/toolbox/NetworkImageView$1$1;-><init>(Lcom/mopub/volley/toolbox/NetworkImageView$1;Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;)V

    invoke-virtual {p2, v0}, Lcom/mopub/volley/toolbox/NetworkImageView;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 174
    :cond_0
    invoke-virtual {p1}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 175
    iget-object p2, p0, Lcom/mopub/volley/toolbox/NetworkImageView$1;->this$0:Lcom/mopub/volley/toolbox/NetworkImageView;

    invoke-virtual {p1}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/mopub/volley/toolbox/NetworkImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 176
    :cond_1
    iget-object p1, p0, Lcom/mopub/volley/toolbox/NetworkImageView$1;->this$0:Lcom/mopub/volley/toolbox/NetworkImageView;

    invoke-static {p1}, Lcom/mopub/volley/toolbox/NetworkImageView;->access$100(Lcom/mopub/volley/toolbox/NetworkImageView;)I

    move-result p1

    if-eqz p1, :cond_2

    .line 177
    iget-object p1, p0, Lcom/mopub/volley/toolbox/NetworkImageView$1;->this$0:Lcom/mopub/volley/toolbox/NetworkImageView;

    iget-object p2, p0, Lcom/mopub/volley/toolbox/NetworkImageView$1;->this$0:Lcom/mopub/volley/toolbox/NetworkImageView;

    invoke-static {p2}, Lcom/mopub/volley/toolbox/NetworkImageView;->access$100(Lcom/mopub/volley/toolbox/NetworkImageView;)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/mopub/volley/toolbox/NetworkImageView;->setImageResource(I)V

    :cond_2
    :goto_0
    return-void
.end method
