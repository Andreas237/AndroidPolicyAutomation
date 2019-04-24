.class Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$10;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->setVideoSizeChangeListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

.field final synthetic b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$10;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$10;->a:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$10;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$10;->a:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    return-void
.end method
