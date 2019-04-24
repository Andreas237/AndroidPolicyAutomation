.class Lcom/huawei/openalliance/ad/views/VideoView$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/VideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/VideoView;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/VideoView;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/VideoView$2;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMediaCompletion(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$2;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->e(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$2;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0, p1, p2}, Lcom/huawei/openalliance/ad/views/VideoView;->d(Lcom/huawei/openalliance/ad/views/VideoView;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    return-void
.end method

.method public onMediaPause(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$2;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->e(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$2;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0, p1, p2}, Lcom/huawei/openalliance/ad/views/VideoView;->b(Lcom/huawei/openalliance/ad/views/VideoView;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    return-void
.end method

.method public onMediaStart(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$2;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->d(Lcom/huawei/openalliance/ad/views/VideoView;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$2;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setKeepScreenOn(Z)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$2;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0, p1, p2}, Lcom/huawei/openalliance/ad/views/VideoView;->a(Lcom/huawei/openalliance/ad/views/VideoView;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    return-void
.end method

.method public onMediaStop(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$2;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->e(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$2;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0, p1, p2}, Lcom/huawei/openalliance/ad/views/VideoView;->c(Lcom/huawei/openalliance/ad/views/VideoView;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    return-void
.end method

.method public onProgress(II)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$2;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0, p1, p2}, Lcom/huawei/openalliance/ad/views/VideoView;->a(Lcom/huawei/openalliance/ad/views/VideoView;II)V

    return-void
.end method
