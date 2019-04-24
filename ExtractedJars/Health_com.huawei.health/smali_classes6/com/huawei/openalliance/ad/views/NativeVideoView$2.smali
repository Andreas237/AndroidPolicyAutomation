.class Lcom/huawei/openalliance/ad/views/NativeVideoView$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;


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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView$2;->a:Lcom/huawei/openalliance/ad/views/NativeVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;III)V
    .locals 5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView$2;->a:Lcom/huawei/openalliance/ad/views/NativeVideoView;

    const/4 v1, 0x0

    invoke-static {v0, p2, v1}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->a(Lcom/huawei/openalliance/ad/views/NativeVideoView;IZ)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView$2;->a:Lcom/huawei/openalliance/ad/views/NativeVideoView;

    iget-boolean v0, v0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView$2;->a:Lcom/huawei/openalliance/ad/views/NativeVideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    sget v3, Lcom/huawei/openalliance/ad/R$string;->hiad_network_error:I

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView$2;->a:Lcom/huawei/openalliance/ad/views/NativeVideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v4

    const/16 v0, 0x11

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/widget/Toast;->setGravity(III)V

    invoke-virtual {v4}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void
.end method
