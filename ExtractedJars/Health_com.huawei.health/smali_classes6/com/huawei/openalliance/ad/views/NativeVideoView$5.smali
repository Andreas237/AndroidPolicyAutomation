.class Lcom/huawei/openalliance/ad/views/NativeVideoView$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/views/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/NativeVideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/NativeVideoView;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView$5;->a:Lcom/huawei/openalliance/ad/views/NativeVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView$5;->a:Lcom/huawei/openalliance/ad/views/NativeVideoView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->b(Lcom/huawei/openalliance/ad/views/NativeVideoView;Z)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView$5;->a:Lcom/huawei/openalliance/ad/views/NativeVideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->i(Lcom/huawei/openalliance/ad/views/NativeVideoView;)Lcom/huawei/openalliance/ad/views/VideoView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setNeedPauseOnSurfaceDestory(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView$5;->a:Lcom/huawei/openalliance/ad/views/NativeVideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->c(Lcom/huawei/openalliance/ad/views/NativeVideoView;)Lcom/huawei/openalliance/ad/j/a/c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView$5;->a:Lcom/huawei/openalliance/ad/views/NativeVideoView;

    iget-object v1, v1, Lcom/huawei/openalliance/ad/views/NativeVideoView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-interface {v0, p1, v1}, Lcom/huawei/openalliance/ad/j/a/c;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Z

    return-void
.end method

.method public a(Z)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView$5;->a:Lcom/huawei/openalliance/ad/views/NativeVideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->f(Lcom/huawei/openalliance/ad/views/NativeVideoView;)Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView$5;->a:Lcom/huawei/openalliance/ad/views/NativeVideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->f(Lcom/huawei/openalliance/ad/views/NativeVideoView;)Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    move-result-object v0

    if-nez p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->setNeedContinueAutoPlay(Z)V

    :cond_1
    return-void
.end method

.method public a(ZI)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView$5;->a:Lcom/huawei/openalliance/ad/views/NativeVideoView;

    invoke-static {v0, p1, p2}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->a(Lcom/huawei/openalliance/ad/views/NativeVideoView;ZI)V

    return-void
.end method

.method public b(ZI)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView$5;->a:Lcom/huawei/openalliance/ad/views/NativeVideoView;

    invoke-static {v0, p1, p2}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->b(Lcom/huawei/openalliance/ad/views/NativeVideoView;ZI)V

    return-void
.end method
