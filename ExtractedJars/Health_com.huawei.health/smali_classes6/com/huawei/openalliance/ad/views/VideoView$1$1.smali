.class Lcom/huawei/openalliance/ad/views/VideoView$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/views/VideoView$1;->onVideoSizeChanged(Landroid/media/MediaPlayer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/VideoView$1;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/VideoView$1;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/VideoView$1$1;->a:Lcom/huawei/openalliance/ad/views/VideoView$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$1$1;->a:Lcom/huawei/openalliance/ad/views/VideoView$1;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/VideoView$1;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->requestLayout()V

    return-void
.end method
