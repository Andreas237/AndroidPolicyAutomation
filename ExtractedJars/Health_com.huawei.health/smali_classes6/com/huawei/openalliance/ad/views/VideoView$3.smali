.class Lcom/huawei/openalliance/ad/views/VideoView$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;


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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/VideoView$3;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBufferUpdate(I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$3;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->a(Lcom/huawei/openalliance/ad/views/VideoView;I)V

    return-void
.end method

.method public onBufferingEnd()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$3;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->g(Lcom/huawei/openalliance/ad/views/VideoView;)V

    return-void
.end method

.method public onBufferingStart()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$3;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->f(Lcom/huawei/openalliance/ad/views/VideoView;)V

    return-void
.end method
