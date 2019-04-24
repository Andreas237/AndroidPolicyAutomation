.class Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/NativePureVideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/NativePureVideoView;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;->a:Lcom/huawei/openalliance/ad/views/NativePureVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMediaCompletion(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;->a:Lcom/huawei/openalliance/ad/views/NativePureVideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->d(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;->a:Lcom/huawei/openalliance/ad/views/NativePureVideoView;

    const/4 v1, 0x1

    invoke-static {v0, p2, v1}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->a(Lcom/huawei/openalliance/ad/views/NativePureVideoView;IZ)V

    return-void
.end method

.method public onMediaPause(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;->a:Lcom/huawei/openalliance/ad/views/NativePureVideoView;

    const/4 v1, 0x0

    invoke-static {v0, p2, v1}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->a(Lcom/huawei/openalliance/ad/views/NativePureVideoView;IZ)V

    return-void
.end method

.method public onMediaStart(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;->a:Lcom/huawei/openalliance/ad/views/NativePureVideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->a(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;->a:Lcom/huawei/openalliance/ad/views/NativePureVideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->b(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;->a:Lcom/huawei/openalliance/ad/views/NativePureVideoView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->a(Lcom/huawei/openalliance/ad/views/NativePureVideoView;Z)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;->a:Lcom/huawei/openalliance/ad/views/NativePureVideoView;

    int-to-long v1, p2

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->a(Lcom/huawei/openalliance/ad/views/NativePureVideoView;J)J

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;->a:Lcom/huawei/openalliance/ad/views/NativePureVideoView;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->b(Lcom/huawei/openalliance/ad/views/NativePureVideoView;J)J

    if-lez p2, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;->a:Lcom/huawei/openalliance/ad/views/NativePureVideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->c(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)Lcom/huawei/openalliance/ad/j/a/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/j/a/c;->c()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;->a:Lcom/huawei/openalliance/ad/views/NativePureVideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->c(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)Lcom/huawei/openalliance/ad/j/a/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/j/a/c;->b()V

    :goto_0
    return-void
.end method

.method public onMediaStop(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;->a:Lcom/huawei/openalliance/ad/views/NativePureVideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->d(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;->a:Lcom/huawei/openalliance/ad/views/NativePureVideoView;

    const/4 v1, 0x0

    invoke-static {v0, p2, v1}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->a(Lcom/huawei/openalliance/ad/views/NativePureVideoView;IZ)V

    return-void
.end method

.method public onProgress(II)V
    .locals 0

    return-void
.end method
