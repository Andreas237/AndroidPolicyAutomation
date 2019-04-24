.class Lcom/huawei/openalliance/ad/views/VideoView$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/VideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$a;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onBufferUpdate(I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;->onBufferUpdate(I)V

    :cond_0
    return-void
.end method

.method public onBufferingEnd()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;->onBufferingEnd()V

    :cond_0
    return-void
.end method

.method public onBufferingStart()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;->onBufferingStart()V

    :cond_0
    return-void
.end method
