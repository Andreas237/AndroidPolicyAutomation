.class Lcom/huawei/openalliance/ad/views/VideoView$d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/VideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$d;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onMediaCompletion(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1, p2}, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;->onMediaCompletion(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    :cond_0
    return-void
.end method

.method public onMediaPause(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1, p2}, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;->onMediaPause(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    :cond_0
    return-void
.end method

.method public onMediaStart(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1, p2}, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;->onMediaStart(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    :cond_0
    return-void
.end method

.method public onMediaStop(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1, p2}, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;->onMediaStop(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    :cond_0
    return-void
.end method

.method public onProgress(II)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1, p2}, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;->onProgress(II)V

    :cond_0
    return-void
.end method
