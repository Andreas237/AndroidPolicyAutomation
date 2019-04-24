.class Lcom/huawei/openalliance/ad/views/NativePureVideoView$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;


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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$2;->a:Lcom/huawei/openalliance/ad/views/NativePureVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;III)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$2;->a:Lcom/huawei/openalliance/ad/views/NativePureVideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->d(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$2;->a:Lcom/huawei/openalliance/ad/views/NativePureVideoView;

    const/4 v1, 0x0

    invoke-static {v0, p2, v1}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->a(Lcom/huawei/openalliance/ad/views/NativePureVideoView;IZ)V

    return-void
.end method
