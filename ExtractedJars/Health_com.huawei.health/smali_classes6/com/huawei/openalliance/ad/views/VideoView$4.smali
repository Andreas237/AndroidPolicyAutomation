.class Lcom/huawei/openalliance/ad/views/VideoView$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;


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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/VideoView$4;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;III)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$4;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->e(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$4;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/huawei/openalliance/ad/views/VideoView;->a(Lcom/huawei/openalliance/ad/views/VideoView;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;III)V

    return-void
.end method
